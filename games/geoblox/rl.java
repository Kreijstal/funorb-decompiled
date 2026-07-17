/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends oe {
    private String field_Y;
    static od field_W;
    private boolean field_ab;
    private boolean field_Z;
    private hl field_bb;
    private String field_X;

    rl(ng param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((rl) this).field_Y = param1;
            if (((rl) this).field_Y != null) {
                var3_int = hh.field_c.b(((rl) this).field_Y, 260, hh.field_c.field_o);
                ((rl) this).c(var3_int + 150, 103, 300);
            }
            ((rl) this).field_bb = new hl(13, 50, 274, 30, 15, 2113632, 4210752);
            ((rl) this).field_ab = false;
            ((rl) this).field_bb.field_C = true;
            ((rl) this).field_Z = false;
            ((rl) this).b((byte) -98, (el) (Object) ((rl) this).field_bb);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "rl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static cg a(int param0, ia param1, int param2) {
        RuntimeException var3 = null;
        cg stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        cg stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1000) {
                break L1;
              } else {
                boolean discarded$2 = rl.n(-33);
                break L1;
              }
            }
            stackOut_2_0 = new cg(param1, param0 * qk.field_j / 1000);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("rl.E(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean n(int param0) {
        if (param0 != -1071908447) {
            return false;
        }
        return tf.field_d == si.field_g ? true : false;
    }

    final void m(int param0) {
        ((rl) this).field_bb.field_C = false;
        ((rl) this).field_ab = true;
        if (param0 != 23181) {
            Object var3 = null;
            cg discarded$0 = rl.a(9, (ia) null, 122);
        }
    }

    final static void a(int param0, int param1, ph param2) {
        pk var3 = null;
        RuntimeException var3_ref = null;
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
          var3 = fj.field_q;
          var3.a(param0, (byte) -85);
          var3.d((byte) 123, param2.field_f);
          var3.e(param2.field_h, 28695);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("rl.G(").append(param0).append(44).append(534).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    public static void h() {
        field_W = null;
    }

    final void a(boolean param0, String param1, int param2, float param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var5_int = -51 / ((param2 - 86) / 32);
              stackOut_0_0 = param0;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (((rl) this).field_Z) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
              L2: {
                stackOut_5_0 = this;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (!param0) {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L2;
                } else {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L2;
                }
              }
              L3: {
                ((rl) this).field_Z = stackIn_8_1 != 0;
                if (!((rl) this).field_Z) {
                  ((rl) this).field_bb.a(4210752, 2113632, (byte) -103);
                  if (((rl) this).field_ab) {
                    ((rl) this).field_bb.field_C = false;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  ((rl) this).field_bb.a(4210752, 8405024, (byte) -103);
                  ((rl) this).field_bb.field_C = true;
                  break L3;
                }
              }
              ((rl) this).field_X = param1;
              ((rl) this).field_bb.field_x = (int)(65536.0f * (param3 / 100.0f));
              break L0;
            } else {
              ((rl) this).field_X = param1;
              ((rl) this).field_bb.field_x = (int)(65536.0f * (param3 / 100.0f));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("rl.C(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        hh.field_c.b(((rl) this).field_X, (((rl) this).field_r >> 1) + param0, param2 - -103, 16777215, -1);
        if (((rl) this).field_Y != null) {
            vb.c(20 + param0, -7 + param2 - -120, 260, 8421504);
            int discarded$0 = hh.field_c.a(((rl) this).field_Y, param0 - -20, 8 + (120 + param2), 260, 100, 16777215, -1, 1, 0, hh.field_c.field_o);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new od("usename");
    }
}
