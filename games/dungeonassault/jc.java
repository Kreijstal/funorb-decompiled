/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static java.awt.Color field_d;
    static String field_b;
    static int[] field_f;
    static cn field_c;
    static int field_e;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        int var7Lifetime2;
        var8 = DungeonAssault.field_K;
        try {
          var6_int = wh.field_g.field_d;
          if (param3 == param4) {
            param2 = param2 + var6_int;
            param0 = param0 - var6_int;
          }
          jh.c();
          if (2 == param5) {
            param0 = param0 - var6_int;
          }
          gf.e(param1, param2, 8 + param1, param0 + param2);
          for (var7 = 0; var7 < param0; var7 = var7 + be.field_o.field_b) {
            be.field_o.b(param1, param2 + var7);
          }
          jh.b();
          if (2 == param3) {
            ac.field_w.j(param1, -var6_int + param2);
          }
          if (param5 == 2) {
            ac.field_w.h(param1, param0 + param2);
          }
          if (1 == param3) {
            for (var7Lifetime1 = 0; 8 > var7Lifetime1; var7Lifetime1++) {
              gf.d(param1, var7Lifetime1 + param2, 8, 0, -(var7Lifetime1 * 24) + 192);
            }
          }
          if (1 != param5) {
            return;
          }
          for (var7Lifetime2 = 0; var7Lifetime2 < 8; var7Lifetime2++) {
            gf.d(param1, param2 + (param0 - 1) - var7Lifetime2, 8, 0, 192 - var7Lifetime2 * 24);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var6), "jc.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        int var2 = 82 % ((-4 - param1) / 40);
        if (param0 == 160) {
          return true;
        }
        if (32 == param0) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        if (param0 != 45) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
          field_c = (cn) null;
        }
    }

    static {
        field_b = "<col=8B8B2E>Flee</col> - Attempt to avoid combat";
        field_d = new java.awt.Color(10040319);
        field_e = 0;
        field_a = "Renown lost: ";
    }
}
