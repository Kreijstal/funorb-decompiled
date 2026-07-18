/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends llb {
    static int field_Cb;
    llb field_Ib;
    boolean field_Lb;
    llb field_wb;
    String field_xb;
    long field_zb;
    int field_yb;
    int field_Db;
    String field_Hb;
    boolean field_Eb;
    llb field_Jb;
    boolean field_Fb;
    int field_Gb;
    long field_Kb;
    llb field_Nb;
    int field_Ab;
    int field_vb;
    int field_Bb;
    llb field_Mb;

    final boolean a(int param0, jk param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_7_0 = 0;
        boolean stackOut_4_0 = false;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_Fb) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            if (stackIn_3_0 != (((jk) this).field_Fb ? 1 : 0)) {
              if (param0 == 26344) {
                L2: {
                  if (param1.field_Eb) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  stackOut_12_0 = stackIn_12_0;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (((jk) this).field_Eb) {
                    stackOut_14_0 = stackIn_14_0;
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L3;
                  } else {
                    stackOut_13_0 = stackIn_13_0;
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L3;
                  }
                }
                if (stackIn_15_0 == stackIn_15_1) {
                  L4: {
                    if (((jk) this).field_Kb >= param1.field_Kb) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L4;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  stackOut_16_0 = ((jk) this).field_Eb;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                }
              } else {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            } else {
              stackOut_4_0 = ((jk) this).field_Fb;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("jk.C(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final boolean i(int param0) {
        int var2 = -19 / ((-46 - param0) / 57);
        return !((jk) this).c((byte) 97) ? true : false;
    }

    final void a(String param0, String param1, int param2) {
        CharSequence var6 = null;
        try {
            ((jk) this).field_xb = param0;
            ((jk) this).field_Hb = param1;
            if (param2 != -424) {
                Object var5 = null;
                boolean discarded$0 = ((jk) this).a(-116, (jk) null);
            }
            var6 = (CharSequence) (Object) ((jk) this).field_Hb;
            String discarded$1 = jwa.a(false, var6);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "jk.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    jk(String param0, String param1, long param2) {
        super(0L, (llb) null);
        CharSequence var6 = null;
        try {
            ((jk) this).field_zb = param2;
            ((jk) this).field_xb = param1;
            ((jk) this).field_Hb = param0;
            var6 = (CharSequence) (Object) ((jk) this).field_Hb;
            String discarded$0 = jwa.a(false, var6);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "jk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void h(int param0) {
        sp.field_p = ik.a(-21049);
    }

    static {
    }
}
