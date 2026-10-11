/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc implements Runnable {
    static long field_a;
    static kg field_j;
    static nf[] field_e;
    static boolean field_d;
    static boolean field_f;
    private wd field_i;
    static int field_h;
    static String field_k;
    private boolean field_g;
    int field_b;
    private Thread field_c;

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          sm var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Confined.field_J ? 1 : 0;
          while (!this.field_g) {
            var2 = this.field_i;
            synchronized (var2) {
              var7 = (sm) (this.field_i.c(false));
              if (var7 != null) {
                this.field_b = this.field_b - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_i.wait();
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
              if (var7.field_z == 2) {
                var7.field_B.a(-1, var7.field_C.length, var7.field_C, (int)var7.field_r);
                var7.field_v = false;
              } else {
                if (var7.field_z == 3) {
                  var7.field_C = var7.field_B.a(4, (int)var7.field_r);
                  var7.field_v = false;
                } else {
                  var7.field_v = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              mb.a((String) null, true, (Throwable) ((Object) var2_ref));
              var7.field_v = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(byte[] param0, byte param1, hb param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          var4_int = param2.g(param3, 0);
          if (param1 != -126) {
            pc.b((byte) 7);
          }
          if (var4_int == 0) {
            return null;
          }
          if (param0 == null ||
            var4_int != param0.length) {
            param0 = new byte[var4_int];
          }
          var5 = param2.g(3, param1 + 126);
          var6 = (byte)param2.g(8, 0);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (byte)(var6 + param2.g(var5, 0));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (byte)var6;
            }
          }
          stackIn_18_0 = (byte[]) (param0);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("pc.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0) {
        try {
          if (param0 > -97) {
            return;
          }
          this.field_g = true;
          synchronized (this.field_i) {
            this.field_i.notifyAll();
          }
          try {
            this.field_c.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_c = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(sm param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_i;
          synchronized (var3) {
            this.field_i.a(param0, (byte) 115);
            this.field_b = this.field_b + 1;
            this.field_i.notifyAll();
            if (param1 < 53) {
              this.field_c = (Thread) null;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("pc.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_j = null;
        field_k = null;
        field_e = null;
        if (param0 >= -108) {
          field_k = (String) null;
        }
    }

    final sm a(int param0, ae param1, byte param2) {
        sm var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        sm var6 = null;
        int var8 = 0;
        sm stackIn_10_0 = null;
        sm stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          var4 = new sm();
          var4.field_z = 1;
          if (param2 != 53) {
            this.field_c = (Thread) null;
          }
          var5 = this.field_i;
          synchronized (var5) {
            var6 = (sm) (this.field_i.d(62));
            while (var6 != null) {
              if (~var6.field_r == ~(long)param0 &&
                param1 == var6.field_B &&
                var6.field_z == 2) {
                var4.field_C = var6.field_C;
                var4.field_v = false;
                stackIn_10_0 = var4;
                return stackIn_10_0;
              }
              var6 = (sm) (this.field_i.a((byte) -30));
            }
          }
          var4.field_C = param1.a(param2 ^ 49, param0);
          var4.field_t = true;
          var4.field_v = false;
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("pc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final sm a(ae param0, int param1, int param2) {
        sm var4 = null;
        RuntimeException var4_ref = null;
        sm stackIn_2_0 = null;
        sm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new sm();
          var4.field_t = false;
          var4.field_z = 3;
          var4.field_B = param0;
          var4.field_r = (long)param2;
          if (param1 != 0) {
            stackIn_2_0 = (sm) null;
            return stackIn_2_0;
          }
          this.a(var4, 81);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("pc.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, qn param1, int param2, bj param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        try {
          if (param1 != null &&
            null != param1.field_q &&
            param3 != null &&
            param1.field_w == param3.field_r) {
            var4_int = param3.field_s.length;
            var5 = param1.field_q[param0].length / var4_int;
            for (var6 = 0; var6 < var5; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (~param3.field_v == ~param1.field_p[param0][var6] &&
                im.a(param1.field_u[param0][var6], 113)) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param1.field_q[param0][var4_int * var6 + var7] != param3.field_s[var7]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_19_0 = var6;
                  return stackIn_19_0;
                }
              }
            }
            if (param2 < 105) {
              field_h = 36;
            }
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("pc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0) {
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        if (param0) {
          field_a = -14L;
        }
        boolean decompiledFrameRemainder0 = true;
        if (!tl.field_g) {
          stackIn_6_0 = !param0;
          if (!tj.a(stackIn_6_0)) {
            stackIn_9_0 = false;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final sm a(ae param0, int param1, byte[] param2, int param3) {
        sm var5 = null;
        RuntimeException var5_ref = null;
        sm stackIn_2_0 = null;
        sm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new sm();
          var5.field_r = (long)param3;
          var5.field_z = 2;
          var5.field_C = param2;
          var5.field_B = param0;
          if (param1 >= -96) {
            stackIn_2_0 = (sm) null;
            return stackIn_2_0;
          }
          var5.field_t = false;
          this.a(var5, 82);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("pc.E(");
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
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    pc(df param0) {
        bc var2 = null;
        this.field_i = new wd();
        this.field_b = 0;
        this.field_g = false;
        try {
          var2 = param0.a((byte) 66, (Runnable) (this), 5);
          while (var2.field_g == 0) {
            jd.a(1, 10L);
          }
          if (var2.field_g == 2) {
            throw new RuntimeException();
          }
          this.field_c = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = false;
        field_k = "INT";
        field_h = 9;
    }
}
