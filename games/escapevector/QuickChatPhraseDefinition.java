/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseDefinition extends DualLinkNode {
    static String field_w;
    static int[] fullTileMask;
    private int[][] commandParameters;
    static String field_y;
    static IntrusiveDeque field_u;
    static int field_r;
    int[] responseIds;
    private int[] commandIds;
    private String[] textFragments;
    static PcmSample field_t;

    private final void decodeOpcode(int guard, PacketBuffer input, int opcode) {
        String stackIn_24_2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (guard != 10691) {
            return;
          }
          if (opcode == 1) {
            this.textFragments = bb.a(-128, input.readString(false), '<');
          } else {
            if (opcode == 2) {
              var4_int = input.readUnsignedByte(guard ^ 10691);
              this.responseIds = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.responseIds[var5] = input.readUnsignedShort(1952);
              }
            } else if (opcode == 3) {
              var4_int = input.readUnsignedByte(0);
              this.commandParameters = new int[var4_int][];
              this.commandIds = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                int var6 = input.readUnsignedShort(1952);
                QuickChatDynamicCommand var7 = NameAvailabilityValidator.findQuickChatDynamicCommand((byte) -57, var6);
                if (var7 != null) {
                  this.commandIds[var5] = var6;
                  int[] array$0 = new int[var7.parameterCount];
                  this.commandParameters[var5] = array$0;
                  for (int var8 = 0; var7.parameterCount > var8; var8++) {
                    this.commandParameters[var5][var8] = input.readUnsignedShort(PacketBuffer.xor(guard, 11875));
                  }
                }
              }
            } else {
              if (opcode == 4) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var4;
          StringBuilder stackIn_23_1 = new StringBuilder().append("si.A(").append(guard).append(',');
          if (input == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(opcode).append(')').toString());
        }
    }

    final void decode(PacketBuffer input, int guard) {
        String stackIn_9_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (guard != 0) {
            this.markGlobalResponses((byte) -118);
          }
          while (true) {
            int var3_int = input.readUnsignedByte(0);
            if (var3_int == 0) {
              return;
            }
            this.decodeOpcode(10691, input, var3_int);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("si.C(");
          if (input == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    final void markGlobalResponses(byte guard) {
        int var4 = EscapeVector.obfuscationControl;
        int var2 = 46 / ((-16 - guard) / 44);
        if (this.responseIds != null) {
          for (int var3 = 0; var3 < this.responseIds.length; var3++) {
            this.responseIds[var3] = MatchingTextValidator.a(this.responseIds[var3], 32768);
          }
        }
    }

    public static void releaseStatics(int guard) {
        field_t = null;
        field_w = null;
        if (guard < 74) {
          QuickChatPhraseDefinition.releaseStatics(-4);
        }
        fullTileMask = null;
        field_y = null;
        field_u = null;
    }

    final static void showLoadingProgress(float percent, String text, boolean alternateStyle, byte guard) {
        try {
          if (guard != 14) {
            field_t = (PcmSample) null;
          }
          if (null == jb.field_r) {
            jb.field_r = new w(bo.field_F, dj.field_b);
            bo.field_F.b(jb.field_r, guard + 102);
          }
          jb.field_r.a(-100, text, percent, alternateStyle);
          SoftwareRasterizer.clearFramebuffer();
          se.a(true, guard ^ 17111);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "si.D(" + percent + ',' + (text != null ? "{...}" : "null") + ',' + alternateStyle + ',' + guard + ')');
        }
    }

    final static void inspectAppletUsername(int guard, java.applet.Applet applet) {
        String stackIn_7_2 = null;
        try {
          int var2_int = 100 % ((guard + 19) / 57);
          String var3 = applet.getParameter("username");
          if (var3 != null) {
            CharSequence var4 = (CharSequence) ((Object) var3);
            if (RasterBuffer.a((byte) 91, var4) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("si.F(").append(guard).append(',');
          if (applet == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String previewText(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.textFragments == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.textFragments[0]);
        for (int var3 = 1; var3 < this.textFragments.length; var3++) {
          StringBuilder discarded$1 = var2.append("...");
          StringBuilder discarded$2 = var5.append(this.textFragments[var3]);
        }
        if (guard != -4) {
          QuickChatPhraseDefinition.releaseStatics(100);
        }
        return var2.toString();
    }

    final static void applyGrayButtonPalette(int guard, dk button) {
        try {
          if (guard >= -60) {
            field_r = -70;
          }
          int[] var2 = new int[]{3170352, 3170352, 3170352};
          int[] var3 = new int[]{6340704, 16777215, 16777215};
          button.a(var2, var3, -2);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "si.E(" + guard + ',' + (button != null ? "{...}" : "null") + ')');
        }
    }

    QuickChatPhraseDefinition() {
    }

    static {
        fullTileMask = new int[]{};
        field_w = " - rotate ship right";
        field_r = 500;
        field_y = "Connection lost. <%0>";
    }
}
