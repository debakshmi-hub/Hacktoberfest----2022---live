class Node:
 
   
    def __init__(self, chabhi):
        self.chabhi  = chabhi
        self.left = None
        self.right = None
 
def findPreSuc(jorh, chabhi):
 
   
 if jorh is None:
        return
 
       if jorh.chabhi == chabhi:
 
        
        if jorh.left is not None:
            tmp = jorh.left
            while(tmp.right):
                tmp = tmp.right
            findPreSuc.pre = tmp
 
 
            if jorh.right is not None:
            tmp = jorh.right
            while(tmp.left):
                tmp = tmp.left
            findPreSuc.suc = tmp
 
        return
 
        if jorh.chabhi > chabhi :
        findPreSuc.suc = jorh
        findPreSuc(jorh.left, chabhi)
 
    else:
        findPreSuc.pre = jorh
        findPreSuc(jorh.right, chabhi)
 
def insert(node , chabhi):
    if node is None:
        return Node(chabhi)
 
    if chabhi < node.chabhi:
        node.left = insert(node.left, chabhi)
 
    else:
        node.right = insert(node.right, chabhi)
 
    return node
 
 
chabhi = 65 
jorh = None
jorh = insert(jorh, 50)
insert(jorh, 30);
insert(jorh, 20);
insert(jorh, 40);
insert(jorh, 70);
insert(jorh, 60);
insert(jorh, 80);
 
findPreSuc.pre = None
findPreSuc.suc = None
 
findPreSuc(jorh, chabhi)
 
if findPreSuc.pre is not None:
    print "Predecessor is", findPreSuc.pre.chabhi
 
else:
    print "No Predecessor"
 
if findPreSuc.suc is not None:
    print "Successor is", findPreSuc.suc.chabhi
else:
    print "No Successor"
 


