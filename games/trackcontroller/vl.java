/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends ok {
    static int field_H;
    static String field_E;
    private ja field_L;
    static String field_J;
    static qj field_K;

    final static boolean a(char param0, int param1) {
        Object var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param1 == 18102) {
            break L0;
          } else {
            var3 = null;
            vl.a(-21, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 < 48) {
                break L3;
              } else {
                if (param0 <= 57) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (65 > param0) {
                break L4;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param0 < 97) {
                break L5;
              } else {
                if (122 < param0) {
                  break L5;
                } else {
                  break L2;
                }
              }
            }
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L1;
          }
          stackOut_11_0 = 1;
          stackIn_13_0 = stackOut_11_0;
          break L1;
        }
        return stackIn_13_0 != 0;
    }

    final static void n(int param0) {
        re.field_k = false;
        fe.field_L = 0;
        g.field_y = -1;
        ha.field_z = -1;
        if (param0 != -27145) {
            Object var2 = null;
            vl.a(124, (String) null);
        }
        kj.field_o = -1;
    }

    final void b(boolean param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        if (!param0) {
            return;
        }
        ue var2 = new ue(((vl) this).field_L);
        hl var3 = (hl) (Object) var2.d(91);
        while (var3 != null) {
            if (var3.j(-27)) {
                var3.a(-32);
            }
            var3 = (hl) (Object) var2.e(37);
        }
        ((vl) this).field_B = (al) (Object) ((vl) this).j(-6121);
    }

    final static void m(int param0) {
        if (param0 != 1) {
            field_K = null;
        }
        Object var2 = null;
        oc.a("", (byte) -90, (String) null);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = TrackController.field_F ? 1 : 0;
        if (!(null == ((vl) this).field_y)) {
            ((vl) this).field_y.a(param3 ^ -5038, (al) this, param2, true, param1);
        }
        ue var5 = new ue(((vl) this).field_L);
        if (param3 != 29221) {
            ((vl) this).field_L = null;
        }
        al var6 = (al) (Object) var5.a(66);
        while (var6 != null) {
            var6.a(param0, ((vl) this).field_p + param1, param2 + ((vl) this).field_m, 29221);
            var6 = (al) (Object) var5.c(-87);
        }
    }

    final al i(int param0) {
        ue var2 = null;
        hl var3 = null;
        int var4 = 0;
        L0: {
          var4 = TrackController.field_F ? 1 : 0;
          if (param0 == 199) {
            break L0;
          } else {
            vl.n(-90);
            break L0;
          }
        }
        var2 = new ue(((vl) this).field_L);
        var3 = (hl) (Object) var2.d(param0 ^ 148);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_E) {
              var3 = (hl) (Object) var2.e(param0 ^ 226);
              continue L1;
            } else {
              return var3.d((byte) -125);
            }
          } else {
            return null;
          }
        }
    }

    public vl() {
        super(0, 0, jf.field_j, kg.field_c, (t) null, (tg) null);
        ((vl) this).field_L = new ja();
    }

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (param0 == -21173) {
            break L0;
          } else {
            field_E = null;
            break L0;
          }
        }
        L1: {
          var2 = g.g(1);
          if ((var2 ^ -1) <= -1) {
            L2: {
              var3 = 3158064;
              var4 = 16777120;
              var5 = re.field_c.a(param1);
              var6 = re.field_c.field_H + re.field_c.field_u;
              var7 = 1;
              var8 = var6;
              if (200 >= var5) {
                break L2;
              } else {
                var7 = (199 + var5) / 200;
                var5 = jh.a(re.field_c, param1, var5 / var7, false);
                var6 = var6 * var7;
                break L2;
              }
            }
            L3: {
              var9 = ha.field_z;
              if (var5 + var9 - -6 <= ll.field_d) {
                break L3;
              } else {
                var9 = -6 + -var5 + ll.field_d;
                break L3;
              }
            }
            L4: {
              var10 = 32 + (-re.field_c.field_H + kj.field_o);
              if (ll.field_k < var6 + var10 + 6) {
                var10 = kj.field_o - (var6 - -6);
                break L4;
              } else {
                break L4;
              }
            }
            ll.f(var9, var10, 6 + var5, var6 - -6, var3);
            ll.c(1 + var9, 1 + var10, var5 + 4, var6 + 4, var4);
            if (1 < var7) {
              int discarded$1 = re.field_c.a(param1, var9 - -3, re.field_c.field_H + (var10 - (-3 + re.field_c.field_G)), var5, 1000, var3, -1, 0, 0, var8);
              break L1;
            } else {
              re.field_c.c(param1, var9 - -3, var10 + (3 + re.field_c.field_H), var3, -1);
              break L1;
            }
          } else {
            break L1;
          }
        }
    }

    final void k(int param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        if (param0 > -84) {
            field_E = null;
        }
        ue var2 = new ue(((vl) this).field_L);
        hl var3 = (hl) (Object) var2.d(105);
        while (var3 != null) {
            if (var3.k(0)) {
                var3.a(-40);
            }
            var3 = (hl) (Object) var2.e(37);
        }
    }

    final hl j(int param0) {
        ue var2 = null;
        hl var3 = null;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        var2 = new ue(((vl) this).field_L);
        if (param0 == -6121) {
          var3 = (hl) (Object) var2.d(-97);
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_E) {
                return var3;
              } else {
                var3 = (hl) (Object) var2.e(param0 + 6158);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void d(byte param0, al param1) {
        if (!(param1 instanceof hl)) {
            throw new IllegalArgumentException();
        }
        if (param0 > -55) {
            field_K = null;
        }
        hl var3 = (hl) (Object) param1;
        ((vl) this).field_L.a((fc) (Object) var3, (byte) 112);
        var3.field_E = true;
        boolean discarded$0 = var3.a((byte) -106, (al) this);
    }

    public static void e(byte param0) {
        field_E = null;
        int var1 = -79 / ((-66 - param0) / 52);
        field_J = null;
        field_K = null;
    }

    final void l(int param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        ue var2 = new ue(((vl) this).field_L);
        hl var3 = (hl) (Object) var2.d(75);
        while (var3 != null) {
            var3.field_E = false;
            var3 = (hl) (Object) var2.e(param0 + -24873);
        }
        ((vl) this).field_B = null;
        if (param0 != 24910) {
            ((vl) this).k(-16);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = 0;
        field_E = "08101101101o0110110110190h1011390r02A00A00A00w02320r0007101301101b01101e0h101101101r01101690080212090090090090090080j8021200890890jj08108908e8021200h607f07607907d07680212012090090001690090080212090008o19090080801101f0280980620710110o6A000j2022022g02g082902200810620270530970160710510db01e0h90221209009000280168020220220710o101106709809202706701907101101O07602207101101c0110110110110d6000000000000000000000000000000000000000000000000pauseMenu 0/0";
        field_J = "Best each";
    }
}
