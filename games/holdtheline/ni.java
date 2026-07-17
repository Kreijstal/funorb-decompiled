/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_b;
    static ql field_a;

    final static String a(char param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; var4 < param2; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            ni.a(87);
        }
        field_a = null;
    }

    final static int a(byte param0) {
        L0: {
          if (param0 < -54) {
            break L0;
          } else {
            int discarded$1 = ni.a((byte) -3);
            break L0;
          }
        }
        if (pf.field_d < 2) {
          return 0;
        } else {
          L1: {
            if (v.field_C != 0) {
              L2: {
                if (null != ml.field_a) {
                  if (ml.field_a.b((byte) -107)) {
                    if (!ml.field_a.a("", true)) {
                      return 29;
                    } else {
                      if (!ml.field_a.b("", 93)) {
                        return 29;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L2;
                }
              }
              if (ah.field_d.b((byte) -92)) {
                if (!ah.field_d.b("commonui", 104)) {
                  return 57;
                } else {
                  if (!am.field_d.b((byte) -104)) {
                    return 71;
                  } else {
                    if (am.field_d.b("commonui", 59)) {
                      if (ca.field_p.b((byte) -76)) {
                        if (!ca.field_p.a((byte) 77)) {
                          return 86;
                        } else {
                          break L1;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  }
                }
              } else {
                return 43;
              }
            } else {
              if (!ah.field_d.b((byte) -92)) {
                return 20;
              } else {
                if (!ah.field_d.b("commonui", -91)) {
                  return 40;
                } else {
                  if (!am.field_d.b((byte) -66)) {
                    return 50;
                  } else {
                    if (!am.field_d.b("commonui", 110)) {
                      return 60;
                    } else {
                      if (!ca.field_p.b((byte) -122)) {
                        return 70;
                      } else {
                        if (!ca.field_p.a((byte) -93)) {
                          return 80;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return 100;
        }
    }

    static {
    }
}
