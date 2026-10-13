/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sa extends qg implements vc {
    static boolean field_E;

    public abstract void a(boolean param0, byte param1);

    private final void j(boolean param0) {
        int var3;
        boolean stackIn_9_1 = false;
        boolean stackIn_11_0 = false;
        var3 = BrickABrac.field_J ? 1 : 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!nl.a(ch.field_g, (byte) 64)))) {
          stackIn_11_0 = this.a(jl.field_e, (byte) 47, si.field_a);
          if (var3 == 0) {
            if (stackIn_11_0) {
              continue;
            }
            stackIn_9_1 = !(param0);
            this.h(stackIn_9_1);
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_11_0 = param0;
        }
        if (!stackIn_11_0) {
          field_E = false;
        }
        return;
    }

    final static int a(int param0, int param1) {
        param0 = param0 & 8191;
        if (~param0 <= param1) {
          return param0 >= 6144 ? -um.field_j[8192 - param0] : -um.field_j[-4096 + param0];
        }
        return param0 < 2048 ? um.field_j[param0] : um.field_j[4096 - param0];
    }

    final static boolean a(int param0, int param1, int param2) {
        boolean stackIn_10_0 = false;
        if (dc.currentKeyCode == 13) {
          th.b(param1 ^ 103);
          return true;
        }
        if (dc.currentKeyCode == param1) {
          hd.field_a.f((byte) 41);
          return true;
        }
        stackIn_10_0 = (hd.field_a != null) && (hd.field_a.a(param2, param0, (byte) -126));
        return stackIn_10_0;
    }

    public abstract void a(int param0);

    abstract void b(int param0, int param1);

    public abstract boolean a(int param0, char param1, int param2);

    private final void i(boolean param0) {
        if (param0) {
          this.f(-67);
        }
    }

    final void g(int param0) {
        java.awt.Canvas var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = gd.a((byte) 0);
        if (r.c((byte) -84)) {
          pk.a((byte) 68, var2, LegacyUtf8Decoder.a((byte) -81));
          return;
        }
        if (!un.field_f) {
          kn.a(true, var2);
          return;
        }
        if (!um.field_t &&
          !og.h(-26090)) {
          ai.a((byte) 24, 100.0f, qm.field_e);
          kn.a(true, var2);
          return;
        }
        pe.field_i = true;
        var3 = kp.field_d.size() - 1;
        do {
          if (var3 < 0) {
            if (param0 <= 93) {
              field_E = false;
            }
            break;
          }
          ((vc) (kp.field_d.elementAt(var3))).a(16769381);
          var3--;
        } while (var4 == 0);
        if (pe.field_i) {
          jj.a((byte) -123);
          ck.a(var2, 0, 14209, 0);
          if (var4 == 0) {
            return;
          }
        }
        this.i(false);
        return;
    }

    protected sa() {
    }

    final void a(int param0, wb param1) {
        try {
          al.field_j = param1;
          this.a(8, true);
          this.l(param0 ^ 3156);
          this.i(2);
          this.e(true);
          this.b((byte) -67);
          if (param0 != 3160) {
            return;
          }
          try {
            this.j(64);
            this.c((byte) -19);
            ch.field_g[9] = -1;
            ch.field_g[10] = -1;
            kp.field_d = new Vector();
            KeyboardInput.a((vc) (this), 0);
          } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "sa.HB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract boolean a(BitPacketBuffer param0, byte param1, int param2);

    final static void a(int param0, bi param1, String param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        try {
          var7_int = (-param1.field_B + (param4 + (2 * param0 - param1.field_L))) / 2;
          int var8 = -69 / ((param6 + 85) / 40);
          nn.field_g.b(param2, param3, var7_int + nn.field_g.field_B, param5, -1);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "sa.NB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void r(int param0) {
        boolean stackIn_20_1 = false;
        boolean stackIn_39_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        vc var6 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 10) {
          return;
        }
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder0 = true;
        var2 = 0;
        if (!m.a(2)) {
          if (lg.a(9)) {
            if (!me.b(126)) {
              var3 = md.f((byte) 124);
              switch (var3) {
                case 3:
                  cp.a(true, 21543);
                default:
                  break;
                case 4:
                  he.a(qn.field_k, false, (byte) 61);
                  wi.field_g = true;
                  if (var5 == 0) {
                    break;
                  }
                case 2:
                  LevelPack.b(102);
                  break;
              }
              this.a(false, (byte) 69);
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              nk.a(58);
              decompiledFrameRemainder0 = (var5 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (dj.c((byte) -33)) {
              stackIn_20_1 = (ua.field_d != null);
              var3 = this.b(stackIn_20_1, (byte) -118);
              if (1 == var3 ||
                var3 == 2) {
                if (null != ua.field_d) {
                  LevelPack.b(118);
                }
                if (var3 == 2) {
                  nk.a(param0 ^ 2058, uc.e((byte) -85));
                }
              }
              this.a(false, (byte) 81);
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (uc.f(21651)) {
                if (!me.b(param0 ^ -16)) {
                  var3 = vh.h(0);
                  if (1 == var3) {
                    he.a(LevelPackLoader.field_a, true, (byte) 97);
                  }
                  this.a(false, (byte) 7);
                  decompiledFrameRemainder0 = (var5 != 0);
                }
                if (decompiledFrameRemainder0) {
                  nk.a(param0 + 47);
                  decompiledFrameRemainder0 = (var5 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (!me.b(-34)) {
                  var2 = 1;
                  var3 = -1;
                  while (true) {
                    stackIn_39_0 = jl.pollKeyEvent((byte) 5);
                    if (stackIn_39_0) {
                      stackIn_76_0 = dc.currentKeyCode;
                      stackIn_76_1 = -1;
                      if (var5 != 0) {
                        if (stackIn_76_0 < stackIn_76_1) {
                          var6 = (vc) (kp.field_d.elementAt(var3));
                          var6.a(var2 != 0, (byte) -126);
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_76_0 == stackIn_76_1) {
                        if (-1 == dc.currentKeyCode &&
                          var3 != -1) {
                          dc.currentKeyCode = var3;
                          var3 = -1;
                        }
                      } else {
                        if (uf.b(-102, dc.currentKeyCode)) {
                          var3 = dc.currentKeyCode;
                          continue;
                        }
                      }
                      var4 = 0;
                      while (var4 < kp.field_d.size()) {
                        stackIn_39_0 = ((vc) (kp.field_d.elementAt(var4))).a(dc.currentKeyCode, go.currentKeyCharacter, -81);
                        if (!stackIn_39_0) {
                          var4++;
                          continue;
                        }
                        break;
                      }
                      continue;
                    }
                    break;
                  }
                  if ((decompiledFrameCompleted1) &&
                    (decompiledFrameCompleted0) &&
                    (var5 != 0)) {
                    nk.a(114);
                    this.a(false, (byte) 28);
                  }
                } else {
                  nk.a(114);
                  if (var5 != 0) {
                    this.a(false, (byte) 28);
                  }
                }
              }
            }
          }
        } else {
          this.a(false, (byte) 28);
        }
        if ((decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          var3 = 0;
          while (!(var3 >= kp.field_d.size())) {
            var6 = (vc) (kp.field_d.elementAt(var3));
            var6.a(var2 != 0, (byte) -126);
            if (var5 != 0) {
              break;
            }
            stackIn_64_0 = var2;
            if (var6.b(59)) {
              stackIn_65_1 = 0;
            } else {
              stackIn_65_1 = 1;
            }
            var2 = stackIn_64_0 & stackIn_65_1;
            var3++;
          }
        }

    }

    final static String a(char param0, int param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        var6 = new char[param2];
        var3 = var6;
        var4 = 0;
        do {
          if (param2 <= var4) {
            var4 = -55 / ((param1 - 75) / 40);
            break;
          }
          var6[var4] = param0;
          var4++;
        } while (var5 == 0);
        return new String(var6);
    }

    abstract void p(int param0);

    public final boolean b(int param0) {
        if (param0 < 36) {
          return true;
        }
        return true;
    }

    abstract boolean q(int param0);

    final static void a(byte param0, RgbSprite param1, int param2, int param3, RgbSprite param4, RgbSprite param5, int param6, int param7, int param8, int param9) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        RgbSprite var11 = null;
        try {
          param5.drawAt((param6 * 5 >> 16) + ((-param5.canvasWidth + param7) / 2 + param9), param2);
          param4.drawTransparent(param9 + (param7 - param4.canvasWidth) / 2 - (-(param6 * 10 >> 16) - 10 / param3), 480 + (param8 + (param2 - param4.canvasHeight)));
          if (param0 <= 79) {
            var11 = (RgbSprite) null;
            sa.a((byte) 75, (RgbSprite) null, -80, -107, (RgbSprite) null, (RgbSprite) null, 10, 97, -30, 44);
          }
          param1.drawTransparent(10 / param3 + (param9 - (-((-param1.canvasWidth + param7) / 2) - (20 * param6 >> 16))), 480 + (param2 + param8 - param1.canvasHeight));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_6_0 = var10;
          stackIn_6_1 = new StringBuilder().append("sa.MB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final void f(int param0) {
        boolean stackIn_7_1 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        e var5 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (null != ua.field_d &&
          ua.field_d.focusLossPending) {
          LevelPack.b(84);
          MotionWaypoint.c(4);
        }
        stackIn_7_1 = (ua.field_d != null);
        this.b(stackIn_7_1, 1);
        if (param0 >= -34) {
          field_E = false;
        }
        if (lo.field_d) {
          al.field_j.b(true);
          lo.field_d = false;
        }
        if (r.c((byte) -87)) {
          this.g(false);
          if (r.c((byte) -113)) {
            return;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        this.j(true);
        if (!un.field_f) {
          MouseWheelSource.a(GameplayAudioEvent.mouseWheelDelta, (byte) 112);
          decompiledFrameRemainder0 = !(!al.field_j.a((byte) -54));
          if (decompiledFrameRemainder0) {
            al.field_j.a(false);
            un.field_f = true;
            decompiledFrameRemainder0 = (var4 != 0);
          }
        }
        if (decompiledFrameRemainder0) {
          boolean decompiledSharedTail0 = (!(um.field_t) &&
            !(og.h(-26090)));
          if (!decompiledSharedTail0) {
            this.r(10);
            decompiledSharedTail0 = (var4 != 0);
          }
          if ((decompiledSharedTail0) &&
            (al.field_j.a(23570))) {
            um.field_t = true;
            this.p(1);
            mc.a((byte) 126);
          }
        }
        if (!og.h(-26090)) {
          do {
            var5 = (e) (lp.field_wb.removeFirst(3));
            if (var5 == null) {
              if (var4 == 0) {
                break;
              }
            } else {
              df.a(var5, 4, -161);
            }
          } while (var4 == 0);
        }
        fk.a(14114);
        tm.a((byte) 110, 0);
        if (ui.a(false)) {
          var2 = this.o(-105);
          if (0 == var2 ||
            var2 == 1) {
            this.b(var2, 1);
          }
          var3 = 0;
          if (var2 == 2) {
            var3 = 1;
          }
          if (this.q(73)) {
            var3 = 1;
          }
          if (!ui.a(false)) {
            var3 = 0;
          }
          if (var3 != 0) {
            qb.g(115);
          }
        }
    }

    static {
    }
}
