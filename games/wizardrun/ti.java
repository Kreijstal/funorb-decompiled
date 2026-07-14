/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    private int field_e;
    private int[] field_f;
    private int[] field_b;
    private int field_d;
    private int field_c;
    static int field_a;
    private int field_g;
    static String field_h;

    final static wd a(byte param0) {
        if (fi.field_y == ej.field_b) {
            throw new IllegalStateException();
        }
        if (!(fi.field_y != mi.field_z)) {
            fi.field_y = ej.field_b;
            return ki.field_F;
        }
        int var1 = 86 / ((param0 - 59) / 38);
        return null;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = wizardrun.field_H;
          if (param0 <= -92) {
            break L0;
          } else {
            field_a = 113;
            break L0;
          }
        }
        var7 = -1640531527;
        var8 = -1640531527;
        var5 = -1640531527;
        var4 = -1640531527;
        var10 = -1640531527;
        var3 = -1640531527;
        var6 = -1640531527;
        var9 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L2: while (true) {
              if (-257 >= (var2 ^ -1)) {
                var2 = 0;
                L3: while (true) {
                  if (var2 >= 256) {
                    this.d((byte) 121);
                    ((ti) this).field_g = 256;
                    return;
                  } else {
                    var6 = var6 + ((ti) this).field_b[3 + var2];
                    var4 = var4 + ((ti) this).field_b[var2 - -1];
                    var9 = var9 + ((ti) this).field_b[6 + var2];
                    var7 = var7 + ((ti) this).field_b[4 + var2];
                    var3 = var3 + ((ti) this).field_b[var2];
                    var10 = var10 + ((ti) this).field_b[7 + var2];
                    var8 = var8 + ((ti) this).field_b[var2 - -5];
                    var5 = var5 + ((ti) this).field_b[2 + var2];
                    var3 = var3 ^ var4 << 376564203;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -187062430;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -1276439160;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> -1856695920;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 2067750058;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 2073686660;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 1862401352;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1631870615;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((ti) this).field_b[var2] = var3;
                    ((ti) this).field_b[1 + var2] = var4;
                    ((ti) this).field_b[2 + var2] = var5;
                    ((ti) this).field_b[var2 + 3] = var6;
                    ((ti) this).field_b[4 + var2] = var7;
                    ((ti) this).field_b[5 + var2] = var8;
                    ((ti) this).field_b[var2 + 6] = var9;
                    ((ti) this).field_b[var2 + 7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var9 = var9 + ((ti) this).field_f[var2 - -6];
                var6 = var6 + ((ti) this).field_f[3 + var2];
                var4 = var4 + ((ti) this).field_f[1 + var2];
                var3 = var3 + ((ti) this).field_f[var2];
                var10 = var10 + ((ti) this).field_f[7 + var2];
                var7 = var7 + ((ti) this).field_f[var2 - -4];
                var8 = var8 + ((ti) this).field_f[var2 - -5];
                var5 = var5 + ((ti) this).field_f[2 + var2];
                var3 = var3 ^ var4 << -1818203605;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> -391383646;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << -710978168;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1438194512;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -68606870;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> -1741955548;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 1689585224;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 1473455945;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((ti) this).field_b[var2] = var3;
                ((ti) this).field_b[var2 - -1] = var4;
                ((ti) this).field_b[var2 - -2] = var5;
                ((ti) this).field_b[3 + var2] = var6;
                ((ti) this).field_b[4 + var2] = var7;
                ((ti) this).field_b[5 + var2] = var8;
                ((ti) this).field_b[var2 - -6] = var9;
                ((ti) this).field_b[var2 + 7] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 1502183755;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 1655117794;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -1490210616;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 1035301936;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 1222313834;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 782077444;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 386336008;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 92400937;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L1;
          }
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = wizardrun.field_H;
        ((ti) this).field_c = ((ti) this).field_c + 1;
        ((ti) this).field_d = ((ti) this).field_d + (((ti) this).field_c + 1);
        if (param0 >= 116) {
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -257) {
              return;
            } else {
              L1: {
                var3 = ((ti) this).field_b[var2];
                if (0 == (var2 & 2)) {
                  if ((1 & var2) == 0) {
                    ((ti) this).field_e = ((ti) this).field_e ^ ((ti) this).field_e << 937797805;
                    break L1;
                  } else {
                    ((ti) this).field_e = ((ti) this).field_e ^ ((ti) this).field_e >>> -1651574458;
                    break L1;
                  }
                } else {
                  if (0 != (var2 & 1)) {
                    ((ti) this).field_e = ((ti) this).field_e ^ ((ti) this).field_e >>> -560499088;
                    break L1;
                  } else {
                    ((ti) this).field_e = ((ti) this).field_e ^ ((ti) this).field_e << 1278334530;
                    break L1;
                  }
                }
              }
              ((ti) this).field_e = ((ti) this).field_e + ((ti) this).field_b[128 + var2 & 255];
              var4 = ((ti) this).field_d + (((ti) this).field_e + ((ti) this).field_b[kl.b(255, var3 >> -831166590)]);
              ((ti) this).field_b[var2] = ((ti) this).field_d + (((ti) this).field_e + ((ti) this).field_b[kl.b(255, var3 >> -831166590)]);
              ((ti) this).field_d = ((ti) this).field_b[kl.b(261240, var4) >> 2135610216 >> 800863586] + var3;
              ((ti) this).field_f[var2] = ((ti) this).field_b[kl.b(261240, var4) >> 2135610216 >> 800863586] + var3;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        if (param0 != -80) {
            field_a = 73;
        }
        field_h = null;
    }

    final int b(byte param0) {
        if (!(0 != ((ti) this).field_g)) {
            this.d((byte) 121);
            ((ti) this).field_g = 256;
        }
        if (param0 <= 58) {
            this.b(13);
        }
        ((ti) this).field_g = ((ti) this).field_g - 1;
        return ((ti) this).field_f[((ti) this).field_g - 1];
    }

    final static gb a(int param0, String param1, kl param2, String param3, kl param4) {
        int var5 = param2.b(-1, param1);
        int var6 = param2.a(var5, param3, param0 + -800875572);
        if (param0 != 800863586) {
            field_h = null;
        }
        return dh.a(var6, var5, (byte) -119, param4, param2);
    }

    ti(int[] param0) {
        int var2 = 0;
        ((ti) this).field_b = new int[256];
        ((ti) this).field_f = new int[256];
        for (var2 = 0; var2 < param0.length; var2++) {
            ((ti) this).field_f[var2] = param0[var2];
        }
        this.b(-97);
    }

    final static void a(int param0) {
        int var2 = wizardrun.field_H;
        if (!(pk.a((byte) -35))) {
            if (ki.field_E != null) {
                if (ki.field_E.field_b) {
                    di.a((byte) 60);
                    kj.field_b.b((ub) (Object) new vg(kj.field_b, cf.field_f), (byte) 96);
                }
            }
            return;
        }
        if (param0 != 8) {
            return;
        }
        boolean discarded$10 = kj.field_b.a(param0 + 118, true, ne.field_g, sf.field_d);
        kj.field_b.g((byte) 118);
        while (ae.a(-61)) {
            boolean discarded$11 = kj.field_b.a(param0 ^ -125, vk.field_r, ae.field_a);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Back";
    }
}
