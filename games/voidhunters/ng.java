/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng implements dja {
    static String field_a;

    final static caa[] a(int param0, byte param1, int param2, asb param3) {
        int var4 = 0;
        if (!pa.a(param0, 2, param3, param2)) {
          return null;
        } else {
          var4 = -44 % ((param1 - 53) / 50);
          return ola.d((byte) -91);
        }
    }

    public final tv a(byte param0) {
        int var2 = 29 / ((-64 - param0) / 50);
        return (tv) (Object) new tw();
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        if (Math.max(param3, param5) >= Math.min(param7, param4)) {
          if (Math.max(param1, param9) >= Math.min(param6, param8)) {
            if (Math.max(param7, param4) >= Math.min(param3, param5)) {
              if (Math.max(param6, param8) >= Math.min(param1, param9)) {
                L0: {
                  param4 = param4 - param7;
                  param9 = param9 - param1;
                  param5 = param5 - param3;
                  param8 = param8 - param6;
                  param1 = param1 - param6;
                  param3 = param3 - param7;
                  var10 = -14 + Math.max(Math.max(vma.a(112, param3), vma.a(119, param5)), vma.a(112, param4));
                  if (var10 <= 0) {
                    break L0;
                  } else {
                    param5 = param5 >> var10;
                    param4 = param4 >> var10;
                    param3 = param3 >> var10;
                    break L0;
                  }
                }
                L1: {
                  var10 = -14 + Math.max(Math.max(vma.a(116, param1), vma.a(123, param9)), vma.a(111, param8));
                  if (0 >= var10) {
                    break L1;
                  } else {
                    param9 = param9 >> var10;
                    param1 = param1 >> var10;
                    param8 = param8 >> var10;
                    break L1;
                  }
                }
                if (param2 < 45) {
                  field_a = null;
                  return joa.a(param8, param5, param1, param4, param0, param9, param3, 0);
                } else {
                  return joa.a(param8, param5, param1, param4, param0, param9, param3, 0);
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            Object var2 = null;
            caa[] discarded$0 = ng.a(-49, (byte) -68, 33, (asb) null);
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            ng.a(true);
            return (tv[]) (Object) new tw[param1];
        }
        return (tv[]) (Object) new tw[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Activate scrambler pulse";
    }
}
