/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    static String field_o;
    static UiComponent field_t;
    static int field_q;
    static RgbSprite[][] jungleCapsSprites;
    static int field_r;
    static String field_m;
    static byte[] field_k;
    long secondaryKey;
    static String field_i;
    DualLinkNode secondaryPrevious;
    static String quickChatRecipient;
    DualLinkNode secondaryNext;

    final void unlinkSecondary(int obfuscationGuard) {
        if (null == this.secondaryPrevious) {
          return;
        }
        this.secondaryPrevious.secondaryNext = this.secondaryNext;
        this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
        this.secondaryPrevious = null;
        if (obfuscationGuard != 3) {
          this.secondaryNext = (DualLinkNode) null;
        }
        this.secondaryNext = null;
    }

    final static void a(int param0, MultiplayerMatch param1, PaletteFont param2, PlayerBoard param3, byte param4, int param5, int param6, int param7) {
        int var13 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          var8_int = 5;
          var9 = 5;
          var10 = 3 + param2.capHeight + param2.descent;
          var11 = var8_int + param5;
          var12 = param6 + (var9 + param2.capHeight);
          param2.drawLeft(ProducerFramebuffer.field_j, var11, var12, 2, -1);
          var12 = var12 + var10;
          param2.drawLeft(SecondaryNodeQueue.field_e, var11, var12, 1, -1);
          var12 = var12 + var10;
          param2.drawLeft(ff.field_j, var11, var12, 2, -1);
          var12 = var12 + var10;
          param2.drawLeft(vd.field_d, var11, var12, 0, -1);
          if (param4 >= -96) {
            return;
          }
          if (r.field_A &&
            !wl.field_N) {
            return;
          }
          var11 -= 2;
          var12 = var12 + (param2.descent + 4);
          for (var13 = 0; var13 < -1 + param3.lives; var13++) {
            if (var13 < -2 + param3.lives) {
              ch.field_l.a(var11, var12, 196);
            } else {
              ch.field_l.e(ch.field_l.canvasWidth / 2 + var11, var12 + ch.field_l.canvasHeight / 2, 0, 4480 + (BrickABrac.cosine8192(2048, 200 * MembershipBenefitsScreen.clientTick) * 384 >> 16));
            }
            var11 = var11 + ch.field_l.width / 2;
            if (param5 + param7 < var11 + ch.field_l.width) {
              var12 = var12 + (ch.field_l.height + 2);
              var11 = param5 + var8_int - 2;
            }
            if (var12 + ch.field_l.height > param6 - (-param0 + var9)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("tk.VB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(int param0) {
        quickChatRecipient = null;
        field_o = null;
        if (param0 != -2) {
          quickChatRecipient = (String) null;
        }
        field_m = null;
        jungleCapsSprites = (RgbSprite[][]) null;
        field_k = null;
        field_i = null;
        field_t = null;
    }

    final static int a(int param0, byte param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -55) {
            field_k = (byte[]) null;
          }
          stackIn_3_0 = sq.a((byte) -32, param0, true, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tk.QB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final long getSecondaryKey(int obfuscationGuard) {
        if (obfuscationGuard != -19451) {
          this.secondaryNext = (DualLinkNode) null;
        }
        return this.secondaryKey;
    }

    final boolean isSecondaryLinked(int obfuscationGuard) {
        if (obfuscationGuard != 2) {
          DualLinkNode.prepareRankingScratch((byte) 86, 25, 9);
        }
        if (null == this.secondaryPrevious) {
          return false;
        }
        return true;
    }

    final void setSecondaryKey(long key, int obfuscationGuard) {
        if (this.secondaryPrevious != null) {
          throw new RuntimeException();
        }
        if (obfuscationGuard >= -62) {
          field_k = (byte[]) null;
        }
        this.secondaryKey = key;
    }

    final static void prepareRankingScratch(byte obfuscationGuard, int recordCount, int rowLimit) {
        if (null == cf.rankingSourceIndices ||
          !(recordCount <= cf.rankingSourceIndices.length)) {
          cf.rankingSourceIndices = new int[recordCount * 2];
        }
        if (ec.rankingRatings == null ||
          !(ec.rankingRatings.length >= recordCount)) {
          ec.rankingRatings = new int[recordCount * 2];
        }
        if (RankingsScreen.rankingWins == null ||
          !(RankingsScreen.rankingWins.length >= recordCount)) {
          RankingsScreen.rankingWins = new int[recordCount * 2];
        }
        if (ObjectHistoryBuffer.rankingDraws == null ||
          !(recordCount <= ObjectHistoryBuffer.rankingDraws.length)) {
          ObjectHistoryBuffer.rankingDraws = new int[recordCount * 2];
        }
        if (null == ib.rankingLosses ||
          !(recordCount <= ib.rankingLosses.length)) {
          ib.rankingLosses = new int[2 * recordCount];
        }
        if (pj.rankingWinRateThousandths == null ||
          !(pj.rankingWinRateThousandths.length >= recordCount)) {
          pj.rankingWinRateThousandths = new int[2 * recordCount];
        }
        if (VerticalScrollbar.rankingSortIndices == null ||
          !(rowLimit + recordCount <= VerticalScrollbar.rankingSortIndices.length)) {
          VerticalScrollbar.rankingSortIndices = new int[2 * (rowLimit + recordCount)];
        }
        if (null == ga.field_l ||
          !(ga.field_l.length >= recordCount)) {
          ga.field_l = new boolean[2 * recordCount];
        }
        BoundedFile.field_l = -2147483648;
        if (obfuscationGuard < 0) {
          return;
        }
        wi.rankingRowCount = 0;
        ba.field_w = 2147483647;
        IntArrayRequest.field_u = 2147483647;
        uf.field_b = -2147483648;
    }

    final static boolean isValidSocialName(CharSequence name, boolean obfuscationGuard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!bd.hasValidPlayerNameShape(name, 0, true)) {
            return false;
          }
          var2_int = 0;
          if (obfuscationGuard) {
            var4 = (CharSequence) null;
            DualLinkNode.isValidSocialName((CharSequence) null, false);
          }
          while (true) {
            if (name.length() <= var2_int) {
              return true;
            }
            if (m.isNameCharacter(true, name.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("tk.SB(");
          if (name == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    protected DualLinkNode() {
    }

    static {
        field_o = "Honour";
        field_m = "Show game chat from my friends";
        field_k = new byte[]{(byte) 1};
        field_i = "Scamming";
    }
}
