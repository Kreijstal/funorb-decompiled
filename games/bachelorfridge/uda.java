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
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (null == ((uda) this).field_Y) {
          if (param0 >= -32) {
            return false;
          } else {
            return super.a(-118);
          }
        } else {
          if (pj.field_n == ((uda) this).field_Y) {
            int fieldTemp$2 = ((uda) this).field_Z + 1;
            ((uda) this).field_Z = ((uda) this).field_Z + 1;
            if (fieldTemp$2 == ((uda) this).field_W) {
              ((uda) this).field_Y = cp.field_b;
              ((uda) this).a(((uda) this).field_db, 26012, ((uda) this).field_T.field_q + 12 + ((uda) this).field_bb, 12 - -((uda) this).field_T.field_p);
              ((uda) this).field_S.field_F = 0;
              ((uda) this).field_Z = 0;
              if (param0 >= -32) {
                return false;
              } else {
                return super.a(-118);
              }
            } else {
              ((uda) this).field_S.field_F = -((((uda) this).field_Z << 8) / ((uda) this).field_W) + 256;
              if (param0 >= -32) {
                return false;
              } else {
                return super.a(-118);
              }
            }
          } else {
            if (((uda) this).field_Y == dha.field_b) {
              int fieldTemp$3 = ((uda) this).field_Z + 1;
              ((uda) this).field_Z = ((uda) this).field_Z + 1;
              if (((uda) this).field_V != fieldTemp$3) {
                ((uda) this).field_S.field_F = (((uda) this).field_Z << 8) / ((uda) this).field_V;
                if (param0 >= -32) {
                  return false;
                } else {
                  return super.a(-118);
                }
              } else {
                ((uda) this).field_Y = null;
                ((uda) this).field_S.field_F = 256;
                if (param0 >= -32) {
                  return false;
                } else {
                  return super.a(-118);
                }
              }
            } else {
              if (param0 >= -32) {
                return false;
              } else {
                return super.a(-118);
              }
            }
          }
        }
    }

    final boolean k(int param0) {
        if (param0 >= -59) {
            return true;
        }
        ((uda) this).m(17310);
        return super.k(-79);
    }

    final static void b(boolean param0, int param1, int param2, int param3) {
        qm.a(false, param0, param1, param2);
    }

    public static void n(int param0) {
        if (param0 <= 109) {
          uda.n(-52);
          field_U = null;
          field_X = null;
          field_cb = null;
          field_ab = null;
          field_eb = null;
          return;
        } else {
          field_U = null;
          field_X = null;
          field_cb = null;
          field_ab = null;
          field_eb = null;
          return;
        }
    }

    boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
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
              if (((uda) this).field_S != null) {
                L1: {
                  if (98 != param1) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((uda) this).field_S.a(param3, -101);
                    break L1;
                  }
                }
                L2: {
                  if (param1 != 99) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((uda) this).field_S.a(param3, -94);
                    break L2;
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("uda.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final void b(boolean param0) {
        Object var3 = null;
        if (pj.field_n != ((uda) this).field_Y) {
          ((uda) this).field_Y = dha.field_b;
          ((uda) this).field_Z = 0;
          if (param0) {
            var3 = null;
            ((uda) this).e((wj) null, 10);
            this.d(((uda) this).field_T, -15084);
            ((uda) this).field_S.field_F = 0;
            ((uda) this).field_T = null;
            return;
          } else {
            this.d(((uda) this).field_T, -15084);
            ((uda) this).field_S.field_F = 0;
            ((uda) this).field_T = null;
            return;
          }
        } else {
          return;
        }
    }

    uda(rp param0, wj param1, int param2, int param3, int param4) {
        super(param0, 12 - -param1.field_p, param1.field_q + (12 - -param2));
        try {
            ((uda) this).field_db = param4;
            ((uda) this).field_bb = param2;
            ((uda) this).field_V = param3;
            ((uda) this).field_W = param3;
            this.d(param1, -15084);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uda.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void d(wj param0, int param1) {
        try {
            if (null != ((uda) this).field_S) {
                ((uda) this).field_S.a(false);
            }
            if (param0 == null) {
                ((uda) this).field_S = new hl();
            } else {
                param0.a(6, param0.field_q, (byte) 59, param0.field_p, 6 - -((uda) this).field_bb);
                ((uda) this).field_S = new hl(param0);
            }
            ((uda) this).c((wj) (Object) ((uda) this).field_S, -11);
            ((uda) this).field_T = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uda.D(" + (param0 != null ? "{...}" : "null") + 44 + -15084 + 41);
        }
    }

    void e(wj param0, int param1) {
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
          ((uda) this).field_T = param0;
          if (param1 == 33) {
            if (((uda) this).field_Y == cp.field_b) {
              ((uda) this).a(((uda) this).field_db, 26012, ((uda) this).field_T.field_q + ((uda) this).field_bb + 12, 12 + ((uda) this).field_T.field_p);
              ((uda) this).field_Z = 0;
              return;
            } else {
              if (pj.field_n != ((uda) this).field_Y) {
                ((uda) this).field_Z = 0;
                ((uda) this).field_Y = pj.field_n;
                return;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("uda.C(");
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
              break L0;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final void m(int param0) {
        L0: {
          if (null != ((uda) this).field_Y) {
            L1: {
              if (((uda) this).field_Y != dha.field_b) {
                ((uda) this).b(-41, 12 + ((uda) this).field_bb + ((uda) this).field_T.field_q, 12 + ((uda) this).field_T.field_p);
                this.d(((uda) this).field_T, -15084);
                break L1;
              } else {
                break L1;
              }
            }
            ((uda) this).field_S.field_F = 256;
            ((uda) this).field_Y = null;
            break L0;
          } else {
            break L0;
          }
        }
        super.m(param0);
        if (param0 != 17310) {
          ((uda) this).b(false);
          return;
        } else {
          return;
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
