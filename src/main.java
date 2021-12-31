import java.util.*;
    class bollywood
    {
        static int no=201,VIP=7;
        static String easy[],medium[],hard[];
        static String a[]=new String[no],vip[]=new String[VIP];
        static Scanner sc=new Scanner(System.in);
        public static void main(String args[])
        {
            bollywood z=new bollywood();
            System.out.print("ENTER PLAYER NAME .....");
            String player=sc.nextLine();
            boolean vip_access=false;
            for (int i=0;i<VIP;vip_access=(player.equals(vip[i]))?true:vip_access,i++);
            if (vip_access)System.out.println("You are a vip user");
            System.out.println("ENTER LEVEL");
            System.out.println("ENTER 1 for EASY");
            System.out.println("ENTER 2 for MEDIUM");
            System.out.println("ENTER 3 for HARD");
            if (vip_access)System.out.println("ENTER 4 for SURVIVAL MODE");
            System.out.print("");
            int choice=sc.nextInt(),e=0,m=0,h=0;
            int easy_length=z.level_length(0,6),medium_length=z.level_length(6,15),hard_length=z.level_length(15,99999);
            String easy[]=new String[easy_length];
            String medium[]=new String[medium_length];
            String hard[]=new String[hard_length];
            for (int i=0;i<no;i++)
            {
                int p=(a[i]).length();
                if (p>=15)
                {
                    hard[h]=a[i];h++;
                }
                else if(p>=6 && p<15)
                {
                    medium[m]=a[i];m++;
                }
                else if(p<6)
                {
                    easy[e]=a[i];e++;
                }
            }
            int ran=0; String puzz="";
            switch(choice)
            {
                case 1:
                    ran=z.get(easy_length);
                    puzz=easy[ran];
                    break;
                case 2:
                    ran=z.get(medium_length);
                    puzz=medium[ran];
                    break;
                case 3:
                    ran=z.get(hard_length);
                    puzz=hard[ran];
                    break;
                case 4:
                    if (vip_access)
                    {
                        int score=0;
                        while (true)
                        {
                            System.out.println("Score is "+score);
                            ran=z.get(no);
                            puzz =a[ran];
                            String chance="BOLLYWOOD",puzz2=z.con(puzz);
                            int i=0;
                            while (i<9)
                            {
                                System.out.println("Movie is\t"+puzz2);
                                System.out.println(chance);
                                System.out.print("Enter character:-");
                                char l=sc.next().charAt(0);
                                if (z.check(l,puzz))
                                {
                                    puzz2=z.put(puzz,puzz2,l);
                                    if (puzz.equals(puzz2))
                                    {
                                        break;
                                    }
                                }
                                else
                                {
                                    i++;
                                    String bollywood3="";
                                    for (int j=1;j<chance.length();j++)
                                    {
                                        bollywood3=bollywood3+chance.charAt(j);
                                    }
                                    chance=bollywood3;
                                }
                            }
                            if (i<9)
                            {
                                score++;
                            }
                            else
                            {
                                System.out.println("Final Score"+score);
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("You are not in vip list");
                    }
                    break;
                default :
                    System.out.println("GET OUT");
            }
            if(choice>0&&choice<4)
            {
                String puzz2=z.con(puzz),chance="bollywood";int i=0;
                while(i<9)
                {
                    if(puzz2.equals(puzz))
                    {
                        System.out.println(puzz);
                        System.out.println("YOU WON    "+player);
                        break;
                    }
                    else
                    {
                        System.out.println("MOVIE IS\t"+puzz2);
                        System.out.println(chance);
                        System.out.print("ENTER CHARACTER:-");
                        char f=sc.next().charAt(0);
                        if(z.check(f,puzz))
                        {
                            puzz2=z.put(puzz,puzz2,f);
                        }
                        else
                        {
                            i++;
                            String bollywood3="";
                            for (int j=1;j<chance.length();j++)
                            {
                                bollywood3=bollywood3+chance.charAt(j);
                            }
                            chance=bollywood3;
                        }
                    }
                }
                if (i<9)
                {}
                else
                {
                    System.out.println("Movie was            "+puzz);
                    System.out.println("YOU LOSE "+player);
                }
            }
            System.out.println("MADE BY SHAGUN");
        }

        public boolean check(char c,String s)
        {
            for (int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==c)
                    return true;
            }
            return false;
        }

        public String put(String c,String s,char t)
        {
            String d="";
            for(int i=0;i<s.length();i++)
            {
                char e=s.charAt(i);
                if (c.charAt(i)==t)
                {
                    e=t;
                }
                d=d+e;
            }
            return d;
        }

        public String con(String b)
        {
            String d="";
            for(int i=0;i<b.length();i++)
            {
                d=d+(((b.charAt(i)=='a')||(b.charAt(i)=='e')||(b.charAt(i)=='i')||(b.charAt(i)=='o')||(b.charAt(i)=='u')||(b.charAt(i)==' '))?b.charAt(i):'_');
            }
            return d;
        }

        public int get(int num)
        {
            double b=Math.random();
            b=b*num;
            int c=(int)b;
            return c;
        }

        public int level_length(int s,int e)
        {
            int sum=0;
            for(int i=0;i<no ; i++)
            {
                if(a[i].length()>=s && a[i].length()<e)
                    sum++;
            }
            return sum;
        }

        bollywood ()
        {
            a[0]="bahubali the beginning";
            a[1]="masti";
            a[2]="rockstar";
            a[3]="santa banta";
            a[4]="kung fu yoga";
            a[5]="secret superstar";
            a[6]="munna bhai mbbs";
            a[7]="suryavansham";
            a[8]="nayak";
            a[9]="nayab";
            a[10]="tiger";
            a[11]="bodyguard";
            a[12]="heropanti";
            a[13]="flying jatt";
            a[14]="aivary";
            a[15]="haunted";
            a[16]="wanted";
            a[17]="fukrey";
            a[18]="fukrey returns";
            a[19]="katti batti";
            a[20]="action jackson";
            a[21]="dhoom";
            a[22]="race";
            a[23]="no entry";
            a[24]="welcome";
            a[25]="welcome back";
            a[26]="golmal returns";
            a[27]="golmal";
            a[28]="double dhamal";
            a[29]="dhamal";
            a[30]="players";
            a[31]="all the best";
            a[32]="god tussi great ho";
            a[33]="airlift";
            a[34]="great masti";
            a[35]="singham";
            a[36]="son of sardar";
            a[37]="rustom";
            a[38]="machine";
            a[39]="robot";
            a[40]="firangi";
            a[41]="sholay";
            a[42]="raavan";
            a[43]="oh my god";
            a[44]="prem ratan dhan payeo";
            a[45]="pk";
            a[46]="dangal";
            a[47]="tutak tutak tutiya";
            a[48]="taare zameen par";
            a[49]="kites";
            a[50]="shandar";
            a[51]="sultan";
            a[52]="murder";
            a[53]="baaghi";
            a[54]="noor";
            a[55]="raaz";
            a[56]="raaz reboot";
            a[57]="qayamat";
            a[58]="singham return";
            a[59]="kaabil";
            a[60]="raees";
            a[61]="chennai express";
            a[62]="bareily ki barfi";
            a[63]="barfi";
            a[64]="happy bhag gayegi";
            a[65]="lucknow central";
            a[66]="hindi medium";
            a[67]="mere dad ki maruti";
            a[68]="jab we met";
            a[69]="bullet raja";
            a[70]="jab harry met sejal";
            a[71]="tarzan the wonder car";
            a[72]="zanjir";
            a[73]="kick";
            a[74]="game";
            a[75]="baby";
            a[76]="rowdy rathore";
            a[77]="housefull";
            a[78]="kal ho na ho";
            a[79]="veer zara";
            a[80]="lakshya";
            a[81]="humraaz";
            a[82]="wednesday";
            a[83]="ae dil hai mushkil";
            a[84]="jai ho";
            a[85]="tubelight";
            a[86]="sandwich";
            a[87]="sunday";
            a[88]="chocolate";
            a[89]="mirza";
            a[90]="lunchbox";
            a[91]="luv shuv te chicken khurana";
            a[92]="neerja";
            a[93]="matru ki bijli ka mandola";
            a[94]="band baaja baraat";
            a[95]="ladies vs ricky bahl";
            a[96]="joker";
            a[97]="haathi mere saathi";
            a[98]="de dana dhan goal";
            a[99]="judwaa";
            a[100]="luck";
            a[101]="newton";
            a[102]="ms dhoni the untold story";
            a[103]="sachin a billion dreams";
            a[104]="ghayal";
            a[105]="ghayal once again";
            a[106]="mary kom";
            a[107]="bahubali the conclusion";
            a[108]="singh is bling";
            a[109]="singh is king";
            a[110]="padmavati";
            a[111]="kis kis ko pyaar karoon";
            a[112]="finding fanny";
            a[113]="wake up sid";
            a[114]="half girlfriend";
            a[115]="jagga jasoos";
            a[116]="besharam";
            a[117]="dharm";
            a[118]="mom";
            a[119]="shenshah";
            a[120]="force";
            a[121]="dilwale dulhania le jaenge";
            a[122]="partners";
            a[123]="my name is khan";
            a[124]="tees maar khan";
            a[125]="big brother";
            a[126]="mr and mrs khiladi";
            a[127]="khiladi";
            a[128]="mr x";
            a[129]="mr india";
            a[130]="tiranga";
            a[131]="indian";
            a[132]="border";
            a[133]="brothers";
            a[134]="cid";
            a[135]="sanam re";
            a[136]="sanam teri kasam";
            a[137]="kabhi khushi kabhi gam";
            a[138]="darr at the mall";
            a[139]="cocktail";
            a[140]="agent vinod";
            a[141]="aatma";
            a[142]="simran";
            a[143]="bhoothnath";
            a[144]="bhoothnath returns";
            a[145]="aladdin";
            a[146]="aa dekhen zara";
            a[147]="swarg";
            a[148]="ghar ek mandir hai";
            a[149]="hero";
            a[150]="rebel";
            a[151]="yum hain hum";
            a[152]="yuvraaj";
            a[153]="taqdirwala";
            a[154]="ajab prem ki gazab kahaani";
            a[155]="rishtey";
            a[156]="poster boys";
            a[157]="abra ka dabra";
            a[158]="gold";
            a[159]="bhooth and friends";
            a[160]="bhooth uncle";
            a[161]="my friend ganesha";
            a[162]="my friend krishna";
            a[163]="makhan chor krishna";
            a[164]="jaani dushman";
            a[165]="tevar";
            a[166]="jodha akbar";
            a[167]="karan arjun";
            a[168]="tanu weds manu";
            a[169]="tanu wed manu returns";
            a[170]="kurukhshetra";
            a[171]="paltan";
            a[172]="de dana dan";
            a[173]="hum apke hain kaun";
            a[174]="shakira";
            a[175]="the burning train";
            a[176]="stanley ka dabba";
            a[177]="dostana";
            a[178]="prem ratan dhan payo";
            a[179]="ziddi";
            a[180]="kranti kshetra";
            a[181]="desi boyz";
            a[182]="sangharsh";
            a[183]="tum bin";
            a[184]="bangistan";
            a[185]="entertainment";
            a[186]="anand";
            a[187]="shamitabh";
            a[188]="super nani";
            a[189]="humpty sharma ki dulhania";
            a[190]="kai po che";
            a[191]="loafer";
            a[192]="khalaas";
            a[193]="phir hera pheri";
            a[194]="hera pheri";
            a[195]="drishyam";
            a[196]="main hoon na";
            a[197]="messenger of god";
            a[198]="oye firangi";
            a[199]="bhaag milka bha";
            a[200]="gentlemen";
            vip[0]="shagun";
            vip[1]="mmg";
            vip[2]="madhu mangal ghosh";
            vip[3]="rajeev";
            vip[4]="prabh";
            vip[5]="prabhnoor";
            vip[6]="restricted access";
        }

    }
