/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ava {
    private int field_g;
    static int field_d;
    int field_b;
    static vp field_f;
    int field_a;
    private byte field_e;
    int field_c;

    final ava a(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
            return (ava) null;
        }
        return new ava(this.field_g, param3, param1, param2, this.field_e);
    }

    final static void a(iv param0, int param1, int param2, boolean param3, int param4) {
        iv stackIn_41_0;
        int stackIn_41_1;
        boolean stackIn_41_2;
        int stackIn_41_3;
        int stackIn_41_4;
        int stackIn_41_5;
        iv stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        boolean stackIn_42_2 = false;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_42_5 = 0;
        int stackIn_42_6 = 0;
        int stackIn_45_0 = 0;
        int stackIn_57_0 = 0;
        jea stackIn_92_0 = null;
        jea stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        RuntimeException stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        RuntimeException stackIn_217_0 = null;
        StringBuilder stackIn_217_1 = null;
        String stackIn_217_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        vna var10 = null;
        int var11_int = 0;
        Object var11 = null;
        pha var12 = null;
        int var13 = 0;
        jea var14 = null;
        jea var15 = null;
        jea var16 = null;
        jea var17 = null;
        jea var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        var31 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              var7 = 0;
              var8 = 0;
              if (uu.field_a == null) {
                break L1;
              } else {
                L2: {
                  if (rl.field_u != null) {
                    break L2;
                  } else {
                    if (hp.field_a != null) {
                      break L2;
                    } else {
                      if (nra.field_g != null) {
                        break L2;
                      } else {
                        if (lga.field_z == null) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var9 = 0;
                L3: while (true) {
                  if (fk.field_b <= var9) {
                    break L1;
                  } else {
                    L4: {
                      var10_int = 255 & uu.field_a.field_ac[var9];
                      if (rl.field_u == null) {
                        break L4;
                      } else {
                        if (null == rl.field_u[var9]) {
                          break L4;
                        } else {
                          if (rl.field_u[var9][var10_int]) {
                            var5_int = 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      if (null == hp.field_a) {
                        break L5;
                      } else {
                        if (hp.field_a[var9] != null) {
                          L6: {
                            var11_int = hp.field_a[var9][var10_int];
                            if (-1 == (var11_int ^ -1)) {
                              break L6;
                            } else {
                              if (!dea.field_c) {
                                var5_int = 1;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var6 < var11_int) {
                            var6 = var11_int;
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      if (lga.field_z == null) {
                        break L7;
                      } else {
                        if (null == lga.field_z[var9]) {
                          break L7;
                        } else {
                          var8 = var8 | lga.field_z[var9][var10_int];
                          break L7;
                        }
                      }
                    }
                    if (nra.field_g != null) {
                      L8: {
                        if (null != nra.field_g[var9]) {
                          L9: {
                            var11_int = nra.field_g[var9][var10_int];
                            if (0 == var11_int) {
                              break L9;
                            } else {
                              if (!dea.field_c) {
                                var5_int = 1;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (var7 < var11_int) {
                            var7 = var11_int;
                            break L8;
                          } else {
                            var9++;
                            continue L3;
                          }
                        } else {
                          break L8;
                        }
                      }
                      var9++;
                      continue L3;
                    } else {
                      var9++;
                      continue L3;
                    }
                  }
                }
              }
            }
            L10: {
              stackIn_41_0 = (iv) (param0);

              stackIn_41_1 = 2;

              stackIn_41_2 = param3;

              stackIn_41_3 = 92;

              stackIn_41_4 = param2 * (8 + di.field_a * 4);

              stackIn_41_5 = 2 * (di.field_a + param4);

              if (lu.field_b != param0) {
                stackIn_42_0 = (iv) ((Object) stackIn_41_0);
                stackIn_42_1 = stackIn_41_1;
                stackIn_42_2 = stackIn_41_2;
                stackIn_42_3 = stackIn_41_3;
                stackIn_42_4 = stackIn_41_4;
                stackIn_42_5 = stackIn_41_5;
                stackIn_42_6 = 0;
                break L10;
              } else {
                stackIn_42_0 = (iv) ((Object) stackIn_41_0);
                stackIn_42_1 = stackIn_41_1;
                stackIn_42_2 = stackIn_41_2;
                stackIn_42_3 = stackIn_41_3;
                stackIn_42_4 = stackIn_41_4;
                stackIn_42_5 = stackIn_41_5;
                stackIn_42_6 = 1;
                break L10;
              }
            }
            L11: {
              if (!((iv) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4, stackIn_42_5, stackIn_42_6 != 0)) {
                stackIn_45_0 = 0;
                break L11;
              } else {
                stackIn_45_0 = 1;
                break L11;
              }
            }
            var9 = stackIn_45_0;
            var10 = param0.field_tb.field_J;
            var11 = null;
            var12 = (pha) ((Object) var10.f(-80));
            L12: while (true) {
              if (var12 == null) {
                break L0;
              } else {
                L13: {
                  var13 = 0;
                  if (var12.field_J != null) {
                    break L13;
                  } else {
                    L14: {
                      var12.field_Nb = new jea(0L, lta.field_a);
                      var12.b(-128, var12.field_Nb);
                      var12.field_Db = new jea(0L, iea.field_g);
                      if (rca.field_p) {
                        var12.b(-123, var12.field_Db);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var12.field_Db.field_z = 2;
                    var12.field_Gb = new jea(0L, kua.field_i);
                    var12.b(-126, var12.field_Gb);
                    var12.a(-10966);
                    var12.field_Kb = new jea(0L, bua.field_g);
                    var12.b(param4 ^ -121, var12.field_Kb);
                    var12.field_Cb = new jea(0L, kv.field_b);
                    var12.b(-128, var12.field_Cb);
                    var13 = 1;
                    break L13;
                  }
                }
                L15: {
                  var12.field_Nb.field_r = null;
                  var14 = var12.field_Nb;
                  var12.field_Nb.field_t = 0;
                  var14.field_G = 0;
                  var12.field_Db.field_r = null;
                  var12.field_Db.field_t = 0;
                  var15 = var12.field_Db;
                  var15.field_G = 0;
                  var12.field_Kb.field_r = null;
                  var12.field_Kb.field_t = 0;
                  var16 = var12.field_Kb;
                  var16.field_G = 0;
                  var12.field_Cb.field_r = null;
                  var17 = var12.field_Cb;
                  var12.field_Cb.field_t = 0;
                  var12.field_Gb.field_r = null;
                  var17.field_G = 0;
                  var18 = var12.field_Gb;
                  var12.field_Gb.field_t = 0;
                  var18.field_G = 0;
                  var12.field_G = param0.field_tb.field_G;
                  var19 = 0;
                  var32 = var12.field_wb;
                  var20 = var32;
                  var20 = var32;
                  var21 = 72;
                  if (param0 != bsa.field_j) {
                    break L15;
                  } else {
                    var21 += 42;
                    break L15;
                  }
                }
                L16: {
                  var33 = il.a(var12.field_Nb.field_H, var32, var21);
                  var20 = var33;
                  var20 = var33;
                  var20 = var33;
                  if (var33.equals(var12.field_wb)) {
                    stackIn_57_0 = 0;
                    break L16;
                  } else {
                    stackIn_57_0 = 1;
                    break L16;
                  }
                }
                L17: {
                  var22 = stackIn_57_0;
                  if (var12.field_Ab < 4) {
                    if (-1 > (var12.field_Ab ^ -1)) {
                      var20 = "<img=" + (-1 + var12.field_Ab) + ">" + var33;
                      break L17;
                    } else {
                      break L17;
                    }
                  } else {
                    var20 = "<img=" + (csa.field_n + var12.field_Ab + -4) + ">" + var33;
                    break L17;
                  }
                }
                L18: {
                  var12.field_Nb.field_r = var20;
                  if (var12.f(162)) {
                    break L18;
                  } else {
                    L19: {
                      L20: {
                        L21: {
                          var23_int = 16764006;
                          var24_int = 16777215;
                          if (var5_int == 0) {
                            break L21;
                          } else {
                            if (!var12.field_tb) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (var6 > var12.field_Jb) {
                          break L20;
                        } else {
                          if (var12.field_zb < var7) {
                            break L20;
                          } else {
                            if ((var8 & (var12.field_Eb ^ -1) ^ -1) < -1) {
                              break L20;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      var23_int = 8414771;
                      var24_int = 8421504;
                      break L19;
                    }
                    L22: {
                      var12.field_Kb.field_ib = var23_int;
                      var12.field_Db.field_ib = var23_int;
                      var12.field_Nb.field_ib = var23_int;
                      var12.field_Nb.field_gb = var24_int;
                      var12.field_Nb.field_N = var24_int;
                      var12.field_Nb.field_ab = var24_int;
                      var12.field_Db.field_gb = var24_int;
                      var12.field_Db.field_N = var24_int;
                      var12.field_Db.field_ab = var24_int;
                      var12.field_Kb.field_gb = var24_int;
                      var12.field_Kb.field_N = var24_int;
                      var12.field_Kb.field_ab = var24_int;
                      if (param0 != tn.field_n) {
                        if (var12.field_Hb) {
                          var12.field_Nb.field_r = gl.a((byte) 90, hs.field_b, new String[]{var20});
                          var12.field_Cb.field_r = mq.field_d;
                          break L22;
                        } else {
                          if (var12.field_Fb) {
                            var12.field_Nb.field_r = gl.a((byte) 105, uaa.field_c, new String[]{var20});
                            var12.field_Kb.field_r = r.field_l;
                            var12.field_Cb.field_r = sv.field_q;
                            break L22;
                          } else {
                            var12.field_Kb.field_r = vu.field_e;
                            break L22;
                          }
                        }
                      } else {
                        if (uu.field_a.field_ec) {
                          break L22;
                        } else {
                          var12.field_Cb.field_r = vc.field_o;
                          break L22;
                        }
                      }
                    }
                    L23: {
                      var25_int = 0;
                      if (null == uu.field_a) {
                        break L23;
                      } else {
                        if (!mka.b(8192)) {
                          break L23;
                        } else {
                          if (var12.field_yb == rb.field_r) {
                            break L23;
                          } else {
                            L24: {
                              if (var12.field_Kb.field_r != null) {
                                var26 = var12.field_Kb.b((byte) 69) - -(mna.field_d * 2);
                                var12.field_Kb.a(var26, di.field_a, -23776, var19, var25_int);
                                var25_int = var25_int + var26;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            if (var12.field_Cb.field_r == null) {
                              break L23;
                            } else {
                              L25: {
                                if (param0 == tn.field_n) {
                                  var26 = 40;
                                  break L25;
                                } else {
                                  var26 = var12.field_Cb.b((byte) 69) - -(2 * mna.field_d);
                                  break L25;
                                }
                              }
                              var12.field_Cb.a(var26, di.field_a, -23776, var19, var25_int);
                              var25_int = var25_int + var26;
                              break L23;
                            }
                          }
                        }
                      }
                    }
                    L26: {
                      stackIn_92_0 = var12.field_Nb;

                      if (rca.field_p) {
                        stackIn_93_0 = (jea) ((Object) stackIn_92_0);
                        stackIn_93_1 = 42;
                        break L26;
                      } else {
                        stackIn_93_0 = (jea) ((Object) stackIn_92_0);
                        stackIn_93_1 = 0;
                        break L26;
                      }
                    }
                    L27: {
                      L28: {
                        ((jea) (Object) stackIn_93_0).a(-stackIn_93_1 + var12.field_G - var25_int, di.field_a, param4 + -23778, var19, var25_int);
                        var12.field_Db.field_r = Integer.toString(var12.field_Jb);
                        var12.field_Db.a(40, di.field_a, -23776, var19, var12.field_G - 40);
                        if (!var12.field_Nb.field_o) {
                          break L28;
                        } else {
                          if (var22 != 0) {
                            qda.field_b = var12.field_wb;
                            if (null == ql.field_m) {
                              break L27;
                            } else {
                              if (null != ql.field_m[var12.field_Ab]) {
                                qda.field_b = qda.field_b + " - " + ql.field_m[var12.field_Ab];
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                          } else {
                            break L28;
                          }
                        }
                      }
                      if (!var12.field_Nb.field_o) {
                        break L27;
                      } else {
                        if (null == ql.field_m) {
                          break L27;
                        } else {
                          if (null != ql.field_m[var12.field_Ab]) {
                            qda.field_b = ql.field_m[var12.field_Ab];
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                    var19 = var19 + di.field_a;
                    break L18;
                  }
                }
                L29: {
                  var23 = ua.a(var12.field_Lb, var20, -65);
                  var24 = var23;
                  var30 = var24;
                  var25 = var30;
                  var24 = var23;
                  if (var23 == null) {
                    break L29;
                  } else {
                    var24_int = var12.field_Gb.field_H.a(var23, -mna.field_d + -mna.field_d + var12.field_G);
                    var12.field_Gb.field_r = var23;
                    var12.field_Gb.field_s = var12.field_xb * 256 / qsa.field_a;
                    var12.field_Gb.a(var12.field_G - 2 * mna.field_d, di.field_a * var24_int, -23776, var19, mna.field_d);
                    var19 = var19 + di.field_a * var24_int;
                    break L29;
                  }
                }
                L30: {
                  if (var9 != 0) {
                    break L30;
                  } else {
                    var12.field_O = var19 - var12.field_t;
                    break L30;
                  }
                }
                L31: {
                  if (var13 != 0) {
                    param0.field_tb.a(2, (jea) (var11), var12, (byte) -122);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (var12.field_y == 0) {
                    break L32;
                  } else {
                    if (!var12.f(162)) {
                      if (var12.field_Kb.field_y != 0) {
                        fv.a((byte) 92, param1, var12.field_yb);
                        break L32;
                      } else {
                        if (0 == var12.field_Cb.field_y) {
                          rc.a(jm.field_m, lba.field_p, var12, (byte) -93, 0, 0, param0);
                          break L32;
                        } else {
                          fn.a(param1, var12.field_yb, -118);
                          break L32;
                        }
                      }
                    } else {
                      break L32;
                    }
                  }
                }
                L33: {
                  if (!var12.field_pb) {
                    break L33;
                  } else {
                    if (var12.f(162)) {
                      break L33;
                    } else {
                      L34: {
                        var24 = null;
                        if (rb.field_r == var12.field_yb) {
                          L35: {
                            if (var5_int == 0) {
                              break L35;
                            } else {
                              if (var12.field_tb) {
                                break L35;
                              } else {
                                var24 = rk.field_F;
                                break L34;
                              }
                            }
                          }
                          if (var7 > var12.field_zb) {
                            L36: {
                              var25_int = var7 + -var12.field_zb;
                              if (-2 != (var25_int ^ -1)) {
                                break L36;
                              } else {
                                var24 = rpa.field_c;
                                break L36;
                              }
                            }
                            var24 = gl.a((byte) 92, ifa.field_r, new String[]{null, Integer.toString(var25_int)});
                            var30 = var24;
                            var25 = var30;
                            var24 = var25;
                            var30 = var24;
                            var25 = var30;
                            break L34;
                          } else {
                            if (var6 <= var12.field_Jb) {
                              if (0 != ((var12.field_Eb ^ -1) & var8)) {
                                var25_int = b.a((var12.field_Eb ^ -1) & var8, (byte) -107);
                                var24 = gh.field_f;
                                if (0 >= var25_int) {
                                  break L34;
                                } else {
                                  if (null == kh.field_l) {
                                    break L34;
                                  } else {
                                    if (kh.field_l.length < var25_int) {
                                      break L34;
                                    } else {
                                      if (null == kh.field_l[-1 + var25_int]) {
                                        break L34;
                                      } else {
                                        var24 = kh.field_l[var25_int + -1][1];
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L34;
                              }
                            } else {
                              var24 = gl.a((byte) 95, tqa.field_k, new String[]{null, Integer.toString(var6)});
                              break L34;
                            }
                          }
                        } else {
                          L37: {
                            if (var5_int == 0) {
                              break L37;
                            } else {
                              if (var12.field_tb) {
                                break L37;
                              } else {
                                var24 = gl.a((byte) 96, qra.field_g, new String[]{var20});
                                break L34;
                              }
                            }
                          }
                          if (var7 <= var12.field_zb) {
                            if (var12.field_Jb >= var6) {
                              if ((var8 & (var12.field_Eb ^ -1)) != 0) {
                                var25_int = b.a((var12.field_Eb ^ -1) & var8, (byte) -125);
                                var24 = gl.a((byte) 86, wha.field_I, new String[]{var20});
                                if ((var25_int ^ -1) >= -1) {
                                  break L34;
                                } else {
                                  if (null == kh.field_l) {
                                    break L34;
                                  } else {
                                    if (var25_int > kh.field_l.length) {
                                      break L34;
                                    } else {
                                      if (null == kh.field_l[-1 + var25_int]) {
                                        break L34;
                                      } else {
                                        var24 = gl.a((byte) 121, kh.field_l[var25_int - 1][2], new String[]{var20});
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L34;
                              }
                            } else {
                              var24 = gl.a((byte) 118, gv.field_r, new String[]{var20, Integer.toString(var6)});
                              break L34;
                            }
                          } else {
                            L38: {
                              var25_int = -var12.field_zb + var7;
                              if (1 != var25_int) {
                                break L38;
                              } else {
                                var24 = gl.a((byte) 115, kpa.field_d, new String[]{var20});
                                break L38;
                              }
                            }
                            var24 = gl.a((byte) 97, td.field_q, new String[]{var20, Integer.toString(var25_int)});
                            break L34;
                          }
                        }
                      }
                      if (var24 != null) {
                        var34 = "<col=A00000>" + (String) (var24);
                        var30_ref = var34;
                        var25 = var30_ref;
                        var24 = var25;
                        var30_ref = var34;
                        var25 = var30_ref;
                        var25 = null;
                        var26 = 0;
                        var27_int = 0;
                        L39: while (true) {
                          if (var27_int >= fk.field_b) {
                            L40: {
                              L41: {
                                if (tn.field_n != param0) {
                                  break L41;
                                } else {
                                  if (mka.b(param4 ^ 8194)) {
                                    if (var26 == 0) {
                                      var24 = var34 + "<br>" + gl.a((byte) 114, gd.field_I, new String[]{(String) (var25)});
                                      break L40;
                                    } else {
                                      var24 = var34 + "<br>" + qda.field_l + (String) (var25);
                                      break L40;
                                    }
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                              if (var26 != 0) {
                                var24 = var34 + "<br>" + baa.field_f + (String) (var25);
                                break L40;
                              } else {
                                var24 = var34 + "<br>" + gl.a((byte) 125, jh.field_K, new String[]{(String) (var25)});
                                break L40;
                              }
                            }
                            L42: {
                              if (tn.field_n != param0) {
                                break L42;
                              } else {
                                if (mka.b(8192)) {
                                  break L42;
                                } else {
                                  var27 = uu.field_a.field_tb;
                                  var24 = (String) (var24) + "<br>" + gl.a((byte) 102, dba.field_c, new String[]{var27});
                                  break L42;
                                }
                              }
                            }
                            qda.field_b = (String) (var24);
                            break L33;
                          } else {
                            L43: {
                              var28 = 255 & uu.field_a.field_ac[var27_int];
                              var29 = 0;
                              if (null == rl.field_u) {
                                break L43;
                              } else {
                                if (null != rl.field_u[var27_int]) {
                                  if (!rl.field_u[var27_int][var28]) {
                                    break L43;
                                  } else {
                                    if (!var12.field_tb) {
                                      var29 = 1;
                                      break L43;
                                    } else {
                                      break L43;
                                    }
                                  }
                                } else {
                                  break L43;
                                }
                              }
                            }
                            L44: {
                              if (hp.field_a == null) {
                                break L44;
                              } else {
                                if (null != hp.field_a[var27_int]) {
                                  L45: {
                                    var30_int = hp.field_a[var27_int][var28];
                                    if (var30_int == 0) {
                                      break L45;
                                    } else {
                                      if (dea.field_c) {
                                        break L45;
                                      } else {
                                        if (!var12.field_tb) {
                                          var29 = 1;
                                          break L45;
                                        } else {
                                          break L45;
                                        }
                                      }
                                    }
                                  }
                                  if (var12.field_Jb >= var30_int) {
                                    break L44;
                                  } else {
                                    var29 = 1;
                                    break L44;
                                  }
                                } else {
                                  break L44;
                                }
                              }
                            }
                            L46: {
                              if (null == nra.field_g) {
                                break L46;
                              } else {
                                if (null != nra.field_g[var27_int]) {
                                  L47: {
                                    var30_int = nra.field_g[var27_int][var28];
                                    if (-1 == (var30_int ^ -1)) {
                                      break L47;
                                    } else {
                                      if (dea.field_c) {
                                        break L47;
                                      } else {
                                        if (!var12.field_tb) {
                                          var29 = 1;
                                          break L47;
                                        } else {
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                  if (var12.field_zb >= var30_int) {
                                    break L46;
                                  } else {
                                    var29 = 1;
                                    break L46;
                                  }
                                } else {
                                  break L46;
                                }
                              }
                            }
                            L48: {
                              if (lga.field_z == null) {
                                break L48;
                              } else {
                                if (lga.field_z[var27_int] != null) {
                                  if (-1 != ((var12.field_Eb ^ -1) & lga.field_z[var27_int][var28] ^ -1)) {
                                    var29 = 1;
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                } else {
                                  break L48;
                                }
                              }
                            }
                            if (var29 != 0) {
                              L49: {
                                var30_ref = "<col=A00000>" + kma.field_e[var27_int] + "</col>";
                                var25 = var30_ref;
                                var24 = var25;
                                var25 = var30_ref;
                                if (var25 == null) {
                                  var25 = var30_ref;
                                  var24 = var25;
                                  var24 = var25;
                                  break L49;
                                } else {
                                  var25 = (String) (var25) + ", " + var30_ref;
                                  var26 = 1;
                                  break L49;
                                }
                              }
                              var27_int++;
                              continue L39;
                            } else {
                              var27_int++;
                              continue L39;
                            }
                          }
                        }
                      } else {
                        break L33;
                      }
                    }
                  }
                }
                var11 = var12;
                var12 = (pha) ((Object) var10.e(124));
                continue L12;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L50: {
            var5 = decompiledCaughtException;
            stackIn_216_0 = (RuntimeException) (var5);

            stackIn_216_1 = new StringBuilder().append("ava.A(");

            if (param0 == null) {
              stackIn_217_0 = (RuntimeException) ((Object) stackIn_216_0);
              stackIn_217_1 = (StringBuilder) ((Object) stackIn_216_1);
              stackIn_217_2 = "null";
              break L50;
            } else {
              stackIn_217_0 = (RuntimeException) ((Object) stackIn_216_0);
              stackIn_217_1 = (StringBuilder) ((Object) stackIn_216_1);
              stackIn_217_2 = "{...}";
              break L50;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_217_0), stackIn_217_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_f = null;
    }

    ava(int param0, int param1, int param2, int param3, byte param4) {
        this.field_b = param3;
        this.field_g = param0;
        this.field_e = param4;
        this.field_a = param1;
        this.field_c = param2;
    }

    static {
        field_d = 0;
    }
}
