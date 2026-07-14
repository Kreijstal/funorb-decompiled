/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends da {
    static int field_l;
    static ch field_p;
    static si field_o;
    private kp field_r;
    static tq field_n;
    static int field_q;
    static int field_s;
    static String[][] field_m;

    public static void g(int param0) {
        field_m = null;
        field_n = null;
        if (param0 != 29492) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    final String b(int param0, String param1) {
        of var3 = null;
        if (!(((rf) this).field_r instanceof ik)) {
          if (!param1.equals((Object) (Object) ((rf) this).field_r.field_w)) {
            return gl.field_a;
          } else {
            if (param0 == 3614) {
              return null;
            } else {
              field_q = 90;
              return null;
            }
          }
        } else {
          var3 = ((ik) (Object) ((rf) this).field_r).a((byte) -5);
          if (var3 != null) {
            if (var3.a(-23996) == qm.field_G) {
              if (param1.equals((Object) (Object) ((rf) this).field_r.field_w)) {
                return var3.d(param0 + -30797);
              } else {
                return gl.field_a;
              }
            } else {
              return var3.d(param0 + -30797);
            }
          } else {
            if (!param1.equals((Object) (Object) ((rf) this).field_r.field_w)) {
              return gl.field_a;
            } else {
              if (param0 == 3614) {
                return null;
              } else {
                field_q = 90;
                return null;
              }
            }
          }
        }
    }

    final ba a(int param0, String param1) {
        of var3 = null;
        ba stackIn_5_0 = null;
        ba stackIn_15_0 = null;
        ba stackIn_22_0 = null;
        ba stackOut_21_0 = null;
        ba stackOut_20_0 = null;
        ba stackOut_14_0 = null;
        ba stackOut_13_0 = null;
        ba stackOut_4_0 = null;
        ba stackOut_3_0 = null;
        if (((rf) this).field_r instanceof ik) {
          var3 = ((ik) (Object) ((rf) this).field_r).a((byte) -5);
          if (var3 == null) {
            if (param0 != -1) {
              return null;
            } else {
              L0: {
                if (param1.equals((Object) (Object) ((rf) this).field_r.field_w)) {
                  stackOut_21_0 = qm.field_G;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                } else {
                  stackOut_20_0 = ir.field_a;
                  stackIn_22_0 = stackOut_20_0;
                  break L0;
                }
              }
              return stackIn_22_0;
            }
          } else {
            if (var3.a(-23996) == qm.field_G) {
              if (param0 != -1) {
                return null;
              } else {
                L1: {
                  if (param1.equals((Object) (Object) ((rf) this).field_r.field_w)) {
                    stackOut_14_0 = qm.field_G;
                    stackIn_15_0 = stackOut_14_0;
                    break L1;
                  } else {
                    stackOut_13_0 = ir.field_a;
                    stackIn_15_0 = stackOut_13_0;
                    break L1;
                  }
                }
                return stackIn_15_0;
              }
            } else {
              return ir.field_a;
            }
          }
        } else {
          if (param0 != -1) {
            return null;
          } else {
            L2: {
              if (param1.equals((Object) (Object) ((rf) this).field_r.field_w)) {
                stackOut_4_0 = qm.field_G;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = ir.field_a;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    rf(kp param0, kp param1) {
        super(param0);
        ((rf) this).field_r = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new tq(2);
    }
}
