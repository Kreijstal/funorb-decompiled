/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends cb {
    static String field_k;
    static String field_j;
    static bg field_l;
    private ui field_i;

    final ag a(String param0, int param1) {
        jm var3 = null;
        Object var4 = null;
        ag stackIn_5_0 = null;
        ag stackIn_9_0 = null;
        ag stackIn_16_0 = null;
        ag stackIn_20_0 = null;
        ag stackIn_28_0 = null;
        ag stackIn_32_0 = null;
        ag stackOut_31_0 = null;
        ag stackOut_30_0 = null;
        ag stackOut_27_0 = null;
        ag stackOut_26_0 = null;
        ag stackOut_19_0 = null;
        ag stackOut_18_0 = null;
        ag stackOut_15_0 = null;
        ag stackOut_14_0 = null;
        ag stackOut_8_0 = null;
        ag stackOut_7_0 = null;
        ag stackOut_4_0 = null;
        ag stackOut_3_0 = null;
        if (((jg) this).field_i instanceof sg) {
          var3 = ((sg) (Object) ((jg) this).field_i).a(35);
          if (var3 != null) {
            if (var3.b(24595) == sc.field_a) {
              if (param1 != 5) {
                L0: {
                  var4 = null;
                  jg.a((java.math.BigInteger) null, 33, (sb) null, (java.math.BigInteger) null, (sb) null);
                  if (!param0.equals((Object) (Object) ((jg) this).field_i.field_s)) {
                    stackOut_31_0 = fg.field_d;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    stackOut_30_0 = sc.field_a;
                    stackIn_32_0 = stackOut_30_0;
                    break L0;
                  }
                }
                return stackIn_32_0;
              } else {
                L1: {
                  if (!param0.equals((Object) (Object) ((jg) this).field_i.field_s)) {
                    stackOut_27_0 = fg.field_d;
                    stackIn_28_0 = stackOut_27_0;
                    break L1;
                  } else {
                    stackOut_26_0 = sc.field_a;
                    stackIn_28_0 = stackOut_26_0;
                    break L1;
                  }
                }
                return stackIn_28_0;
              }
            } else {
              return fg.field_d;
            }
          } else {
            if (param1 != 5) {
              L2: {
                var4 = null;
                jg.a((java.math.BigInteger) null, 33, (sb) null, (java.math.BigInteger) null, (sb) null);
                if (!param0.equals((Object) (Object) ((jg) this).field_i.field_s)) {
                  stackOut_19_0 = fg.field_d;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                } else {
                  stackOut_18_0 = sc.field_a;
                  stackIn_20_0 = stackOut_18_0;
                  break L2;
                }
              }
              return stackIn_20_0;
            } else {
              L3: {
                if (!param0.equals((Object) (Object) ((jg) this).field_i.field_s)) {
                  stackOut_15_0 = fg.field_d;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = sc.field_a;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              return stackIn_16_0;
            }
          }
        } else {
          if (param1 != 5) {
            L4: {
              var4 = null;
              jg.a((java.math.BigInteger) null, 33, (sb) null, (java.math.BigInteger) null, (sb) null);
              if (!param0.equals((Object) (Object) ((jg) this).field_i.field_s)) {
                stackOut_8_0 = fg.field_d;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = sc.field_a;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            return stackIn_9_0;
          } else {
            L5: {
              if (!param0.equals((Object) (Object) ((jg) this).field_i.field_s)) {
                stackOut_4_0 = fg.field_d;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = sc.field_a;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    jg(ui param0, ui param1) {
        super(param0);
        ((jg) this).field_i = param1;
    }

    public static void b(byte param0) {
        field_l = null;
        field_j = null;
        if (param0 != 23) {
            return;
        }
        field_k = null;
    }

    final static void a(String param0, String param1, int param2, boolean param3) {
        pl.field_a = param1;
        ch.field_g = param0;
        if (param2 >= -100) {
          jg.b((byte) -17);
          t.a(param3, rf.field_a, 0);
          return;
        } else {
          t.a(param3, rf.field_a, 0);
          return;
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        jm var3 = null;
        if (((jg) this).field_i instanceof sg) {
          var3 = ((sg) (Object) ((jg) this).field_i).a(35);
          if (var3 != null) {
            if (var3.b(24595) == sc.field_a) {
              if (param1.equals((Object) (Object) ((jg) this).field_i.field_s)) {
                return var3.a(7320);
              } else {
                return sb.field_q;
              }
            } else {
              return var3.a(7320);
            }
          } else {
            if (!param1.equals((Object) (Object) ((jg) this).field_i.field_s)) {
              return sb.field_q;
            } else {
              var3_int = -95 / ((param0 - 49) / 56);
              return null;
            }
          }
        } else {
          if (!param1.equals((Object) (Object) ((jg) this).field_i.field_s)) {
            return sb.field_q;
          } else {
            var3_int = -95 / ((param0 - 49) / 56);
            return null;
          }
        }
    }

    final static void a(java.math.BigInteger param0, int param1, sb param2, java.math.BigInteger param3, sb param4) {
        eg.a(0, (byte) 90, param2.field_u, param2.field_o, param3, param4, param0);
        if (param1 >= -94) {
            jg.b((byte) -48);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Drowned By Greed";
        field_j = "Please try again in a few minutes.";
        field_l = new bg(15, 0, 1, 0);
    }
}
