/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static vm field_m;
    boolean field_h;
    int field_l;
    boolean field_i;
    boolean field_g;
    boolean field_a;
    int field_j;
    static int field_c;
    boolean field_b;
    int[] field_o;
    int field_e;
    boolean field_n;
    boolean field_k;
    boolean field_f;
    int field_d;

    public static void b(int param0) {
        field_m = null;
        if (param0 != 0) {
          ql.b(70);
        }
    }

    final static boolean a(ld param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 100) {
            field_m = (vm) null;
          }
          stackIn_5_0 = (param0.c((byte) -119, 1) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ql.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 < -64) {
          aj.field_c.field_o = 0;
          aj.field_c.field_j = 0;
          return;
        }
        ld var2 = (ld) null;
        ql.a((ld) null, (byte) 45);
        aj.field_c.field_o = 0;
        aj.field_c.field_j = 0;
    }

    final static gj a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        gj stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          if (!param0) {
            field_m = (vm) null;
          }
          var2_int = param1.length();
          var3 = 0;
          while (true) {
            if (var2_int <= var3) {
              stackIn_12_0 = vh.field_f;
              return stackIn_12_0;
            }
            var4 = param1.charAt(var3);
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
          return (gj) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("ql.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var9 = 0;
        int var10 = 0;
        int var3 = nm.a(param0, (byte) -128);
        int var4 = j.a(param0, -121);
        int var5 = nm.a(param1, (byte) 85);
        int var6 = j.a(param1, -31);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        if (param2 >= 89) {
          var9 = (int)((long)var5 * (long)var4 >> 16);
          var10 = (int)((long)var6 * (long)var4 >> 16);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
        ql.b(-98);
        var9 = (int)((long)var5 * (long)var4 >> 16);
        var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    ql() {
        this.field_o = new int[6];
    }

    static {
    }
}
