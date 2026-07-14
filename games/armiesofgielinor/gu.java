/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu {
    static b field_b;
    static String field_a;

    final static boolean a(int param0) {
        int var1 = -61 / ((-54 - param0) / 62);
        if (oa.field_I != null) {
            return oa.field_I.a(-30847, ui.field_i, rs.field_q);
        }
        return false;
    }

    final static at a(boolean param0, String param1) {
        at var2 = null;
        mt var3 = null;
        int var4 = 0;
        int var5 = 0;
        mt var6 = null;
        mt var7 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!param0) {
          var2 = new at();
          var6 = new mt(param1);
          L0: while (true) {
            if (var6.a((byte) 16)) {
              return var2;
            } else {
              var4 = var6.b(-1);
              if (Character.isWhitespace((char) var4)) {
                continue L0;
              } else {
                L1: {
                  if (var4 == 34) {
                    break L1;
                  } else {
                    if (var4 == 39) {
                      break L1;
                    } else {
                      if (var4 != 40) {
                        if (var4 != 41) {
                          if (44 != var4) {
                            var2.a((byte) -119, (tc) (Object) bi.a((byte) -118, var6));
                            continue L0;
                          } else {
                            var2.a((byte) -119, (tc) (Object) new og(sb.field_d, var6.field_c + -1));
                            continue L0;
                          }
                        } else {
                          var2.a((byte) -119, (tc) (Object) new og(gm.field_d, -1 + var6.field_c));
                          continue L0;
                        }
                      } else {
                        var2.a((byte) -119, (tc) (Object) new og(mo.field_j, -1 + var6.field_c));
                        continue L0;
                      }
                    }
                  }
                }
                var2.a((byte) -119, (tc) (Object) aw.a((byte) 121, var6));
                continue L0;
              }
            }
          }
        } else {
          boolean discarded$1 = gu.a(102);
          var2 = new at();
          var7 = new mt(param1);
          var3 = var7;
          L2: while (true) {
            if (var7.a((byte) 16)) {
              return var2;
            } else {
              var4 = var7.b(-1);
              if (Character.isWhitespace((char) var4)) {
                continue L2;
              } else {
                L3: {
                  if (var4 == 34) {
                    break L3;
                  } else {
                    if (var4 == 39) {
                      break L3;
                    } else {
                      if (var4 != 40) {
                        if (var4 != 41) {
                          if (44 != var4) {
                            var2.a((byte) -119, (tc) (Object) bi.a((byte) -118, var7));
                            continue L2;
                          } else {
                            var2.a((byte) -119, (tc) (Object) new og(sb.field_d, var7.field_c + -1));
                            continue L2;
                          }
                        } else {
                          var2.a((byte) -119, (tc) (Object) new og(gm.field_d, -1 + var7.field_c));
                          continue L2;
                        }
                      } else {
                        var2.a((byte) -119, (tc) (Object) new og(mo.field_j, -1 + var7.field_c));
                        continue L2;
                      }
                    }
                  }
                }
                var2.a((byte) -119, (tc) (Object) aw.a((byte) 121, var7));
                continue L2;
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -16356) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1) {
        bv var2 = null;
        var2 = vl.field_n;
        if (param0 >= -31) {
          field_a = null;
          var2.h(32161, param1);
          var2.b(1, 1);
          var2.b(1, 0);
          return;
        } else {
          var2.h(32161, param1);
          var2.b(1, 1);
          var2.b(1, 0);
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Connection timed out. Please try using a different server.";
    }
}
