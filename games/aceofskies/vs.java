/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    private byte[] field_d;
    int field_j;
    int field_e;
    private byte[][] field_h;
    static int[] field_b;
    int field_a;
    static boolean field_f;
    static sn[] field_c;
    int field_i;
    static gh field_g;

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 106) {
            this.a((pa[]) null, -22, 118, (String) null);
          }
          stackIn_4_0 = this.field_d[param1] & 255;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "vs.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static int b(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -76) {
            field_b = (int[]) null;
          }
          stackIn_4_0 = -ac.field_c + je.field_a;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "vs.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_c = null;
          field_g = null;
          if (param0 <= 108) {
            vs.a(77);
          }
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "vs.E(" + param0 + ')');
        }
    }

    private final int a(String param0, byte param1, pa[] param2) {
        int stackIn_3_0 = 0;
        int stackIn_73_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11_int = 0;
        Exception var11 = null;
        int var12 = 0;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (null == param0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var4_int = -1;
          var5 = -1;
          var6 = 0;
          var7 = param0.length();
          if (param1 != -113) {
            this.field_j = -25;
          }
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 >= var7))) {
            var9 = param0.charAt(var8);
            stackIn_73_0 = -61;
            if (var12 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_73_0 == ~var9) {
                var4_int = var8;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (var9 == 62 &&
                  var4_int != -1) {
                  var10 = param0.substring(var4_int + 1, var8);
                  var4_int = -1;
                  if (!var10.equals("lt")) {
                    if (!var10.equals("gt")) {
                      if (!var10.equals("nbsp")) {
                        if (!var10.equals("shy")) {
                          if (var10.equals("times")) {
                            var9 = 215;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if (var10.equals("euro")) {
                              var9 = 8364;
                              decompiledFrameRemainder1 = false;
                            }
                            else {
                              if (!var10.equals("copy")) {
                                if ((!var10.equals("reg")) &&
                                  (decompiledFrameRemainder0 = !(!var10.startsWith("img="))) &&
                                  (decompiledFrameRemainder0 = (param2 != null))) {
                                  try {
                                    var11_int = td.a((CharSequence) ((Object) var10.substring(4)), (byte) 38);
                                    var5 = -1;
                                    var6 = var6 + param2[var11_int].d();
                                    decompiledRegionSelector0 = 0;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var11 = (Exception) (Object) decompiledCaughtException;
                                    decompiledRegionSelector0 = 0;
                                  }
                                  decompiledFrameRemainder0 = (decompiledRegionSelector0 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  var9 = 174;
                                  decompiledFrameRemainder1 = false;
                                }
                              }
                              if ((decompiledFrameRemainder1) &&
                                (decompiledFrameRemainder0)) {
                                var9 = 169;
                                decompiledFrameRemainder1 = false;
                              }
                            }
                          }
                        }
                        if ((decompiledFrameRemainder1) &&
                          (decompiledFrameRemainder0)) {
                          var9 = 173;
                          decompiledFrameRemainder1 = false;
                        }
                      }
                      if ((decompiledFrameRemainder1) &&
                        (decompiledFrameRemainder0)) {
                        var9 = 160;
                        decompiledFrameRemainder1 = false;
                      }
                    }
                    if ((decompiledFrameRemainder1) &&
                      (decompiledFrameRemainder0)) {
                      var9 = 62;
                      decompiledFrameRemainder1 = false;
                    }
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder0)) {
                    var9 = 60;
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (var4_int == -1)) {
                  var6 = var6 + (this.field_d[255 & ae.a((char) var9, param1 ^ 1)] & 255);
                  if (this.field_h != null &&
                    var5 != -1) {
                    var6 = var6 + this.field_h[var5][var9];
                  }
                  var5 = var9;
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_73_0 = var6;
          }
          return stackIn_73_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_77_0 = var4;
          stackIn_77_1 = new StringBuilder().append("vs.C(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    final String a(pa[] param0, int param1, int param2, String param3) {
        String stackIn_5_0 = null;
        String stackIn_55_0 = null;
        String stackIn_75_0 = null;
        String stackIn_79_0 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int var13_int = 0;
        Exception var13 = null;
        int var14 = 0;
        var14 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (this.a(param3, (byte) -113, param0) <= param2) {
            stackIn_5_0 = (String) (param3);
            return stackIn_5_0;
          }
          param2 = param2 - this.a("...", (byte) -113, (pa[]) null);
          var5_int = -1;
          var6 = -1;
          var7 = 0;
          var8 = param3.length();
          var9 = "";
          var10 = param1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 <= var10))) {
            stackIn_79_0 = (String) (param3);
            if (var14 == 0) {
              boolean decompiledFrameRemainder0 = true;
              var11 = ((String) (Object) stackIn_79_0).charAt(var10);
              if (var11 == 60) {
                var5_int = var10;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (var11 == 62 &&
                  var5_int != -1) {
                  var12_ref_String = param3.substring(var5_int + 1, var10);
                  var5_int = -1;
                  if (!var12_ref_String.equals("lt")) {
                    if (var12_ref_String.equals("gt")) {
                      var11 = 62;
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      if (var12_ref_String.equals("nbsp")) {
                        var11 = 160;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        if (var12_ref_String.equals("shy")) {
                          var11 = 173;
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          if (var12_ref_String.equals("times")) {
                            var11 = 215;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if (!var12_ref_String.equals("euro")) {
                              if (var12_ref_String.equals("copy")) {
                                var11 = 169;
                                decompiledFrameRemainder1 = false;
                              }
                              else {
                                if (var12_ref_String.equals("reg")) {
                                  var11 = 174;
                                  decompiledFrameRemainder1 = false;
                                }
                                else {
                                  decompiledFrameRemainder0 = !(!var12_ref_String.startsWith("img="));
                                  if ((decompiledFrameRemainder0) &&
                                    (decompiledFrameRemainder0 = (null != param0))) {
                                    try {
                                      var13_int = td.a((CharSequence) ((Object) var12_ref_String.substring(4)), (byte) 38);
                                      var7 = var7 + param0[var13_int].d();
                                      var6 = -1;
                                      if (param2 < var7) {
                                        stackIn_55_0 = var9 + "...";
                                        return stackIn_55_0;
                                      }
                                      var9 = param3.substring(0, 1 + var10);
                                      decompiledRegionSelector0 = 0;
                                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      var13 = (Exception) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 0;
                                    }
                                    decompiledFrameRemainder0 = (decompiledRegionSelector0 != 0);
                                  }
                                }
                              }
                            }
                            if ((decompiledFrameRemainder1) &&
                              (decompiledFrameRemainder0)) {
                              var11 = 8364;
                              decompiledFrameRemainder1 = false;
                            }
                          }
                        }
                      }
                    }
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder0)) {
                    var11 = 60;
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (var5_int == -1)) {
                  var7 = var7 + (255 & this.field_d[ae.a((char) var11, -128) & 255]);
                  if (null != this.field_h &&
                    var6 != -1) {
                    var7 = var7 + this.field_h[var6][var11];
                  }
                  var6 = var11;
                  var12 = var7;
                  if (this.field_h != null) {
                    var12 = var12 + this.field_h[var11][46];
                  }
                  if (var12 > param2) {
                    stackIn_75_0 = var9 + "...";
                    return stackIn_75_0;
                  }
                  var9 = param3.substring(0, var10 + 1);
                }
              }
              var10++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_79_0 = (String) (param3);
          }
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_83_0 = var5;
          stackIn_83_1 = new StringBuilder().append("vs.D(");
          if (param0 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_87_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(')').toString());
        }
    }

    final int a(int param0, char param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        byte stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.a((byte) -7, 58);
          }
          if (null != this.field_h) {
            stackIn_7_0 = this.field_h[param2][param1];
            return stackIn_7_0;
          }
          stackIn_5_0 = 0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var4), "vs.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(int param0, pa[] param1, int[] param2, String[] param3, String param4) {
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_130_0 = 0;
        int[] stackIn_130_1 = null;
        int stackIn_131_2 = 0;
        int stackIn_141_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        int stackIn_157_0 = 0;
        RuntimeException stackIn_161_0 = null;
        StringBuilder stackIn_161_1 = null;
        String stackIn_162_2 = null;
        StringBuilder stackIn_165_1 = null;
        String stackIn_166_2 = null;
        StringBuilder stackIn_169_1 = null;
        String stackIn_170_2 = null;
        StringBuilder stackIn_173_1 = null;
        String stackIn_174_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        String var20 = null;
        int var21_int = 0;
        Exception var21 = null;
        int var22 = 0;
        var22 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (param4 == null) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var6_int = 0;
          var7 = 0;
          var8 = -1;
          var9 = 0;
          var10 = 0;
          var11 = -1;
          var13 = -22 / ((-48 - param0) / 48);
          var12 = -1;
          var14 = 0;
          var15 = param4.length();
          var16 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var15 <= var16))) {
            var17 = ae.a(param4.charAt(var16), 102) & 255;
            var18 = 0;
            stackIn_153_0 = -61;
            stackIn_153_1 = ~var17;
            if (var22 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_153_0 == stackIn_153_1) {
                var11 = var16;
              } else {
                if (var11 != -1) {
                  decompiledFrameRemainder0 = (var17 == 62);
                  if (decompiledFrameRemainder0) {
                    var19 = var11;
                    var20 = param4.substring(1 + var11, var16);
                    var11 = -1;
                    if (var20.equals("br")) {
                      param3[var14] = param4.substring(var7, var16 + 1);
                      var14++;
                      if (param3.length <= var14) {
                        stackIn_23_0 = 0;
                        return stackIn_23_0;
                      }
                      var6_int = 0;
                      var8 = -1;
                      var12 = -1;
                      var7 = 1 + var16;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      L8: {
                        if (var20.equals("lt")) {
                          var18 = var18 + this.a((byte) 111, 60);
                          if (null != this.field_h &&
                            var12 != -1) {
                            var18 = var18 + this.field_h[var12][60];
                          }
                          var12 = 60;
                        } else {
                          if (!var20.equals("gt")) {
                            if (var20.equals("nbsp")) {
                              var18 = var18 + this.a((byte) 107, 160);
                              if (this.field_h != null &&
                                var12 != -1) {
                                var18 = var18 + this.field_h[var12][160];
                              }
                              var12 = 160;
                            } else {
                              if (!var20.equals("shy")) {
                                if (var20.equals("times")) {
                                  var18 = var18 + this.a((byte) 108, 215);
                                  if (null != this.field_h &&
                                    -1 != var12) {
                                    var18 = var18 + this.field_h[var12][215];
                                  }
                                  var12 = 215;
                                } else {
                                  if (!var20.equals("euro")) {
                                    if (var20.equals("copy")) {
                                      var18 = var18 + this.a((byte) 108, 169);
                                      if (this.field_h != null &&
                                        var12 != -1) {
                                        var18 = var18 + this.field_h[var12][169];
                                      }
                                      var12 = 169;
                                    } else {
                                      if (!var20.equals("reg")) {
                                        if (!var20.startsWith("img=")) {
                                          break L8;
                                        }
                                        if (null == param1) {
                                          break L8;
                                        }
                                        try {
                                          var21_int = td.a((CharSequence) ((Object) var20.substring(4)), (byte) 38);
                                          var12 = -1;
                                          var18 = var18 + param1[var21_int].d();
                                          decompiledRegionSelector0 = 0;
                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                          decompiledCaughtException = decompiledCaughtParameter0;
                                          var21 = (Exception) (Object) decompiledCaughtException;
                                          decompiledRegionSelector0 = 0;
                                        }
                                        if (decompiledRegionSelector0 == 0) {
                                          break L8;
                                        }
                                      }
                                      var18 = var18 + this.a((byte) 126, 174);
                                      if (this.field_h != null &&
                                        -1 != var12) {
                                        var18 = var18 + this.field_h[var12][174];
                                      }
                                      var12 = 174;
                                    }
                                  } else {
                                    var18 = var18 + this.a((byte) 111, 8364);
                                    if (this.field_h != null &&
                                      -1 != var12) {
                                      var18 = var18 + this.field_h[var12][8364];
                                    }
                                    var12 = 8364;
                                  }
                                }
                              } else {
                                var18 = var18 + this.a((byte) 110, 173);
                                if (this.field_h != null &&
                                  var12 != -1) {
                                  var18 = var18 + this.field_h[var12][173];
                                }
                                var12 = 173;
                              }
                            }
                            break L8;
                          }
                          var18 = var18 + this.a((byte) 118, 62);
                          if (null != this.field_h &&
                            var12 != -1) {
                            var18 = var18 + this.field_h[var12][62];
                          }
                          var12 = 62;
                        }
                      }
                      var17 = -1;
                    }
                  }
                } else {
                  var19 = var16;
                  var18 = var18 + this.a((byte) 113, var17);
                  if (this.field_h != null &&
                    var12 != -1) {
                    var18 = var18 + this.field_h[var12][var17];
                  }
                  var12 = var17;
                }
                if ((decompiledFrameRemainder0) &&
                  (var18 > 0)) {
                  var6_int = var6_int + var18;
                  if (param2 != null) {
                    if (var17 == 32) {
                      var10 = 1;
                      var8 = var16;
                      var9 = var6_int;
                    }
                    stackIn_130_0 = ~var6_int;
                    stackIn_130_1 = (int[]) (param2);
                    if (var14 < param2.length) {
                      stackIn_131_2 = var14;
                    } else {
                      stackIn_131_2 = param2.length - 1;
                    }
                    if (stackIn_130_0 < ~stackIn_130_1[stackIn_131_2]) {
                      if (0 <= var8) {
                        param3[var14] = param4.substring(var7, var8 + 1 - var10);
                        var14++;
                        if (var14 >= param3.length) {
                          stackIn_141_0 = 0;
                          return stackIn_141_0;
                        }
                        var7 = var8 + 1;
                        var8 = -1;
                        var12 = -1;
                        var6_int = var6_int - var9;
                      } else {
                        param3[var14] = param4.substring(var7, var19);
                        var14++;
                        if (param3.length <= var14) {
                          stackIn_147_0 = 0;
                          return stackIn_147_0;
                        }
                        var7 = var19;
                        var8 = -1;
                        var12 = -1;
                        var6_int = var18;
                      }
                    }
                    if (var17 == 45) {
                      var8 = var16;
                      var10 = 0;
                      var9 = var6_int;
                    }
                  }
                }
              }
              var16++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_153_0 = param4.length();
            stackIn_153_1 = var7;
          }
          if (stackIn_153_0 > stackIn_153_1) {
            param3[var14] = param4.substring(var7, param4.length());
            var14++;
          }
          stackIn_157_0 = var14;
          return stackIn_157_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_161_0 = var6;
          stackIn_161_1 = new StringBuilder().append("vs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_162_2 = "null";
          } else {
            stackIn_162_2 = "{...}";
          }
          stackIn_165_1 = ((StringBuilder) (Object) stackIn_161_1).append(stackIn_162_2).append(',');
          if (param2 == null) {
            stackIn_166_2 = "null";
          } else {
            stackIn_166_2 = "{...}";
          }
          stackIn_169_1 = ((StringBuilder) (Object) stackIn_165_1).append(stackIn_166_2).append(',');
          if (param3 == null) {
            stackIn_170_2 = "null";
          } else {
            stackIn_170_2 = "{...}";
          }
          stackIn_173_1 = ((StringBuilder) (Object) stackIn_169_1).append(stackIn_170_2).append(',');
          if (param4 == null) {
            stackIn_174_2 = "null";
          } else {
            stackIn_174_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_161_0), ((StringBuilder) (Object) stackIn_173_1).append(stackIn_174_2).append(')').toString());
        }
    }

    final int a(byte param0, String param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 94) {
            stackIn_4_0 = this.a(param1, (byte) -113, (pa[]) null);
            return stackIn_4_0;
          }
          stackIn_2_0 = 39;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vs.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    vs(byte[] param0) {
        byte[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_8_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        rb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7_int = 0;
        byte[][] var7 = null;
        int var8_int = 0;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          var2 = new rb(param0);
          var3 = var2.g(-52);
          if (0 != var3) {
            throw new RuntimeException("");
          }
          stackIn_8_0 = (var2.g(43) != 1) ? 0 : 1;
          boolean decompiledFrameCompleted0 = true;
          var4 = stackIn_8_0;
          this.field_d = new byte[256];
          var2.a(0, 7186, 256, this.field_d);
          if (var4 != 0) {
            var5 = new int[256];
            var6 = new int[256];
            var7_int = 0;
            do {
              if (var7_int >= 256) {
                var7_int = 0;
                break;
              }
              var5[var7_int] = var2.g(-87);
              var7_int++;
            } while (var12 == 0);
            while (var7_int < 256) {
              var6[var7_int] = var2.g(-51);
              var7_int++;
              if (var12 != 0) {
                return;
              }
            }
            var7 = new byte[256][];
            var8_int = 0;
            L11: while (true) {
              if (256 > var8_int) {
                array$0 = new byte[var5[var8_int]];
                var7[var8_int] = array$0;
                var9 = 0;
                stackIn_35_0 = 0;
                if (var12 != 0) {
                  break L11;
                }
                var10 = stackIn_35_0;
                while (var10 < var7[var8_int].length) {
                  var9 = (byte)(var9 + var2.d(0));
                  var7[var8_int][var10] = (byte) var9;
                  var10++;
                }
                var8_int++;
                continue;
              }
              stackIn_35_0 = 256;
              break;
            }
            var8 = new byte[stackIn_35_0][];
            var9Lifetime1 = 0;
            L17: while (true) {
              if (var9Lifetime1 < 256) {
                array$1 = new byte[var5[var9Lifetime1]];
                var8[var9Lifetime1] = array$1;
                var10Lifetime1 = 0;
                stackIn_47_0 = 0;
                if (var12 != 0) {
                  break L17;
                }
                var11 = stackIn_47_0;
                while (var8[var9Lifetime1].length > var11) {
                  var10Lifetime1 = (byte)(var10Lifetime1 + var2.d(0));
                  var8[var9Lifetime1][var11] = (byte) var10Lifetime1;
                  var11++;
                }
                var9Lifetime1++;
                continue;
              }
              this.field_h = new byte[256][256];
              stackIn_47_0 = 0;
              break;
            }
            var9Lifetime2 = stackIn_47_0;
            while (true) {
              stackIn_49_0 = ~var9Lifetime2;
              stackIn_49_1 = -257;
              if (stackIn_49_0 > stackIn_49_1) {
                stackIn_75_0 = var9Lifetime2;
                if (var12 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_75_0 != 32 &&
                  160 != var9Lifetime2) {
                  var10Lifetime2 = 0;
                  while (var10Lifetime2 < 256) {
                    stackIn_49_0 = ~var10Lifetime2;
                    stackIn_49_1 = -33;
                    if (stackIn_49_0 != stackIn_49_1 && (var10Lifetime2 != 160 ||
                      var12 != 0)) {
                      this.field_h[var9Lifetime2][var10Lifetime2] = (byte)sb.a(var8, var10Lifetime2, -1, var5, var6, var7, var9Lifetime2, this.field_d);
                    }
                    var10Lifetime2++;
                  }
                }
                var9Lifetime2++;
                continue;
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              this.field_e = var6[32] + var5[32];
            }
          }
          if (decompiledFrameCompleted0) {
            if (var4 == 0 ||
              var12 != 0) {
              this.field_e = var2.g(76);
            }
            this.field_a = var2.g(-110);
            stackIn_75_0 = var2.g(96);
          }
          this.field_j = var2.g(-103);
          this.field_i = var2.g(-48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_80_0 = var2_ref;
          stackIn_80_1 = new StringBuilder().append("vs.<init>(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    static {
    }
}
