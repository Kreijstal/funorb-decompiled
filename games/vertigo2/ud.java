/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends gp {
    int[] field_C;
    char[] field_u;
    boolean field_y;
    static String field_E;
    int[] field_z;
    static cr field_A;
    static String field_w;
    static String field_t;
    String field_D;
    static cr field_x;
    char[] field_v;

    private final void a(int param0, int param1, ed param2) {
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        char stackIn_14_2 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 6267) {
            return;
          }
          if (param1 != 1) {
            if (param1 == 2) {
              var4_int = param2.h(-11);
              this.field_v = new char[var4_int];
              this.field_C = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_C[var5] = param2.a((byte) -11);
                var6 = param2.g(88);
                stackIn_19_0 = this.field_v;
                stackIn_19_1 = var5;
                if (var6 != 0) {
                  stackIn_20_2 = mn.a((byte) var6, 93);
                } else {
                  stackIn_20_2 = 0;
                }
                stackIn_19_0[stackIn_19_1] = (char) stackIn_20_2;
              }
            } else if (param1 == 3) {
              var4_int = param2.h(-11);
              this.field_z = new int[var4_int];
              this.field_u = new char[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_z[var5] = param2.a((byte) -11);
                var6 = param2.g(112);
                stackIn_13_0 = this.field_u;
                stackIn_13_1 = var5;
                if (var6 == 0) {
                  stackIn_14_2 = (char)0;
                } else {
                  stackIn_14_2 = mn.a((byte) var6, -48);
                }
                stackIn_13_0[stackIn_13_1] = stackIn_14_2;
              }
            } else {
              if (4 == param1) {
                this.field_y = true;
                return;
              }
            }
          } else {
            this.field_D = param2.f(param0 ^ 6395);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("ud.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void a(ed param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 != -1) {
            ud.b((byte) -4);
          }
          while (true) {
            var3_int = param0.h(-11);
            if (0 == var3_int) {
              return;
            }
            this.a(6267, var3_int, param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ud.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_w = null;
        field_E = null;
        field_t = null;
        field_A = null;
        field_x = null;
        if (param0 != -37) {
          ud.b((byte) -106);
        }
    }

    final void a(byte param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        int var2Lifetime1;
        if (param0 != 89) {
          ud.b((byte) -113);
        }
        if (this.field_z != null) {
          for (var2 = 0; this.field_z.length > var2; var2++) {
            this.field_z[var2] = om.a(this.field_z[var2], 32768);
          }
        }
        if (this.field_C != null) {
          var4 = 0;
          var2Lifetime1 = var4;
          while (this.field_C.length > var4) {
            this.field_C[var4] = om.a(this.field_C[var4], 32768);
            var4++;
          }
        }
    }

    ud() {
        this.field_y = false;
    }

    static {
        field_w = "Names can only contain letters, numbers, spaces and underscores";
        field_t = "<%0> would need a rating of <%1> to play with the current options.";
        field_E = "Show all private chat";
    }
}
