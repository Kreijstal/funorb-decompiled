/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextFieldValidator {
    static int field_j;
    private EditableTextField field_l;
    private EditableTextField field_i;
    static int field_k;

    final ValidationState validateText(String param0, byte param1) {
        boolean discarded$1 = false;
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        ValidationState stackIn_4_0 = null;
        ValidationState stackIn_8_0 = null;
        ValidationState stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 52) {
            var5 = (String) null;
            discarded$1 = this.containsEmailPart((String) null, (byte) 79);
          }
          var3 = this.field_i.text.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            stackIn_4_0 = LinearPointPath.field_k;
            return stackIn_4_0;
          }
          if (!AccountProtocolState.isPasswordAllowed(-103, var3, var4)) {
            stackIn_8_0 = LinearPointPath.field_k;
            return stackIn_8_0;
          }
          if (!this.containsEmailPart(param0, (byte) -57)) {
            return PointPath.field_d;
          }
          stackIn_12_0 = LinearPointPath.field_k;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("wa.N(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ChatMessage readChatMessage(boolean param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        IsaacPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = HoldTheLine.field_D;
        var8 = RoadStripRenderer.field_e;
        var3 = var8.readUnsignedByte((byte) -70);
        stackIn_3_0 = ((128 & var3) != 0);
        LeaderboardPlayer.field_f = stackIn_3_0;
        MusicPatch.field_m = 127 & var3;
        RoadShadowRenderer.field_o = var8.readUnsignedByte((byte) -104);
        BoundaryIntervalBuilder.field_c = var8.readLong(true);
        if (MusicPatch.field_m != 2) {
          MidiPcmStream.field_H = 0;
          NineSlicePanel.field_f = 0;
        } else {
          MidiPcmStream.field_H = var8.readUnsignedShort(-108);
          NineSlicePanel.field_f = var8.readUnsignedMedium(false);
        }
        stackIn_9_0 = (1 != var8.readUnsignedByte((byte) -101)) ? 0 : 1;
        var4 = stackIn_9_0;
        Js5Transport.field_a = var8.readCp1252String(-1231);
        if (param1) {
          field_k = 82;
        }
        if (var4 == 0) {
          TextFieldRenderer.field_u = Js5Transport.field_a;
        } else {
          TextFieldRenderer.field_u = var8.readCp1252String(-1231);
        }
        if (1 == MusicPatch.field_m) {
          var8.readUnsignedShort(95);
          var8.readCp1252String(-1231);
        } else {
          if (MusicPatch.field_m == 4) {
            var8.readUnsignedShort(95);
            var8.readCp1252String(-1231);
          }
        }
        if (!param0) {
          SocialListEntry.field_kb = HuffmanTextCodec.readHuffmanString(80, var8, param1);
          TextLayout.field_d = null;
          return new ChatMessage(param0);
        }
        var5 = var8.readUnsignedShort(99);
        try {
          var9 = DialWidget.field_H.getPhrase(var5, 1);
          SocialListEntry.field_kb = var9.getTemplateText(245197136);
          if (TextFieldRenderer.field_u.equals(QuickChatPhraseCache.field_e)) {
            stackIn_24_0 = null;
          } else {
            stackIn_24_0 = var9.field_o;
          }
          TextLayout.field_d = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          MusicPatchPcmStream.reportClientError((Throwable) ((Object) var6), (byte) -49, "CC1");
          TextLayout.field_d = null;
          SocialListEntry.field_kb = null;
          return new ChatMessage(param0);
        }
        return new ChatMessage(param0);
    }

    final static int hitTestBenefitsButton(int param0, int param1, int param2) {
        if (NodeHashTableIterator.field_h == null) {
          return -1;
        }
        if (param0 <= 114) {
          return -100;
        }
        if (param2 < Point2i.field_b) {
          if (LoginForm.field_J > param2) {
            return -1;
          }
          if (param2 >= NodeHashTableIterator.field_h.width + LoginForm.field_J) {
            return -1;
          }
          if (param1 < ShadedRoadStripRenderer.field_t) {
            return -1;
          }
          if (ShadedRoadStripRenderer.field_t + NodeHashTableIterator.field_h.height > param1) {
            return 1;
          }
          return -1;
        }
        if (param2 >= NodeHashTableIterator.field_h.width + Point2i.field_b) {
          if (LoginForm.field_J > param2) {
            return -1;
          }
          if (param2 >= NodeHashTableIterator.field_h.width + LoginForm.field_J) {
            return -1;
          }
          if (param1 < ShadedRoadStripRenderer.field_t) {
            return -1;
          }
          if (ShadedRoadStripRenderer.field_t + NodeHashTableIterator.field_h.height > param1) {
            return 1;
          }
          return -1;
        }
        if (param1 >= LoginChoicePanel.field_L &&
          LoginChoicePanel.field_L + NodeHashTableIterator.field_h.height > param1) {
          return 0;
        }
        if (LoginForm.field_J > param2) {
          return -1;
        }
        if (param2 >= NodeHashTableIterator.field_h.width + LoginForm.field_J) {
          return -1;
        }
        if (param1 < ShadedRoadStripRenderer.field_t) {
          return -1;
        }
        if (ShadedRoadStripRenderer.field_t + NodeHashTableIterator.field_h.height <= param1) {
          return -1;
        }
        return 1;
    }

    final String getTextValidationMessage(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_i.text.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 == var4.length()) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (!param1) {
            field_k = -118;
          }
          var5 = var4;
          if (TrackCurve.hasInvalidPasswordLength(var5, (byte) -27)) {
            stackIn_8_0 = LoginMethodPreference.field_b;
            return stackIn_8_0;
          }
          if (IntArrayReadRequest.containsNonAlphanumeric(0, var5)) {
            stackIn_11_0 = GameAppletShell.field_c;
            return stackIn_11_0;
          }
          if (DelayedServerPacket.hasRepeatedCharacter(var5, 1)) {
            stackIn_15_0 = NineSliceSpriteFactory.field_a;
            return stackIn_15_0;
          }
          if (this.containsEmailPart(param0, (byte) -57)) {
            stackIn_19_0 = MenuList.field_i;
            return stackIn_19_0;
          }
          if (0 >= var6.length()) {
            stackIn_22_0 = BoundaryCurve.field_m;
            return stackIn_22_0;
          }
          if (AccountUiUtilities.containsForwardOrReversed(var5, (byte) 126, var6)) {
            stackIn_25_0 = ShadedRoadStripRenderer.field_p;
            return stackIn_25_0;
          }
          if (LeaderboardPlayer.containsForwardOrReversed(var5, var6, 95)) {
            stackIn_29_0 = IntegerTextParser.field_c;
            return stackIn_29_0;
          }
          if (!GzipDecompressor.containsNameWithoutUnderscores((byte) -127, var5, var6)) {
            stackIn_34_0 = LoginMethodPreference.field_b;
            return stackIn_34_0;
          }
          stackIn_32_0 = ShadedRoadStripRenderer.field_p;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("wa.L(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(')').toString());
        }
    }

    final static Sprite[] createSolidBeveledPanel(int param0, int param1, int param2, int param3, int param4) {
        Sprite[] var6 = new Sprite[9];
        Sprite[] var5 = var6;
        Sprite dupTemp$0 = NanoTickClock.createSolidSquareSprite(param2, 124, param0);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[param1] = dupTemp$0;
        var5[0] = dupTemp$0;
        Sprite dupTemp$1 = NanoTickClock.createSolidSquareSprite(param4, Vector2i.xor(param1, -97), param0);
        var5[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 == 0) {
          return var5;
        }
        var5[4] = NanoTickClock.createSolidSquareSprite(param3, param1 - 108, 64);
        return var5;
    }

    PasswordValidator(EditableTextField param0, EditableTextField param1, EditableTextField param2) {
        super(param0);
        try {
          this.field_l = param2;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean containsEmailPart(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -57) {
            this.field_i = (EditableTextField) null;
          }
          var3 = this.field_l.text.toLowerCase();
          var4 = param0.toLowerCase();
          if (var3.length() > 0 &&
            var4.length() > 0) {
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0) {
              if (var3.length() - 1 <= var5) {
                return false;
              }
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("wa.V(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
