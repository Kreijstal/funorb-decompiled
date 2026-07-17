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

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0) {
            return;
        }
        ik.a(true);
    }

    final static int a(byte param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_55_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_54_0 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              kk.field_i = kk.field_i + 65536;
              if (param0 == 76) {
                break L1;
              } else {
                field_b = 6L;
                break L1;
              }
            }
            L2: while (true) {
              if (65536 > fj.a(1870096848, kk.field_i, eh.field_o)) {
                L3: {
                  var2_int = -1;
                  if (gi.field_f == null) {
                    if (null != ak.field_i) {
                      var2_int = ak.field_i.length;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var2_int = gi.field_f.length;
                    break L3;
                  }
                }
                L4: {
                  if (-1 == var2_int) {
                    break L4;
                  } else {
                    L5: {
                      if (eh.field_m <= ll.field_d) {
                        break L5;
                      } else {
                        L6: {
                          ll.field_d = ll.field_d + 1;
                          if (ll.field_d <= eh.field_k) {
                            break L6;
                          } else {
                            L7: {
                              if (null == gi.field_f) {
                                break L7;
                              } else {
                                if (gi.field_f[oi.field_j] != null) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            ll.field_d = ll.field_d - 1;
                            break L5;
                          }
                        }
                        if (ll.field_d < eh.field_m) {
                          break L5;
                        } else {
                          if (null != gi.field_f[(oi.field_j - -1) % var2_int]) {
                            break L5;
                          } else {
                            ll.field_d = ll.field_d - 1;
                            break L5;
                          }
                        }
                      }
                    }
                    L8: {
                      if (ll.field_d < eh.field_m) {
                        break L8;
                      } else {
                        L9: {
                          p.field_b = oi.field_j;
                          if (bh.field_r) {
                            oi.field_j = oi.field_j + 1;
                            if (var2_int > oi.field_j) {
                              break L9;
                            } else {
                              oi.field_j = oi.field_j - var2_int;
                              break L9;
                            }
                          } else {
                            oi.field_j = oi.field_j - 1;
                            if (oi.field_j < 0) {
                              oi.field_j = oi.field_j + var2_int;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ll.field_d = ll.field_d - eh.field_m;
                        break L8;
                      }
                    }
                    if (ll.field_d > eh.field_k) {
                      bh.field_r = true;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (le.field_e == null) {
                    break L10;
                  } else {
                    L11: {
                      var3 = -(le.field_e.field_v / 2) + 357;
                      var4 = 0;
                      if (vb.field_n == 0) {
                        break L11;
                      } else {
                        if (var3 >= ci.field_m) {
                          break L11;
                        } else {
                          if (le.field_e.field_x + var3 <= ci.field_m) {
                            break L11;
                          } else {
                            L12: {
                              if (field_a <= 269 - le.field_e.field_u) {
                                break L12;
                              } else {
                                if (field_a >= 269) {
                                  break L12;
                                } else {
                                  bh.field_r = false;
                                  var4 = 1;
                                  ll.field_d = eh.field_m;
                                  break L12;
                                }
                              }
                            }
                            if (586 >= field_a) {
                              break L11;
                            } else {
                              if (586 + le.field_e.field_u <= field_a) {
                                break L11;
                              } else {
                                var4 = 1;
                                bh.field_r = true;
                                ll.field_d = eh.field_m;
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L10;
                    } else {
                      if (ll.field_d <= eh.field_k) {
                        break L10;
                      } else {
                        if (ph.field_d <= var3) {
                          break L10;
                        } else {
                          if (ph.field_d >= var3 - -le.field_e.field_x) {
                            break L10;
                          } else {
                            L13: {
                              if (-le.field_e.field_u + 269 >= kc.field_u) {
                                break L13;
                              } else {
                                if (269 > kc.field_u) {
                                  ll.field_d = eh.field_k;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            if (kc.field_u <= 586) {
                              break L10;
                            } else {
                              if (586 + le.field_e.field_u > kc.field_u) {
                                ll.field_d = eh.field_k;
                                break L10;
                              } else {
                                return 0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_54_0 = 0;
                stackIn_55_0 = stackOut_54_0;
                break L0;
              } else {
                ub.field_h = ub.field_h + 1;
                kk.field_i = kk.field_i - eh.field_o;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "ik.C(" + param0 + 44 + 0 + 41);
        }
        return stackIn_55_0;
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
