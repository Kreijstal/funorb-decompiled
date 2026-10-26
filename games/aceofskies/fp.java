/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fp extends IntrusiveNode {
    int field_e;
    static int field_g;
    int field_f;

    final static boolean a(byte param0, boolean param1) {
        try {
          if (null == MenuInputState.field_b) {
            MenuInputState.field_b = ii.field_j.a(2, ca.field_g, sg.field_b);
          }
          if (MenuInputState.field_b.field_a == 0) {
            return false;
          }
          int var2 = 72 / ((-10 - param0) / 56);
          long dupTemp$1 = kh.a(-114);
          co.field_e = dupTemp$1;
          ff.field_b = dupTemp$1;
          if (MenuInputState.field_b.field_a != 1) {
            ca.field_f = pj.field_f;
          } else {
            try {
              ft.field_l = new vf((java.net.Socket) (MenuInputState.field_b.field_f), ii.field_j);
              CipherPacketBuffer var4 = IntKeyLookup.incomingPacket;
              q.outgoingPacket.position = 0;
              var4.position = 0;
              int stackIn_11_0 = (!param1) ? -1 : -2;
              ScoreSubmission.field_l = stackIn_11_0;
              kg.field_b = stackIn_11_0;
              hi.field_w = stackIn_11_0;
              ca.field_f = qa.field_b;
              tr.a(q.outgoingPacket, ut.field_a, id.field_d, ko.field_f, 0);
              fr.a(-34, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              Throwable decompiledCaughtException = decompiledCaughtParameter0;
              IOException var3 = (IOException) (Object) decompiledCaughtException;
              ca.field_f = pj.field_f;
              MenuInputState.field_b = null;
              return true;
            }
          }
          MenuInputState.field_b = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 >= 21) {
          qk.a((byte) -92);
          SoftwareRasterizer.intersectClip(param4, param1, param3, param2);
          return;
        }
        field_g = -99;
        qk.a((byte) -92);
        SoftwareRasterizer.intersectClip(param4, param1, param3, param2);
    }

    private fp() throws Throwable {
        throw new Error();
    }

    static {
        field_g = 0;
    }
}
