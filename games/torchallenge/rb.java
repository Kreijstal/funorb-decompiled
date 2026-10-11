/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb implements Runnable {
    static int field_b;
    private ii field_a;
    static int[] field_c;
    int field_e;
    private boolean field_f;
    private Thread field_d;

    final void a(int param0) {
        try {
          this.field_f = true;
          synchronized (this.field_a) {
            if (param0 != 4) {
              this.field_d = (Thread) null;
            }
            this.field_a.notifyAll();
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

    final static void a(int param0, int param1, int param2) {
        if (!(oe.field_f <= param1)) {
          oe.field_f = param1;
        }
        if (param0 < -49) {
          oe.field_f = oe.field_f - 1;
          if (0 > oe.field_f) {
            h.a(param2, 4);
            oe.field_f = param1;
          }
          return;
        }
    }

    final al a(la param0, boolean param1, int param2) {
        al var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        al var6 = null;
        int var8 = 0;
        al stackIn_8_0 = null;
        al stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        al stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          var4 = new al();
          var4.field_C = 1;
          var5 = this.field_a;
          synchronized (var5) {
            var6 = (al) (this.field_a.a(25777));
            while (var6 != null) {
              if (~(long)param2 == ~var6.field_l &&
                var6.field_D == param0 &&
                var6.field_C == 2) {
                var4.field_v = false;
                var4.field_y = var6.field_y;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (al) (this.field_a.d(84));
            }
          }
          var4.field_y = param0.a(param2, -110);
          var4.field_v = false;
          stackIn_16_0 = var4;
          stackIn_17_1 = (param1);
          stackIn_16_0.field_s = stackIn_17_1;
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("rb.H(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, al param1) {
        Object var3 = null;
        Throwable var4 = null;
        la var5 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            var5 = (la) null;
            this.a((la) null, true, 40);
          }
          var3 = this.field_a;
          synchronized (var3) {
            this.field_a.a(param1, 3329);
            this.field_e = this.field_e + 1;
            this.field_a.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oj.a((Throwable) (stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        int var1 = -33 / ((param0 - 64) / 41);
        field_c = null;
    }

    final al a(int param0, int param1, la param2) {
        al var4 = null;
        RuntimeException var4_ref = null;
        al stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new al();
          var4.field_l = (long)param0;
          var4.field_D = param2;
          var4.field_C = param1;
          var4.field_s = false;
          this.a(1, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("rb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          al var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = TorChallenge.field_F ? 1 : 0;
          while (!this.field_f) {
            var2 = this.field_a;
            synchronized (var2) {
              var7 = (al) (this.field_a.c(-1));
              if (var7 == null) {
                try {
                  this.field_a.wait();
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
              if (var7.field_C == 2) {
                var7.field_D.a((int)var7.field_l, var7.field_y, var7.field_y.length, (byte) 121);
                var7.field_v = false;
              } else {
                if (var7.field_C == 3) {
                  var7.field_y = var7.field_D.a((int)var7.field_l, -2);
                  var7.field_v = false;
                } else {
                  var7.field_v = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              td.a((String) null, (Throwable) ((Object) var2_ref), (byte) -87);
              var7.field_v = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ge a(lj param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ge stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -110) {
            field_c = (int[]) null;
          }
          var4_int = param0.a(param1, 50);
          var5 = param0.a(var4_int, param3, (byte) 86);
          stackIn_3_0 = w.a((byte) 61, var4_int, var5, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("rb.D(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final al a(int param0, la param1, byte param2, byte[] param3) {
        al var5 = null;
        RuntimeException var5_ref = null;
        al stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new al();
          var5.field_s = false;
          var5.field_D = param1;
          var5.field_l = (long)param0;
          var5.field_y = param3;
          var5.field_C = 2;
          this.a(param2 ^ 110, var5);
          if (param2 != 111) {
            this.field_e = -105;
          }
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("rb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    rb(uj param0) {
        mi var2 = null;
        this.field_a = new ii();
        this.field_e = 0;
        this.field_f = false;
        try {
          var2 = param0.a((Runnable) (this), true, 5);
          while (var2.field_d == 0) {
            c.a(-105, 10L);
          }
          if (var2.field_d == 2) {
            throw new RuntimeException();
          }
          this.field_d = (Thread) (var2.field_g);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 0;
        field_c = new int[]{0, 0, 1, 1, 1, 2, 3, 3, 3, 3, 4, 5, 5, 5};
    }
}
