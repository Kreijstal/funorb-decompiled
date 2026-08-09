/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_d;
    static ke field_a;
    static String field_b;
    static boolean field_c;

    final static kc a(int param0, boolean param1, int param2, int param3, int param4) {
        vj stackIn_10_0 = null;
        vj stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        vj stackIn_22_0 = null;
        vj stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object var5;
        kc var5_ref;
        int var6;
        var5 = null;
        var6 = client.field_A ? 1 : 0;
        if (!param1) {
          var5_ref = (kc) ((Object) dg.field_e.c((byte) 49));
          L0: while (true) {
            if (var5_ref != null) {
              if (var6 == 0) {
                if (param3 != var5_ref.field_n) {
                  L1: {
                    stackIn_22_0 = dg.field_e;

                    if (param1) {
                      stackIn_23_0 = (vj) ((Object) stackIn_22_0);
                      stackIn_23_1 = 0;
                      break L1;
                    } else {
                      stackIn_23_0 = (vj) ((Object) stackIn_22_0);
                      stackIn_23_1 = 1;
                      break L1;
                    }
                  }
                  var5_ref = (kc) ((Object) ((vj) (Object) stackIn_23_0).d(stackIn_23_1 != 0));
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    var5_ref = new kc();
                    var5_ref.field_n = param3;
                    var5_ref.field_o = param4;
                    var5_ref.field_v = param2;
                    dg.field_e.a(var5_ref, 2777);
                    wb.a(var5_ref, param0, 60);
                    return var5_ref;
                  }
                } else {
                  return var5_ref;
                }
              } else {
                return var5_ref;
              }
            } else {
              var5_ref = new kc();
              var5_ref.field_n = param3;
              var5_ref.field_o = param4;
              var5_ref.field_v = param2;
              dg.field_e.a(var5_ref, 2777);
              wb.a(var5_ref, param0, 60);
              return var5_ref;
            }
          }
        } else {
          am.a(9, false, 66, -99, 40);
          var5_ref = (kc) ((Object) dg.field_e.c((byte) 49));
          L2: while (true) {
            if (var5_ref != null) {
              if (var6 == 0) {
                if (param3 != var5_ref.field_n) {
                  L3: {
                    stackIn_10_0 = dg.field_e;

                    if (param1) {
                      stackIn_11_0 = (vj) ((Object) stackIn_10_0);
                      stackIn_11_1 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = (vj) ((Object) stackIn_10_0);
                      stackIn_11_1 = 1;
                      break L3;
                    }
                  }
                  var5_ref = (kc) ((Object) ((vj) (Object) stackIn_11_0).d(stackIn_11_1 != 0));
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    var5_ref = new kc();
                    var5_ref.field_n = param3;
                    var5_ref.field_o = param4;
                    var5_ref.field_v = param2;
                    dg.field_e.a(var5_ref, 2777);
                    wb.a(var5_ref, param0, 60);
                    return var5_ref;
                  }
                } else {
                  return var5_ref;
                }
              } else {
                return var5_ref;
              }
            } else {
              var5_ref = new kc();
              var5_ref.field_n = param3;
              var5_ref.field_o = param4;
              var5_ref.field_v = param2;
              dg.field_e.a(var5_ref, 2777);
              wb.a(var5_ref, param0, 60);
              return var5_ref;
            }
          }
        }
    }

    final static int b(int param0) {
        if (param0 <= 69) {
          am.b(-17);
          return wl.field_o + (wh.field_d << -19637598) + (qk.field_i << -1631507260);
        } else {
          return wl.field_o + (wh.field_d << -19637598) + (qk.field_i << -1631507260);
        }
    }

    public static void a(int param0) {
        if (param0 < 77) {
            return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_d = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_b = "The following settings need to be changed:  ";
    }
}
