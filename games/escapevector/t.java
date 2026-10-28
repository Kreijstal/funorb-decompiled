/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    wc field_b;
    boolean field_c;
    private int field_d;
    static TerrainMaskSupport field_a;
    private int[] field_e;

    private final void c(byte param0) {
        try {
          if (param0 != 62) {
            this.b(103, false);
          }
          if (this.field_c) {
            this.field_d = 8;
            if (EscapeVector.obfuscationControl == 0) {
              return;
            }
          }
          this.field_d = 9;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "t.G(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        try {
          if (param2 < 9) {
            field_a = (TerrainMaskSupport) null;
          }
          int stackIn_7_0 = (param1 > param0) ? param1 : param0;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "t.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          while (true) {
            if (AccountRequestDialog.pollKeyEvent(-111)) {
              this.field_b.c((byte) 6);
              boolean stackIn_11_0 = this.a(param0 - 13569, false);
              if (var3 == 0) {
                if (stackIn_11_0) {
                  return;
                }
                continue;
              }
              break;
            }
            this.field_b.a(param0 - 400, 240, 192, 24, param0);
            boolean stackIn_11_0Lifetime1 = this.a(-13169, true);
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "t.F(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, boolean param3) {
        int stackIn_63_0 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var7Lifetime2;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (5 * param0 > mj.field_d) {
            return;
          }
          mj.field_b.bindAsFramebuffer();
          SoftwareRasterizer.clearFramebuffer();
          int stackIn_8_0 = (!param3) ? 6340704 : 16777215;
          int var5_int = stackIn_8_0;
          if (param2 != -34) {
            this.field_e = (int[]) null;
          }
          boolean decompiledFrameRemainder0 = true;
          int var6 = mj.field_b.fullWidth / 2;
          if (param0 == 0) {
            fh.field_g.drawCentered(of.field_e, var6, 22, var5_int, -1);
          }
          if (param0 != 0 ||
            var11 != 0) {
            if (param0 != 1) {
              if (param0 == 2) {
                fh.field_g.drawCentered(mc.field_a, var6, 22, var5_int, -1);
              }
              if (param0 != 2 ||
                var11 != 0) {
                if (param0 == 3) {
                  int var7 = fh.field_g.stringWidth(DisplayNameForm.field_N);
                  int var8 = fh.field_g.stringWidth(LoginMethod.field_d);
                  int stackIn_31_0 = (var8 < var7) ? var7 : var8;
                  int var9 = stackIn_31_0;
                  int var10 = (var9 - 68) / 2 + var6;
                  fh.field_g.drawRight(DisplayNameForm.field_N, var10, 22, var5_int, -1);
                  SingleChildContainer.a(var10, 13202, 4, IterableNodeHashTable.field_c, var5_int);
                }
                if (param0 != 3 ||
                  var11 != 0) {
                  if (4 != param0) {
                    if (5 == param0) {
                      fh.field_g.drawCentered(an.field_b, var6, 22, var5_int, -1);
                    }
                    if (5 != param0 ||
                      var11 != 0) {
                      if (param0 != 6) {
                        if (param0 != 7 &&
                          (decompiledFrameRemainder0 = (param0 == 8))) {
                          fh.field_g.drawCentered(UiTheme.field_s, var6, 22, var5_int, -1);
                          decompiledFrameRemainder0 = (var11 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          fh.field_g.drawCentered(da.field_a, var6, 22, var5_int, -1);
                        }
                      }
                      if (decompiledFrameRemainder0 &&
                        (param0 == 6 ||
                        var11 != 0)) {
                        fh.field_g.drawCentered(DynamicTerrainRenderer.field_m, var6, 22, var5_int, -1);
                        if (var11 != 0) {
                          var7Lifetime2 = fh.field_g.stringWidth(DisplayNameForm.field_N);
                          var8Lifetime1 = fh.field_g.stringWidth(LoginMethod.field_d);
                          stackIn_63_0 = (var8Lifetime1 >= var7Lifetime2) ? var8Lifetime1 : var7Lifetime2;
                          var9Lifetime1 = stackIn_63_0;
                          var10Lifetime1 = (-68 + var9Lifetime1) / 2 + var6;
                          fh.field_g.drawRight(LoginMethod.field_d, var10Lifetime1, 22, var5_int, -1);
                          SingleChildContainer.a(var10Lifetime1, 13202, 4, kc.field_b, var5_int);
                          fh.field_g.drawCentered(EscapeVector.field_z, var6, 22, var5_int, -1);
                        }
                      }
                    }} else {
                    var7Lifetime2 = fh.field_g.stringWidth(DisplayNameForm.field_N);
                    var8Lifetime1 = fh.field_g.stringWidth(LoginMethod.field_d);
                    stackIn_63_0 = (var8Lifetime1 >= var7Lifetime2) ? var8Lifetime1 : var7Lifetime2;
                    var9Lifetime1 = stackIn_63_0;
                    var10Lifetime1 = (-68 + var9Lifetime1) / 2 + var6;
                    fh.field_g.drawRight(LoginMethod.field_d, var10Lifetime1, 22, var5_int, -1);
                    SingleChildContainer.a(var10Lifetime1, 13202, 4, kc.field_b, var5_int);
                    if (var11 != 0) {
                      fh.field_g.drawCentered(EscapeVector.field_z, var6, 22, var5_int, -1);
                    }
                  }
                }}} else {
              fh.field_g.drawCentered(EscapeVector.field_z, var6, 22, var5_int, -1);
            }
          }
          AlphaContainer.field_D.a(112);
          cf.a(mj.field_b, true, 1);
          mj.field_b.addOutline(5267536);
          int var7Lifetime1 = -mj.field_d + 30 + 5 * param0;
          if (var7Lifetime1 > 0) {
            ResourceArchive.drawSpriteWithRowJitter(param1, (-mj.field_b.fullWidth + 640) / 2, var7Lifetime1, mj.field_b, param2 ^ 120);
            if (var11 == 0) {
              return;
            }
          }
          mj.field_b.drawTransparent((-mj.field_b.fullWidth + 640) / 2, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5), "t.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ClientException a(Throwable param0, String param1) {
        ClientException var2;
        RuntimeException var2_ref;
        if (param0 instanceof ClientException) {
          var2 = (ClientException) ((Object) param0);
          var2.context = var2.context + ' ' + param1;
        } else {
          var2 = new ClientException(param0, param1);
        }
        return var2;
    }

    public static void releaseStatics(byte guard) {
        if (guard >= -24) {
          return;
        }
        try {
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "t.D(" + guard + ')');
        }
    }

    private final int b(int param0) {
        try {
          if (param0 < 52) {
            t.releaseStatics((byte) -84);
          }
          if (this.field_b.field_h >= 0 &&
            this.field_e.length > this.field_b.field_h) {
            int stackIn_10_0 = this.field_e[this.field_b.field_h];
            return stackIn_10_0;
          }
          int stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "t.E(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1) {
        try {
          if (param0 != 192) {
            int stackIn_2_0 = 121;
            return stackIn_2_0;
          }
          if (param1 >= 0 &&
            param1 < this.field_e.length) {
            int stackIn_10_0 = this.field_e[param1];
            return stackIn_10_0;
          }
          int stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "t.I(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_23_4 = false;
        int var5 = EscapeVector.obfuscationControl;
        try {
          SoftwareRasterizer.clearFramebuffer();
          SelfDestructEffects.b(2);
          if (mj.a((byte) 117)) {
            int var2_int = dn.a(0) / 2 + 20;
            int var3 = 15 + ea.d((byte) -122) / 2;
            if (mj.field_d >= 40) {
              stackIn_8_0 = 0;
            } else {
              stackIn_8_0 = -mj.field_d + 40;
            }
            fc.a(stackIn_8_0, -var2_int + 320, var2_int + 321, 301 + var3, true, 29788, true, 6324320, 3162160, 0, 300 - var3, true);
            en.c(param0 ^ -16);
            pb.a(4);
            return;
          }
          if (mj.field_d >= 40) {
            stackIn_14_0 = 0;
          } else {
            stackIn_14_0 = -mj.field_d + 40;
          }
          fc.a(stackIn_14_0, 240, 400, 16 + (192 + this.field_d * 24), true, 29788, true, 6324320, 3162160, 0, 176, true);
          pb.a(param0 ^ -12);
          int var2_intLifetime1 = 0;
          int var3Lifetime1 = 192;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_e.length <= var2_intLifetime1))) {
            int var4 = this.a(192, var2_intLifetime1);
            if (var5 == 0) {
              Object stackIn_22_0 = this;
              int stackIn_22_1 = var4;
              int stackIn_22_2 = var3Lifetime1;
              int stackIn_22_3 = -34;
              if (~var4 != ~this.b(69)) {
                stackIn_23_4 = false;
              } else {
                Object stackIn_20_0 = this;
                stackIn_23_4 = true;
              }
              this.a(stackIn_22_1, stackIn_22_2, (byte) stackIn_22_3, stackIn_23_4);
              var3Lifetime1 += 24;
              var2_intLifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0 &&
            param0 == -16) {
            return;
          }
          this.field_b = (wc) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "t.L(" + param0 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        if (param0 != -26480) {
          return;
        }
        try {
          this.field_b.a(this.field_b.a((byte) 115, 192, dh.field_d, 24, 400, UiContainer.field_y, 240), param1, 4767999);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "t.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0) {
        try {
          boolean decompiledSharedTail0 = !(this.field_c);
          if (!decompiledSharedTail0) {
            this.field_e = new int[]{0, 2, 3, 4, 5, 6, 7, 8};
            decompiledSharedTail0 = (EscapeVector.obfuscationControl != 0);
          }
          if (decompiledSharedTail0) {
            this.field_e = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
          }
          if (param0 != 22) {
            field_a = (TerrainMaskSupport) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "t.H(" + param0 + ')');
        }
    }

    private final boolean a(int param0, boolean param1) {
        int var10 = EscapeVector.obfuscationControl;
        try {
          if (this.field_b.field_e) {
            ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, 1536 * IterableNodeHashTable.field_c / 64, 8192);
          }
          int var3_int = this.b(123);
          if (var3_int == 0 &&
            this.field_b.b((byte) -18)) {
            GameplaySession.openSessionScreen(param1, 2560);
            return true;
          }
          if (var3_int == 1 &&
            this.field_b.b((byte) -18)) {
            wk.field_c = true;
            aj.field_a.a(param1, (byte) 47);
            mj.field_d = 0;
          }
          if (var3_int == 2 &&
            this.field_b.b((byte) -18)) {
            ek.a(this.field_b.field_j, false);
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var3_int == 3) {
            if (this.field_b.g(param0 + 13072) &&
              IterableNodeHashTable.field_c > 0) {
              IterableNodeHashTable.field_c = IterableNodeHashTable.field_c - 8;
              if (0 > IterableNodeHashTable.field_c) {
                IterableNodeHashTable.field_c = 0;
              }
              TrackerMusicDefinition.d(8192);
            }
            if (this.field_b.b(-98) &&
              IterableNodeHashTable.field_c < 64) {
              IterableNodeHashTable.field_c = IterableNodeHashTable.field_c + 8;
              if (IterableNodeHashTable.field_c > 64) {
                IterableNodeHashTable.field_c = 64;
              }
              TrackerMusicDefinition.d(8192);
            }
            if (this.field_b.d(-10809)) {
              IterableNodeHashTable.field_c = 0;
              TrackerMusicDefinition.d(8192);
            }
            if (this.field_b.e(0)) {
              IterableNodeHashTable.field_c = 64;
              TrackerMusicDefinition.d(8192);
            }
            if (!this.field_b.a(false) &&
              (decompiledFrameRemainder0 = !(!this.field_b.b((byte) -18)))) {
              TrackerMusicDefinition.d(param0 ^ -4977);
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              int var4 = fh.field_g.stringWidth(DisplayNameForm.field_N);
              int var5 = fh.field_g.stringWidth(LoginMethod.field_d);
              int stackIn_68_0 = (var4 <= var5) ? var5 : var4;
              int var6 = stackIn_68_0;
              int var7 = 320 + (var6 - 68) / 2;
              int var8 = -var7 - 2 + dh.field_d;
              if (!(var8 >= 0)) {
                var8 = 0;
              } else if (var8 > 64) {
                var8 = 64;
                if (var10 != 0) {
                  var8 = 0;
                }
              }
              if (this.field_b.b((byte) -18) ||
                ~IterableNodeHashTable.field_c != ~var8) {
                IterableNodeHashTable.field_c = var8;
                TrackerMusicDefinition.d(8192);
              }
            }
          }
          if (var3_int == 4) {
            if (this.field_b.g(116) &&
              kc.field_b > 0) {
              kc.field_b = kc.field_b - 8;
              if (kc.field_b < 0) {
                kc.field_b = 0;
              }
              TrackerMusicPlayer var4_ref_o = DraggableWidget.field_N;
              if (null != var4_ref_o) {
                var4_ref_o.d(GrowableIntList.field_b * kc.field_b / 64);
              }
            }
            if (this.field_b.b(-98) &&
              kc.field_b < 64) {
              kc.field_b = kc.field_b + 8;
              if (64 < kc.field_b) {
                kc.field_b = 64;
              }
              TrackerMusicPlayer var4_ref_oLifetime1 = DraggableWidget.field_N;
              if (null != var4_ref_oLifetime1) {
                var4_ref_oLifetime1.d(GrowableIntList.field_b * kc.field_b / 64);
              }
            }
            if (this.field_b.d(-10809)) {
              kc.field_b = 0;
              TrackerMusicPlayer var4_ref_oLifetime2 = DraggableWidget.field_N;
              if (var4_ref_oLifetime2 != null) {
                var4_ref_oLifetime2.d(kc.field_b * GrowableIntList.field_b / 64);
              }
            }
            if (this.field_b.e(0)) {
              kc.field_b = 64;
              TrackerMusicPlayer var4_ref_oLifetime3 = DraggableWidget.field_N;
              if (var4_ref_oLifetime3 != null) {
                var4_ref_oLifetime3.d(GrowableIntList.field_b * kc.field_b / 64);
              }
            }
            if (this.field_b.a(false)) {
              int var4Lifetime1 = fh.field_g.stringWidth(DisplayNameForm.field_N);
              int var5Lifetime1 = fh.field_g.stringWidth(LoginMethod.field_d);
              int stackIn_129_0 = (var4Lifetime1 <= var5Lifetime1) ? var5Lifetime1 : var4Lifetime1;
              int var6Lifetime1 = stackIn_129_0;
              int var7Lifetime1 = 320 + (-68 + var6Lifetime1) / 2;
              int var8Lifetime1 = dh.field_d - 2 - var7Lifetime1;
              if (0 > var8Lifetime1) {
                var8Lifetime1 = 0;
                if (var10 != 0 &&
                  var8Lifetime1 > 64) {
                  var8Lifetime1 = 64;
                }
              } else if (var8Lifetime1 > 64) {
                var8Lifetime1 = 64;
              }
              kc.field_b = var8Lifetime1;
              TrackerMusicPlayer var9 = DraggableWidget.field_N;
              if (var9 != null) {
                var9.d(GrowableIntList.field_b * kc.field_b / 64);
              }
            }
          }
          if (var3_int == 5 &&
            this.field_b.b((byte) -18)) {
            if (null != IsaacRandom.field_d) {
              ri.a(param0 - 11954);
              if (var10 != 0) {
                eo.a(24, param1);
              }
            } else {
              eo.a(24, param1);
            }
            return true;
          }
          if (var3_int == 6 &&
            this.field_b.b((byte) -18)) {
            kh.a(this.field_b.field_j, -1230, false);
            mj.field_d = 0;
            gi.a((byte) -96);
            return true;
          }
          if (var3_int == 7 &&
            this.field_b.b((byte) -18)) {
            SpriteState.a(param0 + 13193, this.field_b.field_j);
            mj.field_d = 0;
            gi.a((byte) -94);
            return true;
          }
          if (param0 != -13169) {
            this.b(2, false);
          }
          if (8 == var3_int &&
            this.field_b.b((byte) -18)) {
            if (IsaacRandom.field_d != null) {
              ri.a(-25123);
            }
            gk.a(-9787, PointCloudEffect.d((byte) -122));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "t.B(" + param0 + ',' + param1 + ')');
        }
    }

    t() {
        try {
          this.field_c = UiContainer.e((byte) 117);
          this.c((byte) 62);
          this.c(22);
          this.field_b = new wc(this.field_d);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "t.<init>()");
        }
    }

    static {
        field_a = new TerrainMaskSupport();
    }
}
