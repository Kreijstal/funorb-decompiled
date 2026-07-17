/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kla {
    static String[] field_a;

    final static void a(fia param0, byte param1, Object param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (null == param0.field_r) {
            return;
          } else {
            var3_int = 0;
            L0: while (true) {
              L1: {
                if (50 <= var3_int) {
                  break L1;
                } else {
                  if (param0.field_r.peekEvent() == null) {
                    break L1;
                  } else {
                    vja.a(0, 1L);
                    var3_int++;
                    continue L0;
                  }
                }
              }
              L2: {
                if (param1 > 45) {
                  break L2;
                } else {
                  var5 = null;
                  kla.a((fia) null, (byte) 44, (Object) null);
                  break L2;
                }
              }
              try {
                L3: {
                  if (param2 != null) {
                    param0.field_r.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                    break L3;
                  } else {
                    return;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                return;
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("kla.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final static void a(byte param0) {
        if (!(jf.field_r)) {
            throw new IllegalStateException();
        }
        if (!(null == ci.field_l)) {
            ci.field_l.i((byte) -108);
        }
        String var1 = ooa.a((byte) -107);
        vn.field_b = new jw(var1, (String) null, true, false, false);
        ej.field_a.c((ae) (Object) um.field_l, 84);
        um.field_l.a(68, (ae) (Object) vn.field_b);
        um.field_l.c(true);
    }

    final static void b(int param0) {
        if (wba.field_o != null) {
            wba.field_o.field_h = false;
            uu.b(12475, 0);
            return;
        }
        uu.b(12475, 0);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -9520) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"<%0> mysteriously dropped dead", "<%0> died of unnatural causes", "<%0> ate munchy crunchy chocolatey cocoa death"};
    }
}
