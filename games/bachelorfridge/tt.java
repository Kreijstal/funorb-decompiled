/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt extends aba {
    private String field_g;
    static String field_h;
    private boolean field_i;

    tt(lka param0) {
        super(param0);
        this.field_i = false;
    }

    final void d(int param0) {
        this.field_g = null;
        if (param0 >= -106) {
            this.field_i = false;
        }
    }

    public static void e(byte param0) {
        field_h = null;
        if (param0 != 84) {
            tt.e(110);
        }
    }

    final static String e(int param0) {
        if (!(ola.field_p != kq.field_j)) {
            return sc.field_n;
        }
        if (!(ut.field_m.a(false))) {
            return ut.field_m.b(25477);
        }
        if (param0 != 21240) {
            return (String) null;
        }
        if (!(kq.field_j != dka.field_G)) {
            return ut.field_m.b(25477);
        }
        return dk.field_p;
    }

    final jg a(String param0, boolean param1) {
        eq var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_10_0 = null;
        jg stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (!vq.a((byte) -60, var4)) {
              stackIn_3_0 = jt.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param0.equals(this.field_g)) {
                  L2: {
                    var3 = du.a(param0, (byte) -43);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (var3.field_g != null) {
                        break L2;
                      } else {
                        this.field_g = param0;
                        this.field_i = var3.field_e;
                        break L1;
                      }
                    }
                  }
                  stackIn_10_0 = ji.field_f;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
              L3: {
                if (!param1) {
                  break L3;
                } else {
                  field_h = (String) null;
                  break L3;
                }
              }
              L4: {
                if (!this.field_i) {
                  stackIn_17_0 = jt.field_f;
                  break L4;
                } else {
                  stackIn_17_0 = cm.field_u;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("tt.C(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        eq var4_ref_eq = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            var3 = hp.a(var5, 0);
            if (var3 == null) {
              L1: {
                if (param1.equals(this.field_g)) {
                  break L1;
                } else {
                  var4_ref_eq = du.a(param1, (byte) -43);
                  if (var4_ref_eq != null) {
                    if (null == var4_ref_eq.field_g) {
                      this.field_i = var4_ref_eq.field_e;
                      this.field_g = param1;
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_i) {
                var4 = -59 % ((-8 - param0) / 45);
                stackIn_14_0 = su.field_a;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_12_0 = uga.field_A;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("tt.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    static {
        field_h = "Reload game";
    }
}
