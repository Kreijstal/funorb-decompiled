/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ln {
    static int[] field_c;
    static String[] field_a;
    static int field_b;

    final int a(long param0, int param1) {
        long var4 = this.a((byte) -112);
        if (var4 <= (long)param1) {
          return this.a(-99, param0);
        }
        ld.a(var4, (byte) 122);
        return this.a(-99, param0);
    }

    final static aa a(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        am var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Exception var7 = null;
        int var8 = 0;
        dm var9 = null;
        var8 = ZombieDawn.field_J;
        var2 = -59 / ((param1 + 17) / 52);
        var3 = fj.field_g;
        var4 = var3.d((byte) -128);
        cg.field_e = 127 & var4;
        stackIn_3_0 = ((var4 & 128) != 0);
        vi.field_d = stackIn_3_0;
        ei.field_J = var3.d((byte) -125);
        ce.field_s = var3.c(true);
        if (cg.field_e != 2) {
          td.field_a = 0;
          ep.field_i = 0;
        } else {
          ep.field_i = var3.f(2);
          td.field_a = var3.g(-1875);
        }
        stackIn_9_0 = (1 != var3.d((byte) -115)) ? 0 : 1;
        var5 = stackIn_9_0;
        ea.field_b = var3.a(true);
        if (var5 != 0) {
          af.field_a = var3.a(true);
        } else {
          af.field_a = ea.field_b;
        }
        if (cg.field_e == 1) {
          var3.f(2);
          var3.a(true);
        } else {
          if (cg.field_e == 4) {
            var3.f(2);
            var3.a(true);
          }
        }
        if (!param0) {
          ge.field_a = jj.a(80, -23171, var3);
          vk.field_d = null;
          return new aa(param0);
        }
        var6 = var3.f(2);
        try {
          var9 = pa.field_y.a(75, var6);
          ge.field_a = var9.e(80);
          if (!af.field_a.equals(ce.field_r)) {
            stackIn_22_0 = var9.field_u;
          } else {
            stackIn_22_0 = null;
          }
          vk.field_d = stackIn_22_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = (Exception) (Object) decompiledCaughtException;
          ae.a((Throwable) ((Object) var7), 10331, "CC1");
          vk.field_d = null;
          ge.field_a = null;
          return new aa(param0);
        }
        return new aa(param0);
    }

    abstract void a(boolean param0);

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -5) {
          field_b = -64;
        }
    }

    abstract long a(byte param0);

    abstract int a(int param0, long param1);

    final static void a(int param0, int param1, String param2, String[] param3) {
        int var5 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ZombieDawn.field_J;
        try {
          fk.field_F = hm.field_H;
          if (param0 != 255) {
            if (param0 < 100) {
              mp.field_f = te.a(param2, -13466, param0);
            } else {
              if (param0 <= 105) {
                mp.field_f = ao.a(param3, -91);
              } else {
                mp.field_f = te.a(param2, -13466, param0);
              }
            }
          } else {
            stackIn_4_0 = 5;
            stackIn_5_1 = !(ae.field_a >= 13);
            mp.field_f = fl.a(stackIn_4_0, stackIn_5_1);
          }
          if (param1 == -14) {
            return;
          }
          field_c = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ln.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_b = 0;
        field_c = new int[]{};
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
