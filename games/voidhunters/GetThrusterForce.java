/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetThrusterForce extends ConsoleCommand {
    GetThrusterForce(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            GetThrusterForce.a(-72);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(170, 112));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("irb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0) {
        me.field_q.a(0, 123, DualLinkNode.field_f.field_hb - (!GetGrapplingHooksDamageableBySourcePlayer.field_o ? 0 : 4 + (ResourceNode.field_a + 40)), 0, 18);
        GetDebrisGrabbingRange.field_o.a(-40 + DualLinkNode.field_f.field_hb + (-ResourceNode.field_a - 2), -29, 42 + ResourceNode.field_a, param0, 18);
        tja.field_a.a(DualLinkNode.field_f.field_hb, 2, -1, DualLinkNode.field_f.field_G - 20, 20, 0, ResourceNode.field_a);
    }

    static {
    }
}
