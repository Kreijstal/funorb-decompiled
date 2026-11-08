/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolDigest {
    private long[] field_f;
    private byte[] field_d;
    private byte[] field_e;
    private long[] field_a;
    private int field_h;
    private long[] field_i;
    static String field_c;
    private long[] field_g;
    private long[] field_b;
    private int field_j;

    final static void drawMessageDialogLines(boolean param0) {
        int var3 = 0;
        boolean stackIn_11_0 = false;
        FrameSkin stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        FrameSkin var9 = null;
        int var10 = 0;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          var1_int = ProgressMessageDialog.field_rb - StripedProgressBar.field_x;
          StripedProgressBar.field_x = LongAndTextCredentials.field_g - (var1_int >> 1);
          DirectByteStorage.field_i = FadeLayer.field_I - (CheckboxPainter.field_g >> 1);
          ProgressMessageDialog.field_rb = var1_int + StripedProgressBar.field_x;
          var2 = DirectByteStorage.field_i;
          for (var3 = 0; DropTargetWidget.field_F.length > var3; var3++) {
            var4 = RasterBuffer.field_f[var3];
            if (var4 >= 0) {
              if (var4 != ChatAndIgnoreHelpers.field_b.field_d) {
                var5 = HelpPopup.field_Hb;
              } else {
                var5 = QueuedRequest.field_k;
              }
            } else {
              var5 = DialogMessagePane.field_I;
            }
            var6 = DropTargetWidget.field_F[var3];
            stackIn_11_0 = !(var4 < 0);
            var7 = TextMeasureHelpers.measureText(stackIn_11_0, (byte) 47, var6);
            var8 = LongAndTextCredentials.field_g - (var7 >> 1);
            if (var4 >= 0) {
              var2 = var2 + ReflectionCheckHelpers.field_e;
              if (var4 == ChatAndIgnoreHelpers.field_b.field_d) {
                stackIn_16_0 = TextButton.field_D;
              } else {
                stackIn_16_0 = IntrusiveDequeCursor.field_h;
              }
              var9 = stackIn_16_0;
              if (var9 != null) {
                var9.drawFrame(-PlayerContextMenu.field_e + var8, (ValidationMessageWidget.field_P << 1) + UsernameAvailabilityValidator.field_o, false, (PlayerContextMenu.field_e << 1) + var7, var2);
              }
              var2 = var2 + ValidationMessageWidget.field_P;
            }
            if (var4 >= 0) {
              GameOptions.field_n.drawLeft(var6, var8, LabeledChildWidget.field_L + var2, var5, -1);
              var2 = var2 + (UsernameAvailabilityValidator.field_o + (ValidationMessageWidget.field_P + ReflectionCheckHelpers.field_e));
            } else {
              MouseTrailPoint.field_j.drawLeft(var6, var8, MusicCrossfadeStream.field_l + var2, var5, -1);
              var2 = var2 + NameCharacterHelpers.field_b;
            }
          }
          if (param0) {
            field_c = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "fm.B(" + param0 + ')');
        }
    }

    final static int parseDecimalInt(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_c = (String) null;
          }
          stackIn_3_0 = IntrusiveDeque.parseInteger(10, 4330, true, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fm.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updateBits(long param0, boolean param1, byte[] param2) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 7 & -((int)param0 & 7) + 8;
          var7 = 7 & this.field_j;
          var9 = param0;
          if (param1) {
            this.field_a = (long[]) null;
          }
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + ((255 & (int)var9) + (this.field_d[var11] & 255));
            this.field_d[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (8L < param0) {
            var8 = 255 & param2[var5_int] << var6 | (255 & param2[1 + var5_int]) >>> -var6 + 8;
            if (var8 >= 0 &&
              var8 < 256) {
              this.field_e[this.field_h] = (byte)BitwiseHelpers.bitOr((int) this.field_e[this.field_h], var8 >>> var7);
              this.field_h = this.field_h + 1;
              this.field_j = this.field_j + (-var7 + 8);
              if (this.field_j == 512) {
                this.compressBlock((byte) -91);
                this.field_h = 0;
                this.field_j = 0;
              }
              this.field_e[this.field_h] = (byte)WidgetFactoryHelpers.bitAnd(255, var8 << -var7 + 8);
              param0 = param0 - 8L;
              this.field_j = this.field_j + var7;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param0 > 0L) {
            stackIn_18_0 = 255;
            stackIn_18_1 = param2[var5_int] << var6;
            var8Lifetime1 = stackIn_18_0 & stackIn_18_1;
            this.field_e[this.field_h] = (byte)BitwiseHelpers.bitOr((int) this.field_e[this.field_h], var8Lifetime1 >>> var7);
          } else {
            var8Lifetime1 = 0;
          }
          if (param0 + (long)var7 < 8L) {
            this.field_j = (int)((long)this.field_j + param0);
          } else {
            param0 = param0 - (long)(-var7 + 8);
            this.field_j = this.field_j + (8 - var7);
            this.field_h = this.field_h + 1;
            if (this.field_j == 512) {
              this.compressBlock((byte) -91);
              this.field_h = 0;
              this.field_j = 0;
            }
            this.field_e[this.field_h] = (byte)WidgetFactoryHelpers.bitAnd(var8Lifetime1 << -var7 + 8, 255);
            this.field_j = this.field_j + (int)param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("fm.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static boolean isFriend(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1369854352) {
            WhirlpoolDigest.releaseStatics((byte) 80);
          }
          stackIn_5_0 = (ClientServiceHelpers.findFriendByName((byte) 61, param0) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("fm.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void sendSelectedGameId(int param0, int param1, int param2) {
        LobbyGame var6 = null;
        LobbyGame var7 = null;
        CipherPacketBuffer var4 = null;
        if (AudioSetupHelpers.field_b != param0) {
          var6 = (LobbyGame) (IntrusiveDequeCursor.field_c.get((long)AudioSetupHelpers.field_b, (byte) 77));
          var7 = var6;
          AudioSetupHelpers.field_b = param0;
          if (var7 != null) {
            var7.field_Zb = null;
          }
          var4 = IterableNodeHashTable.field_g;
          var4.writeCipheredOpcode(param2, 8);
          var4.writeByte(3, -68);
          var4.writeByte(11, -100);
          var4.writeShort((byte) 120, param0);
        }
        if (param1 != 3) {
          field_c = (String) null;
        }
    }

    final void finish(int param0, byte[] param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          this.field_e[this.field_h] = (byte)BitwiseHelpers.bitOr((int) this.field_e[this.field_h], 128 >>> WidgetFactoryHelpers.bitAnd(this.field_j, 7));
          this.field_h = this.field_h + 1;
          if (this.field_h > 32) {
            while (64 > this.field_h) {
              fieldTemp$0 = this.field_h;
              this.field_h = this.field_h + 1;
              this.field_e[fieldTemp$0] = (byte) 0;
            }
            this.compressBlock((byte) -91);
            this.field_h = 0;
          }
          if (param2 != 8) {
            this.field_e = (byte[]) null;
          }
          while (this.field_h < 32) {
            fieldTemp$1 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_e[fieldTemp$1] = (byte) 0;
          }
          ArraySupport.copy(this.field_d, 0, this.field_e, 32, 32);
          this.compressBlock((byte) -91);
          var4_int = 0;
          var5 = param0;
          while (8 > var4_int) {
            var6 = this.field_i[var4_int];
            param1[var5] = (byte)(int)(var6 >>> 56);
            param1[var5 + 1] = (byte)(int)(var6 >>> 48);
            param1[var5 + 2] = (byte)(int)(var6 >>> 40);
            param1[3 + var5] = (byte)(int)(var6 >>> 32);
            param1[var5 + 4] = (byte)(int)(var6 >>> 24);
            param1[var5 + 5] = (byte)(int)(var6 >>> 16);
            param1[var5 + 6] = (byte)(int)(var6 >>> 8);
            param1[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("fm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -54) {
          WhirlpoolDigest.releaseStatics((byte) 0);
        }
        field_c = null;
    }

    private final void compressBlock(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        byte[] var7;
        int var8;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = Virogrid.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_g[var2] = ConditionalTextValue.bitXor(AudioPumpThread.bitAnd(255L, (long)this.field_e[7 + var3]), ConditionalTextValue.bitXor(AudioPumpThread.bitAnd(255L, (long)this.field_e[6 + var3]) << 8, ConditionalTextValue.bitXor(ConditionalTextValue.bitXor(AudioPumpThread.bitAnd(255L, (long)this.field_e[var3 + 4]) << 24, ConditionalTextValue.bitXor(ConditionalTextValue.bitXor(AudioPumpThread.bitAnd((long)this.field_e[2 + var3] << 40, 280375465082880L), ConditionalTextValue.bitXor((long)this.field_e[var3] << 56, AudioPumpThread.bitAnd(71776119061217280L, (long)this.field_e[var3 + 1] << 48))), AudioPumpThread.bitAnd((long)this.field_e[var3 + 3] << 32, 1095216660480L))), AudioPumpThread.bitAnd((long)this.field_e[var3 + 5] << 16, 16711680L))));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_i[var2Lifetime1];
          arrayValue$1 = this.field_g[var2Lifetime1];
          this.field_f[var2Lifetime1] = dupTemp$0;
          this.field_a[var2Lifetime1] = ConditionalTextValue.bitXor(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_b[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.field_b[var3Lifetime1] = ConditionalTextValue.bitXor(this.field_b[var3Lifetime1], LoginMethod.field_e[var4][WidgetFactoryHelpers.bitAnd((int)(this.field_f[WidgetFactoryHelpers.bitAnd(7, -var4 + var3Lifetime1)] >>> var5), 255)]);
              var5 -= 8;
              var4++;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_f[var3Lifetime1Lifetime1] = this.field_b[var3Lifetime1Lifetime1];
          }
          this.field_f[0] = ConditionalTextValue.bitXor(this.field_f[0], LoginMethod.field_b[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_b[var3Lifetime1Lifetime2] = this.field_f[var3Lifetime1Lifetime2];
            var8 = 0;
            var4Lifetime1 = var8;
            var5Lifetime1 = 56;
            while (var8 < 8) {
              this.field_b[var3Lifetime1Lifetime2] = ConditionalTextValue.bitXor(this.field_b[var3Lifetime1Lifetime2], LoginMethod.field_e[var8][WidgetFactoryHelpers.bitAnd((int)(this.field_a[WidgetFactoryHelpers.bitAnd(var3Lifetime1Lifetime2 - var8, 7)] >>> var5Lifetime1), 255)]);
              var5Lifetime1 -= 8;
              var8++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; 8 > var3Lifetime1Lifetime3; var3Lifetime1Lifetime3++) {
            this.field_a[var3Lifetime1Lifetime3] = this.field_b[var3Lifetime1Lifetime3];
          }
        }
        if (param0 != -91) {
          var7 = (byte[]) null;
          this.updateBits(-69L, false, (byte[]) null);
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_i[var2Lifetime3] = ConditionalTextValue.bitXor(this.field_i[var2Lifetime3], ConditionalTextValue.bitXor(this.field_g[var2Lifetime3], this.field_a[var2Lifetime3]));
        }
    }

    WhirlpoolDigest() {
        this.field_d = new byte[32];
        this.field_f = new long[8];
        this.field_e = new byte[64];
        this.field_h = 0;
        this.field_b = new long[8];
        this.field_g = new long[8];
        this.field_i = new long[8];
        this.field_j = 0;
        this.field_a = new long[8];
    }

    final void reset(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_d[var2] = (byte) 0;
        }
        var2Lifetime1 = -100 / ((param0 - 2) / 44);
        this.field_h = 0;
        this.field_e[0] = (byte) 0;
        this.field_j = 0;
        for (var3 = 0; 8 > var3; var3++) {
          this.field_i[var3] = 0L;
        }
    }

    static {
        field_c = "Waiting for <%0> to start the game...";
    }
}
