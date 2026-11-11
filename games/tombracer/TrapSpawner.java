/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrapSpawner extends Spawner {
    private Trap template;
    static String field_b;

    final void resolveSwitchLinks(byte param0) {
        if (param0 < 67) {
          return;
        }
        this.template.resolveSwitchLinks(true);
    }

    final static void sleepMillis(int param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param1 % 10L != 0L) {
          Trap.sleep(param0 + 9, param1);
          if (param0 != 0) {
            field_b = (String) null;
            return;
          }
          return;
        }
        Trap.sleep(9, param1 - 1L);
        Trap.sleep(9, 1L);
        if (param0 != 0) {
          field_b = (String) null;
          return;
        }
    }

    TrapSpawner(Room param0, BitPacketBuffer param1) {
        super(param0, param1);
        try {
          this.template = new Trap(this.field_a, param1, false);
          this.template.setTopLevel((byte) 50, false);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "vja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        if (param0 != 30000) {
          field_b = (String) null;
        }
    }

    final void assignSwitchableIds(byte param0, SwitchableIdAllocator param1, boolean param2, SwitchableIdAllocator param3) {
        try {
          int var5_int = -11 % ((param0 - 31) / 61);
          this.template.assignSwitchableIds(true, param2, param3, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "vja.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static kia b(int param0) {
        if (param0 != 30000) {
          return (kia) null;
        }
        return Room.field_k;
    }

    final int getTypeId(boolean param0) {
        if (!param0) {
          this.template = (Trap) null;
          return 0;
        }
        return 0;
    }

    final Switchable findSwitchableRecursive(boolean param0, int param1, int param2) {
        if (param1 > -3) {
          return (Switchable) null;
        }
        return this.template.findSwitchableRecursive(param0, param2, (byte) -26);
    }

    final void encode(BitPacketBuffer param0, byte param1) {
        try {
          super.encode(param0, param1);
          this.template.encode(param0, 8);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "vja.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void spawn(int param0, int param1, int param2, int param3) {
        Trap var6 = null;
        Trap var6Lifetime1;
        if (this.template.isEmpty(96)) {
          return;
        }
        if (this.template.isExpired(18407)) {
          return;
        }
        BitPacketBuffer var5 = new BitPacketBuffer(30000);
        var5.beginBitWrite(8);
        this.template.encode(var5, 97);
        if (param3 == 4) {
          var5.endBitWrite(-1826190686);
          var6 = this.template.cloneInto(param3 - 14406, this.field_a, true);
          var6.setLocalX(1, param1);
          var6.setLocalY(param2, -19879);
          var6.rotateBy(false, param0);
          this.field_a.addTrap(var6, (byte) 32);
          return;
        }
        this.getTypeId(false);
        var5.endBitWrite(-1826190686);
        var6Lifetime1 = this.template.cloneInto(param3 - 14406, this.field_a, true);
        var6Lifetime1.setLocalX(1, param1);
        var6Lifetime1.setLocalY(param2, -19879);
        var6Lifetime1.rotateBy(false, param0);
        this.field_a.addTrap(var6Lifetime1, (byte) 32);
    }

    final static void b(boolean param0) {
        StatReportingScoringObserver.field_l.field_a = 0;
        StatReportingScoringObserver.field_l.field_n = 0;
        if (!param0) {
          TrapSpawner.sleepMillis(-52, -43L);
        }
    }

    static {
        field_b = "Loading fonts";
    }
}
