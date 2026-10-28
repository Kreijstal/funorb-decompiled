/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextFieldValidator {
    static int field_n;
    private EditableTextWidget field_o;
    private EditableTextWidget field_q;
    static ResourceArchive field_p;
    static String field_s;
    static String field_r;

    final String messageForText(byte guard, String text) {
        String stackIn_37_2 = null;
        try {
          String var7 = this.field_q.text.toLowerCase();
          String var4 = text.toLowerCase();
          if (0 == var4.length()) {
            return null;
          }
          String var5 = var4;
          if (LegacyWidgetStyle.isOutsidePasswordLength((byte) -7, var5)) {
            String stackIn_6_0 = TerrainMap.field_e;
            return stackIn_6_0;
          }
          if (MatchingTextValidator.b((byte) -78, var5)) {
            String stackIn_10_0 = gn.field_b;
            return stackIn_10_0;
          }
          if (RepeatedCharacterSupport.isRepeatedCharacter(1, var5)) {
            String stackIn_14_0 = PacketBuffer.field_j;
            return stackIn_14_0;
          }
          int var6 = 78 / ((guard - 10) / 51);
          if (this.b((byte) 53, text)) {
            String stackIn_17_0 = bg.field_b;
            return stackIn_17_0;
          }
          if (var7.length() <= 0) {
            String stackIn_33_0 = ml.field_b;
            return stackIn_33_0;
          }
          if (lg.a(0, var5, var7)) {
            String stackIn_22_0 = IntrusiveDeque.field_b;
            return stackIn_22_0;
          }
          if (ValidationHelpWidget.containsIdentifierVariant(var5, (byte) 37, var7)) {
            String stackIn_26_0 = DiskCacheWorker.field_a;
            return stackIn_26_0;
          }
          if (!RockBuster.a(-115, var5, var7)) {
            String stackIn_31_0 = TerrainMap.field_e;
            return stackIn_31_0;
          }
          String stackIn_29_0 = IntrusiveDeque.field_b;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_36_0 = var3;
          StringBuilder stackIn_36_1 = new StringBuilder().append("nk.L(").append(guard).append(',');
          if (text == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final static void h(int param0) {
        if (param0 != -8055) {
          field_n = -37;
          ImageProducerRasterBuffer.field_l = null;
          UiContainer.field_z = null;
          return;
        }
        ImageProducerRasterBuffer.field_l = null;
        UiContainer.field_z = null;
    }

    private final boolean b(byte param0, String param1) {
        String stackIn_19_2 = null;
        try {
          if (param0 != 53) {
            field_s = (String) null;
          }
          String var3 = this.field_o.text.toLowerCase();
          String var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (0 >= var4.length()) {
              return false;
            }
            int var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < var3.length() - 1) {
              String var6 = var3.substring(0, var5);
              String var7 = var3.substring(1 + var5);
              if (0 > var4.indexOf(var6)) {
                boolean stackIn_13_0 = (0 <= var4.indexOf(var7));
                return stackIn_13_0;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var3_ref;
          StringBuilder stackIn_18_1 = new StringBuilder().append("nk.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static int a(int param0, LegacyButton param1) {
        String stackIn_10_2 = null;
        try {
          if (param1 == null) {
            int stackIn_2_0 = 8192;
            return stackIn_2_0;
          }
          int var2_int = param1.x + param1.width / 2;
          if (param0 >= -83) {
            field_p = (ResourceArchive) null;
          }
          int stackIn_6_0 = var2_int * 16384 / 640;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var2;
          StringBuilder stackIn_9_1 = new StringBuilder().append("nk.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final ValidationState validateText(int guard, String text) {
        String stackIn_13_2 = null;
        try {
          String var3 = this.field_q.text.toLowerCase();
          String var4 = text.toLowerCase();
          if (guard == ~var4.length()) {
            ValidationState stackIn_2_0 = ArchiveProvider.field_a;
            return stackIn_2_0;
          }
          if (!DelegatingCanvas.isPasswordAcceptable(var4, false, var3)) {
            ValidationState stackIn_5_0 = ArchiveProvider.field_a;
            return stackIn_5_0;
          }
          if (!this.b((byte) 53, text)) {
            return IsaacRandom.field_h;
          }
          ValidationState stackIn_9_0 = ArchiveProvider.field_a;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("nk.G(").append(guard).append(',');
          if (text == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        if (!AchievementRecord.a(param1, -102)) {
          return 1;
        }
        if (param0 == 1) {
          return SavedDataQuerySupport.field_g[param1];
        }
        field_p = (ResourceArchive) null;
        return SavedDataQuerySupport.field_g[param1];
    }

    public static void releaseStatics(int guard) {
        field_p = null;
        if (guard != 29779) {
          field_s = (String) null;
          field_s = null;
          field_r = null;
          return;
        }
        field_s = null;
        field_r = null;
    }

    final static void b(int param0, int param1) {
        if (null != SocketJs5Transport.field_r) {
          SocketJs5Transport.field_r.a(param0, 3748);
        }
        if (param1 > -121) {
          PasswordValidator.a(-97, -50);
          return;
        }
    }

    PasswordValidator(EditableTextWidget param0, EditableTextWidget param1, EditableTextWidget param2) {
        super(param0);
        try {
          this.field_q = param1;
          this.field_o = param2;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "nk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "You are not currently logged in to the<nbsp>game.";
        field_s = "Show elapsed time: ";
    }
}
