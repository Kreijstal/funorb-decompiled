/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends qa {
    char[] field_D;
    int[] field_x;
    boolean field_y;
    char[] field_r;
    static String field_v;
    static String field_C;
    static String field_z;
    static String field_w;
    static String field_u;
    int[] field_B;
    static String field_t;
    static String field_q;
    String field_s;
    static String field_A;

    final static String e(int param0) {
        String var1 = "";
        if (param0 != -24093) {
            return (String) null;
        }
        if (null != b.field_c) {
            var1 = b.field_c.h(6728);
        }
        if (!(-1 != (var1.length() ^ -1))) {
            var1 = ki.a((byte) -127);
        }
        if (!((var1.length() ^ -1) != -1)) {
            var1 = hg.field_vb;
        }
        return var1;
    }

    private final void a(int param0, k param1, int param2) {
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        char[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        char[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -9) {
                break L1;
              } else {
                ob.c((byte) 74);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (1 != param2) {
                    break L4;
                  } else {
                    this.field_s = param1.f((byte) -93);
                    if (var7 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (-3 == (param2 ^ -1)) {
                    break L5;
                  } else {
                    L6: {
                      if (param2 == 3) {
                        break L6;
                      } else {
                        if ((param2 ^ -1) == -5) {
                          this.field_y = true;
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    var4_int = param1.g(31365);
                    this.field_D = new char[var4_int];
                    this.field_B = new int[var4_int];
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        if (var4_int <= var5) {
                          break L8;
                        } else {
                          this.field_B[var5] = param1.d((byte) 69);
                          var6 = param1.d(-249699580);
                          if (var7 != 0) {
                            break L3;
                          } else {
                            L9: {
                              stackIn_16_0 = this.field_D;

                              stackIn_16_1 = var5;

                              if (0 != var6) {
                                stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
                                stackIn_17_1 = stackIn_16_1;
                                stackIn_17_2 = ob.a((byte) var6, -1);
                                break L9;
                              } else {
                                stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
                                stackIn_17_1 = stackIn_16_1;
                                stackIn_17_2 = 0;
                                break L9;
                              }
                            }
                            stackIn_17_0[stackIn_17_1] = (char) stackIn_17_2;
                            var5++;
                            if (var7 == 0) {
                              continue L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var4_int = param1.g(31365);
                this.field_r = new char[var4_int];
                this.field_x = new int[var4_int];
                var5 = 0;
                L10: while (true) {
                  if ((var4_int ^ -1) >= (var5 ^ -1)) {
                    break L3;
                  } else {
                    this.field_x[var5] = param1.d((byte) 69);
                    var6 = param1.d(-249699580);
                    if (var7 == 0) {
                      L11: {
                        stackIn_25_0 = this.field_r;

                        stackIn_25_1 = var5;

                        if ((var6 ^ -1) != -1) {
                          stackIn_26_0 = (char[]) ((Object) stackIn_25_0);
                          stackIn_26_1 = stackIn_25_1;
                          stackIn_26_2 = ob.a((byte) var6, -1);
                          break L11;
                        } else {
                          stackIn_26_0 = (char[]) ((Object) stackIn_25_0);
                          stackIn_26_1 = stackIn_25_1;
                          stackIn_26_2 = 0;
                          break L11;
                        }
                      }
                      stackIn_26_0[stackIn_26_1] = (char) stackIn_26_2;
                      var5++;
                      if (var7 == 0) {
                        continue L10;
                      } else {
                        break L3;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4);

            stackIn_30_1 = new StringBuilder().append("ob.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L12;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L12;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ')');
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (null != this.field_B) {
                        statePc = 17;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_x != null) {
                        statePc = 3;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var2 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (this.field_x.length > var2) {
                        statePc = 9;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param0 == -72) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ob.a((byte) -85, -72);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 9: {
                    this.field_x[var2] = cr.b(this.field_x[var2], 32768);
                    var2++;
                    if (var3 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    if (var3 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (param0 != -72) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 16: {
                    ob.a((byte) -85, -72);
                    return;
                }
                case 17: {
                    var2 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (this.field_B.length <= var2) {
                        statePc = 41;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    this.field_B[var2] = cr.b(this.field_B[var2], 32768);
                    var2++;
                    if (var3 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (var3 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (this.field_x != null) {
                        statePc = 27;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (param0 == -72) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ob.a((byte) -85, -72);
                    return;
                }
                case 25: {
                    return;
                }
                case 27: {
                    var2 = 0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (this.field_x.length <= var2) {
                        statePc = 37;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    this.field_x[var2] = cr.b(this.field_x[var2], 32768);
                    var2++;
                    if (var3 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 31: {
                    if (var3 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (param0 == -72) {
                        statePc = 35;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    ob.a((byte) -85, -72);
                    return;
                }
                case 35: {
                    return;
                }
                case 37: {
                    if (param0 == -72) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ob.a((byte) -85, -72);
                    return;
                }
                case 40: {
                    return;
                }
                case 41: {
                    if (this.field_x != null) {
                        statePc = 46;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (param0 == -72) {
                        statePc = 45;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ob.a((byte) -85, -72);
                    return;
                }
                case 45: {
                    return;
                }
                case 46: {
                    var2 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (this.field_x.length <= var2) {
                        statePc = 54;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    this.field_x[var2] = cr.b(this.field_x[var2], 32768);
                    var2++;
                    if (var3 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    return;
                }
                case 50: {
                    if (var3 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (param0 == -72) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    ob.a((byte) -85, -72);
                    return;
                }
                case 53: {
                    return;
                }
                case 54: {
                    if (param0 == -72) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ob.a((byte) -85, -72);
                    return;
                }
                case 56: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean d(byte param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 >= 3) {
          var1 = bl.a((byte) 55);
          var3 = -wn.field_r + var1;
          if ((var3 ^ -1L) >= -30001L) {
            L0: {
              L1: {
                var5 = 3000;
                if (-8 < (vd.field_c ^ -1)) {
                  break L1;
                } else {
                  var5 = 12000;
                  if (var6 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if ((vd.field_c ^ -1) > -6) {
                  break L2;
                } else {
                  var5 = 9000;
                  if (var6 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              if (vd.field_c >= 3) {
                var5 = 6000;
                break L0;
              } else {
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  wn.field_r = var1;
                  vd.field_c = vd.field_c + 1;
                  return true;
                } else {
                  return false;
                }
              }
            }
            if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
              wn.field_r = var1;
              vd.field_c = vd.field_c + 1;
              return true;
            } else {
              return false;
            }
          } else {
            vd.field_c = 0;
            wn.field_r = var1;
            return true;
          }
        } else {
          ob.e(52);
          var1 = bl.a((byte) 55);
          var3 = -wn.field_r + var1;
          if ((var3 ^ -1L) >= -30001L) {
            var5 = 3000;
            if (-8 >= (vd.field_c ^ -1)) {
              var5 = 12000;
              if (var6 == 0) {
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  wn.field_r = var1;
                  vd.field_c = vd.field_c + 1;
                  return true;
                } else {
                  return false;
                }
              } else {
                L3: {
                  if ((vd.field_c ^ -1) > -6) {
                    break L3;
                  } else {
                    var5 = 9000;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                        wn.field_r = var1;
                        vd.field_c = vd.field_c + 1;
                        return true;
                      } else {
                        return false;
                      }
                    }
                  }
                }
                L4: {
                  if (vd.field_c >= 3) {
                    var5 = 6000;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  wn.field_r = var1;
                  vd.field_c = vd.field_c + 1;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              if ((vd.field_c ^ -1) <= -6) {
                var5 = 9000;
                if (var6 == 0) {
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    wn.field_r = var1;
                    vd.field_c = vd.field_c + 1;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  L5: {
                    if (vd.field_c >= 3) {
                      var5 = 6000;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                    wn.field_r = var1;
                    vd.field_c = vd.field_c + 1;
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                L6: {
                  if (vd.field_c >= 3) {
                    var5 = 6000;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                  wn.field_r = var1;
                  vd.field_c = vd.field_c + 1;
                  return true;
                } else {
                  return false;
                }
              }
            }
          } else {
            vd.field_c = 0;
            wn.field_r = var1;
            return true;
          }
        }
    }

    final void a(int param0, k param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = param1.g(31365);
                        if (0 == var3_int) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(-56, param1, var3_int);
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3_int = -23 / ((param0 - 19) / 42);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_9_0 = (RuntimeException) (runtimeException);
                    stackIn_8_0 = stackIn_9_0;
                    stackIn_9_1 = new StringBuilder().append("ob.M(").append(param0).append(',');
                    stackIn_8_1 = stackIn_9_1;
                    if (param1 == null) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_8_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_8_1);
                    stackIn_10_2 = "{...}";
                    statePc = 10;
                    continue stateLoop;
                }
                case 9: {
                    stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_10_2 = "null";
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (!(param1 != (var2 ^ -1))) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (-129 >= (var2 ^ -1)) {
            if (var2 >= 160) {
                return (char)var2;
            }
            var3 = vg.field_s[-128 + var2];
            if (!(var3 != 0)) {
                var3 = 63;
            }
            var2 = var3;
        }
        return (char)var2;
    }

    public static void c(byte param0) {
        field_A = null;
        field_C = null;
        field_t = null;
        if (param0 != -52) {
            ob.c((byte) -29);
            field_q = null;
            field_z = null;
            field_w = null;
            field_u = null;
            field_v = null;
            return;
        }
        field_q = null;
        field_z = null;
        field_w = null;
        field_u = null;
        field_v = null;
    }

    final static void a(cj param0, int param1) {
        RuntimeException runtimeException = null;
        int var3 = 0;
        cj var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (cj) ((Object) param0.field_Cb.c(87));
                        if (param1 >= 30) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ob.e(34);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 == null) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4.field_mb = 0;
                        var4.field_z = 0;
                        var4.field_I = 0;
                        var4.field_Q = 0;
                        var4 = (cj) ((Object) param0.field_Cb.b(6));
                        if (var3 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var3 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param0.field_I = 0;
                        param0.field_Q = 0;
                        param0.field_z = 0;
                        param0.field_mb = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (runtimeException);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("ob.H(");
                    stackIn_10_1 = stackIn_11_1;
                    if (param0 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ob() {
        this.field_y = false;
    }

    static {
        field_v = "Your rating is <%0>";
        field_z = "Please enter your age in years";
        field_u = "Teleport";
        field_t = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_C = "??? points ";
        field_w = "to over <%0> great games";
        field_q = "x<%0>";
        field_A = "(Click or press 'SPACE' to close)";
    }
}
