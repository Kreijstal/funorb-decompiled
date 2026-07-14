/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jeb extends mfb {
    static Random field_b;
    static int[] field_c;

    final int c(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((jeb) this).a(true);
            return ava.field_a;
        }
        return ava.field_a;
    }

    final int b(int param0) {
        int var2 = 63 % ((7 - param0) / 47);
        return rlb.field_e;
    }

    final boolean h(byte param0) {
        if (param0 < 18) {
            return false;
        }
        return false;
    }

    final int a(int param0) {
        if (param0 != 0) {
            field_b = null;
            return m.field_p;
        }
        return m.field_p;
    }

    final int a(byte param0) {
        int var2 = -96 / ((-48 - param0) / 43);
        return mq.field_j;
    }

    final int f(byte param0) {
        if (param0 < 0) {
            return 34;
        }
        return oq.field_a;
    }

    final int k(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((jeb) this).k(108);
            return 6;
        }
        return 6;
    }

    final int a(boolean param0) {
        if (param0) {
            boolean discarded$0 = ((jeb) this).h((byte) 61);
            return 71;
        }
        return 71;
    }

    final int d(byte param0) {
        if (param0 >= -52) {
            return -93;
        }
        return jj.field_o;
    }

    final int b(boolean param0) {
        if (param0) {
            Object var3 = null;
            boolean discarded$0 = jeb.a(31, (int[]) null, 36L, (String) null, (byte) 17);
            return r.field_k;
        }
        return r.field_k;
    }

    jeb() {
    }

    public static void i(byte param0) {
        field_c = null;
        int var1 = 29 % ((14 - param0) / 44);
        field_b = null;
    }

    final static boolean a(int param0, int[] param1, long param2, String param3, byte param4) {
        if (param4 <= -3) {
          if (param1 != null) {
            if (-3 == (param0 ^ -1)) {
              if (!ira.a(param2, param3, 41)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (param1 != null) {
            if (-3 == (param0 ^ -1)) {
              if (!ira.a(param2, param3, 41)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final int g(byte param0) {
        if (param0 >= -12) {
            field_c = null;
            return cp.field_f;
        }
        return cp.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new Random();
    }
}
