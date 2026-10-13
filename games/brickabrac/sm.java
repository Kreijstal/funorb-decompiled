/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sm {
    static int field_b;
    static int field_a;
    static long[] field_c;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 30000) {
          sm.a(21);
        }
    }

    final static int b(int param0) {
        try {
          int stackIn_15_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_31_0 = 0;
          int stackIn_35_0 = 0;
          int stackIn_37_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (vd.field_f.field_i >= 4) {
            if (-1 == vd.field_f.field_f) {
              return 3;
            }
            if (vd.field_f.field_f != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (param0 == ~GameplayScreen.field_j) {
              fc.field_e = ec.field_P.a(LevelMetadata.field_k, (byte) 120, gd.field_a);
              GameplayScreen.field_j = GameplayScreen.field_j + 1;
            }
            if (1 == GameplayScreen.field_j) {
              if (fc.field_e.field_f == 2) {
                stackIn_15_0 = Brick.a((byte) 41, -1);
                return stackIn_15_0;
              }
              if (fc.field_e.field_f == 1) {
                GameplayScreen.field_j = GameplayScreen.field_j + 1;
              }
            }
            if (GameplayScreen.field_j == 2) {
              MouseInput.field_d = new wh((java.net.Socket) (fc.field_e.field_e), ec.field_P);
              var2 = new PacketBuffer(13);
              c.a(vb.field_S, 12, nb.field_a, u.field_g, var2);
              var2.writeByte(param0 ^ 119, 15);
              var2.writeInt(fi.field_t, (byte) -79);
              MouseInput.field_d.a(var2.data, true, 13, 0);
              GameplayScreen.field_j = GameplayScreen.field_j + 1;
              ff.field_b = ue.a(false) + 30000L;
            }
            if (GameplayScreen.field_j == 3) {
              if (MouseInput.field_d.d(10434) > 0) {
                var1_int = MouseInput.field_d.e(0);
                if (var1_int != 0) {
                  stackIn_31_0 = Brick.a((byte) 90, var1_int);
                  return stackIn_31_0;
                }
                GameplayScreen.field_j = GameplayScreen.field_j + 1;
              } else {
                if (ff.field_b < ue.a(false)) {
                  stackIn_27_0 = Brick.a((byte) -85, -2);
                  return stackIn_27_0;
                }
              }
            }
            if (GameplayScreen.field_j != 4) {
              stackIn_37_0 = -1;
              return stackIn_37_0;
            }
            vd.field_f.a(MouseInput.field_d, rd.field_a, 12);
            MouseInput.field_d = null;
            GameplayScreen.field_j = 0;
            fc.field_e = null;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return Brick.a((byte) -111, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = 0;
        field_b = field_a;
        field_c = new long[32];
    }
}
