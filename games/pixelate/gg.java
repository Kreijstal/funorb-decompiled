/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends jp {
    private kj field_g;
    static String field_v;
    private rn field_y;
    private rf field_i;
    private int field_n;
    private int field_m;
    private int field_f;
    static char[] field_h;
    private byte[] field_e;
    static int[] field_z;
    private nl field_j;
    private gm field_r;
    private gn field_o;
    private byte[] field_s;
    private rn field_u;
    private bb field_w;
    private boolean field_q;
    private boolean field_k;
    private bb field_l;
    private int field_x;
    private long field_t;
    private boolean field_p;

    final byte[] a(int param0, int param1) {
        gn var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 18 / ((param1 - 33) / 43);
          var3 = this.a(param0, 0, true);
          if (var3 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = var3.h(0);
          var3.c(2779);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "gg.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void f(byte param0) {
        gn discarded$0 = null;
        gn discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        fa var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.field_w == null) {
            return;
          }
          if (param0 != 29) {
            field_h = (char[]) null;
          }
          if (null == this.a((byte) 36)) {
            return;
          }
          var2 = this.field_l.c(param0 + 1504642244);
          while (var2 != null) {
            var3 = (int)var2.field_e;
            if (var3 >= 0) {
              if (var3 < this.field_g.field_b) {
                if (this.field_g.field_h[var3] == 0) {
                  var2.c(2779);
                } else {
                  if (this.field_s[var3] == 0) {
                    discarded$0 = this.a(var3, 1, true);
                  }
                  if (this.field_s[var3] == -1) {
                    discarded$1 = this.a(var3, 2, true);
                  }
                  if (1 == this.field_s[var3]) {
                    var2.c(2779);
                  }
                }
              } else {
                var2.c(2779);
              }
            } else {
              var2.c(2779);
            }
            var2 = this.field_l.f(1504642273);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "gg.H(" + param0 + ')');
        }
    }

    private final gn a(int param0, int param1, boolean param2) {
        gn discarded$0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_78_0 = null;
        Object stackIn_110_0 = null;
        Object stackIn_118_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        gn var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Pixelate.field_H ? 1 : 0;
        try {
          var12 = (gn) (this.field_j.a(-25484, (long)param0));
          var4 = var12;
          if (!param2) {
            discarded$0 = this.a(37, -122, true);
          }
          if (var12 != null &&
            0 == param1 &&
            !var12.field_t &&
            var12.field_v) {
            var12.c(2779);
            var4 = null;
          }
          if (var4 == null) {
            if (0 == param1) {
              if (this.field_y != null &&
                this.field_s[param0] != -1) {
                var4 = this.field_r.a(param0, this.field_y, 116);
              } else {
                if (this.field_i.a(20)) {
                  return null;
                }
                var4 = this.field_i.a((byte) -31, this.field_m, true, param0, (byte) 2);
              }
            } else {
              if (1 == param1) {
                if (null == this.field_y) {
                  throw new RuntimeException();
                }
                var4 = this.field_r.a(param0, 3, this.field_y);
              } else {
                if (2 != param1) {
                  throw new RuntimeException();
                }
                if (this.field_y == null) {
                  throw new RuntimeException();
                }
                if (this.field_s[param0] != -1) {
                  throw new RuntimeException();
                }
                if (this.field_i.d((byte) 86)) {
                  return null;
                }
                var4 = this.field_i.a((byte) -31, this.field_m, false, param0, (byte) 2);
              }
            }
            this.field_j.a((long)param0, 127, (fa) (var4));
          }
          if (((gn) (var4)).field_v) {
            stackIn_40_0 = null;
            return (gn) (stackIn_40_0);
          }
          var18 = ((gn) (var4)).h(0);
          var13 = var18;
          var5 = var13;
          if (var4 instanceof cg) {
            try {
              if (var5 != null &&
                var18.length > 2) {
                ra.field_h.reset();
                ra.field_h.update(var5, 0, -2 + var18.length);
                var6_int = (int)ra.field_h.getValue();
                if (var6_int != this.field_g.field_k[param0]) {
                  throw new RuntimeException();
                }
                if (this.field_g.field_d != null &&
                  null != this.field_g.field_d[param0]) {
                  var30 = this.field_g.field_d[param0];
                  var29 = db.a(var5, 0, 1761872464, -2 + var18.length);
                  var11 = 0;
                  var9 = var11;
                  while (64 > var11) {
                    if (~var29[var11] != ~var30[var11]) {
                      throw new RuntimeException();
                    }
                    var11++;
                  }
                }
                var7 = (65280 & var5[-2 + var18.length] << 8) + (255 & var5[var18.length - 1]);
                if (var7 != (65535 & this.field_g.field_a[param0])) {
                  throw new RuntimeException();
                }
                if (this.field_s[param0] != 1) {
                  if (0 != this.field_s[param0]) {
                  }
                  this.field_s[param0] = (byte) 1;
                }
                if (!((gn) (var4)).field_t) {
                  ((gn) (var4)).c(2779);
                }
                stackIn_110_0 = var4;
                return (gn) (stackIn_110_0);
              }
              throw new RuntimeException();
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              this.field_s[param0] = (byte)-1;
              ((gn) (var4)).c(2779);
              if (((gn) (var4)).field_t) {
                if (this.field_i.a(20)) {
                  return null;
                }
                var4 = this.field_i.a((byte) -31, this.field_m, true, param0, (byte) 2);
                this.field_j.a((long)param0, 127, (fa) (var4));
              }
              stackIn_118_0 = null;
              return (gn) (stackIn_118_0);
            }
          }
          try {
            if (var5 != null &&
              var18.length > 2) {
              ra.field_h.reset();
              ra.field_h.update(var5, 0, -2 + var18.length);
              var6_int = (int)ra.field_h.getValue();
              if (var6_int != this.field_g.field_k[param0]) {
                throw new RuntimeException();
              }
              if (null != this.field_g.field_d &&
                null != this.field_g.field_d[param0]) {
                var28 = this.field_g.field_d[param0];
                var27 = db.a(var5, 0, 1761872464, -2 + var18.length);
                for (var9 = 0; var9 < 64; var9++) {
                  if (var27[var9] != var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              this.field_i.field_h = 0;
              this.field_i.field_m = 0;
            } else {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            this.field_i.e((byte) 0);
            ((gn) (var4)).c(2779);
            if (!((gn) (var4)).field_t) {
              return null;
            }
            if (this.field_i.a(20)) {
              return null;
            }
            var4 = this.field_i.a((byte) -31, this.field_m, true, param0, (byte) 2);
            this.field_j.a((long)param0, 127, (fa) (var4));
            stackIn_68_0 = null;
            return (gn) (stackIn_68_0);
          }
          var5[var18.length - 2] = (byte)(this.field_g.field_a[param0] >>> 8);
          var5[-1 + var18.length] = (byte)this.field_g.field_a[param0];
          if (this.field_y != null) {
            this.field_r.a(param0, 45, this.field_y, var18);
            if (this.field_s[param0] != 1) {
              this.field_s[param0] = (byte) 1;
            }
          }
          if (!((gn) (var4)).field_t) {
            ((gn) (var4)).c(2779);
          }
          stackIn_78_0 = var4;
          return (gn) (stackIn_78_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) (var4), "gg.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(int param0, int param1) {
        gn var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 8192) {
            gg.d((byte) 22);
          }
          var3 = (gn) (this.field_j.a(-25484, (long)param0));
          if (var3 == null) {
            stackIn_6_0 = 0;
            return stackIn_6_0;
          }
          stackIn_4_0 = var3.g(param1 ^ -8303);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "gg.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        if (null == this.field_y) {
          return;
        }
        try {
          this.field_q = param0 ? true : false;
          if (this.field_w == null) {
            this.field_w = new bb();
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gg.J(" + param0 + ')');
        }
    }

    final static void a(boolean param0, String[][] param1, byte[] param2, fm param3, String[] param4, byte[] param5, tf[][] param6, int param7, int param8, tf[][] param9, fm param10, int param11, String[][] param12, fm param13, int[] param14) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        try {
          ro.a(param0, param6, param8, -15690, param10, param4, param14, param1, (hh[]) null, param7, (int[]) null, param2, param12, param3, param9, param5, param13);
          if (param11 <= 6) {
            gg.d((byte) 43);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_6_0 = var15;
          stackIn_6_1 = new StringBuilder().append("gg.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          stackIn_14_0 = stackIn_11_0;
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_15_0 = stackIn_14_0;
            stackIn_15_2 = "null";
          } else {
            stackIn_15_0 = stackIn_11_0;
            stackIn_15_2 = "{...}";
          }
          stackIn_18_0 = stackIn_15_0;
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_19_0 = stackIn_18_0;
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = stackIn_15_0;
            stackIn_19_2 = "{...}";
          }
          stackIn_22_0 = stackIn_19_0;
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_23_0 = stackIn_22_0;
            stackIn_23_2 = "null";
          } else {
            stackIn_23_0 = stackIn_19_0;
            stackIn_23_2 = "{...}";
          }
          stackIn_26_0 = stackIn_23_0;
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param6 == null) {
            stackIn_27_0 = stackIn_26_0;
            stackIn_27_2 = "null";
          } else {
            stackIn_27_0 = stackIn_23_0;
            stackIn_27_2 = "{...}";
          }
          stackIn_30_0 = stackIn_27_0;
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_31_0 = stackIn_30_0;
            stackIn_31_2 = "null";
          } else {
            stackIn_31_0 = stackIn_27_0;
            stackIn_31_2 = "{...}";
          }
          stackIn_34_0 = stackIn_31_0;
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param10 == null) {
            stackIn_35_0 = stackIn_34_0;
            stackIn_35_2 = "null";
          } else {
            stackIn_35_0 = stackIn_31_0;
            stackIn_35_2 = "{...}";
          }
          stackIn_38_0 = stackIn_35_0;
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_39_0 = stackIn_38_0;
            stackIn_39_2 = "null";
          } else {
            stackIn_39_0 = stackIn_35_0;
            stackIn_39_2 = "{...}";
          }
          stackIn_42_0 = stackIn_39_0;
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param13 == null) {
            stackIn_43_0 = stackIn_42_0;
            stackIn_43_2 = "null";
          } else {
            stackIn_43_0 = stackIn_39_0;
            stackIn_43_2 = "{...}";
          }
          stackIn_46_0 = stackIn_43_0;
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param14 == null) {
            stackIn_47_0 = stackIn_46_0;
            stackIn_47_2 = "null";
          } else {
            stackIn_47_0 = stackIn_43_0;
            stackIn_47_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    final void b(int param0) {
        gn discarded$3 = null;
        gn discarded$2 = null;
        gn discarded$1 = null;
        gn discarded$0 = null;
        gn discarded$4 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        gn var2_ref = null;
        RuntimeException var2_ref2 = null;
        fa var3 = null;
        int var4 = 0;
        int var5 = 0;
        fa var6 = null;
        fa var7 = null;
        fa var3Lifetime1;
        int var2_intLifetime1;
        int var4Lifetime1;
        var2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_w != null) {
            if (null == this.a((byte) 36)) {
              return;
            }
            if (this.field_k) {
              var2_int = 1;
              var3 = this.field_w.c(1504642273);
              while (var3 != null) {
                var4 = (int)var3.field_e;
                if (0 == this.field_s[var4]) {
                  discarded$3 = this.a(var4, 1, true);
                }
                if (this.field_s[var4] != 0) {
                  var3.c(2779);
                } else {
                  var2_int = 0;
                }
                var3 = this.field_w.f(1504642273);
              }
              while (this.field_g.field_h.length > this.field_x) {
                if (0 == this.field_g.field_h[this.field_x]) {
                  this.field_x = this.field_x + 1;
                  continue;
                }
                if (250 > this.field_r.field_c) {
                  if (this.field_s[this.field_x] == 0) {
                    discarded$2 = this.a(this.field_x, 1, true);
                  }
                  if (0 == this.field_s[this.field_x]) {
                    var6 = new fa();
                    var6.field_e = (long)this.field_x;
                    this.field_w.a(22125, var6);
                    var2_int = 0;
                  }
                  this.field_x = this.field_x + 1;
                  continue;
                }
                var2_int = 0;
                break;
              }
              if ((var2_int != 0)) {
                this.field_k = false;
                this.field_x = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_q) {
                var2_intLifetime1 = 1;
                var3Lifetime1 = this.field_w.c(param0 ^ 1504642273);
                while (var3Lifetime1 != null) {
                  var4Lifetime1 = (int)var3Lifetime1.field_e;
                  if (1 != this.field_s[var4Lifetime1]) {
                    discarded$1 = this.a(var4Lifetime1, 2, true);
                  }
                  if (this.field_s[var4Lifetime1] != 1) {
                    var2_intLifetime1 = 0;
                  } else {
                    var3Lifetime1.c(param0 ^ 2779);
                  }
                  var3Lifetime1 = this.field_w.f(1504642273);
                }
                while (this.field_x < this.field_g.field_h.length) {
                  if (this.field_g.field_h[this.field_x] == 0) {
                    this.field_x = this.field_x + 1;
                    continue;
                  }
                  if (!this.field_i.d((byte) 97)) {
                    if (1 != this.field_s[this.field_x]) {
                      discarded$0 = this.a(this.field_x, 2, true);
                    }
                    if (this.field_s[this.field_x] != 1) {
                      var7 = new fa();
                      var7.field_e = (long)this.field_x;
                      this.field_w.a(22125, var7);
                      var2_intLifetime1 = 0;
                    }
                    this.field_x = this.field_x + 1;
                    continue;
                  }
                  var2_intLifetime1 = 0;
                  break;
                }
                if ((var2_intLifetime1 != 0)) {
                  this.field_x = 0;
                  this.field_q = false;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_w = null;
              }
            }
          }
          if (param0 != 0) {
            discarded$4 = this.a(112, 27, true);
          }
          if (this.field_p &&
            hm.a(64) >= this.field_t) {
            var2_ref = (gn) (this.field_j.a((byte) -99));
            while (var2_ref != null) {
              if (!var2_ref.field_v) {
                if (!var2_ref.field_x) {
                  var2_ref.field_x = true;
                } else {
                  if (!var2_ref.field_t) {
                    throw new RuntimeException();
                  }
                  var2_ref.c(param0 + 2779);
                }
              }
              var2_ref = (gn) (this.field_j.a(-123));
            }
            this.field_t = 1000L + hm.a(64);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref2), "gg.O(" + param0 + ')');
        }
    }

    final kj a(byte param0) {
        kj stackIn_7_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_45_0 = null;
        kj stackIn_53_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != 36) {
            this.b(-6, -35);
          }
          if (this.field_g != null) {
            stackIn_7_0 = this.field_g;
            return stackIn_7_0;
          }
          if (this.field_o == null) {
            if (this.field_i.a(20)) {
              return null;
            }
            this.field_o = (gn) ((Object) this.field_i.a((byte) -31, 255, true, this.field_m, (byte) 0));
          }
          if (this.field_o.field_v) {
            stackIn_18_0 = null;
            return (kj) (stackIn_18_0);
          }
          var7 = this.field_o.h(0);
          var6 = var7;
          var5 = var6;
          var2 = var5;
          if (!(this.field_o instanceof cg)) {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_g = new kj(var7, this.field_n, this.field_e);
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
              this.field_i.e((byte) 0);
              this.field_g = null;
              if (this.field_i.a(param0 ^ 48)) {
                this.field_o = null;
              } else {
                this.field_o = (gn) ((Object) this.field_i.a((byte) -31, 255, true, this.field_m, (byte) 0));
              }
              stackIn_45_0 = null;
              return (kj) (stackIn_45_0);
            }
            if (null != this.field_u) {
              this.field_r.a(this.field_m, 93, this.field_u, var7);
            }
          } else {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_g = new kj(var7, this.field_n, this.field_e);
              if (this.field_g.field_c != this.field_f) {
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = decompiledCaughtException;
              this.field_g = null;
              if (this.field_i.a(20)) {
                this.field_o = null;
              } else {
                this.field_o = (gn) ((Object) this.field_i.a((byte) -31, 255, true, this.field_m, (byte) 0));
              }
              stackIn_33_0 = null;
              return (kj) (stackIn_33_0);
            }
          }
          if (this.field_y != null) {
            this.field_s = new byte[this.field_g.field_b];
          }
          this.field_o = null;
          stackIn_53_0 = this.field_g;
          return stackIn_53_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "gg.C(" + param0 + ')');
        }
    }

    public static void e(byte param0) {
        try {
          field_h = null;
          if (param0 != 45) {
            gg.a(true, (String[][]) null, (byte[]) null, (fm) null, (String[]) null, (byte[]) null, (tf[][]) null, -91, 127, (tf[][]) null, (fm) null, 112, (String[][]) null, (fm) null, (int[]) null);
          }
          field_z = null;
          field_v = null;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gg.N(" + param0 + ')');
        }
    }

    final static id d(byte param0) {
        id stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (tm.field_X == wm.field_a) {
            throw new IllegalStateException();
          }
          if (param0 != 52) {
            gg.e((byte) -37);
          }
          if (tm.field_X != h.field_N) {
            stackIn_12_0 = null;
            return (id) (stackIn_12_0);
          }
          tm.field_X = wm.field_a;
          stackIn_10_0 = v.field_b;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "gg.K(" + param0 + ')');
        }
    }

    final static void c(byte param0) {
        jg.field_K = null;
        if (param0 != 24) {
          return;
        }
        try {
          a.field_L = null;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gg.M(" + param0 + ')');
        }
    }

    gg(int param0, rn param1, rn param2, rf param3, gm param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_j = new nl(16);
        this.field_x = 0;
        this.field_l = new bb();
        this.field_t = 0L;
        try {
          this.field_y = param1;
          this.field_m = param0;
          if (this.field_y == null) {
            this.field_k = false;
          } else {
            this.field_k = true;
            this.field_w = new bb();
          }
          this.field_u = param2;
          this.field_i = param3;
          this.field_n = param5;
          this.field_e = param6;
          stackIn_7_1 = (param8);
          this.field_p = stackIn_7_1;
          this.field_r = param4;
          this.field_f = param7;
          if (this.field_u != null) {
            this.field_o = (gn) ((Object) this.field_r.a(this.field_m, this.field_u, 118));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("gg.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_15_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_15_0;
            stackIn_20_2 = "{...}";
          }
          stackIn_23_0 = stackIn_20_0;
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_24_0 = stackIn_23_0;
            stackIn_24_2 = "null";
          } else {
            stackIn_24_0 = stackIn_20_0;
            stackIn_24_2 = "{...}";
          }
          stackIn_27_0 = stackIn_24_0;
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param4 == null) {
            stackIn_28_0 = stackIn_27_0;
            stackIn_28_2 = "null";
          } else {
            stackIn_28_0 = stackIn_24_0;
            stackIn_28_2 = "{...}";
          }
          stackIn_31_0 = stackIn_28_0;
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_32_0 = stackIn_31_0;
            stackIn_32_2 = "null";
          } else {
            stackIn_32_0 = stackIn_28_0;
            stackIn_32_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_v = "<%0> has entered another game.";
        field_h = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_z = new int[32];
    }
}
