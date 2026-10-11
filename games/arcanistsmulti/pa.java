/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa implements Runnable {
    private tg field_e;
    static ll[] field_a;
    static String field_c;
    private Thread field_h;
    private boolean field_b;
    int field_d;
    static co field_g;
    static String field_f;

    final ea a(be param0, int param1, int param2) {
        ea var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        ea var6 = null;
        int var8 = 0;
        ea stackIn_8_0 = null;
        ea stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var4 = new ea();
          var4.field_A = 1;
          var5 = this.field_e;
          synchronized (var5) {
            var6 = (ea) (this.field_e.b(37));
            while (var6 != null) {
              if (~(long)param1 == ~var6.field_k &&
                param0 == var6.field_x &&
                2 == var6.field_A) {
                var4.field_p = false;
                var4.field_z = var6.field_z;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (ea) (this.field_e.e(4));
            }
          }
          var4.field_z = param0.a(param1, -93);
          var4.field_p = false;
          if (param2 != -6833) {
            pa.c((byte) 25);
          }
          var4.field_q = true;
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("pa.H(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 == 32336) {
          field_g = null;
          field_a = null;
          field_c = null;
          return;
        }
        pa.b((byte) 43);
        field_g = null;
        field_a = null;
        field_c = null;
    }

    final ea a(int param0, int param1, byte[] param2, be param3) {
        ea var5 = null;
        RuntimeException var5_ref = null;
        ea stackIn_2_0 = null;
        ea stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 45) {
            stackIn_2_0 = (ea) null;
            return stackIn_2_0;
          }
          var5 = new ea();
          var5.field_q = false;
          var5.field_x = param3;
          var5.field_A = 2;
          var5.field_k = (long)param0;
          var5.field_z = param2;
          this.a((byte) 100, var5);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("pa.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        try {
          this.field_b = true;
          synchronized (this.field_e) {
            this.field_e.notifyAll();
          }
          try {
            this.field_h.join();
          } catch (InterruptedException interruptedException) {
          }
          if (param0 == 90) {
            this.field_h = null;
            return;
          }
          this.field_h = (Thread) null;
          this.field_h = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, ea param1) {
        RuntimeException var3 = null;
        be var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this.field_e;
          synchronized (var3_ref) {
            this.field_e.a(param1, 15893);
            this.field_d = this.field_d + 1;
            this.field_e.notifyAll();
          }
          if (param0 >= 67) {
            return;
          }
          var5 = (be) null;
          this.a((be) null, 118, 120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("pa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          ea var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          while (!this.field_b) {
            var2 = this.field_e;
            synchronized (var2) {
              var7 = (ea) (this.field_e.a((byte) 124));
              if (var7 == null) {
                try {
                  this.field_e.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.field_d = this.field_d - 1;
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              if (var7.field_A == 2) {
                var7.field_x.a(var7.field_z, true, var7.field_z.length, (int)var7.field_k);
                var7.field_p = false;
              } else {
                if (var7.field_A == 3) {
                  var7.field_z = var7.field_x.a((int)var7.field_k, -61);
                  var7.field_p = false;
                } else {
                  var7.field_p = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              jh.a((Throwable) ((Object) var2_ref), (String) null, (byte) 20);
              var7.field_p = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(byte param0) {
        hk.d(-24225);
        ul.field_h = true;
        int var1 = -24 % ((71 - param0) / 35);
        hk.field_s = true;
        p.field_b.f(-126);
        jn.a(fi.field_a, false, -1);
    }

    final static kc c(byte param0) {
        if (param0 > -83) {
          pa.b((byte) -7);
          return pe.f(0);
        }
        return pe.f(0);
    }

    final ea a(int param0, boolean param1, be param2) {
        ea var4 = null;
        RuntimeException var4_ref = null;
        ea stackIn_2_0 = null;
        ea stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (ea) null;
            return stackIn_2_0;
          }
          var4 = new ea();
          var4.field_A = 3;
          var4.field_k = (long)param0;
          var4.field_q = false;
          var4.field_x = param2;
          this.a((byte) 84, var4);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("pa.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    pa(dl param0) {
        og var2 = null;
        this.field_e = new tg();
        this.field_b = false;
        this.field_d = 0;
        try {
          var2 = param0.a(126, 5, (Runnable) (this));
          while (0 == var2.field_e) {
            ao.a(10L, 1);
          }
          if (var2.field_e == 2) {
            throw new RuntimeException();
          }
          this.field_h = (Thread) (var2.field_g);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Just one target left! You seem to be doing well with these minions - perhaps a tougher challenge is required...";
        field_c = "Encouraging rule breaking";
        field_g = new co();
    }
}
