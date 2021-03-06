package projects.ghs.nodes.messages;

import projects.ghs.aux.ComponentID;
import projects.ghs.nodes.nodeImplementations.GHSNode;
import sinalgo.nodes.messages.Message;

public class TestMessage extends BasicMessage {
	
	public ComponentID cid;
	
	public TestMessage(ComponentID cid, GHSNode src) {
		super(src);
		this.cid = cid;
	}
	
	public int get_srcID() {
		return this.src.ID;
	}
	
	@Override
	public Message clone() {
		return this;
	}

}
