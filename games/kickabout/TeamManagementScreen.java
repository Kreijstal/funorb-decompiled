/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TeamManagementScreen extends ButtonMenuScreen {
    static int field_A;
    static String field_D;
    static String field_E;
    static String[] field_C;
    static NineSlicePanelPainter field_B;

    TeamManagementScreen() {
    }

    final static void writeEncryptedLoginBlock(PacketBuffer param0, java.math.BigInteger param1, int param2, int param3, byte[] param4, int param5, java.math.BigInteger param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = Kickabout.field_G;
        try {
          var7_int = ql.a(param2, (byte) 122);
          if (PopupDialog.field_g == null) {
            PopupDialog.field_g = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = PopupDialog.field_g.nextInt();
          }
          if (AuctionsHelpScreen.field_I == null ||
            !(AuctionsHelpScreen.field_I.field_f.length >= var7_int)) {
            AuctionsHelpScreen.field_I = new PacketBuffer(var7_int);
          }
          AuctionsHelpScreen.field_I.field_n = 0;
          AuctionsHelpScreen.field_I.writeBytes(param3, param2, 1991220144, param4);
          AuctionsHelpScreen.field_I.padToPosition((byte) 114, var7_int);
          AuctionsHelpScreen.field_I.xteaEncrypt(var13, (byte) 53);
          if (uf.field_c == null ||
            !(uf.field_c.field_f.length >= 100)) {
            uf.field_c = new PacketBuffer(100);
          }
          uf.field_c.field_n = 0;
          uf.field_c.writeByte(111, param5);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            uf.field_c.writeInt(param5 ^ -103, var13[var11]);
            var11++;
          }
          uf.field_c.writeShort(param5 - 1207444482, param2);
          uf.field_c.rsaEncrypt(param1, param6, param5 ^ 44);
          param0.writeBytes(0, uf.field_c.field_n, 1991220144, uf.field_c.field_f);
          param0.writeBytes(0, AuctionsHelpScreen.field_I.field_n, 1991220144, AuctionsHelpScreen.field_I.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_21_0 = var7;
          stackIn_21_1 = new StringBuilder().append("ta.GA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    void enterScreen(int param0, int param1, boolean param2) {
        super.enterScreen(param0 + param0, param1, param2);
        ic.field_h.copyFrom(GameLoopApplet.field_E, (byte) 120);
        MusicPatchNode.field_h.clear(22997);
        IntrusiveNodeHashTable.a(ic.field_h.field_x, 415422632);
    }

    final static void e(int param0) {
        RasterStateSnapshot var1 = (RasterStateSnapshot) (IntDoubleCommand.field_C.removeLast(-126));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        if (param0 < 116) {
          java.math.BigInteger var2 = (java.math.BigInteger) null;
          TeamManagementScreen.writeEncryptedLoginBlock((PacketBuffer) null, (java.math.BigInteger) null, -77, 44, (byte[]) null, -52, (java.math.BigInteger) null);
        }
        SoftwareRasterizer.a(var1.field_h, var1.field_g, var1.field_j);
        SoftwareRasterizer.setClip(var1.field_e, var1.field_l, var1.field_i, var1.field_f);
        var1.field_h = null;
        ScrollContainer.field_Ab.addLast(var1, 3);
    }

    void updateScreen(byte param0, boolean param1) {
        super.updateScreen((byte) -36, param1);
        int var3 = 31 / ((38 - param0) / 60);
        QuickChatCategory.a(ic.field_h.field_x, 5464);
    }

    public static void g(byte param0) {
        field_D = null;
        field_C = null;
        field_B = null;
        field_E = null;
        int var1 = 38 / ((param0 + 18) / 47);
    }

    static {
        field_C = new String[16];
        field_E = "Return to game";
        field_D = "Drawn";
    }
}
