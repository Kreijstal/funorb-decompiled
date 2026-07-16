/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends og implements im, vd, fd {
    private sd field_K;
    private sd field_M;
    static int[] field_J;
    private sd field_N;
    private pc field_E;
    private sd field_I;
    private sd field_z;
    private pc field_G;
    private of field_F;
    nh field_L;
    private sd field_A;
    private rf field_H;
    static String field_C;

    private final int a(int param0, int param1, String param2, int param3, qm param4) {
        sb var9 = null;
        ei var10 = null;
        sb var11 = null;
        ei var12 = null;
        if (param1 > -80) {
          ((dc) this).field_G = null;
          var10 = new ei(20, param3, param0 + 120, 25, param4, false, 120, 3, ai.field_h, 16777215, param2);
          ((dc) this).b((qm) (Object) var10, -117);
          var9 = new sb(((lf) (Object) param4).a(-121));
          ((dc) this).b((qm) (Object) var9, 47);
          var9.a(15, var10.field_r + var10.field_g - -3, var10.field_j + (var10.field_f - 15 >> -1124815231), 15, (byte) -52);
          return var10.field_f;
        } else {
          var12 = new ei(20, param3, param0 + 120, 25, param4, false, 120, 3, ai.field_h, 16777215, param2);
          ((dc) this).b((qm) (Object) var12, -117);
          var11 = new sb(((lf) (Object) param4).a(-121));
          ((dc) this).b((qm) (Object) var11, 47);
          var11.a(15, var12.field_r + var12.field_g - -3, var12.field_j + (var12.field_f - 15 >> -1124815231), 15, (byte) -52);
          return var12.field_f;
        }
    }

    public dc() {
        super(0, 0, 496, 0, (wo) null);
        ((dc) this).field_N = new sd("", (bi) null, 12);
        ((dc) this).field_A = new sd("", (bi) null, 100);
        ((dc) this).field_K = new sd("", (bi) null, 100);
        ((dc) this).field_M = new sd("", (bi) null, 20);
        ((dc) this).field_I = new sd("", (bi) null, 20);
        ((dc) this).field_z = new sd("", (bi) null, 3);
        int var1 = 1;
        ((dc) this).field_F = new of("", (bi) null, var1 != 0);
        ((dc) this).field_G = new pc(ok.field_i, (bi) null);
        ((dc) this).field_E = new pc(dp.field_i, (bi) null);
        ((dc) this).field_N.field_t = ac.field_k;
        ((dc) this).field_A.field_t = go.field_g;
        ((dc) this).field_K.field_t = dq.field_C;
        ((dc) this).field_M.field_t = we.field_l;
        ((dc) this).field_I.field_t = ad.field_j;
        ((dc) this).field_z.field_t = tf.field_a;
        ((dc) this).field_F.field_t = na.field_fb;
        ((dc) this).field_N.a(true, (n) (Object) new no((ga) (Object) ((dc) this).field_N));
        ((dc) this).field_A.a(true, (n) (Object) new hn((ga) (Object) ((dc) this).field_A));
        ((dc) this).field_K.a(true, (n) (Object) new kd((ga) (Object) ((dc) this).field_K, (ga) (Object) ((dc) this).field_A));
        ((dc) this).field_M.a(true, (n) (Object) new jn((ga) (Object) ((dc) this).field_M, (ga) (Object) ((dc) this).field_N, (ga) (Object) ((dc) this).field_A));
        ((dc) this).field_I.a(true, (n) (Object) new oo((ga) (Object) ((dc) this).field_I, (ga) (Object) ((dc) this).field_M));
        ((dc) this).field_z.a(true, (n) (Object) new ci((ga) (Object) ((dc) this).field_z));
        ((dc) this).field_G.field_x = false;
        ((dc) this).field_G.field_i = (wo) (Object) new ve();
        ((dc) this).field_E.field_i = (wo) (Object) new ok();
        ((dc) this).field_N.field_i = (wo) (Object) new wc(10000536);
        wc dupTemp$0 = new wc(10000536);
        ((dc) this).field_K.field_i = (wo) (Object) dupTemp$0;
        ((dc) this).field_A.field_i = (wo) (Object) dupTemp$0;
        ((dc) this).field_z.field_i = (wo) (Object) new wc(10000536);
        ((dc) this).field_F.field_i = (wo) (Object) new wn();
        aq dupTemp$1 = new aq(10000536);
        ((dc) this).field_I.field_i = (wo) (Object) dupTemp$1;
        ((dc) this).field_M.field_i = (wo) (Object) dupTemp$1;
        String var2 = ci.a(new String[2], el.field_h, 3);
        int var3 = 20;
        var3 = var3 + this.a(var3, 170, vm.field_h, (qm) (Object) ((dc) this).field_A, 25406);
        var3 = var3 + (this.a(170, 20, var3, 0, sh.field_m, "", (qm) (Object) ((dc) this).field_K) + 5);
        var3 = var3 + this.a(var3, 170, fh.field_h, (qm) (Object) ((dc) this).field_M, 25406);
        var3 = var3 + (this.a(pk.field_f, var3, (qm) (Object) ((dc) this).field_I, true, si.field_c, 170) + 5);
        var3 = var3 + (5 + this.a(fh.field_g, var3, (qm) (Object) ((dc) this).field_N, true, tb.field_c, 170));
        var3 = var3 + this.a(170, -81, ui.field_b, var3, (qm) (Object) ((dc) this).field_z);
        ei var4 = new ei(46, var3, -90 + ((dc) this).field_g, 25, (qm) (Object) ((dc) this).field_F, true, -120 + ((dc) this).field_g, 5, ba.field_i, 11579568, qn.field_j);
        ((dc) this).b((qm) (Object) var4, -123);
        var3 = var3 + var4.field_f;
        lb var5 = new lb(ai.field_h, 0, 0, 0, 0, 16777215, -1, 0, 0, ai.field_h.field_o, -1, 2147483647, true);
        ((dc) this).field_H = new rf(var2, (wo) (Object) var5);
        ((dc) this).field_H.field_t = "";
        ((dc) this).field_H.a(47, hp.field_r, 0);
        ((dc) this).field_H.a(47, hp.field_r, 1);
        ((dc) this).field_H.field_l = (bi) this;
        ((dc) this).field_H.b(var3, 47, 46, -90 + ((dc) this).field_g);
        var3 = var3 + (15 + ((dc) this).field_H.field_f);
        ((dc) this).b((qm) (Object) ((dc) this).field_H, 42);
        int var6 = 4;
        int var7 = 200;
        ((dc) this).field_G.a(40, 496 - var7 >> -546793311, var3, var7, (byte) -52);
        ((dc) this).field_E.a(40, 3 + var6, 15 + var3, 60, (byte) -52);
        ((dc) this).field_E.field_l = (bi) this;
        ((dc) this).field_G.field_l = (bi) this;
        ((dc) this).b((qm) (Object) ((dc) this).field_G, -116);
        ((dc) this).b((qm) (Object) ((dc) this).field_E, -124);
        ((dc) this).field_L = new nh((fd) this);
        ((dc) this).field_L.a(150, 60 + ((dc) this).field_N.field_r + ((dc) this).field_N.field_g, 20 + ((dc) this).field_N.field_j, -60 + -((dc) this).field_N.field_r + (((dc) this).field_g - ((dc) this).field_N.field_g), (byte) -52);
        ((dc) this).b((qm) (Object) ((dc) this).field_L, 65);
        ((dc) this).a(var6 + var3 - -55, 0, 0, 496, (byte) -52);
    }

    final void a(qm param0, int param1, int param2, int param3) {
        super.a(param0, 19, param2, param3);
        int var5 = -55 / ((param1 - -50) / 59);
        ((dc) this).field_G.field_x = this.k(-103);
    }

    public final void a(int param0, int param1, rf param2, byte param3) {
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        if (0 == param0) {
          fq.a(-128, "terms.ws");
          if (param3 > -127) {
            field_J = null;
            return;
          } else {
            return;
          }
        } else {
          if (-2 != (param0 ^ -1)) {
            if ((param0 ^ -1) == -3) {
              fq.a(-128, "conduct.ws");
              if (param3 > -127) {
                field_J = null;
                return;
              } else {
                return;
              }
            } else {
              if (param3 <= -127) {
                return;
              } else {
                field_J = null;
                return;
              }
            }
          } else {
            fq.a(56, "privacy.ws");
            if (param3 <= -127) {
              return;
            } else {
              field_J = null;
              return;
            }
          }
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        if (param2) {
            kh.d(0, 0, kh.field_l, kh.field_d, 0, 192);
        } else {
            kh.a();
            kh.a();
            kh.a();
        }
        int var3 = -33 % ((param1 - 49) / 52);
        d.a((byte) 90, param2);
    }

    private final boolean i(int param0) {
        NumberFormatException numberFormatException = null;
        int var2 = 0;
        Throwable decompiledCaughtException = null;
        if (!this.k(-114)) {
          return false;
        } else {
          var2 = -1;
          try {
            L0: {
              var2 = Integer.parseInt(((dc) this).field_z.field_o);
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L1: {
              numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
              break L1;
            }
          }
          if (param0 < 87) {
            ((dc) this).field_E = null;
            return mp.a(0, ((dc) this).field_N.field_o, (dc) this, ((dc) this).field_A.field_o, ((dc) this).field_M.field_o, ((dc) this).field_F.field_A, var2);
          } else {
            return mp.a(0, ((dc) this).field_N.field_o, (dc) this, ((dc) this).field_A.field_o, ((dc) this).field_M.field_o, ((dc) this).field_F.field_A, var2);
          }
        }
    }

    private final String e(byte param0) {
        if (param0 != -102) {
            ((dc) this).field_F = null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean k(int param0) {
        if (param0 <= -95) {
          if (this.a((lf) (Object) ((dc) this).field_N, (byte) 61)) {
            if (this.a((lf) (Object) ((dc) this).field_A, (byte) 61)) {
              if (this.a((lf) (Object) ((dc) this).field_K, (byte) 61)) {
                if (this.a((lf) (Object) ((dc) this).field_M, (byte) 61)) {
                  if (this.a((lf) (Object) ((dc) this).field_I, (byte) 61)) {
                    if (!this.a((lf) (Object) ((dc) this).field_z, (byte) 61)) {
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
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if ((param0 ^ -1) != -99) {
            if (99 == param0) {
              return ((dc) this).a(param2, -25911);
            } else {
              return false;
            }
          } else {
            return ((dc) this).a((byte) -104, param2);
          }
        }
    }

    private final int a(int param0, int param1, int param2, int param3, String param4, String param5, qm param6) {
        io var9 = null;
        ei var10 = null;
        if (param3 != 0) {
          return -62;
        } else {
          var10 = new ei(20, param2, 120 - -param0, 25, param6, false, 120, 3, ai.field_h, 16777215, param4);
          ((dc) this).b((qm) (Object) var10, param3 ^ -124);
          var9 = new io(((lf) (Object) param6).a(param3 + -95), param5, 126, param2 - -var10.field_f, 50 + param0, param1);
          var9.field_l = (bi) this;
          ((dc) this).b((qm) (Object) var9, -116);
          return var10.field_f + var9.field_f;
        }
    }

    final static rm a(boolean param0, String param1, byte param2) {
        long var3 = 0L;
        rm var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        wg stackIn_8_0 = null;
        db stackIn_8_1 = null;
        bn stackIn_8_2 = null;
        rm stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        wg stackIn_9_0 = null;
        db stackIn_9_1 = null;
        bn stackIn_9_2 = null;
        rm stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        wg stackIn_10_0 = null;
        db stackIn_10_1 = null;
        bn stackIn_10_2 = null;
        rm stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        wg stackOut_7_0 = null;
        db stackOut_7_1 = null;
        bn stackOut_7_2 = null;
        rm stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        wg stackOut_9_0 = null;
        db stackOut_9_1 = null;
        bn stackOut_9_2 = null;
        rm stackOut_9_3 = null;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        wg stackOut_8_0 = null;
        db stackOut_8_1 = null;
        bn stackOut_8_2 = null;
        rm stackOut_8_3 = null;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        var7 = (CharSequence) (Object) param1;
        var3 = ij.a(true, var7);
        var5 = (rm) (Object) ra.field_d.a(var3, 0);
        if (var5 == null) {
          var5 = (rm) (Object) ah.field_a.a(var3, 0);
          if (var5 != null) {
            L0: {
              stackOut_7_0 = fq.field_x;
              stackOut_7_1 = rl.field_i;
              stackOut_7_2 = aa.field_b;
              stackOut_7_3 = (rm) var5;
              stackOut_7_4 = -128;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              stackIn_9_4 = stackOut_7_4;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              stackIn_8_4 = stackOut_7_4;
              if (param0) {
                stackOut_9_0 = (wg) (Object) stackIn_9_0;
                stackOut_9_1 = (db) (Object) stackIn_9_1;
                stackOut_9_2 = (bn) (Object) stackIn_9_2;
                stackOut_9_3 = (rm) (Object) stackIn_9_3;
                stackOut_9_4 = stackIn_9_4;
                stackOut_9_5 = 22050;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                stackIn_10_4 = stackOut_9_4;
                stackIn_10_5 = stackOut_9_5;
                break L0;
              } else {
                stackOut_8_0 = (wg) (Object) stackIn_8_0;
                stackOut_8_1 = (db) (Object) stackIn_8_1;
                stackOut_8_2 = (bn) (Object) stackIn_8_2;
                stackOut_8_3 = (rm) (Object) stackIn_8_3;
                stackOut_8_4 = stackIn_8_4;
                stackOut_8_5 = 2205;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                stackIn_10_4 = stackOut_8_4;
                stackIn_10_5 = stackOut_8_5;
                break L0;
              }
            }
            if (!((wg) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_10_3, stackIn_10_4, stackIn_10_5)) {
              return null;
            } else {
              ra.field_d.a(-22072, var3, (jb) (Object) var5);
              var6 = -4 % ((param2 - -64) / 35);
              return var5;
            }
          } else {
            var5 = rm.a(mg.field_c, param1, "");
            if (var5 == null) {
              return null;
            } else {
              ah.field_a.a(-22072, var3, (jb) (Object) var5);
              return null;
            }
          }
        } else {
          var6 = -4 % ((param2 - -64) / 35);
          return var5;
        }
    }

    public static void j(int param0) {
        field_J = null;
        int var1 = -101 / ((15 - param0) / 35);
        field_C = null;
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6 = 0;
        var6 = -47 / ((param0 - 83) / 36);
        if (((dc) this).field_E != param4) {
          if (((dc) this).field_G != param4) {
            return;
          } else {
            boolean discarded$2 = this.i(100);
            return;
          }
        } else {
          ba.c((byte) 93);
          return;
        }
    }

    public final void a(String param0, int param1) {
        sd var3 = null;
        String var4 = null;
        var3 = ((dc) this).field_N;
        var4 = param0;
        if (param1 != -23752) {
          ((dc) this).field_L = null;
          ((ga) (Object) var3).a(false, -100, var4);
          return;
        } else {
          ((ga) (Object) var3).a(false, -100, var4);
          return;
        }
    }

    private final int a(String param0, int param1, qm param2, boolean param3, String param4, int param5) {
        if (!param3) {
            return 31;
        }
        return this.a(param5, 35, param1, 0, param4, param0, param2);
    }

    private final boolean a(lf param0, byte param1) {
        n var3 = null;
        oi var4 = null;
        if (param1 == 61) {
          var3 = param0.a(-113);
          if (var3 == null) {
            return true;
          } else {
            var4 = var3.c((byte) 45);
            if (var4 == rk.field_c) {
              return false;
            } else {
              if (var4 == ta.field_h) {
                return false;
              } else {
                if (pe.field_p == var4) {
                  return false;
                } else {
                  return true;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    private final String c(boolean param0) {
        if (!param0) {
            Object var3 = null;
            ((dc) this).a((String) null, -79);
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0) {
        ((no) (Object) ((dc) this).field_N.a(-101)).d(-31626);
        if (param0 != 20) {
            ((dc) this).field_F = null;
        }
    }

    private final int a(int param0, int param1, String param2, qm param3, int param4) {
        ei var6 = null;
        if (param4 != 25406) {
          field_C = null;
          var6 = new ei(20, param0, 120 - -param1, 25, param3, false, 120, 3, ai.field_h, 16777215, param2);
          ((dc) this).b((qm) (Object) var6, 112);
          return var6.field_f;
        } else {
          var6 = new ei(20, param0, 120 - -param1, 25, param3, false, 120, 3, ai.field_h, 16777215, param2);
          ((dc) this).b((qm) (Object) var6, 112);
          return var6.field_f;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new int[]{33023, 49216, 8388863, 16711680};
        field_C = "Quit";
    }
}
