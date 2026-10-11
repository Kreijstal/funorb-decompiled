/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd implements Runnable {
    static int field_b;
    static pg field_f;
    private bk field_c;
    private Thread field_a;
    int field_e;
    private boolean field_d;

    final cl a(int param0, ak param1, byte param2) {
        cl var4 = null;
        RuntimeException var4_ref = null;
        cl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new cl();
          var4.field_p = false;
          var4.field_C = param1;
          var4.field_z = 3;
          var4.field_j = (long)param0;
          if (param2 != 67) {
            this.field_c = (bk) null;
          }
          this.a(param2 - 4641, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("cd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final void c(int param0) {
        try {
          this.field_d = true;
          synchronized (this.field_c) {
            this.field_c.notifyAll();
          }
          if (param0 != -20444) {
            return;
          }
          try {
            this.field_a.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_a = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ti a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Transmogrify.field_A ? 1 : 0;
        ti var6 = new ti(param1, param1);
        ti var3 = var6;
        if (param2 >= -18) {
          cd.b(92);
        }
        for (var4 = 0; var4 < var3.field_w.length; var4++) {
          var6.field_w[var4] = param0;
        }
        return var3;
    }

    private final void a(int param0, cl param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_c;
          synchronized (var3) {
            this.field_c.a((byte) -128, param1);
            this.field_e = this.field_e + 1;
            this.field_c.notifyAll();
          }
          if (param0 != -4574) {
            cd.a(3, 60, (byte) 39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("cd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 < 5) {
          cd.a(-105);
        }
        field_f = null;
    }

    final cl a(ak param0, byte[] param1, int param2, int param3) {
        cl var5 = null;
        RuntimeException var5_ref = null;
        cl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new cl();
          var5.field_j = (long)param3;
          if (param2 > -76) {
            field_f = (pg) null;
          }
          var5.field_C = param0;
          var5.field_p = false;
          var5.field_z = 2;
          var5.field_B = param1;
          this.a(-4574, var5);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("cd.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final cl a(ak param0, int param1, boolean param2) {
        cl var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        cl var6 = null;
        int var8 = 0;
        cl stackIn_9_0 = null;
        cl stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        cl stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          var4 = new cl();
          var4.field_z = 1;
          var5 = this.field_c;
          synchronized (var5) {
            var6 = (cl) (this.field_c.b((byte) 114));
            while (var6 != null) {
              if (~var6.field_j == ~(long)param1 &&
                param0 == var6.field_C &&
                var6.field_z == 2) {
                var4.field_B = var6.field_B;
                var4.field_m = false;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var6 = (cl) (this.field_c.a(108));
            }
          }
          var4.field_B = param0.b(-88, param1);
          var4.field_m = false;
          stackIn_17_0 = var4;
          stackIn_18_1 = (param2);
          stackIn_17_0.field_p = stackIn_18_1;
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var4_ref;
          stackIn_22_1 = new StringBuilder().append("cd.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static String b(int param0) {
        int var1 = -99 / ((-15 - param0) / 46);
        if (rh.field_v == of.field_d) {
          return kk.field_g;
        }
        if (db.field_a == of.field_d) {
          return jh.field_g;
        }
        if (!dl.field_l.b(-26753)) {
          return jh.field_g;
        }
        return ob.field_F;
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          cl var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Transmogrify.field_A ? 1 : 0;
          while (!this.field_d) {
            var2 = this.field_c;
            synchronized (var2) {
              var7 = (cl) (this.field_c.d(-31914));
              if (var7 == null) {
                try {
                  this.field_c.wait();
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
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_z == 2) {
                var7.field_C.a(true, (int)var7.field_j, var7.field_B, var7.field_B.length);
                var7.field_m = false;
              } else {
                if (3 != var7.field_z) {
                  decompiledRegionSelector1 = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_B = var7.field_C.b(-80, (int)var7.field_j);
                  var7.field_m = false;
                }
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              d.a((Throwable) ((Object) var2_ref), 100, (String) null);
              decompiledRegionSelector1 = 0;
            }
            if (decompiledRegionSelector1 != 0) {
              continue;
            }
            var7.field_m = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    cd(fe param0) {
        ib var2 = null;
        this.field_c = new bk();
        this.field_d = false;
        this.field_e = 0;
        try {
          var2 = param0.a((Runnable) (this), 5, 65535);
          while (var2.field_c == 0) {
            pg.a(10L, -95);
          }
          if (var2.field_c == 2) {
            throw new RuntimeException();
          }
          this.field_a = (Thread) (var2.field_g);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 640;
    }
}
