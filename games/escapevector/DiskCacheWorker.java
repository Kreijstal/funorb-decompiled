/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheWorker implements Runnable {
    static String[] field_d;
    private SecondaryIntrusiveDeque field_c;
    static String field_a;
    private Thread field_b;
    private boolean field_e;
    int field_f;

    public static void b(int param0) {
        if (param0 != -4) {
          return;
        }
        field_a = null;
        field_d = null;
    }

    final void a(int param0) {
        try {
          this.field_e = true;
          synchronized (this.field_c) {
            this.field_c.notifyAll();
            if (param0 != -24580) {
              field_a = (String) null;
            }
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

    final DiskCacheRequest a(SectorCacheStore param0, int param1, int param2) {
        String stackIn_22_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (param1 <= 33) {
            this.field_f = 88;
          }
          DiskCacheRequest var4 = new DiskCacheRequest();
          var4.field_z = 1;
          Object var5 = this.field_c;
          synchronized (var5) {
            DiskCacheRequest var6 = (DiskCacheRequest) (this.field_c.first(0));
            while (var6 != null) {
              if ((long)param2 == var6.secondaryKey &&
                param0 == var6.field_x &&
                var6.field_z == 2) {
                var4.field_u = false;
                var4.field_y = var6.field_y;
                DiskCacheRequest stackIn_11_0 = var4;
                return stackIn_11_0;
              }
              var6 = (DiskCacheRequest) (this.field_c.next((byte) 116));
            }
          }
          var4.field_y = param0.a(param2, 26296);
          var4.field_r = true;
          var4.field_u = false;
          DiskCacheRequest stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_21_0 = var4_ref;
          StringBuilder stackIn_21_1 = new StringBuilder().append("kk.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void run() {
        try {
          DiskCacheRequest var7 = null;
          boolean decompiledRegionSelector0 = false;
          boolean decompiledRegionSelector1 = false;
          Throwable decompiledCaughtException = null;
          int var5 = EscapeVector.obfuscationControl;
          while (!this.field_e) {
            Object var2 = this.field_c;
            synchronized (var2) {
              var7 = (DiskCacheRequest) (this.field_c.removeFirst((byte) -75));
              if (var7 == null) {
                try {
                  this.field_c.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  InterruptedException interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = false;
              } else {
                this.field_f = this.field_f - 1;
                decompiledRegionSelector0 = true;
              }
            }
            if (!decompiledRegionSelector0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_z == 2) {
                var7.field_x.a((byte) 18, (int)var7.secondaryKey, var7.field_y.length, var7.field_y);
                var7.field_u = false;
              } else if (var7.field_z != 3) {
                decompiledRegionSelector1 = false;
                decompiledFrameRemainder0 = false;
              } else {
                var7.field_y = var7.field_x.a((int)var7.secondaryKey, 26296);
                var7.field_u = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = true;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              Exception var2_ref = (Exception) (Object) decompiledCaughtException;
              String var6 = (String) null;
              pf.a(false, (String) null, (Throwable) ((Object) var2_ref));
              decompiledRegionSelector1 = false;
            }
            if (decompiledRegionSelector1) {
              continue;
            }
            var7.field_u = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final DiskCacheRequest a(byte[] param0, int param1, int param2, SectorCacheStore param3) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        try {
          DiskCacheRequest var5 = new DiskCacheRequest();
          var5.field_y = param0;
          var5.field_x = param3;
          var5.secondaryKey = (long)param1;
          var5.field_r = false;
          var5.field_z = param2;
          this.a(-3, var5);
          DiskCacheRequest stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var5_ref;
          StringBuilder stackIn_4_1 = new StringBuilder().append("kk.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void a(int param0, DiskCacheRequest param1) {
        synchronized (this.field_c) {
          this.field_c.addLast(-1, param1);
          this.field_f = this.field_f + 1;
          if (param0 != -3) {
            field_a = (String) null;
          }
          this.field_c.notifyAll();
        }
    }

    final DiskCacheRequest a(byte param0, SectorCacheStore param1, int param2) {
        String stackIn_7_2 = null;
        try {
          DiskCacheRequest var4 = new DiskCacheRequest();
          var4.field_r = false;
          var4.field_z = 3;
          var4.secondaryKey = (long)param2;
          var4.field_x = param1;
          this.a(-3, var4);
          if (param0 > -42) {
            this.field_e = true;
          }
          DiskCacheRequest stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("kk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    DiskCacheWorker(SystemTaskService param0) {
        this.field_c = new SecondaryIntrusiveDeque();
        this.field_e = false;
        this.field_f = 0;
        try {
          SystemTask var2 = param0.a(true, 5, (Runnable) (this));
          while (var2.field_f == 0) {
            en.a((byte) 121, 10L);
          }
          if (var2.field_f == 2) {
            throw new RuntimeException();
          }
          this.field_b = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "kk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_a = "This password is part of your Player Name, and would be easy to guess";
    }
}
