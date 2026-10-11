/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nh {
    private long field_b;
    private long field_k;
    private long field_n;
    private long field_j;
    private long field_e;
    private hf field_h;
    private int field_m;
    private byte[] field_g;
    private long field_o;
    private byte[] field_d;
    private int field_c;
    static qm field_i;
    static boolean field_a;
    static char[] field_l;
    static String field_f;

    public static void a(byte param0) {
        field_f = null;
        field_l = null;
        if (param0 != -73) {
          return;
        }
        field_i = null;
    }

    final void a(long param0, byte param1) throws IOException {
        if (param0 >= 0L) {
          this.field_j = param0;
          if (param1 != -109) {
            nh.a((byte) 91);
          }
          return;
        }
        throw new IOException();
    }

    private final void b(byte param0) throws IOException {
        int var2;
        long var3;
        long var5;
        int var7;
        int var8;
        var8 = client.field_A ? 1 : 0;
        var2 = 75 / ((param0 + 55) / 40);
        if (this.field_e != -1L) {
          if (~this.field_e != ~this.field_b) {
            this.field_h.a(this.field_e, 80);
            this.field_b = this.field_e;
          }
          this.field_h.a(this.field_d, 117, 0, this.field_c);
          this.field_b = this.field_b + (long)this.field_c;
          if (this.field_k < this.field_b) {
            this.field_k = this.field_b;
          }
          var3 = -1L;
          if (this.field_e >= this.field_o &&
            this.field_e < (this.field_o + (long)this.field_m)) {
            var3 = this.field_e;
          } else {
            if (this.field_e <= this.field_o &&
              ((long)this.field_c + this.field_e) > this.field_o) {
              var3 = this.field_o;
            }
          }
          var5 = -1L;
          if (this.field_o < ((long)this.field_c + this.field_e) &&
            (long)this.field_m + this.field_o >= (long)this.field_c + this.field_e) {
            var5 = this.field_e + (long)this.field_c;
          } else {
            if ((long)this.field_m + this.field_o > this.field_e &&
              this.field_o + (long)this.field_m <= this.field_e + (long)this.field_c) {
              var5 = this.field_o + (long)this.field_m;
            }
          }
          if (-1L < var3 &&
            var3 < var5) {
            var7 = (int)(var5 - var3);
            an.a(this.field_d, (int)(-this.field_e + var3), this.field_g, (int)(-this.field_o + var3), var7);
          }
          this.field_e = -1L;
          this.field_c = 0;
        }
    }

    final long b(int param0) {
        int var2 = 93 / ((-25 - param0) / 62);
        return this.field_n;
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        this.field_m = param0;
        if (this.field_b != this.field_j) {
          this.field_h.a(this.field_j, 123);
          this.field_b = this.field_j;
        }
        this.field_o = this.field_j;
        while (this.field_m < this.field_g.length) {
          var2 = -this.field_m + this.field_g.length;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_h.a(this.field_g, (byte) -103, this.field_m, var2);
          if (-1 == var3) {
            break;
          }
          this.field_m = this.field_m + var3;
          this.field_b = this.field_b + (long)var3;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
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
        var14 = client.field_A ? 1 : 0;
        try {
          try {
            if (param2 != 741) {
              nh.a((byte) 18, 18);
            }
            if (param1.length < param0 + param3) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param3));
            }
            if (this.field_e != -1L &&
              this.field_j >= this.field_e &&
              this.field_j + (long)param3 <= (long)this.field_c + this.field_e) {
              an.a(this.field_d, (int)(-this.field_e + this.field_j), param1, param0, param3);
              this.field_j = this.field_j + (long)param3;
              return;
            }
            var5_long = this.field_j;
            var7 = param0;
            var8 = param3;
            if (this.field_j >= this.field_o &&
              this.field_j < (long)this.field_m + this.field_o) {
              var9_int = (int)((long)this.field_m + (-this.field_j + this.field_o));
              if (param3 < var9_int) {
                var9_int = param3;
              }
              an.a(this.field_g, (int)(this.field_j - this.field_o), param1, param0, var9_int);
              this.field_j = this.field_j + (long)var9_int;
              param3 = param3 - var9_int;
              param0 = param0 + var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param3 > this.field_g.length) {
              this.field_h.a(this.field_j, 23);
              this.field_b = this.field_j;
              while (0 < param3) {
                var9_intLifetime1 = this.field_h.a(param1, (byte) -38, param0, param3);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_b = this.field_b + (long)var9_intLifetime1;
                param3 = param3 - var9_intLifetime1;
                param0 = param0 + var9_intLifetime1;
                this.field_j = this.field_j + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param3 > 0)) {
              this.a(0);
              var9_intLifetime1Lifetime1 = param3;
              if (this.field_m < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_m;
              }
              an.a(this.field_g, 0, param1, param0, var9_intLifetime1Lifetime1);
              param0 = param0 + var9_intLifetime1Lifetime1;
              param3 = param3 - var9_intLifetime1Lifetime1;
              this.field_j = this.field_j + (long)var9_intLifetime1Lifetime1;
            }
            if (this.field_e != -1L) {
              if (this.field_j < this.field_e &&
                param3 > 0) {
                var9_intLifetime2 = param0 + (int)(this.field_e - this.field_j);
                if (var9_intLifetime2 > param0 + param3) {
                  var9_intLifetime2 = param3 + param0;
                }
                while (var9_intLifetime2 > param0) {
                  param3--;
                  incrementValue$0 = param0;
                  param0++;
                  param1[incrementValue$0] = (byte) 0;
                  this.field_j = this.field_j + 1L;
                }
              }
              var9 = -1L;
              if (var5_long <= this.field_e &&
                this.field_e < var5_long + (long)var8) {
                var9 = this.field_e;
              } else {
                if (this.field_e <= var5_long &&
                  var5_long < ((long)this.field_c + this.field_e)) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if ((long)this.field_c + this.field_e > var5_long &&
                ((long)var8 + var5_long) >= ((long)this.field_c + this.field_e)) {
                var11 = this.field_e + (long)this.field_c;
              } else {
                if (this.field_e < (long)var8 + var5_long &&
                  ((long)this.field_c + this.field_e) >= (var5_long + (long)var8)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(var11 - var9);
                an.a(this.field_d, (int)(-this.field_e + var9), param1, var7 + (int)(-var5_long + var9), var13);
                if (var11 > this.field_j) {
                  param3 = (int)((long)param3 - (-this.field_j + var11));
                  this.field_j = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_b = -1L;
            throw var5;
          }
          if (param3 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_63_0 = var5_ref;
          stackIn_63_1 = new StringBuilder().append("nh.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(byte param0) throws IOException {
        this.b((byte) -99);
        this.field_h.a(-82);
        if (param0 < 113) {
          field_l = (char[]) null;
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
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
        var10 = client.field_A ? 1 : 0;
        try {
          try {
            if (this.field_n < (this.field_j + (long)param3)) {
              this.field_n = (long)param3 + this.field_j;
            }
            if (-1L != this.field_e && (this.field_j < this.field_e ||
              this.field_j > (this.field_e + (long)this.field_c))) {
              this.b((byte) -120);
            }
            if (this.field_e != -1L &&
              this.field_j + (long)param3 > this.field_e + (long)this.field_d.length) {
              var5_int = (int)((long)this.field_d.length + (this.field_e - this.field_j));
              an.a(param0, param2, this.field_d, (int)(this.field_j - this.field_e), var5_int);
              param2 = param2 + var5_int;
              param3 = param3 - var5_int;
              this.field_j = this.field_j + (long)var5_int;
              this.field_c = this.field_d.length;
              this.b((byte) -15);
            }
            if (this.field_d.length >= param3) {
              if (param1 <= 91) {
                field_f = (String) null;
              }
              if (param3 <= 0) {
                return;
              }
              if (this.field_e == -1L) {
                this.field_e = this.field_j;
              }
              an.a(param0, param2, this.field_d, (int)(this.field_j - this.field_e), param3);
              this.field_j = this.field_j + (long)param3;
              if ((this.field_j - this.field_e) > (long)this.field_c) {
                this.field_c = (int)(-this.field_e + this.field_j);
              }
              return;
            }
            if (~this.field_j != ~this.field_b) {
              this.field_h.a(this.field_j, 47);
              this.field_b = this.field_j;
            }
            this.field_h.a(param0, 83, param2, param3);
            this.field_b = this.field_b + (long)param3;
            if (this.field_b > this.field_k) {
              this.field_k = this.field_b;
            }
            var5_long = -1L;
            if (this.field_o <= this.field_j &&
              this.field_j < this.field_o + (long)this.field_m) {
              var5_long = this.field_j;
            } else {
              if (this.field_o >= this.field_j &&
                this.field_o < (long)param3 + this.field_j) {
                var5_long = this.field_o;
              }
            }
            var7 = -1L;
            if (this.field_o < this.field_j + (long)param3 &&
              (long)this.field_m + this.field_o >= (long)param3 + this.field_j) {
              var7 = this.field_j + (long)param3;
            } else {
              if ((long)this.field_m + this.field_o > this.field_j &&
                (this.field_o + (long)this.field_m) <= ((long)param3 + this.field_j)) {
                var7 = this.field_o + (long)this.field_m;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(-var5_long + var7);
              an.a(param0, (int)(var5_long + ((long)param2 - this.field_j)), this.field_g, (int)(-this.field_o + var5_long), var9);
            }
            this.field_j = this.field_j + (long)param3;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_b = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_53_0 = var5_ref;
          stackIn_53_1 = new StringBuilder().append("nh.C(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        if (param0 == 12) {
          qk.field_i = 3 & param1 >> 4;
          wh.field_d = (13 & param1) >> 2;
          if (2 < qk.field_i) {
            qk.field_i = 2;
          }
          wl.field_o = 3 & param1;
          if (wh.field_d > 2) {
            wh.field_d = 2;
          }
          if (wl.field_o > 2) {
            wl.field_o = 2;
          }
          return;
        }
    }

    nh(hf param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_o = -1L;
        this.field_e = -1L;
        this.field_c = 0;
        try {
          this.field_h = param0;
          dupTemp$0 = param0.a((byte) -50);
          this.field_k = dupTemp$0;
          this.field_n = dupTemp$0;
          this.field_g = new byte[param1];
          this.field_j = 0L;
          this.field_d = new byte[param2];
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "nh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        try {
          this.a(0, param0, 741, param0.length);
          int var3_int = 38 / ((param1 - 70) / 44);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "nh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_i = new qm(0, 2, 2, 1);
        field_f = "Show all lobby chat";
        field_l = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
