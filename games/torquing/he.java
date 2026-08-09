/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    static boolean field_a;
    private String field_c;
    static la field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
            String var2 = (String) null;
            he.a(-37, (String) null);
        }
    }

    final static boolean a(hc param0, double param1, double[] param2, int param3, double param4) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        double[] var13 = null;
        double[] var14 = null;
        double[] var15 = null;
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
              var7 = var13;
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
            stackIn_12_0 = var8;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7_ref);

            stackIn_15_1 = new StringBuilder().append("he.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final boolean b(int param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = this.field_c.equals(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("he.A(").append(param0).append(',');

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
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Torquing.field_u;
        try {
          L0: {
            var5_int = param4 + param0;
            var6 = param1 + param2;
            if (param3 == 2) {
              L1: {
                if (ph.field_k < param0) {
                  stackIn_6_0 = param0;
                  break L1;
                } else {
                  stackIn_6_0 = ph.field_k;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_6_0;
                if (param2 > ph.field_c) {
                  stackIn_9_0 = param2;
                  break L2;
                } else {
                  stackIn_9_0 = ph.field_c;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_9_0;
                if (ph.field_a <= var5_int) {
                  stackIn_12_0 = ph.field_a;
                  break L3;
                } else {
                  stackIn_12_0 = var5_int;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_12_0;
                if (ph.field_h > var6) {
                  stackIn_15_0 = var6;
                  break L4;
                } else {
                  stackIn_15_0 = ph.field_h;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    stackIn_8_0 = qi.field_d;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              kh.field_o = mg.field_b;
              qi.field_d = null;
              on.field_b = param1;
              stackIn_10_0 = null;
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
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("he.D(").append(param0).append(',');

            if (param1 == null) {
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
