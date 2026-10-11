/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends td {
    static int field_p;
    static kv field_r;
    static String field_q;

    public static void c(byte param0) {
        field_r = null;
        if (param0 != -91) {
          field_r = (kv) null;
        }
        field_q = null;
    }

    fb(int param0, aga param1) {
        super(param0, param1);
    }

    final ii a(op param0, int param1) {
        int var7_int = 0;
        fna stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        fna var4 = null;
        int[][] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int var8_int = 0;
        ko var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        aga var15 = null;
        int[][] var16 = null;
        int[] var17 = null;
        int[][] var18 = null;
        int[] var19 = null;
        int var6Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var12 = BachelorFridge.field_y;
        try {
          var15 = this.field_h.a(40, param0);
          var4 = new fna(this.field_g, new nq(var15));
          var18 = new int[param0.g((byte) 79)][2];
          var16 = var18;
          var5 = var16;
          var6 = 0;
          for (var7_int = 0; param0.field_d > var7_int; var7_int++) {
            for (var8_int = 0; 7 > var8_int; var8_int++) {
              if (this.a(param0.field_S[var7_int].field_b[var8_int], -8, param0)) {
                var5[var6] = new int[]{param0.field_S[var7_int].field_b[var8_int].field_x, param0.field_S[var7_int].field_b[var8_int].field_J};
                var6++;
              }
            }
          }
          var19 = new int[var18.length];
          var17 = var19;
          var7 = var17;
          var13 = 0;
          var8_int = var13;
          while (var13 < var19.length) {
            var19[var13] = var13;
            var13++;
          }
          var8 = new ko(new int[]{(int)f.b((byte) 73)});
          var6Lifetime1 = 0;
          for (var9 = 0; var19.length > var9; var9++) {
            var10 = var8.a(-21000, var19.length);
            var11 = var19[var10];
            var7[var10] = var19[var9];
            var19[var9] = var11;
          }
          var9Lifetime1 = 0;
          if (param1 != 3) {
            field_p = 40;
          }
          while (param0.field_d > var9Lifetime1) {
            var14 = 0;
            var10Lifetime1 = var14;
            while (var14 < 7) {
              if (this.a(param0.field_S[var9Lifetime1].field_b[var14], -8, param0)) {
                var4.field_o.a(new cn(new nq(param0.field_S[var9Lifetime1].field_b[var14]), var5[var19[var6Lifetime1]][0], var5[var19[var6Lifetime1]][1]), true);
                var6Lifetime1++;
              }
              var14++;
            }
            var9Lifetime1++;
          }
          stackIn_26_0 = var4;
          return (ii) ((Object) stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("fb.A(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(aga param0, int param1, op param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return false;
          }
          if (param0.i(param1 + 116)) {
            return false;
          }
          if (param0.a(32, (byte) 60)) {
            return false;
          }
          if (param1 != -8) {
            return false;
          }
          if (param2.b(false, param2.field_a[param0.field_x][param0.field_J].field_n) == -1) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("fb.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_q = "***No Target!***";
    }
}
