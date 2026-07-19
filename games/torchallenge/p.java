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
        h.field_a = (byte[][]) null;
        ug.field_e = null;
        td.field_m = null;
        lg.field_e = null;
        pg.field_r = null;
        if (param0 != 0) {
            field_c = (String[][]) null;
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
          if ((var8 ^ -1) > -1) {
            var10 = -1;
            break L0;
          } else {
            var10 = 1;
            break L0;
          }
        }
        L1: {
          var8 = var8 * var10;
          if (-1025 > (var8 ^ -1)) {
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
        RuntimeException var2 = null;
        long var2_long = 0L;
        lc var4_ref_lc = null;
        int var4 = 0;
        int var5_int = 0;
        lc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (qc.field_d == aj.field_c) {
              L1: {
                if (param0 == 16) {
                  break L1;
                } else {
                  p.a(72);
                  break L1;
                }
              }
              L2: {
                var2_long = ol.a(256);
                if (-1 == (sl.field_b ^ -1)) {
                  break L2;
                } else {
                  if (jf.field_tb < 0) {
                    var4_ref_lc = (lc) ((Object) ba.field_a.c((byte) -5));
                    if (var4_ref_lc == null) {
                      break L2;
                    } else {
                      if ((var2_long ^ -1L) < (var4_ref_lc.field_l ^ -1L)) {
                        var4_ref_lc.a(true);
                        bb.field_i = var4_ref_lc.field_q.length;
                        id.field_b.field_q = 0;
                        var5_int = 0;
                        L3: while (true) {
                          if (var5_int >= bb.field_i) {
                            ul.field_j = uc.field_X;
                            uc.field_X = md.field_i;
                            md.field_i = cb.field_g;
                            cb.field_g = var4_ref_lc.field_i;
                            stackOut_15_0 = 1;
                            stackIn_16_0 = stackOut_15_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            id.field_b.field_m[var5_int] = var4_ref_lc.field_q[var5_int];
                            var5_int++;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L4: while (true) {
                L5: {
                  if (-1 < (jf.field_tb ^ -1)) {
                    id.field_b.field_q = 0;
                    if (pe.a((byte) 119, 1)) {
                      jf.field_tb = id.field_b.o(11650);
                      id.field_b.field_q = 0;
                      bb.field_i = param1[jf.field_tb];
                      break L5;
                    } else {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L5;
                  }
                }
                if (!md.a((byte) 124)) {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (sl.field_b == 0) {
                    ul.field_j = uc.field_X;
                    uc.field_X = md.field_i;
                    md.field_i = cb.field_g;
                    cb.field_g = jf.field_tb;
                    jf.field_tb = -1;
                    stackOut_35_0 = 1;
                    stackIn_36_0 = stackOut_35_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L6: {
                      var4 = sl.field_b;
                      if (0.0 == tf.field_i) {
                        break L6;
                      } else {
                        var4 = (int)((double)var4 + id.field_a.nextGaussian() * tf.field_i);
                        if (var4 >= 0) {
                          break L6;
                        } else {
                          var4 = 0;
                          break L6;
                        }
                      }
                    }
                    var5 = new lc((long)var4 + var2_long, jf.field_tb, new byte[bb.field_i]);
                    var6 = 0;
                    L7: while (true) {
                      if (var6 >= bb.field_i) {
                        ba.field_a.a(var5, -111);
                        jf.field_tb = -1;
                        continue L4;
                      } else {
                        var5.field_q[var6] = id.field_b.field_m[var6];
                        var6++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var2);
            stackOut_37_1 = new StringBuilder().append("p.A(").append(param0).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L8;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L8;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                return stackIn_36_0 != 0;
              }
            }
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(boolean param0) {
        field_d = (String[][]) null;
        field_a = (int[][]) null;
        if (!param0) {
            p.a(-93);
        }
        field_f = (int[][][]) null;
        field_c = (String[][]) null;
        field_e = (int[][][]) null;
    }

    static {
        field_f = new int[10][2][2];
        field_a = new int[][]{new int[]{0, 119}, new int[]{0, 60}, new int[]{0, 60}};
        field_e = new int[][][]{new int[][]{new int[]{0, 2, 0}, new int[]{2, 0}, new int[]{2, 0}, new int[]{1, 2, 1, 2, 1, 2}, new int[]{2, 0}, new int[]{0}, new int[]{2, 2, 2, 2, 2, 2}}, new int[][]{new int[]{1, 0}, new int[]{1, 0, 1, 0}, new int[]{0, 1, 1, 1, 0, 0}, new int[]{0, 1, 1, 0, 1, 0}, new int[]{0, 1, 1, 0, 0}, new int[]{1, 1, 0, 1, 0}, new int[]{0}}, new int[][]{new int[]{0, 3, 0}, new int[]{0, 3}, new int[]{0, 2, 2, 0}, new int[]{0, 2, 2, 3, 3, 3}, new int[]{0, 2, 2}, new int[]{0}, new int[]{2, 2, 2, 2, 3, 3}}};
        field_c = new String[][]{new String[]{"Aerial attack", " - Hold while in the air."}, new String[]{"Charge attack", "."}, new String[]{"Attack upwards", " - Hold while attacking."}, new String[]{"Attack behind", " - Press while attacking."}};
        field_d = new String[][]{new String[]{"<img=1> / <img=0>", "<img=3> / <img=4> / <img=5>", "<img=7> / <img=6>", "<img=2>"}, new String[]{"<img=7> / <img=6>", "<img=7> / <img=6> + <img=2> +<br><img=1> / <img=0>", "<img=3>", "<img=1> / <img=0>"}};
    }
}
