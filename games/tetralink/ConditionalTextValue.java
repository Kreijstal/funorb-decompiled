/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConditionalTextValue {
    private String field_b;
    static String[] field_c;
    private boolean field_g;
    static MenuInputState field_a;
    static String field_f;
    static String field_e;
    static int field_d;

    final String getText(byte param0) {
        if (param0 >= -48) {
          return (String) null;
        }
        return this.field_b;
    }

    final boolean isSelected(int param0) {
        if (param0 != 0) {
          this.field_b = (String) null;
          return this.field_g;
        }
        return this.field_g;
    }

    ConditionalTextValue(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_b = param0;
          if (null == this.field_b) {
            this.field_b = "";
          }
          stackIn_6_1 = (param1);
          this.field_g = stackIn_6_1;
          if (0 != this.field_b.length()) {
            return;
          }
          this.field_g = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hb.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    ConditionalTextValue(String param0) {
        this(param0, false);
    }

    final static String getLoginNameOrDefault(int param0) {
        String var1 = "";
        if (param0 == -8927) {
          if (ChatReceiveHelpers.field_c != null) {
            var1 = ChatReceiveHelpers.field_c.getAccountIdentifier(false);
          }
          if (0 == var1.length()) {
            var1 = RasterTargetHelpers.getLocalPlayerName(6);
          }
          if (var1.length() == 0) {
            var1 = FontAndBrightnessHelpers.field_a;
          }
          return var1;
        }
        ConditionalTextValue.releaseStatics(75);
        if (ChatReceiveHelpers.field_c != null) {
          var1 = ChatReceiveHelpers.field_c.getAccountIdentifier(false);
        }
        if (0 == var1.length()) {
          var1 = RasterTargetHelpers.getLocalPlayerName(6);
        }
        if (var1.length() == 0) {
          var1 = FontAndBrightnessHelpers.field_a;
        }
        return var1;
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        field_f = null;
        if (param0 >= -107) {
          field_f = (String) null;
        }
    }

    static {
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = new MenuInputState(1);
        field_f = "Please select an option in the '<%0>' row.";
        field_e = "<%0> has dropped out.";
    }
}
