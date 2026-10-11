/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int field_a;
    static String field_e;
    static bi field_f;
    static String field_c;
    static String field_d;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 == 0) {
          field_f = null;
          field_e = null;
          return;
        }
        ef.a(-116);
        field_f = null;
        field_e = null;
    }

    final static boolean a(char param0, boolean param1) {
        boolean stackIn_27_0 = false;
        if (param1) {
          return true;
        }
        if (param0 < 48) {
          if (param0 < 65) {
            if (param0 >= 97 &&
              122 >= param0) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_27_0 = (param0 >= 97) && (122 >= param0);
          return stackIn_27_0;
        }
        if (param0 <= 57) {
          return true;
        }
        if (param0 >= 65 &&
          param0 <= 90) {
          return true;
        }
        if (param0 < 97) {
          return false;
        }
        if (122 < param0) {
          return false;
        }
        return true;
    }

    final static void a(boolean param0) {
        kc.field_b = new pf();
        if (!param0) {
          field_f = (bi) null;
        }
    }

    final static int a(int param0, int param1) {
        int var3 = 0;
        int var2 = 0;
        if ((param0 & 7) != 0) {
          var2 = -(7 & param0) + 8;
        }
        if (param1 == 57) {
          var3 = var2 + param0;
          return var3;
        }
        return 23;
    }

    static {
        field_c = "PEACE!";
        field_e = "The '<%0>' setting needs to be changed.";
        field_d = ", ";
        field_b = "This is <%0>'s RuneScape clan if they have one.";
    }
}
