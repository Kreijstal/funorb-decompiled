/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rra {
    static hja[] field_a;
    int field_b;
    static jea field_e;
    int field_d;
    int field_c;

    final static int a(boolean param0, int param1) {
        if (0 > param1) {
          if (param1 < -65536) {
            return wl.field_i[134217728 / -param1] - 2048;
          } else {
            return -wl.field_i[-param1 >> 5];
          }
        } else {
          if (param1 <= 65536) {
            return wl.field_i[param1 >> 5];
          } else {
            return -wl.field_i[134217728 / param1] + 2048;
          }
        }
    }

    abstract void a(int param0, int param1, int param2);

    final static void a(int param0) {
        try {
            int var1 = 0;
            Exception var2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var1 = 0;
              if (fua.field_b == null) {
                break L0;
              } else {
                try {
                  L1: {
                    fua.field_b.a((byte) 27, 0L);
                    fua.field_b.a(vc.field_q.field_g, vc.field_q.field_h, (byte) -17, 24);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  vc.field_q.field_h = vc.field_q.field_h + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            vc.field_q.field_h = vc.field_q.field_h + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(byte param0, int param1, int param2);

    abstract void a(int param0, int param1, boolean param2);

    final static boolean a(byte param0, char param1) {
        if (32 > param1) {
          L0: {
            if (param1 < 160) {
              break L0;
            } else {
              if (param1 > 255) {
                break L0;
              } else {
                return true;
              }
            }
          }
          if (8364 != param1) {
            if (param1 != 338) {
              if (8212 != param1) {
                if (param1 != 339) {
                  if (param1 != 376) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          if (126 < param1) {
            if (param1 >= 160) {
              if (param1 > 255) {
                if (8364 != param1) {
                  if (param1 != 338) {
                    if (8212 != param1) {
                      if (param1 != 339) {
                        if (param1 == 376) {
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
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              if (8364 != param1) {
                if (param1 != 338) {
                  if (8212 != param1) {
                    if (param1 != 339) {
                      if (param1 == 376) {
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
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_e = null;
    }

    rra(int param0, int param1, int param2) {
        ((rra) this).field_c = param0;
        ((rra) this).field_b = param1;
        ((rra) this).field_d = param2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param3 != param5) {
          if (pka.field_b <= param0 + -param5) {
            if (param0 - -param5 <= ss.field_c) {
              if (-param3 + param2 >= gca.field_d) {
                if (hc.field_h < param3 + param2) {
                  hl.a(param6, param1, param2, param0, true, param5, param7, param3);
                  return;
                } else {
                  ota.a(param7, param3, param5, param6, param0, -1923382751, param1, param2);
                  return;
                }
              } else {
                hl.a(param6, param1, param2, param0, true, param5, param7, param3);
                return;
              }
            } else {
              hl.a(param6, param1, param2, param0, true, param5, param7, param3);
              return;
            }
          } else {
            hl.a(param6, param1, param2, param0, true, param5, param7, param3);
            return;
          }
        } else {
          nf.a(param5, param2, param6, param0, param7, param1, -91);
          return;
        }
    }

    static {
    }
}
