/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ng extends rq {
    private ef[] field_i;
    static hr[] field_f;
    private boolean field_h;
    private boolean field_g;
    static String field_e;

    final void a(boolean param0, byte param1) {
        this.field_b.a((byte) -83, lf.field_e, vi.field_v);
        if (param1 > -71) {
          this.field_i = (ef[]) null;
        }
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 0) {
          return;
        }
        field_e = null;
    }

    final boolean b(byte param0) {
        if (param0 >= -8) {
          return true;
        }
        return true;
    }

    final static void e(int param0) {
        if (param0 > -9) {
          return;
        }
        jp.b((byte) 126);
    }

    final void c(boolean param0) {
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0) {
          this.a(114, 98, -46);
        }
        if (!this.field_h) {
          this.field_b.a(jq.field_a, 0, true);
        } else {
          this.field_b.g(1, -109);
          this.field_b.a((ed) null, 102);
          this.field_b.a(13754, lf.field_c);
          this.field_b.l(0);
          if (!this.field_g) {
            this.field_b.a((byte) -83, vi.field_v, vi.field_v);
            this.field_b.a(jq.field_a, 0, 0);
            this.field_b.g(2, -117);
            this.field_b.a((byte) -83, vi.field_v, vi.field_v);
            this.field_b.a(jq.field_a, 0, 0);
            this.field_b.a(ta.field_a, 1, 0);
            this.field_b.a(jq.field_a, 0, true);
            this.field_b.a((ed) null, 110);
          } else {
            this.field_b.a((byte) -83, vi.field_v, vi.field_v);
            this.field_b.a(jq.field_a, 0, 0);
            this.field_b.a(jq.field_a, 0, true);
          }
          this.field_b.g(0, -126);
          this.field_h = false;
        }
        this.field_b.a((byte) -83, vi.field_v, vi.field_v);
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
          return;
        }
        if (this.field_h) {
          this.field_b.g(1, -122);
          this.field_b.a(this.field_i[-1 + param2], 93);
          this.field_b.g(0, -119);
        }
    }

    final static ki a(int param0, int param1, boolean param2, int param3, boolean param4, boolean param5) {
        try {
          int var6_int = 0;
          IOException var6 = null;
          Object var7 = null;
          Object var8 = null;
          am var9 = null;
          ki stackIn_11_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6_int = 100 % ((param1 + 29) / 42);
            var7 = null;
            if (gk.field_u.field_l != null) {
              bc.field_a = new gj(gk.field_u.field_l, 5200, 0);
              gk.field_u.field_l = null;
              var7 = new wl(255, bc.field_a, new gj(gk.field_u.field_d, 12000, 0), 2097152);
            }
            var8 = null;
            if (null != bc.field_a) {
              if (null == m.field_O) {
                m.field_O = new gj[gk.field_u.field_i.length];
              }
              if (m.field_O[param3] == null) {
                m.field_O[param3] = new gj(gk.field_u.field_i[param3], 12000, 0);
                gk.field_u.field_i[param3] = null;
              }
              var8 = new wl(param3, bc.field_a, m.field_O[param3], 2097152);
            }
            var9 = wt.field_i.a(false, param3, (wl) (var7), param5, (wl) (var8));
            if (param4) {
              var9.c((byte) -81);
            }
            stackIn_11_0 = new ki(var9, param2, param0);
            return stackIn_11_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(var6.toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, ed param2) {
        if (param1 != 18834) {
          return;
        }
        try {
          this.field_b.a(param2, 125);
          this.field_b.h(84, param0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ng.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ng(aw param0) {
        super(param0);
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        boolean stackIn_5_1 = false;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        this.field_h = false;
        try {
          if (param0.field_W) {
            stackIn_5_1 = !(param0.field_cc >= 3);
            this.field_g = stackIn_5_1;
            stackIn_8_0 = (!this.field_g) ? 127 : 48;
            var2_int = stackIn_8_0;
            var29 = new int[6][4096];
            var27 = new int[6][4096];
            var28 = new int[6][4096];
            var9 = 0;
            for (var14 = 0; var14 < 64; var14++) {
              for (var15 = 0; var15 < 64; var15++) {
                var12 = -1.0f + 2.0f * (float)var14 / 64.0f;
                var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + 1.0f))));
                var11 = var11 * var13;
                var12 = var12 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (var16 != 0) {
                    if (1 != var16) {
                      if (var16 == 2) {
                        var10 = var12;
                      } else {
                        if (var16 == 3) {
                          var10 = -var12;
                        } else {
                          if (var16 != 4) {
                            var10 = -var13;
                          } else {
                            var10 = var13;
                          }
                        }
                      }
                    } else {
                      var10 = var11;
                    }
                  } else {
                    var10 = -var11;
                  }
                  if (var10 > 0.0f) {
                    var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                    var7 = (int)((double)var2_int * Math.pow((double)var10, 36.0));
                    var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                  } else {
                    var8 = 0;
                    var7 = 0;
                    var6 = 0;
                  }
                  var27[var16][var9] = var6 << 24;
                  var28[var16][var9] = var7 << 24;
                  var29[var16][var9] = var8 << 24;
                }
                var9++;
              }
            }
            this.field_i = new ef[3];
            this.field_i[0] = this.field_b.a(64, (byte) -105, var27, false);
            this.field_i[1] = this.field_b.a(64, (byte) -84, var28, false);
            this.field_i[2] = this.field_b.a(64, (byte) 122, var29, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("ng.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1) {
        int var4;
        ed var5;
        ut var6;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_i == null) {
          this.field_b.a(fv.field_y, 0, true);
        } else {
          if (!param0) {
            this.field_b.a(fv.field_y, 0, true);
          } else {
            this.field_b.g(1, -118);
            this.field_b.a(param1 ^ 31584, nl.field_n);
            var6 = this.field_b.B(0);
            var6.a((byte) 79, 1024);
            this.field_b.a(ip.field_y, 28880);
            if (!this.field_g) {
              this.field_b.a((byte) -83, vi.field_v, lf.field_e);
              this.field_b.a(ta.field_a, 0, param1 ^ 20186);
              this.field_b.g(2, param1 - 20295);
              this.field_b.a((byte) -83, lf.field_e, cv.field_F);
              this.field_b.a(ta.field_a, 0, 0);
              this.field_b.a((byte) 102, 1, true, false, ta.field_a);
              this.field_b.a(fv.field_y, 0, true);
              this.field_b.a(this.field_b.field_D, param1 - 20079);
            } else {
              this.field_b.a((byte) -83, lf.field_e, cv.field_F);
              this.field_b.a((byte) -66, 0, true, false, jq.field_a);
              this.field_b.a(fv.field_y, 0, true);
            }
            this.field_b.g(0, -113);
            this.field_h = true;
          }
        }
        if (param1 != 20186) {
          var5 = (ed) null;
          this.a(105, 46, (ed) null);
        }
    }

    static {
        field_e = "No highscores";
    }
}
