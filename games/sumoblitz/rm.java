/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    final static void a(byte param0) {
        if (0 - gi.field_i == td.field_u) {
          if (param0 > 42) {
            td.field_u = td.field_u + 1;
            return;
          }
          return;
        }
        if (250 - gi.field_i != td.field_u) {
          if (param0 > 42) {
            td.field_u = td.field_u + 1;
            return;
          }
          return;
        }
        if (param0 > 42) {
          td.field_u = td.field_u + 1;
          return;
        }
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (param1 > 65535) {
          var2 = var2 | 16;
          param1 = param1 >>> 16;
        }
        if (param1 > 255) {
          param1 = param1 >>> 8;
          var2 = var2 | 8;
        }
        if (15 < param1) {
          var2 = var2 | 4;
          param1 = param1 >>> 4;
        }
        int var3 = -66 / ((-59 - param0) / 55);
        if (param1 > 3) {
          var2 = var2 | 2;
          param1 = param1 >>> 2;
        }
        if (param1 > 1) {
          param1 = param1 >>> 1;
          var2 = var2 | 1;
        }
        return var2;
    }

    final static boolean a(int param0, int param1) {
        if (param1 <= -100) {
          return param0 == (param0 & -param0) ? true : false;
        }
        return false;
    }

    static {
    }
}
