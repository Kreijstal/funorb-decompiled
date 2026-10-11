/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static fi field_b;
    static int field_a;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          var3_int = param0;
          var4 = uh.field_c;
          while (var3_int < dl.field_c.length) {
            var5 = la.field_T[var3_int];
            if (var5 < 0) {
              var4 = var4 + wm.field_bb;
            } else {
              var6 = cl.a(param0 ^ -3, dl.field_c[var3_int], true);
              var4 = var4 + kb.field_b;
              var7 = ef.field_vb - (var6 >> 1);
              if (qd.a(param1, var4, (jd.field_g << 1) + var6, param2, true, -jd.field_g + var7, (n.field_d << 1) + af.field_Z)) {
                stackIn_7_0 = var5;
                return stackIn_7_0;
              }
              var4 = var4 + (kb.field_b + (n.field_d << 1) + af.field_Z);
            }
            var3_int++;
          }
          stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "ab.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          var5 = vb.field_e;
          var1 = var5;
          if (param0 < 98) {
            ab.a((byte) -5);
          }
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "ab.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        cb.field_a.a(gj.field_d, 100, fa.field_S * 48 >> 7);
        if (param0 != 2026) {
          field_b = (fi) null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -26) {
          field_a = -36;
        }
    }

    static {
        field_a = 0;
        field_b = new fi();
    }
}
