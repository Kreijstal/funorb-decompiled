/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class PcmOutputWorker implements Runnable {
    volatile AudioOutput[] field_e;
    PlatformTaskDispatcher field_d;
    static int[][] field_h;
    volatile boolean field_a;
    volatile boolean field_c;
    static PacketBuffer field_g;
    static String field_b;
    static int field_f;

    public final void run() {
        int var1_int = 0;
        AudioOutput var2 = null;
        int var4 = StarCannon.field_A;
        this.field_c = true;
        try {
          while (!this.field_a) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_e[var1_int];
              if (var2 != null) {
                var2.serviceOutput();
              }
            }
            DebouncedFieldValidator.sleepMillis(-94, 10L);
            ea.a((Object) null, 105, this.field_d);
          }
        } catch (Exception exception) {
          String var5 = (String) null;
          hc.a((Throwable) ((Object) exception), (String) null, (byte) 99);
        } finally {
          this.field_c = false;
        }
    }

    final static int a(byte param0) {
        try {
          int stackIn_16_0 = 0;
          int stackIn_28_0 = 0;
          int stackIn_33_0 = 0;
          int stackIn_36_0 = 0;
          int stackIn_38_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (jh.field_b.field_p >= 4) {
            if (-1 == jh.field_b.field_d) {
              return 3;
            }
            if (jh.field_b.field_d != -2) {
              return 1;
            }
            return 4;
          }
          try {
            if (0 == KeyboardInput.field_a) {
              bj.field_d = DirectByteStorage.field_f.requestDirectSocket(va.field_s, 90, md.field_b);
              KeyboardInput.field_a = KeyboardInput.field_a + 1;
            }
            if (param0 < 124) {
              field_h = (int[][]) null;
            }
            if (KeyboardInput.field_a == 1) {
              if (2 == bj.field_d.status) {
                stackIn_16_0 = ej.a(2, -1);
                return stackIn_16_0;
              }
              if (bj.field_d.status == 1) {
                KeyboardInput.field_a = KeyboardInput.field_a + 1;
              }
            }
            if (KeyboardInput.field_a == 2) {
              AccountCreationResultPanel.field_sb = new BufferedSocket((java.net.Socket) (bj.field_d.result), DirectByteStorage.field_f);
              var2 = new PacketBuffer(13);
              SocketConnector.a(wj.field_b, 32, var2, ResizableModalDialog.field_M, ld.field_fb);
              var2.writeByte(15, -122);
              var2.writeInt((byte) -113, ac.field_e);
              AccountCreationResultPanel.field_sb.enqueueWrite(0, var2.payload, (byte) 87, 13);
              KeyboardInput.field_a = KeyboardInput.field_a + 1;
              wf.field_f = dd.correctedCurrentTimeMillis(69) + 30000L;
            }
            if (KeyboardInput.field_a == 3) {
              if (0 >= AccountCreationResultPanel.field_sb.availableBytes(122)) {
                if (wf.field_f < dd.correctedCurrentTimeMillis(63)) {
                  stackIn_33_0 = ej.a(2, -2);
                  return stackIn_33_0;
                }
              } else {
                var1_int = AccountCreationResultPanel.field_sb.readByteOrEof(488852616);
                if (var1_int != 0) {
                  stackIn_28_0 = ej.a(2, var1_int);
                  return stackIn_28_0;
                }
                KeyboardInput.field_a = KeyboardInput.field_a + 1;
              }
            }
            if (KeyboardInput.field_a != 4) {
              stackIn_38_0 = -1;
              return stackIn_38_0;
            }
            jh.field_b.attachSocket(AccountCreationResultPanel.field_sb, 65, SecondaryNodeDeque.field_g);
            KeyboardInput.field_a = 0;
            bj.field_d = null;
            AccountCreationResultPanel.field_sb = null;
            stackIn_36_0 = 0;
            return stackIn_36_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return ej.a(2, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(byte param0) {
        int var1 = -97 / ((param0 - 32) / 58);
        return AlphaWidgetContainer.field_D;
    }

    public static void clearStaticReferences(boolean param0) {
        if (param0) {
          PcmOutputWorker.b((byte) 79);
        }
        field_g = null;
        field_h = (int[][]) null;
        field_b = null;
    }

    PcmOutputWorker() {
        this.field_e = new AudioOutput[2];
        this.field_a = false;
        this.field_c = false;
    }

    static {
        field_g = new PacketBuffer(256);
        field_b = "Next";
        field_f = 0;
    }
}
