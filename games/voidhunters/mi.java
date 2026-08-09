/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends rqa {
    static phb field_o;

    final static void a(kka param0, boolean param1, int param2, byte param3) {
        Object var4 = null;
        int var4_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          L0: {
            L1: {
              if (null != ew.field_p) {
                wo.a(1048576, param1, param2, true, param0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (null != aab.field_o) {
                var4_ref = flb.field_o;
                synchronized (var4_ref) {
                  L3: {
                    aab.field_o.b(param2, (byte) 18, -1);
                    if (param0 != dha.field_u) {
                      L4: {
                        aab.field_o.a(true);
                        flb.field_o.f();
                        dha.field_u = param0;
                        if (null == dha.field_u) {
                          break L4;
                        } else {
                          aab.field_o.a(param1, dha.field_u, -1);
                          break L4;
                        }
                      }
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            var4_int = 92 % ((param3 - 44) / 49);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4_ref2);

            stackIn_19_1 = new StringBuilder().append("mi.C(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void f(byte param0) {
        if (param0 > -90) {
            mi.e((byte) 79);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static void e(byte param0) {
        int var1;
        if (param0 != -81) {
          L0: {
            mi.f((byte) 52);
            if (-33 > (hlb.field_p ^ -1)) {
              L1: {
                var1 = hlb.field_p % 32;
                if (0 == var1) {
                  var1 = 32;
                  break L1;
                } else {
                  break L1;
                }
              }
              re.a(-var1 + hlb.field_p, (byte) -125);
              break L0;
            } else {
              re.a(0, (byte) -126);
              break L0;
            }
          }
          return;
        } else {
          L2: {
            if (-33 > (hlb.field_p ^ -1)) {
              L3: {
                var1 = hlb.field_p % 32;
                if (0 == var1) {
                  var1 = 32;
                  break L3;
                } else {
                  break L3;
                }
              }
              re.a(-var1 + hlb.field_p, (byte) -125);
              break L2;
            } else {
              re.a(0, (byte) -126);
              break L2;
            }
          }
          return;
        }
    }

    mi(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (phb) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(195, 121));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("mi.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
