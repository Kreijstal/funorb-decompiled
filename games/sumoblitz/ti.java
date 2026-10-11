/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti implements Runnable {
    static hr field_b;
    private ro field_d;
    private Thread field_a;
    int field_e;
    private boolean field_c;

    final ql a(wl param0, int param1, int param2) {
        ql var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        ql var7 = null;
        int var9 = 0;
        ql stackIn_9_0 = null;
        ql stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4 = new ql();
          var5 = 29 % ((param1 + 44) / 48);
          var4.field_y = 1;
          var6 = this.field_d;
          synchronized (var6) {
            var7 = (ql) (this.field_d.a(110));
            while (var7 != null) {
              if (~(long)param2 == ~var7.field_l &&
                var7.field_w == param0 &&
                var7.field_y == 2) {
                var4.field_u = false;
                var4.field_x = var7.field_x;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var7 = (ql) (this.field_d.d(-2));
            }
          }
          var4.field_x = param0.a(101, param2);
          var4.field_t = true;
          var4.field_u = false;
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("ti.G(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0) {
        try {
          this.field_c = true;
          synchronized (this.field_d) {
            this.field_d.notifyAll();
          }
          try {
            this.field_a.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_a = null;
          int var2 = -15 / ((49 - param0) / 40);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            ti.a(27);
          }
          stackIn_3_0 = qc.a(param1, 38, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ti.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        int var1 = 40 % ((-17 - param0) / 45);
        field_b = null;
    }

    private final void a(ql param0, boolean param1) {
        RuntimeException var3 = null;
        wl var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this.field_d;
          synchronized (var3_ref) {
            this.field_d.a((pj) (param0), (byte) -120);
            this.field_e = this.field_e + 1;
            this.field_d.notifyAll();
          }
          if (param1) {
            return;
          }
          var5 = (wl) null;
          this.a((wl) null, 93, 98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ti.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final ql a(int param0, byte[] param1, int param2, wl param3) {
        ql var5 = null;
        RuntimeException var5_ref = null;
        ql stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new ql();
          var5.field_l = (long)param0;
          var5.field_w = param3;
          var5.field_x = param1;
          var5.field_t = false;
          var5.field_y = param2;
          this.a(var5, true);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("ti.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final ql a(int param0, int param1, wl param2) {
        ql var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ql stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ql();
          var4.field_y = 3;
          var4.field_l = (long)param0;
          var5 = 119 % ((56 - param1) / 55);
          var4.field_t = false;
          var4.field_w = param2;
          this.a(var4, true);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("ti.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    ti(wi param0) {
        jr var2 = null;
        this.field_d = new ro();
        this.field_c = false;
        this.field_e = 0;
        try {
          var2 = param0.a(true, (Runnable) (this), 5);
          while (0 == var2.field_c) {
            tg.a(10L, (byte) 119);
          }
          if (var2.field_c == 2) {
            throw new RuntimeException();
          }
          this.field_a = (Thread) (var2.field_d);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ti.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          ql var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Sumoblitz.field_L ? 1 : 0;
          while (!this.field_c) {
            var2 = this.field_d;
            synchronized (var2) {
              var7 = (ql) (this.field_d.b((byte) 72));
              if (var7 == null) {
                try {
                  this.field_d.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.field_e = this.field_e - 1;
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              if (var7.field_y == 2) {
                var7.field_w.a(var7.field_x, (int)var7.field_l, var7.field_x.length, 0);
                var7.field_u = false;
              } else {
                if (var7.field_y == 3) {
                  var7.field_x = var7.field_w.a(85, (int)var7.field_l);
                  var7.field_u = false;
                } else {
                  var7.field_u = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              ms.a((String) null, (Throwable) ((Object) var2_ref), 0);
              var7.field_u = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
