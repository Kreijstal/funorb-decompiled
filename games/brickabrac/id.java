/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends mh {
    static int field_Pb;
    long field_gc;
    String field_hc;
    boolean field_Qb;
    mh field_Tb;
    mh field_Rb;
    static String field_bc;
    long field_Xb;
    mh field_cc;
    boolean field_ec;
    int field_Wb;
    int field_kc;
    static String field_jc;
    mh field_Vb;
    int field_ac;
    int field_Zb;
    String field_Yb;
    boolean field_fc;
    static String field_Sb;
    int field_Ub;
    mh field_dc;
    int field_ic;

    public static void h(int param0) {
        int var1 = 0;
        field_jc = null;
        field_bc = null;
        field_Sb = null;
    }

    final void a(String param0, String param1, byte param2) {
        CharSequence var6 = null;
        try {
            ((id) this).field_hc = param1;
            if (param2 != -121) {
                Object var5 = null;
                boolean discarded$0 = ((id) this).a((id) null, -125);
            }
            ((id) this).field_Yb = param0;
            var6 = (CharSequence) (Object) ((id) this).field_hc;
            String discarded$1 = gb.a(var6, 116);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "id.B(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    id(String param0, String param1, long param2) {
        super(0L, (mh) null);
        CharSequence var6 = null;
        try {
            ((id) this).field_hc = param0;
            ((id) this).field_Yb = param1;
            ((id) this).field_gc = param2;
            var6 = (CharSequence) (Object) ((id) this).field_hc;
            String discarded$0 = gb.a(var6, 124);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "id.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static int[] a(fo param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = tf.field_g.length;
              if (lc.a(0, -107)) {
                break L1;
              } else {
                var2_int--;
                break L1;
              }
            }
            var3 = new int[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var3.length <= var4) {
                field_Sb = null;
                ke.a(var3, (byte) 39, param0);
                stackOut_6_0 = (int[]) var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3[var4] = var4;
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("id.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 0 + 41);
        }
        return stackIn_7_0;
    }

    final boolean i(int param0) {
        if (param0 != 0) {
            return false;
        }
        return !((id) this).c(2) ? true : false;
    }

    final boolean a(id param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_12_1 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
        boolean stackOut_11_0 = false;
        int stackOut_11_1 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_10_1 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = param0.field_fc;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (((id) this).field_fc) {
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
              stackOut_5_0 = ((id) this).field_fc;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              L2: {
                if (param1 == -755) {
                  break L2;
                } else {
                  var4 = null;
                  ((id) this).a((String) null, (String) null, (byte) -26);
                  break L2;
                }
              }
              L3: {
                stackOut_9_0 = ((id) this).field_Qb;
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (param0.field_Qb) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L3;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  break L3;
                }
              }
              if ((stackIn_12_0 ? 1 : 0) == stackIn_12_1) {
                stackOut_14_0 = ((id) this).field_Qb;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              } else {
                L4: {
                  if (((id) this).field_Xb >= param0.field_Xb) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("id.D(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
        return stackIn_19_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bc = "Try changing the '<%0>' setting.";
        field_Pb = 0;
        field_jc = "You can spectate this game";
        field_Sb = "Concluded";
    }
}
