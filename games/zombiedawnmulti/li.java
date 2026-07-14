/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends qc {
    static long field_A;
    int field_y;
    bq field_B;
    static String field_z;
    static pd field_E;
    static int field_C;
    byte[] field_D;

    final byte[] e(int param0) {
        Object var3 = null;
        if (!((li) this).field_t) {
          if (param0 != 0) {
            var3 = null;
            np discarded$2 = li.a((byte) 125, (ga) null);
            return ((li) this).field_D;
          } else {
            return ((li) this).field_D;
          }
        } else {
          throw new RuntimeException();
        }
    }

    public static void g(int param0) {
        field_E = null;
        field_z = null;
        if (param0 <= 60) {
            Object var2 = null;
            np discarded$0 = li.a((byte) 126, (ga) null);
        }
    }

    final int f(int param0) {
        if (((li) this).field_t) {
            return 0;
        }
        if (param0 != 100) {
            int discarded$0 = ((li) this).f(44);
            return 100;
        }
        return 100;
    }

    final static np a(byte param0, ga param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var2 = param1.d((byte) 69);
        var3 = param1.d((byte) 69);
        var4 = param1.g(31365);
        var5 = param1.i(-1478490344);
        var6 = param1.i(-1478490344);
        if (param0 != -119) {
          field_C = -55;
          var7 = param1.i(-1478490344);
          var8 = param1.i(-1478490344);
          var9 = param1.i(-1478490344);
          return new np(var2, var3, var4, var5, var6, var9, var7, var8);
        } else {
          var7 = param1.i(-1478490344);
          var8 = param1.i(-1478490344);
          var9 = param1.i(-1478490344);
          return new np(var2, var3, var4, var5, var6, var9, var7, var8);
        }
    }

    li() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Encouraging rule breaking";
    }
}
