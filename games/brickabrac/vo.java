/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends bn {
    int field_z;
    private int field_D;
    int field_B;
    int field_w;
    int field_y;
    static mh field_C;
    static int field_x;
    private int field_E;
    static int[] field_v;
    static String field_G;
    int field_F;
    int field_H;
    static int field_A;

    public static void e(int param0) {
        field_C = null;
        int var1 = 6;
        field_G = null;
        field_v = null;
    }

    vo(int param0, int param1, int param2, int param3) {
        super(0, param1, 0, 0, 22528, 3840, 0);
        ((vo) this).field_D = 1;
        ((vo) this).field_y = param3;
        ((vo) this).field_E = param0;
        ((vo) this).field_B = param2;
        ((vo) this).f(0);
    }

    final int a(int param0, StringBuilder param1) {
        int var3_int = 0;
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
              var3_int = super.a(105, param1) ^ 1381323349;
              if (param1 != null) {
                StringBuilder discarded$4 = param1.append("base checksum for paddle: " + Integer.toString(var3_int, 16) + "\n");
                StringBuilder discarded$5 = param1.append(((vo) this).field_j + " " + ((vo) this).field_m + " " + ((vo) this).field_k + " " + ((vo) this).field_o + " " + " " + ((vo) this).field_i + " " + ((vo) this).field_l + "\n");
                StringBuilder discarded$6 = param1.append(((vo) this).field_B + " " + ((vo) this).field_y + " " + ((vo) this).field_E + " " + ((vo) this).field_F + " " + " " + ((vo) this).field_w + " " + ((vo) this).field_z + "\n");
                StringBuilder discarded$7 = param1.append(((vo) this).field_D + " " + ((vo) this).field_H + "\n");
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = var3_int ^ (((vo) this).field_y * 41 << 5) + (((vo) this).field_B * 37 << 1);
              var3_int = var3_int + (64175 + ((vo) this).field_E * 11);
              var3_int = var3_int ^ 51 + ((vo) this).field_F * 31 << 22;
              var3_int = var3_int ^ 85 + ((vo) this).field_w * 59 << 11;
              if (param0 > 79) {
                break L2;
              } else {
                ((vo) this).field_w = 12;
                break L2;
              }
            }
            var3_int = var3_int + (((vo) this).field_z * 29 << 26);
            var3_int = var3_int ^ 10 + 13 * ((vo) this).field_D << 28;
            var3_int = var3_int ^ ((vo) this).field_H * 83 + 45050 << 2;
            stackOut_5_0 = var3_int;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("vo.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != no.field_p) {
          var3 = no.field_p.b(param1, 8421504);
          if (-2 == var3) {
            return;
          } else {
            L0: {
              if (var3 == -1) {
                break L0;
              } else {
                var4 = no.field_p.j(72) ? 1 : 0;
                oc.a(var3, param0, no.field_p.field_Wb, 1, var4 != 0, no.field_p.h(107));
                break L0;
              }
            }
            no.field_p = null;
            cr.f((byte) -124);
            return;
          }
        } else {
          return;
        }
    }

    final void b(boolean param0) {
        if (((vo) this).field_D == 8) {
          return;
        } else {
          L0: {
            ((vo) this).field_D = ((vo) this).field_D + 1;
            if (param0) {
              break L0;
            } else {
              field_C = null;
              break L0;
            }
          }
          return;
        }
    }

    final void a(byte param0, j param1, no param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vn var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2);
            var14 = (vn) (Object) param2;
            var14.field_I = 0;
            var14.field_C = var14.field_C + 1;
            if (sh.field_a != 1) {
              if (sh.field_a != 2) {
                param2.field_k = -param2.field_k;
                var5 = (((vo) this).field_k - param2.field_k) * mn.field_A;
                if (var5 >= 0) {
                  break L0;
                } else {
                  param2.field_k = ((vo) this).field_k;
                  return;
                }
              } else {
                param2.field_o = -param2.field_o;
                return;
              }
            } else {
              L1: {
                var5 = kj.a(-w.b(param2.field_k, -param2.field_k, 93) + -w.b(param2.field_o, -param2.field_o, 114) << 8, param0 + -51) >> 8;
                var6 = ((vo) this).field_D * 16 + var5;
                if (3840 < var6) {
                  var6 = 3840;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var7 = 43520;
                var8 = param2.field_j + param2.field_u - (((vo) this).field_j + (((vo) this).field_u >> 1));
                var9 = -kj.a(w.b(var8, -var8, 113) + -w.b(var7, -var7, 111) << 8, 2);
                var9 = var9 / var7;
                var8 = (var8 << 8) / var7;
                var10 = param2.field_o * var9 + var8 * param2.field_k >> 7;
                var11 = -(var8 * var10 >> 8) + (param2.field_k - -8) - param1.a(16, (byte) 62);
                var12 = -(var10 * var9 >> 8) + (param2.field_o + (-param1.a(16, (byte) 62) + 8));
                if (var11 == 0) {
                  param2.field_o = var12;
                  param2.field_k = var11;
                  break L2;
                } else {
                  L3: {
                    stackOut_6_0 = 341;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var12 * var11 <= 0) {
                      stackOut_8_0 = stackIn_8_0;
                      stackOut_8_1 = -((var12 << 8) / var11) << 8;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L3;
                    } else {
                      stackOut_7_0 = stackIn_7_0;
                      stackOut_7_1 = (var12 << 8) / var11 << 8;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                  if (stackIn_9_0 < nk.a(stackIn_9_1, 30922)) {
                    param2.field_o = var12;
                    param2.field_k = var11;
                    break L2;
                  } else {
                    param2.field_o = -param2.field_o;
                    break L2;
                  }
                }
              }
              var5 = kj.a(-w.b(param2.field_k, -param2.field_k, param0 ^ 85) + -w.b(param2.field_o, -param2.field_o, 95) << 8, param0 ^ 55) >> 8;
              param2.field_k = var6 * param2.field_k / var5;
              param2.field_o = param2.field_o * var6 / var5;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("vo.E(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    final void f(int param0) {
        ((vo) this).field_D = 1;
        ((vo) this).field_j = ((vo) this).field_E - 11264;
        ((vo) this).field_F = 8;
        ((vo) this).field_u = 22528;
        ((vo) this).field_H = param0;
    }

    final void d(int param0) {
        if (14 == ((vo) this).field_F) {
          return;
        } else {
          if (param0 < 6) {
            return;
          } else {
            ((vo) this).field_j = ((vo) this).field_j - 1536;
            ((vo) this).field_F = ((vo) this).field_F + 2;
            ((vo) this).field_u = ((vo) this).field_u + 3072;
            return;
          }
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        if (((vo) this).field_F == 0) {
          return;
        } else {
          ((vo) this).field_u = ((vo) this).field_u - 3072;
          ((vo) this).field_j = ((vo) this).field_j + 1536;
          var2 = 27 / ((74 - param0) / 49);
          ((vo) this).field_F = ((vo) this).field_F - 2;
          return;
        }
    }

    final void a(int param0, wq param1) {
        super.a(94, param1);
        ((vo) this).field_F = param1.l(255);
        if (param0 <= 89) {
            return;
        }
        try {
            ((vo) this).field_D = 15 & ((vo) this).field_F >> 4;
            ((vo) this).field_F = ((vo) this).field_F & 15;
            ((vo) this).field_w = param1.i(65280);
            ((vo) this).field_z = param1.i(65280);
            ((vo) this).field_H = param1.i(65280);
            ((vo) this).field_u = 32 + (6 * ((vo) this).field_F + 8) << 8;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "vo.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Show players in <%0>'s game";
        field_v = new int[8192];
    }
}
