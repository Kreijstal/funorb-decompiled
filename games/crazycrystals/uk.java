/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class uk extends nf {
    private int field_h;
    private int field_k;
    static ko field_i;
    static boolean field_j;

    public static void c(int param0) {
        field_i = null;
        int var1 = -52 / ((param0 - -61) / 60);
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            this.field_h = 65;
        }
        return (pb) ((Object) new mn());
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        f stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        f stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        f stackOut_6_0 = null;
        f stackOut_1_0 = null;
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
            this.field_k = this.field_k + param3;
            if (!param0) {
              L1: {
                this.field_h = this.field_h + 1;
                if (!q.field_a[ma.field_n[param1]].a((byte) 107, param2)) {
                  stackOut_5_0 = 25;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 50;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              ph.a(stackIn_6_0, (byte) 107, param1, param4);
              stackOut_6_0 = bm.field_g;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (f) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var6);
            stackOut_8_1 = new StringBuilder().append("uk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void d(int param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            int[] var1_array = null;
            int var1_int = 0;
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int[] var5 = null;
            int[] var6 = null;
            int[] var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var4 = CrazyCrystals.field_B;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0 == -9762) {
                        break L2;
                      } else {
                        uk.c(-48);
                        break L2;
                      }
                    }
                    L3: {
                      if (null != ol.field_z[0]) {
                        break L3;
                      } else {
                        ol.field_z[0] = b.a(0, (InputStream) ((Object) new ByteArrayInputStream(ba.field_k.a(7693, "tutorial.ccl", ""))), qp.field_g);
                        vp.a(125);
                        break L3;
                      }
                    }
                    L4: {
                      if ((mo.field_l ^ -1) < -1) {
                        if (null != ol.field_z[2]) {
                          break L4;
                        } else {
                          L5: {
                            if (pd.field_f == null) {
                              pd.field_f = w.a(param0 + 9762, 0, 2, 5);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var7 = pd.field_f.field_j;
                          var6 = var7;
                          var5 = var6;
                          var1_array = var5;
                          if (var1_array != null) {
                            ol.field_z[1] = b.a(oe.a(param0, -9762), (InputStream) ((Object) new ByteArrayInputStream(mg.field_g.a(false, var7, "puzzle1p.ccl", ""))), ro.field_r);
                            ol.field_z[2] = b.a(0, (InputStream) ((Object) new ByteArrayInputStream(mg.field_g.a(false, var7, "puzzle2p.ccl", ""))), pg.field_e);
                            ol.field_z[3] = b.a(param0 + 9762, (InputStream) ((Object) new ByteArrayInputStream(mg.field_g.a(false, var7, "puzzle3p.ccl", ""))), qg.field_c);
                            ol.field_z[4] = b.a(0, (InputStream) ((Object) new ByteArrayInputStream(mg.field_g.a(false, var7, "arcade1p.ccl", ""))), kk.field_k);
                            pd.field_f = null;
                            mg.field_g = null;
                            vp.a(105);
                            break L4;
                          } else {
                            decompiledRegionSelector0 = 0;
                            break L1;
                          }
                        }
                      } else {
                        if (ol.field_z[1] == null) {
                          ol.field_z[1] = b.a(0, (InputStream) ((Object) new ByteArrayInputStream(ba.field_k.a(7693, "puzzle1p.ccl", ""))), ro.field_r);
                          vp.a(param0 ^ -9800);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ba.field_k = null;
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var1 = (IOException) (Object) decompiledCaughtException;
                  throw new RuntimeException(var1.getMessage());
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  L6: {
                    if (jc.field_b) {
                      break L6;
                    } else {
                      if (!rc.a(-39)) {
                        L7: {
                          if (null == pc.field_u) {
                            pc.field_u = new pp[5];
                            var1_int = 0;
                            L8: while (true) {
                              if (var1_int >= 5) {
                                break L7;
                              } else {
                                pc.field_u[var1_int] = ea.a(var1_int, 1, (byte) 65, 5);
                                var1_int++;
                                continue L8;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                        var1_int = 1;
                        var2 = 0;
                        L9: while (true) {
                          if ((var2 ^ -1) <= -6) {
                            if (var1_int == 0) {
                              break L6;
                            } else {
                              jc.field_b = true;
                              pc.field_u = null;
                              break L6;
                            }
                          } else {
                            L10: {
                              if (pc.field_u[var2] == null) {
                                break L10;
                              } else {
                                if (!pc.field_u[var2].field_h) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (pc.field_u[var2].field_g[0] > ke.field_b[var2]) {
                                      var3 = pc.field_u[var2].field_g[0] + -ke.field_b[var2];
                                      ka.field_n = ka.field_n - var3;
                                      ei.field_F = ei.field_F - 2 * var3;
                                      sm.field_f = sm.field_f - var3 * 2;
                                      ke.field_b[var2] = pc.field_u[var2].field_g[0];
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  pc.field_u[var2] = null;
                                  break L10;
                                }
                              }
                            }
                            L12: {
                              if (pc.field_u[var2] != null) {
                                var1_int = 0;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var2++;
                            continue L9;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  L13: {
                    if (gh.field_y) {
                      break L13;
                    } else {
                      if (!rc.a(-63)) {
                        L14: {
                          if (null != eb.field_p) {
                            break L14;
                          } else {
                            eb.field_p = qa.a((byte) 121, 4);
                            break L14;
                          }
                        }
                        if (!eb.field_p.field_k) {
                          break L13;
                        } else {
                          fk.field_s = eb.field_p.field_f;
                          pc.field_y = pc.field_y & (fk.field_s ^ -1);
                          gh.field_y = true;
                          fk.field_s = fk.field_s + pc.field_y;
                          eb.field_p = null;
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw dn.a((Throwable) ((Object) var1_ref), "uk.J(" + param0 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    uk() {
        this.field_h = 0;
        this.field_k = 0;
    }

    final void a(byte param0) {
        int var2 = -37 % ((param0 - 29) / 42);
        tb.field_d.a(cf.field_d, 100, 48 * (gi.field_m * this.field_h), this.field_k / this.field_h);
        this.field_h = 0;
        this.field_k = 0;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var6 = CrazyCrystals.field_B;
        param2 = param2 + param3;
        if (!param0) {
            field_j = false;
        }
        while (param2 > param3) {
            pd.field_g[param1] = pd.field_g[param1] + (q.field_a[ma.field_n[param1]].a((byte) 92, param3) ? 50 : 25);
            param3++;
        }
    }

    final static jp a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        jp stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_11_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 >= 43) {
                break L1;
              } else {
                uk.d(38);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= var2_int) {
                stackOut_11_0 = sl.field_m;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L2;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("uk.E(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jp) ((Object) stackIn_9_0);
        } else {
          return stackIn_12_0;
        }
    }

    static {
        field_j = false;
    }
}
