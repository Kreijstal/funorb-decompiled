/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends jj {
    static el field_r;
    static boolean field_y;
    static int field_v;
    static ah field_z;
    private Object field_x;
    static int field_q;
    static va field_u;
    static int field_w;
    static oa field_s;
    static String field_t;

    final boolean g(int param0) {
        int var2 = 119 % ((param0 - 1) / 61);
        return false;
    }

    final Object b(byte param0) {
        if (param0 != 66) {
            field_z = (ah) null;
        }
        return this.field_x;
    }

    public static void c(byte param0) {
        field_t = null;
        field_s = null;
        field_r = null;
        field_u = null;
        field_z = null;
        if (param0 != 109) {
            cf.c((byte) -112);
        }
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var3 = ld.a(false, param2, param0);
            if (var3 != null) {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if (var4 >= param0.length()) {
                  if (param1 != -28) {
                    field_r = (el) null;
                    stackIn_14_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  if (vb.a(332243496, param0.charAt(var4))) {
                    var4++;
                    continue L1;
                  } else {
                    stackIn_9_0 = od.field_r;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("cf.I(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return (String) ((Object) stackIn_14_0);
          }
        }
    }

    final static void h(int param0) {
        int var1 = -126 / ((10 - param0) / 43);
        go.a(0, 17);
    }

    cf(Object param0, int param1) {
        super(param1);
        try {
            this.field_x = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_y = false;
        field_v = 0;
        field_z = new ah();
        field_t = "Steer right";
    }
}
