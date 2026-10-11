/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm implements Runnable {
    static int[] field_g;
    static volatile int field_a;
    private wa field_d;
    static String[] field_f;
    private Thread field_h;
    static String field_c;
    int field_b;
    static int field_e;
    private boolean field_i;

    final static void a(int param0) {
        if (param0 == -6145) {
          oj.a(4, param0 ^ -6148);
          return;
        }
        int[] var2 = (int[]) null;
        nm.a(-93, (int[]) null, 25);
        oj.a(4, param0 ^ -6148);
    }

    final void a(byte param0) {
        try {
          this.field_i = true;
          synchronized (this.field_d) {
            this.field_d.notifyAll();
          }
          try {
            this.field_h.join();
          } catch (InterruptedException interruptedException) {
          }
          if (param0 == -32) {
            this.field_h = null;
            return;
          }
          field_e = 86;
          this.field_h = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -827843803) {
            field_a = 88;
          }
          stackIn_5_0 = ((param1[param0 >> 5] & 1 << (param0 & 31)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("nm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          vl var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = MinerDisturbance.field_ab;
          while (!this.field_i) {
            var2 = this.field_d;
            synchronized (var2) {
              var7 = (vl) (this.field_d.c(8192));
              if (var7 == null) {
                try {
                  this.field_d.wait();
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
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_H != 2) {
                if (var7.field_H != 3) {
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_F = var7.field_D.a(255, (int)var7.field_p);
                  var7.field_C = false;
                }
              } else {
                var7.field_D.a(var7.field_F.length, var7.field_F, (byte) 104, (int)var7.field_p);
                var7.field_C = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              di.a((Throwable) ((Object) var2_ref), 1, (String) null);
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
              continue;
            }
            var7.field_C = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 40 / ((-81 - param1) / 45);
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          return param0 >= 6144 ? -ta.field_g[8192 - param0] : -ta.field_g[param0 - 4096];
        }
        return 2048 <= param0 ? ta.field_g[-param0 + 4096] : ta.field_g[param0];
    }

    final vl a(int param0, boolean param1, uh param2) {
        vl var4 = null;
        RuntimeException var4_ref = null;
        vl stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        vl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new vl();
          var4.field_p = (long)param0;
          var4.field_H = 3;
          stackIn_2_0 = var4;
          stackIn_3_1 = (param1);
          stackIn_2_0.field_v = stackIn_3_1;
          var4.field_D = param2;
          this.a(var4, 109);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("nm.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        if (param0) {
          nm.a(80);
        }
    }

    final vl a(byte param0, int param1, uh param2) {
        vl var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        vl var6 = null;
        int var7 = 0;
        int var9 = 0;
        vl stackIn_9_0 = null;
        vl stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var9 = MinerDisturbance.field_ab;
        try {
          var4 = new vl();
          var4.field_H = 1;
          var5 = this.field_d;
          synchronized (var5) {
            var7 = 31 / ((-10 - param0) / 39);
            var6 = (vl) (this.field_d.a(-98));
            while (var6 != null) {
              if (~var6.field_p == ~(long)param1 &&
                var6.field_D == param2 &&
                var6.field_H == 2) {
                var4.field_C = false;
                var4.field_F = var6.field_F;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var6 = (vl) (this.field_d.d(-77));
            }
          }
          var4.field_F = param2.a(255, param1);
          var4.field_C = false;
          var4.field_v = true;
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("nm.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final vl a(uh param0, boolean param1, byte[] param2, int param3) {
        vl var5 = null;
        RuntimeException var5_ref = null;
        vl stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        vl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new vl();
          var5.field_p = (long)param3;
          var5.field_D = param0;
          var5.field_F = param2;
          stackIn_2_0 = var5;
          stackIn_3_1 = (param1);
          stackIn_2_0.field_v = stackIn_3_1;
          var5.field_H = 2;
          this.a(var5, 114);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("nm.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(vl param0, int param1) {
        synchronized (this.field_d) {
          this.field_d.a(param0, false);
          this.field_b = this.field_b + 1;
          int var4 = 119 % ((param1 - 46) / 62);
          this.field_d.notifyAll();
        }
    }

    nm(vf param0) {
        ia var2 = null;
        this.field_d = new wa();
        this.field_b = 0;
        this.field_i = false;
        try {
          var2 = param0.a((Runnable) (this), (byte) 58, 5);
          while (0 == var2.field_c) {
            gf.a(10L, -10309);
          }
          if (var2.field_c == 2) {
            throw new RuntimeException();
          }
          this.field_h = (Thread) (var2.field_a);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new int[6];
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = -1;
        field_c = "Get Rich or Die Tryin'";
    }
}
