/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    private ta field_b;
    private ha field_a;

    final void a(int param0, int param1, int param2, String param3, byte param4, int param5) {
        if (param4 > -7) {
            return;
        }
        if (!(param3 != null)) {
            return;
        }
        try {
            this.a(param2, param5, 60);
            this.a(-274, param0, (hr[]) null, param1, 0, 0, param3, (int[]) null, (aa) null);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "da.I(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4, int[] param5, hr[] param6, int param7, int param8, int param9, int param10, int param11, String param12, aa param13, int param14, int param15) {
        RuntimeException var17 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param11 == -8787) {
                break L1;
              } else {
                this.field_a = (ha) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param13, param6, param2, param5, param12, param0, param1, param10, 0, param8, param4, param3, param14, param9, 92, param15, param7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var17);

            stackIn_6_1 = new StringBuilder().append("da.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param13 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ',' + param14 + ',' + param15 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5) {
        if (param2 == null) {
            return;
        }
        try {
            if (param5 < 40) {
                this.field_a = (ha) null;
            }
            this.a(param4, param0, 60);
            this.a(-274, param3, (hr[]) null, -this.field_b.a(param2, 0) + param1, 0, 0, param2, (int[]) null, (aa) null);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "da.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(String param0, int param1) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Exception var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        CharSequence var10 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = -2 / ((param1 - 31) / 40);
            try {
              L1: {
                L2: {
                  if (param0.startsWith("col=")) {
                    var6 = (CharSequence) ((Object) param0.substring(4));
                    mn.field_i = mn.field_i & -16777216 | 16777215 & ea.a((byte) -73, var6, 16);
                    break L2;
                  } else {
                    if (!param0.equals("/col")) {
                      break L2;
                    } else {
                      mn.field_i = 16777215 & fs.field_l | -16777216 & mn.field_i;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (!param0.startsWith("argb=")) {
                    if (!param0.equals("/argb")) {
                      if (!param0.startsWith("str=")) {
                        if (!param0.equals("str")) {
                          if (!param0.equals("/str")) {
                            if (!param0.startsWith("u=")) {
                              if (!param0.equals("u")) {
                                if (!param0.equals("/u")) {
                                  if (param0.equalsIgnoreCase("shad=-1")) {
                                    jj.field_b = 0;
                                    break L3;
                                  } else {
                                    if (param0.startsWith("shad=")) {
                                      var10 = (CharSequence) ((Object) param0.substring(5));
                                      jj.field_b = mn.field_i & -16777216 | ea.a((byte) -73, var10, 16);
                                      break L3;
                                    } else {
                                      if (!param0.equals("shad")) {
                                        if (!param0.equals("/shad")) {
                                          if (!param0.equals("br")) {
                                            break L3;
                                          } else {
                                            this.a(fs.field_l, jv.field_b, 60);
                                            break L3;
                                          }
                                        } else {
                                          jj.field_b = jv.field_b;
                                          break L3;
                                        }
                                      } else {
                                        jj.field_b = mn.field_i & -16777216;
                                        break L3;
                                      }
                                    }
                                  }
                                } else {
                                  fl.field_p = -1;
                                  break L3;
                                }
                              } else {
                                fl.field_p = -16777216 & mn.field_i;
                                break L3;
                              }
                            } else {
                              var9 = (CharSequence) ((Object) param0.substring(2));
                              fl.field_p = -16777216 & mn.field_i | ea.a((byte) -73, var9, 16);
                              break L3;
                            }
                          } else {
                            vo.field_I = -1;
                            break L3;
                          }
                        } else {
                          vo.field_I = 8388608 | -16777216 & mn.field_i;
                          break L3;
                        }
                      } else {
                        var8 = (CharSequence) ((Object) param0.substring(4));
                        vo.field_I = -16777216 & mn.field_i | ea.a((byte) -73, var8, 16);
                        break L3;
                      }
                    } else {
                      mn.field_i = fs.field_l;
                      break L3;
                    }
                  } else {
                    var7 = (CharSequence) ((Object) param0.substring(5));
                    mn.field_i = ea.a((byte) -73, var7, 16);
                    break L3;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var4 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("da.L(");

            if (param0 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L5;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
        }
    }

    private final int a(aa param0, hr[] param1, int param2, int[] param3, String param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int stackIn_4_0 = 0;
        int stackIn_47_0 = 0;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        Object stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        StringBuilder stackIn_59_1 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        aa var23 = null;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param4 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.a(param6, param9, 60);
                if (param7 == 0) {
                  param7 = this.field_b.field_d;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (param7 + this.field_b.field_c + this.field_b.field_i <= param5) {
                    break L3;
                  } else {
                    if (param5 < param7 - -param7) {
                      var18 = null;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var18 = new int[]{param11};
                break L2;
              }
              L4: {
                if (0 != (param8 ^ -1)) {
                  break L4;
                } else {
                  param8 = param5 / param7;
                  if ((param8 ^ -1) >= -1) {
                    param8 = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                var19 = this.field_b.a(param4, false, hu.field_a, (int[]) (var18), param1);
                if (-1 <= (param8 ^ -1)) {
                  break L5;
                } else {
                  if (var19 < param8) {
                    break L5;
                  } else {
                    var19 = param8;
                    hu.field_a[-1 + param8] = this.field_b.a(param11, hu.field_a[param8 - 1], param1, -63);
                    break L5;
                  }
                }
              }
              L6: {
                if (param15 != 3) {
                  break L6;
                } else {
                  if ((var19 ^ -1) != -2) {
                    break L6;
                  } else {
                    param15 = 1;
                    break L6;
                  }
                }
              }
              L7: {
                if (param14 >= 38) {
                  break L7;
                } else {
                  var23 = (aa) null;
                  this.a(98, 62, (hr[]) null, 36, 116, -67, (String) null, (int[]) null, (aa) null);
                  break L7;
                }
              }
              L8: {
                if (0 == param15) {
                  var20 = param16 + this.field_b.field_i;
                  break L8;
                } else {
                  if (1 == param15) {
                    var20 = this.field_b.field_i + (param16 + (-((var19 - 1) * param7) + -this.field_b.field_c + param5 + -this.field_b.field_i) / 2);
                    break L8;
                  } else {
                    if (-3 != (param15 ^ -1)) {
                      L9: {
                        var21 = (-this.field_b.field_c + (param5 - (this.field_b.field_i - -(param7 * (-1 + var19))))) / (1 + var19);
                        if (-1 >= (var21 ^ -1)) {
                          break L9;
                        } else {
                          var21 = 0;
                          break L9;
                        }
                      }
                      param7 = param7 + var21;
                      var20 = param16 + (this.field_b.field_i + var21);
                      break L8;
                    } else {
                      var20 = -((var19 + -1) * param7) + -this.field_b.field_c + param5 + param16;
                      break L8;
                    }
                  }
                }
              }
              var21 = 0;
              L10: while (true) {
                if (var21 >= var19) {
                  stackIn_47_0 = var19;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L11: {
                    if (-1 != (param12 ^ -1)) {
                      if (param12 == 1) {
                        this.a(-274, var20, param1, param10 - -((-this.field_b.a(hu.field_a[var21], 0) + param11) / 2), param2, param13, hu.field_a[var21], param3, param0);
                        break L11;
                      } else {
                        if ((param12 ^ -1) != -3) {
                          if (var19 + -1 == var21) {
                            this.a(-274, var20, param1, param10, param2, param13, hu.field_a[var21], param3, param0);
                            break L11;
                          } else {
                            this.a(hu.field_a[var21], param11, (byte) 5);
                            this.a(-274, var20, param1, param10, param2, param13, hu.field_a[var21], param3, param0);
                            lb.field_b = 0;
                            break L11;
                          }
                        } else {
                          this.a(-274, var20, param1, param11 + (param10 - this.field_b.a(hu.field_a[var21], 0)), param2, param13, hu.field_a[var21], param3, param0);
                          break L11;
                        }
                      }
                    } else {
                      this.a(-274, var20, param1, param10, param2, param13, hu.field_a[var21], param3, param0);
                      break L11;
                    }
                  }
                  var20 = var20 + param7;
                  var21++;
                  continue L10;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var18 = decompiledCaughtException;
            stackIn_50_0 = var18;

            stackIn_50_1 = new StringBuilder().append("da.H(");

            if (param0 == null) {
              stackIn_51_0 = stackIn_50_0;
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L12;
            } else {
              stackIn_51_0 = stackIn_50_0;
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');

            if (param1 == null) {

              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L13;
            } else {

              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_56_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',').append(param2).append(',');

            if (param3 == null) {

              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L14;
            } else {

              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_59_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_57_2).append(',');

            if (param4 == null) {

              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L15;
            } else {

              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L15;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_51_0), stackIn_60_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_47_0;
        }
    }

    private final void a(int param0, int param1, hr[] param2, int param3, int param4, int param5, String param6, int[] param7, aa param8) {
        int stackIn_25_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_65_1 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
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
        hr var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
        var20 = null;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            param1 = param1 - this.field_b.field_d;
            var10_int = -1;
            var11 = -1;
            var12 = param6.length();
            if (param0 == -274) {
              var13 = 0;
              L1: while (true) {
                if (var13 >= var12) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var14 = (char)(255 & uo.a(true, param6.charAt(var13)));
                    if (60 != var14) {
                      L3: {
                        if (62 != var14) {
                          break L3;
                        } else {
                          if ((var10_int ^ -1) == 0) {
                            break L3;
                          } else {
                            var15_ref_String = param6.substring(var10_int + 1, var13);
                            var10_int = -1;
                            if (var15_ref_String.equals("lt")) {
                              var14 = 60;
                              break L3;
                            } else {
                              if (var15_ref_String.equals("gt")) {
                                var14 = 62;
                                break L3;
                              } else {
                                if (!var15_ref_String.equals("nbsp")) {
                                  if (var15_ref_String.equals("shy")) {
                                    var14 = 173;
                                    break L3;
                                  } else {
                                    if (!var15_ref_String.equals("times")) {
                                      if (var15_ref_String.equals("euro")) {
                                        var14 = 8364;
                                        break L3;
                                      } else {
                                        if (var15_ref_String.equals("copy")) {
                                          var14 = 169;
                                          break L3;
                                        } else {
                                          if (!var15_ref_String.equals("reg")) {
                                            if (!var15_ref_String.startsWith("img=")) {
                                              this.a(var15_ref_String, 120);
                                              break L2;
                                            } else {
                                              try {
                                                L4: {
                                                  L5: {
                                                    var21 = (CharSequence) ((Object) var15_ref_String.substring(4));
                                                    var16_int = no.a((byte) -127, var21);
                                                    var17 = param2[var16_int];
                                                    if (param7 != null) {
                                                      stackIn_25_0 = param7[var16_int];
                                                      break L5;
                                                    } else {
                                                      stackIn_25_0 = var17.d();
                                                      break L5;
                                                    }
                                                  }
                                                  L6: {
                                                    var18 = stackIn_25_0;
                                                    if (16777215 != (-16777216 & mn.field_i ^ -1)) {
                                                      var17.a(param3, -var18 + this.field_b.field_d + param1, 0, mn.field_i & -16777216 | 16777215, 1);
                                                      break L6;
                                                    } else {
                                                      var17.a(param3, -var18 + (param1 + this.field_b.field_d), 1, 0, 1);
                                                      break L6;
                                                    }
                                                  }
                                                  var11 = -1;
                                                  param3 = param3 + param2[var16_int].b();
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
                                            }
                                          } else {
                                            var14 = 174;
                                            break L3;
                                          }
                                        }
                                      }
                                    } else {
                                      var14 = 215;
                                      break L3;
                                    }
                                  }
                                } else {
                                  var14 = 160;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (var10_int == -1) {
                        L8: {
                          if ((var11 ^ -1) == 0) {
                            break L8;
                          } else {
                            param3 = param3 + this.field_b.a(-63, (char) var14, var11);
                            break L8;
                          }
                        }
                        L9: {
                          if (var14 != 32) {
                            if (param8 == null) {
                              L10: {
                                if ((-16777216 & jj.field_b) == 0) {
                                  break L10;
                                } else {
                                  this.fa((char) var14, param3 + 1, param1 + 1, jj.field_b, true);
                                  break L10;
                                }
                              }
                              this.fa((char) var14, param3, param1, mn.field_i, false);
                              break L9;
                            } else {
                              L11: {
                                if ((-16777216 & jj.field_b) == 0) {
                                  break L11;
                                } else {
                                  this.a((char) var14, param3 + 1, param1 - -1, jj.field_b, true, param8, param4, param5);
                                  break L11;
                                }
                              }
                              this.a((char) var14, param3, param1, mn.field_i, false, param8, param4, param5);
                              break L9;
                            }
                          } else {
                            if ((lb.field_b ^ -1) >= -1) {
                              break L9;
                            } else {
                              sb.field_a = sb.field_a + lb.field_b;
                              param3 = param3 + (sb.field_a >> 1186509064);
                              sb.field_a = sb.field_a & 255;
                              break L9;
                            }
                          }
                        }
                        L12: {
                          var15 = this.field_b.a(var14, (byte) -53);
                          if (-1 != vo.field_I) {
                            this.field_a.a(vo.field_I, 103, param1 - -(int)(0.7 * (double)this.field_b.field_d), var15, param3);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if ((fl.field_p ^ -1) != 0) {
                            this.field_a.a(fl.field_p, 122, this.field_b.field_d + param1 - -1, var15, param3);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        var11 = var14;
                        param3 = param3 + var15;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var10_int = var13;
                      break L2;
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
            stackIn_62_0 = (RuntimeException) (var10);

            stackIn_62_1 = new StringBuilder().append("da.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L14;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_65_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L15;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_68_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',');

            if (param7 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L16;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_71_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');

            if (param8 == null) {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L17;
            } else {
              stackIn_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L17;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_63_0), stackIn_72_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(ki param0, ki param1, int param2, ki param3) {
        ne[] var14 = null;
        int var11_int = 0;
        wb var15 = null;
        wb var18 = null;
        wb var11 = null;
        wb var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Sumoblitz.field_L ? 1 : 0;
        li.field_v = kb.a("frame_top", param0, true, "commonui");
        hd.field_O = kb.a("frame_bottom", param0, true, "commonui");
        ar.field_E = jb.a("commonui", "jagex_logo_grey", -104, param0);
        jp.field_j = kb.a("button", param0, true, "commonui");
        fw.field_m = ub.a(param0, "commonui", (byte) -56, "validation");
        jm.field_a = (vn) ((Object) vf.a(param1, true, "commonui", "arezzo12", param0));
        kw.field_b = (vn) ((Object) vf.a(param1, true, "commonui", "arezzo14", param0));
        tq.field_a = (vn) ((Object) vf.a(param1, true, "commonui", "arezzo14bold", param0));
        wb var17 = new wb(param3.a("", "button.gif", -1), (java.awt.Component) ((Object) qn.field_f));
        mc.a((byte) 83, param0, "dropdown", "commonui");
        ne[] var5 = rq.a("screen_options", param0, 73, "commonui");
        sb.field_d = new ne[4];
        sm.field_c = new ne[4];
        kn.field_f = new ne[4];
        ne[][] var6 = new ne[][]{sb.field_d, kn.field_f, sm.field_c};
        int[][] var19 = new int[4][];
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_i;
        for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
        }
        var8 = var5[0].field_h[0];
        var19[2][var8] = 16777215;
        var19[1][var8] = 2394342;
        var19[3][var8] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
            var14 = var6[var9];
            ne[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = jk.a(var19[var11_int], var5[var9], -105);
            }
        }
        var9 = var17.field_u;
        if (param2 != 17474) {
            return;
        }
        try {
            kc.j(70);
            var17.d();
            lk.g(0, 0, lk.field_b, lk.field_c);
            var15 = new wb(var9, var9);
            var18 = var15;
            var18.d();
            var17.c(0, 0);
            var11 = new wb(var9, var9);
            var11.d();
            var17.c(var9 + -var17.field_x, 0);
            var12 = new wb(-(2 * var9) + var17.field_x, var9);
            var12.d();
            var17.c(-var9, 0);
            su.a((byte) -73);
            jp.field_j = new wb[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "da.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void fa(char param0, int param1, int param2, int param3, boolean param4);

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        try {
            this.a(param1, param2, 60);
            this.a(-274, param3, (hr[]) null, -(this.field_b.a(param0, param5) / 2) + param4, 0, 0, param0, (int[]) null, (aa) null);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "da.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        lb.field_b = 0;
        fs.field_l = param0;
        mn.field_i = param0;
        if ((param1 ^ -1) == 0) {
            param1 = 0;
        }
        vo.field_I = -1;
        sb.field_a = 0;
        if (param2 != 60) {
            this.field_b = (ta) null;
        }
        fl.field_p = -1;
        jv.field_b = param1;
        jj.field_b = param1;
    }

    da(ha param0, ta param1) {
        try {
            this.field_b = param1;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(cd param0, int param1, cd param2) {
        RuntimeException var3 = null;
        ki var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.field_a > param2.field_a) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 <= -11) {
                  break L1;
                } else {
                  var4 = (ki) null;
                  da.a((ki) null, (ki) null, 47, (ki) null);
                  break L1;
                }
              }
              if (param0.field_a != param2.field_a) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (param2.field_g < param0.field_g) {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("da.J(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    abstract void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    private final void a(String param0, int param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (param0.length() <= var6) {
                L2: {
                  if (-1 <= (var4_int ^ -1)) {
                    break L2;
                  } else {
                    lb.field_b = (param1 - this.field_b.a(param0, 0) << 194521768) / var4_int;
                    break L2;
                  }
                }
                L3: {
                  if (param2 == 5) {
                    break L3;
                  } else {
                    var9 = (String) null;
                    this.a(-80, -66, 46, (String) null, (byte) 127, -75);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var7 = param0.charAt(var6);
                  if (60 == var7) {
                    var5 = 1;
                    break L4;
                  } else {
                    if (62 == var7) {
                      var5 = 0;
                      break L4;
                    } else {
                      if (var5 == 0) {
                        if (32 == var7) {
                          var4_int++;
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
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
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("da.F(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
