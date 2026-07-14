/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static String field_b;
    static bd field_a;

    final static void a(byte param0, int param1) {
        int discarded$4 = jg.a(23);
        if (param0 != 112) {
            Object var3 = null;
            ml.a((vi) null, (java.math.BigInteger) null, 8, (java.math.BigInteger) null, (vi) null);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != -67) {
            return;
        }
        field_a = null;
    }

    final static ll a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          var2 = param1.length();
          if (param0 < -43) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        if (var2 == -1) {
          return gf.field_f;
        } else {
          if (-65 >= var2) {
            if (param1.charAt(0) == 34) {
              if (param1.charAt(var2 - 1) != 34) {
                return we.field_g;
              } else {
                var3 = 0;
                var4 = 1;
                L1: while (true) {
                  if (var4 < var2 + -1) {
                    var5 = param1.charAt(var4);
                    if (var5 == 92) {
                      L2: {
                        if (var3 != 0) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L2;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L2;
                        }
                      }
                      var3 = stackIn_20_0;
                      var4++;
                      continue L1;
                    } else {
                      L3: {
                        if (var5 != 34) {
                          break L3;
                        } else {
                          if (var3 != 0) {
                            break L3;
                          } else {
                            return we.field_g;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L1;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              var3 = 0;
              var4 = 0;
              L4: while (true) {
                if (var2 > var4) {
                  var5 = param1.charAt(var4);
                  if (var5 == 46) {
                    L5: {
                      if (var4 == 0) {
                        break L5;
                      } else {
                        if (var4 == var2 + -1) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    return we.field_g;
                  } else {
                    if (0 != (e.field_A.indexOf(var5) ^ -1)) {
                      var3 = 0;
                      var4++;
                      continue L4;
                    } else {
                      return we.field_g;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return hb.field_v;
          }
        }
    }

    final static void a(vi param0, java.math.BigInteger param1, int param2, java.math.BigInteger param3, vi param4) {
        hg.a(param4.field_n, -120, param4.field_i, param2, param0, param1, param3);
    }

    final static String a(byte param0, CharSequence param1) {
        if (param0 != -110) {
            return null;
        }
        return gm.a(param1, -116, false);
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        vi var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = new vi(param0);
                    var3 = var10.l(param1 ^ -32326);
                    var4 = var10.d(8195);
                    if (param1 == -76) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var9 = null;
                    String discarded$7 = ml.a((byte) -45, (CharSequence) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var4 < 0) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (mk.field_H == -1) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 > mk.field_H) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (-1 == var3) {
                        statePc = 21;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5_int = var10.d(8195);
                    if (-1 < (var5_int ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (mk.field_H == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (var5_int <= mk.field_H) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    throw new RuntimeException();
                }
                case 13: {
                    var17 = new byte[var5_int];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (-2 != (var3 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    int discarded$8 = wf.a(var17, var5_int, param0, var4, 9);
                    statePc = 20;
                    continue stateLoop;
                }
                case 15: {
                    var7 = (Object) (Object) tg.field_b;
                    // monitorenter tg.field_b
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        tg.field_b.a(124, var17, var10);
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) var8;
                }
                case 20: {
                    return var6;
                }
                case 21: {
                    var18 = new byte[var4];
                    var16 = var18;
                    var14 = var16;
                    var12 = var14;
                    var5 = var12;
                    var10.a(var4, 0, var18, -18181);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, double param1, double param2, p param3, int[] param4, oj param5, int param6) {
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        p var13 = null;
        p var14 = null;
        L0: {
          var12 = HostileSpawn.field_I ? 1 : 0;
          if (-3 != (param4[param3.field_j.b(-4)] ^ -1)) {
            param3.field_l.a(6, (byte) 94, param3.field_c);
            break L0;
          } else {
            param3.field_i = 14;
            param3.field_e = 1;
            var9 = 16;
            var10 = 0;
            L1: while (true) {
              if (var10 >= var9) {
                break L0;
              } else {
                L2: {
                  var13 = jn.field_F[ib.field_c];
                  var13.field_c = Math.random() * 256.0;
                  if (var13.field_c >= 0.0) {
                    if (256.0 > var13.field_c) {
                      break L2;
                    } else {
                      var13.field_c = var13.field_c - 256.0;
                      break L2;
                    }
                  } else {
                    var13.field_c = var13.field_c + 256.0;
                    break L2;
                  }
                }
                var13.field_j.a((byte) 46, param3.field_j);
                var13.field_l.a(param3.field_l, -28860);
                var13.field_h = 0;
                var13.field_i = 37;
                var13.field_e = 0;
                ib.field_c = ib.field_c + 1;
                var10++;
                continue L1;
              }
            }
          }
        }
        L3: {
          param3.a(8573);
          param4[param6] = 0;
          if (param0 <= -96) {
            break L3;
          } else {
            field_a = null;
            break L3;
          }
        }
        L4: {
          if (param3.a(param1, param2, 29821)) {
            L5: {
              if ((param3.field_i ^ -1) != -15) {
                var9 = 16;
                var10 = 0;
                L6: while (true) {
                  if (var9 <= var10) {
                    break L5;
                  } else {
                    L7: {
                      var14 = jn.field_F[ib.field_c];
                      var14.field_c = 256.0 * Math.random();
                      if (0.0 <= var14.field_c) {
                        if (var14.field_c < 256.0) {
                          break L7;
                        } else {
                          var14.field_c = var14.field_c - 256.0;
                          break L7;
                        }
                      } else {
                        var14.field_c = var14.field_c + 256.0;
                        break L7;
                      }
                    }
                    var14.field_j.a((byte) 46, param3.field_j);
                    var14.field_l.a(param3.field_l, -28860);
                    ib.field_c = ib.field_c + 1;
                    var14.field_i = 37;
                    var14.field_e = 0;
                    var14.field_h = 0;
                    var10++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
            param5.field_F = 255;
            param5.field_z = 4;
            param3.field_i = 14;
            param3.field_e = 1;
            tk.a(1, fg.field_b, 0, true);
            break L4;
          } else {
            break L4;
          }
        }
        L8: {
          param4[param6] = 3;
          param3.field_e = param3.field_e + 1;
          if (param3.field_e > 32) {
            param3.field_i = -1;
            break L8;
          } else {
            break L8;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, boolean param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = HostileSpawn.field_I ? 1 : 0;
          if (param8 < param0) {
            if (param0 < param6) {
              tg.a(param5, param3, param11, param7, param0, param15, param10, param9, param8, param13, 1299210768, si.field_i, param4, param12, param1, param2, param6);
              break L0;
            } else {
              if (param8 < param6) {
                tg.a(param9, param3, param11, param7, param6, param10, param15, param5, param8, param1, 1299210768, si.field_i, param12, param4, param13, param2, param0);
                break L0;
              } else {
                tg.a(param9, param5, param12, param1, param8, param10, param2, param3, param6, param7, 1299210768, si.field_i, param11, param4, param13, param15, param0);
                break L0;
              }
            }
          } else {
            if (param8 >= param6) {
              if (param6 > param0) {
                tg.a(param3, param9, param4, param13, param6, param2, param15, param5, param0, param1, 1299210768, si.field_i, param12, param11, param7, param10, param8);
                break L0;
              } else {
                tg.a(param3, param5, param12, param1, param0, param2, param10, param9, param6, param13, 1299210768, si.field_i, param4, param11, param7, param15, param8);
                break L0;
              }
            } else {
              tg.a(param5, param9, param4, param13, param8, param15, param2, param3, param0, param7, 1299210768, si.field_i, param11, param12, param1, param10, param6);
              break L0;
            }
          }
        }
        L1: {
          if (!param14) {
            break L1;
          } else {
            ml.a((byte) -43);
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Orb points: ";
    }
}
