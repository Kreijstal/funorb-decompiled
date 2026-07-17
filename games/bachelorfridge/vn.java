/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends lka implements mca {
    static int[] field_M;
    private int field_P;
    private qu field_N;

    final String c(byte param0) {
        if (((vn) this).field_t) {
          if (null != ((vn) this).field_h) {
            if (param0 != 16) {
              ((vn) this).field_P = 104;
              ha.a(gd.field_m, mk.field_p - (((vn) this).field_P + -((vn) this).field_p), false);
              return ((vn) this).field_h;
            } else {
              ha.a(gd.field_m, mk.field_p - (((vn) this).field_P + -((vn) this).field_p), false);
              return ((vn) this).field_h;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final qu a(int param0) {
        if (param0 != 16728128) {
            return null;
        }
        return ((vn) this).field_N;
    }

    final void i(byte param0) {
        if (param0 >= -87) {
          L0: {
            ((vn) this).field_N = null;
            super.i((byte) -111);
            if (((vn) this).field_N != null) {
              ((vn) this).field_N.a(574);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            super.i((byte) -111);
            if (((vn) this).field_N != null) {
              ((vn) this).field_N.a(574);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, wj param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((vn) this).field_P = mk.field_p - ((vn) this).field_s + -param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vn.O(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public static void k(int param0) {
        field_M = null;
        if (param0 != -9063) {
            Object var2 = null;
            boolean discarded$0 = vn.a((byte) -1, (CharSequence) null);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param0 >= 106) {
                break L1;
              } else {
                vn.k(-80);
                break L1;
              }
            }
            stackOut_2_0 = bf.a(10, -44, true, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("vn.JA(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, qu param1) {
        try {
            if (param0 != 7) {
                qu discarded$0 = ((vn) this).a(-10);
            }
            ((vn) this).field_N = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "vn.IA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -9938) {
          return 66;
        } else {
          L0: {
            var2 = 0;
            if (0 != (param1 & 7)) {
              var2 = 8 + -(param1 & 7);
              break L0;
            } else {
              break L0;
            }
          }
          var3 = param1 - -var2;
          return var3;
        }
    }

    vn(String param0, pl param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[]{16777215, 16728128, 16744448, 16776960};
    }
}
