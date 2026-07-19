/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qi extends ek {
    private pk field_P;
    static String field_L;
    private String[] field_K;
    private vj field_O;
    static vj field_Q;
    static vj field_S;
    static String field_N;
    static String field_T;
    static ck field_R;
    static boolean field_M;

    String c(byte param0) {
        if (null != this.field_P) {
          if (null != this.field_K) {
            if (this.field_K.length > this.field_P.field_p) {
              if (param0 != 113) {
                return (String) null;
              } else {
                return this.field_K[this.field_P.field_p];
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        int var5 = -125 % ((-61 - param0) / 43);
        this.b(((nl) ((Object) this.field_p)).a((ce) (this), -125), param3, param1, param2, -16555);
    }

    final static void a(boolean param0, byte param1) {
        int[] stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        int[] stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int[] stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        int[] stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        int[] stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        int[] stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        int stackOut_2_2 = 0;
        if (!lk.field_F) {
          if (mg.field_Zb) {
            cl.field_B = qj.a(-21, param0);
            return;
          } else {
            if (fm.field_e) {
              am.field_a = ib.a((byte) -108, param0);
              return;
            } else {
              if (he.field_db) {
                jm.a(0, param0);
                he.field_db = false;
                return;
              } else {
                if (ob.field_k) {
                  tj.a(param0, 111);
                  gi.field_b = true;
                  ob.field_k = false;
                  return;
                } else {
                  kf.field_G.c(-1, param0);
                  if (param1 < -99) {
                    return;
                  } else {
                    qi.h(-32);
                    return;
                  }
                }
              }
            }
          }
        } else {
          L0: {
            stackOut_1_0 = j.field_d;
            stackOut_1_1 = param0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (gk.field_Ib) {
              stackOut_3_0 = (int[]) ((Object) stackIn_3_0);
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 2;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L0;
            } else {
              stackOut_2_0 = (int[]) ((Object) stackIn_2_0);
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L0;
            }
          }
          h.field_d = uh.a(stackIn_4_0, stackIn_4_1, stackIn_4_2, -104);
          return;
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, 48, param2, param3);
              this.field_P = null;
              if (this.field_q) {
                var5_int = -this.field_u + (bh.field_g + -param3);
                var6 = pm.field_f - (param2 - -this.field_D);
                this.field_P = this.a(1, var6, var5_int);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 >= 38) {
                break L2;
              } else {
                this.field_K = (String[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("qi.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == 1) {
              L1: {
                L2: {
                  L3: {
                    if (null == this.field_K) {
                      break L3;
                    } else {
                      if (param1 >= this.field_K.length) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    var7 = new String[param1 + 1];
                    var4 = var7;
                    if (null != this.field_K) {
                      var5 = 0;
                      L5: while (true) {
                        if (this.field_K.length <= var5) {
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
                    } else {
                      break L4;
                    }
                  }
                  this.field_K = var7;
                  break L2;
                }
                this.field_K[param1] = param0;
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
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("qi.J(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        pk var6 = null;
        int var7 = 0;
        int var8 = 0;
        nl var10 = null;
        nl var11 = null;
        super.a(param0, -128, param2, param3);
        if (param1 < -103) {
          if (param2 != 0) {
            return;
          } else {
            L0: {
              var11 = (nl) ((Object) this.field_p);
              var6 = this.field_P;
              if (var6 != null) {
                var7 = var11.a((byte) 24, (ce) (this), param0);
                var8 = var11.a(param3, 0, (ce) (this));
                L1: while (true) {
                  kd.a(2 + var6.field_n, var6.field_t + (var7 - 2), (byte) -128, -2 + (var6.field_u + var8), var6.field_s - -2);
                  var6 = var6.field_o;
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
          this.a(112);
          if (param2 != 0) {
            return;
          } else {
            L2: {
              var10 = (nl) ((Object) this.field_p);
              var6 = this.field_P;
              if (var6 != null) {
                var7 = var10.a((byte) 24, (ce) (this), param0);
                var8 = var10.a(param3, 0, (ce) (this));
                L3: while (true) {
                  kd.a(2 + var6.field_n, var6.field_t + (var7 - 2), (byte) -128, -2 + (var6.field_u + var8), var6.field_s - -2);
                  var6 = var6.field_o;
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

    final static w e(byte param0) {
        int var1 = 48 / ((64 - param0) / 52);
        return qa.d(5);
    }

    final static void a(float param0, int param1, String param2) {
        try {
            cg.field_d = param0;
            he.field_hb = param2;
            int var3_int = 79 / ((-18 - param1) / 58);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qi.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final pk a(int param0, int param1, int param2) {
        pk var4 = null;
        pk var5 = null;
        int var6 = 0;
        ce var7 = null;
        var6 = client.field_A ? 1 : 0;
        var4 = (pk) ((Object) this.field_O.c((byte) 49));
        if (param0 != 1) {
          var7 = (ce) null;
          this.a((ce) null, 8, -16, -10);
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
                          if (param2 < var5.field_t) {
                            break L4;
                          } else {
                            if (var5.field_u > param1) {
                              break L4;
                            } else {
                              if (param2 >= var5.field_n + var5.field_t) {
                                break L4;
                              } else {
                                if (var5.field_u - -var5.field_s >= param1) {
                                  return var4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        var5 = var5.field_o;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var4 = (pk) ((Object) this.field_O.d(true));
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
          L5: while (true) {
            if (var4 != null) {
              var5 = var4;
              L6: while (true) {
                L7: {
                  L8: {
                    if (var5 == null) {
                      break L8;
                    } else {
                      if (var6 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (param2 < var5.field_t) {
                            break L9;
                          } else {
                            if (var5.field_u > param1) {
                              break L9;
                            } else {
                              if (param2 >= var5.field_n + var5.field_t) {
                                break L9;
                              } else {
                                if (var5.field_u - -var5.field_s >= param1) {
                                  return var4;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        var5 = var5.field_o;
                        if (var6 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  var4 = (pk) ((Object) this.field_O.d(true));
                  break L7;
                }
                if (var6 == 0) {
                  continue L5;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    public static void f(byte param0) {
        field_R = null;
        field_S = null;
        field_L = null;
        int var1 = -63 % ((-30 - param0) / 38);
        field_T = null;
        field_N = null;
        field_Q = null;
    }

    boolean a(boolean param0, ce param1) {
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
            if (!param0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_N = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("qi.EC(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void h(int param0) {
        hm.a(param0, (byte) -104);
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        pk var7 = null;
        super.b(param0, param1, param2, param3);
        var5 = -this.field_u + param0;
        var6 = param1 + -this.field_D;
        var7 = this.a(1, var6, var5);
        if (var7 == null) {
          return;
        } else {
          L0: {
            if (null != this.field_v) {
              ((rl) ((Object) this.field_v)).a((qi) (this), param2, -118, var7.field_p);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(2874);
    }

    final void a(int param0) {
        int var2 = 0;
        nl var3 = null;
        cf var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        Object var17 = null;
        nl var17_ref = null;
        String var21 = null;
        cf var22 = null;
        nf var23 = null;
        pk var24 = null;
        Object var25 = null;
        String var26 = null;
        cf var27 = null;
        nf var28 = null;
        pk var29 = null;
        nl var30 = null;
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
        int stackOut_38_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        var17 = null;
        var25 = null;
        var16 = client.field_A ? 1 : 0;
        this.field_O = new vj();
        var2 = 0;
        if (param0 == 2874) {
          var30 = (nl) ((Object) this.field_p);
          var27 = var30.a((ce) (this), (byte) 117);
          L0: while (true) {
            var5 = this.field_E.indexOf("<hotspot=", var2);
            stackOut_26_0 = 0;
            stackOut_26_1 = var5 ^ -1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            L1: while (true) {
              if (stackIn_27_0 != stackIn_27_1) {
                var7 = this.field_E.indexOf(">", var5);
                var26 = this.field_E.substring(9 + var5, var7);
                var7 = Integer.parseInt(var26);
                var2 = this.field_E.indexOf("</hotspot>", var5);
                var8 = var27.a(false, var5);
                var9 = var27.a(false, var2);
                var10 = null;
                if (var16 == 0) {
                  var11 = var8;
                  L2: while (true) {
                    if (var11 > var9) {
                      continue L0;
                    } else {
                      var28 = var27.field_a[var11];
                      stackOut_33_0 = var11;
                      stackOut_33_1 = var8;
                      stackIn_27_0 = stackOut_33_0;
                      stackIn_27_1 = stackOut_33_1;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      if (var16 != 0) {
                        continue L1;
                      } else {
                        L3: {
                          if (stackIn_34_0 != stackIn_34_1) {
                            stackOut_36_0 = var28.field_a[0];
                            stackIn_37_0 = stackOut_36_0;
                            break L3;
                          } else {
                            stackOut_35_0 = var27.a((byte) -94, var5);
                            stackIn_37_0 = stackOut_35_0;
                            break L3;
                          }
                        }
                        L4: {
                          var13 = stackIn_37_0;
                          if (var9 != var11) {
                            if (var28 != null) {
                              stackOut_41_0 = var28.field_a[var28.field_a.length + -1];
                              stackIn_42_0 = stackOut_41_0;
                              break L4;
                            } else {
                              stackOut_40_0 = 0;
                              stackIn_42_0 = stackOut_40_0;
                              break L4;
                            }
                          } else {
                            stackOut_38_0 = var27.a((byte) -94, var2);
                            stackIn_42_0 = stackOut_38_0;
                            break L4;
                          }
                        }
                        L5: {
                          var14 = stackIn_42_0;
                          var29 = new pk(var7, var13, var28.field_c, var14 - var13, Math.max(var30.a((byte) -120), -var28.field_c + var28.field_i));
                          if (var10 != null) {
                            ((pk) (var10)).field_o = var29;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_O.a(var29, 2777);
                        var10 = var29;
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
          field_S = (vj) null;
          var17_ref = (nl) ((Object) this.field_p);
          var3 = var17_ref;
          var22 = var17_ref.a((ce) (this), (byte) 117);
          var4 = var22;
          L6: while (true) {
            var5 = this.field_E.indexOf("<hotspot=", var2);
            stackOut_2_0 = 0;
            stackOut_2_1 = var5 ^ -1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            L7: while (true) {
              if (stackIn_3_0 != stackIn_3_1) {
                var7 = this.field_E.indexOf(">", var5);
                var21 = this.field_E.substring(9 + var5, var7);
                var7 = Integer.parseInt(var21);
                var2 = this.field_E.indexOf("</hotspot>", var5);
                var8 = var22.a(false, var5);
                var9 = var22.a(false, var2);
                var10 = null;
                if (var16 == 0) {
                  var11 = var8;
                  L8: while (true) {
                    if (var11 > var9) {
                      continue L6;
                    } else {
                      var23 = var22.field_a[var11];
                      stackOut_10_0 = var11;
                      stackOut_10_1 = var8;
                      stackIn_3_0 = stackOut_10_0;
                      stackIn_3_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (var16 != 0) {
                        continue L7;
                      } else {
                        L9: {
                          if (stackIn_11_0 != stackIn_11_1) {
                            stackOut_13_0 = var23.field_a[0];
                            stackIn_14_0 = stackOut_13_0;
                            break L9;
                          } else {
                            stackOut_12_0 = var22.a((byte) -94, var5);
                            stackIn_14_0 = stackOut_12_0;
                            break L9;
                          }
                        }
                        L10: {
                          var13 = stackIn_14_0;
                          if (var9 != var11) {
                            if (var23 != null) {
                              stackOut_18_0 = var23.field_a[var23.field_a.length + -1];
                              stackIn_19_0 = stackOut_18_0;
                              break L10;
                            } else {
                              stackOut_17_0 = 0;
                              stackIn_19_0 = stackOut_17_0;
                              break L10;
                            }
                          } else {
                            stackOut_15_0 = var22.a((byte) -94, var2);
                            stackIn_19_0 = stackOut_15_0;
                            break L10;
                          }
                        }
                        L11: {
                          var14 = stackIn_19_0;
                          var24 = new pk(var7, var13, var23.field_c, var14 - var13, Math.max(var17_ref.a((byte) -120), -var23.field_c + var23.field_i));
                          if (var10 != null) {
                            ((pk) (var10)).field_o = var24;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        this.field_O.a(var24, 2777);
                        var10 = var24;
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

    qi(String param0, gl param1) {
        super(param0, (kg) null);
        this.field_P = null;
        try {
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = "to over <%0> great games";
        field_L = "Fast Drop Bonus: ";
        field_T = "Checking";
        field_Q = new vj();
        field_R = new ck(270, 70);
    }
}
