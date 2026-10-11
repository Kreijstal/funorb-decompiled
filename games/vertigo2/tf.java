/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends wm {
    static am field_l;
    static int[] field_o;
    static int field_n;
    static int[] field_p;
    static String field_m;

    final static cr b(byte param0) {
        if (param0 <= 90) {
          field_l = (am) null;
          return uk.field_v.field_Nb;
        }
        return uk.field_v.field_Nb;
    }

    public static void c(int param0) {
        field_l = null;
        field_m = null;
        field_p = null;
        field_o = null;
        if (param0 < 1) {
          tf.c(-28);
        }
    }

    final static boolean a(byte param0) {
        if (param0 <= 22) {
          return true;
        }
        if (un.field_Lb != null) {
          return true;
        }
        if (mb.a((byte) -120)) {
          return true;
        }
        if (up.field_z != null) {
          return true;
        }
        if (!uj.c((byte) -87)) {
          return false;
        }
        return true;
    }

    final static void a(int param0, String param1, int param2, String param3, int param4, int param5) {
        mi var9 = null;
        int var7 = 0;
        try {
          var9 = uh.field_Wb;
          mi var6 = var9;
          var9.j(param4, 122);
          var9.field_u = var9.field_u + 1;
          var7 = var9.field_u;
          int var8 = 33 % ((-45 - param2) / 39);
          var9.f(param0, 108);
          if (param0 == 2) {
            var9.a((byte) 0, param1);
          }
          if (param3 == null) {
            var9.d(param5, -1783);
          } else {
            nj.a(param3, 7937, var9);
          }
          var9.b((byte) 100, -var7 + var9.field_u);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "tf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_l = null;
        field_o = new int[12];
        field_m = "Connection timed out. Please try using a different server.";
    }
}
