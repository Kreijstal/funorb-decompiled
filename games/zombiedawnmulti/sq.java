/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sq extends gn {
    static int field_R;
    private String[] field_M;
    private th field_T;
    static boolean field_N;
    static int field_S;
    private wi field_V;
    static int field_Q;
    static int field_O;
    static int[] field_U;
    static String field_P;

    final static void a(int param0, int param1, int param2, int param3, ja param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ja var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_24_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_42_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param6 >= oo.field_f) {
                break L1;
              } else {
                param1 = param1 - (oo.field_f - param6);
                param6 = oo.field_f;
                break L1;
              }
            }
            L2: {
              if (param7 < oo.field_e) {
                param3 = param3 - (oo.field_e - param7);
                param7 = oo.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (oo.field_g < param6 - -param1) {
                param1 = oo.field_g - param6;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (oo.field_d < param7 + param3) {
                param3 = -param7 + oo.field_d;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 <= (param1 ^ -1)) {
                break L5;
              } else {
                if (param3 > 0) {
                  L6: {
                    var21 = param4.c();
                    var30 = oo.field_i;
                    if (param0 == 5) {
                      break L6;
                    } else {
                      sq.g(-57);
                      break L6;
                    }
                  }
                  var10 = oo.field_b;
                  var11 = oo.field_l;
                  var29 = new int[4];
                  oo.a(var29);
                  param4.a();
                  oo.e(var29[0], var29[1], var29[2], var29[3]);
                  var13 = param6 + param7 * param4.field_x;
                  var14 = param4.field_x + -param1;
                  var25 = var21.field_B;
                  var22 = var25;
                  var15 = var22;
                  var16 = param7;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (param3 + param7 <= var16) {
                          break L9;
                        } else {
                          if (var19 != 0) {
                            break L8;
                          } else {
                            var17 = param6;
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (var17 >= param6 - -param1) {
                                    break L12;
                                  } else {
                                    var18 = var25[var13];
                                    stackOut_23_0 = var18;
                                    stackIn_43_0 = stackOut_23_0;
                                    stackIn_24_0 = stackOut_23_0;
                                    if (var19 != 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        if (stackIn_24_0 == 0) {
                                          break L13;
                                        } else {
                                          L14: {
                                            if (0 >= var17) {
                                              break L14;
                                            } else {
                                              if (-1 == (var15[-1 + var13] ^ -1)) {
                                                oo.d(var17, var16, param2, param5);
                                                break L13;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          L15: {
                                            if (-1 <= (var16 ^ -1)) {
                                              break L15;
                                            } else {
                                              if (0 == var15[var13 - param4.field_x]) {
                                                oo.d(var17, var16, param2, param5);
                                                break L13;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (param4.field_x + -1 <= var17) {
                                              break L16;
                                            } else {
                                              if (var15[var13 - -1] == 0) {
                                                oo.d(var17, var16, param2, param5);
                                                break L13;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          if (-1 + param4.field_w <= var16) {
                                            break L13;
                                          } else {
                                            if (var15[var13 - -param4.field_x] != 0) {
                                              break L13;
                                            } else {
                                              oo.d(var17, var16, param2, param5);
                                              break L13;
                                            }
                                          }
                                        }
                                      }
                                      var13++;
                                      var17++;
                                      if (var19 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                stackOut_42_0 = var13 + var14;
                                stackIn_43_0 = stackOut_42_0;
                                break L11;
                              }
                              var13 = stackIn_43_0;
                              var16++;
                              if (var19 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      var21.g(-param4.field_r, -param4.field_y);
                      oo.a(var30, var10, var11);
                      oo.b(var29);
                      break L8;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var8);
            stackOut_46_1 = new StringBuilder().append("sq.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param4 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L17;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L17;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        wi var7 = null;
        super.a(param0, param1, param2, param3);
        var5 = -this.field_y + param2;
        var6 = -this.field_i + param3;
        var7 = this.a((byte) 23, var5, var6);
        if (var7 != null) {
          if (null != this.field_A) {
            ((co) ((Object) this.field_A)).a(param1, (sq) (this), -38, var7.field_l);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final wi a(byte param0, int param1, int param2) {
        wi var4 = null;
        wi var5 = null;
        int var6 = 0;
        wi stackIn_7_0 = null;
        wi stackIn_14_0 = null;
        wi stackOut_6_0 = null;
        wi stackOut_13_0 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = (wi) ((Object) this.field_T.c(105));
        if (param0 == 23) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = (wi) (var5);
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0.field_k > param1) {
                            break L4;
                          } else {
                            if (param2 < var5.field_f) {
                              break L4;
                            } else {
                              if (param1 >= var5.field_j + var5.field_k) {
                                break L4;
                              } else {
                                if (param2 > var5.field_n + var5.field_f) {
                                  break L4;
                                } else {
                                  return var4;
                                }
                              }
                            }
                          }
                        }
                        var5 = var5.field_i;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = (wi) ((Object) this.field_T.b(6));
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                var4 = stackIn_14_0;
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
          return (wi) null;
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        cf var7 = null;
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
              super.a(param0 ^ 0, param1, param2, param3);
              if (param0 == -5407) {
                break L1;
              } else {
                var7 = (cf) null;
                this.a(93, (cf) null, 109, -90);
                break L1;
              }
            }
            L2: {
              this.field_V = null;
              if (this.field_l) {
                var5_int = bd.field_g - (param2 + this.field_y);
                var6 = bo.field_d + (-param3 - this.field_i);
                this.field_V = this.a((byte) 23, var5_int, var6);
                break L2;
              } else {
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
            stackOut_6_1 = new StringBuilder().append("sq.T(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 != -4) {
          field_S = 74;
          this.b(param3, param1, param2 ^ -28976, param0, ((rk) ((Object) this.field_h)).a((byte) 39, (cf) (this)));
          return;
        } else {
          this.b(param3, param1, param2 ^ -28976, param0, ((rk) ((Object) this.field_h)).a((byte) 39, (cf) (this)));
          return;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        rk var3 = null;
        mp var4 = null;
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
        rk var17_ref = null;
        String var21 = null;
        mp var22 = null;
        td var23 = null;
        wi var24 = null;
        Object var25 = null;
        String var26 = null;
        mp var27 = null;
        td var28 = null;
        wi var29 = null;
        rk var30 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var17 = null;
        var25 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_T = new th();
        var2 = 0;
        if (param0 == 94) {
          var30 = (rk) ((Object) this.field_h);
          var27 = var30.a((cf) (this), -102);
          L0: while (true) {
            var5 = this.field_j.indexOf("<hotspot=", var2);
            stackOut_25_0 = var5;
            stackOut_25_1 = -1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            L1: while (true) {
              L2: {
                if ((stackIn_26_0 ^ stackIn_26_1) != 0) {
                  break L2;
                } else {
                  if (var16 != 0) {
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              var7 = this.field_j.indexOf(">", var5);
              var26 = this.field_j.substring(var5 + 9, var7);
              var7 = Integer.parseInt(var26);
              var2 = this.field_j.indexOf("</hotspot>", var5);
              var8 = var27.a((byte) -126, var5);
              var9 = var27.a((byte) -126, var2);
              var10 = null;
              var11 = var8;
              L3: while (true) {
                L4: {
                  if (var9 < var11) {
                    break L4;
                  } else {
                    var28 = var27.field_e[var11];
                    stackOut_31_0 = var8;
                    stackOut_31_1 = var11;
                    stackIn_26_0 = stackOut_31_0;
                    stackIn_26_1 = stackOut_31_1;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    if (var16 != 0) {
                      continue L1;
                    } else {
                      L5: {
                        if (stackIn_32_0 == stackIn_32_1) {
                          stackOut_34_0 = var27.a(52224, var5);
                          stackIn_35_0 = stackOut_34_0;
                          break L5;
                        } else {
                          stackOut_33_0 = var28.field_e[0];
                          stackIn_35_0 = stackOut_33_0;
                          break L5;
                        }
                      }
                      L6: {
                        var13 = stackIn_35_0;
                        if (var9 == var11) {
                          stackOut_39_0 = var27.a(52224, var2);
                          stackIn_40_0 = stackOut_39_0;
                          break L6;
                        } else {
                          if (var28 == null) {
                            stackOut_38_0 = 0;
                            stackIn_40_0 = stackOut_38_0;
                            break L6;
                          } else {
                            stackOut_37_0 = var28.field_e[-1 + var28.field_e.length];
                            stackIn_40_0 = stackOut_37_0;
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var14 = stackIn_40_0;
                        var29 = new wi(var7, var13, var28.field_d, -var13 + var14, Math.max(var30.a(0), var28.field_h - var28.field_d));
                        if (var10 != null) {
                          ((wi) (var10)).field_i = var29;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10 = var29;
                      this.field_T.a(var29, false);
                      var11++;
                      if (var16 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (var16 == 0) {
                  continue L0;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          this.a((byte) -110);
          var17_ref = (rk) ((Object) this.field_h);
          var3 = var17_ref;
          var22 = var17_ref.a((cf) (this), -102);
          var4 = var22;
          L8: while (true) {
            var5 = this.field_j.indexOf("<hotspot=", var2);
            stackOut_2_0 = var5;
            stackOut_2_1 = -1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            L9: while (true) {
              L10: {
                if ((stackIn_3_0 ^ stackIn_3_1) != 0) {
                  break L10;
                } else {
                  if (var16 != 0) {
                    break L10;
                  } else {
                    return;
                  }
                }
              }
              var7 = this.field_j.indexOf(">", var5);
              var21 = this.field_j.substring(var5 + 9, var7);
              var7 = Integer.parseInt(var21);
              var2 = this.field_j.indexOf("</hotspot>", var5);
              var8 = var22.a((byte) -126, var5);
              var9 = var22.a((byte) -126, var2);
              var10 = null;
              var11 = var8;
              L11: while (true) {
                L12: {
                  if (var9 < var11) {
                    break L12;
                  } else {
                    var23 = var22.field_e[var11];
                    stackOut_9_0 = var8;
                    stackOut_9_1 = var11;
                    stackIn_3_0 = stackOut_9_0;
                    stackIn_3_1 = stackOut_9_1;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    if (var16 != 0) {
                      continue L9;
                    } else {
                      L13: {
                        if (stackIn_10_0 == stackIn_10_1) {
                          stackOut_12_0 = var22.a(52224, var5);
                          stackIn_13_0 = stackOut_12_0;
                          break L13;
                        } else {
                          stackOut_11_0 = var23.field_e[0];
                          stackIn_13_0 = stackOut_11_0;
                          break L13;
                        }
                      }
                      L14: {
                        var13 = stackIn_13_0;
                        if (var9 == var11) {
                          stackOut_17_0 = var22.a(52224, var2);
                          stackIn_18_0 = stackOut_17_0;
                          break L14;
                        } else {
                          if (var23 == null) {
                            stackOut_16_0 = 0;
                            stackIn_18_0 = stackOut_16_0;
                            break L14;
                          } else {
                            stackOut_15_0 = var23.field_e[-1 + var23.field_e.length];
                            stackIn_18_0 = stackOut_15_0;
                            break L14;
                          }
                        }
                      }
                      L15: {
                        var14 = stackIn_18_0;
                        var24 = new wi(var7, var13, var23.field_d, -var13 + var14, Math.max(var17_ref.a(0), var23.field_h - var23.field_d));
                        if (var10 != null) {
                          ((wi) (var10)).field_i = var24;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      var10 = var24;
                      this.field_T.a(var24, false);
                      var11++;
                      if (var16 == 0) {
                        continue L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                if (var16 == 0) {
                  continue L8;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_P = null;
        if (param0 != 2) {
            field_R = -124;
            field_U = null;
            return;
        }
        field_U = null;
    }

    String d(byte param0) {
        int var2 = 0;
        if (null != this.field_V) {
          if (this.field_M != null) {
            if (this.field_M.length <= this.field_V.field_l) {
              return null;
            } else {
              var2 = 95 / ((53 - param0) / 57);
              return this.field_M[this.field_V.field_l];
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    boolean a(cf param0, int param1) {
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
              if (param1 == 0) {
                break L1;
              } else {
                this.a((byte) 97);
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
            stackOut_4_1 = new StringBuilder().append("sq.S(");
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    sq(String param0, nl param1) {
        super(param0, (bj) null);
        this.field_V = null;
        try {
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        rk var5 = null;
        wi var6 = null;
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (0 == param2) {
          var5 = (rk) ((Object) this.field_h);
          var6 = this.field_V;
          if (var6 == null) {
            return;
          } else {
            var7 = var5.a(false, param3, (cf) (this));
            var8 = var5.a((cf) (this), 0, param1);
            L0: while (true) {
              hl.a(-2 + var6.field_f + var8, var7 - (-var6.field_k + 2), (byte) 126, var6.field_j + 2, 2 + var6.field_n);
              var6 = var6.field_i;
              if (var6 != null) {
                continue L0;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
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
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_M) {
                  break L2;
                } else {
                  if (param0 < this.field_M.length) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param0];
                var8 = var7;
                var4 = var8;
                if (this.field_M != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= this.field_M.length) {
                      break L3;
                    } else {
                      var7[var5] = this.field_M[var5];
                      var5++;
                      if (var6 != 0) {
                        break L1;
                      } else {
                        if (var6 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              this.field_M = var8;
              break L1;
            }
            if (param1 <= -101) {
              this.field_M[param0] = param2;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("sq.OA(").append(param0).append(',').append(param1).append(',');
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
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a((byte) 94);
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        pd var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_19_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_34_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        pd stackIn_45_0 = null;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        String stackOut_23_0 = null;
        String stackOut_22_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_40_0 = 0;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        pd stackOut_44_0 = null;
        pd stackOut_43_0 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = ce.field_k;
              var2 = 0;
              if (ho.field_q == 2) {
                var3_long = bl.a((byte) 49) + -so.field_s;
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if ((var2 ^ -1) > -1) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              L3: {
                if (hq.field_m.length <= var3) {
                  stackOut_53_0 = -59;
                  stackOut_53_1 = (param0 - 38) / 57;
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  break L3;
                } else {
                  var4 = wd.field_Q[var3];
                  stackOut_8_0 = -1;
                  stackOut_8_1 = var4 ^ -1;
                  stackIn_54_0 = stackOut_8_0;
                  stackIn_54_1 = stackOut_8_1;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  if (var10 != 0) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        if (stackIn_9_0 >= stackIn_9_1) {
                          break L5;
                        } else {
                          var5 = qh.field_e;
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var4 != aq.field_B.field_d) {
                          break L6;
                        } else {
                          var5 = fq.field_n;
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var5 = hp.field_k;
                      break L4;
                    }
                    L7: {
                      var6 = hq.field_m[var3];
                      if (-3 != (ho.field_q ^ -1)) {
                        break L7;
                      } else {
                        if (var2 != 1) {
                          break L7;
                        } else {
                          L8: {
                            if (aa.field_n.length < q.field_a.length) {
                              stackOut_18_0 = q.field_a.length;
                              stackIn_19_0 = stackOut_18_0;
                              break L8;
                            } else {
                              stackOut_17_0 = aa.field_n.length;
                              stackIn_19_0 = stackOut_17_0;
                              break L8;
                            }
                          }
                          L9: {
                            var7 = stackIn_19_0;
                            if ((var3 ^ -1) > -7) {
                              break L9;
                            } else {
                              if (var3 >= 6 - -var7) {
                                break L9;
                              } else {
                                L10: {
                                  if (0 > -6 + var3 - (-aa.field_n.length + var7)) {
                                    stackOut_23_0 = "";
                                    stackIn_24_0 = stackOut_23_0;
                                    break L10;
                                  } else {
                                    stackOut_22_0 = aa.field_n[var3 - (6 + (-aa.field_n.length + var7))];
                                    stackIn_24_0 = stackOut_22_0;
                                    break L10;
                                  }
                                }
                                var6 = stackIn_24_0;
                                break L9;
                              }
                            }
                          }
                          L11: {
                            if (ud.field_N.length <= ik.field_a.length) {
                              stackOut_27_0 = ik.field_a.length;
                              stackIn_28_0 = stackOut_27_0;
                              break L11;
                            } else {
                              stackOut_26_0 = ud.field_N.length;
                              stackIn_28_0 = stackOut_26_0;
                              break L11;
                            }
                          }
                          var8 = stackIn_28_0;
                          if (7 + var7 > var3) {
                            break L7;
                          } else {
                            if (var7 + 7 - -var8 > var3) {
                              L12: {
                                if (ik.field_a.length > -var7 + -7 + var3) {
                                  stackOut_33_0 = ik.field_a[-7 + var3 + -var7];
                                  stackIn_34_0 = stackOut_33_0;
                                  break L12;
                                } else {
                                  stackOut_32_0 = "";
                                  stackIn_34_0 = stackOut_32_0;
                                  break L12;
                                }
                              }
                              var6 = stackIn_34_0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L13: {
                      if (1 == (var4 ^ -1)) {
                        var6 = Integer.toString(var2);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      stackOut_38_0 = 0;
                      stackOut_38_1 = (String) (var6);
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      if (var4 < 0) {
                        stackOut_40_0 = stackIn_40_0;
                        stackOut_40_1 = (String) ((Object) stackIn_40_1);
                        stackOut_40_2 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        break L14;
                      } else {
                        stackOut_39_0 = stackIn_39_0;
                        stackOut_39_1 = (String) ((Object) stackIn_39_1);
                        stackOut_39_2 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        stackIn_41_2 = stackOut_39_2;
                        break L14;
                      }
                    }
                    L15: {
                      var7 = hn.a(stackIn_41_0, stackIn_41_1, stackIn_41_2 != 0);
                      var8 = am.field_c + -(var7 >> -909100255);
                      if ((var4 ^ -1) > -1) {
                        break L15;
                      } else {
                        L16: {
                          var1_int = var1_int + al.field_bb;
                          if (var4 != aq.field_B.field_d) {
                            stackOut_44_0 = mc.field_a;
                            stackIn_45_0 = stackOut_44_0;
                            break L16;
                          } else {
                            stackOut_43_0 = en.field_d;
                            stackIn_45_0 = stackOut_43_0;
                            break L16;
                          }
                        }
                        L17: {
                          var9 = stackIn_45_0;
                          if (var9 != null) {
                            var9.a(var1_int, -no.field_Gb + var8, var7 - -(no.field_Gb << 472381537), me.field_h + (wk.field_G << -36687903), 12018);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        var1_int = var1_int + wk.field_G;
                        break L15;
                      }
                    }
                    L18: {
                      L19: {
                        if (-1 >= (var4 ^ -1)) {
                          break L19;
                        } else {
                          uq.field_f.c(var6, var8, var1_int + bf.field_g, var5, -1);
                          var1_int = var1_int + se.field_C;
                          if (var10 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      m.field_C.c(var6, var8, var1_int + nc.field_h, var5, -1);
                      var1_int = var1_int + (al.field_bb + (wk.field_G - -me.field_h));
                      break L18;
                    }
                    var3++;
                    continue L2;
                  }
                }
              }
              var3 = stackIn_54_0 % stackIn_54_1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "sq.WA(" + param0 + ')');
        }
    }

    final static void a(int param0, ja[] param1, boolean param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              fa.field_Qb[param0] = param1;
              if (!param2) {
                break L1;
              } else {
                sq.f(-7);
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 == param0) {
                  break L3;
                } else {
                  L4: {
                    if ((param0 ^ -1) == -5) {
                      break L4;
                    } else {
                      L5: {
                        if (1 == param0) {
                          break L5;
                        } else {
                          L6: {
                            if ((param0 ^ -1) != -3) {
                              break L6;
                            } else {
                              qc.a(0, (byte) -126, param1, 63, 3);
                              qc.a(0, (byte) -126, param1, 62, 4);
                              qc.a(0, (byte) -126, param1, 61, 1);
                              qc.a(0, (byte) -126, param1, 60, 2);
                              qc.a(0, (byte) -126, param1, 59, 5);
                              qc.a(0, (byte) -126, param1, 58, 6);
                              qc.a(0, (byte) -126, param1, 57, 7);
                              qc.a(0, (byte) -126, param1, 56, 8);
                              qc.a(3, (byte) -126, param1, 55, 3);
                              qc.a(3, (byte) -126, param1, 54, 4);
                              qc.a(3, (byte) -126, param1, 53, 1);
                              qc.a(3, (byte) -126, param1, 52, 2);
                              qc.a(3, (byte) -126, param1, 51, 5);
                              qc.a(3, (byte) -126, param1, 50, 6);
                              qc.a(3, (byte) -126, param1, 49, 7);
                              qc.a(3, (byte) -126, param1, 48, 8);
                              qc.a(0, (byte) -126, param1, 47, 0);
                              qc.a(3, (byte) -126, param1, 46, 0);
                              qc.a(15, (byte) -126, param1, 45, 2);
                              qc.a(15, (byte) -126, param1, 44, 1);
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (param0 == 3) {
                            qc.a(4, (byte) -126, param1, 63, 3);
                            qc.a(4, (byte) -126, param1, 62, 4);
                            qc.a(4, (byte) -126, param1, 61, 1);
                            qc.a(4, (byte) -126, param1, 60, 2);
                            qc.a(4, (byte) -126, param1, 59, 5);
                            qc.a(4, (byte) -126, param1, 58, 6);
                            qc.a(4, (byte) -126, param1, 57, 7);
                            qc.a(4, (byte) -126, param1, 56, 8);
                            qc.a(4, (byte) -126, param1, 55, 0);
                            qc.a(5, (byte) -126, param1, 52, 0);
                            qc.a(12, (byte) -126, param1, 51, 2);
                            qc.a(12, (byte) -126, param1, 50, 1);
                            qc.a(26, (byte) -126, param1, 49, 2);
                            qc.a(26, (byte) -126, param1, 48, 1);
                            qc.a(26, (byte) -126, param1, 47, 8);
                            qc.a(26, (byte) -126, param1, 46, 5);
                            qc.a(26, (byte) -126, param1, 45, 6);
                            qc.a(26, (byte) -126, param1, 44, 7);
                            qc.a(6, (byte) -126, param1, 43, 2);
                            qc.a(6, (byte) -126, param1, 42, 1);
                            qc.a(12, (byte) -126, param1, 41, 5);
                            qc.a(12, (byte) -126, param1, 40, 8);
                            qc.a(12, (byte) -126, param1, 39, 4);
                            qc.a(12, (byte) -126, param1, 38, 3);
                            qc.a(29, (byte) -126, param1, 37, 2);
                            qc.a(29, (byte) -126, param1, 36, 0);
                            qc.a(26, (byte) -126, param1, 23, 4);
                            qc.a(12, (byte) -126, param1, 22, 6);
                            qc.a(12, (byte) -126, param1, 21, 7);
                            if (var4 == 0) {
                              break L2;
                            } else {
                              break L5;
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                      qc.a(2, (byte) -126, param1, 63, 2);
                      qc.a(2, (byte) -126, param1, 62, 1);
                      qc.a(2, (byte) -126, param1, 61, 5);
                      qc.a(2, (byte) -126, param1, 60, 6);
                      qc.a(2, (byte) -126, param1, 59, 8);
                      qc.a(2, (byte) -126, param1, 58, 7);
                      qc.a(2, (byte) -126, param1, 57, 4);
                      qc.a(3, (byte) -126, param1, 56, 2);
                      qc.a(3, (byte) -126, param1, 55, 1);
                      qc.a(3, (byte) -126, param1, 54, 5);
                      qc.a(3, (byte) -126, param1, 53, 6);
                      qc.a(3, (byte) -126, param1, 52, 8);
                      qc.a(3, (byte) -126, param1, 51, 7);
                      qc.a(3, (byte) -126, param1, 50, 0);
                      qc.a(2, (byte) -126, param1, 49, 3);
                      qc.a(0, (byte) -126, param1, 48, 1);
                      qc.a(0, (byte) -126, param1, 47, 2);
                      qc.a(9, (byte) -126, param1, 46, 3);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  qc.a(0, (byte) -126, param1, 79, 3);
                  qc.a(0, (byte) -126, param1, 78, 4);
                  qc.a(0, (byte) -126, param1, 77, 1);
                  qc.a(0, (byte) -126, param1, 76, 2);
                  qc.a(0, (byte) -126, param1, 75, 5);
                  qc.a(0, (byte) -126, param1, 74, 6);
                  qc.a(0, (byte) -126, param1, 73, 7);
                  qc.a(0, (byte) -126, param1, 72, 8);
                  qc.a(0, (byte) -126, param1, 71, 0);
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              param1[6].a();
              oo.e(0, 0, 24, 24, 0);
              qc.a(2, (byte) -126, param1, 79, 3);
              qc.a(2, (byte) -126, param1, 78, 4);
              qc.a(2, (byte) -126, param1, 77, 1);
              qc.a(2, (byte) -126, param1, 76, 2);
              qc.a(2, (byte) -126, param1, 75, 5);
              qc.a(2, (byte) -126, param1, 74, 6);
              qc.a(2, (byte) -126, param1, 73, 7);
              qc.a(2, (byte) -126, param1, 72, 8);
              qc.a(0, (byte) -126, param1, 71, 3);
              qc.a(0, (byte) -126, param1, 70, 4);
              qc.a(0, (byte) -126, param1, 69, 1);
              qc.a(0, (byte) -126, param1, 68, 2);
              qc.a(0, (byte) -126, param1, 67, 5);
              qc.a(0, (byte) -126, param1, 66, 6);
              qc.a(0, (byte) -126, param1, 65, 7);
              qc.a(0, (byte) -126, param1, 64, 8);
              qc.a(7, (byte) -126, param1, 61, 2);
              qc.a(7, (byte) -126, param1, 60, 1);
              qc.a(7, (byte) -126, param1, 59, 5);
              qc.a(7, (byte) -126, param1, 58, 6);
              qc.a(7, (byte) -126, param1, 57, 7);
              qc.a(7, (byte) -126, param1, 56, 8);
              qc.a(24, (byte) -126, param1, 55, 2);
              qc.a(24, (byte) -126, param1, 54, 1);
              qc.a(24, (byte) -126, param1, 53, 5);
              qc.a(2, (byte) -126, param1, 63, 0);
              qc.a(0, (byte) -126, param1, 62, 0);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("sq.PA(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
    }

    static {
        field_N = true;
        field_S = 0;
        field_P = "Quick Chat lobby";
        field_U = new int[256];
    }
}
