/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends pn {
    ea field_o;
    static int field_q;
    static jp field_m;
    boolean field_p;
    static String[] field_r;
    static String field_n;
    static volatile boolean field_t;
    static String field_u;
    static java.security.SecureRandom field_s;

    private final void a(int param0, int param1, f[][] param2, int param3, f param4) {
        pn var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              param0 = param0 - this.field_o.field_s;
              param1 = param1 - this.field_o.field_o;
              if (param3 == 12) {
                break L1;
              } else {
                field_t = true;
                break L1;
              }
            }
            L2: {
              if (this.field_o == param2[param0][param1]) {
                param2[param0][param1] = param4;
                break L2;
              } else {
                var6 = (pn) ((Object) param2[param0][param1]);
                L3: while (true) {
                  if (this.field_o == var6.field_l) {
                    var6.field_l = param4;
                    break L2;
                  } else {
                    var6 = (pn) ((Object) var6.field_l);
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6_ref);

            stackIn_12_1 = new StringBuilder().append("sl.FA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final boolean b(byte param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 >= 43) {
            break L0;
          } else {
            field_u = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_o.b((byte) 126)) {
              break L2;
            } else {
              if (!this.field_l.b((byte) 98)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(vc param0, vc param1, int param2, int param3) {
        try {
            vk.field_L = param3;
            ec.field_m = param0;
            int var4_int = 37 / ((param2 - 58) / 47);
            gh.field_F = param1;
            mh.a(kh.field_l / 2, -20, kh.field_d / 2);
            mo.a(param0.field_u + param0.field_A, param1.field_A, param0.field_A, param1.field_A - -param1.field_u, (byte) -16);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "sl.BA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 16736352) {
              L1: {
                L2: {
                  if (!this.field_o.a(16736352, param1, param2, param3, param4, param5, param6, param7)) {
                    break L2;
                  } else {
                    if (!this.field_l.a(16736352, param1, param2, param3, param4, param5, param6, param7)) {
                      break L2;
                    } else {
                      stackIn_7_0 = 1;
                      break L1;
                    }
                  }
                }
                stackIn_7_0 = 0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var9);

            stackIn_10_1 = new StringBuilder().append("sl.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 90 % ((param2 - -43) / 51);
            stackIn_1_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("sl.B(");

            if (param0 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (f) (this);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        Object stackIn_4_0 = null;
        Object stackIn_10_0;
        f stackIn_10_1;
        f stackIn_10_2;
        int stackIn_10_3;
        int stackIn_10_4;
        f[][] stackIn_10_5;
        Object stackIn_11_0 = null;
        f stackIn_11_1 = null;
        f stackIn_11_2 = null;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        f[][] stackIn_11_5 = null;
        dl[] stackIn_11_6 = null;
        Object stackIn_13_0 = null;
        f stackIn_16_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        f var7 = null;
        RuntimeException var7_ref = null;
        ig var8 = null;
        f var9 = null;
        int var10 = 0;
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            var7 = this.field_l;
            L1: while (true) {
              if (!(var7 instanceof ro)) {
                if (var7 instanceof pn) {
                  var7 = ((pn) ((Object) var7)).field_l;
                  continue L1;
                } else {
                  L2: {
                    stackIn_10_0 = this;

                    stackIn_10_1 = this.field_l;

                    stackIn_10_2 = (f) (param0);

                    stackIn_10_3 = param1;

                    stackIn_10_4 = param2;

                    stackIn_10_5 = (f[][]) (param3);

                    if (!this.field_o.b((byte) 121)) {
                      stackIn_11_0 = this;
                      stackIn_11_1 = (f) ((Object) stackIn_10_1);
                      stackIn_11_2 = (f) ((Object) stackIn_10_2);
                      stackIn_11_3 = stackIn_10_3;
                      stackIn_11_4 = stackIn_10_4;
                      stackIn_11_5 = (f[][]) ((Object) stackIn_10_5);
                      stackIn_11_6 = null;
                      break L2;
                    } else {
                      stackIn_11_0 = this;
                      stackIn_11_1 = (f) ((Object) stackIn_10_1);
                      stackIn_11_2 = (f) ((Object) stackIn_10_2);
                      stackIn_11_3 = stackIn_10_3;
                      stackIn_11_4 = stackIn_10_4;
                      stackIn_11_5 = (f[][]) ((Object) stackIn_10_5);
                      stackIn_11_6 = (dl[]) (param4);
                      break L2;
                    }
                  }
                  ((sl) (this)).field_l = ((f) (Object) stackIn_11_1).a(stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_11_5, stackIn_11_6, param5);
                  if (!this.field_o.a((byte) 42, param3, param0)) {
                    cn.field_e.a(64, param2 * 12, 12 * param1, 0, (byte) -111);
                    var8 = new ig(param0, bd.field_n, this.field_l, true);
                    var9 = this.field_o.a(param3, -this.field_o.field_s + param1, var8, 11460, param2 - this.field_o.field_o);
                    this.field_l = (f) ((Object) var8);
                    if (var9 == this.field_o) {
                      stackIn_18_0 = this;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      this.a(param1, param2, param3, 12, var9);
                      stackIn_16_0 = this.field_l;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = this;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                stackIn_4_0 = this;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var7_ref);

            stackIn_21_1 = new StringBuilder().append("sl.H(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param4 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (f) (this);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (f) (this);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              return (f) (this);
            }
          }
        }
    }

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        Object var5 = null;
        f var6 = null;
        f stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
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
              if (param1 <= -74) {
                break L1;
              } else {
                field_r = (String[]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_o.field_s < 0) {
                var5 = this;
                this.field_l = this.field_l.a(param0, (byte) -125, param2, param3);
                break L2;
              } else {
                var5 = super.a(param0, (byte) -89, param2, param3);
                break L2;
              }
            }
            L3: {
              if (!param2) {
                break L3;
              } else {
                var6 = this.field_o.a(param3, param0.field_a, param0.field_c, param0.field_b, true);
                if (this.field_o == var6) {
                  break L3;
                } else {
                  this.a(param0.field_c, param0.field_b, param3, 12, var6);
                  stackIn_8_0 = this.field_l;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_10_0 = var5;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = var5;

            stackIn_13_1 = new StringBuilder().append("sl.S(");

            if (param0 == null) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return (f) ((Object) stackIn_10_0);
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            if (param1 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param1.length();
              if (1 > var3_int) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = fe.a(60136, param1);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (1 <= var4.length()) {
                        L2: {
                          if (am.a(var4.charAt(0), (byte) 34)) {
                            break L2;
                          } else {
                            if (am.a(var4.charAt(-1 + var4.length()), (byte) 72)) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param1.length()) {
                                  if (var5 <= param2) {
                                    stackIn_34_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackIn_32_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (am.a((char) var7, (byte) 93)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (-3 < (var5 ^ -1)) {
                                      break L5;
                                    } else {
                                      if (param0) {
                                        break L5;
                                      } else {
                                        stackIn_28_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("sl.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L6;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L6;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_32_0 != 0;
                  } else {
                    return stackIn_34_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final nj a(int param0, nj param1) {
        nj var3 = null;
        RuntimeException var3_ref = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_o.a(param0, param1);
              if (var3 != null) {
                break L1;
              } else {
                var3 = this.field_l.a(param0 + 0, param1);
                break L1;
              }
            }
            stackIn_3_0 = (nj) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("sl.V(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        wm var10 = null;
        int var8 = 0;
        int var9 = 0;
        if (this.field_p && (this.field_o.field_s ^ -1) <= -1) {
            var10 = jf.a(kh.field_j, param4, 0, param4 + param1 * 2, kh.field_b);
            if (var10 == null) {
                return;
            }
            var8 = (this.field_o.field_m - this.field_o.field_p) * param1 * 2 / this.field_o.field_p;
            var9 = param2 * (this.field_o.field_m + -this.field_o.field_p) * 2 / this.field_o.field_p;
            this.field_o.a(param3, param4 + var8 * this.field_o.field_o, param1, param2, param5 + var9 * this.field_o.field_s, 4261);
            var10.a((byte) -4);
        }
        int var7 = 68 % ((74 - param0) / 41);
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            var3_int = 0;
            if (param0 == -24) {
              L1: while (true) {
                if (0 >= param2) {
                  stackIn_7_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_int = param1 & 1 | var3_int << 1819447425;
                  param2--;
                  param1 = param1 >>> 1;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = -34;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var3), "sl.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          L0: {
            L1: {
              if (!this.field_o.g(0)) {
                break L1;
              } else {
                this.field_l.a(126, param1, param2, param3, param4, param5, param6, param7);
                break L1;
              }
            }
            L2: {
              if (param0 > 92) {
                break L2;
              } else {
                this.field_p = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var9);

            stackIn_7_1 = new StringBuilder().append("sl.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        Object stackIn_5_0 = null;
        f stackIn_13_0 = null;
        f stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        vc var9 = null;
        f var10 = null;
        try {
          L0: {
            L1: {
              this.field_l = this.field_l.a(param0, param1, param2, param3, (byte) -126, param5, param6);
              if (param4 <= -87) {
                break L1;
              } else {
                var9 = (vc) null;
                sl.a((vc) null, (vc) null, -42, -91);
                break L1;
              }
            }
            if (param1 == this.field_o) {
              stackIn_5_0 = this;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                L3: {
                  if (this.field_o.field_o != -param2) {
                    break L3;
                  } else {
                    if (-param0 != this.field_o.field_s) {
                      break L3;
                    } else {
                      if (this.field_o.field_p * param1.field_p > param1.field_p * this.field_o.field_m + this.field_o.field_p * param1.field_m) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var10 = this.field_o.a(param0, param2 + param5 - this.field_o.field_o, param6, -31135, -this.field_o.field_s + (param0 + param3), param2, param1);
                if (this.field_o != var10) {
                  this.a(param3 - -param0, param5 - -param2, param6, 12, var10);
                  stackIn_13_0 = this.field_l;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              stackIn_15_0 = super.a(param0, param1, param2, param3, (byte) -117, param5, param6);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8);

            stackIn_18_1 = new StringBuilder().append("sl.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (f) (this);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            return (f) null;
        }
        if (this.field_o.g(0)) {
            this.field_l = this.field_l.a(param0, (byte) -110, param2);
        }
        return (f) (this);
    }

    sl(ea param0, f param1) {
        super(param1);
        this.field_p = true;
        try {
            this.field_o = param0;
            this.a((byte) 97, param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "sl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_q = -108;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!this.field_o.a(param2, true, param1)) {
                  break L3;
                } else {
                  if (!this.field_l.a(param0, param1, param2)) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("sl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void a(f[][] param0, int param1, byte param2, int param3) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (!this.field_o.g(0)) {
                break L1;
              } else {
                this.field_l.a(param0, param1, (byte) 40, param3);
                break L1;
              }
            }
            L2: {
              if (param2 == 40) {
                break L2;
              } else {
                this.a(true, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("sl.EA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        field_s = null;
        field_n = null;
        field_u = null;
        field_r = null;
        if (!param0) {
            vc var2 = (vc) null;
            sl.a((vc) null, (vc) null, 111, 59);
        }
    }

    final f e(byte param0) {
        ma var3;
        ea var4;
        sl var5;
        if (this.field_l instanceof ma) {
          var3 = (ma) ((Object) this.field_l);
          if ((this.field_o.field_s ^ -1) <= -1) {
            this.field_l = var3.field_l;
            var3.field_l = this.e((byte) -8);
            return (f) ((Object) var3);
          } else {
            return (f) (this);
          }
        } else {
          L0: {
            if (param0 == -8) {
              break L0;
            } else {
              this.a(73, 92, 59, (f[][]) null, -47, 116, 85, -122);
              break L0;
            }
          }
          if (!(this.field_l instanceof ea)) {
            L1: {
              if (this.field_l instanceof sl) {
                L2: {
                  var5 = (sl) ((Object) this.field_l);
                  if ((this.field_o.field_s ^ -1) < -1) {
                    break L2;
                  } else {
                    if (0 != this.field_o.field_s) {
                      break L1;
                    } else {
                      if ((var5.field_o.field_s ^ -1) >= -1) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                this.field_l = var5.field_l;
                var5.field_l = this.e((byte) -8);
                return (f) ((Object) var5);
              } else {
                break L1;
              }
            }
            return (f) (this);
          } else {
            L3: {
              var4 = (ea) ((Object) this.field_l);
              if ((this.field_o.field_s ^ -1) < -1) {
                break L3;
              } else {
                L4: {
                  if (0 != this.field_o.field_s) {
                    break L4;
                  } else {
                    if (0 > var4.field_s) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                return (f) (this);
              }
            }
            this.field_l = var4.field_l;
            var4.field_l = this.e((byte) -8);
            return (f) ((Object) var4);
          }
        }
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        f var7 = null;
        Object stackIn_2_0 = null;
        f stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_l = this.field_l.a(param0, param1, param2, param3, (byte) 127);
            if (-1 != (2 & this.field_l.a(true, false) ^ -1)) {
              var6_int = 69 % ((param4 - 73) / 42);
              var7 = this.field_o.a(param0 + -this.field_o.field_s, -this.field_o.field_o + param1, param2, param3, (byte) 126);
              if (var7 != this.field_o) {
                this.a(param0, param1, param2, 12, var7);
                stackIn_6_0 = this.field_l;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return (f) (this);
              }
            } else {
              stackIn_2_0 = this;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("sl.L(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (f) (this);
        } else {
          return stackIn_6_0;
        }
    }

    final int a(boolean param0, boolean param1) {
        int var3 = this.field_o.a(param1, 0);
        if ((var3 & 2) != 0) {
            var3 = var3 | 12;
        }
        int var4 = this.field_l.a(param0, param1);
        if ((2 & var4) != 0) {
            var4 = var4 | 12;
        }
        return var4 & var3;
    }

    static {
        field_n = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_m = new jp();
        field_u = "Password is valid";
        field_t = true;
    }
}
