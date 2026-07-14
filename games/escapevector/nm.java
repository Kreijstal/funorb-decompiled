/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static hh field_a;

    final static void a(int param0) {
        if (param0 != 16) {
            field_a = null;
        }
        if (pg.field_c != null) {
            pg.field_c.c(12497);
            pg.field_c = null;
        }
    }

    final static ce a(int param0, String param1, ec param2, mf param3, String param4) {
        if (param0 != 2) {
            field_a = null;
        }
        int var5 = param3.b(-1, param1);
        int var6 = param3.a(var5, param4, true);
        return ml.a(param0 ^ -15620, param3, param2, var6, var5);
    }

    final static int a(int param0, byte param1) {
        if (param1 != 78) {
            field_a = null;
        }
        int var2 = 0;
        if (param0 <= -1) {
            // if_icmpgt L40
        }
        var2 += 16;
        param0 = param0 >>> 16;
        if (!(param0 < 256)) {
            param0 = param0 >>> 8;
            var2 += 8;
        }
        if (16 <= param0) {
            var2 += 4;
            param0 = param0 >>> 4;
        }
        if (4 <= param0) {
            var2 += 2;
            param0 = param0 >>> 2;
        }
        if (!(param0 < 1)) {
            var2++;
            param0 = param0 >>> 1;
        }
        return var2 + param0;
    }

    final static void a(byte param0, int param1, dk[] param2) {
        rb.a(param2, -1, param1, (byte) -28);
        if (param0 > -50) {
            field_a = null;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            int discarded$0 = nm.a(-36, (byte) -52);
        }
        field_a = null;
    }

    final static boolean a(byte param0, qh[] param1) {
        int var2 = 0;
        int var3 = 0;
        ed var4 = null;
        int var5 = 0;
        L0: {
          var5 = EscapeVector.field_A;
          var2 = 1;
          if (param0 <= -71) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= param1.length) {
            return var2 != 0;
          } else {
            var4 = param1[var3].b(110);
            if (var4 == null) {
              var2 = 0;
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    static {
    }
}
