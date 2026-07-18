/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jg extends mf {
    static boolean field_n;
    static bh field_q;
    private boolean field_s;
    static int field_o;
    static int field_m;
    static String field_r;
    private String field_l;
    static int field_k;
    static String field_p;

    final static java.applet.Applet f(int param0) {
        if (null != fl.field_F) {
            return fl.field_F;
        }
        if (param0 != 1) {
            field_m = 77;
        }
        return (java.applet.Applet) (Object) ca.field_c;
    }

    final static void a(byte[] param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        va var16 = null;
        va var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var15 = wizardrun.field_H;
        try {
          L0: {
            var16 = new va(param0);
            var17 = var16;
            var17.field_m = -2 + param0.length;
            wb.field_f = var17.j(-14477);
            ue.field_e = new byte[wb.field_f][];
            mf.field_j = new byte[wb.field_f][];
            tf.field_b = new int[wb.field_f];
            ne.field_h = new int[wb.field_f];
            cg.field_k = new int[wb.field_f];
            v.field_e = new boolean[wb.field_f];
            ph.field_q = new int[wb.field_f];
            var17.field_m = param0.length - (7 + 8 * wb.field_f);
            hk.field_bb = var17.j(-14477);
            eg.field_v = var17.j(-14477);
            var3 = 1 + (255 & var17.f(255));
            var4 = 0;
            L1: while (true) {
              if (wb.field_f <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= wb.field_f) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= wb.field_f) {
                        var4 = 0;
                        L4: while (true) {
                          if (wb.field_f <= var4) {
                            var17.field_m = -(wb.field_f * 8) + (-7 + param0.length + (-(var3 * 3) + 3));
                            ic.field_b = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var3 <= var4) {
                                var17.field_m = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= wb.field_f) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = cg.field_k[var4];
                                      var6 = tf.field_b[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      mf.field_j[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      ue.field_e[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.f(255);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var5 <= var12) {
                                            if ((var11 & 2) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var12 >= var5) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        byte dupTemp$2 = var17.k(0);
                                                        var9[var5 * var13 + var12] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_45_0 = var10;
                                                        stackIn_47_0 = stackOut_45_0;
                                                        stackIn_46_0 = stackOut_45_0;
                                                        if (var14 == -1) {
                                                          stackOut_47_0 = stackIn_47_0;
                                                          stackOut_47_1 = 0;
                                                          stackIn_48_0 = stackOut_47_0;
                                                          stackIn_48_1 = stackOut_47_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_46_0 = stackIn_46_0;
                                                          stackOut_46_1 = 1;
                                                          stackIn_48_0 = stackOut_46_0;
                                                          stackIn_48_1 = stackOut_46_1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_48_0 | stackIn_48_1;
                                                      var13++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var12 + var13 * var5] = var17.k(0);
                                                var13++;
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L13: while (true) {
                                          if (var7 <= var12) {
                                            if ((2 & var11) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var12 >= var7) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var17.k(0);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_30_0 = var10;
                                                    stackIn_32_0 = stackOut_30_0;
                                                    stackIn_31_0 = stackOut_30_0;
                                                    if (var13 == -1) {
                                                      stackOut_32_0 = stackIn_32_0;
                                                      stackOut_32_1 = 0;
                                                      stackIn_33_0 = stackOut_32_0;
                                                      stackIn_33_1 = stackOut_32_1;
                                                      break L15;
                                                    } else {
                                                      stackOut_31_0 = stackIn_31_0;
                                                      stackOut_31_1 = 1;
                                                      stackIn_33_0 = stackOut_31_0;
                                                      stackIn_33_1 = stackOut_31_1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_33_0 | stackIn_33_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.k(0);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    v.field_e[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  ic.field_b[var4] = var17.d((byte) 125);
                                  if (ic.field_b[var4] == 0) {
                                    ic.field_b[var4] = 1;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            tf.field_b[var4] = var17.j(-14477);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        cg.field_k[var4] = var17.j(-14477);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    ne.field_h[var4] = var17.j(-14477);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ph.field_q[var4] = var16.j(-14477);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var2;
            stackOut_52_1 = new StringBuilder().append("jg.H(");
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L17;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L17;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ',' + true + ')');
        }
    }

    final void g(int param0) {
        if (param0 <= 68) {
            ((jg) this).field_l = null;
        }
        ((jg) this).field_l = null;
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wd var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        String stackOut_16_0 = null;
        Object stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5 = (CharSequence) (Object) param0;
            var3 = bl.a(4, var5);
            if (var3 == null) {
              if (param1 == -1) {
                L1: {
                  if (!param0.equals((Object) (Object) ((jg) this).field_l)) {
                    var4 = pl.a(param1, param0);
                    if (var4 != null) {
                      if (null == var4.field_h) {
                        ((jg) this).field_l = param0;
                        ((jg) this).field_s = var4.field_i;
                        break L1;
                      } else {
                        stackOut_11_0 = null;
                        stackIn_12_0 = stackOut_11_0;
                        return (String) (Object) stackIn_12_0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    break L1;
                  }
                }
                if (!((jg) this).field_s) {
                  stackOut_16_0 = uc.field_e;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  return oj.field_d;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (String) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = (String) var3;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("jg.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    jg(og param0) {
        super(param0);
        ((jg) this).field_s = false;
    }

    public static void c() {
        field_p = null;
        field_r = null;
        field_q = null;
    }

    final ok a(int param0, String param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ok stackIn_4_0 = null;
        ok stackIn_10_0 = null;
        ok stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ok stackOut_9_0 = null;
        ok stackOut_14_0 = null;
        ok stackOut_13_0 = null;
        ok stackOut_3_0 = null;
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
              if (param0 == -1) {
                break L1;
              } else {
                field_k = -25;
                break L1;
              }
            }
            var4 = (CharSequence) (Object) param1;
            int discarded$5 = 120;
            if (ad.a(var4)) {
              L2: {
                if (param1.equals((Object) (Object) ((jg) this).field_l)) {
                  break L2;
                } else {
                  L3: {
                    var3 = pl.a(param0, param1);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null == var3.field_h) {
                        ((jg) this).field_l = param1;
                        ((jg) this).field_s = var3.field_i;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_9_0 = l.field_S;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
              L4: {
                if (((jg) this).field_s) {
                  stackOut_14_0 = gf.field_V;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = hg.field_c;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_3_0 = hg.field_c;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("jg.C(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new bh(8, 0, 4, 1);
        field_r = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_p = "EXCLUSIVE";
    }
}
