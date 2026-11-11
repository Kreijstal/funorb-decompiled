/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CorpseList {
    static int field_b;
    private IntrusiveDeque corpses;

    final void clear(int param0) {
        if (param0 != -10430) {
          return;
        }
        this.corpses.clear(8);
    }

    final void a(RenderScene param0, int param1) {
        Corpse var3 = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != -28255) {
            field_b = 19;
          }
          var3 = (Corpse) (this.corpses.first(-80));
          while (var3 != null) {
            param0.addToLayer((byte) 25, var3.f((byte) 103), var3);
            var3 = (Corpse) (this.corpses.next(111));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("te.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void copyFrom(int param0, IntrusiveDeque param1) {
        int var4 = 0;
        IntrusiveDeque var5 = null;
        Corpse var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 23436) {
            var5 = (IntrusiveDeque) null;
            this.copyFrom(71, (IntrusiveDeque) null);
          }
          var6 = (Corpse) (param1.first(-80));
          while (var6 != null) {
            this.corpses.addLast((byte) -97, new Corpse(var6));
            var6 = (Corpse) (param1.next(121));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("te.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void mirrorInRoom(Room param0, int param1) {
        int var4 = 0;
        Corpse var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 > -59) {
            this.clear(-81);
          }
          var5 = (Corpse) (this.corpses.first(-80));
          while (var5 != null) {
            var5.mirrorInRoom(param0, (byte) -72);
            var5 = (Corpse) (this.corpses.next(107));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("te.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    CorpseList() {
        this.corpses = new IntrusiveDeque();
    }

    static {
    }
}
