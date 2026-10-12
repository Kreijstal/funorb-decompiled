/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo {
    private String field_c;
    private RgbSprite field_b;
    private int field_p;
    private IndexedSprite[] field_i;
    private UiSelectionState field_h;
    private String[] field_k;
    static byte[][] field_d;
    private int field_n;
    private int field_l;
    private RgbSprite field_t;
    private int field_r;
    private RgbSprite field_m;
    static int watchedRoomId;
    private boolean field_s;
    private int field_f;
    static String field_e;
    static gu field_g;
    private int field_q;
    static String field_o;
    static String field_j;

    public static void b(int param0) {
        try {
          field_g = null;
          field_o = null;
          field_d = (byte[][]) null;
          field_e = null;
          field_j = null;
          if (param0 != -8616) {
            oo.b(85);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "oo.E(" + param0 + ')');
        }
    }

    private final void a(String param0, byte param1, IndexedSprite[] param2, java.applet.Applet param3, boolean param4, String[] param5) {
        String var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          var7 = param3.getParameter("currency");
          if (var7 != null &&
            vv.a(-84, (CharSequence) ((Object) var7))) {
            this.field_r = HuffmanCodec.a(param1 + 2, (CharSequence) ((Object) var7));
          } else {
            this.field_r = 2;
          }
          this.field_c = param0;
          this.field_h = new UiSelectionState(2);
          this.field_k = param5;
          if (param1 != 71) {
            return;
          }
          this.field_i = param2;
          if (null != this.field_i &&
            3 <= this.field_i.length) {
            mk.field_h = param4;
            return;
          }
          throw new IllegalArgumentException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_17_0 = var7_ref;
          stackIn_17_1 = new StringBuilder().append("oo.K(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_0 = stackIn_17_0;
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_0 = stackIn_21_0;
            stackIn_22_2 = "null";
          } else {
            stackIn_22_0 = stackIn_17_0;
            stackIn_22_2 = "{...}";
          }
          stackIn_25_0 = stackIn_22_0;
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_26_0 = stackIn_25_0;
            stackIn_26_2 = "null";
          } else {
            stackIn_26_0 = stackIn_22_0;
            stackIn_26_2 = "{...}";
          }
          stackIn_29_0 = stackIn_26_0;
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_0 = stackIn_29_0;
            stackIn_30_2 = "null";
          } else {
            stackIn_30_0 = stackIn_26_0;
            stackIn_30_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final int a(boolean param0, int param1) {
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var4Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_l = this.field_l + 65536;
          while (ev.b(-101, qk.field_d, this.field_l) >= 65536) {
            this.field_l = this.field_l - qk.field_d;
            this.field_f = this.field_f + 1;
          }
          if (param1 > -95) {
            var7 = (int[]) null;
            this.a((RgbSprite) null, 114, -82, (String) null, (BitmapFont) null, (int[]) null, 110, 33, 0, 0.8778258562088013f);
          }
          var3_int = -1;
          if (this.field_i != null) {
            var3_int = this.field_i.length;
          }
          if (var3_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (qk.field_c > this.field_p) {
              this.field_p = this.field_p + 1;
              if (this.field_p > qk.field_a && (null == this.field_i ||
                this.field_i[this.field_n] == null)) {
                this.field_p = this.field_p - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (qk.field_c <= this.field_p &&
                  this.field_i[(this.field_n + 1) % var3_int] == null) {
                  this.field_p = this.field_p - 1;
                }
              }
            }
            if (this.field_p >= qk.field_c) {
              this.field_q = this.field_n;
              this.field_p = this.field_p - qk.field_c;
              if (this.field_s) {
                this.field_n = this.field_n + 1;
                if (var3_int <= this.field_n) {
                  this.field_n = this.field_n - var3_int;
                }
              } else {
                this.field_n = this.field_n - 1;
                if (0 > this.field_n) {
                  this.field_n = this.field_n + var3_int;
                }
              }
            }
            if (this.field_p > qk.field_a) {
              this.field_s = true;
            }
          }
          if (null != ByteStorage.field_d) {
            var4 = 0;
            if (DeployEvent.pointerPressButton != 0 &&
              TeleportAction.pointerPressY > 257 &&
              290 > TeleportAction.pointerPressY) {
              if (9 < BattleTutorial.pointerPressX &&
                82 > BattleTutorial.pointerPressX) {
                var4 = 1;
                this.field_p = qk.field_c;
                this.field_s = false;
              }
              if (558 < BattleTutorial.pointerPressX &&
                631 > BattleTutorial.pointerPressX) {
                var4 = 1;
                this.field_p = qk.field_c;
                this.field_s = true;
              }
            }
            if (var4 == 0 &&
              this.field_p > qk.field_a &&
              257 < TeleportAction.pointerPressY &&
              290 > TeleportAction.pointerPressY) {
              if (AiPlanningStrategy.pointerX > 9 &&
                AiPlanningStrategy.pointerX < 82) {
                this.field_p = qk.field_a;
              }
              if (558 < AiPlanningStrategy.pointerX &&
                631 > AiPlanningStrategy.pointerX) {
                this.field_p = qk.field_a;
              }
            }
          }
          if (param0) {
            this.field_h.updatePointerSelection(0, this.a(BattleTutorial.pointerPressX, TeleportAction.pointerPressY, -387), this.a(AiPlanningStrategy.pointerX, ko.pointerY, -387));
            var4Lifetime1 = 0;
            if (this.field_h.hasActivationInput((byte) 96)) {
              if (0 == this.field_h.selectedIndex) {
                var4Lifetime1 = 1;
              }
              if (this.field_h.selectedIndex == 1) {
                stackIn_73_0 = 2;
                return stackIn_73_0;
              }
            }
            if (mk.field_h) {
              while (Unit.pollKeyEvent((byte) -71)) {
                var5 = this.c(127);
                if (0 == var5) {
                  continue;
                }
                stackIn_80_0 = var5;
                return stackIn_80_0;
              }
            }
            if (var4Lifetime1 != 0) {
              this.b((byte) -92);
              stackIn_84_0 = 3;
              return stackIn_84_0;
            }
          }
          stackIn_86_0 = 0;
          return stackIn_86_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "oo.C(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0) {
        Throwable decompiledCaughtException = null;
        Exception var2 = null;
        RuntimeException var2_ref = null;
        try {
          try {
            QuickChatPhraseRepository.a(32767, CombatEvent.d((byte) 73));
            if (param0 >= -84) {
              this.field_n = 29;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (Exception) (Object) decompiledCaughtException;
            var2.printStackTrace();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "oo.A(" + param0 + ')');
        }
    }

    private final int c(int param0) {
        int discarded$1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 <= 126) {
            discarded$1 = this.c(-121);
          }
          this.field_h.pollNavigationKeys((byte) -120);
          if (this.field_h.hasActivationInput((byte) 73)) {
            if (this.field_h.selectedIndex == 0) {
              this.b((byte) -95);
              stackIn_5_0 = 3;
              return stackIn_5_0;
            }
            if (this.field_h.selectedIndex == 1) {
              stackIn_10_0 = 1;
              return stackIn_10_0;
            }
          }
          if (rs.keyCode != 13) {
            stackIn_15_0 = 0;
            return stackIn_15_0;
          }
          stackIn_13_0 = 1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "oo.I(" + param0 + ')');
        }
    }

    private final void a(int[] param0, int param1, String param2, int param3, BitmapFont param4, byte param5, int param6, int param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          rq.pushRasterState((byte) -56);
          for (var9_int = param7; var9_int < param6; var9_int++) {
            SoftwareRaster.setClip(param3, var9_int, param1, var9_int + 1);
            var10 = var9_int * param0.length / param6;
            var11 = param0[param0.length - var10 - 1];
            param4.a(param2, param3, param7, param1, param6, var11, -1, 1, 1, 0);
          }
          QuickChatPhraseRepository.popRasterState(-18862);
          if (param5 < 62) {
            field_e = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_12_0 = var9;
          stackIn_12_1 = new StringBuilder().append("oo.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_0 = stackIn_12_0;
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_0 = stackIn_16_0;
            stackIn_17_2 = "null";
          } else {
            stackIn_17_0 = stackIn_12_0;
            stackIn_17_2 = "{...}";
          }
          stackIn_20_0 = stackIn_17_0;
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_0 = stackIn_20_0;
            stackIn_21_2 = "null";
          } else {
            stackIn_21_0 = stackIn_17_0;
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          SoftwareRaster.a(9, 9, 622, 47, 4540749, 65793);
          SoftwareRaster.f(9, 257, 622, 33, 2585);
          SoftwareRaster.a(9, 265, 622, 11, 2585, 1515566);
          var2_int = 0;
          var3 = 14;
          while (4 > var2_int) {
            SoftwareRaster.a(var3, 331, 117, 90, 460551, 3881787);
            var2_int++;
            var3 += 121;
          }
          var2_intLifetime1 = 0;
          if (param0 < 106) {
            this.a((byte) -43);
          }
          var3Lifetime1 = 299;
          while (var2_intLifetime1 < 2) {
            SoftwareRaster.a(508, var3Lifetime1, 127, 42, 1130115, 3365268);
            SoftwareRaster.f(508, 42 + var3Lifetime1, 127, 42, 12410);
            var3Lifetime1 += 91;
            var2_intLifetime1++;
          }
          this.d(1439);
          if (null != iw.field_p &&
            iw.field_p.ensureIndex((byte) 82) &&
            iw.field_p.ensureGroupAvailableByName(28979, "members_expansion_screen") &&
            iw.field_p.ensureGroupAvailableByName(28979, "arialish12") &&
            iw.field_p.ensureGroupAvailableByName(28979, "pump32") &&
            bh.field_H != null &&
            bh.field_H.ensureIndex((byte) 82) &&
            bh.field_H.ensureGroupAvailableByName(28979, "arialish12") &&
            bh.field_H.ensureGroupAvailableByName(28979, "pump32")) {
            UnitLossCondition.field_a = pv.a("members_expansion_screen", "frame", iw.field_p, 24914);
            ByteStorage.field_d = GameplayController.a("arrow", (byte) 51, "members_expansion_screen", iw.field_p);
            VerticalScrollbar.field_Sb = DropdownArrowPainter.a("arialish12", iw.field_p, bh.field_H, (byte) -53, "");
            kt.field_n = it.a("", iw.field_p, bh.field_H, (byte) -87, "pump32");
            UnitModelPreview.field_b = DiskCacheRequest.loadRgbSpriteByName("benefit_orbs", "members_expansion_screen", iw.field_p, false);
            QuickChatPhrase.field_D = DiskCacheRequest.loadRgbSpriteByName("button_text", "members_expansion_screen", iw.field_p, false);
            DiskCacheRequest.field_G = ac.a(iw.field_p, "button_highlights", (byte) -4, "members_expansion_screen");
            bh.field_H = null;
            iw.field_p = null;
          }
          this.a((byte) -124);
          if (UnitLossCondition.field_a == null) {
            return;
          }
          this.field_b.g(376, 339);
          this.field_t.g(9, 9);
          UnitLossCondition.field_a.draw(0, 0);
          if (ByteStorage.field_d != null) {
            ByteStorage.field_d.g(9, 257);
            ByteStorage.field_d.d(558, 257);
            if (ko.pointerY > 257 &&
              ko.pointerY < 290) {
              var2_intLifetime2 = (40 * CombatViewTransition.c(this.field_f << 4, 127) >> 16) + 40;
              if (var2_intLifetime2 > 0) {
                if (AiPlanningStrategy.pointerX > 9 &&
                  AiPlanningStrategy.pointerX < 82) {
                  ByteStorage.field_d.f(8, 256, var2_intLifetime2);
                  ByteStorage.field_d.f(10, 256, var2_intLifetime2);
                  ByteStorage.field_d.f(8, 258, var2_intLifetime2);
                  ByteStorage.field_d.f(10, 258, var2_intLifetime2);
                } else {
                  if (AiPlanningStrategy.pointerX > 558 &&
                    AiPlanningStrategy.pointerX < 631) {
                    ByteStorage.field_d.h();
                    ByteStorage.field_d.f(557, 256, var2_intLifetime2);
                    ByteStorage.field_d.f(559, 256, var2_intLifetime2);
                    ByteStorage.field_d.f(557, 258, var2_intLifetime2);
                    ByteStorage.field_d.f(559, 258, var2_intLifetime2);
                    ByteStorage.field_d.h();
                  }
                }
              }
            }
          }
          this.field_m.g(16, 302);
          VerticalScrollbar.field_Sb.a(this.field_k[this.field_n], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
          UnitModelPreview.field_b.g(30, 330);
          VerticalScrollbar.field_Sb.a(db.field_e[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
          VerticalScrollbar.field_Sb.a(db.field_e[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
          VerticalScrollbar.field_Sb.a(db.field_e[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
          QuickChatPhrase.field_D.g((127 - QuickChatPhrase.field_D.canvasWidth) / 2 + 508, 315);
          if (0 != this.field_h.selectedIndex) {
            if (this.field_h.selectedIndex == 1) {
              DiskCacheRequest.field_G[1].g(508, 387);
            }
          } else {
            DiskCacheRequest.field_G[0].g(508, 299);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "oo.G(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        IndexedSprite var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        IndexedSprite var6 = null;
        IndexedSprite var7 = null;
        IndexedSprite var2Lifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == this.field_i) {
            if (null != VerticalScrollbar.field_Sb) {
              VerticalScrollbar.field_Sb.a(ConsoleParseException.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
            }
            return;
          }
          if (param0 != 1439) {
            watchedRoomId = -111;
          }
          var6 = this.field_i[this.field_n];
          var2 = var6;
          if (var2 == null) {
            if (VerticalScrollbar.field_Sb != null) {
              VerticalScrollbar.field_Sb.a(ConsoleParseException.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
            }
          } else {
            var6.draw(9, 58);
          }
          if (this.field_p < qk.field_a) {
            var7 = this.field_i[this.field_q];
            var2Lifetime1 = var7;
            if (var2Lifetime1 != null) {
              var3 = this.field_p * (var7.canvasWidth + 60) / qk.field_a;
              var4 = var3 - 30;
              if (!this.field_s) {
                rb.a(58, -1708086482, 9, 256 * (var7.canvasWidth - var4) / 30, var4 * -256 / 30, var7);
              } else {
                rb.a(58, param0 ^ -1708085583, 9, var4 * -256 / 30, 256 * (-var4 + var7.canvasWidth) / 30, var7);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "oo.M(" + param0 + ')');
        }
    }

    private final void a(RgbSprite param0, int param1, int param2, String param3, BitmapFont param4, int[] param5, int param6, int param7, int param8, float param9) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        RgbSprite var13 = null;
        try {
          var11_int = (int)((float)param8 / param9);
          var12 = (int)((float)param7 / param9);
          var13 = new RgbSprite(var11_int, var12);
          CombatSandbox.a(var13, 3);
          if (param6 >= -108) {
            oo.b(-32);
          }
          param0.c((int)((float)(-param2) / param9), (int)((float)(-param1) / param9), (int)((float)param0.pixelWidth / param9), (int)((float)param0.pixelHeight / param9));
          this.a(param5, var11_int, param3, 0, param4, (byte) 79, var12, 0);
          QuickChatPhraseRepository.popRasterState(-18862);
          CombatSandbox.a(param0, 3);
          var13.d(param2, param1, param8, param7);
          QuickChatPhraseRepository.popRasterState(-18862);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_7_0 = var11;
          stackIn_7_1 = new StringBuilder().append("oo.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_0 = stackIn_7_0;
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = stackIn_7_0;
            stackIn_12_2 = "{...}";
          }
          stackIn_15_0 = stackIn_12_0;
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_16_0 = stackIn_15_0;
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = stackIn_12_0;
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_16_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param5 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_16_0;
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (UnitLossCondition.field_a == null) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (param0 >= 508 &&
            635 > param0 &&
            param1 >= 299 &&
            param1 < 386) {
            stackIn_12_0 = 0;
            return stackIn_12_0;
          }
          if (param0 >= 508 &&
            param0 < 635 &&
            param1 >= 390 &&
            475 > param1) {
            return 1;
          }
          if (param2 == -387) {
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_22_0 = -86;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "oo.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RgbSprite var5 = null;
        String var6 = null;
        String var7 = null;
        BitmapFont var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_t == null &&
            null != kt.field_n) {
            this.field_t = new RgbSprite(622, 47);
            CombatSandbox.a(this.field_t, 3);
            SoftwareRaster.a(0, 0, 622, 47, 4540749, 65793);
            var2_int = 16448250;
            var3 = 10068666;
            var12 = DirectByteStorage.a(var3, var2_int, -60);
            var11 = var12;
            var9 = var11;
            this.a(var12, 622, this.field_c, 0, kt.field_n, (byte) 66, 47, 0);
            QuickChatPhraseRepository.popRasterState(-18862);
            this.field_m = new RgbSprite(475, 24);
            this.a(this.field_m, -4, 0, UnitModelPreview.field_h, kt.field_n, var9, -124, 24, 475, 0.75f);
            if (param0 >= -103) {
              var8 = (BitmapFont) null;
              this.a((int[]) null, -60, (String) null, -5, (BitmapFont) null, (byte) 31, 126, -81);
            }
            var10 = DirectByteStorage.a(526344, 526344, 126);
            var5 = new RgbSprite(121, 122);
            CombatSandbox.a(var5, 3);
            SoftwareRaster.a(0, 0, var5.pixelWidth, var5.pixelHeight / 2, 16180917, 16306250);
            SoftwareRaster.a(0, var5.pixelHeight / 2, var5.pixelWidth, var5.pixelHeight, 16306250, 15568919);
            var6 = rv.field_a;
            var7 = AnimationFrameSet.field_B;
            this.a(var5, -16, 0, var6, kt.field_n, var10, -112, var5.pixelHeight, var5.pixelWidth, 0.5f);
            this.a(var5, 20, 0, var7, kt.field_n, var10, -123, var5.pixelHeight, var5.pixelWidth, 0.5f);
            this.a(var5, 12 - kt.field_n.field_H + var5.pixelHeight / 2, 0, AnimationSequence.field_c[this.field_r], kt.field_n, var10, -125, var5.pixelHeight / 3, var5.pixelWidth, 0.699999988079071f);
            QuickChatPhraseRepository.popRasterState(-18862);
            this.field_b = new RgbSprite(121, 122);
            CombatSandbox.a(this.field_b, 3);
            var5.a(this.field_b.pixelWidth / 2, this.field_b.pixelHeight / 2, -2048, 4096);
            QuickChatPhraseRepository.popRasterState(-18862);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "oo.H(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        try {
          var7_int = -43 % ((param6 - 19) / 62);
          var8 = 0;
          if (CombatViewTransition.a(param3 - 1, param5, 2, (byte) -113) == 2 ||
            4 == CombatViewTransition.a(-1 + param3, param5, 2, (byte) -104)) {
            var8++;
          }
          if (CombatViewTransition.a(param3, 1 + param5, 2, (byte) -113) == 2 ||
            CombatViewTransition.a(param3, 1 + param5, 2, (byte) -100) == 4) {
            var8 += 2;
          }
          if ((var8 & 1) > 0) {
            ac.activeTerrainSprites[2].b(-32 + param4, param1 + 10, param0, param2);
          }
          if ((var8 & 2) > 0) {
            ac.activeTerrainSprites[2].b(8 + param4, 10 + param1, param0, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var7), "oo.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (rd.field_j != null) {
            oa.selectMusicWithDefaultProfile(90, rd.field_j.field_d);
          } else {
            if (SectorCacheStore.field_a != null) {
              oa.selectMusicWithDefaultProfile(102, SectorCacheStore.field_a.field_d);
            }
          }
          if (param0 != -387) {
            field_o = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "oo.D(" + param0 + ')');
        }
    }

    oo(java.applet.Applet param0, String param1, IndexedSprite[] param2, String[] param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_l = 0;
        this.field_s = true;
        this.field_f = 0;
        try {
          this.a(param1, (byte) 71, param2, param0, true, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("oo.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          stackIn_14_0 = stackIn_11_0;
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_15_0 = stackIn_14_0;
            stackIn_15_2 = "null";
          } else {
            stackIn_15_0 = stackIn_11_0;
            stackIn_15_2 = "{...}";
          }
          stackIn_18_0 = stackIn_15_0;
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_19_0 = stackIn_18_0;
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = stackIn_15_0;
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_d = new byte[250][];
        field_e = "Full screen";
        field_g = new gu();
        field_o = "This <%0> is currently wearing <%2>. Are you sure you wish to replace it with <%1>? The <%2> will be lost forever if you do this.";
        field_j = "Try again";
    }
}
