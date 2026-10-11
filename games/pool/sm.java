/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends om {
    static aj field_C;
    static dd field_z;
    static int field_D;
    static String field_B;
    static String field_E;
    static String field_A;

    public static void c(int param0) {
        field_z = null;
        field_B = null;
        field_A = null;
        field_E = null;
        if (param0 != 2) {
          field_A = (String) null;
        }
        field_C = null;
    }

    private sm(lr param0, int param1) {
        super(param0, param1);
    }

    sm(int param0) {
        this(lc.field_O, param0);
    }

    final static boolean d(int param0) {
        int var1;
        int var2;
        int var3;
        int var1Lifetime1;
        var3 = Pool.field_O;
        if (param0 != -18791) {
          sm.d(72);
        }
        if (!vj.field_c[86]) {
          return false;
        }
        var1 = -1;
        var2 = qi.field_a;
        if (var2 == 16) {
          var1Lifetime1 = 0;
        } else {
          if (var2 != 17) {
            if (var2 == 18) {
              var1Lifetime1 = 2;
            } else {
              if (19 == var2) {
                var1Lifetime1 = 3;
              } else {
                if (var2 == 20) {
                  var1Lifetime1 = 4;
                } else {
                  if (var2 != 21) {
                    if (22 != var2) {
                      if (var2 != 23) {
                        if (var2 == 24) {
                          var1Lifetime1 = 8;
                        } else {
                          if (25 != var2) {
                            return false;
                          }
                          var1Lifetime1 = 9;
                        }
                      } else {
                        var1Lifetime1 = 7;
                      }
                    } else {
                      var1Lifetime1 = 6;
                    }
                  } else {
                    var1Lifetime1 = 5;
                  }
                }
              }
            }
          } else {
            var1Lifetime1 = 1;
          }
        }
        if (vj.field_c[81]) {
          var1Lifetime1 += 10;
        }
        if (vj.field_c[82]) {
          var1Lifetime1 += 20;
        }
        pd.field_i = pd.field_i ^ 1L << var1Lifetime1;
        rq.a(0, var1Lifetime1);
        return true;
    }

    final String c(int param0, ei param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            stackIn_4_0 = v.a(param1.field_m.length(), 0, '*');
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sm.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, bf param1, int param2, pq param3) {
        int fieldTemp$0 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_13_3;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        long var9 = 0L;
        long var9Lifetime1;
        try {
          if (param2 <= 111) {
            return;
          }
          param3.a(param0 - 1, 118);
          var4_int = -param1.field_j + param1.field_l >> 8;
          var5 = param1.field_a - param1.field_f >> 8;
          var6 = rf.a(aj.a(var4_int, false, var4_int) + aj.a(var5, false, var5), -123);
          var4_int = lh.a(var6, (byte) -101, (long)var4_int);
          var5 = lh.a(var6, (byte) -61, (long)var5);
          var7 = param3.e(-14770);
          if (param1.field_f != param1.field_a) {
            if (param1.field_l != param1.field_j) {
              var9 = (long)(aj.a(param3.field_I, false, var4_int) + aj.a(param3.field_t, false, var5));
              param3.field_I = (int)((long)param3.field_I - (od.a((long)var4_int, var9, false) * (long)(256 + dj.field_g) >> 8));
              param3.field_t = (int)((long)param3.field_t - (od.a((long)var5, var9, false) * (long)(256 + dj.field_g) >> 8));
              param3.field_b = 0;
              param3.field_n = 0;
              if (td.field_b < nn.field_e.length) {
                nn.field_e[td.field_b][0] = -(524288 * var4_int) + param3.field_g;
                nn.field_e[td.field_b][1] = param3.field_k - var5 * 524288;
                nn.field_e[td.field_b][2] = -524288;
              }
            } else {
              param3.field_n = -(param3.field_n * kp.field_m) >> 8;
              param3.field_b = param3.field_b * kp.field_m >> 8;
              param3.field_t = -(dj.field_g * param3.field_t) >> 8;
              if (td.field_b < nn.field_e.length) {
                nn.field_e[td.field_b][0] = param3.field_g;
                stackIn_12_0 = nn.field_e[td.field_b];
                stackIn_12_1 = 1;
                stackIn_12_2 = param3.field_k;
                if (param3.field_k > param1.field_j) {
                  stackIn_13_3 = 524288;
                } else {
                  stackIn_13_3 = -524288;
                }
                stackIn_12_0[stackIn_12_1] = stackIn_12_2 + stackIn_13_3;
                nn.field_e[td.field_b][2] = -524288;
              }
            }
          } else {
            param3.field_n = param3.field_n * kp.field_m >> 8;
            param3.field_I = -(param3.field_I * dj.field_g) >> 8;
            param3.field_b = -(kp.field_m * param3.field_b) >> 8;
            if (td.field_b < nn.field_e.length) {
              stackIn_6_0 = nn.field_e[td.field_b];
              stackIn_6_1 = 0;
              if (param3.field_g > param1.field_a) {
                stackIn_7_2 = 524288;
              } else {
                stackIn_7_2 = -524288;
              }
              stackIn_6_0[stackIn_6_1] = stackIn_7_2 + param3.field_g;
              nn.field_e[td.field_b][1] = param3.field_k;
              nn.field_e[td.field_b][2] = -524288;
            }
          }
          param3.field_K = kp.field_m * param3.field_K >> 8;
          param3.field_v = 1;
          var9Lifetime1 = param3.e(-14770);
          if (td.field_b < cf.field_g.length) {
            fieldTemp$0 = td.field_b;
            td.field_b = td.field_b + 1;
            cf.field_g[fieldTemp$0] = (int)(var7 - var9Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("sm.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static wc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        wc stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -40 / ((param1 - 36) / 53);
          if (ra.field_e == pa.field_I) {
            stackIn_2_0 = null;
            return (wc) (stackIn_2_0);
          }
          if (td.field_f == pa.field_I &&
            param0.equals(l.field_c)) {
            pa.field_I = aa.field_c;
            stackIn_6_0 = uf.field_gb;
            return stackIn_6_0;
          }
          l.field_c = param0;
          uf.field_gb = null;
          pa.field_I = ra.field_e;
          stackIn_8_0 = null;
          return (wc) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("sm.FA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_B = "Use the mouse wheel <img=1> or drag <img=11><img=0> to zoom in and out.";
        field_E = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_A = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
