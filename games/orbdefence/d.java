/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class d extends IntrusiveNode {
    int field_i;
    static boolean field_g;
    static boolean field_k;
    static String field_h;
    static int field_j;
    int field_f;

    final static void b(byte param0) {
        if (param0 <= -31) {
          if (bm.field_d != null) {
            bm.field_d.snapAndPruneDialogs(-113);
          }
          if (na.field_c != null) {
            na.field_c.freezeNormalProgressAnimation(1);
          }
          pf.a(104);
          return;
        }
    }

    final static int d(byte param0) {
        try {
          int stackIn_17_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_34_0 = 0;
          int stackIn_36_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (param0 > -86) {
            return 21;
          }
          if (kg.field_h.field_b >= 4) {
            if (-1 == kg.field_h.field_n) {
              return 3;
            }
            if (-2 == kg.field_h.field_n) {
              return 4;
            }
            return 1;
          }
          try {
            if (mc.field_j == 0) {
              cf.field_a = lh.field_b.requestDirectSocket(DequeWidgetContainer.field_z, 0, fm.field_c);
              mc.field_j = mc.field_j + 1;
            }
            if (mc.field_j == 1) {
              if (cf.field_a.status == 2) {
                stackIn_17_0 = kk.a(-30179, -1);
                return stackIn_17_0;
              }
              if (1 == cf.field_a.status) {
                mc.field_j = mc.field_j + 1;
              }
            }
            if (2 == mc.field_j) {
              DraggableWidgetContainer.field_A = new BufferedSocket((java.net.Socket) (cf.field_a.result), lh.field_b);
              var2 = new PacketBuffer(13);
              nl.a(20994, hc.field_f, SpriteGeometry.field_m, var2, InteractiveWidget.field_x);
              var2.writeByte(15, -49);
              var2.writeInt(m.field_b, -1);
              DraggableWidgetContainer.field_A.queueWrite((byte) 30, var2.payload, 0, 13);
              mc.field_j = mc.field_j + 1;
              n.field_b = 30000L + ji.correctedCurrentTimeMillis(-75);
            }
            if (mc.field_j == 3) {
              if (DraggableWidgetContainer.field_A.availableBytes((byte) 101) > 0) {
                var1_int = DraggableWidgetContainer.field_A.readSingleByte(true);
                if (var1_int != 0) {
                  stackIn_30_0 = kk.a(-30179, var1_int);
                  return stackIn_30_0;
                }
                mc.field_j = mc.field_j + 1;
              } else {
                if (ji.correctedCurrentTimeMillis(103) > n.field_b) {
                  stackIn_26_0 = kk.a(-30179, -2);
                  return stackIn_26_0;
                }
              }
            }
            if (4 != mc.field_j) {
              stackIn_36_0 = -1;
              return stackIn_36_0;
            }
            kg.field_h.a(DraggableWidgetContainer.field_A, 20, il.field_a);
            DraggableWidgetContainer.field_A = null;
            cf.field_a = null;
            mc.field_j = 0;
            stackIn_34_0 = 0;
            return stackIn_34_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return kk.a(-30179, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 >= -117) {
          return;
        }
        field_h = null;
    }

    final static void c(byte param0) {
        ck.field_j = new AccountRegistrationPanel();
        kg.field_j.replaceContent(false, ck.field_j);
        if (param0 >= -65) {
          field_h = (String) null;
        }
    }

    private d() throws Throwable {
        throw new Error();
    }

    static {
        field_g = false;
        field_h = "Norb Strength<br><%0>";
        field_k = true;
    }
}
