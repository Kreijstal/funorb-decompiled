/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    ot field_h;
    int field_a;
    int field_e;
    int field_b;
    static int field_f;
    static sm field_g;
    static sr field_k;
    boolean field_j;
    up field_d;
    static String field_l;
    static String field_c;
    static int field_i;

    final static boolean a(int param0, int param1) {
        gn var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        var3 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 > 70) {
                break L1;
              } else {
                vs.a(50);
                break L1;
              }
            }
            var2 = pn.field_z.g(24009);
            L2: while (true) {
              if (!(var2 instanceof wh)) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (((wh) (Object) var2).a(false) == param1) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  var2 = var2.field_d;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "vs.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        L0: {
          if (!param0) {
            on.b();
            on.b();
            on.b();
            break L0;
          } else {
            on.a(0, 0, on.field_g, on.field_f, 0, 192);
            break L0;
          }
        }
        oa.a((byte) -126, param0);
        if (param2 == 39) {
          return;
        } else {
          int discarded$2 = vs.a(115, 82L);
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 0) {
          vs.a(-50);
          field_l = null;
          field_c = null;
          field_k = null;
          return;
        } else {
          field_l = null;
          field_c = null;
          field_k = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, up param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        int[] var7_array = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        gm var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var16 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              ((vs) this).field_d.a((byte) -122, param3);
              ((vs) this).field_a = param1;
              ((vs) this).field_b = param5;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param4) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((vs) this).field_j = stackIn_4_1 != 0;
              ((vs) this).field_e = param2;
              var17 = new int[]{158, 220, 222, param0};
              var7_array = var17;
              var8 = new int[]{1200, 800, 800, 800};
              var9 = ((vs) this).field_e;
              var10 = ((vs) this).field_b;
              var11 = ((vs) this).field_a;
              if (var9 != -1) {
                break L2;
              } else {
                var10 = ((vs) this).field_d.field_l % 14;
                var9 = ((vs) this).field_d.field_e % 7;
                var11 = 31;
                break L2;
              }
            }
            var12 = mg.a(((vs) this).field_d, var9, var10, ((vs) this).field_j, var11, (byte) 108);
            var12.field_mb.a(0, 99);
            iw.a(-81, tm.field_u);
            on.b();
            var12.a(var8[((vs) this).field_d.field_q], 0, on.field_g >> 1, var17[((vs) this).field_d.field_q], (byte) -118);
            ta.e(122);
            eo.a(tm.field_u, ((vs) this).field_h);
            var13 = (((vs) this).field_h.field_v + -2) * ((vs) this).field_h.field_o;
            var14 = -((vs) this).field_h.field_o;
            L3: while (true) {
              if (0 <= var14) {
                var14 = -((vs) this).field_h.field_o;
                L4: while (true) {
                  if (0 <= var14) {
                    break L0;
                  } else {
                    var15 = ((vs) this).field_h.field_y[var13];
                    int incrementValue$2 = var13;
                    var13++;
                    ((vs) this).field_h.field_y[incrementValue$2] = hf.a(qj.b(var15, 16777215), qj.b(-1090519040, var15 >>> 2));
                    var14++;
                    continue L4;
                  }
                }
              } else {
                var15 = ((vs) this).field_h.field_y[var13];
                int incrementValue$3 = var13;
                var13++;
                ((vs) this).field_h.field_y[incrementValue$3] = hf.a(qj.b(var15, -33554431) >>> 1, qj.b(var15, 16777215));
                var14++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var7;
            stackOut_13_1 = new StringBuilder().append("vs.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    vs() {
        ((vs) this).field_d = new up();
        ((vs) this).field_h = new ot(38, 46);
    }

    final static void a(String param0, String[] param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_12_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
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
        var5 = Kickabout.field_G;
        try {
          L0: {
            wk.field_f = cr.field_d;
            if (param3 == 255) {
              L1: {
                if (tn.field_b >= 13) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L1;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L1;
                }
              }
              kl.field_a = mf.a(stackIn_12_0 != 0, 124);
              break L0;
            } else {
              L2: {
                if (param3 < 100) {
                  break L2;
                } else {
                  if (105 >= param3) {
                    kl.field_a = wt.a(-111, param1);
                    return;
                  } else {
                    break L2;
                  }
                }
              }
              kl.field_a = wb.a(-126, param0, param3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("vs.B(");
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
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
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
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + 122 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, long param1) {
        if (param0 != -1090519040) {
            vs.a(false, true, (byte) -125);
            return (int)(param1 / 60000L);
        }
        return (int)(param1 / 60000L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = null;
        field_k = (sr) (Object) new rl();
        field_l = "trapping the mouse prevents you from clicking outside the game during a match";
        field_i = 0;
        field_c = "Your request to join has been declined.";
    }
}
