/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pfa implements Runnable {
    private vga field_d;
    private boolean field_c;
    int field_e;
    static String field_a;
    private Thread field_b;

    private final void a(int param0, jma param1) {
        synchronized (this.field_d) {
          if (param0 != 0) {
            pfa.b(102);
          }
          this.field_d.a(param1, param0 ^ -108);
          this.field_e = this.field_e + 1;
          this.field_d.notifyAll();
        }
    }

    final jma a(int param0, fo param1, byte param2) {
        jma var4 = null;
        RuntimeException var4_ref = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        jma var6 = null;
        int var8 = 0;
        jma stackIn_8_0 = null;
        jma stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var4 = new jma();
          var4.field_r = 1;
          var5_ref_Object = this.field_d;
          synchronized (var5_ref_Object) {
            var6 = (jma) (this.field_d.a((byte) -54));
            while (var6 != null) {
              if (~var6.field_i == ~(long)param0 &&
                var6.field_o == param1 &&
                2 == var6.field_r) {
                var4.field_n = false;
                var4.field_p = var6.field_p;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (jma) (this.field_d.a(1900));
            }
          }
          var4.field_p = param1.a((byte) 64, param0);
          var5 = 91 / ((param2 - 0) / 60);
          var4.field_n = false;
          var4.field_l = true;
          stackIn_15_0 = var4;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("pfa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final jma a(fo param0, byte[] param1, byte param2, int param3) {
        jma var5 = null;
        RuntimeException var5_ref = null;
        jma stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 73) {
            field_a = (String) null;
          }
          var5 = new jma();
          var5.field_o = param0;
          var5.field_r = 2;
          var5.field_l = false;
          var5.field_p = param1;
          var5.field_i = (long)param3;
          this.a(0, var5);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("pfa.C(");
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
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final jma a(byte param0, fo param1, int param2) {
        jma var4 = null;
        RuntimeException var4_ref = null;
        jma stackIn_2_0 = null;
        jma stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new jma();
          var4.field_r = 3;
          var4.field_o = param1;
          var4.field_l = false;
          var4.field_i = (long)param2;
          this.a(param0 - 121, var4);
          if (param0 == 121) {
            stackIn_4_0 = var4;
            return stackIn_4_0;
          }
          stackIn_2_0 = (jma) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("pfa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0) {
        try {
          this.field_c = true;
          synchronized (this.field_d) {
            if (param0 != 23474) {
              field_a = (String) null;
            }
            this.field_d.notifyAll();
          }
          try {
            this.field_b.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_b = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 <= 62) {
          pfa.b(-80);
        }
    }

    pfa(eab param0) {
        mob var2 = null;
        this.field_d = new vga();
        this.field_e = 0;
        this.field_c = false;
        try {
          var2 = param0.a(0, 5, (Runnable) (this));
          while (0 == var2.field_f) {
            gdb.b(-52, 10L);
          }
          if (var2.field_f == 2) {
            throw new RuntimeException();
          }
          this.field_b = (Thread) (var2.field_d);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "pfa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          jma var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = VoidHunters.field_G;
          while (!this.field_c) {
            var2 = this.field_d;
            synchronized (var2) {
              var7 = (jma) (this.field_d.b((byte) -120));
              if (var7 != null) {
                this.field_e = this.field_e - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_d.wait();
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
              if (var7.field_r == 2) {
                var7.field_o.a((int)var7.field_i, 520, var7.field_p, var7.field_p.length);
                var7.field_n = false;
              } else {
                if (var7.field_r != 3) {
                  decompiledRegionSelector1 = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_p = var7.field_o.a((byte) 120, (int)var7.field_i);
                  var7.field_n = false;
                }
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              gna.a((Throwable) ((Object) var2_ref), (String) null, 0);
              decompiledRegionSelector1 = 0;
            }
            if (decompiledRegionSelector1 != 0) {
              continue;
            }
            var7.field_n = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "Pelican chassis";
    }
}
