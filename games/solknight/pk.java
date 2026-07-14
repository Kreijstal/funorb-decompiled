/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends kj {
    static int field_ab;
    private String field_V;
    private o field_W;
    static String field_T;
    static String field_X;
    private int field_Z;
    static o field_Y;
    private oe field_U;

    final static void i(int param0) {
        wb.a(ia.g(-74), (byte) -83);
        if (param0 != 918092705) {
            int[] discarded$0 = pk.a(41, false, 105);
        }
    }

    final boolean a(int param0, rc param1) {
        if (param0 != -1463) {
            field_Y = null;
            return false;
        }
        return false;
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = uk.a((byte) -64, param0);
        var4 = rd.a((byte) -30, param0);
        if (param1) {
          field_Y = null;
          var5 = uk.a((byte) -64, param2);
          var6 = rd.a((byte) -30, param2);
          var7 = (int)((long)var3 * (long)var5 >> -576850864);
          var8 = (int)((long)var3 * (long)var6 >> -1385153968);
          var9 = (int)((long)var4 * (long)var5 >> 2105852432);
          var10 = (int)((long)var4 * (long)var6 >> -244169776);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var5 = uk.a((byte) -64, param2);
          var6 = rd.a((byte) -30, param2);
          var7 = (int)((long)var3 * (long)var5 >> -576850864);
          var8 = (int)((long)var3 * (long)var6 >> -1385153968);
          var9 = (int)((long)var4 * (long)var5 >> 2105852432);
          var10 = (int)((long)var4 * (long)var6 >> -244169776);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        qf var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        o var16 = null;
        String var17 = null;
        Object var18 = null;
        o var19 = null;
        o var20 = null;
        o var21 = null;
        String var22 = null;
        Object var23 = null;
        o var24 = null;
        o var25 = null;
        o var26 = null;
        String var27 = null;
        Object var28 = null;
        o var29 = null;
        o var30 = null;
        o var31 = null;
        String var32 = null;
        Object var33 = null;
        o var34 = null;
        o var35 = null;
        o var36 = null;
        eg var37 = null;
        eg var38 = null;
        eg var39 = null;
        eg var40 = null;
        var18 = null;
        var23 = null;
        var28 = null;
        var33 = null;
        var13 = SolKnight.field_L ? 1 : 0;
        var6 = ((pk) this).field_U.b(param3 ^ -9362);
        if (hg.field_E != var6) {
          if (db.field_u != var6) {
            var27 = ((pk) this).field_U.c(-111);
            if (var27 == null) {
              L0: {
                var32 = ((pk) this).field_V;
                if (!var32.equals((Object) (Object) ((pk) this).field_i)) {
                  ((pk) this).field_i = var32;
                  ((pk) this).a((byte) -21);
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                super.a(param0, param1, param2, param3);
                var6 = ((pk) this).field_U.b(-9362);
                var40 = (eg) (Object) ((pk) this).field_w;
                var9 = param2 + ((pk) this).field_m;
                var10 = var40.a((rc) this, false, param0) - -(var40.a(-21480, (rc) this).a((byte) 126) >> -1217005343);
                if (var6 == hg.field_E) {
                  break L1;
                } else {
                  if (db.field_u == var6) {
                    break L1;
                  } else {
                    if (rg.field_f != var6) {
                      if (var6 == ph.field_g) {
                        var34 = gb.field_k[1];
                        var34.a(var9, var10 - (var34.field_t >> 810763585), 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var35 = gb.field_k[2];
                      var35.a(var9, -(var35.field_t >> 1088753025) + var10, 256);
                      return;
                    }
                  }
                }
              }
              var36 = gb.field_k[0];
              var11 = var36.field_q << 12669153;
              var12 = var36.field_r << 918092705;
              if (null != ((pk) this).field_W) {
                if (var11 <= ((pk) this).field_W.field_p) {
                  if (var12 <= ((pk) this).field_W.field_t) {
                    cl.a(-125, ((pk) this).field_W);
                    mi.a();
                    var36.b(112, 144, var36.field_q << 375364356, var36.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                    mf.e(4096);
                    ((pk) this).field_W.a(-(var36.field_q >> 436321985) + var9, var10 + -var36.field_r, 256);
                    return;
                  } else {
                    ((pk) this).field_W = new o(var11, var12);
                    cl.a(-94, ((pk) this).field_W);
                    var36.b(112, 144, var36.field_q << 375364356, var36.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                    mf.e(4096);
                    ((pk) this).field_W.a(-(var36.field_q >> 436321985) + var9, var10 + -var36.field_r, 256);
                    return;
                  }
                } else {
                  ((pk) this).field_W = new o(var11, var12);
                  cl.a(-94, ((pk) this).field_W);
                  var36.b(112, 144, var36.field_q << 375364356, var36.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                  mf.e(4096);
                  ((pk) this).field_W.a(-(var36.field_q >> 436321985) + var9, var10 + -var36.field_r, 256);
                  return;
                }
              } else {
                ((pk) this).field_W = new o(var11, var12);
                cl.a(-94, ((pk) this).field_W);
                var36.b(112, 144, var36.field_q << 375364356, var36.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                mf.e(4096);
                ((pk) this).field_W.a(-(var36.field_q >> 436321985) + var9, var10 + -var36.field_r, 256);
                return;
              }
            } else {
              L2: {
                if (!var27.equals((Object) (Object) ((pk) this).field_i)) {
                  ((pk) this).field_i = var27;
                  ((pk) this).a((byte) -21);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                super.a(param0, param1, param2, param3);
                var6 = ((pk) this).field_U.b(-9362);
                var39 = (eg) (Object) ((pk) this).field_w;
                var9 = param2 + ((pk) this).field_m;
                var10 = var39.a((rc) this, false, param0) - -(var39.a(-21480, (rc) this).a((byte) 126) >> -1217005343);
                if (var6 == hg.field_E) {
                  break L3;
                } else {
                  if (db.field_u == var6) {
                    break L3;
                  } else {
                    L4: {
                      if (rg.field_f == var6) {
                        var30 = gb.field_k[2];
                        var30.a(var9, -(var30.field_t >> 1088753025) + var10, 256);
                        break L4;
                      } else {
                        if (var6 == ph.field_g) {
                          var29 = gb.field_k[1];
                          var29.a(var9, var10 - (var29.field_t >> 810763585), 256);
                          break L4;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              var31 = gb.field_k[0];
              var16 = var31;
              var11 = var31.field_q << 12669153;
              var12 = var31.field_r << 918092705;
              if (null != ((pk) this).field_W) {
                if (var11 <= ((pk) this).field_W.field_p) {
                  if (var12 <= ((pk) this).field_W.field_t) {
                    cl.a(-125, ((pk) this).field_W);
                    mi.a();
                    var31.b(112, 144, var31.field_q << 375364356, var31.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                    mf.e(4096);
                    ((pk) this).field_W.a(-(var31.field_q >> 436321985) + var9, var10 + -var31.field_r, 256);
                    return;
                  } else {
                    ((pk) this).field_W = new o(var11, var12);
                    cl.a(-94, ((pk) this).field_W);
                    var31.b(112, 144, var31.field_q << 375364356, var31.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                    mf.e(4096);
                    ((pk) this).field_W.a(-(var31.field_q >> 436321985) + var9, var10 + -var31.field_r, 256);
                    return;
                  }
                } else {
                  ((pk) this).field_W = new o(var11, var12);
                  cl.a(-94, ((pk) this).field_W);
                  var31.b(112, 144, var31.field_q << 375364356, var31.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                  mf.e(4096);
                  ((pk) this).field_W.a(-(var31.field_q >> 436321985) + var9, var10 + -var31.field_r, 256);
                  return;
                }
              } else {
                ((pk) this).field_W = new o(var11, var12);
                cl.a(-94, ((pk) this).field_W);
                var31.b(112, 144, var31.field_q << 375364356, var31.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                mf.e(4096);
                ((pk) this).field_W.a(-(var31.field_q >> 436321985) + var9, var10 + -var31.field_r, 256);
                return;
              }
            }
          } else {
            L5: {
              var22 = g.field_e;
              if (!var22.equals((Object) (Object) ((pk) this).field_i)) {
                ((pk) this).field_i = var22;
                ((pk) this).a((byte) -21);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              super.a(param0, param1, param2, param3);
              var6 = ((pk) this).field_U.b(-9362);
              var38 = (eg) (Object) ((pk) this).field_w;
              var9 = param2 + ((pk) this).field_m;
              var10 = var38.a((rc) this, false, param0) - -(var38.a(-21480, (rc) this).a((byte) 126) >> -1217005343);
              if (var6 == hg.field_E) {
                break L6;
              } else {
                if (db.field_u == var6) {
                  break L6;
                } else {
                  if (rg.field_f != var6) {
                    if (var6 == ph.field_g) {
                      var24 = gb.field_k[1];
                      var24.a(var9, var10 - (var24.field_t >> 810763585), 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var25 = gb.field_k[2];
                    var25.a(var9, -(var25.field_t >> 1088753025) + var10, 256);
                    return;
                  }
                }
              }
            }
            var26 = gb.field_k[0];
            var11 = var26.field_q << 12669153;
            var12 = var26.field_r << 918092705;
            if (null != ((pk) this).field_W) {
              if (var11 <= ((pk) this).field_W.field_p) {
                if (var12 > ((pk) this).field_W.field_t) {
                  ((pk) this).field_W = new o(var11, var12);
                  cl.a(-94, ((pk) this).field_W);
                  var26.b(112, 144, var26.field_q << 375364356, var26.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                  mf.e(4096);
                  ((pk) this).field_W.a(-(var26.field_q >> 436321985) + var9, var10 + -var26.field_r, 256);
                  return;
                } else {
                  cl.a(-125, ((pk) this).field_W);
                  mi.a();
                  var26.b(112, 144, var26.field_q << 375364356, var26.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                  mf.e(4096);
                  ((pk) this).field_W.a(-(var26.field_q >> 436321985) + var9, var10 + -var26.field_r, 256);
                  return;
                }
              } else {
                ((pk) this).field_W = new o(var11, var12);
                cl.a(-94, ((pk) this).field_W);
                var26.b(112, 144, var26.field_q << 375364356, var26.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                mf.e(4096);
                ((pk) this).field_W.a(-(var26.field_q >> 436321985) + var9, var10 + -var26.field_r, 256);
                return;
              }
            } else {
              ((pk) this).field_W = new o(var11, var12);
              cl.a(-94, ((pk) this).field_W);
              var26.b(112, 144, var26.field_q << 375364356, var26.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
              mf.e(4096);
              ((pk) this).field_W.a(-(var26.field_q >> 436321985) + var9, var10 + -var26.field_r, 256);
              return;
            }
          }
        } else {
          L7: {
            var17 = g.field_e;
            if (!var17.equals((Object) (Object) ((pk) this).field_i)) {
              ((pk) this).field_i = var17;
              ((pk) this).a((byte) -21);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            super.a(param0, param1, param2, param3);
            var6 = ((pk) this).field_U.b(-9362);
            var37 = (eg) (Object) ((pk) this).field_w;
            var9 = param2 + ((pk) this).field_m;
            var10 = var37.a((rc) this, false, param0) - -(var37.a(-21480, (rc) this).a((byte) 126) >> -1217005343);
            if (var6 == hg.field_E) {
              break L8;
            } else {
              if (db.field_u == var6) {
                break L8;
              } else {
                if (rg.field_f != var6) {
                  if (var6 == ph.field_g) {
                    var19 = gb.field_k[1];
                    var19.a(var9, var10 - (var19.field_t >> 810763585), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var20 = gb.field_k[2];
                  var20.a(var9, -(var20.field_t >> 1088753025) + var10, 256);
                  return;
                }
              }
            }
          }
          var21 = gb.field_k[0];
          var11 = var21.field_q << 12669153;
          var12 = var21.field_r << 918092705;
          if (null != ((pk) this).field_W) {
            if (var11 <= ((pk) this).field_W.field_p) {
              if (var12 <= ((pk) this).field_W.field_t) {
                cl.a(-125, ((pk) this).field_W);
                mi.a();
                var21.b(112, 144, var21.field_q << 375364356, var21.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                mf.e(4096);
                ((pk) this).field_W.a(-(var21.field_q >> 436321985) + var9, var10 + -var21.field_r, 256);
                return;
              } else {
                ((pk) this).field_W = new o(var11, var12);
                cl.a(-94, ((pk) this).field_W);
                var21.b(112, 144, var21.field_q << 375364356, var21.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
                mf.e(4096);
                ((pk) this).field_W.a(-(var21.field_q >> 436321985) + var9, var10 + -var21.field_r, 256);
                return;
              }
            } else {
              ((pk) this).field_W = new o(var11, var12);
              cl.a(-94, ((pk) this).field_W);
              var21.b(112, 144, var21.field_q << 375364356, var21.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
              mf.e(4096);
              ((pk) this).field_W.a(-(var21.field_q >> 436321985) + var9, var10 + -var21.field_r, 256);
              return;
            }
          } else {
            ((pk) this).field_W = new o(var11, var12);
            cl.a(-94, ((pk) this).field_W);
            var21.b(112, 144, var21.field_q << 375364356, var21.field_r << 1544874180, -((pk) this).field_Z << 1773101066, 4096);
            mf.e(4096);
            ((pk) this).field_W.a(-(var21.field_q >> 436321985) + var9, var10 + -var21.field_r, 256);
            return;
          }
        }
    }

    public static void j(int param0) {
        int var1 = 118 % ((param0 - -39) / 46);
        field_X = null;
        field_Y = null;
        field_T = null;
    }

    final static void a(byte param0, int param1, boolean param2) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) kj.field_P;
                    // monitorenter kj.field_P
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        jg.a(c.field_M[param1], param0 + 182, param2);
                        be.field_K = qc.field_o[param1];
                        ed.a((byte) -122);
                        // monitorexit var3
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var4;
                }
                case 5: {
                    if (param0 != -96) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    int[] discarded$2 = pk.a(-56, true, 93);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String c(byte param0) {
        if (param0 >= 14) {
            return null;
        }
        pk.i(109);
        return null;
    }

    final static void a(byte param0, rb param1) {
        int var2_int = 0;
        rb[] var2 = null;
        int var3 = 0;
        rb[] var4 = null;
        rb[] var5 = null;
        rb[] var8 = null;
        rb[] var29 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        if (0 < (param1.field_b << 1926878225) + lc.field_h) {
          lc.field_h = lc.field_h + (param1.field_b << 234713681);
          ic.field_t = ic.field_t + ud.field_k * param1.field_b;
          if (kf.field_G == null) {
            kf.field_G = new rb[8];
            kf.field_G[0] = param1;
            if (param0 != 32) {
              pk.a((byte) 49, 75);
              return;
            } else {
              return;
            }
          } else {
            var2_int = 0;
            L0: while (true) {
              if (kf.field_G.length <= var2_int) {
                var8 = kf.field_G;
                var4 = var8;
                var2 = var8;
                kf.field_G = new rb[kf.field_G.length << 931773153];
                fk.a((Object[]) (Object) var2, 0, (Object[]) (Object) kf.field_G, 0, var8.length);
                kf.field_G[var8.length] = param1;
                if (param0 == 32) {
                  return;
                } else {
                  pk.a((byte) 49, 75);
                  return;
                }
              } else {
                if (kf.field_G[var2_int] != null) {
                  var2_int++;
                  continue L0;
                } else {
                  kf.field_G[var2_int] = param1;
                  return;
                }
              }
            }
          }
        } else {
          if (param1.field_b >= lc.field_h >>> -2040804367) {
            if (kf.field_G == null) {
              kf.field_G = new rb[8];
              kf.field_G[0] = param1;
              if (param0 == 32) {
                return;
              } else {
                pk.a((byte) 49, 75);
                return;
              }
            } else {
              var2_int = 0;
              L1: while (true) {
                if (kf.field_G.length <= var2_int) {
                  var29 = kf.field_G;
                  var4 = var29;
                  var2 = var29;
                  kf.field_G = new rb[kf.field_G.length << 931773153];
                  fk.a((Object[]) (Object) var2, 0, (Object[]) (Object) kf.field_G, 0, var29.length);
                  kf.field_G[var29.length] = param1;
                  if (param0 == 32) {
                    return;
                  } else {
                    pk.a((byte) 49, 75);
                    return;
                  }
                } else {
                  if (kf.field_G[var2_int] != null) {
                    var2_int++;
                    continue L1;
                  } else {
                    kf.field_G[var2_int] = param1;
                    return;
                  }
                }
              }
            }
          } else {
            L2: {
              lc.field_h = lc.field_h - (param1.field_b << -1716215215);
              ic.field_t = ic.field_t - ud.field_k * param1.field_b;
              if (kf.field_G == null) {
                kf.field_G = new rb[8];
                kf.field_G[0] = param1;
                break L2;
              } else {
                var2_int = 0;
                L3: while (true) {
                  if (kf.field_G.length <= var2_int) {
                    var5 = kf.field_G;
                    var4 = var5;
                    var2 = var5;
                    kf.field_G = new rb[kf.field_G.length << 931773153];
                    fk.a((Object[]) (Object) var2, 0, (Object[]) (Object) kf.field_G, 0, var5.length);
                    kf.field_G[var5.length] = param1;
                    break L2;
                  } else {
                    if (kf.field_G[var2_int] != null) {
                      var2_int++;
                      continue L3;
                    } else {
                      kf.field_G[var2_int] = param1;
                      return;
                    }
                  }
                }
              }
            }
            if (param0 == 32) {
              return;
            } else {
              pk.a((byte) 49, 75);
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, mg param3, int param4, int param5, int param6, int param7, int param8, o[] param9, int param10, byte param11, o[] param12, int param13, int param14, int param15, int param16, mg param17, int param18, int param19, o[] param20) {
        la.a(param8, param0, param5, param15, param3, new hi(param20), param10, param18, param16, param13, param14, -111, param17, param1, param6, param7, new hi(param12), param4, new hi(param9), param2, param19);
        if (param11 >= -59) {
            pk.i(112);
        }
    }

    final static void c(boolean param0) {
        qk.d(14995);
        if (null != dc.field_q) {
          L0: {
            nc.a((byte) 86, dc.field_q);
            cb.a((byte) -15);
            nh.a(-117);
            m.b(param0);
            if (ak.a(60)) {
              id.field_c.e(1, -2147483648);
              qf.a(0, 0);
              break L0;
            } else {
              break L0;
            }
          }
          je.a(param0);
          return;
        } else {
          L1: {
            cb.a((byte) -15);
            nh.a(-117);
            m.b(param0);
            if (ak.a(60)) {
              id.field_c.e(1, -2147483648);
              qf.a(0, 0);
              break L1;
            } else {
              break L1;
            }
          }
          je.a(param0);
          return;
        }
    }

    final void a(int param0, int param1, int param2, rc param3) {
        ((pk) this).field_Z = ((pk) this).field_Z + 1;
        if (param1 != 18874) {
          return;
        } else {
          super.a(param0, param1 + 0, param2, param3);
          return;
        }
    }

    pk(oe param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (j) (Object) hj.a((byte) -65));
        ((pk) this).field_V = param1;
        ((pk) this).field_U = param0;
        ((pk) this).b(param5, param4, param2, 0, param3);
    }

    final static void a(byte param0, int param1) {
        vk.field_g = (param1 & 57) >> -1890207708;
        lh.field_q = (15 & param1) >> -1268476702;
        if ((vk.field_g ^ -1) >= -3) {
          if (2 >= lh.field_q) {
            if (param0 == -48) {
              bi.field_d = 3 & param1;
              if (bi.field_d > 2) {
                bi.field_d = 2;
                return;
              } else {
                return;
              }
            } else {
              pk.d(true);
              bi.field_d = 3 & param1;
              if (bi.field_d > 2) {
                bi.field_d = 2;
                return;
              } else {
                return;
              }
            }
          } else {
            lh.field_q = 2;
            if (param0 == -48) {
              bi.field_d = 3 & param1;
              if (bi.field_d > 2) {
                bi.field_d = 2;
                return;
              } else {
                return;
              }
            } else {
              pk.d(true);
              bi.field_d = 3 & param1;
              if (bi.field_d > 2) {
                bi.field_d = 2;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          vk.field_g = 2;
          if (2 < lh.field_q) {
            lh.field_q = 2;
            if (param0 != -48) {
              pk.d(true);
              bi.field_d = 3 & param1;
              if (bi.field_d > 2) {
                bi.field_d = 2;
                return;
              } else {
                return;
              }
            } else {
              L0: {
                bi.field_d = 3 & param1;
                if (bi.field_d <= 2) {
                  break L0;
                } else {
                  bi.field_d = 2;
                  break L0;
                }
              }
              return;
            }
          } else {
            if (param0 != -48) {
              pk.d(true);
              bi.field_d = 3 & param1;
              if (bi.field_d <= 2) {
                return;
              } else {
                bi.field_d = 2;
                return;
              }
            } else {
              L1: {
                bi.field_d = 3 & param1;
                if (bi.field_d <= 2) {
                  break L1;
                } else {
                  bi.field_d = 2;
                  break L1;
                }
              }
              return;
            }
          }
        }
    }

    final static void d(boolean param0) {
        if (!param0) {
            pk.i(16);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Combo Power: <%0>";
        field_X = "Confirm Password: ";
    }
}
