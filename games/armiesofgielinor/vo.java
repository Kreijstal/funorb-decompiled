/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo implements Runnable {
    static String field_h;
    static String field_e;
    static String[] field_f;
    static RgbSprite field_d;
    private ui field_g;
    private boolean field_a;
    int field_b;
    private Thread field_c;

    final static int a(byte param0, String param1, String param2, boolean param3, int param4, int param5, String param6) {
        gl var7 = null;
        RuntimeException var7_ref = null;
        gl var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -46) {
            stackIn_2_0 = -51;
            return stackIn_2_0;
          }
          var7 = new gl(param1);
          var8 = new gl(param2);
          stackIn_4_0 = uq.a(param6, var7, -20032, param5, param4, var8, param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("vo.G(").append(param0).append(',');
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          nh var7 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          while (!this.field_a) {
            var2 = this.field_g;
            synchronized (var2) {
              var7 = (nh) (this.field_g.b(11));
              if (var7 == null) {
                try {
                  this.field_g.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              } else {
                this.field_b = this.field_b - 1;
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_L != 2) {
                if (var7.field_L == 3) {
                  var7.field_F = var7.field_C.a(0, (int)var7.field_q);
                  decompiledRegionSelector1 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var7.field_x = false;
                }
              } else {
                var7.field_C.a(83, var7.field_F.length, var7.field_F, (int)var7.field_q);
                var7.field_x = false;
              }
              if (decompiledFrameRemainder0) {
                decompiledRegionSelector1 = 0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              af.a((Throwable) ((Object) var2_ref), -98, (String) null);
              decompiledRegionSelector1 = 1;
            }
            if (decompiledRegionSelector1 == 0) {
              continue;
            }
            var7.field_x = false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final nh a(byte param0, int param1, bc param2) {
        nh var4 = null;
        RuntimeException var4_ref = null;
        nh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new nh();
          if (param0 != 56) {
            vo.a(50, 66, -33, 75, 23, -84, true);
          }
          var4.field_z = false;
          var4.field_C = param2;
          var4.field_L = 3;
          var4.field_q = (long)param1;
          this.a((byte) -105, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("vo.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = 33 / ((19 - param0) / 63);
          var4 = 0;
          var5 = InstructionsPanel.field_r;
          while (var4 < nb.field_h.length) {
            var6 = cj.field_k[var4];
            if (var6 < 0) {
              var5 = var5 + cn.field_o;
            } else {
              var7 = lp.a(nb.field_h[var4], true, false);
              var5 = var5 + ar.field_w;
              var8 = bt.field_g - (var7 >> 1);
              if (mu.a(param2, jg.field_k + (rd.field_b << 1), param1, -df.field_E + var8, 5138823, (df.field_E << 1) + var7, var5)) {
                stackIn_6_0 = var6;
                return stackIn_6_0;
              }
              var5 = var5 + (ar.field_w + ((rd.field_b << 1) + jg.field_k));
            }
            var4++;
          }
          stackIn_11_0 = -1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var3), "vo.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, nh param1) {
        int var3_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_g;
          synchronized (var3) {
            this.field_g.a(param1, false);
            this.field_b = this.field_b + 1;
            this.field_g.notifyAll();
          }
          var3_int = -58 % ((param0 - 50) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("vo.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        String var7 = null;
        if (rs.field_t == param1) {
          var7 = eb.field_d;
        } else {
          var7 = CampaignMenu.field_q;
        }
        ef.a(param2, (byte) 46, param3, param6, param4, param0, param5, var7);
    }

    final static void reportCampaignTurn(boolean isLocalTurn, int obfuscationGuard, int turnsTaken, CampaignMission mission) {
        int localTurnFlag = 0;
        int campaignIndex = mission.campaign.campaignIndex;
        int missionId = mission.missionId;
        if (obfuscationGuard != 1) {
          field_e = (String) null;
        }
        if (DamageEvent.g(76)) {
          return;
        }
        try {
          localTurnFlag = isLocalTurn ? 1 : 0;
          StateChangeEvent.sendProgressRecord((byte) 6, missionId + campaignIndex * 1000, localTurnFlag, turnsTaken);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "vo.E(" + isLocalTurn + ',' + obfuscationGuard + ',' + turnsTaken + ',' + (mission != null ? "{...}" : "null") + ')');
        }
    }

    final nh a(int param0, bc param1, boolean param2, byte[] param3) {
        nh var5 = null;
        RuntimeException var5_ref = null;
        nh stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        nh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new nh();
          var5.field_q = (long)param0;
          var5.field_L = 2;
          stackIn_2_0 = var5;
          stackIn_3_1 = (param2);
          stackIn_2_0.field_z = stackIn_3_1;
          var5.field_F = param3;
          var5.field_C = param1;
          this.a((byte) 117, var5);
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("vo.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        try {
          this.field_a = true;
          synchronized (this.field_g) {
            this.field_g.notifyAll();
          }
          try {
            this.field_c.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_c = null;
          int var2 = 41 % ((-67 - param0) / 33);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        if (!(sj.field_d <= 0)) {
          sj.field_d = sj.field_d - 1;
        }
        if (param0 != -10232) {
          vo.a(-87, -49, 69, -51, 90, -121, false);
        }
        if (so.field_b.field_g != gb.field_y) {
          sh.field_l = sh.field_l + (so.field_b.field_g - gb.field_y);
          gb.field_y = so.field_b.field_g;
        }
        if (!(sj.field_d <= 0)) {
          vi.a(-67);
        }
    }

    final nh a(int param0, bc param1, int param2) {
        nh var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        nh var6 = null;
        int var8 = 0;
        nh stackIn_8_0 = null;
        nh stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = new nh();
          var4.field_L = 1;
          var5 = this.field_g;
          synchronized (var5) {
            var6 = (nh) (this.field_g.a((byte) 82));
            while (var6 != null) {
              if (var6.field_q == (long)param0 &&
                param1 == var6.field_C &&
                var6.field_L == 2) {
                var4.field_F = var6.field_F;
                var4.field_x = false;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (nh) (this.field_g.c(24));
            }
          }
          var4.field_F = param1.a(0, param0);
          var4.field_z = true;
          var4.field_x = false;
          if (param2 <= 69) {
            vo.a(76);
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref;
          stackIn_20_1 = new StringBuilder().append("vo.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_d = null;
        field_f = null;
        field_h = null;
        field_e = null;
    }

    vo(hd param0) {
        wo var2 = null;
        this.field_g = new ui();
        this.field_b = 0;
        this.field_a = false;
        try {
          var2 = param0.a(5, 0, (Runnable) (this));
          while (0 == var2.field_g) {
            nu.a(10L, 0);
          }
          if (var2.field_g == 2) {
            throw new RuntimeException();
          }
          this.field_c = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "vo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_e = "Orb coins: ";
        field_f = new String[]{"turn <%0> of <%1>", "<%0> of <%1> portals captured", "<%0> of <%1> towers captured", "<%0> of <%1> villages captured", null, "<%0> of <%1> portals captured by <%2>", "<%0> of <%1> towers captured by <%2>", "<%0> of <%1> villages captured by <%2>", "<%0> / <%1>"};
    }
}
