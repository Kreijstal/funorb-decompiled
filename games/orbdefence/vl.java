/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl implements Runnable {
    static int[] field_g;
    static int field_d;
    static int field_f;
    private il field_e;
    int field_b;
    private Thread field_c;
    private boolean field_a;

    final uc a(eh param0, int param1, int param2) {
        uc var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        uc var6 = null;
        int var8 = 0;
        uc stackIn_11_0 = null;
        uc stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          var4 = new uc();
          var4.field_t = 1;
          if (param2 >= -125) {
            vl.b(82);
          }
          var5 = this.field_e;
          synchronized (var5) {
            var6 = (uc) (this.field_e.b((byte) 46));
            while (var6 != null) {
              if ((long)param1 == var6.field_h &&
                var6.field_s == param0 &&
                var6.field_t == 2) {
                var4.field_u = var6.field_u;
                var4.field_l = false;
                stackIn_11_0 = var4;
                return stackIn_11_0;
              }
              var6 = (uc) (this.field_e.b(0));
            }
          }
          var4.field_u = param0.a(520, param1);
          var4.field_n = true;
          var4.field_l = false;
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("vl.G(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final uc a(byte param0, eh param1, int param2) {
        uc var4 = null;
        RuntimeException var4_ref = null;
        uc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new uc();
          var4.field_h = (long)param2;
          var4.field_t = 3;
          var4.field_s = param1;
          var4.field_n = false;
          this.a((byte) 68, var4);
          if (param0 < 79) {
            field_d = -110;
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("vl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 >= -88) {
          CharSequence var2 = (CharSequence) null;
          vl.a(false, (CharSequence) null, 95);
        }
    }

    final void a(int param0) {
        try {
          this.field_a = true;
          synchronized (this.field_e) {
            this.field_e.notifyAll();
          }
          try {
            this.field_c.join();
          } catch (InterruptedException interruptedException) {
          }
          if (param0 != -31973) {
            this.run();
          }
          this.field_c = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = ua.a(123, param1);
            if (var4 == null) {
              return false;
            }
            if (var4.length() < 1) {
              return false;
            }
            if (param2 > -119) {
              return true;
            }
            if (!sk.a(var4.charAt(0), -46) &&
              !sk.a(var4.charAt(var4.length() - 1), -46)) {
              var5 = 0;
              for (var6 = 0; var6 < param1.length(); var6++) {
                var7 = param1.charAt(var6);
                if (sk.a((char) var7, -46)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param0) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("vl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, uc param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_e;
          synchronized (var3) {
            this.field_e.a(-74, param1);
            this.field_b = this.field_b + 1;
            if (param0 != 68) {
              vl.b(58);
            }
            this.field_e.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("vl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final uc a(int param0, eh param1, byte[] param2, int param3) {
        uc var5 = null;
        RuntimeException var5_ref = null;
        uc stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new uc();
          var5.field_n = false;
          var5.field_t = param3;
          var5.field_u = param2;
          var5.field_s = param1;
          var5.field_h = (long)param0;
          this.a((byte) 68, var5);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("vl.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, vg param2) {
        try {
          kk.field_X.a(-123, param2);
          bk.a(true, param0, param2);
          if (param1 != 10) {
            vg var4 = (vg) null;
            vl.a(-76, -35, (vg) null);
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "vl.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          uc var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = OrbDefence.field_D ? 1 : 0;
          while (!this.field_a) {
            var2 = this.field_e;
            synchronized (var2) {
              var7 = (uc) (this.field_e.c(30664));
              if (var7 != null) {
                this.field_b = this.field_b - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_e.wait();
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
              if (var7.field_t != 2) {
                if (var7.field_t == 3) {
                  var7.field_u = var7.field_s.a(520, (int)var7.field_h);
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_l = false;
                }
              } else {
                var7.field_s.a(var7.field_u, 255, var7.field_u.length, (int)var7.field_h);
                var7.field_l = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              pe.a((byte) -13, (Throwable) ((Object) var2_ref), (String) null);
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
              continue;
            }
            var7.field_l = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    vl(be param0) {
        eb var2 = null;
        this.field_e = new il();
        this.field_a = false;
        this.field_b = 0;
        try {
          var2 = param0.a(314572800, 5, (Runnable) (this));
          while (var2.field_a == 0) {
            hb.a(10L, 127);
          }
          if (2 == var2.field_a) {
            throw new RuntimeException();
          }
          this.field_c = (Thread) (var2.field_g);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "vl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = 0;
    }
}
