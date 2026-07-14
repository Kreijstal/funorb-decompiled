/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static String field_b;
    static ka field_a;

    final static void b(int param0) {
        eo.field_f = null;
        if (param0 != 26311) {
            ph.b(64);
        }
        on.field_i = null;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -1) {
            Object var2 = null;
            int discarded$0 = ph.a((rc) null, (byte) -75, 36, (jc) null);
        }
    }

    final static void a(byte param0, wj param1) {
        tp.a(75, true, param1);
        if (param0 < 40) {
            Object var3 = null;
            int discarded$0 = ph.a((rc) null, (byte) -23, 122, (jc) null);
        }
    }

    final static boolean a(int param0, int param1, int param2, dj param3) {
        byte[] var6 = param3.a((byte) 51, param0, param2);
        byte[] var4 = var6;
        if (!(var6 != null)) {
            return false;
        }
        rn.a(var6, 0);
        if (param1 != 31043) {
            Object var5 = null;
            boolean discarded$0 = ph.a(-94, 1, -17, (dj) null);
            return true;
        }
        return true;
    }

    final static int a(rc param0, byte param1, int param2, jc param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ZombieDawn.field_J;
          if (param3 == null) {
            break L0;
          } else {
            if (param3.field_k == null) {
              break L0;
            } else {
              if (param0 == null) {
                break L0;
              } else {
                if (param0.field_o != param3.field_s) {
                  break L0;
                } else {
                  L1: {
                    var4 = param0.field_k.length;
                    var5 = param3.field_k[param2].length / var4;
                    var6 = 0;
                    if (param1 < -69) {
                      break L1;
                    } else {
                      ph.a(-98);
                      break L1;
                    }
                  }
                  L2: while (true) {
                    if (var6 >= var5) {
                      return -1;
                    } else {
                      if (param3.field_i[param2][var6] == param0.field_s) {
                        if (l.a(117, param3.field_m[param2][var6])) {
                          var7 = 0;
                          L3: while (true) {
                            if (var4 <= var7) {
                              return var6;
                            } else {
                              if (param3.field_k[param2][var6 * var4 - -var7] == param0.field_k[var7]) {
                                var7++;
                                continue L3;
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L2;
                        }
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
    }
}
