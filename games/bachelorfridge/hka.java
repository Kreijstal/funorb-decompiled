/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hka extends aba {
    static int field_h;
    static int field_i;
    static String field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BachelorFridge.field_y;
        try {
          for (var6_int = param3; var6_int <= param2; var6_int++) {
            hba.a(param5, param0, tj.field_b[var6_int], param1 + 8, param4);
          }
          if (param1 != -1) {
            field_h = -122;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "hka.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final jg a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        jg stackIn_3_0 = null;
        jg stackIn_10_0 = null;
        jg stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!vn.a((byte) 119, var4)) {
            stackIn_3_0 = jt.field_f;
            return stackIn_3_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = pd.a((byte) 47, var5);
          if (param1) {
            hka.a(-79, 12, 84, 122, 69, -84);
          }
          if (var3_int > 0 &&
            var3_int <= 130) {
            stackIn_12_0 = cm.field_u;
            return stackIn_12_0;
          }
          stackIn_10_0 = jt.field_f;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hka.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 41 / ((param0 + 8) / 45);
          if (this.a(param1, false) != jt.field_f) {
            return null;
          }
          stackIn_3_0 = ug.field_k;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hka.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    hka(lka param0) {
        super(param0);
    }

    final static int a(boolean param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_2_0 = -13;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_7_0 = qm.field_a.a(param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = lha.field_b.a(param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hka.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 >= 0) {
          String var2 = (String) null;
          hka.a(true, true, (String) null);
        }
        field_g = null;
    }

    static {
        field_g = "Total Cost: ";
    }
}
