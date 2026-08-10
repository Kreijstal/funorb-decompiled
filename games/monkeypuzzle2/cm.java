/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends ua implements ql {
    private String[] field_C;
    static String[] field_E;
    static le[] field_F;
    private t[] field_A;
    static te field_D;
    static String[] field_z;
    private sh field_H;
    static String field_B;
    static String field_G;

    final static void k(int param0) {
        if (!ad.a(false)) {
            return;
        }
        jk.a(-95, false, param0);
    }

    final static void a(int param0, byte param1) {
        hi.field_c = param0 >> 560186724 & 3;
        int var2 = 51 / ((param1 - -78) / 35);
        if (!((hi.field_c ^ -1) >= -3)) {
            hi.field_c = 2;
        }
        o.field_a = (14 & param0) >> 1729984962;
        if (2 < o.field_a) {
            o.field_a = 2;
        }
        ak.field_v = param0 & 3;
        if (!((ak.field_v ^ -1) >= -3)) {
            ak.field_v = 2;
        }
    }

    final void a(String[] param0, int param1) {
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
        lc var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_u.b((byte) 121);
              if (param0 == null) {
                break L1;
              } else {
                if (0 != param0.length) {
                  var3_int = param0.length;
                  this.field_C = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new lc(t.field_z, 0, 1);
                      this.field_A = new t[var3_int + 1];
                      if (param1 == 560186724) {
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= var3_int) {
                            this.field_A[var3_int] = new t(lf.field_b, (of) (this));
                            this.field_A[var3_int].field_h = (ml) ((Object) var4);
                            this.field_A[var3_int].a(15, 13361, 0, 100, var3_int * 16 + 36);
                            this.b((byte) -89, this.field_A[var3_int]);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            this.field_A[var5] = new t(this.field_C[var5], (of) (this));
                            this.field_A[var5].field_h = (ml) ((Object) var4);
                            this.field_A[var5].field_m = ad.field_j;
                            this.field_A[var5].a(15, 13361, 0, 80, 20 + var5 * 16);
                            this.b((byte) -104, this.field_A[var5]);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      this.field_C[var4_int] = pj.a((byte) 83, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_C = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("cm.J(");

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
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
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

    cm(sh param0) {
        super(0, 0, 0, 0, (ml) null);
        try {
            this.field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_F = null;
        field_E = null;
        field_G = null;
        if (param0 < 104) {
            field_G = (String) null;
        }
        field_B = null;
        field_z = null;
        field_D = null;
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, -20)) {
              if (98 != param2) {
                if (99 != param2) {
                  var5_int = -16 % ((param3 - 37) / 50);
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.b(param0, false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a((byte) 88, param0);
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
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("cm.V(");

            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
            return;
        }
        ta var5 = t.field_z;
        if (!(this.field_C == null)) {
            var5.a(dh.field_a, this.field_r + param3, param2 + this.field_e, this.field_l, 20, 16777215, -1, 0, 0, var5.field_C - -var5.field_D);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 7) {
                break L1;
              } else {
                cm.d((byte) 77);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (this.field_C.length <= var6_int) {
                L3: {
                  if (param4 != this.field_A[this.field_C.length]) {
                    break L3;
                  } else {
                    this.field_H.a(param3 ^ 207);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param4 == this.field_A[var6_int]) {
                    this.field_H.a(this.field_C[var6_int], -94);
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

            stackIn_15_1 = new StringBuilder().append("cm.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static void a(int param0) {
        le var1 = null;
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1 = new le(540, 140);
            mc.a(param0 + -8512, var1);
            ig.b();
            ge.d();
            uj.field_i = 0;
            ec.b(-128);
            var2 = var1.d();
            var3 = 0;
            L1: while (true) {
              if ((var3 ^ -1) <= -16) {
                L2: {
                  ca.field_f.e();
                  var1.e(0, 0);
                  tj.b(653);
                  if (param0 == 15) {
                    break L2;
                  } else {
                    field_E = (String[]) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var2.e(-2, -2, 16777215);
                ge.b(4, 4, 0, 0, 540, 140);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "cm.B(" + param0 + ')');
        }
    }

    static {
        field_z = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_D = new te(4, 1, 1, 1);
        field_B = "Names should contain a maximum of 12 characters";
    }
}
