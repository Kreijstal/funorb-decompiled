/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static String field_e;
    static String field_d;
    static String field_c;
    static boolean field_a;
    static String field_f;
    static jm field_b;

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!qc.field_h) {
            return false;
          }
          if (sd.field_e == 2 &&
            null != d.field_Gb) {
            var3 = (CharSequence) ((Object) param0);
            if (d.field_Gb.equals(c.a(var3, true))) {
              if (!param1) {
                return true;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("dd.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static mg[] a(byte param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        mg[] var1;
        int var3;
        int[] var6;
        int var8;
        String var9;
        int[] var10;
        int[] var14;
        int[] var17;
        byte[] var21;
        int[] var22;
        byte[] var23;
        var8 = Virogrid.field_F ? 1 : 0;
        var1 = new mg[rj.field_h];
        for (var2 = 0; rj.field_h > var2; var2++) {
          var3 = db.field_k[var2] * gb.field_F[var2];
          var21 = lj.field_j[var2];
          if (!ei.field_d[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6_int = 0; var3 > var6_int; var6_int++) {
              var10[var6_int] = k.field_c[rb.a((int) var21[var6_int], 255)];
            }
            var1[var2] = new mg(oj.field_Kb, se.field_d, el.field_w[var2], mb.field_bb[var2], db.field_k[var2], gb.field_F[var2], var22);
          } else {
            var23 = md.field_g[var2];
            var17 = new int[var3];
            var14 = var17;
            var6 = var14;
            for (var7 = 0; var7 < var3; var7++) {
              var6[var7] = oh.a(rb.a((int) var23[var7], 255) << 24, k.field_c[rb.a((int) var21[var7], 255)]);
            }
            var1[var2] = (mg) ((Object) new kc(oj.field_Kb, se.field_d, el.field_w[var2], mb.field_bb[var2], db.field_k[var2], gb.field_F[var2], var17));
          }
        }
        if (param0 > -106) {
          var9 = (String) null;
          dd.a((String) null, true);
        }
        pe.b((byte) -28);
        return var1;
    }

    public static void b(byte param0) {
        if (param0 != -58) {
          return;
        }
        field_e = null;
        field_f = null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    static {
        field_e = "Just play";
        field_d = "<%0> ran out of time";
        field_f = "start using this feature.";
        field_c = "Invalid password.";
    }
}
