/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends kca {
    static String field_l;
    private tra field_k;
    static int[] field_j;

    oe(tra param0, tra param1) {
        super(param0);
        ((oe) this).field_k = param1;
    }

    final String a(int param0, String param1) {
        nua var3 = null;
        if (((oe) this).field_k instanceof mk) {
            var3 = ((mk) (Object) ((oe) this).field_k).a((byte) 92);
            if (var3 == null) {
                if (param0 == -1) {
                    if (!(param1.equals((Object) (Object) ((oe) this).field_k.field_o))) {
                        return bha.field_q;
                    }
                    return null;
                }
                field_j = null;
                if (!(param1.equals((Object) (Object) ((oe) this).field_k.field_o))) {
                    return bha.field_q;
                }
                return null;
            }
            if (var3.b(-4666) != uh.field_k) {
                return var3.a(103);
            }
            if (!param1.equals((Object) (Object) ((oe) this).field_k.field_o)) {
                return bha.field_q;
            }
            return var3.a(103);
        }
        if (param0 != -1) {
            field_j = null;
            if (!(param1.equals((Object) (Object) ((oe) this).field_k.field_o))) {
                return bha.field_q;
            }
            return null;
        }
        if (!(param1.equals((Object) (Object) ((oe) this).field_k.field_o))) {
            return bha.field_q;
        }
        return null;
    }

    public static void b(byte param0) {
        field_l = null;
        if (param0 != -112) {
            field_j = null;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final it a(byte param0, String param1) {
        nua var3 = null;
        Object var4 = null;
        it stackIn_5_0 = null;
        it stackIn_9_0 = null;
        it stackIn_16_0 = null;
        it stackIn_20_0 = null;
        it stackIn_28_0 = null;
        it stackIn_32_0 = null;
        it stackOut_31_0 = null;
        it stackOut_30_0 = null;
        it stackOut_27_0 = null;
        it stackOut_26_0 = null;
        it stackOut_19_0 = null;
        it stackOut_18_0 = null;
        it stackOut_15_0 = null;
        it stackOut_14_0 = null;
        it stackOut_8_0 = null;
        it stackOut_7_0 = null;
        it stackOut_4_0 = null;
        it stackOut_3_0 = null;
        if (((oe) this).field_k instanceof mk) {
          var3 = ((mk) (Object) ((oe) this).field_k).a((byte) 89);
          if (var3 != null) {
            if (var3.b(param0 ^ -4664) == uh.field_k) {
              if (param0 != 14) {
                L0: {
                  var4 = null;
                  String discarded$3 = ((oe) this).a(63, (String) null);
                  if (!param1.equals((Object) (Object) ((oe) this).field_k.field_o)) {
                    stackOut_31_0 = fp.field_c;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    stackOut_30_0 = uh.field_k;
                    stackIn_32_0 = stackOut_30_0;
                    break L0;
                  }
                }
                return stackIn_32_0;
              } else {
                L1: {
                  if (!param1.equals((Object) (Object) ((oe) this).field_k.field_o)) {
                    stackOut_27_0 = fp.field_c;
                    stackIn_28_0 = stackOut_27_0;
                    break L1;
                  } else {
                    stackOut_26_0 = uh.field_k;
                    stackIn_28_0 = stackOut_26_0;
                    break L1;
                  }
                }
                return stackIn_28_0;
              }
            } else {
              return fp.field_c;
            }
          } else {
            if (param0 != 14) {
              L2: {
                var4 = null;
                String discarded$4 = ((oe) this).a(63, (String) null);
                if (!param1.equals((Object) (Object) ((oe) this).field_k.field_o)) {
                  stackOut_19_0 = fp.field_c;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                } else {
                  stackOut_18_0 = uh.field_k;
                  stackIn_20_0 = stackOut_18_0;
                  break L2;
                }
              }
              return stackIn_20_0;
            } else {
              L3: {
                if (!param1.equals((Object) (Object) ((oe) this).field_k.field_o)) {
                  stackOut_15_0 = fp.field_c;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = uh.field_k;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              return stackIn_16_0;
            }
          }
        } else {
          if (param0 == 14) {
            L4: {
              if (!param1.equals((Object) (Object) ((oe) this).field_k.field_o)) {
                stackOut_8_0 = fp.field_c;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = uh.field_k;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            return stackIn_9_0;
          } else {
            L5: {
              var4 = null;
              String discarded$5 = ((oe) this).a(63, (String) null);
              if (!param1.equals((Object) (Object) ((oe) this).field_k.field_o)) {
                stackOut_4_0 = fp.field_c;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = uh.field_k;
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
        field_l = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_j = new int[]{0, 10, 11};
    }
}
