/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameAvailabilityValidator extends TextFieldValidator {
    static PcmSample field_p;
    private boolean field_n;
    static LoginMethod field_q;
    private String field_s;
    static int[] field_o;
    static PacketBuffer field_r;

    NameAvailabilityValidator(EditableTextWidget param0) {
        super(param0);
        this.field_n = false;
    }

    final void clearCachedName(int guard) {
        this.field_s = null;
        if (guard != 22186) {
          String var3 = (String) null;
          this.messageForText((byte) -126, (String) null);
        }
    }

    final ValidationState validateText(int guard, String text) {
        ValidationState stackIn_17_0 = null;
        String stackIn_21_2 = null;
        try {
          CharSequence var4 = (CharSequence) ((Object) text);
          if (!tg.a(87, var4)) {
            ValidationState stackIn_3_0 = ArchiveProvider.field_a;
            return stackIn_3_0;
          }
          if (guard != -1) {
            field_p = (PcmSample) null;
          }
          if (!text.equals(this.field_s)) {
            NameAvailabilityResult var3 = of.a(122, text);
            if (var3 != null &&
              null == var3.field_f) {
              this.field_n = var3.field_a;
              this.field_s = text;
            } else {
              ValidationState stackIn_12_0 = ug.field_c;
              return stackIn_12_0;
            }
          }
          if (!this.field_n) {
            stackIn_17_0 = ArchiveProvider.field_a;
          } else {
            stackIn_17_0 = IsaacRandom.field_h;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var3_ref;
          StringBuilder stackIn_20_1 = new StringBuilder().append("kf.G(").append(guard).append(',');
          if (text == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static int scaleCampaignBonus(int guard, int gameMode, int value) {
        if (gameMode == 0) {
          return value;
        }
        if (gameMode == 1) {
          return value;
        }
        if (gameMode == 2) {
          return 100 * value;
        }
        if (guard <= 5) {
          return 107;
        }
        if (gameMode != 3) {
          return value;
        }
        return value * 100;
    }

    final static QuickChatDynamicCommand findQuickChatDynamicCommand(byte guard, int id) {
        int var5 = EscapeVector.obfuscationControl;
        QuickChatDynamicCommand[] var6 = Bullet.quickChatDynamicCommands(-91);
        QuickChatDynamicCommand[] var2 = var6;
        int var3 = 2 % ((3 - guard) / 49);
        for (int var4 = 0; var6.length > var4; var4++) {
          if (id == var6[var4].id) {
            return var6[var4];
          }
        }
        return null;
    }

    final String messageForText(byte guard, String text) {
        String stackIn_19_2 = null;
        try {
          CharSequence var6 = (CharSequence) ((Object) text);
          String var3 = ok.a(0, var6);
          int var4 = 4 / ((guard - 10) / 51);
          if (var3 != null) {
            String stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (!text.equals(this.field_s)) {
            NameAvailabilityResult var5 = of.a(122, text);
            if (var5 == null) {
              return null;
            }
            if (var5.field_f != null) {
              Object stackIn_9_0 = null;
              return (String) (stackIn_9_0);
            }
            this.field_n = var5.field_a;
            this.field_s = text;
          }
          if (this.field_n) {
            String stackIn_15_0 = NineSliceFrame.field_b;
            return stackIn_15_0;
          }
          String stackIn_13_0 = RasterBuffer.field_b;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var3_ref;
          StringBuilder stackIn_18_1 = new StringBuilder().append("kf.L(").append(guard).append(',');
          if (text == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_q = null;
        field_r = null;
        if (guard == 0) {
          field_p = null;
          field_o = null;
          return;
        }
        field_q = (LoginMethod) null;
        field_p = null;
        field_o = null;
    }

    static {
        field_o = new int[4];
        field_q = new LoginMethod("email");
    }
}
