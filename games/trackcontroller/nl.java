/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends RuntimeException {
    String field_a;
    Throwable field_d;
    static String field_c;
    static String field_f;
    static long field_e;
    static boolean field_b;

    public static void a(byte param0) {
        field_f = null;
        if (param0 >= -13) {
          return;
        }
        field_c = null;
    }

    final static void a(int param0) {
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        na stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        na var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = TrackController.field_F ? 1 : 0;
        try {
          var1_int = me.field_q;
          var2 = 0;
          if (di.field_h == 2) {
            var3_long = -fe.field_N + qg.a(false);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          var3 = 0;
          if (param0 > -5) {
            return;
          }
          while (var3 < sa.field_I.length) {
            var4 = mj.field_b[var3];
            if (var4 >= 0) {
              if (vi.field_f.field_e == var4) {
                var5 = j.field_a;
              } else {
                var5 = sl.field_n;
              }
            } else {
              var5 = db.field_db;
            }
            var6 = sa.field_I[var3];
            if (di.field_h == 2 &&
              1 == var2) {
              if (jf.field_i.length <= el.field_O.length) {
                stackIn_19_0 = el.field_O.length;
              } else {
                stackIn_19_0 = jf.field_i.length;
              }
              var7 = stackIn_19_0;
              if (bk.field_J.length >= ue.field_c.length) {
                stackIn_22_0 = bk.field_J.length;
              } else {
                stackIn_22_0 = ue.field_c.length;
              }
              var8 = stackIn_22_0;
              if (var3 >= 6 &&
                var3 < 6 + var7) {
                if (0 > -var7 + var3 - (6 - el.field_O.length)) {
                  stackIn_27_0 = "";
                } else {
                  stackIn_27_0 = el.field_O[-var7 + (el.field_O.length + var3) - 6];
                }
                var6 = stackIn_27_0;
              }
              if (var3 >= 7 + var7 &&
                var3 < 7 - (-var7 - var8)) {
                if (bk.field_J.length <= -var7 + var3 - 7) {
                  stackIn_33_0 = "";
                } else {
                  stackIn_33_0 = bk.field_J[-var7 + (-7 + var3)];
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            var7Lifetime1 = ib.a(!(var4 < 0), 10, var6);
            var8Lifetime1 = sf.field_F - (var7Lifetime1 >> 1);
            if (0 <= var4) {
              var1_int = var1_int + na.field_e;
              if (var4 == vi.field_f.field_e) {
                stackIn_45_0 = nh.field_c;
              } else {
                stackIn_45_0 = mk.field_a;
              }
              var9 = stackIn_45_0;
              if (var9 != null) {
                var9.a((of.field_f << 1) + pc.field_m, var8Lifetime1 - mb.field_c, var1_int, (byte) 39, (mb.field_c << 1) + var7Lifetime1);
              }
              var1_int = var1_int + of.field_f;
            }
            if (0 > var4) {
              r.field_k.c(var6, var8Lifetime1, ai.field_h + var1_int, var5, -1);
              var1_int = var1_int + dh.field_l;
            } else {
              mk.field_b.c(var6, var8Lifetime1, dk.field_a + var1_int, var5, -1);
              var1_int = var1_int + (na.field_e + of.field_f + pc.field_m);
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "nl.C(" + param0 + ')');
        }
    }

    final static int b(byte param0) {
        ij.field_d.a((byte) 95);
        if (!rj.field_d.b(29166)) {
          return bl.a((byte) -124);
        }
        if (param0 <= 71) {
          nl.a(20);
        }
        return 0;
    }

    nl(Throwable param0, String param1) {
        this.field_a = param1;
        this.field_d = param0;
    }

    final static u a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_1 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        var15 = TrackController.field_F ? 1 : 0;
        var8 = param3;
        var9 = param6;
        var10 = 0;
        var11 = 0;
        if (param5 != 512 &&
          param0 != 4096) {
          if (param5 == 256 ||
            param0 == 8192) {
            var11 = 1;
          }
        } else {
          var11 = -1;
        }
        if (param5 != 128 &&
          16384 != param0) {
          if (param5 == 1024 ||
            param0 == 2048) {
            var10 = 1;
          }
        } else {
          var10 = -1;
        }
        if (var10 != 0) {
          stackIn_20_0 = (0 != var11) ? 1 : 0;
        } else {
          stackIn_20_0 = 0;
        }
        var12 = stackIn_20_0;
        if (var12 != 0) {
          if (param5 == 128 ||
            2048 == param0) {
            var9 += 25;
          }
          if (param5 == 512 ||
            8192 == param0) {
            var8 += 25;
          }
          if (var10 != -1) {
            if (param5 == 1024) {
              if (4096 == param0) {
                var13 = -param4 + 13;
                var14 = -var13 + 52;
              } else {
                var13 = param4 + 39;
                var14 = -var13;
              }
            } else {
              if (param5 != 256) {
                var13 = 13 + param4;
                var14 = -var13;
              } else {
                var13 = -param4 + 39;
                var14 = 52 - var13;
              }
            }
          } else {
            if (param5 != 128) {
              if (param5 == 256) {
                var13 = param4 - 39;
                var14 = -var13;
              } else {
                var13 = -13 - param4;
                var14 = 52 - var13;
              }
            } else {
              if (4096 != param0) {
                var13 = -39 - param4;
                var14 = -var13 + 52;
              } else {
                var13 = -13 + param4;
                var14 = -var13;
              }
            }
          }
          var14 = gj.a(2, 104, var14);
          var8 = var8 + kj.field_s[var14];
          var9 = var9 - kj.field_t[var14];
        } else {
          var14 = param4;
          if (param7 == 24) {
            if (param5 != 256) {
              stackIn_31_0 = Math.max(0, param4);
            } else {
              stackIn_31_0 = Math.min(0, param4);
            }
            var14 = stackIn_31_0;
          } else {
            if (param7 == 25) {
              if (param5 == 128) {
                stackIn_27_0 = Math.min(0, param4);
              } else {
                stackIn_27_0 = Math.max(0, param4);
              }
              var14 = stackIn_27_0;
            }
          }
          stackIn_34_0 = 26;
          if (var10 == 0) {
            stackIn_35_1 = 1 + var11;
          } else {
            stackIn_35_1 = 2 - var10;
          }
          var13 = stackIn_34_0 * stackIn_35_1;
          var9 = var9 + (13 + var10 * var14);
          var8 = var8 + (13 + var11 * var14);
        }
        if (!param1) {
          var13 += 52;
        }
        if (param2 != -257) {
          field_c = (String) null;
        }
        var13 = gj.a(2, 104, var13);
        mb.field_d[var13].e(-(mb.field_d[var13].field_t / 2) + var8, -(mb.field_d[var13].field_q / 2) + var9);
        return new u(var8, var9);
    }

    static {
        field_f = null;
        field_c = "Passwords must be between 5 and 20 characters long";
    }
}
