/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends qr {
    qr field_xb;
    static String[][] field_Db;
    static String field_Bb;
    static qf field_yb;
    ur field_Ab;
    qr field_zb;
    static String field_Cb;
    static String field_Eb;

    private final void a(int param0, boolean param1, int param2, byte param3, int param4) {
        if (this.field_Ab.h(param3 - 125)) {
          this.field_xb.field_w = this.field_xb.field_w + param2;
        }
        if (this.field_Ab.f(false)) {
          this.field_xb.field_w = this.field_xb.field_w - param2;
        }
        if (this.field_Ab.i(param3 ^ 113)) {
          this.field_xb.field_w = this.field_xb.field_w + param4;
        }
        if (this.field_Ab.g((byte) 104)) {
          this.field_xb.field_w = this.field_xb.field_w - param4;
        }
        if (this.field_L) {
          this.field_xb.field_w = this.field_xb.field_w - param0;
        }
        if (param1) {
          if (0 > -(this.field_xb.field_w + this.field_xb.field_db)) {
            this.field_xb.field_w = -this.field_xb.field_db;
          }
          if (-this.field_zb.field_mb + (this.field_xb.field_gb + this.field_xb.field_mb) < -(this.field_xb.field_db + this.field_xb.field_w)) {
            this.field_xb.field_w = -(this.field_xb.field_mb + this.field_xb.field_gb - this.field_zb.field_mb) - this.field_xb.field_db;
          }
        } else {
          if (-(this.field_xb.field_w + this.field_xb.field_db) > this.field_xb.field_mb + this.field_xb.field_gb - this.field_zb.field_mb) {
            this.field_xb.field_w = -this.field_xb.field_db - (-this.field_zb.field_mb + this.field_xb.field_gb + this.field_xb.field_mb);
          }
          if (-(this.field_xb.field_db + this.field_xb.field_w) < 0) {
            this.field_xb.field_w = -this.field_xb.field_db;
          }
        }
        if (this.field_Ab.g(-20641)) {
          this.field_xb.field_db = -this.field_Ab.a(-5639, this.field_xb.field_mb, this.field_zb.field_mb, param1);
          this.field_xb.field_w = 0;
        }
        if (param3 != 10) {
          return;
        }
        this.field_Ab.a(this.field_zb.field_mb, 20, this.field_xb.field_mb, -this.field_xb.field_db);
    }

    final void a(int param0, boolean param1, byte param2, int param3) {
        if (param2 <= -109) {
          this.a(param0, param1, param3, (byte) 10, this.field_zb.field_mb);
          return;
        }
        field_Cb = (String) null;
        this.a(param0, param1, param3, (byte) 10, this.field_zb.field_mb);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_hb = param2;
        this.field_K = param0;
        this.field_db = param1;
        this.field_mb = param5;
        if (param4 < -121) {
          this.a(param6, param3, false);
          return;
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        if (param3 > -71) {
          return true;
        }
        return this.a(param5, param1, param2, -116, param0, this.field_zb.field_mb, param4);
    }

    private final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6) {
        int var8;
        int var8Lifetime1;
        if (param2) {
          var8 = 1;
          this.field_xb.a(this.field_zb.field_mb, true, var8 != 0, param0);
          this.a(param4, false, param1, (byte) 10, param5);
          if (param3 > -113) {
            return false;
          }
          return var8 != 0;
        }
        if (!this.field_L) {
          var8Lifetime1 = 0;
        } else {
          if (!param6) {
            var8Lifetime1 = 1;
          } else {
            var8Lifetime1 = 0;
          }
        }
        this.field_xb.a(this.field_zb.field_mb, true, var8Lifetime1 != 0, param0);
        this.a(param4, false, param1, (byte) 10, param5);
        if (param3 > -113) {
          return false;
        }
        return var8Lifetime1 != 0;
    }

    private final void a(int param0, int param1, boolean param2) {
        this.field_zb.field_mb = this.field_mb;
        this.field_zb.field_K = -param1 + (this.field_K - param0);
        this.field_xb.field_hb = 0;
        if (!param2) {
          this.field_xb.field_K = this.field_K - param0 - param1;
          this.field_Ab.a(0, -param0 + this.field_K, param0, (byte) -77, -this.field_xb.field_db, this.field_zb.field_mb, this.field_xb.field_mb, this.field_mb);
          return;
        }
    }

    final static void a(int param0, nq param1, v param2, int param3, int param4, int param5, nq param6, int param7, int param8, int param9, int param10, v param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, v param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          kc.field_g = param1;
          lq.field_k = param6;
          nh.a(param10, param3, param0, param12, 2);
          as.a(param17, param9 + 20, param18, param2);
          wi.a(param5, (byte) 67, param19, param7, param11, param15);
          if (param9 != 0) {
            field_Cb = (String) null;
          }
          fs.a(param16, param4, false);
          bs.a(param13, param8, param14, (byte) 102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("ub.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static kj a(byte param0, boolean param1) {
        kj var2 = null;
        kj var2Lifetime1;
        if (param0 == 93) {
          var2 = new kj(true);
          var2.field_b = param1 ? true : false;
          return var2;
        }
        field_Db = (String[][]) null;
        var2Lifetime1 = new kj(true);
        var2Lifetime1.field_b = param1 ? true : false;
        return var2Lifetime1;
    }

    ub(long param0, qr param1, qr param2, ur param3) {
        super(param0, (qr) null);
        try {
          this.field_zb = new qr(0L, param2);
          this.field_Ab = new ur(0L, param3);
          this.a(4, this.field_zb);
          this.a(4, this.field_Ab);
          this.field_xb = param1;
          this.field_zb.a(4, param1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ub.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_Bb = null;
        field_Db = (String[][]) null;
        field_yb = null;
        field_Cb = null;
        field_Eb = null;
        if (param0 == 0) {
          return;
        }
        field_Eb = (String) null;
    }

    final static void f(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_88_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!mf.field_r) {
            if (hp.field_n.a("intro", param0 ^ 52)) {
              mf.field_r = true;
            }
          } else {
            if (!jn.field_a) {
              rn.b((byte) 50);
            }
          }
          if (param0 != 93) {
            ub.f((byte) -67);
          }
          while (cc.$cfr$intArgs$e$296a4c2b494e(55)) {
            if (oq.field_j == 13) {
              jc.a(-1, (byte) 125);
              continue;
            }
            if (oq.field_j != 83) {
              continue;
            }
            if (p.field_n) {
              continue;
            }
            if (!jn.field_a) {
              continue;
            }
            if (bj.field_L <= 0) {
              continue;
            }
            ph.a(param0 ^ 93);
            if (ui.field_m >= 5) {
              stackIn_21_0 = -1;
            } else {
              stackIn_21_0 = ui.field_m + 1;
            }
            jc.a(stackIn_21_0, (byte) 125);
          }
          if (50 + u.field_a < cl.field_n) {
            u.field_a = cl.field_n + vc.a((byte) -39, 50);
          }
          var1_int = cl.field_n - u.field_a;
          if (0 > var1_int) {
            dp.field_r = 0;
          } else {
            if (var1_int < 10) {
              dp.field_r = var1_int * 25;
            } else {
              if (var1_int >= 15) {
                if (20 > var1_int) {
                  dp.field_r = -150 + 25 * var1_int;
                } else {
                  if (var1_int < 25) {
                    dp.field_r = 750 - var1_int * 25;
                  } else {
                    if (var1_int >= 30) {
                      if (var1_int < 40) {
                        dp.field_r = 1000 - var1_int * 25;
                      } else {
                        dp.field_r = 0;
                      }
                    } else {
                      dp.field_r = 25 * var1_int - 400;
                    }
                  }
                }
              } else {
                dp.field_r = 500 - 25 * var1_int;
              }
            }
          }
          if (!p.field_n) {
            if (bj.field_L < 50) {
              bj.field_L = bj.field_L + 1;
            }
          } else {
            fieldTemp$0 = bj.field_L - 1;
            bj.field_L = bj.field_L - 1;
            if (fieldTemp$0 <= 0) {
              p.field_n = false;
              ui.field_m = kc.field_i;
              bj.field_L = 0;
              if (ui.field_m == -1) {
                uc.field_v = 50;
                ta.a(0, 0, (byte) 96, false);
                rn.a(param0 + 1048483);
                ne.d(true);
              }
              if (ui.field_m == 2) {
                gq.b(param0 + 29);
              }
              if (ui.field_m != 4) {
                di.field_m = 0;
              } else {
                mh.b(param0 + 1674225223);
                di.field_m = 0;
              }
            }
          }
          ej.b(-128);
          if (ui.field_m != 0) {
            if (1 == ui.field_m) {
              tr.a((byte) 119);
            } else {
              if (2 != ui.field_m) {
                if (ui.field_m == 3) {
                  ak.f((byte) 118);
                } else {
                  if (ui.field_m == 4) {
                    ld.d(0);
                  } else {
                    if (ui.field_m == 5) {
                      gl.a((byte) -72);
                    }
                  }
                }
              } else {
                um.b(-63);
              }
            }
          } else {
            lh.d((byte) 44);
          }
          if (pd.field_k < 540) {
            ci.field_o = false;
          } else {
            if (pd.field_k >= 620) {
              ci.field_o = false;
            } else {
              if (440 > bb.field_b) {
                ci.field_o = false;
              } else {
                if (bb.field_b >= 460) {
                  ci.field_o = false;
                } else {
                  ci.field_o = true;
                }
              }
            }
          }
          if (je.field_d != 0) {
            if (540 <= nh.field_p &&
              nh.field_p < 620 &&
              440 <= td.field_P &&
              td.field_P < 460) {
              jc.a(-1, (byte) 122);
              return;
            }
            if (!p.field_n &&
              jn.field_a) {
              if (bj.field_L <= 0) {
                return;
              }
              ph.a(0);
              if (5 > ui.field_m) {
                stackIn_88_0 = 1 + ui.field_m;
              } else {
                stackIn_88_0 = -1;
              }
              jc.a(stackIn_88_0, (byte) -55);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "ub.I(" + param0 + ')');
        }
    }

    static {
        field_Cb = "<%highlight>STATISTICS SCREEN</col> - Pressing <%key>'SPACE'</col> will display a page showing statistics from the active colonies. Pressing <%key>'SPACE'</col> again will close it.";
        field_Bb = "Select source star system to issue fleet orders.";
        field_Eb = "You have not yet unlocked this option for use.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static kj $cfr$intArgs$a$be17d4c2d3e3(int param0, boolean param1) {
        kj var2 = null;
        kj var2Lifetime1;
        if (param0 == 93) {
          var2 = new kj(true);
          var2.field_b = param1 ? true : false;
          return var2;
        }
        field_Db = (String[][]) null;
        var2Lifetime1 = new kj(true);
        var2Lifetime1.field_b = param1 ? true : false;
        return var2Lifetime1;
    }
}
