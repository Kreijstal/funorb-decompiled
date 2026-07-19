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
        int[] discarded$0 = null;
        wb.a(ia.g(-74), (byte) -83);
        if (param0 != 918092705) {
            discarded$0 = pk.a(41, false, 105);
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
              field_Y = (o) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("pk.MA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
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
          field_Y = (o) null;
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
        String var5 = null;
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
        o var31 = null;
        o var34 = null;
        Object var37 = null;
        Object var41 = null;
        Object var45 = null;
        o var46 = null;
        o var47 = null;
        o var48 = null;
        eg var49 = null;
        eg var50 = null;
        eg var51 = null;
        eg var52 = null;
        var18 = null;
        var23 = null;
        var28 = null;
        var37 = null;
        var41 = null;
        var45 = null;
        var13 = SolKnight.field_L ? 1 : 0;
        var6 = this.field_U.b(param3 ^ -9362);
        if (hg.field_E != var6) {
          if (db.field_u != var6) {
            var27 = this.field_U.c(-111);
            var5 = var27;
            if (var27 == null) {
              L0: {
                var5 = this.field_V;
                if (var13 == 0) {
                  break L0;
                } else {
                  var5 = g.field_e;
                  break L0;
                }
              }
              L1: {
                if (!var5.equals(this.field_i)) {
                  this.field_i = var5;
                  this.a((byte) -21);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_U.b(-9362);
                  var52 = (eg) ((Object) this.field_w);
                  var9 = param2 + this.field_m;
                  var10 = var52.a((rc) (this), false, param0) - -(var52.a(-21480, (rc) (this)).a((byte) 126) >> -1217005343);
                  if (var6 == hg.field_E) {
                    break L3;
                  } else {
                    if (db.field_u == var6) {
                      break L3;
                    } else {
                      L4: {
                        if (rg.field_f == var6) {
                          break L4;
                        } else {
                          if (var6 == ph.field_g) {
                            var46 = gb.field_k[1];
                            var46.a(var9, var10 - (var46.field_t >> 810763585), 256);
                            if (var13 != 0) {
                              break L4;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      var47 = gb.field_k[2];
                      var47.a(var9, -(var47.field_t >> 1088753025) + var10, 256);
                      if (var13 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L5: {
                  var48 = gb.field_k[0];
                  var11 = var48.field_q << 12669153;
                  var12 = var48.field_r << 918092705;
                  if (null == this.field_W) {
                    break L5;
                  } else {
                    if (var11 > this.field_W.field_p) {
                      break L5;
                    } else {
                      if (var12 > this.field_W.field_t) {
                        break L5;
                      } else {
                        cl.a(-125, this.field_W);
                        mi.a();
                        if (var13 == 0) {
                          var48.b(112, 144, var48.field_q << 375364356, var48.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                          mf.e(4096);
                          this.field_W.a(-(var48.field_q >> 436321985) + var9, var10 + -var48.field_r, 256);
                          break L2;
                        } else {
                          this.field_W = new o(var11, var12);
                          cl.a(-94, this.field_W);
                          var48.b(112, 144, var48.field_q << 375364356, var48.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                          mf.e(4096);
                          this.field_W.a(-(var48.field_q >> 436321985) + var9, var10 + -var48.field_r, 256);
                          return;
                        }
                      }
                    }
                  }
                }
                this.field_W = new o(var11, var12);
                cl.a(-94, this.field_W);
                var48.b(112, 144, var48.field_q << 375364356, var48.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                mf.e(4096);
                this.field_W.a(-(var48.field_q >> 436321985) + var9, var10 + -var48.field_r, 256);
                return;
              }
              return;
            } else {
              L6: {
                if (!var27.equals(this.field_i)) {
                  this.field_i = var27;
                  this.a((byte) -21);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                super.a(param0, param1, param2, param3);
                var6 = this.field_U.b(-9362);
                var51 = (eg) ((Object) this.field_w);
                var9 = param2 + this.field_m;
                var10 = var51.a((rc) (this), false, param0) - -(var51.a(-21480, (rc) (this)).a((byte) 126) >> -1217005343);
                if (var6 == hg.field_E) {
                  break L7;
                } else {
                  if (db.field_u == var6) {
                    break L7;
                  } else {
                    L8: {
                      if (rg.field_f == var6) {
                        break L8;
                      } else {
                        if (var6 == ph.field_g) {
                          var31 = gb.field_k[1];
                          var31.a(var9, var10 - (var31.field_t >> 810763585), 256);
                          if (var13 != 0) {
                            break L8;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    var34 = gb.field_k[2];
                    var34.a(var9, -(var34.field_t >> 1088753025) + var10, 256);
                    if (var13 != 0) {
                      break L7;
                    } else {
                      return;
                    }
                  }
                }
              }
              var16 = gb.field_k[0];
              var11 = var16.field_q << 12669153;
              var12 = var16.field_r << 918092705;
              if (null != this.field_W) {
                if (var11 <= this.field_W.field_p) {
                  if (var12 <= this.field_W.field_t) {
                    cl.a(-125, this.field_W);
                    mi.a();
                    if (var13 != 0) {
                      this.field_W = new o(var11, var12);
                      cl.a(-94, this.field_W);
                      var16.b(112, 144, var16.field_q << 375364356, var16.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                      mf.e(4096);
                      this.field_W.a(-(var16.field_q >> 436321985) + var9, var10 + -var16.field_r, 256);
                      return;
                    } else {
                      var16.b(112, 144, var16.field_q << 375364356, var16.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                      mf.e(4096);
                      this.field_W.a(-(var16.field_q >> 436321985) + var9, var10 + -var16.field_r, 256);
                      return;
                    }
                  } else {
                    this.field_W = new o(var11, var12);
                    cl.a(-94, this.field_W);
                    var16.b(112, 144, var16.field_q << 375364356, var16.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                    mf.e(4096);
                    this.field_W.a(-(var16.field_q >> 436321985) + var9, var10 + -var16.field_r, 256);
                    return;
                  }
                } else {
                  this.field_W = new o(var11, var12);
                  cl.a(-94, this.field_W);
                  var16.b(112, 144, var16.field_q << 375364356, var16.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                  mf.e(4096);
                  this.field_W.a(-(var16.field_q >> 436321985) + var9, var10 + -var16.field_r, 256);
                  return;
                }
              } else {
                this.field_W = new o(var11, var12);
                cl.a(-94, this.field_W);
                var16.b(112, 144, var16.field_q << 375364356, var16.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                mf.e(4096);
                this.field_W.a(-(var16.field_q >> 436321985) + var9, var10 + -var16.field_r, 256);
                return;
              }
            }
          } else {
            L9: {
              var22 = g.field_e;
              if (!var22.equals(this.field_i)) {
                this.field_i = var22;
                this.a((byte) -21);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              super.a(param0, param1, param2, param3);
              var6 = this.field_U.b(-9362);
              var50 = (eg) ((Object) this.field_w);
              var9 = param2 + this.field_m;
              var10 = var50.a((rc) (this), false, param0) - -(var50.a(-21480, (rc) (this)).a((byte) 126) >> -1217005343);
              if (var6 == hg.field_E) {
                break L10;
              } else {
                if (db.field_u == var6) {
                  break L10;
                } else {
                  L11: {
                    if (rg.field_f == var6) {
                      break L11;
                    } else {
                      if (var6 == ph.field_g) {
                        var24 = gb.field_k[1];
                        var24.a(var9, var10 - (var24.field_t >> 810763585), 256);
                        if (var13 != 0) {
                          break L11;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  var25 = gb.field_k[2];
                  var25.a(var9, -(var25.field_t >> 1088753025) + var10, 256);
                  if (var13 != 0) {
                    break L10;
                  } else {
                    return;
                  }
                }
              }
            }
            var26 = gb.field_k[0];
            var11 = var26.field_q << 12669153;
            var12 = var26.field_r << 918092705;
            if (null != this.field_W) {
              if (var11 <= this.field_W.field_p) {
                if (var12 <= this.field_W.field_t) {
                  cl.a(-125, this.field_W);
                  mi.a();
                  if (var13 == 0) {
                    var26.b(112, 144, var26.field_q << 375364356, var26.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                    mf.e(4096);
                    this.field_W.a(-(var26.field_q >> 436321985) + var9, var10 + -var26.field_r, 256);
                    return;
                  } else {
                    this.field_W = new o(var11, var12);
                    cl.a(-94, this.field_W);
                    var26.b(112, 144, var26.field_q << 375364356, var26.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                    mf.e(4096);
                    this.field_W.a(-(var26.field_q >> 436321985) + var9, var10 + -var26.field_r, 256);
                    return;
                  }
                } else {
                  this.field_W = new o(var11, var12);
                  cl.a(-94, this.field_W);
                  var26.b(112, 144, var26.field_q << 375364356, var26.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                  mf.e(4096);
                  this.field_W.a(-(var26.field_q >> 436321985) + var9, var10 + -var26.field_r, 256);
                  return;
                }
              } else {
                this.field_W = new o(var11, var12);
                cl.a(-94, this.field_W);
                var26.b(112, 144, var26.field_q << 375364356, var26.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                mf.e(4096);
                this.field_W.a(-(var26.field_q >> 436321985) + var9, var10 + -var26.field_r, 256);
                return;
              }
            } else {
              this.field_W = new o(var11, var12);
              cl.a(-94, this.field_W);
              var26.b(112, 144, var26.field_q << 375364356, var26.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
              mf.e(4096);
              this.field_W.a(-(var26.field_q >> 436321985) + var9, var10 + -var26.field_r, 256);
              return;
            }
          }
        } else {
          L12: {
            var17 = g.field_e;
            if (!var17.equals(this.field_i)) {
              this.field_i = var17;
              this.a((byte) -21);
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            super.a(param0, param1, param2, param3);
            var6 = this.field_U.b(-9362);
            var49 = (eg) ((Object) this.field_w);
            var9 = param2 + this.field_m;
            var10 = var49.a((rc) (this), false, param0) - -(var49.a(-21480, (rc) (this)).a((byte) 126) >> -1217005343);
            if (var6 == hg.field_E) {
              break L13;
            } else {
              if (db.field_u == var6) {
                break L13;
              } else {
                L14: {
                  if (rg.field_f == var6) {
                    break L14;
                  } else {
                    if (var6 == ph.field_g) {
                      var19 = gb.field_k[1];
                      var19.a(var9, var10 - (var19.field_t >> 810763585), 256);
                      if (var13 != 0) {
                        break L14;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                var20 = gb.field_k[2];
                var20.a(var9, -(var20.field_t >> 1088753025) + var10, 256);
                if (var13 != 0) {
                  break L13;
                } else {
                  return;
                }
              }
            }
          }
          var21 = gb.field_k[0];
          var11 = var21.field_q << 12669153;
          var12 = var21.field_r << 918092705;
          if (null != this.field_W) {
            if (var11 <= this.field_W.field_p) {
              if (var12 <= this.field_W.field_t) {
                cl.a(-125, this.field_W);
                mi.a();
                if (var13 != 0) {
                  this.field_W = new o(var11, var12);
                  cl.a(-94, this.field_W);
                  var21.b(112, 144, var21.field_q << 375364356, var21.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                  mf.e(4096);
                  this.field_W.a(-(var21.field_q >> 436321985) + var9, var10 + -var21.field_r, 256);
                  return;
                } else {
                  var21.b(112, 144, var21.field_q << 375364356, var21.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                  mf.e(4096);
                  this.field_W.a(-(var21.field_q >> 436321985) + var9, var10 + -var21.field_r, 256);
                  return;
                }
              } else {
                this.field_W = new o(var11, var12);
                cl.a(-94, this.field_W);
                var21.b(112, 144, var21.field_q << 375364356, var21.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
                mf.e(4096);
                this.field_W.a(-(var21.field_q >> 436321985) + var9, var10 + -var21.field_r, 256);
                return;
              }
            } else {
              this.field_W = new o(var11, var12);
              cl.a(-94, this.field_W);
              var21.b(112, 144, var21.field_q << 375364356, var21.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
              mf.e(4096);
              this.field_W.a(-(var21.field_q >> 436321985) + var9, var10 + -var21.field_r, 256);
              return;
            }
          } else {
            this.field_W = new o(var11, var12);
            cl.a(-94, this.field_W);
            var21.b(112, 144, var21.field_q << 375364356, var21.field_r << 1544874180, -this.field_Z << 1773101066, 4096);
            mf.e(4096);
            this.field_W.a(-(var21.field_q >> 436321985) + var9, var10 + -var21.field_r, 256);
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
        int[] discarded$2 = null;
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var3 = kj.field_P;
        synchronized (var3) {
          L0: {
            jg.a(c.field_M[param1], param0 + 182, param2);
            be.field_K = qc.field_o[param1];
            ed.a((byte) -122);
            break L0;
          }
        }
        if (param0 != -96) {
          discarded$2 = pk.a(-56, true, 93);
          return;
        } else {
          return;
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
        RuntimeException var2 = null;
        int var2_int = 0;
        rb[] var2_array = null;
        int var3 = 0;
        rb[] var4 = null;
        rb[] stackIn_10_0 = null;
        rb[] stackIn_15_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rb[] stackOut_9_0 = null;
        rb[] stackOut_14_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 < (param1.field_b << 1926878225) + lc.field_h) {
                  break L2;
                } else {
                  if (param1.field_b >= lc.field_h >>> -2040804367) {
                    break L1;
                  } else {
                    lc.field_h = lc.field_h - (param1.field_b << -1716215215);
                    ic.field_t = ic.field_t - ud.field_k * param1.field_b;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              lc.field_h = lc.field_h + (param1.field_b << 234713681);
              ic.field_t = ic.field_t + ud.field_k * param1.field_b;
              break L1;
            }
            L3: {
              L4: {
                if (kf.field_G == null) {
                  break L4;
                } else {
                  var2_int = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (kf.field_G.length <= var2_int) {
                          break L7;
                        } else {
                          stackOut_9_0 = kf.field_G;
                          stackIn_15_0 = stackOut_9_0;
                          stackIn_10_0 = stackOut_9_0;
                          if (var3 != 0) {
                            break L6;
                          } else {
                            if (stackIn_10_0[var2_int] != null) {
                              var2_int++;
                              if (var3 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            } else {
                              kf.field_G[var2_int] = param1;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                      }
                      stackOut_14_0 = kf.field_G;
                      stackIn_15_0 = stackOut_14_0;
                      break L6;
                    }
                    var4 = stackIn_15_0;
                    var2_array = var4;
                    kf.field_G = new rb[kf.field_G.length << 931773153];
                    fk.a(var2_array, 0, kf.field_G, 0, var4.length);
                    kf.field_G[var4.length] = param1;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              kf.field_G = new rb[8];
              kf.field_G[0] = param1;
              break L3;
            }
            L8: {
              if (param0 == 32) {
                break L8;
              } else {
                pk.a((byte) 49, 75);
                break L8;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2);
            stackOut_20_1 = new StringBuilder().append("pk.P(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, mg param3, int param4, int param5, int param6, int param7, int param8, o[] param9, int param10, byte param11, o[] param12, int param13, int param14, int param15, int param16, mg param17, int param18, int param19, o[] param20) {
        RuntimeException var21 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              la.a(param8, param0, param5, param15, param3, new hi(param20), param10, param18, param16, param13, param14, -111, param17, param1, param6, param7, new hi(param12), param4, new hi(param9), param2, param19);
              if (param11 < -59) {
                break L1;
              } else {
                pk.i(112);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var21);
            stackOut_3_1 = new StringBuilder().append("pk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param9 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param12 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param17 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param18).append(',').append(param19).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param20 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
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
        this.field_Z = this.field_Z + 1;
        if (param1 != 18874) {
            return;
        }
        try {
            super.a(param0, param1 + 0, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "pk.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    pk(oe param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, hj.a((byte) -65));
        try {
            this.field_V = param1;
            this.field_U = param0;
            this.b(param5, param4, param2, 0, param3);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "pk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
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
        field_T = "Combo Power: <%0>";
        field_X = "Confirm Password: ";
    }
}
