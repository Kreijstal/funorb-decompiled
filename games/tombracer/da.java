/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da {
    static boolean field_c;
    private qla field_a;
    private ha field_b;

    abstract void fa(char param0, int param1, int param2, int param3, boolean param4);

    final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        if (param5 == null) {
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
        uh.field_h.a(rra.field_e.field_G - (!rca.field_p ? 0 : 40 + (2 + io.field_a + 2)), 18, -23776, 0, 0);
        vw.field_b.a(io.field_a + 42, 18, -23776, 0, -2 + (rra.field_e.field_G - (io.field_a + 40)));
        bsa.field_j.a(rra.field_e.field_G, 2, (byte) 127, 0, io.field_a, -20 + rra.field_e.field_t, 20);
        if (param0) {
          da.a(false);
        }
    }

    private final void a(String param0, int param1) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
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
          try {
            if (!param0.startsWith("col=")) {
              if (param0.equals("/col")) {
                v.field_k = 16777215 & lra.field_g | v.field_k & -16777216;
              }
            } else {
              var5 = (CharSequence) ((Object) param0.substring(4));
              v.field_k = -16777216 & v.field_k | 16777215 & eba.a(var5, -105, 16);
            }
            if (!param0.startsWith("argb=")) {
              if (param0.equals("/argb")) {
                v.field_k = lra.field_g;
              } else {
                if (!param0.startsWith("str=")) {
                  if (param0.equals("str")) {
                    nt.field_b = 8388608 | -16777216 & v.field_k;
                  } else {
                    if (param0.equals("/str")) {
                      nt.field_b = -1;
                    } else {
                      if (param0.startsWith("u=")) {
                        var9 = (CharSequence) ((Object) param0.substring(2));
                        moa.field_b = v.field_k & -16777216 | eba.a(var9, -65, 16);
                      } else {
                        if (param0.equals("u")) {
                          moa.field_b = -16777216 & v.field_k;
                        } else {
                          if (!param0.equals("/u")) {
                            if (!param0.equalsIgnoreCase("shad=-1")) {
                              if (param0.startsWith("shad=")) {
                                var8 = (CharSequence) ((Object) param0.substring(5));
                                wqa.field_G = v.field_k & -16777216 | eba.a(var8, -52, 16);
                              } else {
                                if (param0.equals("shad")) {
                                  wqa.field_G = -16777216 & v.field_k;
                                } else {
                                  if (!param0.equals("/shad")) {
                                    if (param0.equals("br")) {
                                      this.a(lra.field_g, tta.field_G, 122);
                                    }
                                  } else {
                                    wqa.field_G = tta.field_G;
                                  }
                                }
                              }
                            } else {
                              wqa.field_G = 0;
                            }
                          } else {
                            moa.field_b = -1;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var7 = (CharSequence) ((Object) param0.substring(4));
                  nt.field_b = v.field_k & -16777216 | eba.a(var7, -45, 16);
                }
              }
            } else {
              var6 = (CharSequence) ((Object) param0.substring(5));
              v.field_k = eba.a(var6, -63, 16);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          if (param1 <= 108) {
            this.field_a = (qla) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_40_0 = var3_ref;
          stackIn_40_1 = new StringBuilder().append("da.D(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int[] param0, int param1, String param2, int param3, int param4, aa param5, int param6, nh[] param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int stackIn_3_0 = 0;
        int stackIn_46_0 = 0;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var22Lifetime1;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 == null) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          this.a(param16, param15, 109);
          if (param13 == 0) {
            param13 = this.field_a.field_a;
          }
          if (param9 < param13 + this.field_a.field_h + this.field_a.field_g &&
            param9 < param13 + param13) {
            var18 = null;
          } else {
            var18 = new int[]{param11};
          }
          var19 = this.field_a.a(param2, -127, ska.field_q, param7, (int[]) (var18));
          if (param14 == -1) {
            param14 = param9 / param13;
            if (0 >= param14) {
              param14 = 1;
            }
          }
          if (param14 > 0 &&
            var19 >= param14) {
            ska.field_q[-1 + param14] = this.field_a.a(false, param7, ska.field_q[-1 + param14], param11);
            var19 = param14;
          }
          if (3 == param6 &&
            var19 == 1) {
            param6 = 1;
          }
          var21 = 61 % ((-4 - param12) / 59);
          if (param6 == 0) {
            var20 = param10 + this.field_a.field_h;
          } else {
            if (param6 == 1) {
              var20 = this.field_a.field_h + (param10 + (-((var19 - 1) * param13) - this.field_a.field_g + (-this.field_a.field_h + param9)) / 2);
            } else {
              if (param6 == 2) {
                var20 = -((-1 + var19) * param13) + (-this.field_a.field_g + param10) + param9;
              } else {
                var22 = (-(param13 * (var19 - 1)) + (param9 - this.field_a.field_h) - this.field_a.field_g) / (var19 + 1);
                if (var22 < 0) {
                  var22 = 0;
                }
                var20 = var22 + (this.field_a.field_h + param10);
                param13 = param13 + var22;
              }
            }
          }
          for (var22Lifetime1 = 0; var22Lifetime1 < var19; var22Lifetime1++) {
            if (param4 == 0) {
              this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22Lifetime1], param8, var20);
            } else {
              if (param4 == 1) {
                this.a(false, (param11 - this.field_a.a(ska.field_q[var22Lifetime1], (byte) -101)) / 2 + param1, param5, param0, param3, param7, ska.field_q[var22Lifetime1], param8, var20);
              } else {
                if (param4 == 2) {
                  this.a(false, -this.field_a.a(ska.field_q[var22Lifetime1], (byte) -116) + (param11 + param1), param5, param0, param3, param7, ska.field_q[var22Lifetime1], param8, var20);
                } else {
                  if (var19 - 1 == var22Lifetime1) {
                    this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22Lifetime1], param8, var20);
                  } else {
                    this.a(true, param11, ska.field_q[var22Lifetime1]);
                    this.a(false, param1, param5, param0, param3, param7, ska.field_q[var22Lifetime1], param8, var20);
                    cka.field_ab = 0;
                  }
                }
              }
            }
            var20 = var20 + param13;
          }
          stackIn_46_0 = var19;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var18 = decompiledCaughtException;
          stackIn_49_0 = var18;
          stackIn_49_1 = new StringBuilder().append("da.H(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_55_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw tba.a((Throwable) (stackIn_49_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, String param2) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = 0;
          var5 = 0;
          for (var6 = 0; param2.length() > var6; var6++) {
            var7 = param2.charAt(var6);
            if (var7 != 60) {
              if (var7 != 62) {
                if (var5 == 0 &&
                  32 == var7) {
                  var4_int++;
                }
              } else {
                var5 = 0;
              }
            } else {
              var5 = 1;
            }
          }
          if (var4_int > 0) {
            cka.field_ab = (param1 - this.field_a.a(param2, (byte) -121) << 8) / var4_int;
          }
          if (!param0) {
            this.field_a = (qla) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("da.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, aa param2, int[] param3, int param4, nh[] param5, String param6, int param7, int param8) {
        int var13 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        Throwable decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
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
          param8 = param8 - this.field_a.field_a;
          var10_int = -1;
          if (param0) {
            return;
          }
          var11 = -1;
          var12 = param6.length();
          for (var13 = 0; var12 > var13; var13++) {
            boolean decompiledFrameRemainder0 = true;
            var14 = (char)(io.a(-377, param6.charAt(var13)) & 255);
            if (var14 == 60) {
              var10_int = var13;
            } else {
              if (var14 == 62 &&
                var10_int != -1) {
                var15_ref_String = param6.substring(1 + var10_int, var13);
                var10_int = -1;
                if (!var15_ref_String.equals("lt")) {
                  if (var15_ref_String.equals("gt")) {
                    var14 = 62;
                  } else {
                    if (!var15_ref_String.equals("nbsp")) {
                      if (!var15_ref_String.equals("shy")) {
                        if (!var15_ref_String.equals("times")) {
                          if (var15_ref_String.equals("euro")) {
                            var14 = 8364;
                          } else {
                            if (!var15_ref_String.equals("copy")) {
                              if (!var15_ref_String.equals("reg")) {
                                if (!var15_ref_String.startsWith("img=")) {
                                  this.a(var15_ref_String, 115);
                                } else {
                                  try {
                                    var21 = (CharSequence) ((Object) var15_ref_String.substring(4));
                                    var16_int = jb.a(var21, (byte) 70);
                                    var17 = param5[var16_int];
                                    if (param3 == null) {
                                      stackIn_29_0 = var17.b();
                                    } else {
                                      stackIn_29_0 = param3[var16_int];
                                    }
                                    var18 = stackIn_29_0;
                                    if ((-16777216 & v.field_k) != -16777216) {
                                      var17.a(param1, param8 + this.field_a.field_a - var18, 0, 16777215 | -16777216 & v.field_k, 1);
                                    } else {
                                      var17.a(param1, this.field_a.field_a + param8 - var18, 1, 0, 1);
                                    }
                                    param1 = param1 + param5[var16_int].d();
                                    var11 = -1;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var16 = (Exception) (Object) decompiledCaughtException;
                                  }
                                }
                                decompiledFrameRemainder0 = false;
                              }
                              else {
                                var14 = 174;
                              }
                            } else {
                              var14 = 169;
                            }
                          }
                        } else {
                          var14 = 215;
                        }
                      } else {
                        var14 = 173;
                      }
                    } else {
                      var14 = 160;
                    }
                  }
                } else {
                  var14 = 60;
                }
              }
              if ((decompiledFrameRemainder0) &&
                (var10_int == -1)) {
                if (-1 != var11) {
                  param1 = param1 + this.field_a.a(var11, -6773, (char) var14);
                }
                if (32 == var14) {
                  if (cka.field_ab > 0) {
                    moa.field_a = moa.field_a + cka.field_ab;
                    param1 = param1 + (moa.field_a >> 8);
                    moa.field_a = moa.field_a & 255;
                  }
                } else {
                  if (param2 == null) {
                    if ((wqa.field_G & -16777216) != 0) {
                      this.fa((char) var14, param1 + 1, 1 + param8, wqa.field_G, true);
                    }
                    this.fa((char) var14, param1, param8, v.field_k, false);
                  } else {
                    if ((-16777216 & wqa.field_G) != 0) {
                      this.a((char) var14, param1 + 1, 1 + param8, wqa.field_G, true, param2, param7, param4);
                    }
                    this.a((char) var14, param1, param8, v.field_k, false, param2, param7, param4);
                  }
                }
                var15 = this.field_a.a(255, var14);
                if (nt.field_b != -1) {
                  this.field_b.a(1, var15, (int)((double)this.field_a.field_a * 0.7) + param8, param1, nt.field_b);
                }
                if (moa.field_b != -1) {
                  this.field_b.a(1, var15, param8 + this.field_a.field_a + 1, param1, moa.field_b);
                }
                param1 = param1 + var15;
                var11 = var14;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var10 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_65_0 = var10;
          stackIn_65_1 = new StringBuilder().append("da.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',');
          if (param3 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param6 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final int a(aa param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, String param9, byte param10, int param11, int param12, nh[] param13, int param14, int param15) {
        int var17_int = 0;
        RuntimeException var17 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var17_int = -65 % ((24 - param10) / 47);
          stackIn_1_0 = this.a(param6, param14, param9, param3, param7, param0, param15, param13, param12, param11, param4, param1, -71, param2, 0, param5, param8);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_4_0 = var17;
          stackIn_4_1 = new StringBuilder().append("da.J(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param14).append(',').append(param15).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, String param2, int param3, int param4, int param5) {
        if (param2 == null) {
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
        if (param2 == null) {
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
