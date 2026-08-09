/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ku extends qg {
    static int field_c;
    static String field_d;

    public static void a(byte param0) {
        field_d = null;
        if (param0 <= 105) {
            String var2 = (String) null;
            ku.a((String) null, 66, (rq) null, true, -92, (String) null, (String) null);
        }
    }

    final void a(boolean param0, int param1) {
        pib var4;
        if (param1 < 18) {
          var4 = (pib) null;
          this.a(-92, (byte) 78, (pib) null);
          this.field_b.c(32925, true);
          return;
        } else {
          this.field_b.c(32925, true);
          return;
        }
    }

    ku(qfa param0) {
        super(param0);
    }

    final void a(int param0, byte param1, pib param2) {
        try {
            this.field_b.a(80, param2);
            if (param1 != 125) {
                field_c = -10;
            }
            this.field_b.c(0, param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ku.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, int param1, rq param2, boolean param3, int param4, String param5, String param6) {
        sn var7 = null;
        RuntimeException var7_ref = null;
        String var8 = null;
        sn var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (dn.field_r == kla.field_d) {
              L1: {
                var9 = new sn(klb.field_r, param2);
                var7 = var9;
                klb.field_r.a(false, var9);
                if (ws.f(0)) {
                  var9.e(false);
                  break L1;
                } else {
                  L2: {
                    dn.field_r = dw.field_c;
                    bfa.field_p = param6;
                    mqb.field_x = param0;
                    iua.field_p = param1;
                    cjb.field_b = null;
                    tca.field_o = param5;
                    if (!param3) {
                      stackIn_7_0 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = 1;
                      break L2;
                    }
                  }
                  jpa.field_a = stackIn_7_0 != 0;
                  break L1;
                }
              }
              if (param4 == 1) {
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = (String) null;
                ku.a((String) null, 104, (rq) null, true, 77, (String) null, (String) null);
                return true;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("ku.D(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final void a(int param0) {
        this.field_b.c(32925, false);
        if (param0 != 5890) {
            String var3 = (String) null;
            ku.a((String) null, -94, (rq) null, true, -26, (String) null, (String) null);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != -25139) {
            this.a(true, true);
        }
    }

    final boolean b(int param0) {
        if (param0 > -87) {
            field_c = -126;
            return true;
        }
        return true;
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
            ku.a((byte) -82);
        }
    }

    static {
        field_c = 1;
    }
}
