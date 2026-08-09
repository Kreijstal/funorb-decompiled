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
        Object stackIn_25_0 = null;
        qca stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param0.length) {
                var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
                var5 = 0;
                L2: while (true) {
                  if (var5 >= param0.length) {
                    L3: {
                      if (param2 == 1) {
                        break L3;
                      } else {
                        field_l = 12;
                        break L3;
                      }
                    }
                    L4: {
                      jaggl.OpenGL.glLinkProgramARB(var3_long);
                      jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, gba.field_f, 0);
                      if (0 != gba.field_f[0]) {
                        break L4;
                      } else {
                        L5: {
                          if (0 != gba.field_f[0]) {
                            break L5;
                          } else {
                            System.out.println("Shader linking failed:");
                            break L5;
                          }
                        }
                        L6: {
                          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, gba.field_f, 1);
                          if ((gba.field_f[1] ^ -1) < -2) {
                            var11 = new byte[gba.field_f[1]];
                            jaggl.OpenGL.glGetInfoLogARB(var3_long, gba.field_f[1], gba.field_f, 0, var11, 0);
                            System.out.println(new String(var11));
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (0 != gba.field_f[0]) {
                          break L4;
                        } else {
                          var7 = 0;
                          var5 = var7;
                          L7: while (true) {
                            if (var7 >= param0.length) {
                              jaggl.OpenGL.glDeleteObjectARB(var3_long);
                              stackIn_25_0 = null;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              jaggl.OpenGL.glDetachObjectARB(var3_long, param0[var7].field_c);
                              var7++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                    stackIn_27_0 = new qca(param1, var3_long, param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    jaggl.OpenGL.glAttachObjectARB(var3_long, param0[var5].field_c);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (param0[var3_int] != null) {
                  if (0L < param0[var3_int].field_c) {
                    var3_int++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("jm.D(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qca) ((Object) stackIn_25_0);
        } else {
          return stackIn_27_0;
        }
    }

    final static long a(CharSequence param0, int param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = 82 / ((-66 - param1) / 51);
            var2_long = 0L;
            var5 = param0.length();
            var6 = 0;
            L1: while (true) {
              L2: {
                if (var6 >= var5) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var7 = param0.charAt(var6);
                      if (var7 < 65) {
                        break L4;
                      } else {
                        if (var7 <= 90) {
                          var2_long = var2_long + (long)(-65 + (var7 + 1));
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (97 > var7) {
                        break L5;
                      } else {
                        if (var7 <= 122) {
                          var2_long = var2_long + (long)(-97 + var7 + 1);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var7 < 48) {
                      break L3;
                    } else {
                      if (57 < var7) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(var7 + -21);
                        break L3;
                      }
                    }
                  }
                  if (var2_long >= 177917621779460413L) {
                    break L2;
                  } else {
                    var6++;
                    continue L1;
                  }
                }
              }
              L6: while (true) {
                L7: {
                  if ((var2_long % 37L ^ -1L) != -1L) {
                    break L7;
                  } else {
                    if (0L == var2_long) {
                      break L7;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L6;
                    }
                  }
                }
                stackIn_21_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("jm.G(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L3: {
                          if (0 <= var4.indexOf(var7)) {
                            stackIn_14_0 = 1;
                            break L3;
                          } else {
                            stackIn_14_0 = 0;
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
            stackIn_16_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("jm.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                      stackIn_15_0 = waa.field_e;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((var6.length() ^ -1) < -1) {
                        if (!ne.a(true, var5, var6)) {
                          if (kv.a((byte) 55, var5, var6)) {
                            stackIn_25_0 = wl.field_h;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (jea.a(true, var5, var6)) {
                              stackIn_29_0 = kl.field_j;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return dva.field_a;
                            }
                          }
                        } else {
                          stackIn_21_0 = kl.field_j;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_18_0 = pv.field_m;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_11_0 = hf.field_e;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = qqa.field_o;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = dva.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("jm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L1;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
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
        if (param0) {
            jm.b(false);
        }
    }

    final it a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        it stackIn_2_0 = null;
        it stackIn_6_0 = null;
        it stackIn_10_0 = null;
        it stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 14) {
              var3 = this.field_o.field_o.toLowerCase();
              var4 = param1.toLowerCase();
              if (0 == var4.length()) {
                stackIn_6_0 = fp.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!jg.a(-102, var3, var4)) {
                  stackIn_10_0 = fp.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (this.b(param0 + -123, param1)) {
                    stackIn_14_0 = fp.field_c;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return uh.field_k;
                  }
                }
              }
            } else {
              stackIn_2_0 = (it) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("jm.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
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
