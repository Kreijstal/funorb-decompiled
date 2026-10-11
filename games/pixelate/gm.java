/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm implements Runnable {
    private nj field_b;
    static el field_f;
    static ak field_a;
    private Thread field_d;
    private boolean field_e;
    int field_c;

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          cg var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Pixelate.field_H ? 1 : 0;
          while (!this.field_e) {
            var2 = this.field_b;
            synchronized (var2) {
              var7 = (cg) (this.field_b.a((byte) 80));
              if (var7 != null) {
                this.field_c = this.field_c - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_b.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (2 != var7.field_C) {
                if (var7.field_C != 3) {
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_D = var7.field_G.a(111, (int)var7.field_q);
                  var7.field_v = false;
                }
              } else {
                var7.field_G.a(var7.field_D.length, var7.field_D, false, (int)var7.field_q);
                var7.field_v = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              jo.a(1, (String) null, (Throwable) ((Object) var2_ref));
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
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

    final void a(byte param0) {
        try {
          int var2 = 0;
          var2 = 62 % ((param0 - 18) / 56);
          this.field_e = true;
          synchronized (this.field_b) {
            this.field_b.notifyAll();
          }
          try {
            this.field_d.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_d = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, cg param1) {
        synchronized (this.field_b) {
          if (param0 < 63) {
            this.run();
          }
          this.field_b.a(-115, param1);
          this.field_c = this.field_c + 1;
          this.field_b.notifyAll();
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
          field_f = (el) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    final cg a(int param0, rn param1, int param2) {
        cg var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        cg var6 = null;
        int var8 = 0;
        cg stackIn_8_0 = null;
        cg stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          var4 = new cg();
          var4.field_C = 1;
          var5 = this.field_b;
          synchronized (var5) {
            var6 = (cg) (this.field_b.c(72));
            while (var6 != null) {
              if (~var6.field_q == ~(long)param0 &&
                param1 == var6.field_G &&
                2 == var6.field_C) {
                var4.field_D = var6.field_D;
                var4.field_v = false;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (cg) (this.field_b.a(65151));
            }
          }
          if (param2 < 53) {
            field_f = (el) null;
          }
          var4.field_D = param1.a(126, param0);
          var4.field_t = true;
          var4.field_v = false;
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("gm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final cg a(int param0, int param1, rn param2) {
        cg var4 = null;
        RuntimeException var4_ref = null;
        cg stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new cg();
          var4.field_q = (long)param0;
          var4.field_G = param2;
          var4.field_t = false;
          var4.field_C = param1;
          this.a((byte) 72, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("gm.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final cg a(int param0, int param1, rn param2, byte[] param3) {
        cg var5 = null;
        RuntimeException var5_ref = null;
        cg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new cg();
          var5.field_C = 2;
          if (param1 < 38) {
            this.field_d = (Thread) null;
          }
          var5.field_G = param2;
          var5.field_D = param3;
          var5.field_t = false;
          var5.field_q = (long)param0;
          this.a((byte) 90, var5);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("gm.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    gm(cb param0) {
        ei var2 = null;
        this.field_b = new nj();
        this.field_c = 0;
        this.field_e = false;
        try {
          var2 = param0.a(5, (Runnable) (this), (byte) -123);
          while (var2.field_b == 0) {
            vg.a(10L, (byte) 23);
          }
          if (2 == var2.field_b) {
            throw new RuntimeException();
          }
          this.field_d = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new el();
    }
}
