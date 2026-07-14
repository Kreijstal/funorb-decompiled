/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ep {
    static String field_d;
    static int[] field_c;
    static ak field_a;
    static jl field_b;

    final static int[] a(int[] param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        L0: {
          L1: {
            var13 = Pixelate.field_H ? 1 : 0;
            var2 = param0.length;
            if (null == qj.field_a) {
              break L1;
            } else {
              if (2 * var2 > qj.field_a.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          qj.field_a = new int[var2 * 2];
          bj.field_b = new int[var2 * 2];
          break L0;
        }
        ef.field_g = 0;
        var5 = param0[-2 + var2];
        var6 = param0[-1 + var2];
        var7_int = 0;
        L2: while (true) {
          L3: {
            if (var2 <= var7_int) {
              break L3;
            } else {
              L4: {
                L5: {
                  var4 = var6;
                  var3 = var5;
                  var5 = param0[var7_int];
                  var6 = param0[var7_int + 1];
                  if ((var5 ^ -1) <= (t.field_e ^ -1)) {
                    break L5;
                  } else {
                    if (var3 >= t.field_e) {
                      var8_int = var3;
                      var9 = var4;
                      var10 = var5;
                      var11 = var6;
                      ef.field_g = ef.field_g + 1;
                      qj.field_a[ef.field_g] = t.field_e;
                      ef.field_g = ef.field_g + 1;
                      qj.field_a[ef.field_g] = (-var9 + var11) * (-var8_int + t.field_e) / (var10 + -var8_int) + var9;
                      if (0 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (t.field_e <= var3) {
                    break L6;
                  } else {
                    var8_int = var5;
                    var9 = var6;
                    var10 = var3;
                    var11 = var4;
                    ef.field_g = ef.field_g + 1;
                    qj.field_a[ef.field_g] = t.field_e;
                    ef.field_g = ef.field_g + 1;
                    qj.field_a[ef.field_g] = (t.field_e - var8_int) * (-var9 + var11) / (var10 + -var8_int) + var9;
                    break L6;
                  }
                }
                ef.field_g = ef.field_g + 1;
                qj.field_a[ef.field_g] = var5;
                ef.field_g = ef.field_g + 1;
                qj.field_a[ef.field_g] = var6;
                break L4;
              }
              var7_int += 2;
              if (0 == 0) {
                continue L2;
              } else {
                break L3;
              }
            }
          }
          if (param1 != (ef.field_g ^ -1)) {
            var7 = bj.field_b;
            bj.field_b = qj.field_a;
            qj.field_a = var7;
            var2 = ef.field_g;
            ef.field_g = 0;
            var5 = bj.field_b[-2 + var2];
            var6 = bj.field_b[-1 + var2];
            var8_int = 0;
            L7: while (true) {
              L8: {
                if (var2 <= var8_int) {
                  break L8;
                } else {
                  L9: {
                    L10: {
                      var4 = var6;
                      var3 = var5;
                      var6 = bj.field_b[var8_int - -1];
                      var5 = bj.field_b[var8_int];
                      if (var5 >= t.field_h) {
                        break L10;
                      } else {
                        L11: {
                          if (var3 >= t.field_h) {
                            var9 = var5;
                            var10 = var6;
                            var11 = var3;
                            var12 = var4;
                            ef.field_g = ef.field_g + 1;
                            qj.field_a[ef.field_g] = t.field_h;
                            ef.field_g = ef.field_g + 1;
                            qj.field_a[ef.field_g] = var10 + (t.field_h + -var9) * (-var10 + var12) / (var11 + -var9);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        ef.field_g = ef.field_g + 1;
                        qj.field_a[ef.field_g] = var5;
                        ef.field_g = ef.field_g + 1;
                        qj.field_a[ef.field_g] = var6;
                        if (0 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (var3 < t.field_h) {
                      var9 = var3;
                      var10 = var4;
                      var11 = var5;
                      var12 = var6;
                      ef.field_g = ef.field_g + 1;
                      qj.field_a[ef.field_g] = t.field_h;
                      ef.field_g = ef.field_g + 1;
                      qj.field_a[ef.field_g] = (t.field_h + -var9) * (var12 - var10) / (var11 + -var9) + var10;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var8_int += 2;
                  if (0 == 0) {
                    continue L7;
                  } else {
                    break L8;
                  }
                }
              }
              if (ef.field_g != 0) {
                var7 = bj.field_b;
                bj.field_b = qj.field_a;
                qj.field_a = var7;
                var2 = ef.field_g;
                ef.field_g = 0;
                var5 = bj.field_b[var2 + -2];
                var6 = bj.field_b[var2 - 1];
                var8_int = 0;
                L12: while (true) {
                  L13: {
                    if (var2 <= var8_int) {
                      break L13;
                    } else {
                      L14: {
                        L15: {
                          var4 = var6;
                          var3 = var5;
                          var6 = bj.field_b[var8_int - -1];
                          var5 = bj.field_b[var8_int];
                          if ((t.field_f ^ -1) < (var6 ^ -1)) {
                            break L15;
                          } else {
                            L16: {
                              if (var4 >= t.field_f) {
                                break L16;
                              } else {
                                var9 = var5;
                                var10 = var6;
                                var11 = var3;
                                var12 = var4;
                                ef.field_g = ef.field_g + 1;
                                qj.field_a[ef.field_g] = var9 - -((-var9 + var11) * (t.field_f - var10) / (var12 + -var10));
                                ef.field_g = ef.field_g + 1;
                                qj.field_a[ef.field_g] = t.field_f;
                                break L16;
                              }
                            }
                            ef.field_g = ef.field_g + 1;
                            qj.field_a[ef.field_g] = var5;
                            ef.field_g = ef.field_g + 1;
                            qj.field_a[ef.field_g] = var6;
                            if (0 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        if (var4 >= t.field_f) {
                          var9 = var3;
                          var10 = var4;
                          var11 = var5;
                          var12 = var6;
                          ef.field_g = ef.field_g + 1;
                          qj.field_a[ef.field_g] = var9 - -((t.field_f + -var10) * (var11 - var9) / (var12 + -var10));
                          ef.field_g = ef.field_g + 1;
                          qj.field_a[ef.field_g] = t.field_f;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var8_int += 2;
                      if (0 == 0) {
                        continue L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (ef.field_g != 0) {
                    var7 = bj.field_b;
                    bj.field_b = qj.field_a;
                    var2 = ef.field_g;
                    qj.field_a = var7;
                    ef.field_g = 0;
                    var6 = bj.field_b[-1 + var2];
                    var5 = bj.field_b[var2 - 2];
                    var8_int = 0;
                    L17: while (true) {
                      L18: {
                        if (var2 <= var8_int) {
                          break L18;
                        } else {
                          L19: {
                            L20: {
                              var3 = var5;
                              var4 = var6;
                              var6 = bj.field_b[1 + var8_int];
                              var5 = bj.field_b[var8_int];
                              if (var6 >= t.field_a) {
                                break L20;
                              } else {
                                L21: {
                                  if (t.field_a <= var4) {
                                    var9 = var5;
                                    var10 = var6;
                                    var11 = var3;
                                    var12 = var4;
                                    ef.field_g = ef.field_g + 1;
                                    qj.field_a[ef.field_g] = (-var10 + t.field_a) * (var11 + -var9) / (-var10 + var12) + var9;
                                    ef.field_g = ef.field_g + 1;
                                    qj.field_a[ef.field_g] = t.field_a;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                ef.field_g = ef.field_g + 1;
                                qj.field_a[ef.field_g] = var5;
                                ef.field_g = ef.field_g + 1;
                                qj.field_a[ef.field_g] = var6;
                                if (0 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            if (t.field_a <= var4) {
                              break L19;
                            } else {
                              var9 = var3;
                              var10 = var4;
                              var11 = var5;
                              var12 = var6;
                              ef.field_g = ef.field_g + 1;
                              qj.field_a[ef.field_g] = var9 - -((var11 - var9) * (t.field_a - var10) / (var12 - var10));
                              ef.field_g = ef.field_g + 1;
                              qj.field_a[ef.field_g] = t.field_a;
                              break L19;
                            }
                          }
                          var8_int += 2;
                          if (0 == 0) {
                            continue L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      if (ef.field_g == 0) {
                        return null;
                      } else {
                        var17 = new int[ef.field_g];
                        var16 = var17;
                        var15 = var16;
                        var14 = var15;
                        var8 = var14;
                        qb.a(qj.field_a, 0, var17, 0, ef.field_g);
                        return var8;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        }
    }

    final static boolean a(byte param0, String param1) {
        Object var3 = null;
        L0: {
          if (param0 == 34) {
            break L0;
          } else {
            var3 = null;
            boolean discarded$2 = ep.a((byte) 64, (String) null);
            break L0;
          }
        }
        if (param1 != null) {
          if (param1.length() >= cl.field_a) {
            if (param1.length() > gd.field_l) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void c(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = Pixelate.field_H ? 1 : 0;
                        if (pm.field_h == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        pm.field_h.b((byte) 119);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (param0 == -26721) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        if (fh.field_J == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        fh.field_J.a((byte) -92);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (null != rj.field_G) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            rj.field_G.a(true);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (ug.field_l != null) {
                            statePc = 13;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (ug.field_l.length <= var1) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (null != ug.field_l[var1]) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            ug.field_l[var1].a(true);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 20: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 21: {
                        return;
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

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != -2) {
            Object var2 = null;
            int[] discarded$0 = ep.a((int[]) null, -67);
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 30022) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!wp.a(-8798)) {
              break L2;
            } else {
              if ((8 & pa.field_b) != 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Tiles Dropped: ";
    }
}
