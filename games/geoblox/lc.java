/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    String field_d;
    String field_a;
    boolean field_c;
    static int field_b;

    final static void a(int param0) {
        RuntimeException var1 = null;
        ja var1_ref = null;
        double var2 = 0.0;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        double var8 = 0.0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Geoblox.field_C;
        try {
          L0: {
            var1_ref = (ja) ((Object) wd.field_e.g(0));
            L1: while (true) {
              L2: {
                L3: {
                  if (var1_ref == null) {
                    break L3;
                  } else {
                    var1_ref.b(true);
                    var1_ref = (ja) ((Object) wd.field_e.d(1));
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 255) {
                  break L2;
                } else {
                  field_b = -11;
                  break L2;
                }
              }
              L4: {
                L5: {
                  L6: {
                    if (!kj.field_o[99]) {
                      break L6;
                    } else {
                      if (ji.field_r.c(13519)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if ((kb.field_c ^ -1) > (kc.field_a ^ -1)) {
                    break L5;
                  } else {
                    if (-1 != (ul.field_b ^ -1)) {
                      break L4;
                    } else {
                      if (!el.field_o.field_Y) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (0 < wd.field_e.a(param0 ^ -170)) {
                  if (el.field_o.field_N) {
                    break L4;
                  } else {
                    ji.field_r.a(-48, wd.field_e.b((byte) -124));
                    hd.f(2);
                    kc.field_a = 0;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L7: {
                kc.field_a = kc.field_a + 1;
                if (wd.field_e.a(param0 ^ 143) >= 3) {
                  break L7;
                } else {
                  if (!ma.c((byte) -53)) {
                    break L7;
                  } else {
                    if (!el.field_o.b(true)) {
                      var1_ref = (ja) ((Object) ra.field_a.b((byte) -101));
                      if (null != var1_ref) {
                        var2 = 2.0 * Math.random() * 3.141592653589793;
                        var4 = 240.0f * (float)Math.cos(var2) + 320.0f;
                        var5 = 240.0f + (float)Math.sin(var2) * 240.0f;
                        var6 = 320.0f - var4;
                        var7 = -var5 + 240.0f;
                        var8 = 1.0 / Math.sqrt((double)(var7 * var7 + var6 * var6));
                        var7 = (float)((double)var7 * var8);
                        var6 = (float)((double)var6 * var8);
                        var1_ref.a(101, var4, vd.a(param0 ^ 741924143), og.field_r * var6, nf.c((byte) -67), kc.field_a + kb.field_c * (1 + wd.field_e.a(111)), 0.0f, var5, var7 * og.field_r, ij.m(param0 ^ 131), 0.0f);
                        wd.field_e.a(-47, var1_ref);
                        mf.b(false);
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "lc.E(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1, float param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -2) {
                break L1;
              } else {
                lc.a((byte) -59);
                break L1;
              }
            }
            oi.field_e = param0;
            pb.field_s = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("lc.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10, int[] param11, int param12) {
        int incrementValue$1 = 0;
        RuntimeException var13 = null;
        int var13_int = 0;
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
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int stackIn_10_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var37 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param10 <= -74) {
                break L1;
              } else {
                field_b = 78;
                break L1;
              }
            }
            var13_int = param0;
            var14 = 1122867;
            var15 = (var14 & 16711680) >>> -1079885168;
            var16 = var14 & 65280;
            var17 = var14 & 255;
            var18 = -param1;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var18 ^ -1) <= -1) {
                    break L4;
                  } else {
                    var19 = param5 * (param6 >> -1886768304);
                    if (var37 != 0) {
                      break L3;
                    } else {
                      var20 = -param9;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if ((var20 ^ -1) <= -1) {
                              break L7;
                            } else {
                              param12 = param11[var19 + (param0 >> -81490640)];
                              param0 = param0 + param3;
                              stackOut_9_0 = param12;
                              stackIn_23_0 = stackOut_9_0;
                              stackIn_10_0 = stackOut_9_0;
                              if (var37 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  L9: {
                                    if (stackIn_10_0 != 0) {
                                      break L9;
                                    } else {
                                      param8++;
                                      if (var37 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L10: {
                                    var21 = param2[param8];
                                    if ((var21 ^ -1) != -1) {
                                      break L10;
                                    } else {
                                      param8++;
                                      if (var37 == 0) {
                                        break L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  var22 = 510 & var21 >> 1228331247;
                                  var23 = (var21 & 65429) >> -300055672;
                                  var24 = 255 & var21;
                                  var25 = (var24 + var22) / 3 - -var23 >> -1090345247;
                                  var26 = -(((255 & param12) + (param12 >> 1020607240 & 255) + (param12 >> -1338833040 & 255)) / 3) + 256;
                                  var27 = var15 * (var25 << -1187127344 >>> 543802160) >>> 1389020232;
                                  var28 = (var25 << 1167088136) * var16 >>> 2081269144;
                                  var29 = var17 * var25 >>> 2020048840;
                                  var25 = (var28 << -1742741880) + (var27 << -1929572144) - -var29;
                                  var30 = var26 * ((16711680 & var25) >> -2028626672);
                                  var31 = (255 & var25 >> 123665768) * var26;
                                  var32 = (var25 & 255) * var26;
                                  var33 = ((16711680 & var21) >>> -1099466064) * ((param12 & 16711680) >>> 878755504) >>> 766300104;
                                  var34 = (var21 & 65280) * (param12 & 65280) >>> -1130661960;
                                  var35 = (255 & var21) * (255 & param12) >>> 1483648232;
                                  var36 = 256 + -var26;
                                  var33 = var33 * var36;
                                  var34 = var34 * var36;
                                  var35 = var35 * var36;
                                  incrementValue$1 = param8;
                                  param8++;
                                  param2[incrementValue$1] = (var32 + var35 >> 464198152) + ((var34 + var31 >> 115744520 << 1806472904) + (var30 + var33 >> 1812821320 << 249524688));
                                  break L8;
                                }
                                var20++;
                                if (var37 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          param6 = param6 + param4;
                          param8 = param8 + param7;
                          stackOut_22_0 = var13_int;
                          stackIn_23_0 = stackOut_22_0;
                          break L6;
                        }
                        param0 = stackIn_23_0;
                        var18++;
                        if (var37 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var13 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var13);
            stackOut_25_1 = new StringBuilder().append("lc.C(").append(param0).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L11;
            }
          }
          L12: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param11 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L12;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param12 + ')');
        }
    }

    final static bg a(int param0, byte[] param1) {
        bg var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_4_0 = null;
        bg stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        bg stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (null == param1) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 4520) {
                  break L1;
                } else {
                  lc.a(-56, -44, (int[]) null, 118, 4, -55, 25, -98, -82, -78, (byte) -35, (int[]) null, -116);
                  break L1;
                }
              }
              var2 = new bg(param1, gh.field_m, md.field_e, rc.field_j, hl.field_K, mj.field_a);
              kj.c(true);
              stackOut_8_0 = (bg) (var2);
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2_ref);
            stackOut_10_1 = new StringBuilder().append("lc.B(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bg) ((Object) stackIn_4_0);
        } else {
          return stackIn_9_0;
        }
    }

    final static void a(byte param0) {
        String discarded$3 = null;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        RuntimeException var1 = null;
        pk var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        j var5_ref = null;
        j var6 = null;
        String var6_ref = null;
        String var7 = null;
        j var7_ref = null;
        int var8 = 0;
        int stackIn_15_0 = 0;
        j stackIn_56_0 = null;
        j stackIn_61_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        j stackOut_55_0 = null;
        j stackOut_60_0 = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param0 == 104) {
                break L1;
              } else {
                field_b = 67;
                break L1;
              }
            }
            var1_ref = eh.field_d;
            var2 = var1_ref.c((byte) 34);
            if (-1 == (var2 ^ -1)) {
              L2: {
                if (ug.field_a == null) {
                  ug.field_a = new vg(128);
                  ca.field_i = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (-2 != (var1_ref.c((byte) 34) ^ -1)) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_15_0 = stackOut_12_0;
                  break L3;
                }
              }
              L4: {
                var3_int = stackIn_15_0;
                var4_ref_String = var1_ref.e((byte) 105);
                if (var3_int != 0) {
                  discarded$3 = var1_ref.e((byte) 108);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var5_ref = ud.a(0, var4_ref_String);
                var6_ref = var1_ref.e((byte) 103);
                var7 = oe.a((CharSequence) ((Object) var4_ref_String), 12);
                if (null == var7) {
                  var7 = var4_ref_String;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var5_ref != null) {
                  break L6;
                } else {
                  var5_ref = ud.a(param0 ^ 104, var6_ref);
                  if (var5_ref != null) {
                    ug.field_a.a((long)var7.hashCode(), 113, var5_ref);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (null != var5_ref) {
                  break L7;
                } else {
                  var5_ref = new j();
                  ug.field_a.a((long)var7.hashCode(), 94, var5_ref);
                  fieldTemp$4 = ca.field_i;
                  ca.field_i = ca.field_i + 1;
                  var5_ref.field_kb = fieldTemp$4;
                  di.field_e.a(param0 ^ -86, var5_ref);
                  break L7;
                }
              }
              var5_ref.field_hb = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2 != 1) {
                if (var2 != 2) {
                  if (-4 == (var2 ^ -1)) {
                    L8: {
                      if (-3 == (vk.field_a ^ -1)) {
                        vk.field_a = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (-5 == (var2 ^ -1)) {
                      vk.field_a = 1;
                      var3 = var1_ref.e((byte) 122);
                      eg.field_l = var3.intern();
                      var4 = var1_ref.c((byte) 34);
                      pi.c(var4, param0 ^ -12742);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      gi.a((Throwable) null, "F1: " + og.e(55), (byte) 125);
                      jl.a((byte) -119);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  L9: {
                    if (vk.field_a != 1) {
                      break L9;
                    } else {
                      vk.field_a = 2;
                      break L9;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L10: {
                  if (nh.field_a != null) {
                    break L10;
                  } else {
                    nh.field_a = new vg(128);
                    mg.field_g = 0;
                    break L10;
                  }
                }
                L11: {
                  var3 = var1_ref.e((byte) 108);
                  if (!var3.equals("")) {
                    break L11;
                  } else {
                    var3 = null;
                    break L11;
                  }
                }
                L12: {
                  var4_ref_String = var1_ref.e((byte) 102);
                  var5 = var1_ref.e((byte) 110);
                  var6 = jg.a((byte) -62, var4_ref_String);
                  if (null != var6) {
                    break L12;
                  } else {
                    var6 = jg.a((byte) -62, var5);
                    if (null != var6) {
                      nh.field_a.a((long)oe.a((CharSequence) ((Object) var4_ref_String), 12).hashCode(), -63, var6);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (null == var6) {
                    var6 = new j();
                    nh.field_a.a((long)oe.a((CharSequence) ((Object) var4_ref_String), param0 ^ 100).hashCode(), 110, var6);
                    fieldTemp$5 = mg.field_g;
                    mg.field_g = mg.field_g + 1;
                    var6.field_kb = fieldTemp$5;
                    hl.field_B.a(-59, var6);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (var3 != null) {
                    var3 = var3.intern();
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var6.field_hb = var4_ref_String;
                var6.field_mb = var3;
                var6.a(false);
                var7_ref = (j) ((Object) hl.field_B.g(0));
                L15: while (true) {
                  L16: {
                    L17: {
                      if (null == var7_ref) {
                        break L17;
                      } else {
                        stackOut_55_0 = (j) (var6);
                        stackIn_61_0 = stackOut_55_0;
                        stackIn_56_0 = stackOut_55_0;
                        if (var8 != 0) {
                          break L16;
                        } else {
                          if (!ul.a(stackIn_56_0, var7_ref, (byte) 127)) {
                            break L17;
                          } else {
                            var7_ref = (j) ((Object) hl.field_B.d(1));
                            if (var8 == 0) {
                              continue L15;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    stackOut_60_0 = (j) (var7_ref);
                    stackIn_61_0 = stackOut_60_0;
                    break L16;
                  }
                  L18: {
                    L19: {
                      if (stackIn_61_0 != null) {
                        break L19;
                      } else {
                        hl.field_B.a(-39, var6);
                        if (var8 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    le.a(var7_ref, 121, var6);
                    break L18;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "lc.D(" + param0 + ')');
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
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    static {
    }
}
