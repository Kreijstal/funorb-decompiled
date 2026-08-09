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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param2 < 0) {
                  break L2;
                } else {
                  if (-1 < (param1 ^ -1)) {
                    break L2;
                  } else {
                    if ((param2 ^ -1) < -641) {
                      break L2;
                    } else {
                      if ((param1 ^ -1) >= -481) {
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
              if (param0 >= (param3.field_e ^ -1)) {
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
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("am.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static void a(String param0, byte param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              fb.field_l = fb.field_l + 1;
              if ((qh.field_s ^ -1) != 0) {
                break L1;
              } else {
                if (0 != (hn.field_b ^ -1)) {
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
                  if (!param0.equals(eb.field_d)) {
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
                if (!re.field_k) {
                  if (ui.field_e <= fb.field_l) {
                    if (qg.field_u + ui.field_e > fb.field_l) {
                      stackIn_17_0 = 1;
                      break L4;
                    } else {
                      stackIn_17_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_17_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param0 == null) {
                  fb.field_l = 0;
                  break L5;
                } else {
                  L6: {
                    if (re.field_k) {
                      break L6;
                    } else {
                      if (var2_int == 0) {
                        fb.field_l = 0;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  fb.field_l = ui.field_e;
                  break L5;
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
            L7: {
              eb.field_d = param0;
              if (re.field_k) {
                break L7;
              } else {
                if (fb.field_l >= ui.field_e) {
                  break L7;
                } else {
                  if (!um.field_d) {
                    break L7;
                  } else {
                    qh.field_q = hn.field_b;
                    l.field_d = qh.field_s;
                    fb.field_l = 0;
                    break L7;
                  }
                }
              }
            }
            hn.field_b = -1;
            if (param1 == -82) {
              L8: {
                if (!re.field_k) {
                  break L8;
                } else {
                  if (rd.field_h != fb.field_l) {
                    break L8;
                  } else {
                    fb.field_l = 0;
                    re.field_k = false;
                    break L8;
                  }
                }
              }
              qh.field_s = -1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var2);

            stackIn_41_1 = new StringBuilder().append("am.L(");

            if (param0 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L9;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L9;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != -50) {
            field_d = (HostileSpawn) null;
        }
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        oj var4 = null;
        int var6 = 0;
        int var7 = 0;
        oj var8 = null;
        p var9 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ln.field_a.field_d;
              if (bm.field_c == 0) {
                L2: {
                  var3 = 7500;
                  if (rl.field_c != 6) {
                    if (-8 == (rl.field_c ^ -1)) {
                      var3 = 6000;
                      break L2;
                    } else {
                      if ((rl.field_c ^ -1) != -3) {
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
                              var8 = mm.field_m[var4_int];
                              if (15 == var8.field_i) {
                                var8.field_i = -1;
                                var6 = var8.field_j.b(-4);
                                ln.field_a.field_c[var6] = 0;
                                ln.field_a.field_f[var6] = 2;
                                var4_int++;
                                continue L8;
                              } else {
                                var4_int++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackIn_31_0 = 0;
                    stackIn_31_1 = 1;
                    kd.a(stackIn_31_0, stackIn_31_1);
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
            L9: {
              ue.a(250, false);
              if (param1 > 89) {
                break L9;
              } else {
                am.a(-56, (byte) -41);
                break L9;
              }
            }
            var3 = 1;
            L10: while (true) {
              if ((var3 ^ -1) <= -6) {
                L11: {
                  L12: {
                    if (1 != bm.field_c) {
                      break L12;
                    } else {
                      if (rl.field_c == 3) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var3 = 0;
                  L13: while (true) {
                    if (var3 >= el.field_j) {
                      break L11;
                    } else {
                      L14: {
                        var4 = mm.field_m[var3];
                        if (5 == var4.field_i) {
                          var4.field_I = 0;
                          break L14;
                        } else {
                          if (22 != var4.field_i) {
                            break L14;
                          } else {
                            var4.field_I = 0;
                            break L14;
                          }
                        }
                      }
                      var4.field_F = 0;
                      var3++;
                      continue L13;
                    }
                  }
                }
                break L0;
              } else {
                var4_int = 0;
                L15: while (true) {
                  if (var4_int > 256) {
                    var3++;
                    continue L10;
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
                    continue L15;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "am.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        if (!(null != this.field_f)) {
            return;
        }
        this.field_f.field_g = this.field_g;
        this.field_g.field_f = this.field_f;
        this.field_g = null;
        this.field_f = null;
        int var2 = -107 % ((67 - param0) / 39);
    }

    final boolean a(int param0) {
        if (param0 != 3000) {
            return false;
        }
        if (null == this.field_f) {
            return false;
        }
        return true;
    }

    static {
        field_b = "The explosive barrel is blocking your route into the ship. Aim and hold the left mouse button to shoot at it.";
        field_a = "You have unlocked this campaign's <col=ffffff>hard mode</col> on the level select screen.";
    }
}
