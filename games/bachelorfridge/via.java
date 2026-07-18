/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class via implements qda {
    private int field_a;
    private po field_i;
    private int field_b;
    private int field_d;
    static String field_c;
    private int field_h;
    private int field_f;
    private int field_g;
    private int field_e;

    final static int a(int param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param1 > 55) {
          param0 = param0 & 8191;
          if (4096 > param0) {
            L0: {
              if (param0 < 2048) {
                stackOut_18_0 = ed.field_b[param0];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = ed.field_b[4096 + -param0];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param0 >= 6144) {
                stackOut_14_0 = -ed.field_b[-param0 + 8192];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -ed.field_b[-4096 + param0];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_c = null;
          param0 = param0 & 8191;
          if (4096 > param0) {
            L2: {
              if (param0 < 2048) {
                stackOut_8_0 = ed.field_b[param0];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = ed.field_b[4096 + -param0];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param0 >= 6144) {
                stackOut_4_0 = -ed.field_b[-param0 + 8192];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -ed.field_b[-4096 + param0];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static gs a(int param0, boolean param1) {
        pf var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pf var8 = null;
        pda var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_21_0 = null;
        L0: {
          var7 = BachelorFridge.field_y;
          var8 = ig.field_m;
          var2 = var8;
          var3 = var8.b(16711935);
          wka.field_a = var3 & 127;
          if ((128 & var3) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          gq.field_x = stackIn_3_0 != 0;
          vv.field_d = var8.b(16711935);
          sr.field_a = var8.c(-108);
          if (wka.field_a == 2) {
            ad.field_g = var8.e((byte) 75);
            bna.field_w = var8.a(3);
            break L1;
          } else {
            ad.field_g = 0;
            bna.field_w = 0;
            break L1;
          }
        }
        L2: {
          if (var8.b(16711935) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          gba.field_yb = var8.g(88);
          if (var4 == 0) {
            qia.field_b = gba.field_yb;
            break L3;
          } else {
            qia.field_b = var8.g(48);
            break L3;
          }
        }
        L4: {
          if (1 == wka.field_a) {
            laa.field_m = var8.e((byte) 116);
            to.field_a = var8.g(87);
            break L4;
          } else {
            if (wka.field_a != 4) {
              to.field_a = null;
              laa.field_m = 0;
              break L4;
            } else {
              laa.field_m = var8.e((byte) 116);
              to.field_a = var8.g(87);
              break L4;
            }
          }
        }
        if (!param1) {
          qk.field_n = oka.a((lu) (Object) var8, 80, (byte) -68);
          hv.field_a = null;
          return new gs(param1);
        } else {
          var5 = var8.e((byte) 123);
          try {
            L5: {
              L6: {
                var9 = cea.field_h.a(-22834, var5);
                qk.field_n = var9.d((byte) 117);
                if (!qia.field_b.equals((Object) (Object) cha.field_l)) {
                  stackOut_22_0 = var9.field_s;
                  stackIn_23_0 = stackOut_22_0;
                  break L6;
                } else {
                  stackOut_21_0 = null;
                  stackIn_23_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                }
              }
              hv.field_a = stackIn_23_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            cv.a(1, "CC1", (Throwable) (Object) var6);
            qk.field_n = null;
            hv.field_a = null;
            return new gs(param1);
          }
          return new gs(param1);
        }
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        km var14 = null;
        wj stackIn_5_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        wj stackOut_4_0 = null;
        Object stackOut_3_0 = null;
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
            if (param2 == 32679) {
              L1: {
                if (param1 instanceof km) {
                  stackOut_4_0 = (wj) param1;
                  stackIn_5_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = null;
                  stackIn_5_0 = (wj) (Object) stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                var14 = (km) (Object) stackIn_5_0;
                if (var14 != null) {
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                dg.c(param0 - -param1.field_s, param3 + param1.field_v, param1.field_p, param1.field_q, ((via) this).field_e);
                var7 = param1.field_s + param0 - -var14.field_A;
                var8 = param3 + param1.field_v + var14.field_D;
                dg.b(var7, var8, var14.field_G, ((via) this).field_d);
                if (var14.field_J == -1) {
                  break L3;
                } else {
                  var9 = (double)var14.field_J * 3.141592653589793 * 2.0 / (double)var14.field_F;
                  var11 = (int)(-Math.sin(var9) * (double)var14.field_G);
                  var12 = (int)(Math.cos(var9) * (double)var14.field_G);
                  dg.b(var11 + var7, var8 + var12, 1, ((via) this).field_a);
                  break L3;
                }
              }
              dg.b(var7, var8, 2, 1);
              var9 = 3.141592653589793 * (double)var14.field_I * 2.0 / (double)var14.field_F;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_G);
              var12 = (int)(Math.cos(var9) * (double)var14.field_G);
              dg.d(var7, var8, var7 + var11, var8 + var12, 1);
              if (((via) this).field_i != null) {
                var13 = var14.field_G + var14.field_A + ((via) this).field_f;
                int discarded$1 = ((via) this).field_i.a(param1.field_w, param0 - (-param1.field_s - var13), param1.field_v + (param3 - -((via) this).field_g), -var13 + (-((via) this).field_f + param1.field_p), -(((via) this).field_f << 1) + param1.field_q, ((via) this).field_h, ((via) this).field_b, 1, 1, 0);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("via.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a() {
        field_c = null;
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        nea var7 = null;
        nea var8 = null;
        pf var9 = null;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_18_0 = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var10 = (CharSequence) (Object) param1;
            if (!wc.a(0, var10)) {
              stackOut_3_0 = mk.field_f;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (2 != um.field_c) {
                stackOut_7_0 = nha.field_d;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var8 = bna.b(-50, param1);
                if (var8 != null) {
                  bw discarded$1 = es.field_j.a((bw) (Object) var8, 0);
                  L1: while (true) {
                    var7 = (nea) (Object) es.field_j.c(0);
                    if (var7 != null) {
                      var7.field_wb = var7.field_wb - 1;
                      continue L1;
                    } else {
                      L2: {
                        var8.a(false);
                        var8.b(0);
                        maa.field_v = maa.field_v - 1;
                        var9 = sja.field_fb;
                        var9.c(param0, (byte) 114);
                        var9.field_g = var9.field_g + 1;
                        if (param2 <= -40) {
                          break L2;
                        } else {
                          field_c = null;
                          break L2;
                        }
                      }
                      var5 = var9.field_g;
                      var9.d(1, 0);
                      var9.a((byte) -50, param1);
                      var9.b((byte) -63, var9.field_g + -var5);
                      stackOut_18_0 = null;
                      stackIn_19_0 = stackOut_18_0;
                      break L0;
                    }
                  }
                } else {
                  stackOut_10_0 = lga.a(true, new String[1], qga.field_q);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("via.D(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ')');
        }
        return (String) (Object) stackIn_19_0;
    }

    via(po param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((via) this).field_i = param0;
            ((via) this).field_a = param6;
            ((via) this).field_h = param3;
            ((via) this).field_f = param1;
            ((via) this).field_d = param5;
            ((via) this).field_e = param7;
            ((via) this).field_g = param2;
            ((via) this).field_b = param4;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "via.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Arena basics. Click the tooltips to continue.";
    }
}
