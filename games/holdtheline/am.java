/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am implements dh {
    static go[] field_b;
    static String field_f;
    private int field_g;
    static gn field_d;
    private int field_e;
    private qi field_a;
    static String field_c;

    final static void a(int param0, String param1, boolean param2, ql param3, int param4, int param5) {
        try {
            if (!param2) {
                field_f = null;
            }
            param3.c(param1, param0 - -1, 1 + param4, 8, -1, 114);
            param3.c(param1, param0, param4, param5, -1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "am.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(java.awt.Canvas param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            int discarded$16 = -116;
            vd.a((java.awt.Component) (Object) param0);
            int discarded$17 = 31;
            gk.a((java.awt.Component) (Object) param0);
            if (null == lb.field_u) {
              break L0;
            } else {
              lb.field_u.a((java.awt.Component) (Object) param0, (byte) 106);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("am.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + 114 + 41);
        }
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param2 <= -48) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param3.field_p) {
                  break L3;
                } else {
                  if (!param3.c((byte) -20)) {
                    stackOut_7_0 = 2188450;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 3249872;
              stackIn_8_0 = stackOut_6_0;
              break L2;
            }
            L4: {
              var6_int = stackIn_8_0;
              int discarded$2 = ((am) this).field_a.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_q + "</u>", param3.field_k + param1, param3.field_o + param4, param3.field_x, param3.field_u, var6_int, -1, ((am) this).field_e, ((am) this).field_g, ((am) this).field_a.field_G - -((am) this).field_a.field_I);
              if (!param3.c((byte) -20)) {
                break L4;
              } else {
                L5: {
                  var7 = ((am) this).field_a.a(param3.field_q);
                  var8 = ((am) this).field_a.field_I + ((am) this).field_a.field_G;
                  var9 = param1 + param3.field_k;
                  var10 = param4 - -param3.field_o;
                  if (((am) this).field_e == 2) {
                    var9 = var9 + (param3.field_x - var7);
                    break L5;
                  } else {
                    if (((am) this).field_e != 1) {
                      break L5;
                    } else {
                      var9 = var9 + (-var7 + param3.field_x >> 1);
                      break L5;
                    }
                  }
                }
                L6: {
                  if (2 == ((am) this).field_g) {
                    var10 = var10 + (-var8 + param3.field_u);
                    break L6;
                  } else {
                    if (1 == ((am) this).field_g) {
                      var10 = var10 + (param3.field_u + -var8 >> 1);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                int discarded$3 = 19;
                ei.a(var8, 4 + var7, -2 + var9, var10 - -2);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("am.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 41);
        }
    }

    public am() {
        ((am) this).field_g = 1;
        ((am) this).field_e = 1;
        ((am) this).field_a = hl.field_g;
    }

    final static void a(int param0, byte param1, fb param2) {
        try {
            bj.field_O.a((byte) -103, (hl) (Object) param2);
            if (param1 >= -27) {
                Object var4 = null;
                am.a(-120, (byte) -6, (fb) null);
            }
            dn.a(param2, param0, 118);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "am.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        field_f = null;
        if (param0 != 1) {
            am.a(-13);
        }
    }

    am(qi param0, int param1, int param2) {
        try {
            ((am) this).field_e = param1;
            ((am) this).field_a = param0;
            ((am) this).field_g = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "am.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Single-player controls:";
    }
}
