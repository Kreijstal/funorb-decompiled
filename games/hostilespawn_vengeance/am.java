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
        int var4 = 0;
        if (param2 >= 0) {
            if (-1 >= (param1 ^ -1)) {
                if ((param2 ^ -1) >= -641) {
                    // if_icmpge L38
                }
            }
        }
        param3.field_i = -1;
        if (!(param0 > param3.field_e)) {
            var4 = -param3.field_e + 16;
            sc.field_l.a(param2, param1, var4, var4);
        }
    }

    final static void a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          fb.field_l = fb.field_l + 1;
          if (qh.field_s != 0) {
            break L0;
          } else {
            if (0 != hn.field_b) {
              break L0;
            } else {
              qh.field_s = j.field_c;
              hn.field_b = rb.field_m;
              break L0;
            }
          }
        }
        L1: {
          if (param0 != null) {
            L2: {
              if (!param0.equals((Object) (Object) eb.field_d)) {
                L3: {
                  if (!re.field_k) {
                    if (ui.field_e <= fb.field_l) {
                      if (qg.field_u + ui.field_e > fb.field_l) {
                        stackOut_22_0 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        break L3;
                      } else {
                        stackOut_21_0 = 0;
                        stackIn_24_0 = stackOut_21_0;
                        break L3;
                      }
                    } else {
                      stackOut_19_0 = 0;
                      stackIn_24_0 = stackOut_19_0;
                      break L3;
                    }
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_24_0 = stackOut_17_0;
                    break L3;
                  }
                }
                L4: {
                  var2 = stackIn_24_0;
                  if (param0 != null) {
                    if (!re.field_k) {
                      if (var2 != 0) {
                        fb.field_l = ui.field_e;
                        break L4;
                      } else {
                        fb.field_l = 0;
                        break L4;
                      }
                    } else {
                      eb.field_d = param0;
                      if (re.field_k) {
                        break L1;
                      } else {
                        if (fb.field_l >= ui.field_e) {
                          break L1;
                        } else {
                          if (!um.field_d) {
                            break L1;
                          } else {
                            qh.field_q = hn.field_b;
                            l.field_d = qh.field_s;
                            fb.field_l = 0;
                            break L1;
                          }
                        }
                      }
                    }
                  } else {
                    fb.field_l = 0;
                    break L4;
                  }
                }
                qh.field_q = hn.field_b;
                l.field_d = qh.field_s;
                if (param0 != null) {
                  re.field_k = false;
                  break L2;
                } else {
                  if (var2 != 0) {
                    re.field_k = true;
                    break L2;
                  } else {
                    eb.field_d = param0;
                    if (re.field_k) {
                      break L1;
                    } else {
                      if (fb.field_l >= ui.field_e) {
                        break L1;
                      } else {
                        if (!um.field_d) {
                          break L1;
                        } else {
                          qh.field_q = hn.field_b;
                          l.field_d = qh.field_s;
                          fb.field_l = 0;
                          break L1;
                        }
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            eb.field_d = param0;
            if (re.field_k) {
              break L1;
            } else {
              if (fb.field_l >= ui.field_e) {
                break L1;
              } else {
                if (!um.field_d) {
                  break L1;
                } else {
                  qh.field_q = hn.field_b;
                  l.field_d = qh.field_s;
                  fb.field_l = 0;
                  break L1;
                }
              }
            }
          } else {
            if (null != eb.field_d) {
              eb.field_d = param0;
              if (re.field_k) {
                break L1;
              } else {
                if (fb.field_l >= ui.field_e) {
                  break L1;
                } else {
                  if (!um.field_d) {
                    break L1;
                  } else {
                    qh.field_q = hn.field_b;
                    l.field_d = qh.field_s;
                    fb.field_l = 0;
                    break L1;
                  }
                }
              }
            } else {
              eb.field_d = param0;
              if (re.field_k) {
                break L1;
              } else {
                if (fb.field_l >= ui.field_e) {
                  break L1;
                } else {
                  if (!um.field_d) {
                    break L1;
                  } else {
                    qh.field_q = hn.field_b;
                    l.field_d = qh.field_s;
                    fb.field_l = 0;
                    break L1;
                  }
                }
              }
            }
          }
        }
        hn.field_b = -1;
        if (param1 == -82) {
          L5: {
            if (!re.field_k) {
              break L5;
            } else {
              if (rd.field_h != fb.field_l) {
                break L5;
              } else {
                fb.field_l = 0;
                re.field_k = false;
                break L5;
              }
            }
          }
          qh.field_s = -1;
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != -50) {
            field_d = null;
        }
        field_a = null;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        oj var4 = null;
        int var6 = 0;
        int var7 = 0;
        oj var8 = null;
        p var9 = null;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          var2 = ln.field_a.field_d;
          if (bm.field_c == 0) {
            L1: {
              var3 = 7500;
              if (rl.field_c != 6) {
                if (-8 == (rl.field_c ^ -1)) {
                  var3 = 6000;
                  break L1;
                } else {
                  if ((rl.field_c ^ -1) != -3) {
                    break L1;
                  } else {
                    var3 = 6000;
                    break L1;
                  }
                }
              } else {
                var3 = 3000;
                break L1;
              }
            }
            L2: {
              if (var3 < le.field_D) {
                break L2;
              } else {
                if (0 == le.field_D) {
                  break L2;
                } else {
                  break L0;
                }
              }
            }
            le.field_D = var3;
            break L0;
          } else {
            break L0;
          }
        }
        L3: {
          r.field_a = 0;
          if (ha.field_t == 1) {
            ue.a(250, false);
            var3 = 1;
            var4_int = 0;
            L4: while (true) {
              L5: {
                if (var4_int >= el.field_j) {
                  break L5;
                } else {
                  if (125 != mm.field_m[var4_int].field_i) {
                    var4_int++;
                    continue L4;
                  } else {
                    var3 = 0;
                    break L5;
                  }
                }
              }
              if (var3 != 0) {
                L6: {
                  if (bm.field_c != 0) {
                    break L6;
                  } else {
                    if (rl.field_c != 2) {
                      break L6;
                    } else {
                      kd.a(14, 1);
                      var4_int = 1;
                      L7: while (true) {
                        if (var4_int >= el.field_j) {
                          break L3;
                        } else {
                          var8 = mm.field_m[var4_int];
                          if (15 == var8.field_i) {
                            var8.field_i = -1;
                            var6 = var8.field_j.b(-4);
                            ln.field_a.field_c[var6] = 0;
                            ln.field_a.field_f[var6] = 2;
                            var4_int++;
                            continue L7;
                          } else {
                            var4_int++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
                kd.a(0, 1);
                break L3;
              } else {
                ha.field_t = -1;
                kd.a(1, 1);
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L8: {
          ue.a(250, false);
          if (param1 > 89) {
            break L8;
          } else {
            am.a(-56, (byte) -41);
            break L8;
          }
        }
        var3 = 1;
        L9: while (true) {
          if ((var3 ^ -1) <= -6) {
            L10: {
              L11: {
                if (1 != bm.field_c) {
                  break L11;
                } else {
                  if (rl.field_c == 3) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              var3 = 0;
              L12: while (true) {
                if (var3 >= el.field_j) {
                  break L10;
                } else {
                  L13: {
                    var4 = mm.field_m[var3];
                    if (5 == var4.field_i) {
                      var4.field_I = 0;
                      break L13;
                    } else {
                      if (22 != var4.field_i) {
                        break L13;
                      } else {
                        var4.field_I = 0;
                        break L13;
                      }
                    }
                  }
                  var4.field_F = 0;
                  var3++;
                  continue L12;
                }
              }
            }
            return;
          } else {
            var4_int = 0;
            L14: while (true) {
              if (var4_int > 256) {
                var3++;
                continue L9;
              } else {
                var9 = jn.field_F[ib.field_c];
                var9.field_c = (double)var4_int;
                var9.field_j.a((int)(-4.0 + 6.0 * Math.random()) + param0 % var2, 8360, (int)(-4.0 + 6.0 * Math.random()) + param0 / var2);
                var9.field_l.a(0.0, 0.0, 1);
                var9.field_i = 8;
                var9.field_e = 0;
                var9.field_h = var3;
                var9.field_l.a(var3 * 4, (byte) 94, var9.field_c);
                var9.a(225, var9.field_c + 20.0 * Math.random() - 10.0, 50);
                ib.field_c = ib.field_c + 1;
                var4_int += 16;
                continue L14;
              }
            }
          }
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
