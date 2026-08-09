/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static int field_c;
    static he field_a;
    static String field_b;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -78) {
            qc.b(112);
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            RuntimeException var3_ref = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var3_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var3 = new java.net.URL(param0.getCodeBase(), param2);
                    var3 = ag.a(param0, var3, false);
                    mg.a(true, param0, var3.toString(), true);
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var3_ref2 = (Exception) (Object) decompiledCaughtException;
                    var3_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (param1 == 24) {
                  break L0;
                } else {
                  qc.b(69);
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref);

                stackIn_8_1 = new StringBuilder().append("qc.C(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (null != gf.field_g) {
              try {
                L0: {
                  gf.field_g.a((byte) 57, 0L);
                  gf.field_g.a(0, jc.field_g.field_i, 24, jc.field_g.field_h);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                if (param0 != -17184) {
                  field_a = (he) null;
                  jc.field_g.field_h = jc.field_g.field_h + 24;
                  return;
                } else {
                  jc.field_g.field_h = jc.field_g.field_h + 24;
                  return;
                }
              }
              L1: {
                if (param0 == -17184) {
                  break L1;
                } else {
                  field_a = (he) null;
                  break L1;
                }
              }
              jc.field_g.field_h = jc.field_g.field_h + 24;
              return;
            } else {
              L2: {
                if (param0 == -17184) {
                  break L2;
                } else {
                  field_a = (he) null;
                  break L2;
                }
              }
              jc.field_g.field_h = jc.field_g.field_h + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
