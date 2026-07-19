/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vdb extends uj {
    static int field_d;

    vdb() {
    }

    final static phb[] a(int param0, int param1, int param2, int param3) {
        if (param2 <= 110) {
            return (phb[]) null;
        }
        return ul.a(param0, param1, 1, param3, true);
    }

    final int b(byte param0) {
        int discarded$0 = 0;
        if (param0 <= 79) {
            discarded$0 = this.d((byte) -127);
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
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var1_int = 0;
              if (param0 == -31515) {
                break L1;
              } else {
                field_d = 3;
                break L1;
              }
            }
            L2: while (true) {
              if (!ata.e(127)) {
                L3: {
                  ei.field_c.a(rkb.a(qs.field_a, param0 ^ -29724, oq.field_H), 5620, rkb.a(uia.field_b, 3841, kc.field_b));
                  if (!ei.field_c.e((byte) -126)) {
                    break L3;
                  } else {
                    var1_int = 1;
                    break L3;
                  }
                }
                L4: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L4;
                  } else {
                    if (0 <= ei.field_c.field_j) {
                      var2 = kc.field_e[ei.field_c.field_j];
                      if (-3 != (var2 ^ -1)) {
                        break L4;
                      } else {
                        ek.b(false);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_14_0 = var2;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                ei.field_c.a((byte) -94);
                if (ei.field_c.e((byte) -96)) {
                  var1_int = 1;
                  continue L2;
                } else {
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "vdb.C(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    static {
        field_d = 250;
    }
}
