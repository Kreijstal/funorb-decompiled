/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static int[][] field_a;
    private boolean field_f;
    static String field_b;
    static int[] field_e;
    private String field_g;
    static String field_d;
    static int field_c;

    final String a(int param0) {
        int var2 = 43 / ((param0 - 63) / 45);
        return this.field_g;
    }

    gd(String param0) {
        this(param0, false);
    }

    final boolean c(int param0) {
        if (param0 != 1) {
          this.field_g = (String) null;
          return this.field_f;
        }
        return this.field_f;
    }

    public static void b(int param0) {
        if (param0 != 25284) {
          return;
        }
        field_d = null;
        field_b = null;
        field_e = null;
        field_a = (int[][]) null;
    }

    gd(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_g = param0;
          stackIn_4_1 = (param1);
          this.field_f = stackIn_4_1;
          if (this.field_g == null) {
            this.field_g = "";
          }
          if (this.field_g.length() != 0) {
            return;
          }
          this.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gd.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, ci[] param1, int param2, int param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Terraphoenix.field_V;
        try {
          if (param3 < 114) {
            return;
          }
          if (param1 != null &&
            param4 > 0) {
            var5_int = param1[0].field_q;
            var6 = param1[2].field_q;
            var7 = param1[1].field_q;
            param1[0].b(param2, param0);
            param1[2].b(param2 + param4 - var6, param0);
            l.b(vl.field_e);
            l.i(param2 + var5_int, param0, param2 - (-param4 + var6), param0 + param1[1].field_u);
            var8 = param2 + var5_int;
            var9 = -var6 + (param2 + param4);
            for (param2 = var8; var9 > param2; param2 = param2 + var7) {
              param1[1].b(param2, param0);
            }
            l.a(vl.field_e);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("gd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = "Back";
        field_a = new int[640][480];
        field_d = "Names can only contain letters, numbers, spaces and underscores";
        field_e = new int[8192];
    }
}
