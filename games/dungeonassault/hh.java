/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hh implements ca, th {
    int field_e;
    static int field_p;
    static cn field_o;
    static String[] field_n;
    int field_d;
    int field_f;
    static en field_r;
    int field_i;
    static rj field_s;
    private boolean field_m;
    int field_g;
    static java.awt.Frame field_k;
    private int field_q;
    int field_l;
    int field_j;
    se field_u;
    int field_v;
    int field_t;
    int field_a;
    static int field_b;
    static boolean field_c;
    static String[] field_h;

    public final int a(lm param0, int param1) {
        l discarded$6 = ((hh) this).b(-2, param0);
        if (param1 != 8) {
            return -1;
        }
        return param0.field_t.b(263) - -((hh) this).field_e - -((hh) this).field_i;
    }

    public static void b(int param0) {
        field_r = null;
        field_n = null;
        field_h = null;
        field_o = null;
        if (param0 != 1) {
            field_o = null;
        }
        field_k = null;
        field_s = null;
    }

    hh(se param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 == 0) {
            return 0;
        }
        if (!(param1 <= 0)) {
            var2 = 1;
            if (!((param1 ^ -1) >= -65536)) {
                param1 = param1 >> 16;
                var2 += 16;
            }
            if (!(param1 <= 255)) {
                param1 = param1 >> 8;
                var2 += 8;
            }
            if (-16 > (param1 ^ -1)) {
                var2 += 4;
                param1 = param1 >> 4;
            }
            if (!(param1 >= -4)) {
                param1 = param1 >> 2;
                var2 += 2;
            }
            if (-2 < param1) {
                param1 = param1 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (!(param1 >= -65536)) {
            param1 = param1 >> 16;
            var2 += 16;
        }
        if (!(param1 >= -256)) {
            param1 = param1 >> 8;
            var2 += 8;
        }
        if (param0 != 1) {
            int discarded$0 = hh.a(-47, -9);
        }
        if (!(15 >= (param1 ^ -1))) {
            param1 = param1 >> 4;
            var2 += 4;
        }
        if (!((param1 ^ -1) <= 3)) {
            param1 = param1 >> 2;
            var2 += 2;
        }
        if (!(param1 >= -2)) {
            var2++;
            param1 = param1 >> 1;
        }
        return var2;
    }

    final static void a(byte param0) {
        if (!(ib.a((byte) 45))) {
            return;
        }
        if (param0 >= -91) {
            Object var2 = null;
            gp discarded$0 = hh.a((nh) null, (nh) null, 93, (byte) -9, 95);
        }
        ae.a(false, 4, -1);
    }

    private final int a(int param0, lm param1, int param2, int param3) {
        if (param3 != -16736) {
            Object var6 = null;
            l discarded$0 = ((hh) this).b(96, (lm) null);
        }
        return param1.field_A + (param1.field_v + param2) + (((hh) this).field_e - -param0);
    }

    final static gp a(nh param0, nh param1, int param2, byte param3, int param4) {
        if (!kk.a(param1, 1, param2, param4)) {
            return null;
        }
        int var5 = 12 / ((43 - param3) / 54);
        return wh.a(param0.b(5, param2, param4), (byte) -122);
    }

    private final int a(int param0, int param1, lm param2, int param3) {
        if (param3 > -63) {
            return 82;
        }
        return param1 + param2.field_q + param0 - (-((hh) this).field_l - param2.field_j);
    }

    String b(lm param0, int param1) {
        if (param1 != -444136767) {
            Object var4 = null;
            int discarded$0 = this.a(-67, -5, (lm) null, 68);
        }
        return param0.field_w;
    }

    public final int a(int param0, int param1, int param2, int param3, lm param4, int param5) {
        if (param0 != 16) {
            Object var8 = null;
            gp discarded$0 = hh.a((nh) null, (nh) null, 60, (byte) 22, -28);
        }
        l discarded$1 = ((hh) this).b(-2, param4);
        return param4.field_t.a(param2 + -((hh) this).a(param4, (byte) 93, param3), -((hh) this).a((byte) -85, param1, param4) + param5, (byte) -118);
    }

    private final int d(int param0, lm param1) {
        int var3 = 15 % ((-35 - param0) / 32);
        return -((hh) this).field_i + (-((hh) this).field_e + param1.field_s);
    }

    public final int a(lm param0, byte param1, int param2) {
        int var4 = 31 % ((param1 - 10) / 51);
        return this.a(param2, 0, param0, -120);
    }

    public void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        if (!(((hh) this).field_u != null)) {
            return;
        }
        this.a(param1, param2, (byte) 111, param3);
        if (param0 != 34) {
            ((hh) this).field_j = 71;
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, int param4, lm param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = DungeonAssault.field_K;
          d.a(param5.field_q + param3, param7 + (param5.field_v - -param5.field_s), param5.field_q + param3 + param5.field_x, param5.field_v + param7, false);
          var9 = ((hh) this).c(4, param5);
          var11 = 62 / ((param0 - 50) / 41);
          var10 = this.d(-106, param5);
          if (((hh) this).field_m) {
            int discarded$1 = ((hh) this).field_u.a(((hh) this).b(param5, -444136767), this.a(param3, param6, param5, -64), this.a(param4, param5, param7, -16736), var9, var10, param2, param1, ((hh) this).field_f, ((hh) this).field_d, ((hh) this).field_a);
            break L0;
          } else {
            L1: {
              var13 = ((hh) this).field_d;
              if (var13 == 0) {
                var12 = ((hh) this).field_u.field_H;
                break L1;
              } else {
                if (var13 == 2) {
                  var12 = var10 + -((hh) this).field_u.field_E;
                  break L1;
                } else {
                  L2: {
                    if ((var13 ^ -1) == -4) {
                      break L2;
                    } else {
                      if (1 != var13) {
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var12 = (-((hh) this).field_u.field_E + var10 - ((hh) this).field_u.field_H >> -444136767) + ((hh) this).field_u.field_H;
                  break L1;
                }
              }
            }
            L3: {
              var13 = ((hh) this).field_f;
              if (0 == var13) {
                break L3;
              } else {
                if ((var13 ^ -1) != -4) {
                  if (var13 == 1) {
                    ((hh) this).field_u.c(((hh) this).b(param5, -444136767), (var9 >> 1551901985) + this.a(param3, param6, param5, -102), this.a(param4, param5, param7, -16736) - -var12, param2, param1);
                    break L0;
                  } else {
                    if (var13 != 2) {
                      break L0;
                    } else {
                      ((hh) this).field_u.a(((hh) this).b(param5, -444136767), this.a(param3, param6, param5, -104) + var9, this.a(param4, param5, param7, -16736) + var12, param2, param1);
                      break L0;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            ((hh) this).field_u.b(((hh) this).b(param5, -444136767), this.a(param3, param6, param5, -109), this.a(param4, param5, param7, -16736) + var12, param2, param1);
            break L0;
          }
        }
        ti.c(true);
    }

    public final int a(int param0) {
        if (param0 <= 11) {
            int discarded$0 = ((hh) this).a(85);
        }
        return ((hh) this).field_u.field_E + ((hh) this).field_u.field_H;
    }

    public final void a(lm param0, int param1, int param2, int param3, int param4) {
        l var13 = null;
        l var14 = null;
        int var7 = 0;
        tg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (!(!param0.a((byte) 122))) {
            var13 = ((hh) this).b(-2, param0);
            var14 = var13;
            var7 = var14.a(0, param1);
            var8 = var13.field_e[var7];
            var9 = var14.a((byte) -128, param1);
            var10 = this.a(param4, var9, param0, param3 ^ 64);
            var11 = ((hh) this).a((byte) -73, param2, param0) - -Math.max(0, var8.field_m);
            var12 = ((hh) this).a((byte) 81, param2, param0) + Math.min(this.d(92, param0), Math.min(var8.field_c, var14.field_e.length > var7 - -1 ? var13.field_e[var7 + 1].field_m : var8.field_c));
            d.a(param0.field_q + param4, param0.field_v + param2 + param0.field_s, param0.field_q + param4 + param0.field_x, param2 + param0.field_v, false);
            hl.field_a.a(var10, var12, var11, var10, ((hh) this).field_j, true);
            ti.c(true);
        }
        if (param3 != -1) {
            field_h = null;
        }
    }

    public final int c(int param0, lm param1) {
        if (param0 != 4) {
            ((hh) this).field_l = -97;
        }
        return -((hh) this).field_v + (-((hh) this).field_l + param1.field_x);
    }

    final void a(byte param0, hh param1) {
        param1.field_d = ((hh) this).field_d;
        param1.field_a = ((hh) this).field_a;
        param1.field_i = ((hh) this).field_i;
        param1.field_g = ((hh) this).field_g;
        param1.field_u = ((hh) this).field_u;
        param1.field_e = ((hh) this).field_e;
        param1.field_j = ((hh) this).field_j;
        param1.field_q = ((hh) this).field_q;
        param1.field_t = ((hh) this).field_t;
        param1.field_m = ((hh) this).field_m;
        param1.field_v = ((hh) this).field_v;
        param1.field_f = ((hh) this).field_f;
        if (param0 <= 124) {
            return;
        }
        param1.field_l = ((hh) this).field_l;
    }

    private final void a(lm param0, int param1, byte param2, int param3) {
        this.a((byte) -64, ((hh) this).field_q, ((hh) this).field_g, param1, 0, param0, 0, param3);
        if (param2 < 91) {
            Object var6 = null;
            this.a((lm) null, -119, (byte) -24, -82);
        }
    }

    public final l b(int param0, lm param1) {
        if (null == param1.field_t) {
            param1.field_t = (l) (Object) new fe();
        }
        if (param0 != -2) {
            field_b = -86;
        }
        if (!((hh) this).field_m) {
            this.a(param1, (byte) -113);
        } else {
            ((fe) (Object) param1.field_t).a(((hh) this).b(param1, -444136767), 0, ((hh) this).field_d, this.d(param0 + -118, param1), ((hh) this).field_f, ((hh) this).c(param0 + 6, param1), ((hh) this).field_a, ((hh) this).field_u);
        }
        return param1.field_t;
    }

    private final void a(lm param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DungeonAssault.field_K;
          if (param0.field_t != null) {
            break L0;
          } else {
            param0.field_t = (l) (Object) new fe();
            break L0;
          }
        }
        L1: {
          var3 = ((hh) this).c(4, param0);
          var6 = -72 / ((param1 - -43) / 62);
          var4 = this.d(68, param0);
          var7 = ((hh) this).field_d;
          if (var7 != 0) {
            if (var7 == 2) {
              var5 = var4 - ((hh) this).field_u.field_E;
              break L1;
            } else {
              L2: {
                if (-4 == var7) {
                  break L2;
                } else {
                  if (-2 == var7) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = ((hh) this).field_u.field_H + (-((hh) this).field_u.field_H + (var4 + -((hh) this).field_u.field_E) >> -779189727);
              break L1;
            }
          } else {
            var5 = ((hh) this).field_u.field_H;
            break L1;
          }
        }
        L3: {
          L4: {
            var7 = ((hh) this).field_f;
            if (-1 != var7) {
              if (-4 != var7) {
                if ((var7 ^ -1) == -2) {
                  if (param0.field_t instanceof fe) {
                    ((fe) (Object) param0.field_t).a(var5, ((hh) this).b(param0, -444136767), ((hh) this).field_u, (byte) -78, var3 >> -1161650911);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (2 == var7) {
                    if (param0.field_t instanceof fe) {
                      ((fe) (Object) param0.field_t).a(var3, (byte) 81, ((hh) this).b(param0, -444136767), ((hh) this).field_u, var5);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              } else {
                break L4;
              }
            } else {
              break L4;
            }
          }
          if (!(param0.field_t instanceof fe)) {
            break L3;
          } else {
            ((fe) (Object) param0.field_t).a(((hh) this).b(param0, -444136767), -74, ((hh) this).field_u, 0, var5);
            break L3;
          }
        }
    }

    public final int a(byte param0, int param1, lm param2) {
        int var4 = 57 / ((param0 - 11) / 40);
        return this.a(0, param2, param1, -16736);
    }

    protected hh() {
    }

    public final void a(int param0, int param1, int param2, lm param3, int param4, int param5) {
        int var7 = 0;
        l var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        tg var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        var17 = DungeonAssault.field_K;
        if (param5 == param0) {
          return;
        } else {
          L0: {
            var7 = 55 / ((-54 - param4) / 33);
            if (param3.a((byte) 18)) {
              L1: {
                var8 = ((hh) this).b(-2, param3);
                if (param5 > param0) {
                  var9 = param0;
                  var10 = param5;
                  break L1;
                } else {
                  var9 = param5;
                  var10 = param0;
                  break L1;
                }
              }
              var11 = var8.a(0, var9);
              var12 = var8.a(0, var10);
              d.a(param1 + param3.field_q, param2 + param3.field_v + param3.field_s, param1 + param3.field_q - -param3.field_x, param2 - -param3.field_v, false);
              var13 = var11;
              L2: while (true) {
                if (var13 > var12) {
                  ti.c(true);
                  break L0;
                } else {
                  L3: {
                    var14 = var8.field_e[var13];
                    if (var13 == var11) {
                      stackOut_12_0 = var8.a((byte) -126, var9);
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var14.field_k[0];
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  L4: {
                    var15 = stackIn_13_0;
                    if (var12 != var13) {
                      if (var14 == null) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L4;
                      } else {
                        stackOut_16_0 = var14.field_k[var14.field_k.length + -1];
                        stackIn_18_0 = stackOut_16_0;
                        break L4;
                      }
                    } else {
                      stackOut_14_0 = var8.a((byte) -127, var10);
                      stackIn_18_0 = stackOut_14_0;
                      break L4;
                    }
                  }
                  var16 = stackIn_18_0;
                  hl.field_a.a(var16 - var15, this.a(param1, var15, param3, -75), param3.field_A + (((hh) this).field_e + (param2 - (-param3.field_v + -var14.field_m))), ((hh) this).field_t, -85, ((hh) this).field_t >>> 1364975128, var14.field_c);
                  var13++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public final int a(int param0, lm param1) {
        l discarded$5 = ((hh) this).b(-2, param1);
        if (param0 < 59) {
            return 78;
        }
        return param1.field_t.c(-76) + ((hh) this).field_l + ((hh) this).field_v;
    }

    hh(se param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((hh) this).field_q = param6;
        ((hh) this).field_d = param8;
        ((hh) this).field_m = param12 ? true : false;
        ((hh) this).field_e = param3;
        ((hh) this).field_j = param10;
        ((hh) this).field_l = param1;
        ((hh) this).field_i = param4;
        ((hh) this).field_t = param11;
        ((hh) this).field_u = param0;
        ((hh) this).field_f = param7;
        ((hh) this).field_a = param9;
        ((hh) this).field_v = param2;
        ((hh) this).field_g = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{"Stable", "The stable shows the <%raiders> currently under your control. It can hold a <%highlight>maximum of eight raiders</col> at any one time. The raiders available for hire are displayed in the panel to the left. As with rooms, <%highlight>more will become available as you gain Renown</col>."};
        field_p = 320;
        field_h = new String[]{"Revive", "With great expenditure of effort and numerous dark invocations, the <%0> is able to call the spirit of a dead raider back from the next world. The raider will be teleported back to your stable. (Single use)"};
    }
}
