/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelList {
    private int rowSpacing;
    private int rowHeight;
    private int scrollOffset;
    private MenuScreen owner;
    private LevelPack pack;
    private int lastPointerY;
    int scrollStep;
    private int lastPointerX;
    private boolean keyboardSelection;
    private int labelBaselineOffset;
    private int buttonIndex;
    private int maxScrollOffset;
    static RgbSprite[] field_e;
    static ResourceArchive field_o;
    private int rowGap;
    private MenuButton viewport;
    private int contentHeight;
    int selectedLevelIndex;

    public static void a(boolean param0) {
        field_o = null;
        field_e = null;
        if (!param0) {
          CharSequence var2 = (CharSequence) null;
          LevelList.a((CharSequence) null, false);
        }
    }

    final void scrollBy(int deltaPixels, boolean clamp) {
        this.scrollOffset = this.scrollOffset + deltaPixels;
        if (!clamp) {
          return;
        }
        if (this.scrollOffset < 0) {
          this.scrollOffset = 0;
        }
        if (this.scrollOffset > this.maxScrollOffset) {
          this.scrollOffset = this.maxScrollOffset;
        }
    }

    final static void a(int param0) {
        if (null != ag.buttonLabels) {
          return;
        }
        ag.buttonLabels = new String[46];
        ag.buttonLabels[5] = gg.field_l;
        ag.buttonLabels[3] = tn.field_B;
        ag.buttonLabels[4] = pp.field_c;
        ag.buttonLabels[9] = LevelPackLoader.field_d;
        ag.buttonLabels[1] = da.field_H;
        ag.buttonLabels[11] = ej.field_H;
        ag.buttonLabels[7] = jj.field_b;
        ag.buttonLabels[0] = mo.field_O;
        ag.buttonLabels[6] = rd.field_b;
        ag.buttonLabels[8] = null;
        ag.buttonLabels[13] = di.field_a;
        ag.buttonLabels[27] = MatchResultScreen.field_r;
        ag.buttonLabels[2] = pj.field_e;
        sl.field_A[11] = tn.field_w;
        sl.field_A[5] = ef.field_c;
        sl.field_A[6] = ch.field_i;
        sl.field_A[9] = mk.field_a;
        sl.field_A[4] = tm.field_d;
        ag.buttonLabels[14] = pl.field_c[0];
        sl.field_A[3] = sj.field_e;
        ag.buttonLabels[39] = ki.field_o;
        ag.buttonLabels[23] = mh.field_mb;
        ag.buttonLabels[21] = a.field_r;
        ag.buttonLabels[17] = LevelCompleteScreen.field_E[0];
        ag.buttonLabels[38] = kk.field_a;
        if (param0 != -1) {
          return;
        }
        ag.buttonLabels[34] = f.field_b;
        ag.buttonLabels[28] = sn.field_r;
        ag.buttonLabels[19] = HighscorePackSelector.field_g;
        ag.buttonLabels[35] = LevelPackLoader.field_d;
        ag.buttonLabels[20] = pn.field_q;
        ag.buttonLabels[33] = t.field_c;
        ag.buttonLabels[32] = hk.field_L;
        ag.buttonLabels[25] = ck.field_i;
        ag.buttonLabels[24] = gi.field_r;
        ag.buttonLabels[42] = oc.field_u;
        ag.buttonLabels[37] = LevelPackLoader.field_i;
        sl.field_A[7] = ke.field_f;
        sl.field_A[8] = PauseMenuScreen.field_v;
        ag.buttonLabels[15] = pl.field_c[1];
        ag.buttonLabels[16] = pl.field_c[2];
        sl.field_A[12] = uo.field_b;
        sl.field_A[10] = eh.field_d;
        ag.buttonLabels[18] = LevelCompleteScreen.field_E[1];
        ag.buttonLabels[26] = PauseMenuScreen.field_u;
        ag.buttonLabels[22] = d.field_D;
        sl.field_A[13] = TimedSplashScreen.field_s;
        hm.field_b = new String[]{mi.field_a, qm.field_c, oa.field_Pb, s.field_a};
        sl.field_A[16] = dc.field_d;
        qn.packNames = new String[]{vh.field_T, oc.field_u};
        eh.field_e = new String[]{ag.field_C, bh.field_ub, qo.field_P, bq.field_f, jh.field_c};
        ar.field_a = new String[]{kk.field_a};
        sl.field_A[15] = MatchCompleteScreen.field_F;
        ih.field_j = new String[]{ff.field_g, pq.field_m, bm.field_b, RectangleBody.field_t};
        ml.field_e = new String[]{qi.field_N, bg.field_o, ue.field_a, eb.field_m, ch.field_j, vg.field_a, nk.field_f, tm.field_h};
        sl.field_A[17] = pq.field_q;
        sl.field_A[14] = vh.field_V;
        sl.field_A[18] = GameScreen.field_g;
    }

    final static short[] a(byte param0, short[] param1, BitPacketBuffer param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 >= -53) {
            stackIn_3_0 = (short[]) null;
            return stackIn_3_0;
          }
          var4_int = param2.readBits(param3, (byte) 61);
          if (var4_int == 0) {
            stackIn_6_0 = null;
            return (short[]) (stackIn_6_0);
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new short[var4_int];
          }
          var5 = param2.readBits(4, (byte) 122);
          var6 = (short)param2.readBits(16, (byte) 94);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)(param2.readBits(var5, (byte) 91) + var6);
            }
          }
          stackIn_19_0 = (short[]) (param1);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("uj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final void selectFirst(byte obfuscationGuard) {
        this.lastPointerX = pq.pointerX;
        this.scrollOffset = 0;
        this.lastPointerY = po.pointerY;
        this.keyboardSelection = true;
        this.selectedLevelIndex = 0;
        int var2 = 125 % ((-49 - obfuscationGuard) / 41);
    }

    final void draw(byte obfuscationGuard) {
        int rowBaselineY = 0;
        int levelIndex;
        int labelStyle;
        int clientBranchFlag;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        MovingBody.a((byte) 70, this.viewport.x + this.viewport.width, this.viewport.x, this.viewport.y, this.viewport.y + this.viewport.height);
        levelIndex = df.divideFloorPositive(this.rowSpacing, (byte) 15, this.scrollOffset - this.rowGap);
        if (obfuscationGuard != 28) {
          return;
        }
        for (rowBaselineY = this.viewport.y + (-this.scrollOffset + this.rowGap + this.labelBaselineOffset) + levelIndex * this.rowSpacing; this.viewport.height + (10 + this.viewport.y) > rowBaselineY; rowBaselineY = rowBaselineY + this.rowSpacing) {
          if (this.pack.levelCount > levelIndex) {
            if (0 <= levelIndex) {
              labelStyle = 3;
              if (hh.field_b[this.pack.packId] < levelIndex) {
                if (this.selectedLevelIndex == levelIndex) {
                  labelStyle = 0;
                }
              } else {
                labelStyle = (levelIndex != this.selectedLevelIndex) ? 2 : 1;
              }
              nn.field_g.drawCentered(this.pack.metadata[levelIndex].numberLabel, (this.viewport.x * 2 + this.viewport.width) / 2, rowBaselineY, labelStyle, -1);
            }
            levelIndex++;
            continue;
          }
          break;
        }
        sc.popRaster(-106);
        return;
    }

    final boolean handleNavigationKey(int obfuscationGuard, int keyCode, int characterCode) {
        int centerLevelIndex;
        centerLevelIndex = df.divideFloorPositive(this.rowHeight, (byte) 15, this.scrollOffset - this.rowGap) + this.viewport.height / (2 * this.rowSpacing);
        if (obfuscationGuard != -28088) {
          this.contentHeight = -121;
        }
        if (keyCode == 99) {
          this.keyboardSelection = true;
          this.selectedLevelIndex = this.selectedLevelIndex + 1;
          if (this.selectedLevelIndex > centerLevelIndex) {
            this.scrollBy(this.rowSpacing, true);
          }
        } else {
          if (keyCode == 98) {
            this.selectedLevelIndex = this.selectedLevelIndex - 1;
            this.keyboardSelection = true;
            if (this.selectedLevelIndex <= centerLevelIndex - 1) {
              this.scrollBy(-this.rowSpacing, true);
            }
          }
        }
        if (this.selectedLevelIndex >= 0 &&
          this.pack.levelCount > this.selectedLevelIndex) {
          return false;
        }
        this.selectedLevelIndex = -1;
        this.keyboardSelection = false;
        return true;
    }

    final void selectLast(byte obfuscationGuard) {
        this.keyboardSelection = true;
        this.selectedLevelIndex = -1 + this.pack.levelCount;
        this.scrollOffset = this.maxScrollOffset;
        if (obfuscationGuard >= -39) {
          this.scrollBy(47, false);
        }
        this.lastPointerY = po.pointerY;
        this.lastPointerX = pq.pointerX;
    }

    final void setScrollOffset(int offsetPixels) {
        this.scrollOffset = offsetPixels;
    }

    final void updatePointerSelection(boolean obfuscationGuard) {
        if (this.buttonIndex != this.owner.selection.selectedIndex) {
          this.selectedLevelIndex = -1;
          this.lastPointerX = -1;
          this.lastPointerY = -1;
          this.keyboardSelection = false;
        } else {
          this.scrollBy(GameplayAudioEvent.mouseWheelDelta * this.scrollStep, true);
          this.keyboardSelection = this.keyboardSelection & (GameplayAudioEvent.mouseWheelDelta == 0 ? true : false);
          if (!this.keyboardSelection ||
            pq.pointerX != this.lastPointerX ||
            this.lastPointerY != po.pointerY) {
            this.selectedLevelIndex = df.divideFloorPositive(this.rowSpacing, (byte) 15, po.pointerY - (this.viewport.y - (-this.rowGap + this.scrollOffset)));
            if (this.selectedLevelIndex < 0) {
              this.selectedLevelIndex = 0;
            }
            if (!(this.pack.levelCount >= this.selectedLevelIndex)) {
              this.selectedLevelIndex = this.pack.levelCount;
            }
          }
          this.lastPointerY = po.pointerY;
          this.lastPointerX = pq.pointerX;
        }
        if (obfuscationGuard) {
          this.viewport = (MenuButton) null;
        }
    }

    final static byte[] a(CharSequence param0, boolean param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1) {
            field_o = (ResourceArchive) null;
          }
          var2_int = param0.length();
          var3 = new byte[var2_int];
          for (var4 = 0; var2_int > var4; var4++) {
            {
              var5 = param0.charAt(var4);
              if ((0 >= var5 ||
                128 <= var5) && (var5 < 160 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("uj.G(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    LevelList(int rowHeight, int rowGap, int buttonIndex, MenuScreen owner, MenuButton viewport, LevelPack pack) {
        this.selectedLevelIndex = -1;
        try {
          this.rowSpacing = rowHeight + rowGap;
          this.owner = owner;
          this.viewport = viewport;
          this.buttonIndex = buttonIndex;
          this.pack = pack;
          this.labelBaselineOffset = nn.field_g.xHeight + (nn.field_g.capHeight - 5);
          this.rowGap = rowGap;
          this.rowHeight = rowHeight;
          this.contentHeight = this.rowGap + this.pack.levelCount * this.rowSpacing;
          this.maxScrollOffset = -this.viewport.height + this.contentHeight + 5;
          if (0 > this.maxScrollOffset) {
            this.maxScrollOffset = 0;
          }
          this.scrollStep = 3 * this.rowHeight / 2;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "uj.<init>(" + rowHeight + ',' + rowGap + ',' + buttonIndex + ',' + (owner != null ? "{...}" : "null") + ',' + (viewport != null ? "{...}" : "null") + ',' + (pack != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
