/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends pn {
    private String field_W;
    static boolean field_T;
    private String field_X;
    static String field_bb;
    static String field_Z;
    private boolean field_U;
    private boolean field_ab;
    private hb field_V;
    static ZombieDawn field_Y;

    final void a(int param0, int param1, byte param2) {
        if (param2 <= -111) {
          super.a(param0, param1, (byte) -121);
          rk.field_b.a(((sa) this).field_W, param0 - -(((sa) this).field_i >> 1), 103 + param1, 16777215, -1);
          if (((sa) this).field_X != null) {
            bi.b(param0 + 20, -7 + (param1 - -120), 260, 8421504);
            int discarded$2 = rk.field_b.a(((sa) this).field_X, 20 + param0, 8 + (120 + param1), 260, 100, 16777215, -1, 1, 0, rk.field_b.field_I);
            return;
          } else {
            return;
          }
        } else {
          ((sa) this).m(-92);
          super.a(param0, param1, (byte) -121);
          rk.field_b.a(((sa) this).field_W, param0 - -(((sa) this).field_i >> 1), 103 + param1, 16777215, -1);
          if (((sa) this).field_X == null) {
            return;
          } else {
            bi.b(param0 + 20, -7 + (param1 - -120), 260, 8421504);
            int discarded$3 = rk.field_b.a(((sa) this).field_X, 20 + param0, 8 + (120 + param1), 260, 100, 16777215, -1, 1, 0, rk.field_b.field_I);
            return;
          }
        }
    }

    final static int a(CharSequence param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
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
        try {
          L0: {
            var3_int = 61 % ((param1 - 51) / 40);
            stackOut_0_0 = tf.a(true, 5, param0, 16);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("sa.J(");
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
          throw sh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + 16 + 41);
        }
        return stackIn_1_0;
    }

    final void a(boolean param0, float param1, byte param2, String param3) {
        RuntimeException var5 = null;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -60) {
                break L1;
              } else {
                field_Y = null;
                break L1;
              }
            }
            L2: {
              stackOut_2_0 = param0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (((sa) this).field_ab) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L2;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L2;
              }
            }
            L3: {
              if ((stackIn_5_0 ? 1 : 0) != stackIn_5_1) {
                break L3;
              } else {
                L4: {
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (!param0) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L4;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L4;
                  }
                }
                ((sa) this).field_ab = stackIn_9_1 != 0;
                if (((sa) this).field_ab) {
                  ((sa) this).field_V.c(-16, 4210752, 8405024);
                  ((sa) this).field_V.field_F = true;
                  break L3;
                } else {
                  ((sa) this).field_V.c(-51, 4210752, 2113632);
                  if (((sa) this).field_U) {
                    ((sa) this).field_V.field_F = false;
                    break L3;
                  } else {
                    ((sa) this).field_V.field_C = (int)(param1 / 100.0f * 65536.0f);
                    ((sa) this).field_W = param3;
                    return;
                  }
                }
              }
            }
            ((sa) this).field_V.field_C = (int)(param1 / 100.0f * 65536.0f);
            ((sa) this).field_W = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("sa.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    sa(dn param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((sa) this).field_X = param1;
            if (((sa) this).field_X != null) {
                var3_int = rk.field_b.b(((sa) this).field_X, 260, rk.field_b.field_I);
                ((sa) this).a((byte) 94, var3_int + 150, 300);
            }
            ((sa) this).field_V = new hb(13, 50, 274, 30, 15, 2113632, 4210752);
            ((sa) this).field_V.field_F = true;
            ((sa) this).field_U = false;
            ((sa) this).field_ab = false;
            ((sa) this).a((ga) (Object) ((sa) this).field_V, 10);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "sa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void g(byte param0) {
        field_bb = null;
        field_Y = null;
        if (param0 != 88) {
            sa.g((byte) 102);
            field_Z = null;
            return;
        }
        field_Z = null;
    }

    final void m(int param0) {
        ((sa) this).field_U = true;
        if (param0 != -31361) {
            field_T = false;
            ((sa) this).field_V.field_F = false;
            return;
        }
        ((sa) this).field_V.field_F = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = false;
        field_Z = "Please enter your age in years";
        field_bb = "Zombies across: ";
    }
}
