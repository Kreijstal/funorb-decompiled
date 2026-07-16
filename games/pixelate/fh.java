/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends ch implements pn, vo {
    static fp field_Q;
    static String field_K;
    static gm field_J;
    static String field_R;
    a field_S;
    static String field_M;
    private gk field_O;
    private qm field_P;
    private qm field_N;
    static int field_L;
    static dq field_I;

    private final int a(byte param0, int param1, String param2, ng param3, String param4, int param5) {
        int var7 = -111 / ((param0 - 7) / 43);
        return this.a(param5, param3, param1, param2, (byte) -121, param4, 35);
    }

    private final boolean g(byte param0) {
        if (param0 == -59) {
          if (!this.a(false, (bp) (Object) ((fh) this).field_O)) {
            return false;
          } else {
            return true;
          }
        } else {
          boolean discarded$2 = this.g((byte) -57);
          if (!this.a(false, (bp) (Object) ((fh) this).field_O)) {
            return false;
          } else {
            return true;
          }
        }
    }

    final void a(int param0, int param1, int param2, ng param3) {
        super.a(param0, param1, param2, param3);
        ((fh) this).field_P.field_H = this.g((byte) -59);
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        if (param0 == ((fh) this).field_N) {
          nm.b(true);
          if (param2 != 11) {
            field_M = null;
            return;
          } else {
            return;
          }
        } else {
          if (param0 == ((fh) this).field_P) {
            this.e((byte) 8);
            if (param2 == 11) {
              return;
            } else {
              field_M = null;
              return;
            }
          } else {
            if (param2 == 11) {
              return;
            } else {
              field_M = null;
              return;
            }
          }
        }
    }

    private final boolean a(boolean param0, bp param1) {
        ml var3 = null;
        dj var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (!param0) {
          var3 = param1.a(1);
          if (var3 == null) {
            return true;
          } else {
            L0: {
              var4 = var3.a((byte) 93);
              if (var4 != qk.field_g) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            }
            return stackIn_12_0 != 0;
          }
        } else {
          field_K = null;
          var3 = param1.a(1);
          if (var3 == null) {
            return true;
          } else {
            L1: {
              var4 = var3.a((byte) 93);
              if (var4 != qk.field_g) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public final void a(byte param0) {
        Object var3 = null;
        if (param0 < 12) {
          var3 = null;
          boolean discarded$2 = ((fh) this).a(-89, 53, (ng) null, 'e');
          ((ec) (Object) ((fh) this).field_O.a(1)).f(63);
          return;
        } else {
          ((ec) (Object) ((fh) this).field_O.a(1)).f(63);
          return;
        }
    }

    private final int a(int param0, ng param1, int param2, String param3, byte param4, String param5, int param6) {
        qp var11 = new qp(20, param2, param0 + 120, 25, param1, false, 120, 3, he.field_d, 16777215, param5);
        ((fh) this).b((ng) (Object) var11, 80);
        md var9 = new md(((bp) (Object) param1).a(1), param3, 126, param2 - -var11.field_C, 25 + param0, param6);
        var9.field_n = (fn) this;
        int var10 = 105 % ((param4 - -19) / 35);
        ((fh) this).b((ng) (Object) var9, 80);
        return var11.field_C - -var9.field_C;
    }

    public final void a(String param0, byte param1) {
        gk var3 = ((fh) this).field_O;
        String var4 = param0;
        int var5 = 75 % ((34 - param1) / 59);
        ((c) (Object) var3).a(false, (byte) 87, var4);
    }

    private final void e(byte param0) {
        Object var3 = null;
        if (param0 == 8) {
          if (!this.g((byte) -59)) {
            return;
          } else {
            uj.a(-1710418464, ((fh) this).field_O.field_q);
            return;
          }
        } else {
          var3 = null;
          int discarded$2 = this.a((byte) 21, -50, (String) null, (ng) null, (String) null, -110);
          if (!this.g((byte) -59)) {
            return;
          } else {
            uj.a(-1710418464, ((fh) this).field_O.field_q);
            return;
          }
        }
    }

    public static void f(byte param0) {
        Object var2 = null;
        field_M = null;
        if (param0 <= 120) {
          var2 = null;
          im discarded$2 = fh.a((String) null, 57);
          field_I = null;
          field_Q = null;
          field_K = null;
          field_R = null;
          field_J = null;
          return;
        } else {
          field_I = null;
          field_Q = null;
          field_K = null;
          field_R = null;
          field_J = null;
          return;
        }
    }

    public fh() {
        super(0, 0, 496, 0, (eb) null);
        ((fh) this).field_O = new gk("", (fn) null, 12);
        uc var1 = new uc(ep.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, he.field_d.field_w, -1, 2147483647, true);
        ng var2 = new ng(uh.field_d, (eb) (Object) var1, (fn) null);
        ((fh) this).field_P = new qm(ig.field_c, (fn) null);
        ((fh) this).field_N = new qm(fa.field_f, (fn) null);
        ((fh) this).field_O.field_l = bg.field_i;
        ((fh) this).field_O.a((byte) 57, (ml) (Object) new ec((c) (Object) ((fh) this).field_O));
        ((fh) this).field_P.field_H = false;
        ((fh) this).field_P.field_y = (eb) (Object) new ad();
        ((fh) this).field_N.field_y = (eb) (Object) new ia();
        ((fh) this).field_O.field_y = (eb) (Object) new gh(10000536);
        int var3 = 20;
        int var4 = 4;
        var2.a(270, (byte) 51, var3, 20, 50);
        int var5 = 200;
        ((fh) this).b(var2, 80);
        var3 += 50;
        var3 = var3 + (5 + this.a((byte) 52, var3, na.field_a, (ng) (Object) ((fh) this).field_O, mo.field_i, 170));
        ((fh) this).field_P.a(var5, (byte) 49, var3, 496 + -var5 >> -2076935743, 40);
        ((fh) this).field_N.a(60, (byte) 38, 15 + var3, 3 + var4, 40);
        ((fh) this).field_N.field_n = (fn) this;
        ((fh) this).field_P.field_n = (fn) this;
        ((fh) this).b((ng) (Object) ((fh) this).field_P, 80);
        ((fh) this).b((ng) (Object) ((fh) this).field_N, 80);
        ((fh) this).field_S = new a((pn) this);
        ((fh) this).field_S.a(-((fh) this).field_O.field_E + (-((fh) this).field_O.field_z + (((fh) this).field_E - 60)), (byte) 47, 20, ((fh) this).field_O.field_z - (-((fh) this).field_O.field_E + -60), 150);
        ((fh) this).b((ng) (Object) ((fh) this).field_S, 80);
        ((fh) this).a(496, (byte) 89, 0, 0, var4 + 55 + var3);
    }

    final static im a(String param0, int param1) {
        Object var2 = null;
        int var3 = 0;
        im var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        if (null != hq.field_q) {
          L0: {
            var3 = -109 % ((13 - param1) / 46);
            var7 = (CharSequence) (Object) param0;
            var2 = (Object) (Object) dh.a(var7, (byte) 118);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (Object) (Object) var7;
              break L0;
            }
          }
          var4 = (im) (Object) hq.field_q.a(-11434, (long)((String) var2).hashCode());
          L1: while (true) {
            if (var4 != null) {
              L2: {
                var8 = (CharSequence) (Object) var4.field_Fb;
                var5 = dh.a(var8, (byte) 27);
                if (var5 == null) {
                  var5 = var4.field_Fb;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (var5.equals(var2)) {
                return var4;
              } else {
                var4 = (im) (Object) hq.field_q.b((byte) 47);
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        if (!(!super.a(param0, param1 ^ 0, param2, param3))) {
            return true;
        }
        if (param1 != 3) {
            field_K = null;
            if (!(-99 != (param0 ^ -1))) {
                return ((fh) this).a(0, param2);
            }
            if ((param0 ^ -1) == -100) {
                return ((fh) this).b(10, param2);
            }
            return false;
        }
        if (!(-99 != (param0 ^ -1))) {
            return ((fh) this).a(0, param2);
        }
        if ((param0 ^ -1) == -100) {
            return ((fh) this).b(10, param2);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Who can join";
        field_M = "Accept";
        field_K = "Orb coins: ";
        field_L = -1;
        field_Q = new fp();
        field_I = new dq();
    }
}
