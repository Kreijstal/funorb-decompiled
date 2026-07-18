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
        IllegalArgumentException var1 = null;
        qe var2 = null;
        qe stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        qe stackOut_3_0 = null;
        try {
          var1_int = 0;
          L0: while (true) {
            var2 = w.field_y.a(var1_int, false);
            if (var2.field_y) {
              stackOut_3_0 = (qe) var2;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var1_int++;
              continue L0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (ln.field_q) {
            return td.field_b.a(nj.field_f, ke.field_a, false);
        }
        if (un.field_l) {
            return vl.b(102, 15, 13);
        }
        if (hn.a(13, 15, 0)) {
            return true;
        }
        if (!(!lh.field_g)) {
            return false;
        }
        return go.a(12, -35, 13);
    }

    final boolean d(int param0) {
        if (param0 <= 35) {
            String discarded$0 = ((fl) this).b((byte) 37);
            return ((fl) this).field_d;
        }
        return ((fl) this).field_d;
    }

    final static void a(byte param0) {
        int var1 = 0;
        wa.field_c.e((byte) 54);
        var1 = -119 / ((param0 - -55) / 51);
        if (null == cn.field_b) {
          cn.field_b = new ko(wa.field_c, wp.field_a);
          wa.field_c.b(-6183, (ng) (Object) cn.field_b);
          return;
        } else {
          wa.field_c.b(-6183, (ng) (Object) cn.field_b);
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 != -20425) {
            fl.a((byte) -122);
            return ((fl) this).field_a;
        }
        return ((fl) this).field_a;
    }

    final void a(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 0) {
          L0: {
            field_g = null;
            ((fl) this).field_d = true;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((fl) this).field_a = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            ((fl) this).field_d = true;
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((fl) this).field_a = stackIn_4_1 != 0;
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    final String b(byte param0) {
        int var2 = 63 / ((param0 - 28) / 50);
        return ((fl) this).field_e;
    }

    fl(String param0) {
        ((fl) this).field_d = false;
        ((fl) this).field_a = false;
        try {
            ((fl) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "fl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Ignore";
        field_f = "Names cannot contain consecutive spaces";
    }
}
