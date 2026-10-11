/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld {
    static int field_l;
    int field_g;
    int field_e;
    static double field_f;
    static int[] field_d;
    int field_c;
    int field_i;
    static String field_b;
    static String field_j;
    int field_a;
    int field_h;
    static df field_k;

    final static boolean a(byte param0, char param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param0 != -21) {
          ld.a((byte) -32, '\005');
          if (48 > param1) {
            if (param1 >= 65 &&
              param1 <= 90) {
              return true;
            }
            if (param1 < 97) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (param1 <= 57) {
            return true;
          }
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (param1 <= 122) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_28_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_28_0;
        }
        if (48 > param1) {
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_64_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_64_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (param1 < 65) {
          if (param1 < 97) {
            return false;
          }
          if (param1 > 122) {
            return false;
          }
          return true;
        }
        if (param1 <= 90) {
          return true;
        }
        stackIn_50_0 = (param1 >= 97) && (param1 <= 122);
        return stackIn_50_0;
    }

    abstract void a(int param0, int param1);

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_d = null;
        field_j = null;
        field_b = null;
        field_k = null;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_b = "Hold <%0> to charge, and release to fire";
        field_l = 0;
        field_j = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
