/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends rqa {
    static qrb field_p;
    static int field_q;
    static int field_o;
    static String field_s;
    static String field_r;

    final nc a(nc[] param0, int param1) {
        apb.field_b = param0[0].a(114);
        if (param1 > -119) {
          field_s = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    final static sw a(int param0, asb param1, String param2, String param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = param1.a(param3, true, param2);
        var4 = var5;
        if (var5 != null) {
          if (param0 != 14223) {
            field_r = null;
            return new sw(var5);
          } else {
            return new sw(var5);
          }
        } else {
          return null;
        }
    }

    tg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, llb param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hqb var12 = null;
        phb var13 = null;
        String var14 = null;
        hqb var15 = null;
        phb var16 = null;
        String var17 = null;
        hqb var18 = null;
        phb var19 = null;
        String var20 = null;
        hqb var21 = null;
        phb var22 = null;
        phb var22_ref = null;
        String var23 = null;
        hqb var24 = null;
        phb var25 = null;
        String var26 = null;
        hqb var27 = null;
        phb var28 = null;
        String var29 = null;
        hqb var30 = null;
        phb var31 = null;
        String var32 = null;
        hqb var33 = null;
        phb var34 = null;
        String var35 = null;
        hqb var36 = null;
        phb var37 = null;
        String var38 = null;
        hqb var40 = null;
        hqb var41 = null;
        L0: {
          pea.a(0L, param1, param2, (int[]) null, (String) null, (soa) null, (String) null, (byte) 80, -1);
          if (-1 == (param2 ^ -1)) {
            var12 = cka.field_o;
            var13 = pmb.field_o[0];
            var22 = var13;
            var22 = var13;
            var14 = u.field_s;
            var12.field_i.a(-1, 11, var13, var14);
            var15 = cka.field_o;
            var16 = pmb.field_o[1];
            var22 = var16;
            var22 = var16;
            var17 = opb.field_p;
            var15.field_i.a(-1, 12, var16, var17);
            var18 = cka.field_o;
            var19 = pmb.field_o[2];
            var22 = var19;
            var22 = var19;
            var20 = tda.field_M;
            var18.field_i.a(-1, 13, var19, var20);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 == 1) {
            var21 = cka.field_o;
            var22_ref = pmb.field_o[0];
            var23 = mk.field_p;
            var21.field_i.a(-1, 11, var22_ref, var23);
            var24 = cka.field_o;
            var25 = pmb.field_o[1];
            var26 = gr.field_o;
            var24.field_i.a(-1, 12, var25, var26);
            var27 = cka.field_o;
            var28 = pmb.field_o[2];
            var29 = ocb.field_j;
            var27.field_i.a(-1, 13, var28, var29);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (2 != param2) {
            break L2;
          } else {
            var30 = cka.field_o;
            var31 = pmb.field_o[0];
            var32 = jea.field_o;
            var30.field_i.a(-1, 11, var31, var32);
            var33 = cka.field_o;
            var34 = pmb.field_o[1];
            var35 = lgb.field_p;
            var33.field_i.a(-1, 12, var34, var35);
            var36 = cka.field_o;
            var37 = pmb.field_o[2];
            var38 = uta.field_o;
            var36.field_i.a(-1, 13, var37, var38);
            break L2;
          }
        }
        if (param0 < 35) {
          field_o = -28;
          var40 = cka.field_o;
          var4 = param1.field_M;
          var5 = param1.field_u;
          var6 = param1.field_hb;
          var7 = param1.field_G;
          var40.field_i.b(var4, -29060, var5, var6, var7);
          return;
        } else {
          var41 = cka.field_o;
          var4 = param1.field_M;
          var5 = param1.field_u;
          var6 = param1.field_hb;
          var7 = param1.field_G;
          var41.field_i.b(var4, -29060, var5, var6, var7);
          return;
        }
    }

    public static void a(int param0) {
        field_s = null;
        if (param0 != -32514) {
            field_o = 71;
            field_p = null;
            field_r = null;
            return;
        }
        field_p = null;
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new qrb();
        field_s = "Activate self destruct";
        field_r = "Report abuse";
    }
}
