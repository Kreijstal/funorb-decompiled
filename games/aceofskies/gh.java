/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gh {
    private long field_e;
    private long field_k;
    private long field_h;
    static String field_o;
    private byte[] field_g;
    private byte[] field_n;
    private long field_d;
    private long field_l;
    static ia field_i;
    private int field_c;
    private int field_a;
    static GameAppletShell field_f;
    private long field_b;
    static AircraftDefinition playerDefinition;
    private fs field_m;

    private final void a(int param0) throws IOException {
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var2 = -57 / ((83 - param0) / 41);
        if (this.field_e != -1L) {
          if (~this.field_d != ~this.field_e) {
            this.field_m.a(this.field_e, true);
            this.field_d = this.field_e;
          }
          this.field_m.a(this.field_g, 0, 66, this.field_c);
          this.field_d = this.field_d + (long)this.field_c;
          if (this.field_d > this.field_h) {
            this.field_h = this.field_d;
          }
          long var3 = -1L;
          long var5 = -1L;
          if (this.field_e >= this.field_l &&
            ((long)this.field_a + this.field_l) > this.field_e) {
            var3 = this.field_e;
          } else if (this.field_l >= this.field_e &&
            this.field_l < (this.field_e + (long)this.field_c)) {
            var3 = this.field_l;
          }
          if (this.field_l < ((long)this.field_c + this.field_e) &&
            this.field_l + (long)this.field_a >= (long)this.field_c + this.field_e) {
            var5 = this.field_e + (long)this.field_c;
          } else if (this.field_e < (long)this.field_a + this.field_l &&
            (this.field_l + (long)this.field_a) <= (this.field_e + (long)this.field_c)) {
            var5 = this.field_l + (long)this.field_a;
          }
          if (var3 > -1L &&
            var3 < var5) {
            int var7 = (int)(-var3 + var5);
            au.a(this.field_g, (int)(-this.field_e + var3), this.field_n, (int)(var3 - this.field_l), var7);
          }
          this.field_e = -1L;
          this.field_c = 0;
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != 106) {
          return;
        }
        this.a(param0 ^ 22);
        this.field_m.a(19260);
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        String stackIn_64_2 = null;
        Throwable decompiledCaughtException = null;
        int var14 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          try {
            if (param1 + param3 > param2.length) {
              throw new ArrayIndexOutOfBoundsException(param3 - (-param1 + param2.length));
            }
            if (this.field_e != -1L &&
              this.field_e <= this.field_k &&
              (long)this.field_c + this.field_e >= this.field_k + (long)param1) {
              au.a(this.field_g, (int)(-this.field_e + this.field_k), param2, param3, param1);
              this.field_k = this.field_k + (long)param1;
              return;
            }
            long var5_long = this.field_k;
            if (param0 != 0) {
              this.field_n = (byte[]) null;
            }
            int var7 = param3;
            int var8 = param1;
            if (this.field_k >= this.field_l &&
              (long)this.field_a + this.field_l > this.field_k) {
              int var9_int = (int)(-this.field_k + (this.field_l + (long)this.field_a));
              if (var9_int > param1) {
                var9_int = param1;
              }
              au.a(this.field_n, (int)(-this.field_l + this.field_k), param2, param3, var9_int);
              param3 = param3 + var9_int;
              param1 = param1 - var9_int;
              this.field_k = this.field_k + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_n.length < param1) {
              this.field_m.a(this.field_k, true);
              this.field_d = this.field_k;
              while (param1 > 0) {
                int var9_intLifetime1 = this.field_m.a(param1, (byte) 53, param3, param2);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param1 = param1 - var9_intLifetime1;
                this.field_k = this.field_k + (long)var9_intLifetime1;
                param3 = param3 + var9_intLifetime1;
                this.field_d = this.field_d + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if (decompiledFrameRemainder0 &&
              decompiledFrameCompleted0 &&
              0 < param1) {
              this.d(0);
              int var9_intLifetime1Lifetime1 = param1;
              if (var9_intLifetime1Lifetime1 > this.field_a) {
                var9_intLifetime1Lifetime1 = this.field_a;
              }
              au.a(this.field_n, 0, param2, param3, var9_intLifetime1Lifetime1);
              param1 = param1 - var9_intLifetime1Lifetime1;
              this.field_k = this.field_k + (long)var9_intLifetime1Lifetime1;
              param3 = param3 + var9_intLifetime1Lifetime1;
            }
            if (this.field_e != -1L) {
              if (this.field_e > this.field_k &&
                param1 > 0) {
                int var9_intLifetime2 = (int)(-this.field_k + this.field_e) + param3;
                if (var9_intLifetime2 > param3 + param1) {
                  var9_intLifetime2 = param3 + param1;
                }
                while (param3 < var9_intLifetime2) {
                  param1--;
                  int incrementValue$0 = param3;
                  param3++;
                  param2[incrementValue$0] = (byte) 0;
                  this.field_k = this.field_k + 1L;
                }
              }
              long var9 = -1L;
              long var11 = -1L;
              if (this.field_e >= var5_long &&
                this.field_e < ((long)var8 + var5_long)) {
                var9 = this.field_e;
              } else if (this.field_e <= var5_long &&
                ((long)this.field_c + this.field_e) > var5_long) {
                var9 = var5_long;
              }
              if (((long)this.field_c + this.field_e) > var5_long &&
                this.field_e + (long)this.field_c <= (long)var8 + var5_long) {
                var11 = this.field_e + (long)this.field_c;
              } else if (((long)var8 + var5_long) > this.field_e &&
                (long)var8 + var5_long <= (long)this.field_c + this.field_e) {
                var11 = var5_long + (long)var8;
              }
              if (var9 > -1L &&
                var11 > var9) {
                int var13 = (int)(-var9 + var11);
                au.a(this.field_g, (int)(var9 - this.field_e), param2, (int)(-var5_long + var9) + var7, var13);
                if (this.field_k < var11) {
                  param1 = (int)((long)param1 - (var11 - this.field_k));
                  this.field_k = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            IOException var5 = (IOException) (Object) decompiledCaughtException;
            this.field_d = -1L;
            throw var5;
          }
          if (param1 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_63_0 = var5_ref;
          StringBuilder stackIn_63_1 = new StringBuilder().append("gh.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0, boolean param1, int param2) {
        if (param1) {
          return true;
        }
        return 0 != (65536 & param2) ? true : false;
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        String stackIn_52_2 = null;
        Throwable decompiledCaughtException = null;
        int var11 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          try {
            int var5_int = 16 / ((param3 - 21) / 45);
            if (this.field_b < this.field_k + (long)param0) {
              this.field_b = (long)param0 + this.field_k;
            }
            if (this.field_e != -1L) {
              if (!(this.field_e <= this.field_k)) {
                this.a(-125);
              } else if ((this.field_e + (long)this.field_c) < this.field_k) {
                this.a(-125);
              }
            }
            if (this.field_e != -1L &&
              ((long)param0 + this.field_k) > (this.field_e + (long)this.field_g.length)) {
              int var6_int = (int)(this.field_e - (this.field_k - (long)this.field_g.length));
              au.a(param1, param2, this.field_g, (int)(this.field_k - this.field_e), var6_int);
              this.field_k = this.field_k + (long)var6_int;
              param2 = param2 + var6_int;
              param0 = param0 - var6_int;
              this.field_c = this.field_g.length;
              this.a(-39);
            }
            if (this.field_g.length >= param0) {
              if (param0 <= 0) {
                return;
              }
              if (this.field_e == -1L) {
                this.field_e = this.field_k;
              }
              au.a(param1, param2, this.field_g, (int)(this.field_k - this.field_e), param0);
              this.field_k = this.field_k + (long)param0;
              if ((-this.field_e + this.field_k) > (long)this.field_c) {
                this.field_c = (int)(-this.field_e + this.field_k);
              }
              return;
            }
            if (this.field_d != this.field_k) {
              this.field_m.a(this.field_k, true);
              this.field_d = this.field_k;
            }
            this.field_m.a(param1, param2, 80, param0);
            this.field_d = this.field_d + (long)param0;
            if (this.field_d > this.field_h) {
              this.field_h = this.field_d;
            }
            long var6 = -1L;
            long var8 = -1L;
            if (this.field_k >= this.field_l &&
              (this.field_l + (long)this.field_a) > this.field_k) {
              var6 = this.field_k;
            } else if (this.field_l >= this.field_k &&
              (this.field_k + (long)param0) > this.field_l) {
              var6 = this.field_l;
            }
            if (this.field_l < this.field_k + (long)param0 &&
              (long)param0 + this.field_k <= (long)this.field_a + this.field_l) {
              var8 = this.field_k + (long)param0;
            } else if ((this.field_l + (long)this.field_a) > this.field_k &&
              (long)this.field_a + this.field_l <= (long)param0 + this.field_k) {
              var8 = this.field_l + (long)this.field_a;
            }
            if (-1L < var6 &&
              var8 > var6) {
              int var10 = (int)(var8 - var6);
              au.a(param1, (int)(-this.field_k + var6 + (long)param2), this.field_n, (int)(-this.field_l + var6), var10);
            }
            this.field_k = this.field_k + (long)param0;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            IOException var5 = (IOException) (Object) decompiledCaughtException;
            this.field_d = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_51_0 = var5_ref;
          StringBuilder stackIn_51_1 = new StringBuilder().append("gh.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        if (0L > param1) {
          throw new IOException();
        }
        this.field_k = param1;
        if (!param0) {
          ResourceArchive var5 = (ResourceArchive) null;
          gh.a((byte) 37, (ResourceArchive) null);
        }
    }

    public static void b(int param0) {
        field_o = null;
        if (param0 != 0) {
          field_i = (ia) null;
        }
        field_i = null;
        playerDefinition = null;
    }

    final void a(byte[] param0, int param1) throws IOException {
        if (param1 != 13541) {
          return;
        }
        try {
          this.a(0, param0.length, param0, 0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "gh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(byte param0, ResourceArchive param1) {
        String stackIn_7_2 = null;
        try {
          if (param0 != 15) {
            ResourceArchive var3 = (ResourceArchive) null;
            gh.a((byte) 52, (ResourceArchive) null);
          }
          boolean stackIn_3_0 = param1.b(0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var2;
          StringBuilder stackIn_6_1 = new StringBuilder().append("gh.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final long c(int param0) {
        int var2 = 54 % ((param0 + 8) / 45);
        return this.field_b;
    }

    private final void d(int param0) throws IOException {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_a = param0;
        if (this.field_k != this.field_d) {
          this.field_m.a(this.field_k, true);
          this.field_d = this.field_k;
        }
        this.field_l = this.field_k;
        while (this.field_n.length > this.field_a) {
          int var2 = -this.field_a + this.field_n.length;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          int var3 = this.field_m.a(var2, (byte) 53, this.field_a, this.field_n);
          if (var3 == -1) {
            break;
          }
          this.field_a = this.field_a + var3;
          this.field_d = this.field_d + (long)var3;
        }
    }

    gh(fs param0, int param1, int param2) throws IOException {
        this.field_l = -1L;
        this.field_c = 0;
        this.field_e = -1L;
        try {
          this.field_m = param0;
          long dupTemp$0 = param0.a(false);
          this.field_h = dupTemp$0;
          this.field_b = dupTemp$0;
          this.field_n = new byte[param1];
          this.field_g = new byte[param2];
          this.field_k = 0L;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_o = "Email is valid";
        field_i = new ia();
        field_f = null;
        playerDefinition = new AircraftDefinition(2.0, 15, 0, 100, 2, 6.0, 12.0, 16, 0);
    }
}
