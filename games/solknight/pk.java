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
            if (param0 == -1463) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_Y = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pk.MA(").append(param0).append(44);
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
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var3 = uk.a((byte) -64, param0);
        int var4 = rd.a((byte) -30, param0);
        int var5 = uk.a((byte) -64, param2);
        int var6 = rd.a((byte) -30, param2);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
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
                var10 = var40.a((rc) this, false, param0) - -(var40.a(-21480, (rc) this).a((byte) 126) >> 1);
                if (var6 == hg.field_E) {
                  break L1;
                } else {
                  if (db.field_u == var6) {
                    break L1;
                  } else {
                    if (rg.field_f != var6) {
                      if (var6 == ph.field_g) {
                        var34 = gb.field_k[1];
                        var34.a(var9, var10 - (var34.field_t >> 1), 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var35 = gb.field_k[2];
                      var35.a(var9, -(var35.field_t >> 1) + var10, 256);
                      return;
                    }
                  }
                }
              }
              var36 = gb.field_k[0];
              var11 = var36.field_q << 1;
              var12 = var36.field_r << 1;
              if (null != ((pk) this).field_W) {
                if (var11 <= ((pk) this).field_W.field_p) {
                  if (var12 <= ((pk) this).field_W.field_t) {
                    cl.a(-125, ((pk) this).field_W);
                    mi.a();
                    var36.b(112, 144, var36.field_q << 4, var36.field_r << 4, -((pk) this).field_Z << 10, 4096);
                    mf.e(4096);
                    ((pk) this).field_W.a(-(var36.field_q >> 1) + var9, var10 + -var36.field_r, 256);
                    return;
                  } else {
                    ((pk) this).field_W = new o(var11, var12);
                    cl.a(-94, ((pk) this).field_W);
                    var36.b(112, 144, var36.field_q << 4, var36.field_r << 4, -((pk) this).field_Z << 10, 4096);
                    mf.e(4096);
                    ((pk) this).field_W.a(-(var36.field_q >> 1) + var9, var10 + -var36.field_r, 256);
                    return;
                  }
                } else {
                  ((pk) this).field_W = new o(var11, var12);
                  cl.a(-94, ((pk) this).field_W);
                  var36.b(112, 144, var36.field_q << 4, var36.field_r << 4, -((pk) this).field_Z << 10, 4096);
                  mf.e(4096);
                  ((pk) this).field_W.a(-(var36.field_q >> 1) + var9, var10 + -var36.field_r, 256);
                  return;
                }
              } else {
                ((pk) this).field_W = new o(var11, var12);
                cl.a(-94, ((pk) this).field_W);
                var36.b(112, 144, var36.field_q << 4, var36.field_r << 4, -((pk) this).field_Z << 10, 4096);
                mf.e(4096);
                ((pk) this).field_W.a(-(var36.field_q >> 1) + var9, var10 + -var36.field_r, 256);
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
                var10 = var39.a((rc) this, false, param0) - -(var39.a(-21480, (rc) this).a((byte) 126) >> 1);
                if (var6 == hg.field_E) {
                  break L3;
                } else {
                  if (db.field_u == var6) {
                    break L3;
                  } else {
                    L4: {
                      if (rg.field_f == var6) {
                        var30 = gb.field_k[2];
                        var30.a(var9, -(var30.field_t >> 1) + var10, 256);
                        break L4;
                      } else {
                        if (var6 == ph.field_g) {
                          var29 = gb.field_k[1];
                          var29.a(var9, var10 - (var29.field_t >> 1), 256);
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
              var11 = var31.field_q << 1;
              var12 = var31.field_r << 1;
              if (null != ((pk) this).field_W) {
                if (var11 <= ((pk) this).field_W.field_p) {
                  if (var12 <= ((pk) this).field_W.field_t) {
                    cl.a(-125, ((pk) this).field_W);
                    mi.a();
                    var31.b(112, 144, var31.field_q << 4, var31.field_r << 4, -((pk) this).field_Z << 10, 4096);
                    mf.e(4096);
                    ((pk) this).field_W.a(-(var31.field_q >> 1) + var9, var10 + -var31.field_r, 256);
                    return;
                  } else {
                    ((pk) this).field_W = new o(var11, var12);
                    cl.a(-94, ((pk) this).field_W);
                    var31.b(112, 144, var31.field_q << 4, var31.field_r << 4, -((pk) this).field_Z << 10, 4096);
                    mf.e(4096);
                    ((pk) this).field_W.a(-(var31.field_q >> 1) + var9, var10 + -var31.field_r, 256);
                    return;
                  }
                } else {
                  ((pk) this).field_W = new o(var11, var12);
                  cl.a(-94, ((pk) this).field_W);
                  var31.b(112, 144, var31.field_q << 4, var31.field_r << 4, -((pk) this).field_Z << 10, 4096);
                  mf.e(4096);
                  ((pk) this).field_W.a(-(var31.field_q >> 1) + var9, var10 + -var31.field_r, 256);
                  return;
                }
              } else {
                ((pk) this).field_W = new o(var11, var12);
                cl.a(-94, ((pk) this).field_W);
                var31.b(112, 144, var31.field_q << 4, var31.field_r << 4, -((pk) this).field_Z << 10, 4096);
                mf.e(4096);
                ((pk) this).field_W.a(-(var31.field_q >> 1) + var9, var10 + -var31.field_r, 256);
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
              var10 = var38.a((rc) this, false, param0) - -(var38.a(-21480, (rc) this).a((byte) 126) >> 1);
              if (var6 == hg.field_E) {
                break L6;
              } else {
                if (db.field_u == var6) {
                  break L6;
                } else {
                  if (rg.field_f != var6) {
                    if (var6 == ph.field_g) {
                      var24 = gb.field_k[1];
                      var24.a(var9, var10 - (var24.field_t >> 1), 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var25 = gb.field_k[2];
                    var25.a(var9, -(var25.field_t >> 1) + var10, 256);
                    return;
                  }
                }
              }
            }
            var26 = gb.field_k[0];
            var11 = var26.field_q << 1;
            var12 = var26.field_r << 1;
            if (null != ((pk) this).field_W) {
              if (var11 <= ((pk) this).field_W.field_p) {
                if (var12 > ((pk) this).field_W.field_t) {
                  ((pk) this).field_W = new o(var11, var12);
                  cl.a(-94, ((pk) this).field_W);
                  var26.b(112, 144, var26.field_q << 4, var26.field_r << 4, -((pk) this).field_Z << 10, 4096);
                  mf.e(4096);
                  ((pk) this).field_W.a(-(var26.field_q >> 1) + var9, var10 + -var26.field_r, 256);
                  return;
                } else {
                  cl.a(-125, ((pk) this).field_W);
                  mi.a();
                  var26.b(112, 144, var26.field_q << 4, var26.field_r << 4, -((pk) this).field_Z << 10, 4096);
                  mf.e(4096);
                  ((pk) this).field_W.a(-(var26.field_q >> 1) + var9, var10 + -var26.field_r, 256);
                  return;
                }
              } else {
                ((pk) this).field_W = new o(var11, var12);
                cl.a(-94, ((pk) this).field_W);
                var26.b(112, 144, var26.field_q << 4, var26.field_r << 4, -((pk) this).field_Z << 10, 4096);
                mf.e(4096);
                ((pk) this).field_W.a(-(var26.field_q >> 1) + var9, var10 + -var26.field_r, 256);
                return;
              }
            } else {
              ((pk) this).field_W = new o(var11, var12);
              cl.a(-94, ((pk) this).field_W);
              var26.b(112, 144, var26.field_q << 4, var26.field_r << 4, -((pk) this).field_Z << 10, 4096);
              mf.e(4096);
              ((pk) this).field_W.a(-(var26.field_q >> 1) + var9, var10 + -var26.field_r, 256);
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
            var10 = var37.a((rc) this, false, param0) - -(var37.a(-21480, (rc) this).a((byte) 126) >> 1);
            if (var6 == hg.field_E) {
              break L8;
            } else {
              if (db.field_u == var6) {
                break L8;
              } else {
                if (rg.field_f != var6) {
                  if (var6 == ph.field_g) {
                    var19 = gb.field_k[1];
                    var19.a(var9, var10 - (var19.field_t >> 1), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var20 = gb.field_k[2];
                  var20.a(var9, -(var20.field_t >> 1) + var10, 256);
                  return;
                }
              }
            }
          }
          var21 = gb.field_k[0];
          var11 = var21.field_q << 1;
          var12 = var21.field_r << 1;
          if (null != ((pk) this).field_W) {
            if (var11 <= ((pk) this).field_W.field_p) {
              if (var12 <= ((pk) this).field_W.field_t) {
                cl.a(-125, ((pk) this).field_W);
                mi.a();
                var21.b(112, 144, var21.field_q << 4, var21.field_r << 4, -((pk) this).field_Z << 10, 4096);
                mf.e(4096);
                ((pk) this).field_W.a(-(var21.field_q >> 1) + var9, var10 + -var21.field_r, 256);
                return;
              } else {
                ((pk) this).field_W = new o(var11, var12);
                cl.a(-94, ((pk) this).field_W);
                var21.b(112, 144, var21.field_q << 4, var21.field_r << 4, -((pk) this).field_Z << 10, 4096);
                mf.e(4096);
                ((pk) this).field_W.a(-(var21.field_q >> 1) + var9, var10 + -var21.field_r, 256);
                return;
              }
            } else {
              ((pk) this).field_W = new o(var11, var12);
              cl.a(-94, ((pk) this).field_W);
              var21.b(112, 144, var21.field_q << 4, var21.field_r << 4, -((pk) this).field_Z << 10, 4096);
              mf.e(4096);
              ((pk) this).field_W.a(-(var21.field_q >> 1) + var9, var10 + -var21.field_r, 256);
              return;
            }
          } else {
            ((pk) this).field_W = new o(var11, var12);
            cl.a(-94, ((pk) this).field_W);
            var21.b(112, 144, var21.field_q << 4, var21.field_r << 4, -((pk) this).field_Z << 10, 4096);
            mf.e(4096);
            ((pk) this).field_W.a(-(var21.field_q >> 1) + var9, var10 + -var21.field_r, 256);
            return;
          }
        }
    }

    public static void j() {
        int var1 = 0;
        field_X = null;
        field_Y = null;
        field_T = null;
    }

    final static void a(byte param0, int param1, boolean param2) {
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) kj.field_P;
        synchronized (var3) {
          L0: {
            jg.a(c.field_M[param1], 86, param2);
            be.field_K = qc.field_o[param1];
            ed.a((byte) -122);
            break L0;
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
        RuntimeException var2_ref = null;
        int var3 = 0;
        rb[] var4 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 < (param1.field_b << 17) + lc.field_h) {
                lc.field_h = lc.field_h + (param1.field_b << 17);
                ic.field_t = ic.field_t + ud.field_k * param1.field_b;
                break L1;
              } else {
                if (param1.field_b >= lc.field_h >>> 17) {
                  break L1;
                } else {
                  lc.field_h = lc.field_h - (param1.field_b << 17);
                  ic.field_t = ic.field_t - ud.field_k * param1.field_b;
                  break L1;
                }
              }
            }
            L2: {
              if (kf.field_G == null) {
                kf.field_G = new rb[8];
                kf.field_G[0] = param1;
                break L2;
              } else {
                var2_int = 0;
                L3: while (true) {
                  if (kf.field_G.length <= var2_int) {
                    var4 = kf.field_G;
                    var2 = var4;
                    kf.field_G = new rb[kf.field_G.length << 1];
                    fk.a((Object[]) (Object) var2, 0, (Object[]) (Object) kf.field_G, 0, var4.length);
                    kf.field_G[var4.length] = param1;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2_ref;
            stackOut_15_1 = new StringBuilder().append("pk.P(").append(32).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, mg param3, int param4, int param5, int param6, int param7, int param8, o[] param9, int param10, byte param11, o[] param12, int param13, int param14, int param15, int param16, mg param17, int param18, int param19, o[] param20) {
        RuntimeException var21 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            int discarded$1 = 8;
            la.a(param8, 320, param5, 240, param3, new hi(param20), 2, 0, 8, param13, param14, -111, param17, 0, 480, param7, new hi(param12), param4, new hi(param9), param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var21;
            stackOut_2_1 = new StringBuilder().append("pk.B(").append(320).append(44).append(0).append(44).append(param2).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param4).append(44).append(param5).append(44).append(480).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param9 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(2).append(44).append(-111).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param12 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param13).append(44).append(param14).append(44).append(240).append(44).append(8).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param17 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(0).append(44).append(8).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param20 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final static void c() {
        qk.d(14995);
        if (null != dc.field_q) {
          L0: {
            nc.a((byte) 86, dc.field_q);
            int discarded$8 = -15;
            cb.a();
            int discarded$9 = -117;
            nh.a();
            int discarded$10 = 0;
            m.b();
            int discarded$11 = 60;
            if (ak.a()) {
              id.field_c.e(1, -2147483648);
              qf.a(0, 0);
              break L0;
            } else {
              break L0;
            }
          }
          je.a(false);
          return;
        } else {
          L1: {
            int discarded$12 = -15;
            cb.a();
            int discarded$13 = -117;
            nh.a();
            int discarded$14 = 0;
            m.b();
            int discarded$15 = 60;
            if (ak.a()) {
              id.field_c.e(1, -2147483648);
              qf.a(0, 0);
              break L1;
            } else {
              break L1;
            }
          }
          je.a(false);
          return;
        }
    }

    final void a(int param0, int param1, int param2, rc param3) {
        ((pk) this).field_Z = ((pk) this).field_Z + 1;
        if (param1 != 18874) {
            return;
        }
        try {
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "pk.JA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    pk(oe param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (j) (Object) hj.a());
        int discarded$0 = -65;
        try {
            ((pk) this).field_V = param1;
            ((pk) this).field_U = param0;
            ((pk) this).b(param5, param4, param2, 0, param3);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "pk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(byte param0, int param1) {
        vk.field_g = (param1 & 57) >> 4;
        lh.field_q = (15 & param1) >> 2;
        if (vk.field_g <= 2) {
          if (2 >= lh.field_q) {
            bi.field_d = 3 & param1;
            if (bi.field_d > 2) {
              bi.field_d = 2;
              return;
            } else {
              return;
            }
          } else {
            lh.field_q = 2;
            bi.field_d = 3 & param1;
            if (bi.field_d > 2) {
              bi.field_d = 2;
              return;
            } else {
              return;
            }
          }
        } else {
          vk.field_g = 2;
          if (2 < lh.field_q) {
            lh.field_q = 2;
            bi.field_d = 3 & param1;
            if (bi.field_d <= 2) {
              return;
            } else {
              bi.field_d = 2;
              return;
            }
          } else {
            bi.field_d = 3 & param1;
            if (bi.field_d > 2) {
              bi.field_d = 2;
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void d() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Combo Power: <%0>";
        field_X = "Confirm Password: ";
    }
}
