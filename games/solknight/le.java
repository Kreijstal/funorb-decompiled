/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    int field_g;
    static String field_a;
    static String field_b;
    static volatile int field_f;
    int[] field_c;
    int field_e;
    static o[] field_d;

    final static void a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ah.field_e) {
            ah.field_e.f(true);
          }
          ve.field_a = new bb(param1, param2, false, true, true);
          gf.field_cb.c(-3399, ve.field_a);
          if (param0 <= -11) {
            return;
          }
          field_f = 70;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("le.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 < 39) {
          le.a(-71);
          if (this.field_c == null) {
            return 0;
          }
          if (0 != this.field_c.length) {
            return this.field_c[this.field_c.length - 1];
          }
          return 0;
        }
        if (this.field_c == null) {
          return 0;
        }
        if (0 != this.field_c.length) {
          return this.field_c[this.field_c.length - 1];
        }
        return 0;
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        if (null == this.field_c) {
          return 0;
        }
        if (this.field_c.length == 0) {
          return 0;
        }
        for (var3 = 1; this.field_c.length > var3; var3++) {
          if (param0 < (this.field_c[var3] + this.field_c[var3 - 1] >> 1)) {
            return -1 + var3;
          }
        }
        if (!param1) {
          return this.field_c.length - 1;
        }
        field_d = (o[]) null;
        return this.field_c.length - 1;
    }

    le(int param0, int param1, int param2) {
        this.field_g = param0;
        this.field_e = param1;
        this.field_c = new int[param2 + 1];
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -3390) {
          field_b = (String) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static void b(int param0) {
        m var1 = (m) (gg.field_b.a((byte) 51));
        if (var1 == null) {
          je.a(false);
          return;
        }
        jd var2 = te.field_N;
        var2.e(true);
        var2.e(true);
        var2.e(true);
        var2.e(true);
        var1.c(10);
        if (param0 == 873698625) {
          return;
        }
        le.a(-22);
    }

    static {
        field_f = -1;
        field_b = "EXCLUSIVE";
        field_a = "Close";
    }
}
