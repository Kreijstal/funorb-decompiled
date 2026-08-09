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
        int var5;
        int var6;
        qd var8;
        int var9;
        int var10;
        int var11;
        hj var15;
        hj var16;
        hj var17;
        hj var18;
        hj var19;
        hj var20;
        hj var21;
        hj var22;
        hj var23;
        hj var24;
        hj var25;
        hj var26;
        hj var27;
        hj var28;
        hj var29;
        hj var30;
        hj var31;
        hj var32;
        hj var33;
        hj var34;
        hj var35;
        hj var36;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -81) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jf.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        int incrementValue$0 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
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
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var14 = ul.field_d - param4;
                        var9 = var9 + var14 * var11;
                        var10 = var10 - var14;
                        param4 = ul.field_d;
                        var8 = var8 + var14 * ul.field_f;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var13 = 0;
                        if (ul.field_i > param5) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var14 = ul.field_i - param5;
                        var12 = var12 + var14;
                        var8 = var8 + var14;
                        param5 = ul.field_i;
                        var13 = var13 + var14;
                        var11 = var11 - var14;
                        var7 = var7 + var14 * var6_int;
                        var9 = var9 + var14;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (ul.field_a < var10 + param4) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10 = var10 - (-ul.field_a + (var10 + param4));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var11 + param5 <= ul.field_e) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var14 = -ul.field_e + (var11 + param5);
                        var11 = var11 - var14;
                        var13 = var13 + var14;
                        var12 = var12 + var14;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-1 <= (var11 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-1 > (var10 ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        param4 = -var10;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((param4 ^ -1) <= -1) {
                            statePc = 33;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var14 = var7;
                        stackIn_34_0 = -var11;
                        stackIn_18_0 = stackIn_34_0;
                        if (var20 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param5 = stackIn_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-1 >= (param5 ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var15 = var14 >> 271087368;
                        var16 = 256 - var15;
                        var14 = var14 + var6_int;
                        stackIn_32_0 = var15 ^ -1;
                        stackIn_21_0 = stackIn_32_0;
                        stackIn_32_1 = -1;
                        stackIn_21_1 = stackIn_32_1;
                        if (var20 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0 <= stackIn_21_1) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9++;
                        var8++;
                        if (var20 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        incrementValue$0 = var9;
                        var9++;
                        var17 = param2.field_v[incrementValue$0];
                        if (0 == var17) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var15 <= 255) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ul.field_b[var8] = var17;
                        if (var20 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var18 = ul.field_b[var8];
                        var19 = 16711935 & var15 * (var17 & 16711935) + var16 * (16711935 & var18) >> 1588870376;
                        ul.field_b[var8] = var19 - -(vi.a(16711715, vi.a(var17, 65280) * var15 + vi.a(var18, 65280) * var16) >> 1328428936);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var8++;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        param5++;
                        if (var20 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var8 = var8 + var12;
                        stackIn_32_0 = var9;
                        stackIn_32_1 = var13;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = stackIn_32_0 + stackIn_32_1;
                        param4++;
                        if (var20 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = param0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 == -20) {
                            statePc = 41;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        field_H = -96;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_39_0 = (RuntimeException) (var6);
                    stackIn_38_0 = stackIn_39_0;
                    stackIn_39_1 = new StringBuilder().append("jf.KA(").append(param0).append(',').append(param1).append(',');
                    stackIn_38_1 = stackIn_39_1;
                    if (param2 == null) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_40_0 = (RuntimeException) ((Object) stackIn_38_0);
                    stackIn_40_1 = (StringBuilder) ((Object) stackIn_38_1);
                    stackIn_40_2 = "{...}";
                    statePc = 40;
                    continue stateLoop;
                }
                case 39: {
                    stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                    stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                    stackIn_40_2 = "null";
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    throw dd.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 41: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_H = 10;
    }
}
