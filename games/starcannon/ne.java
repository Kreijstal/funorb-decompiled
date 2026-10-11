/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ne {
    int field_g;
    int field_f;
    static long field_d;
    static td field_l;
    int field_h;
    static String field_i;
    static rk field_c;
    int field_b;
    int field_k;
    int field_e;
    static String field_a;
    static long field_j;

    final static void a(boolean param0, String param1, String param2, int param3) {
        try {
          if (param3 != 150) {
            ne.a(-9, -29);
          }
          lc.field_hb = param2;
          sd.field_b = param1;
          sc.a(param0, (byte) 93, bl.field_c);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ne.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    abstract void c(int param0, int param1);

    final static void b(int param0, int param1) {
        if (param1 == 150) {
          mg.a((byte) -78);
          return;
        }
        String var3 = (String) null;
        ne.a(false, (String) null, (String) null, 49);
        mg.a((byte) -78);
    }

    public static void a(int param0) {
        field_l = null;
        field_c = null;
        if (param0 <= -83) {
          field_i = null;
          field_a = null;
          return;
        }
        String var2 = (String) null;
        ne.a(false, (String) null, (String) null, -118);
        field_i = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        if (param1 >= 6) {
          kk.field_a = param0 * 100 / 150;
          kk.field_c = param0 * 400 / 150;
          kk.field_e = (param0 << 16) / 150;
          return;
        }
        field_l = (td) null;
        kk.field_a = param0 * 100 / 150;
        kk.field_c = param0 * 400 / 150;
        kk.field_e = (param0 << 16) / 150;
    }

    abstract void a(int param0, int param1, int param2);

    final static int a(boolean param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = StarCannon.field_A;
        try {
          var2_int = param1.length();
          var3 = 0;
          if (param0) {
            stackIn_3_0 = -84;
            return stackIn_3_0;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3 = ma.a(-128, param1.charAt(var4)) - var3 + (var3 << 5);
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("ne.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_i = "Game over";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_c = new rk();
    }
}
