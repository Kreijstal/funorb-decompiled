/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BananarangSpecial extends SpecialOrder {
    static du field_p;
    static String field_s;
    static int field_r;
    static String field_t;
    static String field_q;

    final CreatureEvent createEvent(BattleState param0, int param1) {
        BananarangEvent stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        BananarangEvent var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        BoardTile var17 = null;
        BattleCreature var18 = null;
        int var19 = 0;
        BattleCreature var20 = null;
        int var16Lifetime1;
        var19 = BachelorFridge.field_y;
        try {
          var20 = this.creature.a(param1 + 110, param0);
          var4 = new BananarangEvent(this.moveId, new CreatureRef(var20), this.field_i);
          var5 = param0.width;
          var6 = param0.height;
          var7 = var20.tileX;
          var8 = var20.tileY;
          var9 = this.field_i;
          var10 = 0;
          var11 = 0;
          if (param1 != 3) {
            field_r = 110;
          }
          var12 = -1;
          var13 = -1;
          while (true) {
            var10++;
            if (1000 <= var10) {
              throw new IllegalStateException("");
            }
            var14 = var7;
            var15 = var8;
            var16 = var9;
            if (var16 != 2) {
              if (var16 == 4) {
                var14++;
              } else {
                if (var16 == 1) {
                  var15--;
                } else {
                  if (var16 != 3) {
                    throw new IllegalStateException();
                  }
                  var15++;
                }
              }
            } else {
              var14--;
            }
            var16Lifetime1 = 0;
            if (var14 < 0) {
              var9 = 3;
              var16Lifetime1 = 1;
            }
            if (var5 <= var14) {
              var9 = 1;
              var16Lifetime1 = 1;
            }
            if (var15 < 0) {
              var9 = 2;
              var16Lifetime1 = 1;
            }
            if (var6 <= var15) {
              var16Lifetime1 = 1;
              var9 = 4;
            }
            if (var16Lifetime1 != 0) {
              if (var11 != 0) {
                continue;
              }
              var11 = 1;
              var13 = var8;
              var12 = var7;
              continue;
            }
            var8 = var15;
            var7 = var14;
            if (var20.tileX == var7 &&
              var8 == var20.tileY) {
              stackIn_42_0 = var4;
              return (CreatureEvent) ((Object) stackIn_42_0);
            }
            var17 = param0.tiles[var7][var8];
            var18 = var17.occupant;
            if (var18 != null) {
              var4.effects.a(new DamageEffect(new CreatureRef(var18), false, 1, 50, 0), true);
            }
            if (var11 == 0) {
              continue;
            }
            if (var12 != var7) {
              continue;
            }
            if (var8 != var13) {
              continue;
            }
            var9 = ov.b(this.field_i, 60);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("hea.A(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    final static IndexedSprite a(IndexedSprite param0, int[] param1, byte param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        IndexedSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new IndexedSprite(0, 0, 0);
          if (param2 < 115) {
            field_r = -40;
          }
          var3.field_a = param0.field_a;
          var3.field_g = param0.field_g;
          var3.field_e = param0.field_e;
          var3.field_b = param0.field_b;
          var3.field_h = param1;
          var3.field_f = param0.field_f;
          var3.field_d = param0.field_d;
          var3.field_c = param0.field_c;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("hea.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    BananarangSpecial(int param0, BattleCreature param1, int param2) {
        super(param0, param1);
        try {
          this.field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "hea.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static EventEffect b(int param0, PacketBuffer param1) {
        CreatureRef var2 = null;
        RuntimeException var2_ref = null;
        ks stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16866) {
            BananarangSpecial.b(20);
          }
          var2 = qi.a(param1, (byte) 74);
          stackIn_3_0 = new ks(var2);
          return (EventEffect) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("hea.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (!vs.a(23864)) {
          return;
        }
        tfa.a(param0, param0 - 3, false);
    }

    public static void releaseStatics(int param0) {
        field_p = null;
        field_q = null;
        field_s = null;
        field_t = null;
        if (param0 >= -86) {
          field_p = (du) null;
        }
    }

    static {
        field_s = "Cancel";
        field_t = "Music: ";
        field_p = new du(12, 0, 1, 0);
        field_q = "Rating";
    }
}
