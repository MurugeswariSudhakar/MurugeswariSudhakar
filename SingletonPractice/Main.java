package com.example.SingletonPractice;

public class Main {

	public static void main(String[] args) {
		PeerSingleton peerList01 = PeerSingleton.getInstance();
		
		PeerSingleton peerList02 = PeerSingleton.getInstance();
		
		String[] hosts;
		
		System.out.println("PeerList01 : ");
		hosts = peerList01.getHostNames();
		for (String host : hosts) {
			System.out.println(host);
		}
		
		System.out.println("\nPeerList02 : ");
		hosts = peerList02.getHostNames();
		for (String host : hosts) {
			System.out.println(host);
		}
		System.out.println("Is objects peerList01==peerList02 : " + (peerList01==peerList02));
	}	

}
