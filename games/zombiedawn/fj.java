/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends pm {
    private tb field_f;
    static vo field_i;
    static char[] field_h;
    static am field_g;

    final static vn a(vn param0, int param1, int param2, boolean param3) {
        ki.a((byte) -116, md.field_vb);
        if (param2 != 339) {
          return null;
        } else {
          bi.d();
          param0.b(3, 3);
          ho.a(md.field_vb, param3, param1, -109);
          pa.a(-21189);
          return md.field_vb;
        }
    }

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = -102 / ((29 - param1) / 54);
        if (-1 == param0) {
          return true;
        } else {
          L0: {
            if ((hf.field_I & 1 << param0) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    fj(tb param0, tb param1) {
        super(param0);
        ((fj) this).field_f = param1;
    }

    public static void e(byte param0) {
        field_h = null;
        field_i = null;
        field_g = null;
        if (param0 >= -120) {
            field_i = null;
        }
    }

    final String a(String param0, byte param1) {
        vc var3 = null;
        Object var4 = null;
        if (((fj) this).field_f instanceof mi) {
          var3 = ((mi) (Object) ((fj) this).field_f).a(0);
          if (var3 != null) {
            if (var3.a((byte) -75) == mc.field_g) {
              if (param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
                return var3.b((byte) -125);
              } else {
                return ne.field_a;
              }
            } else {
              return var3.b((byte) -125);
            }
          } else {
            if (param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
              if (param1 < -94) {
                return null;
              } else {
                var4 = null;
                String discarded$2 = ((fj) this).a((String) null, (byte) -42);
                return null;
              }
            } else {
              return ne.field_a;
            }
          }
        } else {
          if (param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
            if (param1 < -94) {
              return null;
            } else {
              var4 = null;
              String discarded$3 = ((fj) this).a((String) null, (byte) -42);
              return null;
            }
          } else {
            return ne.field_a;
          }
        }
    }

    final rh a(String param0, int param1) {
        vc var3 = null;
        rh stackIn_5_0 = null;
        rh stackIn_9_0 = null;
        rh stackIn_16_0 = null;
        rh stackIn_20_0 = null;
        rh stackIn_28_0 = null;
        rh stackIn_32_0 = null;
        rh stackOut_31_0 = null;
        rh stackOut_30_0 = null;
        rh stackOut_27_0 = null;
        rh stackOut_26_0 = null;
        rh stackOut_19_0 = null;
        rh stackOut_18_0 = null;
        rh stackOut_15_0 = null;
        rh stackOut_14_0 = null;
        rh stackOut_8_0 = null;
        rh stackOut_7_0 = null;
        rh stackOut_4_0 = null;
        rh stackOut_3_0 = null;
        if (((fj) this).field_f instanceof mi) {
          var3 = ((mi) (Object) ((fj) this).field_f).a(0);
          if (var3 != null) {
            if (var3.a((byte) -105) == mc.field_g) {
              if (param1 != 2) {
                L0: {
                  ((fj) this).field_f = null;
                  if (!param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
                    stackOut_31_0 = uc.field_b;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    stackOut_30_0 = mc.field_g;
                    stackIn_32_0 = stackOut_30_0;
                    break L0;
                  }
                }
                return stackIn_32_0;
              } else {
                L1: {
                  if (!param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
                    stackOut_27_0 = uc.field_b;
                    stackIn_28_0 = stackOut_27_0;
                    break L1;
                  } else {
                    stackOut_26_0 = mc.field_g;
                    stackIn_28_0 = stackOut_26_0;
                    break L1;
                  }
                }
                return stackIn_28_0;
              }
            } else {
              return uc.field_b;
            }
          } else {
            if (param1 != 2) {
              L2: {
                ((fj) this).field_f = null;
                if (!param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
                  stackOut_19_0 = uc.field_b;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                } else {
                  stackOut_18_0 = mc.field_g;
                  stackIn_20_0 = stackOut_18_0;
                  break L2;
                }
              }
              return stackIn_20_0;
            } else {
              L3: {
                if (!param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
                  stackOut_15_0 = uc.field_b;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = mc.field_g;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              return stackIn_16_0;
            }
          }
        } else {
          if (param1 == 2) {
            L4: {
              if (!param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
                stackOut_8_0 = uc.field_b;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = mc.field_g;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            return stackIn_9_0;
          } else {
            L5: {
              ((fj) this).field_f = null;
              if (!param0.equals((Object) (Object) ((fj) this).field_f.field_o)) {
                stackOut_4_0 = uc.field_b;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = mc.field_g;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_i = new vo();
    }
}
