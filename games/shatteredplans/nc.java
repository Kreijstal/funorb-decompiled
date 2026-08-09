/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends oh {
    nc field_k;
    float field_h;
    ln field_q;
    nc field_r;
    static int field_t;
    static pf field_v;
    static int[] field_p;
    float field_o;
    ln field_u;
    float field_i;
    float field_l;
    float field_j;
    static String field_m;
    float field_s;
    static String field_n;

    final static int a(int param0) {
        if (param0 >= -77) {
            return 20;
        }
        return 1;
    }

    final static void a(nf param0, int param1) {
        int var2_int = 0;
        nf var3 = null;
        int var4 = 0;
        nf var5 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                var5 = (nf) null;
                nc.a((nf) null, 0);
                break L1;
              }
            }
            if (param0.field_k == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                L3: {
                  if (param0.field_l != 0) {
                    break L3;
                  } else {
                    if (-1 != (param0.field_e ^ -1)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L4: while (true) {
                  if (var2_int >= da.field_g) {
                    break L2;
                  } else {
                    L5: {
                      var3 = wm.field_d[var2_int];
                      if (2 != var3.field_n) {
                        break L5;
                      } else {
                        if (param0.field_l != var3.field_l) {
                          break L5;
                        } else {
                          if (param0.field_e == var3.field_e) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L4;
                  }
                }
              }
              L6: {
                if (param0.field_f != null) {
                  jj.field_o = param0.field_b;
                  bq.field_e = param0.field_p;
                  uo.field_f = param0.field_f;
                  tl.field_D = param0.field_n;
                  break L6;
                } else {
                  break L6;
                }
              }
              ei.a((byte) 70, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("nc.E(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static String a(String param0, bc param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1.b((byte) 115)) {
              var4_int = -57 % ((-25 - param2) / 51);
              stackIn_4_0 = param3 + " - " + param1.d(100) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("nc.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void d(int param0) {
        field_v = null;
        field_n = null;
        field_m = null;
        field_p = null;
        if (param0 != -1) {
            field_t = 125;
        }
    }

    nc(ln param0, ln param1) {
        try {
            this.field_k = null;
            this.field_q = param0;
            this.field_u = param1;
            this.field_r = null;
            this.field_o = 10000.0f;
            this.field_i = (float)(-this.field_q.field_S + this.field_u.field_S);
            this.field_l = (float)(this.field_u.field_S + this.field_q.field_S) / 2.0f;
            this.field_s = (float)(this.field_q.field_A - this.field_u.field_A);
            this.field_j = -10000.0f;
            this.field_h = (float)(this.field_q.field_A - -this.field_u.field_A) / 2.0f;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    nc(ln param0, nc param1, nc param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_h = (float)(param5 + param3) / 2.0f;
            this.field_j = -1.0f;
            this.field_s = (float)(-param4 + param6) / 2.0f;
            this.field_l = (float)(param4 + param6) / 2.0f;
            this.field_i = (float)(param5 - param3) / 2.0f;
            this.field_k = param2;
            this.field_o = 1.0f;
            this.field_r = param1;
            this.field_u = null;
            this.field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_v = null;
        field_p = new int[12];
        field_m = "Create your own free Jagex account";
        field_n = "You need to play <%0> more rated games to unlock this option.";
        field_t = 0;
    }
}
