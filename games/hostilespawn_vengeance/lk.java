/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lk extends vd implements cd, qk {
    private boolean field_J;
    static int[] field_M;
    private ph field_P;
    static nd field_N;
    private boolean field_G;
    private ph field_R;
    private ig field_O;
    private String field_I;
    static String[] field_E;
    private boolean field_Q;
    static int field_H;
    private ph field_K;
    private ig field_L;

    final void a(int param0, int param1, byte param2, int param3) {
        if (null != ((lk) this).field_I) {
            int discarded$0 = jd.field_s.a(((lk) this).field_I, 20 + param1 + ((lk) this).field_v, 15 + (((lk) this).field_m + param0), -40 + ((lk) this).field_s, ((lk) this).field_x, 16777215, -1, 1, 0, jd.field_s.field_y);
        }
        if (param2 <= 42) {
            lk.j(21);
        }
        if (!(((lk) this).field_P == null)) {
            si.a(param1 + 10, 134 + param0, -20 + ((lk) this).field_s, 4210752);
        }
        super.a(param0, param1, (byte) 123, param3);
    }

    final void a(boolean param0) {
        if (param0) {
            ((lk) this).field_J = false;
        }
        ((lk) this).field_O.o(-128);
        ((lk) this).field_L.o(-124);
    }

    private final void e(byte param0) {
        if (!gi.b((byte) -86)) {
            // if_icmpge L62
            // if_icmplt L43
        } else {
            r.a(((lk) this).field_O.field_n, ((lk) this).field_L.field_n, -125);
        }
        int var2 = -47 / ((29 - param0) / 34);
    }

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          var6 = 14 / ((-63 - param4) / 52);
          if (((lk) this).field_K == param3) {
            this.e((byte) 124);
            break L0;
          } else {
            if (param3 != ((lk) this).field_P) {
              if (param3 != ((lk) this).field_R) {
                break L0;
              } else {
                if (((lk) this).field_G) {
                  ki.a(-1);
                  break L0;
                } else {
                  if (!((lk) this).field_J) {
                    vc.a((byte) -1);
                    break L0;
                  } else {
                    mn.a((byte) -126);
                    break L0;
                  }
                }
              }
            } else {
              gb.d(126);
              break L0;
            }
          }
        }
    }

    public final void a(ig param0, byte param1) {
        int var3 = 116 / ((-76 - param1) / 41);
    }

    public final void a(ig param0, int param1) {
        int var3 = -31 % ((0 - param1) / 41);
        if (!(param0 != ((lk) this).field_O)) {
            boolean discarded$0 = ((lk) this).field_L.a((byte) -47, (ag) this);
        }
        if (!(param0 != ((lk) this).field_L)) {
            this.e((byte) -72);
        }
    }

    public static void j(int param0) {
        if (param0 != 27219) {
            lk.l(-62);
        }
        field_M = null;
        field_N = null;
        field_E = null;
    }

    final static void l(int param0) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        int[] var5 = mn.field_a;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        if (param0 < 71) {
            lk.j(68);
        }
        while (var2 < var3) {
            var2++;
            var1[var2] = 0;
            var2++;
            var1[var2] = 0;
            var2++;
            var1[var2] = 0;
            var2++;
            var1[var2] = 0;
            var2++;
            var1[var2] = 0;
            var2++;
            var1[var2] = 0;
            var2++;
            var1[var2] = 0;
            var2++;
            var1[var2] = 0;
        }
    }

    final static void a(int param0, int param1, int param2, vm param3, int param4, int param5, int param6, int param7, int param8, int param9, bd[] param10, bd[] param11, bd[] param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, vm param20) {
        se.a(param20, param2, param3, new vh(param11), param6, param8, new vh(param12), param13, param1, param9, param18, param0, param19, param14, param5, param15 ^ 4686, new vh(param10), param17, param7, param16, param4);
        if (param15 != 7662) {
            field_N = null;
        }
    }

    final void a(String param0, int param1) {
        ig var3 = null;
        String var4 = null;
        var3 = ((lk) this).field_O;
        var4 = param0;
        if (param1 != 10000536) {
          return;
        } else {
          var3.a((byte) 118, false, var4);
          ((lk) this).field_L.o(param1 ^ -10000616);
          return;
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 == param2) {
            return ((lk) this).a(param1, (byte) -21);
          } else {
            if ((param2 ^ -1) != -100) {
              return false;
            } else {
              return ((lk) this).b((byte) -126, param1);
            }
          }
        }
    }

    final String k(int param0) {
        if (null == ((lk) this).field_O.field_n) {
            return "";
        }
        if (param0 != 80) {
            return null;
        }
        return ((lk) this).field_O.field_n;
    }

    lk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (nn) null);
        ke var6 = null;
        vm var7 = null;
        String var8 = null;
        fa var9 = null;
        nh var12 = null;
        nh var13 = null;
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
        Object stackIn_16_0 = null;
        ph stackIn_16_1 = null;
        ph stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        ph stackIn_17_1 = null;
        ph stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        ph stackIn_18_1 = null;
        ph stackIn_18_2 = null;
        String stackIn_18_3 = null;
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
        Object stackOut_15_0 = null;
        ph stackOut_15_1 = null;
        ph stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        ph stackOut_17_1 = null;
        ph stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        ph stackOut_16_1 = null;
        ph stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          ((lk) this).field_I = param1;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
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
          ((lk) this).field_Q = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param2) {
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
          ((lk) this).field_G = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param4) {
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
          ((lk) this).field_J = stackIn_9_1 != 0;
          if (!((lk) this).field_G) {
            break L3;
          } else {
            L4: {
              if (((lk) this).field_Q) {
                break L4;
              } else {
                if (!((lk) this).field_J) {
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
          ((lk) this).field_O = (ig) (Object) new sf(param0, (mh) this, 100);
          ((lk) this).field_L = (ig) (Object) new sf("", (mh) this, 20);
          if (!((lk) this).field_G) {
            L6: {
              ((lk) this).field_K = new ph(cb.field_b, (mh) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (((lk) this).field_J) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = ej.field_n;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = hg.field_d;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new ph(stackIn_18_3, (mh) null);
            ((lk) this).field_R = stackIn_18_1;
            if (!((lk) this).field_Q) {
              break L5;
            } else {
              ((lk) this).field_P = new ph(kc.field_f, (mh) this);
              break L5;
            }
          } else {
            ((lk) this).field_K = new ph(hf.field_f, (mh) null);
            ((lk) this).field_R = new ph(sc.field_k, (mh) null);
            ((lk) this).field_O.field_D = false;
            break L5;
          }
        }
        L7: {
          ((lk) this).field_O.field_h = (nn) (Object) new sd(10000536);
          ((lk) this).field_L.field_h = (nn) (Object) new km(10000536);
          var6 = new ke();
          ((lk) this).field_K.field_h = (nn) (Object) var6;
          if (null == ((lk) this).field_R) {
            break L7;
          } else {
            ((lk) this).field_R.field_h = (nn) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((lk) this).field_O.field_i = qj.field_n;
          if (null == ((lk) this).field_P) {
            break L8;
          } else {
            ((lk) this).field_P.field_h = (nn) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((lk) this).field_P) {
            break L9;
          } else {
            ((lk) this).field_P.field_i = e.field_x;
            break L9;
          }
        }
        L10: {
          if (!((lk) this).field_G) {
            if (((lk) this).field_J) {
              ((lk) this).field_R.field_i = hk.field_l;
              ((lk) this).field_R.field_h = (nn) (Object) new ti();
              break L10;
            } else {
              ((lk) this).field_R.field_h = (nn) (Object) new ti();
              break L10;
            }
          } else {
            ((lk) this).field_R.field_i = qg.field_s;
            break L10;
          }
        }
        L11: {
          ((lk) this).field_m = 15;
          var7 = jd.field_s;
          if (((lk) this).field_I == null) {
            break L11;
          } else {
            ((lk) this).field_m = ((lk) this).field_m + (var7.b(((lk) this).field_I, -40 + ((lk) this).field_s, var7.field_y) + 5);
            break L11;
          }
        }
        L12: {
          var8 = jg.field_b;
          var9 = qj.a(bn.c(-1), (byte) -116);
          if (ub.field_b != var9) {
            if (var9 != wh.field_c) {
              break L12;
            } else {
              var8 = dg.field_nb;
              break L12;
            }
          } else {
            var8 = dk.field_k;
            break L12;
          }
        }
        L13: {
          var12 = new nh(10, ((lk) this).field_m, ((lk) this).field_s + -20, 25, (ag) (Object) ((lk) this).field_O, false, 80, 3, var7, 16777215, var8);
          ((lk) this).a(51448, (ag) (Object) new nh(10, ((lk) this).field_m, ((lk) this).field_s + -20, 25, (ag) (Object) ((lk) this).field_O, false, 80, 3, var7, 16777215, var8));
          ((lk) this).field_m = ((lk) this).field_m + (((ag) (Object) var12).field_x - -5);
          var13 = new nh(10, ((lk) this).field_m, -20 + ((lk) this).field_s, 25, (ag) (Object) ((lk) this).field_L, false, 80, 3, var7, 16777215, qh.field_x);
          ((lk) this).a(51448, (ag) (Object) new nh(10, ((lk) this).field_m, -20 + ((lk) this).field_s, 25, (ag) (Object) ((lk) this).field_L, false, 80, 3, var7, 16777215, qh.field_x));
          ((lk) this).field_m = ((lk) this).field_m + (((ag) (Object) var13).field_x - -5);
          ((lk) this).field_K.field_p = (mh) this;
          if (null == ((lk) this).field_P) {
            break L13;
          } else {
            ((lk) this).field_P.field_p = (mh) this;
            break L13;
          }
        }
        L14: {
          if (null == ((lk) this).field_R) {
            break L14;
          } else {
            ((lk) this).field_R.field_p = (mh) this;
            break L14;
          }
        }
        L15: {
          if (null == ((lk) this).field_P) {
            ((lk) this).field_K.a(-10 + ((lk) this).field_s - 6, ((lk) this).field_m, 0, 8, 30);
            ((lk) this).field_m = ((lk) this).field_m + 35;
            break L15;
          } else {
            ((lk) this).field_K.a(((lk) this).field_s - 95, ((lk) this).field_m, 0, 85, 30);
            ((lk) this).field_m = ((lk) this).field_m + 60;
            break L15;
          }
        }
        L16: {
          if (((lk) this).field_P == null) {
            break L16;
          } else {
            ((lk) this).field_P.a(-6 + ((lk) this).field_s + -10, ((lk) this).field_m, 0, 8, 30);
            ((lk) this).field_m = ((lk) this).field_m + 35;
            break L16;
          }
        }
        L17: {
          if (null == ((lk) this).field_R) {
            break L17;
          } else {
            L18: {
              if (((lk) this).field_G) {
                break L18;
              } else {
                if (!((lk) this).field_J) {
                  ((lk) this).field_R.a(40, ((lk) this).field_m, 0, 8, 20);
                  ((lk) this).field_m = ((lk) this).field_m + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((lk) this).field_R.a(-6 + ((lk) this).field_s + -10, ((lk) this).field_m, 0, 8, 30);
            ((lk) this).field_m = ((lk) this).field_m + 35;
            break L17;
          }
        }
        L19: {
          ((lk) this).a(((lk) this).field_s, 0, 0, 0, ((lk) this).field_m + 3);
          ((lk) this).a(51448, (ag) (Object) ((lk) this).field_K);
          if (((lk) this).field_P == null) {
            break L19;
          } else {
            ((lk) this).a(51448, (ag) (Object) ((lk) this).field_P);
            break L19;
          }
        }
        L20: {
          if (null == ((lk) this).field_R) {
            break L20;
          } else {
            ((lk) this).a(51448, (ag) (Object) ((lk) this).field_R);
            break L20;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[8192];
        field_E = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_H = 0;
        field_N = new nd(6, 0, 4, 2);
    }
}
