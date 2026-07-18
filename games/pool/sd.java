/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends ch implements jb, tb {
    private fe field_P;
    static boolean field_T;
    static String field_N;
    static vh field_Q;
    private fq field_V;
    static String field_O;
    static String field_W;
    static di field_R;
    static String field_U;
    private mh field_S;

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (((sd) this).field_P != param3) {
                break L1;
              } else {
                nm.a((byte) 41);
                ((sd) this).field_V.k(17);
                break L1;
              }
            }
            if (param0) {
              break L0;
            } else {
              field_W = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("sd.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param4 + ')');
        }
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        rl.field_e = 0;
        dq.field_h = null;
        mq.field_c = null;
        var2 = na.field_a;
        na.field_a = wn.field_h;
        if (param1 == 51) {
          sq.field_c.field_a = 2;
          wn.field_h = var2;
          sq.field_c.field_e = sq.field_c.field_e + 1;
          if (sq.field_c.field_e < 2) {
            if (sq.field_c.field_e < 2) {
              if (!param0) {
                if (sq.field_c.field_e >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                int discarded$11 = sd.a(true, 78);
                if (sq.field_c.field_e >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              if (param1 == 50) {
                return 5;
              } else {
                if (!param0) {
                  if (sq.field_c.field_e >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  int discarded$12 = sd.a(true, 78);
                  if (sq.field_c.field_e >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            }
          } else {
            if (param1 == 51) {
              return 2;
            } else {
              if (sq.field_c.field_e >= 2) {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (param0) {
                    int discarded$13 = sd.a(true, 78);
                    if (sq.field_c.field_e >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (sq.field_c.field_e >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                if (!param0) {
                  if (sq.field_c.field_e >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  int discarded$14 = sd.a(true, 78);
                  if (sq.field_c.field_e >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            }
          }
        } else {
          if (param1 == 50) {
            sq.field_c.field_a = 5;
            wn.field_h = var2;
            sq.field_c.field_e = sq.field_c.field_e + 1;
            if (sq.field_c.field_e < 2) {
              if (sq.field_c.field_e < 2) {
                if (!param0) {
                  if (sq.field_c.field_e >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  int discarded$15 = sd.a(true, 78);
                  if (sq.field_c.field_e >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              } else {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (!param0) {
                    if (sq.field_c.field_e >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    int discarded$16 = sd.a(true, 78);
                    if (sq.field_c.field_e >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              }
            } else {
              if (param1 == 51) {
                return 2;
              } else {
                if (sq.field_c.field_e < 2) {
                  if (!param0) {
                    if (sq.field_c.field_e >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    int discarded$17 = sd.a(true, 78);
                    if (sq.field_c.field_e >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  if (param1 == 50) {
                    return 5;
                  } else {
                    if (!param0) {
                      if (sq.field_c.field_e >= 4) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      int discarded$18 = sd.a(true, 78);
                      if (sq.field_c.field_e >= 4) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  }
                }
              }
            }
          } else {
            sq.field_c.field_a = 1;
            wn.field_h = var2;
            sq.field_c.field_e = sq.field_c.field_e + 1;
            if (sq.field_c.field_e >= 2) {
              if (param1 == 51) {
                return 2;
              } else {
                if (sq.field_c.field_e >= 2) {
                  if (param1 == 50) {
                    return 5;
                  } else {
                    if (!param0) {
                      if (sq.field_c.field_e >= 4) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      int discarded$19 = sd.a(true, 78);
                      if (sq.field_c.field_e >= 4) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  }
                } else {
                  if (!param0) {
                    if (sq.field_c.field_e >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    int discarded$20 = sd.a(true, 78);
                    if (sq.field_c.field_e >= 4) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              }
            } else {
              L0: {
                if (sq.field_c.field_e < 2) {
                  break L0;
                } else {
                  if (param1 == 50) {
                    return 5;
                  } else {
                    break L0;
                  }
                }
              }
              if (!param0) {
                if (sq.field_c.field_e >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                int discarded$21 = sd.a(true, 78);
                if (sq.field_c.field_e >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          }
        }
    }

    private final String h(byte param0) {
        return "<u=2164A2><col=2164A2>";
    }

    public static void a(int param0) {
        field_W = null;
        field_O = null;
        field_N = null;
        int var1 = 0;
        field_Q = null;
        field_R = null;
        field_U = null;
    }

    sd(fq param0) {
        super(0, 0, 288, 0, (fp) null);
        RuntimeException var2 = null;
        int var3 = 0;
        am var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((sd) this).field_V = param0;
            ((sd) this).field_P = new fe(fg.field_c, (cc) null);
            ((sd) this).field_P.field_z = (fp) (Object) new ng();
            var7 = nr.a(new String[2], -1, hb.field_g);
            var3 = 20;
            var4 = new am(lc.field_O, 0, 0, 0, 0, 16777215, -1, 3, 0, lc.field_O.field_C, -1, 2147483647, true);
            ((sd) this).field_S = new mh(var7, (fp) (Object) var4);
            ((sd) this).field_S.field_p = "";
            ((sd) this).field_S.a((byte) 68, cn.field_b, 0);
            ((sd) this).field_S.a((byte) 66, cn.field_b, 1);
            ((sd) this).field_S.field_l = -40 + ((sd) this).field_l;
            ((sd) this).field_S.field_t = (cc) this;
            ((sd) this).field_S.b(26, var3, ((sd) this).field_l - 40, -119);
            var3 = var3 + (15 + ((sd) this).field_S.field_y);
            ((sd) this).a(true, (ei) (Object) ((sd) this).field_S);
            var5 = 4;
            var6 = 200;
            ((sd) this).field_P.a(var6, 300 + -var6 >> 1, 40, false, var3);
            ((sd) this).field_P.field_t = (cc) this;
            ((sd) this).a(true, (ei) (Object) ((sd) this).field_P);
            ((sd) this).a(300, 0, 55 + (var3 + var5), false, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("sd.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void a(int param0, mh param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            if (param2 == -12147) {
              break L0;
            } else {
              int discarded$2 = sd.a(true, -93);
              break L0;
            }
          }
          if (0 != param3) {
            if (1 == param3) {
              ci.a("privacy.ws", -127);
              return;
            } else {
              if (param3 == 2) {
                ci.a("conduct.ws", -127);
                return;
              } else {
                return;
              }
            }
          } else {
            ci.a("terms.ws", -128);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("sd.D(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String g(byte param0) {
        int var2 = 0;
        return "</col></u>";
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 != 98) {
                if (param1 != 99) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((sd) this).b(param3, 0);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                stackOut_5_0 = ((sd) this).a(param3, 3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("sd.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "<%0> has been removed.";
        field_O = "<%0> is <%2>!";
        field_W = "Orb points: ";
        field_N = "Offensive account name";
    }
}
