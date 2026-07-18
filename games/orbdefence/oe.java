/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends o {
    private int[][] field_l;
    private int[] field_k;
    private int[] field_o;
    static boolean field_p;
    static String field_q;
    private String[] field_n;
    static String field_m;

    final void a(byte param0, mg param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  var3_int = param1.b((byte) 90);
                  if (var3_int == 0) {
                    break L3;
                  } else {
                    this.a(param1, var3_int, -3);
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 67) {
                  break L2;
                } else {
                  qj discarded$3 = oe.a(-111, (String) null, -88);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("oe.F(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    private final void a(mg param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ba var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -3) {
                break L1;
              } else {
                qj discarded$1 = oe.a(-30, (String) null, -63);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1 == 1) {
                  break L3;
                } else {
                  L4: {
                    if (param1 != 2) {
                      break L4;
                    } else {
                      var4_int = param0.b((byte) 90);
                      ((oe) this).field_o = new int[var4_int];
                      var5 = 0;
                      L5: while (true) {
                        L6: {
                          if (~var5 <= ~var4_int) {
                            break L6;
                          } else {
                            ((oe) this).field_o[var5] = param0.j(param2 + 98203179);
                            var5++;
                            if (var9 != 0) {
                              break L2;
                            } else {
                              if (var9 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param1 == 3) {
                    var4_int = param0.b((byte) 90);
                    ((oe) this).field_k = new int[var4_int];
                    ((oe) this).field_l = new int[var4_int][];
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        if (var4_int <= var5) {
                          break L8;
                        } else {
                          var6 = param0.j(98203176);
                          var7 = wg.a(var6, -128);
                          if (var9 != 0) {
                            break L2;
                          } else {
                            L9: {
                              L10: {
                                if (null != var7) {
                                  ((oe) this).field_k[var5] = var6;
                                  ((oe) this).field_l[var5] = new int[var7.field_f];
                                  var8 = 0;
                                  L11: while (true) {
                                    if (~var8 <= ~var7.field_f) {
                                      break L10;
                                    } else {
                                      ((oe) this).field_l[var5][var8] = param0.j(98203176);
                                      var8++;
                                      if (var9 != 0) {
                                        break L9;
                                      } else {
                                        if (var9 == 0) {
                                          continue L11;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var5++;
                              break L9;
                            }
                            if (var9 == 0) {
                              continue L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (var9 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (param1 != 4) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((oe) this).field_n = g.a(87, '<', param0.g(2));
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("oe.C(");
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L12;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L12;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -12563) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            field_m = null;
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "oe.D(" + param0 + ')');
        }
    }

    private final String e(int param0) {
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_3_0 = null;
        Object stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        String stackOut_13_0 = null;
        String stackOut_2_0 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2 = new StringBuilder(80);
            if (null != ((oe) this).field_n) {
              StringBuilder discarded$6 = var2.append(((oe) this).field_n[0]);
              var3 = 1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~((oe) this).field_n.length >= ~var3) {
                      break L3;
                    } else {
                      StringBuilder discarded$7 = var2.append("...");
                      StringBuilder discarded$8 = var2.append(((oe) this).field_n[var3]);
                      var3++;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 < -47) {
                    break L2;
                  } else {
                    stackOut_11_0 = null;
                    stackIn_12_0 = stackOut_11_0;
                    return (String) (Object) stackIn_12_0;
                  }
                }
                stackOut_13_0 = var2.toString();
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2_ref, "oe.A(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    final static og a(boolean param0, byte param1) {
        RuntimeException var2 = null;
        se var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        oe var6_ref = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        Object stackIn_23_0 = null;
        int[] stackIn_40_0 = null;
        og stackIn_44_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        Object stackOut_39_0 = null;
        int[] stackOut_37_0 = null;
        og stackOut_43_0 = null;
        Object stackOut_22_0 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_ref = cd.field_t;
              var3 = var2_ref.b((byte) 90);
              if ((128 & var3) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              L3: {
                ja.field_e = stackIn_5_0 != 0;
                wb.field_d = var3 & 127;
                bh.field_c = var2_ref.b((byte) 90);
                tf.field_l = var2_ref.c((byte) -89);
                if (wb.field_d == 2) {
                  break L3;
                } else {
                  pc.field_X = 0;
                  gb.field_b = 0;
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              pc.field_X = var2_ref.j(98203176);
              gb.field_b = var2_ref.a((byte) -30);
              break L2;
            }
            L4: {
              if (var2_ref.b((byte) 90) != 1) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_12_0 = 1;
                stackIn_15_0 = stackOut_12_0;
                break L4;
              }
            }
            L5: {
              L6: {
                var4 = stackIn_15_0;
                l.field_f = var2_ref.g(2);
                if (var4 != 0) {
                  break L6;
                } else {
                  vk.field_v = l.field_f;
                  if (var7 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              vk.field_v = var2_ref.g(2);
              break L5;
            }
            if (param1 <= -52) {
              L7: {
                L8: {
                  if (wb.field_d == 1) {
                    break L8;
                  } else {
                    if (4 == wb.field_d) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                int discarded$2 = var2_ref.j(98203176);
                String discarded$3 = var2_ref.g(2);
                break L7;
              }
              L9: {
                L10: {
                  if (param0) {
                    break L10;
                  } else {
                    vj.field_a = hi.a(80, -111, (mg) (Object) var2_ref);
                    n.field_c = null;
                    if (var7 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var5 = var2_ref.j(98203176);
                try {
                  L11: {
                    L12: {
                      var6_ref = aa.field_d.b(-11244, var5);
                      vj.field_a = var6_ref.e(-50);
                      if (vk.field_v.equals((Object) (Object) gb.field_h)) {
                        stackOut_39_0 = null;
                        stackIn_40_0 = (int[]) (Object) stackOut_39_0;
                        break L12;
                      } else {
                        stackOut_37_0 = var6_ref.field_o;
                        stackIn_40_0 = stackOut_37_0;
                        break L12;
                      }
                    }
                    n.field_c = stackIn_40_0;
                    break L11;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L13: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    pe.a((byte) -13, (Throwable) (Object) var6, "CC1");
                    n.field_c = null;
                    vj.field_a = null;
                    break L13;
                  }
                }
                break L9;
              }
              stackOut_43_0 = new og(param0);
              stackIn_44_0 = stackOut_43_0;
              break L0;
            } else {
              stackOut_22_0 = null;
              stackIn_23_0 = stackOut_22_0;
              return (og) (Object) stackIn_23_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "oe.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_44_0;
    }

    oe() {
    }

    final static qj a(int param0, String param1, int param2) {
        qj var3 = null;
        RuntimeException var3_ref = null;
        qj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        qj stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -3) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            var3 = new qj(false);
            var3.field_e = param1;
            var3.field_b = param0;
            stackOut_3_0 = (qj) var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("oe.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final void b(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((oe) this).field_o == null) {
                  break L2;
                } else {
                  var2_int = 0;
                  L3: while (true) {
                    if (var2_int >= ((oe) this).field_o.length) {
                      break L2;
                    } else {
                      ((oe) this).field_o[var2_int] = ge.a(((oe) this).field_o[var2_int], 32768);
                      var2_int++;
                      if (var3 != 0) {
                        break L1;
                      } else {
                        if (var3 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              var2_int = 73 / ((64 - param0) / 47);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dd.a((Throwable) (Object) runtimeException, "oe.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Orbsome";
        field_m = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_p = false;
    }
}
