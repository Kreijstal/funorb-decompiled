/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends cg {
    private hf field_o;
    static String field_j;
    static int field_l;
    static String[] field_m;
    static boolean field_k;
    static java.awt.Frame field_n;

    final String a(String param0, boolean param1) {
        ba var3 = null;
        Object var4 = null;
        if (((fg) this).field_o instanceof of) {
          var3 = ((of) (Object) ((fg) this).field_o).a(-53);
          if (var3 != null) {
            if (var3.a(true) == ii.field_e) {
              if (param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
                return var3.b(26766);
              } else {
                return r.field_r;
              }
            } else {
              return var3.b(26766);
            }
          } else {
            if (param1) {
              var4 = null;
              sg discarded$16 = ((fg) this).a((String) null, -89);
              if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
                return r.field_r;
              } else {
                return null;
              }
            } else {
              if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
                return r.field_r;
              } else {
                return null;
              }
            }
          }
        } else {
          if (param1) {
            var4 = null;
            sg discarded$17 = ((fg) this).a((String) null, -89);
            if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
              return r.field_r;
            } else {
              return null;
            }
          } else {
            if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
              return r.field_r;
            } else {
              return null;
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_m = null;
        field_n = null;
        if (!param0) {
            fg.c(true);
            field_j = null;
            return;
        }
        field_j = null;
    }

    fg(hf param0, hf param1) {
        super(param0);
        ((fg) this).field_o = param1;
    }

    final sg a(String param0, int param1) {
        ba var4 = null;
        ba var5 = null;
        sg stackIn_7_0 = null;
        sg stackIn_13_0 = null;
        sg stackIn_18_0 = null;
        sg stackIn_23_0 = null;
        sg stackIn_28_0 = null;
        sg stackIn_34_0 = null;
        sg stackOut_33_0 = null;
        sg stackOut_32_0 = null;
        sg stackOut_27_0 = null;
        sg stackOut_26_0 = null;
        sg stackOut_22_0 = null;
        sg stackOut_21_0 = null;
        sg stackOut_12_0 = null;
        sg stackOut_11_0 = null;
        sg stackOut_6_0 = null;
        sg stackOut_5_0 = null;
        sg stackOut_17_0 = null;
        sg stackOut_16_0 = null;
        if (param1 < -58) {
          if (((fg) this).field_o instanceof of) {
            var5 = ((of) (Object) ((fg) this).field_o).a(116);
            if (var5 != null) {
              if (var5.a(true) == ii.field_e) {
                L0: {
                  if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
                    stackOut_33_0 = pe.field_b;
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    stackOut_32_0 = ii.field_e;
                    stackIn_34_0 = stackOut_32_0;
                    break L0;
                  }
                }
                return stackIn_34_0;
              } else {
                return pe.field_b;
              }
            } else {
              L1: {
                if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
                  stackOut_27_0 = pe.field_b;
                  stackIn_28_0 = stackOut_27_0;
                  break L1;
                } else {
                  stackOut_26_0 = ii.field_e;
                  stackIn_28_0 = stackOut_26_0;
                  break L1;
                }
              }
              return stackIn_28_0;
            }
          } else {
            L2: {
              if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
                stackOut_22_0 = pe.field_b;
                stackIn_23_0 = stackOut_22_0;
                break L2;
              } else {
                stackOut_21_0 = ii.field_e;
                stackIn_23_0 = stackOut_21_0;
                break L2;
              }
            }
            return stackIn_23_0;
          }
        } else {
          field_k = false;
          if (((fg) this).field_o instanceof of) {
            var4 = ((of) (Object) ((fg) this).field_o).a(116);
            if (var4 != null) {
              if (var4.a(true) == ii.field_e) {
                L3: {
                  if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
                    stackOut_12_0 = pe.field_b;
                    stackIn_13_0 = stackOut_12_0;
                    break L3;
                  } else {
                    stackOut_11_0 = ii.field_e;
                    stackIn_13_0 = stackOut_11_0;
                    break L3;
                  }
                }
                return stackIn_13_0;
              } else {
                return pe.field_b;
              }
            } else {
              L4: {
                if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
                  stackOut_6_0 = pe.field_b;
                  stackIn_7_0 = stackOut_6_0;
                  break L4;
                } else {
                  stackOut_5_0 = ii.field_e;
                  stackIn_7_0 = stackOut_5_0;
                  break L4;
                }
              }
              return stackIn_7_0;
            }
          } else {
            L5: {
              if (!param0.equals((Object) (Object) ((fg) this).field_o.field_r)) {
                stackOut_17_0 = pe.field_b;
                stackIn_18_0 = stackOut_17_0;
                break L5;
              } else {
                stackOut_16_0 = ii.field_e;
                stackIn_18_0 = stackOut_16_0;
                break L5;
              }
            }
            return stackIn_18_0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"By rating", "By win percentage"};
        field_k = false;
    }
}
