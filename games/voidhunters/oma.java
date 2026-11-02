/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oma implements DiffableState, mfa {
    private int field_d;
    int field_k;
    boolean field_e;
    int field_g;
    int field_a;
    static String field_b;
    CarouselCommongameInfo carouselInfo;
    int field_j;
    static String field_c;
    int field_f;
    String[] field_h;
    static float field_i;

    public final void a(String param0, int param1, byte param2) {
        try {
          this.field_h[param1] = param0;
          if (param2 >= -112) {
            this.b(96);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oma.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          GetDebrisThrowable.a(param1, "Starting to read");
          if (!kv.a(false, param0)) {
            this.carouselInfo = null;
          } else {
            this.carouselInfo = new CarouselCommongameInfo((mfa) (this));
            this.carouselInfo.a(param0, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oma.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        oma var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param0 <= 54) {
            this.a(125, -119);
          }
          var3 = (oma) (param1);
          if (null == this.carouselInfo) {
            var3.carouselInfo = null;
          } else {
            if (null == var3.carouselInfo) {
              var3.carouselInfo = new CarouselCommongameInfo((mfa) (this));
            }
            this.carouselInfo.b((byte) 91, var3.carouselInfo);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("oma.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 28801) {
          oma.a(false);
        }
        field_b = null;
        field_c = null;
    }

    final void c(int param0) {
        pr.field_c = this;
        this.carouselInfo.a(SetMinimapWidth.field_o, (byte) 106);
        int var2 = 5 % ((67 - param0) / 57);
    }

    final World a(byte param0) {
        if (param0 < 20) {
          field_i = 1.3303049802780151f;
        }
        return ((GameSnapshot) (this.carouselInfo.b(28120))).world;
    }

    final void a(int param0, faa param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 > -39) {
          return;
        }
        try {
          ConsoleValue.b(0);
          param1.f((byte) -50);
          var3_int = param1.position;
          param1.p(-23497);
          this.a(param1, false);
          param1.f((byte) -47);
          var4 = GetMessageMaxage.a((byte) -69, param1.position, param1.payload, var3_int);
          var5 = param1.h(97);
          if (var5 == var4) {
            GetDebrisThrowable.a(false, "cg readstate: Hmm, it seems correct");
          }
          param1.p(-23497);
          GetDebrisThrowable.a(false, "has read state");
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "oma.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int var4 = 0;
        oma var5 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (obfuscationGuard >= -19) {
            oma.a(7);
          }
          var5 = (oma) (other);
          if (null != this.carouselInfo &&
            null != var5.carouselInfo) {
            this.carouselInfo.reportDifferences(var5.carouselInfo, -91);
          }
          var4 = 0;
          stackIn_8_0 = (this.carouselInfo != null) ? 0 : 1;
          if (null != var5.carouselInfo) {
            stackIn_11_1 = 0;
          } else {
            stackIn_11_1 = 1;
          }
          if ((stackIn_8_0 ^ stackIn_11_1) != 0 ||
            this.carouselInfo != null &&
            this.carouselInfo.a((byte) 106, var5.carouselInfo)) {
            var4 = 1;
            System.out.println("Carousel_commongame_Info carousel_info has changed. before=" + var5.carouselInfo + ", now=" + this.carouselInfo);
          }
          if (var4 != 0) {
            System.out.println("This instance of commongame has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("oma.F(");
          if (other == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -109) {
            return;
          }
          stackIn_4_0 = (faa) (param0);
          stackIn_4_1 = -107;
          stackIn_5_2 = (null != this.carouselInfo);
          if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            this.carouselInfo.b(param0, -114);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("oma.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String a(int param0, int param1) {
        if (SetMissionResnetResourceTickTime.field_p == param0 &&
          !this.b(1).a(param1, (byte) 59).field_a) {
          return "Bot " + param1;
        }
        if (this.field_h[param1] == null) {
          return "Unknown";
        }
        return this.field_h[param1];
    }

    final static void a(float[] param0, int param1, float param2, float[] param3, int param4, int param5, byte param6, int param7, int param8, int param9, int param10) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var11_float = 0.0f;
        RuntimeException var11 = null;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        var18 = VoidHunters.field_G;
        try {
          param1 = param1 - param4;
          param8 = param8 - param7;
          param5 = param5 - param10;
          var11_float = param0[1] * (float)param8 + (float)param5 * param0[0] + (float)param1 * param0[2];
          var12 = param0[3] * (float)param5 + param0[4] * (float)param8 + (float)param1 * param0[5];
          var13 = (float)param1 * param0[8] + (param0[7] * (float)param8 + (float)param5 * param0[6]);
          var14 = (float)Math.sqrt((double)(var11_float * var11_float + var12 * var12 + var13 * var13));
          var15 = 0.5f + (float)Math.atan2((double)var11_float, (double)var13) / 6.2831854820251465f;
          var16 = (float)Math.asin((double)(var12 / var14)) / 3.1415927410125732f + 0.5f + param2;
          if (1 != param9) {
            if (param9 == 2) {
              var15 = -var15;
              var16 = -var16;
            } else {
              if (3 == param9) {
                var17 = var15;
                var15 = var16;
                var16 = -var17;
              }
            }
          } else {
            var17 = var15;
            var15 = -var16;
            var16 = var17;
          }
          param3[1] = var16;
          param3[0] = var15;
          if (param6 != -82) {
            field_c = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_13_0 = var11;
          stackIn_13_1 = new StringBuilder().append("oma.J(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        sl.a((byte) -28, GetShieldsDamageEnergyConversion.field_o);
        if (!param0) {
          field_i = 0.1389508843421936f;
        }
    }

    public final boolean a(byte param0, tv param1) {
        oma var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (oma) (param1);
          var4 = -29 % ((22 - param0) / 59);
          stackIn_3_0 = (var3.carouselInfo != null) ? 0 : 1;
          if (this.carouselInfo != null) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if ((stackIn_3_0 ^ stackIn_6_1) == 0 && (null == this.carouselInfo ||
            !this.carouselInfo.a((byte) -75, var3.carouselInfo))) {
            stackIn_12_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_12_0 = true;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("oma.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final GameSnapshot b(int param0) {
        if (param0 != 1) {
          this.a((byte) -95);
        }
        return (GameSnapshot) (this.carouselInfo.b(28120));
    }

    oma(String[] param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        bha stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        GameSnapshot var10 = null;
        Mission var11 = null;
        GameSnapshot var12 = null;
        Mission var13 = null;
        MissionEvent var14 = null;
        Asteroid var15 = null;
        Asteroid var16 = null;
        bea var17 = null;
        try {
          pr.field_c = this;
          this.field_a = param0.length;
          this.field_d = param3;
          this.field_h = param0;
          this.field_g = param2;
          this.carouselInfo = new CarouselCommongameInfo((mfa) (this), param4);
          this.carouselInfo.b(this.field_a, 107);
          var10 = (GameSnapshot) (this.carouselInfo.b(28120));
          var12 = var10;
          if (this.field_g != 0 &&
            this.field_g != 1) {
            if (this.field_g == 2) {
              var12.missionState.a(this.field_d, 1, 13);
              var17 = new bea();
              var17.seed = this.field_d;
              var17.a(-89, var12);
              var12.missionState.c(5, -7, 0);
            } else if (this.field_g == 3) {
              var12.missionState.c(5, -7, 0);
              var12.world.b(13, (byte) 23);
              var14 = new MissionEvent();
              var14.a((byte) -117, (MissionCondition) (new TickCondition(1)));
              var14.a(new SetVariableLabelAction(0, 10), true);
              var12.world.a(var14, -38);
              var15 = new Asteroid(new ShipComponent(54));
              var15.a(65536, 81920, (byte) -60);
              var12.world.a((byte) 126, var15);
              var16 = new Asteroid(new ShipComponent(50));
              var16.a(-131072, 65536, (byte) 69);
              var12.world.a((byte) 126, var16);
            }
          } else {
            if (!SetMissionTerrainAsteroidProbability.field_o) {
              var13 = bkb.a(0);
              var13.a(false, var12, -48);
            } else {
              var11 = SetDebrisPartitioned.b(false).a(3, false);
              var11.a(false, var12, 126);
            }
          }
          for (var7 = 0; var7 < this.field_a; var7++) {
            stackIn_16_0 = var10.field_c[var7];
            stackIn_17_1 = (null != this.field_h[var7]) && (0 < this.field_h[var7].length()) && ((1 << var7 & this.field_j) == 0);
            stackIn_16_0.field_a = stackIn_17_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("oma.<init>(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = "Next condition/action value";
        field_c = "Creating your account";
        field_i = 0.5f;
    }
}
