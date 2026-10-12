/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategory extends DualLinkedNode {
    int[] subcategoryIds;
    static String field_F;
    char[] phraseShortcuts;
    static int field_u;
    static int field_z;
    boolean isRootCategory;
    static int field_D;
    static String field_B;
    String title;
    char[] subcategoryShortcuts;
    static hg field_w;
    static int[] field_G;
    int[] phraseIds;
    static String[] field_A;

    private final void decodeOpcode(byte obfuscationGuard, PacketBuffer packet, int opcode) {
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char stackIn_8_2 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char stackIn_15_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int guardRemainder = 0;
        RuntimeException var4 = null;
        int entryCount = 0;
        int entryIndex = 0;
        int encodedShortcut = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          guardRemainder = 81 % ((obfuscationGuard - 47) / 62);
          if (opcode == 1) {
            this.title = packet.readNullTerminatedString(1);
          } else {
            if (opcode == 2) {
              entryCount = packet.readUnsignedByte(0);
              this.subcategoryIds = new int[entryCount];
              this.subcategoryShortcuts = new char[entryCount];
              for (entryIndex = 0; entryCount > entryIndex; entryIndex++) {
                this.subcategoryIds[entryIndex] = packet.readUnsignedShort((byte) -104);
                encodedShortcut = packet.readByte((byte) 111);
                stackIn_7_0 = this.subcategoryShortcuts;
                stackIn_7_1 = entryIndex;
                if (0 == encodedShortcut) {
                  stackIn_8_2 = (char)0;
                } else {
                  stackIn_8_2 = we.decodeSingleByteCharacter(-121, (byte) encodedShortcut);
                }
                stackIn_7_0[stackIn_7_1] = stackIn_8_2;
              }
            } else if (3 == opcode) {
              entryCount = packet.readUnsignedByte(0);
              this.phraseShortcuts = new char[entryCount];
              this.phraseIds = new int[entryCount];
              for (entryIndex = 0; entryCount > entryIndex; entryIndex++) {
                this.phraseIds[entryIndex] = packet.readUnsignedShort((byte) -104);
                encodedShortcut = packet.readByte((byte) -74);
                stackIn_14_0 = this.phraseShortcuts;
                stackIn_14_1 = entryIndex;
                if (0 == encodedShortcut) {
                  stackIn_15_2 = (char)0;
                } else {
                  stackIn_15_2 = we.decodeSingleByteCharacter(-125, (byte) encodedShortcut);
                }
                stackIn_14_0[stackIn_14_1] = stackIn_15_2;
              }
            } else {
              if (opcode == 4) {
                this.isRootCategory = true;
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("va.D(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(opcode).append(')').toString());
        }
    }

    final void applyGlobalIds(int obfuscationGuard) {
        int var5 = 0;
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2Lifetime1;
        if (null != this.phraseIds) {
          for (var2 = 0; var2 < this.phraseIds.length; var2++) {
            this.phraseIds[var2] = oe.bitwiseOr(this.phraseIds[var2], 32768);
          }
        }
        if (this.subcategoryIds != null) {
          var5 = 0;
          var2Lifetime1 = var5;
          while (var5 < this.subcategoryIds.length) {
            this.subcategoryIds[var5] = oe.bitwiseOr(this.subcategoryIds[var5], 32768);
            var5++;
          }
        }
        if (obfuscationGuard <= 6) {
          PacketBuffer var4 = (PacketBuffer) null;
          this.decodeOpcode((byte) 40, (PacketBuffer) null, -40);
        }
    }

    public static void h(int param0) {
        field_B = null;
        field_F = null;
        if (param0 > -91) {
          QuickChatCategory.h(-117);
        }
        field_A = null;
        field_G = null;
        field_w = null;
    }

    final void decode(byte obfuscationGuard, PacketBuffer packet) {
        int opcode = 0;
        int obfuscationControl = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard >= -79) {
            return;
          }
          while (true) {
            opcode = packet.readUnsignedByte(0);
            if (opcode == 0) {
              return;
            }
            this.decodeOpcode((byte) -120, packet, opcode);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("va.B(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    QuickChatCategory() {
        this.isRootCategory = false;
    }

    static {
        field_F = "No options available";
        field_G = new int[]{7, 1, 0, 0, 2, 5, 4, 1, 1, 1, 9, 7, 11, 11, 1, 11};
        field_B = "Connection restored.";
        field_u = 0;
        field_w = new hg();
    }
}
