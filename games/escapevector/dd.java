/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    private int field_i;
    static ll field_h;
    static h field_d;
    static hh field_g;
    static volatile int field_c;
    static String field_b;
    private int field_f;
    static ed[] field_a;
    private int[][] field_e;

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        if (param0 < 88) {
            field_a = null;
        }
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final int a(int param0, byte param1) {
        if (((dd) this).field_e != null) {
            param0 = (int)((long)((dd) this).field_f * (long)param0 / (long)((dd) this).field_i);
        }
        if (param1 != -87) {
            field_a = null;
        }
        return param0;
    }

    final int a(boolean param0, int param1) {
        if (!(((dd) this).field_e == null)) {
            param1 = 6 - -(int)((long)param1 * (long)((dd) this).field_f / (long)((dd) this).field_i);
        }
        if (param0) {
            dd.a(-23);
        }
        return param1;
    }

    final byte[] a(int param0, byte[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (null == ((dd) this).field_e) {
                break L1;
              } else {
                var3_int = (int)((long)((dd) this).field_f * (long)param1.length / (long)((dd) this).field_i) - -14;
                var20 = new int[var3_int];
                var18 = var20;
                var16 = var18;
                var14 = var16;
                var4 = var14;
                var5 = 0;
                var6 = 0;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= param1.length) {
                    param1 = new byte[var3_int];
                    var12 = 0;
                    var7 = var12;
                    L3: while (true) {
                      if (var12 >= var3_int) {
                        break L1;
                      } else {
                        L4: {
                          var8 = 32768 + var20[var12] >> 16;
                          if (var8 >= -128) {
                            if (var8 > 127) {
                              param1[var12] = (byte) 127;
                              break L4;
                            } else {
                              param1[var12] = (byte)var8;
                              break L4;
                            }
                          } else {
                            param1[var12] = (byte) -128;
                            break L4;
                          }
                        }
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    var8 = param1[var7];
                    var19 = ((dd) this).field_e[var6];
                    var10 = 0;
                    L5: while (true) {
                      if (var10 >= 14) {
                        var6 = var6 + ((dd) this).field_f;
                        var10 = var6 / ((dd) this).field_i;
                        var5 = var5 + var10;
                        var6 = var6 - var10 * ((dd) this).field_i;
                        var7++;
                        continue L2;
                      } else {
                        var4[var5 - -var10] = var4[var5 - -var10] + var8 * var19[var10];
                        var10++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            L6: {
              if (param0 == -128) {
                break L6;
              } else {
                field_g = null;
                break L6;
              }
            }
            stackOut_18_0 = (byte[]) param1;
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("dd.F(").append(param0).append(44);
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
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0;
    }

    dd(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param1 != param0) {
          var3 = im.a(param1, param0, 62);
          param1 = param1 / var3;
          param0 = param0 / var3;
          ((dd) this).field_f = param1;
          ((dd) this).field_e = new int[param0][14];
          ((dd) this).field_i = param0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              return;
            } else {
              L1: {
                var5 = ((dd) this).field_e[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(-7.0 + var6 + 1.0);
                if (var8 >= 0) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(var6 + 7.0);
                if (var9 <= 14) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var9 <= var8) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = ((double)var8 - var6) * 3.141592653589793;
                      var14 = var10;
                      if (var12 < -0.0001) {
                        break L5;
                      } else {
                        if (var12 <= 0.0001) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (Math.cos(0.2243994752564138 * (-var6 + (double)var8)) * 0.46 + 0.54);
                  var5[var8] = (int)Math.floor(var14 * 65536.0 + 0.5);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static vn a(java.awt.Component param0, int param1, byte param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            vn var5 = null;
            cg var5_ref = null;
            Object stackIn_2_0 = null;
            vn stackIn_4_0 = null;
            cg stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            vn stackOut_3_0 = null;
            Object stackOut_1_0 = null;
            cg stackOut_5_0 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              try {
                if (param2 == 125) {
                  var4 = Class.forName("kd");
                  var5 = (vn) var4.newInstance();
                  var5.a(1018, param3, param0, param1);
                  stackOut_3_0 = (vn) var5;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                } else {
                  stackOut_1_0 = null;
                  stackIn_2_0 = stackOut_1_0;
                  return (vn) (Object) stackIn_2_0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new cg();
                ((vn) (Object) var5_ref).a(1018, param3, param0, param1);
                stackOut_5_0 = (cg) var5_ref;
                stackIn_6_0 = stackOut_5_0;
                return (vn) (Object) stackIn_6_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var4_ref2;
                stackOut_7_1 = new StringBuilder().append("dd.B(");
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
                  break L0;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L0;
                }
              }
              throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = param4;
        int var6 = 1 + param3;
        int var7 = -param0 + param2;
        int var8 = var7 - param4 * var6;
        var5 = var5 + var8 / 2;
        var8 = -(var8 / 2 * 2) + (-(var6 * param4) + var7);
        if (param1 <= 75) {
            return 19;
        }
        var5 = var5 + var8;
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Five rock busters -  'ENTER' or 'R' or 'ALT' to fire";
        field_a = new ed[7];
        field_c = 0;
    }
}
