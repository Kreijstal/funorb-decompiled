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
        qj discarded$2 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
                  var5 = (String) null;
                  discarded$2 = oe.a(-111, (String) null, -88);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("oe.F(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    private final void a(mg param0, int param1, int param2) {
        qj discarded$2 = null;
        int[] array$3 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ba var7 = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -3) {
                break L1;
              } else {
                var10 = (String) null;
                discarded$2 = oe.a(-30, (String) null, -63);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param1 ^ -1) == -2) {
                  break L3;
                } else {
                  L4: {
                    if ((param1 ^ -1) != -3) {
                      break L4;
                    } else {
                      var4_int = param0.b((byte) 90);
                      this.field_o = new int[var4_int];
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= var4_int) {
                          if (var9 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        } else {
                          this.field_o[var5] = param0.j(param2 + 98203179);
                          var5++;
                          if (var9 != 0) {
                            break L2;
                          } else {
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  if (param1 == 3) {
                    var4_int = param0.b((byte) 90);
                    this.field_k = new int[var4_int];
                    this.field_l = new int[var4_int][];
                    var5 = 0;
                    L6: while (true) {
                      if (var4_int <= var5) {
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        var6 = param0.j(98203176);
                        var7 = wg.a(var6, -128);
                        if (var9 != 0) {
                          break L2;
                        } else {
                          L7: {
                            L8: {
                              if (var7 != null) {
                                this.field_k[var5] = var6;
                                array$3 = new int[var7.field_f];
                                this.field_l[var5] = array$3;
                                var8 = 0;
                                L9: while (true) {
                                  if (var8 >= var7.field_f) {
                                    break L8;
                                  } else {
                                    this.field_l[var5][var8] = param0.j(98203176);
                                    var8++;
                                    if (var9 != 0) {
                                      break L7;
                                    } else {
                                      if (var9 == 0) {
                                        continue L9;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                            var5++;
                            break L7;
                          }
                          continue L6;
                        }
                      }
                    }
                  } else {
                    if (-5 != (param1 ^ -1)) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_n = g.a(87, '<', param0.g(2));
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("oe.C(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        if (param0 != -12563) {
            field_m = (String) null;
        }
        field_m = null;
        field_q = null;
    }

    private final String e(int param0) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        var5 = new StringBuilder(80);
        var2 = var5;
        if (null != this.field_n) {
          discarded$6 = var5.append(this.field_n[0]);
          var3 = 1;
          L0: while (true) {
            L1: {
              L2: {
                if (this.field_n.length <= var3) {
                  break L2;
                } else {
                  discarded$7 = var2.append("...");
                  discarded$8 = var5.append(this.field_n[var3]);
                  var3++;
                  if (var4 != 0) {
                    break L1;
                  } else {
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param0 < -47) {
                break L1;
              } else {
                return (String) null;
              }
            }
            return var2.toString();
          }
        } else {
          return "";
        }
    }

    final static og a(boolean param0, byte param1) {
        int discarded$2 = 0;
        String discarded$3 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        se var8 = null;
        oe var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_29_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_28_0 = null;
        int[] stackOut_27_0 = null;
        L0: {
          var7 = OrbDefence.field_D ? 1 : 0;
          var8 = cd.field_t;
          var3 = var8.b((byte) 90);
          if ((128 & var3) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          ja.field_e = stackIn_3_0 != 0;
          wb.field_d = var3 & 127;
          bh.field_c = var8.b((byte) 90);
          tf.field_l = var8.c((byte) -89);
          if ((wb.field_d ^ -1) == -3) {
            pc.field_X = var8.j(98203176);
            gb.field_b = var8.a((byte) -30);
            break L1;
          } else {
            pc.field_X = 0;
            gb.field_b = 0;
            if (var7 == 0) {
              break L1;
            } else {
              pc.field_X = var8.j(98203176);
              gb.field_b = var8.a((byte) -30);
              break L1;
            }
          }
        }
        L2: {
          if (var8.b((byte) 90) != 1) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L2;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_11_0;
          l.field_f = var8.g(2);
          if (var4 != 0) {
            vk.field_v = var8.g(2);
            break L3;
          } else {
            vk.field_v = l.field_f;
            if (var7 == 0) {
              break L3;
            } else {
              vk.field_v = var8.g(2);
              break L3;
            }
          }
        }
        if (param1 <= -52) {
          L4: {
            L5: {
              if (-2 == (wb.field_d ^ -1)) {
                break L5;
              } else {
                if (4 == wb.field_d) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            discarded$2 = var8.j(98203176);
            discarded$3 = var8.g(2);
            break L4;
          }
          L6: {
            L7: {
              if (param0) {
                break L7;
              } else {
                vj.field_a = hi.a(80, -111, var8);
                n.field_c = null;
                if (var7 == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            var5 = var8.j(98203176);
            try {
              L8: {
                L9: {
                  var9 = aa.field_d.b(-11244, var5);
                  vj.field_a = var9.e(-50);
                  if (vk.field_v.equals(gb.field_h)) {
                    stackOut_28_0 = null;
                    stackIn_29_0 = (int[]) ((Object) stackOut_28_0);
                    break L9;
                  } else {
                    stackOut_27_0 = var9.field_o;
                    stackIn_29_0 = stackOut_27_0;
                    break L9;
                  }
                }
                n.field_c = stackIn_29_0;
                break L8;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L10: {
                var6 = (Exception) (Object) decompiledCaughtException;
                pe.a((byte) -13, (Throwable) ((Object) var6), "CC1");
                n.field_c = null;
                vj.field_a = null;
                break L10;
              }
            }
            break L6;
          }
          return new og(param0);
        } else {
          return (og) null;
        }
    }

    oe() {
    }

    final static qj a(int param0, String param1, int param2) {
        qj var3 = null;
        RuntimeException var3_ref = null;
        qj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -3) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            var3 = new qj(false);
            var3.field_e = param1;
            var3.field_b = param0;
            stackOut_2_0 = (qj) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("oe.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = OrbDefence.field_D ? 1 : 0;
            if (this.field_o == null) {
              break L1;
            } else {
              var2 = 0;
              L2: while (true) {
                if (var2 >= this.field_o.length) {
                  break L1;
                } else {
                  this.field_o[var2] = ge.a(this.field_o[var2], 32768);
                  var2++;
                  if (var3 != 0) {
                    break L0;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          var2 = 73 / ((64 - param0) / 47);
          break L0;
        }
    }

    static {
        field_q = "Orbsome";
        field_m = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_p = false;
    }
}
