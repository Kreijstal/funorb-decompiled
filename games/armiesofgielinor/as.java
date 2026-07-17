/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends oj {
    private int field_A;
    static je field_E;
    private boolean field_z;
    private boolean field_C;
    static boolean field_B;
    static String field_y;

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
              if (param1 < -84) {
                break L1;
              } else {
                var5 = null;
                boolean discarded$2 = ((as) this).a((at) null, (byte) -44, (ic) null);
                break L1;
              }
            }
            stackOut_2_0 = ((as) this).a((byte) -39, param2, param0, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("as.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        ta.field_N = 0;
        kd.field_R = null;
        jj.field_g = null;
        var2 = gm.field_i;
        gm.field_i = er.field_a;
        ai.field_T.field_q = ai.field_T.field_q + 1;
        if (param1 == 101) {
          if (param0 != 51) {
            if (param0 == 50) {
              ai.field_T.field_p = 5;
              er.field_a = var2;
              if (2 > ai.field_T.field_q) {
                L0: {
                  if (2 > ai.field_T.field_q) {
                    break L0;
                  } else {
                    if (param0 != 50) {
                      break L0;
                    } else {
                      return 5;
                    }
                  }
                }
                if (ai.field_T.field_q < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (51 == param0) {
                  return 2;
                } else {
                  L1: {
                    if (2 > ai.field_T.field_q) {
                      break L1;
                    } else {
                      if (param0 != 50) {
                        break L1;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (ai.field_T.field_q < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              ai.field_T.field_p = 1;
              er.field_a = var2;
              if (2 > ai.field_T.field_q) {
                L2: {
                  if (2 > ai.field_T.field_q) {
                    break L2;
                  } else {
                    if (param0 != 50) {
                      break L2;
                    } else {
                      return 5;
                    }
                  }
                }
                if (ai.field_T.field_q < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (51 == param0) {
                  return 2;
                } else {
                  L3: {
                    if (2 > ai.field_T.field_q) {
                      break L3;
                    } else {
                      if (param0 != 50) {
                        break L3;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (ai.field_T.field_q < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            ai.field_T.field_p = 2;
            er.field_a = var2;
            if (2 > ai.field_T.field_q) {
              L4: {
                if (2 > ai.field_T.field_q) {
                  break L4;
                } else {
                  if (param0 != 50) {
                    break L4;
                  } else {
                    return 5;
                  }
                }
              }
              if (ai.field_T.field_q < 4) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (51 == param0) {
                return 2;
              } else {
                if (2 <= ai.field_T.field_q) {
                  if (param0 == 50) {
                    return 5;
                  } else {
                    if (ai.field_T.field_q < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (ai.field_T.field_q < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        } else {
          int discarded$1 = as.a(-88, (byte) -45);
          if (param0 != 51) {
            if (param0 == 50) {
              ai.field_T.field_p = 5;
              er.field_a = var2;
              if (2 <= ai.field_T.field_q) {
                if (51 == param0) {
                  return 2;
                } else {
                  if (2 <= ai.field_T.field_q) {
                    if (param0 != 50) {
                      if (ai.field_T.field_q < 4) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (ai.field_T.field_q < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                L5: {
                  if (2 > ai.field_T.field_q) {
                    break L5;
                  } else {
                    if (param0 != 50) {
                      break L5;
                    } else {
                      return 5;
                    }
                  }
                }
                if (ai.field_T.field_q < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            } else {
              ai.field_T.field_p = 1;
              er.field_a = var2;
              if (2 <= ai.field_T.field_q) {
                if (51 == param0) {
                  return 2;
                } else {
                  if (2 <= ai.field_T.field_q) {
                    if (param0 != 50) {
                      if (ai.field_T.field_q < 4) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return 5;
                    }
                  } else {
                    if (ai.field_T.field_q < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                L6: {
                  if (2 > ai.field_T.field_q) {
                    break L6;
                  } else {
                    if (param0 != 50) {
                      break L6;
                    } else {
                      return 5;
                    }
                  }
                }
                if (ai.field_T.field_q < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            ai.field_T.field_p = 2;
            er.field_a = var2;
            if (2 <= ai.field_T.field_q) {
              if (51 == param0) {
                return 2;
              } else {
                if (2 <= ai.field_T.field_q) {
                  if (param0 != 50) {
                    if (ai.field_T.field_q < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return 5;
                  }
                } else {
                  if (ai.field_T.field_q < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              L7: {
                if (2 > ai.field_T.field_q) {
                  break L7;
                } else {
                  if (param0 != 50) {
                    break L7;
                  } else {
                    return 5;
                  }
                }
              }
              if (ai.field_T.field_q < 4) {
                return -1;
              } else {
                return 1;
              }
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              ev.field_a = ev.field_a + 1;
              if (me.field_e != -1) {
                break L1;
              } else {
                if (of.field_Ib != -1) {
                  break L1;
                } else {
                  of.field_Ib = ko.field_b;
                  me.field_e = sm.field_d;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 == null) {
                  if (ts.field_a == null) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (param1.equals((Object) (Object) ts.field_a)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!ei.field_b) {
                  if (bb.field_c <= ev.field_a) {
                    if (bb.field_c - -ps.field_E > ev.field_a) {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  ev.field_a = 0;
                  break L5;
                } else {
                  if (ei.field_b) {
                    ev.field_a = bb.field_c;
                    break L5;
                  } else {
                    if (var2_int != 0) {
                      ev.field_a = bb.field_c;
                      break L5;
                    } else {
                      ev.field_a = 0;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                cc.field_b = of.field_Ib;
                if (param1 != null) {
                  ei.field_b = false;
                  break L6;
                } else {
                  if (var2_int == 0) {
                    break L6;
                  } else {
                    ei.field_b = true;
                    break L6;
                  }
                }
              }
              lq.field_e = me.field_e;
              break L2;
            }
            L7: {
              if (ei.field_b) {
                break L7;
              } else {
                if (ev.field_a >= bb.field_c) {
                  break L7;
                } else {
                  if (!lk.field_f) {
                    break L7;
                  } else {
                    cc.field_b = of.field_Ib;
                    lq.field_e = me.field_e;
                    ev.field_a = 0;
                    break L7;
                  }
                }
              }
            }
            L8: {
              ts.field_a = param1;
              me.field_e = param0;
              of.field_Ib = -1;
              if (!ei.field_b) {
                break L8;
              } else {
                if (ce.field_J != ev.field_a) {
                  break L8;
                } else {
                  ei.field_b = false;
                  ev.field_a = 0;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var2;
            stackOut_38_1 = new StringBuilder().append("as.D(").append(param0).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
        }
    }

    as(jd param0, int param1, boolean param2) {
        try {
            ((as) this).field_z = param2 ? true : false;
            ((as) this).field_C = false;
            ((as) this).field_A = param1;
            ((as) this).field_m = 23;
            ((as) this).field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "as.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        if (param1) {
          System.out.println("Death event debug");
          System.out.println("Unit at " + ((as) this).field_w.field_J + "," + ((as) this).field_w.field_w);
          var3 = "EventSwitch: pos: (" + ((as) this).field_w.field_J + "," + ((as) this).field_w.field_w + ")";
          var4 = 1 / ((53 - param0) / 51);
          return var3;
        } else {
          var3 = "EventSwitch: pos: (" + ((as) this).field_w.field_J + "," + ((as) this).field_w.field_w + ")";
          var4 = 1 / ((53 - param0) / 51);
          return var3;
        }
    }

    public static void g() {
        field_E = null;
        field_y = null;
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!((as) this).field_C) {
              L1: {
                ((as) this).field_C = true;
                ((as) this).field_w = ((as) this).field_w.b(((as) this).field_A, -1);
                if (null == ((as) this).field_w) {
                  break L1;
                } else {
                  if (!((as) this).field_w.e((byte) 123)) {
                    break L1;
                  } else {
                    L2: {
                      if (param0.field_sb != ((as) this).field_w.field_O) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        break L2;
                      } else {
                        stackOut_5_0 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        break L2;
                      }
                    }
                    if (stackIn_7_0 != 0 & ((as) this).field_z) {
                      param0.field_l.a(param1 + 27411, (tc) (Object) new qj(((as) this).field_w.field_J, ((as) this).field_w.field_w));
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if (param1 == -26661) {
                break L0;
              } else {
                var4 = null;
                ((as) this).a((ha) null, 25);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("as.G(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Damage taken";
    }
}
