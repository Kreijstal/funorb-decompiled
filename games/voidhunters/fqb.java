/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fqb extends rqa {
    static String field_p;
    static String[] field_o;

    final static boolean a(int param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (hoa.a(param1, false)) {
            return true;
          } else {
            if (param0 == 16647) {
              if (param1 != 45) {
                if (160 != param1) {
                  if (param1 != 32) {
                    if (param1 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    fqb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static byte[] a(byte param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        fj var5 = null;
        byte[] var6 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if ((param3 ^ -1) >= -1) {
                var4 = param2;
                break L1;
              } else {
                var8 = new byte[param1];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (param1 <= var5_int) {
                    break L1;
                  } else {
                    var8[var5_int] = param2[var5_int + param3];
                    var5_int++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              var5 = new fj();
              var5.b((byte) -88);
              var5.a(var4, -7, (long)(8 * param1));
              var6 = new byte[64];
              if (param0 == 25) {
                break L3;
              } else {
                field_o = (String[]) null;
                break L3;
              }
            }
            var5.a(var6, 0, (byte) 89);
            stackIn_9_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("fqb.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != 27154) {
            field_p = (String) null;
        }
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
              si.a(87, 62, param0[0].a(89));
              if (param1 <= -119) {
                break L1;
              } else {
                field_o = (String[]) null;
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("fqb.A(");

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
        field_o = new String[3];
        field_p = "Cancel";
    }
}
