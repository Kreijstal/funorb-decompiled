/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr extends sf {
    static String field_eb;
    private boolean field_ab;
    static String field_bb;
    private String field_cb;
    private rj field_Y;
    static String[][] field_W;
    static int field_Z;
    private boolean field_db;
    private String field_X;

    final static fo a(String param0, int param1) {
        RuntimeException var2 = null;
        fo stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        fo stackOut_2_0 = null;
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
              if (param1 == 4210752) {
                break L1;
              } else {
                field_bb = null;
                break L1;
              }
            }
            stackOut_2_0 = new fo(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("cr.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        bv.field_t.c(((cr) this).field_cb, (((cr) this).field_l >> 1) + param0, param2 - -103, 16777215, -1);
        if (null != ((cr) this).field_X) {
            qn.e(20 + param0, -7 + (120 + param2), 260, 8421504);
            int discarded$0 = bv.field_t.a(((cr) this).field_X, 20 + param0, param2 + 128, 260, 100, 16777215, -1, 1, 0, bv.field_t.field_H);
        }
    }

    public static void n(int param0) {
        field_eb = null;
        if (param0 != 260) {
          cr.n(-8);
          field_W = null;
          field_bb = null;
          return;
        } else {
          field_W = null;
          field_bb = null;
          return;
        }
    }

    final void a(float param0, int param1, boolean param2, String param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
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
            L1: {
              if (param1 == 30) {
                break L1;
              } else {
                var6 = null;
                fo discarded$2 = cr.a((String) null, -94);
                break L1;
              }
            }
            L2: {
              if (((cr) this).field_ab) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              stackOut_5_0 = stackIn_5_0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (param2) {
                stackOut_7_0 = stackIn_7_0;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L3;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 1;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                break L3;
              }
            }
            if (stackIn_8_0 != stackIn_8_1) {
              L4: {
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (!param2) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L4;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L4;
                }
              }
              L5: {
                ((cr) this).field_ab = stackIn_13_1 != 0;
                if (((cr) this).field_ab) {
                  ((cr) this).field_Y.c(4210752, 8405024, 27178);
                  ((cr) this).field_Y.field_R = true;
                  break L5;
                } else {
                  ((cr) this).field_Y.c(4210752, 2113632, 27178);
                  if (!((cr) this).field_db) {
                    break L5;
                  } else {
                    ((cr) this).field_Y.field_R = false;
                    break L5;
                  }
                }
              }
              ((cr) this).field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
              ((cr) this).field_cb = param3;
              break L0;
            } else {
              ((cr) this).field_Y.field_D = (int)(param0 / 100.0f * 65536.0f);
              ((cr) this).field_cb = param3;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("cr.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    cr(gk param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((cr) this).field_X = param1;
            if (((cr) this).field_X != null) {
                var3_int = bv.field_t.a(((cr) this).field_X, 260, bv.field_t.field_H);
                ((cr) this).a(300, (byte) 100, 150 - -var3_int);
            }
            ((cr) this).field_Y = new rj(13, 50, 274, 30, 15, 2113632, 4210752);
            ((cr) this).field_db = false;
            ((cr) this).field_ab = false;
            ((cr) this).field_Y.field_R = true;
            ((cr) this).a((byte) 10, (kb) (Object) ((cr) this).field_Y);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "cr.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void i(byte param0) {
        ((cr) this).field_db = true;
        ((cr) this).field_Y.field_R = false;
        if (param0 < 1) {
            ((cr) this).field_cb = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "<%0> / <%1> (+<%2>) - Victory in 1 turn";
        field_eb = "Waiting for extra data";
        field_W = new String[][]{new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[3], new String[1], new String[4], new String[4], new String[4], new String[4], new String[5], new String[5], new String[4], new String[4], new String[5], new String[10], new String[6], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[3], new String[1], new String[3], new String[3], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[5], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[4], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1]};
        field_Z = 0;
    }
}
