/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TabbedPanel extends SpriteWidget {
    static String[] field_Kb;
    static String field_Gb;
    private SpriteWidget field_Jb;
    static int[] field_Lb;
    int field_Hb;
    private SpriteWidget[] field_Fb;
    private SpriteWidget[] field_Ib;
    static long field_Eb;

    final void setBoundsAndLayout(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param3 != -22361) {
          byte[] var9 = (byte[]) null;
          TabbedPanel.decodeSpriteSheet((byte) 53, (byte[]) null);
        }
        this.field_K = param2;
        this.field_tb = param5;
        this.field_F = param6;
        this.field_ub = param1;
        this.layoutTabs(param0, param4, param3 ^ -20132);
    }

    final static SpriteWidget getFriendListContent(int param0) {
        if (param0 != 0) {
          return (SpriteWidget) null;
        }
        return EmailValidator.field_q.field_Lb;
    }

    final void processTabPresses(int param0) {
        int var2 = 0;
        SpriteWidget dupTemp$0 = null;
        SpriteWidget dupTemp$1 = null;
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        for (var2 = param0; this.field_Fb.length > var2; var2++) {
          if (this.field_Hb != var2 &&
            this.field_Fb[var2].field_nb != 0) {
            this.field_Fb[this.field_Hb].field_xb = false;
            dupTemp$0 = this.field_Ib[this.field_Hb];
            dupTemp$0.field_tb = dupTemp$0.field_tb + 10000;
            this.field_Hb = var2;
            this.field_Fb[var2].field_xb = true;
            dupTemp$1 = this.field_Ib[var2];
            dupTemp$1.field_tb = dupTemp$1.field_tb - 10000;
          }
        }
    }

    private final void layoutTabs(int param0, int param1, int param2) {
        SpriteWidget dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = Virogrid.field_F ? 1 : 0;
        if (param2 != 6651) {
          return;
        }
        for (var4 = 0; this.field_Fb.length > var4; var4++) {
          var5 = var4 * this.field_K / this.field_Fb.length;
          var6 = this.field_K * (1 + var4) / this.field_Fb.length;
          this.field_Fb[var4].field_tb = var5;
          this.field_Fb[var4].field_F = 0;
          this.field_Fb[var4].field_K = -var5 + var6;
          this.field_Fb[var4].field_ub = param0;
        }
        this.field_Jb.setGeometry(0, -param0 + this.field_ub, this.field_K, (byte) -70, param0);
        var8 = 0;
        var4Lifetime1 = var8;
        while (var8 < this.field_Ib.length) {
          this.field_Ib[var8].setGeometry(param1, this.field_Jb.field_ub - param1 * 2, -(param1 * 2) + this.field_Jb.field_K, (byte) -115, param1);
          if (this.field_Hb != var8) {
            dupTemp$0 = this.field_Ib[var8];
            dupTemp$0.field_tb = dupTemp$0.field_tb + 10000;
          }
          var8++;
        }
        return;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -73) {
          field_Eb = -122L;
        }
        field_Lb = null;
        field_Gb = null;
        field_Kb = null;
    }

    final static void decodeSpriteSheet(byte param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PacketBuffer var16 = null;
        PacketBuffer var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = Virogrid.field_F ? 1 : 0;
        try {
          var16 = new PacketBuffer(param1);
          var17 = var16;
          var17.position = param1.length - 2;
          MarkerSliderPainter.field_h = var17.readUnsignedShort((byte) -83);
          Bzip2State.field_k = new int[MarkerSliderPainter.field_h];
          MusicPlaybackHelpers.field_d = new boolean[MarkerSliderPainter.field_h];
          ContentTransitionDialog.field_bb = new int[MarkerSliderPainter.field_h];
          IntKeyLookup.field_g = new byte[MarkerSliderPainter.field_h][];
          MarkerSlider.field_F = new int[MarkerSliderPainter.field_h];
          CheckboxPainter.field_j = new byte[MarkerSliderPainter.field_h][];
          BufferedSocket.field_w = new int[MarkerSliderPainter.field_h];
          var17.position = -(8 * MarkerSliderPainter.field_h) + param1.length - 7;
          QuickChatMenu.field_Kb = var17.readUnsignedShort((byte) -108);
          LobbyJoinTextGlobals.field_d = var17.readUnsignedShort((byte) 90);
          var3 = (var17.readUnsignedByte(11132) & 255) + 1;
          if (param0 > 0) {
            return;
          }
          for (var4 = 0; var4 < MarkerSliderPainter.field_h; var4++) {
            BufferedSocket.field_w[var4] = var16.readUnsignedShort((byte) -112);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < MarkerSliderPainter.field_h; var4Lifetime1++) {
            ContentTransitionDialog.field_bb[var4Lifetime1] = var17.readUnsignedShort((byte) 53);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < MarkerSliderPainter.field_h; var4Lifetime2++) {
            Bzip2State.field_k[var4Lifetime2] = var17.readUnsignedShort((byte) 41);
          }
          for (var4Lifetime3 = 0; MarkerSliderPainter.field_h > var4Lifetime3; var4Lifetime3++) {
            MarkerSlider.field_F[var4Lifetime3] = var17.readUnsignedShort((byte) 97);
          }
          var17.position = 3 - var3 * 3 + (-7 + (param1.length - 8 * MarkerSliderPainter.field_h));
          GameEntryHelpers.field_c = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            GameEntryHelpers.field_c[var4Lifetime4] = var17.readMedium(-25842);
            if (GameEntryHelpers.field_c[var4Lifetime4] == 0) {
              GameEntryHelpers.field_c[var4Lifetime4] = 1;
            }
          }
          var17.position = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < MarkerSliderPainter.field_h; var4Lifetime5++) {
            var5 = Bzip2State.field_k[var4Lifetime5];
            var6 = MarkerSlider.field_F[var4Lifetime5];
            var7 = var5 * var6;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            CheckboxPainter.field_j[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            IntKeyLookup.field_g[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.readUnsignedByte(11132);
            stackIn_24_0 = -1;
            stackIn_24_1 = ~(1 & var11);
            if (stackIn_24_0 == stackIn_24_1) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.readByte((byte) 118);
              }
              if (0 != (var11 & 2)) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$1 = var17.readByte((byte) -114);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_33_0 = var10;
                  if (-1 == var13) {
                    stackIn_34_1 = 0;
                  } else {
                    stackIn_34_1 = 1;
                  }
                  var10 = stackIn_33_0 | stackIn_34_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var5 * var13 + var12] = var17.readByte((byte) 78);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.readByte((byte) -69);
                    var9[var12 + var5 * var13] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (var14 == -1) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            MusicPlaybackHelpers.field_d[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("d.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    TabbedPanel(long param0, SpriteWidget param1, String[] param2, SpriteWidget param3, SpriteWidget[] param4, int param5) {
        super(param0, (SpriteWidget) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        SpriteWidget var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_Fb = new SpriteWidget[param2.length];
          this.field_Jb = new SpriteWidget(0L, param3);
          this.field_Ib = param4;
          for (var8_int = 0; var8_int < param2.length; var8_int++) {
            var9 = new SpriteWidget(0L, param1);
            var9.field_V = param2[var8_int];
            this.field_Fb[var8_int] = var9;
            this.addChild(0, var9);
          }
          this.addChild(0, this.field_Jb);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (var11 < param4.length) {
            this.field_Jb.addChild(0, param4[var11]);
            var11++;
          }
          this.field_Hb = param5;
          this.field_Fb[param5].field_xb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("d.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    final static int pollMenuSelection(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          var2 = -109 / ((param0 + 29) / 58);
          var1_int = 0;
          while (GrowableIntList.pollKeyEvent((byte) -116)) {
            ChatAndIgnoreHelpers.field_b.handleVerticalNavigation(-87);
            if (!ChatAndIgnoreHelpers.field_b.isActivated(false)) {
              continue;
            }
            var1_int = 1;
          }
          ChatAndIgnoreHelpers.field_b.updatePointer(EmailValidator.hitTestMenuOption(IconTextComponent.field_Jb, StatefulWidgetPainter.field_u, (byte) 66), false, EmailValidator.hitTestMenuOption(PasswordFieldPainter.field_y, HuffmanCodec.field_b, (byte) 66));
          if (ChatAndIgnoreHelpers.field_b.isActivated(false)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            ChatAndIgnoreHelpers.field_b.field_d >= 0) {
            var3 = ViewControlStrings.field_e[ChatAndIgnoreHelpers.field_b.field_d];
            if (var3 == 2) {
              MidiNote.setGameViewFlag(false);
            }
          }
          stackIn_14_0 = var3;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var1), "d.F(" + param0 + ')');
        }
    }

    static {
        field_Lb = new int[8192];
        field_Kb = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
