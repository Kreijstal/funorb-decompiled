/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends ac {
    static kj field_y;
    static int[] field_x;

    public static void c(int param0) {
        field_y = null;
        field_x = null;
    }

    final String c(int param0, el param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
              if (param0 >= 109) {
                break L1;
              } else {
                var4 = null;
                String discarded$2 = ((uh) this).c(-111, (el) null);
                break L1;
              }
            }
            stackOut_2_0 = ah.a(0, '*', param1.field_s.length());
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("uh.L(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    uh(int param0) {
        this(ng.field_F, param0);
    }

    final static int b(int param0) {
        if (param0 != 16) {
          field_x = null;
          return ee.field_B[el.field_t % ee.field_B.length];
        } else {
          return ee.field_B[el.field_t % ee.field_B.length];
        }
    }

    private uh(m param0, int param1) {
        super(param0, param1);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        oc.b(-96);
        vb.b(param1, param0, param4, param3);
        if (param2 == -14045) {
            return;
        }
        int discarded$0 = uh.b(-111);
    }

    final static nf a(pk param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        nf var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        nf stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            var2_int = param0.e((byte) -17, 8);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = ac.a((byte) 81, param0) ? 1 : 0;
                var4 = ac.a((byte) 7, param0) ? 1 : 0;
                var5 = new nf();
                var5.field_o = (short)param0.e((byte) -17, 16);
                var5.field_O = ji.a(var5.field_O, 16, 0, param0);
                var5.field_q = ji.a(var5.field_q, 16, 0, param0);
                var5.field_K = ji.a(var5.field_K, 16, 0, param0);
                var5.field_f = (short)param0.e((byte) -17, 16);
                var5.field_r = ji.a(var5.field_r, 16, 0, param0);
                var5.field_B = ji.a(var5.field_B, 16, 0, param0);
                var5.field_c = ji.a(var5.field_c, 16, 0, param0);
                if (var3 != 0) {
                  var5.field_m = (short)param0.e((byte) -17, 16);
                  var5.field_M = ji.a(var5.field_M, 16, 0, param0);
                  var5.field_t = ji.a(var5.field_t, 16, 0, param0);
                  var5.field_i = ji.a(var5.field_i, 16, 0, param0);
                  var5.field_P = ji.a(var5.field_P, 16, 0, param0);
                  var5.field_u = ji.a(var5.field_u, 16, 0, param0);
                  var5.field_e = ji.a(var5.field_e, 16, 0, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 != 0) {
                  int discarded$1 = param0.e((byte) -17, 16);
                  var5.field_J = ji.a(var5.field_J, 16, 0, param0);
                  var5.field_z = ji.a(var5.field_z, 16, 0, param0);
                  var5.field_h = ji.a(var5.field_h, 16, 0, param0);
                  var5.field_k = ji.a(var5.field_k, 16, 0, param0);
                  var5.field_g = ji.a(var5.field_g, 16, 0, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (ac.a((byte) 102, param0)) {
                  var5.field_G = ji.a(var5.field_G, 16, 0, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!ac.a((byte) 37, param0)) {
                  break L4;
                } else {
                  var5.field_n = vk.a(var5.field_n, param0, 16, 8);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var5.field_n.length <= var7) {
                      if (var6 != 0) {
                        var5.field_v = (byte)(1 + var6);
                        break L4;
                      } else {
                        var5.field_n = null;
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((255 & var5.field_n[var7]) <= var6) {
                          var7++;
                          break L6;
                        } else {
                          var6 = 255 & var5.field_n[var7];
                          var7++;
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_25_0 = (nf) var5;
              stackIn_26_0 = stackOut_25_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var2;
            stackOut_27_1 = new StringBuilder().append("uh.BA(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + 113 + 41);
        }
        return stackIn_26_0;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        float var2 = 0.0f;
        float var3 = 0.0f;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ja var13 = null;
        ja var14 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Geoblox.field_C;
        try {
          L0: {
            var14 = (ja) (Object) wd.field_e.g(0);
            if (var14 != null) {
              var2 = -320.0f + var14.field_o;
              var3 = -240.0f + var14.field_v;
              var4 = (int)((double)var2 * Math.cos((double)el.field_o.field_J) - Math.sin((double)el.field_o.field_J) * (double)var3 + 320.0);
              var5 = (int)((double)var2 * Math.sin((double)el.field_o.field_J) + (double)var3 * Math.cos((double)el.field_o.field_J) + 240.0);
              var6 = 0.01666666753590107f;
              var7 = 16764416;
              var8 = (float)el.field_o.field_v * 0.03999999910593033f;
              vb.e(var4, var5, 16, 16777215, 100);
              vb.f(var4, var5, 16, 0);
              var9 = var8 + 3.1415927410125732f;
              L1: while (true) {
                if (var8 >= var9) {
                  var13 = (ja) (Object) wd.field_e.g(0);
                  L2: while (true) {
                    if (var13 == null) {
                      break L0;
                    } else {
                      var13.n(-90);
                      var13 = (ja) (Object) wd.field_e.d(1);
                      continue L2;
                    }
                  }
                } else {
                  var10 = (int)((double)var4 + 16.0 * Math.cos((double)var9));
                  var11 = (int)((double)var5 + Math.sin((double)var9) * 16.0);
                  vb.d(var10, var11, 2, var7);
                  var6 = var6 + var6 * 0.25f;
                  var7 += 778;
                  var9 = var9 - var6;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "uh.DA(" + 4740 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[128];
    }
}
