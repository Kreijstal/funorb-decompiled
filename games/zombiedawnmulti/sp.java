/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends mp {
    private int field_j;
    private int field_m;
    static boolean field_h;
    private boolean field_o;
    private fm field_f;
    static int field_g;
    private int field_n;
    private int field_k;
    private int field_l;
    private String field_i;

    private final td a(fm param0, String param1, int param2, int param3) {
        td var5 = null;
        RuntimeException var5_ref = null;
        td var6 = null;
        td stackIn_3_0 = null;
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
              if (param3 == 1) {
                break L1;
              } else {
                this.field_j = -34;
                break L1;
              }
            }
            var6 = new td(param2 - param0.field_C, param2 + param0.field_r, param1.length());
            var5 = var6;
            this.field_e = new td[]{var6};
            stackIn_3_0 = (td) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("sp.L(");

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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, boolean param2, String param3, fm param4) {
        td var8 = null;
        td var9 = null;
        if (param3 == null) {
            this.field_e = null;
            return;
        }
        if (this.field_f == param4 && this.field_o && (this.field_m ^ -1) == -3 && this.field_i != null) {
            if (!(!this.field_i.equals(param3))) {
                return;
            }
        }
        try {
            this.field_m = 2;
            this.field_o = param2 ? true : false;
            this.field_i = param3;
            this.field_f = param4;
            var8 = this.a(param4, param3, param1, 1);
            var9 = var8;
            var9.field_e[0] = -param4.a(param3) + param0;
            var9.field_e[param3.length()] = param0;
            qd.a(param4, 0, param3, 109, var9);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sp.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, fm param2, String param3, int param4) {
        td var8 = null;
        td var9 = null;
        if (!(param3 != null)) {
            this.field_e = null;
            return;
        }
        if (param2 == this.field_f && this.field_o && -1 == (this.field_m ^ -1) && this.field_i != null) {
            if (!(!this.field_i.equals(param3))) {
                return;
            }
        }
        try {
            this.field_o = true;
            this.field_m = 0;
            this.field_i = param3;
            int var7 = -125 / ((-24 - param1) / 46);
            this.field_f = param2;
            var8 = this.a(param2, param3, param4, 1);
            var9 = var8;
            var8.field_e[0] = param0;
            var9.field_e[param3.length()] = param0 - -param2.a(param3);
            qd.a(param2, 0, param3, 116, var9);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sp.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void c(int param0) {
        nb.field_a.h(param0 ^ -123);
        if (!(pj.field_I != null)) {
            pj.field_I = new ta(nb.field_a, pm.field_P);
        }
        if (param0 != 0) {
            java.awt.Frame var2 = (java.awt.Frame) null;
            sp.a((go) null, -50, (java.awt.Frame) null);
        }
        nb.field_a.b(param0 + 3016, pj.field_I);
    }

    final void a(String param0, int param1, int param2, int param3, byte param4, int param5, int param6, fm param7) {
        td stackIn_37_0;
        td stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        td stackIn_38_0 = null;
        td stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        fm stackIn_42_0 = null;
        fm stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        td var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param4 <= -16) {
              L1: {
                if (param3 != 0) {
                  break L1;
                } else {
                  param3 = param7.field_w;
                  break L1;
                }
              }
              if (param0 == null) {
                this.field_e = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (param7 != this.field_f) {
                    break L2;
                  } else {
                    if (this.field_o) {
                      break L2;
                    } else {
                      if (this.field_m != param1) {
                        break L2;
                      } else {
                        if (this.field_j != param5) {
                          break L2;
                        } else {
                          if (this.field_n != param3) {
                            break L2;
                          } else {
                            if (param2 != this.field_l) {
                              break L2;
                            } else {
                              if (param6 != this.field_k) {
                                break L2;
                              } else {
                                if (null == this.field_i) {
                                  break L2;
                                } else {
                                  if (this.field_i.equals(param0)) {
                                    decompiledRegionSelector0 = 2;
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
                  this.field_l = param2;
                  this.field_j = param5;
                  this.field_k = param6;
                  this.field_f = param7;
                  this.field_i = param0;
                  this.field_n = param3;
                  this.field_o = false;
                  this.field_m = param1;
                  var16 = new String[param7.b(param0, param6) + 1];
                  var17 = var16;
                  var10 = Math.max(1, param7.a(param0, new int[]{param6}, var17));
                  if ((this.field_j ^ -1) != -4) {
                    break L3;
                  } else {
                    if (-2 == (var10 ^ -1)) {
                      this.field_j = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  this.field_e = new td[var10];
                  if (this.field_j == 0) {
                    var11 = param7.field_C;
                    break L4;
                  } else {
                    if (this.field_j != 1) {
                      if (2 != this.field_j) {
                        L5: {
                          var12 = (-(this.field_n * var10) + this.field_l) / (1 + var10);
                          if (-1 >= (var12 ^ -1)) {
                            break L5;
                          } else {
                            var12 = 0;
                            break L5;
                          }
                        }
                        this.field_n = this.field_n + var12;
                        var11 = param7.field_C + var12;
                        break L4;
                      } else {
                        var11 = -(this.field_n * var10) + -param7.field_r + this.field_l;
                        break L4;
                      }
                    } else {
                      var11 = param7.field_C + (this.field_l + -(var10 * this.field_n) >> -1852565727);
                      break L4;
                    }
                  }
                }
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

                      stackIn_37_2 = -param7.field_C + var11;

                      stackIn_37_3 = var11 + param7.field_r;

                      if (var13 != null) {
                        stackIn_38_0 = null;
                        stackIn_38_1 = null;
                        stackIn_38_2 = stackIn_37_2;
                        stackIn_38_3 = stackIn_37_3;
                        stackIn_38_4 = var13.length();
                        break L7;
                      } else {
                        stackIn_38_0 = null;
                        stackIn_38_1 = null;
                        stackIn_38_2 = stackIn_37_2;
                        stackIn_38_3 = stackIn_37_3;
                        stackIn_38_4 = 0;
                        break L7;
                      }
                    }
                    L8: {
                      var14 = new td(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                      var14.field_e[0] = 0;
                      if (var13 != null) {
                        L9: {
                          var14.field_e[var13.length()] = param7.a(var13);
                          stackIn_42_0 = (fm) (param7);

                          if ((param1 ^ -1) != -4) {
                            stackIn_43_0 = (fm) ((Object) stackIn_42_0);
                            stackIn_43_1 = 0;
                            break L9;
                          } else {
                            stackIn_43_0 = (fm) ((Object) stackIn_42_0);
                            stackIn_43_1 = this.a(var13, 0, param7.a(var13), param6);
                            break L9;
                          }
                        }
                        qd.a(stackIn_43_0, stackIn_43_1, var13, 120, var14);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    this.field_e[var12] = var14;
                    var11 = var11 + param3;
                    var12++;
                    continue L6;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var9);

            stackIn_48_1 = new StringBuilder().append("sp.O(");

            if (param0 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L10;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L11;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_49_0), stackIn_52_2 + ')');
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

    final void a(fm param0, String param1, int param2, byte param3, int param4) {
        td var8 = null;
        int var7 = 0;
        if (param1 == null) {
            this.field_e = null;
            return;
        }
        if (this.field_f == param0 && this.field_o && this.field_m == 1 && this.field_i != null) {
            if (!(!this.field_i.equals(param1))) {
                return;
            }
        }
        try {
            this.field_m = 1;
            this.field_f = param0;
            this.field_o = true;
            if (param3 != 65) {
                this.field_o = false;
            }
            var8 = this.a(param0, param1, param2, 1);
            var7 = param0.a(param1);
            var8.field_e[0] = param4 + -(var7 >> 1001919233);
            var8.field_e[param1.length()] = param4 - -(var7 >> 1668492769);
            qd.a(param0, 0, param1, param3 ^ 61, var8);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sp.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(go param0, int param1, java.awt.Frame param2) {
        di var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a(param2, true);
              L2: while (true) {
                if (0 != var3.field_f) {
                  if (1 != var3.field_f) {
                    vd.a(false, 100L);
                    continue L1;
                  } else {
                    if (param1 == 1) {
                      param2.setVisible(false);
                      param2.dispose();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                } else {
                  vd.a(false, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("sp.N(");

            if (param0 == null) {
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
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public sp() {
    }

    static {
        field_h = true;
    }
}
