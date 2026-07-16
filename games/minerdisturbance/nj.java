/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static String field_a;
    static vd field_e;
    static String field_d;
    static String[][] field_b;
    static ea[] field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = MinerDisturbance.field_ab;
        if (param5 == 255) {
          param1--;
          L0: while (true) {
            if (param1 >= 0) {
              var17 = param6;
              var10 = var17;
              var11 = param3;
              var12 = param8;
              var13 = param7;
              var14 = param0;
              var15 = var17[var11] >> 571312513 & 8355711;
              var10[var11] = var15 + (c.a(16711680, var12 >> -1666101471) + (c.a(65280, var13 >> -1371330711) - -c.a(var14 >> -2068372143, 255)));
              param3++;
              param0 = param0 + param4;
              param8 = param8 + param2;
              param7 = param7 + param9;
              param1--;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (null != w.field_W) {
              try {
                L0: {
                  w.field_W.a((byte) 115, 0L);
                  w.field_W.a(kj.field_a.field_u, 24, kj.field_a.field_o, true);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                if (param0 != 89) {
                  return;
                } else {
                  kj.field_a.field_o = kj.field_a.field_o + 24;
                  return;
                }
              }
              if (param0 != 89) {
                return;
              } else {
                kj.field_a.field_o = kj.field_a.field_o + 24;
                return;
              }
            } else {
              if (param0 != 89) {
                return;
              } else {
                kj.field_a.field_o = kj.field_a.field_o + 24;
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        if (param0) {
          L0: {
            var1 = 255 * (640 + ui.field_L) / 640;
            if (0 > var1) {
              var1 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          if (!lb.field_q) {
            if (!el.field_c) {
              L1: {
                ai.a(bj.field_e.field_f, 0, mf.field_c.field_D, 0, 307200);
                mf.field_c.g();
                eh.a(4, 4, 0, 0, 640, 480);
                mf.field_c.g(0, 0, 50);
                bj.field_e.a((byte) -45);
                lb.field_q = true;
                if (!el.field_c) {
                  break L1;
                } else {
                  L2: {
                    if (-256 >= (var1 ^ -1)) {
                      var1 = 255;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var1 = 255 + (-255 + var1);
                  break L1;
                }
              }
              if ((var1 ^ -1) <= -256) {
                mf.field_c.g(0, 0);
                return;
              } else {
                if (tb.field_e) {
                  mf.field_c.f(0, 0, var1);
                  return;
                } else {
                  if (el.field_c) {
                    mf.field_c.f(0, 0, var1);
                    return;
                  } else {
                    if (-12 > (oj.field_J ^ -1)) {
                      mf.field_c.f(0, 0, var1);
                      return;
                    } else {
                      mf.field_c.g(0, 0);
                      return;
                    }
                  }
                }
              }
            } else {
              L3: {
                if (!el.field_c) {
                  break L3;
                } else {
                  L4: {
                    if (-256 >= (var1 ^ -1)) {
                      var1 = 255;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var1 = 255 + (-255 + var1);
                  break L3;
                }
              }
              if ((var1 ^ -1) <= -256) {
                mf.field_c.g(0, 0);
                return;
              } else {
                if (tb.field_e) {
                  mf.field_c.f(0, 0, var1);
                  return;
                } else {
                  if (el.field_c) {
                    mf.field_c.f(0, 0, var1);
                    return;
                  } else {
                    if (-12 > (oj.field_J ^ -1)) {
                      mf.field_c.f(0, 0, var1);
                      return;
                    } else {
                      mf.field_c.g(0, 0);
                      return;
                    }
                  }
                }
              }
            }
          } else {
            L5: {
              if (!el.field_c) {
                break L5;
              } else {
                L6: {
                  if (-256 >= (var1 ^ -1)) {
                    var1 = 255;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var1 = 255 + (-255 + var1);
                break L5;
              }
            }
            if ((var1 ^ -1) <= -256) {
              mf.field_c.g(0, 0);
              return;
            } else {
              if (tb.field_e) {
                mf.field_c.f(0, 0, var1);
                return;
              } else {
                if (el.field_c) {
                  mf.field_c.f(0, 0, var1);
                  return;
                } else {
                  if (-12 > (oj.field_J ^ -1)) {
                    mf.field_c.f(0, 0, var1);
                    return;
                  } else {
                    mf.field_c.g(0, 0);
                    return;
                  }
                }
              }
            }
          }
        } else {
          L7: {
            field_a = null;
            var1 = 255 * (640 + ui.field_L) / 640;
            if (0 > var1) {
              var1 = 0;
              break L7;
            } else {
              break L7;
            }
          }
          if (!lb.field_q) {
            if (!el.field_c) {
              L8: {
                ai.a(bj.field_e.field_f, 0, mf.field_c.field_D, 0, 307200);
                mf.field_c.g();
                eh.a(4, 4, 0, 0, 640, 480);
                mf.field_c.g(0, 0, 50);
                bj.field_e.a((byte) -45);
                lb.field_q = true;
                if (!el.field_c) {
                  break L8;
                } else {
                  L9: {
                    if (-256 >= (var1 ^ -1)) {
                      var1 = 255;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var1 = 255 + (-255 + var1);
                  break L8;
                }
              }
              if ((var1 ^ -1) <= -256) {
                mf.field_c.g(0, 0);
                return;
              } else {
                if (tb.field_e) {
                  mf.field_c.f(0, 0, var1);
                  return;
                } else {
                  if (el.field_c) {
                    mf.field_c.f(0, 0, var1);
                    return;
                  } else {
                    if (-12 > (oj.field_J ^ -1)) {
                      mf.field_c.f(0, 0, var1);
                      return;
                    } else {
                      mf.field_c.g(0, 0);
                      return;
                    }
                  }
                }
              }
            } else {
              L10: {
                if (!el.field_c) {
                  break L10;
                } else {
                  L11: {
                    if (-256 >= (var1 ^ -1)) {
                      var1 = 255;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var1 = 255 + (-255 + var1);
                  break L10;
                }
              }
              L12: {
                if ((var1 ^ -1) <= -256) {
                  mf.field_c.g(0, 0);
                  break L12;
                } else {
                  if (tb.field_e) {
                    mf.field_c.f(0, 0, var1);
                    break L12;
                  } else {
                    if (el.field_c) {
                      mf.field_c.f(0, 0, var1);
                      break L12;
                    } else {
                      if (-12 > (oj.field_J ^ -1)) {
                        mf.field_c.f(0, 0, var1);
                        break L12;
                      } else {
                        mf.field_c.g(0, 0);
                        break L12;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L13: {
              if (!el.field_c) {
                break L13;
              } else {
                L14: {
                  if (-256 >= (var1 ^ -1)) {
                    var1 = 255;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var1 = 255 + (-255 + var1);
                break L13;
              }
            }
            L15: {
              if ((var1 ^ -1) <= -256) {
                mf.field_c.g(0, 0);
                break L15;
              } else {
                if (tb.field_e) {
                  mf.field_c.f(0, 0, var1);
                  break L15;
                } else {
                  if (el.field_c) {
                    mf.field_c.f(0, 0, var1);
                    break L15;
                  } else {
                    if (-12 > (oj.field_J ^ -1)) {
                      mf.field_c.f(0, 0, var1);
                      break L15;
                    } else {
                      mf.field_c.g(0, 0);
                      break L15;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        int var1 = 76 / ((param0 - 63) / 46);
        field_c = null;
        field_e = null;
        field_a = null;
        field_b = null;
    }

    final static boolean a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        if (param1 >= 104) {
          var2 = param0.charAt(0);
          var3 = 1;
          L0: while (true) {
            if (param0.length() > var3) {
              if (param0.charAt(var3) != var2) {
                return false;
              } else {
                var3++;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          nj.a((byte) -21);
          var2 = param0.charAt(0);
          var3 = 1;
          L1: while (true) {
            if (param0.length() > var3) {
              if (param0.charAt(var3) != var2) {
                return false;
              } else {
                var3++;
                continue L1;
              }
            } else {
              return true;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[][]{null, new String[1]};
        field_d = "Please wait...";
    }
}
