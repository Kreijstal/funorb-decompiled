/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends qr {
    qr field_Hb;
    boolean field_mc;
    static String field_kc;
    static String field_gc;
    qr field_Wb;
    qr field_Ib;
    qr field_Db;
    int field_Zb;
    qr field_Ub;
    boolean field_Qb;
    static long[] field_Cb;
    static int[] field_zb;
    String[] field_jc;
    qr field_Kb;
    qr field_Mb;
    static char[] field_yb;
    static String field_bc;
    long field_Gb;
    int field_hc;
    qr[] field_xb;
    qr field_Rb;
    boolean field_cc;
    int field_Fb;
    qr field_oc;
    int field_lc;
    boolean field_Ab;
    qr field_Pb;
    long field_fc;
    int field_nc;
    qr field_Sb;
    int field_Eb;
    qr field_ic;
    qr field_Tb;
    boolean field_ec;
    byte[] field_dc;
    boolean field_Yb;
    qr field_Bb;
    int field_Nb;
    String field_Xb;
    boolean field_Jb;
    int field_Lb;
    qr field_Ob;
    qr field_ac;
    static bi field_Vb;

    fb(int param0) {
        super(0L, (qr) null);
        ((fb) this).field_dc = new byte[param0];
    }

    public static void h(int param0) {
        field_Vb = null;
        field_kc = null;
        field_bc = null;
        field_Cb = null;
        field_yb = null;
        field_zb = null;
        if (param0 != 32) {
          field_Vb = null;
          field_gc = null;
          return;
        } else {
          field_gc = null;
          return;
        }
    }

    final static lp a(int param0, int param1, int param2, int param3, fs param4, int param5, fs[] param6, dc param7) {
        int var9 = 0;
        int var10 = 0;
        fs[] var11_ref_fs__ = null;
        int var11 = 0;
        int var12_int = 0;
        b var12 = null;
        qk var13 = null;
        fs var13_ref = null;
        String var14 = null;
        vd var15 = null;
        int var16 = 0;
        lp var17 = null;
        lp var18 = null;
        int stackIn_5_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = -18 % ((param2 - -43) / 35);
        var17 = new lp(0, 0, 182, cc.field_n);
        var18 = var17;
        var10 = 0;
        var11_ref_fs__ = param6;
        var12_int = 0;
        L0: while (true) {
          if (var11_ref_fs__.length > var12_int) {
            var13_ref = var11_ref_fs__[var12_int];
            if (0 == 0) {
              L1: {
                if ((Object) (Object) param4 != (Object) (Object) var13) {
                  break L1;
                } else {
                  var10 = 1;
                  if (0 == 0) {
                    L2: {
                      if (var10 != 0) {
                        stackOut_108_0 = 8421504;
                        stackIn_109_0 = stackOut_108_0;
                        break L2;
                      } else {
                        stackOut_107_0 = 2105376;
                        stackIn_109_0 = stackOut_107_0;
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        var11 = stackIn_109_0;
                        var12 = new b(pf.field_a[param4.field_x].field_z / 2, -(rs.field_Cb.field_J / 2) + (var18.field_i / 2 - 4), -(pf.field_a[param4.field_x].field_z / 2) + var18.field_m, rs.field_Cb.field_J + 8, 2, var11);
                        var18.a((vd) (Object) var12, 8);
                        if ((param7.field_w & 1 << param4.field_x) == 0) {
                          break L4;
                        } else {
                          var13 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var18.field_i / 2, var17.field_m - pf.field_a[param4.field_x].field_z, rs.field_Cb.field_J, of.field_d.toUpperCase());
                          var18.a((vd) (Object) var13, 8);
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var13 = (qk) (Object) new ff(pf.field_a[param4.field_x].field_z / 2, -1 + (var18.field_i / 2 - rs.field_Cb.field_J / 2), er.a(param5, (byte) -127, param1, param4, param3));
                      var18.a((vd) (Object) var13, 8);
                      break L3;
                    }
                    L5: {
                      if (var10 == 0) {
                        break L5;
                      } else {
                        if ((param0 ^ -1) < -4) {
                          break L5;
                        } else {
                          if (0 >= param0) {
                            break L5;
                          } else {
                            var13 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var18.field_i / 2, -pf.field_a[param4.field_x].field_z + var18.field_m, rs.field_Cb.field_J, re.a(ka.field_m, 4371, new String[1]));
                            var18.a((vd) (Object) var13, 8);
                            break L5;
                          }
                        }
                      }
                    }
                    var13 = (qk) (Object) new ff(0, (-pf.field_a[param4.field_x].field_w + var18.field_i) / 2, pf.field_a[param4.field_x]);
                    var18.a((vd) (Object) var13, 8);
                    if ((param7.field_w & 1 << param4.field_x) == 0) {
                      L6: {
                        L7: {
                          if (1 != param3) {
                            break L7;
                          } else {
                            L8: {
                              if ((param5 ^ -1) != -2) {
                                break L8;
                              } else {
                                var14 = bc.field_a;
                                if (0 == 0) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var14 = re.a(ms.field_b, 4371, new String[1]);
                            if (0 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L9: {
                          if (-2 == (param5 ^ -1)) {
                            break L9;
                          } else {
                            var14 = re.a(jm.field_q, 4371, new String[2]);
                            if (0 == 0) {
                              break L6;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var14 = re.a(fa.field_S, 4371, new String[1]);
                        break L6;
                      }
                      if (var10 != 0) {
                        if (!param7.field_z) {
                          var14 = var14 + " " + ui.field_q;
                          var18.field_o = var14;
                          var15 = (vd) (Object) var18.field_l.d(0);
                          L10: while (true) {
                            L11: {
                              if (var15 == null) {
                                break L11;
                              } else {
                                var15.field_o = var14;
                                var15 = (vd) (Object) var18.field_l.a((byte) -71);
                                if (0 == 0) {
                                  continue L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            return var18;
                          }
                        } else {
                          var18.field_o = var14;
                          var15 = (vd) (Object) var18.field_l.d(0);
                          L12: while (true) {
                            L13: {
                              if (var15 == null) {
                                break L13;
                              } else {
                                var15.field_o = var14;
                                var15 = (vd) (Object) var18.field_l.a((byte) -71);
                                if (0 == 0) {
                                  continue L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            return var18;
                          }
                        }
                      } else {
                        var18.field_o = var14;
                        var15 = (vd) (Object) var18.field_l.d(0);
                        L14: while (true) {
                          L15: {
                            if (var15 == null) {
                              break L15;
                            } else {
                              var15.field_o = var14;
                              var15 = (vd) (Object) var18.field_l.a((byte) -71);
                              if (0 == 0) {
                                continue L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          return var18;
                        }
                      }
                    } else {
                      return var18;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var12_int++;
              if (0 == 0) {
                continue L0;
              } else {
                L16: {
                  if (var10 != 0) {
                    stackOut_73_0 = 8421504;
                    stackIn_74_0 = stackOut_73_0;
                    break L16;
                  } else {
                    stackOut_72_0 = 2105376;
                    stackIn_74_0 = stackOut_72_0;
                    break L16;
                  }
                }
                L17: {
                  L18: {
                    var11 = stackIn_74_0;
                    var12 = new b(pf.field_a[param4.field_x].field_z / 2, -(rs.field_Cb.field_J / 2) + (var18.field_i / 2 - 4), -(pf.field_a[param4.field_x].field_z / 2) + var18.field_m, rs.field_Cb.field_J + 8, 2, var11);
                    var18.a((vd) (Object) var12, 8);
                    if ((param7.field_w & 1 << param4.field_x) == 0) {
                      break L18;
                    } else {
                      var13 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var18.field_i / 2, var17.field_m - pf.field_a[param4.field_x].field_z, rs.field_Cb.field_J, of.field_d.toUpperCase());
                      var18.a((vd) (Object) var13, 8);
                      if (0 == 0) {
                        break L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  var13 = (qk) (Object) new ff(pf.field_a[param4.field_x].field_z / 2, -1 + (var18.field_i / 2 - rs.field_Cb.field_J / 2), er.a(param5, (byte) -127, param1, param4, param3));
                  var18.a((vd) (Object) var13, 8);
                  break L17;
                }
                L19: {
                  if (var10 == 0) {
                    break L19;
                  } else {
                    if ((param0 ^ -1) < -4) {
                      break L19;
                    } else {
                      if (0 >= param0) {
                        break L19;
                      } else {
                        var13 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var18.field_i / 2, -pf.field_a[param4.field_x].field_z + var18.field_m, rs.field_Cb.field_J, re.a(ka.field_m, 4371, new String[1]));
                        var18.a((vd) (Object) var13, 8);
                        break L19;
                      }
                    }
                  }
                }
                var13 = (qk) (Object) new ff(0, (-pf.field_a[param4.field_x].field_w + var18.field_i) / 2, pf.field_a[param4.field_x]);
                var18.a((vd) (Object) var13, 8);
                if ((param7.field_w & 1 << param4.field_x) == 0) {
                  L20: {
                    L21: {
                      if (1 != param3) {
                        break L21;
                      } else {
                        L22: {
                          if ((param5 ^ -1) != -2) {
                            break L22;
                          } else {
                            var14 = bc.field_a;
                            if (0 == 0) {
                              break L20;
                            } else {
                              break L22;
                            }
                          }
                        }
                        var14 = re.a(ms.field_b, 4371, new String[1]);
                        if (0 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    L23: {
                      if (-2 == (param5 ^ -1)) {
                        break L23;
                      } else {
                        var14 = re.a(jm.field_q, 4371, new String[2]);
                        if (0 == 0) {
                          break L20;
                        } else {
                          break L23;
                        }
                      }
                    }
                    var14 = re.a(fa.field_S, 4371, new String[1]);
                    break L20;
                  }
                  if (var10 != 0) {
                    if (param7.field_z) {
                      var18.field_o = var14;
                      var15 = (vd) (Object) var18.field_l.d(0);
                      L24: while (true) {
                        L25: {
                          if (var15 == null) {
                            break L25;
                          } else {
                            var15.field_o = var14;
                            var15 = (vd) (Object) var18.field_l.a((byte) -71);
                            if (0 == 0) {
                              continue L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                        return var18;
                      }
                    } else {
                      var14 = var14 + " " + ui.field_q;
                      var18.field_o = var14;
                      var15 = (vd) (Object) var18.field_l.d(0);
                      L26: while (true) {
                        L27: {
                          if (var15 == null) {
                            break L27;
                          } else {
                            var15.field_o = var14;
                            var15 = (vd) (Object) var18.field_l.a((byte) -71);
                            if (0 == 0) {
                              continue L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                        return var18;
                      }
                    }
                  } else {
                    var18.field_o = var14;
                    var15 = (vd) (Object) var18.field_l.d(0);
                    L28: while (true) {
                      L29: {
                        if (var15 == null) {
                          break L29;
                        } else {
                          var15.field_o = var14;
                          var15 = (vd) (Object) var18.field_l.a((byte) -71);
                          if (0 == 0) {
                            continue L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                      return var18;
                    }
                  }
                } else {
                  return var18;
                }
              }
            } else {
              L30: {
                L31: {
                  var11 = 8421504;
                  var12 = new b(pf.field_a[param4.field_x].field_z / 2, -(rs.field_Cb.field_J / 2) + (var18.field_i / 2 - 4), -(pf.field_a[param4.field_x].field_z / 2) + var18.field_m, rs.field_Cb.field_J + 8, 2, var11);
                  var18.a((vd) (Object) var12, 8);
                  if ((param7.field_w & 1 << param4.field_x) == 0) {
                    break L31;
                  } else {
                    var13 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var18.field_i / 2, var17.field_m - pf.field_a[param4.field_x].field_z, rs.field_Cb.field_J, of.field_d.toUpperCase());
                    var18.a((vd) (Object) var13, 8);
                    if (0 == 0) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                var13 = (qk) (Object) new ff(pf.field_a[param4.field_x].field_z / 2, -1 + (var18.field_i / 2 - rs.field_Cb.field_J / 2), er.a(param5, (byte) -127, param1, param4, param3));
                var18.a((vd) (Object) var13, 8);
                break L30;
              }
              L32: {
                if (var10 == 0) {
                  break L32;
                } else {
                  if ((param0 ^ -1) < -4) {
                    break L32;
                  } else {
                    if (0 >= param0) {
                      break L32;
                    } else {
                      var13 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var18.field_i / 2, -pf.field_a[param4.field_x].field_z + var18.field_m, rs.field_Cb.field_J, re.a(ka.field_m, 4371, new String[1]));
                      var18.a((vd) (Object) var13, 8);
                      break L32;
                    }
                  }
                }
              }
              var13 = (qk) (Object) new ff(0, (-pf.field_a[param4.field_x].field_w + var18.field_i) / 2, pf.field_a[param4.field_x]);
              var18.a((vd) (Object) var13, 8);
              if ((param7.field_w & 1 << param4.field_x) == 0) {
                L33: {
                  L34: {
                    if (1 != param3) {
                      break L34;
                    } else {
                      L35: {
                        if ((param5 ^ -1) != -2) {
                          break L35;
                        } else {
                          var14 = bc.field_a;
                          if (0 == 0) {
                            break L33;
                          } else {
                            break L35;
                          }
                        }
                      }
                      var14 = re.a(ms.field_b, 4371, new String[1]);
                      if (0 == 0) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  L36: {
                    if (-2 == (param5 ^ -1)) {
                      break L36;
                    } else {
                      var14 = re.a(jm.field_q, 4371, new String[2]);
                      if (0 == 0) {
                        break L33;
                      } else {
                        break L36;
                      }
                    }
                  }
                  var14 = re.a(fa.field_S, 4371, new String[1]);
                  break L33;
                }
                if (var10 != 0) {
                  if (param7.field_z) {
                    var18.field_o = var14;
                    var15 = (vd) (Object) var18.field_l.d(0);
                    L37: while (true) {
                      L38: {
                        if (var15 == null) {
                          break L38;
                        } else {
                          var15.field_o = var14;
                          var15 = (vd) (Object) var18.field_l.a((byte) -71);
                          if (0 == 0) {
                            continue L37;
                          } else {
                            break L38;
                          }
                        }
                      }
                      return var18;
                    }
                  } else {
                    var14 = var14 + " " + ui.field_q;
                    var18.field_o = var14;
                    var15 = (vd) (Object) var18.field_l.d(0);
                    L39: while (true) {
                      L40: {
                        if (var15 == null) {
                          break L40;
                        } else {
                          var15.field_o = var14;
                          var15 = (vd) (Object) var18.field_l.a((byte) -71);
                          if (0 == 0) {
                            continue L39;
                          } else {
                            break L40;
                          }
                        }
                      }
                      return var18;
                    }
                  }
                } else {
                  var18.field_o = var14;
                  var15 = (vd) (Object) var18.field_l.d(0);
                  L41: while (true) {
                    L42: {
                      if (var15 == null) {
                        break L42;
                      } else {
                        var15.field_o = var14;
                        var15 = (vd) (Object) var18.field_l.a((byte) -71);
                        if (0 == 0) {
                          continue L41;
                        } else {
                          break L42;
                        }
                      }
                    }
                    return var18;
                  }
                }
              } else {
                return var18;
              }
            }
          } else {
            L43: {
              if (var10 != 0) {
                stackOut_4_0 = 8421504;
                stackIn_5_0 = stackOut_4_0;
                break L43;
              } else {
                stackOut_3_0 = 2105376;
                stackIn_5_0 = stackOut_3_0;
                break L43;
              }
            }
            L44: {
              L45: {
                var11 = stackIn_5_0;
                var12 = new b(pf.field_a[param4.field_x].field_z / 2, -(rs.field_Cb.field_J / 2) + (var18.field_i / 2 - 4), -(pf.field_a[param4.field_x].field_z / 2) + var18.field_m, rs.field_Cb.field_J + 8, 2, var11);
                var18.a((vd) (Object) var12, 8);
                if ((param7.field_w & 1 << param4.field_x) == 0) {
                  break L45;
                } else {
                  var13 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var18.field_i / 2, var17.field_m - pf.field_a[param4.field_x].field_z, rs.field_Cb.field_J, of.field_d.toUpperCase());
                  var18.a((vd) (Object) var13, 8);
                  if (0 == 0) {
                    break L44;
                  } else {
                    break L45;
                  }
                }
              }
              var13 = (qk) (Object) new ff(pf.field_a[param4.field_x].field_z / 2, -1 + (var18.field_i / 2 - rs.field_Cb.field_J / 2), er.a(param5, (byte) -127, param1, param4, param3));
              var18.a((vd) (Object) var13, 8);
              break L44;
            }
            L46: {
              if (var10 == 0) {
                break L46;
              } else {
                if ((param0 ^ -1) < -4) {
                  break L46;
                } else {
                  if (0 >= param0) {
                    break L46;
                  } else {
                    var13 = new qk(pf.field_a[param4.field_x].field_z, -(rs.field_Cb.field_J / 2) + var18.field_i / 2, -pf.field_a[param4.field_x].field_z + var18.field_m, rs.field_Cb.field_J, re.a(ka.field_m, 4371, new String[1]));
                    var18.a((vd) (Object) var13, 8);
                    break L46;
                  }
                }
              }
            }
            var13 = (qk) (Object) new ff(0, (-pf.field_a[param4.field_x].field_w + var18.field_i) / 2, pf.field_a[param4.field_x]);
            var18.a((vd) (Object) var13, 8);
            if ((param7.field_w & 1 << param4.field_x) == 0) {
              L47: {
                L48: {
                  if (1 != param3) {
                    break L48;
                  } else {
                    L49: {
                      if ((param5 ^ -1) != -2) {
                        break L49;
                      } else {
                        var14 = bc.field_a;
                        if (0 == 0) {
                          break L47;
                        } else {
                          break L49;
                        }
                      }
                    }
                    var14 = re.a(ms.field_b, 4371, new String[1]);
                    if (0 == 0) {
                      break L47;
                    } else {
                      break L48;
                    }
                  }
                }
                L50: {
                  if (-2 == (param5 ^ -1)) {
                    break L50;
                  } else {
                    var14 = re.a(jm.field_q, 4371, new String[2]);
                    if (0 == 0) {
                      break L47;
                    } else {
                      break L50;
                    }
                  }
                }
                var14 = re.a(fa.field_S, 4371, new String[1]);
                break L47;
              }
              if (var10 != 0) {
                if (param7.field_z) {
                  var18.field_o = var14;
                  var15 = (vd) (Object) var18.field_l.d(0);
                  L51: while (true) {
                    L52: {
                      if (var15 == null) {
                        break L52;
                      } else {
                        var15.field_o = var14;
                        var15 = (vd) (Object) var18.field_l.a((byte) -71);
                        if (0 == 0) {
                          continue L51;
                        } else {
                          break L52;
                        }
                      }
                    }
                    return var18;
                  }
                } else {
                  var14 = var14 + " " + ui.field_q;
                  var18.field_o = var14;
                  var15 = (vd) (Object) var18.field_l.d(0);
                  L53: while (true) {
                    L54: {
                      if (var15 == null) {
                        break L54;
                      } else {
                        var15.field_o = var14;
                        var15 = (vd) (Object) var18.field_l.a((byte) -71);
                        if (0 == 0) {
                          continue L53;
                        } else {
                          break L54;
                        }
                      }
                    }
                    return var18;
                  }
                }
              } else {
                var18.field_o = var14;
                var15 = (vd) (Object) var18.field_l.d(0);
                L55: while (true) {
                  L56: {
                    if (var15 == null) {
                      break L56;
                    } else {
                      var15.field_o = var14;
                      var15 = (vd) (Object) var18.field_l.a((byte) -71);
                      if (0 == 0) {
                        continue L55;
                      } else {
                        break L56;
                      }
                    }
                  }
                  return var18;
                }
              }
            } else {
              return var18;
            }
          }
        }
    }

    final boolean f(byte param0) {
        if (param0 != -78) {
            return false;
        }
        return !((fb) this).a((byte) 98) ? true : false;
    }

    final static void a(boolean param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6, boolean param7, boolean param8, int param9) {
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param5) {
          if (kh.field_Mb == gf.field_b) {
            L0: {
              if (el.field_c == gf.field_k) {
                break L0;
              } else {
                if (so.field_q.field_d != gf.field_k) {
                  break L0;
                } else {
                  if (gf.field_b != so.field_q.field_g) {
                    break L0;
                  } else {
                    if (null == np.field_a) {
                      if (null == he.field_p) {
                        tc.j(param9 ^ 97);
                        break L0;
                      } else {
                        en.a(param9 + 15471, true);
                        break L0;
                      }
                    } else {
                      en.a(15471, false);
                      break L0;
                    }
                  }
                }
              }
            }
            if (!param5) {
              L1: {
                tm.field_h = (kh.field_Mb - 640) / 2;
                mf.a(true, param5);
                if (qa.field_t > param9) {
                  hi.a(param0, param9 ^ -26671, param5, param2);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                dn.field_f.field_y = 1;
                dn.field_f.field_kb = fg.field_b.field_kb;
                if (-1 <= (bc.field_b ^ -1)) {
                  break L2;
                } else {
                  bb.a(param5, param0, (byte) -2, param2);
                  break L2;
                }
              }
              L3: {
                if ((ee.field_k ^ -1) >= -1) {
                  break L3;
                } else {
                  uo.a((byte) 23, param0, param2, param7, param5);
                  break L3;
                }
              }
              L4: {
                L5: {
                  if (!ti.field_e) {
                    break L5;
                  } else {
                    if (np.field_a.field_Eb <= np.field_a.field_Lb) {
                      ls.field_a.field_zb.field_z = gm.field_j;
                      lp.field_v.field_s = false;
                      fj.a(false, ls.field_a.field_xb);
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                lp.field_v.field_s = true;
                ls.field_a.field_zb.field_z = null;
                dm.a(param4, 0, ls.field_a, param1, param2);
                break L4;
              }
              ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
              dm.a(param4, 0, ro.field_a, param1, param2);
              ln.field_w = ln.field_w + 1;
              return;
            } else {
              tm.field_h = gn.field_t;
              L6: {
                mf.a(true, param5);
                if (qa.field_t > param9) {
                  hi.a(param0, param9 ^ -26671, param5, param2);
                  break L6;
                } else {
                  break L6;
                }
              }
              dn.field_f.field_y = 1;
              dn.field_f.field_kb = fg.field_b.field_kb;
              if (-1 <= (bc.field_b ^ -1)) {
                L7: {
                  if ((ee.field_k ^ -1) >= -1) {
                    break L7;
                  } else {
                    uo.a((byte) 23, param0, param2, param7, param5);
                    break L7;
                  }
                }
                if (ti.field_e) {
                  if (np.field_a.field_Eb > np.field_a.field_Lb) {
                    lp.field_v.field_s = true;
                    ls.field_a.field_zb.field_z = null;
                    dm.a(param4, 0, ls.field_a, param1, param2);
                    ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                    dm.a(param4, 0, ro.field_a, param1, param2);
                    ln.field_w = ln.field_w + 1;
                    return;
                  } else {
                    ls.field_a.field_zb.field_z = gm.field_j;
                    lp.field_v.field_s = false;
                    fj.a(false, ls.field_a.field_xb);
                    ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                    dm.a(param4, 0, ro.field_a, param1, param2);
                    ln.field_w = ln.field_w + 1;
                    return;
                  }
                } else {
                  lp.field_v.field_s = true;
                  ls.field_a.field_zb.field_z = null;
                  dm.a(param4, 0, ls.field_a, param1, param2);
                  ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                  dm.a(param4, 0, ro.field_a, param1, param2);
                  ln.field_w = ln.field_w + 1;
                  return;
                }
              } else {
                L8: {
                  bb.a(param5, param0, (byte) -2, param2);
                  if ((ee.field_k ^ -1) >= -1) {
                    break L8;
                  } else {
                    uo.a((byte) 23, param0, param2, param7, param5);
                    break L8;
                  }
                }
                if (ti.field_e) {
                  if (np.field_a.field_Eb > np.field_a.field_Lb) {
                    lp.field_v.field_s = true;
                    ls.field_a.field_zb.field_z = null;
                    dm.a(param4, 0, ls.field_a, param1, param2);
                    ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                    dm.a(param4, 0, ro.field_a, param1, param2);
                    ln.field_w = ln.field_w + 1;
                    return;
                  } else {
                    ls.field_a.field_zb.field_z = gm.field_j;
                    lp.field_v.field_s = false;
                    fj.a(false, ls.field_a.field_xb);
                    ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                    dm.a(param4, 0, ro.field_a, param1, param2);
                    ln.field_w = ln.field_w + 1;
                    return;
                  }
                } else {
                  lp.field_v.field_s = true;
                  ls.field_a.field_zb.field_z = null;
                  dm.a(param4, 0, ls.field_a, param1, param2);
                  ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                  dm.a(param4, 0, ro.field_a, param1, param2);
                  ln.field_w = ln.field_w + 1;
                  return;
                }
              }
            }
          } else {
            L9: {
              if (so.field_q.field_d != gf.field_k) {
                break L9;
              } else {
                if (gf.field_b != so.field_q.field_g) {
                  break L9;
                } else {
                  if (null == np.field_a) {
                    if (null == he.field_p) {
                      tc.j(param9 ^ 97);
                      break L9;
                    } else {
                      en.a(param9 + 15471, true);
                      break L9;
                    }
                  } else {
                    en.a(15471, false);
                    break L9;
                  }
                }
              }
            }
            if (!param5) {
              L10: {
                tm.field_h = (kh.field_Mb - 640) / 2;
                mf.a(true, param5);
                if (qa.field_t > param9) {
                  hi.a(param0, param9 ^ -26671, param5, param2);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                dn.field_f.field_y = 1;
                dn.field_f.field_kb = fg.field_b.field_kb;
                if (-1 <= (bc.field_b ^ -1)) {
                  break L11;
                } else {
                  bb.a(param5, param0, (byte) -2, param2);
                  break L11;
                }
              }
              L12: {
                if ((ee.field_k ^ -1) >= -1) {
                  break L12;
                } else {
                  uo.a((byte) 23, param0, param2, param7, param5);
                  break L12;
                }
              }
              L13: {
                L14: {
                  if (!ti.field_e) {
                    break L14;
                  } else {
                    if (np.field_a.field_Eb <= np.field_a.field_Lb) {
                      ls.field_a.field_zb.field_z = gm.field_j;
                      lp.field_v.field_s = false;
                      fj.a(false, ls.field_a.field_xb);
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                lp.field_v.field_s = true;
                ls.field_a.field_zb.field_z = null;
                dm.a(param4, 0, ls.field_a, param1, param2);
                break L13;
              }
              ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
              dm.a(param4, 0, ro.field_a, param1, param2);
              ln.field_w = ln.field_w + 1;
              return;
            } else {
              tm.field_h = gn.field_t;
              L15: {
                mf.a(true, param5);
                if (qa.field_t > param9) {
                  hi.a(param0, param9 ^ -26671, param5, param2);
                  break L15;
                } else {
                  break L15;
                }
              }
              dn.field_f.field_y = 1;
              dn.field_f.field_kb = fg.field_b.field_kb;
              if (-1 <= (bc.field_b ^ -1)) {
                if ((ee.field_k ^ -1) >= -1) {
                  if (ti.field_e) {
                    if (np.field_a.field_Eb > np.field_a.field_Lb) {
                      lp.field_v.field_s = true;
                      ls.field_a.field_zb.field_z = null;
                      dm.a(param4, 0, ls.field_a, param1, param2);
                      ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                      dm.a(param4, 0, ro.field_a, param1, param2);
                      ln.field_w = ln.field_w + 1;
                      return;
                    } else {
                      ls.field_a.field_zb.field_z = gm.field_j;
                      lp.field_v.field_s = false;
                      fj.a(false, ls.field_a.field_xb);
                      ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                      dm.a(param4, 0, ro.field_a, param1, param2);
                      ln.field_w = ln.field_w + 1;
                      return;
                    }
                  } else {
                    lp.field_v.field_s = true;
                    ls.field_a.field_zb.field_z = null;
                    dm.a(param4, 0, ls.field_a, param1, param2);
                    ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                    dm.a(param4, 0, ro.field_a, param1, param2);
                    ln.field_w = ln.field_w + 1;
                    return;
                  }
                } else {
                  L16: {
                    L17: {
                      uo.a((byte) 23, param0, param2, param7, param5);
                      if (!ti.field_e) {
                        break L17;
                      } else {
                        if (np.field_a.field_Eb <= np.field_a.field_Lb) {
                          ls.field_a.field_zb.field_z = gm.field_j;
                          lp.field_v.field_s = false;
                          fj.a(false, ls.field_a.field_xb);
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    lp.field_v.field_s = true;
                    ls.field_a.field_zb.field_z = null;
                    dm.a(param4, 0, ls.field_a, param1, param2);
                    break L16;
                  }
                  ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                  dm.a(param4, 0, ro.field_a, param1, param2);
                  ln.field_w = ln.field_w + 1;
                  return;
                }
              } else {
                L18: {
                  bb.a(param5, param0, (byte) -2, param2);
                  if ((ee.field_k ^ -1) >= -1) {
                    break L18;
                  } else {
                    uo.a((byte) 23, param0, param2, param7, param5);
                    break L18;
                  }
                }
                L19: {
                  L20: {
                    if (!ti.field_e) {
                      break L20;
                    } else {
                      if (np.field_a.field_Eb <= np.field_a.field_Lb) {
                        ls.field_a.field_zb.field_z = gm.field_j;
                        lp.field_v.field_s = false;
                        fj.a(false, ls.field_a.field_xb);
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  lp.field_v.field_s = true;
                  ls.field_a.field_zb.field_z = null;
                  dm.a(param4, 0, ls.field_a, param1, param2);
                  break L19;
                }
                ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                dm.a(param4, 0, ro.field_a, param1, param2);
                ln.field_w = ln.field_w + 1;
                return;
              }
            }
          }
        } else {
          tm.field_h = gn.field_t;
          L21: {
            mf.a(true, param5);
            if (qa.field_t > param9) {
              hi.a(param0, param9 ^ -26671, param5, param2);
              break L21;
            } else {
              break L21;
            }
          }
          dn.field_f.field_y = 1;
          dn.field_f.field_kb = fg.field_b.field_kb;
          if (-1 <= (bc.field_b ^ -1)) {
            if ((ee.field_k ^ -1) >= -1) {
              if (ti.field_e) {
                if (np.field_a.field_Eb > np.field_a.field_Lb) {
                  lp.field_v.field_s = true;
                  ls.field_a.field_zb.field_z = null;
                  dm.a(param4, 0, ls.field_a, param1, param2);
                  ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                  dm.a(param4, 0, ro.field_a, param1, param2);
                  ln.field_w = ln.field_w + 1;
                  return;
                } else {
                  ls.field_a.field_zb.field_z = gm.field_j;
                  lp.field_v.field_s = false;
                  fj.a(false, ls.field_a.field_xb);
                  ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                  dm.a(param4, 0, ro.field_a, param1, param2);
                  ln.field_w = ln.field_w + 1;
                  return;
                }
              } else {
                lp.field_v.field_s = true;
                ls.field_a.field_zb.field_z = null;
                dm.a(param4, 0, ls.field_a, param1, param2);
                ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
                dm.a(param4, 0, ro.field_a, param1, param2);
                ln.field_w = ln.field_w + 1;
                return;
              }
            } else {
              L22: {
                L23: {
                  uo.a((byte) 23, param0, param2, param7, param5);
                  if (!ti.field_e) {
                    break L23;
                  } else {
                    if (np.field_a.field_Eb <= np.field_a.field_Lb) {
                      ls.field_a.field_zb.field_z = gm.field_j;
                      lp.field_v.field_s = false;
                      fj.a(false, ls.field_a.field_xb);
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                lp.field_v.field_s = true;
                ls.field_a.field_zb.field_z = null;
                dm.a(param4, 0, ls.field_a, param1, param2);
                break L22;
              }
              ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
              dm.a(param4, 0, ro.field_a, param1, param2);
              ln.field_w = ln.field_w + 1;
              return;
            }
          } else {
            L24: {
              bb.a(param5, param0, (byte) -2, param2);
              if ((ee.field_k ^ -1) >= -1) {
                break L24;
              } else {
                uo.a((byte) 23, param0, param2, param7, param5);
                break L24;
              }
            }
            L25: {
              L26: {
                if (!ti.field_e) {
                  break L26;
                } else {
                  if (np.field_a.field_Eb <= np.field_a.field_Lb) {
                    ls.field_a.field_zb.field_z = gm.field_j;
                    lp.field_v.field_s = false;
                    fj.a(false, ls.field_a.field_xb);
                    break L25;
                  } else {
                    break L26;
                  }
                }
              }
              lp.field_v.field_s = true;
              ls.field_a.field_zb.field_z = null;
              dm.a(param4, 0, ls.field_a, param1, param2);
              break L25;
            }
            ga.a(param1, (byte) 116, param3, param6, param2, param4, param8);
            dm.a(param4, 0, ro.field_a, param1, param2);
            ln.field_w = ln.field_w + 1;
            return;
          }
        }
    }

    final int g(int param0) {
        if (param0 >= -74) {
            int discarded$0 = ((fb) this).g(-46);
            return (int)((fb) this).d((byte) 118);
        }
        return (int)((fb) this).d((byte) 118);
    }

    final boolean a(fb param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_161_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_197_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_200_1 = 0;
        int stackIn_205_0 = 0;
        int stackIn_209_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_217_1 = 0;
        int stackIn_222_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_231_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_232_1 = 0;
        int stackIn_237_0 = 0;
        int stackIn_240_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_244_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_245_1 = 0;
        int stackIn_251_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_263_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_281_0 = 0;
        int stackIn_284_0 = 0;
        int stackIn_285_0 = 0;
        int stackIn_286_0 = 0;
        int stackIn_287_0 = 0;
        int stackIn_287_1 = 0;
        int stackIn_292_0 = 0;
        int stackIn_296_0 = 0;
        int stackIn_301_0 = 0;
        int stackIn_302_0 = 0;
        int stackIn_303_0 = 0;
        int stackIn_304_0 = 0;
        int stackIn_304_1 = 0;
        int stackIn_309_0 = 0;
        int stackIn_313_0 = 0;
        int stackIn_316_0 = 0;
        int stackIn_317_0 = 0;
        int stackIn_318_0 = 0;
        int stackIn_319_0 = 0;
        int stackIn_319_1 = 0;
        int stackIn_324_0 = 0;
        int stackIn_327_0 = 0;
        int stackIn_328_0 = 0;
        int stackIn_329_0 = 0;
        int stackIn_330_0 = 0;
        int stackIn_330_1 = 0;
        int stackIn_336_0 = 0;
        int stackIn_344_0 = 0;
        int stackIn_348_0 = 0;
        int stackIn_353_0 = 0;
        int stackIn_358_0 = 0;
        int stackIn_366_0 = 0;
        int stackIn_367_0 = 0;
        int stackIn_368_0 = 0;
        int stackIn_369_0 = 0;
        int stackIn_369_1 = 0;
        int stackIn_374_0 = 0;
        int stackIn_378_0 = 0;
        int stackIn_381_0 = 0;
        int stackIn_382_0 = 0;
        int stackIn_383_0 = 0;
        int stackIn_384_0 = 0;
        int stackIn_384_1 = 0;
        int stackIn_389_0 = 0;
        int stackIn_392_0 = 0;
        int stackIn_397_0 = 0;
        int stackIn_398_0 = 0;
        int stackIn_399_0 = 0;
        int stackIn_400_0 = 0;
        int stackIn_400_1 = 0;
        int stackIn_405_0 = 0;
        int stackIn_408_0 = 0;
        int stackIn_411_0 = 0;
        int stackIn_412_0 = 0;
        int stackIn_413_0 = 0;
        int stackIn_414_0 = 0;
        int stackIn_414_1 = 0;
        int stackIn_419_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_199_1 = 0;
        int stackOut_198_0 = 0;
        int stackOut_198_1 = 0;
        int stackOut_204_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_216_1 = 0;
        int stackOut_215_0 = 0;
        int stackOut_215_1 = 0;
        int stackOut_221_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_231_1 = 0;
        int stackOut_230_0 = 0;
        int stackOut_230_1 = 0;
        int stackOut_236_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_160_1 = 0;
        int stackOut_159_0 = 0;
        int stackOut_159_1 = 0;
        int stackOut_164_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_325_0 = 0;
        int stackOut_326_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_244_1 = 0;
        int stackOut_243_0 = 0;
        int stackOut_243_1 = 0;
        int stackOut_250_0 = 0;
        int stackOut_249_0 = 0;
        int stackOut_258_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_266_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_295_0 = 0;
        int stackOut_280_0 = 0;
        int stackOut_279_0 = 0;
        int stackOut_283_0 = 0;
        int stackOut_282_0 = 0;
        int stackOut_284_0 = 0;
        int stackOut_286_0 = 0;
        int stackOut_286_1 = 0;
        int stackOut_285_0 = 0;
        int stackOut_285_1 = 0;
        int stackOut_291_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_311_0 = 0;
        int stackOut_312_0 = 0;
        int stackOut_300_0 = 0;
        int stackOut_299_0 = 0;
        int stackOut_301_0 = 0;
        int stackOut_303_0 = 0;
        int stackOut_303_1 = 0;
        int stackOut_302_0 = 0;
        int stackOut_302_1 = 0;
        int stackOut_308_0 = 0;
        int stackOut_307_0 = 0;
        int stackOut_315_0 = 0;
        int stackOut_314_0 = 0;
        int stackOut_316_0 = 0;
        int stackOut_318_0 = 0;
        int stackOut_318_1 = 0;
        int stackOut_317_0 = 0;
        int stackOut_317_1 = 0;
        int stackOut_323_0 = 0;
        int stackOut_322_0 = 0;
        int stackOut_272_0 = 0;
        int stackOut_271_0 = 0;
        int stackOut_327_0 = 0;
        int stackOut_329_0 = 0;
        int stackOut_329_1 = 0;
        int stackOut_328_0 = 0;
        int stackOut_328_1 = 0;
        int stackOut_335_0 = 0;
        int stackOut_334_0 = 0;
        int stackOut_343_0 = 0;
        int stackOut_342_0 = 0;
        int stackOut_347_0 = 0;
        int stackOut_346_0 = 0;
        int stackOut_352_0 = 0;
        int stackOut_351_0 = 0;
        int stackOut_390_0 = 0;
        int stackOut_391_0 = 0;
        int stackOut_376_0 = 0;
        int stackOut_377_0 = 0;
        int stackOut_365_0 = 0;
        int stackOut_364_0 = 0;
        int stackOut_366_0 = 0;
        int stackOut_368_0 = 0;
        int stackOut_368_1 = 0;
        int stackOut_367_0 = 0;
        int stackOut_367_1 = 0;
        int stackOut_373_0 = 0;
        int stackOut_372_0 = 0;
        int stackOut_380_0 = 0;
        int stackOut_379_0 = 0;
        int stackOut_381_0 = 0;
        int stackOut_383_0 = 0;
        int stackOut_383_1 = 0;
        int stackOut_382_0 = 0;
        int stackOut_382_1 = 0;
        int stackOut_388_0 = 0;
        int stackOut_387_0 = 0;
        int stackOut_406_0 = 0;
        int stackOut_407_0 = 0;
        int stackOut_396_0 = 0;
        int stackOut_395_0 = 0;
        int stackOut_397_0 = 0;
        int stackOut_399_0 = 0;
        int stackOut_399_1 = 0;
        int stackOut_398_0 = 0;
        int stackOut_398_1 = 0;
        int stackOut_404_0 = 0;
        int stackOut_403_0 = 0;
        int stackOut_410_0 = 0;
        int stackOut_409_0 = 0;
        int stackOut_411_0 = 0;
        int stackOut_413_0 = 0;
        int stackOut_413_1 = 0;
        int stackOut_412_0 = 0;
        int stackOut_412_1 = 0;
        int stackOut_418_0 = 0;
        int stackOut_417_0 = 0;
        int stackOut_357_0 = 0;
        int stackOut_356_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        if (param1 == -1) {
          L0: {
            if (((fb) this).field_Jb) {
              stackOut_238_0 = 1;
              stackIn_240_0 = stackOut_238_0;
              break L0;
            } else {
              if (((fb) this).field_hc != 6) {
                stackOut_239_0 = 0;
                stackIn_240_0 = stackOut_239_0;
                break L0;
              } else {
                L1: {
                  var3 = 1;
                  if (!param0.field_Jb) {
                    if (-7 == (param0.field_hc ^ -1)) {
                      stackOut_76_0 = 1;
                      stackIn_78_0 = stackOut_76_0;
                      break L1;
                    } else {
                      stackOut_75_0 = 0;
                      stackIn_78_0 = stackOut_75_0;
                      break L1;
                    }
                  } else {
                    stackOut_73_0 = 1;
                    stackIn_78_0 = stackOut_73_0;
                    break L1;
                  }
                }
                L2: {
                  var4 = stackIn_78_0;
                  stackOut_78_0 = var4;
                  stackIn_80_0 = stackOut_78_0;
                  stackIn_79_0 = stackOut_78_0;
                  if (var3 != 0) {
                    stackOut_80_0 = stackIn_80_0;
                    stackOut_80_1 = 0;
                    stackIn_81_0 = stackOut_80_0;
                    stackIn_81_1 = stackOut_80_1;
                    break L2;
                  } else {
                    stackOut_79_0 = stackIn_79_0;
                    stackOut_79_1 = 1;
                    stackIn_81_0 = stackOut_79_0;
                    stackIn_81_1 = stackOut_79_1;
                    break L2;
                  }
                }
                if (stackIn_81_0 != stackIn_81_1) {
                  if (var3 == 0) {
                    L3: {
                      if (((fb) this).field_cc) {
                        stackOut_125_0 = 0;
                        stackIn_126_0 = stackOut_125_0;
                        break L3;
                      } else {
                        stackOut_124_0 = 1;
                        stackIn_126_0 = stackOut_124_0;
                        break L3;
                      }
                    }
                    if (stackIn_126_0 == (param0.field_cc ? 1 : 0)) {
                      return ((fb) this).field_cc;
                    } else {
                      if (((fb) this).field_cc) {
                        if (param0.field_nc == ((fb) this).field_nc) {
                          L4: {
                            if (((fb) this).field_Ab) {
                              stackOut_175_0 = 0;
                              stackIn_176_0 = stackOut_175_0;
                              break L4;
                            } else {
                              stackOut_174_0 = 1;
                              stackIn_176_0 = stackOut_174_0;
                              break L4;
                            }
                          }
                          if (stackIn_176_0 == (param0.field_Ab ? 1 : 0)) {
                            L5: {
                              if (((fb) this).field_Ab) {
                                stackOut_180_0 = 0;
                                stackIn_181_0 = stackOut_180_0;
                                break L5;
                              } else {
                                stackOut_179_0 = 1;
                                stackIn_181_0 = stackOut_179_0;
                                break L5;
                              }
                            }
                            return stackIn_181_0 != 0;
                          } else {
                            if (((fb) this).field_Ab) {
                              L6: {
                                if (((fb) this).field_mc) {
                                  stackOut_207_0 = 1;
                                  stackIn_209_0 = stackOut_207_0;
                                  break L6;
                                } else {
                                  if (2 != ((fb) this).field_Fb) {
                                    stackOut_208_0 = 0;
                                    stackIn_209_0 = stackOut_208_0;
                                    break L6;
                                  } else {
                                    L7: {
                                      L8: {
                                        var5 = 1;
                                        if (param0.field_mc) {
                                          break L8;
                                        } else {
                                          if ((param0.field_Fb ^ -1) != -3) {
                                            stackOut_193_0 = 0;
                                            stackIn_194_0 = stackOut_193_0;
                                            break L7;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      stackOut_192_0 = 1;
                                      stackIn_194_0 = stackOut_192_0;
                                      break L7;
                                    }
                                    L9: {
                                      var6 = stackIn_194_0;
                                      if (var6 != 0) {
                                        stackOut_196_0 = 0;
                                        stackIn_197_0 = stackOut_196_0;
                                        break L9;
                                      } else {
                                        stackOut_195_0 = 1;
                                        stackIn_197_0 = stackOut_195_0;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      stackOut_197_0 = stackIn_197_0;
                                      stackIn_199_0 = stackOut_197_0;
                                      stackIn_198_0 = stackOut_197_0;
                                      if (var5 != 0) {
                                        stackOut_199_0 = stackIn_199_0;
                                        stackOut_199_1 = 0;
                                        stackIn_200_0 = stackOut_199_0;
                                        stackIn_200_1 = stackOut_199_1;
                                        break L10;
                                      } else {
                                        stackOut_198_0 = stackIn_198_0;
                                        stackOut_198_1 = 1;
                                        stackIn_200_0 = stackOut_198_0;
                                        stackIn_200_1 = stackOut_198_1;
                                        break L10;
                                      }
                                    }
                                    if (stackIn_200_0 == stackIn_200_1) {
                                      L11: {
                                        if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                                          stackOut_204_0 = 0;
                                          stackIn_205_0 = stackOut_204_0;
                                          break L11;
                                        } else {
                                          stackOut_203_0 = 1;
                                          stackIn_205_0 = stackOut_203_0;
                                          break L11;
                                        }
                                      }
                                      return stackIn_205_0 != 0;
                                    } else {
                                      return var5 != 0;
                                    }
                                  }
                                }
                              }
                              L12: {
                                var5 = stackIn_209_0;
                                if (param0.field_mc) {
                                  stackOut_224_0 = 1;
                                  stackIn_226_0 = stackOut_224_0;
                                  break L12;
                                } else {
                                  if ((param0.field_Fb ^ -1) != -3) {
                                    stackOut_225_0 = 0;
                                    stackIn_226_0 = stackOut_225_0;
                                    break L12;
                                  } else {
                                    L13: {
                                      var6 = 1;
                                      if (var6 != 0) {
                                        stackOut_213_0 = 0;
                                        stackIn_214_0 = stackOut_213_0;
                                        break L13;
                                      } else {
                                        stackOut_212_0 = 1;
                                        stackIn_214_0 = stackOut_212_0;
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      stackOut_214_0 = stackIn_214_0;
                                      stackIn_216_0 = stackOut_214_0;
                                      stackIn_215_0 = stackOut_214_0;
                                      if (var5 != 0) {
                                        stackOut_216_0 = stackIn_216_0;
                                        stackOut_216_1 = 0;
                                        stackIn_217_0 = stackOut_216_0;
                                        stackIn_217_1 = stackOut_216_1;
                                        break L14;
                                      } else {
                                        stackOut_215_0 = stackIn_215_0;
                                        stackOut_215_1 = 1;
                                        stackIn_217_0 = stackOut_215_0;
                                        stackIn_217_1 = stackOut_215_1;
                                        break L14;
                                      }
                                    }
                                    if (stackIn_217_0 == stackIn_217_1) {
                                      L15: {
                                        if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                                          stackOut_221_0 = 0;
                                          stackIn_222_0 = stackOut_221_0;
                                          break L15;
                                        } else {
                                          stackOut_220_0 = 1;
                                          stackIn_222_0 = stackOut_220_0;
                                          break L15;
                                        }
                                      }
                                      return stackIn_222_0 != 0;
                                    } else {
                                      return var5 != 0;
                                    }
                                  }
                                }
                              }
                              L16: {
                                var6 = stackIn_226_0;
                                if (var6 != 0) {
                                  stackOut_228_0 = 0;
                                  stackIn_229_0 = stackOut_228_0;
                                  break L16;
                                } else {
                                  stackOut_227_0 = 1;
                                  stackIn_229_0 = stackOut_227_0;
                                  break L16;
                                }
                              }
                              L17: {
                                stackOut_229_0 = stackIn_229_0;
                                stackIn_231_0 = stackOut_229_0;
                                stackIn_230_0 = stackOut_229_0;
                                if (var5 != 0) {
                                  stackOut_231_0 = stackIn_231_0;
                                  stackOut_231_1 = 0;
                                  stackIn_232_0 = stackOut_231_0;
                                  stackIn_232_1 = stackOut_231_1;
                                  break L17;
                                } else {
                                  stackOut_230_0 = stackIn_230_0;
                                  stackOut_230_1 = 1;
                                  stackIn_232_0 = stackOut_230_0;
                                  stackIn_232_1 = stackOut_230_1;
                                  break L17;
                                }
                              }
                              if (stackIn_232_0 == stackIn_232_1) {
                                L18: {
                                  if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                                    stackOut_236_0 = 0;
                                    stackIn_237_0 = stackOut_236_0;
                                    break L18;
                                  } else {
                                    stackOut_235_0 = 1;
                                    stackIn_237_0 = stackOut_235_0;
                                    break L18;
                                  }
                                }
                                return stackIn_237_0 != 0;
                              } else {
                                return var5 != 0;
                              }
                            } else {
                              L19: {
                                if (((fb) this).field_Gb >= param0.field_Gb) {
                                  stackOut_185_0 = 0;
                                  stackIn_186_0 = stackOut_185_0;
                                  break L19;
                                } else {
                                  stackOut_184_0 = 1;
                                  stackIn_186_0 = stackOut_184_0;
                                  break L19;
                                }
                              }
                              return stackIn_186_0 != 0;
                            }
                          }
                        } else {
                          L20: {
                            if (param0.field_nc <= ((fb) this).field_nc) {
                              stackOut_171_0 = 0;
                              stackIn_172_0 = stackOut_171_0;
                              break L20;
                            } else {
                              stackOut_170_0 = 1;
                              stackIn_172_0 = stackOut_170_0;
                              break L20;
                            }
                          }
                          return stackIn_172_0 != 0;
                        }
                      } else {
                        L21: {
                          if (((fb) this).field_Ab) {
                            stackOut_132_0 = 0;
                            stackIn_133_0 = stackOut_132_0;
                            break L21;
                          } else {
                            stackOut_131_0 = 1;
                            stackIn_133_0 = stackOut_131_0;
                            break L21;
                          }
                        }
                        if (stackIn_133_0 == (param0.field_Ab ? 1 : 0)) {
                          L22: {
                            if (((fb) this).field_Ab) {
                              stackOut_137_0 = 0;
                              stackIn_138_0 = stackOut_137_0;
                              break L22;
                            } else {
                              stackOut_136_0 = 1;
                              stackIn_138_0 = stackOut_136_0;
                              break L22;
                            }
                          }
                          return stackIn_138_0 != 0;
                        } else {
                          if (((fb) this).field_Ab) {
                            L23: {
                              if (!((fb) this).field_mc) {
                                if (2 == ((fb) this).field_Fb) {
                                  stackOut_148_0 = 1;
                                  stackIn_150_0 = stackOut_148_0;
                                  break L23;
                                } else {
                                  stackOut_147_0 = 0;
                                  stackIn_150_0 = stackOut_147_0;
                                  break L23;
                                }
                              } else {
                                stackOut_145_0 = 1;
                                stackIn_150_0 = stackOut_145_0;
                                break L23;
                              }
                            }
                            L24: {
                              var5 = stackIn_150_0;
                              if (param0.field_mc) {
                                stackOut_153_0 = 1;
                                stackIn_155_0 = stackOut_153_0;
                                break L24;
                              } else {
                                if ((param0.field_Fb ^ -1) != -3) {
                                  stackOut_154_0 = 0;
                                  stackIn_155_0 = stackOut_154_0;
                                  break L24;
                                } else {
                                  stackOut_152_0 = 1;
                                  stackIn_155_0 = stackOut_152_0;
                                  break L24;
                                }
                              }
                            }
                            L25: {
                              var6 = stackIn_155_0;
                              if (var6 != 0) {
                                stackOut_157_0 = 0;
                                stackIn_158_0 = stackOut_157_0;
                                break L25;
                              } else {
                                stackOut_156_0 = 1;
                                stackIn_158_0 = stackOut_156_0;
                                break L25;
                              }
                            }
                            L26: {
                              stackOut_158_0 = stackIn_158_0;
                              stackIn_160_0 = stackOut_158_0;
                              stackIn_159_0 = stackOut_158_0;
                              if (var5 != 0) {
                                stackOut_160_0 = stackIn_160_0;
                                stackOut_160_1 = 0;
                                stackIn_161_0 = stackOut_160_0;
                                stackIn_161_1 = stackOut_160_1;
                                break L26;
                              } else {
                                stackOut_159_0 = stackIn_159_0;
                                stackOut_159_1 = 1;
                                stackIn_161_0 = stackOut_159_0;
                                stackIn_161_1 = stackOut_159_1;
                                break L26;
                              }
                            }
                            if (stackIn_161_0 != stackIn_161_1) {
                              return var5 != 0;
                            } else {
                              L27: {
                                if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                                  stackOut_164_0 = 0;
                                  stackIn_165_0 = stackOut_164_0;
                                  break L27;
                                } else {
                                  stackOut_163_0 = 1;
                                  stackIn_165_0 = stackOut_163_0;
                                  break L27;
                                }
                              }
                              return stackIn_165_0 != 0;
                            }
                          } else {
                            L28: {
                              if (((fb) this).field_Gb >= param0.field_Gb) {
                                stackOut_142_0 = 0;
                                stackIn_143_0 = stackOut_142_0;
                                break L28;
                              } else {
                                stackOut_141_0 = 1;
                                stackIn_143_0 = stackOut_141_0;
                                break L28;
                              }
                            }
                            return stackIn_143_0 != 0;
                          }
                        }
                      }
                    }
                  } else {
                    L29: {
                      if (((fb) this).field_Ab) {
                        stackOut_86_0 = 0;
                        stackIn_87_0 = stackOut_86_0;
                        break L29;
                      } else {
                        stackOut_85_0 = 1;
                        stackIn_87_0 = stackOut_85_0;
                        break L29;
                      }
                    }
                    if (stackIn_87_0 == (param0.field_Ab ? 1 : 0)) {
                      L30: {
                        if (((fb) this).field_Ab) {
                          stackOut_91_0 = 0;
                          stackIn_92_0 = stackOut_91_0;
                          break L30;
                        } else {
                          stackOut_90_0 = 1;
                          stackIn_92_0 = stackOut_90_0;
                          break L30;
                        }
                      }
                      return stackIn_92_0 != 0;
                    } else {
                      if (((fb) this).field_Ab) {
                        L31: {
                          if (!((fb) this).field_mc) {
                            if (2 == ((fb) this).field_Fb) {
                              stackOut_102_0 = 1;
                              stackIn_104_0 = stackOut_102_0;
                              break L31;
                            } else {
                              stackOut_101_0 = 0;
                              stackIn_104_0 = stackOut_101_0;
                              break L31;
                            }
                          } else {
                            stackOut_99_0 = 1;
                            stackIn_104_0 = stackOut_99_0;
                            break L31;
                          }
                        }
                        L32: {
                          var5 = stackIn_104_0;
                          if (!param0.field_mc) {
                            if ((param0.field_Fb ^ -1) == -3) {
                              stackOut_108_0 = 1;
                              stackIn_110_0 = stackOut_108_0;
                              break L32;
                            } else {
                              stackOut_107_0 = 0;
                              stackIn_110_0 = stackOut_107_0;
                              break L32;
                            }
                          } else {
                            stackOut_105_0 = 1;
                            stackIn_110_0 = stackOut_105_0;
                            break L32;
                          }
                        }
                        L33: {
                          var6 = stackIn_110_0;
                          if (var6 != 0) {
                            stackOut_112_0 = 0;
                            stackIn_113_0 = stackOut_112_0;
                            break L33;
                          } else {
                            stackOut_111_0 = 1;
                            stackIn_113_0 = stackOut_111_0;
                            break L33;
                          }
                        }
                        L34: {
                          stackOut_113_0 = stackIn_113_0;
                          stackIn_115_0 = stackOut_113_0;
                          stackIn_114_0 = stackOut_113_0;
                          if (var5 != 0) {
                            stackOut_115_0 = stackIn_115_0;
                            stackOut_115_1 = 0;
                            stackIn_116_0 = stackOut_115_0;
                            stackIn_116_1 = stackOut_115_1;
                            break L34;
                          } else {
                            stackOut_114_0 = stackIn_114_0;
                            stackOut_114_1 = 1;
                            stackIn_116_0 = stackOut_114_0;
                            stackIn_116_1 = stackOut_114_1;
                            break L34;
                          }
                        }
                        if (stackIn_116_0 != stackIn_116_1) {
                          return var5 != 0;
                        } else {
                          L35: {
                            if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                              stackOut_119_0 = 0;
                              stackIn_120_0 = stackOut_119_0;
                              break L35;
                            } else {
                              stackOut_118_0 = 1;
                              stackIn_120_0 = stackOut_118_0;
                              break L35;
                            }
                          }
                          return stackIn_120_0 != 0;
                        }
                      } else {
                        L36: {
                          if (((fb) this).field_Gb >= param0.field_Gb) {
                            stackOut_96_0 = 0;
                            stackIn_97_0 = stackOut_96_0;
                            break L36;
                          } else {
                            stackOut_95_0 = 1;
                            stackIn_97_0 = stackOut_95_0;
                            break L36;
                          }
                        }
                        return stackIn_97_0 != 0;
                      }
                    }
                  }
                } else {
                  return var3 != 0;
                }
              }
            }
          }
          L37: {
            var3 = stackIn_240_0;
            if (param0.field_Jb) {
              stackOut_325_0 = 1;
              stackIn_327_0 = stackOut_325_0;
              break L37;
            } else {
              if (-7 != (param0.field_hc ^ -1)) {
                stackOut_326_0 = 0;
                stackIn_327_0 = stackOut_326_0;
                break L37;
              } else {
                L38: {
                  var4 = 1;
                  stackOut_242_0 = var4;
                  stackIn_244_0 = stackOut_242_0;
                  stackIn_243_0 = stackOut_242_0;
                  if (var3 != 0) {
                    stackOut_244_0 = stackIn_244_0;
                    stackOut_244_1 = 0;
                    stackIn_245_0 = stackOut_244_0;
                    stackIn_245_1 = stackOut_244_1;
                    break L38;
                  } else {
                    stackOut_243_0 = stackIn_243_0;
                    stackOut_243_1 = 1;
                    stackIn_245_0 = stackOut_243_0;
                    stackIn_245_1 = stackOut_243_1;
                    break L38;
                  }
                }
                if (stackIn_245_0 != stackIn_245_1) {
                  L39: {
                    if (var3 != 0) {
                      break L39;
                    } else {
                      L40: {
                        if (((fb) this).field_cc) {
                          stackOut_250_0 = 0;
                          stackIn_251_0 = stackOut_250_0;
                          break L40;
                        } else {
                          stackOut_249_0 = 1;
                          stackIn_251_0 = stackOut_249_0;
                          break L40;
                        }
                      }
                      if (stackIn_251_0 == (param0.field_cc ? 1 : 0)) {
                        return ((fb) this).field_cc;
                      } else {
                        if (!((fb) this).field_cc) {
                          break L39;
                        } else {
                          if (param0.field_nc == ((fb) this).field_nc) {
                            break L39;
                          } else {
                            L41: {
                              if (param0.field_nc <= ((fb) this).field_nc) {
                                stackOut_258_0 = 0;
                                stackIn_259_0 = stackOut_258_0;
                                break L41;
                              } else {
                                stackOut_257_0 = 1;
                                stackIn_259_0 = stackOut_257_0;
                                break L41;
                              }
                            }
                            return stackIn_259_0 != 0;
                          }
                        }
                      }
                    }
                  }
                  L42: {
                    if (((fb) this).field_Ab) {
                      stackOut_262_0 = 0;
                      stackIn_263_0 = stackOut_262_0;
                      break L42;
                    } else {
                      stackOut_261_0 = 1;
                      stackIn_263_0 = stackOut_261_0;
                      break L42;
                    }
                  }
                  if (stackIn_263_0 == (param0.field_Ab ? 1 : 0)) {
                    L43: {
                      if (((fb) this).field_Ab) {
                        stackOut_267_0 = 0;
                        stackIn_268_0 = stackOut_267_0;
                        break L43;
                      } else {
                        stackOut_266_0 = 1;
                        stackIn_268_0 = stackOut_266_0;
                        break L43;
                      }
                    }
                    return stackIn_268_0 != 0;
                  } else {
                    if (((fb) this).field_Ab) {
                      L44: {
                        if (((fb) this).field_mc) {
                          stackOut_294_0 = 1;
                          stackIn_296_0 = stackOut_294_0;
                          break L44;
                        } else {
                          if (2 != ((fb) this).field_Fb) {
                            stackOut_295_0 = 0;
                            stackIn_296_0 = stackOut_295_0;
                            break L44;
                          } else {
                            L45: {
                              L46: {
                                var5 = 1;
                                if (param0.field_mc) {
                                  break L46;
                                } else {
                                  if ((param0.field_Fb ^ -1) != -3) {
                                    stackOut_280_0 = 0;
                                    stackIn_281_0 = stackOut_280_0;
                                    break L45;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              stackOut_279_0 = 1;
                              stackIn_281_0 = stackOut_279_0;
                              break L45;
                            }
                            L47: {
                              var6 = stackIn_281_0;
                              if (var6 != 0) {
                                stackOut_283_0 = 0;
                                stackIn_284_0 = stackOut_283_0;
                                break L47;
                              } else {
                                stackOut_282_0 = 1;
                                stackIn_284_0 = stackOut_282_0;
                                break L47;
                              }
                            }
                            L48: {
                              stackOut_284_0 = stackIn_284_0;
                              stackIn_286_0 = stackOut_284_0;
                              stackIn_285_0 = stackOut_284_0;
                              if (var5 != 0) {
                                stackOut_286_0 = stackIn_286_0;
                                stackOut_286_1 = 0;
                                stackIn_287_0 = stackOut_286_0;
                                stackIn_287_1 = stackOut_286_1;
                                break L48;
                              } else {
                                stackOut_285_0 = stackIn_285_0;
                                stackOut_285_1 = 1;
                                stackIn_287_0 = stackOut_285_0;
                                stackIn_287_1 = stackOut_285_1;
                                break L48;
                              }
                            }
                            if (stackIn_287_0 == stackIn_287_1) {
                              L49: {
                                if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                                  stackOut_291_0 = 0;
                                  stackIn_292_0 = stackOut_291_0;
                                  break L49;
                                } else {
                                  stackOut_290_0 = 1;
                                  stackIn_292_0 = stackOut_290_0;
                                  break L49;
                                }
                              }
                              return stackIn_292_0 != 0;
                            } else {
                              return var5 != 0;
                            }
                          }
                        }
                      }
                      L50: {
                        var5 = stackIn_296_0;
                        if (param0.field_mc) {
                          stackOut_311_0 = 1;
                          stackIn_313_0 = stackOut_311_0;
                          break L50;
                        } else {
                          if ((param0.field_Fb ^ -1) != -3) {
                            stackOut_312_0 = 0;
                            stackIn_313_0 = stackOut_312_0;
                            break L50;
                          } else {
                            L51: {
                              var6 = 1;
                              if (var6 != 0) {
                                stackOut_300_0 = 0;
                                stackIn_301_0 = stackOut_300_0;
                                break L51;
                              } else {
                                stackOut_299_0 = 1;
                                stackIn_301_0 = stackOut_299_0;
                                break L51;
                              }
                            }
                            L52: {
                              stackOut_301_0 = stackIn_301_0;
                              stackIn_303_0 = stackOut_301_0;
                              stackIn_302_0 = stackOut_301_0;
                              if (var5 != 0) {
                                stackOut_303_0 = stackIn_303_0;
                                stackOut_303_1 = 0;
                                stackIn_304_0 = stackOut_303_0;
                                stackIn_304_1 = stackOut_303_1;
                                break L52;
                              } else {
                                stackOut_302_0 = stackIn_302_0;
                                stackOut_302_1 = 1;
                                stackIn_304_0 = stackOut_302_0;
                                stackIn_304_1 = stackOut_302_1;
                                break L52;
                              }
                            }
                            if (stackIn_304_0 == stackIn_304_1) {
                              L53: {
                                if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                                  stackOut_308_0 = 0;
                                  stackIn_309_0 = stackOut_308_0;
                                  break L53;
                                } else {
                                  stackOut_307_0 = 1;
                                  stackIn_309_0 = stackOut_307_0;
                                  break L53;
                                }
                              }
                              return stackIn_309_0 != 0;
                            } else {
                              return var5 != 0;
                            }
                          }
                        }
                      }
                      L54: {
                        var6 = stackIn_313_0;
                        if (var6 != 0) {
                          stackOut_315_0 = 0;
                          stackIn_316_0 = stackOut_315_0;
                          break L54;
                        } else {
                          stackOut_314_0 = 1;
                          stackIn_316_0 = stackOut_314_0;
                          break L54;
                        }
                      }
                      L55: {
                        stackOut_316_0 = stackIn_316_0;
                        stackIn_318_0 = stackOut_316_0;
                        stackIn_317_0 = stackOut_316_0;
                        if (var5 != 0) {
                          stackOut_318_0 = stackIn_318_0;
                          stackOut_318_1 = 0;
                          stackIn_319_0 = stackOut_318_0;
                          stackIn_319_1 = stackOut_318_1;
                          break L55;
                        } else {
                          stackOut_317_0 = stackIn_317_0;
                          stackOut_317_1 = 1;
                          stackIn_319_0 = stackOut_317_0;
                          stackIn_319_1 = stackOut_317_1;
                          break L55;
                        }
                      }
                      if (stackIn_319_0 == stackIn_319_1) {
                        L56: {
                          if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                            stackOut_323_0 = 0;
                            stackIn_324_0 = stackOut_323_0;
                            break L56;
                          } else {
                            stackOut_322_0 = 1;
                            stackIn_324_0 = stackOut_322_0;
                            break L56;
                          }
                        }
                        return stackIn_324_0 != 0;
                      } else {
                        return var5 != 0;
                      }
                    } else {
                      L57: {
                        if (((fb) this).field_Gb >= param0.field_Gb) {
                          stackOut_272_0 = 0;
                          stackIn_273_0 = stackOut_272_0;
                          break L57;
                        } else {
                          stackOut_271_0 = 1;
                          stackIn_273_0 = stackOut_271_0;
                          break L57;
                        }
                      }
                      return stackIn_273_0 != 0;
                    }
                  }
                } else {
                  return var3 != 0;
                }
              }
            }
          }
          L58: {
            var4 = stackIn_327_0;
            stackOut_327_0 = var4;
            stackIn_329_0 = stackOut_327_0;
            stackIn_328_0 = stackOut_327_0;
            if (var3 != 0) {
              stackOut_329_0 = stackIn_329_0;
              stackOut_329_1 = 0;
              stackIn_330_0 = stackOut_329_0;
              stackIn_330_1 = stackOut_329_1;
              break L58;
            } else {
              stackOut_328_0 = stackIn_328_0;
              stackOut_328_1 = 1;
              stackIn_330_0 = stackOut_328_0;
              stackIn_330_1 = stackOut_328_1;
              break L58;
            }
          }
          if (stackIn_330_0 != stackIn_330_1) {
            L59: {
              if (var3 != 0) {
                break L59;
              } else {
                L60: {
                  if (((fb) this).field_cc) {
                    stackOut_335_0 = 0;
                    stackIn_336_0 = stackOut_335_0;
                    break L60;
                  } else {
                    stackOut_334_0 = 1;
                    stackIn_336_0 = stackOut_334_0;
                    break L60;
                  }
                }
                if (stackIn_336_0 == (param0.field_cc ? 1 : 0)) {
                  return ((fb) this).field_cc;
                } else {
                  if (!((fb) this).field_cc) {
                    break L59;
                  } else {
                    if (param0.field_nc == ((fb) this).field_nc) {
                      break L59;
                    } else {
                      L61: {
                        if (param0.field_nc <= ((fb) this).field_nc) {
                          stackOut_343_0 = 0;
                          stackIn_344_0 = stackOut_343_0;
                          break L61;
                        } else {
                          stackOut_342_0 = 1;
                          stackIn_344_0 = stackOut_342_0;
                          break L61;
                        }
                      }
                      return stackIn_344_0 != 0;
                    }
                  }
                }
              }
            }
            L62: {
              if (((fb) this).field_Ab) {
                stackOut_347_0 = 0;
                stackIn_348_0 = stackOut_347_0;
                break L62;
              } else {
                stackOut_346_0 = 1;
                stackIn_348_0 = stackOut_346_0;
                break L62;
              }
            }
            if (stackIn_348_0 == (param0.field_Ab ? 1 : 0)) {
              L63: {
                if (((fb) this).field_Ab) {
                  stackOut_352_0 = 0;
                  stackIn_353_0 = stackOut_352_0;
                  break L63;
                } else {
                  stackOut_351_0 = 1;
                  stackIn_353_0 = stackOut_351_0;
                  break L63;
                }
              }
              return stackIn_353_0 != 0;
            } else {
              if (((fb) this).field_Ab) {
                L64: {
                  if (((fb) this).field_mc) {
                    stackOut_390_0 = 1;
                    stackIn_392_0 = stackOut_390_0;
                    break L64;
                  } else {
                    if (2 != ((fb) this).field_Fb) {
                      stackOut_391_0 = 0;
                      stackIn_392_0 = stackOut_391_0;
                      break L64;
                    } else {
                      L65: {
                        var5 = 1;
                        if (param0.field_mc) {
                          stackOut_376_0 = 1;
                          stackIn_378_0 = stackOut_376_0;
                          break L65;
                        } else {
                          if ((param0.field_Fb ^ -1) != -3) {
                            stackOut_377_0 = 0;
                            stackIn_378_0 = stackOut_377_0;
                            break L65;
                          } else {
                            L66: {
                              var6 = 1;
                              if (var6 != 0) {
                                stackOut_365_0 = 0;
                                stackIn_366_0 = stackOut_365_0;
                                break L66;
                              } else {
                                stackOut_364_0 = 1;
                                stackIn_366_0 = stackOut_364_0;
                                break L66;
                              }
                            }
                            L67: {
                              stackOut_366_0 = stackIn_366_0;
                              stackIn_368_0 = stackOut_366_0;
                              stackIn_367_0 = stackOut_366_0;
                              if (var5 != 0) {
                                stackOut_368_0 = stackIn_368_0;
                                stackOut_368_1 = 0;
                                stackIn_369_0 = stackOut_368_0;
                                stackIn_369_1 = stackOut_368_1;
                                break L67;
                              } else {
                                stackOut_367_0 = stackIn_367_0;
                                stackOut_367_1 = 1;
                                stackIn_369_0 = stackOut_367_0;
                                stackIn_369_1 = stackOut_367_1;
                                break L67;
                              }
                            }
                            if (stackIn_369_0 == stackIn_369_1) {
                              L68: {
                                if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                                  stackOut_373_0 = 0;
                                  stackIn_374_0 = stackOut_373_0;
                                  break L68;
                                } else {
                                  stackOut_372_0 = 1;
                                  stackIn_374_0 = stackOut_372_0;
                                  break L68;
                                }
                              }
                              return stackIn_374_0 != 0;
                            } else {
                              return var5 != 0;
                            }
                          }
                        }
                      }
                      L69: {
                        var6 = stackIn_378_0;
                        if (var6 != 0) {
                          stackOut_380_0 = 0;
                          stackIn_381_0 = stackOut_380_0;
                          break L69;
                        } else {
                          stackOut_379_0 = 1;
                          stackIn_381_0 = stackOut_379_0;
                          break L69;
                        }
                      }
                      L70: {
                        stackOut_381_0 = stackIn_381_0;
                        stackIn_383_0 = stackOut_381_0;
                        stackIn_382_0 = stackOut_381_0;
                        if (var5 != 0) {
                          stackOut_383_0 = stackIn_383_0;
                          stackOut_383_1 = 0;
                          stackIn_384_0 = stackOut_383_0;
                          stackIn_384_1 = stackOut_383_1;
                          break L70;
                        } else {
                          stackOut_382_0 = stackIn_382_0;
                          stackOut_382_1 = 1;
                          stackIn_384_0 = stackOut_382_0;
                          stackIn_384_1 = stackOut_382_1;
                          break L70;
                        }
                      }
                      if (stackIn_384_0 == stackIn_384_1) {
                        L71: {
                          if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                            stackOut_388_0 = 0;
                            stackIn_389_0 = stackOut_388_0;
                            break L71;
                          } else {
                            stackOut_387_0 = 1;
                            stackIn_389_0 = stackOut_387_0;
                            break L71;
                          }
                        }
                        return stackIn_389_0 != 0;
                      } else {
                        return var5 != 0;
                      }
                    }
                  }
                }
                L72: {
                  var5 = stackIn_392_0;
                  if (param0.field_mc) {
                    stackOut_406_0 = 1;
                    stackIn_408_0 = stackOut_406_0;
                    break L72;
                  } else {
                    if ((param0.field_Fb ^ -1) != -3) {
                      stackOut_407_0 = 0;
                      stackIn_408_0 = stackOut_407_0;
                      break L72;
                    } else {
                      L73: {
                        var6 = 1;
                        if (var6 != 0) {
                          stackOut_396_0 = 0;
                          stackIn_397_0 = stackOut_396_0;
                          break L73;
                        } else {
                          stackOut_395_0 = 1;
                          stackIn_397_0 = stackOut_395_0;
                          break L73;
                        }
                      }
                      L74: {
                        stackOut_397_0 = stackIn_397_0;
                        stackIn_399_0 = stackOut_397_0;
                        stackIn_398_0 = stackOut_397_0;
                        if (var5 != 0) {
                          stackOut_399_0 = stackIn_399_0;
                          stackOut_399_1 = 0;
                          stackIn_400_0 = stackOut_399_0;
                          stackIn_400_1 = stackOut_399_1;
                          break L74;
                        } else {
                          stackOut_398_0 = stackIn_398_0;
                          stackOut_398_1 = 1;
                          stackIn_400_0 = stackOut_398_0;
                          stackIn_400_1 = stackOut_398_1;
                          break L74;
                        }
                      }
                      if (stackIn_400_0 == stackIn_400_1) {
                        L75: {
                          if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                            stackOut_404_0 = 0;
                            stackIn_405_0 = stackOut_404_0;
                            break L75;
                          } else {
                            stackOut_403_0 = 1;
                            stackIn_405_0 = stackOut_403_0;
                            break L75;
                          }
                        }
                        return stackIn_405_0 != 0;
                      } else {
                        return var5 != 0;
                      }
                    }
                  }
                }
                L76: {
                  var6 = stackIn_408_0;
                  if (var6 != 0) {
                    stackOut_410_0 = 0;
                    stackIn_411_0 = stackOut_410_0;
                    break L76;
                  } else {
                    stackOut_409_0 = 1;
                    stackIn_411_0 = stackOut_409_0;
                    break L76;
                  }
                }
                L77: {
                  stackOut_411_0 = stackIn_411_0;
                  stackIn_413_0 = stackOut_411_0;
                  stackIn_412_0 = stackOut_411_0;
                  if (var5 != 0) {
                    stackOut_413_0 = stackIn_413_0;
                    stackOut_413_1 = 0;
                    stackIn_414_0 = stackOut_413_0;
                    stackIn_414_1 = stackOut_413_1;
                    break L77;
                  } else {
                    stackOut_412_0 = stackIn_412_0;
                    stackOut_412_1 = 1;
                    stackIn_414_0 = stackOut_412_0;
                    stackIn_414_1 = stackOut_412_1;
                    break L77;
                  }
                }
                if (stackIn_414_0 == stackIn_414_1) {
                  L78: {
                    if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                      stackOut_418_0 = 0;
                      stackIn_419_0 = stackOut_418_0;
                      break L78;
                    } else {
                      stackOut_417_0 = 1;
                      stackIn_419_0 = stackOut_417_0;
                      break L78;
                    }
                  }
                  return stackIn_419_0 != 0;
                } else {
                  return var5 != 0;
                }
              } else {
                L79: {
                  if (((fb) this).field_Gb >= param0.field_Gb) {
                    stackOut_357_0 = 0;
                    stackIn_358_0 = stackOut_357_0;
                    break L79;
                  } else {
                    stackOut_356_0 = 1;
                    stackIn_358_0 = stackOut_356_0;
                    break L79;
                  }
                }
                return stackIn_358_0 != 0;
              }
            }
          } else {
            return var3 != 0;
          }
        } else {
          L80: {
            var7 = null;
            boolean discarded$1 = ((fb) this).a((fb) null, -74);
            if (!((fb) this).field_Jb) {
              if (((fb) this).field_hc == 6) {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L80;
              } else {
                stackOut_4_0 = 0;
                stackIn_7_0 = stackOut_4_0;
                break L80;
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_7_0 = stackOut_2_0;
              break L80;
            }
          }
          L81: {
            var3 = stackIn_7_0;
            if (!param0.field_Jb) {
              if (-7 == (param0.field_hc ^ -1)) {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L81;
              } else {
                stackOut_10_0 = 0;
                stackIn_13_0 = stackOut_10_0;
                break L81;
              }
            } else {
              stackOut_8_0 = 1;
              stackIn_13_0 = stackOut_8_0;
              break L81;
            }
          }
          L82: {
            var4 = stackIn_13_0;
            stackOut_13_0 = var4;
            stackIn_15_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (var3 != 0) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L82;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              break L82;
            }
          }
          if (stackIn_16_0 != stackIn_16_1) {
            L83: {
              if (var3 != 0) {
                break L83;
              } else {
                L84: {
                  if (((fb) this).field_cc) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L84;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L84;
                  }
                }
                if (stackIn_22_0 == (param0.field_cc ? 1 : 0)) {
                  return ((fb) this).field_cc;
                } else {
                  if (!((fb) this).field_cc) {
                    break L83;
                  } else {
                    if (param0.field_nc == ((fb) this).field_nc) {
                      break L83;
                    } else {
                      L85: {
                        if (param0.field_nc <= ((fb) this).field_nc) {
                          stackOut_29_0 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          break L85;
                        } else {
                          stackOut_28_0 = 1;
                          stackIn_30_0 = stackOut_28_0;
                          break L85;
                        }
                      }
                      return stackIn_30_0 != 0;
                    }
                  }
                }
              }
            }
            L86: {
              if (((fb) this).field_Ab) {
                stackOut_33_0 = 0;
                stackIn_34_0 = stackOut_33_0;
                break L86;
              } else {
                stackOut_32_0 = 1;
                stackIn_34_0 = stackOut_32_0;
                break L86;
              }
            }
            if (stackIn_34_0 == (param0.field_Ab ? 1 : 0)) {
              L87: {
                if (((fb) this).field_Ab) {
                  stackOut_38_0 = 0;
                  stackIn_39_0 = stackOut_38_0;
                  break L87;
                } else {
                  stackOut_37_0 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  break L87;
                }
              }
              return stackIn_39_0 != 0;
            } else {
              if (((fb) this).field_Ab) {
                L88: {
                  if (((fb) this).field_mc) {
                    stackOut_49_0 = 1;
                    stackIn_51_0 = stackOut_49_0;
                    break L88;
                  } else {
                    if (2 == ((fb) this).field_Fb) {
                      stackOut_48_0 = 1;
                      stackIn_51_0 = stackOut_48_0;
                      break L88;
                    } else {
                      stackOut_47_0 = 0;
                      stackIn_51_0 = stackOut_47_0;
                      break L88;
                    }
                  }
                }
                L89: {
                  var5 = stackIn_51_0;
                  if (!param0.field_mc) {
                    if ((param0.field_Fb ^ -1) == -3) {
                      stackOut_55_0 = 1;
                      stackIn_57_0 = stackOut_55_0;
                      break L89;
                    } else {
                      stackOut_54_0 = 0;
                      stackIn_57_0 = stackOut_54_0;
                      break L89;
                    }
                  } else {
                    stackOut_52_0 = 1;
                    stackIn_57_0 = stackOut_52_0;
                    break L89;
                  }
                }
                L90: {
                  var6 = stackIn_57_0;
                  if (var6 != 0) {
                    stackOut_59_0 = 0;
                    stackIn_60_0 = stackOut_59_0;
                    break L90;
                  } else {
                    stackOut_58_0 = 1;
                    stackIn_60_0 = stackOut_58_0;
                    break L90;
                  }
                }
                L91: {
                  stackOut_60_0 = stackIn_60_0;
                  stackIn_62_0 = stackOut_60_0;
                  stackIn_61_0 = stackOut_60_0;
                  if (var5 != 0) {
                    stackOut_62_0 = stackIn_62_0;
                    stackOut_62_1 = 0;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    break L91;
                  } else {
                    stackOut_61_0 = stackIn_61_0;
                    stackOut_61_1 = 1;
                    stackIn_63_0 = stackOut_61_0;
                    stackIn_63_1 = stackOut_61_1;
                    break L91;
                  }
                }
                if (stackIn_63_0 != stackIn_63_1) {
                  return var5 != 0;
                } else {
                  L92: {
                    if ((((fb) this).field_Gb ^ -1L) >= (param0.field_Gb ^ -1L)) {
                      stackOut_66_0 = 0;
                      stackIn_67_0 = stackOut_66_0;
                      break L92;
                    } else {
                      stackOut_65_0 = 1;
                      stackIn_67_0 = stackOut_65_0;
                      break L92;
                    }
                  }
                  return stackIn_67_0 != 0;
                }
              } else {
                L93: {
                  if (((fb) this).field_Gb >= param0.field_Gb) {
                    stackOut_43_0 = 0;
                    stackIn_44_0 = stackOut_43_0;
                    break L93;
                  } else {
                    stackOut_42_0 = 1;
                    stackIn_44_0 = stackOut_42_0;
                    break L93;
                  }
                }
                return stackIn_44_0 != 0;
              }
            }
          } else {
            return var3 != 0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gc = "Awaiting response";
        field_kc = "<%0> is not a member, and cannot play with the current options.";
        field_Cb = new long[32];
        field_yb = new char[128];
        field_bc = "Cancel";
    }
}
