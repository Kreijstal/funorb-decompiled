/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntKeyLookup {
    static int field_b;
    static byte[][] field_g;
    static String field_c;
    private int[] field_f;
    static long field_a;
    static PlayerContextMenu field_e;
    static boolean field_d;
    static LoadingProgressDialog field_i;
    static Js5Archive field_h;

    final static Sprite[] createSolidCenterFrame(boolean param0, int param1) {
        Sprite[] var3 = null;
        Sprite[] var2 = null;
        Sprite[] var3Lifetime1;
        Sprite[] var2Lifetime1;
        if (param0) {
          var3 = new Sprite[9];
          var2 = var3;
          var3[4] = MusicCrossfadeStream.createSolidSprite(64, (byte) 40, param1);
          return var2;
        }
        IntKeyLookup.constantTrue(2);
        var3Lifetime1 = new Sprite[9];
        var2Lifetime1 = var3Lifetime1;
        var3Lifetime1[4] = MusicCrossfadeStream.createSolidSprite(64, (byte) 40, param1);
        return var2Lifetime1;
    }

    final static AccountRequestReply createStringArrayMessage(String[] args, int param1) {
        AccountRequestReply var2 = null;
        RuntimeException var2_ref = null;
        AccountRequestReply stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 7655) {
            IntKeyLookup.getDefaultTextPainter((byte) -70);
          }
          var2 = new AccountRequestReply(false);
          var2.field_b = args;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("md.H(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean constantTrue(int param0) {
        if (param0 != 11265) {
          IntKeyLookup.getDefaultTextPainter((byte) -50);
          return true;
        }
        return true;
    }

    final static boolean isTooltipShown(boolean param0) {
        if (!param0) {
          return null != LobbyGame.field_Xb ? true : false;
        }
        IntKeyLookup.createSolidCenterFrame(true, 11);
        return null != LobbyGame.field_Xb ? true : false;
    }

    final static void writeLoginPacket(boolean param0, int param1, boolean param2, int param3, LoginCredentials param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          DiskCacheWorker.field_b[0] = PopupInputHelpers.field_c.nextInt();
          DiskCacheWorker.field_b[1] = PopupInputHelpers.field_c.nextInt();
          DiskCacheWorker.field_b[2] = (int)(ProxySocketConnector.field_i >> 32);
          DiskCacheWorker.field_b[3] = (int)ProxySocketConnector.field_i;
          FadingModalPanel.field_D.position = 0;
          FadingModalPanel.field_D.writeInt(DiskCacheWorker.field_b[0], (byte) -42);
          FadingModalPanel.field_D.writeInt(DiskCacheWorker.field_b[1], (byte) -42);
          FadingModalPanel.field_D.writeInt(DiskCacheWorker.field_b[2], (byte) -42);
          FadingModalPanel.field_D.writeInt(DiskCacheWorker.field_b[3], (byte) -42);
          UsernameSuggestionPanel.writeMachineId(FadingModalPanel.field_D, (byte) 111);
          FadingModalPanel.field_D.writeShort((byte) -126, param3);
          param4.writeTo(false, FadingModalPanel.field_D);
          IterableNodeHashTable.field_g.position = 0;
          if (param0) {
            IterableNodeHashTable.field_g.writeByte(18, param1 ^ -122);
          } else {
            IterableNodeHashTable.field_g.writeByte(16, 61);
          }
          IterableNodeHashTable.field_g.position = IterableNodeHashTable.field_g.position + 2;
          var5_int = IterableNodeHashTable.field_g.position;
          IterableNodeHashTable.field_g.writeInt(ChatMessage.field_c, (byte) -42);
          IterableNodeHashTable.field_g.writeLong((byte) -30, PasswordLoginCredentials.field_n);
          var6 = 0;
          if (FrameSkin.field_c) {
            var6 = var6 | 1;
          }
          if (BufferedSocket.field_k) {
            var6 = var6 | 4;
          }
          if (param2) {
            var6 = var6 | 8;
          }
          if (StrongCacheReference.field_B != null) {
            var6 = var6 | 16;
          }
          IterableNodeHashTable.field_g.writeByte(var6, -114);
          var7 = ProgressMessageDialog.readSettingsCookie(-88, ContentTransitionDialog.getApplet((byte) -80));
          if (var7 == null) {
            var7 = "";
          }
          IterableNodeHashTable.field_g.writeString(var7, (byte) -63);
          if (null != StrongCacheReference.field_B) {
            IterableNodeHashTable.field_g.writeZeroPrefixedString(StrongCacheReference.field_B, (byte) 127);
          }
          StatefulWidgetPainter.writeEncryptedPayload(LoginRsaKey.field_a, FadingModalPanel.field_D, IterableNodeHashTable.field_g, DisplayModeInfo.field_i, param1);
          IterableNodeHashTable.field_g.backpatchShortLength(-var5_int + IterableNodeHashTable.field_g.position, -3991);
          DateOfBirthValidator.flushPackets(~param1, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("md.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_i = null;
        field_c = null;
        field_e = null;
        field_g = (byte[][]) null;
        int var1 = 80 % ((param0 - 9) / 34);
        field_h = null;
    }

    final static TextWidgetPainter getDefaultTextPainter(byte param0) {
        LoginCredentials var2 = null;
        LoginCredentials var2Lifetime1;
        if (EmailDomainValidationHelpers.field_f == null) {
          EmailDomainValidationHelpers.field_f = new TextWidgetPainter(Js5Transport.arezzo12Font, 20, 0, 0, 0, 11579568, -1, 0, 0, Js5Transport.arezzo12Font.field_H, -1, 2147483647, true);
          if (param0 > -102) {
            var2 = (LoginCredentials) null;
            IntKeyLookup.writeLoginPacket(false, -13, true, -83, (LoginCredentials) null);
            return EmailDomainValidationHelpers.field_f;
          }
          return EmailDomainValidationHelpers.field_f;
        }
        if (param0 <= -102) {
          return EmailDomainValidationHelpers.field_f;
        }
        var2Lifetime1 = (LoginCredentials) null;
        IntKeyLookup.writeLoginPacket(false, -13, true, -83, (LoginCredentials) null);
        return EmailDomainValidationHelpers.field_f;
    }

    final int lookup(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Virogrid.field_F ? 1 : 0;
        var3 = (this.field_f.length >> 1) - 1;
        var4 = param1 & var3;
        if (!param0) {
          return -35;
        }
        while (true) {
          var5 = this.field_f[var4 + (var4 + 1)];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_f[var4 + var4] == param1) {
            return var5;
          }
          var4 = var3 & var4 + 1;
        }
    }

    IntKeyLookup(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (param0.length + (param0.length >> 1) >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_f = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_f[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = -1 + var2_int & param0[var3Lifetime1];
            while (this.field_f[1 + var4 + var4] != -1) {
              var4 = var2_int - 1 & var4 + 1;
            }
            this.field_f[var4 + var4] = param0[var3Lifetime1];
            this.field_f[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("md.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_b = -1;
        field_c = "Continue";
        field_d = false;
    }
}
