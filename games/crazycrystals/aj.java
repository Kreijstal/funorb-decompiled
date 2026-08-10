/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends ig {
    static int field_t;
    static f field_s;

    aj(f param0) {
        super((f) null, bd.field_n, param0, false);
        try {
            this.field_j = false;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "aj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        ef var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param3 = param3 + ia.field_i;
            var6 = go.field_l;
            param4 = param4 + ia.field_i;
            var7 = param2 + 48 * param3;
            var8 = go.field_l.a(param5, 148);
            if (param0 == 32293) {
              L1: {
                var9 = oe.field_a[2].field_s * oe.field_a[2].field_m + (oe.field_a[2].field_t + -param4) * 12;
                if (-1 < (var9 ^ -1)) {
                  var9 = -var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              var9 = 48 + -(param1 * (48 - var9) >> 1488094661);
              if (-49 < (var9 ^ -1)) {
                L2: {
                  if (16 > var9) {
                    var9 = (15 + -var9) * 64 / 16 * 259 - -16760896;
                    break L2;
                  } else {
                    var9 = 262913 * ((-(var9 * 64) + 3008) / 32);
                    break L2;
                  }
                }
                ((vc) ((Object) var6)).a(param5, 486, -((vc) ((Object) var6)).field_o + var7 + (18 + (-(var8 * 10) + 10)), 148, 1000, var9, -1, 0, 0, 20);
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
          L3: {
            var6_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6_ref);

            stackIn_14_1 = new StringBuilder().append("aj.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        try {
            param2[param0][param3] = this.b(param2, param0, (byte) -118, param3);
            if (param1 != 0) {
                field_t = -100;
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "aj.W(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void g(int param0) {
        if (param0 <= 6) {
            String var2 = (String) null;
            aj.a(-69, (String) null);
            field_s = null;
            return;
        }
        field_s = null;
    }

    final static si a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        si stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -91 % ((param0 - -46) / 45);
            if (sg.field_b != l.field_b) {
              L1: {
                if (sg.field_b != io.field_P) {
                  break L1;
                } else {
                  if (!param1.equals(ne.field_h)) {
                    break L1;
                  } else {
                    sg.field_b = tl.field_e;
                    stackIn_6_0 = nn.field_a;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              ne.field_h = param1;
              nn.field_a = null;
              sg.field_b = l.field_b;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("aj.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return (si) ((Object) stackIn_8_0);
        }
    }

    final static boolean e(byte param0) {
        int var1;
        var1 = 31 / ((72 - param0) / 39);
        if (eq.field_j >= 20) {
          if (kf.b(47)) {
            if (0 < kl.field_V) {
              if (ca.a((byte) 117)) {
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
        } else {
          return true;
        }
    }

    static {
        wb discarded$0 = new wb();
        field_s = (f) ((Object) new pj(-1, 0));
    }
}
