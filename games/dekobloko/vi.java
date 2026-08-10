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
            String var2 = (String) null;
            vi.a((ji) null, (ji) null, (String) null, (byte) -124, (String) null);
        }
    }

    abstract Object c(int param0);

    abstract boolean g(byte param0);

    vi(int param0) {
        this.field_y = param0;
    }

    final static nj a(ji param0, ji param1, String param2, byte param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        nj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param1.b(-1, param2);
            var7 = -37 % ((param3 - 39) / 44);
            var6 = param1.a(var5_int, 13030, param4);
            stackIn_1_0 = e.a(param0, var5_int, var6, (byte) -75, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("vi.I(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ')');
        }
        return stackIn_1_0;
    }

    final static int d(int param0) {
        if (param0 != 1) {
            field_z = (ck[]) null;
            return 1;
        }
        return 1;
    }

    final static boolean a(int[] param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        bf var4_ref_bf = null;
        int var4 = 0;
        int var5_int = 0;
        bf var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (wf.field_u != ph.field_xb) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_long = ik.a(param1 + 4);
                if (ub.field_a == 0) {
                  break L1;
                } else {
                  if (dl.field_N < 0) {
                    var4_ref_bf = (bf) ((Object) ci.field_h.c((byte) -98));
                    if (var4_ref_bf == null) {
                      break L1;
                    } else {
                      if (var4_ref_bf.field_p >= var2_long) {
                        break L1;
                      } else {
                        var4_ref_bf.b((byte) 112);
                        sm.field_e = var4_ref_bf.field_n.length;
                        de.field_V.field_n = 0;
                        var5_int = 0;
                        L2: while (true) {
                          if (var5_int >= sm.field_e) {
                            lg.field_U = bb.field_d;
                            bb.field_d = kf.field_L;
                            kf.field_L = bh.field_k;
                            bh.field_k = var4_ref_bf.field_s;
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            de.field_V.field_r[var5_int] = var4_ref_bf.field_n[var5_int];
                            var5_int++;
                            continue L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (param1 == 0) {
                  break L3;
                } else {
                  vi.d(-63);
                  break L3;
                }
              }
              L4: while (true) {
                L5: {
                  if (0 > dl.field_N) {
                    de.field_V.field_n = 0;
                    if (!pe.b(param1 + 25973, 1)) {
                      stackIn_22_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      dl.field_N = de.field_V.i((byte) 81);
                      de.field_V.field_n = 0;
                      sm.field_e = param0[dl.field_N];
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (fh.a((byte) 116)) {
                  if (ub.field_a == 0) {
                    lg.field_U = bb.field_d;
                    bb.field_d = kf.field_L;
                    kf.field_L = bh.field_k;
                    bh.field_k = dl.field_N;
                    dl.field_N = -1;
                    stackIn_37_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L6: {
                      var4 = ub.field_a;
                      if (0.0 != pg.field_b) {
                        var4 = (int)((double)var4 + gg.field_A.nextGaussian() * pg.field_b);
                        if (-1 >= (var4 ^ -1)) {
                          break L6;
                        } else {
                          var4 = 0;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var5 = new bf(var2_long + (long)var4, dl.field_N, new byte[sm.field_e]);
                    var6 = 0;
                    L7: while (true) {
                      if (sm.field_e <= var6) {
                        ci.field_h.a(var5, param1 ^ 2777);
                        dl.field_N = -1;
                        continue L4;
                      } else {
                        var5.field_n[var6] = de.field_V.field_r[var6];
                        var6++;
                        continue L7;
                      }
                    }
                  }
                } else {
                  stackIn_26_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var2);

            stackIn_40_1 = new StringBuilder().append("vi.L(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L8;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_22_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                return stackIn_37_0 != 0;
              }
            }
          }
        }
    }

    static {
        field_A = new wl(256);
    }
}
