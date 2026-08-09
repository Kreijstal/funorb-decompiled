/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends hp implements hh {
    static String field_J;
    static String field_I;
    private ri field_K;
    static vo field_L;
    private an[] field_G;
    private String[] field_H;
    static int field_F;

    public static void b(boolean param0) {
        field_I = null;
        if (param0) {
            return;
        }
        field_J = null;
        field_L = null;
    }

    kn(ri param0) {
        super(0, 0, 0, 0, (io) null);
        try {
            this.field_K = param0;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, byte param1) {
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
        dp var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              this.field_x.b(97);
              if (param0 == null) {
                break L1;
              } else {
                if (-1 == (param0.length ^ -1)) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  this.field_H = new String[var3_int];
                  if (param1 > 18) {
                    var4_int = 0;
                    L2: while (true) {
                      if (var4_int >= var3_int) {
                        var4 = new dp(ia.field_e, 0, 1);
                        this.field_G = new an[var3_int + 1];
                        var5 = 0;
                        L3: while (true) {
                          if (var3_int <= var5) {
                            this.field_G[var3_int] = new an(mm.field_j, (sk) (this));
                            this.field_G[var3_int].field_h = (io) ((Object) var4);
                            this.field_G[var3_int].a(52, 20 - -((1 + var3_int) * 16), 0, 100, 15);
                            this.a(this.field_G[var3_int], 10);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            this.field_G[var5] = new an(this.field_H[var5], (sk) (this));
                            this.field_G[var5].field_h = (io) ((Object) var4);
                            this.field_G[var5].field_s = sj.field_b;
                            this.field_G[var5].a(-94, 16 * var5 + 20, 0, 80, 15);
                            this.a(this.field_G[var5], 10);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        this.field_H[var4_int] = nh.a((CharSequence) ((Object) param0[var4_int]), 126).replace(' ', ' ');
                        var4_int++;
                        continue L2;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            this.field_H = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("kn.E(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, 0);
        if (!(param3 == param1)) {
            return;
        }
        rb var5 = ia.field_e;
        if (null != this.field_H) {
            var5.a(ic.field_Q, param2 - -this.field_k, param0 - -this.field_j, this.field_i, 20, 16777215, -1, 0, 0, var5.field_I - -var5.field_x);
        }
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(-126, param1, param2, param3)) {
              if (98 == param1) {
                stackIn_6_0 = this.b((byte) 119, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5_int = -57 / ((param0 - -83) / 32);
                if (-100 == (param1 ^ -1)) {
                  stackIn_10_0 = this.a(1, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
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
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("kn.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        String[] var8 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (this.field_H.length <= var6_int) {
                L2: {
                  if (param1 == -6) {
                    break L2;
                  } else {
                    var8 = (String[]) null;
                    this.a((String[]) null, (byte) -97);
                    break L2;
                  }
                }
                L3: {
                  if (this.field_G[this.field_H.length] != param2) {
                    break L3;
                  } else {
                    this.field_K.a(param1 + 127);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (this.field_G[var6_int] == param2) {
                    this.field_K.a((byte) 103, this.field_H[var6_int]);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("kn.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_I = "Humans captured: ";
        field_J = "You have <%0> unread messages!";
        field_L = new vo();
        field_F = 0;
    }
}
