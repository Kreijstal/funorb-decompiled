/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends ql {
    private md field_X;
    private String field_R;
    static int[] field_U;
    private boolean field_T;
    static int field_V;
    private boolean field_S;
    private String field_W;

    final static void a(int param0, int param1, int param2, ab param3, int param4, byte param5, int param6, int param7, String param8) {
        qd.field_b = param2;
        if (param5 != -92) {
          return;
        } else {
          ni.field_e = param1;
          fc.field_q = param6;
          jc.field_c = param7;
          sa.field_g = param3;
          wg.field_e = param4;
          fl.field_d = param8;
          rc.field_i = param0;
          kb.field_b = (wb) (Object) new qf();
          u.field_pb = new kl(param3);
          nh.field_a = new pg(kb.field_b, u.field_pb);
          return;
        }
    }

    uk(eg param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((uk) this).field_R = param1;
        if (((uk) this).field_R != null) {
            var3 = ra.field_c.a(((uk) this).field_R, 260, ra.field_c.field_E);
            ((uk) this).b(300, -114, 150 - -var3);
        }
        ((uk) this).field_X = new md(13, 50, 274, 30, 15, 2113632, 4210752);
        ((uk) this).field_X.field_G = true;
        ((uk) this).field_T = false;
        ((uk) this).field_S = false;
        ((uk) this).b((byte) 70, (w) (Object) ((uk) this).field_X);
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        var4 = 3 % ((-3 - param1) / 43);
        super.a(param0, (byte) 116, param2);
        ra.field_c.a(((uk) this).field_W, param2 + (((uk) this).field_j >> -909811167), param0 - -103, 16777215, -1);
        if (((uk) this).field_R == null) {
          return;
        } else {
          lf.a(20 + param2, param0 - -120 + -7, 260, 8421504);
          int discarded$1 = ra.field_c.a(((uk) this).field_R, 20 + param2, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, ra.field_c.field_E);
          return;
        }
    }

    final void a(boolean param0, String param1, int param2, float param3) {
        int var5 = 0;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          stackOut_0_0 = param0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((uk) this).field_S) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
          L1: {
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L1;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L1;
            }
          }
          ((uk) this).field_S = stackIn_8_1 != 0;
          if (!((uk) this).field_S) {
            ((uk) this).field_X.b(4210752, 2113632, 122);
            if (!((uk) this).field_T) {
              var5 = -115 / ((param2 - 92) / 33);
              ((uk) this).field_X.field_K = (int)(65536.0f * (param3 / 100.0f));
              ((uk) this).field_W = param1;
              return;
            } else {
              ((uk) this).field_X.field_G = false;
              var5 = -115 / ((param2 - 92) / 33);
              ((uk) this).field_X.field_K = (int)(65536.0f * (param3 / 100.0f));
              ((uk) this).field_W = param1;
              return;
            }
          } else {
            ((uk) this).field_X.b(4210752, 8405024, 86);
            ((uk) this).field_X.field_G = true;
            var5 = -115 / ((param2 - 92) / 33);
            ((uk) this).field_X.field_K = (int)(65536.0f * (param3 / 100.0f));
            ((uk) this).field_W = param1;
            return;
          }
        } else {
          var5 = -115 / ((param2 - 92) / 33);
          ((uk) this).field_X.field_K = (int)(65536.0f * (param3 / 100.0f));
          ((uk) this).field_W = param1;
          return;
        }
    }

    final static jb a(int param0, sh param1, int param2, int param3) {
        int var4 = 0;
        var4 = 45 / ((62 - param0) / 60);
        if (!nb.a(param2, param3, (byte) -45, param1)) {
          return null;
        } else {
          return ql.e(false);
        }
    }

    final static db[] a(String param0, String param1, int param2, sh param3) {
        int var4 = 0;
        int var5 = 0;
        if (param2 != -909811167) {
          return null;
        } else {
          var4 = param3.c(param1, (byte) -89);
          var5 = param3.a(param0, -27964, var4);
          return fi.a(param3, var5, (byte) 62, var4);
        }
    }

    public static void i(int param0) {
        int var1 = 121 % ((param0 - -30) / 35);
        field_U = null;
    }

    final static void g(boolean param0) {
        th var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        var1 = ed.field_q;
        if (!param0) {
          uk.g(false);
          L0: while (true) {
            if (kf.d(true)) {
              var1.h(8, 0);
              var1.field_h = var1.field_h + 1;
              var2 = var1.field_h + 1;
              ej.a(-17, var1);
              ed.field_q.d(-var2 + var1.field_h, (byte) -125);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (kf.d(true)) {
              var1.h(8, 0);
              var1.field_h = var1.field_h + 1;
              var2 = var1.field_h + 1;
              ej.a(-17, var1);
              ed.field_q.d(-var2 + var1.field_h, (byte) -125);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final void h(int param0) {
        Object var3 = null;
        ((uk) this).field_T = true;
        ((uk) this).field_X.field_G = false;
        if (param0 == 4210752) {
          return;
        } else {
          var3 = null;
          jb discarded$2 = uk.a(-77, (sh) null, 44, -33);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new int[15];
    }
}
