/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends pi {
    static String field_s;
    byte[] field_t;
    static int field_u;
    boolean field_q;
    static int[] field_p;
    static String[] field_o;
    static String[][] field_n;
    static String field_r;

    af() {
    }

    public static void a(int param0) {
        field_n = null;
        field_r = null;
        field_p = null;
        field_o = null;
        if (param0 != -12707) {
          field_p = null;
          field_s = null;
          return;
        } else {
          field_s = null;
          return;
        }
    }

    final static int a(sb param0, ta param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        var7 = MinerDisturbance.field_ab;
        var8 = new StringBuilder(8);
        var4 = 0;
        var5 = -1;
        L0: while (true) {
          if (param0.field_u.length > param0.field_o) {
            L1: {
              var5 = param0.d((byte) -54);
              if (nn.field_l != var5) {
                break L1;
              } else {
                if (var4 != 0) {
                  break L1;
                } else {
                  if (param2 > -58) {
                    af.a(127);
                    param1.a((byte) -105, (pi) (Object) new lj(var8.toString()));
                    return var5;
                  } else {
                    param1.a((byte) -105, (pi) (Object) new lj(var8.toString()));
                    return var5;
                  }
                }
              }
            }
            L2: {
              if (!ne.a(var5, uf.field_q, param0, (byte) -99)) {
                break L2;
              } else {
                if (var4 != 0) {
                  break L2;
                } else {
                  L3: {
                    if (param2 <= -58) {
                      break L3;
                    } else {
                      af.a(127);
                      break L3;
                    }
                  }
                  param1.a((byte) -105, (pi) (Object) new lj(var8.toString()));
                  return var5;
                }
              }
            }
            if (var5 != el.field_d) {
              StringBuilder discarded$3 = var8.append((char)var5);
              continue L0;
            } else {
              L4: {
                if (var4 != 0) {
                  if (param0.field_o - -1 != param0.field_u.length) {
                    L5: {
                      var6 = param0.m(4);
                      if (ne.a(var6, uf.field_q, param0, (byte) -81)) {
                        break L5;
                      } else {
                        if (nn.field_l == var6) {
                          break L5;
                        } else {
                          if (var6 == el.field_d) {
                            StringBuilder discarded$4 = var8.append((char)var6);
                            break L4;
                          } else {
                            param0.field_o = param0.field_o - 1;
                            StringBuilder discarded$5 = var8.append((char)var5);
                            break L4;
                          }
                        }
                      }
                    }
                    param0.field_o = param0.field_o - 1;
                    break L4;
                  } else {
                    throw new RuntimeException("Unterminated quote!");
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                if (var4 != 0) {
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L6;
                } else {
                  stackOut_29_0 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  break L6;
                }
              }
              var4 = stackIn_31_0;
              continue L0;
            }
          } else {
            if (param2 > -58) {
              af.a(127);
              param1.a((byte) -105, (pi) (Object) new lj(var8.toString()));
              return var5;
            } else {
              param1.a((byte) -105, (pi) (Object) new lj(var8.toString()));
              return var5;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_s = "Retry";
        field_n = new String[][]{null, new String[1]};
        field_r = "Cost: <%0>";
    }
}
