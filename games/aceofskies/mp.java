/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends vo {
    static pa field_h;
    static String field_e;
    private boolean field_f;
    static volatile int field_g;
    private String field_i;

    final pt a(String param0, int param1) {
        fr var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        pt stackIn_3_0 = null;
        pt stackIn_12_0 = null;
        pt stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            if (!qf.a(var5, 0)) {
              stackIn_3_0 = bt.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 8192) {
                  break L1;
                } else {
                  var4 = (String) null;
                  this.a((String) null, (byte) -114);
                  break L1;
                }
              }
              L2: {
                if (!param0.equals(this.field_i)) {
                  L3: {
                    var3 = hg.a(param1 ^ 2147475455, param0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_f != null) {
                        break L3;
                      } else {
                        this.field_f = var3.field_b;
                        this.field_i = param0;
                        break L2;
                      }
                    }
                  }
                  stackIn_12_0 = ce.field_t;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (!this.field_f) {
                  stackIn_17_0 = bt.field_a;
                  break L4;
                } else {
                  stackIn_17_0 = fd.field_a;
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

            stackIn_20_1 = new StringBuilder().append("mp.DA(");

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
          throw pn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    mp(bm param0) {
        super(param0);
        this.field_f = false;
    }

    public static void c(byte param0) {
        if (param0 != -11) {
            mp.c((byte) -28);
            field_e = null;
            field_h = null;
            return;
        }
        field_e = null;
        field_h = null;
    }

    final void e(int param0) {
        this.field_i = null;
        if (param0 >= -86) {
            mp.c((byte) 34);
        }
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        fr var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 72) {
              var5 = (CharSequence) ((Object) param0);
              var3 = ee.a(var5, 0);
              if (var3 == null) {
                L1: {
                  if (!param0.equals(this.field_i)) {
                    var4 = hg.a(2147483647, param0);
                    if (var4 != null) {
                      if (var4.field_f == null) {
                        this.field_f = var4.field_b;
                        this.field_i = param0;
                        break L1;
                      } else {
                        stackIn_12_0 = null;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    break L1;
                  }
                }
                if (this.field_f) {
                  stackIn_18_0 = dk.field_k;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackIn_16_0 = tb.field_e;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_5_0 = (String) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("mp.EA(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L2;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (String) ((Object) stackIn_12_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                return stackIn_18_0;
              }
            }
          }
        }
    }

    static {
        field_e = "Loading...";
        field_g = 0;
    }
}
