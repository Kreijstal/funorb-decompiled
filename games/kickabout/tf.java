/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static boolean field_f;
    static double field_a;
    static String[] field_h;
    gn field_c;
    static ut field_e;
    static int[][][] field_g;
    static cc field_d;
    private gn field_i;
    static String field_b;

    final gn h(int param0) {
        gn var2 = null;
        var2 = ((tf) this).field_c.field_b;
        if (param0 < -119) {
          if (((tf) this).field_c == var2) {
            return null;
          } else {
            var2.c((byte) -109);
            return var2;
          }
        } else {
          return null;
        }
    }

    final void b(int param0) {
        int var3 = 0;
        gn var4 = null;
        gn var5 = null;
        var3 = Kickabout.field_G;
        if (param0 == 22997) {
          L0: while (true) {
            var4 = ((tf) this).field_c.field_d;
            if (((tf) this).field_c != var4) {
              var4.c((byte) -109);
              continue L0;
            } else {
              ((tf) this).field_i = null;
              return;
            }
          }
        } else {
          field_e = null;
          L1: while (true) {
            var5 = ((tf) this).field_c.field_d;
            if (((tf) this).field_c != var5) {
              var5.c((byte) -109);
              continue L1;
            } else {
              ((tf) this).field_i = null;
              return;
            }
          }
        }
    }

    final gn b(int param0, gn param1) {
        gn var3 = null;
        if (param0 == -7584) {
          L0: {
            if (param1 == null) {
              var3 = ((tf) this).field_c.field_d;
              break L0;
            } else {
              var3 = param1;
              break L0;
            }
          }
          if (((tf) this).field_c == var3) {
            ((tf) this).field_i = null;
            return null;
          } else {
            ((tf) this).field_i = var3.field_d;
            return var3;
          }
        } else {
          return null;
        }
    }

    final gn d(int param0) {
        if (param0 != -9033) {
            return null;
        }
        gn var2 = ((tf) this).field_c.field_b;
        if (!(((tf) this).field_c != var2)) {
            ((tf) this).field_i = null;
            return null;
        }
        ((tf) this).field_i = var2.field_b;
        return var2;
    }

    final gn g(int param0) {
        gn var2 = null;
        if (param0 == 24009) {
          var2 = ((tf) this).field_c.field_d;
          if (((tf) this).field_c == var2) {
            ((tf) this).field_i = null;
            return null;
          } else {
            ((tf) this).field_i = var2.field_d;
            return var2;
          }
        } else {
          field_e = null;
          var2 = ((tf) this).field_c.field_d;
          if (((tf) this).field_c == var2) {
            ((tf) this).field_i = null;
            return null;
          } else {
            ((tf) this).field_i = var2.field_d;
            return var2;
          }
        }
    }

    final static int a(boolean param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        if (param0) {
          var2 = param1.length();
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var3 = -var3 + ((var3 << 606511077) - -mf.a(param1.charAt(var4), (byte) -104));
              var4++;
              continue L0;
            }
          }
        } else {
          field_e = null;
          var2 = param1.length();
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var3 = -var3 + ((var3 << 606511077) - -mf.a(param1.charAt(var4), (byte) -104));
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, tf param1) {
        Object var4 = null;
        this.a(param1, ((tf) this).field_c.field_d, 123);
        if (param0 == -17481) {
          return;
        } else {
          var4 = null;
          this.a((tf) null, (gn) null, -14);
          return;
        }
    }

    final gn[] f(int param0) {
        gn[] var2 = null;
        int var3 = 0;
        gn var4 = null;
        int var5 = 0;
        gn[] var6 = null;
        var5 = Kickabout.field_G;
        if (param0 == 606511077) {
          var6 = new gn[((tf) this).a(false)];
          var2 = var6;
          var3 = 0;
          var4 = ((tf) this).field_c.field_d;
          L0: while (true) {
            if (((tf) this).field_c == var4) {
              return var2;
            } else {
              var3++;
              var6[var3] = var4;
              var4 = var4.field_d;
              continue L0;
            }
          }
        } else {
          tf.a(113);
          var6 = new gn[((tf) this).a(false)];
          var2 = var6;
          var3 = 0;
          var4 = ((tf) this).field_c.field_d;
          L1: while (true) {
            if (((tf) this).field_c == var4) {
              return var2;
            } else {
              var3++;
              var6[var3] = var4;
              var4 = var4.field_d;
              continue L1;
            }
          }
        }
    }

    final gn e(int param0) {
        gn var2 = null;
        if (param0 != 33) {
            ((tf) this).field_i = null;
            var2 = ((tf) this).field_i;
            if (!(((tf) this).field_c != var2)) {
                ((tf) this).field_i = null;
                return null;
            }
            ((tf) this).field_i = var2.field_b;
            return var2;
        }
        var2 = ((tf) this).field_i;
        if (!(((tf) this).field_c != var2)) {
            ((tf) this).field_i = null;
            return null;
        }
        ((tf) this).field_i = var2.field_b;
        return var2;
    }

    final void a(gn param0, int param1) {
        if (null == param0.field_b) {
          if (param1 != 3) {
            ((tf) this).field_i = null;
            param0.field_b = ((tf) this).field_c.field_b;
            param0.field_d = ((tf) this).field_c;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
            return;
          } else {
            param0.field_b = ((tf) this).field_c.field_b;
            param0.field_d = ((tf) this).field_c;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
            return;
          }
        } else {
          param0.c((byte) -109);
          if (param1 == 3) {
            param0.field_b = ((tf) this).field_c.field_b;
            param0.field_d = ((tf) this).field_c;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
            return;
          } else {
            ((tf) this).field_i = null;
            param0.field_b = ((tf) this).field_c.field_b;
            param0.field_d = ((tf) this).field_c;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
            return;
          }
        }
    }

    final boolean a(byte param0) {
        int var2 = -23 / ((param0 - -53) / 36);
        return ((tf) this).field_c == ((tf) this).field_c.field_d ? true : false;
    }

    final void a(int param0, gn param1) {
        L0: {
          if (param1.field_b != null) {
            param1.c((byte) -109);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_d = ((tf) this).field_c.field_d;
        if (param0 != 0) {
          field_h = null;
          param1.field_b = ((tf) this).field_c;
          param1.field_b.field_d = param1;
          param1.field_d.field_b = param1;
          return;
        } else {
          param1.field_b = ((tf) this).field_c;
          param1.field_b.field_d = param1;
          param1.field_d.field_b = param1;
          return;
        }
    }

    final gn c(int param0) {
        gn var2 = null;
        if (param0 == 33) {
          var2 = ((tf) this).field_i;
          if (((tf) this).field_c == var2) {
            ((tf) this).field_i = null;
            return null;
          } else {
            ((tf) this).field_i = var2.field_d;
            return var2;
          }
        } else {
          field_b = null;
          var2 = ((tf) this).field_i;
          if (((tf) this).field_c == var2) {
            ((tf) this).field_i = null;
            return null;
          } else {
            ((tf) this).field_i = var2.field_d;
            return var2;
          }
        }
    }

    private final void a(tf param0, gn param1, int param2) {
        int var4 = 0;
        gn var5 = null;
        var4 = -50 % ((param2 - 56) / 45);
        var5 = ((tf) this).field_c.field_b;
        ((tf) this).field_c.field_b = param1.field_b;
        param1.field_b.field_d = ((tf) this).field_c;
        if (((tf) this).field_c == param1) {
          return;
        } else {
          param1.field_b = param0.field_c.field_b;
          param1.field_b.field_d = param1;
          var5.field_d = param0.field_c;
          param0.field_c.field_b = var5;
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_g = null;
        field_e = null;
        int var1 = 77 / ((-76 - param0) / 49);
        field_h = null;
    }

    final int a(boolean param0) {
        int var2 = 0;
        gn var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (param0) {
          return 127;
        } else {
          var2 = 0;
          var3 = ((tf) this).field_c.field_d;
          L0: while (true) {
            if (var3 == ((tf) this).field_c) {
              return var2;
            } else {
              var3 = var3.field_d;
              var2++;
              continue L0;
            }
          }
        }
    }

    final gn b(byte param0) {
        gn var2 = null;
        int var3 = 0;
        var2 = ((tf) this).field_c.field_d;
        if (var2 == ((tf) this).field_c) {
          return null;
        } else {
          var3 = -19 / ((param0 - 75) / 50);
          var2.c((byte) -109);
          return var2;
        }
    }

    public tf() {
        ((tf) this).field_c = new gn();
        ((tf) this).field_c.field_d = ((tf) this).field_c;
        ((tf) this).field_c.field_b = ((tf) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[3];
        field_g = new int[33][33][33];
        field_f = false;
        field_d = new cc();
        field_b = "Top Bidder";
    }
}
