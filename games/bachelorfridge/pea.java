/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pea extends pp {
    static kv field_k;
    static String field_l;
    private int field_j;
    private int field_i;

    final void a(aga param0, op param1, int param2) {
        Object var4 = null;
        if (null != this.field_h) {
            var4 = this.field_h.a(116, param1);
        }
        if (var4 == null) {
            var4 = param1.c(this.field_j, this.field_i, 112);
        }
        if (var4 == null) {
            return;
        }
        if (param2 != 12) {
            return;
        }
        try {
            ((aga) (var4)).field_A = false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pea.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        field_l = null;
        if (param0 != 116) {
            pea.e((byte) -2);
            field_k = null;
            return;
        }
        field_k = null;
    }

    final void a(lu param0, byte param1) {
        try {
            int var3_int = 23 % ((param1 - 34) / 58);
            super.a(param0, (byte) 113);
            er.a(this.field_h, 115, param0);
            param0.d(this.field_j, 0);
            param0.d(this.field_i, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pea.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    pea(nq param0, int param1, int param2) {
        try {
            this.field_i = param2;
            this.field_h = param0;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "pea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void d(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (rn.field_s.field_g.field_m.length <= var1_int) {
                if (param0 > 113) {
                  break L0;
                } else {
                  pea.e((byte) 34);
                  return;
                }
              } else {
                rn.field_s.field_g.field_m[var1_int] = -1;
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "pea.B(" + param0 + ')');
        }
    }

    static {
        field_l = "Drag and drop some food into the fridge.";
    }
}
