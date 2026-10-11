/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static ka field_a;
    static ll field_b;
    static boolean[][] field_c;
    static int field_d;

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 < 24) {
          de.a(57);
          field_c = (boolean[][]) null;
          return;
        }
        field_c = (boolean[][]) null;
    }

    final static ka[] a(boolean param0) {
        ka[] var1;
        int var2;
        int var3;
        int var6_int;
        int var8;
        int[] var9;
        byte[] var26;
        int[] var27;
        int[] var6;
        int var7;
        int[] var13;
        int[] var16;
        byte[] var28;
        byte[] var29;
        int[] var30;
        byte[] var31;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (param0) {
          var1 = new ka[vl.field_b];
          for (var2 = 0; vl.field_b > var2; var2++) {
            var3 = lg.field_e[var2] * pg.field_r[var2];
            var26 = h.field_a[var2];
            if (!vd.field_c[var2]) {
              var9 = new int[var3];
              var27 = var9;
              for (var6_int = 0; var3 > var6_int; var6_int++) {
                var9[var6_int] = td.field_m[jh.a((int) var26[var6_int], 255)];
              }
              var1[var2] = new ka(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], var27);
            } else {
              var28 = gf.field_t[var2];
              var16 = new int[var3];
              var13 = var16;
              var6 = var13;
              for (var7 = 0; var3 > var7; var7++) {
                var6[var7] = p.a(jh.a(255, (int) var28[var7]) << 24, td.field_m[jh.a(255, (int) var26[var7])]);
              }
              var1[var2] = (ka) ((Object) new el(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], var16));
            }
          }
        } else {
          field_c = (boolean[][]) null;
          var1 = new ka[vl.field_b];
          for (var2 = 0; vl.field_b > var2; var2++) {
            var3 = lg.field_e[var2] * pg.field_r[var2];
            var29 = h.field_a[var2];
            if (!vd.field_c[var2]) {
              var9 = new int[var3];
              var30 = var9;
              for (var6_int = 0; var3 > var6_int; var6_int++) {
                var9[var6_int] = td.field_m[jh.a((int) var29[var6_int], 255)];
              }
              var1[var2] = new ka(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], var30);
            } else {
              var31 = gf.field_t[var2];
              var16 = new int[var3];
              var13 = var16;
              var6 = var13;
              for (var7 = 0; var3 > var7; var7++) {
                var6[var7] = p.a(jh.a(255, (int) var31[var7]) << 24, td.field_m[jh.a(255, (int) var29[var7])]);
              }
              var1[var2] = (ka) ((Object) new el(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], var16));
            }
          }
        }
        p.a(0);
        return var1;
    }

    final static boolean a(int param0) {
        int var2 = 0;
        gh var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        gh var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          var4 = (gh) (pf.field_d.c((byte) -66));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var1.field_p > var2; var2++) {
            if (null != var4.field_j[var2] &&
              var4.field_j[var2].field_d == 0) {
              return false;
            }
            if (null != var4.field_q[var2] &&
              var4.field_q[var2].field_d == 0) {
              return false;
            }
          }
          if (param0 != -1) {
            field_a = (ka) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "de.D(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        boolean[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8Lifetime1;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          var1_int = nh.field_hb.length;
          if (ma.field_j >= var1_int) {
            return;
          }
          var2 = ra.field_k[ma.field_j];
          if (!var2[a.field_c]) {
            return;
          }
          var3 = nh.field_hb[ma.field_j];
          var4 = we.field_l[ma.field_j];
          var5 = 200;
          var6 = var4 * var5;
          if (param0 != -131073) {
            return;
          }
          var7 = var3 * var6;
          var8 = ef.field_k % var7 / var6;
          cj.field_j = -var8 + a.field_c;
          if (cj.field_j < 0) {
            cj.field_j = cj.field_j + var3;
          }
          var10 = 0;
          var8Lifetime1 = var10;
          while (3 > var10) {
            if (lj.field_n[var10] != null) {
              lj.field_n[var10].field_kb = 0;
            }
            var10++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "de.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0, lj param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 64 % ((-52 - param0) / 32);
          stackIn_1_0 = param1.b((byte) 79);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("de.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (param0 >= 100) {
          if (param1 == 0) {
            return 0;
          }
          if (param1 < 0) {
            throw new IllegalArgumentException("");
          }
          if (32768 > param1) {
            if (param1 < 128) {
              if (param1 < 8) {
                if (param1 < 2) {
                  return 256;
                }
                var2 = 7;
              } else {
                var2 = (param1 >= 32) ? 5 : 6;
              }
            } else {
              if (2048 <= param1) {
                var2 = (param1 >= 8192) ? 1 : 2;
              } else {
                var2 = (param1 < 512) ? 4 : 3;
              }
            }
            param1 = param1 << (var2 << 1);
            return dd.field_p[param1 - 32768] >> var2;
          }
          if (param1 < 131072) {
            return dd.field_p[-32768 + param1];
          }
          if (param1 >= 33554432) {
            if (param1 >= 536870912) {
              var2 = 7;
            } else {
              if (param1 >= 134217728) {
                var2 = 6;
              } else {
                var2 = 5;
              }
            }
          } else {
            if (2097152 > param1) {
              if (param1 < 524288) {
                var2 = 1;
              } else {
                var2 = 2;
              }
            } else {
              if (param1 >= 8388608) {
                var2 = 4;
              } else {
                var2 = 3;
              }
            }
          }
        } else {
          de.a(-50);
          if (param1 == 0) {
            return 0;
          }
          if (param1 < 0) {
            throw new IllegalArgumentException("");
          }
          if (32768 > param1) {
            if (param1 < 128) {
              if (param1 < 8) {
                if (param1 < 2) {
                  return 256;
                }
                var2 = 7;
              } else {
                if (param1 < 32) {
                  var2 = 6;
                } else {
                  var2 = 5;
                }
              }
            } else {
              if (2048 <= param1) {
                if (param1 < 8192) {
                  var2 = 2;
                } else {
                  var2 = 1;
                }
              } else {
                if (param1 < 512) {
                  var2 = 4;
                } else {
                  var2 = 3;
                }
              }
            }
            param1 = param1 << (var2 << 1);
            return dd.field_p[param1 - 32768] >> var2;
          }
          if (param1 < 131072) {
            return dd.field_p[-32768 + param1];
          }
          if (param1 >= 33554432) {
            if (param1 >= 536870912) {
              var2 = 7;
            } else {
              if (param1 < 134217728) {
                var2 = 5;
                param1 = param1 >> (var2 << 1);
                return dd.field_p[param1 - 32768] << var2;
              }
              var2 = 6;
            }
          } else {
            if (2097152 > param1) {
              if (param1 >= 524288) {
                var2 = 2;
              } else {
                var2 = 1;
              }
            } else {
              if (param1 < 8388608) {
                var2 = 3;
              } else {
                var2 = 4;
              }
            }
          }
        }
        param1 = param1 >> (var2 << 1);
        return dd.field_p[param1 - 32768] << var2;
    }

    static {
        field_a = null;
        field_c = new boolean[][]{new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false}, new boolean[]{false}};
        field_b = new ll();
        field_d = 0;
    }
}
