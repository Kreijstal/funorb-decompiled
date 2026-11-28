/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class Main extends c {
    uh field_cb;
    static int field_G;
    static String field_y;
    static PlatformTaskDispatcher field_W;
    ad field_P;
    private IntrusiveDeque field_X;
    private boolean field_L;
    int field_D;
    int field_C;
    private int field_B;
    private int field_ab;
    private int field_db;
    re[] field_E;
    private String field_Z;
    private int field_J;
    private int field_eb;
    private int field_O;
    static String field_M;
    private int field_bb;
    static MouseWheelInput field_V;
    private int field_Q;
    private int field_U;
    private byte[] field_H;
    private int field_F;
    private long field_R;
    private int field_N;
    private int field_K;
    private long field_z;
    private RgbSprite[] field_I;
    private int field_Y;
    private long field_S;
    private int field_A;
    public static int field_T;

    private final void r(int param0) {
        double stackIn_7_1 = 0.0;
        int stackIn_8_2 = 0;
        double stackIn_17_1 = 0.0;
        int stackIn_18_2 = 0;
        double stackIn_22_1 = 0.0;
        int stackIn_23_2 = 0;
        double stackIn_26_1 = 0.0;
        int stackIn_27_2 = 0;
        RuntimeException decompiledCaughtException = null;
        double var2_double = 0.0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = field_T;
        try {
          var2_double = (double)(dh.field_m - this.field_z) / (double)this.field_ab;
          var4 = this.q(param0 - 16777142) * 69 + 36;
          var5 = this.m(124) * 69 + 201;
          var6 = this.field_H[this.s(param0 ^ -16751697)];
          var7 = 36 + this.m((byte) 45) * 69;
          var8 = this.j(0) * 69 + 201;
          var9 = this.field_H[this.n(128)];
          if (-1 == var6) {
            stackIn_7_1 = (double)var7 * (1.0 - var2_double) + var2_double * (double)var4;
            if (this.field_L) {
              stackIn_8_2 = var9;
            } else {
              stackIn_8_2 = 0;
            }
            this.a(stackIn_7_1, stackIn_8_2, (double)var8 * (1.0 - var2_double) + (double)var5 * var2_double, param0 ^ 16777215);
          }
          if (-1 != var6 ||
            var18 != 0) {
            if (var9 == -1) {
              stackIn_17_1 = (1.0 - var2_double) * (double)var4 + (double)var7 * var2_double;
              if (this.field_L) {
                stackIn_18_2 = var6;
              } else {
                stackIn_18_2 = 0;
              }
              this.a(stackIn_17_1, stackIn_18_2, (double)var8 * var2_double + (1.0 - var2_double) * (double)var5, 0);
            }
            if (var9 != -1 ||
              var18 != 0) {
              var10 = 3.141592653589793 * var2_double;
              var12 = Math.sin(var10);
              var14 = Math.cos(var10);
              var16 = (var4 + var7) / 2;
              var17 = (var8 + var5) / 2;
              stackIn_22_1 = (double)(var4 - var16) * var14 + (-(var12 * (double)(-var17 + var5)) + (double)var16);
              if (!this.field_L) {
                stackIn_23_2 = 0;
              } else {
                stackIn_23_2 = var6;
              }
              this.a(stackIn_22_1, stackIn_23_2, var12 * (double)(var4 - var16) + ((double)var17 + var14 * (double)(-var17 + var5)), 0);
              stackIn_26_1 = (double)var16 - var12 * (double)(-var17 + var8) + var14 * (double)(-var16 + var7);
              if (!this.field_L) {
                stackIn_27_2 = 0;
              } else {
                stackIn_27_2 = var9;
              }
              this.a(stackIn_26_1, stackIn_27_2, (double)var17 + var14 * (double)(-var17 + var8) + var12 * (double)(-var16 + var7), 0);
            }}
          if (param0 != 16777215) {
            this.field_X = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.NA(" + param0 + ')');
        }
    }

    private final int s(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -25520) {
            stackIn_4_0 = this.q(7) * 6 + this.m(param0 ^ -25567);
            return stackIn_4_0;
          }
          stackIn_2_0 = 120;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.LB(" + param0 + ')');
        }
    }

    final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_cb = null;
          this.field_P = null;
          AccountRequestState.a((byte) 81, lc.field_a[1]);
          AgeValidator.field_m = 0;
          nb.field_e = 0;
          rj.field_p = af.field_ob - ByteArrayStore.field_b;
          ue.field_d = param0;
          dg.field_J = 0;
          if (NanoFrameTimer.field_f >= 2) {
            ImageProducerRasterBuffer.field_n = false;
          }
          q.field_i = 255;
          this.p((byte) 99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.BB(" + param0 + ')');
        }
    }

    private final void a(double param0, int param1, double param2, int param3) {
        try {
          this.field_I[param1].b((int)(param2 + 0.5), (int)(param0 + 0.5));
          if (param3 != 0) {
            this.field_A = 77;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "Main.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int n(int param0) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 128) {
            discarded$1 = this.s(41);
          }
          stackIn_4_0 = this.m((byte) 75) * 6 + this.j(0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.TA(" + param0 + ')');
        }
    }

    private final void n(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 7) {
            this.l(40);
          }
          if (null != ue.field_a) {
            qi.a((byte) -87, ue.field_a);
            ue.field_a = null;
            AccountNameAvailabilityValidator.b((byte) -20);
          }
          mh.field_c = aj.a(1, 1);
          id.field_a = aj.a(1, 5);
          sh.field_g = aj.a(param0 ^ 6, 2);
          fb.field_a = aj.a(1, 3);
          ll.field_e = aj.a(param0 - 6, 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.LA(" + param0 + ')');
        }
    }

    private final void d(int param0, int param1) {
        int var3_int = 0;
        try {
          var3_int = param0 / 60;
          param0 = param0 % 60;
          this.field_Z = String.valueOf(var3_int) + ':' + String.valueOf(param0 / 10) + String.valueOf(param0 % param1);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "Main.RA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void p(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_T;
        try {
          hb.field_d = hb.field_d + 1;
          ByteArrayStore.field_b = ByteArrayStore.field_b + (af.field_ob << 1);
          rj.field_p = rj.field_p - (af.field_ob << 1);
          if (param0 != -97283608) {
            return;
          }
          regionExit1: {
            regionExit2: {
              regionExit3: {
                boolean decompiledFrameRemainder3 = true;
                boolean decompiledFrameRemainder2 = true;
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder0 = true;
                BufferedRandomAccessFile.field_c = BufferedRandomAccessFile.field_c + 2;
                var2_int = ff.field_b;
                if ((var2_int != 9 ||
                  var3 != 0) &&
                  (decompiledFrameRemainder0 = (var2_int != 1 ||
                  var3 != 0)) &&
                  (decompiledFrameRemainder1 = (2 != var2_int))) {
                  decompiledFrameRemainder2 = (var2_int != 3 ||
                    var3 != 0);
                  if (((decompiledFrameRemainder2) &&
                    (decompiledFrameRemainder2 = (7 != var2_int ||
                    var3 != 0))) &&
                    (decompiledFrameRemainder3 = (var2_int != 8 ||
                    var3 != 0))) {
                    switch (var2_int) {
                      case 4:
                        break regionExit3;
                      case 5:
                        break regionExit2;
                      default:
                        return;
                      case 6:
                        if (var3 == 0) {
                          break regionExit1;
                        }
                        break;
                    }
                  }
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0)) {
                  if ((1073741824 & rk.field_X) != 0) {
                    hb.field_d = hb.field_d - 2;
                    if (hb.field_d != 31) {
                      if (0 != hb.field_d) {
                        return;
                      }
                      rk.field_X = 0;
                      ff.field_b = -1;
                      if (var3 == 0) {
                        return;
                      }
                    }
                    if (!dl.d(0)) {
                      ra.field_d = sk.a(4, (byte) 125);
                      if (0 < AgeValidator.field_m &&
                        !ImageProducerRasterBuffer.field_n) {
                        this.field_P = pk.a(fb.field_c[this.field_C], new int[]{(AgeValidator.field_m << 8) + dg.field_J}, af.field_ob, vb.field_a[this.field_C], ByteArrayStore.field_b, rj.field_p, BufferedRandomAccessFile.field_c, (byte) 80, 3);
                      }
                      dj.field_a = (byte)(rk.field_X >> 8);
                      if (var3 != 0) {
                        dj.field_a = (byte)rk.field_X;
                      }
                    } else {
                      dj.field_a = (byte)rk.field_X;
                    }
                    if (dj.field_a != -2) {
                      return;
                    }
                    dj.field_a = 0;
                    mb.a(qa.field_b.field_s * 3 >> 1, 18, g.field_C, true, 9414, 240, tc.field_a, 6, 320, 2, 18, qa.field_b);
                    if (var3 == 0) {
                      return;
                    }
                  }
                  if (hb.field_d != 32) {
                    return;
                  }
                  if (eh.d(19314)) {
                    we.b(-122);
                    if (var3 != 0) {
                      pf.b((byte) 127);
                    }
                  } else {
                    pf.b((byte) 127);
                  }
                  rk.field_X = rk.field_X | 1073741824;
                  if (var3 == 0) {
                    return;
                  }
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  if (hb.field_d != 32) {
                    return;
                  }
                  ff.field_b = -1;
                  dj.field_a = -1;
                  if (var3 == 0) {
                    return;
                  }
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2)) {
                  if (hb.field_d != 32) {
                    return;
                  }
                  ff.field_b = -1;
                  dj.field_a = rk.field_X;
                  if (var3 == 0) {
                    return;
                  }
                }
                if (decompiledFrameRemainder3) {
                  if (hb.field_d == 1) {
                    if (5 == rk.field_X &&
                      !dl.d(param0 + 97283608)) {
                      this.field_cb = NodeHashTableIterator.a(8, 3, 25404, fb.field_c[this.field_C], 1);
                    }
                    if (ff.field_b == 3) {
                      cd.field_h = -1;
                    }
                  }
                  if (32 != hb.field_d) {
                    return;
                  }
                  ff.field_b = -1;
                  dj.field_a = rk.field_X;
                  if (var3 == 0) {
                    return;
                  }
                }
                if (hb.field_d == 1) {
                  if (rk.field_X == 5 &&
                    !dl.d(0)) {
                    this.field_cb = NodeHashTableIterator.a(8, 3, 25404, fb.field_c[this.field_C], 1);
                  }
                  cd.field_h = dj.field_a;
                }
                if (32 != hb.field_d) {
                  return;
                }
                ff.field_b = -1;
                dj.field_a = rk.field_X;
                if (var3 == 0) {
                  return;
                }
              }
              if (32 != hb.field_d) {
                return;
              }
              ff.field_b = -1;
              if (rk.field_X != 7) {
                if ((this.field_U == 4) &&
                  (!(this.field_K <= 0))) {
                  gh.a(ve.field_c, (byte) -78);
                  if (var3 != 0) {
                    this.p((byte) -101);
                  }
                }
              } else {
                this.p((byte) -101);
              }
              dj.field_a = -1;
              if (var3 == 0) {
                return;
              }
            }
            if (hb.field_d != 32) {
              return;
            }
            ff.field_b = -1;
            dj.field_a = rk.field_X;
            if (var3 == 0) {
              return;
            }
          }
          if (hb.field_d == 32) {
            ff.field_b = -1;
            var2_int = dj.field_a;
            dj.field_a = rk.field_X;
            rk.field_X = var2_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.PA(" + param0 + ')');
        }
    }

    private final int j(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            Main.a((byte) -61, (int[]) null);
          }
          stackIn_4_0 = this.field_Y & 15;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.UA(" + param0 + ')');
        }
    }

    final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          jl.b((byte) 22);
          if (null != DiskCacheWorker.field_a) {
            PcmOutputWorker.a(true);
          }
          ph.c(1);
          if (param0 >= -36) {
            this.d(53, -62);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.FB(" + param0 + ')');
        }
    }

    private final void p(byte param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = field_T;
        try {
          jl.field_h = jl.field_h + ((bc.field_a << 1) + bc.field_a);
          BufferedRandomAccessFile.field_a = BufferedRandomAccessFile.field_a + 3;
          ol.field_W = ol.field_W + (BufferedRandomAccessFile.field_a << 1);
          nb.field_e = nb.field_e | ue.field_d;
          bc.field_a = bc.field_a + 2;
          q.field_i = q.field_i - 1;
          dg.field_J = dg.field_J + 1;
          ue.field_d = 0;
          rj.field_p = rj.field_p + 1;
          this.field_Q = this.field_H.length / 2;
          var2_int = -88 % ((param0 + 29) / 55);
          var3 = this.field_H.length - 1;
          var4 = 19;
          do {
            if (var3 < 0) {
              var3 = this.field_H.length;
              break;
            }
            incrementValue$0 = var3;
            var3--;
            this.field_H[incrementValue$0] = (byte)var4;
            incrementValue$1 = var3;
            var3--;
            this.field_H[incrementValue$1] = (byte)var4;
            var4--;
          } while (var6 == 0);
          do {
            if (var3 <= 0) {
              if (dg.field_J >= 3) {
                stackIn_17_1 = 2 * ((-1 + dg.field_J) / 2);
              } else {
                stackIn_17_1 = 1;
              }
              this.field_eb = stackIn_17_1;
              this.field_ab = Math.max(-(dg.field_J * 50) + 600, 100);
              this.field_J = Math.max(44 - 4 * dg.field_J, 20);
              var3 = Math.max(-(20000 * dg.field_J) + 200000, 40000);
              this.field_bb = this.field_eb * ((20 + this.field_J) * this.field_ab) / 2 + var3;
              var4 = this.field_bb % 10000;
              this.field_bb = this.field_bb - var4;
              this.field_N = -1;
              this.field_A = -1;
              this.field_O = 0;
              break;
            }
            incrementValue$2 = var3;
            var3--;
            var4 = sj.a(10999, incrementValue$2, uh.field_l);
            var5 = this.field_H[var3];
            this.field_H[var3] = this.field_H[var4];
            this.field_H[var4] = (byte) var5;
          } while (var6 == 0);
          if (var4 > 5000) {
            this.field_bb = this.field_bb + 10000;
          }
          this.field_F = 0;
          this.c(-115, 1);
          this.field_db = this.field_bb;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.EA(" + param0 + ')');
        }
    }

    private final int m(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 112) {
            stackIn_4_0 = (4020 & this.field_Y) >> 8;
            return stackIn_4_0;
          }
          stackIn_2_0 = 70;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.EB(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        int discarded$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_15_1 = 0;
        boolean stackIn_16_2 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_89_1 = false;
        RuntimeException decompiledCaughtException = null;
        dh var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = field_T;
        try {
          h.e((byte) -84);
          if (null != DiskCacheWorker.field_a &&
            DiskCacheWorker.field_a.focusLost) {
            PcmOutputWorker.a(!param0);
            g.k(4);
          }
          stackIn_15_1 = -71;
          stackIn_16_2 = (DiskCacheWorker.field_a != null);
          this.a((byte) stackIn_15_1, stackIn_16_2);
          if (kj.field_P) {
            this.n((byte) 7);
            kj.field_P = false;
          }
          stackIn_24_0 = !param0;
          boolean decompiledFrameRemainder0 = true;
          if (th.a(stackIn_24_0)) {
            this.k((byte) -100);
            decompiledFrameRemainder0 = !(!ri.b((byte) 38));
            if (decompiledFrameRemainder0) {
              discarded$0 = this.b(false, (byte) -59);
              decompiledFrameRemainder0 = (var3 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (MatchingFieldValidator.field_k) {
              if ((null != ra.field_d) &&
                (decompiledFrameRemainder0 = !(!ra.field_d.field_j))) {
                SecondaryNodeDequeIterator.field_e = ra.field_d.field_h;
                nb.field_e = nb.field_e & ~SecondaryNodeDequeIterator.field_e;
                ue.field_d = ue.field_d & ~SecondaryNodeDequeIterator.field_e;
                db.field_m = db.field_m | SecondaryNodeDequeIterator.field_e;
                var2 = (dh) (ij.field_h.beginForward((byte) 74));
                while (true) {
                  if (var2 != null) {
                    ii.a(var2, 4, 8192);
                    var2 = (dh) (ij.field_h.nextForward((byte) -98));
                    if (var3 == 0) {
                      continue;
                    }
                  } else {
                    ra.field_d = null;
                    cf.a(this, (byte) 45);
                  }
                  break;
                }
                if (dj.field_a == 10) {
                  dj.field_a = 5;
                }
                ok.b(55);
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (!eh.d(19314)) {
                  if (!MouseInputHandler.b(-109)) {
                    dh.field_m = dh.field_m + 20L;
                    if (ff.field_b == -1) {
                      if (dj.field_a != -1) {
                        this.field_E[dj.field_a].a((byte) -114);
                        if (var3 != 0) {
                          this.o(1);
                          this.p(-97283608);
                        }
                      } else {
                        this.o(1);
                        if (var3 != 0) {
                          this.p(-97283608);
                        }
                      }
                    } else {
                      this.p(-97283608);
                    }
                    if (this.field_X.beginForward((byte) 74) != null) {
                      fieldTemp$1 = this.field_B + 1;
                      this.field_B = this.field_B + 1;
                      if (fieldTemp$1 == 335) {
                        this.field_B = 0;
                        this.field_X.removeFirst(-89);
                      }
                    }
                    decompiledFrameRemainder0 = (0 != dl.field_h);
                    if (decompiledFrameRemainder0) {
                      var2_int = eg.field_b * (640 ^ ij.field_e);
                      BufferedRandomAccessFile.field_c = BufferedRandomAccessFile.field_c + 8;
                      jl.field_h = jl.field_h + var2_int;
                      ol.field_W = ol.field_W - var2_int;
                      ByteArrayStore.field_b = ByteArrayStore.field_b + (af.field_ob << 3);
                      rj.field_p = rj.field_p - (af.field_ob << 3);
                      decompiledFrameRemainder0 = (var3 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    stackIn_89_1 = (null != DiskCacheWorker.field_a);
                    var2_int = this.a(stackIn_89_1, (byte) 104);
                    if (var2_int == 1 ||
                      var2_int == 2) {
                      if (null != DiskCacheWorker.field_a) {
                        PcmOutputWorker.a(true);
                      }
                      if (2 == var2_int) {
                        PacketBuffer.a((byte) -124, PasswordValidator.g(-124));
                      }
                    }
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (ff.field_b == -1) {
                    var2_int = nl.a(true);
                    switch (var2_int) {
                      case 3:
                        mb.a(qa.field_b.field_s * 3 >> 1, 18, g.field_C, true, 9414, 240, tc.field_a, 6, 320, 2, 18, qa.field_b);
                      default:
                        break;
                      case 4:
                        this.a(-2, false, -2, -112);
                        if (var3 == 0) {
                          break;
                        }
                      case 2:
                        PcmOutputWorker.a(true);
                        break;
                    }
                    if (!eh.d(19314)) {
                      this.field_E[dj.field_a].a(-31102, true);
                    }
                  }
                  if (ff.field_b == 9) {
                    this.p(-97283608);
                    if (var3 != 0) {
                      AccountNameAvailabilityValidator.a(2, eg.field_f);
                      var2_int = this.b(true, (byte) -51);
                      if (2 == var2_int) {
                        bc.field_a = -2073859829;
                        ol.field_W = -2073859829;
                        ok.b(63);
                        this.v(256);
                        MatchingFieldValidator.field_k = true;
                      }
                      if (var2_int == 2 ||
                        var2_int == 1) {
                        AccountNameAvailabilityValidator.b((byte) -34);
                      }
                    }
                  }
                }
              }
            } else {
              AccountNameAvailabilityValidator.a(2, eg.field_f);
              var2_int = this.b(true, (byte) -51);
              if (2 == var2_int) {
                bc.field_a = -2073859829;
                ol.field_W = -2073859829;
                ok.b(63);
                this.v(256);
                MatchingFieldValidator.field_k = true;
              }
              if (var2_int == 2 ||
                var2_int == 1) {
                AccountNameAvailabilityValidator.b((byte) -34);
              }
            }
          }
          do {
            if (!Main.a((byte) 30, ad.field_t)) {
              if (param0) {
                this.field_K = -119;
              }
              fe.a((byte) -102, 0);
              break;
            }
            this.f((byte) 99);
          } while (var3 == 0);
          if (SpriteGeometry.b((byte) 34)) {
            var2_int = this.c(false);
            if (var2_int == 0 ||
              var2_int == 1) {
              pg.a(true, 3);
              tb.a(4, 78);
            }
            if (2 == var2_int) {
              r.a(18, 6, -250, 320, qa.field_b.field_s * 3 >> 1, g.field_C, 2, qa.field_b, 6, tc.field_a, 240);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2_ref), "Main.BA(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 > -49) {
            this.b((byte) 32);
          }
          this.a(11246, ((255 & param2) << 8) + (param0 & 255), 9, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var5), "Main.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void d(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        byte stackIn_10_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        byte stackIn_33_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_9_1;
        byte stackOut_32_1;
        short[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = field_T;
        try {
          var2 = new short[120];
          var3 = 0;
          if (!param0) {
            return;
          }
          var4 = 5;
          while (true) {
            stackIn_5_0 = -1;
            stackIn_5_1 = ~var4;
            if (stackIn_5_0 >= stackIn_5_1) {
              stackIn_26_0 = 4;
              if (var8 == 0) {
                var5 = stackIn_26_0;
                while (0 <= var5) {
                  var6 = (short)(var4 * 4112 + (var5 * 257 + 1));
                  var7 = var5 + var4 * 6;
                  stackIn_5_0 = -1;
                  stackOut_9_1 = this.field_H[var7];
                  stackIn_5_1 = stackOut_9_1;
                  stackIn_10_1 = stackOut_9_1;
                  if (stackIn_5_0 != stackIn_10_1 ||
                    -1 != this.field_H[var7 + 1]) {
                    incrementValue$0 = var3;
                    var3++;
                    var2[incrementValue$0] = (short) var6;
                  }
                  if (this.field_H[var7] != -1 &&
                    this.field_H[var7 + 1] != -1) {
                    incrementValue$1 = var3;
                    var3++;
                    var2[incrementValue$1] = (short) var6;
                  }
                  var5--;
                }
                var4--;
                continue;
              }
            } else {
              stackIn_26_0 = 4;
            }
            var4 = stackIn_26_0;
            scanLoop1: while (true) {
              if (var4 >= 0) {
                stackIn_49_0 = 5;
                if (var8 != 0) {
                  break scanLoop1;
                }
                var5Lifetime1 = stackIn_49_0;
                scanLoop2: while (true) {
                  stackIn_31_0 = -1;
                  stackIn_31_1 = ~var5Lifetime1;
                  if (stackIn_31_0 >= stackIn_31_1) {
                    var6Lifetime1 = (short)(257 * var5Lifetime1 + (var4 * 4112 + 16));
                    var7Lifetime1 = var5Lifetime1 + 6 * var4;
                    stackIn_31_0 = -1;
                    stackOut_32_1 = this.field_H[var7Lifetime1];
                    stackIn_31_1 = stackOut_32_1;
                    stackIn_33_1 = stackOut_32_1;
                    if (stackIn_31_0 != stackIn_33_1 ||
                      this.field_H[6 + var7Lifetime1] != -1) {
                      incrementValue$2 = var3;
                      var3++;
                      var2[incrementValue$2] = (short) var6Lifetime1;
                    }
                    if (-1 != this.field_H[var7Lifetime1] &&
                      this.field_H[6 + var7Lifetime1] != -1) {
                      incrementValue$3 = var3;
                      var3++;
                      var2[incrementValue$3] = (short) var6Lifetime1;
                    }
                    var5Lifetime1--;
                    continue scanLoop2;
                  }
                  break;
                }
                var4--;
                continue scanLoop1;
              }
              this.field_Y = var2[sj.a(10999, var3, uh.field_l)];
              stackIn_49_0 = 118;
              break;
            }
            mi.a(stackIn_49_0, BufferedSocket.field_c[9], 100 * Bzip2State.field_I[9] / this.field_ab, ca.field_c[9]);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2_ref), "Main.KB(" + param0 + ')');
        }
    }

    private final void t(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 0) {
            this.f(25);
          }
          if (this.field_db < 0) {
            if (this.field_U == 1) {
              this.c(85, 0);
            }
            this.field_db = 0;
          }
          this.d((this.field_db + 999) / 1000, 10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.JB(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, long param4, long param5) {
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var12Lifetime1;
        var14 = field_T;
        try {
          var10 = 106 % ((-71 - param0) / 36);
          var9_int = 32 + (param1 - 320);
          var11 = -240 + (param3 + 32);
          var12 = (int)(dh.field_m - param5);
          if (var12 < 300) {
            sa.a(0, var11, 512, var9_int, 0, (var12 << 10) / 300, 0, 0);
            if (var14 == 0) {
              return;
            }
          }
          if (dh.field_m >= param4) {
            this.field_I[0].b(param1, param3);
            if (var14 == 0) {
              return;
            }
          }
          if (param4 - 300L >= dh.field_m) {
            this.field_I[param2].b(param1, param3);
            if (var14 == 0) {
              return;
            }
          }
          th.a(107, 0);
          var12Lifetime1 = 300 + (int)(-param4 + dh.field_m);
          if (this.field_H[this.field_A] == this.field_H[this.field_N]) {
            var13 = 512 + var12Lifetime1 * 1536 / 300;
            sa.a(0, var11 * var13 >> 9, var13, var13 * var9_int >> 9, 0, 0, 0, 2047 & (var12Lifetime1 << 10) / 300);
            if (var14 == 0) {
              return;
            }
          }
          sa.a(0, var11, 512, var9_int, 0, (var12Lifetime1 << 10) / 300 + 1024, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var9), "Main.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -49) {
            Main.u(-128);
          }
          stackIn_10_0 = (param1 >= 48) && (57 >= param1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.DA(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        try {
          this.a(false, param0 ^ 4405030, false, true, false);
          this.a(6, 0, 7, 9, 7, (byte) 115, false, 8);
          oa.a((java.awt.Component) ((Object) tb.field_c), 22050, (byte) 103, jk.field_a, true);
          wg.field_a = param0;
          ca.field_b = 4086842;
          af.field_jb = 4473924;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "Main.CB(" + param0 + ')');
        }
    }

    final void c(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        var6 = field_T;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3_int = 96 % ((param0 + 78) / 36);
          var4 = this.field_U;
          if (4 == var4) {
            PacketBuffer.a(ve.field_c, 13427);
            decompiledFrameRemainder0 = (var6 != 0);
          } else {
            decompiledFrameRemainder0 = (var4 == 2);
          }
          if (decompiledFrameRemainder0) {
            this.field_N = -1;
            this.field_A = -1;
          }
          this.field_U = param1;
          var5 = this.field_U;
          if (4 != var5 &&
            var5 != 0) {
            return;
          }
          if (4 == var5 ||
            var6 != 0) {
            this.field_K = (this.field_db + 999) / 1000;
            if (dg.field_J > 0 &&
              dg.field_J < 6) {
              th.a(1 + q.field_i, 1, dg.field_J - 1);
            }
            var4Lifetime1 = Math.max(-(4 * dg.field_J) + 44, 20) - this.field_J;
            if (var4Lifetime1 <= 18) {
              th.a(250, 1, 5);
            }
            if (12 >= var4Lifetime1) {
              th.a(249, 1, 6);
            }
            if (var4Lifetime1 <= 9) {
              th.a(248, 1, 7);
            }
            if (this.field_K >= 60) {
              th.a(247, 1, 8);
            }
            if (this.field_K >= 90) {
              th.a(246, 1, 9);
            }
            if (this.field_K >= 120) {
              th.a(245, 1, 10);
            }
            if (this.field_K >= 150) {
              th.a(244, 1, 11);
            }
            if (ue.field_d != 0) {
              this.a(11246, 8, 3, false);
              if (var6 == 0) {
                return;
              }
            }
            if (this.field_K <= 0) {
              return;
            }
            gh.a(ve.field_c, (byte) -87);
            if (var6 == 0) {
              return;
            }
          }
          if (AgeValidator.field_m > 0 &&
            !ImageProducerRasterBuffer.field_n &&
            !dl.d(0)) {
            this.field_P = pk.a(fb.field_c[this.field_C], new int[]{(AgeValidator.field_m << 8) + dg.field_J}, af.field_ob, vb.field_a[this.field_C], ByteArrayStore.field_b, rj.field_p, BufferedRandomAccessFile.field_c, (byte) 70, 3);
          }
          AccountRequestState.a((byte) 53, lc.field_a[0]);
          this.a(11246, 6, 3, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var3), "Main.W(" + param0 + ',' + param1 + ')');
        }
    }

    public static void u(int param0) {
        field_M = null;
        field_W = null;
        field_V = null;
        if (param0 != -24711) {
          return;
        }
        try {
          field_y = null;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "Main.OA(" + param0 + ')');
        }
    }

    private final int m(byte param0) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 33) {
            discarded$1 = this.m(-92);
          }
          stackIn_4_0 = this.field_Y >> 4 & 15;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.HA(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = this.s(-25520);
          var3 = this.n(128);
          if (param0 <= 16) {
            this.field_ab = 96;
          }
          var4 = this.field_H[var2_int];
          this.field_H[var2_int] = this.field_H[var3];
          this.field_H[var3] = (byte) var4;
          ByteArrayStore.field_b = ByteArrayStore.field_b + af.field_ob;
          BufferedRandomAccessFile.field_c = BufferedRandomAccessFile.field_c + 1;
          rj.field_p = rj.field_p - af.field_ob;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) runtimeException), "Main.DB(" + param0 + ')');
        }
    }

    final static void a(Object param0, PlatformTaskDispatcher param1, byte param2) {
        java.awt.AWTEvent stackIn_8_1 = null;
        Object stackIn_15_0 = null;
        Object stackIn_15_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        java.awt.AWTEvent stackOut_7_1;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = field_T;
        try {
          if (null == param1.field_e) {
            return;
          }
          var3_int = 0;
          if (param2 <= 101) {
            field_G = -54;
          }
          scanLoop1: while (true) {
            if (var3_int < 50) {
              stackIn_15_0 = null;
              stackOut_7_1 = param1.field_e.peekEvent();
              stackIn_15_1 = stackOut_7_1;
              stackIn_8_1 = stackOut_7_1;
              if (var4 != 0) {
                break scanLoop1;
              }
              if (stackIn_15_0 != stackIn_8_1) {
                BoundedRandomAccessFile.sleepMillis((byte) -107, 1L);
                var3_int++;
                continue;
              }
            }
            stackIn_15_0 = null;
            stackIn_15_1 = param0;
            break;
          }
          if (stackIn_15_0 != stackIn_15_1) {
            try {
              param1.field_e.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
              decompiledRegionSelector0 = 0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              decompiledRegionSelector0 = 1;
            }
            if (decompiledRegionSelector0 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var3_ref;
          stackIn_24_1 = new StringBuilder().append("Main.SA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        oh stackIn_4_0;
        String stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        int stackIn_5_4 = 0;
        int stackIn_57_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_1 = 0;
        Object stackIn_101_0;
        int stackIn_101_1;
        int stackIn_101_2;
        byte stackIn_101_3;
        int stackIn_101_4;
        long stackIn_102_5 = 0L;
        Object stackIn_105_0;
        long stackIn_106_6 = 0L;
        int stackIn_113_0 = 0;
        int stackIn_117_0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        hh var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var12Lifetime1;
        var14 = field_T;
        try {
          bd.field_H.b(0, 0);
          qa.field_b.c(Integer.toString(dg.field_J), 85, 80, 16777215, -1);
          stackIn_4_0 = qa.field_b;
          stackIn_4_1 = Integer.toString(-af.field_ob + rj.field_p + ByteArrayStore.field_b >> 8);
          stackIn_4_2 = 130;
          stackIn_4_3 = 238;
          if (ImageProducerRasterBuffer.field_n) {
            stackIn_5_4 = 16776960;
          } else {
            stackIn_5_4 = 16777215;
          }
          ((oh) (Object) stackIn_4_0).c(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_5_4, -1);
          if (param1 != 2) {
            return;
          }
          var3 = "";
          if (this.field_J >= 0) {
            var3 = Integer.toString(this.field_J);
            if ((var14 != 0) &&
              ((param0 & 16) < 8)) {
              var3 = "0";
            }
          } else {
            if ((param0 & 16) < 8) {
              var3 = "0";
            }
          }
          qa.field_b.c(var3, 148, 134, 16777215, -1);
          var4 = (hh) (this.field_X.beginForward((byte) 74));
          if (null != var4) {
            var6 = this.field_B;
            if (80 <= var6) {
              if (230 > var6) {
                var5 = 8;
                if (var14 != 0) {
                  var5 = -(var6 / 2) + 123;
                  var5 = -32 + var6 / 2;
                }
              } else {
                var5 = -(var6 / 2) + 123;
                if (var14 != 0) {
                  var5 = -32 + var6 / 2;
                }
              }
            } else {
              var5 = -32 + var6 / 2;
            }
            ResourceArchive.field_a[var4.field_h].a(8, var5);
            qa.field_b.b(GzipInflater.field_b[var4.field_h], 45, var5 + qa.field_b.field_s, 0, -1);
          }
          boolean decompiledSharedTail0 = (this.field_U != 4);
          if (!decompiledSharedTail0) {
            this.d(this.field_K, param1 ^ 8);
            decompiledSharedTail0 = (var14 != 0);
          }
          if ((decompiledSharedTail0) && (this.field_U != 0 &&
            -1 == dj.field_a)) {
            this.t(0);
          }
          if (this.field_db > 0 ||
            (param0 & 16) < 8) {
            qa.field_b.c(this.field_Z, 118, 286, 16777215, -1);
          }
          boolean decompiledFrameRemainder0 = true;
          var5Lifetime1 = -1;
          var6Lifetime1 = -1;
          if (this.field_U == 3) {
            if ((-this.field_z + dh.field_m) > (long)this.field_ab) {
              this.field_z = this.field_z + (long)this.field_ab;
              this.k(param1 ^ 17);
              this.field_F = this.field_F - 2;
              if (this.field_F < 2) {
                this.c(param1 ^ 23, 1);
                decompiledFrameRemainder0 = (var14 != 0);
              }
              if (decompiledFrameRemainder0) {
                this.d(true);
              }
            }
            if (decompiledFrameRemainder0) {
              var5Lifetime1 = this.s(-25520);
              var6Lifetime1 = this.n(param1 + 126);
            }
          }
          var7 = 36;
          var8 = 0;
          var9 = 0;
          while (true) {
            stackIn_57_0 = ~var9;
            if (stackIn_57_0 > -7) {
              var10 = 201;
              stackIn_117_0 = 0;
              if (var14 == 0) {
                var11 = stackIn_117_0;
                while (6 > var11) {
                  stackIn_57_0 = ~this.field_H[var8];
                  if (stackIn_57_0 != 0 &&
                    ~var8 != ~var5Lifetime1 &&
                    var8 != var6Lifetime1) {
                    boolean decompiledFrameRemainder1 = true;
                    if (this.field_U == 2 && (~this.field_N == ~var8 ||
                      this.field_A == var8)) {
                      stackIn_81_0 = 1;
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      stackIn_81_0 = 0;
                    }
                    var12 = stackIn_81_0;
                    stackIn_87_0 = var12;
                    if (1 == this.field_C &&
                      var8 == this.field_N) {
                      stackIn_88_1 = 1;
                    } else {
                      stackIn_88_1 = 0;
                    }
                    var12Lifetime1 = stackIn_87_0 | stackIn_88_1;
                    var12Lifetime1 = var12Lifetime1 != 0 | this.field_L ? 1 : 0;
                    if (var12Lifetime1 != 0) {
                      stackIn_97_0 = param1 + 118;
                      if (this.field_C == 0 &&
                        var8 == this.field_N) {
                        stackIn_98_1 = 1;
                      } else {
                        stackIn_98_1 = 0;
                      }
                      th.a(stackIn_97_0, stackIn_98_1);
                      ji.a((int) this.field_H[var8], 24355);
                      stackIn_101_0 = this;
                      stackIn_101_1 = 10;
                      stackIn_101_2 = var10;
                      stackIn_101_3 = this.field_H[var8];
                      stackIn_101_4 = var7;
                      if (this.field_A == -1) {
                        stackIn_102_5 = 9223372036854775807L;
                      } else {
                        stackIn_102_5 = this.field_S + 1000L;
                      }
                      stackIn_105_0 = this;
                      if (this.field_N == var8) {
                        stackIn_106_6 = this.field_R;
                      } else {
                        stackIn_106_6 = this.field_S;
                      }
                      this.a((byte) stackIn_101_1, stackIn_101_2, (int) stackIn_101_3, stackIn_101_4, stackIn_102_5, stackIn_106_6);
                    } else {
                      stackIn_113_0 = (~var8 != ~this.field_N) ? 0 : 1;
                      var13 = stackIn_113_0;
                      this.field_I[var13].b(var10, var7);
                    }
                  }
                  var8++;
                  var10 += 69;
                  var11++;
                }
                var7 += 69;
                var9++;
                continue;
              }
            } else {
              stackIn_117_0 = ~this.field_U;
            }
            if (stackIn_117_0 == -4) {
              this.r(param1 + 16777213);
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var3_ref), "Main.IB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void v(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          h.a(param0 ^ -17429, 50);
          if (param0 != 256) {
            this.field_Z = (String) null;
          }
          mg.a(50, true);
          AccountRequestState.a((byte) 42, lc.field_a[0]);
          if (!dl.d(0)) {
            ra.field_d = sk.a(4, (byte) 125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.JA(" + param0 + ')');
        }
    }

    private final int b(boolean param0, byte param1) {
        RgbSprite dupTemp$0 = null;
        RgbSprite dupTemp$1 = null;
        RgbSprite dupTemp$2 = null;
        PcmSample var3 = null;
        int var3_int = 0;
        RgbSprite var3_ref = null;
        RuntimeException var3_ref2 = null;
        PcmSample var4_ref_ib = null;
        int var4 = 0;
        int var5 = 0;
        PcmSample var6 = null;
        int var46 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_63_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_115_0 = 0;
        RuntimeException decompiledCaughtException = null;
        da var3_ref3 = null;
        byte[] var3_array = null;
        wb[] var4_ref_wb__ = null;
        wb var6_ref = null;
        int var7 = 0;
        RgbSprite[] var8 = null;
        int[] var8_array = null;
        int var9_int = 0;
        IsaacRandom var9 = null;
        RgbSprite var10_ref_kc = null;
        int var10 = 0;
        int var11_int = 0;
        RgbSprite var11 = null;
        int var12_int = 0;
        RgbSprite var12 = null;
        int var13_int = 0;
        wb var13 = null;
        int var14 = 0;
        int var15_int = 0;
        RgbSprite var15 = null;
        int var16_int = 0;
        RgbSprite var16 = null;
        int var17_int = 0;
        RgbSprite var17 = null;
        RgbSprite var18 = null;
        RgbSprite var19 = null;
        RgbSprite var20 = null;
        RgbSprite var21 = null;
        RgbSprite var22 = null;
        RgbSprite var23 = null;
        RgbSprite var24 = null;
        Object var24_ref = null;
        int var25 = 0;
        int var26 = 0;
        RgbSprite var27 = null;
        RgbSprite var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int var32_int = 0;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int var5Lifetime1;
        int var14Lifetime1;
        var46 = field_T;
        try {
          SectorCacheStore.a(true);
          if (null == BufferedSocket.field_c[0]) {
            if (EditableTextField.field_H.ensureIndexLoaded(4) &&
              EditableTextField.field_H.tryLoadGroupByName(4, "basic")) {
              if (sh.field_g.ensureIndexLoaded(4) &&
                sh.field_g.tryLoadAllGroups((byte) 46)) {
                if (id.field_a.ensureIndexLoaded(4) &&
                  id.field_a.tryLoadAllGroups((byte) 34)) {
                  if (fb.field_a.ensureIndexLoaded(4) &&
                    fb.field_a.tryLoadAllGroups((byte) 79)) {
                    if (ll.field_e.ensureIndexLoaded(4) &&
                      ll.field_e.tryLoadAllGroups((byte) 91)) {
                      if (mh.field_c.ensureIndexLoaded(4) &&
                        mh.field_c.tryLoadAllGroups((byte) 44)) {
                        if (!param0) {
                          stackIn_50_0 = 1;
                          return stackIn_50_0;
                        }
                        ok.b(69);
                        ug.a(80.0f, 122, AccountRequestState.field_c);
                        this.b((byte) 59);
                        BufferedSocket.field_c[0] = uj.a(sh.field_g, "", "turnover_card").a();
                        BufferedSocket.field_c[1] = uj.a(sh.field_g, "", "revolver_cocking").a();
                        BufferedSocket.field_c[2] = uj.a(sh.field_g, "", "revolver_decocking").a();
                        BufferedSocket.field_c[3] = ig.a(fb.field_a, "", "gunshot").c();
                        BufferedSocket.field_c[4] = ig.a(fb.field_a, "", "crow").c();
                        BufferedSocket.field_c[5] = ig.a(fb.field_a, "", "pesky varment").c();
                        BufferedSocket.field_c[6] = ig.a(fb.field_a, "", "feelin lucky").c();
                        ca.field_c[6] = 112;
                        BufferedSocket.field_c[7] = ig.a(fb.field_a, "", "dont try that again").c();
                        BufferedSocket.field_c[8] = ig.a(fb.field_a, "", "didnt see that one comin").c();
                        BufferedSocket.field_c[9] = uj.a(sh.field_g, "", "swap_cards").a();
                        BufferedSocket.field_c[10] = ig.a(fb.field_a, "", "yeeehaaa").c();
                        BufferedSocket.field_c[11] = ig.a(fb.field_a, "", "yeeehaaa2").c();
                        BufferedSocket.field_c[12] = ig.a(fb.field_a, "", "yeeehaaa3").c();
                        BufferedSocket.field_c[13] = ig.a(fb.field_a, "", "are you a mexican").c();
                        ca.field_c[13] = 120;
                        BufferedSocket.field_c[14] = ig.a(fb.field_a, "", "chicken").c();
                        BufferedSocket.field_c[15] = uj.a(sh.field_g, "", "menu_click").a();
                        var3 = uj.a(sh.field_g, "", "score-count").a();
                        var3.field_k = var3.field_h.length;
                        ve.field_c = RawPcmStream.a(var3, 100, 30);
                        ve.field_c.e(-1);
                        var4_ref_ib = new PcmSample(BufferedSocket.field_c[15].field_l, BufferedSocket.field_c[15].field_h.length + 1000);
                        og.a(BufferedSocket.field_c[15].field_h, 0, var4_ref_ib.field_h, 0, BufferedSocket.field_c[15].field_h.length);
                        lh.field_d = RawPcmStream.a(var4_ref_ib, 100, 96);
                        lh.field_d.c(0, var4_ref_ib.field_h.length);
                        lh.field_d.e(0);
                        var5 = 0;
                        while (var5 < 16) {
                          var6 = BufferedSocket.field_c[var5];
                          stackIn_56_0 = Bzip2State.field_I;
                          stackIn_56_1 = var5;
                          if (var6 != null) {
                            stackIn_57_2 = 1000 * var6.field_h.length / var6.field_l;
                          } else {
                            stackIn_57_2 = 0;
                          }
                          stackIn_56_0[stackIn_56_1] = stackIn_57_2;
                          if (ca.field_c[var5] == 0) {
                            ca.field_c[var5] = 96;
                          }
                          var5++;
                          if (var46 == 0) {
                            continue;
                          }
                          break;
                        }
                        stackIn_63_0 = 1;
                        return stackIn_63_0;
                      }
                      ug.a(70.0f, 58, tg.a((byte) 87, "", kf.field_j, mh.field_c, IntrusiveDeque.field_f));
                      stackIn_47_0 = 0;
                      return stackIn_47_0;
                    }
                    ug.a(50.0f, 82, tg.a((byte) 87, "", ah.field_a, ll.field_e, dh.field_o));
                    stackIn_39_0 = 0;
                    return stackIn_39_0;
                  }
                  ug.a(30.0f, 87, tg.a((byte) 87, "", eg.field_e, fb.field_a, wd.field_a));
                  stackIn_31_0 = 0;
                  return stackIn_31_0;
                }
                ug.a(29.0f, 104, tg.a((byte) 87, "", eg.field_e, id.field_a, wd.field_a));
                stackIn_23_0 = 0;
                return stackIn_23_0;
              }
              ug.a(20.0f, 59, tg.a((byte) 87, "", eg.field_e, sh.field_g, wd.field_a));
              stackIn_15_0 = 0;
              return stackIn_15_0;
            }
            ug.a(3.0f, 73, tg.a((byte) 87, "basic", kf.field_j, EditableTextField.field_H, IntrusiveDeque.field_f));
            stackIn_9_0 = 0;
            return stackIn_9_0;
          }
          if (null != ll.field_e) {
            ug.a(85.0f, 105, j.field_A);
            this.b((byte) 59);
            var3_ref3 = new da(sh.field_g, fb.field_a);
            sh.field_g = null;
            fb.field_a = null;
            lc.field_a[0] = new uf(gg.a("music/36 Card Trick - Title Screen Music", var3_ref3, ll.field_e, -16351, ""));
            lc.field_a[1] = new uf(gg.a("music/36 Card Trick - In-game Music", var3_ref3, ll.field_e, -16351, ""));
            lc.field_a[2] = new uf(gg.a("music/36 Card Trick - Pause Screen", var3_ref3, ll.field_e, -16351, ""));
            ll.field_e = null;
            var4 = 0;
            while (lc.field_a.length > var4) {
              lc.field_a[var4].a(48);
              var4++;
              if (var46 == 0) {
                continue;
              }
              break;
            }
            stackIn_71_0 = 1;
            return stackIn_71_0;
          }
          if (EditableTextField.field_H != null) {
            vb.field_k = DelegatingCanvas.a(-126, "unachieved", "basic", EditableTextField.field_H);
            qi.field_D = DelegatingCanvas.a(-128, "orbcoin", "basic", EditableTextField.field_H);
            EditableTextField.field_H = null;
            stackIn_74_0 = 1;
            return stackIn_74_0;
          }
          if (null == mh.field_c) {
            ji.a((byte) -119, this.field_I);
            mg.c((byte) 96);
            this.field_E = new re[11];
            var3_int = 0;
            do {
              if (var3_int >= 11) {
                ff.field_b = -1;
                dj.field_a = 2;
                break;
              }
              this.field_E[var3_int] = new re(this, var3_int);
              var3_int++;
            } while (var46 == 0);
            var3_ref = ia.field_c[15];
            ArchiveRequest.field_k = new RgbSprite(var3_ref.field_p, var3_ref.field_o);
            ArchiveRequest.field_k.c();
            var4 = 40 / ((param1 - 23) / 52);
            var3_ref.c(0, 0, 4405028);
            gf.field_e.setAsRasterTarget(200);
            stackIn_115_0 = 2;
            return stackIn_115_0;
          }
          ug.a(95.0f, 77, lb.field_f);
          this.b((byte) 59);
          var3_array = id.field_a.getFileByName((byte) 7, "font", "");
          var4_ref_wb__ = lk.a("font", "", (byte) 49, mh.field_c);
          qa.field_b = PcmOutputWorker.a(121, var4_ref_wb__, var3_array);
          eb.field_c = kk.a(var4_ref_wb__, var3_array, 1, 256, 16777215);
          var5Lifetime1 = qa.field_b.field_s + qa.field_b.field_x;
          sk.field_c = new RgbSprite(var5Lifetime1, var5Lifetime1);
          sk.field_c.c();
          qi.field_D.a(0, 0, var5Lifetime1, var5Lifetime1);
          qi.field_D = null;
          gf.field_e.setAsRasterTarget(200);
          this.field_I = gl.a("tiles", mh.field_c, "", -13244);
          var6_ref = lh.a("canyonmask2", mh.field_c, "", 120);
          var7 = var6_ref.field_c;
          var6_ref.field_c = 0;
          var6_ref.field_f = var6_ref.field_b;
          td.field_c[0] = new RgbSprite(415, 415);
          td.field_c[0].c();
          SoftwareRasterizer.fillRectangle(0, 0, 415, 415, 9351922);
          var6_ref.field_j[1] = 8024722;
          var6_ref.a(0, var7);
          SoftwareRasterizer.fillRectangleVerticalGradient(0, 261, 415, 154, 8090514, 11373689);
          lh.a("hs", mh.field_c, "", -89).a(0, 0);
          td.field_c[3] = new RgbSprite(415, 415);
          td.field_c[3].c();
          SoftwareRasterizer.fillRectangle(0, 0, 415, 415, 10932727);
          var6_ref.field_j[1] = 9675196;
          var6_ref.a(0, var7);
          SoftwareRasterizer.fillRectangleVerticalGradient(0, 261, 415, 154, 9675196, 11645356);
          lh.a("atl", mh.field_c, "", -108).a(0, 0);
          td.field_c[5] = new RgbSprite(415, 415);
          td.field_c[5].c();
          SoftwareRasterizer.fillRectangle(0, 0, 415, 415, 13869944);
          var6_ref.field_j[1] = 11698531;
          var6_ref.a(0, var7);
          SoftwareRasterizer.fillRectangleVerticalGradient(0, 261, 415, 154, 11698531, 13734228);
          lh.a("atg", mh.field_c, "", -21).a(0, 0);
          td.field_c[4] = new RgbSprite(415, 415);
          td.field_c[4].c();
          SoftwareRasterizer.fillRectangle(0, 0, 415, 415, 10211583);
          var6_ref.field_j[1] = 5081598;
          var6_ref.a(0, var7);
          SoftwareRasterizer.fillRectangleVerticalGradient(0, 261, 415, 154, 5081598, 11974562);
          lh.a("ld", mh.field_c, "", -96).a(0, 0);
          td.field_c[2] = DelegatingCanvas.a(-127, "lc", "", mh.field_c);
          td.field_c[1] = DelegatingCanvas.a(-127, "go", "", mh.field_c);
          db.field_o = DelegatingCanvas.a(-126, "gunsight", "", mh.field_c);
          ResourceArchive.field_a = gl.a("achievements", mh.field_c, "", -13244);
          var8 = ResourceArchive.field_a;
          var9_int = 0;
          do {
            if (var8.length <= var9_int) {
              ij.a(vb.field_k, (byte) 124);
              mg.field_j = new RgbSprite[9];
              dupTemp$0 = new RgbSprite(4, 4);
              mg.field_j[8] = dupTemp$0;
              mg.field_j[6] = dupTemp$0;
              mg.field_j[2] = dupTemp$0;
              mg.field_j[0] = dupTemp$0;
              mg.field_j[0].c();
              SoftwareRasterizer.fillRectangle(0, 0, SoftwareRasterizer.field_l, SoftwareRasterizer.field_g, 6962948);
              dupTemp$1 = new RgbSprite(256, 4);
              mg.field_j[7] = dupTemp$1;
              mg.field_j[1] = dupTemp$1;
              mg.field_j[1].c();
              SoftwareRasterizer.fillRectangle(0, 0, SoftwareRasterizer.field_l, SoftwareRasterizer.field_g, 6962948);
              dupTemp$2 = new RgbSprite(4, 256);
              mg.field_j[5] = dupTemp$2;
              mg.field_j[3] = dupTemp$2;
              mg.field_j[3].c();
              SoftwareRasterizer.fillRectangle(0, 0, SoftwareRasterizer.field_l, SoftwareRasterizer.field_g, 6962948);
              break;
            }
            var10_ref_kc = var8[var9_int];
            ij.a(var10_ref_kc, (byte) 123);
            var9_int++;
          } while (var46 == 0);
          var8_array = DelegatingCanvas.a(-126, "woodpal", "", mh.field_c).field_r;
          var9 = new IsaacRandom(new int[]{1523066134, 1523066134, 416118573, -1554371402, -117777497, 383414059, -751582233, -486225926});
          mg.field_j[4] = new RgbSprite(640, 480);
          mg.field_j[4].c();
          var10 = var8_array.length >> 2;
          var11_int = -1 + SoftwareRasterizer.field_j.length;
          while (var11_int >= 0) {
            SoftwareRasterizer.field_j[var11_int] = var8_array[var8_array.length + (-1 - AccountCreationResultPanel.a(var10, -2147483648, var9))];
            var11_int--;
            if (var46 == 0) {
              continue;
            }
            break;
          }
          var11 = new RgbSprite(1, 40);
          var12_int = 0;
          scanLoop1: while (var12_int < SoftwareRasterizer.field_l) {
            var13_int = 0;
            while (true) {
              if (10 > var13_int) {
                var14 = AccountCreationResultPanel.a(SoftwareRasterizer.field_g, -2147483648, var9);
                var15_int = 5 + AccountCreationResultPanel.a(12, -2147483648, var9);
                var16_int = var8_array[(var8_array.length >> 1) + AccountCreationResultPanel.a(var8_array.length >> 1, -2147483648, var9)];
                var17_int = var8_array[var10];
                var11.c();
                SoftwareRasterizer.clearRaster();
                SoftwareRasterizer.fillRectangleVerticalGradient(0, 20 - var15_int, 1, var15_int, var16_int, var17_int);
                SoftwareRasterizer.fillRectangleVerticalGradient(0, 20, 1, var15_int, var17_int, var16_int);
                mg.field_j[4].c();
                var11.e(var12_int, var14 - 20, AccountCreationResultPanel.a(56, -2147483648, var9) + 200);
                var13_int++;
                if (var46 == 0) {
                  continue;
                }
              } else {
                var12_int++;
              }
              break;
            }
            if (var46 == 0) {
              continue scanLoop1;
            }
            break;
          }
          var12 = new RgbSprite(640, 480);
          var12.c();
          SoftwareRasterizer.fillRectangleVerticalGradient(0, 0, 640, 300, 21670, 39641);
          var13 = lh.a("canyonmask", mh.field_c, "", 127);
          var14Lifetime1 = var13.field_c;
          var13.field_f = var13.field_b;
          var13.field_c = 0;
          di.a(var13, 4997716, 0, 5000797, 13449, var14Lifetime1);
          SoftwareRasterizer.fillRectangleVerticalGradient(0, 316, 640, 164, 5066333, 9336387);
          var15 = DelegatingCanvas.a(-127, "cloud1mask", "", mh.field_c);
          var16 = DelegatingCanvas.a(-127, "cloud2mask", "", mh.field_c);
          var17 = DelegatingCanvas.a(-128, "cloud3mask", "", mh.field_c);
          var18 = DelegatingCanvas.a(-127, "cloud4mask", "", mh.field_c);
          var19 = DelegatingCanvas.a(-126, "cloud5mask", "", mh.field_c);
          var20 = DelegatingCanvas.a(-127, "cloud6mask", "", mh.field_c);
          var21 = DelegatingCanvas.a(-127, "cloud7mask", "", mh.field_c);
          var22 = DelegatingCanvas.a(-128, "menucactus", "", mh.field_c);
          var23 = DelegatingCanvas.a(-127, "logocactus", "", mh.field_c);
          TextFieldValidator.field_i = DelegatingCanvas.a(-128, "screw", "", mh.field_c);
          d.field_u[0] = var12.b();
          d.field_u[0].c();
          re.a(16777215, 0, 0, (byte) 111, var16);
          re.a(16777215, 0, 0, (byte) 118, var17);
          re.a(16777215, 0, 0, (byte) 60, var18);
          re.a(16777215, 0, 0, (byte) 102, var19);
          var22.d(0, 0);
          var23.d(0, 0);
          DelegatingCanvas.a(-128, "maintitle", "", mh.field_c).d(0, 0);
          DelegatingCanvas.a(-126, "mmextra1", "", mh.field_c).d(0, 0);
          DelegatingCanvas.a(-128, "mmextra2", "", mh.field_c).d(0, 0);
          d.field_u[1] = var12.b();
          d.field_u[1].c();
          re.a(16777215, 0, 0, (byte) 71, var16);
          re.a(16777215, 0, 0, (byte) 94, var17);
          re.a(16777215, 0, 0, (byte) 118, var20);
          var22.d(0, 0);
          var23.d(0, 0);
          DelegatingCanvas.a(-128, "pausetitle", "", mh.field_c).d(0, 0);
          DelegatingCanvas.a(-126, "pmextra1", "", mh.field_c).d(0, 0);
          DelegatingCanvas.a(-128, "pmextra2", "", mh.field_c).d(0, 0);
          d.field_u[2] = DelegatingCanvas.a(-126, "titlescreen", "", mh.field_c);
          d.field_u[3] = var12.b();
          d.field_u[3].c();
          SoftwareRasterizer.setClip(153, 105, 491, 397);
          mg.field_j[4].b(0, 0);
          SoftwareRasterizer.resetClip();
          SoftwareRasterizer.fillRectangle(169, 121, 308, 261, 16777215);
          ek.a((byte) 92, 11173684, 2955525, 5122825, 103, 8475405, 296, 151, 342);
          TextFieldValidator.field_i.d(174, 128);
          TextFieldValidator.field_i.d(461, 128);
          TextFieldValidator.field_i.d(176, 363);
          TextFieldValidator.field_i.d(461, 363);
          var23.d(4, -38);
          DelegatingCanvas.a(-127, "insttitle", "", mh.field_c).d(0, 0);
          DelegatingCanvas.a(-126, "instextra1", "", mh.field_c).d(0, 0);
          DelegatingCanvas.a(-128, "instextra2", "", mh.field_c).d(0, 0);
          DelegatingCanvas.a(-126, "instextra3", "", mh.field_c).d(0, 0);
          Crc32Table.field_d = new RgbSprite[9];
          var24 = new RgbSprite(640, 480);
          var24.c();
          mg.field_j[4].b(0, 0);
          SoftwareRasterizer.fillRectangle(18, 18, 604, 444, 16777215);
          ek.a((byte) 92, 11173684, 2955525, 5122825, 0, 8475405, 480, 0, 640);
          TextFieldValidator.field_i.d(23, 25);
          TextFieldValidator.field_i.d(-TextFieldValidator.field_i.field_p + 617, 25);
          TextFieldValidator.field_i.d(23, 455 - TextFieldValidator.field_i.field_o);
          TextFieldValidator.field_i.d(-TextFieldValidator.field_i.field_p + 617, -2 + (457 - TextFieldValidator.field_i.field_o));
          var25 = 1 + (23 + TextFieldValidator.field_i.field_p);
          var26 = 1 + (25 + TextFieldValidator.field_i.field_o);
          Crc32Table.field_d[0] = new RgbSprite(var25, var26);
          Crc32Table.field_d[2] = new RgbSprite(var25, var26);
          Crc32Table.field_d[6] = new RgbSprite(var25, var26);
          Crc32Table.field_d[8] = new RgbSprite(var25, var26);
          Crc32Table.field_d[1] = new RgbSprite(640 - var25 * 2, var26);
          Crc32Table.field_d[7] = new RgbSprite(-(2 * var25) + 640, var26);
          Crc32Table.field_d[3] = new RgbSprite(var25, 480 - 2 * var26);
          Crc32Table.field_d[5] = new RgbSprite(var25, 480 - 2 * var26);
          Crc32Table.field_d[4] = new RgbSprite(-(var25 * 2) + 640, -(var26 * 2) + 480);
          RgbSprite.a(var24, Crc32Table.field_d[0], 0, 0, 0, 0, var25, var26);
          RgbSprite.a(var24, Crc32Table.field_d[2], 640 - var25, 0, 0, 0, var25, var26);
          RgbSprite.a(var24, Crc32Table.field_d[6], 0, -var26 + 480, 0, 0, var25, var26);
          RgbSprite.a(var24, Crc32Table.field_d[8], -var25 + 640, -var26 + 480, 0, 0, var25, var26);
          RgbSprite.a(var24, Crc32Table.field_d[1], var25, 0, 0, 0, 640 - 2 * var25, var26);
          RgbSprite.a(var24, Crc32Table.field_d[7], var25, 480 - var26, 0, 0, 640 - 2 * var25, var26);
          RgbSprite.a(var24, Crc32Table.field_d[3], 0, var26, 0, 0, var25, -(2 * var26) + 480);
          RgbSprite.a(var24, Crc32Table.field_d[5], -var25 + 640, var26, 0, 0, var25, -(2 * var26) + 480);
          RgbSprite.a(var24, Crc32Table.field_d[4], var25, var26, 0, 0, -(var25 * 2) + 640, 480 - var25 * 2);
          var24_ref = null;
          d.field_u[4] = var12.b();
          d.field_u[4].c();
          re.a(16777215, 0, 0, (byte) 83, var15);
          re.a(16777215, 0, 0, (byte) 111, var16);
          re.a(16777215, 0, 0, (byte) 118, var17);
          re.a(16777215, 0, 0, (byte) 52, var18);
          re.a(16777215, 0, 0, (byte) 78, var19);
          re.a(16777215, 0, 0, (byte) 74, var20);
          DelegatingCanvas.a(-128, "achtitle", "", mh.field_c).d(0, 0);
          var27 = DelegatingCanvas.a(-127, "achextra2", "", mh.field_c);
          var27.d(0, 0);
          var23.d(0, -38);
          SoftwareRasterizer.setClip(225, 93, 589, 407);
          mg.field_j[4].b(0, 0);
          SoftwareRasterizer.resetClip();
          SoftwareRasterizer.fillRectangle(236, 103, 343, 291, 16777215);
          ek.a((byte) 92, 11173684, 2955525, 5122825, 91, 8475405, 318, 223, 368);
          TextFieldValidator.field_i.d(242, 109);
          TextFieldValidator.field_i.d(562, 109);
          TextFieldValidator.field_i.d(243, 374);
          TextFieldValidator.field_i.d(562, 374);
          bd.field_H = var12.b();
          bd.field_H.c();
          var23.d(0, 0);
          re.a(16777215, 0, 0, (byte) 71, var15);
          re.a(16777215, 0, 0, (byte) 94, var16);
          re.a(16777215, 0, 0, (byte) 59, var17);
          re.a(16777215, 0, 0, (byte) 65, var18);
          re.a(16777215, 0, 0, (byte) 103, var20);
          re.a(16777215, 0, 0, (byte) 100, var21);
          DelegatingCanvas.a(-128, "ropeout", "", mh.field_c).d(0, 0);
          DelegatingCanvas.a(-128, "ropein", "", mh.field_c).e(0, 0, 116);
          SoftwareRasterizer.fillRectangle(198, 33, 415, 415, 1);
          ek.a((byte) 92, 10274800, 269877, 538209, 31, 5671872, 419, 196, 419);
          a.a(16777215, vk.field_j, -1, 39, 6697779, 113);
          a.a(16777215, tj.field_D, -1, 98, 6697779, 162);
          a.a(16777215, ti.field_b, -1, 15, 6697779, 262);
          a.a(16777215, uc.field_o, -1, 36, 6697779, 313);
          f.field_a = var12.b();
          f.field_a.c();
          re.a(16777215, 0, 0, (byte) 100, var15);
          re.a(16777215, 0, 0, (byte) 90, var16);
          re.a(16777215, 0, 0, (byte) 106, var17);
          re.a(16777215, 0, 0, (byte) 57, var18);
          re.a(16777215, 0, 0, (byte) 116, var20);
          var23.d(0, -38);
          var27.d(-5, 0);
          SoftwareRasterizer.fillRectangle(198, 33, 415, 415, 1);
          ek.a((byte) 92, 10274800, 269877, 538209, 31, 5671872, 419, 196, 419);
          gf.field_e.setAsRasterTarget(200);
          tc.field_a = new RgbSprite[9];
          var28 = new RgbSprite(2, 2);
          var29 = var28.field_r;
          var30 = var28.field_r;
          var28.field_r[3] = 7750664;
          var31 = var28.field_r;
          var31[2] = 7750664;
          var29[0] = 7750664;
          var30[1] = 7750664;
          var32_int = 0;
          do {
            if (var32_int >= 9) {
              tc.field_a[4] = null;
              g.field_C = new RgbSprite[9];
              g.field_C[0] = new RgbSprite(2, 2);
              break;
            }
            tc.field_a[var32_int] = var28;
            var32_int++;
          } while (var46 == 0);
          var32 = g.field_C[0].field_r;
          g.field_C[0].field_r[2] = 12217600;
          var33 = g.field_C[0].field_r;
          var33[1] = 12217600;
          var32[0] = 12217600;
          g.field_C[0].field_r[3] = 7619584;
          g.field_C[1] = new RgbSprite(2, 2);
          g.field_C[1].field_r[1] = 12217600;
          var34 = g.field_C[1].field_r;
          var34[0] = 12217600;
          g.field_C[1].field_r[3] = 7619584;
          var35 = g.field_C[1].field_r;
          var35[2] = 7619584;
          g.field_C[2] = new RgbSprite(2, 2);
          g.field_C[2].field_r[1] = 12217600;
          var36 = g.field_C[2].field_r;
          var36[0] = 12217600;
          g.field_C[2].field_r[2] = 7619584;
          g.field_C[2].field_r[3] = 3548426;
          g.field_C[3] = new RgbSprite(2, 2);
          g.field_C[3].field_r[2] = 12217600;
          var37 = g.field_C[3].field_r;
          var37[0] = 12217600;
          g.field_C[3].field_r[3] = 7619584;
          var38 = g.field_C[3].field_r;
          var38[1] = 7619584;
          g.field_C[5] = new RgbSprite(2, 2);
          g.field_C[5].field_r[2] = 5059597;
          var39 = g.field_C[5].field_r;
          var39[0] = 5059597;
          var40 = g.field_C[5].field_r;
          g.field_C[5].field_r[3] = 3548426;
          var40[1] = 3548426;
          g.field_C[6] = new RgbSprite(2, 2);
          g.field_C[6].field_r[2] = 12217600;
          var41 = g.field_C[6].field_r;
          g.field_C[6].field_r[1] = 7619584;
          var41[0] = 12217600;
          g.field_C[6].field_r[3] = 3548426;
          g.field_C[7] = new RgbSprite(2, 2);
          var42 = g.field_C[7].field_r;
          g.field_C[7].field_r[1] = 5059597;
          var42[0] = 5059597;
          var43 = g.field_C[7].field_r;
          g.field_C[7].field_r[3] = 3548426;
          var43[2] = 3548426;
          g.field_C[8] = new RgbSprite(2, 2);
          g.field_C[8].field_r[0] = 5059597;
          var44 = g.field_C[8].field_r;
          g.field_C[8].field_r[3] = 3548426;
          var45 = g.field_C[8].field_r;
          var45[2] = 3548426;
          mh.field_c = null;
          var44[1] = 3548426;
          stackIn_106_0 = 1;
          return stackIn_106_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var3_ref2), "Main.GA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var3 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException decompiledCaughtException = null;
        var3 = field_T;
        try {
          Main.u(-24711);
          hh.a(20364);
          IntrusiveDeque.clearStaticReferences(false);
          ResourceArchive.clearStaticReferences(124);
          fb.clearStaticReferences(8);
          mh.clearStaticReferences((byte) -41);
          pk.clearStaticReferences(8450);
          ve.clearStaticReferences(param0 + 8192);
          sh.clearStaticReferences(4352);
          c.g((byte) 108);
          ClientException.clearStaticReferences((byte) -118);
          GameApplet.a((byte) -67);
          rf.clearStaticReferences(param0 ^ -19749);
          MouseInputHandler.a((byte) 98);
          MouseWheelInput.a(87);
          SoftwareRasterizer.clearStaticReferences();
          ee.clearStaticReferences();
          wh.clearStaticReferences(120);
          ii.resetStaticState(4308);
          PacketBuffer.resetStaticState((byte) 111);
          id.a(true);
          sd.clearStaticReferences((byte) 39);
          kg.clearStaticReferences((byte) 84);
          ll.clearStaticReferences(0);
          mc.a(8192);
          hb.clearStaticReferences(true);
          ia.clearStaticReferences(-12765);
          bi.resetStaticState(param0 ^ 121);
          lf.clearStaticReferences(param0 - 10584);
          vk.resetStaticState(1);
          gg.clearStaticReferences(false);
          ij.clearStaticReferences(3);
          bc.resetStaticState(false);
          FrameTimer.resetStaticState(0);
          AwtRasterBuffer.clearStaticReferences(192);
          gf.clearStaticReferences((byte) 103);
          FullscreenFocusCanvas.clearStaticReferences((byte) 127);
          bj.clearStaticReferences(-113);
          ah.clearStaticReferences(param0 ^ -38);
          uf.clearStaticReferences();
          re.clearStaticReferences(-4);
          DiskCacheWorker.clearStaticReferences((byte) 14);
          eb.clearStaticReferences(true);
          BufferedRandomAccessFile.resetStaticState(~param0);
          BufferedSocket.resetStaticState((byte) 23);
          gi.clearStaticReferences(1159353185);
          AudioOutput.clearStaticReferences();
          oj.resetStaticState((byte) -105);
          lh.clearStaticReferences(7865);
          cj.clearStaticReferences((byte) 110);
          vg.clearStaticReferences((byte) -72);
          sb.a(false);
          d.clearStaticReferences(true);
          GzipInflater.a((byte) -117);
          pe.clearStaticReferences((byte) -72);
          wf.a(param0 ^ 3);
          al.clearStaticReferences((byte) -70);
          hk.a(121);
          j.releaseDeclaredStaticReferences(param0 + 46);
          AccountCreationResultPanel.resetStaticState(-2113);
          rk.clearStaticReferences((byte) -30);
          AccountRegistrationPanel.clearDeclaredStaticReferences(-23573);
          tj.clearDeclaredStaticReferences(0);
          LoginPanel.clearDeclaredStaticReferences(false);
          DisplayNameSelectionPanel.clearDeclaredStaticReferences(200);
          jk.clearStaticReferences((byte) -63);
          aj.clearStaticReferences(83);
          th.resetStaticState(true);
          hd.clearStaticReferences();
          ig.clearStaticReferences();
          VorbisFloor.clearStaticReferences();
          da.clearStaticReferences(-1703274388);
          vb.clearStaticReferences(-1);
          rj.resetStaticState(param0 ^ 72);
          me.a((byte) -128);
          tc.a((byte) -119);
          uk.a((byte) 96);
          SpriteGeometry.clearStaticReferences(-11);
          sj.clearStaticReferences(0);
          cf.clearStaticReferences((byte) 72);
          ik.clearStaticReferences();
          oa.clearStaticReferences((byte) 109);
          nl.a(10000);
          od.clearStaticReferences(-28178);
          fe.a(17449);
          BitPacketBuffer.clearStaticReferences(106);
          i.clearStaticReferences(62);
          sk.clearStaticReferences(-12865);
          ke.clearStaticReferences((byte) -124);
          ByteArrayStore.clearStaticReferences(-118);
          ri.clearStaticReferences(-2);
          Bzip2Decompressor.clearStaticReferences();
          Bzip2State.clearStaticReferences(param0 + 18002);
          a.resetStaticState(param0 ^ -14282);
          cd.clearStaticReferences((byte) 104);
          NetworkArchiveRequest.clearStaticReferences(false);
          SectorCacheStore.clearStaticReferences(true);
          DiskArchiveRequest.clearStaticReferences(-78);
          uc.b(param0 ^ 0);
          ud.clearStaticReferences(21316);
          ArchiveRequest.clearStaticReferences((byte) 103);
          kk.clearStaticReferences(false);
          eg.clearStaticReferences((byte) 38);
          ek.clearStaticReferences((byte) 61);
          jb.clearStaticReferences();
          ok.clearStaticReferences(93);
          ha.clearStaticReferences(-124);
          mg.clearStaticReferences(40);
          sl.clearStaticReferences(-3);
          wg.clearStaticReferences((byte) 126);
          jh.clearStaticReferences((byte) 51);
          nf.resetStaticState(param0 ^ 17);
          mb.clearStaticReferences(1024);
          ma.clearStaticReferences(-47);
          kj.clearDeclaredStaticReferences((byte) 45);
          ph.clearStaticReferences(param0 + 62);
          wd.clearStaticReferences(true);
          fd.b((byte) 3);
          ti.clearStaticReferences(true);
          db.clearStaticReferences(0);
          tb.a(param0 + 128);
          mj.a((byte) 126);
          lk.clearStaticReferences(0);
          hl.clearDeclaredStaticReferences((byte) -69);
          qg.clearDeclaredStaticReferences(80);
          jc.clearDeclaredStaticReferences(42);
          qf.n(param0 + 8736);
          g.clearStaticReferences(true);
          qd.resetStaticState(param0 ^ -2057);
          ji.a(-61);
          kb.clearStaticReferences(480);
          vd.clearStaticReferences(69);
          ra.resetStaticState(250);
          ja.clearStaticReferences((byte) -113);
          pg.clearStaticReferences((byte) -85);
          ni.clearStaticReferences((byte) -35);
          ue.clearStaticReferences(4);
          f.a(-663255224);
          ca.clearStaticReferences((byte) 127);
          tl.clearStaticReferences(80);
          ProxyAuthenticationRequiredException.a(param0 + 0);
          NanoFrameTimer.resetDeclaredStaticState(param0 ^ 10);
          ImageProducerRasterBuffer.resetStaticState(param0 ^ -14143);
          hi.clearStaticReferences(0);
          PcmOutputWorker.b(true);
          dd.clearStaticReferences(false);
          ck.clearStaticReferences((byte) 41);
          EditableTextField.o(-31141);
          ta.clearStaticReferences((byte) 116);
          ng.resetStaticState(2);
          bd.resetStaticState(-10790);
          dg.clearDeclaredStaticReferences(param0 ^ -74);
          gl.clearDeclaredStaticReferences(1);
          pa.clearStaticReferences((byte) -78);
          ua.clearDeclaredStaticReferences(72);
          TextFieldValidator.clearStaticReferences(1);
          s.clearStaticReferences(30235);
          qe.clearStaticReferences((byte) 73);
          se.clearDeclaredStaticReferences(param0 ^ 87);
          h.clearDeclaredStaticReferences(-26526);
          SoundFilter.clearStaticReferences();
          pj.clearStaticReferences(param0 ^ -18178);
          e.resetStaticState(-560430640);
          dj.clearStaticReferences(52);
          lc.b(param0 + 91);
          bf.clearStaticReferences((byte) -121);
          DirectByteArrayStore.clearDeclaredStaticReferences(0);
          ub.d(-126);
          fl.clearStaticReferences(param0 ^ 31237);
          qi.d((byte) 77);
          wc.releaseDeclaredStaticReferences(param0 - 21693);
          de.resetStaticState(false);
          IterableNodeHashTable.resetStaticState(3663);
          tf.g(-1);
          q.c(0);
          Crc32Table.clearStaticReferences(120);
          NodeHashTableIterator.b((byte) 38);
          cb.clearStaticReferences(-1962269296);
          nb.clearStaticReferences(-98);
          r.b(19017);
          rl.c((byte) -98);
          n.clearStaticReferences((byte) -89);
          uh.clearStaticReferences(param0 ^ -12908);
          ad.clearStaticReferences(95);
          bl.clearStaticReferences((byte) 114);
          aa.d((byte) -49);
          t.clearStaticReferences(0);
          rc.resetStaticState((byte) 112);
          dh.resetStaticState((byte) -36);
          AccountRequestState.clearStaticReferences(178313985);
          AccountServiceResult.clearStaticReferences(2);
          lb.clearStaticReferences(640);
          cc.resetStaticState((byte) 107);
          kf.clearStaticReferences((byte) 110);
          ui.clearDeclaredStaticReferences(-22742);
          qa.clearStaticReferences((byte) -31);
          mi.clearStaticReferences(-3731);
          rb.clearDeclaredStaticReferences(-107);
          jl.clearStaticReferences((byte) 126);
          ml.clearStaticReferences(param0 + 107);
          pf.clearStaticReferences(param0 ^ -26);
          rh.b((byte) -109);
          dl.a(param0 + 8996);
          gh.clearStaticReferences(256);
          oc.clearStaticReferences(-41);
          di.a(-1);
          AccountNameAvailabilityValidator.resetStaticState(param0 ^ 0);
          PasswordValidator.clearStaticReferences((byte) 110);
          EmailFormatValidator.c(true);
          ConfirmedEmailAvailabilityValidator.clearDeclaredStaticReferences(param0 ^ 0);
          AgeValidator.clearDeclaredStaticReferences(50);
          MatchingFieldValidator.clearStaticReferences(true);
          td.clearStaticReferences((byte) 53);
          fk.clearStaticReferences(-30530);
          sg.clearStaticReferences(511);
          nc.a(param0);
          this.field_H = null;
          this.field_P = null;
          this.field_I = null;
          this.field_cb = null;
          this.field_Z = null;
          this.field_E = null;
          this.field_t = null;
          this.field_X = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) runtimeException), "Main.FA(" + param0 + ')');
        }
        if (var3 != 0) {
          stackIn_11_0 = (!GameApplet.field_g);
          GameApplet.field_g = stackIn_11_0;
        }
    }

    final void b(byte param0) {
        Object stackIn_7_0 = null;
        Object stackIn_13_0 = null;
        boolean stackIn_13_1 = false;
        boolean stackIn_14_2 = false;
        boolean stackIn_48_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = field_T;
        try {
          if (param0 != 59) {
            return;
          }
          if (null == DiskCacheWorker.field_a) {
            stackIn_7_0 = tb.field_c;
          } else {
            stackIn_7_0 = DiskCacheWorker.field_a;
          }
          var2 = stackIn_7_0;
          if (th.a(true)) {
            stackIn_13_0 = var2;
            stackIn_13_1 = false;
            if (DiskCacheWorker.field_a == null) {
              stackIn_14_2 = r.field_q;
            } else {
              stackIn_14_2 = true;
            }
            ImageProducerRasterBuffer.a((java.awt.Canvas) (stackIn_13_0), stackIn_13_1, stackIn_14_2);
            return;
          }
          if (!MatchingFieldValidator.field_k) {
            nl.a((java.awt.Canvas) (var2), param0 - 164);
            return;
          }
          if (null != ra.field_d) {
            ug.a(100.0f, 113, tb.field_e);
            nl.a((java.awt.Canvas) (var2), param0 + 34);
            return;
          }
          SoftwareRasterizer.clearRaster();
          if (ff.field_b != -1) {
            this.q((byte) -111);
            if (var6 != 0) {
              if (-1 == dj.field_a) {
                this.b(0, param0 - 57);
                this.field_E[dj.field_a].a(0, param0 ^ 59, 0);
              } else {
                this.field_E[dj.field_a].a(0, param0 ^ 59, 0);
              }
            }
          } else {
            if (-1 == dj.field_a) {
              this.b(0, param0 - 57);
              if (var6 != 0) {
                this.field_E[dj.field_a].a(0, param0 ^ 59, 0);
              }
            } else {
              this.field_E[dj.field_a].a(0, param0 ^ 59, 0);
            }
          }
          if (!eh.d(19314)) {
            if (MouseInputHandler.b(-128)) {
              if (null == DiskCacheWorker.field_a) {
                stackIn_48_0 = r.field_q;
              } else {
                stackIn_48_0 = true;
              }
              bf.a(stackIn_48_0, (byte) -8);
              if (var6 != 0) {
                SoftwareRasterizer.darkenRectangleHalf(0, 0, SoftwareRasterizer.field_l, SoftwareRasterizer.field_g);
                tc.a(param0 ^ -17180, Crc32Table.field_d, 26 + TextFieldValidator.field_i.field_o, 1 + (23 + TextFieldValidator.field_i.field_p));
                if (ff.field_b == 9) {
                  var3 = hb.field_d << 3;
                  var4 = qf.m(-32749);
                  var5 = ValidatedTextField.g((byte) -111);
                  if (0 < var3) {
                    SoftwareRasterizer.fillRectangleAlpha((-var4 + 640 >> 1) - 10, (480 - var5 >> 1) - 10, 20 + var4, 20 + var5, 0, var3);
                  }
                }
              }
            }
          } else {
            SoftwareRasterizer.darkenRectangleHalf(0, 0, SoftwareRasterizer.field_l, SoftwareRasterizer.field_g);
            tc.a(param0 ^ -17180, Crc32Table.field_d, 26 + TextFieldValidator.field_i.field_o, 1 + (23 + TextFieldValidator.field_i.field_p));
            if (ff.field_b == 9) {
              var3 = hb.field_d << 3;
              var4 = qf.m(-32749);
              var5 = ValidatedTextField.g((byte) -111);
              if (0 < var3) {
                SoftwareRasterizer.fillRectangleAlpha((-var4 + 640 >> 1) - 10, (480 - var5 >> 1) - 10, 20 + var4, 20 + var5, 0, var3);
              }
            }
          }
          kg.b((byte) 93);
          ll.a(0, (byte) 115, (java.awt.Canvas) (var2), 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2_ref), "Main.WA(" + param0 + ')');
        }
    }

    private final int o(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          if (dl.field_h == 1) {
            var2_int = -5 + (jc.field_N - 31);
            if (var2_int > 0 &&
              var2_int % 69 < 64) {
              var3 = var2_int / 69;
              if (var3 >= 6) {
                stackIn_9_0 = -1;
                return stackIn_9_0;
              }
              var4 = -5 + MouseInputHandler.field_a - 196;
              if (var4 > 0 &&
                var4 % 69 < 64) {
                var5 = var4 / 69;
                if (6 <= var5) {
                  stackIn_16_0 = -1;
                  return stackIn_16_0;
                }
                var6 = var3 * 6 + var5;
                if (this.field_H[var6] != -1) {
                  stackIn_19_0 = var6;
                  return stackIn_19_0;
                }
              }
            }
          }
          if (param0 == 30) {
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_22_0 = 88;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.VA(" + param0 + ')');
        }
    }

    private final void q(byte param0) {
        int stackIn_86_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RgbSprite var3_ref_kc = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RgbSprite var3_ref_kcLifetime1;
        int stackIn_86_0Lifetime1;
        var8 = field_T;
        try {
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var3 = ff.field_b;
          if ((9 != var3) &&
            (decompiledFrameRemainder1 = (var3 != 1)) &&
            (decompiledFrameRemainder2 = (var3 != 2 ||
            var8 != 0)) &&
            (decompiledFrameRemainder3 = (var3 != 5 ||
            var8 != 0)) &&
            (decompiledFrameRemainder4 = (var3 != 3 ||
            var8 != 0))) {
            if (var3 == 7 &&
              var8 == 0) {
              this.field_E[rk.field_X].a(0, 0, 0);
              td.field_c[-5 + dj.field_a].e(198, 33, -hb.field_d + 32 << 3);
              ArchiveRequest.field_k.b(347, 401);
              decompiledFrameRemainder5 = false;
            } else if (var3 != 4 ||
              var8 != 0) {
              if (6 == var3) {
                var3 = 24 * hb.field_d;
                SoftwareRasterizer.setClip(0, 0, 640, var3);
                this.field_E[rk.field_X].a(0, 0, 0);
                SoftwareRasterizer.setClip(0, var3, 640, 480);
                this.field_E[dj.field_a].a(0, 0, var3);
                SoftwareRasterizer.resetClip();
                decompiledFrameRemainder5 = (var8 != 0);
              } else {
                decompiledFrameRemainder5 = (var3 == 8);
                if (decompiledFrameRemainder5) {
                  decompiledFrameRemainder0 = (var8 == 0);
                }
              }
              if ((decompiledFrameRemainder5) &&
                (decompiledFrameRemainder0)) {
                this.field_E[rk.field_X].a(0, 0, 0);
                this.field_E[dj.field_a].a(hb.field_d, 0, 0);
                decompiledFrameRemainder5 = false;
              }
            }
            if ((decompiledFrameRemainder5) &&
              (decompiledFrameRemainder0)) {
              this.b(0, 2);
              if (rk.field_X == 7) {
                var3 = -hb.field_d + 68;
                var4 = hb.field_d * 2;
                var5 = 0;
                while (var5 < 6) {
                  var6 = -hb.field_d + 233;
                  stackIn_86_0 = 0;
                  var7 = stackIn_86_0;
                  while (6 > var7) {
                    this.field_I[0].b(var6, var3, var4, var4);
                    var6 += 69;
                    var7++;
                  }
                  var3 += 69;
                  var5++;
                }
              }
              var3_ref_kc = td.field_c[-5 + rk.field_X];
              var3_ref_kc.b(198 + hb.field_d * var3_ref_kc.field_p / 64, 33 + var3_ref_kc.field_o * hb.field_d / 64, var3_ref_kc.field_p * (-hb.field_d + 32) / 32, (-hb.field_d + 32) * var3_ref_kc.field_o / 32);
              ArchiveRequest.field_k.b(198 + (-hb.field_d + 32) * (-var3_ref_kc.field_p + 298) / 64 + var3_ref_kc.field_p / 2, 33 + (32 - hb.field_d) * (-var3_ref_kc.field_o + 736) / 64 + var3_ref_kc.field_o / 2, (32 - hb.field_d) * ArchiveRequest.field_k.field_p / 32, (32 - hb.field_d) * ArchiveRequest.field_k.field_o / 32);
              decompiledFrameRemainder5 = false;
            }
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            if (-1 == dj.field_a) {
              this.b(0, 2);
              if (var8 != 0) {
                this.field_E[dj.field_a].a(0, 0, 0);
              }
            } else {
              this.field_E[dj.field_a].a(0, 0, 0);
            }
            var2_int = hb.field_d << 3;
            decompiledFrameRemainder5 = !(0 >= var2_int);
            if (decompiledFrameRemainder5) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_l, SoftwareRasterizer.field_g, 0, var2_int);
              decompiledFrameRemainder5 = (var8 != 0);
            }
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            this.b(0, 2);
            this.field_E[rk.field_X].a(hb.field_d, 0, 0);
            decompiledFrameRemainder5 = (var8 != 0);
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            this.b(0, 2);
            this.field_E[rk.field_X].a(-hb.field_d + 32, 0, 0);
            decompiledFrameRemainder5 = (var8 != 0);
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            this.field_E[dj.field_a].a(0, 0, 0);
            this.field_E[rk.field_X].a(32 - hb.field_d, 0, 0);
            decompiledFrameRemainder5 = (var8 != 0);
          }
          if (decompiledFrameRemainder5) {
            this.b(0, 2);
            var3_ref_kcLifetime1 = td.field_c[-5 + rk.field_X];
            var3_ref_kcLifetime1.b(198 + (32 - hb.field_d) * var3_ref_kcLifetime1.field_p / 64, 33 + var3_ref_kcLifetime1.field_o * (-hb.field_d + 32) / 64, hb.field_d * var3_ref_kcLifetime1.field_p / 32, var3_ref_kcLifetime1.field_o * hb.field_d / 32);
            ArchiveRequest.field_k.b(var3_ref_kcLifetime1.field_p / 2 + (-var3_ref_kcLifetime1.field_p + 298) * hb.field_d / 64 + 198, 33 + ((-var3_ref_kcLifetime1.field_o + 736) * hb.field_d / 64 + var3_ref_kcLifetime1.field_o / 2), hb.field_d * ArchiveRequest.field_k.field_p / 32, hb.field_d * ArchiveRequest.field_k.field_o / 32);
          }
          stackIn_86_0Lifetime1 = param0;
          if (stackIn_86_0Lifetime1 >= -98) {
            this.field_S = -20L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.KA(" + param0 + ')');
        }
    }

    final static void l(byte param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = field_T;
        try {
          var1 = NetworkArchiveRequest.field_r;
          while (gl.b(true)) {
            var1.writeCipheredByte(8, 0);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            fl.a(var1, false);
            NetworkArchiveRequest.field_r.backpatchByteLength(-var2 + var1.position, 8049);
            if (var3 != 0) {
              return;
            }
          }
          if (param0 <= 75) {
            Main.a((Object) null, (PlatformTaskDispatcher) null, (byte) 100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var1_ref), "Main.AA(" + param0 + ')');
        }
    }

    private final static boolean a(byte param0, int[] param1) {
        boolean stackIn_36_0 = false;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        kf var5_ref_kf = null;
        int var5 = 0;
        int var6_int = 0;
        kf var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = field_T;
        try {
          if (ad.field_q != ra.field_b) {
            return false;
          }
          var2_int = -64 % ((-32 - param0) / 49);
          var3 = id.correctedCurrentTimeMillis(96);
          if (qf.field_G != 0 &&
            vd.field_u < 0) {
            var5_ref_kf = (kf) (jl.field_e.beginForward((byte) 74));
            if (var5_ref_kf != null &&
              var3 > var5_ref_kf.field_g) {
              var5_ref_kf.unlink(119);
              al.field_a = var5_ref_kf.field_i.length;
              EmailFormatValidator.field_j.position = 0;
              var6_int = 0;
              do {
                if (!(var6_int < al.field_a)) {
                  ni.field_d = SectorCacheStore.field_f;
                  SectorCacheStore.field_f = sb.field_a;
                  sb.field_a = pd.field_l;
                  pd.field_l = var5_ref_kf.field_h;
                  break;
                }
                EmailFormatValidator.field_j.payload[var6_int] = var5_ref_kf.field_i[var6_int];
                var6_int++;
              } while (var8 == 0);
              return true;
            }
          }
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (0 > vd.field_u) {
              EmailFormatValidator.field_j.position = 0;
              stackIn_36_0 = r.a(1, (byte) 126);
              decompiledFrameRemainder0 = (var8 == 0);
              if (decompiledFrameRemainder0) {
                if (!stackIn_36_0) {
                  return false;
                }
                vd.field_u = EmailFormatValidator.field_j.readCipheredByte((byte) -35);
                EmailFormatValidator.field_j.position = 0;
                al.field_a = param1[vd.field_u];
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_36_0 = gl.a(false);
            }
            if (!stackIn_36_0) {
              return false;
            }
            if (qf.field_G != 0) {
              var5 = qf.field_G;
              if (DebouncedFieldValidator.field_a != 0.0) {
                var5 = (int)((double)var5 + pg.field_a.nextGaussian() * DebouncedFieldValidator.field_a);
                if (var5 < 0) {
                  var5 = 0;
                }
              }
              var6 = new kf(var3 + (long)var5, vd.field_u, new byte[al.field_a]);
              var7 = 0;
              while (true) {
                if (al.field_a > var7) {
                  var6.field_i[var7] = EmailFormatValidator.field_j.payload[var7];
                  var7++;
                  if (var8 == 0) {
                    continue;
                  }
                } else {
                  jl.field_e.addLast(var6, 27362);
                  vd.field_u = -1;
                }
                break;
              }
              if (var8 == 0) {
                continue scanLoop1;
              }
            }
            break;
          }
          ni.field_d = SectorCacheStore.field_f;
          SectorCacheStore.field_f = sb.field_a;
          sb.field_a = pd.field_l;
          pd.field_l = vd.field_u;
          vd.field_u = -1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_61_0 = var2;
          stackIn_61_1 = new StringBuilder().append("Main.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(')').toString());
        }
    }

    public final void init() {
        try {
          this.a(480, "36cardtrick", 10);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "Main.init()");
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != 11246) {
            return;
          }
          hb.field_d = 0;
          ff.field_b = param2;
          rk.field_X = param1;
          this.p(-97283608);
          if (2 != param2 &&
            6 != param2 &&
            5 != param2 &&
            param2 != 8 &&
            param2 != 3 &&
            param2 != 7) {
            return;
          }
          this.field_E[param1].a(-31102, param3);
          this.field_E[param1].b(param0 - 11139);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var5), "Main.GB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int q(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 44 % ((param0 + 67) / 39);
          stackIn_1_0 = this.field_Y >> 12 & 15;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "Main.AB(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_118_1 = 0;
        byte[] stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        int stackIn_152_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = field_T;
        try {
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          this.field_db = this.field_db - 20;
          var2_int = this.field_U;
          if (var2_int != 2 ||
            var5 != 0) {
            if (var2_int == 4 &&
              var5 == 0) {
              if (0 >= this.field_J) {
                if (0 < this.field_K) {
                  this.field_K = this.field_K - 1;
                  af.field_ob = af.field_ob - 512;
                  AgeValidator.field_m = AgeValidator.field_m + 2;
                  ByteArrayStore.field_b = ByteArrayStore.field_b - (BufferedRandomAccessFile.field_c << 9);
                  rj.field_p = rj.field_p + (BufferedRandomAccessFile.field_c << 9);
                } else {
                  PacketBuffer.a(ve.field_c, param0 ^ 13426);
                  this.a(11246, 7, 3, false);
                }
              } else {
                ByteArrayStore.field_b = ByteArrayStore.field_b - (BufferedRandomAccessFile.field_c * dg.field_J << 7);
                this.field_J = this.field_J - 1;
                AgeValidator.field_m = AgeValidator.field_m + dg.field_J;
                rj.field_p = rj.field_p + ((BufferedRandomAccessFile.field_c + 1) * dg.field_J << 7);
                af.field_ob = af.field_ob - (dg.field_J << 7);
              }
              decompiledFrameRemainder2 = false;
            } else {
              decompiledFrameRemainder2 = (var2_int != 3 ||
                var5 != 0);
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder2 = (var2_int != 0)) &&
                (decompiledFrameRemainder2 = (var2_int == 1))) {
                decompiledFrameRemainder1 = (var5 == 0);
              }
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              var2_int = this.o((byte) 30);
              if (-1 != var2_int) {
                BufferedRandomAccessFile.field_a = BufferedRandomAccessFile.field_a + 1;
                jl.field_h = jl.field_h + bc.field_a;
                if (this.field_N == -1) {
                  this.field_N = var2_int;
                  this.field_R = dh.field_m;
                  if (0 == this.field_C) {
                    rc.a((byte) 111, 1);
                  } else {
                    rc.a((byte) 111, 0);
                  }
                } else if (~this.field_N == ~var2_int) {
                  if (this.field_C == 0) {
                    this.field_N = -1;
                    rc.a((byte) 111, 2);
                  }
                } else {
                  this.field_A = var2_int;
                  this.c(-1, 2);
                  this.field_S = dh.field_m;
                  if (this.field_C == 0) {
                    this.field_R = dh.field_m;
                  }
                  rc.a((byte) 111, 0);
                  if (this.field_H[this.field_A] != this.field_H[this.field_N]) {
                    var3 = 4 + sj.a(param0 + 10998, 4, uh.field_l);
                    if (var3 >= rb.field_g) {
                      var3++;
                    }
                    rb.field_g = var3;
                    if (this.field_J <= 0) {
                      stackIn_117_0 = 124;
                      if (1 != dg.field_J) {
                        stackIn_118_1 = 14;
                      } else {
                        stackIn_118_1 = 13;
                      }
                      hk.$cfr$intArgs$a$7ad285df57e9(stackIn_117_0, stackIn_118_1, 300);
                    } else {
                      hk.$cfr$intArgs$a$7ad285df57e9(125, var3, 300);
                    }
                    hk.$cfr$intArgs$a$7ad285df57e9(125, 0, 700);
                  } else {
                    hk.$cfr$intArgs$a$7ad285df57e9(127, 3, -Bzip2State.field_I[3] + 1000);
                    if (this.field_Q == 1) {
                      var3 = 10 + sj.a(10999, 3, uh.field_l);
                      hk.$cfr$intArgs$a$7ad285df57e9(124, var3, 1000);
                    }
                  }
                }
              } else {
                while (GzipInflater.b((byte) -114)) {
                  if (tb.field_d != 13) {
                    continue;
                  }
                  this.a(11246, 1, 2, false);
                  rk.a(false, lc.field_a[2], false);
                }
              }
              if (!(2 > NanoFrameTimer.field_f)) {
                this.field_L = GzipInflater.field_c[66];
                ImageProducerRasterBuffer.field_n = ImageProducerRasterBuffer.field_n | this.field_L;
                if (GzipInflater.field_c[25]) {
                  this.field_db = 1000;
                }
                if (!(!GzipInflater.field_c[51])) {
                  this.field_Q = 1;
                  ImageProducerRasterBuffer.field_n = true;
                  var3Lifetime2 = 0;
                  while (var3Lifetime2 < this.field_H.length) {
                    stackIn_151_0 = this.field_H;
                    stackIn_151_1 = var3Lifetime2;
                    if (1 < var3Lifetime2) {
                      stackIn_152_2 = -1;
                    } else {
                      stackIn_152_2 = 2;
                    }
                    stackIn_151_0[stackIn_151_1] = (byte) stackIn_152_2;
                    var3Lifetime2++;
                  }
                }
              }
              decompiledFrameRemainder2 = false;
            }
          }
          if (decompiledFrameRemainder2) {
            if (dh.field_m - this.field_S < 1000L) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            if (this.field_H[this.field_N] != this.field_H[this.field_A]) {
              this.field_O = 0;
              fieldTemp$0 = this.field_J - 1;
              this.field_J = this.field_J - 1;
              decompiledFrameRemainder0 = !(0 <= fieldTemp$0);
              if (decompiledFrameRemainder0) {
                this.c(param0 - 36, 0);
                decompiledFrameRemainder0 = (var5 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              var2 = this.field_H;
              var3Lifetime1 = this.field_N;
              this.field_H[this.field_A] = (byte) -1;
              var2[var3Lifetime1] = (byte) -1;
              var4 = 4 + dg.field_J;
              AgeValidator.field_m = AgeValidator.field_m + var4;
              af.field_ob = af.field_ob - (var4 << 7);
              rj.field_p = rj.field_p + (var4 << 7);
              var4 = var4 * BufferedRandomAccessFile.field_c << 7;
              bc.field_a = bc.field_a + 1;
              ByteArrayStore.field_b = ByteArrayStore.field_b - var4;
              ol.field_W = ol.field_W + BufferedRandomAccessFile.field_a;
              rj.field_p = rj.field_p + var4;
              fieldTemp$1 = this.field_Q - 1;
              this.field_Q = this.field_Q - 1;
              if (fieldTemp$1 == 0) {
                ByteArrayStore.field_b = ByteArrayStore.field_b - (BufferedRandomAccessFile.field_c * 50 << 7);
                af.field_ob = af.field_ob - 6400;
                AgeValidator.field_m = AgeValidator.field_m + 50;
                rj.field_p = rj.field_p + 6400;
                rj.field_p = rj.field_p + (BufferedRandomAccessFile.field_c * 50 << 7);
                this.c(-117, 4);
                return;
              }
              if (this.field_Q > 1) {
                this.field_O = this.field_O + 1;
                if (this.field_O >= 3 &&
                  this.field_O <= 5 &&
                  th.a(246 - this.field_O, param0 ^ 0, 9 + this.field_O)) {
                  this.field_X.addLast(new hh(9 + this.field_O), 27362);
                }
              }
            }
            if (this.field_U == 2) {
              this.field_F = this.field_F + this.field_eb;
              if (1 != this.field_Q &&
                2 <= this.field_F) {
                this.d(true);
                this.field_z = dh.field_m;
                this.c(param0 - 15, 3);
                if (var5 != 0) {
                  this.c(-119, 1);
                }
              } else {
                this.c(-119, 1);
              }
            }
          }
          if (param0 == 1) {
            return;
          }
          this.d(-109, 70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2_ref), "Main.CA(" + param0 + ')');
        }
    }

    public Main() {
        this.field_cb = null;
        this.field_P = null;
        this.field_D = 0;
        this.field_L = false;
        this.field_X = new IntrusiveDeque();
        this.field_B = 0;
        this.field_O = 0;
        this.field_C = 1;
        this.field_U = 0;
        this.field_Z = new String("0:00");
        this.field_R = -1000L + dh.field_m;
        this.field_N = -1;
        this.field_A = -1;
        this.field_S = -1000L + dh.field_m;
        this.field_H = new byte[36];
    }

    static {
        field_G = 0;
        field_y = "";
        field_M = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
