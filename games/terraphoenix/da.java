/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    private il field_j;
    static int field_d;
    static boolean field_f;
    static he field_g;
    static String[] field_i;
    static pk field_h;
    static int field_b;
    private fa field_a;
    private fa field_c;
    private il field_e;

    private final gg a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gg var8 = null;
        tl var9 = null;
        gg stackIn_2_0 = null;
        gg stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        gg stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        gg var8Lifetime1;
        try {
          var5_int = param0 ^ ((-536866817 & param3) << 4 | param3 >>> 12);
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          if (param1 != 0) {
            stackIn_2_0 = (gg) null;
            return stackIn_2_0;
          }
          var8 = (gg) (this.field_e.a((byte) 46, var6));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            return null;
          }
          var9 = (tl) (this.field_j.a((byte) 46, var6));
          if (var9 == null) {
            var9 = tl.a(this.field_c, param3, param0);
            if (var9 == null) {
              stackIn_13_0 = null;
              return (gg) (stackIn_13_0);
            }
            this.field_j.a(var9, var6, (byte) -123);
          }
          var8Lifetime1 = var9.a(param2);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.b((byte) 12);
          this.field_e.a(var8Lifetime1, var6, (byte) -117);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("da.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    private final gg a(int param0, String param1, int[] param2) {
        RuntimeException var4 = null;
        gg stackIn_2_0 = null;
        gg stackIn_5_0 = null;
        gg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -121) {
            stackIn_2_0 = (gg) null;
            return stackIn_2_0;
          }
          if (!this.field_c.d(-1, "")) {
            stackIn_7_0 = this.a("", param1, (byte) -62, param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = this.a(param1, "", (byte) 119, param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("da.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final gg a(String param0, byte param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        gg stackIn_2_0 = null;
        gg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_a.c(param1 + 28, param3);
          if (param1 != -29) {
            stackIn_2_0 = (gg) null;
            return stackIn_2_0;
          }
          if (var5_int < 0) {
            return null;
          }
          var6 = this.field_a.a(-88, var5_int, param0);
          if (var6 < 0) {
            return null;
          }
          stackIn_10_0 = this.a(var5_int, (byte) 18, param2, var6);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("da.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final gg a(int param0, String param1) {
        gg discarded$1 = null;
        RuntimeException var3 = null;
        int[] var4 = null;
        gg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            var4 = (int[]) null;
            discarded$1 = this.a(86, (byte) 74, (int[]) null, -114);
          }
          stackIn_3_0 = this.a(param0 - 122, param1, (int[]) null);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("da.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        uc var2 = di.field_l;
        var2.k(-17410, param1);
        var2.i(1, 24);
        var2.i(param0, -123);
    }

    private final gg a(String param0, String param1, byte param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        gg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_c.c(-1, param1);
          if (var5_int < 0) {
            return null;
          }
          var6 = this.field_c.a(-124, var5_int, param0);
          if (0 > var6) {
            return null;
          }
          var7 = -78 % ((param2 - 26) / 50);
          stackIn_7_0 = this.a(var6, 0, param3, var5_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("da.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final gg a(int[] param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        gg stackIn_3_0 = null;
        gg stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 7 % ((70 - param2) / 46);
          if (this.field_a.d(-1, "")) {
            stackIn_3_0 = this.a(param1, (byte) -29, param0, "");
            return stackIn_3_0;
          }
          stackIn_5_0 = this.a("", (byte) -29, param0, param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("da.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_h = null;
        if (param0 != 18210) {
          da.a(-45, 102);
          field_i = null;
          return;
        }
        field_i = null;
    }

    final gg a(byte param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        String var5 = null;
        gg stackIn_3_0 = null;
        gg stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_c.c(param0 + 20) == 1) {
            stackIn_3_0 = this.a(param2, 0, param1, 0);
            return stackIn_3_0;
          }
          if (param0 != -21) {
            var5 = (String) null;
            this.a((String) null, -114);
          }
          if (1 != this.field_c.c(param0 - 519, param2)) {
            throw new RuntimeException();
          }
          stackIn_9_0 = this.a(0, param0 ^ -21, param1, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("da.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final gg a(String param0, int param1) {
        gg discarded$1 = null;
        RuntimeException var3 = null;
        int[] var4 = null;
        gg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var4 = (int[]) null;
            discarded$1 = this.a((String) null, (String) null, (byte) -60, (int[]) null);
          }
          stackIn_3_0 = this.a((int[]) null, param0, -127);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("da.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final gg a(int param0, byte param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gg var8 = null;
        oc var9 = null;
        gg var10 = null;
        gg stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        gg stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        gg var8Lifetime1;
        try {
          var5_int = param3 ^ ((param0 & -805302273) << 4 | param0 >>> 12);
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int;
          var8 = (gg) (this.field_e.a((byte) 46, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            stackIn_7_0 = null;
            return (gg) (stackIn_7_0);
          }
          var9 = oc.a(this.field_a, param0, param3);
          if (var9 == null) {
            stackIn_10_0 = null;
            return (gg) (stackIn_10_0);
          }
          if (param1 != 18) {
            this.field_j = (il) null;
          }
          var10 = var9.a();
          var8Lifetime1 = var10;
          this.field_e.a(var8Lifetime1, var6, (byte) -82);
          if (param2 != null) {
            param2[0] = param2[0] - var10.field_k.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("da.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final gg a(byte param0, int param1, int[] param2) {
        gg discarded$1 = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        gg stackIn_4_0 = null;
        gg stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -37) {
            var5 = (int[]) null;
            discarded$1 = this.a(21, 68, (int[]) null, -32);
          }
          if (this.field_a.c(-1) == 1) {
            stackIn_4_0 = this.a(0, (byte) 18, param2, param1);
            return stackIn_4_0;
          }
          if (1 != this.field_a.c(-540, param1)) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(param1, (byte) 18, param2, 0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("da.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    da(fa param0, fa param1) {
        this.field_j = new il(256);
        this.field_e = new il(256);
        try {
          this.field_a = param0;
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 100;
        field_i = new String[]{"", "", "", "", "", "", "The Americans have sent us the designs for an experimental laser cannon that they tell us is effective against these aliens we have been told about. It would be prudent to build a prototype and see how it fares in combat situations.", "Our scientists feel that they might be able to improve the size of the laser cannon so that it is less bulky for our soldiers.", "The aliens utilise a strange weapon that seems to contain a small maggot like creature. When agitated this creature expels a highly reactive liquid that is subsequently propelled forwards towards the target. With a few modifications we should be able to get the hang of how to use this weaponry against its creators.", "The aliens utilise a strange weapon that seems to contain a small maggot like creature. When agitated this creature expels a highly reactive liquid that is subsequently propelled forwards towards the target. With a few modifications we should be able to get the hang of how to use this weaponry against its creators.", "Using what we have learned of pulse technology, we feel that it will be possible to build our own version of a pulse weapon that is better suited for human use.", "The aliens seem to use what appear to be grenades with the pulse maggots within to power them.", "The aliens have started using a new type of weapon against us. It still seems to use a pulse maggot for power but the projectiles it fires seem to be different.", "The aliens have started using a new type of weapon against us. It still seems to use a pulse maggot for power but the projectiles it fires seem to be different.", "The aliens have brought out the big guns now; this heavy fusion gun can fire heavy tungsten slugs at alarming speeds. As it is so bulky, we will need to spend some time working out how to modify it for human use.", "The aliens have started using powerful explosive rocket launchers against us. We need to figure out the targeting system in order for our troops to use it.", "We should convert the aliens' fusion technology for our own use to use against the alien invaders.", "The aliens are using these pods to help protect against attacks. If we look into how to turn them on we could supply our own soldiers with the devices.", "", "", ""};
    }
}
