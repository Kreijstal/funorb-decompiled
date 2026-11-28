/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitPacketBuffer extends PacketBuffer {
    private int field_p;
    private IsaacRandom field_o;
    static String field_n;

    final void endBitAccess(int param0) {
        this.position = (param0 + this.field_p) / 8;
    }

    final int readBits(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var3 = this.field_p >> 3;
        int var4 = -(this.field_p & 7) + param1;
        int var5 = 0;
        this.field_p = this.field_p + param0;
        while (param0 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((ModalDialogHost.field_I[var4] & this.payload[incrementValue$0]) << -var4 + param0);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (param0 != var4) {
          var5 = var5 + (this.payload[var3] >> -param0 + var4 & ModalDialogHost.field_I[param0]);
        } else {
          var5 = var5 + (ModalDialogHost.field_I[var4] & this.payload[var3]);
        }
        return var5;
    }

    final int readCipheredByte(int param0) {
        int fieldTemp$0 = 0;
        if (param0 >= -22) {
          this.readBits(69, 70);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.payload[fieldTemp$0] - this.field_o.nextInt(128) & 255;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$1] - this.field_o.nextInt(128) & 255;
    }

    final void readCipheredBytes(int param0, int param1, byte[] param2, int param3) {
        int var6 = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          var5_int = 6 % ((33 - param0) / 61);
          for (var6 = 0; var6 < param3; var6++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param2[var6 + param1] = (byte)(this.payload[fieldTemp$0] - this.field_o.nextInt(128));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("se.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void clearStaticReferences(boolean param0) {
        field_n = null;
        if (param0) {
          String var2 = (String) null;
          BitPacketBuffer.showLobbyDialog((String) null, (byte) -75, 110);
        }
    }

    final void writeCipheredByte(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(this.field_o.nextInt(128) + param0);
        int var3 = -34 / ((21 - param1) / 58);
    }

    final static void writeLeaderboardRequest(gj param0, int param1, int param2) {
        BitPacketBuffer var3 = null;
        try {
          if (param2 >= -37) {
            field_n = (String) null;
          }
          var3 = uk.field_b;
          var3.writeCipheredByte(param1, -116);
          var3.writeByte(5, -9);
          var3.writeByte(0, -30);
          var3.writeShort((byte) -60, param0.field_o);
          var3.writeByte(param0.field_m, -4);
          var3.writeByte(param0.field_n, -79);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "se.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void beginBitAccess(int param0) {
        this.field_p = this.position * 8;
        if (param0 != 9471) {
          this.field_o = (IsaacRandom) null;
        }
    }

    final static void showLobbyDialog(String param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_intLifetime1;
        int var3_intLifetime2;
        try {
          oe.field_p = false;
          IntrusiveNode.field_b = false;
          if (oj.field_q != null &&
            oj.field_q.field_A) {
            if (param2 == 8) {
              if (vh.field_j) {
                param0 = km.field_b;
              } else {
                param0 = ii.field_e;
              }
              param2 = 2;
              AccountCreationResultPanel.field_ib.setAccountAndClearPassword(127, vh.field_k);
            }
            var3_int = 1;
            if (param2 == 10) {
              var3_int = 0;
              dc.a((byte) -108);
            }
            if (var3_int != 0) {
              if (IntrusiveNode.field_b) {
                param0 = CrossfadingMidiPcmStream.a(-415993727, new String[]{param0}, kg.field_g);
              }
              if (DefaultTextWidgetRenderer.field_j) {
                param0 = mh.field_f;
              }
              oj.field_q.showResult(-92, param2, param0);
            }
            if (256 != param2) {
              if (param2 == 10) {
                var3_intLifetime2 = -102 % ((param1 + 27) / 52);
                return;
              }
              if (!vh.field_j) {
                AccountCreationResultPanel.field_ib.clearCredentials(-114);
              }
            }
          }
          var3_intLifetime1 = -102 % ((param1 + 27) / 52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("se.RA(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    BitPacketBuffer(byte[] param0) {
        super(param0);
    }

    final void setCipherSeed(int[] param0, int param1) {
        try {
          this.field_o = new IsaacRandom(param0);
          if (param1 != 3777) {
            this.field_o = (IsaacRandom) null;
          }
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "se.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    BitPacketBuffer(int param0) {
        super(param0);
    }

    static {
        field_n = "From only <%0>/month";
    }
}
