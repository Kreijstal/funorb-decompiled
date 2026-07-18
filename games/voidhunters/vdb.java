/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vdb extends uj {
    static int field_d;

    vdb() {
    }

    final static phb[] a(int param0, int param1, int param2, int param3) {
        if (param2 <= 110) {
            return null;
        }
        return ul.a(param0, param1, 1, param3, true);
    }

    final int b(byte param0) {
        if (param0 <= 79) {
            int discarded$0 = ((vdb) this).d((byte) -127);
            return 107;
        }
        return 107;
    }

    final int a(int param0) {
        if (param0 != -1) {
            field_d = 30;
            return oqa.field_p;
        }
        return oqa.field_p;
    }

    final int d(byte param0) {
        if (param0 != 64) {
            field_d = -94;
            return qaa.field_b;
        }
        return qaa.field_b;
    }

    final boolean a(boolean param0) {
        if (param0) {
            field_d = -16;
            return false;
        }
        return false;
    }

    final static int d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!ata.e(127)) {
                L2: {
                  ei.field_c.a(rkb.a(qs.field_a, 3841, oq.field_H), 5620, rkb.a(uia.field_b, 3841, kc.field_b));
                  if (!ei.field_c.e((byte) -126)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (0 <= ei.field_c.field_j) {
                      var2 = kc.field_e[ei.field_c.field_j];
                      if (var2 != 2) {
                        break L3;
                      } else {
                        ek.b(false);
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_13_0 = var2;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                ei.field_c.a((byte) -94);
                if (ei.field_c.e((byte) -96)) {
                  var1_int = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "vdb.C(" + -31515 + ')');
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 250;
    }
}
