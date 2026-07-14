/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends kca {
    private boolean field_k;
    private String field_j;

    tf(tra param0) {
        super(param0);
        ((tf) this).field_k = false;
    }

    final it a(byte param0, String param1) {
        jua var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        it stackIn_7_0 = null;
        it stackIn_14_0 = null;
        it stackIn_23_0 = null;
        it stackIn_30_0 = null;
        it stackOut_29_0 = null;
        it stackOut_28_0 = null;
        it stackOut_22_0 = null;
        it stackOut_21_0 = null;
        it stackOut_13_0 = null;
        it stackOut_12_0 = null;
        it stackOut_6_0 = null;
        it stackOut_5_0 = null;
        if (param0 == 14) {
          var5 = (CharSequence) (Object) param1;
          if (pta.a(var5, 0)) {
            if (!param1.equals((Object) (Object) ((tf) this).field_j)) {
              var3 = hd.a(param0 ^ 112, param1);
              if (var3 != null) {
                if (var3.field_b != null) {
                  return tea.field_b;
                } else {
                  L0: {
                    ((tf) this).field_j = param1;
                    ((tf) this).field_k = var3.field_e;
                    if (((tf) this).field_k) {
                      stackOut_29_0 = uh.field_k;
                      stackIn_30_0 = stackOut_29_0;
                      break L0;
                    } else {
                      stackOut_28_0 = fp.field_c;
                      stackIn_30_0 = stackOut_28_0;
                      break L0;
                    }
                  }
                  return stackIn_30_0;
                }
              } else {
                return tea.field_b;
              }
            } else {
              L1: {
                if (((tf) this).field_k) {
                  stackOut_22_0 = uh.field_k;
                  stackIn_23_0 = stackOut_22_0;
                  break L1;
                } else {
                  stackOut_21_0 = fp.field_c;
                  stackIn_23_0 = stackOut_21_0;
                  break L1;
                }
              }
              return stackIn_23_0;
            }
          } else {
            return fp.field_c;
          }
        } else {
          ((tf) this).field_j = null;
          var4 = (CharSequence) (Object) param1;
          if (pta.a(var4, 0)) {
            if (!param1.equals((Object) (Object) ((tf) this).field_j)) {
              var3 = hd.a(param0 ^ 112, param1);
              if (var3 != null) {
                if (var3.field_b != null) {
                  return tea.field_b;
                } else {
                  L2: {
                    ((tf) this).field_j = param1;
                    ((tf) this).field_k = var3.field_e;
                    if (((tf) this).field_k) {
                      stackOut_13_0 = uh.field_k;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = fp.field_c;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  return stackIn_14_0;
                }
              } else {
                return tea.field_b;
              }
            } else {
              L3: {
                if (((tf) this).field_k) {
                  stackOut_6_0 = uh.field_k;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = fp.field_c;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              return stackIn_7_0;
            }
          } else {
            return fp.field_c;
          }
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        jua var4 = null;
        CharSequence var5 = null;
        var5 = (CharSequence) (Object) param1;
        var3 = ina.a((byte) -16, var5);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param1.equals((Object) (Object) ((tf) this).field_j)) {
              break L0;
            } else {
              var4 = hd.a(120, param1);
              if (var4 != null) {
                if (null == var4.field_b) {
                  ((tf) this).field_j = param1;
                  ((tf) this).field_k = var4.field_e;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
          if (((tf) this).field_k) {
            if (param0 != -1) {
              ((tf) this).field_k = false;
              return jla.field_B;
            } else {
              return jla.field_B;
            }
          } else {
            return qma.field_f;
          }
        }
    }

    final void b(byte param0) {
        ((tf) this).field_j = null;
        if (param0 != -69) {
            ((tf) this).b((byte) -119);
        }
    }

    static {
    }
}
