/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends l {
    int field_i;
    static int field_h;
    static rm[] field_g;

    public static void a(int param0) {
        if (param0 != 17) {
            field_h = 99;
            field_g = null;
            return;
        }
        field_g = null;
    }

    hj(int param0) {
        this.field_i = param0;
    }

    final static rm a(eh param0, int param1, int param2) {
        RuntimeException var3 = null;
        eh var4 = null;
        rm stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (mm.a(10332, param1, param0)) {
              L1: {
                if (param2 == 12) {
                  break L1;
                } else {
                  var4 = (eh) null;
                  hj.a((eh) null, -36, 3);
                  break L1;
                }
              }
              stackIn_6_0 = bk.a(121);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("hj.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, jc param1, int param2, int param3, int param4) {
        try {
            param1.a(param4, 84);
            param1.a((byte) -73, 17);
            param1.a((byte) -100, param3);
            param1.a((byte) -94, param0);
            param1.a(param2, 66);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "hj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static km c(int param0) {
        if (param0 < 43) {
            field_h = 95;
            return wm.field_r.field_Jb;
        }
        return wm.field_r.field_Jb;
    }

    static {
        field_h = 0;
    }
}
