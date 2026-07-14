/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ama extends lba {
    private byte[] field_t;

    final byte[] a(int param0, int param1, int param2, int param3) {
        ((ama) this).field_t = new byte[2 * (param0 * param1 * param3)];
        if (param2 != 0) {
            ((ama) this).a(true, (byte) 84, 122);
            ((ama) this).a(param3, param0, param1, (byte) -90);
            return ((ama) this).field_t;
        }
        ((ama) this).a(param3, param0, param1, (byte) -90);
        return ((ama) this).field_t;
    }

    final static int a(il param0, String param1, int param2, int param3, String[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        if (param3 == 1) {
          var5 = param0.b(param1);
          if ((var5 ^ -1) < (param2 ^ -1)) {
            var6 = (var5 + (param2 + -1)) / param2;
            param2 = var5 / var6;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            var9 = 0;
            L0: while (true) {
              if (var8 <= var9) {
                if ((var7 ^ -1) > (var8 ^ -1)) {
                  var6++;
                  param4[var6] = param1.substring(var7, var8).trim();
                  return var6;
                } else {
                  return var6;
                }
              } else {
                L1: {
                  L2: {
                    var10 = param1.charAt(var9);
                    if (var10 == 32) {
                      break L2;
                    } else {
                      if (45 == var10) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var11 = param1.substring(var7, 1 + var9).trim();
                  var12 = param0.b(var11);
                  if ((param2 ^ -1) >= (var12 ^ -1)) {
                    var6++;
                    param4[var6] = var11;
                    var7 = 1 + var9;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (var10 != 62) {
                    var9++;
                    break L3;
                  } else {
                    if (param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
                      var6++;
                      param4[var6] = param1.substring(var7, -3 + var9).trim();
                      var7 = var9 - -1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var9++;
                continue L0;
              }
            }
          } else {
            if (param1.indexOf("<br>") != -1) {
              var6 = (var5 + (param2 + -1)) / param2;
              param2 = var5 / var6;
              var6 = 0;
              var7 = 0;
              var8 = param1.length();
              var9 = 0;
              L4: while (true) {
                if (var8 <= var9) {
                  if ((var7 ^ -1) <= (var8 ^ -1)) {
                    return var6;
                  } else {
                    var6++;
                    param4[var6] = param1.substring(var7, var8).trim();
                    return var6;
                  }
                } else {
                  L5: {
                    L6: {
                      var10 = param1.charAt(var9);
                      if (var10 == 32) {
                        break L6;
                      } else {
                        if (45 == var10) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var11 = param1.substring(var7, 1 + var9).trim();
                    var12 = param0.b(var11);
                    if ((param2 ^ -1) >= (var12 ^ -1)) {
                      var6++;
                      param4[var6] = var11;
                      var7 = 1 + var9;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (var10 != 62) {
                      var9++;
                      break L7;
                    } else {
                      if (param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
                        var6++;
                        param4[var6] = param1.substring(var7, -3 + var9).trim();
                        var7 = var9 - -1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var9++;
                  continue L4;
                }
              }
            } else {
              param4[0] = (String) (Object) param4;
              return 1;
            }
          }
        } else {
          L8: {
            var14 = null;
            int discarded$1 = ama.a((il) null, (String) null, -117, -80, (String[]) null);
            var5 = param0.b(param1);
            if ((var5 ^ -1) < (param2 ^ -1)) {
              var6 = (var5 + (param2 + -1)) / param2;
              param2 = var5 / var6;
              var6 = 0;
              var7 = 0;
              var8 = param1.length();
              var9 = 0;
              break L8;
            } else {
              if (param1.indexOf("<br>") != -1) {
                var6 = (var5 + (param2 + -1)) / param2;
                param2 = var5 / var6;
                var6 = 0;
                var7 = 0;
                var8 = param1.length();
                var9 = 0;
                break L8;
              } else {
                param4[0] = (String) (Object) param4;
                return 1;
              }
            }
          }
          L9: while (true) {
            if (var8 <= var9) {
              if ((var7 ^ -1) > (var8 ^ -1)) {
                var6++;
                param4[var6] = param1.substring(var7, var8).trim();
                return var6;
              } else {
                return var6;
              }
            } else {
              L10: {
                L11: {
                  var10 = param1.charAt(var9);
                  if (var10 == 32) {
                    break L11;
                  } else {
                    if (45 == var10) {
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
                var11 = param1.substring(var7, 1 + var9).trim();
                var12 = param0.b(var11);
                if ((param2 ^ -1) >= (var12 ^ -1)) {
                  var6++;
                  param4[var6] = var11;
                  var7 = 1 + var9;
                  break L10;
                } else {
                  break L10;
                }
              }
              L12: {
                if (var10 != 62) {
                  var9++;
                  break L12;
                } else {
                  if (param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
                    var6++;
                    param4[var6] = param1.substring(var7, -3 + var9).trim();
                    var7 = var9 - -1;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              var9++;
              continue L9;
            }
          }
        }
    }

    final void a(boolean param0, byte param1, int param2) {
        if (param0) {
            return;
        }
        int var4 = param2 * 2;
        int var5 = param1 & 255;
        var4++;
        ((ama) this).field_t[var4] = (byte)(var5 * 3 >> -440280539);
        ((ama) this).field_t[var4] = (byte)(3 * var5 >> 454976933);
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_11_0 = 0;
            int stackIn_13_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_10_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if ((vc.field_q.field_h ^ -1) <= (param0 ^ -1)) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        if (oba.field_e == null) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return false;
                    }
                    case 6: {
                        try {
                            var2_int = oba.field_e.c(param1 ^ -1);
                            if ((var2_int ^ -1) >= -1) {
                                statePc = 14;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if ((var2_int ^ -1) >= (-vc.field_q.field_h + param0 ^ -1)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2_int = -vc.field_q.field_h + param0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            oba.field_e.a(param1 + 1, vc.field_q.field_h, vc.field_q.field_g, var2_int);
                            ue.field_s = bva.b((byte) -107);
                            vc.field_q.field_h = vc.field_q.field_h + var2_int;
                            if (param0 <= vc.field_q.field_h) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0 != 0;
                    }
                    case 12: {
                        try {
                            vc.field_q.field_h = 0;
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            if ((var2_int ^ -1) > param1) {
                                statePc = 17;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (rf.b((byte) -121) <= 30000L) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            dea.a(60);
                            return false;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            dea.a(60);
                            return false;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return false;
                    }
                    case 20: {
                        var2 = (IOException) (Object) caughtException;
                        dea.a(60);
                        return false;
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

    ama() {
        super(8, 5, 8, 8, 2, 0.10000000149011612f, 0.550000011920929f, 3.0f);
    }

    static {
    }
}
