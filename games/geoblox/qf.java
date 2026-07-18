/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qf extends oe {
    private int field_db;
    private int field_ab;
    private el field_eb;
    private int field_fb;
    private int field_X;
    private hh field_Z;
    static int[] field_Y;
    static rf field_bb;
    private wj field_W;
    private int field_cb;

    final boolean h(int param0) {
        if (param0 != 229) {
            return false;
        }
        ((qf) this).b(true);
        return super.h(229);
    }

    qf(ng param0, el param1, int param2, int param3, int param4) {
        super(param0, param1.field_r + 12, 12 + param2 + param1.field_h);
        try {
            ((qf) this).field_db = param4;
            ((qf) this).field_ab = param2;
            ((qf) this).field_cb = param3;
            ((qf) this).field_fb = param3;
            this.b(-21102, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean f(int param0) {
        int var3 = 0;
        var3 = Geoblox.field_C;
        if (((qf) this).field_Z != null) {
          if (la.field_I != ((qf) this).field_Z) {
            if (qb.field_N == ((qf) this).field_Z) {
              int fieldTemp$2 = ((qf) this).field_X + 1;
              ((qf) this).field_X = ((qf) this).field_X + 1;
              if (((qf) this).field_cb != fieldTemp$2) {
                ((qf) this).field_W.field_D = (((qf) this).field_X << 8) / ((qf) this).field_cb;
                return super.f(-1);
              } else {
                ((qf) this).field_Z = null;
                ((qf) this).field_W.field_D = 256;
                return super.f(-1);
              }
            } else {
              return super.f(-1);
            }
          } else {
            int fieldTemp$3 = ((qf) this).field_X + 1;
            ((qf) this).field_X = ((qf) this).field_X + 1;
            if (fieldTemp$3 != ((qf) this).field_fb) {
              ((qf) this).field_W.field_D = 256 + -((((qf) this).field_X << 8) / ((qf) this).field_fb);
              return super.f(-1);
            } else {
              ((qf) this).field_Z = la.field_E;
              ((qf) this).a(12 + ((qf) this).field_ab + ((qf) this).field_eb.field_h, ((qf) this).field_eb.field_r + 12, -5269, ((qf) this).field_db);
              ((qf) this).field_X = 0;
              ((qf) this).field_W.field_D = 0;
              return super.f(-1);
            }
          }
        } else {
          return super.f(-1);
        }
    }

    public static void m(int param0) {
        if (param0 != 256) {
            return;
        }
        field_bb = null;
        field_Y = null;
    }

    final void k(int param0) {
        if (la.field_I != ((qf) this).field_Z) {
          if (param0 >= -20) {
            field_Y = null;
            ((qf) this).field_X = 0;
            ((qf) this).field_Z = qb.field_N;
            this.b(-21102, ((qf) this).field_eb);
            ((qf) this).field_eb = null;
            ((qf) this).field_W.field_D = 0;
            return;
          } else {
            ((qf) this).field_X = 0;
            ((qf) this).field_Z = qb.field_N;
            this.b(-21102, ((qf) this).field_eb);
            ((qf) this).field_eb = null;
            ((qf) this).field_W.field_D = 0;
            return;
          }
        } else {
          return;
        }
    }

    boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (((qf) this).field_W == null) {
                  break L1;
                } else {
                  L2: {
                    if (param0 != 98) {
                      break L2;
                    } else {
                      boolean discarded$4 = ((qf) this).field_W.a((byte) -92, param3);
                      break L2;
                    }
                  }
                  if (param0 != 99) {
                    break L1;
                  } else {
                    boolean discarded$5 = ((qf) this).field_W.a((byte) -99, param3);
                    return false;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("qf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void b(int param0, el param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (((qf) this).field_W != null) {
              ((qf) this).field_W.a(false);
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 == null) {
            ((qf) this).field_W = new wj();
            ((qf) this).b((byte) -123, (el) (Object) ((qf) this).field_W);
            ((qf) this).field_eb = null;
            return;
          } else {
            param1.a(param1.field_h, param1.field_r, (byte) -77, ((qf) this).field_ab + 6, 6);
            ((qf) this).field_W = new wj(param1);
            ((qf) this).b((byte) -123, (el) (Object) ((qf) this).field_W);
            ((qf) this).field_eb = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("qf.SB(").append(-21102).append(',');
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
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static ai a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        ai var9 = null;
        RuntimeException var9_ref = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var9 = new ai(22, 65513, param0, param5, param2, param8, param4);
          nf.field_j.a(-96, (hf) (Object) var9);
          bm.a(var9, 3, -127);
          return var9;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var9_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9_ref;
            stackOut_2_1 = new StringBuilder().append("qf.UB(").append(param0).append(',').append(22).append(',').append(param2).append(',').append(25134).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param4 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param5 + ',' + 65513 + ',' + 3 + ',' + param8 + ')');
        }
    }

    void b(el param0, int param1) {
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
              ((qf) this).field_eb = param0;
              if (la.field_E != ((qf) this).field_Z) {
                if (la.field_I == ((qf) this).field_Z) {
                  break L1;
                } else {
                  ((qf) this).field_Z = la.field_I;
                  ((qf) this).field_X = 0;
                  break L1;
                }
              } else {
                ((qf) this).a(((qf) this).field_ab + (12 - -((qf) this).field_eb.field_h), ((qf) this).field_eb.field_r + 12, -5269, ((qf) this).field_db);
                ((qf) this).field_X = 0;
                break L1;
              }
            }
            if (param1 < -10) {
              break L0;
            } else {
              ((qf) this).field_W = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("qf.PB(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void b(boolean param0) {
        if (null != ((qf) this).field_Z) {
          if (((qf) this).field_Z == qb.field_N) {
            ((qf) this).field_Z = null;
            ((qf) this).field_W.field_D = 256;
            super.b(param0);
            return;
          } else {
            ((qf) this).c(((qf) this).field_eb.field_h + (((qf) this).field_ab + 12), 106, ((qf) this).field_eb.field_r + 12);
            this.b(-21102, ((qf) this).field_eb);
            ((qf) this).field_Z = null;
            ((qf) this).field_W.field_D = 256;
            super.b(param0);
            return;
          }
        } else {
          super.b(param0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new int[8192];
    }
}
