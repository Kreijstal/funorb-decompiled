/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jf {
    private byte[] field_m;
    private long field_k;
    private long field_i;
    private ok field_d;
    static sb field_h;
    private byte[] field_j;
    private long field_c;
    private long field_b;
    private long field_l;
    private int field_f;
    private int field_e;
    private long field_a;
    static String field_g;

    final void a(int param0, byte[] param1) throws IOException {
        try {
          this.b(param0, param1, param1.length, 11842);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "jf.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var3 = jg.a(param0, true);
        int var4 = tk.a(-822, param0);
        if (param1) {
          field_g = (String) null;
        }
        int var5 = jg.a(param2, true);
        int var6 = tk.a(-822, param2);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    private final void d(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Bounce.field_N;
        this.field_e = 0;
        if (~this.field_b != ~this.field_l) {
          this.field_d.a(this.field_b, 20663);
          this.field_l = this.field_b;
        }
        this.field_k = this.field_b;
        while (this.field_j.length > this.field_e) {
          var2 = -this.field_e + this.field_j.length;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_d.a(this.field_j, var2, this.field_e, -1);
          if (var3 == -1) {
            break;
          }
          this.field_e = this.field_e + var3;
          this.field_l = this.field_l + (long)var3;
        }
        if (param0 != 16324) {
          this.field_k = 86L;
        }
    }

    public static void e(int param0) {
        field_g = null;
        field_h = null;
        if (param0 != -18695) {
          jf.b(false);
        }
    }

    final static int b(boolean param0) {
        if (param0) {
          field_g = (String) null;
          return 1;
        }
        return 1;
    }

    final long c(boolean param0) {
        if (!param0) {
          String var3 = (String) null;
          jf.a((byte) 94, (String[]) null, -48, (String) null);
        }
        return this.field_c;
    }

    final static String a(String param0, String[] param1, byte param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = Bounce.field_N;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (0 <= var6_int) {
              for (var5 = var6_int + 2; var3_int > var5; var5++) {
                if (kf.a(-49, param0.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(var6_int + 2, var5);
              if (!qi.a((CharSequence) ((Object) var7_ref_String), 10)) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (62 != param0.charAt(var5)) {
                continue;
              }
              var5++;
              var8 = gf.a(10, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (param1[var8].length() + var6_int - var5);
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          if (param2 != -126) {
            jf.c(94);
          }
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$0 = var6.append(param0.substring(var7));
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (kf.a(-49, param0.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!qi.a((CharSequence) ((Object) var9), 10)) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (62 != param0.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = gf.a(10, (CharSequence) ((Object) var9));
            discarded$1 = var6.append(param0.substring(var7, var8Lifetime1));
            discarded$2 = var6.append(param1[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("jf.O(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = Bounce.field_N;
        try {
          try {
            if ((long)param2 + this.field_b > this.field_c) {
              this.field_c = this.field_b + (long)param2;
            }
            if (this.field_a != -1L && (this.field_b < this.field_a ||
              (this.field_a + (long)this.field_f) < this.field_b)) {
              this.a(-1);
            }
            if (this.field_a != -1L &&
              (long)this.field_m.length + this.field_a < (long)param2 + this.field_b) {
              var5_int = (int)((long)this.field_m.length + this.field_a - this.field_b);
              cb.a(param1, param3, this.field_m, (int)(-this.field_a + this.field_b), var5_int);
              this.field_b = this.field_b + (long)var5_int;
              param3 = param3 + var5_int;
              param2 = param2 - var5_int;
              this.field_f = this.field_m.length;
              this.a(~param0);
            }
            if (param2 > this.field_m.length) {
              if (this.field_l != this.field_b) {
                this.field_d.a(this.field_b, param0 ^ 20663);
                this.field_l = this.field_b;
              }
              this.field_d.a(1, param3, param2, param1);
              this.field_l = this.field_l + (long)param2;
              if (this.field_i < this.field_l) {
                this.field_i = this.field_l;
              }
              var5_long = -1L;
              if (this.field_b >= this.field_k &&
                this.field_b < this.field_k + (long)this.field_e) {
                var5_long = this.field_b;
              } else {
                if (this.field_b <= this.field_k &&
                  this.field_b + (long)param2 > this.field_k) {
                  var5_long = this.field_k;
                }
              }
              var7 = -1L;
              if (this.field_b + (long)param2 > this.field_k &&
                this.field_b + (long)param2 <= this.field_k + (long)this.field_e) {
                var7 = this.field_b + (long)param2;
              } else {
                if (this.field_k + (long)this.field_e > this.field_b &&
                  (long)param2 + this.field_b >= this.field_k + (long)this.field_e) {
                  var7 = (long)this.field_e + this.field_k;
                }
              }
              if (var5_long > -1L &&
                var7 > var5_long) {
                var9 = (int)(-var5_long + var7);
                cb.a(param1, (int)(var5_long + ((long)param3 - this.field_b)), this.field_j, (int)(var5_long - this.field_k), var9);
              }
              this.field_b = this.field_b + (long)param2;
              return;
            }
            if (param2 > 0) {
              if (-1L == this.field_a) {
                this.field_a = this.field_b;
              }
              cb.a(param1, param3, this.field_m, (int)(-this.field_a + this.field_b), param2);
              this.field_b = this.field_b + (long)param2;
              if (this.field_b - this.field_a > (long)this.field_f) {
                this.field_f = (int)(-this.field_a + this.field_b);
              }
              return;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_l = -1L;
            throw var5;
          }
          if (param0 != 0) {
            jf.b(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_53_0 = var5_ref;
          stackIn_53_1 = new StringBuilder().append("jf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, String[] param1, int param2, String param3) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Bounce.field_N;
        try {
          if (param0 != -52) {
            jf.a(30, true, 104);
          }
          fh.field_B = he.field_p;
          if (param2 == 255) {
            stackIn_11_0 = 5579;
            stackIn_12_1 = !(13 <= cg.field_a);
            ci.field_L = r.a(stackIn_11_0, stackIn_12_1);
          } else {
            if (param2 >= 100 &&
              param2 <= 105) {
              ci.field_L = qj.a(false, param1);
              return;
            }
            ci.field_L = wb.a(param2, 1, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("jf.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void b(int param0, byte[] param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        Throwable decompiledCaughtException = null;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime1Lifetime1;
        var14 = Bounce.field_N;
        try {
          try {
            if (param2 + param0 > param1.length) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param2));
            }
            if (this.field_a != -1L &&
              this.field_b >= this.field_a &&
              this.field_a + (long)this.field_f >= this.field_b + (long)param2) {
              cb.a(this.field_m, (int)(this.field_b - this.field_a), param1, param0, param2);
              this.field_b = this.field_b + (long)param2;
              return;
            }
            var5_long = this.field_b;
            var7 = param0;
            var8 = param2;
            if (this.field_b >= this.field_k &&
              this.field_k + (long)this.field_e > this.field_b) {
              var9_int = (int)(-this.field_b + this.field_k + (long)this.field_e);
              if (var9_int > param2) {
                var9_int = param2;
              }
              cb.a(this.field_j, (int)(this.field_b - this.field_k), param1, param0, var9_int);
              param2 = param2 - var9_int;
              this.field_b = this.field_b + (long)var9_int;
              param0 = param0 + var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param2 > this.field_j.length) {
              this.field_d.a(this.field_b, 20663);
              this.field_l = this.field_b;
              while (param2 > 0) {
                var9_intLifetime1 = this.field_d.a(param1, param2, param0, -1);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_b = this.field_b + (long)var9_intLifetime1;
                this.field_l = this.field_l + (long)var9_intLifetime1;
                param2 = param2 - var9_intLifetime1;
                param0 = param0 + var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param2 > 0)) {
              this.d(param3 + 4482);
              var9_intLifetime1Lifetime1 = param2;
              if (this.field_e < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_e;
              }
              cb.a(this.field_j, 0, param1, param0, var9_intLifetime1Lifetime1);
              this.field_b = this.field_b + (long)var9_intLifetime1Lifetime1;
              param2 = param2 - var9_intLifetime1Lifetime1;
              param0 = param0 + var9_intLifetime1Lifetime1;
            }
            if (this.field_a != -1L) {
              if (this.field_b < this.field_a &&
                param2 > 0) {
                var9_intLifetime2 = param0 + (int)(-this.field_b + this.field_a);
                if (var9_intLifetime2 > param2 + param0) {
                  var9_intLifetime2 = param2 + param0;
                }
                while (param0 < var9_intLifetime2) {
                  param2--;
                  incrementValue$0 = param0;
                  param0++;
                  param1[incrementValue$0] = (byte) 0;
                  this.field_b = this.field_b + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (var5_long <= this.field_a &&
                ((long)var8 + var5_long) > this.field_a) {
                var9 = this.field_a;
              } else {
                if (this.field_a <= var5_long &&
                  var5_long < (long)this.field_f + this.field_a) {
                  var9 = var5_long;
                }
              }
              if ((this.field_a + (long)this.field_f) > var5_long &&
                this.field_a + (long)this.field_f <= (long)var8 + var5_long) {
                var11 = (long)this.field_f + this.field_a;
              } else {
                if ((var5_long + (long)var8) > this.field_a &&
                  ((long)var8 + var5_long) <= (this.field_a + (long)this.field_f)) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (var9 > -1L &&
                var9 < var11) {
                var13 = (int)(var11 - var9);
                cb.a(this.field_m, (int)(-this.field_a + var9), param1, (int)(-var5_long + var9) + var7, var13);
                if (this.field_b < var11) {
                  param2 = (int)((long)param2 - (-this.field_b + var11));
                  this.field_b = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_l = -1L;
            throw var5;
          }
          if (param3 != 11842) {
            return;
          }
          if (0 >= param2) {
            return;
          }
          throw new EOFException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_61_0 = var5_ref;
          stackIn_61_1 = new StringBuilder().append("jf.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static rg a(boolean param0) {
        if (!param0) {
          field_g = (String) null;
        }
        if (fh.field_B == wj.field_a) {
          throw new IllegalStateException();
        }
        if (fh.field_B != he.field_p) {
          return null;
        }
        fh.field_B = wj.field_a;
        return ci.field_L;
    }

    final void a(byte param0, long param1) throws IOException {
        if (param1 < 0L) {
          throw new IOException();
        }
        this.field_b = param1;
        if (param0 != 57) {
          jf.a(true);
        }
    }

    private final void a(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        int var6Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var7 = Bounce.field_N;
        if (this.field_a != (long)param0) {
          if (this.field_l != this.field_a) {
            this.field_d.a(this.field_a, 20663);
            this.field_l = this.field_a;
          }
          this.field_d.a(1, 0, this.field_f, this.field_m);
          this.field_l = this.field_l + (long)this.field_f;
          if (this.field_l > this.field_i) {
            this.field_i = this.field_l;
          }
          var2 = -1L;
          var4 = -1L;
          if (this.field_a >= this.field_k &&
            this.field_a < ((long)this.field_e + this.field_k)) {
            var2 = this.field_a;
          } else {
            if (this.field_k >= this.field_a &&
              this.field_k < ((long)this.field_f + this.field_a)) {
              var2 = this.field_k;
            }
          }
          if (this.field_k < (long)this.field_f + this.field_a &&
            this.field_k + (long)this.field_e >= (long)this.field_f + this.field_a) {
            var4 = this.field_a + (long)this.field_f;
          } else {
            if (((long)this.field_e + this.field_k) > this.field_a) {
              if (this.field_a + (long)this.field_f < this.field_k + (long)this.field_e) {
                if (var2 > -1L &&
                  var4 > var2) {
                  var6 = (int)(-var2 + var4);
                  cb.a(this.field_m, (int)(-this.field_a + var2), this.field_j, (int)(-this.field_k + var2), var6);
                }
                this.field_f = 0;
                this.field_a = -1L;
                decompiledFrameRemainder0 = false;
              }
              else {
                var4 = (long)this.field_e + this.field_k;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (var2 > -1L &&
              var4 > var2) {
              var6Lifetime1 = (int)(-var2 + var4);
              cb.a(this.field_m, (int)(-this.field_a + var2), this.field_j, (int)(-this.field_k + var2), var6Lifetime1);
            }
            this.field_f = 0;
            this.field_a = -1L;
          }
        }

    }

    final void b(int param0) throws IOException {
        if (param0 != -747969087) {
          return;
        }
        this.a(-1);
        this.field_d.b(1337);
    }

    final static void c(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        jk var4_ref_jk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        jk var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Bounce.field_N;
        try {
          qh.field_g = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, param0, 0, 65536};
          var1_int = q.field_G.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_jk = q.field_G[var3];
            var4_ref_jk.a(true);
            gk.b(var3, -1);
            var5 = var4_ref_jk.field_e + var4_ref_jk.field_n >> 1;
            var6 = var4_ref_jk.field_N + var4_ref_jk.field_H >> 1;
            var7 = var4_ref_jk.field_D + var4_ref_jk.field_R >> 1;
            var8 = qh.field_g[9] >> 2;
            var9 = qh.field_g[10] >> 2;
            var10_int = qh.field_g[11] >> 2;
            var11 = var10_int * il.field_e[5] + (var8 * il.field_e[3] + il.field_e[4] * var9) >> 14;
            var12 = il.field_e[6] * var8 + (var9 * il.field_e[7] + il.field_e[8] * var10_int) >> 14;
            var13 = var10_int * il.field_e[11] + (var9 * il.field_e[10] + il.field_e[9] * var8) >> 14;
            var2[var3] = var13 * var7 + var12 * var6 + var5 * var11 >> 16;
          }
          var3Lifetime1 = qh.field_g[9] >> 8;
          var4 = qh.field_g[10] >> 8;
          var5Lifetime1 = qh.field_g[11] >> 8;
          var6Lifetime1 = oa.field_a << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = jg.a(var6Lifetime1, true) >> 8;
          var9Lifetime1 = tk.a(-822, var6Lifetime1) >> 8;
          if (uc.field_C != -1 &&
            ll.field_y != -1) {
            var7Lifetime1 = -320 + uc.field_C;
            var8Lifetime1 = 240 - ll.field_y;
            var9Lifetime1 = -128;
          }
          var10 = 256.0 / Math.sqrt((double)(var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var13Lifetime1 * var13Lifetime1 + (var12Lifetime1 * var12Lifetime1 + var14 * var14)));
          var14 = (int)((double)var14 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          for (var15 = 0; var15 < q.field_G.length; var15++) {
            var16 = 0;
            for (var17_int = 1; q.field_G.length > var17_int; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var2[var16] = -2147483648;
            var17 = q.field_G[var16];
            gk.b(var16, -1);
            for (var18 = 0; var18 < 3; var18++) {
              il.field_e[var18] = il.field_e[var18] + li.field_e[var15][var18];
            }
            ui.a(-99, false, false, qh.field_g, il.field_e, true, var17);
            eh.a(var17, var12Lifetime1, var13Lifetime1, var7Lifetime1, var9Lifetime1, var14, var8Lifetime1, -111);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "jf.F(" + param0 + ')');
        }
    }

    jf(ok param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_k = -1L;
        this.field_f = 0;
        this.field_a = -1L;
        try {
          this.field_d = param0;
          dupTemp$0 = param0.a(126);
          this.field_i = dupTemp$0;
          this.field_c = dupTemp$0;
          this.field_m = new byte[param2];
          this.field_j = new byte[param1];
          this.field_b = 0L;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_h = new sb(3);
        field_g = "Orb points: <%0>";
    }
}
