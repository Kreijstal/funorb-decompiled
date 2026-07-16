/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends wf implements sh {
    static char[] field_db;
    private hc field_eb;
    static volatile boolean field_cb;
    static ae field_bb;
    static String field_ab;
    static lm field_Z;

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        if (param1 != 6) {
            return;
        }
        if (!(((bh) this).field_eb != param2)) {
            this.r(2738);
        }
    }

    public static void i(byte param0) {
        field_Z = null;
        field_db = null;
        field_bb = null;
        if (param0 < 64) {
            field_ab = null;
            field_ab = null;
            return;
        }
        field_ab = null;
    }

    private final hc a(String param0, byte param1, rm param2) {
        hc var4 = null;
        int var5 = 0;
        var4 = new hc(param0, param2);
        var4.field_A = (ad) (Object) new wi();
        var5 = -6 + ((bh) this).field_q;
        ((bh) this).field_q = ((bh) this).field_q + 38;
        if (param1 != 62) {
          return null;
        } else {
          var4.a(30, -113, 15, -16 + (((bh) this).field_v - 14), var5);
          ((bh) this).a(-1, (fe) (Object) var4);
          ((bh) this).i(-5257);
          return var4;
        }
    }

    final static vm a(byte param0, byte[] param1) {
        vm var2 = null;
        if (param0 >= 78) {
          if (param1 == null) {
            return null;
          } else {
            var2 = new vm(param1, bg.field_d, oc.field_e, qk.field_b, ng.field_e, db.field_b);
            ec.a((byte) 106);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void h(byte param0) {
        int var1 = 120 % ((param0 - -7) / 60);
        kh.field_a = null;
        pk.field_a = null;
    }

    private final void r(int param0) {
        Object var3 = null;
        if (!((bh) this).field_K) {
          return;
        } else {
          if (param0 != 2738) {
            var3 = null;
            vm discarded$2 = bh.a((byte) 29, (byte[]) null);
            ((bh) this).field_K = false;
            return;
          } else {
            ((bh) this).field_K = false;
            return;
          }
        }
    }

    final static String a(byte[] param0, int param1) {
        int var2 = -110 / ((-64 - param1) / 54);
        return ph.a((byte) 41, param0.length, param0, 0);
    }

    final static void a(uj param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var2 = ii.field_b.c((byte) 66);
        var3 = var2 / 12;
        if (param1 == -115) {
          if (4 <= var3) {
            return;
          } else {
            var4 = var2 + (1 + -(var3 * 12));
            ii.field_b.a((byte) -105, (pi) (Object) new tc(param0, var3, var4));
            return;
          }
        } else {
          var5 = null;
          boolean discarded$1 = bh.a((sb) null, -119);
          if (4 <= var3) {
            return;
          } else {
            var4 = var2 + (1 + -(var3 * 12));
            ii.field_b.a((byte) -105, (pi) (Object) new tc(param0, var3, var4));
            return;
          }
        }
    }

    final static boolean a(sb param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param1 != -29320) {
            field_db = null;
            var2 = param0.d((byte) -54);
            var3 = -2 != (var2 ^ -1) ? 0 : 1;
            return var3 != 0;
        }
        var2 = param0.d((byte) -54);
        var3 = -2 != (var2 ^ -1) ? 0 : 1;
        return var3 != 0;
    }

    bh(hm param0, r param1) {
        super(param0, 200, 150);
        String var5 = null;
        fe var6 = null;
        String var7 = null;
        fe var8 = null;
        Object var9 = null;
        fe var10 = null;
        String var11 = null;
        fe var12 = null;
        String var13 = null;
        fe var14 = null;
        var9 = null;
        if (param1 == nn.field_r) {
          var13 = pn.field_d;
          var14 = new fe(var13, (rm) null);
          var14.field_u = 0;
          var14.field_v = ((bh) this).field_v;
          var14.field_t = 50;
          var14.field_q = 80;
          var14.field_A = (ad) (Object) new eg(sl.field_q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((bh) this).a(-1, var14);
          ((bh) this).field_eb = this.a(ed.field_f, (byte) 62, (rm) this);
          return;
        } else {
          if (od.field_k != param1) {
            if (param1 == ge.field_a) {
              var11 = cn.field_F;
              ((bh) this).field_q = ((bh) this).field_q + 30;
              var12 = new fe(var11, (rm) null);
              var12.field_u = 0;
              var12.field_v = ((bh) this).field_v;
              var12.field_t = 50;
              var12.field_q = 80;
              var12.field_A = (ad) (Object) new eg(sl.field_q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((bh) this).a(-1, var12);
              ((bh) this).field_eb = this.a(ed.field_f, (byte) 62, (rm) this);
              return;
            } else {
              var10 = new fe((String) var9, (rm) null);
              var10.field_u = 0;
              var10.field_v = ((bh) this).field_v;
              var10.field_t = 50;
              var10.field_q = 80;
              var10.field_A = (ad) (Object) new eg(sl.field_q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((bh) this).a(-1, var10);
              ((bh) this).field_eb = this.a(ed.field_f, (byte) 62, (rm) this);
              return;
            }
          } else {
            var5 = ri.field_f;
            ((bh) this).field_q = ((bh) this).field_q + 10;
            if (an.c(0)) {
              ((bh) this).field_q = ((bh) this).field_q + 20;
              var7 = on.field_s;
              var8 = new fe(var7, (rm) null);
              var8.field_u = 0;
              var8.field_v = ((bh) this).field_v;
              var8.field_t = 50;
              var8.field_q = 80;
              var8.field_A = (ad) (Object) new eg(sl.field_q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((bh) this).a(-1, var8);
              ((bh) this).field_eb = this.a(ed.field_f, (byte) 62, (rm) this);
              return;
            } else {
              var6 = new fe(var5, (rm) null);
              var6.field_u = 0;
              var6.field_v = ((bh) this).field_v;
              var6.field_t = 50;
              var6.field_q = 80;
              var6.field_A = (ad) (Object) new eg(sl.field_q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((bh) this).a(-1, var6);
              ((bh) this).field_eb = this.a(ed.field_f, (byte) 62, (rm) this);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_cb = true;
        field_bb = new ae();
        field_ab = "Ranking: Ice Breaker";
    }
}
