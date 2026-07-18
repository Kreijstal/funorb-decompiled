/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class f {
    static int[] field_c;
    static BitSet field_e;
    static int field_b;
    private cva[] field_d;
    private csa[] field_f;
    private int field_a;

    final void a(csa param0, boolean param1) {
        int var3_int = 0;
        cva var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (!(null != ((f) this).field_d)) {
            return;
        }
        ((f) this).field_f = new csa[((f) this).field_d.length];
        if (param1) {
            return;
        }
        try {
            for (var3_int = 0; ~var3_int > ~((f) this).field_d.length; var3_int++) {
                var4 = ((f) this).field_d[var3_int];
                ((f) this).field_f[var3_int] = param0.a(var4.field_d, var4.field_a, 20);
            }
            ((f) this).field_d = null;
            int discarded$0 = 0;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "f.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a() {
        int var2 = 0;
        int var3_int = 0;
        csa[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3_int = 0;
        L0: while (true) {
          if (((f) this).field_f.length <= var3_int) {
            var3 = new csa[-var2 + ((f) this).field_f.length];
            var2 = 0;
            var4 = 0;
            L1: while (true) {
              if (~((f) this).field_f.length >= ~var4) {
                ((f) this).field_f = var3;
                return;
              } else {
                L2: {
                  if (((f) this).field_f[var4] != null) {
                    var3[var2] = ((f) this).field_f[var4];
                    var2++;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          } else {
            L3: {
              L4: {
                if (null == ((f) this).field_f[var3_int]) {
                  break L4;
                } else {
                  if (!((f) this).field_f[var3_int].k((byte) -115)) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              ((f) this).field_f[var3_int] = null;
              var2++;
              break L3;
            }
            var3_int++;
            continue L0;
          }
        }
    }

    final lj[] a(byte param0) {
        int var3_int = 0;
        csa var4_ref_csa = null;
        csa var5 = null;
        lj var5_ref = null;
        int var4 = 0;
        lj var6 = null;
        int var7 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        for (var3_int = 0; ((f) this).field_f.length > var3_int; var3_int++) {
            var4_ref_csa = ((f) this).field_f[var3_int];
            var5 = var4_ref_csa;
            var5 = var4_ref_csa;
            if (var4_ref_csa != null) {
                var5_ref = var4_ref_csa.u(-91);
                if (!(var5_ref == null)) {
                    var2++;
                }
            }
        }
        if (param0 != -103) {
            return null;
        }
        lj[] var3 = new lj[var2];
        var2 = 0;
        for (var4 = 0; ((f) this).field_f.length > var4; var4++) {
            var5 = ((f) this).field_f[var4];
            if (var5 != null) {
                var6 = var5.u(param0 + -24);
                if (var6 != null) {
                    var3[var2] = var6;
                    var2++;
                }
            }
        }
        return var3;
    }

    final static String a(int param0, boolean param1, int param2, long param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          var6 = 44;
          var7 = 46;
          if (0 == param2) {
            var6 = 46;
            var7 = 44;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 == 2) {
            var7 = 160;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var8 = 0;
          if (param3 >= 0L) {
            break L2;
          } else {
            var8 = 1;
            param3 = -param3;
            break L2;
          }
        }
        var9 = new StringBuilder(26);
        var10 = 0;
        L3: while (true) {
          var11 = (int)param3;
          param3 = param3 / 10L;
          StringBuilder discarded$30 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
          if (param3 != 0L) {
            var10++;
            if (0 == var10 % 3) {
              StringBuilder discarded$31 = var9.append((char) var7);
              continue L3;
            } else {
              continue L3;
            }
          } else {
            L4: {
              if (var8 != 0) {
                StringBuilder discarded$32 = var9.append('-');
                break L4;
              } else {
                break L4;
              }
            }
            return var9.reverse().toString();
          }
        }
    }

    final static void b(int param0) {
        vo.field_b = false;
        if (!(kga.field_n == null)) {
            kga.field_n.a(true);
        }
        int var1 = -18 % ((-10 - param0) / 43);
        if (!(bta.field_q == 0)) {
            int discarded$0 = 1;
            ufa.a();
        }
        wv.field_j = 0;
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        double var1_double = 0.0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        RuntimeException decompiledCaughtException = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null != bt.field_h) {
              return;
            } else {
              bt.field_h = new int[65536];
              var1_double = Math.random() * 0.03 - 0.015 + 0.7;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                if (var4 >= 512) {
                  L2: {
                    if (param0 == 58) {
                      break L2;
                    } else {
                      f.b((byte) 1);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  var5 = 360.0f * ((float)(var4 >> 3) / 64.0f + 0.0078125f);
                  var6 = 0.0625f + (float)(7 & var4) / 8.0f;
                  var7 = 0;
                  L3: while (true) {
                    if (var7 >= 128) {
                      var4++;
                      continue L1;
                    } else {
                      L4: {
                        var8 = (float)var7 / 128.0f;
                        var9 = 0.0f;
                        var10 = 0.0f;
                        var11 = 0.0f;
                        var12 = var5 / 60.0f;
                        var13 = (int)var12;
                        var14 = var13 % 6;
                        var15 = var12 - (float)var13;
                        var16 = (-var6 + 1.0f) * var8;
                        var17 = var8 * (1.0f - var15 * var6);
                        var18 = var8 * (-(var6 * (1.0f - var15)) + 1.0f);
                        if (0 != var14) {
                          if (var14 == 1) {
                            var9 = var17;
                            var10 = var8;
                            var11 = var16;
                            break L4;
                          } else {
                            if (var14 == 2) {
                              var9 = var16;
                              var11 = var18;
                              var10 = var8;
                              break L4;
                            } else {
                              if (var14 == 3) {
                                var10 = var17;
                                var11 = var8;
                                var9 = var16;
                                break L4;
                              } else {
                                if (var14 == 4) {
                                  var11 = var8;
                                  var9 = var18;
                                  var10 = var16;
                                  break L4;
                                } else {
                                  if (var14 != 5) {
                                    break L4;
                                  } else {
                                    var11 = var17;
                                    var9 = var8;
                                    var10 = var16;
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var9 = var8;
                          var11 = var16;
                          var10 = var18;
                          break L4;
                        }
                      }
                      var9 = (float)Math.pow((double)var9, var1_double);
                      var10 = (float)Math.pow((double)var10, var1_double);
                      var11 = (float)Math.pow((double)var11, var1_double);
                      var19 = (int)(256.0f * var9);
                      var20 = (int)(256.0f * var10);
                      var21 = (int)(var11 * 256.0f);
                      var22 = var21 + ((var19 << 16) + -16777216) - -(var20 << 8);
                      int incrementValue$1 = var3;
                      var3++;
                      bt.field_h[incrementValue$1] = var22;
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "f.F(" + param0 + ')');
        }
    }

    public static void c() {
        field_e = null;
        field_c = null;
    }

    final static int a(boolean param0) {
        L0: {
          if (!lca.a(false)) {
            break L0;
          } else {
            if (null != wu.field_a.a((byte) 127)) {
              return wu.field_a.a((byte) -73).field_i;
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    f(int param0, int param1) {
        ((f) this).field_a = param0;
        ((f) this).field_f = new csa[]{};
    }

    f(int param0, int param1, int param2, kh param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        cva[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        cva stackIn_4_2 = null;
        cva stackIn_4_3 = null;
        cva[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        cva stackIn_5_2 = null;
        cva stackIn_5_3 = null;
        cva[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        cva stackIn_6_2 = null;
        cva stackIn_6_3 = null;
        int stackIn_6_4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        cva[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        cva stackOut_3_2 = null;
        cva stackOut_3_3 = null;
        cva[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        cva stackOut_5_2 = null;
        cva stackOut_5_3 = null;
        int stackOut_5_4 = 0;
        cva[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        cva stackOut_4_2 = null;
        cva stackOut_4_3 = null;
        int stackOut_4_4 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            ((f) this).field_a = param0;
            int discarded$2 = 22972;
            var5_int = param3.b((byte) 44, iia.d(param0));
            ((f) this).field_f = new csa[var5_int];
            ((f) this).field_d = new cva[var5_int];
            var6 = 0;
            L1: while (true) {
              if (~var6 <= ~var5_int) {
                break L0;
              } else {
                L2: {
                  stackOut_3_0 = ((f) this).field_d;
                  stackOut_3_1 = var6;
                  stackOut_3_2 = null;
                  stackOut_3_3 = null;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  stackIn_5_3 = stackOut_3_3;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  if (param3.b((byte) 44, 1) != 1) {
                    stackOut_5_0 = (cva[]) (Object) stackIn_5_0;
                    stackOut_5_1 = stackIn_5_1;
                    stackOut_5_2 = null;
                    stackOut_5_3 = null;
                    stackOut_5_4 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    stackIn_6_2 = stackOut_5_2;
                    stackIn_6_3 = stackOut_5_3;
                    stackIn_6_4 = stackOut_5_4;
                    break L2;
                  } else {
                    stackOut_4_0 = (cva[]) (Object) stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = null;
                    stackOut_4_3 = null;
                    stackOut_4_4 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    stackIn_6_3 = stackOut_4_3;
                    stackIn_6_4 = stackOut_4_4;
                    break L2;
                  }
                }
                stackIn_6_0[stackIn_6_1] = new cva(stackIn_6_4 != 0, param3.b((byte) 44, 8));
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("f.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final void a(kh param0, int param1, csa param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 105) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            int discarded$4 = 0;
            this.a();
            int discarded$5 = 22972;
            param0.a((byte) 44, ((f) this).field_f.length, iia.d(((f) this).field_a));
            var4_int = 0;
            L2: while (true) {
              if (((f) this).field_f.length <= var4_int) {
                break L0;
              } else {
                L3: {
                  if (param2 == ((f) this).field_f[var4_int].o((byte) -48)) {
                    param0.a((byte) -127, 1, 1);
                    param0.a((byte) -126, ((f) this).field_f[var4_int].i((byte) 84).a((byte) 115), 8);
                    break L3;
                  } else {
                    param0.a((byte) 73, 0, 1);
                    param0.a((byte) 111, ((f) this).field_f[var4_int].n(31974).a((byte) 62), 8);
                    break L3;
                  }
                }
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("f.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    static {
    }
}
