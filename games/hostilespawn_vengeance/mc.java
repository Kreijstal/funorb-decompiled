/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends vd implements qk {
    private String[] field_H;
    private ph[] field_M;
    private kn field_K;
    static be field_F;
    static String field_J;
    static int field_I;
    static String field_L;
    static int[] field_E;

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) 126, param3);
        if (!(param3 == 0)) {
            return;
        }
        if (param2 <= 42) {
            String[] var6 = (String[]) null;
            this.a((String[]) null, (byte) -47);
        }
        vm var5 = jd.field_s;
        if (null != this.field_H) {
            var5.a(fk.field_b, param1 - -this.field_v, this.field_m + param0, this.field_s, 20, 16777215, -1, 0, 0, var5.field_F + var5.field_y);
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (param2 ^ -1)) {
                stackIn_7_0 = this.a(param1, (byte) -120);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param2 != 99) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.b((byte) -26, param1);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("mc.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    final void a(String[] param0, byte param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        ti var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_z.d(5719);
              if (param0 == null) {
                break L1;
              } else {
                if (-1 == (param0.length ^ -1)) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  this.field_H = new String[var3_int];
                  var5 = -72 % ((61 - param1) / 62);
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= var3_int) {
                      var4 = new ti(jd.field_s, 0, 1);
                      this.field_M = new ph[1 + var3_int];
                      var7 = 0;
                      var5 = var7;
                      L3: while (true) {
                        if (var7 >= var3_int) {
                          this.field_M[var3_int] = new ph(oa.field_h, (mh) (this));
                          this.field_M[var3_int].field_h = (nn) ((Object) var4);
                          this.field_M[var3_int].a(100, 20 + 16 * var3_int + 16, 0, 0, 15);
                          this.a(51448, this.field_M[var3_int]);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_M[var7] = new ph(this.field_H[var7], (mh) (this));
                          this.field_M[var7].field_h = (nn) ((Object) var4);
                          this.field_M[var7].field_i = uk.field_b;
                          this.field_M[var7].a(80, 20 - -(16 * var7), 0, 0, 15);
                          this.a(51448, this.field_M[var7]);
                          var7++;
                          continue L3;
                        }
                      }
                    } else {
                      this.field_H[var4_int] = uj.a((CharSequence) ((Object) param0[var4_int]), 18719).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
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
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("mc.A(");

            if (param0 == null) {
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
          throw wg.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void j(int param0) {
        field_E = null;
        if (param0 > -123) {
            return;
        }
        field_J = null;
        field_F = null;
        field_L = null;
    }

    mc(kn param0) {
        super(0, 0, 0, 0, (nn) null);
        try {
            this.field_K = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "mc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (this.field_H.length <= var6_int) {
                L2: {
                  if (this.field_M[this.field_H.length] != param3) {
                    break L2;
                  } else {
                    this.field_K.a(false);
                    break L2;
                  }
                }
                var6_int = 83 / ((param4 - -63) / 52);
                break L0;
              } else {
                L3: {
                  if (this.field_M[var6_int] == param3) {
                    this.field_K.a(true, this.field_H[var6_int]);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("mc.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
    }

    static {
        field_F = new be(1);
        field_J = "MISSION ";
        field_L = "Get to the lift before the explosives detonate.";
        field_I = 0;
    }
}
