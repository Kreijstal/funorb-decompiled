/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static ri field_c;
    static aj field_b;
    static String field_d;
    static qb[] field_e;
    static boolean field_a;

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, byte param6, byte[] param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        var10 = -(param8 >> 1568366722);
        param8 = -(3 & param8);
        if (param3 == 6725) {
          var11 = -param9;
          L0: while (true) {
            if (var11 >= 0) {
              return;
            } else {
              var12 = var10;
              L1: while (true) {
                if (-1 >= (var12 ^ -1)) {
                  var12 = param8;
                  L2: while (true) {
                    if (var12 >= 0) {
                      param0 = param0 + param2;
                      param4 = param4 + param5;
                      var11++;
                      continue L0;
                    } else {
                      param4++;
                      if (param1[param4] == 0) {
                        param0++;
                        var12++;
                        continue L2;
                      } else {
                        param0++;
                        param7[param0] = (byte)param6;
                        var12++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  L3: {
                    param4++;
                    if (param1[param4] != 0) {
                      param0++;
                      param7[param0] = (byte)param6;
                      break L3;
                    } else {
                      param0++;
                      break L3;
                    }
                  }
                  L4: {
                    param4++;
                    if (0 != param1[param4]) {
                      param0++;
                      param7[param0] = (byte)param6;
                      break L4;
                    } else {
                      param0++;
                      break L4;
                    }
                  }
                  L5: {
                    param4++;
                    if (-1 == (param1[param4] ^ -1)) {
                      param0++;
                      break L5;
                    } else {
                      param0++;
                      param7[param0] = (byte)param6;
                      break L5;
                    }
                  }
                  param4++;
                  if (param1[param4] == 0) {
                    param0++;
                    var12++;
                    continue L1;
                  } else {
                    param0++;
                    param7[param0] = (byte)param6;
                    var12++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, kc param1) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        kc var4 = (kc) (Object) param1.field_G.b(12623);
        if (param0 >= -60) {
            return;
        }
        while (var4 != null) {
            var4.field_db = 0;
            var4.field_I = 0;
            var4.field_bb = 0;
            var4.field_B = 0;
            var4 = (kc) (Object) param1.field_G.a(0);
        }
        param1.field_I = 0;
        param1.field_bb = 0;
        param1.field_db = 0;
        param1.field_B = 0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != -71) {
            field_e = null;
        }
        field_c = null;
        field_e = null;
    }

    final static boolean a(int param0, eg param1, int param2, int param3) {
        byte[] var6 = param1.b(param3, 26219, param2);
        byte[] var4 = var6;
        if (!(var6 != null)) {
            return false;
        }
        int var5 = -27 % ((param0 - -66) / 51);
        e.a(var6, true);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ri();
        field_d = "Lost";
        field_b = new aj(12, 0, 1, 0);
        field_a = true;
    }
}
