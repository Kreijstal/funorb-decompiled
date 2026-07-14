/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vi extends be {
    int field_y;
    static wl field_A;
    static ck[] field_z;

    public static void f(byte param0) {
        field_A = null;
        field_z = null;
        if (param0 != 46) {
            Object var2 = null;
            nj discarded$0 = vi.a((ji) null, (ji) null, (String) null, (byte) -124, (String) null);
        }
    }

    abstract Object c(int param0);

    abstract boolean g(byte param0);

    vi(int param0) {
        ((vi) this).field_y = param0;
    }

    final static nj a(ji param0, ji param1, String param2, byte param3, String param4) {
        int var5 = param1.b(-1, param2);
        int var7 = -37 % ((param3 - 39) / 44);
        int var6 = param1.a(var5, 13030, param4);
        return e.a(param0, var5, var6, (byte) -75, param1);
    }

    final static int d(int param0) {
        if (param0 != 1) {
            field_z = null;
            return 1;
        }
        return 1;
    }

    final static boolean a(int[] param0, int param1) {
        long var2 = 0L;
        bf var4_ref_bf = null;
        int var4 = 0;
        int var5_int = 0;
        bf var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        if (wf.field_u != ph.field_xb) {
          return false;
        } else {
          L0: {
            var2 = ik.a(param1 + 4);
            if (ub.field_a == 0) {
              break L0;
            } else {
              if (dl.field_N < 0) {
                var4_ref_bf = (bf) (Object) ci.field_h.c((byte) -98);
                if (var4_ref_bf == null) {
                  break L0;
                } else {
                  if (var4_ref_bf.field_p >= var2) {
                    break L0;
                  } else {
                    var4_ref_bf.b((byte) 112);
                    sm.field_e = var4_ref_bf.field_n.length;
                    de.field_V.field_n = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (var5_int >= sm.field_e) {
                        lg.field_U = bb.field_d;
                        bb.field_d = kf.field_L;
                        kf.field_L = bh.field_k;
                        bh.field_k = var4_ref_bf.field_s;
                        return true;
                      } else {
                        de.field_V.field_r[var5_int] = var4_ref_bf.field_n[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (param1 == 0) {
              break L2;
            } else {
              int discarded$1 = vi.d(-63);
              break L2;
            }
          }
          L3: while (true) {
            L4: {
              if (0 > dl.field_N) {
                de.field_V.field_n = 0;
                if (!pe.b(param1 + 25973, 1)) {
                  return false;
                } else {
                  dl.field_N = de.field_V.i((byte) 81);
                  de.field_V.field_n = 0;
                  sm.field_e = param0[dl.field_N];
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (fh.a((byte) 116)) {
              if (ub.field_a == 0) {
                lg.field_U = bb.field_d;
                bb.field_d = kf.field_L;
                kf.field_L = bh.field_k;
                bh.field_k = dl.field_N;
                dl.field_N = -1;
                return true;
              } else {
                L5: {
                  var4 = ub.field_a;
                  if (0.0 != pg.field_b) {
                    var4 = (int)((double)var4 + gg.field_A.nextGaussian() * pg.field_b);
                    if (-1 >= (var4 ^ -1)) {
                      break L5;
                    } else {
                      var4 = 0;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var5 = new bf(var2 + (long)var4, dl.field_N, new byte[sm.field_e]);
                var6 = 0;
                L6: while (true) {
                  if (sm.field_e <= var6) {
                    ci.field_h.a((bh) (Object) var5, param1 ^ 2777);
                    dl.field_N = -1;
                    continue L3;
                  } else {
                    var5.field_n[var6] = de.field_V.field_r[var6];
                    var6++;
                    continue L6;
                  }
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new wl(256);
    }
}
