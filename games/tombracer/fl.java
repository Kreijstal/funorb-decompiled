/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends ci {
    static int field_m;

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
            Object var7 = null;
            String discarded$0 = fl.a((byte) -31, (CharSequence) null);
        }
        int[] var8 = ((fl) this).field_i.a((byte) -111, param1);
        int[] var3 = var8;
        if (!(!((fl) this).field_i.field_d)) {
            for (var4 = 0; ns.field_g > var4; var4++) {
                this.d(var4, param1, -5455);
                var5 = ((fl) this).c(0, -70, fv.field_e);
                var8[var4] = var5[boa.field_o];
            }
        }
        return var3;
    }

    final static String a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = 4 % ((64 - param0) / 38);
              var2_int = param1.length();
              if (var2_int > 20) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var11 = new char[var2_int];
            var10 = var11;
            var9 = var10;
            var8 = var9;
            var4 = var8;
            var5 = 0;
            L2: while (true) {
              if (var2_int <= var5) {
                stackOut_19_0 = new String(var11);
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var6 = param1.charAt(var5);
                    if (65 > var6) {
                      break L4;
                    } else {
                      if (var6 <= 90) {
                        var4[var5] = (char)(32 + var6);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (var6 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var6 < 48) {
                        break L7;
                      } else {
                        if (var6 > 57) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var4[var5] = '_';
                    break L3;
                  }
                  var4[var5] = (char)var6;
                  break L3;
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("fl.C(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param2 == -5455) {
            break L0;
          } else {
            field_m = -128;
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = ht.field_Fb[param0];
            var5 = sj.field_b[param1];
            var6 = (float)Math.atan2((double)(-2048 + var4), (double)(var5 - 2048));
            if ((double)var6 < -3.141592653589793) {
              break L2;
            } else {
              if (-2.356194490192345 < (double)var6) {
                break L2;
              } else {
                fv.field_e = param1;
                boa.field_o = param0;
                break L1;
              }
            }
          }
          L3: {
            if ((double)var6 > -1.5707963267948966) {
              break L3;
            } else {
              if ((double)var6 < -2.356194490192345) {
                break L3;
              } else {
                boa.field_o = param1;
                fv.field_e = param0;
                break L1;
              }
            }
          }
          L4: {
            if (-0.7853981633974483 < (double)var6) {
              break L4;
            } else {
              if (-1.5707963267948966 > (double)var6) {
                break L4;
              } else {
                fv.field_e = param0;
                boa.field_o = -param1 + ns.field_g;
                break L1;
              }
            }
          }
          L5: {
            if (var6 > 0.0f) {
              break L5;
            } else {
              if ((double)var6 < -0.7853981633974483) {
                break L5;
              } else {
                boa.field_o = param0;
                fv.field_e = qda.field_i - param1;
                break L1;
              }
            }
          }
          L6: {
            if (0.0f > var6) {
              break L6;
            } else {
              if ((double)var6 > 0.7853981633974483) {
                break L6;
              } else {
                fv.field_e = qda.field_i - param1;
                boa.field_o = ns.field_g - param0;
                break L1;
              }
            }
          }
          L7: {
            if ((double)var6 < 0.7853981633974483) {
              break L7;
            } else {
              if ((double)var6 > 1.5707963267948966) {
                break L7;
              } else {
                boa.field_o = ns.field_g + -param1;
                fv.field_e = qda.field_i + -param0;
                break L1;
              }
            }
          }
          L8: {
            if ((double)var6 < 1.5707963267948966) {
              break L8;
            } else {
              if (2.356194490192345 >= (double)var6) {
                boa.field_o = param1;
                fv.field_e = qda.field_i + -param0;
                break L1;
              } else {
                break L8;
              }
            }
          }
          if (2.356194490192345 > (double)var6) {
            break L1;
          } else {
            if ((double)var6 > 3.141592653589793) {
              break L1;
            } else {
              fv.field_e = param1;
              boa.field_o = -param0 + ns.field_g;
              break L1;
            }
          }
        }
        fv.field_e = fv.field_e & hba.field_b;
        boa.field_o = boa.field_o & una.field_b;
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
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
              if (0 == param2) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param1.h(param0 + 148) != 1) {
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
                ((fl) this).field_g = stackIn_5_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 == 107) {
                break L3;
              } else {
                field_m = -44;
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
            stackOut_9_1 = new StringBuilder().append("fl.A(").append(param0).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final int[][] b(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[][] var14 = null;
        int var9 = TombRacer.field_G ? 1 : 0;
        int[][] var13 = ((fl) this).field_h.a(param0, (byte) -43);
        int[][] var11 = var13;
        int[][] var10 = var11;
        int[][] var3 = var10;
        if (!(!((fl) this).field_h.field_f)) {
            var4 = var13[0];
            var5 = var13[1];
            var6 = var13[2];
            for (var7 = 0; var7 < ns.field_g; var7++) {
                this.d(var7, param0, -5455);
                var14 = ((fl) this).a(fv.field_e, 0, -1);
                var4[var7] = var14[0][boa.field_o];
                var5[var7] = var14[1][boa.field_o];
                var6[var7] = var14[2][boa.field_o];
            }
        }
        if (param1 != -1) {
            this.d(68, 15, 61);
        }
        return var3;
    }

    public fl() {
        super(1, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
    }
}
