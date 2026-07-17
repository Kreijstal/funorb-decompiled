/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de implements ir {
    private hc field_c;
    private int field_d;
    private int field_e;
    private int field_a;
    private int field_g;
    private int field_b;
    private int field_f;
    private int field_h;

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        cn var14 = null;
        ea stackIn_3_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ea stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof cn) {
                stackOut_2_0 = (ea) param3;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (ea) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (cn) (Object) stackIn_3_0;
              vp.b(param3.field_p + param2, param4 - -param3.field_h, param3.field_q, param3.field_n, ((de) this).field_b);
              if (var14 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = param2 + (param3.field_p + var14.field_C);
              var8 = param4 + param3.field_h - -var14.field_x;
              vp.g(var7, var8, var14.field_A, ((de) this).field_g);
              if (var14.field_B != -1) {
                var9 = 3.141592653589793 * (double)var14.field_B * 2.0 / (double)var14.field_w;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_A);
                var12 = (int)(Math.cos(var9) * (double)var14.field_A);
                vp.g(var7 - -var11, var8 + var12, 1, ((de) this).field_f);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              vp.g(var7, var8, 2, 1);
              var9 = 2.0 * ((double)var14.field_y * 3.141592653589793) / (double)var14.field_w;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_A);
              var12 = (int)(Math.cos(var9) * (double)var14.field_A);
              vp.f(var7, var8, var7 - -var11, var12 + var8, 1);
              if (param1 == -7592) {
                break L4;
              } else {
                ((de) this).field_e = 72;
                break L4;
              }
            }
            L5: {
              if (((de) this).field_c == null) {
                break L5;
              } else {
                var13 = var14.field_C + var14.field_A + ((de) this).field_d;
                int discarded$1 = ((de) this).field_c.a(param3.field_f, param2 - -param3.field_p - -var13, param3.field_h + param4 + ((de) this).field_h, param3.field_q - var13 - ((de) this).field_d, -(((de) this).field_d << 1) + param3.field_n, ((de) this).field_a, ((de) this).field_e, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("de.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 41);
        }
    }

    final static void a(java.awt.Component param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param0.addMouseListener((java.awt.event.MouseListener) (Object) ho.field_b);
            param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ho.field_b);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) ho.field_b);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("de.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
    }

    final static int a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_7_0 = 0;
        var2 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            boolean discarded$12 = vn.field_f.a(pd.field_b, true, qe.field_k, true);
            vn.field_f.f((byte) -117);
            L1: while (true) {
              if (!ek.a((byte) -127)) {
                if (-1 == dh.field_c) {
                  if (ss.field_t) {
                    stackOut_11_0 = 3;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    if (jq.field_fb == nb.field_c) {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      if (gm.field_x.a(false)) {
                        if (jq.field_fb != ht.field_k) {
                          stackOut_23_0 = -1;
                          stackIn_24_0 = stackOut_23_0;
                          break L0;
                        } else {
                          stackOut_21_0 = 2;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        }
                      } else {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    }
                  }
                } else {
                  var1_int = dh.field_c;
                  oi.a(-1, 20665);
                  stackOut_7_0 = var1_int;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                boolean discarded$13 = vn.field_f.a(50, fr.field_e, bk.field_f);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "de.A(" + 92 + 41);
        }
        return stackIn_24_0;
    }

    de(hc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((de) this).field_h = param2;
            ((de) this).field_b = param7;
            ((de) this).field_c = param0;
            ((de) this).field_e = param4;
            ((de) this).field_g = param5;
            ((de) this).field_a = param3;
            ((de) this).field_f = param6;
            ((de) this).field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "de.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
    }
}
