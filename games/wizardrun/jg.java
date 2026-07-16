/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.Applet;
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
        RuntimeException var1 = null;
        java.applet.Applet stackIn_2_0 = null;
        da stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        da stackOut_6_0 = null;
        java.applet.Applet stackOut_1_0 = null;
        try {
          L0: {
            if (null == fl.field_F) {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  field_m = 77;
                  break L1;
                }
              }
              stackOut_6_0 = ca.field_c;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = fl.field_F;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "jg.J(" + param0 + 41);
        }
        return (java.applet.Applet) (Object) stackIn_7_0;
    }

    final static void a(byte[] param0, boolean param1) {
        RuntimeException var2 = null;
        va var2_ref = null;
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
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_69_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var15 = wizardrun.field_H;
        try {
          L0: {
            var2_ref = new va(param0);
            var2_ref.field_m = -2 + param0.length;
            wb.field_f = var2_ref.j(-14477);
            if (param1) {
              ue.field_e = new byte[wb.field_f][];
              mf.field_j = new byte[wb.field_f][];
              tf.field_b = new int[wb.field_f];
              ne.field_h = new int[wb.field_f];
              cg.field_k = new int[wb.field_f];
              v.field_e = new boolean[wb.field_f];
              ph.field_q = new int[wb.field_f];
              var2_ref.field_m = param0.length - (7 + 8 * wb.field_f);
              hk.field_bb = var2_ref.j(-14477);
              eg.field_v = var2_ref.j(-14477);
              var3 = 1 + (255 & var2_ref.f(255));
              var4 = 0;
              L1: while (true) {
                if ((wb.field_f ^ -1) >= (var4 ^ -1)) {
                  var4 = 0;
                  L2: while (true) {
                    if ((var4 ^ -1) <= (wb.field_f ^ -1)) {
                      var4 = 0;
                      L3: while (true) {
                        if ((var4 ^ -1) <= (wb.field_f ^ -1)) {
                          var4 = 0;
                          L4: while (true) {
                            if (wb.field_f <= var4) {
                              var2_ref.field_m = -(wb.field_f * 8) + (-7 + param0.length + (-(var3 * 3) + 3));
                              ic.field_b = new int[var3];
                              var4 = 1;
                              L5: while (true) {
                                if ((var3 ^ -1) >= (var4 ^ -1)) {
                                  var2_ref.field_m = 0;
                                  var4 = 0;
                                  L6: while (true) {
                                    if (var4 >= wb.field_f) {
                                      break L0;
                                    } else {
                                      var5 = cg.field_k[var4];
                                      var6 = tf.field_b[var4];
                                      var7 = var6 * var5;
                                      var8 = new byte[var7];
                                      mf.field_j[var4] = var8;
                                      var9 = new byte[var7];
                                      ue.field_e[var4] = var9;
                                      var10 = 0;
                                      var11 = var2_ref.f(255);
                                      stackOut_39_0 = -1;
                                      stackOut_39_1 = var11 & 1;
                                      stackOut_39_2 = -1;
                                      stackIn_41_0 = stackOut_39_0;
                                      stackIn_41_1 = stackOut_39_1;
                                      stackIn_41_2 = stackOut_39_2;
                                      L7: {
                                        if (stackIn_41_0 != (stackIn_41_1 ^ stackIn_41_2)) {
                                          var12 = 0;
                                          L8: while (true) {
                                            if ((var5 ^ -1) >= (var12 ^ -1)) {
                                              if (-1 == (var11 & 2 ^ -1)) {
                                                break L7;
                                              } else {
                                                var12 = 0;
                                                L9: while (true) {
                                                  if (var12 >= var5) {
                                                    break L7;
                                                  } else {
                                                    var13 = 0;
                                                    L10: while (true) {
                                                      if ((var13 ^ -1) <= (var6 ^ -1)) {
                                                        var12++;
                                                        continue L9;
                                                      } else {
                                                        L11: {
                                                          byte dupTemp$2 = var2_ref.k(0);
                                                          var9[var5 * var13 + var12] = dupTemp$2;
                                                          var14 = dupTemp$2;
                                                          stackOut_69_0 = var10;
                                                          stackIn_72_0 = stackOut_69_0;
                                                          stackIn_70_0 = stackOut_69_0;
                                                          if (0 == (var14 ^ -1)) {
                                                            stackOut_72_0 = stackIn_72_0;
                                                            stackOut_72_1 = 0;
                                                            stackIn_73_0 = stackOut_72_0;
                                                            stackIn_73_1 = stackOut_72_1;
                                                            break L11;
                                                          } else {
                                                            stackOut_70_0 = stackIn_70_0;
                                                            stackOut_70_1 = 1;
                                                            stackIn_73_0 = stackOut_70_0;
                                                            stackIn_73_1 = stackOut_70_1;
                                                            break L11;
                                                          }
                                                        }
                                                        var10 = stackIn_73_0 | stackIn_73_1;
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
                                                if ((var6 ^ -1) >= (var13 ^ -1)) {
                                                  var12++;
                                                  continue L8;
                                                } else {
                                                  var8[var12 + var13 * var5] = var2_ref.k(0);
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
                                                  if ((var12 ^ -1) <= (var7 ^ -1)) {
                                                    break L7;
                                                  } else {
                                                    L15: {
                                                      byte dupTemp$3 = var2_ref.k(0);
                                                      var9[var12] = dupTemp$3;
                                                      var13 = dupTemp$3;
                                                      stackOut_50_0 = var10;
                                                      stackIn_53_0 = stackOut_50_0;
                                                      stackIn_51_0 = stackOut_50_0;
                                                      if (var13 == -1) {
                                                        stackOut_53_0 = stackIn_53_0;
                                                        stackOut_53_1 = 0;
                                                        stackIn_54_0 = stackOut_53_0;
                                                        stackIn_54_1 = stackOut_53_1;
                                                        break L15;
                                                      } else {
                                                        stackOut_51_0 = stackIn_51_0;
                                                        stackOut_51_1 = 1;
                                                        stackIn_54_0 = stackOut_51_0;
                                                        stackIn_54_1 = stackOut_51_1;
                                                        break L15;
                                                      }
                                                    }
                                                    var10 = stackIn_54_0 | stackIn_54_1;
                                                    var12++;
                                                    continue L14;
                                                  }
                                                }
                                              }
                                            } else {
                                              var8[var12] = var2_ref.k(0);
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
                                    ic.field_b[var4] = var2_ref.d((byte) 125);
                                    if ((ic.field_b[var4] ^ -1) == -1) {
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
                              tf.field_b[var4] = var2_ref.j(-14477);
                              var4++;
                              continue L4;
                            }
                          }
                        } else {
                          cg.field_k[var4] = var2_ref.j(-14477);
                          var4++;
                          continue L3;
                        }
                      }
                    } else {
                      ne.field_h[var4] = var2_ref.j(-14477);
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  ph.field_q[var4] = var2_ref.j(-14477);
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var2;
            stackOut_77_1 = new StringBuilder().append("jg.H(");
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param0 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L17;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L17;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param1 + 41);
        }
    }

    final void g(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 68) {
                break L1;
              } else {
                ((jg) this).field_l = null;
                break L1;
              }
            }
            ((jg) this).field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var2, "jg.B(" + param0 + 41);
        }
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wd var4 = null;
        String stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_14_0 = null;
        String stackIn_20_0 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        String stackOut_19_0 = null;
        String stackOut_21_0 = null;
        Object stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var3 = bl.a(4, (CharSequence) (Object) param0);
            if (var3 == null) {
              if (param1 == -1) {
                L1: {
                  if (!param0.equals((Object) (Object) ((jg) this).field_l)) {
                    L2: {
                      var4 = pl.a(param1 ^ 0, param0);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (null == var4.field_h) {
                          ((jg) this).field_l = param0;
                          ((jg) this).field_s = var4.field_i;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    return (String) (Object) stackIn_14_0;
                  } else {
                    break L1;
                  }
                }
                if (!((jg) this).field_s) {
                  stackOut_19_0 = uc.field_e;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0;
                } else {
                  stackOut_21_0 = oj.field_d;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
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
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3_ref;
            stackOut_23_1 = new StringBuilder().append("jg.A(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 41);
        }
        return stackIn_22_0;
    }

    jg(og param0) {
        super(param0);
        ((jg) this).field_s = false;
    }

    public static void c(byte param0) {
        try {
            field_p = null;
            field_r = null;
            field_q = null;
            if (param0 <= 97) {
                field_m = 69;
            }
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "jg.I(" + param0 + 41);
        }
    }

    final ok a(int param0, String param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        ok stackIn_5_0 = null;
        ok stackIn_12_0 = null;
        ok stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        ok stackOut_11_0 = null;
        ok stackOut_17_0 = null;
        ok stackOut_15_0 = null;
        ok stackOut_4_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
            if (ad.a((CharSequence) (Object) param1, (byte) 120)) {
              L2: {
                if (param1.equals((Object) (Object) ((jg) this).field_l)) {
                  break L2;
                } else {
                  L3: {
                    var3 = pl.a(param0 ^ 0, param1);
                    if (null == var3) {
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
                  stackOut_11_0 = l.field_S;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
              L4: {
                if (((jg) this).field_s) {
                  stackOut_17_0 = gf.field_V;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_15_0 = hg.field_c;
                  stackIn_18_0 = stackOut_15_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_4_0 = hg.field_c;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3_ref;
            stackOut_19_1 = new StringBuilder().append("jg.C(").append(param0).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_18_0;
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
