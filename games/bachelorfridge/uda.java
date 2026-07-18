/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uda extends am {
    private int field_Z;
    static int[] field_X;
    static String[] field_cb;
    static String field_ab;
    private int field_W;
    private int field_V;
    private int field_db;
    static vr field_U;
    private hl field_S;
    private int field_bb;
    private kf field_Y;
    private wj field_T;
    static String field_eb;

    boolean a(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_29_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_28_0 = false;
        int stackOut_26_0 = 0;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (null == ((uda) this).field_Y) {
                break L1;
              } else {
                L2: {
                  if (pj.field_n == ((uda) this).field_Y) {
                    break L2;
                  } else {
                    if (((uda) this).field_Y == dha.field_b) {
                      L3: {
                        int fieldTemp$2 = ((uda) this).field_Z + 1;
                        ((uda) this).field_Z = ((uda) this).field_Z + 1;
                        if (~((uda) this).field_V != ~fieldTemp$2) {
                          break L3;
                        } else {
                          ((uda) this).field_Y = null;
                          ((uda) this).field_S.field_F = 256;
                          if (var3 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((uda) this).field_S.field_F = (((uda) this).field_Z << -74968056) / ((uda) this).field_V;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L4: {
                  int fieldTemp$3 = ((uda) this).field_Z + 1;
                  ((uda) this).field_Z = ((uda) this).field_Z + 1;
                  if (fieldTemp$3 == ((uda) this).field_W) {
                    break L4;
                  } else {
                    ((uda) this).field_S.field_F = -((((uda) this).field_Z << 1370402184) / ((uda) this).field_W) + 256;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                ((uda) this).field_Y = cp.field_b;
                ((uda) this).a(((uda) this).field_db, 26012, ((uda) this).field_T.field_q + 12 + ((uda) this).field_bb, 12 - -((uda) this).field_T.field_p);
                ((uda) this).field_S.field_F = 0;
                ((uda) this).field_Z = 0;
                break L1;
              }
            }
            if (param0 < -32) {
              stackOut_28_0 = super.a(-118);
              stackIn_29_0 = stackOut_28_0;
              break L0;
            } else {
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              return stackIn_27_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "uda.Q(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    final boolean k(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 < -59) {
              ((uda) this).m(17310);
              stackOut_3_0 = super.k(-79);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "uda.F(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void b(boolean param0, int param1, int param2, int param3) {
        if (param3 < 13) {
            return;
        }
        try {
            qm.a(false, param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uda.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void n(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 109) {
                break L1;
              } else {
                uda.n(-52);
                break L1;
              }
            }
            field_U = null;
            field_X = null;
            field_cb = null;
            field_ab = null;
            field_eb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "uda.B(" + param0 + ')');
        }
    }

    boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (((uda) this).field_S != null) {
                  L2: {
                    if (98 != param1) {
                      break L2;
                    } else {
                      boolean discarded$2 = ((uda) this).field_S.a(param3, -101);
                      break L2;
                    }
                  }
                  if (param1 != 99) {
                    break L1;
                  } else {
                    boolean discarded$3 = ((uda) this).field_S.a(param3, -94);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("uda.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (pj.field_n != ((uda) this).field_Y) {
              L1: {
                ((uda) this).field_Y = dha.field_b;
                ((uda) this).field_Z = 0;
                if (!param0) {
                  break L1;
                } else {
                  ((uda) this).e((wj) null, 10);
                  break L1;
                }
              }
              this.d(((uda) this).field_T, -15084);
              ((uda) this).field_S.field_F = 0;
              ((uda) this).field_T = null;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "uda.G(" + param0 + ')');
        }
    }

    uda(rp param0, wj param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_p, param1.field_q + (12 - -param2));
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
            ((uda) this).field_db = param4;
            ((uda) this).field_bb = param2;
            ((uda) this).field_V = param3;
            ((uda) this).field_W = param3;
            this.d(param1, -15084);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("uda.<init>(");
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
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void d(wj param0, int param1) {
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
              if (null == ((uda) this).field_S) {
                break L1;
              } else {
                ((uda) this).field_S.a(false);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != param0) {
                  break L3;
                } else {
                  ((uda) this).field_S = new hl();
                  if (BachelorFridge.field_y == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              param0.a(6, param0.field_q, (byte) 59, param0.field_p, 6 - -((uda) this).field_bb);
              ((uda) this).field_S = new hl(param0);
              break L2;
            }
            L4: {
              ((uda) this).c((wj) (Object) ((uda) this).field_S, param1 + 15073);
              if (param1 == -15084) {
                break L4;
              } else {
                ((uda) this).field_Z = -77;
                break L4;
              }
            }
            ((uda) this).field_T = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("uda.D(");
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
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
    }

    void e(wj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ((uda) this).field_T = param0;
            if (param1 == 33) {
              L1: {
                L2: {
                  if (((uda) this).field_Y == cp.field_b) {
                    break L2;
                  } else {
                    if (pj.field_n != ((uda) this).field_Y) {
                      ((uda) this).field_Z = 0;
                      ((uda) this).field_Y = pj.field_n;
                      if (BachelorFridge.field_y == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                ((uda) this).a(((uda) this).field_db, 26012, ((uda) this).field_T.field_q + ((uda) this).field_bb + 12, 12 + ((uda) this).field_T.field_p);
                ((uda) this).field_Z = 0;
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("uda.C(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final void m(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != ((uda) this).field_Y) {
                L2: {
                  if (((uda) this).field_Y != dha.field_b) {
                    ((uda) this).b(-41, 12 + ((uda) this).field_bb + ((uda) this).field_T.field_q, 12 + ((uda) this).field_T.field_p);
                    this.d(((uda) this).field_T, -15084);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((uda) this).field_S.field_F = 256;
                ((uda) this).field_Y = null;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              super.m(param0);
              if (param0 == 17310) {
                break L3;
              } else {
                ((uda) this).b(false);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "uda.N(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_ab = "Quit to website";
        field_eb = "Press F10 to open Quick Chat.";
    }
}
