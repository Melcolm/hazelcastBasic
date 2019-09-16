package com.melcolm.codechallenge;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastChallenge {

	public static void main(String[] args) {
		
		HazelcastInstance hazelCast = Hazelcast.newHazelcastInstance();

		if (hazelCast.getLifecycleService().isRunning() && hazelCast.getCluster().getMembers().size() == 1) {
			
			System.out.println("We are started!");
		}

	}

}
