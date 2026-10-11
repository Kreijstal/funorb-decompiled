/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss implements Runnable {
    private vj field_d;
    static int field_c;
    int field_b;
    private Thread field_a;
    private boolean field_e;

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          sga var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = TombRacer.field_G ? 1 : 0;
          while (!this.field_e) {
            var2 = this.field_d;
            synchronized (var2) {
              var7 = (sga) (this.field_d.c((byte) 116));
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
              if (var7.field_q != 2) {
                if (var7.field_q != 3) {
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_p = var7.field_o.a((int)var7.field_j, -114);
                  var7.field_m = false;
                }
              } else {
                var7.field_o.a((int)var7.field_j, var7.field_p, var7.field_p.length, (byte) 124);
                var7.field_m = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              ssa.a((String) null, (byte) 125, (Throwable) ((Object) var2_ref));
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
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

    final void a(byte param0) {
        try {
          this.field_e = true;
          synchronized (this.field_d) {
            this.field_d.notifyAll();
          }
          try {
            this.field_a.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_a = null;
          if (param0 == 118) {
            return;
          }
          this.field_b = -68;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        if (param0 > 4) {
          return (param2 & 2048) != 0 ? true : false;
        }
        ss.a((byte) -46, 11, 42);
        return (param2 & 2048) != 0 ? true : false;
    }

    final sga a(int param0, ppa param1, int param2) {
        sga var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        sga var6 = null;
        int var8 = 0;
        sga stackIn_9_0 = null;
        sga stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var4 = new sga();
          var4.field_q = 1;
          var5 = this.field_d;
          synchronized (var5) {
            var6 = (sga) (this.field_d.b((byte) 38));
            while (var6 != null) {
              if ((long)param2 == var6.field_j &&
                var6.field_o == param1 &&
                var6.field_q == 2) {
                var4.field_m = false;
                var4.field_p = var6.field_p;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var6 = (sga) (this.field_d.c(28));
            }
          }
          if (param0 != 15871) {
            this.field_e = false;
          }
          var4.field_p = param1.a(param2, -124);
          var4.field_m = false;
          var4.field_l = true;
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("ss.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final sga a(byte param0, int param1, ppa param2) {
        sga var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        sga stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new sga();
          var4.field_o = param2;
          var4.field_j = (long)param1;
          var4.field_q = 3;
          var4.field_l = false;
          this.a(-42, var4);
          if (param0 >= -42) {
            var5 = (byte[]) null;
            this.a(true, 61, (ppa) null, (byte[]) null);
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ss.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        lqa var1 = uv.b(false);
        if (param0 < 122) {
          ss.a((byte) -30, -8, 82);
          if (var1 == null) {
            return false;
          }
          return var1.field_h;
        }
        if (var1 == null) {
          return false;
        }
        return var1.field_h;
    }

    private final void a(int param0, sga param1) {
        synchronized (this.field_d) {
          this.field_d.a(param1, (byte) -105);
          if (param0 >= -27) {
            ppa var5 = (ppa) null;
            this.a((byte) -87, 82, (ppa) null);
          }
          this.field_b = this.field_b + 1;
          this.field_d.notifyAll();
        }
    }

    final sga a(boolean param0, int param1, ppa param2, byte[] param3) {
        sga var5 = null;
        RuntimeException var5_ref = null;
        sga stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        sga stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new sga();
          var5.field_p = param3;
          var5.field_q = 2;
          var5.field_j = (long)param1;
          var5.field_o = param2;
          stackIn_2_0 = var5;
          stackIn_3_1 = (param0);
          stackIn_2_0.field_l = stackIn_3_1;
          this.a(-98, var5);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("ss.A(").append(param0).append(',').append(param1).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ss(fia param0) {
        naa var2 = null;
        this.field_d = new vj();
        this.field_b = 0;
        this.field_e = false;
        try {
          var2 = param0.a((Runnable) (this), 425, 5);
          while (var2.field_b == 0) {
            vja.a(0, 10L);
          }
          if (var2.field_b == 2) {
            throw new RuntimeException();
          }
          this.field_a = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ss.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 100;
    }
}
