/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchSetupPanel {
    private IntPair field_C;
    private int field_A;
    private IntPair field_B;
    private String field_U;
    private int[] itemIndexById;
    private int field_h;
    private int field_Q;
    static String field_O;
    private int previewRowSpacing;
    static String field_d;
    private IntPair previewSize;
    static String field_x;
    private IntPair field_g;
    private int field_n;
    private int field_G;
    private int field_f;
    private IntPair field_m;
    private int field_u;
    private int field_z;
    private int selectedIndex;
    private boolean field_y;
    private int field_b;
    private IntPair field_c;
    private IntPair[] itemEnds;
    private int field_F;
    int[] itemIds;
    private int field_p;
    private String field_R;
    private int playerCount;
    static int field_D;
    private int computerPlayerCount;
    private int field_P;
    private IntPair field_S;
    private int field_L;
    private IntPair[] itemStarts;
    private int field_M;
    private IntPair field_s;
    private IntPair field_k;
    private IntPair field_J;
    private int mapSizeSetting;
    private IntPair field_a;
    private String[] itemLabels;
    private int field_o;
    private IntPair field_w;
    private int selectedPreviewIndex;
    private boolean option33Enabled;

    private final int d(boolean param0) {
        if (!param0) {
          this.itemStarts = (IntPair[]) null;
        }
        return (nr.field_e.field_y >> 1) - nr.field_e.field_L + (nr.field_e.field_v - nr.field_e.field_H + 3);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = this.b(true);
        param0 = (this.previewSize.first - var7 >> 1) + param0;
        this.field_u = param0;
        param3 = param0 + var7;
        param0 = param3 - this.e(-119);
        var7 = 0;
        int var8 = -this.field_n + param5;
        if (param4 != 7) {
          return;
        }
        var7 = 33;
        int var9 = 0;
        param0 = (this.field_f + var7) * var8 + param0;
        var9 = 33;
        param2 = param2 + (this.previewSize.second - var9 >> 1);
        param3 = var7 + param0;
        param1 = var9 + param2;
        this.itemStarts[param5] = new IntPair(param0, param2);
        this.itemEnds[param5] = new IntPair(param3, param1);
    }

    final void d(byte param0) {
        if (param0 != -73) {
          return;
        }
        this.e(false);
        this.b(param0 + 18742);
        this.k(param0 + 106);
        this.f((byte) 66);
        this.c(0);
    }

    private final void a(int param0, boolean param1, IntPair param2, int param3, IntPair param4) {
        int var10 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        RgbSprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != null &&
            param4 != null) {
            if (param0 < this.field_n &&
              this.field_h < param0) {
              return;
            }
            var6_int = param0 - this.field_n;
            if (lt.field_i != null &&
              var6_int >= 0 &&
              lt.field_i.length > var6_int) {
              var7 = lt.field_i[var6_int];
              if (param3 <= 36) {
                return;
              }
              var7.f(db.a(true, param2.first), MatchConditionEntry.a(param2.second, (byte) 94));
              var8 = 0;
              if (this.selectedPreviewIndex == var6_int) {
                var8 = 1;
              }
              if (var8 == 0 &&
                !param1) {
                return;
              }
              var9 = this.field_G;
              if (var8 != 0) {
                var9 = this.field_F;
              }
              for (var10 = 0; this.field_L > var10; var10++) {
                SoftwareRaster.b(db.a(true, param2.first + var10), MatchConditionEntry.a(var10 + param2.second, (byte) 94), -(var10 << 1) + (param4.first - param2.first), -param2.second + (param4.second - (var10 << 1)), var9);
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("dm.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    private final void e(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_J != null) {
          if (this.field_w == null) {
            return;
          }
          if (param0) {
            return;
          }
          var2 = this.field_J.first;
          var3 = this.field_J.second;
          var4 = this.field_w.first - var2;
          var5 = this.field_w.second - var3;
          if (0 != var4) {
            if (var5 == 0) {
              return;
            }
            fe.b(db.a(true, var2), MatchConditionEntry.a(var3, (byte) 94), var4, var5, MusicPatch.field_m, nd.field_b, this.field_Q, this.field_p);
            return;
          }
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int discarded$0 = 0;
        if (this.field_s != null) {
          if (this.field_k == null) {
            return;
          }
          var2 = this.field_s.first;
          var3 = this.field_s.second;
          var4 = this.field_k.first - var2;
          var5 = this.field_k.second - var3;
          if (var4 != 0) {
            if (var5 == 0) {
              return;
            }
            fe.b(db.a(true, var2), MatchConditionEntry.a(var3, (byte) 94), var4, var5, MusicPatch.field_m, TutorialController.field_e, this.field_Q, this.field_p);
            if (param0 != 33) {
              discarded$0 = this.d(true);
            }
            return;
          }
        }
    }

    private final void d(int param0) {
        this.field_J = new IntPair(25, 33);
        if (param0 != 7) {
          return;
        }
        this.field_w = new IntPair(614, 446);
        this.field_A = 0;
        this.field_P = 16777215;
        this.field_b = 192;
        this.field_Q = 0;
        this.field_p = 128;
    }

    final int getItemRightX(boolean obfuscationGuard, int itemIndex) {
        IntPair var3;
        if (this.itemEnds != null &&
          itemIndex >= 0) {
          if (itemIndex >= this.itemEnds.length) {
            return 1;
          }
          if (!obfuscationGuard) {
            return 39;
          }
          var3 = this.itemEnds[itemIndex];
          if (var3 != null &&
            var3.first >= 0) {
            return db.a(true, var3.first);
          }
          return 1;
        }
        return 1;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        if (param5) {
          if ((4 & param4) != 0) {
            EffectPresentation.a(param5, param3, true, param2, (byte) -33, param0);
          }
          if ((2 & param4) != 0) {
            EffectPresentation.a(param5, param3, false, param2, (byte) -33, param0);
          }
        } else {
          if (0 != (param4 & 1)) {
            EffectPresentation.a(param5, param3, false, param2, (byte) -33, param0);
          }
          if ((8 & param4) != 0) {
            EffectPresentation.a(param5, param3, true, param2, (byte) -33, param0);
          }
        }
        if (param1) {
          MatchSetupPanel.c((byte) -56);
        }
    }

    private final void a(boolean param0) {
        this.field_a = new IntPair(31, 431);
        this.f(1);
        this.g((byte) -71);
        this.c(param0);
    }

    final void setOptions(int selectedIndex, byte obfuscationGuard, int mapSizeSetting, int previewIndex, boolean option33Enabled, int computerPlayerCount, int playerCount, String startCaption) {
        if (this.itemIds != null && selectedIndex >= 0 &&
          selectedIndex < this.itemIds.length) {
          this.selectedIndex = selectedIndex;
        }
        if (2 <= playerCount &&
          playerCount <= 8) {
          this.playerCount = playerCount;
        }
        this.option33Enabled = option33Enabled ? true : false;
        if (computerPlayerCount >= 0 &&
          this.playerCount >= computerPlayerCount) {
          this.computerPlayerCount = computerPlayerCount;
        }
        if (mapSizeSetting >= 0 &&
          mapSizeSetting < 4) {
          this.mapSizeSetting = mapSizeSetting;
        }
        this.selectedPreviewIndex = previewIndex;
        if (obfuscationGuard != -28) {
          return;
        }
        try {
          this.setStartCaption(startCaption, (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dm.D(" + selectedIndex + ',' + obfuscationGuard + ',' + mapSizeSetting + ',' + previewIndex + ',' + option33Enabled + ',' + computerPlayerCount + ',' + playerCount + ',' + (startCaption != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, String param1, IntPair param2, int param3, boolean param4, IntPair param5) {
        int[] stackIn_12_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int var8Lifetime1;
        try {
          if (param5 != null &&
            param2 != null) {
            var7_int = db.a(true, param5.first);
            var8 = MatchConditionEntry.a(param5.second, (byte) 94);
            var9 = -var7_int + param2.first;
            var10 = param2.second - var8;
            SoftwareRaster.b(var7_int, var8, var9, var10, this.field_Q, this.field_p);
            if (this.field_y) {
              SoftwareRaster.b(var7_int, var8, var9, var10, this.field_P);
            }
            if (param1 != null &&
              param1.length() != 0) {
              var11 = MatchConditionEntry.a(param5.second, (byte) 94);
              var12 = MatchConditionEntry.a(param2.second, (byte) 94);
              var8Lifetime1 = var11 + var12 >> 1;
              var13 = SocialListPanel.k(-78);
              var8Lifetime1 = var8Lifetime1 + var13;
              if (!param4) {
                stackIn_12_0 = nd.field_b;
              } else {
                stackIn_12_0 = TutorialController.field_e;
              }
              var16 = stackIn_12_0;
              var15 = var16;
              var14 = var15;
              if (param3 < ~param0) {
                fe.c(param1, db.a(true, this.field_c.first), var8Lifetime1, var16, true);
              } else {
                fe.a(param1, db.a(true, param0), var8Lifetime1, var16, true);
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("dm.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final int getItemLeftX(int itemIndex, boolean obfuscationGuard) {
        IntPair var3;
        if (this.itemStarts != null &&
          itemIndex >= 0 &&
          itemIndex < this.itemStarts.length) {
          if (!obfuscationGuard) {
            this.initializeItemIds(126);
          }
          var3 = this.itemStarts[itemIndex];
          if (var3 == null) {
            return 1;
          }
          if (var3.first >= 0) {
            return db.a(true, var3.first);
          }
          return 1;
        }
        return 1;
    }

    final IntPair getPanelEnd(byte obfuscationGuard) {
        int var3 = 0;
        IntPair var4;
        IntPair var5;
        var5 = new IntPair(-1, -1);
        if (null != this.itemEnds &&
          this.itemEnds.length != 0) {
          if (obfuscationGuard != 94) {
            return (IntPair) null;
          }
          for (var3 = 0; var3 < this.itemEnds.length; var3++) {
            var4 = this.itemEnds[var3];
            if (var4 != null) {
              if (0 <= var4.first && (!(var5.first >= var4.first) ||
                !(var5.first >= 0))) {
                var5.first = var4.first;
              }
              if (var4.second >= 0 && (!(var5.second >= var4.second) ||
                !(var5.second >= 0))) {
                var5.second = var4.second;
              }
            }
          }
          if (0 <= var5.first &&
            var5.second >= 0) {
            return var5;
          }
          return new IntPair(1, 1);
        }
        return new IntPair(1, 1);
    }

    private final void g(byte param0) {
        int var15 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        var2 = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var4Lifetime1 = this.field_k.second;
        var7 = 0;
        var2Lifetime1 = this.field_s.first;
        this.field_m = new IntPair(var2Lifetime1, var4Lifetime1);
        var3Lifetime1 = this.field_k.first;
        this.field_z = 4;
        var7Lifetime1 = (this.previewSize.second + this.previewRowSpacing) * this.field_z + (this.field_B.second << 1) - this.previewRowSpacing;
        var5Lifetime1 = var7Lifetime1 + var4Lifetime1;
        this.field_C = new IntPair(var3Lifetime1, var5Lifetime1);
        var8 = this.field_k.second;
        var9 = this.field_a.second;
        var10 = -var8 + var9;
        var11 = (-var7Lifetime1 + var10 >> 1) - 25;
        this.field_m.second = this.field_m.second + var11;
        this.field_f = 5;
        this.field_L = 2;
        this.field_C.second = this.field_C.second + var11;
        var6Lifetime1 = this.b(true);
        var2Lifetime1 = var2Lifetime1 + (-var6Lifetime1 + this.previewSize.first >> 1);
        this.field_u = var2Lifetime1;
        var2Lifetime2 = this.field_B.first + this.field_m.first;
        var4Lifetime2 = this.field_B.second + this.field_m.second;
        if (param0 != -71) {
          return;
        }
        var3Lifetime2 = var2Lifetime2 + this.previewSize.first;
        var12 = 0;
        var13 = this.field_o;
        var14 = this.itemIds.length;
        for (var15 = var13; var14 > var15; var15++) {
          if (var15 == this.field_n) {
            var12 = 1;
          }
          var5Lifetime2 = var4Lifetime2 + this.previewSize.second;
          if (var12 == 0) {
            this.itemStarts[var15] = new IntPair(var2Lifetime2, var4Lifetime2);
            this.itemEnds[var15] = new IntPair(var3Lifetime2, var5Lifetime2);
            var4Lifetime2 = this.previewRowSpacing + var5Lifetime2;
          } else {
            if (this.field_n == var15) {
              this.field_g = new IntPair(var2Lifetime2, var4Lifetime2);
              this.field_S = new IntPair(var3Lifetime2, var5Lifetime2);
            }
            this.a(var2Lifetime2, var5Lifetime2, var4Lifetime2, var3Lifetime2, 7, var15);
            if (var15 == this.field_h) {
              var4Lifetime2 = 12 + (var5Lifetime2 + this.previewRowSpacing);
              var12 = 0;
            }
          }
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (this.field_m != null) {
          if (this.field_C == null) {
            return;
          }
          if (param0 != 66) {
            this.field_L = -47;
          }
          var2 = this.field_m.first;
          var3 = this.field_m.second;
          var4 = -var2 + this.field_C.first;
          var5 = this.field_C.second - var3;
          if (var4 != 0) {
            if (var5 == 0) {
              return;
            }
            fe.b(db.a(true, var2), MatchConditionEntry.a(var3, (byte) 94), var4, var5, MusicPatch.field_m, TutorialController.field_e, this.field_Q, this.field_p);
            return;
          }
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int stackIn_27_0 = 0;
        int stackIn_60_0 = 0;
        int var3;
        IntPair var4;
        IntPair var5;
        int var7;
        int var8;
        int var9;
        String var10;
        String var11;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null != this.itemIds) {
          if (this.itemIds.length == 0) {
            return;
          }
          if (null != this.itemStarts) {
            if (this.itemStarts.length != 0 &&
              this.itemStarts.length == this.itemIds.length) {
              if (this.itemEnds != null) {
                if (0 != this.itemEnds.length &&
                  this.itemEnds.length == this.itemIds.length) {
                  if (null == this.itemLabels) {
                    return;
                  }
                  if (0 != this.itemLabels.length &&
                    this.itemLabels.length == this.itemIds.length) {
                    for (var2 = param0; this.itemIds.length > var2; var2++) {
                      var3 = this.itemIds[var2];
                      var4 = this.itemStarts[var2];
                      var5 = this.itemEnds[var2];
                      var10 = this.itemLabels[var2];
                      if (this.selectedIndex >= 0) {
                        stackIn_27_0 = (this.selectedIndex == var2) ? 1 : 0;
                      } else {
                        stackIn_27_0 = 0;
                      }
                      regionExit1: {
                        var7 = stackIn_27_0;
                        if (var4 != null &&
                          var5 != null) {
                          var11 = this.a(-1, var10, var3);
                          if (var3 != 7) {
                            if (var3 != 27) {
                              if (var2 >= this.field_n &&
                                var2 <= this.field_h) {
                                if (var2 == this.field_n) {
                                  if (this.field_g == null) {
                                    break regionExit1;
                                  }
                                  if (null == this.field_S) {
                                    break regionExit1;
                                  }
                                  if (this.selectedIndex >= 0) {
                                    if (this.field_n <= this.selectedIndex) {
                                      stackIn_60_0 = (this.field_h >= this.selectedIndex) ? 1 : 0;
                                    } else {
                                      stackIn_60_0 = 0;
                                    }
                                  } else {
                                    stackIn_60_0 = 0;
                                  }
                                  var8 = stackIn_60_0;
                                  this.a(this.field_u, this.field_U, this.field_S, ~param0, var8 != 0, this.field_g);
                                }
                                this.a(var2, var7 != 0, var4, 67, var5);
                                break regionExit1;
                              }
                              this.a(-1, var11, var5, -1, var7 != 0, var4);
                            } else {
                              this.a(var7 != 0, var4, var5, 0, var11);
                            }
                          } else {
                            this.a(var4, var11, var7 != 0, var5, 26709);
                          }
                        }
                      }
                    }
                    return;
                  }
                  return;
                }
                return;
              }
              return;
            }
            return;
          }
        }
    }

    final IntPair getPanelStart(byte obfuscationGuard) {
        int var3 = 0;
        IntPair var4;
        IntPair var5;
        var5 = new IntPair(-1, -1);
        if (null != this.itemStarts &&
          this.itemStarts.length != 0) {
          if (obfuscationGuard >= -42) {
            return (IntPair) null;
          }
          for (var3 = 0; var3 < this.itemStarts.length; var3++) {
            var4 = this.itemStarts[var3];
            if (var4 != null) {
              if (var4.first >= 0 && (!(var4.first >= var5.first) ||
                !(var5.first >= 0))) {
                var5.first = var4.first;
              }
              if (var4.second >= 0 && (!(var5.second <= var4.second) ||
                !(var5.second >= 0))) {
                var5.second = var4.second;
              }
            }
          }
          if (var5.first >= 0 &&
            var5.second >= 0) {
            return var5;
          }
          return new IntPair(1, 1);
        }
        return new IntPair(1, 1);
    }

    private final String a(int param0, String param1, int param2) {
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        StringBuilder stackIn_15_0 = null;
        String stackIn_16_1 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            if (param0 != -1) {
              stackIn_8_0 = (String) null;
              return stackIn_8_0;
            }
            if (param2 != 28) {
              if (46 == param2) {
                param1 = param1 + this.computerPlayerCount;
              } else {
                if (param2 != 33) {
                  if (param2 == 29 &&
                    0 <= this.mapSizeSetting &&
                    h.field_e.length >= this.mapSizeSetting) {
                    param1 = param1 + h.field_e[t.field_e];
                  }
                } else {
                  stackIn_15_0 = new StringBuilder().append(param1);
                  if (this.option33Enabled) {
                    stackIn_16_1 = ScrollContainer.field_Mb;
                  } else {
                    stackIn_16_1 = qd.field_J;
                  }
                  param1 = ((StringBuilder) (Object) stackIn_15_0).append(stackIn_16_1).toString();
                }
              }
            } else {
              param1 = param1 + this.playerCount;
            }
            stackIn_24_0 = (String) (param1);
            return stackIn_24_0;
          }
          stackIn_5_0 = (String) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("dm.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void f(int param0) {
        int var8 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = 257;
        this.field_c = new IntPair(319, 239);
        int var7 = 0;
        var2 = this.field_c.first - (var6 >> 1);
        var4 = 58;
        this.field_s = new IntPair(var2, var4);
        this.field_B = new IntPair(7, 7);
        this.previewSize = new IntPair(-(this.field_B.first << 1) + var6, 43);
        var3 = var6 + var2;
        this.field_o = 2;
        this.previewRowSpacing = 4;
        var7 = -this.previewRowSpacing + (this.previewSize.second + this.previewRowSpacing) * this.field_o + (this.field_B.second << 1);
        var5 = var4 + var7;
        this.field_k = new IntPair(var3, var5);
        this.itemStarts = new IntPair[this.itemIds.length];
        this.itemEnds = new IntPair[this.itemIds.length];
        if (param0 != 1) {
          return;
        }
        var2Lifetime1 = this.field_B.first + this.field_s.first;
        var3Lifetime1 = this.previewSize.first + var2Lifetime1;
        var4Lifetime1 = this.field_s.second + this.field_B.second;
        for (var8 = 0; this.field_o > var8; var8++) {
          var5Lifetime1 = this.previewSize.second + var4Lifetime1;
          this.itemStarts[var8] = new IntPair(var2Lifetime1, var4Lifetime1);
          this.itemEnds[var8] = new IntPair(var3Lifetime1, var5Lifetime1);
          var4Lifetime1 = this.previewRowSpacing + var5Lifetime1;
        }
    }

    private final int b(boolean param0) {
        int var2 = 0;
        if (!param0) {
          return 50;
        }
        var2 = 64;
        var2 = var2 + this.e(-24);
        return var2;
    }

    private final void setStartCaption(String caption, byte obfuscationGuard) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 122 % ((obfuscationGuard - 92) / 33);
          var4 = 7;
          var5 = this.findItemIndex(-1, var4);
          if (null == this.itemLabels) {
            return;
          }
          if (0 <= var5 &&
            this.itemLabels.length > var5) {
            if (caption != null &&
              caption.length() != 0) {
              this.itemLabels[var5] = caption;
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("dm.EA(");
          if (caption == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int getItemTopY(int itemIndex, int obfuscationGuard) {
        IntPair var3;
        if (null != this.itemStarts &&
          itemIndex >= 0 &&
          this.itemStarts.length > itemIndex) {
          var3 = this.itemStarts[itemIndex];
          if (obfuscationGuard != 1084326849) {
            return 91;
          }
          if (var3 != null &&
            var3.second >= 0) {
            return MatchConditionEntry.a(var3.second, (byte) 94);
          }
          return 1;
        }
        return 1;
    }

    private final void a(IntPair param0, String param1, boolean param2, IntPair param3, int param4) {
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int var7Lifetime1;
        try {
          if (param0 != null &&
            param3 != null &&
            param1 != null &&
            param1.length() != 0) {
            var6_int = param0.first;
            var7 = param0.second;
            var8 = param3.first - var6_int;
            var9 = -var7 + param3.second;
            if (param4 != 26709) {
              this.option33Enabled = true;
            }
            SoftwareRaster.f(db.a(true, var6_int), MatchConditionEntry.a(var7, (byte) 94), var8, var9, this.field_M);
            fe.b(db.a(true, var6_int), MatchConditionEntry.a(var7, (byte) 94), var8, var9, MusicPatch.field_m, nd.field_b, this.field_Q, this.field_p);
            var10 = MatchConditionEntry.a(param0.second, (byte) 94);
            var11 = MatchConditionEntry.a(param3.second, (byte) 94);
            var7Lifetime1 = var10 + var11 >> 1;
            var12 = SocialListPanel.k(-57);
            var7Lifetime1 = var12 + var7Lifetime1;
            if (param2) {
              stackIn_11_0 = TutorialController.field_e;
            } else {
              stackIn_11_0 = nd.field_b;
            }
            var15 = stackIn_11_0;
            var14 = var15;
            var13 = var14;
            fe.c(param1, db.a(true, this.field_c.first), var7Lifetime1, var15, true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("dm.R(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void c(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_20_0 = false;
        boolean stackIn_27_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var1_int = AiPlanningStrategy.pointerX;
          var2 = ko.pointerY;
          stackIn_4_0 = (DeployEvent.pointerPressButton != 1) ? 0 : 1;
          var3 = stackIn_4_0;
          stackIn_7_0 = (ro.pointerButton != 1) ? 0 : 1;
          var4 = stackIn_7_0;
          VerticalScrollbar.field_Rb.advanceFrame(el.field_d, param0 - 56, var2, var3 != 0, var1_int, var4 != 0);
          while (true) {
            if (!Unit.i((byte) 90)) {
              return;
            }
            if (rs.field_q == 13) {
              CipherPacketBuffer.a(true, 0, 1, jt.field_a);
              if (null != VerticalScrollbar.field_Rb.combatPresentation) {
                VerticalScrollbar.field_Rb.combatPresentation.framebuffer = null;
                VerticalScrollbar.field_Rb.combatPresentation.field_A = null;
              }
              le.field_b = null;
              if (VerticalScrollbar.field_Rb.combatPresentation != null) {
                VerticalScrollbar.field_Rb.combatPresentation = null;
              }
              VerticalScrollbar.field_Rb = null;
            }
            if (rs.field_q == 12) {
              stackIn_20_0 = !(CoatOfArms.field_e);
              CoatOfArms.field_e = stackIn_20_0;
            }
            if (rs.field_q != 11) {
              continue;
            }
            if (BufferedSocket.field_j < 2) {
              continue;
            }
            break;
          }
          stackIn_27_0 = !(jv.field_a);
          jv.field_a = stackIn_27_0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "dm.A(" + param0 + ')');
        }
    }

    private final void a(boolean param0, IntPair param1, IntPair param2, int param3, String param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var7Lifetime1;
        try {
          if (param1 != null &&
            param2 != null &&
            param4 != null &&
            param4.length() != 0) {
            var6_int = param1.first;
            var7 = param1.second;
            if (param3 != 0) {
              this.getItemRightX(true, 61);
            }
            var8 = param2.first - var6_int;
            var9 = param2.second - var7;
            var10 = nd.field_b;
            if (param0) {
              var10 = TutorialController.field_e;
            }
            fe.a(db.a(true, var6_int), MatchConditionEntry.a(var7, (byte) 94), var8, var9, DisplacedUnitMarker.field_s, var10, this.field_Q, this.field_b, true);
            fe.b(db.a(true, var6_int), MatchConditionEntry.a(var7, (byte) 94), var8, var9, MusicPatch.field_m, TutorialController.field_e, this.field_Q, this.field_A);
            var11 = param1.second;
            var12 = param2.second;
            var7Lifetime1 = var11 + var12 >> 1;
            var13 = SocialListPanel.k(-74);
            var7Lifetime1 = var7Lifetime1 + var13;
            fe.c(param4, db.a(true, this.field_c.first), MatchConditionEntry.a(var7Lifetime1, (byte) 94), this.field_Q, true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("dm.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final int getItemHeight(boolean obfuscationGuard, int itemIndex) {
        IntPair var4;
        int var5;
        IntPair var6;
        if (obfuscationGuard) {
          return 1;
        }
        if (0 > itemIndex) {
          return 1;
        }
        if (this.itemStarts != null &&
          itemIndex < this.itemStarts.length) {
          if (this.itemEnds != null &&
            this.itemEnds.length > itemIndex) {
            var6 = this.itemStarts[itemIndex];
            var4 = this.itemEnds[itemIndex];
            if (var6 != null &&
              var6.second >= 0) {
              if (var4 == null) {
                return 1;
              }
              if (var4.second < 0) {
                return 1;
              }
              var5 = var4.second - var6.second;
              if (var5 <= 0) {
                return 1;
              }
              return var5;
            }
            return 1;
          }
          return 1;
        }
        return 1;
    }

    private final int findItemIndex(int obfuscationGuard, int itemId) {
        if (null == this.itemIndexById) {
          return -1;
        }
        if (obfuscationGuard >= ~itemId &&
          itemId < this.itemIndexById.length) {
          return this.itemIndexById[itemId];
        }
        return -1;
    }

    final static int a(int param0, int param1, int[] param2, int param3, boolean param4, int[] param5, int param6, boolean param7, int param8, boolean param9, int param10, String param11) {
        int stackIn_6_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        int var16 = 0;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var12_int = -1;
          if (param7) {
            var12_int = MatchConditionRegistry.a(param0 - param10, -param8 + param6, param2, param9);
          }
          var13 = 0;
          if (param9) {
            stackIn_6_0 = -48;
            return stackIn_6_0;
          }
          while (6 > var13) {
            var14 = nd.field_d[var13];
            if (param2[var14] >= SectorCacheStore.field_j[var14].length) {
              param2[var14] = 0;
            }
            if (param2[var14] <= -1) {
              if (var14 == param3) {
                lt.field_h[var14].f(EditableTextField.field_Vb[var14][0] + param8, EditableTextField.field_Vb[var14][1] + param10, 256);
              } else {
                if (var14 != var12_int) {
                  if (param1 > -1) {
                    lt.field_h[var14].f(EditableTextField.field_Vb[var14][0] + param8, param10 + EditableTextField.field_Vb[var14][1], 128);
                  }
                } else {
                  lt.field_h[var14].f(param8 + EditableTextField.field_Vb[var14][0], EditableTextField.field_Vb[var14][1] + param10, 128);
                }
              }
            } else {
              if (var14 != param3) {
                if (var12_int == var14) {
                  BattleUnitRenderer.a(EditableTextField.field_Vb[var14][0] + param8, 7829367, (byte) -80, SectorCacheStore.field_j[var14][param2[var14]], param10 + EditableTextField.field_Vb[var14][1]);
                }
              } else {
                BattleUnitRenderer.a(EditableTextField.field_Vb[var14][0] + param8, 16777215, (byte) -88, SectorCacheStore.field_j[var14][param2[var14]], EditableTextField.field_Vb[var14][1] + param10);
              }
              if (!param4) {
                gq.b(SectorCacheStore.field_j[var14][param2[var14]], EditableTextField.field_Vb[var14][0] + param8, param10 + EditableTextField.field_Vb[var14][1], PreparedAction.field_q[param5[var14]]);
              } else {
                gq.a(SectorCacheStore.field_j[var14][param2[var14]], EditableTextField.field_Vb[var14][0] + param8, param10 + EditableTextField.field_Vb[var14][1], 1);
              }
              if (var14 == 3 &&
                !param4) {
                var15 = BitmapFont.a(nr.field_e, param11, -10 + uh.field_e[var14][0] << 1);
                fe.c(var15, (uh.field_e[var14][0] >> 1) + EditableTextField.field_Vb[var14][0] + param8, 20 + (uh.field_e[var14][1] >> 1) + (EditableTextField.field_Vb[var14][1] + param10), 0, true);
              }
            }
            var13++;
          }
          stackIn_31_0 = var12_int;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_34_0 = var12;
          stackIn_34_1 = new StringBuilder().append("dm.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final int getPreviewRowHeight(int obfuscationGuard) {
        int var2;
        int var3;
        if (this.previewSize == null) {
          return 1;
        }
        var2 = this.previewSize.second;
        if (var2 >= 0 &&
          0 <= this.previewRowSpacing) {
          var3 = var2 + this.previewRowSpacing;
          if (var3 < 0) {
            return 1;
          }
          if (obfuscationGuard != -10754) {
            this.getItemHeight(true, -108);
          }
          return var3;
        }
        return 1;
    }

    private final void buildItemIndex(byte obfuscationGuard) {
        int maximumId;
        int maximumScanIndex;
        int itemId;
        int lookupIndex;
        int itemIndex;
        if (this.itemIds == null) {
          return;
        }
        if (this.itemIds.length == 0) {
          return;
        }
        if (obfuscationGuard != -105) {
          return;
        }
        maximumId = 0;
        for (maximumScanIndex = 0; maximumScanIndex < this.itemIds.length; maximumScanIndex++) {
          if (maximumId < this.itemIds[maximumScanIndex]) {
            maximumId = this.itemIds[maximumScanIndex];
          }
        }
        if (maximumId <= 0) {
          return;
        }
        this.itemIndexById = new int[1 + maximumId];
        for (lookupIndex = 0; lookupIndex < this.itemIndexById.length; lookupIndex++) {
          this.itemIndexById[lookupIndex] = -1;
        }
        for (itemIndex = 0; itemIndex < this.itemIds.length; itemIndex++) {
          itemId = this.itemIds[itemIndex];
          if (itemId >= 0 &&
            itemId < this.itemIndexById.length) {
            this.itemIndexById[itemId] = itemIndex;
          }
        }
    }

    private final void c(boolean param0) {
        if (null == this.itemIndexById) {
          return;
        }
        if (!param0) {
          this.field_w = (IntPair) null;
        }
        int var2 = this.findItemIndex(-1, 7);
        if (var2 < 0) {
          return;
        }
        if (this.itemStarts != null) {
          if (this.itemEnds == null) {
            return;
          }
          if (this.itemStarts.length > var2) {
            if (this.itemEnds.length <= var2) {
              return;
            }
            this.itemStarts[var2] = this.field_a;
            this.itemEnds[var2] = new IntPair(608, 462);
            return;
          }
        }
    }

    private final void resetOptions(int obfuscationGuard) {
        this.selectedIndex = 0;
        if (obfuscationGuard != -15585) {
          this.field_s = (IntPair) null;
        }
        this.playerCount = 2;
        this.mapSizeSetting = 0;
        this.computerPlayerCount = 0;
        this.selectedPreviewIndex = 0;
        this.option33Enabled = false;
    }

    public static void g(int param0) {
        field_O = null;
        field_x = null;
        if (param0 != 256) {
          return;
        }
        field_d = null;
    }

    final void loadItemLabels(byte obfuscationGuard) {
        int var2 = 0;
        int var3;
        int var5;
        String var4;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.itemIds == null) {
          return;
        }
        if (null == DisplacedUnitMarker.field_t) {
          return;
        }
        this.itemLabels = new String[this.itemIds.length];
        for (var2 = 0; var2 < this.itemIds.length; var2++) {
          var3 = this.itemIds[var2];
          if (var3 >= 0 &&
            DisplacedUnitMarker.field_t.length > var3) {
            var4 = DisplacedUnitMarker.field_t[var3];
            if (var4 != null) {
              this.itemLabels[var2] = var4;
            }
          }
        }
        if (0 == DisplacedUnitMarker.field_t.length) {
          return;
        }
        if (obfuscationGuard <= 54) {
          return;
        }
        this.field_U = DisplacedUnitMarker.field_t[-1 + DisplacedUnitMarker.field_t.length];
    }

    final void initializePanel(int obfuscationGuard) {
        this.d(obfuscationGuard + 6);
        if (obfuscationGuard != 1) {
          return;
        }
        this.initializeItemIds(obfuscationGuard + 11);
        this.a(true);
        this.resetOptions(-15585);
        this.field_y = false;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (wb.field_b != null) {
          if (!(5 < wb.field_b.length)) {
            return;
          }
          this.field_R = wb.field_b[5];
          if (null == this.field_R) {
            return;
          }
          var2 = this.field_J.second;
          var3 = this.d(true);
          if (param0 != 18669) {
            this.getItemLeftX(70, true);
          }
          var4 = var3 + var2;
          fe.b(this.field_R, db.a(true, this.field_c.first), MatchConditionEntry.a(var4, (byte) 94));
          fe.c(this.field_R, db.a(true, this.field_c.first), MatchConditionEntry.a(var4, (byte) 94), nd.field_b, false);
          return;
        }
    }

    private final void initializeItemIds(int obfuscationGuard) {
        int var3 = 0;
        int incrementValue$5 = 0;
        this.itemIds = new int[11];
        int var2 = 0;
        int incrementValue$0 = var2;
        var2++;
        this.itemIds[incrementValue$0] = 25;
        int incrementValue$1 = var2;
        var2++;
        this.itemIds[incrementValue$1] = 26;
        int incrementValue$2 = var2;
        var2++;
        this.itemIds[incrementValue$2] = 28;
        int incrementValue$3 = var2;
        var2++;
        this.itemIds[incrementValue$3] = 46;
        int incrementValue$4 = var2;
        var2++;
        this.itemIds[incrementValue$4] = 29;
        this.field_n = var2;
        for (var3 = 0; 4 > var3; var3++) {
          incrementValue$5 = var2;
          var2++;
          this.itemIds[incrementValue$5] = 55 + var3;
        }
        this.field_h = var2 - 1;
        if (obfuscationGuard != 12) {
          String var4 = (String) null;
          this.setOptions(105, (byte) -17, -105, 21, true, -116, -10, (String) null);
        }
        int incrementValue$6 = var2;
        var2++;
        this.itemIds[incrementValue$6] = 27;
        int incrementValue$7 = var2;
        var2++;
        this.itemIds[incrementValue$7] = 7;
        this.buildItemIndex((byte) -105);
        this.field_F = 15855490;
        this.field_G = 11711413;
    }

    private final int e(int param0) {
        int var5 = 0;
        int var6 = 0;
        int var2 = 1 + (-this.field_n + this.field_h);
        int var4 = -81 % ((26 - param0) / 47);
        int var3 = 0;
        for (var5 = 0; var2 > var5; var5++) {
          var6 = 33;
          var6 = this.field_f + var6;
          var3 = var6 + var3;
        }
        var3 = var3 - this.field_f;
        return var3;
    }

    public MatchSetupPanel() {
        this.field_A = 0;
    }

    static {
        field_x = "Toggle Equipment";
        field_O = "Accept draw";
        field_d = "Real-life threats";
    }
}
