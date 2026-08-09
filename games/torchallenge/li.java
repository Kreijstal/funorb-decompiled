/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends kj implements sg {
    static boolean field_N;
    static int field_K;
    static String[] field_J;
    private ng[] field_L;
    private String[] field_M;
    private tb field_P;
    static java.applet.Applet field_O;

    final void a(int param0, String[] param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        me var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_F.a(param0 ^ 8671);
              if (param1 == null) {
                break L1;
              } else {
                if (-1 != (param1.length ^ -1)) {
                  var3_int = param1.length;
                  this.field_M = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      var4 = new me(oe.field_g, 0, 1);
                      this.field_L = new ng[var3_int - -1];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var3_int) {
                          L4: {
                            if (param0 == -6620) {
                              break L4;
                            } else {
                              var7 = (String) null;
                              li.a((byte) -109, (String) null);
                              break L4;
                            }
                          }
                          this.field_L[var3_int] = new ng(ee.field_y, (gg) (this));
                          this.field_L[var3_int].field_q = (j) ((Object) var4);
                          this.field_L[var3_int].a((byte) 118, 0, 15, 100, 16 - -(var3_int * 16) + 20);
                          this.a(param0 + 6620, this.field_L[var3_int]);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_L[var5] = new ng(this.field_M[var5], (gg) (this));
                          this.field_L[var5].field_q = (j) ((Object) var4);
                          this.field_L[var5].field_r = aa.field_c;
                          this.field_L[var5].a((byte) 116, 0, 15, 80, 20 + var5 * 16);
                          this.a(param0 ^ -6620, this.field_L[var5]);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      this.field_M[var4_int] = jl.a(TorChallenge.a(param0, 6625), (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_M = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("li.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param0 == -82) {
              L1: while (true) {
                if (var2_int >= param1.length()) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var3 = param1.charAt(var2_int);
                    if (bk.a(32191, (char) var3)) {
                      break L2;
                    } else {
                      if (qb.a((char) var3, true)) {
                        break L2;
                      } else {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("li.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                this.field_L = (ng[]) null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (this.field_M.length <= var6_int) {
                L3: {
                  if (param0 != this.field_L[this.field_M.length]) {
                    break L3;
                  } else {
                    this.field_P.a(-23128);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (this.field_L[var6_int] == param0) {
                    this.field_P.a(this.field_M[var6_int], -95);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("li.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            String var2 = (String) null;
            li.a((byte) -66, (String) null);
        }
        field_O = null;
        field_J = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
            return;
        }
        eg var5 = oe.field_g;
        if (!(this.field_M == null)) {
            var5.a(dg.field_Y, this.field_m + param1, this.field_i + param0, this.field_p, 20, 16777215, -1, 0, 0, var5.field_K + var5.field_x);
        }
    }

    li(tb param0) {
        super(0, 0, 0, 0, (j) null);
        try {
            this.field_P = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 >= 9) {
              if (!super.a(param0, param1, (byte) 38, param3)) {
                if (98 == param0) {
                  stackIn_9_0 = this.a(param3, (byte) -16);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-100 == (param0 ^ -1)) {
                    stackIn_13_0 = this.b(95, param3);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
                }
              } else {
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("li.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    static {
        field_J = new String[]{"Master 1", "Master 2", "Master 3"};
    }
}
