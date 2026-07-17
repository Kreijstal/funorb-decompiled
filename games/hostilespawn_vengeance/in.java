/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class in {
    static int[] field_c;
    static bd field_d;
    static String field_a;
    static int field_b;

    abstract int a(byte param0, long param1);

    final static boolean a(boolean param0, int param1, int param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if (36 >= param1) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 104 / ((16 - param2) / 50);
                  var7 = 0;
                  var8 = param3.length();
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= var8) {
                      stackOut_40_0 = var5;
                      stackIn_41_0 = stackOut_40_0;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          var10 = param3.charAt(var9);
                          if (var9 == 0) {
                            if (var10 == 45) {
                              var4_int = 1;
                              break L3;
                            } else {
                              if (43 != var10) {
                                break L4;
                              } else {
                                L5: {
                                  if (param0) {
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                var9++;
                                continue L2;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          L7: {
                            if (48 > var10) {
                              break L7;
                            } else {
                              if (57 < var10) {
                                break L7;
                              } else {
                                var10 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var10 < 65) {
                              break L8;
                            } else {
                              if (var10 <= 90) {
                                var10 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var10 < 97) {
                              break L9;
                            } else {
                              if (122 < var10) {
                                break L9;
                              } else {
                                var10 -= 87;
                                break L6;
                              }
                            }
                          }
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0 != 0;
                        }
                        if (var10 < param1) {
                          L10: {
                            if (var4_int != 0) {
                              var10 = -var10;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var11 = param1 * var7 + var10;
                          if (var7 != var11 / param1) {
                            stackOut_36_0 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            return stackIn_37_0 != 0;
                          } else {
                            var7 = var11;
                            var5 = 1;
                            break L3;
                          }
                        } else {
                          stackOut_29_0 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          return stackIn_30_0 != 0;
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var4;
            stackOut_42_1 = new StringBuilder().append("in.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param3 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L11;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L11;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 41);
        }
        return stackIn_41_0 != 0;
    }

    final static void a(int param0, p param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              var4_int = param1.field_e / param0;
              if (var4_int < 0) {
                break L1;
              } else {
                if (id.field_p.length <= var4_int) {
                  break L1;
                } else {
                  id.field_p[var4_int].a(true, 128, (int)param1.field_c, param3, param2);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("in.G(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(double param0, p param1, byte param2, int[] param3, int param4, double param5) {
        RuntimeException var8 = null;
        og var9 = null;
        int var10 = 0;
        oc var11 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param2 == 29) {
              var11 = new oc(param1.field_j);
              var9 = new og(param1.field_l);
              param1.field_e = 0;
              param3[param4] = 0;
              L1: while (true) {
                L2: {
                  if (param1.field_e != 0) {
                    break L2;
                  } else {
                    L3: {
                      param1.field_l.a(2, (byte) 94, param1.field_c);
                      param1.a(8573);
                      if (2 != param3[param1.field_j.b(-4)]) {
                        break L3;
                      } else {
                        param1.field_e = 1;
                        break L3;
                      }
                    }
                    if (!param1.a(param0, param5, 29821)) {
                      continue L1;
                    } else {
                      param1.field_i = 13;
                      param1.field_e = 0;
                      param1.field_j.a((byte) 46, var11);
                      param1.field_l.a(var9, -28860);
                      break L2;
                    }
                  }
                }
                L4: {
                  param3[param4] = 3;
                  if (param1.field_i == 13) {
                    break L4;
                  } else {
                    param1.field_i = -1;
                    break L4;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("in.I(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    abstract void b(boolean param0);

    abstract long a(byte param0);

    final int a(long param0, int param1) {
        if (param1 < 90) {
            field_a = null;
        }
        long var4 = ((in) this).a((byte) -78);
        if (!(var4 <= 0L)) {
            vj.a(var4, (byte) -49);
        }
        return ((in) this).a((byte) -125, param0);
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 0;
        field_d = null;
        field_c = null;
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8_ref_String = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        nc stackIn_84_0 = null;
        String stackIn_84_1 = null;
        int stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        nc stackIn_85_0 = null;
        String stackIn_85_1 = null;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        nc stackIn_86_0 = null;
        String stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        int stackIn_86_4 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        nc stackOut_83_0 = null;
        String stackOut_83_1 = null;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        nc stackOut_85_0 = null;
        String stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        int stackOut_85_4 = 0;
        nc stackOut_84_0 = null;
        String stackOut_84_1 = null;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        int stackOut_84_4 = 0;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = new String[8];
            var4[0] = pc.field_b;
            var4[1] = Integer.toString(kh.field_ib[an.field_r[1]]);
            var4[2] = Integer.toString((9 + kh.field_ib[an.field_r[2]]) / 10);
            var4[3] = Integer.toString((kh.field_ib[an.field_r[3]] + 49) / 50);
            var4[4] = Integer.toString((kh.field_ib[an.field_r[4]] + 4) / 5);
            var4[5] = Integer.toString(kh.field_ib[an.field_r[5]]);
            var4[6] = Integer.toString(kh.field_ib[an.field_r[6]]);
            var4[7] = Integer.toString(kh.field_ib[an.field_r[7]]);
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 2) {
                var5 = 150;
                var6 = 5;
                var1_int = 0;
                L2: while (true) {
                  if (var1_int >= kh.field_Q.length) {
                    var1_int = 0;
                    L3: while (true) {
                      if (var1_int >= 8) {
                        break L0;
                      } else {
                        L4: {
                          if (kh.field_Q[var1_int]) {
                            L5: {
                              if ((5 & el.field_m) != 0) {
                                break L5;
                              } else {
                                if (~j.field_c > ~(-7 + var5)) {
                                  break L5;
                                } else {
                                  if (~j.field_c <= ~(ti.field_j.field_z + var5 - -9)) {
                                    break L5;
                                  } else {
                                    if (rb.field_m < ti.field_j.field_A + var6) {
                                      ri.field_h = var1_int;
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                            L6: {
                              var7 = 0;
                              if (~var1_int == ~ri.field_h) {
                                L7: {
                                  if (0 == (el.field_m & 5)) {
                                    stackOut_62_0 = 0;
                                    stackIn_63_0 = stackOut_62_0;
                                    break L7;
                                  } else {
                                    stackOut_61_0 = 1;
                                    stackIn_63_0 = stackOut_61_0;
                                    break L7;
                                  }
                                }
                                L8: {
                                  var7 = stackIn_63_0;
                                  stackOut_63_0 = var5 + 2;
                                  stackOut_63_1 = var6 + 2;
                                  stackOut_63_2 = -7 + ti.field_j.field_z;
                                  stackOut_63_3 = ti.field_j.field_A + -6;
                                  stackIn_65_0 = stackOut_63_0;
                                  stackIn_65_1 = stackOut_63_1;
                                  stackIn_65_2 = stackOut_63_2;
                                  stackIn_65_3 = stackOut_63_3;
                                  stackIn_64_0 = stackOut_63_0;
                                  stackIn_64_1 = stackOut_63_1;
                                  stackIn_64_2 = stackOut_63_2;
                                  stackIn_64_3 = stackOut_63_3;
                                  if (var7 != 0) {
                                    stackOut_65_0 = stackIn_65_0;
                                    stackOut_65_1 = stackIn_65_1;
                                    stackOut_65_2 = stackIn_65_2;
                                    stackOut_65_3 = stackIn_65_3;
                                    stackOut_65_4 = 16776960;
                                    stackIn_66_0 = stackOut_65_0;
                                    stackIn_66_1 = stackOut_65_1;
                                    stackIn_66_2 = stackOut_65_2;
                                    stackIn_66_3 = stackOut_65_3;
                                    stackIn_66_4 = stackOut_65_4;
                                    break L8;
                                  } else {
                                    stackOut_64_0 = stackIn_64_0;
                                    stackOut_64_1 = stackIn_64_1;
                                    stackOut_64_2 = stackIn_64_2;
                                    stackOut_64_3 = stackIn_64_3;
                                    stackOut_64_4 = 8421504;
                                    stackIn_66_0 = stackOut_64_0;
                                    stackIn_66_1 = stackOut_64_1;
                                    stackIn_66_2 = stackOut_64_2;
                                    stackIn_66_3 = stackOut_64_3;
                                    stackIn_66_4 = stackOut_64_4;
                                    break L8;
                                  }
                                }
                                si.c(stackIn_66_0, stackIn_66_1, stackIn_66_2, stackIn_66_3, stackIn_66_4);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            L9: {
                              L10: {
                                ti.field_j.e(var5, var6);
                                if (var1_int <= 0) {
                                  break L10;
                                } else {
                                  if (kh.field_ib[an.field_r[var1_int]] > 0) {
                                    break L10;
                                  } else {
                                    var8 = 0;
                                    var9 = 0;
                                    L11: while (true) {
                                      if (~di.field_b[var1_int].field_A >= ~var9) {
                                        break L9;
                                      } else {
                                        var10 = 0;
                                        L12: while (true) {
                                          if (di.field_b[var1_int].field_z <= var10) {
                                            var8 = var8 + di.field_b[var1_int].field_u * 2;
                                            var9 += 2;
                                            continue L11;
                                          } else {
                                            var11 = di.field_b[var1_int].field_D[var8 + var10];
                                            var11 = (255 & var11 >> 16) / 4;
                                            var11 = var11 * 262401;
                                            si.a(4 + var10 / 2 - -var5, var9 / 2 + var6, var11);
                                            var10 += 2;
                                            continue L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              di.field_b[var1_int].b(var5 + 4, var6, di.field_b[var1_int].field_z / 2, di.field_b[var1_int].field_A / 2, 256);
                              break L9;
                            }
                            L13: {
                              if (!kh.field_cb[var1_int]) {
                                break L13;
                              } else {
                                var8 = 12 + var5;
                                var9 = var6 - -3;
                                of.field_e.a('2', var8 + -1, var9, 65793);
                                of.field_e.a('2', var8 + 1, var9, 65793);
                                of.field_e.a('2', var8, -1 + var9, 65793);
                                of.field_e.a('2', var8, 1 + var9, 65793);
                                of.field_e.a('2', var8, var9, 16772608);
                                break L13;
                              }
                            }
                            L14: {
                              if (~hf.field_i != ~var1_int) {
                                break L14;
                              } else {
                                var7 = 1;
                                break L14;
                              }
                            }
                            L15: {
                              if (var7 != 0) {
                                si.c(var5 + 24, var6 - -16, 9, 10, 16776960);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L16: {
                              stackOut_83_0 = al.field_Z;
                              stackOut_83_1 = Integer.toString(1 + var1_int);
                              stackOut_83_2 = var5 - -29;
                              stackOut_83_3 = var6 - -26;
                              stackIn_85_0 = stackOut_83_0;
                              stackIn_85_1 = stackOut_83_1;
                              stackIn_85_2 = stackOut_83_2;
                              stackIn_85_3 = stackOut_83_3;
                              stackIn_84_0 = stackOut_83_0;
                              stackIn_84_1 = stackOut_83_1;
                              stackIn_84_2 = stackOut_83_2;
                              stackIn_84_3 = stackOut_83_3;
                              if (var7 != 0) {
                                stackOut_85_0 = (nc) (Object) stackIn_85_0;
                                stackOut_85_1 = (String) (Object) stackIn_85_1;
                                stackOut_85_2 = stackIn_85_2;
                                stackOut_85_3 = stackIn_85_3;
                                stackOut_85_4 = 0;
                                stackIn_86_0 = stackOut_85_0;
                                stackIn_86_1 = stackOut_85_1;
                                stackIn_86_2 = stackOut_85_2;
                                stackIn_86_3 = stackOut_85_3;
                                stackIn_86_4 = stackOut_85_4;
                                break L16;
                              } else {
                                stackOut_84_0 = (nc) (Object) stackIn_84_0;
                                stackOut_84_1 = (String) (Object) stackIn_84_1;
                                stackOut_84_2 = stackIn_84_2;
                                stackOut_84_3 = stackIn_84_3;
                                stackOut_84_4 = 16776960;
                                stackIn_86_0 = stackOut_84_0;
                                stackIn_86_1 = stackOut_84_1;
                                stackIn_86_2 = stackOut_84_2;
                                stackIn_86_3 = stackOut_84_3;
                                stackIn_86_4 = stackOut_84_4;
                                break L16;
                              }
                            }
                            ((nc) (Object) stackIn_86_0).b(stackIn_86_1, stackIn_86_2, stackIn_86_3, stackIn_86_4, -1);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var5 += 46;
                        var1_int++;
                        continue L3;
                      }
                    }
                  } else {
                    L17: {
                      if (!kh.field_Q[var1_int]) {
                        break L17;
                      } else {
                        if (an.field_r[var1_int] >= 0) {
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var1_int++;
                    continue L2;
                  }
                }
              } else {
                L18: {
                  var2 = 8;
                  if (1 != var1_int) {
                    break L18;
                  } else {
                    var2 = 632 + -qa.field_g[0].field_u;
                    break L18;
                  }
                }
                L19: {
                  var3 = 8;
                  var5 = kh.field_U[var1_int];
                  if (var5 < 0) {
                    break L19;
                  } else {
                    L20: {
                      var6 = 16772608;
                      var7 = an.field_r[var5];
                      if (var7 < 0) {
                        break L20;
                      } else {
                        if (kh.field_ib[var7] <= 0) {
                          var6 = 16728128;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      if (var1_int == 0) {
                        oc.field_c.e(0, 0);
                        dn.a(var2, -112, var5, var3 + -16, var6);
                        break L21;
                      } else {
                        oc.field_c.d(640 + -oc.field_c.field_z, 0);
                        pf.a(var2, -16 + var3, 0, var5, var6);
                        break L21;
                      }
                    }
                    L22: {
                      if (var1_int != 0) {
                        si.d(515, 0, 640, 480);
                        si.c();
                        break L22;
                      } else {
                        si.d(0, 0, 125, 480);
                        si.c();
                        break L22;
                      }
                    }
                    L23: {
                      if (var7 != -1) {
                        if (var1_int == 0) {
                          var2 = var2 + (8 + qa.field_g[0].field_u);
                          hh.field_a[var7].e(46, 5 + var3);
                          break L23;
                        } else {
                          if (var1_int == 1) {
                            var2 -= 24;
                            hh.field_a[var7].e(562, 5 + var3);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                      } else {
                        break L23;
                      }
                    }
                    if (var5 >= 0) {
                      L24: {
                        var8_ref_String = var4[var5];
                        if (0 > var7) {
                          break L24;
                        } else {
                          if (kh.field_ib[var7] <= 0) {
                            var8_ref_String = nf.field_p.toUpperCase();
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                      }
                      if (var1_int != 0) {
                        if (var1_int == 1) {
                          var2 -= 24;
                          if (var5 == 0) {
                            of.field_e.c(var8_ref_String, 572, 32 + var3, 16772608, 0);
                            break L19;
                          } else {
                            kb.a(7, 42 + var3, var6, 0, var8_ref_String, (vm) (Object) al.field_Z, 572);
                            break L19;
                          }
                        } else {
                          break L19;
                        }
                      } else {
                        L25: {
                          if (var5 == 0) {
                            of.field_e.a(var8_ref_String, 68, var3 - -32, 16772608, 0);
                            break L25;
                          } else {
                            ec.a(7, var3 - -42, false, (vm) (Object) al.field_Z, 68, var6, var8_ref_String);
                            break L25;
                          }
                        }
                        var2 += 24;
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "in.F(" + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_b = 838899712;
        field_a = "Loading fonts";
    }
}
