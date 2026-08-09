/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends se {
    static int field_i;
    static int field_p;
    static String field_n;
    static dl[] field_o;
    static ko field_m;
    static int field_q;
    static String field_l;
    static String field_k;
    private ga field_j;
    private ga field_r;

    public static void d(int param0) {
        field_n = null;
        if (param0 != -31737) {
          field_l = (String) null;
          field_l = null;
          field_o = null;
          field_m = null;
          field_k = null;
          return;
        } else {
          field_l = null;
          field_o = null;
          field_m = null;
          field_k = null;
          return;
        }
    }

    private final boolean a(String param0, boolean param1) {
        boolean discarded$1 = false;
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_r.field_o.toLowerCase();
              if (!param1) {
                break L1;
              } else {
                var8 = (String) null;
                discarded$1 = this.a((String) null, true);
                break L1;
              }
            }
            L2: {
              var4 = param0.toLowerCase();
              if (var3.length() <= 0) {
                break L2;
              } else {
                if (-1 <= (var4.length() ^ -1)) {
                  break L2;
                } else {
                  var5 = var3.lastIndexOf("@");
                  if ((var5 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (var5 < var3.length() + -1) {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(1 + var5);
                      if (-1 < (var4.indexOf(var6) ^ -1)) {
                        if ((var4.indexOf(var7) ^ -1) > -1) {
                          break L2;
                        } else {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_14_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("jn.F(");

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
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    private final static boolean a(byte param0, String param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (lo.a(param2, 59)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!qc.a(param2, -122)) {
                if (bf.a(param2, false)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param1.length() != 0) {
                    var3_int = 94 / ((param0 - -31) / 58);
                    if (wp.a(param2, -1, param1)) {
                      stackIn_17_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!dq.a(param2, -83, param1)) {
                        if (!tf.a(112, param2, param1)) {
                          stackIn_25_0 = 1;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          stackIn_23_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("jn.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L1;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L2;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0 != 0;
                    } else {
                      return stackIn_25_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    jn(ga param0, ga param1, ga param2) {
        super(param0);
        try {
            this.field_r = param2;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = this.field_j.field_o.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (!bf.a(var5, false)) {
                if (!lo.a(var5, 52)) {
                  var6 = -39 % ((41 - param1) / 49);
                  if (!qc.a(var5, -121)) {
                    if (!this.a(param0, false)) {
                      if (0 >= var7.length()) {
                        stackIn_29_0 = sl.field_u;
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        if (wp.a(var5, -1, var7)) {
                          stackIn_19_0 = tp.field_d;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (dq.a(var5, -65, var7)) {
                            stackIn_23_0 = rg.field_c;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (tf.a(81, var5, var7)) {
                              stackIn_27_0 = tp.field_d;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              return dq.field_G;
                            }
                          }
                        }
                      }
                    } else {
                      stackIn_14_0 = kd.field_k;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_11_0 = fk.field_q;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = pb.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = dq.field_G;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("jn.H(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L1;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_14_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0;
                      } else {
                        return stackIn_29_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final oi a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        oi stackIn_4_0 = null;
        oi stackIn_8_0 = null;
        oi stackIn_11_0 = null;
        oi stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_j.field_o.toLowerCase();
              var4 = param0.toLowerCase();
              if (param1 == -122) {
                break L1;
              } else {
                var5 = (String) null;
                this.a((String) null, (byte) 73);
                break L1;
              }
            }
            if (0 != var4.length()) {
              if (!jn.a((byte) 112, var3, var4)) {
                stackIn_8_0 = rk.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!this.a(param0, false)) {
                  stackIn_13_0 = ih.field_b;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = rk.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_4_0 = rk.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("jn.G(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    static {
        field_n = "Bonus Levels complete";
        field_l = "Right First Time";
        field_k = "Loading fonts";
    }
}
