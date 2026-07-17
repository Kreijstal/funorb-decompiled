/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends ci {
    static ci field_Tb;
    int field_Sb;
    static String field_Zb;
    static String field_Fb;
    static int field_Eb;
    ci field_Ob;
    long field_Yb;
    boolean field_Qb;
    static boolean field_bc;
    int field_Vb;
    int field_Jb;
    int field_Wb;
    ci field_Xb;
    String field_Lb;
    boolean field_Hb;
    int field_Mb;
    int field_Pb;
    String field_Rb;
    boolean field_ac;
    ci field_Gb;
    static dk field_Ib;
    ci field_Kb;
    ci field_Ub;
    long field_Nb;

    final boolean a(r param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_4_0 = false;
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
              stackOut_0_0 = param0.field_Qb;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (((r) this).field_Qb) {
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
            if ((stackIn_3_0 ? 1 : 0) != stackIn_3_1) {
              L2: {
                if (param1 == -343) {
                  break L2;
                } else {
                  var4 = null;
                  boolean discarded$2 = ((r) this).a((r) null, -42);
                  break L2;
                }
              }
              L3: {
                if (param0.field_ac) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              if (stackIn_11_0 == (((r) this).field_ac ? 1 : 0)) {
                stackOut_13_0 = ((r) this).field_ac;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0;
              } else {
                L4: {
                  if (((r) this).field_Nb >= param0.field_Nb) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                break L0;
              }
            } else {
              stackOut_4_0 = ((r) this).field_Qb;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("r.E(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final void a(int param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
            if (param0 != 1) {
                ((r) this).field_Gb = null;
            }
            ((r) this).field_Lb = param1;
            ((r) this).field_Rb = param2;
            var5 = (CharSequence) (Object) ((r) this).field_Rb;
            String discarded$0 = ad.a(var5, -2);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "r.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void k(int param0) {
        h var1 = null;
        if (param0 != 3029) {
          return;
        } else {
          L0: {
            var1 = (h) (Object) ni.field_c.c(101);
            if (var1 == null) {
              var1 = new h();
              break L0;
            } else {
              break L0;
            }
          }
          var1.a(wb.field_h, wb.field_c, 0, wb.field_d, wb.field_j, wb.field_i, wb.field_b, wb.field_a);
          tm.field_a.a((o) (Object) var1, (byte) -39);
          return;
        }
    }

    final static void a(int param0, byte param1, int param2, le param3) {
        RuntimeException var4 = null;
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
          o.field_f = param2;
          de.field_c = param3;
          bb.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("r.C(").append(param0).append(44).append(-87).append(44).append(param2).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    r(String param0, String param1, long param2) {
        super(0L, (ci) null);
        CharSequence var6 = null;
        try {
            ((r) this).field_Lb = param1;
            ((r) this).field_Rb = param0;
            ((r) this).field_Yb = param2;
            var6 = (CharSequence) (Object) ((r) this).field_Rb;
            String discarded$0 = ad.a(var6, -2);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "r.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final boolean l(int param0) {
        if (param0 != 1) {
            return true;
        }
        return !((r) this).e(-4) ? true : false;
    }

    public static void m() {
        field_Zb = null;
        int var1 = 28;
        field_Tb = null;
        field_Ib = null;
        field_Fb = null;
    }

    final static boolean a(boolean param0, nk param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (1 != param1.e(-63, 1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("r.D(").append(1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Zb = "Continue spectating";
        field_Fb = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
