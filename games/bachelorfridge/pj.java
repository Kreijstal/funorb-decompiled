/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pj implements Runnable {
    static int[][] field_b;
    static int[] field_o;
    private int field_q;
    private byte[] field_d;
    static int[] field_l;
    private boolean field_g;
    private boolean field_r;
    private ht field_i;
    private InputStream field_f;
    static int[] field_c;
    private eh field_m;
    private int field_j;
    static int[] field_h;
    private int field_e;
    private OutputStream field_p;
    private java.net.Socket field_k;
    static kf field_n;
    static String field_a;

    final int b(int param0) throws IOException {
        if (this.field_g) {
          return 0;
        }
        int var2 = 120 / ((param0 - 21) / 63);
        return this.field_f.available();
    }

    protected final void finalize() {
        this.a((byte) 55);
    }

    final void c(byte param0) throws IOException {
        if (param0 != 34) {
          pj.a(100, 22, -76, 55, -23, -24, -104);
        }
        if (this.field_g) {
          return;
        }
        if (this.field_r) {
          this.field_r = false;
          throw new IOException();
        }
    }

    pj(java.net.Socket param0, ht param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0) {
        try {
          int var4 = 0;
          vr var5 = null;
          var4 = BachelorFridge.field_y;
          if (this.field_g) {
            return;
          }
          synchronized (this) {
            this.field_g = true;
            this.notifyAll();
            if (param0 < 26) {
              var5 = (vr) null;
              pj.a(true, (vr) null);
            }
          }
          if (null != this.field_m) {
            while (this.field_m.field_f == 0) {
              gda.a(false, 1L);
            }
            if (this.field_m.field_f == 1) {
              try {
                ((Thread) (this.field_m.field_e)).join();
              } catch (InterruptedException interruptedException) {
              }
            }
          }
          this.field_m = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, vr param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = BachelorFridge.field_y;
        try {
          bk.field_v = param1;
          bca.field_n = new al[50][12];
          if (!param0) {
            return;
          }
          for (var2_int = 0; var2_int < 50; var2_int++) {
            for (var3 = 0; var3 < 12; var3++) {
              bca.field_n[var2_int][var3] = new al((hs) null);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("pj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1, long param2) {
        CharSequence var6 = null;
        try {
          gk.field_d = 2;
          bd.field_k = param0;
          var6 = (CharSequence) ((Object) param0);
          df.field_s = fq.a(0, var6);
          eaa.field_a = param2;
          bb.h(0);
          if (param1 <= 42) {
            vr var5 = (vr) null;
            pj.a(true, (vr) null);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "pj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        try {
          if (this.field_g) {
            return;
          }
          if (this.field_r) {
            this.field_r = false;
            throw new IOException();
          }
          if (null == this.field_d) {
            this.field_d = new byte[this.field_e];
          }
          var5 = this;
          synchronized (var5) {
            if (param2) {
              field_a = (String) null;
            }
            for (var6 = 0; param3 > var6; var6++) {
              this.field_d[this.field_j] = param1[var6 + param0];
              this.field_j = (1 + this.field_j) % this.field_e;
              if (this.field_j == (this.field_e + this.field_q - 100) % this.field_e) {
                throw new IOException();
              }
            }
            if (null == this.field_m) {
              this.field_m = this.field_i.a((Runnable) (this), 2, 3);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var5_ref;
          stackIn_25_1 = new StringBuilder().append("pj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param1 < 63) {
            this.field_k = (java.net.Socket) null;
          }
          if (this.field_g) {
            return;
          }
          while (param3 > 0) {
            var5_int = this.field_f.read(param2, param0, param3);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param3 = param3 - var5_int;
            param0 = param0 + var5_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pj.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = (int[][]) null;
        int var1 = 34 % ((57 - param0) / 37);
        field_o = null;
        field_l = null;
        field_n = null;
        field_a = null;
        field_c = null;
        field_h = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var21 = 0;
        int var23 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime1Lifetime1;
        int var17Lifetime1Lifetime1;
        int var18Lifetime1Lifetime1;
        int var19Lifetime1Lifetime1;
        var23 = BachelorFridge.field_y;
        try {
          gp.a(true, param4);
          var7_int = 0;
          var8 = param4 - param1;
          if (var8 < 0) {
            var8 = 0;
          }
          var9 = param4;
          if (param2 != 170) {
            pj.a(-84, 121, -44, 18, 93, 118, -63);
          }
          var10 = -param4;
          var11 = var8;
          var12 = -var8;
          var13 = -1;
          var14 = -1;
          if (an.field_q <= param0 &&
            param0 <= ha.field_n) {
            var39 = tj.field_b[param0];
            var16 = cr.a(eo.field_l, param3 - param4, pw.field_x, 0);
            var17 = cr.a(eo.field_l, param3 + param4, pw.field_x, param2 - 170);
            var18 = cr.a(eo.field_l, -var8 + param3, pw.field_x, param2 ^ 170);
            var19 = cr.a(eo.field_l, var8 + param3, pw.field_x, param2 - 170);
            hba.a(param5, var16, var39, 7, var18);
            hba.a(param6, var18, var39, param2 - 163, var19);
            hba.a(param5, var19, var39, 7, var17);
          }
          while (true) {
            if (var7_int >= var9) {
              return;
            }
            var13 += 2;
            var14 += 2;
            var10 = var10 + var13;
            var12 = var12 + var14;
            if (var12 >= 0 &&
              var11 >= 1) {
              var11--;
              var12 = var12 - (var11 << 1);
              it.field_l[var11] = var7_int;
            }
            var7_int++;
            if (var10 >= 0) {
              var9--;
              var10 = var10 - (var9 << 1);
              var15 = -var9 + param0;
              var16Lifetime1 = param0 + var9;
              if (var16Lifetime1 >= an.field_q &&
                ha.field_n >= var15) {
                if (var8 > var9) {
                  var17Lifetime1 = it.field_l[var9];
                  var18Lifetime1 = cr.a(eo.field_l, var7_int + param3, pw.field_x, param2 - 170);
                  var19Lifetime1 = cr.a(eo.field_l, param3 - var7_int, pw.field_x, 0);
                  var20 = cr.a(eo.field_l, param3 + var17Lifetime1, pw.field_x, 0);
                  var21 = cr.a(eo.field_l, -var17Lifetime1 + param3, pw.field_x, 0);
                  if (ha.field_n >= var16Lifetime1) {
                    var40 = tj.field_b[var16Lifetime1];
                    hba.a(param5, var19Lifetime1, var40, 7, var21);
                    hba.a(param6, var21, var40, 7, var20);
                    hba.a(param5, var20, var40, 7, var18Lifetime1);
                  }
                  if (an.field_q <= var15) {
                    var41 = tj.field_b[var15];
                    hba.a(param5, var19Lifetime1, var41, 7, var21);
                    hba.a(param6, var21, var41, param2 ^ 173, var20);
                    hba.a(param5, var20, var41, 7, var18Lifetime1);
                  }
                } else {
                  var17Lifetime1 = cr.a(eo.field_l, var7_int + param3, pw.field_x, 0);
                  var18Lifetime1 = cr.a(eo.field_l, -var7_int + param3, pw.field_x, 0);
                  if (ha.field_n >= var16Lifetime1) {
                    hba.a(param5, var18Lifetime1, tj.field_b[var16Lifetime1], 7, var17Lifetime1);
                  }
                  if (an.field_q <= var15) {
                    hba.a(param5, var18Lifetime1, tj.field_b[var15], 7, var17Lifetime1);
                  }
                }
              }
            }
            var15Lifetime1 = param0 - var7_int;
            var16Lifetime1Lifetime1 = param0 + var7_int;
            if (var16Lifetime1Lifetime1 < an.field_q) {
              continue;
            }
            if (ha.field_n < var15Lifetime1) {
              continue;
            }
            var17Lifetime1Lifetime1 = param3 + var9;
            var18Lifetime1Lifetime1 = -var9 + param3;
            if (eo.field_l > var17Lifetime1Lifetime1) {
              continue;
            }
            if (pw.field_x < var18Lifetime1Lifetime1) {
              continue;
            }
            var17Lifetime1Lifetime1 = cr.a(eo.field_l, var17Lifetime1Lifetime1, pw.field_x, param2 ^ 170);
            var18Lifetime1Lifetime1 = cr.a(eo.field_l, var18Lifetime1Lifetime1, pw.field_x, 0);
            if (var7_int >= var8) {
              if (var16Lifetime1Lifetime1 <= ha.field_n) {
                hba.a(param5, var18Lifetime1Lifetime1, tj.field_b[var16Lifetime1Lifetime1], 7, var17Lifetime1Lifetime1);
              }
              if (var15Lifetime1 < an.field_q) {
                continue;
              }
              hba.a(param5, var18Lifetime1Lifetime1, tj.field_b[var15Lifetime1], param2 - 163, var17Lifetime1Lifetime1);
              continue;
            }
            if (var11 < var7_int) {
              stackIn_38_0 = it.field_l[var7_int];
            } else {
              stackIn_38_0 = var11;
            }
            var19Lifetime1Lifetime1 = stackIn_38_0;
            var20Lifetime1 = cr.a(eo.field_l, param3 + var19Lifetime1Lifetime1, pw.field_x, 0);
            var21Lifetime1 = cr.a(eo.field_l, -var19Lifetime1Lifetime1 + param3, pw.field_x, 0);
            if (ha.field_n >= var16Lifetime1Lifetime1) {
              var42 = tj.field_b[var16Lifetime1Lifetime1];
              hba.a(param5, var18Lifetime1Lifetime1, var42, 7, var21Lifetime1);
              hba.a(param6, var21Lifetime1, var42, 7, var20Lifetime1);
              hba.a(param5, var20Lifetime1, var42, 7, var17Lifetime1Lifetime1);
            }
            if (an.field_q > var15Lifetime1) {
              continue;
            }
            var43 = tj.field_b[var15Lifetime1];
            hba.a(param5, var18Lifetime1Lifetime1, var43, 7, var21Lifetime1);
            hba.a(param6, var21Lifetime1, var43, param2 ^ 173, var20Lifetime1);
            hba.a(param5, var20Lifetime1, var43, 7, var17Lifetime1Lifetime1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var7), "pj.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final void run() {
        try {
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          Exception var1_ref = null;
          int var2 = 0;
          Object var3 = null;
          IOException var3_ref = null;
          InterruptedException var4 = null;
          int var6 = 0;
          String var7 = null;
          var6 = BachelorFridge.field_y;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_j == this.field_q) {
                  if (this.field_g) {
                    decompiledRegionSelector0 = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    try {
                      this.wait();
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var4 = (InterruptedException) (Object) decompiledCaughtException;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (this.field_q <= this.field_j) {
                    var1_int = -this.field_q + this.field_j;
                  } else {
                    var1_int = this.field_e - this.field_q;
                  }
                  var2 = this.field_q;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_f != null) {
                    this.field_f.close();
                  }
                  if (this.field_p != null) {
                    this.field_p.close();
                  }
                  if (this.field_k != null) {
                    this.field_k.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_d = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_p.write(this.field_d, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_r = true;
              }
              this.field_q = (var1_int + this.field_q) % this.field_e;
              try {
                if (this.field_q == this.field_j) {
                  this.field_p.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_r = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            cv.a(1, (String) null, (Throwable) ((Object) var1_ref));
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private pj(java.net.Socket param0, ht param1, int param2) throws IOException {
        this.field_q = 0;
        this.field_r = false;
        this.field_g = false;
        this.field_j = 0;
        try {
          this.field_k = param0;
          this.field_i = param1;
          this.field_k.setSoTimeout(30000);
          this.field_k.setTcpNoDelay(true);
          this.field_f = this.field_k.getInputStream();
          this.field_p = this.field_k.getOutputStream();
          this.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int b(byte param0) throws IOException {
        if (this.field_g) {
          return 0;
        }
        if (param0 != -47) {
          vr var3 = (vr) null;
          pj.a(true, (vr) null);
        }
        return this.field_f.read();
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, kv[] param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        try {
          if (param5 != null &&
            0 < param4) {
            var6_int = param5[0].field_n;
            var7 = param5[2].field_n;
            var8 = param5[1].field_n;
            param5[0].e(param0, param3, param1);
            param5[2].e(param4 + param0 - var7, param3, param1);
            dg.a(eha.field_q);
            dg.c(var6_int + param0, param3, -var7 + (param0 + param4), param3 + param5[1].field_o);
            var9 = var6_int + param0;
            var10 = param0 + param4 - var7;
            for (param0 = var9; var10 > param0; param0 = param0 + var8) {
              param5[1].e(param0, param3, param1);
            }
            if (param2 != 447) {
              field_b = (int[][]) null;
            }
            dg.b(eha.field_q);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("pj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_o = new int[16];
        field_b = new int[16][];
        field_l = new int[16];
        field_c = new int[16];
        field_h = new int[16];
        ku.a(46, 460, new int[]{0, 5, 1, 33, 4, 22, 19}, 190, 170, 36, 0);
        ku.a(-117, 460, new int[]{2, 20, 21, 5, 9}, 132, 170, 36, 1);
        ku.a(-57, 460, new int[]{2, 20, 21, 5, 10, 11, 13}, 34, 170, 36, 2);
        ku.a(-57, 460, new int[]{12, 34}, 200, 170, 36, 3);
        ku.a(97, 460, new int[]{2, 20, 21, 5, 13}, 34, 170, 36, 4);
        ku.a(40, 460, new int[]{17, 18, 23, 8}, 410, 180, 36, 5);
        ku.a(-58, 460, new int[]{25, 8, 26}, 447, 70, 36, 6);
        ku.a(-91, 460, new int[]{23, 8}, 400, 180, 36, 7);
        ku.a(26, 460, new int[]{23, 8}, 400, 180, 36, 8);
        ku.a(-55, 460, new int[]{23, 24}, 400, 180, 36, 9);
        ku.a(-81, 460, new int[]{7}, 400, 290, 36, 10);
        ku.a(101, 460, new int[]{}, 200, 170, 36, 11);
        ku.a(-108, 460, new int[]{27, 28, 29}, 200, 170, 36, 12);
        ku.a(42, 460, new int[]{30, 31}, 200, 170, 36, 13);
        ku.a(-101, 460, new int[]{20, 21, 6, 7}, 200, 170, 36, 14);
        ku.a(-97, 460, new int[]{20, 21, 6, 8}, 237, 170, 36, 15);
        field_a = "Spectating...";
        field_n = new kf();
    }
}
