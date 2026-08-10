/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends ue {
    static ti field_h;
    private String field_d;
    static pd field_n;
    private int field_e;
    private int field_j;
    private boolean field_f;
    private int field_i;
    private int field_m;
    static String field_g;
    private kg field_k;
    private int field_l;

    final void a(kg param0, int param1, byte param2, String param3, int param4) {
        ol var9 = null;
        ol var10 = null;
        if (!(param3 != null)) {
            this.field_b = null;
            return;
        }
        if (this.field_k == param0 && this.field_f && this.field_l == 2 && this.field_d != null) {
            if (!(!this.field_d.equals(param3))) {
                return;
            }
        }
        try {
            this.field_d = param3;
            this.field_f = true;
            if (param2 >= -63) {
                kg var7 = (kg) null;
                this.a((String) null, (byte) -90, (kg) null, -10, 16);
            }
            this.field_l = 2;
            this.field_k = param0;
            var9 = this.a((byte) 107, param4, param0, param3);
            var10 = var9;
            var10.field_g[0] = param1 - param0.a(param3);
            var10.field_g[param3.length()] = param1;
            eh.a(var10, (byte) 79, param3, param0, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "jh.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (!param0) {
          L0: {
            if (null == el.field_n) {
              break L0;
            } else {
              var1 = el.field_n;
              synchronized (var1) {
                L1: {
                  el.field_n = null;
                  break L1;
                }
              }
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, kg param3, String param4) {
        ol var8 = null;
        int var7 = 0;
        if (param4 == null) {
            this.field_b = null;
            return;
        }
        if (param3 == this.field_k && this.field_f && (this.field_l ^ -1) == -2 && null != this.field_d && this.field_d.equals(param4)) {
            return;
        }
        try {
            this.field_l = 1;
            this.field_f = true;
            this.field_k = param3;
            var8 = this.a((byte) 34, param2, param3, param4);
            var7 = param3.a(param4);
            if (param1 != 7531) {
                this.field_i = 41;
            }
            var8.field_g[0] = param0 + -(var7 >> 1558484161);
            var8.field_g[param4.length()] = (var7 >> 953290081) + param0;
            eh.a(var8, (byte) 79, param4, param3, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "jh.O(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, String param4, kg param5, int param6, int param7) {
        ol stackIn_35_0;
        ol stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        ol stackIn_36_0 = null;
        ol stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        ol stackIn_39_0;
        int stackIn_39_1;
        String stackIn_39_2;
        kg stackIn_39_3;
        ol stackIn_40_0;
        int stackIn_40_1;
        String stackIn_40_2;
        kg stackIn_40_3;
        int stackIn_40_4;
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
        ol var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        var16 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != (param2 ^ -1)) {
                break L1;
              } else {
                param2 = param5.field_C;
                break L1;
              }
            }
            if (param4 == null) {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param5 != this.field_k) {
                  break L2;
                } else {
                  if (this.field_f) {
                    break L2;
                  } else {
                    if (this.field_l != param1) {
                      break L2;
                    } else {
                      if (param7 != this.field_i) {
                        break L2;
                      } else {
                        if (this.field_m != param2) {
                          break L2;
                        } else {
                          if (param6 != this.field_e) {
                            break L2;
                          } else {
                            if (param3 != this.field_j) {
                              break L2;
                            } else {
                              if (this.field_d == null) {
                                break L2;
                              } else {
                                if (this.field_d.equals(param4)) {
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
                this.field_m = param2;
                this.field_d = param4;
                this.field_i = param7;
                this.field_e = param6;
                this.field_k = param5;
                this.field_f = false;
                this.field_l = param1;
                this.field_j = param3;
                var17 = new String[1 + param5.b(param4, param3)];
                var18 = var17;
                var10 = Math.max(1, param5.a(param4, new int[]{param3}, var18));
                var11 = -73 / ((-6 - param0) / 50);
                if ((this.field_i ^ -1) != -4) {
                  break L3;
                } else {
                  if (1 != var10) {
                    break L3;
                  } else {
                    this.field_i = 1;
                    break L3;
                  }
                }
              }
              L4: {
                this.field_b = new ol[var10];
                if (this.field_i == 0) {
                  var12 = param5.field_y;
                  break L4;
                } else {
                  if (1 == this.field_i) {
                    var12 = param5.field_y + (-(this.field_m * var10) + this.field_e >> 1969747265);
                    break L4;
                  } else {
                    if (2 == this.field_i) {
                      var12 = -param5.field_t + this.field_e - this.field_m * var10;
                      break L4;
                    } else {
                      L5: {
                        var13 = (-(var10 * this.field_m) + this.field_e) / (1 + var10);
                        if (0 > var13) {
                          var13 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var12 = var13 + param5.field_y;
                      this.field_m = this.field_m + var13;
                      break L4;
                    }
                  }
                }
              }
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

                    stackIn_35_2 = var12 - param5.field_y;

                    stackIn_35_3 = var12 + param5.field_t;

                    if (var14 != null) {
                      stackIn_36_0 = null;
                      stackIn_36_1 = null;
                      stackIn_36_2 = stackIn_35_2;
                      stackIn_36_3 = stackIn_35_3;
                      stackIn_36_4 = var14.length();
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
                    var15 = new ol(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var15.field_g[0] = 0;
                    if (var14 == null) {
                      break L8;
                    } else {
                      L9: {
                        var15.field_g[var14.length()] = param5.a(var14);
                        stackIn_39_0 = (ol) (var15);

                        stackIn_39_1 = 79;

                        stackIn_39_2 = (String) (var14);

                        stackIn_39_3 = (kg) (param5);

                        if (-4 != (param1 ^ -1)) {
                          stackIn_40_0 = (ol) ((Object) stackIn_39_0);
                          stackIn_40_1 = stackIn_39_1;
                          stackIn_40_2 = (String) ((Object) stackIn_39_2);
                          stackIn_40_3 = (kg) ((Object) stackIn_39_3);
                          stackIn_40_4 = 0;
                          break L9;
                        } else {
                          stackIn_40_0 = (ol) ((Object) stackIn_39_0);
                          stackIn_40_1 = stackIn_39_1;
                          stackIn_40_2 = (String) ((Object) stackIn_39_2);
                          stackIn_40_3 = (kg) ((Object) stackIn_39_3);
                          stackIn_40_4 = this.a(param3, var14, param5.a(var14), 12);
                          break L9;
                        }
                      }
                      eh.a(stackIn_40_0, (byte) stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_40_4);
                      break L8;
                    }
                  }
                  this.field_b[var13] = var15;
                  var12 = var12 + param2;
                  var13++;
                  continue L6;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var9);

            stackIn_45_1 = new StringBuilder().append("jh.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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


            stackIn_48_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_46_0), stackIn_49_2 + ',' + param6 + ',' + param7 + ')');
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

    final void a(String param0, byte param1, kg param2, int param3, int param4) {
        ol var7 = null;
        if (!(param0 != null)) {
            this.field_b = null;
            return;
        }
        if (this.field_k == param2 && this.field_f && this.field_l == 0 && this.field_d != null && this.field_d.equals(param0)) {
            return;
        }
        try {
            this.field_l = 0;
            this.field_f = true;
            this.field_k = param2;
            this.field_d = param0;
            int var6_int = -37 / ((param1 - -50) / 49);
            var7 = this.a((byte) 52, param3, param2, param0);
            var7.field_g[0] = param4;
            var7.field_g[param0.length()] = param2.a(param0) + param4;
            eh.a(var7, (byte) 79, param0, param2, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "jh.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != -1) {
            field_h = (ti) null;
        }
        field_g = null;
        field_h = null;
    }

    private final ol a(byte param0, int param1, kg param2, String param3) {
        ol var5 = null;
        RuntimeException var5_ref = null;
        ol var6 = null;
        ol stackIn_2_0 = null;
        ol stackIn_4_0 = null;
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
            if (param0 > 17) {
              var6 = new ol(-param2.field_y + param1, param1 + param2.field_t, param3.length());
              var5 = var6;
              this.field_b = new ol[]{var6};
              stackIn_4_0 = (ol) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ol) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("jh.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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

            if (param3 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(sg param0, int param1) {
        int var2_int = 0;
        sg var3 = null;
        int var4 = 0;
        sg var5 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_h) {
              L1: {
                L2: {
                  if (-1 != (param0.field_l ^ -1)) {
                    break L2;
                  } else {
                    if (param0.field_f != 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (q.field_b <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = eg.field_a[var2_int];
                      if (2 != var3.field_i) {
                        break L4;
                      } else {
                        if (var3.field_l != param0.field_l) {
                          break L4;
                        } else {
                          if (param0.field_f == var3.field_f) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1 >= 11) {
                  break L5;
                } else {
                  var5 = (sg) null;
                  jh.a((sg) null, -103);
                  break L5;
                }
              }
              L6: {
                if (param0.field_j == null) {
                  break L6;
                } else {
                  break L6;
                }
              }
              mh.a(-27968, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("jh.N(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
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

    public jh() {
    }

    static {
        field_n = new pd();
    }
}
