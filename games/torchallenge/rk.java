/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk {
    private long field_i;
    static cf field_n;
    private int field_l;
    private long field_b;
    private long field_q;
    static int[] field_a;
    private long field_k;
    private byte[] field_r;
    private byte[] field_d;
    private nd field_j;
    private int field_f;
    private long field_m;
    private long field_o;
    static sl field_g;
    static String field_h;
    static int[] field_p;
    static boolean field_e;
    static String field_c;

    final long a(int param0) {
        int var2 = 25 % ((param0 + 62) / 44);
        return this.field_m;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          try {
            if (this.field_m < this.field_q + (long)param3) {
              this.field_m = (long)param3 + this.field_q;
            }
            if (this.field_o != -1L && (this.field_q < this.field_o ||
              this.field_q > this.field_o + (long)this.field_l)) {
              this.a(true);
            }
            if (this.field_o != -1L &&
              (long)param3 + this.field_q > this.field_o + (long)this.field_d.length) {
              var5_int = (int)((long)this.field_d.length + this.field_o - this.field_q);
              he.a(param2, param1, this.field_d, (int)(-this.field_o + this.field_q), var5_int);
              this.field_q = this.field_q + (long)var5_int;
              param3 = param3 - var5_int;
              param1 = param1 + var5_int;
              this.field_l = this.field_d.length;
              this.a(true);
            }
            if (this.field_d.length >= param3) {
              if (param0 != -4573) {
                rk.b(false);
              }
              if (param3 <= 0) {
                return;
              }
              if (this.field_o == -1L) {
                this.field_o = this.field_q;
              }
              he.a(param2, param1, this.field_d, (int)(this.field_q - this.field_o), param3);
              this.field_q = this.field_q + (long)param3;
              if ((long)this.field_l < (this.field_q - this.field_o)) {
                this.field_l = (int)(-this.field_o + this.field_q);
              }
              return;
            }
            if (~this.field_q != ~this.field_b) {
              this.field_j.a(this.field_q, false);
              this.field_b = this.field_q;
            }
            this.field_j.a(param2, param1, param3, (byte) -59);
            this.field_b = this.field_b + (long)param3;
            if (this.field_b > this.field_k) {
              this.field_k = this.field_b;
            }
            var5_long = -1L;
            if (this.field_q >= this.field_i &&
              this.field_i + (long)this.field_f > this.field_q) {
              var5_long = this.field_q;
            } else {
              if (this.field_i >= this.field_q &&
                this.field_i < (this.field_q + (long)param3)) {
                var5_long = this.field_i;
              }
            }
            var7 = -1L;
            if (this.field_q + (long)param3 > this.field_i &&
              (long)this.field_f + this.field_i >= (long)param3 + this.field_q) {
              var7 = this.field_q + (long)param3;
            } else {
              if (this.field_q < (long)this.field_f + this.field_i &&
                (long)param3 + this.field_q >= (long)this.field_f + this.field_i) {
                var7 = this.field_i + (long)this.field_f;
              }
            }
            if (var5_long > -1L &&
              var7 > var5_long) {
              var9 = (int)(-var5_long + var7);
              he.a(param2, (int)(var5_long + (long)param1 - this.field_q), this.field_r, (int)(var5_long - this.field_i), var9);
            }
            this.field_q = this.field_q + (long)param3;
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
          stackIn_52_0 = var5_ref;
          stackIn_52_1 = new StringBuilder().append("rk.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_a = null;
        field_g = null;
        field_p = null;
        field_h = null;
        field_n = null;
        if (!param0) {
          field_n = (cf) null;
        }
        field_c = null;
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
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
        var14 = TorChallenge.field_F ? 1 : 0;
        try {
          try {
            if (param3.length < param1 + param0) {
              throw new ArrayIndexOutOfBoundsException(param0 - (-param1 + param3.length));
            }
            if (-1L != this.field_o &&
              this.field_o <= this.field_q &&
              (this.field_o + (long)this.field_l) >= (this.field_q + (long)param1)) {
              he.a(this.field_d, (int)(this.field_q - this.field_o), param3, param0, param1);
              this.field_q = this.field_q + (long)param1;
              return;
            }
            var5_long = this.field_q;
            var7 = param0;
            var8 = param1;
            if (this.field_q >= this.field_i &&
              this.field_q < this.field_i + (long)this.field_f) {
              var9_int = (int)((long)this.field_f - this.field_q + this.field_i);
              if (var9_int > param1) {
                var9_int = param1;
              }
              he.a(this.field_r, (int)(this.field_q - this.field_i), param3, param0, var9_int);
              param1 = param1 - var9_int;
              this.field_q = this.field_q + (long)var9_int;
              param0 = param0 + var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_r.length < param1) {
              this.field_j.a(this.field_q, false);
              this.field_b = this.field_q;
              while (param1 > 0) {
                var9_intLifetime1 = this.field_j.a(param0, param1, false, param3);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param1 = param1 - var9_intLifetime1;
                this.field_b = this.field_b + (long)var9_intLifetime1;
                this.field_q = this.field_q + (long)var9_intLifetime1;
                param0 = param0 + var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param1 > 0)) {
              this.b((byte) -127);
              var9_intLifetime1Lifetime1 = param1;
              if (this.field_f < var9_intLifetime1Lifetime1) {
                var9_intLifetime1Lifetime1 = this.field_f;
              }
              he.a(this.field_r, 0, param3, param0, var9_intLifetime1Lifetime1);
              param0 = param0 + var9_intLifetime1Lifetime1;
              this.field_q = this.field_q + (long)var9_intLifetime1Lifetime1;
              param1 = param1 - var9_intLifetime1Lifetime1;
            }
            if (-1L != this.field_o) {
              if (this.field_o > this.field_q &&
                param1 > 0) {
                var9_intLifetime2 = (int)(this.field_o - this.field_q) + param0;
                if (param1 + param0 < var9_intLifetime2) {
                  var9_intLifetime2 = param1 + param0;
                }
                while (param0 < var9_intLifetime2) {
                  incrementValue$0 = param0;
                  param0++;
                  param3[incrementValue$0] = (byte) 0;
                  param1--;
                  this.field_q = this.field_q + 1L;
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (this.field_o >= var5_long &&
                this.field_o < (var5_long + (long)var8)) {
                var9 = this.field_o;
              } else {
                if (var5_long >= this.field_o &&
                  (long)this.field_l + this.field_o > var5_long) {
                  var9 = var5_long;
                }
              }
              if (var5_long < (this.field_o + (long)this.field_l) &&
                (this.field_o + (long)this.field_l) <= (var5_long + (long)var8)) {
                var11 = (long)this.field_l + this.field_o;
              } else {
                if (this.field_o < var5_long + (long)var8 &&
                  (var5_long + (long)var8) <= (this.field_o + (long)this.field_l)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var9 < var11) {
                var13 = (int)(var11 - var9);
                he.a(this.field_d, (int)(var9 - this.field_o), param3, (int)(-var5_long + var9) + var7, var13);
                if (this.field_q < var11) {
                  param1 = (int)((long)param1 - (var11 - this.field_q));
                  this.field_q = var11;
                }
              }
            }
            if (param2 < 5) {
              this.a(64);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_b = -1L;
            throw var5;
          }
          if (0 < param1) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_60_0 = var5_ref;
          stackIn_60_1 = new StringBuilder().append("rk.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(')').toString());
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param0 < 0L) {
          throw new IOException();
        }
        if (param1 != 0) {
          return;
        }
        this.field_q = param0;
    }

    final static int a(byte param0, int[] param1) {
        int var4 = 0;
        int var6 = 0;
        int var2_int = 0;
        int var3 = 0;
        int var5 = 0;
        int var7 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 5;
          var5 = 34 % ((param0 + 42) / 63);
          for (var4 = 0; 6 > var4; var4++) {
            for (var6 = 0; var6 < var3; var6++) {
              if ((1 << var6 & param1[var4]) > 0) {
                var2_int++;
              }
            }
          }
          stackIn_12_0 = var2_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("rk.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(boolean param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        java.net.URL var8;
        var7 = TorChallenge.field_F ? 1 : 0;
        if (this.field_o != -1L) {
          if (~this.field_o != ~this.field_b) {
            this.field_j.a(this.field_o, false);
            this.field_b = this.field_o;
          }
          this.field_j.a(this.field_d, 0, this.field_l, (byte) -59);
          this.field_b = this.field_b + (long)this.field_l;
          if (this.field_b > this.field_k) {
            this.field_k = this.field_b;
          }
          var2 = -1L;
          if (this.field_i <= this.field_o &&
            (this.field_i + (long)this.field_f) > this.field_o) {
            var2 = this.field_o;
          } else {
            if (this.field_i >= this.field_o &&
              (long)this.field_l + this.field_o > this.field_i) {
              var2 = this.field_i;
            }
          }
          var4 = -1L;
          if (this.field_o + (long)this.field_l > this.field_i &&
            ((long)this.field_l + this.field_o) <= ((long)this.field_f + this.field_i)) {
            var4 = (long)this.field_l + this.field_o;
          } else {
            if (((long)this.field_f + this.field_i) > this.field_o &&
              (this.field_i + (long)this.field_f) <= (this.field_o + (long)this.field_l)) {
              var4 = this.field_i + (long)this.field_f;
            }
          }
          if (var2 > -1L &&
            var2 < var4) {
            var6 = (int)(-var2 + var4);
            he.a(this.field_d, (int)(-this.field_o + var2), this.field_r, (int)(var2 - this.field_i), var6);
          }
          this.field_l = 0;
          this.field_o = -1L;
        }
        if (!param0) {
          var8 = (java.net.URL) null;
          rk.a((String) null, -7, (String) null, -38, (java.net.URL) null);
        }
    }

    final void a(byte param0) throws IOException {
        this.a(true);
        if (param0 != -57) {
          java.awt.Canvas var3 = (java.awt.Canvas) null;
          rk.a((byte) 19, (java.awt.Canvas) null);
        }
        this.field_j.a((byte) 47);
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          sd.a((byte) 69, (java.awt.Component) ((Object) param1));
          kb.a((byte) -25, (java.awt.Component) ((Object) param1));
          var2_int = 59 / ((24 - param0) / 36);
          if (ef.field_l != null) {
            ef.field_l.a((byte) 118, (java.awt.Component) ((Object) param1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("rk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void b(byte param0) throws IOException {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TorChallenge.field_F ? 1 : 0;
        this.field_f = 0;
        var2 = -29 % ((param0 - 36) / 57);
        if (this.field_q != this.field_b) {
          this.field_j.a(this.field_q, false);
          this.field_b = this.field_q;
        }
        this.field_i = this.field_q;
        while (this.field_r.length > this.field_f) {
          var3 = -this.field_f + this.field_r.length;
          if (200000000 < var3) {
            var3 = 200000000;
          }
          var4 = this.field_j.a(this.field_f, var3, false, this.field_r);
          if (var4 != -1) {
            this.field_b = this.field_b + (long)var4;
            this.field_f = this.field_f + var4;
            continue;
          }
          break;
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.a(0, param1.length, (byte) 125, param1);
          if (param0 > -92) {
            field_e = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("rk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, int param3, java.net.URL param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_3_0 = null;
          java.net.URL stackIn_43_0 = null;
          java.net.URL stackIn_45_0 = null;
          RuntimeException stackIn_48_0 = null;
          StringBuilder stackIn_48_1 = null;
          String stackIn_49_2 = null;
          StringBuilder stackIn_51_1 = null;
          String stackIn_52_2 = null;
          StringBuilder stackIn_54_1 = null;
          String stackIn_55_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = TorChallenge.field_F ? 1 : 0;
          try {
            if (param3 != -1) {
              stackIn_3_0 = (java.net.URL) null;
              return stackIn_3_0;
            }
            var5 = param4.getFile();
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if ((var7_int >= 0) &&
                  (decompiledFrameRemainder0 = !(param1 < 0))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (var7_int >= 0) {
                    var6 = var7_int;
                    continue;
                  }
                }
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((var7_int >= 0) &&
                    (decompiledFrameRemainder0 = (param2 != null))) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (var7_int >= 0) {
                      if (param0 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  var7 = new StringBuilder(var6);
                  discarded$0 = var7.append(var5.substring(0, var6));
                  if (param1 > 0) {
                    discarded$1 = var7.append("/l=");
                    discarded$2 = var7.append(Integer.toString(param1));
                  }
                  if (param2 != null &&
                    param2.length() > 0) {
                    discarded$3 = var7.append("/p=");
                    discarded$4 = var7.append(param2);
                  }
                  if (param0 != null &&
                    param0.length() > 0) {
                    discarded$5 = var7.append("/s=");
                    discarded$6 = var7.append(param0);
                  }
                  if (var5.length() <= var6) {
                    discarded$7 = var7.append('/');
                  } else {
                    discarded$8 = var7.append(var5.substring(var6, var5.length()));
                  }
                  try {
                    stackIn_43_0 = new java.net.URL(param4, var7.toString());
                    return stackIn_43_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_45_0 = (java.net.URL) (param4);
                    return stackIn_45_0;
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_48_0 = var5_ref;
            stackIn_48_1 = new StringBuilder().append("rk.K(");
            if (param0 == null) {
              stackIn_49_2 = "null";
            } else {
              stackIn_49_2 = "{...}";
            }
            stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_52_2 = "null";
            } else {
              stackIn_52_2 = "{...}";
            }
            stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_55_2 = "null";
            } else {
              stackIn_55_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    rk(nd param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_l = 0;
        this.field_i = -1L;
        this.field_o = -1L;
        try {
          this.field_j = param0;
          dupTemp$0 = param0.a(true);
          this.field_k = dupTemp$0;
          this.field_m = dupTemp$0;
          this.field_d = new byte[param2];
          this.field_q = 0L;
          this.field_r = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "rk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = new int[]{4, 8};
        field_n = new cf();
        field_e = true;
        field_c = "Email is valid";
        field_h = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
