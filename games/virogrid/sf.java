/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends fd implements ta {
    static double field_M;
    private tg[] field_E;
    private String field_D;
    private int[] field_N;
    private int field_H;
    static String field_K;
    static eh field_O;
    static int field_I;
    static int field_F;
    static mg[][] field_J;
    private sh field_G;
    private e field_L;

    sf(sh param0, e param1, String param2) {
        super(0, 0, 288, 0, (ol) null);
        int var4_int = 0;
        this.field_H = 0;
        try {
            this.field_D = param2;
            this.field_L = param1;
            this.field_G = param0;
            var4_int = this.field_D != null ? this.field_L.a(this.field_D, 260, this.field_L.field_H) : 0;
            this.a(var4_int + 22, true, 0, 0, 288);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final tg a(cd param0, int param1, String param2) {
        tg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        tg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new tg(param2, param0);
              var4.field_w = (ol) ((Object) new hf());
              var5 = this.field_m - 2;
              this.a(this.field_m - -34, true, 0, 0, this.field_g);
              var4.a(30, true, var5, 7, -14 + this.field_g);
              this.a((fi) (var4), (byte) -78);
              if (param1 == 260) {
                break L1;
              } else {
                this.field_L = (e) null;
                break L1;
              }
            }
            stackIn_3_0 = (tg) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("sf.K(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        this.field_L.a(this.field_D, param1 - (-this.field_l - 14), this.field_u + param2 + 10, -28 + this.field_g, this.field_m, 16777215, -1, 0, 0, this.field_L.field_H);
    }

    final static int a(byte param0, String param1, e param2, int param3, String[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2.a(param1);
              if (param3 < var5_int) {
                break L1;
              } else {
                if (param1.indexOf("<br>") == -1) {
                  param4[0] = param1;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (param3 + var5_int + -1) / param3;
            param3 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            var9 = 0;
            L2: while (true) {
              if (var8 <= var9) {
                L3: {
                  if (var7 < var8) {
                    incrementValue$0 = var6;
                    var6++;
                    param4[incrementValue$0] = param1.substring(var7, var8).trim();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0 >= 119) {
                    break L4;
                  } else {
                    sf.a(-85);
                    break L4;
                  }
                }
                stackIn_27_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param1.charAt(var9);
                    if ((var10 ^ -1) == -33) {
                      break L6;
                    } else {
                      if (var10 == 45) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param1.substring(var7, var9 + 1).trim();
                  var12 = param2.a(var11);
                  if (var12 < param3) {
                    break L5;
                  } else {
                    incrementValue$1 = var6;
                    var6++;
                    param4[incrementValue$1] = var11;
                    var7 = var9 - -1;
                    break L5;
                  }
                }
                if (var10 == 62) {
                  L7: {
                    if (param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      param4[incrementValue$2] = param1.substring(var7, -3 + var9).trim();
                      var7 = 1 + var9;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var9++;
                  continue L2;
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("sf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L10;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_31_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_27_0;
        }
    }

    public static void a(int param0) {
        field_K = null;
        field_O = null;
        if (param0 <= 52) {
            field_J = (mg[][]) null;
        }
        field_J = (mg[][]) null;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        if (!(this.field_H < param1)) {
            return;
        }
        tg[] var7 = new tg[param1];
        tg[] var3 = var7;
        if (param0 != 4) {
            this.field_G = (sh) null;
        }
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < this.field_H; var5++) {
            var7[var5] = this.field_E[var5];
            var4[var5] = this.field_N[var5];
        }
        this.field_E = var3;
        this.field_N = var4;
        this.field_H = param1;
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (this.field_H <= var6_int) {
                  break L2;
                } else {
                  if (this.field_E[var6_int] != param1) {
                    var6_int++;
                    continue L1;
                  } else {
                    var7 = this.field_N[var6_int];
                    if ((var7 ^ -1) != 0) {
                      kf.a(this.field_N[var6_int], param0 + -12086);
                      break L2;
                    } else {
                      this.field_G.h(true);
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param0 == 12085) {
                  break L3;
                } else {
                  this.field_L = (e) null;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("sf.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                      param1.getAppletContext().showDocument(og.a(-1, param1, var2), "_top");
                      if (param0) {
                        break L2;
                      } else {
                        field_M = -0.07399320021683413;
                        break L2;
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_7_0 = (RuntimeException) (var2_ref2);

                stackIn_7_1 = new StringBuilder().append("sf.F(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L4;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L4;
                }
              }
              throw kg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, String param1, byte param2) {
        int var4_int = 0;
        try {
            if (param2 <= 125) {
                field_I = -104;
            }
            var4_int = this.field_H;
            this.a(4, 1 + var4_int);
            this.field_E[var4_int] = this.a((cd) (this), 260, param1);
            this.field_N[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_K = "Names can only contain letters, numbers, spaces and underscores";
        field_F = -1;
    }
}
