/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj {
    static int field_b;
    static String field_a;
    static String field_c;
    static int field_e;
    static int field_d;

    final static void a(int param0, kl param1, kl param2, kl param3, boolean param4) {
        try {
          we.field_c = ql.a("", false);
          we.field_c.a(false, 104);
          eg.a(param3, param0 - 2109, param1, param2);
          bd.a(-126);
          fi.field_y = ej.field_b;
          if (param0 != 2202) {
            field_a = (String) null;
          }
          wc.field_j = ej.field_b;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "dj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    abstract void a(byte[] param0, int param1);

    public static void b(int param0) {
        if (param0 != 16) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static int a(boolean param0, int param1) {
        int var2;
        kl var3;
        int var2Lifetime1;
        if (param0) {
          var3 = (kl) null;
          dj.a(-74, (kl) null, (kl) null, (kl) null, true);
          var2 = 0;
          if (param1 < 0) {
            var2 += 16;
            param1 = param1 >>> 16;
          } else {
            if (param1 >= 65536) {
              var2 += 16;
              param1 = param1 >>> 16;
            }
          }
          if (param1 >= 256) {
            var2 += 8;
            param1 = param1 >>> 8;
          }
          if (16 <= param1) {
            param1 = param1 >>> 4;
            var2 += 4;
          }
          if (param1 >= 4) {
            param1 = param1 >>> 2;
            var2 += 2;
          }
          if (param1 >= 1) {
            var2++;
            param1 = param1 >>> 1;
          }
          return param1 + var2;
        }
        var2Lifetime1 = 0;
        if (param1 < 0) {
          var2Lifetime1 += 16;
          param1 = param1 >>> 16;
        } else {
          if (param1 >= 65536) {
            var2Lifetime1 += 16;
            param1 = param1 >>> 16;
          }
        }
        if (param1 >= 256) {
          var2Lifetime1 += 8;
          param1 = param1 >>> 8;
        }
        if (16 <= param1) {
          param1 = param1 >>> 4;
          var2Lifetime1 += 4;
        }
        if (param1 >= 4) {
          param1 = param1 >>> 2;
          var2Lifetime1 += 2;
        }
        if (param1 >= 1) {
          var2Lifetime1++;
          param1 = param1 >>> 1;
        }
        return param1 + var2Lifetime1;
    }

    abstract byte[] a(int param0);

    static {
        field_c = "Please log in to access this feature";
        field_a = "Log in";
        field_d = 0;
    }
}
