/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IndexedSpriteLayer extends MenuLayer {
    static int[] field_e;
    static String field_c;
    private IndexedSprite field_d;

    final static void a(int param0, byte param1, int param2, int[] param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Torquing.field_u;
        try {
          param0--;
          param4--;
          var5_int = param4 - 7;
          while (var5_int > param0) {
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
            param0++;
            param3[param0] = param2;
          }
          while (param0 < param4) {
            param0++;
            param3[param0] = param2;
          }
          var6 = -59 / ((-50 - param1) / 39);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("di.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_e = null;
        if (param0 == -7) {
          return;
        }
        int[] var2 = (int[]) null;
        IndexedSpriteLayer.a(-29, (byte) -24, 121, (int[]) null, -98);
    }

    final void drawLayer(int param0) {
        if (param0 != 6) {
          this.drawLayer(77);
          this.field_d.drawOpaque(0, 0);
          return;
        }
        this.field_d.drawOpaque(0, 0);
    }

    final static AccountServiceResult createAccountSuggestionsResult(int param0, String[] param1) {
        AccountServiceResult var2 = null;
        RuntimeException var2_ref = null;
        AccountServiceResult stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new AccountServiceResult(false);
          var2.suggestions = param1;
          if (param0 != 0) {
            field_c = (String) null;
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("di.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    IndexedSpriteLayer(IndexedSprite param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "OVER <%0>";
    }
}
