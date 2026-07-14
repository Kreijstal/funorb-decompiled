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
            return null;
        }
        return new ava(((ava) this).field_g, param3, param1, param2, ((ava) this).field_e);
    }

    final static void a(iv param0, int param1, int param2, boolean param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        vna var10 = null;
        pha var11 = null;
        int var11_int = 0;
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
        String var23 = null;
        int var23_int = 0;
        String var24 = null;
        int var24_int = 0;
        String var24_ref = null;
        String var25 = null;
        int var25_int = 0;
        int var26 = 0;
        int var27_int = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        iv stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        boolean stackIn_38_2 = false;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        int stackIn_38_5 = 0;
        iv stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        boolean stackIn_39_2 = false;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        int stackIn_39_5 = 0;
        iv stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        boolean stackIn_40_2 = false;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        int stackIn_40_5 = 0;
        int stackIn_40_6 = 0;
        int stackIn_43_0 = 0;
        int stackIn_55_0 = 0;
        jea stackIn_89_0 = null;
        jea stackIn_90_0 = null;
        jea stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        iv stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        boolean stackOut_37_2 = false;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        int stackOut_37_5 = 0;
        iv stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        boolean stackOut_39_2 = false;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        int stackOut_39_5 = 0;
        int stackOut_39_6 = 0;
        iv stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        boolean stackOut_38_2 = false;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        int stackOut_38_5 = 0;
        int stackOut_38_6 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        jea stackOut_88_0 = null;
        jea stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        jea stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        L0: {
          var31 = TombRacer.field_G ? 1 : 0;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (uu.field_a == null) {
            break L0;
          } else {
            L1: {
              if (rl.field_u != null) {
                break L1;
              } else {
                if (hp.field_a != null) {
                  break L1;
                } else {
                  if (nra.field_g != null) {
                    break L1;
                  } else {
                    if (lga.field_z == null) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var9 = 0;
            L2: while (true) {
              if (fk.field_b <= var9) {
                break L0;
              } else {
                L3: {
                  var10_int = 255 & uu.field_a.field_ac[var9];
                  if (rl.field_u == null) {
                    break L3;
                  } else {
                    if (null == rl.field_u[var9]) {
                      break L3;
                    } else {
                      if (rl.field_u[var9][var10_int]) {
                        var5 = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (null == hp.field_a) {
                    break L4;
                  } else {
                    if (hp.field_a[var9] != null) {
                      L5: {
                        var11_int = hp.field_a[var9][var10_int];
                        if (-1 == (var11_int ^ -1)) {
                          break L5;
                        } else {
                          if (!dea.field_c) {
                            var5 = 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var6 < var11_int) {
                        var6 = var11_int;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  if (lga.field_z == null) {
                    break L6;
                  } else {
                    if (null == lga.field_z[var9]) {
                      break L6;
                    } else {
                      var8 = var8 | lga.field_z[var9][var10_int];
                      break L6;
                    }
                  }
                }
                if (nra.field_g != null) {
                  if (null != nra.field_g[var9]) {
                    L7: {
                      var11_int = nra.field_g[var9][var10_int];
                      if (0 == var11_int) {
                        break L7;
                      } else {
                        if (!dea.field_c) {
                          var5 = 1;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var7 < var11_int) {
                      var7 = var11_int;
                      var9++;
                      continue L2;
                    } else {
                      var9++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    continue L2;
                  }
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          }
        }
        L8: {
          stackOut_37_0 = (iv) param0;
          stackOut_37_1 = 2;
          stackOut_37_2 = param3;
          stackOut_37_3 = 92;
          stackOut_37_4 = param2 * (8 + di.field_a * 4);
          stackOut_37_5 = 2 * (di.field_a + param4);
          stackIn_39_0 = stackOut_37_0;
          stackIn_39_1 = stackOut_37_1;
          stackIn_39_2 = stackOut_37_2;
          stackIn_39_3 = stackOut_37_3;
          stackIn_39_4 = stackOut_37_4;
          stackIn_39_5 = stackOut_37_5;
          stackIn_38_0 = stackOut_37_0;
          stackIn_38_1 = stackOut_37_1;
          stackIn_38_2 = stackOut_37_2;
          stackIn_38_3 = stackOut_37_3;
          stackIn_38_4 = stackOut_37_4;
          stackIn_38_5 = stackOut_37_5;
          if (lu.field_b != param0) {
            stackOut_39_0 = (iv) (Object) stackIn_39_0;
            stackOut_39_1 = stackIn_39_1;
            stackOut_39_2 = stackIn_39_2;
            stackOut_39_3 = stackIn_39_3;
            stackOut_39_4 = stackIn_39_4;
            stackOut_39_5 = stackIn_39_5;
            stackOut_39_6 = 0;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            stackIn_40_2 = stackOut_39_2;
            stackIn_40_3 = stackOut_39_3;
            stackIn_40_4 = stackOut_39_4;
            stackIn_40_5 = stackOut_39_5;
            stackIn_40_6 = stackOut_39_6;
            break L8;
          } else {
            stackOut_38_0 = (iv) (Object) stackIn_38_0;
            stackOut_38_1 = stackIn_38_1;
            stackOut_38_2 = stackIn_38_2;
            stackOut_38_3 = stackIn_38_3;
            stackOut_38_4 = stackIn_38_4;
            stackOut_38_5 = stackIn_38_5;
            stackOut_38_6 = 1;
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_40_2 = stackOut_38_2;
            stackIn_40_3 = stackOut_38_3;
            stackIn_40_4 = stackOut_38_4;
            stackIn_40_5 = stackOut_38_5;
            stackIn_40_6 = stackOut_38_6;
            break L8;
          }
        }
        L9: {
          if (((iv) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_40_4, stackIn_40_5, stackIn_40_6 == 0)) {
            stackOut_42_0 = 0;
            stackIn_43_0 = stackOut_42_0;
            break L9;
          } else {
            stackOut_41_0 = 1;
            stackIn_43_0 = stackOut_41_0;
            break L9;
          }
        }
        var9 = stackIn_43_0;
        var10 = param0.field_tb.field_J;
        var11 = null;
        var12 = (pha) (Object) var10.f(-80);
        L10: while (true) {
          if (var12 == null) {
            return;
          } else {
            L11: {
              var13 = 0;
              if (var12.field_J != null) {
                break L11;
              } else {
                L12: {
                  var12.field_Nb = new jea(0L, lta.field_a);
                  var12.b(-128, var12.field_Nb);
                  var12.field_Db = new jea(0L, iea.field_g);
                  if (rca.field_p) {
                    var12.b(-123, var12.field_Db);
                    break L12;
                  } else {
                    break L12;
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
                break L11;
              }
            }
            L13: {
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
                break L13;
              } else {
                var21 += 42;
                break L13;
              }
            }
            L14: {
              var33 = il.a(var12.field_Nb.field_H, var32, var21);
              var20 = var33;
              var20 = var33;
              if (var33.equals((Object) (Object) var12.field_wb)) {
                stackOut_54_0 = 0;
                stackIn_55_0 = stackOut_54_0;
                break L14;
              } else {
                stackOut_53_0 = 1;
                stackIn_55_0 = stackOut_53_0;
                break L14;
              }
            }
            L15: {
              var22 = stackIn_55_0;
              if (var12.field_Ab < 4) {
                if (-1 > (var12.field_Ab ^ -1)) {
                  var20 = "<img=" + (-1 + var12.field_Ab) + ">" + var33;
                  break L15;
                } else {
                  break L15;
                }
              } else {
                var20 = "<img=" + (csa.field_n + var12.field_Ab + -4) + ">" + var33;
                break L15;
              }
            }
            L16: {
              var12.field_Nb.field_r = var20;
              if (var12.f(162)) {
                break L16;
              } else {
                L17: {
                  L18: {
                    L19: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5 == 0) {
                        break L19;
                      } else {
                        if (!var12.field_tb) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (var6 > var12.field_Jb) {
                      break L18;
                    } else {
                      if (var12.field_zb < var7) {
                        break L18;
                      } else {
                        if ((var8 & (var12.field_Eb ^ -1) ^ -1) < -1) {
                          break L18;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  var23_int = 8414771;
                  var24_int = 8421504;
                  break L17;
                }
                L20: {
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
                      var12.field_Nb.field_r = gl.a((byte) 90, hs.field_b, new String[1]);
                      var12.field_Cb.field_r = mq.field_d;
                      break L20;
                    } else {
                      if (var12.field_Fb) {
                        var12.field_Nb.field_r = gl.a((byte) 105, uaa.field_c, new String[1]);
                        var12.field_Kb.field_r = r.field_l;
                        var12.field_Cb.field_r = sv.field_q;
                        break L20;
                      } else {
                        var12.field_Kb.field_r = vu.field_e;
                        break L20;
                      }
                    }
                  } else {
                    if (uu.field_a.field_ec) {
                      break L20;
                    } else {
                      var12.field_Cb.field_r = vc.field_o;
                      break L20;
                    }
                  }
                }
                L21: {
                  var25_int = 0;
                  if (null == uu.field_a) {
                    break L21;
                  } else {
                    if (!mka.b(8192)) {
                      break L21;
                    } else {
                      if (var12.field_yb == rb.field_r) {
                        break L21;
                      } else {
                        L22: {
                          if (var12.field_Kb.field_r != null) {
                            var26 = var12.field_Kb.b((byte) 69) - -(mna.field_d * 2);
                            var12.field_Kb.a(var26, di.field_a, -23776, var19, var25_int);
                            var25_int = var25_int + var26;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        if (var12.field_Cb.field_r == null) {
                          break L21;
                        } else {
                          L23: {
                            if (param0 == tn.field_n) {
                              var26 = 40;
                              break L23;
                            } else {
                              var26 = var12.field_Cb.b((byte) 69) - -(2 * mna.field_d);
                              break L23;
                            }
                          }
                          var12.field_Cb.a(var26, di.field_a, -23776, var19, var25_int);
                          var25_int = var25_int + var26;
                          break L21;
                        }
                      }
                    }
                  }
                }
                L24: {
                  stackOut_88_0 = var12.field_Nb;
                  stackIn_90_0 = stackOut_88_0;
                  stackIn_89_0 = stackOut_88_0;
                  if (rca.field_p) {
                    stackOut_90_0 = (jea) (Object) stackIn_90_0;
                    stackOut_90_1 = 42;
                    stackIn_91_0 = stackOut_90_0;
                    stackIn_91_1 = stackOut_90_1;
                    break L24;
                  } else {
                    stackOut_89_0 = (jea) (Object) stackIn_89_0;
                    stackOut_89_1 = 0;
                    stackIn_91_0 = stackOut_89_0;
                    stackIn_91_1 = stackOut_89_1;
                    break L24;
                  }
                }
                L25: {
                  L26: {
                    ((jea) (Object) stackIn_91_0).a(-stackIn_91_1 + var12.field_G - var25_int, di.field_a, param4 + -23778, var19, var25_int);
                    var12.field_Db.field_r = Integer.toString(var12.field_Jb);
                    var12.field_Db.a(40, di.field_a, -23776, var19, var12.field_G - 40);
                    if (!var12.field_Nb.field_o) {
                      break L26;
                    } else {
                      if (var22 != 0) {
                        qda.field_b = var12.field_wb;
                        if (null == ql.field_m) {
                          break L25;
                        } else {
                          if (null != ql.field_m[var12.field_Ab]) {
                            qda.field_b = qda.field_b + " - " + ql.field_m[var12.field_Ab];
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                      } else {
                        break L26;
                      }
                    }
                  }
                  if (!var12.field_Nb.field_o) {
                    break L25;
                  } else {
                    if (null == ql.field_m) {
                      break L25;
                    } else {
                      if (null != ql.field_m[var12.field_Ab]) {
                        qda.field_b = ql.field_m[var12.field_Ab];
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                }
                var19 = var19 + di.field_a;
                break L16;
              }
            }
            L27: {
              var23 = ua.a(var12.field_Lb, var20, -65);
              var24 = var23;
              var30 = var24;
              var25 = var30;
              var24 = var23;
              if (var23 == null) {
                break L27;
              } else {
                var24_int = var12.field_Gb.field_H.a(var23, -mna.field_d + -mna.field_d + var12.field_G);
                var12.field_Gb.field_r = var23;
                var12.field_Gb.field_s = var12.field_xb * 256 / qsa.field_a;
                var12.field_Gb.a(var12.field_G - 2 * mna.field_d, di.field_a * var24_int, -23776, var19, mna.field_d);
                var19 = var19 + di.field_a * var24_int;
                break L27;
              }
            }
            L28: {
              if (var9 != 0) {
                break L28;
              } else {
                var12.field_O = var19 - var12.field_t;
                break L28;
              }
            }
            L29: {
              if (var13 != 0) {
                param0.field_tb.a(2, (jea) (Object) var11, (jea) (Object) var12, (byte) -122);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              if (var12.field_y == 0) {
                break L30;
              } else {
                if (!var12.f(162)) {
                  if (var12.field_Kb.field_y != 0) {
                    fv.a((byte) 92, param1, var12.field_yb);
                    break L30;
                  } else {
                    if (0 == var12.field_Cb.field_y) {
                      rc.a(jm.field_m, lba.field_p, var12, (byte) -93, 0, 0, param0);
                      break L30;
                    } else {
                      fn.a(param1, var12.field_yb, -118);
                      break L30;
                    }
                  }
                } else {
                  break L30;
                }
              }
            }
            L31: {
              if (!var12.field_pb) {
                break L31;
              } else {
                if (var12.f(162)) {
                  break L31;
                } else {
                  L32: {
                    var24 = null;
                    if (rb.field_r == var12.field_yb) {
                      L33: {
                        if (var5 == 0) {
                          break L33;
                        } else {
                          if (var12.field_tb) {
                            break L33;
                          } else {
                            var24 = rk.field_F;
                            break L32;
                          }
                        }
                      }
                      if (var7 > var12.field_zb) {
                        L34: {
                          var25_int = var7 + -var12.field_zb;
                          if (-2 != (var25_int ^ -1)) {
                            break L34;
                          } else {
                            var24 = rpa.field_c;
                            break L34;
                          }
                        }
                        var24 = gl.a((byte) 92, ifa.field_r, new String[2]);
                        var30 = var24;
                        var25 = var30;
                        var24 = var25;
                        var30 = var24;
                        var25 = var30;
                        break L32;
                      } else {
                        if (var6 <= var12.field_Jb) {
                          if (0 != ((var12.field_Eb ^ -1) & var8)) {
                            var25_int = b.a((var12.field_Eb ^ -1) & var8, (byte) -107);
                            var24 = gh.field_f;
                            if (0 >= var25_int) {
                              break L32;
                            } else {
                              if (null == kh.field_l) {
                                break L32;
                              } else {
                                if (kh.field_l.length < var25_int) {
                                  break L32;
                                } else {
                                  if (null == kh.field_l[-1 + var25_int]) {
                                    break L32;
                                  } else {
                                    var24_ref = kh.field_l[var25_int + -1][1];
                                    break L32;
                                  }
                                }
                              }
                            }
                          } else {
                            break L32;
                          }
                        } else {
                          var24 = gl.a((byte) 95, tqa.field_k, new String[2]);
                          break L32;
                        }
                      }
                    } else {
                      L35: {
                        if (var5 == 0) {
                          break L35;
                        } else {
                          if (var12.field_tb) {
                            break L35;
                          } else {
                            var24 = gl.a((byte) 96, qra.field_g, new String[1]);
                            break L32;
                          }
                        }
                      }
                      if (var7 <= var12.field_zb) {
                        if (var12.field_Jb >= var6) {
                          if ((var8 & (var12.field_Eb ^ -1)) != 0) {
                            var25_int = b.a((var12.field_Eb ^ -1) & var8, (byte) -125);
                            var24 = gl.a((byte) 86, wha.field_I, new String[1]);
                            if ((var25_int ^ -1) >= -1) {
                              break L32;
                            } else {
                              if (null == kh.field_l) {
                                break L32;
                              } else {
                                if (var25_int > kh.field_l.length) {
                                  break L32;
                                } else {
                                  if (null == kh.field_l[-1 + var25_int]) {
                                    break L32;
                                  } else {
                                    var24 = gl.a((byte) 121, kh.field_l[var25_int - 1][2], new String[1]);
                                    break L32;
                                  }
                                }
                              }
                            }
                          } else {
                            break L32;
                          }
                        } else {
                          var24 = gl.a((byte) 118, gv.field_r, new String[2]);
                          break L32;
                        }
                      } else {
                        L36: {
                          var25_int = -var12.field_zb + var7;
                          if (1 != var25_int) {
                            break L36;
                          } else {
                            var24 = gl.a((byte) 115, kpa.field_d, new String[1]);
                            break L36;
                          }
                        }
                        var24 = gl.a((byte) 97, td.field_q, new String[2]);
                        break L32;
                      }
                    }
                  }
                  if (var24 != null) {
                    var34 = "<col=A00000>" + var24;
                    var30 = var34;
                    var25 = var30;
                    var24 = var25;
                    var30 = var34;
                    var25 = var30;
                    var25 = null;
                    var26 = 0;
                    var27_int = 0;
                    L37: while (true) {
                      if (var27_int >= fk.field_b) {
                        L38: {
                          L39: {
                            if (tn.field_n != param0) {
                              break L39;
                            } else {
                              if (mka.b(param4 ^ 8194)) {
                                if (var26 == 0) {
                                  var24 = var34 + "<br>" + gl.a((byte) 114, gd.field_I, new String[1]);
                                  break L38;
                                } else {
                                  var24 = var34 + "<br>" + qda.field_l + var25;
                                  break L38;
                                }
                              } else {
                                break L39;
                              }
                            }
                          }
                          if (var26 != 0) {
                            var24 = var34 + "<br>" + baa.field_f + var25;
                            break L38;
                          } else {
                            var24 = var34 + "<br>" + gl.a((byte) 125, jh.field_K, new String[1]);
                            break L38;
                          }
                        }
                        L40: {
                          if (tn.field_n != param0) {
                            break L40;
                          } else {
                            if (mka.b(8192)) {
                              break L40;
                            } else {
                              var27 = uu.field_a.field_tb;
                              var24 = var24 + "<br>" + gl.a((byte) 102, dba.field_c, new String[1]);
                              break L40;
                            }
                          }
                        }
                        qda.field_b = var24;
                        break L31;
                      } else {
                        L41: {
                          var28 = 255 & uu.field_a.field_ac[var27_int];
                          var29 = 0;
                          if (null == rl.field_u) {
                            break L41;
                          } else {
                            if (null != rl.field_u[var27_int]) {
                              if (!rl.field_u[var27_int][var28]) {
                                break L41;
                              } else {
                                if (!var12.field_tb) {
                                  var29 = 1;
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                            } else {
                              break L41;
                            }
                          }
                        }
                        L42: {
                          if (hp.field_a == null) {
                            break L42;
                          } else {
                            if (null != hp.field_a[var27_int]) {
                              L43: {
                                var30_int = hp.field_a[var27_int][var28];
                                if (var30_int == 0) {
                                  break L43;
                                } else {
                                  if (dea.field_c) {
                                    break L43;
                                  } else {
                                    if (!var12.field_tb) {
                                      var29 = 1;
                                      break L43;
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                              }
                              if (var12.field_Jb >= var30_int) {
                                break L42;
                              } else {
                                var29 = 1;
                                break L42;
                              }
                            } else {
                              break L42;
                            }
                          }
                        }
                        L44: {
                          if (null == nra.field_g) {
                            break L44;
                          } else {
                            if (null != nra.field_g[var27_int]) {
                              L45: {
                                var30_int = nra.field_g[var27_int][var28];
                                if (-1 == (var30_int ^ -1)) {
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
                              if (var12.field_zb >= var30_int) {
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
                          if (lga.field_z == null) {
                            break L46;
                          } else {
                            if (lga.field_z[var27_int] != null) {
                              if (-1 != (var12.field_Eb & lga.field_z[var27_int][var28])) {
                                var29 = 1;
                                break L46;
                              } else {
                                break L46;
                              }
                            } else {
                              break L46;
                            }
                          }
                        }
                        if (var29 != 0) {
                          var30 = "<col=A00000>" + kma.field_e[var27_int] + "</col>";
                          var25 = var30;
                          var24 = var25;
                          var25 = var30;
                          if (var25 == null) {
                            var25 = var30;
                            var24 = var25;
                            var24 = var25;
                            var27_int++;
                            continue L37;
                          } else {
                            var25 = var25 + ", " + var30;
                            var26 = 1;
                            var27_int++;
                            continue L37;
                          }
                        } else {
                          var27_int++;
                          continue L37;
                        }
                      }
                    }
                  } else {
                    break L31;
                  }
                }
              }
            }
            var11 = var12;
            var12 = (pha) (Object) var10.e(124);
            continue L10;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_f = null;
    }

    ava(int param0, int param1, int param2, int param3, byte param4) {
        ((ava) this).field_b = param3;
        ((ava) this).field_g = param0;
        ((ava) this).field_e = param4;
        ((ava) this).field_a = param1;
        ((ava) this).field_c = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
