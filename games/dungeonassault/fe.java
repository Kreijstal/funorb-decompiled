/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends l {
    private boolean field_q;
    private String field_l;
    private int field_j;
    static md field_k;
    private int field_m;
    private int field_p;
    private int field_h;
    private se field_i;
    static int[] field_g;
    static String[] field_n;
    private int field_o;

    final void a(int param0, byte param1, String param2, se param3, int param4) {
        tg var7 = null;
        if (!(param2 != null)) {
            this.field_e = null;
            return;
        }
        int var6_int = -118 / ((29 - param1) / 50);
        if (param3 == this.field_i && this.field_q && 2 == this.field_h && this.field_l != null) {
            if (!(!this.field_l.equals(param2))) {
                return;
            }
        }
        try {
            this.field_l = param2;
            this.field_q = true;
            this.field_i = param3;
            this.field_h = 2;
            var7 = this.a(param2, param4, param3, 0);
            var7.field_k[0] = param0 + -param3.b(param2);
            var7.field_k[param2.length()] = param0;
            bf.a(param2, var7, 0, param3, 15553);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "fe.P(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, se param2, int param3, int param4) {
        tg var7 = null;
        tg var8 = null;
        if (param0 == null) {
            this.field_e = null;
            return;
        }
        if (param2 == this.field_i && this.field_q && -1 == (this.field_h ^ -1) && this.field_l != null) {
            if (!(!this.field_l.equals(param0))) {
                return;
            }
        }
        this.field_h = 0;
        this.field_i = param2;
        this.field_q = true;
        this.field_l = param0;
        if (param1 > -17) {
            return;
        }
        try {
            var7 = this.a(param0, param4, param2, 0);
            var8 = var7;
            var7.field_k[0] = param3;
            var8.field_k[param0.length()] = param3 + param2.b(param0);
            bf.a(param0, var8, 0, param2, 15553);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "fe.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 > -33) {
            fe.b((byte) -23);
        }
        field_n = null;
        field_g = null;
        field_k = null;
    }

    private final tg a(String param0, int param1, se param2, int param3) {
        tg var5 = null;
        RuntimeException var5_ref = null;
        tg var6 = null;
        tg stackIn_2_0 = null;
        tg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 0) {
              var6 = new tg(param1 + -param2.field_H, param2.field_E + param1, param0.length());
              var5 = var6;
              this.field_e = new tg[]{var6};
              stackIn_4_0 = (tg) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (tg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("fe.R(");

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, String param1, se param2, byte param3, int param4) {
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
        int var7 = 0;
        int var8 = 0;
        tg var9 = null;
        try {
          L0: {
            if (param1 == null) {
              this.field_e = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 != this.field_i) {
                  break L1;
                } else {
                  if (!this.field_q) {
                    break L1;
                  } else {
                    if (-2 != (this.field_h ^ -1)) {
                      break L1;
                    } else {
                      if (null == this.field_l) {
                        break L1;
                      } else {
                        if (!this.field_l.equals(param1)) {
                          break L1;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              this.field_h = 1;
              this.field_q = true;
              this.field_i = param2;
              var8 = -121 % ((34 - param3) / 47);
              var9 = this.a(param1, param0, param2, 0);
              var7 = param2.b(param1);
              var9.field_k[0] = param4 + -(var7 >> -1014860703);
              var9.field_k[param1.length()] = param4 - -(var7 >> 2067545665);
              bf.a(param1, var9, 0, param2, 15553);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("fe.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ')');
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

    final void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, se param7) {
        tg stackIn_35_0;
        tg stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        tg stackIn_36_0 = null;
        tg stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        String stackIn_40_0 = null;
        tg stackIn_40_1 = null;
        String stackIn_41_0 = null;
        tg stackIn_41_1 = null;
        int stackIn_41_2 = 0;
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
        tg var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (0 != param6) {
                break L1;
              } else {
                param6 = param7.field_R;
                break L1;
              }
            }
            if (param0 == null) {
              this.field_e = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param7 != this.field_i) {
                  break L2;
                } else {
                  if (this.field_q) {
                    break L2;
                  } else {
                    if (param4 != this.field_h) {
                      break L2;
                    } else {
                      if (this.field_p != param2) {
                        break L2;
                      } else {
                        if (this.field_o != param6) {
                          break L2;
                        } else {
                          if (param3 != this.field_m) {
                            break L2;
                          } else {
                            if (this.field_j != param5) {
                              break L2;
                            } else {
                              if (null == this.field_l) {
                                break L2;
                              } else {
                                if (!this.field_l.equals(param0)) {
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
                this.field_p = param2;
                this.field_h = param4;
                this.field_q = false;
                this.field_m = param3;
                this.field_j = param5;
                this.field_o = param6;
                this.field_l = param0;
                this.field_i = param7;
                var16 = new String[param7.c(param0, param5) - -1];
                var17 = var16;
                var10 = Math.max(1, param7.a(param0, new int[]{param5}, var17));
                if (this.field_p != 3) {
                  break L3;
                } else {
                  if (-2 != (var10 ^ -1)) {
                    break L3;
                  } else {
                    this.field_p = 1;
                    break L3;
                  }
                }
              }
              L4: {
                if (this.field_p == param1) {
                  var11 = param7.field_H;
                  break L4;
                } else {
                  if (-2 == (this.field_p ^ -1)) {
                    var11 = (-(this.field_o * var10) + this.field_m >> 494689441) + param7.field_H;
                    break L4;
                  } else {
                    if (-3 != (this.field_p ^ -1)) {
                      L5: {
                        var12 = (this.field_m - this.field_o * var10) / (var10 - -1);
                        if (-1 < (var12 ^ -1)) {
                          var12 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.field_o = this.field_o + var12;
                      var11 = param7.field_H + var12;
                      break L4;
                    } else {
                      var11 = -param7.field_E + this.field_m - var10 * this.field_o;
                      break L4;
                    }
                  }
                }
              }
              this.field_e = new tg[var10];
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

                    stackIn_35_2 = -param7.field_H + var11;

                    stackIn_35_3 = var11 - -param7.field_E;

                    if (var13 == null) {
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
                      stackIn_36_4 = var13.length();
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new tg(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var14.field_k[0] = 0;
                    if (var13 != null) {
                      L9: {
                        var14.field_k[var13.length()] = param7.b(var13);
                        stackIn_40_0 = (String) (var13);

                        stackIn_40_1 = (tg) (var14);

                        if (3 != param4) {
                          stackIn_41_0 = (String) ((Object) stackIn_40_0);
                          stackIn_41_1 = (tg) ((Object) stackIn_40_1);
                          stackIn_41_2 = 0;
                          break L9;
                        } else {
                          stackIn_41_0 = (String) ((Object) stackIn_40_0);
                          stackIn_41_1 = (tg) ((Object) stackIn_40_1);
                          stackIn_41_2 = this.a(var13, param1 + 0, param7.b(var13), param5);
                          break L9;
                        }
                      }
                      bf.a(stackIn_41_0, stackIn_41_1, stackIn_41_2, param7, 15553);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var11 = var11 + param6;
                  this.field_e[var12] = var14;
                  var12++;
                  continue L6;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var9);

            stackIn_46_1 = new StringBuilder().append("fe.T(");

            if (param0 == null) {
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


            stackIn_49_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_47_0), stackIn_50_2 + ')');
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

    public fe() {
    }

    static {
        field_k = new md();
        field_n = new String[]{"Reconnoitre", "Reveal two rooms at start of game. (Single use)"};
    }
}
