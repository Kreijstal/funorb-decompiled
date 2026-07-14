/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static dm field_b;
    static int field_d;
    static int field_a;
    static tf field_e;
    private rc field_g;
    static String field_f;
    private rc field_c;

    final rc a(int param0) {
        rc var2 = null;
        int var3 = 0;
        var3 = -123 % ((param0 - 21) / 32);
        var2 = ((wd) this).field_c;
        if (((wd) this).field_g == var2) {
          ((wd) this).field_c = null;
          return null;
        } else {
          ((wd) this).field_c = var2.field_k;
          return var2;
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -10943) {
            field_f = null;
            field_f = null;
            field_e = null;
            return;
        }
        field_f = null;
        field_e = null;
    }

    final void a(rc param0, boolean param1) {
        L0: {
          if (param0.field_l != null) {
            param0.a((byte) 45);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_k = ((wd) this).field_g.field_k;
        param0.field_l = ((wd) this).field_g;
        if (param1) {
          return;
        } else {
          param0.field_l.field_k = param0;
          param0.field_k.field_l = param0;
          return;
        }
    }

    final static void c(int param0) {
        kb.b(-120);
        if (param0 != 480) {
            field_d = -37;
        }
    }

    final rc a(boolean param0) {
        rc var2 = null;
        var2 = ((wd) this).field_g.field_k;
        if (param0) {
          if (((wd) this).field_g == var2) {
            return null;
          } else {
            var2.a((byte) 65);
            return var2;
          }
        } else {
          wd.a((byte) -92);
          if (((wd) this).field_g == var2) {
            return null;
          } else {
            var2.a((byte) 65);
            return var2;
          }
        }
    }

    final int b(byte param0) {
        int var2 = 0;
        rc var3 = null;
        int var4 = 0;
        var4 = Geoblox.field_C;
        var2 = 0;
        if (param0 != 67) {
          field_b = null;
          var3 = ((wd) this).field_g.field_k;
          L0: while (true) {
            if (((wd) this).field_g == var3) {
              return var2;
            } else {
              var3 = var3.field_k;
              var2++;
              continue L0;
            }
          }
        } else {
          var3 = ((wd) this).field_g.field_k;
          L1: while (true) {
            if (((wd) this).field_g == var3) {
              return var2;
            } else {
              var3 = var3.field_k;
              var2++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, rc param1) {
        if (!(param1.field_l == null)) {
            param1.a((byte) 62);
        }
        int var3 = -75 % ((param0 - 62) / 46);
        param1.field_l = ((wd) this).field_g.field_l;
        param1.field_k = ((wd) this).field_g;
        param1.field_l.field_k = param1;
        param1.field_k.field_l = param1;
    }

    final static void a(byte param0) {
        jk.field_d = 2;
        if (param0 < 45) {
            wd.a(true, -75);
        }
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        re var4 = null;
        var3 = Geoblox.field_C;
        var4 = (re) (Object) nj.field_f.g(0);
        L0: while (true) {
          if (var4 == null) {
            if (!param0) {
              field_a = -80;
              return;
            } else {
              return;
            }
          } else {
            ik.a(var4, param1, (byte) 107);
            var4 = (re) (Object) nj.field_f.d(1);
            continue L0;
          }
        }
    }

    final static void a(byte param0, String param1) {
        if (param0 != 69) {
            field_a = 99;
        }
    }

    public wd() {
        ((wd) this).field_g = new rc();
        ((wd) this).field_g.field_k = ((wd) this).field_g;
        ((wd) this).field_g.field_l = ((wd) this).field_g;
    }

    final static df a(boolean param0, long param1, String param2, String param3, boolean param4) {
        if (param0) {
          if (param1 != 0L) {
            if (param4) {
              return (df) (Object) new th(param1, param3);
            } else {
              return (df) (Object) new lf(param1, param3);
            }
          } else {
            if (param2 == null) {
              if (param4) {
                return (df) (Object) new th(param1, param3);
              } else {
                return (df) (Object) new lf(param1, param3);
              }
            } else {
              return (df) (Object) new nk(param2, param3);
            }
          }
        } else {
          field_f = null;
          if (param1 == 0L) {
            if (param2 == null) {
              if (param4) {
                return (df) (Object) new th(param1, param3);
              } else {
                return (df) (Object) new lf(param1, param3);
              }
            } else {
              return (df) (Object) new nk(param2, param3);
            }
          } else {
            if (param4) {
              return (df) (Object) new th(param1, param3);
            } else {
              return (df) (Object) new lf(param1, param3);
            }
          }
        }
    }

    final rc c(byte param0) {
        rc var2 = null;
        var2 = ((wd) this).field_g.field_k;
        if (var2 != ((wd) this).field_g) {
          ((wd) this).field_c = var2.field_k;
          if (param0 != 121) {
            wd.b(67);
            return var2;
          } else {
            return var2;
          }
        } else {
          ((wd) this).field_c = null;
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new dm(460, 460);
        field_d = (-field_b.field_o + 480) / 2;
        field_a = (640 + -field_b.field_s) / 2;
        field_e = new tf();
    }
}
