/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc implements ml {
    static int field_e;
    static boolean field_f;
    private int field_c;
    static boolean field_d;
    static String field_h;
    private int field_a;
    static int[] field_b;
    private ta field_g;

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        String discarded$2 = null;
        int discarded$3 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        java.applet.Applet var12 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 >= 19) {
                break L1;
              } else {
                var12 = (java.applet.Applet) null;
                discarded$2 = lc.a((java.applet.Applet) null, (byte) 96);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1.field_g) {
                  break L3;
                } else {
                  if (param1.b((byte) 127)) {
                    break L3;
                  } else {
                    stackOut_5_0 = 2188450;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
              }
              stackOut_6_0 = 3249872;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            }
            L4: {
              var6_int = stackIn_7_0;
              discarded$3 = this.field_g.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_s + "</u>", param3 + param1.field_r, param1.field_e + param2, param1.field_l, param1.field_p, var6_int, -1, this.field_a, this.field_c, this.field_g.field_C + this.field_g.field_D);
              if (!param1.b((byte) 75)) {
                break L4;
              } else {
                L5: {
                  L6: {
                    var7 = this.field_g.a(param1.field_s);
                    var8 = this.field_g.field_C - -this.field_g.field_D;
                    var9 = param3 + param1.field_r;
                    if (2 != this.field_a) {
                      break L6;
                    } else {
                      var9 = var9 + (-var7 + param1.field_l);
                      if (var11 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if ((this.field_a ^ -1) == -2) {
                    var9 = var9 + (-var7 + param1.field_l >> 1722042721);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  L8: {
                    var10 = param2 - -param1.field_e;
                    if (-3 == (this.field_c ^ -1)) {
                      break L8;
                    } else {
                      if (this.field_c != 1) {
                        break L7;
                      } else {
                        var10 = var10 + (-var8 + param1.field_p >> 722015393);
                        if (var11 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  var10 = var10 + (param1.field_p + -var8);
                  break L7;
                }
                hk.a(var9 - 2, var10 - -2, 117, 4 + var7, var8);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var6);
            stackOut_19_1 = new StringBuilder().append("lc.C(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            int var10 = 0;
            int var11 = 0;
            String stackIn_11_0 = null;
            String stackIn_19_0 = null;
            String stackIn_21_0 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_10_0 = null;
            String stackOut_20_0 = null;
            String stackOut_18_0 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var8 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param0.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (mf.a(-26159, "getcookies", param0));
                    var5 = ma.a(param1 + 213, ';', var4);
                    var6 = 0;
                    L2: while (true) {
                      L3: {
                        if (var5.length <= var6) {
                          break L3;
                        } else {
                          var7 = var5[var6].indexOf('=');
                          var11 = -1;
                          var10 = var7 ^ -1;
                          if (var8 != 0) {
                            if (var10 == var11) {
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              decompiledRegionSelector0 = 2;
                              break L1;
                            }
                          } else {
                            L4: {
                              if (var10 > var11) {
                                break L4;
                              } else {
                                if (var5[var6].substring(0, var7).trim().equals(var3)) {
                                  stackOut_10_0 = var5[var6].substring(1 + var7).trim();
                                  stackIn_11_0 = stackOut_10_0;
                                  decompiledRegionSelector0 = 3;
                                  break L1;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var6++;
                            if (var8 == 0) {
                              continue L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    if (decompiledRegionSelector0 == 0) {
                      if (param1 == -89) {
                        break L6;
                      } else {
                        break L7;
                      }
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        break L6;
                      } else {
                        if (decompiledRegionSelector0 == 2) {
                          break L7;
                        } else {
                          decompiledRegionSelector1 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  field_d = false;
                  break L6;
                }
                if (null == e.field_c) {
                  stackOut_20_0 = param0.getParameter("settings");
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  stackOut_18_0 = e.field_c;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) (var2_ref);
                stackOut_22_1 = new StringBuilder().append("lc.A(");
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param0 == null) {
                  stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L8;
                } else {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L8;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_19_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_21_0;
              } else {
                return stackIn_11_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(ad param0, boolean param1, ad param2, int param3, ad param4) {
        try {
            if (param3 != 3249872) {
                field_b = (int[]) null;
            }
            bb.field_a = ia.a(-66, "");
            bb.field_a.b(16564, false);
            lh.a(param2, param0, param4, param3 + -3249767);
            oi.a(-2);
            ed.field_c = di.field_a;
            ch.field_d = di.field_a;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "lc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public lc() {
        this.field_a = 1;
        this.field_c = 1;
        this.field_g = t.field_z;
    }

    lc(ta param0, int param1, int param2) {
        try {
            this.field_c = param2;
            this.field_g = param0;
            this.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 >= -112) {
            field_f = true;
        }
    }

    static {
        field_d = false;
    }
}
