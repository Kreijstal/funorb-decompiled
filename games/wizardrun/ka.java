/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends uh {
    static ji field_l;
    static int field_i;
    private String field_k;
    static String field_g;
    static String field_h;
    private String field_j;

    final static void a(java.awt.Canvas param0, int param1) {
        String discarded$2 = null;
        RuntimeException var2 = null;
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
          L0: {
            L1: {
              mj.a((java.awt.Component) ((Object) param0), (byte) 96);
              ee.a((java.awt.Component) ((Object) param0), 6769);
              if (vc.field_K == null) {
                break L1;
              } else {
                vc.field_K.a((java.awt.Component) ((Object) param0), param1 ^ -8058);
                break L1;
              }
            }
            if (param1 == 8053) {
              break L0;
            } else {
              discarded$2 = ka.a(false, -94, false, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("ka.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param0) {
          L0: {
            if (param2) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 != 2) {
            L1: {
              ka.b(-47);
              if (param3) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return oi.field_e[var4];
          } else {
            L2: {
              if (param3) {
                var4++;
                break L2;
              } else {
                break L2;
              }
            }
            return oi.field_e[var4];
          }
        } else {
          L3: {
            var4 += 4;
            if (param2) {
              var4 += 2;
              break L3;
            } else {
              break L3;
            }
          }
          if (param1 == 2) {
            L4: {
              if (param3) {
                var4++;
                break L4;
              } else {
                break L4;
              }
            }
            return oi.field_e[var4];
          } else {
            L5: {
              ka.b(-47);
              if (param3) {
                var4++;
                break L5;
              } else {
                break L5;
              }
            }
            return oi.field_e[var4];
          }
        }
    }

    public static void b(int param0) {
        String discarded$2 = null;
        if (param0 > -24) {
          discarded$2 = ka.a(false, 106, false, false);
          field_h = null;
          field_l = null;
          field_g = null;
          return;
        } else {
          field_h = null;
          field_l = null;
          field_g = null;
          return;
        }
    }

    final sd a(boolean param0) {
        sd discarded$0 = null;
        if (!param0) {
            discarded$0 = this.a(true);
            return pc.field_v;
        }
        return pc.field_v;
    }

    final void a(int param0, va param1) {
        try {
            if (param0 != 4) {
                field_h = (String) null;
            }
            param1.b(0, this.field_k);
            param1.a(this.field_j, -66);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ka.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ka(String param0, String param1) {
        try {
            this.field_j = param1;
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "To Customer Support";
        field_g = "Press <%0> or SPACE";
    }
}
