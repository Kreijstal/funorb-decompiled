/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    short[] field_a;
    short field_s;
    short[] field_q;
    int[] field_n;
    short[] field_J;
    short field_R;
    int[] field_r;
    short[] field_x;
    static cg field_t;
    int[] field_j;
    int[] field_f;
    int[] field_i;
    static String field_l;
    int[] field_g;
    short[] field_N;
    short[] field_e;
    short[] field_b;
    short[] field_I;
    short[] field_c;
    byte[] field_u;
    int field_M;
    int field_p;
    int[] field_h;
    short[] field_z;
    private boolean field_H;
    static String[] field_d;
    int field_v;
    short[] field_K;
    int[] field_C;
    short[] field_o;
    int field_w;
    byte field_O;
    short[] field_m;
    static int field_B;
    short[] field_G;
    short[] field_y;
    short field_P;
    int field_F;
    short[] field_A;
    int[] field_E;
    short[] field_D;
    short[] field_Q;
    static String field_L;
    int field_k;

    final static String a(ue param0, String param1, String param2, byte param3) {
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 < -102) {
                break L1;
              } else {
                field_d = (String[]) null;
                break L1;
              }
            }
            if (!param0.b((byte) 96)) {
              stackIn_5_0 = (String) (param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param1 + " - " + param0.a((byte) 120) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("lb.D(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static int a(int param0, String[] param1, String param2, qe param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        try {
          L0: {
            L1: {
              var5_int = param3.a(param2);
              if (param0 < var5_int) {
                break L1;
              } else {
                if ((param2.indexOf("<br>") ^ -1) != 0) {
                  break L1;
                } else {
                  param1[0] = param2;
                  stackIn_3_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              var6 = (param0 + (var5_int + -1)) / param0;
              param0 = var5_int / var6;
              var6 = 0;
              var7 = 0;
              if (param4 <= -58) {
                break L2;
              } else {
                field_l = (String) null;
                break L2;
              }
            }
            var8 = param2.length();
            var9 = 0;
            L3: while (true) {
              if (var9 >= var8) {
                L4: {
                  if (var7 < var8) {
                    incrementValue$0 = var6;
                    var6++;
                    param1[incrementValue$0] = param2.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackIn_23_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param2.charAt(var9);
                    if (var10 == 32) {
                      break L6;
                    } else {
                      if (45 == var10) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param2.substring(var7, var9 - -1).trim();
                  var12 = param3.a(var11);
                  if (var12 < param0) {
                    break L5;
                  } else {
                    var7 = 1 + var9;
                    incrementValue$1 = var6;
                    var6++;
                    param1[incrementValue$1] = var11;
                    break L5;
                  }
                }
                if (62 == var10) {
                  L7: {
                    if (param2.regionMatches(var9 - 3, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      param1[incrementValue$2] = param2.substring(var7, -3 + var9).trim();
                      var7 = 1 + var9;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var9++;
                  continue L3;
                } else {
                  var9++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("lb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_23_0;
        }
    }

    final static void a(nh param0, qe param1, int param2, String param3, int param4) {
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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = StarCannon.field_A;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            if (param2 == 3853) {
              var7 = 1;
              L1: while (true) {
                if (var7 >= param3.length()) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var8 = param3.charAt(var7);
                    if (var8 != 60) {
                      break L2;
                    } else {
                      var6 = param0.field_d[0] + ((var5_int >> 389513192) - -param1.a(param3.substring(0, var7)));
                      break L2;
                    }
                  }
                  L3: {
                    if (0 == (var6 ^ -1)) {
                      L4: {
                        if (var8 != 32) {
                          break L4;
                        } else {
                          var5_int = var5_int + param4;
                          break L4;
                        }
                      }
                      param0.field_d[var7] = param0.field_d[0] + (var5_int >> -724427064) - (-param1.a(param3.substring(0, 1 + var7)) + param1.a((char) var8));
                      break L3;
                    } else {
                      param0.field_d[var7] = var6;
                      break L3;
                    }
                  }
                  L5: {
                    if (62 == var8) {
                      var6 = -1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("lb.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = StarCannon.field_A;
        if (this.field_H) {
          return;
        } else {
          this.field_H = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (this.field_R <= var8) {
              L1: {
                this.field_p = var2;
                this.field_w = var6;
                this.field_F = var3;
                this.field_M = var5;
                if (param0 == -3) {
                  break L1;
                } else {
                  field_l = (String) null;
                  break L1;
                }
              }
              this.field_k = var4;
              this.field_v = var7;
              return;
            } else {
              L2: {
                var9 = this.field_J[var8];
                var10 = this.field_x[var8];
                if ((var6 ^ -1) <= (var10 ^ -1)) {
                  break L2;
                } else {
                  var6 = var10;
                  break L2;
                }
              }
              L3: {
                if (var9 > var5) {
                  var5 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var11 = this.field_q[var8];
                if (var3 > var10) {
                  var3 = var10;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var2 > var9) {
                  var2 = var9;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var7 < var11) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        }
    }

    final static hd b(byte param0) {
        if (param0 != -127) {
            lb.a(-62);
        }
        if (null == d.field_l) {
            d.field_l = new hd(nb.field_b, 20, 0, 0, 0, 11579568, -1, 0, 0, nb.field_b.field_p, -1, 2147483647, true);
        }
        return d.field_l;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = StarCannon.field_A;
        for (var6 = 0; this.field_R > var6; var6++) {
            this.field_J[var6] = (short)(param2 * this.field_J[var6] / param0);
            this.field_x[var6] = (short)(param1 * this.field_x[var6] / param0);
            this.field_q[var6] = (short)(this.field_q[var6] * param3 / param0);
        }
        if (param4 != -72) {
            this.a(-86, 117, (byte) 99, 54);
        }
        this.b(param4 + 153);
    }

    private final void b(int param0) {
        if (param0 <= 48) {
            this.b(83);
        }
        this.field_H = false;
    }

    public static void a(byte param0) {
        if (param0 != -49) {
            String var2 = (String) null;
            lb.a((nh) null, (qe) null, -33, (String) null, -39);
        }
        field_d = null;
        field_l = null;
        field_L = null;
        field_t = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = StarCannon.field_A;
        if (param2 != -30) {
            this.field_H = true;
        }
        for (var5 = 0; this.field_R > var5; var5++) {
            this.field_J[var5] = (short)(this.field_J[var5] + param0);
            this.field_x[var5] = (short)(this.field_x[var5] + param3);
            this.field_q[var5] = (short)(this.field_q[var5] + param1);
        }
        this.b(104);
    }

    final static String a(int param0) {
        if (!eg.field_h && di.field_m >= le.field_a) {
            if (!(hf.field_l + le.field_a <= di.field_m)) {
                return sc.field_c;
            }
        }
        int var1 = 68 % ((-45 - param0) / 62);
        return null;
    }

    lb() {
        this.field_O = (byte) 0;
        this.field_H = false;
    }

    static {
        field_l = "MEDIUM";
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
