/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends ma {
    static nl field_l;
    int field_v;
    String[][] field_m;
    long[][] field_q;
    static int[] field_s;
    static String field_n;
    static int field_o;
    int field_r;
    static int field_t;
    int field_A;
    boolean field_u;
    int[][] field_z;
    static int field_x;
    static dd field_y;
    static int[] field_p;
    static int[] field_w;

    final static ke c(int param0) {
        String var1 = null;
        L0: {
          var1 = sa.a(false);
          if (var1 == null) {
            break L0;
          } else {
            if (-1 < (var1.indexOf('@') ^ -1)) {
              break L0;
            } else {
              var1 = "";
              break L0;
            }
          }
        }
        if (param0 != 8388) {
          eh.a(115, true);
          return new ke(sa.a(false), sp.h(0));
        } else {
          return new ke(sa.a(false), sp.h(0));
        }
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        oj var4 = null;
        eh var5 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var3 = Pool.field_O;
        var4 = (oj) (Object) ta.field_i.c((byte) 81);
        L0: while (true) {
          if (var4 == null) {
            if (param1) {
              var5 = (eh) (Object) wg.field_Lb.c((byte) -49);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ub.a(var5, param0, (byte) -126);
                  var5 = (eh) (Object) wg.field_Lb.f((byte) -5);
                  continue L1;
                }
              }
            } else {
              eh.a(104);
              var5 = (eh) (Object) wg.field_Lb.c((byte) -49);
              L2: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ub.a(var5, param0, (byte) -126);
                  var5 = (eh) (Object) wg.field_Lb.f((byte) -5);
                  continue L2;
                }
              }
            }
          } else {
            L3: {
              if (param1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            ch.a(stackIn_5_0 != 0, var4, param0);
            var4 = (oj) (Object) ta.field_i.f((byte) -5);
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 <= 69) {
          var2 = null;
          eh.a(-96, 113, (dd[]) null, (lr) null, -106, (dd[]) null, 56, -114, -28, 47, (dd[]) null, -80, -127, (lr) null, -116, -112, -82, 45, -61, -51);
          field_p = null;
          field_s = null;
          field_n = null;
          field_w = null;
          field_y = null;
          field_l = null;
          return;
        } else {
          field_p = null;
          field_s = null;
          field_n = null;
          field_w = null;
          field_y = null;
          field_l = null;
          return;
        }
    }

    final static void a(int param0, int param1, dd[] param2, lr param3, int param4, dd[] param5, int param6, int param7, int param8, int param9, dd[] param10, int param11, int param12, lr param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        if (param8 != 19539) {
          return;
        } else {
          mm.a(param15, param1, param9, param14, param13, param7, param11, param18, param17, param6, new nm(param2), param12, param19, new nm(param5), param3, param0, param8 ^ 19537, param16, param4, new nm(param10));
          return;
        }
    }

    eh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new nl();
        field_s = new int[12];
        field_o = 2;
        field_p = new int[12];
        field_x = 0;
        field_n = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
