/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj implements Runnable {
    static int field_h;
    static int[] field_k;
    static String field_f;
    private dl field_d;
    static String field_b;
    static int field_g;
    static int field_i;
    int field_j;
    static String[] field_c;
    private Thread field_a;
    private boolean field_e;
    static int field_l;

    final si a(gf param0, int param1, int param2) {
        si var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        si var6 = null;
        int var8 = 0;
        si stackIn_8_0 = null;
        si stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var4 = new si();
          var4.field_q = param1;
          var5 = this.field_d;
          synchronized (var5) {
            var6 = (si) (this.field_d.a(true));
            while (var6 != null) {
              if (~(long)param2 == ~var6.field_f &&
                var6.field_t == param0 &&
                var6.field_q == 2) {
                var4.field_j = false;
                var4.field_p = var6.field_p;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (si) (this.field_d.c((byte) -75));
            }
          }
          var4.field_p = param0.a(param2, (byte) 100);
          var4.field_m = true;
          var4.field_j = false;
          stackIn_15_0 = var4;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("uj.F(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final si a(boolean param0, int param1, byte[] param2, gf param3) {
        si var5 = null;
        RuntimeException var5_ref = null;
        si stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        si stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new si();
          var5.field_f = (long)param1;
          stackIn_2_0 = var5;
          stackIn_3_1 = (param0);
          stackIn_2_0.field_m = stackIn_3_1;
          var5.field_p = param2;
          var5.field_q = 2;
          var5.field_t = param3;
          this.a(-37, var5);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("uj.E(").append(param0).append(',').append(param1).append(',');
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
          throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static ai[] a(String param0, String param1, ad param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ai[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.c(param0, (byte) -105);
          if (param3) {
            field_k = (int[]) null;
          }
          var5 = param2.a(param1, var4_int, -28459);
          stackIn_3_0 = b.a(var5, 10, param2, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("uj.H(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          si var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          while (!this.field_e) {
            var2 = this.field_d;
            synchronized (var2) {
              var7 = (si) (this.field_d.a((byte) -120));
              if (var7 == null) {
                try {
                  this.field_d.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.field_j = this.field_j - 1;
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
                  var7.field_p = var7.field_t.a((int)var7.field_f, (byte) 125);
                  var7.field_j = false;
                }
              } else {
                var7.field_t.a(5, (int)var7.field_f, var7.field_p.length, var7.field_p);
                var7.field_j = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              kk.a((String) null, (byte) 73, (Throwable) ((Object) var2_ref));
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
              continue;
            }
            var7.field_j = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        hd.field_u.a(ri.field_b, param0 + 0);
        ok.field_a.a(ri.field_b, 0);
        wd.field_h.a(ri.field_b, 0);
        rf.field_a.a(aj.field_b, param0 + param0);
        sb.field_m.e();
        ge.d();
        ac.field_a.a((byte) 114);
        ek.field_b = 0;
        dc.field_e = 0;
        ok.field_d = false;
        sc.field_c = 0;
    }

    final si a(int param0, gf param1, byte param2) {
        si var4 = null;
        RuntimeException var4_ref = null;
        si stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new si();
          var4.field_t = param1;
          if (param2 >= -90) {
            this.field_a = (Thread) null;
          }
          var4.field_m = false;
          var4.field_f = (long)param0;
          var4.field_q = 3;
          this.a(-52, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("uj.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 10) {
          field_b = null;
          field_k = null;
          field_c = null;
          field_f = null;
          return;
        }
        field_g = -34;
        field_b = null;
        field_k = null;
        field_c = null;
        field_f = null;
    }

    private final void a(int param0, si param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 > -29) {
            this.field_d = (dl) null;
          }
          var3 = this.field_d;
          synchronized (var3) {
            this.field_d.a(param1, (byte) -100);
            this.field_j = this.field_j + 1;
            this.field_d.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("uj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) (stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        try {
          this.field_e = param0 ? true : false;
          synchronized (this.field_d) {
            this.field_d.notifyAll();
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

    final static byte[] a(int param0, Object param1, boolean param2) {
        byte[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        ka var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          if (param1 instanceof byte[]) {
            var3 = (byte[]) (param1);
            if (param2) {
              stackIn_9_0 = bk.a(0, var3);
              return stackIn_9_0;
            }
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          var3_int = 89 / ((param0 - 0) / 38);
          if (!(param1 instanceof ka)) {
            throw new IllegalArgumentException();
          }
          var4 = (ka) (param1);
          stackIn_12_0 = var4.d(-13913);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("uj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    uj(md param0) {
        ic var2 = null;
        this.field_d = new dl();
        this.field_j = 0;
        this.field_e = false;
        try {
          var2 = param0.a((Runnable) (this), 5, 0);
          while (0 == var2.field_g) {
            em.a(10L, false);
          }
          if (2 == var2.field_g) {
            throw new RuntimeException();
          }
          this.field_a = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "uj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new int[20];
        field_b = "Waiting for fonts";
        field_h = 1;
        field_l = 480;
    }
}
