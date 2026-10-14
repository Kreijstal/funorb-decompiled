/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseDefinition extends DualLinkNode {
    int[] linkedPhraseIds;
    private int[][] parameterArguments;
    private int[] parameterCommandIds;
    private String[] fragments;
    static NodeDeque soundPlaybacks;
    static UiComponent field_E;
    static UiComponent[] field_F;
    static String field_D;
    static String field_x;
    static int repeatMessageChannel;
    static UiComponent quickChatMenuRoot;
    static ResourceArchive field_C;

    final void markExtendedLinks(int obfuscationGuard) {
        int linkIndex = 0;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        int guardDivision;
        if (null != this.linkedPhraseIds) {
          for (linkIndex = 0; linkIndex < this.linkedPhraseIds.length; linkIndex++) {
            this.linkedPhraseIds[linkIndex] = LevelSelectScreen.d(this.linkedPhraseIds[linkIndex], 32768);
          }
        }
        guardDivision = 122 % ((obfuscationGuard + 60) / 61);
    }

    public static void f(int param0) {
        field_F = null;
        field_E = null;
        field_x = null;
        soundPlaybacks = null;
        field_C = null;
        field_D = null;
        quickChatMenuRoot = null;
        if (param0 != 32463) {
          QuickChatPhraseDefinition.f(-119);
        }
    }

    final String getPreview(int obfuscationGuard) {
        int fragmentIndex = 0;
        StringBuilder ignoredSeparatorAppend = null;
        StringBuilder ignoredFragmentAppend = null;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        StringBuilder preview = new StringBuilder(80);
        StringBuilder previewAlias = preview;
        if (null == this.fragments) {
          return "";
        }
        StringBuilder ignoredFirstFragmentAppend = preview.append(this.fragments[0]);
        if (obfuscationGuard != -3) {
          return (String) null;
        }
        for (fragmentIndex = 1; fragmentIndex < this.fragments.length; fragmentIndex++) {
          ignoredSeparatorAppend = previewAlias.append("...");
          ignoredFragmentAppend = preview.append(this.fragments[fragmentIndex]);
        }
        return previewAlias.toString();
    }

    private final void decodeTag(int tag, int obfuscationGuard, PacketBuffer packet) {
        int[] arguments = null;
        int argumentIndex = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int count = 0;
        RuntimeException var4 = null;
        int entryIndex = 0;
        int commandId = 0;
        QuickChatParameterType parameterType = null;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != -3) {
            this.parameterCommandIds = (int[]) null;
          }
          if (tag != 1) {
            if (tag == 2) {
              count = packet.readUnsignedByte(255);
              this.linkedPhraseIds = new int[count];
              for (entryIndex = 0; entryIndex < count; entryIndex++) {
                this.linkedPhraseIds[entryIndex] = packet.readUnsignedShort(65280);
              }
            } else if (tag == 3) {
              count = packet.readUnsignedByte(255);
              this.parameterCommandIds = new int[count];
              this.parameterArguments = new int[count][];
              for (entryIndex = 0; count > entryIndex; entryIndex++) {
                commandId = packet.readUnsignedShort(65280);
                parameterType = Ball.findQuickChatParameterType(commandId, (byte) 84);
                if (parameterType != null) {
                  this.parameterCommandIds[entryIndex] = commandId;
                  arguments = new int[parameterType.definitionWordCount];
                  this.parameterArguments[entryIndex] = arguments;
                  for (argumentIndex = 0; parameterType.definitionWordCount > argumentIndex; argumentIndex++) {
                    this.parameterArguments[entryIndex][argumentIndex] = packet.readUnsignedShort(65280);
                  }
                }
              }
            } else {
              if (tag != 4) {
                return;
              }
            }
          } else {
            this.fragments = FarmBackground.a((byte) -63, packet.readCp1252String(-1), '<');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("wd.F(").append(tag).append(',').append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void decode(PacketBuffer packet, int obfuscationGuard) {
        int tag = 0;
        int unusedGameFlag = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != -3) {
            this.markExtendedLinks(-2);
          }
          while (true) {
            tag = packet.readUnsignedByte(255);
            if (tag == 0) {
              return;
            }
            this.decodeTag(tag, -3, packet);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wd.B(");
          if (packet == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, UiComponent param2) {
        ContextActionController var9 = null;
        RgbSprite var11 = null;
        String var10 = null;
        ContextActionController var12 = null;
        RgbSprite var14 = null;
        String var13 = null;
        ContextActionController var15 = null;
        RgbSprite var17 = null;
        String var16 = null;
        ContextActionController var18 = null;
        RgbSprite var20 = null;
        String var19 = null;
        ContextActionController var21 = null;
        RgbSprite var23 = null;
        String var22 = null;
        ContextActionController var24 = null;
        RgbSprite var26 = null;
        String var25 = null;
        ContextActionController var27 = null;
        String var28 = null;
        ContextActionController var30 = null;
        RgbSprite var32 = null;
        String var31 = null;
        ContextActionController var33 = null;
        RgbSprite var35 = null;
        String var34 = null;
        int var6 = 0;
        int var7 = 0;
        RgbSprite var29 = null;
        RgbSprite var29Lifetime1;
        RgbSprite var29Lifetime2;
        RgbSprite var29Lifetime3;
        RgbSprite var29Lifetime4;
        RgbSprite var29Lifetime5;
        RgbSprite var29Lifetime6;
        SpriteGeometry.a(param1, param2, (ScrollPane) null, (int[]) null, (String) null, -1, (byte) -58, 0L, (String) null);
        if (param1 == 0) {
          var9 = bm.contextActions;
          var11 = ef.field_b[0];
          var29 = var11;
          var29Lifetime2 = var11;
          var10 = Bzip2State.field_m;
          var9.contextMenu.addIconAction(var10, 108, 11, var11);
          var12 = bm.contextActions;
          var14 = ef.field_b[1];
          var29Lifetime3 = var14;
          var29Lifetime4 = var14;
          var13 = DirectByteStorage.field_l;
          var12.contextMenu.addIconAction(var13, 105, 12, var14);
          var15 = bm.contextActions;
          var17 = ef.field_b[2];
          var29Lifetime5 = var17;
          var29Lifetime6 = var17;
          var16 = co.field_e;
          var15.contextMenu.addIconAction(var16, 112, 13, var17);
        }
        if (1 == param1) {
          var18 = bm.contextActions;
          var20 = ef.field_b[0];
          var19 = LegacyUtf8Decoder.field_a;
          var18.contextMenu.addIconAction(var19, param0 ^ 864, 11, var20);
          var21 = bm.contextActions;
          var23 = ef.field_b[1];
          var22 = DualLinkNode.field_m;
          var21.contextMenu.addIconAction(var22, 123, 12, var23);
          var24 = bm.contextActions;
          var26 = ef.field_b[2];
          var25 = CacheIoWorker.field_b;
          var24.contextMenu.addIconAction(var25, param0 ^ 843, 13, var26);
        }
        if (param1 == 2) {
          var27 = bm.contextActions;
          var29Lifetime1 = ef.field_b[0];
          var28 = ObjectHistoryBuffer.field_l;
          var27.contextMenu.addIconAction(var28, param0 - 686, 11, var29Lifetime1);
          var30 = bm.contextActions;
          var32 = ef.field_b[1];
          var31 = HotspotTextWidget.field_M;
          var30.contextMenu.addIconAction(var31, param0 - 720, 12, var32);
          var33 = bm.contextActions;
          var35 = ef.field_b[2];
          var34 = EmailAvailabilityRequest.field_b;
          var33.contextMenu.addIconAction(var34, param0 - 708, 13, var35);
        }
        ContextActionController var36 = bm.contextActions;
        int var4 = param2.screenX;
        int var5 = param2.screenY;
        if (param0 != 784) {
          return;
        }
        try {
          var6 = param2.width;
          var7 = param2.height;
          var36.contextMenu.layoutAtAnchor(var5, -124, var7, var6, var4);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wd.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    QuickChatPhraseDefinition() {
    }

    static {
        soundPlaybacks = new NodeDeque();
        field_D = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_x = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
