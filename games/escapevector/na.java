/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    static int field_b;
    static ed field_w;
    private int[] field_c;
    private int[] field_x;
    private int[][] field_l;
    private wi[][] field_a;
    private int field_d;
    private boolean[] field_e;
    private int field_g;
    private wi[][] field_p;
    private boolean[][] field_A;
    int field_z;
    private int[][] field_v;
    int field_B;
    private boolean[] field_r;
    static String field_t;
    private int field_q;
    private int field_o;
    private int[] field_n;
    private int[][] field_s;
    private boolean[] field_k;
    static int[] field_i;
    private int field_f;
    private int[] field_u;
    private int field_h;
    private ed[] field_y;
    private int[] field_j;
    static String field_m;

    private final void a(int[][] param0, boolean[][] param1) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            param1[0][0] = this.a(((na) this).field_h + -1, -1 + ((na) this).field_f, (byte) -23, param0[0]);
            param1[0][1 + ((na) this).field_h] = this.a(0, -1 + ((na) this).field_f, (byte) -66, param0[2]);
            param1[1 + ((na) this).field_f][0] = this.a(((na) this).field_h + -1, 0, (byte) -78, param0[6]);
            param1[((na) this).field_f + 1][1 + ((na) this).field_h] = this.a(0, 0, (byte) -44, param0[8]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("na.VA(");
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 107 + 41);
        }
    }

    private final void a(int param0, int[] param1, int param2) {
        int var4 = 0;
        param2 = param2 - 1;
        for (var4 = 0; var4 < ((na) this).field_h; var4++) {
            param2++;
            param1[param2] = param0;
        }
    }

    private final int[][] e() {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        int[][] var5 = new int[((na) this).field_d * ((na) this).field_g][];
        int[][] var2 = var5;
        for (var3 = 0; var3 < var5.length; var3++) {
            var5[var3] = ((na) this).field_n;
        }
        return var2;
    }

    private final void a(int param0, int param1, int param2) {
        int var5 = 0;
        int var9 = EscapeVector.field_A;
        if (param0 >= -96) {
            this.a((wi[][]) null, 102);
        }
        int var4 = -param2;
        for (var5 = param1; var5 < ((na) this).field_d; var5++) {
            var4 = var4 + ((na) this).field_f;
        }
        int var6 = ((na) this).field_j[0];
        int var7 = ((na) this).field_j[1];
        int var8 = 1 + (-var4 + 479);
        if (!(0 < var8)) {
            return;
        }
        em.c(0, var4, 640, var8, var6, var7);
        this.a(var4, (byte) 104);
    }

    private final int a(int[] param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var4_int = -12 / ((43 - param1) / 44);
            if (((na) this).field_x != param0) {
              if (((na) this).field_n != param0) {
                if (param2 < 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  if (param2 < ((na) this).field_f) {
                    stackOut_11_0 = param0[param2];
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    return 0;
                  }
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("na.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_12_0;
    }

    public static void d() {
        field_t = null;
        field_i = null;
        field_m = null;
        field_w = null;
    }

    private final boolean c(int param0, int param1) {
        int var3 = 1 << param1;
        int var4 = param0 & var3;
        return var4 == 0 ? true : false;
    }

    private final boolean[][] a(int param0, int[][] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean[][] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[][] stackOut_0_0 = null;
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
            this.a((byte) 121, param1, ((na) this).field_A);
            this.a(param1, (byte) 62, ((na) this).field_A);
            var3_int = -64;
            int discarded$2 = 107;
            this.a(param1, ((na) this).field_A);
            stackOut_0_0 = ((na) this).field_A;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("na.T(").append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    private final boolean a(int param0, int param1, byte param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5_int = this.a(param3, (byte) 125, param1);
            if (param2 < -18) {
              var6 = this.a(var5_int, param0) ? 1 : 0;
              stackOut_3_0 = var6;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("na.FA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    private final wi[][] a(int param0, wi[][] param1, int param2, boolean param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wi[][] stackIn_4_0 = null;
        wi[][] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        wi[][] stackOut_3_0 = null;
        wi[][] stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var14 = EscapeVector.field_A;
        try {
          L0: {
            if (param1 != null) {
              stackOut_3_0 = (wi[][]) param1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var6_int = 640;
              var7 = 480;
              var8 = 1 + var6_int / ((na) this).field_h;
              var9 = var7 / ((na) this).field_f - -1;
              param1 = new wi[var9][var8];
              var10 = param0;
              L1: while (true) {
                if (var10 >= var9) {
                  stackOut_16_0 = (wi[][]) param1;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  var11 = var10 + param4;
                  var12 = 0;
                  L2: while (true) {
                    if (var8 <= var12) {
                      var10++;
                      continue L1;
                    } else {
                      var13 = var12 + param2;
                      L3: while (true) {
                        if (var13 >= 0) {
                          L4: while (true) {
                            if (var13 < ((na) this).field_g) {
                              param1[var10][var12] = new wi(((na) this).field_h, ((na) this).field_f, var11, var13);
                              var12++;
                              continue L2;
                            } else {
                              var13 = var13 - ((na) this).field_g;
                              continue L4;
                            }
                          }
                        } else {
                          var13 = var13 + ((na) this).field_g;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("na.DA(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_17_0;
    }

    private final boolean a(int param0, int param1) {
        int var3 = 1 << param1;
        int var4 = param0 & var3;
        return var4 != 0 ? true : false;
    }

    private final int[] a(int param0, int[] param1, boolean param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] stackIn_4_0 = null;
        int[] stackIn_9_0 = null;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_10_0 = null;
        int[] stackOut_8_0 = null;
        int[] stackOut_3_0 = null;
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
              if (param0 < 0) {
                break L1;
              } else {
                if (param0 >= ((na) this).field_f) {
                  break L1;
                } else {
                  L2: {
                    if (param4 < 0) {
                      break L2;
                    } else {
                      if (param4 < ((na) this).field_h) {
                        param1 = this.a(param0, param1, param4, 72);
                        var6_int = this.a(param1, (byte) -47, param0);
                        int discarded$2 = 0;
                        var6_int = this.a(param2, var6_int, param4);
                        param1[param0] = var6_int;
                        stackOut_10_0 = (int[]) param1;
                        stackIn_11_0 = stackOut_10_0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_8_0 = (int[]) param1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            }
            stackOut_3_0 = (int[]) param1;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("na.F(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 44 + 0 + 44 + param4 + 41);
        }
        return stackIn_11_0;
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = EscapeVector.field_A;
          if (param1 < 0) {
            break L0;
          } else {
            if (((na) this).field_d <= param1) {
              return;
            } else {
              if (0 > param0) {
                break L0;
              } else {
                if (param0 < ((na) this).field_g) {
                  L1: {
                    if (param2) {
                      break L1;
                    } else {
                      ((na) this).field_d = 38;
                      break L1;
                    }
                  }
                  var4 = -1;
                  L2: while (true) {
                    if (var4 > 1) {
                      return;
                    } else {
                      if (var4 + param1 >= 0) {
                        if (((na) this).field_d > param1 + var4) {
                          var5 = ((na) this).field_g * (var4 + param1);
                          var6 = -1;
                          L3: while (true) {
                            if (1 >= var6) {
                              if (var6 + param0 >= 0) {
                                if (var6 + param0 < ((na) this).field_g) {
                                  ((na) this).field_r[var6 + param0 + var5] = true;
                                  var6++;
                                  continue L3;
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              } else {
                                var6++;
                                continue L3;
                              }
                            } else {
                              var4++;
                              continue L2;
                            }
                          }
                        } else {
                          var4++;
                          continue L2;
                        }
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wi var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        var13 = EscapeVector.field_A;
        var4 = ((na) this).field_a.length;
        var5 = ((na) this).field_a[0].length;
        var6 = -((na) this).field_f + -param2;
        var7 = 0;
        L0: while (true) {
          if (var4 <= var7) {
            return;
          } else {
            var6 = var6 + ((na) this).field_f;
            var8 = -((na) this).field_h + -param0;
            var9 = 0;
            L1: while (true) {
              if (var9 >= var5) {
                var7++;
                continue L0;
              } else {
                L2: {
                  var8 = var8 + ((na) this).field_h;
                  var10 = ((na) this).field_a[var7][var9];
                  if (var10.field_b >= 0) {
                    if (((na) this).field_d > var10.field_b) {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_10_0 = stackOut_7_0;
                      break L2;
                    }
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_10_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var11 = stackIn_10_0;
                  var12 = this.a(var10.field_b, -2981, var10.field_a, ((na) this).field_l);
                  stackOut_10_0 = var11;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (((na) this).field_n == var12) {
                    stackOut_12_0 = stackIn_12_0;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L3;
                  } else {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L3;
                  }
                }
                var11 = stackIn_13_0 & stackIn_13_1;
                if (var11 != 0) {
                  var10.field_e.e(var8, var6);
                  var9++;
                  continue L1;
                } else {
                  var9++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, gi param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        gi var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            if (null == param1.field_n) {
              return;
            } else {
              L1: {
                L2: {
                  if (param1.field_f != 0) {
                    break L2;
                  } else {
                    if (param1.field_h != 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (hf.field_b <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = qm.field_d[var2_int];
                      if (var3.field_a != 2) {
                        break L4;
                      } else {
                        if (param1.field_f != var3.field_f) {
                          break L4;
                        } else {
                          if (var3.field_h != param1.field_h) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (null == param1.field_k) {
                  break L5;
                } else {
                  break L5;
                }
              }
              int discarded$2 = 3;
              vi.a(param1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("na.C(").append(19956).append(44);
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
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    private final void a(int param0, boolean[] param1, int param2, boolean[][] param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= param2) {
                break L0;
              } else {
                var8 = param1[var7_int - -1] ? 1 : 0;
                param3[1 + var7_int][param5] = var8 != 0;
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("na.LA(").append(1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param2).append(44);
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
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + -23372 + 44 + param5 + 41);
        }
    }

    final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = EscapeVector.field_A;
        var4 = 0;
        var5 = 0;
        var6 = ((na) this).field_h * ((na) this).field_g;
        var7 = param1;
        L0: while (true) {
          if (var7 >= 0) {
            L1: while (true) {
              if (var6 > var7) {
                var4 = var7 / ((na) this).field_h;
                var5 = var7 % ((na) this).field_h;
                var8 = 0;
                var9 = 0;
                var10 = ((na) this).field_d * ((na) this).field_f;
                var11 = param2;
                L2: while (true) {
                  if (0 <= var11) {
                    L3: {
                      if (param2 < 0) {
                        var8 = var8 + var11 / ((na) this).field_f;
                        break L3;
                      } else {
                        var8 = var11 / ((na) this).field_f;
                        break L3;
                      }
                    }
                    L4: {
                      var9 = var11 % ((na) this).field_f;
                      this.a(false, param2);
                      ((na) this).field_p = this.a(param0 + -640, ((na) this).field_p, var4, false, var8);
                      this.a((byte) -66, ((na) this).field_p, var4, var8);
                      this.a((byte) 122, var8, var4);
                      this.a(var9, var5, (byte) 110);
                      ((na) this).field_a = this.a(0, ((na) this).field_a, var4, true, var8);
                      this.a((byte) -66, ((na) this).field_a, var4, var8);
                      this.b((byte) 89, var8, var4);
                      this.a(var5, (byte) 1, var9);
                      this.a(param0 ^ -744, var8, var9);
                      if (param0 == 640) {
                        break L4;
                      } else {
                        int discarded$1 = na.a(93, -16, 127, -111);
                        break L4;
                      }
                    }
                    return;
                  } else {
                    var8 = var8 - ((na) this).field_d;
                    var11 = var11 + var10;
                    continue L2;
                  }
                }
              } else {
                var7 = var7 - var6;
                continue L1;
              }
            }
          } else {
            var7 = var7 + var6;
            continue L0;
          }
        }
    }

    private final void a(int param0, byte param1) {
        em.a(((na) this).field_c);
        em.f(0, param0, 639, 479);
        ((na) this).field_y[0].e(0, 0);
        em.b(((na) this).field_c);
    }

    private final boolean f(int param0) {
        return param0 == -1;
    }

    private final boolean d(int param0, int param1, int param2) {
        if (param0 < 0) {
          return false;
        } else {
          if (((na) this).field_d > param0) {
            L0: {
              if (param2 < 0) {
                break L0;
              } else {
                if (((na) this).field_g <= param2) {
                  break L0;
                } else {
                  return ((na) this).field_r[param2 + param0 * ((na) this).field_g];
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final static String a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_6_0 = new String(var3);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3[-1 + (var2_int + -var4)] = param0.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("na.FB(");
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 0 + 41);
        }
        return stackIn_7_0;
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wi var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var13 = EscapeVector.field_A;
        var4 = ((na) this).field_p.length;
        var5 = ((na) this).field_p[0].length;
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (var7 >= var4) {
            return;
          } else {
            var8 = 0;
            L1: while (true) {
              if (var8 >= var5) {
                var7++;
                continue L0;
              } else {
                var9 = param1 + var7;
                var10 = var8 + param2;
                L2: while (true) {
                  if (var10 >= 0) {
                    L3: while (true) {
                      if (((na) this).field_g > var10) {
                        L4: {
                          var11 = ((na) this).field_p[var7][var8];
                          if (!this.d(var9, 2, var10)) {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            break L4;
                          } else {
                            stackOut_10_0 = 1;
                            stackIn_12_0 = stackOut_10_0;
                            break L4;
                          }
                        }
                        var12 = stackIn_12_0;
                        var12 = var12 != 0 | var11.field_g ? 1 : 0;
                        if (var12 != 0) {
                          var11.field_a = var10;
                          var11.field_b = var9;
                          this.a(var9, ((na) this).field_v, 1, 0, var11.field_e.field_B, var10);
                          var11.field_g = false;
                          var8++;
                          continue L1;
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var10 = var10 - ((na) this).field_g;
                        continue L3;
                      }
                    }
                  } else {
                    var10 = var10 + ((na) this).field_g;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    private final int[] a(boolean[][] param0, int param1, int[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((na) this).field_f) {
                stackOut_10_0 = (int[]) param2;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                var6 = this.a(param2, (byte) 108, var5);
                var7 = 0;
                L2: while (true) {
                  if (((na) this).field_h <= var7) {
                    var5++;
                    continue L1;
                  } else {
                    L3: {
                      var8 = this.a(var6, var7) ? 1 : 0;
                      int discarded$6 = 110;
                      var9 = this.a(var7, param0, var5);
                      int discarded$7 = 0;
                      var10 = this.a(var9) ? 1 : 0;
                      int discarded$8 = 0;
                      if (this.a(var10 != 0, var8 != 0)) {
                        param2 = this.a(var5, param2, var10 != 0, 0, var7);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("na.G(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
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
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(115).append(44);
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
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    private final void a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        param3 = param3 - 1;
        var5 = 0;
        L0: while (true) {
          if (var5 >= ((na) this).field_h) {
            return;
          } else {
            param3++;
            if (!this.c(param1, var5)) {
              param2[param3] = param0;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wi var11 = null;
        int var12 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var12 = EscapeVector.field_A;
        var4 = ((na) this).field_a.length;
        var5 = ((na) this).field_a[0].length;
        var6 = 0;
        L0: while (true) {
          if (var6 >= var4) {
            return;
          } else {
            var7 = 0;
            L1: while (true) {
              if (var5 <= var7) {
                var6++;
                continue L0;
              } else {
                var8 = var6 - -param1;
                var9 = var7 - -param2;
                L2: while (true) {
                  if (0 <= var9) {
                    L3: while (true) {
                      if (var9 < ((na) this).field_g) {
                        L4: {
                          if (!this.d(var8, 2, var9)) {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            break L4;
                          } else {
                            stackOut_10_0 = 1;
                            stackIn_12_0 = stackOut_10_0;
                            break L4;
                          }
                        }
                        L5: {
                          var10 = stackIn_12_0;
                          if (var10 == 0) {
                            break L5;
                          } else {
                            this.c((byte) 105, var9, var8);
                            break L5;
                          }
                        }
                        var11 = ((na) this).field_a[var6][var7];
                        var10 = var10 != 0 | var11.field_g ? 1 : 0;
                        if (var10 != 0) {
                          var11.field_a = var9;
                          var11.field_b = var8;
                          this.a(var8, ((na) this).field_l, ((na) this).field_z, 0, var11.field_e.field_B, var9);
                          var11.field_g = false;
                          var7++;
                          continue L1;
                        } else {
                          var7++;
                          continue L1;
                        }
                      } else {
                        var9 = var9 - ((na) this).field_g;
                        continue L3;
                      }
                    }
                  } else {
                    var9 = var9 + ((na) this).field_g;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    private final int a(boolean param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (param2 < 0) {
            break L0;
          } else {
            if (((na) this).field_h <= param2) {
              break L0;
            } else {
              L1: {
                var5 = 1 << param2;
                var6 = ~var5;
                var7 = param1 & var6;
                if (!param0) {
                  param1 = var7;
                  break L1;
                } else {
                  param1 = var7 | var5;
                  break L1;
                }
              }
              return param1;
            }
          }
        }
        return param1;
    }

    private final boolean a(boolean[] param0) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!param0[4]) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param0[1]) {
                if (param0[3]) {
                  if (!param0[5]) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  } else {
                    if (param0[7]) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    }
                  }
                } else {
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("na.WA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L1;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + 0 + 41);
        }
        return stackIn_18_0 != 0;
    }

    private final void a(int[] param0, boolean param1, int[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = param2.length / 8;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var4_int) {
                break L0;
              } else {
                L2: {
                  int incrementValue$8 = var5;
                  var5++;
                  if (0 == param0[incrementValue$8]) {
                    param2[var5 + -1] = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  int incrementValue$9 = var5;
                  var5++;
                  if (param0[incrementValue$9] == 0) {
                    param2[var5 + -1] = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  int incrementValue$10 = var5;
                  var5++;
                  if (param0[incrementValue$10] == 0) {
                    param2[-1 + var5] = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  int incrementValue$11 = var5;
                  var5++;
                  if (param0[incrementValue$11] != 0) {
                    break L5;
                  } else {
                    param2[var5 + -1] = 0;
                    break L5;
                  }
                }
                L6: {
                  int incrementValue$12 = var5;
                  var5++;
                  if (param0[incrementValue$12] != 0) {
                    break L6;
                  } else {
                    param2[var5 - 1] = 0;
                    break L6;
                  }
                }
                L7: {
                  int incrementValue$13 = var5;
                  var5++;
                  if (0 != param0[incrementValue$13]) {
                    break L7;
                  } else {
                    param2[var5 + -1] = 0;
                    break L7;
                  }
                }
                L8: {
                  int incrementValue$14 = var5;
                  var5++;
                  if (param0[incrementValue$14] == 0) {
                    param2[-1 + var5] = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  int incrementValue$15 = var5;
                  var5++;
                  if (0 != param0[incrementValue$15]) {
                    break L9;
                  } else {
                    param2[-1 + var5] = 0;
                    break L9;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("na.HA(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44).append(1).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw t.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 41);
        }
    }

    private final boolean[] a(int param0, boolean[][] param1, int param2) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        boolean[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            var5_int = 3;
            var6 = 3;
            var7 = param2;
            var8 = 1 + (param0 + -1);
            var9 = 0;
            L1: while (true) {
              if (var6 <= var9) {
                stackOut_7_0 = ((na) this).field_k;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var10 = 0;
                L2: while (true) {
                  if (var5_int <= var10) {
                    var9++;
                    continue L1;
                  } else {
                    var11 = param1[var7 + var9][var8 + var10] ? 1 : 0;
                    var12 = var9 * var5_int - -var10;
                    ((na) this).field_k[var12] = var11 != 0;
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("na.PA(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 44 + 110 + 41);
        }
        return stackIn_8_0;
    }

    final static void b(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            vj.a((byte) -116, jf.field_J, param0, oa.field_t, true, vl.field_e, 0);
            var2_int = 0;
            L1: while (true) {
              if (jf.field_J <= var2_int) {
                L2: {
                  vj.a((byte) -128, jf.field_J + param0, param0 + param0, pl.field_r, false, pg.field_d, param0);
                  if (jf.field_J <= param0) {
                    break L2;
                  } else {
                    jf.field_J = param0;
                    break L2;
                  }
                }
                break L0;
              } else {
                cd.field_q[var2_int + param0] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "na.TA(" + param0 + 44 + 0 + 41);
        }
    }

    private final void a(int param0, int[][] param1, int param2, int param3, int[] param4, int param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var16 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            var14 = this.a(param0, -2981, param5, param1);
            var16 = var14;
            int discarded$2 = 0;
            this.a(param4);
            if (((na) this).field_n != var14) {
              var8 = -((na) this).field_h;
              var9 = 0;
              L1: while (true) {
                if (var9 >= ((na) this).field_f) {
                  break L0;
                } else {
                  L2: {
                    var8 = var8 + ((na) this).field_h;
                    var10 = this.a(var16, (byte) 89, var9);
                    if (!this.a(var10)) {
                      if (this.f(var10)) {
                        this.a(param2, param4, var8);
                        break L2;
                      } else {
                        this.a(param2, var10, param4, var8);
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var7;
            stackOut_13_1 = new StringBuilder().append("na.QA(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param2).append(44).append(0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param5 + 41);
        }
    }

    private final void a(wi[][] param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
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
        var6 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = 117;
            var5 = param0[0][0].field_b;
            L1: while (true) {
              if (var5 >= param1) {
                L2: while (true) {
                  if (param1 >= var5) {
                    break L0;
                  } else {
                    var5--;
                    int discarded$5 = 122;
                    this.a(param0);
                    continue L2;
                  }
                }
              } else {
                var5++;
                this.a(param0, 0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("na.EB(");
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + -40 + 41);
        }
    }

    private final int[] a(int param0, int param1, int param2, int[][] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] stackIn_4_0 = null;
        int[] stackIn_8_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        int[] stackOut_7_0 = null;
        int[] stackOut_15_0 = null;
        int[] stackOut_19_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = EscapeVector.field_A;
        try {
          if (param0 < 0) {
            stackOut_3_0 = ((na) this).field_n;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (param0 >= ((na) this).field_d) {
              stackOut_7_0 = ((na) this).field_x;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              L0: while (true) {
                if (((na) this).field_g > param2) {
                  L1: while (true) {
                    if (param2 >= 0) {
                      var5_int = param2 + ((na) this).field_g * param0;
                      if (0 > var5_int) {
                        stackOut_15_0 = ((na) this).field_n;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      } else {
                        if (var5_int >= param3.length) {
                          stackOut_19_0 = ((na) this).field_n;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        } else {
                          return param3[var5_int];
                        }
                      }
                    } else {
                      param2 = param2 + ((na) this).field_g;
                      continue L1;
                    }
                  }
                } else {
                  param2 = param2 - ((na) this).field_g;
                  continue L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("na.EA(").append(param0).append(44).append(-2981).append(44).append(param2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    private final boolean a(boolean param0, boolean param1) {
        return param1 ^ param0;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var3 = 640;
          var4 = 480;
          var5 = (ma.field_a.field_M >> 16) % var3;
          em.a(((na) this).field_c);
          var6 = param1 % var4;
          ((na) this).field_y[0].g();
          this.b(-126, var5, var6);
          var7 = -var5 + var3;
          var8 = -var6 + var4;
          var9 = 0;
          var10 = var7;
          var11 = 0;
          var12 = var8;
          var13 = -var5;
          var14 = -var6;
          if (var5 < 0) {
            stackOut_2_0 = -1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var15 = stackIn_3_0;
        em.f(var9, var11, var10, var12);
        dj.a(var14, -24, var13);
        em.f(var7 * var15 + var9, var11, var10 - -(var5 * var15), var12);
        dj.a(var14, -123, var13 + var15 * var3);
        em.f(var9, var11 - -var8, var10, var6 + var12);
        dj.a(var14 + var4, -127, var13);
        em.f(var9 - -(var7 * var15), var11 - -var8, var10 - -(var5 * var15), var12 - -var6);
        dj.a(var14 + var4, -94, var3 * var15 + var13);
        md.field_D.a(107);
        em.b(((na) this).field_c);
    }

    private final void a(int[][] param0, byte param1, boolean[][] param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var13 = param0[1];
            var5 = this.a(var13, (byte) 121, -1 + ((na) this).field_f);
            this.a(1, -1, 0, ((na) this).field_h, var5, param2[0]);
            var7 = 34;
            var6 = param0[7];
            var8 = this.a(var6, (byte) -81, 0);
            this.a(1, -1, 0, ((na) this).field_h, var8, param2[1 + ((na) this).field_f]);
            var9 = param0[3];
            var10 = this.a(-103, ((na) this).field_h - 1, var9);
            this.a(1, -1, 0, ((na) this).field_f, var10, ((na) this).field_e);
            this.a(1, ((na) this).field_e, ((na) this).field_f, param2, -23372, 0);
            var11 = param0[5];
            var12 = this.a(-95, 0, var11);
            this.a(1, -1, 0, ((na) this).field_f, var12, ((na) this).field_e);
            this.a(1, ((na) this).field_e, ((na) this).field_f, param2, -23372, 1 + ((na) this).field_h);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("na.DB(");
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(62).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    private final void a(boolean param0, wi[][] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        wi var6 = null;
        int var7_int = 0;
        wi var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param1.length;
            var4 = param1[0].length;
            var5 = 0;
            L1: while (true) {
              if (var3_int <= var5) {
                break L0;
              } else {
                var6 = param1[var5][var4 - 1];
                var6.field_g = true;
                var7_int = -1 + var4;
                L2: while (true) {
                  if (var7_int <= 0) {
                    var7 = param1[var5][1];
                    var6.field_b = var7.field_b;
                    var8 = var7.field_a + -1;
                    L3: while (true) {
                      if (var8 >= 0) {
                        var6.field_a = var8;
                        param1[var5][0] = var6;
                        var5++;
                        continue L1;
                      } else {
                        var8 = var8 + ((na) this).field_g;
                        continue L3;
                      }
                    }
                  } else {
                    param1[var5][var7_int] = param1[var5][-1 + var7_int];
                    var7_int--;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("na.KB(").append(0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    private final void a(byte param0, wi[][] param1, int param2, int param3) {
        try {
            this.a((byte) -3, param1, param2);
            this.a(param1, param3, (byte) -40);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "na.O(" + -66 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(byte param0, int[][] param1, boolean[][] param2) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var4 = param1[4];
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((na) this).field_f) {
                break L0;
              } else {
                var6 = this.a(var4, (byte) 111, var5);
                var7 = 0;
                L2: while (true) {
                  if (((na) this).field_h <= var7) {
                    var5++;
                    continue L1;
                  } else {
                    var8 = this.a(var6, var7) ? 1 : 0;
                    param2[1 + var5][1 + var7] = var8 != 0;
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("na.AB(").append(121).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    private final void a(byte param0, wi[][] param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var4_int = ((na) this).field_g / 2;
              var5 = param1[0][0].field_a;
              var6 = -var5 + param2;
              if (0 <= var6) {
                break L1;
              } else {
                var6 = var6 + ((na) this).field_g;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var5 <= param2) {
                  break L3;
                } else {
                  if (var4_int >= var6) {
                    var5 = var5 - ((na) this).field_g;
                    break L3;
                  } else {
                    L4: while (true) {
                      if (param2 <= var5) {
                        break L2;
                      } else {
                        if (var4_int < var6) {
                          break L2;
                        } else {
                          int discarded$2 = 7;
                          this.b(param1);
                          var5++;
                          L5: while (true) {
                            if (var5 < ((na) this).field_g) {
                              continue L4;
                            } else {
                              var5 = var5 - ((na) this).field_g;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L6: while (true) {
                if (param2 <= var5) {
                  break L2;
                } else {
                  if (var4_int < var6) {
                    break L2;
                  } else {
                    int discarded$3 = 7;
                    this.b(param1);
                    var5++;
                    L7: while (true) {
                      if (var5 < ((na) this).field_g) {
                        continue L6;
                      } else {
                        var5 = var5 - ((na) this).field_g;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
            L8: {
              var6 = var5 + -param2;
              if (var6 >= 0) {
                break L8;
              } else {
                var6 = ((na) this).field_g - -var6;
                break L8;
              }
            }
            L9: {
              if (var5 >= param2) {
                break L9;
              } else {
                if (var4_int < var6) {
                  break L9;
                } else {
                  var5 = var5 + ((na) this).field_g;
                  break L9;
                }
              }
            }
            L10: while (true) {
              L11: {
                if (param2 >= var5) {
                  break L11;
                } else {
                  if (var4_int < var6) {
                    break L11;
                  } else {
                    this.a(false, param1);
                    var5--;
                    L12: while (true) {
                      if (var5 >= 0) {
                        continue L10;
                      } else {
                        var5 = var5 + ((na) this).field_g;
                        continue L12;
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("na.HB(").append(-3).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L13;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L13;
            }
          }
          throw t.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 41);
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var11 = 0;
        int var12 = EscapeVector.field_A;
        int[] var13 = ((na) this).field_u;
        int[] var4 = var13;
        int var5 = (param1 & 1 ^ 1 & param2) == 1 ? 1 : 0;
        int var7 = -3;
        if (var5 != 0) {
            var13[0] = ((na) this).field_q;
            var13[1] = ((na) this).field_o;
        } else {
            var4[1] = ((na) this).field_q;
            var4[0] = ((na) this).field_o;
        }
        int[] var6 = em.field_i;
        int var8 = 640;
        int var9 = 480;
        int var10 = var8 * var9;
        for (var11 = 0; var10 > var11; var11++) {
            var6[var11] = var4[ae.a(var11, 1)];
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean[] param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var7_int = 0;
            L1: while (true) {
              if (param3 <= var7_int) {
                break L0;
              } else {
                var8 = this.a(param4, var7_int) ? 1 : 0;
                param5[1 + var7_int] = var8 != 0;
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("na.CA(").append(1).append(44).append(-1).append(44).append(0).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4 = param0 + param1;
        int var5 = -param3 + param2;
        int var6 = var5 / var4;
        return var6;
    }

    private final void a(wi[][] param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        wi var7 = null;
        int var8_int = 0;
        wi var8 = null;
        int var9 = 0;
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
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0.length;
            var4 = param0[0].length;
            var5 = -89;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var4) {
                break L0;
              } else {
                var7 = param0[-1 + var3_int][var6];
                var7.field_g = true;
                var8_int = var3_int - 1;
                L2: while (true) {
                  if (var8_int <= 0) {
                    var8 = param0[1][var6];
                    var7.field_a = var8.field_a;
                    var7.field_b = var8.field_b + -1;
                    param0[0][var6] = var7;
                    var6++;
                    continue L1;
                  } else {
                    param0[var8_int][var6] = param0[-1 + var8_int][var6];
                    var8_int--;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("na.SA(");
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
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 122 + 41);
        }
    }

    private final int a(int param0, int param1, int[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            if (param2 != ((na) this).field_x) {
              if (((na) this).field_n != param2) {
                L1: {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (param1 >= ((na) this).field_f) {
                      break L1;
                    } else {
                      L2: {
                        if (param0 <= -88) {
                          break L2;
                        } else {
                          ((na) this).field_d = 1;
                          break L2;
                        }
                      }
                      var4_int = 0;
                      var5 = 0;
                      L3: while (true) {
                        if (((na) this).field_f <= var5) {
                          stackOut_20_0 = var4_int;
                          stackIn_21_0 = stackOut_20_0;
                          break L0;
                        } else {
                          L4: {
                            var6 = this.a(param2, (byte) -83, var5);
                            if (this.a(var6, param1)) {
                              var8 = 1 << var5;
                              var4_int = var8 | var4_int;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("na.JA(").append(param0).append(44).append(param1).append(44);
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
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0;
    }

    private final void b(wi[][] param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        wi var7 = null;
        int var8_int = 0;
        wi var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0.length;
            var4 = param0[0].length;
            var6 = 81;
            var5 = 0;
            L1: while (true) {
              if (var3_int <= var5) {
                break L0;
              } else {
                var7 = param0[var5][0];
                var7.field_g = true;
                var8_int = 0;
                L2: while (true) {
                  if (var8_int >= -1 + var4) {
                    var8 = param0[var5][-2 + var4];
                    var7.field_b = var8.field_b;
                    var9 = 1 + var8.field_a;
                    L3: while (true) {
                      if (var9 < ((na) this).field_g) {
                        var7.field_a = var9;
                        param0[var5][-1 + var4] = var7;
                        var5++;
                        continue L1;
                      } else {
                        var9 = var9 - ((na) this).field_g;
                        continue L3;
                      }
                    }
                  } else {
                    param0[var5][var8_int] = param0[var5][var8_int - -1];
                    var8_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("na.BB(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 7 + 41);
        }
    }

    private final void a(int[] param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0.length <= var3_int) {
                break L0;
              } else {
                param0[var3_int] = 0;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("na.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
    }

    private final void c(byte param0, int param1, int param2) {
        int[][] var7 = this.a(param2, ((na) this).field_v, false, param1);
        int[][] var4 = var7;
        if (param0 < 103) {
            return;
        }
        int[] var8 = this.a(param2, -2981, param1, ((na) this).field_l);
        int[] var5 = var8;
        boolean[][] var6 = this.a(0, var7);
        var5 = this.a(var6, 115, var8);
        ((na) this).field_l[param1 + param2 * ((na) this).field_g] = var5;
        this.c(param1, -1, param2);
    }

    final static dk[] a(int param0, int[] param1, int param2, int param3, ih param4, String[] param5, int[] param6, boolean param7, int[] param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dk[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        dk var17 = null;
        int var18 = 0;
        dk[] stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        dk[] stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var18 = EscapeVector.field_A;
        try {
          L0: {
            var9_int = 3;
            var10 = param1.length;
            var11 = jd.a(param4, (byte) -121, param5);
            var12 = na.a(1, var10, param0, var11);
            var13 = dd.a(var11, (byte) 122, param0, var10, var12);
            var14 = new dk[var10];
            var15 = 0;
            L1: while (true) {
              if (var15 >= var10) {
                stackOut_4_0 = (dk[]) var14;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                int discarded$1 = 0;
                var16 = ji.a(var12, param4, param5, var13, var15, param3);
                var17 = new dk(var9_int, param1[var15], param5[var15], param8[var15], param6[var15], param4);
                var17.b((byte) 114, var16, param2);
                var14[var15] = var17;
                var15++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var9;
            stackOut_6_1 = new StringBuilder().append("na.J(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
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
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param8 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_5_0;
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        for (var2 = 0; var2 < ((na) this).field_d; var2++) {
            for (var3 = 0; var3 < ((na) this).field_g; var3++) {
                this.c((byte) 107, var3, var2);
            }
        }
    }

    private final boolean a(int param0) {
        return param0 == 0;
    }

    private final void a(wi[][] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        wi var6 = null;
        int var7_int = 0;
        wi var7 = null;
        int var8 = 0;
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
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var3_int = param0.length;
            var4 = param0[param1].length;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                break L0;
              } else {
                var6 = param0[0][var5];
                var6.field_g = true;
                var7_int = 0;
                L2: while (true) {
                  if (var3_int - 1 <= var7_int) {
                    var7 = param0[-2 + var3_int][var5];
                    var6.field_b = var7.field_b + 1;
                    var6.field_a = var7.field_a;
                    param0[-1 + var3_int][var5] = var6;
                    var5++;
                    continue L1;
                  } else {
                    param0[var7_int][var5] = param0[var7_int - -1][var5];
                    var7_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("na.P(");
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
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param2 >= 0) {
            if (((na) this).field_d <= param2) {
                return;
            }
            if (param0 >= 0) {
                if (!(param0 < ((na) this).field_g)) {
                    return;
                }
                ((na) this).field_r[param2 * ((na) this).field_g - -param0] = false;
                return;
            }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wi var12 = null;
        int[] var13 = null;
        int var14 = 0;
        var14 = EscapeVector.field_A;
        var4 = 640;
        em.a(((na) this).field_c);
        var5 = 480;
        ((na) this).field_y[1].g();
        em.f(0, 0, var4, var5);
        em.d();
        var6 = ((na) this).field_p.length;
        var7 = ((na) this).field_p[0].length;
        var8 = -((na) this).field_f + -param0;
        var9 = 0;
        L0: while (true) {
          if (var9 >= var6) {
            md.field_D.a(126);
            em.b(((na) this).field_c);
            this.a(((na) this).field_y[1].field_B, true, ((na) this).field_y[0].field_B);
            ((na) this).field_y[0].e(0, 0);
            return;
          } else {
            var8 = var8 + ((na) this).field_f;
            var10 = -param1 + -((na) this).field_h;
            var11 = 0;
            L1: while (true) {
              if (var11 >= var7) {
                var9++;
                continue L0;
              } else {
                var10 = var10 + ((na) this).field_h;
                var12 = ((na) this).field_p[var9][var11];
                var13 = this.a(var12.field_b, -2981, var12.field_a, ((na) this).field_v);
                if (((na) this).field_n != var13) {
                  if (var13 == ((na) this).field_x) {
                    em.a(var10, var8, ((na) this).field_h, ((na) this).field_f, 1);
                    var11++;
                    continue L1;
                  } else {
                    var12.field_e.d(var10, var8);
                    var11++;
                    continue L1;
                  }
                } else {
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final int[] a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] stackIn_4_0 = null;
        int[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        int[] stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (((na) this).field_x == param1) {
                break L1;
              } else {
                if (((na) this).field_n == param1) {
                  break L1;
                } else {
                  stackOut_3_0 = (int[]) param1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                }
              }
            }
            L2: {
              var6 = -33;
              var5_int = 0;
              if (((na) this).field_x == param1) {
                var5_int = -1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((na) this).field_n == param1) {
                var5_int = 0;
                break L3;
              } else {
                break L3;
              }
            }
            param1 = new int[((na) this).field_f];
            var7 = 0;
            L4: while (true) {
              if (param1.length <= var7) {
                stackOut_14_0 = (int[]) param1;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                param1[var7] = var5_int;
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("na.H(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + 72 + 41);
        }
        return stackIn_15_0;
    }

    private final void c() {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        ((na) this).field_y = new ed[2];
        for (var2 = 0; var2 < ((na) this).field_y.length; var2++) {
            ((na) this).field_y[var2] = new ed(640, 480);
        }
    }

    private final int[][] a(int param0, int[][] param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int[][] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            var5_int = 3;
            var6 = 3;
            var7 = -1 + param0;
            var8 = -1 + param3;
            var9 = 0;
            L1: while (true) {
              if (var9 >= var6) {
                stackOut_8_0 = ((na) this).field_s;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var10 = 0;
                L2: while (true) {
                  if (var10 >= var5_int) {
                    var9++;
                    continue L1;
                  } else {
                    var11 = this.a(var9 + var7, -2981, var8 - -var10, param1);
                    var12 = var10 + var5_int * var9;
                    ((na) this).field_s[var12] = var11;
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("na.JB(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 0 + 44 + param3 + 41);
        }
        return stackIn_9_0;
    }

    na(int[][] param0, int[] param1, int[] param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((na) this).field_B = 1458707;
        ((na) this).field_f = 32;
        ((na) this).field_u = new int[2];
        ((na) this).field_j = new int[]{199169, 0};
        ((na) this).field_o = 199169;
        ((na) this).field_h = 32;
        ((na) this).field_z = 2917671;
        ((na) this).field_q = 597511;
        try {
          L0: {
            ((na) this).field_n = param2;
            ((na) this).field_x = param1;
            ((na) this).field_g = param3;
            ((na) this).field_d = param4;
            ((na) this).field_v = param0;
            int discarded$3 = 1;
            ((na) this).field_l = this.e();
            ((na) this).field_e = new boolean[2 + ((na) this).field_f];
            ((na) this).field_k = new boolean[9];
            ((na) this).field_s = new int[9][];
            ((na) this).field_r = new boolean[((na) this).field_d * ((na) this).field_g];
            ((na) this).field_A = new boolean[((na) this).field_f + 2][2 + ((na) this).field_h];
            int discarded$4 = 0;
            this.b();
            int discarded$5 = 96;
            this.c();
            ((na) this).field_c = new int[4];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var6;
            stackOut_3_1 = new StringBuilder().append("na.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_t = " - fire rock buster";
        field_m = "Highscores";
        field_i = new int[]{11, 14, 15, 16, 17, 18};
    }
}
