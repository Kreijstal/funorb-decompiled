/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    private ha field_d;
    static int[] field_b;
    private vs field_c;
    static tk field_a;

    final int a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8, pa[] param9, aa param10, int param11, int[] param12, int param13, int param14, String param15) {
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
              if (param3) {
                break L1;
              } else {
                this.field_d = (ha) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param14, param4, 0, param10, param11, param2, param15, param13, param5, param6, param0, param7, param9, -2, param12, param1, param8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var17);

            stackIn_6_1 = new StringBuilder().append("da.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
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

            if (param10 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param11).append(',');

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


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param13).append(',').append(param14).append(',');

            if (param15 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final static gk a(int param0, int param1) {
        gk stackIn_6_0 = null;
        L0: {
          if (param1 == 1) {
            break L0;
          } else {
            field_b = (int[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null != oi.field_d) {
              break L2;
            } else {
              if (0 == (param0 ^ -1)) {
                break L2;
              } else {
                stackIn_6_0 = lc.a(true, false, true, (byte) -65, 1, param0);
                break L1;
              }
            }
          }
          stackIn_6_0 = oi.field_d;
          break L1;
        }
        return stackIn_6_0;
    }

    private final void a(String param0, int param1) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int[] var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        CharSequence var10 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (!param0.startsWith("col=")) {
                    if (!param0.equals("/col")) {
                      break L2;
                    } else {
                      qg.field_c = tf.field_a & 16777215 | qg.field_c & -16777216;
                      break L2;
                    }
                  } else {
                    var6 = (CharSequence) ((Object) param0.substring(4));
                    qg.field_c = -16777216 & qg.field_c | 16777215 & np.a(var6, 4, 16);
                    break L2;
                  }
                }
                L3: {
                  if (param1 == -16777216) {
                    break L3;
                  } else {
                    var5 = (int[]) null;
                    this.a(119, 96, (pa[]) null, 57, -108, (String) null, -122, (int[]) null);
                    break L3;
                  }
                }
                L4: {
                  if (param0.startsWith("argb=")) {
                    var10 = (CharSequence) ((Object) param0.substring(5));
                    qg.field_c = np.a(var10, 4, 16);
                    break L4;
                  } else {
                    if (param0.equals("/argb")) {
                      qg.field_c = tf.field_a;
                      break L4;
                    } else {
                      if (param0.startsWith("str=")) {
                        var9 = (CharSequence) ((Object) param0.substring(4));
                        rs.field_t = qg.field_c & -16777216 | np.a(var9, 4, 16);
                        break L4;
                      } else {
                        if (param0.equals("str")) {
                          rs.field_t = -16777216 & qg.field_c | 8388608;
                          break L4;
                        } else {
                          if (param0.equals("/str")) {
                            rs.field_t = -1;
                            break L4;
                          } else {
                            if (param0.startsWith("u=")) {
                              var8 = (CharSequence) ((Object) param0.substring(2));
                              rb.field_h = qg.field_c & -16777216 | np.a(var8, param1 ^ -16777212, 16);
                              break L4;
                            } else {
                              if (param0.equals("u")) {
                                rb.field_h = -16777216 & qg.field_c;
                                break L4;
                              } else {
                                if (param0.equals("/u")) {
                                  rb.field_h = -1;
                                  break L4;
                                } else {
                                  if (!param0.equalsIgnoreCase("shad=-1")) {
                                    if (param0.startsWith("shad=")) {
                                      var7 = (CharSequence) ((Object) param0.substring(5));
                                      es.field_c = qg.field_c & -16777216 | np.a(var7, 4, 16);
                                      break L4;
                                    } else {
                                      if (!param0.equals("shad")) {
                                        if (param0.equals("/shad")) {
                                          es.field_c = em.field_d;
                                          break L4;
                                        } else {
                                          if (!param0.equals("br")) {
                                            break L4;
                                          } else {
                                            this.a(em.field_d, -1, tf.field_a);
                                            break L4;
                                          }
                                        }
                                      } else {
                                        es.field_c = qg.field_c & -16777216;
                                        break L4;
                                      }
                                    }
                                  } else {
                                    es.field_c = 0;
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3_ref);

            stackIn_38_1 = new StringBuilder().append("da.P(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L6;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        if (param0 < 8) {
            field_b = (int[]) null;
        }
        if (!(!param1)) {
            ef.field_m = ef.field_m - 1;
            if (!(-1 != (ef.field_m ^ -1))) {
                vc.field_f = null;
            }
        }
        if (param2) {
            gq.field_e = gq.field_e - 1;
            if (-1 == (gq.field_e ^ -1)) {
                sa.field_h = null;
            }
        }
    }

    final void a(int param0, int param1, pa[] param2, int param3, int param4, String param5, int param6, int[] param7) {
        if (param5 == null) {
            return;
        }
        try {
            this.a(param1, -1, param0);
            this.a(0, param2, param3, param5, (byte) 5, param7, param6, (aa) null, param4);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "da.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int param1, int param2, aa param3, int param4, int param5, String param6, int param7, int param8, int param9, int param10, int param11, pa[] param12, int param13, int[] param14, int param15, int param16) {
        int stackIn_4_0 = 0;
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
        var23 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param6 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.a(param1, -1, param5);
                if (-1 == (param11 ^ -1)) {
                  param11 = this.field_c.field_e;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (param11 + this.field_c.field_i + this.field_c.field_j <= param0) {
                    break L3;
                  } else {
                    if (param0 >= param11 + param11) {
                      break L3;
                    } else {
                      var18 = null;
                      break L2;
                    }
                  }
                }
                var18 = new int[]{param7};
                break L2;
              }
              L4: {
                var20 = 109 / ((param13 - 48) / 39);
                if (-1 != param2) {
                  break L4;
                } else {
                  param2 = param0 / param11;
                  if (0 >= param2) {
                    param2 = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                var19 = this.field_c.a(-121, param12, (int[]) (var18), vi.field_p, param6);
                if (0 >= param2) {
                  break L5;
                } else {
                  if (var19 < param2) {
                    break L5;
                  } else {
                    var19 = param2;
                    vi.field_p[param2 - 1] = this.field_c.a(param12, 0, param7, vi.field_p[-1 + param2]);
                    break L5;
                  }
                }
              }
              L6: {
                if (3 != param4) {
                  break L6;
                } else {
                  if ((var19 ^ -1) == -2) {
                    param4 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (param4 == 0) {
                  var21 = this.field_c.field_j + param9;
                  break L7;
                } else {
                  if ((param4 ^ -1) == -2) {
                    var21 = (-this.field_c.field_i + (-this.field_c.field_j + (param0 + -((-1 + var19) * param11)))) / 2 + this.field_c.field_j + param9;
                    break L7;
                  } else {
                    if (param4 == 2) {
                      var21 = -((-1 + var19) * param11) + -this.field_c.field_i + (param0 + param9);
                      break L7;
                    } else {
                      L8: {
                        var22 = (-this.field_c.field_i + -this.field_c.field_j + param0 - (var19 + -1) * param11) / (var19 - -1);
                        if (0 > var22) {
                          var22 = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var21 = this.field_c.field_j + (param9 + var22);
                      param11 = param11 + var22;
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
                    if (param8 == 0) {
                      this.a(param16, param12, param15, vi.field_p[var22], (byte) 5, param14, var21, param3, param10);
                      break L10;
                    } else {
                      if ((param8 ^ -1) == -2) {
                        this.a(param16, param12, param15 - -((-this.field_c.a((byte) 94, vi.field_p[var22]) + param7) / 2), vi.field_p[var22], (byte) 5, param14, var21, param3, param10);
                        break L10;
                      } else {
                        if (param8 != 2) {
                          if (var22 != var19 + -1) {
                            this.a(param7, (byte) 104, vi.field_p[var22]);
                            this.a(param16, param12, param15, vi.field_p[var22], (byte) 5, param14, var21, param3, param10);
                            tm.field_i = 0;
                            break L10;
                          } else {
                            this.a(param16, param12, param15, vi.field_p[var22], (byte) 5, param14, var21, param3, param10);
                            break L10;
                          }
                        } else {
                          this.a(param16, param12, -this.field_c.a((byte) 94, vi.field_p[var22]) + (param15 + param7), vi.field_p[var22], (byte) 5, param14, var21, param3, param10);
                          break L10;
                        }
                      }
                    }
                  }
                  var21 = var21 + param11;
                  var22++;
                  continue L9;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var18 = decompiledCaughtException;
            stackIn_49_0 = var18;

            stackIn_49_1 = new StringBuilder().append("da.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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


            stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {

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


            stackIn_55_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

            if (param12 == null) {

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


            stackIn_58_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',').append(param13).append(',');

            if (param14 == null) {

              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L14;
            } else {

              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L14;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_50_0), stackIn_59_2 + ',' + param15 + ',' + param16 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_46_0;
        }
    }

    public static void a(int param0) {
        if (param0 != 5) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    da(ha param0, vs param1) {
        try {
            this.field_c = param1;
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, String param3, int param4, int param5) {
        if (param3 == null) {
            return;
        }
        try {
            if (param4 != 18731) {
                String var8 = (String) null;
                this.a((String) null, -14, 82, 83, -17, (byte) 19);
            }
            this.a(param1, param4 + -18732, param0);
            this.a(0, (pa[]) null, param2, param3, (byte) 5, (int[]) null, param5, (aa) null, 0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "da.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, pa[] param1, int param2, String param3, byte param4, int[] param5, int param6, aa param7, int param8) {
        int stackIn_26_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
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
        pa var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
        var20 = null;
        var19 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param6 = param6 - this.field_c.field_e;
              if (param4 == 5) {
                break L1;
              } else {
                this.field_d = (ha) null;
                break L1;
              }
            }
            var10_int = -1;
            var11 = -1;
            var12 = param3.length();
            var13 = 0;
            L2: while (true) {
              if (var13 >= var12) {
                break L0;
              } else {
                L3: {
                  var14 = (char)(255 & ae.a(param3.charAt(var13), 56));
                  if ((var14 ^ -1) != -61) {
                    L4: {
                      if (var14 != 62) {
                        break L4;
                      } else {
                        if (-1 == var10_int) {
                          break L4;
                        } else {
                          var15_ref_String = param3.substring(var10_int - -1, var13);
                          var10_int = -1;
                          if (var15_ref_String.equals("lt")) {
                            var14 = 60;
                            break L4;
                          } else {
                            if (!var15_ref_String.equals("gt")) {
                              if (!var15_ref_String.equals("nbsp")) {
                                if (var15_ref_String.equals("shy")) {
                                  var14 = 173;
                                  break L4;
                                } else {
                                  if (!var15_ref_String.equals("times")) {
                                    if (var15_ref_String.equals("euro")) {
                                      var14 = 8364;
                                      break L4;
                                    } else {
                                      if (var15_ref_String.equals("copy")) {
                                        var14 = 169;
                                        break L4;
                                      } else {
                                        if (!var15_ref_String.equals("reg")) {
                                          if (var15_ref_String.startsWith("img=")) {
                                            try {
                                              L5: {
                                                L6: {
                                                  var21 = (CharSequence) ((Object) var15_ref_String.substring(4));
                                                  var16_int = td.a(var21, (byte) 38);
                                                  var17 = param1[var16_int];
                                                  if (param5 != null) {
                                                    stackIn_26_0 = param5[var16_int];
                                                    break L6;
                                                  } else {
                                                    stackIn_26_0 = var17.c();
                                                    break L6;
                                                  }
                                                }
                                                L7: {
                                                  var18 = stackIn_26_0;
                                                  if ((qg.field_c & -16777216 ^ -1) != 16777215) {
                                                    var17.a(param2, param6 - -this.field_c.field_e - var18, 0, qg.field_c & -16777216 | 16777215, 1);
                                                    break L7;
                                                  } else {
                                                    var17.a(param2, -var18 + this.field_c.field_e + param6, 1, 0, 1);
                                                    break L7;
                                                  }
                                                }
                                                param2 = param2 + param1[var16_int].d();
                                                var11 = -1;
                                                break L5;
                                              }
                                            } catch (java.lang.Exception decompiledCaughtParameter0) {
                                              decompiledCaughtException = decompiledCaughtParameter0;
                                              L8: {
                                                var16 = (Exception) (Object) decompiledCaughtException;
                                                break L8;
                                              }
                                            }
                                            break L3;
                                          } else {
                                            this.a(var15_ref_String, -16777216);
                                            break L3;
                                          }
                                        } else {
                                          var14 = 174;
                                          break L4;
                                        }
                                      }
                                    }
                                  } else {
                                    var14 = 215;
                                    break L4;
                                  }
                                }
                              } else {
                                var14 = 160;
                                break L4;
                              }
                            } else {
                              var14 = 62;
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    if (var10_int == -1) {
                      L9: {
                        if ((var11 ^ -1) != 0) {
                          param2 = param2 + this.field_c.a(0, (char) var14, var11);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if ((var14 ^ -1) == -33) {
                          if ((tm.field_i ^ -1) < -1) {
                            ed.field_i = ed.field_i + tm.field_i;
                            param2 = param2 + (ed.field_i >> -1397336856);
                            ed.field_i = ed.field_i & 255;
                            break L10;
                          } else {
                            break L10;
                          }
                        } else {
                          if (param7 == null) {
                            L11: {
                              if (0 != (-16777216 & es.field_c)) {
                                this.fa((char) var14, 1 + param2, param6 + 1, es.field_c, true);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            this.fa((char) var14, param2, param6, qg.field_c, false);
                            break L10;
                          } else {
                            L12: {
                              if (0 == (es.field_c & -16777216)) {
                                break L12;
                              } else {
                                this.a((char) var14, 1 + param2, param6 - -1, es.field_c, true, param7, param0, param8);
                                break L12;
                              }
                            }
                            this.a((char) var14, param2, param6, qg.field_c, false, param7, param0, param8);
                            break L10;
                          }
                        }
                      }
                      L13: {
                        var15 = this.field_c.a((byte) 109, var14);
                        if ((rs.field_t ^ -1) != 0) {
                          this.field_d.a(param6 - -(int)(0.7 * (double)this.field_c.field_e), rs.field_t, 28321, param2, var15);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (0 == (rb.field_h ^ -1)) {
                          break L14;
                        } else {
                          this.field_d.a(1 + (param6 - -this.field_c.field_e), rb.field_h, 28321, param2, var15);
                          break L14;
                        }
                      }
                      param2 = param2 + var15;
                      var11 = var14;
                      break L3;
                    } else {
                      var13++;
                      continue L2;
                    }
                  } else {
                    var10_int = var13;
                    break L3;
                  }
                }
                var13++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L15: {
            var10 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_63_0 = (RuntimeException) (var10);

            stackIn_63_1 = new StringBuilder().append("da.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L15;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L15;
            }
          }
          L16: {


            stackIn_66_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L16;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L17;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L18;
            } else {
              stackIn_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L18;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_64_0), stackIn_73_2 + ',' + param8 + ')');
        }
    }

    private final void a(int param0, byte param1, String param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            if (param1 > 98) {
              var6 = 0;
              L1: while (true) {
                if (param2.length() <= var6) {
                  L2: {
                    if ((var4_int ^ -1) >= -1) {
                      break L2;
                    } else {
                      tm.field_i = (param0 + -this.field_c.a((byte) 94, param2) << -1649616888) / var4_int;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var7 = param2.charAt(var6);
                    if (-61 != (var7 ^ -1)) {
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("da.N(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, byte param5) {
        if (param0 == null) {
            return;
        }
        try {
            this.a(param2, -1, param1);
            if (param5 != 92) {
                this.field_d = (ha) null;
            }
            this.a(0, (pa[]) null, param3 + -this.field_c.a((byte) 94, param0), param0, (byte) 5, (int[]) null, param4, (aa) null, 0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "da.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    abstract void fa(char param0, int param1, int param2, int param3, boolean param4);

    private final void a(int param0, int param1, int param2) {
        rs.field_t = -1;
        tf.field_a = param2;
        qg.field_c = param2;
        tm.field_i = 0;
        rb.field_h = param1;
        ed.field_i = 0;
        if (param0 == -1) {
            param0 = 0;
        }
        em.field_d = param0;
        es.field_c = param0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        RuntimeException runtimeException = null;
        String var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param5 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.a(param2, -1, param1);
                this.a(0, (pa[]) null, -(this.field_c.a((byte) 94, param5) / 2) + param4, param5, (byte) 5, (int[]) null, param3, (aa) null, 0);
                if (param0 >= 95) {
                  break L1;
                } else {
                  var8 = (String) null;
                  this.a((String) null, 1, -72, -15, 80, (byte) -125);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("da.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int[] param2, byte param3, int param4, String param5, int param6, pa[] param7) {
        if (!(param5 != null)) {
            return;
        }
        try {
            this.a(param0, -1, param1);
            if (param3 > -93) {
                da.a(126, -64);
            }
            this.a(0, param7, -this.field_c.a((byte) 94, param5) + param6, param5, (byte) 5, param2, param4, (aa) null, 0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "da.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    static {
        field_b = new int[128];
    }
}
