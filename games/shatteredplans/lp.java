/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends vd implements gj {
    static bi[] field_w;
    static qr field_v;
    static String field_A;
    static String field_u;
    int field_y;
    private int field_x;
    static String field_z;

    final void e(int param0) {
        super.e(param0 + param0);
        this.field_x = 0;
        this.field_y = 0;
    }

    public final void a(int param0, int param1) {
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_x == param1) {
            return;
        }
        int var3 = -this.field_i + this.field_y;
        int var4 = var3 * param1 / 65536;
        int var5 = var3 * this.field_x / 65536;
        vd var6 = (vd) ((Object) this.field_l.d(0));
        while (var6 != null) {
            var6.d(-var4 + var5, 0, 0);
            var6 = (vd) ((Object) this.field_l.a((byte) -71));
        }
        if (param0 != 13280) {
            field_A = (String) null;
        } else {
            this.field_x = param1;
            return;
        }
        this.field_x = param1;
    }

    public static void f(int param0) {
        field_v = null;
        field_A = null;
        field_w = null;
        field_u = null;
        field_z = null;
        if (param0 != 1546006977) {
            field_v = (qr) null;
        }
    }

    lp(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        this.field_y = 0;
        this.field_x = 0;
    }

    final void a(vd param0, int param1) {
        try {
            super.a(param0, param1);
            if (param0 instanceof lp) {
                this.field_y = this.field_y + param0.field_i;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "lp.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, sq param1) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        lm[] var8 = null;
        int var9 = 0;
        lm var10 = null;
        int var11 = 0;
        ob var12 = null;
        sq var13 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (is.field_b) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              hm.field_q = param1;
              if (param1 == null) {
                tp.field_b = pc.field_q;
                jb.field_d = kp.field_j + jc.field_r >> 1546006977;
                fe.field_B = kp.field_j + jc.field_r >> 1546006977;
                oi.field_a = be.field_h;
                var13 = (sq) null;
                qj.a((sq) null, -1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  sj.a(-31560);
                  var2_int = param1.field_t;
                  var3 = param1.field_b;
                  var4 = param1.field_j;
                  var5 = param1.field_q;
                  if (param0 == 1546006977) {
                    break L1;
                  } else {
                    var12 = (ob) null;
                    lp.a((mg) null, (byte) -74, (ob) null);
                    break L1;
                  }
                }
                L2: {
                  if (0 != (param1.field_q ^ -1)) {
                    break L2;
                  } else {
                    var6 = uq.field_m.a(5607, param1.field_c);
                    var7 = wk.a(-9615, var6, rs.field_Cb, new int[]{-6 + var4 + -20});
                    var5 = 34 + (rs.field_Cb.field_q - -(var7 * 13));
                    eh.field_L = new bi[var7];
                    if (param1.field_f != null) {
                      var8 = param1.field_f;
                      var9 = 0;
                      L3: while (true) {
                        if (var8.length <= var9) {
                          break L2;
                        } else {
                          var10 = var8[var9];
                          var6 = uq.field_m.a(5607, var10.field_b);
                          var7 = wk.a(-9615, var6, rs.field_Cb, new int[]{-20 + (-6 + var4)});
                          var5 = var5 + (13 * var7 - -rs.field_Cb.field_q);
                          var9++;
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if ((1 & param1.field_n) == 0) {
                    var2_int = var2_int + 3;
                    break L4;
                  } else {
                    var2_int = 637 + -var2_int;
                    break L4;
                  }
                }
                L5: {
                  if ((param1.field_n & 2) != 0) {
                    var3 = 477 - var3;
                    break L5;
                  } else {
                    var3 = 55 - -var3;
                    break L5;
                  }
                }
                L6: {
                  if ((2 & param1.field_n) == 0) {
                    break L6;
                  } else {
                    var3 = var3 - var5;
                    break L6;
                  }
                }
                L7: {
                  if (-1 == (param1.field_n & 1 ^ -1)) {
                    break L7;
                  } else {
                    var2_int = var2_int - var4;
                    break L7;
                  }
                }
                L8: {
                  jb.field_d = var4 + var2_int;
                  tp.field_b = var3 + var5;
                  oi.field_a = var3;
                  fe.field_B = var2_int;
                  qj.a(param1, param0 ^ -1546006978);
                  if (0 != (param1.field_c.indexOf("<%tabresizehint>") ^ -1)) {
                    uq.field_m.a("", 27275, "tabresizehint");
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (ol.field_g != null) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  pc.field_q = tp.field_b;
                  be.field_h = oi.field_a;
                  kp.field_j = jb.field_d + fe.field_B >> -2127607903;
                  jc.field_r = jb.field_d + fe.field_B >> -2127607903;
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("lp.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(mg param0, byte param1, ob param2) {
        try {
            di.a(param0.field_y, false, param2);
            di.a(param0.field_B, false, param2);
            param2.d(param0.field_z, 255);
            if (param1 > -67) {
                field_A = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "lp.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final vd b(byte param0, int param1, int param2) {
        vd var4;
        if (param0 > 51) {
          if (this.field_s) {
            if (this.c(param1, param2, 0)) {
              var4 = as.a(this.field_l, param1, (byte) 117, param2);
              if (var4 != null) {
                return var4;
              } else {
                return super.b((byte) 127, param1, param2);
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_u = (String) null;
          if (this.field_s) {
            if (this.c(param1, param2, 0)) {
              var4 = as.a(this.field_l, param1, (byte) 117, param2);
              if (var4 != null) {
                return var4;
              } else {
                return super.b((byte) 127, param1, param2);
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 64 / ((param0 - 67) / 47);
        if (!(this.field_s)) {
            return;
        }
        int[] var3 = new int[4];
        gf.a(var3);
        gf.i(this.field_k, this.field_t, this.field_m + this.field_k, this.field_t + this.field_i);
        vd var4 = (vd) ((Object) this.field_l.f(3725));
        while (var4 != null) {
            var4.a(116);
            var4 = (vd) ((Object) this.field_l.b(-124));
        }
        gf.b(var3);
    }

    static {
        field_z = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_u = "Start Game";
        field_A = "You have been defeated";
    }
}
