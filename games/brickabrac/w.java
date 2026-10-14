/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    private int field_h;
    private IndexedSprite[] field_q;
    private RgbSprite field_p;
    static RgbSprite field_r;
    private int field_b;
    private String field_f;
    private boolean field_a;
    private String[] field_d;
    static int field_k;
    static String field_m;
    private RgbSprite field_e;
    static int[] field_n;
    private int field_c;
    private int field_j;
    private MenuSelection field_g;
    private int field_o;
    private int field_i;
    private RgbSprite field_l;

    final int a(boolean param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_89_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0) {
            stackIn_3_0 = -9;
            return stackIn_3_0;
          }
          this.field_o = this.field_o + 65536;
          while (MouseInput.a(IsaacGenerator.field_c, -1, this.field_o) >= 65536) {
            this.field_i = this.field_i + 1;
            this.field_o = this.field_o - IsaacGenerator.field_c;
          }
          var3_int = -1;
          if (null != this.field_q) {
            var3_int = this.field_q.length;
          }
          if (var3_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (IsaacGenerator.field_f > this.field_j) {
              this.field_j = this.field_j + 1;
              if (IsaacGenerator.field_n < this.field_j && (null == this.field_q ||
                this.field_q[this.field_h] == null)) {
                this.field_j = this.field_j - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (IsaacGenerator.field_f <= this.field_j &&
                  null == this.field_q[(this.field_h + 1) % var3_int]) {
                  this.field_j = this.field_j - 1;
                }
              }
            }
            if (IsaacGenerator.field_f <= this.field_j) {
              this.field_b = this.field_h;
              this.field_j = this.field_j - IsaacGenerator.field_f;
              if (!this.field_a) {
                this.field_h = this.field_h - 1;
                if (this.field_h < 0) {
                  this.field_h = this.field_h + var3_int;
                }
              } else {
                this.field_h = this.field_h + 1;
                if (var3_int <= this.field_h) {
                  this.field_h = this.field_h - var3_int;
                }
              }
            }
            if (IsaacGenerator.field_n < this.field_j) {
              this.field_a = true;
            }
          }
          if (ll.field_c != null) {
            var4 = 0;
            if (BackgroundScene.pressedButton != 0 &&
              qo.pressY > 257 &&
              290 > qo.pressY) {
              if (tb.pressX > 9 &&
                tb.pressX < 82) {
                this.field_a = false;
                this.field_j = IsaacGenerator.field_f;
                var4 = 1;
              }
              if (tb.pressX > 558 &&
                tb.pressX < 631) {
                this.field_j = IsaacGenerator.field_f;
                var4 = 1;
                this.field_a = true;
              }
            }
            if (var4 == 0 &&
              IsaacGenerator.field_n < this.field_j &&
              qo.pressY > 257 &&
              qo.pressY < 290) {
              if (MusicPatch.pointerX > 9 &&
                MusicPatch.pointerX < 82) {
                this.field_j = IsaacGenerator.field_n;
              }
              if (MusicPatch.pointerX > 558 &&
                MusicPatch.pointerX < 631) {
                this.field_j = IsaacGenerator.field_n;
              }
            }
          }
          if (!param1) {
            stackIn_89_0 = 0;
            return stackIn_89_0;
          }
          this.field_g.updatePointer(this.a(po.pointerY, -636, MusicPatch.pointerX), 27479, this.a(qo.pressY, -636, tb.pressX));
          var4Lifetime1 = 0;
          if (this.field_g.isActivated((byte) 113)) {
            if (this.field_g.selectedIndex == 0) {
              var4Lifetime1 = 1;
            }
            if (this.field_g.selectedIndex == 1) {
              stackIn_75_0 = 2;
              return stackIn_75_0;
            }
          }
          if (ea.field_a) {
            while (jl.pollKeyEvent((byte) 5)) {
              var5 = this.a((byte) -120);
              if (var5 == 0) {
                continue;
              }
              stackIn_82_0 = var5;
              return stackIn_82_0;
            }
          }
          if (var4Lifetime1 == 0) {
            return 0;
          }
          this.b((byte) 9);
          stackIn_87_0 = 3;
          return stackIn_87_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var3), "w.H(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        IndexedSprite var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        IndexedSprite var6 = null;
        IndexedSprite var7 = null;
        IndexedSprite var2Lifetime1;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.field_q == null) {
            if (null != ch.field_c) {
              ch.field_c.a(cm.field_t, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
            }
            return;
          }
          var6 = this.field_q[this.field_h];
          var2 = var6;
          if (var2 == null) {
            if (null != ch.field_c) {
              ch.field_c.a(cm.field_t, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
            }
          } else {
            var6.drawTransparent(9, 58);
          }
          if (this.field_j < IsaacGenerator.field_n) {
            var7 = this.field_q[this.field_b];
            var2Lifetime1 = var7;
            if (var2Lifetime1 != null) {
              var3 = (60 + var7.canvasWidth) * this.field_j / IsaacGenerator.field_n;
              var4 = var3 - 30;
              if (this.field_a) {
                TextLineLayout.a(-256 * var4 / 30, var2Lifetime1, (byte) 101, 58, 9, (-var4 + var7.canvasWidth) * 256 / 30);
              } else {
                TextLineLayout.a(256 * (-var4 + var7.canvasWidth) / 30, var7, (byte) 106, 58, 9, -256 * var4 / 30);
              }
            }
          }
          if (!param0) {
            field_k = -125;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2_ref), "w.B(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RgbSprite var5 = null;
        String var6 = null;
        String var7 = null;
        int[] var16 = null;
        int[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l == null &&
            null != co.field_j) {
            this.field_l = new RgbSprite(622, 47);
            IndexedSpriteGeometry.pushSpriteRaster(-49, this.field_l);
            Rasterizer2D.fillVerticalGradient(0, 0, 622, 47, 4540749, 65793);
            var2_int = 16448250;
            var3 = 10068666;
            var16 = MusicVoiceMixer.a(param0 - 580, var2_int, var3);
            this.a(47, 0, this.field_f, var16, co.field_j, 622, 0, 0);
            sc.popRaster(param0 - 592);
            this.field_e = new RgbSprite(param0, 24);
            this.a(co.field_j, -4, 0.75f, (byte) 124, 475, va.field_c, var16, 24, this.field_e, 0);
            var17 = MusicVoiceMixer.a(-124, 526344, 526344);
            var5 = new RgbSprite(121, 122);
            IndexedSpriteGeometry.pushSpriteRaster(param0 ^ -388, var5);
            Rasterizer2D.fillVerticalGradient(0, 0, var5.width, var5.height / 2, 16180917, 16306250);
            Rasterizer2D.fillVerticalGradient(0, var5.height / 2, var5.width, var5.height, 16306250, 15568919);
            var6 = ByteStorage.field_a;
            var7 = ArchiveIndex.field_q;
            this.a(co.field_j, -16, 0.5f, (byte) 118, var5.width, var6, var17, var5.height, var5, 0);
            this.a(co.field_j, 20, 0.5f, (byte) 105, var5.width, var7, var17, var5.height, var5, 0);
            this.a(co.field_j, -co.field_j.ascent + (var5.height / 2 + 12), 0.699999988079071f, (byte) 62, var5.width, uo.field_e[this.field_c], var17, var5.height / 3, var5, 0);
            sc.popRaster(-119);
            this.field_p = new RgbSprite(121, 122);
            IndexedSpriteGeometry.pushSpriteRaster(-115, this.field_p);
            var5.e(this.field_p.width / 2, this.field_p.height / 2, -2048, 4096);
            sc.popRaster(-108);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "w.I(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          Rasterizer2D.fillVerticalGradient(9, 9, 622, 47, 4540749, 65793);
          Rasterizer2D.fillRectangle(9, 257, 622, 33, 2585);
          Rasterizer2D.fillVerticalGradient(9, 265, 622, 11, 2585, 1515566);
          var2_int = 0;
          var3 = 14;
          while (4 > var2_int) {
            Rasterizer2D.fillVerticalGradient(var3, 331, 117, 90, 460551, 3881787);
            var2_int++;
            var3 += 121;
          }
          if (param0 > -6) {
            this.a(111);
          }
          var2_intLifetime1 = 0;
          var3Lifetime1 = 299;
          while (2 > var2_intLifetime1) {
            Rasterizer2D.fillVerticalGradient(508, var3Lifetime1, 127, 42, 1130115, 3365268);
            Rasterizer2D.fillRectangle(508, 42 + var3Lifetime1, 127, 42, 12410);
            var3Lifetime1 += 91;
            var2_intLifetime1++;
          }
          this.a(true);
          if (BufferedFile.field_d != null &&
            BufferedFile.field_d.ensureIndex((byte) -127) &&
            BufferedFile.field_d.ensureGroupAvailableByName("members_expansion_screen", -28138) &&
            BufferedFile.field_d.ensureGroupAvailableByName("arialish12", -28138) &&
            BufferedFile.field_d.ensureGroupAvailableByName("pump32", -28138) &&
            fe.field_jb != null &&
            fe.field_jb.ensureIndex((byte) -127) &&
            fe.field_jb.ensureGroupAvailableByName("arialish12", -28138) &&
            fe.field_jb.ensureGroupAvailableByName("pump32", -28138)) {
            AchievementsScreen.field_J = uo.loadIndexedSpriteByName((byte) 29, BufferedFile.field_d, "frame", "members_expansion_screen");
            ll.field_c = pl.loadRgbSpriteByName("members_expansion_screen", "arrow", (byte) 111, BufferedFile.field_d);
            ch.field_c = TooltipSprite.a((byte) -37, "arialish12", BufferedFile.field_d, fe.field_jb, "");
            co.field_j = IntrusiveHashTable.a((byte) -107, "pump32", "", BufferedFile.field_d, fe.field_jb);
            MainMenuScreen.field_u = um.a("members_expansion_screen", "benefit_orbs", 1593955777, BufferedFile.field_d);
            LevelPack.field_e = um.a("members_expansion_screen", "button_text", 1593955777, BufferedFile.field_d);
            sf.field_V = bd.loadRgbSpritesByName("members_expansion_screen", "button_highlights", BufferedFile.field_d, (byte) -8);
            fe.field_jb = null;
            BufferedFile.field_d = null;
          }
          this.a(475);
          if (null == AchievementsScreen.field_J) {
            return;
          }
          this.field_p.drawTransparent(376, 339);
          this.field_l.drawTransparent(9, 9);
          AchievementsScreen.field_J.drawTransparent(0, 0);
          if (null != ll.field_c) {
            ll.field_c.drawTransparent(9, 257);
            ll.field_c.f(558, 257);
            if (po.pointerY > 257 &&
              po.pointerY < 290) {
              var2_intLifetime2 = 40 + (di.a((byte) 124, this.field_i << 4) * 40 >> 16);
              if (0 < var2_intLifetime2) {
                if (9 < MusicPatch.pointerX &&
                  MusicPatch.pointerX < 82) {
                  ll.field_c.f(8, 256, var2_intLifetime2);
                  ll.field_c.f(10, 256, var2_intLifetime2);
                  ll.field_c.f(8, 258, var2_intLifetime2);
                  ll.field_c.f(10, 258, var2_intLifetime2);
                } else {
                  if (558 < MusicPatch.pointerX &&
                    MusicPatch.pointerX < 631) {
                    ll.field_c.flipHorizontal();
                    ll.field_c.f(557, 256, var2_intLifetime2);
                    ll.field_c.f(559, 256, var2_intLifetime2);
                    ll.field_c.f(557, 258, var2_intLifetime2);
                    ll.field_c.f(559, 258, var2_intLifetime2);
                    ll.field_c.flipHorizontal();
                  }
                }
              }
            }
          }
          this.field_e.drawTransparent(16, 302);
          ch.field_c.a(this.field_d[this.field_h], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
          MainMenuScreen.field_u.drawTransparent(30, 330);
          ch.field_c.a(MatchCompleteScreen.field_y[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
          ch.field_c.a(MatchCompleteScreen.field_y[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
          ch.field_c.a(MatchCompleteScreen.field_y[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
          LevelPack.field_e.drawTransparent((-LevelPack.field_e.canvasWidth + 127) / 2 + 508, 315);
          if (0 == this.field_g.selectedIndex) {
            sf.field_V[0].drawTransparent(508, 299);
          } else {
            if (this.field_g.selectedIndex == 1) {
              sf.field_V[1].drawTransparent(508, 387);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "w.M(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int var2_int = 0;
        Throwable decompiledCaughtException = null;
        Exception var2 = null;
        RuntimeException var2_ref = null;
        try {
          try {
            ChocolateBackground.a(uc.e((byte) -86), 0);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (Exception) (Object) decompiledCaughtException;
            var2.printStackTrace();
          }
          var2_int = 82 % ((param0 - 72) / 51);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2_ref), "w.K(" + param0 + ')');
        }
    }

    final int a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          this.field_g.navigateVertical(-1);
          if (this.field_g.isActivated((byte) 113)) {
            if (this.field_g.selectedIndex == 0) {
              this.b((byte) 125);
              stackIn_5_0 = 3;
              return stackIn_5_0;
            }
            if (this.field_g.selectedIndex == 1) {
              stackIn_10_0 = 1;
              return stackIn_10_0;
            }
          }
          var2_int = 83 % ((param0 + 17) / 51);
          if (13 != MeshAttributeRecord.currentKeyCode) {
            stackIn_15_0 = 0;
            return stackIn_15_0;
          }
          stackIn_13_0 = 1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "w.L(" + param0 + ')');
        }
    }

    private final void a(TextFont param0, int param1, float param2, byte param3, int param4, String param5, int[] param6, int param7, RgbSprite param8, int param9) {
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
          var11_int = (int)((float)param4 / param2);
          if (param3 < 56) {
            this.field_o = -54;
          }
          var12 = (int)((float)param7 / param2);
          var13 = new RgbSprite(var11_int, var12);
          IndexedSpriteGeometry.pushSpriteRaster(-116, var13);
          param8.a((int)((float)(-param9) / param2), (int)((float)(-param1) / param2), (int)((float)param8.width / param2), (int)((float)param8.height / param2));
          this.a(var12, 0, param5, param6, param0, var11_int, 0, 0);
          sc.popRaster(-104);
          IndexedSpriteGeometry.pushSpriteRaster(-126, param8);
          var13.c(param9, param1, param4, param7);
          sc.popRaster(-93);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_7_0 = var11;
          stackIn_7_1 = new StringBuilder().append("w.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_0 = stackIn_7_0;
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = stackIn_7_0;
            stackIn_12_2 = "{...}";
          }
          stackIn_15_0 = stackIn_12_0;
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param6 == null) {
            stackIn_16_0 = stackIn_15_0;
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = stackIn_12_0;
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_16_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_16_0;
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param9).append(')').toString());
        }
    }

    private final void a(String param0, boolean param1, boolean param2, IndexedSprite[] param3, String[] param4, java.applet.Applet param5) {
        String var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          var7 = param5.getParameter("currency");
          if (var7 != null &&
            MeshAttributeRecord.a((CharSequence) ((Object) var7), -53)) {
            this.field_c = fl.a((CharSequence) ((Object) var7), -28734);
          } else {
            this.field_c = 2;
          }
          this.field_f = param0;
          this.field_g = new MenuSelection(2);
          this.field_q = param3;
          this.field_d = param4;
          if (this.field_q != null &&
            3 <= this.field_q.length) {
            if (param1) {
              return;
            }
            ea.field_a = param2;
            return;
          }
          throw new IllegalArgumentException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_18_0 = var7_ref;
          stackIn_18_1 = new StringBuilder().append("w.G(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_0 = stackIn_18_0;
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_0 = stackIn_22_0;
            stackIn_23_2 = "null";
          } else {
            stackIn_23_0 = stackIn_18_0;
            stackIn_23_2 = "{...}";
          }
          stackIn_26_0 = stackIn_23_0;
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_27_0 = stackIn_26_0;
            stackIn_27_2 = "null";
          } else {
            stackIn_27_0 = stackIn_23_0;
            stackIn_27_2 = "{...}";
          }
          stackIn_30_0 = stackIn_27_0;
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param5 == null) {
            stackIn_31_0 = stackIn_30_0;
            stackIn_31_2 = "null";
          } else {
            stackIn_31_0 = stackIn_27_0;
            stackIn_31_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0 >> 8;
          var4 = 255 & param0;
          if (param2 <= 90) {
            field_k = 6;
          }
          var5 = param1 >> 8;
          var6 = 255 & param1;
          stackIn_3_0 = (var4 * var6 >> 8) + (var3_int * param1 + var5 * var4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var3), "w.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(byte param0) {
        try {
          field_r = null;
          field_m = null;
          if (param0 < 82) {
            field_r = (RgbSprite) null;
          }
          field_n = null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "w.C(" + param0 + ')');
        }
    }

    final static void c(byte param0) {
        try {
          HuffmanCodec.field_h = null;
          if (param0 != 3) {
            field_k = -112;
          }
          SingleChildWidget.field_F = null;
          ik.field_j = false;
          QuickChatPhraseRegistry.field_k = null;
          ik.field_b = null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "w.N(" + param0 + ')');
        }
    }

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          if (param0 <= 4) {
            field_r = (RgbSprite) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3[-1 + (var2_int - var4)] = param1.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("w.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, String param2, int[] param3, TextFont param4, int param5, int param6, int param7) {
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
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          HighscorePackSelector.pushRaster(-99);
          if (param7 != 0) {
            return;
          }
          for (var9_int = param6; param0 > var9_int; var9_int++) {
            Rasterizer2D.setClip(param1, var9_int, param5, 1 + var9_int);
            var10 = var9_int * param3.length / param0;
            var11 = param3[param3.length - (var10 + 1)];
            param4.a(param2, param1, param6, param5, param0, var11, -1, 1, 1, 0);
          }
          sc.popRaster(-102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_12_0 = var9;
          stackIn_12_1 = new StringBuilder().append("w.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_0 = stackIn_12_0;
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_17_0 = stackIn_16_0;
            stackIn_17_2 = "null";
          } else {
            stackIn_17_0 = stackIn_12_0;
            stackIn_17_2 = "{...}";
          }
          stackIn_20_0 = stackIn_17_0;
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_21_0 = stackIn_20_0;
            stackIn_21_2 = "null";
          } else {
            stackIn_21_0 = stackIn_17_0;
            stackIn_21_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (null == AchievementsScreen.field_J) {
            stackIn_4_0 = -1;
            return stackIn_4_0;
          }
          if (param2 >= 508 &&
            param2 < 635 &&
            299 <= param0 &&
            param0 < 386) {
            return 0;
          }
          if (param1 != -636) {
            stackIn_14_0 = -75;
            return stackIn_14_0;
          }
          if (508 <= param2 &&
            param2 < 635 &&
            param0 >= 390 &&
            param0 < 475) {
            stackIn_22_0 = 1;
            return stackIn_22_0;
          }
          stackIn_24_0 = -1;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var4), "w.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    w(java.applet.Applet param0, String param1, IndexedSprite[] param2, boolean param3, String[] param4) {
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
        this.field_a = true;
        this.field_i = 0;
        this.field_o = 0;
        try {
          this.a(param1, false, param3, param2, param4, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("w.<init>(");
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
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_0 = stackIn_18_0;
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = stackIn_15_0;
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_m = "If you are not, please change your password to something more obscure!";
    }
}
