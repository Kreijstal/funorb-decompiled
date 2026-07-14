/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bf {
    static int field_e;
    static String field_m;
    static String field_i;
    static int field_a;
    o field_k;
    private int field_g;
    private boolean field_c;
    private int field_l;
    private int field_d;
    o[] field_j;
    static sh[] field_b;
    private int field_h;
    private int field_n;
    static oc field_f;

    public static void a(byte param0) {
        field_m = null;
        field_i = null;
        field_b = null;
        field_f = null;
        if (param0 <= 105) {
            field_f = null;
        }
    }

    final bf a(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 0) {
          L0: {
            bf discarded$13 = ((bf) this).d(-88, 84);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((bf) this).field_c = stackIn_8_1 != 0;
          return (bf) this;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((bf) this).field_c = stackIn_4_1 != 0;
          return (bf) this;
        }
    }

    final bf b(int param0, int param1) {
        int var3 = 105 % ((param1 - -18) / 45);
        ((bf) this).field_l = param0;
        return (bf) this;
    }

    final static boolean c(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_15_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_12_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (te.field_N.field_m < param1) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        if (lf.field_d == null) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        try {
                            if (param0 >= 35) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            boolean discarded$3 = bf.c(-65, -12);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var2_int = lf.field_d.b(-30119);
                            if (-1 <= (var2_int ^ -1)) {
                                statePc = 16;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (param1 + -te.field_N.field_m < var2_int) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2_int = param1 - te.field_N.field_m;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            lf.field_d.a((byte) 59, te.field_N.field_m, var2_int, te.field_N.field_l);
                            md.field_y = je.a(1);
                            te.field_N.field_m = te.field_N.field_m + var2_int;
                            if (te.field_N.field_m >= param1) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            te.field_N.field_m = 0;
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0 != 0;
                    }
                    case 16: {
                        try {
                            if (0 > var2_int) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (30000L >= dh.b(-1)) {
                                statePc = 21;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            je.a(false);
                            return false;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            je.a(false);
                            return false;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return false;
                    }
                    case 22: {
                        var2 = (IOException) (Object) caughtException;
                        je.a(false);
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

    final void a(bf param0, int param1, rc param2, int param3, int param4, ql param5) {
        L0: {
          if (((bf) this).field_c) {
            param0.a(90, param4, param1, param5, param2);
            param0.a(36);
            break L0;
          } else {
            break L0;
          }
        }
        if (null == ((bf) this).field_k) {
          if ((((bf) this).field_l ^ -1) == 2147483647) {
            if (-1 > ((bf) this).field_d) {
              if (param3 == ((bf) this).field_g) {
                if (((bf) this).field_n < -1) {
                  L1: {
                    if ((((bf) this).field_h ^ -1) != 2147483647) {
                      param0.field_h = ((bf) this).field_h;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (((bf) this).field_j != null) {
                    param0.field_j = ((bf) this).field_j;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L2: {
                    param0.field_n = ((bf) this).field_n;
                    if ((((bf) this).field_h ^ -1) != 2147483647) {
                      param0.field_h = ((bf) this).field_h;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (((bf) this).field_j != null) {
                    param0.field_j = ((bf) this).field_j;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                param0.field_g = ((bf) this).field_g;
                if (((bf) this).field_n < -1) {
                  L3: {
                    if ((((bf) this).field_h ^ -1) != 2147483647) {
                      param0.field_h = ((bf) this).field_h;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (((bf) this).field_j != null) {
                    param0.field_j = ((bf) this).field_j;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L4: {
                    param0.field_n = ((bf) this).field_n;
                    if ((((bf) this).field_h ^ -1) != 2147483647) {
                      param0.field_h = ((bf) this).field_h;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (((bf) this).field_j != null) {
                    param0.field_j = ((bf) this).field_j;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              param0.field_d = ((bf) this).field_d;
              if (param3 == ((bf) this).field_g) {
                if (((bf) this).field_n < -1) {
                  L5: {
                    if ((((bf) this).field_h ^ -1) != 2147483647) {
                      param0.field_h = ((bf) this).field_h;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (((bf) this).field_j != null) {
                    param0.field_j = ((bf) this).field_j;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L6: {
                    param0.field_n = ((bf) this).field_n;
                    if ((((bf) this).field_h ^ -1) != 2147483647) {
                      param0.field_h = ((bf) this).field_h;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (((bf) this).field_j == null) {
                      break L7;
                    } else {
                      param0.field_j = ((bf) this).field_j;
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                L8: {
                  param0.field_g = ((bf) this).field_g;
                  if (((bf) this).field_n < -1) {
                    break L8;
                  } else {
                    param0.field_n = ((bf) this).field_n;
                    break L8;
                  }
                }
                L9: {
                  if ((((bf) this).field_h ^ -1) != 2147483647) {
                    param0.field_h = ((bf) this).field_h;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (((bf) this).field_j == null) {
                    break L10;
                  } else {
                    param0.field_j = ((bf) this).field_j;
                    break L10;
                  }
                }
                return;
              }
            }
          } else {
            L11: {
              param0.field_l = ((bf) this).field_l;
              if (-1 > ((bf) this).field_d) {
                break L11;
              } else {
                param0.field_d = ((bf) this).field_d;
                break L11;
              }
            }
            L12: {
              if (param3 == ((bf) this).field_g) {
                break L12;
              } else {
                param0.field_g = ((bf) this).field_g;
                break L12;
              }
            }
            L13: {
              if (((bf) this).field_n < -1) {
                break L13;
              } else {
                param0.field_n = ((bf) this).field_n;
                break L13;
              }
            }
            L14: {
              if ((((bf) this).field_h ^ -1) != 2147483647) {
                param0.field_h = ((bf) this).field_h;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (((bf) this).field_j == null) {
                break L15;
              } else {
                param0.field_j = ((bf) this).field_j;
                break L15;
              }
            }
            return;
          }
        } else {
          param0.field_k = ((bf) this).field_k;
          if ((((bf) this).field_l ^ -1) != 2147483647) {
            param0.field_l = ((bf) this).field_l;
            if (-1 > ((bf) this).field_d) {
              L16: {
                if (param3 == ((bf) this).field_g) {
                  break L16;
                } else {
                  param0.field_g = ((bf) this).field_g;
                  break L16;
                }
              }
              L17: {
                if (((bf) this).field_n < -1) {
                  break L17;
                } else {
                  param0.field_n = ((bf) this).field_n;
                  break L17;
                }
              }
              L18: {
                if ((((bf) this).field_h ^ -1) != 2147483647) {
                  param0.field_h = ((bf) this).field_h;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (((bf) this).field_j == null) {
                  break L19;
                } else {
                  param0.field_j = ((bf) this).field_j;
                  break L19;
                }
              }
              return;
            } else {
              L20: {
                param0.field_d = ((bf) this).field_d;
                if (param3 == ((bf) this).field_g) {
                  break L20;
                } else {
                  param0.field_g = ((bf) this).field_g;
                  break L20;
                }
              }
              L21: {
                if (((bf) this).field_n < -1) {
                  break L21;
                } else {
                  param0.field_n = ((bf) this).field_n;
                  break L21;
                }
              }
              L22: {
                if ((((bf) this).field_h ^ -1) != 2147483647) {
                  param0.field_h = ((bf) this).field_h;
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                if (((bf) this).field_j == null) {
                  break L23;
                } else {
                  param0.field_j = ((bf) this).field_j;
                  break L23;
                }
              }
              return;
            }
          } else {
            L24: {
              if (-1 > ((bf) this).field_d) {
                break L24;
              } else {
                param0.field_d = ((bf) this).field_d;
                break L24;
              }
            }
            L25: {
              if (param3 == ((bf) this).field_g) {
                break L25;
              } else {
                param0.field_g = ((bf) this).field_g;
                break L25;
              }
            }
            L26: {
              if (((bf) this).field_n < -1) {
                break L26;
              } else {
                param0.field_n = ((bf) this).field_n;
                break L26;
              }
            }
            L27: {
              if ((((bf) this).field_h ^ -1) != 2147483647) {
                param0.field_h = ((bf) this).field_h;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (((bf) this).field_j == null) {
                break L28;
              } else {
                param0.field_j = ((bf) this).field_j;
                break L28;
              }
            }
            return;
          }
        }
    }

    final bf a(int param0, int param1) {
        ((bf) this).field_n = param0;
        if (param1 != 256) {
            ((bf) this).a(-114);
            return (bf) this;
        }
        return (bf) this;
    }

    final static int b(byte param0) {
        if (param0 > -34) {
            return -84;
        }
        return -pk.field_ab + dh.field_h;
    }

    final bf d(int param0, int param1) {
        ((bf) this).field_d = param1;
        if (param0 > -114) {
            Object var4 = null;
            ((bf) this).a((bf) null, 56);
            return (bf) this;
        }
        return (bf) this;
    }

    final void a(int param0, int param1, int param2, ql param3, rc param4) {
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        mg stackIn_28_0 = null;
        String stackIn_28_1 = null;
        mg stackIn_29_0 = null;
        String stackIn_29_1 = null;
        mg stackIn_30_0 = null;
        String stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        mg stackIn_31_0 = null;
        String stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        mg stackIn_32_0 = null;
        String stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        mg stackIn_33_0 = null;
        String stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        mg stackIn_34_0 = null;
        String stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_34_5 = 0;
        int stackIn_34_6 = 0;
        int stackIn_34_7 = 0;
        mg stackIn_35_0 = null;
        String stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_35_5 = 0;
        int stackIn_35_6 = 0;
        int stackIn_35_7 = 0;
        mg stackIn_36_0 = null;
        String stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_36_5 = 0;
        int stackIn_36_6 = 0;
        int stackIn_36_7 = 0;
        int stackIn_36_8 = 0;
        mg stackOut_27_0 = null;
        String stackOut_27_1 = null;
        mg stackOut_29_0 = null;
        String stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        mg stackOut_28_0 = null;
        String stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        mg stackOut_30_0 = null;
        String stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        mg stackOut_32_0 = null;
        String stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        mg stackOut_31_0 = null;
        String stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_31_5 = 0;
        mg stackOut_33_0 = null;
        String stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_33_5 = 0;
        int stackOut_33_6 = 0;
        int stackOut_33_7 = 0;
        mg stackOut_35_0 = null;
        String stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        int stackOut_35_5 = 0;
        int stackOut_35_6 = 0;
        int stackOut_35_7 = 0;
        int stackOut_35_8 = 0;
        mg stackOut_34_0 = null;
        String stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_34_5 = 0;
        int stackOut_34_6 = 0;
        int stackOut_34_7 = 0;
        int stackOut_34_8 = 0;
        L0: {
          uj.a(param4.field_t, param4.field_x, param2 + param4.field_m, ((bf) this).field_j, param1 - -param4.field_j, 2);
          if (null != ((bf) this).field_k) {
            L1: {
              var6_int = param2 + (param4.field_m + ((bf) this).field_l);
              if (1 != param3.field_g) {
                break L1;
              } else {
                var6_int = var6_int + (param4.field_t - ((bf) this).field_k.field_q) / 2;
                break L1;
              }
            }
            L2: {
              var7 = param1 - (-param4.field_j + -((bf) this).field_h);
              if (param3.field_b == 1) {
                var7 = var7 + (-((bf) this).field_k.field_r + param4.field_x) / 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (2 != param3.field_g) {
                break L3;
              } else {
                var6_int = var6_int + (param4.field_t - ((bf) this).field_k.field_q);
                break L3;
              }
            }
            L4: {
              if (2 != param3.field_b) {
                break L4;
              } else {
                var7 = var7 + (param4.field_x - ((bf) this).field_k.field_r);
                break L4;
              }
            }
            ((bf) this).field_k.d(var6_int, var7);
            break L0;
          } else {
            break L0;
          }
        }
        var6 = param3.b(param4, 0);
        if (var6 != null) {
          if (param3.field_l != null) {
            if (((bf) this).field_d >= 0) {
              L5: {
                stackOut_27_0 = param3.field_l;
                stackOut_27_1 = (String) var6;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (((bf) this).field_l == -2147483648) {
                  stackOut_29_0 = (mg) (Object) stackIn_29_0;
                  stackOut_29_1 = (String) (Object) stackIn_29_1;
                  stackOut_29_2 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L5;
                } else {
                  stackOut_28_0 = (mg) (Object) stackIn_28_0;
                  stackOut_28_1 = (String) (Object) stackIn_28_1;
                  stackOut_28_2 = ((bf) this).field_l;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L5;
                }
              }
              L6: {
                stackOut_30_0 = (mg) (Object) stackIn_30_0;
                stackOut_30_1 = (String) (Object) stackIn_30_1;
                stackOut_30_2 = stackIn_30_2 + (param3.field_a + param2 + param4.field_m);
                stackOut_30_3 = param3.field_d;
                stackOut_30_4 = param4.field_j + param1;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_32_2 = stackOut_30_2;
                stackIn_32_3 = stackOut_30_3;
                stackIn_32_4 = stackOut_30_4;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                stackIn_31_2 = stackOut_30_2;
                stackIn_31_3 = stackOut_30_3;
                stackIn_31_4 = stackOut_30_4;
                if (-2147483648 != ((bf) this).field_h) {
                  stackOut_32_0 = (mg) (Object) stackIn_32_0;
                  stackOut_32_1 = (String) (Object) stackIn_32_1;
                  stackOut_32_2 = stackIn_32_2;
                  stackOut_32_3 = stackIn_32_3;
                  stackOut_32_4 = stackIn_32_4;
                  stackOut_32_5 = ((bf) this).field_h;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  stackIn_33_4 = stackOut_32_4;
                  stackIn_33_5 = stackOut_32_5;
                  break L6;
                } else {
                  stackOut_31_0 = (mg) (Object) stackIn_31_0;
                  stackOut_31_1 = (String) (Object) stackIn_31_1;
                  stackOut_31_2 = stackIn_31_2;
                  stackOut_31_3 = stackIn_31_3;
                  stackOut_31_4 = stackIn_31_4;
                  stackOut_31_5 = 0;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  stackIn_33_3 = stackOut_31_3;
                  stackIn_33_4 = stackOut_31_4;
                  stackIn_33_5 = stackOut_31_5;
                  break L6;
                }
              }
              L7: {
                stackOut_33_0 = (mg) (Object) stackIn_33_0;
                stackOut_33_1 = (String) (Object) stackIn_33_1;
                stackOut_33_2 = stackIn_33_2;
                stackOut_33_3 = stackIn_33_3 + (stackIn_33_4 + stackIn_33_5);
                stackOut_33_4 = -param3.field_n + (param4.field_t + -param3.field_a);
                stackOut_33_5 = -param3.field_j + (-param3.field_d + param4.field_x);
                stackOut_33_6 = ((bf) this).field_d;
                stackOut_33_7 = ((bf) this).field_n;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_35_2 = stackOut_33_2;
                stackIn_35_3 = stackOut_33_3;
                stackIn_35_4 = stackOut_33_4;
                stackIn_35_5 = stackOut_33_5;
                stackIn_35_6 = stackOut_33_6;
                stackIn_35_7 = stackOut_33_7;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                stackIn_34_2 = stackOut_33_2;
                stackIn_34_3 = stackOut_33_3;
                stackIn_34_4 = stackOut_33_4;
                stackIn_34_5 = stackOut_33_5;
                stackIn_34_6 = stackOut_33_6;
                stackIn_34_7 = stackOut_33_7;
                if ((((bf) this).field_g ^ -1) != 2147483647) {
                  stackOut_35_0 = (mg) (Object) stackIn_35_0;
                  stackOut_35_1 = (String) (Object) stackIn_35_1;
                  stackOut_35_2 = stackIn_35_2;
                  stackOut_35_3 = stackIn_35_3;
                  stackOut_35_4 = stackIn_35_4;
                  stackOut_35_5 = stackIn_35_5;
                  stackOut_35_6 = stackIn_35_6;
                  stackOut_35_7 = stackIn_35_7;
                  stackOut_35_8 = ((bf) this).field_g;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  stackIn_36_3 = stackOut_35_3;
                  stackIn_36_4 = stackOut_35_4;
                  stackIn_36_5 = stackOut_35_5;
                  stackIn_36_6 = stackOut_35_6;
                  stackIn_36_7 = stackOut_35_7;
                  stackIn_36_8 = stackOut_35_8;
                  break L7;
                } else {
                  stackOut_34_0 = (mg) (Object) stackIn_34_0;
                  stackOut_34_1 = (String) (Object) stackIn_34_1;
                  stackOut_34_2 = stackIn_34_2;
                  stackOut_34_3 = stackIn_34_3;
                  stackOut_34_4 = stackIn_34_4;
                  stackOut_34_5 = stackIn_34_5;
                  stackOut_34_6 = stackIn_34_6;
                  stackOut_34_7 = stackIn_34_7;
                  stackOut_34_8 = 256;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  stackIn_36_3 = stackOut_34_3;
                  stackIn_36_4 = stackOut_34_4;
                  stackIn_36_5 = stackOut_34_5;
                  stackIn_36_6 = stackOut_34_6;
                  stackIn_36_7 = stackOut_34_7;
                  stackIn_36_8 = stackOut_34_8;
                  break L7;
                }
              }
              int discarded$5 = ((mg) (Object) stackIn_36_0).a(stackIn_36_1, stackIn_36_2, stackIn_36_3, stackIn_36_4, stackIn_36_5, stackIn_36_6, stackIn_36_7, stackIn_36_8, param3.field_g, param3.field_b, param3.field_f);
              if (param0 <= 45) {
                bf discarded$6 = ((bf) this).a(-35, 3);
                return;
              } else {
                return;
              }
            } else {
              if (param0 <= 45) {
                bf discarded$7 = ((bf) this).a(-35, 3);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 <= 45) {
              bf discarded$8 = ((bf) this).a(-35, 3);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 <= 45) {
            bf discarded$9 = ((bf) this).a(-35, 3);
            return;
          } else {
            return;
          }
        }
    }

    final bf a(o[] param0, byte param1) {
        ((bf) this).field_j = param0;
        if (param1 != 119) {
            field_i = null;
            return (bf) this;
        }
        return (bf) this;
    }

    final bf a(int param0, byte param1) {
        if (param1 < 59) {
            return null;
        }
        ((bf) this).field_h = param0;
        return (bf) this;
    }

    final void a(int param0) {
        ((bf) this).field_l = 0;
        ((bf) this).field_h = 0;
        if (param0 != 36) {
          field_b = null;
          ((bf) this).field_d = 0;
          ((bf) this).field_g = 256;
          ((bf) this).field_k = null;
          ((bf) this).field_n = -1;
          ((bf) this).field_j = null;
          return;
        } else {
          ((bf) this).field_d = 0;
          ((bf) this).field_g = 256;
          ((bf) this).field_k = null;
          ((bf) this).field_n = -1;
          ((bf) this).field_j = null;
          return;
        }
    }

    bf() {
        ((bf) this).field_l = -2147483648;
        ((bf) this).field_k = null;
        ((bf) this).field_d = -2;
        ((bf) this).field_h = -2147483648;
        ((bf) this).field_j = null;
        ((bf) this).field_n = -2;
        ((bf) this).field_g = -2147483648;
        ((bf) this).field_c = false;
    }

    final void a(bf param0, int param1) {
        Object var4 = null;
        param0.field_k = ((bf) this).field_k;
        param0.field_j = ((bf) this).field_j;
        param0.field_h = ((bf) this).field_h;
        param0.field_d = ((bf) this).field_d;
        if (param1 != 2) {
          var4 = null;
          ((bf) this).a(-90, 43, 73, (ql) null, (rc) null);
          param0.field_l = ((bf) this).field_l;
          param0.field_g = ((bf) this).field_g;
          param0.field_n = ((bf) this).field_n;
          param0.field_c = ((bf) this).field_c;
          return;
        } else {
          param0.field_l = ((bf) this).field_l;
          param0.field_g = ((bf) this).field_g;
          param0.field_n = ((bf) this).field_n;
          param0.field_c = ((bf) this).field_c;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_b = new sh[36];
        field_m = "You have 1 unread message!";
    }
}
