/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp extends nc {
    private int field_p;
    static sc field_o;
    private int field_m;
    static String[][] field_n;
    static int field_l;

    final static void a(int param0, int param1, int param2, boolean param3) {
        if (param0 == 0) {
          if (~li.field_C != ~param2) {
            L0: {
              bn.field_b = true;
              li.field_C = param2;
              l.a(param1, (byte) -122);
              if (param0 != 1) {
                break L0;
              } else {
                if (~param2 != ~qe.field_g) {
                  qe.field_g = param2;
                  bn.field_b = true;
                  l.a(param1, (byte) -74);
                  break L0;
                } else {
                  L1: {
                    if (param0 != 2) {
                      break L1;
                    } else {
                      if (~param2 == ~ba.field_q) {
                        break L1;
                      } else {
                        ba.field_q = param2;
                        bn.field_b = true;
                        l.a(param1, (byte) -51);
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L2: {
              if (param0 != 2) {
                break L2;
              } else {
                if (~param2 == ~ba.field_q) {
                  break L2;
                } else {
                  ba.field_q = param2;
                  bn.field_b = true;
                  l.a(param1, (byte) -51);
                  return;
                }
              }
            }
            return;
          } else {
            L3: {
              if (param0 != 1) {
                break L3;
              } else {
                if (~param2 != ~qe.field_g) {
                  qe.field_g = param2;
                  bn.field_b = true;
                  l.a(param1, (byte) -74);
                  break L3;
                } else {
                  L4: {
                    if (param0 != 2) {
                      break L4;
                    } else {
                      if (~param2 == ~ba.field_q) {
                        break L4;
                      } else {
                        ba.field_q = param2;
                        bn.field_b = true;
                        l.a(param1, (byte) -51);
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L5: {
              if (param0 != 2) {
                break L5;
              } else {
                if (~param2 == ~ba.field_q) {
                  break L5;
                } else {
                  ba.field_q = param2;
                  bn.field_b = true;
                  l.a(param1, (byte) -51);
                  return;
                }
              }
            }
            return;
          }
        } else {
          L6: {
            if (param0 != 1) {
              break L6;
            } else {
              if (~param2 != ~qe.field_g) {
                qe.field_g = param2;
                bn.field_b = true;
                l.a(param1, (byte) -74);
                break L6;
              } else {
                if (param0 == 2) {
                  if (~param2 != ~ba.field_q) {
                    ba.field_q = param2;
                    bn.field_b = true;
                    l.a(param1, (byte) -51);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (param0 == 2) {
            if (~param2 != ~ba.field_q) {
              ba.field_q = param2;
              bn.field_b = true;
              l.a(param1, (byte) -51);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    kp(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        ((kp) this).field_p = 1;
        ((kp) this).field_m = 3;
    }

    final void a(boolean param0) {
        super.a(param0);
        sl var2 = ah.field_e;
        int var3 = 500;
        int var4 = 200;
        int var5 = 320 + -(var3 / 2);
        int var6 = 240 + -(var4 / 2);
        var4 = ((fm) (Object) var2).a(vh.field_Fb, var3, 0);
        s.a(var6 + -10, 0, cc.field_b, -10 + var5, var4 - -20, 20 + var3);
        int discarded$0 = ((fm) (Object) var2).a(vh.field_Fb, var5, var6, var3, var4, ((kp) this).field_m, ((kp) this).field_p, 1, 1, 0);
    }

    public static void e(int param0) {
        field_o = null;
        field_n = null;
    }

    static {
    }
}
