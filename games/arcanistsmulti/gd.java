/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends ob {
    private boolean field_sb;
    static String field_qb;
    static String field_nb;
    private String field_jb;
    static String[] field_kb;
    static int field_tb;
    static int field_rb;
    private boolean field_V;
    static int[] field_pb;
    private om field_ob;
    private String field_lb;
    static qb field_mb;

    final void a(String param0, float param1, boolean param2, byte param3) {
        int var5 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        if (((gd) this).field_sb != param2) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param2) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((gd) this).field_sb = stackIn_5_1 != 0;
          if (!((gd) this).field_sb) {
            ((gd) this).field_ob.b(4210752, true, 2113632);
            if (((gd) this).field_V) {
              ((gd) this).field_ob.field_I = false;
              ((gd) this).field_ob.field_O = (int)(65536.0f * (param1 / 100.0f));
              var5 = -108 % ((-12 - param3) / 54);
              ((gd) this).field_lb = param0;
              return;
            } else {
              ((gd) this).field_ob.field_O = (int)(65536.0f * (param1 / 100.0f));
              var5 = -108 % ((-12 - param3) / 54);
              ((gd) this).field_lb = param0;
              return;
            }
          } else {
            ((gd) this).field_ob.b(4210752, true, 8405024);
            ((gd) this).field_ob.field_I = true;
            ((gd) this).field_ob.field_O = (int)(65536.0f * (param1 / 100.0f));
            var5 = -108 % ((-12 - param3) / 54);
            ((gd) this).field_lb = param0;
            return;
          }
        } else {
          ((gd) this).field_ob.field_O = (int)(65536.0f * (param1 / 100.0f));
          var5 = -108 % ((-12 - param3) / 54);
          ((gd) this).field_lb = param0;
          return;
        }
    }

    gd(h param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((gd) this).field_jb = param1;
        if (null != ((gd) this).field_jb) {
            var3 = go.field_k.a(((gd) this).field_jb, 260, go.field_k.field_C);
            ((gd) this).a(300, 0, var3 + 150);
        }
        ((gd) this).field_ob = new om(13, 50, 274, 30, 15, 2113632, 4210752);
        ((gd) this).field_sb = false;
        ((gd) this).field_V = false;
        ((gd) this).field_ob.field_I = true;
        ((gd) this).c(-78, (qm) (Object) ((gd) this).field_ob);
    }

    final static void a(int[] param0, ll[] param1, qb[][] param2, int param3, String[][] param4, String[] param5, int param6, eg param7, byte[] param8, String[] param9, eg param10, String[] param11, int param12, qb[][] param13, boolean param14, int param15, String[][] param16, eg param17, byte[] param18, int[] param19) {
        ve.a(param12 ^ param12, param17, param0, param1, param10);
        gf.a((byte) 72, param17);
        nn.a(param8, param19, param3, param2, param6, param9, param4, param11, param17, param18, param5, param16, param15, param13, param12 + -17290);
        hg.a(param7, param14, param17, (byte) -103);
        tc.a((byte) 6);
        ik.a((byte) -85);
        r.a(false);
    }

    final void k(byte param0) {
        ((gd) this).field_ob.field_I = false;
        if (param0 != 61) {
            return;
        }
        ((gd) this).field_V = true;
    }

    final void a(int param0, byte param1, int param2) {
        this.a(param0, param1, param2);
        go.field_k.b(((gd) this).field_lb, param0 - -(((gd) this).field_v >> -1191981023), 103 + param2, 16777215, -1);
        if (!(null == ((gd) this).field_jb)) {
            de.f(param0 + 20, 113 + param2, 260, 8421504);
            int discarded$0 = go.field_k.a(((gd) this).field_jb, 20 + param0, 8 + param2 + 120, 260, 100, 16777215, -1, 1, 0, go.field_k.field_C);
        }
    }

    public static void g(int param0) {
        if (param0 != 103) {
          field_pb = null;
          field_pb = null;
          field_mb = null;
          field_qb = null;
          field_nb = null;
          field_kb = null;
          return;
        } else {
          field_pb = null;
          field_mb = null;
          field_qb = null;
          field_nb = null;
          field_kb = null;
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 29389) {
          L0: {
            field_tb = 65;
            var2 = 0;
            if ((7 & param1) == 0) {
              break L0;
            } else {
              var2 = 8 + -(7 & param1);
              break L0;
            }
          }
          var3 = var2 + param1;
          return var3;
        } else {
          L1: {
            var2 = 0;
            if ((7 & param1) == 0) {
              break L1;
            } else {
              var2 = 8 + -(7 & param1);
              break L1;
            }
          }
          var3 = var2 + param1;
          return var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = "Book of Flame";
        field_kb = new String[]{"Story", "Movement", "Spell types", "Spell types", "Game interface", "Wands", "Team Play", "Familiars", "Landscapes", "Landscapes", "Landscapes", "Landscapes", "Tips"};
        field_tb = 1;
        field_pb = new int[]{15, 16, 17};
        field_nb = "Loading graphics";
    }
}
