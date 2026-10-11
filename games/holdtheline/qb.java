/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb implements Runnable {
    static float[] field_e;
    static uf field_b;
    static int[] field_a;
    private ol field_d;
    static float[] field_f;
    int field_c;
    private Thread field_h;
    static int field_i;
    private boolean field_g;

    final bk a(int param0, sk param1, byte[] param2, int param3) {
        bk var5 = null;
        RuntimeException var5_ref = null;
        bk stackIn_2_0 = null;
        bk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new bk();
          var5.field_x = param1;
          var5.field_i = (long)param0;
          var5.field_v = param2;
          var5.field_y = 2;
          if (param3 != 11998) {
            stackIn_2_0 = (bk) null;
            return stackIn_2_0;
          }
          var5.field_t = false;
          this.a(param3 - 39427, var5);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("qb.B(").append(param0).append(',');
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          bk var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = HoldTheLine.field_D;
          while (!this.field_g) {
            var2 = this.field_d;
            synchronized (var2) {
              var7 = (bk) (this.field_d.a((byte) 113));
              if (var7 != null) {
                this.field_c = this.field_c - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_d.wait();
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
              if (var7.field_y != 2) {
                if (var7.field_y == 3) {
                  var7.field_v = var7.field_x.a(122, (int)var7.field_i);
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_u = false;
                }
              } else {
                var7.field_x.a(var7.field_v, (int)var7.field_i, var7.field_v.length, false);
                var7.field_u = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              bl.a((Throwable) ((Object) var2_ref), (byte) 115, (String) null);
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
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

    final static void a(int param0, byte param1) {
        em.a(true);
        if (param1 > -63) {
          field_i = 124;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        if (param0 != -3) {
          qb.b(12);
          field_f = null;
          return;
        }
        field_f = null;
    }

    final bk a(sk param0, int param1, int param2) {
        bk var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        bk var6 = null;
        int var8 = 0;
        bk stackIn_8_0 = null;
        bk stackIn_16_0 = null;
        bk stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = HoldTheLine.field_D;
        try {
          var4 = new bk();
          var4.field_y = 1;
          var5 = this.field_d;
          synchronized (var5) {
            var6 = (bk) (this.field_d.c(param1 + 18139));
            while (var6 != null) {
              if ((long)param2 == var6.field_i &&
                param0 == var6.field_x &&
                var6.field_y == 2) {
                var4.field_v = var6.field_v;
                var4.field_u = false;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (bk) (this.field_d.e(param1 ^ 17949));
            }
          }
          var4.field_v = param0.a(117, param2);
          var4.field_t = true;
          var4.field_u = false;
          if (param1 == -18017) {
            stackIn_18_0 = var4;
            return stackIn_18_0;
          }
          stackIn_16_0 = (bk) null;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("qb.E(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final bk a(int param0, sk param1, int param2) {
        bk var4 = null;
        RuntimeException var4_ref = null;
        bk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new bk();
          var4.field_y = param0;
          var4.field_i = (long)param2;
          var4.field_x = param1;
          var4.field_t = false;
          this.a(-27429, var4);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("qb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (param0 != 100) {
          return (String) null;
        }
        if (sk.field_h) {
          return null;
        }
        if (g.field_h > dm.field_a) {
          return null;
        }
        if (we.field_l + g.field_h > dm.field_a) {
          return n.field_s;
        }
        return null;
    }

    final void a(boolean param0) {
        try {
          this.field_g = param0 ? true : false;
          synchronized (this.field_d) {
            this.field_d.notifyAll();
          }
          try {
            this.field_h.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_h = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, bk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this.field_d;
          synchronized (var3_ref) {
            this.field_d.a(-66, param1);
            this.field_c = this.field_c + 1;
            this.field_d.notifyAll();
          }
          if (param0 == -27429) {
            return;
          }
          qb.a(-68, (byte) 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    qb(ib param0) {
        af var2 = null;
        this.field_d = new ol();
        this.field_g = false;
        this.field_c = 0;
        try {
          var2 = param0.a((byte) -28, 5, (Runnable) (this));
          while (var2.field_d == 0) {
            qe.a(10L, (byte) 45);
          }
          if (2 == var2.field_d) {
            throw new RuntimeException();
          }
          this.field_h = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "qb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new int[]{40, 170, 100, 110, 170};
        field_f = new float[]{1.0f, 10.0f, 10.0f, 10.0f};
        field_e = field_f;
    }
}
