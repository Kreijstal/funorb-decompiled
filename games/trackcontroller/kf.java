/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static int field_c;
    static int field_b;
    static qj[] field_d;
    static int field_a;

    public static void b(int param0) {
        field_d = null;
        if (param0 != -1688814815) {
            field_c = -121;
        }
    }

    final static mh a(int param0, kk param1, int param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        var4 = param1.b(param2, 20095);
        var3 = var4;
        if (var4 != null) {
          if (param0 > -45) {
            kf.a(false);
            return new mh(var4);
          } else {
            return new mh(var4);
          }
        } else {
          return null;
        }
    }

    final static oi a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        var2 = param0.length();
        if (-1 == (var2 ^ -1)) {
          return oc.field_j;
        } else {
          if (var2 > 63) {
            return bl.field_c;
          } else {
            if (param1) {
              var3 = 0;
              L0: while (true) {
                if (var2 > var3) {
                  var4 = param0.charAt(var3);
                  if (var4 != 45) {
                    if (-1 == ac.field_a.indexOf(var4)) {
                      return fh.field_e;
                    } else {
                      var3++;
                      var3++;
                      continue L0;
                    }
                  } else {
                    L1: {
                      if (var3 == 0) {
                        break L1;
                      } else {
                        if (-1 + var2 != var3) {
                          var3++;
                          var3++;
                          var3++;
                          continue L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    return fh.field_e;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    final static void a(int param0) {
        r.f(-635);
        qc.b(param0, (byte) -42);
    }

    final static void a(boolean param0) {
        pb.field_c[520] = 59;
        pb.field_c[222] = 58;
        pb.field_c[192] = 28;
        pb.field_c[47] = 73;
        if (param0) {
          kf.a(93);
          pb.field_c[61] = 27;
          pb.field_c[93] = 43;
          pb.field_c[44] = 71;
          pb.field_c[59] = 57;
          pb.field_c[45] = 26;
          pb.field_c[91] = 42;
          pb.field_c[92] = 74;
          pb.field_c[46] = 72;
          return;
        } else {
          pb.field_c[61] = 27;
          pb.field_c[93] = 43;
          pb.field_c[44] = 71;
          pb.field_c[59] = 57;
          pb.field_c[45] = 26;
          pb.field_c[91] = 42;
          pb.field_c[92] = 74;
          pb.field_c[46] = 72;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
