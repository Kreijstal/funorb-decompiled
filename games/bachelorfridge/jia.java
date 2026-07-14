/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jia extends k {
    static String field_l;
    private int field_n;
    static java.applet.Applet field_m;
    private int field_k;

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (param0 == -71) {
            break L0;
          } else {
            field_m = null;
            break L0;
          }
        }
        L1: {
          var4 = param2;
          if (-1 != var4) {
            if (-2 == var4) {
              ((jia) this).field_n = param1.b(16711935);
              break L1;
            } else {
              if ((var4 ^ -1) != -3) {
                break L1;
              } else {
                L2: {
                  stackOut_9_0 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (1 != param1.b(param0 ^ -16711866)) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L2;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L2;
                  }
                }
                ((jia) this).field_f = stackIn_12_1 != 0;
                break L1;
              }
            }
          } else {
            ((jia) this).field_k = param1.b(16711935);
            break L1;
          }
        }
    }

    public static void b(boolean param0) {
        field_l = null;
        if (param0) {
            field_l = null;
        }
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
                        var9[var12] = var5 * var13 >> 464244016;
                        var10[var12] = var5 * var14 >> 1849367792;
                        var11[var12] = var15 * var5 >> -443855152;
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
                        var18[var21] = var7 * var12 >> -1666805520;
                        var19[var21] = var7 * var13 >> -1374346768;
                        var20[var21] = var14 * var7 >> 1976600848;
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        var5 = 0;
        var6 = -1;
        var7 = 1;
        L0: while (true) {
          if (var7 >= param4.length()) {
            L1: {
              if (param3 < -63) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var8 = param4.charAt(var7);
              if (60 != var8) {
                break L2;
              } else {
                var6 = (var5 >> 1459356680) + (param1.field_a[0] - -param0.a(param4.substring(0, var7)));
                break L2;
              }
            }
            L3: {
              if (-1 == var6) {
                L4: {
                  if (32 != var8) {
                    break L4;
                  } else {
                    var5 = var5 + param2;
                    break L4;
                  }
                }
                param1.field_a[var7] = param1.field_a[0] + (var5 >> 1335126280) + param0.a(param4.substring(0, var7 - -1)) + -param0.a((char) var8);
                break L3;
              } else {
                param1.field_a[var7] = var6;
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            if (param1 >= -64) {
                field_m = null;
            }
            rha.field_d = param0;
            try {
                var3 = param2.getParameter("cookieprefix");
                var4 = param2.getParameter("cookiehost");
                var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                if (!(-1 != (param0.length() ^ -1))) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ac.a("document.cookie=\"" + var5 + "\"", param2, 113);
            } catch (Throwable throwable) {
            }
            eha.a(-119, param2);
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
                        var3[var9] = var10 * var5 >> 1561463472;
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
                        var11_ref_int__[var15] = var7 * var12 >> -991203344;
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
