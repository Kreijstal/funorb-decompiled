/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh implements Runnable {
    static long field_c;
    private bh field_d;
    static e field_a;
    private Thread field_f;
    private boolean field_b;
    int field_e;

    final rh a(um param0, int param1, int param2) {
        rh var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        rh var6 = null;
        int var8 = 0;
        um var9 = null;
        rh stackIn_10_0 = null;
        rh stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4 = new rh();
          var4.field_E = 1;
          if (param2 != -27337) {
            var9 = (um) null;
            this.a((um) null, 57, 116);
          }
          var5 = this.field_d;
          synchronized (var5) {
            var6 = (rh) (this.field_d.d((byte) -35));
            while (var6 != null) {
              if ((long)param1 == var6.field_h &&
                param0 == var6.field_B &&
                var6.field_E == 2) {
                var4.field_v = false;
                var4.field_y = var6.field_y;
                stackIn_10_0 = var4;
                return stackIn_10_0;
              }
              var6 = (rh) (this.field_d.b((byte) -120));
            }
          }
          var4.field_y = param0.a(param1, param2 ^ 27342);
          var4.field_v = false;
          var4.field_w = true;
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("dh.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 == -6) {
          ei.field_t = false;
          sc.field_g.l(32270);
          return;
        }
        field_c = -21L;
        ei.field_t = false;
        sc.field_g.l(32270);
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -3) {
          field_a = (e) null;
        }
    }

    final rh a(um param0, int param1, byte[] param2, int param3) {
        rh var5 = null;
        RuntimeException var5_ref = null;
        rh stackIn_2_0 = null;
        rh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new rh();
          var5.field_E = 2;
          var5.field_h = (long)param3;
          var5.field_w = false;
          var5.field_y = param2;
          if (param1 != -4) {
            stackIn_2_0 = (rh) null;
            return stackIn_2_0;
          }
          var5.field_B = param0;
          this.a(false, var5);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("dh.A(");
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
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0) {
        try {
          this.field_b = true;
          synchronized (this.field_d) {
            this.field_d.notifyAll();
          }
          try {
            if (param0 != 3) {
              field_a = (e) null;
            }
            this.field_f.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_f = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          rh var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = HostileSpawn.field_I ? 1 : 0;
          while (!this.field_b) {
            var2 = this.field_d;
            synchronized (var2) {
              var7 = (rh) (this.field_d.a((byte) 27));
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
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_E == 2) {
                var7.field_B.a((byte) -24, var7.field_y, var7.field_y.length, (int)var7.field_h);
                var7.field_v = false;
              } else {
                if (var7.field_E != 3) {
                  decompiledRegionSelector1 = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_y = var7.field_B.a((int)var7.field_h, -123);
                  var7.field_v = false;
                }
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              ic.a((byte) -118, (String) null, (Throwable) ((Object) var2_ref));
              decompiledRegionSelector1 = 0;
            }
            if (decompiledRegionSelector1 != 0) {
              continue;
            }
            var7.field_v = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rh a(um param0, byte param1, int param2) {
        rh var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        rh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -72) {
            var5 = (byte[]) null;
            this.a((um) null, -111, (byte[]) null, 81);
          }
          var4 = new rh();
          var4.field_E = 3;
          var4.field_w = false;
          var4.field_B = param0;
          var4.field_h = (long)param2;
          this.a(false, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("dh.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 111) {
            stackIn_6_0 = (null != pb.b(param0, (byte) -120));
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("dh.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, rh param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this.field_d;
          synchronized (var3) {
            if (param0) {
              return;
            }
            this.field_d.a(param1, 79);
            this.field_e = this.field_e + 1;
            this.field_d.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dh.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wg.a((Throwable) (stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    dh(fd param0) {
        kk var2 = null;
        this.field_d = new bh();
        this.field_b = false;
        this.field_e = 0;
        try {
          var2 = param0.a(5, (Runnable) (this), 62);
          while (var2.field_f == 0) {
            vj.a(10L, (byte) -49);
          }
          if (2 == var2.field_f) {
            throw new RuntimeException();
          }
          this.field_f = (Thread) (var2.field_c);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "dh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
