/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    String field_e;
    static int field_b;
    static String field_c;
    boolean field_g;
    static boolean field_a;
    static ll field_d;
    String field_f;

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != 544) {
          field_c = (String) null;
        }
        return (((param0 & 24) != 0 ? 1 : 0) | ((param0 & 544) == 544 ? 1 : 0)) != 0;
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != -11760) {
          gl.a(20);
        }
    }

    final static vt a(ResourceArchive param0, String param1, String param2, ResourceArchive param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        vt stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 24) {
            gl.a(-112);
          }
          var5_int = param0.b(param2, 0);
          var6 = param0.a(-79, var5_int, param1);
          stackIn_3_0 = eo.a(param0, var6, -112, var5_int, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("gl.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static vt a(byte[] param0, int param1) {
        vt var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        vt stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (vt) (stackIn_2_0);
          }
          var2 = new vt(param0, lh.field_a, lg.field_j, ji.field_b, ee.field_e, fk.field_a);
          kf.f(1);
          if (param1 != 544) {
            field_a = false;
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("gl.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ll[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        ll[] var1 = new ll[to.field_t];
        for (var2 = param0; var2 < to.field_t; var2++) {
          var3 = ee.field_e[var2] * ji.field_b[var2];
          var4 = fk.field_a[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = ud.field_e[pg.a(255, (int) var4[var6])];
          }
          var1[var2] = new ll(pu.field_a, cc.field_i, lh.field_a[var2], lg.field_j[var2], ji.field_b[var2], ee.field_e[var2], var5);
        }
        kf.f(1);
        return var1;
    }

    static {
        field_c = "start game";
    }
}
