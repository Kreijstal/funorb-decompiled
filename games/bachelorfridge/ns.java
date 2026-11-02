/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ns extends BoardChange {
    static Sprite[] field_m;
    CreatureRef field_n;

    ns(PacketBuffer param0) {
        this(qi.a(param0, (byte) 9));
    }

    final void b(PacketBuffer param0, byte param1) {
        try {
          FlirtAnimation.a(this.field_n, 108, param0);
          int var3_int = -18 / ((param1 - 37) / 38);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ns.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        if (param0 != -11) {
          ns.releaseStatics(-52);
        }
    }

    final void a(boolean param0, BattleState param1) {
        BattleCreature var3 = this.field_n.a(107, param1);
        if (var3 == null) {
          return;
        }
        try {
          var3.j(-106);
          var3.field_A = param0 ? true : false;
          param1.field_R = false;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ns.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ImageProducerRasterBuffer.field_j = false;
          eea.field_b = false;
          if (oq.field_b != null &&
            oq.field_b.field_C) {
            if (param2 == 8) {
              param2 = 2;
              if (!gfa.field_i) {
                param0 = TeleportSpecial.field_q;
              } else {
                param0 = ClamsSpecial.field_q;
              }
              FridgeScreen.field_e.a(-113, IncomingSpecial.field_p);
            }
            var3_int = 1;
            if (param2 == 10) {
              var3_int = 0;
              bga.c((byte) -106);
            }
            if (var3_int != 0) {
              if (ImageProducerRasterBuffer.field_j) {
                param0 = lga.a(true, new String[]{param0}, ok.field_Cb);
              }
              if (UiComponent.field_s) {
                param0 = kda.field_a;
              }
              oq.field_b.a(param2, param0, true);
            }
            if (param2 != 256 &&
              param2 != 10 &&
              !gfa.field_i) {
              FridgeScreen.field_e.b(false);
            }
          }
          if (param1 == -11) {
            return;
          }
          var4 = (String) null;
          ns.a((String) null, 125, 54);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("ns.D(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    ns(CreatureRef param0) {
        try {
          this.field_j = 8;
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ns.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(BoardChangeAnimation param0, int param1) {
        try {
          param0.addChild(27799, new gka(param0.field_o, this));
          if (param1 > -2) {
            BattleState var4 = (BattleState) null;
            this.a(false, (BattleState) null);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ns.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
