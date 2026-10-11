/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static String field_b;
    static String field_d;
    static String field_c;
    static String field_i;
    static String field_a;
    private static int field_f;
    static int field_g;
    static String field_h;
    static String field_e;

    final static boolean a(di param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_4_0 = param0.c(-63);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ab.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_a = null;
        if (param0 <= -46) {
          field_i = null;
          field_b = null;
          field_d = null;
          field_h = null;
          field_c = null;
          return;
        }
        field_a = (String) null;
        field_i = null;
        field_b = null;
        field_d = null;
        field_h = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          if (param0 != 25692) {
            field_d = (String) null;
          }
          try {
            mo.a("resizing", new Object[]{new Integer(param1)}, param0 ^ 25619, hk.d(116));
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        if (!gk.field_kb) {
          throw new IllegalStateException();
        }
        mf.field_o = true;
        ii.a(false, param0 ^ param0);
        fk.field_ab = 0;
    }

    final static String a(int param0, byte param1) {
        StringBuilder stackIn_4_0 = null;
        String stackIn_5_1 = null;
        StringBuilder stackIn_7_0 = null;
        String stackIn_8_1 = null;
        StringBuilder stackIn_10_0 = null;
        String stackIn_11_1 = null;
        StringBuilder stackIn_13_0 = null;
        String stackIn_14_1 = null;
        StringBuilder stackIn_16_0 = null;
        String stackIn_17_1 = null;
        StringBuilder stackIn_19_0 = null;
        String stackIn_20_1 = null;
        StringBuilder stackIn_22_0 = null;
        String stackIn_23_1 = null;
        StringBuilder stackIn_25_0 = null;
        String stackIn_26_1 = null;
        StringBuilder stackIn_28_0 = null;
        String stackIn_29_1 = null;
        StringBuilder stackIn_31_0 = null;
        String stackIn_32_1 = null;
        StringBuilder stackIn_34_0 = null;
        String stackIn_35_1 = null;
        StringBuilder stackIn_37_0 = null;
        String stackIn_38_1 = null;
        if (param1 != 10) {
          ab.a(-112, (byte) -4);
        }
        stackIn_4_0 = new StringBuilder();
        if ((param0 & nd.field_j) != 0) {
          stackIn_5_1 = "cont vis|";
        } else {
          stackIn_5_1 = "";
        }
        stackIn_7_0 = ((StringBuilder) (Object) stackIn_4_0).append(stackIn_5_1);
        if ((param0 & sg.field_O) == 0) {
          stackIn_8_1 = "";
        } else {
          stackIn_8_1 = "gv visit+1|";
        }
        stackIn_10_0 = ((StringBuilder) (Object) stackIn_7_0).append(stackIn_8_1);
        if ((param0 & be.field_I) == 0) {
          stackIn_11_1 = "";
        } else {
          stackIn_11_1 = "gv shot+1|";
        }
        stackIn_13_0 = ((StringBuilder) (Object) stackIn_10_0).append(stackIn_11_1);
        if ((param0 & nr.field_Q) != 0) {
          stackIn_14_1 = "gv BiH anywhere|";
        } else {
          stackIn_14_1 = "";
        }
        stackIn_16_0 = ((StringBuilder) (Object) stackIn_13_0).append(stackIn_14_1);
        if ((param0 & nr.field_R) != 0) {
          stackIn_17_1 = "gv BiH kitchen|";
        } else {
          stackIn_17_1 = "";
        }
        stackIn_19_0 = ((StringBuilder) (Object) stackIn_16_0).append(stackIn_17_1);
        if ((param0 & nr.field_V) != 0) {
          stackIn_20_1 = "gv BiH in D|";
        } else {
          stackIn_20_1 = "";
        }
        stackIn_22_0 = ((StringBuilder) (Object) stackIn_19_0).append(stackIn_20_1);
        if ((ag.field_e & param0) != 0) {
          stackIn_23_1 = "wins|";
        } else {
          stackIn_23_1 = "";
        }
        stackIn_25_0 = ((StringBuilder) (Object) stackIn_22_0).append(stackIn_23_1);
        if (0 == (param0 & hm.field_e)) {
          stackIn_26_1 = "";
        } else {
          stackIn_26_1 = "loses|";
        }
        stackIn_28_0 = ((StringBuilder) (Object) stackIn_25_0).append(stackIn_26_1);
        if (0 == (param0 & oa.field_b)) {
          stackIn_29_1 = "";
        } else {
          stackIn_29_1 = "group choice|";
        }
        stackIn_31_0 = ((StringBuilder) (Object) stackIn_28_0).append(stackIn_29_1);
        if ((param0 & um.field_c) == 0) {
          stackIn_32_1 = "";
        } else {
          stackIn_32_1 = "respot white|";
        }
        stackIn_34_0 = ((StringBuilder) (Object) stackIn_31_0).append(stackIn_32_1);
        if ((param0 & ob.field_F) != 0) {
          stackIn_35_1 = "rerack|";
        } else {
          stackIn_35_1 = "";
        }
        stackIn_37_0 = ((StringBuilder) (Object) stackIn_34_0).append(stackIn_35_1);
        if (0 != (ll.field_f & param0)) {
          stackIn_38_1 = "ends turn|";
        } else {
          stackIn_38_1 = "";
        }
        return ((StringBuilder) (Object) stackIn_37_0).append(stackIn_38_1).toString();
    }

    static {
        field_f = 14;
        field_i = "Use this alternative as your account name";
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
        field_d = "Invite more players, or alternatively try changing the following settings:  ";
        field_g = 1 << field_f;
        field_h = "Players";
        field_c = "Invite only";
        field_a = "Achievements are only awarded in Rated games,<br>unless stated otherwise.";
        field_e = "Encouraging rule breaking";
    }
}
