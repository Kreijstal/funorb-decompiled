/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends je {
    long field_Pb;
    String field_Yb;
    int field_Kb;
    static ru[] field_Mb;
    je field_dc;
    boolean field_Wb;
    je field_fc;
    boolean field_Zb;
    static String field_bc;
    int field_Qb;
    int field_Xb;
    String field_cc;
    static int field_Ib;
    int field_Sb;
    je field_ac;
    je field_ec;
    long field_Vb;
    int field_Rb;
    static je field_Lb;
    static String field_Jb;
    static int field_Nb;
    je field_Tb;
    int field_Ob;
    boolean field_Ub;

    final boolean k(int param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            var3 = null;
            boolean discarded$6 = ((of) this).a(-15, (of) null);
            if (((of) this).a((byte) -70)) {
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
            if (((of) this).a((byte) -70)) {
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

    final void a(byte param0, String param1, String param2) {
        RuntimeException runtimeException = null;
        CharSequence var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              ((of) this).field_Yb = param1;
              ((of) this).field_cc = param2;
              var5 = (CharSequence) (Object) ((of) this).field_cc;
              int discarded$6 = 0;
              String discarded$7 = k.a(var5);
              if (param0 == 53) {
                break L1;
              } else {
                of.e((byte) -11);
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
            stackOut_3_1 = new StringBuilder().append("of.D(").append(param0).append(44);
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    of(String param0, String param1, long param2) {
        super(0L, (je) null);
        CharSequence var6 = null;
        try {
            ((of) this).field_Pb = param2;
            ((of) this).field_cc = param0;
            ((of) this).field_Yb = param1;
            var6 = (CharSequence) (Object) ((of) this).field_cc;
            int discarded$0 = 0;
            String discarded$1 = k.a(var6);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "of.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final boolean a(int param0, of param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_15_0 = false;
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
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_12_0 = false;
        boolean stackOut_14_0 = false;
        int stackOut_14_1 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_13_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_16_0 = false;
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
              if (param0 == 9687) {
                break L1;
              } else {
                var4 = null;
                ((of) this).a((byte) 41, (String) null, (String) null);
                break L1;
              }
            }
            L2: {
              if (param1.field_Ub) {
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
              if (((of) this).field_Ub) {
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
              stackOut_10_0 = ((of) this).field_Ub;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            } else {
              L4: {
                stackOut_12_0 = param1.field_Wb;
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (((of) this).field_Wb) {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L4;
                } else {
                  stackOut_13_0 = stackIn_13_0;
                  stackOut_13_1 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L4;
                }
              }
              if ((stackIn_15_0 ? 1 : 0) != stackIn_15_1) {
                L5: {
                  if (((of) this).field_Vb >= param1.field_Vb) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L5;
                  } else {
                    stackOut_19_0 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    break L5;
                  }
                }
                break L0;
              } else {
                stackOut_16_0 = ((of) this).field_Wb;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("of.A(").append(param0).append(44);
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
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final static void d(byte param0) {
        Object var2 = null;
        vi.a(cd.field_e, 640, (String) null);
        if (param0 != -24) {
            of.d((byte) -75);
        }
    }

    public static void e(byte param0) {
        if (param0 != 20) {
            of.e((byte) 74);
            field_Jb = null;
            field_bc = null;
            field_Mb = null;
            field_Lb = null;
            return;
        }
        field_Jb = null;
        field_bc = null;
        field_Mb = null;
        field_Lb = null;
    }

    final static void a(ha param0, int param1, int param2, byte param3, int param4, int param5) {
        sl var9 = null;
        int var7 = 0;
        if (!(!nw.g(121))) {
            return;
        }
        try {
            var9 = new sl(param5, param4, param0, param1, param2 > 0 ? true : false);
            bu.field_b = var9;
            vl.field_n.h(32161, 80);
            vl.field_n.field_q = vl.field_n.field_q + 2;
            if (param3 != -80) {
                Object var8 = null;
                of.a((ha) null, -98, 73, (byte) 105, 55, -24);
            }
            var7 = vl.field_n.field_q;
            var9.a(0, (vh) (Object) vl.field_n);
            vl.field_n.f(0, vl.field_n.field_q - var7);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "of.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ib = -1;
        field_bc = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
