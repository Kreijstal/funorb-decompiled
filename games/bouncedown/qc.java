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
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref2 = null;
          try {
            try {
              var3 = new java.net.URL(param0.getCodeBase(), param2);
              var3 = ag.a(param0, var3, false);
              mg.a(true, param0, var3.toString(), true);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref2 = (Exception) (Object) decompiledCaughtException;
              var3_ref2.printStackTrace();
            }
            if (param1 == 24) {
              return;
            }
            qc.b(69);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref;
            stackIn_8_1 = new StringBuilder().append("qc.C(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
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
              gf.field_g.a((byte) 57, 0L);
              gf.field_g.a(0, jc.field_g.field_i, 24, jc.field_g.field_h);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              if (param0 == -17184) {
                jc.field_g.field_h = jc.field_g.field_h + 24;
                return;
              }
              field_a = (he) null;
              jc.field_g.field_h = jc.field_g.field_h + 24;
              return;
            }
          }
          if (param0 != -17184) {
            field_a = (he) null;
          }
          jc.field_g.field_h = jc.field_g.field_h + 24;
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
