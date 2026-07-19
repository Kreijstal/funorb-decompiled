/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends kca {
    static int field_m;
    static int field_n;
    private tra field_j;
    static int field_l;
    private tra field_o;
    static String[] field_k;

    final static void b(byte param0) {
        if (!(tga.field_a != null)) {
            return;
        }
        tga.field_a.a(true);
        if (param0 < 91) {
            return;
        }
        tga.field_a = null;
    }

    final static qca a(pr[] param0, kda param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        long var3_long = 0L;
        int var5 = 0;
        int var6 = 0;
        byte[] var10 = null;
        Object stackIn_31_0 = null;
        qca stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_30_0 = null;
        qca stackOut_32_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                if (var3_int >= param0.length) {
                  break L2;
                } else {
                  if (param0[var3_int] != null) {
                    if (0L < param0[var3_int].field_c) {
                      var3_int++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
              var5 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (var5 >= param0.length) {
                      break L5;
                    } else {
                      jaggl.OpenGL.glAttachObjectARB(var3_long, param0[var5].field_c);
                      var5++;
                      if (var6 != 0) {
                        break L4;
                      } else {
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    if (param2 == 1) {
                      break L6;
                    } else {
                      field_l = 12;
                      break L6;
                    }
                  }
                  jaggl.OpenGL.glLinkProgramARB(var3_long);
                  jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, gba.field_f, 0);
                  break L4;
                }
                L7: {
                  if (0 != gba.field_f[0]) {
                    break L7;
                  } else {
                    L8: {
                      if (0 != gba.field_f[0]) {
                        break L8;
                      } else {
                        System.out.println("Shader linking failed:");
                        break L8;
                      }
                    }
                    L9: {
                      jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, gba.field_f, 1);
                      if ((gba.field_f[1] ^ -1) < -2) {
                        var10 = new byte[gba.field_f[1]];
                        jaggl.OpenGL.glGetInfoLogARB(var3_long, gba.field_f[1], gba.field_f, 0, var10, 0);
                        System.out.println(new String(var10));
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (0 != gba.field_f[0]) {
                      break L7;
                    } else {
                      var5 = 0;
                      L10: while (true) {
                        if (var5 >= param0.length) {
                          jaggl.OpenGL.glDeleteObjectARB(var3_long);
                          stackOut_30_0 = null;
                          stackIn_31_0 = stackOut_30_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          jaggl.OpenGL.glDetachObjectARB(var3_long, param0[var5].field_c);
                          var5++;
                          if (var6 == 0) {
                            continue L10;
                          } else {
                            return null;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_32_0 = new qca(param1, var3_long, param0);
                stackIn_33_0 = stackOut_32_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var3);
            stackOut_34_1 = new StringBuilder().append("jm.D(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L11;
            }
          }
          L12: {
            stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L12;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qca) ((Object) stackIn_31_0);
        } else {
          return stackIn_33_0;
        }
    }

    final static long a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        long stackIn_21_0 = 0L;
        long stackIn_24_0 = 0L;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        long stackOut_20_0 = 0L;
        int stackOut_18_0 = 0;
        long stackOut_23_0 = 0L;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = 82 / ((-66 - param1) / 51);
            var2_long = 0L;
            var5 = param0.length();
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var6 >= var5) {
                      break L4;
                    } else {
                      var2_long = var2_long * 37L;
                      var7 = param0.charAt(var6);
                      stackOut_3_0 = var7 ^ -1;
                      stackIn_19_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var8 != 0) {
                        L5: while (true) {
                          if (stackIn_19_0 != 0) {
                            break L3;
                          } else {
                            stackOut_20_0 = 0L;
                            stackIn_24_0 = stackOut_20_0;
                            stackIn_21_0 = stackOut_20_0;
                            if (var8 != 0) {
                              break L2;
                            } else {
                              if (stackIn_21_0 == var2_long) {
                                break L3;
                              } else {
                                var2_long = var2_long / 37L;
                                if (var8 == 0) {
                                  stackOut_18_0 = ((var2_long % 37L ^ -1L) < -1L ? -1 : ((var2_long % 37L ^ -1L) == -1L ? 0 : 1));
                                  stackIn_19_0 = stackOut_18_0;
                                  continue L5;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L6: {
                          L7: {
                            L8: {
                              if (stackIn_4_0 > -66) {
                                break L8;
                              } else {
                                if (var7 <= 90) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              L10: {
                                if (97 > var7) {
                                  break L10;
                                } else {
                                  if (var7 <= 122) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (var7 < 48) {
                                break L6;
                              } else {
                                if (57 < var7) {
                                  break L6;
                                } else {
                                  var2_long = var2_long + (long)(var7 + -21);
                                  if (var8 == 0) {
                                    break L6;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var2_long = var2_long + (long)(-97 + var7 + 1);
                            if (var8 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                          var2_long = var2_long + (long)(-65 + (var7 + 1));
                          break L6;
                        }
                        if (var2_long >= 177917621779460413L) {
                          break L4;
                        } else {
                          var6++;
                          continue L1;
                        }
                      }
                    }
                  }
                  L11: while (true) {
                    stackOut_18_0 = ((var2_long % 37L ^ -1L) < -1L ? -1 : ((var2_long % 37L ^ -1L) == -1L ? 0 : 1));
                    stackIn_19_0 = stackOut_18_0;
                    if (stackIn_19_0 != 0) {
                      break L3;
                    } else {
                      stackOut_20_0 = 0L;
                      stackIn_24_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (var8 != 0) {
                        break L2;
                      } else {
                        if (stackIn_21_0 == var2_long) {
                          break L3;
                        } else {
                          var2_long = var2_long / 37L;
                          if (var8 == 0) {
                            continue L11;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_23_0 = var2_long;
                stackIn_24_0 = stackOut_23_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("jm.G(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L12;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -33) {
                break L1;
              } else {
                this.field_j = (tra) null;
                break L1;
              }
            }
            L2: {
              var3 = this.field_j.field_o.toLowerCase();
              var4 = param1.toLowerCase();
              if ((var3.length() ^ -1) >= -1) {
                break L2;
              } else {
                if (-1 > (var4.length() ^ -1)) {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (-1 + var3.length() <= var5) {
                      break L2;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(1 + var5);
                      if ((var4.indexOf(var6) ^ -1) <= -1) {
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L3: {
                          if (0 <= var4.indexOf(var7)) {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            break L3;
                          } else {
                            stackOut_12_0 = 0;
                            stackIn_14_0 = stackOut_12_0;
                            break L3;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackOut_15_0 = 0;
            stackIn_16_0 = stackOut_15_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("jm.F(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        String stackOut_24_0 = null;
        String stackOut_28_0 = null;
        String stackOut_20_0 = null;
        String stackOut_17_0 = null;
        String stackOut_10_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            var6 = this.field_o.field_o.toLowerCase();
            var4 = param1.toLowerCase();
            if (param0 != (var4.length() ^ -1)) {
              var5 = var4;
              if (!ld.a(false, var5)) {
                if (!qda.a((byte) -72, var5)) {
                  if (!eba.a(var5, 6912)) {
                    if (this.b(-37, param1)) {
                      stackOut_14_0 = waa.field_e;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((var6.length() ^ -1) < -1) {
                        if (!ne.a(true, var5, var6)) {
                          if (kv.a((byte) 55, var5, var6)) {
                            stackOut_24_0 = wl.field_h;
                            stackIn_25_0 = stackOut_24_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (jea.a(true, var5, var6)) {
                              stackOut_28_0 = kl.field_j;
                              stackIn_29_0 = stackOut_28_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return dva.field_a;
                            }
                          }
                        } else {
                          stackOut_20_0 = kl.field_j;
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_17_0 = pv.field_m;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_10_0 = hf.field_e;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_7_0 = qqa.field_o;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = dva.field_a;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var3);
            stackOut_30_1 = new StringBuilder().append("jm.B(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L1;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_18_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_21_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_25_0;
                      } else {
                        return stackIn_29_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    jm(tra param0, tra param1, tra param2) {
        super(param0);
        try {
            this.field_o = param1;
            this.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_k = null;
        if (!param0) {
            return;
        }
        jm.b(false);
    }

    final it a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        it stackIn_2_0 = null;
        it stackIn_6_0 = null;
        it stackIn_10_0 = null;
        it stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        it stackOut_5_0 = null;
        it stackOut_9_0 = null;
        it stackOut_13_0 = null;
        it stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param0 == 14) {
              var3 = this.field_o.field_o.toLowerCase();
              var4 = param1.toLowerCase();
              if (0 == var4.length()) {
                stackOut_5_0 = fp.field_c;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!jg.a(-102, var3, var4)) {
                  stackOut_9_0 = fp.field_c;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (this.b(param0 + -123, param1)) {
                    stackOut_13_0 = fp.field_c;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return uh.field_k;
                  }
                }
              }
            } else {
              stackOut_1_0 = (it) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("jm.A(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    static {
        field_n = 2147483647;
        field_m = 0;
        field_l = 2097152;
        field_k = new String[]{"88b346", "4879b4", "b64848", "9e47b4"};
    }
}
