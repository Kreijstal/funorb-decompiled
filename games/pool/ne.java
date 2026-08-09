/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends ig {
    static int field_w;
    static int field_q;
    static int field_v;
    static ko field_r;
    private sl field_p;
    static int field_s;
    static volatile int field_o;
    static int field_m;
    static od field_u;
    static dd[] field_t;
    static int field_n;

    final na a(String param0, boolean param1) {
        ip var3 = null;
        RuntimeException var3_ref = null;
        na stackIn_6_0 = null;
        na stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.field_p = (sl) null;
                break L1;
              }
            }
            L2: {
              if (!(this.field_p instanceof sc)) {
                break L2;
              } else {
                var3 = ((sc) ((Object) this.field_p)).a(83);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.c(-31873) == kr.field_e) {
                    break L2;
                  } else {
                    stackIn_6_0 = gp.field_d;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            L3: {
              if (param0.equals(this.field_p.field_m)) {
                stackIn_10_0 = kr.field_e;
                break L3;
              } else {
                stackIn_10_0 = gp.field_d;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ne.K(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_10_0;
        }
    }

    public static void b(byte param0) {
        field_u = null;
        if (param0 != 15) {
            field_q = 105;
            field_r = null;
            field_t = null;
            return;
        }
        field_r = null;
        field_t = null;
    }

    final String a(String param0, int param1) {
        ip var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              L1: {
                if (this.field_p instanceof sc) {
                  var3 = ((sc) ((Object) this.field_p)).a(-11);
                  if (var3 == null) {
                    break L1;
                  } else {
                    L2: {
                      if (var3.c(-31873) != kr.field_e) {
                        break L2;
                      } else {
                        if (!param0.equals(this.field_p.field_m)) {
                          stackIn_10_0 = rk.field_i;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_12_0 = var3.a(73);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              if (!param0.equals(this.field_p.field_m)) {
                stackIn_16_0 = rk.field_i;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("ne.L(");

            if (param0 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    ne(sl param0, sl param1) {
        super(param0);
        try {
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_v = 12;
        field_s = 0;
        field_o = 0;
        field_r = new ko();
        field_m = -1;
        field_n = -1;
    }
}
