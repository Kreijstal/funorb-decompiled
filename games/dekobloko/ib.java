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
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (((ib) this).field_lb == param2) {
                int discarded$2 = -102;
                this.m();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 67) {
                break L2;
              } else {
                field_nb = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ib.H(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int[] param8) {
        RuntimeException var9 = null;
        int var19 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var19 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 < 0) {
                break L1;
              } else {
                if (~qg.field_e < ~param7) {
                  L2: {
                    if (0 <= param0) {
                      break L2;
                    } else {
                      if (0 <= param6) {
                        break L2;
                      } else {
                        if (param2 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (~param0 > ~qg.field_a) {
                      break L3;
                    } else {
                      if (~param6 > ~qg.field_a) {
                        break L3;
                      } else {
                        if (qg.field_a > param2) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var9;
            stackOut_16_1 = new StringBuilder().append("ib.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(117).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param8 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final ek a(kg param0, String param1) {
        ek var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ek stackIn_1_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        ek stackOut_0_0 = null;
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
        try {
          L0: {
            var4 = new ek(param1, param0);
            var4.field_p = (gl) (Object) new fk();
            var5 = ((ib) this).field_y + -6;
            ((ib) this).field_y = ((ib) this).field_y + 38;
            var4.b(30, -16 + (((ib) this).field_t + -14), 15, var5, -16555);
            ((ib) this).b((ce) (Object) var4, (byte) -55);
            ((ib) this).f(109);
            stackOut_0_0 = (ek) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("ib.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -90 + ')');
        }
        return stackIn_1_0;
    }

    private final void m() {
        if (!(((ib) this).field_S)) {
            return;
        }
    }

    final static ke a(byte param0, boolean param1) {
        int var3 = 0;
        ec var4 = null;
        ec var5_ref_ec = null;
        int var5 = 0;
        ke var6 = null;
        ec var7 = null;
        ec var8 = null;
        ke var9 = null;
        ec var10 = null;
        ec var11 = null;
        L0: {
          var6 = new ke(5);
          var9 = var6;
          var3 = 372;
          if (he.field_db) {
            var3 -= 12;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!ph.n(-30146)) {
            var6.a(new ec(22, sf.field_E[0], (mm) (Object) a.field_t), 123);
            var6.a(new ec(22, sf.field_E[1], (mm) (Object) a.field_t), 118);
            var6.a(new ec(22, sf.field_E[2], (mm) (Object) a.field_t), 111);
            var7 = var6.field_f[0];
            var4 = var7;
            var6.field_f[2].field_n = 185;
            var5_ref_ec = var6.field_f[1];
            var5_ref_ec.field_n = 185;
            var7.field_n = 185;
            var6.field_f[0].field_l = 120 + -(var6.field_f[0].field_n / 2);
            var6.field_f[1].field_l = 320 - var6.field_f[1].field_n / 2;
            var6.field_f[2].field_l = 520 + -(var6.field_f[2].field_n / 2);
            var6.field_f[2].field_m = var3;
            var6.field_f[1].field_m = var3;
            var6.field_f[0].field_m = var3;
            break L1;
          } else {
            var8 = new ec(20, qn.field_rb, (mm) (Object) a.field_t);
            var8.field_m = var3;
            var8.field_l = -(var8.field_n / 2) + 320;
            var9.a(var8, 118);
            break L1;
          }
        }
        L2: {
          var3 += 43;
          if (he.field_db) {
            var10 = new ec(3, oa.field_c, (mm) (Object) a.field_t);
            var10.field_m = var3;
            var10.field_l = -(var10.field_n / 2) + 320;
            var3 += 28;
            var9.a(var10, 122);
            break L2;
          } else {
            break L2;
          }
        }
        var11 = new ec(13, pc.field_f, (mm) (Object) a.field_t);
        var11.field_l = 320 - var11.field_n / 2;
        var11.field_m = var3;
        var9.a(var11, 126);
        var9.field_q = 272;
        var9.field_y = 500;
        var9.field_w = 70;
        var9.field_z = 76;
        var9.a(fc.field_e, param1, -129);
        var5 = -87 % ((19 - param0) / 60);
        return var9;
    }

    final static void a(byte param0, ck[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              var2_int = -40;
              d.field_h = param1;
              if (d.field_h == null) {
                break L1;
              } else {
                if (param1.length >= 3) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ib.J(").append(-108).append(',');
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static int l() {
        sc.field_l.a(-126);
        if (!ta.field_k.a((byte) -56)) {
            int discarded$0 = 0;
            return oj.b();
        }
        return 0;
    }

    ib(ka param0, ln param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ce var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param1 != qb.field_s) {
                if (kl.field_p == param1) {
                  var3 = (Object) (Object) dc.field_g;
                  ((ib) this).field_y = ((ib) this).field_y + 10;
                  int discarded$7 = 98;
                  if (!wj.r()) {
                    break L1;
                  } else {
                    ((ib) this).field_y = ((ib) this).field_y + 20;
                    var3 = (Object) (Object) wm.field_g;
                    break L1;
                  }
                } else {
                  if (gd.field_c != param1) {
                    break L1;
                  } else {
                    ((ib) this).field_y = ((ib) this).field_y + 30;
                    var3 = (Object) (Object) gd.field_i;
                    break L1;
                  }
                }
              } else {
                var3 = (Object) (Object) si.field_c;
                break L1;
              }
            }
            var4 = new ce((String) var3, (kg) null);
            var4.field_t = ((ib) this).field_t;
            var4.field_u = 0;
            var4.field_y = 80;
            var4.field_D = 50;
            var4.field_p = (gl) (Object) new a(bj.field_f, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((ib) this).b(var4, (byte) -55);
            int discarded$8 = -90;
            ((ib) this).field_lb = this.a((kg) this, og.field_gb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("ib.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public static void m(int param0) {
        field_nb = null;
        field_pb = null;
        field_mb = null;
        field_ob = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_kb = 20;
    }
}
