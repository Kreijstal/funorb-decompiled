/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RendererBitmapFont {
    private GraphicsRenderer renderer;
    static int[] field_b;
    private BitmapFontMetrics metrics;
    static tk field_a;

    final int a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8, RenderSprite[] param9, aa param10, int param11, int[] param12, int param13, int param14, String param15) {
        RuntimeException var17 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            this.renderer = (GraphicsRenderer) null;
          }
          stackIn_3_0 = this.a(param14, param4, 0, param10, param11, param2, param15, param13, param5, param6, param0, param7, param9, -2, param12, param1, param8);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_6_0 = var17;
          stackIn_6_1 = new StringBuilder().append("da.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param10 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static ResourceArchive a(int param0, int param1) {
        ResourceArchive stackIn_6_0 = null;
        if (param1 != 1) {
          field_b = (int[]) null;
        }
        if (null == oi.field_d &&
          param0 != -1) {
          stackIn_6_0 = lc.a(true, false, true, (byte) -65, 1, param0);
        } else {
          stackIn_6_0 = oi.field_d;
        }
        return stackIn_6_0;
    }

    private final void a(String param0, int param1) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
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
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          try {
            if (!param0.startsWith("col=")) {
              if (param0.equals("/col")) {
                qg.field_c = tf.field_a & 16777215 | qg.field_c & -16777216;
              }
            } else {
              var6 = (CharSequence) ((Object) param0.substring(4));
              qg.field_c = -16777216 & qg.field_c | 16777215 & np.a(var6, 4, 16);
            }
            if (param1 != -16777216) {
              var5 = (int[]) null;
              this.a(119, 96, (RenderSprite[]) null, 57, -108, (String) null, -122, (int[]) null);
            }
            if (param0.startsWith("argb=")) {
              var10 = (CharSequence) ((Object) param0.substring(5));
              qg.field_c = np.a(var10, 4, 16);
            } else {
              if (param0.equals("/argb")) {
                qg.field_c = tf.field_a;
              } else {
                if (param0.startsWith("str=")) {
                  var9 = (CharSequence) ((Object) param0.substring(4));
                  rs.field_t = qg.field_c & -16777216 | np.a(var9, 4, 16);
                } else {
                  if (param0.equals("str")) {
                    rs.field_t = -16777216 & qg.field_c | 8388608;
                  } else {
                    if (param0.equals("/str")) {
                      rs.field_t = -1;
                    } else {
                      if (param0.startsWith("u=")) {
                        var8 = (CharSequence) ((Object) param0.substring(2));
                        PacketBuffer.field_h = qg.field_c & -16777216 | np.a(var8, param1 ^ -16777212, 16);
                      } else {
                        if (param0.equals("u")) {
                          PacketBuffer.field_h = -16777216 & qg.field_c;
                        } else {
                          if (param0.equals("/u")) {
                            PacketBuffer.field_h = -1;
                          } else {
                            if (!param0.equalsIgnoreCase("shad=-1")) {
                              if (param0.startsWith("shad=")) {
                                var7 = (CharSequence) ((Object) param0.substring(5));
                                es.field_c = qg.field_c & -16777216 | np.a(var7, 4, 16);
                              } else {
                                if (!param0.equals("shad")) {
                                  if (param0.equals("/shad")) {
                                    es.field_c = em.field_d;
                                  } else {
                                    if (param0.equals("br")) {
                                      this.a(em.field_d, -1, tf.field_a);
                                    }
                                  }
                                } else {
                                  es.field_c = qg.field_c & -16777216;
                                }
                              }
                            } else {
                              es.field_c = 0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_38_0 = var3_ref;
          stackIn_38_1 = new StringBuilder().append("da.P(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        if (param0 < 8) {
          field_b = (int[]) null;
        }
        if (param1) {
          ef.field_m = ef.field_m - 1;
          if (ef.field_m == 0) {
            ScorchMark.field_f = null;
          }
        }
        if (param2) {
          gq.field_e = gq.field_e - 1;
          if (gq.field_e == 0) {
            sa.field_h = null;
          }
        }
    }

    final void a(int param0, int param1, RenderSprite[] param2, int param3, int param4, String param5, int param6, int[] param7) {
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

    private final int a(int param0, int param1, int param2, aa param3, int param4, int param5, String param6, int param7, int param8, int param9, int param10, int param11, RenderSprite[] param12, int param13, int[] param14, int param15, int param16) {
        int stackIn_4_0 = 0;
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
        var23 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param6 == null) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          this.a(param1, -1, param5);
          if (param11 == 0) {
            param11 = this.metrics.lineAdvance;
          }
          if (param11 + this.metrics.maxDescent + this.metrics.maxAscent > param0 &&
            param0 < param11 + param11) {
            var18 = null;
          } else {
            var18 = new int[]{param7};
          }
          var20 = 109 / ((param13 - 48) / 39);
          if (-1 == param2) {
            param2 = param0 / param11;
            if (0 >= param2) {
              param2 = 1;
            }
          }
          var19 = this.metrics.wrapText(-121, param12, (int[]) (var18), vi.field_p, param6);
          if (0 < param2 &&
            var19 >= param2) {
            var19 = param2;
            vi.field_p[param2 - 1] = this.metrics.a(param12, 0, param7, vi.field_p[-1 + param2]);
          }
          if (3 == param4 &&
            var19 == 1) {
            param4 = 1;
          }
          if (param4 == 0) {
            var21 = this.metrics.maxAscent + param9;
          } else {
            if (param4 == 1) {
              var21 = (-this.metrics.maxDescent + (-this.metrics.maxAscent + (param0 - (-1 + var19) * param11))) / 2 + this.metrics.maxAscent + param9;
            } else {
              if (param4 == 2) {
                var21 = -((-1 + var19) * param11) - this.metrics.maxDescent + (param0 + param9);
              } else {
                var22 = (-this.metrics.maxDescent - this.metrics.maxAscent + param0 - (var19 - 1) * param11) / (var19 + 1);
                if (0 > var22) {
                  var22 = 0;
                }
                var21 = this.metrics.maxAscent + (param9 + var22);
                param11 = param11 + var22;
              }
            }
          }
          for (var22Lifetime1 = 0; var22Lifetime1 < var19; var22Lifetime1++) {
            if (param8 == 0) {
              this.a(param16, param12, param15, vi.field_p[var22Lifetime1], (byte) 5, param14, var21, param3, param10);
            } else {
              if (param8 == 1) {
                this.a(param16, param12, param15 + (-this.metrics.measureTextWidth((byte) 94, vi.field_p[var22Lifetime1]) + param7) / 2, vi.field_p[var22Lifetime1], (byte) 5, param14, var21, param3, param10);
              } else {
                if (param8 != 2) {
                  if (var22Lifetime1 != var19 - 1) {
                    this.a(param7, (byte) 104, vi.field_p[var22Lifetime1]);
                    this.a(param16, param12, param15, vi.field_p[var22Lifetime1], (byte) 5, param14, var21, param3, param10);
                    tm.field_i = 0;
                  } else {
                    this.a(param16, param12, param15, vi.field_p[var22Lifetime1], (byte) 5, param14, var21, param3, param10);
                  }
                } else {
                  this.a(param16, param12, -this.metrics.measureTextWidth((byte) 94, vi.field_p[var22Lifetime1]) + (param15 + param7), vi.field_p[var22Lifetime1], (byte) 5, param14, var21, param3, param10);
                }
              }
            }
            var21 = var21 + param11;
          }
          stackIn_46_0 = var19;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var18 = decompiledCaughtException;
          stackIn_49_0 = var18;
          stackIn_49_1 = new StringBuilder().append("da.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_55_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw pn.a((Throwable) (stackIn_49_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 5) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    RendererBitmapFont(GraphicsRenderer renderer, BitmapFontMetrics metrics) {
        try {
          this.metrics = metrics;
          this.renderer = renderer;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "da.<init>(" + (renderer != null ? "{...}" : "null") + ',' + (metrics != null ? "{...}" : "null") + ')');
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
          this.a(param1, param4 - 18732, param0);
          this.a(0, (RenderSprite[]) null, param2, param3, (byte) 5, (int[]) null, param5, (aa) null, 0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "da.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, RenderSprite[] param1, int param2, String param3, byte param4, int[] param5, int param6, aa param7, int param8) {
        int var13 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
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
        RenderSprite var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
        var20 = null;
        var19 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          param6 = param6 - this.metrics.lineAdvance;
          if (param4 != 5) {
            this.renderer = (GraphicsRenderer) null;
          }
          var10_int = -1;
          var11 = -1;
          var12 = param3.length();
          for (var13 = 0; var13 < var12; var13++) {
            boolean decompiledFrameRemainder0 = true;
            var14 = (char)(255 & ae.a(param3.charAt(var13), 56));
            if (var14 != 60) {
              if (var14 == 62 &&
                -1 != var10_int) {
                var15_ref_String = param3.substring(var10_int + 1, var13);
                var10_int = -1;
                if (var15_ref_String.equals("lt")) {
                  var14 = 60;
                } else {
                  if (!var15_ref_String.equals("gt")) {
                    if (!var15_ref_String.equals("nbsp")) {
                      if (var15_ref_String.equals("shy")) {
                        var14 = 173;
                      } else {
                        if (!var15_ref_String.equals("times")) {
                          if (var15_ref_String.equals("euro")) {
                            var14 = 8364;
                          } else {
                            if (var15_ref_String.equals("copy")) {
                              var14 = 169;
                            } else {
                              if (!var15_ref_String.equals("reg")) {
                                if (!var15_ref_String.startsWith("img=")) {
                                  this.a(var15_ref_String, -16777216);
                                } else {
                                  try {
                                    var21 = (CharSequence) ((Object) var15_ref_String.substring(4));
                                    var16_int = td.a(var21, (byte) 38);
                                    var17 = param1[var16_int];
                                    if (param5 != null) {
                                      stackIn_26_0 = param5[var16_int];
                                    } else {
                                      stackIn_26_0 = var17.c();
                                    }
                                    var18 = stackIn_26_0;
                                    if ((qg.field_c & -16777216) != -16777216) {
                                      var17.a(param2, param6 + this.metrics.lineAdvance - var18, 0, qg.field_c & -16777216 | 16777215, 1);
                                    } else {
                                      var17.a(param2, -var18 + this.metrics.lineAdvance + param6, 1, 0, 1);
                                    }
                                    param2 = param2 + param1[var16_int].d();
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
                            }
                          }
                        } else {
                          var14 = 215;
                        }
                      }
                    } else {
                      var14 = 160;
                    }
                  } else {
                    var14 = 62;
                  }
                }
              }
              if ((decompiledFrameRemainder0) &&
                (var10_int == -1)) {
                if (var11 != -1) {
                  param2 = param2 + this.metrics.getPairKerning(0, (char) var14, var11);
                }
                if (var14 == 32) {
                  if (tm.field_i > 0) {
                    ed.field_i = ed.field_i + tm.field_i;
                    param2 = param2 + (ed.field_i >> 8);
                    ed.field_i = ed.field_i & 255;
                  }
                } else {
                  if (param7 == null) {
                    if (0 != (-16777216 & es.field_c)) {
                      this.fa((char) var14, 1 + param2, param6 + 1, es.field_c, true);
                    }
                    this.fa((char) var14, param2, param6, qg.field_c, false);
                  } else {
                    if (0 != (es.field_c & -16777216)) {
                      this.a((char) var14, 1 + param2, param6 + 1, es.field_c, true, param7, param0, param8);
                    }
                    this.a((char) var14, param2, param6, qg.field_c, false, param7, param0, param8);
                  }
                }
                var15 = this.metrics.measureCharacterAdvance((byte) 109, var14);
                if (rs.field_t != -1) {
                  this.renderer.a(param6 + (int)(0.7 * (double)this.metrics.lineAdvance), rs.field_t, 28321, param2, var15);
                }
                if (PacketBuffer.field_h != -1) {
                  this.renderer.a(1 + (param6 + this.metrics.lineAdvance), PacketBuffer.field_h, 28321, param2, var15);
                }
                param2 = param2 + var15;
                var11 = var14;
              }
            } else {
              var10_int = var13;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var10 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_64_0 = var10;
          stackIn_64_1 = new StringBuilder().append("da.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param8).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, String param2) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var4_int = 0;
          var5 = 0;
          if (param1 <= 98) {
            return;
          }
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
            tm.field_i = (param0 - this.metrics.measureTextWidth((byte) 94, param2) << 8) / var4_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("da.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, byte param5) {
        if (param0 == null) {
          return;
        }
        try {
          this.a(param2, -1, param1);
          if (param5 != 92) {
            this.renderer = (GraphicsRenderer) null;
          }
          this.a(0, (RenderSprite[]) null, param3 - this.metrics.measureTextWidth((byte) 94, param0), param0, (byte) 5, (int[]) null, param4, (aa) null, 0);
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
        PacketBuffer.field_h = param1;
        ed.field_i = 0;
        if (param0 == -1) {
          param0 = 0;
        }
        em.field_d = param0;
        es.field_c = param0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        if (param5 == null) {
          return;
        }
        try {
          this.a(param2, -1, param1);
          this.a(0, (RenderSprite[]) null, -(this.metrics.measureTextWidth((byte) 94, param5) / 2) + param4, param5, (byte) 5, (int[]) null, param3, (aa) null, 0);
          if (param0 < 95) {
            String var8 = (String) null;
            this.a((String) null, 1, -72, -15, 80, (byte) -125);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "da.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int[] param2, byte param3, int param4, String param5, int param6, RenderSprite[] param7) {
        if (param5 == null) {
          return;
        }
        try {
          this.a(param0, -1, param1);
          if (param3 > -93) {
            RendererBitmapFont.a(126, -64);
          }
          this.a(0, param7, -this.metrics.measureTextWidth((byte) 94, param5) + param6, param5, (byte) 5, param2, param4, (aa) null, 0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "da.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7);

    static {
        field_b = new int[128];
    }
}
