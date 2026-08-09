/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends lg {
    static int[][] field_m;
    static int field_j;
    static ka field_q;
    static int field_t;
    static int field_g;
    private int field_r;
    private int field_o;
    private boolean field_s;
    static int[] field_h;
    private String field_i;
    private int field_l;
    private eg field_p;
    private int field_k;
    private int field_n;

    final void a(eg param0, String param1, int param2, byte param3, int param4) {
        qi var8 = null;
        qi var9 = null;
        if (!(param1 != null)) {
            this.field_a = null;
            return;
        }
        if (param0 == this.field_p && this.field_s && (this.field_n ^ -1) == -3 && null != this.field_i && this.field_i.equals(param1)) {
            return;
        }
        this.field_p = param0;
        this.field_i = param1;
        if (param3 != -9) {
            return;
        }
        try {
            this.field_n = 2;
            this.field_s = true;
            var8 = this.a(param3 ^ -1063303658, param1, param4, param0);
            var9 = var8;
            var9.field_g[0] = param2 - param0.a(param1);
            var9.field_g[param1.length()] = param2;
            ua.a(0, (byte) -113, param0, param1, var9);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "fa.Q(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final qi a(int param0, String param1, int param2, eg param3) {
        qi discarded$1 = null;
        qi var5 = null;
        RuntimeException var5_ref = null;
        eg var6 = null;
        qi var7 = null;
        qi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = new qi(-param3.field_x + param2, param3.field_K + param2, param1.length());
              var5 = var7;
              if (param0 == 1063303649) {
                break L1;
              } else {
                var6 = (eg) null;
                discarded$1 = this.a(-1, (String) null, 18, (eg) null);
                break L1;
              }
            }
            this.field_a = new qi[]{var7};
            stackIn_3_0 = (qi) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("fa.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, String param3, eg param4, int param5, int param6, int param7) {
        qi stackIn_35_0;
        qi stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        qi stackIn_36_0 = null;
        qi stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        qi var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) == param6) {
                param1 = param4.field_G;
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 != null) {
              L2: {
                if (param4 != this.field_p) {
                  break L2;
                } else {
                  if (this.field_s) {
                    break L2;
                  } else {
                    if (param2 != this.field_n) {
                      break L2;
                    } else {
                      if (this.field_l != param7) {
                        break L2;
                      } else {
                        if (param1 != this.field_k) {
                          break L2;
                        } else {
                          if (param5 != this.field_r) {
                            break L2;
                          } else {
                            if (param0 != this.field_o) {
                              break L2;
                            } else {
                              if (this.field_i == null) {
                                break L2;
                              } else {
                                if (!this.field_i.equals(param3)) {
                                  break L2;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L3: {
                this.field_k = param1;
                this.field_s = false;
                this.field_r = param5;
                this.field_o = param0;
                this.field_i = param3;
                this.field_n = param2;
                this.field_p = param4;
                this.field_l = param7;
                var16 = new String[param4.a(param3, param0) + 1];
                var17 = var16;
                var10 = Math.max(1, param4.a(param3, new int[]{param0}, var17));
                if (this.field_l != 3) {
                  break L3;
                } else {
                  if (var10 == 1) {
                    this.field_l = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (0 != this.field_l) {
                  if (1 != this.field_l) {
                    if (-3 != (this.field_l ^ -1)) {
                      L5: {
                        var12 = (-(this.field_k * var10) + this.field_r) / (1 + var10);
                        if (0 <= var12) {
                          break L5;
                        } else {
                          var12 = 0;
                          break L5;
                        }
                      }
                      var11 = var12 + param4.field_x;
                      this.field_k = this.field_k + var12;
                      break L4;
                    } else {
                      var11 = -param4.field_K + this.field_r + -(this.field_k * var10);
                      break L4;
                    }
                  } else {
                    var11 = param4.field_x + (-(this.field_k * var10) + this.field_r >> -545220607);
                    break L4;
                  }
                } else {
                  var11 = param4.field_x;
                  break L4;
                }
              }
              this.field_a = new qi[var10];
              var12 = 0;
              L6: while (true) {
                if (var12 >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L7: {
                    var13 = var16[var12];
                    stackIn_35_0 = null;

                    stackIn_35_1 = null;

                    stackIn_35_2 = -param4.field_x + var11;

                    stackIn_35_3 = param4.field_K + var11;

                    if (var13 != null) {
                      stackIn_36_0 = null;
                      stackIn_36_1 = null;
                      stackIn_36_2 = stackIn_35_2;
                      stackIn_36_3 = stackIn_35_3;
                      stackIn_36_4 = var13.length();
                      break L7;
                    } else {
                      stackIn_36_0 = null;
                      stackIn_36_1 = null;
                      stackIn_36_2 = stackIn_35_2;
                      stackIn_36_3 = stackIn_35_3;
                      stackIn_36_4 = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new qi(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var14.field_g[0] = 0;
                    if (var13 != null) {
                      L9: {
                        var14.field_g[var13.length()] = param4.a(var13);
                        if (3 != param2) {
                          stackIn_41_0 = 0;
                          break L9;
                        } else {
                          stackIn_41_0 = this.a(var13, param0, (byte) 19, param4.a(var13));
                          break L9;
                        }
                      }
                      ua.a(stackIn_41_0, (byte) -113, param4, var13, var14);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  this.field_a[var12] = var14;
                  var11 = var11 + param1;
                  var12++;
                  continue L6;
                }
              }
            } else {
              this.field_a = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var9);

            stackIn_46_1 = new StringBuilder().append("fa.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L10;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_49_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');

            if (param4 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L11;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L11;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_47_0), stackIn_50_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final void b(eg param0, String param1, int param2, int param3, int param4) {
        qi discarded$1 = null;
        eg var7 = null;
        qi var8 = null;
        qi var9 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            if (param1 == null) {
              this.field_a = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 != this.field_p) {
                  break L1;
                } else {
                  if (!this.field_s) {
                    break L1;
                  } else {
                    if (this.field_n != 0) {
                      break L1;
                    } else {
                      if (this.field_i == null) {
                        break L1;
                      } else {
                        if (this.field_i.equals(param1)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                this.field_i = param1;
                this.field_n = 0;
                this.field_s = true;
                this.field_p = param0;
                var8 = this.a(1063303649, param1, param2, param0);
                var9 = var8;
                var8.field_g[0] = param4;
                var9.field_g[param1.length()] = param0.a(param1) + param4;
                ua.a(0, (byte) -113, param0, param1, var9);
                if (param3 <= -62) {
                  break L2;
                } else {
                  var7 = (eg) null;
                  discarded$1 = this.a(107, (String) null, -69, (eg) null);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("fa.P(");

            if (param0 == null) {
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
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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

    public static void b(int param0) {
        field_q = null;
        field_h = null;
        if (param0 != -3) {
            fa.b(-61);
        }
        field_m = (int[][]) null;
    }

    final void a(eg param0, String param1, int param2, int param3, int param4) {
        qi var8 = null;
        int var7 = 0;
        if (param3 != -25602) {
            return;
        }
        if (!(param1 != null)) {
            this.field_a = null;
            return;
        }
        if (this.field_p == param0 && this.field_s && this.field_n == 1 && null != this.field_i && this.field_i.equals(param1)) {
            return;
        }
        try {
            this.field_p = param0;
            this.field_n = 1;
            this.field_s = true;
            var8 = this.a(1063303649, param1, param4, param0);
            var7 = param0.a(param1);
            var8.field_g[0] = param2 - (var7 >> 1229577153);
            var8.field_g[param1.length()] = param2 + (var7 >> 1063303649);
            ua.a(0, (byte) -113, param0, param1, var8);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "fa.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public fa() {
    }

    static {
        field_m = new int[][]{new int[]{300}, new int[]{300}, new int[]{300}, new int[]{425}, new int[]{300}};
        field_h = new int[8192];
        field_t = -1;
    }
}
