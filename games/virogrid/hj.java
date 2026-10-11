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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!mm.a(10332, param1, param0)) {
            return null;
          }
          if (param2 != 12) {
            var4 = (eh) null;
            hj.a((eh) null, -36, 3);
          }
          stackIn_6_0 = bk.a(121);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hj.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
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
