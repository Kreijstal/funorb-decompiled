/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bg {
    static String field_b;
    static int[] field_a;
    int field_h;
    private int field_g;
    private int field_e;
    static byte[] field_d;
    static bd field_l;
    static String field_f;
    static jl field_j;
    static String field_i;
    static String field_c;
    static int field_k;

    final static void a(long param0, int param1, int param2) {
        pc var4 = null;
        int var5 = 0;
        var4 = aa.field_f;
        var4.g(param1, 15514);
        if (param2 != -26231) {
          bg.a(18L, -62, 23);
          var4.field_m = var4.field_m + 1;
          var5 = var4.field_m;
          var4.e(160, 6);
          var4.a(false, param0);
          var4.f(var4.field_m - var5, -1);
          return;
        } else {
          var4.field_m = var4.field_m + 1;
          var5 = var4.field_m;
          var4.e(160, 6);
          var4.a(false, param0);
          var4.f(var4.field_m - var5, -1);
          return;
        }
    }

    void a(byte param0) {
        int var2 = 0;
        ((bg) this).field_e = ((bg) this).field_e + ((bg) this).field_g;
        var2 = hp.field_Gb.field_A << 1884989552;
        if (((bg) this).field_e <= var2) {
          if (0 < ((bg) this).field_h) {
            ((bg) this).field_h = ((bg) this).field_h - 12;
            if ((((bg) this).field_h ^ -1) > -1) {
              ((bg) this).field_h = 0;
              if (param0 != 21) {
                ((bg) this).b(38);
                return;
              } else {
                return;
              }
            } else {
              if (param0 != 21) {
                ((bg) this).b(38);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 == 21) {
              return;
            } else {
              ((bg) this).b(38);
              return;
            }
          }
        } else {
          ((bg) this).field_e = ((bg) this).field_e - var2;
          if (0 < ((bg) this).field_h) {
            ((bg) this).field_h = ((bg) this).field_h - 12;
            if ((((bg) this).field_h ^ -1) > -1) {
              ((bg) this).field_h = 0;
              if (param0 == 21) {
                return;
              } else {
                ((bg) this).b(38);
                return;
              }
            } else {
              if (param0 == 21) {
                return;
              } else {
                ((bg) this).b(38);
                return;
              }
            }
          } else {
            if (param0 == 21) {
              return;
            } else {
              ((bg) this).b(38);
              return;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_d = null;
        field_l = null;
        field_f = null;
        if (param0 >= -63) {
          return;
        } else {
          field_b = null;
          field_j = null;
          field_c = null;
          field_i = null;
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        int var2 = 0;
        String var3 = null;
        CharSequence var4 = null;
        var2 = 123 % ((51 - param0) / 41);
        var3 = param1.getParameter("username");
        if (var3 != null) {
          var4 = (CharSequence) (Object) var3;
          if ((nh.a(var4, -29667) ^ -1L) == -1L) {
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0) {
        oa.field_j = param0;
    }

    final void a(int param0, int param1) {
        ((bg) this).field_g = param0;
        if (param1 > -21) {
            ((bg) this).a(-61, 51);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var5 = -(param3 / 2) + 320;
        if (param0 > 9) {
          var6 = ui.field_f.field_A + var5;
          var7 = var5 - (-param3 + ui.field_f.field_A);
          t.d(var6, param2, param3 + -(2 * ui.field_f.field_A), 25, 16711935);
          t.a(bf.field_r);
          t.f(0, 0, 320, 480);
          ui.field_f.b(var5, param2);
          t.f(320, 0, 640, 480);
          ui.field_f.a(var7, param2);
          t.b(bf.field_r);
          t.b(var6, param2, -(2 * ui.field_f.field_A) + param3, 0);
          t.b(var6, 25 + param2 - 1, param3 - 2 * ui.field_f.field_A, 0);
          var8 = ((bg) this).field_e >> -1205348624;
          mh.a(param2, gd.field_h[param1], var8 - hp.field_Gb.field_A, 0);
          mh.a(param2, gd.field_h[param1], var8, 0);
          t.a(bf.field_r);
          t.f(0, 0, 320, 480);
          ec.field_q.a(var5 - -2, param2, 128);
          t.f(320, 0, 640, 480);
          di.field_c.a(-1 + param3 + (var5 + -di.field_c.field_A), param2, 128);
          t.b(bf.field_r);
          if (var7 <= var6) {
            return;
          } else {
            var9 = -4 + (param3 + -(ui.field_f.field_A * 2));
            t.e(2 + var6, param2 + 3, var9, 16777215, 128);
            t.e(2 + var6, 25 + param2 - 2, var9, 16777215, 128);
            t.e(var6 - -2, param2 - -2, var9, 0, 128);
            t.e(2 + var6, param2 + 22, var9, 0, 128);
            fi.a(var6, 7 + param2, var7, param2 + 7, 4, 7, gd.field_b);
            if (-1 > (((bg) this).field_h ^ -1)) {
              var10 = gd.field_c.length * ((bg) this).field_h >> 1518253512;
              var10 -= 2;
              if ((var10 ^ -1) < -1) {
                fi.a(var6, 12 + param2, var7, param2 - -12, 12, var10, gd.field_c);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    abstract void c(int param0);

    final void b(int param0) {
        ((bg) this).field_h = param0;
    }

    bg() {
        ((bg) this).field_g = 65536;
        ((bg) this).field_h = 0;
        ((bg) this).field_e = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Try again";
        field_a = new int[12];
        field_f = "<%0> has entered a game.";
        field_l = new bd();
        field_i = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_c = "You can join this game";
        field_k = 0;
    }
}
