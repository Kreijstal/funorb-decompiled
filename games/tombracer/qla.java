/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qla {
    int field_h;
    int field_a;
    private byte[] field_e;
    int field_d;
    int field_g;
    private byte[][] field_c;
    static Calendar field_b;
    static kea field_f;
    static String field_i;

    final static eua a(boolean param0, jea param1, jea param2, br param3, jea param4) {
        Object stackIn_5_0 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        eua stackIn_40_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        eua[] var11 = null;
        int var12 = 0;
        br var13_ref_br = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wua var16 = null;
        int var17 = 0;
        int var12Lifetime1;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          if (null == param3) {
            stackIn_5_0 = null;
            return (eua) (stackIn_5_0);
          }
          if (param3.field_q == null) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = param3.field_q.length;
          }
          var5_int = stackIn_10_0;
          if (null == param3.field_l) {
            stackIn_14_0 = 0;
          } else {
            stackIn_14_0 = param3.field_l.length;
          }
          var6 = stackIn_14_0;
          var7 = var6 + var5_int;
          var8 = new String[var7];
          var9 = new char[var7];
          var10 = new int[var7];
          if (!param0) {
            field_b = (Calendar) null;
          }
          boolean decompiledFrameCompleted0 = true;
          var11 = new eua[var7];
          if (null != param3.field_q) {
            var12 = 0;
            while (!(param3.field_q.length <= var12)) {
              var13_ref_br = taa.field_g.a((byte) 98, param3.field_q[var12]);
              var8[var12] = var13_ref_br.field_n;
              var9[var12] = param3.field_k[var12];
              var11[var12] = qla.a(param0, param1, param2, var13_ref_br, param4);
              var12++;
              if (var17 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted0) &&
            (null != param3.field_l)) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            var14 = 0;
            while (!(var14 >= param3.field_l.length)) {
              var15 = param3.field_l[var14];
              if (var15 == -1) {
                var8[var14 + var12Lifetime1] = iw.field_a;
                var9[var14 + var12Lifetime1] = param3.field_o[var14];
                var10[var14 + var12Lifetime1] = param3.field_l[var14];
              }
              if (var15 != -1 ||
                var17 != 0) {
                var16 = qu.field_a.a(false, var15);
                var8[var12Lifetime1 + var14] = var16.b((byte) -5);
                var9[var12Lifetime1 + var14] = param3.field_o[var14];
                if (0 >= var9[var12Lifetime1 + var14]) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char) var13;
                }
                var10[var14 + var12Lifetime1] = param3.field_l[var14];
              }
              var14++;
              if (var17 == 0) {
                continue;
              }
              break;
            }
          }
          stackIn_40_0 = new eua(0L, param4, param2, param1, var11, var10, var8, var9);
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_44_0 = var5;
          stackIn_44_1 = new StringBuilder().append("qla.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
          if (param4 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3Lifetime1;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          try {
            if (!fia.field_j.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (!(param0.length() > var3)))) {
              stackIn_23_0 = -1;
              stackIn_23_1 = var2.indexOf((int) param0.charAt(var3));
              if (var4 == 0) {
                if (stackIn_23_0 == stackIn_23_1) {
                  return false;
                }
                var3++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_23_0 = 20;
              stackIn_23_1 = (77 - param1) / 37;
            }
            var3Lifetime1 = stackIn_23_0 / stackIn_23_1;
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_30_0 = var2_ref2;
          stackIn_30_1 = new StringBuilder().append("qla.K(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1, char param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        byte stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6773) {
            this.field_e = (byte[]) null;
          }
          if (this.field_c != null) {
            stackIn_7_0 = this.field_c[param0][param2];
            return stackIn_7_0;
          }
          stackIn_5_0 = 0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "qla.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(String param0, nh[] param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
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
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 == null) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          var4_int = -1;
          var5 = -1;
          if (param2 >= -60) {
            this.field_e = (byte[]) null;
          }
          var6 = 0;
          var7 = param0.length();
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7 <= var8))) {
            var9 = param0.charAt(var8);
            stackIn_72_0 = 60;
            if (var12 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_72_0 == var9) {
                var4_int = var8;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (var9 == 62 &&
                  var4_int != -1) {
                  var10 = param0.substring(1 + var4_int, var8);
                  var4_int = -1;
                  if (!var10.equals("lt")) {
                    if (var10.equals("gt")) {
                      var9 = 62;
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      if (!var10.equals("nbsp")) {
                        if (var10.equals("shy")) {
                          var9 = 173;
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          if (!var10.equals("times")) {
                            if (var10.equals("euro")) {
                              var9 = 8364;
                              decompiledFrameRemainder1 = false;
                            }
                            else {
                              if (!var10.equals("copy")) {
                                if (var10.equals("reg")) {
                                  var9 = 174;
                                  decompiledFrameRemainder1 = false;
                                }
                                else {
                                  decompiledFrameRemainder0 = !(!var10.startsWith("img="));
                                  if ((decompiledFrameRemainder0) &&
                                    (decompiledFrameRemainder0 = (param1 != null))) {
                                    try {
                                      var11_int = jb.a((CharSequence) ((Object) var10.substring(4)), (byte) 70);
                                      var6 = var6 + param1[var11_int].d();
                                      var5 = -1;
                                      decompiledRegionSelector0 = 0;
                                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      var11 = (Exception) (Object) decompiledCaughtException;
                                      decompiledRegionSelector0 = 0;
                                    }
                                    decompiledFrameRemainder0 = (decompiledRegionSelector0 != 0);
                                  }
                                }
                              }
                              if ((decompiledFrameRemainder1) &&
                                (decompiledFrameRemainder0)) {
                                var9 = 169;
                                decompiledFrameRemainder1 = false;
                              }
                            }
                          }
                          if ((decompiledFrameRemainder1) &&
                            (decompiledFrameRemainder0)) {
                            var9 = 215;
                            decompiledFrameRemainder1 = false;
                          }
                        }
                      }
                      if ((decompiledFrameRemainder1) &&
                        (decompiledFrameRemainder0)) {
                        var9 = 160;
                        decompiledFrameRemainder1 = false;
                      }
                    }
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder0)) {
                    var9 = 60;
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (-1 == var4_int)) {
                  var6 = var6 + (this.field_e[io.a(-377, (char) var9) & 255] & 255);
                  if (this.field_c != null &&
                    var5 != -1) {
                    var6 = var6 + this.field_c[var5][var9];
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
            stackIn_72_0 = var6;
          }
          return stackIn_72_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_76_0 = var4;
          stackIn_76_1 = new StringBuilder().append("qla.C(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param1 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 255) {
            this.a(82, -75);
          }
          stackIn_4_0 = this.field_e[param1] & 255;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "qla.I(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(String param0, int param1, String[] param2, nh[] param3, int[] param4) {
        int stackIn_3_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_141_0 = 0;
        int[] stackIn_141_1 = null;
        int stackIn_142_2 = 0;
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
        var21 = TombRacer.field_G ? 1 : 0;
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
          var13 = 0;
          var14 = param0.length();
          if (param1 > -89) {
            this.field_d = -106;
          }
          var15 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var15 >= var14))) {
            var16 = 255 & io.a(-377, param0.charAt(var15));
            var17 = 0;
            stackIn_164_0 = 60;
            stackIn_164_1 = var16;
            if (var21 == 0) {
              L4: {
                if (stackIn_164_0 == stackIn_164_1) {
                  var11 = var15;
                } else {
                  if (var11 != -1) {
                    if (var16 != 62) {
                      break L4;
                    }
                    L9: {
                      var18 = var11;
                      var19 = param0.substring(var11 + 1, var15);
                      var11 = -1;
                      if (!var19.equals("br")) {
                        if (!var19.equals("lt")) {
                          if (!var19.equals("gt")) {
                            if (var19.equals("nbsp")) {
                              var17 = var17 + this.a(255, 160);
                              if (null != this.field_c &&
                                -1 != var12) {
                                var17 = var17 + this.field_c[var12][160];
                              }
                              var12 = 160;
                            } else {
                              if (!var19.equals("shy")) {
                                if (var19.equals("times")) {
                                  var17 = var17 + this.a(255, 215);
                                  if (null != this.field_c &&
                                    var12 != -1) {
                                    var17 = var17 + this.field_c[var12][215];
                                  }
                                  var12 = 215;
                                } else {
                                  if (!var19.equals("euro")) {
                                    if (var19.equals("copy")) {
                                      var17 = var17 + this.a(255, 169);
                                      if (this.field_c != null &&
                                        var12 != -1) {
                                        var17 = var17 + this.field_c[var12][169];
                                      }
                                      var12 = 169;
                                    } else {
                                      if (!var19.equals("reg")) {
                                        if (!var19.startsWith("img=")) {
                                          break L9;
                                        }
                                        if (null == param3) {
                                          break L9;
                                        }
                                        try {
                                          var20_int = jb.a((CharSequence) ((Object) var19.substring(4)), (byte) 70);
                                          var17 = var17 + param3[var20_int].d();
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
                                      var17 = var17 + this.a(255, 174);
                                      if (this.field_c != null &&
                                        var12 != -1) {
                                        var17 = var17 + this.field_c[var12][174];
                                      }
                                      var12 = 174;
                                    }
                                  } else {
                                    var17 = var17 + this.a(255, 8364);
                                    if (null != this.field_c &&
                                      -1 != var12) {
                                      var17 = var17 + this.field_c[var12][8364];
                                    }
                                    var12 = 8364;
                                  }
                                }
                              } else {
                                var17 = var17 + this.a(255, 173);
                                if (this.field_c != null &&
                                  var12 != -1) {
                                  var17 = var17 + this.field_c[var12][173];
                                }
                                var12 = 173;
                              }
                            }
                          } else {
                            var17 = var17 + this.a(255, 62);
                            if (this.field_c != null &&
                              -1 != var12) {
                              var17 = var17 + this.field_c[var12][62];
                            }
                            var12 = 62;
                          }
                        } else {
                          var17 = var17 + this.a(255, 60);
                          if (null != this.field_c &&
                            var12 != -1) {
                            var17 = var17 + this.field_c[var12][60];
                          }
                          var12 = 60;
                        }
                        break L9;
                      }
                      param2[var13] = param0.substring(var7, 1 + var15);
                      var13++;
                      if (param2.length <= var13) {
                        stackIn_117_0 = 0;
                        return stackIn_117_0;
                      }
                      var8 = -1;
                      var7 = 1 + var15;
                      var6_int = 0;
                      var12 = -1;
                      break L4;
                    }
                    var16 = -1;
                  } else {
                    var17 = var17 + this.a(255, var16);
                    var18 = var15;
                    if (this.field_c != null &&
                      var12 != -1) {
                      var17 = var17 + this.field_c[var12][var16];
                    }
                    var12 = var16;
                  }
                  if (var17 > 0) {
                    var6_int = var6_int + var17;
                    if (param4 != null) {
                      if (var16 == 32) {
                        var8 = var15;
                        var10 = 1;
                        var9 = var6_int;
                      }
                      stackIn_141_0 = var6_int;
                      stackIn_141_1 = (int[]) (param4);
                      if (var13 < param4.length) {
                        stackIn_142_2 = var13;
                      } else {
                        stackIn_142_2 = -1 + param4.length;
                      }
                      if (stackIn_141_0 > stackIn_141_1[stackIn_142_2]) {
                        if (var8 < 0) {
                          param2[var13] = param0.substring(var7, var18);
                          var13++;
                          if (var13 >= param2.length) {
                            stackIn_150_0 = 0;
                            return stackIn_150_0;
                          }
                          var6_int = var17;
                          var8 = -1;
                          var12 = -1;
                          var7 = var18;
                        } else {
                          param2[var13] = param0.substring(var7, 1 + var8 - var10);
                          var13++;
                          if (param2.length <= var13) {
                            stackIn_156_0 = 0;
                            return stackIn_156_0;
                          }
                          var7 = 1 + var8;
                          var6_int = var6_int - var9;
                          var8 = -1;
                          var12 = -1;
                        }
                      }
                      if (var16 == 45) {
                        var8 = var15;
                        var9 = var6_int;
                        var10 = 0;
                      }
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
            stackIn_164_0 = ~var7;
            stackIn_164_1 = ~param0.length();
          }
          if (stackIn_164_0 > stackIn_164_1) {
            param2[var13] = param0.substring(var7, param0.length());
            var13++;
          }
          stackIn_168_0 = var13;
          return stackIn_168_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_172_0 = var6;
          stackIn_172_1 = new StringBuilder().append("qla.J(");
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
          throw tba.a((Throwable) ((Object) stackIn_172_0), ((StringBuilder) (Object) stackIn_184_1).append(stackIn_185_2).append(')').toString());
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 35 % ((param1 + 44) / 54);
          stackIn_1_0 = this.a(param0, (nh[]) null, -61);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("qla.A(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(boolean param0, nh[] param1, String param2, int param3) {
        String stackIn_3_0 = null;
        String stackIn_60_0 = null;
        String stackIn_76_0 = null;
        int stackIn_80_0 = 0;
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
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int var13_int = 0;
        Exception var13 = null;
        int var14 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.a(param2, param1, -93) <= param3) {
            stackIn_3_0 = (String) (param2);
            return stackIn_3_0;
          }
          param3 = param3 - this.a("...", (nh[]) null, -61);
          var5_int = -1;
          var6 = -1;
          var7 = 0;
          var8 = param2.length();
          var9 = "";
          var10 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var10 >= var8))) {
            var11 = param2.charAt(var10);
            stackIn_80_0 = -61;
            if (var14 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_80_0 == ~var11) {
                var5_int = var10;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (var11 == 62 &&
                  var5_int != -1) {
                  var12_ref_String = param2.substring(1 + var5_int, var10);
                  var5_int = -1;
                  if (var12_ref_String.equals("lt")) {
                    var11 = 60;
                  } else {
                    if (!var12_ref_String.equals("gt")) {
                      if (!var12_ref_String.equals("nbsp")) {
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
                            if (var12_ref_String.equals("euro")) {
                              var11 = 8364;
                              decompiledFrameRemainder1 = false;
                            }
                            else {
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
                                    (decompiledFrameRemainder0 = (null != param1))) {
                                    try {
                                      var13_int = jb.a((CharSequence) ((Object) var12_ref_String.substring(4)), (byte) 70);
                                      var6 = -1;
                                      var7 = var7 + param1[var13_int].d();
                                      if (param3 < var7) {
                                        stackIn_60_0 = var9 + "...";
                                        return stackIn_60_0;
                                      }
                                      var9 = param2.substring(0, 1 + var10);
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
                          }
                        }
                      }
                      if ((decompiledFrameRemainder1) &&
                        (decompiledFrameRemainder0)) {
                        var11 = 160;
                        decompiledFrameRemainder1 = false;
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
                  var7 = var7 + (this.field_e[io.a(-377, (char) var11) & 255] & 255);
                  if (null != this.field_c &&
                    -1 != var6) {
                    var7 = var7 + this.field_c[var6][var11];
                  }
                  var6 = var11;
                  var12 = var7;
                  if (this.field_c != null) {
                    var12 = var12 + this.field_c[var11][46];
                  }
                  if (var12 > param3) {
                    stackIn_76_0 = var9 + "...";
                    return stackIn_76_0;
                  }
                  var9 = param2.substring(0, 1 + var10);
                }
              }
              var10++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_80_0 = param0 ? 1 : 0;
          }
          if (stackIn_80_0 != 0) {
            this.a((String) null, (byte) -79);
          }
          stackIn_84_0 = (String) (param2);
          return stackIn_84_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_88_0 = var5;
          stackIn_88_1 = new StringBuilder().append("qla.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_89_2 = "null";
          } else {
            stackIn_89_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',');
          if (param2 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
          String var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          String stackIn_13_0 = null;
          String stackIn_19_0 = null;
          String stackIn_21_0 = null;
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref2 = null;
          var8 = TombRacer.field_G ? 1 : 0;
          try {
            try {
              var2 = param1.getParameter("cookieprefix");
              var3 = var2 + "settings";
              var4 = (String) (lb.b(param1, 2864, "getcookies"));
              var5 = rga.a(param0 + 32287, var4, ';');
              var6 = param0;
              while (var6 < var5.length) {
                var7 = var5[var6].indexOf('=');
                if (var8 == 0) {
                  if (0 <= var7 &&
                    var5[var6].substring(0, var7).trim().equals(var3)) {
                    stackIn_13_0 = var5[var6].substring(var7 + 1).trim();
                    return stackIn_13_0;
                  }
                  var6++;
                  continue;
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref2 = decompiledCaughtException;
            }
            if (ts.field_g == null) {
              stackIn_21_0 = param1.getParameter("settings");
              return stackIn_21_0;
            }
            stackIn_19_0 = ts.field_g;
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var2_ref;
            stackIn_25_1 = new StringBuilder().append("qla.L(").append(param0).append(',');
            if (param1 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(boolean param0, String param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = "Loaded.";
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("qla.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final int a(String param0, int param1, nh[] param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 == param4) {
            param4 = this.field_a;
          }
          var6_int = this.a(param0, -124, dra.field_a, param2, new int[]{param1});
          var7 = (var6_int - 1) * param4;
          var8 = 72 / ((-41 - param3) / 54);
          stackIn_3_0 = this.field_h + var7 + this.field_g;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("qla.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    qla(byte[] param0) {
        byte[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_8_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        uia var2 = null;
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
        int stackIn_74_0Lifetime1;
        int var7_intLifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          var2 = new uia(param0);
          var3 = var2.h(255);
          if (var3 != 0) {
            throw new RuntimeException("");
          }
          stackIn_8_0 = (1 != var2.h(255)) ? 0 : 1;
          boolean decompiledFrameCompleted0 = true;
          var4 = stackIn_8_0;
          this.field_e = new byte[256];
          var2.a(this.field_e, 0, -81, 256);
          if (var4 == 0) {
            this.field_a = var2.h(255);
          }
          if (var4 != 0 ||
            var12 != 0) {
            var5 = new int[256];
            var7_int = 0;
            while (var7_int < 256) {
              var5[var7_int] = var2.h(255);
              var7_int++;
              if (var12 != 0) {
                return;
              }
            }
            var6 = new int[256];
            var7_intLifetime1 = 0;
            while (var7_intLifetime1 < 256) {
              var6[var7_intLifetime1] = var2.h(255);
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
                while (var7[var8_int].length > var10) {
                  var9 = (byte)(var9 + var2.c((byte) 79));
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
                  var10Lifetime1 = (byte)(var10Lifetime1 + var2.c((byte) 93));
                  var8[var9Lifetime1][var11] = (byte) var10Lifetime1;
                  var11++;
                }
                var9Lifetime1++;
                continue;
              }
              this.field_c = new byte[256][256];
              stackIn_48_0 = 0;
              break;
            }
            var9Lifetime2 = stackIn_48_0;
            while (true) {
              stackIn_50_0 = -257;
              stackIn_50_1 = ~var9Lifetime2;
              if (stackIn_50_0 < stackIn_50_1) {
                stackIn_74_0 = 32;
                if (var12 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_74_0 != var9Lifetime2 &&
                  var9Lifetime2 != 160) {
                  var10Lifetime2 = 0;
                  while (var10Lifetime2 < 256) {
                    stackIn_50_0 = 32;
                    stackIn_50_1 = var10Lifetime2;
                    if (stackIn_50_0 != stackIn_50_1 && (160 != var10Lifetime2 ||
                      var12 != 0)) {
                      this.field_c[var9Lifetime2][var10Lifetime2] = (byte)pu.a(var9Lifetime2, var10Lifetime2, true, var7, var5, this.field_e, var8, var6);
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
              this.field_a = var5[32] + var6[32];
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_d = var2.h(255);
            stackIn_74_0Lifetime1 = var2.h(255);
          }
          this.field_h = var2.h(255);
          this.field_g = var2.h(255);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_79_0 = var2_ref;
          stackIn_79_1 = new StringBuilder().append("qla.<init>(");
          if (param0 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        try {
          field_f = null;
          field_b = null;
          field_i = null;
          if (param0 != -63) {
            qla.a(true, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qla.F(" + param0 + ')');
        }
    }

    static {
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_i = "Use this alternative as your account name";
    }
}
