/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class UrlDownloadRequest implements Runnable {
    private AsyncRequest field_d;
    private AsyncRequest field_c;
    private DataInputStream field_a;
    private PacketBuffer field_h;
    private int field_f;
    static int field_i;
    private AsyncRequest field_e;
    private java.net.URL field_b;
    private PlatformTaskDispatcher field_g;

    final static void sendRoomCompletedStat(MatchState param0, Room param1, int param2) {
        if (param2 <= 90) {
          UrlDownloadRequest.a(-49, -51, -30, 34, 111, -46);
        }
        if (TextWidgetPainter.a(54) ||
          param0.k(-25319)) {
          return;
        }
        if (!(0 <= param1.getId((byte) -82))) {
          return;
        }
        try {
          ql.field_k.writeCipheredOpcode(97, -2988);
          ql.field_k.writeShort(-1477662136, param1.getId((byte) -82));
          ql.field_k.writeShort(-1477662136, param1.getTicksSinceReset((byte) 107));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "caa.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized boolean poll(boolean param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_f >= 2) {
          return true;
        }
        if (this.field_f == 0) {
          if (this.field_c == null) {
            this.field_c = this.field_g.requestUrlStream(this.field_b, 74);
          }
          if (this.field_c.field_b == 0) {
            return false;
          }
          if (this.field_c.field_b != 1) {
            this.field_c = null;
            this.field_f = this.field_f + 1;
            return false;
          }
        }
        if (this.field_f == 1) {
          if (null == this.field_e) {
            this.field_e = this.field_g.requestSocket(-24818, this.field_b.getHost(), 443);
          }
          if (this.field_e.field_b == 0) {
            return false;
          }
          if (this.field_e.field_b != 1) {
            this.field_f = this.field_f + 1;
            this.field_e = null;
            return false;
          }
        }
        if (this.field_a != null) {
          if (null == this.field_d) {
            this.field_d = this.field_g.startThread((Runnable) (this), 425, 5);
          }
          if (param0) {
            this.field_a = (DataInputStream) null;
          }
          if (this.field_d.field_b == 0) {
            return false;
          }
          if (this.field_d.field_b == 1) {
            return false;
          }
          this.finalize();
          this.field_f = this.field_f + 1;
          return false;
        }
        try {
          if (0 == this.field_f) {
            this.field_a = (DataInputStream) (this.field_c.field_f);
          }
          if (1 == this.field_f) {
            var4 = (java.net.Socket) (this.field_e.field_f);
            var4.setSoTimeout(10000);
            var3 = var4.getOutputStream();
            var3.write(17);
            var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_b.getFile() + "\n\n"));
            var3.write(us.encodeCp1252(var5, param0));
            this.field_a = new DataInputStream(var4.getInputStream());
          }
          this.field_h.position = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_f = this.field_f + 1;
          if (null == this.field_d) {
            this.field_d = this.field_g.startThread((Runnable) (this), 425, 5);
          }
          if (!param0) {
            if (this.field_d.field_b == 0) {
              return false;
            }
            if (this.field_d.field_b != 1) {
              this.finalize();
              this.field_f = this.field_f + 1;
            }
            return false;
          }
          this.field_a = (DataInputStream) null;
          if (this.field_d.field_b == 0) {
            return false;
          }
          if (this.field_d.field_b != 1) {
            this.finalize();
            this.field_f = this.field_f + 1;
          }
          return false;
        }
        if (null == this.field_d) {
          this.field_d = this.field_g.startThread((Runnable) (this), 425, 5);
        }
        if (param0) {
          this.field_a = (DataInputStream) null;
        }
        if (this.field_d.field_b == 0) {
          return false;
        }
        if (this.field_d.field_b != 1) {
          this.finalize();
          this.field_f = this.field_f + 1;
        }
        return false;
    }

    final static void a(byte param0) {
        PlayTrackCommand.field_p = true;
        TextLayout.a(pl.a((byte) 64), (byte) 126, 3);
        int var1 = 72 / ((param0 - 55) / 46);
        SecondaryNodeDequeIterator.field_a.startTutorial((byte) 106);
    }

    protected final void finalize() {
        if (null != this.field_c) {
          if (this.field_c.field_f != null) {
            try {
              ((DataInputStream) (this.field_c.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_c = null;
        }
        if (this.field_e != null) {
          if (null != this.field_e.field_f) {
            try {
              ((java.net.Socket) (this.field_e.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_e = null;
        }
        if (this.field_a != null) {
          try {
            this.field_a.close();
          } catch (Exception exception) {
          }
          this.field_a = null;
        }
        this.field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param5 != 0) {
            field_i = 59;
          }
          for (var6_int = param3; param4 >= var6_int; var6_int++) {
            nra.a((byte) -55, param0, param1, vaa.field_a[var6_int], param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "caa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = TombRacer.field_G ? 1 : 0;
          try {
            while (this.field_h.payload.length > this.field_h.position) {
              var1_int = this.field_a.read(this.field_h.payload, this.field_h.position, -this.field_h.position + this.field_h.payload.length);
              if (var1_int >= 0) {
                this.field_h.position = this.field_h.position + var1_int;
                continue;
              }
              break;
            }
            if (this.field_h.payload.length == this.field_h.position) {
              throw UrlDownloadRequest.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_h.payload.length + " " + this.field_b));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_f = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_f = this.field_f + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final PacketBuffer getResult(byte param0) {
        if (param0 >= -115) {
          this.getResult((byte) 71);
          if (this.field_f == 3) {
            return this.field_h;
          }
          return null;
        }
        if (this.field_f == 3) {
          return this.field_h;
        }
        return null;
    }

    UrlDownloadRequest(PlatformTaskDispatcher param0, java.net.URL param1, int param2) {
        try {
          this.field_b = param1;
          this.field_g = param0;
          this.field_h = new PacketBuffer(param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "caa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_i = 2;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
