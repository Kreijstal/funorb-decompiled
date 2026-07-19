/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tj extends pe {
    private int field_K;
    static rc field_G;
    static volatile boolean field_F;
    static int field_J;
    boolean field_H;
    private wi field_E;
    static int field_I;

    private final int h(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -660264703) {
          return 75;
        } else {
          L0: {
            if (this.field_H) {
              if (this.field_E.f(param0 ^ -660264703) == this) {
                stackOut_5_0 = 256;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_6_0;
        }
    }

    abstract void b(int param0, int param1, int param2);

    boolean a(int param0) {
        if (param0 == 16) {
          this.field_K = this.h(-660264703);
          if (this.field_K == 0) {
            if (this.field_H) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        this.a(110, ik.field_K + -param1 >> -1705838399, param1, param2, dh.field_a + -param2 >> -1220694655);
        if (param0 != 6154) {
            String var5 = (String) null;
            discarded$0 = tj.a(-85, (String) null);
        }
    }

    final static boolean a(int param0, String param1) {
        Process discarded$2 = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
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
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            try {
              L1: {
                if (vh.field_k.startsWith("win")) {
                  L2: {
                    if (param0 > 81) {
                      break L2;
                    } else {
                      field_F = true;
                      break L2;
                    }
                  }
                  L3: {
                    if (param1.startsWith("http://")) {
                      break L3;
                    } else {
                      if (!param1.startsWith("https://")) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L4: while (true) {
                    if (param1.length() <= var3) {
                      discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2_ref2);
            stackOut_22_1 = new StringBuilder().append("tj.CB(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_19_0 != 0;
            }
          }
        }
    }

    boolean g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        if (param0 == 1) {
          L0: {
            var2 = this.h(-660264703);
            var3 = -this.field_K + var2;
            if (var3 > 0) {
              this.field_K = this.field_K + (-1 + (var3 - -8)) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 < (var3 ^ -1)) {
              this.field_K = this.field_K + (1 + (-16 + var3)) / 16;
              break L1;
            } else {
              break L1;
            }
          }
          if (this.field_K == 0) {
            if (-1 != (var2 ^ -1)) {
              return false;
            } else {
              L2: {
                if (this.field_H) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
              }
              return stackIn_14_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 != (this.field_K ^ -1)) {
          if ((this.field_K ^ -1) <= -257) {
            if (param2 != 0) {
              return;
            } else {
              this.b(this.field_o + param0, -1, this.field_l + param3);
              super.a(param0, param1 ^ 0, param2, param3);
              return;
            }
          } else {
            if (ei.field_n != null) {
              if (this.field_r <= ei.field_n.field_z) {
                if (this.field_n <= ei.field_n.field_p) {
                  ud.a(ei.field_n, false);
                  ed.d();
                  this.b(param1, -1, 0);
                  super.a(-this.field_o + -param0, 0, param2, -this.field_l + -param3);
                  bb.b(4);
                  ei.field_n.c(this.field_o + param0, param3 + this.field_l, this.field_K);
                  return;
                } else {
                  ei.field_n = new o(this.field_r, this.field_n);
                  ud.a(ei.field_n, false);
                  ed.d();
                  this.b(param1, -1, 0);
                  super.a(-this.field_o + -param0, 0, param2, -this.field_l + -param3);
                  bb.b(4);
                  ei.field_n.c(this.field_o + param0, param3 + this.field_l, this.field_K);
                  return;
                }
              } else {
                ei.field_n = new o(this.field_r, this.field_n);
                ud.a(ei.field_n, false);
                ed.d();
                this.b(param1, -1, 0);
                super.a(-this.field_o + -param0, 0, param2, -this.field_l + -param3);
                bb.b(4);
                ei.field_n.c(this.field_o + param0, param3 + this.field_l, this.field_K);
                return;
              }
            } else {
              ei.field_n = new o(this.field_r, this.field_n);
              ud.a(ei.field_n, false);
              ed.d();
              this.b(param1, -1, 0);
              super.a(-this.field_o + -param0, 0, param2, -this.field_l + -param3);
              bb.b(4);
              ei.field_n.c(this.field_o + param0, param3 + this.field_l, this.field_K);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        boolean discarded$0 = false;
        try {
            kk.field_yb = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            if (param0 != 3088) {
                String var6 = (String) null;
                discarded$0 = tj.a(-110, (String) null);
            }
            fa.a(var4, var2, false, var3, param1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "tj.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(boolean param0) {
        field_G = null;
        if (!param0) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            tj.a(82, (java.applet.Applet) null);
        }
    }

    final static String[] a(String param0, int param1, char param2) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var10 = (CharSequence) ((Object) param0);
              var3_int = ok.a(param2, var10, (byte) 75);
              var4 = new String[var3_int + 1];
              if (param1 == -22710) {
                break L1;
              } else {
                field_G = (rc) null;
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var3_int <= var7) {
                var4[var3_int] = param0.substring(var6);
                stackOut_9_0 = (String[]) (var4);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param2 == param0.charAt(var8)) {
                    incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param0.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L2;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("tj.DB(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final ub d(int param0) {
        ub var2 = super.d(param0);
        if (var2 != null) {
            return var2;
        }
        return (ub) (this);
    }

    tj(wi param0, int param1, int param2) {
        super(dh.field_a - param1 >> -682606527, -param2 + ik.field_K >> -660264703, param1, param2, (bf) null);
        try {
            this.field_H = false;
            this.field_E = param0;
            this.field_K = 0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_F = false;
        field_I = 0;
        field_G = new rc();
    }
}
