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
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          if (null == el.field_n) {
            return;
          } else {
            var1 = el.field_n;
            synchronized (var1) {
              L0: {
                el.field_n = null;
                break L0;
              }
            }
            return;
          }
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
        ol stackIn_37_0;
        ol stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        ol stackIn_38_0 = null;
        ol stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        ol stackIn_41_0;
        int stackIn_41_1;
        String stackIn_41_2;
        kg stackIn_41_3;
        ol stackIn_42_0;
        int stackIn_42_1;
        String stackIn_42_2;
        kg stackIn_42_3;
        int stackIn_42_4;
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
                L5: {
                  this.field_b = new ol[var10];
                  if (this.field_i == 0) {
                    break L5;
                  } else {
                    L6: {
                      if (1 == this.field_i) {
                        break L6;
                      } else {
                        L7: {
                          if (2 == this.field_i) {
                            break L7;
                          } else {
                            L8: {
                              var13 = (-(var10 * this.field_m) + this.field_e) / (1 + var10);
                              if (0 > var13) {
                                var13 = 0;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var12 = var13 + param5.field_y;
                            this.field_m = this.field_m + var13;
                            if (var16 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var12 = -param5.field_t + this.field_e - this.field_m * var10;
                        if (var16 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var12 = param5.field_y + (-(this.field_m * var10) + this.field_e >> 1969747265);
                    if (var16 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var12 = param5.field_y;
                break L4;
              }
              var13 = 0;
              L9: while (true) {
                L10: {
                  if (var13 >= var10) {
                    break L10;
                  } else {
                    var14 = var17[var13];
                    if (var16 == 0) {
                      L11: {
                        stackIn_37_0 = null;

                        stackIn_37_1 = null;

                        stackIn_37_2 = var12 - param5.field_y;

                        stackIn_37_3 = var12 + param5.field_t;

                        if (var14 != null) {
                          stackIn_38_0 = null;
                          stackIn_38_1 = null;
                          stackIn_38_2 = stackIn_37_2;
                          stackIn_38_3 = stackIn_37_3;
                          stackIn_38_4 = var14.length();
                          break L11;
                        } else {
                          stackIn_38_0 = null;
                          stackIn_38_1 = null;
                          stackIn_38_2 = stackIn_37_2;
                          stackIn_38_3 = stackIn_37_3;
                          stackIn_38_4 = 0;
                          break L11;
                        }
                      }
                      L12: {
                        var15 = new ol(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                        var15.field_g[0] = 0;
                        if (var14 == null) {
                          break L12;
                        } else {
                          L13: {
                            var15.field_g[var14.length()] = param5.a(var14);
                            stackIn_41_0 = (ol) (var15);

                            stackIn_41_1 = 79;

                            stackIn_41_2 = (String) (var14);

                            stackIn_41_3 = (kg) (param5);

                            if (-4 != (param1 ^ -1)) {
                              stackIn_42_0 = (ol) ((Object) stackIn_41_0);
                              stackIn_42_1 = stackIn_41_1;
                              stackIn_42_2 = (String) ((Object) stackIn_41_2);
                              stackIn_42_3 = (kg) ((Object) stackIn_41_3);
                              stackIn_42_4 = 0;
                              break L13;
                            } else {
                              stackIn_42_0 = (ol) ((Object) stackIn_41_0);
                              stackIn_42_1 = stackIn_41_1;
                              stackIn_42_2 = (String) ((Object) stackIn_41_2);
                              stackIn_42_3 = (kg) ((Object) stackIn_41_3);
                              stackIn_42_4 = this.a(param3, var14, param5.a(var14), 12);
                              break L13;
                            }
                          }
                          eh.a(stackIn_42_0, (byte) stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4);
                          break L12;
                        }
                      }
                      this.field_b[var13] = var15;
                      var12 = var12 + param2;
                      var13++;
                      if (var16 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackIn_47_0 = (RuntimeException) (var9);

            stackIn_47_1 = new StringBuilder().append("jh.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L14;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');

            if (param5 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L15;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L15;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_48_0), stackIn_51_2 + ',' + param6 + ',' + param7 + ')');
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
            field_g = null;
            field_h = null;
            return;
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
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        sg var5 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_h) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      if (-1 != (param0.field_l ^ -1)) {
                        break L4;
                      } else {
                        if (param0.field_f != 0) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2_int = 0;
                    L5: while (true) {
                      if (q.field_b <= var2_int) {
                        break L3;
                      } else {
                        var3 = eg.field_a[var2_int];
                        var7 = var3.field_i;
                        var6 = 2;
                        if (var4 != 0) {
                          if (var6 >= var7) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          L6: {
                            if (var6 != var7) {
                              break L6;
                            } else {
                              if (var3.field_l != param0.field_l) {
                                break L6;
                              } else {
                                if (param0.field_f == var3.field_f) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (param1 >= 11) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                var5 = (sg) null;
                jh.a((sg) null, -103);
                break L1;
              }
              L7: {
                if (param0.field_j == null) {
                  break L7;
                } else {
                  break L7;
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
          L8: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("jh.N(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
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
