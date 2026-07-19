/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    static boolean field_c;
    private qla field_a;
    private ha field_b;

    abstract void fa(char param0, int param1, int param2, int param3, boolean param4);

    final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        if (!(param5 != null)) {
            return;
        }
        this.a(param3, param0, param1 + 116);
        if (param1 != -1) {
            return;
        }
        try {
            this.a(false, param2 - this.field_a.a(param5, (byte) 107) / 2, (aa) null, (int[]) null, 0, (nh[]) null, param5, 0, param4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "da.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    private final void a(int param0, int param1, int param2) {
        nt.field_b = -1;
        if (param2 < 106) {
            this.field_a = (qla) null;
        }
        cka.field_ab = 0;
        lra.field_g = param0;
        v.field_k = param0;
        moa.field_a = 0;
        if (param1 == -1) {
            param1 = 0;
        }
        moa.field_b = -1;
        tta.field_G = param1;
        wqa.field_G = param1;
    }

    final static void a(boolean param0) {
        uh.field_h.a(rra.field_e.field_G + -(!rca.field_p ? 0 : 40 + (2 + io.field_a + 2)), 18, -23776, 0, 0);
        vw.field_b.a(io.field_a + 42, 18, -23776, 0, -2 + (rra.field_e.field_G - (io.field_a - -40)));
        bsa.field_j.a(rra.field_e.field_G, 2, (byte) 127, 0, io.field_a, -20 + rra.field_e.field_t, 20);
        if (param0) {
            da.a(false);
        }
    }

    private final void a(String param0, int param1) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  L3: {
                    if (!param0.startsWith("col=")) {
                      break L3;
                    } else {
                      var5 = (CharSequence) ((Object) param0.substring(4));
                      v.field_k = -16777216 & v.field_k | 16777215 & eba.a(var5, -105, 16);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (param0.equals("/col")) {
                    v.field_k = 16777215 & lra.field_g | v.field_k & -16777216;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  L5: {
                    L6: {
                      if (!param0.startsWith("argb=")) {
                        break L6;
                      } else {
                        var6 = (CharSequence) ((Object) param0.substring(5));
                        v.field_k = eba.a(var6, -63, 16);
                        if (var4 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (param0.equals("/argb")) {
                        break L7;
                      } else {
                        L8: {
                          if (!param0.startsWith("str=")) {
                            break L8;
                          } else {
                            var7 = (CharSequence) ((Object) param0.substring(4));
                            nt.field_b = v.field_k & -16777216 | eba.a(var7, -45, 16);
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (param0.equals("str")) {
                            break L9;
                          } else {
                            L10: {
                              if (param0.equals("/str")) {
                                break L10;
                              } else {
                                L11: {
                                  if (param0.startsWith("u=")) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (param0.equals("u")) {
                                        break L12;
                                      } else {
                                        L13: {
                                          if (!param0.equals("/u")) {
                                            break L13;
                                          } else {
                                            moa.field_b = -1;
                                            if (var4 == 0) {
                                              break L5;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (!param0.equalsIgnoreCase("shad=-1")) {
                                            break L14;
                                          } else {
                                            wqa.field_G = 0;
                                            if (var4 == 0) {
                                              break L5;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        L15: {
                                          if (param0.startsWith("shad=")) {
                                            break L15;
                                          } else {
                                            L16: {
                                              if (param0.equals("shad")) {
                                                break L16;
                                              } else {
                                                L17: {
                                                  if (!param0.equals("/shad")) {
                                                    break L17;
                                                  } else {
                                                    wqa.field_G = tta.field_G;
                                                    if (var4 == 0) {
                                                      break L5;
                                                    } else {
                                                      break L17;
                                                    }
                                                  }
                                                }
                                                if (param0.equals("br")) {
                                                  this.a(lra.field_g, tta.field_G, 122);
                                                  if (var4 == 0) {
                                                    break L5;
                                                  } else {
                                                    break L16;
                                                  }
                                                } else {
                                                  break L4;
                                                }
                                              }
                                            }
                                            wqa.field_G = -16777216 & v.field_k;
                                            if (var4 == 0) {
                                              break L5;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        var8 = (CharSequence) ((Object) param0.substring(5));
                                        wqa.field_G = v.field_k & -16777216 | eba.a(var8, -52, 16);
                                        if (var4 == 0) {
                                          break L5;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    moa.field_b = -16777216 & v.field_k;
                                    if (var4 == 0) {
                                      break L5;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var9 = (CharSequence) ((Object) param0.substring(2));
                                moa.field_b = v.field_k & -16777216 | eba.a(var9, -65, 16);
                                if (var4 == 0) {
                                  break L5;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            nt.field_b = -1;
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        nt.field_b = 8388608 | -16777216 & v.field_k;
                        if (var4 == 0) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    v.field_k = lra.field_g;
                    break L4;
                  }
                  break L4;
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L18: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L18;
              }
            }
            L19: {
              if (param1 > 108) {
                break L19;
              } else {
                this.field_a = (qla) null;
                break L19;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L20: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) (var3_ref);
            stackOut_50_1 = new StringBuilder().append("da.D(");
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L20;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L20;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param1 + ')');
        }
    }

    private final int a(int[] param0, int param1, String param2, int param3, int param4, aa param5, int param6, nh[] param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_3_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_51_0 = 0;
        Object stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        Object stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        Object stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        Object stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        Object stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        Object stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        Object stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        Object stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        Object stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        Object stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        Object stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        Object stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        Object stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        Object stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        Object stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        Object stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        Object stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        Object stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        Object stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        Object stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        Object stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        Object stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        Object stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                this.a(param16, param15, 109);
                if ((param13 ^ -1) == -1) {
                  param13 = this.field_a.field_a;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (param9 >= param13 + this.field_a.field_h - -this.field_a.field_g) {
                    break L3;
                  } else {
                    if (param9 >= param13 + param13) {
                      break L3;
                    } else {
                      var18 = null;
                      if (var23 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var18 = new int[]{param11};
                break L2;
              }
              L4: {
                var19 = this.field_a.a(param2, -127, ska.field_q, param7, (int[]) (var18));
                if (0 != (param14 ^ -1)) {
                  break L4;
                } else {
                  param14 = param9 / param13;
                  if (0 >= param14) {
                    param14 = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if ((param14 ^ -1) >= -1) {
                  break L5;
                } else {
                  if (var19 >= param14) {
                    ska.field_q[-1 + param14] = this.field_a.a(false, param7, ska.field_q[-1 + param14], param11);
                    var19 = param14;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (3 != param6) {
                  break L6;
                } else {
                  if (-2 == (var19 ^ -1)) {
                    param6 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                L8: {
                  var21 = 61 % ((-4 - param12) / 59);
                  if (param6 == 0) {
                    break L8;
                  } else {
                    L9: {
                      if (-2 == (param6 ^ -1)) {
                        break L9;
                      } else {
                        L10: {
                          if ((param6 ^ -1) == -3) {
                            break L10;
                          } else {
                            L11: {
                              var22 = (-(param13 * (var19 + -1)) + (param9 + -this.field_a.field_h) - this.field_a.field_g) / (var19 + 1);
                              if (-1 < (var22 ^ -1)) {
                                var22 = 0;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            var20 = var22 + (this.field_a.field_h + param10);
                            param13 = param13 + var22;
                            if (var23 == 0) {
                              break L7;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var20 = -((-1 + var19) * param13) + (-this.field_a.field_g + param10) - -param9;
                        if (var23 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var20 = this.field_a.field_h + (param10 + (-((var19 + -1) * param13) + -this.field_a.field_g + (-this.field_a.field_h + param9)) / 2);
                    if (var23 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var20 = param10 - -this.field_a.field_h;
                break L7;
              }
              var22 = 0;
              L12: while (true) {
                L13: {
                  L14: {
                    if ((var22 ^ -1) <= (var19 ^ -1)) {
                      break L14;
                    } else {
                      stackOut_35_0 = param4 ^ -1;
                      stackIn_51_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (var23 != 0) {
                        break L13;
                      } else {
                        L15: {
                          L16: {
                            if (stackIn_36_0 == -1) {
                              break L16;
                            } else {
                              L17: {
                                if ((param4 ^ -1) == -2) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (-3 == (param4 ^ -1)) {
                                      break L18;
                                    } else {
                                      L19: {
                                        if ((var19 + -1 ^ -1) == (var22 ^ -1)) {
                                          break L19;
                                        } else {
                                          this.a(true, param11, ska.field_q[var22]);
                                          this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                                          cka.field_ab = 0;
                                          if (var23 == 0) {
                                            break L15;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                                      if (var23 == 0) {
                                        break L15;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  this.a(false, -this.field_a.a(ska.field_q[var22], (byte) -116) + (param11 + param1), param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                                  if (var23 == 0) {
                                    break L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              this.a(false, (param11 - this.field_a.a(ska.field_q[var22], (byte) -101)) / 2 + param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                              if (var23 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                          break L15;
                        }
                        var20 = var20 + param13;
                        var22++;
                        if (var23 == 0) {
                          continue L12;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  stackOut_50_0 = var19;
                  stackIn_51_0 = stackOut_50_0;
                  break L13;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var18 = decompiledCaughtException;
            stackOut_52_0 = var18;
            stackOut_52_1 = new StringBuilder().append("da.H(");
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_54_0 = stackIn_54_0;
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L20;
            } else {
              stackOut_53_0 = stackIn_53_0;
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L20;
            }
          }
          L21: {
            stackOut_55_0 = stackIn_55_0;
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',').append(param1).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param2 == null) {
              stackOut_57_0 = stackIn_57_0;
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L21;
            } else {
              stackOut_56_0 = stackIn_56_0;
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L21;
            }
          }
          L22: {
            stackOut_58_0 = stackIn_58_0;
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param5 == null) {
              stackOut_60_0 = stackIn_60_0;
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L22;
            } else {
              stackOut_59_0 = stackIn_59_0;
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L22;
            }
          }
          L23: {
            stackOut_61_0 = stackIn_61_0;
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',').append(param6).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param7 == null) {
              stackOut_63_0 = stackIn_63_0;
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L23;
            } else {
              stackOut_62_0 = stackIn_62_0;
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L23;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_51_0;
        }
    }

    private final void a(boolean param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param2.length() <= var6) {
                    break L3;
                  } else {
                    var7 = param2.charAt(var6);
                    stackOut_3_0 = var7 ^ -1;
                    stackOut_3_1 = -61;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_13_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 != stackIn_4_1) {
                            break L5;
                          } else {
                            var5 = 1;
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var7 != 62) {
                            break L6;
                          } else {
                            var5 = 0;
                            if (var8 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (var5 != 0) {
                          break L4;
                        } else {
                          if (32 != var7) {
                            break L4;
                          } else {
                            var4_int++;
                            break L4;
                          }
                        }
                      }
                      var6++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_12_0 = var4_int ^ -1;
                stackOut_12_1 = -1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L2;
              }
              L7: {
                if (stackIn_13_0 < stackIn_13_1) {
                  cka.field_ab = (param1 + -this.field_a.a(param2, (byte) -121) << -2020511736) / var4_int;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param0) {
                  break L8;
                } else {
                  this.field_a = (qla) null;
                  break L8;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("da.G(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    private final void a(boolean param0, int param1, aa param2, int[] param3, int param4, nh[] param5, String param6, int param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var15_ref_String = null;
        Exception var16 = null;
        int var16_int = 0;
        nh var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var20 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param8 = param8 - this.field_a.field_a;
            var10_int = -1;
            if (!param0) {
              var11 = -1;
              var12 = param6.length();
              var13 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var12 ^ -1) >= (var13 ^ -1)) {
                      break L3;
                    } else {
                      var14 = (char)(io.a(-377, param6.charAt(var13)) & 255);
                      if (var19 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if ((var14 ^ -1) == -61) {
                              var10_int = var13;
                              if (var19 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if ((var14 ^ -1) != -63) {
                              break L6;
                            } else {
                              if (0 == (var10_int ^ -1)) {
                                break L6;
                              } else {
                                L7: {
                                  var15_ref_String = param6.substring(1 + var10_int, var13);
                                  var10_int = -1;
                                  if (!var15_ref_String.equals("lt")) {
                                    break L7;
                                  } else {
                                    var14 = 60;
                                    if (var19 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                L8: {
                                  if (var15_ref_String.equals("gt")) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (!var15_ref_String.equals("nbsp")) {
                                        break L9;
                                      } else {
                                        var14 = 160;
                                        if (var19 == 0) {
                                          break L6;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (!var15_ref_String.equals("shy")) {
                                        break L10;
                                      } else {
                                        var14 = 173;
                                        if (var19 == 0) {
                                          break L6;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (!var15_ref_String.equals("times")) {
                                        break L11;
                                      } else {
                                        var14 = 215;
                                        if (var19 == 0) {
                                          break L6;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (var15_ref_String.equals("euro")) {
                                        break L12;
                                      } else {
                                        L13: {
                                          if (!var15_ref_String.equals("copy")) {
                                            break L13;
                                          } else {
                                            var14 = 169;
                                            if (var19 == 0) {
                                              break L6;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (!var15_ref_String.equals("reg")) {
                                            break L14;
                                          } else {
                                            var14 = 174;
                                            if (var19 == 0) {
                                              break L6;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        L15: {
                                          if (var15_ref_String.startsWith("img=")) {
                                            break L15;
                                          } else {
                                            this.a(var15_ref_String, 115);
                                            if (var19 == 0) {
                                              break L4;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        try {
                                          L16: {
                                            L17: {
                                              var21 = (CharSequence) ((Object) var15_ref_String.substring(4));
                                              var16_int = jb.a(var21, (byte) 70);
                                              var17 = param5[var16_int];
                                              if (param3 == null) {
                                                stackOut_30_0 = var17.b();
                                                stackIn_31_0 = stackOut_30_0;
                                                break L17;
                                              } else {
                                                stackOut_29_0 = param3[var16_int];
                                                stackIn_31_0 = stackOut_29_0;
                                                break L17;
                                              }
                                            }
                                            L18: {
                                              L19: {
                                                var18 = stackIn_31_0;
                                                if (16777215 != (-16777216 & v.field_k ^ -1)) {
                                                  break L19;
                                                } else {
                                                  var17.a(param1, this.field_a.field_a + param8 - var18, 1, 0, 1);
                                                  if (var19 == 0) {
                                                    break L18;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              var17.a(param1, param8 - -this.field_a.field_a + -var18, 0, 16777215 | -16777216 & v.field_k, 1);
                                              break L18;
                                            }
                                            param1 = param1 + param5[var16_int].d();
                                            var11 = -1;
                                            decompiledRegionSelector0 = 0;
                                            break L16;
                                          }
                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                          decompiledCaughtException = decompiledCaughtParameter0;
                                          L20: {
                                            var16 = (Exception) (Object) decompiledCaughtException;
                                            if (var19 == 0) {
                                              decompiledRegionSelector0 = 0;
                                              break L20;
                                            } else {
                                              decompiledRegionSelector0 = 1;
                                              break L20;
                                            }
                                          }
                                        }
                                        if (decompiledRegionSelector0 == 0) {
                                          break L4;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    var14 = 8364;
                                    if (var19 == 0) {
                                      break L6;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var14 = 62;
                                break L6;
                              }
                            }
                          }
                          if (0 != (var10_int ^ -1)) {
                            break L4;
                          } else {
                            L21: {
                              if (-1 != var11) {
                                param1 = param1 + this.field_a.a(var11, -6773, (char) var14);
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            L22: {
                              L23: {
                                if (32 == var14) {
                                  break L23;
                                } else {
                                  L24: {
                                    if (param2 == null) {
                                      break L24;
                                    } else {
                                      L25: {
                                        if (-1 != (-16777216 & wqa.field_G ^ -1)) {
                                          this.a((char) var14, param1 - -1, 1 + param8, wqa.field_G, true, param2, param7, param4);
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      this.a((char) var14, param1, param8, v.field_k, false, param2, param7, param4);
                                      if (var19 == 0) {
                                        break L22;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  L26: {
                                    if ((wqa.field_G & -16777216 ^ -1) != -1) {
                                      this.fa((char) var14, param1 - -1, 1 + param8, wqa.field_G, true);
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  this.fa((char) var14, param1, param8, v.field_k, false);
                                  if (var19 == 0) {
                                    break L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              if (cka.field_ab <= 0) {
                                break L22;
                              } else {
                                moa.field_a = moa.field_a + cka.field_ab;
                                param1 = param1 + (moa.field_a >> 1059501480);
                                moa.field_a = moa.field_a & 255;
                                break L22;
                              }
                            }
                            L27: {
                              var15 = this.field_a.a(255, var14);
                              if (0 != (nt.field_b ^ -1)) {
                                this.field_b.a(1, var15, (int)((double)this.field_a.field_a * 0.7) + param8, param1, nt.field_b);
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            L28: {
                              if (0 == (moa.field_b ^ -1)) {
                                break L28;
                              } else {
                                this.field_b.a(1, var15, param8 + this.field_a.field_a + 1, param1, moa.field_b);
                                break L28;
                              }
                            }
                            param1 = param1 + var15;
                            var11 = var14;
                            break L4;
                          }
                        }
                        var13++;
                        if (var19 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                decompiledRegionSelector1 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L29: {
            var10 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) (var10);
            stackOut_64_1 = new StringBuilder().append("da.E(").append(param0).append(',').append(param1).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param2 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L29;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L29;
            }
          }
          L30: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param3 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L30;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L30;
            }
          }
          L31: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param4).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param5 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L31;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L31;
            }
          }
          L32: {
            stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param6 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L32;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L32;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(aa param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, String param9, byte param10, int param11, int param12, nh[] param13, int param14, int param15) {
        int var17_int = 0;
        RuntimeException var17 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            var17_int = -65 % ((24 - param10) / 47);
            stackOut_0_0 = this.a(param6, param14, param9, param3, param7, param0, param15, param13, param12, param11, param4, param1, -71, param2, 0, param5, param8);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var17 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var17);
            stackOut_2_1 = new StringBuilder().append("da.J(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param6 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param9 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param13 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param14 + ',' + param15 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, boolean param1, String param2, int param3, int param4, int param5) {
        if (!(param2 != null)) {
            return;
        }
        try {
            this.a(param4, param5, 125);
            this.a(param1, param3, (aa) null, (int[]) null, 0, (nh[]) null, param2, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "da.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5) {
        if (!(param2 != null)) {
            return;
        }
        try {
            if (param0 != 12199) {
                this.field_a = (qla) null;
            }
            this.a(param4, param3, 118);
            this.a(false, -this.field_a.a(param2, (byte) -102) + param5, (aa) null, (int[]) null, 0, (nh[]) null, param2, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "da.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    da(ha param0, qla param1) {
        try {
            this.field_a = param1;
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = false;
    }
}
