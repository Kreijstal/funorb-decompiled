/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends kl {
    static String field_H;
    static eg field_K;
    static boolean field_J;
    private int[] field_O;
    private int field_N;
    static int field_P;
    static String field_S;
    private int[] field_I;
    private int field_Q;
    int field_R;
    private int[] field_L;
    private int field_M;

    private final void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        int var4 = null != ((ua) this).field_O ? ((ua) this).field_O.length : 0;
        qm[] var5 = new qm[var4 * param2];
        if (null != ((ua) this).field_z) {
            if (0 < ((ua) this).field_z.length) {
                if (0 < var5.length) {
                    if (0 < param1) {
                        for (var6 = 0; var4 > var6; var6++) {
                            sf.a((Object[]) (Object) ((ua) this).field_z, var6 * param1, (Object[]) (Object) var5, var6 * param2, Math.min(param1, param2));
                        }
                    }
                }
            }
        }
        ((ua) this).field_z = var5;
    }

    final static void g() {
        pm.field_b = new sa(mf.field_d, be.field_l, wj.field_b, pg.field_c, (kc) (Object) ec.field_g, nj.field_d);
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = null == ((ua) this).field_L ? 0 : ((ua) this).field_L.length;
        int[] var5 = new int[var4 * param2];
        if (((ua) this).field_I != null) {
            if (0 < ((ua) this).field_I.length) {
                if (0 < var5.length) {
                    if (!(param1 <= 0)) {
                        sf.a(((ua) this).field_I, 0, var5, 0, var4 * Math.min(param1, param2));
                    }
                }
            }
        }
        ((ua) this).field_I = var5;
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = null == ((ua) this).field_L ? 0 : ((ua) this).field_L.length;
        qm[] var5 = new qm[param0 * var4];
        if (((ua) this).field_z != null) {
            if (((ua) this).field_z.length > 0) {
                if (var5.length > 0) {
                    if (param1 > 0) {
                        sf.a((Object[]) (Object) ((ua) this).field_z, 0, (Object[]) (Object) var5, 0, var4 * Math.min(param1, param0));
                    }
                }
            }
        }
        ((ua) this).field_z = var5;
        if (param2 != -8734) {
            Object var6 = null;
            this.a(29, (int[]) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 > -49) {
            return;
        }
        super.a(param0, param1, param2, param3, -79);
    }

    final void a(qm param0, int param1, int param2) {
        int var5 = 0;
        int var4_int = ((ua) this).field_N % ((ua) this).field_L.length;
        if (param1 <= 115) {
            return;
        }
        try {
            var5 = ((ua) this).field_N / ((ua) this).field_L.length;
            ((ua) this).field_I[((ua) this).field_N] = param2;
            ((ua) this).field_z[((ua) this).field_N] = param0;
            if (param0 != null) {
                this.a(var5, param0, 14881, var4_int);
            }
            ((ua) this).field_N = ((ua) this).field_N + 1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ua.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        qm var5 = null;
        int var6 = 0;
        L0: {
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = 0;
          var3 = 0;
          if (param0 >= 17) {
            break L0;
          } else {
            ua.f(-24);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (((ua) this).field_z.length <= var2) {
              break L2;
            } else {
              if (var3 >= ((ua) this).field_O.length) {
                break L2;
              } else {
                var4 = 0;
                L3: while (true) {
                  if (((ua) this).field_z.length > var2) {
                    if (var4 < ((ua) this).field_L.length) {
                      int incrementValue$1 = var2;
                      var2++;
                      var5 = ((ua) this).field_z[incrementValue$1];
                      if (var5 != null) {
                        this.a(var3, var5, 14881, var4);
                        var4++;
                        continue L3;
                      } else {
                        var4++;
                        continue L3;
                      }
                    } else {
                      var3++;
                      continue L1;
                    }
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void c(int param0, int param1) {
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        int var4 = null == ((ua) this).field_O ? 0 : ((ua) this).field_O.length;
        int[] var5 = new int[param0 * var4];
        if (((ua) this).field_I != null) {
            if (((ua) this).field_I.length > 0) {
                if (var5.length > 0) {
                    if (!(param1 <= 0)) {
                        for (var6 = 0; var4 > var6; var6++) {
                            sf.a(((ua) this).field_I, var6 * param1, var5, var6 * param0, Math.min(param1, param0));
                        }
                    }
                }
            }
        }
        ((ua) this).field_I = var5;
    }

    private final void a(int[] param0) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        int var3_int = ((ua) this).field_L == null ? 0 : ((ua) this).field_L.length;
        int var4 = param0.length;
        try {
            ((ua) this).field_L = param0;
            var5 = param0;
            var6 = 0;
            var7 = 0;
            while (var6 < var5.length) {
                var7 = var7 + var5[var6];
                var5[var6] = var7 + var5[var6];
                var6++;
            }
            this.a(0, var3_int, var4);
            int discarded$0 = 103;
            this.c(var4, var3_int);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ua.L(" + (param0 != null ? "{...}" : "null") + 44 + 9443 + 41);
        }
    }

    private final void a(int param0, qm param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var20 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((ua) this).field_L[((ua) this).field_L.length + -1];
              var6 = ((ua) this).field_O[((ua) this).field_O.length - 1];
              stackOut_1_0 = ((ua) this).field_v;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param3 > 0) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = ((ua) this).field_L[-1 + param3];
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0 * stackIn_4_1 / var5_int;
              if (param0 <= 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ((ua) this).field_O[-1 + param0];
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              L4: {
                var8 = stackIn_7_0 * ((ua) this).field_k / var6;
                var9 = ((ua) this).field_v * ((ua) this).field_L[param3] / var5_int;
                var10 = ((ua) this).field_O[param0] * ((ua) this).field_k / var6;
                var11 = ((ua) this).field_L.length * param0 + param3;
                var12 = 48 & ((ua) this).field_I[var11];
                var13 = 192 & ((ua) this).field_I[var11];
                var14 = param1.field_n;
                var15 = param1.field_j;
                var16 = param1.field_v;
                var17 = param1.field_k;
                if (var16 >= var9 - var7) {
                  break L4;
                } else {
                  if ((1 & ((ua) this).field_I[var11]) != 0) {
                    var16 = var9 - var7;
                    var14 = var7;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (~(var9 - var7) <= ~var16) {
                  break L5;
                } else {
                  if ((4 & ((ua) this).field_I[var11]) != 0) {
                    var16 = -var7 + var9;
                    var14 = var7;
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              if (var12 != 16) {
                if (var12 != 32) {
                  var14 = var7;
                  break L3;
                } else {
                  var14 = var9 + -var16;
                  break L3;
                }
              } else {
                var14 = var7 + (var9 + -var16) >> 1;
                break L3;
              }
            }
            L6: {
              L7: {
                if (var17 >= var10 - var8) {
                  break L7;
                } else {
                  if (0 != (2 & ((ua) this).field_I[var11])) {
                    var15 = var8;
                    var17 = var10 + -var8;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (var10 + -var8 >= var17) {
                  break L8;
                } else {
                  if ((8 & ((ua) this).field_I[var11]) == 0) {
                    break L8;
                  } else {
                    var15 = var8;
                    var17 = -var8 + var10;
                    break L6;
                  }
                }
              }
              if (64 != var13) {
                if (var13 != 128) {
                  var15 = var8;
                  break L6;
                } else {
                  var15 = -var17 + var10;
                  break L6;
                }
              } else {
                var15 = -var17 + var8 + var10 >> 1;
                break L6;
              }
            }
            var18 = ((ua) this).field_Q;
            var19 = ((ua) this).field_M;
            param1.a(-(var19 * 2) + var17, var19 + var15, var16 - var18 * 2, var18 + var14, -109);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var5;
            stackOut_34_1 = new StringBuilder().append("ua.G(").append(param0).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L9;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + 14881 + 44 + param3 + 41);
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_18_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_15_0 = false;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_17_0 = false;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, (byte) -122, param2, param3)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var5_int = param3;
              if (var5_int == 98) {
                stackOut_11_0 = ((ua) this).a(((ua) this).field_L.length, param0, (byte) 9);
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                if (99 != var5_int) {
                  if (var5_int == 96) {
                    stackOut_15_0 = ((ua) this).a(param0, -103);
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  } else {
                    if (var5_int != 97) {
                      if (param1 < -120) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      }
                    } else {
                      stackOut_17_0 = ((ua) this).a((byte) -128, param0);
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  }
                } else {
                  stackOut_13_0 = ((ua) this).a(29787, ((ua) this).field_L.length, param0);
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("ua.N(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L1;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_23_0 != 0;
    }

    final static String a(CharSequence[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
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
            var2_int = 27;
            int discarded$2 = 1;
            stackOut_0_0 = vh.a(param0.length, 0, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ua.F(");
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
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -93 + 41);
        }
        return stackIn_1_0;
    }

    ua(int param0, int param1, int param2, int param3, pf param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        int[] var10 = null;
        int[] var9 = null;
        ((ua) this).field_R = 92;
        ((ua) this).field_N = 0;
        try {
            var10 = new int[param5];
            int[] var8 = var10;
            sf.a(var10, 0, param5, 1);
            var9 = new int[param6];
            sf.a(var9, 0, param6, 1);
            int discarded$0 = 9443;
            this.a(var10);
            this.a(0, var9);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ua.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + param6 + 41);
        }
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
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
            var8_int = 71 % ((-42 - param4) / 35);
            stackOut_0_0 = super.a(param0, param1, param2, param3, 91, param5, param6);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("ua.DA(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_1_0;
    }

    private final void a(int param0, int[] param1) {
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
            var3_int = null == ((ua) this).field_O ? 0 : ((ua) this).field_O.length;
            var4 = param1.length;
            ((ua) this).field_O = param1;
            var5 = param1;
            var6 = 0;
            var7 = param0;
            while (var5.length > var6) {
                var7 = var7 + var5[var6];
                var5[var6] = var7 + var5[var6];
                var6++;
            }
            this.b(var4, var3_int, param0 + -8734);
            this.a((byte) 119, var3_int, var4);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ua.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void f(int param0) {
        field_S = null;
        field_H = null;
        field_K = null;
        if (param0 != -1) {
            field_H = null;
        }
    }

    final void d(int param0, int param1, int param2) {
        ((ua) this).field_Q = param2;
        ((ua) this).field_M = param1;
        if (param0 != 0) {
            field_P = -123;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = false;
        field_H = "Names cannot start or end with space or underscore";
    }
}
