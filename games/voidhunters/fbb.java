/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fbb {
    private jjb field_e;
    static int[] field_f;
    private qg[] field_d;
    private int field_c;
    static int field_i;
    private int field_g;
    private int field_a;
    la field_b;
    private qfa field_h;
    static int[] field_j;

    final static boolean b(int param0, int param1) {
        if (param1 == 15923) {
          if (param0 > 3) {
            if (hab.field_g[param0].field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_j = null;
        if (param0) {
            boolean discarded$0 = fbb.b(-82, 83);
        }
    }

    final boolean a(int param0, int param1) {
        if (param0 != 8) {
          ((fbb) this).a(false, false, 71, -110, 65, -25);
          return ((fbb) this).field_d[param1].b(-90);
        } else {
          return ((fbb) this).field_d[param1].b(-90);
        }
    }

    final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        L0: {
          param0 = param0 & ((fbb) this).field_h.e();
          if (param0) {
            break L0;
          } else {
            if (param4 != 4) {
              if (8 != param4) {
                if (param4 == 9) {
                  L1: {
                    if (4 == param4) {
                      param5 = param2;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  param4 = 2;
                  break L0;
                } else {
                  L2: {
                    if (param4 == 0) {
                      break L2;
                    } else {
                      if (!param1) {
                        break L2;
                      } else {
                        param4 = param4 | -2147483648;
                        break L2;
                      }
                    }
                  }
                  if (param3 < -104) {
                    if (((fbb) this).field_g == param4) {
                      if (((fbb) this).field_g != 0) {
                        ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(true, param1);
                        if (param2 == ((fbb) this).field_a) {
                          if (((fbb) this).field_c != param5) {
                            ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                            ((fbb) this).field_c = param5;
                            ((fbb) this).field_a = param2;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                          ((fbb) this).field_c = param5;
                          ((fbb) this).field_a = param2;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L3: {
                        if (((fbb) this).field_g == 0) {
                          break L3;
                        } else {
                          ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(5890);
                          break L3;
                        }
                      }
                      L4: {
                        if (param4 != 0) {
                          ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                          ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                          ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((fbb) this).field_a = param2;
                      ((fbb) this).field_g = param4;
                      ((fbb) this).field_c = param5;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L5: {
                  if (4 == param4) {
                    param5 = param2;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  param4 = 2;
                  if (param4 == 0) {
                    break L6;
                  } else {
                    if (!param1) {
                      break L6;
                    } else {
                      param4 = param4 | -2147483648;
                      break L6;
                    }
                  }
                }
                if (param3 < -104) {
                  if (((fbb) this).field_g == param4) {
                    if (((fbb) this).field_g != 0) {
                      ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(true, param1);
                      if (param2 == ((fbb) this).field_a) {
                        if (((fbb) this).field_c != param5) {
                          ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                          ((fbb) this).field_c = param5;
                          ((fbb) this).field_a = param2;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                        ((fbb) this).field_c = param5;
                        ((fbb) this).field_a = param2;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((fbb) this).field_g != 0) {
                      L7: {
                        ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(5890);
                        if (param4 != 0) {
                          ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                          ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                          ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((fbb) this).field_a = param2;
                      ((fbb) this).field_g = param4;
                      ((fbb) this).field_c = param5;
                      return;
                    } else {
                      L8: {
                        if (param4 != 0) {
                          ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                          ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                          ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      ((fbb) this).field_a = param2;
                      ((fbb) this).field_g = param4;
                      ((fbb) this).field_c = param5;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              L9: {
                if (4 == param4) {
                  param5 = param2;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                param4 = 2;
                if (param4 == 0) {
                  break L10;
                } else {
                  if (!param1) {
                    break L10;
                  } else {
                    param4 = param4 | -2147483648;
                    break L10;
                  }
                }
              }
              if (param3 < -104) {
                if (((fbb) this).field_g == param4) {
                  if (((fbb) this).field_g != 0) {
                    ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(true, param1);
                    if (param2 == ((fbb) this).field_a) {
                      if (((fbb) this).field_c != param5) {
                        ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                        ((fbb) this).field_c = param5;
                        ((fbb) this).field_a = param2;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                      ((fbb) this).field_c = param5;
                      ((fbb) this).field_a = param2;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (((fbb) this).field_g != 0) {
                    L11: {
                      ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(5890);
                      if (param4 != 0) {
                        ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                        ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                        ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ((fbb) this).field_a = param2;
                    ((fbb) this).field_g = param4;
                    ((fbb) this).field_c = param5;
                    return;
                  } else {
                    L12: {
                      if (param4 != 0) {
                        ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                        ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                        ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    ((fbb) this).field_a = param2;
                    ((fbb) this).field_g = param4;
                    ((fbb) this).field_c = param5;
                    return;
                  }
                }
              } else {
                return;
              }
            }
          }
        }
        L13: {
          if (param4 == 0) {
            break L13;
          } else {
            if (!param1) {
              break L13;
            } else {
              param4 = param4 | -2147483648;
              break L13;
            }
          }
        }
        if (param3 < -104) {
          if (((fbb) this).field_g == param4) {
            if (((fbb) this).field_g != 0) {
              ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(true, param1);
              if (param2 == ((fbb) this).field_a) {
                if (((fbb) this).field_c == param5) {
                  return;
                } else {
                  ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                  ((fbb) this).field_c = param5;
                  ((fbb) this).field_a = param2;
                  return;
                }
              } else {
                ((fbb) this).field_d[((fbb) this).field_g & 2147483647].a(param2, -25139, param5);
                ((fbb) this).field_c = param5;
                ((fbb) this).field_a = param2;
                return;
              }
            } else {
              return;
            }
          } else {
            if (((fbb) this).field_g == 0) {
              L14: {
                if (param4 != 0) {
                  ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                  ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                  ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                  break L14;
                } else {
                  break L14;
                }
              }
              ((fbb) this).field_a = param2;
              ((fbb) this).field_g = param4;
              ((fbb) this).field_c = param5;
              return;
            } else {
              L15: {
                ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(5890);
                if (param4 != 0) {
                  ((fbb) this).field_d[param4 & 2147483647].a(param1, 76);
                  ((fbb) this).field_d[2147483647 & param4].a(true, param1);
                  ((fbb) this).field_d[2147483647 & param4].a(param2, -25139, param5);
                  break L15;
                } else {
                  break L15;
                }
              }
              ((fbb) this).field_a = param2;
              ((fbb) this).field_g = param4;
              ((fbb) this).field_c = param5;
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(pib param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (((fbb) this).field_g != 0) {
              var4_int = -72 % ((param1 - -71) / 53);
              ((fbb) this).field_d[2147483647 & ((fbb) this).field_g].a(param2, (byte) 125, param0);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("fbb.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0 != 0;
    }

    fbb(qfa param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        ((fbb) this).field_c = 0;
        ((fbb) this).field_a = 0;
        ((fbb) this).field_g = 0;
        try {
          L0: {
            L1: {
              ((fbb) this).field_h = param0;
              ((fbb) this).field_e = new jjb(param0);
              ((fbb) this).field_d = new qg[10];
              ((fbb) this).field_d[1] = (qg) (Object) new kv(param0);
              ((fbb) this).field_d[2] = (qg) (Object) new uga(param0, ((fbb) this).field_e);
              ((fbb) this).field_d[4] = (qg) (Object) new ssb(param0, ((fbb) this).field_e);
              ((fbb) this).field_d[5] = (qg) (Object) new iib(param0, ((fbb) this).field_e);
              ((fbb) this).field_d[6] = (qg) (Object) new ku(param0);
              ((fbb) this).field_d[7] = (qg) (Object) new uob(param0);
              la dupTemp$1 = new la(param0);
              ((fbb) this).field_b = dupTemp$1;
              ((fbb) this).field_d[3] = (qg) (Object) dupTemp$1;
              ((fbb) this).field_d[8] = (qg) (Object) new ti(param0, ((fbb) this).field_e);
              ((fbb) this).field_d[9] = (qg) (Object) new mw(param0, ((fbb) this).field_e);
              if (((fbb) this).field_d[8].b(-113)) {
                break L1;
              } else {
                ((fbb) this).field_d[8] = ((fbb) this).field_d[4];
                break L1;
              }
            }
            L2: {
              if (((fbb) this).field_d[9].b(-110)) {
                break L2;
              } else {
                ((fbb) this).field_d[9] = ((fbb) this).field_d[8];
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("fbb.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[109];
    }
}
