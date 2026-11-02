/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class CreatureEvent extends BattleUpdate {
    CreatureRef creature;
    int moveId;
    static IntrusiveDeque field_m;

    public static void releaseStatics(int param0) {
        if (param0 != -225) {
          CreatureEvent.releaseStatics(-121);
          field_m = null;
          return;
        }
        field_m = null;
    }

    void a(byte param0, PacketBuffer param1) {
        try {
          if (param0 > -12) {
            uha var4 = (uha) null;
            CreatureEvent.a((String) null, false, -42, (uha) null);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ii.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void write(PacketBuffer param0, int param1) {
        try {
          param0.b(this.moveId, -121);
          FlirtAnimation.a(this.creature, param1 + 132, param0);
          if (param1 != -9) {
            this.moveId = -23;
          }
          this.a((byte) -54, param0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ii.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void c(byte param0) {
        if (param0 != 62) {
          return;
        }
        if (b.field_u >= 224) {
          di.a(true, 256);
          return;
        }
        int var1 = b.field_u % 32;
        di.a(true, -var1 + 32 + b.field_u);
    }

    final static boolean b(int param0, int param1) {
        try {
          int var2_int = 0;
          IOException var2 = null;
          Throwable decompiledCaughtException = null;
          if (param0 <= ig.field_m.position) {
            return true;
          }
          if (dma.field_b == null) {
            return false;
          }
          try {
            var2_int = dma.field_b.b(-42);
            if (var2_int <= param1) {
              if (var2_int < 0) {
                vc.a((byte) -106);
                return false;
              }
              if (30000L >= ag.e(param1 ^ -9109)) {
                return false;
              }
              vc.a((byte) -106);
              return false;
            }
            if (-ig.field_m.position + param0 < var2_int) {
              var2_int = -ig.field_m.position + param0;
            }
            dma.field_b.a(ig.field_m.position, (byte) 75, ig.field_m.payload, var2_int);
            pk.field_c = f.b((byte) 73);
            ig.field_m.position = ig.field_m.position + var2_int;
            if (param0 > ig.field_m.position) {
              return false;
            }
            ig.field_m.position = 0;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            vc.a((byte) -79);
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    CreatureEvent(int param0, int param1, PacketBuffer param2) {
        this(param0, param1, qi.a(param2, (byte) 80));
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener(vv.field_e);
          param1.addFocusListener(vv.field_e);
          int var2_int = -78 / ((13 - param0) / 48);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ii.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    CreatureEvent(int param0, PacketBuffer param1) {
        this(param0, param1.readUnsignedShort((byte) 100), qi.a(param1, (byte) 21));
    }

    final static void a(String param0, boolean param1, int param2, uha param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ik var9 = null;
        String var10 = null;
        ik var11 = null;
        String var12 = null;
        ik var13 = null;
        String var14 = null;
        ik var15 = null;
        try {
          SleepEvent.a(param3.f((byte) -92), (int[]) null, 0L, (String) null, (String) null, -1, -99, p.field_n, param3);
          if (param3.field_Zb && (2 == param3.field_Lb ||
            !(BananarangSpecial.field_r < 2))) {
            var9 = NetworkGameClient.field_u;
            var10 = lga.a(true, new String[]{param0}, ClamsEvent.field_s);
            var9.field_a.a(var10, true, 10);
          }
          NetworkGameClient.field_u.b(true);
          if (param1) {
            if (hja.field_i != NetworkGameClient.field_u.field_k) {
              var13 = NetworkGameClient.field_u;
              var14 = lga.a(true, new String[]{param0}, jh.field_k);
              var13.field_a.a(var14, true, 15);
            } else {
              var11 = NetworkGameClient.field_u;
              var12 = lga.a(true, new String[]{param0}, wl.field_wb);
              var11.field_a.a(var12, true, 16);
            }
          }
          var15 = NetworkGameClient.field_u;
          if (param2 != -3) {
            field_m = (IntrusiveDeque) null;
          }
          var5 = nfa.field_a;
          var6 = jc.field_r;
          var15.field_a.a(0, false, var5, 0, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ii.U(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    CreatureEvent(int param0, int param1, CreatureRef param2) {
        super(param0);
        try {
          this.moveId = param1;
          this.creature = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ii.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = new IntrusiveDeque();
    }
}
