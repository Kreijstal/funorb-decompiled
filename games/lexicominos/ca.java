/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ca extends kd {
    ca field_l;
    ca field_m;
    static boolean field_k;
    long field_j;
    static ng field_n;
    static long field_h;
    static String field_o;
    static ki field_i;

    final static void c(boolean param0) {
        af.a(-56);
        if (!param0) {
          if (null == ug.field_y) {
            rg.a(-124);
            hc.h(249);
            wa.a(-45);
            if (el.a(1)) {
              ed.field_q.h(1, 0);
              kc.a(0, -1);
              ck.b((byte) -60);
              return;
            } else {
              ck.b((byte) -60);
              return;
            }
          } else {
            jd.a(ug.field_y, 160);
            rg.a(-124);
            hc.h(249);
            wa.a(-45);
            if (el.a(1)) {
              ed.field_q.h(1, 0);
              kc.a(0, -1);
              ck.b((byte) -60);
              return;
            } else {
              ck.b((byte) -60);
              return;
            }
          }
        } else {
          field_i = (ki) null;
          if (null != ug.field_y) {
            jd.a(ug.field_y, 160);
            rg.a(-124);
            hc.h(249);
            wa.a(-45);
            if (!el.a(1)) {
              ck.b((byte) -60);
              return;
            } else {
              ed.field_q.h(1, 0);
              kc.a(0, -1);
              ck.b((byte) -60);
              return;
            }
          } else {
            rg.a(-124);
            hc.h(249);
            wa.a(-45);
            if (el.a(1)) {
              ed.field_q.h(1, 0);
              kc.a(0, -1);
              ck.b((byte) -60);
              return;
            } else {
              ck.b((byte) -60);
              return;
            }
          }
        }
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 81) {
          L0: {
            field_n = (ng) null;
            if (ee.field_c != field_i) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ee.field_c != field_i) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(ab param0, int param1, java.awt.Frame param2) {
        RuntimeException runtimeException = null;
        ei var3 = null;
        int var4 = 0;
        bd var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = param0.a(param1 + -15232, param2);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (0 != var3.field_b) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ge.a(0, 10L);
                        if (var4 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (1 == var3.field_b) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ge.a(0, 100L);
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param1 == 15232) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = (bd) null;
                        ca.a(23, (int[]) null, (bd) null);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param2.setVisible(false);
                        param2.dispose();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("ca.O(");
                    stackIn_14_1 = stackIn_15_1;
                    if (param0 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param2 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        int var1 = -106 % ((42 - param0) / 35);
        field_i = null;
        field_o = null;
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param4) {
          field_o = (String) null;
          ja.b((byte) -128);
          lf.f(param2, param1, param0, param3);
          return;
        } else {
          ja.b((byte) -128);
          lf.f(param2, param1, param0, param3);
          return;
        }
    }

    final void b(int param0) {
        if (this.field_m != null) {
          this.field_m.field_l = this.field_l;
          this.field_l.field_m = this.field_m;
          this.field_l = null;
          if (param0 != 12) {
            field_o = (String) null;
            this.field_m = null;
            return;
          } else {
            this.field_m = null;
            return;
          }
        } else {
          return;
        }
    }

    protected ca() {
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        lj.field_b = null;
        re.field_X = null;
        gj.field_t = 0;
        var2 = rc.field_i;
        rc.field_i = jc.field_c;
        if (param1 == 51) {
          L0: {
            kb.field_b.field_j = 2;
            jc.field_c = var2;
            kb.field_b.field_p = kb.field_b.field_p + 1;
            if (param0 == -51) {
              break L0;
            } else {
              field_o = (String) null;
              break L0;
            }
          }
          L1: {
            if ((kb.field_b.field_p ^ -1) > -3) {
              break L1;
            } else {
              if ((param1 ^ -1) == -52) {
                return 2;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if ((kb.field_b.field_p ^ -1) > -3) {
              break L2;
            } else {
              if ((param1 ^ -1) == -51) {
                return 5;
              } else {
                break L2;
              }
            }
          }
          if (-5 < (kb.field_b.field_p ^ -1)) {
            return -1;
          } else {
            return 1;
          }
        } else {
          if (50 == param1) {
            kb.field_b.field_j = 5;
            if (var3 == 0) {
              jc.field_c = var2;
              kb.field_b.field_p = kb.field_b.field_p + 1;
              if (param0 == -51) {
                if ((kb.field_b.field_p ^ -1) > -3) {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    if (-5 < (kb.field_b.field_p ^ -1)) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    if ((param1 ^ -1) == -51) {
                      return 5;
                    } else {
                      if (-5 < (kb.field_b.field_p ^ -1)) {
                        return -1;
                      } else {
                        return 1;
                      }
                    }
                  }
                } else {
                  if ((param1 ^ -1) == -52) {
                    return 2;
                  } else {
                    if ((kb.field_b.field_p ^ -1) > -3) {
                      if (-5 < (kb.field_b.field_p ^ -1)) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      if ((param1 ^ -1) == -51) {
                        return 5;
                      } else {
                        if (-5 < (kb.field_b.field_p ^ -1)) {
                          return -1;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
              } else {
                field_o = (String) null;
                if ((kb.field_b.field_p ^ -1) > -3) {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    if (-5 < (kb.field_b.field_p ^ -1)) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    if ((param1 ^ -1) == -51) {
                      return 5;
                    } else {
                      if (-5 < (kb.field_b.field_p ^ -1)) {
                        return -1;
                      } else {
                        return 1;
                      }
                    }
                  }
                } else {
                  if ((param1 ^ -1) == -52) {
                    return 2;
                  } else {
                    if ((kb.field_b.field_p ^ -1) > -3) {
                      if (-5 < (kb.field_b.field_p ^ -1)) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      if ((param1 ^ -1) == -51) {
                        return 5;
                      } else {
                        if (-5 < (kb.field_b.field_p ^ -1)) {
                          return -1;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              kb.field_b.field_j = 2;
              jc.field_c = var2;
              kb.field_b.field_p = kb.field_b.field_p + 1;
              if (param0 == -51) {
                if ((kb.field_b.field_p ^ -1) > -3) {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    if (-5 < (kb.field_b.field_p ^ -1)) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    if ((param1 ^ -1) == -51) {
                      return 5;
                    } else {
                      if (-5 < (kb.field_b.field_p ^ -1)) {
                        return -1;
                      } else {
                        return 1;
                      }
                    }
                  }
                } else {
                  if ((param1 ^ -1) == -52) {
                    return 2;
                  } else {
                    L3: {
                      if ((kb.field_b.field_p ^ -1) > -3) {
                        break L3;
                      } else {
                        if ((param1 ^ -1) == -51) {
                          return 5;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (-5 < (kb.field_b.field_p ^ -1)) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                L4: {
                  field_o = (String) null;
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    break L4;
                  } else {
                    if ((param1 ^ -1) == -52) {
                      return 2;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    break L5;
                  } else {
                    if ((param1 ^ -1) == -51) {
                      return 5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (-5 < (kb.field_b.field_p ^ -1)) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            kb.field_b.field_j = 1;
            if (var3 != 0) {
              kb.field_b.field_j = 5;
              if (var3 != 0) {
                L6: {
                  kb.field_b.field_j = 2;
                  jc.field_c = var2;
                  kb.field_b.field_p = kb.field_b.field_p + 1;
                  if (param0 == -51) {
                    break L6;
                  } else {
                    field_o = (String) null;
                    break L6;
                  }
                }
                L7: {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    break L7;
                  } else {
                    if ((param1 ^ -1) == -52) {
                      return 2;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    break L8;
                  } else {
                    if ((param1 ^ -1) == -51) {
                      return 5;
                    } else {
                      break L8;
                    }
                  }
                }
                if (-5 >= (kb.field_b.field_p ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                L9: {
                  jc.field_c = var2;
                  kb.field_b.field_p = kb.field_b.field_p + 1;
                  if (param0 == -51) {
                    break L9;
                  } else {
                    field_o = (String) null;
                    break L9;
                  }
                }
                L10: {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    break L10;
                  } else {
                    if ((param1 ^ -1) == -52) {
                      return 2;
                    } else {
                      break L10;
                    }
                  }
                }
                L11: {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    break L11;
                  } else {
                    if ((param1 ^ -1) == -51) {
                      return 5;
                    } else {
                      break L11;
                    }
                  }
                }
                if (-5 >= (kb.field_b.field_p ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              jc.field_c = var2;
              kb.field_b.field_p = kb.field_b.field_p + 1;
              if (param0 == -51) {
                if ((kb.field_b.field_p ^ -1) > -3) {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    if (-5 >= (kb.field_b.field_p ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if ((param1 ^ -1) != -51) {
                      if (-5 >= (kb.field_b.field_p ^ -1)) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  }
                } else {
                  if ((param1 ^ -1) != -52) {
                    L12: {
                      if ((kb.field_b.field_p ^ -1) > -3) {
                        break L12;
                      } else {
                        if ((param1 ^ -1) == -51) {
                          return 5;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (-5 >= (kb.field_b.field_p ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 2;
                  }
                }
              } else {
                L13: {
                  field_o = (String) null;
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    break L13;
                  } else {
                    if ((param1 ^ -1) == -52) {
                      return 2;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if ((kb.field_b.field_p ^ -1) > -3) {
                    break L14;
                  } else {
                    if ((param1 ^ -1) == -51) {
                      return 5;
                    } else {
                      break L14;
                    }
                  }
                }
                if (-5 >= (kb.field_b.field_p ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int[] param1, bd param2) {
        int var3_int = 0;
        try {
            var3_int = param2.field_h;
            param1[3] = var3_int % 18 + 1;
            var3_int = var3_int / 18;
            param1[2] = 1 + var3_int % 12;
            var3_int = var3_int / param0;
            param1[1] = var3_int % 12;
            param1[0] = var3_int / 12;
            param1[1] = -param1[1] + 11;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ca.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean d(boolean param0) {
        if (!param0) {
            field_i = (ki) null;
            return true;
        }
        return true;
    }

    static {
        field_h = 20000000L;
        field_n = new ng();
        field_o = "Logging in...";
        field_i = new ki();
    }
}
