/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends um {
    static vl field_x;
    static int[] field_D;
    private boolean field_w;
    static ve field_t;
    static String field_B;
    static int field_q;
    static kl field_u;
    private cb field_A;
    static int field_v;
    static String field_z;
    private String field_y;
    static pf field_s;
    static oh field_r;

    hd(nn param0, nn param1) {
        super(param0);
        ((hd) this).field_w = false;
        ((hd) this).field_y = "";
        ((hd) this).field_A = new cb(param0, param1);
    }

    final static kh a(int param0, int param1, ah param2) {
        if (bg.a(-141, param1, param2)) {
          if (param0 != 1) {
            field_B = null;
            return ai.b((byte) 126);
          } else {
            return ai.b((byte) 126);
          }
        } else {
          return null;
        }
    }

    public static void g(int param0) {
        Object var2 = null;
        field_B = null;
        field_D = null;
        field_u = null;
        field_s = null;
        field_t = null;
        if (param0 > -54) {
          var2 = null;
          hd.a((String) null, 104, -6);
          field_z = null;
          field_r = null;
          field_x = null;
          return;
        } else {
          field_z = null;
          field_r = null;
          field_x = null;
          return;
        }
    }

    final static void a(String param0, int param1, int param2) {
        ci.field_x = param1;
        ko.field_s = 1;
        if (param2 != -308) {
            field_B = null;
        }
    }

    final static void a(hl param0, byte param1) {
        hl var2 = null;
        int var3 = 0;
        hl var4 = null;
        hl var5 = null;
        hl var5_ref = null;
        var3 = TetraLink.field_J;
        if (param1 == -104) {
          var4 = (hl) (Object) param0.field_fb.c(false);
          var2 = var4;
          L0: while (true) {
            if (var4 == null) {
              param0.field_R = 0;
              param0.field_Db = 0;
              param0.field_mb = 0;
              param0.field_yb = 0;
              return;
            } else {
              var4.field_mb = 0;
              var4.field_Db = 0;
              var4.field_yb = 0;
              var4.field_R = 0;
              var5 = (hl) (Object) param0.field_fb.a((byte) -70);
              var5_ref = var5;
              continue L0;
            }
          }
        } else {
          field_x = null;
          var4 = (hl) (Object) param0.field_fb.c(false);
          var2 = var4;
          L1: while (true) {
            if (var4 == null) {
              param0.field_R = 0;
              param0.field_Db = 0;
              param0.field_mb = 0;
              param0.field_yb = 0;
              return;
            } else {
              var4.field_mb = 0;
              var4.field_Db = 0;
              var4.field_yb = 0;
              var4.field_R = 0;
              var5 = (hl) (Object) param0.field_fb.a((byte) -70);
              var5_ref = var5;
              continue L1;
            }
          }
        }
    }

    final jk a(int param0, String param1) {
        rj var3 = null;
        jk stackIn_7_0 = null;
        jk stackIn_12_0 = null;
        jk stackOut_11_0 = null;
        jk stackOut_10_0 = null;
        jk stackOut_6_0 = null;
        jk stackOut_5_0 = null;
        if (((hd) this).field_A.a(param0 ^ param0, param1) == db.field_h) {
          return db.field_h;
        } else {
          if (!param1.equals((Object) (Object) ((hd) this).field_y)) {
            var3 = la.a(param1, param0 ^ 0);
            if (!var3.c(false)) {
              return ug.field_cb;
            } else {
              L0: {
                ((hd) this).field_y = param1;
                ((hd) this).field_w = var3.a(true);
                if (((hd) this).field_w) {
                  stackOut_11_0 = pf.field_a;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_10_0 = db.field_h;
                  stackIn_12_0 = stackOut_10_0;
                  break L0;
                }
              }
              return stackIn_12_0;
            }
          } else {
            L1: {
              if (((hd) this).field_w) {
                stackOut_6_0 = pf.field_a;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = db.field_h;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0;
          }
        }
    }

    final String a(String param0, int param1) {
        if (param1 == 26202) {
          if (((hd) this).field_A.a(0, param0) == db.field_h) {
            return ((hd) this).field_A.a(param0, 26202);
          } else {
            if (((hd) this).a(0, param0) == db.field_h) {
              return ha.field_c;
            } else {
              return tb.field_h;
            }
          }
        } else {
          hd.g(92);
          if (((hd) this).field_A.a(0, param0) == db.field_h) {
            return ((hd) this).field_A.a(param0, 26202);
          } else {
            if (((hd) this).a(0, param0) == db.field_h) {
              return ha.field_c;
            } else {
              return tb.field_h;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Orb points: <%0>";
        field_z = "<%0> has entered another game.";
    }
}
