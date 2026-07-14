/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends qt {
    static String[] field_B;
    static int field_E;
    private int field_C;
    private hd field_A;
    static int field_D;
    static wp[] field_F;

    final void b(int param0) {
        ((sc) this).field_A = eo.a("", 7126504, (hu) (Object) un.field_d, -1, false);
        if (param0 != -38) {
            ((sc) this).a((byte) -76, false);
        }
    }

    final void a(boolean param0, int param1) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Kickabout.field_G;
        super.a(param0, 116);
        on.a(((sc) this).field_A.field_F - 150, ((sc) this).field_A.field_T + -150, ((sc) this).field_A.field_q - -300, ((sc) this).field_A.field_mb - -160, 8, 65793, ((sc) this).field_C >> -571055071);
        ((sc) this).field_A.a(50, param0);
        var3 = ct.field_w.toLowerCase();
        var4 = (int)Math.abs(-(nj.a(-58) / 1000L % 6L) + 3L);
        un.field_d.c(hv.field_d.toUpperCase(), (((sc) this).field_A.field_q >> -754526783) + ((sc) this).field_A.field_F, ((sc) this).field_A.field_T + (((sc) this).field_A.field_mb >> -1152977055) - -6, 16777215, -1, ((sc) this).field_C);
        var5 = 0;
        L0: while (true) {
          if (var4 <= var5) {
            if (param1 < 99) {
              return;
            } else {
              int discarded$1 = un.field_d.a(var3, ((sc) this).field_A.field_F + -150, -150 + ((sc) this).field_A.field_T, ((sc) this).field_A.field_q + 300, 130, 16777215, -1, ((sc) this).field_C, 1, 1, 0);
              return;
            }
          } else {
            var3 = var3 + ".";
            var5++;
            continue L0;
          }
        }
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        super.a(param0, param1, -126, param3);
        this.a(false);
        if (param1) {
          ((sc) this).field_C = param0;
          if (((sc) this).field_C <= 256) {
            if ((((sc) this).field_C ^ -1) <= -1) {
              ((sc) this).field_A.field_P = ((sc) this).field_C;
              if (param2 >= -28) {
                field_F = null;
                return;
              } else {
                return;
              }
            } else {
              ((sc) this).field_C = 0;
              ((sc) this).field_A.field_P = ((sc) this).field_C;
              if (param2 >= -28) {
                field_F = null;
                return;
              } else {
                return;
              }
            }
          } else {
            ((sc) this).field_C = 256;
            if ((((sc) this).field_C ^ -1) <= -1) {
              ((sc) this).field_A.field_P = ((sc) this).field_C;
              if (param2 >= -28) {
                field_F = null;
                return;
              } else {
                return;
              }
            } else {
              ((sc) this).field_C = 0;
              ((sc) this).field_A.field_P = ((sc) this).field_C;
              if (param2 >= -28) {
                field_F = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          ((sc) this).field_C = 256 + -(param0 << 866888481);
          if (((sc) this).field_C > 256) {
            ((sc) this).field_C = 256;
            if ((((sc) this).field_C ^ -1) > -1) {
              ((sc) this).field_C = 0;
              ((sc) this).field_A.field_P = ((sc) this).field_C;
              if (param2 >= -28) {
                field_F = null;
                return;
              } else {
                return;
              }
            } else {
              ((sc) this).field_A.field_P = ((sc) this).field_C;
              if (param2 < -28) {
                return;
              } else {
                field_F = null;
                return;
              }
            }
          } else {
            if ((((sc) this).field_C ^ -1) <= -1) {
              ((sc) this).field_A.field_P = ((sc) this).field_C;
              if (param2 >= -28) {
                field_F = null;
                return;
              } else {
                return;
              }
            } else {
              ((sc) this).field_C = 0;
              ((sc) this).field_A.field_P = ((sc) this).field_C;
              if (param2 >= -28) {
                field_F = null;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void g(byte param0) {
        if (param0 >= -112) {
          sc.e(70);
          eo.b(ug.a(0, (int)wm.field_C), lf.a((byte) -125, (int)cq.field_f), 10, 16711680);
          return;
        } else {
          eo.b(ug.a(0, (int)wm.field_C), lf.a((byte) -125, (int)cq.field_f), 10, 16711680);
          return;
        }
    }

    private final void a(boolean param0) {
        if (param0) {
          return;
        } else {
          ((sc) this).field_A.a(true, ((sc) this).field_A.field_q, (f.field_d >> 338756673) - (((sc) this).field_A.field_q >> -1697770463), 100 + (vc.field_B >> 1240180097), ((sc) this).field_A.field_mb);
          return;
        }
    }

    sc() {
        ((sc) this).field_C = 0;
    }

    public static void e(int param0) {
        field_F = null;
        if (param0 != 130) {
            return;
        }
        field_B = null;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        super.a((byte) 122, param1);
        ((sc) this).field_A.b(0, param1);
        var3 = -96 % ((param0 - 38) / 60);
        if (1 == ((sc) this).field_A.field_sb) {
          ii.a((byte) -120);
          vj.a(-81, true);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0 + param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_B = new String[255];
        field_F = new wp[255];
        for (var0 = 0; field_F.length > var0; var0++) {
            field_F[var0] = new wp();
        }
    }
}
