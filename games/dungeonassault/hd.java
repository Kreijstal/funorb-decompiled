/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hd {
    private int field_d;
    private int field_l;
    private long field_k;
    private byte[] field_n;
    static java.lang.reflect.Constructor field_h;
    private long field_a;
    private long field_c;
    private long field_b;
    private qp field_f;
    static int[] field_j;
    private long field_i;
    private long field_p;
    private byte[] field_o;
    static java.lang.reflect.Method field_e;
    static String[] field_m;
    static od field_g;

    final void c(byte param0) throws IOException {
        this.d((byte) -117);
        int var2 = 44 % ((19 - param0) / 58);
        this.field_f.a(0);
    }

    private final void d(byte param0) throws IOException {
        int var2;
        long var3;
        long var5;
        int var7;
        int var8;
        var8 = DungeonAssault.field_K;
        var2 = 81 % ((param0 - 50) / 55);
        if (-1L != this.field_c) {
          if (~this.field_a != ~this.field_c) {
            this.field_f.a(this.field_c, 18);
            this.field_a = this.field_c;
          }
          this.field_f.a(0, 105, this.field_n, this.field_d);
          this.field_a = this.field_a + (long)this.field_d;
          if (this.field_i < this.field_a) {
            this.field_i = this.field_a;
          }
          var3 = -1L;
          if (this.field_c >= this.field_b &&
            ((long)this.field_l + this.field_b) > this.field_c) {
            var3 = this.field_c;
          } else {
            if (this.field_b >= this.field_c &&
              this.field_b < ((long)this.field_d + this.field_c)) {
              var3 = this.field_b;
            }
          }
          var5 = -1L;
          if (this.field_b < ((long)this.field_d + this.field_c) &&
            ((long)this.field_l + this.field_b) >= ((long)this.field_d + this.field_c)) {
            var5 = this.field_c + (long)this.field_d;
          } else {
            if (((long)this.field_l + this.field_b) > this.field_c &&
              ((long)this.field_l + this.field_b) <= ((long)this.field_d + this.field_c)) {
              var5 = (long)this.field_l + this.field_b;
            }
          }
          if (var3 > -1L &&
            var5 > var3) {
            var7 = (int)(var5 - var3);
            cj.a(this.field_n, (int)(var3 - this.field_c), this.field_o, (int)(var3 - this.field_b), var7);
          }
          this.field_d = 0;
          this.field_c = -1L;
        }
    }

    public static void b(byte param0) {
        field_h = null;
        int var1 = 33 % ((param0 - 52) / 62);
        field_e = null;
        field_j = null;
        field_m = null;
        field_g = null;
    }

    final static void a(String param0, java.awt.Color param1, boolean param2, byte param3, int param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = c.field_h.getGraphics();
            if (td.field_a == null) {
              td.field_a = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param2) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, up.field_d, eg.field_d);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (bb.field_e == null) {
                bb.field_e = c.field_h.createImage(304, 34);
              }
              var10 = bb.field_e.getGraphics();
              var10.setColor(param1);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, param4 * 3, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(2 + param4 * 3, 2, 300 - param4 * 3, 30);
              var10.setFont(td.field_a);
              if (param3 != 105) {
                field_g = (od) null;
              }
              var10.setColor(java.awt.Color.white);
              var10.drawString(param0, (304 - param0.length() * 6) / 2, 22);
              var9.drawImage(bb.field_e, up.field_d / 2 - 152, eg.field_d / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + up.field_d / 2;
              var8 = eg.field_d / 2 - 18;
              var9.setColor(param1);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, param4 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, var8 + 1, 301, 31);
              var9.fillRect(2 + (var7 + param4 * 3), var8 + 2, -(param4 * 3) + 300, 30);
              var9.setFont(td.field_a);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param0, var7 + (-(6 * param0.length()) + 304) / 2, 22 + var8);
            }
            if (bb.field_f != null) {
              var9.setFont(td.field_a);
              var9.setColor(java.awt.Color.white);
              var9.drawString(bb.field_f, up.field_d / 2 - 6 * bb.field_f.length() / 2, -26 + eg.field_d / 2);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            c.field_h.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("hd.M(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, String param2, boolean param3) {
        tn.a(-1);
        lg.field_w.h(1);
        wo.field_e = new dn(co.field_C, (String) null, qc.field_t, param3, param1);
        if (param0 != 8192) {
          return;
        }
        try {
          ta.field_a = new jk(lg.field_w, wo.field_e);
          lg.field_w.a(ta.field_a, -1);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "hd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        kj var4_ref_kj = null;
        mm var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        wj var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = DungeonAssault.field_K;
        try {
          if (param0) {
            field_j = (int[]) null;
          }
          var9 = ra.field_c;
          var2 = var9.c(true);
          var3 = var9.c(true);
          if (var2 == 0) {
            var4_ref_kj = (kj) (cc.field_i.e(-24172));
            if (var4_ref_kj == null) {
              tl.a(-21);
              return;
            }
            var5_int = nj.field_b - var9.field_o;
            var11 = var4_ref_kj.field_l;
            var10 = var11;
            var6 = var10;
            if (var5_int > var11.length << 2) {
              var5_int = var11.length << 2;
            }
            for (var7 = 0; var5_int > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.c(true) << nb.a(768, var7 << 8));
            }
            var4_ref_kj.a(false);
            return;
          }
          if (1 == var2) {
            var4 = var9.l(0);
            var5 = (mm) (m.field_a.e(-24172));
            while (var5 != null) {
              if (var3 != var5.field_p ||
                var5.field_r != var4) {
                var5 = (mm) (m.field_a.a(4));
                continue;
              }
              break;
            }
            if (var5 == null) {
              tl.a(-23);
              return;
            }
            var5.a(false);
            return;
          }
          sm.a((Throwable) null, 1, "LR1: " + sj.l(192));
          tl.a(-51);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "hd.H(" + param0 + ')');
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != -26296) {
          return;
        }
        if (0L > param0) {
          throw new IOException();
        }
        this.field_k = param0;
    }

    private final void a(int param0) throws IOException {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = DungeonAssault.field_K;
        this.field_l = 0;
        var2 = -89 / ((param0 - 3) / 56);
        if (~this.field_k != ~this.field_a) {
          this.field_f.a(this.field_k, 18);
          this.field_a = this.field_k;
        }
        this.field_b = this.field_k;
        while (this.field_l < this.field_o.length) {
          var3 = -this.field_l + this.field_o.length;
          if (200000000 < var3) {
            var3 = 200000000;
          }
          var4 = this.field_f.a(this.field_l, -11274, var3, this.field_o);
          if (var4 != -1) {
            this.field_l = this.field_l + var4;
            this.field_a = this.field_a + (long)var4;
            continue;
          }
          break;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
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
        var14 = DungeonAssault.field_K;
        try {
          try {
            if (param2.length < param0 + param3) {
              throw new ArrayIndexOutOfBoundsException(-param2.length + (param3 + param0));
            }
            if ((long)param1 != this.field_c &&
              this.field_k >= this.field_c &&
              this.field_k + (long)param3 <= (long)this.field_d + this.field_c) {
              cj.a(this.field_n, (int)(this.field_k - this.field_c), param2, param0, param3);
              this.field_k = this.field_k + (long)param3;
              return;
            }
            var5_long = this.field_k;
            var7 = param0;
            var8 = param3;
            if (this.field_k >= this.field_b &&
              this.field_k < (long)this.field_l + this.field_b) {
              var9_int = (int)((long)this.field_l + (-this.field_k + this.field_b));
              if (param3 < var9_int) {
                var9_int = param3;
              }
              cj.a(this.field_o, (int)(-this.field_b + this.field_k), param2, param0, var9_int);
              param0 = param0 + var9_int;
              this.field_k = this.field_k + (long)var9_int;
              param3 = param3 - var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (param3 > this.field_o.length) {
              this.field_f.a(this.field_k, param1 + 19);
              this.field_a = this.field_k;
              while (param3 > 0) {
                var9_intLifetime1 = this.field_f.a(param0, -11274, param3, param2);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                this.field_a = this.field_a + (long)var9_intLifetime1;
                param3 = param3 - var9_intLifetime1;
                this.field_k = this.field_k + (long)var9_intLifetime1;
                param0 = param0 + var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (param3 > 0)) {
              this.a(-57);
              var9_intLifetime1Lifetime1 = param3;
              if (var9_intLifetime1Lifetime1 > this.field_l) {
                var9_intLifetime1Lifetime1 = this.field_l;
              }
              cj.a(this.field_o, 0, param2, param0, var9_intLifetime1Lifetime1);
              this.field_k = this.field_k + (long)var9_intLifetime1Lifetime1;
              param3 = param3 - var9_intLifetime1Lifetime1;
              param0 = param0 + var9_intLifetime1Lifetime1;
            }
            if (this.field_c != -1L) {
              if (this.field_k < this.field_c &&
                param3 > 0) {
                var9_intLifetime2 = param0 + (int)(-this.field_k + this.field_c);
                if (var9_intLifetime2 > param0 + param3) {
                  var9_intLifetime2 = param0 + param3;
                }
                while (var9_intLifetime2 > param0) {
                  param3--;
                  incrementValue$0 = param0;
                  param0++;
                  param2[incrementValue$0] = (byte) 0;
                  this.field_k = this.field_k + 1L;
                }
              }
              var9 = -1L;
              if (this.field_c >= var5_long &&
                (long)var8 + var5_long > this.field_c) {
                var9 = this.field_c;
              } else {
                if (var5_long >= this.field_c &&
                  var5_long < (this.field_c + (long)this.field_d)) {
                  var9 = var5_long;
                }
              }
              var11 = -1L;
              if (var5_long < (this.field_c + (long)this.field_d) &&
                (long)var8 + var5_long >= (long)this.field_d + this.field_c) {
                var11 = (long)this.field_d + this.field_c;
              } else {
                if ((var5_long + (long)var8) > this.field_c &&
                  ((long)this.field_d + this.field_c) >= (var5_long + (long)var8)) {
                  var11 = (long)var8 + var5_long;
                }
              }
              if (var9 > -1L &&
                var9 < var11) {
                var13 = (int)(var11 - var9);
                cj.a(this.field_n, (int)(var9 - this.field_c), param2, var7 + (int)(var9 - var5_long), var13);
                if (var11 > this.field_k) {
                  param3 = (int)((long)param3 - (-this.field_k + var11));
                  this.field_k = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_a = -1L;
            throw var5;
          }
          if (param3 > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_60_0 = var5_ref;
          stackIn_60_1 = new StringBuilder().append("hd.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
          this.a(param0, ~param0, param1, param1.length);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "hd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static cf a(boolean param0, int param1, String param2) {
        va var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        cf stackIn_5_0 = null;
        cf stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = ci.a(param2, -10396);
          if (var3 == null) {
            stackIn_2_0 = null;
            return (cf) (stackIn_2_0);
          }
          if (!param0) {
            stackIn_7_0 = new cf(var3, param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = (cf) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("hd.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
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
        var10 = DungeonAssault.field_K;
        try {
          try {
            if (this.field_k + (long)param2 > this.field_p) {
              this.field_p = (long)param2 + this.field_k;
            }
            if (param1 >= -75) {
              hd.a(true);
            }
            if (-1L != this.field_c && (this.field_c > this.field_k ||
              this.field_k > this.field_c + (long)this.field_d)) {
              this.d((byte) 115);
            }
            if (this.field_c != -1L &&
              (this.field_k + (long)param2) > ((long)this.field_n.length + this.field_c)) {
              var5_int = (int)(this.field_c - this.field_k + (long)this.field_n.length);
              cj.a(param3, param0, this.field_n, (int)(this.field_k - this.field_c), var5_int);
              param0 = param0 + var5_int;
              this.field_k = this.field_k + (long)var5_int;
              param2 = param2 - var5_int;
              this.field_d = this.field_n.length;
              this.d((byte) -92);
            }
            if (this.field_n.length >= param2) {
              if (param2 <= 0) {
                return;
              }
              if (this.field_c == -1L) {
                this.field_c = this.field_k;
              }
              cj.a(param3, param0, this.field_n, (int)(-this.field_c + this.field_k), param2);
              this.field_k = this.field_k + (long)param2;
              if (-this.field_c + this.field_k > (long)this.field_d) {
                this.field_d = (int)(this.field_k - this.field_c);
              }
              return;
            }
            if (~this.field_k != ~this.field_a) {
              this.field_f.a(this.field_k, 18);
              this.field_a = this.field_k;
            }
            this.field_f.a(param0, 102, param3, param2);
            this.field_a = this.field_a + (long)param2;
            if (this.field_a > this.field_i) {
              this.field_i = this.field_a;
            }
            var5_long = -1L;
            var7 = -1L;
            if (this.field_k >= this.field_b &&
              this.field_k < (long)this.field_l + this.field_b) {
              var5_long = this.field_k;
            } else {
              if (this.field_k <= this.field_b &&
                this.field_b < (this.field_k + (long)param2)) {
                var5_long = this.field_b;
              }
            }
            if (((long)param2 + this.field_k) > this.field_b &&
              (long)param2 + this.field_k <= this.field_b + (long)this.field_l) {
              var7 = this.field_k + (long)param2;
            } else {
              if (this.field_k < this.field_b + (long)this.field_l &&
                (this.field_b + (long)this.field_l) <= ((long)param2 + this.field_k)) {
                var7 = (long)this.field_l + this.field_b;
              }
            }
            if (var5_long > -1L &&
              var5_long < var7) {
              var9 = (int)(var7 - var5_long);
              cj.a(param3, (int)(-this.field_k + (var5_long + (long)param0)), this.field_o, (int)(var5_long - this.field_b), var9);
            }
            this.field_k = this.field_k + (long)param2;
            return;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var5 = (IOException) (Object) decompiledCaughtException;
            this.field_a = -1L;
            throw var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_54_0 = var5_ref;
          stackIn_54_1 = new StringBuilder().append("hd.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    hd(qp param0, int param1, int param2) throws IOException {
        long dupTemp$0 = 0L;
        this.field_b = -1L;
        this.field_d = 0;
        this.field_c = -1L;
        try {
          this.field_f = param0;
          dupTemp$0 = param0.a((byte) 91);
          this.field_i = dupTemp$0;
          this.field_p = dupTemp$0;
          this.field_n = new byte[param2];
          this.field_o = new byte[param1];
          this.field_k = 0L;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final long a(byte param0) {
        if (param0 != -92) {
          return -92L;
        }
        return this.field_p;
    }

    static {
        Class var2 = null;
        Class var0 = null;
        field_j = new int[8192];
        field_m = new String[]{"<%0> the Fierce", "<%0> the Cruel", "<%0> the Fell", "<%0> the Terrible", "<%0> the Savage", "<%0> the Raging", "<%0>, Bringer of Wrath", "<%0>, Lord of Chaos", "<%0> the Undefeated"};
        try {
          var2 = Class.forName("java.lang.ref.SoftReference");
          var0 = var2;
          field_h = var2.getConstructor(new Class[]{Object.class});
          Class[] var1 = (Class[]) null;
          field_e = var0.getMethod("get", (Class[]) null);
        } catch (ClassNotFoundException classNotFoundException) {
          field_h = null;
        } catch (NoSuchMethodException noSuchMethodException) {
          field_h = null;
        }
        field_g = new od();
    }
}
