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
        try {
            ((cd) this).field_R = param0;
            ((cd) this).field_Q = param1;
            ((cd) this).b(param4, param2, param3, param5, 23987);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "cd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static boolean e(byte param0) {
        if (ue.field_b == -1) {
            if (!qe.b(64, 1)) {
                return false;
            }
            ue.field_b = ae.field_N.f(4);
            ae.field_N.field_k = 0;
        }
        boolean discarded$4 = cd.e((byte) -125);
        if (ue.field_b != -2) {
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
        try {
            ((cd) this).field_N = ((cd) this).field_N + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "cd.N(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              dj.field_b[0] = pl.field_P.nextInt();
              dj.field_b[1] = pl.field_P.nextInt();
              dj.field_b[3] = (int)ob.field_a;
              uc.field_c.field_k = 0;
              dj.field_b[2] = (int)(ob.field_a >> 32);
              uc.field_c.b(0, dj.field_b[0]);
              uc.field_c.b(0, dj.field_b[1]);
              uc.field_c.b(0, dj.field_b[2]);
              uc.field_c.b(0, dj.field_b[3]);
              ca.a(uc.field_c, -23074);
              uc.field_c.c(param3, -113);
              param2.a(95, uc.field_c);
              pg.field_fb.field_k = 0;
              var5_int = -4 / ((param0 - -7) / 61);
              if (!param4) {
                pg.field_fb.a(false, 16);
                break L1;
              } else {
                pg.field_fb.a(false, 18);
                if (stellarshard.field_B == 0) {
                  break L1;
                } else {
                  pg.field_fb.a(false, 16);
                  break L1;
                }
              }
            }
            L2: {
              pg.field_fb.field_k = pg.field_fb.field_k + 2;
              var6 = pg.field_fb.field_k;
              pg.field_fb.b(0, t.field_f);
              pg.field_fb.a((byte) 127, od.field_z);
              var7 = 0;
              if (!uj.field_f) {
                break L2;
              } else {
                var7 = var7 | 1;
                break L2;
              }
            }
            L3: {
              if (tl.field_b) {
                var7 = var7 | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param1) {
                break L4;
              } else {
                var7 = var7 | 8;
                break L4;
              }
            }
            L5: {
              if (null != pk.field_b) {
                var7 = var7 | 16;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              pg.field_fb.a(false, var7);
              var8 = dd.a(0, hf.a((byte) -103));
              if (var8 != null) {
                break L6;
              } else {
                var8 = "";
                break L6;
              }
            }
            L7: {
              pg.field_fb.b(var8, -9799);
              if (null == pk.field_b) {
                break L7;
              } else {
                pg.field_fb.a(126, pk.field_b);
                break L7;
              }
            }
            ha.a(fj.field_l, (ka) (Object) pg.field_fb, uc.field_c, -104, u.field_o);
            pg.field_fb.d(-1, pg.field_fb.field_k - var6);
            ue.a((byte) -88, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("cd.C(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param3 + 44 + param4 + 41);
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
                            var10 = var48.a((byte) 117, (rj) this, param2) + (var48.b((rj) this, (byte) 111).a(17201) >> 1);
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
                  var10 = var48.a((byte) 117, (rj) this, param2) + (var48.b((rj) this, (byte) 111).a(17201) >> 1);
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
                    var11 = var18.field_w << 1;
                    var12 = var18.field_x << 1;
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
              var18.b(112, 144, var18.field_w << 4, var18.field_x << 4, -((cd) this).field_N << 10, 4096);
              id.b((byte) -58);
              ((cd) this).field_O.d(var9 - (var18.field_w >> 1), -var18.field_x + var10, 256);
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
                  var19.d(var9, var10 + -(var19.field_y >> 1), 256);
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L9;
                  }
                } else {
                  break L1;
                }
              }
            }
            var20 = ah.field_p[2];
            var20.d(var9, -(var20.field_y >> 1) + var10, 256);
            break L1;
          }
          return;
        }
        super.a(param0, param1, param2, param3);
        var6 = ((cd) this).field_R.b(param1 ^ 28091);
        var49 = (pj) (Object) ((cd) this).field_u;
        var9 = ((cd) this).field_w + param3;
        var10 = var49.a((byte) 117, (rj) this, param2) + (var49.b((rj) this, (byte) 111).a(17201) >> 1);
        if (eh.field_c == var6) {
          var31 = ah.field_p[0];
          var11 = var31.field_w << 1;
          var12 = var31.field_x << 1;
          if (null != ((cd) this).field_O) {
            if (((cd) this).field_O.field_v >= var11) {
              if (var12 <= ((cd) this).field_O.field_y) {
                L10: {
                  hj.a(((cd) this).field_O, param1 ^ -58);
                  ti.d();
                  var31.b(112, 144, var31.field_w << 4, var31.field_x << 4, -((cd) this).field_N << 10, 4096);
                  id.b((byte) -58);
                  ((cd) this).field_O.d(var9 - (var31.field_w >> 1), -var31.field_x + var10, 256);
                  if (var13 == 0) {
                    break L10;
                  } else {
                    L11: {
                      if (var6 == qj.field_c) {
                        break L11;
                      } else {
                        if (var6 == lg.field_c) {
                          var44 = ah.field_p[1];
                          var44.d(var9, var10 + -(var44.field_y >> 1), 256);
                          if (var13 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    var45 = ah.field_p[2];
                    var45.d(var9, -(var45.field_y >> 1) + var10, 256);
                    break L10;
                  }
                }
                return;
              } else {
                ((cd) this).field_O = new pb(var11, var12);
                hj.a(((cd) this).field_O, param1 ^ -58);
                if (var13 == 0) {
                  var31.b(112, 144, var31.field_w << 4, var31.field_x << 4, -((cd) this).field_N << 10, 4096);
                  id.b((byte) -58);
                  ((cd) this).field_O.d(var9 - (var31.field_w >> 1), -var31.field_x + var10, 256);
                  if (var13 != 0) {
                    if (var6 != qj.field_c) {
                      if (var6 != lg.field_c) {
                        return;
                      } else {
                        L12: {
                          var42 = ah.field_p[1];
                          var42.d(var9, var10 + -(var42.field_y >> 1), 256);
                          if (var13 == 0) {
                            break L12;
                          } else {
                            var43 = ah.field_p[2];
                            var43.d(var9, -(var43.field_y >> 1) + var10, 256);
                            break L12;
                          }
                        }
                        return;
                      }
                    } else {
                      var43 = ah.field_p[2];
                      var43.d(var9, -(var43.field_y >> 1) + var10, 256);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L13: {
                    L14: {
                      hj.a(((cd) this).field_O, param1 ^ -58);
                      ti.d();
                      var31.b(112, 144, var31.field_w << 4, var31.field_x << 4, -((cd) this).field_N << 10, 4096);
                      id.b((byte) -58);
                      ((cd) this).field_O.d(var9 - (var31.field_w >> 1), -var31.field_x + var10, 256);
                      if (var6 == qj.field_c) {
                        break L14;
                      } else {
                        if (var6 == lg.field_c) {
                          var40 = ah.field_p[1];
                          var40.d(var9, var10 + -(var40.field_y >> 1), 256);
                          if (var13 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    var41 = ah.field_p[2];
                    var41.d(var9, -(var41.field_y >> 1) + var10, 256);
                    break L13;
                  }
                  return;
                }
              }
            } else {
              ((cd) this).field_O = new pb(var11, var12);
              hj.a(((cd) this).field_O, param1 ^ -58);
              if (var13 == 0) {
                var31.b(112, 144, var31.field_w << 4, var31.field_x << 4, -((cd) this).field_N << 10, 4096);
                id.b((byte) -58);
                ((cd) this).field_O.d(var9 - (var31.field_w >> 1), -var31.field_x + var10, 256);
                if (var13 != 0) {
                  if (var6 != qj.field_c) {
                    if (var6 == lg.field_c) {
                      L15: {
                        var38 = ah.field_p[1];
                        var38.d(var9, var10 + -(var38.field_y >> 1), 256);
                        if (var13 == 0) {
                          break L15;
                        } else {
                          var39 = ah.field_p[2];
                          var39.d(var9, -(var39.field_y >> 1) + var10, 256);
                          break L15;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var39 = ah.field_p[2];
                    var39.d(var9, -(var39.field_y >> 1) + var10, 256);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                hj.a(((cd) this).field_O, param1 ^ -58);
                ti.d();
                var31.b(112, 144, var31.field_w << 4, var31.field_x << 4, -((cd) this).field_N << 10, 4096);
                id.b((byte) -58);
                ((cd) this).field_O.d(var9 - (var31.field_w >> 1), -var31.field_x + var10, 256);
                if (var6 != qj.field_c) {
                  if (var6 == lg.field_c) {
                    L16: {
                      var36 = ah.field_p[1];
                      var36.d(var9, var10 + -(var36.field_y >> 1), 256);
                      if (var13 == 0) {
                        break L16;
                      } else {
                        var37 = ah.field_p[2];
                        var37.d(var9, -(var37.field_y >> 1) + var10, 256);
                        break L16;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  var37 = ah.field_p[2];
                  var37.d(var9, -(var37.field_y >> 1) + var10, 256);
                  return;
                }
              }
            }
          } else {
            ((cd) this).field_O = new pb(var11, var12);
            hj.a(((cd) this).field_O, param1 ^ -58);
            if (var13 == 0) {
              var31.b(112, 144, var31.field_w << 4, var31.field_x << 4, -((cd) this).field_N << 10, 4096);
              id.b((byte) -58);
              ((cd) this).field_O.d(var9 - (var31.field_w >> 1), -var31.field_x + var10, 256);
              if (var13 != 0) {
                if (var6 != qj.field_c) {
                  if (var6 != lg.field_c) {
                    return;
                  } else {
                    L17: {
                      var34 = ah.field_p[1];
                      var34.d(var9, var10 + -(var34.field_y >> 1), 256);
                      if (var13 == 0) {
                        break L17;
                      } else {
                        var35 = ah.field_p[2];
                        var35.d(var9, -(var35.field_y >> 1) + var10, 256);
                        break L17;
                      }
                    }
                    return;
                  }
                } else {
                  var35 = ah.field_p[2];
                  var35.d(var9, -(var35.field_y >> 1) + var10, 256);
                  return;
                }
              } else {
                return;
              }
            } else {
              hj.a(((cd) this).field_O, param1 ^ -58);
              ti.d();
              var31.b(112, 144, var31.field_w << 4, var31.field_x << 4, -((cd) this).field_N << 10, 4096);
              id.b((byte) -58);
              ((cd) this).field_O.d(var9 - (var31.field_w >> 1), -var31.field_x + var10, 256);
              if (var6 != qj.field_c) {
                if (var6 != lg.field_c) {
                  return;
                } else {
                  L18: {
                    var32 = ah.field_p[1];
                    var32.d(var9, var10 + -(var32.field_y >> 1), 256);
                    if (var13 == 0) {
                      break L18;
                    } else {
                      var33 = ah.field_p[2];
                      var33.d(var9, -(var33.field_y >> 1) + var10, 256);
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                var33 = ah.field_p[2];
                var33.d(var9, -(var33.field_y >> 1) + var10, 256);
                return;
              }
            }
          }
        } else {
          if (var6 != vk.field_d) {
            L19: {
              L20: {
                if (var6 == qj.field_c) {
                  break L20;
                } else {
                  if (var6 == lg.field_c) {
                    var46 = ah.field_p[1];
                    var46.d(var9, var10 + -(var46.field_y >> 1), 256);
                    if (var13 == 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  } else {
                    return;
                  }
                }
              }
              var47 = ah.field_p[2];
              var47.d(var9, -(var47.field_y >> 1) + var10, 256);
              break L19;
            }
            return;
          } else {
            L21: {
              var22 = ah.field_p[0];
              var11 = var22.field_w << 1;
              var12 = var22.field_x << 1;
              if (null == ((cd) this).field_O) {
                break L21;
              } else {
                if (((cd) this).field_O.field_v < var11) {
                  break L21;
                } else {
                  if (var12 > ((cd) this).field_O.field_y) {
                    break L21;
                  } else {
                    L22: {
                      hj.a(((cd) this).field_O, param1 ^ -58);
                      ti.d();
                      var22.b(112, 144, var22.field_w << 4, var22.field_x << 4, -((cd) this).field_N << 10, 4096);
                      id.b((byte) -58);
                      ((cd) this).field_O.d(var9 - (var22.field_w >> 1), -var22.field_x + var10, 256);
                      if (var13 == 0) {
                        break L22;
                      } else {
                        L23: {
                          if (var6 == qj.field_c) {
                            break L23;
                          } else {
                            if (var6 == lg.field_c) {
                              var23 = ah.field_p[1];
                              var23.d(var9, var10 + -(var23.field_y >> 1), 256);
                              if (var13 == 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            } else {
                              break L22;
                            }
                          }
                        }
                        var24 = ah.field_p[2];
                        var24.d(var9, -(var24.field_y >> 1) + var10, 256);
                        break L22;
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
              var22.b(112, 144, var22.field_w << 4, var22.field_x << 4, -((cd) this).field_N << 10, 4096);
              id.b((byte) -58);
              ((cd) this).field_O.d(var9 - (var22.field_w >> 1), -var22.field_x + var10, 256);
              if (var13 != 0) {
                if (var6 != qj.field_c) {
                  if (var6 != lg.field_c) {
                    return;
                  } else {
                    L24: {
                      var29 = ah.field_p[1];
                      var29.d(var9, var10 + -(var29.field_y >> 1), 256);
                      if (var13 == 0) {
                        break L24;
                      } else {
                        var30 = ah.field_p[2];
                        var30.d(var9, -(var30.field_y >> 1) + var10, 256);
                        break L24;
                      }
                    }
                    return;
                  }
                } else {
                  var30 = ah.field_p[2];
                  var30.d(var9, -(var30.field_y >> 1) + var10, 256);
                  return;
                }
              } else {
                return;
              }
            } else {
              L25: {
                var22.b(112, 144, var22.field_w << 4, var22.field_x << 4, -((cd) this).field_N << 10, 4096);
                id.b((byte) -58);
                ((cd) this).field_O.d(var9 - (var22.field_w >> 1), -var22.field_x + var10, 256);
                if (var13 == 0) {
                  break L25;
                } else {
                  L26: {
                    if (var6 == qj.field_c) {
                      break L26;
                    } else {
                      if (var6 == lg.field_c) {
                        var25 = ah.field_p[1];
                        var25.d(var9, var10 + -(var25.field_y >> 1), 256);
                        if (var13 == 0) {
                          break L25;
                        } else {
                          break L26;
                        }
                      } else {
                        break L25;
                      }
                    }
                  }
                  var26 = ah.field_p[2];
                  var26.d(var9, -(var26.field_y >> 1) + var10, 256);
                  break L25;
                }
              }
              return;
            }
          }
        }
    }

    final static String h(int param0) {
        if (!(rk.field_f >= 2)) {
            return ug.field_d;
        }
        if (null != pg.field_db) {
            if (!(pg.field_db.a((byte) -36))) {
                return rg.field_I;
            }
            return kf.field_d;
        }
        if (!(lk.field_i.a((byte) -36))) {
            return lg.field_e;
        }
        if (!lk.field_i.a("commonui", (byte) -109)) {
            return am.field_e + " - " + lk.field_i.b(0, "commonui") + "%";
        }
        if (!(wf.field_e.a((byte) -36))) {
            return mb.field_c;
        }
        field_L = null;
        if (!wf.field_e.a("commonui", (byte) -109)) {
            return le.field_l + " - " + wf.field_e.b(0, "commonui") + "%";
        }
        if (!(am.field_g.a((byte) -36))) {
            return ve.field_b;
        }
        if (!(am.field_g.c((byte) -111))) {
            return lj.field_B + " - " + am.field_g.b((byte) 1) + "%";
        }
        return wl.field_W;
    }

    final boolean a(int param0, rj param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 == -2147483648) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((cd) this).field_Q = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("cd.J(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Collect me";
    }
}
