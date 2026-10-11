/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nja {
    static int field_a;

    final static void a(boolean param0, byte param1) {
        int var3;
        var3 = BachelorFridge.field_y;
        if (param0) {
          w.field_e = false;
        } else {
          if (null == pw.field_w) {
            w.field_e = false;
          }
        }
        if (param1 != 81) {
          return;
        }
        if (param0) {
          if (0 >= lfa.field_q) {
            if (ld.field_p <= 0) {
              if (dja.field_m > 0) {
                dja.field_m = dja.field_m - 1;
              }
            } else {
              ld.field_p = ld.field_p - 1;
            }
          } else {
            lfa.field_q = lfa.field_q - 1;
          }
        } else {
          if (pw.field_w == null) {
            if (rv.field_n != null) {
              if (lfa.field_q <= 0) {
                if (dja.field_m > 0) {
                  dja.field_m = dja.field_m - 1;
                } else {
                  if (saa.field_b > ld.field_p) {
                    if (ld.field_p == 0) {
                      dj.a(0, true);
                    }
                    ld.field_p = ld.field_p + 1;
                  }
                }
              } else {
                lfa.field_q = lfa.field_q - 1;
              }
            } else {
              w.field_e = false;
              if (0 >= ld.field_p) {
                if (0 < dja.field_m) {
                  dja.field_m = dja.field_m - 1;
                } else {
                  if (lfa.field_q < saa.field_b) {
                    if (lfa.field_q == 0) {
                      ft.a(2048);
                    }
                    lfa.field_q = lfa.field_q + 1;
                  }
                }
              } else {
                ld.field_p = ld.field_p - 1;
              }
            }
          } else {
            if (lfa.field_q > 0) {
              lfa.field_q = lfa.field_q - 1;
            } else {
              if (ld.field_p <= 0) {
                if (dja.field_m < saa.field_b) {
                  if (dja.field_m == 0) {
                    dj.a(param1 - 81, false);
                  }
                  dja.field_m = dja.field_m + 1;
                }
              } else {
                ld.field_p = ld.field_p - 1;
              }
            }
          }
        }
    }

    final static kv a(boolean param0) {
        int var5_int = 0;
        int var6 = 0;
        int var1;
        Object var3;
        int[] var5;
        int var7;
        int[] var8;
        int[] var11;
        int[] var13;
        byte[] var16;
        byte[] var17;
        var7 = BachelorFridge.field_y;
        var1 = eha.field_s[0] * lq.field_A[0];
        var16 = baa.field_P[0];
        if (!uf.field_b[0]) {
          var8 = new int[var1];
          for (var5_int = 0; var1 > var5_int; var5_int++) {
            var8[var5_int] = hk.field_f[dda.a((int) var16[var5_int], 255)];
          }
          var3 = new kv(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], var8);
        } else {
          var17 = cea.field_d[0];
          var13 = new int[var1];
          var11 = var13;
          var5 = var11;
          for (var6 = 0; var6 < var1; var6++) {
            var5[var6] = mp.a(dda.a(255, (int) var17[var6]) << 24, hk.field_f[dda.a(255, (int) var16[var6])]);
          }
          var3 = new pa(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], var13);
        }
        al.b(-18073);
        if (!param0) {
          nja.a(28);
        }
        return (kv) (var3);
    }

    final static void a(int param0) {
        if (param0 < 70) {
          return;
        }
        hl.field_I = false;
        sea.field_j = ig.field_m.b(16711935) == 0 ? true : false;
    }

    static {
    }
}
