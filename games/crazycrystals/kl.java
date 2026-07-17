/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends en {
    static int field_T;
    private String field_Q;
    static int[] field_S;
    private String field_Y;
    static int field_U;
    static int field_V;
    private boolean field_R;
    private boolean field_W;
    private co field_X;

    kl(ol param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((kl) this).field_Q = param1;
            if (((kl) this).field_Q != null) {
                var3_int = mo.field_m.b(((kl) this).field_Q, 260, mo.field_m.field_o);
                ((kl) this).a(var3_int + 150, (byte) 119, 300);
            }
            ((kl) this).field_X = new co(13, 50, 274, 30, 15, 2113632, 4210752);
            ((kl) this).field_X.field_H = true;
            ((kl) this).field_W = false;
            ((kl) this).field_R = false;
            ((kl) this).b((qm) (Object) ((kl) this).field_X, -121);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "kl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void h(byte param0) {
        field_S = null;
        if (param0 != -1) {
            field_T = 91;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            d.a(param1, (byte) 125, "");
            if (param0 != -1) {
                kl.h((byte) -111);
            }
            qe.a(0, param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "kl.T(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        mo.field_m.c(((kl) this).field_Y, (((kl) this).field_g >> 1) + param1, param2 + 103, 16777215, -1);
        if (param0 != 30) {
          L0: {
            ((kl) this).field_Y = null;
            if (null != ((kl) this).field_Q) {
              kh.f(param1 - -20, -7 + (120 + param2), 260, 8421504);
              int discarded$2 = mo.field_m.a(((kl) this).field_Q, param1 - -20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, mo.field_m.field_o);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != ((kl) this).field_Q) {
              kh.f(param1 - -20, -7 + (120 + param2), 260, 8421504);
              int discarded$3 = mo.field_m.a(((kl) this).field_Q, param1 - -20, 120 + (param2 + 8), 260, 100, 16777215, -1, 1, 0, mo.field_m.field_o);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, boolean param1, float param2, String param3) {
        RuntimeException runtimeException = null;
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
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
              if (((kl) this).field_R) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 == (param1 ? 1 : 0)) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!param1) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((kl) this).field_R = stackIn_8_1 != 0;
                if (((kl) this).field_R) {
                  ((kl) this).field_X.b((byte) -126, 4210752, 8405024);
                  ((kl) this).field_X.field_H = true;
                  break L2;
                } else {
                  ((kl) this).field_X.b((byte) 107, 4210752, 2113632);
                  if (!((kl) this).field_W) {
                    break L2;
                  } else {
                    ((kl) this).field_X.field_H = false;
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              ((kl) this).field_Y = param3;
              if (param0 == 8405024) {
                break L4;
              } else {
                kl.h((byte) 14);
                break L4;
              }
            }
            ((kl) this).field_X.field_A = (int)(param2 / 100.0f * 65536.0f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("kl.V(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw dn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final void i(byte param0) {
        ((kl) this).field_W = true;
        int var2 = -2 / ((param0 - -40) / 36);
        ((kl) this).field_X.field_H = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new int[]{0, 0, -1, 1};
    }
}
