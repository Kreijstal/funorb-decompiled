/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ij extends gj implements da {
    static int[] field_H;
    private String[] field_K;
    static String[] field_J;
    static int field_I;
    static int field_L;
    private bb[] field_M;
    static si[] field_F;
    private pe field_G;

    final boolean a(int param0, int param1, qa param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0 ^ 0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (param1 ^ -1)) {
                stackIn_7_0 = this.b(param2, -28533);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 == -2) {
                  if (param1 != 99) {
                    stackIn_15_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_13_0 = this.a(32, param2);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("ij.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L1;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                return stackIn_15_0 != 0;
              }
            }
          }
        }
    }

    ij(pe param0) {
        super(0, 0, 0, 0, (ch) null);
        try {
            this.field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        try {
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_36_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            ni var2 = null;
            if ((td.field_k.field_c ^ -1) <= -5) {
              if ((td.field_k.field_b ^ -1) != 0) {
                if ((td.field_k.field_b ^ -1) == 1) {
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
                    if (lc.field_r == 0) {
                      nj.field_a = mh.field_x.a(il.field_g, (byte) 32, fh.field_g);
                      lc.field_r = lc.field_r + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 != (lc.field_r ^ -1)) {
                      break L2;
                    } else {
                      if (2 == nj.field_a.field_b) {
                        stackIn_14_0 = wb.a(-1, 5);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if ((nj.field_a.field_b ^ -1) != -2) {
                          break L2;
                        } else {
                          lc.field_r = lc.field_r + 1;
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if ((lc.field_r ^ -1) != -3) {
                      break L3;
                    } else {
                      jj.field_M = new td((java.net.Socket) (nj.field_a.field_e), mh.field_x);
                      var2 = new ni(13);
                      ob.a(wj.field_d, of.field_b, (byte) -19, b.field_a, var2);
                      var2.a(-11, 15);
                      var2.a(tj.field_c, (byte) -28);
                      jj.field_M.a((byte) -92, 13, 0, var2.field_k);
                      lc.field_r = lc.field_r + 1;
                      mk.field_e = 30000L + lj.a((byte) -80);
                      break L3;
                    }
                  }
                  L4: {
                    if (3 == lc.field_r) {
                      if (0 >= jj.field_M.e(-110)) {
                        if ((lj.a((byte) -25) ^ -1L) < (mk.field_e ^ -1L)) {
                          stackIn_29_0 = wb.a(-2, 5);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L4;
                        }
                      } else {
                        var1_int = jj.field_M.f(1605772320);
                        if (-1 == (var1_int ^ -1)) {
                          lc.field_r = lc.field_r + 1;
                          break L4;
                        } else {
                          stackIn_24_0 = wb.a(var1_int, 5);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (param0 > 94) {
                    if (-5 == (lc.field_r ^ -1)) {
                      td.field_k.a(jj.field_M, md.field_S, (byte) 105);
                      lc.field_r = 0;
                      jj.field_M = null;
                      nj.field_a = null;
                      stackIn_36_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return -1;
                    }
                  } else {
                    stackIn_32_0 = -52;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return wb.a(-3, 5);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_24_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_29_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_32_0;
                    } else {
                      return stackIn_36_0;
                    }
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

    final static void a(int param0, String param1, String param2) {
        try {
            if (param0 != -1) {
                ij.e((byte) 47);
            }
            if (ok.field_x != null) {
                ok.field_x.n(-22645);
            }
            lg.field_b = new ul(param1, param2, false, true, true);
            ak.field_a.d(lg.field_b, 26034);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ij.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_H = null;
        field_F = null;
        if (param0 != -20) {
            ij.e((byte) -66);
        }
        field_J = null;
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= this.field_K.length) {
                L2: {
                  if (param4 != this.field_M[this.field_K.length]) {
                    break L2;
                  } else {
                    this.field_G.a(-92);
                    break L2;
                  }
                }
                L3: {
                  if (param3 == 248) {
                    break L3;
                  } else {
                    ij.e((byte) -83);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (this.field_M[var6_int] != param4) {
                    break L4;
                  } else {
                    this.field_G.a(this.field_K[var6_int], (byte) -96);
                    break L4;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ij.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        super.b(param0, param1, param2, param3);
        if (param3 != 0) {
            return;
        }
        fa var5 = ug.field_e;
        if (this.field_K != null) {
            var5.a(lc.field_s, param1 + this.field_y, this.field_z + param0, this.field_u, 20, 16777215, -1, 0, 0, var5.field_H + var5.field_K);
        }
    }

    final void a(String[] param0, int param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        me var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_C.f(1);
              if (param0 == null) {
                break L1;
              } else {
                if (-1 != (param0.length ^ -1)) {
                  var3_int = param0.length;
                  this.field_K = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new me(ug.field_e, 0, 1);
                      this.field_M = new bb[var3_int - -1];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var3_int) {
                          this.field_M[var3_int] = new bb(ue.field_b, (kd) (this));
                          var5 = -104 / ((param1 - 15) / 54);
                          this.field_M[var3_int].field_p = (ch) ((Object) var4);
                          this.field_M[var3_int].a(0, 100, (var3_int - -1) * 16 + 20, 15, 80);
                          this.a((qa) (this.field_M[var3_int]), (byte) -112);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_M[var5] = new bb(this.field_K[var5], (kd) (this));
                          this.field_M[var5].field_p = (ch) ((Object) var4);
                          this.field_M[var5].field_m = lh.field_d;
                          this.field_M[var5].a(0, 80, 20 + var5 * 16, 15, 80);
                          this.a((qa) (this.field_M[var5]), (byte) -89);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      this.field_K[var4_int] = al.a((CharSequence) ((Object) param0[var4_int]), (byte) 111).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            this.field_K = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ij.BA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_L = 10;
        field_J = new String[]{"Complete first five levels of either set", "Complete first ten levels of either set", "Complete first twenty levels of either set", "Complete all levels of both sets", "Destroy the golden walls on level 'Golden Fleas'", "Save all fleas on level 1 of the Classic set", "Save all fleas on level 2 of the Classic set", "Save all fleas on level 3 of the Classic set", "Save all fleas on level 4 of the Classic set", "Save all fleas on level 5 of the Classic set", "Complete level 12 of the New set without any fleas drowning", "Get all fleas in the air at the same time on any level", "Complete the first five levels (of either set) without restarting", "Complete the first ten levels (of either set) without restarting", "Complete the first twenty levels (of either set) without restarting", "Complete all levels (of either set) without restarting"};
    }
}
