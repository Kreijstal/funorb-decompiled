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
        int var1 = -26;
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            ((uk) this).field_h = 65;
        }
        return (pb) (Object) new mn();
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        Object stackIn_2_0 = null;
        int stackIn_6_0 = 0;
        f stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        f stackOut_6_0 = null;
        Object stackOut_1_0 = null;
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
            ((uk) this).field_k = ((uk) this).field_k + param3;
            if (!param0) {
              L1: {
                ((uk) this).field_h = ((uk) this).field_h + 1;
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
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (f) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("uk.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    final static void d() {
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
            int[] var8 = null;
            int[] var9 = null;
            Throwable decompiledCaughtException = null;
            var4 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: {
                  if (null != ol.field_z[0]) {
                    break L1;
                  } else {
                    ol.field_z[0] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(ba.field_k.a(7693, "tutorial.ccl", "")), qp.field_g);
                    vp.a(125);
                    break L1;
                  }
                }
                L2: {
                  if (mo.field_l > 0) {
                    if (null != ol.field_z[2]) {
                      break L2;
                    } else {
                      L3: {
                        if (pd.field_f == null) {
                          pd.field_f = w.a(0, 0, 2, 5);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var9 = pd.field_f.field_j;
                      var8 = var9;
                      var7 = var8;
                      var6 = var7;
                      var5 = var6;
                      var1_array = var5;
                      if (var1_array != null) {
                        ol.field_z[1] = b.a(oe.a(-9762, -9762), (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "puzzle1p.ccl", "")), ro.field_r);
                        ol.field_z[2] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "puzzle2p.ccl", "")), pg.field_e);
                        ol.field_z[3] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "puzzle3p.ccl", "")), qg.field_c);
                        ol.field_z[4] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "arcade1p.ccl", "")), kk.field_k);
                        pd.field_f = null;
                        mg.field_g = null;
                        vp.a(105);
                        break L2;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (ol.field_z[1] == null) {
                      ol.field_z[1] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(ba.field_k.a(7693, "puzzle1p.ccl", "")), ro.field_r);
                      vp.a(102);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                ba.field_k = null;
                L4: {
                  if (jc.field_b) {
                    break L4;
                  } else {
                    if (!rc.a(-39)) {
                      L5: {
                        if (null == pc.field_u) {
                          pc.field_u = new pp[5];
                          var1_int = 0;
                          L6: while (true) {
                            if (var1_int >= 5) {
                              break L5;
                            } else {
                              pc.field_u[var1_int] = ea.a(var1_int, 1, (byte) 65, 5);
                              var1_int++;
                              continue L6;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                      var1_int = 1;
                      var2 = 0;
                      L7: while (true) {
                        if (var2 >= 5) {
                          if (var1_int == 0) {
                            break L4;
                          } else {
                            jc.field_b = true;
                            pc.field_u = null;
                            break L4;
                          }
                        } else {
                          L8: {
                            if (pc.field_u[var2] == null) {
                              break L8;
                            } else {
                              if (!pc.field_u[var2].field_h) {
                                break L8;
                              } else {
                                L9: {
                                  if (pc.field_u[var2].field_g[0] > ke.field_b[var2]) {
                                    var3 = pc.field_u[var2].field_g[0] + -ke.field_b[var2];
                                    ka.field_n = ka.field_n - var3;
                                    ei.field_F = ei.field_F - 2 * var3;
                                    sm.field_f = sm.field_f - var3 * 2;
                                    ke.field_b[var2] = pc.field_u[var2].field_g[0];
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                pc.field_u[var2] = null;
                                break L8;
                              }
                            }
                          }
                          L10: {
                            if (pc.field_u[var2] != null) {
                              var1_int = 0;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var2++;
                          continue L7;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L11: {
                  if (gh.field_y) {
                    break L11;
                  } else {
                    if (!rc.a(-63)) {
                      L12: {
                        if (null != eb.field_p) {
                          break L12;
                        } else {
                          eb.field_p = qa.a((byte) 121, 4);
                          break L12;
                        }
                      }
                      if (!eb.field_p.field_k) {
                        break L11;
                      } else {
                        fk.field_s = eb.field_p.field_f;
                        pc.field_y = pc.field_y & ~fk.field_s;
                        gh.field_y = true;
                        fk.field_s = fk.field_s + pc.field_y;
                        eb.field_p = null;
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var1.getMessage());
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw dn.a((Throwable) (Object) var1_ref, "uk.J(" + -9762 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    uk() {
        ((uk) this).field_h = 0;
        ((uk) this).field_k = 0;
    }

    final void a(byte param0) {
        int var2 = -37 % ((param0 - 29) / 42);
        tb.field_d.a(cf.field_d, 100, 48 * (gi.field_m * ((uk) this).field_h), ((uk) this).field_k / ((uk) this).field_h);
        ((uk) this).field_h = 0;
        ((uk) this).field_k = 0;
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
        Object stackIn_7_0 = null;
        jp stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                stackOut_9_0 = sl.field_m;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (jp) (Object) stackIn_7_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("uk.E(").append(46).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
    }
}
