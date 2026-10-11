/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eq extends wf {
    private boolean field_f;
    wl field_g;
    static gh field_e;

    final static void a(byte param0, int param1) {
        int var3 = 0;
        uk var4 = null;
        oh var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        try {
          var4 = (uk) (v.field_b.d(268435455));
          while (var4 != null) {
            od.a(param1, (byte) -76, var4);
            var4 = (uk) (v.field_b.b((byte) 103));
          }
          if (param0 < 107) {
            eq.a((byte) 89, -36);
          }
          var5 = (oh) (fg.field_r.d(268435455));
          while (var5 != null) {
            ae.a(var5, param1, (byte) -15);
            var5 = (oh) (fg.field_r.b((byte) 103));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "eq.G(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 >= -109) {
          return false;
        }
        return this.field_f;
    }

    eq(wl param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "eq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(byte param0);

    public static void d(int param0) {
        field_e = null;
        if (param0 >= -36) {
          field_e = (gh) null;
        }
    }

    static {
    }
}
