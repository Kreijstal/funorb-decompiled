/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends ll {
    static int field_I;
    int field_L;
    static int field_F;
    sk field_K;
    static int field_H;
    static String field_J;
    byte[] field_G;

    final static al g(int param0) {
        if (param0 != -1) {
          fd.h(43);
          if (null == pg.field_d) {
            pg.field_d = new al(dh.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, dh.field_d.field_N, -1, 2147483647, true);
            return pg.field_d;
          }
          return pg.field_d;
        }
        if (null != pg.field_d) {
          return pg.field_d;
        }
        pg.field_d = new al(dh.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, dh.field_d.field_N, -1, 2147483647, true);
        return pg.field_d;
    }

    public static void h(int param0) {
        if (param0 != -1) {
          return;
        }
        field_J = null;
    }

    final static void a(int param0, int param1, v param2) {
        bc var3 = null;
        try {
          var3 = nd.field_Lb;
          var3.f(param1, (byte) -92);
          int var4 = 76 % ((12 - param0) / 62);
          var3.a(param2.field_n, false);
          var3.a(param2.field_q, false);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "fd.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static kh[] a(boolean param0, int param1, int param2, ah param3) {
        RuntimeException var4 = null;
        kh[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ia.a(param1, param3, param2, -93)) {
            return null;
          }
          if (param0) {
            field_J = (String) null;
          }
          stackIn_6_0 = e.a((byte) 123);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fd.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        if (param1 <= 72) {
          return true;
        }
        if (param0 < 48) {
          return false;
        }
        if (param0 > 57) {
          return false;
        }
        return true;
    }

    final static boolean a(int param0, byte param1) {
        if (param1 != 99) {
          field_F = 86;
          if (!qb.a(param0, (byte) 114)) {
            return false;
          }
          if (param0 != -2) {
            return true;
          }
          return false;
        }
        if (!qb.a(param0, (byte) 114)) {
          return false;
        }
        if (param0 != -2) {
          return true;
        }
        return false;
    }

    final int a(boolean param0) {
        if (param0) {
          this.field_G = (byte[]) null;
          if (!this.field_v) {
            return 100;
          }
          return 0;
        }
        if (!this.field_v) {
          return 100;
        }
        return 0;
    }

    fd() {
    }

    final byte[] c(boolean param0) {
        if (!param0) {
          fd.g(-4);
          if (!this.field_v) {
            return this.field_G;
          }
          throw new RuntimeException();
        }
        if (!this.field_v) {
          return this.field_G;
        }
        throw new RuntimeException();
    }

    static {
        field_I = 0;
    }
}
