/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp extends f implements Cloneable {
    private int field_o;
    private int field_i;
    static mk field_k;
    static int field_j;
    static dl field_n;
    static int field_m;
    static String field_l;

    final void b(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        if (param0) {
          if ((((kp) this).field_o ^ -1) <= -1) {
            if (4 > ((kp) this).field_o) {
              var3 = vp.field_a[1 + ((kp) this).field_o] - vp.field_a[((kp) this).field_o];
              var4 = (int)(3.0 * ((double)var3 * Math.random()));
              if (var4 >= 0) {
                if (var4 >= var3) {
                  return;
                } else {
                  ((kp) this).field_i = vp.field_a[((kp) this).field_o] - -var4;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 < 43) {
            ((kp) this).a(-45, 64, -4, false, -34, -102);
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        il.field_h[((kp) this).field_o].a(128, param2, param1, 60, (byte) -111);
        if (param0 != -29660) {
            Object var5 = null;
            boolean discarded$0 = ((kp) this).a(18, (f[][]) null, true, 111, -32, -11, (ea) null, 78);
        }
    }

    final static String a(String param0, String param1, String param2, int param3, db param4) {
        if (param3 != 3) {
            kp.b(false);
            if (!(param4.a((byte) 102))) {
                return param0;
            }
            return param1 + " - " + param4.b(param2, -36) + "%";
        }
        if (!(param4.a((byte) 102))) {
            return param0;
        }
        return param1 + " - " + param4.b(param2, -36) + "%";
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
            field_j = 58;
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        L0: {
          var7 = ((kp) this).field_i;
          if (0 > var7) {
            var7 = ((kp) this).field_o;
            break L0;
          } else {
            if (jm.field_j) {
              break L0;
            } else {
              var7 = ((kp) this).field_o;
              if (0 <= var7) {
                if ((param2 ^ -1) == -25) {
                  if (-25 != (param0 ^ -1)) {
                    tb.field_e[var7].b(param5, param4, param2 * 2, 2 * param0);
                    var8 = -39 % ((-70 - param1) / 33);
                    return;
                  } else {
                    tb.field_e[var7].c(param5, param4);
                    var8 = -39 % ((-70 - param1) / 33);
                    return;
                  }
                } else {
                  tb.field_e[var7].b(param5, param4, param2 * 2, 2 * param0);
                  var8 = -39 % ((-70 - param1) / 33);
                  return;
                }
              } else {
                var8 = -39 % ((-70 - param1) / 33);
                return;
              }
            }
          }
        }
        if (0 <= var7) {
          if (param2 == -25) {
            if (-25 != param0) {
              tb.field_e[var7].b(param5, param4, param2 * 2, 2 * param0);
              var8 = -39 % ((-70 - param1) / 33);
              return;
            } else {
              tb.field_e[var7].c(param5, param4);
              var8 = -39 % ((-70 - param1) / 33);
              return;
            }
          } else {
            tb.field_e[var7].b(param5, param4, param2 * 2, 2 * param0);
            var8 = -39 % ((-70 - param1) / 33);
            return;
          }
        } else {
          var8 = -39 % ((-70 - param1) / 33);
          return;
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            ((kp) this).field_o = 69;
            return 3;
        }
        return 3;
    }

    kp() {
        this(0);
    }

    final f a(int param0, byte param1, int param2) {
        wd.field_j = wd.field_j - 1;
        fn.field_j = fn.field_j + ob.field_l;
        if (param1 != -110) {
          kp.b(true);
          return new pf(param2, param0, (f) this).a(param0, (byte) -110, param2);
        } else {
          return new pf(param2, param0, (f) this).a(param0, (byte) -110, param2);
        }
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        ob.field_l = ob.field_l - 1;
        mb.field_g = mb.field_g - wd.field_j;
        fn.field_j = fn.field_j + wd.field_j;
        ob.field_l = ob.field_l - 1;
        if (param5 != -87) {
            field_l = null;
            b.field_a = b.field_a + -1;
            we.field_h = we.field_h + -2;
            fp.field_a = fp.field_a + -2;
            je.field_j = je.field_j + -1;
            if (!(param4 != null)) {
                return (f) this;
            }
            dd.field_c.a(32, param2 * 12, param1 * 12, 0, (byte) -111);
            return (f) (Object) new ig(param0, param4, (f) this, false);
        }
        b.field_a = b.field_a + -1;
        we.field_h = we.field_h + -2;
        fp.field_a = fp.field_a + -2;
        je.field_j = je.field_j + -1;
        if (!(param4 != null)) {
            return (f) this;
        }
        dd.field_c.a(32, param2 * 12, param1 * 12, 0, (byte) -111);
        return (f) (Object) new ig(param0, param4, (f) this, false);
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        if (param0 != 16736352) {
            ((kp) this).b(false, true);
            return true;
        }
        return true;
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        if (param0) {
            return true;
        }
        return true;
    }

    public static void b(boolean param0) {
        field_n = null;
        field_l = null;
        if (param0) {
            field_m = -48;
            field_k = null;
            return;
        }
        field_k = null;
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        Object var9 = null;
        if (param0 != -21) {
          var9 = null;
          f discarded$2 = ((kp) this).a((f) null, 35, 9, (f[][]) null, (dl[]) null, (byte) -34);
          return true;
        } else {
          return true;
        }
    }

    final void a(int param0, int param1) {
        if (param1 < 61) {
            kp.b(true);
            ((kp) this).field_o = param0;
            return;
        }
        ((kp) this).field_o = param0;
    }

    kp(int param0) {
        ((kp) this).field_i = -1;
        ((kp) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new mk();
        field_j = 33;
        field_l = "Killed a Friend";
    }
}
