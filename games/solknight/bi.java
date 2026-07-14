/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bi {
    private hb field_g;
    private int field_j;
    static qc field_b;
    private int field_c;
    static int field_d;
    static int field_a;
    static int field_e;
    private hb field_f;
    static int field_i;
    static int field_h;

    final static void a(byte param0, int param1, int param2, int param3, uh param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        cf var21 = null;
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
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        uh var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        cf stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        cf stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          L1: {
            var40 = SolKnight.field_L ? 1 : 0;
            var45 = param4;
            if (var45.field_k == null) {
              break L1;
            } else {
              if (-2 <= (var45.field_j ^ -1)) {
                break L1;
              } else {
                var62 = var45.field_k;
                qj.a(0, var62, md.field_t, 0, 0);
                break L0;
              }
            }
          }
          ek.b(1);
          break L0;
        }
        L2: {
          var66 = new int[param4.field_b];
          var60 = var66;
          var55 = var60;
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var67 = new int[param4.field_b];
          var65 = mh.field_a;
          if (param0 >= 44) {
            break L2;
          } else {
            bi.a((byte) 81);
            break L2;
          }
        }
        var64 = fa.field_e;
        var63 = tk.field_r;
        var13 = 0;
        L3: while (true) {
          if (var13 >= param4.field_b) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= cf.field_c) {
                return;
              } else {
                L5: {
                  var14 = he.field_a[var44];
                  var15 = param4.field_K[var14];
                  var16 = param4.field_o[var14];
                  var17 = param4.field_w[var14];
                  if (param4.field_D[var14] >= mh.field_a.length) {
                    stackOut_24_0 = -1;
                    stackIn_25_0 = stackOut_24_0;
                    break L5;
                  } else {
                    stackOut_23_0 = param4.field_D[var14];
                    stackIn_25_0 = stackOut_23_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_25_0;
                  if (param4.field_C[var14] >= mh.field_a.length) {
                    stackOut_27_0 = -1;
                    stackIn_28_0 = stackOut_27_0;
                    break L6;
                  } else {
                    stackOut_26_0 = param4.field_C[var14];
                    stackIn_28_0 = stackOut_26_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_28_0;
                  if (param4.field_g[var14] >= mh.field_a.length) {
                    stackOut_30_0 = -1;
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  } else {
                    stackOut_29_0 = param4.field_g[var14];
                    stackIn_31_0 = stackOut_29_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_31_0;
                    if (vc.field_f == null) {
                      break L9;
                    } else {
                      if (null == param4.field_s) {
                        break L9;
                      } else {
                        if (var14 >= param4.field_s.length) {
                          break L9;
                        } else {
                          if (param4.field_s[var14] == -1) {
                            break L9;
                          } else {
                            if (param4.field_s[var14] >= vc.field_f.length) {
                              break L9;
                            } else {
                              stackOut_36_0 = vc.field_f[param4.field_s[var14]];
                              stackIn_38_0 = stackOut_36_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_37_0 = null;
                  stackIn_38_0 = (cf) (Object) stackOut_37_0;
                  break L8;
                }
                L10: {
                  var21 = stackIn_38_0;
                  var22 = qb.field_ab[var15];
                  var23 = a.field_d[var15];
                  var24 = qb.field_ab[var16];
                  var25 = a.field_d[var16];
                  var26 = qb.field_ab[var17];
                  var27 = a.field_d[var17];
                  if (var19 != var18) {
                    break L10;
                  } else {
                    if (var20 == var19) {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 != null) {
                          stackOut_47_0 = var21.field_a;
                          stackIn_48_0 = stackOut_47_0;
                          break L11;
                        } else {
                          stackOut_46_0 = 8355711;
                          stackIn_48_0 = stackOut_46_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_48_0;
                      var31 = var30 & 16711935;
                      var32 = var30 & 65280;
                      var33 = (16711919 & var32 * var28) >>> -1822674104 | var31 * var28 >>> 1598065544 & 1761542399;
                      var33 = var33 + 65793 * var29;
                      uf.a(var27, var26, var33 >> 395252289 & 8355711, var24, -113, var22, var23, var25);
                      var44++;
                      continue L4;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  var28 = var66[var18];
                  var29 = var66[var19];
                  var30 = var66[var20];
                  var31 = var67[var18];
                  var32 = var67[var19];
                  var33 = var67[var20];
                  if (var21 == null) {
                    stackOut_43_0 = 8355711;
                    stackIn_44_0 = stackOut_43_0;
                    break L12;
                  } else {
                    stackOut_42_0 = var21.field_a;
                    stackIn_44_0 = stackOut_42_0;
                    break L12;
                  }
                }
                var34 = stackIn_44_0;
                var35 = 16711935 & var34;
                var36 = var34 & 65280;
                var37 = (var28 * var36 & 16711860) >>> 1721603848 | (-16711739 & var35 * var28) >>> 1335525992;
                var38 = 167706879 & var35 * var29 >>> 1827174376 | 1761672960 & var29 * var36 >>> 1003761064;
                var38 = var38 + var32 * 65793;
                var37 = var37 + 65793 * var31;
                var39 = var35 * var30 >>> -1117359800 & -1124138753 | (16711776 & var36 * var30) >>> -15152536;
                var39 = var39 + var33 * 65793;
                w.a(var23, var26, 255 & var39, (65320 & var37) >> 1019571336, var24, var37 & 255, -22, var37 >> 1928597840, var39 >> -1075891632, var22, 255 & var38, var38 >> -1513576632 & 255, var38 >> -1460285456, var25, 255 & var39 >> -1428730936, var27);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = var63[var13] * param3 + (var64[var13] * param6 + param7 * var65[var13]) >> -1180556216;
              if (-1 < var14) {
                var14 = -var14;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (-1 > var14) {
                stackOut_15_0 = 128;
                stackIn_16_0 = stackOut_15_0;
                break L14;
              } else {
                if (128 > var14) {
                  stackOut_14_0 = var14 + 128;
                  stackIn_16_0 = stackOut_14_0;
                  break L14;
                } else {
                  stackOut_13_0 = 256;
                  stackIn_16_0 = stackOut_13_0;
                  break L14;
                }
              }
            }
            L15: {
              var14 = stackIn_16_0;
              var15 = var63[var13] * param2 + (param1 * var65[var13] + param5 * var64[var13]) >> -1112973432;
              stackOut_16_0 = ud.field_i;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (var15 >= 0) {
                stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                stackOut_18_1 = var15;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L15;
              } else {
                stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                stackOut_17_1 = -var15;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L15;
              }
            }
            var15 = stackIn_19_0[stackIn_19_1];
            var14 = var14 * (256 - var15) >>> -1217148632;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    final boolean a(byte param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = (Object) (Object) ((bi) this).field_f;
                    // monitorenter ((bi) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -46) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        bi.a((byte) 87);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((param3 ^ -1) > -1) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((bi) this).field_c < param3) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new IllegalArgumentException();
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = this.a(-24942, param2, param3, true, param1) ? 1 : 0;
                        if (var6 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = this.a(-24942, param2, param3, false, param1) ? 1 : 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var5
                        stackOut_9_0 = var6;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0 != 0;
                }
                case 11: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) var7;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte[] a(int param0, int param1) {
        try {
            Object var3 = null;
            IOException var4 = null;
            int var4_int = 0;
            int var5 = 0;
            byte[] var6 = null;
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
            Throwable var17 = null;
            int var18 = 0;
            Object stackIn_9_0 = null;
            Object stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_23_0 = null;
            Object stackIn_24_0 = null;
            byte[] stackIn_53_0 = null;
            byte[] stackIn_54_0 = null;
            Object stackIn_56_0 = null;
            Object stackOut_8_0 = null;
            Object stackOut_9_0 = null;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            Object stackOut_22_0 = null;
            Object stackOut_23_0 = null;
            byte[] stackOut_52_0 = null;
            byte[] stackOut_53_0 = null;
            Object stackOut_55_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = SolKnight.field_L ? 1 : 0;
                        var3 = (Object) (Object) ((bi) this).field_f;
                        // monitorenter ((bi) this).field_f
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if ((long)(6 + param1 * 6) <= ((bi) this).field_g.a(33)) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((bi) this).field_g.a((long)(6 * param1), (byte) 45);
                            ((bi) this).field_g.b(aj.field_t, -100, 0, 6);
                            var4_int = ((aj.field_t[0] & 255) << 127283760) - -((255 & aj.field_t[1]) << -925871512) - -(255 & aj.field_t[2]);
                            var5 = (255 & aj.field_t[5]) + ((255 & aj.field_t[4]) << 1282593640) + ((255 & aj.field_t[3]) << 18622608);
                            if (var4_int >= 0) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4_int <= ((bi) this).field_c) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = null;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            // monitorexit var3
                            stackOut_9_0 = stackIn_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return (byte[]) (Object) stackIn_10_0;
                    }
                    case 11: {
                        try {
                            if (var5 > 0) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if ((long)var5 <= ((bi) this).field_f.a(33) / 520L) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = null;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            // monitorexit var3
                            stackOut_15_0 = stackIn_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return (byte[]) (Object) stackIn_16_0;
                    }
                    case 17: {
                        try {
                            var6 = new byte[var4_int];
                            if (param0 == -925871512) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((bi) this).field_j = 45;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var7 = 0;
                            var8 = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var4_int <= var7) {
                                statePc = 52;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var5 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackOut_22_0 = null;
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            // monitorexit var3
                            stackOut_23_0 = stackIn_23_0;
                            stackIn_24_0 = stackOut_23_0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return (byte[]) (Object) stackIn_24_0;
                    }
                    case 25: {
                        try {
                            ((bi) this).field_f.a((long)(var5 * 520), (byte) 45);
                            var9 = var4_int + -var7;
                            if (65535 >= param1) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var14 = 10;
                            if ((var9 ^ -1) < -511) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var9 = 510;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((bi) this).field_f.b(aj.field_t, -79, 0, var9 - -var14);
                            var13 = aj.field_t[9] & 255;
                            var12 = ((255 & aj.field_t[7]) << -1631991192) + (16711680 & aj.field_t[6] << 980758512) + (255 & aj.field_t[8]);
                            var10 = (255 & aj.field_t[3]) + (aj.field_t[0] << -1950152040 & -16777216) + ((16711680 & aj.field_t[1] << -1028614288) - -((255 & aj.field_t[2]) << 1061416040));
                            var11 = (255 & aj.field_t[5]) + (65280 & aj.field_t[4] << 1513162664);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (512 < var9) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var9 = 512;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var14 = 8;
                            ((bi) this).field_f.b(aj.field_t, param0 + 925871438, 0, var9 + var14);
                            var13 = 255 & aj.field_t[7];
                            var10 = ((aj.field_t[0] & 255) << 292145288) + (aj.field_t[1] & 255);
                            var11 = (aj.field_t[2] << 1861713032 & 65280) + (255 & aj.field_t[3]);
                            var12 = ((255 & aj.field_t[5]) << 358326536) + (16711680 & aj.field_t[4] << 314267568) + (255 & aj.field_t[6]);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var10 == param1) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var11 == var8) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (((bi) this).field_j == var13) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var12 >= 0) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (((long)var12 ^ -1L) >= (((bi) this).field_f.a(33) / 520L ^ -1L)) {
                                statePc = 48;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            // monitorexit var3
                            return null;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var15 = var14 - -var9;
                            var16 = var14;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (var15 <= var16) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var7++;
                            var6[var7] = aj.field_t[var16];
                            var16++;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var8++;
                            var5 = var12;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            stackOut_52_0 = (byte[]) var6;
                            stackIn_53_0 = stackOut_52_0;
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 55 : 57);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            // monitorexit var3
                            stackOut_53_0 = (byte[]) (Object) stackIn_53_0;
                            stackIn_54_0 = stackOut_53_0;
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        return stackIn_54_0;
                    }
                    case 55: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            // monitorexit var3
                            stackOut_55_0 = null;
                            stackIn_56_0 = stackOut_55_0;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        return (byte[]) (Object) stackIn_56_0;
                    }
                    case 57: {
                        try {
                            var17 = caughtException;
                            // monitorexit var3
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 57;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        throw (RuntimeException) (Object) var17;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(int param0, byte[] param1, int param2, boolean param3, int param4) {
        try {
            Object var6 = null;
            IOException var7 = null;
            int var7_int = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            EOFException var14 = null;
            Throwable var15 = null;
            int var16 = 0;
            Object var17 = null;
            int stackIn_4_0 = 0;
            int stackIn_5_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_11_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_62_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_10_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_61_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = SolKnight.field_L ? 1 : 0;
                        var6 = (Object) (Object) ((bi) this).field_f;
                        // monitorenter ((bi) this).field_f
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!param3) {
                                statePc = 12;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if ((((bi) this).field_g.a(33) ^ -1L) <= ((long)(param4 * 6 + 6) ^ -1L)) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 0;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            // monitorexit var6
                            stackOut_4_0 = stackIn_4_0;
                            stackIn_5_0 = stackOut_4_0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0 != 0;
                    }
                    case 6: {
                        try {
                            ((bi) this).field_g.a((long)(param4 * 6), (byte) 45);
                            ((bi) this).field_g.b(aj.field_t, param0 ^ 24851, 0, 6);
                            var7_int = (aj.field_t[5] & 255) + ((aj.field_t[3] << 1994098000 & 16711680) - -(aj.field_t[4] << -247011768 & 65280));
                            if (0 >= var7_int) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((bi) this).field_f.a(33) / 520L >= (long)var7_int) {
                                statePc = 14;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var6
                            stackOut_10_0 = stackIn_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            var7_int = (int)((((bi) this).field_f.a(33) - -519L) / 520L);
                            if (-1 != (var7_int ^ -1)) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var7_int = 1;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            aj.field_t[1] = (byte)(param2 >> -310395960);
                            aj.field_t[2] = (byte)param2;
                            aj.field_t[5] = (byte)var7_int;
                            aj.field_t[0] = (byte)(param2 >> -599167696);
                            aj.field_t[3] = (byte)(var7_int >> -1662830480);
                            aj.field_t[4] = (byte)(var7_int >> -1638179320);
                            ((bi) this).field_g.a((long)(param4 * 6), (byte) 45);
                            ((bi) this).field_g.a(aj.field_t, -20291, 6, 0);
                            if (param0 == -24942) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var17 = null;
                            boolean discarded$1 = ((bi) this).a((byte) -38, -14, (byte[]) null, 28);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var8 = 0;
                            var9 = 0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (param2 <= var8) {
                                statePc = 58;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var10 = 0;
                            if (param3) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((bi) this).field_f.a((long)(520 * var7_int), (byte) 45);
                            if ((param4 ^ -1) < -65536) {
                                statePc = 25;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((bi) this).field_f.b(aj.field_t, -118, 0, 8);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof EOFException ? 23 : (stateCaught_21 instanceof IOException ? 61 : 63));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var10 = (16711680 & aj.field_t[4] << -179264656) - (-(aj.field_t[5] << 1667148456 & 65280) - (aj.field_t[6] & 255));
                            var12 = ((255 & aj.field_t[2]) << -1422679416) + (aj.field_t[3] & 255);
                            var13 = 255 & aj.field_t[7];
                            var11 = (255 & aj.field_t[1]) + (aj.field_t[0] << 761439560 & 65280);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((bi) this).field_f.b(aj.field_t, param0 + 24822, 0, 10);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof EOFException ? 27 : (stateCaught_25 instanceof IOException ? 61 : 63));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var14 = (EOFException) (Object) caughtException;
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var10 = (255 & aj.field_t[8]) + (aj.field_t[6] << -1091346576 & 16711680) - -(aj.field_t[7] << -1331777016 & 65280);
                            var11 = (255 & aj.field_t[3]) + (((aj.field_t[2] & 255) << 967179336) + (aj.field_t[1] << 1986446800 & 16711680) + ((aj.field_t[0] & 255) << -1916082024));
                            var13 = aj.field_t[9] & 255;
                            var12 = (255 & aj.field_t[5]) + ((aj.field_t[4] & 255) << -2028889848);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var11 != param4) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var12 != var9) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (((bi) this).field_j == var13) {
                                statePc = 36;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            // monitorexit var6
                            stackOut_34_0 = stackIn_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0 != 0;
                    }
                    case 36: {
                        try {
                            if (0 > var10) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (((bi) this).field_f.a(33) / 520L >= (long)var10) {
                                statePc = 42;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            stackOut_39_0 = 0;
                            stackIn_40_0 = stackOut_39_0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            // monitorexit var6
                            stackOut_40_0 = stackIn_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        return stackIn_41_0 != 0;
                    }
                    case 42: {
                        try {
                            if (var10 != 0) {
                                statePc = 47;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var10 = (int)((((bi) this).field_f.a(33) + 519L) / 520L);
                            param3 = false;
                            if (0 != var10) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var10++;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var10 != var7_int) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var10++;
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (-513 > (param2 + -var8 ^ -1)) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var10 = 0;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if ((param4 ^ -1) < -65536) {
                                statePc = 53;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            aj.field_t[1] = (byte)param4;
                            aj.field_t[0] = (byte)(param4 >> 1834801704);
                            aj.field_t[3] = (byte)var9;
                            aj.field_t[6] = (byte)var10;
                            aj.field_t[4] = (byte)(var10 >> 910679536);
                            aj.field_t[7] = (byte)((bi) this).field_j;
                            aj.field_t[5] = (byte)(var10 >> 848896808);
                            aj.field_t[2] = (byte)(var9 >> 1582593576);
                            ((bi) this).field_f.a((long)(var7_int * 520), (byte) 45);
                            ((bi) this).field_f.a(aj.field_t, -20291, 8, 0);
                            var11 = -var8 + param2;
                            if (-513 <= (var11 ^ -1)) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var11 = 512;
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((bi) this).field_f.a(param1, param0 ^ 11823, var11, var8);
                            var8 = var8 + var11;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            aj.field_t[3] = (byte)param4;
                            aj.field_t[2] = (byte)(param4 >> 644578728);
                            aj.field_t[9] = (byte)((bi) this).field_j;
                            aj.field_t[1] = (byte)(param4 >> 1930267344);
                            aj.field_t[0] = (byte)(param4 >> 1823467064);
                            aj.field_t[6] = (byte)(var10 >> 992722800);
                            aj.field_t[5] = (byte)var9;
                            aj.field_t[7] = (byte)(var10 >> 1397823944);
                            aj.field_t[4] = (byte)(var9 >> 1764226344);
                            aj.field_t[8] = (byte)var10;
                            ((bi) this).field_f.a((long)(var7_int * 520), (byte) 45);
                            ((bi) this).field_f.a(aj.field_t, -20291, 10, 0);
                            var11 = param2 + -var8;
                            if (510 < var11) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var11 = 510;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((bi) this).field_f.a(param1, -20291, var11, var8);
                            var8 = var8 + var11;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var9++;
                            var7_int = var10;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            stackOut_58_0 = 1;
                            stackIn_59_0 = stackOut_58_0;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            // monitorexit var6
                            stackOut_59_0 = stackIn_59_0;
                            stackIn_60_0 = stackOut_59_0;
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        return stackIn_60_0 != 0;
                    }
                    case 61: {
                        try {
                            var7 = (IOException) (Object) caughtException;
                            // monitorexit var6
                            stackOut_61_0 = 0;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        return stackIn_62_0 != 0;
                    }
                    case 63: {
                        try {
                            var15 = caughtException;
                            // monitorexit var6
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        throw (RuntimeException) (Object) var15;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + ((bi) this).field_j;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 102) {
            field_i = -73;
        }
    }

    bi(int param0, hb param1, hb param2, int param3) {
        ((bi) this).field_g = null;
        ((bi) this).field_c = 65000;
        ((bi) this).field_f = null;
        ((bi) this).field_f = param1;
        ((bi) this).field_g = param2;
        ((bi) this).field_j = param0;
        ((bi) this).field_c = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
        field_a = 64;
        field_d = 2;
        field_i = 262144;
    }
}
