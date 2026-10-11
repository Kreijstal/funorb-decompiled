/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends kd {
    static int[] field_j;
    static int[] field_k;
    static int[] field_l;
    int field_h;
    static int[] field_m;
    static be[] field_i;

    public static void a(int param0) {
        field_j = null;
        field_i = null;
        field_m = null;
        field_l = null;
        int var1 = 59 % ((-67 - param0) / 55);
        field_k = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            field_i = (be[]) null;
          }
          stackIn_3_0 = bh.a(false, param0, -84);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("bd.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    bd(int param0) {
        this.field_h = param0;
    }

    final static void a(int param0, int param1) {
        kd var2 = null;
        int var3 = 0;
        tg var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          var4 = (tg) (bg.field_c.a(true));
          while (var4 != null) {
            p.a(var4, param0, (byte) 24);
            var4 = (tg) (bg.field_c.f(2));
          }
          if (param1 != -4584) {
            return;
          }
          var2 = tl.field_h.a(true);
          while (var2 != null) {
            dd.a(53, param0);
            var2 = tl.field_h.f(2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "bd.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean c(boolean param0) {
        if (param0) {
          bd.a(110, 10);
          if (jc.field_b == null) {
            return false;
          }
          if (gg.field_b == uf.field_m) {
            return true;
          }
          return false;
        }
        if (jc.field_b == null) {
          return false;
        }
        if (gg.field_b == uf.field_m) {
          return true;
        }
        return false;
    }

    static {
        field_l = new int[128];
        field_j = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_k = new int[8192];
    }
}
