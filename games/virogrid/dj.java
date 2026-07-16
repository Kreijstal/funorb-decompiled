/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static e field_h;
    private String field_m;
    static nh field_l;
    private int field_j;
    private int[] field_k;
    static int field_c;
    private long field_i;
    int field_b;
    static int field_n;
    static ml[] field_f;
    ga field_a;
    String field_g;
    km field_d;
    static int field_e;

    private final boolean b(int param0, int param1, int param2) {
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (8 == param1) {
          na.a(((dj) this).field_i, ((dj) this).field_g, param0 + -18);
          if (param0 != 17) {
            ((dj) this).field_j = 125;
            return true;
          } else {
            return true;
          }
        } else {
          if (param1 != 18) {
            if ((param1 ^ -1) != -12) {
              if (12 == param1) {
                sd.a(1, param2, ((dj) this).field_j, (byte) 64);
                if (param0 != 17) {
                  ((dj) this).field_j = 125;
                  return true;
                } else {
                  return true;
                }
              } else {
                if ((param1 ^ -1) != -14) {
                  if (param1 != 14) {
                    if (-21 != (param1 ^ -1)) {
                      if ((param1 ^ -1) == -20) {
                        boolean discarded$1 = ul.a(((dj) this).field_i, ((dj) this).field_j, -22557, ((dj) this).field_g, ((dj) this).field_k);
                        if (param0 != 17) {
                          ((dj) this).field_j = 125;
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      tf.a((byte) 85);
                      if (param0 == 17) {
                        return true;
                      } else {
                        ((dj) this).field_j = 125;
                        return true;
                      }
                    }
                  } else {
                    g.a(param0 ^ 14001);
                    if (param0 == 17) {
                      return true;
                    } else {
                      ((dj) this).field_j = 125;
                      return true;
                    }
                  }
                } else {
                  sd.a(2, param2, ((dj) this).field_j, (byte) 84);
                  if (param0 != 17) {
                    ((dj) this).field_j = 125;
                    return true;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              sd.a(0, param2, ((dj) this).field_j, (byte) 114);
              if (param0 != 17) {
                ((dj) this).field_j = 125;
                return true;
              } else {
                return true;
              }
            }
          } else {
            qm.a(-94, ((dj) this).field_g, ((dj) this).field_i);
            if (param0 == 17) {
              return true;
            } else {
              ((dj) this).field_j = 125;
              return true;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, boolean param3, byte param4) {
        int var6 = 0;
        var6 = ((dj) this).field_a.b(param3, (byte) -89);
        if (param4 == 95) {
          if ((var6 ^ -1) == 1) {
            return false;
          } else {
            boolean discarded$8 = this.a(var6, param1, param4 + -98);
            boolean discarded$9 = this.a(param2, var6, false);
            boolean discarded$10 = this.b(param4 ^ 78, var6, param2);
            boolean discarded$11 = this.c(param0, var6, param4 ^ -29);
            return true;
          }
        } else {
          dj.a(-90, true, -128, -63, -5);
          if ((var6 ^ -1) == 1) {
            return false;
          } else {
            boolean discarded$12 = this.a(var6, param1, param4 + -98);
            boolean discarded$13 = this.a(param2, var6, false);
            boolean discarded$14 = this.b(param4 ^ 78, var6, param2);
            boolean discarded$15 = this.c(param0, var6, param4 ^ -29);
            return true;
          }
        }
    }

    final void a(byte param0, boolean param1) {
        ((dj) this).field_a.a(param1, 24960);
        if (param0 > -16) {
            field_e = 9;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        da var4 = null;
        tm var5 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        var4 = (da) (Object) aj.field_m.a((byte) -100);
        L0: while (true) {
          if (var4 == null) {
            if (param0 == 2) {
              var5 = (tm) (Object) bj.field_o.a((byte) -82);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  wc.a(var5, (byte) 110, param1);
                  var5 = (tm) (Object) bj.field_o.a(16213);
                  continue L1;
                }
              }
            } else {
              dj.a(false);
              var5 = (tm) (Object) bj.field_o.a((byte) -82);
              L2: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  wc.a(var5, (byte) 110, param1);
                  var5 = (tm) (Object) bj.field_o.a(16213);
                  continue L2;
                }
              }
            }
          } else {
            ha.a(param1, var4, (byte) -38);
            var4 = (da) (Object) aj.field_m.a(param0 + 16211);
            continue L0;
          }
        }
    }

    final void a(int param0, int[] param1, int param2) {
        String var4 = null;
        gh var5 = null;
        int var6 = 0;
        String var7 = null;
        if (param0 == 4) {
          if (null != ((dj) this).field_g) {
            if (((dj) this).field_i != hh.field_d) {
              if (oa.field_q == 2) {
                L0: {
                  var7 = this.a(1);
                  var4 = var7;
                  var5 = j.a(param0 ^ 4, ((dj) this).field_g);
                  var6 = fm.a(((dj) this).field_g, -1369854352) ? 1 : 0;
                  if (var5 != null) {
                    break L0;
                  } else {
                    if (var6 != 0) {
                      break L0;
                    } else {
                      ((dj) this).field_a.a(1, oi.a(new String[1], vj.field_a, 2), 4);
                      ((dj) this).field_a.a(1, oi.a(new String[1], og.field_a, 2), 6);
                      if (param1 == null) {
                        break L0;
                      } else {
                        if (param2 == 2) {
                          break L0;
                        } else {
                          if (wg.field_f) {
                            break L0;
                          } else {
                            ((dj) this).field_k = param1;
                            ((dj) this).field_a.a(1, oi.a(new String[1], bm.field_o, 2), 19);
                            if (var5 != null) {
                              if (!dd.a(((dj) this).field_g, false)) {
                                if (!wg.field_f) {
                                  L1: {
                                    if (!dh.field_n) {
                                      ((dj) this).field_a.a(1, oi.a(new String[1], ha.field_d, 2), 8);
                                      break L1;
                                    } else {
                                      break L1;
                                    }
                                  }
                                  ((dj) this).field_a.a(1, oi.a(new String[1], og.field_c, 2), 18);
                                  if (param1 == null) {
                                    ((dj) this).field_a.a(1, oi.a(new String[1], nb.field_o, param0 + -2), 5);
                                    return;
                                  } else {
                                    L2: {
                                      ((dj) this).field_k = param1;
                                      ((dj) this).field_a.a(1, oi.a(new String[1], bm.field_o, param0 ^ 6), 19);
                                      ((dj) this).field_a.a(1, oi.a(new String[1], nb.field_o, param0 + -2), 5);
                                      if (var6 != 0) {
                                        ((dj) this).field_a.a(param0 ^ 5, oi.a(new String[1], hd.field_a, 2), 7);
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    }
                                    return;
                                  }
                                } else {
                                  ((dj) this).field_a.a(1, oi.a(new String[1], nb.field_o, param0 + -2), 5);
                                  return;
                                }
                              } else {
                                ((dj) this).field_a.a(1, oi.a(new String[1], nb.field_o, param0 + -2), 5);
                                return;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L3: {
                  if (var5 == null) {
                    break L3;
                  } else {
                    L4: {
                      if (dd.a(((dj) this).field_g, false)) {
                        break L4;
                      } else {
                        if (wg.field_f) {
                          break L4;
                        } else {
                          L5: {
                            if (!dh.field_n) {
                              ((dj) this).field_a.a(1, oi.a(new String[1], ha.field_d, 2), 8);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((dj) this).field_a.a(1, oi.a(new String[1], og.field_c, 2), 18);
                          if (param1 != null) {
                            ((dj) this).field_k = param1;
                            ((dj) this).field_a.a(1, oi.a(new String[1], bm.field_o, param0 ^ 6), 19);
                            break L4;
                          } else {
                            L6: {
                              ((dj) this).field_a.a(1, oi.a(new String[1], nb.field_o, param0 + -2), 5);
                              if (var6 != 0) {
                                ((dj) this).field_a.a(param0 ^ 5, oi.a(new String[1], hd.field_a, 2), 7);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                    ((dj) this).field_a.a(1, oi.a(new String[1], nb.field_o, param0 + -2), 5);
                    break L3;
                  }
                }
                if (var6 != 0) {
                  ((dj) this).field_a.a(param0 ^ 5, oi.a(new String[1], hd.field_a, 2), 7);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if ((param2 ^ -1) == -3) {
                if (oa.field_q == 2) {
                  L7: {
                    var7 = this.a(1);
                    var4 = var7;
                    var5 = j.a(param0 ^ 4, ((dj) this).field_g);
                    var6 = fm.a(((dj) this).field_g, -1369854352) ? 1 : 0;
                    if (var5 != null) {
                      break L7;
                    } else {
                      if (var6 != 0) {
                        break L7;
                      } else {
                        ((dj) this).field_a.a(1, oi.a(new String[1], vj.field_a, 2), 4);
                        ((dj) this).field_a.a(1, oi.a(new String[1], og.field_a, 2), 6);
                        if (param1 == null) {
                          break L7;
                        } else {
                          if (param2 == 2) {
                            break L7;
                          } else {
                            if (wg.field_f) {
                              break L7;
                            } else {
                              L8: {
                                ((dj) this).field_k = param1;
                                ((dj) this).field_a.a(1, oi.a(new String[1], bm.field_o, 2), 19);
                                if (var5 == null) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (dd.a(((dj) this).field_g, false)) {
                                      break L9;
                                    } else {
                                      if (wg.field_f) {
                                        break L9;
                                      } else {
                                        L10: {
                                          if (!dh.field_n) {
                                            ((dj) this).field_a.a(1, oi.a(new String[1], ha.field_d, 2), 8);
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                        ((dj) this).field_a.a(1, oi.a(new String[1], og.field_c, 2), 18);
                                        if (param1 != null) {
                                          ((dj) this).field_k = param1;
                                          ((dj) this).field_a.a(1, oi.a(new String[1], bm.field_o, param0 ^ 6), 19);
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                  ((dj) this).field_a.a(1, oi.a(new String[1], nb.field_o, param0 + -2), 5);
                                  break L8;
                                }
                              }
                              L11: {
                                if (var6 != 0) {
                                  ((dj) this).field_a.a(param0 ^ 5, oi.a(new String[1], hd.field_a, 2), 7);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    if (var5 == null) {
                      break L12;
                    } else {
                      L13: {
                        if (dd.a(((dj) this).field_g, false)) {
                          break L13;
                        } else {
                          if (wg.field_f) {
                            break L13;
                          } else {
                            L14: {
                              if (!dh.field_n) {
                                ((dj) this).field_a.a(1, oi.a(new String[1], ha.field_d, 2), 8);
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            ((dj) this).field_a.a(1, oi.a(new String[1], og.field_c, 2), 18);
                            if (param1 != null) {
                              ((dj) this).field_k = param1;
                              ((dj) this).field_a.a(1, oi.a(new String[1], bm.field_o, param0 ^ 6), 19);
                              break L13;
                            } else {
                              L15: {
                                ((dj) this).field_a.a(1, oi.a(new String[1], nb.field_o, param0 + -2), 5);
                                if (var6 != 0) {
                                  ((dj) this).field_a.a(param0 ^ 5, oi.a(new String[1], hd.field_a, 2), 7);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                      ((dj) this).field_a.a(1, oi.a(new String[1], nb.field_o, param0 + -2), 5);
                      break L12;
                    }
                  }
                  if (var6 == 0) {
                    return;
                  } else {
                    ((dj) this).field_a.a(param0 ^ 5, oi.a(new String[1], hd.field_a, 2), 7);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          ((dj) this).field_k = null;
          if (null != ((dj) this).field_g) {
            L16: {
              if (((dj) this).field_i != hh.field_d) {
                break L16;
              } else {
                if ((param2 ^ -1) == -3) {
                  break L16;
                } else {
                  return;
                }
              }
            }
            if (oa.field_q == 2) {
              L17: {
                var7 = this.a(1);
                var4 = var7;
                var5 = j.a(param0 ^ 4, ((dj) this).field_g);
                var6 = fm.a(((dj) this).field_g, -1369854352) ? 1 : 0;
                if (var5 != null) {
                  break L17;
                } else {
                  if (var6 != 0) {
                    break L17;
                  } else {
                    ((dj) this).field_a.a(1, oi.a(new String[1], vj.field_a, 2), 4);
                    ((dj) this).field_a.a(1, oi.a(new String[1], og.field_a, 2), 6);
                    if (param1 == null) {
                      break L17;
                    } else {
                      if (param2 == 2) {
                        break L17;
                      } else {
                        if (wg.field_f) {
                          break L17;
                        } else {
                          ((dj) this).field_k = param1;
                          ((dj) this).field_a.a(1, oi.a(new String[1], bm.field_o, 2), 19);
                          break L17;
                        }
                      }
                    }
                  }
                }
              }
              L18: {
                if (var5 == null) {
                  break L18;
                } else {
                  L19: {
                    if (dd.a(((dj) this).field_g, false)) {
                      break L19;
                    } else {
                      if (wg.field_f) {
                        break L19;
                      } else {
                        L20: {
                          if (!dh.field_n) {
                            ((dj) this).field_a.a(1, oi.a(new String[1], ha.field_d, 2), 8);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        ((dj) this).field_a.a(1, oi.a(new String[1], og.field_c, 2), 18);
                        if (param1 != null) {
                          ((dj) this).field_k = param1;
                          ((dj) this).field_a.a(1, oi.a(new String[1], bm.field_o, param0 ^ 6), 19);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  ((dj) this).field_a.a(1, oi.a(new String[1], nb.field_o, param0 + -2), 5);
                  break L18;
                }
              }
              if (var6 == 0) {
                return;
              } else {
                ((dj) this).field_a.a(param0 ^ 5, oi.a(new String[1], hd.field_a, 2), 7);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4 = 0;
        var4 = -35 / ((23 - param2) / 37);
        if (param1 == 17) {
          km.field_yb = new bg(((dj) this).field_d.field_Bb, ((dj) this).field_d.field_J, ((dj) this).field_d.field_K, ((dj) this).field_d.field_ub, param0, fn.field_e, wh.field_a, eb.field_b, ti.field_h, vd.field_Z, ma.field_e, ((dj) this).field_g, ((dj) this).field_i);
          return true;
        } else {
          return false;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        ic stackIn_7_0 = null;
        ic stackIn_8_0 = null;
        ic stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ic stackIn_11_0 = null;
        ic stackIn_12_0 = null;
        ic stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ic stackIn_21_0 = null;
        ic stackIn_22_0 = null;
        ic stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        ic stackIn_28_0 = null;
        ic stackIn_29_0 = null;
        ic stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        oi stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        oi stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        oi stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        oi stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        oi stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        oi stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        ic stackOut_27_0 = null;
        ic stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        ic stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        ic stackOut_20_0 = null;
        ic stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        ic stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        ic stackOut_10_0 = null;
        ic stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        ic stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ic stackOut_6_0 = null;
        ic stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ic stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          var6 = Virogrid.field_F ? 1 : 0;
          bf.a(0, 25928, c.field_d);
          if (!ke.field_p.field_d) {
            bf.a(0, 25928, we.field_e);
            break L0;
          } else {
            break L0;
          }
        }
        if (param4 != -1) {
          if (-2 != param4) {
            L1: {
              pj.a(c.field_d, param3 ^ 259);
              stackOut_36_0 = al.field_j[param4];
              stackOut_36_1 = param0;
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              if (ke.field_p.field_d) {
                stackOut_38_0 = (oi) (Object) stackIn_38_0;
                stackOut_38_1 = stackIn_38_1;
                stackOut_38_2 = 0;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                stackIn_39_2 = stackOut_38_2;
                break L1;
              } else {
                stackOut_37_0 = (oi) (Object) stackIn_37_0;
                stackOut_37_1 = stackIn_37_1;
                stackOut_37_2 = 2;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_39_2 = stackOut_37_2;
                break L1;
              }
            }
            ((oi) (Object) stackIn_39_0).b(stackIn_39_1, stackIn_39_2, -116);
            if (param2 == -1) {
              ul.b((byte) 86);
              if (param3 != 3) {
                field_l = null;
                return;
              } else {
                return;
              }
            } else {
              ff.a(param2, 0, ff.field_a);
              ul.b((byte) 86);
              if (param3 != 3) {
                field_l = null;
                return;
              } else {
                return;
              }
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          if (vg.field_I == null) {
            if (ei.field_b != null) {
              if (ke.field_p.field_d) {
                L2: {
                  stackOut_27_0 = ei.field_b;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (0.0 <= nk.field_K[11]) {
                    stackOut_29_0 = (ic) (Object) stackIn_29_0;
                    stackOut_29_1 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    break L2;
                  } else {
                    stackOut_28_0 = (ic) (Object) stackIn_28_0;
                    stackOut_28_1 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    break L2;
                  }
                }
                ((ic) (Object) stackIn_30_0).a(stackIn_30_1 != 0, param3 ^ 92, c.field_d);
                if (param3 != 3) {
                  field_l = null;
                  return;
                } else {
                  return;
                }
              } else {
                L3: {
                  stackOut_20_0 = ei.field_b;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (0.0 <= nk.field_K[11]) {
                    stackOut_22_0 = (ic) (Object) stackIn_22_0;
                    stackOut_22_1 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    break L3;
                  } else {
                    stackOut_21_0 = (ic) (Object) stackIn_21_0;
                    stackOut_21_1 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    break L3;
                  }
                }
                ((ic) (Object) stackIn_23_0).a(stackIn_23_1 != 0, (byte) 90, we.field_e, c.field_d);
                if (param3 == 3) {
                  return;
                } else {
                  field_l = null;
                  return;
                }
              }
            } else {
              if (param3 == 3) {
                return;
              } else {
                field_l = null;
                return;
              }
            }
          } else {
            L4: {
              if (!ke.field_p.field_d) {
                L5: {
                  stackOut_10_0 = vg.field_I;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (nk.field_K[11] >= 0.0) {
                    stackOut_12_0 = (ic) (Object) stackIn_12_0;
                    stackOut_12_1 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L5;
                  } else {
                    stackOut_11_0 = (ic) (Object) stackIn_11_0;
                    stackOut_11_1 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L5;
                  }
                }
                ((ic) (Object) stackIn_13_0).a(stackIn_13_1 != 0, (byte) 58, we.field_e, c.field_d);
                break L4;
              } else {
                L6: {
                  stackOut_6_0 = vg.field_I;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (0.0 <= nk.field_K[11]) {
                    stackOut_8_0 = (ic) (Object) stackIn_8_0;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L6;
                  } else {
                    stackOut_7_0 = (ic) (Object) stackIn_7_0;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L6;
                  }
                }
                ((ic) (Object) stackIn_9_0).a(stackIn_9_1 != 0, 85, c.field_d);
                break L4;
              }
            }
            if (param3 != 3) {
              field_l = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    private final boolean a(int param0, int param1, boolean param2) {
        Object var4 = null;
        Object var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        var4 = null;
        if (!param2) {
          if (param1 != 4) {
            if (param1 != 5) {
              if (-7 != (param1 ^ -1)) {
                if ((param1 ^ -1) != -8) {
                  return false;
                } else {
                  L0: {
                    var8 = og.a(((dj) this).field_m, param0, (byte) -106, ((dj) this).field_g);
                    if (var8 != null) {
                      var5 = null;
                      gf.a(((dj) this).field_g, 0, false, var8, 2, (String) null);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return true;
                }
              } else {
                L1: {
                  var7 = g.a(((dj) this).field_g, -128, param0);
                  if (var7 != null) {
                    var5 = null;
                    gf.a(((dj) this).field_g, 0, false, var7, 2, (String) null);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return true;
              }
            } else {
              var6 = og.a(((dj) this).field_g, true, param0);
              if (var6 == null) {
                return true;
              } else {
                var5 = null;
                gf.a(((dj) this).field_g, 0, false, var6, 2, (String) null);
                return true;
              }
            }
          } else {
            L2: {
              var9 = ab.a((byte) 73, ((dj) this).field_g, param0);
              if (var9 != null) {
                var5 = null;
                gf.a(((dj) this).field_g, 0, false, var9, 2, (String) null);
                break L2;
              } else {
                break L2;
              }
            }
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, boolean param5, boolean param6, boolean param7, boolean param8, boolean param9, int param10, int param11) {
        nl.a(param5, param11, param10, param0, param1, param7, param6, 16777215, param4, param3, param9, param8, param2 + 83, 16777215);
        if (param2 != -83) {
            dj.a(63, true, -5, 52, -122);
        }
    }

    final void a(boolean param0, byte param1) {
        lk var4 = null;
        String var5 = null;
        int var6 = 0;
        lk var7 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        if (param1 < -90) {
          if (null != ((dj) this).field_g) {
            if ((((dj) this).field_i ^ -1L) != (hh.field_d ^ -1L)) {
              if (wl.field_d != null) {
                if (k.b(1000)) {
                  var7 = db.a(((dj) this).field_i, false);
                  var4 = ic.a(((dj) this).field_i, (byte) -127);
                  var5 = this.a(1);
                  if (var4 != null) {
                    if (wl.field_d.field_kc) {
                      if (wl.field_d.field_mc < 0) {
                        return;
                      } else {
                        ((dj) this).field_a.a(1, oi.a(new String[1], fl.field_k, 2), 1);
                        return;
                      }
                    } else {
                      ((dj) this).field_a.a(1, oi.a(new String[1], fl.field_k, 2), 1);
                      return;
                    }
                  } else {
                    if (var7 != null) {
                      if (wl.field_d.field_Rb) {
                        if (wl.field_d.field_ic < wl.field_d.field_vc) {
                          if (!var7.field_Xb) {
                            if (param0) {
                              if (!var7.field_Sb) {
                                ((dj) this).field_a.a(1, oi.a(new String[1], qm.field_Hb, 2), 0);
                                return;
                              } else {
                                ((dj) this).field_a.a(1, oi.a(new String[1], rb.field_b, 2), 0);
                                ((dj) this).field_a.a(1, oi.a(new String[1], oe.field_c, 2), 1);
                                return;
                              }
                            } else {
                              ((dj) this).field_a.a(1, oi.a(new String[1], qm.field_Hb, 2), 0);
                              return;
                            }
                          } else {
                            ((dj) this).field_a.a(1, oi.a(new String[1], b.field_Cb, 2), 1);
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        String var3 = null;
        int var4 = 0;
        he var5 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        if (null == wl.field_d) {
          var5 = qd.a((byte) 123, ((dj) this).field_b);
          if (var5 != null) {
            var3 = var5.field_Qb;
            if (!var5.field_dc) {
              if (!var5.field_Ib) {
                if (!var5.field_sc) {
                  if (var5.field_Rb) {
                    if (var5.field_kc) {
                      if (!var5.field_Ib) {
                        L0: {
                          if (var5.field_sc) {
                            ((dj) this).field_a.a(1, oi.a(new String[1], tg.field_y, 2), 3);
                            break L0;
                          } else {
                            break L0;
                          }
                        }
                        var2 = 103 / ((param0 - 60) / 39);
                        return;
                      } else {
                        L1: {
                          ((dj) this).field_a.a(1, oi.a(new String[1], la.field_i, 2), 2);
                          if (var5.field_sc) {
                            ((dj) this).field_a.a(1, oi.a(new String[1], tg.field_y, 2), 3);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        var2 = 103 / ((param0 - 60) / 39);
                        return;
                      }
                    } else {
                      L2: {
                        ((dj) this).field_a.a(1, oi.a(new String[1], la.field_i, 2), 2);
                        if (var5.field_sc) {
                          ((dj) this).field_a.a(1, oi.a(new String[1], tg.field_y, 2), 3);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var2 = 103 / ((param0 - 60) / 39);
                      return;
                    }
                  } else {
                    if (!var5.field_sc) {
                      var2 = 103 / ((param0 - 60) / 39);
                      return;
                    } else {
                      ((dj) this).field_a.a(1, oi.a(new String[1], tg.field_y, 2), 3);
                      var2 = 103 / ((param0 - 60) / 39);
                      return;
                    }
                  }
                } else {
                  if (!var5.field_sc) {
                    var2 = 103 / ((param0 - 60) / 39);
                    return;
                  } else {
                    ((dj) this).field_a.a(1, oi.a(new String[1], tg.field_y, 2), 3);
                    var2 = 103 / ((param0 - 60) / 39);
                    return;
                  }
                }
              } else {
                L3: {
                  ((dj) this).field_a.a(1, oi.a(new String[1], ra.field_d, 2), 2);
                  if (var5.field_sc) {
                    ((dj) this).field_a.a(1, oi.a(new String[1], tg.field_y, 2), 3);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var2 = 103 / ((param0 - 60) / 39);
                return;
              }
            } else {
              ((dj) this).field_a.a(1, oi.a(new String[1], i.field_D, 2), 2);
              ((dj) this).field_a.a(1, oi.a(new String[1], di.field_u, 2), 3);
              var2 = 103 / ((param0 - 60) / 39);
              return;
            }
          } else {
            var2 = 103 / ((param0 - 60) / 39);
            return;
          }
        } else {
          var2 = 103 / ((param0 - 60) / 39);
          return;
        }
    }

    final void a(byte param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (null == ((dj) this).field_g) {
            break L0;
          } else {
            if (((dj) this).field_i == hh.field_d) {
              break L0;
            } else {
              var3 = this.a(1);
              var2 = var3;
              ((dj) this).field_a.a(1, oi.a(new String[1], db.field_f, 2), 17);
              break L0;
            }
          }
        }
        if (param0 >= -40) {
          dj.a(84, -6);
          return;
        } else {
          return;
        }
    }

    private final String a(int param0) {
        String var2 = null;
        L0: {
          if (((dj) this).field_m == null) {
            var2 = ((dj) this).field_g;
            break L0;
          } else {
            var2 = ((dj) this).field_m;
            break L0;
          }
        }
        if (param0 != 1) {
          field_l = null;
          return var2;
        } else {
          return var2;
        }
    }

    final boolean b(int param0) {
        if (param0 > 41) {
          if (null != ((dj) this).field_a) {
            if (!((dj) this).field_a.g(-71)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (-1 == (param0 ^ -1)) {
          rj.a(param1, false, ((dj) this).field_i);
          if (param2 == -3) {
            return true;
          } else {
            return false;
          }
        } else {
          if (-2 == (param0 ^ -1)) {
            w.a((byte) 74, ((dj) this).field_i, param1);
            if (param2 == -3) {
              return true;
            } else {
              return false;
            }
          } else {
            if ((param0 ^ -1) == -3) {
              cm.a((byte) 20, ((dj) this).field_b, param1);
              if (param2 == -3) {
                return true;
              } else {
                return false;
              }
            } else {
              if (param0 == 3) {
                nn.a(((dj) this).field_b, param1, (byte) -115);
                if (param2 == -3) {
                  return true;
                } else {
                  return false;
                }
              } else {
                if (param0 == 10) {
                  sb.a(((dj) this).field_b, param1, param2 ^ -14533);
                  if (param2 == -3) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  if ((param0 ^ -1) == -16) {
                    fm.a(((dj) this).field_b, 3, param1);
                    if (param2 == -3) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    if (-17 == (param0 ^ -1)) {
                      fm.a(0, param2 + 6, param1);
                      if (param2 == -3) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
    }

    dj(km param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        ((dj) this).field_a = new ga(sd.field_f);
        ((dj) this).field_k = param6;
        ((dj) this).field_j = param5;
        ((dj) this).field_m = param3;
        ((dj) this).field_g = param2;
        param0.field_xb = true;
        ((dj) this).field_d = param0;
        ((dj) this).field_i = param1;
        ((dj) this).field_b = param4;
    }

    final void a(cj param0, boolean param1) {
        if (!param0.field_j) {
          L0: {
            ((dj) this).field_j = param0.field_n;
            if (param0.field_n != 0) {
              break L0;
            } else {
              L1: {
                if (-1 == (ca.field_D ^ -1)) {
                  ((dj) this).field_a.a(1, el.field_g, 12);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((dj) this).field_a.a(1, f.field_h, 13);
              break L0;
            }
          }
          if (param1) {
            return;
          } else {
            L2: {
              if (param0.field_n == 1) {
                L3: {
                  if (qe.field_m == 0) {
                    ((dj) this).field_a.a(1, w.field_F, 12);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((dj) this).field_a.a(1, la.field_m, 13);
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              if (-3 == (param0.field_n ^ -1)) {
                L5: {
                  if (el.field_t == 0) {
                    ((dj) this).field_a.a(1, rl.field_v, 12);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((dj) this).field_a.a(1, mi.field_a, 13);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        if (param0) {
            return;
        }
        field_l = null;
    }

    static {
    }
}
