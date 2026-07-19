/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    static boolean field_a;
    private String field_c;
    static la field_b;

    public static void a(int param0) {
        dn discarded$0 = null;
        field_b = null;
        if (param0 != -1) {
            String var2 = (String) null;
            discarded$0 = he.a(-37, (String) null);
        }
    }

    final static boolean a(hc param0, double param1, double[] param2, int param3, double param4) {
        RuntimeException var7 = null;
        double[] var7_array = null;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        double[] var13 = null;
        double[] var14 = null;
        double[] var15 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var12 = Torquing.field_u;
        try {
          L0: {
            L1: {
              kp.a(0.0, param3 + -16777300, param4, param2, param0);
              ee.a(false, new double[3], param2, param4, param1, 106);
              if (param3 == 16777215) {
                break L1;
              } else {
                field_b = (la) null;
                break L1;
              }
            }
            L2: {
              var15 = ll.a(mg.field_a, vf.field_e, (byte) 121);
              var14 = var15;
              var13 = var14;
              var7_array = var13;
              var8 = 0;
              if (var13 != null) {
                var9 = 0;
                L3: while (true) {
                  if (var9 >= ia.field_i) {
                    break L2;
                  } else {
                    L4: {
                      var10 = var15[var9];
                      if (var10 > 1e-7) {
                        var10 = var10 * param1;
                        param2[0] = param2[0] + var10 * bn.field_f[var9][6];
                        param2[1] = param2[1] + var10 * bn.field_f[var9][7];
                        param2[2] = param2[2] + var10 * bn.field_f[var9][8];
                        var8 = 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var9++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            stackOut_11_0 = var8;
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var7);
            stackOut_13_1 = new StringBuilder().append("he.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final boolean b(int param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_c = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = this.field_c.equals(param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("he.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    he(String param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = Torquing.field_u;
        try {
          L0: {
            var5_int = param4 + param0;
            var6 = param1 + param2;
            if (param3 == 2) {
              L1: {
                if (ph.field_k < param0) {
                  stackOut_5_0 = param0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = ph.field_k;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_6_0;
                if (param2 > ph.field_c) {
                  stackOut_8_0 = param2;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = ph.field_c;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_9_0;
                if (ph.field_a <= var5_int) {
                  stackOut_11_0 = ph.field_a;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = var5_int;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_12_0;
                if (ph.field_h > var6) {
                  stackOut_14_0 = var6;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = ph.field_h;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              L5: {
                var10 = stackIn_15_0;
                if (param0 < ph.field_k) {
                  break L5;
                } else {
                  if (ph.field_a > param0) {
                    var11 = param0 + ph.field_j * var8;
                    var12 = 1 - (-var10 - -var8) >> -1941999167;
                    L6: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L5;
                      } else {
                        ph.field_e[var11] = 16777215;
                        var11 = var11 + 2 * ph.field_j;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (param2 < ph.field_c) {
                  break L7;
                } else {
                  if (ph.field_h <= var6) {
                    break L7;
                  } else {
                    var11 = var7 + param2 * ph.field_j;
                    var12 = var9 + (1 - var7) >> -1531961631;
                    L8: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L7;
                      } else {
                        ph.field_e[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  }
                }
              }
              L9: {
                if (var5_int < ph.field_k) {
                  break L9;
                } else {
                  if (ph.field_a <= var5_int) {
                    break L9;
                  } else {
                    var11 = ((1 & var5_int + -param0) + var8) * ph.field_j + var5_int;
                    var12 = var10 + (1 + -var8) >> 2095502369;
                    L10: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L9;
                      } else {
                        ph.field_e[var11] = 16777215;
                        var11 = var11 + ph.field_j * 2;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (ph.field_c > param2) {
                  break L11;
                } else {
                  if (var6 < ph.field_h) {
                    var11 = ph.field_j * var6 - -var7 - -(var6 + -param2 & 1);
                    var12 = 1 + var9 - var7 >> -1345641023;
                    L12: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L11;
                      } else {
                        ph.field_e[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  } else {
                    break L11;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var5), "he.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static dn a(int param0, String param1) {
        RuntimeException var2 = null;
        dn stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dn stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                he.a(-116);
                break L1;
              }
            }
            if (kh.field_o != mg.field_b) {
              L2: {
                if (ag.field_c != kh.field_o) {
                  break L2;
                } else {
                  if (!param1.equals(on.field_b)) {
                    break L2;
                  } else {
                    kh.field_o = tp.field_h;
                    stackOut_7_0 = qi.field_d;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              kh.field_o = mg.field_b;
              qi.field_d = null;
              on.field_b = param1;
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("he.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return (dn) ((Object) stackIn_10_0);
        }
    }

    final void a(java.applet.Applet param0, boolean param1) {
        try {
            if (param1) {
                he.a(90);
            }
            ni.a((byte) 102, param0, this.field_c, 31536000L, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "he.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = false;
    }
}
