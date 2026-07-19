/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static int field_a;
    static String field_b;

    final static int a(int param0, byte param1) {
        int var2 = 0;
        var2 = param0 >>> 919942305;
        var2 = var2 | var2 >>> 74094113;
        var2 = var2 | var2 >>> 1333931202;
        var2 = var2 | var2 >>> -1145977020;
        var2 = var2 | var2 >>> 1839161864;
        if (param1 != 79) {
          field_b = (String) null;
          var2 = var2 | var2 >>> -1502730896;
          return param0 & (var2 ^ -1);
        } else {
          var2 = var2 | var2 >>> -1502730896;
          return param0 & (var2 ^ -1);
        }
    }

    public static void a(byte param0) {
        if (param0 != -35) {
            field_a = 119;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 68 % ((9 - param0) / 62);
              if (param2 != we.field_M) {
                rh.field_O = new int[param2];
                var4 = 0;
                L2: while (true) {
                  if (param2 <= var4) {
                    rm.field_z = -1 + param2;
                    we.field_M = param2;
                    h.field_y = param2 * 32;
                    break L1;
                  } else {
                    rh.field_O[var4] = (var4 << 1134132076) / param2;
                    var4++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            if (aa.field_Vb != param1) {
              L3: {
                if (param1 == we.field_M) {
                  lf.field_y = rh.field_O;
                  break L3;
                } else {
                  lf.field_y = new int[param1];
                  var6 = 0;
                  var4 = var6;
                  L4: while (true) {
                    if (param1 <= var6) {
                      break L3;
                    } else {
                      lf.field_y[var6] = (var6 << 100997836) / param1;
                      var6++;
                      continue L4;
                    }
                  }
                }
              }
              aa.field_Vb = param1;
              fk.field_x = -1 + param1;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "ib.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Waiting for graphics";
        field_a = 100;
    }
}
