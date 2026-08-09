/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends pp {
    static du field_j;
    static kv[] field_k;
    int field_i;
    int field_l;

    final void a(lu param0, byte param1) {
        try {
            int var3_int = -112 % ((34 - param1) / 58);
            super.a(param0, (byte) -32);
            param0.b(this.field_f, -114);
            param0.d(this.field_i, 0);
            param0.d(this.field_l, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "sl.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        if (param0 >= -67) {
            return;
        }
        System.out.println("Error: " + ig.a(-19384, param1, "%0a", "\n"));
    }

    final static boolean a(boolean param0, byte param1, CharSequence param2) {
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
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if ((var3_int ^ -1) > -2) {
                  break L1;
                } else {
                  if ((var3_int ^ -1) < -13) {
                    break L1;
                  } else {
                    L2: {
                      var5 = 28 % ((78 - param1) / 34);
                      var4 = fq.a(0, param2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (mp.a(true, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (mp.a(true, var4.charAt(var4.length() + -1))) {
                                break L3;
                              } else {
                                var6 = 0;
                                var7 = 0;
                                L4: while (true) {
                                  if (var7 >= param2.length()) {
                                    if (var6 <= 0) {
                                      stackIn_34_0 = 1;
                                      decompiledRegionSelector0 = 6;
                                      break L0;
                                    } else {
                                      stackIn_32_0 = 0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    }
                                  } else {
                                    L5: {
                                      var8 = param2.charAt(var7);
                                      if (mp.a(true, (char) var8)) {
                                        var6++;
                                        break L5;
                                      } else {
                                        var6 = 0;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (2 > var6) {
                                        break L6;
                                      } else {
                                        if (param0) {
                                          break L6;
                                        } else {
                                          stackIn_28_0 = 0;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        }
                                      }
                                    }
                                    var7++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          stackIn_19_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("sl.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L7;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
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

    sl(int param0, int param1, int param2) {
        this.field_l = param2;
        this.field_f = param0;
        this.field_i = param1;
    }

    final void a(aga param0, op param1, int param2) {
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
        wia var4 = null;
        RuntimeException var4_ref = null;
        wia var5 = null;
        wia var6 = null;
        try {
          L0: {
            var5 = param1.field_a[this.field_i][this.field_l];
            var6 = var5;
            var4 = var6;
            if (var4 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var6.b((byte) -113)) {
                L1: {
                  if (param0 != null) {
                    param1.field_T.field_f[param0.field_D] = param1.field_T.field_f[param0.field_D] + var5.field_h;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param2 == 12) {
                  L2: {
                    var6.field_h = var6.field_h - this.field_f;
                    if (0 > var6.field_h) {
                      var4.field_h = 0;
                      param1.b((byte) -56, param1.field_L.field_o[this.field_i][this.field_l].field_n, this.field_i, this.field_l);
                      param1.field_e = param1.field_e - 1;
                      if (param0 == null) {
                        break L2;
                      } else {
                        param1.field_T.field_w[param0.field_D] = param1.field_T.field_w[param0.field_D] + 1;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4_ref);

            stackIn_17_1 = new StringBuilder().append("sl.C(");

            if (param0 == null) {
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


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ')');
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

    public static void d(byte param0) {
        field_k = null;
        int var1 = 13 % ((param0 - 53) / 61);
        field_j = null;
    }

    static {
        field_j = new du(1, 2, 2, 0);
    }
}
