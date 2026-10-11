/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    int field_d;
    private byte[] field_g;
    int field_h;
    int field_c;
    private byte[][] field_j;
    int field_i;
    static vf field_f;
    static int[] field_e;
    static mi field_a;
    static int field_b;

    final int a(String param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_f = (vf) null;
          }
          stackIn_4_0 = this.a(0, (hr[]) null, param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ta.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(String param0, boolean param1, String[] param2, int[] param3, hr[] param4) {
        int discarded$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_139_0 = 0;
        int[] stackIn_139_1 = null;
        int stackIn_140_2 = 0;
        int stackIn_150_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_168_0 = 0;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        String stackIn_173_2 = null;
        StringBuilder stackIn_176_1 = null;
        String stackIn_177_2 = null;
        StringBuilder stackIn_180_1 = null;
        String stackIn_181_2 = null;
        StringBuilder stackIn_184_1 = null;
        String stackIn_185_2 = null;
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
        String var19 = null;
        int var20_int = 0;
        Exception var20 = null;
        int var21 = 0;
        var21 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == param0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var6_int = 0;
          var7 = 0;
          var8 = -1;
          var9 = 0;
          var10 = 0;
          var11 = -1;
          if (param1) {
            discarded$0 = this.a(-94, (hr[]) null, (String) null);
          }
          var12 = -1;
          var13 = 0;
          var14 = param0.length();
          var15 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var15 >= var14))) {
            var16 = uo.a(true, param0.charAt(var15)) & 255;
            var17 = 0;
            stackIn_164_0 = ~var16;
            stackIn_164_1 = -61;
            if (var21 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_164_0 == stackIn_164_1) {
                var11 = var15;
              } else {
                if (-1 != var11) {
                  decompiledFrameRemainder0 = (var16 == 62);
                  if (decompiledFrameRemainder0) {
                    var18 = var11;
                    var19 = param0.substring(1 + var11, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                      param2[var13] = param0.substring(var7, var15 + 1);
                      var13++;
                      if (param2.length <= var13) {
                        stackIn_26_0 = 0;
                        return stackIn_26_0;
                      }
                      var7 = 1 + var15;
                      var6_int = 0;
                      var8 = -1;
                      var12 = -1;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      L9: {
                        if (!var19.equals("lt")) {
                          if (var19.equals("gt")) {
                            var17 = var17 + this.a(62, (byte) -53);
                            if (null != this.field_j &&
                              -1 != var12) {
                              var17 = var17 + this.field_j[var12][62];
                            }
                            var12 = 62;
                          } else {
                            if (!var19.equals("nbsp")) {
                              if (var19.equals("shy")) {
                                var17 = var17 + this.a(173, (byte) -53);
                                if (this.field_j != null &&
                                  var12 != -1) {
                                  var17 = var17 + this.field_j[var12][173];
                                }
                                var12 = 173;
                              } else {
                                if (!var19.equals("times")) {
                                  if (!var19.equals("euro")) {
                                    if (!var19.equals("copy")) {
                                      if (!var19.equals("reg")) {
                                        if (!var19.startsWith("img=")) {
                                          break L9;
                                        }
                                        if (param4 == null) {
                                          break L9;
                                        }
                                        try {
                                          var20_int = no.a((byte) -128, (CharSequence) ((Object) var19.substring(4)));
                                          var17 = var17 + param4[var20_int].b();
                                          var12 = -1;
                                          decompiledRegionSelector0 = 0;
                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                          decompiledCaughtException = decompiledCaughtParameter0;
                                          var20 = (Exception) (Object) decompiledCaughtException;
                                          decompiledRegionSelector0 = 0;
                                        }
                                        if (decompiledRegionSelector0 == 0) {
                                          break L9;
                                        }
                                      }
                                      var17 = var17 + this.a(174, (byte) -53);
                                      if (this.field_j != null &&
                                        var12 != -1) {
                                        var17 = var17 + this.field_j[var12][174];
                                      }
                                      var12 = 174;
                                    } else {
                                      var17 = var17 + this.a(169, (byte) -53);
                                      if (null != this.field_j &&
                                        -1 != var12) {
                                        var17 = var17 + this.field_j[var12][169];
                                      }
                                      var12 = 169;
                                    }
                                  } else {
                                    var17 = var17 + this.a(8364, (byte) -53);
                                    if (null != this.field_j &&
                                      var12 != -1) {
                                      var17 = var17 + this.field_j[var12][8364];
                                    }
                                    var12 = 8364;
                                  }
                                } else {
                                  var17 = var17 + this.a(215, (byte) -53);
                                  if (this.field_j != null &&
                                    var12 != -1) {
                                    var17 = var17 + this.field_j[var12][215];
                                  }
                                  var12 = 215;
                                }
                              }
                            } else {
                              var17 = var17 + this.a(160, (byte) -53);
                              if (null != this.field_j &&
                                var12 != -1) {
                                var17 = var17 + this.field_j[var12][160];
                              }
                              var12 = 160;
                            }
                          }
                          break L9;
                        }
                        var17 = var17 + this.a(60, (byte) -53);
                        if (this.field_j != null &&
                          var12 != -1) {
                          var17 = var17 + this.field_j[var12][60];
                        }
                        var12 = 60;
                      }
                      var16 = -1;
                    }
                  }
                } else {
                  var18 = var15;
                  var17 = var17 + this.a(var16, (byte) -53);
                  if (null != this.field_j &&
                    var12 != -1) {
                    var17 = var17 + this.field_j[var12][var16];
                  }
                  var12 = var16;
                }
                if ((decompiledFrameRemainder0) &&
                  (var17 > 0)) {
                  var6_int = var6_int + var17;
                  if (param3 != null) {
                    if (var16 == 32) {
                      var8 = var15;
                      var10 = 1;
                      var9 = var6_int;
                    }
                    stackIn_139_0 = var6_int;
                    stackIn_139_1 = (int[]) (param3);
                    if (var13 >= param3.length) {
                      stackIn_140_2 = -1 + param3.length;
                    } else {
                      stackIn_140_2 = var13;
                    }
                    if (stackIn_139_0 > stackIn_139_1[stackIn_140_2]) {
                      if (0 <= var8) {
                        param2[var13] = param0.substring(var7, 1 + var8 - var10);
                        var13++;
                        if (param2.length <= var13) {
                          stackIn_150_0 = 0;
                          return stackIn_150_0;
                        }
                        var7 = var8 + 1;
                        var6_int = var6_int - var9;
                        var8 = -1;
                        var12 = -1;
                      } else {
                        param2[var13] = param0.substring(var7, var18);
                        var13++;
                        if (param2.length <= var13) {
                          stackIn_156_0 = 0;
                          return stackIn_156_0;
                        }
                        var7 = var18;
                        var6_int = var17;
                        var8 = -1;
                        var12 = -1;
                      }
                    }
                    if (var16 == 45) {
                      var10 = 0;
                      var8 = var15;
                      var9 = var6_int;
                    }
                  }
                }
              }
              var15++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_164_0 = var7;
            stackIn_164_1 = param0.length();
          }
          if (stackIn_164_0 < stackIn_164_1) {
            param2[var13] = param0.substring(var7, param0.length());
            var13++;
          }
          stackIn_168_0 = var13;
          return stackIn_168_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_172_0 = var6;
          stackIn_172_1 = new StringBuilder().append("ta.G(");
          if (param0 == null) {
            stackIn_173_2 = "null";
          } else {
            stackIn_173_2 = "{...}";
          }
          stackIn_176_1 = ((StringBuilder) (Object) stackIn_172_1).append(stackIn_173_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_177_2 = "null";
          } else {
            stackIn_177_2 = "{...}";
          }
          stackIn_180_1 = ((StringBuilder) (Object) stackIn_176_1).append(stackIn_177_2).append(',');
          if (param3 == null) {
            stackIn_181_2 = "null";
          } else {
            stackIn_181_2 = "{...}";
          }
          stackIn_184_1 = ((StringBuilder) (Object) stackIn_180_1).append(stackIn_181_2).append(',');
          if (param4 == null) {
            stackIn_185_2 = "null";
          } else {
            stackIn_185_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_172_0), ((StringBuilder) (Object) stackIn_184_1).append(stackIn_185_2).append(')').toString());
        }
    }

    private final int a(int param0, hr[] param1, String param2) {
        int stackIn_3_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
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
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == param2) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var4_int = -1;
          var5 = -1;
          var6 = 0;
          var7 = param2.length();
          var8 = param0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7 <= var8))) {
            var9 = param2.charAt(var8);
            stackIn_65_0 = -61;
            if (var12 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_65_0 == ~var9) {
                var4_int = var8;
              } else {
                if (var9 == 62 &&
                  var4_int != -1) {
                  var10 = param2.substring(1 + var4_int, var8);
                  var4_int = -1;
                  if (var10.equals("lt")) {
                    var9 = 60;
                  } else {
                    if (var10.equals("gt")) {
                      var9 = 62;
                    } else {
                      if (var10.equals("nbsp")) {
                        var9 = 160;
                      } else {
                        if (var10.equals("shy")) {
                          var9 = 173;
                        } else {
                          if (var10.equals("times")) {
                            var9 = 215;
                          } else {
                            if (var10.equals("euro")) {
                              var9 = 8364;
                            } else {
                              if (var10.equals("copy")) {
                                var9 = 169;
                              } else {
                                if ((!var10.equals("reg")) &&
                                  (decompiledFrameRemainder0 = !(!var10.startsWith("img="))) &&
                                  (decompiledFrameRemainder0 = (param1 != null))) {
                                  try {
                                    var11_int = no.a((byte) -127, (CharSequence) ((Object) var10.substring(4)));
                                    var5 = -1;
                                    var6 = var6 + param1[var11_int].b();
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
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (var4_int == -1)) {
                  var6 = var6 + (255 & this.field_g[uo.a(true, (char) var9) & 255]);
                  if (null != this.field_j &&
                    var5 != -1) {
                    var6 = var6 + this.field_j[var5][var9];
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
            stackIn_65_0 = var6;
          }
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_69_0 = var4;
          stackIn_69_1 = new StringBuilder().append("ta.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -53) {
            this.field_h = -30;
          }
          stackIn_4_0 = this.field_g[param0] & 255;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "ta.E(" + param0 + ',' + param1 + ')');
        }
    }

    final String a(int param0, String param1, hr[] param2, int param3) {
        String stackIn_5_0 = null;
        String stackIn_54_0 = null;
        String stackIn_73_0 = null;
        String stackIn_77_0 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
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
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.a(param3 ^ -63, param2, param1) <= param0) {
            stackIn_5_0 = (String) (param1);
            return stackIn_5_0;
          }
          param0 = param0 - this.a(param3 ^ param3, (hr[]) null, "...");
          var5_int = -1;
          var6 = -1;
          var7 = 0;
          var8 = param1.length();
          var9 = "";
          var10 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 <= var10))) {
            stackIn_77_0 = (String) (param1);
            if (var14 == 0) {
              boolean decompiledFrameRemainder0 = true;
              var11 = ((String) (Object) stackIn_77_0).charAt(var10);
              if (60 == var11) {
                var5_int = var10;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (var11 == 62 &&
                  var5_int != -1) {
                  var12_ref_String = param1.substring(var5_int + 1, var10);
                  var5_int = -1;
                  if (var12_ref_String.equals("lt")) {
                    var11 = 60;
                  } else {
                    if (!var12_ref_String.equals("gt")) {
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
                                if ((!var12_ref_String.equals("reg")) &&
                                  (decompiledFrameRemainder0 = !(!var12_ref_String.startsWith("img="))) &&
                                  (decompiledFrameRemainder0 = (null != param2))) {
                                  try {
                                    var13_int = no.a((byte) -127, (CharSequence) ((Object) var12_ref_String.substring(4)));
                                    var6 = -1;
                                    var7 = var7 + param2[var13_int].b();
                                    if (var7 > param0) {
                                      stackIn_54_0 = var9 + "...";
                                      return stackIn_54_0;
                                    }
                                    var9 = param1.substring(0, 1 + var10);
                                    decompiledRegionSelector0 = 0;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var13 = (Exception) (Object) decompiledCaughtException;
                                    decompiledRegionSelector0 = 0;
                                  }
                                  decompiledFrameRemainder0 = (decompiledRegionSelector0 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  var11 = 174;
                                  decompiledFrameRemainder1 = false;
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
                    if ((decompiledFrameRemainder1) &&
                      (decompiledFrameRemainder0)) {
                      var11 = 62;
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (var5_int == -1)) {
                  var7 = var7 + (this.field_g[uo.a(true, (char) var11) & 255] & 255);
                  if (null != this.field_j &&
                    var6 != -1) {
                    var7 = var7 + this.field_j[var6][var11];
                  }
                  var6 = var11;
                  var12 = var7;
                  if (this.field_j != null) {
                    var12 = var12 + this.field_j[var11][46];
                  }
                  if (var12 > param0) {
                    stackIn_73_0 = var9 + "...";
                    return stackIn_73_0;
                  }
                  var9 = param1.substring(0, var10 + 1);
                }
              }
              var10++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_77_0 = (String) (param1);
          }
          return stackIn_77_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_81_0 = var5;
          stackIn_81_1 = new StringBuilder().append("ta.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',');
          if (param2 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param3).append(')').toString());
        }
    }

    final static wb[] a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        wb[] stackIn_2_0 = null;
        wb[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 87) {
            stackIn_4_0 = ni.a(param3, 1, 0, param0, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = (wb[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var4), "ta.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int a(int param0, char param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        byte stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -49) {
            this.a(-23, (byte) 121);
          }
          if (null != this.field_j) {
            stackIn_7_0 = this.field_j[param2][param1];
            return stackIn_7_0;
          }
          stackIn_5_0 = 0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var4), "ta.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        try {
          field_f = null;
          field_e = null;
          field_a = null;
          if (param0) {
            field_b = -45;
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ta.B(" + param0 + ')');
        }
    }

    ta(byte[] param0) {
        byte[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_8_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        fs var2 = null;
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
        int stackIn_77_0Lifetime1;
        int var7_intLifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2 = new fs(param0);
          var3 = var2.e(-31302);
          if (var3 != 0) {
            throw new RuntimeException("");
          }
          stackIn_8_0 = (1 != var2.e(-31302)) ? 0 : 1;
          boolean decompiledFrameCompleted0 = true;
          var4 = stackIn_8_0;
          this.field_g = new byte[256];
          var2.a(this.field_g, 256, 0, (byte) -101);
          if (var4 == 0) {
            this.field_d = var2.e(-31302);
          }
          if (var4 != 0 ||
            var12 != 0) {
            var5 = new int[256];
            var7_int = 0;
            while (var7_int < 256) {
              var5[var7_int] = var2.e(-31302);
              var7_int++;
              if (var12 != 0) {
                return;
              }
            }
            var6 = new int[256];
            var7_intLifetime1 = 0;
            while (var7_intLifetime1 < 256) {
              var6[var7_intLifetime1] = var2.e(-31302);
              var7_intLifetime1++;
              if (var12 != 0) {
                return;
              }
            }
            var7 = new byte[256][];
            var8_int = 0;
            L10: while (true) {
              if (var8_int < 256) {
                array$0 = new byte[var5[var8_int]];
                var7[var8_int] = array$0;
                var9 = 0;
                stackIn_36_0 = 0;
                if (var12 != 0) {
                  break L10;
                }
                var10 = stackIn_36_0;
                while (var10 < var7[var8_int].length) {
                  var9 = (byte)(var9 + var2.d(true));
                  var7[var8_int][var10] = (byte) var9;
                  var10++;
                }
                var8_int++;
                continue;
              }
              stackIn_36_0 = 256;
              break;
            }
            var8 = new byte[stackIn_36_0][];
            var9Lifetime1 = 0;
            L16: while (true) {
              if (var9Lifetime1 < 256) {
                array$1 = new byte[var5[var9Lifetime1]];
                var8[var9Lifetime1] = array$1;
                var10Lifetime1 = 0;
                stackIn_48_0 = 0;
                if (var12 != 0) {
                  break L16;
                }
                var11 = stackIn_48_0;
                while (var8[var9Lifetime1].length > var11) {
                  var10Lifetime1 = (byte)(var10Lifetime1 + var2.d(true));
                  var8[var9Lifetime1][var11] = (byte) var10Lifetime1;
                  var11++;
                }
                var9Lifetime1++;
                continue;
              }
              this.field_j = new byte[256][256];
              stackIn_48_0 = 0;
              break;
            }
            var9Lifetime2 = stackIn_48_0;
            while (true) {
              stackIn_50_0 = var9Lifetime2;
              stackIn_50_1 = 256;
              if (stackIn_50_0 < stackIn_50_1) {
                stackIn_77_0 = ~var9Lifetime2;
                if (var12 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_77_0 != -33 && (160 != var9Lifetime2 ||
                  var12 != 0)) {
                  var10Lifetime2 = 0;
                  while (var10Lifetime2 < 256) {
                    stackIn_50_0 = var10Lifetime2;
                    stackIn_50_1 = 32;
                    if (stackIn_50_0 != stackIn_50_1 && (var10Lifetime2 != 160 ||
                      var12 != 0)) {
                      this.field_j[var9Lifetime2][var10Lifetime2] = (byte)ej.a(var9Lifetime2, var10Lifetime2, this.field_g, var7, var6, (byte) -75, var8, var5);
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
              this.field_d = var6[32] + var5[32];
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_h = var2.e(-31302);
            stackIn_77_0Lifetime1 = var2.e(-31302);
          }
          this.field_i = var2.e(-31302);
          this.field_c = var2.e(-31302);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_82_0 = var2_ref;
          stackIn_82_1 = new StringBuilder().append("ta.<init>(");
          if (param0 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(')').toString());
        }
    }

    static {
        field_f = new vf();
        field_e = new int[8192];
        field_a = new mi();
    }
}
