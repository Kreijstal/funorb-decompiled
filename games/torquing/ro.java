/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ro extends am {
    int[] field_s;
    static String field_t;
    int field_u;
    static int field_w;
    static long field_v;
    int field_x;
    private int field_y;

    int[][] a(int param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int[][] var3;
        int[] var4;
        int[] var5;
        int[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[][] var12;
        int[][] var13;
        int[][] var14;
        L0: {
          var11 = Torquing.field_u;
          var14 = this.field_r.a(15142, param1);
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (!this.field_r.field_b) {
            break L0;
          } else {
            if (this.c(-31292)) {
              L1: {
                var4 = var14[0];
                var5 = var14[1];
                var6 = var14[2];
                if (this.field_u == um.field_o) {
                  stackIn_6_0 = param1;
                  break L1;
                } else {
                  stackIn_6_0 = this.field_u * param1 / um.field_o;
                  break L1;
                }
              }
              var7 = stackIn_6_0 * this.field_x;
              if (this.field_x == ci.field_c) {
                var8 = 0;
                L2: while (true) {
                  if (var8 >= ci.field_c) {
                    break L0;
                  } else {
                    incrementValue$0 = var7;
                    var7++;
                    var9 = this.field_s[incrementValue$0];
                    var6[var8] = ie.a(255, var9) << 1134694212;
                    var5[var8] = ie.a(65280, var9) >> -1089780060;
                    var4[var8] = ie.a(16711680, var9) >> -1214938676;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var8 = 0;
                L3: while (true) {
                  if (var8 >= ci.field_c) {
                    break L0;
                  } else {
                    var9 = var8 * this.field_x / ci.field_c;
                    var10 = this.field_s[var7 - -var9];
                    var6[var8] = ie.a(255, var10) << -1779983836;
                    var5[var8] = ie.a(65280, var10) >> 422875844;
                    var4[var8] = ie.a(16711680, var10) >> 140259180;
                    var8++;
                    continue L3;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        if (param0 == -29116) {
          return var3;
        } else {
          return (int[][]) null;
        }
    }

    final int e(byte param0) {
        if (param0 <= 26) {
            return -10;
        }
        return this.field_y;
    }

    final static String b(int param0) {
        if (2 > b.field_x) {
            return ip.field_c;
        }
        if (null != je.field_f) {
            if (!je.field_f.a(-12749)) {
                return Torquing.field_w;
            }
            return md.field_b;
        }
        if (!lp.field_a.a(-12749)) {
            return bo.field_i;
        }
        if (!(lp.field_a.a(true, "commonui"))) {
            return db.field_d + " - " + lp.field_a.a((byte) 102, "commonui") + "%";
        }
        if (param0 > -93) {
            field_t = (String) null;
        }
        if (!eg.field_v.a(-12749)) {
            return ol.field_e;
        }
        if (!eg.field_v.a(true, "commonui")) {
            return l.field_c + " - " + eg.field_v.a((byte) 50, "commonui") + "%";
        }
        if (!(kb.field_a.a(-12749))) {
            return ci.field_d;
        }
        if (!(kb.field_a.c(-19375))) {
            return la.field_b + " - " + kb.field_a.a((byte) -32) + "%";
        }
        return pm.field_p;
    }

    public static void g(byte param0) {
        field_t = null;
        if (param0 < 112) {
            field_w = 110;
        }
    }

    final boolean c(int param0) {
        if (this.field_s != null) {
            return true;
        }
        if (param0 != -31292) {
            return true;
        }
        if ((this.field_y ^ -1) > -1) {
            return false;
        }
        tc var2 = 0 <= po.field_u ? tc.a(vf.field_a, po.field_u, this.field_y) : tc.a(vf.field_a, this.field_y);
        var2.b();
        this.field_s = var2.c();
        this.field_u = var2.field_e;
        this.field_x = var2.field_d;
        return true;
    }

    final void a(fj param0, int param1, int param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1 == 35) {
                break L1;
              } else {
                this.field_x = -83;
                break L1;
              }
            }
            L2: {
              if (0 == param2) {
                this.field_y = param0.i(7088);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ro.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void d(byte param0) {
        int var2 = -128 % ((-63 - param0) / 62);
        super.d((byte) 91);
        this.field_s = null;
    }

    public ro() {
        super(0, false);
        this.field_y = -1;
    }

    final static boolean a(byte param0, la param1, la param2, la param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1.a(-12749)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1.a(true, "commonui")) {
                L1: {
                  if (!param3.a(-12749)) {
                    break L1;
                  } else {
                    if (!param3.a(true, "commonui")) {
                      break L1;
                    } else {
                      L2: {
                        var4_int = -28 / ((param0 - -42) / 52);
                        if (!param2.a(-12749)) {
                          break L2;
                        } else {
                          if (param2.a(true, "button.gif")) {
                            stackIn_16_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ro.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    static {
        field_w = -1;
        field_t = "LOW";
    }
}
