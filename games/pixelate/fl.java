/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    private String field_e;
    private boolean field_d;
    static int[] field_g;
    static String field_f;
    static String field_c;
    static fm field_b;
    private boolean field_a;

    final static qe c(int param0) {
        int var1_int = 0;
        qe var2 = null;
        qe stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -3060) {
                break L1;
              } else {
                fl.a((byte) 81);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              var2 = w.field_y.a(var1_int, false);
              if (var2.field_y) {
                stackIn_6_0 = (qe) (var2);
                break L0;
              } else {
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
        return stackIn_6_0;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (ln.field_q) {
            return td.field_b.a(nj.field_f, ke.field_a, false);
        }
        if (un.field_l) {
            return vl.b(102, param2, param1);
        }
        if (hn.a(param1, param2, param3)) {
            return true;
        }
        if (!(!lh.field_g)) {
            return false;
        }
        return go.a(param0, -35, param1);
    }

    final boolean d(int param0) {
        if (param0 <= 35) {
            this.b((byte) 37);
            return this.field_d;
        }
        return this.field_d;
    }

    final static void a(byte param0) {
        int var1;
        wa.field_c.e((byte) 54);
        var1 = -119 / ((param0 - -55) / 51);
        if (null == cn.field_b) {
          cn.field_b = new ko(wa.field_c, wp.field_a);
          wa.field_c.b(-6183, cn.field_b);
          return;
        } else {
          wa.field_c.b(-6183, cn.field_b);
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 != -20425) {
            fl.a((byte) -122);
            return this.field_a;
        }
        return this.field_a;
    }

    final void a(int param0, boolean param1) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 != 0) {
          L0: {
            field_g = (int[]) null;
            this.field_d = true;
            stackIn_7_0 = this;

            if (!param1) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((fl) (this)).field_a = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            this.field_d = true;
            stackIn_3_0 = this;

            if (!param1) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L1;
            }
          }
          ((fl) (this)).field_a = stackIn_4_1 != 0;
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_c = null;
        field_f = null;
        field_b = null;
        if (param0 != 0) {
            field_g = (int[]) null;
        }
    }

    final String b(byte param0) {
        int var2 = 63 / ((param0 - 28) / 50);
        return this.field_e;
    }

    fl(String param0) {
        this.field_d = false;
        this.field_a = false;
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Ignore";
        field_f = "Names cannot contain consecutive spaces";
    }
}
