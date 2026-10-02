/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static dm[] field_b;
    static String field_a;
    static java.math.BigInteger field_c;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            field_b = (dm[]) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean a(int param0) {
        int incrementValue$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Geoblox.field_C;
        try {
          var1_int = 240 * vb.field_f + 320;
          var2 = var1_int;
          var3 = -(230 * vb.field_f) + var1_int;
          var4 = 230 * vb.field_f + var1_int;
          var5 = 230;
          var6 = 0;
          var7 = 52900;
          var8 = 64 / ((param0 - 32) / 34);
          var9 = var7 - var5;
          if (vb.field_c[-var5 + var1_int] != 0) {
            return true;
          }
          if (0 != vb.field_c[var1_int + var5]) {
            return true;
          }
          if (vb.field_c[var3] != 0) {
            return true;
          }
          if (vb.field_c[var4] != 0) {
            return true;
          }
          L0: while (true) {
            incrementValue$0 = var6;
            var6++;
            var9 = var9 + (incrementValue$0 + var6);
            var2 = var2 + vb.field_f;
            var1_int = var1_int - vb.field_f;
            if (var7 < var9) {
              var3 = var3 + vb.field_f;
              var4 = var4 - vb.field_f;
              var5--;
              var9 = var9 - (var5 + var5);
            }
            if (var6 > var5) {
              return false;
            }
            if (0 != vb.field_c[-var6 + var3]) {
              return true;
            }
            if (vb.field_c[var3 + var6] != 0) {
              return true;
            }
            if (vb.field_c[-var5 + var1_int] != 0) {
              return true;
            }
            if (vb.field_c[var5 + var1_int] != 0) {
              return true;
            }
            if (vb.field_c[var2 - var5] != 0) {
              return true;
            }
            if (vb.field_c[var5 + var2] != 0) {
              return true;
            }
            if (vb.field_c[var4 - var6] != 0) {
              return true;
            }
            if (vb.field_c[var4 + var6] == 0) {
              continue L0;
            }
            return true;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ld.B(" + param0 + ')');
        }
    }

    final static void b(boolean param0) {
        ji.field_h = ji.field_h + 1;
        if (ji.field_h >= kd.field_f.length) {
          if (sa.field_c > 0.15000000000000002) {
            sa.field_c = sa.field_c - 0.05;
          }
          return;
        }
        if ((4 & kd.field_f[ji.field_h]) != 0) {
          og.field_r = og.field_r + 0.055555559694767f;
          sa.b(!param0);
        }
        if ((kd.field_f[ji.field_h] & 1) == 0) {
          if (!param0) {
            if ((kd.field_f[ji.field_h] & 2) != 0) {
              if (f.field_qb < 7) {
                f.field_qb = f.field_qb + 1;
              }
            }
            if (0 != (kd.field_f[ji.field_h] & 16)) {
              sa.field_c = sa.field_c + 0.05;
            }
            if ((8 & kd.field_f[ji.field_h]) != 0) {
              rc.field_h = rc.field_h * 1.100000023841858f;
            }
            if (0 != (kd.field_f[ji.field_h] & 128)) {
              if (0.800000011920929f > ij.field_ab) {
                ij.field_ab = ij.field_ab + 0.02857142873108387f;
              }
              sa.b(!param0);
            }
            return;
          }
          ld.b(true);
          if ((kd.field_f[ji.field_h] & 2) == 0) {
            if (0 != (kd.field_f[ji.field_h] & 16)) {
              sa.field_c = sa.field_c + 0.05;
            }
            if ((8 & kd.field_f[ji.field_h]) != 0) {
              rc.field_h = rc.field_h * 1.100000023841858f;
            }
            if (0 != (kd.field_f[ji.field_h] & 128)) {
              if (0.800000011920929f > ij.field_ab) {
                ij.field_ab = ij.field_ab + 0.02857142873108387f;
              }
              sa.b(!param0);
            }
            return;
          }
          if (f.field_qb < 7) {
            f.field_qb = f.field_qb + 1;
          }
          if (0 != (kd.field_f[ji.field_h] & 16)) {
            sa.field_c = sa.field_c + 0.05;
          }
          if ((8 & kd.field_f[ji.field_h]) != 0) {
            rc.field_h = rc.field_h * 1.100000023841858f;
          }
          if (0 != (kd.field_f[ji.field_h] & 128)) {
            if (0.800000011920929f > ij.field_ab) {
              ij.field_ab = ij.field_ab + 0.02857142873108387f;
            }
            sa.b(!param0);
          }
          return;
        }
        if (ag.field_k < 7) {
          ag.field_k = ag.field_k + 1;
          if (param0) {
            ld.b(true);
          }
          if ((kd.field_f[ji.field_h] & 2) != 0) {
            if (f.field_qb < 7) {
              f.field_qb = f.field_qb + 1;
            }
          }
          if (0 != (kd.field_f[ji.field_h] & 16)) {
            sa.field_c = sa.field_c + 0.05;
          }
          if ((8 & kd.field_f[ji.field_h]) != 0) {
            rc.field_h = rc.field_h * 1.100000023841858f;
          }
          if (0 != (kd.field_f[ji.field_h] & 128)) {
            if (0.800000011920929f > ij.field_ab) {
              ij.field_ab = ij.field_ab + 0.02857142873108387f;
            }
            sa.b(!param0);
          }
          return;
        }
        if (param0) {
          ld.b(true);
          if ((kd.field_f[ji.field_h] & 2) != 0) {
            if (f.field_qb >= 7) {
              if (0 != (kd.field_f[ji.field_h] & 16)) {
                sa.field_c = sa.field_c + 0.05;
              }
              if ((8 & kd.field_f[ji.field_h]) != 0) {
                rc.field_h = rc.field_h * 1.100000023841858f;
              }
              if (0 != (kd.field_f[ji.field_h] & 128)) {
                if (0.800000011920929f > ij.field_ab) {
                  ij.field_ab = ij.field_ab + 0.02857142873108387f;
                }
                sa.b(!param0);
              }
              return;
            }
            f.field_qb = f.field_qb + 1;
          }
          if (0 != (kd.field_f[ji.field_h] & 16)) {
            sa.field_c = sa.field_c + 0.05;
            if ((8 & kd.field_f[ji.field_h]) != 0) {
              rc.field_h = rc.field_h * 1.100000023841858f;
            }
            if (0 != (kd.field_f[ji.field_h] & 128)) {
              if (0.800000011920929f > ij.field_ab) {
                ij.field_ab = ij.field_ab + 0.02857142873108387f;
              }
              sa.b(!param0);
            }
            return;
          }
          if ((8 & kd.field_f[ji.field_h]) == 0) {
            if (0 != (kd.field_f[ji.field_h] & 128)) {
              if (0.800000011920929f > ij.field_ab) {
                ij.field_ab = ij.field_ab + 0.02857142873108387f;
              }
              sa.b(!param0);
            }
            return;
          }
          rc.field_h = rc.field_h * 1.100000023841858f;
          if (0 != (kd.field_f[ji.field_h] & 128)) {
            if (0.800000011920929f > ij.field_ab) {
              ij.field_ab = ij.field_ab + 0.02857142873108387f;
            }
            sa.b(!param0);
          }
          return;
        }
        if ((kd.field_f[ji.field_h] & 2) != 0) {
          if (f.field_qb >= 7) {
            if (0 == (kd.field_f[ji.field_h] & 16)) {
              if ((8 & kd.field_f[ji.field_h]) == 0) {
                if (0 != (kd.field_f[ji.field_h] & 128)) {
                  if (0.800000011920929f > ij.field_ab) {
                    ij.field_ab = ij.field_ab + 0.02857142873108387f;
                  }
                  sa.b(!param0);
                }
                return;
              }
              rc.field_h = rc.field_h * 1.100000023841858f;
              if (0 != (kd.field_f[ji.field_h] & 128)) {
                if (0.800000011920929f > ij.field_ab) {
                  ij.field_ab = ij.field_ab + 0.02857142873108387f;
                }
                sa.b(!param0);
              }
              return;
            }
            sa.field_c = sa.field_c + 0.05;
            if ((8 & kd.field_f[ji.field_h]) == 0) {
              if (0 != (kd.field_f[ji.field_h] & 128)) {
                if (0.800000011920929f > ij.field_ab) {
                  ij.field_ab = ij.field_ab + 0.02857142873108387f;
                }
                sa.b(!param0);
              }
              return;
            }
            rc.field_h = rc.field_h * 1.100000023841858f;
            if (0 != (kd.field_f[ji.field_h] & 128)) {
              if (0.800000011920929f > ij.field_ab) {
                ij.field_ab = ij.field_ab + 0.02857142873108387f;
              }
              sa.b(!param0);
            }
            return;
          }
          f.field_qb = f.field_qb + 1;
        }
        if (0 == (kd.field_f[ji.field_h] & 16)) {
          if ((8 & kd.field_f[ji.field_h]) == 0) {
            if (0 != (kd.field_f[ji.field_h] & 128)) {
              if (0.800000011920929f > ij.field_ab) {
                ij.field_ab = ij.field_ab + 0.02857142873108387f;
              }
              sa.b(!param0);
            }
            return;
          }
          rc.field_h = rc.field_h * 1.100000023841858f;
          if (0 != (kd.field_f[ji.field_h] & 128)) {
            if (0.800000011920929f > ij.field_ab) {
              ij.field_ab = ij.field_ab + 0.02857142873108387f;
            }
            sa.b(!param0);
          }
          return;
        }
        sa.field_c = sa.field_c + 0.05;
        if ((8 & kd.field_f[ji.field_h]) == 0) {
          if (0 != (kd.field_f[ji.field_h] & 128)) {
            if (0.800000011920929f > ij.field_ab) {
              ij.field_ab = ij.field_ab + 0.02857142873108387f;
            }
            sa.b(!param0);
          }
          return;
        }
        rc.field_h = rc.field_h * 1.100000023841858f;
        if (0 != (kd.field_f[ji.field_h] & 128)) {
          if (0.800000011920929f > ij.field_ab) {
            ij.field_ab = ij.field_ab + 0.02857142873108387f;
          }
          sa.b(!param0);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        ug.a(param3, true, param0, 1, param1);
        if (param2 > 39) {
            return;
        }
        ld.a(118);
    }

    static {
        field_a = "+2,000 for being great!";
        field_c = new java.math.BigInteger("65537");
    }
}
