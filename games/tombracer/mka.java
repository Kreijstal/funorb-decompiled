/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mka {
    private int field_c;
    private int field_d;
    private csa field_e;
    private csa field_g;
    static jea field_b;
    private ir field_a;
    private ir field_h;
    private int field_f;

    final void a(int param0, byte param1, la param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_a.field_f = -this.field_a.field_f;
            this.a(param0, param3, (byte) -100);
            this.field_f = dfa.a(-this.field_f, 8192, 111);
            if (param1 == -61) {
              if (this.field_e != null) {
                this.field_e.a(param2, 1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("mka.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(csa param0, int param1) {
        try {
            this.field_e = param0;
            param0.a(this.field_g, this.field_d, (byte) -52);
            param0.a(1434528720, this.field_a.field_d, this.field_a.field_f);
            int var3_int = -62 / ((param1 - 30) / 49);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mka.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ir c(byte param0) {
        if (param0 < 103) {
            this.field_h = (ir) null;
            return this.field_a;
        }
        return this.field_a;
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 8192) {
          L0: {
            mka.a((byte) -112);
            if (uu.field_a.field_Ab != rb.field_r) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (uu.field_a.field_Ab != rb.field_r) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, int param1) {
        if ((param1 ^ -1) != (msa.field_a ^ -1)) {
            return;
        }
        if (null == rba.field_a) {
            return;
        }
        v.b(param0, 0);
    }

    final void a(int param0, int param1, csa param2) {
        try {
            this.field_g = param2;
            int var4_int = 19 / ((param0 - 76) / 46);
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mka.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 36 / ((-63 - param0) / 42);
    }

    final int a(boolean param0) {
        if (param0) {
            this.a(false);
            return this.field_f;
        }
        return this.field_f;
    }

    final int b(byte param0) {
        if (param0 != -125) {
            this.field_h = (ir) null;
            return this.field_c;
        }
        return this.field_c;
    }

    final csa a(int param0) {
        int var2 = 89 % ((28 - param0) / 54);
        return this.field_e;
    }

    mka(int param0, int param1, int param2, int param3, int param4) {
        this.field_a = new ir(param0, param1);
        this.field_c = param4;
        this.field_f = param3;
        this.field_h = new ir();
        this.field_e = null;
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = -53 % ((9 - param2) / 58);
        this.field_h.field_f = this.field_a.field_f * param1 - param0 * this.field_a.field_d;
        this.field_h.field_d = param0 * this.field_a.field_f - -(param1 * this.field_a.field_d);
    }

    final static boolean a(dh param0, int param1, dh param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.field_a < param2.field_a) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 13) {
                  break L1;
                } else {
                  field_b = (jea) null;
                  break L1;
                }
              }
              if (param0.field_a != param2.field_a) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (param2.field_c > param0.field_c) {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("mka.H(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    static {
    }
}
