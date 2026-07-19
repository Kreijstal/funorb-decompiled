/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ja extends bb {
    static int field_P;
    private String[] field_K;
    private vc field_N;
    static String field_L;
    static String field_O;
    private mi field_M;

    final void i(int param0) {
        int var2 = 0;
        eg var3 = null;
        ne var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        qa var17 = null;
        Object var18 = null;
        eg var18_ref = null;
        String var22 = null;
        ne var23 = null;
        pi var24 = null;
        mi var25 = null;
        Object var26 = null;
        String var27 = null;
        ne var28 = null;
        pi var29 = null;
        mi var30 = null;
        eg var31 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var18 = null;
        var26 = null;
        var16 = fleas.field_A ? 1 : 0;
        this.field_N = new vc();
        var2 = 0;
        if (param0 == 424) {
          var31 = (eg) ((Object) this.field_p);
          var28 = var31.a((qa) (this), (byte) -35);
          L0: while (true) {
            var5 = this.field_i.indexOf("<hotspot=", var2);
            stackOut_26_0 = -1;
            stackOut_26_1 = var5;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            L1: while (true) {
              if (stackIn_27_0 != stackIn_27_1) {
                var7 = this.field_i.indexOf(">", var5);
                var27 = this.field_i.substring(var5 - -9, var7);
                var7 = Integer.parseInt(var27);
                var2 = this.field_i.indexOf("</hotspot>", var5);
                var8 = var28.b(var5, -1);
                var9 = var28.b(var2, -1);
                var10 = null;
                if (var16 == 0) {
                  var11 = var8;
                  L2: while (true) {
                    if (var9 < var11) {
                      if (var16 == 0) {
                        continue L0;
                      } else {
                        return;
                      }
                    } else {
                      var29 = var28.field_c[var11];
                      stackOut_33_0 = var8 ^ -1;
                      stackOut_33_1 = var11 ^ -1;
                      stackIn_27_0 = stackOut_33_0;
                      stackIn_27_1 = stackOut_33_1;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      if (var16 != 0) {
                        continue L1;
                      } else {
                        L3: {
                          if (stackIn_34_0 == stackIn_34_1) {
                            stackOut_36_0 = var28.c(-1, var5);
                            stackIn_37_0 = stackOut_36_0;
                            break L3;
                          } else {
                            stackOut_35_0 = var29.field_d[0];
                            stackIn_37_0 = stackOut_35_0;
                            break L3;
                          }
                        }
                        L4: {
                          var13 = stackIn_37_0;
                          if (var11 == var9) {
                            stackOut_41_0 = var28.c(-1, var2);
                            stackIn_42_0 = stackOut_41_0;
                            break L4;
                          } else {
                            if (var29 == null) {
                              stackOut_40_0 = 0;
                              stackIn_42_0 = stackOut_40_0;
                              break L4;
                            } else {
                              stackOut_39_0 = var29.field_d[var29.field_d.length - 1];
                              stackIn_42_0 = stackOut_39_0;
                              break L4;
                            }
                          }
                        }
                        L5: {
                          var14 = stackIn_42_0;
                          var30 = new mi(var7, var13, var29.field_a, -var13 + var14, Math.max(var31.a((byte) 127), -var29.field_a + var29.field_c));
                          if (var10 != null) {
                            ((mi) (var10)).field_q = var30;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var10 = var30;
                        this.field_N.a(false, var30);
                        var11++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          var17 = (qa) null;
          this.a(-109, 29, (qa) null, (byte) 12);
          var18_ref = (eg) ((Object) this.field_p);
          var3 = var18_ref;
          var23 = var18_ref.a((qa) (this), (byte) -35);
          var4 = var23;
          L6: while (true) {
            var5 = this.field_i.indexOf("<hotspot=", var2);
            stackOut_2_0 = -1;
            stackOut_2_1 = var5;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            L7: while (true) {
              if (stackIn_3_0 != stackIn_3_1) {
                var7 = this.field_i.indexOf(">", var5);
                var22 = this.field_i.substring(var5 - -9, var7);
                var7 = Integer.parseInt(var22);
                var2 = this.field_i.indexOf("</hotspot>", var5);
                var8 = var23.b(var5, -1);
                var9 = var23.b(var2, -1);
                var10 = null;
                if (var16 == 0) {
                  var11 = var8;
                  L8: while (true) {
                    if (var9 < var11) {
                      if (var16 == 0) {
                        continue L6;
                      } else {
                        return;
                      }
                    } else {
                      var24 = var23.field_c[var11];
                      stackOut_10_0 = var8 ^ -1;
                      stackOut_10_1 = var11 ^ -1;
                      stackIn_3_0 = stackOut_10_0;
                      stackIn_3_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (var16 != 0) {
                        continue L7;
                      } else {
                        L9: {
                          if (stackIn_11_0 == stackIn_11_1) {
                            stackOut_13_0 = var23.c(-1, var5);
                            stackIn_14_0 = stackOut_13_0;
                            break L9;
                          } else {
                            stackOut_12_0 = var24.field_d[0];
                            stackIn_14_0 = stackOut_12_0;
                            break L9;
                          }
                        }
                        L10: {
                          var13 = stackIn_14_0;
                          if (var11 == var9) {
                            stackOut_18_0 = var23.c(-1, var2);
                            stackIn_19_0 = stackOut_18_0;
                            break L10;
                          } else {
                            if (var24 == null) {
                              stackOut_17_0 = 0;
                              stackIn_19_0 = stackOut_17_0;
                              break L10;
                            } else {
                              stackOut_16_0 = var24.field_d[var24.field_d.length - 1];
                              stackIn_19_0 = stackOut_16_0;
                              break L10;
                            }
                          }
                        }
                        L11: {
                          var14 = stackIn_19_0;
                          var25 = new mi(var7, var13, var24.field_a, -var13 + var14, Math.max(var18_ref.a((byte) 127), -var24.field_a + var24.field_c));
                          if (var10 != null) {
                            ((mi) (var10)).field_q = var25;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var10 = var25;
                        this.field_N.a(false, var25);
                        var11++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.b(55, 20, false, -78);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (this.field_K == null) {
                    break L4;
                  } else {
                    if (param2 < this.field_K.length) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var7 = new String[param2 - -1];
                  var4 = var7;
                  if (null == this.field_K) {
                    break L5;
                  } else {
                    var5 = 0;
                    L6: while (true) {
                      if (var5 >= this.field_K.length) {
                        break L5;
                      } else {
                        var7[var5] = this.field_K[var5];
                        var5++;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (var6 == 0) {
                            continue L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_K = var7;
                break L3;
              }
              this.field_K[param2] = param1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("ja.FA(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    ja(String param0, ch param1) {
        super(param0, (kd) null);
        this.field_M = null;
        try {
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final mi b(int param0, int param1, int param2) {
        mi var4 = null;
        mi var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var4 = (mi) ((Object) this.field_N.c((byte) 47));
        if (param2 == -1) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (param0 < var5.field_i) {
                            break L4;
                          } else {
                            if (param1 < var5.field_j) {
                              break L4;
                            } else {
                              if (param0 >= var5.field_i - -var5.field_n) {
                                break L4;
                              } else {
                                if (var5.field_j + var5.field_l >= param1) {
                                  return var4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        var5 = var5.field_q;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var4 = (mi) ((Object) this.field_N.b((byte) -105));
                  break L2;
                }
                if (var6 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return (mi) null;
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -108);
              this.field_M = null;
              if (param3 <= -85) {
                break L1;
              } else {
                this.field_M = (mi) null;
                break L1;
              }
            }
            L2: {
              if (!this.field_x) {
                break L2;
              } else {
                var5_int = ag.field_f - (param1 - -this.field_y);
                var6 = -param0 + kc.field_b + -this.field_z;
                this.field_M = this.b(var5_int, var6, -1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("ja.I(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
    }

    String g(int param0) {
        mi discarded$3 = null;
        if (null != this.field_M) {
          if (null != this.field_K) {
            if (param0 == 4) {
              if (this.field_M.field_m >= this.field_K.length) {
                return null;
              } else {
                return this.field_K[this.field_M.field_m];
              }
            } else {
              discarded$3 = this.b(-37, 104, -16);
              if (this.field_M.field_m >= this.field_K.length) {
                return null;
              } else {
                return this.field_K[this.field_M.field_m];
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.a(param1, param0, param2, ((eg) ((Object) this.field_p)).b(-69, (qa) (this)), 80);
        if (param3 == -9) {
          return;
        } else {
          this.field_K = (String[]) null;
          return;
        }
    }

    public static void j(int param0) {
        field_O = null;
        if (param0 > -75) {
            return;
        }
        field_L = null;
    }

    boolean a(qa param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param1 <= -26) {
                break L1;
              } else {
                this.a(78, 122, -59, -72);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ja.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.i(424);
    }

    void b(int param0, int param1, boolean param2, int param3) {
        eg var5 = null;
        mi var6 = null;
        int var7 = 0;
        int var8 = 0;
        super.b(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          var5 = (eg) ((Object) this.field_p);
          var6 = this.field_M;
          if (var6 == null) {
            return;
          } else {
            var7 = var5.a(false, param1, (qa) (this));
            var8 = var5.a(param0, (qa) (this), (byte) 84);
            L0: while (true) {
              ek.a(var6.field_l + 2, -2 + (var7 - -var6.field_i), var8 + var6.field_j - 2, 1, var6.field_n + 2);
              var6 = var6.field_q;
              if (var6 != null) {
                continue L0;
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        mi var7 = null;
        super.a(param0, param1, param2, param3);
        var5 = param2 - this.field_y;
        var6 = -this.field_z + param0;
        var7 = this.b(var5, var6, -1);
        if (var7 == null) {
          return;
        } else {
          L0: {
            if (null != this.field_s) {
              ((dc) ((Object) this.field_s)).a(var7.field_m, (ja) (this), param3, param1 ^ 22);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    static {
        field_P = 0;
        field_O = "Close";
        field_L = "Please wait...";
    }
}
