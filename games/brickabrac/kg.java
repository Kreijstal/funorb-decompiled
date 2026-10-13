/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg implements Runnable {
    private lq field_f;
    static String field_b;
    static int[] field_i;
    static RgbSprite[][] field_a;
    static String field_e;
    static String[] field_h;
    private boolean field_j;
    int field_c;
    static int[] field_d;
    private Thread field_g;

    final void a(byte param0) {
        try {
          this.field_j = true;
          synchronized (this.field_f) {
            this.field_f.notifyAll();
          }
          try {
            this.field_g.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_g = null;
          if (param0 >= 38) {
            return;
          }
          this.field_c = -29;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final kj a(ve param0, int param1, int param2) {
        kj var4 = null;
        RuntimeException var4_ref = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        kj var6 = null;
        int var8 = 0;
        kj stackIn_8_0 = null;
        kj stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var4 = new kj();
          var4.field_F = 1;
          var5_ref_Object = this.field_f;
          synchronized (var5_ref_Object) {
            var6 = (kj) (this.field_f.a(true));
            while (var6 != null) {
              if (~(long)param1 == ~var6.secondaryKey &&
                var6.field_G == param0 &&
                var6.field_F == 2) {
                var4.field_u = false;
                var4.field_E = var6.field_E;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (kj) (this.field_f.e(-8394));
            }
          }
          var4.field_E = param0.a(0, param1);
          var4.field_u = false;
          var5 = -57 / ((-77 - param2) / 47);
          var4.field_B = true;
          stackIn_15_0 = var4;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var4_ref;
          stackIn_18_1 = new StringBuilder().append("kg.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 21678) {
          kg.a(-67);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int var13 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          var6_int = 485 + param1 + 8 - (-2 - param4) + 8;
          sh.field_d.a(-6 + DualLinkDeque.field_d.field_cb, 3, 3, -6 + var6_int, (byte) 64);
          var7 = -5 + sh.field_d.field_cb;
          kc.field_n.a(param3, -param3 + var7, 5, param4 + 485 + param1 + 2, (byte) 64);
          g.field_n.a(param3, 0, param1, -ap.field_e.field_Ib - param1 + kc.field_n.field_Ib, (byte) 64);
          var8 = 3 / ((49 - param0) / 40);
          ap.field_e.a(param3, 0, param1 + g.field_n.field_Ib, ap.field_e.field_Ib, (byte) 64);
          var7 = var7 - (param3 + 2);
          AchievementIcon.field_q.a(2, (byte) -110, 2 + (485 + param1) + param4, 5, 5, param4, var7 - 5);
          if (null != vd.field_a) {
            vd.field_a.a(AchievementIcon.field_q.field_cb, AchievementIcon.field_q.field_P, AchievementIcon.field_q.field_zb, (byte) -119, AchievementIcon.field_q.field_Ib);
          }
          var9 = -param1 + (DualLinkDeque.field_d.field_Ib - var6_int);
          var10 = var9 / 2;
          var11 = param1 + var10 + param2;
          var12 = 0;
          for (var13 = 0; 6 > var13; var13++) {
            if (var13 >= 5 ||
              null != ik.field_i[var13]) {
              var14 = 3 + (2 + DualLinkDeque.field_d.field_cb - 6) * var12 / (fe.field_pb + 1);
              var12++;
              var7Lifetime1 = -var14 + 3 + (var12 * (2 + (DualLinkDeque.field_d.field_cb - 6)) / (fe.field_pb + 1) - 2);
              if (5 > var13) {
                ik.field_i[var13].a(var7Lifetime1, var14, var6_int, var9, (byte) 64);
                dp.field_w[var13].a(var7Lifetime1, 0, param1, -param1 + var10, (byte) 64);
                vj.field_a[var13].a(-param5 + (var7Lifetime1 - param5), param5, var10, param2, (byte) 64);
                wd.field_F[var13].a(-param5 - param5 + var7Lifetime1, param5, var11, -var11 + var9 - param1, (byte) 64);
              } else {
                LegacyUtf8Decoder.field_c.a(var7Lifetime1, var14, var6_int, var9, (byte) 64);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var6), "kg.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final kj a(int param0, ve param1, byte param2) {
        kj var4 = null;
        RuntimeException var4_ref = null;
        ve var5 = null;
        kj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new kj();
          var4.field_F = 3;
          var4.field_B = false;
          if (param2 >= -51) {
            var5 = (ve) null;
            this.a(26, true, (byte[]) null, (ve) null);
          }
          var4.field_G = param1;
          var4.secondaryKey = (long)param0;
          this.a(var4, -3);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("kg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(kj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this.field_f;
          synchronized (var3_ref) {
            this.field_f.a(param0, false);
            this.field_c = this.field_c + 1;
            this.field_f.notifyAll();
          }
          if (param1 == -3) {
            return;
          }
          kg.a((byte) -81, -120, -50, 43, 109, -99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kg.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          kj var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = BrickABrac.field_J ? 1 : 0;
          while (!this.field_j) {
            var2 = this.field_f;
            synchronized (var2) {
              var7 = (kj) (this.field_f.a(25609));
              if (var7 != null) {
                this.field_c = this.field_c - 1;
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
              if (var7.field_F == 2) {
                var7.field_G.a((byte) -123, var7.field_E, var7.field_E.length, (int)var7.secondaryKey);
                var7.field_u = false;
              } else {
                if (var7.field_F == 3) {
                  var7.field_E = var7.field_G.a(0, (int)var7.secondaryKey);
                  var7.field_u = false;
                } else {
                  var7.field_u = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              rk.a((String) null, (Throwable) ((Object) var2_ref), 35);
              var7.field_u = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final kj a(int param0, boolean param1, byte[] param2, ve param3) {
        kj var5 = null;
        RuntimeException var5_ref = null;
        kj stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        kj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new kj();
          var5.field_E = param2;
          var5.field_G = param3;
          var5.secondaryKey = (long)param0;
          var5.field_F = 2;
          stackIn_2_0 = var5;
          stackIn_3_1 = (param1);
          stackIn_2_0.field_B = stackIn_3_1;
          this.a(var5, -3);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("kg.F(").append(param0).append(',').append(param1).append(',');
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
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_i = null;
        field_a = (RgbSprite[][]) null;
        field_h = null;
        if (param0 == 26679) {
          field_d = null;
          field_e = null;
          return;
        }
        field_h = (String[]) null;
        field_d = null;
        field_e = null;
    }

    kg(tg param0) {
        ql var2 = null;
        this.field_f = new lq();
        this.field_j = false;
        this.field_c = 0;
        try {
          var2 = param0.a(5, (Runnable) (this), (byte) -72);
          while (var2.field_f == 0) {
            wj.a(-124, 10L);
          }
          if (var2.field_f == 2) {
            throw new RuntimeException();
          }
          this.field_g = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Hide game chat";
        field_i = new int[]{16494651, 27571, 12658477, 26679, 16711935};
        field_e = "Enter name of player to add to list";
        field_h = new String[16];
        field_d = new int[]{12658477, 22953, 16494651, 26679, 16711935};
    }
}
