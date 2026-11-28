/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai {
    static byte[][] field_e;
    static q field_a;
    static String field_d;
    static int field_c;
    static Sprite[] field_b;

    final static int a(int param0) {
        try {
          int stackIn_16_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_32_0 = 0;
          int stackIn_35_0 = 0;
          int stackIn_37_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (oh.field_h.field_p >= 4) {
            if (oh.field_h.field_k == -1) {
              return 3;
            }
            if (oh.field_h.field_k != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (0 == DiskArchiveRequest.field_A) {
              wj.field_j = MouseInputHandler.field_a.requestDirectSocket(60, WordLanguage.field_i, c.field_b);
              DiskArchiveRequest.field_A = DiskArchiveRequest.field_A + 1;
            }
            if (DiskArchiveRequest.field_A == 1) {
              if (wj.field_j.status == 2) {
                stackIn_16_0 = og.a(2, -1);
                return stackIn_16_0;
              }
              if (1 == wj.field_j.status) {
                DiskArchiveRequest.field_A = DiskArchiveRequest.field_A + 1;
              }
            }
            if (DiskArchiveRequest.field_A == param0) {
              Bzip2State.field_y = new BufferedSocket((java.net.Socket) (wj.field_j.result), MouseInputHandler.field_a);
              var2 = new PacketBuffer(13);
              qb.a(116, of.field_c, var2, ArchiveNetworkClient.field_f, tl.field_c);
              var2.writeByte(param0 + 6387, 15);
              var2.writeInt(-109, ArchiveSourceManager.field_h);
              Bzip2State.field_y.enqueueWrite((byte) 9, var2.payload, 13, 0);
              DiskArchiveRequest.field_A = DiskArchiveRequest.field_A + 1;
              ValidationStatusWidget.field_G = 30000L + lk.correctedCurrentTimeMillis(param0 ^ 2);
            }
            if (DiskArchiveRequest.field_A == 3) {
              if (Bzip2State.field_y.availableBytes((byte) -125) <= 0) {
                if (ValidationStatusWidget.field_G < lk.correctedCurrentTimeMillis(0)) {
                  stackIn_32_0 = og.a(2, -2);
                  return stackIn_32_0;
                }
              } else {
                var1_int = Bzip2State.field_y.readByteOrEof(1);
                if (var1_int != 0) {
                  stackIn_27_0 = og.a(param0 ^ 0, var1_int);
                  return stackIn_27_0;
                }
                DiskArchiveRequest.field_A = DiskArchiveRequest.field_A + 1;
              }
            }
            if (4 != DiskArchiveRequest.field_A) {
              stackIn_37_0 = -1;
              return stackIn_37_0;
            }
            oh.field_h.attachSocket(DisplayNameSelectionPanel.field_A, Bzip2State.field_y, param0 + 18);
            Bzip2State.field_y = null;
            DiskArchiveRequest.field_A = 0;
            wj.field_j = null;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return og.a(2, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = (byte[][]) null;
        field_d = null;
        if (param0 == 67) {
          field_b = null;
          return;
        }
        ai.a(17);
        field_b = null;
    }

    final static void b(int param0) {
        String var1 = null;
        String var1Lifetime1;
        if (!lb.field_d) {
          throw new IllegalStateException();
        }
        int var2 = 33 / ((-70 - param0) / 55);
        if (null == SecondaryNodeDequeIterator.field_d) {
          var1 = lb.a(true);
          ok.field_a = new LoginPanel(var1, (String) null, true, false, false);
          ResourceArchive.field_f.showDialog((UiWidget) (l.field_d), (byte) -71);
          l.field_d.replaceContent(-122, ok.field_a);
          l.field_d.finishResize(27830);
          return;
        }
        SecondaryNodeDequeIterator.field_d.closeDialog(77);
        var1Lifetime1 = lb.a(true);
        ok.field_a = new LoginPanel(var1Lifetime1, (String) null, true, false, false);
        ResourceArchive.field_f.showDialog((UiWidget) (l.field_d), (byte) -71);
        l.field_d.replaceContent(-122, ok.field_a);
        l.field_d.finishResize(27830);
    }

    static {
        field_e = new byte[250][];
        field_a = new q();
    }
}
