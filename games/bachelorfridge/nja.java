/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nja {
    static int field_a;

    final static void a(boolean param0, byte param1) {
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (param0) {
            w.field_e = false;
            break L0;
          } else {
            if (null != pw.field_w) {
              break L0;
            } else {
              w.field_e = false;
              break L0;
            }
          }
        }
        if (param1 == 81) {
          L1: {
            if (param0) {
              if (0 >= lfa.field_q) {
                if (ld.field_p <= 0) {
                  if (-1 > (dja.field_m ^ -1)) {
                    dja.field_m = dja.field_m - 1;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ld.field_p = ld.field_p - 1;
                  break L1;
                }
              } else {
                lfa.field_q = lfa.field_q - 1;
                break L1;
              }
            } else {
              if (pw.field_w == null) {
                if (rv.field_n != null) {
                  if (lfa.field_q <= 0) {
                    if (-1 > (dja.field_m ^ -1)) {
                      dja.field_m = dja.field_m - 1;
                      break L1;
                    } else {
                      if (saa.field_b <= ld.field_p) {
                        break L1;
                      } else {
                        L2: {
                          if (ld.field_p == 0) {
                            dj.a(0, true);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        ld.field_p = ld.field_p + 1;
                        break L1;
                      }
                    }
                  } else {
                    lfa.field_q = lfa.field_q - 1;
                    break L1;
                  }
                } else {
                  w.field_e = false;
                  if (0 >= ld.field_p) {
                    if (0 < dja.field_m) {
                      dja.field_m = dja.field_m - 1;
                      break L1;
                    } else {
                      if (lfa.field_q >= saa.field_b) {
                        break L1;
                      } else {
                        L3: {
                          if (lfa.field_q != 0) {
                            break L3;
                          } else {
                            ft.a(2048);
                            break L3;
                          }
                        }
                        lfa.field_q = lfa.field_q + 1;
                        break L1;
                      }
                    }
                  } else {
                    ld.field_p = ld.field_p - 1;
                    break L1;
                  }
                }
              } else {
                if ((lfa.field_q ^ -1) < -1) {
                  lfa.field_q = lfa.field_q - 1;
                  break L1;
                } else {
                  if (ld.field_p <= 0) {
                    if (dja.field_m < saa.field_b) {
                      L4: {
                        if (dja.field_m == 0) {
                          dj.a(param1 + -81, false);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      dja.field_m = dja.field_m + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    ld.field_p = ld.field_p - 1;
                    break L1;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static kv a(boolean param0) {
        int var1 = 0;
        pa var3 = null;
        int[] var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        byte[] var18 = null;
        int[] var19 = null;
        byte[] var20 = null;
        int[] var21 = null;
        L0: {
          var7 = BachelorFridge.field_y;
          var1 = eha.field_s[0] * lq.field_A[0];
          var18 = baa.field_P[0];
          if (uf.field_b[0]) {
            var20 = cea.field_d[0];
            var21 = new int[var1];
            var17 = var21;
            var13 = var17;
            var11 = var13;
            var5 = var11;
            var6 = 0;
            L1: while (true) {
              if (var6 >= var1) {
                var3 = new pa(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], var21);
                break L0;
              } else {
                var5[var6] = mp.a(dda.a(255, (int) var20[var6]) << -199205352, hk.field_f[dda.a(255, (int) var18[var6])]);
                var6++;
                continue L1;
              }
            }
          } else {
            var19 = new int[var1];
            var15 = var19;
            var8 = var15;
            var5_int = 0;
            L2: while (true) {
              if (var1 <= var5_int) {
                var3 = (pa) (Object) new kv(ok.field_Bb, kh.field_r, fl.field_j[0], fd.field_D[0], lq.field_A[0], eha.field_s[0], var19);
                break L0;
              } else {
                var8[var5_int] = hk.field_f[dda.a((int) var18[var5_int], 255)];
                var5_int++;
                continue L2;
              }
            }
          }
        }
        L3: {
          al.b(-18073);
          if (param0) {
            break L3;
          } else {
            nja.a(28);
            break L3;
          }
        }
        return (kv) (Object) var3;
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
