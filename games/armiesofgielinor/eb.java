/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static je field_a;
    static int field_b;
    static String field_e;
    static String field_d;
    static je field_c;

    final static void a(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (76 != param1) {
              L1: {
                if (!param0) {
                  L2: {
                    if (16 == param1) {
                      param1 = 78;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (25 != param1) {
                      break L3;
                    } else {
                      param1 = 79;
                      break L3;
                    }
                  }
                  L4: {
                    if (param1 != 48) {
                      break L4;
                    } else {
                      param1 = 80;
                      break L4;
                    }
                  }
                  if (param1 == 85) {
                    param1 = 89;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              var3_int = 1;
              L5: while (true) {
                if (var3_int >= mn.field_m[param1].length) {
                  break L0;
                } else {
                  mn.field_k[param1][var3_int] = null;
                  var3_int++;
                  continue L5;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "eb.A(" + param0 + ',' + param1 + ',' + true + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static int a(byte param0, int param1) {
        param1 = ((-1431655766 & param1) >>> 1) + (1431655765 & param1);
        param1 = (param1 & 858993459) - -((param1 & -858993458) >>> 2);
        param1 = 252645135 & (param1 >>> 4) + param1;
        if (param0 >= -70) {
            field_e = null;
            param1 = param1 + (param1 >>> 8);
            param1 = param1 + (param1 >>> 16);
            return param1 & 255;
        }
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return param1 & 255;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Send private message";
        field_e = "Month";
        field_b = 5;
    }
}
