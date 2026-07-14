/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gl {
    private int field_j;
    private int field_b;
    private int field_k;
    private int field_d;
    private int field_c;
    private int field_h;
    private int field_o;
    private ni field_i;
    private int field_e;
    private int field_a;
    private int field_f;
    private int field_p;
    private float field_l;
    static java.util.zip.CRC32 field_g;
    private int field_q;
    private boolean field_m;
    private int field_n;
    static kb field_s;
    private int field_t;
    private int field_r;

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        var2 = ((gl) this).field_h;
        var3 = ((gl) this).field_o;
        if (!((gl) this).b((byte) -91)) {
          ((gl) this).field_m = false;
          return;
        } else {
          L0: {
            if (((gl) this).field_f >= var2) {
              if (var2 < ((gl) this).field_b) {
                var2 = ((gl) this).field_b;
                break L0;
              } else {
                break L0;
              }
            } else {
              var2 = ((gl) this).field_f;
              break L0;
            }
          }
          L1: {
            if (((gl) this).field_e >= var3) {
              if (((gl) this).field_q <= var3) {
                break L1;
              } else {
                var3 = ((gl) this).field_q;
                break L1;
              }
            } else {
              var3 = ((gl) this).field_e;
              break L1;
            }
          }
          L2: {
            if (param0 < -51) {
              break L2;
            } else {
              ((gl) this).a(-106, -107, -71);
              break L2;
            }
          }
          L3: {
            if (0.0f < ((gl) this).field_l) {
              var4 = (int)(0.5f + (float)var3 * ((gl) this).field_l);
              if (var4 > var2) {
                var3 = (int)((float)var2 / ((gl) this).field_l);
                break L3;
              } else {
                if (var2 > var4) {
                  var2 = var4;
                  break L3;
                } else {
                  break L3;
                }
              }
            } else {
              break L3;
            }
          }
          L4: {
            if (var2 != ec.field_h) {
              ((gl) this).field_i.a(false, var2, var3);
              break L4;
            } else {
              if (cf.field_d == var3) {
                break L4;
              } else {
                ((gl) this).field_i.a(false, var2, var3);
                break L4;
              }
            }
          }
          L5: {
            if (-1 > (((gl) this).field_h ^ -1)) {
              ib.field_j = (((gl) this).field_h - ec.field_h) / 2;
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        if (dj.field_k != null) {
          return;
        } else {
          L0: {
            if (param0 >= ob.field_l) {
              ((gl) this).field_m = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!((gl) this).field_m) {
            L1: {
              if (ec.field_h < ((gl) this).field_h) {
                ib.field_j = (((gl) this).field_h - ec.field_h) / 2;
                break L1;
              } else {
                if ((((gl) this).field_h ^ -1) >= -1) {
                  break L1;
                } else {
                  ib.field_j = 0;
                  break L1;
                }
              }
            }
            L2: {
              if (((gl) this).field_c != ec.field_h) {
                ((gl) this).field_i.a(false, ((gl) this).field_c, ((gl) this).field_k);
                break L2;
              } else {
                if (cf.field_d == ((gl) this).field_k) {
                  return;
                } else {
                  ((gl) this).field_i.a(false, ((gl) this).field_c, ((gl) this).field_k);
                  break L2;
                }
              }
            }
            return;
          } else {
            ((gl) this).field_r = ((gl) this).field_r - 1;
            if ((((gl) this).field_r - 1 ^ -1) >= -1) {
              ((gl) this).field_r = ((gl) this).field_a;
              if (bi.field_a >= ((gl) this).field_j) {
                this.b(-110);
                return;
              } else {
                ((gl) this).field_m = false;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        param2 = ml.a("", -30614, '_', param2);
        if (param1 > 60) {
          L0: {
            L1: {
              var3 = ji.a(21762, param0);
              if ((param2.indexOf(param0) ^ -1) != 0) {
                break L1;
              } else {
                if ((param2.indexOf(var3) ^ -1) == 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final static int a(String param0, int param1, String param2, int param3, int param4, String param5, boolean param6) {
        if (param1 != 140) {
            return 122;
        }
        mb var7 = new mb(param2);
        mb var8 = new mb(param5);
        return vb.a(param3, param4, param6, param0, var8, var7, -21760);
    }

    final void a(boolean param0) {
        ((gl) this).field_i.a(param0, ((gl) this).field_p, ((gl) this).field_t);
    }

    final jg b(boolean param0) {
        ((gl) this).field_t = cf.field_d;
        ((gl) this).field_p = ec.field_h;
        ((gl) this).field_i.a(param0, ((gl) this).field_n, ((gl) this).field_d);
        jd.field_p = false;
        jg var2 = g.a(((gl) this).field_d, 0, wh.field_c, ((gl) this).field_n, (byte) -81, 0);
        if (!(var2 != null)) {
            ((gl) this).a(false);
        }
        return var2;
    }

    final static void a(byte param0) {
        int var4 = SolKnight.field_L ? 1 : 0;
        o var1 = new o(540, 140);
        cl.a(-104, var1);
        hk.a();
        mi.a();
        ad.field_h = 0;
        ee.g(101);
        o var2 = var1.c();
        int var3 = 0;
        if (param0 != 28) {
            Object var5 = null;
            boolean discarded$0 = gl.a((String) null, -104, (String) null);
        }
        while (var3 < 15) {
            var2.d(-2, -2, 16777215);
            mi.d(4, 4, 0, 0, 540, 140);
            var3++;
        }
        tg.field_I.a();
        var1.f(0, 0);
        mf.e(4096);
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != -25195) {
            return;
        }
        ((gl) this).field_h = param1;
        ((gl) this).field_o = param0;
    }

    final boolean b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -91) {
            break L0;
          } else {
            ((gl) this).field_n = -40;
            break L0;
          }
        }
        L1: {
          L2: {
            if (bi.field_a < ((gl) this).field_j) {
              break L2;
            } else {
              if (-1 <= (ob.field_l ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static int a(int param0, byte[] param1, int param2) {
        if (param2 <= 92) {
            field_g = null;
        }
        return ki.a(-27129, param1, param0, 0);
    }

    public static void c(byte param0) {
        if (param0 != 95) {
            return;
        }
        field_s = null;
        field_g = null;
    }

    private gl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new java.util.zip.CRC32();
        field_s = new kb();
    }
}
