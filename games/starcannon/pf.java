/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static String field_b;
    static ue field_a;
    static String field_c;
    static int field_d;
    static int field_e;

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          pf.a(false);
        }
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(CharSequence param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          if (!tj.a((byte) -79, param1, param0)) {
            return false;
          }
          if (param2) {
            field_a = (ue) null;
          }
          for (var3_int = 0; param0.length() > var3_int; var3_int++) {
            if (!sa.a((byte) -121, param0.charAt(var3_int))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("pf.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static hl[] a(int param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        hl[] var1;
        int var3;
        int[] var6;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = StarCannon.field_A;
        if (param0 != 255) {
          field_b = (String) null;
        }
        var1 = new hl[bj.field_b];
        for (var2 = 0; bj.field_b > var2; var2++) {
          var3 = gg.field_d[var2] * gh.field_C[var2];
          var20 = og.field_c[var2];
          if (!hc.field_a[var2]) {
            var9 = new int[var3];
            var21 = var9;
            for (var6_int = 0; var6_int < var3; var6_int++) {
              var9[var6_int] = of.field_g[w.a((int) var20[var6_int], 255)];
            }
            var1[var2] = new hl(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], var21);
          } else {
            var22 = ac.field_d[var2];
            var16 = new int[var3];
            var13 = var16;
            var6 = var13;
            for (var7 = 0; var7 < var3; var7++) {
              var6[var7] = cl.a(w.a(255, (int) var22[var7]) << 24, of.field_g[w.a(255, (int) var20[var7])]);
            }
            var1[var2] = (hl) ((Object) new pj(td.field_m, gb.field_w, fc.field_d[var2], qd.field_H[var2], gg.field_d[var2], gh.field_C[var2], var16));
          }
        }
        rc.b((byte) -104);
        return var1;
    }

    static {
        field_b = "Login: ";
    }
}
