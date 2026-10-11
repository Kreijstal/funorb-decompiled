/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends hf {
    private wb field_i;
    private int field_p;
    private byte[] field_w;
    private byte[] field_g;
    static String[] field_r;
    private int field_n;
    static double field_u;
    private e field_z;
    private int field_j;
    static dg field_q;
    private dl field_B;
    private kl field_C;
    private si field_t;
    static eg field_A;
    private dl field_f;
    private na field_k;
    static java.awt.Canvas field_y;
    private ng field_l;
    private int field_o;
    static int field_m;
    private boolean field_D;
    private boolean field_d;
    static String field_s;
    static long field_x;
    private ng field_v;
    private boolean field_e;
    private long field_h;

    final void b(int param0) {
        int var3 = 0;
        si discarded$0 = null;
        si discarded$1 = null;
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (null == this.field_v) {
          return;
        }
        if (this.a(false) == null) {
          return;
        }
        if (param0 > -68) {
          this.a(true);
        }
        kd var2 = this.field_l.a(true);
        while (var2 != null) {
          var3 = (int)var2.field_d;
          if (var3 < 0) {
            var2.b((byte) -122);
          } else {
            if (var3 >= this.field_z.field_d) {
              var2.b((byte) -122);
            } else {
              if (this.field_z.field_m[var3] == 0) {
                var2.b((byte) -122);
              } else {
                if (this.field_w[var3] == 0) {
                  discarded$0 = this.a((byte) -128, 1, var3);
                }
                if (this.field_w[var3] == -1) {
                  discarded$1 = this.a((byte) -91, 2, var3);
                }
                if (1 == this.field_w[var3]) {
                  var2.b((byte) -118);
                }
              }
            }
          }
          var2 = this.field_l.f(2);
        }
    }

    final void b(boolean param0) {
        si discarded$1 = null;
        si discarded$0 = null;
        si discarded$3 = null;
        si discarded$2 = null;
        int var2_int;
        si var2;
        kd var3;
        int var4;
        int var5;
        kd var6;
        kd var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        kd var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (null != this.field_v) {
          if (null == this.a(false)) {
            return;
          }
          if (this.field_D) {
            var2_int = 1;
            var3 = this.field_v.a(true);
            while (var3 != null) {
              var4 = (int)var3.field_d;
              if (this.field_w[var4] == 0) {
                discarded$1 = this.a((byte) -93, 1, var4);
              }
              if (this.field_w[var4] == 0) {
                var2_int = 0;
              } else {
                var3.b((byte) -116);
              }
              var3 = this.field_v.f(2);
            }
            while (this.field_o < this.field_z.field_m.length) {
              if (this.field_z.field_m[this.field_o] == 0) {
                this.field_o = this.field_o + 1;
                continue;
              }
              if (this.field_C.field_c < 250) {
                if (this.field_w[this.field_o] == 0) {
                  discarded$0 = this.a((byte) -88, 1, this.field_o);
                }
                if (this.field_w[this.field_o] == 0) {
                  var7 = new kd();
                  var7.field_d = (long)this.field_o;
                  var2_int = 0;
                  this.field_v.b(123, var7);
                }
                this.field_o = this.field_o + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_o = 0;
              this.field_D = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_d) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_v.a(true);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_d;
                if (this.field_w[var4Lifetime1] != 1) {
                  discarded$3 = this.a((byte) -56, 2, var4Lifetime1);
                }
                if (this.field_w[var4Lifetime1] == 1) {
                  var3Lifetime1.b((byte) -128);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_v.f(2);
              }
              while (this.field_z.field_m.length > this.field_o) {
                if (0 == this.field_z.field_m[this.field_o]) {
                  this.field_o = this.field_o + 1;
                  continue;
                }
                if (!this.field_i.a(9172)) {
                  if (this.field_w[this.field_o] != 1) {
                    discarded$2 = this.a((byte) -25, 2, this.field_o);
                  }
                  if (this.field_w[this.field_o] != 1) {
                    var6 = new kd();
                    var6.field_d = (long)this.field_o;
                    this.field_v.b(105, var6);
                    var2_intLifetime1 = 0;
                  }
                  this.field_o = this.field_o + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_o = 0;
                this.field_d = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_v = null;
            }
          }
        }
        if (this.field_e &&
          this.field_h <= rf.c(0)) {
          var2 = (si) (this.field_k.c((byte) -120));
          while (var2 != null) {
            if (!var2.field_v) {
              if (var2.field_r) {
                if (!var2.field_p) {
                  throw new RuntimeException();
                }
                var2.b((byte) -122);
              } else {
                var2.field_r = true;
              }
            }
            var2 = (si) (this.field_k.a((byte) -91));
          }
          this.field_h = 1000L + rf.c(0);
        }
        if (param0) {
          this.a(15, 40);
        }
    }

    final int a(int param0, int param1) {
        si var3 = (si) (this.field_k.a((long)param0, (byte) 96));
        if (var3 != null) {
          return var3.c((byte) 16);
        }
        if (param1 != 1215) {
          return -35;
        }
        return 0;
    }

    final void c(int param0) {
        if (null == this.field_B) {
          return;
        }
        if (param0 != 11002) {
          this.field_v = (ng) null;
        }
        this.field_d = true;
        if (this.field_v == null) {
          this.field_v = new ng();
        }
    }

    final e a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (this.field_z != null) {
          return this.field_z;
        }
        if (null == this.field_t) {
          if (this.field_i.e(20)) {
            return null;
          }
          this.field_t = (si) ((Object) this.field_i.a(5, 255, this.field_j, (byte) 0, true));
        }
        if (this.field_t.field_v) {
          return null;
        }
        var7 = this.field_t.d((byte) -125);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (this.field_t instanceof fj) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_z = new e(var7, this.field_p, this.field_g);
            if (this.field_z.field_s != this.field_n) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_z = null;
            if (this.field_i.e(20)) {
              this.field_t = null;
            } else {
              this.field_t = (si) ((Object) this.field_i.a(5, 255, this.field_j, (byte) 0, true));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_z = new e(var7, this.field_p, this.field_g);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_i.c(-28488);
            this.field_z = null;
            if (this.field_i.e(20)) {
              this.field_t = null;
            } else {
              this.field_t = (si) ((Object) this.field_i.a(5, 255, this.field_j, (byte) 0, true));
            }
            return null;
          }
          if (null != this.field_f) {
            this.field_C.a(var7, this.field_j, 1, this.field_f);
          }
        }
        if (null != this.field_B) {
          this.field_w = new byte[this.field_z.field_d];
        }
        if (param0) {
          field_m = 43;
        }
        this.field_t = null;
        return this.field_z;
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 < 121) {
            field_s = (String) null;
          }
          var5 = bd.field_l;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1_ref), "ug.L(" + param0 + ')');
        }
    }

    final static wj a(sh param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        wj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            field_q = (dg) null;
          }
          var4 = param0.a(param1, -117);
          var3 = var4;
          if (var4 == null) {
            return null;
          }
          stackIn_6_0 = new wj(var4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ug.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final byte[] a(int param0, boolean param1) {
        si var3 = this.a((byte) -3, 0, param0);
        if (var3 == null) {
          return null;
        }
        if (!param1) {
          this.field_e = true;
        }
        byte[] var4 = var3.d((byte) -106);
        var3.b((byte) -116);
        return var4;
    }

    private final si a(byte param0, int param1, int param2) {
        Object stackIn_60_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        si var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        var12 = (si) (this.field_k.a((long)param2, (byte) 107));
        var4 = var12;
        if (var12 != null &&
          0 == param1 &&
          !var12.field_p &&
          var12.field_v) {
          var12.b((byte) -116);
          var4 = null;
        }
        if (var4 == null) {
          if (param1 == 0) {
            if (null != this.field_B &&
              this.field_w[param2] != -1) {
              var4 = this.field_C.a(this.field_B, (byte) -6, param2);
            } else {
              if (this.field_i.e(20)) {
                return null;
              }
              var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, true);
            }
          } else {
            if (param1 != 1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (this.field_B == null) {
                throw new RuntimeException();
              }
              if (-1 != this.field_w[param2]) {
                throw new RuntimeException();
              }
              if (this.field_i.a(9172)) {
                return null;
              }
              var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, false);
            } else {
              if (null == this.field_B) {
                throw new RuntimeException();
              }
              var4 = this.field_C.a(param2, this.field_B, 3);
            }
          }
          this.field_k.a((kd) (var4), (byte) -114, (long)param2);
        }
        if (param0 >= 0) {
          ug.a((byte) -68);
        }
        if (((si) (var4)).field_v) {
          return null;
        }
        var18 = ((si) (var4)).d((byte) 123);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof fj) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              uh.field_v.reset();
              uh.field_v.update(var5, 0, var18.length - 2);
              var6_int = (int)uh.field_v.getValue();
              if (var6_int != this.field_z.field_r[param2]) {
                throw new RuntimeException();
              }
              if (this.field_z.field_o != null &&
                null != this.field_z.field_o[param2]) {
                var27 = this.field_z.field_o[param2];
                var28 = si.a(0, var5, -99, var18.length - 2);
                for (var9 = 0; 64 > var9; var9++) {
                  if (var27[var9] != var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = ((var5[var18.length - 2] & 255) << 8) + (255 & var5[-1 + var18.length]);
              if (var7 != (this.field_z.field_t[param2] & 65535)) {
                throw new RuntimeException();
              }
              if (1 != this.field_w[param2]) {
                if (this.field_w[param2] == 0) {
                }
                this.field_w[param2] = (byte) 1;
              }
              if (!((si) (var4)).field_p) {
                ((si) (var4)).b((byte) -128);
              }
              stackIn_60_0 = var4;
              return (si) (stackIn_60_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_w[param2] = (byte)-1;
            ((si) (var4)).b((byte) -117);
            if (!((si) (var4)).field_p) {
              return null;
            }
            if (this.field_i.e(20)) {
              return null;
            }
            var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, true);
            this.field_k.a((kd) (var4), (byte) -92, (long)param2);
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            uh.field_v.reset();
            uh.field_v.update(var5, 0, -2 + var18.length);
            var6_int = (int)uh.field_v.getValue();
            if (var6_int != this.field_z.field_r[param2]) {
              throw new RuntimeException();
            }
            if (null != this.field_z.field_o &&
              null != this.field_z.field_o[param2]) {
              var30 = this.field_z.field_o[param2];
              var29 = si.a(0, var5, -121, var18.length - 2);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (var29[var11] != var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_i.field_p = 0;
            this.field_i.field_j = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_i.c(-28488);
          ((si) (var4)).b((byte) -121);
          if (!((si) (var4)).field_p) {
            return null;
          }
          if (!this.field_i.e(20)) {
            var4 = this.field_i.a(5, this.field_j, param2, (byte) 2, true);
            this.field_k.a((kd) (var4), (byte) -75, (long)param2);
          }
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_z.field_t[param2] >>> 8);
        var5[var18.length - 1] = (byte)this.field_z.field_t[param2];
        if (this.field_B != null) {
          this.field_C.a(var18, param2, 1, this.field_B);
          if (this.field_w[param2] != 1) {
            this.field_w[param2] = (byte) 1;
          }
        }
        if (!((si) (var4)).field_p) {
          ((si) (var4)).b((byte) -128);
        }
        return (si) (var4);
    }

    public static void d(int param0) {
        field_s = null;
        field_r = null;
        field_A = null;
        field_y = null;
        if (param0 != 64) {
          field_y = (java.awt.Canvas) null;
        }
        field_q = null;
    }

    ug(int param0, dl param1, dl param2, wb param3, kl param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_k = new na(16);
        this.field_o = 0;
        this.field_l = new ng();
        this.field_h = 0L;
        try {
          this.field_j = param0;
          this.field_B = param1;
          if (this.field_B == null) {
            this.field_D = false;
          } else {
            this.field_D = true;
            this.field_v = new ng();
          }
          this.field_i = param3;
          this.field_n = param7;
          this.field_f = param2;
          this.field_g = param6;
          this.field_p = param5;
          stackIn_7_1 = (param8);
          this.field_e = stackIn_7_1;
          this.field_C = param4;
          if (null != this.field_f) {
            this.field_t = (si) ((Object) this.field_C.a(this.field_f, (byte) -6, this.field_j));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("ug.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_r = new String[16];
        field_u = 0.0;
        field_q = new dg();
        field_m = 0;
        field_s = "en-gb";
    }
}
