/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class MouseWheelInput {
    static byte[] field_c;
    static int field_d;
    static String field_b;
    static Sprite field_a;

    final static int a(int param0) {
        try {
          int stackIn_13_0 = 0;
          int stackIn_23_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_32_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (HomingMissileAnimation.field_G.field_e >= 4) {
            if (HomingMissileAnimation.field_G.field_k == -1) {
              return 3;
            }
            if (HomingMissileAnimation.field_G.field_k != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (param0 == ds.field_m) {
              BagpipeSpecial.field_p = mh.field_l.a((byte) 120, SnowAnimation.field_A, nj.field_f);
              ds.field_m = ds.field_m + 1;
            }
            if (ds.field_m == 1) {
              if (BagpipeSpecial.field_p.field_f == 2) {
                stackIn_13_0 = BattleUpdate.a(-1, 1);
                return stackIn_13_0;
              }
              if (BagpipeSpecial.field_p.field_f == 1) {
                ds.field_m = ds.field_m + 1;
              }
            }
            if (ds.field_m == 2) {
              RaiseEvent.field_s = new BufferedSocket((java.net.Socket) (BagpipeSpecial.field_p.field_e), mh.field_l);
              var2 = new PacketBuffer(13);
              HazmatAnimation.a(var2, uea.field_i, (byte) -103, ma.field_E, ClearTileFlagEffect.field_j);
              var2.writeByte(15, 0);
              var2.writeInt(bd.field_m, -1615464796);
              RaiseEvent.field_s.a(0, var2.payload, false, 13);
              ds.field_m = ds.field_m + 1;
              RefreshingSpecial.field_q = f.b((byte) 73) + 30000L;
            }
            if (ds.field_m == 3) {
              if (0 < RaiseEvent.field_s.b(125)) {
                var1_int = RaiseEvent.field_s.b((byte) -47);
                if (var1_int != 0) {
                  stackIn_26_0 = BattleUpdate.a(var1_int, 1);
                  return stackIn_26_0;
                }
                ds.field_m = ds.field_m + 1;
              } else {
                if (RefreshingSpecial.field_q < f.b((byte) 73)) {
                  stackIn_23_0 = BattleUpdate.a(-2, 1);
                  return stackIn_23_0;
                }
              }
            }
            if (ds.field_m != 4) {
              stackIn_32_0 = -1;
              return stackIn_32_0;
            }
            HomingMissileAnimation.field_G.a(nf.field_M, RaiseEvent.field_s, 16008);
            BagpipeSpecial.field_p = null;
            RaiseEvent.field_s = null;
            ds.field_m = 0;
            stackIn_30_0 = 0;
            return stackIn_30_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return BattleUpdate.a(-3, 1);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract int a(byte param0);

    abstract void a(java.awt.Component param0, boolean param1);

    abstract void a(java.awt.Component param0, byte param1);

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 != -33) {
          field_a = (Sprite) null;
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_d = 0;
        field_b = "Create a free Account";
    }
}
