/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static int[] field_a;
    static int field_b;
    static byte[] field_c;

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 4) {
            field_c = (byte[]) null;
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        pc var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        hf var12 = null;
        pc var13 = null;
        int[] var14 = null;
        mc var15 = null;
        Object var16 = null;
        mc var16_ref = null;
        int[] var17 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = vi.field_o;
              if (param0 >= 120) {
                break L1;
              } else {
                field_a = (int[]) null;
                break L1;
              }
            }
            L2: {
              var2 = var13.f(255);
              if (var2 != 0) {
                if (var2 != 1) {
                  if ((var2 ^ -1) != -3) {
                    jo.a(1, "A1: " + jm.b(-79), (Throwable) null);
                    na.a(true);
                    break L2;
                  } else {
                    var16_ref = (mc) ((Object) tj.field_z.c(1504642273));
                    if (var16_ref != null) {
                      var16_ref.field_l = bf.a(false);
                      var16_ref.field_p = true;
                      var16_ref.field_s = var16_ref.field_l[0];
                      var16_ref.c(2779);
                      break L2;
                    } else {
                      na.a(true);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  var12 = (hf) ((Object) dh.field_a.c(1504642273));
                  if (var12 != null) {
                    var12.c(2779);
                    break L2;
                  } else {
                    na.a(true);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                var11 = bf.a(false);
                var17 = var11;
                var14 = var17;
                var3 = var14;
                var10 = var11;
                var4 = var10;
                var5 = var13;
                var6 = ((we) ((Object) var5)).f(255);
                var7 = 0;
                L3: while (true) {
                  if (var6 <= var7) {
                    var15 = (mc) ((Object) tj.field_z.c(1504642273));
                    if (var15 == null) {
                      na.a(true);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var15.field_p = true;
                      var15.field_s = var17[0];
                      var15.field_l = var3;
                      var15.c(2779);
                      break L2;
                    }
                  } else {
                    var10[var7] = ((we) ((Object) var5)).k(0);
                    var7++;
                    continue L3;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "la.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if ((var2_int ^ -1) >= -21) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            L2: {
              var8 = new char[var2_int];
              var7 = var8;
              var3 = var7;
              if (param0 == 10) {
                break L2;
              } else {
                field_a = (int[]) null;
                break L2;
              }
            }
            var4 = 0;
            L3: while (true) {
              if (var4 >= var2_int) {
                stackOut_20_0 = new String(var8);
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param1.charAt(var4);
                    if (var5 < 65) {
                      break L5;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(97 + var5 + -65);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5 < 97) {
                        break L7;
                      } else {
                        if (122 >= var5) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (48 > var5) {
                        break L8;
                      } else {
                        if (var5 > 57) {
                          break L8;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L4;
                  }
                  var3[var4] = (char)var5;
                  break L4;
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("la.C(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final static boolean a(String param0, int param1) {
        Process discarded$2 = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (cb.field_p.startsWith("win")) {
                  L2: {
                    if (param1 == -31451) {
                      break L2;
                    } else {
                      field_c = (byte[]) null;
                      break L2;
                    }
                  }
                  L3: {
                    if (param0.startsWith("http://")) {
                      break L3;
                    } else {
                      if (!param0.startsWith("https://")) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L4: while (true) {
                    if (param0.length() <= var3) {
                      discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if ((var2.indexOf((int) param0.charAt(var3)) ^ -1) != 0) {
                        var3++;
                        continue L4;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    }
                  }
                } else {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_19_0 = 0;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2_ref2);
            stackOut_21_1 = new StringBuilder().append("la.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_15_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    final static ak b(byte param0) {
        int discarded$0 = 0;
        if (param0 > -84) {
            discarded$0 = la.a((byte) -93);
        }
        return aj.field_k.field_Fb;
    }

    final static void a(int param0, int param1, gp param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        bb var10 = null;
        Object var11 = null;
        int var11_int = 0;
        uj var12 = null;
        int var13 = 0;
        ak var14 = null;
        ak var15 = null;
        ak var16 = null;
        ak var17 = null;
        ak var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        String var24 = null;
        String var25 = null;
        int var25_int = 0;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        gp stackIn_41_0 = null;
        boolean stackIn_41_1 = false;
        gp stackIn_42_0 = null;
        boolean stackIn_42_1 = false;
        gp stackIn_43_0 = null;
        boolean stackIn_43_1 = false;
        int stackIn_43_2 = 0;
        int stackIn_46_0 = 0;
        int stackIn_58_0 = 0;
        ak stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        int stackIn_93_4 = 0;
        ak stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        int stackIn_94_4 = 0;
        ak stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int stackIn_95_4 = 0;
        int stackIn_95_5 = 0;
        RuntimeException stackIn_218_0 = null;
        StringBuilder stackIn_218_1 = null;
        RuntimeException stackIn_219_0 = null;
        StringBuilder stackIn_219_1 = null;
        RuntimeException stackIn_220_0 = null;
        StringBuilder stackIn_220_1 = null;
        String stackIn_220_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        gp stackOut_40_0 = null;
        boolean stackOut_40_1 = false;
        gp stackOut_42_0 = null;
        boolean stackOut_42_1 = false;
        int stackOut_42_2 = 0;
        gp stackOut_41_0 = null;
        boolean stackOut_41_1 = false;
        int stackOut_41_2 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        ak stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        int stackOut_92_4 = 0;
        ak stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int stackOut_94_4 = 0;
        int stackOut_94_5 = 0;
        ak stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        int stackOut_93_4 = 0;
        int stackOut_93_5 = 0;
        RuntimeException stackOut_217_0 = null;
        StringBuilder stackOut_217_1 = null;
        RuntimeException stackOut_219_0 = null;
        StringBuilder stackOut_219_1 = null;
        String stackOut_219_2 = null;
        RuntimeException stackOut_218_0 = null;
        StringBuilder stackOut_218_1 = null;
        String stackOut_218_2 = null;
        var31 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              var7 = 0;
              var8 = 0;
              if (null == io.field_c) {
                break L1;
              } else {
                L2: {
                  if (null != jm.field_r) {
                    break L2;
                  } else {
                    if (null != w.field_z) {
                      break L2;
                    } else {
                      if (null != pa.field_a) {
                        break L2;
                      } else {
                        if (oo.field_e != null) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                var9 = 0;
                L3: while (true) {
                  if (fj.field_b <= var9) {
                    break L1;
                  } else {
                    L4: {
                      var10_int = io.field_c.field_Eb[var9] & 255;
                      if (jm.field_r == null) {
                        break L4;
                      } else {
                        if (jm.field_r[var9] != null) {
                          if (jm.field_r[var9][var10_int]) {
                            var5_int = 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (null == w.field_z) {
                        break L5;
                      } else {
                        if (null != w.field_z[var9]) {
                          L6: {
                            var11_int = w.field_z[var9][var10_int];
                            if (0 == var11_int) {
                              break L6;
                            } else {
                              if (fe.field_a) {
                                break L6;
                              } else {
                                var5_int = 1;
                                break L6;
                              }
                            }
                          }
                          if (var11_int > var6) {
                            var6 = var11_int;
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      if (oo.field_e == null) {
                        break L7;
                      } else {
                        if (oo.field_e[var9] != null) {
                          var8 = var8 | oo.field_e[var9][var10_int];
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (pa.field_a != null) {
                      if (pa.field_a[var9] != null) {
                        L8: {
                          var11_int = pa.field_a[var9][var10_int];
                          if (var7 >= var11_int) {
                            break L8;
                          } else {
                            var7 = var11_int;
                            break L8;
                          }
                        }
                        if (var11_int != 0) {
                          L9: {
                            if (!fe.field_a) {
                              var5_int = 1;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var9++;
                          continue L3;
                        } else {
                          var9++;
                          continue L3;
                        }
                      } else {
                        var9++;
                        continue L3;
                      }
                    } else {
                      var9++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L10: {
              stackOut_40_0 = (gp) (param2);
              stackOut_40_1 = param4;
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              if (bj.field_d != param2) {
                stackOut_42_0 = (gp) ((Object) stackIn_42_0);
                stackOut_42_1 = stackIn_42_1;
                stackOut_42_2 = 0;
                stackIn_43_0 = stackOut_42_0;
                stackIn_43_1 = stackOut_42_1;
                stackIn_43_2 = stackOut_42_2;
                break L10;
              } else {
                stackOut_41_0 = (gp) ((Object) stackIn_41_0);
                stackOut_41_1 = stackIn_41_1;
                stackOut_41_2 = 1;
                stackIn_43_0 = stackOut_41_0;
                stackIn_43_1 = stackOut_41_1;
                stackIn_43_2 = stackOut_41_2;
                break L10;
              }
            }
            L11: {
              if (((gp) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2 == 0, 2, (fq.field_q * 4 + 8) * param3, 0, 2 * fq.field_q + 4)) {
                stackOut_45_0 = 0;
                stackIn_46_0 = stackOut_45_0;
                break L11;
              } else {
                stackOut_44_0 = 1;
                stackIn_46_0 = stackOut_44_0;
                break L11;
              }
            }
            var9 = stackIn_46_0;
            var10 = param2.field_Fb.field_L;
            var11 = null;
            var12 = (uj) ((Object) var10.c(1504642273));
            L12: while (true) {
              if (var12 == null) {
                L13: {
                  if (param0 >= 19) {
                    break L13;
                  } else {
                    field_a = (int[]) null;
                    break L13;
                  }
                }
                break L0;
              } else {
                L14: {
                  var13 = 0;
                  if (var12.field_L != null) {
                    break L14;
                  } else {
                    L15: {
                      var12.field_Hb = new ak(0L, ak.field_T);
                      var12.a(var12.field_Hb, (byte) 26);
                      var12.field_Gb = new ak(0L, of.field_i);
                      if (!f.field_n) {
                        break L15;
                      } else {
                        var12.a(var12.field_Gb, (byte) 26);
                        break L15;
                      }
                    }
                    var12.field_Gb.field_Bb = 2;
                    var12.field_Sb = new ak(0L, mg.field_h);
                    var12.a(var12.field_Sb, (byte) 26);
                    var12.h(-257);
                    var12.field_Zb = new ak(0L, ul.field_p);
                    var12.a(var12.field_Zb, (byte) 26);
                    var12.field_Mb = new ak(0L, ge.field_h);
                    var12.a(var12.field_Mb, (byte) 26);
                    var13 = 1;
                    break L14;
                  }
                }
                L16: {
                  var12.field_Hb.field_cb = null;
                  var14 = var12.field_Hb;
                  var12.field_Hb.field_nb = 0;
                  var14.field_K = 0;
                  var12.field_Gb.field_cb = null;
                  var15 = var12.field_Gb;
                  var12.field_Gb.field_nb = 0;
                  var15.field_K = 0;
                  var12.field_Zb.field_cb = null;
                  var12.field_Zb.field_nb = 0;
                  var16 = var12.field_Zb;
                  var12.field_Mb.field_cb = null;
                  var16.field_K = 0;
                  var12.field_Mb.field_nb = 0;
                  var17 = var12.field_Mb;
                  var17.field_K = 0;
                  var12.field_Sb.field_cb = null;
                  var12.field_Sb.field_nb = 0;
                  var18 = var12.field_Sb;
                  var18.field_K = 0;
                  var12.field_K = param2.field_Fb.field_K;
                  var19 = 0;
                  var32 = var12.field_Fb;
                  var20 = var32;
                  var20 = var32;
                  var21 = 72;
                  if (jm.field_b == param2) {
                    var21 += 42;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  var33 = jl.a(var12.field_Hb.field_Db, var32, var21);
                  var20 = var33;
                  var20 = var33;
                  var20 = var33;
                  if (var33.equals(var12.field_Fb)) {
                    stackOut_57_0 = 0;
                    stackIn_58_0 = stackOut_57_0;
                    break L17;
                  } else {
                    stackOut_56_0 = 1;
                    stackIn_58_0 = stackOut_56_0;
                    break L17;
                  }
                }
                L18: {
                  var22 = stackIn_58_0;
                  if (4 <= var12.field_Qb) {
                    var20 = "<img=" + (-4 + var12.field_Qb + kk.field_s) + ">" + var33;
                    break L18;
                  } else {
                    if (var12.field_Qb <= 0) {
                      break L18;
                    } else {
                      var20 = "<img=" + (var12.field_Qb - 1) + ">" + var33;
                      break L18;
                    }
                  }
                }
                L19: {
                  var12.field_Hb.field_cb = var20;
                  if (!var12.b((byte) -114)) {
                    L20: {
                      L21: {
                        L22: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5_int == 0) {
                            break L22;
                          } else {
                            if (!var12.field_Xb) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        if (var6 > var12.field_Rb) {
                          break L21;
                        } else {
                          if (var12.field_Yb < var7) {
                            break L21;
                          } else {
                            if (-1 > ((var12.field_Ib ^ -1) & var8 ^ -1)) {
                              break L21;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      var24_int = 8421504;
                      var23_int = 8414771;
                      break L20;
                    }
                    L23: {
                      var12.field_Zb.field_N = var23_int;
                      var12.field_Gb.field_N = var23_int;
                      var12.field_Hb.field_N = var23_int;
                      var12.field_Hb.field_Cb = var24_int;
                      var12.field_Hb.field_pb = var24_int;
                      var12.field_Hb.field_y = var24_int;
                      var12.field_Gb.field_Cb = var24_int;
                      var12.field_Gb.field_pb = var24_int;
                      var12.field_Gb.field_y = var24_int;
                      var12.field_Zb.field_Cb = var24_int;
                      var12.field_Zb.field_pb = var24_int;
                      var12.field_Zb.field_y = var24_int;
                      if (param2 == ae.field_c) {
                        if (io.field_c.field_dc) {
                          break L23;
                        } else {
                          var12.field_Mb.field_cb = pf.field_m;
                          break L23;
                        }
                      } else {
                        if (var12.field_Vb) {
                          var12.field_Hb.field_cb = sd.a(gf.field_e, 111, new String[]{var20});
                          var12.field_Mb.field_cb = fa.field_f;
                          break L23;
                        } else {
                          if (var12.field_Jb) {
                            var12.field_Hb.field_cb = sd.a(ud.field_O, 58, new String[]{var20});
                            var12.field_Zb.field_cb = fh.field_M;
                            var12.field_Mb.field_cb = u.field_e;
                            break L23;
                          } else {
                            var12.field_Zb.field_cb = ih.field_b;
                            break L23;
                          }
                        }
                      }
                    }
                    L24: {
                      var25_int = 0;
                      if (io.field_c == null) {
                        break L24;
                      } else {
                        if (!pl.m(99)) {
                          break L24;
                        } else {
                          if (hn.field_f == var12.field_Nb) {
                            break L24;
                          } else {
                            L25: {
                              if (null != var12.field_Zb.field_cb) {
                                var26 = var12.field_Zb.g(0) + v.field_c * 2;
                                var12.field_Zb.a(var19, fq.field_q, var25_int, 256, var26);
                                var25_int = var25_int + var26;
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            if (null != var12.field_Mb.field_cb) {
                              L26: {
                                if (param2 == ae.field_c) {
                                  var26 = 40;
                                  break L26;
                                } else {
                                  var26 = var12.field_Mb.g(0) - -(2 * v.field_c);
                                  break L26;
                                }
                              }
                              var12.field_Mb.a(var19, fq.field_q, var25_int, 256, var26);
                              var25_int = var25_int + var26;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                    }
                    L27: {
                      stackOut_92_0 = var12.field_Hb;
                      stackOut_92_1 = var19;
                      stackOut_92_2 = fq.field_q;
                      stackOut_92_3 = var25_int;
                      stackOut_92_4 = 256;
                      stackIn_94_0 = stackOut_92_0;
                      stackIn_94_1 = stackOut_92_1;
                      stackIn_94_2 = stackOut_92_2;
                      stackIn_94_3 = stackOut_92_3;
                      stackIn_94_4 = stackOut_92_4;
                      stackIn_93_0 = stackOut_92_0;
                      stackIn_93_1 = stackOut_92_1;
                      stackIn_93_2 = stackOut_92_2;
                      stackIn_93_3 = stackOut_92_3;
                      stackIn_93_4 = stackOut_92_4;
                      if (!f.field_n) {
                        stackOut_94_0 = (ak) ((Object) stackIn_94_0);
                        stackOut_94_1 = stackIn_94_1;
                        stackOut_94_2 = stackIn_94_2;
                        stackOut_94_3 = stackIn_94_3;
                        stackOut_94_4 = stackIn_94_4;
                        stackOut_94_5 = 0;
                        stackIn_95_0 = stackOut_94_0;
                        stackIn_95_1 = stackOut_94_1;
                        stackIn_95_2 = stackOut_94_2;
                        stackIn_95_3 = stackOut_94_3;
                        stackIn_95_4 = stackOut_94_4;
                        stackIn_95_5 = stackOut_94_5;
                        break L27;
                      } else {
                        stackOut_93_0 = (ak) ((Object) stackIn_93_0);
                        stackOut_93_1 = stackIn_93_1;
                        stackOut_93_2 = stackIn_93_2;
                        stackOut_93_3 = stackIn_93_3;
                        stackOut_93_4 = stackIn_93_4;
                        stackOut_93_5 = 42;
                        stackIn_95_0 = stackOut_93_0;
                        stackIn_95_1 = stackOut_93_1;
                        stackIn_95_2 = stackOut_93_2;
                        stackIn_95_3 = stackOut_93_3;
                        stackIn_95_4 = stackOut_93_4;
                        stackIn_95_5 = stackOut_93_5;
                        break L27;
                      }
                    }
                    L28: {
                      L29: {
                        ((ak) (Object) stackIn_95_0).a(stackIn_95_1, stackIn_95_2, stackIn_95_3, stackIn_95_4, -stackIn_95_5 + var12.field_K + -var25_int);
                        var12.field_Gb.field_cb = Integer.toString(var12.field_Rb);
                        var12.field_Gb.a(var19, fq.field_q, var12.field_K - 40, 256, 40);
                        if (!var12.field_Hb.field_W) {
                          break L29;
                        } else {
                          if (var22 != 0) {
                            up.field_o = var12.field_Fb;
                            if (gi.field_d == null) {
                              break L28;
                            } else {
                              if (gi.field_d[var12.field_Qb] != null) {
                                up.field_o = up.field_o + " - " + gi.field_d[var12.field_Qb];
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                          } else {
                            break L29;
                          }
                        }
                      }
                      if (!var12.field_Hb.field_W) {
                        break L28;
                      } else {
                        if (null == gi.field_d) {
                          break L28;
                        } else {
                          if (gi.field_d[var12.field_Qb] != null) {
                            up.field_o = gi.field_d[var12.field_Qb];
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    var19 = var19 + fq.field_q;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L30: {
                  var23 = on.a(var12.field_Eb, var20, -17279);
                  var24 = var23;
                  var30 = var24;
                  var25 = var30;
                  var24 = var23;
                  if (var23 != null) {
                    var24_int = var12.field_Sb.field_Db.b(var23, -v.field_c + (var12.field_K + -v.field_c));
                    var12.field_Sb.field_cb = var23;
                    var12.field_Sb.field_yb = var12.field_Tb * 256 / mh.field_b;
                    var12.field_Sb.a(var19, fq.field_q * var24_int, v.field_c, 256, var12.field_K + -(v.field_c * 2));
                    var19 = var19 + var24_int * fq.field_q;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (var9 == 0) {
                    var12.field_Z = -var12.field_nb + var19;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (var13 != 0) {
                    param2.field_Fb.a(var12, 2, -1, (ak) (var11));
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (var12.field_P == 0) {
                    break L33;
                  } else {
                    if (!var12.b((byte) -89)) {
                      if (var12.field_Zb.field_P == 0) {
                        if (0 == var12.field_Mb.field_P) {
                          oi.a(uo.field_a, 0, ji.field_c, (byte) -110, var12, 0, param2);
                          break L33;
                        } else {
                          pe.a(7, param1, var12.field_Nb);
                          break L33;
                        }
                      } else {
                        bg.a(var12.field_Nb, param1, -26231);
                        break L33;
                      }
                    } else {
                      break L33;
                    }
                  }
                }
                L34: {
                  var11 = var12;
                  if (!var12.field_R) {
                    break L34;
                  } else {
                    if (var12.b((byte) -110)) {
                      break L34;
                    } else {
                      L35: {
                        var24 = null;
                        if ((hn.field_f ^ -1L) != (var12.field_Nb ^ -1L)) {
                          L36: {
                            if (var5_int == 0) {
                              break L36;
                            } else {
                              if (var12.field_Xb) {
                                break L36;
                              } else {
                                var24 = sd.a(rh.field_w, 46, new String[]{var20});
                                break L35;
                              }
                            }
                          }
                          if (var7 <= var12.field_Yb) {
                            if (var6 <= var12.field_Rb) {
                              if ((var8 & (var12.field_Ib ^ -1)) != 0) {
                                var25_int = cl.a((byte) -101, var8 & (var12.field_Ib ^ -1));
                                var24 = sd.a(hg.field_i, 27, new String[]{var20});
                                if (var25_int <= 0) {
                                  break L35;
                                } else {
                                  if (null == lc.field_l) {
                                    break L35;
                                  } else {
                                    if (var25_int > lc.field_l.length) {
                                      break L35;
                                    } else {
                                      if (lc.field_l[var25_int + -1] != null) {
                                        var24 = sd.a(lc.field_l[var25_int - 1][2], 62, new String[]{var20});
                                        var30 = var24;
                                        var25 = var30;
                                        var24 = var25;
                                        var30 = var24;
                                        var25 = var30;
                                        break L35;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L35;
                              }
                            } else {
                              var24 = sd.a(jj.field_e, 40, new String[]{var20, Integer.toString(var6)});
                              break L35;
                            }
                          } else {
                            L37: {
                              var25_int = -var12.field_Yb + var7;
                              if (var25_int == 1) {
                                var24 = sd.a(jm.field_k, 22, new String[]{var20});
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                            var24 = sd.a(tg.field_l, 62, new String[]{var20, Integer.toString(var25_int)});
                            break L35;
                          }
                        } else {
                          L38: {
                            if (var5_int == 0) {
                              break L38;
                            } else {
                              if (var12.field_Xb) {
                                break L38;
                              } else {
                                var24 = ll.field_g;
                                break L35;
                              }
                            }
                          }
                          if (var7 > var12.field_Yb) {
                            L39: {
                              var25_int = -var12.field_Yb + var7;
                              if (-2 != (var25_int ^ -1)) {
                                break L39;
                              } else {
                                var24 = oe.field_Mb;
                                break L39;
                              }
                            }
                            var24 = sd.a(ll.field_f, 95, new String[]{null, Integer.toString(var25_int)});
                            break L35;
                          } else {
                            if (var6 <= var12.field_Rb) {
                              if (0 != (var8 & (var12.field_Ib ^ -1))) {
                                var25_int = cl.a((byte) -100, var8 & (var12.field_Ib ^ -1));
                                var24 = jp.field_d;
                                if (-1 <= (var25_int ^ -1)) {
                                  break L35;
                                } else {
                                  if (null == lc.field_l) {
                                    break L35;
                                  } else {
                                    if (lc.field_l.length < var25_int) {
                                      break L35;
                                    } else {
                                      if (lc.field_l[var25_int + -1] != null) {
                                        var24 = lc.field_l[-1 + var25_int][1];
                                        break L35;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L35;
                              }
                            } else {
                              var24 = sd.a(jn.field_m, 63, new String[]{null, Integer.toString(var6)});
                              break L35;
                            }
                          }
                        }
                      }
                      if (var24 == null) {
                        break L34;
                      } else {
                        var34 = "<col=A00000>" + var24;
                        var30 = var34;
                        var25 = var30;
                        var24 = var25;
                        var30 = var34;
                        var25 = var30;
                        var25 = null;
                        var26 = 0;
                        var27_int = 0;
                        L40: while (true) {
                          if (fj.field_b <= var27_int) {
                            L41: {
                              L42: {
                                if (param2 != ae.field_c) {
                                  break L42;
                                } else {
                                  if (!pl.m(99)) {
                                    break L42;
                                  } else {
                                    if (var26 == 0) {
                                      var24 = var34 + "<br>" + sd.a(tk.field_q, 96, new String[]{var25});
                                      break L41;
                                    } else {
                                      var24 = var34 + "<br>" + le.field_i + var25;
                                      break L41;
                                    }
                                  }
                                }
                              }
                              if (var26 == 0) {
                                var24 = var34 + "<br>" + sd.a(we.field_l, 102, new String[]{var25});
                                break L41;
                              } else {
                                var24 = var34 + "<br>" + bh.field_i + var25;
                                break L41;
                              }
                            }
                            L43: {
                              if (param2 != ae.field_c) {
                                break L43;
                              } else {
                                if (!pl.m(99)) {
                                  var27 = io.field_c.field_pc;
                                  var24 = var24 + "<br>" + sd.a(ff.field_c, 93, new String[]{var27});
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            up.field_o = var24;
                            break L34;
                          } else {
                            L44: {
                              var28 = 255 & io.field_c.field_Eb[var27_int];
                              var29 = 0;
                              if (jm.field_r == null) {
                                break L44;
                              } else {
                                if (null == jm.field_r[var27_int]) {
                                  break L44;
                                } else {
                                  if (!jm.field_r[var27_int][var28]) {
                                    break L44;
                                  } else {
                                    if (var12.field_Xb) {
                                      break L44;
                                    } else {
                                      var29 = 1;
                                      break L44;
                                    }
                                  }
                                }
                              }
                            }
                            L45: {
                              if (w.field_z == null) {
                                break L45;
                              } else {
                                if (null == w.field_z[var27_int]) {
                                  break L45;
                                } else {
                                  L46: {
                                    var30_int = w.field_z[var27_int][var28];
                                    if (var30_int == 0) {
                                      break L46;
                                    } else {
                                      if (fe.field_a) {
                                        break L46;
                                      } else {
                                        if (!var12.field_Xb) {
                                          var29 = 1;
                                          break L46;
                                        } else {
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                  if (var12.field_Rb < var30_int) {
                                    var29 = 1;
                                    break L45;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                            }
                            L47: {
                              if (pa.field_a == null) {
                                break L47;
                              } else {
                                if (null == pa.field_a[var27_int]) {
                                  break L47;
                                } else {
                                  L48: {
                                    var30_int = pa.field_a[var27_int][var28];
                                    if (var30_int == 0) {
                                      break L48;
                                    } else {
                                      if (fe.field_a) {
                                        break L48;
                                      } else {
                                        if (!var12.field_Xb) {
                                          var29 = 1;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                  if (var30_int <= var12.field_Yb) {
                                    break L47;
                                  } else {
                                    var29 = 1;
                                    break L47;
                                  }
                                }
                              }
                            }
                            L49: {
                              if (oo.field_e == null) {
                                break L49;
                              } else {
                                if (null == oo.field_e[var27_int]) {
                                  break L49;
                                } else {
                                  if (0 == (oo.field_e[var27_int][var28] & (var12.field_Ib ^ -1))) {
                                    break L49;
                                  } else {
                                    var29 = 1;
                                    break L49;
                                  }
                                }
                              }
                            }
                            if (var29 != 0) {
                              L50: {
                                var30 = "<col=A00000>" + jk.field_e[var27_int] + "</col>";
                                var25 = var30;
                                var24 = var25;
                                var25 = var30;
                                if (var25 != null) {
                                  var25 = var25 + ", " + var30;
                                  var24 = var25;
                                  var24 = var25;
                                  var26 = 1;
                                  break L50;
                                } else {
                                  var25 = var30;
                                  break L50;
                                }
                              }
                              var27_int++;
                              continue L40;
                            } else {
                              var27_int++;
                              continue L40;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var12 = (uj) ((Object) var10.f(1504642273));
                continue L12;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L51: {
            var5 = decompiledCaughtException;
            stackOut_217_0 = (RuntimeException) (var5);
            stackOut_217_1 = new StringBuilder().append("la.B(").append(param0).append(',').append(param1).append(',');
            stackIn_219_0 = stackOut_217_0;
            stackIn_219_1 = stackOut_217_1;
            stackIn_218_0 = stackOut_217_0;
            stackIn_218_1 = stackOut_217_1;
            if (param2 == null) {
              stackOut_219_0 = (RuntimeException) ((Object) stackIn_219_0);
              stackOut_219_1 = (StringBuilder) ((Object) stackIn_219_1);
              stackOut_219_2 = "null";
              stackIn_220_0 = stackOut_219_0;
              stackIn_220_1 = stackOut_219_1;
              stackIn_220_2 = stackOut_219_2;
              break L51;
            } else {
              stackOut_218_0 = (RuntimeException) ((Object) stackIn_218_0);
              stackOut_218_1 = (StringBuilder) ((Object) stackIn_218_1);
              stackOut_218_2 = "{...}";
              stackIn_220_0 = stackOut_218_0;
              stackIn_220_1 = stackOut_218_1;
              stackIn_220_2 = stackOut_218_2;
              break L51;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_220_0), stackIn_220_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        L0: {
          L1: {
            ec.field_t = 0;
            nc.field_a = param0;
            ti.field_t = param1;
            if (ti.field_t == -4) {
              break L1;
            } else {
              if (1 == (ti.field_t ^ -1)) {
                break L1;
              } else {
                if (4 == (ti.field_t ^ -1)) {
                  break L1;
                } else {
                  if (-1 == (ti.field_t ^ -1)) {
                    break L1;
                  } else {
                    if ((ti.field_t ^ -1) == -13) {
                      break L1;
                    } else {
                      if ((ti.field_t ^ -1) == -18) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
          dg.a(0, (byte) -91);
          break L0;
        }
        L2: {
          if (tk.a((byte) -104, ti.field_t)) {
            L3: {
              var4 = 0;
              if (-13 == (ti.field_t ^ -1)) {
                var4 = -1;
                break L3;
              } else {
                break L3;
              }
            }
            wo.b(-92, ti.field_t).a(2, var4, param2);
            if ((ti.field_t ^ -1) != -13) {
              break L2;
            } else {
              id.a(param2, (byte) 110);
              break L2;
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (param3 == -25528) {
            break L4;
          } else {
            field_c = (byte[]) null;
            break L4;
          }
        }
    }

    final static int a(byte param0) {
        if (param0 != -59) {
            field_a = (int[]) null;
        }
        return ib.field_g - ko.field_cb;
    }

    final static byte[] a(byte[] param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        we var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] stackIn_19_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_18_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new we(param0);
              var3 = var9.f(param1 ^ 255);
              var4 = var9.k(0);
              if (var4 < param1) {
                break L1;
              } else {
                L2: {
                  if (up.field_j == 0) {
                    break L2;
                  } else {
                    if (up.field_j >= var4) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (-1 == (var3 ^ -1)) {
                  var13 = new byte[var4];
                  var11 = var13;
                  var5 = var11;
                  var9.a(var13, 0, -80, var4);
                  stackOut_20_0 = (byte[]) (var5);
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var5_int = var9.k(0);
                    if (0 > var5_int) {
                      break L3;
                    } else {
                      L4: {
                        if (-1 == (up.field_j ^ -1)) {
                          break L4;
                        } else {
                          if (var5_int <= up.field_j) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L5: {
                        var12 = new byte[var5_int];
                        var10 = var12;
                        var6 = var10;
                        if (1 == var3) {
                          discarded$1 = q.a(var12, var5_int, param0, var4, 9);
                          break L5;
                        } else {
                          var7 = fd.field_b;
                          synchronized (var7) {
                            L6: {
                              fd.field_b.a(param1 ^ -8, var12, var9);
                              break L6;
                            }
                          }
                          break L5;
                        }
                      }
                      stackOut_18_0 = (byte[]) (var6);
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("la.F(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_21_0;
        }
    }

    static {
        field_a = new int[]{10, 20, 32, 50};
        field_c = new byte[]{(byte) 1, (byte) 1};
    }
}
