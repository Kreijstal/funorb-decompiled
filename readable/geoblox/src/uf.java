/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf implements Runnable {
    static int[] avatarTintPalette;
    private SecondaryDeque field_k;
    static int field_a;
    static al field_l;
    static String createPasswordContainsEmailAlertText;
    int field_d;
    private Thread field_g;
    static int avatarFeedbackFrameIndex;
    static ob field_e;
    private boolean field_j;
    static wa field_f;
    static long field_c;

    public static void a(int param0) {
        if (param0 < -35) {
            field_e = null;
            avatarTintPalette = null;
            field_f = null;
            createPasswordContainsEmailAlertText = null;
            field_l = null;
            return;
        }
        field_e = (ob) null;
        field_e = null;
        avatarTintPalette = null;
        field_f = null;
        createPasswordContainsEmailAlertText = null;
        field_l = null;
    }

    final DiskArchiveRequest a(byte param0, int param1, jh param2, byte[] param3) {
        DiskArchiveRequest var5 = null;
        RuntimeException var5_ref = null;
        DiskArchiveRequest stackIn_2_0 = null;
        DiskArchiveRequest stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new DiskArchiveRequest();
          var5.bytes = param3;
          var5.priority = false;
          var5.field_i = (long)param1;
          var5.operationType = 2;
          var5.diskCache = param2;
          if (param0 <= 41) {
            stackIn_2_0 = (DiskArchiveRequest) null;
            return stackIn_2_0;
          }
          this.a(var5, 15079962);
          stackIn_4_0 = (DiskArchiveRequest) (var5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var5_ref);
          stackIn_7_1 = new StringBuilder().append("uf.G(").append(param0).append(',').append(param1).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final DiskArchiveRequest a(jh param0, int param1, int param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        DiskArchiveRequest var6 = null;
        int var8 = 0;
        DiskArchiveRequest stackIn_11_0 = null;
        DiskArchiveRequest stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Geoblox.field_C;
        try {
          var4 = new DiskArchiveRequest();
          if (param2 != 15079962) {
            field_a = -116;
          }
          var4.operationType = 1;
          var5 = this.field_k;
          synchronized (var5) {
            L1: {
              var6 = (DiskArchiveRequest) ((Object) this.field_k.firstForIteration((byte) 121));
              L2: while (var6 != null) {
                if ((long)param1 == var6.field_i) {
                  if (var6.diskCache == param0) {
                    if (2 == var6.operationType) {
                      var4.bytes = var6.bytes;
                      var4.pending = false;
                      stackIn_11_0 = (DiskArchiveRequest) (var4);
                      return stackIn_11_0;
                    }
                  }
                }
                var6 = (DiskArchiveRequest) ((Object) this.field_k.nextForIteration(-20));
              }
              break L1;
            }
          }
          var4.bytes = param0.a(param1, (byte) -78);
          var4.priority = true;
          var4.pending = false;
          stackIn_18_0 = (DiskArchiveRequest) (var4);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = (RuntimeException) (var4_ref);
          stackIn_21_1 = new StringBuilder().append("uf.F(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(DiskArchiveRequest param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this.field_k;
          synchronized (var3) {
            this.field_k.addLast(-128, param0);
            if (param1 != 15079962) {
              return;
            }
            this.field_d = this.field_d + 1;
            this.field_k.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("uf.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(byte param0, String param1, int param2, int param3, String param4, String param5, boolean param6) {
        mb var7 = null;
        RuntimeException var7_ref = null;
        mb var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new mb(param5);
          var8 = new mb(param4);
          if (param0 != -94) {
            field_e = (ob) null;
          }
          stackIn_3_0 = pf.a(param3, param2, var7, var8, param1, param6, 100);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var7_ref);
          stackIn_6_1 = new StringBuilder().append("uf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param0 < 87) {
            String var3 = (String) null;
            uf.a((byte) -87, (String) null, -112, 119, (String) null, (String) null, false);
        }
    }

    final void a(byte param0) {
        try {
            this.field_j = true;
            synchronized (this.field_k) {
                this.field_k.notifyAll();
            }
            if (param0 != 51) {
                return;
            }
            try {
                this.field_g.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_g = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final DiskArchiveRequest a(int param0, jh param1, int param2) {
        DiskArchiveRequest var4 = null;
        RuntimeException var4_ref = null;
        DiskArchiveRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new DiskArchiveRequest();
          var4.operationType = 3;
          var4.diskCache = param1;
          var4.priority = false;
          var4.field_i = (long)param2;
          if (param0 < 22) {
            uf.a(70);
          }
          this.a(var4, 15079962);
          stackIn_3_0 = (DiskArchiveRequest) (var4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var4_ref);
          stackIn_6_1 = new StringBuilder().append("uf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            DiskArchiveRequest var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = Geoblox.field_C;
            L0: while (!this.field_j) {
              var2 = this.field_k;
              synchronized (var2) {
                var7 = (DiskArchiveRequest) ((Object) this.field_k.removeFirst(true));
                if (var7 == null) {
                  try {
                    this.field_k.wait();
                  } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                  }
                  decompiledRegionSelector0 = 0;
                } else {
                  this.field_d = this.field_d - 1;
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                continue L0;
              }
              try {
                L4: {
                  if (var7.operationType != 2) {
                    if (3 == var7.operationType) {
                      var7.bytes = var7.diskCache.a((int)var7.field_i, (byte) -76);
                      decompiledRegionSelector1 = 1;
                      break L4;
                    }
                    var7.pending = false;
                  } else {
                    var7.diskCache.a(var7.bytes, (byte) -53, (int)var7.field_i, var7.bytes.length);
                    var7.pending = false;
                  }
                  decompiledRegionSelector1 = 0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var6 = (String) null;
                gi.a((Throwable) ((Object) var2_ref), (String) null, (byte) 125);
                decompiledRegionSelector1 = 1;
              }
              if (decompiledRegionSelector1 == 0) {
                continue L0;
              }
              var7.pending = false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    uf(PlatformTaskDispatcher param0) {
        PlatformTask var2 = null;
        this.field_k = new SecondaryDeque();
        this.field_d = 0;
        this.field_j = false;
        try {
            var2 = param0.startThread((Runnable) (this), 0, 5);
            while (var2.status == 0) {
                bc.a(0, 10L);
            }
            if (2 == var2.status) {
                throw new RuntimeException();
            }
            this.field_g = (Thread) (var2.result);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        avatarTintPalette = new int[]{5167632, 12183066, 16031008, 15087386, 15079962};
        createPasswordContainsEmailAlertText = "This password contains your email address, and would be easy to guess";
        avatarFeedbackFrameIndex = 0;
        field_l = new al();
    }
}
