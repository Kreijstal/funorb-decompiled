/*
 * Decompiled by CFR-JS 0.4.0.
 */
class am {
    static String field_a;
    am field_f;
    static String field_b;
    static HostileSpawn field_d;
    am field_g;
    long field_c;
    static int field_e;

    final static void a(int param0, int param1, int param2, p param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param2 < 0) {
                  break L2;
                } else {
                  if (param1 < 0) {
                    break L2;
                  } else {
                    if (param2 > 640) {
                      break L2;
                    } else {
                      if (param1 <= 480) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              param3.field_i = -1;
              break L1;
            }
            L3: {
              if (param0 >= ~param3.field_e) {
                var4_int = -param3.field_e + 16;
                sc.field_l.a(param2, param1, var4_int, var4_int);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("am.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final static void a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              fb.field_l = fb.field_l + 1;
              if (qh.field_s != -1) {
                break L1;
              } else {
                if (hn.field_b != -1) {
                  break L1;
                } else {
                  qh.field_s = j.field_c;
                  hn.field_b = rb.field_m;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param0 != null) {
                  if (!param0.equals((Object) (Object) eb.field_d)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (null != eb.field_d) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (re.field_k) {
                    break L5;
                  } else {
                    if (~ui.field_e < ~fb.field_l) {
                      break L5;
                    } else {
                      if (~(qg.field_u + ui.field_e) >= ~fb.field_l) {
                        break L5;
                      } else {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L4;
              }
              L6: {
                var2_int = stackIn_14_0;
                if (param0 == null) {
                  fb.field_l = 0;
                  break L6;
                } else {
                  L7: {
                    if (re.field_k) {
                      break L7;
                    } else {
                      if (var2_int == 0) {
                        fb.field_l = 0;
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  fb.field_l = ui.field_e;
                  break L6;
                }
              }
              qh.field_q = hn.field_b;
              l.field_d = qh.field_s;
              if (param0 != null) {
                re.field_k = false;
                break L2;
              } else {
                if (var2_int == 0) {
                  break L2;
                } else {
                  re.field_k = true;
                  break L2;
                }
              }
            }
            L8: {
              eb.field_d = param0;
              if (re.field_k) {
                hn.field_b = -1;
                break L8;
              } else {
                if (~fb.field_l <= ~ui.field_e) {
                  hn.field_b = -1;
                  break L8;
                } else {
                  if (!um.field_d) {
                    hn.field_b = -1;
                    break L8;
                  } else {
                    qh.field_q = hn.field_b;
                    l.field_d = qh.field_s;
                    fb.field_l = 0;
                    hn.field_b = -1;
                    break L8;
                  }
                }
              }
            }
            L9: {
              if (!re.field_k) {
                break L9;
              } else {
                if (~rd.field_h != ~fb.field_l) {
                  break L9;
                } else {
                  fb.field_l = 0;
                  re.field_k = false;
                  break L9;
                }
              }
            }
            qh.field_s = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("am.L(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L10;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 44 + -82 + 41);
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4_int = 0;
        oj var4 = null;
        int var7 = 0;
        oj var8 = null;
        p var9 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ln.field_a.field_d;
              if (bm.field_c == 0) {
                L2: {
                  var3 = 7500;
                  if (rl.field_c != 6) {
                    if (rl.field_c == 7) {
                      var3 = 6000;
                      break L2;
                    } else {
                      if (rl.field_c != 2) {
                        break L2;
                      } else {
                        var3 = 6000;
                        break L2;
                      }
                    }
                  } else {
                    var3 = 3000;
                    break L2;
                  }
                }
                L3: {
                  if (var3 < le.field_D) {
                    break L3;
                  } else {
                    if (0 == le.field_D) {
                      break L3;
                    } else {
                      break L1;
                    }
                  }
                }
                le.field_D = var3;
                break L1;
              } else {
                break L1;
              }
            }
            L4: {
              r.field_a = 0;
              if (ha.field_t == 1) {
                ue.a(250, false);
                var3 = 1;
                var4_int = 0;
                L5: while (true) {
                  L6: {
                    if (var4_int >= el.field_j) {
                      break L6;
                    } else {
                      if (125 != mm.field_m[var4_int].field_i) {
                        var4_int++;
                        continue L5;
                      } else {
                        var3 = 0;
                        break L6;
                      }
                    }
                  }
                  if (var3 != 0) {
                    L7: {
                      if (bm.field_c != 0) {
                        break L7;
                      } else {
                        if (rl.field_c != 2) {
                          break L7;
                        } else {
                          kd.a(14, 1);
                          var4_int = 1;
                          L8: while (true) {
                            if (var4_int >= el.field_j) {
                              break L4;
                            } else {
                              L9: {
                                var8 = mm.field_m[var4_int];
                                if (15 != var8.field_i) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var4_int++;
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                    kd.a(0, 1);
                    break L4;
                  } else {
                    ha.field_t = -1;
                    kd.a(1, 1);
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            L10: {
              ue.a(250, false);
              if (param1 > 89) {
                break L10;
              } else {
                am.a(-56, (byte) -41);
                break L10;
              }
            }
            var3 = 1;
            L11: while (true) {
              if (var3 >= 5) {
                L12: {
                  L13: {
                    if (1 != bm.field_c) {
                      break L13;
                    } else {
                      if (rl.field_c == 3) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  var3 = 0;
                  L14: while (true) {
                    if (var3 >= el.field_j) {
                      break L12;
                    } else {
                      L15: {
                        var4 = mm.field_m[var3];
                        if (5 == var4.field_i) {
                          var4.field_I = 0;
                          break L15;
                        } else {
                          if (22 != var4.field_i) {
                            break L15;
                          } else {
                            var4.field_I = 0;
                            break L15;
                          }
                        }
                      }
                      var4.field_F = 0;
                      var3++;
                      continue L14;
                    }
                  }
                }
                break L0;
              } else {
                var4_int = 0;
                L16: while (true) {
                  if (var4_int > 256) {
                    var3++;
                    continue L11;
                  } else {
                    var9 = jn.field_F[ib.field_c];
                    var9.field_c = (double)var4_int;
                    var9.field_j.a((int)(-4.0 + 6.0 * Math.random()) + param0 % var2_int, 8360, (int)(-4.0 + 6.0 * Math.random()) + param0 / var2_int);
                    var9.field_l.a(0.0, 0.0, 1);
                    var9.field_i = 8;
                    var9.field_e = 0;
                    var9.field_h = var3;
                    var9.field_l.a(var3 * 4, (byte) 94, var9.field_c);
                    var9.a(225, var9.field_c + 20.0 * Math.random() - 10.0, 50);
                    ib.field_c = ib.field_c + 1;
                    var4_int += 16;
                    continue L16;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "am.M(" + param0 + 44 + param1 + 41);
        }
    }

    final void b(int param0) {
        if (!(null != ((am) this).field_f)) {
            return;
        }
        ((am) this).field_f.field_g = ((am) this).field_g;
        ((am) this).field_g.field_f = ((am) this).field_f;
        ((am) this).field_g = null;
        ((am) this).field_f = null;
        int var2 = -107 % ((67 - param0) / 39);
    }

    final boolean a(int param0) {
        if (param0 != 3000) {
            return false;
        }
        if (null == ((am) this).field_f) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "The explosive barrel is blocking your route into the ship. Aim and hold the left mouse button to shoot at it.";
        field_a = "You have unlocked this campaign's <col=ffffff>hard mode</col> on the level select screen.";
    }
}
