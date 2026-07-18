/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static int field_b;
    private boolean field_a;
    static String field_e;
    private boolean field_d;
    private String field_c;

    final static void a(bj param0, bj param1, byte param2, bj param3) {
        RuntimeException var4 = null;
        ln[] var5 = null;
        ln[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ln[] var10 = null;
        ea var11 = null;
        int var11_int = 0;
        ea var12 = null;
        int var13 = 0;
        ln[] var14 = null;
        ea var15 = null;
        int[][] var16 = null;
        ea var17 = null;
        ea var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var13 = MinerDisturbance.field_ab;
        try {
          L0: {
            vk.field_e = td.a("frame_top", param0, "commonui", (byte) 126);
            v.field_d = td.a("frame_bottom", param0, "commonui", (byte) 118);
            fh.field_a = jn.a("jagex_logo_grey", -29553, "commonui", param0);
            r.field_a = td.a("button", param0, "commonui", (byte) 109);
            ed.field_g = md.a("validation", param0, 10, "commonui");
            sl.field_q = (we) (Object) oc.a(param3, (byte) 125, "commonui", "arezzo12", param0);
            bn.field_d = (we) (Object) oc.a(param3, (byte) 125, "commonui", "arezzo14", param0);
            cn.field_g = (we) (Object) oc.a(param3, (byte) 125, "commonui", "arezzo14bold", param0);
            var17 = new ea(param1.a("", 0, "button.gif"), (java.awt.Component) (Object) ef.field_c);
            ln discarded$1 = pb.a("commonui", param0, "dropdown", (byte) -77);
            var5 = tb.a("screen_options", "commonui", param0, 1);
            kn.field_F = new ln[4];
            kc.field_f = new ln[4];
            qe.field_c = new ln[4];
            var6 = new ln[][]{kn.field_F, kc.field_f, qe.field_c};
            var21 = new int[4][];
            var20 = var21;
            var19 = var20;
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_n;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var21.length) {
                var8 = var5[0].field_m[0];
                var21[2][var8] = 16777215;
                var21[1][var8] = 2394342;
                var21[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (3 <= var9) {
                    var9 = var17.field_C;
                    ti.a((byte) -15);
                    var17.g();
                    eh.b(0, 0, eh.field_g, eh.field_c);
                    var15 = new ea(var9, var9);
                    var18 = var15;
                    var18.g();
                    var17.g(0, 0);
                    var11 = new ea(var9, var9);
                    var11.g();
                    var17.g(-var17.field_y + var9, 0);
                    var12 = new ea(-(var9 * 2) + var17.field_y, var9);
                    var12.g();
                    var17.g(-var9, 0);
                    tk.b(true);
                    r.field_a = new ea[]{var15, var12, var11};
                    break L0;
                  } else {
                    var14 = var6[var9];
                    var10 = var14;
                    var11_int = 0;
                    L3: while (true) {
                      if (var14.length <= var11_int) {
                        var9++;
                        continue L2;
                      } else {
                        var14[var11_int] = ci.a(var5[var9], (byte) -114, var21[var11_int]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var21[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("jf.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(18).append(',');
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
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            return false;
        }
        return ((jf) this).field_d;
    }

    final String a(boolean param0) {
        if (param0) {
            return null;
        }
        return ((jf) this).field_c;
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            boolean discarded$0 = ((jf) this).a(-52);
        }
        ((jf) this).field_d = true;
        ((jf) this).field_a = param1 ? true : false;
    }

    final static int b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param0 > 48) {
              var1_int = 0;
              L1: while (true) {
                if (var1_int >= 1000) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  if (uf.field_p[var1_int] != null) {
                    var1_int++;
                    continue L1;
                  } else {
                    stackOut_7_0 = var1_int;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
            } else {
              stackOut_2_0 = -28;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "jf.B(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    jf(String param0) {
        ((jf) this).field_a = false;
        ((jf) this).field_d = false;
        try {
            ((jf) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "jf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 >= -98) {
            field_b = 65;
        }
        return ((jf) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Prev";
    }
}
