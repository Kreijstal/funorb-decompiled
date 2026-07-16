/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static fl field_g;
    private byte[] field_f;
    private long[] field_k;
    static oh[] field_l;
    static int field_b;
    private long[] field_h;
    private int field_j;
    static a field_a;
    private int field_e;
    private long[] field_d;
    private byte[] field_n;
    static int field_o;
    private long[] field_c;
    private long[] field_i;
    static int[] field_m;

    final static void a(int param0, int param1, int param2, int param3, boolean param4, boolean param5, boolean param6, boolean param7, int param8, boolean param9) {
        int var11 = 0;
        L0: {
          var11 = TetraLink.field_J;
          if (param6) {
            break L0;
          } else {
            L1: {
              if (ra.field_f != cf.field_n) {
                break L1;
              } else {
                if (ra.field_e == bk.field_c) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (pk.field_O.field_j != ra.field_e) {
              break L0;
            } else {
              if (pk.field_O.field_h == ra.field_f) {
                if (null != qb.field_N) {
                  cc.a(false, true);
                  break L0;
                } else {
                  if (null == qe.field_a) {
                    db.a(5);
                    break L0;
                  } else {
                    cc.a(true, true);
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
          if (param6) {
            vi.field_d = ud.field_Ob;
            break L2;
          } else {
            vi.field_d = (cf.field_n + -640) / 2;
            break L2;
          }
        }
        L3: {
          ca.a(param6, (byte) 16);
          if ((qd.field_ab ^ -1) < -1) {
            cn.a(param6, param8, 21485, param9);
            break L3;
          } else {
            break L3;
          }
        }
        if (param0 < -33) {
          L4: {
            tn.field_a.field_V = tn.field_b.field_V;
            tn.field_a.field_xb = 1;
            if (0 < ng.field_t) {
              dg.a(param9, false, param6, param8);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (0 < am.field_f) {
              mh.a(param5, param6, param8, param9, -87);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            L7: {
              if (!lg.field_S) {
                break L7;
              } else {
                if (qb.field_N.field_jc >= qb.field_N.field_rc) {
                  hn.field_Q.field_Ob.field_jb = cb.field_s;
                  hh.field_c.field_S = false;
                  hd.a(hn.field_Q.field_Pb, (byte) -104);
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            hn.field_Q.field_Ob.field_jb = null;
            hh.field_c.field_S = true;
            ci.a(param3, hn.field_Q, param7, -1, param8);
            break L6;
          }
          md.a(param8, param2, param7, param3, (byte) -73, param1, param4);
          ci.a(param3, v.field_x, param7, -1, param8);
          cb.field_u = cb.field_u + 1;
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, long param1, boolean param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TetraLink.field_J;
          var5 = 0;
          var6 = 7 & -(7 & (int)param1) + 8;
          var7 = ((li) this).field_j & 7;
          if (param2) {
            break L0;
          } else {
            li.a(-105);
            break L0;
          }
        }
        var9 = param1;
        var11 = 31;
        var12 = 0;
        L1: while (true) {
          if (0 > var11) {
            L2: while (true) {
              if (8L >= param1) {
                L3: {
                  if (0L < param1) {
                    var8 = param0[var5] << var6 & 255;
                    ((li) this).field_n[((li) this).field_e] = (byte)mc.a((int) ((li) this).field_n[((li) this).field_e], var8 >>> var7);
                    break L3;
                  } else {
                    var8 = 0;
                    break L3;
                  }
                }
                L4: {
                  if (-9L < ((long)var7 - -param1 ^ -1L)) {
                    ((li) this).field_j = (int)((long)((li) this).field_j + param1);
                    break L4;
                  } else {
                    L5: {
                      param1 = param1 - (long)(-var7 + 8);
                      ((li) this).field_j = ((li) this).field_j + (-var7 + 8);
                      ((li) this).field_e = ((li) this).field_e + 1;
                      if ((((li) this).field_j ^ -1) == -513) {
                        this.b(31);
                        ((li) this).field_e = 0;
                        ((li) this).field_j = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((li) this).field_n[((li) this).field_e] = (byte)pl.a(var8 << -var7 + 8, 255);
                    ((li) this).field_j = ((li) this).field_j + (int)param1;
                    break L4;
                  }
                }
                return;
              } else {
                L6: {
                  var8 = param0[var5] << var6 & 255 | (param0[var5 + 1] & 255) >>> 8 - var6;
                  if ((var8 ^ -1) > -1) {
                    break L6;
                  } else {
                    if (256 > var8) {
                      L7: {
                        ((li) this).field_n[((li) this).field_e] = (byte)mc.a((int) ((li) this).field_n[((li) this).field_e], var8 >>> var7);
                        ((li) this).field_e = ((li) this).field_e + 1;
                        ((li) this).field_j = ((li) this).field_j + (8 - var7);
                        if (-513 != (((li) this).field_j ^ -1)) {
                          break L7;
                        } else {
                          this.b(31);
                          ((li) this).field_e = 0;
                          ((li) this).field_j = 0;
                          break L7;
                        }
                      }
                      ((li) this).field_n[((li) this).field_e] = (byte)pl.a(255, var8 << -var7 + 8);
                      var5++;
                      param1 = param1 - 8L;
                      ((li) this).field_j = ((li) this).field_j + var7;
                      continue L2;
                    } else {
                      break L6;
                    }
                  }
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
          } else {
            var12 = var12 + ((255 & ((li) this).field_f[var11]) - -((int)var9 & 255));
            ((li) this).field_f[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
            continue L1;
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = TetraLink.field_J;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                if (param0 == 31) {
                  var2 = 1;
                  L2: while (true) {
                    if ((var2 ^ -1) < -11) {
                      var2 = 0;
                      L3: while (true) {
                        if (var2 >= 8) {
                          return;
                        } else {
                          ((li) this).field_k[var2] = mb.a(((li) this).field_k[var2], mb.a(((li) this).field_i[var2], ((li) this).field_d[var2]));
                          var2++;
                          continue L3;
                        }
                      }
                    } else {
                      var3 = 0;
                      L4: while (true) {
                        if ((var3 ^ -1) <= -9) {
                          var3 = 0;
                          L5: while (true) {
                            if (-9 >= (var3 ^ -1)) {
                              ((li) this).field_c[0] = mb.a(((li) this).field_c[0], vg.field_Ob[var2]);
                              var3 = 0;
                              L6: while (true) {
                                if (-9 >= (var3 ^ -1)) {
                                  var3 = 0;
                                  L7: while (true) {
                                    if (-9 >= (var3 ^ -1)) {
                                      var2++;
                                      continue L2;
                                    } else {
                                      ((li) this).field_d[var3] = ((li) this).field_h[var3];
                                      var3++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  ((li) this).field_h[var3] = ((li) this).field_c[var3];
                                  var7 = 0;
                                  var4 = var7;
                                  var5 = 56;
                                  L8: while (true) {
                                    if (8 <= var7) {
                                      var3++;
                                      continue L6;
                                    } else {
                                      ((li) this).field_h[var3] = mb.a(((li) this).field_h[var3], vg.field_Ub[var7][pl.a(255, (int)(((li) this).field_d[pl.a(7, -var7 + var3)] >>> var5))]);
                                      var5 -= 8;
                                      var7++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((li) this).field_c[var3] = ((li) this).field_h[var3];
                              var3++;
                              continue L5;
                            }
                          }
                        } else {
                          ((li) this).field_h[var3] = 0L;
                          var4 = 0;
                          var5 = 56;
                          L9: while (true) {
                            if (var4 >= 8) {
                              var3++;
                              continue L4;
                            } else {
                              ((li) this).field_h[var3] = mb.a(((li) this).field_h[var3], vg.field_Ub[var4][pl.a((int)(((li) this).field_c[pl.a(-var4 + var3, 7)] >>> var5), 255)]);
                              var5 -= 8;
                              var4++;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                ((li) this).field_c[var2] = ((li) this).field_k[var2];
                ((li) this).field_d[var2] = mb.a(((li) this).field_i[var2], ((li) this).field_k[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((li) this).field_i[var2] = mb.a(mb.a(pd.a(65280L, (long)((li) this).field_n[6 + var3] << 231594888), mb.a(mb.a(mb.a(mb.a(pd.a((long)((li) this).field_n[var3 + 2], 255L) << 1136343464, mb.a(pd.a((long)((li) this).field_n[1 + var3], 255L) << -784006544, (long)((li) this).field_n[var3] << 157679224)), pd.a(255L, (long)((li) this).field_n[3 + var3]) << -909275680), pd.a((long)((li) this).field_n[4 + var3], 255L) << -110311656), pd.a((long)((li) this).field_n[var3 - -5], 255L) << 51966352)), pd.a(255L, (long)((li) this).field_n[var3 + 7]));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        if (param0 != 255) {
            field_g = null;
        }
        field_m = null;
        field_l = null;
    }

    final static String a(int param0, String param1, int param2) {
        CharSequence var6 = (CharSequence) (Object) param1;
        if (!gi.a(false, var6)) {
            return uk.field_u;
        }
        if (ej.a(param1, param2 ^ 6)) {
            return hl.field_A;
        }
        if (-3 != (ji.field_Tb ^ -1)) {
            return f.field_w;
        }
        if (!(!sb.a((byte) 2, param1))) {
            return sk.a(new String[1], hl.field_B, 127);
        }
        if (!(100 > ca.field_c)) {
            return da.field_c;
        }
        if (oj.a(1, param1)) {
            return sk.a(new String[1], ji.field_Vb, param2 + 119);
        }
        bc var5 = nd.field_Lb;
        var5.f(param0, (byte) -92);
        var5.field_t = var5.field_t + 1;
        int var4 = var5.field_t;
        var5.a(param2, false);
        var5.a(param1, 0);
        var5.b(-var4 + var5.field_t, param2 ^ -4);
        return null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = TetraLink.field_J;
        for (var2 = 0; -33 < (var2 ^ -1); var2++) {
            ((li) this).field_f[var2] = (byte) 0;
        }
        ((li) this).field_e = 0;
        ((li) this).field_j = 0;
        ((li) this).field_n[0] = (byte) 0;
        if (param0) {
            return;
        }
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            ((li) this).field_k[var2] = 0L;
        }
    }

    final static void a(int param0, oh[] param1, int param2, boolean param3, int param4, int param5, int param6, oh[] param7, int param8, int param9, jb param10, int param11, jb param12, int param13, int param14) {
        Object var16 = null;
        ll.a(param13, (oh[]) null, param10, lk.field_wb, mc.field_b, -11319, param5, 0, param2, param14, 0, param8, param9, param7, ve.field_b, param6, param12, param0, param11, param1, 480);
        gb.a((byte) -75, param3);
        if (param4 >= -72) {
            li.a(4, 80, -105, 93, true, true, true, true, 64, false);
        }
    }

    final static void a(ie param0, Object param1, byte param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        if (param2 <= -92) {
          if (null == param0.field_p) {
            return;
          } else {
            var3_int = 0;
            L0: while (true) {
              L1: {
                if (var3_int >= 50) {
                  break L1;
                } else {
                  if (param0.field_p.peekEvent() == null) {
                    break L1;
                  } else {
                    tb.a(false, 1L);
                    var3_int++;
                    continue L0;
                  }
                }
              }
              try {
                L2: {
                  L3: {
                    if (param1 != null) {
                      param0.field_p.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  break L2;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var3 = (Exception) (Object) decompiledCaughtException;
                  break L4;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        L0: {
          var8 = TetraLink.field_J;
          ((li) this).field_n[((li) this).field_e] = (byte)mc.a((int) ((li) this).field_n[((li) this).field_e], 128 >>> pl.a(((li) this).field_j, 7));
          ((li) this).field_e = ((li) this).field_e + 1;
          if (-33 <= ((li) this).field_e) {
            break L0;
          } else {
            L1: while (true) {
              if (-65 <= ((li) this).field_e) {
                this.b(31);
                ((li) this).field_e = 0;
                break L0;
              } else {
                int fieldTemp$2 = ((li) this).field_e;
                ((li) this).field_e = ((li) this).field_e + 1;
                ((li) this).field_n[fieldTemp$2] = (byte) 0;
                continue L1;
              }
            }
          }
        }
        L2: while (true) {
          if (((li) this).field_e >= 32) {
            L3: {
              rd.a(((li) this).field_f, 0, ((li) this).field_n, 32, 32);
              this.b(31);
              var4 = 0;
              var5 = param1;
              if (param2 < -39) {
                break L3;
              } else {
                ((li) this).field_c = null;
                break L3;
              }
            }
            L4: while (true) {
              if ((var4 ^ -1) <= -9) {
                return;
              } else {
                var6 = ((li) this).field_k[var4];
                param0[var5] = (byte)(int)(var6 >>> 780042296);
                param0[var5 + 1] = (byte)(int)(var6 >>> -1934791056);
                param0[var5 - -2] = (byte)(int)(var6 >>> 557161896);
                param0[var5 + 3] = (byte)(int)(var6 >>> 110379104);
                param0[4 + var5] = (byte)(int)(var6 >>> 745446488);
                param0[5 + var5] = (byte)(int)(var6 >>> 1886456784);
                param0[var5 + 6] = (byte)(int)(var6 >>> 1999760008);
                param0[var5 - -7] = (byte)(int)var6;
                var5 += 8;
                var4++;
                continue L4;
              }
            }
          } else {
            int fieldTemp$3 = ((li) this).field_e;
            ((li) this).field_e = ((li) this).field_e + 1;
            ((li) this).field_n[fieldTemp$3] = (byte) 0;
            continue L2;
          }
        }
    }

    li() {
        ((li) this).field_f = new byte[32];
        ((li) this).field_k = new long[8];
        ((li) this).field_j = 0;
        ((li) this).field_h = new long[8];
        ((li) this).field_e = 0;
        ((li) this).field_d = new long[8];
        ((li) this).field_n = new byte[64];
        ((li) this).field_c = new long[8];
        ((li) this).field_i = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_o = 0;
        field_a = new a();
    }
}
