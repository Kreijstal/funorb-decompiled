/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends sf {
    int field_K;
    static String field_G;
    static String field_F;
    static String[] field_N;
    static String field_L;
    static ck field_I;
    wl field_J;
    byte field_M;

    final int a(boolean param0) {
        if (param0) {
            return -110;
        }
        if (!(this.field_J != null)) {
            return 0;
        }
        return 100 * this.field_J.field_n / (-this.field_M + this.field_J.field_r.length);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void h(byte param0) {
        field_N = null;
        field_G = null;
        field_L = null;
        field_I = null;
        field_F = null;
        if (param0 < 78) {
            pj.d(-100);
        }
    }

    final byte[] g(byte param0) {
        if (!this.field_z) {
          if (this.field_J.field_r.length - this.field_M <= this.field_J.field_n) {
            if (param0 <= 65) {
              pj.d(9);
              return this.field_J.field_r;
            } else {
              return this.field_J.field_r;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static int d(int param0) {
        int var1 = -62 % ((param0 - 81) / 40);
        return ac.field_A;
    }

    final static void a(ve param0, byte param1) {
        ve var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            param0.b((byte) 108);
            if (param1 == -50) {
              var2 = (ve) ((Object) h.field_b.c((byte) -99));
              L1: while (true) {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    if (!var2.a(param0, false)) {
                      break L2;
                    } else {
                      var2 = (ve) ((Object) h.field_b.d(true));
                      continue L1;
                    }
                  }
                }
                if (var2 != null) {
                  stackIn_10_0 = 114;
                  fm.a((byte) stackIn_10_0, param0, var2);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  h.field_b.a(param0, 2777);
                  return;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2_ref);

            stackIn_14_1 = new StringBuilder().append("pj.E(");

            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        ul.field_d = param2;
        qk.field_d = param1;
        if (param0 != 31004) {
            pj.d(-44);
        }
    }

    pj() {
    }

    static {
        field_F = "This game option is only available to members.";
        field_G = "Add <%0> to ignore list";
        field_N = new String[16];
        field_L = "Enter name of player to add to list";
    }
}
