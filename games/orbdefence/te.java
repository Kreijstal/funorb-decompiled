/*
 * Decompiled by CFR-JS 0.4.0.
 */
class te extends s {
    static String field_J;
    static int field_O;
    static boolean field_G;
    private String[] field_K;
    static String field_L;
    private cc field_H;
    static String[] field_N;
    private im field_I;
    static fk field_M;

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 != 53) {
            return;
        }
        this.a(param3, param0, ((rj) ((Object) this.field_j)).b((pj) (this), true), (byte) -90, param2);
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) -127);
    }

    te(String param0, td param1) {
        super(param0, (ag) null);
        this.field_H = null;
        try {
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "te.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param2 == 2) {
              L1: {
                L2: {
                  L3: {
                    if (null == this.field_K) {
                      break L3;
                    } else {
                      if (this.field_K.length <= param0) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    var7 = new String[param0 - -1];
                    var4 = var7;
                    if (null == this.field_K) {
                      break L4;
                    } else {
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= this.field_K.length) {
                          break L4;
                        } else {
                          var7[var5] = this.field_K[var5];
                          var5++;
                          if (var6 != 0) {
                            break L1;
                          } else {
                            if (var6 == 0) {
                              continue L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  this.field_K = var7;
                  break L2;
                }
                this.field_K[param0] = param1;
                break L1;
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
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("te.R(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        rj var3 = null;
        dm var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        ed var12 = null;
        int var13 = 0;
        int var14 = 0;
        cc var15 = null;
        int var16 = 0;
        pj var17 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        byte stackOut_19_0 = 0;
        var16 = OrbDefence.field_D ? 1 : 0;
        this.field_I = new im();
        var2 = 0;
        var3 = (rj) ((Object) this.field_j);
        var4 = var3.a((pj) (this), true);
        L0: while (true) {
          var5 = this.field_l.indexOf("<hotspot=", var2);
          stackOut_1_0 = var5;
          stackOut_1_1 = -1;
          stackIn_2_0 = stackOut_1_0;
          stackIn_2_1 = stackOut_1_1;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 == stackIn_2_1) {
                  break L3;
                } else {
                  var7 = this.field_l.indexOf(">", var5);
                  var6 = this.field_l.substring(9 + var5, var7);
                  var7 = Integer.parseInt(var6);
                  var2 = this.field_l.indexOf("</hotspot>", var5);
                  var8 = var4.a(var5, (byte) 107);
                  var9 = var4.a(var2, (byte) 107);
                  var10 = null;
                  stackOut_3_0 = var8;
                  stackIn_20_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var16 != 0) {
                    break L2;
                  } else {
                    var11 = stackIn_4_0;
                    L4: while (true) {
                      if (var11 > var9) {
                        if (var16 == 0) {
                          continue L0;
                        } else {
                          break L3;
                        }
                      } else {
                        var12 = var4.field_c[var11];
                        stackOut_6_0 = var11;
                        stackOut_6_1 = var8;
                        stackIn_2_0 = stackOut_6_0;
                        stackIn_2_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var16 != 0) {
                          continue L1;
                        } else {
                          L5: {
                            if (stackIn_7_0 != stackIn_7_1) {
                              stackOut_9_0 = var12.field_g[0];
                              stackIn_10_0 = stackOut_9_0;
                              break L5;
                            } else {
                              stackOut_8_0 = var4.a(param0 ^ 12, var5);
                              stackIn_10_0 = stackOut_8_0;
                              break L5;
                            }
                          }
                          L6: {
                            var13 = stackIn_10_0;
                            if (var9 != var11) {
                              if (var12 != null) {
                                stackOut_14_0 = var12.field_g[var12.field_g.length - 1];
                                stackIn_15_0 = stackOut_14_0;
                                break L6;
                              } else {
                                stackOut_13_0 = 0;
                                stackIn_15_0 = stackOut_13_0;
                                break L6;
                              }
                            } else {
                              stackOut_11_0 = var4.a(param0 + 32, var2);
                              stackIn_15_0 = stackOut_11_0;
                              break L6;
                            }
                          }
                          L7: {
                            var14 = stackIn_15_0;
                            var15 = new cc(var7, var13, var12.field_f, -var13 + var14, Math.max(var3.a((byte) -128), -var12.field_f + var12.field_c));
                            if (var10 == null) {
                              break L7;
                            } else {
                              ((cc) (var10)).field_p = var15;
                              break L7;
                            }
                          }
                          this.field_I.a(-92, var15);
                          var10 = var15;
                          var11++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_19_0 = param0;
              stackIn_20_0 = stackOut_19_0;
              break L2;
            }
            if (stackIn_20_0 != -127) {
              var17 = (pj) null;
              discarded$1 = this.a(-25, (pj) null);
              return;
            } else {
              return;
            }
          }
        }
    }

    final static int j(int param0) {
        if (param0 != 2) {
            te.k(-128);
            return h.field_H;
        }
        return h.field_H;
    }

    void a(int param0, int param1, int param2, int param3) {
        cc discarded$1 = null;
        cc var6 = null;
        int var7 = 0;
        int var8 = 0;
        rj var10 = null;
        rj var11 = null;
        super.a(param0, param1, param2 + 0, param3);
        if (param2 == 1048575) {
          if (-1 != (param1 ^ -1)) {
            return;
          } else {
            L0: {
              var11 = (rj) ((Object) this.field_j);
              var6 = this.field_H;
              if (var6 != null) {
                var7 = var11.a((pj) (this), param3, (byte) 54);
                var8 = var11.a((pj) (this), 9534, param0);
                L1: while (true) {
                  wh.a(var6.field_s + 2, false, -2 + var7 - -var6.field_o, var6.field_n + 2, -2 + var8 - -var6.field_g);
                  var6 = var6.field_p;
                  if (var6 != null) {
                    continue L1;
                  } else {
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          discarded$1 = this.a(-110, 35, 78);
          if (-1 != (param1 ^ -1)) {
            return;
          } else {
            L2: {
              var10 = (rj) ((Object) this.field_j);
              var6 = this.field_H;
              if (var6 != null) {
                var7 = var10.a((pj) (this), param3, (byte) 54);
                var8 = var10.a((pj) (this), 9534, param0);
                L3: while (true) {
                  wh.a(var6.field_s + 2, false, -2 + var7 - -var6.field_o, var6.field_n + 2, -2 + var8 - -var6.field_g);
                  var6 = var6.field_p;
                  if (var6 != null) {
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            return;
          }
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              this.field_H = null;
              if (!this.field_t) {
                break L1;
              } else {
                var5_int = ua.field_a + -param2 + -this.field_s;
                var6 = vl.field_d - param3 + -this.field_n;
                this.field_H = this.a(-2, var6, var5_int);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("te.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(int param0, pj param1) {
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
              if (param0 == -81) {
                break L1;
              } else {
                this.b(-120, 119, 43, -76);
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
            stackOut_4_1 = new StringBuilder().append("te.E(").append(param0).append(',');
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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    String g(int param0) {
        if (param0 == -8235) {
          if (this.field_H != null) {
            if (this.field_K != null) {
              if (this.field_K.length <= this.field_H.field_q) {
                return null;
              } else {
                return this.field_K[this.field_H.field_q];
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    private final cc a(int param0, int param1, int param2) {
        cc var4 = null;
        cc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        var4 = (cc) ((Object) this.field_I.b((byte) -22));
        L0: while (true) {
          if (var4 == null) {
            if (param0 == -2) {
              return null;
            } else {
              field_L = (String) null;
              return null;
            }
          } else {
            if (var6 == 0) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (cc) ((Object) this.field_I.d(param0 ^ -853));
                  continue L0;
                } else {
                  var8 = var5.field_o;
                  var7 = param2;
                  if (var6 != 0) {
                    if (var7 == var8) {
                      return null;
                    } else {
                      field_L = (String) null;
                      return null;
                    }
                  } else {
                    L2: {
                      if (var7 < var8) {
                        break L2;
                      } else {
                        if (var5.field_g > param1) {
                          break L2;
                        } else {
                          if (var5.field_s + var5.field_o <= param2) {
                            break L2;
                          } else {
                            if (var5.field_g + var5.field_n >= param1) {
                              return var4;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    var5 = var5.field_p;
                    continue L1;
                  }
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    public static void k(int param0) {
        field_N = null;
        field_J = null;
        field_M = null;
        if (param0 != -3213) {
            te.k(-125);
            field_L = null;
            return;
        }
        field_L = null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        cc var7 = null;
        super.b(param0 ^ 0, param1, param2, param3);
        if (param0 == 84) {
          var5 = -this.field_s + param3;
          var6 = -this.field_n + param1;
          var7 = this.a(param0 ^ -86, var6, var5);
          if (var7 != null) {
            if (null == this.field_h) {
              return;
            } else {
              ((ff) ((Object) this.field_h)).a(param2, var7.field_q, (byte) 101, (te) (this));
              return;
            }
          } else {
            return;
          }
        } else {
          this.a(93, (byte) 51, 88, -37);
          var5 = -this.field_s + param3;
          var6 = -this.field_n + param1;
          var7 = this.a(param0 ^ -86, var6, var5);
          if (var7 == null) {
            return;
          } else {
            L0: {
              if (null != this.field_h) {
                ((ff) ((Object) this.field_h)).a(param2, var7.field_q, (byte) 101, (te) (this));
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    static {
        field_J = "to return to the normal view.";
        field_G = false;
        field_N = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_L = "Please enter your age in years";
        field_M = new fk(0);
    }
}
