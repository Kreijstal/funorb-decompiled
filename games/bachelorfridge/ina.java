/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ina extends bi {
    private boolean field_k;
    private kv field_l;
    static String field_r;
    private String field_m;
    static int[] field_o;
    static String field_s;
    private int field_t;
    private kv[] field_q;
    static sna field_n;
    private int field_p;

    final void j(int param0) {
        this.field_q = null;
        super.j(param0);
    }

    private final boolean f(int param0, int param1) {
        if (param1 < 71) {
            return true;
        }
        if (!this.field_k) {
            if (!(!this.b(param0, true))) {
                return true;
            }
            if (ng.a((byte) -24)) {
                if (!(!bia.field_f[param0])) {
                    return false;
                }
            }
            return !hp.a(param0, (byte) -99, lv.field_l) ? true : false;
        }
        return hp.a(param0, (byte) -102, nga.field_i);
    }

    public static void f(byte param0) {
        field_n = null;
        if (param0 >= -70) {
            return;
        }
        field_o = null;
        field_s = null;
        field_r = null;
    }

    final int a(int param0, int param1) {
        int var3 = -41 % ((param0 - -64) / 38);
        return 40;
    }

    final void l(int param0) {
        this.i(-12988);
        j.a(rc.field_k, 40, 16760896, true, 320, false);
        dg.a(40, 60, 342, 335, 20, 0, 80);
        dg.a(390, 60, 210, 335, 20, 0, 80);
        dg.a(399, 69, 192, 136, 11, 0, 80);
        this.e(true);
        this.p(param0 + -2);
        this.c(true);
        int discarded$18 = fn.field_n.a(kw.field_m, 89, 340, 250, 100, 10, -1, 1, 0, 12);
        if (param0 != 9) {
            this.field_m = (String) null;
        }
    }

    private final kv g(int param0, int param1) {
        if (this.b(param1, true)) {
            return og.field_a[param1];
        }
        if (param0 < 95) {
            return (kv) null;
        }
        return ona.field_yb;
    }

    final kv b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param1 > 62) {
          var3 = param0;
          if (var3 != 0) {
            if (var3 != 1) {
              throw new IllegalStateException();
            } else {
              return gj.field_F;
            }
          } else {
            return jt.field_g;
          }
        } else {
          return (kv) null;
        }
    }

    private final void e(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          var2 = this.e((byte) 126);
          var3 = -1;
          var4 = 0;
          var5 = -1;
          var6 = -1;
          if (param0) {
            break L0;
          } else {
            this.e(false);
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          if (var2 <= 0) {
            return;
          } else {
            L2: {
              L3: {
                if (0 == (var3 ^ -1)) {
                  break L3;
                } else {
                  if (var4 == 8) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                var4 = 0;
                var3++;
                if (-9 < (var2 ^ -1)) {
                  stackOut_9_0 = var2;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = 8;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              var8 = stackIn_10_0;
              var5 = 51 - -((8 - var8 >> -1608712511) * 40);
              var6 = 71 - -(44 * var3);
              break L2;
            }
            if (this.f(var7, 78)) {
              L5: {
                var8 = 0;
                if (var7 == this.field_t) {
                  var8 = 96 + (via.a(vr.field_b << 1457796326, (byte) 103) >> -329489077);
                  break L5;
                } else {
                  if (var7 != this.field_p) {
                    break L5;
                  } else {
                    var8 = (via.a(vr.field_b << -1992765530, (byte) 83) >> 1107757868) + 32;
                    break L5;
                  }
                }
              }
              L6: {
                if (0 == var8) {
                  break L6;
                } else {
                  this.e(18958, var7).d(var5 - -4, var6 + 4, var8);
                  break L6;
                }
              }
              this.g(97, var7).d(var5 - -4, var6 + 4);
              var5 += 40;
              var4++;
              var2--;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        L0: {
          if (param1) {
            break L0;
          } else {
            this.field_t = 105;
            break L0;
          }
        }
        var3 = param0;
        if (var3 == 0) {
          return 260;
        } else {
          if (var3 != 1) {
            throw new IllegalArgumentException();
          } else {
            return 475;
          }
        }
    }

    final void a(boolean param0, int param1) {
        super.a(param0, param1);
        this.field_p = -1;
        this.field_t = -1;
        this.field_q = new kv[rm.field_a];
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          if (param1 == 40) {
            break L0;
          } else {
            this.field_t = -3;
            break L0;
          }
        }
        var3 = param0;
        if (var3 != 0) {
          if (1 != var3) {
            throw new IllegalArgumentException();
          } else {
            return 600;
          }
        } else {
          return 450;
        }
    }

    private final void p(int param0) {
        int discarded$2 = 0;
        boolean discarded$3 = false;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        kv var8 = null;
        sba var9 = null;
        int var10_int = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var12 = BachelorFridge.field_y;
          if (this.field_t == -1) {
            stackOut_2_0 = this.field_p;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_t;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if ((var2 ^ -1) == 0) {
          return;
        } else {
          L1: {
            var3 = 41;
            var4 = var3 + 390;
            var5 = 73;
            this.g(125, var2).e(var4, var5);
            var6 = pp.field_g[var2];
            var7 = kla.field_y[var2];
            var8 = this.a(872364388, var6);
            var8.a((210 - var8.field_n >> -78911615) + 390, -(var8.field_o >> -462491423) + 235, 160);
            if (this.b(var2, true)) {
              fn.field_n.a(eo.field_g, 495, 265, 10, -1);
              break L1;
            } else {
              fn.field_n.a(ed.field_e, 495, 265, 10, -1);
              break L1;
            }
          }
          L2: {
            var9 = wt.field_k;
            discarded$2 = ((po) ((Object) var9)).a(var7, 400, 275, 190, 100, 16777215, -1, 3, 0, ((po) ((Object) var9)).field_u);
            var10_int = 0;
            if (param0 == 7) {
              break L2;
            } else {
              discarded$3 = this.c(8, -78);
              break L2;
            }
          }
          var11 = 405;
          L3: while (true) {
            if (on.field_u[var2] <= var10_int) {
              var10 = vl.field_a + Integer.toString(vi.field_d[var2]);
              jha.field_g.c(var10, 405, 380, 16777215, -1);
              return;
            } else {
              sw.field_p.e(var11, 330);
              var11 += 20;
              var10_int++;
              continue L3;
            }
          }
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var11 = BachelorFridge.field_y;
        var4 = this.e((byte) 125);
        var5 = -1;
        if (param0 <= -114) {
          var6 = 0;
          var7 = -1;
          var8 = -1;
          var9 = 0;
          L0: while (true) {
            if (var4 <= 0) {
              return -1;
            } else {
              L1: {
                L2: {
                  if ((var5 ^ -1) == 0) {
                    break L2;
                  } else {
                    if (8 == var6) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var6 = 0;
                  var5++;
                  if (8 > var4) {
                    stackOut_9_0 = var4;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = 8;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                var10 = stackIn_10_0;
                var7 = (-var10 + 8 >> 205846913) * 40 + 51;
                var8 = var5 * 44 + 71;
                break L1;
              }
              if (this.f(var9, 110)) {
                L4: {
                  if (param1 < var7) {
                    break L4;
                  } else {
                    if (param2 < var8) {
                      break L4;
                    } else {
                      if (40 + var7 <= param1) {
                        break L4;
                      } else {
                        if (param2 < 44 + var8) {
                          return var9;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                var4--;
                var7 += 40;
                var6++;
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return 93;
        }
    }

    final int a(int param0, byte param1) {
        int discarded$0 = 0;
        if (param1 >= -38) {
            discarded$0 = this.a(113, (byte) -5);
        }
        return 418;
    }

    private final kv e(int param0, int param1) {
        int[] var6 = null;
        int[] var3 = null;
        int var4_int = 0;
        kv var4 = null;
        int var5 = BachelorFridge.field_y;
        if (null == this.field_q[param1]) {
            var6 = new int[256];
            var3 = var6;
            for (var4_int = 0; (var4_int ^ -1) > -257; var4_int++) {
                var6[var4_int] = mp.a(var4_int << 1760001479, dda.a(4128768, var4_int << -841280466));
            }
            var4 = new kv(32, 32);
            bu.a(param0 ^ 18958, var4);
            this.g(121, param1).d(0, 0);
            db.b(109);
            this.field_q[param1] = of.a(var4, var3, false, 255, 91, 8);
        }
        if (param0 != 18958) {
            this.field_q = (kv[]) null;
        }
        return this.field_q[param1];
    }

    private final boolean b(int param0, boolean param1) {
        if (!param1) {
            this.l(-29);
        }
        return hp.a(param0, (byte) -121, sg.field_q);
    }

    final void e(int param0) {
        cq discarded$2 = null;
        int var2 = 0;
        L0: {
          this.field_p = this.a((byte) -117, mk.field_p, gd.field_m);
          if (1 != lf.field_c) {
            break L0;
          } else {
            discarded$2 = ol.a(kea.field_r[0], true);
            var2 = this.a((byte) -123, nfa.field_a, jc.field_r);
            if (this.field_t == var2) {
              this.field_t = -1;
              break L0;
            } else {
              if ((var2 ^ -1) == 0) {
                break L0;
              } else {
                this.field_t = var2;
                break L0;
              }
            }
          }
        }
        super.e(param0);
    }

    private final kv a(int param0, String param1) {
        RuntimeException var3 = null;
        fea var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        kv var7 = null;
        int var8 = 0;
        int var9 = 0;
        kv stackIn_3_0 = null;
        kv stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kv stackOut_12_0 = null;
        kv stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if (param0 == 872364388) {
              L1: {
                if (!param1.equals(this.field_m)) {
                  var3_ref = jha.field_g;
                  var4 = ((po) ((Object) var3_ref)).a(param1);
                  var5 = 30 + var4;
                  var6 = ((po) ((Object) var3_ref)).field_u << 219151521;
                  var7 = new kv(var5, var6);
                  bu.a(0, var7);
                  hp.a(var5, 0, (byte) 108, var6, de.field_A, 0);
                  var8 = 0;
                  L2: while (true) {
                    if (var7.field_v.length <= var8) {
                      this.field_l = (kv) ((Object) new pa(var5 << 1648454369, var6 << 1052437153));
                      this.field_l.b();
                      var8 = kla.a(768, m.field_a, -2147483648) - 384;
                      kh.a(false, var6 << -989908189, var5 << -1713753308, 4096, 4096, var6 << 872364388, var5 << 2052204611, var8, var7);
                      ((po) ((Object) var3_ref)).a(param1, var5, (9 * var6 >> -1814927261) - 2, -16711423, -1);
                      db.b(104);
                      this.field_l.d();
                      this.field_m = param1;
                      break L1;
                    } else {
                      L3: {
                        if (0 == var7.field_v[var8]) {
                          break L3;
                        } else {
                          var7.field_v[var8] = mp.a(var7.field_v[var8], -16777216);
                          break L3;
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              stackOut_12_0 = this.field_l;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = (kv) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("ina.N(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_13_0;
        }
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var2 = 0;
        if (param0 >= 108) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= rm.field_a) {
              return var2;
            } else {
              if (this.f(var3, 94)) {
                var2++;
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return 72;
        }
    }

    final boolean c(int param0, int param1) {
        if (!(bp.e(-29919))) {
            return param0 != 0 ? true : false;
        }
        if (param1 != 19950) {
            return true;
        }
        return true;
    }

    ina(boolean param0) {
        super(param0 ? 8 : 7);
        this.field_k = param0 ? true : false;
    }

    static {
        field_o = new int[]{55, 75, 75, 55, 65, 75};
        field_s = "Back";
        field_r = null;
    }
}
