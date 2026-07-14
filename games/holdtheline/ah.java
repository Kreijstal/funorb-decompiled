/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    hl field_e;
    static rg field_a;
    static int field_b;
    static gn field_d;
    private hl field_c;

    final static int a(vj param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        lb var11 = null;
        var11 = (lb) (Object) param0;
        var5 = var11.field_r.field_f;
        var6 = var11.field_s.field_f;
        var7 = var11.field_r.field_h;
        var8 = var11.field_s.field_h;
        if (var5 == var6) {
          return 0;
        } else {
          L0: {
            var9 = 27 / ((param1 - 31) / 32);
            if (var5 > var6) {
              var10 = var5;
              var5 = var6;
              var6 = var10;
              var10 = var7;
              var7 = var8;
              var8 = var10;
              break L0;
            } else {
              break L0;
            }
          }
          if (param2 > var5) {
            if (var6 >= param2) {
              if ((-var5 + param2) * (-var7 + var8) > (-var7 + param3) * (-var5 + var6)) {
                return 1;
              } else {
                return 0;
              }
            } else {
              return 0;
            }
          } else {
            return 0;
          }
        }
    }

    final hl c(byte param0) {
        hl var2 = ((ah) this).field_c;
        if (!(var2 != ((ah) this).field_e)) {
            ((ah) this).field_c = null;
            return null;
        }
        int var3 = 110 % ((32 - param0) / 54);
        ((ah) this).field_c = var2.field_h;
        return var2;
    }

    final static void b(boolean param0) {
        oi.field_f = param0 ? true : false;
        aa.field_j = null;
        dg.field_b = null;
        qg.field_b = null;
        pb.field_a = null;
    }

    private final void a(hl param0, byte param1, ah param2) {
        hl var4 = null;
        L0: {
          var4 = ((ah) this).field_e.field_a;
          ((ah) this).field_e.field_a = param0.field_a;
          param0.field_a.field_h = ((ah) this).field_e;
          if (param0 != ((ah) this).field_e) {
            param0.field_a = param2.field_e.field_a;
            param0.field_a.field_h = param0;
            var4.field_h = param2.field_e;
            param2.field_e.field_a = var4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= -98) {
          field_b = 68;
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_a = null;
        field_d = null;
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            field_d = null;
            if (((ah) this).field_e.field_h != ((ah) this).field_e) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ah) this).field_e.field_h != ((ah) this).field_e) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(hl param0, int param1, hl param2) {
        if (null == param2.field_a) {
          param2.field_h = param0;
          param2.field_a = param0.field_a;
          if (param1 != 0) {
            field_a = null;
            param2.field_a.field_h = param2;
            param2.field_h.field_a = param2;
            return;
          } else {
            param2.field_a.field_h = param2;
            param2.field_h.field_a = param2;
            return;
          }
        } else {
          param2.d(0);
          param2.field_h = param0;
          param2.field_a = param0.field_a;
          if (param1 == 0) {
            param2.field_a.field_h = param2;
            param2.field_h.field_a = param2;
            return;
          } else {
            field_a = null;
            param2.field_a.field_h = param2;
            param2.field_h.field_a = param2;
            return;
          }
        }
    }

    final void a(byte param0, hl param1) {
        if (param0 >= -61) {
          return;
        } else {
          L0: {
            if (param1.field_a != null) {
              param1.d(0);
              break L0;
            } else {
              break L0;
            }
          }
          param1.field_h = ((ah) this).field_e;
          param1.field_a = ((ah) this).field_e.field_a;
          param1.field_a.field_h = param1;
          param1.field_h.field_a = param1;
          return;
        }
    }

    final static java.net.URL a(java.net.URL param0, java.applet.Applet param1, byte param2) {
        String var3 = null;
        String var4 = null;
        L0: {
          var3 = null;
          var4 = null;
          if (il.field_a == null) {
            break L0;
          } else {
            if (il.field_a.equals((Object) (Object) param1.getParameter("settings"))) {
              break L0;
            } else {
              var3 = il.field_a;
              var4 = var3;
              var4 = var3;
              break L0;
            }
          }
        }
        L1: {
          if (null == hg.field_M) {
            break L1;
          } else {
            if (hg.field_M.equals((Object) (Object) param1.getParameter("session"))) {
              break L1;
            } else {
              var4 = hg.field_M;
              break L1;
            }
          }
        }
        if (param2 <= 6) {
          return null;
        } else {
          return ab.a(var3, var4, param0, (byte) -118, -1);
        }
    }

    final void a(int param0) {
        hl var2 = null;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        L0: while (true) {
          var2 = ((ah) this).field_e.field_h;
          if (((ah) this).field_e != var2) {
            var2.d(0);
            continue L0;
          } else {
            if (param0 != 29020) {
              field_d = null;
              ((ah) this).field_c = null;
              return;
            } else {
              ((ah) this).field_c = null;
              return;
            }
          }
        }
    }

    final hl d(byte param0) {
        if (param0 != 124) {
            return null;
        }
        hl var2 = ((ah) this).field_e.field_a;
        if (!(((ah) this).field_e != var2)) {
            ((ah) this).field_c = null;
            return null;
        }
        ((ah) this).field_c = var2.field_a;
        return var2;
    }

    final hl c(int param0) {
        hl var2 = null;
        if (param0 != -4140) {
            ((ah) this).field_e = null;
            var2 = ((ah) this).field_c;
            if (!(((ah) this).field_e != var2)) {
                ((ah) this).field_c = null;
                return null;
            }
            ((ah) this).field_c = var2.field_a;
            return var2;
        }
        var2 = ((ah) this).field_c;
        if (!(((ah) this).field_e != var2)) {
            ((ah) this).field_c = null;
            return null;
        }
        ((ah) this).field_c = var2.field_a;
        return var2;
    }

    final hl a(byte param0) {
        hl var2 = null;
        if (param0 == 74) {
          var2 = ((ah) this).field_e.field_a;
          if (((ah) this).field_e == var2) {
            return null;
          } else {
            var2.d(0);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, ah param1) {
        if (param0 != -30510) {
          field_b = -18;
          this.a(((ah) this).field_e.field_h, (byte) -123, param1);
          return;
        } else {
          this.a(((ah) this).field_e.field_h, (byte) -123, param1);
          return;
        }
    }

    final void a(hl param0, boolean param1) {
        L0: {
          if (param0.field_a != null) {
            param0.d(0);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_h = ((ah) this).field_e.field_h;
        param0.field_a = ((ah) this).field_e;
        param0.field_a.field_h = param0;
        param0.field_h.field_a = param0;
        if (param1) {
          ((ah) this).field_e = null;
          return;
        } else {
          return;
        }
    }

    final hl b(byte param0) {
        hl var2 = null;
        var2 = ((ah) this).field_e.field_h;
        if (param0 > 84) {
          if (((ah) this).field_e == var2) {
            ((ah) this).field_c = null;
            return null;
          } else {
            ((ah) this).field_c = var2.field_h;
            return var2;
          }
        } else {
          ah.a(true);
          if (((ah) this).field_e == var2) {
            ((ah) this).field_c = null;
            return null;
          } else {
            ((ah) this).field_c = var2.field_h;
            return var2;
          }
        }
    }

    public ah() {
        ((ah) this).field_e = new hl();
        ((ah) this).field_e.field_a = ((ah) this).field_e;
        ((ah) this).field_e.field_h = ((ah) this).field_e;
    }

    static {
    }
}
