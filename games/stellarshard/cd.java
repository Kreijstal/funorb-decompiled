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
        super(param1, vf.a(0));
        try {
            this.field_R = param0;
            this.field_Q = param1;
            this.b(param4, param2, param3, param5, 23987);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean e(byte param0) {
        boolean discarded$4 = false;
        if ((ue.field_b ^ -1) == 0) {
            if (!qe.b(64, 1)) {
                return false;
            }
            ue.field_b = ae.field_N.f(4);
            ae.field_N.field_k = 0;
        }
        if (param0 <= 111) {
            discarded$4 = cd.e((byte) -125);
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
        try {
            this.field_N = this.field_N + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "cd.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
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
              var5_int = -4 / ((param0 - -7) / 61);
              if (!param4) {
                pg.field_fb.a(false, 16);
                break L1;
              } else {
                pg.field_fb.a(false, 18);
                break L1;
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
            ha.a(fj.field_l, pg.field_fb, uc.field_c, -104, u.field_o);
            pg.field_fb.d(-1, pg.field_fb.field_k - var6);
            ue.a((byte) -88, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var5);
            stackOut_19_1 = new StringBuilder().append("cd.C(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ',' + param4 + ')');
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
        String var17 = null;
        Object var18 = null;
        pb var19 = null;
        pb var20 = null;
        pb var21 = null;
        String var22 = null;
        Object var23 = null;
        pb var24 = null;
        pb var25 = null;
        pb var26 = null;
        String var27 = null;
        Object var28 = null;
        pb var29 = null;
        pb var30 = null;
        pb var31 = null;
        Object var32 = null;
        pb var33 = null;
        pb var34 = null;
        pb var35 = null;
        Object var36 = null;
        pb var37 = null;
        pb var38 = null;
        pb var39 = null;
        pb var40 = null;
        pj var41 = null;
        pj var42 = null;
        pj var43 = null;
        pj var44 = null;
        pj var45 = null;
        var18 = null;
        var23 = null;
        var28 = null;
        var32 = null;
        var36 = null;
        var13 = stellarshard.field_B;
        var6 = this.field_R.b(-28036);
        if (var6 != eh.field_c) {
          if (var6 != vk.field_d) {
            var5 = this.field_R.c(-22773);
            if (var5 != null) {
              if (var5.equals(this.field_m)) {
                super.a(param0, param1, param2, param3);
                var6 = this.field_R.b(param1 ^ 28091);
                var45 = (pj) ((Object) this.field_u);
                var9 = this.field_w + param3;
                var10 = var45.a((byte) 117, (rj) (this), param2) + (var45.b((rj) (this), (byte) 111).a(17201) >> -619433951);
                if (eh.field_c == var6) {
                  var38 = ah.field_p[0];
                  var11 = var38.field_w << -1064120735;
                  var12 = var38.field_x << 255883905;
                  if (null != this.field_O) {
                    if (this.field_O.field_v >= var11) {
                      if (var12 <= this.field_O.field_y) {
                        hj.a(this.field_O, param1 ^ -58);
                        ti.d();
                        var38.b(112, 144, var38.field_w << 2088456804, var38.field_x << -536623196, -this.field_N << -1572549942, 4096);
                        id.b((byte) -58);
                        this.field_O.d(var9 - (var38.field_w >> -1301027519), -var38.field_x + var10, 256);
                        return;
                      } else {
                        this.field_O = new pb(var11, var12);
                        hj.a(this.field_O, param1 ^ -58);
                        var38.b(112, 144, var38.field_w << 2088456804, var38.field_x << -536623196, -this.field_N << -1572549942, 4096);
                        id.b((byte) -58);
                        this.field_O.d(var9 - (var38.field_w >> -1301027519), -var38.field_x + var10, 256);
                        return;
                      }
                    } else {
                      this.field_O = new pb(var11, var12);
                      hj.a(this.field_O, param1 ^ -58);
                      var38.b(112, 144, var38.field_w << 2088456804, var38.field_x << -536623196, -this.field_N << -1572549942, 4096);
                      id.b((byte) -58);
                      this.field_O.d(var9 - (var38.field_w >> -1301027519), -var38.field_x + var10, 256);
                      return;
                    }
                  } else {
                    this.field_O = new pb(var11, var12);
                    hj.a(this.field_O, param1 ^ -58);
                    var38.b(112, 144, var38.field_w << 2088456804, var38.field_x << -536623196, -this.field_N << -1572549942, 4096);
                    id.b((byte) -58);
                    this.field_O.d(var9 - (var38.field_w >> -1301027519), -var38.field_x + var10, 256);
                    return;
                  }
                } else {
                  if (var6 != vk.field_d) {
                    if (var6 == qj.field_c) {
                      var40 = ah.field_p[2];
                      var40.d(var9, -(var40.field_y >> 598369249) + var10, 256);
                      return;
                    } else {
                      if (var6 == lg.field_c) {
                        var39 = ah.field_p[1];
                        var39.d(var9, var10 + -(var39.field_y >> 589316769), 256);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    L0: {
                      var37 = ah.field_p[0];
                      var11 = var37.field_w << -1064120735;
                      var12 = var37.field_x << 255883905;
                      if (null == this.field_O) {
                        break L0;
                      } else {
                        if (this.field_O.field_v < var11) {
                          break L0;
                        } else {
                          if (var12 <= this.field_O.field_y) {
                            hj.a(this.field_O, param1 ^ -58);
                            ti.d();
                            var37.b(112, 144, var37.field_w << 2088456804, var37.field_x << -536623196, -this.field_N << -1572549942, 4096);
                            id.b((byte) -58);
                            this.field_O.d(var9 - (var37.field_w >> -1301027519), -var37.field_x + var10, 256);
                            return;
                          } else {
                            this.field_O = new pb(var11, var12);
                            hj.a(this.field_O, param1 ^ -58);
                            var37.b(112, 144, var37.field_w << 2088456804, var37.field_x << -536623196, -this.field_N << -1572549942, 4096);
                            id.b((byte) -58);
                            this.field_O.d(var9 - (var37.field_w >> -1301027519), -var37.field_x + var10, 256);
                            return;
                          }
                        }
                      }
                    }
                    this.field_O = new pb(var11, var12);
                    hj.a(this.field_O, param1 ^ -58);
                    var37.b(112, 144, var37.field_w << 2088456804, var37.field_x << -536623196, -this.field_N << -1572549942, 4096);
                    id.b((byte) -58);
                    this.field_O.d(var9 - (var37.field_w >> -1301027519), -var37.field_x + var10, 256);
                    return;
                  }
                }
              } else {
                L1: {
                  this.field_m = var5;
                  this.a((byte) -92);
                  super.a(param0, param1, param2, param3);
                  var6 = this.field_R.b(param1 ^ 28091);
                  var44 = (pj) ((Object) this.field_u);
                  var9 = this.field_w + param3;
                  var10 = var44.a((byte) 117, (rj) (this), param2) + (var44.b((rj) (this), (byte) 111).a(17201) >> -619433951);
                  if (eh.field_c == var6) {
                    break L1;
                  } else {
                    if (var6 != vk.field_d) {
                      if (var6 == qj.field_c) {
                        var35 = ah.field_p[2];
                        var35.d(var9, -(var35.field_y >> 598369249) + var10, 256);
                        return;
                      } else {
                        if (var6 == lg.field_c) {
                          var34 = ah.field_p[1];
                          var34.d(var9, var10 + -(var34.field_y >> 589316769), 256);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var33 = ah.field_p[0];
                var11 = var33.field_w << -1064120735;
                var12 = var33.field_x << 255883905;
                if (null != this.field_O) {
                  if (this.field_O.field_v < var11) {
                    this.field_O = new pb(var11, var12);
                    hj.a(this.field_O, param1 ^ -58);
                    var33.b(112, 144, var33.field_w << 2088456804, var33.field_x << -536623196, -this.field_N << -1572549942, 4096);
                    id.b((byte) -58);
                    this.field_O.d(var9 - (var33.field_w >> -1301027519), -var33.field_x + var10, 256);
                    return;
                  } else {
                    if (var12 <= this.field_O.field_y) {
                      hj.a(this.field_O, param1 ^ -58);
                      ti.d();
                      var33.b(112, 144, var33.field_w << 2088456804, var33.field_x << -536623196, -this.field_N << -1572549942, 4096);
                      id.b((byte) -58);
                      this.field_O.d(var9 - (var33.field_w >> -1301027519), -var33.field_x + var10, 256);
                      return;
                    } else {
                      this.field_O = new pb(var11, var12);
                      hj.a(this.field_O, param1 ^ -58);
                      var33.b(112, 144, var33.field_w << 2088456804, var33.field_x << -536623196, -this.field_N << -1572549942, 4096);
                      id.b((byte) -58);
                      this.field_O.d(var9 - (var33.field_w >> -1301027519), -var33.field_x + var10, 256);
                      return;
                    }
                  }
                } else {
                  this.field_O = new pb(var11, var12);
                  hj.a(this.field_O, param1 ^ -58);
                  var33.b(112, 144, var33.field_w << 2088456804, var33.field_x << -536623196, -this.field_N << -1572549942, 4096);
                  id.b((byte) -58);
                  this.field_O.d(var9 - (var33.field_w >> -1301027519), -var33.field_x + var10, 256);
                  return;
                }
              }
            } else {
              L2: {
                var27 = this.field_Q;
                var5 = var27;
                if (var27.equals(this.field_m)) {
                  break L2;
                } else {
                  this.field_m = var27;
                  this.a((byte) -92);
                  break L2;
                }
              }
              L3: {
                super.a(param0, param1, param2, param3);
                var6 = this.field_R.b(param1 ^ 28091);
                var43 = (pj) ((Object) this.field_u);
                var9 = this.field_w + param3;
                var10 = var43.a((byte) 117, (rj) (this), param2) + (var43.b((rj) (this), (byte) 111).a(17201) >> -619433951);
                if (eh.field_c == var6) {
                  break L3;
                } else {
                  if (var6 != vk.field_d) {
                    if (var6 != qj.field_c) {
                      if (var6 != lg.field_c) {
                        return;
                      } else {
                        var30 = ah.field_p[1];
                        var30.d(var9, var10 + -(var30.field_y >> 589316769), 256);
                        return;
                      }
                    } else {
                      var31 = ah.field_p[2];
                      var31.d(var9, -(var31.field_y >> 598369249) + var10, 256);
                      return;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var29 = ah.field_p[0];
              var11 = var29.field_w << -1064120735;
              var12 = var29.field_x << 255883905;
              if (null != this.field_O) {
                if (this.field_O.field_v >= var11) {
                  if (var12 <= this.field_O.field_y) {
                    hj.a(this.field_O, param1 ^ -58);
                    ti.d();
                    var29.b(112, 144, var29.field_w << 2088456804, var29.field_x << -536623196, -this.field_N << -1572549942, 4096);
                    id.b((byte) -58);
                    this.field_O.d(var9 - (var29.field_w >> -1301027519), -var29.field_x + var10, 256);
                    return;
                  } else {
                    this.field_O = new pb(var11, var12);
                    hj.a(this.field_O, param1 ^ -58);
                    var29.b(112, 144, var29.field_w << 2088456804, var29.field_x << -536623196, -this.field_N << -1572549942, 4096);
                    id.b((byte) -58);
                    this.field_O.d(var9 - (var29.field_w >> -1301027519), -var29.field_x + var10, 256);
                    return;
                  }
                } else {
                  this.field_O = new pb(var11, var12);
                  hj.a(this.field_O, param1 ^ -58);
                  var29.b(112, 144, var29.field_w << 2088456804, var29.field_x << -536623196, -this.field_N << -1572549942, 4096);
                  id.b((byte) -58);
                  this.field_O.d(var9 - (var29.field_w >> -1301027519), -var29.field_x + var10, 256);
                  return;
                }
              } else {
                this.field_O = new pb(var11, var12);
                hj.a(this.field_O, param1 ^ -58);
                var29.b(112, 144, var29.field_w << 2088456804, var29.field_x << -536623196, -this.field_N << -1572549942, 4096);
                id.b((byte) -58);
                this.field_O.d(var9 - (var29.field_w >> -1301027519), -var29.field_x + var10, 256);
                return;
              }
            }
          } else {
            L4: {
              var22 = ui.field_D;
              if (var22.equals(this.field_m)) {
                break L4;
              } else {
                this.field_m = var22;
                this.a((byte) -92);
                break L4;
              }
            }
            L5: {
              super.a(param0, param1, param2, param3);
              var6 = this.field_R.b(param1 ^ 28091);
              var42 = (pj) ((Object) this.field_u);
              var9 = this.field_w + param3;
              var10 = var42.a((byte) 117, (rj) (this), param2) + (var42.b((rj) (this), (byte) 111).a(17201) >> -619433951);
              if (eh.field_c == var6) {
                break L5;
              } else {
                if (var6 != vk.field_d) {
                  if (var6 != qj.field_c) {
                    if (var6 == lg.field_c) {
                      var25 = ah.field_p[1];
                      var25.d(var9, var10 + -(var25.field_y >> 589316769), 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var26 = ah.field_p[2];
                    var26.d(var9, -(var26.field_y >> 598369249) + var10, 256);
                    return;
                  }
                } else {
                  break L5;
                }
              }
            }
            var24 = ah.field_p[0];
            var11 = var24.field_w << -1064120735;
            var12 = var24.field_x << 255883905;
            if (null != this.field_O) {
              if (this.field_O.field_v >= var11) {
                if (var12 > this.field_O.field_y) {
                  this.field_O = new pb(var11, var12);
                  hj.a(this.field_O, param1 ^ -58);
                  var24.b(112, 144, var24.field_w << 2088456804, var24.field_x << -536623196, -this.field_N << -1572549942, 4096);
                  id.b((byte) -58);
                  this.field_O.d(var9 - (var24.field_w >> -1301027519), -var24.field_x + var10, 256);
                  return;
                } else {
                  hj.a(this.field_O, param1 ^ -58);
                  ti.d();
                  var24.b(112, 144, var24.field_w << 2088456804, var24.field_x << -536623196, -this.field_N << -1572549942, 4096);
                  id.b((byte) -58);
                  this.field_O.d(var9 - (var24.field_w >> -1301027519), -var24.field_x + var10, 256);
                  return;
                }
              } else {
                this.field_O = new pb(var11, var12);
                hj.a(this.field_O, param1 ^ -58);
                var24.b(112, 144, var24.field_w << 2088456804, var24.field_x << -536623196, -this.field_N << -1572549942, 4096);
                id.b((byte) -58);
                this.field_O.d(var9 - (var24.field_w >> -1301027519), -var24.field_x + var10, 256);
                return;
              }
            } else {
              this.field_O = new pb(var11, var12);
              hj.a(this.field_O, param1 ^ -58);
              var24.b(112, 144, var24.field_w << 2088456804, var24.field_x << -536623196, -this.field_N << -1572549942, 4096);
              id.b((byte) -58);
              this.field_O.d(var9 - (var24.field_w >> -1301027519), -var24.field_x + var10, 256);
              return;
            }
          }
        } else {
          L6: {
            var17 = ui.field_D;
            if (var17.equals(this.field_m)) {
              break L6;
            } else {
              this.field_m = var17;
              this.a((byte) -92);
              break L6;
            }
          }
          L7: {
            super.a(param0, param1, param2, param3);
            var6 = this.field_R.b(param1 ^ 28091);
            var41 = (pj) ((Object) this.field_u);
            var9 = this.field_w + param3;
            var10 = var41.a((byte) 117, (rj) (this), param2) + (var41.b((rj) (this), (byte) 111).a(17201) >> -619433951);
            if (eh.field_c == var6) {
              break L7;
            } else {
              if (var6 != vk.field_d) {
                if (var6 != qj.field_c) {
                  if (var6 != lg.field_c) {
                    return;
                  } else {
                    var20 = ah.field_p[1];
                    var20.d(var9, var10 + -(var20.field_y >> 589316769), 256);
                    return;
                  }
                } else {
                  var21 = ah.field_p[2];
                  var21.d(var9, -(var21.field_y >> 598369249) + var10, 256);
                  return;
                }
              } else {
                break L7;
              }
            }
          }
          var19 = ah.field_p[0];
          var11 = var19.field_w << -1064120735;
          var12 = var19.field_x << 255883905;
          if (null != this.field_O) {
            if (this.field_O.field_v >= var11) {
              if (var12 > this.field_O.field_y) {
                this.field_O = new pb(var11, var12);
                hj.a(this.field_O, param1 ^ -58);
                var19.b(112, 144, var19.field_w << 2088456804, var19.field_x << -536623196, -this.field_N << -1572549942, 4096);
                id.b((byte) -58);
                this.field_O.d(var9 - (var19.field_w >> -1301027519), -var19.field_x + var10, 256);
                return;
              } else {
                hj.a(this.field_O, param1 ^ -58);
                ti.d();
                var19.b(112, 144, var19.field_w << 2088456804, var19.field_x << -536623196, -this.field_N << -1572549942, 4096);
                id.b((byte) -58);
                this.field_O.d(var9 - (var19.field_w >> -1301027519), -var19.field_x + var10, 256);
                return;
              }
            } else {
              this.field_O = new pb(var11, var12);
              hj.a(this.field_O, param1 ^ -58);
              var19.b(112, 144, var19.field_w << 2088456804, var19.field_x << -536623196, -this.field_N << -1572549942, 4096);
              id.b((byte) -58);
              this.field_O.d(var9 - (var19.field_w >> -1301027519), -var19.field_x + var10, 256);
              return;
            }
          } else {
            this.field_O = new pb(var11, var12);
            hj.a(this.field_O, param1 ^ -58);
            var19.b(112, 144, var19.field_w << 2088456804, var19.field_x << -536623196, -this.field_N << -1572549942, 4096);
            id.b((byte) -58);
            this.field_O.d(var9 - (var19.field_w >> -1301027519), -var19.field_x + var10, 256);
            return;
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
                    field_L = (qd) null;
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
              this.field_Q = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("cd.J(").append(param0).append(',');
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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    static {
        field_P = "Collect me";
    }
}
