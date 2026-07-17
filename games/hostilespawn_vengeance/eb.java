/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static bd field_b;
    static sc field_c;
    static String field_d;
    static int field_a;
    static ug field_e;
    static String field_f;

    final static void a(fd param0, int param1, Object param2) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_d) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (50 <= var3_int) {
                    break L2;
                  } else {
                    if (null == param0.field_d.peekEvent()) {
                      break L2;
                    } else {
                      vj.a(1L, (byte) -49);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param1 == 1001) {
                        break L4;
                      } else {
                        field_f = null;
                        break L4;
                      }
                    }
                    if (param2 == null) {
                      break L3;
                    } else {
                      param0.field_d.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                      return;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  return;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("eb.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_b = null;
        if (param0 <= 53) {
          boolean discarded$2 = eb.a(88);
          field_d = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 13372) {
            field_c = null;
            if (!(-1 != jd.field_q)) {
                if (!(re.c((byte) 33, 1))) {
                    return false;
                }
                jd.field_q = sc.field_g.l(32270);
                sc.field_g.field_i = 0;
            }
            if (!(-2 != jd.field_q)) {
                if (!(re.c((byte) 33, 2))) {
                    return false;
                }
                jd.field_q = sc.field_g.e(8);
                sc.field_g.field_i = 0;
            }
            return re.c((byte) 33, jd.field_q);
        }
        if (!(-1 != jd.field_q)) {
            if (!(re.c((byte) 33, 1))) {
                return false;
            }
            jd.field_q = sc.field_g.l(32270);
            sc.field_g.field_i = 0;
        }
        if (!(-2 != jd.field_q)) {
            if (!(re.c((byte) 33, 2))) {
                return false;
            }
            jd.field_q = sc.field_g.e(8);
            sc.field_g.field_i = 0;
        }
        return re.c((byte) 33, jd.field_q);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = null;
        field_a = 5;
        field_f = "Become a member to get this expansion and...";
    }
}
