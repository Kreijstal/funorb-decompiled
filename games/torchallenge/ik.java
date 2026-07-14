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
        if (-1 <= (ee.field_o ^ -1)) {
          if (d.p(-110)) {
            var2 = 0;
            if (param1 == -27055) {
              if (tf.field_h == null) {
                L0: {
                  if (lc.field_j) {
                    gj.a(param1 ^ 27054, var2, param0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              ik.a(false);
              if (tf.field_h == null) {
                L1: {
                  if (lc.field_j) {
                    gj.a(param1 ^ 27054, var2, param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            var2 = 1;
            if (param1 == -27055) {
              if (tf.field_h != null) {
                return;
              } else {
                L2: {
                  if (lc.field_j) {
                    gj.a(param1 ^ 27054, var2, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            } else {
              ik.a(false);
              if (tf.field_h != null) {
                return;
              } else {
                L3: {
                  if (lc.field_j) {
                    gj.a(param1 ^ 27054, var2, param0);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
          }
        } else {
          if (tf.field_h != null) {
            gi.field_d = tf.field_h.a((byte) -88);
            nb.a(2, true);
            if (null == gi.field_d) {
              var2 = 3;
              if (param1 != -27055) {
                ik.a(false);
                if (tf.field_h != null) {
                  return;
                } else {
                  L4: {
                    if (lc.field_j) {
                      gj.a(param1 ^ 27054, var2, param0);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                }
              } else {
                if (tf.field_h != null) {
                  return;
                } else {
                  L5: {
                    if (lc.field_j) {
                      gj.a(param1 ^ 27054, var2, param0);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                }
              }
            } else {
              lk.a((java.awt.Canvas) (Object) gi.field_d, false);
              var2 = 2;
              if (param1 != -27055) {
                ik.a(false);
                if (tf.field_h != null) {
                  return;
                } else {
                  L6: {
                    if (lc.field_j) {
                      gj.a(param1 ^ 27054, var2, param0);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return;
                }
              } else {
                if (tf.field_h != null) {
                  return;
                } else {
                  L7: {
                    if (lc.field_j) {
                      gj.a(param1 ^ 27054, var2, param0);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            L8: {
              gi.field_d = dd.a(0, sh.field_u, param1 + 27137, 640, 0, 480);
              if (null == gi.field_d) {
                var2 = 3;
                break L8;
              } else {
                lk.a((java.awt.Canvas) (Object) gi.field_d, false);
                var2 = 2;
                break L8;
              }
            }
            if (param1 != -27055) {
              ik.a(false);
              if (tf.field_h != null) {
                return;
              } else {
                L9: {
                  if (lc.field_j) {
                    gj.a(param1 ^ 27054, var2, param0);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              }
            } else {
              if (tf.field_h != null) {
                return;
              } else {
                L10: {
                  if (lc.field_j) {
                    gj.a(param1 ^ 27054, var2, param0);
                    break L10;
                  } else {
                    break L10;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          kk.field_i = kk.field_i + 65536;
          if (param0 == 76) {
            break L0;
          } else {
            field_b = 6L;
            break L0;
          }
        }
        L1: while (true) {
          if (65536 > fj.a(1870096848, kk.field_i, eh.field_o)) {
            L2: {
              var2 = -1;
              if (gi.field_f == null) {
                if (null != ak.field_i) {
                  var2 = ak.field_i.length;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var2 = gi.field_f.length;
                break L2;
              }
            }
            L3: {
              if (-1 == var2) {
                break L3;
              } else {
                L4: {
                  if (eh.field_m <= ll.field_d) {
                    break L4;
                  } else {
                    ll.field_d = ll.field_d + 1;
                    if (ll.field_d <= eh.field_k) {
                      if (ll.field_d >= eh.field_m) {
                        if (null != gi.field_f[(oi.field_j - -1) % var2]) {
                          break L4;
                        } else {
                          ll.field_d = ll.field_d - 1;
                          break L4;
                        }
                      } else {
                        if (ll.field_d < eh.field_m) {
                          break L4;
                        } else {
                          if (null != gi.field_f[(oi.field_j - -1) % var2]) {
                            break L4;
                          } else {
                            ll.field_d = ll.field_d - 1;
                            break L4;
                          }
                        }
                      }
                    } else {
                      if (ll.field_d < eh.field_m) {
                        break L4;
                      } else {
                        if (null != gi.field_f[(oi.field_j - -1) % var2]) {
                          break L4;
                        } else {
                          ll.field_d = ll.field_d - 1;
                          break L4;
                        }
                      }
                    }
                  }
                }
                if (ll.field_d >= eh.field_m) {
                  p.field_b = oi.field_j;
                  if (bh.field_r) {
                    oi.field_j = oi.field_j + 1;
                    if (var2 > oi.field_j) {
                      L5: {
                        ll.field_d = ll.field_d - eh.field_m;
                        if (ll.field_d > eh.field_k) {
                          bh.field_r = true;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (le.field_e == null) {
                          break L6;
                        } else {
                          L7: {
                            var3 = -(le.field_e.field_v / 2) + 357;
                            var4 = 0;
                            if (vb.field_n == 0) {
                              break L7;
                            } else {
                              if (var3 >= ci.field_m) {
                                break L7;
                              } else {
                                if (le.field_e.field_x + var3 <= ci.field_m) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (field_a <= 269 - le.field_e.field_u) {
                                      break L8;
                                    } else {
                                      if (field_a >= 269) {
                                        break L8;
                                      } else {
                                        bh.field_r = false;
                                        var4 = 1;
                                        ll.field_d = eh.field_m;
                                        break L8;
                                      }
                                    }
                                  }
                                  if (586 >= field_a) {
                                    break L7;
                                  } else {
                                    if (586 + le.field_e.field_u <= field_a) {
                                      break L7;
                                    } else {
                                      var4 = 1;
                                      bh.field_r = true;
                                      ll.field_d = eh.field_m;
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (var4 != 0) {
                            break L6;
                          } else {
                            if (ll.field_d <= eh.field_k) {
                              break L6;
                            } else {
                              if (ph.field_d <= var3) {
                                break L6;
                              } else {
                                if (ph.field_d >= var3 - -le.field_e.field_x) {
                                  break L6;
                                } else {
                                  L9: {
                                    if (-le.field_e.field_u + 269 >= kc.field_u) {
                                      break L9;
                                    } else {
                                      if (269 > kc.field_u) {
                                        ll.field_d = eh.field_k;
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  if (kc.field_u <= 586) {
                                    break L6;
                                  } else {
                                    if (586 + le.field_e.field_u > kc.field_u) {
                                      ll.field_d = eh.field_k;
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (param1) {
                        L10: {
                          of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                          if (!of.field_c.c((byte) 49)) {
                            break L10;
                          } else {
                            if (of.field_c.field_j == 0) {
                              return 3;
                            } else {
                              if (1 != of.field_c.field_j) {
                                break L10;
                              } else {
                                return 2;
                              }
                            }
                          }
                        }
                        L11: while (true) {
                          if (kj.e((byte) -44)) {
                            L12: {
                              of.field_c.a(0, 0);
                              if (of.field_c.c((byte) 79)) {
                                if (-1 == (of.field_c.field_j ^ -1)) {
                                  return 3;
                                } else {
                                  if (1 == of.field_c.field_j) {
                                    return 1;
                                  } else {
                                    break L12;
                                  }
                                }
                              } else {
                                break L12;
                              }
                            }
                            if (13 == b.field_J) {
                              return 1;
                            } else {
                              continue L11;
                            }
                          } else {
                            return 0;
                          }
                        }
                      } else {
                        return 0;
                      }
                    } else {
                      oi.field_j = oi.field_j - var2;
                      L13: {
                        ll.field_d = ll.field_d - eh.field_m;
                        if (ll.field_d > eh.field_k) {
                          bh.field_r = true;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if (le.field_e == null) {
                          break L14;
                        } else {
                          L15: {
                            var3 = -(le.field_e.field_v / 2) + 357;
                            var4 = 0;
                            if (vb.field_n == 0) {
                              break L15;
                            } else {
                              if (var3 >= ci.field_m) {
                                break L15;
                              } else {
                                if (le.field_e.field_x + var3 <= ci.field_m) {
                                  break L15;
                                } else {
                                  L16: {
                                    if (field_a <= 269 - le.field_e.field_u) {
                                      break L16;
                                    } else {
                                      if (field_a >= 269) {
                                        break L16;
                                      } else {
                                        bh.field_r = false;
                                        var4 = 1;
                                        ll.field_d = eh.field_m;
                                        break L16;
                                      }
                                    }
                                  }
                                  if (586 >= field_a) {
                                    break L15;
                                  } else {
                                    if (586 + le.field_e.field_u <= field_a) {
                                      break L15;
                                    } else {
                                      var4 = 1;
                                      bh.field_r = true;
                                      ll.field_d = eh.field_m;
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (var4 != 0) {
                            break L14;
                          } else {
                            if (ll.field_d <= eh.field_k) {
                              break L14;
                            } else {
                              if (ph.field_d <= var3) {
                                break L14;
                              } else {
                                if (ph.field_d >= var3 - -le.field_e.field_x) {
                                  break L14;
                                } else {
                                  L17: {
                                    if (-le.field_e.field_u + 269 >= kc.field_u) {
                                      break L17;
                                    } else {
                                      if (269 > kc.field_u) {
                                        ll.field_d = eh.field_k;
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  if (kc.field_u <= 586) {
                                    break L14;
                                  } else {
                                    if (586 + le.field_e.field_u > kc.field_u) {
                                      ll.field_d = eh.field_k;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (param1) {
                        L18: {
                          of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                          if (!of.field_c.c((byte) 49)) {
                            break L18;
                          } else {
                            if (of.field_c.field_j == 0) {
                              return 3;
                            } else {
                              if (1 != of.field_c.field_j) {
                                break L18;
                              } else {
                                return 2;
                              }
                            }
                          }
                        }
                        L19: while (true) {
                          if (kj.e((byte) -44)) {
                            L20: {
                              of.field_c.a(0, 0);
                              if (of.field_c.c((byte) 79)) {
                                if (-1 == (of.field_c.field_j ^ -1)) {
                                  return 3;
                                } else {
                                  if (1 == of.field_c.field_j) {
                                    return 1;
                                  } else {
                                    break L20;
                                  }
                                }
                              } else {
                                break L20;
                              }
                            }
                            if (13 == b.field_J) {
                              return 1;
                            } else {
                              continue L19;
                            }
                          } else {
                            return 0;
                          }
                        }
                      } else {
                        return 0;
                      }
                    }
                  } else {
                    oi.field_j = oi.field_j - 1;
                    if (oi.field_j < 0) {
                      oi.field_j = oi.field_j + var2;
                      L21: {
                        ll.field_d = ll.field_d - eh.field_m;
                        if (ll.field_d > eh.field_k) {
                          bh.field_r = true;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (le.field_e == null) {
                          break L22;
                        } else {
                          L23: {
                            var3 = -(le.field_e.field_v / 2) + 357;
                            var4 = 0;
                            if (vb.field_n == 0) {
                              break L23;
                            } else {
                              if (var3 >= ci.field_m) {
                                break L23;
                              } else {
                                if (le.field_e.field_x + var3 <= ci.field_m) {
                                  break L23;
                                } else {
                                  L24: {
                                    if (field_a <= 269 - le.field_e.field_u) {
                                      break L24;
                                    } else {
                                      if (field_a >= 269) {
                                        break L24;
                                      } else {
                                        bh.field_r = false;
                                        var4 = 1;
                                        ll.field_d = eh.field_m;
                                        break L24;
                                      }
                                    }
                                  }
                                  if (586 >= field_a) {
                                    break L23;
                                  } else {
                                    if (586 + le.field_e.field_u <= field_a) {
                                      break L23;
                                    } else {
                                      var4 = 1;
                                      bh.field_r = true;
                                      ll.field_d = eh.field_m;
                                      break L23;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (var4 != 0) {
                            break L22;
                          } else {
                            if (ll.field_d <= eh.field_k) {
                              break L22;
                            } else {
                              if (ph.field_d <= var3) {
                                break L22;
                              } else {
                                if (ph.field_d >= var3 - -le.field_e.field_x) {
                                  break L22;
                                } else {
                                  L25: {
                                    if (-le.field_e.field_u + 269 >= kc.field_u) {
                                      break L25;
                                    } else {
                                      if (269 > kc.field_u) {
                                        ll.field_d = eh.field_k;
                                        break L25;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  if (kc.field_u <= 586) {
                                    break L22;
                                  } else {
                                    if (586 + le.field_e.field_u > kc.field_u) {
                                      ll.field_d = eh.field_k;
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (param1) {
                        L26: {
                          of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                          if (!of.field_c.c((byte) 49)) {
                            break L26;
                          } else {
                            if (of.field_c.field_j == 0) {
                              return 3;
                            } else {
                              if (1 != of.field_c.field_j) {
                                break L26;
                              } else {
                                return 2;
                              }
                            }
                          }
                        }
                        L27: while (true) {
                          if (kj.e((byte) -44)) {
                            L28: {
                              of.field_c.a(0, 0);
                              if (of.field_c.c((byte) 79)) {
                                if (-1 == (of.field_c.field_j ^ -1)) {
                                  return 3;
                                } else {
                                  if (1 == of.field_c.field_j) {
                                    return 1;
                                  } else {
                                    break L28;
                                  }
                                }
                              } else {
                                break L28;
                              }
                            }
                            if (13 == b.field_J) {
                              return 1;
                            } else {
                              continue L27;
                            }
                          } else {
                            return 0;
                          }
                        }
                      } else {
                        return 0;
                      }
                    } else {
                      ll.field_d = ll.field_d - eh.field_m;
                      if (ll.field_d > eh.field_k) {
                        bh.field_r = true;
                        break L3;
                      } else {
                        L29: {
                          if (le.field_e == null) {
                            break L29;
                          } else {
                            L30: {
                              var3 = -(le.field_e.field_v / 2) + 357;
                              var4 = 0;
                              if (vb.field_n == 0) {
                                break L30;
                              } else {
                                if (var3 >= ci.field_m) {
                                  break L30;
                                } else {
                                  if (le.field_e.field_x + var3 <= ci.field_m) {
                                    break L30;
                                  } else {
                                    L31: {
                                      if (field_a <= 269 - le.field_e.field_u) {
                                        break L31;
                                      } else {
                                        if (field_a >= 269) {
                                          break L31;
                                        } else {
                                          bh.field_r = false;
                                          var4 = 1;
                                          ll.field_d = eh.field_m;
                                          break L31;
                                        }
                                      }
                                    }
                                    if (586 >= field_a) {
                                      break L30;
                                    } else {
                                      if (586 + le.field_e.field_u <= field_a) {
                                        break L30;
                                      } else {
                                        var4 = 1;
                                        bh.field_r = true;
                                        ll.field_d = eh.field_m;
                                        break L30;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (var4 != 0) {
                              break L29;
                            } else {
                              if (ll.field_d <= eh.field_k) {
                                break L29;
                              } else {
                                if (ph.field_d <= var3) {
                                  break L29;
                                } else {
                                  if (ph.field_d >= var3 - -le.field_e.field_x) {
                                    break L29;
                                  } else {
                                    L32: {
                                      if (-le.field_e.field_u + 269 >= kc.field_u) {
                                        break L32;
                                      } else {
                                        if (269 > kc.field_u) {
                                          ll.field_d = eh.field_k;
                                          break L32;
                                        } else {
                                          L33: {
                                            if (kc.field_u <= 586) {
                                              break L33;
                                            } else {
                                              if (586 + le.field_e.field_u > kc.field_u) {
                                                ll.field_d = eh.field_k;
                                                break L33;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                          if (param1) {
                                            L34: {
                                              of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                                              if (!of.field_c.c((byte) 49)) {
                                                break L34;
                                              } else {
                                                if (of.field_c.field_j == 0) {
                                                  return 3;
                                                } else {
                                                  if (1 != of.field_c.field_j) {
                                                    break L34;
                                                  } else {
                                                    return 2;
                                                  }
                                                }
                                              }
                                            }
                                            L35: while (true) {
                                              if (kj.e((byte) -44)) {
                                                L36: {
                                                  of.field_c.a(0, 0);
                                                  if (of.field_c.c((byte) 79)) {
                                                    if (-1 == (of.field_c.field_j ^ -1)) {
                                                      return 3;
                                                    } else {
                                                      if (1 == of.field_c.field_j) {
                                                        return 1;
                                                      } else {
                                                        break L36;
                                                      }
                                                    }
                                                  } else {
                                                    break L36;
                                                  }
                                                }
                                                if (13 == b.field_J) {
                                                  return 1;
                                                } else {
                                                  continue L35;
                                                }
                                              } else {
                                                return 0;
                                              }
                                            }
                                          } else {
                                            return 0;
                                          }
                                        }
                                      }
                                    }
                                    if (kc.field_u <= 586) {
                                      break L29;
                                    } else {
                                      if (586 + le.field_e.field_u > kc.field_u) {
                                        ll.field_d = eh.field_k;
                                        break L29;
                                      } else {
                                        if (param1) {
                                          L37: {
                                            of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                                            if (!of.field_c.c((byte) 49)) {
                                              break L37;
                                            } else {
                                              if (of.field_c.field_j == 0) {
                                                return 3;
                                              } else {
                                                if (1 != of.field_c.field_j) {
                                                  break L37;
                                                } else {
                                                  return 2;
                                                }
                                              }
                                            }
                                          }
                                          L38: while (true) {
                                            if (kj.e((byte) -44)) {
                                              L39: {
                                                of.field_c.a(0, 0);
                                                if (of.field_c.c((byte) 79)) {
                                                  if (-1 == (of.field_c.field_j ^ -1)) {
                                                    return 3;
                                                  } else {
                                                    if (1 == of.field_c.field_j) {
                                                      return 1;
                                                    } else {
                                                      break L39;
                                                    }
                                                  }
                                                } else {
                                                  break L39;
                                                }
                                              }
                                              if (13 == b.field_J) {
                                                return 1;
                                              } else {
                                                continue L38;
                                              }
                                            } else {
                                              return 0;
                                            }
                                          }
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
                        }
                        L40: {
                          if (!param1) {
                            break L40;
                          } else {
                            L41: {
                              of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                              if (!of.field_c.c((byte) 49)) {
                                break L41;
                              } else {
                                if (of.field_c.field_j == 0) {
                                  return 3;
                                } else {
                                  if (1 != of.field_c.field_j) {
                                    break L41;
                                  } else {
                                    return 2;
                                  }
                                }
                              }
                            }
                            L42: while (true) {
                              if (!kj.e((byte) -44)) {
                                break L40;
                              } else {
                                L43: {
                                  of.field_c.a(0, 0);
                                  if (of.field_c.c((byte) 79)) {
                                    if (-1 == (of.field_c.field_j ^ -1)) {
                                      return 3;
                                    } else {
                                      if (1 == of.field_c.field_j) {
                                        return 1;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  } else {
                                    break L43;
                                  }
                                }
                                if (13 == b.field_J) {
                                  return 1;
                                } else {
                                  continue L42;
                                }
                              }
                            }
                          }
                        }
                        return 0;
                      }
                    }
                  }
                } else {
                  if (ll.field_d > eh.field_k) {
                    L44: {
                      bh.field_r = true;
                      if (le.field_e == null) {
                        break L44;
                      } else {
                        L45: {
                          var3 = -(le.field_e.field_v / 2) + 357;
                          var4 = 0;
                          if (vb.field_n == 0) {
                            break L45;
                          } else {
                            if (var3 >= ci.field_m) {
                              break L45;
                            } else {
                              if (le.field_e.field_x + var3 <= ci.field_m) {
                                break L45;
                              } else {
                                L46: {
                                  if (field_a <= 269 - le.field_e.field_u) {
                                    break L46;
                                  } else {
                                    if (field_a >= 269) {
                                      break L46;
                                    } else {
                                      bh.field_r = false;
                                      var4 = 1;
                                      ll.field_d = eh.field_m;
                                      break L46;
                                    }
                                  }
                                }
                                if (586 >= field_a) {
                                  break L45;
                                } else {
                                  if (586 + le.field_e.field_u <= field_a) {
                                    break L45;
                                  } else {
                                    var4 = 1;
                                    bh.field_r = true;
                                    ll.field_d = eh.field_m;
                                    break L45;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (var4 != 0) {
                          break L44;
                        } else {
                          if (ll.field_d <= eh.field_k) {
                            break L44;
                          } else {
                            if (ph.field_d <= var3) {
                              break L44;
                            } else {
                              if (ph.field_d >= var3 - -le.field_e.field_x) {
                                break L44;
                              } else {
                                L47: {
                                  if (-le.field_e.field_u + 269 >= kc.field_u) {
                                    break L47;
                                  } else {
                                    if (269 > kc.field_u) {
                                      ll.field_d = eh.field_k;
                                      break L47;
                                    } else {
                                      L48: {
                                        if (kc.field_u <= 586) {
                                          break L48;
                                        } else {
                                          if (586 + le.field_e.field_u > kc.field_u) {
                                            ll.field_d = eh.field_k;
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                      if (param1) {
                                        L49: {
                                          of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                                          if (!of.field_c.c((byte) 49)) {
                                            break L49;
                                          } else {
                                            if (of.field_c.field_j == 0) {
                                              return 3;
                                            } else {
                                              if (1 != of.field_c.field_j) {
                                                break L49;
                                              } else {
                                                return 2;
                                              }
                                            }
                                          }
                                        }
                                        L50: while (true) {
                                          if (kj.e((byte) -44)) {
                                            L51: {
                                              of.field_c.a(0, 0);
                                              if (of.field_c.c((byte) 79)) {
                                                if (-1 == (of.field_c.field_j ^ -1)) {
                                                  return 3;
                                                } else {
                                                  if (1 == of.field_c.field_j) {
                                                    return 1;
                                                  } else {
                                                    break L51;
                                                  }
                                                }
                                              } else {
                                                break L51;
                                              }
                                            }
                                            if (13 == b.field_J) {
                                              return 1;
                                            } else {
                                              continue L50;
                                            }
                                          } else {
                                            return 0;
                                          }
                                        }
                                      } else {
                                        return 0;
                                      }
                                    }
                                  }
                                }
                                if (kc.field_u <= 586) {
                                  break L44;
                                } else {
                                  if (586 + le.field_e.field_u > kc.field_u) {
                                    ll.field_d = eh.field_k;
                                    break L44;
                                  } else {
                                    if (param1) {
                                      L52: {
                                        of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                                        if (!of.field_c.c((byte) 49)) {
                                          break L52;
                                        } else {
                                          if (of.field_c.field_j == 0) {
                                            return 3;
                                          } else {
                                            if (1 != of.field_c.field_j) {
                                              break L52;
                                            } else {
                                              return 2;
                                            }
                                          }
                                        }
                                      }
                                      L53: while (true) {
                                        if (kj.e((byte) -44)) {
                                          L54: {
                                            of.field_c.a(0, 0);
                                            if (of.field_c.c((byte) 79)) {
                                              if (-1 == (of.field_c.field_j ^ -1)) {
                                                return 3;
                                              } else {
                                                if (1 == of.field_c.field_j) {
                                                  return 1;
                                                } else {
                                                  break L54;
                                                }
                                              }
                                            } else {
                                              break L54;
                                            }
                                          }
                                          if (13 == b.field_J) {
                                            return 1;
                                          } else {
                                            continue L53;
                                          }
                                        } else {
                                          return 0;
                                        }
                                      }
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
                    }
                    if (param1) {
                      L55: {
                        of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                        if (!of.field_c.c((byte) 49)) {
                          break L55;
                        } else {
                          if (of.field_c.field_j == 0) {
                            return 3;
                          } else {
                            if (1 != of.field_c.field_j) {
                              break L55;
                            } else {
                              return 2;
                            }
                          }
                        }
                      }
                      L56: while (true) {
                        if (kj.e((byte) -44)) {
                          L57: {
                            of.field_c.a(0, 0);
                            if (of.field_c.c((byte) 79)) {
                              if (-1 == (of.field_c.field_j ^ -1)) {
                                return 3;
                              } else {
                                if (1 == of.field_c.field_j) {
                                  return 1;
                                } else {
                                  break L57;
                                }
                              }
                            } else {
                              break L57;
                            }
                          }
                          if (13 == b.field_J) {
                            return 1;
                          } else {
                            continue L56;
                          }
                        } else {
                          return 0;
                        }
                      }
                    } else {
                      return 0;
                    }
                  } else {
                    L58: {
                      if (le.field_e == null) {
                        break L58;
                      } else {
                        L59: {
                          var3 = -(le.field_e.field_v / 2) + 357;
                          var4 = 0;
                          if (vb.field_n == 0) {
                            break L59;
                          } else {
                            if (var3 >= ci.field_m) {
                              break L59;
                            } else {
                              if (le.field_e.field_x + var3 <= ci.field_m) {
                                break L59;
                              } else {
                                L60: {
                                  if (field_a <= 269 - le.field_e.field_u) {
                                    break L60;
                                  } else {
                                    if (field_a >= 269) {
                                      break L60;
                                    } else {
                                      bh.field_r = false;
                                      var4 = 1;
                                      ll.field_d = eh.field_m;
                                      break L60;
                                    }
                                  }
                                }
                                if (586 >= field_a) {
                                  break L59;
                                } else {
                                  if (586 + le.field_e.field_u <= field_a) {
                                    break L59;
                                  } else {
                                    var4 = 1;
                                    bh.field_r = true;
                                    ll.field_d = eh.field_m;
                                    break L59;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (var4 != 0) {
                          break L58;
                        } else {
                          if (ll.field_d <= eh.field_k) {
                            break L58;
                          } else {
                            if (ph.field_d <= var3) {
                              break L58;
                            } else {
                              if (ph.field_d >= var3 - -le.field_e.field_x) {
                                break L58;
                              } else {
                                L61: {
                                  if (-le.field_e.field_u + 269 >= kc.field_u) {
                                    break L61;
                                  } else {
                                    if (269 > kc.field_u) {
                                      ll.field_d = eh.field_k;
                                      break L61;
                                    } else {
                                      break L61;
                                    }
                                  }
                                }
                                if (kc.field_u <= 586) {
                                  break L58;
                                } else {
                                  if (586 + le.field_e.field_u > kc.field_u) {
                                    ll.field_d = eh.field_k;
                                    break L58;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param1) {
                      L62: {
                        of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                        if (!of.field_c.c((byte) 49)) {
                          break L62;
                        } else {
                          if (of.field_c.field_j == 0) {
                            return 3;
                          } else {
                            if (1 != of.field_c.field_j) {
                              break L62;
                            } else {
                              return 2;
                            }
                          }
                        }
                      }
                      L63: while (true) {
                        if (kj.e((byte) -44)) {
                          L64: {
                            of.field_c.a(0, 0);
                            if (of.field_c.c((byte) 79)) {
                              if (-1 == (of.field_c.field_j ^ -1)) {
                                return 3;
                              } else {
                                if (1 == of.field_c.field_j) {
                                  return 1;
                                } else {
                                  break L64;
                                }
                              }
                            } else {
                              break L64;
                            }
                          }
                          if (13 == b.field_J) {
                            return 1;
                          } else {
                            continue L63;
                          }
                        } else {
                          return 0;
                        }
                      }
                    } else {
                      return 0;
                    }
                  }
                }
              }
            }
            L65: {
              if (le.field_e == null) {
                break L65;
              } else {
                L66: {
                  var3 = -(le.field_e.field_v / 2) + 357;
                  var4 = 0;
                  if (vb.field_n == 0) {
                    break L66;
                  } else {
                    if (var3 >= ci.field_m) {
                      break L66;
                    } else {
                      if (le.field_e.field_x + var3 <= ci.field_m) {
                        break L66;
                      } else {
                        L67: {
                          if (field_a <= 269 - le.field_e.field_u) {
                            break L67;
                          } else {
                            if (field_a >= 269) {
                              break L67;
                            } else {
                              bh.field_r = false;
                              var4 = 1;
                              ll.field_d = eh.field_m;
                              break L67;
                            }
                          }
                        }
                        if (586 >= field_a) {
                          break L66;
                        } else {
                          if (586 + le.field_e.field_u <= field_a) {
                            break L66;
                          } else {
                            var4 = 1;
                            bh.field_r = true;
                            ll.field_d = eh.field_m;
                            break L66;
                          }
                        }
                      }
                    }
                  }
                }
                if (var4 != 0) {
                  break L65;
                } else {
                  if (ll.field_d <= eh.field_k) {
                    break L65;
                  } else {
                    if (ph.field_d <= var3) {
                      break L65;
                    } else {
                      if (ph.field_d >= var3 - -le.field_e.field_x) {
                        break L65;
                      } else {
                        L68: {
                          if (-le.field_e.field_u + 269 >= kc.field_u) {
                            break L68;
                          } else {
                            if (269 > kc.field_u) {
                              ll.field_d = eh.field_k;
                              break L68;
                            } else {
                              L69: {
                                if (kc.field_u <= 586) {
                                  break L69;
                                } else {
                                  if (586 + le.field_e.field_u > kc.field_u) {
                                    ll.field_d = eh.field_k;
                                    break L69;
                                  } else {
                                    L70: {
                                      if (!param1) {
                                        break L70;
                                      } else {
                                        L71: {
                                          of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                                          if (!of.field_c.c((byte) 49)) {
                                            break L71;
                                          } else {
                                            if (of.field_c.field_j == 0) {
                                              return 3;
                                            } else {
                                              if (1 != of.field_c.field_j) {
                                                break L71;
                                              } else {
                                                return 2;
                                              }
                                            }
                                          }
                                        }
                                        L72: while (true) {
                                          if (!kj.e((byte) -44)) {
                                            break L70;
                                          } else {
                                            L73: {
                                              of.field_c.a(0, 0);
                                              if (of.field_c.c((byte) 79)) {
                                                if (-1 == (of.field_c.field_j ^ -1)) {
                                                  return 3;
                                                } else {
                                                  if (1 == of.field_c.field_j) {
                                                    return 1;
                                                  } else {
                                                    break L73;
                                                  }
                                                }
                                              } else {
                                                break L73;
                                              }
                                            }
                                            if (13 == b.field_J) {
                                              return 1;
                                            } else {
                                              continue L72;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    return 0;
                                  }
                                }
                              }
                              L74: {
                                if (!param1) {
                                  break L74;
                                } else {
                                  L75: {
                                    of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                                    if (!of.field_c.c((byte) 49)) {
                                      break L75;
                                    } else {
                                      if (of.field_c.field_j == 0) {
                                        return 3;
                                      } else {
                                        if (1 != of.field_c.field_j) {
                                          break L75;
                                        } else {
                                          return 2;
                                        }
                                      }
                                    }
                                  }
                                  L76: while (true) {
                                    if (!kj.e((byte) -44)) {
                                      break L74;
                                    } else {
                                      L77: {
                                        of.field_c.a(0, 0);
                                        if (of.field_c.c((byte) 79)) {
                                          if (-1 == (of.field_c.field_j ^ -1)) {
                                            return 3;
                                          } else {
                                            if (1 == of.field_c.field_j) {
                                              return 1;
                                            } else {
                                              break L77;
                                            }
                                          }
                                        } else {
                                          break L77;
                                        }
                                      }
                                      if (13 == b.field_J) {
                                        return 1;
                                      } else {
                                        continue L76;
                                      }
                                    }
                                  }
                                }
                              }
                              return 0;
                            }
                          }
                        }
                        if (kc.field_u <= 586) {
                          break L65;
                        } else {
                          if (586 + le.field_e.field_u > kc.field_u) {
                            ll.field_d = eh.field_k;
                            break L65;
                          } else {
                            L78: {
                              if (!param1) {
                                break L78;
                              } else {
                                L79: {
                                  of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                                  if (!of.field_c.c((byte) 49)) {
                                    break L79;
                                  } else {
                                    if (of.field_c.field_j == 0) {
                                      return 3;
                                    } else {
                                      if (1 != of.field_c.field_j) {
                                        break L79;
                                      } else {
                                        return 2;
                                      }
                                    }
                                  }
                                }
                                L80: while (true) {
                                  if (!kj.e((byte) -44)) {
                                    break L78;
                                  } else {
                                    L81: {
                                      of.field_c.a(0, 0);
                                      if (of.field_c.c((byte) 79)) {
                                        if (-1 == (of.field_c.field_j ^ -1)) {
                                          return 3;
                                        } else {
                                          if (1 == of.field_c.field_j) {
                                            return 1;
                                          } else {
                                            break L81;
                                          }
                                        }
                                      } else {
                                        break L81;
                                      }
                                    }
                                    if (13 == b.field_J) {
                                      return 1;
                                    } else {
                                      continue L80;
                                    }
                                  }
                                }
                              }
                            }
                            return 0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L82: {
              if (!param1) {
                break L82;
              } else {
                L83: {
                  of.field_c.a((byte) 34, pf.a(ph.field_d, -19503, kc.field_u), pf.a(ci.field_m, -19503, field_a));
                  if (!of.field_c.c((byte) 49)) {
                    break L83;
                  } else {
                    if (of.field_c.field_j == 0) {
                      return 3;
                    } else {
                      if (1 != of.field_c.field_j) {
                        break L83;
                      } else {
                        return 2;
                      }
                    }
                  }
                }
                L84: while (true) {
                  if (!kj.e((byte) -44)) {
                    break L82;
                  } else {
                    L85: {
                      of.field_c.a(0, 0);
                      if (of.field_c.c((byte) 79)) {
                        if (-1 == (of.field_c.field_j ^ -1)) {
                          return 3;
                        } else {
                          if (1 == of.field_c.field_j) {
                            return 1;
                          } else {
                            break L85;
                          }
                        }
                      } else {
                        break L85;
                      }
                    }
                    if (13 == b.field_J) {
                      return 1;
                    } else {
                      continue L84;
                    }
                  }
                }
              }
            }
            return 0;
          } else {
            ub.field_h = ub.field_h + 1;
            kk.field_i = kk.field_i - eh.field_o;
            continue L1;
          }
        }
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
