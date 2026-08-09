/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends cb {
    static String field_k;
    static String field_j;
    static bg field_l;
    private ui field_i;

    final ag a(String param0, int param1) {
        jm var3 = null;
        RuntimeException var3_ref = null;
        sb var4 = null;
        ag stackIn_4_0 = null;
        ag stackIn_10_0 = null;
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
              if (!(this.field_i instanceof sg)) {
                break L1;
              } else {
                var3 = ((sg) ((Object) this.field_i)).a(35);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.b(24595) == sc.field_a) {
                    break L1;
                  } else {
                    stackIn_4_0 = fg.field_d;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            L2: {
              if (param1 == 5) {
                break L2;
              } else {
                var4 = (sb) null;
                jg.a((java.math.BigInteger) null, 33, (sb) null, (java.math.BigInteger) null, (sb) null);
                break L2;
              }
            }
            L3: {
              if (!param0.equals(this.field_i.field_s)) {
                stackIn_10_0 = fg.field_d;
                break L3;
              } else {
                stackIn_10_0 = sc.field_a;
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

            stackIn_13_1 = new StringBuilder().append("jg.D(");

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
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_10_0;
        }
    }

    jg(ui param0, ui param1) {
        super(param0);
        try {
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_j = null;
        if (param0 != 23) {
            return;
        }
        field_k = null;
    }

    final static void a(String param0, String param1, int param2, boolean param3) {
        try {
            pl.field_a = param1;
            ch.field_g = param0;
            if (param2 >= -100) {
                jg.b((byte) -17);
            }
            t.a(param3, rf.field_a, 0);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "jg.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String a(byte param0, String param1) {
        jm var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_15_0 = null;
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
              if (this.field_i instanceof sg) {
                var3 = ((sg) ((Object) this.field_i)).a(35);
                if (var3 != null) {
                  L2: {
                    if (var3.b(24595) != sc.field_a) {
                      break L2;
                    } else {
                      if (param1.equals(this.field_i.field_s)) {
                        break L2;
                      } else {
                        stackIn_7_0 = sb.field_q;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackIn_9_0 = var3.a(7320);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (!param1.equals(this.field_i.field_s)) {
              stackIn_13_0 = sb.field_q;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              var3_int = -95 / ((param0 - 49) / 56);
              stackIn_15_0 = null;
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("jg.C(").append(param0).append(',');

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
          throw lj.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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
              return (String) ((Object) stackIn_15_0);
            }
          }
        }
    }

    final static void a(java.math.BigInteger param0, int param1, sb param2, java.math.BigInteger param3, sb param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              eg.a(0, (byte) 90, param2.field_u, param2.field_o, param3, param4, param0);
              if (param1 < -94) {
                break L1;
              } else {
                jg.b((byte) -48);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jg.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_k = "Drowned By Greed";
        field_j = "Please try again in a few minutes.";
        field_l = new bg(15, 0, 1, 0);
    }
}
