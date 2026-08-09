/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends ip {
    static String field_m;
    static String field_r;
    static hl field_n;
    private rm field_p;
    static String field_q;
    static ph field_o;
    static wk field_s;

    final String a(byte param0, String param1) {
        dp var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 44) {
                break L1;
              } else {
                var4 = (String) null;
                this.a((String) null, -75);
                break L1;
              }
            }
            L2: {
              if (!(this.field_p instanceof qn)) {
                break L2;
              } else {
                var3 = ((qn) ((Object) this.field_p)).a(-79);
                if (var3 != null) {
                  L3: {
                    if (var3.a((byte) -117) != c.field_d) {
                      break L3;
                    } else {
                      if (!param1.equals(this.field_p.field_w)) {
                        stackIn_9_0 = ep.field_j;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_11_0 = var3.a(true);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (!param1.equals(this.field_p.field_w)) {
              stackIn_15_0 = ep.field_j;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("be.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final od a(String param0, int param1) {
        dp var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        od stackIn_5_0 = null;
        od stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_p instanceof qn) {
                var3 = ((qn) ((Object) this.field_p)).a(-122);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a((byte) -99) == c.field_d) {
                    break L1;
                  } else {
                    stackIn_5_0 = pd.field_J;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = -81 / ((5 - param1) / 44);
              if (param0.equals(this.field_p.field_w)) {
                stackIn_9_0 = c.field_d;
                break L2;
              } else {
                stackIn_9_0 = pd.field_J;
                break L2;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("be.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_9_0;
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_s = null;
        field_m = null;
        field_n = null;
        if (param0 != -15818) {
          field_n = (hl) null;
          field_o = null;
          field_r = null;
          return;
        } else {
          field_o = null;
          field_r = null;
          return;
        }
    }

    be(rm param0, rm param1) {
        super(param0);
        try {
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "be.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = null;
        field_m = "You must have had your dungeon reset by an Orb of Mastery once to earn the title of <%1>.";
        field_q = "CHARGE ORB";
        field_r = "Cancel";
    }
}
