/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategoryDefinition extends DualLinkNode {
    boolean rootMarker;
    int[] subcategoryIds;
    static int field_z;
    static String[] field_E;
    String title;
    static int field_y;
    char[] phraseShortcuts;
    static volatile boolean livePointerChanged;
    int[] phraseIds;
    char[] subcategoryShortcuts;

    private final void decodeTag(int obfuscationGuard, PacketBuffer packet, int tag) {
        char[] childShortcutTarget = null;
        int childShortcutIndex = 0;
        char childShortcut = 0;
        char[] phraseShortcutTarget = null;
        int phraseShortcutIndex = 0;
        char phraseShortcut = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String packetSummary = null;
        RuntimeException caughtFailure = null;
        int entryCount = 0;
        RuntimeException failure = null;
        int entryIndex = 0;
        int shortcutByte = 0;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard <= 59) {
            field_z = -79;
          }
          if (1 == tag) {
            this.title = packet.readCp1252String(-1);
          } else {
            if (tag == 2) {
              entryCount = packet.readUnsignedByte(255);
              this.subcategoryIds = new int[entryCount];
              this.subcategoryShortcuts = new char[entryCount];
              for (entryIndex = 0; entryIndex < entryCount; entryIndex++) {
                this.subcategoryIds[entryIndex] = packet.readUnsignedShort(65280);
                shortcutByte = packet.readByte(true);
                childShortcutTarget = this.subcategoryShortcuts;
                childShortcutIndex = entryIndex;
                if (0 == shortcutByte) {
                  childShortcut = (char)0;
                } else {
                  childShortcut = RankingsRequest.decodeCp1252Byte((byte) -112, (byte) shortcutByte);
                }
                childShortcutTarget[childShortcutIndex] = childShortcut;
              }
            } else if (tag == 3) {
              entryCount = packet.readUnsignedByte(255);
              this.phraseShortcuts = new char[entryCount];
              this.phraseIds = new int[entryCount];
              for (entryIndex = 0; entryCount > entryIndex; entryIndex++) {
                this.phraseIds[entryIndex] = packet.readUnsignedShort(65280);
                shortcutByte = packet.readByte(true);
                phraseShortcutTarget = this.phraseShortcuts;
                phraseShortcutIndex = entryIndex;
                if (0 == shortcutByte) {
                  phraseShortcut = (char)0;
                } else {
                  phraseShortcut = RankingsRequest.decodeCp1252Byte((byte) -11, (byte) shortcutByte);
                }
                phraseShortcutTarget[phraseShortcutIndex] = phraseShortcut;
              }
            } else {
              if (tag == 4) {
                this.rootMarker = true;
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("kn.D(").append(obfuscationGuard).append(',');
          if (packet == null) {
            packetSummary = "null";
          } else {
            packetSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(packetSummary).append(',').append(tag).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_E = null;
        if (param0 <= 44) {
          QuickChatCategoryDefinition.a((byte) -32);
        }
    }

    final void decode(PacketBuffer packet, int obfuscationGuard) {
        int tag = 0;
        int unusedGameFlag = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String packetSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != -29539) {
            field_E = (String[]) null;
          }
          while (true) {
            tag = packet.readUnsignedByte(255);
            if (0 == tag) {
              return;
            }
            this.decodeTag(104, packet, tag);
          }
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("kn.A(");
          if (packet == null) {
            packetSummary = "null";
          } else {
            packetSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(packetSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(boolean param0, java.awt.Canvas param1) {
        try {
          if (11 == AchievementIcon.field_j) {
            SecondaryHashTable.a(-1);
          }
          if (!param0) {
            QuickChatCategoryDefinition.a((byte) -116);
          }
          ToggleButtonWidget.a(UsernameSuggestionPanel.field_N, 8192, WidgetTextLayout.field_a, LevelCompleteScreen.field_C);
          ck.a(param1, 0, 14209, 0);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "kn.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void markExtendedLinks(byte obfuscationGuard) {
        int childIndex = 0;
        int phraseIndex = 0;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        int unusedChildIndex;
        if (obfuscationGuard >= -86) {
          java.awt.Canvas unusedCanvas = (java.awt.Canvas) null;
          QuickChatCategoryDefinition.a(false, (java.awt.Canvas) null);
        }
        if (null != this.phraseIds) {
          for (phraseIndex = 0; phraseIndex < this.phraseIds.length; phraseIndex++) {
            this.phraseIds[phraseIndex] = LevelSelectScreen.d(this.phraseIds[phraseIndex], 32768);
          }
        }
        if (this.subcategoryIds != null) {
          childIndex = 0;
          unusedChildIndex = childIndex;
          while (childIndex < this.subcategoryIds.length) {
            this.subcategoryIds[childIndex] = LevelSelectScreen.d(this.subcategoryIds[childIndex], 32768);
            childIndex++;
          }
        }
    }

    QuickChatCategoryDefinition() {
        this.rootMarker = false;
    }

    static {
        livePointerChanged = false;
    }
}
