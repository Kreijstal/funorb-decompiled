/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static int field_b;
    static int[][][] field_f;
    static String[][] field_d;
    static int[][] field_a;
    static String[][] field_c;
    static int[][][] field_e;

    final static void a(int param0) {
        dd.field_t = null;
        h.field_a = null;
        ug.field_e = null;
        td.field_m = null;
        lg.field_e = null;
        pg.field_r = null;
        if (param0 != 0) {
            field_c = null;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = TorChallenge.field_F ? 1 : 0;
          var8 = -param0 + 32 * param4;
          var9 = var8 - -32;
          if (var8 > -1) {
            var10 = -1;
            break L0;
          } else {
            var10 = 1;
            break L0;
          }
        }
        L1: {
          var8 = var8 * var10;
          if (-1025 < var8) {
            var10 = -var10;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((var9 ^ -1) > -1) {
            var11 = -1;
            break L2;
          } else {
            var11 = 1;
            break L2;
          }
        }
        L3: {
          var9 = var9 * var11;
          if (var9 > 1024) {
            var11 = -var11;
            break L3;
          } else {
            break L3;
          }
        }
        var12 = wi.field_a[var8];
        var13 = wi.field_a[var9];
        gl.field_l[param3][param2][0][0] = 320 + var10 * (fj.a(1870096848, var12, 23592960) >> 1071552496);
        gl.field_l[param3][param2][0][1] = 320 + var11 * (fj.a(1870096848, var13, 23592960) >> -577896240);
        gl.field_l[param3][param2][1][0] = (fj.a(1870096848, var12, 19398656) >> 502237424) * var10 - -320;
        gl.field_l[param3][param2][1][1] = 320 + var11 * (fj.a(1870096848, var13, 19398656) >> 514300784);
        gl.field_l[param3][param2][2][0] = (fj.a(1870096848, var12, 18874368) >> -488309488) * var10 - -320;
        gl.field_l[param3][param2][2][1] = 320 + var11 * (fj.a(1870096848, var13, 18874368) >> 1618869072);
        vb.field_a[param3][param2] = param4 + param1 / 32;
        if (param6 <= -5) {
          L4: {
            if (0 <= vb.field_a[param3][param2]) {
              break L4;
            } else {
              vb.field_a[param3][param2] = vb.field_a[param3][param2] + 64;
              break L4;
            }
          }
          L5: {
            if (-65 >= (vb.field_a[param3][param2] ^ -1)) {
              vb.field_a[param3][param2] = vb.field_a[param3][param2] - 64;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            L7: {
              L8: {
                if (param4 < 0) {
                  break L8;
                } else {
                  if (param4 <= 64) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (-1 > (param4 ^ -1)) {
                  break L9;
                } else {
                  if (param4 >= -64) {
                    break L7;
                  } else {
                    break L9;
                  }
                }
              }
              nj.field_b[vb.field_a[param3][param2]][0] = 360 - -(fj.a(1870096848, fj.field_m[16 + var8], 23592960) >> -345557360);
              nj.field_b[vb.field_a[param3][param2]][1] = 296 + (fj.a(1870096848, fj.field_m[var8 + 16], 19398656) >> -1442514320);
              break L6;
            }
            nj.field_b[vb.field_a[param3][param2]][0] = -(fj.a(1870096848, fj.field_m[16 + var8], 23592960) >> 1763507792) + 360;
            nj.field_b[vb.field_a[param3][param2]][1] = -(fj.a(1870096848, fj.field_m[var8 + 16], 19398656) >> -1257473520) + 296;
            break L6;
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, int[] param1) {
        long var2 = 0L;
        lc var4_ref_lc = null;
        int var4 = 0;
        int var5_int = 0;
        lc var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        if (qc.field_d == aj.field_c) {
          L0: {
            if (param0 == 16) {
              break L0;
            } else {
              p.a(72);
              break L0;
            }
          }
          L1: {
            var2 = ol.a(256);
            if (-1 == (sl.field_b ^ -1)) {
              break L1;
            } else {
              if (jf.field_tb < 0) {
                var4_ref_lc = (lc) (Object) ba.field_a.c((byte) -5);
                if (var4_ref_lc == null) {
                  break L1;
                } else {
                  if ((var2 ^ -1L) < (var4_ref_lc.field_l ^ -1L)) {
                    var4_ref_lc.a(true);
                    bb.field_i = var4_ref_lc.field_q.length;
                    id.field_b.field_q = 0;
                    var5_int = 0;
                    L2: while (true) {
                      if (var5_int >= bb.field_i) {
                        ul.field_j = uc.field_X;
                        uc.field_X = md.field_i;
                        md.field_i = cb.field_g;
                        cb.field_g = var4_ref_lc.field_i;
                        return true;
                      } else {
                        id.field_b.field_m[var5_int] = var4_ref_lc.field_q[var5_int];
                        var5_int++;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          L3: while (true) {
            L4: {
              if (-1 < (jf.field_tb ^ -1)) {
                id.field_b.field_q = 0;
                if (pe.a((byte) 119, 1)) {
                  jf.field_tb = id.field_b.o(11650);
                  id.field_b.field_q = 0;
                  bb.field_i = param1[jf.field_tb];
                  break L4;
                } else {
                  return false;
                }
              } else {
                break L4;
              }
            }
            if (!md.a((byte) 124)) {
              return false;
            } else {
              if (sl.field_b == 0) {
                ul.field_j = uc.field_X;
                uc.field_X = md.field_i;
                md.field_i = cb.field_g;
                cb.field_g = jf.field_tb;
                jf.field_tb = -1;
                return true;
              } else {
                L5: {
                  var4 = sl.field_b;
                  if (0.0 == tf.field_i) {
                    break L5;
                  } else {
                    var4 = (int)((double)var4 + id.field_a.nextGaussian() * tf.field_i);
                    if (var4 >= 0) {
                      break L5;
                    } else {
                      var4 = 0;
                      break L5;
                    }
                  }
                }
                var5 = new lc((long)var4 + var2, jf.field_tb, new byte[bb.field_i]);
                var6 = 0;
                L6: while (true) {
                  if (var6 >= bb.field_i) {
                    ba.field_a.a((da) (Object) var5, -111);
                    jf.field_tb = -1;
                    continue L3;
                  } else {
                    var5.field_q[var6] = id.field_b.field_m[var6];
                    var6++;
                    continue L6;
                  }
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
            p.a(-93);
        }
        field_f = null;
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[10][2][2];
        field_a = new int[][]{new int[2], new int[2], new int[2]};
        field_e = new int[][][]{new int[7][], new int[7][], new int[7][]};
        field_c = new String[][]{new String[2], new String[2], new String[2], new String[2]};
        field_d = new String[][]{new String[4], new String[4]};
    }
}
