/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private long[] field_k;
    static double field_a;
    private long[] field_c;
    static String field_b;
    private byte[] field_e;
    private byte[] field_j;
    private int field_l;
    static hd field_m;
    static boolean[] field_f;
    static String field_i;
    private int field_o;
    private long[] field_p;
    private long[] field_g;
    static int[] field_d;
    static boolean field_h;
    private long[] field_n;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Kickabout.field_G;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                L2: {
                  if (param0 == 18) {
                    break L2;
                  } else {
                    field_b = null;
                    break L2;
                  }
                }
                var2 = 1;
                L3: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L4: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((m) this).field_n[var2] = sd.a(((m) this).field_n[var2], sd.a(((m) this).field_k[var2], ((m) this).field_c[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if ((var3 ^ -1) <= -9) {
                        var3 = 0;
                        L6: while (true) {
                          if ((var3 ^ -1) <= -9) {
                            ((m) this).field_p[0] = sd.a(((m) this).field_p[0], ju.field_V[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((m) this).field_c[var3] = ((m) this).field_g[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((m) this).field_g[var3] = ((m) this).field_p[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if ((var7 ^ -1) <= -9) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((m) this).field_g[var3] = sd.a(((m) this).field_g[var3], ju.field_W[var7][qj.b(255, (int)(((m) this).field_c[qj.b(-var7 + var3, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((m) this).field_p[var3] = ((m) this).field_g[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((m) this).field_g[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            ((m) this).field_g[var3] = sd.a(((m) this).field_g[var3], ju.field_W[var4][qj.b((int)(((m) this).field_p[qj.b(-var4 + var3, 7)] >>> var5), 255)]);
                            var5 -= 8;
                            var4++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((m) this).field_p[var2] = ((m) this).field_n[var2];
                ((m) this).field_c[var2] = sd.a(((m) this).field_k[var2], ((m) this).field_n[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((m) this).field_k[var2] = sd.a(mg.a(255L, (long)((m) this).field_e[7 + var3]), sd.a(mg.a((long)((m) this).field_e[var3 + 6], 255L) << 1914836104, sd.a(mg.a(255L, (long)((m) this).field_e[var3 - -5]) << 1554428176, sd.a(mg.a((long)((m) this).field_e[var3 - -4], 255L) << 760387352, sd.a(sd.a(mg.a((long)((m) this).field_e[var3 - -2], 255L) << 991834984, sd.a(mg.a(71776119061217280L, (long)((m) this).field_e[1 + var3] << -1971178896), (long)((m) this).field_e[var3] << -1759190728)), mg.a(1095216660480L, (long)((m) this).field_e[var3 + 3] << -665257184))))));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_f = null;
        if (param0 != 0) {
            Object var2 = null;
            int discarded$0 = m.a(96, (ec) null, (ec) null, 12, false, (String) null, true);
        }
        field_b = null;
        field_m = null;
        field_i = null;
    }

    final static void a(byte param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          h.field_e.field_E = param2;
          if (ov.field_b == 2) {
            b.field_N.field_E = kc.field_f;
            break L0;
          } else {
            b.field_N.field_E = im.field_Bb;
            break L0;
          }
        }
        L1: {
          var9 = 495;
          var10 = 5;
          Kickabout.field_H.a(true, var9 + -10, 5, var10, param6);
          ei.field_b.a(true, Kickabout.field_H.field_q + -ij.field_s.field_q, 0, 0, param6);
          ij.field_s.a(true, ij.field_s.field_q, ei.field_b.field_q, 0, param6);
          var10 = var10 + (param7 + param6);
          gl.field_c.a(true, gl.field_c.g((byte) -99), 5, var10, param3);
          var11 = b.field_N.g((byte) -19);
          b.field_N.a(true, var11, -5 + (var9 + -var11), var10, param3);
          h.field_e.a(true, var9, 0, 0, param1);
          var12 = 5 + (var10 + param3);
          dj.field_D.a(true, var9, 0, param1, var12);
          var12 = var12 + param1;
          dj.field_D.field_R = fs.a(dj.field_D.field_mb, 3, 2105376, 11579568, 8421504, (byte) 118);
          mu.field_Y.a(true, var9, param4 + -(var9 / 2), -(var12 / 2) + param5, var12);
          if (param0 == 49) {
            break L1;
          } else {
            field_f = null;
            break L1;
          }
        }
    }

    final static int a(int param0, ec param1, ec param2, int param3, boolean param4, String param5, boolean param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        iw stackIn_14_0 = null;
        iw stackIn_15_0 = null;
        iw stackIn_16_0 = null;
        String stackIn_16_1 = null;
        iw stackIn_17_0 = null;
        iw stackIn_18_0 = null;
        iw stackIn_19_0 = null;
        String stackIn_19_1 = null;
        iw stackOut_13_0 = null;
        iw stackOut_15_0 = null;
        String stackOut_15_1 = null;
        iw stackOut_14_0 = null;
        String stackOut_14_1 = null;
        iw stackOut_16_0 = null;
        iw stackOut_18_0 = null;
        String stackOut_18_1 = null;
        iw stackOut_17_0 = null;
        String stackOut_17_1 = null;
        L0: {
          var13 = Kickabout.field_G;
          var14 = param2.b(27939);
          var8 = param1.b(27939);
          if (null != op.field_y) {
            break L0;
          } else {
            if (!qo.a(false, (byte) 123)) {
              return -1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (un.field_c != sd.field_d) {
            break L1;
          } else {
            L2: {
              ep.field_f = null;
              or.field_d.field_n = 0;
              if (param5 == null) {
                L3: {
                  gl.field_a.field_n = 0;
                  gl.field_a.b(-56, ac.field_d.nextInt());
                  gl.field_a.b(-34, ac.field_d.nextInt());
                  stackOut_13_0 = gl.field_a;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (!param2.c(-95)) {
                    stackOut_15_0 = (iw) (Object) stackIn_15_0;
                    stackOut_15_1 = "";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L3;
                  } else {
                    stackOut_14_0 = (iw) (Object) stackIn_14_0;
                    stackOut_14_1 = (String) var14;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L3;
                  }
                }
                L4: {
                  ((iw) (Object) stackIn_16_0).a(stackIn_16_1, (byte) -126);
                  stackOut_16_0 = gl.field_a;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (!param1.c(-94)) {
                    stackOut_18_0 = (iw) (Object) stackIn_18_0;
                    stackOut_18_1 = "";
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L4;
                  } else {
                    stackOut_17_0 = (iw) (Object) stackIn_17_0;
                    stackOut_17_1 = (String) var8;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L4;
                  }
                }
                ((iw) (Object) stackIn_19_0).a(stackIn_19_1, (byte) -128);
                or.field_d.a(106, 16);
                or.field_d.field_n = or.field_d.field_n + 1;
                var9 = or.field_d.field_n;
                om.a(hn.field_h, (iw) (Object) or.field_d, (byte) -89, gl.field_a, bb.field_Nb);
                or.field_d.c(62, -var9 + or.field_d.field_n);
                break L2;
              } else {
                L5: {
                  var9 = 0;
                  if (param4) {
                    var9 = var9 | 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  gl.field_a.field_n = 0;
                  gl.field_a.b(-62, ac.field_d.nextInt());
                  gl.field_a.b(-42, ac.field_d.nextInt());
                  gl.field_a.a(var14, (byte) -126);
                  gl.field_a.a(var8, (byte) -126);
                  var15 = (CharSequence) (Object) param5;
                  gl.field_a.a(ri.a(var15, (byte) -100), (byte) -125);
                  gl.field_a.g(-1207444472, param0);
                  gl.field_a.a(106, param3);
                  gl.field_a.a(125, var9);
                  or.field_d.a(123, 18);
                  or.field_d.field_n = or.field_d.field_n + 2;
                  var10 = or.field_d.field_n;
                  var11_ref = sa.a(so.a(50), (byte) 123);
                  if (var11_ref == null) {
                    var11_ref = "";
                    break L6;
                  } else {
                    break L6;
                  }
                }
                or.field_d.a(14190, var11_ref);
                om.a(hn.field_h, (iw) (Object) or.field_d, (byte) -94, gl.field_a, bb.field_Nb);
                or.field_d.d(-var10 + or.field_d.field_n, 62);
                break L2;
              }
            }
            c.a(-1, false);
            un.field_c = pf.field_e;
            break L1;
          }
        }
        L7: {
          if (pf.field_e == un.field_c) {
            if (uj.a((byte) 55, 1)) {
              L8: {
                var9 = un.field_e.h((byte) -116);
                un.field_e.field_n = 0;
                if (-101 < (var9 ^ -1)) {
                  break L8;
                } else {
                  if (var9 < -106) {
                    break L8;
                  } else {
                    un.field_c = id.field_t;
                    mr.field_X = new String[-100 + var9];
                    break L7;
                  }
                }
              }
              if (-249 == var9) {
                wc.a((byte) -50, so.a(-71));
                gd.field_b = ld.field_i;
                lr.b((byte) -116);
                vu.field_Db = false;
                return var9;
              } else {
                if (var9 == 99) {
                  boolean discarded$1 = uj.a((byte) 51, lt.a((byte) 40));
                  ep.field_f = new Boolean(ki.a((iw) (Object) un.field_e, (byte) 93));
                  un.field_e.field_n = 0;
                  break L7;
                } else {
                  so.field_b = var9;
                  un.field_c = lm.field_N;
                  ms.field_b = -1;
                  break L7;
                }
              }
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        L9: {
          if (id.field_t == un.field_c) {
            var9 = 2;
            if (!uj.a((byte) -96, var9)) {
              break L9;
            } else {
              var10 = un.field_e.a((byte) 81);
              un.field_e.field_n = 0;
              if (!uj.a((byte) -118, var10)) {
                break L9;
              } else {
                var11 = mr.field_X.length;
                var12 = 0;
                L10: while (true) {
                  if (var12 >= var11) {
                    lr.b((byte) -116);
                    vu.field_Db = false;
                    return var11 + 100;
                  } else {
                    mr.field_X[var12] = un.field_e.j(17);
                    var12++;
                    continue L10;
                  }
                }
              }
            }
          } else {
            break L9;
          }
        }
        L11: {
          if (lm.field_N != un.field_c) {
            break L11;
          } else {
            if (!ps.a(180)) {
              break L11;
            } else {
              L12: {
                if (-256 != (so.field_b ^ -1)) {
                  gd.field_b = un.field_e.a(61);
                  break L12;
                } else {
                  var9_ref = un.field_e.a(true);
                  if (var9_ref == null) {
                    break L12;
                  } else {
                    mp.a(so.a(62), true, var9_ref);
                    break L12;
                  }
                }
              }
              lr.b((byte) -116);
              vu.field_Db = false;
              return so.field_b;
            }
          }
        }
        if (!param6) {
          L13: {
            if (null == op.field_y) {
              if (vu.field_Db) {
                L14: {
                  if (30000L >= aa.c(29680)) {
                    gd.field_b = ic.field_e;
                    break L14;
                  } else {
                    gd.field_b = md.field_h;
                    break L14;
                  }
                }
                vu.field_Db = false;
                return 249;
              } else {
                var9 = rl.field_o;
                rl.field_o = pn.field_y;
                pn.field_y = var9;
                vu.field_Db = true;
                break L13;
              }
            } else {
              break L13;
            }
          }
          return -1;
        } else {
          return -108;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = Kickabout.field_G;
          ((m) this).field_e[((m) this).field_l] = (byte)hf.a((int) ((m) this).field_e[((m) this).field_l], 128 >>> qj.b(7, ((m) this).field_o));
          ((m) this).field_l = ((m) this).field_l + 1;
          if (-33 <= ((m) this).field_l) {
            break L0;
          } else {
            L1: while (true) {
              if (-65 <= ((m) this).field_l) {
                this.a((byte) 18);
                ((m) this).field_l = 0;
                break L0;
              } else {
                ((m) this).field_l = ((m) this).field_l + 1;
                ((m) this).field_e[((m) this).field_l] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (32 <= ((m) this).field_l) {
            L3: {
              if (param1 == 21024) {
                break L3;
              } else {
                var9 = null;
                int discarded$1 = m.a(64, (ec) null, (ec) null, -29, false, (String) null, true);
                break L3;
              }
            }
            dv.a(((m) this).field_j, 0, ((m) this).field_e, 32, 32);
            this.a((byte) 18);
            var4 = 0;
            var5 = param2;
            L4: while (true) {
              if (var4 >= 8) {
                return;
              } else {
                var6 = ((m) this).field_n[var4];
                param0[var5] = (byte)(int)(var6 >>> -602902344);
                param0[1 + var5] = (byte)(int)(var6 >>> 1021887472);
                param0[var5 + 2] = (byte)(int)(var6 >>> 1891649320);
                param0[var5 - -3] = (byte)(int)(var6 >>> 917208288);
                param0[var5 - -4] = (byte)(int)(var6 >>> -1907387560);
                param0[5 + var5] = (byte)(int)(var6 >>> -1125512688);
                param0[var5 - -6] = (byte)(int)(var6 >>> -870977592);
                param0[7 + var5] = (byte)(int)var6;
                var5 += 8;
                var4++;
                continue L4;
              }
            }
          } else {
            ((m) this).field_l = ((m) this).field_l + 1;
            ((m) this).field_e[((m) this).field_l] = (byte) 0;
            continue L2;
          }
        }
    }

    final static void a(sj param0, sj param1, int param2) {
        if (param2 != 5198) {
            field_a = 1.2037987668274452;
        }
    }

    final void a(byte param0, long param1, byte[] param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Kickabout.field_G;
          var5 = 0;
          var6 = 8 - ((int)param1 & 7) & 7;
          var7 = ((m) this).field_o & 7;
          var9 = param1;
          if (param0 >= 6) {
            break L0;
          } else {
            field_a = 0.37608334077803834;
            break L0;
          }
        }
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if ((var11 ^ -1) > -1) {
            L2: while (true) {
              if (-9L <= (param1 ^ -1L)) {
                L3: {
                  if (param1 <= 0L) {
                    var8 = 0;
                    break L3;
                  } else {
                    var8 = param2[var5] << var6 & 255;
                    ((m) this).field_e[((m) this).field_l] = (byte)hf.a((int) ((m) this).field_e[((m) this).field_l], var8 >>> var7);
                    break L3;
                  }
                }
                L4: {
                  if (8L > param1 + (long)var7) {
                    ((m) this).field_o = (int)((long)((m) this).field_o + param1);
                    break L4;
                  } else {
                    L5: {
                      ((m) this).field_l = ((m) this).field_l + 1;
                      param1 = param1 - (long)(8 + -var7);
                      ((m) this).field_o = ((m) this).field_o + (8 + -var7);
                      if (512 != ((m) this).field_o) {
                        break L5;
                      } else {
                        this.a((byte) 18);
                        ((m) this).field_o = 0;
                        ((m) this).field_l = 0;
                        break L5;
                      }
                    }
                    ((m) this).field_e[((m) this).field_l] = (byte)qj.b(255, var8 << -var7 + 8);
                    ((m) this).field_o = ((m) this).field_o + (int)param1;
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = 255 & param2[var5] << var6 | (255 & param2[1 + var5]) >>> -var6 + 8;
                  if (-1 < var8) {
                    break L6;
                  } else {
                    if (-257 <= var8) {
                      break L6;
                    } else {
                      L7: {
                        ((m) this).field_e[((m) this).field_l] = (byte)hf.a((int) ((m) this).field_e[((m) this).field_l], var8 >>> var7);
                        ((m) this).field_o = ((m) this).field_o + (8 + -var7);
                        ((m) this).field_l = ((m) this).field_l + 1;
                        if (512 != ((m) this).field_o) {
                          break L7;
                        } else {
                          this.a((byte) 18);
                          ((m) this).field_l = 0;
                          ((m) this).field_o = 0;
                          break L7;
                        }
                      }
                      ((m) this).field_e[((m) this).field_l] = (byte)qj.b(255, var8 << -var7 + 8);
                      ((m) this).field_o = ((m) this).field_o + var7;
                      var5++;
                      param1 = param1 - 8L;
                      continue L2;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((((m) this).field_j[var11] & 255) - -((int)var9 & 255));
            ((m) this).field_j[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (!param0) {
            return;
        }
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            ((m) this).field_j[var2] = (byte) 0;
        }
        ((m) this).field_o = 0;
        ((m) this).field_e[0] = (byte) 0;
        ((m) this).field_l = 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((m) this).field_n[var2] = 0L;
        }
    }

    m() {
        ((m) this).field_e = new byte[64];
        ((m) this).field_l = 0;
        ((m) this).field_c = new long[8];
        ((m) this).field_j = new byte[32];
        ((m) this).field_p = new long[8];
        ((m) this).field_g = new long[8];
        ((m) this).field_k = new long[8];
        ((m) this).field_n = new long[8];
        ((m) this).field_o = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0.0;
        field_i = "Attacking";
        field_b = "<%0> cannot join; the game has started.";
    }
}
