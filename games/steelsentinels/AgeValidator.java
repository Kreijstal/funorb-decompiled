/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AgeValidator extends TextFieldValidator {
    static RgbSprite[] field_s;
    static int[] field_u;
    static String field_q;
    static String field_t;
    static int[] field_o;
    static int field_n;
    static String field_r;
    static RgbSprite[] field_p;

    final static boolean b(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (param1 != 29974) {
            field_n = -3;
          }
          var2_int = param0.charAt(0);
          for (var3 = 1; param0.length() > var3; var3++) {
            if (param0.charAt(var3) != var2_int) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("eb.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_u = null;
        field_t = null;
        if (param0 > 14) {
          field_r = null;
          field_q = null;
          field_s = null;
          field_o = null;
          field_p = null;
          return;
        }
        field_s = (RgbSprite[]) null;
        field_r = null;
        field_q = null;
        field_s = null;
        field_o = null;
        field_p = null;
    }

    final vd validateText(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        vd stackIn_3_0 = null;
        vd stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!RegistrationRequestDialog.a(var4, -71)) {
            stackIn_3_0 = ArchiveProvider.field_d;
            return stackIn_3_0;
          }
          if (param1 != -1) {
            field_s = (RgbSprite[]) null;
          }
          var5 = (CharSequence) ((Object) param0);
          var3_int = dj.a(var5, -124);
          if (0 < var3_int &&
            var3_int <= 130) {
            return vf.field_b;
          }
          stackIn_10_0 = ArchiveProvider.field_d;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("eb.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final String messageForText(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.validateText(param1, -1) == ArchiveProvider.field_d) {
            stackIn_3_0 = DateOfBirthValidator.field_j;
            return stackIn_3_0;
          }
          if (param0 == 100) {
            return null;
          }
          field_u = (int[]) null;
          stackIn_7_0 = null;
          return (String) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("eb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, SceneWidget param1, SceneWidget param2, SceneWidget param3, SceneWidget param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          if (tj.field_f != null) {
            return;
          }
          jn.field_g = false;
          if (!fj.field_e) {
            if (!uc.field_g) {
              var5 = BufferedSocket.field_h;
            } else {
              var5 = TickClock.field_b;
            }
          } else {
            var5 = LobbyGame.field_Kc;
          }
          var7 = (String) null;
          ParticleEffect.showSavedLayout(-104, DebouncedValidator.field_e, var5, 0, (String) null);
          vd.field_d.field_rb = ((ReportAbuseDialog.field_ic.field_rb & 16711422) >> 1) + (DebouncedValidator.field_e - ((16711422 & DebouncedValidator.field_e) >> 1));
          vd.field_d.field_xb = (8355711 & ReportAbuseDialog.field_ic.field_xb >> 1) - ((16711422 & DebouncedValidator.field_e) >> 1) + DebouncedValidator.field_e;
          Checkbox.field_ab = DualNodeDequeIterator.field_e;
          tj.field_f = vd.field_d;
          vd.field_d.field_Mb = (ReportAbuseDialog.field_ic.field_Mb >> 1 & 8355711) - ((16711422 & DebouncedValidator.field_e) >> 1) + DebouncedValidator.field_e;
          LoginActionHelpers.field_a = new SceneWidget(0L, param2);
          LobbyPlayer.field_bc = new SceneWidget(0L, param4);
          in.field_d = new SceneWidget(0L, (SceneWidget) null);
          te.field_f = new SceneWidget(0L, param1);
          vd.field_d = new SceneWidget((long)param0, param3);
          vd.field_d.field_L = BirthDateEntryPanel.field_X;
          te.field_f.addChild(vd.field_d, 122);
          DualNodeDequeIterator.field_e = new SceneWidget(0L, Checkbox.field_ab);
          te.field_f.addChild(DualNodeDequeIterator.field_e, 125);
          vc.field_f = new SceneWidget(0L, ReportAbuseDialog.field_ic, NumericDateInputWidget.field_cb);
          Js5NetworkRequest.field_N = new SceneWidget(0L, ReportAbuseDialog.field_ic);
          LoginActionHelpers.field_a.addChild(LobbyPlayer.field_bc, 124);
          LoginActionHelpers.field_a.addChild(in.field_d, 127);
          in.field_d.addChild(te.field_f, 122);
          in.field_d.addChild(vc.field_f, 119);
          in.field_d.addChild(Js5NetworkRequest.field_N, 121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("eb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static ChatMessage a(byte param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        CipherPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = SteelSentinels.obfuscationControl;
        var8 = LoginConnectionStage.field_d;
        var2 = var8;
        var3 = var8.readUnsignedByte((byte) -87);
        HuffmanDecoder.field_a = var3 & 127;
        stackIn_3_0 = (0 != (var3 & 128));
        LobbySetupHelpers.field_e = stackIn_3_0;
        UrlAndReplyHelpers.field_b = var8.readUnsignedByte((byte) -121);
        ni.field_d = var8.readLong((byte) -116);
        if (HuffmanDecoder.field_a != 2) {
          DualNodeHashTable.field_a = 0;
          t.field_k = 0;
        } else {
          DualNodeHashTable.field_a = var8.readUnsignedShort((byte) -60);
          t.field_k = var8.readUnsignedMedium(false);
        }
        stackIn_9_0 = (var8.readUnsignedByte((byte) -77) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        DialWidgetPainter.field_g = var8.readString(1);
        if (param0 >= -50) {
          field_s = (RgbSprite[]) null;
        }
        if (var4 != 0) {
          IntKeyLookup.field_e = var8.readString(1);
        } else {
          IntKeyLookup.field_e = DialWidgetPainter.field_g;
        }
        if (HuffmanDecoder.field_a == 1) {
          ContentTransitionDialog.field_lb = var8.readUnsignedShort((byte) -60);
          uj.field_a = var8.readString(1);
        } else {
          if (HuffmanDecoder.field_a == 4) {
            ContentTransitionDialog.field_lb = var8.readUnsignedShort((byte) -60);
            uj.field_a = var8.readString(1);
          } else {
            uj.field_a = null;
            ContentTransitionDialog.field_lb = 0;
          }
        }
        if (!param1) {
          WeightedCacheEntry.field_F = cd.a(var8, 80, (byte) -100);
          ValidatedTextWidget.field_ob = null;
          return new ChatMessage(param1);
        }
        var5 = var8.readUnsignedShort((byte) -60);
        try {
          var9 = ArchiveIndex.field_w.getPhrase(var5, -81);
          WeightedCacheEntry.field_F = var9.getPreview(1);
          if (IntKeyLookup.field_e.equals(GrowableIntList.field_l)) {
            stackIn_25_0 = null;
          } else {
            stackIn_25_0 = var9.field_F;
          }
          ValidatedTextWidget.field_ob = stackIn_25_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          MusicCrossfadeStream.reportClientError("CC1", -66, (Throwable) ((Object) var6));
          WeightedCacheEntry.field_F = null;
          ValidatedTextWidget.field_ob = null;
          return new ChatMessage(param1);
        }
        return new ChatMessage(param1);
    }

    AgeValidator(EditableTextWidget param0) {
        super(param0);
    }

    static {
        field_q = "Loading...";
        field_o = new int[]{55, 53, 24, 24, 24, 24, 54, 83, 24, 24, 56, 83, 24, 24, 83, 24, 24, 97, 35, -1, -1, -1, -1, -1, -1, -1};
        field_t = "PER MONTH";
        field_r = "You are on <%0>";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static ChatMessage $cfr$intArgs$a$9d0e4b5217c4(int param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        CipherPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        CipherPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = SteelSentinels.obfuscationControl;
        var8 = LoginConnectionStage.field_d;
        var2 = var8;
        var3 = var8.readUnsignedByte((byte) -87);
        HuffmanDecoder.field_a = var3 & 127;
        stackIn_3_0 = (0 != (var3 & 128));
        LobbySetupHelpers.field_e = stackIn_3_0;
        UrlAndReplyHelpers.field_b = var8.readUnsignedByte((byte) -121);
        ni.field_d = var8.readLong((byte) -116);
        if (HuffmanDecoder.field_a != 2) {
          DualNodeHashTable.field_a = 0;
          t.field_k = 0;
        } else {
          DualNodeHashTable.field_a = var8.readUnsignedShort((byte) -60);
          t.field_k = var8.readUnsignedMedium(false);
        }
        stackIn_9_0 = (var8.readUnsignedByte((byte) -77) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        DialWidgetPainter.field_g = var8.readString(1);
        if (param0 >= -50) {
          field_s = (RgbSprite[]) null;
        }
        if (var4 != 0) {
          IntKeyLookup.field_e = var8.readString(1);
        } else {
          IntKeyLookup.field_e = DialWidgetPainter.field_g;
        }
        if (HuffmanDecoder.field_a == 1) {
          ContentTransitionDialog.field_lb = var8.readUnsignedShort((byte) -60);
          uj.field_a = var8.readString(1);
        } else {
          if (HuffmanDecoder.field_a == 4) {
            ContentTransitionDialog.field_lb = var8.readUnsignedShort((byte) -60);
            uj.field_a = var8.readString(1);
          } else {
            uj.field_a = null;
            ContentTransitionDialog.field_lb = 0;
          }
        }
        if (!param1) {
          WeightedCacheEntry.field_F = cd.a(var8, 80, (byte) -100);
          ValidatedTextWidget.field_ob = null;
          return new ChatMessage(param1);
        }
        var5 = var8.readUnsignedShort((byte) -60);
        try {
          var9 = ArchiveIndex.field_w.getPhrase(var5, -81);
          WeightedCacheEntry.field_F = var9.getPreview(1);
          if (IntKeyLookup.field_e.equals(GrowableIntList.field_l)) {
            stackIn_25_0 = null;
          } else {
            stackIn_25_0 = var9.field_F;
          }
          ValidatedTextWidget.field_ob = stackIn_25_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          MusicCrossfadeStream.reportClientError("CC1", -66, (Throwable) ((Object) var6));
          WeightedCacheEntry.field_F = null;
          ValidatedTextWidget.field_ob = null;
          return new ChatMessage(param1);
        }
        return new ChatMessage(param1);
    }
}
