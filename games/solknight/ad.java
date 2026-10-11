/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ad implements Runnable {
    private int field_f;
    private boolean field_p;
    private boolean field_n;
    private byte[] field_a;
    private nj field_d;
    static int field_h;
    static String field_o;
    static hd field_b;
    private int field_j;
    private InputStream field_l;
    private java.net.Socket field_e;
    private dl field_k;
    static String[] field_c;
    private OutputStream field_g;
    static int field_m;
    private int field_i;

    public static void a(byte param0) {
        field_o = null;
        field_b = null;
        if (param0 < 64) {
          field_c = (String[]) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -11) {
            field_o = (String) null;
          }
          stackIn_5_0 = (mc.a(param1, (byte) 105) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ad.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var6 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          if (this.field_n) {
            return;
          }
          if (this.field_p) {
            this.field_p = false;
            throw new IOException();
          }
          if (this.field_a == null) {
            this.field_a = new byte[this.field_f];
          }
          var5 = this;
          synchronized (var5) {
            for (var6 = 0; param2 > var6; var6++) {
              this.field_a[this.field_j] = param3[param1 + var6];
              this.field_j = (1 + this.field_j) % this.field_f;
              if (this.field_j == (-100 + (this.field_f + this.field_i)) % this.field_f) {
                throw new IOException();
              }
            }
            if (param0 != -28748) {
              field_c = (String[]) null;
            }
            if (this.field_d == null) {
              this.field_d = this.field_k.a(3, -29, (Runnable) (this));
            }
            this.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("ad.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
          this.run();
          if (this.field_n) {
            return;
          }
          if (!this.field_p) {
            return;
          }
          this.field_p = false;
          throw new IOException();
        }
        if (this.field_n) {
          return;
        }
        if (!this.field_p) {
          return;
        }
        this.field_p = false;
        throw new IOException();
    }

    final int b(int param0) throws IOException {
        if (param0 != -30119) {
          String var3 = (String) null;
          ad.a((byte) -118, (String) null);
          if (this.field_n) {
            return 0;
          }
          return this.field_l.available();
        }
        if (this.field_n) {
          return 0;
        }
        return this.field_l.available();
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
          var6 = SolKnight.field_L ? 1 : 0;
          try {
            while (true) {
              var3 = this;
              synchronized (var3) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_i == this.field_j) {
                  if (this.field_n) {
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
                  var2 = this.field_i;
                  if (this.field_j >= this.field_i) {
                    var1_int = -this.field_i + this.field_j;
                  } else {
                    var1_int = this.field_f - this.field_i;
                  }
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                try {
                  if (this.field_l != null) {
                    this.field_l.close();
                  }
                  if (null != this.field_g) {
                    this.field_g.close();
                  }
                  if (null != this.field_e) {
                    this.field_e.close();
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var1 = (IOException) (Object) decompiledCaughtException;
                }
                this.field_a = null;
                break;
              }
              if (var1_int <= 0) {
                continue;
              }
              try {
                this.field_g.write(this.field_a, var2, var1_int);
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_p = true;
              }
              this.field_i = (var1_int + this.field_i) % this.field_f;
              try {
                if (this.field_i == this.field_j) {
                  this.field_g.flush();
                }
              } catch (java.io.IOException decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref = (IOException) (Object) decompiledCaughtException;
                this.field_p = true;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter4) {
            decompiledCaughtException = decompiledCaughtParameter4;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            var7 = (String) null;
            hi.a((Throwable) ((Object) var1_ref), (String) null, 1);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ad(java.net.Socket param0, dl param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static int a(int param0, int param1, int param2) {
        if (null == dh.field_j) {
          return -1;
        }
        if (param2 == 0) {
          if (param1 >= sa.field_m &&
            sa.field_m + dh.field_j.field_p > param1 &&
            param0 >= da.field_f &&
            dh.field_j.field_t + da.field_f > param0) {
            return 0;
          }
        } else {
          field_b = (hd) null;
          if (param1 < sa.field_m) {
            if (ke.field_I > param1) {
              return -1;
            }
            if (ke.field_I + dh.field_j.field_p <= param1) {
              return -1;
            }
            if (lk.field_c > param0) {
              return -1;
            }
            if (param0 >= dh.field_j.field_t + lk.field_c) {
              return -1;
            }
            return 1;
          }
          if (sa.field_m + dh.field_j.field_p <= param1) {
            if (ke.field_I > param1) {
              return -1;
            }
            if (ke.field_I + dh.field_j.field_p <= param1) {
              return -1;
            }
            if (lk.field_c > param0) {
              return -1;
            }
            if (param0 >= dh.field_j.field_t + lk.field_c) {
              return -1;
            }
            return 1;
          }
          if (param0 >= da.field_f &&
            dh.field_j.field_t + da.field_f > param0) {
            return 0;
          }
        }
        if (ke.field_I > param1) {
          return -1;
        }
        if (ke.field_I + dh.field_j.field_p <= param1) {
          return -1;
        }
        if (lk.field_c > param0) {
          return -1;
        }
        if (param0 < dh.field_j.field_t + lk.field_c) {
          return 1;
        }
        return -1;
    }

    final int a(int param0) throws IOException {
        if (this.field_n) {
          return 0;
        }
        if (param0 > -104) {
          this.run();
          return this.field_l.read();
        }
        return this.field_l.read();
    }

    protected final void finalize() {
        this.d(2);
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        if (this.field_n) {
          return;
        }
        try {
          while (param2 > 0) {
            var5_int = this.field_l.read(param3, param1, param2);
            if (var5_int <= 0) {
              throw new EOFException();
            }
            param2 = param2 - var5_int;
            param1 = param1 + var5_int;
          }
          if (param0 <= 32) {
            this.field_l = (InputStream) null;
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ad.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static pc b(byte param0, String param1) {
        pc stackIn_4_0 = null;
        pc stackIn_7_0 = null;
        pc stackIn_11_0 = null;
        int stackIn_19_0 = 0;
        pc stackIn_24_0 = null;
        pc stackIn_37_0 = null;
        pc stackIn_42_0 = null;
        Object stackIn_46_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = h.field_a;
            return stackIn_4_0;
          }
          if (64 < var2_int) {
            stackIn_7_0 = el.field_o;
            return stackIn_7_0;
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(var2_int - 1) != 34) {
              stackIn_11_0 = si.field_C;
              return stackIn_11_0;
            }
            var3 = 0;
            for (var4 = 1; var2_int - 1 > var4; var4++) {
              var5 = param1.charAt(var4);
              if (var5 != 92) {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_24_0 = si.field_C;
                  return stackIn_24_0;
                }
                var3 = 0;
              } else {
                stackIn_19_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_19_0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (0 != var4Lifetime1 &&
                -1 + var2_int != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_37_0 = si.field_C;
                return stackIn_37_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (ab.field_q.indexOf(var5Lifetime1) == -1) {
                stackIn_42_0 = si.field_C;
                return stackIn_42_0;
              }
              var3Lifetime1 = 0;
            }
          }
          var4Lifetime2 = 107 % ((param0 + 79) / 45);
          stackIn_46_0 = null;
          return (pc) (stackIn_46_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_49_0 = var2;
          stackIn_49_1 = new StringBuilder().append("ad.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    final static int c(int param0) {
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          if (param0 <= 64) {
            field_b = (hd) null;
          }
          while (wk.a((byte) -56)) {
            bc.field_K.a(true);
            if (bc.field_K.d((byte) -38)) {
              var1_int = 1;
            }
            if (13 != el.field_n) {
              continue;
            }
            var2 = 1;
          }
          bc.field_K.a(-121, uc.a(gb.field_j, 1691746689, field_m), uc.a(db.field_o, 1691746689, s.field_gb));
          if (bc.field_K.d((byte) -36)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            bc.field_K.field_f >= 0) {
            var3 = fl.field_b[bc.field_K.field_f];
            if (var3 == 2) {
              kh.a(-78);
            } else if (5 == var3) {
              kh.a(-78);
            }
          } else {
            if (var2 != 0 &&
              te.field_M != 2) {
              kh.a(-89);
            }
          }
          if (0 == var3 &&
            te.field_M == 2) {
            var4 = je.a(1) - fg.field_f;
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (0 >= var6) {
              hc.a(true, true, 5);
              var3 = 2;
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "ad.C(" + param0 + ')');
        }
    }

    final void d(int param0) {
        try {
          InterruptedException var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = SolKnight.field_L ? 1 : 0;
          if (this.field_n) {
            return;
          }
          var2_ref = this;
          synchronized (var2_ref) {
            if (param0 != 2) {
              field_m = -24;
            }
            this.field_n = true;
            this.notifyAll();
          }
          if (null != this.field_d) {
            while (0 == this.field_d.field_c) {
              i.a((byte) 56, 1L);
            }
            if (this.field_d.field_c == 1) {
              try {
                ((Thread) (this.field_d.field_e)).join();
              } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (InterruptedException) (Object) decompiledCaughtException;
              }
            }
          }
          this.field_d = null;
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private ad(java.net.Socket param0, dl param1, int param2) throws IOException {
        this.field_n = false;
        this.field_j = 0;
        this.field_i = 0;
        this.field_p = false;
        try {
          this.field_k = param1;
          this.field_e = param0;
          this.field_e.setSoTimeout(30000);
          this.field_e.setTcpNoDelay(true);
          this.field_l = this.field_e.getInputStream();
          this.field_g = this.field_e.getOutputStream();
          this.field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_o = "Friends can be added in multiplayer<nbsp>games";
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_m = 0;
    }
}
