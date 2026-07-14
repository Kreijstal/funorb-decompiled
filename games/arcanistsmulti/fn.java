/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    static String[] field_c;
    static String[] field_g;
    static String field_a;
    static String field_h;
    static kc field_e;
    static String field_i;
    static String field_f;
    static qb[] field_b;
    static String field_d;

    final static void a(int param0, String param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          bi.field_U.field_rb = param1;
          if (-3 != (nj.field_c ^ -1)) {
            ih.field_d.field_rb = um.field_e;
            break L0;
          } else {
            ih.field_d.field_rb = dk.field_b;
            break L0;
          }
        }
        var9 = 495;
        var10 = 5;
        ck.field_d.a(-10 + var9, 5, var10, param2, (byte) -120);
        wn.field_D.a(-sa.field_Cb.field_x + ck.field_d.field_x, 0, 0, param2, (byte) -120);
        if (param4 == -104) {
          var10 = var10 + (param6 + param2);
          sa.field_Cb.a(sa.field_Cb.field_x, wn.field_D.field_x, 0, param2, (byte) -120);
          hf.field_f.a(hf.field_f.c(-25921), 5, var10, param3, (byte) -120);
          var11 = ih.field_d.c(-25921);
          ih.field_d.a(var11, -5 + (var9 + -var11), var10, param3, (byte) -120);
          bi.field_U.a(var9, 0, 0, param0, (byte) -120);
          var12 = var10 - -param3 - -5;
          in.field_Jb.a(var9, 0, param0, var12, (byte) -120);
          in.field_Jb.field_v = of.a(3, in.field_Jb.field_I, 1, 2105376, 11579568, 8421504);
          var12 = var12 + param0;
          tm.field_d.a(var9, -(var9 / 2) + param7, param8 + -(var12 / 2), var12, (byte) -120);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1) {
        gb.field_f = 0;
        if (param1 >= -98) {
            return;
        }
        bm.field_d = new int[3];
        hj.field_b = param0;
        g.field_d = new jg[param0 * 15];
    }

    final static int a(boolean param0, byte param1, CharSequence param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          if (2 > param3) {
            break L0;
          } else {
            if (-37 <= (param3 ^ -1)) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              if (param1 == -40) {
                var7 = param2.length();
                var8 = 0;
                L1: while (true) {
                  if (var7 <= var8) {
                    if (var5 != 0) {
                      return var6;
                    } else {
                      throw new NumberFormatException();
                    }
                  } else {
                    L2: {
                      var9 = param2.charAt(var8);
                      if (-1 == (var8 ^ -1)) {
                        if (var9 == 45) {
                          var4 = 1;
                          var8++;
                          continue L1;
                        } else {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param0) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (var9 < 48) {
                          break L4;
                        } else {
                          if (var9 <= 57) {
                            var9 -= 48;
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var9 < 65) {
                          break L5;
                        } else {
                          if (var9 <= 90) {
                            var9 -= 55;
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 97) {
                          break L6;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (param3 <= var9) {
                      throw new NumberFormatException();
                    } else {
                      L7: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10 = var9 + param3 * var6;
                      if (var10 / param3 != var6) {
                        throw new NumberFormatException();
                      } else {
                        var6 = var10;
                        var5 = 1;
                        var8++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                return -17;
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3, int param4, int param5, boolean param6, int param7, boolean param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          if (param3) {
            break L0;
          } else {
            L1: {
              if (fh.field_g != de.field_e) {
                break L1;
              } else {
                if (ri.field_a == de.field_j) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (de.field_j != ce.field_m.field_m) {
              break L0;
            } else {
              if (de.field_e == ce.field_m.field_e) {
                if (wi.field_f != null) {
                  io.a(124, false);
                  break L0;
                } else {
                  if (null == om.field_x) {
                    ao.a((byte) -124);
                    break L0;
                  } else {
                    io.a(13, true);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (!param3) {
            sa.field_Hb = (fh.field_g - 640) / 2;
            break L2;
          } else {
            sa.field_Hb = bd.field_a;
            break L2;
          }
        }
        L3: {
          gl.a(param3, 0);
          if (-1 <= ce.field_h) {
            break L3;
          } else {
            eh.a(param1, param3, 4, param7);
            break L3;
          }
        }
        L4: {
          jf.field_d.field_X = 1;
          jf.field_d.field_t = j.field_f.field_t;
          if (-1 >= sm.field_a) {
            break L4;
          } else {
            ng.a(param3, param7, param1, 118);
            break L4;
          }
        }
        L5: {
          if (-1 <= (oo.field_y ^ -1)) {
            break L5;
          } else {
            c.a(param7, param3, param0, 2, param1);
            break L5;
          }
        }
        L6: {
          L7: {
            if (!so.field_j) {
              break L7;
            } else {
              if (wi.field_f.field_Rb < wi.field_f.field_dc) {
                break L7;
              } else {
                mj.field_s.field_ub = false;
                nj.field_m.field_Hb.field_rb = ck.field_f;
                fc.a((byte) -103, nj.field_m.field_Cb);
                break L6;
              }
            }
          }
          nj.field_m.field_Hb.field_rb = null;
          mj.field_s.field_ub = true;
          fn.a(param2, nj.field_m, param6, param7, true);
          break L6;
        }
        var10 = -105 / ((-23 - param9) / 50);
        pe.a(param7, param2, param5, 0, param4, param8, param6);
        fn.a(param2, lf.field_b, param6, param7, true);
        sb.field_e = sb.field_e + 1;
    }

    final static cg a(long param0, int param1) {
        if (param1 < 109) {
            return null;
        }
        return (cg) (Object) bc.field_c.a(param0, (byte) -63);
    }

    private final static void a(int param0, dn param1, boolean param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        vn var10 = null;
        cg var11 = null;
        int var11_int = 0;
        cg var12 = null;
        int var13 = 0;
        kc var14 = null;
        kc var15 = null;
        kc var16 = null;
        kc var17 = null;
        kc var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        String var24 = null;
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
        dn stackIn_39_0 = null;
        dn stackIn_40_0 = null;
        dn stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_58_0 = 0;
        kc stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        kc stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        kc stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        dn stackOut_38_0 = null;
        dn stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        dn stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        kc stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        kc stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        kc stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        L0: {
          var31 = ArcanistsMulti.field_G ? 1 : 0;
          var5 = 0;
          var6 = 0;
          var7 = 0;
          if (param4) {
            break L0;
          } else {
            fn.a((byte) -126);
            break L0;
          }
        }
        L1: {
          var8 = 0;
          if (wi.field_f == null) {
            break L1;
          } else {
            L2: {
              if (dh.field_Hb != null) {
                break L2;
              } else {
                if (pe.field_Fb != null) {
                  break L2;
                } else {
                  if (dk.field_a != null) {
                    break L2;
                  } else {
                    if (null != ue.field_b) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var9 = 0;
            L3: while (true) {
              if (var9 >= vf.field_l) {
                break L1;
              } else {
                L4: {
                  var10_int = 255 & wi.field_f.field_Wb[var9];
                  if (null == dh.field_Hb) {
                    break L4;
                  } else {
                    if (null != dh.field_Hb[var9]) {
                      if (!dh.field_Hb[var9][var10_int]) {
                        break L4;
                      } else {
                        var5 = 1;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (pe.field_Fb == null) {
                    break L5;
                  } else {
                    if (pe.field_Fb[var9] != null) {
                      L6: {
                        var11_int = pe.field_Fb[var9][var10_int];
                        if (var11_int == 0) {
                          break L6;
                        } else {
                          if (!gm.field_c) {
                            var5 = 1;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var11_int > var6) {
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
                  if (null == dk.field_a) {
                    break L7;
                  } else {
                    if (dk.field_a[var9] == null) {
                      break L7;
                    } else {
                      L8: {
                        var11_int = dk.field_a[var9][var10_int];
                        if (var7 >= var11_int) {
                          break L8;
                        } else {
                          var7 = var11_int;
                          break L8;
                        }
                      }
                      if (0 == var11_int) {
                        break L7;
                      } else {
                        if (!gm.field_c) {
                          var5 = 1;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                if (null != ue.field_b) {
                  if (ue.field_b[var9] != null) {
                    var8 = var8 | ue.field_b[var9][var10_int];
                    var9++;
                    continue L3;
                  } else {
                    var9++;
                    continue L3;
                  }
                } else {
                  var9++;
                  continue L3;
                }
              }
            }
          }
        }
        L9: {
          stackOut_38_0 = (dn) param1;
          stackIn_40_0 = stackOut_38_0;
          stackIn_39_0 = stackOut_38_0;
          if (dd.field_h != param1) {
            stackOut_40_0 = (dn) (Object) stackIn_40_0;
            stackOut_40_1 = 0;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            break L9;
          } else {
            stackOut_39_0 = (dn) (Object) stackIn_39_0;
            stackOut_39_1 = 1;
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            break L9;
          }
        }
        L10: {
          if (((dn) (Object) stackIn_41_0).a(stackIn_41_1 == 0, (byte) 98, 2 * (ga.field_r - -2), 2, (8 + 4 * ga.field_r) * param0, param2)) {
            stackOut_43_0 = 0;
            stackIn_44_0 = stackOut_43_0;
            break L10;
          } else {
            stackOut_42_0 = 1;
            stackIn_44_0 = stackOut_42_0;
            break L10;
          }
        }
        var9 = stackIn_44_0;
        var10 = param1.field_Cb.field_G;
        var11 = null;
        var12 = (cg) (Object) var10.b(12623);
        L11: while (true) {
          if (var12 == null) {
            return;
          } else {
            L12: {
              var13 = 0;
              if (var12.field_G == null) {
                L13: {
                  var12.field_Fb = new kc(0L, qa.field_j);
                  var12.a(var12.field_Fb, 114);
                  var12.field_Gb = new kc(0L, le.field_E);
                  if (fc.field_a) {
                    var12.a(var12.field_Gb, 17);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var12.field_Gb.field_X = 2;
                var12.field_Cb = new kc(0L, pg.field_c);
                var12.a(var12.field_Cb, 109);
                var12.e((byte) 20);
                var12.field_Hb = new kc(0L, ml.field_V);
                var12.a(var12.field_Hb, 43);
                var12.field_Ub = new kc(0L, sl.field_S);
                var12.a(var12.field_Ub, 107);
                var13 = 1;
                break L12;
              } else {
                break L12;
              }
            }
            L14: {
              var12.field_Fb.field_rb = null;
              var12.field_Fb.field_I = 0;
              var14 = var12.field_Fb;
              var12.field_Gb.field_rb = null;
              var14.field_x = 0;
              var15 = var12.field_Gb;
              var12.field_Gb.field_I = 0;
              var12.field_Hb.field_rb = null;
              var15.field_x = 0;
              var12.field_Hb.field_I = 0;
              var16 = var12.field_Hb;
              var12.field_Ub.field_rb = null;
              var16.field_x = 0;
              var17 = var12.field_Ub;
              var12.field_Ub.field_I = 0;
              var17.field_x = 0;
              var12.field_Cb.field_rb = null;
              var12.field_Cb.field_I = 0;
              var18 = var12.field_Cb;
              var18.field_x = 0;
              var12.field_x = param1.field_Cb.field_x;
              var19 = 0;
              var32 = var12.field_Qb;
              var20 = var32;
              var20 = var32;
              var21 = 72;
              if (param1 == nj.field_m) {
                var21 += 42;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var33 = dj.a(var12.field_Fb.field_Z, var32, var21);
              var20 = var33;
              var20 = var33;
              if (var33.equals((Object) (Object) var12.field_Qb)) {
                stackOut_57_0 = 0;
                stackIn_58_0 = stackOut_57_0;
                break L15;
              } else {
                stackOut_56_0 = 1;
                stackIn_58_0 = stackOut_56_0;
                break L15;
              }
            }
            L16: {
              var22 = stackIn_58_0;
              if (var12.field_Mb < 4) {
                if ((var12.field_Mb ^ -1) < -1) {
                  var20 = "<img=" + (-1 + var12.field_Mb) + ">" + var33;
                  break L16;
                } else {
                  break L16;
                }
              } else {
                var20 = "<img=" + (var12.field_Mb - 4 - -dg.field_u) + ">" + var33;
                break L16;
              }
            }
            L17: {
              var12.field_Fb.field_rb = var20;
              if (!var12.e(183874081)) {
                L18: {
                  L19: {
                    L20: {
                      var23_int = 16764006;
                      var24_int = 16777215;
                      if (var5 == 0) {
                        break L20;
                      } else {
                        if (!var12.field_Jb) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    if (var6 > var12.field_Pb) {
                      break L19;
                    } else {
                      if (var7 > var12.field_Vb) {
                        break L19;
                      } else {
                        if (((var12.field_Bb ^ -1) & var8 ^ -1) < -1) {
                          break L19;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  var24_int = 8421504;
                  var23_int = 8414771;
                  break L18;
                }
                L21: {
                  var12.field_Hb.field_ob = var23_int;
                  var12.field_Gb.field_ob = var23_int;
                  var12.field_Fb.field_ob = var23_int;
                  var12.field_Fb.field_zb = var24_int;
                  var12.field_Fb.field_J = var24_int;
                  var12.field_Fb.field_eb = var24_int;
                  var12.field_Gb.field_zb = var24_int;
                  var12.field_Gb.field_J = var24_int;
                  var12.field_Gb.field_eb = var24_int;
                  var12.field_Hb.field_zb = var24_int;
                  var12.field_Hb.field_J = var24_int;
                  var12.field_Hb.field_eb = var24_int;
                  if (lf.field_b == param1) {
                    if (wi.field_f.field_Lb) {
                      break L21;
                    } else {
                      var12.field_Ub.field_rb = ej.field_L;
                      break L21;
                    }
                  } else {
                    if (!var12.field_Db) {
                      if (!var12.field_Kb) {
                        var12.field_Hb.field_rb = ah.field_a;
                        break L21;
                      } else {
                        var12.field_Fb.field_rb = tj.a(-37, new String[1], rl.field_n);
                        var12.field_Hb.field_rb = dh.field_Nb;
                        var12.field_Ub.field_rb = qc.field_f;
                        break L21;
                      }
                    } else {
                      var12.field_Fb.field_rb = tj.a(-123, new String[1], mf.field_h);
                      var12.field_Ub.field_rb = sa.field_Eb;
                      break L21;
                    }
                  }
                }
                L22: {
                  var25_int = 0;
                  if (null == wi.field_f) {
                    break L22;
                  } else {
                    if (!qk.k((byte) 110)) {
                      break L22;
                    } else {
                      if ((qf.field_a ^ -1L) == (var12.field_Nb ^ -1L)) {
                        break L22;
                      } else {
                        L23: {
                          if (var12.field_Hb.field_rb != null) {
                            var26 = var12.field_Hb.c(-25921) - -(dh.field_Gb * 2);
                            var12.field_Hb.a(var26, var25_int, var19, ga.field_r, (byte) -120);
                            var25_int = var25_int + var26;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        if (null != var12.field_Ub.field_rb) {
                          L24: {
                            if (param1 == lf.field_b) {
                              var26 = 40;
                              break L24;
                            } else {
                              var26 = var12.field_Ub.c(-25921) - -(dh.field_Gb * 2);
                              break L24;
                            }
                          }
                          var12.field_Ub.a(var26, var25_int, var19, ga.field_r, (byte) -120);
                          var25_int = var25_int + var26;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                }
                L25: {
                  stackOut_93_0 = var12.field_Fb;
                  stackOut_93_1 = -var25_int + var12.field_x;
                  stackIn_95_0 = stackOut_93_0;
                  stackIn_95_1 = stackOut_93_1;
                  stackIn_94_0 = stackOut_93_0;
                  stackIn_94_1 = stackOut_93_1;
                  if (fc.field_a) {
                    stackOut_95_0 = (kc) (Object) stackIn_95_0;
                    stackOut_95_1 = stackIn_95_1;
                    stackOut_95_2 = 42;
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    stackIn_96_2 = stackOut_95_2;
                    break L25;
                  } else {
                    stackOut_94_0 = (kc) (Object) stackIn_94_0;
                    stackOut_94_1 = stackIn_94_1;
                    stackOut_94_2 = 0;
                    stackIn_96_0 = stackOut_94_0;
                    stackIn_96_1 = stackOut_94_1;
                    stackIn_96_2 = stackOut_94_2;
                    break L25;
                  }
                }
                ((kc) (Object) stackIn_96_0).a(stackIn_96_1 + -stackIn_96_2, var25_int, var19, ga.field_r, (byte) -120);
                var12.field_Gb.field_rb = Integer.toString(var12.field_Pb);
                var12.field_Gb.a(40, -40 + var12.field_x, var19, ga.field_r, (byte) -120);
                var19 = var19 + ga.field_r;
                if (var12.field_Fb.field_C) {
                  if (var22 != 0) {
                    kh.field_c = var12.field_Qb;
                    if (null == rf.field_p) {
                      break L17;
                    } else {
                      if (rf.field_p[var12.field_Mb] == null) {
                        break L17;
                      } else {
                        kh.field_c = kh.field_c + " - " + rf.field_p[var12.field_Mb];
                        break L17;
                      }
                    }
                  } else {
                    if (!var12.field_Fb.field_C) {
                      break L17;
                    } else {
                      if (rf.field_p == null) {
                        break L17;
                      } else {
                        if (null == rf.field_p[var12.field_Mb]) {
                          break L17;
                        } else {
                          kh.field_c = rf.field_p[var12.field_Mb];
                          break L17;
                        }
                      }
                    }
                  }
                } else {
                  if (!var12.field_Fb.field_C) {
                    break L17;
                  } else {
                    if (rf.field_p == null) {
                      break L17;
                    } else {
                      if (null == rf.field_p[var12.field_Mb]) {
                        break L17;
                      } else {
                        kh.field_c = rf.field_p[var12.field_Mb];
                        break L17;
                      }
                    }
                  }
                }
              } else {
                break L17;
              }
            }
            L26: {
              var23 = u.a((byte) -128, var12.field_Sb, var20);
              var24 = var23;
              var30 = var24;
              var25 = var30;
              var24 = var23;
              if (var23 != null) {
                var24_int = var12.field_Cb.field_Z.a(var23, var12.field_x - (dh.field_Gb - -dh.field_Gb));
                var12.field_Cb.field_rb = var23;
                var12.field_Cb.field_u = var12.field_Eb * 256 / vd.field_i;
                var12.field_Cb.a(-(dh.field_Gb * 2) + var12.field_x, dh.field_Gb, var19, ga.field_r * var24_int, (byte) -120);
                var19 = var19 + var24_int * ga.field_r;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (var9 == 0) {
                var12.field_B = -var12.field_I + var19;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              if (var13 == 0) {
                break L28;
              } else {
                param1.field_Cb.a((byte) 119, (kc) (Object) var11, (kc) (Object) var12, 2);
                break L28;
              }
            }
            L29: {
              if (var12.field_U == 0) {
                break L29;
              } else {
                if (var12.e(183874081)) {
                  break L29;
                } else {
                  if (var12.field_Hb.field_U != -1) {
                    qo.a(param3, (byte) -85, var12.field_Nb);
                    break L29;
                  } else {
                    if (-1 == var12.field_Ub.field_U) {
                      mj.a(0, var12, 3, pb.field_h, param1, 0, ja.field_s);
                      break L29;
                    } else {
                      na.a(var12.field_Nb, -89, param3);
                      break L29;
                    }
                  }
                }
              }
            }
            L30: {
              var11 = var12;
              if (!var12.field_A) {
                break L30;
              } else {
                if (var12.e(183874081)) {
                  break L30;
                } else {
                  L31: {
                    var24 = null;
                    if ((var12.field_Nb ^ -1L) == (qf.field_a ^ -1L)) {
                      L32: {
                        if (var5 == 0) {
                          break L32;
                        } else {
                          if (var12.field_Jb) {
                            break L32;
                          } else {
                            var24 = wl.field_P;
                            break L31;
                          }
                        }
                      }
                      if (var7 > var12.field_Vb) {
                        L33: {
                          var25_int = var7 + -var12.field_Vb;
                          if (var25_int != 1) {
                            break L33;
                          } else {
                            var24 = kj.field_a;
                            break L33;
                          }
                        }
                        var24 = tj.a(117, new String[2], df.field_A);
                        var30 = var24;
                        var25 = var30;
                        var24 = var25;
                        var30 = var24;
                        var25 = var30;
                        break L31;
                      } else {
                        if (var6 > var12.field_Pb) {
                          var24 = tj.a(-24, new String[2], to.field_n);
                          break L31;
                        } else {
                          if (-1 == (var8 & var12.field_Bb)) {
                            break L31;
                          } else {
                            var25_int = bj.a(var12.field_Bb & var8, (byte) 108);
                            var24 = cg.field_Rb;
                            if (-1 >= var25_int) {
                              break L31;
                            } else {
                              if (null == ma.field_P) {
                                break L31;
                              } else {
                                if (var25_int > ma.field_P.length) {
                                  break L31;
                                } else {
                                  if (ma.field_P[var25_int - 1] == null) {
                                    break L31;
                                  } else {
                                    var24_ref = ma.field_P[-1 + var25_int][1];
                                    break L31;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      L34: {
                        if (var5 == 0) {
                          break L34;
                        } else {
                          if (var12.field_Jb) {
                            break L34;
                          } else {
                            var24 = tj.a(-39, new String[1], qm.field_p);
                            break L31;
                          }
                        }
                      }
                      if (var7 > var12.field_Vb) {
                        L35: {
                          var25_int = var7 + -var12.field_Vb;
                          if (-2 == (var25_int ^ -1)) {
                            var24 = tj.a(-115, new String[1], nm.field_g);
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        var24 = tj.a(127, new String[2], s.field_b);
                        break L31;
                      } else {
                        if (var12.field_Pb < var6) {
                          var24 = tj.a(126, new String[2], um.field_c);
                          break L31;
                        } else {
                          if (-1 != (var8 & var12.field_Bb)) {
                            var25_int = bj.a(var12.field_Bb & var8, (byte) 96);
                            var24 = tj.a(116, new String[1], nm.field_a);
                            if (-1 >= var25_int) {
                              break L31;
                            } else {
                              if (null == ma.field_P) {
                                break L31;
                              } else {
                                if (ma.field_P.length < var25_int) {
                                  break L31;
                                } else {
                                  if (null == ma.field_P[var25_int + -1]) {
                                    break L31;
                                  } else {
                                    var24 = tj.a(-80, new String[1], ma.field_P[var25_int + -1][2]);
                                    break L31;
                                  }
                                }
                              }
                            }
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                  }
                  if (var24 == null) {
                    break L30;
                  } else {
                    var34 = "<col=A00000>" + var24;
                    var30 = var34;
                    var25 = var30;
                    var24 = var25;
                    var30 = var34;
                    var25 = var30;
                    var25 = null;
                    var26 = 0;
                    var27_int = 0;
                    L36: while (true) {
                      if (var27_int >= vf.field_l) {
                        L37: {
                          L38: {
                            if (lf.field_b != param1) {
                              break L38;
                            } else {
                              if (qk.k((byte) 101)) {
                                if (var26 == 0) {
                                  var24 = var34 + "<br>" + tj.a(119, new String[1], vg.field_t);
                                  break L37;
                                } else {
                                  var24 = var34 + "<br>" + ie.field_Ub + var25;
                                  break L37;
                                }
                              } else {
                                break L38;
                              }
                            }
                          }
                          if (var26 != 0) {
                            var24 = var34 + "<br>" + bd.field_d + var25;
                            break L37;
                          } else {
                            var24 = var34 + "<br>" + tj.a(-18, new String[1], wl.field_I);
                            break L37;
                          }
                        }
                        L39: {
                          if (lf.field_b != param1) {
                            break L39;
                          } else {
                            if (!qk.k((byte) 72)) {
                              var27 = wi.field_f.field_ic;
                              var24 = var24 + "<br>" + tj.a(126, new String[1], tl.field_c);
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                        }
                        kh.field_c = var24;
                        break L30;
                      } else {
                        L40: {
                          var28 = wi.field_f.field_Wb[var27_int] & 255;
                          var29 = 0;
                          if (null == dh.field_Hb) {
                            break L40;
                          } else {
                            if (null == dh.field_Hb[var27_int]) {
                              break L40;
                            } else {
                              if (!dh.field_Hb[var27_int][var28]) {
                                break L40;
                              } else {
                                if (!var12.field_Jb) {
                                  var29 = 1;
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                            }
                          }
                        }
                        L41: {
                          if (pe.field_Fb == null) {
                            break L41;
                          } else {
                            if (pe.field_Fb[var27_int] != null) {
                              L42: {
                                var30_int = pe.field_Fb[var27_int][var28];
                                if (var30_int == 0) {
                                  break L42;
                                } else {
                                  if (gm.field_c) {
                                    break L42;
                                  } else {
                                    if (var12.field_Jb) {
                                      break L42;
                                    } else {
                                      var29 = 1;
                                      break L42;
                                    }
                                  }
                                }
                              }
                              if (var30_int > var12.field_Pb) {
                                var29 = 1;
                                break L41;
                              } else {
                                break L41;
                              }
                            } else {
                              break L41;
                            }
                          }
                        }
                        L43: {
                          if (null == dk.field_a) {
                            break L43;
                          } else {
                            if (null != dk.field_a[var27_int]) {
                              L44: {
                                var30_int = dk.field_a[var27_int][var28];
                                if (var30_int == 0) {
                                  break L44;
                                } else {
                                  if (gm.field_c) {
                                    break L44;
                                  } else {
                                    if (var12.field_Jb) {
                                      break L44;
                                    } else {
                                      var29 = 1;
                                      break L44;
                                    }
                                  }
                                }
                              }
                              if (var30_int <= var12.field_Vb) {
                                break L43;
                              } else {
                                var29 = 1;
                                break L43;
                              }
                            } else {
                              break L43;
                            }
                          }
                        }
                        L45: {
                          if (ue.field_b == null) {
                            break L45;
                          } else {
                            if (ue.field_b[var27_int] != null) {
                              if ((ue.field_b[var27_int][var28] & (var12.field_Bb ^ -1)) == 0) {
                                break L45;
                              } else {
                                var29 = 1;
                                break L45;
                              }
                            } else {
                              break L45;
                            }
                          }
                        }
                        if (var29 != 0) {
                          var30 = "<col=A00000>" + ob.field_bb[var27_int] + "</col>";
                          var25 = var30;
                          var24 = var25;
                          var25 = var30;
                          if (var25 != null) {
                            var25 = var25 + ", " + var30;
                            var24 = var25;
                            var24 = var25;
                            var26 = 1;
                            var27_int++;
                            continue L36;
                          } else {
                            var25 = var30;
                            var27_int++;
                            continue L36;
                          }
                        } else {
                          var27_int++;
                          continue L36;
                        }
                      }
                    }
                  }
                }
              }
            }
            var12 = (cg) (Object) var10.a(0);
            continue L11;
          }
        }
    }

    final static void a(int param0, boolean param1, String param2, long param3, int param4, int param5) {
        he.field_e.b((byte) -48, param5);
        he.field_e.field_g = he.field_e.field_g + 1;
        int var7 = he.field_e.field_g;
        he.field_e.a(param3, (byte) 85);
        he.field_e.a(param2, 23333);
        he.field_e.f(param4, (byte) -84);
        he.field_e.f(!param1 ? 0 : 1, (byte) -52);
        int var8 = 106 % ((param0 - 32) / 56);
        he.field_e.b(-var7 + he.field_e.field_g, (byte) 43);
    }

    public static void a(byte param0) {
        field_e = null;
        field_i = null;
        field_h = null;
        field_d = null;
        if (param0 != -60) {
            field_c = null;
        }
        field_f = null;
        field_b = null;
        field_c = null;
        field_a = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for sound effects";
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_g = new String[]{null, "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Esc", null, null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "`", null, null, null, "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", null, null, null, null, "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "#", null, null, null, null, "Z", "X", "C", "V", "B", "N", "M", "<", ">", "/", "\\", null, null, null, null, null, "Tab", "Shift", "Ctrl", "Space", "Enter", "Backspace", "Alt", "Keypad +", "Keypad -", "Keypad *", "Keypad /", "Keypad 5", null, null, null, null, "Left Arrow", "Right Arrow", "Up Arrow", "Down Arrow", "Insert", "Delete", "Home", "End", "Page Up", "Page Down", null, null, null, null, null, null};
        field_h = "Invalid name";
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_i = "Public chat is unavailable while setting up a rated game.";
    }
}
