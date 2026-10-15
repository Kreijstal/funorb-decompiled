/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class AlignedIconLabel extends UiComponent {
    UiComponent label;
    static String currentSocialServer;
    static RgbSprite field_Sb;
    private UiComponent icon;
    static int achievementTransitionMask;

    private final void layoutIconLabel(int obfuscationGuard, int inset, int gap) {
        int iconWidth;
        int labelWidth;
        int combinedWidth;
        int guardDivision;
        iconWidth = -gap;
        labelWidth = -gap;
        if (this.icon != null) {
          iconWidth = this.icon.getContentWidth(71);
        }
        if (null != this.label) {
          labelWidth = this.label.measureContentWidth(-inset + (-inset + this.width) - (iconWidth + gap), 0);
        }
        guardDivision = 40 / ((-47 - obfuscationGuard) / 42);
        combinedWidth = gap + iconWidth + inset + (labelWidth + inset);
        if (this.width < combinedWidth) {
          labelWidth = labelWidth + (this.width - combinedWidth);
          combinedWidth = this.width;
        }
        if (this.horizontalAlignment == 1) {
          inset = inset + (this.width - combinedWidth) / 2;
        }
        if (2 == this.horizontalAlignment) {
          inset = inset + (-combinedWidth + this.width);
        }
        if (null != this.icon) {
          this.icon.setBounds(this.height, 0, inset, iconWidth, (byte) 64);
          this.icon.verticalAlignment = this.verticalAlignment;
        }
        if (null != this.label) {
          this.label.setBounds(this.height, 0, gap + (inset + iconWidth), labelWidth, (byte) 64);
          this.label.verticalAlignment = this.verticalAlignment;
          if (null != this.icon) {
            this.label.horizontalAlignment = 0;
          } else {
            this.label.horizontalAlignment = this.horizontalAlignment;
          }
        }
    }

    final static boolean isAsciiAlphanumeric(byte obfuscationGuard, char character) {
        boolean stackIn_13_0 = false;
        if (obfuscationGuard >= -58) {
          return false;
        }
        stackIn_13_0 = ((!(character < 48) &&
          !(character > 57)) ||
          (!(character < 65) &&
          !(character > 90)) ||
          (!(character < 97) &&
          !(122 < character)));
        return stackIn_13_0;
    }

    public static void d(byte param0) {
        currentSocialServer = null;
        field_Sb = null;
        if (param0 != 21) {
          AlignedIconLabel.d((byte) -26);
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
          PlatformServices stackIn_16_0;
          int stackIn_16_1;
          java.net.URL stackIn_16_2;
          java.net.URL stackIn_16_3;
          java.net.URL stackIn_16_4;
          StringBuilder stackIn_16_5;
          java.net.URL stackIn_17_2;
          java.net.URL stackIn_17_3;
          String stackIn_17_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          PlatformTask var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = BrickABrac.field_J ? 1 : 0;
          try {
            if (param2 <= 27) {
              AlignedIconLabel.isAsciiAlphanumeric((byte) -93, 'K');
            }
            var3 = "";
            if (param1 != null) {
              var3 = TextValidationHelpers.a(22570, param1);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            LoginMethodPreference.a(var3, -107);
            var7 = AccountResponse.a((byte) 13, "%3a", var3, ":");
            var8 = AccountResponse.a((byte) 13, "%40", var7, "@");
            var9 = AccountResponse.a((byte) 13, "%26", var8, "&");
            var10 = AccountResponse.a((byte) 13, "%23", var9, "#");
            if (null == SecondaryHashTable.field_i) {
              return;
            }
            stackIn_16_0 = LevelPackLoader.field_e;
            stackIn_16_1 = -49;
            stackIn_16_2 = null;
            stackIn_16_3 = null;
            stackIn_16_4 = SecondaryHashTable.field_i.getCodeBase();
            stackIn_16_5 = new StringBuilder().append("clienterror.ws?c=").append(RichTextLayout.field_m).append("&u=");
            if (GameplayRenderHelpers.field_a == null) {
              stackIn_17_2 = null;
              stackIn_17_3 = null;
              stackIn_17_6 = "" + BrickGameLayerController.field_e;
            } else {
              stackIn_17_2 = null;
              stackIn_17_3 = null;
              stackIn_17_6 = GameplayRenderHelpers.field_a;
            }
            var4 = ((PlatformServices) (Object) stackIn_16_0).openUrl((byte) stackIn_16_1, new java.net.URL(stackIn_16_4, ((StringBuilder) (Object) stackIn_16_5).append(stackIn_17_6).append("&v1=").append(PlatformServices.javaVendor).append("&v2=").append(PlatformServices.javaVersion).append("&e=").append(var10).toString()));
            while (var4.status == 0) {
              BytePayloadRequest.sleepMillis(-125, 1L);
            }
            if (var4.status == 1) {
              var5 = (DataInputStream) (var4.result);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int measureIconLabelWidth(int gap, int obfuscationGuard, int inset) {
        if (obfuscationGuard != 24) {
          AlignedIconLabel.isAsciiAlphanumeric((byte) 108, '￱');
        }
        int iconWidth = -gap;
        if (this.icon != null) {
          iconWidth = this.icon.getContentWidth(107);
        }
        int labelWidth = -gap;
        if (null != this.label) {
          labelWidth = this.label.getContentWidth(64);
        }
        return inset + iconWidth + (gap + labelWidth) + inset;
    }

    final void setIconLabelBounds(int obfuscationGuard, int y, int inset, int gap, int x, int height, int width) {
        if (obfuscationGuard != -10411) {
          Throwable var9 = (Throwable) null;
          AlignedIconLabel.a((String) null, (Throwable) null, 64);
        }
        this.setBounds(height, y, x, width, (byte) 64);
        this.layoutIconLabel(obfuscationGuard ^ 10436, inset, gap);
    }

    AlignedIconLabel(long id, UiComponent styleTemplate, UiComponent iconStyle, UiComponent labelStyle, RgbSprite sprite, String text) {
        super(id, styleTemplate);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (sprite != null) {
            this.icon = new UiComponent(0L, iconStyle);
            this.icon.sprite = sprite;
            this.addChild(this.icon, 0);
          }
          if (text != null) {
            this.label = new UiComponent(0L, labelStyle, text);
            this.addChild(this.label, 0);
            this.markDescendantsToInheritVisualState(true);
          } else {
            this.markDescendantsToInheritVisualState(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("rk.<init>(").append(id).append(',');
          if (styleTemplate == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (iconStyle == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (labelStyle == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (sprite == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (text == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static MeshAttributeRecord[] decodeMeshAttributeRecords(BitPacketBuffer packet, int obfuscationGuard) {
        int recordIndex = 0;
        int version = 0;
        RuntimeException failure = null;
        int count = 0;
        MeshAttributeRecord[] records = null;
        int referenceIndex = 0;
        MeshAttributeRecord record = null;
        int unusedGameFlag = 0;
        Object unsupportedResult = null;
        MeshAttributeRecord[] result = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String packetSummary = null;
        RuntimeException caughtFailure = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          version = packet.readBits(8, (byte) -85);
          if (version > 0) {
            unsupportedResult = null;
            return (MeshAttributeRecord[]) (unsupportedResult);
          }
          if (obfuscationGuard != 24) {
            currentSocialServer = (String) null;
          }
          count = packet.readBits(12, (byte) 85);
          records = new MeshAttributeRecord[count];
          for (recordIndex = 0; recordIndex < count; recordIndex++) {
            if (DirectByteStorage.readPacketFlag(false, packet)) {
              record = new MeshAttributeRecord();
              packet.readBits(24, (byte) -115);
              packet.readBits(24, (byte) 107);
              record.baseRgb = packet.readBits(24, (byte) -86);
              packet.readBits(9, (byte) 110);
              packet.readBits(12, (byte) -113);
              packet.readBits(12, (byte) -91);
              packet.readBits(12, (byte) -112);
              records[recordIndex] = record;
            } else {
              referenceIndex = packet.readBits(GameClock.a(-1 + recordIndex, 15), (byte) 98);
              records[recordIndex] = records[referenceIndex];
            }
          }
          result = records;
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("rk.B(");
          if (packet == null) {
            packetSummary = "null";
          } else {
            packetSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(packetSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
