/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    private int field_b;
    static int[][] field_f;
    static iv field_d;
    private long field_a;
    static fta field_c;
    static String field_e;

    final gj b(int param0, int param1) {
        if (param0 != 0) {
          return (gj) null;
        }
        return gj.a((byte) 41, this.a(param1, -1));
    }

    final static void a(cn param0, int param1) {
        fg var2 = null;
        try {
          fg.b(param0.a("headers.packvorbis", (byte) 124, ""));
          var2 = fg.a(param0, "jagex logo2.packvorbis", "");
          var2.a();
          int var3 = -87 % ((param1 - 12) / 50);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ne.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        String var4 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = hua.a(param2, 0);
          if (!param0) {
            var4 = (String) null;
            ne.a(false, (String) null, (String) null);
          }
          if (-1 != param1.indexOf(param2)) {
            return true;
          }
          if (param1.indexOf(var3) != -1) {
            return true;
          }
          stackIn_14_0 = (param1.startsWith(param2)) || (param1.startsWith(var3)) || (param1.endsWith(param2)) || (param1.endsWith(var3));
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ne.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1) {
        if (param1 != -1) {
          this.field_b = -59;
          return (int)(this.field_a >> gj.field_f * param0) & 15;
        }
        return (int)(this.field_a >> gj.field_f * param0) & 15;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        if (param0 != 15) {
          field_d = (iv) null;
          field_f = (int[][]) null;
          return;
        }
        field_f = (int[][]) null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var1_int = c.field_g[0];
          var2 = 1;
          if (param0 >= -49) {
            var5 = (String) null;
            ne.a(true, (String) null, (String) null);
          }
          while (c.field_g.length > var2) {
            var3 = c.field_g[var2];
            lua.a(aia.field_t, var2 << 4, aia.field_t, var1_int, var3);
            var1_int = var1_int + var3;
            var2++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "ne.H(" + param0 + ')');
        }
    }

    final int b(byte param0) {
        int var2 = -110 % ((param0 + 27) / 42);
        return this.field_b;
    }

    private final void a(int param0, gj param1) {
        int fieldTemp$0 = 0;
        if (param0 != 1) {
          return;
        }
        try {
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          this.field_a = this.field_a | (long)(param1.field_i << fieldTemp$0 * gj.field_f);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ne.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ne(gj param0) {
        try {
          this.field_b = 1;
          this.field_a = (long)param0.field_i;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ne(gj[] param0) {
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.a(1, param0[var2_int]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ne.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_f = new int[][]{new int[]{0, -1}, new int[]{1, -1}, new int[]{1, 0}, new int[]{1, 1}, new int[]{0, 1}, new int[]{-1, 1}, new int[]{-1, 0}, new int[]{-1, -1}};
        field_c = new fta();
        field_e = "Icons are heavy, ugly, and probably belong in a museum. Dump these deadweights with <img=8><img=9> or save them for tons of points.";
    }
}
