/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends nl {
    static String field_I;
    static String field_H;
    static int field_L;
    static tp field_J;
    static int[] field_K;

    final void b(boolean param0) {
        this.field_E.e(0);
        if (!param0) {
          field_I = (String) null;
        }
    }

    qm(int param0, int param1, int param2, int param3, kh param4, kb param5) {
        super(param0, param1, param2, param3, param4, (qo) null);
        try {
          this.field_E = param5;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "qm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 > -82) {
          return;
        }
        if (0 != param3) {
          if (this.field_l == 0) {
            return;
          }
          if (this.field_w != 0) {
            t.field_c.a(this.field_p + param1 + this.field_w, this.field_B + param0 + this.field_l, this.field_p + param1, -101, this.field_B + param0);
            this.field_E.a(this.field_B + param0, this.field_p + param1, (byte) -110, param3);
            t.field_c.a(58);
            return;
          }
          return;
        }
        if (this.field_k == null) {
          if (this.field_l == 0) {
            return;
          }
          if (this.field_w != 0) {
            t.field_c.a(this.field_p + param1 + this.field_w, this.field_B + param0 + this.field_l, this.field_p + param1, -101, this.field_B + param0);
            this.field_E.a(this.field_B + param0, this.field_p + param1, (byte) -110, param3);
            t.field_c.a(58);
            return;
          }
          return;
        }
        this.field_k.a((kb) (this), param0, -102, true, param1);
        if (this.field_l == 0) {
          return;
        }
        if (this.field_w != 0) {
          t.field_c.a(this.field_p + param1 + this.field_w, this.field_B + param0 + this.field_l, this.field_p + param1, -101, this.field_B + param0);
          this.field_E.a(this.field_B + param0, this.field_p + param1, (byte) -110, param3);
          t.field_c.a(58);
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 103) {
            field_J = (tp) null;
          }
          stackIn_6_0 = (this.b(1, param1, param5, param0, param2)) && (super.a(param0, param1, param2, 127, param4, param5, param6));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("qm.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_H = null;
        if (param0 >= 38) {
          field_J = null;
          field_I = null;
          field_K = null;
          return;
        }
        field_K = (int[]) null;
        field_J = null;
        field_I = null;
        field_K = null;
    }

    static {
        field_I = "Map size: ";
        field_L = 0;
        field_H = "This game has started.";
    }
}
