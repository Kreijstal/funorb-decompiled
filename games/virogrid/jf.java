/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    int field_i;
    boolean field_h;
    boolean field_k;
    int field_e;
    boolean field_g;
    int field_f;
    static String[] field_b;
    static e field_n;
    static wg field_o;
    int field_a;
    static eh field_j;
    int field_c;
    boolean field_m;
    boolean field_d;
    static String field_l;

    jf() {
        this(3);
    }

    final static void a(boolean param0, eh param1, eh param2, eh param3, int param4) {
        try {
            w.field_I = oe.a("", false);
            w.field_I.a(false, 11358);
            cf.a(param2, param3, 60, param1);
            jg.b(461050508);
            cb.field_c = kh.field_e;
            pa.field_l = kh.field_e;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "jf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + -1 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (null != he.field_Wb) {
              L1: {
                if (param1.toLowerCase().indexOf(he.field_Wb.toLowerCase()) < 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("jf.A(").append(-96).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static vh a(byte[] param0, int param1) {
        vh var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          if (param0 != null) {
            var2 = new vh(param0, el.field_w, mb.field_bb, db.field_k, gb.field_F, k.field_c, lj.field_j);
            pe.b((byte) -28);
            return var2;
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("jf.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 20 + ')');
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_b = null;
        field_n = null;
        field_l = null;
        field_j = null;
    }

    jf(int param0) {
        int var2 = 0;
        var2 = param0;
        if (var2 == 0) {
          ((jf) this).field_h = false;
          ((jf) this).field_k = false;
          ((jf) this).field_g = false;
          ((jf) this).field_f = 0;
          ((jf) this).field_m = false;
          ((jf) this).field_e = -1;
          ((jf) this).field_d = true;
          return;
        } else {
          if (var2 == 1) {
            ((jf) this).field_e = -1;
            ((jf) this).field_g = false;
            ((jf) this).field_f = 0;
            ((jf) this).field_a = 20;
            ((jf) this).field_h = false;
            ((jf) this).field_c = 50;
            ((jf) this).field_k = false;
            ((jf) this).field_m = true;
            ((jf) this).field_i = 1;
            ((jf) this).field_d = true;
            return;
          } else {
            if (var2 == 2) {
              ((jf) this).field_f = 0;
              ((jf) this).field_e = -1;
              ((jf) this).field_g = true;
              ((jf) this).field_m = false;
              ((jf) this).field_h = false;
              ((jf) this).field_k = false;
              ((jf) this).field_d = true;
              return;
            } else {
              L0: {
                if (var2 != 3) {
                  break L0;
                } else {
                  ((jf) this).field_c = 50;
                  ((jf) this).field_k = true;
                  ((jf) this).field_h = false;
                  ((jf) this).field_f = 0;
                  ((jf) this).field_a = 20;
                  ((jf) this).field_g = true;
                  ((jf) this).field_m = false;
                  ((jf) this).field_d = true;
                  ((jf) this).field_e = -1;
                  ((jf) this).field_i = 1;
                  break L0;
                }
              }
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
