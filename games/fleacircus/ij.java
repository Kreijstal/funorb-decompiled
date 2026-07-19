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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_14_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_9_0 = 0;
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
            if (super.a(param0 ^ 0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (param1 ^ -1)) {
                stackOut_6_0 = this.b(param2, -28533);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0 == -2) {
                  if (param1 != 99) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackOut_12_0 = this.a(32, param2);
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
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
            stackOut_16_0 = (RuntimeException) (var5);
            stackOut_16_1 = new StringBuilder().append("ij.N(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
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
            IOException var1 = null;
            int var1_int = 0;
            ni var2 = null;
            int stackIn_15_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_37_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_32_0 = 0;
            if ((td.field_k.field_c ^ -1) <= -5) {
              if ((td.field_k.field_b ^ -1) != 0) {
                if ((td.field_k.field_b ^ -1) != 1) {
                  return 1;
                } else {
                  return 4;
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
                        stackOut_14_0 = wb.a(-1, 5);
                        stackIn_15_0 = stackOut_14_0;
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
                      L5: {
                        if (0 >= jj.field_M.e(-110)) {
                          break L5;
                        } else {
                          var1_int = jj.field_M.f(1605772320);
                          if (-1 == (var1_int ^ -1)) {
                            lc.field_r = lc.field_r + 1;
                            if (!fleas.field_A) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            stackOut_24_0 = wb.a(var1_int, 5);
                            stackIn_25_0 = stackOut_24_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                      if ((lj.a((byte) -25) ^ -1L) < (mk.field_e ^ -1L)) {
                        stackOut_29_0 = wb.a(-2, 5);
                        stackIn_30_0 = stackOut_29_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L4;
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
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return -1;
                    }
                  } else {
                    stackOut_32_0 = -52;
                    stackIn_33_0 = stackOut_32_0;
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
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_25_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_30_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_33_0;
                    } else {
                      return stackIn_37_0;
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
            field_J = null;
            return;
        }
        field_J = null;
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        bb stackIn_4_0 = null;
        bb stackIn_4_1 = null;
        bb stackIn_6_0 = null;
        bb stackIn_6_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        bb stackOut_3_0 = null;
        bb stackOut_3_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var6_int >= this.field_K.length) {
                      break L4;
                    } else {
                      stackOut_3_0 = this.field_M[var6_int];
                      stackOut_3_1 = (bb) (param4);
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_6_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var7 != 0) {
                        if (stackIn_6_0 != stackIn_6_1) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (stackIn_4_0 != stackIn_4_1) {
                            break L5;
                          } else {
                            this.field_G.a(this.field_K[var6_int], (byte) -96);
                            break L5;
                          }
                        }
                        var6_int++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param4 != this.field_M[this.field_K.length]) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                this.field_G.a(-92);
                break L2;
              }
              if (param3 == 248) {
                break L0;
              } else {
                ij.e((byte) -83);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var6);
            stackOut_15_1 = new StringBuilder().append("ij.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int discarded$2 = 0;
        fa var5 = null;
        super.b(param0, param1, param2, param3);
        if (param3 == 0) {
          var5 = ug.field_e;
          if (this.field_K != null) {
            discarded$2 = var5.a(lc.field_s, param1 + this.field_y, this.field_z + param0, this.field_u, 20, 16777215, -1, 0, 0, var5.field_H + var5.field_K);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(String[] param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        me var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
                    L3: {
                      if (var3_int <= var4_int) {
                        break L3;
                      } else {
                        this.field_K[var4_int] = al.a((CharSequence) ((Object) param0[var4_int]), (byte) 111).replace(' ', ' ');
                        var4_int++;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 = new me(ug.field_e, 0, 1);
                    this.field_M = new bb[var3_int - -1];
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          this.field_M[var3_int] = new bb(ue.field_b, (kd) (this));
                          var5 = -104 / ((param1 - 15) / 54);
                          this.field_M[var3_int].field_p = (ch) ((Object) var4);
                          this.field_M[var3_int].a(0, 100, (var3_int - -1) * 16 + 20, 15, 80);
                          this.a((qa) (this.field_M[var3_int]), (byte) -112);
                          break L5;
                        } else {
                          this.field_M[var5] = new bb(this.field_K[var5], (kd) (this));
                          this.field_M[var5].field_p = (ch) ((Object) var4);
                          this.field_M[var5].field_m = lh.field_d;
                          this.field_M[var5].a(0, 80, 20 + var5 * 16, 15, 80);
                          this.a((qa) (this.field_M[var5]), (byte) -89);
                          var5++;
                          if (var6 != 0) {
                            break L5;
                          } else {
                            continue L4;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
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
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("ij.BA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
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
