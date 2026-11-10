/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeaponItemBehaviour extends ItemBehaviour {
    private Weapon field_t;
    static float field_s;

    final void g(byte param0) {
        this.field_t = this.field_t.e(-1);
        if (param0 != 3) {
          Weapon var3 = (Weapon) null;
          this.a((Weapon) null, 81);
        }
    }

    final boolean tryCollect(int param0, Player param1) {
        RuntimeException var3 = null;
        Player var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1.g(62, 106);
          param1.a(this.field_t, true);
          if (param0 < -114) {
            return true;
          }
          var4 = (Player) null;
          this.tryCollect(66, (Player) null);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ef.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    WeaponItemBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        try {
          this.field_t = TextureOperator.a(4, -1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ef.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          if (param0) {
            field_s = 2.416393518447876f;
          }
          super.encode(param0, param1);
          this.field_t.a(param1, (byte) 7);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ef.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          field_s = 0.07193703204393387f;
          return 5;
        }
        return 5;
    }

    final void a(Weapon param0, int param1) {
        if (param1 != 5) {
          return;
        }
        try {
          this.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ef.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    WeaponItemBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_t = jl.a(param0, true, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ef.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
