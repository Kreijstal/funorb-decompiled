/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ga {
    private int field_b;
    private int[] field_e;
    private int field_g;
    static int field_a;
    static int field_d;
    static int field_f;
    int field_c;

    final void a(int param0, String param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -18879) {
            return;
        }
        try {
            var3_int = this.field_b != 0 ? 65280 : 16762115;
            if (sh.field_f <= this.field_c) {
                fi.a(320, 332, 35, oc.field_S, var3_int);
            } else {
                var4 = this.field_c * 35 / 1000;
                var5 = var4 >> 1771123489;
                fi.a(320, 349 + -var5, var4, oc.field_S, var3_int);
                t.f(0, -var5 + 355, 640, var4 / 2 + 343);
            }
            rk.field_e.b(param1, 320, 360, 0, -1);
            t.c();
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ga.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        if (param0 <= -124) {
          if (!param1) {
            if ((this.field_c ^ -1) < -1) {
              this.field_c = this.field_c - ap.field_c;
              if (-1 >= (this.field_c ^ -1)) {
                return;
              } else {
                this.field_c = 0;
                return;
              }
            } else {
              return;
            }
          } else {
            if (this.field_c < sh.field_f) {
              this.field_c = this.field_c + ap.field_a;
              if (sh.field_f < this.field_c) {
                this.field_c = sh.field_f;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        if (param2 < -68) {
          if ((param1 ^ -1) < -171) {
            if ((param1 ^ -1) > -315) {
              if (this.field_g < param0) {
                if (param0 >= 144 + this.field_g) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(byte param0) {
        this.field_c = 0;
        int var2 = -81 % ((21 - param0) / 63);
    }

    final void a(boolean param0) {
        if (!param0) {
          if ((this.field_c ^ -1) >= -1) {
            if (this.field_c < sh.field_f) {
              lg.field_d[this.field_b].b(72 + this.field_g, 242, 0, this.field_c + 4096 - sh.field_f);
              return;
            } else {
              lg.field_d[this.field_b].b(this.field_g, 170);
              return;
            }
          } else {
            t.a(72 + this.field_g << -643224156, 3872, 600 + this.field_c, -1 + this.field_e.length, this.field_e);
            if (this.field_c < sh.field_f) {
              lg.field_d[this.field_b].b(72 + this.field_g, 242, 0, this.field_c + 4096 - sh.field_f);
              return;
            } else {
              lg.field_d[this.field_b].b(this.field_g, 170);
              return;
            }
          }
        } else {
          this.field_c = -4;
          if ((this.field_c ^ -1) < -1) {
            t.a(72 + this.field_g << -643224156, 3872, 600 + this.field_c, -1 + this.field_e.length, this.field_e);
            if (this.field_c < sh.field_f) {
              lg.field_d[this.field_b].b(72 + this.field_g, 242, 0, this.field_c + 4096 - sh.field_f);
              return;
            } else {
              lg.field_d[this.field_b].b(this.field_g, 170);
              return;
            }
          } else {
            if (this.field_c < sh.field_f) {
              lg.field_d[this.field_b].b(72 + this.field_g, 242, 0, this.field_c + 4096 - sh.field_f);
              return;
            } else {
              lg.field_d[this.field_b].b(this.field_g, 170);
              return;
            }
          }
        }
    }

    final static rk a(int param0, int param1) {
        double var2 = 1.0;
        var2 = var2 + (((double)param0 - (double)param1) / 16.0 + ((double)ok.a(tg.field_f, -99, 7) - 3.0) / 10.0);
        return new rk(1 + ok.a(tg.field_f, param1 ^ -102, 14), 10, of.a(var2, 65536));
    }

    final static void a(int param0, int param1, int param2, int param3, ak param4, ak param5, byte[] param6, int param7, int param8, ak param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            hn.field_f = -1L;
            oe.field_Rb = param6;
            um.field_k = param8;
            fj.field_b = param6.length;
            bn.field_S = null;
            rl.field_r = false;
            qm.field_J = new byte[(7 + um.field_k) / 8];
            io.field_c = null;
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              if (oe.field_Rb.length <= var11) {
                L2: {
                  var10_int = (7 + var10_int) / 8;
                  k.field_k = new byte[var10_int];
                  if (null != param5.field_L) {
                    break L2;
                  } else {
                    param5.field_L = new bb();
                    break L2;
                  }
                }
                L3: {
                  i.field_n = param5.field_L;
                  i.field_n.e(param3 ^ -121);
                  il.field_d = new vg(param1);
                  ka.field_X = 0;
                  ec.field_r = 0;
                  gi.field_a = -1;
                  ui.field_e = -1;
                  if (param9.field_L != null) {
                    break L3;
                  } else {
                    param9.field_L = new bb();
                    break L3;
                  }
                }
                L4: {
                  nk.field_a = param9.field_L;
                  nk.field_a.e(123);
                  dg.field_f = new vg(param2);
                  if (null == param4.field_L) {
                    param4.field_L = new bb();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  wi.field_a = param4.field_L;
                  if (param3 == 3) {
                    break L5;
                  } else {
                    field_d = 20;
                    break L5;
                  }
                }
                wi.field_a.e(param3 ^ 91);
                eh.field_f = new vg(param7);
                bo.field_e = 0L;
                mh.field_b = param0;
                break L0;
              } else {
                var10_int = var10_int + (255 & oe.field_Rb[var11]);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var10);
            stackOut_15_1 = new StringBuilder().append("ga.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
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
          L7: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param5 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param6 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param9 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    ga(int param0, int param1, int[] param2) {
        try {
            this.field_b = param0;
            this.field_e = param2;
            this.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ga.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = 0;
        field_a = field_d;
    }
}
