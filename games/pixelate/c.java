/*
 * Decompiled by CFR-JS 0.4.0.
 */
class c extends qm {
    private boolean field_P;
    private int field_N;
    private long field_U;
    private int field_ab;
    private boolean field_Q;
    private int field_V;
    static bd field_Z;
    private long field_W;
    private int field_S;
    static boolean field_T;
    static volatile int field_X;
    static String field_O;
    static ha field_R;
    static tc field_Y;

    private final void d(boolean param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.l(121);
                this.a(var2, 32240);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        var2 = ((c) this).field_q.length();
        if (var2 != ((c) this).field_ab) {
          var3 = ((c) this).field_ab + 1;
          L0: while (true) {
            L1: {
              if (var3 >= var2) {
                break L1;
              } else {
                if (32 == ((c) this).field_q.charAt(var3 + -1)) {
                  break L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
            return var3;
          }
        } else {
          return ((c) this).field_ab;
        }
    }

    c(String param0, fn param1, int param2) {
        super(param0, param1);
        ((c) this).field_U = 0L;
        ((c) this).field_V = -1;
        ((c) this).field_P = false;
        try {
            ((c) this).field_y = h.field_X.field_i;
            ((c) this).field_N = param2;
            ((c) this).a(true, (byte) 87, param0);
            ((c) this).field_Q = true;
            ((c) this).field_W = hm.a(64);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "c.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (((c) this).field_N != -1) {
                var3_int = ((c) this).field_N + -((c) this).field_q.length();
                if (var3_int < 0) {
                  param0 = param0.substring(0, var3_int);
                  break L1;
                } else {
                  return;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (((c) this).field_ab == ((c) this).field_q.length()) {
                ((c) this).field_q = ((c) this).field_q + param0;
                break L2;
              } else {
                ((c) this).field_q = ((c) this).field_q.substring(0, ((c) this).field_ab) + param0 + ((c) this).field_q.substring(((c) this).field_ab, ((c) this).field_q.length());
                break L2;
              }
            }
            ((c) this).field_ab = ((c) this).field_ab + param0.length();
            ((c) this).field_S = ((c) this).field_ab;
            ((c) this).n(1392153825);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("c.Q(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 32240 + ')');
        }
    }

    private final void r(int param0) {
        this.e(false);
        this.l(126);
    }

    public static void o(int param0) {
        field_Z = null;
        field_Y = null;
        field_O = null;
        if (param0 != 12669) {
            return;
        }
        field_R = null;
    }

    final static void m(int param0) {
        int var1 = (ni.field_q + -640) / 2;
        if (param0 < 18) {
            field_Y = null;
        }
        int var2 = qh.field_c * qh.field_c;
        int var3 = var2 + -(oo.field_b * oo.field_b);
        ql.field_n.a(90, -210 + t.field_d - 4, -(var3 * 199 / var2) + var1, 256, 199);
        ti.field_E.a(0, -120 + t.field_d + -4, 438 * var3 / var2 + var1 + 202, 256, 438);
    }

    private final String a(byte param0) {
        int var2 = ((c) this).field_S >= ((c) this).field_ab ? ((c) this).field_ab : ((c) this).field_S;
        int var3 = ((c) this).field_ab <= ((c) this).field_S ? ((c) this).field_S : ((c) this).field_ab;
        return ((c) this).field_q.substring(var2, var3);
    }

    private final void a(int param0, int param1) {
        ((c) this).field_ab = param0;
        if (!bc.field_m[param1]) {
            ((c) this).field_S = ((c) this).field_ab;
        }
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_62_0 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_77_0 = 0;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                ((c) this).field_P = true;
                break L1;
              }
            }
            ((c) this).field_W = hm.a(64);
            if (60 == param3) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              if (param3 != 62) {
                L2: {
                  if (param3 < 32) {
                    break L2;
                  } else {
                    if (param3 <= 126) {
                      L3: {
                        if (~((c) this).field_S == ~((c) this).field_ab) {
                          break L3;
                        } else {
                          this.l(-114);
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if (((c) this).field_N == -1) {
                            break L5;
                          } else {
                            if (~((c) this).field_q.length() > ~((c) this).field_N) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if (~((c) this).field_ab > ~((c) this).field_q.length()) {
                            ((c) this).field_q = ((c) this).field_q.substring(0, ((c) this).field_ab) + param3 + ((c) this).field_q.substring(((c) this).field_ab, ((c) this).field_q.length());
                            ((c) this).field_ab = ((c) this).field_ab + 1;
                            ((c) this).field_S = ((c) this).field_ab;
                            break L6;
                          } else {
                            ((c) this).field_q = ((c) this).field_q + param3;
                            int dupTemp$1 = ((c) this).field_q.length();
                            ((c) this).field_ab = dupTemp$1;
                            ((c) this).field_S = dupTemp$1;
                            break L6;
                          }
                        }
                        ((c) this).n(1392153825);
                        break L4;
                      }
                      stackOut_75_0 = 1;
                      stackIn_76_0 = stackOut_75_0;
                      return stackIn_76_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                L7: {
                  if (param0 == 85) {
                    if (((c) this).field_ab != ((c) this).field_S) {
                      this.l(-14);
                      stackOut_64_0 = 1;
                      stackIn_65_0 = stackOut_64_0;
                      return stackIn_65_0 != 0;
                    } else {
                      if (((c) this).field_ab > 0) {
                        ((c) this).field_S = ((c) this).field_ab - 1;
                        this.l(-78);
                        stackOut_62_0 = 1;
                        stackIn_63_0 = stackOut_62_0;
                        return stackIn_63_0 != 0;
                      } else {
                        break L7;
                      }
                    }
                  } else {
                    if (param0 != 101) {
                      if (param0 != 13) {
                        if (param0 != 96) {
                          if (97 == param0) {
                            if (~((c) this).field_ab <= ~((c) this).field_q.length()) {
                              break L7;
                            } else {
                              L8: {
                                stackOut_54_0 = this;
                                stackIn_56_0 = stackOut_54_0;
                                stackIn_55_0 = stackOut_54_0;
                                if (!bc.field_m[82]) {
                                  stackOut_56_0 = this;
                                  stackOut_56_1 = 1 + ((c) this).field_ab;
                                  stackIn_57_0 = stackOut_56_0;
                                  stackIn_57_1 = stackOut_56_1;
                                  break L8;
                                } else {
                                  stackOut_55_0 = this;
                                  stackOut_55_1 = this.k(-5782);
                                  stackIn_57_0 = stackOut_55_0;
                                  stackIn_57_1 = stackOut_55_1;
                                  break L8;
                                }
                              }
                              this.a(stackIn_57_1, 81);
                              stackOut_57_0 = 1;
                              stackIn_58_0 = stackOut_57_0;
                              return stackIn_58_0 != 0;
                            }
                          } else {
                            if (param0 != 102) {
                              if (param0 != 103) {
                                if (param0 == 84) {
                                  this.d((byte) -126);
                                  stackOut_51_0 = 1;
                                  stackIn_52_0 = stackOut_51_0;
                                  return stackIn_52_0 != 0;
                                } else {
                                  L9: {
                                    if (!bc.field_m[82]) {
                                      break L9;
                                    } else {
                                      if (param0 == 65) {
                                        this.r(-1);
                                        stackOut_49_0 = 1;
                                        stackIn_50_0 = stackOut_49_0;
                                        return stackIn_50_0 != 0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    if (!bc.field_m[82]) {
                                      break L10;
                                    } else {
                                      if (param0 != 66) {
                                        break L10;
                                      } else {
                                        this.e(false);
                                        stackOut_43_0 = 1;
                                        stackIn_44_0 = stackOut_43_0;
                                        return stackIn_44_0 != 0;
                                      }
                                    }
                                  }
                                  if (!bc.field_m[82]) {
                                    break L7;
                                  } else {
                                    if (67 != param0) {
                                      break L7;
                                    } else {
                                      this.d(true);
                                      stackOut_47_0 = 1;
                                      stackIn_48_0 = stackOut_47_0;
                                      return stackIn_48_0 != 0;
                                    }
                                  }
                                }
                              } else {
                                this.a(((c) this).field_q.length(), param1 + 78);
                                stackOut_35_0 = 1;
                                stackIn_36_0 = stackOut_35_0;
                                return stackIn_36_0 != 0;
                              }
                            } else {
                              this.a(0, param1 + 78);
                              stackOut_32_0 = 1;
                              stackIn_33_0 = stackOut_32_0;
                              return stackIn_33_0 != 0;
                            }
                          }
                        } else {
                          if (0 < ((c) this).field_ab) {
                            L11: {
                              stackOut_25_0 = this;
                              stackIn_27_0 = stackOut_25_0;
                              stackIn_26_0 = stackOut_25_0;
                              if (!bc.field_m[82]) {
                                stackOut_27_0 = this;
                                stackOut_27_1 = ((c) this).field_ab + -1;
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                break L11;
                              } else {
                                stackOut_26_0 = this;
                                stackOut_26_1 = this.c(false);
                                stackIn_28_0 = stackOut_26_0;
                                stackIn_28_1 = stackOut_26_1;
                                break L11;
                              }
                            }
                            this.a(stackIn_28_1, 81);
                            stackOut_28_0 = 1;
                            stackIn_29_0 = stackOut_28_0;
                            return stackIn_29_0 != 0;
                          } else {
                            break L7;
                          }
                        }
                      } else {
                        ((c) this).p(127);
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      }
                    } else {
                      if (~((c) this).field_ab == ~((c) this).field_S) {
                        if (((c) this).field_ab < ((c) this).field_q.length()) {
                          ((c) this).field_S = 1 + ((c) this).field_ab;
                          this.l(18);
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        } else {
                          break L7;
                        }
                      } else {
                        this.l(param1 + -12);
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      }
                    }
                  }
                }
                stackOut_77_0 = 0;
                stackIn_78_0 = stackOut_77_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) var5;
            stackOut_79_1 = new StringBuilder().append("c.G(").append(param0).append(',').append(param1).append(',');
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param2 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L12;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L12;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + ',' + param3 + ')');
        }
        return stackIn_78_0 != 0;
    }

    void n(int param0) {
        if (!(!(((c) this).field_n instanceof hi))) {
            ((hi) (Object) ((c) this).field_n).a(-107, (c) this);
        }
        if (param0 != 1392153825) {
            ((c) this).n(103);
        }
    }

    final void p(int param0) {
        ((c) this).field_ab = 0;
        ((c) this).field_S = 0;
        int var2 = 19 % ((52 - param0) / 55);
        ((c) this).field_q = "";
        ((c) this).n(1392153825);
    }

    private final void q(int param0) {
        kd var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        af var9 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        if (((c) this).field_Q) {
          if (!(((c) this).field_y instanceof af)) {
            return;
          } else {
            var9 = (af) (Object) ((c) this).field_y;
            var3 = var9.b(-88, (ng) this);
            var4 = var3.a(0);
            var5 = var9.a(true, (ng) this);
            var6 = var9.a(-3) >> 1;
            if (-var6 + var5 <= var4) {
              L0: {
                var7 = ((c) this).field_B + var3.b(true, ((c) this).field_ab);
                if (var5 + -var6 < var7) {
                  ((c) this).field_B = -var6 - -var5 + (-var7 + ((c) this).field_B);
                  break L0;
                } else {
                  if (var6 <= var7) {
                    break L0;
                  } else {
                    ((c) this).field_B = -var7 - -var6 + ((c) this).field_B;
                    break L0;
                  }
                }
              }
              return;
            } else {
              ((c) this).field_B = 0;
              ((c) this).field_x = 0;
              return;
            }
          }
        } else {
          ((c) this).field_B = 0;
          ((c) this).field_x = 0;
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        af var6 = null;
        long var7 = 0L;
        int var5 = 118 % ((param3 - 70) / 49);
        if (null != ((c) this).field_y) {
            if (param1 == 0) {
                ((c) this).field_y.a((ng) this, (byte) -124, param0, param2, ((c) this).field_H);
                if (!(!(((c) this).field_y instanceof af))) {
                    var6 = (af) (Object) ((c) this).field_y;
                    if (!(((c) this).field_S == ((c) this).field_ab)) {
                        var6.a(((c) this).field_S, (ng) this, -1, ((c) this).field_ab, param0, param2);
                    }
                    var7 = hm.a(64);
                    if (!((var7 - ((c) this).field_W) % 1000L >= 500L)) {
                        var6.a(param2, param0, (byte) -91, (ng) this, ((c) this).field_ab);
                    }
                }
            }
        }
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((c) this).field_S != ((c) this).field_ab) {
            var2 = ((c) this).field_ab > ((c) this).field_S ? ((c) this).field_S : ((c) this).field_ab;
            var3 = ((c) this).field_ab > ((c) this).field_S ? ((c) this).field_ab : ((c) this).field_S;
            ((c) this).field_ab = var2;
            ((c) this).field_S = var2;
            ((c) this).field_q = ((c) this).field_q.substring(0, var2) + ((c) this).field_q.substring(var3, ((c) this).field_q.length());
            ((c) this).n(1392153825);
        }
        var2 = 96 / ((param0 - 64) / 46);
    }

    private final void d(byte param0) {
        if (!(!(((c) this).field_n instanceof hi))) {
            ((hi) (Object) ((c) this).field_n).a((c) this, 4);
        }
        int var2 = -72;
    }

    final boolean a(byte param0, ng param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        long var8_long = 0L;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              if (((c) this).field_y instanceof af) {
                L1: {
                  var8_int = ((af) (Object) ((c) this).field_y).a(param3, param5, 0, uf.field_d, bg.field_k, (ng) this);
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var8_int == -1) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L1;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = var8_int;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L1;
                  }
                }
                L2: {
                  this.a(stackIn_6_1, 81);
                  var8_long = hm.a(64);
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (-((c) this).field_U + var8_long >= 250L) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L2;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                }
                L3: {
                  ((c) this).field_P = stackIn_9_1 != 0;
                  if (!((c) this).field_P) {
                    break L3;
                  } else {
                    L4: {
                      ((c) this).field_S = this.c(false);
                      ((c) this).field_ab = this.k(-5782);
                      if (((c) this).field_ab <= 0) {
                        break L4;
                      } else {
                        if (32 == ((c) this).field_q.charAt(-1 + ((c) this).field_ab)) {
                          ((c) this).field_ab = ((c) this).field_ab - 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((c) this).field_V = ((c) this).field_ab;
                    break L3;
                  }
                }
                ((c) this).field_U = var8_long;
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("c.N(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_18_0 != 0;
    }

    private final void e(boolean param0) {
        String var2 = this.a((byte) 11);
        if (0 < var2.length()) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.a((byte) 11)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final void a(boolean param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param2 != null) {
                break L1;
              } else {
                param2 = "";
                break L1;
              }
            }
            L2: {
              ((c) this).field_q = param2;
              var4_int = param2.length();
              if (((c) this).field_N == -1) {
                break L2;
              } else {
                if (((c) this).field_N < var4_int) {
                  ((c) this).field_q = ((c) this).field_q.substring(0, ((c) this).field_N);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              int dupTemp$2 = ((c) this).field_q.length();
              ((c) this).field_S = dupTemp$2;
              ((c) this).field_ab = dupTemp$2;
              if (param1 == 87) {
                break L3;
              } else {
                c.o(97);
                break L3;
              }
            }
            L4: {
              if (param0) {
                break L4;
              } else {
                ((c) this).n(1392153825);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("c.D(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    void a(int param0, int param1, int param2, ng param3) {
        af var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              super.a(param0, param1, param2, param3);
              this.q(-117);
              if (((c) this).field_k == 1) {
                L2: {
                  if (!(((c) this).field_y instanceof af)) {
                    break L2;
                  } else {
                    var5 = (af) (Object) ((c) this).field_y;
                    var6 = var5.a(param1, param2, param0 ^ 40, uf.field_d, bg.field_k, (ng) this);
                    if (var6 == -1) {
                      break L2;
                    } else {
                      L3: {
                        if (!((c) this).field_P) {
                          break L3;
                        } else {
                          if (var6 >= ((c) this).field_V) {
                            break L3;
                          } else {
                            if (var6 > ((c) this).field_S) {
                              var6 = ((c) this).field_V;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((c) this).field_ab = var6;
                      break L2;
                    }
                  }
                }
                ((c) this).field_W = hm.a(64);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("c.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    private final int c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (((c) this).field_ab != 0) {
          var2 = -1 + ((c) this).field_ab;
          L0: while (true) {
            L1: {
              if (var2 <= 0) {
                break L1;
              } else {
                if (((c) this).field_q.charAt(var2 - 1) == 32) {
                  break L1;
                } else {
                  var2--;
                  continue L0;
                }
              }
            }
            return var2;
          }
        } else {
          return ((c) this).field_ab;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = new bd();
        field_O = "Your request to join has been declined.";
        field_X = 0;
    }
}
