/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ge {
    private long field_o;
    private int field_j;
    static String field_i;
    private pf field_b;
    static he[] field_p;
    private long field_a;
    static String field_c;
    static int field_f;
    private long field_h;
    static he field_d;
    static String field_g;
    private long field_n;
    private long field_k;
    private byte[] field_m;
    private byte[] field_l;
    private long field_e;
    private int field_q;

    final void a(int param0) throws IOException {
        if (param0 > -46) {
          return;
        }
        this.b(0);
        this.field_b.c(104);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          try {
            if (this.field_h < (this.field_a + (long)param0)) {
              this.field_h = this.field_a + (long)param0;
            }
            if (this.field_k != -1L && (this.field_a < this.field_k ||
              this.field_a > this.field_k + (long)this.field_j)) {
              this.b(0);
            }
            if (-1L != this.field_k &&
              ((long)this.field_l.length + this.field_k) < (this.field_a + (long)param0)) {
              var5_int = (int)(-this.field_a - (-this.field_k - (long)this.field_l.length));
              kg.a(param3, param1, this.field_l, (int)(this.field_a - this.field_k), var5_int);
              this.field_a = this.field_a + (long)var5_int;
              param1 = param1 + var5_int;
              param0 = param0 - var5_int;
              this.field_j = this.field_l.length;
              this.b(0);
            }
            if (param0 <= this.field_l.length) {
              if (param2 != 18017) {
                return;
              }
              if (0 >= param0) {
                return;
              }
              if (-1L == this.field_k) {
                this.field_k = this.field_a;
              }
              kg.a(param3, param1, this.field_l, (int)(this.field_a - this.field_k), param0);
              this.field_a = this.field_a + (long)param0;
              if ((-this.field_k + this.field_a) > (long)this.field_j) {
                this.field_j = (int)(this.field_a - this.field_k);
              }
              return;
            }
            if (~this.field_e != ~this.field_a) {
              this.field_b.a(1536, this.field_a);
              this.field_e = this.field_a;
            }
            this.field_b.a((byte) -104, param0, param1, param3);
            this.field_e = this.field_e + (long)param0;
            if (this.field_n < this.field_e) {
              this.field_n = this.field_e;
            }
            var5_long = -1L;
            if (this.field_o <= this.field_a &&
              this.field_a < (this.field_o + (long)this.field_q)) {
              var5_long = this.field_a;
            } else {
              if (this.field_a <= this.field_o &&
                this.field_o < (this.field_a + (long)param0)) {
                var5_long = this.field_o;
              }
            }
            var7 = -1L;
            if (this.field_o < ((long)param0 + this.field_a) &&
              ((long)this.field_q + this.field_o) >= ((long)param0 + this.field_a)) {
              var7 = (long)param0 + this.field_a;
            } else {
              if (((long)this.field_q + this.field_o) > this.field_a &&
                (long)this.field_q + this.field_o <= this.field_a + (long)param0) {
                var7 = this.field_o + (long)this.field_q;
              }
            }
            if (-1L < var5_long &&
              var5_long < var7) {
              var9 = (int)(-var5_long + var7);
              kg.a(param3, (int)((long)param1 + var5_long - this.field_a), this.field_m, (int)(var5_long - this.field_o), var9);
            }
            this.field_a = this.field_a + (long)param0;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_e = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_53_0 = var5_ref;
          stackIn_53_1 = new StringBuilder().append("ge.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_i = null;
        field_c = null;
        field_g = null;
        field_d = null;
        field_p = null;
    }

    final void a(byte param0, byte[] param1) throws IOException {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.a(0, param1, param1.length, -101);
          if (param0 != -111) {
            ge.a(-11, (byte) 68);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("ge.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        String stackIn_4_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var3 = ui.a(param1, param2, -3);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (param0 < 82) {
            var6 = (CharSequence) null;
            ge.a((byte) -112, false, (CharSequence) null);
          }
          var4 = 0;
          while (true) {
            if (param2.length() <= var4) {
              return null;
            }
            if (pa.a((byte) 58, param2.charAt(var4))) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_12_0 = ul.field_g;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ge.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static int a(byte[] param0, int param1, int param2, int param3, CharSequence param4, int param5) {
        int var7 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var6_int = param3 - param2;
          if (param5 > -123) {
            var10 = (CharSequence) null;
            ge.a((byte[]) null, 67, 112, -126, (CharSequence) null, 48);
          }
          for (var7 = 0; var7 < var6_int; var7++) {
            {
              var8 = param4.charAt(var7 + param2);
              if ((var8 <= 0 ||
                var8 >= 128) && (160 > var8 ||
                255 < var8)) {
                switch (var8) {
                  case 8364:
                    param0[var7 + param1] = (byte)-128;
                    break;
                  case 8218:
                    param0[param1 + var7] = (byte)-126;
                    break;
                  case 402:
                    param0[var7 + param1] = (byte)-125;
                    break;
                  case 8222:
                    param0[var7 + param1] = (byte)-124;
                    break;
                  case 8230:
                    param0[var7 + param1] = (byte)-123;
                    break;
                  case 8224:
                    param0[param1 + var7] = (byte)-122;
                    break;
                  case 8225:
                    param0[param1 + var7] = (byte)-121;
                    break;
                  case 710:
                    param0[param1 + var7] = (byte)-120;
                    break;
                  case 8240:
                    param0[param1 + var7] = (byte)-119;
                    break;
                  case 352:
                    param0[param1 + var7] = (byte)-118;
                    break;
                  case 8249:
                    param0[var7 + param1] = (byte)-117;
                    break;
                  case 338:
                    param0[param1 + var7] = (byte)-116;
                    break;
                  case 381:
                    param0[var7 + param1] = (byte)-114;
                    break;
                  case 8216:
                    param0[var7 + param1] = (byte)-111;
                    break;
                  case 8217:
                    param0[param1 + var7] = (byte)-110;
                    break;
                  case 8220:
                    param0[var7 + param1] = (byte)-109;
                    break;
                  case 8221:
                    param0[param1 + var7] = (byte)-108;
                    break;
                  case 8226:
                    param0[param1 + var7] = (byte)-107;
                    break;
                  case 8211:
                    param0[param1 + var7] = (byte)-106;
                    break;
                  case 8212:
                    param0[var7 + param1] = (byte)-105;
                    break;
                  case 732:
                    param0[param1 + var7] = (byte)-104;
                    break;
                  case 8482:
                    param0[param1 + var7] = (byte)-103;
                    break;
                  case 353:
                    param0[var7 + param1] = (byte)-102;
                    break;
                  case 8250:
                    param0[param1 + var7] = (byte)-101;
                    break;
                  case 339:
                    param0[var7 + param1] = (byte)-100;
                    break;
                  case 382:
                    param0[var7 + param1] = (byte)-98;
                    break;
                  case 376:
                    param0[var7 + param1] = (byte)-97;
                    break;
                  default:
                    param0[param1 + var7] = (byte)63;
                    break;
                }
              } else {
                param0[var7 + param1] = (byte)var8;
              }
            }
          }
          stackIn_69_0 = var6_int;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("ge.J(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param5).append(')').toString());
        }
    }

    final long b(boolean param0) {
        if (!param0) {
          return -64L;
        }
        return this.field_h;
    }

    private final void a(byte param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_q = 0;
        if (~this.field_a != ~this.field_e) {
          this.field_b.a(1536, this.field_a);
          this.field_e = this.field_a;
        }
        this.field_o = this.field_a;
        if (param0 != -102) {
          return;
        }
        while (this.field_q < this.field_m.length) {
          var2 = -this.field_q + this.field_m.length;
          if (200000000 < var2) {
            var2 = 200000000;
          }
          var3 = this.field_b.a(this.field_m, var2, param0 + 101, this.field_q);
          if (var3 == -1) {
            break;
          }
          this.field_e = this.field_e + (long)var3;
          this.field_q = this.field_q + var3;
        }
    }

    final void a(long param0, byte param1) throws IOException {
        if (param0 < 0L) {
          throw new IOException();
        }
        if (param1 != -63) {
          return;
        }
        this.field_a = param0;
    }

    private final void b(int param0) throws IOException {
        long var2;
        long var4;
        int var6;
        int var7;
        CharSequence var8;
        int var6Lifetime1;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 0) {
          var8 = (CharSequence) null;
          ge.a((byte[]) null, 111, 53, 38, (CharSequence) null, -38);
        }
        boolean decompiledFrameRemainder0 = true;
        if (-1L != this.field_k) {
          if (~this.field_k != ~this.field_e) {
            this.field_b.a(param0 + 1536, this.field_k);
            this.field_e = this.field_k;
          }
          this.field_b.a((byte) -87, this.field_j, 0, this.field_l);
          this.field_e = this.field_e + (long)this.field_j;
          if (this.field_e > this.field_n) {
            this.field_n = this.field_e;
          }
          var2 = -1L;
          if (this.field_k >= this.field_o &&
            this.field_k < (long)this.field_q + this.field_o) {
            var2 = this.field_k;
          } else {
            if (this.field_o >= this.field_k &&
              (this.field_k + (long)this.field_j) > this.field_o) {
              var2 = this.field_o;
            }
          }
          var4 = -1L;
          if (this.field_o < this.field_k + (long)this.field_j &&
            this.field_k + (long)this.field_j <= this.field_o + (long)this.field_q) {
            var4 = this.field_k + (long)this.field_j;
          } else {
            if (this.field_k < (long)this.field_q + this.field_o) {
              if (this.field_o + (long)this.field_q > (long)this.field_j + this.field_k) {
                if (var2 > -1L &&
                  var4 > var2) {
                  var6 = (int)(-var2 + var4);
                  kg.a(this.field_l, (int)(var2 - this.field_k), this.field_m, (int)(var2 - this.field_o), var6);
                }
                this.field_k = -1L;
                this.field_j = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                var4 = (long)this.field_q + this.field_o;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (var2 > -1L &&
              var4 > var2) {
              var6Lifetime1 = (int)(-var2 + var4);
              kg.a(this.field_l, (int)(var2 - this.field_k), this.field_m, (int)(var2 - this.field_o), var6Lifetime1);
            }
            this.field_k = -1L;
            this.field_j = 0;
          }
        }

    }

    final static f a(int param0, byte param1) {
        f var2 = new f();
        ql.field_i.a(var2, 255);
        if (param1 >= -74) {
          ge.a(103, (byte) 124);
        }
        bj.a(2591, param0);
        return var2;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int incrementValue$0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
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
        var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          try {
            if (param0 + param2 > param1.length) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + param2 + param0);
            }
            if (param3 > -95) {
              field_p = (he[]) null;
            }
            if (this.field_k != -1L &&
              this.field_k <= this.field_a &&
              ((long)this.field_j + this.field_k) >= (this.field_a + (long)param2)) {
              kg.a(this.field_l, (int)(-this.field_k + this.field_a), param1, param0, param2);
              this.field_a = this.field_a + (long)param2;
              return;
            }
            var5_long = this.field_a;
            var7 = param0;
            var8 = param2;
            if (this.field_o <= this.field_a &&
              this.field_a < this.field_o + (long)this.field_q) {
              var9_int = (int)((long)this.field_q - (-this.field_o + this.field_a));
              if (var9_int > param2) {
                var9_int = param2;
              }
              kg.a(this.field_m, (int)(-this.field_o + this.field_a), param1, param0, var9_int);
              param2 = param2 - var9_int;
              param0 = param0 + var9_int;
              this.field_a = this.field_a + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param2 > this.field_m.length) {
              this.field_b.a(1536, this.field_a);
              this.field_e = this.field_a;
              while (param2 > 0) {
                var9_intLifetime1 = this.field_b.a(param1, param2, -1, param0);
                if (-1 == var9_intLifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param2 = param2 - var9_intLifetime1;
                this.field_a = this.field_a + (long)var9_intLifetime1;
                param0 = param0 + var9_intLifetime1;
                this.field_e = this.field_e + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param2 > 0)) {
              this.a((byte) -102);
              var9_intLifetime1Lifetime1 = param2;
              if (var9_intLifetime1Lifetime1 > this.field_q) {
                var9_intLifetime1Lifetime1 = this.field_q;
              }
              kg.a(this.field_m, 0, param1, param0, var9_intLifetime1Lifetime1);
              param0 = param0 + var9_intLifetime1Lifetime1;
              this.field_a = this.field_a + (long)var9_intLifetime1Lifetime1;
              param2 = param2 - var9_intLifetime1Lifetime1;
            }
            if (this.field_k != -1L) {
              if (this.field_a < this.field_k &&
                param2 > 0) {
                var9_intLifetime2 = (int)(this.field_k - this.field_a) + param0;
                if (param2 + param0 < var9_intLifetime2) {
                  var9_intLifetime2 = param0 + param2;
                }
                while (param0 < var9_intLifetime2) {
                  incrementValue$0 = param0;
                  param0++;
                  param1[incrementValue$0] = (byte) 0;
                  param2--;
                  this.field_a = this.field_a + 1L;
                }
              }
              var9 = -1L;
              if (var5_long <= this.field_k &&
                this.field_k < (long)var8 + var5_long) {
                var9 = this.field_k;
              } else {
                if (this.field_k <= var5_long &&
                  (this.field_k + (long)this.field_j) > var5_long) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (((long)this.field_j + this.field_k) > var5_long &&
                (long)this.field_j + this.field_k <= var5_long + (long)var8) {
                var11 = this.field_k + (long)this.field_j;
              } else {
                if ((long)var8 + var5_long > this.field_k &&
                  (long)this.field_j + this.field_k >= var5_long + (long)var8) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var9 < var11) {
                var13 = (int)(-var9 + var11);
                kg.a(this.field_l, (int)(var9 - this.field_k), param1, var7 + (int)(-var5_long + var9), var13);
                if (this.field_a < var11) {
                  param2 = (int)((long)param2 - (-this.field_a + var11));
                  this.field_a = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_e = -1L;
            throw var5;
          }
          if (param2 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_62_0 = var5_ref;
          stackIn_62_1 = new StringBuilder().append("ge.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ge(pf param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_j = 0;
        this.field_k = -1L;
        this.field_o = -1L;
        try {
          this.field_b = param0;
          dupTemp$0 = param0.a(-105);
          this.field_n = dupTemp$0;
          this.field_h = dupTemp$0;
          this.field_a = 0L;
          this.field_l = new byte[param2];
          this.field_m = new byte[param1];
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_p = new he[1];
        field_i = "Score";
        field_c = "Email (Login):";
        field_g = "Play free version";
    }
}
