/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static String[] field_c;
    static int[][][] field_d;
    static int field_a;
    static String field_e;
    static long field_b;

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (ee.field_o <= 0) {
          if (d.p(-110)) {
            var2 = 0;
            if (tf.field_h != null) {
              return;
            } else {
              L0: {
                if (lc.field_j) {
                  gj.a(-1, var2, param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
          } else {
            var2 = 1;
            if (tf.field_h != null) {
              return;
            } else {
              L1: {
                if (lc.field_j) {
                  gj.a(-1, var2, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          }
        } else {
          if (tf.field_h != null) {
            gi.field_d = tf.field_h.a((byte) -88);
            nb.a(2, true);
            if (null == gi.field_d) {
              var2 = 3;
              if (tf.field_h != null) {
                return;
              } else {
                L2: {
                  if (lc.field_j) {
                    gj.a(-1, var2, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            } else {
              lk.a((java.awt.Canvas) (Object) gi.field_d, false);
              var2 = 2;
              if (tf.field_h != null) {
                return;
              } else {
                L3: {
                  if (lc.field_j) {
                    gj.a(-1, var2, param0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
          } else {
            gi.field_d = dd.a(0, sh.field_u, 82, 640, 0, 480);
            if (null == gi.field_d) {
              var2 = 3;
              if (tf.field_h != null) {
                return;
              } else {
                L4: {
                  if (lc.field_j) {
                    gj.a(-1, var2, param0);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            } else {
              lk.a((java.awt.Canvas) (Object) gi.field_d, false);
              var2 = 2;
              if (tf.field_h != null) {
                return;
              } else {
                L5: {
                  if (lc.field_j) {
                    gj.a(-1, var2, param0);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return;
              }
            }
          }
        }
    }

    public static void a() {
        field_c = null;
        field_d = null;
        field_e = null;
    }

    final static int a(byte param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_56_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_77_0 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            kk.field_i = kk.field_i + 65536;
            L1: while (true) {
              if (65536 > fj.a(1870096848, kk.field_i, eh.field_o)) {
                L2: {
                  var2_int = -1;
                  if (gi.field_f == null) {
                    if (null != ak.field_i) {
                      var2_int = ak.field_i.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var2_int = gi.field_f.length;
                    break L2;
                  }
                }
                L3: {
                  if (-1 == var2_int) {
                    break L3;
                  } else {
                    L4: {
                      if (eh.field_m <= ll.field_d) {
                        break L4;
                      } else {
                        L5: {
                          ll.field_d = ll.field_d + 1;
                          if (ll.field_d <= eh.field_k) {
                            break L5;
                          } else {
                            L6: {
                              if (null == gi.field_f) {
                                break L6;
                              } else {
                                if (gi.field_f[oi.field_j] != null) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            ll.field_d = ll.field_d - 1;
                            break L4;
                          }
                        }
                        if (ll.field_d < eh.field_m) {
                          break L4;
                        } else {
                          if (null != gi.field_f[(oi.field_j - -1) % var2_int]) {
                            break L4;
                          } else {
                            ll.field_d = ll.field_d - 1;
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (ll.field_d < eh.field_m) {
                        break L7;
                      } else {
                        L8: {
                          p.field_b = oi.field_j;
                          if (bh.field_r) {
                            oi.field_j = oi.field_j + 1;
                            if (var2_int > oi.field_j) {
                              break L8;
                            } else {
                              oi.field_j = oi.field_j - var2_int;
                              break L8;
                            }
                          } else {
                            oi.field_j = oi.field_j - 1;
                            if (oi.field_j < 0) {
                              oi.field_j = oi.field_j + var2_int;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ll.field_d = ll.field_d - eh.field_m;
                        break L7;
                      }
                    }
                    if (ll.field_d > eh.field_k) {
                      bh.field_r = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L9: {
                  if (le.field_e == null) {
                    break L9;
                  } else {
                    L10: {
                      var3 = -(le.field_e.field_v / 2) + 357;
                      var4 = 0;
                      if (vb.field_n == 0) {
                        break L10;
                      } else {
                        if (var3 >= ci.field_m) {
                          break L10;
                        } else {
                          if (le.field_e.field_x + var3 <= ci.field_m) {
                            break L10;
                          } else {
                            L11: {
                              if (field_a <= 269 - le.field_e.field_u) {
                                break L11;
                              } else {
                                if (field_a >= 269) {
                                  break L11;
                                } else {
                                  bh.field_r = false;
                                  var4 = 1;
                                  ll.field_d = eh.field_m;
                                  break L11;
                                }
                              }
                            }
                            if (586 >= field_a) {
                              break L10;
                            } else {
                              if (586 + le.field_e.field_u <= field_a) {
                                break L10;
                              } else {
                                var4 = 1;
                                bh.field_r = true;
                                ll.field_d = eh.field_m;
                                break L10;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L9;
                    } else {
                      if (ll.field_d <= eh.field_k) {
                        break L9;
                      } else {
                        if (ph.field_d <= var3) {
                          break L9;
                        } else {
                          if (ph.field_d >= var3 - -le.field_e.field_x) {
                            break L9;
                          } else {
                            L12: {
                              if (-le.field_e.field_u + 269 >= kc.field_u) {
                                break L12;
                              } else {
                                if (269 > kc.field_u) {
                                  ll.field_d = eh.field_k;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (kc.field_u <= 586) {
                              break L9;
                            } else {
                              if (586 + le.field_e.field_u > kc.field_u) {
                                ll.field_d = eh.field_k;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L13: {
                  if (!param1) {
                    break L13;
                  } else {
                    L14: {
                      of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                      if (!of.field_c.c((byte) 49)) {
                        break L14;
                      } else {
                        if (of.field_c.field_j == 0) {
                          stackOut_56_0 = 3;
                          stackIn_57_0 = stackOut_56_0;
                          return stackIn_57_0;
                        } else {
                          if (1 != of.field_c.field_j) {
                            break L14;
                          } else {
                            stackOut_59_0 = 2;
                            stackIn_60_0 = stackOut_59_0;
                            return stackIn_60_0;
                          }
                        }
                      }
                    }
                    L15: while (true) {
                      if (!kj.e((byte) -44)) {
                        break L13;
                      } else {
                        L16: {
                          of.field_c.a(0, 0);
                          if (of.field_c.c((byte) 79)) {
                            if (of.field_c.field_j == 0) {
                              stackOut_67_0 = 3;
                              stackIn_68_0 = stackOut_67_0;
                              return stackIn_68_0;
                            } else {
                              if (1 == of.field_c.field_j) {
                                stackOut_71_0 = 1;
                                stackIn_72_0 = stackOut_71_0;
                                return stackIn_72_0;
                              } else {
                                break L16;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                        if (13 == b.field_J) {
                          stackOut_75_0 = 1;
                          stackIn_76_0 = stackOut_75_0;
                          return stackIn_76_0;
                        } else {
                          continue L15;
                        }
                      }
                    }
                  }
                }
                stackOut_77_0 = 0;
                stackIn_78_0 = stackOut_77_0;
                break L0;
              } else {
                ub.field_h = ub.field_h + 1;
                kk.field_i = kk.field_i - eh.field_o;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "ik.C(" + 76 + 44 + param1 + 41);
        }
        return stackIn_78_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[][][]{new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][]};
        field_a = 0;
        field_c = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_e = "Previous";
    }
}
