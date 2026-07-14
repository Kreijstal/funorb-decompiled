/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf extends ee {
    static String field_S;
    static byte[][] field_Z;
    ee field_R;
    static String field_X;
    double field_Y;
    static bi field_T;
    pm field_W;
    double field_V;
    int field_Q;
    static String field_U;

    final boolean f(int param0) {
        if (param0 >= -54) {
            hf.m(-59);
            return ((hf) this).field_R.f(-67);
        }
        return ((hf) this).field_R.f(-67);
    }

    hf(hn param0, double param1, double param2, double param3, double param4, double param5, ee param6, double param7, double param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((hf) this).field_W = null;
        ((hf) this).field_Q = 1;
        ((hf) this).field_V = param7;
        ((hf) this).field_R = param6;
        ((hf) this).field_Y = param8;
    }

    void a(pm param0, int param1) {
        if (param1 > -81) {
            return;
        }
        param0.a(-80, (hf) this);
    }

    void a(int param0, vg param1) {
        param1.a(-61, (hf) this);
        if (param0 != -1) {
            ((hf) this).field_W = null;
        }
    }

    void a(int param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        L0: {
          if (0 < ((hf) this).field_Q) {
            ((hf) this).field_Q = ((hf) this).field_Q - 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (((hf) this).field_W != null) {
          L1: {
            var3 = Math.sqrt(((hf) this).field_K * ((hf) this).field_K + ((hf) this).field_G * ((hf) this).field_G + ((hf) this).field_L * ((hf) this).field_L);
            if (var3 >= 0.001) {
              break L1;
            } else {
              var3 = 0.001;
              break L1;
            }
          }
          var5 = ((hf) this).field_K / var3;
          var7 = ((hf) this).field_G / var3;
          var9 = ((hf) this).field_L / var3;
          if (!((hf) this).a(var9, ((hf) this).field_W, var5, 1, var7)) {
            ((hf) this).b(((hf) this).field_W, (byte) 106);
            ((hf) this).a(true, ((hf) this).field_Y, 27871);
            super.a(param0, param1);
            return;
          } else {
            ((hf) this).field_W = ((hf) this).a(var5, var7, var9, false);
            if (((hf) this).a(var5, var7, var9, false) != null) {
              ((hf) this).b(((hf) this).field_W, (byte) 106);
              ((hf) this).a(true, ((hf) this).field_Y, 27871);
              super.a(param0, param1);
              return;
            } else {
              super.a(param0, param1);
              return;
            }
          }
        } else {
          super.a(param0, param1);
          return;
        }
    }

    void a(boolean param0, il param1) {
        if (param0) {
            ((hf) this).field_W = null;
            param1.a(-51, (hf) this);
            return;
        }
        param1.a(-51, (hf) this);
    }

    final static nf[] a(mi param0, int param1, byte param2, int param3) {
        if (param2 <= -122) {
          if (!mc.a(param3, param1, param0, (byte) 119)) {
            return null;
          } else {
            return ja.a(-122);
          }
        } else {
          field_S = null;
          if (!mc.a(param3, param1, param0, (byte) 119)) {
            return null;
          } else {
            return ja.a(-122);
          }
        }
    }

    void a(int param0, mb param1) {
        param1.a(param0 + 23056, (hf) this);
        if (param0 != -23154) {
            Object var4 = null;
            nf[] discarded$0 = hf.a((mi) null, -38, (byte) -52, 80);
        }
    }

    void a(boolean param0, ee param1) {
        ((hf) this).b(param1, -126);
        if (!param0) {
            field_X = null;
        }
    }

    final static boolean l(int param0) {
        Object var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 50) {
          L0: {
            var2 = null;
            nf[] discarded$12 = hf.a((mi) null, -32, (byte) 16, -69);
            if (na.field_S != wh.field_fb) {
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
            if (na.field_S != wh.field_fb) {
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

    final double a(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
            ((hf) this).field_V = -1.316130172528065;
            return param2;
        }
        return param2;
    }

    boolean a(pm param0, byte param1) {
        if (param1 != 72) {
            ((hf) this).field_Q = 4;
            return false;
        }
        return false;
    }

    void a(int param0, ah param1) {
        param1.a(-35, (hf) this);
        int var3 = 3 / ((param0 - 14) / 53);
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            Object var3 = null;
            ((hf) this).a(true, (ee) null);
            return false;
        }
        return false;
    }

    void a(cl param0, byte param1) {
        int var3 = 75 / ((param1 - -35) / 60);
        param0.a(-84, (hf) this);
    }

    void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        if (param0 != 256) {
            return;
        }
        ((hf) this).d(param0 ^ 11053);
    }

    void a(int param0, hf param1) {
        if (param0 > -29) {
            Object var4 = null;
            ((hf) this).a(-7, (mb) null);
        }
    }

    void a(byte param0, sa param1) {
        if (param0 != 9) {
            return;
        }
        param1.a(param0 + -106, (hf) this);
    }

    final boolean a(boolean param0, pm param1) {
        if (!param0) {
            Object var4 = null;
            ((hf) this).a((byte) -53, (sa) null);
            return false;
        }
        return false;
    }

    public static void m(int param0) {
        field_U = null;
        field_S = null;
        int var1 = 12 % ((param0 - 4) / 35);
        field_X = null;
        field_Z = null;
        field_T = null;
    }

    void b(ee param0, int param1) {
        if (param0 == ((hf) this).field_R) {
          if (-1 <= (((hf) this).field_Q ^ -1)) {
            ((hf) this).a(param0, 0.0, -77);
            if (param1 >= -122) {
              return;
            } else {
              ((hf) this).d(10797);
              return;
            }
          } else {
            ((hf) this).field_Q = ((hf) this).field_Q + 1;
            return;
          }
        } else {
          ((hf) this).a(param0, 0.0, -77);
          if (param1 >= -122) {
            return;
          } else {
            ((hf) this).d(10797);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "<%0> homing missiles";
        field_S = "Connection timed out. Please try using a different server.";
        field_Z = new byte[50][];
        field_U = "Updates will sent to the email address you've given";
    }
}
