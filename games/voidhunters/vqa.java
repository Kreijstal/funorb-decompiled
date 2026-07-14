/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vqa extends eca {
    static int field_k;
    static goa field_i;
    static String field_f;
    static uca field_g;
    static String field_j;
    private uf field_h;

    final qrb a(String param0, int param1) {
        eeb var3 = null;
        qrb stackIn_5_0 = null;
        qrb stackIn_9_0 = null;
        qrb stackIn_18_0 = null;
        qrb stackIn_22_0 = null;
        qrb stackIn_28_0 = null;
        qrb stackIn_32_0 = null;
        qrb stackOut_31_0 = null;
        qrb stackOut_30_0 = null;
        qrb stackOut_27_0 = null;
        qrb stackOut_26_0 = null;
        qrb stackOut_21_0 = null;
        qrb stackOut_20_0 = null;
        qrb stackOut_17_0 = null;
        qrb stackOut_16_0 = null;
        qrb stackOut_8_0 = null;
        qrb stackOut_7_0 = null;
        qrb stackOut_4_0 = null;
        qrb stackOut_3_0 = null;
        if (((vqa) this).field_h instanceof lca) {
          var3 = ((lca) (Object) ((vqa) this).field_h).a(-782444220);
          if (var3 == null) {
            if (param1 != 16384) {
              L0: {
                field_k = -96;
                if (param0.equals((Object) (Object) ((vqa) this).field_h.field_j)) {
                  stackOut_31_0 = lea.field_o;
                  stackIn_32_0 = stackOut_31_0;
                  break L0;
                } else {
                  stackOut_30_0 = cca.field_o;
                  stackIn_32_0 = stackOut_30_0;
                  break L0;
                }
              }
              return stackIn_32_0;
            } else {
              L1: {
                if (param0.equals((Object) (Object) ((vqa) this).field_h.field_j)) {
                  stackOut_27_0 = lea.field_o;
                  stackIn_28_0 = stackOut_27_0;
                  break L1;
                } else {
                  stackOut_26_0 = cca.field_o;
                  stackIn_28_0 = stackOut_26_0;
                  break L1;
                }
              }
              return stackIn_28_0;
            }
          } else {
            if (var3.a((byte) 35) == lea.field_o) {
              if (param1 == 16384) {
                L2: {
                  if (param0.equals((Object) (Object) ((vqa) this).field_h.field_j)) {
                    stackOut_21_0 = lea.field_o;
                    stackIn_22_0 = stackOut_21_0;
                    break L2;
                  } else {
                    stackOut_20_0 = cca.field_o;
                    stackIn_22_0 = stackOut_20_0;
                    break L2;
                  }
                }
                return stackIn_22_0;
              } else {
                L3: {
                  field_k = -96;
                  if (param0.equals((Object) (Object) ((vqa) this).field_h.field_j)) {
                    stackOut_17_0 = lea.field_o;
                    stackIn_18_0 = stackOut_17_0;
                    break L3;
                  } else {
                    stackOut_16_0 = cca.field_o;
                    stackIn_18_0 = stackOut_16_0;
                    break L3;
                  }
                }
                return stackIn_18_0;
              }
            } else {
              return cca.field_o;
            }
          }
        } else {
          if (param1 == 16384) {
            L4: {
              if (param0.equals((Object) (Object) ((vqa) this).field_h.field_j)) {
                stackOut_8_0 = lea.field_o;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = cca.field_o;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            return stackIn_9_0;
          } else {
            L5: {
              field_k = -96;
              if (param0.equals((Object) (Object) ((vqa) this).field_h.field_j)) {
                stackOut_4_0 = lea.field_o;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = cca.field_o;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final String b(String param0, int param1) {
        eeb var3 = null;
        if (((vqa) this).field_h instanceof lca) {
          var3 = ((lca) (Object) ((vqa) this).field_h).a(-782444220);
          if (var3 == null) {
            if (param0.equals((Object) (Object) ((vqa) this).field_h.field_j)) {
              if (param1 == -1) {
                return null;
              } else {
                vqa.f(108);
                return null;
              }
            } else {
              return lmb.field_a;
            }
          } else {
            if (var3.a((byte) 35) == lea.field_o) {
              if (param0.equals((Object) (Object) ((vqa) this).field_h.field_j)) {
                return var3.c((byte) -79);
              } else {
                return lmb.field_a;
              }
            } else {
              return var3.c((byte) -79);
            }
          }
        } else {
          if (param0.equals((Object) (Object) ((vqa) this).field_h.field_j)) {
            if (param1 == -1) {
              return null;
            } else {
              vqa.f(108);
              return null;
            }
          } else {
            return lmb.field_a;
          }
        }
    }

    public static void f(int param0) {
        if (param0 != 1) {
            return;
        }
        field_i = null;
        field_j = null;
        field_f = null;
        field_g = null;
    }

    vqa(uf param0, uf param1) {
        super(param0);
        ((vqa) this).field_h = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 1;
        field_f = "Add action (Set custom variable label)";
        field_j = "Encouraging rule breaking";
        nf discarded$0 = new nf();
    }
}
