/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends ana {
    static js field_v;
    static sna field_w;

    private final void d(int param0) {
        if (param0 != 256) {
          oi.f(28);
        }
    }

    final static void a(int param0, kv[] param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          oja.field_f = param1;
          if (null != oja.field_f &&
            3 > param1.length) {
            throw new IllegalArgumentException("");
          }
          if (param0 != 3) {
            oi.a(-85, -83, -101, -96);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("oi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        int var2 = -107 / ((param0 - 71) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (this.field_l == 25) {
            jja.a(256, -1, 48);
            this.e(48);
          }
          return false;
        }
        this.d(256);
        return true;
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        wia var4;
        int var5;
        kv[] var6;
        var5 = BachelorFridge.field_y;
        for (var2 = 0; this.field_q.field_h.field_z > var2; var2++) {
          for (var3 = 0; var3 < this.field_q.field_h.field_B; var3++) {
            var4 = this.field_q.field_h.field_a[var2][var3];
            if (var4.c(-123)) {
              this.field_q.b(param0 + 30948, var2, var3);
            }
          }
        }
        if (param0 != 48) {
          var6 = (kv[]) null;
          oi.a(25, (kv[]) null);
        }
    }

    public static void f(int param0) {
        if (param0 != -6887) {
          kv[] var2 = (kv[]) null;
          oi.a(-14, (kv[]) null);
        }
        field_w = null;
        field_v = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (!(dg.field_i < param1 + param2)) {
          return param2;
        }
        if (param2 + param0 - param1 >= 0) {
          return -param1 + (param0 + param2);
        }
        if (param3 != -21264) {
          oi.a(-72, -7, -102, 104);
        }
        return dg.field_i - param1;
    }

    oi(gj param0, vba param1) {
        super(param0, param1);
    }

    static {
    }
}
