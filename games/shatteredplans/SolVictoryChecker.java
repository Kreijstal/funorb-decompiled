/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SolVictoryChecker extends VictoryChecker {
    static int field_m;
    static String field_q;
    private int field_r;
    private int[] field_n;
    static String field_k;
    private Player field_o;
    static int field_p;
    private Player field_l;

    final int resultsPanelHeight(boolean param0) {
        if (param0) {
          GameScreen var3 = (GameScreen) null;
          this.showResults((byte) -126, (GameState) null, (GameScreen) null);
        }
        return rs.field_Cb.field_J * 3 + this.field_n.length * PasswordValidator.field_n;
    }

    final boolean detectWinners(GameState param0, byte param1) {
        int var7 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var3_intLifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (super.detectWinners(param0, (byte) 100)) {
            return true;
          }
          this.field_l = param0.field_g.field_e[36].field_y;
          if (this.field_l != null) {
            this.field_n[this.field_l.field_x] = this.field_n[this.field_l.field_x] + 1;
            if (this.field_o != null) {
              if (this.field_o == this.field_l) {
              }
            } else {
              this.field_o = this.field_l;
            }
          }
          for (var3_int = 0; var3_int < this.field_i.length; var3_int++) {
            if ((param0.field_w & 1 << var3_int) != 0) {
              this.field_n[var3_int] = -1;
            }
          }
          if (param0.field_O < 19) {
            return false;
          }
          var3_intLifetime1 = 0;
          var4 = 0;
          var5 = null;
          for (var6 = 0; this.field_n.length > var6; var6++) {
            if (var3_intLifetime1 == this.field_n[var6]) {
              var4++;
            }
            if (var3_intLifetime1 < this.field_n[var6]) {
              var4 = 1;
              var5 = this.field_i[var6];
              var3_intLifetime1 = this.field_n[var6];
            }
          }
          if (1 == var4) {
            this.field_g = new Player[]{(Player) (var5)};
            return true;
          }
          for (var6Lifetime1 = 0; this.field_i.length > var6Lifetime1; var6Lifetime1++) {
            if (this.field_n[var6Lifetime1] == var3_intLifetime1 &&
              this.field_i[var6Lifetime1] == this.field_l) {
              this.field_g = new Player[]{this.field_l};
              return true;
            }
          }
          this.field_g = new Player[var4];
          var6Lifetime2 = 0;
          if (param1 <= 23) {
            SolVictoryChecker.blendColours(116, -102, -108, -15);
          }
          for (var7 = 0; this.field_i.length > var7; var7++) {
            if (this.field_n[var7] == var3_intLifetime1) {
              this.field_g[var6Lifetime2] = this.field_i[var7];
              var6Lifetime2++;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_48_0 = var3;
          stackIn_48_1 = new StringBuilder().append("ui.F(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int blendColours(int param0, int param1, int param2, int param3) {
        int var4 = 16711935 & param0;
        param0 = param0 & 65280;
        if (param2 >= -77) {
          field_m = 86;
        }
        int var5 = param1 & 16711935;
        param1 = param1 & 65280;
        return param3 * param1 + (256 - param3) * param0 >>> 8 & -1778319616 | -352386817 & (-param3 + 256) * var4 + param3 * var5 >>> 8;
    }

    final static String c(boolean param0) {
        if (param0) {
          field_p = 84;
        }
        return cg.field_F;
    }

    final void writeScores(int param0, PacketBuffer param1) {
        int var3_int = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var3_int = 0; var3_int < this.field_n.length; var3_int++) {
            param1.writeByte(this.field_n[var3_int], (byte) -105);
          }
          int var4 = -70 % ((param0 + 72) / 45);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ui.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final Player[] projectedWinners(int param0) {
        int var4_int = 0;
        int var2;
        int var3;
        int var5;
        int var7;
        int stackIn_9_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_1 = 0;
        Player[] var4;
        int var6;
        int var8;
        int var5Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 0) {
          this.field_n = (int[]) null;
        }
        if (this.field_g != null) {
          return this.field_g;
        }
        var2 = 0;
        var3 = 1;
        for (var4_int = 0; this.field_i.length > var4_int; var4_int++) {
          if (this.field_l != this.field_i[var4_int]) {
            stackIn_9_0 = 0;
          } else {
            stackIn_9_0 = this.field_r;
          }
          var5 = stackIn_9_0 + this.field_n[var4_int];
          if (var5 == var3) {
            var2++;
          }
          if (var3 < var5) {
            var2 = 1;
            var3 = var5;
          }
        }
        var4 = new Player[var2];
        var8 = 0;
        var5Lifetime1 = var8;
        while (var8 < this.field_i.length) {
          stackIn_21_0 = this.field_n[var8];
          if (this.field_i[var8] != this.field_l) {
            stackIn_22_1 = 0;
          } else {
            stackIn_22_1 = this.field_r;
          }
          var6 = stackIn_21_0 + stackIn_22_1;
          if (var3 == var6) {
            var2--;
            var4[var2] = this.field_i[var8];
          }
          var8++;
        }
        return var4;
    }

    final void readScores(PacketBuffer param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 != -109) {
            return;
          }
          for (var3_int = 0; var3_int < this.field_n.length; var3_int++) {
            this.field_n[var3_int] = param0.readSignedByte(-2852);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ui.G(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void showResults(byte param0, GameState param1, GameScreen param2) {
        int var8_int = 0;
        int var11_int = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        MenuLabel[] var7_array = null;
        Player[] var8 = null;
        int[] var9 = null;
        int var9_int = 0;
        int[] var10 = null;
        Player[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        Player var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        MenuLabel[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int var6Lifetime1;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var16 = param1.field_g.field_e[36].field_y;
          var20 = new int[this.field_i.length];
          var14 = var20;
          var5 = var14;
          for (var6 = 0; var6 < var20.length; var6++) {
            var20[var6] = var6;
          }
          var6Lifetime1 = 0;
          var21 = this.field_n;
          var15 = var21;
          var13 = var15;
          var7 = var13;
          for (var8_int = 0; var8_int < var21.length; var8_int++) {
            var9_int = var21[var8_int];
            var6Lifetime1 = var6Lifetime1 + var9_int;
          }
          if (param0 >= -9) {
            return;
          }
          if (var6Lifetime1 > 0) {
            lh.a((byte) 84, var5, (int[]) ((Object) this.field_n.clone()));
          }
          var19 = new MenuLabel[3];
          var7_array = var19;
          var7_array[0] = new MenuLabel(0, 0, 182, rs.field_Cb.field_J, QuickChatCategoryRegistry.a(hr.field_d, 4371, new String[]{Integer.toString(-param1.field_O + 20)}));
          if (var16 == null) {
            var7_array[1] = new MenuLabel(0, 0, 182, rs.field_Cb.field_J, TutorialAi.field_t);
            var7_array[2] = new MenuLabel(0, 0, 182, rs.field_Cb.field_J, (String) null);
          } else {
            var7_array[1] = new MenuLabel(0, 0, 182, rs.field_Cb.field_J, ms.field_h);
            var7_array[2] = new MenuLabel(0, 0, 182, rs.field_Cb.field_J, var16.name, var16.field_k);
          }
          var8 = new Player[this.field_i.length];
          var23 = new int[this.field_i.length];
          var18 = var23;
          var9 = var18;
          var22 = new int[this.field_i.length];
          var17 = var22;
          var10 = var17;
          for (var11_int = 0; var11_int < this.field_i.length; var11_int++) {
            var8[var11_int] = this.field_i[var20[var11_int]];
            var9[var11_int] = this.field_n[var20[var11_int]];
            stackIn_19_0 = var10;
            stackIn_19_1 = var11_int;
            if (var16 != this.field_i[var20[var11_int]]) {
              stackIn_20_2 = 0;
            } else {
              stackIn_20_2 = 1;
            }
            stackIn_19_0[stackIn_19_1] = stackIn_20_2;
          }
          var11 = this.projectedWinners(0);
          if (this.field_g != null) {
            this.field_r = 0;
          } else {
            this.field_r = 20 - param1.field_O;
          }
          param2.showResultsDialog(20, var8, var22, var23, var11, var19, (byte) -47, this.field_r);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("ui.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void clearStatics(int param0) {
        field_k = null;
        field_q = null;
        if (param0 != -26088) {
          field_k = (String) null;
        }
    }

    final static int a(int param0, byte param1, boolean param2, String param3, boolean param4, String param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_32_0 = 0;
          boolean stackIn_44_0 = false;
          boolean stackIn_48_0 = false;
          boolean stackIn_51_0 = false;
          boolean stackIn_54_0 = false;
          int stackIn_81_0 = 0;
          int stackIn_87_0 = 0;
          int stackIn_92_0 = 0;
          int stackIn_102_0 = 0;
          int stackIn_104_0 = 0;
          RuntimeException stackIn_107_0 = null;
          StringBuilder stackIn_107_1 = null;
          String stackIn_108_2 = null;
          StringBuilder stackIn_110_1 = null;
          String stackIn_111_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            if (wg.field_f == null &&
              !ts.a(param2, -2)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (LegacyAi.field_r == Wormhole.field_j) {
              if (!param2) {
                mq.field_c = aj.a(param5, false, false, param3);
              } else {
                var10 = (String) null;
                mq.field_c = dd.a(false, param3, (String) null, 4684, TertiaryListSequence.field_l);
              }
              js.field_f.position = 0;
              js.field_f.writeByte(14, (byte) -80);
              js.field_f.writeByte(mq.field_c.a((byte) -73).field_d, (byte) -68);
              d.$cfr$intArgs$a$a6964d7afeb1(-1, 82);
              Wormhole.field_j = IntrusiveNodeHashTable.field_i;
            }
            if (IntrusiveNodeHashTable.field_i == Wormhole.field_j &&
              StarAnnotation.a(-90, 1)) {
              var6_int = sa.field_a.readUnsignedByte(-92);
              sa.field_a.position = 0;
              if (var6_int != 0) {
                BufferedCacheFile.field_e = var6_int;
                Wormhole.field_j = Player.field_l;
                rr.field_t = -1;
              } else {
                Wormhole.field_j = MusicVoice.field_m;
              }
            }
            if (MusicVoice.field_m == Wormhole.field_j &&
              StarAnnotation.a(-91, 8)) {
              Dialog.field_I = sa.field_a.readLong(110);
              sa.field_a.position = 0;
              gi.a(param0, param2, param4, -84, mq.field_c);
              Wormhole.field_j = IntrusiveNodeHashTable.field_d;
            }
            boolean decompiledFrameRemainder0 = true;
            if (IntrusiveNodeHashTable.field_d == Wormhole.field_j &&
              StarAnnotation.a(119, 1)) {
              var6_intLifetime1 = sa.field_a.readUnsignedByte(-63);
              fr.field_H = null;
              sa.field_a.position = 0;
              BufferedCacheFile.field_e = var6_intLifetime1;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  rr.field_t = -1;
                  Wormhole.field_j = Player.field_l;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  q.g(-118);
                  BufferedSocket.field_j = false;
                  stackIn_32_0 = var6_intLifetime1;
                  return stackIn_32_0;
                }
              }
              if (decompiledFrameRemainder0) {
                Wormhole.field_j = SolMapReader.field_c;
                rr.field_t = -1;
              }
            }
            if (SolMapReader.field_c == Wormhole.field_j &&
              uc.d((byte) -46)) {
              TertiaryListSequence.field_l = sa.field_a.readLong(46);
              di.field_q = param3;
              bs.field_b = sa.field_a.readUnsignedByte(-85);
              CellVertex.field_i = sa.field_a.readUnsignedByte(-89);
              StarAnnotation.field_m = sa.field_a.readUnsignedShort(-20976);
              var6 = sa.field_a.readNullableString(1910283844);
              var7 = sa.field_a.readUnsignedByte(-123);
              if ((var7 & 1) != 0) {
                ij.a(24);
              }
              stackIn_44_0 = (0 != (16 & var7));
              va.field_j = stackIn_44_0;
              if (!param2) {
                stackIn_48_0 = ((4 & var7) != 0);
                QuickChatPhraseDefinition.field_v = stackIn_48_0;
                stackIn_51_0 = ((var7 & 8) != 0);
                bg.field_g = stackIn_51_0;
                stackIn_54_0 = ((2 & var7) != 0);
                ae.field_b = stackIn_54_0;
                if (bg.field_g) {
                  ae.field_b = true;
                }
              }
              if (StandardAi.field_a) {
                sa.field_a.readUnsignedByte(-66);
                sa.field_a.readUnsignedByte(-102);
                sa.field_a.readInt(16711680);
                ir.field_E = sa.field_a.readUnsignedShort(-20976);
                TurnEventLog.field_c = new byte[ir.field_E];
                for (var8 = 0; ir.field_E > var8; var8++) {
                  TurnEventLog.field_c[var8] = sa.field_a.readSignedByte(-2852);
                }
              }
              Star.field_o = sa.field_a.readString(-1);
              var11 = (CharSequence) ((Object) Star.field_o);
              ArchiveIndex.field_d = ji.a(var11, true);
              CheckboxPainter.field_n = sa.field_a.readUnsignedByte(-112);
              Wormhole.field_j = ih.field_f;
              if (mq.field_c.a((byte) 115) != IsolationistAi.field_u) {
                if (mq.field_c.a((byte) 123) == oi.field_b) {
                  ObjectList.field_f.a(GameScreen.getHostApplet((byte) 126), true);
                }
              } else {
                og.field_b.a(GameScreen.getHostApplet((byte) 127), true);
              }
              BufferedSocket.field_j = false;
              if (var6 != null) {
                jf.a(-25602, var6, GameScreen.getHostApplet((byte) 125));
              }
              if (StarAnnotation.field_m <= 0 &&
                !QuickChatPhraseDefinition.field_v) {
                try {
                  ll.callJavaScript("unzap", GameScreen.getHostApplet((byte) 127), (byte) 121);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  ll.callJavaScriptWithArguments(GameScreen.getHostApplet((byte) 125), "zap", new Object[]{TertiaryListSequence.a((byte) -67, TertiaryListSequence.field_l)}, -116);
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (StarAnnotation.field_m > 0) {
                DualLinkDeque.field_b = true;
              }
              js.field_f.a(qn.field_b, (byte) -77);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                qn.field_b[var8Lifetime1] = qn.field_b[var8Lifetime1] + 50;
              }
              sa.field_a.a(qn.field_b, (byte) 107);
              stackIn_81_0 = BufferedCacheFile.field_e;
              return stackIn_81_0;
            }
            if (Wormhole.field_j == Player.field_l &&
              uc.d((byte) -33)) {
              q.g(-114);
              if (BufferedCacheFile.field_e == 7 &&
                !BufferedSocket.field_j) {
                BufferedSocket.field_j = true;
                stackIn_87_0 = -1;
                return stackIn_87_0;
              }
              if (BufferedCacheFile.field_e == 7) {
                BufferedCacheFile.field_e = 3;
              }
              nl.field_c = sa.field_a.readString(-1);
              BufferedSocket.field_j = false;
              stackIn_92_0 = BufferedCacheFile.field_e;
              return stackIn_92_0;
            }
            if (param1 > -48) {
              SolVictoryChecker.blendColours(-26, -48, -112, -53);
            }
            if (wg.field_f == null) {
              if (BufferedSocket.field_j) {
                if (wh.a(18) <= 30000L) {
                  nl.field_c = QuaternaryNodeList.field_d;
                } else {
                  nl.field_c = gq.field_f;
                }
                BufferedSocket.field_j = false;
                stackIn_102_0 = 3;
                return stackIn_102_0;
              }
              var6_intLifetime2 = of.field_f;
              of.field_f = bb.field_c;
              BufferedSocket.field_j = true;
              bb.field_c = var6_intLifetime2;
            }
            stackIn_104_0 = -1;
            return stackIn_104_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_107_0 = var6_ref;
            stackIn_107_1 = new StringBuilder().append("ui.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_108_2 = "null";
            } else {
              stackIn_108_2 = "{...}";
            }
            stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_111_2 = "null";
            } else {
              stackIn_111_2 = "{...}";
            }
            throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    SolVictoryChecker(Player[] param0) {
        super(param0);
        try {
          this.field_n = new int[this.field_i.length];
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = "Projected winner.";
        field_k = "(1 player wants to join)";
    }
}
