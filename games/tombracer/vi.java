/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    private IntrusiveDeque field_b;
    static int field_a;

    final void a(int param0) {
        if (param0 == 0) {
          this.field_b.clear(param0 ^ 8);
          return;
        }
        S2CActionPacket var3 = (S2CActionPacket) null;
        this.a((byte) 62, (S2CActionPacket) null);
        this.field_b.clear(param0 ^ 8);
    }

    final S2CActionPacket a(boolean param0) {
        if (!param0) {
          this.field_b = (IntrusiveDeque) null;
          if (!this.field_b.isEmpty((byte) 14)) {
            return (S2CActionPacket) (this.field_b.removeFirst(-113));
          }
          return null;
        }
        if (!this.field_b.isEmpty((byte) 14)) {
          return (S2CActionPacket) (this.field_b.removeFirst(-113));
        }
        return null;
    }

    static long bitwiseAnd(long param0, long param1) {
        return param0 & param1;
    }

    final boolean a(byte param0, S2CActionPacket param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_b.addLast((byte) -110, param1);
          if (param0 > 9) {
            return true;
          }
          field_a = 94;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        int var2 = 35 % ((51 - param0) / 46);
        return this.field_b.size((byte) -16);
    }

    final int a(byte param0, int param1) {
        S2CActionPacket var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        int var3 = 0;
        S2CActionPacket var4Lifetime1;
        if (param0 < 21) {
          this.a((byte) 71, -82);
        } else {
          var4 = (S2CActionPacket) (this.field_b.first(-80));
          while (var4 != null) {
            if (var4.hasOrdersFor(false, param1)) {
              var3++;
            }
            var4 = (S2CActionPacket) (this.field_b.next(107));
          }
          return var3;
        }
        var4Lifetime1 = (S2CActionPacket) (this.field_b.first(-80));
        while (var4Lifetime1 != null) {
          if (var4Lifetime1.hasOrdersFor(false, param1)) {
            var3++;
          }
          var4Lifetime1 = (S2CActionPacket) (this.field_b.next(107));
        }
        return var3;
    }

    vi() {
        this.field_b = new IntrusiveDeque();
    }

    static {
    }
}
