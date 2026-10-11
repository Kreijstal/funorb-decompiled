/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends t implements vn {
    private ek field_lb;
    static w field_mb;
    static String field_pb;
    static ud field_ob;
    static int field_kb;
    static w field_nb;

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_lb == param2) {
            this.m((byte) -102);
          }
          if (param0 != 67) {
            field_nb = (w) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ib.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int[] param8) {
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = client.field_A ? 1 : 0;
        try {
          if (param3 >= 0 &&
            qg.field_e > param7) {
            if (0 > param0 &&
              0 > param6 &&
              param2 < 0) {
              return;
            }
            if (param0 >= qg.field_a &&
              param6 >= qg.field_a &&
              qg.field_a <= param2) {
              return;
            }
            if (param5 != 117) {
              return;
            }
            var14 = param3 - param7;
            if (param1 == param7) {
              if (param3 != param7) {
                var15 = param3 - param1;
                if (param6 <= param0) {
                  var12 = (param2 - param0 << 16) / var14;
                  var11 = (param2 - param6 << 16) / var15;
                  var9_int = param6 << 16;
                  var10 = param0 << 16;
                } else {
                  var9_int = param0 << 16;
                  var10 = param6 << 16;
                  var11 = (-param0 + param2 << 16) / var14;
                  var12 = (param2 - param6 << 16) / var15;
                }
              } else {
                var11 = 0;
                var10 = param6 << 16;
                var12 = 0;
                var9_int = param0 << 16;
              }
              var13 = 0;
              if (param7 < 0) {
                param7 = Math.min(-param7, param1 - param7);
                var10 = var10 + param7 * var12;
                var9_int = var9_int + param7 * var11;
                param7 = 0;
              }
            } else {
              var10 = param0 << 16;
              var9_int = param0 << 16;
              var15 = param1 - param7;
              var12 = (param2 - param0 << 16) / var14;
              var11 = (param6 - param0 << 16) / var15;
              if (var11 < var12) {
                var13 = 0;
              } else {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param7 < 0) {
                if (param1 < 0) {
                  param7 = param1 - param7;
                  var10 = var10 + var12 * param7;
                  var9_int = var9_int + var11 * param7;
                  param7 = param1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param7 = -param7;
                  var9_int = var9_int + param7 * var11;
                  var10 = var10 + param7 * var12;
                  param7 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = qg.field_d[param7];
                while (param1 > param7) {
                  var17 = var9_int >> 16;
                  if (qg.field_a > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (qg.field_a <= var18 + var17) {
                        var18 = -1 + (-var17 + qg.field_a);
                      }
                      if (var17 < 0) {
                        cf.a(var16Lifetime2, (byte) 57, param8, param4, var18 + var17);
                      } else {
                        cf.a(var16Lifetime2 + var17, (byte) 57, param8, param4, var18);
                      }
                    } else {
                      if (0 <= var17 &&
                        qg.field_a > var17) {
                        cf.a(var17 + var16Lifetime2, (byte) 57, param8, param4, var18);
                      }
                    }
                  }
                  param7++;
                  if (qg.field_e <= param7) {
                    return;
                  }
                  var10 = var10 + var12;
                  var16Lifetime2 = var16Lifetime2 + hk.field_j;
                  var9_int = var9_int + var11;
                }
              }
              var16Lifetime3 = param3 - param1;
              if (var16Lifetime3 == 0) {
                var12 = 0;
                var11 = 0;
              } else {
                var17Lifetime2 = param2 << 16;
                if (var13 != 0) {
                  var10 = param6 << 16;
                } else {
                  var9_int = param6 << 16;
                }
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
              }
            }
            if (param7 < 0) {
              param7 = -param7;
              var10 = var10 + var12 * param7;
              var9_int = var9_int + param7 * var11;
              param7 = 0;
            }
            var15Lifetime1 = qg.field_d[param7];
            while (param3 > param7) {
              var16Lifetime1 = var9_int >> 16;
              if (qg.field_a > var16Lifetime1) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 != 0) {
                  if (qg.field_a <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = qg.field_a - var16Lifetime1 - 1;
                  }
                  if (var16Lifetime1 < 0) {
                    cf.a(var15Lifetime1, (byte) 57, param8, param4, var16Lifetime1 + var17Lifetime1);
                  } else {
                    cf.a(var16Lifetime1 + var15Lifetime1, (byte) 57, param8, param4, var17Lifetime1);
                  }
                } else {
                  if (0 <= var16Lifetime1 &&
                    qg.field_a > var16Lifetime1) {
                    cf.a(var16Lifetime1 + var15Lifetime1, (byte) 57, param8, param4, var17Lifetime1);
                  }
                }
              }
              param7++;
              if (qg.field_e <= param7) {
                return;
              }
              var10 = var10 + var12;
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + hk.field_j;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_76_0 = var9;
          stackIn_76_1 = new StringBuilder().append("ib.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    private final ek a(kg param0, String param1, byte param2) {
        ek var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ek stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ek(param1, param0);
          var4.field_p = (gl) ((Object) new fk());
          var5 = this.field_y - 6;
          this.field_y = this.field_y + 38;
          if (param2 != -90) {
            field_nb = (w) null;
          }
          var4.b(30, -16 + (this.field_t - 14), 15, var5, param2 - 16465);
          this.b(var4, (byte) -55);
          this.f(109);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ib.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void m(byte param0) {
        if (!this.field_S) {
          return;
        }
        if (param0 >= -30) {
          return;
        }
        this.field_S = false;
    }

    final static ke a(byte param0, boolean param1) {
        ec var7 = null;
        ec var5_ref_ec = null;
        ec dupTemp$0 = null;
        ec dupTemp$1 = null;
        ec var10 = null;
        ec var8 = null;
        ke var6 = new ke(5);
        ke var9 = var6;
        int var3 = 372;
        if (he.field_db) {
          var3 -= 12;
        }
        if (ph.n(-30146)) {
          var8 = new ec(20, qn.field_rb, a.field_t);
          var8.field_m = var3;
          var8.field_l = -(var8.field_n / 2) + 320;
          var9.a(var8, 118);
        } else {
          var6.a(new ec(22, sf.field_E[0], a.field_t), 123);
          var6.a(new ec(22, sf.field_E[1], a.field_t), 118);
          var6.a(new ec(22, sf.field_E[2], a.field_t), 111);
          var7 = var6.field_f[0];
          ec var4 = var7;
          var6.field_f[2].field_n = 185;
          var5_ref_ec = var6.field_f[1];
          var5_ref_ec.field_n = 185;
          var7.field_n = 185;
          var6.field_f[0].field_l = 120 - var6.field_f[0].field_n / 2;
          var6.field_f[1].field_l = 320 - var6.field_f[1].field_n / 2;
          var6.field_f[2].field_l = 520 - var6.field_f[2].field_n / 2;
          dupTemp$0 = var6.field_f[2];
          dupTemp$0.field_m = var3;
          dupTemp$1 = var6.field_f[1];
          dupTemp$1.field_m = var3;
          var6.field_f[0].field_m = var3;
        }
        var3 += 43;
        if (he.field_db) {
          var10 = new ec(3, oa.field_c, a.field_t);
          var10.field_m = var3;
          var10.field_l = -(var10.field_n / 2) + 320;
          var3 += 28;
          var9.a(var10, 122);
        }
        ec var11 = new ec(13, pc.field_f, a.field_t);
        var11.field_l = 320 - var11.field_n / 2;
        var11.field_m = var3;
        var9.a(var11, 126);
        var9.field_q = 272;
        var9.field_y = 500;
        var9.field_w = 70;
        var9.field_z = 76;
        var9.a(fc.field_e, param1, -129);
        int var5 = -87 % ((19 - param0) / 60);
        return var9;
    }

    final static void a(byte param0, ck[] param1) {
        try {
          int var2_int = -81 / ((-23 - param0) / 37);
          d.field_h = param1;
          if (d.field_h != null &&
            param1.length < 3) {
            throw new IllegalArgumentException("");
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ib.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int l(int param0) {
        sc.field_l.a(-126);
        if (param0 <= 65) {
          field_ob = (ud) null;
        }
        if (ta.field_k.a((byte) -56)) {
          return 0;
        }
        return oj.b(0);
    }

    ib(ka param0, ln param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ce var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 != qb.field_s) {
            if (kl.field_p == param1) {
              var3 = dc.field_g;
              this.field_y = this.field_y + 10;
              if (wj.r(98)) {
                this.field_y = this.field_y + 20;
                var3 = wm.field_g;
              }
            } else {
              if (gd.field_c == param1) {
                this.field_y = this.field_y + 30;
                var3 = gd.field_i;
              }
            }
          } else {
            var3 = si.field_c;
          }
          var4 = new ce((String) (var3), (kg) null);
          var4.field_t = this.field_t;
          var4.field_u = 0;
          var4.field_y = 80;
          var4.field_D = 50;
          var4.field_p = (gl) ((Object) new a(bj.field_f, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(var4, (byte) -55);
          this.field_lb = this.a((kg) (this), og.field_gb, (byte) -90);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ib.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void m(int param0) {
        field_nb = null;
        field_pb = null;
        if (param0 > -10) {
          return;
        }
        field_mb = null;
        field_ob = null;
    }

    static {
        field_kb = 20;
    }
}
