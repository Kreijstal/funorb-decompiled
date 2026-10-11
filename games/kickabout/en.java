/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en extends sr {
    static rv field_p;
    static int[] field_n;
    static int field_o;
    static long[] field_q;

    final int a(int param0) {
        if (param0 >= -69) {
          field_q = (long[]) null;
          return 2;
        }
        return 2;
    }

    en() {
    }

    public static void b(byte param0) {
        field_q = null;
        field_p = null;
        if (param0 != 38) {
          field_o = -26;
          field_n = null;
          return;
        }
        field_n = null;
    }

    final static int b(int param0, int param1) {
        int var2;
        param0 = param0 >> 9;
        if (param0 < 0) {
          param0++;
        }
        var2 = 0;
        if (param0 < -4) {
          var2 = var2 | 2;
        } else {
          if (4 < param0) {
            var2 = var2 | 2;
          }
        }
        if (param0 > -3 &&
          param0 < 3) {
          var2 = var2 | 8;
        }
        if (param0 < 0 &&
          param0 > -7) {
          var2 = var2 | 4;
        }
        if (param0 > 0 &&
          param0 < 7) {
          var2 = var2 | 1;
        }
        if (param1 != -25147) {
          return 14;
        }
        return var2;
    }

    final static void a(int param0, int param1) {
        ng.field_a = (param0 & 60) >> 4;
        q.field_b = (param0 & 14) >> 2;
        if (ng.field_a > 2) {
          ng.field_a = 2;
        }
        if (param1 != -1) {
          field_p = (rv) null;
        }
        if (2 < q.field_b) {
          q.field_b = 2;
        }
        fc.field_a = param0 & 3;
        if (fc.field_a <= 2) {
          return;
        }
        fc.field_a = 2;
    }

    final int a(int param0, Object param1, Object param2) {
        up var4 = null;
        RuntimeException var4_ref = null;
        up var5 = null;
        String var6 = null;
        String var7 = null;
        up var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = ((sp) (param1)).field_Sb;
          var4 = var8;
          var5 = ((sp) (param2)).field_Sb;
          if (param0 != 2) {
            en.b(83, 32);
          }
          var6 = ce.field_G[var8.field_q][var8.field_l];
          var7 = ce.field_G[var5.field_q][var5.field_l];
          stackIn_3_0 = var6.compareTo(var7) ^ this.field_i << 31;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("en.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        field_p = new rv();
        field_o = -1;
        field_q = new long[]{64356L, 63569L, 64749L};
        field_n = new int[64];
        for (var0 = 0; field_n.length > var0; var0++) {
          field_n[var0] = (var0 << 1) * 65793;
        }
    }
}
