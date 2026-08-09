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
        RuntimeException runtimeException = null;
        eg var6 = null;
        int var7 = 0;
        int var8 = 0;
        kk var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.field_i >= param0) {
              this.a(param2, false);
              this.field_f = this.field_f - param0;
              L1: while (true) {
                L2: {
                  if (-1 >= (this.field_f ^ -1)) {
                    break L2;
                  } else {
                    var9 = (kk) ((Object) this.field_c.a(false));
                    this.a(1, var9);
                    if (var8 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6 = new eg(param1, param0);
                this.field_j.a(param2, (byte) -19, var6);
                this.field_c.a(var6, (byte) 94);
                var7 = 91 / ((param3 - 82) / 44);
                ((kk) ((Object) var6)).field_l = 0L;
                break L0;
              }
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("io.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    io(int param0) {
        this(param0, param0);
    }

    final static void a(int param0, cj param1, cj param2, cj param3, cj param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (fh.field_m == null) {
              L1: {
                L2: {
                  sq.field_N = false;
                  if (nh.field_m) {
                    break L2;
                  } else {
                    L3: {
                      if (sh.field_L) {
                        break L3;
                      } else {
                        var5 = pd.field_e;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5 = qd.field_v;
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = t.field_a;
                break L1;
              }
              var7 = (String) null;
              wh.a(6, wj.field_g, 0, var5, (String) null);
              ke.field_j = ua.field_E;
              fh.field_m = ec.field_b;
              ec.field_b.field_xb = (8355711 & qq.field_f.field_xb >> 1246958529) + wj.field_g + -(8355711 & wj.field_g >> 1019345601);
              ec.field_b.field_Db = (8355711 & qq.field_f.field_Db >> -459961663) + (wj.field_g + -(8355711 & wj.field_g >> 1406665377));
              ec.field_b.field_ob = wj.field_g - (8355711 & wj.field_g >> -1895684351) + (qq.field_f.field_ob >> 1889487393 & param0);
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("io.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        String var5 = (String) null;
        oi.a((String) null, param2, (byte) -67, param1);
        if (param0 != -21113) {
            cj var4 = (cj) null;
            io.a(3, (cj) null, (cj) null, (cj) null, (cj) null);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 8) {
          field_e = (String) null;
          field_h = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_h = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    final static boolean a(int param0, int param1, byte param2, nm param3) {
        RuntimeException var4 = null;
        nm var5 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -72) {
                break L1;
              } else {
                var5 = (nm) null;
                io.a(-88, -65, (byte) 96, (nm) null);
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
                        stackIn_8_0 = 1;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackIn_8_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("io.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    private final void a(long param0, boolean param1) {
        kk var4;
        cj var5;
        var4 = (kk) ((Object) this.field_j.a(param0, 72));
        this.a(1, var4);
        if (param1) {
          var5 = (cj) null;
          io.a(-49, (cj) null, (cj) null, (cj) null, (cj) null);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, kk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1) {
              if (param1 != null) {
                param1.a(true);
                param1.a(param0 ^ -4563);
                this.field_f = this.field_f + param1.field_t;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("io.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static bo[] a(boolean param0) {
        if (!param0) {
          return (bo[]) null;
        } else {
          return new bo[]{wp.field_b, l.field_c, wi.field_h};
        }
    }

    final void a(Object param0, long param1, int param2) {
        try {
            this.a(param2, param0, param1, -107);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "io.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private io(int param0, int param1) {
        int var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_c = new e();
        this.field_f = param0;
        this.field_i = param0;
        var3 = 1;
        L0: while (true) {
          L1: {
            if (var3 + var3 >= param0) {
              break L1;
            } else {
              if (var3 >= param1) {
                break L1;
              } else {
                var3 = var3 + var3;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_j = new wh(var3);
          return;
        }
    }

    final Object a(byte param0, long param1) {
        Object var5;
        eg var6;
        kk var7;
        if (param0 > 121) {
          var7 = (kk) ((Object) this.field_j.a(param1, 64));
          if (var7 != null) {
            var5 = var7.e(-111);
            if (var5 != null) {
              if (!var7.f(1000)) {
                this.field_c.a(var7, (byte) 106);
                var7.field_l = 0L;
                if (ZombieDawnMulti.field_E) {
                  var6 = new eg(var5, var7.field_t);
                  this.field_j.a(var7.field_e, (byte) -86, var6);
                  this.field_c.a(var6, (byte) 109);
                  ((kk) ((Object) var6)).field_l = 0L;
                  var7.a(true);
                  var7.a(-4564);
                  return var5;
                } else {
                  return var5;
                }
              } else {
                var6 = new eg(var5, var7.field_t);
                this.field_j.a(var7.field_e, (byte) -86, var6);
                this.field_c.a(var6, (byte) 109);
                ((kk) ((Object) var6)).field_l = 0L;
                var7.a(true);
                var7.a(-4564);
                return var5;
              }
            } else {
              var7.a(true);
              var7.a(-4564);
              this.field_f = this.field_f + var7.field_t;
              return null;
            }
          } else {
            return null;
          }
        } else {
          return (Object) null;
        }
    }

    static {
        field_e = "ESC - cancel this line";
        field_d = "Resigned";
        field_h = "Show all game chat";
        field_a = "This option cannot be combined with the current '<%0>' setting.";
    }
}
