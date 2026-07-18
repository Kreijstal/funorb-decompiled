/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends qm {
    private qb field_F;
    private qb field_D;
    int field_O;
    private qb[] field_N;
    boolean field_I;
    private int field_C;
    private int field_J;
    static aj field_M;
    private int field_G;
    static String field_L;
    private qb field_A;
    static na field_x;
    static int field_H;
    private int field_z;
    static int[] field_B;
    private int field_K;
    private int field_y;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 > -49) {
            ((om) this).field_G = 79;
        }
        super.a(param0, param1, param2, param3, -125);
        this.e(-385446591);
    }

    final void b(int param0, boolean param1, int param2) {
        if (!param1) {
            ((om) this).a((byte) 89, 89, 4, 126);
        }
        ((om) this).field_y = param0;
        ((om) this).field_J = (16711422 & param0) >> 1;
        ((om) this).field_K = (16711422 & param2) >> 1;
        ((om) this).field_C = param2;
        this.e(-385446591);
    }

    final static void g(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        aa var4 = null;
        int var4_int = 0;
        ko var5_ref_ko = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ab var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = df.field_z;
              var2 = var9.e((byte) 105);
              var3 = var9.e((byte) 89);
              if (var2 == 0) {
                var4 = (aa) (Object) ve.field_o.b(12623);
                if (var4 == null) {
                  ka.b(false);
                  return;
                } else {
                  L2: {
                    var5 = -var9.field_g + fj.field_h;
                    var13 = var4.field_g;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5 <= var13.length << 2) {
                      break L2;
                    } else {
                      var5 = var13.length << 2;
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var5 <= var7) {
                      var4.a(true);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.e((byte) -119) << dg.a(768, var7 << 8));
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                if (1 != var2) {
                  jh.a((Throwable) null, "LR1: " + nn.g((byte) -25), (byte) 20);
                  ka.b(false);
                  break L1;
                } else {
                  var4_int = var9.i(-1);
                  var5_ref_ko = (ko) (Object) lc.field_j.b(12623);
                  L4: while (true) {
                    L5: {
                      if (var5_ref_ko == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var5_ref_ko.field_i != var3) {
                            break L6;
                          } else {
                            if (var5_ref_ko.field_l == var4_int) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5_ref_ko = (ko) (Object) lc.field_j.a(0);
                        continue L4;
                      }
                    }
                    if (var5_ref_ko == null) {
                      ka.b(false);
                      return;
                    } else {
                      var5_ref_ko.a(true);
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "om.G(" + 29 + ')');
        }
    }

    private final qb a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qb var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        var14 = new qb(((om) this).field_z * 2, ((om) this).field_k);
        fk.a(var14, -23095);
        var5 = ((om) this).field_k >> 1;
        var6 = 0;
        L0: while (true) {
          if (((om) this).field_k <= var6) {
            oo.c(-15405);
            return var14;
          } else {
            L1: {
              var7 = (((om) this).field_z * 2 - 1) * (var6 >> 1) % (((om) this).field_z * 2);
              var8 = param2 & 16711935;
              var9 = param2 & 65280;
              var10 = var6 + -var5;
              var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 + -(var10 * var10))) / (double)var5));
              if (var11 < 256) {
                stackOut_4_0 = (-16711936 & var8 * var11 | var9 * var11 & 16711680) >>> 8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var8 | var9;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              de.f(var7, var6, ((om) this).field_z, var12);
              de.f(var7 + -(2 * ((om) this).field_z), var6, ((om) this).field_z, var12);
              var8 = 16711935 & param0;
              var9 = param0 & 65280;
              if (var11 < 256) {
                stackOut_7_0 = (-16711936 & var11 * var8 | 16711680 & var11 * var9) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var8 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            de.f(var7 - -((om) this).field_z, var6, ((om) this).field_z, var12);
            de.f(-((om) this).field_z + var7, var6, ((om) this).field_z, var12);
            var6++;
            continue L0;
          }
        }
    }

    private final qb a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = ((om) this).field_k >> 1;
        qb var3 = new qb(var2, ((om) this).field_k);
        fk.a(var3, -23095);
        for (var4 = 0; ((om) this).field_k > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (((om) this).field_k + -var4));
                var8 = 1;
                if (1.0 > var6) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                de.a(var5, var4, var8 | var8 << 8 | var8 << 16);
            }
        }
        oo.c(-15405);
        return var3;
    }

    final static qb[] a(int param0, int param1, byte param2, eg param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        qb[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb[] stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (fc.a(-124, param3, param1, param0)) {
              stackOut_4_0 = gg.a(0);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qb[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("om.F(").append(param0).append(',').append(param1).append(',').append(-123).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    private final void a(int param0, int param1, qb param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 0) {
                break L1;
              } else {
                var9 = null;
                this.a(-69, 9, (qb) null, -92);
                break L1;
              }
            }
            var5_int = param0 - -((om) this).field_v;
            da.a(-((om) this).field_D.field_q + var5_int, ((om) this).field_k + param1, 122, ((om) this).field_D.field_q + param0, param1);
            var6 = param0 - ((om) this).field_G;
            L2: while (true) {
              if (var6 >= var5_int) {
                L3: {
                  oo.c(-15405);
                  if (de.field_i <= ((om) this).field_D.field_q + param0) {
                    fk.a(((om) this).field_A, -23095);
                    param2.c(-((om) this).field_G, 0);
                    param2.c(-((om) this).field_G + 2 * ((om) this).field_z, 0);
                    ((om) this).field_F.g(0, 0);
                    oo.c(param3 + -15405);
                    ((om) this).field_A.c(param0, param1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-((om) this).field_D.field_q + var5_int > de.field_h) {
                    break L4;
                  } else {
                    fk.a(((om) this).field_A, -23095);
                    var7 = ((om) this).field_G + ((om) this).field_v + -((om) this).field_D.field_q;
                    L5: while (true) {
                      if (var7 <= 2 * ((om) this).field_z) {
                        param2.c(-var7, 0);
                        param2.c(((om) this).field_z * 2 - var7, 0);
                        ((om) this).field_D.g(0, 0);
                        oo.c(param3 ^ -15405);
                        ((om) this).field_A.c(-((om) this).field_D.field_q + var5_int, param1);
                        break L4;
                      } else {
                        var7 = var7 - 2 * ((om) this).field_z;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param2.c(var6, param1);
                var6 = var6 + param2.field_q;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("om.J(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
    }

    private final void e(int param0) {
        ((om) this).field_N = new qb[]{this.a(((om) this).field_y, -5179, ((om) this).field_C), this.a(((om) this).field_J, -5179, ((om) this).field_K)};
        ((om) this).field_D = this.a(1);
        ((om) this).field_F = ((om) this).field_D.b();
        ((om) this).field_A = new qb(((om) this).field_k >> 1, ((om) this).field_k);
    }

    public static void a(byte param0) {
        field_M = null;
        field_L = null;
        field_x = null;
        field_B = null;
    }

    om(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, (16711422 & param6) >> 1);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (!(0 == param2)) {
            return;
        }
        if (param0 > -52) {
            field_H = 20;
        }
        int var5 = param1 + ((om) this).field_n;
        int var6 = ((om) this).field_j + param3;
        this.a(var5, var6, ((om) this).field_N[0], 0);
        if (((om) this).field_O < 65536) {
            da.a(((om) this).field_v + var5, var6 + ((om) this).field_k, 122, (((om) this).field_v * ((om) this).field_O >> 16) + var5, var6);
            this.a(var5, var6, ((om) this).field_N[1], 0);
            oo.c(-15405);
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (((om) this).field_I) {
                ((om) this).field_G = ((om) this).field_G + 1;
                if (((om) this).field_G > 2 * ((om) this).field_z) {
                  ((om) this).field_G = ((om) this).field_G - 2 * ((om) this).field_z;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 170) {
                break L2;
              } else {
                ((om) this).field_D = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("om.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private om(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((om) this).field_C = param5;
        ((om) this).field_K = param7;
        ((om) this).field_J = param8;
        ((om) this).field_y = param6;
        ((om) this).field_z = param4;
        ((om) this).a(param3, param1, param2, param0, -85);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new aj(6, 0, 4, 2);
        field_L = "Minions:";
        field_B = new int[]{73, 74, 75};
        field_H = 500;
    }
}
