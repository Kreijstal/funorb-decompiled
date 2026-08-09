/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nia extends ci {
    static String field_m;

    final int[] c(int param0, int param1) {
        int[] var3;
        int var7;
        int var8;
        int var9;
        int[] var19;
        int[] var20;
        int[] var21;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var3 = this.field_i.a((byte) 23, param1);
          if (this.field_i.field_d) {
            var21 = this.c(0, -39, param1);
            var20 = this.c(1, -74, param1);
            var19 = this.c(2, -7, param1);
            var7 = 0;
            L1: while (true) {
              if (ns.field_g <= var7) {
                break L0;
              } else {
                var8 = var19[var7];
                if (-4097 == (var8 ^ -1)) {
                  var3[var7] = var21[var7];
                  var7++;
                  continue L1;
                } else {
                  if (var8 == 0) {
                    var3[var7] = var20[var7];
                    var7++;
                    continue L1;
                  } else {
                    var3[var7] = var20[var7] * (4096 - var8) + var8 * var21[var7] >> -996530996;
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (param0 == 1) {
          return var3;
        } else {
          return (int[]) null;
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3;
        int[] var7;
        int[] var8;
        int[] var9;
        int var16;
        int var17;
        int var19;
        int[][] var20;
        int[][] var21;
        int[][] var31;
        int[][] var50;
        int[][] var51;
        int[] var52;
        int[] var53;
        int[] var54;
        int[] var55;
        int[] var56;
        int[] var57;
        int[] var58;
        int var18;
        L0: {
          var19 = TombRacer.field_G ? 1 : 0;
          if (param1 == -1) {
            break L0;
          } else {
            nia.d(86);
            break L0;
          }
        }
        L1: {
          var31 = this.field_h.a(param0, (byte) 113);
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (!this.field_h.field_f) {
            break L1;
          } else {
            var52 = this.c(2, -104, param0);
            var50 = this.a(param0, 0, -1);
            var51 = this.a(param0, 1, param1 + 0);
            var7 = var31[0];
            var8 = var31[1];
            var9 = var31[2];
            var53 = var50[0];
            var54 = var50[1];
            var55 = var50[2];
            var56 = var51[0];
            var57 = var51[1];
            var58 = var51[2];
            var16 = 0;
            L2: while (true) {
              if (var16 >= ns.field_g) {
                break L1;
              } else {
                var17 = var52[var16];
                if (4096 != var17) {
                  var56 = var51[0];
                  if (0 == var17) {
                    var56 = var51[0];
                    var7[var16] = var56[var16];
                    var8[var16] = var57[var16];
                    var9[var16] = var58[var16];
                    var16++;
                    continue L2;
                  } else {
                    var18 = 4096 + -var17;
                    var7[var16] = var17 * var53[var16] - -(var56[var16] * var18) >> 1744457964;
                    var8[var16] = var18 * var57[var16] + var17 * var54[var16] >> 1406100780;
                    var9[var16] = var18 * var58[var16] + var55[var16] * var17 >> -1506313140;
                    var16++;
                    continue L2;
                  }
                } else {
                  var7[var16] = var53[var16];
                  var8[var16] = var54[var16];
                  var9[var16] = var55[var16];
                  var16++;
                  continue L2;
                }
              }
            }
          }
        }
        return var3;
    }

    final static iu a(cn param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        iu stackIn_1_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param0.b(param1, -7768);
            var6 = 88 / ((-9 - param3) / 60);
            var5 = param0.a(true, param2, var4_int);
            stackIn_1_0 = ot.a(var4_int, var5, param0, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("nia.D(");

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
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    public nia() {
        super(3, false);
    }

    final static void d(int param0) {
        tga.field_a = baa.field_d.field_i.field_d;
        tga.field_a.b(8192);
        iga.field_o = uja.a((byte) 65, tga.field_a);
        sw.k((byte) 94);
        hm.h((byte) 45);
        if (param0 != -25405) {
            String var2 = (String) null;
            nia.a((cn) null, (String) null, (String) null, 78);
        }
        rka.a(false);
        ina.a(tga.field_a, 0);
        ob.a(tga.field_a, 17186);
        wpa.a(tga.field_a, -90);
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 255) {
                break L1;
              } else {
                var10 = (byte[]) null;
                nia.a((byte[]) null, -10, 68, 102);
                break L1;
              }
            }
            var12 = new char[param2];
            var11 = var12;
            var4 = var11;
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (param2 <= var6) {
                stackIn_15_0 = new String(var12, 0, var5);
                break L0;
              } else {
                L3: {
                  var7 = 255 & param0[var6 + param1];
                  if (var7 != 0) {
                    L4: {
                      if (-129 < (var7 ^ -1)) {
                        break L4;
                      } else {
                        if (var7 >= 160) {
                          break L4;
                        } else {
                          L5: {
                            var8 = gha.field_a[var7 - 128];
                            if (0 != var8) {
                              break L5;
                            } else {
                              var8 = 63;
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        }
                      }
                    }
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = (char)var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4_ref);

            stackIn_18_1 = new StringBuilder().append("nia.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_15_0;
    }

    final void a(byte param0, uia param1, int param2) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                break L1;
              } else {
                L2: {
                  stackIn_3_0 = this;

                  if ((param1.h(255) ^ -1) != -2) {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 0;
                    break L2;
                  } else {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 1;
                    break L2;
                  }
                }
                ((nia) (this)).field_g = stackIn_4_1 != 0;
                break L1;
              }
            }
            L3: {
              if (param0 == 107) {
                break L3;
              } else {
                field_m = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("nia.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 > -118) {
            field_m = (String) null;
        }
        field_m = null;
    }

    static {
        field_m = "Invalid date";
    }
}
