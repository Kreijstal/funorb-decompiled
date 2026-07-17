/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends sd {
    static bd[] field_y;
    static bd field_z;
    static bd[] field_A;
    static String field_x;

    final static void a(int param0, int param1, int param2, bd[] param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
                        break L0;
                      } else {
                        param3[1].d(param1, param0, param4);
                        param1 = param1 + var8;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("km.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(de param0, int param1, int param2) {
        en var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
                var4 = null;
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
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("km.CA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
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
                im.field_e.c((ag) (Object) hj.field_t, 98);
            }
            hj.field_t.a(param2, param1, 127, param0);
            si.d();
            if (param3 <= 122) {
                Object var5 = null;
                km.a((byte) -37, 35, -17, (int[]) null, 25, -125, (byte) 42, 124, 121, 123, 63);
            }
            lf.a((byte) 80, true);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "km.W(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    km(int param0) {
        this(jd.field_s, param0);
    }

    final String c(ag param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                var4 = null;
                km.a(-66, -3, -19, (bd[]) null, -48, -1);
                break L1;
              }
            }
            stackOut_2_0 = wj.a(param0.field_n.length(), 512, '*');
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("km.V(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(byte param0, int param1, int param2, int[] param3, int param4, int param5, byte param6, int param7, int param8, int param9, int param10) {
        RuntimeException var11 = null;
        int var11_int = 0;
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
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
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
            var13 = var11_int * var11_int - -(var12 * var12) >> 2;
            if (var13 != 0) {
              var14 = (int)(Math.sqrt((double)((float)var13 / 4.0f)) * 4.0);
              if (param7 >= 77) {
                var15 = v.field_g;
                L1: while (true) {
                  if (~var15 <= ~bn.field_p) {
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
                          L4: {
                            var21 = -m.field_q + var20;
                            var22 = var20 + -ni.field_f;
                            var23 = var18 + var11_int * var21 >> 2;
                            if (param0 != 0) {
                              break L4;
                            } else {
                              if (en.field_s * var16 + var21 * gj.field_h < 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L5: {
                            if (param6 != 0) {
                              break L5;
                            } else {
                              if (var17 * bj.field_d + var22 * ic.field_n >= 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (param0 == 2) {
                              break L6;
                            } else {
                              if (var23 >= 0) {
                                break L6;
                              } else {
                                L7: {
                                  var24 = (int)Math.sqrt((double)(var21 * var21 + var16 * var16));
                                  if (~var24 < ~param10) {
                                    break L7;
                                  } else {
                                    var25 = var20 >> 2;
                                    var26 = var15 >> 2;
                                    var27 = -(param3[-(param9 * var24 / param10) + param9] & 255) + 256;
                                    var28 = var25 - -(var26 * si.field_e);
                                    var29 = si.field_i[var28];
                                    si.field_i[var28] = ll.a(ua.a(16711680, var27 * ua.a(var29, 65280)) >> 8, ua.a(16711935, var27 * ua.a(16711935, var29) >> 8));
                                    break L7;
                                  }
                                }
                                break L3;
                              }
                            }
                          }
                          L8: {
                            if (param6 == 2) {
                              break L8;
                            } else {
                              if (~var13 <= ~var23) {
                                break L8;
                              } else {
                                L9: {
                                  var24 = (int)Math.sqrt((double)(var22 * var22 - -(var17 * var17)));
                                  if (~param4 > ~var24) {
                                    break L9;
                                  } else {
                                    var25 = var20 >> 2;
                                    var26 = var15 >> 2;
                                    var27 = -(param3[-(var24 * param9 / param4) + param9] & 255) + 256;
                                    var28 = var25 - -(var26 * si.field_e);
                                    var29 = si.field_i[var28];
                                    si.field_i[var28] = ll.a(ua.a(var27 * ua.a(var29, 65280) >> 8, 65280), ua.a(ua.a(var29, 16711935) * var27 >> 8, 16711935));
                                    break L9;
                                  }
                                }
                                break L3;
                              }
                            }
                          }
                          L10: {
                            var24 = var21 * var12 + -var19 >> 2;
                            if (var24 >= 0) {
                              break L10;
                            } else {
                              var24 = -var24;
                              break L10;
                            }
                          }
                          var25 = (param10 * (var13 + -var23) + var23 * param4) / var13;
                          if (~(var25 * var14 >> 2) < ~var24) {
                            var26 = var20 >> 2;
                            var27 = var15 >> 2;
                            var28 = -(param3[param9 + -((var24 << 2) * param9 / var25 / var14)] & 255) + 256;
                            var29 = var26 - -(si.field_e * var27);
                            var30 = si.field_i[var29];
                            si.field_i[var29] = ll.a(ua.a(var28 * ua.a(65280, var30) >> 8, 65280), ua.a(var28 * ua.a(var30, 16711935) >> 8, 16711935));
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var20 += 4;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var11 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var11;
            stackOut_33_1 = new StringBuilder().append("km.BA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 41);
        }
    }

    private km(vm param0, int param1) {
        super(param0, param1);
    }

    static {
    }
}
