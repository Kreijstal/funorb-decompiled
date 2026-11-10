/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DoorwayComponent extends PrefabComponent {
    private int field_J;
    static String[] field_L;
    static String field_G;
    static oc[] field_K;
    static int field_I;
    private int field_H;
    static ka[] field_F;

    final boolean n(byte param0) {
        if (param0 != -122) {
          return true;
        }
        return false;
    }

    DoorwayComponent(Room param0, int param1) {
        super(param0, param1);
    }

    public static void releaseStatics(int param0) {
        field_F = null;
        field_K = null;
        field_L = null;
        field_G = null;
        int var1 = -58 % ((param0 + 22) / 62);
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        int var6_int = 0;
        Object var17 = null;
        Object var18 = null;
        int var19 = 0;
        Trap var20 = null;
        Object var21 = null;
        Trap stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        mfa var6 = null;
        Trap var7_ref_fsa = null;
        int var7 = 0;
        SimpleBlockBehaviour var8 = null;
        PathMoveLocomotor var9 = null;
        PathMoveLocomotor var10 = null;
        Trap var11 = null;
        SimpleBlockBehaviour var12 = null;
        PathMoveLocomotor var13 = null;
        PathMoveLocomotor var14 = null;
        int var15 = 0;
        int var16 = 0;
        lfa var17_ref = null;
        lfa var18_ref = null;
        lfa var21_ref = null;
        var17 = null;
        var18 = null;
        var21 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          var20 = new Trap(param2, param0);
          var20.b((byte) -11, this.field_k, this.field_l);
          var6_int = this.typeId;
          if (var6_int != 44 &&
            var6_int != 45) {
            if (var6_int != 20 &&
              var6_int == 21) {
            }
            this.field_J = 1;
            var5 = 1;
            this.field_H = 4;
          } else {
            var5 = 0;
          }
          var6 = rm.field_a;
          if (var5 != 0) {
            var7_ref_fsa = new Trap(param2, param0);
            var7_ref_fsa.b((byte) -11, this.field_k / 3, this.field_l / 2);
            var7_ref_fsa.b(437453352, -327680, -this.field_l / 4);
            var7_ref_fsa.h(3, 0);
            var8 = new SimpleBlockBehaviour(param2, param0);
            var7_ref_fsa.addBehaviour((byte) 83, (Behaviour) (var8));
            var9 = new PathMoveLocomotor(param2, param0);
            var9.a(param1 ^ 40, new gea(new int[][]{new int[]{0, 0}}));
            var7_ref_fsa.addLocomotor(var9, 0);
            var10 = new PathMoveLocomotor(param2, param0);
            var10.a(param1 ^ 14, new gea(new int[][]{new int[]{262144 + -this.field_l / 2, 0}}));
            var10.a(true, false);
            var7_ref_fsa.addLocomotor(var10, 0);
            var11 = new Trap(param2, param0);
            var11.b((byte) -11, this.field_k / 3, this.field_l / 2);
            var11.b(437453352, -327680, this.field_l / 4);
            var11.h(3, 0);
            var12 = new SimpleBlockBehaviour(param2, param0);
            var11.addBehaviour((byte) 83, (Behaviour) (var12));
            var13 = new PathMoveLocomotor(param2, param0);
            var13.a(87, new gea(new int[][]{new int[]{0, 0}}));
            var11.addLocomotor(var13, param1 ^ 3);
            var14 = new PathMoveLocomotor(param2, param0);
            var14.a(66, new gea(new int[][]{new int[]{-262144 + this.field_l / 2, 0}}));
            var14.a(true, false);
            var11.addLocomotor(var14, 0);
            var20.addChild(-72, var7_ref_fsa);
            var20.addChild(-42, var11);
            if (this.field_H == 3) {
              var15 = 0;
            } else {
              var15 = 3;
            }
            if (this.field_H != 3) {
              var16 = 4;
            } else {
              var16 = 1;
            }
            var17_ref = (lfa) (var6.a(6, 87));
            var17_ref.a(var15, true);
            var7_ref_fsa.a((TrapPart) null, (byte) 124, var17_ref);
            var7_ref_fsa.f(param1 + 7, 1048576);
            var18_ref = (lfa) (var6.a(6, 101));
            var18_ref.a(var16, true);
            var11.a((TrapPart) null, (byte) 124, var18_ref);
            var11.f(param1 + 7, 1048576);
          }
          if (this.field_H != param1) {
            var7 = 5;
          } else {
            var7 = 2;
          }
          var21_ref = (lfa) (var6.a(6, 126));
          var21_ref.a(var7, true);
          var20.a((TrapPart) null, (byte) 124, var21_ref);
          stackIn_23_0 = var20;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("mh.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        int var2 = this.typeId;
        if (20 == var2) {
          this.field_J = 1;
          this.field_H = 3;
          this.b(-67, this.field_H * 2097152, 2097152 * this.field_J);
          return;
        }
        if (var2 == 44) {
          this.field_J = 1;
          this.field_H = 3;
          this.b(-67, this.field_H * 2097152, 2097152 * this.field_J);
          return;
        }
        if (var2 == 21) {
          this.field_H = 4;
          this.field_J = 1;
          this.b(-67, this.field_H * 2097152, 2097152 * this.field_J);
          return;
        }
        if (45 != var2) {
          this.field_H = 4;
          this.field_J = 1;
          this.b(-67, this.field_H * 2097152, 2097152 * this.field_J);
          return;
        }
        this.field_H = 4;
        this.field_J = 1;
        this.b(-67, this.field_H * 2097152, 2097152 * this.field_J);
    }

    DoorwayComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          return false;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
          this.v(-73);
          return 7;
        }
        return 7;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "mh.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return false;
    }

    final static jea r(byte param0) {
        if (param0 != 107) {
          return (jea) null;
        }
        return tn.field_n.field_tb;
    }

    static {
        field_G = "Game options";
        field_I = 0;
    }
}
