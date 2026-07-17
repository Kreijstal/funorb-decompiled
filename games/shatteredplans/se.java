/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    boolean[][] field_j;
    int[] field_f;
    static boolean field_k;
    static String field_a;
    static boolean field_g;
    int[] field_b;
    int[] field_l;
    static String field_e;
    int[] field_h;
    static ur field_m;
    boolean[][] field_d;
    static qr field_i;
    static String field_c;

    final static void a(hb param0, int param1, hb param2, hb param3, sl param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        qm var7 = null;
        qa var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mg var12 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = param0.b((byte) -61);
            var6 = param3.b((byte) -61);
            var7 = (qm) (Object) param2.a((byte) 124);
            L1: while (true) {
              if (var7 == null) {
                var8 = (qa) (Object) param0.a((byte) 111);
                L2: while (true) {
                  if (var5_int < 59) {
                    L3: {
                      if (var5_int > 0) {
                        param4.c(192 + var5_int - 1, (byte) -86);
                        L4: while (true) {
                          if (var8 == null) {
                            break L3;
                          } else {
                            hm.a(var8, (ob) (Object) param4, true);
                            var8 = (qa) (Object) param0.a(false);
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    var12 = (mg) (Object) param3.a((byte) 110);
                    L5: while (true) {
                      if (var6 < 192) {
                        L6: {
                          if (var6 > 0) {
                            param4.c(var6 - 1, (byte) -103);
                            L7: while (true) {
                              if (var12 == null) {
                                break L6;
                              } else {
                                lp.a(var12, (byte) -88, (ob) (Object) param4);
                                var12 = (mg) (Object) param3.a(false);
                                continue L7;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        break L0;
                      } else {
                        param4.c(191, (byte) -104);
                        var10 = 0;
                        L8: while (true) {
                          if (var10 >= 192) {
                            var6 -= 192;
                            continue L5;
                          } else {
                            lp.a(var12, (byte) -106, (ob) (Object) param4);
                            var12 = (mg) (Object) param3.a(false);
                            var10++;
                            continue L8;
                          }
                        }
                      }
                    }
                  } else {
                    param4.c(250, (byte) -61);
                    var9 = 0;
                    L9: while (true) {
                      if (var9 >= 59) {
                        var5_int -= 59;
                        continue L2;
                      } else {
                        hm.a(var8, (ob) (Object) param4, true);
                        var8 = (qa) (Object) param0.a(false);
                        var9++;
                        continue L9;
                      }
                    }
                  }
                }
              } else {
                L10: {
                  param4.c(var7.field_o + 251, (byte) -125);
                  im.a(var7.field_p, (ob) (Object) param4, 9555);
                  di.a(var7.field_q, false, (ob) (Object) param4);
                  if (var7.field_o != 3) {
                    break L10;
                  } else {
                    di.a(var7.field_r, false, (ob) (Object) param4);
                    break L10;
                  }
                }
                var7 = (qm) (Object) param2.a(false);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var5;
            stackOut_29_1 = new StringBuilder().append("se.A(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          L12: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(-256).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L12;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L12;
            }
          }
          L13: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L13;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L13;
            }
          }
          L14: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param4 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L14;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L14;
            }
          }
          throw r.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
        }
    }

    final static void a() {
        RuntimeException var2 = null;
        int var3 = 0;
        gr var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (gr) (Object) qa.field_r.d(0);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                int discarded$4 = 0;
                uf.a(var4, 7);
                var4 = (gr) (Object) qa.field_r.a((byte) -71);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "se.B(" + 7 + 44 + 1 + 41);
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_69_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            if (param0 > 79) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2_int) {
                  stackOut_69_0 = (byte[]) var3;
                  stackIn_70_0 = stackOut_69_0;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var5 = param1.charAt(var4);
                        if (var5 <= 0) {
                          break L4;
                        } else {
                          if (var5 < 128) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var5 < 160) {
                          break L5;
                        } else {
                          if (var5 <= 255) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (8364 != var5) {
                        if (var5 == 8218) {
                          var3[var4] = (byte) -126;
                          break L2;
                        } else {
                          if (402 == var5) {
                            var3[var4] = (byte) -125;
                            break L2;
                          } else {
                            if (var5 == 8222) {
                              var3[var4] = (byte) -124;
                              break L2;
                            } else {
                              if (var5 == 8230) {
                                var3[var4] = (byte) -123;
                                break L2;
                              } else {
                                if (var5 == 8224) {
                                  var3[var4] = (byte) -122;
                                  break L2;
                                } else {
                                  if (var5 != 8225) {
                                    if (var5 == 710) {
                                      var3[var4] = (byte) -120;
                                      break L2;
                                    } else {
                                      if (var5 == 8240) {
                                        var3[var4] = (byte) -119;
                                        break L2;
                                      } else {
                                        if (var5 != 352) {
                                          if (8249 != var5) {
                                            if (var5 == 338) {
                                              var3[var4] = (byte) -116;
                                              break L2;
                                            } else {
                                              if (381 != var5) {
                                                if (var5 == 8216) {
                                                  var3[var4] = (byte) -111;
                                                  break L2;
                                                } else {
                                                  if (var5 != 8217) {
                                                    if (var5 == 8220) {
                                                      var3[var4] = (byte) -109;
                                                      break L2;
                                                    } else {
                                                      if (var5 != 8221) {
                                                        if (var5 != 8226) {
                                                          if (8211 != var5) {
                                                            if (var5 == 8212) {
                                                              var3[var4] = (byte) -105;
                                                              break L2;
                                                            } else {
                                                              if (732 != var5) {
                                                                if (var5 == 8482) {
                                                                  var3[var4] = (byte) -103;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 != 353) {
                                                                    if (var5 == 8250) {
                                                                      var3[var4] = (byte) -101;
                                                                      break L2;
                                                                    } else {
                                                                      if (var5 != 339) {
                                                                        if (var5 == 382) {
                                                                          var3[var4] = (byte) -98;
                                                                          break L2;
                                                                        } else {
                                                                          if (var5 == 376) {
                                                                            var3[var4] = (byte) -97;
                                                                            break L2;
                                                                          } else {
                                                                            var3[var4] = (byte) 63;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -100;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -102;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte) -104;
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte) -106;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte) -107;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte) -108;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -110;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte) -114;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte) -117;
                                            break L2;
                                          }
                                        } else {
                                          var3[var4] = (byte) -118;
                                          break L2;
                                        }
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte) -121;
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var3[var4] = (byte) -128;
                        break L2;
                      }
                    }
                    var3[var4] = (byte)var5;
                    break L2;
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var2;
            stackOut_71_1 = new StringBuilder().append("se.D(").append(param0).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L6;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 41);
        }
        return stackIn_70_0;
    }

    private se() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        if (param0 != -37) {
            se.a((byte) 121);
        }
        field_m = null;
        field_a = null;
        field_e = null;
        field_i = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please log in to access this feature.";
        field_e = "Send private Quick Chat to <%0>";
        field_c = "You have signed a Non-Aggression Pact with <%0>.";
    }
}
