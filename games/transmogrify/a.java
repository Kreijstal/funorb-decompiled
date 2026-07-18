/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class a extends bi {
    private int field_X;
    private wk field_W;
    private qg field_V;
    static al field_S;
    private int field_ab;
    static int[] field_T;
    private int field_P;
    static int field_Q;
    private int field_U;
    private gl field_Z;
    static boolean field_bb;
    static ti field_R;
    private int field_Y;

    boolean m(int param0) {
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (null != ((a) this).field_W) {
          if (((a) this).field_W == uh.field_r) {
            int fieldTemp$2 = ((a) this).field_ab + 1;
            ((a) this).field_ab = ((a) this).field_ab + 1;
            if (fieldTemp$2 != ((a) this).field_P) {
              ((a) this).field_Z.field_A = -((((a) this).field_ab << 8) / ((a) this).field_P) + 256;
              ((a) this).p(-97);
              return super.m(0);
            } else {
              ((a) this).field_W = ij.field_d;
              ((a) this).a(0, 12 - -((a) this).field_V.field_l, ((a) this).field_V.field_h + 12 + ((a) this).field_U, ((a) this).field_Y);
              ((a) this).field_ab = 0;
              ((a) this).field_Z.field_A = 0;
              ((a) this).p(-97);
              return super.m(0);
            }
          } else {
            if (((a) this).field_W == hg.field_b) {
              int fieldTemp$3 = ((a) this).field_ab + 1;
              ((a) this).field_ab = ((a) this).field_ab + 1;
              if (((a) this).field_X == fieldTemp$3) {
                ((a) this).field_Z.field_A = 256;
                ((a) this).field_W = null;
                ((a) this).p(-97);
                return super.m(0);
              } else {
                ((a) this).field_Z.field_A = (((a) this).field_ab << 8) / ((a) this).field_X;
                ((a) this).p(-97);
                return super.m(0);
              }
            } else {
              ((a) this).p(-97);
              return super.m(0);
            }
          }
        } else {
          ((a) this).p(-97);
          return super.m(0);
        }
    }

    a(da param0, qg param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_l, param1.field_h + 12 - -param2);
        try {
            ((a) this).field_U = param2;
            ((a) this).field_X = param3;
            ((a) this).field_P = param3;
            ((a) this).field_Y = param4;
            this.a((byte) 97, param1);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "a.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0, qg param1) {
        if (!(null == ((a) this).field_Z)) {
            ((a) this).field_Z.c(5);
        }
        if (param0 < 68) {
            return;
        }
        try {
            if (param1 != null) {
                param1.a(28, 6 + ((a) this).field_U, 6, param1.field_l, param1.field_h);
                ((a) this).field_Z = new gl(param1);
            } else {
                ((a) this).field_Z = new gl();
            }
            ((a) this).a((qg) (Object) ((a) this).field_Z, (byte) -88);
            ((a) this).field_V = null;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "a.SB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(byte param0) {
        if (!(((a) this).field_W != uh.field_r)) {
            return;
        }
        ((a) this).field_ab = 0;
        ((a) this).field_W = hg.field_b;
        this.a((byte) 101, ((a) this).field_V);
        ((a) this).field_Z.field_A = 0;
        ((a) this).field_V = null;
        if (param0 != -2) {
            Object var3 = null;
            ((a) this).b(-120, (qg) null);
        }
    }

    final void p(int param0) {
        L0: {
          if (((a) this).field_W == null) {
            break L0;
          } else {
            L1: {
              if (hg.field_b != ((a) this).field_W) {
                ((a) this).a(12 - -((a) this).field_V.field_l, 12 - -((a) this).field_U - -((a) this).field_V.field_h, false);
                this.a((byte) 93, ((a) this).field_V);
                break L1;
              } else {
                break L1;
              }
            }
            ((a) this).field_W = null;
            ((a) this).field_Z.field_A = 256;
            break L0;
          }
        }
        if (param0 != 27830) {
          ((a) this).d((byte) 73);
          super.p(param0);
          return;
        } else {
          super.p(param0);
          return;
        }
    }

    final boolean a(byte param0) {
        ((a) this).p(param0 + 27927);
        if (param0 != -97) {
            return true;
        }
        return super.a((byte) -97);
    }

    void b(int param0, qg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            ((a) this).field_V = param1;
            var3_int = 115 % ((param0 - 34) / 54);
            if (ij.field_d != ((a) this).field_W) {
              if (uh.field_r == ((a) this).field_W) {
                break L0;
              } else {
                ((a) this).field_ab = 0;
                ((a) this).field_W = uh.field_r;
                return;
              }
            } else {
              ((a) this).a(0, 12 - -((a) this).field_V.field_l, ((a) this).field_U + (12 + ((a) this).field_V.field_h), ((a) this).field_Y);
              ((a) this).field_ab = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("a.RB(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        RuntimeException var2 = null;
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
          param1.removeKeyListener((java.awt.event.KeyListener) (Object) el.field_n);
          param1.removeFocusListener((java.awt.event.FocusListener) (Object) el.field_n);
          j.field_b = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("a.UB(").append(37).append(',');
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
          throw ch.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    public static void e() {
        field_T = null;
        field_S = null;
        field_R = null;
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
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
            if (!super.a(param0, param1, (byte) 122, param3)) {
              L1: {
                if (null == ((a) this).field_Z) {
                  break L1;
                } else {
                  L2: {
                    if (98 != param0) {
                      break L2;
                    } else {
                      boolean discarded$4 = ((a) this).field_Z.a(param1, -90);
                      break L2;
                    }
                  }
                  if (param0 == 99) {
                    boolean discarded$5 = ((a) this).field_Z.a(param1, -24);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var5_int = 0;
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
            stackOut_11_1 = new StringBuilder().append("a.K(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + 123 + ',' + param3 + ')');
        }
        return stackIn_10_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = 20;
        field_S = new al(2);
    }
}
