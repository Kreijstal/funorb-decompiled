/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jo extends qk {
    static int field_Qb;
    static char[] field_Nb;
    private int field_Rb;
    private boolean field_Sb;
    static vf field_Ob;
    private int field_Pb;
    static vn[][] field_Tb;

    final void l(byte param0) {
        int var2 = 0;
        kk var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qh var10 = null;
        L0: {
          var9 = ZombieDawn.field_J;
          if (((jo) this).field_F == 23) {
            ((jo) this).field_F = 0;
            break L0;
          } else {
            break L0;
          }
        }
        super.l(param0);
        if (((jo) this).field_Ab >= 0) {
          if (0 == ((jo) this).field_F) {
            L1: {
              if (((jo) this).field_Sb) {
                ((jo) this).field_F = 23;
                if (-1 == ((jo) this).field_Rb) {
                  break L1;
                } else {
                  var10 = dj.field_e.field_H.a(true, ((jo) this).a(true), ((jo) this).field_Pb, ((jo) this).field_Rb, ((jo) this).f(237239984));
                  if (var10 == null) {
                    break L1;
                  } else {
                    var3 = (kk) (Object) var10.b((byte) 26);
                    ((jo) this).field_Pb = var3.field_h;
                    ((jo) this).field_Rb = var3.field_l;
                    break L1;
                  }
                }
              } else {
                if (((jo) this).field_Rb == -1) {
                  L2: {
                    var2 = ((jo) this).l(param0 + -178) & 127;
                    if (var2 < 60) {
                      break L2;
                    } else {
                      var3_int = var2 - 60;
                      var4 = ((jo) this).a(true);
                      var5 = ((jo) this).f(237239984);
                      var6 = 0;
                      var7 = 0;
                      var8 = var3_int;
                      if (var8 != 0) {
                        if (var8 != 2) {
                          if (var8 == 1) {
                            var6 = 24;
                            L3: while (true) {
                              var4 = var4 + var6;
                              var5 = var5 + var7;
                              if (((jo) this).b(0, var4, var5) < 60) {
                                continue L3;
                              } else {
                                ((jo) this).field_Pb = var5;
                                ((jo) this).field_Rb = var4;
                                ((jo) this).e(23, -6904);
                                return;
                              }
                            }
                          } else {
                            if (var8 == 3) {
                              var6 = -24;
                              L4: while (true) {
                                var4 = var4 + var6;
                                var5 = var5 + var7;
                                if (((jo) this).b(0, var4, var5) < 60) {
                                  continue L4;
                                } else {
                                  ((jo) this).field_Pb = var5;
                                  ((jo) this).field_Rb = var4;
                                  ((jo) this).e(23, -6904);
                                  break L2;
                                }
                              }
                            } else {
                              L5: while (true) {
                                var4 = var4 + var6;
                                var5 = var5 + var7;
                                if (((jo) this).b(0, var4, var5) < 60) {
                                  continue L5;
                                } else {
                                  ((jo) this).field_Pb = var5;
                                  ((jo) this).field_Rb = var4;
                                  ((jo) this).e(23, -6904);
                                  return;
                                }
                              }
                            }
                          }
                        } else {
                          var7 = 24;
                          L6: while (true) {
                            var4 = var4 + var6;
                            var5 = var5 + var7;
                            if (((jo) this).b(0, var4, var5) < 60) {
                              continue L6;
                            } else {
                              ((jo) this).field_Pb = var5;
                              ((jo) this).field_Rb = var4;
                              ((jo) this).e(23, -6904);
                              return;
                            }
                          }
                        }
                      } else {
                        var7 = -24;
                        L7: while (true) {
                          var4 = var4 + var6;
                          var5 = var5 + var7;
                          if (((jo) this).b(0, var4, var5) < 60) {
                            continue L7;
                          } else {
                            ((jo) this).field_Pb = var5;
                            ((jo) this).field_Rb = var4;
                            ((jo) this).e(23, -6904);
                            return;
                          }
                        }
                      }
                    }
                  }
                  break L1;
                } else {
                  ((jo) this).e(23, -6904);
                  return;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void x() {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == ng.field_b) {
          return;
        } else {
          var1 = (Object) (Object) ng.field_b;
          synchronized (var1) {
            L0: {
              ng.field_b = null;
              break L0;
            }
          }
          return;
        }
    }

    public static void o(byte param0) {
        field_Nb = null;
        if (param0 > -59) {
          jo.o((byte) -101);
          field_Tb = null;
          field_Ob = null;
          return;
        } else {
          field_Tb = null;
          field_Ob = null;
          return;
        }
    }

    jo(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((jo) this).field_Rb = -1;
        ((jo) this).field_Pb = -1;
        ((jo) this).field_pb = ((jo) this).field_Eb;
    }

    final void g(int param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((jo) this).field_F != 23) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((jo) this).field_Sb = stackIn_3_1 != 0;
          if (((jo) this).field_Sb) {
            ((jo) this).field_X = ((jo) this).field_Pb;
            ((jo) this).field_Y = ((jo) this).field_Rb;
            ((jo) this).c(0, ((jo) this).field_D / 2);
            break L1;
          } else {
            break L1;
          }
        }
        super.g(106);
        if (!((jo) this).field_Sb) {
          if (param0 <= 95) {
            jo.o((byte) -102);
            return;
          } else {
            return;
          }
        } else {
          if (1 != ((jo) this).field_F) {
            if (0 != ((jo) this).field_F) {
              if (param0 <= 95) {
                jo.o((byte) -102);
                return;
              } else {
                return;
              }
            } else {
              if (((jo) this).a(true) != ((jo) this).field_Rb) {
                ((jo) this).field_F = 23;
                if (param0 <= 95) {
                  jo.o((byte) -102);
                  return;
                } else {
                  return;
                }
              } else {
                if (((jo) this).f(237239984) == ((jo) this).field_Pb) {
                  ((jo) this).field_Pb = -1;
                  ((jo) this).field_Rb = -1;
                  ((jo) this).field_Sb = false;
                  ((jo) this).e(0, -6904);
                  ((jo) this).l((byte) 52);
                  if (param0 <= 95) {
                    jo.o((byte) -102);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((jo) this).field_F = 23;
                  if (param0 <= 95) {
                    jo.o((byte) -102);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            if (((jo) this).a(true) != ((jo) this).field_Rb) {
              ((jo) this).field_F = 23;
              if (param0 > 95) {
                return;
              } else {
                jo.o((byte) -102);
                return;
              }
            } else {
              if (((jo) this).f(237239984) == ((jo) this).field_Pb) {
                ((jo) this).field_Pb = -1;
                ((jo) this).field_Rb = -1;
                ((jo) this).field_Sb = false;
                ((jo) this).e(0, -6904);
                ((jo) this).l((byte) 52);
                if (param0 <= 95) {
                  jo.o((byte) -102);
                  return;
                } else {
                  return;
                }
              } else {
                ((jo) this).field_F = 23;
                if (param0 > 95) {
                  return;
                } else {
                  jo.o((byte) -102);
                  return;
                }
              }
            }
          }
        }
    }

    final static int w() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            de var2_ref_de = null;
            int var2 = 0;
            int stackIn_13_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_31_0 = 0;
            if (tf.field_c.field_h < 4) {
              try {
                L0: {
                  L1: {
                    var1_int = -73;
                    if (jd.field_a == 0) {
                      hi.field_O = lc.field_a.a(2, gd.field_u, bd.field_j);
                      jd.field_a = jd.field_a + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (jd.field_a != 1) {
                      break L2;
                    } else {
                      if (hi.field_O.field_f == 2) {
                        stackOut_12_0 = k.a(-1, 50);
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      } else {
                        if (hi.field_O.field_f == 1) {
                          jd.field_a = jd.field_a + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (jd.field_a != 2) {
                      break L3;
                    } else {
                      sb.field_a = new gm((java.net.Socket) hi.field_O.field_d, lc.field_a);
                      var2_ref_de = new de(13);
                      uj.a(ha.field_a, uj.field_d, (byte) -114, var2_ref_de, nd.field_a);
                      var2_ref_de.i(15, -101);
                      var2_ref_de.h(-116, wh.field_b);
                      sb.field_a.a(13, true, 0, var2_ref_de.field_h);
                      jd.field_a = jd.field_a + 1;
                      ul.field_e = 30000L + pd.a(-22826);
                      break L3;
                    }
                  }
                  L4: {
                    if (jd.field_a != 3) {
                      break L4;
                    } else {
                      if (sb.field_a.b((byte) -80) <= 0) {
                        if (~pd.a(-22826) < ~ul.field_e) {
                          stackOut_28_0 = k.a(-2, 50);
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        } else {
                          break L4;
                        }
                      } else {
                        var2 = sb.field_a.a(false);
                        if (var2 != 0) {
                          stackOut_23_0 = k.a(var2, 50);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          jd.field_a = jd.field_a + 1;
                          break L4;
                        }
                      }
                    }
                  }
                  if (4 != jd.field_a) {
                    stackOut_33_0 = -1;
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    tf.field_c.a(bo.field_n, (Object) (Object) sb.field_a, 120);
                    sb.field_a = null;
                    jd.field_a = 0;
                    hi.field_O = null;
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    return stackIn_32_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return k.a(-3, 50);
              }
              return stackIn_34_0;
            } else {
              if (tf.field_c.field_e != -1) {
                if (tf.field_c.field_e != -2) {
                  return 1;
                } else {
                  return 4;
                }
              } else {
                return 3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(wk param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            if (param1 == 5060) {
              L1: {
                var3_int = param0.a(((jo) this).a(true), (byte) -107);
                var4 = param0.a(((jo) this).f(237239984), 0);
                bi.d(var3_int, var4, ((jo) this).field_Eb, 65535);
                if (((jo) this).field_Rb == -1) {
                  break L1;
                } else {
                  bi.e(var3_int, var4, param0.a(((jo) this).field_Rb, (byte) -74), param0.a(((jo) this).field_Pb, 0), 16711680);
                  break L1;
                }
              }
              L2: {
                if (((jo) this).field_yb != null) {
                  var5_int = param0.a(((jo) this).field_yb.a(true), (byte) -59);
                  var6 = param0.a(((jo) this).field_yb.f(237239984), 0);
                  bi.e(var3_int, 10 + var4 - 48, var5_int, -48 + (var6 - -10), 16776960);
                  bj.field_q.c(Integer.toString(((jo) this).field_yb.field_F), var5_int, -48 + var6, 16777215, 0);
                  break L2;
                } else {
                  break L2;
                }
              }
              var5 = Integer.toString(((jo) this).field_F);
              var5 = Integer.toString(((jo) this).l(-111) & 127);
              var10 = 0;
              var6 = var10;
              L3: while (true) {
                if (((jo) this).field_ub <= var10) {
                  bi.g(var3_int, var4, 3, 16776960);
                  bj.field_q.c(var5, var3_int, -48 + var4, 16777215, 0);
                  break L0;
                } else {
                  var7 = param0.a(((jo) this).field_jb[var10], (byte) -62);
                  var8 = param0.a(((jo) this).field_gb[var10], 0);
                  bi.b(-1 + var7, var8 - 1, 3, 3, 0);
                  bi.a(var7, var8, 65280);
                  var10++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("jo.L(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = 5;
        field_Nb = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_Tb = new vn[2][];
    }
}
