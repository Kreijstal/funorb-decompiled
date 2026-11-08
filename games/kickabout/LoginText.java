/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginText {
    static boolean field_e;
    private String field_b;
    private boolean field_c;
    static IntrusiveDeque field_f;
    static String field_d;
    static String field_a;
    static String field_g;

    final boolean getFlag(int param0) {
        int var2 = -5 / ((-31 - param0) / 58);
        return this.field_c;
    }

    final static boolean rectangleContains(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        String var8;
        boolean stackIn_8_0 = false;
        if (param3 != -124) {
          var8 = (String) null;
          LoginText.a(true, (String) null, -17);
        }
        stackIn_8_0 = (param2 >= param0) && (param0 + param5 > param2) && (param1 >= param4) && (param6 + param4 > param1);
        return stackIn_8_0;
    }

    final static void a(boolean param0, ChatMessage param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = Kickabout.field_G;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            AlphaContainer.field_C[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; PitchDecorationSupport.field_j > var2_intLifetime1; var2_intLifetime1++) {
            if (GrowableIntList.field_b[var2_intLifetime1].field_c == param1.field_c) {
              dupTemp$3 = GrowableIntList.field_b[var2_intLifetime1].b(80);
              AlphaContainer.field_C[dupTemp$3] = AlphaContainer.field_C[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param1.b(80);
          AlphaContainer.field_C[dupTemp$0] = AlphaContainer.field_C[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; PitchDecorationSupport.field_j > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (~param1.field_c == ~GrowableIntList.field_b[var3].field_c) {
              var4 = GrowableIntList.field_b[var3].b(80);
              if (TrinketTile.field_Hb < AlphaContainer.field_C[var4]) {
                AlphaContainer.field_C[var4] = AlphaContainer.field_C[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              GrowableIntList.field_b[incrementValue$2] = GrowableIntList.field_b[var3];
            }
          }
          if (!param0) {
            return;
          }
          PitchDecorationSupport.field_j = var2_intLifetime2;
          fieldTemp$1 = PitchDecorationSupport.field_j;
          PitchDecorationSupport.field_j = PitchDecorationSupport.field_j + 1;
          GrowableIntList.field_b[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ec.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static int a(boolean param0, String param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -23044) {
            stackIn_2_0 = -20;
            return stackIn_2_0;
          }
          if (!param0) {
            stackIn_7_0 = UrlRequest.field_i.stringWidth(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = UrlRequest.field_a.stringWidth(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ec.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    LoginText(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_b = param0;
          stackIn_4_1 = (param1);
          this.field_c = stackIn_4_1;
          if (null == this.field_b) {
            this.field_b = "";
          }
          if (0 == this.field_b.length()) {
            this.field_c = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("ec.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_f = null;
        field_g = null;
    }

    LoginText(String param0) {
        this(param0, false);
    }

    final String getText(int param0) {
        if (param0 != 27939) {
          String var3 = (String) null;
          LoginText.a(true, (String) null, 58);
        }
        return this.field_b;
    }

    static {
        field_d = "Day";
        field_a = "Click";
        field_f = new IntrusiveDeque();
        field_g = "You cannot add yourself!";
    }
}
