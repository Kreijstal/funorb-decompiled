/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpawnChoice implements DiffableState {
    int choice;
    static String[] field_b;

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.choice, 32);
          if (param1 >= -109) {
            tv var4 = (tv) null;
            this.a((byte) 94, (tv) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "twa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 32) {
          SpawnChoice.a(-98);
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            SpawnChoice.b(40);
          }
          this.choice = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "twa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        SpawnChoice var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (SpawnChoice) (other);
          if (obfuscationGuard >= -19) {
            field_b = (String[]) null;
          }
          var4 = 0;
          if (var3.choice != this.choice) {
            var4 = 1;
            System.out.println("int choice has changed. before=" + var3.choice + ", now=" + this.choice);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of SpawnChoice has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("twa.F(");
          if (other == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        SpawnChoice var5 = null;
        SpawnChoice var6 = null;
        try {
          var5 = (SpawnChoice) (param1);
          var6 = var5;
          if (param0 <= 54) {
            this.choice = 85;
          }
          var6.choice = this.choice;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "twa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        GetUseFilledPolygons.a(-1);
        if (param0 > 25) {
          tla.field_c = true;
          vu.field_xb = true;
          GetLagStandardDeviationIn.field_r.g((byte) -17);
          fa.a(SetCountermeasureLauncherEnergyUsed.field_p, -122, false);
          return;
        }
        field_b = (String[]) null;
        tla.field_c = true;
        vu.field_xb = true;
        GetLagStandardDeviationIn.field_r.g((byte) -17);
        fa.a(SetCountermeasureLauncherEnergyUsed.field_p, -122, false);
    }

    SpawnChoice() {
    }

    public final boolean a(byte param0, tv param1) {
        SpawnChoice var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 36 % ((22 - param0) / 59);
          var3 = (SpawnChoice) (param1);
          stackIn_3_0 = (this.choice != var3.choice);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("twa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    SpawnChoice(int param0) {
        this.choice = param0;
    }

    static {
        field_b = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
