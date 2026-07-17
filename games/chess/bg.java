/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends qn implements ee {
    private int field_bb;
    static boolean field_ab;
    static km field_Z;
    private vb field_Y;
    static String[] field_cb;

    final String g(int param0) {
        if (((bg) this).field_w) {
          if (null != ((bg) this).field_j) {
            sb.d(33, rf.field_b, -((bg) this).field_bb - -((bg) this).field_y + hn.field_k);
            if (param0 != 0) {
              return null;
            } else {
              return ((bg) this).field_j;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final vb a(int param0) {
        if (param0 >= -80) {
            field_ab = false;
            return ((bg) this).field_Y;
        }
        return ((bg) this).field_Y;
    }

    final void g(byte param0) {
        super.g(param0);
        if (null != ((bg) this).field_Y) {
            ((bg) this).field_Y.b(true);
        }
    }

    final void a(int param0, vb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((bg) this).field_Y = param1;
              if (param0 < -63) {
                break L1;
              } else {
                field_ab = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bg.BA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void n(int param0) {
        field_cb = null;
        field_Z = null;
    }

    final void a(int param0, int param1, mf param2, int param3) {
        try {
            if (param1 >= -6) {
                field_cb = null;
            }
            super.a(param0, -30, param2, param3);
            ((bg) this).field_bb = -param0 + (-((bg) this).field_u + hn.field_k);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "bg.G(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    bg(String param0, rg param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
