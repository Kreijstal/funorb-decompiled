/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextTemplateDefinition extends DualLinkNode {
    static GameScreen[] screens;
    static float entityMotionSpeed;
    static int field_n;
    int[] referencedTemplateIds;
    private int[] argumentTypeIds;
    private String[] literalSegments;
    private int[][] argumentValues;

    final static String e(int param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = Geoblox.clientControlFlowFlag;
        var6 = "(" + MidiNoteMixer.field_o + " " + AttachedEntityRenderer.field_b + " " + VisualPropertyNode.field_n + ") " + ScorePopup.field_l;
        var1 = var6;
        if (0 < AchievementSubmission.field_k) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < AchievementSubmission.field_k; var2++) {
            var7 = var1 + ' ';
            var1 = var7;
            var3 = 255 & eh.field_d.bytes[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        if (param0 == 55) {
          return var1;
        }
        return (String) null;
    }

    private final void decodeOpcode(int opcode, ByteArrayBuffer buffer, int methodGuard) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        TextTemplateArgumentType var7 = null;
        int var9 = 0;
        ByteArrayBuffer var10 = null;
        var9 = Geoblox.clientControlFlowFlag;
        try {
          if (1 == opcode) {
            this.literalSegments = FullscreenFailureReason.a('<', true, buffer.readNullTerminatedText((byte) 116));
          } else {
            if (2 == opcode) {
              var4_int = buffer.readUnsignedByte((byte) 34);
              this.referencedTemplateIds = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.referencedTemplateIds[var5] = buffer.readUnsignedShortBE(true);
              }
            } else {
              if (3 == opcode) {
                var4_int = buffer.readUnsignedByte((byte) 34);
                this.argumentValues = new int[var4_int][];
                this.argumentTypeIds = new int[var4_int];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = buffer.readUnsignedShortBE(true);
                  var7 = b.findTextTemplateArgumentType(false, var6);
                  if (var7 != null) {
                    this.argumentTypeIds[var5] = var6;
                    array$0 = new int[var7.valueCount];
                    this.argumentValues[var5] = array$0;
                    for (var8 = 0; var7.valueCount > var8; var8++) {
                      this.argumentValues[var5][var8] = buffer.readUnsignedShortBE(true);
                    }
                  }
                }
              } else {
                if (opcode != 4) {
                }
              }
            }
          }
          if (methodGuard != -26093) {
            var10 = (ByteArrayBuffer) null;
            this.decode(-112, (ByteArrayBuffer) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("og.H(").append(opcode).append(',');
          if (buffer == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void markAlternateReferences(byte methodGuard) {
        int var2 = 0;
        int var3 = Geoblox.clientControlFlowFlag;
        if (methodGuard != 119) {
            entityMotionSpeed = 0.380857914686203f;
        }
        if (!(this.referencedTemplateIds == null)) {
            for (var2 = 0; this.referencedTemplateIds.length > var2; var2++) {
                this.referencedTemplateIds[var2] = lb.orInt(this.referencedTemplateIds[var2], 32768);
            }
        }
    }

    public static void f(int param0) {
        if (param0 < 71) {
            TextTemplateDefinition.e(41);
        }
        screens = null;
    }

    final String summarizeLiteralSegments(byte methodGuard) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Geoblox.clientControlFlowFlag;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (methodGuard > -7) {
            TextTemplateDefinition.f(41);
        }
        if (null == this.literalSegments) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.literalSegments[0]);
        for (var3 = 1; this.literalSegments.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.literalSegments[var3]);
        }
        return var2.toString();
    }

    TextTemplateDefinition() {
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        UnderlinedButtonRenderer.b(-6011);
        kd.field_e.hideAllDialogs(10936);
        if (param0 != 2274) {
            return;
        }
        try {
            SpriteButtonRenderer.field_t = new LoginPanel(b.field_a, (String) null, AgeValidator.field_i, param2, param3);
            ButtonWidget.field_C = new AccountContentDialog(kd.field_e, SpriteButtonRenderer.field_t);
            kd.field_e.showDialog(false, ButtonWidget.field_C);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "og.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void decode(int methodGuard, ByteArrayBuffer buffer) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 0) {
            return;
          }
          while (true) {
            var3_int = buffer.readUnsignedByte((byte) 34);
            if (0 == var3_int) {
              return;
            }
            this.decodeOpcode(var3_int, buffer, -26093);
            continue;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("og.B(").append(methodGuard).append(',');
          if (buffer == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        if (!param2) {
            String var5 = (String) null;
            TextTemplateDefinition.a((String) null, (String) null, true, (String) null);
        }
        int var4 = param0.indexOf(param3);
        while (var4 != -1) {
            param0 = param0.substring(0, var4) + param1 + param0.substring(param3.length() + var4);
            var4 = param0.indexOf(param3, param1.length() + var4);
        }
        return param0;
    }

    static {
        screens = new GameScreen[9];
    }
}
