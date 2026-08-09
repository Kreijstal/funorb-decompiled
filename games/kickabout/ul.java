/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static String field_b;
    static hd field_c;
    static String field_a;

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        cj.a(eb.field_b, el.field_I, sh.field_c, param2, false, param1, param3);
        if (!param0) {
            int[] var5 = (int[]) null;
            ul.a((kg) null, (byte) -34, (int[]) null);
        }
    }

    final static kg a(kg param0, byte param1, int[] param2) {
        kg var3 = null;
        RuntimeException var3_ref = null;
        kg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new kg(0, 0, 0);
              var3.field_a = param0.field_a;
              var3.field_i = param0.field_i;
              var3.field_d = param0.field_d;
              var3.field_k = param0.field_k;
              var3.field_b = param0.field_b;
              var3.field_h = param0.field_h;
              var3.field_l = param2;
              if (param1 >= 44) {
                break L1;
              } else {
                field_c = (hd) null;
                break L1;
              }
            }
            var3.field_m = param0.field_m;
            stackIn_3_0 = (kg) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("ul.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0, String param1) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -126) {
                break L1;
              } else {
                field_c = (hd) null;
                break L1;
              }
            }
            var2_int = -mc.field_a + 640 >> 1563595105;
            var3 = 358;
            pt.a(mc.field_a + var2_int, -22914, var2_int, var3 - -112, var3);
            var4 = 0;
            L2: while (true) {
              if (mc.field_a <= var4) {
                L3: {
                  on.c(var2_int, var3, mc.field_a, 112, 2, 65793);
                  if (param1 == null) {
                    break L3;
                  } else {
                    un.field_d.a(param1.toLowerCase(), 20 + var2_int, var3 + 22, 16777215, -1);
                    break L3;
                  }
                }
                L4: {
                  var2_int += 10;
                  ta.e(param0 ^ -7);
                  var4 = 12 + ((mc.field_a + 640 >> 1352740737) - 22);
                  pt.a(320, param0 + -22788, var2_int, 480, 0);
                  on.a(var2_int, 388, 640, 72, 8, 65793, 128);
                  ta.e(122);
                  pt.a(var4, -22914, 320, 480, 0);
                  on.a(0, 388, var4, 72, 8, 65793, 128);
                  ta.e(122);
                  var5 = je.a(false);
                  if ((var5 ^ -1) == 0) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        of.field_e = 1;
                        if ((var5 ^ -1) == -7) {
                          break L6;
                        } else {
                          if (8 > var5) {
                            break L5;
                          } else {
                            if (-14 <= (var5 ^ -1)) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      of.field_e = 3;
                      break L5;
                    }
                    if ((var5 ^ -1) > -16) {
                      break L4;
                    } else {
                      of.field_e = 4;
                      break L4;
                    }
                  }
                }
                pt.a(-20 + (var2_int - -mc.field_a), param0 ^ 23036, var2_int + 22 - 12, 112 + var3, var3);
                kj.a(et.field_d.field_H[0], param0 ^ -126, et.field_d.field_P[0][of.field_e].field_N, et.field_d.field_Q[0], et.field_d.field_d[0], false).c(12 + var2_int, var3 - -40);
                ta.e(120);
                break L0;
              } else {
                mk.field_a.d(var2_int + var4, var3 + -368);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("ul.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final static void b(int param0) {
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int var2;
        int var3;
        int var4;
        tj var5;
        var4 = Kickabout.field_G;
        var5 = et.field_d.field_V;
        if (param0 == 11) {
          if (1 != ks.field_e) {
            if (2 != ks.field_e) {
              if (ks.field_e != 3) {
                if ((ks.field_e ^ -1) != -5) {
                  if (-6 == (ks.field_e ^ -1)) {
                    if (sl.field_Eb) {
                      ss.field_b.a(0, 0, -102);
                      return;
                    } else {
                      ss.field_b.a(mh.field_k.f(-107), mh.field_k.a(true), param0 + -84);
                      return;
                    }
                  } else {
                    if (-7 != (ks.field_e ^ -1)) {
                      if (-8 != (ks.field_e ^ -1)) {
                        if ((ks.field_e ^ -1) != -9) {
                          if (ks.field_e != 9) {
                            if (-11 != (ks.field_e ^ -1)) {
                              if (ks.field_e != 11) {
                                if (ks.field_e != 12) {
                                  if ((ks.field_e ^ -1) == -14) {
                                    if (var5.field_p >= 0) {
                                      if ((var5.e(54) ^ -1) >= -1638401) {
                                        if (var5.field_m != 0) {
                                          ss.field_b.a(var5.a(true), var5.c(param0 ^ 879306171), param0 + -72);
                                          return;
                                        } else {
                                          L0: {
                                            if (et.field_d.field_P[1][0].field_M <= 29360128) {
                                              stackIn_49_0 = 0;
                                              break L0;
                                            } else {
                                              stackIn_49_0 = 1;
                                              break L0;
                                            }
                                          }
                                          L1: {
                                            var2 = stackIn_49_0;
                                            if (var2 == 0) {
                                              stackIn_52_0 = 515;
                                              break L1;
                                            } else {
                                              stackIn_52_0 = 380;
                                              break L1;
                                            }
                                          }
                                          var3 = stackIn_52_0;
                                          ss.field_b.a(var3, -4, -87);
                                          return;
                                        }
                                      } else {
                                        ss.field_b.a(0, 1344, -90);
                                        return;
                                      }
                                    } else {
                                      ss.field_b.a(0, 1344, -90);
                                      return;
                                    }
                                  } else {
                                    return;
                                  }
                                } else {
                                  if (-1 != (var5.field_m ^ -1)) {
                                    if (-1638401 < (var5.e(param0 ^ 112) ^ -1)) {
                                      if (var5.field_p <= 0) {
                                        ss.field_b.a(448, -20, -57);
                                        return;
                                      } else {
                                        ss.field_b.a(var5.a(true), var5.c(879306160), -117);
                                        return;
                                      }
                                    } else {
                                      ss.field_b.a(448, -20, -57);
                                      return;
                                    }
                                  } else {
                                    ss.field_b.a(448, -20, -57);
                                    return;
                                  }
                                }
                              } else {
                                ss.field_b.a(var5.a(true), var5.c(879306160), -87);
                                return;
                              }
                            } else {
                              ss.field_b.a(fc.field_c.f(param0 ^ -104), fc.field_c.a(true), -109);
                              return;
                            }
                          } else {
                            ss.field_b.a(mh.field_k.f(-92), mh.field_k.a(true), -72);
                            return;
                          }
                        } else {
                          if (et.field_d.field_V.field_m != 0) {
                            ss.field_b.a(var5.a(true), var5.c(879306160), -112);
                            return;
                          } else {
                            ss.field_b.a(810, 1050, -108);
                            return;
                          }
                        }
                      } else {
                        ss.field_b.a(var5.a(true), var5.c(879306160), -87);
                        return;
                      }
                    } else {
                      ss.field_b.a(ld.field_f.f(-106), ld.field_f.a(true), -49);
                      return;
                    }
                  }
                } else {
                  ss.field_b.a(ld.field_f.f(param0 + -102), ld.field_f.a(true), -93);
                  return;
                }
              } else {
                ss.field_b.a(810, 1110, param0 ^ -105);
                return;
              }
            } else {
              if (-478 <= (mh.field_k.a(true) ^ -1)) {
                ss.field_b.a(448, 282, -76);
                return;
              } else {
                ss.field_b.a(448, 477, param0 + -82);
                return;
              }
            }
          } else {
            ss.field_b.a(var5.a(true), var5.c(879306160), -100);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, byte param4, int param5, int param6, int param7, int param8, String param9) {
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        try {
          L0: {
            L1: {
              var11 = -64 / ((-60 - param4) / 50);
              var10_int = 8 + pb.field_C.c(param9, -10 + (param5 + -10), param6);
              if (param3) {
                L2: {
                  stackIn_4_0 = param7;

                  if (-1 > (param1 ^ -1)) {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = param0 + -var10_int >> -1405228319;
                    break L2;
                  } else {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = -4;
                    break L2;
                  }
                }
                L3: {
                  on.f(stackIn_5_0, stackIn_5_1 + param2, param5, var10_int, 10, 983040);
                  stackIn_7_0 = param7;

                  stackIn_7_1 = param2;

                  if (0 >= param1) {
                    stackIn_8_0 = stackIn_7_0;
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = -4;
                    break L3;
                  } else {
                    stackIn_8_0 = stackIn_7_0;
                    stackIn_8_1 = stackIn_7_1;
                    stackIn_8_2 = -var10_int + param0 >> -92418463;
                    break L3;
                  }
                }
                on.a(stackIn_8_0, stackIn_8_1 - -stackIn_8_2, param5, var10_int, 10, 65793, 140);
                break L1;
              } else {
                break L1;
              }
            }
            pb.field_C.a(param9, param7 - -10, param2, -10 + param5 + -10, param0, 16777215, -1, param8, param1, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var10);

            stackIn_13_1 = new StringBuilder().append("ul.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 <= 122) {
          ul.a(true, 12, 73, true);
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    static {
        field_b = "overview";
        field_a = "Connection lost - attempting to reconnect";
    }
}
