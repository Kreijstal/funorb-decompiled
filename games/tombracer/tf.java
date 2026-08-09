/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends kca {
    private boolean field_k;
    private String field_j;

    tf(tra param0) {
        super(param0);
        this.field_k = false;
    }

    final it a(byte param0, String param1) {
        jua var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        it stackIn_4_0 = null;
        it stackIn_10_0 = null;
        it stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 14) {
                break L1;
              } else {
                this.field_j = (String) null;
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param1);
            if (pta.a(var4, 0)) {
              L2: {
                if (param1.equals(this.field_j)) {
                  break L2;
                } else {
                  L3: {
                    var3 = hd.a(param0 ^ 112, param1);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_b == null) {
                        this.field_j = param1;
                        this.field_k = var3.field_e;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_10_0 = tea.field_b;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L4: {
                if (this.field_k) {
                  stackIn_15_0 = uh.field_k;
                  break L4;
                } else {
                  stackIn_15_0 = fp.field_c;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_4_0 = fp.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("tf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        jua var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            var3 = ina.a((byte) -16, var5);
            if (var3 != null) {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1.equals(this.field_j)) {
                  break L1;
                } else {
                  var4 = hd.a(120, param1);
                  if (var4 != null) {
                    if (null == var4.field_b) {
                      this.field_j = param1;
                      this.field_k = var4.field_e;
                      break L1;
                    } else {
                      stackIn_9_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_k) {
                L2: {
                  if (param0 == -1) {
                    break L2;
                  } else {
                    this.field_k = false;
                    break L2;
                  }
                }
                stackIn_17_0 = jla.field_B;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_13_0 = qma.field_f;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("tf.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    final void b(byte param0) {
        this.field_j = null;
        if (param0 != -69) {
            this.b((byte) -119);
        }
    }

    static {
    }
}
