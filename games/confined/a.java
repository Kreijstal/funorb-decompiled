/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static String field_a;

    final static void a(byte param0) {
        om.field_s.field_a = 0;
        om.field_s.field_e = 0;
        if (param0 != -26) {
            a.a(-100);
        }
    }

    final static vj a(String param0, int param1) {
        if (param1 != -6728) {
            a.a((byte) 115);
            return new vj(param0);
        }
        return new vj(param0);
    }

    final static void a(int param0) {
        if (!tl.field_g) {
          if (mf.field_f != null) {
            if (mf.field_f.field_o) {
              oj.field_B = oj.field_B & (mf.field_f.field_s ^ -1);
              i.field_o = i.field_o | mf.field_f.field_s;
              mf.field_f = null;
              tl.field_g = true;
              if (!tl.field_g) {
                if (param0 != 0) {
                  a.a(false);
                  return;
                } else {
                  return;
                }
              } else {
                tg.a((byte) -124);
                if (param0 != 0) {
                  a.a(false);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (!tl.field_g) {
                if (param0 != 0) {
                  a.a(false);
                  return;
                } else {
                  return;
                }
              } else {
                tg.a((byte) -124);
                if (param0 != 0) {
                  a.a(false);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L0: {
              mf.field_f = ij.a(param0 ^ -108, 4);
              if (mf.field_f.field_o) {
                oj.field_B = oj.field_B & (mf.field_f.field_s ^ -1);
                i.field_o = i.field_o | mf.field_f.field_s;
                mf.field_f = null;
                tl.field_g = true;
                break L0;
              } else {
                break L0;
              }
            }
            if (!tl.field_g) {
              if (param0 != 0) {
                a.a(false);
                return;
              } else {
                return;
              }
            } else {
              tg.a((byte) -124);
              if (param0 != 0) {
                a.a(false);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (tl.field_g) {
            tg.a((byte) -124);
            if (param0 == 0) {
              return;
            } else {
              a.a(false);
              return;
            }
          } else {
            if (param0 == 0) {
              return;
            } else {
              a.a(false);
              return;
            }
          }
        }
    }

    final static bm a(mi param0, int param1, int param2, byte param3) {
        int var4 = 0;
        var4 = 83 % ((param3 - -25) / 50);
        if (!mc.a(param2, param1, param0, (byte) 119)) {
          return null;
        } else {
          return ei.o(85);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            vj discarded$0 = a.a((String) null, -30);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<col=FFFFFF>Spread fire:</col> carefully tuned to send blasts into every corner of the tunnel, this weapon will hit everything. If you need precision, you'll get it at close range.";
    }
}
