/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends s {
    private ga field_I;
    static int field_H;
    private int field_G;

    final void a(byte param0, pj param1, int param2, int param3) {
        try {
            this.field_G = this.field_G + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "jf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        qd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hj var15 = null;
        hj var16 = null;
        hj var17 = null;
        hj var18 = null;
        hj var19 = null;
        hj var20 = null;
        hj var21 = null;
        hj var22 = null;
        hj var23 = null;
        hj var24 = null;
        hj var25 = null;
        hj var26 = null;
        hj var27 = null;
        hj var28 = null;
        hj var29 = null;
        hj var30 = null;
        hj var31 = null;
        hj var32 = null;
        hj var33 = null;
        hj var34 = null;
        hj var35 = null;
        hj var36 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (0 != param1) {
          return;
        } else {
          var5 = param3 - (-this.field_s + -(this.field_m >> -787512639));
          var6 = (this.field_r >> -1314129087) + (this.field_n + param0);
          var8 = this.field_I.d(param2 ^ -1040730);
          if (ml.field_a == var8) {
            var26 = wd.field_C[0];
            var9 = var26.field_s << 740379745;
            var10 = var26.field_t << 1130362753;
            if (null != lj.field_N) {
              if (var9 <= lj.field_N.field_o) {
                if (lj.field_N.field_k >= var10) {
                  de.a(-128, lj.field_N);
                  ul.d();
                  if (var11 != 0) {
                    L0: {
                      lj.field_N = new hj(var9, var10);
                      de.a(param2 ^ -1048454, lj.field_N);
                      var26.b(112, 144, var26.field_s << 1142094340, var26.field_t << -608288572, -this.field_G << 75582378, 4096);
                      oc.g((byte) -105);
                      lj.field_N.e(-var26.field_s + var5, var6 - var26.field_t, 256);
                      if (vh.field_h != var8) {
                        break L0;
                      } else {
                        var31 = wd.field_C[2];
                        var31.e(-(var31.field_o >> 989270945) + var5, var6 + -(var31.field_k >> 1368908609), 256);
                        break L0;
                      }
                    }
                    L1: {
                      if (nc.field_bb != var8) {
                        break L1;
                      } else {
                        var32 = wd.field_C[1];
                        var32.e(-(var32.field_o >> 1928900705) + var5, -(var32.field_k >> -381005119) + var6, 256);
                        break L1;
                      }
                    }
                    return;
                  } else {
                    L2: {
                      var26.b(112, 144, var26.field_s << 1142094340, var26.field_t << -608288572, -this.field_G << 75582378, 4096);
                      oc.g((byte) -105);
                      lj.field_N.e(-var26.field_s + var5, var6 - var26.field_t, 256);
                      if (var11 == 0) {
                        break L2;
                      } else {
                        L3: {
                          if (vh.field_h != var8) {
                            break L3;
                          } else {
                            var35 = wd.field_C[2];
                            var35.e(-(var35.field_o >> 989270945) + var5, var6 + -(var35.field_k >> 1368908609), 256);
                            break L3;
                          }
                        }
                        if (nc.field_bb != var8) {
                          break L2;
                        } else {
                          var36 = wd.field_C[1];
                          var36.e(-(var36.field_o >> 1928900705) + var5, -(var36.field_k >> -381005119) + var6, 256);
                          break L2;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L4: {
                    lj.field_N = new hj(var9, var10);
                    de.a(param2 ^ -1048454, lj.field_N);
                    var26.b(112, 144, var26.field_s << 1142094340, var26.field_t << -608288572, -this.field_G << 75582378, 4096);
                    oc.g((byte) -105);
                    lj.field_N.e(-var26.field_s + var5, var6 - var26.field_t, 256);
                    if (var11 == 0) {
                      break L4;
                    } else {
                      L5: {
                        if (vh.field_h != var8) {
                          break L5;
                        } else {
                          var33 = wd.field_C[2];
                          var33.e(-(var33.field_o >> 989270945) + var5, var6 + -(var33.field_k >> 1368908609), 256);
                          break L5;
                        }
                      }
                      if (nc.field_bb != var8) {
                        break L4;
                      } else {
                        var34 = wd.field_C[1];
                        var34.e(-(var34.field_o >> 1928900705) + var5, -(var34.field_k >> -381005119) + var6, 256);
                        break L4;
                      }
                    }
                  }
                  return;
                }
              } else {
                L6: {
                  lj.field_N = new hj(var9, var10);
                  de.a(param2 ^ -1048454, lj.field_N);
                  var26.b(112, 144, var26.field_s << 1142094340, var26.field_t << -608288572, -this.field_G << 75582378, 4096);
                  oc.g((byte) -105);
                  lj.field_N.e(-var26.field_s + var5, var6 - var26.field_t, 256);
                  if (var11 == 0) {
                    break L6;
                  } else {
                    L7: {
                      if (vh.field_h != var8) {
                        break L7;
                      } else {
                        var29 = wd.field_C[2];
                        var29.e(-(var29.field_o >> 989270945) + var5, var6 + -(var29.field_k >> 1368908609), 256);
                        break L7;
                      }
                    }
                    if (nc.field_bb != var8) {
                      break L6;
                    } else {
                      var30 = wd.field_C[1];
                      var30.e(-(var30.field_o >> 1928900705) + var5, -(var30.field_k >> -381005119) + var6, 256);
                      break L6;
                    }
                  }
                }
                return;
              }
            } else {
              L8: {
                lj.field_N = new hj(var9, var10);
                de.a(param2 ^ -1048454, lj.field_N);
                var26.b(112, 144, var26.field_s << 1142094340, var26.field_t << -608288572, -this.field_G << 75582378, 4096);
                oc.g((byte) -105);
                lj.field_N.e(-var26.field_s + var5, var6 - var26.field_t, 256);
                if (var11 == 0) {
                  break L8;
                } else {
                  L9: {
                    if (vh.field_h != var8) {
                      break L9;
                    } else {
                      var27 = wd.field_C[2];
                      var27.e(-(var27.field_o >> 989270945) + var5, var6 + -(var27.field_k >> 1368908609), 256);
                      break L9;
                    }
                  }
                  if (nc.field_bb != var8) {
                    break L8;
                  } else {
                    var28 = wd.field_C[1];
                    var28.e(-(var28.field_o >> 1928900705) + var5, -(var28.field_k >> -381005119) + var6, 256);
                    break L8;
                  }
                }
              }
              return;
            }
          } else {
            if (var8 == uj.field_b) {
              var15 = wd.field_C[0];
              var9 = var15.field_s << 740379745;
              var10 = var15.field_t << 1130362753;
              if (null != lj.field_N) {
                if (var9 <= lj.field_N.field_o) {
                  if (lj.field_N.field_k >= var10) {
                    de.a(-128, lj.field_N);
                    ul.d();
                    if (var11 != 0) {
                      L10: {
                        lj.field_N = new hj(var9, var10);
                        de.a(param2 ^ -1048454, lj.field_N);
                        var15.b(112, 144, var15.field_s << 1142094340, var15.field_t << -608288572, -this.field_G << 75582378, 4096);
                        oc.g((byte) -105);
                        lj.field_N.e(-var15.field_s + var5, var6 - var15.field_t, 256);
                        if (vh.field_h != var8) {
                          break L10;
                        } else {
                          var20 = wd.field_C[2];
                          var20.e(-(var20.field_o >> 989270945) + var5, var6 + -(var20.field_k >> 1368908609), 256);
                          break L10;
                        }
                      }
                      L11: {
                        if (nc.field_bb != var8) {
                          break L11;
                        } else {
                          var21 = wd.field_C[1];
                          var21.e(-(var21.field_o >> 1928900705) + var5, -(var21.field_k >> -381005119) + var6, 256);
                          break L11;
                        }
                      }
                      return;
                    } else {
                      L12: {
                        var15.b(112, 144, var15.field_s << 1142094340, var15.field_t << -608288572, -this.field_G << 75582378, 4096);
                        oc.g((byte) -105);
                        lj.field_N.e(-var15.field_s + var5, var6 - var15.field_t, 256);
                        if (var11 == 0) {
                          break L12;
                        } else {
                          L13: {
                            if (vh.field_h != var8) {
                              break L13;
                            } else {
                              var24 = wd.field_C[2];
                              var24.e(-(var24.field_o >> 989270945) + var5, var6 + -(var24.field_k >> 1368908609), 256);
                              break L13;
                            }
                          }
                          if (nc.field_bb != var8) {
                            break L12;
                          } else {
                            var25 = wd.field_C[1];
                            var25.e(-(var25.field_o >> 1928900705) + var5, -(var25.field_k >> -381005119) + var6, 256);
                            break L12;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    L14: {
                      lj.field_N = new hj(var9, var10);
                      de.a(param2 ^ -1048454, lj.field_N);
                      var15.b(112, 144, var15.field_s << 1142094340, var15.field_t << -608288572, -this.field_G << 75582378, 4096);
                      oc.g((byte) -105);
                      lj.field_N.e(-var15.field_s + var5, var6 - var15.field_t, 256);
                      if (var11 == 0) {
                        break L14;
                      } else {
                        L15: {
                          if (vh.field_h != var8) {
                            break L15;
                          } else {
                            var22 = wd.field_C[2];
                            var22.e(-(var22.field_o >> 989270945) + var5, var6 + -(var22.field_k >> 1368908609), 256);
                            break L15;
                          }
                        }
                        if (nc.field_bb != var8) {
                          break L14;
                        } else {
                          var23 = wd.field_C[1];
                          var23.e(-(var23.field_o >> 1928900705) + var5, -(var23.field_k >> -381005119) + var6, 256);
                          break L14;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L16: {
                    lj.field_N = new hj(var9, var10);
                    de.a(param2 ^ -1048454, lj.field_N);
                    var15.b(112, 144, var15.field_s << 1142094340, var15.field_t << -608288572, -this.field_G << 75582378, 4096);
                    oc.g((byte) -105);
                    lj.field_N.e(-var15.field_s + var5, var6 - var15.field_t, 256);
                    if (var11 == 0) {
                      break L16;
                    } else {
                      L17: {
                        if (vh.field_h != var8) {
                          break L17;
                        } else {
                          var18 = wd.field_C[2];
                          var18.e(-(var18.field_o >> 989270945) + var5, var6 + -(var18.field_k >> 1368908609), 256);
                          break L17;
                        }
                      }
                      if (nc.field_bb != var8) {
                        break L16;
                      } else {
                        var19 = wd.field_C[1];
                        var19.e(-(var19.field_o >> 1928900705) + var5, -(var19.field_k >> -381005119) + var6, 256);
                        break L16;
                      }
                    }
                  }
                  return;
                }
              } else {
                L18: {
                  lj.field_N = new hj(var9, var10);
                  de.a(param2 ^ -1048454, lj.field_N);
                  var15.b(112, 144, var15.field_s << 1142094340, var15.field_t << -608288572, -this.field_G << 75582378, 4096);
                  oc.g((byte) -105);
                  lj.field_N.e(-var15.field_s + var5, var6 - var15.field_t, 256);
                  if (var11 == 0) {
                    break L18;
                  } else {
                    L19: {
                      if (vh.field_h != var8) {
                        break L19;
                      } else {
                        var16 = wd.field_C[2];
                        var16.e(-(var16.field_o >> 989270945) + var5, var6 + -(var16.field_k >> 1368908609), 256);
                        break L19;
                      }
                    }
                    if (nc.field_bb != var8) {
                      break L18;
                    } else {
                      var17 = wd.field_C[1];
                      var17.e(-(var17.field_o >> 1928900705) + var5, -(var17.field_k >> -381005119) + var6, 256);
                      break L18;
                    }
                  }
                }
                return;
              }
            } else {
              L20: {
                L21: {
                  if (vh.field_h != var8) {
                    break L21;
                  } else {
                    var35 = wd.field_C[2];
                    var35.e(-(var35.field_o >> 989270945) + var5, var6 + -(var35.field_k >> 1368908609), 256);
                    if (var11 == 0) {
                      break L20;
                    } else {
                      break L21;
                    }
                  }
                }
                if (nc.field_bb != var8) {
                  break L20;
                } else {
                  var36 = wd.field_C[1];
                  var36.e(-(var36.field_o >> 1928900705) + var5, -(var36.field_k >> -381005119) + var6, 256);
                  break L20;
                }
              }
              return;
            }
          }
        }
    }

    final boolean a(int param0, pj param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -81) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("jf.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    jf(ga param0) {
        try {
            this.field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean j(int param0) {
        if (param0 != 989270945) {
            hj var2 = (hj) null;
            jf.a((byte) 68, 27, (hj) null, 15, -89, 88);
            return mb.field_c;
        }
        return mb.field_c;
    }

    final String g(int param0) {
        if (param0 != -8235) {
            return (String) null;
        }
        if (!(!this.field_t)) {
            return this.field_I.a(126);
        }
        return null;
    }

    final static void a(byte param0, int param1, hj param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_33_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var20 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (-param3 + param1 << 275702184) / param2.field_s;
              param4 = param4 + param2.field_u;
              param5 = param5 + param2.field_p;
              var7 = (param3 << -786160536) + param2.field_p * var6_int;
              var8 = param5 - -(ul.field_f * param4);
              var9 = 0;
              var10 = param2.field_k;
              var11 = param2.field_o;
              var12 = -var11 + ul.field_f;
              if (param4 >= ul.field_d) {
                break L1;
              } else {
                var14 = ul.field_d - param4;
                var9 = var9 + var14 * var11;
                var10 = var10 - var14;
                param4 = ul.field_d;
                var8 = var8 + var14 * ul.field_f;
                break L1;
              }
            }
            L2: {
              var13 = 0;
              if (ul.field_i > param5) {
                var14 = ul.field_i - param5;
                var12 = var12 + var14;
                var8 = var8 + var14;
                param5 = ul.field_i;
                var13 = var13 + var14;
                var11 = var11 - var14;
                var7 = var7 + var14 * var6_int;
                var9 = var9 + var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (ul.field_a < var10 + param4) {
                var10 = var10 - (-ul.field_a + (var10 + param4));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var11 + param5 <= ul.field_e) {
                break L4;
              } else {
                var14 = -ul.field_e + (var11 + param5);
                var11 = var11 - var14;
                var13 = var13 + var14;
                var12 = var12 + var14;
                break L4;
              }
            }
            L5: {
              if (-1 <= (var11 ^ -1)) {
                break L5;
              } else {
                if (-1 > (var10 ^ -1)) {
                  param4 = -var10;
                  L6: while (true) {
                    L7: {
                      if ((param4 ^ -1) <= -1) {
                        stackOut_33_0 = param0;
                        stackIn_34_0 = stackOut_33_0;
                        break L7;
                      } else {
                        var14 = var7;
                        stackOut_17_0 = -var11;
                        stackIn_34_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var20 != 0) {
                          break L7;
                        } else {
                          param5 = stackIn_18_0;
                          L8: while (true) {
                            L9: {
                              if (-1 >= (param5 ^ -1)) {
                                var8 = var8 + var12;
                                stackOut_31_0 = var9;
                                stackOut_31_1 = var13;
                                stackIn_32_0 = stackOut_31_0;
                                stackIn_32_1 = stackOut_31_1;
                                break L9;
                              } else {
                                var15 = var14 >> 271087368;
                                var16 = 256 - var15;
                                var14 = var14 + var6_int;
                                stackOut_20_0 = var15 ^ -1;
                                stackOut_20_1 = -1;
                                stackIn_32_0 = stackOut_20_0;
                                stackIn_32_1 = stackOut_20_1;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                if (var20 != 0) {
                                  break L9;
                                } else {
                                  L10: {
                                    L11: {
                                      if (stackIn_21_0 <= stackIn_21_1) {
                                        break L11;
                                      } else {
                                        var9++;
                                        var8++;
                                        if (var20 == 0) {
                                          break L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      incrementValue$1 = var9;
                                      var9++;
                                      var17 = param2.field_v[incrementValue$1];
                                      if (0 == var17) {
                                        break L12;
                                      } else {
                                        L13: {
                                          if (var15 <= 255) {
                                            break L13;
                                          } else {
                                            ul.field_b[var8] = var17;
                                            if (var20 == 0) {
                                              break L12;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        var18 = ul.field_b[var8];
                                        var19 = 16711935 & var15 * (var17 & 16711935) + var16 * (16711935 & var18) >> 1588870376;
                                        ul.field_b[var8] = var19 - -(vi.a(16711715, vi.a(var17, 65280) * var15 + vi.a(var18, 65280) * var16) >> 1328428936);
                                        break L12;
                                      }
                                    }
                                    var8++;
                                    break L10;
                                  }
                                  param5++;
                                  continue L8;
                                }
                              }
                            }
                            var9 = stackIn_32_0 + stackIn_32_1;
                            param4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    L14: {
                      if (stackIn_34_0 == -20) {
                        break L14;
                      } else {
                        field_H = -96;
                        break L14;
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L5;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var6 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var6);
            stackOut_37_1 = new StringBuilder().append("jf.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L15;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L15;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_H = 10;
    }
}
