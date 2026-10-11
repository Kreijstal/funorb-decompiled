/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_g;
    static int[] field_i;
    static int field_f;
    static wh field_j;
    static lf field_d;
    static ci field_e;
    static String field_h;
    static int field_c;
    static se field_a;
    static String field_b;

    final static void a(byte param0, int param1) {
        ud var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        ud var2Lifetime1;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          wc.field_a = param1;
          var2 = (ud) (uc.field_j.a((byte) 51));
          while (var2 != null) {
            if (var2.field_m.a(false)) {
              var2.field_h.h(wc.field_a * var2.field_l + 128 >> 8);
            } else {
              var2.c(10);
            }
            var2 = (ud) (uc.field_j.b(-78));
          }
          if (param0 >= -48) {
            ah.a(false, -78);
          }
          if (la.field_j != null) {
            var2Lifetime1 = (ud) (la.field_j.a((byte) 51));
            while (var2Lifetime1 != null) {
              if (!var2Lifetime1.field_m.a(false)) {
                var2Lifetime1.c(10);
              } else {
                var2Lifetime1.field_h.h(wc.field_a * var2Lifetime1.field_l + 128 >> 8);
              }
              var2Lifetime1 = (ud) (la.field_j.b(-33));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "ah.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(o param0, boolean param1) {
        try {
          if (param1) {
            field_i = (int[]) null;
          }
          dc.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ah.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_i = null;
        field_a = null;
        field_b = null;
        field_g = null;
        field_e = null;
        field_h = null;
        field_j = null;
        if (!param0) {
          o var2 = (o) null;
          ah.a((o) null, false);
        }
    }

    final static void a(boolean param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        var6 = SolKnight.field_L ? 1 : 0;
        var2 = -wd.field_c + 320;
        var3 = -si.field_E + (-ea.field_p[kb.field_b] + 720);
        if (param0) {
          var4 = kd.field_b[kb.field_b];
          if (kb.field_b == 1) {
            var4 = var4 * 3 / 4;
          }
          if (kb.field_b == 2) {
            var4 = 3 * var4 / 4;
          }
          if (3 == kb.field_b) {
            var4 = var4 * 2 / 4;
          }
          if (4 == kb.field_b) {
            var4 = 2 * var4 / 4;
          }
          of.field_d.c(-var4 + var2, var3 - var4 + k.field_c, 2 * var4, var4 * 2);
          if (k.field_c > 10) {
            ad.field_b.a(rg.field_a, 320, 240, 16711680, -1);
          }
          if (param1 == 7) {
            return;
          }
          ah.b(true);
          return;
        }
        if (f.field_d != 0 &&
          f.field_d % 10 >= 5) {
          ak.field_e[kb.field_b].d(var2 - ak.field_e[kb.field_b].field_q / 2, var3 - ak.field_e[kb.field_b].field_r / 2, 16777215);
        } else {
          ak.field_e[kb.field_b].a(128, var3, 90, 0, var2);
        }
        var4Lifetime1 = kb.field_b << 3;
        var5 = -1;
        if (kb.field_b == 0) {
          var5 = 7 - (1 + wb.field_b) / 2;
        }
        if (kb.field_b == 1) {
          var5 = 7 - (1 + wb.field_b) / 2;
          var4Lifetime1 = 16;
        }
        if (kb.field_b == 2) {
          var4Lifetime1 = 8;
          var5 = 7 - (wb.field_b + 1) / 2;
        }
        if (kb.field_b == 3) {
          var5 = -((wb.field_b + 5) / 6) + 7;
        }
        if (4 == kb.field_b) {
          if (6 > wb.field_b) {
            var5 = 5 - wb.field_b;
            if (kb.field_b == 5) {
              var5 = 7 - wb.field_b;
            }
            if (kb.field_b == 6) {
              var5 = 4;
              if (wb.field_b > 5) {
                var5 = 3;
              }
              if (wb.field_b > 10) {
                var5 = 2;
              }
              if (wb.field_b > 15) {
                var5 = 1;
              }
              if (wb.field_b > 20) {
                var5 = 0;
              }
              if (wb.field_b > 40) {
                var5 = 7;
                if (wb.field_b % 10 > 2) {
                  var5 = 6;
                }
                if (wb.field_b % 10 > 5) {
                  var5 = 5;
                }
              }
            }
            if (kb.field_b == 7) {
              var5 = 0;
              if (wb.field_b > 0) {
                var5 = wb.field_b / 2 % 2 + 6;
              }
              if (wb.field_b > 50) {
                var5 = 5;
              }
              if (wb.field_b > 75) {
                var5 = 4;
              }
              if (wb.field_b > 100) {
                var5 = 3;
              }
              if (wb.field_b > 125) {
                var5 = 2;
              }
              if (wb.field_b > 150) {
                var5 = 1;
              }
            }
            if (var5 < 0) {
              var5 = 0;
            }
            if (var5 > 7) {
              var5 = 7;
            }
            td.field_e[var4Lifetime1 + var5].a(128, -si.field_E + ci.field_sb, 119, jj.field_t, 320 + (-wd.field_c + rj.field_b));
            if (param1 != 7) {
              ah.b(true);
            }
            return;
          }
          var5 = -wb.field_b + 13;
        }
        if (kb.field_b == 5) {
          var5 = 7 - wb.field_b;
        }
        if (kb.field_b == 6) {
          var5 = 4;
          if (wb.field_b > 5) {
            var5 = 3;
          }
          if (wb.field_b > 10) {
            var5 = 2;
          }
          if (wb.field_b > 15) {
            var5 = 1;
          }
          if (wb.field_b > 20) {
            var5 = 0;
          }
          if (wb.field_b > 40) {
            var5 = 7;
            if (wb.field_b % 10 > 2) {
              var5 = 6;
            }
            if (wb.field_b % 10 > 5) {
              var5 = 5;
            }
          }
        }
        if (kb.field_b == 7) {
          var5 = 0;
          if (wb.field_b > 0) {
            var5 = wb.field_b / 2 % 2 + 6;
          }
          if (wb.field_b > 50) {
            var5 = 5;
          }
          if (wb.field_b > 75) {
            var5 = 4;
          }
          if (wb.field_b > 100) {
            var5 = 3;
          }
          if (wb.field_b > 125) {
            var5 = 2;
          }
          if (wb.field_b > 150) {
            var5 = 1;
          }
        }
        if (var5 < 0) {
          var5 = 0;
        }
        if (var5 > 7) {
          var5 = 7;
        }
        td.field_e[var4Lifetime1 + var5].a(128, -si.field_E + ci.field_sb, 119, jj.field_t, 320 + (-wd.field_c + rj.field_b));
        if (param1 == 7) {
          return;
        }
        ah.b(true);
        return;
    }

    final static void a(boolean param0, int param1, qc param2) {
        jd var7 = null;
        jd var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        try {
          var7 = id.field_c;
          var8 = var7;
          var8.e(param1, -2147483648);
          var8.field_m = var8.field_m + 1;
          var4 = var8.field_m;
          var8.c(-118, 1);
          var8.a(true, param2.field_u);
          var8.a(true, param2.field_m);
          var8.a(true, param2.field_p);
          var8.b(param2.field_k, false);
          var8.b(param2.field_j, false);
          var8.b(param2.field_t, false);
          var8.b(param2.field_q, param0);
          var8.c(-105, param2.field_r.length);
          for (var5 = 0; param2.field_r.length > var5; var5++) {
            var7.b(param2.field_r[var5], false);
          }
          var8.b(true, var4);
          var8.b(1, -var4 + var8.field_m);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ah.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param1 < -110) {
          var2 = 0;
          if ((param0 & 7) != 0) {
            var2 = 8 - (7 & param0);
          }
          var3 = param0 + var2;
          return var3;
        }
        ah.a(-61, (byte) -98);
        var2Lifetime1 = 0;
        if ((param0 & 7) != 0) {
          var2Lifetime1 = 8 - (7 & param0);
        }
        var3Lifetime1 = param0 + var2Lifetime1;
        return var3Lifetime1;
    }

    final static void b(boolean param0) {
        if (!param0) {
          return;
        }
        if (lk.field_e <= 0) {
          return;
        }
        if (oa.field_n) {
          return;
        }
        if (bi.field_b == null) {
          bi.field_b = tk.a(bi.field_i, 15, new int[]{100 * ud.field_k / qh.field_a[7] + 101 * lk.field_e}, 65520, 3, lc.field_h, (byte) -115, ic.field_t, lk.field_e);
          return;
        }
    }

    static {
        field_i = new int[10];
        field_g = "Continue";
        field_j = new wh();
        field_h = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_b = "Names can only contain letters, numbers, spaces and underscores";
    }
}
