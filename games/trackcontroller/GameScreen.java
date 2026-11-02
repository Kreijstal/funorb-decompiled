/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameScreen {
    static int keyQueueWrite;
    static vl field_b;
    private int field_c;
    cd field_e;
    private int field_h;
    static boolean mouseMoved;
    private int field_d;
    private int field_g;

    final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        LevelData var7;
        int var8;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var8 = TrackController.field_F ? 1 : 0;
        ii.field_o = ii.field_o + 1;
        if (he.field_f[this.field_c] != null) {
          he.field_f[this.field_c].tick(true, 90);
        }
        var2 = this.b((byte) 125);
        var3 = mb.field_b - var2;
        if (param0 != -99) {
          return;
        }
        if (var3 > 0) {
          var3 = (var3 << 3) - var3 >> 3;
        } else {
          if (var3 < 0) {
            var3 = -(var3 + (-var3 << 3) >> 3);
          }
        }
        mb.field_b = var3 + var2;
        while (mh.e(127)) {
          this.d((byte) -55);
        }
        this.field_e.a(-118, this.a((byte) 6, kf.mouseX, fg.mouseY), this.a((byte) 6, db.clickX, wg.clickY));
        if (this.field_e.field_e != -1) {
          this.a(this.field_e.field_e, false, true);
        }
        if (this.field_c == 2 ||
          this.field_c == 3) {
          var4 = -1;
          var5 = -1;
          if (kf.mouseX >= 576 &&
            kf.mouseX < 602) {
            if (67 <= fg.mouseY &&
              fg.mouseY < 93) {
              var4 = 0;
            }
            if (fg.mouseY >= 431 &&
              457 > fg.mouseY) {
              var4 = 1;
            }
          }
          if (null != this.a(kf.mouseX, 2600, fg.mouseY)) {
            var4 = 2;
          }
          if (db.clickX >= 576 &&
            db.clickX < 602) {
            if (67 <= wg.clickY &&
              wg.clickY < 93) {
              var5 = 0;
            }
            if (wg.clickY >= 431 &&
              457 > wg.clickY) {
              var5 = 1;
            }
          }
          if (this.a(db.clickX, 2600, wg.clickY) != null) {
            var5 = 2;
          }
          if (uk.clickButton != 0) {
            RandomAccessCacheFile.field_b = var5;
          }
          if (!this.field_e.e(0) && (this.field_e.field_a ||
            mouseMoved)) {
            if (0 <= var4) {
              RandomAccessCacheFile.field_b = var4;
              this.field_e.field_a = true;
            } else {
              if (this.field_e.field_a) {
                RandomAccessCacheFile.field_b = -1;
              }
            }
          }
          if (this.field_e.d(0)) {
            var6 = qh.field_b.levelIndex;
            var7 = this.a(db.clickX, 2600, wg.clickY);
            if (var7 != null) {
              this.field_e.field_a = true;
              qh.field_b = var7;
            }
            var6 = var6 - qh.field_b.levelIndex;
            mb.field_b = mb.field_b - var6 * 26;
          }
          if (this.field_e.b(false)) {
            var6Lifetime1 = qh.field_b.levelIndex;
            if (RandomAccessCacheFile.field_b == 0 &&
              qh.field_b.levelIndex > 1) {
              qh.field_b = gj.levels[-2 + qh.field_b.levelIndex];
            } else {
              if (RandomAccessCacheFile.field_b == 1 &&
                gj.levels.length > qh.field_b.levelIndex) {
                qh.field_b = gj.levels[qh.field_b.levelIndex];
              }
            }
            var6Lifetime1 = var6Lifetime1 - qh.field_b.levelIndex;
            mb.field_b = mb.field_b - var6Lifetime1 * 26;
          }
        }
        if (uk.clickButton != 0) {
          this.field_g = wg.clickY;
          this.field_h = db.clickX;
        }
        var4Lifetime1 = -1;
        var5Lifetime1 = this.a((byte) 6, kf.mouseX, fg.mouseY);
        if (var5Lifetime1 != -1) {
          var4Lifetime1 = this.b(79, var5Lifetime1);
        }
        ProxySocketConnector.a(var4Lifetime1, (byte) 20);
    }

    private final int b(byte param0) {
        if (param0 != 125) {
          keyQueueWrite = 111;
        }
        int var2 = 0;
        if (8 > qh.field_b.levelIndex) {
          var2 = -208 + qh.field_b.levelIndex * 26;
        }
        if (!(qh.field_b.levelIndex <= 24)) {
          var2 = (-24 + qh.field_b.levelIndex) * 26;
        }
        return var2;
    }

    final static int a(byte param0) {
        if (param0 != -29) {
          field_b = (vl) null;
        }
        return mb.field_f;
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackIn_13_0Lifetime1;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          var3_int = param1;
          var4 = MovingBlock.field_q;
          while (var3_int < sa.field_I.length) {
            var5 = mj.field_b[var3_int];
            stackIn_13_0 = var5;
            if (stackIn_13_0 < 0) {
              var4 = var4 + dh.field_l;
            } else {
              var6 = ib.a(true, param1 ^ 10, sa.field_I[var3_int]);
              var7 = -(var6 >> 1) + sf.field_F;
              var4 = var4 + na.field_e;
              if (eb.a(-mb.field_c + var7, param0, param1 ^ 10, (mb.field_c << 1) + var6, var4, param2, ArchiveIndex.field_m + (of.field_f << 1))) {
                stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var4 = var4 + (ArchiveIndex.field_m + ((of.field_f << 1) + na.field_e));
            }
            var3_int++;
          }
          stackIn_13_0Lifetime1 = -1;
          return stackIn_13_0Lifetime1;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw LevelGrid.toClientException((Throwable) ((Object) var3), "mg.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final LevelData a(int param0, int param1, int param2) {
        int var4 = 0;
        param0 -= 359;
        param2 = param2 - (bk.font.field_u + 62);
        if (param0 >= 0 &&
          param0 < 182 &&
          param2 >= 0 &&
          param2 < 390) {
          var4 = qh.field_b.levelIndex - (-((param2 - (mb.field_b - 2600)) / 26) + 100 + 8);
          if (var4 >= 0 &&
            !(gj.levels.length <= var4)) {
            return gj.levels[var4];
          }
        }
        if (param1 == 2600) {
          return null;
        }
        return (LevelData) null;
    }

    private final void a(int param0, boolean param1, boolean param2) {
        this.a(param1, param2, param0, 390);
    }

    private final void c(byte param0) {
        int var4 = 0;
        int var3;
        int var5;
        int var6_int;
        Sprite var6;
        int var7;
        int var8;
        int var9;
        BitmapFont var10;
        BitmapFont var11;
        var9 = TrackController.field_F ? 1 : 0;
        if (param0 != -114) {
          this.field_d = 37;
        }
        var10 = bk.font;
        var11 = var10;
        UiWidget.field_z[2].e(-UiWidget.field_z[2].field_t + 640 >> 1, 1);
        var3 = 74;
        if (rd.field_b == 0) {
          var3 += 20;
          var3 = var3 + var11.a(tf.field_b, 34, -var11.field_q + var3, 572, 1000, 0, -1, 3, 0, 26) * 26;
          var3 += 26;
          var11.a(gh.field_e, 34, -var11.field_q + var3, 572, 1000, 0, -1, 3, 0, 26);
        } else {
          if (1 == rd.field_b) {
            for (var4 = 0; IntrusiveDeque.field_a.length > var4; var4++) {
              var5 = IntrusiveDeque.field_a[var4];
              if (3 == var5) {
                var6_int = ii.field_o / 5 % ActiveLevel.field_H.length;
                var5 = ActiveLevel.field_H[var6_int];
              }
              SoftwareRasterizer.f(46, -1 + var3, 28, 28, 16763904);
              var6 = ii.tileSprites[var5];
              var6.h(47, var3);
              var7 = 86;
              var8 = var10.a(MovingBlock.field_p[var4], var7, -6 + (var3 + 26) - var11.field_G, 606 - var7, 1000, 0, -1, 0, 0, 26);
              var3 = var3 + (var8 * 26 + 26);
            }
          }
        }
        var11.a(PacketBuffer.a((byte) 22, 2, 1 + rd.field_b), 606, 406, 0, -1);
    }

    private final void d(int param0) {
        int var2_int = 0;
        int var7 = 0;
        int stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        int stackIn_5_4 = 0;
        int stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_8_4;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        String var2;
        String[] var3_ref_String__;
        int var3;
        int var4;
        int var6;
        int var8;
        Object var9;
        Object var10;
        int var11;
        LevelView var12;
        int var13;
        int[] var17;
        int stackIn_54_0Lifetime1;
        int stackIn_54_1Lifetime1;
        var13 = TrackController.field_F ? 1 : 0;
        for (var2_int = 0; var2_int < 11; var2_int++) {
          stackIn_4_0 = 151;
          stackIn_4_1 = 48 + var2_int * 26 + 26;
          stackIn_4_2 = 208;
          stackIn_4_3 = 26;
          if ((var2_int & 1) == 0) {
            stackIn_5_4 = 9073738;
          } else {
            stackIn_5_4 = 6048056;
          }
          SoftwareRasterizer.c(stackIn_4_0, stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_5_4);
          stackIn_7_0 = 385;
          stackIn_7_1 = 26 * (var2_int + 1) + 48;
          stackIn_7_2 = 104;
          stackIn_7_3 = 26;
          if ((var2_int & 1) == 0) {
            stackIn_8_4 = 9073738;
          } else {
            stackIn_8_4 = 6048056;
          }
          SoftwareRasterizer.c(stackIn_7_0, stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_8_4);
        }
        SoftwareRasterizer.f(152, 75, 206, 284, 3352864);
        SoftwareRasterizer.f(386, 75, 102, 284, 3352864);
        if (jj.s(23)) {
          var2 = nd.field_I;
          bk.font.b(SecondaryNodeDequeIterator.field_b, 320, 406, 0, -1);
        } else {
          if (null == SpriteState.field_w) {
            SpriteState.field_w = hj.a(3, 10, 1, 10, (byte) -102);
          }
          if (SpriteState.field_w.field_o) {
            if (SpriteState.field_w.field_m != null) {
              var2 = nd.field_I;
              var3_ref_String__ = SpriteState.field_w.field_m[di.field_i];
              var4 = -1;
              var17 = SpriteState.field_w.field_n[di.field_i];
              var6 = 94;
              for (var7 = 0; var7 <= 10; var7++) {
                var8 = 0;
                var9 = null;
                stackIn_54_0 = ~var7;
                stackIn_54_1 = -11;
                boolean decompiledFrameRemainder0 = true;
                if (stackIn_54_0 != stackIn_54_1) {
                  if (var3_ref_String__[var7] != null) {
                    var2 = "";
                    var8 = var17[var7];
                    if (var4 < 0 &&
                      var3_ref_String__[var7] == IntrusiveDequeCursor.field_a &&
                      null != rk.field_bb &&
                      ~rk.field_bb.field_j == ~SpriteState.field_w.field_q[di.field_i][var7] &&
                      ua.field_L != null &&
                      var17[var7] == ua.field_L.score) {
                      var4 = var7;
                    }
                    var9 = var3_ref_String__[var7];
                  }
                } else {
                  decompiledFrameRemainder0 = !(0 <= var4);
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameRemainder0 = (null != ua.field_L))) {
                    var8 = ua.field_L.score;
                    var4 = var7;
                    var9 = IntrusiveDequeCursor.field_a;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (var9 != null) {
                    var10 = var9;
                    var11 = 0;
                    if (var7 == var4 &&
                      null == he.field_f[this.field_c]) {
                      var11 = 1;
                    }
                    if (var7 < 10) {
                      bk.font.a(var7 + 1 + ". ", 181, var6, var11, -1);
                    }
                    bk.font.c((String) (var10), 181, var6, var11, -1);
                    bk.font.a(Integer.toString(var8), 487, var6, var11, -1);
                    if (var4 == var7 &&
                      he.field_f[this.field_c] != null) {
                      var12 = he.field_f[this.field_c];
                      var12.a(468 + var12.field_a, var12.field_f + 26 * (1 + var7), 0, 4);
                      var12.a(104 + var12.field_a, 26 * (1 + var7) + var12.field_f, 0, 3);
                    }
                  }
                  var6 += 26;
                }
              }
            } else {
              var2 = oi.field_e;
            }
          } else {
            var2 = f.field_d;
          }
          bk.font.b(ad.field_s, 320, 406, 0, -1);
        }
        stackIn_54_0Lifetime1 = param0;
        stackIn_54_1Lifetime1 = -4;
        if (stackIn_54_0Lifetime1 > stackIn_54_1Lifetime1) {
          this.a(52, false, false);
        }
        var3 = 224;
        bk.font.b(var2, 255, var3, 0, -1);
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4) {
        boolean discarded$0 = false;
        int stackIn_5_0 = 0;
        String stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        Sprite[] stackIn_52_0 = null;
        int stackIn_53_1 = 0;
        int var6;
        String var7;
        int var8;
        int var9;
        Sprite var10;
        int var10_int;
        int var11;
        int var12;
        int var13;
        int var9Lifetime1;
        var13 = TrackController.field_F ? 1 : 0;
        var6 = this.b(66, param3);
        var7 = IntrusiveDeque.field_c[var6];
        cl.a(DualLinkNode.field_l, param1, 26, param2, 156, param4 ^ 5);
        if (var6 != 2 &&
          var6 != 3) {
          stackIn_5_0 = 0;
        } else {
          stackIn_5_0 = 1;
        }
        var8 = stackIn_5_0;
        if (var7 == null) {
          var9 = var6;
          if (12 != var9) {
            throw new IllegalStateException("Unexpected optionNo: " + var6);
          }
          if (1 != rd.field_b) {
            stackIn_11_0 = q.field_o;
          } else {
            stackIn_11_0 = l.field_n;
          }
          var7 = stackIn_11_0;
        }
        if (this.a((byte) 83, var6)) {
          stackIn_20_0 = (!param0) ? 0 : 1;
        } else {
          stackIn_20_0 = (!param0) ? 2 : 3;
        }
        var9Lifetime1 = stackIn_20_0;
        if (!param0) {
          if (var6 == 23 &&
            di.field_i == 0) {
            var9Lifetime1 = 6;
          }
          if (24 == var6 &&
            1 == di.field_i) {
            var9Lifetime1 = 6;
          }
          if (var6 == 25 &&
            di.field_i == 2) {
            var9Lifetime1 = 6;
          }
        }
        if (param4 != 1) {
          discarded$0 = this.a((byte) -90, -120);
        }
        if (var8 == 0) {
          if (26 == var6) {
            stackIn_52_0 = kg.field_e;
            stackIn_53_1 = (!fi.field_i) ? 1 : 0;
            var10 = stackIn_52_0[stackIn_53_1];
            var11 = bk.font.stringWidth(var7) - (-bk.font.charWidth(' ') - var10.field_s);
            var12 = param1 + (156 - var11 >> 1);
            bk.font.c(var7, var12, -2 + (bk.font.field_G + param2), var9Lifetime1, -1);
            var10.e(var12 - (-var11 + var10.field_s), (1 - var10.field_v + 26 >> 1) + param2);
          } else {
            bk.font.b(var7, 78 + param1, param2 - (-bk.font.field_G + 2), var9Lifetime1, -1);
          }
        } else {
          bk.font.c(var7, param1 + 13, bk.font.field_G + param2 - 2, var9Lifetime1, -1);
          if (!this.a((byte) 60, var6)) {
            stackIn_42_0 = (!param0) ? 4473924 : 12303291;
          } else {
            stackIn_42_0 = (param0) ? 8110658 : 15252224;
          }
          var10_int = stackIn_42_0;
          SoftwareRasterizer.c(param1 + 78, param2 + 13, 64, 2, var10_int);
          if (var6 == 2) {
            stackIn_45_0 = qd.field_d;
          } else {
            stackIn_45_0 = kc.field_b;
          }
          var11 = stackIn_45_0 >> 2;
          if (var11 < 0) {
            var11 = 0;
          }
          SoftwareRasterizer.c(param1 + (78 - (-var11 + 1)), -6 + param2 + 13, 3, 14, 8110658);
          SoftwareRasterizer.g(var11 + (78 + param1) - 2, 13 + param2, 2, 16580608);
          SoftwareRasterizer.g(2 + (param1 + 78 + var11), param2 + 13, 2, 16580608);
        }
    }

    private final int e(byte param0) {
        if (param0 <= 51) {
          return 61;
        }
        if ((this.field_c == 4 || this.field_c == 5 || this.field_c == 6 || this.field_c == 7) &&
          rd.field_b == 0) {
          return mf.field_a[this.field_c] + mf.field_d[this.field_c];
        }
        return mf.field_a[this.field_c];
    }

    private final boolean a(byte param0, int param1) {
        int var3;
        boolean stackIn_5_0 = false;
        var3 = 92 % ((-2 - param0) / 57);
        if (param1 != 1) {
          return true;
        }
        stackIn_5_0 = (qh.field_b != null) && ((ArchiveIndex.field_i + 1) >= qh.field_b.levelIndex);
        return stackIn_5_0;
    }

    private final int a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        if (param0 != 6) {
          this.field_d = 56;
        }
        if (this.field_c == 11) {
          param1 = param1 - mf.field_a[this.field_c];
          param2 = param2 - mf.field_h[this.field_c];
          if (0 <= param1 &&
            param2 >= 0) {
            var4 = param2 / mf.field_b[this.field_c];
            var5 = param1 / mf.field_d[this.field_c];
            param1 = param1 - var5 * mf.field_d[this.field_c];
            if (param1 >= 156) {
              return -1;
            }
            if (var4 == 0 &&
              3 > var5) {
              return var5;
            }
            if (1 == var4 &&
              var5 == 1) {
              return 3;
            }
            return -1;
          }
          return -1;
        }
        if (!mf.field_i[this.field_c]) {
          if (param1 >= mf.field_a[this.field_c] &&
            param1 < (mf.field_b[this.field_c] + mf.field_a[this.field_c])) {
            if (mf.field_h[this.field_c] > param2) {
              return -1;
            }
            var4Lifetime1 = (param2 - mf.field_h[this.field_c]) / mf.field_d[this.field_c];
            if (mf.field_f[this.field_c].length <= var4Lifetime1) {
              return -1;
            }
            if ((26 + mf.field_d[this.field_c] * var4Lifetime1 + mf.field_h[this.field_c]) >= param2) {
              return var4Lifetime1;
            }
            return -1;
          }
          return -1;
        }
        if (mf.field_h[this.field_c] <= param2 &&
          mf.field_b[this.field_c] + mf.field_h[this.field_c] > param2) {
          var4Lifetime2 = this.e((byte) 121);
          if (param1 < var4Lifetime2) {
            return -1;
          }
          var5Lifetime1 = (param1 - var4Lifetime2) / mf.field_d[this.field_c];
          if (mf.field_f[this.field_c].length <= var5Lifetime1) {
            return -1;
          }
          param1 = -(var5Lifetime1 * mf.field_d[this.field_c]) - var4Lifetime2 + param1;
          if (param1 >= 156) {
            return -1;
          }
          return var5Lifetime1;
        }
        return -1;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -8381) {
          GameScreen.a(-48);
        }
    }

    final void a(int param0, boolean param1) {
        int var3;
        var3 = 0;
        if ((this.field_c == 0 ||
          this.field_c == 1) && this.field_e.field_e != -1) {
          var3 = this.field_e.field_e;
        }
        if ((this.field_c == 12 ||
          this.field_c == 13) &&
          (this.field_e.field_e != -1 &&
          ib.field_a != -1)) {
          var3 = this.field_e.field_e;
        }
        if (this.field_c == 4 ||
          this.field_c == 5 ||
          this.field_c == 6 ||
          this.field_c == 7) {
          var3 = 1;
        }
        this.field_e.a(var3, this.a((byte) 6, kf.mouseX, fg.mouseY), param1, 120);
        if (this.field_c == 2 ||
          3 == this.field_c) {
          mb.field_b = this.b((byte) 125);
        }
        if (param0 != 10412) {
          this.c(-110);
        }
    }

    private final void d(byte param0) {
        boolean stackIn_6_0 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = TrackController.field_F ? 1 : 0;
        if (2 <= LevelGrid.field_j &&
          1 == kg.field_d) {
          stackIn_6_0 = !(nf.field_f);
          nf.field_f = stackIn_6_0;
        }
        var2 = 86 / ((22 - param0) / 62);
        if (kg.field_d == 13 &&
          -2147483648 != mf.field_e[this.field_c]) {
          si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
          sc.field_g = mf.field_e[this.field_c];
        }
        boolean decompiledFrameRemainder0 = true;
        if (11 == this.field_c) {
          if (!this.field_e.e(0)) {
            if (kg.field_d == 96) {
              if (0 >= this.field_e.field_e) {
                this.field_e.field_e = 2;
              } else {
                if (3 != this.field_e.field_e) {
                  this.field_e.field_e = this.field_e.field_e - 1;
                }
              }
              this.field_e.field_a = false;
            } else {
              if (kg.field_d != 97) {
                if (99 == kg.field_d) {
                  if (-1 != this.field_e.field_e &&
                    this.field_e.field_e != 3) {
                    this.field_e.field_e = 3;
                  } else {
                    this.field_e.field_e = di.field_i;
                  }
                  this.field_e.field_a = false;
                } else {
                  if (kg.field_d == 98) {
                    if (3 == this.field_e.field_e) {
                      this.field_e.field_e = di.field_i;
                    } else {
                      this.field_e.field_e = 3;
                    }
                    this.field_e.field_a = false;
                  }
                }
              } else {
                if (2 > this.field_e.field_e) {
                  this.field_e.field_e = this.field_e.field_e + 1;
                } else {
                  if (2 == this.field_e.field_e) {
                    this.field_e.field_e = 0;
                  }
                }
                this.field_e.field_a = false;
              }
            }
          }
          this.field_e.f(0);
        } else {
          if (this.field_c != 2 &&
            3 != this.field_c) {
            if (!mf.field_i[this.field_c]) {
              this.field_e.b((byte) -76);
            } else {
              this.field_e.a((byte) 20);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_e.e(0)) {
              this.field_e.f(0);
            } else {
              if (kg.field_d != 97 && (kg.field_d != 80 ||
                ni.keyDown[81])) {
                if (kg.field_d != 96 && (kg.field_d != 80 ||
                  !ni.keyDown[81])) {
                  if (this.field_e.field_e >= 0) {
                    this.field_e.b((byte) -113);
                  } else {
                    var3 = qh.field_b.levelIndex;
                    if (kg.field_d == 98) {
                      RandomAccessCacheFile.field_b = 2;
                      if (qh.field_b.levelIndex > 1) {
                        qh.field_b = gj.levels[-2 + qh.field_b.levelIndex];
                      }
                      this.field_e.field_a = false;
                    }
                    if (99 == kg.field_d) {
                      RandomAccessCacheFile.field_b = 2;
                      if (gj.levels.length > qh.field_b.levelIndex) {
                        qh.field_b = gj.levels[qh.field_b.levelIndex];
                      }
                      this.field_e.field_a = false;
                    }
                    if (RandomAccessCacheFile.field_b == 0 && (kg.field_d == 83 ||
                      kg.field_d == 84)) {
                      if (qh.field_b.levelIndex > 1) {
                        qh.field_b = gj.levels[-2 + qh.field_b.levelIndex];
                      }
                      this.field_e.field_a = false;
                    }
                    if (RandomAccessCacheFile.field_b == 1 && (kg.field_d == 83 ||
                      kg.field_d == 84)) {
                      if (qh.field_b.levelIndex < gj.levels.length) {
                        qh.field_b = gj.levels[qh.field_b.levelIndex];
                      }
                      this.field_e.field_a = false;
                    }
                    if (2 != RandomAccessCacheFile.field_b) {
                      var3 = var3 - qh.field_b.levelIndex;
                      mb.field_b = mb.field_b - 26 * var3;
                    } else {
                      if (kg.field_d == 104) {
                        var4 = qh.field_b.levelIndex - 9;
                        if (var4 < 0) {
                          var4 = 0;
                        }
                        qh.field_b = gj.levels[var4];
                        this.field_e.field_a = false;
                      }
                      if (kg.field_d == 105) {
                        var4Lifetime1 = 7 + qh.field_b.levelIndex;
                        if (var4Lifetime1 >= gj.levels.length) {
                          var4Lifetime1 = gj.levels.length - 1;
                        }
                        qh.field_b = gj.levels[var4Lifetime1];
                        this.field_e.field_a = false;
                      }
                      if (kg.field_d == 102) {
                        this.field_e.field_a = false;
                        qh.field_b = gj.levels[0];
                      }
                      if (kg.field_d == 103) {
                        qh.field_b = gj.levels[gj.levels.length - 1];
                        this.field_e.field_a = false;
                      }
                      if (84 == kg.field_d &&
                        1 + ArchiveIndex.field_i >= qh.field_b.levelIndex) {
                        si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                        SpriteState.field_w = null;
                        rk.field_bb = null;
                        ua.field_L = new ActiveLevel();
                        sc.field_g = -1;
                        oe.field_e = 0;
                      }
                      var3 = var3 - qh.field_b.levelIndex;
                      mb.field_b = mb.field_b - 26 * var3;
                    }
                  }
                } else {
                  if (2 != RandomAccessCacheFile.field_b) {
                    RandomAccessCacheFile.field_b = 2;
                    this.field_e.field_e = -1;
                  } else {
                    RandomAccessCacheFile.field_b = -1;
                    this.field_e.field_e = 0;
                  }
                  this.field_e.field_a = false;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (this.field_e.field_e < 0) {
                  RandomAccessCacheFile.field_b = -1;
                  this.field_e.field_e = 0;
                } else {
                  RandomAccessCacheFile.field_b = 2;
                  this.field_e.field_e = -1;
                }
                this.field_e.field_a = false;
              }
            }
          }
        }
        if (this.field_e.field_e != -1) {
          this.a(this.field_e.field_e, false, false);
        }
    }

    private final void a(boolean param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        boolean stackOut_8_0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var3Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int stackIn_40_0Lifetime1;
        var10 = TrackController.field_F ? 1 : 0;
        var3 = 122;
        var4 = 128;
        if (!param0) {
          stackIn_3_0 = th.field_l;
        } else {
          stackIn_3_0 = oe.field_e;
        }
        var5 = stackIn_3_0;
        if (param0) {
          var6 = sc.a(var5, param1 - 17461);
          if (var6 <= 8) {
            var3 = var3 + (-var6 + 8) * 52 / 2;
          }
        }
        var6Lifetime1 = 0;
        var7 = -1;
        var8 = 0;
        while (var8 < wa.field_k.length) {
          stackOut_8_0 = this.a(var8, 10);
          stackIn_40_0 = stackOut_8_0 ? 1 : 0;
          stackIn_9_0 = stackOut_8_0;
          boolean decompiledFrameRemainder0 = true;
          if (stackIn_9_0) {
            if ((1 << var8 & var5) != 0) {
              bb.field_b[var8].b(var3, var4);
            } else {
              decompiledFrameRemainder0 = !(param0);
              if (decompiledFrameRemainder0) {
                vj.field_a.b(var3, var4);
              }
            }
            if (decompiledFrameRemainder0) {
              if (kf.mouseX >= var3 &&
                kf.mouseX <= (32 + var3) &&
                fg.mouseY >= var4 &&
                fg.mouseY <= (32 + var4)) {
                var7 = var8;
                SoftwareRasterizer.d(-2 + var3, var4 - 2, 36, 36, 6, 16711680);
              }
              if (-1 != this.field_h &&
                var3 <= this.field_h &&
                this.field_h <= (var3 + 32) &&
                var4 <= this.field_g &&
                (32 + var4) >= this.field_g) {
                this.field_h = -1;
                if (~var8 != ~this.field_d) {
                  this.field_d = var8;
                } else {
                  this.field_d = -1;
                }
              }
              if (var8 == this.field_d) {
                SoftwareRasterizer.d(var3 - 2, -2 + var4, 36, 36, 6, 15252224);
              }
              incrementValue$0 = var6Lifetime1;
              var6Lifetime1++;
              if (incrementValue$0 == 7) {
                stackIn_37_0 = (!this.a(12, 10)) ? 4 : 5;
                var9 = stackIn_37_0;
                var4 -= 52;
                var3 = 122 + (416 - var9 * 52 >> 1);
              } else {
                var3 += 52;
              }
            }
          }
          var8++;
        }
        stackIn_40_0Lifetime1 = param1;
        if (stackIn_40_0Lifetime1 != 17460) {
          return;
        }
        if (this.field_d > -1) {
          var7 = this.field_d;
        }
        if (var7 != -1) {
          bk.font.b(wa.field_k[var7], 320, 224, 0, -1);
          if ((1 << var7 & var5) != 0) {
            bk.font.b(mb.field_a, 320, 250, 0, -1);
          } else {
            bk.font.b(kb.field_c, 320, 250, 7, -1);
          }
          if ((var5 & 1 << var7) != 0) {
            bb.field_b[var7].e(256, 282);
          } else {
            vj.field_a.e(256, 282);
          }
          bk.font.a(gj.field_b[var7], 50, 302 - bk.font.field_G, 201, 1000, 0, -1, 0, 0, 26);
          var8Lifetime1 = 302;
          bk.font.c(kc.field_a + 100 * rd.field_f[var7], 410, var8Lifetime1, 0, -1);
          var3Lifetime1 = 410;
          var8Lifetime1 += 26;
          bk.font.c(di.field_l, var3Lifetime1, var8Lifetime1, 0, -1);
          var3Lifetime1 = var3Lifetime1 + bk.font.stringWidth(di.field_l);
          for (var9Lifetime1 = 0; rd.field_f[var7] > var9Lifetime1; var9Lifetime1++) {
            mc.field_E.e(var3Lifetime1, -bk.font.field_G + var8Lifetime1);
            var3Lifetime1 = var3Lifetime1 + mc.field_E.field_t / 3;
          }
          return;
        }
        bk.font.b(NodeHashTable.field_a, 320, 302, 0, -1);
        if (jj.s(39)) {
          bk.font.b(SecondaryNodeDequeIterator.field_b, 320, 354, 0, -1);
        }
        return;
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = TrackController.field_F ? 1 : 0;
        if (param0 < 46) {
          this.field_c = -79;
        }
        var3 = mf.field_f[this.field_c][param1];
        if (this.field_c == 4) {
          if (rd.field_b == 0) {
            if (param1 == 0) {
              var3 = 10;
            } else {
              if (param1 == 1) {
                var3 = 12;
              }
            }
          } else {
            if (param1 == 0) {
              var3 = 12;
            } else {
              if (param1 == 1) {
                var3 = 10;
              }
            }
          }
        }
        if (5 == this.field_c) {
          if (rd.field_b != 0) {
            if (param1 != 0) {
              if (param1 == 1) {
                var3 = 11;
              }
            } else {
              var3 = 12;
            }
          } else {
            if (param1 == 0) {
              var3 = 11;
            } else {
              if (param1 == 1) {
                var3 = 12;
              }
            }
          }
        }
        if (6 == this.field_c) {
          if (rd.field_b == 0) {
            if (param1 != 0) {
              if (1 == param1) {
                var3 = 12;
              }
            } else {
              var3 = 14;
            }
          } else {
            if (param1 != 0) {
              if (param1 == 1) {
                var3 = 14;
              }
            } else {
              var3 = 12;
            }
          }
        }
        if (this.field_c == 7) {
          if (0 == rd.field_b) {
            if (0 != param1) {
              if (1 == param1) {
                var3 = 12;
              }
            } else {
              var3 = 15;
            }
          } else {
            if (0 == param1) {
              var3 = 12;
            } else {
              if (param1 == 1) {
                var3 = 15;
              }
            }
          }
        }
        return var3;
    }

    private final boolean a(int param0, int param1) {
        boolean stackIn_9_0 = false;
        if (param1 != 10) {
          field_b = (vl) null;
        }
        if (0 != (th.field_l & 1 << param0)) {
          return true;
        }
        stackIn_9_0 = (param0 != 12) || (ui.a(0, true));
        return stackIn_9_0;
    }

    final void b(int param0) {
        int var10 = 0;
        boolean stackIn_33_1 = false;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        BitmapFont stackIn_99_0 = null;
        boolean stackIn_100_1 = false;
        boolean stackIn_103_2 = false;
        boolean stackIn_106_3 = false;
        BitmapFont stackIn_108_0 = null;
        boolean stackIn_109_1 = false;
        boolean stackIn_112_2 = false;
        boolean stackIn_115_3 = false;
        BitmapFont stackIn_117_0 = null;
        boolean stackIn_118_1 = false;
        int stackIn_120_2 = 0;
        boolean stackIn_121_3 = false;
        boolean stackIn_124_4;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int var2;
        int var3;
        int var4;
        String var4_ref_String;
        Object var5;
        int var6;
        int var7;
        int var8;
        LevelData[] var9;
        LevelData var11;
        String var12;
        int var13;
        int var14;
        int var4Lifetime1;
        Object var5Lifetime1;
        String var12Lifetime1;
        String var12Lifetime2;
        var14 = TrackController.field_F ? 1 : 0;
        if (this.field_c != 12 &&
          this.field_c != 13) {
          if (this.field_c != 2 &&
            this.field_c != 3) {
            if (this.field_c == 15) {
              cl.a(nd.field_L, 37, 254, 118, 566, 4);
            } else if (this.field_c != 8 &&
              this.field_c != 9 &&
              16 != this.field_c) {
              if (null == he.field_f[this.field_c]) {
                cl.a(nd.field_L, 11, 436, 38, 618, 4);
              } else {
                cl.a(ha.field_m, 11, 436, 38, 618, 4);
                if (this.field_c == 10 ||
                  this.field_c == 11) {
                  SoftwareRasterizer.e(19, 384, 621, 466);
                  cl.a(nd.field_L, 11, 436, 38, 618, param0 ^ -5);
                  SoftwareRasterizer.d();
                }
              }
            } else {
              cl.a(nd.field_L, 102, 124, 56, 436, 4);
              cl.a(nd.field_L, 11, 280, 194, 618, 4);
            }
          } else {
            cl.a(nd.field_L, -10 + this.e((byte) 62), 20 + mf.field_f[this.field_c].length * mf.field_d[this.field_c], -10 + mf.field_h[this.field_c], 176, 4);
            cl.a(nd.field_L, 349, 410, 52 + bk.font.field_u, 212, 4);
          }
        } else {
          cl.a(ha.field_m, 6, 436, 38, 436, 4);
          cl.a(nd.field_L, 457, 124, 10, 176, param0 ^ -5);
          cl.a(nd.field_L, 457, mf.field_f[this.field_c].length * 26 + 20, 219, 176, param0 ^ -5);
        }
        if (null != he.field_f[this.field_c]) {
          he.field_f[this.field_c].a(true);
        }
        if (this.field_c == 12 ||
          13 == this.field_c) {
          ua.field_L.a(false);
        }
        var2 = this.e((byte) 59);
        var3 = mf.field_h[this.field_c];
        var4 = 0;
        if (param0 != -1) {
          return;
        }
        scanLoop1: while (true) {
          boolean decompiledFrameRemainder0 = true;
          if (mf.field_f[this.field_c].length > var4) {
            stackIn_127_1 = ~var4;
            stackIn_127_2 = ~this.field_e.field_e;
            stackIn_33_1 = (stackIn_127_1 == stackIn_127_2);
            this.a(stackIn_33_1, var2, var3, var4, 1);
            if (!mf.field_i[this.field_c]) {
              var3 = var3 + mf.field_d[this.field_c];
            } else {
              var2 = var2 + mf.field_d[this.field_c];
            }
            if (this.field_c == 11 &&
              2 == var4) {
              var2 = var2 - (mf.field_d[this.field_c] << 1);
              var3 = var3 + mf.field_b[this.field_c];
            }
            var4++;
            continue;
          }
          if (this.field_c != 0 &&
            this.field_c != 1) {
            if (this.field_c != 13 &&
              this.field_c != 12) {
              if (10 != this.field_c &&
                11 != this.field_c) {
                if (this.field_c != 8 &&
                  9 != this.field_c) {
                  if (this.field_c == 16) {
                    UiWidget.field_z[5].e(640 - UiWidget.field_z[5].field_t >> 1, 1);
                    this.a(true, param0 + 17461);
                    break scanLoop1;
                  }
                  if (this.field_c != 15) {
                    if (this.field_c != 4 &&
                      5 != this.field_c &&
                      this.field_c != 6 &&
                      this.field_c != 7) {
                      if (this.field_c != 2 &&
                        this.field_c != 3) {
                        if (this.field_c != 14) {
                          break scanLoop1;
                        }
                        var4 = 154 - (-bk.font.field_G + 2);
                        bk.font.b(ui.field_n, 320, var4, 5, -1);
                        break scanLoop1;
                      }
                      UiWidget.field_z[3].e(-UiWidget.field_z[3].field_t + 640 >> 1, 1);
                      if (qh.field_b.levelIndex > (1 + ArchiveIndex.field_i)) {
                        cl.a(nd.field_L, 90, 254, 57, 176, 4);
                        if (!jj.s(param0 + 54)) {
                          var4_ref_String = Archive.field_a;
                          var12 = var4_ref_String;
                          var12Lifetime2 = var4_ref_String;
                        } else {
                          var4_ref_String = GameKeyHandler.field_f;
                        }
                        bk.font.a(var4_ref_String, 100, 67, 156, 234, 0, -1, 1, 1, 26);
                      } else {
                        qh.field_b.a(100, (byte) -127, 67);
                        fd.field_d.e(-367, -162);
                      }
                      cl.a(nd.field_L, 566, 46, 57, 46, param0 + 5);
                      stackIn_73_0 = (RandomAccessCacheFile.field_b != 0) ? 15252224 : 8110658;
                      var4 = stackIn_73_0;
                      ii.tileSprites[52].c(576, 67, var4);
                      cl.a(nd.field_L, 566, 46, 421, 46, 4);
                      stackIn_76_0 = (RandomAccessCacheFile.field_b != 1) ? 15252224 : 8110658;
                      var4 = stackIn_76_0;
                      ii.tileSprites[53].c(576, 431, var4);
                      var5 = this.a(kf.mouseX, 2600, fg.mouseY);
                      var6 = 269 - (-(26 * (1 - qh.field_b.levelIndex)) - mb.field_b);
                      var7 = 359;
                      var8 = 62 + bk.font.field_u;
                      SoftwareRasterizer.e(var7, var8, var7 + 182 + 10, var8 + 390);
                      var9 = gj.levels;
                      for (var10 = 0; var9.length > var10; var10++) {
                        var11 = var9[var10];
                        var12Lifetime1 = var11.name;
                        if (var11.levelIndex > (ArchiveIndex.field_i + 1)) {
                          var12Lifetime1 = qg.field_a;
                        }
                        var13 = 0;
                        if (var11 == qh.field_b) {
                          var13 = 6;
                        }
                        if (!this.field_e.field_a &&
                          this.field_e.field_e == -1 &&
                          RandomAccessCacheFile.field_b == 2 &&
                          var11 == qh.field_b) {
                          var13 = 1;
                        }
                        if (this.field_e.field_a &&
                          var5 == var11) {
                          var13 = 1;
                        }
                        bk.font.c(var12Lifetime1, 390, var6, var13, -1);
                        bk.font.a(var11.levelIndex + ". ", 390, var6, var13, -1);
                        var6 += 26;
                      }
                      SoftwareRasterizer.d();
                      break scanLoop1;
                    }
                    this.c((byte) -114);
                    break scanLoop1;
                  }
                  UiWidget.field_z[0].e(-UiWidget.field_z[0].field_t + 640 >> 1, 1);
                  bk.font.b(qg.field_b, 320, bk.font.field_G + 154, 5, -1);
                  stackIn_99_0 = bk.font;
                  stackIn_100_1 = (0 != oe.field_e);
                  stackIn_103_2 = (0 != ua.field_L.score);
                  stackIn_106_3 = (0 != ua.field_L.score);
                  ((BitmapFont) (Object) stackIn_99_0).b(vj.a(stackIn_100_1, stackIn_103_2, stackIn_106_3, 118), 320, 180 + bk.font.field_G, 5, -1);
                  stackIn_108_0 = bk.font;
                  stackIn_109_1 = (0 != ua.field_L.score);
                  stackIn_112_2 = (oe.field_e != 0);
                  stackIn_115_3 = (ua.field_L.score != 0);
                  ((BitmapFont) (Object) stackIn_108_0).b(IntrusiveNode.a(stackIn_109_1, stackIn_112_2, stackIn_115_3, 12105912), 320, bk.font.field_G + 258, 5, -1);
                  stackIn_117_0 = bk.font;
                  stackIn_118_1 = (ua.field_L.score != 0);
                  stackIn_120_2 = -98;
                  stackIn_121_3 = (oe.field_e != 0);
                  stackIn_124_4 = (ua.field_L.score != 0);
                  ((BitmapFont) (Object) stackIn_117_0).b(ProxySocketConnector.$cfr$intArgs$a$feb7e63b59d8(stackIn_118_1, stackIn_120_2, stackIn_121_3, stackIn_124_4), 320, bk.font.field_G + 310, 5, -1);
                  break scanLoop1;
                }
                UiWidget.field_z[1].e(-UiWidget.field_z[1].field_t + 640 >> 1, 1);
                stackIn_127_1 = 0;
                stackIn_127_2 = 17460;
                decompiledFrameRemainder0 = false;
              }
              else {
                UiWidget.field_z[4].e(-UiWidget.field_z[4].field_t + 640 >> 1, 1);
                this.d(-25);
                break scanLoop1;
              }
            }
            if (decompiledFrameRemainder0) {
              UiWidget.field_z[0].e(41, 1);
              break scanLoop1;
            }
          }
          if (decompiledFrameRemainder0) {
            UiWidget.field_z[0].e(640 - UiWidget.field_z[0].field_t >> 1, 1);
            break scanLoop1;
          }
          this.a(stackIn_127_1 != 0, stackIn_127_2);
          break;
        }
        var4Lifetime1 = SpriteState.g(1);
        var5Lifetime1 = null;
        if (23 == var4Lifetime1) {
          var5Lifetime1 = vi.field_a;
        }
        if (var4Lifetime1 == 24) {
          var5Lifetime1 = NodeHashTable.field_i;
        }
        if (var4Lifetime1 == 25) {
          var5Lifetime1 = ud.field_b;
        }
        if (var5Lifetime1 != null) {
          vl.a(-21173, (String) (var5Lifetime1));
        }
        return;
    }

    private final void a(boolean param0, boolean param1, int param2, int param3) {
        boolean stackIn_79_0 = false;
        int stackIn_155_0 = 0;
        int stackIn_156_1 = 0;
        int stackIn_174_0 = 0;
        int stackIn_175_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var7Lifetime1;
        var8 = TrackController.field_F ? 1 : 0;
        var5 = this.b(121, param2);
        if (!this.a((byte) 67, var5) &&
          var5 != 13) {
          return;
        }
        if (param3 != 390) {
          this.d(0);
        }
        boolean decompiledFrameRemainder0 = true;
        var6 = var5;
        if (var6 == 0) {
          if (this.field_e.b(false)) {
            si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
            if (2 <= LevelGrid.field_j &&
              ni.keyDown[48]) {
              ArchiveIndex.field_i = 31;
            }
            if (this.field_c != 0) {
              if (this.field_c != 1) {
                throw new RuntimeException();
              }
              sc.field_g = 3;
            } else {
              sc.field_g = 2;
            }
          }
        } else {
          if (var6 == 1) {
            if (this.field_e.b(false)) {
              si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
              rk.field_bb = null;
              SpriteState.field_w = null;
              ua.field_L = new ActiveLevel();
              oe.field_e = 0;
              sc.field_g = -1;
            }
          } else {
            if (13 == var6) {
              if (!(!this.field_e.b(false))) {
                si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                if (og.field_rb != null) {
                  oj.a(-127);
                } else {
                  var6 = param1 ? 1 : 0;
                  oi.a(26, DualLinkNode.field_l, 26, bk.font, bk.font, 10, 320, 20, 240, DualLinkNode.field_l, -3748, var6 != 0, 18, 0, 0);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (var6 == 4) {
                if (this.field_e.b(false)) {
                  si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                  sc.field_g = -1;
                }
              } else {
                if (21 != var6) {
                  if (22 == var6) {
                    if (!(!this.field_e.b(false))) {
                      si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                      sc.field_g = 11;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (var6 == 26) {
                      if (!(!this.field_e.b(false))) {
                        si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                        stackIn_79_0 = !(fi.field_i);
                        fi.field_i = stackIn_79_0;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (var6 == 14) {
                        if (this.field_e.b(false)) {
                          si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                          sc.field_g = 12;
                        }
                      } else {
                        if (var6 == 15) {
                          if (this.field_e.b(false)) {
                            si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                            sc.field_g = 13;
                          }
                        } else {
                          if (var6 == 23) {
                            if (!(!this.field_e.b(false))) {
                              si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                              di.field_i = 0;
                            }
                            decompiledFrameRemainder0 = false;
                          }
                          else {
                            if (var6 == 24) {
                              if (!(!this.field_e.b(false))) {
                                si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                di.field_i = 1;
                              }
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              if (var6 != 25) {
                                if (6 != var6) {
                                  if (var6 != 7) {
                                    if (var6 != 8) {
                                      if (9 == var6) {
                                        if (!(!this.field_e.b(false))) {
                                          si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                          rd.field_b = 0;
                                          sc.field_g = 7;
                                        }
                                        decompiledFrameRemainder0 = false;
                                      }
                                      else {
                                        if (10 != var6) {
                                          if (var6 == 11) {
                                            if (!(!this.field_e.b(false))) {
                                              si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                              sc.field_g = 1;
                                            }
                                            decompiledFrameRemainder0 = false;
                                          }
                                          else {
                                            if (var6 != 20) {
                                              if (var6 == 28) {
                                                if (!(!this.field_e.b(false))) {
                                                  si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                                  if (og.field_rb != null) {
                                                    oj.a(param3 ^ -499);
                                                  }
                                                  of.a(-80, CachedArchiveSource.b((byte) 77));
                                                }
                                                decompiledFrameRemainder0 = false;
                                              }
                                              else {
                                                if (12 != var6) {
                                                  if (var6 != 17) {
                                                    if (var6 != 18) {
                                                      if (19 == var6) {
                                                        if (this.field_e.b(false)) {
                                                          si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                                          if (this.field_c == 8) {
                                                            ad.a(this.field_c, 9, (byte) -120);
                                                          } else {
                                                            if (10 == this.field_c) {
                                                              ad.a(this.field_c, 11, (byte) -109);
                                                            } else {
                                                              if (this.field_c == 15) {
                                                                ad.a(this.field_c, -3, (byte) -47);
                                                              } else {
                                                                if (2 != this.field_c) {
                                                                  throw new RuntimeException();
                                                                }
                                                                ad.a(this.field_c, 3, (byte) -78);
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        if (var6 == 16) {
                                                          if (!(!this.field_e.b(false))) {
                                                            si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                                            af.a(CachedArchiveSource.b((byte) 77), (byte) -9);
                                                          }
                                                          decompiledFrameRemainder0 = false;
                                                        }
                                                        else {
                                                          if (var6 == 5) {
                                                            if (!(!this.field_e.b(false))) {
                                                              si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                                              ua.field_L.c(3, 117);
                                                            }
                                                            decompiledFrameRemainder0 = false;
                                                          }
                                                          else {
                                                            if (var6 == 27) {
                                                              if (this.field_e.b(false)) {
                                                                si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                                                if (jj.s(49)) {
                                                                  if ((ua.field_L.score | oe.field_e) == 0) {
                                                                    sc.field_g = 0;
                                                                  } else {
                                                                    sc.field_g = 15;
                                                                  }
                                                                  decompiledFrameRemainder0 = false;
                                                                }
                                                                else {
                                                                  if (oe.field_e != 0) {
                                                                    sc.field_g = 16;
                                                                  } else {
                                                                    if (ua.field_L.score == 0) {
                                                                      sc.field_g = 1;
                                                                    } else {
                                                                      sc.field_g = 11;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (var6 == 2) {
                                                                if (this.field_e.a(true)) {
                                                                  SocketArchiveRequestConnection.a(0, (byte) -74);
                                                                }
                                                                if (this.field_e.b(-32)) {
                                                                  SocketArchiveRequestConnection.a(256, (byte) -74);
                                                                }
                                                                if (this.field_e.e(0)) {
                                                                  stackIn_155_0 = this.e((byte) 57);
                                                                  if (mf.field_i[this.field_c]) {
                                                                    stackIn_156_1 = mf.field_d[this.field_c] * param2;
                                                                  } else {
                                                                    stackIn_156_1 = 0;
                                                                  }
                                                                  var6 = stackIn_155_0 + stackIn_156_1;
                                                                  var7 = -var6 + kf.mouseX - 78 << 2;
                                                                  if (0 <= var7) {
                                                                    if (var7 >= 256) {
                                                                      SocketArchiveRequestConnection.a(256, (byte) -74);
                                                                    } else {
                                                                      SocketArchiveRequestConnection.a(var7, (byte) -74);
                                                                    }
                                                                  } else {
                                                                    SocketArchiveRequestConnection.a(0, (byte) -74);
                                                                  }
                                                                }
                                                                if (this.field_e.a(0)) {
                                                                  ol.e(256);
                                                                }
                                                                if (!(!this.field_e.c((byte) 11))) {
                                                                  SpriteState.f(-96);
                                                                }
                                                                decompiledFrameRemainder0 = false;
                                                              }
                                                              else {
                                                                if (var6 == 3) {
                                                                  if (this.field_e.a(true)) {
                                                                    qd.a(false, 0);
                                                                  }
                                                                  if (this.field_e.b(param3 - 293)) {
                                                                    qd.a(false, 256);
                                                                  }
                                                                  if (this.field_e.e(0)) {
                                                                    stackIn_174_0 = this.e((byte) 99);
                                                                    if (!mf.field_i[this.field_c]) {
                                                                      stackIn_175_1 = 0;
                                                                    } else {
                                                                      stackIn_175_1 = param2 * mf.field_d[this.field_c];
                                                                    }
                                                                    var6 = stackIn_174_0 + stackIn_175_1;
                                                                    var7Lifetime1 = -var6 + (kf.mouseX - 78) << 2;
                                                                    if (var7Lifetime1 < 0) {
                                                                      qd.a(false, 0);
                                                                    } else {
                                                                      if (var7Lifetime1 < 256) {
                                                                        qd.a(false, var7Lifetime1);
                                                                      } else {
                                                                        qd.a(false, 256);
                                                                      }
                                                                    }
                                                                  }
                                                                  if (this.field_e.a(0)) {
                                                                    ij.a((byte) -109);
                                                                  }
                                                                  if (this.field_e.c((byte) 11)) {
                                                                    qg.a(13);
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      if (this.field_e.b(false)) {
                                                        si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                                        sc.field_g = 9;
                                                      }
                                                    }
                                                  } else {
                                                    if (this.field_e.b(false)) {
                                                      si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                                      sc.field_g = 8;
                                                    }
                                                  }
                                                } else {
                                                  if (this.field_e.b(false)) {
                                                    si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                                    rd.field_b = (rd.field_b + 1) % 2;
                                                  }
                                                }
                                              }
                                            } else {
                                              if (this.field_e.b(false)) {
                                                si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                                ka.field_d.clear(param3 ^ 391);
                                                th.field_l = 0;
                                                ArchiveIndex.field_i = 0;
                                                oe.field_e = 0;
                                                cd.field_h.clear(1);
                                                sc.field_g = 0;
                                              }
                                            }
                                          }
                                        } else {
                                          if (this.field_e.b(false)) {
                                            si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                            sc.field_g = 0;
                                          }
                                        }
                                      }
                                    } else {
                                      if (this.field_e.b(false)) {
                                        si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                        rd.field_b = 0;
                                        sc.field_g = 6;
                                      }
                                    }
                                  } else {
                                    if (this.field_e.b(false)) {
                                      si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                      rd.field_b = 0;
                                      sc.field_g = 5;
                                    }
                                  }
                                } else {
                                  if (this.field_e.b(false)) {
                                    si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                    sc.field_g = 4;
                                    rd.field_b = 0;
                                  }
                                }
                              } else {
                                if (this.field_e.b(false)) {
                                  si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                                  di.field_i = 2;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (this.field_e.b(false)) {
                    si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                    sc.field_g = 10;
                  }
                }
              }
            }
          }
        }

    }

    GameScreen(TrackController param0, int param1) {
        this.field_h = -1;
        this.field_d = -1;
        this.field_g = -1;
        try {
          this.field_e = new cd(mf.field_f[param1].length);
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        keyQueueWrite = 0;
        mouseMoved = false;
    }
}
