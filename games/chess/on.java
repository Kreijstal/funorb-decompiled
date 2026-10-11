/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on implements Runnable {
    static int field_d;
    static int field_h;
    private ad field_g;
    static int field_e;
    private Thread field_b;
    private boolean field_f;
    static boolean field_a;
    int field_c;

    final tc a(gd param0, int param1, byte param2) {
        tc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        tc stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new tc();
          var4.field_l = (long)param1;
          var4.field_B = 3;
          var5 = -122 % ((1 - param2) / 39);
          var4.field_x = param0;
          var4.field_u = false;
          this.a((byte) -54, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("on.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, tc param1) {
        synchronized (this.field_g) {
          if (param0 != -54) {
            gd var5 = (gd) null;
            this.a((byte[]) null, -10, 42, (gd) null);
          }
          this.field_g.a(0, param1);
          this.field_c = this.field_c + 1;
          this.field_g.notifyAll();
        }
    }

    final static String a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -11307) {
            field_d = -9;
          }
          var2_int = hg.a(sb.field_rb, false, sk.field_t);
          if (var2_int == 1) {
            param1 = "<img=0>" + param1;
          }
          if (var2_int == 2) {
            param1 = "<img=1>" + param1;
          }
          stackIn_8_0 = (String) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("on.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final tc a(byte param0, int param1, gd param2) {
        tc var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        tc var6 = null;
        int var8 = 0;
        tc stackIn_8_0 = null;
        tc stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Chess.field_G;
        try {
          var4 = new tc();
          var4.field_B = 1;
          var5 = this.field_g;
          synchronized (var5) {
            var6 = (tc) (this.field_g.b(-22585));
            while (var6 != null) {
              if (var6.field_l == (long)param1 &&
                param2 == var6.field_x &&
                var6.field_B == 2) {
                var4.field_s = false;
                var4.field_v = var6.field_v;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (tc) (this.field_g.b((byte) -113));
            }
            if (param0 > -47) {
              field_a = true;
            }
          }
          var4.field_v = param2.a(param1, 111);
          var4.field_s = false;
          var4.field_u = true;
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("on.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          tc var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Chess.field_G;
          while (!this.field_f) {
            var2 = this.field_g;
            synchronized (var2) {
              var7 = (tc) (this.field_g.a((byte) -75));
              if (var7 == null) {
                try {
                  this.field_g.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.field_c = this.field_c - 1;
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (2 == var7.field_B) {
                var7.field_x.a((int)var7.field_l, var7.field_v, (byte) 59, var7.field_v.length);
                var7.field_s = false;
              } else {
                if (var7.field_B != 3) {
                  decompiledRegionSelector1 = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_v = var7.field_x.a((int)var7.field_l, 111);
                  var7.field_s = false;
                }
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              fg.a((Throwable) ((Object) var2_ref), (byte) -77, (String) null);
              decompiledRegionSelector1 = 0;
            }
            if (decompiledRegionSelector1 != 0) {
              continue;
            }
            var7.field_s = false;
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
          if (param0 != 3) {
            field_d = -102;
          }
          synchronized (this.field_g) {
            this.field_g.notifyAll();
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

    final tc a(byte[] param0, int param1, int param2, gd param3) {
        tc var5 = null;
        RuntimeException var5_ref = null;
        tc stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new tc();
          var5.field_u = false;
          var5.field_l = (long)param1;
          var5.field_B = param2;
          var5.field_x = param3;
          var5.field_v = param0;
          this.a((byte) -54, var5);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("on.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    on(jk param0) {
        nl var2 = null;
        this.field_g = new ad();
        this.field_f = false;
        this.field_c = 0;
        try {
          var2 = param0.a(5, true, (Runnable) (this));
          while (var2.field_f == 0) {
            bc.a(10L, (byte) -109);
          }
          if (var2.field_f == 2) {
            throw new RuntimeException();
          }
          this.field_b = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "on.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 0;
        field_d = 2;
    }
}
