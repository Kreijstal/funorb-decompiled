/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends mj {
    private int field_l;
    private int field_g;
    static String field_k;
    private String field_j;
    private boolean field_m;
    private ee field_h;
    private int field_f;
    private int field_i;
    private int field_n;

    final void a(String param0, int param1, ee param2, int param3, int param4) {
        di var7 = null;
        di var8 = null;
        if (!(param0 != null)) {
            this.field_d = null;
            return;
        }
        if (param2 == this.field_h && this.field_m && this.field_i == 0 && this.field_j != null && this.field_j.equals(param0)) {
            return;
        }
        if (param1 != 1) {
            return;
        }
        try {
            this.field_h = param2;
            this.field_m = true;
            this.field_j = param0;
            this.field_i = 0;
            var7 = this.a(param3, (byte) -88, param2, param0);
            var8 = var7;
            var7.field_a[0] = param4;
            var8.field_a[param0.length()] = param4 - -param2.a(param0);
            s.a(param2, (byte) 61, 0, var8, param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ub.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, byte param1, int param2, ee param3, int param4) {
        di var8 = null;
        di var9 = null;
        if (!(param0 != null)) {
            this.field_d = null;
            return;
        }
        if (param1 >= -86) {
            return;
        }
        if (param3 == this.field_h && this.field_m && 2 == this.field_i && this.field_j != null && this.field_j.equals(param0)) {
            return;
        }
        try {
            this.field_h = param3;
            this.field_j = param0;
            this.field_m = true;
            this.field_i = 2;
            var8 = this.a(param2, (byte) -103, param3, param0);
            var9 = var8;
            var9.field_a[0] = -param3.a(param0) + param4;
            var9.field_a[param0.length()] = param4;
            s.a(param3, (byte) 61, 0, var9, param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ub.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final di a(int param0, byte param1, ee param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        di var6 = null;
        di stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = -67 % ((-6 - param1) / 42);
            var6 = new di(-param2.field_s + param0, param0 - -param2.field_x, param3.length());
            this.field_d = new di[]{var6};
            stackIn_1_0 = (di) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("ub.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void c(int param0) {
        if (param0 != 0) {
            ub.c(-117);
        }
        uk.a("", param0 + -23804, (String) null);
    }

    public static void d(int param0) {
        if (param0 > -112) {
            ub.c(-70);
        }
        field_k = null;
    }

    final void a(ee param0, int param1, String param2, int param3, int param4) {
        di var7 = null;
        int var8 = 0;
        if (!(param2 != null)) {
            this.field_d = null;
            return;
        }
        if (param0 == this.field_h && this.field_m && 1 == this.field_i && null != this.field_j && this.field_j.equals(param2)) {
            return;
        }
        try {
            this.field_h = param0;
            this.field_m = true;
            this.field_i = 1;
            int var6_int = 99 % ((35 - param3) / 59);
            var7 = this.a(param1, (byte) 41, param0, param2);
            var8 = param0.a(param2);
            var7.field_a[0] = param4 - (var8 >> 128144513);
            var7.field_a[param2.length()] = param4 - -(var8 >> -1397818463);
            s.a(param0, (byte) 61, 0, var7, param2);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ub.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, ee param4, int param5, String param6, int param7) {
        di stackIn_37_0;
        di stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        di stackIn_38_0 = null;
        di stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        ee stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        ee stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        di var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = Main.field_T;
        try {
          L0: {
            L1: {
              if (0 == param7) {
                param7 = param4.field_E;
                break L1;
              } else {
                break L1;
              }
            }
            if (param6 == null) {
              this.field_d = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param4 != this.field_h) {
                  break L2;
                } else {
                  if (this.field_m) {
                    break L2;
                  } else {
                    if (param5 != this.field_i) {
                      break L2;
                    } else {
                      if (this.field_n != param2) {
                        break L2;
                      } else {
                        if (param7 != this.field_g) {
                          break L2;
                        } else {
                          if (param0 != this.field_f) {
                            break L2;
                          } else {
                            if (param3 != this.field_l) {
                              break L2;
                            } else {
                              if (this.field_j == null) {
                                break L2;
                              } else {
                                if (this.field_j.equals(param6)) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L2;
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
              this.field_f = param0;
              this.field_l = param3;
              if (param1 == 841570337) {
                L3: {
                  this.field_h = param4;
                  this.field_n = param2;
                  this.field_i = param5;
                  this.field_g = param7;
                  this.field_j = param6;
                  this.field_m = false;
                  var16 = new String[1 + param4.b(param6, param3)];
                  var17 = var16;
                  var10 = Math.max(1, param4.a(param6, new int[]{param3}, var17));
                  if (-4 != (this.field_n ^ -1)) {
                    break L3;
                  } else {
                    if (var10 != 1) {
                      break L3;
                    } else {
                      this.field_n = 1;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (this.field_n != 0) {
                    if (this.field_n != 1) {
                      if (-3 == (this.field_n ^ -1)) {
                        var11 = this.field_f - (param4.field_x - -(var10 * this.field_g));
                        break L4;
                      } else {
                        L5: {
                          var12 = (this.field_f - var10 * this.field_g) / (var10 + 1);
                          if (-1 >= (var12 ^ -1)) {
                            break L5;
                          } else {
                            var12 = 0;
                            break L5;
                          }
                        }
                        var11 = param4.field_s + var12;
                        this.field_g = this.field_g + var12;
                        break L4;
                      }
                    } else {
                      var11 = (-(this.field_g * var10) + this.field_f >> 841570337) + param4.field_s;
                      break L4;
                    }
                  } else {
                    var11 = param4.field_s;
                    break L4;
                  }
                }
                this.field_d = new di[var10];
                var12 = 0;
                L6: while (true) {
                  if (var12 >= var10) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L7: {
                      var13 = var16[var12];
                      stackIn_37_0 = null;

                      stackIn_37_1 = null;

                      stackIn_37_2 = -param4.field_s + var11;

                      stackIn_37_3 = param4.field_x + var11;

                      if (var13 == null) {
                        stackIn_38_0 = null;
                        stackIn_38_1 = null;
                        stackIn_38_2 = stackIn_37_2;
                        stackIn_38_3 = stackIn_37_3;
                        stackIn_38_4 = 0;
                        break L7;
                      } else {
                        stackIn_38_0 = null;
                        stackIn_38_1 = null;
                        stackIn_38_2 = stackIn_37_2;
                        stackIn_38_3 = stackIn_37_3;
                        stackIn_38_4 = var13.length();
                        break L7;
                      }
                    }
                    L8: {
                      var14 = new di(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                      var14.field_a[0] = 0;
                      if (var13 == null) {
                        break L8;
                      } else {
                        L9: {
                          var14.field_a[var13.length()] = param4.a(var13);
                          stackIn_41_0 = (ee) (param4);

                          stackIn_41_1 = 61;

                          if (param5 != 3) {
                            stackIn_42_0 = (ee) ((Object) stackIn_41_0);
                            stackIn_42_1 = stackIn_41_1;
                            stackIn_42_2 = 0;
                            break L9;
                          } else {
                            stackIn_42_0 = (ee) ((Object) stackIn_41_0);
                            stackIn_42_1 = stackIn_41_1;
                            stackIn_42_2 = this.a(param3, param4.a(var13), var13, -53);
                            break L9;
                          }
                        }
                        s.a(stackIn_42_0, (byte) stackIn_42_1, stackIn_42_2, var14, var13);
                        break L8;
                      }
                    }
                    this.field_d[var12] = var14;
                    var11 = var11 + param7;
                    var12++;
                    continue L6;
                  }
                }
              } else {
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_47_0 = (RuntimeException) (var9);

            stackIn_47_1 = new StringBuilder().append("ub.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L10;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L11;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L11;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_48_0), stackIn_51_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public ub() {
    }

    static {
        field_k = null;
    }
}
