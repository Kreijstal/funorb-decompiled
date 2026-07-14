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
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        var1 = 0;
        if (param0 != -31515) {
          field_d = 3;
          L0: while (true) {
            if (!ata.e(127)) {
              L1: {
                ei.field_c.a(rkb.a(qs.field_a, param0 ^ -29724, oq.field_H), 5620, rkb.a(uia.field_b, 3841, kc.field_b));
                if (!ei.field_c.e((byte) -126)) {
                  break L1;
                } else {
                  var1 = 1;
                  break L1;
                }
              }
              var2 = 0;
              if (var1 != 0) {
                if (0 <= ei.field_c.field_j) {
                  var2 = kc.field_e[ei.field_c.field_j];
                  if (-3 == var2) {
                    ek.b(false);
                    return var2;
                  } else {
                    return var2;
                  }
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            } else {
              ei.field_c.a((byte) -94);
              if (ei.field_c.e((byte) -96)) {
                var1 = 1;
                continue L0;
              } else {
                continue L0;
              }
            }
          }
        } else {
          L2: while (true) {
            if (!ata.e(127)) {
              L3: {
                ei.field_c.a(rkb.a(qs.field_a, param0 ^ -29724, oq.field_H), 5620, rkb.a(uia.field_b, 3841, kc.field_b));
                if (!ei.field_c.e((byte) -126)) {
                  break L3;
                } else {
                  var1 = 1;
                  break L3;
                }
              }
              var2 = 0;
              if (var1 != 0) {
                if (0 <= ei.field_c.field_j) {
                  var2 = kc.field_e[ei.field_c.field_j];
                  if (-3 == (var2 ^ -1)) {
                    ek.b(false);
                    return var2;
                  } else {
                    return var2;
                  }
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            } else {
              ei.field_c.a((byte) -94);
              if (ei.field_c.e((byte) -96)) {
                var1 = 1;
                continue L2;
              } else {
                continue L2;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 250;
    }
}
