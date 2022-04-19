public class TreeNode { 
	private TreeNode right; 
	private TreeNode left; 
	private String word; 
	private String definition; 
	public String getWord() { return word; } 
	public String getDefinition() { return definition; } 
	public TreeNode(String s, String d) { 
		word = s; 
		definition = d; 
	} 
	public string find (String s) { 
		if (s.equals(word)) { 
			return definition; 
		} 
		if (s.compareTo(word)  < 0) { 
			if (right != null) 
				return right.find(s); 
			return ""; 
		} 
		if (left !=  null) { 
			return left.find(s); 
		} 
	} 
	public void insert (String s, String d) { 
		if (s.equals(word)) { 
			definition = d; 
			return; 
		} 
		if (s.compareTo(word) < 0) { 
			if (right != null) 
				right.insert(s); 
			else 
				right = new TreeNode(s, d); 
			return; 
		} 
		if (left != null) 
			left.insert(s); 
		else 
			left = new TreeNode(s, d); 
	} 
} 