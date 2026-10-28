/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends TextFieldValidator {
    static int field_n;
    static String field_o;
    static String field_p;

    public static void g(int param0) {
        if (param0 != -17) {
          field_o = (String) null;
          field_p = null;
          field_o = null;
          return;
        }
        field_p = null;
        field_o = null;
    }

    kl(EditableTextWidget param0) {
        super(param0);
    }

    final static boolean a(String param0, int param1) {
        String stackIn_10_2 = null;
        try {
          if (param1 == 0) {
            boolean stackIn_6_0 = (fk.a(-1465, param0) != null);
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var2;
          StringBuilder stackIn_9_1 = new StringBuilder().append("kl.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
          return false;
        }
        if (!hi.a(param1, -2)) {
          if (2 != param1) {
            return false;
          }
          if (4 == param0) {
            return true;
          }
          if (param0 == 8) {
            return true;
          }
          if (param0 == 12) {
            return true;
          }
          if (param0 == 16) {
            return true;
          }
          return false;
        }
        if (param0 == 2) {
          return true;
        }
        if (4 == param0) {
          return true;
        }
        if (param0 == 8) {
          return true;
        }
        if (param0 == 12) {
          return true;
        }
        if (16 == param0) {
          return true;
        }
        if (2 != param1) {
          return false;
        }
        if (4 == param0) {
          return true;
        }
        if (param0 == 8) {
          return true;
        }
        if (param0 == 12) {
          return true;
        }
        if (param0 == 16) {
          return true;
        }
        return false;
    }

    final String messageForText(byte guard, String text) {
        String stackIn_8_2 = null;
        try {
          int var3_int = 95 / ((guard - 10) / 51);
          if (this.validateText(-1, text) != ArchiveProvider.field_a) {
            return null;
          }
          String stackIn_3_0 = tb.field_E;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("kl.L(").append(guard).append(',');
          if (text == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final ValidationState validateText(int guard, String text) {
        String stackIn_13_2 = null;
        try {
          CharSequence var5 = (CharSequence) ((Object) text);
          if (!fk.a(false, var5)) {
            ValidationState stackIn_2_0 = ArchiveProvider.field_a;
            return stackIn_2_0;
          }
          CharSequence var6 = (CharSequence) ((Object) text);
          int var3_int = gn.a(guard ^ -16777216, var6);
          if (guard != -1) {
            String var4 = (String) null;
            this.validateText(-6, (String) null);
          }
          if (0 < var3_int &&
            130 >= var3_int) {
            return IsaacRandom.field_h;
          }
          ValidationState stackIn_9_0 = ArchiveProvider.field_a;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3;
          StringBuilder stackIn_12_1 = new StringBuilder().append("kl.G(").append(guard).append(',');
          if (text == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_p = "Names should contain a maximum of 12 characters";
    }
}
