/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends vo {
    private String field_f;
    static pa[][] field_k;
    static String[] field_e;
    private uu field_h;
    static dk field_m;
    private boolean field_i;
    static rk field_j;
    static String field_l;
    static String field_g;

    ii(bm param0, bm param1) {
        super(param0);
        ((ii) this).field_f = "";
        ((ii) this).field_i = false;
        ((ii) this).field_h = new uu(param0, param1);
    }

    public static void c(byte param0) {
        field_m = null;
        field_l = null;
        field_k = (pa[][]) null;
        field_j = null;
        if (param0 != -22) {
          field_g = (String) null;
          field_e = null;
          field_g = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          return;
        }
    }

    final static int a(byte param0, jb param1) {
        if (param1 != dl.field_p) {
          if (ac.field_b != param1) {
            if (un.field_i != param1) {
              if (param1 == bs.field_a) {
                return 34166;
              } else {
                if (param0 < 63) {
                  field_e = (String[]) null;
                  throw new IllegalArgumentException();
                } else {
                  throw new IllegalArgumentException();
                }
              }
            } else {
              return 34168;
            }
          } else {
            return 34167;
          }
        } else {
          return 5890;
        }
    }

    final String a(String param0, byte param1) {
        if (((ii) this).field_h.a(param0, 8192) != bt.field_a) {
          if (param1 == 72) {
            if (((ii) this).a(param0, 8192) == bt.field_a) {
              return dk.field_i;
            } else {
              return gh.field_o;
            }
          } else {
            ((ii) this).field_i = true;
            if (((ii) this).a(param0, 8192) == bt.field_a) {
              return dk.field_i;
            } else {
              return gh.field_o;
            }
          }
        } else {
          return ((ii) this).field_h.a(param0, (byte) 72);
        }
    }

    final pt a(String param0, int param1) {
        id var3 = null;
        String var4 = null;
        pt stackIn_10_0 = null;
        pt stackIn_14_0 = null;
        pt stackOut_13_0 = null;
        pt stackOut_12_0 = null;
        pt stackOut_9_0 = null;
        pt stackOut_8_0 = null;
        if (((ii) this).field_h.a(param0, param1 ^ 0) != bt.field_a) {
          L0: {
            if (param0.equals((Object) (Object) ((ii) this).field_f)) {
              break L0;
            } else {
              var3 = rq.a(-111, param0);
              if (var3.a(false)) {
                ((ii) this).field_f = param0;
                ((ii) this).field_i = var3.a(param1 + -10107);
                break L0;
              } else {
                return ce.field_t;
              }
            }
          }
          if (param1 != 8192) {
            L1: {
              var4 = (String) null;
              String discarded$8 = ((ii) this).a((String) null, (byte) 79);
              if (((ii) this).field_i) {
                stackOut_13_0 = fd.field_a;
                stackIn_14_0 = stackOut_13_0;
                break L1;
              } else {
                stackOut_12_0 = bt.field_a;
                stackIn_14_0 = stackOut_12_0;
                break L1;
              }
            }
            return (pt) (Object) stackIn_14_0;
          } else {
            L2: {
              if (((ii) this).field_i) {
                stackOut_9_0 = fd.field_a;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = bt.field_a;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            return (pt) (Object) stackIn_10_0;
          }
        } else {
          return bt.field_a;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Press 1 for speed increase", "Press 2 for improved fire rate", "Press 3 for improved manoeuvrability", "Press 4 for extra armour", "Press 5 for extra life", "Press 6 for extra wingmen", "Press 7 for score multiplier"};
        field_l = "settings";
        int discarded$0 = ek.a((byte) 116, 1600);
        field_g = "Passwords can only contain letters and numbers";
    }
}
