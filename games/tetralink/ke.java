/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke implements Runnable {
    private jo field_f;
    static String field_g;
    int field_d;
    static String field_e;
    private boolean field_a;
    static int field_c;
    private Thread field_b;

    final static hl a(byte param0) {
        if (param0 != -95) {
          ke.a((byte) 83);
          return gk.a(21);
        }
        return gk.a(21);
    }

    final fd a(byte param0, sk param1, int param2) {
        fd var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        fd var6 = null;
        int var7 = 0;
        int var9 = 0;
        fd stackIn_9_0 = null;
        fd stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var9 = TetraLink.field_J;
        try {
          var4 = new fd();
          var4.field_L = 1;
          var5 = this.field_f;
          synchronized (var5) {
            var6 = (fd) (this.field_f.a((byte) 97));
            while (var6 != null) {
              if (~var6.field_n == ~(long)param2 &&
                var6.field_K == param1 &&
                var6.field_L == 2) {
                var4.field_G = var6.field_G;
                var4.field_v = false;
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var6 = (fd) (this.field_f.a(false));
            }
            var7 = 97 % ((param0 - 27) / 54);
          }
          var4.field_G = param1.a((byte) -30, param2);
          var4.field_D = true;
          var4.field_v = false;
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("ke.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(fd param0, int param1) {
        synchronized (this.field_f) {
          this.field_f.a(param0, 0);
          if (param1 > -49) {
            ke.a(21);
          }
          this.field_d = this.field_d + 1;
          this.field_f.notifyAll();
        }
    }

    final static ud a(String param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ud var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        ud stackIn_16_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          if (wb.field_f == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            stackIn_7_0 = null;
            return (ud) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = cc.a(var6, (byte) 104);
          if (var2 == null) {
            return null;
          }
          var3 = (ud) (wb.field_f.a((long)var2.hashCode(), 1));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_Mb);
            var4 = cc.a(var7, (byte) 119);
            if (var4.equals(var2)) {
              stackIn_16_0 = var3;
              return stackIn_16_0;
            }
            var3 = (ud) (wb.field_f.c(122));
          }
          if (!param1) {
            return null;
          }
          field_e = (String) null;
          stackIn_21_0 = null;
          return (ud) (stackIn_21_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("ke.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 5) {
          field_g = (String) null;
          field_e = null;
          field_g = null;
          return;
        }
        field_e = null;
        field_g = null;
    }

    final fd a(sk param0, int param1, int param2) {
        fd var4 = null;
        RuntimeException var4_ref = null;
        fd stackIn_2_0 = null;
        fd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 75) {
            stackIn_2_0 = (fd) null;
            return stackIn_2_0;
          }
          var4 = new fd();
          var4.field_n = (long)param1;
          var4.field_D = false;
          var4.field_K = param0;
          var4.field_L = 3;
          this.a(var4, -122);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("ke.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          fd var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = TetraLink.field_J;
          while (!this.field_a) {
            var2 = this.field_f;
            synchronized (var2) {
              var7 = (fd) (this.field_f.c(-15464));
              if (var7 != null) {
                this.field_d = this.field_d - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_f.wait();
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
              if (var7.field_L != 2) {
                if (var7.field_L != 3) {
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_G = var7.field_K.a((byte) -30, (int)var7.field_n);
                  var7.field_v = false;
                }
              } else {
                var7.field_K.a(var7.field_G, var7.field_G.length, 13061, (int)var7.field_n);
                var7.field_v = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              fk.a(-103, (Throwable) ((Object) var2_ref), (String) null);
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

    final void b(int param0) {
        try {
          this.field_a = true;
          if (param0 != -23641) {
            return;
          }
          synchronized (this.field_f) {
            this.field_f.notifyAll();
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

    final fd a(int param0, int param1, byte[] param2, sk param3) {
        fd var5 = null;
        RuntimeException var5_ref = null;
        fd stackIn_2_0 = null;
        fd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new fd();
          if (param0 > -16) {
            stackIn_2_0 = (fd) null;
            return stackIn_2_0;
          }
          var5.field_G = param2;
          var5.field_n = (long)param1;
          var5.field_D = false;
          var5.field_K = param3;
          var5.field_L = 2;
          this.a(var5, -82);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("ke.C(").append(param0).append(',').append(param1).append(',');
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
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ke(ie param0) {
        vl var2 = null;
        this.field_f = new jo();
        this.field_d = 0;
        this.field_a = false;
        try {
          var2 = param0.a((Runnable) (this), 126, 5);
          while (var2.field_d == 0) {
            tb.a(false, 10L);
          }
          if (var2.field_d == 2) {
            throw new RuntimeException();
          }
          this.field_b = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ke.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = -1;
    }
}
