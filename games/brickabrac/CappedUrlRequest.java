/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class CappedUrlRequest implements Runnable {
    private PlatformTask readTask;
    private DataInputStream input;
    private java.net.URL url;
    private PacketBuffer packet;
    private int phase;
    private PlatformServices services;
    static RgbSprite chocolateSpiresSprite;
    static um field_e;
    private PlatformTask urlTask;
    static int field_j;
    private PlatformTask socketTask;
    static UiComponent field_l;

    protected final void finalize() {
        if (this.urlTask != null) {
          if (null != this.urlTask.result) {
            try {
              ((DataInputStream) (this.urlTask.result)).close();
            } catch (Exception exception) {
            }
          }
          this.urlTask = null;
        }
        if (this.socketTask != null) {
          if (this.socketTask.result != null) {
            try {
              ((java.net.Socket) (this.socketTask.result)).close();
            } catch (Exception exception) {
            }
          }
          this.socketTask = null;
        }
        if (null != this.input) {
          try {
            this.input.close();
          } catch (Exception exception) {
          }
          this.input = null;
        }
        this.readTask = null;
    }

    final static boolean a(boolean param0, int param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          BitPacketBuffer var4 = null;
          BitPacketBuffer var5 = null;
          int stackIn_11_0 = 0;
          Throwable decompiledCaughtException = null;
          if (param1 != 10000) {
            CappedUrlRequest.b(46);
          }
          if (null == qm.field_d) {
            qm.field_d = FramedMenuScreen.field_s.a(tq.field_h, (byte) 120, dl.field_b);
          }
          if (qm.field_d.status == 0) {
            return false;
          }
          dupTemp$1 = MonotonicTime.nowMillis(false);
          BrickMotionPath.field_q = dupTemp$1;
          RichTextLayout.lastGameReadMillis = dupTemp$1;
          if (qm.field_d.status != 1) {
            rf.field_b = mc.field_e;
          } else {
            try {
              eq.gameTransport = new BufferedSocket((java.net.Socket) (qm.field_d.result), FramedMenuScreen.field_s);
              TextFieldValidator.outgoingPackets.position = 0;
              var4 = jl.incomingPackets;
              var5 = var4;
              stackIn_11_0 = (!param0) ? -1 : -2;
              r.thirdPreviousPacketOpcode = stackIn_11_0;
              we.secondPreviousPacketOpcode = stackIn_11_0;
              UiComponent.previousPacketOpcode = stackIn_11_0;
              rf.field_b = BitPacketBuffer.field_u;
              var5.position = 0;
              c.a(ArchiveIndex.field_e, 12, IntArrayRequest.field_r, fe.field_ob, TextFieldValidator.outgoingPackets);
              cr.a(-1, 10000);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              rf.field_b = mc.field_e;
              qm.field_d = null;
              return true;
            }
          }
          qm.field_d = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
          int bytesRead = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int clientBranchFlag = 0;
          Throwable decompiledCaughtException = null;
          clientBranchFlag = BrickABrac.field_J ? 1 : 0;
          try {
            while (this.packet.data.length > this.packet.position) {
              bytesRead = this.input.read(this.packet.data, this.packet.position, -this.packet.position + this.packet.data.length);
              if (0 <= bytesRead) {
                this.packet.position = this.packet.position + bytesRead;
                continue;
              }
              break;
            }
            if (this.packet.position == this.packet.data.length) {
              throw CappedUrlRequest.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.packet.data.length + " " + this.url));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.phase = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.phase = this.phase + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized boolean poll(int obfuscationGuard) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.phase >= 2) {
          return true;
        }
        if (this.phase == 0) {
          if (null == this.urlTask) {
            this.urlTask = this.services.openUrl((byte) 73, this.url);
          }
          if (this.urlTask.status == 0) {
            return false;
          }
          if (this.urlTask.status != 1) {
            this.urlTask = null;
            this.phase = this.phase + 1;
            return false;
          }
        }
        if (this.phase == 1) {
          if (null == this.socketTask) {
            this.socketTask = this.services.a(this.url.getHost(), (byte) 120, 443);
          }
          if (0 == this.socketTask.status) {
            return false;
          }
          if (this.socketTask.status != 1) {
            this.phase = this.phase + 1;
            this.socketTask = null;
            return false;
          }
        }
        if (null == this.input) {
          try {
            if (this.phase == 0) {
              this.input = (DataInputStream) (this.urlTask.result);
            }
            if (this.phase == 1) {
              var4 = (java.net.Socket) (this.socketTask.result);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.url.getFile() + "\n\n"));
              var3.write(LevelList.a(var5, false));
              this.input = new DataInputStream(var4.getInputStream());
            }
            this.packet.position = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.phase = this.phase + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (null == this.readTask) {
              this.readTask = this.services.startThread(5, (Runnable) (this), (byte) -72);
            }
            if (this.readTask.status == 0) {
              return false;
            }
            if (this.readTask.status == obfuscationGuard) {
              return false;
            }
            this.finalize();
            this.phase = this.phase + 1;
            return false;
          }
        }
        if (null == this.readTask) {
          this.readTask = this.services.startThread(5, (Runnable) (this), (byte) -72);
        }
        if (this.readTask.status == 0) {
          return false;
        }
        if (this.readTask.status != obfuscationGuard) {
          this.finalize();
          this.phase = this.phase + 1;
        }
        return false;
    }

    public static void b(int param0) {
        field_e = null;
        field_l = null;
        chocolateSpiresSprite = null;
        if (param0 != -16637) {
          CappedUrlRequest.a(true, 13);
        }
    }

    final PacketBuffer getResult(byte obfuscationGuard) {
        if (obfuscationGuard < 95) {
          this.poll(-111);
          if (this.phase == 3) {
            return this.packet;
          }
          return null;
        }
        if (this.phase == 3) {
          return this.packet;
        }
        return null;
    }

    CappedUrlRequest(PlatformServices services, java.net.URL url, int capacity) {
        try {
          this.services = services;
          this.url = url;
          this.packet = new PacketBuffer(capacity);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ad.<init>(" + (services != null ? "{...}" : "null") + ',' + (url != null ? "{...}" : "null") + ',' + capacity + ')');
        }
    }

    static {
        field_j = -1;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
