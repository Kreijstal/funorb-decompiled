/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static String field_e;
    static java.awt.Canvas field_d;
    static int field_c;
    static rf field_f;
    static boolean field_b;
    static ed field_a;
    static fd field_g;
    static hh field_h;

    final static ed a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        ed var7 = new ed(param2, param2);
        ed var3 = var7;
        int var4 = 92 % ((param1 - 15) / 58);
        for (var5 = 0; var5 < var3.field_B.length; var5++) {
          var7.field_B[var5] = param0;
        }
        return var3;
    }

    final static boolean a(char param0, byte param1) {
        boolean stackIn_10_0 = false;
        if (param1 < 28) {
          of.a('ﾱ', (byte) 49);
        }
        stackIn_10_0 = ((!(65 > param0) &&
          !(90 < param0)) ||
          (!(param0 < 97) &&
          !(122 < param0)));
        return stackIn_10_0;
    }

    final static boolean a(mf param0, mf param1, mf param2, byte param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.b(0)) {
            return false;
          }
          if (!param0.a(0, "commonui")) {
            return false;
          }
          if (param1.b(0) &&
            param1.a(0, "commonui")) {
            if (param2.b(0) &&
              param2.a(0, "button.gif")) {
              if (param3 > -1) {
                field_h = (hh) null;
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("of.F(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    final static lm a(int param0, String param1) {
        RuntimeException var2 = null;
        lm stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 122) {
            of.a('o', (byte) -83);
          }
          if (ui.field_b == dg.field_o) {
            return null;
          }
          if (ia.field_y == ui.field_b &&
            param1.equals(tc.field_j)) {
            ui.field_b = vn.field_g;
            stackIn_8_0 = co.field_a;
            return stackIn_8_0;
          }
          tc.field_j = param1;
          co.field_a = null;
          ui.field_b = dg.field_o;
          stackIn_10_0 = null;
          return (lm) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("of.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        if (param0) {
          of.a(89);
        }
        gi.field_e = null;
        gn.field_k = null;
        qe.field_a = (byte[][]) null;
        bc.field_a = null;
        qk.field_f = null;
        qh.field_k = null;
    }

    final static int a(byte param0) {
        if (param0 >= -72) {
          of.a(-52);
        }
        return md.field_G;
    }

    public static void a(int param0) {
        if (param0 != 122) {
          return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_f = null;
    }

    static {
        field_e = "Start Game";
        field_c = 70;
        field_f = new rf();
    }
}
