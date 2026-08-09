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
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (!param0.startsWith("col=")) {
                    if (param0.equals("/col")) {
                      v.field_k = 16777215 & lra.field_g | v.field_k & -16777216;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var5 = (CharSequence) ((Object) param0.substring(4));
                    v.field_k = -16777216 & v.field_k | 16777215 & eba.a(var5, -105, 16);
                    break L2;
                  }
                }
                L3: {
                  if (!param0.startsWith("argb=")) {
                    if (param0.equals("/argb")) {
                      v.field_k = lra.field_g;
                      break L3;
                    } else {
                      if (!param0.startsWith("str=")) {
                        if (param0.equals("str")) {
                          nt.field_b = 8388608 | -16777216 & v.field_k;
                          break L3;
                        } else {
                          if (param0.equals("/str")) {
                            nt.field_b = -1;
                            break L3;
                          } else {
                            if (param0.startsWith("u=")) {
                              var9 = (CharSequence) ((Object) param0.substring(2));
                              moa.field_b = v.field_k & -16777216 | eba.a(var9, -65, 16);
                              break L3;
                            } else {
                              if (param0.equals("u")) {
                                moa.field_b = -16777216 & v.field_k;
                                break L3;
                              } else {
                                if (!param0.equals("/u")) {
                                  if (!param0.equalsIgnoreCase("shad=-1")) {
                                    if (param0.startsWith("shad=")) {
                                      var8 = (CharSequence) ((Object) param0.substring(5));
                                      wqa.field_G = v.field_k & -16777216 | eba.a(var8, -52, 16);
                                      break L3;
                                    } else {
                                      if (param0.equals("shad")) {
                                        wqa.field_G = -16777216 & v.field_k;
                                        break L3;
                                      } else {
                                        if (!param0.equals("/shad")) {
                                          if (param0.equals("br")) {
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
                        var7 = (CharSequence) ((Object) param0.substring(4));
                        nt.field_b = v.field_k & -16777216 | eba.a(var7, -45, 16);
                        break L3;
                      }
                    }
                  } else {
                    var6 = (CharSequence) ((Object) param0.substring(5));
                    v.field_k = eba.a(var6, -63, 16);
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
            L5: {
              if (param1 > 108) {
                break L5;
              } else {
                this.field_a = (qla) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3_ref);

            stackIn_40_1 = new StringBuilder().append("da.D(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L6;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ')');
        }
    }

    private final int a(int[] param0, int param1, String param2, int param3, int param4, aa param5, int param6, nh[] param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int stackIn_3_0 = 0;
        int stackIn_46_0 = 0;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_55_1 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_58_1 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 != null) {
              L1: {
                this.a(param16, param15, 109);
                if (param13 == 0) {
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
                      break L2;
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
                var21 = 61 % ((-4 - param12) / 59);
                if (param6 == 0) {
                  var20 = param10 - -this.field_a.field_h;
                  break L7;
                } else {
                  if (-2 == (param6 ^ -1)) {
                    var20 = this.field_a.field_h + (param10 + (-((var19 + -1) * param13) + -this.field_a.field_g + (-this.field_a.field_h + param9)) / 2);
                    break L7;
                  } else {
                    if ((param6 ^ -1) == -3) {
                      var20 = -((-1 + var19) * param13) + (-this.field_a.field_g + param10) - -param9;
                      break L7;
                    } else {
                      L8: {
                        var22 = (-(param13 * (var19 + -1)) + (param9 + -this.field_a.field_h) - this.field_a.field_g) / (var19 + 1);
                        if (-1 < (var22 ^ -1)) {
                          var22 = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var20 = var22 + (this.field_a.field_h + param10);
                      param13 = param13 + var22;
                      break L7;
                    }
                  }
                }
              }
              var22 = 0;
              L9: while (true) {
                if (var22 >= var19) {
                  stackIn_46_0 = var19;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L10: {
                    if (param4 == 0) {
                      this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                      break L10;
                    } else {
                      if ((param4 ^ -1) == -2) {
                        this.a(false, (param11 - this.field_a.a(ska.field_q[var22], (byte) -101)) / 2 + param1, param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                        break L10;
                      } else {
                        if (-3 == (param4 ^ -1)) {
                          this.a(false, -this.field_a.a(ska.field_q[var22], (byte) -116) + (param11 + param1), param5, param0, param3, param7, ska.field_q[var22], param8, var20);
                          break L10;
                        } else {
                          if (var19 + -1 == var22) {
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
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var18 = decompiledCaughtException;
            stackIn_49_0 = var18;

            stackIn_49_1 = new StringBuilder().append("da.H(");

            if (param0 == null) {
              stackIn_50_0 = stackIn_49_0;
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L11;
            } else {
              stackIn_50_0 = stackIn_49_0;
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param1).append(',');

            if (param2 == null) {

              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L12;
            } else {

              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_55_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {

              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L13;
            } else {

              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_58_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',').append(param6).append(',');

            if (param7 == null) {

              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L14;
            } else {

              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_50_0), stackIn_59_2 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_46_0;
        }
    }

    private final void a(boolean param0, int param1, String param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (param2.length() <= var6) {
                L2: {
                  if ((var4_int ^ -1) < -1) {
                    cka.field_ab = (param1 + -this.field_a.a(param2, (byte) -121) << -2020511736) / var4_int;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param0) {
                    break L3;
                  } else {
                    this.field_a = (qla) null;
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var7 = param2.charAt(var6);
                  if ((var7 ^ -1) != -61) {
                    if (var7 != 62) {
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
                    } else {
                      var5 = 0;
                      break L4;
                    }
                  } else {
                    var5 = 1;
                    break L4;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("da.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    private final void a(boolean param0, int param1, aa param2, int[] param3, int param4, nh[] param5, String param6, int param7, int param8) {
        int stackIn_29_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15_ref_String = null;
        int var15 = 0;
        int var16_int = 0;
        Exception var16 = null;
        nh var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
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
                if (var12 <= var13) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var14 = (char)(io.a(-377, param6.charAt(var13)) & 255);
                    if ((var14 ^ -1) == -61) {
                      var10_int = var13;
                      break L2;
                    } else {
                      L3: {
                        if ((var14 ^ -1) != -63) {
                          break L3;
                        } else {
                          if (0 == (var10_int ^ -1)) {
                            break L3;
                          } else {
                            var15_ref_String = param6.substring(1 + var10_int, var13);
                            var10_int = -1;
                            if (!var15_ref_String.equals("lt")) {
                              if (var15_ref_String.equals("gt")) {
                                var14 = 62;
                                break L3;
                              } else {
                                if (!var15_ref_String.equals("nbsp")) {
                                  if (!var15_ref_String.equals("shy")) {
                                    if (!var15_ref_String.equals("times")) {
                                      if (var15_ref_String.equals("euro")) {
                                        var14 = 8364;
                                        break L3;
                                      } else {
                                        if (!var15_ref_String.equals("copy")) {
                                          if (!var15_ref_String.equals("reg")) {
                                            if (var15_ref_String.startsWith("img=")) {
                                              try {
                                                L4: {
                                                  L5: {
                                                    var21 = (CharSequence) ((Object) var15_ref_String.substring(4));
                                                    var16_int = jb.a(var21, (byte) 70);
                                                    var17 = param5[var16_int];
                                                    if (param3 == null) {
                                                      stackIn_29_0 = var17.b();
                                                      break L5;
                                                    } else {
                                                      stackIn_29_0 = param3[var16_int];
                                                      break L5;
                                                    }
                                                  }
                                                  L6: {
                                                    var18 = stackIn_29_0;
                                                    if (16777215 != (-16777216 & v.field_k ^ -1)) {
                                                      var17.a(param1, param8 - -this.field_a.field_a + -var18, 0, 16777215 | -16777216 & v.field_k, 1);
                                                      break L6;
                                                    } else {
                                                      var17.a(param1, this.field_a.field_a + param8 - var18, 1, 0, 1);
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
                                              this.a(var15_ref_String, 115);
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
                      if (0 == (var10_int ^ -1)) {
                        L8: {
                          if (-1 != var11) {
                            param1 = param1 + this.field_a.a(var11, -6773, (char) var14);
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
                              param1 = param1 + (moa.field_a >> 1059501480);
                              moa.field_a = moa.field_a & 255;
                              break L9;
                            }
                          } else {
                            if (param2 == null) {
                              L10: {
                                if ((wqa.field_G & -16777216) != 0) {
                                  this.fa((char) var14, param1 - -1, 1 + param8, wqa.field_G, true);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              this.fa((char) var14, param1, param8, v.field_k, false);
                              break L9;
                            } else {
                              L11: {
                                if (-1 != (-16777216 & wqa.field_G ^ -1)) {
                                  this.a((char) var14, param1 - -1, 1 + param8, wqa.field_G, true, param2, param7, param4);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              this.a((char) var14, param1, param8, v.field_k, false, param2, param7, param4);
                              break L9;
                            }
                          }
                        }
                        L12: {
                          var15 = this.field_a.a(255, var14);
                          if (0 != (nt.field_b ^ -1)) {
                            this.field_b.a(1, var15, (int)((double)this.field_a.field_a * 0.7) + param8, param1, nt.field_b);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (0 == (moa.field_b ^ -1)) {
                            break L13;
                          } else {
                            this.field_b.a(1, var15, param8 + this.field_a.field_a + 1, param1, moa.field_b);
                            break L13;
                          }
                        }
                        param1 = param1 + var15;
                        var11 = var14;
                        break L2;
                      } else {
                        var13++;
                        continue L1;
                      }
                    }
                  }
                  var13++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var10 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_64_0 = (RuntimeException) (var10);

            stackIn_64_1 = new StringBuilder().append("da.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L14;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_67_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');

            if (param3 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L15;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L16;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param6 == null) {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L17;
            } else {
              stackIn_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L17;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_65_0), stackIn_74_2 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(aa param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, String param9, byte param10, int param11, int param12, nh[] param13, int param14, int param15) {
        int var17_int = 0;
        RuntimeException var17 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var17_int = -65 % ((24 - param10) / 47);
            stackIn_1_0 = this.a(param6, param14, param9, param3, param7, param0, param15, param13, param12, param11, param4, param1, -71, param2, 0, param5, param8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var17 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var17);

            stackIn_4_1 = new StringBuilder().append("da.J(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ',' + param14 + ',' + param15 + ')');
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
