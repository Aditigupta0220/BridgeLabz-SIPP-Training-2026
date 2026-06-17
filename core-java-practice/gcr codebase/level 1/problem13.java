[4,3,2,3,3,1,2]
HashMap<Integer,Integer>map=new HashMap<>();
int max=0;
for(int i=0;i<arr.length;i++)
{
map.put(arr[i],map.getOrDefault(arr[i],0)+1);

}
int element=-1;
for(int i=0;i<arr.length;i++)
{
if(map.get(i)>max)
{
max=map.get(i);
element=arr[i];
}
}
