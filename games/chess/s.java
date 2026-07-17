/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends ma implements wl, mj {
    static ci field_M;
    static String field_R;
    private bg field_L;
    static int field_K;
    private fb field_N;
    t field_Q;
    static int field_O;
    private fb field_P;
    static fe field_S;

    public final void a(int param0) {
        if (param0 != 120) {
            field_R = null;
        }
        ((uh) (Object) ((s) this).field_L.a(-82)).h(-85);
    }

    private final boolean i() {
        if (this.a((byte) 84, (ee) (Object) ((s) this).field_L)) {
            return true;
        }
        return false;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void g() {
        field_S = null;
        field_M = null;
        field_R = null;
    }

    private final boolean a(byte param0, ee param1) {
        vb var3 = null;
        RuntimeException var3_ref = null;
        mk var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var3 = param1.a(-81);
            if (var3 != null) {
              L1: {
                if (param0 > 42) {
                  break L1;
                } else {
                  field_O = 81;
                  break L1;
                }
              }
              L2: {
                var4 = var3.a(21314);
                if (oa.field_a != var4) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
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
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("s.H(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_10_0 = false;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 == 98) {
                stackOut_6_0 = ((s) this).a(param3, param2 ^ -27965);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param1 == 99) {
                  stackOut_10_0 = ((s) this).a(param3, (byte) -73);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("s.KA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    private final int a(String param0, String param1, mf param2) {
        RuntimeException var8 = null;
        ea var9 = null;
        kg var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var10 = new kg(20, 70, 290, 25, param2, false, 120, 3, rb.field_b, 16777215, param1);
            ((s) this).b((mf) (Object) var10, 95);
            var9 = new ea(((ee) (Object) param2).a(-121), param0, 126, var10.field_C + 70, 195, 35);
            var9.field_p = (rg) this;
            ((s) this).b((mf) (Object) var9, 95);
            stackOut_0_0 = var9.field_C + var10.field_C;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("s.M(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 70 + 44 + 170 + 44 + 35 + 44 + 3 + 41);
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, mf param2, int param3) {
        try {
            if (param1 > -6) {
                ((s) this).field_L = null;
            }
            super.a(param0, -14, param2, param3);
            int discarded$0 = 0;
            ((s) this).field_N.field_H = this.i();
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "s.G(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static void b(int param0, int param1, int param2, int param3) {
        mn.field_h.field_l = 0;
        mn.field_h.c(12, (byte) 65);
        mn.field_h.d(ph.field_d.nextInt(), (byte) -81);
        mn.field_h.d(ph.field_d.nextInt(), (byte) -81);
        mn.field_h.c(param0, (byte) 71);
        mn.field_h.c(param1, (byte) -91);
        mn.field_h.b(param3, 115);
        mn.field_h.a(dk.field_k, se.field_M, (byte) 86);
        qn.field_U.f(18, -116);
        int fieldTemp$0 = qn.field_U.field_l + 1;
        qn.field_U.field_l = qn.field_U.field_l + 1;
        int var4 = fieldTemp$0;
        qn.field_U.a(mn.field_h.field_o, (byte) -45, 0, mn.field_h.field_l);
        qn.field_U.a(qn.field_U.field_l - var4, -1);
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        Object var7 = null;
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
              if (((s) this).field_P == param0) {
                mf.e(115);
                break L1;
              } else {
                if (param0 == ((s) this).field_N) {
                  this.h(param4 + 24099);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param4 == -24221) {
                break L2;
              } else {
                var7 = null;
                boolean discarded$1 = this.a((byte) -85, (ee) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("s.DA(");
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
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, nb param1, boolean param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        jc var10 = null;
        Object var11 = null;
        int var11_int = 0;
        r var12 = null;
        int var13 = 0;
        ci var14 = null;
        ci var15 = null;
        ci var16 = null;
        ci var17 = null;
        ci var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        String var24 = null;
        String var25 = null;
        int var25_int = 0;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        nb stackIn_25_0 = null;
        nb stackIn_26_0 = null;
        nb stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_43_0 = 0;
        ci stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        ci stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        ci stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        nb stackOut_24_0 = null;
        nb stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        nb stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        ci stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        ci stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        ci stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        L0: {
          var31 = Chess.field_G;
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null == pd.field_Rb) {
            break L0;
          } else {
            L1: {
              if (null != t.field_L) {
                break L1;
              } else {
                if (uj.field_k != null) {
                  break L1;
                } else {
                  if (null != il.field_b) {
                    break L1;
                  } else {
                    if (null != nk.field_r) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            var9 = 0;
            L2: while (true) {
              if (var9 >= qa.field_e) {
                break L0;
              } else {
                L3: {
                  var10_int = pd.field_Rb.field_sc[var9] & 255;
                  if (null == t.field_L) {
                    break L3;
                  } else {
                    if (t.field_L[var9] == null) {
                      break L3;
                    } else {
                      if (!t.field_L[var9][var10_int]) {
                        break L3;
                      } else {
                        var5_int = 1;
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (uj.field_k == null) {
                    break L4;
                  } else {
                    if (null == uj.field_k[var9]) {
                      break L4;
                    } else {
                      L5: {
                        var11_int = uj.field_k[var9][var10_int];
                        if (var11_int == 0) {
                          break L5;
                        } else {
                          if (lf.field_U) {
                            break L5;
                          } else {
                            var5_int = 1;
                            break L5;
                          }
                        }
                      }
                      if (var6 >= var11_int) {
                        break L4;
                      } else {
                        var6 = var11_int;
                        break L4;
                      }
                    }
                  }
                }
                L6: {
                  if (nk.field_r == null) {
                    break L6;
                  } else {
                    if (null == nk.field_r[var9]) {
                      break L6;
                    } else {
                      var8 = var8 | nk.field_r[var9][var10_int];
                      break L6;
                    }
                  }
                }
                L7: {
                  if (null == il.field_b) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        }
        L8: {
          stackOut_24_0 = (nb) param1;
          stackIn_26_0 = stackOut_24_0;
          stackIn_25_0 = stackOut_24_0;
          if (ud.field_d != param1) {
            stackOut_26_0 = (nb) (Object) stackIn_26_0;
            stackOut_26_1 = 0;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            break L8;
          } else {
            stackOut_25_0 = (nb) (Object) stackIn_25_0;
            stackOut_25_1 = 1;
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            break L8;
          }
        }
        L9: {
          if (((nb) (Object) stackIn_27_0).a(stackIn_27_1 == 0, param2, 2, (4 * fe.field_g - -8) * param4, (2 + fe.field_g) * 2, 0)) {
            stackOut_29_0 = 0;
            stackIn_30_0 = stackOut_29_0;
            break L9;
          } else {
            stackOut_28_0 = 1;
            stackIn_30_0 = stackOut_28_0;
            break L9;
          }
        }
        var9 = stackIn_30_0;
        var10 = param1.field_Kb.field_I;
        var11 = null;
        var12 = (r) (Object) var10.g(-18110);
        L10: while (true) {
          if (var12 == null) {
            return;
          } else {
            L11: {
              var13 = 0;
              if (var12.field_I == null) {
                L12: {
                  var12.field_Ob = new ci(0L, hg.field_f);
                  var12.a((byte) 127, var12.field_Ob);
                  var12.field_Kb = new ci(0L, sk.field_v);
                  if (bo.field_c) {
                    var12.a((byte) 123, var12.field_Kb);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var12.field_Kb.field_fb = 2;
                var12.field_Xb = new ci(0L, qn.field_P);
                var12.a((byte) 123, var12.field_Xb);
                var12.h(0);
                var12.field_Gb = new ci(0L, jd.field_b);
                var12.a((byte) 125, var12.field_Gb);
                var12.field_Ub = new ci(0L, bo.field_b);
                var13 = 1;
                var12.a((byte) 124, var12.field_Ub);
                break L11;
              } else {
                break L11;
              }
            }
            L13: {
              var12.field_Ob.field_db = null;
              var14 = var12.field_Ob;
              var12.field_Ob.field_pb = 0;
              var14.field_M = 0;
              var12.field_Kb.field_db = null;
              var15 = var12.field_Kb;
              var12.field_Kb.field_pb = 0;
              var12.field_Gb.field_db = null;
              var15.field_M = 0;
              var12.field_Gb.field_pb = 0;
              var16 = var12.field_Gb;
              var12.field_Ub.field_db = null;
              var16.field_M = 0;
              var12.field_Ub.field_pb = 0;
              var17 = var12.field_Ub;
              var17.field_M = 0;
              var12.field_Xb.field_db = null;
              var12.field_Xb.field_pb = 0;
              var18 = var12.field_Xb;
              var18.field_M = 0;
              var12.field_M = param1.field_Kb.field_M;
              var19 = 0;
              var32 = var12.field_Lb;
              var20 = var32;
              var20 = var32;
              var21 = 72;
              if (param1 != ib.field_c) {
                break L13;
              } else {
                var21 += 42;
                break L13;
              }
            }
            L14: {
              var33 = lh.a(var12.field_Ob.field_xb, var32, var21);
              var20 = var33;
              var20 = var33;
              if (var33.equals((Object) (Object) var12.field_Lb)) {
                stackOut_42_0 = 0;
                stackIn_43_0 = stackOut_42_0;
                break L14;
              } else {
                stackOut_41_0 = 1;
                stackIn_43_0 = stackOut_41_0;
                break L14;
              }
            }
            L15: {
              var22 = stackIn_43_0;
              if (var12.field_Vb < 4) {
                if (0 >= var12.field_Vb) {
                  break L15;
                } else {
                  var20 = "<img=" + (-1 + var12.field_Vb) + ">" + var33;
                  break L15;
                }
              } else {
                var20 = "<img=" + (-4 + (var12.field_Vb + af.field_g)) + ">" + var33;
                break L15;
              }
            }
            L16: {
              var12.field_Ob.field_db = var20;
              if (!var12.l(1)) {
                L17: {
                  L18: {
                    L19: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5_int == 0) {
                        break L19;
                      } else {
                        if (!var12.field_Hb) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (var6 > var12.field_Pb) {
                      break L18;
                    } else {
                      if (var7 > var12.field_Jb) {
                        break L18;
                      } else {
                        if (0 < (~var12.field_Wb & var8)) {
                          break L18;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  var23_int = 8414771;
                  var24_int = 8421504;
                  break L17;
                }
                L20: {
                  var12.field_Ob.field_T = var24_int;
                  var12.field_Ob.field_P = var24_int;
                  var12.field_Ob.field_O = var24_int;
                  var12.field_Gb.field_ib = var23_int;
                  var12.field_Kb.field_ib = var23_int;
                  var12.field_Ob.field_ib = var23_int;
                  var12.field_Kb.field_T = var24_int;
                  var12.field_Kb.field_P = var24_int;
                  var12.field_Kb.field_O = var24_int;
                  var12.field_Gb.field_T = var24_int;
                  var12.field_Gb.field_P = var24_int;
                  var12.field_Gb.field_O = var24_int;
                  if (se.field_S != param1) {
                    if (var12.field_ac) {
                      var12.field_Ob.field_db = oc.a(se.field_U, new String[1], (byte) -68);
                      var12.field_Ub.field_db = ue.field_b;
                      break L20;
                    } else {
                      if (!var12.field_Qb) {
                        var12.field_Gb.field_db = ok.field_Eb;
                        break L20;
                      } else {
                        var12.field_Ob.field_db = oc.a(ak.field_x, new String[1], (byte) -110);
                        var12.field_Gb.field_db = sk.field_s;
                        var12.field_Ub.field_db = qm.field_e;
                        break L20;
                      }
                    }
                  } else {
                    if (pd.field_Rb.field_Vb) {
                      break L20;
                    } else {
                      var12.field_Ub.field_db = ag.field_c;
                      break L20;
                    }
                  }
                }
                L21: {
                  var25_int = 0;
                  if (pd.field_Rb == null) {
                    break L21;
                  } else {
                    if (!ci.f(-92)) {
                      break L21;
                    } else {
                      if (~var12.field_Yb != ~gb.field_t) {
                        L22: {
                          if (null == var12.field_Gb.field_db) {
                            break L22;
                          } else {
                            var26 = var12.field_Gb.e((byte) 113) + 2 * ri.field_g;
                            var12.field_Gb.a(var25_int, var26, -2147483648, fe.field_g, var19);
                            var25_int = var25_int + var26;
                            break L22;
                          }
                        }
                        if (var12.field_Ub.field_db == null) {
                          break L21;
                        } else {
                          L23: {
                            if (se.field_S == param1) {
                              var26 = 40;
                              break L23;
                            } else {
                              var26 = var12.field_Ub.e((byte) 39) - -(ri.field_g * 2);
                              break L23;
                            }
                          }
                          var12.field_Ub.a(var25_int, var26, -2147483648, fe.field_g, var19);
                          var25_int = var25_int + var26;
                          break L21;
                        }
                      } else {
                        break L21;
                      }
                    }
                  }
                }
                L24: {
                  stackOut_76_0 = var12.field_Ob;
                  stackOut_76_1 = var25_int;
                  stackOut_76_2 = var12.field_M;
                  stackIn_78_0 = stackOut_76_0;
                  stackIn_78_1 = stackOut_76_1;
                  stackIn_78_2 = stackOut_76_2;
                  stackIn_77_0 = stackOut_76_0;
                  stackIn_77_1 = stackOut_76_1;
                  stackIn_77_2 = stackOut_76_2;
                  if (!bo.field_c) {
                    stackOut_78_0 = (ci) (Object) stackIn_78_0;
                    stackOut_78_1 = stackIn_78_1;
                    stackOut_78_2 = stackIn_78_2;
                    stackOut_78_3 = 0;
                    stackIn_79_0 = stackOut_78_0;
                    stackIn_79_1 = stackOut_78_1;
                    stackIn_79_2 = stackOut_78_2;
                    stackIn_79_3 = stackOut_78_3;
                    break L24;
                  } else {
                    stackOut_77_0 = (ci) (Object) stackIn_77_0;
                    stackOut_77_1 = stackIn_77_1;
                    stackOut_77_2 = stackIn_77_2;
                    stackOut_77_3 = 42;
                    stackIn_79_0 = stackOut_77_0;
                    stackIn_79_1 = stackOut_77_1;
                    stackIn_79_2 = stackOut_77_2;
                    stackIn_79_3 = stackOut_77_3;
                    break L24;
                  }
                }
                L25: {
                  ((ci) (Object) stackIn_79_0).a(stackIn_79_1, stackIn_79_2 + -stackIn_79_3 + -var25_int, -2147483648, fe.field_g, var19);
                  var12.field_Kb.field_db = Integer.toString(var12.field_Pb);
                  var12.field_Kb.a(-40 + var12.field_M, 40, -2147483648, fe.field_g, var19);
                  var19 = var19 + fe.field_g;
                  if (!var12.field_Ob.field_F) {
                    break L25;
                  } else {
                    if (var22 == 0) {
                      break L25;
                    } else {
                      pc.field_Mb = var12.field_Lb;
                      if (p.field_m == null) {
                        break L16;
                      } else {
                        if (null == p.field_m[var12.field_Vb]) {
                          break L16;
                        } else {
                          pc.field_Mb = pc.field_Mb + " - " + p.field_m[var12.field_Vb];
                          break L16;
                        }
                      }
                    }
                  }
                }
                if (!var12.field_Ob.field_F) {
                  break L16;
                } else {
                  if (p.field_m == null) {
                    break L16;
                  } else {
                    if (p.field_m[var12.field_Vb] == null) {
                      break L16;
                    } else {
                      pc.field_Mb = p.field_m[var12.field_Vb];
                      break L16;
                    }
                  }
                }
              } else {
                break L16;
              }
            }
            L26: {
              var23 = of.a(var12.field_Mb, -26564, var20);
              var24 = var23;
              var30 = var24;
              var25 = var30;
              var24 = var23;
              if (var23 == null) {
                break L26;
              } else {
                var24_int = var12.field_Xb.field_xb.b(var23, var12.field_M - ri.field_g + -ri.field_g);
                var12.field_Xb.field_eb = var12.field_Sb * 256 / ig.field_g;
                var12.field_Xb.field_db = var23;
                var12.field_Xb.a(ri.field_g, -(ri.field_g * 2) + var12.field_M, -2147483648, fe.field_g * var24_int, var19);
                var19 = var19 + fe.field_g * var24_int;
                break L26;
              }
            }
            L27: {
              if (var9 == 0) {
                var12.field_N = var19 + -var12.field_pb;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (var13 == 0) {
                break L28;
              } else {
                param1.field_Kb.a(true, (ci) var11, 2, (ci) (Object) var12);
                break L28;
              }
            }
            L29: {
              if (var12.field_L == 0) {
                break L29;
              } else {
                if (var12.l(1)) {
                  break L29;
                } else {
                  if (var12.field_Gb.field_L == 0) {
                    if (0 == var12.field_Ub.field_L) {
                      int discarded$1 = 0;
                      da.a(var12, ag.field_f, 0, 0, re.field_m, param1);
                      break L29;
                    } else {
                      fd.a(11, -109, var12.field_Yb);
                      break L29;
                    }
                  } else {
                    ue.a(var12.field_Yb, 16581, 11);
                    break L29;
                  }
                }
              }
            }
            L30: {
              if (!var12.field_Db) {
                break L30;
              } else {
                if (!var12.l(1)) {
                  L31: {
                    var24 = null;
                    if (~var12.field_Yb != ~gb.field_t) {
                      L32: {
                        if (var5_int == 0) {
                          break L32;
                        } else {
                          if (!var12.field_Hb) {
                            var24 = oc.a(ib.field_b, new String[1], (byte) -78);
                            var30 = var24;
                            var25 = var30;
                            var24 = var25;
                            var30 = var24;
                            var25 = var30;
                            break L31;
                          } else {
                            break L32;
                          }
                        }
                      }
                      if (var12.field_Jb < var7) {
                        L33: {
                          var25_int = -var12.field_Jb + var7;
                          if (1 != var25_int) {
                            break L33;
                          } else {
                            var24 = oc.a(ln.field_bc, new String[1], (byte) -93);
                            break L33;
                          }
                        }
                        var24 = oc.a(tl.field_Eb, new String[2], (byte) -61);
                        break L31;
                      } else {
                        if (var6 <= var12.field_Pb) {
                          if (0 == (var8 & ~var12.field_Wb)) {
                            break L31;
                          } else {
                            var25_int = ie.a(var8 & var12.field_Wb, (byte) -59);
                            var24 = oc.a(jc.field_b, new String[1], (byte) -94);
                            if (-1 >= var25_int) {
                              break L31;
                            } else {
                              if (la.field_b == null) {
                                break L31;
                              } else {
                                if (var25_int > la.field_b.length) {
                                  break L31;
                                } else {
                                  if (la.field_b[-1 + var25_int] != null) {
                                    var24 = oc.a(la.field_b[var25_int - 1][2], new String[1], (byte) -71);
                                    break L31;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var24 = oc.a(wk.field_h, new String[2], (byte) -73);
                          break L31;
                        }
                      }
                    } else {
                      L34: {
                        if (var5_int == 0) {
                          break L34;
                        } else {
                          if (var12.field_Hb) {
                            break L34;
                          } else {
                            var24 = ja.field_e;
                            break L31;
                          }
                        }
                      }
                      if (var12.field_Jb >= var7) {
                        if (var12.field_Pb < var6) {
                          var24 = oc.a(of.field_b, new String[2], (byte) -124);
                          break L31;
                        } else {
                          if ((~var12.field_Wb & var8) != 0) {
                            var25_int = ie.a(var8 & ~var12.field_Wb, (byte) -59);
                            var24 = ob.field_x;
                            if (0 >= var25_int) {
                              break L31;
                            } else {
                              if (null == la.field_b) {
                                break L31;
                              } else {
                                if (la.field_b.length < var25_int) {
                                  break L31;
                                } else {
                                  if (la.field_b[-1 + var25_int] != null) {
                                    var24 = la.field_b[var25_int + -1][1];
                                    break L31;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                            }
                          } else {
                            break L31;
                          }
                        }
                      } else {
                        L35: {
                          var25_int = -var12.field_Jb + var7;
                          if (var25_int != 1) {
                            break L35;
                          } else {
                            var24 = qd.field_l;
                            break L35;
                          }
                        }
                        var24 = oc.a(hj.field_j, new String[2], (byte) -43);
                        break L31;
                      }
                    }
                  }
                  if (var24 != null) {
                    var34 = "<col=A00000>" + var24;
                    var30 = var34;
                    var25 = var30;
                    var24 = var25;
                    var30 = var34;
                    var25 = var30;
                    var25 = null;
                    var26 = 0;
                    var27_int = 0;
                    L36: while (true) {
                      if (qa.field_e <= var27_int) {
                        L37: {
                          L38: {
                            if (param1 != se.field_S) {
                              break L38;
                            } else {
                              if (!ci.f(-38)) {
                                break L38;
                              } else {
                                if (var26 != 0) {
                                  var24 = var34 + "<br>" + ca.field_f + var25;
                                  break L37;
                                } else {
                                  var24 = var34 + "<br>" + oc.a(uh.field_o, new String[1], (byte) -107);
                                  break L37;
                                }
                              }
                            }
                          }
                          if (var26 == 0) {
                            var24 = var34 + "<br>" + oc.a(ij.field_b, new String[1], (byte) -83);
                            break L37;
                          } else {
                            var24 = var34 + "<br>" + gg.field_l + var25;
                            break L37;
                          }
                        }
                        L39: {
                          if (se.field_S != param1) {
                            break L39;
                          } else {
                            if (!ci.f(-125)) {
                              var27 = pd.field_Rb.field_Gb;
                              var24 = var24 + "<br>" + oc.a(fc.field_b, new String[1], (byte) -53);
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                        }
                        pc.field_Mb = var24;
                        break L30;
                      } else {
                        L40: {
                          var28 = pd.field_Rb.field_sc[var27_int] & 255;
                          var29 = 0;
                          if (null == t.field_L) {
                            break L40;
                          } else {
                            if (null == t.field_L[var27_int]) {
                              break L40;
                            } else {
                              if (!t.field_L[var27_int][var28]) {
                                break L40;
                              } else {
                                if (var12.field_Hb) {
                                  break L40;
                                } else {
                                  var29 = 1;
                                  break L40;
                                }
                              }
                            }
                          }
                        }
                        L41: {
                          if (uj.field_k == null) {
                            break L41;
                          } else {
                            if (null != uj.field_k[var27_int]) {
                              L42: {
                                var30_int = uj.field_k[var27_int][var28];
                                if (0 == var30_int) {
                                  break L42;
                                } else {
                                  if (lf.field_U) {
                                    break L42;
                                  } else {
                                    if (var12.field_Hb) {
                                      break L42;
                                    } else {
                                      var29 = 1;
                                      break L42;
                                    }
                                  }
                                }
                              }
                              if (var30_int > var12.field_Pb) {
                                var29 = 1;
                                break L41;
                              } else {
                                break L41;
                              }
                            } else {
                              break L41;
                            }
                          }
                        }
                        L43: {
                          if (null == il.field_b) {
                            break L43;
                          } else {
                            if (il.field_b[var27_int] == null) {
                              break L43;
                            } else {
                              L44: {
                                var30_int = il.field_b[var27_int][var28];
                                if (var30_int == 0) {
                                  break L44;
                                } else {
                                  if (lf.field_U) {
                                    break L44;
                                  } else {
                                    if (var12.field_Hb) {
                                      break L44;
                                    } else {
                                      var29 = 1;
                                      break L44;
                                    }
                                  }
                                }
                              }
                              if (var12.field_Jb < var30_int) {
                                var29 = 1;
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                        L45: {
                          if (null == nk.field_r) {
                            break L45;
                          } else {
                            if (null != nk.field_r[var27_int]) {
                              if (-1 != (nk.field_r[var27_int][var28] & var12.field_Wb)) {
                                var29 = 1;
                                break L45;
                              } else {
                                break L45;
                              }
                            } else {
                              break L45;
                            }
                          }
                        }
                        L46: {
                          if (var29 != 0) {
                            var30 = "<col=A00000>" + td.field_n[var27_int] + "</col>";
                            var25 = var30;
                            var24 = var25;
                            var25 = var30;
                            if (var25 == null) {
                              var25 = var30;
                              var24 = var25;
                              var24 = var25;
                              break L46;
                            } else {
                              var25 = var25 + ", " + var30;
                              var26 = 1;
                              break L46;
                            }
                          } else {
                            break L46;
                          }
                        }
                        var27_int++;
                        continue L36;
                      }
                    }
                  } else {
                    break L30;
                  }
                } else {
                  var11 = (Object) (Object) var12;
                  var12 = (r) (Object) var10.a((byte) -126);
                  continue L10;
                }
              }
            }
            var11 = (Object) (Object) var12;
            var12 = (r) (Object) var10.a((byte) -126);
            continue L10;
          }
        }
    }

    private final void h(int param0) {
        int var2 = 7 % ((param0 - -8) / 57);
        int discarded$0 = 0;
        if (!this.i()) {
            return;
        }
        sf.a(-122, ((s) this).field_L.field_v);
    }

    final static boolean a(char param0) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_7_0 = 0;
        var5 = Chess.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (0 >= param0) {
                  break L2;
                } else {
                  if (param0 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 < 160) {
                  break L3;
                } else {
                  if (param0 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param0 == 0) {
                  break L4;
                } else {
                  var6 = jn.field_M;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var6.length <= var3) {
                      break L4;
                    } else {
                      var4 = var6[var3];
                      if (param0 == var4) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        var3++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2_ref, "s.N(" + param0 + 44 + 0 + 41);
        }
        return stackIn_18_0 != 0;
    }

    public s() {
        super(0, 0, 496, 0, (jm) null);
        ((s) this).field_L = new bg("", (rg) null, 12);
        hl var1 = new hl(rc.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, rb.field_b.field_C, -1, 2147483647, true);
        mf var2 = new mf(ce.field_c, (jm) (Object) var1, (rg) null);
        ((s) this).field_N = new fb(hg.field_a, (rg) null);
        ((s) this).field_P = new fb(ue.field_b, (rg) null);
        ((s) this).field_L.field_j = vc.field_a;
        ((s) this).field_L.a(-107, (vb) (Object) new uh((qn) (Object) ((s) this).field_L));
        ((s) this).field_N.field_H = false;
        ((s) this).field_N.field_n = (jm) (Object) new sf();
        ((s) this).field_P.field_n = (jm) (Object) new wj();
        ((s) this).field_L.field_n = (jm) (Object) new wc(10000536);
        int var3 = 20;
        int var4 = 4;
        var2.a(var3, 34, 50, 270, 20);
        int var5 = 200;
        var3 += 50;
        ((s) this).b(var2, 95);
        var3 = var3 + (this.a(170, (mf) (Object) ((s) this).field_L, (byte) -98, var3, ng.field_d, tk.field_c) - -5);
        ((s) this).field_N.a(var3, 34, 40, var5, 496 + -var5 >> 1);
        ((s) this).field_P.a(15 + var3, 34, 40, 60, 3 + var4);
        ((s) this).field_P.field_p = (rg) this;
        ((s) this).field_N.field_p = (rg) this;
        ((s) this).b((mf) (Object) ((s) this).field_N, 95);
        ((s) this).b((mf) (Object) ((s) this).field_P, 95);
        ((s) this).field_Q = new t((wl) this);
        ((s) this).field_Q.a(20, 34, 150, -60 + (-((s) this).field_L.field_y + -((s) this).field_L.field_u) + ((s) this).field_y, ((s) this).field_L.field_y + (((s) this).field_L.field_u + 60));
        ((s) this).b((mf) (Object) ((s) this).field_Q, 95);
        ((s) this).a(0, 34, var3 + (55 + var4), 496, 0);
    }

    public final void a(String param0, byte param1) {
        bg var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              var3 = ((s) this).field_L;
              var4 = param0;
              ((qn) (Object) var3).a(0, false, var4);
              if (param1 <= -119) {
                break L1;
              } else {
                var5 = null;
                ((s) this).a((String) null, (byte) 121);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("s.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    private final int a(int param0, mf param1, byte param2, int param3, String param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            int discarded$8 = 3;
            int discarded$9 = 35;
            int discarded$10 = 170;
            int discarded$11 = 70;
            stackOut_0_0 = this.a(param4, param5, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("s.L(").append(170).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(-98).append(44).append(70).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
