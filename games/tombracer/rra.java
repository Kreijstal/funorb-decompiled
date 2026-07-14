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
        if (!param0) {
          if (0 > param1) {
            if ((param1 ^ -1) > 65535) {
              return wl.field_i[134217728 / -param1] - 2048;
            } else {
              return -wl.field_i[-param1 >> 396714277];
            }
          } else {
            if (-65537 <= (param1 ^ -1)) {
              return wl.field_i[param1 >> 303835941];
            } else {
              return -wl.field_i[134217728 / param1] + 2048;
            }
          }
        } else {
          return 45;
        }
    }

    abstract void a(int param0, int param1, int param2);

    final static void a(int param0) {
        try {
            int var1 = 0;
            Exception var2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var1 = 103 % ((12 - param0) / 39);
                        if (fua.field_b == null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            fua.field_b.a((byte) 27, 0L);
                            fua.field_b.a(vc.field_q.field_g, vc.field_q.field_h, (byte) -17, 24);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        vc.field_q.field_h = vc.field_q.field_h + 24;
                        return;
                    }
                    case 3: {
                        var2 = (Exception) (Object) caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        vc.field_q.field_h = vc.field_q.field_h + 24;
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

    abstract void a(byte param0, int param1, int param2);

    abstract void a(int param0, int param1, boolean param2);

    final static boolean a(byte param0, char param1) {
        if (param0 <= -77) {
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
            L1: {
              if (8364 == param1) {
                break L1;
              } else {
                if (param1 == 338) {
                  break L1;
                } else {
                  if (8212 == param1) {
                    break L1;
                  } else {
                    if (param1 == 339) {
                      break L1;
                    } else {
                      if (param1 != 376) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
            }
            return true;
          } else {
            if (126 < param1) {
              L2: {
                if (param1 < 160) {
                  break L2;
                } else {
                  if (param1 > 255) {
                    break L2;
                  } else {
                    return true;
                  }
                }
              }
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
          }
        } else {
          field_a = null;
          if (32 <= param1) {
            if (126 >= param1) {
              return true;
            } else {
              if (param1 >= 160) {
                if (param1 > 255) {
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
            }
          } else {
            L3: {
              if (param1 < 160) {
                break L3;
              } else {
                if (param1 > 255) {
                  break L3;
                } else {
                  return true;
                }
              }
            }
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
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            rra.a(false);
            field_a = null;
            field_e = null;
            return;
        }
        field_a = null;
        field_e = null;
    }

    rra(int param0, int param1, int param2) {
        ((rra) this).field_c = param0;
        ((rra) this).field_b = param1;
        ((rra) this).field_d = param2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        L0: {
          if (param4 == 0) {
            break L0;
          } else {
            rra.a(false);
            break L0;
          }
        }
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
