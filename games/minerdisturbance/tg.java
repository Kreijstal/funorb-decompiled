/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static int field_f;
    private int field_h;
    private pi field_e;
    private pi field_c;
    static int field_g;
    static int field_i;
    static int field_d;
    private int field_a;
    private pi[] field_b;

    final pi a(int param0) {
        ((tg) this).field_h = 0;
        if (param0 != -16545) {
            pi discarded$0 = ((tg) this).a(77);
            return ((tg) this).a(true);
        }
        return ((tg) this).a(true);
    }

    final pi a(long param0, int param1) {
        pi var4 = null;
        pi var5 = null;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        var4 = ((tg) this).field_b[(int)(param0 & (long)(((tg) this).field_a - 1))];
        ((tg) this).field_c = var4.field_f;
        L0: while (true) {
          if (((tg) this).field_c == var4) {
            ((tg) this).field_c = null;
            if (param1 == -27109) {
              return null;
            } else {
              ((tg) this).field_e = null;
              return null;
            }
          } else {
            if (((tg) this).field_c.field_d != param0) {
              ((tg) this).field_c = ((tg) this).field_c.field_f;
              continue L0;
            } else {
              var5 = ((tg) this).field_c;
              ((tg) this).field_c = ((tg) this).field_c.field_f;
              return var5;
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              pe.field_pb = pe.field_pb + 1;
              if (h.field_b != -1) {
                break L1;
              } else {
                if (vd.field_y == -1) {
                  h.field_b = nk.field_w;
                  vd.field_y = gb.field_e;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 != null) {
                  if (!param1.equals((Object) (Object) fa.field_c)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (null != fa.field_c) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!il.field_n) {
                  if (pe.field_pb >= ch.field_f) {
                    if (od.field_o + ch.field_f > pe.field_pb) {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_18_0 = stackOut_15_0;
                      break L4;
                    }
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_18_0 = stackOut_13_0;
                    break L4;
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_18_0 = stackOut_11_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_18_0;
                if (param1 == null) {
                  pe.field_pb = 0;
                  break L5;
                } else {
                  if (il.field_n) {
                    pe.field_pb = ch.field_f;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      pe.field_pb = 0;
                      break L5;
                    } else {
                      pe.field_pb = ch.field_f;
                      break L5;
                    }
                  }
                }
              }
              lj.field_q = vd.field_y;
              ng.field_l = h.field_b;
              if (param1 != null) {
                il.field_n = false;
                break L2;
              } else {
                if (var2_int == 0) {
                  break L2;
                } else {
                  il.field_n = true;
                  break L2;
                }
              }
            }
            L6: {
              if (il.field_n) {
                break L6;
              } else {
                if (ch.field_f <= pe.field_pb) {
                  break L6;
                } else {
                  if (!k.field_i) {
                    break L6;
                  } else {
                    lj.field_q = vd.field_y;
                    pe.field_pb = 0;
                    ng.field_l = h.field_b;
                    break L6;
                  }
                }
              }
            }
            L7: {
              fa.field_c = param1;
              vd.field_y = -1;
              h.field_b = -1;
              if (!il.field_n) {
                break L7;
              } else {
                if (oh.field_E == pe.field_pb) {
                  il.field_n = false;
                  pe.field_pb = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("tg.G(").append(-95).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L8;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L8;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = MinerDisturbance.field_ab;
        tl.field_m = 0;
        mb.field_c = null;
        if (param1 < -44) {
          em.field_B = null;
          var2 = kb.field_a;
          kb.field_a = sc.field_c;
          sc.field_c = var2;
          if (param0 == 51) {
            aj.field_c.field_j = 2;
            aj.field_c.field_o = aj.field_c.field_o + 1;
            if (2 > aj.field_c.field_o) {
              if (aj.field_c.field_o < 2) {
                if (-5 > aj.field_c.field_o) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param0) {
                  return 5;
                } else {
                  if (-5 < aj.field_c.field_o) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (51 == param0) {
                return 2;
              } else {
                if (aj.field_c.field_o < 2) {
                  if (-5 > aj.field_c.field_o) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (50 == param0) {
                    return 5;
                  } else {
                    if (-5 < aj.field_c.field_o) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            }
          } else {
            if (param0 == 50) {
              aj.field_c.field_j = 5;
              aj.field_c.field_o = aj.field_c.field_o + 1;
              if (2 > aj.field_c.field_o) {
                if (aj.field_c.field_o < 2) {
                  if (-5 > aj.field_c.field_o) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (50 == param0) {
                    return 5;
                  } else {
                    if (-5 < aj.field_c.field_o) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                if (51 != param0) {
                  if (aj.field_c.field_o < 2) {
                    if (-5 <= aj.field_c.field_o) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    if (50 != param0) {
                      if (-5 >= aj.field_c.field_o) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return 5;
                    }
                  }
                } else {
                  return 2;
                }
              }
            } else {
              aj.field_c.field_j = 1;
              aj.field_c.field_o = aj.field_c.field_o + 1;
              if (2 > aj.field_c.field_o) {
                if (aj.field_c.field_o < 2) {
                  if (aj.field_c.field_o >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (50 != param0) {
                    if (-5 <= aj.field_c.field_o) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                if (51 != param0) {
                  L0: {
                    if (aj.field_c.field_o < 2) {
                      break L0;
                    } else {
                      if (50 == param0) {
                        return 5;
                      } else {
                        break L0;
                      }
                    }
                  }
                  if (-5 >= aj.field_c.field_o) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            }
          }
        } else {
          L1: {
            field_f = 31;
            em.field_B = null;
            var2 = kb.field_a;
            kb.field_a = sc.field_c;
            sc.field_c = var2;
            if (param0 == 51) {
              aj.field_c.field_j = 2;
              break L1;
            } else {
              if (param0 == 50) {
                aj.field_c.field_j = 5;
                break L1;
              } else {
                aj.field_c.field_j = 1;
                break L1;
              }
            }
          }
          aj.field_c.field_o = aj.field_c.field_o + 1;
          if (2 <= aj.field_c.field_o) {
            if (51 == param0) {
              return 2;
            } else {
              if (aj.field_c.field_o >= 2) {
                if (50 == param0) {
                  return 5;
                } else {
                  if (-5 <= aj.field_c.field_o) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              } else {
                if (-5 >= aj.field_c.field_o) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            L2: {
              if (aj.field_c.field_o < 2) {
                break L2;
              } else {
                if (50 == param0) {
                  return 5;
                } else {
                  break L2;
                }
              }
            }
            if (aj.field_c.field_o >= 4) {
              return 1;
            } else {
              return -1;
            }
          }
        }
    }

    tg(int param0) {
        int var2 = 0;
        pi var3 = null;
        ((tg) this).field_h = 0;
        ((tg) this).field_b = new pi[param0];
        ((tg) this).field_a = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            pi dupTemp$2 = new pi();
            var3 = dupTemp$2;
            ((tg) this).field_b[var2] = dupTemp$2;
            var3.field_f = var3;
            var3.field_c = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final pi a(boolean param0) {
        int var3 = 0;
        Object var4 = null;
        pi var5 = null;
        pi var6 = null;
        pi var18 = null;
        pi var19 = null;
        pi var23 = null;
        pi var32 = null;
        var3 = MinerDisturbance.field_ab;
        if (((tg) this).field_h > 0) {
          if (((tg) this).field_b[-1 + ((tg) this).field_h] == ((tg) this).field_e) {
            if (!param0) {
              var4 = null;
              ((tg) this).a(-99, -121L, (pi) null);
              L0: while (true) {
                if (((tg) this).field_a > ((tg) this).field_h) {
                  int fieldTemp$4 = ((tg) this).field_h;
                  ((tg) this).field_h = ((tg) this).field_h + 1;
                  var5 = ((tg) this).field_b[fieldTemp$4].field_f;
                  var23 = var5;
                  if (var5 == ((tg) this).field_b[((tg) this).field_h - 1]) {
                    continue L0;
                  } else {
                    ((tg) this).field_e = var23.field_f;
                    return var23;
                  }
                } else {
                  return null;
                }
              }
            } else {
              L1: while (true) {
                if (((tg) this).field_a > ((tg) this).field_h) {
                  int fieldTemp$5 = ((tg) this).field_h;
                  ((tg) this).field_h = ((tg) this).field_h + 1;
                  var5 = ((tg) this).field_b[fieldTemp$5].field_f;
                  var19 = var5;
                  if (var5 == ((tg) this).field_b[((tg) this).field_h - 1]) {
                    continue L1;
                  } else {
                    ((tg) this).field_e = var19.field_f;
                    return var19;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            var32 = ((tg) this).field_e;
            ((tg) this).field_e = var32.field_f;
            return var32;
          }
        } else {
          if (param0) {
            L2: while (true) {
              if (((tg) this).field_a > ((tg) this).field_h) {
                int fieldTemp$6 = ((tg) this).field_h;
                ((tg) this).field_h = ((tg) this).field_h + 1;
                var5 = ((tg) this).field_b[fieldTemp$6].field_f;
                var18 = var5;
                if (var5 == ((tg) this).field_b[((tg) this).field_h - 1]) {
                  continue L2;
                } else {
                  ((tg) this).field_e = var18.field_f;
                  return var18;
                }
              } else {
                return null;
              }
            }
          } else {
            var4 = null;
            ((tg) this).a(-99, -121L, (pi) null);
            L3: while (true) {
              if (((tg) this).field_a > ((tg) this).field_h) {
                int fieldTemp$7 = ((tg) this).field_h;
                ((tg) this).field_h = ((tg) this).field_h + 1;
                var5 = ((tg) this).field_b[fieldTemp$7].field_f;
                var6 = var5;
                if (var5 == ((tg) this).field_b[((tg) this).field_h - 1]) {
                  continue L3;
                } else {
                  ((tg) this).field_e = var6.field_f;
                  return var6;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final void a(int param0, long param1, pi param2) {
        pi var5 = null;
        try {
            if (!(param2.field_c == null)) {
                param2.b(34);
            }
            var5 = ((tg) this).field_b[(int)(param1 & (long)(((tg) this).field_a - 1))];
            param2.field_c = var5.field_c;
            param2.field_f = var5;
            param2.field_c.field_f = param2;
            if (param0 != 0) {
                pi discarded$0 = ((tg) this).a(true);
            }
            param2.field_f.field_c = param2;
            param2.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "tg.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                    param1.getAppletContext().showDocument(nn.a(118, param1, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("tg.B(").append(-114).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
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
              throw lj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        bc.a(50, -20451);
    }
}
