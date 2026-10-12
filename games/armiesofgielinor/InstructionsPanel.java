/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstructionsPanel {
    private IntPair field_F;
    private boolean footerHighlighted;
    private String footerCaption;
    private int pageCount;
    private int pageIndex;
    static int field_D;
    private IntPair navigationEnd;
    private int field_g;
    private RgbSprite[] cachedPageSprites;
    private TrianglePulse highlightPulse;
    private int field_cb;
    private int field_bb;
    int[] itemIds;
    private int[] field_J;
    private AnimationPlayer illustrationAnimation;
    private boolean previousEnabled;
    private TickCounter secondaryIllustrationCounter;
    private boolean nextHighlighted;
    private IntPair footerEnd;
    private UnitModelPreview firstPreviewModel;
    private int field_t;
    private IntPair field_x;
    private String field_a;
    private boolean previousHighlighted;
    static int field_B;
    static int field_r;
    private UnitModelPreview field_fb;
    private UnitModelPreview field_S;
    private IntPair field_K;
    private Unit secondPreviewUnit;
    private int field_m;
    static String field_gb;
    private String previousCaption;
    static String field_y;
    private TickCounter illustrationCounter;
    static String field_c;
    private String nextCaption;
    private int field_i;
    private int field_Y;
    private int field_T;
    private int cachedPageIndex;
    private int field_e;
    private IntPair field_V;
    private UnitModelPreview auxiliaryPreviewModel;
    private Unit auxiliaryPreviewUnit;
    private IntPair field_C;
    private UnitModelPreview field_s;
    private Unit firstPreviewUnit;
    private int field_l;
    private boolean nextEnabled;
    private IntPair navigationStart;
    private IntPair footerStart;
    private int field_db;
    private UnitModelPreview secondPreviewModel;
    private TickCounter progressCounter;
    private int field_A;
    private int field_z;
    private int field_E;

    private final void b(int param0, byte param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        boolean discarded$0 = false;
        int var4 = 0;
        int var4Lifetime1;
        if (null == this.auxiliaryPreviewUnit) {
          var4 = 0;
          var5 = 1;
          var6 = 0;
          this.auxiliaryPreviewUnit = this.createPreviewUnit(var4, -1, var5, var6);
        }
        if (null == this.auxiliaryPreviewUnit) {
          return;
        }
        var4Lifetime1 = 76;
        if (param1 < 90) {
          discarded$0 = this.c(60, 20);
        }
        hs.a(false, true, this.auxiliaryPreviewUnit, 0, db.a(true, param2), 0, var4Lifetime1, MatchConditionEntry.a(param0, (byte) 94));
    }

    private final void a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null == this.secondaryIllustrationCounter) {
          return;
        }
        var5 = -96 / ((param0 - 2) / 57);
        var4 = this.secondaryIllustrationCounter.elapsedTicks;
        if (var4 >= 0 &&
          var4 < this.secondaryIllustrationCounter.limit) {
          var6 = 0;
          while (true) {
            if (3 <= var6) {
              return;
            }
            var7 = var6;
            var8 = var6 + 1;
            if (null != gt.field_c &&
              0 <= var7 &&
              gt.field_c.length > var7) {
              var9 = -(gt.field_c[var7].canvasWidth >> 1) + 50 >> 1;
              param1 = param1 + var9;
              if (null != UnitModelPreview.field_d &&
                1 + var7 >= 0 &&
                1 + var7 < UnitModelPreview.field_d.length) {
                UnitModelPreview.field_d[1 + var7].h(db.a(true, 6 + param1), MatchConditionEntry.a(param2 + 9, (byte) 94));
                gt.field_c[var7 + 1].h(db.a(true, param1), MatchConditionEntry.a(param2, (byte) 94));
                if (var8 > 0 &&
                  null != fe.field_o &&
                  0 <= 1 + var7 &&
                  var7 + 1 < fe.field_o.length) {
                  fe.a(db.a(true, 18 + param1), MatchConditionEntry.a(param2 + 21, (byte) 94), var7 + 1, var8, var4);
                  param1 = 50 + param1 - var9;
                  var6++;
                  continue;
                }
                return;
              }
              return;
            }
            break;
          }
          return;
        }
        return;
    }

    final static String c(int param0) {
        int var5 = 0;
        String var6 = null;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        GameplayController var1 = rd.field_j;
        if (var1 == null) {
          return "No game in progress.";
        }
        String[] var2 = var1.battlefield.e(26524);
        if (param0 != -29288) {
          field_B = -83;
        }
        String var3 = "";
        String[] var4 = var2;
        for (var5 = 0; var4.length > var5; var5++) {
          var6 = var4[var5];
          var3 = var3 + var6 + "\n";
        }
        return var3;
    }

    private final void c(byte param0) {
        this.field_S = null;
        this.field_S = new UnitModelPreview(18);
        if (param0 > -101) {
          this.auxiliaryPreviewUnit = (Unit) null;
        }
    }

    private final void d(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var8Lifetime1;
        int var8Lifetime2;
        if (param2 >= 0 &&
          va.field_G.length > param2) {
          var6 = va.field_G[param2];
          var7 = va.field_G[0];
          ds.a(param1, param0, var7, 27066, true, param3, true, var6);
          ds.a(param1, param0, var7, 27066, true, param3, false, var6);
          if (param2 == 3) {
            vu.a(true, true, param1, param0, param3, 1, param4 ^ 0);
          }
          if (param2 == 2) {
            this.a(param3, (byte) 85, 1, true, param1, param0);
          }
          if (param4 != 1) {
            return;
          }
          if (param2 == 8) {
            var8 = 0;
            this.a(param1, var8, param3, (byte) 114, param0);
          }
          if (param2 == 14) {
            var8Lifetime1 = 11;
            this.a(param1, var8Lifetime1, param3, (byte) 114, param0 - 5);
          }
          if (12 == param2) {
            var8Lifetime2 = 24;
            this.a(param1, var8Lifetime2, param3, (byte) 114, param0);
          }
          return;
        }
    }

    private final int a(int param0, byte param1, int param2) {
        int var4 = fk.matchupDamagePercent[param2][param0];
        int var5 = fk.matchupDamagePercent[param0][param2];
        if (var5 < var4) {
          if (-var5 + var4 <= 45) {
            return 1;
          }
          return 0;
        }
        if (var4 < var5) {
          if (var5 - var4 > 45) {
            return 4;
          }
          return 3;
        }
        if (param1 != -6) {
          this.b(-122);
        }
        return 2;
    }

    final int getItemHeight(int itemIndex, boolean obfuscationGuard) {
        int var3;
        if (null != this.itemIds &&
          this.itemIds.length != 0) {
          if (itemIndex >= 0 &&
            this.itemIds.length > itemIndex) {
            if (obfuscationGuard) {
              return 106;
            }
            if (null != this.footerStart &&
              this.navigationStart != null &&
              this.footerEnd != null &&
              null != this.navigationEnd) {
              var3 = this.itemIds[itemIndex];
              if (22 != var3 &&
                var3 != 23) {
                if (var3 == 8) {
                  return this.footerEnd.second - this.footerStart.second;
                }
                return 1;
              }
              return this.navigationEnd.second - this.navigationStart.second;
            }
            return 1;
          }
          return 1;
        }
        return 1;
    }

    private final void configureNavigation(byte obfuscationGuard, int selectedItem, boolean nextEnabled, boolean previousEnabled) {
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.p(31559);
        if (previousEnabled) {
          this.previousEnabled = true;
        }
        if (obfuscationGuard >= -87) {
          this.drawPageSections(-121);
        }
        if (nextEnabled) {
          this.nextEnabled = true;
        }
        if (null != this.itemIds &&
          this.itemIds.length != 0) {
          if (selectedItem >= 0 &&
            this.itemIds.length > selectedItem) {
            var5 = this.itemIds[selectedItem];
            if (var5 != 22) {
              if (23 == var5) {
                this.nextHighlighted = true;
              } else {
                if (var5 == 8) {
                  this.footerHighlighted = true;
                }
              }
            } else {
              this.previousHighlighted = true;
            }
            return;
          }
          return;
        }
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.cachedPageIndex = -1;
        if (null == this.cachedPageSprites) {
          return;
        }
        for (var2 = param0; this.cachedPageSprites.length > var2; var2++) {
          if (this.cachedPageSprites[var2] != null) {
            this.cachedPageSprites[var2].pixels = null;
            this.cachedPageSprites[var2] = null;
          }
        }
        this.cachedPageSprites = null;
    }

    private final void drawPageSections(int obfuscationGuard) {
        int sectionIndex = 0;
        String[] titles;
        String[][] rowHeadings;
        String[][][] paragraphs;
        int[][] illustrationModes;
        int[][] illustrationArguments;
        int topY;
        int sectionHeight;
        int var10;
        String[] sectionTitles;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.pageIndex >= 0 &&
          this.pageIndex < this.pageCount) {
          if (null == PortalLossCondition.instructionSectionTitles[this.pageIndex]) {
            return;
          }
          sectionTitles = PortalLossCondition.instructionSectionTitles[this.pageIndex];
          titles = sectionTitles;
          if (null == PortalLossCondition.instructionRowHeadings[this.pageIndex]) {
            return;
          }
          rowHeadings = PortalLossCondition.instructionRowHeadings[this.pageIndex];
          if (null == PortalLossCondition.instructionParagraphs[this.pageIndex]) {
            return;
          }
          paragraphs = PortalLossCondition.instructionParagraphs[this.pageIndex];
          if (null == TeamRoster.instructionIllustrationModes[this.pageIndex]) {
            return;
          }
          illustrationModes = TeamRoster.instructionIllustrationModes[this.pageIndex];
          if (da.instructionIllustrationArguments[this.pageIndex] == null) {
            return;
          }
          if (obfuscationGuard >= -73) {
            this.l(58);
          }
          illustrationArguments = da.instructionIllustrationArguments[this.pageIndex];
          topY = this.field_T - this.a(true);
          for (sectionIndex = 0; sectionIndex < sectionTitles.length; sectionIndex++) {
            if (titles != null &&
              rowHeadings != null &&
              paragraphs != null &&
              illustrationModes != null &&
              illustrationArguments != null && (this.pageIndex != 9 ||
              sectionIndex != 0)) {
              sectionHeight = this.drawInstructionSection(sectionTitles[sectionIndex], paragraphs[sectionIndex], sectionIndex, illustrationModes[sectionIndex], topY, -1185705759, rowHeadings[sectionIndex], illustrationArguments[sectionIndex]);
              topY = topY + sectionHeight;
            }
          }
          return;
        }
    }

    private final int drawInstructionSection(String title, String[][] paragraphs, int sectionIndex, int[] illustrationModes, int topY, int obfuscationGuard, String[] rowHeadings, int[] illustrationArguments) {
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var11Lifetime1;
        try {
          var9_int = this.field_F.first;
          var10 = topY;
          var11 = (this.a(true) >> 1) + this.h(-2881);
          var10 = var11 + var10;
          if (obfuscationGuard != -1185705759) {
            this.navigationStart = (IntPair) null;
          }
          var12 = title;
          if (var12 != null) {
            fe.c(var12, db.a(true, var9_int), MatchConditionEntry.a(var10, (byte) 94), nd.field_b, true);
          }
          var13 = topY;
          var11Lifetime1 = this.field_Y - this.field_T + (this.a(true) >> 1);
          if (var12 != null) {
            var13 = topY + var11Lifetime1;
          }
          var14 = this.drawInstructionRows(rowHeadings, paragraphs, var13 + 10, illustrationModes, illustrationArguments, (byte) -120, sectionIndex);
          if (var12 != null) {
            stackIn_11_0 = 10 + var11Lifetime1 + var14;
            return stackIn_11_0;
          }
          stackIn_9_0 = var14;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_14_0 = var9;
          stackIn_14_1 = new StringBuilder().append("rk.T(");
          if (title == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (paragraphs == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(sectionIndex).append(',');
          if (illustrationModes == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(topY).append(',').append(obfuscationGuard).append(',');
          if (rowHeadings == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (illustrationArguments == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param4 == -1) {
          return;
        }
        if (param4 >= 0 &&
          fn.field_Q.length > param4) {
          var7 = this.illustrationCounter.elapsedTicks;
          if (param3 != -25713) {
            return;
          }
          if (var7 < 0) {
            var7 = 0;
          }
          var8 = fn.field_Q[param4];
          if (var8 < 0) {
            return;
          }
          if (null != l.field_b &&
            0 <= param5 &&
            l.field_b.length > param5 &&
            null != l.field_b[param5] &&
            l.field_b.length != 0) {
            if (2 == var8) {
              if (17 < l.field_b.length &&
                l.field_b.length > 16) {
                l.field_b[17].draw(db.a(true, param0), MatchConditionEntry.a(-40 + param1, (byte) 94));
                var9 = 1;
                if (null == ds.field_a ||
                  !(param2 < ds.field_a.length)) {
                  var9 = 0;
                }
                if (null == le.field_c ||
                  !(param2 < le.field_c.length)) {
                  var9 = 0;
                }
                if (var9 != 0) {
                  mv.a(db.a(true, 20 + param0), (byte) -70, var7, param2, MatchConditionEntry.a(param1, (byte) 94));
                }
                if (-1 < param2) {
                  ResourceRequest.a(ActionRequest.unitModels[76][param2], false, MatchConditionEntry.a(-40 + param1, (byte) 94), this.illustrationAnimation, 128, 150, db.a(true, param0), (MeshData) null, -10374);
                }
                l.field_b[16].draw(db.a(true, param0), MatchConditionEntry.a(param1 - 40, (byte) 94));
                return;
              }
              return;
            }
            if (var8 == 1) {
              if (l.field_b.length <= 8) {
                return;
              }
              l.field_b[8].draw(db.a(true, param0), MatchConditionEntry.a(-50 + param1, (byte) 94));
              if (param2 > -1 &&
                param2 < op.field_c.length) {
                wb.a(7816226, db.a(true, param0 + 21), param2, var7, MatchConditionEntry.a(-30 + param1, (byte) 94));
              }
            } else {
              if (0 != var8) {
                if (var8 == 8) {
                  if (11 >= l.field_b.length) {
                    return;
                  }
                  l.field_b[11].draw(db.a(true, param0), MatchConditionEntry.a(-10 + (param1 - 40), (byte) 94));
                  if (param2 > -1 &&
                    op.field_c.length > param2) {
                    wb.a(7816226, db.a(true, param0 + 20), param2, var7, MatchConditionEntry.a(param1 - 20, (byte) 94));
                    UnitCycler.a(db.a(true, param0 + 15), param2, 11, 127, MatchConditionEntry.a(21 + param1, (byte) 94));
                  }
                }
              } else {
                if (l.field_b.length <= 0) {
                  return;
                }
                l.field_b[0].draw(db.a(true, param0), MatchConditionEntry.a(-40 + param1, (byte) 94));
                if (param2 > -1 &&
                  op.field_c.length > param2) {
                  wb.a(param3 + 7841939, db.a(true, 20 + param0), param2, var7, MatchConditionEntry.a(10 + param1, (byte) 94));
                }
              }
            }
            return;
          }
          return;
        }
    }

    private final void p(int param0) {
        this.previousEnabled = false;
        if (param0 != 31559) {
          field_r = -110;
        }
        this.nextHighlighted = false;
        this.previousHighlighted = false;
        this.nextEnabled = false;
        this.footerHighlighted = false;
    }

    private final void l(int param0) {
        if (param0 > -48) {
          this.c((byte) -46);
        }
        int var2 = this.footerStart.first;
        int var3 = this.footerStart.second;
        int var4 = this.footerEnd.first - var2;
        int var5 = -var3 + this.footerEnd.second;
        SoftwareRaster.f(db.a(true, var2), MatchConditionEntry.a(var3, (byte) 94), var4, var5, this.field_cb);
        fe.b(db.a(true, var2), MatchConditionEntry.a(var3, (byte) 94), var4, var5, io.field_m, nd.field_b, this.field_A, this.field_e);
        int var6 = this.footerStart.second;
        int var7 = this.footerEnd.second;
        var3 = var6 + var7 >> 1;
        int var8 = this.a(21695);
        var3 = var3 + var8;
        String var9 = this.footerCaption;
        if (var9 == null ||
          var9.length() == 0) {
          return;
        }
        int[] var12 = this.footerHighlighted ? TutorialController.field_e : nd.field_b;
        int[] var11 = var12;
        int[] var10 = var11;
        fe.c(var9, db.a(true, this.field_F.first), MatchConditionEntry.a(var3, (byte) 94), var12, true);
    }

    final void f(byte param0) {
        boolean discarded$0 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_C = new IntPair(25, 33);
        this.field_V = new IntPair(614, 446);
        this.field_A = 0;
        this.field_e = 128;
        if (wb.field_b != null &&
          7 <= wb.field_b.length) {
          this.field_a = wb.field_b[7];
        } else {
          this.field_a = null;
        }
        this.field_F = new IntPair(so.field_b.field_a >> 1, so.field_b.field_g >> 1);
        this.field_x = new IntPair(42, 63);
        this.field_K = new IntPair(597, 417);
        this.initializePanel(99);
        this.field_cb = 3223077;
        if (DisplacedUnitMarker.field_t != null) {
          if (DisplacedUnitMarker.field_t.length <= 8) {
            this.footerCaption = null;
          } else {
            this.footerCaption = DisplacedUnitMarker.field_t[8];
          }
          if (DisplacedUnitMarker.field_t.length > 22) {
            this.previousCaption = DisplacedUnitMarker.field_t[22];
          } else {
            this.previousCaption = null;
          }
          if (DisplacedUnitMarker.field_t.length <= 23) {
            this.nextCaption = null;
          } else {
            this.nextCaption = DisplacedUnitMarker.field_t[23];
          }
        }
        this.field_bb = 58;
        this.field_t = 578;
        if (param0 <= 6) {
          discarded$0 = this.c(66, 56);
        }
        var2 = this.field_x.second;
        var3 = this.b((byte) 70);
        var4 = this.a(true);
        this.field_m = 583;
        this.field_T = var4 + var2 + (var3 >> 1);
        this.field_i = 56;
        this.field_Y = var2 + var3;
        this.field_E = this.i(112);
        this.field_g = this.field_E;
        this.field_l = 14540255;
        this.field_db = 14;
        this.field_z = 14398754;
        this.highlightPulse = new TrianglePulse(0, 256, 100);
        this.illustrationCounter = new TickCounter(256);
        this.secondaryIllustrationCounter = new TickCounter(100);
        this.field_J = new int[4];
        this.f(-11195);
        this.i((byte) 28);
        this.c((byte) -109);
        this.j((byte) -7);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, Unit param5, Unit param6, int param7) {
        int var9_int = 0;
        int var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        SpellConfirmationDialog.field_j.b();
        SoftwareRaster.b();
        fe.b(0, 0, 134, 61, io.field_m, nd.field_b, 0, 0);
        qt.field_e.drawOpaque(2, 2);
        SoftwareRaster.b(5, 5, 124, 18, 0, 192);
        if (param4 < 70) {
          return;
        }
        try {
          SoftwareRaster.b(5, 25, 30, 30, 0, 192);
          en.field_E.b(dn.unitDisplayNames[param5.unitType], 10, 17, op.field_c[0][param5.ownerPlayer], -1);
          en.field_E.a(param5.bonusStrength + param5.strength + "/" + param5.maximumStrength, 126, 18, op.field_c[0][param5.ownerPlayer], -1);
          if (param5.ownerPlayer == param2) {
            SoftwareRaster.b(99, 25, 30, 30, 0, 128);
            SoftwareRaster.b(52, 25, 30, 30, 0, 128);
            var9_int = param5.l(-27014);
            cp.field_e[eb.a((byte) -126, ~var9_int & 3)].draw(56, 25);
          } else {
            if (param6 == null) {
              SoftwareRaster.b(99, 25, 30, 30, 0, 128);
            } else {
              SoftwareRaster.b(37, 25, 92, 30, 0, 128);
              ro.field_rb[param6.getUnitCategory(0)].draw(43, 32);
              sg.field_b[this.a(param6.getUnitCategory(0), (byte) -6, param5.getUnitCategory(0))].draw(75, 32);
            }
          }
          ro.field_rb[param5.getUnitCategory(0)].draw(106, 32);
          en.field_E.c(100 - param3 + "%", 20, 45, 16777215, -1);
          EventPresenter.field_t.b(68, 60, nd.field_b[-1 + nd.field_b.length]);
          so.field_b.a(5605);
          SpellConfirmationDialog.field_j.e(db.a(true, param1), MatchConditionEntry.a(param7, (byte) 94), -param0 + 32 << 3);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "rk.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    private final IntPair b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 0 &&
          param2 != 1) {
          this.c(50, param1, param4);
          if (param0 == -2) {
            return null;
          }
          this.b(-21);
          return null;
        }
        return this.a(param2, param3, param0 ^ 88);
    }

    private final IntPair a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -3) {
          this.field_m = 124;
        }
        if (null == SpellConfirmationDialog.field_j) {
          return null;
        }
        if (param1 == 0) {
          return new IntPair(SpellConfirmationDialog.field_j.canvasWidth, SpellConfirmationDialog.field_j.canvasHeight);
        }
        if (param1 == 1) {
          return new IntPair(0, 0);
        }
        if (param1 == 2) {
          this.a(param0, param3, param2, -19556);
        }
        return null;
    }

    private final void b(int param0) {
        if (null != this.field_s) {
          this.field_s.selectAnimationAndAdvance(0, (byte) -50);
        }
        if (this.progressCounter == null) {
          return;
        }
        if (this.progressCounter.advanceAndCheck(param0 - 39)) {
          this.progressCounter.reset(17);
        }
        if (param0 != 38) {
          this.field_cb = 104;
        }
        int var2 = 0;
        if (this.progressCounter.elapsedTicks >= 100 &&
          this.progressCounter.elapsedTicks <= 250) {
          var2 = 5;
        }
        if (null != this.field_fb) {
          this.field_fb.selectAnimationAndAdvance(var2, (byte) -50);
        }
    }

    final int getRowSpacing(int obfuscationGuard) {
        int var2;
        int var3;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        if (this.footerStart != null &&
          this.footerEnd != null &&
          this.navigationStart != null &&
          null != this.navigationEnd) {
          if (this.navigationStart.second < this.footerStart.second) {
            stackIn_9_0 = this.navigationStart.second;
          } else {
            stackIn_9_0 = this.footerStart.second;
          }
          var2 = stackIn_9_0;
          if (this.footerStart.second >= this.navigationStart.second) {
            stackIn_12_0 = this.footerStart.second;
          } else {
            stackIn_12_0 = this.navigationStart.second;
          }
          var3 = stackIn_12_0;
          if (obfuscationGuard >= ~var2 &&
            0 <= var3 &&
            var3 > var2) {
            return -var2 + var3;
          }
          return -1;
        }
        return -1;
    }

    private final IntPair a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int discarded$1 = 0;
        int[] var9;
        if (param5 != 0 &&
          param5 != 1) {
          this.c(param0, param2, -31550, param1, param6);
          if (param4) {
            return null;
          }
          var9 = (int[]) null;
          discarded$1 = this.drawInstructionRows((String[]) null, (String[][]) null, -14, (int[]) null, (int[]) null, (byte) -11, 90);
          return null;
        }
        return this.a(param5, param3, 110);
    }

    private final void g(byte param0) {
        int[] stackIn_5_0 = null;
        int[] stackIn_12_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        int[] var10;
        int[] var11;
        int[] var12;
        String var13;
        int[] var14;
        String var15;
        int[] var16;
        int[] var17;
        int[] var18;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int[] var10Lifetime1;
        var2 = this.navigationStart.first;
        var3 = this.navigationStart.second;
        var4 = this.navigationEnd.first - var2;
        var5 = this.navigationEnd.second - var3;
        SoftwareRaster.b(db.a(true, var2), MatchConditionEntry.a(var3, (byte) 94), var4, var5, this.field_A, this.field_e);
        var6 = this.navigationStart.second;
        if (param0 != 10) {
          this.j(76);
        }
        var7 = this.navigationEnd.second;
        var3Lifetime1 = var6 + var7 >> 1;
        var8 = this.a(21695);
        var3Lifetime1 = var3Lifetime1 + var8;
        var2Lifetime1 = this.field_bb;
        var13 = this.previousCaption;
        if (this.previousHighlighted) {
          stackIn_5_0 = TutorialController.field_e;
        } else {
          stackIn_5_0 = nd.field_b;
        }
        var17 = stackIn_5_0;
        var14 = var17;
        var11 = var14;
        var10 = var11;
        if (this.previousEnabled &&
          var13 != null &&
          var13.length() > 0) {
          fe.a(var13, db.a(true, var2Lifetime1), MatchConditionEntry.a(var3Lifetime1, (byte) 94), var17, true);
        }
        if (this.nextHighlighted) {
          stackIn_12_0 = TutorialController.field_e;
        } else {
          stackIn_12_0 = nd.field_b;
        }
        var18 = stackIn_12_0;
        var16 = var18;
        var12 = var16;
        var10Lifetime1 = var12;
        var2Lifetime2 = this.field_t;
        var15 = this.nextCaption;
        if (this.nextEnabled &&
          var15 != null &&
          var15.length() > 0) {
          fe.b(var15, db.a(true, var2Lifetime2), MatchConditionEntry.a(var3Lifetime1, (byte) 94), var18, true);
        }
        var2Lifetime3 = this.field_F.first;
        var9 = qk.a(this.pageCount, -2823, this.pageIndex);
        fe.c(var9, db.a(true, var2Lifetime3), MatchConditionEntry.a(var3Lifetime1, (byte) 94), TutorialController.field_e, true);
    }

    private final int d(int param0) {
        if (param0 != 17) {
          this.getPanelStart((byte) -89);
        }
        return rs.field_n.field_L + rs.field_n.field_H;
    }

    private final void c(int param0, int param1, int param2) {
        if (null != this.auxiliaryPreviewModel) {
          this.auxiliaryPreviewModel.setScreenPosition(db.a(true, 40 + param1), MatchConditionEntry.a(param2 + 50, (byte) 94), (byte) -117);
          this.auxiliaryPreviewModel.drawAtStoredPosition((byte) -72, false);
          nb.a(db.a(true, param1), MatchConditionEntry.a(param2 + 38, (byte) 94), (byte) -97, (Unit) null);
        }
        if (param0 != 50) {
          return;
        }
    }

    final IntPair getPanelStart(byte obfuscationGuard) {
        if (this.footerStart == null) {
          return null;
        }
        if (null == this.footerEnd) {
          return null;
        }
        if (null == this.navigationStart) {
          return null;
        }
        if (null == this.navigationEnd) {
          return null;
        }
        int var2 = this.navigationStart.first >= this.footerStart.first ? this.footerStart.first : this.navigationStart.first;
        int var3 = -47 % ((obfuscationGuard - 32) / 46);
        int var4 = this.navigationStart.second >= this.footerStart.second ? this.footerStart.second : this.navigationStart.second;
        if (var2 < 0) {
          return null;
        }
        if (var4 < 0) {
          return null;
        }
        return new IntPair(var2, var4);
    }

    private final IntPair b(int param0, byte param1) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        int var7;
        int var8;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 != 16) {
          this.field_F = (IntPair) null;
        }
        if (null == gt.field_c) {
          return null;
        }
        if (param0 != 0) {
          if (param0 == 1) {
            return new IntPair(0, 0);
          }
          return null;
        }
        var3 = 150;
        var4 = -1;
        for (var5 = 0; gt.field_c.length > var5; var5++) {
          var6 = gt.field_c[var5].canvasWidth;
          var6 = var6 >> 1;
          var7 = gt.field_c[var5].canvasHeight;
          if (0 > var3 &&
            var6 >= 0) {
            var3 = var6;
          }
          var7 = var7 >> 1;
          if (var6 > var3) {
            var3 = var6;
          }
          if (0 > var4 &&
            var7 >= 0) {
            var4 = var7;
          }
          if (var7 > var4) {
            var4 = var7;
          }
        }
        if (0 <= var3 &&
          var4 >= 0) {
          return new IntPair(var3, var4);
        }
        return new IntPair(0, 0);
    }

    private final Unit createPreviewUnit(int unitType, int obfuscationGuard, int unusedValue, int playerId) {
        int tileX = 0;
        int tileY = 0;
        if (~playerId > obfuscationGuard) {
          return null;
        }
        if (playerId >= op.field_c.length) {
          return null;
        }
        if (unitType < 0) {
          return null;
        }
        if (unitType >= bw.unitDefinitions.length) {
          return null;
        }
        int maximumStrength = bw.unitDefinitions[unitType][4];
        int strength = -1 + maximumStrength;
        if (strength <= 0) {
          strength = 1;
        }
        int packedStatusFlags = 1;
        int bonusStrength = 0;
        Object battlefield = null;
        int detached = 1;
        Unit previewUnit = new Unit(tileX, tileY, unitType, playerId, maximumStrength, strength, packedStatusFlags, 0, bonusStrength, (Battlefield) (battlefield), 0, 0, -1, detached != 0, 0);
        return previewUnit;
    }

    final int getItemRightX(boolean obfuscationGuard, int itemIndex) {
        int var3;
        if (null != this.itemIds &&
          this.itemIds.length != 0) {
          if (0 <= itemIndex &&
            itemIndex < this.itemIds.length) {
            if (obfuscationGuard) {
              this.getItemRightX(false, -94);
            }
            if (this.footerEnd != null &&
              this.navigationEnd != null) {
              var3 = this.itemIds[itemIndex];
              if (22 == var3) {
                return -1 + (so.field_b.field_a >> 1);
              }
              if (var3 == 23) {
                return db.a(!obfuscationGuard, this.navigationEnd.first);
              }
              if (var3 != 8) {
                return 1;
              }
              return db.a(true, this.footerEnd.first);
            }
            return 1;
          }
          return 1;
        }
        return 1;
    }

    private final void j(byte param0) {
        this.auxiliaryPreviewModel = null;
        this.auxiliaryPreviewModel = new UnitModelPreview(25);
        if (param0 != -7) {
          return;
        }
    }

    private final int a(int param0) {
        if (param0 != 21695) {
          return 113;
        }
        return (nr.field_e.field_y >> 2) - nr.field_e.field_L + nr.field_e.field_v + (-(nr.field_e.field_H >> 1) + 3);
    }

    private final void a(RgbSprite param0, int param1, int param2, RgbSprite param3, int param4, int param5) {
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        RgbSprite var19 = null;
        RgbSprite var20 = null;
        int var21 = 0;
        int var22 = 0;
        RgbSprite var23 = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var8Lifetime1;
        var27 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 >= 0 &&
            param1 < BufferedFile.field_k.length &&
            UnitModelPreview.field_d.length > param1 + 1 &&
            gt.field_c.length > param1) {
            if (param3 != null &&
              param0 != null &&
              this.field_J != null) {
              SoftwareRaster.b(this.field_J);
              param3.b();
              SoftwareRaster.b();
              var7_int = this.highlightPulse.isRisingHalf(-122) ? 1 : 0;
              var8 = this.highlightPulse.getValue(-1953891327);
              var9 = this.highlightPulse.maximum;
              var8Lifetime1 = var9;
              var10 = var9 >> 1;
              var11 = var8Lifetime1;
              var12 = var8Lifetime1;
              var13 = (int)((double)var10 - Math.cos((double)var11 * 3.141592653589793 / (double)var9) * (double)var10);
              var14 = (int)(-((double)var10 * Math.cos(3.141592653589793 * (double)var12 / (double)var9)) + (double)var10);
              stackIn_15_0 = (var7_int != 0) ? -1 : param1;
              var15 = stackIn_15_0;
              stackIn_18_0 = (var7_int != 0) ? param1 : -1;
              var16 = stackIn_18_0;
              var17 = -19;
              var18 = -22;
              var19 = BufferedFile.field_k[1 + param1];
              if (var15 != param1) {
                if (param1 == var16) {
                  var19.f(0, 0, -var14 + var9);
                }
              } else {
                var19.f(0, 0, var9 - var13);
              }
              var19.f(0, 0, var9);
              var20 = UnitModelPreview.field_d[param1 + 1];
              var20.g(-var17, -var18);
              if (var15 != param1) {
                if (param1 == var16) {
                  var20.f(-var17, -var18, var9 - var14);
                }
              } else {
                var20.f(-var17, -var18, -var13 + var9);
              }
              var21 = -12;
              var22 = -17;
              var24 = 105 / ((param4 + 25) / 48);
              var23 = gt.field_c[1 + param1];
              var23.g(var21 - var17, var22 - var18);
              so.field_b.a(5605);
              SoftwareRaster.a(this.field_J);
              SoftwareRaster.b(this.field_J);
              param0.b();
              SoftwareRaster.b();
              var25 = param0.canvasWidth;
              var26 = param0.canvasHeight;
              param3.d(param5, param2, var25, var26);
              so.field_b.a(5605);
              SoftwareRaster.a(this.field_J);
              fe.a(param0);
              param0.a();
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_30_0 = var7;
          stackIn_30_1 = new StringBuilder().append("rk.GC(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int b(byte param0) {
        if (param0 <= 14) {
          this.footerEnd = (IntPair) null;
        }
        return nr.field_e.field_H + nr.field_e.field_L >> 1;
    }

    private final IntPair a(int param0, int param1, int param2) {
        int var4;
        if (param0 == 0) {
          return new IntPair(80, param1 * 80 >> 2);
        }
        if (param0 == 1) {
          return new IntPair(0, -(80 * param1) + 320 >> 2);
        }
        var4 = -19 / ((param2 + 8) / 40);
        return null;
    }

    private final RgbSprite b(int param0, int param1) {
        if (null == this.cachedPageSprites) {
          return null;
        }
        if (param1 < 0) {
          return null;
        }
        if (param1 >= this.cachedPageSprites.length) {
          return null;
        }
        if (param0 != 20255) {
          return (RgbSprite) null;
        }
        return this.cachedPageSprites[param1];
    }

    private final IntPair a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param1 != 0 &&
          param1 != 1) {
          this.d(param3, param0, param4, param2, 1);
          if (param5 == 2) {
            return null;
          }
          this.getItemTopY(37, -69);
          return null;
        }
        return this.e(3, param1);
    }

    private final IntPair c(int param0, int param1, int param2, int param3) {
        if (param3 == 0 ||
          param3 == 1) {
          return this.b(param3, (byte) 16);
        }
        if (2 == param3) {
          this.a((byte) 116, param0, param1);
        }
        if (param2 < -4) {
          return null;
        }
        return (IntPair) null;
    }

    final IntPair getPanelEnd(byte obfuscationGuard) {
        if (this.footerStart == null) {
          return null;
        }
        if (null == this.footerEnd) {
          return null;
        }
        if (this.navigationStart == null) {
          return null;
        }
        if (null == this.navigationEnd) {
          return null;
        }
        if (obfuscationGuard != -108) {
          this.nextEnabled = true;
        }
        int var2 = this.navigationEnd.first > this.footerEnd.first ? this.navigationEnd.first : this.footerEnd.first;
        int var3 = this.footerEnd.second < this.navigationEnd.second ? this.navigationEnd.second : this.footerEnd.second;
        if (var2 < 0) {
          return null;
        }
        if (var3 < 0) {
          return null;
        }
        return new IntPair(var2, var3);
    }

    private final IntPair a(byte param0, int param1, int param2, RgbSprite param3, int param4, IndexedSprite param5) {
        Object stackIn_4_0 = null;
        IntPair stackIn_8_0 = null;
        IntPair stackIn_15_0 = null;
        IntPair stackIn_19_0 = null;
        int stackIn_26_0 = 0;
        IntPair stackIn_32_0 = null;
        Object stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7_int = -82 % ((param0 + 58) / 54);
          if (param3 == null &&
            param5 == null) {
            stackIn_4_0 = null;
            return (IntPair) (stackIn_4_0);
          }
          if (param3 != null &&
            param2 == 0) {
            stackIn_8_0 = new IntPair(param3.canvasWidth, param3.pixelHeight);
            return stackIn_8_0;
          }
          if (param5 != null &&
            param2 == 0) {
            stackIn_32_0 = new IntPair(param5.canvasWidth, param5.pixelHeight);
            return stackIn_32_0;
          }
          if (param3 != null &&
            param2 == 1) {
            stackIn_15_0 = new IntPair(0, 0);
            return stackIn_15_0;
          }
          if (param5 != null &&
            1 == param2) {
            stackIn_19_0 = new IntPair(0, 0);
            return stackIn_19_0;
          }
          if (param3 == null &&
            param5 == null) {
            return null;
          }
          if (param5 != null) {
            stackIn_26_0 = -param5.offsetY + param4;
          } else {
            stackIn_26_0 = -param3.offsetY + param4;
          }
          param4 = stackIn_26_0;
          if (param3 != null) {
            param3.g(db.a(true, param1), MatchConditionEntry.a(param4, (byte) 94));
          } else {
            if (param5 == null) {
              return null;
            }
            param5.draw(db.a(true, param1), MatchConditionEntry.a(param4, (byte) 94));
          }
          stackIn_34_0 = null;
          return (IntPair) (stackIn_34_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_37_0 = var7;
          stackIn_37_1 = new StringBuilder().append("rk.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final static void e(int param0) {
        int var2 = 122 % ((param0 + 31) / 56);
        bj var1 = (bj) (ArchiveIndex.field_o.first((byte) 126));
        if (var1 == null) {
          dj.a((byte) -128);
          return;
        }
        CipherPacketBuffer var3 = ByteStorage.field_e;
        var3.readInt(1);
        var3.readInt(1);
        var3.readInt(1);
        var3.readInt(1);
        var1.unlink(-115);
    }

    private final int i(int param0) {
        int var2 = 32 % ((-32 - param0) / 59);
        return rs.field_n.field_L + rs.field_n.field_H;
    }

    private final int h(int param0) {
        if (param0 != -2881) {
          return -79;
        }
        return 3 + nr.field_e.field_v - nr.field_e.field_L - (nr.field_e.field_H >> 1);
    }

    private final void j(int param0) {
        int var2 = 0;
        AnimationFrameSet var3 = null;
        if (param0 != -302977872) {
          this.highlightPulse = (TrianglePulse) null;
        }
        if (this.illustrationAnimation != null) {
          this.illustrationAnimation.advance(-118);
          var2 = this.illustrationAnimation.frameId >> 16;
          var3 = we.a(var2, true);
          if (this.illustrationAnimation == null) {
            Object var3_ref = null;
            return;
          }
          io.a(var3, (byte) -34);
        } else {
          this.f(-11195);
        }
    }

    private final IntPair a(int param0, int param1, int param2, int param3, RgbSprite param4) {
        Object stackIn_2_0 = null;
        IntPair stackIn_6_0 = null;
        IntPair stackIn_12_0 = null;
        IntPair stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4 == null) {
            stackIn_2_0 = null;
            return (IntPair) (stackIn_2_0);
          }
          if (0 == param0) {
            stackIn_12_0 = new IntPair(param4.canvasWidth >> 1, param4.pixelHeight >> 1);
            return stackIn_12_0;
          }
          if (param0 == 1) {
            stackIn_6_0 = new IntPair(0, 0);
            return stackIn_6_0;
          }
          if (param4 != null) {
            param3 = param3 - param4.offsetY;
            if (param4 != null) {
              param4.h(db.a(true, param2), MatchConditionEntry.a(param3, (byte) 94));
            }
          }
          if (param1 == 26823) {
            return null;
          }
          stackIn_16_0 = (IntPair) null;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("rk.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void q(int param0) {
        field_y = null;
        if (param0 >= -20) {
          InstructionsPanel.e(41);
        }
        field_gb = null;
        field_c = null;
    }

    private final IntPair a(boolean param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7) {
        if (param4 != 74) {
          this.field_x = (IntPair) null;
        }
        if (param5 != 0 &&
          param5 != 1) {
          this.a(param1, param6, param7, param0, -1, param3);
          return null;
        }
        return this.a(param5, param2, 95);
    }

    private final int h(byte param0) {
        if (param0 >= -90) {
          InstructionsPanel.c(117);
        }
        return nr.field_e.field_v - nr.field_e.field_L - (nr.field_e.field_H - ((nr.field_e.field_y >> 1) + 3));
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        if (l.field_b != null &&
          param2 >= 0 &&
          l.field_b.length > param2) {
          if (null != l.field_b &&
            param1 >= 0 &&
            l.field_b.length > param1) {
            if (param3 != 114) {
              this.j((byte) 86);
            }
            if (null == l.field_b[param1]) {
              return;
            }
            l.field_b[param1].d(db.a(true, param0), MatchConditionEntry.a(-20 + param4, (byte) 94));
            return;
          }
          return;
        }
    }

    private final void a(int param0, byte param1, int param2, boolean param3, int param4, int param5) {
        int discarded$0 = 0;
        int var10 = 0;
        int var7;
        int var8;
        int var9;
        int var11;
        IndexedSprite var12;
        int var13;
        String var14;
        int var11Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (nr.field_c != null &&
          param0 >= 0 &&
          param0 < nr.field_c.length &&
          null != nr.field_c[param0]) {
          if (param1 < 71) {
            var14 = (String) null;
            discarded$0 = this.a(55, (String[]) null, (String) null, 27, -41, -10, 103, 60, -125);
          }
          param2 = param2 << 8 | param2;
          var7 = param2 >> 1 ^ param2;
          for (var10 = 0; var10 < 4; var10++) {
            var9 = -64 + ((param2 & 3) + 20);
            var8 = -44 + ((7 & var7) + CachedArchiveProvider.field_y[var10][0] + 40);
            if (var10 != 0) {
              var9 = var9 + CachedArchiveProvider.field_y[var10][1];
            }
            if (param3) {
              var8 = var8 >> 1;
              var9 = var9 >> 1;
            }
            var11 = -1;
            if (var10 == 0) {
              var11Lifetime1 = 16 + param2 % 9;
            } else {
              var11Lifetime1 = param2 % 9 + 25;
            }
            var7 = var7 >> 1;
            param2 = param2 >> 1;
            if (0 <= var11Lifetime1 &&
              nr.field_c.length > var11Lifetime1 &&
              nr.field_c[var11Lifetime1] != null) {
              var12 = nr.field_c[var11Lifetime1];
              if (param3) {
                var12.d(db.a(true, var8 + param4), MatchConditionEntry.a(var9 + param5, (byte) 94));
              } else {
                var12.draw(db.a(true, param4 + var8), MatchConditionEntry.a(param5 + var9, (byte) 94));
              }
            }
          }
          return;
        }
    }

    private final IntPair a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        Object var7;
        Object var8;
        if (param5 != 0 &&
          param5 != 1 &&
          2 != param5) {
          return null;
        }
        var7 = null;
        if (param1 < 32) {
          return (IntPair) null;
        }
        var8 = null;
        if (this.pageIndex == 0 &&
          param4 == 1) {
          return this.a(param0, 0, 7, 2, true, param5, param3);
        }
        if (this.pageIndex == 2 &&
          4 == param4) {
          return this.d(param3, param5, param0, 0);
        }
        if (this.pageIndex == 3 &&
          param4 == 1) {
          var8 = this.f(0, 0);
        } else if (this.pageIndex == 3 &&
          2 == param4) {
          var8 = this.f(0, 1);
        } else if (this.pageIndex == 3 &&
          3 == param4) {
          var8 = this.f(0, 2);
        } else if (3 == this.pageIndex &&
          param4 == 4) {
          var8 = this.f(0, 3);
        } else if (4 == this.pageIndex &&
          param4 == 0) {
          var8 = this.f(0, 5);
        } else if (this.pageIndex == 4 &&
          param4 == 1) {
          var8 = this.f(0, 4);
        } else if (this.pageIndex == 4 &&
          2 == param4) {
          var8 = this.f(0, 6);
        } else if (this.pageIndex == 4 &&
          param4 == 3) {
          var8 = this.f(0, 7);
        } else {
          if (this.pageIndex == 5 &&
            3 == param4) {
            return this.a(param3, param5, param0, 0, -3);
          }
          if (5 == this.pageIndex &&
            param4 == 4) {
            return this.a(param3, param5, param0, 1, -3);
          }
          if (this.pageIndex == 6 &&
            1 == param4) {
            return this.a(true, 8, 4, param3, (byte) 74, param5, 0, param0);
          }
          if (6 == this.pageIndex &&
            param4 == 2) {
            return this.a(param0, 0, 9, 4, true, param5, param3);
          }
          if (this.pageIndex == 6 &&
            param4 == 3) {
            return this.a(param0, 0, 7, 4, true, param5, param3);
          }
          if (this.pageIndex == 7 &&
            param4 == 1) {
            return this.a(param0, -1, 8, 3, true, param5, param3);
          }
          if (7 == this.pageIndex &&
            param4 == 2) {
            return this.a(param0, 0, 7, 3, true, param5, param3);
          }
          if (this.pageIndex == 7 &&
            param4 == 3) {
            return this.a(param0, -1, 9, 3, true, param5, param3);
          }
          if (8 == this.pageIndex &&
            3 == param4) {
            return this.c(param3, param0, -116, param5);
          }
          if (this.pageIndex == 9 &&
            param2 == 0 &&
            param4 == 1) {
            return this.a(param5, 26823, param3, param0, bj.field_p[0]);
          }
          if (9 == this.pageIndex &&
            param2 == 0 &&
            2 == param4) {
            return this.a(param5, 26823, param3, param0, bj.field_p[2]);
          }
          if (this.pageIndex == 9 &&
            0 == param2 &&
            param4 == 3) {
            return this.a(param5, 26823, param3, param0, bj.field_p[1]);
          }
          if (this.pageIndex == 9 &&
            param2 == 0 &&
            param4 == 4) {
            return this.a(param5, 26823, param3, param0, bj.field_p[3]);
          }
          if (this.pageIndex == 9 &&
            param2 == 1 &&
            param4 == 0) {
            return this.a(param3, param5, 0, param0, 0, 2);
          }
          if (9 == this.pageIndex &&
            param2 == 1 &&
            param4 == 1) {
            return this.a(param3, param5, 0, param0, 1, 2);
          }
          if (this.pageIndex == 9 &&
            param2 == 1 &&
            param4 == 2) {
            return this.a(param3, param5, 0, param0, 4, 2);
          }
          if (this.pageIndex == 9 &&
            param2 == 1 &&
            param4 == 3) {
            return this.a(param3, param5, 0, param0, 3, 2);
          }
          if (this.pageIndex == 10 &&
            param4 == 0) {
            return this.a(param3, param5, 0, param0, 2, 2);
          }
          if (10 == this.pageIndex &&
            param4 == 1) {
            return this.a(param3, param5, 0, param0, 5, 2);
          }
          if (this.pageIndex == 10 &&
            param4 == 2) {
            return this.a(param3, param5, 0, param0, 6, 2);
          }
          if (10 == this.pageIndex &&
            param4 == 3) {
            return this.a(param3, param5, 0, param0, 8, 2);
          }
          if (this.pageIndex == 10 &&
            param4 == 4) {
            return this.a(param3, param5, 0, param0, 12, 2);
          }
          if (this.pageIndex == 10 &&
            5 == param4) {
            return this.a(param3, param5, 0, param0, 14, 2);
          }
          if (this.pageIndex == 11 &&
            param4 == 1) {
            return this.a(param0, -1, 8, 3, true, param5, param3);
          }
          if (11 == this.pageIndex &&
            param4 == 2) {
            return this.a(param0, 0, 7, 3, true, param5, param3);
          }
          if (11 == this.pageIndex &&
            param4 == 3) {
            return this.a(param0, -1, 9, 3, true, param5, param3);
          }
          if (12 == this.pageIndex &&
            param4 == 1) {
            var7 = this.b(20255, 0);
          } else if (this.pageIndex == 12 &&
            2 == param4) {
            var7 = this.b(20255, 1);
          } else if (12 == this.pageIndex &&
            param4 == 3) {
            var7 = this.b(20255, 2);
          } else if (13 == this.pageIndex &&
            param4 == 1) {
            var7 = this.b(20255, 0);
          } else if (13 == this.pageIndex &&
            param4 == 2) {
            var7 = this.b(20255, 1);
          } else if (this.pageIndex == 13 &&
            param4 == 3) {
            var7 = this.b(20255, 2);
          } else {
            if (this.pageIndex == 16 &&
              param4 == 1) {
              return this.e(-94, param5, param3, param0, 4);
            }
            if (this.pageIndex == 16 &&
              2 == param4) {
              return this.a(param0, 0, 14, 3, true, param5, param3);
            }
            if (this.pageIndex == 16 &&
              param4 == 3) {
              return this.b(-2, param3, param5, 4, param0);
            }
            if (gv.field_a != null &&
              this.pageIndex >= 0 &&
              gv.field_a.length > this.pageIndex &&
              null != gv.field_a[this.pageIndex] &&
              param2 >= 0 &&
              param2 < gv.field_a[this.pageIndex].length &&
              null != gv.field_a[this.pageIndex][param2] &&
              param4 >= 0 &&
              gv.field_a[this.pageIndex][param2].length > param4 &&
              null != gv.field_a[this.pageIndex][param2][param4]) {
              var7 = gv.field_a[this.pageIndex][param2][param4];
            }
          }
        }
        if (var7 == null &&
          var8 == null) {
          return null;
        }
        return this.a((byte) 114, param3, param5, (RgbSprite) (var7), param0, (IndexedSprite) (var8));
    }

    final int getItemTopY(int obfuscationGuard, int itemIndex) {
        int var3;
        if (this.itemIds != null &&
          0 != this.itemIds.length) {
          if (0 > itemIndex) {
            return 1;
          }
          if (itemIndex >= this.itemIds.length) {
            return 1;
          }
          if (this.footerStart != null &&
            null != this.navigationStart) {
            if (obfuscationGuard >= -75) {
              this.getItemTopY(0, -60);
            }
            var3 = this.itemIds[itemIndex];
            if (22 != var3 &&
              23 != var3) {
              if (var3 != 8) {
                return 1;
              }
              return MatchConditionEntry.a(this.footerStart.second, (byte) 94);
            }
            return MatchConditionEntry.a(this.navigationStart.second, (byte) 94);
          }
          return 1;
        }
        return 1;
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        IntPair discarded$0 = null;
        this.c(param2, param0, -31550, !param3 ? param1 : -1, param5);
        UnitModelPreview var7 = this.field_s;
        if (param3) {
          var7 = this.field_fb;
        }
        if (var7 != null) {
          var7.setScreenPosition(db.a(true, param5 + 40), MatchConditionEntry.a(param2 + 60, (byte) 94), (byte) -117);
          var7.drawAtStoredPosition((byte) -72, false);
        }
        if (param4 != -1) {
          discarded$0 = this.e(-40, -71, -63, -38, 73);
        }
        if (param3) {
          this.a(db.a(true, param5), param1, MatchConditionEntry.a(param2 + 40, (byte) 94), false);
        }
    }

    private final void a(int param0, int param1, UnitModelPreview param2, int param3) {
        if (param2 == null) {
          return;
        }
        try {
          param2.setScreenPosition(db.a(true, param3), MatchConditionEntry.a(param0, (byte) 94), (byte) 77);
          param2.drawAtStoredPosition((byte) -72, false);
          int var5_int = -57 % ((param1 - 3) / 48);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "rk.NA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final boolean a(int param0, int param1) {
        if (param0 != 0) {
          this.g((byte) -105);
        }
        return 0 < param1 ? true : false;
    }

    private final void i(byte param0) {
        this.field_s = null;
        if (param0 != 28) {
          this.field_l = 29;
        }
        this.field_s = new UnitModelPreview(0);
        this.field_fb = null;
        this.field_fb = new UnitModelPreview(0);
        this.progressCounter = new TickCounter(250);
    }

    private final void b(int param0, int param1, int param2) {
        if (param1 != -31123) {
          this.field_t = -120;
        }
        if (this.field_S != null) {
          this.field_S.setScreenPosition(db.a(true, 40 + param2), MatchConditionEntry.a(90 + param0, (byte) 94), (byte) -3);
          this.field_S.drawAtStoredPosition((byte) -72, false);
          UnitCycler.a(-10, MatchConditionEntry.a(38 + param0, (byte) 94), db.a(true, param2), (Unit) null);
        }
    }

    private final IntPair e(int param0, int param1, int param2, int param3, int param4) {
        if (param0 >= -35) {
          this.m(-120);
        }
        if (param1 == 0 ||
          param1 == 1) {
          return this.a(param1, param4, -93);
        }
        this.b(param3, -31123, param2);
        return null;
    }

    private final IndexedSprite f(int param0, int param1) {
        IndexedSprite[] var4 = ro.field_rb;
        IndexedSprite[] var3 = var4;
        if (param1 < param0) {
          return null;
        }
        if (param1 > var4.length) {
          return null;
        }
        return var4[param1];
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (param2 != -31550) {
          this.getPanelEnd((byte) -64);
        }
        int var7 = 0;
        if (param1 < 0 ||
          va.field_G.length <= param1) {
          return;
        }
        int var8 = va.field_G[param1];
        ds.a(param4, 40 + param0, var7, param2 + 58616, false, var6, true, var8);
        ds.a(param4, param0 + 40, var7, param2 + 58616, false, var6, false, var8);
        this.b(param4, 40 + param0, param3, -25713, param1, var6);
    }

    final int getItemLeftX(int itemIndex, byte obfuscationGuard) {
        int var3;
        if (null != this.itemIds &&
          this.itemIds.length != 0) {
          if (itemIndex < 0) {
            return 1;
          }
          if (itemIndex >= this.itemIds.length) {
            return 1;
          }
          if (this.footerStart != null &&
            null != this.navigationStart) {
            if (obfuscationGuard != 4) {
              return 0;
            }
            var3 = this.itemIds[itemIndex];
            if (var3 == 22) {
              return db.a(true, this.navigationStart.first);
            }
            if (var3 == 23) {
              return so.field_b.field_a >> 1;
            }
            if (var3 != 8) {
              return 1;
            }
            return db.a(true, this.footerStart.first);
          }
          return 1;
        }
        return 1;
    }

    private final void b(boolean param0) {
        int var4_int = 0;
        int var7 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int var2;
        int var3;
        Object var4;
        int var5;
        IntPair var5_ref_ft;
        int var6;
        int var8;
        int var9;
        RgbSprite var10;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null != this.cachedPageSprites &&
          this.cachedPageSprites.length == 3 &&
          this.pageIndex == this.cachedPageIndex) {
          return;
        }
        var2 = -1;
        var3 = -1;
        for (var4_int = 0; var4_int < 6; var4_int++) {
          var5_ref_ft = this.d(var4_int, 1);
          if (var3 < 0 &&
            0 <= var5_ref_ft.second) {
            var3 = var5_ref_ft.second;
          }
          if (0 > var2 &&
            var5_ref_ft.first >= 0) {
            var2 = var5_ref_ft.first;
          }
          if (var2 >= 0 &&
            var5_ref_ft.first > var2) {
            var2 = var5_ref_ft.first;
          }
          if (var3 >= 0 &&
            var3 < var5_ref_ft.second) {
            var3 = var5_ref_ft.second;
          }
        }
        if (var2 >= 0) {
          stackIn_28_0 = 0;
          stackIn_28_1 = var3;
          if (stackIn_28_0 <= stackIn_28_1) {
            if (var2 > 0 &&
              var3 > 0) {
              var10 = new RgbSprite(var2, var3);
              var5 = 3 * var2 >> 2;
              if (!param0) {
                this.auxiliaryPreviewModel = (UnitModelPreview) null;
              }
              this.cachedPageSprites = new RgbSprite[3];
              var6 = var3 * 3 >> 2;
              for (var7 = 0; this.cachedPageSprites.length > var7; var7++) {
                this.cachedPageSprites[var7] = new RgbSprite(var5, var6);
                var8 = var7;
                if (this.pageIndex == 13) {
                  var8 = this.cachedPageSprites.length + var7;
                }
                this.a(this.cachedPageSprites[var7], var8, 0, var10, -110, 0);
              }
              var10.pixels = null;
              var4 = null;
              this.cachedPageIndex = this.pageIndex;
              return;
            }
            return;
          }
        }
    }

    private final int a(boolean param0) {
        if (!param0) {
          field_D = 24;
        }
        return nr.field_e.field_H >> 1;
    }

    private final IntPair e(int param0, int param1) {
        if (param1 == 0) {
          return new IntPair(40, 20);
        }
        if (param1 == 1) {
          return new IntPair(0, 0);
        }
        if (param0 == 3) {
          return null;
        }
        this.illustrationAnimation = (AnimationPlayer) null;
        return null;
    }

    private final int a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 <= 17) {
            this.pageIndex = 84;
          }
          if (param0 != null &&
            param1 >= 0 &&
            param1 < param0.length) {
            if (param0[param1] == -1 &&
              1 + param1 < param0.length) {
              var4_int = param1 + 1;
              while (true) {
                if (var4_int >= param0.length) {
                  stackIn_25_0 = -1;
                  return stackIn_25_0;
                }
                var5 = param0[var4_int];
                if (0 < var5) {
                  stackIn_19_0 = var5;
                  return stackIn_19_0;
                }
                if (var5 == 0) {
                  var4_int++;
                  continue;
                }
                break;
              }
              stackIn_22_0 = -1;
              return stackIn_22_0;
            }
            stackIn_13_0 = -1;
            return stackIn_13_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("rk.S(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        IntPair var9;
        IntPair var10;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var6Lifetime3;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 >= 0 &&
          param1 <= 1) {
          boolean decompiledFrameRemainder0 = true;
          if (param1 == 0 && (this.firstPreviewUnit == null ||
            this.firstPreviewModel == null)) {
            var5 = 29;
            var6 = 1;
            this.firstPreviewUnit = this.createPreviewUnit(var5, param3 ^ 19555, var6, param1);
            this.firstPreviewModel = new UnitModelPreview(var5);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (param1 == 1 && (this.secondPreviewUnit == null ||
              this.secondPreviewModel == null)) {
              var5Lifetime1 = 10;
              var6Lifetime3 = 1;
              this.secondPreviewUnit = this.createPreviewUnit(var5Lifetime1, -1, var6Lifetime3, param1);
              this.secondPreviewModel = new UnitModelPreview(var5Lifetime1);
              this.secondPreviewModel.setYaw(false, 256);
            }
          }
          if (param3 != -19556) {
            this.field_t = 104;
          }
          if (0 == param1 &&
            this.firstPreviewUnit != null &&
            this.firstPreviewModel != null) {
            var10 = this.a(param0, 0, param2, param1, -3);
            if (var10 == null) {
              return;
            }
            this.a(7 * (var10.second >> 3) + param2, 88, this.firstPreviewModel, (var10.first >> 1) + param0);
            var6Lifetime1 = ri.terrainDamageTakenPercent[0];
            var7 = 0;
            this.a(var7, param0, this.firstPreviewUnit.ownerPlayer, var6Lifetime1, 110, this.firstPreviewUnit, this.firstPreviewUnit, param2);
            return;
          }
          if (1 == param1 &&
            null != this.secondPreviewUnit &&
            null != this.secondPreviewModel) {
            var9 = this.a(param0, 0, param2, param1, -3);
            if (var9 == null) {
              return;
            }
            this.a(7 * (var9.second >> 3) + param2, 57, this.secondPreviewModel, param0 + (var9.first >> 1));
            var6Lifetime2 = ri.terrainDamageTakenPercent[0];
            var7Lifetime1 = 0;
            this.a(var7Lifetime1, param0, this.firstPreviewUnit.ownerPlayer, var6Lifetime2, 102, this.secondPreviewUnit, this.firstPreviewUnit, param2);
          }
          return;
        }
    }

    private final boolean c(int param0, int param1) {
        IntPair discarded$1 = null;
        RgbSprite var4;
        boolean stackIn_8_0 = false;
        if (param1 != 256) {
          var4 = (RgbSprite) null;
          discarded$1 = this.a(-114, 69, 36, -82, (RgbSprite) null);
        }
        stackIn_8_0 = (param0 == -1) || (param0 == 0) || !(param0 <= 0);
        return stackIn_8_0;
    }

    final void initializePanel(int obfuscationGuard) {
        this.pageIndex = 0;
        this.pageCount = -1;
        if (null == this.footerStart) {
          this.footerStart = new IntPair(31, 431);
        }
        if (this.footerEnd == null) {
          this.footerEnd = new IntPair(608, 462);
        }
        if (obfuscationGuard <= 98) {
          this.j(40);
        }
        if (null == this.navigationStart) {
          this.navigationStart = new IntPair(44, 386);
        }
        if (null == this.navigationEnd) {
          this.navigationEnd = new IntPair(595, 415);
        }
        if (this.itemIds == null) {
          this.itemIds = new int[]{22, 8, 23};
        }
        this.p(31559);
    }

    private final void g(int param0) {
        if (null == this.field_a) {
          return;
        }
        int var2 = this.field_C.second;
        int var3 = this.h((byte) -117);
        if (param0 < 105) {
          this.g((byte) 9);
        }
        int var4 = var3 + var2;
        fe.b(this.field_a, db.a(true, this.field_F.first), MatchConditionEntry.a(var4, (byte) 94));
        fe.c(this.field_a, db.a(true, this.field_F.first), MatchConditionEntry.a(var4, (byte) 94), nd.field_b, false);
    }

    private final void f(int param0) {
        int var2;
        AnimationSequence var3;
        this.illustrationAnimation = null;
        if (null != sf.unitAnimationGroups &&
          sf.unitAnimationGroups.length > 76) {
          var2 = sf.unitAnimationGroups[76];
          if (null != ck.animationSequencesByGroup &&
            var2 >= 0 &&
            ck.animationSequencesByGroup.length > var2) {
            if (null != ck.animationSequencesByGroup[var2] &&
              ck.animationSequencesByGroup[var2].length > 0) {
              if (param0 != -11195) {
                this.nextEnabled = false;
              }
              var3 = ck.animationSequencesByGroup[sf.unitAnimationGroups[76]][0];
              if (var3 == null) {
                return;
              }
              this.illustrationAnimation = new AnimationPlayer(1);
              this.illustrationAnimation.selectSequence(-1, var3);
              return;
            }
            return;
          }
          return;
        }
    }

    private final int drawInstructionRows(String[] headings, String[][] paragraphs, int topY, int[] illustrationModes, int[] illustrationArguments, byte obfuscationGuard, int sectionIndex) {
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String[] var14 = null;
        String var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var18Lifetime1;
        var19 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard > -111) {
            stackIn_3_0 = 69;
            return stackIn_3_0;
          }
          if (paragraphs != null &&
            headings != null) {
            if (illustrationArguments == null) {
              return 0;
            }
            if (paragraphs.length != headings.length) {
              stackIn_13_0 = 0;
              return stackIn_13_0;
            }
            if (paragraphs.length != illustrationModes.length) {
              stackIn_17_0 = 0;
              return stackIn_17_0;
            }
            if (paragraphs.length != illustrationArguments.length) {
              stackIn_20_0 = 0;
              return stackIn_20_0;
            }
            var8_int = topY;
            var9 = this.field_i;
            var10 = this.field_m;
            var11 = -var9 + var10;
            var12 = 0;
            for (var13 = 0; var13 < paragraphs.length; var13++) {
              var14 = paragraphs[var13];
              var15 = headings[var13];
              var16 = illustrationModes[var13];
              var17 = illustrationArguments[var13];
              if (var17 == -1) {
                var18 = this.a(illustrationArguments, var13, 50);
                if (var18 >= 0) {
                  var11 = var11 / var18;
                  var12 = 1;
                  var10 = var11 + var9;
                }
              }
              var18Lifetime1 = this.a(sectionIndex, var14, var15, var10, 9, var16, var13, topY, var9);
              if (var12 != 0 &&
                this.c(var17, 256)) {
                var9 = var9 + var11;
                var10 = var11 + var10;
                if (this.a(0, var17)) {
                  var12 = 0;
                  var9 = this.field_i;
                  var10 = this.field_m;
                  topY = topY + var18Lifetime1;
                  var11 = var10 - var9;
                }
              } else {
                var12 = 0;
                topY = var18Lifetime1 + topY;
              }
            }
            stackIn_35_0 = topY - var8_int;
            return stackIn_35_0;
          }
          stackIn_9_0 = 0;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_38_0 = var8;
          stackIn_38_1 = new StringBuilder().append("rk.SA(");
          if (headings == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (paragraphs == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(topY).append(',');
          if (illustrationModes == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (illustrationArguments == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(obfuscationGuard).append(',').append(sectionIndex).append(')').toString());
        }
    }

    final static int a(byte param0, int param1, boolean param2, String param3, String param4, boolean param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_35_0 = 0;
          boolean stackIn_45_0 = false;
          boolean stackIn_52_0 = false;
          boolean stackIn_55_0 = false;
          boolean stackIn_58_0 = false;
          boolean stackIn_63_0 = false;
          int stackIn_88_0 = 0;
          int stackIn_99_0 = 0;
          int stackIn_101_0 = 0;
          int stackIn_109_0 = 0;
          int stackIn_112_0 = 0;
          RuntimeException stackIn_115_0 = null;
          StringBuilder stackIn_115_1 = null;
          String stackIn_116_2 = null;
          StringBuilder stackIn_118_1 = null;
          String stackIn_119_2 = null;
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
          var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            if (null == MoveAttackRequest.field_z &&
              !EffectPresentation.a(param5, 0)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (ov.field_g == sg.field_a) {
              if (param5) {
                var10 = (String) null;
                CampaignRewardPreview.field_g = oi.a((String) null, param3, false, 1, dc.field_o);
              } else {
                CampaignRewardPreview.field_g = ml.a(false, param4, (byte) 10, param3);
              }
              vl.outgoingPacket.position = 0;
              vl.outgoingPacket.writeByte(1, 14);
              vl.outgoingPacket.writeByte(param0 ^ -54, CampaignRewardPreview.field_g.a((byte) -16).field_c);
              hb.$cfr$intArgs$a$e9dea5688aa5(67, -1);
              ov.field_g = gi.field_d;
            }
            if (ov.field_g == gi.field_d &&
              es.a(-111, 1)) {
              var6_int = ByteStorage.field_e.readUnsignedByte(0);
              if (0 != var6_int) {
                nm.field_o = var6_int;
                fk.field_b = -1;
                ov.field_g = SummonAction.field_z;
              } else {
                ov.field_g = mh.field_a;
              }
              ByteStorage.field_e.position = 0;
            }
            if (mh.field_a == ov.field_g &&
              es.a(-115, 8)) {
              ts.field_h = ByteStorage.field_e.j((byte) -2);
              ByteStorage.field_e.position = 0;
              bk.a(param2, param5, CampaignRewardPreview.field_g, 0, param1);
              ov.field_g = NetworkResourceRequest.field_D;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ov.field_g == NetworkResourceRequest.field_D &&
              es.a(-90, 1)) {
              var6_intLifetime1 = ByteStorage.field_e.readUnsignedByte(param0 + 53);
              ByteStorage.field_e.position = 0;
              DropdownSelector.field_P = null;
              nm.field_o = var6_intLifetime1;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  ov.field_g = SummonAction.field_z;
                  fk.field_b = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  dj.a((byte) -126);
                  ev.field_b = false;
                  stackIn_30_0 = var6_intLifetime1;
                  return stackIn_30_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ov.field_g = oq.field_m;
                fk.field_b = -1;
              }
            }
            if (param0 != -53) {
              stackIn_35_0 = -46;
              return stackIn_35_0;
            }
            if (oq.field_m == ov.field_g &&
              jh.g(2)) {
              dc.field_o = ByteStorage.field_e.j((byte) -2);
              wl.field_I = param3;
              BufferedSocket.field_j = ByteStorage.field_e.readUnsignedByte(0);
              tf.field_l = ByteStorage.field_e.readUnsignedByte(0);
              df.field_M = ByteStorage.field_e.readUnsignedShort((byte) -104);
              var6 = ByteStorage.field_e.c((byte) -125);
              var7 = ByteStorage.field_e.readUnsignedByte(param0 + 53);
              if ((var7 & 1) != 0) {
                wj.a(0);
              }
              if (!param5) {
                stackIn_52_0 = ((var7 & 8) != 0);
                NodeIterator.field_a = stackIn_52_0;
                stackIn_55_0 = ((2 & var7) != 0);
                vi.field_d = stackIn_55_0;
                stackIn_58_0 = ((4 & var7) != 0);
                ul.field_m = stackIn_58_0;
                if (NodeIterator.field_a) {
                  vi.field_d = true;
                }
                stackIn_63_0 = ((16 & var7) != 0);
                c.field_c = stackIn_63_0;
                if (ul.field_a) {
                  ByteStorage.field_e.readUnsignedByte(0);
                  ByteStorage.field_e.readUnsignedByte(param0 ^ -53);
                  ByteStorage.field_e.readInt(param0 + 54);
                  of.field_Nb = ByteStorage.field_e.readUnsignedShort((byte) -104);
                  nk.field_C = new byte[of.field_Nb];
                  for (var8 = 0; of.field_Nb > var8; var8++) {
                    nk.field_C[var8] = ByteStorage.field_e.readByte((byte) -49);
                  }
                }
              } else {
                stackIn_45_0 = ((16 & var7) != 0);
                c.field_c = stackIn_45_0;
                if (ul.field_a) {
                  ByteStorage.field_e.readUnsignedByte(0);
                  ByteStorage.field_e.readUnsignedByte(param0 ^ -53);
                  ByteStorage.field_e.readInt(param0 + 54);
                  of.field_Nb = ByteStorage.field_e.readUnsignedShort((byte) -104);
                  nk.field_C = new byte[of.field_Nb];
                  for (var8 = 0; of.field_Nb > var8; var8++) {
                    nk.field_C[var8] = ByteStorage.field_e.readByte((byte) -49);
                  }
                }
              }
              mv.field_d = ByteStorage.field_e.g(1);
              var11 = (CharSequence) ((Object) mv.field_d);
              IntPair.field_p = k.a(var11, false);
              vt.field_n = ByteStorage.field_e.readUnsignedByte(0);
              ov.field_g = ResourceArchive.field_k;
              if (CampaignRewardPreview.field_g.a((byte) 50) != pt.field_db) {
                if (CampaignRewardPreview.field_g.a((byte) -11) == fl.field_u) {
                  ps.field_y.a(param0 - 84, CombatEvent.d((byte) -120));
                }
              } else {
                CombatSandbox.field_j.a(param0 - 84, CombatEvent.d((byte) -127));
              }
              ev.field_b = false;
              if (var6 != null) {
                ph.a(var6, CombatEvent.d((byte) -117), false);
              }
              if (df.field_M <= 0 &&
                !ul.field_m) {
                try {
                  lj.a("unzap", (byte) -52, CombatEvent.d((byte) -128));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  lj.a(CombatEvent.d((byte) -115), "zap", new Object[]{lt.a(param0 + 53, dc.field_o)}, 106);
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (df.field_M > 0) {
                BestScoreStrategy.field_l = true;
              }
              vl.outgoingPacket.initializeOpcodeCipher(CombatEvent.field_L, -106);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                CombatEvent.field_L[var8Lifetime1] = CombatEvent.field_L[var8Lifetime1] + 50;
              }
              ByteStorage.field_e.initializeOpcodeCipher(CombatEvent.field_L, param0 - 66);
              stackIn_88_0 = nm.field_o;
              return stackIn_88_0;
            }
            if (SummonAction.field_z == ov.field_g &&
              jh.g(2)) {
              dj.a((byte) -128);
              if (nm.field_o == 7 &&
                !ev.field_b) {
                ev.field_b = true;
                stackIn_101_0 = -1;
                return stackIn_101_0;
              }
              if (nm.field_o == 7) {
                nm.field_o = 3;
              }
              lk.field_r = ByteStorage.field_e.g(1);
              ev.field_b = false;
              stackIn_99_0 = nm.field_o;
              return stackIn_99_0;
            }
            if (null == MoveAttackRequest.field_z) {
              if (ev.field_b) {
                if (TileMetadata.b(0) <= 30000L) {
                  lk.field_r = DamageEvent.field_y;
                } else {
                  lk.field_r = gu.field_a;
                }
                ev.field_b = false;
                stackIn_109_0 = 3;
                return stackIn_109_0;
              }
              var6_intLifetime2 = rn.field_d;
              rn.field_d = AiPlanningStrategy.field_c;
              AiPlanningStrategy.field_c = var6_intLifetime2;
              ev.field_b = true;
            }
            stackIn_112_0 = -1;
            return stackIn_112_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_115_0 = var6_ref;
            stackIn_115_1 = new StringBuilder().append("rk.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_116_2 = "null";
            } else {
              stackIn_116_2 = "{...}";
            }
            stackIn_118_1 = ((StringBuilder) (Object) stackIn_115_1).append(stackIn_116_2).append(',');
            if (param4 == null) {
              stackIn_119_2 = "null";
            } else {
              stackIn_119_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_115_0), ((StringBuilder) (Object) stackIn_118_1).append(stackIn_119_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void updatePageState(String footerCaption, boolean previousEnabled, int obfuscationGuard, int selectedItem, boolean nextEnabled, int pageIndex) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (0 > this.pageCount) {
            this.pageCount = PortalLossCondition.instructionParagraphs.length;
          }
          if (pageIndex != this.pageIndex &&
            pageIndex >= 0 &&
            pageIndex < this.pageCount) {
            this.pageIndex = pageIndex;
          }
          if (this.pageIndex < 0 ||
            this.pageIndex >= this.pageCount) {
            this.pageIndex = 0;
          }
          this.configureNavigation((byte) -106, selectedItem, nextEnabled, previousEnabled);
          if (null == this.highlightPulse) {
            this.highlightPulse = new TrianglePulse(0, 256, 100);
          }
          this.highlightPulse.advance((byte) -66);
          if (null == this.illustrationCounter) {
            this.illustrationCounter = new TickCounter(256);
          }
          if (this.illustrationCounter.advanceAndCheck(-1)) {
            this.illustrationCounter.reset(17);
          }
          if (null == this.secondaryIllustrationCounter) {
            this.secondaryIllustrationCounter = new TickCounter(100);
          }
          if (this.secondaryIllustrationCounter.advanceAndCheck(-1)) {
            this.secondaryIllustrationCounter.reset(obfuscationGuard ^ 117);
          }
          this.j(-302977872);
          this.b(obfuscationGuard - 62);
          this.footerCaption = footerCaption;
          if (this.pageIndex != 12) {
            if (this.pageIndex == 13) {
              this.b(true);
            } else {
              this.m(0);
            }
          } else {
            this.b(true);
          }
          if (obfuscationGuard != 100) {
            this.nextHighlighted = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_33_0 = var7;
          stackIn_33_1 = new StringBuilder().append("rk.G(");
          if (footerCaption == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(previousEnabled).append(',').append(obfuscationGuard).append(',').append(selectedItem).append(',').append(nextEnabled).append(',').append(pageIndex).append(')').toString());
        }
    }

    private final IntPair d(int param0, int param1) {
        IntPair var3;
        IntPair var4;
        var4 = new IntPair(-1, -1);
        var3 = var4;
        if (0 <= param0 &&
          param0 < BufferedFile.field_k.length &&
          1 + param0 < UnitModelPreview.field_d.length &&
          gt.field_c.length > param0) {
          if (param1 != 1) {
            this.previousEnabled = false;
          }
          var4.first = BufferedFile.field_k[param0].canvasWidth;
          var4.second = BufferedFile.field_k[param0].canvasHeight;
          return var3;
        }
        return var3;
    }

    private final int a(int param0, String[] param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int discarded$0 = 0;
        IntPair discarded$1 = null;
        IntPair discarded$2 = null;
        IntPair discarded$3 = null;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        Object var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        IntPair var26 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        var24 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var10_int = param8;
          if (param4 != 9) {
            discarded$0 = this.h(-86);
          }
          var11 = param3;
          var12 = param7;
          var13 = 0;
          var14 = 0;
          var15 = this.d(17);
          var16 = null;
          var17 = null;
          if (param5 != -1) {
            var26 = this.a(0, (byte) 80, param0, 0, param6, 0);
            var16 = var26;
            if (var26 != null && (!(var26.first >= 0) ||
              !(var26.second >= 0))) {
              var16 = null;
            }
            var17 = this.a(0, (byte) 73, param0, 0, param6, 1);
          }
          if (param5 == 5 &&
            var16 != null &&
            var17 != null) {
            var11 = var11 - (this.field_db + ((IntPair) (var16)).first);
          }
          if (3 == param5 &&
            var16 != null &&
            var17 != null) {
            var10_int = var10_int + (this.field_db + ((IntPair) (var16)).first);
          }
          if (param5 == 1 &&
            var16 != null &&
            var17 != null) {
            var18 = (-((IntPair) (var16)).first + param3 - param8 >> 1) - ((IntPair) (var17)).first + param8;
            var19 = param7 - ((IntPair) (var17)).second + var13;
            discarded$1 = this.a(var19, (byte) 46, param0, var18, param6, 2);
            var12 = var12 + ((IntPair) (var16)).second;
          }
          if (param2 != null) {
            var18Lifetime1 = var10_int;
            var19Lifetime1 = var12;
            var20 = var11 - var10_int;
            var21 = rs.field_n.getParagraphHeight(param2, var20, var15);
            var22 = this.field_z;
            var23 = 0;
            if (param5 == 1 &&
              var16 != null &&
              var17 != null) {
              var23 = 1;
            }
            rs.field_n.a(param2, db.a(true, var18Lifetime1), MatchConditionEntry.a(var19Lifetime1, (byte) 94), var20, var21, var22, -1, var23, 0, var15);
            var12 = var12 + var21;
            if (param1 != null) {
              var12 = var12 + this.field_g;
            }
            var19Lifetime1 = var19Lifetime1 + var21;
            var13 = var12 - param7;
          }
          if (param1 != null &&
            rs.field_n != null) {
            var18Lifetime2 = var10_int;
            var19Lifetime2 = var12;
            var20Lifetime1 = var11 - var10_int;
            var25 = 0;
            var21Lifetime1 = var25;
            while (param1.length > var25) {
              var22Lifetime1 = rs.field_n.getParagraphHeight(param1[var25], var20Lifetime1, var15);
              var23Lifetime1 = this.field_l;
              rs.field_n.a(param1[var25], db.a(true, var18Lifetime2), MatchConditionEntry.a(var19Lifetime2, (byte) 94), var20Lifetime1, var22Lifetime1, var23Lifetime1, -1, 0, 0, var15);
              var19Lifetime2 = var19Lifetime2 + var22Lifetime1;
              if ((-1 + param1.length) > var25) {
                var19Lifetime2 = var19Lifetime2 + this.field_E;
              }
              var25++;
            }
            var13 = var19Lifetime2 - param7;
          }
          if (param5 == 3 &&
            var16 != null &&
            var17 != null) {
            var18Lifetime3 = param8 - ((IntPair) (var17)).first;
            var19Lifetime3 = -((IntPair) (var17)).second + param7;
            if (((IntPair) (var16)).second <= var13) {
              var19Lifetime3 = var19Lifetime3 + (var13 - ((IntPair) (var16)).second >> 1);
            }
            discarded$2 = this.a(var19Lifetime3, (byte) 52, param0, var18Lifetime3, param6, 2);
            if (this.field_E + var13 < ((IntPair) (var16)).second) {
              var14 = var14 + ((IntPair) (var16)).second;
            } else {
              var14 = var14 + var13;
            }
          } else if (param5 == 5 &&
            var16 != null &&
            var17 != null) {
            var18Lifetime3 = -((IntPair) (var16)).first - ((IntPair) (var17)).first + param3;
            var19Lifetime3 = param7 - ((IntPair) (var17)).second;
            if (var13 >= ((IntPair) (var16)).second) {
              var19Lifetime3 = var19Lifetime3 + (-((IntPair) (var16)).second + var13 >> 1);
            }
            discarded$3 = this.a(var19Lifetime3, (byte) 68, param0, var18Lifetime3, param6, 2);
            if (this.field_E + var13 >= ((IntPair) (var16)).second) {
              var14 = var14 + var13;
            } else {
              var14 = var14 + ((IntPair) (var16)).second;
            }
          } else {
            var14 = var14 + var13;
          }
          var14 = var14 + this.field_E;
          stackIn_61_0 = var14;
          return stackIn_61_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_64_0 = var10;
          stackIn_64_1 = new StringBuilder().append("rk.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param2 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        if (param1 >= 0 &&
          op.field_c.length > param1) {
          if (this.progressCounter != null &&
            this.progressCounter.elapsedTicks >= 0 &&
            this.progressCounter.limit > 0 &&
            this.progressCounter.elapsedTicks <= this.progressCounter.limit) {
            var5 = 18;
            var6 = 30;
            param0 = param0 + var5;
            if (param3) {
              this.c((byte) -78);
            }
            param2 = param2 + var6;
            var7 = 42;
            var8 = 6;
            SoftwareRaster.b(param0, param2, var7, var8, 16777215);
            SoftwareRaster.f(param0 + 1, param2 + 1, -2 + var7, var8 - 2, 0);
            var9 = 0;
            if (this.progressCounter.limit > 0) {
              var9 = 1 + this.progressCounter.elapsedTicks * (var7 - 2) / 100;
            }
            if (var9 < 0) {
              var9 = 0;
            }
            if (var9 > var7 - 2) {
              var9 = var7 - 2;
            }
            SoftwareRaster.f(param0 + 1, param2 + 1, var9, var8 - 2, op.field_c[0][param1]);
            return;
          }
          return;
        }
    }

    final void drawPanel(byte obfuscationGuard) {
        if (this.pageCount < 0) {
          return;
        }
        int var2 = this.field_C.first;
        if (obfuscationGuard != -102) {
          this.field_g = -92;
        }
        int var3 = this.field_C.second;
        int var4 = this.field_V.first - var2;
        int var5 = this.field_V.second - var3;
        fe.b(db.a(true, var2), MatchConditionEntry.a(var3, (byte) 94), var4, var5, io.field_m, nd.field_b, this.field_A, this.field_e);
        this.g(120);
        var2 = this.field_x.first;
        var3 = this.field_x.second;
        var4 = -var2 + this.field_K.first;
        var5 = -var3 + this.field_K.second;
        fe.b(db.a(true, var2), MatchConditionEntry.a(var3, (byte) 94), var4, var5, io.field_m, TutorialController.field_e, this.field_A, this.field_e);
        this.drawPageSections(-107);
        this.l(obfuscationGuard + 19);
        this.g((byte) 10);
    }

    private final IntPair d(int param0, int param1, int param2, int param3) {
        if (param3 != 0) {
          return (IntPair) null;
        }
        if (param1 == 0) {
          return new IntPair(309, 81);
        }
        if (param1 == 1) {
          return new IntPair(0, 0);
        }
        if (param1 == 2) {
          this.b(param2, (byte) 127, param0);
        }
        return null;
    }

    static {
        field_gb = "Reward";
        field_y = "Quit";
        field_c = "Music: ";
    }
}
