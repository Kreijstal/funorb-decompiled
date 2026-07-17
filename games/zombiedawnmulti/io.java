/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    static boolean field_b;
    private int field_f;
    private wh field_j;
    static String field_e;
    static boolean field_g;
    private int field_i;
    private e field_c;
    static String field_d;
    static String field_a;
    static String field_h;

    private final void a(int param0, Object param1, long param2, int param3) {
        kk var6 = null;
        eg var6_ref = null;
        int var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
            if (((io) this).field_i < param0) {
                throw new IllegalStateException();
            }
            this.a(param2, false);
            ((io) this).field_f = ((io) this).field_f - param0;
            while (((io) this).field_f < 0) {
                var6 = (kk) (Object) ((io) this).field_c.a(false);
                this.a(1, var6);
            }
            var6_ref = new eg(param1, param0);
            ((io) this).field_j.a(param2, (byte) -19, (br) (Object) var6_ref);
            ((io) this).field_c.a((qa) (Object) var6_ref, (byte) 94);
            int var7 = -22;
            ((kk) (Object) var6_ref).field_l = 0L;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "io.I(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + -107 + 41);
        }
    }

    io(int param0) {
        this(param0, param0);
    }

    final static void a(int param0, cj param1, cj param2, cj param3, cj param4) {
        RuntimeException var5 = null;
        String var5_ref = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (fh.field_m == null) {
              L1: {
                sq.field_N = false;
                if (nh.field_m) {
                  var5_ref = t.field_a;
                  break L1;
                } else {
                  if (sh.field_L) {
                    var5_ref = qd.field_v;
                    break L1;
                  } else {
                    var5_ref = pd.field_e;
                    break L1;
                  }
                }
              }
              var7 = null;
              wh.a(6, wj.field_g, 0, var5_ref, (String) null);
              ke.field_j = ua.field_E;
              fh.field_m = ec.field_b;
              ec.field_b.field_xb = (8355711 & qq.field_f.field_xb >> 1) + wj.field_g + -(8355711 & wj.field_g >> 1);
              ec.field_b.field_Db = (8355711 & qq.field_f.field_Db >> 1) + (wj.field_g + -(8355711 & wj.field_g >> 1));
              ec.field_b.field_ob = wj.field_g - (8355711 & wj.field_g >> 1) + (qq.field_f.field_ob >> 1 & param0);
              lj.field_v = new cj(0L, param3);
              nq.field_t = new cj(0L, param2);
              re.field_a = new cj(0L, (cj) null);
              br.field_c = new cj(0L, param1);
              ec.field_b = new cj(0L, param4);
              ec.field_b.field_yb = w.field_A;
              br.field_c.a((byte) 50, ec.field_b);
              ua.field_E = new cj(0L, ke.field_j);
              br.field_c.a((byte) 50, ua.field_E);
              dp.field_c = new cj(0L, qq.field_f, bg.field_o);
              jk.field_d = new cj(0L, qq.field_f);
              lj.field_v.a((byte) 50, nq.field_t);
              lj.field_v.a((byte) 50, re.field_a);
              re.field_a.a((byte) 50, br.field_c);
              re.field_a.a((byte) 50, dp.field_c);
              re.field_a.a((byte) 50, jk.field_d);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("io.G(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
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
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        Object var5 = null;
        oi.a((String) null, param2, (byte) -67, param1);
        if (param0 != -21113) {
            Object var4 = null;
            io.a(3, (cj) null, (cj) null, (cj) null, (cj) null);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
        field_d = null;
        field_e = null;
    }

    final static boolean a(int param0, int param1, byte param2, nm param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -72) {
                break L1;
              } else {
                var5 = null;
                boolean discarded$2 = io.a(-88, -65, (byte) 96, (nm) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 <= -48) {
                  break L3;
                } else {
                  if (param0 <= -48) {
                    break L3;
                  } else {
                    if (640.0f * param3.field_d <= (float)param0) {
                      break L3;
                    } else {
                      if (param3.field_d * 480.0f <= (float)param1) {
                        break L3;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("io.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    private final void a(long param0, boolean param1) {
        kk var4 = (kk) (Object) ((io) this).field_j.a(param0, 72);
        this.a(1, var4);
    }

    private final void a(int param0, kk param1) {
        RuntimeException var3 = null;
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
            if (param0 == 1) {
              if (param1 != null) {
                param1.a(true);
                param1.a(param0 ^ -4563);
                ((io) this).field_f = ((io) this).field_f + param1.field_t;
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("io.J(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static bo[] a(boolean param0) {
        return new bo[]{wp.field_b, l.field_c, wi.field_h};
    }

    final void a(Object param0, long param1, int param2) {
        try {
            this.a(param2, param0, param1, -107);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "io.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private io(int param0, int param1) {
        int var3 = 0;
        ((io) this).field_c = new e();
        ((io) this).field_f = param0;
        ((io) this).field_i = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (var3 < param1) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((io) this).field_j = new wh(var3);
              return;
            }
          } else {
            ((io) this).field_j = new wh(var3);
            return;
          }
        }
    }

    final Object a(byte param0, long param1) {
        Object var5 = null;
        eg var6 = null;
        kk var7 = null;
        if (param0 > 121) {
          var7 = (kk) (Object) ((io) this).field_j.a(param1, 64);
          if (var7 != null) {
            var5 = var7.e(-111);
            if (var5 == null) {
              var7.a(true);
              var7.a(-4564);
              ((io) this).field_f = ((io) this).field_f + var7.field_t;
              return null;
            } else {
              L0: {
                if (var7.f(1000)) {
                  var6 = new eg(var5, var7.field_t);
                  ((io) this).field_j.a(var7.field_e, (byte) -86, (br) (Object) var6);
                  ((io) this).field_c.a((qa) (Object) var6, (byte) 109);
                  ((kk) (Object) var6).field_l = 0L;
                  var7.a(true);
                  var7.a(-4564);
                  break L0;
                } else {
                  ((io) this).field_c.a((qa) (Object) var7, (byte) 106);
                  var7.field_l = 0L;
                  break L0;
                }
              }
              return var5;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "ESC - cancel this line";
        field_d = "Resigned";
        field_h = "Show all game chat";
        field_a = "This option cannot be combined with the current '<%0>' setting.";
    }
}
