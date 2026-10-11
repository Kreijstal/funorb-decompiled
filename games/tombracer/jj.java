/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends Exception {
    int field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != -32842) {
          return true;
        }
        return (param1 & 33) != 0 ? true : false;
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -56) {
          jj.a(-126, -76, -57);
          if (6406 == param0) {
            return 1;
          }
          if (param0 == 6409) {
            return 1;
          }
          if (param0 == 32841) {
            return 1;
          }
          if (6410 == param0) {
            return 2;
          }
          if (param0 == 6407) {
            return 3;
          }
          if (6408 != param0) {
            throw new IllegalArgumentException("");
          }
          return 4;
        }
        if (6406 == param0) {
          return 1;
        }
        if (param0 == 6409) {
          return 1;
        }
        if (param0 == 32841) {
          return 1;
        }
        if (6410 == param0) {
          return 2;
        }
        if (param0 == 6407) {
          return 3;
        }
        if (6408 != param0) {
          throw new IllegalArgumentException("");
        }
        return 4;
    }

    jj(int param0) {
        this.field_a = param0;
    }

    static {
    }
}
