/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ShipBlueprint implements DiffableState {
    static no field_a;
    int[] description;
    static String field_b;

    public final void b(byte param0, tv param1) {
        ShipBlueprint var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (ShipBlueprint) (param1);
          var3.description = SetTeamSelectionSpeedup.a(var3.description, (byte) -97, this.description);
          if (param0 > 54) {
            return;
          }
          ShipBlueprint.a(-115, -119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("boa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 > 113) {
          return GetArmageddonTimerStart.a(-95, 8, this.description, null != this.description ? this.description.length : 0);
        }
        return 100;
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.description = wkb.a((byte) 37, this.description, param0, 8);
          if (param1) {
            ShipBlueprint.a(-120, 56);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "boa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        try {
          if (qga.field_b.position >= param0) {
            return true;
          }
          if (param1 != 30000) {
            ShipBlueprint.a(-32, -68);
          }
          if (null == SetShipSpawnInvulnerabilityTime.field_o) {
            return false;
          }
          int var2_int = SetShipSpawnInvulnerabilityTime.field_o.c(0);
          if (var2_int > 0) {
            if (var2_int > -qga.field_b.position + param0) {
              var2_int = param0 - qga.field_b.position;
            }
            SetShipSpawnInvulnerabilityTime.field_o.a(param1 ^ -30026, qga.field_b.position, var2_int, qga.field_b.payload);
            cbb.field_q = wt.a(false);
            qga.field_b.position = qga.field_b.position + var2_int;
            if (param0 > qga.field_b.position) {
              return false;
            }
            qga.field_b.position = 0;
            return true;
          }
          try {
            if (false) throw (IOException) null;
            if (var2_int >= 0 &&
              30000L >= mw.e(0)) {
              return false;
            }
            ifb.l(param1 ^ -30026);
          } catch (IOException iOException) {
            ifb.l(-126);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        ShipBlueprint var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (ShipBlueprint) (other);
          var4 = 0;
          if (obfuscationGuard >= -19) {
            field_a = (no) null;
          }
          if (GetCountermeasuresCooldown.a(this.description, var3.description, false)) {
            var4 = 1;
            System.out.println("int[] description has changed. ");
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of ShipBlueprint has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("boa.F(");
          if (other == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        ShipBlueprint var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (ShipBlueprint) (param1);
          var4 = -3 / ((param0 - 22) / 59);
          stackIn_1_0 = SetBlueprintSaveTime.a(var3.description, this.description, (byte) 28);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("boa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = 8;
          if (null == this.description) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = this.description.length;
          }
          pgb.a(stackIn_2_0, stackIn_3_1, 55, param0, this.description);
          if (param1 <= -109) {
            return;
          }
          var4 = (faa) null;
          this.b((faa) null, -93);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("boa.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "Save your ship design";
    }
}
