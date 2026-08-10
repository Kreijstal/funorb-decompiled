/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends hl {
    static java.math.BigInteger field_W;
    static boolean field_cb;
    static boolean field_Y;
    static int field_X;
    static boolean field_Z;
    static boolean field_db;
    static kc field_bb;
    static String field_ab;

    final void a(boolean param0, pj param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "pc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void q(int param0) {
        field_W = null;
        field_ab = null;
        field_bb = null;
        if (param0 != -1) {
            field_X = -91;
        }
    }

    pc(sk param0, pj param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void a(int param0, String param1, String param2, boolean param3) {
        try {
            vh.field_k = param1;
            wd.field_p = param2;
            vd.a(param3, -536866817, ki.field_d);
            if (param0 != -1) {
                String var5 = (String) null;
                pc.a((String) null, false);
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "pc.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int[] param11) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
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
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        var29 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 == 53) {
              L1: {
                var13 = 16384 / (1 + 2 * param9);
                var14 = 1 - -param9 + (-param2 - param8);
                if (-1 > (var14 ^ -1)) {
                  var14 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var15 = -param9 + -param2 + (-param8 + ul.field_f);
                if (var15 <= 0) {
                  break L2;
                } else {
                  var15 = 0;
                  break L2;
                }
              }
              L3: {
                var16 = 0;
                var17 = 1 + param9 + param8;
                if (ul.field_f >= var17) {
                  break L3;
                } else {
                  var16 = var17 + -ul.field_f;
                  var17 = ul.field_f;
                  break L3;
                }
              }
              var18 = -param5;
              L4: while (true) {
                if (0 <= var18) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L5: {
                    var19 = 0;
                    var20 = 0;
                    var21 = 0;
                    var22 = param1 - param9;
                    var23 = -1 + -(param9 << -1443105695) + var22;
                    var24 = -param9 + param8;
                    if (-1 >= (var24 ^ -1)) {
                      break L5;
                    } else {
                      var23 = var23 - var24;
                      var22 = var22 - var24;
                      var24 = 0;
                      break L5;
                    }
                  }
                  var25 = -var24 + var17;
                  L6: while (true) {
                    if (var17 <= var24) {
                      incrementValue$0 = param1;
                      param1++;
                      param6[incrementValue$0] = var21 / var25 + ((var19 / var25 << -732464336) - -(var20 / var25 << 153847784));
                      var24 = 1 - param2;
                      var23 = var23 + var16;
                      L7: while (true) {
                        if (var14 <= var24) {
                          L8: while (true) {
                            if (var15 <= var24) {
                              L9: while (true) {
                                if ((var24 ^ -1) <= -1) {
                                  param7 = param7 + param10;
                                  param1 = param1 + param4;
                                  var18++;
                                  continue L4;
                                } else {
                                  L10: {
                                    incrementValue$1 = var23;
                                    var23++;
                                    param3 = param6[incrementValue$1];
                                    var25--;
                                    var19 = var19 - (255 & param3 >> 440424304);
                                    var20 = var20 - ((param3 & 65512) >> 1019767528);
                                    var21 = var21 - (param3 & 255);
                                    var26 = var19 / var25;
                                    var27 = var20 / var25;
                                    if (0 <= var27) {
                                      if ((var27 ^ -1) >= -256) {
                                        break L10;
                                      } else {
                                        var27 = 255;
                                        break L10;
                                      }
                                    } else {
                                      var27 = 0;
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    var28 = var21 / var25;
                                    if ((var26 ^ -1) <= -1) {
                                      if (255 >= var26) {
                                        break L11;
                                      } else {
                                        var26 = 255;
                                        break L11;
                                      }
                                    } else {
                                      var26 = 0;
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    if (-1 >= (var28 ^ -1)) {
                                      if (var28 <= 255) {
                                        break L12;
                                      } else {
                                        var28 = 255;
                                        break L12;
                                      }
                                    } else {
                                      var28 = 0;
                                      break L12;
                                    }
                                  }
                                  incrementValue$2 = param1;
                                  param1++;
                                  param6[incrementValue$2] = (var26 << -533256880) - (-(var27 << -699228824) + -var28);
                                  var24++;
                                  continue L9;
                                }
                              }
                            } else {
                              L13: {
                                incrementValue$3 = var23;
                                var23++;
                                param3 = param6[incrementValue$3];
                                var19 = var19 - (param3 >> -2055633424 & 255);
                                if (0 > var19) {
                                  var19 = 0;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                var20 = var20 - ((65465 & param3) >> -421179704);
                                if (0 > var20) {
                                  var20 = 0;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              L15: {
                                var21 = var21 - (param3 & 255);
                                if (0 == param11[param7]) {
                                  param3 = 8355711 & param6[var22] >> -1392360607;
                                  var12_int = param3;
                                  param3 = param3 | (1052688 | param3 >> -83109340);
                                  param3 = param3 - 65793;
                                  param3 = -(65793 & param3 >> -1961958844) + var12_int;
                                  break L15;
                                } else {
                                  param3 = param11[param7];
                                  break L15;
                                }
                              }
                              L16: {
                                if (-1 >= (var21 ^ -1)) {
                                  break L16;
                                } else {
                                  var21 = 0;
                                  break L16;
                                }
                              }
                              L17: {
                                var21 = var21 + (param3 & 255);
                                param7 += 4;
                                var20 = var20 + (param3 >> -188225880 & 255);
                                var22++;
                                var19 = var19 + (255 & param3 >> -290942864);
                                var26 = var13 * var19 >> -1944138834;
                                var27 = var13 * var20 >> -1234937938;
                                if (-256 <= (var27 ^ -1)) {
                                  break L17;
                                } else {
                                  var27 = 255;
                                  break L17;
                                }
                              }
                              L18: {
                                var28 = var13 * var21 >> 938563470;
                                if (-256 <= (var26 ^ -1)) {
                                  break L18;
                                } else {
                                  var26 = 255;
                                  break L18;
                                }
                              }
                              L19: {
                                if (255 < var28) {
                                  var28 = 255;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              incrementValue$4 = param1;
                              param1++;
                              param6[incrementValue$4] = var28 + (var27 << -1404221208) + (var26 << 940707472);
                              var24++;
                              continue L8;
                            }
                          }
                        } else {
                          L20: {
                            var23++;
                            if (ul.field_e > param9 + param8 - (-param2 - var24)) {
                              L21: {
                                if (0 == param11[param7]) {
                                  param3 = param6[var22] >> 851413089 & 8355711;
                                  break L21;
                                } else {
                                  param3 = param11[param7];
                                  break L21;
                                }
                              }
                              var19 = var19 + (255 & param3 >> -1958359728);
                              var25++;
                              var22++;
                              var21 = var21 + (255 & param3);
                              param7 += 4;
                              var20 = var20 + ((param3 & 65380) >> -431270072);
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          var26 = var19 / var25;
                          var27 = var20 / var25;
                          var28 = var21 / var25;
                          incrementValue$5 = param1;
                          param1++;
                          param6[incrementValue$5] = var28 + ((var26 << -2046677232) - -(var27 << -1157199192));
                          var24++;
                          continue L7;
                        }
                      }
                    } else {
                      L22: {
                        if (0 != param11[param7]) {
                          param3 = param11[param7];
                          break L22;
                        } else {
                          param3 = (16711422 & param6[var22]) >> -1542845023;
                          break L22;
                        }
                      }
                      var19 = var19 + (255 & param3 >> -1567066416);
                      var20 = var20 + (param3 >> -877858776 & 255);
                      var22++;
                      var21 = var21 + (param3 & 255);
                      var23++;
                      param7 += 4;
                      var24++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var12 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var12);

            stackIn_67_1 = new StringBuilder().append("pc.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L23;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L23;
            }
          }
          L24: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

            if (param11 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L24;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L24;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_68_0), stackIn_71_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void f(boolean param0) {
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ef var4_ref_ef = null;
        Object var5 = null;
        int var6 = 0;
        int[] var7 = null;
        vb var9 = null;
        se var10 = null;
        byte[] var14 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = cd.field_t;
              var2 = var10.b((byte) 90);
              if (var2 == 0) {
                var9 = (vb) ((Object) e.field_b.b((byte) -28));
                if (var9 != null) {
                  L2: {
                    var4 = var10.b((byte) 90);
                    if (var4 == 0) {
                      var5 = null;
                      break L2;
                    } else {
                      var14 = new byte[var4];
                      var10.a((byte) 108, var14, 0, var4);
                      break L2;
                    }
                  }
                  var10.field_i = var10.field_i + 4;
                  if (var10.h(9982)) {
                    var9.b(57);
                    break L1;
                  } else {
                    th.a(108);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  th.a(119);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (var2 != 1) {
                  pe.a((byte) -13, (Throwable) null, "A1: " + sj.b(true));
                  th.a(119);
                  break L1;
                } else {
                  var3 = var10.l(0);
                  var4_ref_ef = (ef) ((Object) sd.field_a.b((byte) -113));
                  L3: while (true) {
                    L4: {
                      if (var4_ref_ef == null) {
                        break L4;
                      } else {
                        if (var4_ref_ef.field_f == var3) {
                          break L4;
                        } else {
                          var4_ref_ef = (ef) ((Object) sd.field_a.d(853));
                          continue L3;
                        }
                      }
                    }
                    if (var4_ref_ef == null) {
                      th.a(126);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4_ref_ef.b(57);
                      break L1;
                    }
                  }
                }
              }
            }
            L5: {
              if (!param0) {
                break L5;
              } else {
                stackIn_25_0 = 57;
                stackIn_25_1 = -8;
                var7 = (int[]) null;
                pc.a((byte) stackIn_25_0, stackIn_25_1, -11, 81, 3, 33, (int[]) null, -76, -25, 43, -2, (int[]) null);
                break L5;
              }
            }
            decompiledRegionSelector0 = 3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "pc.K(" + param0 + ')');
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

    final static void a(String param0, boolean param1) {
        try {
            ug.field_r = param0;
            if (!param1) {
                field_bb = (kc) null;
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "pc.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_W = new java.math.BigInteger("65537");
        field_Z = true;
        field_db = false;
    }
}
