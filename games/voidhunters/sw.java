/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sw {
    int field_a;
    int field_e;
    int field_d;
    private byte[][] field_g;
    int field_c;
    private byte[] field_b;
    static boolean field_f;

    final int a(String param0, aja[] param1, int[] param2, String[] param3, int param4) {
        int stackIn_3_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_137_0 = 0;
        int[] stackIn_137_1 = null;
        int stackIn_138_2 = 0;
        int stackIn_146_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_164_0 = 0;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        String stackIn_169_2 = null;
        StringBuilder stackIn_172_1 = null;
        String stackIn_173_2 = null;
        StringBuilder stackIn_176_1 = null;
        String stackIn_177_2 = null;
        StringBuilder stackIn_180_1 = null;
        String stackIn_181_2 = null;
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
        var21 = VoidHunters.field_G;
        try {
          if (param0 == null) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var6_int = 0;
          var7 = 0;
          var8 = -1;
          var9 = 0;
          var10 = 0;
          var11 = -1;
          var12 = -1;
          if (param4 != 4) {
            this.a(-30, 'ﾮ', -56);
          }
          var13 = 0;
          var14 = param0.length();
          var15 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var14 <= var15))) {
            var16 = 255 & aea.a(-122, param0.charAt(var15));
            var17 = 0;
            stackIn_160_0 = ~var16;
            stackIn_160_1 = -61;
            if (var21 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_160_0 == stackIn_160_1) {
                var11 = var15;
              } else {
                if (-1 == var11) {
                  var17 = var17 + this.a(var16, (byte) 104);
                  var18 = var15;
                  if (null != this.field_g &&
                    var12 != -1) {
                    var17 = var17 + this.field_g[var12][var16];
                  }
                  var12 = var16;
                } else {
                  decompiledFrameRemainder0 = (62 == var16);
                  if (decompiledFrameRemainder0) {
                    var18 = var11;
                    var19 = param0.substring(1 + var11, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                      param3[var13] = param0.substring(var7, var15 + 1);
                      var13++;
                      if (var13 >= param3.length) {
                        stackIn_34_0 = 0;
                        return stackIn_34_0;
                      }
                      var7 = var15 + 1;
                      var12 = -1;
                      var8 = -1;
                      var6_int = 0;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      L10: {
                        if (var19.equals("lt")) {
                          var17 = var17 + this.a(60, (byte) 37);
                          if (null != this.field_g &&
                            var12 != -1) {
                            var17 = var17 + this.field_g[var12][60];
                          }
                          var12 = 60;
                        } else {
                          if (!var19.equals("gt")) {
                            if (var19.equals("nbsp")) {
                              var17 = var17 + this.a(160, (byte) 52);
                              if (this.field_g != null &&
                                -1 != var12) {
                                var17 = var17 + this.field_g[var12][160];
                              }
                              var12 = 160;
                            } else {
                              if (var19.equals("shy")) {
                                var17 = var17 + this.a(173, (byte) 100);
                                if (this.field_g != null &&
                                  var12 != -1) {
                                  var17 = var17 + this.field_g[var12][173];
                                }
                                var12 = 173;
                              } else {
                                if (var19.equals("times")) {
                                  var17 = var17 + this.a(215, (byte) 117);
                                  if (this.field_g != null &&
                                    -1 != var12) {
                                    var17 = var17 + this.field_g[var12][215];
                                  }
                                  var12 = 215;
                                } else {
                                  if (var19.equals("euro")) {
                                    var17 = var17 + this.a(8364, (byte) 32);
                                    if (this.field_g != null &&
                                      -1 != var12) {
                                      var17 = var17 + this.field_g[var12][8364];
                                    }
                                    var12 = 8364;
                                  } else {
                                    if (var19.equals("copy")) {
                                      var17 = var17 + this.a(169, (byte) 92);
                                      if (null != this.field_g &&
                                        var12 != -1) {
                                        var17 = var17 + this.field_g[var12][169];
                                      }
                                      var12 = 169;
                                    } else {
                                      if (!var19.equals("reg")) {
                                        if (!var19.startsWith("img=")) {
                                          break L10;
                                        }
                                        if (null == param1) {
                                          break L10;
                                        }
                                        try {
                                          var20_int = lob.a(123, (CharSequence) ((Object) var19.substring(4)));
                                          var17 = var17 + param1[var20_int].c();
                                          var12 = -1;
                                          decompiledRegionSelector0 = 0;
                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                          decompiledCaughtException = decompiledCaughtParameter0;
                                          var20 = (Exception) (Object) decompiledCaughtException;
                                          decompiledRegionSelector0 = 0;
                                        }
                                        if (decompiledRegionSelector0 == 0) {
                                          break L10;
                                        }
                                      }
                                      var17 = var17 + this.a(174, (byte) 56);
                                      if (this.field_g != null &&
                                        var12 != -1) {
                                        var17 = var17 + this.field_g[var12][174];
                                      }
                                      var12 = 174;
                                    }
                                  }
                                }
                              }
                            }
                            break L10;
                          }
                          var17 = var17 + this.a(62, (byte) 76);
                          if (this.field_g != null &&
                            var12 != -1) {
                            var17 = var17 + this.field_g[var12][62];
                          }
                          var12 = 62;
                        }
                      }
                      var16 = -1;
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (var17 > 0)) {
                  var6_int = var6_int + var17;
                  if (null != param2) {
                    if (var16 == 32) {
                      var8 = var15;
                      var10 = 1;
                      var9 = var6_int;
                    }
                    stackIn_137_0 = ~var6_int;
                    stackIn_137_1 = (int[]) (param2);
                    if (param2.length <= var13) {
                      stackIn_138_2 = -1 + param2.length;
                    } else {
                      stackIn_138_2 = var13;
                    }
                    if (stackIn_137_0 < ~stackIn_137_1[stackIn_138_2]) {
                      if (0 <= var8) {
                        param3[var13] = param0.substring(var7, -var10 + (var8 + 1));
                        var13++;
                        if (param3.length <= var13) {
                          stackIn_146_0 = 0;
                          return stackIn_146_0;
                        }
                        var7 = 1 + var8;
                        var8 = -1;
                        var12 = -1;
                        var6_int = var6_int - var9;
                      } else {
                        param3[var13] = param0.substring(var7, var18);
                        var13++;
                        if (param3.length <= var13) {
                          stackIn_154_0 = 0;
                          return stackIn_154_0;
                        }
                        var7 = var18;
                        var8 = -1;
                        var6_int = var17;
                        var12 = -1;
                      }
                    }
                    if (var16 == 45) {
                      var8 = var15;
                      var10 = 0;
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
            stackIn_160_0 = ~var7;
            stackIn_160_1 = ~param0.length();
          }
          if (stackIn_160_0 > stackIn_160_1) {
            param3[var13] = param0.substring(var7, param0.length());
            var13++;
          }
          stackIn_164_0 = var13;
          return stackIn_164_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_168_0 = var6;
          stackIn_168_1 = new StringBuilder().append("sw.D(");
          if (param0 == null) {
            stackIn_169_2 = "null";
          } else {
            stackIn_169_2 = "{...}";
          }
          stackIn_172_1 = ((StringBuilder) (Object) stackIn_168_1).append(stackIn_169_2).append(',');
          if (param1 == null) {
            stackIn_173_2 = "null";
          } else {
            stackIn_173_2 = "{...}";
          }
          stackIn_176_1 = ((StringBuilder) (Object) stackIn_172_1).append(stackIn_173_2).append(',');
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
          throw rta.a((Throwable) ((Object) stackIn_168_0), ((StringBuilder) (Object) stackIn_180_1).append(stackIn_181_2).append(',').append(param4).append(')').toString());
        }
    }

    final String a(String param0, int param1, int param2, aja[] param3) {
        String stackIn_5_0 = null;
        String stackIn_57_0 = null;
        String stackIn_80_0 = null;
        String stackIn_84_0 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_89_2 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14_int = 0;
        Exception var14 = null;
        int var15 = 0;
        var15 = VoidHunters.field_G;
        try {
          if (param1 >= this.a(62, param0, param3)) {
            stackIn_5_0 = (String) (param0);
            return stackIn_5_0;
          }
          var5_int = -22 % ((36 - param2) / 44);
          param1 = param1 - this.a(62, "...", (aja[]) null);
          var6 = -1;
          var7 = -1;
          var8 = 0;
          var9 = param0.length();
          var10 = "";
          var11 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var9 <= var11))) {
            stackIn_84_0 = (String) (param0);
            if (var15 == 0) {
              boolean decompiledFrameRemainder0 = true;
              var12 = ((String) (Object) stackIn_84_0).charAt(var11);
              if (var12 == 60) {
                var6 = var11;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (62 == var12 &&
                  var6 != -1) {
                  var13_ref_String = param0.substring(var6 + 1, var11);
                  var6 = -1;
                  if (!var13_ref_String.equals("lt")) {
                    if (var13_ref_String.equals("gt")) {
                      var12 = 62;
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      if (!var13_ref_String.equals("nbsp")) {
                        if (var13_ref_String.equals("shy")) {
                          var12 = 173;
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          if (var13_ref_String.equals("times")) {
                            var12 = 215;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if (!var13_ref_String.equals("euro")) {
                              if (!var13_ref_String.equals("copy")) {
                                if ((!var13_ref_String.equals("reg")) &&
                                  (decompiledFrameRemainder0 = !(!var13_ref_String.startsWith("img="))) &&
                                  (decompiledFrameRemainder0 = (param3 != null))) {
                                  try {
                                    var14_int = lob.a(78, (CharSequence) ((Object) var13_ref_String.substring(4)));
                                    var8 = var8 + param3[var14_int].c();
                                    var7 = -1;
                                    if (var8 > param1) {
                                      stackIn_57_0 = var10 + "...";
                                      return stackIn_57_0;
                                    }
                                    var10 = param0.substring(0, var11 + 1);
                                    decompiledRegionSelector0 = 0;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var14 = (Exception) (Object) decompiledCaughtException;
                                    decompiledRegionSelector0 = 0;
                                  }
                                  decompiledFrameRemainder0 = (decompiledRegionSelector0 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  var12 = 174;
                                  decompiledFrameRemainder1 = false;
                                }
                              }
                              if ((decompiledFrameRemainder1) &&
                                (decompiledFrameRemainder0)) {
                                var12 = 169;
                                decompiledFrameRemainder1 = false;
                              }
                            }
                            if ((decompiledFrameRemainder1) &&
                              (decompiledFrameRemainder0)) {
                              var12 = 8364;
                              decompiledFrameRemainder1 = false;
                            }
                          }
                        }
                      }
                      if ((decompiledFrameRemainder1) &&
                        (decompiledFrameRemainder0)) {
                        var12 = 160;
                        decompiledFrameRemainder1 = false;
                      }
                    }
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder0)) {
                    var12 = 60;
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (var6 == -1)) {
                  var8 = var8 + (255 & this.field_b[255 & aea.a(-122, (char) var12)]);
                  if (this.field_g != null &&
                    var7 != -1) {
                    var8 = var8 + this.field_g[var7][var12];
                  }
                  var7 = var12;
                  var13 = var8;
                  if (null != this.field_g) {
                    var13 = var13 + this.field_g[var12][46];
                  }
                  if (var13 > param1) {
                    stackIn_80_0 = var10 + "...";
                    return stackIn_80_0;
                  }
                  var10 = param0.substring(0, var11 + 1);
                }
              }
              var11++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_84_0 = (String) (param0);
          }
          return stackIn_84_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_88_0 = var5;
          stackIn_88_1 = new StringBuilder().append("sw.G(");
          if (param0 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(')').toString());
        }
    }

    final int a(String param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            field_f = true;
          }
          stackIn_4_0 = this.a(62, param0, (aja[]) null);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("sw.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        RuntimeException decompiledCaughtException = null;
        var25 = VoidHunters.field_G;
        try {
          var6_int = 0;
          var7 = param2;
          var8 = param5 * param5;
          var9 = param2 * param2;
          var10 = var9 << 1;
          if (param0 >= -112) {
            return;
          }
          var11 = var8 << 1;
          var12 = param2 << 1;
          var13 = (-var12 + 1) * var8 + var10;
          var14 = -((var12 - 1) * var11) + var9;
          var15 = var8 << 2;
          var16 = var9 << 2;
          var17 = (3 + (var6_int << 1)) * var10;
          var18 = var11 * (-3 + (var7 << 1));
          var19 = (1 + var6_int) * var16;
          var20 = var15 * (-1 + var7);
          ww.a(param4, param3 + param5, rba.field_b[param1], (byte) 75, -param5 + param3);
          while (var7 > 0) {
            if (var25 != 0) {
              return;
            }
            if (var13 < 0) {
              while (var13 < 0) {
                var14 = var14 + var19;
                var13 = var13 + var17;
                var6_int++;
                var19 = var19 + var16;
                var17 = var17 + var16;
              }
            }
            if (var14 < 0) {
              var14 = var14 + var19;
              var13 = var13 + var17;
              var19 = var19 + var16;
              var17 = var17 + var16;
              var6_int++;
            }
            var13 = var13 - var20;
            var14 = var14 - var18;
            var20 = var20 - var15;
            var18 = var18 - var15;
            var7--;
            var21 = -var7 + param1;
            var22 = param1 + var7;
            var23 = var6_int + param3;
            var24 = param3 - var6_int;
            ww.a(param4, var23, rba.field_b[var21], (byte) 75, var24);
            ww.a(param4, var23, rba.field_b[var22], (byte) 75, var24);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) runtimeException), "sw.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int a(int param0, String param1, boolean param2, aja[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          var5_int = this.a(param1, param3, new int[]{param0}, to.field_p, 4);
          var6 = 0;
          var7 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7 >= var5_int))) {
            var8 = this.a(62, to.field_p[var7], param3);
            stackIn_10_0 = ~var8;
            stackIn_10_1 = ~var6;
            if (var9 == 0) {
              if (stackIn_10_0 < stackIn_10_1) {
                var6 = var8;
              }
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_10_0 = param2 ? 1 : 0;
            stackIn_10_1 = 1;
          }
          if (stackIn_10_0 != stackIn_10_1) {
            this.a(-9, (byte) -117);
          }
          stackIn_14_0 = var6;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("sw.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final int a(String param0, int param1, int param2, byte param3, aja[] param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            param1 = this.field_a;
          }
          var6_int = this.a(param0, param4, new int[]{param2}, to.field_p, 4);
          if (param3 <= 83) {
            this.a((String) null, 127, 112, (byte) -23, (aja[]) null);
          }
          var7 = (var6_int - 1) * param1;
          stackIn_6_0 = this.field_e + (this.field_c + var7);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("sw.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 21) {
            this.a(-79, 'ﾁ', 63);
          }
          stackIn_4_0 = this.field_b[param0] & 255;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "sw.E(" + param0 + ',' + param1 + ')');
        }
    }

    sw(byte[] param0) {
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
        ds var2 = null;
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
        var12 = VoidHunters.field_G;
        try {
          var2 = new ds(param0);
          var3 = var2.e((byte) -102);
          if (0 != var3) {
            throw new RuntimeException("");
          }
          stackIn_8_0 = (var2.e((byte) -89) != 1) ? 0 : 1;
          boolean decompiledFrameCompleted0 = true;
          var4 = stackIn_8_0;
          this.field_b = new byte[256];
          var2.a(0, this.field_b, (byte) -59, 256);
          if (var4 != 0) {
            var5 = new int[256];
            var6 = new int[256];
            var7_int = 0;
            do {
              if (var7_int >= 256) {
                var7_int = 0;
                break;
              }
              var5[var7_int] = var2.e((byte) -124);
              var7_int++;
            } while (var12 == 0);
            while (var7_int < 256) {
              var6[var7_int] = var2.e((byte) -92);
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
                while (var7[var8_int].length > var10) {
                  var9 = (byte)(var9 + var2.d((byte) -114));
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
                  var10Lifetime1 = (byte)(var10Lifetime1 + var2.d((byte) -114));
                  var8[var9Lifetime1][var11] = (byte) var10Lifetime1;
                  var11++;
                }
                var9Lifetime1++;
                continue;
              }
              this.field_g = new byte[256][256];
              stackIn_47_0 = 0;
              break;
            }
            var9Lifetime2 = stackIn_47_0;
            while (true) {
              stackIn_49_0 = -257;
              stackIn_49_1 = ~var9Lifetime2;
              if (stackIn_49_0 < stackIn_49_1) {
                stackIn_75_0 = var9Lifetime2;
                if (var12 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_75_0 != 32 &&
                  var9Lifetime2 != 160) {
                  var10Lifetime2 = 0;
                  while (var10Lifetime2 < 256) {
                    stackIn_49_0 = 32;
                    stackIn_49_1 = var10Lifetime2;
                    if (stackIn_49_0 != stackIn_49_1 && (var10Lifetime2 != 160 ||
                      var12 != 0)) {
                      this.field_g[var9Lifetime2][var10Lifetime2] = (byte)om.a(this.field_b, var10Lifetime2, var9Lifetime2, var7, false, var8, var5, var6);
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
              this.field_a = var6[32] + var5[32];
            }
          }
          if (decompiledFrameCompleted0) {
            if (var4 == 0 ||
              var12 != 0) {
              this.field_a = var2.e((byte) -104);
            }
            this.field_d = var2.e((byte) -91);
            stackIn_75_0 = var2.e((byte) -88);
          }
          this.field_c = var2.e((byte) -87);
          this.field_e = var2.e((byte) -126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_80_0 = var2_ref;
          stackIn_80_1 = new StringBuilder().append("sw.<init>(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    final int a(int param0, char param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        byte stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -30 % ((41 - param2) / 57);
          if (this.field_g == null) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          stackIn_2_0 = this.field_g[param0][param1];
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var4), "sw.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, String param1, aja[] param2) {
        int stackIn_3_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
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
        var12 = VoidHunters.field_G;
        try {
          if (null == param1) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var4_int = -1;
          var5 = -1;
          var6 = 0;
          var7 = param1.length();
          if (param0 != 62) {
            sw.a((byte) -112, -45, -77, 71, 75, 122);
          }
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 >= var7))) {
            var9 = param1.charAt(var8);
            stackIn_75_0 = var9;
            if (var12 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_75_0 == 60) {
                var4_int = var8;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (62 == var9 &&
                  var4_int != -1) {
                  var10 = param1.substring(1 + var4_int, var8);
                  var4_int = -1;
                  if (var10.equals("lt")) {
                    var9 = 60;
                  } else {
                    if (var10.equals("gt")) {
                      var9 = 62;
                    } else {
                      if (!var10.equals("nbsp")) {
                        if (var10.equals("shy")) {
                          var9 = 173;
                          decompiledFrameRemainder1 = false;
                        }
                        else {
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
                                    var11_int = lob.a(10, (CharSequence) ((Object) var10.substring(4)));
                                    var6 = var6 + param2[var11_int].c();
                                    var5 = -1;
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
                      }
                      if ((decompiledFrameRemainder1) &&
                        (decompiledFrameRemainder0)) {
                        var9 = 160;
                      }
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (var4_int == -1)) {
                  var6 = var6 + (255 & this.field_b[aea.a(-121, (char) var9) & 255]);
                  if (this.field_g != null &&
                    -1 != var5) {
                    var6 = var6 + this.field_g[var5][var9];
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
            stackIn_75_0 = var6;
          }
          return stackIn_75_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_79_0 = var4;
          stackIn_79_1 = new StringBuilder().append("sw.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param2 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(')').toString());
        }
    }

    static {
    }
}
