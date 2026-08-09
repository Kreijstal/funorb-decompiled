/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends an {
    static int field_F;
    int field_G;
    static int field_I;
    private rl field_H;
    static vn field_E;
    int field_K;
    private int field_J;

    final int b(boolean param0) {
        if (param0) {
            String var3 = (String) null;
            hf.a(false, (java.applet.Applet) null, (String) null);
        }
        return this.field_J;
    }

    final static String a(boolean param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            Object stackIn_13_0 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            var7 = ZombieDawn.field_J;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0) {
                        break L2;
                      } else {
                        hf.d((byte) -83);
                        break L2;
                      }
                    }
                    var3 = (String) (qe.a(param1, "getcookies", -91));
                    var4 = de.a(';', var3, -126);
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var6 = var4[var5].indexOf('=');
                          if (-1 < (var6 ^ -1)) {
                            break L4;
                          } else {
                            if (!var4[var5].substring(0, var6).trim().equals(param2)) {
                              break L4;
                            } else {
                              stackIn_8_0 = var4[var5].substring(var6 - -1).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackIn_13_0 = null;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var3_ref2);

                stackIn_16_1 = new StringBuilder().append("hf.M(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L6;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

                if (param2 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L7;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L7;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_13_0);
            } else {
              return stackIn_8_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ZombieDawn.field_J;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_22_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -this.field_K + (-param4 + param0);
                var9 = -(this.field_K * 2) + this.field_i;
                if (var8_int <= var9) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if ((var8_int ^ -1) <= -1) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * this.field_J / var9;
                if (1 != param5) {
                  if (param5 != 2) {
                    break L3;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= this.field_H.a(param1 + 11)) {
                        if (-1 >= (var11 ^ -1)) {
                          this.field_H.b(var11, 1);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + this.field_H.a(var12, (byte) -116);
                          var13 = var13 * var13;
                          if ((var13 ^ -1) > (var10 ^ -1)) {
                            var11 = var12;
                            var10 = var13;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  this.field_H.b(var8_int, (byte) -3);
                  break L3;
                }
              }
              stackIn_20_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var8);

            stackIn_25_1 = new StringBuilder().append("hf.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0 != 0;
        } else {
          return stackIn_22_0 != 0;
        }
    }

    final int a(byte param0, int param1) {
        if (-1 < (param1 ^ -1) || this.field_H.a(12) <= param1) {
            return -1;
        }
        int var3 = -38 % ((-25 - param0) / 57);
        return this.field_H.a(param1, (byte) -110);
    }

    final static tj a(dj param0, String param1, String param2, dj param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        tj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param3.a(param1, (byte) 8);
            var6 = 124 / ((param4 - 40) / 57);
            var7 = param3.a(var5_int, param2, true);
            stackIn_1_0 = sn.a(var5_int, 90, param3, param0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("hf.L(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    public static void d(byte param0) {
        if (param0 >= -8) {
            return;
        }
        field_E = null;
    }

    final int a(int param0) {
        if (param0 >= -73) {
            field_E = (vn) null;
        }
        return this.field_H.a(12);
    }

    private hf() throws Throwable {
        throw new Error();
    }

    static {
        field_I = 0;
    }
}
