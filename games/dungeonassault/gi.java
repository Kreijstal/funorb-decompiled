/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ii implements vg {
    private mg field_N;
    static int[] field_L;
    static String[] field_K;
    static String field_P;
    private String[] field_M;
    static java.awt.Canvas field_R;
    private ck[] field_O;
    static String field_Q;
    static uo field_S;

    final void a(byte param0, String[] param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        oa var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              this.field_B.b(-4);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length != 0) {
                  var3_int = param1.length;
                  var4 = -105 / ((-51 - param0) / 49);
                  this.field_M = new String[var3_int];
                  var5_int = 0;
                  L2: while (true) {
                    if (var5_int >= var3_int) {
                      var5 = new oa(lp.field_C, 0, 1);
                      this.field_O = new ck[var3_int - -1];
                      var6 = 0;
                      L3: while (true) {
                        if (var3_int <= var6) {
                          this.field_O[var3_int] = new ck(li.field_i, (pg) (this));
                          this.field_O[var3_int].field_o = (ca) ((Object) var5);
                          this.field_O[var3_int].b(0, 100, 16 + (16 * var3_int + 20), 0, 15);
                          this.b((byte) -117, this.field_O[var3_int]);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_O[var6] = new ck(this.field_M[var6], (pg) (this));
                          this.field_O[var6].field_o = (ca) ((Object) var5);
                          this.field_O[var6].field_i = ln.field_c;
                          this.field_O[var6].b(0, 80, var6 * 16 + 20, 0, 15);
                          this.b((byte) -123, this.field_O[var6]);
                          var6++;
                          continue L3;
                        }
                      }
                    } else {
                      this.field_M[var5_int] = kl.a((CharSequence) ((Object) param1[var5_int]), (byte) -49).replace(' ', ' ');
                      var5_int++;
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
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("gi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void f(byte param0) {
        field_K = null;
        field_S = null;
        field_P = null;
        if (param0 >= -27) {
            return;
        }
        field_R = null;
        field_Q = null;
        field_L = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        se var5 = lp.field_C;
        if (!(null == this.field_M)) {
            var5.a(sc.field_p, param1 + this.field_q, param3 + this.field_v, this.field_x, 20, 16777215, -1, 0, 0, var5.field_E + var5.field_H);
        }
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param1 == 98) {
                break L1;
              } else {
                this.field_O = (ck[]) null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (this.field_M.length <= var6_int) {
                L3: {
                  if (param0 == this.field_O[this.field_M.length]) {
                    this.field_N.a(125);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param0 != this.field_O[var6_int]) {
                    break L4;
                  } else {
                    this.field_N.a((byte) -67, this.field_M[var6_int]);
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
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("gi.FA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    gi(mg param0) {
        super(0, 0, 0, 0, (ca) null);
        try {
            this.field_N = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, (byte) 125)) {
              if (98 != param2) {
                if (-100 != (param2 ^ -1)) {
                  if (param3 >= 55) {
                    stackIn_13_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = this.a((byte) -5, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a(param0, (byte) 71);
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

            stackIn_16_1 = new StringBuilder().append("gi.W(");

            if (param0 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0 != 0;
              } else {
                return stackIn_13_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_P = "Corrosive Slime";
        field_K = new String[]{"Scout", "Scout next room. (Single use)"};
        field_L = new int[8192];
        field_Q = "<col=2E5D17>Advance</col> - Engage monster";
    }
}
