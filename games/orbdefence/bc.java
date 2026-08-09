/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends hi {
    private String field_p;
    static int[] field_o;
    static String[] field_t;
    static hj[] field_q;
    private boolean field_n;
    static String field_s;
    static int field_r;

    final qd a(String param0, byte param1) {
        qj var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        qd stackIn_3_0 = null;
        qd stackIn_9_0 = null;
        qd stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (!dk.a(var4, 5408)) {
              stackIn_3_0 = vh.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0.equals(this.field_p)) {
                  break L1;
                } else {
                  L2: {
                    var3 = lf.a(param0, true);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (var3.field_e != null) {
                        break L2;
                      } else {
                        this.field_n = var3.field_f;
                        this.field_p = param0;
                        break L1;
                      }
                    }
                  }
                  stackIn_9_0 = uj.field_b;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L3: {
                if (param1 == -99) {
                  break L3;
                } else {
                  this.b((byte) -37);
                  break L3;
                }
              }
              L4: {
                if (this.field_n) {
                  stackIn_16_0 = nc.field_bb;
                  break L4;
                } else {
                  stackIn_16_0 = vh.field_h;
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
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("bc.C(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        qj var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        String stackIn_15_0 = null;
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
              if (param0 == -11300) {
                break L1;
              } else {
                field_s = (String) null;
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param1);
            var3 = ki.a(-1, var5);
            if (var3 == null) {
              L2: {
                if (param1.equals(this.field_p)) {
                  break L2;
                } else {
                  var4 = lf.a(param1, true);
                  if (var4 != null) {
                    if (var4.field_e == null) {
                      this.field_n = var4.field_f;
                      this.field_p = param1;
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (!this.field_n) {
                stackIn_15_0 = j.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return kf.field_b;
              }
            } else {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("bc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_15_0;
        }
    }

    public static void c(byte param0) {
        if (param0 != -97) {
            return;
        }
        field_t = null;
        field_s = null;
        field_o = null;
        field_q = null;
    }

    bc(vi param0) {
        super(param0);
        this.field_n = false;
    }

    final void b(byte param0) {
        this.field_p = null;
        if (param0 <= 59) {
            field_t = (String[]) null;
        }
    }

    static {
        field_s = "Type your email address again to make sure it's correct";
    }
}
