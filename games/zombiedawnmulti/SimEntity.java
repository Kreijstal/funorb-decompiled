/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SimEntity extends TertiaryLinkNode {
    int field_D;
    int cellX;
    static String field_y;
    int positionY;
    static Sprite field_J;
    static cj field_z;
    int objectId;
    int positionX;
    static String field_I;
    int cellY;
    static tq field_H;
    static long field_K;
    static String field_F;
    GameSimulation simulation;

    final static int a(boolean param0, int param1, String param2, int param3, String param4, String param5, int param6) {
        hf var7 = null;
        RuntimeException var7_ref = null;
        hf var8 = null;
        int var9 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = -51 % ((param3 + 75) / 50);
          var7 = new hf(param5);
          var8 = new hf(param2);
          stackIn_1_0 = mg.a(param0, var7, param6, var8, param4, param1, (byte) -92);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_4_0 = var7_ref;
          stackIn_4_1 = new StringBuilder().append("ek.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_J = null;
        field_F = null;
        if (param0 < -63) {
          field_z = null;
          field_I = null;
          field_y = null;
          field_H = null;
          return;
        }
        field_K = -50L;
        field_z = null;
        field_I = null;
        field_y = null;
        field_H = null;
    }

    final void updateCell(byte param0) {
        int var4 = 0;
        int var2 = this.positionX >> 24;
        int var3 = this.positionY >> 24;
        int var4Lifetime1;
        int var4Lifetime2;
        if (var2 != this.cellX) {
          this.cellX = var2;
          this.cellY = var3;
          this.simulation.relinkCell(-44, this);
          var4 = -126 % ((-59 - param0) / 46);
          return;
        }
        if (var3 == this.cellY) {
          var4Lifetime1 = -126 % ((-59 - param0) / 46);
          return;
        }
        this.cellX = var2;
        this.cellY = var3;
        this.simulation.relinkCell(-44, this);
        var4Lifetime2 = -126 % ((-59 - param0) / 46);
    }

    abstract void tick(int param0);

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        me.field_h = param4;
        if (param2 == 1829947600) {
          nc.field_h = param0;
          WidgetContainer.field_C = param1;
          bf.field_g = param3;
          return;
        }
        field_z = (cj) null;
        nc.field_h = param0;
        WidgetContainer.field_C = param1;
        bf.field_g = param3;
    }

    final int getY(int param0) {
        if (param0 == 1829947600) {
          return this.positionY >> 16;
        }
        String var3 = (String) null;
        SimEntity.a(false, -35, (String) null, -111, (String) null, (String) null, -17);
        return this.positionY >> 16;
    }

    final static void i(int param0) {
        q.field_a = null;
        aa.field_n = null;
        ik.field_a = null;
        if (param0 >= 45) {
          SectorCacheStore.field_c = false;
          ud.field_N = null;
          return;
        }
        String var2 = (String) null;
        SimEntity.a(false, 8, (String) null, -49, (String) null, (String) null, -19);
        SectorCacheStore.field_c = false;
        ud.field_N = null;
    }

    void attachToSimulation(int param0, GameSimulation param1) {
        try {
          this.simulation = param1;
          this.updateCell((byte) -105);
          if (param0 != -9019) {
            field_J = (Sprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ek.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getX(byte param0) {
        if (param0 != -112) {
          SimEntity.i(98);
          return this.positionX >> 16;
        }
        return this.positionX >> 16;
    }

    SimEntity(int param0, int param1, int param2) {
        this.cellX = -1;
        this.positionX = param0 << 16;
        this.cellY = -1;
        this.field_D = param2;
        this.positionY = param1 << 16;
    }

    static {
        field_y = "<%0> would need a rating of <%1> to play with the current options.";
        field_I = "You have withdrawn your request to join.";
        field_F = "Speed";
    }
}
