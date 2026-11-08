/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityValidator extends TextFieldValidator {
    static AsyncRequest field_x;
    static int[] field_D;
    private boolean field_w;
    static NineSliceFrame field_t;
    static String field_B;
    static int field_q;
    static FullscreenFocusCanvas field_u;
    private MatchingTextValidator field_A;
    static int field_v;
    static String field_z;
    private String field_y;
    static PlayerContextMenu field_s;
    static Sprite field_r;

    EmailAvailabilityValidator(EditableTextWidget param0, EditableTextWidget param1) {
        super(param0);
        this.field_w = false;
        this.field_y = "";
        try {
          this.field_A = new MatchingTextValidator(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static IndexedSprite loadSpritesFromArchive(int param0, int param1, Archive param2) {
        RuntimeException var3 = null;
        IndexedSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!GameApplet.decodeSpritesFromArchive(-141, param1, param2)) {
            return null;
          }
          if (param0 != 1) {
            field_B = (String) null;
          }
          stackIn_6_0 = ArchiveFactoryHelpers.createDecodedIndexedSprite((byte) 126);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hd.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_B = null;
        field_D = null;
        field_u = null;
        field_s = null;
        field_t = null;
        if (param0 <= -54) {
          field_z = null;
          field_r = null;
          field_x = null;
          return;
        }
        String var2 = (String) null;
        EmailAvailabilityValidator.startScreenTransition((String) null, 104, -6);
        field_z = null;
        field_r = null;
        field_x = null;
    }

    final static void startScreenTransition(String param0, int param1, int param2) {
        try {
          PasswordFieldPainter.field_x = param1;
          PointerTrailBubble.field_s = 1;
          if (param2 != -308) {
            field_B = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "hd.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void resetChildLayouts(UiComponent param0, byte param1) {
        UiComponent var4 = null;
        UiComponent var2 = null;
        int var3 = TetraLink.field_J;
        UiComponent var2Lifetime1;
        try {
          if (param1 != -104) {
            field_x = (AsyncRequest) null;
          }
          var4 = (UiComponent) (param0.field_fb.first(false));
          var2 = var4;
          while (var4 != null) {
            var4.field_mb = 0;
            var4.field_Db = 0;
            var4.field_yb = 0;
            var4.field_R = 0;
            var4 = (UiComponent) (param0.field_fb.next((byte) -70));
            var2Lifetime1 = var4;
          }
          param0.field_R = 0;
          param0.field_Db = 0;
          param0.field_mb = 0;
          param0.field_yb = 0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "hd.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ValidationState validationStateForText(int param0, String param1) {
        FlaggedTextValue var3 = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_3_0 = null;
        ValidationState stackIn_7_0 = null;
        ValidationState stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_A.validationStateForText(param0 ^ param0, param1) == QuickChatCommandType.field_h) {
            stackIn_3_0 = QuickChatCommandType.field_h;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_y)) {
            var3 = DirectByteStorage.startEmailValidation(param1, param0 ^ 0);
            if (!var3.hasChanged(false)) {
              stackIn_7_0 = LoadingProgressDialog.field_cb;
              return stackIn_7_0;
            }
            this.field_y = param1;
            this.field_w = var3.isEnabled(true);
          }
          if (this.field_w) {
            stackIn_12_0 = PlayerContextMenu.field_a;
          } else {
            stackIn_12_0 = QuickChatCommandType.field_h;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("hd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final String validationMessageForText(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 26202) {
            EmailAvailabilityValidator.releaseStatics(92);
          }
          if (this.field_A.validationStateForText(0, param0) == QuickChatCommandType.field_h) {
            stackIn_5_0 = this.field_A.validationMessageForText(param0, 26202);
            return stackIn_5_0;
          }
          if (this.validationStateForText(0, param0) != QuickChatCommandType.field_h) {
            stackIn_10_0 = AnimationSequence.field_h;
            return stackIn_10_0;
          }
          stackIn_8_0 = MouseInputHandler.field_c;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("hd.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_B = "Orb points: <%0>";
        field_z = "<%0> has entered another game.";
    }
}
