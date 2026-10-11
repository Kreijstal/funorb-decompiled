/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static int[] field_d;
    private ci field_f;
    static String[] field_b;
    private ci field_c;
    private fl field_a;
    private fl field_e;

    private final hb b(int param0, int param1, int[] param2, int param3) {
        hb stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        hb stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        hb var8 = null;
        ml var9 = null;
        hb var8Lifetime1;
        try {
          var5_int = (param1 << 4 & 65529 | param1 >>> 12) ^ param0;
          var5_int = var5_int | param1 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (hb) (this.field_e.a(var6, 0));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            stackIn_7_0 = null;
            return (hb) (stackIn_7_0);
          }
          var9 = (ml) (this.field_a.a(var6, param3 - 79289964));
          if (var9 == null) {
            var9 = ml.a(this.field_f, param1, param0);
            if (var9 == null) {
              return null;
            }
            this.field_a.a(var6, (byte) -100, var9);
          }
          var8Lifetime1 = var9.a(param2);
          if (var8Lifetime1 == null) {
            return null;
          }
          if (param3 != 79289964) {
            field_b = (String[]) null;
          }
          var9.c(5);
          this.field_e.a(var6, (byte) 74, var8Lifetime1);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("bl.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 858) {
          return;
        }
        ec.a("", param0 ^ 815, (String) null);
    }

    final hb a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        hb stackIn_2_0 = null;
        hb stackIn_5_0 = null;
        hb stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_f.a(117)) {
            stackIn_2_0 = this.b(param1, 0, param2, 79289964);
            return stackIn_2_0;
          }
          if (param0 != 1673501264) {
            stackIn_5_0 = (hb) null;
            return stackIn_5_0;
          }
          if (this.field_f.a(param1, (byte) 121) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.b(0, param1, param2, 79289964);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("bl.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final hb a(int[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        hb stackIn_2_0 = null;
        hb stackIn_5_0 = null;
        hb stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 17) {
            stackIn_2_0 = (hb) null;
            return stackIn_2_0;
          }
          if (this.field_c.a(param2 ^ 112) == 1) {
            stackIn_5_0 = this.a(-94, param1, param0, 0);
            return stackIn_5_0;
          }
          if (this.field_c.a(param1, (byte) 101) != 1) {
            throw new RuntimeException();
          }
          stackIn_9_0 = this.a(-48, 0, param0, param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("bl.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        cf var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          var4 = (cf) (mh.field_e.a((byte) -95));
          while (var4 != null) {
            gj.a((byte) 83, var4, param1);
            var4 = (cf) (mh.field_e.a(true));
          }
          if (!param0) {
            return;
          }
          field_d = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "bl.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 <= 81) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    private final hb a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        hb var8 = null;
        r var9 = null;
        int var10 = 0;
        hb var11 = null;
        hb stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        hb stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb var8Lifetime1;
        try {
          var5_int = param1 ^ (65533 & param3 << 4 | param3 >>> 12);
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (hb) (this.field_e.a(var6, 0));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            return null;
          }
          var9 = r.a(this.field_c, param3, param1);
          if (var9 == null) {
            stackIn_9_0 = null;
            return (hb) (stackIn_9_0);
          }
          var10 = -92 / ((48 - param0) / 34);
          var11 = var9.a();
          var8Lifetime1 = var11;
          this.field_e.a(var6, (byte) 75, var8Lifetime1);
          if (param2 != null) {
            param2[0] = param2[0] - var11.field_l.length;
          }
          stackIn_14_0 = var8Lifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    bl(ci param0, ci param1) {
        this.field_a = new fl(256);
        this.field_e = new fl(256);
        try {
          this.field_f = param1;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new int[8192];
        field_b = new String[]{"Score 600+ points", "Score 1,000+ points", "Submit a 6+ letter word that uses exactly the same tiles as the previous word", "Submit a 9+ letter word that uses exactly the same tiles as the previous word", "Submit a word where every tile has already been used at least twice", "Submit a word where every tile has already been used at least three times", "Reuse any one consonant tile in every word", "Reuse any two consonant tiles in every word", "Submit a word of 10+ letters", "Submit a 12-letter word", "Extend a 4+ letter word by using every one of its tiles plus 3 new ones", "Submit a 100-point word", "Get a time bonus of 100+ points", "Get a time bonus of 150+ points", "Score 600+ points, including a time bonus of 100+", "Spell 'pumpkin', 'mummy', 'skeleton' or 'vampire'!"};
    }
}
