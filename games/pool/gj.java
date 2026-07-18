/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends ei {
    private int field_J;
    static dd field_T;
    static java.applet.Applet field_W;
    static int field_S;
    static lr field_R;
    private int field_Q;
    private int field_I;
    private int field_M;
    private dd field_H;
    static vh field_K;
    boolean field_N;
    private int field_V;
    private dd[] field_O;
    int field_P;
    private dd field_U;
    static int field_G;
    private dd field_F;
    private int field_L;

    private final dd a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dd var13 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param2 >= 82) {
            break L0;
          } else {
            ((gj) this).a(-24, (byte) -90, 11, -53);
            break L0;
          }
        }
        var13 = new dd(2 * ((gj) this).field_Q, ((gj) this).field_y);
        kj.a(113, var13);
        var5 = ((gj) this).field_y >> 1;
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((gj) this).field_y) {
            oc.a(122);
            return var13;
          } else {
            L2: {
              var7 = (2 * ((gj) this).field_Q - 1) * (var6 >> 1) % (((gj) this).field_Q * 2);
              var8 = 16711935 & param1;
              var9 = param1 & 65280;
              var10 = var6 - var5;
              var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
              if (var11 < 256) {
                stackOut_6_0 = (var8 * var11 & -16711936 | var11 * var9 & 16711680) >>> 8;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = var8 | var9;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              qh.f(var7, var6, ((gj) this).field_Q, var12);
              qh.f(-(((gj) this).field_Q * 2) + var7, var6, ((gj) this).field_Q, var12);
              var9 = param0 & 65280;
              var8 = 16711935 & param0;
              if (256 <= var11) {
                stackOut_9_0 = var8 | var9;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = (-16711936 & var8 * var11 | var9 * var11 & 16711680) >>> 8;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            qh.f(((gj) this).field_Q + var7, var6, ((gj) this).field_Q, var12);
            qh.f(-((gj) this).field_Q + var7, var6, ((gj) this).field_Q, var12);
            var6++;
            continue L1;
          }
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!p.a(param1, (byte) -113, true)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var2_int = 0;
              L1: while (true) {
                if (param1.length() <= var2_int) {
                  if (param0 == -25908) {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  } else {
                    var3 = null;
                    boolean discarded$2 = gj.a((byte[]) null, 26, -23);
                    return true;
                  }
                } else {
                  if (!ul.a(param1.charAt(var2_int), (byte) 124)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    var2_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("gj.G(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f((byte) 33);
    }

    private final dd a() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var2 = ((gj) this).field_y >> 1;
        dd var3 = new dd(var2, ((gj) this).field_y);
        kj.a(55, var3);
        for (var4 = 0; var4 < ((gj) this).field_y; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((gj) this).field_y) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(var6 * 255.0) : 255;
                }
                qh.a(var5, var4, var8 | var8 << 8 | var8 << 16);
            }
        }
        oc.a(117);
        return var3;
    }

    private final void a(boolean param0, int param1, int param2, dd param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            var5_int = param1 - -((gj) this).field_l;
            wh.a(param1 - -((gj) this).field_U.field_z, param2, var5_int + -((gj) this).field_U.field_z, (byte) 31, param2 + ((gj) this).field_y);
            var6 = -((gj) this).field_J + param1;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  ((gj) this).field_U = null;
                  oc.a(121);
                  if (qh.field_b > param1 - -((gj) this).field_U.field_z) {
                    break L2;
                  } else {
                    kj.a(43, ((gj) this).field_H);
                    param3.c(-((gj) this).field_J, 0);
                    param3.c(-((gj) this).field_J + 2 * ((gj) this).field_Q, 0);
                    ((gj) this).field_F.d(0, 0);
                    oc.a(114);
                    ((gj) this).field_H.c(param1, param2);
                    break L2;
                  }
                }
                L3: {
                  if (var5_int + -((gj) this).field_U.field_z <= qh.field_j) {
                    kj.a(86, ((gj) this).field_H);
                    var7 = -((gj) this).field_U.field_z + (((gj) this).field_l - -((gj) this).field_J);
                    L4: while (true) {
                      if (var7 <= ((gj) this).field_Q * 2) {
                        param3.c(-var7, 0);
                        param3.c(((gj) this).field_Q * 2 - var7, 0);
                        ((gj) this).field_U.d(0, 0);
                        oc.a(121);
                        ((gj) this).field_H.c(var5_int - ((gj) this).field_U.field_z, param2);
                        break L3;
                      } else {
                        var7 = var7 - ((gj) this).field_Q * 2;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                param3.c(var6, param2);
                var6 = var6 + param3.field_z;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("gj.A(").append(false).append(',').append(param1).append(',').append(param2).append(',');
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    gj(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 1, (param6 & 16711422) >> 1);
    }

    public static void a(boolean param0) {
        field_T = null;
        field_W = null;
        field_K = null;
        field_R = null;
    }

    final static boolean a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                field_R = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (2 > param1) {
                  break L3;
                } else {
                  if (nj.a(param1, 125, param0, ml.field_h)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("gj.I(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param0 != 0) {
            return;
        }
        int var6 = 23 / ((-42 - param1) / 53);
        int var5 = ((gj) this).field_C + param2;
        int var7 = ((gj) this).field_D + param3;
        this.a(false, var5, var7, ((gj) this).field_O[0]);
        if (!(((gj) this).field_P >= 65536)) {
            wh.a(var5 - -(((gj) this).field_l * ((gj) this).field_P >> 16), var7, ((gj) this).field_l + var5, (byte) -116, var7 - -((gj) this).field_y);
            this.a(false, var5, var7, ((gj) this).field_O[1]);
            oc.a(112);
        }
    }

    private final void f(byte param0) {
        ((gj) this).field_O = new dd[]{this.a(((gj) this).field_M, ((gj) this).field_V, (byte) 108), this.a(((gj) this).field_L, ((gj) this).field_I, (byte) 110)};
        if (param0 <= 8) {
            Object var3 = null;
            boolean discarded$0 = gj.a((byte[]) null, -61, 57);
        }
        int discarded$1 = 16711422;
        ((gj) this).field_U = this.a();
        ((gj) this).field_F = ((gj) this).field_U.a();
        ((gj) this).field_H = new dd(((gj) this).field_y >> 1, ((gj) this).field_y);
    }

    final void a(int param0, int param1, int param2) {
        ((gj) this).field_M = param0;
        ((gj) this).field_V = param2;
        ((gj) this).field_L = (16711422 & param0) >> 1;
        if (param1 != 19365) {
            ((gj) this).field_N = false;
        }
        ((gj) this).field_I = 8355711 & param2 >> 1;
        this.f((byte) 83);
    }

    final static ij a(boolean param0, int param1, String param2, String param3) {
        ij var4 = null;
        RuntimeException var4_ref = null;
        ij stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ij stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            qg.a((byte) 48, param1);
            var4 = new ij(param1);
            var4.a(param2, (byte) 87, param3);
            nd.field_i.b((byte) 92, (ma) (Object) var4);
            stackOut_2_0 = (ij) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("gj.H(").append(true).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(ei param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 958) {
                break L1;
              } else {
                ((gj) this).a(-58, 31, -62, true, -86);
                break L1;
              }
            }
            L2: {
              if (!((gj) this).field_N) {
                break L2;
              } else {
                ((gj) this).field_J = ((gj) this).field_J + 1;
                if (((gj) this).field_J > ((gj) this).field_Q * 2) {
                  ((gj) this).field_J = ((gj) this).field_J - 2 * ((gj) this).field_Q;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("gj.S(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private gj(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((gj) this).field_M = param6;
        ((gj) this).field_L = param8;
        ((gj) this).field_V = param5;
        ((gj) this).field_I = param7;
        ((gj) this).field_Q = param4;
        ((gj) this).a(param2, param0, param3, false, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 0;
    }
}
