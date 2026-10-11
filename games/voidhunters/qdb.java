/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qdb implements ntb {
    int field_b;
    int field_d;
    int field_f;
    static dja field_a;
    int[] field_c;
    static String field_e;

    public final void a(faa param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          this.field_b = param0.i(0, 8);
          this.field_d = param0.i(0, 32);
          this.field_c = wkb.a((byte) 37, this.field_c, param0, 8);
          this.field_f = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qdb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int[] var22 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var16Lifetime1;
        int var16Lifetime2;
        var18 = VoidHunters.field_G;
        try {
          var12 = ksa.a(31123, lua.field_c, hab.field_i, param5);
          var13 = ksa.a(31123, lua.field_c, hab.field_i, param7);
          var14 = ksa.a(param2 ^ 31123, ob.field_j, mt.field_o, param4);
          var15 = ksa.a(31123, ob.field_j, mt.field_o, param0);
          var8_int = ksa.a(31123, lua.field_c, hab.field_i, param5 + param1);
          var9 = ksa.a(31123, lua.field_c, hab.field_i, param7 - param1);
          for (var16 = var12; var16 < var8_int; var16++) {
            ww.a(param6, var15, rba.field_b[var16], (byte) 75, var14);
          }
          if (param2 != 0) {
            field_a = (dja) null;
          }
          for (var16Lifetime1 = var13; var16Lifetime1 > var9; var16Lifetime1--) {
            ww.a(param6, var15, rba.field_b[var16Lifetime1], (byte) 75, var14);
          }
          var10 = ksa.a(31123, ob.field_j, mt.field_o, param1 + param4);
          var11 = ksa.a(31123, ob.field_j, mt.field_o, -param1 + param0);
          for (var16Lifetime2 = var8_int; var16Lifetime2 <= var9; var16Lifetime2++) {
            var22 = rba.field_b[var16Lifetime2];
            ww.a(param6, var10, var22, (byte) 75, var14);
            ww.a(param3, var11, var22, (byte) 75, var10);
            ww.a(param6, var15, var22, (byte) 75, var11);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var8), "qdb.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        qdb var3 = (qdb) (param1);
        var3.field_b = this.field_b;
        var3.field_d = this.field_d;
        var3.field_c = dob.a(var3.field_c, (byte) -38, this.field_c);
        if (param0 < 54) {
          return;
        }
        try {
          var3.field_f = this.field_f;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qdb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 >= -116) {
          qdb.a(-38, -12, 117, 53, true, 38, true, false, -13, true, 95, 127, 29, true);
        }
    }

    public final boolean a(byte param0, tv param1) {
        qdb var3 = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = -60 % ((param0 - 22) / 59);
          var3 = (qdb) (param1);
          stackIn_7_0 = (this.field_b != var3.field_b) || (this.field_d != var3.field_d) || (wpb.a(var3.field_c, this.field_c, (byte) 28)) || (var3.field_f != this.field_f);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("qdb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 >= -109) {
          return;
        }
        try {
          param0.a(-632, this.field_b, 8);
          param0.a(-632, this.field_d, 32);
          pgb.a(8, this.field_c != null ? this.field_c.length : 0, 49, param0, this.field_c);
          param0.a(-632, this.field_f, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qdb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6, boolean param7, int param8, boolean param9, int param10, int param11, int param12, boolean param13) {
        lob.field_a = null;
        tr.c(6939);
        if (param8 >= -118) {
          return;
        }
        param4 = oga.a(33, param11, param1, param12, param3, param0, param4);
        rl.a(param4, -1, param2, param10, param7, param11, param5, param6, param13, param9);
        chb.a(0, param5, param7);
        mn.a(param4, param5, param12, 97);
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        qdb var6 = null;
        try {
          var6 = (qdb) (param0);
          var4 = 0;
          if (this.field_b != var6.field_b) {
            var4 = 1;
            System.out.println("int voted_objective has changed. before=" + var6.field_b + ", now=" + this.field_b);
          }
          if (var6.field_d != this.field_d) {
            System.out.println("int mission_generation_seed has changed. before=" + var6.field_d + ", now=" + this.field_d);
            var4 = 1;
          }
          if (ikb.a(this.field_c, var6.field_c, false)) {
            var4 = 1;
            System.out.println("int[] option_totals has changed. ");
          }
          if (var6.field_f != this.field_f) {
            var4 = 1;
            System.out.println("int rounds_left has changed. before=" + var6.field_f + ", now=" + this.field_f);
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionGenerationData has changed");
          }
          if (param1 > -19) {
            var5 = (faa) null;
            this.b((faa) null, -26);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("qdb.F(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "Average rating";
        field_a = (dja) ((Object) new ccb());
    }
}
