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
            this.a(false, param2 - ((da) this).field_a.a(param5, (byte) 107) / 2, (aa) null, (int[]) null, 0, (nh[]) null, param5, 0, param4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "da.I(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    abstract void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    private final void a(int param0, int param1, int param2) {
        nt.field_b = -1;
        if (param2 < 106) {
            ((da) this).field_a = null;
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

    private final void a(String param0) {
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (!param0.startsWith("col=")) {
                    if (param0.equals((Object) (Object) "/col")) {
                      v.field_k = 16777215 & lra.field_g | v.field_k & -16777216;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var5 = (CharSequence) (Object) param0.substring(4);
                    int discarded$5 = 16;
                    v.field_k = -16777216 & v.field_k | 16777215 & eba.a(var5, -105);
                    break L2;
                  }
                }
                L3: {
                  if (!param0.startsWith("argb=")) {
                    if (param0.equals((Object) (Object) "/argb")) {
                      v.field_k = lra.field_g;
                      break L3;
                    } else {
                      if (!param0.startsWith("str=")) {
                        if (param0.equals((Object) (Object) "str")) {
                          nt.field_b = 8388608 | -16777216 & v.field_k;
                          break L3;
                        } else {
                          if (param0.equals((Object) (Object) "/str")) {
                            nt.field_b = -1;
                            break L3;
                          } else {
                            if (param0.startsWith("u=")) {
                              var9 = (CharSequence) (Object) param0.substring(2);
                              int discarded$6 = 16;
                              moa.field_b = v.field_k & -16777216 | eba.a(var9, -65);
                              break L3;
                            } else {
                              if (param0.equals((Object) (Object) "u")) {
                                moa.field_b = -16777216 & v.field_k;
                                break L3;
                              } else {
                                if (!param0.equals((Object) (Object) "/u")) {
                                  if (!param0.equalsIgnoreCase("shad=-1")) {
                                    if (param0.startsWith("shad=")) {
                                      var8 = (CharSequence) (Object) param0.substring(5);
                                      int discarded$7 = 16;
                                      wqa.field_G = v.field_k & -16777216 | eba.a(var8, -52);
                                      break L3;
                                    } else {
                                      if (param0.equals((Object) (Object) "shad")) {
                                        wqa.field_G = -16777216 & v.field_k;
                                        break L3;
                                      } else {
                                        if (!param0.equals((Object) (Object) "/shad")) {
                                          if (param0.equals((Object) (Object) "br")) {
                                            this.a(lra.field_g, tta.field_G, 122);
                                            break L3;
                                          } else {
                                            break L3;
                                          }
                                        } else {
                                          wqa.field_G = tta.field_G;
                                          break L3;
                                        }
                                      }
                                    }
                                  } else {
                                    wqa.field_G = 0;
                                    break L3;
                                  }
                                } else {
                                  moa.field_b = -1;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var7 = (CharSequence) (Object) param0.substring(4);
                        int discarded$8 = 16;
                        nt.field_b = v.field_k & -16777216 | eba.a(var7, -45);
                        break L3;
                      }
                    }
                  } else {
                    var6 = (CharSequence) (Object) param0.substring(5);
                    int discarded$9 = 16;
                    v.field_k = eba.a(var6, -63);
                    break L3;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3_ref;
            stackOut_36_1 = new StringBuilder().append("da.D(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L5;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + 115 + 41);
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
        int stackIn_46_0 = 0;
        Object stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        Object stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        Object stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        Object stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        Object stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        Object stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        Object stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        Object stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        Object stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        Object stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_45_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        Object stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        Object stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        Object stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        Object stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        Object stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        Object stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        Object stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        Object stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        Object stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        Object stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        Object stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                this.a(param16, param15, 109);
                if (param13 == 0) {
                  param13 = ((da) this).field_a.field_a;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (param9 >= param13 + ((da) this).field_a.field_h - -((da) this).field_a.field_g) {
                    break L3;
                  } else {
                    if (param9 >= param13 + param13) {
                      break L3;
                    } else {
                      var18 = null;
                      break L2;
                    }
                  }
                }
                var18 = (Object) (Object) new int[]{param11};
                break L2;
              }
              L4: {
                var19 = ((da) this).field_a.a(param2, -127, ska.field_q, param7, (int[]) var18);
                if (param14 != -1) {
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
                if (param14 <= 0) {
                  break L5;
                } else {
                  if (var19 >= param14) {
                    ska.field_q[-1 + param14] = ((da) this).field_a.a(false, param7, ska.field_q[-1 + param14], param11);
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
                  if (var19 == 1) {
                    param6 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                var21 = 0;
                if (param6 == 0) {
                  var20 = param10 - -((da) this).field_a.field_h;
                  break L7;
                } else {
                  if (param6 == 1) {
                    var20 = ((da) this).field_a.field_h + (param10 + (-((var19 + -1) * param13) + -((da) this).field_a.field_g + (-((da) this).field_a.field_h + param9)) / 2);
                    break L7;
                  } else {
                    if (param6 == 2) {
                      var20 = -((-1 + var19) * param13) + (-((da) this).field_a.field_g + param10) - -param9;
                      break L7;
                    } else {
                      L8: {
                        var22 = (-(param13 * (var19 + -1)) + (param9 + -((da) this).field_a.field_h) - ((da) this).field_a.field_g) / (var19 + 1);
                        if (var22 < 0) {
                          var22 = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var20 = var22 + (((da) this).field_a.field_h + param10);
                      param13 = param13 + var22;
                      break L7;
                    }
                  }
                }
              }
              var22 = 0;
              L9: while (true) {
                if (~var22 <= ~var19) {
                  stackOut_45_0 = var19;
                  stackIn_46_0 = stackOut_45_0;
                  break L0;
                } else {
                  L10: {
                    if (param4 == 0) {
                      this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                      break L10;
                    } else {
                      if (param4 == 1) {
                        this.a(false, (param11 - ((da) this).field_a.a(ska.field_q[var22], (byte) -101)) / 2 + param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                        break L10;
                      } else {
                        if (param4 == 2) {
                          this.a(false, -((da) this).field_a.a(ska.field_q[var22], (byte) -116) + (param11 + param1), param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                          break L10;
                        } else {
                          if (~(var19 + -1) == ~var22) {
                            this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                            break L10;
                          } else {
                            this.a(true, param11, ska.field_q[var22]);
                            this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                            cka.field_ab = 0;
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  var20 = var20 + param13;
                  var22++;
                  continue L9;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var18 = (Object) (Object) decompiledCaughtException;
            stackOut_47_0 = var18;
            stackOut_47_1 = new StringBuilder().append("da.H(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_48_0 = stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L11;
            }
          }
          L12: {
            stackOut_50_0 = stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(44).append(param1).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param2 == null) {
              stackOut_52_0 = stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L12;
            } else {
              stackOut_51_0 = stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L12;
            }
          }
          L13: {
            stackOut_53_0 = stackIn_53_0;
            stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param5 == null) {
              stackOut_55_0 = stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L13;
            } else {
              stackOut_54_0 = stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L13;
            }
          }
          L14: {
            stackOut_56_0 = stackIn_56_0;
            stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(44).append(param6).append(44);
            stackIn_58_0 = stackOut_56_0;
            stackIn_58_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param7 == null) {
              stackOut_58_0 = stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L14;
            } else {
              stackOut_57_0 = stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_59_0 = stackOut_57_0;
              stackIn_59_1 = stackOut_57_1;
              stackIn_59_2 = stackOut_57_2;
              break L14;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + -71 + 44 + param13 + 44 + param14 + 44 + param15 + 44 + param16 + 41);
        }
        return stackIn_46_0;
    }

    private final void a(boolean param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (param2.length() <= var6) {
                L2: {
                  if (var4_int > 0) {
                    cka.field_ab = (param1 + -((da) this).field_a.a(param2, (byte) -121) << 8) / var4_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var7 = param2.charAt(var6);
                  if (var7 != 60) {
                    if (var7 != 62) {
                      if (var5 != 0) {
                        break L3;
                      } else {
                        if (32 != var7) {
                          break L3;
                        } else {
                          var4_int++;
                          break L3;
                        }
                      }
                    } else {
                      var5 = 0;
                      break L3;
                    }
                  } else {
                    var5 = 1;
                    break L3;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("da.G(").append(1).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    private final void a(boolean param0, int param1, aa param2, int[] param3, int param4, nh[] param5, String param6, int param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15_ref_String = null;
        int var15 = 0;
        Exception var16 = null;
        int var16_int = 0;
        nh var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
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
        Throwable decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
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
        var20 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param8 = param8 - ((da) this).field_a.field_a;
            var10_int = -1;
            if (!param0) {
              var11 = -1;
              var12 = param6.length();
              var13 = 0;
              L1: while (true) {
                if (~var12 >= ~var13) {
                  break L0;
                } else {
                  L2: {
                    var14 = (char)(io.a(-377, param6.charAt(var13)) & 255);
                    if (var14 == 60) {
                      var10_int = var13;
                      break L2;
                    } else {
                      L3: {
                        if (var14 != 62) {
                          break L3;
                        } else {
                          if (var10_int == -1) {
                            break L3;
                          } else {
                            var15_ref_String = param6.substring(1 + var10_int, var13);
                            var10_int = -1;
                            if (!var15_ref_String.equals((Object) (Object) "lt")) {
                              if (var15_ref_String.equals((Object) (Object) "gt")) {
                                var14 = 62;
                                break L3;
                              } else {
                                if (!var15_ref_String.equals((Object) (Object) "nbsp")) {
                                  if (!var15_ref_String.equals((Object) (Object) "shy")) {
                                    if (!var15_ref_String.equals((Object) (Object) "times")) {
                                      if (var15_ref_String.equals((Object) (Object) "euro")) {
                                        var14 = 8364;
                                        break L3;
                                      } else {
                                        if (!var15_ref_String.equals((Object) (Object) "copy")) {
                                          if (!var15_ref_String.equals((Object) (Object) "reg")) {
                                            if (var15_ref_String.startsWith("img=")) {
                                              try {
                                                L4: {
                                                  L5: {
                                                    var21 = (CharSequence) (Object) var15_ref_String.substring(4);
                                                    int discarded$2 = 70;
                                                    var16_int = jb.a(var21);
                                                    var17 = param5[var16_int];
                                                    if (param3 == null) {
                                                      stackOut_28_0 = var17.b();
                                                      stackIn_29_0 = stackOut_28_0;
                                                      break L5;
                                                    } else {
                                                      stackOut_27_0 = param3[var16_int];
                                                      stackIn_29_0 = stackOut_27_0;
                                                      break L5;
                                                    }
                                                  }
                                                  L6: {
                                                    var18 = stackIn_29_0;
                                                    if ((-16777216 & v.field_k) != -16777216) {
                                                      var17.a(param1, param8 - -((da) this).field_a.field_a + -var18, 0, 16777215 | -16777216 & v.field_k, 1);
                                                      break L6;
                                                    } else {
                                                      var17.a(param1, ((da) this).field_a.field_a + param8 - var18, 1, 0, 1);
                                                      break L6;
                                                    }
                                                  }
                                                  param1 = param1 + param5[var16_int].d();
                                                  var11 = -1;
                                                  break L4;
                                                }
                                              } catch (java.lang.Exception decompiledCaughtParameter0) {
                                                decompiledCaughtException = decompiledCaughtParameter0;
                                                L7: {
                                                  var16 = (Exception) (Object) decompiledCaughtException;
                                                  break L7;
                                                }
                                              }
                                              break L2;
                                            } else {
                                              int discarded$3 = 115;
                                              this.a(var15_ref_String);
                                              break L2;
                                            }
                                          } else {
                                            var14 = 174;
                                            break L3;
                                          }
                                        } else {
                                          var14 = 169;
                                          break L3;
                                        }
                                      }
                                    } else {
                                      var14 = 215;
                                      break L3;
                                    }
                                  } else {
                                    var14 = 173;
                                    break L3;
                                  }
                                } else {
                                  var14 = 160;
                                  break L3;
                                }
                              }
                            } else {
                              var14 = 60;
                              break L3;
                            }
                          }
                        }
                      }
                      if (var10_int != -1) {
                        break L2;
                      } else {
                        L8: {
                          if (-1 != var11) {
                            param1 = param1 + ((da) this).field_a.a(var11, -6773, (char) var14);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (32 == var14) {
                            if (cka.field_ab <= 0) {
                              break L9;
                            } else {
                              moa.field_a = moa.field_a + cka.field_ab;
                              param1 = param1 + (moa.field_a >> 8);
                              moa.field_a = moa.field_a & 255;
                              break L9;
                            }
                          } else {
                            if (param2 == null) {
                              L10: {
                                if ((wqa.field_G & -16777216) != 0) {
                                  ((da) this).fa((char) var14, param1 - -1, 1 + param8, wqa.field_G, true);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              ((da) this).fa((char) var14, param1, param8, v.field_k, false);
                              break L9;
                            } else {
                              L11: {
                                if ((-16777216 & wqa.field_G) != 0) {
                                  ((da) this).a((char) var14, param1 - -1, 1 + param8, wqa.field_G, true, param2, param7, param4);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              ((da) this).a((char) var14, param1, param8, v.field_k, false, param2, param7, param4);
                              break L9;
                            }
                          }
                        }
                        L12: {
                          var15 = ((da) this).field_a.a(255, var14);
                          if (nt.field_b != -1) {
                            ((da) this).field_b.a(1, var15, (int)((double)((da) this).field_a.field_a * 0.7) + param8, param1, nt.field_b);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (moa.field_b == -1) {
                            break L13;
                          } else {
                            ((da) this).field_b.a(1, var15, param8 + ((da) this).field_a.field_a + 1, param1, moa.field_b);
                            break L13;
                          }
                        }
                        param1 = param1 + var15;
                        var11 = var14;
                        break L2;
                      }
                    }
                  }
                  var13++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var10 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var10;
            stackOut_61_1 = new StringBuilder().append("da.E(").append(param0).append(44).append(param1).append(44);
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param2 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L14;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L14;
            }
          }
          L15: {
            stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(44);
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param3 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L15;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L15;
            }
          }
          L16: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(44).append(param4).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param5 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L16;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L16;
            }
          }
          L17: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param6 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L17;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L17;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 44 + param7 + 44 + param8 + 41);
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
            stackOut_2_0 = (RuntimeException) var17;
            stackOut_2_1 = new StringBuilder().append("da.J(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param6 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param9 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param10).append(44).append(param11).append(44).append(param12).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param13 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param14 + 44 + param15 + 41);
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
            throw tba.a((Throwable) (Object) runtimeException, "da.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5) {
        if (!(param2 != null)) {
            return;
        }
        try {
            if (param0 != 12199) {
                ((da) this).field_a = null;
            }
            this.a(param4, param3, 118);
            this.a(false, -((da) this).field_a.a(param2, (byte) -102) + param5, (aa) null, (int[]) null, 0, (nh[]) null, param2, 0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "da.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    da(ha param0, qla param1) {
        try {
            ((da) this).field_a = param1;
            ((da) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "da.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
    }
}
