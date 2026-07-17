/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends mg {
    private String field_k;
    static double[] field_i;
    private String field_j;

    final wh a(int param0) {
        if (param0 != 0) {
            ((bq) this).field_j = null;
            return of.field_C;
        }
        return of.field_C;
    }

    public static void a(boolean param0) {
        field_i = null;
    }

    bq(String param0, String param1) {
        try {
            ((bq) this).field_j = param0;
            ((bq) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "bq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(ng param0, byte param1) {
        try {
            if (param1 < 94) {
                bq.a((byte) -15);
            }
            param0.a(((bq) this).field_j, (byte) -105);
            param0.a(-16614, ((bq) this).field_k);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "bq.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
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
              var4 = param0.getGraphics();
              dk.field_o.a(var4, param1, (byte) 126, param2);
              var4.dispose();
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L1: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref2;
            stackOut_5_1 = new StringBuilder().append("bq.E(");
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
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + 4 + 41);
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        we var1_ref = null;
        int var2 = 0;
        ca var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (lo.field_b != null) {
                ba.a(3, 43, lo.field_b);
                break L1;
              } else {
                break L1;
              }
            }
            L2: while (true) {
              var3 = (ca) (Object) so.field_h.c(0);
              if (var3 != null) {
                mb.a(var3, 4, 0);
                continue L2;
              } else {
                L3: while (true) {
                  var1_ref = (we) (Object) ec.field_l.c(0);
                  if (var1_ref == null) {
                    if (param0 == -12) {
                      break L0;
                    } else {
                      field_i = null;
                      return;
                    }
                  } else {
                    lj.a(5, var1_ref, param0 ^ 120);
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "bq.F(" + param0 + 41);
        }
    }

    static {
    }
}
