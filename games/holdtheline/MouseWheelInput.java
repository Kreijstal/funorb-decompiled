/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MouseWheelInput {
    static SpriteAsset field_a;
    static int field_b;
    static RotatedSpriteAsset field_c;
    static NamedSoundEffect field_d;

    final static void recordBestLapTime(int param0, int param1, byte param2, int param3) {
        IsaacPacketBuffer var5;
        if (-1 == QuickChatPhraseDefinition.field_v[param1][param3] ||
          !(QuickChatPhraseDefinition.field_v[param1][param3] <= param0)) {
          QuickChatPhraseDefinition.field_v[param1][param3] = param0;
          GrowableStringList.savePlayerProgress(0);
        }
        if (param2 != 62) {
          var5 = (IsaacPacketBuffer) null;
          MouseWheelInput.readPackedShortArray((short[]) null, -26, (IsaacPacketBuffer) null, true);
        }
    }

    final static boolean a(Vector2f param0, Point2i param1, int param2, int param3, Vector2f param4, int param5, int param6, Point2i param7, int param8) {
        int var20_int = 0;
        int var9_int = 0;
        int var10 = 0;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        int var22 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        float var20Lifetime1;
        float var21Lifetime1;
        var22 = HoldTheLine.field_D;
        try {
          var9_int = -param7.x + param1.x;
          var10 = -param7.y + param1.y;
          var11 = Math.abs(param0.x * param4.x + param0.y * param4.y);
          var12 = Math.abs(-(param0.y * param4.x) + param0.x * param4.y);
          var13 = var12;
          var14 = var11;
          var15 = param4.x * (float)var9_int + (float)var10 * param4.y;
          var16 = (float)var9_int * param4.y - (float)var10 * param4.x;
          var17 = (float)var10 * param0.y + param0.x * (float)var9_int;
          var18 = param0.y * (float)var9_int - param0.x * (float)var10;
          ShadedRoadStripRenderer.field_s[0] = (float)(-param5) + (-(var13 * (float)param6) - var11 * (float)param3 + Math.abs(var15));
          if (param8 != 7527) {
            field_a = (SpriteAsset) null;
          }
          if (ShadedRoadStripRenderer.field_s[0] > 0.0f) {
            return false;
          }
          ShadedRoadStripRenderer.field_s[1] = -(var14 * (float)param6) - var12 * (float)param3 + Math.abs(var16) - (float)param2;
          if (ShadedRoadStripRenderer.field_s[1] > 0.0f) {
            return false;
          }
          ShadedRoadStripRenderer.field_s[2] = -((float)param2 * var12) - (float)param5 * var11 + Math.abs(var17) - (float)param3;
          if (ShadedRoadStripRenderer.field_s[2] > 0.0f) {
            return false;
          }
          ShadedRoadStripRenderer.field_s[3] = Math.abs(var18) - (var14 * (float)param2 + (float)param5 * var13) - (float)param6;
          if (0.0f < ShadedRoadStripRenderer.field_s[3]) {
            return false;
          }
          CheckboxRenderer.field_o = 0;
          var19 = ShadedRoadStripRenderer.field_s[0];
          for (var20_int = 1; var20_int < 4; var20_int++) {
            if (var19 < ShadedRoadStripRenderer.field_s[var20_int]) {
              var19 = ShadedRoadStripRenderer.field_s[var20_int];
              CheckboxRenderer.field_o = var20_int * 2;
            }
          }
          EntitySound.field_k = -var19;
          if (CheckboxRenderer.field_o == 0) {
            SecondaryNodeDequeIterator.field_c = new Vector2f(param4);
            var20 = DualLinkNode.signumFloat(-29407, param0.dot(param4, (byte) -10)) * param0.x * (float)param3 - DualLinkNode.signumFloat(-29407, param0.cross(param4, true)) * param0.y * (float)param6;
            var21 = (float)param3 * (DualLinkNode.signumFloat(-29407, param0.dot(param4, (byte) -10)) * param0.y) + DualLinkNode.signumFloat(-29407, param0.cross(param4, true)) * param0.x * (float)param6;
            if (var15 > 0.0f) {
              SecondaryNodeDequeIterator.field_c.scale(-1.0f, -1);
              var21 = -var21;
              var20 = -var20;
              CheckboxRenderer.field_o = CheckboxRenderer.field_o + 1;
            }
            RasterBuffer.field_d = var20 + (float)param1.x;
            IterableSecondaryNodeDeque.field_b = (float)param1.y + var21;
            return true;
          }
          if (CheckboxRenderer.field_o == 2) {
            SecondaryNodeDequeIterator.field_c = param4.perpendicular((byte) -74);
            var20Lifetime1 = (float)param3 * (DualLinkNode.signumFloat(-29407, param0.cross(param4, true)) * param0.x) + (float)param6 * (DualLinkNode.signumFloat(param8 - 36934, param0.dot(param4, (byte) -10)) * param0.y);
            var21Lifetime1 = (float)param3 * (DualLinkNode.signumFloat(-29407, param0.cross(param4, true)) * param0.y) - (float)param6 * (DualLinkNode.signumFloat(-29407, param0.dot(param4, (byte) -10)) * param0.x);
            if (0.0f < var16) {
              SecondaryNodeDequeIterator.field_c.scale(-1.0f, -1);
              var21Lifetime1 = -var21Lifetime1;
              CheckboxRenderer.field_o = CheckboxRenderer.field_o + 1;
              var20Lifetime1 = -var20Lifetime1;
            }
            RasterBuffer.field_d = (float)param1.x + var20Lifetime1;
            IterableSecondaryNodeDeque.field_b = (float)param1.y + var21Lifetime1;
          } else {
            if (CheckboxRenderer.field_o != 4) {
              SecondaryNodeDequeIterator.field_c = param0.perpendicular((byte) -81);
              var20Lifetime1 = DualLinkNode.signumFloat(param8 ^ -28602, param4.cross(param0, true)) * param4.x * (float)param5 + (float)param2 * (DualLinkNode.signumFloat(-29407, param4.dot(param0, (byte) -10)) * param4.y);
              var21Lifetime1 = (float)param5 * (DualLinkNode.signumFloat(-29407, param4.cross(param0, true)) * param4.y) - DualLinkNode.signumFloat(param8 - 36934, param4.dot(param0, (byte) -10)) * param4.x * (float)param2;
              if (var18 > 0.0f) {
                SecondaryNodeDequeIterator.field_c.scale(-1.0f, -1);
                var21Lifetime1 = -var21Lifetime1;
                var20Lifetime1 = -var20Lifetime1;
                CheckboxRenderer.field_o = CheckboxRenderer.field_o + 1;
              }
              IterableSecondaryNodeDeque.field_b = var21Lifetime1 + (float)param7.y;
              RasterBuffer.field_d = (float)param7.x + var20Lifetime1;
            } else {
              SecondaryNodeDequeIterator.field_c = new Vector2f(param0);
              var20Lifetime1 = (float)param5 * (DualLinkNode.signumFloat(-29407, param4.dot(param0, (byte) -10)) * param4.x) - DualLinkNode.signumFloat(-29407, param4.cross(param0, true)) * param4.y * (float)param2;
              var21Lifetime1 = (float)param5 * (DualLinkNode.signumFloat(-29407, param4.dot(param0, (byte) -10)) * param4.y) + DualLinkNode.signumFloat(-29407, param4.cross(param0, true)) * param4.x * (float)param2;
              if (0.0f < var17) {
                SecondaryNodeDequeIterator.field_c.scale(-1.0f, param8 - 7528);
                CheckboxRenderer.field_o = CheckboxRenderer.field_o + 1;
                var20Lifetime1 = -var20Lifetime1;
                var21Lifetime1 = -var21Lifetime1;
              }
              RasterBuffer.field_d = var20Lifetime1 + (float)param7.x;
              IterableSecondaryNodeDeque.field_b = var21Lifetime1 + (float)param7.y;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_47_0 = var9;
          stackIn_47_1 = new StringBuilder().append("jf.B(");
          if (param0 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (param1 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param8).append(')').toString());
        }
    }

    abstract void attach(java.awt.Component param0, byte param1);

    abstract int pollRotation(byte param0);

    final static short[] readPackedShortArray(short[] param0, int param1, IsaacPacketBuffer param2, boolean param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = HoldTheLine.field_D;
        try {
          var4_int = param2.readBits(param1, 7);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param3) {
            field_a = (SpriteAsset) null;
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new short[var4_int];
          }
          var5 = param2.readBits(4, 7);
          var6 = (short)param2.readBits(16, 7);
          if (0 >= var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)(var6 + param2.readBits(var5, 7));
            }
          }
          stackIn_18_0 = (short[]) (param0);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("jf.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_d = null;
        if (param0 != 106) {
          MouseWheelInput.advanceTextLine(-4);
        }
        field_a = null;
        field_c = null;
    }

    final static void advanceTextLine(int param0) {
        int fieldTemp$1 = 0;
        if (param0 != 4) {
          field_c = (RotatedSpriteAsset) null;
        }
        if (TutorialScriptState.lines.length > ArchiveIndex.field_a) {
          fieldTemp$1 = ArchiveIndex.field_a;
          ArchiveIndex.field_a = ArchiveIndex.field_a + 1;
          MidiPcmStream.field_q = TutorialScriptState.lines[fieldTemp$1];
        } else {
          MidiPcmStream.field_q = null;
        }
    }

    abstract void detach(java.awt.Component param0, int param1);

    static {
        field_b = -1;
    }
}
