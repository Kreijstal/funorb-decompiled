/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends bja {
    static String field_i;
    private int field_f;
    private boolean field_h;
    static nh field_l;
    private il field_j;
    private String field_k;
    private int field_e;
    private int field_n;
    private int field_g;
    private int field_m;

    final static int a(int param0, int param1, int param2, byte param3, g[] param4) {
        g var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = param4[param1];
            csa.a(param0, 2097152, param1, param4);
            var6 = param2;
            if (param3 == -65) {
              var7 = param2;
              L1: while (true) {
                if (param0 <= var7) {
                  csa.a(param0, param3 ^ -2097217, var6, param4);
                  stackIn_10_0 = var6;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (param4[var7].field_e.b((byte) -98) > var5.field_e.b((byte) -105)) {
                      break L2;
                    } else {
                      csa.a(var6, 2097152, var7, param4);
                      var6++;
                      break L2;
                    }
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 30;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5_ref);

            stackIn_13_1 = new StringBuilder().append("po.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    final void a(il param0, byte param1, String param2, int param3, int param4, int param5, int param6, int param7) {
        kha stackIn_35_0;
        kha stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        kha stackIn_36_0 = null;
        kha stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_39_0;
        String stackIn_39_1;
        il stackIn_39_2;
        kha stackIn_39_3;
        int stackIn_40_0;
        String stackIn_40_1;
        il stackIn_40_2;
        kha stackIn_40_3;
        int stackIn_40_4;
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
        kha var14 = null;
        int var15 = 0;
        String var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param7) {
                break L1;
              } else {
                param7 = param0.field_m;
                break L1;
              }
            }
            if (param2 != null) {
              L2: {
                if (this.field_j != param0) {
                  break L2;
                } else {
                  if (this.field_h) {
                    break L2;
                  } else {
                    if (this.field_m != param6) {
                      break L2;
                    } else {
                      if (this.field_e != param4) {
                        break L2;
                      } else {
                        if (this.field_g != param7) {
                          break L2;
                        } else {
                          if (this.field_f != param5) {
                            break L2;
                          } else {
                            if (param3 != this.field_n) {
                              break L2;
                            } else {
                              if (this.field_k == null) {
                                break L2;
                              } else {
                                if (!this.field_k.equals(param2)) {
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
                this.field_n = param3;
                this.field_e = param4;
                this.field_j = param0;
                this.field_k = param2;
                this.field_m = param6;
                this.field_g = param7;
                this.field_f = param5;
                this.field_h = false;
                var17 = new String[param0.a(param2, param3) + 1];
                var18 = var17;
                var10 = Math.max(1, param0.a(param2, new int[]{param3}, var18));
                if (3 != this.field_e) {
                  break L3;
                } else {
                  if (-2 == (var10 ^ -1)) {
                    this.field_e = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (0 != this.field_e) {
                  if ((this.field_e ^ -1) == -2) {
                    var11 = (this.field_f + -(var10 * this.field_g) >> -864694431) + param0.field_w;
                    break L4;
                  } else {
                    if ((this.field_e ^ -1) == -3) {
                      var11 = this.field_f + (-param0.field_k + -(this.field_g * var10));
                      break L4;
                    } else {
                      L5: {
                        var12 = (this.field_f - var10 * this.field_g) / (1 + var10);
                        if (var12 < 0) {
                          var12 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var11 = var12 + param0.field_w;
                      this.field_g = this.field_g + var12;
                      break L4;
                    }
                  }
                } else {
                  var11 = param0.field_w;
                  break L4;
                }
              }
              this.field_c = new kha[var10];
              var12 = 0;
              L6: while (true) {
                if (var12 >= var10) {
                  L7: {
                    if (param1 == -49) {
                      break L7;
                    } else {
                      var16 = (String) null;
                      this.a(58, (il) null, 24, (String) null, -110);
                      break L7;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L8: {
                    var13 = var17[var12];
                    stackIn_35_0 = null;

                    stackIn_35_1 = null;

                    stackIn_35_2 = var11 + -param0.field_w;

                    stackIn_35_3 = var11 - -param0.field_k;

                    if (var13 == null) {
                      stackIn_36_0 = null;
                      stackIn_36_1 = null;
                      stackIn_36_2 = stackIn_35_2;
                      stackIn_36_3 = stackIn_35_3;
                      stackIn_36_4 = 0;
                      break L8;
                    } else {
                      stackIn_36_0 = null;
                      stackIn_36_1 = null;
                      stackIn_36_2 = stackIn_35_2;
                      stackIn_36_3 = stackIn_35_3;
                      stackIn_36_4 = var13.length();
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new kha(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var14.field_c[0] = 0;
                    if (var13 == null) {
                      break L9;
                    } else {
                      L10: {
                        var14.field_c[var13.length()] = param0.b(var13);
                        stackIn_39_0 = param1 ^ -2097201;

                        stackIn_39_1 = (String) (var13);

                        stackIn_39_2 = (il) (param0);

                        stackIn_39_3 = (kha) (var14);

                        if ((param6 ^ -1) != -4) {
                          stackIn_40_0 = stackIn_39_0;
                          stackIn_40_1 = (String) ((Object) stackIn_39_1);
                          stackIn_40_2 = (il) ((Object) stackIn_39_2);
                          stackIn_40_3 = (kha) ((Object) stackIn_39_3);
                          stackIn_40_4 = 0;
                          break L10;
                        } else {
                          stackIn_40_0 = stackIn_39_0;
                          stackIn_40_1 = (String) ((Object) stackIn_39_1);
                          stackIn_40_2 = (il) ((Object) stackIn_39_2);
                          stackIn_40_3 = (kha) ((Object) stackIn_39_3);
                          stackIn_40_4 = this.a(0, var13, param3, param0.b(var13));
                          break L10;
                        }
                      }
                      jh.a(stackIn_40_0, stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_40_4);
                      break L9;
                    }
                  }
                  var11 = var11 + param7;
                  this.field_c[var12] = var14;
                  var12++;
                  continue L6;
                }
              }
            } else {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackIn_47_0 = (RuntimeException) (var9);

            stackIn_47_1 = new StringBuilder().append("po.G(");

            if (param0 == null) {
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


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param1).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_48_0), stackIn_51_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final void a(int param0, il param1, int param2, String param3, int param4) {
        kha var8 = null;
        kha var9 = null;
        if (param3 == null) {
            this.field_c = null;
            return;
        }
        if (this.field_j == param1 && this.field_h && -3 == (this.field_m ^ -1) && this.field_k != null && this.field_k.equals(param3)) {
            return;
        }
        try {
            this.field_m = 2;
            this.field_k = param3;
            this.field_h = true;
            this.field_j = param1;
            var8 = this.a(param1, 0, param3, param2);
            var9 = var8;
            var9.field_c[param0] = param4 + -param1.b(param3);
            var9.field_c[param3.length()] = param4;
            jh.a(2097152, param3, param1, var9, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "po.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final kha a(il param0, int param1, String param2, int param3) {
        kha var5 = null;
        RuntimeException var5_ref = null;
        String var6 = null;
        kha var7 = null;
        kha stackIn_3_0 = null;
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
              if (param1 == 0) {
                break L1;
              } else {
                var6 = (String) null;
                this.a(114, -55, (il) null, (String) null, -39);
                break L1;
              }
            }
            var7 = new kha(param3 - param0.field_w, param0.field_k + param3, param2.length());
            var5 = var7;
            this.field_c = new kha[]{var7};
            stackIn_3_0 = (kha) (var5);
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, il param2, String param3, byte param4) {
        kha var7 = null;
        int var8 = 0;
        int var6_int = 38 / ((param4 - 5) / 54);
        if (!(param3 != null)) {
            this.field_c = null;
            return;
        }
        if (this.field_j == param2 && this.field_h && 1 == this.field_m && this.field_k != null && this.field_k.equals(param3)) {
            return;
        }
        try {
            this.field_j = param2;
            this.field_h = true;
            this.field_m = 1;
            var7 = this.a(param2, 0, param3, param0);
            var8 = param2.b(param3);
            var7.field_c[0] = param1 - (var8 >> -2066817311);
            var7.field_c[param3.length()] = (var8 >> -409961023) + param1;
            jh.a(2097152, param3, param2, var7, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "po.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, il param2, String param3, int param4) {
        if (!(param3 != null)) {
            this.field_c = null;
            return;
        }
        if (param2 == this.field_j && this.field_h && 0 == this.field_m && this.field_k != null) {
            if (!(!this.field_k.equals(param3))) {
                return;
            }
        }
        this.field_j = param2;
        this.field_h = true;
        this.field_k = param3;
        this.field_m = 0;
        kha var7 = this.a(param2, 0, param3, param1);
        kha var8 = var7;
        var7.field_c[0] = param4;
        var8.field_c[param3.length()] = param2.b(param3) + param4;
        if (param0 != 16512) {
            return;
        }
        try {
            jh.a(param0 ^ 2113664, param3, param2, var8, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "po.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
            return;
        }
        field_l = null;
    }

    public po() {
    }

    static {
        field_i = "Back";
    }
}
