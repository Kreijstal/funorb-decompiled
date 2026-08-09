/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends java.awt.Canvas implements java.awt.event.FocusListener {
    static mi field_g;
    java.awt.Frame field_d;
    volatile boolean field_b;
    static String field_f;
    static String field_e;
    static int[] field_c;
    static pe[] field_h;
    static wk[] field_a;

    final static void a(int param0, boolean param1, int param2, int param3) {
        ib.a(param2, db.field_b, param1, param3, 127, da.field_g, te.field_b);
        if (param0 != -1604006872) {
            field_g = (mi) null;
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(pn param0, int param1) {
        try {
            ok.a(-1, param0, this.field_d);
            int var3_int = 121 / ((param1 - -15) / 60);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "nn.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(String[] args, int param1, String param2, byte param3) {
        int var5 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              cb.field_j = sn.field_p;
              if ((param1 ^ -1) == -256) {
                L2: {
                  if (13 <= wi.field_y) {
                    stackIn_9_0 = 0;
                    break L2;
                  } else {
                    stackIn_9_0 = 1;
                    break L2;
                  }
                }
                qf.field_d = fn.a(stackIn_9_0 != 0, (byte) 69);
                break L1;
              } else {
                L3: {
                  if (param1 < 100) {
                    break L3;
                  } else {
                    if (-106 > (param1 ^ -1)) {
                      break L3;
                    } else {
                      qf.field_d = fc.a((byte) -76, args);
                      break L1;
                    }
                  }
                }
                qf.field_d = fi.a(18, param2, param1);
                break L1;
              }
            }
            L4: {
              if (param3 < -101) {
                break L4;
              } else {
                field_e = (String) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("nn.C(");

            if (args == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0) {
        int var1 = an.field_h * an.field_h;
        if (param0) {
            return;
        }
        int var2 = var1 - wa.field_p * wa.field_p;
        int var3 = var2 * (jn.field_c + -va.field_b) / var1 + va.field_b;
        qc.field_V.a(0, var3, 120, me.field_e, 640);
        nm.a(da.field_g, 0, va.field_e, 5, jn.field_c - 24, 640, 110);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    nn() {
    }

    public static void b(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 != 30) {
            return;
        }
        field_h = null;
        field_a = null;
        field_g = null;
        field_f = null;
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_b = true;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "nn.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 42) {
            return false;
        }
        return de.field_d;
    }

    final static int a(int[] param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var6 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (param1 > 36) {
              var2_int = 0;
              var3 = param0.length;
              if (var3 < 8) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = 0;
                L1: while (true) {
                  if (var3 + -8 <= var4) {
                    var6 = var3 - 8;
                    var4 = var6;
                    L2: while (true) {
                      if (var6 >= var3) {
                        stackIn_26_0 = var2_int;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L3: {
                          if ((param0[var6] ^ -1) > -1) {
                            break L3;
                          } else {
                            if (param0[var6] >= dn.field_Sb.length) {
                              break L3;
                            } else {
                              var2_int = var2_int + dn.field_Sb[param0[var6]];
                              break L3;
                            }
                          }
                        }
                        if (-35 != (param0[var6] ^ -1)) {
                          var6++;
                          continue L2;
                        } else {
                          stackIn_23_0 = 6100;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (param0[var4] >= 0) {
                      L4: {
                        if (param0[var4] < tc.field_B.length) {
                          var2_int = var2_int + tc.field_B[param0[var4]];
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = -22;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2);

            stackIn_29_1 = new StringBuilder().append("nn.G(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L5;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0;
            } else {
              return stackIn_26_0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wk param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var6_int = (-param2 + param1 << 1707727656) / param4.field_z;
              param3 = param3 + param4.field_H;
              var7 = (param2 << 2097599976) + param4.field_D * var6_int;
              param0 = param0 + param4.field_D;
              var8 = param3 * pb.field_c + param0;
              var9 = 0;
              var10 = param4.field_F;
              if (param5 == -1) {
                break L1;
              } else {
                nn.a(-123, false, 41, 13);
                break L1;
              }
            }
            L2: {
              var11 = param4.field_A;
              var12 = -var11 + pb.field_c;
              var13 = 0;
              if (pb.field_l > param3) {
                var14 = pb.field_l - param3;
                var10 = var10 - var14;
                var9 = var9 + var11 * var14;
                param3 = pb.field_l;
                var8 = var8 + pb.field_c * var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 >= pb.field_i) {
                break L3;
              } else {
                var14 = pb.field_i + -param0;
                var7 = var7 + var14 * var6_int;
                var12 = var12 + var14;
                var13 = var13 + var14;
                var8 = var8 + var14;
                var11 = var11 - var14;
                var9 = var9 + var14;
                param0 = pb.field_i;
                break L3;
              }
            }
            L4: {
              if (pb.field_d >= var10 + param3) {
                break L4;
              } else {
                var10 = var10 - (var10 + (param3 - pb.field_d));
                break L4;
              }
            }
            L5: {
              if (param0 - -var11 <= pb.field_b) {
                break L5;
              } else {
                var14 = param0 + var11 - pb.field_b;
                var12 = var12 + var14;
                var11 = var11 - var14;
                var13 = var13 + var14;
                break L5;
              }
            }
            L6: {
              if (0 >= var11) {
                break L6;
              } else {
                if (-1 <= (var10 ^ -1)) {
                  break L6;
                } else {
                  param3 = -var10;
                  L7: while (true) {
                    if (-1 >= (param3 ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = var7;
                      param0 = -var11;
                      L8: while (true) {
                        if (0 <= param0) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param3++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> -713378872;
                            var14 = var14 + var6_int;
                            var16 = 256 + -var15;
                            if ((var15 ^ -1) > -1) {
                              var8++;
                              var9++;
                              break L9;
                            } else {
                              L10: {
                                incrementValue$0 = var9;
                                var9++;
                                var17 = param4.field_E[incrementValue$0];
                                if (-1 != (var17 ^ -1)) {
                                  if (255 < var15) {
                                    pb.field_g[var8] = var17;
                                    break L10;
                                  } else {
                                    var18 = pb.field_g[var8];
                                    var19 = var16 * (var18 & 16711935) - -(var15 * (16711935 & var17)) >> -1604006872 & 16711935;
                                    pb.field_g[var8] = ec.a(ec.a(65280, var17) * var15 + ec.a(var18, 65280) * var16 >> 1834406760, 65280) + var19;
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var8++;
                              break L9;
                            }
                          }
                          param0++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var6);

            stackIn_34_1 = new StringBuilder().append("nn.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_e = "Playing";
        field_c = new int[]{109, 23, 18, 16, -1, -1, -1, -1, -1, -1, -1};
    }
}
