/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends sd {
    static bd[] field_y;
    static bd field_z;
    static bd[] field_A;
    static String field_x;

    final static void a(int param0, int param1, int param2, bd[] param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (param2 > 0) {
                  var6_int = param3[0].field_u;
                  var7 = param3[2].field_u;
                  var8 = param3[1].field_u;
                  param3[0].d(param1, param0, param4);
                  param3[2].d(-var7 + param2 + param1, param0, param4);
                  si.b(ia.field_i);
                  si.f(param1 + var6_int, param0, param2 + (param1 - var7), param0 + param3[1].field_r);
                  var9 = param1 + var6_int;
                  if (param5 > 107) {
                    var10 = param1 - -param2 + -var7;
                    param1 = var9;
                    L2: while (true) {
                      if (var10 <= param1) {
                        si.a(ia.field_i);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        param3[1].d(param1, param0, param4);
                        param1 = param1 + var8;
                        continue L2;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("km.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(de param0, int param1, int param2) {
        en var3 = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = s.field_b;
              var3.i(19319, param2);
              var3.d(96, 2);
              var3.d(param1 ^ -19825, 0);
              var3.d(param1 ^ -19780, param0.field_l);
              if (param1 == -19746) {
                break L1;
              } else {
                var4 = (String) null;
                km.a((String) null, true, -0.6628716588020325f, (byte) -73);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3_ref);

            stackIn_5_1 = new StringBuilder().append("km.CA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        field_x = null;
        field_z = null;
        if (param0 <= 46) {
            return;
        }
        field_y = null;
        field_A = null;
    }

    final static void a(String param0, boolean param1, float param2, byte param3) {
        try {
            if (null == hj.field_t) {
                hj.field_t = new pe(im.field_e, se.field_g);
                im.field_e.c(hj.field_t, 98);
            }
            hj.field_t.a(param2, param1, 127, param0);
            si.d();
            if (param3 <= 122) {
                int[] var5 = (int[]) null;
                km.a((byte) -37, 35, -17, (int[]) null, 25, -125, (byte) 42, 124, 121, 123, 63);
            }
            lf.a((byte) 80, true);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "km.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    km(int param0) {
        this(jd.field_s, param0);
    }

    final String c(ag param0, int param1) {
        RuntimeException var3 = null;
        bd[] var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                var4 = (bd[]) null;
                km.a(-66, -3, -19, (bd[]) null, -48, -1);
                break L1;
              }
            }
            stackIn_3_0 = wj.a(param0.field_n.length(), 512, '*');
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("km.V(");

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
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0, int param1, int param2, int[] param3, int param4, int param5, byte param6, int param7, int param8, int param9, int param10) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
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
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        var31 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            param1 = param1 & -4;
            param10 = param10 & -4;
            param8 = param8 & -4;
            param2 = param2 & -4;
            param5 = param5 & -4;
            param4 = param4 & -4;
            rl.a(-19104, param10, param4, param1, param2, param8, param5);
            var11_int = -m.field_q + ni.field_f;
            var12 = -qg.field_n + qh.field_e;
            var13 = var11_int * var11_int - -(var12 * var12) >> 364040674;
            if (var13 != 0) {
              var14 = (int)(Math.sqrt((double)((float)var13 / 4.0f)) * 4.0);
              if (param7 >= 77) {
                var15 = v.field_g;
                L1: while (true) {
                  if (var15 >= bn.field_p) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var16 = var15 - qg.field_n;
                    var17 = -qh.field_e + var15;
                    var18 = var12 * var16;
                    var19 = var16 * var11_int;
                    var20 = pk.field_m;
                    L2: while (true) {
                      if (cn.field_r <= var20) {
                        var15 += 4;
                        continue L1;
                      } else {
                        L3: {
                          var21 = -m.field_q + var20;
                          var22 = var20 + -ni.field_f;
                          var23 = var18 + var11_int * var21 >> -1936183838;
                          if (-1 != (param0 ^ -1)) {
                            break L3;
                          } else {
                            if (-1 >= (en.field_s * var16 + var21 * gj.field_h ^ -1)) {
                              break L3;
                            } else {
                              var20 += 4;
                              continue L2;
                            }
                          }
                        }
                        L4: {
                          if (param6 != 0) {
                            break L4;
                          } else {
                            if ((var17 * bj.field_d + var22 * ic.field_n ^ -1) > -1) {
                              break L4;
                            } else {
                              var20 += 4;
                              continue L2;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if ((param0 ^ -1) == -3) {
                              break L6;
                            } else {
                              if (-1 >= (var23 ^ -1)) {
                                break L6;
                              } else {
                                var24 = (int)Math.sqrt((double)(var21 * var21 + var16 * var16));
                                if (var24 <= param10) {
                                  var25 = var20 >> -311049054;
                                  var26 = var15 >> 2129588706;
                                  var27 = -(param3[-(param9 * var24 / param10) + param9] & 255) + 256;
                                  var28 = var25 - -(var26 * si.field_e);
                                  var29 = si.field_i[var28];
                                  si.field_i[var28] = ll.a(ua.a(16711680, var27 * ua.a(var29, 65280)) >> -65833240, ua.a(16711935, var27 * ua.a(16711935, var29) >> 1823793288));
                                  break L5;
                                } else {
                                  var20 += 4;
                                  continue L2;
                                }
                              }
                            }
                          }
                          L7: {
                            if (param6 == 2) {
                              break L7;
                            } else {
                              if (var13 >= var23) {
                                break L7;
                              } else {
                                var24 = (int)Math.sqrt((double)(var22 * var22 - -(var17 * var17)));
                                if (param4 >= var24) {
                                  var25 = var20 >> 1487424610;
                                  var26 = var15 >> 1357118978;
                                  var27 = -(param3[-(var24 * param9 / param4) + param9] & 255) + 256;
                                  var28 = var25 - -(var26 * si.field_e);
                                  var29 = si.field_i[var28];
                                  si.field_i[var28] = ll.a(ua.a(var27 * ua.a(var29, 65280) >> -699391448, 65280), ua.a(ua.a(var29, 16711935) * var27 >> -464134200, 16711935));
                                  break L5;
                                } else {
                                  var20 += 4;
                                  continue L2;
                                }
                              }
                            }
                          }
                          L8: {
                            var24 = var21 * var12 + -var19 >> -837283742;
                            if ((var24 ^ -1) <= -1) {
                              break L8;
                            } else {
                              var24 = -var24;
                              break L8;
                            }
                          }
                          var25 = (param10 * (var13 + -var23) + var23 * param4) / var13;
                          if (var25 * var14 >> -1532856638 > var24) {
                            var26 = var20 >> 1514081634;
                            var27 = var15 >> -1925545310;
                            var28 = -(param3[param9 + -((var24 << 1757647906) * param9 / var25 / var14)] & 255) + 256;
                            var29 = var26 - -(si.field_e * var27);
                            var30 = si.field_i[var29];
                            si.field_i[var29] = ll.a(ua.a(var28 * ua.a(65280, var30) >> -1512553624, 65280), ua.a(var28 * ua.a(var30, 16711935) >> -1278871224, 16711935));
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var20 += 4;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var11 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var11);

            stackIn_37_1 = new StringBuilder().append("km.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L9;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L9;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private km(vm param0, int param1) {
        super(param0, param1);
    }

    static {
    }
}
