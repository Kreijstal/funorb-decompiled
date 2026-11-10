/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class GameLoopApplet extends FunOrbApplet implements GameLayer {
    static String field_B;
    static String field_C;
    static int field_z;
    static Sprite field_A;

    abstract void onLoadingFinished(int param0);

    protected GameLoopApplet() {
    }

    final void startWithLoader(ug param0, byte param1) {
        try {
          pf.field_b = param0;
          this.b((byte) 116, true);
          this.i(12);
          this.f(param1 - 15);
          this.h((byte) 63);
          this.d(false);
          this.g((byte) 122);
          this.k(-113);
          if (param1 != 14) {
            return;
          }
          try {
            wh.field_d[10] = -1;
            wh.field_d[9] = -1;
            cf.field_eb = new Vector();
            TileMap.addGameLayer((byte) 6, (GameLayer) (this));
          } catch (RuntimeException runtimeException) {
            throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "m.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void paintFrame(byte param0) {
        int var3 = 0;
        int var5 = ZombieDawn.field_J;
        java.awt.Canvas var2 = uh.e(-122);
        if (uk.a((byte) -44)) {
          dg.a(var2, 0, ck.c(-6376));
          return;
        }
        if (!qi.field_F) {
          am.presentFrame(var2, (byte) -125);
          return;
        }
        if (!dg.field_b &&
          !po.isGuestSession(13296)) {
          eh.setLoadingProgress(lo.field_p, 100.0f, -1);
          am.presentFrame(var2, (byte) -86);
          return;
        }
        wn.field_b = true;
        for (var3 = -1 + cf.field_eb.size(); var3 >= 0; var3--) {
          ((GameLayer) (cf.field_eb.elementAt(var3))).drawFrame(-14964);
        }
        int var4 = 35 / ((param0 + 27) / 44);
        if (wn.field_b) {
          DelegatingCanvas.a(false);
          uh.a(-126, 0, 0, var2);
        } else {
          this.onFrameNotPresented(29268);
        }
    }

    abstract boolean isConnectionBusy(int param0);

    public abstract void drawFrame(int param0);

    private final void dispatchInputEvents(int param0) {
        int stackIn_28_1 = 0;
        boolean stackIn_29_2 = false;
        int stackIn_58_0 = 0;
        int stackIn_59_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        GameLayer var6;
        int var3Lifetime1;
        var5 = ZombieDawn.field_J;
        var2 = 0;
        if (!we.hasActiveDialog((byte) -80)) {
          if (dl.a(false)) {
            if (bg.a(2)) {
              RasterBuffer.advanceLoginTransition(256);
            } else {
              var3 = va.a(true);
              if (var3 != 2) {
                if (3 == var3) {
                  cn.a(true, false);
                  this.runTick(false, false);
                } else {
                  if (var3 != 4) {
                    this.runTick(false, false);
                  } else {
                    mn.a(-1, GameWorld.field_Y, false);
                    hp.field_C = true;
                    this.runTick(false, false);
                  }
                }
              } else {
                re.a((byte) -71);
              }
            }
          } else {
            if (nk.b(15000)) {
              stackIn_28_1 = -27698;
              stackIn_29_2 = (null != cn.field_b);
              var3 = this.a(stackIn_28_1, stackIn_29_2);
              if (var3 != 1 &&
                var3 != 2) {
                this.runTick(false, false);
              } else {
                if (null != cn.field_b) {
                  re.a((byte) -71);
                }
                if (var3 != 2) {
                  this.runTick(false, false);
                } else {
                  bo.a(param0 ^ -1869, hc.a(0));
                  this.runTick(false, false);
                }
              }
            } else {
              if (ac.isDimOverlayShown(param0 ^ 1813)) {
                if (!bg.a(2)) {
                  var3 = cg.a(param0 - 1831);
                  if (var3 == 1) {
                    mn.a(-1, vd.field_e, true);
                  }
                  this.runTick(false, false);
                } else {
                  RasterBuffer.advanceLoginTransition(256);
                }
              } else {
                if (!bg.a(2)) {
                  var2 = 1;
                  var3 = -1;
                  while (TileMap.pollKeyEvent(param0 ^ -1902)) {
                    if (kg.field_i == -1) {
                      if (kg.field_i == -1 &&
                        -1 != var3) {
                        kg.field_i = var3;
                        var3 = -1;
                      }
                    } else {
                      if (dg.a((byte) -116, kg.field_i)) {
                        var3 = kg.field_i;
                        continue;
                      }
                    }
                    var4 = 0;
                    while (cf.field_eb.size() > var4) {
                      if (((GameLayer) (cf.field_eb.elementAt(var4))).onKeyTyped(lc.field_c, kg.field_i, 20)) {
                        break;
                      }
                      var4++;
                    }
                  }
                } else {
                  RasterBuffer.advanceLoginTransition(param0 - 1575);
                }
              }
            }
          }
        } else {
          this.runTick(false, false);
        }
        if (param0 != 1831) {
          return;
        }
        for (var3Lifetime1 = 0; cf.field_eb.size() > var3Lifetime1; var3Lifetime1++) {
          var6 = (GameLayer) (cf.field_eb.elementAt(var3Lifetime1));
          var6.runTick(var2 != 0, false);
          stackIn_58_0 = var2;
          if (var6.consumesInput((byte) 119)) {
            stackIn_59_1 = 0;
          } else {
            stackIn_59_1 = 1;
          }
          var2 = stackIn_58_0 & stackIn_59_1;
        }
    }

    private final void processIncomingPackets(int param0) {
        int var3;
        var3 = ZombieDawn.field_J;
        while (gf.a(wh.field_d, (byte) 44)) {
          if (this.handlePacket(fj.field_g, l.field_d, 2)) {
            continue;
          }
          this.e(-12);
        }
        if (param0 < 65) {
          field_A = (Sprite) null;
        }
    }

    abstract boolean handlePacket(am param0, int param1, int param2);

    private final void onFrameNotPresented(int param0) {
        if (param0 != 29268) {
          field_C = (String) null;
        }
    }

    public abstract boolean onKeyTyped(char param0, int param1, int param2);

    final void runFrameStep(byte param0) {
        boolean stackIn_9_1 = false;
        int var2;
        int var3;
        int var4;
        bo var5;
        var4 = ZombieDawn.field_J;
        if (param0 != 15) {
          GameLoopApplet.requestSavedData((byte) 91, 77, -4, -72);
        }
        if (cn.field_b != null &&
          cn.field_b.field_a) {
          re.a((byte) -71);
          rj.reopenAccountScreenIfActive(-121);
        }
        stackIn_9_1 = (cn.field_b != null);
        this.b(stackIn_9_1, false);
        if (di.field_K) {
          pf.field_b.bindArchives(81);
          di.field_K = false;
        }
        if (uk.a((byte) -44)) {
          this.i((byte) 20);
          if (uk.a((byte) -44)) {
            return;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        this.processIncomingPackets(81);
        if (qi.field_F) {
          if (!dg.field_b &&
            !po.isGuestSession(13296)) {
            if (!(!pf.field_b.pollReady((byte) 19))) {
              dg.field_b = true;
              this.onLoadingFinished(1235);
              oh.d((byte) -118);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.dispatchInputEvents(param0 ^ 1832);
          }
        } else {
          wd.b(-91, id.field_I);
          if (pf.field_b.pollArchives(false)) {
            pf.field_b.buildAssets(22833);
            qi.field_F = true;
          }
        }
        if (!po.isGuestSession(13296)) {
          while (true) {
            var5 = (bo) (Point.field_j.removeLast(117));
            if (var5 == null) {
              break;
            }
            i.a(var5, (byte) 7, 4);
          }
        }
        da.d((byte) -48);
        b.a(0, param0 ^ -90);
        if (dn.i(-19301)) {
          var2 = this.h(99);
          if (0 == var2 ||
            var2 == 1) {
            this.onConnectionResult(var2, param0 + 95);
          }
          var3 = 0;
          if (var2 == 2) {
            var3 = 1;
          }
          if (this.isConnectionBusy(10)) {
            var3 = 1;
          }
          if (!dn.i(param0 - 19316)) {
            var3 = 0;
          }
          if (var3 != 0) {
            nc.d((byte) 110);
          }
        }
    }

    public final boolean consumesInput(byte param0) {
        if (param0 < 118) {
          ug var3 = (ug) null;
          this.startWithLoader((ug) null, (byte) 96);
        }
        return true;
    }

    public static void releaseStatics(byte param0) {
        field_C = null;
        field_B = null;
        if (param0 > -121) {
          GameLoopApplet.requestSavedData((byte) -29, 125, -97, 86);
        }
        field_A = null;
    }

    public abstract void runTick(boolean param0, boolean param1);

    final static lo requestSavedData(byte param0, int param1, int param2, int param3) {
        if (param0 > -104) {
          GameLoopApplet.releaseStatics((byte) -31);
        }
        lo var4 = new lo();
        var4.field_k = param3;
        var4.field_o = new int[param1];
        c.field_b.addFirst(0, var4);
        UiWidget.sendIntArrayRequest(param2, 0, var4);
        return var4;
    }

    abstract void onConnectionResult(int param0, int param1);

    static {
        field_z = 0;
        field_C = "Mouse-over an icon for details";
        field_A = new Sprite(664, 504);
    }
}
