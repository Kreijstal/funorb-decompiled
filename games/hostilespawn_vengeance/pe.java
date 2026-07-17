/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends wb {
    static String field_gb;
    private boolean field_jb;
    private String field_cb;
    static ji field_ab;
    private String field_bb;
    static bd field_hb;
    static char[] field_db;
    static bd[] field_fb;
    private boolean field_kb;
    private ba field_ib;
    static vm field_eb;

    final void f(byte param0) {
        ((pe) this).field_kb = true;
        ((pe) this).field_ib.field_E = false;
        if (param0 > -71) {
            field_db = null;
        }
    }

    final static void b() {
        Object var2 = null;
        ak.a(false, (String) null, fj.field_Sb);
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        field_eb.b(((pe) this).field_bb, (((pe) this).field_s >> 1) + param2, 103 + param0, 16777215, -1);
        if (!(null == ((pe) this).field_cb)) {
            si.a(param2 + 20, -7 + (120 + param0), 260, 8421504);
            int discarded$0 = field_eb.a(((pe) this).field_cb, param2 - -20, param0 - -128, 260, 100, 16777215, -1, 1, 0, field_eb.field_y);
        }
    }

    final void a(float param0, boolean param1, int param2, String param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
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
            L1: {
              if (((pe) this).field_jb == param1) {
                break L1;
              } else {
                L2: {
                  stackOut_1_0 = this;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (!param1) {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    break L2;
                  } else {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    break L2;
                  }
                }
                ((pe) this).field_jb = stackIn_4_1 != 0;
                if (!((pe) this).field_jb) {
                  ((pe) this).field_ib.a(2113632, 4210752, -1);
                  if (((pe) this).field_kb) {
                    ((pe) this).field_ib.field_E = false;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((pe) this).field_ib.a(8405024, 4210752, -1);
                  ((pe) this).field_ib.field_E = true;
                  break L1;
                }
              }
            }
            ((pe) this).field_ib.field_G = (int)(65536.0f * (param0 / 100.0f));
            ((pe) this).field_bb = param3;
            if (param2 > 126) {
              break L0;
            } else {
              ((pe) this).b(-60, -80, 35);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("pe.DA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final static fa[] p() {
        return new fa[]{ub.field_b, wh.field_c, w.field_S};
    }

    final static void a() {
        en var2 = s.field_b;
        var2.i(19319, 6);
        var2.d(96, 1);
        var2.d(125, 0);
    }

    pe(gg param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((pe) this).field_cb = param1;
            if (null != ((pe) this).field_cb) {
                var3_int = field_eb.b(((pe) this).field_cb, 260, field_eb.field_y);
                ((pe) this).a(300, 15767, var3_int + 150);
            }
            ((pe) this).field_ib = new ba(13, 50, 274, 30, 15, 2113632, 4210752);
            ((pe) this).field_kb = false;
            ((pe) this).field_jb = false;
            ((pe) this).field_ib.field_E = true;
            ((pe) this).a(51448, (ag) (Object) ((pe) this).field_ib);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "pe.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void q(int param0) {
        field_eb = null;
        field_db = null;
        if (param0 != 8421504) {
          pe.q(-49);
          field_hb = null;
          field_ab = null;
          field_gb = null;
          field_fb = null;
          return;
        } else {
          field_hb = null;
          field_ab = null;
          field_gb = null;
          field_fb = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "Play free version";
        field_db = new char[128];
    }
}
