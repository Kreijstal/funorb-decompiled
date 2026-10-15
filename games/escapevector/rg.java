/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rg {
    private long field_f;
    private long field_d;
    static String field_c;
    private long field_i;
    private long field_k;
    private long field_a;
    private byte[] field_h;
    private long field_e;
    private byte[] field_g;
    private int field_l;
    private int field_j;
    private ma field_b;

    final void a(boolean param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        long var5_long = 0L;
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        var10 = EscapeVector.field_A;
        try {
          try {
            if (this.field_e < (this.field_d + (long)param3)) {
              this.field_e = (long)param3 + this.field_d;
            }
            if (this.field_a != -1L) {
              if (this.field_a <= this.field_d) {
                if (((long)this.field_l + this.field_a) < this.field_d) {
                  this.b(118);
                }
              } else {
                this.b(118);
              }
            }
            if (this.field_a != -1L &&
              this.field_d + (long)param3 > this.field_a + (long)this.field_h.length) {
              var5_int = (int)(this.field_a - this.field_d + (long)this.field_h.length);
              qg.a(param2, param1, this.field_h, (int)(this.field_d - this.field_a), var5_int);
              param1 = param1 + var5_int;
              this.field_d = this.field_d + (long)var5_int;
              param3 = param3 - var5_int;
              this.field_l = this.field_h.length;
              this.b(115);
            }
            if (this.field_h.length < param3) {
              if (~this.field_k != ~this.field_d) {
                this.field_b.a(this.field_d, 1);
                this.field_k = this.field_d;
              }
              this.field_b.a(param2, param3, param1, -15814);
              this.field_k = this.field_k + (long)param3;
              if (this.field_i < this.field_k) {
                this.field_i = this.field_k;
              }
              var5_long = -1L;
              if (this.field_f <= this.field_d &&
                this.field_f + (long)this.field_j > this.field_d) {
                var5_long = this.field_d;
              } else {
                if (this.field_f >= this.field_d &&
                  this.field_f < ((long)param3 + this.field_d)) {
                  var5_long = this.field_f;
                }
              }
              var7 = -1L;
              if ((this.field_d + (long)param3) > this.field_f &&
                ((long)this.field_j + this.field_f) >= (this.field_d + (long)param3)) {
                var7 = (long)param3 + this.field_d;
              } else {
                if ((this.field_f + (long)this.field_j) > this.field_d &&
                  ((long)this.field_j + this.field_f) <= ((long)param3 + this.field_d)) {
                  var7 = this.field_f + (long)this.field_j;
                }
              }
              if (var5_long > -1L &&
                var5_long < var7) {
                var9 = (int)(var7 - var5_long);
                qg.a(param2, (int)(var5_long + (long)param1 - this.field_d), this.field_g, (int)(var5_long - this.field_f), var9);
              }
              this.field_d = this.field_d + (long)param3;
              return;
            }
            if (param3 > 0) {
              if (this.field_a == -1L) {
                this.field_a = this.field_d;
              }
              qg.a(param2, param1, this.field_h, (int)(this.field_d - this.field_a), param3);
              this.field_d = this.field_d + (long)param3;
              if (this.field_d - this.field_a > (long)this.field_l) {
                this.field_l = (int)(this.field_d - this.field_a);
              }
              return;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_k = -1L;
            throw var5;
          }
          if (!param0) {
            this.field_g = (byte[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_54_0 = var5_ref;
          stackIn_54_1 = new StringBuilder().append("rg.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0) throws IOException {
        if (param0 != -111) {
          field_c = (String) null;
        }
        this.b(125);
        this.field_b.a(0);
    }

    private final void b(int param0) throws IOException {
        long var2_long;
        int var2;
        long var4;
        int var6;
        int var7;
        var7 = EscapeVector.field_A;
        if (this.field_a != -1L) {
          if (this.field_a != this.field_k) {
            this.field_b.a(this.field_a, 1);
            this.field_k = this.field_a;
          }
          this.field_b.a(this.field_h, this.field_l, 0, -15814);
          this.field_k = this.field_k + (long)this.field_l;
          if (this.field_i < this.field_k) {
            this.field_i = this.field_k;
          }
          var2_long = -1L;
          if (this.field_a >= this.field_f &&
            this.field_f + (long)this.field_j > this.field_a) {
            var2_long = this.field_a;
          } else {
            if (this.field_f >= this.field_a &&
              this.field_f < (this.field_a + (long)this.field_l)) {
              var2_long = this.field_f;
            }
          }
          var4 = -1L;
          if (((long)this.field_l + this.field_a) > this.field_f &&
            (long)this.field_j + this.field_f >= this.field_a + (long)this.field_l) {
            var4 = (long)this.field_l + this.field_a;
          } else {
            if (this.field_a < (this.field_f + (long)this.field_j) &&
              (this.field_f + (long)this.field_j) <= (this.field_a + (long)this.field_l)) {
              var4 = this.field_f + (long)this.field_j;
            }
          }
          if (var2_long > -1L &&
            var2_long < var4) {
            var6 = (int)(-var2_long + var4);
            qg.a(this.field_h, (int)(-this.field_a + var2_long), this.field_g, (int)(-this.field_f + var2_long), var6);
          }
          this.field_l = 0;
          this.field_a = -1L;
        }
        var2 = 81 / ((56 - param0) / 50);
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != 0) {
          return;
        }
        if (param1 < 0L) {
          throw new IOException();
        }
        this.field_d = param1;
    }

    final long a(int param0) {
        if (param0 != 16034) {
          rg.b((byte) -75);
        }
        return this.field_e;
    }

    private final void a(boolean param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        this.field_j = 0;
        if (this.field_d != this.field_k) {
          this.field_b.a(this.field_d, 1);
          this.field_k = this.field_d;
        }
        this.field_f = this.field_d;
        if (!param0) {
          return;
        }
        while (this.field_g.length > this.field_j) {
          var2 = this.field_g.length - this.field_j;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          var3 = this.field_b.a(var2, (byte) 127, this.field_g, this.field_j);
          if (var3 == -1) {
            break;
          }
          this.field_j = this.field_j + var3;
          this.field_k = this.field_k + (long)var3;
        }
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = -78 / ((-11 - param0) / 41);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        int incrementValue$0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
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
        var14 = EscapeVector.field_A;
        try {
          try {
            if (param2 != 101) {
              return;
            }
            if (param0 + param1 > param3.length) {
              throw new ArrayIndexOutOfBoundsException(param1 + (param0 - param3.length));
            }
            if (this.field_a != -1L &&
              this.field_d >= this.field_a &&
              (long)this.field_l + this.field_a >= (long)param1 + this.field_d) {
              qg.a(this.field_h, (int)(-this.field_a + this.field_d), param3, param0, param1);
              this.field_d = this.field_d + (long)param1;
              return;
            }
            var5_long = this.field_d;
            var7 = param0;
            var8 = param1;
            if (this.field_f <= this.field_d &&
              this.field_d < this.field_f + (long)this.field_j) {
              var9_int = (int)(-this.field_d + this.field_f + (long)this.field_j);
              if (param1 < var9_int) {
                var9_int = param1;
              }
              qg.a(this.field_g, (int)(this.field_d - this.field_f), param3, param0, var9_int);
              param0 = param0 + var9_int;
              param1 = param1 - var9_int;
              this.field_d = this.field_d + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param1 > this.field_g.length) {
              this.field_b.a(this.field_d, 1);
              this.field_k = this.field_d;
              while (param1 > 0) {
                var9_intLifetime1 = this.field_b.a(param1, (byte) 125, param3, param0);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                param0 = param0 + var9_intLifetime1;
                this.field_d = this.field_d + (long)var9_intLifetime1;
                param1 = param1 - var9_intLifetime1;
                this.field_k = this.field_k + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param1 > 0)) {
              this.a(true);
              var9_intLifetime1Lifetime1 = param1;
              if (var9_intLifetime1Lifetime1 > this.field_j) {
                var9_intLifetime1Lifetime1 = this.field_j;
              }
              qg.a(this.field_g, 0, param3, param0, var9_intLifetime1Lifetime1);
              this.field_d = this.field_d + (long)var9_intLifetime1Lifetime1;
              param1 = param1 - var9_intLifetime1Lifetime1;
              param0 = param0 + var9_intLifetime1Lifetime1;
            }
            if (this.field_a != -1L) {
              if (this.field_a > this.field_d) {
                stackIn_29_0 = 0;
                stackIn_29_1 = param1;
                if (stackIn_29_0 < stackIn_29_1) {
                  var9_intLifetime2 = param0 + (int)(this.field_a - this.field_d);
                  if (var9_intLifetime2 > param0 + param1) {
                    var9_intLifetime2 = param1 + param0;
                  }
                  while (param0 < var9_intLifetime2) {
                    incrementValue$0 = param0;
                    param0++;
                    param3[incrementValue$0] = (byte) 0;
                    param1--;
                    this.field_d = this.field_d + 1L;
                  }
                }
              }
              var9 = -1L;
              var11 = -1L;
              if (var5_long <= this.field_a &&
                this.field_a < var5_long + (long)var8) {
                var9 = this.field_a;
              } else {
                if (this.field_a <= var5_long &&
                  var5_long < ((long)this.field_l + this.field_a)) {
                  var9 = var5_long;
                }
              }
              if (var5_long < ((long)this.field_l + this.field_a) &&
                this.field_a + (long)this.field_l <= var5_long + (long)var8) {
                var11 = (long)this.field_l + this.field_a;
              } else {
                if (var5_long + (long)var8 > this.field_a &&
                  (this.field_a + (long)this.field_l) >= ((long)var8 + var5_long)) {
                  var11 = var5_long + (long)var8;
                }
              }
              if (var9 > -1L &&
                var11 > var9) {
                var13 = (int)(var11 - var9);
                qg.a(this.field_h, (int)(-this.field_a + var9), param3, var7 + (int)(var9 - var5_long), var13);
                if (this.field_d < var11) {
                  param1 = (int)((long)param1 - (var11 - this.field_d));
                  this.field_d = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_k = -1L;
            throw var5;
          }
          if (param1 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_60_0 = var5_ref;
          stackIn_60_1 = new StringBuilder().append("rg.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(')').toString());
        }
    }

    final static short[] a(c param0, int param1, short[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = EscapeVector.field_A;
        try {
          var4_int = param0.j(param1, 8);
          if (~var4_int == param3) {
            return null;
          }
          if (param2 == null ||
            var4_int != param2.length) {
            param2 = new short[var4_int];
          }
          var5 = param0.j(4, 8);
          var6 = (short)param0.j(16, 8);
          if (0 < var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (short)(var6 + param0.j(var5, 8));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (short)var6;
            }
          }
          stackIn_16_0 = (short[]) (param2);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("rg.H(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        dm var4_ref_dm = null;
        int var4 = 0;
        dm var5 = null;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        try {
          if (ck.field_t != al.field_d) {
            return false;
          }
          var2_long = td.b(128);
          if (param1 < 101) {
            return true;
          }
          if (vj.field_a != 0 &&
            eh.field_a < 0) {
            var4_ref_dm = (dm) (bb.field_L.a(false));
            if (var4_ref_dm != null &&
              var4_ref_dm.field_g < var2_long) {
              var4_ref_dm.c((byte) -67);
              hi.field_r = var4_ref_dm.field_j.length;
              om.field_g.field_m = 0;
              for (var5_int = 0; var5_int < hi.field_r; var5_int++) {
                om.field_g.field_g[var5_int] = var4_ref_dm.field_j[var5_int];
              }
              g.field_q = f.field_t;
              f.field_t = jj.field_b;
              jj.field_b = cd.field_v;
              cd.field_v = var4_ref_dm.field_i;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("rg.A(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
        stackIn_22_0 = eh.field_a;
        try {
          while (true) {
            if (stackIn_22_0 < 0) {
              om.field_g.field_m = 0;
              if (!bo.a(30000, 1)) {
                return false;
              }
              eh.field_a = om.field_g.k(8);
              om.field_g.field_m = 0;
              hi.field_r = param0[eh.field_a];
            }
            if (!ll.d(10550)) {
              return false;
            }
            if (vj.field_a == 0) {
              g.field_q = f.field_t;
              f.field_t = jj.field_b;
              jj.field_b = cd.field_v;
              cd.field_v = eh.field_a;
              eh.field_a = -1;
              return true;
            }
            var4 = vj.field_a;
            if (pd.field_a != 0.0) {
              var4 = (int)((double)var4 + gk.field_a.nextGaussian() * pd.field_a);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new dm(var2_long + (long)var4, eh.field_a, new byte[hi.field_r]);
            for (var6 = 0; var6 < hi.field_r; var6++) {
              var5.field_j[var6] = om.field_g.field_g[var6];
            }
            bb.field_L.a(-12328, var5);
            eh.field_a = -1;
            stackIn_22_0 = eh.field_a;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("rg.A(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, byte[] param1) throws IOException {
        try {
          if (param0 < 31) {
            this.a(-37);
          }
          this.a(0, param1.length, (byte) 101, param1);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "rg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rg(ma param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_f = -1L;
        this.field_a = -1L;
        this.field_l = 0;
        try {
          this.field_b = param0;
          dupTemp$0 = param0.c(-26510);
          this.field_i = dupTemp$0;
          this.field_e = dupTemp$0;
          this.field_d = 0L;
          this.field_g = new byte[param1];
          this.field_h = new byte[param2];
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static lm a(String[] args, byte param1) {
        lm var2 = null;
        RuntimeException var2_ref = null;
        lm stackIn_2_0 = null;
        lm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -53) {
            stackIn_2_0 = (lm) null;
            return stackIn_2_0;
          }
          var2 = new lm(false);
          var2.field_c = args;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("rg.F(");
          if (args == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = "Names cannot contain consecutive spaces";
    }
}
