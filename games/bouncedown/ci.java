/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ci extends lc implements gl, rc {
    private boolean field_J;
    private String field_E;
    private wd field_H;
    private ba field_z;
    private ba field_I;
    private boolean field_B;
    private wd field_D;
    private wd field_K;
    static bc field_F;
    static tg[] field_G;
    private boolean field_C;
    static rg field_L;

    final void b(int param0, String param1) {
        if (param0 != 190) {
            boolean discarded$0 = ci.k(125);
        }
        ba var3 = ((ci) this).field_I;
        String var4 = param1;
        var3.a(false, var4, true);
        ((ci) this).field_z.h(117);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != ((ci) this).field_E) {
            int discarded$0 = sg.field_a.a(((ci) this).field_E, ((ci) this).field_r + (param3 + 20), 15 + (param1 + ((ci) this).field_i), -40 + ((ci) this).field_k, ((ci) this).field_m, 16777215, -1, 1, 0, sg.field_a.field_s);
        }
        if (((ci) this).field_H != null) {
            na.a(10 + param3, 134 + param1, ((ci) this).field_k + -20, 4210752);
        }
        super.a(param0, param1, 37, param3);
        if (param2 <= 33) {
            ((ci) this).field_C = true;
        }
    }

    final static void a(byte param0, gk param1) {
        int var3 = 0;
        int var4 = 0;
        jk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ii var8 = null;
        int var9 = 0;
        ii var10 = null;
        var7 = Bounce.field_N;
        var8 = new ii(param1.b("logo.fo3d", "", -88));
        var10 = var8;
        var3 = var10.d((byte) -124);
        var10.o(8);
        wi.field_g = lb.a(98, var10);
        li.field_e = new int[var3][];
        q.field_G = new jk[var3];
        var4 = 0;
        L0: while (true) {
          if (var3 <= var4) {
            var10.m(-91);
            var9 = 0;
            var4 = var9;
            L1: while (true) {
              if (var3 <= var9) {
                L2: {
                  if (param0 == -116) {
                    break L2;
                  } else {
                    boolean discarded$1 = ci.k(-56);
                    break L2;
                  }
                }
                return;
              } else {
                var5 = q.field_G[var9];
                var5.a((byte) -26, 6, 6, 6, 1);
                var5.a(true);
                var6 = new int[]{var5.field_n + var5.field_e >> -229321023, var5.field_N + var5.field_H >> 1528523553, var5.field_D + var5.field_R >> -1001305055};
                li.field_e[var9] = var6;
                var5.a(-var6[1], 126, -var6[2], -var6[0]);
                var9++;
                continue L1;
              }
            }
          } else {
            q.field_G[var4] = lf.a(var8, (byte) -111);
            var4++;
            continue L0;
          }
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        int var7 = 0;
        L0: {
          var7 = Bounce.field_N;
          if (param0 > 6) {
            break L0;
          } else {
            ((ci) this).field_J = false;
            break L0;
          }
        }
        L1: {
          if (param4 == ((ci) this).field_D) {
            this.b(false);
            break L1;
          } else {
            if (((ci) this).field_H != param4) {
              if (param4 != ((ci) this).field_K) {
                break L1;
              } else {
                if (((ci) this).field_J) {
                  hh.c((byte) -60);
                  break L1;
                } else {
                  if (((ci) this).field_B) {
                    oh.b(true);
                    break L1;
                  } else {
                    wk.h((byte) -124);
                    break L1;
                  }
                }
              }
            } else {
              ii.n(8);
              break L1;
            }
          }
        }
    }

    final String a(int param0) {
        if (null == ((ci) this).field_I.field_h) {
            return "";
        }
        if (param0 != 0) {
            ((ci) this).field_B = false;
        }
        return ((ci) this).field_I.field_h;
    }

    public static void a(boolean param0) {
        field_L = null;
        field_F = null;
        field_G = null;
        if (param0) {
            boolean discarded$0 = ci.k(29);
        }
    }

    ci(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (fc) null);
        jh var6 = null;
        tj var7 = null;
        String var8 = null;
        ph var9 = null;
        hb var12 = null;
        hb var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_15_0 = null;
        wd stackIn_15_1 = null;
        wd stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        wd stackIn_16_1 = null;
        wd stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        wd stackIn_17_1 = null;
        wd stackIn_17_2 = null;
        String stackIn_17_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_14_0 = null;
        wd stackOut_14_1 = null;
        wd stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        wd stackOut_16_1 = null;
        wd stackOut_16_2 = null;
        String stackOut_16_3 = null;
        Object stackOut_15_0 = null;
        wd stackOut_15_1 = null;
        wd stackOut_15_2 = null;
        String stackOut_15_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((ci) this).field_B = stackIn_3_1 != 0;
          ((ci) this).field_E = param1;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param3) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((ci) this).field_C = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param2) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((ci) this).field_J = stackIn_9_1 != 0;
          if (!((ci) this).field_J) {
            break L3;
          } else {
            L4: {
              if (((ci) this).field_C) {
                break L4;
              } else {
                if (!((ci) this).field_B) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          ((ci) this).field_I = (ba) (Object) new ti(param0, (sk) this, 100);
          ((ci) this).field_z = (ba) (Object) new ti("", (sk) this, 20);
          if (((ci) this).field_J) {
            ((ci) this).field_D = new wd(mh.field_W, (sk) null);
            ((ci) this).field_K = new wd(i.field_g, (sk) null);
            ((ci) this).field_I.field_y = false;
            break L5;
          } else {
            L6: {
              ((ci) this).field_D = new wd(bi.field_k, (sk) null);
              stackOut_14_0 = this;
              stackOut_14_1 = null;
              stackOut_14_2 = null;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              if (!((ci) this).field_B) {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = pe.field_h;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                stackIn_17_3 = stackOut_16_3;
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = null;
                stackOut_15_2 = null;
                stackOut_15_3 = bi.field_i;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_17_3 = stackOut_15_3;
                break L6;
              }
            }
            new wd(stackIn_17_3, (sk) null);
            ((ci) this).field_K = stackIn_17_1;
            if (!((ci) this).field_C) {
              break L5;
            } else {
              ((ci) this).field_H = new wd(gk.field_m, (sk) this);
              break L5;
            }
          }
        }
        L7: {
          ((ci) this).field_I.field_j = (fc) (Object) new tc(10000536);
          ((ci) this).field_z.field_j = (fc) (Object) new wg(10000536);
          var6 = new jh();
          ((ci) this).field_D.field_j = (fc) (Object) var6;
          if (null == ((ci) this).field_K) {
            break L7;
          } else {
            ((ci) this).field_K.field_j = (fc) (Object) var6;
            break L7;
          }
        }
        L8: {
          if (((ci) this).field_H == null) {
            break L8;
          } else {
            ((ci) this).field_H.field_j = (fc) (Object) var6;
            break L8;
          }
        }
        L9: {
          ((ci) this).field_I.field_q = hf.field_a;
          if (null == ((ci) this).field_H) {
            break L9;
          } else {
            ((ci) this).field_H.field_q = ge.field_a;
            break L9;
          }
        }
        L10: {
          if (((ci) this).field_J) {
            ((ci) this).field_K.field_q = mi.field_e;
            break L10;
          } else {
            if (!((ci) this).field_B) {
              ((ci) this).field_K.field_j = (fc) (Object) new r();
              break L10;
            } else {
              ((ci) this).field_K.field_q = nf.field_a;
              ((ci) this).field_K.field_j = (fc) (Object) new r();
              break L10;
            }
          }
        }
        L11: {
          ((ci) this).field_i = 15;
          var7 = sg.field_a;
          if (((ci) this).field_E == null) {
            break L11;
          } else {
            ((ci) this).field_i = ((ci) this).field_i + (5 + var7.b(((ci) this).field_E, ((ci) this).field_k - 40, var7.field_s));
            break L11;
          }
        }
        L12: {
          var8 = wj.field_b;
          var9 = ib.a(vi.b(0), (byte) -90);
          if (nj.field_k != var9) {
            if (w.field_g != var9) {
              break L12;
            } else {
              var8 = dl.field_a;
              break L12;
            }
          } else {
            var8 = ha.field_j;
            break L12;
          }
        }
        L13: {
          var12 = new hb(10, ((ci) this).field_i, ((ci) this).field_k + -20, 25, (lk) (Object) ((ci) this).field_I, false, 80, 3, var7, 16777215, var8);
          ((ci) this).b((lk) (Object) new hb(10, ((ci) this).field_i, ((ci) this).field_k + -20, 25, (lk) (Object) ((ci) this).field_I, false, 80, 3, var7, 16777215, var8), true);
          ((ci) this).field_i = ((ci) this).field_i + (5 + ((lk) (Object) var12).field_m);
          var13 = new hb(10, ((ci) this).field_i, -20 + ((ci) this).field_k, 25, (lk) (Object) ((ci) this).field_z, false, 80, 3, var7, 16777215, ae.field_d);
          ((ci) this).b((lk) (Object) new hb(10, ((ci) this).field_i, -20 + ((ci) this).field_k, 25, (lk) (Object) ((ci) this).field_z, false, 80, 3, var7, 16777215, ae.field_d), true);
          ((ci) this).field_D.field_n = (sk) this;
          ((ci) this).field_i = ((ci) this).field_i + (5 + ((lk) (Object) var13).field_m);
          if (((ci) this).field_H == null) {
            break L13;
          } else {
            ((ci) this).field_H.field_n = (sk) this;
            break L13;
          }
        }
        L14: {
          if (null == ((ci) this).field_K) {
            break L14;
          } else {
            ((ci) this).field_K.field_n = (sk) this;
            break L14;
          }
        }
        L15: {
          if (((ci) this).field_H != null) {
            ((ci) this).field_D.b(30, 80, -95 + ((ci) this).field_k, 85, ((ci) this).field_i);
            ((ci) this).field_i = ((ci) this).field_i + 60;
            break L15;
          } else {
            ((ci) this).field_D.b(30, 80, -10 + ((ci) this).field_k - 6, 8, ((ci) this).field_i);
            ((ci) this).field_i = ((ci) this).field_i + 35;
            break L15;
          }
        }
        L16: {
          if (null == ((ci) this).field_H) {
            break L16;
          } else {
            ((ci) this).field_H.b(30, 80, -6 + (((ci) this).field_k + -10), 8, ((ci) this).field_i);
            ((ci) this).field_i = ((ci) this).field_i + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((ci) this).field_K) {
            break L17;
          } else {
            L18: {
              if (((ci) this).field_J) {
                break L18;
              } else {
                if (!((ci) this).field_B) {
                  ((ci) this).field_K.b(20, 80, 40, 8, ((ci) this).field_i);
                  ((ci) this).field_i = ((ci) this).field_i + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((ci) this).field_K.b(30, 80, -10 + (-6 + ((ci) this).field_k), 8, ((ci) this).field_i);
            ((ci) this).field_i = ((ci) this).field_i + 35;
            break L17;
          }
        }
        L19: {
          ((ci) this).b(((ci) this).field_i + 3, 80, ((ci) this).field_k, 0, 0);
          ((ci) this).b((lk) (Object) ((ci) this).field_D, true);
          if (null == ((ci) this).field_H) {
            break L19;
          } else {
            ((ci) this).b((lk) (Object) ((ci) this).field_H, true);
            break L19;
          }
        }
        L20: {
          if (((ci) this).field_K == null) {
            break L20;
          } else {
            ((ci) this).b((lk) (Object) ((ci) this).field_K, true);
            break L20;
          }
        }
    }

    final void e(byte param0) {
        if (param0 != -100) {
            return;
        }
        ((ci) this).field_I.h(123);
        ((ci) this).field_z.h(param0 + 225);
    }

    public final void a(byte param0, ba param1) {
        int var3 = 12 / ((0 - param0) / 33);
        if (!(((ci) this).field_I != param1)) {
            boolean discarded$0 = ((ci) this).field_z.a((lk) this, false);
        }
        if (((ci) this).field_z == param1) {
            this.b(false);
        }
    }

    private final void b(boolean param0) {
        L0: {
          L1: {
            if (td.a(1)) {
              break L1;
            } else {
              if ((((ci) this).field_I.field_h.length() ^ -1) >= -1) {
                break L0;
              } else {
                if (0 >= ((ci) this).field_z.field_h.length()) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          rg.a(-8742, ((ci) this).field_I.field_h, ((ci) this).field_z.field_h);
          break L0;
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            ((ci) this).field_J = true;
            break L2;
          }
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        if (!super.a(param0, param1, param2, param3)) {
          if (98 != param2) {
            if (param2 != 99) {
              return false;
            } else {
              return ((ci) this).a(param0, 19755);
            }
          } else {
            return ((ci) this).a((byte) -102, param0);
          }
        } else {
          return true;
        }
    }

    final static boolean k(int param0) {
        Object var2 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == -31077) {
            break L0;
          } else {
            var2 = null;
            ci.a((byte) -62, (gk) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-21 < (sa.field_k ^ -1)) {
              break L2;
            } else {
              if (!hi.a((byte) -126)) {
                break L2;
              } else {
                L3: {
                  if (0 >= nb.field_d) {
                    break L3;
                  } else {
                    if (cg.a(param0 + 31078)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public final void a(ba param0, byte param1) {
        if (param1 < 81) {
            ((ci) this).field_I = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new bc();
    }
}
