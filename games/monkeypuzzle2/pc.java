/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class pc extends nf {
    static int field_R;
    private int field_Q;
    private int field_W;
    private sd field_O;
    private int field_S;
    private ue field_Y;
    private int field_V;
    private we field_T;
    static le[] field_U;
    private int field_X;
    static String field_P;

    private final void a(we param0) {
        RuntimeException var3 = null;
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
              if (((pc) this).field_Y != null) {
                ((pc) this).field_Y.c(-19822);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == null) {
                ((pc) this).field_Y = new ue();
                break L2;
              } else {
                param0.a(param0.field_p, 13361, 6, param0.field_l, ((pc) this).field_V + 6);
                ((pc) this).field_Y = new ue(param0);
                break L2;
              }
            }
            ((pc) this).b((byte) -114, (we) (Object) ((pc) this).field_Y);
            ((pc) this).field_T = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("pc.M(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 6 + 41);
        }
    }

    final void e(byte param0) {
        if (param0 != 10) {
            ((pc) this).c((byte) 67, (we) null);
        }
        if (fl.field_c == ((pc) this).field_O) {
            return;
        }
        ((pc) this).field_O = ie.field_c;
        ((pc) this).field_X = 0;
        int discarded$0 = 6;
        this.a(((pc) this).field_T);
        ((pc) this).field_T = null;
        ((pc) this).field_Y.field_F = 0;
    }

    void c(byte param0, we param1) {
        RuntimeException var3 = null;
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
              if (param0 >= 25) {
                break L1;
              } else {
                ((pc) this).e((byte) 67);
                break L1;
              }
            }
            L2: {
              ((pc) this).field_T = param1;
              if (q.field_c == ((pc) this).field_O) {
                ((pc) this).b(((pc) this).field_V + (12 + ((pc) this).field_T.field_p), 0, ((pc) this).field_T.field_l + 12, ((pc) this).field_Q);
                ((pc) this).field_X = 0;
                break L2;
              } else {
                if (((pc) this).field_O != fl.field_c) {
                  ((pc) this).field_X = 0;
                  ((pc) this).field_O = fl.field_c;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("pc.C(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    boolean k(int param0) {
        int var3 = 0;
        L0: {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (null != ((pc) this).field_O) {
            if (fl.field_c == ((pc) this).field_O) {
              int fieldTemp$39 = ((pc) this).field_X + 1;
              ((pc) this).field_X = ((pc) this).field_X + 1;
              if (fieldTemp$39 != ((pc) this).field_S) {
                ((pc) this).field_Y.field_F = -((((pc) this).field_X << 8) / ((pc) this).field_S) + 256;
                break L0;
              } else {
                ((pc) this).field_O = q.field_c;
                ((pc) this).b(((pc) this).field_T.field_p + (12 - -((pc) this).field_V), 0, ((pc) this).field_T.field_l + 12, ((pc) this).field_Q);
                ((pc) this).field_X = 0;
                ((pc) this).field_Y.field_F = 0;
                break L0;
              }
            } else {
              if (((pc) this).field_O != ie.field_c) {
                break L0;
              } else {
                int fieldTemp$40 = ((pc) this).field_X + 1;
                ((pc) this).field_X = ((pc) this).field_X + 1;
                if (fieldTemp$40 != ((pc) this).field_W) {
                  ((pc) this).field_Y.field_F = (((pc) this).field_X << 8) / ((pc) this).field_W;
                  break L0;
                } else {
                  ((pc) this).field_Y.field_F = 256;
                  ((pc) this).field_O = null;
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 == -23913) {
            break L1;
          } else {
            boolean discarded$41 = ((pc) this).b(false);
            break L1;
          }
        }
        return super.k(-23913);
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_32_0 = null;
        String stackOut_27_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = pl.a((byte) 109, param2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (ok.a(-61, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (!ok.a(-57, var4.charAt(-1 + var4.length()))) {
                                L4: {
                                  if (param0 <= -92) {
                                    break L4;
                                  } else {
                                    String discarded$2 = pc.a((byte) 28, false, (CharSequence) null);
                                    break L4;
                                  }
                                }
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  if (var6 >= param2.length()) {
                                    if (var5 > 0) {
                                      stackOut_32_0 = n.field_c;
                                      stackIn_33_0 = stackOut_32_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param2.charAt(var6);
                                      if (!ok.a(-115, (char) var7)) {
                                        var5 = 0;
                                        break L6;
                                      } else {
                                        var5++;
                                        break L6;
                                      }
                                    }
                                    if (var5 < 2) {
                                      var6++;
                                      continue L5;
                                    } else {
                                      stackOut_27_0 = ac.field_d;
                                      stackIn_28_0 = stackOut_27_0;
                                      return stackIn_28_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_17_0 = n.field_c;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = cm.field_B;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                }
              }
              stackOut_7_0 = cm.field_B;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = cm.field_B;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("pc.CA(").append(param0).append(44).append(0).append(44);
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L7;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L7;
            }
          }
          throw la.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 41);
        }
        return stackIn_33_0;
    }

    final boolean b(boolean param0) {
        if (param0) {
            ((pc) this).field_T = null;
        }
        ((pc) this).p(-21);
        return super.b(false);
    }

    boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            var5_int = 72;
            if (!super.a(param0, param1, param2, -113)) {
              if (((pc) this).field_Y != null) {
                L1: {
                  if (param2 == 98) {
                    boolean discarded$4 = ((pc) this).field_Y.a(param0, false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param2 != 99) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((pc) this).field_Y.a(param0, false);
                    break L2;
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                return false;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("pc.V(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + 120 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final void p(int param0) {
        if (null != ((pc) this).field_O) {
            if (ie.field_c != ((pc) this).field_O) {
                ((pc) this).a(12 - -((pc) this).field_V + ((pc) this).field_T.field_p, (byte) -11, ((pc) this).field_T.field_l + 12);
                int discarded$0 = 6;
                this.a(((pc) this).field_T);
            }
            ((pc) this).field_Y.field_F = 256;
            ((pc) this).field_O = null;
        }
        super.p(param0);
        if (param0 != -21) {
            ((pc) this).c((byte) -90, (we) null);
        }
    }

    public static void c() {
        field_U = null;
        field_P = null;
    }

    pc(kj param0, we param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_l, param1.field_p + (param2 + 12));
        try {
            ((pc) this).field_W = param3;
            ((pc) this).field_S = param3;
            ((pc) this).field_V = param2;
            ((pc) this).field_Q = param4;
            int discarded$0 = 6;
            this.a(param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "pc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(byte param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              ah.field_h = false;
              hj.field_L = false;
              if (null == me.field_f) {
                break L1;
              } else {
                if (me.field_f.field_z) {
                  L2: {
                    if (param1 != 8) {
                      break L2;
                    } else {
                      L3: {
                        param1 = 2;
                        if (fk.field_a) {
                          param2 = r.field_b;
                          break L3;
                        } else {
                          param2 = od.field_o;
                          break L3;
                        }
                      }
                      j.field_e.a(bh.field_b, (byte) -34);
                      break L2;
                    }
                  }
                  L4: {
                    var3_int = 1;
                    if (param1 != 10) {
                      break L4;
                    } else {
                      int discarded$2 = 35;
                      wj.d();
                      var3_int = 0;
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int != 0) {
                      L6: {
                        if (!hj.field_L) {
                          break L6;
                        } else {
                          param2 = gg.a(new String[1], ek.field_c, true);
                          break L6;
                        }
                      }
                      L7: {
                        if (ja.field_F) {
                          param2 = oa.field_F;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      me.field_f.a(-10, param2, param1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (256 == param1) {
                    break L1;
                  } else {
                    if (param1 != 10) {
                      if (fk.field_a) {
                        break L1;
                      } else {
                        j.field_e.k(-112);
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("pc.S(").append(-46).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw la.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = 640;
        field_P = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
