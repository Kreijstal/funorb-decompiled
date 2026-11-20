/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class UrlJaggrabRequest implements Runnable {
    private PlatformRequest workerRequest;
    private PlatformRequest urlRequest;
    private PacketBuffer responseBuffer;
    static String field_g;
    private PlatformRequest socketRequest;
    private java.net.URL url;
    private DataInputStream input;
    private PlatformService platform;
    private int state;

    public static void clearSharedReferences(int param0) {
        if (param0 != -19766) {
          field_g = (String) null;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final synchronized boolean pollComplete(int param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.state >= 2) {
          return true;
        }
        if (0 == this.state) {
          if (null == this.urlRequest) {
            this.urlRequest = this.platform.openUrlStream(this.url, 97);
          }
          if (this.urlRequest.status == 0) {
            return false;
          }
          if (this.urlRequest.status != 1) {
            this.state = this.state + 1;
            this.urlRequest = null;
            return false;
          }
        }
        if (this.state == 1) {
          if (this.socketRequest == null) {
            this.socketRequest = this.platform.openSocket(443, this.url.getHost(), 91);
          }
          if (this.socketRequest.status == 0) {
            return false;
          }
          if (1 != this.socketRequest.status) {
            this.socketRequest = null;
            this.state = this.state + 1;
            return false;
          }
        }
        if (null == this.input) {
          try {
            if (this.state == 0) {
              this.input = (DataInputStream) (this.urlRequest.result);
            }
            if (this.state == 1) {
              var4 = (java.net.Socket) (this.socketRequest.result);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.url.getFile() + "\n\n"));
              var3.write(MissionListFactory.encodeCp1252(var5, 126));
              this.input = new DataInputStream(var4.getInputStream());
            }
            this.responseBuffer.position = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.state = this.state + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (null == this.workerRequest) {
              this.workerRequest = this.platform.startThread(0, 5, (Runnable) (this));
            }
            if (0 == this.workerRequest.status) {
              return false;
            }
            if (param0 <= 38) {
              this.run();
            }
            if (this.workerRequest.status == 1) {
              return false;
            }
            this.finalize();
            this.state = this.state + 1;
            return false;
          }
        }
        if (null == this.workerRequest) {
          this.workerRequest = this.platform.startThread(0, 5, (Runnable) (this));
        }
        if (0 == this.workerRequest.status) {
          return false;
        }
        if (param0 <= 38) {
          this.run();
        }
        if (this.workerRequest.status != 1) {
          this.finalize();
          this.state = this.state + 1;
        }
        return false;
    }

    protected final void finalize() {
        if (null != this.urlRequest) {
          if (null != this.urlRequest.result) {
            try {
              ((DataInputStream) (this.urlRequest.result)).close();
            } catch (Exception exception) {
            }
          }
          this.urlRequest = null;
        }
        if (null != this.socketRequest) {
          if (this.socketRequest.result != null) {
            try {
              ((java.net.Socket) (this.socketRequest.result)).close();
            } catch (Exception exception) {
            }
          }
          this.socketRequest = null;
        }
        if (this.input != null) {
          try {
            this.input.close();
          } catch (Exception exception) {
          }
          this.input = null;
        }
        this.workerRequest = null;
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = VoidHunters.field_G;
          try {
            while (this.responseBuffer.payload.length > this.responseBuffer.position) {
              var1_int = this.input.read(this.responseBuffer.payload, this.responseBuffer.position, this.responseBuffer.payload.length - this.responseBuffer.position);
              if (var1_int >= 0) {
                this.responseBuffer.position = this.responseBuffer.position + var1_int;
                continue;
              }
              break;
            }
            if (this.responseBuffer.position == this.responseBuffer.payload.length) {
              throw UrlJaggrabRequest.<RuntimeException>throwUnchecked(new Exception("HG1: " + this.responseBuffer.payload.length + " " + this.url));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.state = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.state = this.state + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final PacketBuffer getResponseBuffer(int param0) {
        int var2 = 118 % ((param0 + 32) / 54);
        if (this.state == 3) {
          return this.responseBuffer;
        }
        return null;
    }

    UrlJaggrabRequest(PlatformService param0, java.net.URL param1, int param2) {
        try {
          this.platform = param0;
          this.url = param1;
          this.responseBuffer = new PacketBuffer(param2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_g = "Scale down map width";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
