/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class f extends ji {
    private int field_G;
    private int field_z;
    static ve field_H;
    static int field_y;
    static long field_F;
    static int field_B;
    static String[] field_I;
    static String field_J;
    static String field_D;

    final static void a(long param0, int param1, int param2, jj param3, int param4, int param5, int param6, int param7, boolean param8, int param9, boolean param10, String param11, int param12, int param13) {
        try {
            int discarded$1 = 0;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            try {
              L0: {
                L1: {
                  id.field_f = new mi(param12);
                  uh.field_Wb = new mi(param2);
                  kr.field_g = param3;
                  cl.field_d = param6;
                  if (!param8) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                L2: {
                  pl.field_i = stackIn_3_0 != 0;
                  if (!param10) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  lm.field_G = stackIn_6_0 != 0;
                  if (param13 == 6) {
                    break L3;
                  } else {
                    discarded$1 = f.b(true);
                    break L3;
                  }
                }
                L4: {
                  nb.field_y = param11;
                  nj.field_e = param4;
                  ng.field_c = param1;
                  bl.field_C = param9;
                  ne.field_P = param5;
                  kj.field_B = param7;
                  ff.field_d = param0;
                  if (null != kr.field_g.field_k) {
                    try {
                      L5: {
                        as.field_d = new im(kr.field_g.field_k, 64, 0);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) (var15_ref);
                stackOut_14_1 = new StringBuilder().append("f.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param3 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              L7: {
                stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param11 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L7;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L7;
                }
              }
              throw wn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public f() {
        super(1, true);
        this.field_z = 0;
        this.field_G = 4096;
    }

    public static void b(byte param0) {
        int var1 = 14 % ((param0 - 5) / 51);
        field_D = null;
        field_J = null;
        field_I = null;
        field_H = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, boolean param7) {
        RuntimeException var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param2 > 107) {
                break L1;
              } else {
                field_F = -27L;
                break L1;
              }
            }
            L2: {
              if (-1 != (bp.field_C.field_tb ^ -1)) {
                if (pe.field_r) {
                  break L2;
                } else {
                  if (hj.field_b) {
                    g.a((byte) -10);
                    break L2;
                  } else {
                    il.field_a = true;
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (il.field_a) {
                ca.a(param1, param4, param6, param4, 20, param0, param5, 126, param3);
                gk.field_c.a(0, param7);
                if (!param7) {
                  break L3;
                } else {
                  L4: {
                    if (0 == kk.field_a.field_tb) {
                      break L4;
                    } else {
                      il.field_a = false;
                      break L4;
                    }
                  }
                  if (-1 == (oa.field_s.field_tb ^ -1)) {
                    break L3;
                  } else {
                    fb.h(0);
                    il.field_a = false;
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var8);
            stackOut_16_1 = new StringBuilder().append("f.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param5 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static int b(boolean param0) {
        int discarded$0 = 0;
        if (param0) {
            discarded$0 = f.g(-57);
            return sf.field_d;
        }
        return sf.field_d;
    }

    final static int g(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ed var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_35_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_34_0 = 0;
            if (4 <= kb.field_e.field_m) {
              if (kb.field_e.field_j != -1) {
                if (1 == (kb.field_e.field_j ^ -1)) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (param0 == al.field_t) {
                      pq.field_f = or.field_f.a(param0 + -108, rf.field_l, lm.field_H);
                      al.field_t = al.field_t + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (1 != al.field_t) {
                      break L2;
                    } else {
                      if ((pq.field_f.field_b ^ -1) == -3) {
                        stackOut_13_0 = pl.a((byte) 11, -1);
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (-2 == (pq.field_f.field_b ^ -1)) {
                          al.field_t = al.field_t + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (-3 == (al.field_t ^ -1)) {
                      fn.field_y = new pm((java.net.Socket) (pq.field_f.field_d), or.field_f);
                      var2 = new ed(13);
                      jo.a(var2, od.field_Kb, qi.field_a, 124, il.field_h);
                      var2.f(15, param0 + -85);
                      var2.e(rf.field_q, 0);
                      fn.field_y.a(0, 13, 127, var2.field_p);
                      al.field_t = al.field_t + 1;
                      pq.field_e = 30000L + gk.a(param0 + 60);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (-4 == (al.field_t ^ -1)) {
                      if (fn.field_y.a(15166) > 0) {
                        var1_int = fn.field_y.a((byte) -113);
                        if (0 != var1_int) {
                          stackOut_29_0 = pl.a((byte) 11, var1_int);
                          stackIn_30_0 = stackOut_29_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          al.field_t = al.field_t + 1;
                          break L4;
                        }
                      } else {
                        if (pq.field_e >= gk.a(param0 + 75)) {
                          break L4;
                        } else {
                          stackOut_25_0 = pl.a((byte) 11, -2);
                          stackIn_26_0 = stackOut_25_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (-5 == (al.field_t ^ -1)) {
                    kb.field_e.a(fn.field_y, ni.field_f, -128);
                    pq.field_f = null;
                    fn.field_y = null;
                    al.field_t = 0;
                    stackOut_34_0 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return pl.a((byte) 11, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_26_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_30_0;
                  } else {
                    return stackIn_35_0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            incrementValue$4 = param3;
            param3++;
            ki.a(-118, param1, vl.field_e[incrementValue$4], param0, param2);
            incrementValue$5 = param5;
            param5--;
            ki.a(param4 + -84, param1, vl.field_e[incrementValue$5], param0, param2);
            if (param4 == -8) {
              var6_int = param3;
              L1: while (true) {
                if (var6_int > param5) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = vl.field_e[var6_int];
                  var7[param0] = param2;
                  var7[param1] = param2;
                  var6_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var6), "f.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void c(byte param0) {
        boolean discarded$15 = false;
        boolean discarded$16 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!gf.a((byte) -105)) {
              L1: {
                if (null == dc.field_L) {
                  break L1;
                } else {
                  if (dc.field_L.field_e) {
                    cp.a((byte) 127);
                    qb.field_d.b(new gr(qb.field_d, sd.field_I), 0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == -6) {
                  break L2;
                } else {
                  field_I = (String[]) null;
                  break L2;
                }
              }
              discarded$15 = qb.field_d.a(qg.field_I, true, (byte) 115, oj.field_N);
              qb.field_d.l(0);
              L3: while (true) {
                if (!gf.a(false)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$16 = qb.field_d.a(-122, de.field_f, ji.field_r);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "f.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ed var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (var4_int == 0) {
                this.field_z = param2.a((byte) -11);
                break L1;
              } else {
                if (var4_int == 1) {
                  this.field_G = param2.a((byte) -11);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                var5 = (ed) null;
                this.a((byte) -51, 30, (ed) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("f.C(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var11 = null;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param1 > 91) {
          var8 = this.field_x.a(param0, (byte) -46);
          var3 = var8;
          if (this.field_x.field_i) {
            var11 = this.a(0, -1, param0);
            var5 = 0;
            L0: while (true) {
              if (we.field_M > var5) {
                L1: {
                  L2: {
                    var6 = var11[var5];
                    stackOut_19_0 = (int[]) (var8);
                    stackOut_19_1 = var5;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_22_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (this.field_z > var6) {
                      break L2;
                    } else {
                      stackOut_20_0 = (int[]) ((Object) stackIn_20_0);
                      stackOut_20_1 = stackIn_20_1;
                      stackIn_23_0 = stackOut_20_0;
                      stackIn_23_1 = stackOut_20_1;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      if (this.field_G >= var6) {
                        stackOut_23_0 = (int[]) ((Object) stackIn_23_0);
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = 4096;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        break L1;
                      } else {
                        stackOut_21_0 = (int[]) ((Object) stackIn_21_0);
                        stackOut_21_1 = stackIn_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        break L2;
                      }
                    }
                  }
                  stackOut_22_0 = (int[]) ((Object) stackIn_22_0);
                  stackOut_22_1 = stackIn_22_1;
                  stackOut_22_2 = 0;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  break L1;
                }
                stackIn_24_0[stackIn_24_1] = stackIn_24_2;
                var5++;
                continue L0;
              } else {
                return var8;
              }
            }
          } else {
            return var8;
          }
        } else {
          field_B = -52;
          var8 = this.field_x.a(param0, (byte) -46);
          var3 = var8;
          if (this.field_x.field_i) {
            var9 = this.a(0, -1, param0);
            var4 = var9;
            var5 = 0;
            L3: while (true) {
              if (we.field_M > var5) {
                L4: {
                  L5: {
                    var9 = var4;
                    var6 = var9[var5];
                    stackOut_8_0 = (int[]) (var8);
                    stackOut_8_1 = var5;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_11_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (this.field_z > var6) {
                      break L5;
                    } else {
                      stackOut_9_0 = (int[]) ((Object) stackIn_9_0);
                      stackOut_9_1 = stackIn_9_1;
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_12_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (this.field_G >= var6) {
                        stackOut_12_0 = (int[]) ((Object) stackIn_12_0);
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = 4096;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L4;
                      } else {
                        stackOut_10_0 = (int[]) ((Object) stackIn_10_0);
                        stackOut_10_1 = stackIn_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L5;
                      }
                    }
                  }
                  stackOut_11_0 = (int[]) ((Object) stackIn_11_0);
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = 0;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L4;
                }
                stackIn_13_0[stackIn_13_1] = stackIn_13_2;
                var5++;
                continue L3;
              } else {
                return var8;
              }
            }
          } else {
            return var8;
          }
        }
    }

    static {
        field_H = new ve(6, 0, 4, 2);
        field_I = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_D = "Rating";
        field_J = "Remove <%0> from ignore list";
    }
}
