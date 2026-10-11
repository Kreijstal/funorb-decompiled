/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends wl {
    int field_i;
    static String field_m;
    int field_j;
    static String field_l;
    static String[] field_k;

    final static db a(kl param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        kl var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -128) {
            var5 = (kl) null;
            of.a((kl) null, 20, (byte) -110, 17);
          }
          if (h.a(param3, param1, param0, -128)) {
            return md.c((byte) -92);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("of.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(kl param0, kl param1, byte param2, kl param3) {
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
          if (param2 != -1) {
            field_m = (String) null;
          }
          if (!param0.b(17820)) {
            return false;
          }
          if (!param0.a((byte) 29, "commonui")) {
            return false;
          }
          if (param3.b(param2 ^ -17821) &&
            param3.a((byte) 29, "commonui")) {
            if (param1.b(17820) &&
              param1.a((byte) 29, "button.gif")) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("of.E(");
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
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_l = null;
        field_m = null;
        if (param0 < 109) {
          field_k = (String[]) null;
        }
    }

    final static void d(int param0) {
        he.field_s[46] = 72;
        he.field_s[44] = 71;
        he.field_s[61] = 27;
        he.field_s[59] = 57;
        he.field_s[91] = 42;
        he.field_s[45] = 26;
        if (param0 == 0) {
          he.field_s[93] = 43;
          he.field_s[192] = 28;
          he.field_s[222] = 58;
          he.field_s[520] = 59;
          he.field_s[47] = 73;
          he.field_s[92] = 74;
          return;
        }
    }

    private of() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 == 72) {
          var1 = pf.c((byte) -89);
          var2 = lb.a((byte) 47);
          tl.field_c.a(pf.field_f - ic.field_c, var2 + (ic.field_c << 1), var1 + (ii.field_c << 1), 1, fe.field_l - ii.field_c);
          nf.a(99);
          return;
        }
    }

    final static void c(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = wizardrun.field_H;
        try {
          var5 = t.field_a;
          var1 = var5;
          if (param0 != 45) {
            of.a(-105);
          }
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1_ref), "of.C(" + param0 + ')');
        }
    }

    static {
        field_m = "You have <%0> unread messages!";
        field_k = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_l = "FULL ACCESS";
    }
}
