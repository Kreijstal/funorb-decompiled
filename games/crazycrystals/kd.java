/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends se {
    static String field_i;
    static md field_n;
    static String field_m;
    static int[] field_j;
    static double[] field_l;
    private String field_p;
    static String field_k;
    private oo field_o;
    private boolean field_q;

    public static void e(byte param0) {
        field_l = null;
        if (param0 != -33) {
            return;
        }
        field_m = null;
        field_j = null;
        field_i = null;
        field_k = null;
        field_n = null;
    }

    final static void d(int param0) {
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = CrazyCrystals.field_B;
        try {
          L0: {
            if (md.l(-81)) {
              if (param0 == 3) {
                kf.field_h.a(eb.field_l, false, true, vl.field_a);
                kf.field_h.b(false);
                L1: while (true) {
                  if (!ge.b(-65)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    kf.field_h.a(pj.field_q, false, c.field_p);
                    continue L1;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L2: {
                if (ph.field_E == null) {
                  break L2;
                } else {
                  if (!ph.field_E.field_d) {
                    break L2;
                  } else {
                    no.e((byte) -23);
                    kf.field_h.b(-3264, new gn(kf.field_h, ab.field_A));
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "kd.E(" + param0 + ')');
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

    kd(ga param0, ga param1) {
        super(param0);
        this.field_p = "";
        this.field_q = false;
        try {
            this.field_o = new oo(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "kd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final oi a(String param0, byte param1) {
        e var3 = null;
        RuntimeException var3_ref = null;
        oi stackIn_3_0 = null;
        oi stackIn_7_0 = null;
        oi stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_o.a(param0, param1) == rk.field_c) {
              stackIn_3_0 = rk.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0.equals(this.field_p)) {
                  break L1;
                } else {
                  var3 = ke.a(param0, 28515);
                  if (var3.b(param1 ^ 82)) {
                    this.field_p = param0;
                    this.field_q = var3.a((byte) 47);
                    break L1;
                  } else {
                    stackIn_7_0 = ec.field_h;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (this.field_q) {
                  stackIn_12_0 = ih.field_b;
                  break L2;
                } else {
                  stackIn_12_0 = rk.field_c;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("kd.G(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_o.a(param0, (byte) -122) == rk.field_c) {
              stackIn_3_0 = this.field_o.a(param0, -21);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.a(param0, (byte) -122) != rk.field_c) {
                var3_int = -117 / ((41 - param1) / 49);
                stackIn_8_0 = rl.field_f;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = ai.field_l;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("kd.H(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    static {
        field_i = "Bomb";
        field_j = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_k = "This password contains your email address, and would be easy to guess";
        field_m = "This is a laser hub.<br>It beams lasers in all<br>directions. Be careful!";
    }
}
