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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        qm var7 = null;
        qa var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mg var12 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0.b((byte) -61);
              var6 = param3.b((byte) -61);
              var7 = (qm) ((Object) param2.a((byte) 124));
              if (param1 == -256) {
                break L1;
              } else {
                se.a((byte) -9);
                break L1;
              }
            }
            L2: while (true) {
              if (var7 == null) {
                var8 = (qa) ((Object) param0.a((byte) 111));
                L3: while (true) {
                  if (-60 < (var5_int ^ -1)) {
                    L4: {
                      if (-1 > (var5_int ^ -1)) {
                        param4.c(192 + var5_int - 1, (byte) -86);
                        L5: while (true) {
                          if (var8 == null) {
                            break L4;
                          } else {
                            hm.a(var8, param4, true);
                            var8 = (qa) ((Object) param0.a(false));
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var12 = (mg) ((Object) param3.a((byte) 110));
                    L6: while (true) {
                      if ((var6 ^ -1) > -193) {
                        L7: {
                          if (var6 > 0) {
                            param4.c(var6 - 1, (byte) -103);
                            L8: while (true) {
                              if (var12 == null) {
                                break L7;
                              } else {
                                lp.a(var12, (byte) -88, param4);
                                var12 = (mg) ((Object) param3.a(false));
                                continue L8;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                        break L0;
                      } else {
                        param4.c(191, (byte) -104);
                        var10 = 0;
                        L9: while (true) {
                          if (var10 >= 192) {
                            var6 -= 192;
                            continue L6;
                          } else {
                            lp.a(var12, (byte) -106, param4);
                            var12 = (mg) ((Object) param3.a(false));
                            var10++;
                            continue L9;
                          }
                        }
                      }
                    }
                  } else {
                    param4.c(250, (byte) -61);
                    var9 = 0;
                    L10: while (true) {
                      if (-60 >= (var9 ^ -1)) {
                        var5_int -= 59;
                        continue L3;
                      } else {
                        hm.a(var8, param4, true);
                        var8 = (qa) ((Object) param0.a(false));
                        var9++;
                        continue L10;
                      }
                    }
                  }
                }
              } else {
                L11: {
                  param4.c(var7.field_o + 251, (byte) -125);
                  im.a(var7.field_p, param4, 9555);
                  di.a(var7.field_q, false, param4);
                  if (var7.field_o != 3) {
                    break L11;
                  } else {
                    di.a(var7.field_r, false, param4);
                    break L11;
                  }
                }
                var7 = (qm) ((Object) param2.a(false));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("se.A(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L13;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L14;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');

            if (param4 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L15;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L15;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), stackIn_42_2 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        gr var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1) {
              var4 = (gr) ((Object) qa.field_r.d(0));
              L1: while (true) {
                if (var4 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  uf.a(var4, param0, false);
                  var4 = (gr) ((Object) qa.field_r.a((byte) -71));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "se.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static byte[] a(byte param0, CharSequence param1) {
        byte[] stackIn_3_0 = null;
        byte[] stackIn_70_0 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            if (param0 > 79) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= var2_int) {
                  stackIn_70_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
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
                          var3[var4] = (byte)-126;
                          break L2;
                        } else {
                          if (402 == var5) {
                            var3[var4] = (byte)-125;
                            break L2;
                          } else {
                            if (var5 == 8222) {
                              var3[var4] = (byte)-124;
                              break L2;
                            } else {
                              if (var5 == 8230) {
                                var3[var4] = (byte)-123;
                                break L2;
                              } else {
                                if (var5 == 8224) {
                                  var3[var4] = (byte)-122;
                                  break L2;
                                } else {
                                  if (var5 != 8225) {
                                    if (var5 == 710) {
                                      var3[var4] = (byte)-120;
                                      break L2;
                                    } else {
                                      if (var5 == 8240) {
                                        var3[var4] = (byte)-119;
                                        break L2;
                                      } else {
                                        if (var5 != 352) {
                                          if (8249 != var5) {
                                            if (var5 == 338) {
                                              var3[var4] = (byte)-116;
                                              break L2;
                                            } else {
                                              if (381 != var5) {
                                                if (var5 == 8216) {
                                                  var3[var4] = (byte)-111;
                                                  break L2;
                                                } else {
                                                  if (var5 != 8217) {
                                                    if (var5 == 8220) {
                                                      var3[var4] = (byte)-109;
                                                      break L2;
                                                    } else {
                                                      if (var5 != 8221) {
                                                        if (var5 != 8226) {
                                                          if (8211 != var5) {
                                                            if (var5 == 8212) {
                                                              var3[var4] = (byte)-105;
                                                              break L2;
                                                            } else {
                                                              if (732 != var5) {
                                                                if (var5 == 8482) {
                                                                  var3[var4] = (byte)-103;
                                                                  break L2;
                                                                } else {
                                                                  if (var5 != 353) {
                                                                    if (var5 == 8250) {
                                                                      var3[var4] = (byte)-101;
                                                                      break L2;
                                                                    } else {
                                                                      if (var5 != 339) {
                                                                        if (var5 == 382) {
                                                                          var3[var4] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (var5 == 376) {
                                                                            var3[var4] = (byte)-97;
                                                                            break L2;
                                                                          } else {
                                                                            var3[var4] = (byte)63;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte)-100;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-102;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-104;
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-106;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-107;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-108;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-110;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-114;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            var3[var4] = (byte)-117;
                                            break L2;
                                          }
                                        } else {
                                          var3[var4] = (byte)-118;
                                          break L2;
                                        }
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-121;
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var3[var4] = (byte)-128;
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
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var2);

            stackIn_73_1 = new StringBuilder().append("se.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L6;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_70_0;
        }
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
        field_a = "Please log in to access this feature.";
        field_e = "Send private Quick Chat to <%0>";
        field_c = "You have signed a Non-Aggression Pact with <%0>.";
    }
}
