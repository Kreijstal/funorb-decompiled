/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rc extends w {
    static ae field_r;
    static boolean field_u;
    static uj field_t;
    static String field_q;
    static String[] field_s;
    static ka[] field_p;

    public static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            field_p = null;
            field_t = null;
            field_s = null;
            field_r = null;
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "rc.M(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var33 = TorChallenge.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9_int = (param3 >> -2074329087) + param5;
                        var10 = -(param4 >> -1722364127) + param7;
                        var11 = param8 - -(param1 >> 225921601);
                        var12 = param0 - (param6 >> -1635528223);
                        var13 = 1;
                        var14 = 1;
                        var15 = 2048;
                        var9_int = var9_int % var15;
                        var11 = var11 % var15;
                        var16 = var11 - var9_int;
                        if (var16 >= 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var13 = -1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var16 = var16 * var13;
                        if (var16 <= var15 >> 174243297) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var13 = -var13;
                        var16 = var15 - var16;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var16 = (var16 >> -236733055) * var13 + var9_int;
                        var16 = var16 % var15;
                        var17 = var12 - var10;
                        if ((var17 ^ -1) > -1) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var14 = -1;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var17 = var17 * var14;
                        var17 = (var17 >> -1661208927) * var14 + var10;
                        var18 = var16 / 32;
                        var19 = 256 * (var16 + -(var18 * 32)) / 32;
                        var20 = var17 / 64;
                        var21 = (-(var20 * 64) + var17) * 256 / 64;
                        var22 = -1;
                        var23 = 0;
                        var24 = 0;
                        var25 = ol.field_c[var23][var24][4];
                        var27 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (8 <= var27) {
                            statePc = 32;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var26 = 1;
                        stackIn_33_0 = 0;
                        stackIn_12_0 = stackIn_33_0;
                        if (var33 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var28 = stackIn_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (3 <= var28) {
                            statePc = 25;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_34_0 = ol.field_c[var27][var28][4] ^ -1;
                        stackIn_15_0 = stackIn_34_0;
                        stackIn_34_1 = -1;
                        stackIn_15_1 = stackIn_34_1;
                        if (var33 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 < stackIn_15_1) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var25 > ol.field_c[var27][var28][4]) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var24 = var28;
                        var23 = var27;
                        var25 = ol.field_c[var27][var28][4];
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var26 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var28++;
                        if (var33 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var26 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var22 = var27;
                        if (var33 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var27++;
                        if (var33 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = stackIn_33_0;
                        stackIn_34_1 = var22;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 > stackIn_34_1) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var22 = var23;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var27 = 0;
                        ol.field_c[var22][var27][0] = var18;
                        ol.field_c[var22][var27][2] = var19;
                        ol.field_c[var22][var27][1] = var20;
                        ol.field_c[var22][var27][3] = var21;
                        ol.field_c[var22][var27][4] = 24;
                        if (param2) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        rc.c((byte) 127);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var31 = var16;
                        var32 = var17;
                        var27 = 1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (3 <= var27) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var28 = e.b((byte) 57, 32);
                        var29 = e.b((byte) 57, 32);
                        var30 = e.b((byte) 57, 6);
                        var17 = var29 + var32 + -16;
                        ol.field_c[var22][var27][4] = var30 + 24;
                        var16 = -16 + var31 + var28;
                        var18 = var16 / 32;
                        var20 = var17 / 64;
                        var19 = (var16 - 32 * var18) * 256 / 32;
                        ol.field_c[var22][var27][0] = var18;
                        var21 = (var17 + -(64 * var20)) * 256 / 64;
                        ol.field_c[var22][var27][2] = var19;
                        ol.field_c[var22][var27][1] = var20;
                        ol.field_c[var22][var27][3] = var21;
                        var27++;
                        if (var33 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return;
                }
                case 44: {
                    var9 = (RuntimeException) ((Object) caughtException);
                    throw oj.a((Throwable) ((Object) var9), "rc.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    rc() {
    }

    final static void d(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_58_0 = false;
        int stackIn_65_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_57_0;
        pa var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        qk var5_ref = null;
        qk var6 = null;
        String var6_ref = null;
        qk var7 = null;
        String var7_ref = null;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 68) {
                break L1;
              } else {
                rc.b(true);
                break L1;
              }
            }
            var1 = id.field_b;
            var2 = var1.j(-126);
            if ((var2 ^ -1) != -1) {
              if (-2 != (var2 ^ -1)) {
                if ((var2 ^ -1) == -3) {
                  L2: {
                    if ((oj.field_f ^ -1) == -2) {
                      oj.field_f = 2;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((var2 ^ -1) != -4) {
                    if (var2 != 4) {
                      td.a("F1: " + ck.a(-13299), (Throwable) null, (byte) -70);
                      ob.b(-128);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      oj.field_f = 1;
                      var3 = var1.b(false);
                      me.field_d = ((String) (var3)).intern();
                      var4 = var1.j(-108);
                      bd.a(-116, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    L3: {
                      if (-3 != (oj.field_f ^ -1)) {
                        break L3;
                      } else {
                        oj.field_f = 1;
                        break L3;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                L4: {
                  if (gl.field_e != null) {
                    break L4;
                  } else {
                    gl.field_e = new aa(128);
                    kf.field_c = 0;
                    break L4;
                  }
                }
                L5: {
                  var3 = var1.b(false);
                  if (((String) (var3)).equals("")) {
                    var3 = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var4_ref_String = var1.b(false);
                  var5 = var1.b(false);
                  var6 = ri.a(0, var4_ref_String);
                  if (null != var6) {
                    break L6;
                  } else {
                    var6 = ri.a(0, var5);
                    if (var6 == null) {
                      break L6;
                    } else {
                      gl.field_e.a((long)il.a((CharSequence) ((Object) var4_ref_String), (byte) 21).hashCode(), var6, -47);
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var6 == null) {
                    var6 = new qk();
                    gl.field_e.a((long)il.a((CharSequence) ((Object) var4_ref_String), (byte) 21).hashCode(), var6, 121);
                    fieldTemp$0 = kf.field_c;
                    kf.field_c = kf.field_c + 1;
                    var6.field_ob = fieldTemp$0;
                    rk.field_g.a(var6, -35);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var3 != null) {
                    var3 = ((String) (var3)).intern();
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var6.field_mb = (String) (var3);
                var6.field_F = var4_ref_String;
                var6.a(true);
                var7 = (qk) ((Object) rk.field_g.c((byte) -7));
                L9: while (true) {
                  L10: {
                    L11: {
                      L12: {
                        L13: {
                          if (var7 == null) {
                            break L13;
                          } else {
                            stackOut_57_0 = fd.a(var6, 116, var7);
                            stackIn_65_0 = stackOut_57_0 ? 1 : 0;
                            stackIn_58_0 = stackOut_57_0;
                            if (var8 != 0) {
                              break L12;
                            } else {
                              if (!stackIn_58_0) {
                                break L13;
                              } else {
                                var7 = (qk) ((Object) rk.field_g.c(-270));
                                if (var8 == 0) {
                                  continue L9;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                        }
                        if (var7 == null) {
                          break L11;
                        } else {
                          stackIn_65_0 = 52;
                          break L12;
                        }
                      }
                      na.a((byte) stackIn_65_0, var7, var6);
                      if (var8 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                    rk.field_g.a(var6, -86);
                    break L10;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              L14: {
                if (mh.field_e == null) {
                  mh.field_e = new aa(128);
                  og.field_a = 0;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (-2 != (var1.j(-107) ^ -1)) {
                  stackIn_15_0 = 0;
                  break L15;
                } else {
                  stackIn_15_0 = 1;
                  break L15;
                }
              }
              L16: {
                var3_int = stackIn_15_0;
                var4_ref_String = var1.b(false);
                if (var3_int == 0) {
                  break L16;
                } else {
                  var1.b(false);
                  break L16;
                }
              }
              L17: {
                var5_ref = wf.a((byte) -123, var4_ref_String);
                var6_ref = var1.b(false);
                var7_ref = il.a((CharSequence) ((Object) var4_ref_String), (byte) 21);
                if (var7_ref == null) {
                  var7_ref = var4_ref_String;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (null != var5_ref) {
                  break L18;
                } else {
                  var5_ref = wf.a((byte) -123, var6_ref);
                  if (var5_ref != null) {
                    mh.field_e.a((long)var7_ref.hashCode(), var5_ref, -102);
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                if (null == var5_ref) {
                  var5_ref = new qk();
                  mh.field_e.a((long)var7_ref.hashCode(), var5_ref, 118);
                  fieldTemp$1 = og.field_a;
                  og.field_a = og.field_a + 1;
                  var5_ref.field_ob = fieldTemp$1;
                  ie.field_d.a(var5_ref, -42);
                  break L19;
                } else {
                  break L19;
                }
              }
              var5_ref.field_F = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "rc.J(" + param0 + ')');
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

    final static void c(byte param0) {
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_135_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_138_1 = 0;
        int stackIn_143_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TorChallenge.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = 0;
                        var2 = 0;
                        var3 = 0;
                        if (!d.p(-115)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4 = eh.field_l;
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = jj.field_c;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ae.field_z = ae.field_z ^ 32;
                        ac.field_d = ac.field_d ^ 32;
                        if (!t.a(0, var4, 121)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (0 >= fg.field_N) {
                            statePc = 19;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (0 >= of.field_f) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (gh.field_x) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (qk.field_lb < of.field_f + fg.field_N) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        hf.a(255, param0 + 110, 0);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (t.a(1, var4, 117)) {
                            statePc = 34;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((of.field_f ^ -1) >= -1) {
                            statePc = 34;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!gh.field_x) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((wj.field_a ^ -1) > (of.field_f ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if ((ea.field_e ^ -1) >= -1) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        hf.a(254, 89, 1);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (!t.a(2, var4, 126)) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (0 >= gf.a(hd.field_c[vj.field_c], (byte) 78)) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        hf.a(253, 13, 2);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (t.a(3, var4, 121)) {
                            statePc = 47;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if ((gf.a(hd.field_c[vj.field_c], (byte) 78) ^ -1) <= -4) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        hf.a(252, param0 ^ -62, 3);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (t.a(4, var4, 117)) {
                            statePc = 61;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var5 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (3 <= var5) {
                            statePc = 57;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_58_0 = 3;
                        stackIn_51_0 = stackIn_58_0;
                        stackIn_58_1 = gf.a(hd.field_c[var5], (byte) 78);
                        stackIn_51_1 = stackIn_58_1;
                        if (var7 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 <= stackIn_51_1) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var1_int++;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackIn_58_0 = var1_int;
                        stackIn_58_1 = 3;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 < stackIn_58_1) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        hf.a(251, 121, 4);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (t.a(5, var4, 123)) {
                            statePc = 67;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (2 > ab.field_d) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        hf.a(250, 98, 5);
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (t.a(6, var4, 126)) {
                            statePc = 73;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if ((ab.field_d ^ -1) > -5) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        hf.a(249, 55, 6);
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (!t.a(7, var4, 113)) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (6 <= ab.field_d) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        hf.a(248, 125, 7);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (!t.a(8, var4, 116)) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var5 = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (3 <= var5) {
                            statePc = 91;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackIn_96_0 = 1 << var5 & hk.field_c[vj.field_c] ^ -1;
                        stackIn_86_0 = stackIn_96_0;
                        stackIn_96_1 = -1;
                        stackIn_86_1 = stackIn_96_1;
                        if (var7 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (stackIn_86_0 >= stackIn_86_1) {
                            statePc = 90;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var2++;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var2 <= 0) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        hf.a(247, param0 ^ -68, 8);
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var2 = 0;
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        stackIn_96_0 = 9;
                        stackIn_96_1 = var4;
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (!t.a(stackIn_96_0, stackIn_96_1, param0 + 196)) {
                            statePc = 99;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var5 = 0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (-4 >= (var5 ^ -1)) {
                            statePc = 107;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        stackIn_108_0 = 1 << var5 & hk.field_c[vj.field_c] ^ -1;
                        stackIn_102_0 = stackIn_108_0;
                        stackIn_108_1 = -1;
                        stackIn_102_1 = stackIn_108_1;
                        if (var7 != 0) {
                            statePc = 108;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (stackIn_102_0 >= stackIn_102_1) {
                            statePc = 106;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var2++;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackIn_108_0 = 2;
                        stackIn_108_1 = var2;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (stackIn_108_0 <= stackIn_108_1) {
                            statePc = 110;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        hf.a(246, 112, 9);
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var2 = 0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (t.a(10, var4, param0 ^ -45)) {
                            statePc = 126;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var5 = 0;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if ((var5 ^ -1) <= -4) {
                            statePc = 121;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackIn_122_0 = 0;
                        stackIn_116_0 = stackIn_122_0;
                        stackIn_122_1 = 1 << var5 & hk.field_c[vj.field_c];
                        stackIn_116_1 = stackIn_122_1;
                        if (var7 != 0) {
                            statePc = 122;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (stackIn_116_0 >= stackIn_116_1) {
                            statePc = 120;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var2++;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 114;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        stackIn_122_0 = var2 ^ -1;
                        stackIn_122_1 = -4;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (stackIn_122_0 <= stackIn_122_1) {
                            statePc = 124;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        hf.a(245, 86, 10);
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var2 = 0;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (param0 == -82) {
                            statePc = 128;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 127: {
                    return;
                }
                case 128: {
                    try {
                        if (!t.a(11, var4, 127)) {
                            statePc = 131;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var5 = 0;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        stackIn_133_0 = 3;
                        stackIn_133_1 = var5;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (stackIn_133_0 <= stackIn_133_1) {
                            statePc = 142;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackIn_143_0 = 0;
                        stackIn_135_0 = stackIn_143_0;
                        if (var7 != 0) {
                            statePc = 143;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        var6 = stackIn_135_0;
                        statePc = 136;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        if (-4 >= (var6 ^ -1)) {
                            statePc = 141;
                        } else {
                            statePc = 137;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        stackIn_133_0 = hk.field_c[var5] & 1 << var6 ^ -1;
                        stackIn_138_0 = stackIn_133_0;
                        stackIn_133_1 = -1;
                        stackIn_138_1 = stackIn_133_1;
                        if (var7 != 0) {
                            statePc = 133;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (stackIn_138_0 >= stackIn_138_1) {
                            statePc = 140;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        var2++;
                        statePc = 140;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var6++;
                        if (var7 == 0) {
                            statePc = 136;
                        } else {
                            statePc = 141;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 132;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackIn_143_0 = -10;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (stackIn_143_0 < (var2 ^ -1)) {
                            statePc = 146;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        hf.a(244, 113, 11);
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        var2 = 0;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (t.a(12, var4, 117)) {
                            statePc = 153;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        if ((rk.a((byte) -119, pi.field_d[vj.field_c]) ^ -1) > -21) {
                            statePc = 153;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        hf.a(243, param0 + 172, 12);
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (t.a(13, var4, 113)) {
                            statePc = 159;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (30 > rk.a((byte) 118, pi.field_d[vj.field_c])) {
                            statePc = 159;
                        } else {
                            statePc = 155;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        hf.a(242, 101, 13);
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (t.a(14, var4, 121)) {
                            statePc = 170;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        var5 = 0;
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if (var5 >= 3) {
                            statePc = 166;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        var3 = var3 + rk.a((byte) 49, pi.field_d[var5]);
                        var5++;
                        if (var7 != 0) {
                            statePc = 169;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (var7 == 0) {
                            statePc = 161;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        if (90 <= var3) {
                            statePc = 169;
                        } else {
                            statePc = 167;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        hf.a(241, 29, 14);
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        if (t.a(15, var4, param0 + 196)) {
                            statePc = 180;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (!gh.field_m) {
                            statePc = 180;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (ea.field_e > 0) {
                            statePc = 179;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        hf.a(240, 100, 15);
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (t.a(16, var4, 116)) {
                            statePc = 190;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        if (g.a(125, 0)) {
                            statePc = 186;
                        } else {
                            statePc = 182;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        if (-151 < (qh.field_J ^ -1)) {
                            statePc = 190;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        var5 = 16;
                        var6 = 255 + -var5;
                        hf.a(var6, param0 + 97, var5);
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 189: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw oj.a((Throwable) ((Object) var1), "rc.L(" + param0 + ')');
                }
                case 190: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -2) {
              stackIn_4_0 = lh.e(0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 89;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var4), "rc.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_r = null;
        field_u = false;
        field_q = "Back";
        ka discarded$0 = new ka(96, 96);
        field_s = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
