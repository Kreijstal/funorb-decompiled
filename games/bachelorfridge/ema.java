/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ema extends sna {
    int field_xb;
    String field_Hb;
    int field_Mb;
    sna field_Fb;
    int field_Kb;
    int field_Jb;
    boolean field_Ob;
    String field_Nb;
    sna field_Bb;
    int field_yb;
    sna field_Db;
    boolean field_wb;
    static String field_Lb;
    sna field_Ib;
    sna field_vb;
    int field_Gb;
    long field_Eb;
    boolean field_zb;
    long field_Cb;
    static String field_Ab;

    final boolean a(int param0, ema param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_15_0 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        boolean stackOut_17_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_Ob) {
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
              stackOut_3_0 = stackIn_3_0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (((ema) this).field_Ob) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            if (stackIn_6_0 != stackIn_6_1) {
              stackOut_8_0 = ((ema) this).field_Ob;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              L3: {
                if (param0 == 0) {
                  break L3;
                } else {
                  ((ema) this).field_Bb = null;
                  break L3;
                }
              }
              L4: {
                if (param1.field_wb) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              if (stackIn_15_0 == (((ema) this).field_wb ? 1 : 0)) {
                stackOut_17_0 = ((ema) this).field_wb;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0;
              } else {
                L5: {
                  if (~((ema) this).field_Cb <= ~param1.field_Cb) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L5;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("ema.B(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_22_0 != 0;
    }

    final boolean f(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 21) {
          L0: {
            ((ema) this).field_Eb = 8L;
            if (((ema) this).a(0)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ema) this).a(0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
            ema.f(56);
            field_Ab = null;
            field_Lb = null;
            return;
        }
        field_Ab = null;
        field_Lb = null;
    }

    ema(String param0, String param1, long param2) {
        super(0L, (sna) null);
        CharSequence var6 = null;
        try {
            ((ema) this).field_Eb = param2;
            ((ema) this).field_Hb = param0;
            ((ema) this).field_Nb = param1;
            var6 = (CharSequence) (Object) ((ema) this).field_Hb;
            String discarded$0 = fq.a(0, var6);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ema.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(String param0, int param1, String param2) {
        CharSequence var5 = null;
        try {
            ((ema) this).field_Nb = param2;
            ((ema) this).field_Hb = param0;
            var5 = (CharSequence) (Object) ((ema) this).field_Hb;
            String discarded$0 = fq.a(param1 + param1, var5);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ema.AA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "members-only content";
        field_Ab = "Loading...";
    }
}
