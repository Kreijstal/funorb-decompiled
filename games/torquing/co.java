/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co implements Runnable {
    static String field_d;
    private gb field_e;
    private Thread field_b;
    int field_a;
    private boolean field_c;

    final lb a(int param0, int param1, pb param2) {
        lb var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        lb var6 = null;
        int var8 = 0;
        lb stackIn_9_0 = null;
        lb stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Torquing.field_u;
        try {
          var4 = new lb();
          var4.field_B = 1;
          var5 = this.field_e;
          synchronized (var5) {
            var6 = (lb) (this.field_e.a((byte) -85));
            while (var6 != null) {
              if (~(long)param0 == ~var6.field_l &&
                var6.field_x == param2 &&
                var6.field_B == 2) {
                var4.field_r = false;
                var4.field_A = var6.field_A;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var6 = (lb) (this.field_e.c(24542));
            }
          }
          var4.field_A = param2.a(param0, (byte) 85);
          var4.field_w = true;
          if (param1 != 23538) {
            field_d = (String) null;
          }
          var4.field_r = false;
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("co.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void a(lb param0, int param1) {
        synchronized (this.field_e) {
          if (param1 != 32) {
            this.field_a = -127;
          }
          this.field_e.a((byte) 118, param0);
          this.field_a = this.field_a + 1;
          this.field_e.notifyAll();
        }
    }

    final lb a(byte[] param0, int param1, pb param2, byte param3) {
        lb var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        lb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = 111 % ((param3 + 55) / 46);
          var5 = new lb();
          var5.field_x = param2;
          var5.field_w = false;
          var5.field_A = param0;
          var5.field_B = 2;
          var5.field_l = (long)param1;
          this.a(var5, 32);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("co.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 2) {
          co.a(-15, 'y');
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          lb var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Torquing.field_u;
          while (!this.field_c) {
            var2 = this.field_e;
            synchronized (var2) {
              var7 = (lb) (this.field_e.a(127));
              if (var7 == null) {
                try {
                  this.field_e.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.field_a = this.field_a - 1;
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_B != 2) {
                if (var7.field_B == 3) {
                  var7.field_A = var7.field_x.a((int)var7.field_l, (byte) 85);
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_r = false;
                }
              } else {
                var7.field_x.a((int)var7.field_l, 10282, var7.field_A, var7.field_A.length);
                var7.field_r = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              nn.a((String) null, (Throwable) ((Object) var2_ref), -9958);
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
              continue;
            }
            var7.field_r = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        try {
          this.field_c = true;
          synchronized (this.field_e) {
            this.field_e.notifyAll();
          }
          try {
            this.field_b.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_b = null;
          if (param0 == -95) {
            return;
          }
          this.a((byte) -113);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final lb b(int param0, int param1, pb param2) {
        lb var4 = null;
        RuntimeException var4_ref = null;
        lb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new lb();
          var4.field_x = param2;
          var4.field_l = (long)param0;
          var4.field_w = false;
          var4.field_B = param1;
          this.a(var4, 32);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("co.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (wa.a(param1, (byte) 34)) {
          return true;
        }
        int var2 = 70 % ((param0 + 46) / 59);
        if (param1 == 45) {
          return true;
        }
        if (param1 == 160) {
          return true;
        }
        if (32 == param1) {
          return true;
        }
        if (param1 != 95) {
          return false;
        }
        return true;
    }

    co(vh param0) {
        rc var2 = null;
        this.field_e = new gb();
        this.field_c = false;
        this.field_a = 0;
        try {
          var2 = param0.a((byte) -126, 5, (Runnable) (this));
          while (var2.field_a == 0) {
            ub.a(1976, 10L);
          }
          if (var2.field_a == 2) {
            throw new RuntimeException();
          }
          this.field_b = (Thread) (var2.field_d);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "co.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "(Including <%0>)";
    }
}
