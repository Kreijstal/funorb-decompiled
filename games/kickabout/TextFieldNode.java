/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextFieldNode extends UiLayoutNode {
    private boolean field_Jb;
    static boolean field_Rb;
    static long field_Ib;
    static String field_Vb;
    private StringBuilder field_Ub;
    static int field_Ob;
    private int field_Mb;
    private boolean field_Hb;
    private PlatformTask field_Gb;
    private int field_Tb;
    private PlatformTaskDispatcher field_Pb;
    static String field_Cb;
    static boolean field_Wb;
    private long field_Sb;
    static int field_zb;
    static UiLayoutNode field_Qb;
    static GameSoundEffect[] field_Db;
    private UiLayoutNode field_yb;
    static String field_Kb;
    static PcmStreamMixer field_Bb;
    private int field_Ab;
    private int field_Eb;
    private int field_Fb;
    private UiLayoutNode field_Nb;
    UiLayoutNode field_Lb;

    private final void deleteSelection(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        StringBuilder discarded$0 = null;
        if (param0 != 32) {
          return;
        }
        if (this.field_Mb != this.field_Fb) {
          var2 = this.field_Mb <= this.field_Fb ? this.field_Mb : this.field_Fb;
          var3 = this.field_Mb <= this.field_Fb ? this.field_Fb : this.field_Mb;
          this.field_Fb = var2;
          this.field_Mb = var2;
          var4 = this.field_Ub.toString().substring(var3, this.field_Ub.length());
          PagedHelpScreen.a(var2, ' ', param0 - 11439, this.field_Ub);
          discarded$0 = this.field_Ub.append(var4);
          this.field_Lb.field_E = this.field_Ub.toString();
        }
    }

    TextFieldNode(long param0, UiLayoutNode param1, UiLayoutNode param2, UiLayoutNode param3, int param4) {
        super(param0, param1);
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0;
        StringBuilder stackIn_4_1;
        StringBuilder stackIn_4_2;
        int stackIn_4_3;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_Sb = 0L;
        this.field_Tb = -1;
        this.field_Jb = false;
        this.field_Hb = false;
        try {
          this.field_Eb = param4;
          this.field_Nb = new UiLayoutNode(0L, param2);
          this.field_Lb = new UiLayoutNode(0L, param3);
          this.field_yb = new UiLayoutNode(0L, param3);
          this.field_nb = true;
          stackIn_3_1 = null;
          stackIn_3_2 = null;
          if (this.field_Eb != -1) {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = this.field_Eb;
          } else {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = 256;
          }
          this.field_Ub = new StringBuilder(stackIn_4_3);
          this.field_Lb.field_E = this.field_Ub.toString();
          this.field_yb.field_E = "";
          this.field_yb.field_V = "|";
          this.field_jb = new IntrusiveDeque();
          this.addChild((byte) -123, this.field_Nb);
          this.addChild((byte) -113, this.field_Lb);
          this.addChild((byte) -115, this.field_yb);
          this.field_wb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("vg.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 96) {
          TextFieldNode.getSuggestedLoginName(49);
        }
        field_Kb = null;
        field_Vb = null;
        field_Cb = null;
        field_Bb = null;
        field_Db = null;
        field_Qb = null;
    }

    private final void copySelectionToClipboard(boolean param0) {
        if (param0) {
          field_Wb = false;
        }
        if (null == this.field_Pb) {
          return;
        }
        String var2 = this.getSelectedText((byte) 35);
        if (var2.length() == 0) {
          return;
        }
        java.awt.datatransfer.StringSelection var3 = new java.awt.datatransfer.StringSelection(this.getSelectedText((byte) 35));
        this.field_Pb.requestClipboardWrite((byte) 68, (java.awt.datatransfer.Transferable) ((Object) var3));
    }

    final void clear(int param0) {
        int discarded$0 = 0;
        PagedHelpScreen.a(0, ' ', -11407, this.field_Ub);
        this.field_Mb = 0;
        this.field_Fb = 0;
        if (param0 != -19174) {
          discarded$0 = this.previousWordBoundary(-14);
        }
        this.field_Lb.field_E = this.field_Ub.toString();
    }

    final static void flushWithSimulatedLag(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        DelayedServerPacket var6_ref_jm = null;
        int var7 = 0;
        byte[] var8 = null;
        DelayedServerPacket var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        DelayedServerPacket var13 = null;
        byte[] var14 = null;
        byte[] var17 = null;
        int var6Lifetime1;
        var7 = Kickabout.field_G;
        try {
          if (PitchProjectionSupport.field_b != 0) {
            var2_long = MonotonicClock.monotonicMillis(param1 - 75);
            var4 = PitchProjectionSupport.field_b;
            if (0.0 != WhirlpoolHasher.field_a) {
              var4 = (int)((double)var4 + TrinketUnlockNotice.field_d.nextGaussian() * WhirlpoolHasher.field_a);
              if (0 > var4) {
                var4 = 0;
              }
            }
            if (FootballerAiOverlaySupport.field_d.field_n > 0) {
              var14 = new byte[FootballerAiOverlaySupport.field_d.field_n];
              var11 = var14;
              var8 = var11;
              var17 = var8;
              for (var6 = 0; var6 < var14.length; var6++) {
                var8[var6] = FootballerAiOverlaySupport.field_d.field_f[var6];
              }
              var6_ref_jm = new DelayedServerPacket((long)var4 + var2_long, FootballerAiOverlaySupport.field_d.field_n, var17);
              DualLinkNode.field_g.addLast(var6_ref_jm, 3);
              FootballerAiOverlaySupport.field_d.field_n = 0;
            }
            var9 = (DelayedServerPacket) (DualLinkNode.field_g.first(24009));
            var13 = var9;
            if (var13 != null &&
              var13.dueTime < var2_long) {
              var13.c((byte) -109);
              var10 = 0;
              var6Lifetime1 = var10;
              while (var10 < var13.opcode) {
                FootballerAiOverlaySupport.field_d.field_f[var10] = var9.data[var10];
                var10++;
              }
              FootballerAiOverlaySupport.field_d.field_n = var13.opcode;
            }
          }
          ClientPacketFlushSupport.flushPackets(param0, false);
          if (param1 != 0) {
            field_Qb = (UiLayoutNode) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "vg.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void setPlatformDispatcher(PlatformTaskDispatcher param0, int param1) {
        if (param1 != -17421) {
          return;
        }
        try {
          this.field_Pb = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "vg.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void setTextColour(int param0, byte param1) {
        int var3 = 20 / ((62 - param1) / 58);
        if (null != this.field_Lb) {
          this.field_Lb.field_y = param0;
        }
    }

    final static void writeRankingsRequest(boolean param0, RankingsRequest param1, int param2) {
        CipherPacketBuffer var3 = null;
        try {
          var3 = FootballerAiOverlaySupport.field_d;
          var3.writeIsaacByte(param2, (byte) 98);
          if (!param0) {
            TextFieldNode.flushWithSimulatedLag(-62, -59);
          }
          var3.writeByte(127, param1.field_k);
          var3.writeByte(115, param1.field_p);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "vg.RA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int getCaretPosition(int param0) {
        if (param0 != -1) {
          return 64;
        }
        return this.field_Mb;
    }

    final static boolean e(int param0, int param1) {
        int var2 = param1;
        MarkerSliderWidget.a(var2, WhirlpoolHasher.field_a, MessageDialog.field_B, 0, var2);
        if (param0 != -63) {
          TextFieldNode.b(-62, 88);
        }
        return true;
    }

    final void setText(String param0, int param1) {
        int var3_int = 0;
        StringBuilder discarded$0 = null;
        int dupTemp$1 = 0;
        try {
          this.field_Ub.setLength(0);
          if (param1 != -23174) {
            this.setCaret(24, 5);
          }
          var3_int = param0.length();
          if (this.field_Eb != -1 &&
            this.field_Eb < var3_int) {
            var3_int = this.field_Eb;
          }
          discarded$0 = this.field_Ub.append(param0.substring(0, var3_int));
          dupTemp$1 = this.field_Ub.length();
          this.field_Fb = dupTemp$1;
          this.field_Mb = dupTemp$1;
          this.field_Lb.field_E = this.field_Ub.toString();
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "vg.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0, int param1) {
        SortCriterion.field_c = StatChoiceDialog.field_G[param0];
        HuffmanCodec.field_g = ConsoleParseException.field_g[param0];
        if (param1 != 31900) {
          field_Qb = (UiLayoutNode) null;
        }
        TutorialMessages.field_e = UiKeyRoutingSupport.field_a[param0];
    }

    private final void cutSelection(byte param0) {
        if (null == this.field_Pb) {
          return;
        }
        this.copySelectionToClipboard(false);
        if (param0 <= 42) {
          this.updatePointer(-41);
        }
        this.deleteSelection(32);
    }

    private final void requestPaste(byte param0) {
        if (param0 != 38) {
          return;
        }
        if (null == this.field_Pb) {
          return;
        }
        this.field_Gb = this.field_Pb.requestDisplayModes(15);
    }

    private final int characterIndexAtWidth(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Kickabout.field_G;
        var3 = param1;
        var4 = 0;
        var5 = this.field_Ub.length();
        while (var4 < param0) {
          if (var5 > var3) {
            incrementValue$1 = var3;
            var3++;
            var4 = var4 + this.field_Lb.field_X.charWidth(this.field_Ub.charAt(incrementValue$1));
            continue;
          }
          break;
        }
        return var3;
    }

    final boolean handleKey(int param0, char param1, int param2) {
        int discarded$0 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int stackIn_31_0 = 0;
        int stackIn_52_0 = 0;
        int var4;
        String var5;
        if (param1 != 60 &&
          param1 != 62) {
          if (param2 != 875) {
            discarded$0 = this.characterIndexAtWidth(-84, 20);
          }
          if (param1 >= 32 &&
            param1 <= 126) {
            if (this.field_Fb != this.field_Mb) {
              this.deleteSelection(32);
            }
            if (this.field_Eb != -1 &&
              this.field_Ub.length() >= this.field_Eb) {
              return true;
            }
            if (this.field_Mb == this.field_Ub.length()) {
              discarded$1 = this.field_Ub.append(param1);
            } else {
              var5 = this.field_Ub.toString().substring(this.field_Mb, this.field_Ub.length());
              PagedHelpScreen.a(this.field_Mb, ' ', param2 - 12282, this.field_Ub);
              discarded$2 = this.field_Ub.append(param1);
              discarded$3 = this.field_Ub.append(var5);
            }
            this.field_Lb.field_E = this.field_Ub.toString();
            this.field_Mb = this.field_Mb + 1;
            this.field_Fb = this.field_Mb;
            return true;
          }
          if (85 == param0) {
            if (this.field_Mb != this.field_Fb) {
              this.deleteSelection(32);
              return true;
            }
            if (this.field_Mb > 0) {
              this.field_Fb = -1 + this.field_Mb;
              this.deleteSelection(32);
              return true;
            }
          } else {
            if (param0 != 101) {
              if (param0 == 13) {
                this.clear(-19174);
                return true;
              }
              if (param0 != 96) {
                if (param0 == 97) {
                  if (this.field_Mb < this.field_Ub.length()) {
                    if (GameplayHelpScreen.field_G[82]) {
                      stackIn_52_0 = this.nextWordBoundary(-100);
                    } else {
                      stackIn_52_0 = this.field_Mb + 1;
                    }
                    var4 = stackIn_52_0;
                    this.moveCaret(var4, (byte) -115);
                    return true;
                  }
                } else {
                  if (102 == param0) {
                    this.moveCaret(0, (byte) -126);
                    return true;
                  }
                  if (param0 == 103) {
                    this.moveCaret(this.field_Ub.length(), (byte) -103);
                    return true;
                  }
                  if (GameplayHelpScreen.field_G[82] &&
                    65 == param0) {
                    this.cutSelection((byte) 74);
                    return true;
                  }
                  if (GameplayHelpScreen.field_G[82] &&
                    param0 == 66) {
                    this.copySelectionToClipboard(false);
                    return true;
                  }
                  if (GameplayHelpScreen.field_G[82] &&
                    param0 == 67) {
                    this.requestPaste((byte) 38);
                    return true;
                  }
                }
              } else {
                if (this.field_Mb > 0) {
                  if (GameplayHelpScreen.field_G[82]) {
                    stackIn_31_0 = this.previousWordBoundary(26864);
                  } else {
                    stackIn_31_0 = this.field_Mb - 1;
                  }
                  var4 = stackIn_31_0;
                  this.moveCaret(var4, (byte) -103);
                  return true;
                }
              }
            } else {
              if (this.field_Fb != this.field_Mb) {
                this.deleteSelection(32);
                return true;
              }
              if (this.field_Mb < this.field_Ub.length()) {
                this.field_Fb = 1 + this.field_Mb;
                this.deleteSelection(32);
                return true;
              }
            }
          }
          return false;
        }
        return false;
    }

    final String getText(byte param0) {
        if (param0 != -16) {
          return (String) null;
        }
        return this.field_Ub.toString();
    }

    final String getSelectedText(byte param0) {
        if (param0 != 35) {
          this.field_yb = (UiLayoutNode) null;
        }
        String var2 = this.field_Ub.toString();
        int var3 = this.field_Mb <= this.field_Fb ? this.field_Mb : this.field_Fb;
        int var4 = this.field_Mb <= this.field_Fb ? this.field_Fb : this.field_Mb;
        return var2.substring(var3, var4);
    }

    private final int nextWordBoundary(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        var2 = this.field_Ub.length();
        var3 = 112 / ((param0 - 27) / 50);
        if (this.field_Mb == var2) {
          return this.field_Mb;
        }
        for (var4 = this.field_Mb + 1; var4 < var2; var4++) {
          if (!PlayerMeshFactory.isSpaceOrParenthesis(-41, this.field_Ub.charAt(-1 + var4))) {
            continue;
          }
          break;
        }
        return var4;
    }

    final void setCaret(int param0, int param1) {
        this.field_Mb = param1;
        this.field_Fb = param1;
        if (param0 > -22) {
          this.layoutTextField(88, -94, -16, -118, -110);
        }
    }

    final static String getSuggestedLoginName(int param0) {
        int var1 = 100 / ((36 - param0) / 50);
        String var2 = "";
        if (IsSixCommand.field_E != null) {
          var2 = IsSixCommand.field_E.getUsername(124);
        }
        if (var2.length() == 0) {
          var2 = NamedValueEntry.f((byte) 99);
        }
        if (0 == var2.length()) {
          var2 = DisplayNameUiSupport.field_d;
        }
        return var2;
    }

    private final void moveCaret(int param0, byte param1) {
        this.field_Mb = param0;
        if (param1 > -70) {
          TextFieldNode.flushWithSimulatedLag(-51, -118);
        }
        if (!GameplayHelpScreen.field_G[81]) {
          this.field_Fb = this.field_Mb;
        }
    }

    private final int previousWordBoundary(int param0) {
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        if (param0 != 26864) {
          this.deleteSelection(11);
        }
        if (this.field_Mb == 0) {
          return this.field_Mb;
        }
        for (var2 = this.field_Mb - 1; var2 > 0; var2--) {
          if (!PlayerMeshFactory.isSpaceOrParenthesis(-41, this.field_Ub.charAt(-1 + var2))) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final void insertText(String param0, int param1) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        int var3_int = 0;
        String var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_Eb != -1) {
            var3_int = this.field_Eb - this.field_Ub.length();
            if (0 == var3_int) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (param1 >= -1) {
            field_Wb = true;
          }
          if (this.field_Mb != this.field_Ub.length()) {
            var4 = this.field_Ub.toString().substring(this.field_Mb, this.field_Ub.length());
            PagedHelpScreen.a(this.field_Mb, ' ', -11407, this.field_Ub);
            discarded$4 = this.field_Ub.append(param0);
            discarded$5 = this.field_Ub.append(var4);
          } else {
            discarded$6 = this.field_Ub.append(param0);
          }
          this.field_Lb.field_E = this.field_Ub.toString();
          this.field_Mb = this.field_Ub.length();
          this.field_Fb = this.field_Mb;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("vg.IA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    TextFieldNode(long param0, UiLayoutNode param1, UiLayoutNode param2, UiLayoutNode param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void setSelection(int param0, byte param1, int param2) {
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        var4 = this.field_Ub.length();
        if (param0 < 0) {
          param0 = 0;
        } else {
          if (var4 < param0) {
            param0 = var4;
          }
        }
        if (param1 >= -83) {
          this.copySelectionToClipboard(false);
        }
        if (param2 >= 0) {
          if (var4 < param2) {
            param2 = var4;
          }
        } else {
          param2 = 0;
        }
        this.field_Mb = param0;
        this.field_Fb = param2;
    }

    final void updatePointer(int param0) {
        try {
          int dupTemp$0 = 0;
          boolean stackIn_14_1 = false;
          int stackIn_28_0 = 0;
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          long var3_long = 0L;
          int var3 = 0;
          int var4_int = 0;
          Exception var4 = null;
          int var5 = 0;
          int var6 = 0;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          var6 = Kickabout.field_G;
          var2 = this.characterIndexAtWidth(BytePlusOneCommand.field_A - this.field_F - this.field_Lb.field_D, param0 ^ param0);
          if (this.field_sb == 1) {
            this.moveCaret(var2, (byte) -112);
            this.field_Jb = true;
            var3_long = MonotonicClock.monotonicMillis(-69);
            stackIn_14_1 = !(var3_long - this.field_Sb >= 250L);
            this.field_Hb = stackIn_14_1;
            if (this.field_Hb) {
              this.field_Fb = this.previousWordBoundary(26864);
              this.field_Mb = this.nextWordBoundary(-26);
              if (this.field_Mb > 0 &&
                32 == this.field_Ub.charAt(this.field_Mb - 1)) {
                this.field_Mb = this.field_Mb - 1;
              }
              this.field_Tb = this.field_Mb;
            }
            this.field_Sb = var3_long;
          } else {
            if (1 == FootballerAgent.field_p &&
              this.field_Jb) {
              if (this.field_Hb &&
                var2 < this.field_Tb &&
                this.field_Fb < var2) {
                var2 = this.field_Tb;
              }
              this.field_Mb = var2;
            } else {
              this.field_Jb = false;
            }
          }
          if (!this.field_wb) {
            dupTemp$0 = this.field_Ub.length();
            this.field_Fb = dupTemp$0;
            this.field_Mb = dupTemp$0;
          }
          this.field_yb.field_s = this.field_Lb.field_X.stringWidth(this.field_Ub.toString().substring(0, this.field_Mb));
          if (this.field_Fb != this.field_Mb) {
            var3 = this.field_Lb.field_s + this.field_Lb.field_X.stringWidth(this.field_Ub.toString().substring(0, this.field_Fb));
            if (var3 < this.field_yb.field_s) {
              stackIn_28_0 = var3;
            } else {
              stackIn_28_0 = this.field_yb.field_s;
            }
            var4_int = stackIn_28_0;
            var5 = Math.abs(-this.field_yb.field_s + var3);
            this.field_Nb.setBounds(true, var5, var4_int + this.field_Lb.field_D, 2, this.field_Ab);
          } else {
            this.field_Nb.setBounds(true, 0, this.field_yb.field_s, 2, this.field_Ab);
          }
          if (this.field_Gb != null &&
            this.field_Gb.field_a != 0) {
            var7 = (java.awt.datatransfer.Transferable) (this.field_Gb.field_b);
            try {
              var8 = (String) (var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
              this.deleteSelection(32);
              this.insertText(var8, -41);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_Gb = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void layoutTextField(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != -630) {
          field_Db = (GameSoundEffect[]) null;
        }
        this.setBounds(true, param4, param1, param2, param3);
        this.field_Lb.setBounds(true, param4, 0, 0, param3);
        this.field_yb.setBounds(true, param4, 0, 0, param3);
        this.field_Ab = param3 - 4;
    }

    static {
        field_Rb = true;
        field_Ob = 0;
        field_Vb = "Location";
        field_Bb = null;
        field_Db = new GameSoundEffect[89];
        field_Kb = "If you do nothing the game will revert to normal view in <%0> second.";
        field_Cb = "Try changing the following settings:  ";
        field_Wb = true;
    }
}
