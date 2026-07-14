/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends ng {
    static int field_A;
    static long field_z;
    static String field_D;
    static char[] field_E;
    static String field_C;

    private ah(pk param0, int param1) {
        super(param0, param1);
    }

    ah(int param0) {
        this(qk.field_e, param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Terraphoenix.field_V;
        l.d(param3, param4, 1 + param2, 10000536);
        l.d(param3, param4 + param0, 1 + param2, 12105912);
        int var5 = 1;
        if (var5 + param4 < l.field_d) {
            var5 = -param4 + l.field_d;
        }
        int var6 = param0;
        if (var6 + param4 > l.field_c) {
            var6 = l.field_c + -param4;
        }
        if (param1 != 128) {
            return;
        }
        for (var7 = var5; var7 < var6; var7++) {
            var8 = 48 * var7 / param0 + 152;
            var9 = var8 | (var8 << -1156248568 | var8 << -1392096912);
            l.field_i[param3 + (param4 - -var7) * l.field_k] = var9;
            l.field_i[param3 + (l.field_k * (param4 - -var7) - -param2)] = var9;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ji var4 = null;
        var3 = Terraphoenix.field_V;
        if (param0 == 48) {
          var4 = (ji) (Object) vc.field_d.d(9272);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              nc.a(var4, 75, param1);
              var4 = (ji) (Object) vc.field_d.e((byte) -119);
              continue L0;
            }
          }
        } else {
          field_E = null;
          var4 = (ji) (Object) vc.field_d.d(9272);
          L1: while (true) {
            if (var4 == null) {
              return;
            } else {
              nc.a(var4, 75, param1);
              var4 = (ji) (Object) vc.field_d.e((byte) -119);
              continue L1;
            }
          }
        }
    }

    final String b(gl param0, int param1) {
        if (param1 != 32032) {
            field_D = null;
            return uh.a(0, param0.field_o.length(), '*');
        }
        return uh.a(0, param0.field_o.length(), '*');
    }

    final static mj a(String param0, int param1, int param2) {
        ql var3 = null;
        if (param2 != -23891) {
            field_D = null;
            var3 = new ql();
            ((mj) (Object) var3).field_d = param0;
            ((mj) (Object) var3).field_b = param1;
            return (mj) (Object) var3;
        }
        var3 = new ql();
        ((mj) (Object) var3).field_d = param0;
        ((mj) (Object) var3).field_b = param1;
        return (mj) (Object) var3;
    }

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            mj discarded$0 = ah.a((String) null, -18, -98);
            field_D = null;
            field_E = null;
            field_C = null;
            return;
        }
        field_D = null;
        field_E = null;
        field_C = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new char[128];
        field_C = "Soldier-A";
        field_D = "ACT II, Invasion";
    }
}
