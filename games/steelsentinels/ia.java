/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ia extends v implements fd {
    static String field_i;
    private jf field_k;
    static String field_j;
    static String field_m;
    static String field_h;
    static int field_l;

    final vd b(int param0) {
        if (param0 != -31992) {
          vd discarded$2 = ((ia) this).b(-105);
          return ((ia) this).a(((ia) this).field_k.field_y, -1);
        } else {
          return ((ia) this).a(((ia) this).field_k.field_y, -1);
        }
    }

    public static void c(byte param0) {
        Object var2 = null;
        field_m = null;
        field_j = null;
        if (param0 < 85) {
          var2 = null;
          pc discarded$2 = ia.a(55, (sk) null);
          field_h = null;
          field_i = null;
          return;
        } else {
          field_h = null;
          field_i = null;
          return;
        }
    }

    public final boolean b(boolean param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          if (null != ((ia) this).field_k.field_y) {
            if (((ia) this).field_k.field_y.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    public final void a(boolean param0, jf param1) {
        if (!param0) {
            field_i = null;
        }
    }

    final static void a(ak param0, ak param1, ak param2, mi param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, mi param18, int param19) {
        if (param11 != -1) {
          return;
        } else {
          re.field_ib = param3;
          a.field_a = param18;
          rj.a(param14, param19, param7, param12, (byte) -89);
          mj.a(param1, param10, param16, -89);
          en.a((byte) -55, param2, param15, param4, param0, param5);
          of.a(param9, param6, 11);
          dk.a(-92, param17, param13, param8);
          return;
        }
    }

    abstract String a(int param0, String param1);

    ia(jf param0) {
        ((ia) this).field_k = param0;
    }

    final static pc a(int param0, sk param1) {
        if (param0 != 6940) {
          field_j = null;
          return on.a(em.a(param1, 100, 96), -48);
        } else {
          return on.a(em.a(param1, 100, 96), -48);
        }
    }

    abstract vd a(String param0, int param1);

    final String b(byte param0) {
        if (param0 != -42) {
            return null;
        }
        return ((ia) this).a(100, ((ia) this).field_k.field_y);
    }

    public final void a(jf param0, byte param1) {
        if (param1 != 89) {
            return;
        }
        ((ia) this).a(-17382);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<%0> is not a member, and cannot play with the current options.";
        field_m = "Hide players in <%0>'s game";
        field_j = "Members' Benefits";
        field_h = "Invalid password.";
    }
}
