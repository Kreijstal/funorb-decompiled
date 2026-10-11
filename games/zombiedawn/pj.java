/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pj extends nb {
    static int[] field_u;
    boolean field_t;
    boolean field_r;
    static int[] field_s;
    static java.math.BigInteger field_p;
    volatile boolean field_q;

    final static void a(wj param0, byte param1, int param2, int param3, boolean param4) {
        try {
          nc.field_p.a(param3, !param4 ? true : false, param2, 1000000, -93, param0);
          int var5_int = 2 % ((param1 + 11) / 36);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = ZombieDawn.field_J;
        if (param0 == 0) {
          return 0;
        }
        if (param0 < 0) {
          throw new IllegalArgumentException("");
        }
        var2 = 103 % ((12 - param1) / 36);
        if (param0 >= 32768) {
          if (131072 > param0) {
            return ld.field_n[-32768 + param0];
          }
          if (param0 >= 33554432) {
            if (536870912 <= param0) {
              var3 = 7;
            } else {
              var3 = (param0 >= 134217728) ? 6 : 5;
            }
          } else {
            if (2097152 <= param0) {
              var3 = (8388608 > param0) ? 3 : 4;
            } else {
              var3 = (524288 <= param0) ? 2 : 1;
            }
          }
          param0 = param0 >> (var3 << 1);
          return ld.field_n[param0 - 32768] << var3;
        }
        if (param0 < 128) {
          if (param0 < 8) {
            if (param0 < 2) {
              return 256;
            }
            var3Lifetime1 = 7;
          } else {
            var3Lifetime1 = (32 > param0) ? 6 : 5;
          }
        } else {
          if (2048 <= param0) {
            var3Lifetime1 = (param0 >= 8192) ? 1 : 2;
          } else {
            var3Lifetime1 = (param0 >= 512) ? 3 : 4;
          }
        }
        param0 = param0 << (var3Lifetime1 << 1);
        return ld.field_n[param0 - 32768] >> var3Lifetime1;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param1 >= 30) {
          var3 = 1024 - so.b((param0 - 240) * (-240 + param0) + (param2 - 320) * (-320 + param2));
          var3 = var3 >= 0 ? var3 >> 2 : 0;
          return var3 * ge.field_c / 224;
        }
        return -120;
    }

    abstract int e(int param0);

    abstract byte[] d(int param0);

    pj() {
        this.field_q = true;
    }

    public static void f(int param0) {
        field_p = null;
        field_u = null;
        if (param0 != 32) {
          field_p = (java.math.BigInteger) null;
          field_s = null;
          return;
        }
        field_s = null;
    }

    static {
        field_s = new int[8192];
        field_u = new int[]{135, 135, 90, 120};
        field_p = new java.math.BigInteger("65537");
    }
}
