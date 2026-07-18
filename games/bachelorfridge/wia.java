/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wia {
    static boolean field_e;
    static String field_c;
    boolean field_d;
    static sna field_f;
    int field_j;
    int field_n;
    boolean field_m;
    boolean field_i;
    boolean field_g;
    int field_k;
    aga field_l;
    static vr field_b;
    int field_a;
    int field_h;

    final boolean b(byte param0) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -113) {
          L0: {
            var3 = null;
            boolean discarded$6 = ((wia) this).a(true, (op) null);
            if (((wia) this).field_h <= 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((wia) this).field_h <= 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int a(int param0) {
        if (param0 == -36) {
          if (6 != ((wia) this).field_n) {
            if (7 != ((wia) this).field_n) {
              if (8 != ((wia) this).field_n) {
                if (-10 != ((wia) this).field_n) {
                  if (-11 != ((wia) this).field_n) {
                    if (((wia) this).field_n != 11) {
                      if (((wia) this).field_n != -13) {
                        if (((wia) this).field_n != 13) {
                          if (-24 != ((wia) this).field_n) {
                            if (((wia) this).field_n != 24) {
                              if (((wia) this).field_n != 25) {
                                if (((wia) this).field_n != 26) {
                                  if (((wia) this).field_n == 29) {
                                    return 12;
                                  } else {
                                    return -1;
                                  }
                                } else {
                                  return 27;
                                }
                              } else {
                                return 26;
                              }
                            } else {
                              return 25;
                            }
                          } else {
                            return 24;
                          }
                        } else {
                          return 7;
                        }
                      } else {
                        return 19;
                      }
                    } else {
                      return 6;
                    }
                  } else {
                    return 18;
                  }
                } else {
                  return 5;
                }
              } else {
                return 17;
              }
            } else {
              return 4;
            }
          } else {
            return 16;
          }
        } else {
          return -8;
        }
    }

    final boolean a(int param0, op param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (param2 != ((wia) this).field_n) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (this.a(param1, (byte) 77)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (((wia) this).field_m) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0 != 0;
                } else {
                  L1: {
                    if (param0 == -27864) {
                      break L1;
                    } else {
                      field_f = null;
                      break L1;
                    }
                  }
                  if (((wia) this).field_l != null) {
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("wia.C(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final static void a(boolean param0, byte param1) {
        L0: {
          if (lb.g((byte) -52)) {
            param0 = false;
            break L0;
          } else {
            break L0;
          }
        }
        fa.a(param0, param1 + 26412);
        if (param1 != 31) {
          L1: {
            wia.a(true, (byte) 28);
            if (ad.field_i) {
              dg.g(pf.field_n.field_a.field_kb, pf.field_n.field_a.field_rb, pf.field_n.field_a.field_sb, pf.field_n.field_a.field_p);
              pf.field_n.field_a.a(param0, 7802);
              break L1;
            } else {
              break L1;
            }
          }
          hl.a(0, param0);
          return;
        } else {
          L2: {
            if (ad.field_i) {
              dg.g(pf.field_n.field_a.field_kb, pf.field_n.field_a.field_rb, pf.field_n.field_a.field_sb, pf.field_n.field_a.field_p);
              pf.field_n.field_a.a(param0, 7802);
              break L2;
            } else {
              break L2;
            }
          }
          hl.a(0, param0);
          return;
        }
    }

    final int d(int param0) {
        int var2 = 0;
        L0: {
          var2 = ((wia) this).field_n * 77421;
          if (!((wia) this).field_i) {
            break L0;
          } else {
            var2 = var2 ^ 98381;
            break L0;
          }
        }
        L1: {
          if (null != ((wia) this).field_l) {
            var2 = var2 ^ 87 * (((wia) this).field_l.field_D * 71 - -((wia) this).field_l.field_u);
            var2 = var2 << 17 | var2 >>> 15;
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != 1446291025) {
          L2: {
            field_c = null;
            if (((wia) this).field_a == -1) {
              break L2;
            } else {
              var2 = var2 ^ 857521 * ((wia) this).field_a;
              var2 = var2 >>> 25 | var2 << 7;
              break L2;
            }
          }
          L3: {
            if (!((wia) this).field_m) {
              break L3;
            } else {
              var2 = var2 ^ 56748912;
              break L3;
            }
          }
          var2 = var2 ^ ((wia) this).field_j * 788454;
          return var2;
        } else {
          L4: {
            if (((wia) this).field_a == -1) {
              break L4;
            } else {
              var2 = var2 ^ 857521 * ((wia) this).field_a;
              var2 = var2 >>> 25 | var2 << 7;
              break L4;
            }
          }
          L5: {
            if (!((wia) this).field_m) {
              break L5;
            } else {
              var2 = var2 ^ 56748912;
              break L5;
            }
          }
          var2 = var2 ^ ((wia) this).field_j * 788454;
          return var2;
        }
    }

    private final boolean a(op param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (((wia) this).a(false, param0)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (((wia) this).field_n != 27) {
                if (((wia) this).field_n != 35) {
                  if (((wia) this).field_n == 37) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  } else {
                    if (((wia) this).field_n == 33) {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    } else {
                      L1: {
                        var3_int = 64 % ((param1 - -4) / 49);
                        if (!od.field_w[((wia) this).field_n].field_b) {
                          break L1;
                        } else {
                          if (!((wia) this).field_m) {
                            stackOut_21_0 = 1;
                            stackIn_22_0 = stackOut_21_0;
                            return stackIn_22_0 != 0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      if (38 == ((wia) this).field_n) {
                        stackOut_25_0 = 1;
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("wia.H(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L2;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param1 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final void a(int param0, int param1, rha param2, op param3, int param4) {
        RuntimeException var6 = null;
        Object var7 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              param2.a((Object) (Object) ("tile: " + od.field_w[((wia) this).field_n].field_a), 4819);
              param2.a(104, 2);
              param2.a((Object) (Object) ("x: " + param1 + " y: " + param4), 4819);
              if (null == ((wia) this).field_l) {
                break L1;
              } else {
                param2.a((Object) (Object) ("occupied: " + ((wia) this).field_l.b(52)), 4819);
                break L1;
              }
            }
            L2: {
              if (((wia) this).field_a == -1) {
                break L2;
              } else {
                param2.a((Object) (Object) ("object id: " + ((wia) this).field_a), 4819);
                break L2;
              }
            }
            L3: {
              if (((wia) this).field_m) {
                param2.a((Object) (Object) "powerup present", 4819);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.a(param3, (byte) -125)) {
                param2.a((Object) (Object) ("counter: " + ((wia) this).field_j), 4819);
                break L4;
              } else {
                break L4;
              }
            }
            param2.a(-116, -2);
            if (param0 <= -88) {
              break L0;
            } else {
              var7 = null;
              boolean discarded$1 = this.a((op) null, (byte) -107);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("wia.J(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param4 + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 788454) {
            wia.b(-90);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final boolean e(int param0) {
        if (param0 > -24) {
            return false;
        }
        return ju.c(23745, ((wia) this).field_n);
    }

    final boolean c(int param0) {
        Object var3 = null;
        int stackIn_16_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_14_0 = 0;
        if (param0 <= -81) {
          if (((wia) this).field_n != 6) {
            if (((wia) this).field_n != 7) {
              if (8 != ((wia) this).field_n) {
                if (9 != ((wia) this).field_n) {
                  if (10 != ((wia) this).field_n) {
                    if (((wia) this).field_n != 11) {
                      if (12 != ((wia) this).field_n) {
                        if (13 == ((wia) this).field_n) {
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        stackOut_34_0 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        return stackIn_36_0 != 0;
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
            return true;
          }
        } else {
          var3 = null;
          boolean discarded$1 = ((wia) this).a(false, (op) null);
          if (((wia) this).field_n != 6) {
            if (((wia) this).field_n != 7) {
              if (8 != ((wia) this).field_n) {
                if (9 != ((wia) this).field_n) {
                  if (10 != ((wia) this).field_n) {
                    if (((wia) this).field_n != 11) {
                      if (12 != ((wia) this).field_n) {
                        if (13 == ((wia) this).field_n) {
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        return stackIn_16_0 != 0;
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
            return true;
          }
        }
    }

    final boolean a(byte param0) {
        Object var3 = null;
        if (param0 == -63) {
          if (((wia) this).field_n == 0) {
            if (((wia) this).field_i) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = null;
          boolean discarded$3 = this.a((op) null, (byte) -3);
          if (((wia) this).field_n == 0) {
            if (((wia) this).field_i) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(boolean param0, op param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((wia) this).field_a = -64;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1.field_E != 2) {
                  break L3;
                } else {
                  if (!((wia) this).a((byte) -63)) {
                    break L3;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("wia.L(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    wia(int param0) {
        ((wia) this).field_n = param0;
        ((wia) this).field_a = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> has entered another game.";
        field_e = true;
    }
}
