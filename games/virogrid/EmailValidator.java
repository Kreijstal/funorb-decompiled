/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidator extends TextFieldValidator {
    static String[] field_r;
    static String field_z;
    static String[] field_p;
    static String field_u;
    static int field_y;
    static int field_o;
    static int field_s;
    static int[] field_A;
    static SpriteWidget field_w;
    static int[] field_B;
    static String field_n;
    static ScrollPaneWithFooter field_q;
    static int[] field_x;
    static int field_t;
    static String[] field_v;

    final String describeText(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.validationStateForText(param1, true) == GuestPlayHelpers.field_c) {
            stackIn_3_0 = IntrusiveDequeCursor.field_a;
            return stackIn_3_0;
          }
          if (param0 == -26358) {
            stackIn_8_0 = LoginCredentials.field_c;
            return stackIn_8_0;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ve.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static int hitTestMenuOption(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var4 = DirectByteStorage.field_i;
          if (param2 != 66) {
            EmailValidator.hitTestMenuOption(38, -113, (byte) -85);
          }
          while (var3_int < DropTargetWidget.field_F.length) {
            var5 = RasterBuffer.field_f[var3_int];
            if (var5 >= 0) {
              var6 = TextMeasureHelpers.measureText(true, (byte) 114, DropTargetWidget.field_F[var3_int]);
              var4 = var4 + ReflectionCheckHelpers.field_e;
              var7 = LongAndTextCredentials.field_g - (var6 >> 1);
              if (RasterBuffer.rectContains(var7 - PlayerContextMenu.field_e, param1, var6 + (PlayerContextMenu.field_e << 1), true, var4, param0, (ValidationMessageWidget.field_P << 1) + UsernameAvailabilityValidator.field_o)) {
                stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var4 = var4 + (UsernameAvailabilityValidator.field_o + (ValidationMessageWidget.field_P << 1) + ReflectionCheckHelpers.field_e);
            } else {
              var4 = var4 + NameCharacterHelpers.field_b;
            }
            var3_int++;
          }
          stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var3), "ve.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_q = null;
        field_u = null;
        if (!param0) {
          return;
        }
        field_v = null;
        field_w = null;
        field_A = null;
        field_p = null;
        field_x = null;
        field_r = null;
        field_B = null;
        field_n = null;
        field_z = null;
    }

    EmailValidator(EditableTextWidget param0) {
        super(param0);
    }

    final static void beginReconnect(byte param0) {
        if (NodeHashTableIterator.field_l == 10 ||
          !IntKeyLookup.constantTrue(11265)) {
          HuffmanCodec.showConnectionLostLogin((byte) -107);
          NodeHashTableIterator.field_l = 11;
        }
        NodeHashTableIterator.field_g = true;
        int var1 = 82 % ((18 - param0) / 59);
    }

    final AudioSetupHelpers validationStateForText(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        AudioSetupHelpers stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_B = (int[]) null;
          }
          stackIn_5_0 = (null != ValidatedTextWidget.validateEmailAddress(param0, 119)) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            return CachedTextLayout.field_i;
          }
          stackIn_8_0 = GuestPlayHelpers.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ve.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_z = "Passwords can only contain letters and numbers";
        field_t = 20;
        field_r = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_y = 0;
        field_B = new int[4];
        field_p = new String[4];
        field_A = new int[4];
        field_v = new String[4];
        field_n = "Change display name";
    }
}
