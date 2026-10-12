/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class EffectPresentation implements EventPresentation {
    static String field_d;
    private int[] field_k;
    private int mapWidth;
    static volatile int field_g;
    private Battlefield battlefield;
    static oc field_e;
    static int[] field_h;
    static RgbSprite[] field_j;
    private BattleCamera camera;
    private EventPresenter presenter;
    static String field_b;
    static String field_a;
    private boolean finished;

    public final void requestFinish(int obfuscationGuard) {
        if (obfuscationGuard <= 94) {
          GameEvent var3 = (GameEvent) null;
          this.initialize((GameEvent) null, (byte) -97);
        }
    }

    public final boolean isCombatViewReady(byte obfuscationGuard) {
        if (obfuscationGuard > -25) {
          return false;
        }
        return false;
    }

    public final boolean isFinished(int obfuscationGuard) {
        if (obfuscationGuard != 8865) {
          field_e = (oc) null;
        }
        return this.finished;
    }

    final static void d(int param0) {
        ou.a(true);
        DeployAction.field_A = true;
        fh.field_i = true;
        KingBlackDragonEvent.field_C.j(-102);
        if (param0 != 7) {
          EffectPresentation.c(101);
        }
        af.a(false, CachedArchiveProvider.field_z, -1);
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, byte param4, int param5) {
        int var10 = 0;
        int var15 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int[][] stackIn_34_2 = null;
        int stackIn_35_3 = 0;
        int stackIn_37_2;
        int stackIn_37_3;
        int stackIn_38_4;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param5 != -1 &&
            param5 != 255) {
            if (param4 != -33) {
              field_g = 60;
            }
            stackIn_10_0 = (param2) ? 1 : -1;
            var6_int = stackIn_10_0;
            stackIn_13_0 = (!param0) ? 1 : -1;
            var7 = stackIn_13_0;
            stackIn_16_0 = (param2) ? 0 : 1;
            if (param0) {
              stackIn_19_1 = 0;
            } else {
              stackIn_19_1 = 1;
            }
            stackIn_22_0 = (stackIn_16_0 != stackIn_19_1) ? -1 : 1;
            var8 = stackIn_22_0;
            var9 = so.field_b.field_a;
            for (var10 = 0; var10 < 40; var10++) {
              var11 = var6_int * var10 + param1;
              if (param2) {
                var11++;
              }
              if (var11 >= 0 &&
                var9 >= var11) {
                var12 = (int)(Math.sin((double)(var10 + ug.field_b * (var8 * 2)) * 3.141592653589793 / 20.0) * 3.0 * (double)var8);
                var12 = var12 + (int)((double)var8 * (3.0 * Math.sin(3.141592653589793 * (double)(-(3 * var8 * ug.field_b) + 2 * var10) / 20.0)));
                var13 = 32;
                var14 = 256;
                for (var15 = 0; var15 < 16; var15++) {
                  stackIn_34_0 = var11;
                  stackIn_34_1 = param3 - (-((20 - (var10 >> 1)) * var7) - (-var15 - var12));
                  stackIn_34_2 = op.field_c;
                  if (CipherPacketBuffer.currentBattlefield != null &&
                    CipherPacketBuffer.currentBattlefield.teamGame) {
                    stackIn_35_3 = 1;
                  } else {
                    stackIn_35_3 = 0;
                  }
                  stackIn_37_2 = stackIn_34_2[stackIn_35_3][param5];
                  stackIn_37_3 = 256;
                  if (var14 <= 0) {
                    stackIn_38_4 = -var14;
                  } else {
                    stackIn_38_4 = var14;
                  }
                  SoftwareRaster.g(stackIn_34_0, stackIn_34_1, stackIn_37_2, stackIn_37_3 - stackIn_38_4);
                  var14 = var14 - var13;
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var6), "tb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void c(int param0) {
        field_j = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 > -58) {
          field_j = (RgbSprite[]) null;
        }
        field_h = null;
        field_e = null;
    }

    final static boolean a(boolean param0, int param1) {
        long dupTemp$2 = 0L;
        if (kd.field_J == null) {
          kd.field_J = wj.field_n.a(rn.field_d, (byte) 120, k.field_c);
        }
        if (param1 == kd.field_J.field_g) {
          return false;
        }
        dupTemp$2 = vi.b(82);
        SummonEvent.field_G = dupTemp$2;
        CampaignMenuButton.field_h = dupTemp$2;
        if (kd.field_J.field_g != 1) {
        }
        ov.field_g = DirectByteStorage.field_o;
        kd.field_J = null;
        return true;
    }

    public final void advanceFrame(GameEvent event, byte obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.camera.field_c[0] = this.presenter.tileIndex % this.mapWidth;
          this.camera.field_c[1] = this.presenter.tileIndex / this.mapWidth;
          this.camera.f(-111);
          this.camera.i(0);
          this.field_k[1] = this.camera.field_e[1];
          this.field_k[0] = this.camera.field_e[0];
          var3_int = 127 % ((obfuscationGuard + 26) / 48);
          this.presenter.screenX = this.field_k[0];
          this.presenter.screenY = this.field_k[1];
          if (event == null) {
            return;
          }
          this.finished = this.presenter.unitRenderer.a(this.presenter.screenX + 1, -35, this.presenter.screenY - 6, -1, event.unit);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tb.Q(");
          if (event == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void readCoatOfArms(int[] parts, PacketBuffer packet, boolean obfuscationGuard, int[] colourIndices) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = 0;
          if (obfuscationGuard) {
            field_d = (String) null;
          }
          while (var4_int < 6) {
            parts[var4_int] = packet.readUnsignedByte(0);
            colourIndices[var4_int] = packet.readUnsignedByte(0);
            if (parts[var4_int] == 255) {
              parts[var4_int] = -1;
            }
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("tb.A(");
          if (parts == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (packet == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(',');
          if (colourIndices == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final boolean initialize(GameEvent event, byte obfuscationGuard) {
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        String var4_ref_String = null;
        int var6 = 0;
        DeathEvent var7 = null;
        String var8 = null;
        GrowthEvent var9 = null;
        String var10 = null;
        StateChangeEvent var11 = null;
        String var12 = null;
        TeleportEvent var13 = null;
        String var14 = null;
        DeployEvent var15 = null;
        String var16 = null;
        String var17 = null;
        Object var18 = null;
        StateChangeEvent var18_ref = null;
        String var19 = null;
        Object var20 = null;
        TelefragEvent var20_ref = null;
        Object var21 = null;
        TelepopEvent var21_ref = null;
        String var22 = null;
        Object var23 = null;
        StateChangeEvent var23_ref = null;
        String var24 = null;
        var18 = null;
        var20 = null;
        var21 = null;
        var23 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (event.eventKind != 10) {
            if (event.eventKind != 11) {
              if (3 == event.eventKind) {
                var23_ref = (StateChangeEvent) (event);
                var4 = this.mapWidth * var23_ref.tileY + var23_ref.tileX;
                this.presenter.tileIndex = var4;
                var23_ref.unit = this.battlefield.getUnitAt(var23_ref.tileY, true, var23_ref.tileX);
                if (var23_ref.unit == null) {
                  var24 = nv.field_bb + ": Can see capture";
                  this.battlefield.a(obfuscationGuard ^ 57, var24, event);
                  return false;
                }
                RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(91, im.field_v[8]);
                var23_ref.unit.modelAnimationIndex = 5;
                var23_ref.a(var23_ref.unit, 12);
                this.advanceFrame(var23_ref, (byte) -95);
              } else {
                if (event.eventKind != 17) {
                  if (event.eventKind != 21) {
                    if (event.eventKind == 6) {
                      var21_ref = (TelepopEvent) (event);
                      var21_ref.unit = this.battlefield.getUnitAt(var21_ref.tileY, true, var21_ref.tileX);
                      var4 = var21_ref.tileX + this.mapWidth * var21_ref.tileY;
                      this.presenter.tileIndex = var4;
                      if (null != var21_ref.unit &&
                        var21_ref.unit.packedFlag256) {
                        var21_ref.unit = var21_ref.unit.copyDetached(false);
                      }
                      if (null == var21_ref.unit) {
                        var22 = nv.field_bb + ": Can see telepop";
                        this.battlefield.a(0, var22, event);
                        return false;
                      }
                      var21_ref.unit.modelAnimationIndex = 2;
                      var21_ref.a(var21_ref.unit, 12);
                      this.advanceFrame(var21_ref, (byte) -103);
                    } else {
                      if (event.eventKind == 5) {
                        var20_ref = (TelefragEvent) (event);
                        if (var20_ref.unit == null) {
                          var4_ref_String = nv.field_bb + ": Telefrag unit null";
                          this.battlefield.a(0, var4_ref_String, event);
                          return false;
                        }
                        var4 = var20_ref.unit.tileX + var20_ref.unit.tileY * this.mapWidth;
                        var20_ref.unit.modelAnimationIndex = 1;
                        this.presenter.tileIndex = var4;
                        dh.a(var20_ref.unit.unitType, 0, obfuscationGuard ^ 25);
                        var20_ref.a(var20_ref.unit, 12);
                        this.advanceFrame(var20_ref, (byte) -115);
                      } else {
                        if (12 != event.eventKind &&
                          event.eventKind != 16 &&
                          event.eventKind != 14) {
                          if ((event.eventKind == 18)) {
                            var15 = (DeployEvent) (event);
                            var4 = var15.tileX + this.mapWidth * var15.tileY;
                            this.presenter.tileIndex = var4;
                            var15.unit = this.battlefield.getUnitAt(var15.tileY, true, var15.tileX);
                            if (var15.unit == null) {
                              var16 = nv.field_bb + ": Can see deployment";
                              this.battlefield.a(0, var16, event);
                              return false;
                            }
                            if (34 == var15.unit.unitType) {
                              var15.unit.c(75, obfuscationGuard ^ 49);
                              var15.unit.modelAnimationIndex = 1;
                            } else {
                              if (var15.unit.unitType != 7 &&
                                17 != var15.unit.unitType) {
                                var17 = nv.field_bb + ": Unit not deployable";
                                this.battlefield.a(0, var17, event);
                                return false;
                              }
                              var15.unit.modelAnimationIndex = 4;
                            }
                            var15.a(var15.unit, 12);
                            this.advanceFrame(var15, (byte) -75);
                          }
                          decompiledFrameRemainder0 = false;
                        }
                        else {
                          var18_ref = (StateChangeEvent) (event);
                          var4 = var18_ref.tileX + var18_ref.tileY * this.mapWidth;
                          this.presenter.tileIndex = var4;
                          var18_ref.unit = this.battlefield.getUnitAt(var18_ref.tileY, true, var18_ref.tileX);
                          if (var18_ref.unit == null) {
                            var19 = nv.field_bb + ": Can see heal, raise, pump";
                            this.battlefield.a(0, var19, event);
                            return false;
                          }
                          var18_ref.unit.modelAnimationIndex = 8;
                          var18_ref.a(var18_ref.unit, 12);
                          this.advanceFrame(var18_ref, (byte) -124);
                        }
                      }
                    }
                  } else {
                    var13 = (TeleportEvent) (event);
                    var4 = var13.sourceX + var13.sourceY * this.mapWidth;
                    var13.unit = this.battlefield.getUnitAt(var13.sourceY, true, var13.sourceX);
                    if (null != var13.unit &&
                      var13.unit.packedFlag256) {
                      var13.unit = var13.unit.copyDetached(false);
                    }
                    this.presenter.tileIndex = var4;
                    if (var13.unit == null) {
                      var14 = nv.field_bb + ": Can see teleport";
                      this.battlefield.a(0, var14, event);
                      return false;
                    }
                    dh.a(var13.unit.unitType, 0, 32);
                    var13.unit.modelAnimationIndex = 2;
                    var13.a(var13.unit, 12);
                    this.advanceFrame(var13, (byte) 73);
                  }
                } else {
                  var11 = (StateChangeEvent) (event);
                  var4 = this.mapWidth * var11.tileY + var11.tileX;
                  this.presenter.tileIndex = var4;
                  var11.unit = this.battlefield.getUnitAt(var11.tileY, true, var11.tileX);
                  if (null == var11.unit) {
                    var12 = nv.field_bb + ": Can see burial";
                    this.battlefield.a(0, var12, event);
                    return false;
                  }
                  var11.unit.modelAnimationIndex = 4;
                  var11.a(var11.unit, 12);
                  this.advanceFrame(var11, (byte) -126);
                }
              }
            } else {
              var9 = (GrowthEvent) (event);
              var4 = var9.tileX + var9.tileY * this.mapWidth;
              this.presenter.tileIndex = var4;
              if (null == var9.unit) {
                var10 = nv.field_bb + ": Can see growth";
                this.battlefield.a(0, var10, event);
                return false;
              }
              var9.unit.modelAnimationIndex = 1;
              var9.a(var9.unit, 12);
              this.advanceFrame(var9, (byte) 123);
            }
          } else {
            var7 = (DeathEvent) (event);
            var4 = var7.tileX + var7.tileY * this.mapWidth;
            this.presenter.tileIndex = var4;
            if (null == var7.unit) {
              var7.unit = this.battlefield.getUnitAt(var7.tileY, true, var7.tileX);
            }
            if (null == var7.unit) {
              var8 = nv.field_bb + ": Can see death";
              this.battlefield.a(0, var8, event);
              return false;
            }
            var7.unit.modelAnimationIndex = 7;
            dh.a(var7.unit.unitType, 5, obfuscationGuard - 25);
            var7.a(var7.unit, 12);
            this.advanceFrame(var7, (byte) 68);
          }
          if (obfuscationGuard == 57) {
            return true;
          }
          field_e = (oc) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_74_0 = var3;
          stackIn_74_1 = new StringBuilder().append("tb.E(");
          if (event == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void drawOverlayLayer(byte obfuscationGuard) {
        if (obfuscationGuard != -52) {
          this.isFinished(76);
        }
    }

    public final void drawBaseLayer(byte obfuscationGuard) {
        if (obfuscationGuard >= -119) {
          field_h = (int[]) null;
        }
    }

    EffectPresentation(Battlefield battlefield, BattleCamera camera, EventPresenter presenter) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.mapWidth = battlefield.mapWidth;
          this.camera = camera;
          this.presenter = presenter;
          this.battlefield = battlefield;
          this.field_k = new int[2];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("tb.<init>(");
          if (battlefield == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (camera == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (presenter == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_d = "Game options";
        field_g = 0;
        field_b = "Asking for or providing contact information";
        field_a = "Unable to delete name - system busy";
    }
}
