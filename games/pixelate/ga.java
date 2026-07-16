/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ga {
    private int field_b;
    private int[] field_e;
    private int field_g;
    static int field_a;
    static int field_d;
    static int field_f;
    int field_c;

    final void a(int param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -18879) {
          return;
        } else {
          L0: {
            if (((ga) this).field_b == 0) {
              stackOut_3_0 = 16762115;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 65280;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var3 = stackIn_4_0;
            if (sh.field_f > ((ga) this).field_c) {
              var4 = ((ga) this).field_c * 35 / 1000;
              var5 = var4 >> 1771123489;
              fi.a(320, 349 + -var5, var4, oc.field_S, var3);
              t.f(0, -var5 + 355, 640, var4 / 2 + 343);
              break L1;
            } else {
              fi.a(320, 332, 35, oc.field_S, var3);
              break L1;
            }
          }
          rk.field_e.b(param1, 320, 360, 0, -1);
          t.c();
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        if (param0 <= -124) {
          L0: {
            if (!param1) {
              if ((((ga) this).field_c ^ -1) < -1) {
                ((ga) this).field_c = ((ga) this).field_c - ap.field_c;
                if (-1 < (((ga) this).field_c ^ -1)) {
                  ((ga) this).field_c = 0;
                  break L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (((ga) this).field_c < sh.field_f) {
                ((ga) this).field_c = ((ga) this).field_c + ap.field_a;
                if (sh.field_f >= ((ga) this).field_c) {
                  break L0;
                } else {
                  ((ga) this).field_c = sh.field_f;
                  return;
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        if (param2 < -68) {
          if ((param1 ^ -1) < -171) {
            if ((param1 ^ -1) > -315) {
              if (((ga) this).field_g < param0) {
                if (param0 >= 144 + ((ga) this).field_g) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(byte param0) {
        ((ga) this).field_c = 0;
        int var2 = -81 % ((21 - param0) / 63);
    }

    final void a(boolean param0) {
        if (!param0) {
          if ((((ga) this).field_c ^ -1) >= -1) {
            if (((ga) this).field_c < sh.field_f) {
              lg.field_d[((ga) this).field_b].b(72 + ((ga) this).field_g, 242, 0, ((ga) this).field_c + 4096 - sh.field_f);
              return;
            } else {
              lg.field_d[((ga) this).field_b].b(((ga) this).field_g, 170);
              return;
            }
          } else {
            t.a(72 + ((ga) this).field_g << -643224156, 3872, 600 + ((ga) this).field_c, -1 + ((ga) this).field_e.length, ((ga) this).field_e);
            if (((ga) this).field_c < sh.field_f) {
              lg.field_d[((ga) this).field_b].b(72 + ((ga) this).field_g, 242, 0, ((ga) this).field_c + 4096 - sh.field_f);
              return;
            } else {
              lg.field_d[((ga) this).field_b].b(((ga) this).field_g, 170);
              return;
            }
          }
        } else {
          ((ga) this).field_c = -4;
          if ((((ga) this).field_c ^ -1) < -1) {
            t.a(72 + ((ga) this).field_g << -643224156, 3872, 600 + ((ga) this).field_c, -1 + ((ga) this).field_e.length, ((ga) this).field_e);
            if (((ga) this).field_c < sh.field_f) {
              lg.field_d[((ga) this).field_b].b(72 + ((ga) this).field_g, 242, 0, ((ga) this).field_c + 4096 - sh.field_f);
              return;
            } else {
              lg.field_d[((ga) this).field_b].b(((ga) this).field_g, 170);
              return;
            }
          } else {
            if (((ga) this).field_c < sh.field_f) {
              lg.field_d[((ga) this).field_b].b(72 + ((ga) this).field_g, 242, 0, ((ga) this).field_c + 4096 - sh.field_f);
              return;
            } else {
              lg.field_d[((ga) this).field_b].b(((ga) this).field_g, 170);
              return;
            }
          }
        }
    }

    final static rk a(int param0, int param1) {
        double var2 = 1.0;
        var2 = var2 + (((double)param0 - (double)param1) / 16.0 + ((double)ok.a(tg.field_f, -99, 7) - 3.0) / 10.0);
        return new rk(1 + ok.a(tg.field_f, param1 ^ -102, 14), 10, of.a(var2, 65536));
    }

    final static void a(int param0, int param1, int param2, int param3, ak param4, ak param5, byte[] param6, int param7, int param8, ak param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        hn.field_f = -1L;
        oe.field_Rb = param6;
        um.field_k = param8;
        fj.field_b = param6.length;
        bn.field_S = null;
        rl.field_r = false;
        qm.field_J = new byte[(7 + um.field_k) / 8];
        io.field_c = null;
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          if (oe.field_Rb.length <= var11) {
            var10 = (7 + var10) / 8;
            k.field_k = new byte[var10];
            if (null != param5.field_L) {
              L1: {
                i.field_n = param5.field_L;
                i.field_n.e(param3 ^ -121);
                il.field_d = new vg(param1);
                ka.field_X = 0;
                ec.field_r = 0;
                gi.field_a = -1;
                ui.field_e = -1;
                if (param9.field_L != null) {
                  break L1;
                } else {
                  param9.field_L = new bb();
                  break L1;
                }
              }
              L2: {
                nk.field_a = param9.field_L;
                nk.field_a.e(123);
                dg.field_f = new vg(param2);
                if (null == param4.field_L) {
                  param4.field_L = new bb();
                  break L2;
                } else {
                  break L2;
                }
              }
              wi.field_a = param4.field_L;
              if (param3 != 3) {
                field_d = 20;
                wi.field_a.e(param3 ^ 91);
                eh.field_f = new vg(param7);
                bo.field_e = 0L;
                mh.field_b = param0;
                return;
              } else {
                wi.field_a.e(param3 ^ 91);
                eh.field_f = new vg(param7);
                bo.field_e = 0L;
                mh.field_b = param0;
                return;
              }
            } else {
              param5.field_L = new bb();
              i.field_n = param5.field_L;
              i.field_n.e(param3 ^ -121);
              il.field_d = new vg(param1);
              ka.field_X = 0;
              ec.field_r = 0;
              gi.field_a = -1;
              ui.field_e = -1;
              if (param9.field_L == null) {
                L3: {
                  param9.field_L = new bb();
                  nk.field_a = param9.field_L;
                  nk.field_a.e(123);
                  dg.field_f = new vg(param2);
                  if (null == param4.field_L) {
                    param4.field_L = new bb();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                wi.field_a = param4.field_L;
                if (param3 == 3) {
                  wi.field_a.e(param3 ^ 91);
                  eh.field_f = new vg(param7);
                  bo.field_e = 0L;
                  mh.field_b = param0;
                  return;
                } else {
                  field_d = 20;
                  wi.field_a.e(param3 ^ 91);
                  eh.field_f = new vg(param7);
                  bo.field_e = 0L;
                  mh.field_b = param0;
                  return;
                }
              } else {
                L4: {
                  nk.field_a = param9.field_L;
                  nk.field_a.e(123);
                  dg.field_f = new vg(param2);
                  if (null == param4.field_L) {
                    param4.field_L = new bb();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                wi.field_a = param4.field_L;
                if (param3 != 3) {
                  field_d = 20;
                  wi.field_a.e(param3 ^ 91);
                  eh.field_f = new vg(param7);
                  bo.field_e = 0L;
                  mh.field_b = param0;
                  return;
                } else {
                  wi.field_a.e(param3 ^ 91);
                  eh.field_f = new vg(param7);
                  bo.field_e = 0L;
                  mh.field_b = param0;
                  return;
                }
              }
            }
          } else {
            var10 = var10 + (255 & oe.field_Rb[var11]);
            var11++;
            continue L0;
          }
        }
    }

    ga(int param0, int param1, int[] param2) {
        ((ga) this).field_b = param0;
        ((ga) this).field_e = param2;
        ((ga) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_a = field_d;
    }
}
