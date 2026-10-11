/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb extends br {
    static String field_r;
    private int field_f;
    private int field_t;
    private int field_n;
    static boolean field_l;
    static int field_i;
    private int field_h;
    static String field_g;
    private int field_s;
    static boolean field_o;
    int field_m;
    private int field_q;
    private ja field_p;
    static int[] field_j;
    private int field_k;

    final static void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (ki.field_h != null && (0 > param0 ||
            vo.field_l == pi.field_a)) {
            if (param1) {
              field_g = (String) null;
            }
            if (ma.field_a.field_j == 0 &&
              cf.field_g + 10000L < bl.a((byte) 59)) {
              ma.field_a.b((byte) -35, param0);
            }
            if (0 < ma.field_a.field_j) {
              try {
                ki.field_h.a(0, -100, ma.field_a.field_j, ma.field_a.field_m);
                cf.field_g = bl.a((byte) 125);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                ak.a((byte) -121);
              }
              ma.field_a.field_j = 0;
            }
            return;
          }
          ma.field_a.field_j = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(byte param0) {
        this.field_n = this.field_q;
        if (param0 != 99) {
          pd var3 = (pd) null;
          cb.a(96, 89, 115, (pd) null);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, ja param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int var20 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var6_int = (param2 - param5 << 8) / param4.field_z;
          param3 = param3 + param4.field_r;
          var7 = var6_int * param4.field_r + (param5 << 8);
          param0 = param0 + param4.field_y;
          var8 = param3 + param0 * oo.field_b;
          var9 = 0;
          if (param1) {
            field_o = false;
          }
          var10 = param4.field_w;
          var11 = param4.field_x;
          var12 = oo.field_b - var11;
          if (oo.field_e > param0) {
            var14 = oo.field_e - param0;
            var9 = var9 + var14 * var11;
            var8 = var8 + var14 * oo.field_b;
            var10 = var10 - var14;
            param0 = oo.field_e;
          }
          var13 = 0;
          if (param3 < oo.field_f) {
            var14Lifetime1 = oo.field_f - param3;
            var13 = var13 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            param3 = oo.field_f;
            var7 = var7 + var6_int * var14Lifetime1;
            var8 = var8 + var14Lifetime1;
          }
          if (var10 + param0 > oo.field_d) {
            var10 = var10 - (-oo.field_d + (var10 + param0));
          }
          if (oo.field_g < param3 + var11) {
            var14Lifetime2 = -oo.field_g + (var11 + param3);
            var12 = var12 + var14Lifetime2;
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param0 = -var10; 0 > param0; param0++) {
              var14Lifetime3 = var7;
              for (param3 = -var11; 0 > param3; param3++) {
                var15 = var14Lifetime3 >> 8;
                var16 = -var15 + 256;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (var15 < 0) {
                  var9++;
                  var8++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param4.field_B[incrementValue$0];
                  if (var17 != 0) {
                    if (255 >= var15) {
                      var18 = oo.field_i[var8];
                      var19 = (var18 & 16711935) * var16 + var15 * (var17 & 16711935) >> 8 & 16711935;
                      oo.field_i[var8] = (tq.b(var15 * tq.b(var17, 65280) + var16 * tq.b(var18, 65280), 16711705) >> 8) + var19;
                    } else {
                      oo.field_i[var8] = var17;
                    }
                    var8++;
                  } else {
                    var8++;
                  }
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("cb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int stackIn_5_1 = 0;
        this.field_m = param2;
        this.field_h = param3;
        this.field_k = 70;
        this.field_p = new ja(this.field_k, this.field_h);
        if (!ll.field_k.c(param3 ^ 57, this.field_m)) {
          this.field_s = 0;
          this.field_n = 0;
        } else {
          this.field_s = cr.a(this.field_m, param3 - 193);
          if (ll.field_k.d(this.field_m, 53)) {
            stackIn_5_1 = this.field_s;
          } else {
            stackIn_5_1 = ll.field_k.field_t[this.field_m];
          }
          this.field_n = stackIn_5_1;
          if (this.field_s < this.field_n) {
            this.field_n = this.field_s;
          }
        }
        this.field_f = 0;
        this.field_q = this.field_n;
        this.a((byte) -117);
    }

    final void d(byte param0) {
        if (param0 != -102) {
          field_g = (String) null;
        }
        if (this.field_f > this.field_n) {
          this.field_n = this.field_n + 1;
        }
        if (this.field_s < this.field_n) {
          this.field_n = this.field_s;
        }
    }

    final static void a(String param0, int param1, String param2) {
        if (param1 != 32) {
          return;
        }
        try {
          if (h.field_L != null) {
            h.field_L.m(-7435);
          }
          b.field_c = new qm(param2, param0, false, true, true);
          wj.field_i.a((cf) (b.field_c), (byte) -110);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "cb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 0) {
          cb.a(-85);
          field_r = null;
          field_j = null;
          return;
        }
        field_r = null;
        field_j = null;
    }

    final static int b(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        if (param0 < -69) {
          return 1 + param1;
        }
        field_r = (String) null;
        return 1 + param1;
    }

    private final void a(byte param0) {
        int var2;
        ja var3;
        int var5;
        ja var4;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        g.c(this.field_p);
        var2 = 60 % ((param0 + 53) / 55);
        if (this.field_t == 0) {
          var3 = fg.field_m;
        } else {
          if (this.field_t == 1) {
            var3 = nm.field_w;
          } else {
            var3 = ol.field_n;
          }
        }
        if (this.field_m < 19) {
          var3.g(0, 0, 6707010);
          if (this.field_s == 0) {
            oo.f(5, 5, -10 + this.field_k, this.field_h - 10, 0, 96);
            pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
          } else {
            if (19 > this.field_m) {
              var4 = wa.field_b[this.field_m];
            } else {
              if (32 > this.field_m) {
                var4 = wa.field_b[26 + (this.field_m - 44)];
              } else {
                if (this.field_m > 38) {
                  var4 = wa.field_b[26 + (this.field_m - 44)];
                } else {
                  var4 = wa.field_b[-32 + (this.field_m + 19)];
                }
              }
            }
            var4.g((var3.field_x - var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
          }
        } else {
          if (this.field_m < 44) {
            if (ch.a(this.field_m, false)) {
              var3.g(0, 0, 4202528);
            }
            if (this.field_s == 0) {
              oo.f(5, 5, -10 + this.field_k, this.field_h - 10, 0, 96);
              pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
            } else {
              if (19 > this.field_m) {
                var4 = wa.field_b[this.field_m];
              } else {
                if (32 > this.field_m) {
                  var4 = wa.field_b[26 + (this.field_m - 44)];
                } else {
                  if (this.field_m > 38) {
                    var4 = wa.field_b[26 + (this.field_m - 44)];
                    var4.g((var3.field_x - var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    g.d();
                    return;
                  }
                  var4 = wa.field_b[-32 + (this.field_m + 19)];
                }
              }
              var4.g((var3.field_x - var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
            }
          } else {
            if (this.field_m <= 62) {
              var3.g(0, 0, 1922601);
              if (this.field_s == 0) {
                oo.f(5, 5, -10 + this.field_k, this.field_h - 10, 0, 96);
                pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
              } else {
                if (19 > this.field_m) {
                  var4 = wa.field_b[this.field_m];
                } else {
                  if (32 > this.field_m) {
                    var4 = wa.field_b[26 + (this.field_m - 44)];
                  } else {
                    if (this.field_m > 38) {
                      var4 = wa.field_b[26 + (this.field_m - 44)];
                    } else {
                      var4 = wa.field_b[-32 + (this.field_m + 19)];
                    }
                  }
                }
                var4.g((var3.field_x - var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
              }
            } else {
              if (!ch.a(this.field_m, false)) {
                if (this.field_s != 0) {
                  if (19 <= this.field_m) {
                    if (32 <= this.field_m &&
                      this.field_m <= 38) {
                      var4 = wa.field_b[-32 + (this.field_m + 19)];
                    } else {
                      var4 = wa.field_b[26 + (this.field_m - 44)];
                    }
                  } else {
                    var4 = wa.field_b[this.field_m];
                  }
                  var4.g((var3.field_x - var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                } else {
                  oo.f(5, 5, -10 + this.field_k, this.field_h - 10, 0, 96);
                  pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                }
              } else {
                var3.g(0, 0, 4202528);
                if (this.field_s != 0) {
                  if (19 <= this.field_m) {
                    if (32 > this.field_m) {
                      var4 = wa.field_b[26 + (this.field_m - 44)];
                    } else {
                      if (this.field_m <= 38) {
                        var4 = wa.field_b[-32 + (this.field_m + 19)];
                      } else {
                        var4 = wa.field_b[26 + (this.field_m - 44)];
                      }
                    }
                    var4.g((var3.field_x - var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    g.d();
                    return;
                  }
                  var4 = wa.field_b[this.field_m];
                  var4.g((var3.field_x - var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                } else {
                  oo.f(5, 5, -10 + this.field_k, this.field_h - 10, 0, 96);
                  pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                }
              }
            }
          }
        }
        g.d();
    }

    final void a(int param0, int param1) {
        this.field_f = this.field_n + param1;
        if (param0 != 0) {
          this.field_q = -95;
        }
    }

    public cb() {
        this.field_k = 70;
        this.field_h = 70;
        this.field_p = new ja(this.field_k, this.field_h);
    }

    final static void a(int param0, int param1, int param2, pd param3) {
        try {
          e.field_a = param1;
          if (param2 != -8388) {
            ja var5 = (ja) null;
            cb.a(97, false, 53, -73, (ja) null, -43);
          }
          ic.field_g = param0;
          qf.field_c = param3;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "cb.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = false;
        field_g = "RuneScape clan";
        field_r = "Powerups with this modifier will work even on enemy zombies.";
        field_j = new int[]{2, 4};
        field_o = true;
    }
}
