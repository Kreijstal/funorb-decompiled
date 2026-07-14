/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends ip {
    static String field_m;
    static String field_r;
    static hl field_n;
    private rm field_p;
    static String field_q;
    static ph field_o;
    static wk field_s;

    final String a(byte param0, String param1) {
        Object var4 = null;
        dp var5 = null;
        dp var6 = null;
        if (param0 >= 44) {
          if (!(((be) this).field_p instanceof qn)) {
            if (param1.equals((Object) (Object) ((be) this).field_p.field_w)) {
              return null;
            } else {
              return ep.field_j;
            }
          } else {
            var6 = ((qn) (Object) ((be) this).field_p).a(-79);
            if (var6 != null) {
              if (var6.a((byte) -117) == c.field_d) {
                if (param1.equals((Object) (Object) ((be) this).field_p.field_w)) {
                  return var6.a(true);
                } else {
                  return ep.field_j;
                }
              } else {
                return var6.a(true);
              }
            } else {
              if (param1.equals((Object) (Object) ((be) this).field_p.field_w)) {
                return null;
              } else {
                return ep.field_j;
              }
            }
          }
        } else {
          var4 = null;
          od discarded$1 = ((be) this).a((String) null, -75);
          if (((be) this).field_p instanceof qn) {
            var5 = ((qn) (Object) ((be) this).field_p).a(-79);
            if (var5 != null) {
              if (var5.a((byte) -117) == c.field_d) {
                if (!param1.equals((Object) (Object) ((be) this).field_p.field_w)) {
                  return ep.field_j;
                } else {
                  return var5.a(true);
                }
              } else {
                return var5.a(true);
              }
            } else {
              if (param1.equals((Object) (Object) ((be) this).field_p.field_w)) {
                return null;
              } else {
                return ep.field_j;
              }
            }
          } else {
            if (param1.equals((Object) (Object) ((be) this).field_p.field_w)) {
              return null;
            } else {
              return ep.field_j;
            }
          }
        }
    }

    final od a(String param0, int param1) {
        int var3 = 0;
        dp var3_ref = null;
        od stackIn_4_0 = null;
        od stackIn_9_0 = null;
        od stackIn_15_0 = null;
        od stackOut_14_0 = null;
        od stackOut_13_0 = null;
        od stackOut_8_0 = null;
        od stackOut_7_0 = null;
        od stackOut_3_0 = null;
        od stackOut_2_0 = null;
        if (((be) this).field_p instanceof qn) {
          var3_ref = ((qn) (Object) ((be) this).field_p).a(-122);
          if (var3_ref != null) {
            if (var3_ref.a((byte) -99) == c.field_d) {
              L0: {
                var3 = -81 / ((5 - param1) / 44);
                if (param0.equals((Object) (Object) ((be) this).field_p.field_w)) {
                  stackOut_14_0 = c.field_d;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = pd.field_J;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              return stackIn_15_0;
            } else {
              return pd.field_J;
            }
          } else {
            L1: {
              var3 = -81 / ((5 - param1) / 44);
              if (param0.equals((Object) (Object) ((be) this).field_p.field_w)) {
                stackOut_8_0 = c.field_d;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = pd.field_J;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            return stackIn_9_0;
          }
        } else {
          L2: {
            var3 = -81 / ((5 - param1) / 44);
            if (param0.equals((Object) (Object) ((be) this).field_p.field_w)) {
              stackOut_3_0 = c.field_d;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = pd.field_J;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_s = null;
        field_m = null;
        field_n = null;
        if (param0 != -15818) {
          field_n = null;
          field_o = null;
          field_r = null;
          return;
        } else {
          field_o = null;
          field_r = null;
          return;
        }
    }

    be(rm param0, rm param1) {
        super(param0);
        ((be) this).field_p = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = null;
        field_m = "You must have had your dungeon reset by an Orb of Mastery once to earn the title of <%1>.";
        field_q = "CHARGE ORB";
        field_r = "Cancel";
    }
}
