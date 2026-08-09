/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qm {
    static int field_g;
    static int field_d;
    static String field_a;
    static boolean[] field_f;
    static int[] field_c;
    static String field_e;
    static int field_b;

    final static void a(km[] param0, int param1, int param2, int param3) {
        try {
            if (param1 >= -54) {
                km[] var5 = (km[]) null;
                qm.a((km[]) null, 95, 62, -2);
            }
            de.field_c = new le(param0);
            bb.field_b = param2;
            o.field_f = param3;
            fi.a((byte) 6);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "qm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        if (param0 != -6) {
            return;
        }
        field_a = null;
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        ae var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        L0: {
          var13 = Chess.field_G;
          if (param1 instanceof ae) {
            var14 = (ae) ((Object) param1);
            param1 = var14.field_g;
            var2 = var14.field_h + " | ";
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        if (param0 == -89) {
          var4 = new PrintWriter((Writer) ((Object) var15));
          param1.printStackTrace(var4);
          var4.close();
          var5 = var15.toString();
          var2 = var5;
          var11 = var5;
          var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var7 = var6.readLine();
          var2 = var7;
          var11 = var7;
          L1: while (true) {
            var8 = var6.readLine();
            var2 = var8;
            var11 = var8;
            var2 = var11;
            if (var8 != null) {
              L2: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (var9 == -1) {
                  var11 = var8;
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var8.substring(0, var9);
                  break L2;
                }
              }
              L3: {
                var16 = var11.trim();
                var2 = var16;
                var2 = var16;
                var17 = var16.substring(1 + var16.lastIndexOf(' '));
                var2 = var17;
                var2 = var17;
                var18 = var17.substring(1 + var17.lastIndexOf('\t'));
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                var2 = var19;
                if (0 == (var9 ^ -1)) {
                  break L3;
                } else {
                  if (-1 != var10) {
                    var12 = var8.indexOf(".java:", var9);
                    if (-1 < (var12 ^ -1)) {
                      break L3;
                    } else {
                      var2 = var19 + var8.substring(var12 - -5, var10);
                      break L3;
                    }
                  } else {
                    var2 = var2 + ' ';
                    continue L1;
                  }
                }
              }
              var2 = var2 + ' ';
              continue L1;
            } else {
              var2 = var11;
              var11 = var2;
              var2 = var11;
              var2 = var2 + "| " + var7;
              return var2;
            }
          }
        } else {
          return (String) null;
        }
    }

    final static sa a(byte param0, String param1) {
        sa stackIn_3_0 = null;
        sa stackIn_7_0 = null;
        sa stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        sa stackIn_26_0 = null;
        sa stackIn_40_0 = null;
        sa stackIn_45_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if (var2_int > 64) {
                stackIn_7_0 = ok.field_Ob;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (34 == param1.charAt(0)) {
                  if (param1.charAt(-1 + var2_int) != 34) {
                    stackIn_13_0 = wh.field_b;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (var4 < var2_int + -1) {
                        L2: {
                          var5 = param1.charAt(var4);
                          if (var5 == 92) {
                            L3: {
                              if (var3 != 0) {
                                stackIn_22_0 = 0;
                                break L3;
                              } else {
                                stackIn_22_0 = 1;
                                break L3;
                              }
                            }
                            var3 = stackIn_22_0;
                            break L2;
                          } else {
                            L4: {
                              if (var5 != 34) {
                                break L4;
                              } else {
                                if (var3 != 0) {
                                  break L4;
                                } else {
                                  stackIn_26_0 = wh.field_b;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L2;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  L5: {
                    var3 = 0;
                    var4 = 0;
                    if (param0 == -24) {
                      break L5;
                    } else {
                      var7 = (String) null;
                      qm.a((byte) 111, (String) null);
                      break L5;
                    }
                  }
                  L6: while (true) {
                    if (var4 < var2_int) {
                      L7: {
                        var5 = param1.charAt(var4);
                        if (var5 != 46) {
                          if ((kh.field_m.indexOf(var5) ^ -1) == 0) {
                            stackIn_45_0 = wh.field_b;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
                            break L7;
                          }
                        } else {
                          L8: {
                            if (0 == var4) {
                              break L8;
                            } else {
                              if (-1 + var2_int == var4) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          stackIn_40_0 = wh.field_b;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L6;
                    } else {
                      return null;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = ef.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var2);

            stackIn_51_1 = new StringBuilder().append("qm.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L9;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L9;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_40_0;
                } else {
                  return stackIn_45_0;
                }
              }
            }
          }
        }
    }

    final static String a(char param0, String param1, String param2, byte param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_3_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = Chess.field_G;
        try {
          L0: {
            var4_int = param1.length();
            if (param3 == -51) {
              L1: {
                var5 = param2.length();
                var6 = var4_int;
                var7 = var5 + -1;
                if (0 == var7) {
                  break L1;
                } else {
                  var8_int = 0;
                  L2: while (true) {
                    var8_int = param1.indexOf((int) param0, var8_int);
                    if (var8_int >= 0) {
                      var6 = var6 + var7;
                      var8_int++;
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var8 = new StringBuilder(var6);
              var9 = 0;
              L3: while (true) {
                var10 = param1.indexOf((int) param0, var9);
                if (-1 >= (var10 ^ -1)) {
                  discarded$0 = var8.append(param1.substring(var9, var10));
                  discarded$1 = var8.append(param2);
                  var9 = 1 + var10;
                  continue L3;
                } else {
                  discarded$2 = var8.append(param1.substring(var9));
                  stackIn_14_0 = var8.toString();
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("qm.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_14_0;
        }
    }

    final static rk[] a(int param0, String param1, String param2, um param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rk[] stackIn_2_0 = null;
        rk[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param3.a(param1, 0);
            if (param0 == 1) {
              var5 = param3.a(param2, 7, var4_int);
              stackIn_4_0 = om.a(param3, var4_int, true, var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (rk[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("qm.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Chess.field_G;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    var4 = ad.a(param1, -2);
                    if (var4 == null) {
                      stackIn_13_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if ((var4.length() ^ -1) <= -2) {
                        L2: {
                          if (cg.a(2, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!cg.a(2, var4.charAt(-1 + var4.length()))) {
                              var5 = 0;
                              if (param2 >= 79) {
                                var6 = 0;
                                L3: while (true) {
                                  if (var6 >= param1.length()) {
                                    if (var5 > 0) {
                                      stackIn_35_0 = 0;
                                      decompiledRegionSelector0 = 6;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L4: {
                                      var7 = param1.charAt(var6);
                                      if (cg.a(2, (char) var7)) {
                                        var5++;
                                        break L4;
                                      } else {
                                        var5 = 0;
                                        break L4;
                                      }
                                    }
                                    L5: {
                                      if (var5 < 2) {
                                        break L5;
                                      } else {
                                        if (param0) {
                                          break L5;
                                        } else {
                                          stackIn_30_0 = 0;
                                          decompiledRegionSelector0 = 5;
                                          break L0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L3;
                                  }
                                }
                              } else {
                                stackIn_21_0 = 1;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_18_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("qm.E(").append(param0).append(',');

            if (param1 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_30_0 != 0;
                  } else {
                    return stackIn_35_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0) {
        if (param0 < 70) {
            return;
        }
        if (hm.field_g) {
            return;
        }
        if (!(null != gf.field_d)) {
            gf.field_d = vc.a(-122, 4);
        }
        if (!(!gf.field_d.field_m)) {
            vk.field_b = vk.field_b & (gf.field_d.field_j ^ -1);
            wc.field_w = wc.field_w | gf.field_d.field_j;
            gf.field_d = null;
            hm.field_g = true;
        }
        if (hm.field_g) {
            dn.a(true);
            df.a((byte) 102);
            if (6 == jc.field_f && vk.field_b == 0) {
                jc.field_f = 0;
                uk.a(qk.field_h, false, 28333, 0);
            }
        }
    }

    static {
        field_a = "Previous";
        field_g = 0;
        field_e = "Reject";
        field_c = new int[8192];
        field_f = new boolean[]{true, true, true, true, true, true, true, true, true, true, -2 == (field_g ^ -1) ? true : false};
    }
}
