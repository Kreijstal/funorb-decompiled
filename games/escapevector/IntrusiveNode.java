/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    static java.applet.Applet field_c;
    IntrusiveNode previous;
    long key;
    static String field_a;
    IntrusiveNode next;
    static String field_f;

    final static boolean b(int param0) {
        if (param0 != 12) {
          return false;
        }
        if (null == AccountRequestDialog.field_pb) {
          return false;
        }
        if (AccountRequestDialog.field_pb.topOpenPanel(0) == null) {
          return false;
        }
        return true;
    }

    final boolean isLinked(byte guard) {
        if (guard != 48) {
          IntrusiveNode.releaseStatics(-37);
          if (this.previous != null) {
            return true;
          }
          return false;
        }
        if (this.previous != null) {
          return true;
        }
        return false;
    }

    final static void writeProgressRecord(int guard, int opcode, ProgressRecord record) {
        CipherPacketBuffer var5 = QuickChatDynamicCommand.outgoingPackets;
        var5.writeCipheredOpcode(opcode, true);
        var5.position = var5.position + 1;
        int var4 = var5.position;
        if (guard > -20) {
          return;
        }
        try {
          var5.writeByte(1, -123);
          var5.writeByte(record.campaignId, -123);
          var5.writeSignedSmart(12680, record.levelIndex);
          var5.writeInt((byte) 126, record.field_n);
          var5.writeInt((byte) 127, record.field_h);
          var5.writeInt((byte) 123, record.field_o);
          var5.writeInt((byte) 125, record.field_g);
          var5.appendCrc32(var4, -61);
          var5.backpatchByteLength(118, -var4 + var5.position);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "hg.WA(" + guard + ',' + opcode + ',' + (record != null ? "{...}" : "null") + ')');
        }
    }

    final static MeshMaterial[] decodeMeshMaterials(CipherPacketBuffer input, int guard) {
        String stackIn_19_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          int var2_int = input.readBits(8, 8);
          if (0 < var2_int) {
            Object stackIn_3_0 = null;
            return (MeshMaterial[]) (stackIn_3_0);
          }
          int var3 = input.readBits(12, 8);
          MeshMaterial[] var4 = new MeshMaterial[var3];
          for (int var5 = 0; var3 > var5; var5++) {
            if (SessionMenuSupport.readBitFlag(input, (byte) -116)) {
              MeshMaterial var6 = new MeshMaterial();
              input.readBits(24, guard ^ 22186);
              input.readBits(24, 8);
              var6.colorRgb = input.readBits(24, guard ^ 22186);
              input.readBits(9, 8);
              input.readBits(12, guard ^ 22186);
              input.readBits(12, 8);
              input.readBits(12, 8);
              var4[var5] = var6;
            } else {
              int var6_int = input.readBits(IntrusiveDequeCursor.integerBitLength(var5 - 1, 24787), 8);
              var4[var5] = var4[var6_int];
            }
          }
          if (guard == 22178) {
            MeshMaterial[] stackIn_15_0 = var4;
            return stackIn_15_0;
          }
          MeshMaterial[] stackIn_13_0 = (MeshMaterial[]) null;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var2;
          StringBuilder stackIn_18_1 = new StringBuilder().append("hg.SA(");
          if (input == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_c = null;
        field_a = null;
        field_f = null;
        if (guard > -26) {
          IntrusiveNode.releaseStatics(6);
        }
    }

    final static void a(int param0) {
        if (param0 != 12) {
          IntrusiveNode.releaseStatics(-66);
        }
    }

    final void unlink(byte guard) {
        if (this.previous == null) {
          return;
        }
        if (guard <= -8) {
          this.previous.next = this.next;
          this.next.previous = this.previous;
          this.next = null;
          this.previous = null;
          return;
        }
        IntrusiveNode.b(-128);
        this.previous.next = this.next;
        this.next.previous = this.previous;
        this.next = null;
        this.previous = null;
    }

    static {
        field_f = "Targets: ";
        field_a = "Create a free account to start using this feature";
    }
}
