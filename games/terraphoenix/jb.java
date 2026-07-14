/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jb {
    static int field_b;
    static java.awt.Frame field_e;
    static String field_c;
    static long[] field_d;
    static boolean field_a;

    abstract void a(int param0, java.awt.Component param1);

    abstract void a(java.awt.Component param0, byte param1);

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = bk.a((byte) 92, param1);
        var4 = im.a(param1, true);
        var5 = bk.a((byte) 92, param0);
        var6 = im.a(param0, true);
        if (param2 != 0) {
          field_e = null;
          var7 = (int)((long)var5 * (long)var3 >> -659587632);
          var8 = (int)((long)var3 * (long)var6 >> -1634163632);
          var9 = (int)((long)var4 * (long)var5 >> 835714000);
          var10 = (int)((long)var4 * (long)var6 >> 2070043152);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var7 = (int)((long)var5 * (long)var3 >> -659587632);
          var8 = (int)((long)var3 * (long)var6 >> -1634163632);
          var9 = (int)((long)var4 * (long)var5 >> 835714000);
          var10 = (int)((long)var4 * (long)var6 >> 2070043152);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    final static ck a(int param0, int param1, int param2, int param3, byte param4, he param5) {
        java.awt.Frame var6 = null;
        ck var7 = null;
        java.awt.Frame var8 = null;
        var8 = ph.a(param5, param1, param3, param0, 10, param2);
        var6 = var8;
        if (var8 != null) {
          var7 = new ck();
          if (param4 <= 82) {
            return null;
          } else {
            var7.field_e = var8;
            java.awt.Component discarded$2 = var7.field_e.add((java.awt.Component) (Object) var7);
            var7.setBounds(0, 0, param1, param0);
            var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    abstract int a(int param0);

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0) {
            field_a = true;
        }
    }

    final static void a(byte param0) {
        ji var1 = null;
        uc var2 = null;
        var1 = (ji) (Object) vc.field_d.d(9272);
        if (var1 == null) {
          gb.g(-17464);
          return;
        } else {
          if (param0 >= -125) {
            return;
          } else {
            var2 = mk.field_j;
            int discarded$8 = var2.f((byte) -107);
            int discarded$9 = var2.f((byte) -107);
            int discarded$10 = var2.f((byte) -107);
            int discarded$11 = var2.f((byte) -107);
            var1.b((byte) 12);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = "FINAL SCORE";
        field_d = new long[32];
        field_a = true;
    }
}
