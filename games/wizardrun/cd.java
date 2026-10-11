/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cd implements Runnable {
    static int field_c;
    static String field_a;
    static String field_h;
    static int field_e;
    static String field_d;
    private th field_f;
    private Thread field_i;
    private boolean field_g;
    int field_b;

    final static void a(int param0, va param1, int param2, int param3, int param4) {
        param1.b((byte) 11, 12);
        if (param2 != 20443) {
          return;
        }
        try {
          param1.b(-1947079288, 17);
          param1.b(-1947079288, param4);
          param1.b(-1947079288, param3);
          param1.b((byte) 11, param0);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "cd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          wl.a("", param0, (byte) -98);
          ga.a(param0, (byte) -72);
          if (param1 != -113) {
            va var3 = (va) null;
            cd.a(-24, (va) null, 100, -92, -33);
          }
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "cd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        try {
          if (param0 <= 58) {
            return;
          }
          this.field_g = true;
          synchronized (this.field_f) {
            this.field_f.notifyAll();
          }
          try {
            this.field_i.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_i = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0) {
        try {
          int stackIn_15_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_29_0 = 0;
          int stackIn_34_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          vh var2 = null;
          va var3 = null;
          if (param0 != -18067) {
            var2 = (vh) null;
            cd.a(true, (vh) null);
          }
          if (ii.field_f.field_k >= 4) {
            if (-1 == ii.field_f.field_n) {
              return 3;
            }
            if (ii.field_f.field_n != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (wc.field_k == 0) {
              hb.field_k = vk.field_p.a(aa.field_hb, nf.field_b, (byte) -20);
              wc.field_k = wc.field_k + 1;
            }
            if (1 == wc.field_k) {
              if (hb.field_k.field_a == 2) {
                stackIn_15_0 = mh.a((byte) -121, -1);
                return stackIn_15_0;
              }
              if (hb.field_k.field_a == 1) {
                wc.field_k = wc.field_k + 1;
              }
            }
            if (wc.field_k == 2) {
              si.field_q = new hi((java.net.Socket) (hb.field_k.field_e), vk.field_p);
              var3 = new va(13);
              cd.a(ej.field_d, var3, 20443, fg.field_c, he.field_q);
              var3.b((byte) 11, 15);
              var3.f(pg.field_j, 613003928);
              si.field_q.a(13, var3.field_k, 1, 0);
              wc.field_k = wc.field_k + 1;
              la.field_g = d.a((byte) 109) + 30000L;
            }
            if (wc.field_k == 3) {
              if (si.field_q.c((byte) 89) > 0) {
                var1_int = si.field_q.a((byte) 19);
                if (var1_int != 0) {
                  stackIn_29_0 = mh.a((byte) 85, var1_int);
                  return stackIn_29_0;
                }
                wc.field_k = wc.field_k + 1;
              } else {
                if (la.field_g < d.a((byte) 127)) {
                  stackIn_26_0 = mh.a((byte) 122, -2);
                  return stackIn_26_0;
                }
              }
            }
            if (wc.field_k != 4) {
              return -1;
            }
            ii.field_f.a(gi.field_b, si.field_q, param0 ^ -18153);
            wc.field_k = 0;
            hb.field_k = null;
            si.field_q = null;
            stackIn_34_0 = 0;
            return stackIn_34_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return mh.a((byte) 87, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static rb[] a(boolean param0, vh param1) {
        int var5 = 0;
        rb[] stackIn_4_0 = null;
        long stackIn_9_0 = 0L;
        boolean stackIn_10_1 = false;
        rb[] stackIn_13_0 = null;
        rb[] stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        rb[] var4 = null;
        rb var6 = null;
        int var7 = 0;
        jh var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = wizardrun.field_H;
        try {
          if (!param1.a(169978736)) {
            stackIn_4_0 = new rb[]{};
            return stackIn_4_0;
          }
          var8 = param1.a(false);
          while (var8.field_a == 0) {
            stackIn_9_0 = 10L;
            stackIn_10_1 = !(param0);
            tg.a(stackIn_9_0, stackIn_10_1);
          }
          if (var8.field_a == 2) {
            stackIn_13_0 = new rb[]{};
            return stackIn_13_0;
          }
          var10 = (int[]) (var8.field_e);
          var9 = var10;
          var3 = var9;
          var4 = new rb[var10.length >> 2];
          if (!param0) {
            field_d = (String) null;
          }
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new rb();
            var4[var5] = var6;
            var6.field_g = var3[var5 << 2];
            var6.field_h = var3[1 + (var5 << 2)];
            var6.field_c = var3[(var5 << 2) + 2];
            var6.field_f = var3[(var5 << 2) + 3];
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("cd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final sk a(byte param0, int param1, sg param2) {
        sk var4 = null;
        RuntimeException var4_ref = null;
        sk stackIn_2_0 = null;
        sk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -46) {
            stackIn_2_0 = (sk) null;
            return stackIn_2_0;
          }
          var4 = new sk();
          var4.field_w = param2;
          var4.field_o = (long)param1;
          var4.field_x = 3;
          var4.field_r = false;
          this.a(var4, -1);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("cd.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final sk a(byte param0, sg param1, byte[] param2, int param3) {
        sk var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        sk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new sk();
          var5.field_o = (long)param3;
          var5.field_x = 2;
          var5.field_w = param1;
          var5.field_A = param2;
          var6 = -115 % ((param0 + 68) / 43);
          var5.field_r = false;
          this.a(var5, -1);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("cd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final sk a(int param0, int param1, sg param2) {
        sk var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        sk var6 = null;
        int var8 = 0;
        sk stackIn_9_0 = null;
        sk stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = wizardrun.field_H;
        try {
          var4 = new sk();
          var4.field_x = 1;
          var5 = this.field_f;
          synchronized (var5) {
            var6 = (sk) (this.field_f.a(param1 ^ param1));
            while (var6 != null) {
              if (~var6.field_o == ~(long)param0 &&
                var6.field_w == param2 &&
                2 == var6.field_x) {
                var4.field_s = false;
                var4.field_A = var6.field_A;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var6 = (sk) (this.field_f.d(123));
            }
          }
          var4.field_A = param2.a(true, param0);
          var4.field_s = false;
          var4.field_r = true;
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("cd.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void a(sk param0, int param1) {
        synchronized (this.field_f) {
          this.field_f.a(param0, 14);
          this.field_b = this.field_b + 1;
          this.field_f.notifyAll();
          if (param1 != -1) {
            sg var5 = (sg) null;
            this.a(80, 53, (sg) null);
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_c = 7;
          field_h = null;
          field_d = null;
          field_a = null;
          return;
        }
        field_h = null;
        field_d = null;
        field_a = null;
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          sk var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = wizardrun.field_H;
          while (!this.field_g) {
            var2 = this.field_f;
            synchronized (var2) {
              var7 = (sk) (this.field_f.b(46));
              if (var7 == null) {
                try {
                  this.field_f.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.field_b = this.field_b - 1;
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              if (var7.field_x == 2) {
                var7.field_w.a(var7.field_A, (int)var7.field_o, 0, var7.field_A.length);
                var7.field_s = false;
              } else {
                if (3 == var7.field_x) {
                  var7.field_A = var7.field_w.a(true, (int)var7.field_o);
                  var7.field_s = false;
                } else {
                  var7.field_s = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              rg.a((Throwable) ((Object) var2_ref), (String) null, -562);
              var7.field_s = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    cd(vh param0) {
        jh var2 = null;
        this.field_f = new th();
        this.field_g = false;
        this.field_b = 0;
        try {
          var2 = param0.a((byte) -98, (Runnable) (this), 5);
          while (var2.field_a == 0) {
            tg.a(10L, false);
          }
          if (var2.field_a == 2) {
            throw new RuntimeException();
          }
          this.field_i = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_d = "Log in / Create account";
        field_h = "You get extra lives for collecting points.";
    }
}
