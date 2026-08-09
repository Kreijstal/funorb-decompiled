/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends um {
    private nn field_x;
    static int field_u;
    static String field_q;
    static String field_s;
    static int field_w;
    static long[] field_r;
    static String[] field_v;
    static hl field_t;

    final jk a(int param0, String param1) {
        vm var3 = null;
        RuntimeException var3_ref = null;
        jk stackIn_2_0 = null;
        jk stackIn_9_0 = null;
        jk stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 0) {
              L1: {
                if (this.field_x instanceof uc) {
                  var3 = ((uc) ((Object) this.field_x)).a(-123);
                  if (var3 == null) {
                    break L1;
                  } else {
                    if (var3.c(-36) != pf.field_a) {
                      stackIn_9_0 = db.field_h;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1.equals(this.field_x.field_A)) {
                  stackIn_13_0 = pf.field_a;
                  break L2;
                } else {
                  stackIn_13_0 = db.field_h;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = (jk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("cb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    cb(nn param0, nn param1) {
        super(param0);
        try {
            this.field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_r = null;
        field_t = null;
        field_q = null;
        field_s = null;
        if (param0 < 62) {
          cb.d((byte) -92);
          field_v = null;
          return;
        } else {
          field_v = null;
          return;
        }
    }

    final String a(String param0, int param1) {
        vm var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_x instanceof uc) {
                var3 = ((uc) ((Object) this.field_x)).a(-126);
                if (var3 != null) {
                  L2: {
                    if (var3.c(-64) != pf.field_a) {
                      break L2;
                    } else {
                      if (param0.equals(this.field_x.field_A)) {
                        break L2;
                      } else {
                        stackIn_7_0 = tl.field_N;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_9_0 = var3.a((byte) -73);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (!param0.equals(this.field_x.field_A)) {
              stackIn_13_0 = tl.field_N;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if (param1 != 26202) {
                stackIn_17_0 = (String) null;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3_ref);

            stackIn_21_1 = new StringBuilder().append("cb.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    static {
        field_q = "Find opponents";
        field_r = new long[1000];
        field_w = 360;
        field_s = "Game full";
    }
}
