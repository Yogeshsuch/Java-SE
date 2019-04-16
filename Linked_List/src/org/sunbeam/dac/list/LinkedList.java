package org.sunbeam.dac.list;

public class LinkedList extends Node
{
	private Node head = null;
	
	public boolean isEmpty()
	{
		return this.head == null;
	}
	
	public void addNodeAtFirst(int data)
	{
		Node newNode = new Node(data);
		
		if(this.head == null)
		{
			this.head = newNode;
		}
		else
		{
			 newNode.setNext(head);
			 this.head = newNode;
		}
	}
	
	public void addAtLast(int data)
	{
		Node newNode = new Node(data);
		
		if(this.head == null)
		{
			this.head = newNode;
		}
		else
		{
			Node trav = head;
			while(trav.getNext() != null)
			{
				trav = trav.getNext();
			}
			trav.setNext(newNode);
		}
	}
	
	public void delAtLast()throws Exception
	{
		Node trav = head;
		
		if(!isEmpty())
		{
			if(head.getNext() == null)
			{
				this.head = null;
			}
			else
			{
				while(trav.getNext().getNext() != null)
				{
					trav = trav.getNext();
				}
				trav.setNext(null);
			}
		}
		else
			throw new Exception("List is empty");

	}
	
	public void delAtFirst()throws Exception
	{
		Node trav = head;
		
		if(!isEmpty())
		{
			if(head.getNext() == null)
			{
				this.head = null;
			}
			else
			{
				Node temp = this.head;
				this.head = head.getNext();
				temp.setNext(null);
			}
		}
		else
			throw new Exception("List is empty");

	}
	
	public void printList()
	{
		Node trav = this.head;
		
		while(trav != null)
		{
			System.out.print(trav.getData()+" -> ");
			trav = trav.getNext();
		}
	}
}

class Node
{
	private int data;
	private Node next;
	
	public Node()
	{ }
	
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
