/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends am {
    static int field_q;
    int field_o;
    static oj[] field_m;
    static String field_h;
    int field_i;
    int field_r;
    static String field_k;
    int field_l;
    mm field_j;
    static int field_s;
    int field_p;
    static String[] field_n;

    public static void a(byte param0) {
        field_n = null;
        field_m = null;
        field_h = null;
        if (param0 != 10) {
            mm.a((byte) 126);
        }
        field_k = null;
    }

    final static void a(id param0, boolean param1) {
        int var13 = 0;
        oj[] var14 = null;
        oj[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        oc var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var13 = HostileSpawn.field_I ? 1 : 0;
        ll.field_a = 0;
        ib.field_c = 0;
        rc.field_e = 0;
        dk.field_o = 0;
        el.field_j = 1;
        var14 = new oj[32];
        var2 = var14;
        var3 = 0;
        var4 = param0.field_d;
        // if_icmpeq L58
        field_n = null;
        // goto L58
        var5 = param0.field_a;
        var6 = new oc();
        var6.field_e = 0;
        // if_icmpge L17984
        var6.field_g = 0;
        // goto L98
        // if_icmple L17970
        var7 = var6.b(-4);
        var8 = -1;
        var9 = -1;
        // if_icmpne L230
        field_m[el.field_j] = new oj(var6, 20, rl.field_c);
        field_m[el.field_j].field_j.field_g = field_m[el.field_j].field_j.field_g + 1;
        field_m[el.field_j].field_l.field_f = field_m[el.field_j].field_l.field_f + 0.5;
        field_m[el.field_j].field_l.field_a = field_m[el.field_j].field_l.field_a + 0.5;
        el.field_j = el.field_j + 1;
        // goto L230
        var10 = 0;
        var11 = param0.field_k[var7];
        // if_icmpne L254
        // goto L2419
        // if_icmpne L263
        // goto L2445
        // lookupswitch {"pairs":[[3,"L2471"],[4,"L2497"],[-6,"L2523"],[-7,"L2549"],[82,"L2575"],[7,"L2602"],[8,"L2628"],[9,"L2654"],[-11,"L2680"],[84,"L2706"],[-84,"L2732"],[-34,"L2758"],[-134,"L2769"],[134,"L2795"],[-136,"L2836"],[136,"L2862"],[-138,"L2889"],[138,"L2916"],[139,"L2943"],[140,"L2970"],[-142,"L2997"],[-14,"L3024"],[-15,"L3081"],[25,"L3081"],[-27,"L3081"],[27,"L3081"],[-29,"L3081"],[15,"L3218"],[18,"L3276"],[19,"L3354"],[-21,"L3445"],[-22,"L3536"],[-1,"L3588"],[1,"L3659"],[2,"L3732"],[22,"L3803"],[29,"L3863"],[-31,"L3863"],[31,"L3863"],[32,"L3863"],[-35,"L4066"],[-36,"L4143"],[36,"L4276"],[-38,"L4347"],[-39,"L4418"],[39,"L4486"],[-41,"L4557"],[-42,"L4625"],[-43,"L4693"],[-44,"L4764"],[44,"L4832"],[45,"L4903"],[46,"L4974"],[-48,"L5042"],[48,"L5110"],[-50,"L5178"],[50,"L5246"],[-52,"L5317"],[52,"L5385"],[-54,"L5453"],[54,"L5521"],[-56,"L5592"],[-57,"L5660"],[-58,"L5728"],[-59,"L5796"],[59,"L5864"],[-61,"L5935"],[61,"L6003"],[62,"L6071"],[-64,"L6142"],[64,"L6210"],[65,"L6281"],[66,"L6349"],[67,"L6417"],[68,"L6488"],[69,"L6559"],[70,"L6627"],[71,"L6695"],[72,"L6766"],[73,"L6837"],[74,"L6908"],[75,"L6979"],[-77,"L7050"],[77,"L7118"],[78,"L7189"],[-80,"L7257"],[80,"L7328"],[-82,"L7396"],[-86,"L7464"],[-87,"L7532"],[87,"L7600"],[-89,"L7671"],[89,"L7742"],[90,"L7813"],[91,"L7884"],[92,"L7955"],[93,"L8023"],[-95,"L8091"],[95,"L8162"],[96,"L8230"],[-98,"L8298"],[98,"L8366"],[99,"L8437"],[100,"L8508"],[101,"L8576"],[102,"L8647"],[-104,"L8715"],[-105,"L8786"],[-106,"L8857"],[-107,"L8925"],[-108,"L8993"],[108,"L9061"],[109,"L9132"],[-111,"L9203"],[111,"L9274"],[112,"L9345"],[113,"L9413"],[114,"L9481"],[115,"L9549"],[116,"L9620"],[-118,"L9691"],[-119,"L9759"],[119,"L9827"],[120,"L9898"],[121,"L9966"],[122,"L10037"],[123,"L10105"],[-125,"L10173"],[-126,"L10241"],[-127,"L10309"],[127,"L10380"],[-129,"L10448"],[129,"L10516"],[130,"L10584"],[131,"L10642"],[132,"L10700"],[148,"L10758"],[149,"L10861"],[150,"L10953"],[151,"L11056"],[152,"L11148"],[153,"L11251"],[-155,"L11343"],[-156,"L11412"],[156,"L11481"],[157,"L11550"],[158,"L11622"],[-160,"L11691"],[160,"L11763"],[-162,"L11835"],[162,"L11907"],[163,"L11976"],[164,"L12045"],[165,"L12114"],[166,"L12183"],[-168,"L12252"],[168,"L12324"],[169,"L12396"],[170,"L12465"],[-172,"L12534"],[172,"L12606"],[173,"L12675"],[174,"L12744"],[-176,"L12813"],[176,"L12885"],[-178,"L12954"],[178,"L13023"],[179,"L13095"],[180,"L13167"],[181,"L13239"],[182,"L13308"],[183,"L13377"],[184,"L13446"],[185,"L13515"],[186,"L13587"],[187,"L13656"],[188,"L13728"],[-190,"L13800"],[190,"L13869"],[191,"L13941"],[-193,"L14013"],[193,"L14085"],[194,"L14154"],[195,"L14226"],[196,"L14298"],[197,"L14370"],[198,"L14439"],[199,"L14508"],[200,"L14577"],[201,"L14646"],[-203,"L14718"],[203,"L14790"],[204,"L14859"],[-206,"L14928"],[206,"L15000"],[207,"L15069"],[208,"L15138"],[209,"L15207"],[210,"L15279"],[211,"L15348"],[212,"L15417"],[213,"L15486"],[214,"L15555"],[215,"L15627"],[216,"L15699"],[217,"L15771"],[218,"L15843"],[219,"L15915"],[220,"L15987"],[221,"L16056"],[-223,"L16128"],[-224,"L16200"],[-225,"L16272"],[-226,"L16341"],[226,"L16413"],[-228,"L16485"],[228,"L16554"],[-230,"L16623"],[-231,"L16695"],[231,"L16767"],[-233,"L16836"],[-234,"L16905"],[-235,"L16974"],[235,"L17043"],[236,"L17112"],[237,"L17184"],[238,"L17256"],[239,"L17328"],[240,"L17397"],[241,"L17469"],[242,"L17538"],[-244,"L17610"],[-245,"L17679"]],"defaultLabel":"L17748"}
        // if_icmplt L17858
        // if_icmpge L17858
        // if_icmpne L17837
        // goto L17838
        ((qm) (Object) param0).qm((id) (Object) var6, (oc) (-247 + (ln.field_a.field_k[var7] + 233)), rl.field_c, param0.field_z[var7], 1, false);
        dk.field_o[new qm] = (Object) (Object) new qm;
        dk.field_o = dk.field_o + 1;
        param0.field_k[var7] = 0;
        // if_icmple L17867
        // goto L17956
        wh.field_b[ll.field_a].field_c = (double)var10;
        wh.field_b[ll.field_a].field_j.a((byte) 46, var6);
        wh.field_b[ll.field_a].field_l.a(0.0, 0.0, 1);
        wh.field_b[ll.field_a].field_e = 0;
        wh.field_b[ll.field_a].field_h = var9;
        wh.field_b[ll.field_a].field_i = var8;
        ll.field_a = ll.field_a + 1;
        var6.field_g = var6.field_g + 1;
        // goto L98
        var6.field_e = var6.field_e + 1;
        // goto L79
        var6.field_e = 0;
        // if_icmpge L18918
        var6.field_g = 0;
        // goto L18009
        // if_icmple L18904
        var7 = var6.b(-4);
        var8 = -1;
        var9 = -1;
        var10 = param0.field_k[var7];
        // lookupswitch {"pairs":[[-12,"L18187"],[-24,"L18226"],[-25,"L18266"],[12,"L18306"],[-17,"L18345"],[17,"L18384"],[18,"L18435"],[142,"L18487"],[143,"L18527"],[144,"L18567"],[145,"L18607"],[146,"L18647"],[147,"L18687"],[245,"L18727"],[246,"L18768"]],"defaultLabel":"L18781"}
        // if_icmpge L18792
        // goto L18890
        wh.field_b[ll.field_a].field_c = 0.0;
        wh.field_b[ll.field_a].field_j.a((byte) 46, var6);
        wh.field_b[ll.field_a].field_l.a(0.0, 0.0, 1);
        wh.field_b[ll.field_a].field_e = 0;
        wh.field_b[ll.field_a].field_h = var9;
        wh.field_b[ll.field_a].field_i = var8;
        wh.field_b[ll.field_a].field_n = false;
        ll.field_a = ll.field_a + 1;
        var6.field_g = var6.field_g + 1;
        // goto L18009
        var6.field_e = var6.field_e + 1;
        // goto L17990
        // ifle L19099
        var7 = 0;
        var8 = 1;
        // if_icmple L19050
        // if_icmpne L18995
        // if_icmpne L18995
        var8++;
        // goto L18928
        var9 = var7;
        // if_icmple L19040
        var14[var9].field_z = -var7 + var8;
        var14[var9].field_p = var9 + -var7;
        var9++;
        // goto L18999
        var7 = var8;
        var8++;
        // goto L18928
        // if_icmple L19099
        var8 = var7;
        // if_icmple L19099
        var14[var8].field_z = -var7 + var3;
        var14[var8].field_p = var8 + -var7;
        var8++;
        // goto L19060
    }

    mm(int param0, int param1, int param2, int param3, int param4) {
        ((mm) this).field_p = param2;
        ((mm) this).field_i = param4;
        ((mm) this).field_o = param3;
        ((mm) this).field_r = param0;
        ((mm) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 640;
        field_h = "Quit";
        field_k = "Names cannot contain consecutive spaces";
        field_n = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
