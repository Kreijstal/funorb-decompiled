/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends ld {
    private int field_ab;
    private wh field_U;
    private int field_db;
    private int field_W;
    private rc field_S;
    private te field_V;
    static int field_T;
    private int field_eb;
    static ef field_Z;
    static String[] field_X;
    private int field_bb;
    static long field_Y;
    static o[] field_fb;
    static s field_cb;

    final boolean e(byte param0) {
        ((gf) this).e(true);
        if (param0 != 124) {
            return true;
        }
        return super.e((byte) 124);
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
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
            if (!super.a(param0, (byte) -117, param2, param3)) {
              L1: {
                if (null != ((gf) this).field_V) {
                  L2: {
                    if (param2 != 98) {
                      break L2;
                    } else {
                      boolean discarded$4 = ((gf) this).field_V.a(-1463, param3);
                      break L2;
                    }
                  }
                  if (99 != param2) {
                    break L1;
                  } else {
                    boolean discarded$5 = ((gf) this).field_V.a(-1463, param3);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              var5_int = 120 / ((param1 - 31) / 56);
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
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
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("gf.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    gf(i param0, rc param1, int param2, int param3, int param4) {
        super(param0, param1.field_t + 12, 12 - -param2 - -param1.field_x);
        try {
            ((gf) this).field_eb = param2;
            ((gf) this).field_W = param4;
            ((gf) this).field_db = param3;
            ((gf) this).field_ab = param3;
            this.b(param1, -16777);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "gf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void f(byte param0) {
        int var1 = 38;
        field_cb = null;
        field_X = null;
        field_Z = null;
        field_fb = null;
    }

    private final void b(rc param0, int param1) {
        if (!(((gf) this).field_V == null)) {
            ((gf) this).field_V.c(10);
        }
        if (param0 == null) {
            ((gf) this).field_V = new te();
        } else {
            param0.b(param0.field_x, param0.field_t, 6, 0, ((gf) this).field_eb + 6);
            ((gf) this).field_V = new te(param0);
        }
        ((gf) this).a((rc) (Object) ((gf) this).field_V, param1 + 22188);
        if (param1 != -16777) {
            return;
        }
        try {
            ((gf) this).field_S = null;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "gf.M(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void e(boolean param0) {
        if (((gf) this).field_U != null) {
          if (((gf) this).field_U == oa.field_j) {
            ((gf) this).field_V.field_H = 256;
            ((gf) this).field_U = null;
            super.e(param0);
            return;
          } else {
            ((gf) this).b(((gf) this).field_S.field_t + 12, -2038584927, ((gf) this).field_eb + 12 - -((gf) this).field_S.field_x);
            this.b(((gf) this).field_S, -16777);
            ((gf) this).field_V.field_H = 256;
            ((gf) this).field_U = null;
            super.e(param0);
            return;
          }
        } else {
          super.e(param0);
          return;
        }
    }

    void c(int param0, rc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -3399) {
                break L1;
              } else {
                field_T = -28;
                break L1;
              }
            }
            ((gf) this).field_S = param1;
            if (kc.field_I != ((gf) this).field_U) {
              if (((gf) this).field_U == ah.field_j) {
                break L0;
              } else {
                ((gf) this).field_U = ah.field_j;
                ((gf) this).field_bb = 0;
                return;
              }
            } else {
              ((gf) this).b(((gf) this).field_S.field_x + 12 - -((gf) this).field_eb, 0, ((gf) this).field_W, ((gf) this).field_S.field_t + 12);
              ((gf) this).field_bb = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("gf.NA(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final void l(int param0) {
        if (ah.field_j == ((gf) this).field_U) {
          return;
        } else {
          if (param0 != 7107) {
            return;
          } else {
            ((gf) this).field_U = oa.field_j;
            ((gf) this).field_bb = 0;
            this.b(((gf) this).field_S, param0 ^ -23116);
            ((gf) this).field_V.field_H = 0;
            ((gf) this).field_S = null;
            return;
          }
        }
    }

    boolean h(int param0) {
        int var3 = 0;
        Object var4 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 == 1784) {
          if (((gf) this).field_U != null) {
            if (((gf) this).field_U == ah.field_j) {
              int fieldTemp$5 = ((gf) this).field_bb + 1;
              ((gf) this).field_bb = ((gf) this).field_bb + 1;
              if (((gf) this).field_ab == fieldTemp$5) {
                ((gf) this).field_U = kc.field_I;
                ((gf) this).b(((gf) this).field_S.field_x + 12 - -((gf) this).field_eb, 0, ((gf) this).field_W, ((gf) this).field_S.field_t + 12);
                ((gf) this).field_bb = 0;
                ((gf) this).field_V.field_H = 0;
                return super.h(param0);
              } else {
                ((gf) this).field_V.field_H = -((((gf) this).field_bb << 8) / ((gf) this).field_ab) + 256;
                return super.h(param0);
              }
            } else {
              if (((gf) this).field_U == oa.field_j) {
                int fieldTemp$6 = ((gf) this).field_bb + 1;
                ((gf) this).field_bb = ((gf) this).field_bb + 1;
                if (fieldTemp$6 != ((gf) this).field_db) {
                  ((gf) this).field_V.field_H = (((gf) this).field_bb << 8) / ((gf) this).field_db;
                  return super.h(param0);
                } else {
                  ((gf) this).field_U = null;
                  ((gf) this).field_V.field_H = 256;
                  return super.h(param0);
                }
              } else {
                return super.h(param0);
              }
            }
          } else {
            return super.h(param0);
          }
        } else {
          var4 = null;
          boolean discarded$7 = ((gf) this).a('ﾴ', (byte) -22, -26, (rc) null);
          if (((gf) this).field_U != null) {
            if (((gf) this).field_U == ah.field_j) {
              int fieldTemp$8 = ((gf) this).field_bb + 1;
              ((gf) this).field_bb = ((gf) this).field_bb + 1;
              if (((gf) this).field_ab == fieldTemp$8) {
                ((gf) this).field_U = kc.field_I;
                ((gf) this).b(((gf) this).field_S.field_x + 12 - -((gf) this).field_eb, 0, ((gf) this).field_W, ((gf) this).field_S.field_t + 12);
                ((gf) this).field_bb = 0;
                ((gf) this).field_V.field_H = 0;
                return super.h(param0);
              } else {
                ((gf) this).field_V.field_H = -((((gf) this).field_bb << 8) / ((gf) this).field_ab) + 256;
                return super.h(param0);
              }
            } else {
              if (((gf) this).field_U == oa.field_j) {
                int fieldTemp$9 = ((gf) this).field_bb + 1;
                ((gf) this).field_bb = ((gf) this).field_bb + 1;
                if (fieldTemp$9 != ((gf) this).field_db) {
                  ((gf) this).field_V.field_H = (((gf) this).field_bb << 8) / ((gf) this).field_db;
                  return super.h(param0);
                } else {
                  ((gf) this).field_U = null;
                  ((gf) this).field_V.field_H = 256;
                  return super.h(param0);
                }
              } else {
                return super.h(param0);
              }
            }
          } else {
            return super.h(param0);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = new ef();
        field_X = new String[]{"All scores", "My scores", "Best each"};
    }
}
