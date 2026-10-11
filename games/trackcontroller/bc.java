/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bc implements Runnable {
    static long[] field_a;
    private InputStream field_g;
    private int field_h;
    private OutputStream field_b;
    static int field_o;
    private java.net.Socket field_k;
    private int field_n;
    private uf field_m;
    private boolean field_j;
    static int[][] field_c;
    private ce field_f;
    private byte[] field_e;
    private boolean field_l;
    private int field_i;
    static boolean field_d;

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        if (param1 <= -58) {
          return param0 + 1;
        }
        return -67;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var4 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          if (param0 != -6) {
            var7 = (CharSequence) null;
            bc.a((byte) 8, (CharSequence) null);
          }
          for (var4 = 0; var2_int > var4; var4++) {
            {
              var5 = param1.charAt(var4);
              if ((var5 <= 0 ||
                var5 >= 128) && (var5 < 160 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
          }
          stackIn_69_0 = var3;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("bc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    final static ck a(int param0, byte[] param1) {
        ck var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        Object stackIn_2_0 = null;
        ck stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (ck) (stackIn_2_0);
          }
          if (param0 != 12587) {
            var3 = (CharSequence) null;
            bc.a((byte) -122, (CharSequence) null);
          }
          var2 = new ck(param1, ka.field_f, vb.field_a, cf.field_p, j.field_f, qe.field_z, qk.field_M);
          ff.b(26);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("bc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    protected final void finalize() {
        this.d(16777215);
    }

    final int b(int param0) throws IOException {
        if (param0 != 0) {
          CharSequence var3 = (CharSequence) null;
          bc.a((byte) 44, (CharSequence) null);
          if (this.field_j) {
            return 0;
          }
          return this.field_g.available();
        }
        if (this.field_j) {
          return 0;
        }
        return this.field_g.available();
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          if (this.field_j) {
            return;
          }
          while (0 < param2) {
            var5_int = this.field_g.read(param0, param3, param2);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param2 = param2 - var5_int;
            param3 = param3 + var5_int;
          }
          if (param1 == 0) {
            return;
          }
          this.field_b = (OutputStream) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("bc.I(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void d(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          InterruptedException var2_ref = null;
          int var4 = 0;
          byte[] var5 = null;
          var4 = TrackController.field_F ? 1 : 0;
          if (param0 != 16777215) {
            var5 = (byte[]) null;
            bc.a(-6, (byte[]) null);
          }
          if (this.field_j) {
            return;
          }
          var2 = this;
          synchronized (var2) {
            this.field_j = true;
            this.notifyAll();
          }
          if (null != this.field_f) {
            while (this.field_f.field_f == 0) {
              wl.a(1L, false);
            }
            if (this.field_f.field_f == 1) {
              try {
                ((Thread) (this.field_f.field_e)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                this.field_f = null;
                return;
              }
            }
          }
          this.field_f = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = TrackController.field_F ? 1 : 0;
        try {
          var5_int = param2 + param4;
          var6 = param3 + param0;
          if (ll.field_a >= param4) {
            stackIn_4_0 = ll.field_a;
          } else {
            stackIn_4_0 = param4;
          }
          var7 = stackIn_4_0;
          if (ll.field_b < param3) {
            stackIn_7_0 = param3;
          } else {
            stackIn_7_0 = ll.field_b;
          }
          var8 = stackIn_7_0;
          if (ll.field_e > var5_int) {
            stackIn_10_0 = var5_int;
          } else {
            stackIn_10_0 = ll.field_e;
          }
          var9 = stackIn_10_0;
          if (param1 != -28846) {
            field_a = (long[]) null;
          }
          if (ll.field_g <= var6) {
            stackIn_15_0 = ll.field_g;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (param4 >= ll.field_a &&
            param4 < ll.field_e) {
            var11 = param4 + var8 * ll.field_d;
            var12 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              ll.field_i[var11] = 16777215;
              var11 = var11 + ll.field_d * 2;
            }
          }
          if (ll.field_b <= param3 &&
            ll.field_g > var6) {
            var11Lifetime1 = var7 + param3 * ll.field_d;
            var12Lifetime1 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              ll.field_i[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (ll.field_a <= var5_int &&
            ll.field_e > var5_int) {
            var11Lifetime2 = ((1 & -param4 + var5_int) + var8) * ll.field_d + var5_int;
            var12Lifetime2 = 1 + var10 - var8 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              ll.field_i[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + ll.field_d * 2;
            }
          }
          if (param3 >= ll.field_b &&
            var6 < ll.field_g) {
            var11Lifetime3 = ll.field_d * var6 + var7 + (1 & -param3 + var6);
            var12Lifetime3 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              ll.field_i[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var5), "bc.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    bc(java.net.Socket param0, uf param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (this.field_j) {
            return;
          }
          if (this.field_l) {
            this.field_l = false;
            throw new IOException();
          }
          if (this.field_e == null) {
            this.field_e = new byte[this.field_n];
          }
          var5 = this;
          synchronized (var5) {
            if (param0 >= -101) {
              this.field_k = (java.net.Socket) null;
            }
            for (var6 = 0; param2 > var6; var6++) {
              this.field_e[this.field_h] = param1[param3 + var6];
              this.field_h = (1 + this.field_h) % this.field_n;
              if ((-100 + (this.field_n + this.field_i)) % this.field_n == this.field_h) {
                throw new IOException();
              }
            }
            if (this.field_f == null) {
              this.field_f = this.field_m.a(3, (Runnable) (this), 17);
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("bc.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(')').toString());
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
          var6 = TrackController.field_F ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_i == this.field_h) {
                  if (this.field_j) {
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
                  if (this.field_h < this.field_i) {
                    var1_int = -this.field_i + this.field_n;
                  } else {
                    var1_int = -this.field_i + this.field_h;
                  }
                  var2 = this.field_i;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (null != this.field_g) {
                    this.field_g.close();
                  }
                  if (null != this.field_b) {
                    this.field_b.close();
                  }
                  if (null != this.field_k) {
                    this.field_k.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_e = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_b.write(this.field_e, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_l = true;
              }
              this.field_i = (this.field_i + var1_int) % this.field_n;
              try {
                if (this.field_i == this.field_h) {
                  this.field_b.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_l = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            hb.a((Throwable) ((Object) var1_ref), 0, (String) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) throws IOException {
        if (this.field_j) {
          return;
        }
        if (this.field_l) {
          this.field_l = false;
          throw new IOException();
        }
        if (!param0) {
          byte[] var3 = (byte[]) null;
          bc.a(113, (byte[]) null);
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != 32) {
          return;
        }
        field_a = null;
        field_c = (int[][]) null;
    }

    final int a(int param0) throws IOException {
        if (param0 > -23) {
          return 58;
        }
        if (this.field_j) {
          return 0;
        }
        return this.field_g.read();
    }

    private bc(java.net.Socket param0, uf param1, int param2) throws IOException {
        this.field_h = 0;
        this.field_j = false;
        this.field_l = false;
        this.field_i = 0;
        try {
          this.field_m = param1;
          this.field_k = param0;
          this.field_k.setSoTimeout(30000);
          this.field_k.setTcpNoDelay(true);
          this.field_g = this.field_k.getInputStream();
          this.field_b = this.field_k.getOutputStream();
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new long[32];
        field_o = 50;
    }
}
