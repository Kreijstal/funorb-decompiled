/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends ld {
    private int field_q;
    static boolean field_o;
    private String field_j;
    private int field_i;
    static ae field_s;
    static jj field_k;
    private int field_l;
    static int field_t;
    private pk field_n;
    private int field_m;
    private boolean field_p;
    private int field_r;

    final void a(int param0, int param1, pk param2, int param3, String param4) {
        if (!(param4 != null)) {
            this.field_f = null;
            return;
        }
        if (param2 == this.field_n && this.field_p && this.field_l == 2 && null != this.field_j && this.field_j.equals(param4)) {
            return;
        }
        this.field_j = param4;
        this.field_n = param2;
        this.field_p = true;
        this.field_l = 2;
        em var7 = this.a(param2, 125, param4, param0);
        em var8 = var7;
        if (param1 < 33) {
            return;
        }
        try {
            var8.field_d[0] = -param2.b(param4) + param3;
            var7.field_d[param4.length()] = param3;
            hb.a(param2, 0, 114, param4, var8);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "rd.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final em a(pk param0, int param1, String param2, int param3) {
        em var5 = null;
        RuntimeException var5_ref = null;
        em var6 = null;
        em stackIn_3_0 = null;
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
              if (param1 > 121) {
                break L1;
              } else {
                this.field_n = (pk) null;
                break L1;
              }
            }
            var6 = new em(-param0.field_s + param3, param0.field_p + param3, param2.length());
            var5 = var6;
            this.field_f = new em[]{var6};
            stackIn_3_0 = (em) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("rd.M(");

            if (param0 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 < 121) {
            return;
        }
        field_k = null;
    }

    final void a(int param0, pk param1, String param2, int param3, int param4) {
        int var7 = 0;
        em var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                if (this.field_n != param1) {
                  break L1;
                } else {
                  if (!this.field_p) {
                    break L1;
                  } else {
                    if ((this.field_l ^ -1) != -2) {
                      break L1;
                    } else {
                      if (this.field_j == null) {
                        break L1;
                      } else {
                        if (this.field_j.equals(param2)) {
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
                this.field_l = 1;
                this.field_n = param1;
                this.field_p = true;
                var8 = this.a(param1, 122, param2, param3);
                var7 = param1.b(param2);
                var8.field_d[0] = param0 + -(var7 >> 960877057);
                var8.field_d[param2.length()] = param0 + (var7 >> 221225569);
                hb.a(param1, 0, 49, param2, var8);
                if (param4 == 960877057) {
                  break L2;
                } else {
                  field_t = 59;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_f = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("rd.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ')');
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

    final void a(int param0, int param1, int param2, pk param3, int param4, String param5, int param6, int param7) {
        em stackIn_35_0;
        em stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        em stackIn_36_0 = null;
        em stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        pk stackIn_39_0 = null;
        pk stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        em var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        var16 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param7 == 0) {
                param7 = param3.field_w;
                break L1;
              } else {
                break L1;
              }
            }
            if (param5 != null) {
              L2: {
                if (this.field_n != param3) {
                  break L2;
                } else {
                  if (this.field_p) {
                    break L2;
                  } else {
                    if (this.field_l != param0) {
                      break L2;
                    } else {
                      if (param1 != this.field_i) {
                        break L2;
                      } else {
                        if (param7 != this.field_q) {
                          break L2;
                        } else {
                          if (param2 != this.field_m) {
                            break L2;
                          } else {
                            if (this.field_r != param6) {
                              break L2;
                            } else {
                              if (null == this.field_j) {
                                break L2;
                              } else {
                                if (!this.field_j.equals(param5)) {
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
                this.field_i = param1;
                this.field_m = param2;
                this.field_n = param3;
                this.field_p = false;
                this.field_l = param0;
                this.field_r = param6;
                this.field_j = param5;
                this.field_q = param7;
                var17 = new String[param3.c(param5, param6) - -1];
                var18 = var17;
                var10 = Math.max(1, param3.a(param5, new int[]{param6}, var18));
                if (this.field_i != 3) {
                  break L3;
                } else {
                  if (1 == var10) {
                    this.field_i = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (this.field_i == 0) {
                  var11 = param3.field_s;
                  break L4;
                } else {
                  if (1 != this.field_i) {
                    if (-3 == (this.field_i ^ -1)) {
                      var11 = -(var10 * this.field_q) + (-param3.field_p + this.field_m);
                      break L4;
                    } else {
                      L5: {
                        var12 = (this.field_m + -(this.field_q * var10)) / (var10 + 1);
                        if (var12 >= 0) {
                          break L5;
                        } else {
                          var12 = 0;
                          break L5;
                        }
                      }
                      this.field_q = this.field_q + var12;
                      var11 = param3.field_s - -var12;
                      break L4;
                    }
                  } else {
                    var11 = param3.field_s + (this.field_m - this.field_q * var10 >> 2063189505);
                    break L4;
                  }
                }
              }
              var12 = 105 % ((-47 - param4) / 60);
              this.field_f = new em[var10];
              var13 = 0;
              L6: while (true) {
                if (var13 >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L7: {
                    var14 = var17[var13];
                    stackIn_35_0 = null;

                    stackIn_35_1 = null;

                    stackIn_35_2 = -param3.field_s + var11;

                    stackIn_35_3 = param3.field_p + var11;

                    if (var14 == null) {
                      stackIn_36_0 = null;
                      stackIn_36_1 = null;
                      stackIn_36_2 = stackIn_35_2;
                      stackIn_36_3 = stackIn_35_3;
                      stackIn_36_4 = 0;
                      break L7;
                    } else {
                      stackIn_36_0 = null;
                      stackIn_36_1 = null;
                      stackIn_36_2 = stackIn_35_2;
                      stackIn_36_3 = stackIn_35_3;
                      stackIn_36_4 = var14.length();
                      break L7;
                    }
                  }
                  L8: {
                    var15 = new em(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var15.field_d[0] = 0;
                    if (var14 == null) {
                      break L8;
                    } else {
                      L9: {
                        var15.field_d[var14.length()] = param3.b(var14);
                        stackIn_39_0 = (pk) (param3);

                        if (3 == param0) {
                          stackIn_40_0 = (pk) ((Object) stackIn_39_0);
                          stackIn_40_1 = this.a(var14, true, param6, param3.b(var14));
                          break L9;
                        } else {
                          stackIn_40_0 = (pk) ((Object) stackIn_39_0);
                          stackIn_40_1 = 0;
                          break L9;
                        }
                      }
                      hb.a(stackIn_40_0, stackIn_40_1, 43, var14, var15);
                      break L8;
                    }
                  }
                  var11 = var11 + param7;
                  this.field_f[var13] = var15;
                  var13++;
                  continue L6;
                }
              }
            } else {
              this.field_f = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var9);

            stackIn_45_1 = new StringBuilder().append("rd.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L10;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L11;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L11;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_46_0), stackIn_49_2 + ',' + param6 + ',' + param7 + ')');
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

    final void a(int param0, pk param1, int param2, String param3, byte param4) {
        em var7 = null;
        em var8 = null;
        if (param3 == null) {
            this.field_f = null;
            return;
        }
        if (param1 == this.field_n && this.field_p && 0 == this.field_l && null != this.field_j) {
            if (!(!this.field_j.equals(param3))) {
                return;
            }
        }
        try {
            if (param4 != -112) {
                this.field_q = 89;
            }
            this.field_j = param3;
            this.field_n = param1;
            this.field_p = true;
            this.field_l = 0;
            var7 = this.a(param1, 123, param3, param2);
            var8 = var7;
            var7.field_d[0] = param0;
            var8.field_d[param3.length()] = param1.b(param3) + param0;
            hb.a(param1, 0, 59, param3, var8);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "rd.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static Boolean b(byte param0) {
        Boolean var1 = ge.field_d;
        if (param0 < 14) {
            field_k = (jj) null;
        }
        ge.field_d = null;
        return var1;
    }

    public rd() {
    }

    static {
        field_o = false;
        field_k = new jj();
    }
}
