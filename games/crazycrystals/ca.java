/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends jb {
    int field_l;
    int field_f;
    static String field_g;
    int field_h;
    int field_k;
    int field_i;
    int field_n;
    static int field_j;
    static int field_m;

    final static String a(String param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = CrazyCrystals.field_B;
                    var4 = param2.indexOf(param3);
                    if (param1 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_m = -105;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (0 != (var4 ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return param2;
                }
                case 4: {
                    param2 = param2.substring(0, var4) + param0 + param2.substring(var4 + param3.length());
                    stackIn_6_0 = (String) (param2);
                    stackIn_5_0 = stackIn_6_0;
                    if (var5 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    var4 = ((String) (Object) stackIn_6_0).indexOf(param3, param0.length() + var4);
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return param2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_m = 115;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = CrazyCrystals.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        kh.f(param1, param2, 1 + param4, 10000536);
                        var5_int = 70 / ((param0 - -78) / 42);
                        kh.f(param1, param2 - -param3, 1 + param4, 12105912);
                        var6 = 1;
                        if (kh.field_b > param2 + var6) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = -param2 + kh.field_b;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = param3;
                        if (kh.field_j < param2 + var7) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = -param2 + kh.field_j;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = var6;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 <= var8) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = var8 * 48 / param3 + 152;
                        var10 = var9 | (var9 << 557459208 | var9 << -10100976);
                        kh.field_i[param1 + kh.field_l * (var8 + param2)] = var10;
                        kh.field_i[param4 + param1 + kh.field_l * (var8 + param2)] = var10;
                        var8++;
                        if (var11 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        return;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw dn.a((Throwable) ((Object) var5), "ca.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        int var6;
        int var7;
        rc.field_b[be.field_c] = param3;
        wp.field_d[be.field_c] = be.field_c;
        mh.field_l[be.field_c] = param2;
        if (param2 >= ae.field_F) {
          if (param2 <= uo.field_m) {
            L0: {
              dk.field_l[be.field_c] = param0;
              j.field_i[be.field_c] = param1;
              cd.field_u[be.field_c] = param5;
              var6 = param5 + param1 + param0;
              if (var6 == 0) {
                stackIn_45_0 = 0;
                break L0;
              } else {
                stackIn_45_0 = 1000 * param0 / var6;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_45_0;
              jk.field_g[be.field_c] = var7;
              be.field_c = be.field_c + 1;
              if (db.field_i > var7) {
                db.field_i = var7;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (em.field_i < var7) {
                em.field_i = var7;
                break L2;
              } else {
                break L2;
              }
            }
            if (!param4) {
              ca.a((byte) 11, -117, 22, 53, 16);
              return;
            } else {
              return;
            }
          } else {
            L3: {
              em.field_i = param2;
              dk.field_l[be.field_c] = param0;
              j.field_i[be.field_c] = param1;
              cd.field_u[be.field_c] = param5;
              var6 = param5 + param1 + param0;
              if (var6 == 0) {
                stackIn_32_0 = 0;
                break L3;
              } else {
                stackIn_32_0 = 1000 * param0 / var6;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_32_0;
              jk.field_g[be.field_c] = var7;
              be.field_c = be.field_c + 1;
              if (db.field_i > var7) {
                db.field_i = var7;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (em.field_i < var7) {
                em.field_i = var7;
                break L5;
              } else {
                break L5;
              }
            }
            if (!param4) {
              ca.a((byte) 11, -117, 22, 53, 16);
              return;
            } else {
              return;
            }
          }
        } else {
          db.field_i = param2;
          if (param2 > uo.field_m) {
            L6: {
              em.field_i = param2;
              dk.field_l[be.field_c] = param0;
              j.field_i[be.field_c] = param1;
              cd.field_u[be.field_c] = param5;
              var6 = param5 + param1 + param0;
              if (var6 == 0) {
                stackIn_18_0 = 0;
                break L6;
              } else {
                stackIn_18_0 = 1000 * param0 / var6;
                break L6;
              }
            }
            L7: {
              var7 = stackIn_18_0;
              jk.field_g[be.field_c] = var7;
              be.field_c = be.field_c + 1;
              if (db.field_i > var7) {
                db.field_i = var7;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (em.field_i < var7) {
                em.field_i = var7;
                break L8;
              } else {
                break L8;
              }
            }
            if (param4) {
              return;
            } else {
              ca.a((byte) 11, -117, 22, 53, 16);
              return;
            }
          } else {
            L9: {
              dk.field_l[be.field_c] = param0;
              j.field_i[be.field_c] = param1;
              cd.field_u[be.field_c] = param5;
              var6 = param5 + param1 + param0;
              if (var6 == 0) {
                stackIn_5_0 = 0;
                break L9;
              } else {
                stackIn_5_0 = 1000 * param0 / var6;
                break L9;
              }
            }
            L10: {
              var7 = stackIn_5_0;
              jk.field_g[be.field_c] = var7;
              be.field_c = be.field_c + 1;
              if (db.field_i > var7) {
                db.field_i = var7;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (em.field_i < var7) {
                em.field_i = var7;
                break L11;
              } else {
                break L11;
              }
            }
            if (!param4) {
              ca.a((byte) 11, -117, 22, 53, 16);
              return;
            } else {
              return;
            }
          }
        }
    }

    ca(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_n = param2;
        this.field_i = param0;
        this.field_f = param4;
        this.field_h = param3;
        this.field_l = param5;
        this.field_k = param1;
    }

    final static boolean a(byte param0) {
        if (param0 <= 3) {
            field_j = -8;
            return true;
        }
        return true;
    }

    static {
        field_g = "to return to the normal view.";
    }
}
