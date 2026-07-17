/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gma {
    int field_b;
    short field_g;
    boolean field_f;
    boolean field_d;
    static si[] field_e;
    boolean field_a;
    static int[][] field_c;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
    }

    final static void a(boolean param0) {
        eha.c(false);
        uka.field_j = true;
        gfa.field_i = true;
        gja.field_m.f((byte) -66);
        uv.a(false, hla.field_r, false);
    }

    final static void b(int param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (null != vg.field_n) {
              try {
                L0: {
                  vg.field_n.a(0L, (byte) -108);
                  vg.field_n.a(-96, ig.field_m.field_g, ig.field_m.field_h, 24);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                if (param0 <= 44) {
                  return;
                } else {
                  ig.field_m.field_g = ig.field_m.field_g + 24;
                  return;
                }
              }
              if (param0 <= 44) {
                return;
              } else {
                ig.field_m.field_g = ig.field_m.field_g + 24;
                return;
              }
            } else {
              if (param0 <= 44) {
                return;
              } else {
                ig.field_m.field_g = ig.field_m.field_g + 24;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                  param0.getAppletContext().showDocument(ow.a(var2, (byte) -125, param0), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_5_0 = (RuntimeException) var2_ref2;
                stackOut_5_1 = new StringBuilder().append("gma.A(");
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
                  break L1;
                } else {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L1;
                }
              }
              throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new si[8];
    }
}
