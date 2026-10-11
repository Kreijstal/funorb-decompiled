/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    static kc[] field_c;
    static int field_a;
    static String field_b;
    static int[] field_f;
    static String[] field_d;
    static int field_e;

    final static boolean a(byte param0) {
        if (param0 != -79) {
          ia.a(-122, 113);
          if (s.field_d == null) {
            return false;
          }
          if (null != s.field_d.d((byte) 94)) {
            return true;
          }
          return false;
        }
        if (s.field_d == null) {
          return false;
        }
        if (null != s.field_d.d((byte) 94)) {
          return true;
        }
        return false;
    }

    final static int b(int param0) {
        if (param0 != -5) {
          return 0;
        }
        return 1;
    }

    public static void a(int param0) {
        if (param0 == -12765) {
          field_c = null;
          field_f = null;
          field_d = null;
          field_b = null;
          return;
        }
        field_f = (int[]) null;
        field_c = null;
        field_f = null;
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2;
        if (param1 != 2) {
          return 126;
        }
        var2 = 0;
        if (param0 < 0) {
          param0 = param0 >>> 16;
          var2 += 16;
        } else {
          if (param0 >= 65536) {
            param0 = param0 >>> 16;
            var2 += 16;
          }
        }
        if (param0 >= 256) {
          param0 = param0 >>> 8;
          var2 += 8;
        }
        if (param0 >= 16) {
          var2 += 4;
          param0 = param0 >>> 4;
        }
        if (param0 >= 4) {
          var2 += 2;
          param0 = param0 >>> 2;
        }
        if (1 <= param0) {
          param0 = param0 >>> 1;
          var2++;
        }
        return var2 + param0;
    }

    static {
    }
}
