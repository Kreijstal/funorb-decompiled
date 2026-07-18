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

    private final void a(we param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (((pc) this).field_Y != null) {
                ((pc) this).field_Y.c(param1 ^ -19820);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == param0) {
                  break L3;
                } else {
                  param0.a(param0.field_p, 13361, 6, param0.field_l, ((pc) this).field_V + 6);
                  ((pc) this).field_Y = new ue(param0);
                  if (!MonkeyPuzzle2.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((pc) this).field_Y = new ue();
              break L2;
            }
            L4: {
              ((pc) this).b((byte) -114, (we) (Object) ((pc) this).field_Y);
              ((pc) this).field_T = null;
              if (param1 == 6) {
                break L4;
              } else {
                ((pc) this).p(-125);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("pc.M(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
    }

    final void e(byte param0) {
        if (param0 != 10) {
            ((pc) this).c((byte) 67, (we) null);
        }
        if (fl.field_c == ((pc) this).field_O) {
            return;
        }
        try {
            ((pc) this).field_O = ie.field_c;
            ((pc) this).field_X = 0;
            this.a(((pc) this).field_T, 6);
            ((pc) this).field_T = null;
            ((pc) this).field_Y.field_F = 0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "pc.K(" + param0 + ')');
        }
    }

    void c(byte param0, we param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
              L3: {
                ((pc) this).field_T = param1;
                if (q.field_c == ((pc) this).field_O) {
                  break L3;
                } else {
                  if (((pc) this).field_O != fl.field_c) {
                    ((pc) this).field_X = 0;
                    ((pc) this).field_O = fl.field_c;
                    if (!MonkeyPuzzle2.field_F) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              ((pc) this).b(((pc) this).field_V + (12 + ((pc) this).field_T.field_p), 0, ((pc) this).field_T.field_l + 12, ((pc) this).field_Q);
              ((pc) this).field_X = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("pc.C(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    boolean k(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        boolean stackIn_29_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_28_0 = false;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != ((pc) this).field_O) {
                L2: {
                  if (fl.field_c == ((pc) this).field_O) {
                    break L2;
                  } else {
                    if (((pc) this).field_O != ie.field_c) {
                      break L1;
                    } else {
                      L3: {
                        int fieldTemp$3 = ((pc) this).field_X + 1;
                        ((pc) this).field_X = ((pc) this).field_X + 1;
                        if (fieldTemp$3 != ((pc) this).field_W) {
                          break L3;
                        } else {
                          ((pc) this).field_Y.field_F = 256;
                          ((pc) this).field_O = null;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((pc) this).field_Y.field_F = (((pc) this).field_X << 1103775592) / ((pc) this).field_W;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L4: {
                  int fieldTemp$4 = ((pc) this).field_X + 1;
                  ((pc) this).field_X = ((pc) this).field_X + 1;
                  if (fieldTemp$4 != ((pc) this).field_S) {
                    break L4;
                  } else {
                    ((pc) this).field_O = q.field_c;
                    ((pc) this).b(((pc) this).field_T.field_p + (12 - -((pc) this).field_V), 0, ((pc) this).field_T.field_l + 12, ((pc) this).field_Q);
                    ((pc) this).field_X = 0;
                    ((pc) this).field_Y.field_F = 0;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                ((pc) this).field_Y.field_F = -((((pc) this).field_X << -1959187128) / ((pc) this).field_S) + 256;
                break L1;
              } else {
                break L1;
              }
            }
            L5: {
              if (param0 == -23913) {
                break L5;
              } else {
                boolean discarded$5 = ((pc) this).b(false);
                break L5;
              }
            }
            stackOut_28_0 = super.k(-23913);
            stackIn_29_0 = stackOut_28_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "pc.BA(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_11_0 = null;
        String stackIn_17_0 = null;
        String stackIn_23_0 = null;
        boolean stackIn_30_0 = false;
        String stackIn_42_0 = null;
        int stackIn_45_0 = 0;
        String stackIn_49_0 = null;
        Object stackIn_51_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_29_0 = false;
        String stackOut_41_0 = null;
        int stackOut_44_0 = 0;
        String stackOut_48_0 = null;
        Object stackOut_50_0 = null;
        String stackOut_22_0 = null;
        String stackOut_16_0 = null;
        String stackOut_10_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (null != param2) {
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
                      if (null == var4) {
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
                                    String discarded$1 = pc.a((byte) 28, false, (CharSequence) null);
                                    break L4;
                                  }
                                }
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  L6: {
                                    L7: {
                                      if (var6 >= param2.length()) {
                                        break L7;
                                      } else {
                                        var7 = param2.charAt(var6);
                                        stackOut_29_0 = ok.a(-115, (char) var7);
                                        stackIn_45_0 = stackOut_29_0 ? 1 : 0;
                                        stackIn_30_0 = stackOut_29_0;
                                        if (var8 != 0) {
                                          break L6;
                                        } else {
                                          L8: {
                                            L9: {
                                              if (!stackIn_30_0) {
                                                break L9;
                                              } else {
                                                var5++;
                                                if (var8 == 0) {
                                                  break L8;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                            var5 = 0;
                                            break L8;
                                          }
                                          L10: {
                                            if (var5 < 2) {
                                              break L10;
                                            } else {
                                              if (param1) {
                                                break L10;
                                              } else {
                                                stackOut_41_0 = ac.field_d;
                                                stackIn_42_0 = stackOut_41_0;
                                                return stackIn_42_0;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L5;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_44_0 = -1;
                                    stackIn_45_0 = stackOut_44_0;
                                    break L6;
                                  }
                                  if (stackIn_45_0 > ~var5) {
                                    stackOut_48_0 = n.field_c;
                                    stackIn_49_0 = stackOut_48_0;
                                    return stackIn_49_0;
                                  } else {
                                    stackOut_50_0 = null;
                                    stackIn_51_0 = stackOut_50_0;
                                    break L0;
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_22_0 = n.field_c;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_16_0 = cm.field_B;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0;
                  }
                }
              }
              stackOut_10_0 = cm.field_B;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            } else {
              stackOut_2_0 = cm.field_B;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var3;
            stackOut_52_1 = new StringBuilder().append("pc.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param2 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L11;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_56_0 = stackOut_53_0;
              stackIn_56_1 = stackOut_53_1;
              stackIn_56_2 = stackOut_53_2;
              break L11;
            }
          }
          throw la.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ')');
        }
        return (String) (Object) stackIn_51_0;
    }

    final boolean b(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((pc) this).field_T = null;
                break L1;
              }
            }
            ((pc) this).p(-21);
            stackOut_3_0 = super.b(false);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "pc.Q(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            var5_int = 72 / ((param3 - 37) / 50);
            if (!super.a(param0, param1, param2, -113)) {
              L1: {
                if (((pc) this).field_Y != null) {
                  L2: {
                    if (param2 == 98) {
                      boolean discarded$2 = ((pc) this).field_Y.a(param0, false);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (param2 != 99) {
                    break L1;
                  } else {
                    boolean discarded$3 = ((pc) this).field_Y.a(param0, false);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L0;
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
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("pc.V(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final void p(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((pc) this).field_O) {
                break L1;
              } else {
                L2: {
                  if (ie.field_c == ((pc) this).field_O) {
                    break L2;
                  } else {
                    ((pc) this).a(12 - -((pc) this).field_V + ((pc) this).field_T.field_p, (byte) -11, ((pc) this).field_T.field_l + 12);
                    this.a(((pc) this).field_T, 6);
                    break L2;
                  }
                }
                ((pc) this).field_Y.field_F = 256;
                ((pc) this).field_O = null;
                break L1;
              }
            }
            L3: {
              super.p(param0);
              if (param0 == -21) {
                break L3;
              } else {
                ((pc) this).c((byte) -90, (we) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "pc.DA(" + param0 + ')');
        }
    }

    public static void c(boolean param0) {
        try {
            field_U = null;
            field_P = null;
            if (!param0) {
                field_R = 105;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "pc.U(" + param0 + ')');
        }
    }

    pc(kj param0, we param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_l, param1.field_p + (param2 + 12));
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((pc) this).field_W = param3;
            ((pc) this).field_S = param3;
            ((pc) this).field_V = param2;
            ((pc) this).field_Q = param4;
            this.a(param1, 6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pc.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            L1: {
              ah.field_h = false;
              if (param0 == -46) {
                break L1;
              } else {
                field_R = 44;
                break L1;
              }
            }
            L2: {
              hj.field_L = false;
              if (null == me.field_f) {
                break L2;
              } else {
                if (me.field_f.field_z) {
                  L3: {
                    if (param1 != 8) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          param1 = 2;
                          if (fk.field_a) {
                            break L5;
                          } else {
                            param2 = od.field_o;
                            if (!MonkeyPuzzle2.field_F) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        param2 = r.field_b;
                        break L4;
                      }
                      j.field_e.a(bh.field_b, (byte) -34);
                      break L3;
                    }
                  }
                  L6: {
                    var3_int = 1;
                    if (param1 != 10) {
                      break L6;
                    } else {
                      wj.d((byte) 35);
                      var3_int = 0;
                      break L6;
                    }
                  }
                  L7: {
                    if (var3_int != 0) {
                      L8: {
                        if (!hj.field_L) {
                          break L8;
                        } else {
                          param2 = gg.a(new String[1], ek.field_c, true);
                          break L8;
                        }
                      }
                      L9: {
                        if (ja.field_F) {
                          param2 = oa.field_F;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      me.field_f.a(-10, param2, param1);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (256 == param1) {
                    break L2;
                  } else {
                    if (param1 != 10) {
                      if (fk.field_a) {
                        break L2;
                      } else {
                        j.field_e.k(-112);
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("pc.S(").append(param0).append(',').append(param1).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L10;
            }
          }
          throw la.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
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
