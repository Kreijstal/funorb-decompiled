/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh implements Runnable {
    static String field_a;
    static String field_g;
    private hl field_c;
    static ci field_e;
    private boolean field_f;
    int field_b;
    private Thread field_d;

    private final void a(int param0, ma param1) {
        synchronized (this.field_c) {
          this.field_c.a(11152, param1);
          this.field_b = this.field_b + 1;
          this.field_c.notifyAll();
          if (param0 != 28366) {
            field_g = (String) null;
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        field_a = null;
        if (param0 != 110) {
          wh.b(-27);
        }
    }

    final ma a(ua param0, int param1, int param2) {
        ma var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        ma var6 = null;
        int var8 = 0;
        ma stackIn_9_0 = null;
        ma stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Terraphoenix.field_V;
        try {
          var4 = new ma();
          var4.field_H = 1;
          var5 = this.field_c;
          synchronized (var5) {
            var6 = (ma) (this.field_c.c(param2 ^ 8194));
            while (var6 != null) {
              if (var6.field_m == (long)param1 &&
                param0 == var6.field_F &&
                2 == var6.field_H) {
                var4.field_G = var6.field_G;
                var4.field_A = false;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var6 = (ma) (this.field_c.a(6273));
            }
          }
          if (param2 != 2) {
            field_e = (ci) null;
          }
          var4.field_G = param0.a(-18342, param1);
          var4.field_A = false;
          var4.field_x = true;
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("wh.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final ma a(int param0, int param1, ua param2) {
        ma var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ma stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ma();
          var4.field_x = false;
          var4.field_F = param2;
          var4.field_m = (long)param1;
          var4.field_H = 3;
          var5 = 97 / ((param0 + 11) / 47);
          this.a(28366, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("wh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          ma var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Terraphoenix.field_V;
          while (!this.field_f) {
            var2 = this.field_c;
            synchronized (var2) {
              var7 = (ma) (this.field_c.a((byte) -115));
              if (var7 != null) {
                this.field_b = this.field_b - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_c.wait();
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
              if (2 == var7.field_H) {
                var7.field_F.a((int)var7.field_m, var7.field_G, 0, var7.field_G.length);
                var7.field_A = false;
              } else {
                if (var7.field_H != 3) {
                  decompiledRegionSelector1 = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_G = var7.field_F.a(-18342, (int)var7.field_m);
                  var7.field_A = false;
                }
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              bd.a((Throwable) ((Object) var2_ref), (String) null, 96);
              decompiledRegionSelector1 = 0;
            }
            if (decompiledRegionSelector1 != 0) {
              continue;
            }
            var7.field_A = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        try {
          this.field_f = true;
          synchronized (this.field_c) {
            if (param0 > -39) {
              this.field_c = (hl) null;
            }
            this.field_c.notifyAll();
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

    final static void b(int param0) {
        try {
          int var1 = 0;
          Exception var1_ref_Exception = null;
          Throwable decompiledCaughtException = null;
          if (mh.field_b != null) {
            try {
              mh.field_b.a(false, 0L);
              mh.field_b.a(-1, 24, mk.field_j.field_i, mk.field_j.field_k);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref_Exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          var1 = -15 % ((param0 - 58) / 35);
          mk.field_j.field_k = mk.field_j.field_k + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ma a(byte[] param0, int param1, int param2, ua param3) {
        ma var5 = null;
        RuntimeException var5_ref = null;
        ma stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new ma();
          var5.field_m = (long)param1;
          var5.field_H = 2;
          var5.field_x = false;
          var5.field_G = param0;
          if (param2 != 4626) {
            this.field_d = (Thread) null;
          }
          var5.field_F = param3;
          this.a(28366, var5);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("wh.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    wh(he param0) {
        mf var2 = null;
        this.field_c = new hl();
        this.field_f = false;
        this.field_b = 0;
        try {
          var2 = param0.a((Runnable) (this), (byte) -21, 5);
          while (0 == var2.field_d) {
            gi.a((byte) -37, 10L);
          }
          if (var2.field_d == 2) {
            throw new RuntimeException();
          }
          this.field_d = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Accuracy: ";
    }
}
