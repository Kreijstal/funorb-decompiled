/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DiskCacheWorker implements Runnable {
    static ff field_c;
    private DualLinkDeque field_h;
    static ArgbSprite[] field_i;
    int field_e;
    private Thread field_a;
    private boolean field_f;
    static int field_b;
    static int field_d;
    static String[] field_g;

    private final void enqueue(DiskCacheRequest param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this.field_h;
          synchronized (var3_ref) {
            this.field_h.addLast(127, param0);
            this.field_e = this.field_e + 1;
            this.field_h.notifyAll();
          }
          if (!param1) {
            return;
          }
          field_b = -100;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("eb.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          DiskCacheRequest var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Kickabout.field_G;
          while (!this.field_f) {
            var2 = this.field_h;
            synchronized (var2) {
              var7 = (DiskCacheRequest) (this.field_h.removeFirst((byte) 3));
              if (var7 == null) {
                try {
                  this.field_h.wait();
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
              if (2 == var7.field_t) {
                var7.field_v.write((byte) 66, (int)var7.field_l, var7.field_u.length, var7.field_u);
                var7.field_p = false;
              } else {
                if (3 == var7.field_t) {
                  var7.field_u = var7.field_v.a((int)var7.field_l, 65280);
                  var7.field_p = false;
                } else {
                  var7.field_p = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              UnreadMessagesScreen.a((String) null, (Throwable) ((Object) var2_ref), 1);
              var7.field_p = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final DiskCacheRequest enqueueRead(int param0, int param1, SectorCacheStore param2) {
        DiskCacheRequest var4 = null;
        RuntimeException var4_ref = null;
        DiskCacheRequest stackIn_2_0 = null;
        DiskCacheRequest stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new DiskCacheRequest();
          if (param0 != 8947) {
            stackIn_2_0 = (DiskCacheRequest) null;
            return stackIn_2_0;
          }
          var4.field_q = false;
          var4.field_v = param2;
          var4.field_t = 3;
          var4.field_l = (long)param1;
          this.enqueue(var4, false);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("eb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final DiskCacheRequest readImmediate(int param0, SectorCacheStore param1, int param2) {
        DiskCacheRequest var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        DiskCacheRequest var6 = null;
        int var8 = 0;
        DiskCacheRequest stackIn_10_0 = null;
        DiskCacheRequest stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          var4 = new DiskCacheRequest();
          var4.field_t = 1;
          var5 = this.field_h;
          synchronized (var5) {
            if (param0 != -913) {
              this.shutdown(-77);
            }
            var6 = (DiskCacheRequest) (this.field_h.a(-125));
            while (var6 != null) {
              if (var6.field_l == (long)param2 &&
                var6.field_v == param1 &&
                var6.field_t == 2) {
                var4.field_p = false;
                var4.field_u = var6.field_u;
                stackIn_10_0 = var4;
                return stackIn_10_0;
              }
              var6 = (DiskCacheRequest) (this.field_h.b(0));
            }
          }
          var4.field_u = param1.a(param2, param0 + 66193);
          var4.field_q = true;
          var4.field_p = false;
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("eb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final void shutdown(int param0) {
        try {
          this.field_f = true;
          synchronized (this.field_h) {
            if (param0 <= 107) {
              this.field_f = false;
            }
            this.field_h.notifyAll();
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

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        field_g = null;
        if (param0 != 2) {
          field_b = 17;
        }
    }

    final DiskCacheRequest enqueueOperation(int param0, SectorCacheStore param1, byte[] param2, byte param3) {
        DiskCacheRequest var5 = null;
        RuntimeException var5_ref = null;
        DiskCacheRequest stackIn_2_0 = null;
        DiskCacheRequest stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 1) {
            stackIn_2_0 = (DiskCacheRequest) null;
            return stackIn_2_0;
          }
          var5 = new DiskCacheRequest();
          var5.field_l = (long)param0;
          var5.field_q = false;
          var5.field_u = param2;
          var5.field_v = param1;
          var5.field_t = 2;
          this.enqueue(var5, false);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("eb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    DiskCacheWorker(PlatformTaskDispatcher param0) {
        PlatformTask var2 = null;
        this.field_h = new DualLinkDeque();
        this.field_e = 0;
        this.field_f = false;
        try {
          var2 = param0.a(5, (byte) 121, (Runnable) (this));
          while (var2.field_a == 0) {
            aj.a(10L, 1);
          }
          if (2 == var2.field_a) {
            throw new RuntimeException();
          }
          this.field_a = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "eb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new ff(0, 2, 2, 1);
    }
}
