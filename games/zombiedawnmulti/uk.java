/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends gn {
    static ka[] field_M;
    private int field_Q;
    static String field_R;
    static int field_S;
    private j field_P;
    static boolean field_O;
    static boolean field_N;

    final static void a(byte param0, vl param1) {
        ga var3 = null;
        try {
            var3 = ma.field_a;
            var3.b((byte) -35, 2);
            var3.a(-88, param1.field_g);
            var3.a(param1.field_i, (byte) -92);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "uk.R(" + 127 + 44 + (param1 != null ? "{...}" : "null") + 44 + 2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        re var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ja var12 = null;
        ja var15 = null;
        ja var18 = null;
        ja var21 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param2 == 0) {
          var5 = (((uk) this).field_n >> 1) + param3 + ((uk) this).field_y;
          var6 = param1 - (-((uk) this).field_i + -(((uk) this).field_w >> 1));
          var8 = ((uk) this).field_P.d(80);
          if (var8 != h.field_H) {
            if (ua.field_I != var8) {
              if (var8 != jq.field_b) {
                if (db.field_b != var8) {
                  return;
                } else {
                  var21 = rj.field_I[1];
                  var21.e(var5 + -(var21.field_x >> 1), -(var21.field_w >> 1) + var6, 256);
                  return;
                }
              } else {
                var12 = rj.field_I[2];
                var12.e(var5 + -(var12.field_x >> 1), -(var12.field_w >> 1) + var6, 256);
                return;
              }
            } else {
              var18 = rj.field_I[0];
              var9 = var18.field_z << 1;
              var10 = var18.field_u << 1;
              if (null != bp.field_s) {
                if (var9 <= bp.field_s.field_x) {
                  if (bp.field_s.field_w >= var10) {
                    r.a(0, bp.field_s);
                    oo.b();
                    var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -((uk) this).field_Q << 10, 4096);
                    int discarded$8 = 1;
                    ql.a();
                    bp.field_s.e(var5 + -var18.field_z, var6 - var18.field_u, 256);
                    return;
                  } else {
                    bp.field_s = new ja(var9, var10);
                    r.a(0, bp.field_s);
                    var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -((uk) this).field_Q << 10, 4096);
                    int discarded$9 = 1;
                    ql.a();
                    bp.field_s.e(var5 + -var18.field_z, var6 - var18.field_u, 256);
                    return;
                  }
                } else {
                  bp.field_s = new ja(var9, var10);
                  r.a(0, bp.field_s);
                  var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -((uk) this).field_Q << 10, 4096);
                  int discarded$10 = 1;
                  ql.a();
                  bp.field_s.e(var5 + -var18.field_z, var6 - var18.field_u, 256);
                  return;
                }
              } else {
                bp.field_s = new ja(var9, var10);
                r.a(0, bp.field_s);
                var18.a(112, 144, var18.field_z << 4, var18.field_u << 4, -((uk) this).field_Q << 10, 4096);
                int discarded$11 = 1;
                ql.a();
                bp.field_s.e(var5 + -var18.field_z, var6 - var18.field_u, 256);
                return;
              }
            }
          } else {
            var15 = rj.field_I[0];
            var9 = var15.field_z << 1;
            var10 = var15.field_u << 1;
            if (null != bp.field_s) {
              if (var9 <= bp.field_s.field_x) {
                if (bp.field_s.field_w >= var10) {
                  r.a(0, bp.field_s);
                  oo.b();
                  var15.a(112, 144, var15.field_z << 4, var15.field_u << 4, -((uk) this).field_Q << 10, 4096);
                  int discarded$12 = 1;
                  ql.a();
                  bp.field_s.e(var5 + -var15.field_z, var6 - var15.field_u, 256);
                  return;
                } else {
                  bp.field_s = new ja(var9, var10);
                  r.a(0, bp.field_s);
                  var15.a(112, 144, var15.field_z << 4, var15.field_u << 4, -((uk) this).field_Q << 10, 4096);
                  int discarded$13 = 1;
                  ql.a();
                  bp.field_s.e(var5 + -var15.field_z, var6 - var15.field_u, 256);
                  return;
                }
              } else {
                bp.field_s = new ja(var9, var10);
                r.a(0, bp.field_s);
                var15.a(112, 144, var15.field_z << 4, var15.field_u << 4, -((uk) this).field_Q << 10, 4096);
                int discarded$14 = 1;
                ql.a();
                bp.field_s.e(var5 + -var15.field_z, var6 - var15.field_u, 256);
                return;
              }
            } else {
              bp.field_s = new ja(var9, var10);
              r.a(0, bp.field_s);
              var15.a(112, 144, var15.field_z << 4, var15.field_u << 4, -((uk) this).field_Q << 10, 4096);
              int discarded$15 = 1;
              ql.a();
              bp.field_s.e(var5 + -var15.field_z, var6 - var15.field_u, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final String d(byte param0) {
        if (!(!((uk) this).field_l)) {
            return ((uk) this).field_P.c(-117);
        }
        int var2 = -107 % ((param0 - 53) / 57);
        return null;
    }

    final void a(int param0, cf param1, int param2, int param3) {
        try {
            ((uk) this).field_Q = ((uk) this).field_Q + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "uk.T(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    uk(j param0) {
        try {
            ((uk) this).field_P = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "uk.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ((uk) this).a(-69, -75, 99, -52);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("uk.S(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    public static void f() {
        field_R = null;
        field_M = null;
    }

    final static boolean a(byte param0) {
        if (param0 >= -36) {
            boolean discarded$6 = uk.a((byte) 99);
            return !sh.field_L ? true : false;
        }
        return !sh.field_L ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = 256;
        field_R = "(<%0> players want to join)";
    }
}
