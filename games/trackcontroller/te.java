/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends java.awt.Canvas {
    static mk field_b;
    private java.awt.Component field_a;

    public final void paint(java.awt.Graphics param0) {
        ((te) this).field_a.paint(param0);
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 70 / ((param0 - 34) / 33);
    }

    final static void a(byte param0) {
        if (!ge.field_D) {
          throw new IllegalStateException();
        } else {
          if (param0 >= -22) {
            field_b = null;
            bc.field_d = true;
            wg.a(-100, false);
            rl.field_N = 0;
            return;
          } else {
            bc.field_d = true;
            wg.a(-100, false);
            rl.field_N = 0;
            return;
          }
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        if (param0) {
          ug.a(82, (java.awt.Component) (Object) param1);
          ei.a((byte) -125, (java.awt.Component) (Object) param1);
          if (rd.field_l != null) {
            rd.field_l.a((java.awt.Component) (Object) param1, false);
            return;
          } else {
            return;
          }
        } else {
          int[] discarded$7 = te.a(-20, 81, -51);
          ug.a(82, (java.awt.Component) (Object) param1);
          ei.a((byte) -125, (java.awt.Component) (Object) param1);
          if (rd.field_l == null) {
            return;
          } else {
            rd.field_l.a((java.awt.Component) (Object) param1, false);
            return;
          }
        }
    }

    public final void update(java.awt.Graphics param0) {
        ((te) this).field_a.update(param0);
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = va.a(param2, (byte) -47);
        var4 = mi.a(2048, param2);
        var5 = va.a(param0, (byte) -47);
        var6 = mi.a(2048, param0);
        var7 = (int)((long)var3 * (long)var5 >> 476789200);
        var8 = (int)((long)var3 * (long)var6 >> -1437998960);
        if (param1 != 0) {
          int[] discarded$1 = te.a(-86, 13, 8);
          var9 = (int)((long)var5 * (long)var4 >> -203501744);
          var10 = (int)((long)var4 * (long)var6 >> -325455152);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var9 = (int)((long)var5 * (long)var4 >> -203501744);
          var10 = (int)((long)var4 * (long)var6 >> -325455152);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    te(java.awt.Component param0) {
        ((te) this).field_a = param0;
    }

    final static String[] a(String param0, char param1, byte param2) {
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = TrackController.field_F ? 1 : 0;
        var10 = (CharSequence) (Object) param0;
        var3 = sf.a(var10, param1, 11109);
        var4 = new String[1 + var3];
        var5 = 0;
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (var3 <= var7) {
            var4[var3] = param0.substring(var6);
            if (param2 > -36) {
              return null;
            } else {
              return var4;
            }
          } else {
            var8 = var6;
            L1: while (true) {
              if (param1 == param0.charAt(var8)) {
                var5++;
                var4[var5] = param0.substring(var6, var8);
                var6 = var8 - -1;
                var7++;
                continue L0;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new mk();
    }
}
