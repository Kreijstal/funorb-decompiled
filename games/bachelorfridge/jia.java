/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jia extends k {
    static String field_l;
    private int field_n;
    static java.applet.Applet field_m;
    private int field_k;

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -71) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (var4_int != 0) {
                if (var4_int == 1) {
                  ((jia) this).field_n = param1.b(16711935);
                  break L2;
                } else {
                  L3: {
                    if (var4_int != 2) {
                      break L3;
                    } else {
                      L4: {
                        stackOut_10_0 = this;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (1 != param1.b(param0 ^ -16711866)) {
                          stackOut_12_0 = this;
                          stackOut_12_1 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L4;
                        } else {
                          stackOut_11_0 = this;
                          stackOut_11_1 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          break L4;
                        }
                      }
                      ((jia) this).field_f = stackIn_13_1 != 0;
                      break L3;
                    }
                  }
                  break L2;
                }
              } else {
                ((jia) this).field_k = param1.b(16711935);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("jia.E(").append(param0).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
    }

    public static void b() {
        field_l = null;
        field_m = null;
    }

    public jia() {
        super(1, false);
        ((jia) this).field_n = 1;
        ((jia) this).field_k = 1;
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][][] var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18_int = 0;
        int[] var18 = null;
        int[] var19 = null;
        int var19_int = 0;
        int[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int[][] var37 = null;
        int[][][] var38 = null;
        int[][] var45 = null;
        int[][][] var46 = null;
        int[][] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[][][] var54 = null;
        int[][] var55 = null;
        L0: {
          var23 = BachelorFridge.field_y;
          var53 = ((jia) this).field_h.a(param1, -858);
          var45 = var53;
          var37 = var45;
          var29 = var37;
          var3 = var29;
          if (!param0) {
            break L0;
          } else {
            ((jia) this).field_k = -49;
            break L0;
          }
        }
        L1: {
          if (((jia) this).field_h.field_b) {
            var4 = ((jia) this).field_n + ((jia) this).field_n - -1;
            var5 = 65536 / var4;
            var6 = 1 + ((jia) this).field_k + ((jia) this).field_k;
            var7 = 65536 / var6;
            var54 = new int[var4][][];
            var46 = var54;
            var38 = var46;
            var30 = var38;
            var8 = var30;
            var9_int = param1 - ((jia) this).field_n;
            L2: while (true) {
              if (((jia) this).field_n + param1 < var9_int) {
                var9 = var53[0];
                var10 = var53[1];
                var11 = var53[2];
                var12 = 0;
                L3: while (true) {
                  if (var12 >= hh.field_d) {
                    break L1;
                  } else {
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    L4: while (true) {
                      if (var4 <= var16) {
                        var9[var12] = var5 * var13 >> 16;
                        var10[var12] = var5 * var14 >> 16;
                        var11[var12] = var15 * var5 >> 16;
                        var12++;
                        continue L3;
                      } else {
                        var55 = var54[var16];
                        var14 = var14 + var55[1][var12];
                        var13 = var13 + var55[0][var12];
                        var15 = var15 + var55[2][var12];
                        var16++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var48 = ((jia) this).a((byte) -59, 0, var9_int & it.field_r);
                var52 = new int[3][hh.field_d];
                var12 = 0;
                var13 = 0;
                var14 = 0;
                var51 = var48[0];
                var50 = var48[1];
                var49 = var48[2];
                var18_int = -((jia) this).field_k;
                L5: while (true) {
                  if (((jia) this).field_k < var18_int) {
                    var18 = var52[0];
                    var19 = var52[1];
                    var20 = var52[2];
                    var21 = 0;
                    L6: while (true) {
                      if (var21 >= hh.field_d) {
                        var8[-param1 + var9_int - -((jia) this).field_n] = var52;
                        var9_int++;
                        continue L2;
                      } else {
                        var18[var21] = var7 * var12 >> 16;
                        var19[var21] = var7 * var13 >> 16;
                        var20[var21] = var14 * var7 >> 16;
                        var22 = -((jia) this).field_k + var21 & wp.field_r;
                        var13 = var13 - var50[var22];
                        var21++;
                        var14 = var14 - var49[var22];
                        var12 = var12 - var51[var22];
                        var22 = var21 + ((jia) this).field_k & wp.field_r;
                        var13 = var13 + var50[var22];
                        var14 = var14 + var49[var22];
                        var12 = var12 + var51[var22];
                        continue L6;
                      }
                    }
                  } else {
                    var19_int = var18_int & wp.field_r;
                    var14 = var14 + var49[var19_int];
                    var13 = var13 + var50[var19_int];
                    var12 = var12 + var51[var19_int];
                    var18_int++;
                    continue L5;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    final static void a(po param0, mla param1, int param2, byte param3, String param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L1: while (true) {
              if (var7 >= param4.length()) {
                L2: {
                  if (param3 < -63) {
                    break L2;
                  } else {
                    field_l = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var8 = param4.charAt(var7);
                  if (60 != var8) {
                    break L3;
                  } else {
                    var6 = (var5_int >> 8) + (param1.field_a[0] - -param0.a(param4.substring(0, var7)));
                    break L3;
                  }
                }
                L4: {
                  if (-1 == var6) {
                    L5: {
                      if (32 != var8) {
                        break L5;
                      } else {
                        var5_int = var5_int + param2;
                        break L5;
                      }
                    }
                    param1.field_a[var7] = param1.field_a[0] + (var5_int >> 8) + param0.a(param4.substring(0, var7 - -1)) + -param0.a((char) var8);
                    break L4;
                  } else {
                    param1.field_a[var7] = var6;
                    break L4;
                  }
                }
                L6: {
                  if (var8 == 62) {
                    var6 = -1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("jia.D(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
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
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          L9: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                if (param1 >= -64) {
                    field_m = null;
                }
                rha.field_d = param0;
                try {
                    var3 = param2.getParameter("cookieprefix");
                    var4 = param2.getParameter("cookiehost");
                    var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                    if (!(param0.length() != 0)) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    ac.a("document.cookie=\"" + var5 + "\"", param2, 113);
                } catch (Throwable throwable) {
                }
                eha.a(-119, param2);
            } catch (RuntimeException runtimeException) {
                throw pe.a((Throwable) (Object) runtimeException, "jia.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int[][] var17 = null;
        int[] var18 = null;
        int[][] var19 = null;
        int[] var20 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[][] var23 = null;
        L0: {
          var14 = BachelorFridge.field_y;
          var3 = ((jia) this).field_j.a(param0, -1);
          if (!((jia) this).field_j.field_m) {
            break L0;
          } else {
            var4 = ((jia) this).field_n + (((jia) this).field_n + 1);
            var5 = 65536 / var4;
            var6 = 1 + ((jia) this).field_k - -((jia) this).field_k;
            var7 = 65536 / var6;
            var23 = new int[var4][];
            var21 = var23;
            var19 = var21;
            var17 = var19;
            var8 = var17;
            var9 = param0 - ((jia) this).field_n;
            L1: while (true) {
              if (var9 > param0 + ((jia) this).field_n) {
                var9 = 0;
                L2: while (true) {
                  if (hh.field_d <= var9) {
                    break L0;
                  } else {
                    var10 = 0;
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= var4) {
                        var3[var9] = var10 * var5 >> 16;
                        var9++;
                        continue L2;
                      } else {
                        var10 = var10 + var23[var11][var9];
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var10_ref_int__ = ((jia) this).a(0, it.field_r & var9, (byte) 107);
                var22 = new int[hh.field_d];
                var20 = var22;
                var18 = var20;
                var16 = var18;
                var11_ref_int__ = var16;
                var12 = 0;
                var13 = -((jia) this).field_k;
                L4: while (true) {
                  if (((jia) this).field_k < var13) {
                    var15 = 0;
                    var13 = var15;
                    L5: while (true) {
                      if (var15 >= hh.field_d) {
                        var8[-param0 + ((jia) this).field_n + var9] = var22;
                        var9++;
                        continue L1;
                      } else {
                        var11_ref_int__[var15] = var7 * var12 >> 16;
                        var12 = var12 - var10_ref_int__[-((jia) this).field_k + var15 & wp.field_r];
                        var15++;
                        var12 = var12 + var10_ref_int__[wp.field_r & var15 + ((jia) this).field_k];
                        continue L5;
                      }
                    }
                  } else {
                    var12 = var12 + var10_ref_int__[var13 & wp.field_r];
                    var13++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        L6: {
          if (param1 == 0) {
            break L6;
          } else {
            ((jia) this).field_n = -124;
            break L6;
          }
        }
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
