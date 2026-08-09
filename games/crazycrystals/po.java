/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends tb {
    private int field_i;
    private int field_j;
    private String field_n;
    private int field_o;
    private boolean field_m;
    private int field_l;
    private vc field_p;
    private int field_k;

    final void a(byte param0, String param1, vc param2, int param3, int param4, int param5, int param6, int param7) {
        bh stackIn_36_0;
        bh stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        bh stackIn_37_0 = null;
        bh stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        bh stackIn_41_0 = null;
        bh stackIn_42_0 = null;
        int stackIn_42_1 = 0;
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
        bh var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (0 != param7) {
                break L1;
              } else {
                param7 = param2.field_y;
                break L1;
              }
            }
            if (param1 == null) {
              this.field_h = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param2 != this.field_p) {
                  break L2;
                } else {
                  if (this.field_m) {
                    break L2;
                  } else {
                    if (param6 != this.field_k) {
                      break L2;
                    } else {
                      if (this.field_j != param3) {
                        break L2;
                      } else {
                        if (param7 != this.field_l) {
                          break L2;
                        } else {
                          if (this.field_i != param4) {
                            break L2;
                          } else {
                            if (param5 != this.field_o) {
                              break L2;
                            } else {
                              if (this.field_n == null) {
                                break L2;
                              } else {
                                if (this.field_n.equals(param1)) {
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
              L3: {
                this.field_p = param2;
                this.field_i = param4;
                this.field_n = param1;
                this.field_j = param3;
                this.field_o = param5;
                this.field_k = param6;
                if (param0 == 28) {
                  break L3;
                } else {
                  this.field_i = 24;
                  break L3;
                }
              }
              L4: {
                this.field_m = false;
                this.field_l = param7;
                var16 = new String[param2.a(param1, param5) - -1];
                var17 = var16;
                var10 = Math.max(1, param2.a(param1, new int[]{param5}, var17));
                if (-4 != (this.field_j ^ -1)) {
                  break L4;
                } else {
                  if (-2 != (var10 ^ -1)) {
                    break L4;
                  } else {
                    this.field_j = 1;
                    break L4;
                  }
                }
              }
              L5: {
                if (0 == this.field_j) {
                  var11 = param2.field_o;
                  break L5;
                } else {
                  if (-2 == (this.field_j ^ -1)) {
                    var11 = param2.field_o + (this.field_i + -(var10 * this.field_l) >> 241330401);
                    break L5;
                  } else {
                    if (2 == this.field_j) {
                      var11 = this.field_i + (-param2.field_u + -(var10 * this.field_l));
                      break L5;
                    } else {
                      L6: {
                        var12 = (-(this.field_l * var10) + this.field_i) / (1 + var10);
                        if (0 <= var12) {
                          break L6;
                        } else {
                          var12 = 0;
                          break L6;
                        }
                      }
                      var11 = var12 + param2.field_o;
                      this.field_l = this.field_l + var12;
                      break L5;
                    }
                  }
                }
              }
              this.field_h = new bh[var10];
              var12 = 0;
              L7: while (true) {
                if (var12 >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L8: {
                    var13 = var16[var12];
                    stackIn_36_0 = null;

                    stackIn_36_1 = null;

                    stackIn_36_2 = -param2.field_o + var11;

                    stackIn_36_3 = var11 - -param2.field_u;

                    if (var13 != null) {
                      stackIn_37_0 = null;
                      stackIn_37_1 = null;
                      stackIn_37_2 = stackIn_36_2;
                      stackIn_37_3 = stackIn_36_3;
                      stackIn_37_4 = var13.length();
                      break L8;
                    } else {
                      stackIn_37_0 = null;
                      stackIn_37_1 = null;
                      stackIn_37_2 = stackIn_36_2;
                      stackIn_37_3 = stackIn_36_3;
                      stackIn_37_4 = 0;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new bh(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                    var14.field_e[0] = 0;
                    if (var13 != null) {
                      L10: {
                        var14.field_e[var13.length()] = param2.a(var13);
                        stackIn_41_0 = (bh) (var14);

                        if (-4 == (param6 ^ -1)) {
                          stackIn_42_0 = (bh) ((Object) stackIn_41_0);
                          stackIn_42_1 = this.a((byte) 79, param5, var13, param2.a(var13));
                          break L10;
                        } else {
                          stackIn_42_0 = (bh) ((Object) stackIn_41_0);
                          stackIn_42_1 = 0;
                          break L10;
                        }
                      }
                      te.a(stackIn_42_0, stackIn_42_1, var13, (byte) -95, param2);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  this.field_h[var12] = var14;
                  var11 = var11 + param7;
                  var12++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackIn_47_0 = (RuntimeException) (var9);

            stackIn_47_1 = new StringBuilder().append("po.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L11;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');

            if (param2 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L12;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L12;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_48_0), stackIn_51_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final void a(String param0, vc param1, int param2, int param3, boolean param4) {
        bh var8 = null;
        int var7 = 0;
        if (!(param0 != null)) {
            this.field_h = null;
            return;
        }
        if (this.field_p == param1 && this.field_m && (this.field_k ^ -1) == -2 && this.field_n != null) {
            if (!(!this.field_n.equals(param0))) {
                return;
            }
        }
        try {
            this.field_k = 1;
            this.field_m = true;
            this.field_p = param1;
            var8 = this.a(param1, param0, param3, (byte) 13);
            var7 = param1.a(param0);
            if (param4) {
                this.field_m = true;
            }
            var8.field_e[0] = param2 - (var7 >> 1472485633);
            var8.field_e[param0.length()] = param2 - -(var7 >> -1103898463);
            te.a(var8, 0, param0, (byte) -95, param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "po.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, String param1, int param2, int param3, vc param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        vc var7 = null;
        bh var9 = null;
        bh var10 = null;
        try {
          L0: {
            if (param1 == null) {
              this.field_h = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param4 != this.field_p) {
                  break L1;
                } else {
                  if (!this.field_m) {
                    break L1;
                  } else {
                    if (this.field_k != 2) {
                      break L1;
                    } else {
                      if (this.field_n == null) {
                        break L1;
                      } else {
                        if (this.field_n.equals(param1)) {
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
                this.field_n = param1;
                this.field_k = 2;
                if (param0 >= 95) {
                  break L2;
                } else {
                  var7 = (vc) null;
                  this.a(-121, (String) null, 97, 102, (vc) null);
                  break L2;
                }
              }
              this.field_m = true;
              this.field_p = param4;
              var9 = this.a(param4, param1, param3, (byte) 13);
              var10 = var9;
              var10.field_e[0] = -param4.a(param1) + param2;
              var10.field_e[param1.length()] = param2;
              te.a(var10, 0, param1, (byte) -95, param4);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("po.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
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

    private final bh a(vc param0, String param1, int param2, byte param3) {
        bh var5 = null;
        RuntimeException var5_ref = null;
        vc var6 = null;
        bh var7 = null;
        bh stackIn_3_0 = null;
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
              var7 = new bh(-param0.field_o + param2, param2 + param0.field_u, param1.length());
              var5 = var7;
              this.field_h = new bh[]{var7};
              if (param3 == 13) {
                break L1;
              } else {
                var6 = (vc) null;
                this.a((byte) 12, (String) null, -102, 101, (vc) null);
                break L1;
              }
            }
            stackIn_3_0 = (bh) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("po.E(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, String param1, int param2, int param3, vc param4) {
        bh var7 = null;
        bh var8 = null;
        if (!(param1 != null)) {
            this.field_h = null;
            return;
        }
        if (param4 == this.field_p && this.field_m && this.field_k == 0 && this.field_n != null && this.field_n.equals(param1)) {
            return;
        }
        try {
            this.field_m = true;
            this.field_n = param1;
            this.field_k = param2;
            this.field_p = param4;
            var7 = this.a(param4, param1, param0, (byte) 13);
            var8 = var7;
            var7.field_e[0] = param3;
            var8.field_e[param1.length()] = param4.a(param1) + param3;
            te.a(var8, 0, param1, (byte) -95, param4);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "po.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public po() {
    }

    static {
    }
}
