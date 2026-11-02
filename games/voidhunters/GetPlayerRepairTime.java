/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetPlayerRepairTime extends ConsoleCommand {
    static IntrusiveDeque field_p;
    static byte[] field_o;

    public static void a(int param0) {
        if (param0 != 8) {
          field_p = (IntrusiveDeque) null;
          field_p = null;
          field_o = null;
          return;
        }
        field_p = null;
        field_o = null;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, -2);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(226, 110));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ce.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        SetShipDirectionArrow.field_o = new mfb[12];
        SetShipDirectionArrow.field_o[0] = (mfb) ((Object) new fpb());
        SetShipDirectionArrow.field_o[1] = (mfb) ((Object) new deb());
        SetShipDirectionArrow.field_o[2] = (mfb) ((Object) new ifb());
        SetShipDirectionArrow.field_o[3] = (mfb) ((Object) new wqb());
        SetShipDirectionArrow.field_o[4] = (mfb) ((Object) new mna());
        SetShipDirectionArrow.field_o[5] = (mfb) ((Object) new teb());
        SetShipDirectionArrow.field_o[6] = (mfb) ((Object) new fma());
        SetShipDirectionArrow.field_o[11] = (mfb) ((Object) new rma());
        SetShipDirectionArrow.field_o[7] = (mfb) ((Object) new wca());
        SetShipDirectionArrow.field_o[8] = (mfb) ((Object) new dm());
        SetShipDirectionArrow.field_o[9] = (mfb) ((Object) new ira());
        SetShipDirectionArrow.field_o[10] = (mfb) ((Object) new jeb());
        if (param0) {
          GetPlayerRepairTime.b(false);
        }
    }

    final static void a(asb param0, boolean param1) {
        fca var2 = null;
        try {
          fca.b(param0.a("", true, "headers.packvorbis"));
          if (param1) {
            asb var3 = (asb) null;
            GetPlayerRepairTime.a((asb) null, false);
          }
          var2 = fca.a(param0, "jagex logo2.packvorbis", "");
          var2.b();
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ce.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    GetPlayerRepairTime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = new IntrusiveDeque();
    }
}
