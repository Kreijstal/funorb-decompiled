/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends fc {
    private int field_m;
    private int field_j;
    static boolean field_i;
    static String field_k;
    static int[] field_l;
    private int field_n;
    static int field_o;

    final void d(int param0) {
        int var5 = 0;
        int var2;
        int var3;
        int var4;
        qj var6;
        int var7;
        int var8;
        var8 = TrackController.field_F ? 1 : 0;
        var2 = this.field_n;
        var3 = 0;
        if (param0 != 18132) {
          field_l = (int[]) null;
        }
        while (var3 < v.field_g.length) {
          var2 = var2 - v.field_g[var3];
          if (0 <= var2) {
            var3++;
            continue;
          }
          var4 = 64;
          for (var5 = 3; var5 >= 0; var5--) {
            var6 = hk.field_a[var5 + 4 * var3];
            var7 = Math.min(255, (1 + var5) * var4);
            if (v.field_g.length - 1 == var3) {
              var7 = var7 + (1 + var2) * var4 / v.field_g[var3];
            }
            var6.d(-(var6.field_s / 2) + this.field_j, -(var6.field_v / 2) + this.field_m, var7);
          }
          return;
        }
        return;
    }

    final static oi a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        oi stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (!param1) {
            field_l = (int[]) null;
          }
          var3 = 0;
          while (true) {
            if (var3 >= var2_int) {
              stackIn_12_0 = fh.field_e;
              return stackIn_12_0;
            }
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (var4 <= 57) {
              var3++;
              continue;
            }
            break;
          }
          stackIn_9_0 = null;
          return (oi) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("u.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 <= 36) {
          return;
        }
        field_k = null;
        field_l = null;
    }

    u(int param0, int param1) {
        this.field_m = param1;
        this.field_j = param0;
    }

    final boolean e(int param0) {
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        int var2 = fieldTemp$0;
        for (var3 = param0; var3 < v.field_g.length; var3++) {
          var2 = var2 - v.field_g[var3];
          if (var2 < 0) {
            return true;
          }
        }
        return false;
    }

    static {
        field_o = -1;
        field_l = new int[8192];
        field_k = ": ";
    }
}
