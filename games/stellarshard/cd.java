/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends rg {
    private int field_N;
    private String field_Q;
    static String field_P;
    private pb field_O;
    static qd field_L;
    private w field_R;

    cd(w param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (uk) (Object) vf.a(0));
        ((cd) this).field_R = param0;
        ((cd) this).field_Q = param1;
        ((cd) this).b(param4, param2, param3, param5, 23987);
    }

    final static boolean e(byte param0) {
        if ((ue.field_b ^ -1) == 0) {
            if (!qe.b(64, 1)) {
                return false;
            }
            ue.field_b = ae.field_N.f(4);
            ae.field_N.field_k = 0;
        }
        if (param0 <= 111) {
            boolean discarded$4 = cd.e((byte) -125);
            if ((ue.field_b ^ -1) != 1) {
                return qe.b(64, ue.field_b);
            }
            if (!(qe.b(64, 2))) {
                return false;
            }
            ue.field_b = ae.field_N.c((byte) 37);
            ae.field_N.field_k = 0;
            return qe.b(64, ue.field_b);
        }
        if ((ue.field_b ^ -1) != 1) {
            return qe.b(64, ue.field_b);
        }
        if (!(qe.b(64, 2))) {
            return false;
        }
        ue.field_b = ae.field_N.c((byte) 37);
        ae.field_N.field_k = 0;
        return qe.b(64, ue.field_b);
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        ((cd) this).field_N = ((cd) this).field_N + 1;
        super.a(param0, param1, param2, param3);
    }

    public static void d(byte param0) {
        field_L = null;
        field_P = null;
        int var1 = -117 % ((71 - param0) / 50);
    }

    final String d(int param0) {
        if (param0 == 3690) {
            return null;
        }
        String discarded$0 = cd.h(9);
        return null;
    }

    final static void a(int param0, boolean param1, sk param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        dj.field_b[0] = pl.field_P.nextInt();
        dj.field_b[1] = pl.field_P.nextInt();
        dj.field_b[3] = (int)ob.field_a;
        uc.field_c.field_k = 0;
        dj.field_b[2] = (int)(ob.field_a >> -482039520);
        uc.field_c.b(0, dj.field_b[0]);
        uc.field_c.b(0, dj.field_b[1]);
        uc.field_c.b(0, dj.field_b[2]);
        uc.field_c.b(0, dj.field_b[3]);
        ca.a(uc.field_c, -23074);
        uc.field_c.c(param3, -113);
        param2.a(95, uc.field_c);
        pg.field_fb.field_k = 0;
        var5 = -4 / ((param0 - -7) / 61);
        if (!param4) {
          L0: {
            pg.field_fb.a(false, 16);
            pg.field_fb.field_k = pg.field_fb.field_k + 2;
            var6 = pg.field_fb.field_k;
            pg.field_fb.b(0, t.field_f);
            pg.field_fb.a((byte) 127, od.field_z);
            var7 = 0;
            if (!uj.field_f) {
              break L0;
            } else {
              var7 = var7 | 1;
              break L0;
            }
          }
          L1: {
            if (tl.field_b) {
              var7 = var7 | 4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!param1) {
              break L2;
            } else {
              var7 = var7 | 8;
              break L2;
            }
          }
          L3: {
            if (null != pk.field_b) {
              var7 = var7 | 16;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            pg.field_fb.a(false, var7);
            var8 = dd.a(0, hf.a((byte) -103));
            if (var8 != null) {
              break L4;
            } else {
              var8 = "";
              break L4;
            }
          }
          pg.field_fb.b(var8, -9799);
          if (null == pk.field_b) {
            ha.a(fj.field_l, (ka) (Object) pg.field_fb, uc.field_c, -104, u.field_o);
            pg.field_fb.d(-1, pg.field_fb.field_k - var6);
            ue.a((byte) -88, -1);
            return;
          } else {
            pg.field_fb.a(126, pk.field_b);
            ha.a(fj.field_l, (ka) (Object) pg.field_fb, uc.field_c, -104, u.field_o);
            pg.field_fb.d(-1, pg.field_fb.field_k - var6);
            ue.a((byte) -88, -1);
            return;
          }
        } else {
          pg.field_fb.a(false, 18);
          if (stellarshard.field_B == 0) {
            L5: {
              pg.field_fb.field_k = pg.field_fb.field_k + 2;
              var6 = pg.field_fb.field_k;
              pg.field_fb.b(0, t.field_f);
              pg.field_fb.a((byte) 127, od.field_z);
              var7 = 0;
              if (!uj.field_f) {
                break L5;
              } else {
                var7 = var7 | 1;
                break L5;
              }
            }
            L6: {
              if (tl.field_b) {
                var7 = var7 | 4;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (!param1) {
                break L7;
              } else {
                var7 = var7 | 8;
                break L7;
              }
            }
            L8: {
              if (null != pk.field_b) {
                var7 = var7 | 16;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              pg.field_fb.a(false, var7);
              var8 = dd.a(0, hf.a((byte) -103));
              if (var8 != null) {
                break L9;
              } else {
                var8 = "";
                break L9;
              }
            }
            pg.field_fb.b(var8, -9799);
            if (null != pk.field_b) {
              pg.field_fb.a(126, pk.field_b);
              ha.a(fj.field_l, (ka) (Object) pg.field_fb, uc.field_c, -104, u.field_o);
              pg.field_fb.d(-1, pg.field_fb.field_k - var6);
              ue.a((byte) -88, -1);
              return;
            } else {
              ha.a(fj.field_l, (ka) (Object) pg.field_fb, uc.field_c, -104, u.field_o);
              pg.field_fb.d(-1, pg.field_fb.field_k - var6);
              ue.a((byte) -88, -1);
              return;
            }
          } else {
            L10: {
              pg.field_fb.a(false, 16);
              pg.field_fb.field_k = pg.field_fb.field_k + 2;
              var6 = pg.field_fb.field_k;
              pg.field_fb.b(0, t.field_f);
              pg.field_fb.a((byte) 127, od.field_z);
              var7 = 0;
              if (!uj.field_f) {
                break L10;
              } else {
                var7 = var7 | 1;
                break L10;
              }
            }
            L11: {
              if (tl.field_b) {
                var7 = var7 | 4;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (!param1) {
                break L12;
              } else {
                var7 = var7 | 8;
                break L12;
              }
            }
            L13: {
              if (null != pk.field_b) {
                var7 = var7 | 16;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              pg.field_fb.a(false, var7);
              var8 = dd.a(0, hf.a((byte) -103));
              if (var8 != null) {
                break L14;
              } else {
                var8 = "";
                break L14;
              }
            }
            pg.field_fb.b(var8, -9799);
            if (null == pk.field_b) {
              ha.a(fj.field_l, (ka) (Object) pg.field_fb, uc.field_c, -104, u.field_o);
              pg.field_fb.d(-1, pg.field_fb.field_k - var6);
              ue.a((byte) -88, -1);
              return;
            } else {
              pg.field_fb.a(126, pk.field_b);
              ha.a(fj.field_l, (ka) (Object) pg.field_fb, uc.field_c, -104, u.field_o);
              pg.field_fb.d(-1, pg.field_fb.field_k - var6);
              ue.a((byte) -88, -1);
              return;
            }
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        String var5 = null;
        cg var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var17 = null;
        pb var18 = null;
        pb var19 = null;
        pb var20 = null;
        Object var21 = null;
        pb var22 = null;
        pb var23 = null;
        pb var24 = null;
        pb var25 = null;
        pb var26 = null;
        pb var29 = null;
        pb var30 = null;
        pb var31 = null;
        pb var32 = null;
        pb var33 = null;
        pb var34 = null;
        pb var35 = null;
        pb var36 = null;
        pb var37 = null;
        pb var38 = null;
        pb var39 = null;
        pb var40 = null;
        pb var41 = null;
        pb var42 = null;
        pb var43 = null;
        pb var44 = null;
        pb var45 = null;
        pb var46 = null;
        pb var47 = null;
        pj var48 = null;
        pj var49 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    var17 = null;
                    var21 = null;
                    var13 = stellarshard.field_B;
                    var6 = ((cd) this).field_R.b(-28036);
                    if (var6 == eh.field_c) {
                      break L5;
                    } else {
                      if (var6 == vk.field_d) {
                        break L5;
                      } else {
                        var5 = ((cd) this).field_R.c(-22773);
                        if (var5 == null) {
                          var5 = ((cd) this).field_Q;
                          if (var13 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          if (var5.equals((Object) (Object) ((cd) this).field_m)) {
                            break L0;
                          } else {
                            ((cd) this).field_m = var5;
                            ((cd) this).a((byte) -92);
                            super.a(param0, param1, param2, param3);
                            var6 = ((cd) this).field_R.b(param1 ^ 28091);
                            var48 = (pj) (Object) ((cd) this).field_u;
                            var9 = ((cd) this).field_w + param3;
                            var10 = var48.a((byte) 117, (rj) this, param2) + (var48.b((rj) this, (byte) 111).a(17201) >> -619433951);
                            if (eh.field_c == var6) {
                              break L3;
                            } else {
                              if (var6 != vk.field_d) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var5 = ui.field_D;
                  break L4;
                }
                if (var5.equals((Object) (Object) ((cd) this).field_m)) {
                  break L0;
                } else {
                  ((cd) this).field_m = var5;
                  ((cd) this).a((byte) -92);
                  super.a(param0, param1, param2, param3);
                  var6 = ((cd) this).field_R.b(param1 ^ 28091);
                  var48 = (pj) (Object) ((cd) this).field_u;
                  var9 = ((cd) this).field_w + param3;
                  var10 = var48.a((byte) 117, (rj) this, param2) + (var48.b((rj) this, (byte) 111).a(17201) >> -619433951);
                  if (eh.field_c == var6) {
                    break L3;
                  } else {
                    if (var6 != vk.field_d) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L6: {
                L7: {
                  L8: {
                    var18 = ah.field_p[0];
                    var11 = var18.field_w << -1064120735;
                    var12 = var18.field_x << 255883905;
                    if (null == ((cd) this).field_O) {
                      break L8;
                    } else {
                      if (((cd) this).field_O.field_v < var11) {
                        break L8;
                      } else {
                        if (var12 <= ((cd) this).field_O.field_y) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  ((cd) this).field_O = new pb(var11, var12);
                  hj.a(((cd) this).field_O, param1 ^ -58);
                  if (var13 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
                hj.a(((cd) this).field_O, param1 ^ -58);
                ti.d();
                break L6;
              }
              var18.b(112, 144, var18.field_w << 2088456804, var18.field_x << -536623196, -((cd) this).field_N << -1572549942, 4096);
              id.b((byte) -58);
              ((cd) this).field_O.d(var9 - (var18.field_w >> -1301027519), -var18.field_x + var10, 256);
              if (var13 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
            L9: {
              if (var6 == qj.field_c) {
                break L9;
              } else {
                if (var6 == lg.field_c) {
                  var19 = ah.field_p[1];
                  var19.d(var9, var10 + -(var19.field_y >> 589316769), 256);
                  break L9;
                } else {
                  break L1;
                }
              }
            }
            var20 = ah.field_p[2];
            var20.d(var9, -(var20.field_y >> 598369249) + var10, 256);
            break L1;
          }
          return;
        }
        super.a(param0, param1, param2, param3);
        var6 = ((cd) this).field_R.b(param1 ^ 28091);
        var49 = (pj) (Object) ((cd) this).field_u;
        var9 = ((cd) this).field_w + param3;
        var10 = var49.a((byte) 117, (rj) this, param2) + (var49.b((rj) this, (byte) 111).a(17201) >> -619433951);
        if (eh.field_c == var6) {
          var31 = ah.field_p[0];
          var11 = var31.field_w << -1064120735;
          var12 = var31.field_x << 255883905;
          if (null != ((cd) this).field_O) {
            if (((cd) this).field_O.field_v >= var11) {
              if (var12 <= ((cd) this).field_O.field_y) {
                L10: {
                  hj.a(((cd) this).field_O, param1 ^ -58);
                  ti.d();
                  var31.b(112, 144, var31.field_w << 2088456804, var31.field_x << -536623196, -((cd) this).field_N << -1572549942, 4096);
                  id.b((byte) -58);
                  ((cd) this).field_O.d(var9 - (var31.field_w >> -1301027519), -var31.field_x + var10, 256);
                  if (var13 == 0) {
                    break L10;
                  } else {
                    L11: {
                      if (var6 == qj.field_c) {
                        break L11;
                      } else {
                        if (var6 == lg.field_c) {
                          var44 = ah.field_p[1];
                          var44.d(var9, var10 + -(var44.field_y >> 589316769), 256);
                          break L11;
                        } else {
                          return;
                        }
                      }
                    }
                    var45 = ah.field_p[2];
                    var45.d(var9, -(var45.field_y >> 598369249) + var10, 256);
                    break L10;
                  }
                }
                return;
              } else {
                ((cd) this).field_O = new pb(var11, var12);
                hj.a(((cd) this).field_O, param1 ^ -58);
                if (var13 == 0) {
                  var31.b(112, 144, var31.field_w << 2088456804, var31.field_x << -536623196, -((cd) this).field_N << -1572549942, 4096);
                  id.b((byte) -58);
                  ((cd) this).field_O.d(var9 - (var31.field_w >> -1301027519), -var31.field_x + var10, 256);
                  if (var13 != 0) {
                    if (var6 != qj.field_c) {
                      if (var6 != lg.field_c) {
                        return;
                      } else {
                        var42 = ah.field_p[1];
                        var42.d(var9, var10 + -(var42.field_y >> 589316769), 256);
                        var43 = ah.field_p[2];
                        var43.d(var9, -(var43.field_y >> 598369249) + var10, 256);
                        return;
                      }
                    } else {
                      var43 = ah.field_p[2];
                      var43.d(var9, -(var43.field_y >> 598369249) + var10, 256);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L12: {
                    L13: {
                      hj.a(((cd) this).field_O, param1 ^ -58);
                      ti.d();
                      var31.b(112, 144, var31.field_w << 2088456804, var31.field_x << -536623196, -((cd) this).field_N << -1572549942, 4096);
                      id.b((byte) -58);
                      ((cd) this).field_O.d(var9 - (var31.field_w >> -1301027519), -var31.field_x + var10, 256);
                      if (var6 == qj.field_c) {
                        break L13;
                      } else {
                        if (var6 == lg.field_c) {
                          var40 = ah.field_p[1];
                          var40.d(var9, var10 + -(var40.field_y >> 589316769), 256);
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var41 = ah.field_p[2];
                    var41.d(var9, -(var41.field_y >> 598369249) + var10, 256);
                    break L12;
                  }
                  return;
                }
              }
            } else {
              ((cd) this).field_O = new pb(var11, var12);
              hj.a(((cd) this).field_O, param1 ^ -58);
              if (var13 == 0) {
                var31.b(112, 144, var31.field_w << 2088456804, var31.field_x << -536623196, -((cd) this).field_N << -1572549942, 4096);
                id.b((byte) -58);
                ((cd) this).field_O.d(var9 - (var31.field_w >> -1301027519), -var31.field_x + var10, 256);
                if (var13 != 0) {
                  if (var6 != qj.field_c) {
                    if (var6 == lg.field_c) {
                      var38 = ah.field_p[1];
                      var38.d(var9, var10 + -(var38.field_y >> 589316769), 256);
                      var39 = ah.field_p[2];
                      var39.d(var9, -(var39.field_y >> 598369249) + var10, 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var39 = ah.field_p[2];
                    var39.d(var9, -(var39.field_y >> 598369249) + var10, 256);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                hj.a(((cd) this).field_O, param1 ^ -58);
                ti.d();
                var31.b(112, 144, var31.field_w << 2088456804, var31.field_x << -536623196, -((cd) this).field_N << -1572549942, 4096);
                id.b((byte) -58);
                ((cd) this).field_O.d(var9 - (var31.field_w >> -1301027519), -var31.field_x + var10, 256);
                if (var6 != qj.field_c) {
                  if (var6 == lg.field_c) {
                    var36 = ah.field_p[1];
                    var36.d(var9, var10 + -(var36.field_y >> 589316769), 256);
                    var37 = ah.field_p[2];
                    var37.d(var9, -(var37.field_y >> 598369249) + var10, 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var37 = ah.field_p[2];
                  var37.d(var9, -(var37.field_y >> 598369249) + var10, 256);
                  return;
                }
              }
            }
          } else {
            ((cd) this).field_O = new pb(var11, var12);
            hj.a(((cd) this).field_O, param1 ^ -58);
            if (var13 == 0) {
              var31.b(112, 144, var31.field_w << 2088456804, var31.field_x << -536623196, -((cd) this).field_N << -1572549942, 4096);
              id.b((byte) -58);
              ((cd) this).field_O.d(var9 - (var31.field_w >> -1301027519), -var31.field_x + var10, 256);
              if (var13 != 0) {
                if (var6 != qj.field_c) {
                  if (var6 != lg.field_c) {
                    return;
                  } else {
                    var34 = ah.field_p[1];
                    var34.d(var9, var10 + -(var34.field_y >> 589316769), 256);
                    var35 = ah.field_p[2];
                    var35.d(var9, -(var35.field_y >> 598369249) + var10, 256);
                    return;
                  }
                } else {
                  var35 = ah.field_p[2];
                  var35.d(var9, -(var35.field_y >> 598369249) + var10, 256);
                  return;
                }
              } else {
                return;
              }
            } else {
              hj.a(((cd) this).field_O, param1 ^ -58);
              ti.d();
              var31.b(112, 144, var31.field_w << 2088456804, var31.field_x << -536623196, -((cd) this).field_N << -1572549942, 4096);
              id.b((byte) -58);
              ((cd) this).field_O.d(var9 - (var31.field_w >> -1301027519), -var31.field_x + var10, 256);
              if (var6 != qj.field_c) {
                if (var6 != lg.field_c) {
                  return;
                } else {
                  var32 = ah.field_p[1];
                  var32.d(var9, var10 + -(var32.field_y >> 589316769), 256);
                  var33 = ah.field_p[2];
                  var33.d(var9, -(var33.field_y >> 598369249) + var10, 256);
                  return;
                }
              } else {
                var33 = ah.field_p[2];
                var33.d(var9, -(var33.field_y >> 598369249) + var10, 256);
                return;
              }
            }
          }
        } else {
          if (var6 != vk.field_d) {
            L14: {
              L15: {
                if (var6 == qj.field_c) {
                  break L15;
                } else {
                  if (var6 == lg.field_c) {
                    var46 = ah.field_p[1];
                    var46.d(var9, var10 + -(var46.field_y >> 589316769), 256);
                    if (var13 == 0) {
                      break L14;
                    } else {
                      break L15;
                    }
                  } else {
                    return;
                  }
                }
              }
              var47 = ah.field_p[2];
              var47.d(var9, -(var47.field_y >> 598369249) + var10, 256);
              break L14;
            }
            return;
          } else {
            L16: {
              var22 = ah.field_p[0];
              var11 = var22.field_w << -1064120735;
              var12 = var22.field_x << 255883905;
              if (null == ((cd) this).field_O) {
                break L16;
              } else {
                if (((cd) this).field_O.field_v < var11) {
                  break L16;
                } else {
                  if (var12 > ((cd) this).field_O.field_y) {
                    break L16;
                  } else {
                    L17: {
                      hj.a(((cd) this).field_O, param1 ^ -58);
                      ti.d();
                      var22.b(112, 144, var22.field_w << 2088456804, var22.field_x << -536623196, -((cd) this).field_N << -1572549942, 4096);
                      id.b((byte) -58);
                      ((cd) this).field_O.d(var9 - (var22.field_w >> -1301027519), -var22.field_x + var10, 256);
                      if (var13 == 0) {
                        break L17;
                      } else {
                        L18: {
                          if (var6 == qj.field_c) {
                            break L18;
                          } else {
                            if (var6 == lg.field_c) {
                              var23 = ah.field_p[1];
                              var23.d(var9, var10 + -(var23.field_y >> 589316769), 256);
                              break L18;
                            } else {
                              break L17;
                            }
                          }
                        }
                        var24 = ah.field_p[2];
                        var24.d(var9, -(var24.field_y >> 598369249) + var10, 256);
                        break L17;
                      }
                    }
                    return;
                  }
                }
              }
            }
            ((cd) this).field_O = new pb(var11, var12);
            hj.a(((cd) this).field_O, param1 ^ -58);
            if (var13 != 0) {
              hj.a(((cd) this).field_O, param1 ^ -58);
              ti.d();
              var22.b(112, 144, var22.field_w << 2088456804, var22.field_x << -536623196, -((cd) this).field_N << -1572549942, 4096);
              id.b((byte) -58);
              ((cd) this).field_O.d(var9 - (var22.field_w >> -1301027519), -var22.field_x + var10, 256);
              if (var13 != 0) {
                if (var6 != qj.field_c) {
                  if (var6 != lg.field_c) {
                    return;
                  } else {
                    var29 = ah.field_p[1];
                    var29.d(var9, var10 + -(var29.field_y >> 589316769), 256);
                    var30 = ah.field_p[2];
                    var30.d(var9, -(var30.field_y >> 598369249) + var10, 256);
                    return;
                  }
                } else {
                  var30 = ah.field_p[2];
                  var30.d(var9, -(var30.field_y >> 598369249) + var10, 256);
                  return;
                }
              } else {
                return;
              }
            } else {
              L19: {
                var22.b(112, 144, var22.field_w << 2088456804, var22.field_x << -536623196, -((cd) this).field_N << -1572549942, 4096);
                id.b((byte) -58);
                ((cd) this).field_O.d(var9 - (var22.field_w >> -1301027519), -var22.field_x + var10, 256);
                if (var13 == 0) {
                  break L19;
                } else {
                  L20: {
                    if (var6 == qj.field_c) {
                      break L20;
                    } else {
                      if (var6 == lg.field_c) {
                        var25 = ah.field_p[1];
                        var25.d(var9, var10 + -(var25.field_y >> 589316769), 256);
                        break L20;
                      } else {
                        break L19;
                      }
                    }
                  }
                  var26 = ah.field_p[2];
                  var26.d(var9, -(var26.field_y >> 598369249) + var10, 256);
                  break L19;
                }
              }
              return;
            }
          }
        }
    }

    final static String h(int param0) {
        if (-3 < (rk.field_f ^ -1)) {
          return ug.field_d;
        } else {
          if (null == pg.field_db) {
            if (!lk.field_i.a((byte) -36)) {
              return lg.field_e;
            } else {
              if (lk.field_i.a("commonui", (byte) -109)) {
                if (!wf.field_e.a((byte) -36)) {
                  return mb.field_c;
                } else {
                  if (param0 == -1064120735) {
                    if (wf.field_e.a("commonui", (byte) -109)) {
                      if (!am.field_g.a((byte) -36)) {
                        return ve.field_b;
                      } else {
                        if (!am.field_g.c((byte) -111)) {
                          return lj.field_B + " - " + am.field_g.b((byte) 1) + "%";
                        } else {
                          return wl.field_W;
                        }
                      }
                    } else {
                      return le.field_l + " - " + wf.field_e.b(0, "commonui") + "%";
                    }
                  } else {
                    field_L = null;
                    if (wf.field_e.a("commonui", (byte) -109)) {
                      if (!am.field_g.a((byte) -36)) {
                        return ve.field_b;
                      } else {
                        if (!am.field_g.c((byte) -111)) {
                          return lj.field_B + " - " + am.field_g.b((byte) 1) + "%";
                        } else {
                          return wl.field_W;
                        }
                      }
                    } else {
                      return le.field_l + " - " + wf.field_e.b(0, "commonui") + "%";
                    }
                  }
                }
              } else {
                return am.field_e + " - " + lk.field_i.b(0, "commonui") + "%";
              }
            }
          } else {
            if (!pg.field_db.a((byte) -36)) {
              return rg.field_I;
            } else {
              return kf.field_d;
            }
          }
        }
    }

    final boolean a(int param0, rj param1) {
        if (param0 != -2147483648) {
            ((cd) this).field_Q = null;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Collect me";
    }
}
