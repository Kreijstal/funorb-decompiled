/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends hm {
    static boolean[] field_P;
    private String field_Q;
    private vn field_O;
    private vc field_R;
    private int field_T;

    final boolean a(byte param0, ga param1) {
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
            if (param0 > 67) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_T = 52;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("wf.B(").append(param0).append(',');
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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void h(int param0) {
        field_P = null;
        if (param0 < 62) {
            wf.h(-102);
        }
    }

    wf(vc param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, tp.c(113));
        try {
            this.field_Q = param1;
            this.field_R = param0;
            this.a(-119, param3, param2, param4, param5);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "wf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        try {
            int var5_int = 101 / ((46 - param1) / 42);
            this.field_T = this.field_T + 1;
            super.a(param0, (byte) -91, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "wf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        rh var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vn var16 = null;
        String var17 = null;
        Object var18 = null;
        vn var19 = null;
        vn var20 = null;
        vn var21 = null;
        String var22 = null;
        Object var23 = null;
        vn var24 = null;
        vn var25 = null;
        vn var26 = null;
        String var27 = null;
        Object var28 = null;
        vn var29 = null;
        vn var30 = null;
        vn var33 = null;
        vn var34 = null;
        Object var35 = null;
        vn var36 = null;
        vn var37 = null;
        vn var38 = null;
        ak var39 = null;
        ak var40 = null;
        ak var41 = null;
        ak var42 = null;
        var18 = null;
        var23 = null;
        var28 = null;
        var35 = null;
        var13 = ZombieDawn.field_J;
        var6 = this.field_R.a((byte) -73);
        if (var6 != se.field_l) {
          if (var6 != gj.field_v) {
            var5 = this.field_R.b((byte) 78);
            if (var5 != null) {
              L0: {
                if (!var5.equals(this.field_o)) {
                  this.field_o = var5;
                  this.d((byte) -36);
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                super.a(param0, param1, param2, param3);
                var6 = this.field_R.a((byte) -120);
                var42 = (ak) ((Object) this.field_h);
                var9 = this.field_k + param2;
                var10 = var42.a((ga) (this), param3 + 1, param0) + (var42.a(112, (ga) (this)).a((byte) 102) >> 600768609);
                if (var6 == se.field_l) {
                  break L1;
                } else {
                  if (gj.field_v == var6) {
                    break L1;
                  } else {
                    if (var6 == uc.field_b) {
                      var37 = dj.field_k[2];
                      var37.b(var9, -(var37.field_t >> 808486785) + var10, 256);
                      return;
                    } else {
                      if (mc.field_g == var6) {
                        var36 = dj.field_k[1];
                        var36.b(var9, -(var36.field_t >> 1758093441) + var10, 256);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L2: {
                var38 = dj.field_k[0];
                var11 = var38.field_r << -1320692991;
                var12 = var38.field_q << 1842606081;
                if (this.field_O == null) {
                  break L2;
                } else {
                  if (var11 > this.field_O.field_w) {
                    break L2;
                  } else {
                    if (var12 <= this.field_O.field_t) {
                      ki.a((byte) -103, this.field_O);
                      bi.d();
                      var38.a(112, 144, var38.field_r << 1763612836, var38.field_q << 395885220, -this.field_T << 1505528266, 4096);
                      pa.a(-21189);
                      this.field_O.b(-(var38.field_r >> -1586282143) + var9, var10 - var38.field_q, 256);
                      return;
                    } else {
                      this.field_O = new vn(var11, var12);
                      ki.a((byte) -118, this.field_O);
                      var38.a(112, 144, var38.field_r << 1763612836, var38.field_q << 395885220, -this.field_T << 1505528266, 4096);
                      pa.a(-21189);
                      this.field_O.b(-(var38.field_r >> -1586282143) + var9, var10 - var38.field_q, 256);
                      return;
                    }
                  }
                }
              }
              this.field_O = new vn(var11, var12);
              ki.a((byte) -118, this.field_O);
              var38.a(112, 144, var38.field_r << 1763612836, var38.field_q << 395885220, -this.field_T << 1505528266, 4096);
              pa.a(-21189);
              this.field_O.b(-(var38.field_r >> -1586282143) + var9, var10 - var38.field_q, 256);
              return;
            } else {
              L3: {
                var27 = this.field_Q;
                var5 = var27;
                if (!var27.equals(this.field_o)) {
                  this.field_o = var27;
                  this.d((byte) -36);
                  break L3;
                } else {
                  break L3;
                }
              }
              super.a(param0, param1, param2, param3);
              var6 = this.field_R.a((byte) -120);
              var41 = (ak) ((Object) this.field_h);
              var9 = this.field_k + param2;
              var10 = var41.a((ga) (this), param3 + 1, param0) + (var41.a(112, (ga) (this)).a((byte) 102) >> 600768609);
              if (var6 != se.field_l) {
                if (gj.field_v != var6) {
                  if (var6 == uc.field_b) {
                    var34 = dj.field_k[2];
                    var34.b(var9, -(var34.field_t >> 808486785) + var10, 256);
                    return;
                  } else {
                    if (mc.field_g == var6) {
                      var33 = dj.field_k[1];
                      var33.b(var9, -(var33.field_t >> 1758093441) + var10, 256);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  var30 = dj.field_k[0];
                  var16 = var30;
                  var11 = var30.field_r << -1320692991;
                  var12 = var30.field_q << 1842606081;
                  if (this.field_O != null) {
                    if (var11 <= this.field_O.field_w) {
                      if (var12 > this.field_O.field_t) {
                        this.field_O = new vn(var11, var12);
                        ki.a((byte) -118, this.field_O);
                        var30.a(112, 144, var30.field_r << 1763612836, var30.field_q << 395885220, -this.field_T << 1505528266, 4096);
                        pa.a(-21189);
                        this.field_O.b(-(var30.field_r >> -1586282143) + var9, var10 - var30.field_q, 256);
                        return;
                      } else {
                        ki.a((byte) -103, this.field_O);
                        bi.d();
                        var30.a(112, 144, var30.field_r << 1763612836, var30.field_q << 395885220, -this.field_T << 1505528266, 4096);
                        pa.a(-21189);
                        this.field_O.b(-(var30.field_r >> -1586282143) + var9, var10 - var30.field_q, 256);
                        return;
                      }
                    } else {
                      this.field_O = new vn(var11, var12);
                      ki.a((byte) -118, this.field_O);
                      var30.a(112, 144, var30.field_r << 1763612836, var30.field_q << 395885220, -this.field_T << 1505528266, 4096);
                      pa.a(-21189);
                      this.field_O.b(-(var30.field_r >> -1586282143) + var9, var10 - var30.field_q, 256);
                      return;
                    }
                  } else {
                    this.field_O = new vn(var11, var12);
                    ki.a((byte) -118, this.field_O);
                    var30.a(112, 144, var30.field_r << 1763612836, var30.field_q << 395885220, -this.field_T << 1505528266, 4096);
                    pa.a(-21189);
                    this.field_O.b(-(var30.field_r >> -1586282143) + var9, var10 - var30.field_q, 256);
                    return;
                  }
                }
              } else {
                var29 = dj.field_k[0];
                var16 = var29;
                var11 = var29.field_r << -1320692991;
                var12 = var29.field_q << 1842606081;
                if (this.field_O != null) {
                  if (var11 <= this.field_O.field_w) {
                    if (var12 <= this.field_O.field_t) {
                      ki.a((byte) -103, this.field_O);
                      bi.d();
                      var29.a(112, 144, var29.field_r << 1763612836, var29.field_q << 395885220, -this.field_T << 1505528266, 4096);
                      pa.a(-21189);
                      this.field_O.b(-(var29.field_r >> -1586282143) + var9, var10 - var29.field_q, 256);
                      return;
                    } else {
                      this.field_O = new vn(var11, var12);
                      ki.a((byte) -118, this.field_O);
                      var29.a(112, 144, var29.field_r << 1763612836, var29.field_q << 395885220, -this.field_T << 1505528266, 4096);
                      pa.a(-21189);
                      this.field_O.b(-(var29.field_r >> -1586282143) + var9, var10 - var29.field_q, 256);
                      return;
                    }
                  } else {
                    this.field_O = new vn(var11, var12);
                    ki.a((byte) -118, this.field_O);
                    var29.a(112, 144, var29.field_r << 1763612836, var29.field_q << 395885220, -this.field_T << 1505528266, 4096);
                    pa.a(-21189);
                    this.field_O.b(-(var29.field_r >> -1586282143) + var9, var10 - var29.field_q, 256);
                    return;
                  }
                } else {
                  this.field_O = new vn(var11, var12);
                  ki.a((byte) -118, this.field_O);
                  var29.a(112, 144, var29.field_r << 1763612836, var29.field_q << 395885220, -this.field_T << 1505528266, 4096);
                  pa.a(-21189);
                  this.field_O.b(-(var29.field_r >> -1586282143) + var9, var10 - var29.field_q, 256);
                  return;
                }
              }
            }
          } else {
            L4: {
              var22 = no.field_E;
              if (!var22.equals(this.field_o)) {
                this.field_o = var22;
                this.d((byte) -36);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              super.a(param0, param1, param2, param3);
              var6 = this.field_R.a((byte) -120);
              var40 = (ak) ((Object) this.field_h);
              var9 = this.field_k + param2;
              var10 = var40.a((ga) (this), param3 + 1, param0) + (var40.a(112, (ga) (this)).a((byte) 102) >> 600768609);
              if (var6 == se.field_l) {
                break L5;
              } else {
                if (gj.field_v == var6) {
                  break L5;
                } else {
                  if (var6 != uc.field_b) {
                    if (mc.field_g != var6) {
                      return;
                    } else {
                      var24 = dj.field_k[1];
                      var24.b(var9, -(var24.field_t >> 1758093441) + var10, 256);
                      return;
                    }
                  } else {
                    var25 = dj.field_k[2];
                    var25.b(var9, -(var25.field_t >> 808486785) + var10, 256);
                    return;
                  }
                }
              }
            }
            var26 = dj.field_k[0];
            var11 = var26.field_r << -1320692991;
            var12 = var26.field_q << 1842606081;
            if (this.field_O != null) {
              if (var11 <= this.field_O.field_w) {
                if (var12 <= this.field_O.field_t) {
                  ki.a((byte) -103, this.field_O);
                  bi.d();
                  var26.a(112, 144, var26.field_r << 1763612836, var26.field_q << 395885220, -this.field_T << 1505528266, 4096);
                  pa.a(-21189);
                  this.field_O.b(-(var26.field_r >> -1586282143) + var9, var10 - var26.field_q, 256);
                  return;
                } else {
                  this.field_O = new vn(var11, var12);
                  ki.a((byte) -118, this.field_O);
                  var26.a(112, 144, var26.field_r << 1763612836, var26.field_q << 395885220, -this.field_T << 1505528266, 4096);
                  pa.a(-21189);
                  this.field_O.b(-(var26.field_r >> -1586282143) + var9, var10 - var26.field_q, 256);
                  return;
                }
              } else {
                this.field_O = new vn(var11, var12);
                ki.a((byte) -118, this.field_O);
                var26.a(112, 144, var26.field_r << 1763612836, var26.field_q << 395885220, -this.field_T << 1505528266, 4096);
                pa.a(-21189);
                this.field_O.b(-(var26.field_r >> -1586282143) + var9, var10 - var26.field_q, 256);
                return;
              }
            } else {
              this.field_O = new vn(var11, var12);
              ki.a((byte) -118, this.field_O);
              var26.a(112, 144, var26.field_r << 1763612836, var26.field_q << 395885220, -this.field_T << 1505528266, 4096);
              pa.a(-21189);
              this.field_O.b(-(var26.field_r >> -1586282143) + var9, var10 - var26.field_q, 256);
              return;
            }
          }
        } else {
          L6: {
            var17 = no.field_E;
            if (!var17.equals(this.field_o)) {
              this.field_o = var17;
              this.d((byte) -36);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            super.a(param0, param1, param2, param3);
            var6 = this.field_R.a((byte) -120);
            var39 = (ak) ((Object) this.field_h);
            var9 = this.field_k + param2;
            var10 = var39.a((ga) (this), param3 + 1, param0) + (var39.a(112, (ga) (this)).a((byte) 102) >> 600768609);
            if (var6 == se.field_l) {
              break L7;
            } else {
              if (gj.field_v == var6) {
                break L7;
              } else {
                if (var6 != uc.field_b) {
                  if (mc.field_g != var6) {
                    return;
                  } else {
                    var19 = dj.field_k[1];
                    var19.b(var9, -(var19.field_t >> 1758093441) + var10, 256);
                    return;
                  }
                } else {
                  var20 = dj.field_k[2];
                  var20.b(var9, -(var20.field_t >> 808486785) + var10, 256);
                  return;
                }
              }
            }
          }
          var21 = dj.field_k[0];
          var11 = var21.field_r << -1320692991;
          var12 = var21.field_q << 1842606081;
          if (this.field_O != null) {
            if (var11 <= this.field_O.field_w) {
              if (var12 > this.field_O.field_t) {
                this.field_O = new vn(var11, var12);
                ki.a((byte) -118, this.field_O);
                var21.a(112, 144, var21.field_r << 1763612836, var21.field_q << 395885220, -this.field_T << 1505528266, 4096);
                pa.a(-21189);
                this.field_O.b(-(var21.field_r >> -1586282143) + var9, var10 - var21.field_q, 256);
                return;
              } else {
                ki.a((byte) -103, this.field_O);
                bi.d();
                var21.a(112, 144, var21.field_r << 1763612836, var21.field_q << 395885220, -this.field_T << 1505528266, 4096);
                pa.a(-21189);
                this.field_O.b(-(var21.field_r >> -1586282143) + var9, var10 - var21.field_q, 256);
                return;
              }
            } else {
              this.field_O = new vn(var11, var12);
              ki.a((byte) -118, this.field_O);
              var21.a(112, 144, var21.field_r << 1763612836, var21.field_q << 395885220, -this.field_T << 1505528266, 4096);
              pa.a(-21189);
              this.field_O.b(-(var21.field_r >> -1586282143) + var9, var10 - var21.field_q, 256);
              return;
            }
          } else {
            this.field_O = new vn(var11, var12);
            ki.a((byte) -118, this.field_O);
            var21.a(112, 144, var21.field_r << 1763612836, var21.field_q << 395885220, -this.field_T << 1505528266, 4096);
            pa.a(-21189);
            this.field_O.b(-(var21.field_r >> -1586282143) + var9, var10 - var21.field_q, 256);
            return;
          }
        }
    }

    final String d(int param0) {
        int var2 = 44 / ((10 - param0) / 58);
        return null;
    }

    final static Boolean e(byte param0) {
        Boolean var1 = ba.field_g;
        ba.field_g = null;
        if (param0 < 22) {
            field_P = (boolean[]) null;
            return var1;
        }
        return var1;
    }

    static {
        field_P = new boolean[32];
    }
}
