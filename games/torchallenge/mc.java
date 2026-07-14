/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc implements j {
    private int field_h;
    private eg field_b;
    static sl field_k;
    private int field_n;
    private int field_e;
    private int field_c;
    static String field_o;
    private int field_i;
    private int field_f;
    private int field_a;
    private int field_j;
    private int field_d;
    private int field_l;
    static int[][][] field_g;
    private int field_m;

    final static void a(int param0, int param1) {
        int var2 = 64 / ((24 - param1) / 57);
        int discarded$0 = lh.e(0);
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = TorChallenge.field_F ? 1 : 0;
        hl.field_e = false;
        if (param0 > 86) {
          jh.field_a = null;
          if (!eb.field_m) {
            var1 = uk.field_H;
            if (0 < var1) {
              if ((var1 ^ -1) == -2) {
                jh.field_a = cl.field_A;
                jh.field_a = qa.a(119, new CharSequence[3]);
                da.field_c.o(77);
                ba.c((byte) 15);
                return;
              } else {
                jh.field_a = ni.a(new String[1], 0, gh.field_r);
                jh.field_a = qa.a(119, new CharSequence[3]);
                da.field_c.o(77);
                ba.c((byte) 15);
                return;
              }
            } else {
              da.field_c.o(77);
              ba.c((byte) 15);
              return;
            }
          } else {
            da.field_c.m(13);
            return;
          }
        } else {
          return;
        }
    }

    final static java.net.URL a(java.net.URL param0, int param1, java.applet.Applet param2) {
        String var3 = null;
        String var4 = null;
        var3 = null;
        var4 = null;
        if (param1 == -1) {
          L0: {
            if (null == ah.field_g) {
              break L0;
            } else {
              if (ah.field_g.equals((Object) (Object) param2.getParameter("settings"))) {
                break L0;
              } else {
                var3 = ah.field_g;
                var4 = var3;
                var4 = var3;
                break L0;
              }
            }
          }
          if (e.field_i != null) {
            if (e.field_i.equals((Object) (Object) param2.getParameter("session"))) {
              return rk.a(var4, -1, var3, -1, param0);
            } else {
              var4 = e.field_i;
              return rk.a(var4, -1, var3, -1, param0);
            }
          } else {
            return rk.a(var4, -1, var3, -1, param0);
          }
        } else {
          return null;
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hc var11 = null;
        ee stackIn_3_0 = null;
        ee stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param0 instanceof hc) {
            stackOut_2_0 = (ee) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ee) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (hc) (Object) stackIn_3_0;
          if (var11 != null) {
            param4 = param4 & var11.field_F;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          if (!param4) {
            break L2;
          } else {
            var7 = 16777215;
            break L2;
          }
        }
        qg.f(param0.field_m + param2, param0.field_i + param1, param0.field_p, param0.field_l, ((mc) this).field_f);
        var8 = ((mc) this).field_h + param0.field_m + param2;
        if (param3 != 97) {
          L3: {
            field_o = null;
            var9 = param1 + (param0.field_i + ((mc) this).field_a);
            qg.a(var8, var9, ((mc) this).field_n, ((mc) this).field_j, 5592405);
            qg.f(var8, var9, ((mc) this).field_n, ((mc) this).field_j, var7);
            if (var11.field_D) {
              qg.d(var8, var9, ((mc) this).field_n + var8, var9 - -((mc) this).field_j, 1);
              qg.d(var8 + ((mc) this).field_n, var9, var8, ((mc) this).field_j + var9, 1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (((mc) this).field_b == null) {
              break L4;
            } else {
              var10 = ((mc) this).field_n + ((mc) this).field_h - -((mc) this).field_c;
              int discarded$2 = ((mc) this).field_b.a(param0.field_v, param0.field_m + (param2 - -var10), ((mc) this).field_d + (param1 - -param0.field_i), -((mc) this).field_c + (-var10 + param0.field_p), -(((mc) this).field_c << 1952240417) + param0.field_l, ((mc) this).field_m, ((mc) this).field_l, ((mc) this).field_i, ((mc) this).field_e, 0);
              break L4;
            }
          }
          return;
        } else {
          L5: {
            var9 = param1 + (param0.field_i + ((mc) this).field_a);
            qg.a(var8, var9, ((mc) this).field_n, ((mc) this).field_j, 5592405);
            qg.f(var8, var9, ((mc) this).field_n, ((mc) this).field_j, var7);
            if (var11.field_D) {
              qg.d(var8, var9, ((mc) this).field_n + var8, var9 - -((mc) this).field_j, 1);
              qg.d(var8 + ((mc) this).field_n, var9, var8, ((mc) this).field_j + var9, 1);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (((mc) this).field_b == null) {
              break L6;
            } else {
              var10 = ((mc) this).field_n + ((mc) this).field_h - -((mc) this).field_c;
              int discarded$3 = ((mc) this).field_b.a(param0.field_v, param0.field_m + (param2 - -var10), ((mc) this).field_d + (param1 - -param0.field_i), -((mc) this).field_c + (-var10 + param0.field_p), -(((mc) this).field_c << 1952240417) + param0.field_l, ((mc) this).field_m, ((mc) this).field_l, ((mc) this).field_i, ((mc) this).field_e, 0);
              break L6;
            }
          }
          return;
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        field_g = null;
        field_k = null;
        if (param0) {
            mc.a(103);
        }
    }

    mc(eg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((mc) this).field_e = 1;
        ((mc) this).field_i = 1;
        ((mc) this).field_l = param4;
        ((mc) this).field_c = param1;
        ((mc) this).field_f = param9;
        ((mc) this).field_d = param2;
        ((mc) this).field_h = param5;
        ((mc) this).field_n = param8;
        ((mc) this).field_m = param3;
        ((mc) this).field_j = param7;
        ((mc) this).field_b = param0;
        ((mc) this).field_a = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new sl();
        field_g = new int[][][]{new int[7][], new int[7][], new int[7][]};
    }
}
