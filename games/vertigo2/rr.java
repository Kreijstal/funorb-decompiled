/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rr extends ji {
    static String field_A;
    static boolean[] field_z;
    static boolean field_C;
    static short[] field_D;
    static String field_y;
    static ra[] field_B;

    public rr() {
        super(1, false);
    }

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (var2_int <= 20) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var3 = new char[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_17_0 = new String(var3);
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param1.charAt(var4);
                    if (65 > var5) {
                      break L4;
                    } else {
                      if (90 < var5) {
                        break L4;
                      } else {
                        var3[var4] = (char)(var5 + 32);
                        break L3;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5 < 97) {
                        break L6;
                      } else {
                        if (var5 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (48 > var5) {
                        break L7;
                      } else {
                        if (var5 > 57) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3[var4] = '_';
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("rr.E(").append(-99).append(44);
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
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_18_0;
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        L0: {
          L1: {
            var7 = Vertigo2.field_L ? 1 : 0;
            var4 = rh.field_O[param1];
            var5 = lf.field_y[param2];
            var6 = (float)Math.atan2((double)(-2048 + var4), (double)(var5 - param0));
            if ((double)var6 < -3.141592653589793) {
              break L1;
            } else {
              if ((double)var6 <= -2.356194490192345) {
                tn.field_j = param1;
                bh.field_c = param2;
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if ((double)var6 > -1.5707963267948966) {
              break L2;
            } else {
              if (-2.356194490192345 <= (double)var6) {
                bh.field_c = param1;
                tn.field_j = param2;
                break L0;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (-0.7853981633974483 < (double)var6) {
              break L3;
            } else {
              if (-1.5707963267948966 > (double)var6) {
                break L3;
              } else {
                tn.field_j = we.field_M + -param2;
                bh.field_c = param1;
                break L0;
              }
            }
          }
          L4: {
            if (0.0f < var6) {
              break L4;
            } else {
              if ((double)var6 >= -0.7853981633974483) {
                tn.field_j = param1;
                bh.field_c = aa.field_Vb + -param2;
                break L0;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (var6 < 0.0f) {
              break L5;
            } else {
              if (0.7853981633974483 >= (double)var6) {
                bh.field_c = aa.field_Vb - param2;
                tn.field_j = -param1 + we.field_M;
                break L0;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if ((double)var6 < 0.7853981633974483) {
              break L6;
            } else {
              if ((double)var6 > 1.5707963267948966) {
                break L6;
              } else {
                tn.field_j = we.field_M - param2;
                bh.field_c = -param1 + aa.field_Vb;
                break L0;
              }
            }
          }
          if ((double)var6 < 1.5707963267948966) {
            if (2.356194490192345 <= (double)var6) {
              if ((double)var6 > 3.141592653589793) {
                break L0;
              } else {
                tn.field_j = we.field_M + -param1;
                bh.field_c = param2;
                break L0;
              }
            } else {
              if (2.356194490192345 > (double)var6) {
                break L0;
              } else {
                if ((double)var6 > 3.141592653589793) {
                  break L0;
                } else {
                  tn.field_j = we.field_M + -param1;
                  bh.field_c = param2;
                  break L0;
                }
              }
            }
          } else {
            if (2.356194490192345 > (double)var6) {
              break L0;
            } else {
              if ((double)var6 > 3.141592653589793) {
                break L0;
              } else {
                tn.field_j = we.field_M + -param1;
                bh.field_c = param2;
                break L0;
              }
            }
          }
        }
        tn.field_j = tn.field_j & rm.field_z;
        bh.field_c = bh.field_c & fk.field_x;
    }

    public static void b(byte param0) {
        field_z = null;
        field_A = null;
        field_B = null;
        field_y = null;
        field_D = null;
        int var1 = 82 % ((-3 - param0) / 49);
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (0 == param1) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param2.h(-11) != 1) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((rr) this).field_o = stackIn_5_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 == 110) {
                break L3;
              } else {
                var5 = null;
                ((rr) this).a((byte) -97, 81, (ed) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("rr.C(").append(param0).append(44).append(param1).append(44);
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int[] var7 = ((rr) this).field_x.a(param0, (byte) 103);
        int[] var3 = var7;
        if (param1 <= 91) {
            int[][] discarded$0 = ((rr) this).b(58, 20);
        }
        if (!(!((rr) this).field_x.field_i)) {
            for (var4 = 0; var4 < we.field_M; var4++) {
                this.d(2048, var4, param0);
                var5 = ((rr) this).a(0, -1, bh.field_c);
                var7[var4] = var5[tn.field_j];
            }
        }
        return var3;
    }

    final int[][] b(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[][] var14 = null;
        int var9 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -3780) {
            rr.b((byte) -10);
        }
        int[][] var13 = ((rr) this).field_v.a(param1, param0 ^ 3778);
        int[][] var11 = var13;
        int[][] var10 = var11;
        int[][] var3 = var10;
        if (!(!((rr) this).field_v.field_c)) {
            var4 = var13[0];
            var5 = var13[1];
            var6 = var13[2];
            for (var7 = 0; var7 < we.field_M; var7++) {
                this.d(param0 ^ -1732, var7, param1);
                var14 = ((rr) this).c(0, param0 ^ -3777, bh.field_c);
                var4[var7] = var14[0][tn.field_j];
                var5[var7] = var14[1][tn.field_j];
                var6[var7] = var14[2][tn.field_j];
            }
        }
        return var10;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Rankings";
        field_D = new short[4096];
        field_y = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_C = true;
        field_B = new ra[3];
        field_z = new boolean[field_B.length];
    }
}
