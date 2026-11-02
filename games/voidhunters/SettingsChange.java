/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SettingsChange implements DiffableState {
    static phb field_e;
    static int field_b;
    int id;
    int value;
    static String field_d;
    static int[] field_f;

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_f = null;
        if (param0 != 61) {
          field_b = 59;
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        SettingsChange var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (SettingsChange) (other);
          if (obfuscationGuard > -19) {
            var5 = (faa) null;
            this.a((faa) null, false);
          }
          var4 = 0;
          if (this.id != var6.id) {
            System.out.println("int id has changed. before=" + var6.id + ", now=" + this.id);
            var4 = 1;
          }
          if (this.value != var6.value) {
            System.out.println("int value has changed. before=" + var6.value + ", now=" + this.value);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of SettingsChange has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("so.F(");
          if (other == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.id = param0.i(0, 32);
          this.value = param0.i(0, 32);
          if (param1) {
            field_f = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "so.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    SettingsChange() {
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.id, 32);
          param0.a(-632, this.value, 32);
          if (param1 >= -109) {
            faa var4 = (faa) null;
            this.b((faa) null, 25);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "so.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    SettingsChange(int param0, int param1) {
        this.value = param1;
        this.id = param0;
    }

    public final boolean a(byte param0, tv param1) {
        SettingsChange var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (SettingsChange) (param1);
          var4 = -54 / ((22 - param0) / 59);
          stackIn_5_0 = (this.id != var3.id) || (var3.value != this.value);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("so.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        SettingsChange var5 = null;
        SettingsChange var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (SettingsChange) (param1);
          var6 = var5;
          var6.id = this.id;
          var6.value = this.value;
          if (param0 > 54) {
            return;
          }
          this.value = -97;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("so.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_b = 3;
        field_d = "Create";
    }
}
