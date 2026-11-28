/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DebouncedFieldValidator implements FieldValidator {
    static String field_e;
    static Sprite[] field_i;
    static boolean field_b;
    static rl field_c;
    private long field_a;
    static String[] field_h;
    static int[] field_f;
    static String field_g;
    static String field_d;

    public final void recordInputChange(boolean param0) {
        if (!param0) {
          this.getValidationStatus(66);
        }
        this.field_a = ol.correctedCurrentTimeMillis(256);
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 >= -120) {
          field_e = (String) null;
        }
        field_i = null;
        field_c = null;
        field_g = null;
        field_f = null;
        field_d = null;
        field_e = null;
        field_h = null;
    }

    abstract rj evaluateValidationStatus(byte param0);

    public final String getValidationMessage(byte param0) {
        if (param0 != -10) {
          this.getValidationMessage((byte) 50);
        }
        if (this.hasMissingInput(6650)) {
          return null;
        }
        if (ol.correctedCurrentTimeMillis(256) < 350L + this.field_a) {
          return null;
        }
        return this.evaluateValidationMessage(5);
    }

    final static short[] a(pa param0, int param1, short[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 > -91) {
            DebouncedFieldValidator.clearStaticReferences((byte) -111);
          }
          var4_int = param0.e(param3, -126);
          if (0 == var4_int) {
            return null;
          }
          if (param2 == null ||
            param2.length != var4_int) {
            param2 = new short[var4_int];
          }
          var5 = param0.e(4, -13);
          var6 = (short)param0.e(16, 107);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (short)(var6 + param0.e(var5, -32));
            }
          }
          stackIn_18_0 = (short[]) (param2);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ui.S(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract String evaluateValidationMessage(int param0);

    final static void c(int param0) {
        int var1_int = 0;
        int[] array$0 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          qf.field_e = new ge[8];
          qf.field_e[1] = ua.field_d[1];
          qf.field_e[0] = ua.field_d[0];
          qf.field_e[3] = ua.field_d[3];
          qf.field_e[2] = ua.field_d[2];
          qf.field_e[4] = ua.field_d[5];
          qf.field_e[7] = ua.field_d[4];
          qf.field_e[5] = EditableTextField.field_V[0];
          e.field_p = new int[8][];
          wc.field_d = new int[8];
          qf.field_e[6] = EditableTextField.field_V[1];
          for (var1_int = 0; var1_int < 8; var1_int++) {
            wc.field_d[var1_int] = qf.field_e[var1_int].field_d;
            if (var1_int == 0 ||
              var1_int == 5) {
              array$0 = new int[qf.field_e[var1_int].field_l.length];
              e.field_p[var1_int] = array$0;
              for (var2 = 0; var2 < e.field_p[var1_int].length; var2++) {
                e.field_p[var1_int][var2] = qf.field_e[var1_int].field_l[var2];
              }
            }
          }
          SecondaryNodeDequeIterator.field_e.setInlineSprites(qf.field_e, wc.field_d);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var1), "ui.R(" + param0 + ')');
        }
    }

    public final rj getValidationStatus(int param0) {
        if (this.hasMissingInput(6650)) {
          return mh.field_b;
        }
        if (ol.correctedCurrentTimeMillis(256) < this.field_a + 350L) {
          return bl.field_S;
        }
        int var2 = -47 / ((param0 - 33) / 61);
        return this.evaluateValidationStatus((byte) 109);
    }

    static {
        field_e = "Loading music";
        field_h = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_c = new rl(1);
        field_f = new int[4];
        field_g = "Instructions";
        field_d = "Skip";
    }
}
