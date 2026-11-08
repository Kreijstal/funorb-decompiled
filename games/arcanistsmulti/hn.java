/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hn implements Runnable {
    private int field_b;
    private PacketBuffer field_h;
    static String field_c;
    private PlatformTask field_j;
    static IntrusiveDeque field_q;
    private java.net.URL field_m;
    static String field_l;
    private PlatformTask field_a;
    private PlatformTaskDispatcher field_n;
    private PlatformTask field_g;
    static int[] field_k;
    static String field_o;
    static String field_i;
    static Sprite[] field_d;
    private DataInputStream field_f;
    static int field_p;
    static String field_e;

    public static void releaseStatics(int param0) {
        field_k = null;
        field_l = null;
        field_i = null;
        field_c = null;
        field_o = null;
        field_d = null;
        int var1 = -7 / ((-28 - param0) / 50);
        field_e = null;
        field_q = null;
    }

    final PacketBuffer b(int param0) {
        if (param0 != 21496) {
          return (PacketBuffer) null;
        }
        if (this.field_b != 3) {
          return null;
        }
        return this.field_h;
    }

    final synchronized boolean c(int param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_b >= 2) {
          return true;
        }
        if (this.field_b == 0) {
          if (this.field_a == null) {
            this.field_a = this.field_n.queueUrlOpen(true, this.field_m);
          }
          if (0 == this.field_a.field_e) {
            return false;
          }
          if (1 != this.field_a.field_e) {
            this.field_b = this.field_b + 1;
            this.field_a = null;
            return false;
          }
        }
        if (this.field_b == 1) {
          if (null == this.field_j) {
            this.field_j = this.field_n.queueDirectSocketOpen(443, true, this.field_m.getHost());
          }
          if (this.field_j.field_e == 0) {
            return false;
          }
          if (this.field_j.field_e != 1) {
            this.field_j = null;
            this.field_b = this.field_b + 1;
            return false;
          }
        }
        if (this.field_f == null) {
          try {
            if (this.field_b == 0) {
              this.field_f = (DataInputStream) (this.field_a.field_g);
            }
            if (this.field_b == 1) {
              var4 = (java.net.Socket) (this.field_j.field_g);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_m.getFile() + "\n\n"));
              var3.write(SocketConnector.encodeCp1252(var5, (byte) -82));
              this.field_f = new DataInputStream(var4.getInputStream());
            }
            this.field_h.position = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_b = this.field_b + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (param0 >= -51) {
              return false;
            }
            if (this.field_g == null) {
              this.field_g = this.field_n.queueThreadStart(124, 5, (Runnable) (this));
            }
            if (this.field_g.field_e == 0) {
              return false;
            }
            if (this.field_g.field_e == 1) {
              return false;
            }
            this.finalize();
            this.field_b = this.field_b + 1;
            return false;
          }
        }
        if (param0 >= -51) {
          return false;
        }
        if (this.field_g == null) {
          this.field_g = this.field_n.queueThreadStart(124, 5, (Runnable) (this));
        }
        if (this.field_g.field_e == 0) {
          return false;
        }
        if (this.field_g.field_e != 1) {
          this.finalize();
          this.field_b = this.field_b + 1;
        }
        return false;
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param1 != 17769) {
          hn.a('f', 28);
          if (param0 < 48) {
            if (param0 >= 65 &&
              param0 <= 90) {
              return true;
            }
            if (param0 < 97) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (57 >= param0) {
            return true;
          }
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 <= 122) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_28_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_28_0;
        }
        if (param0 < 48) {
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 > 122) {
              return false;
            }
            return true;
          }
          if (param0 <= 90) {
            return true;
          }
          stackIn_64_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_64_0;
        }
        if (57 >= param0) {
          return true;
        }
        if (param0 < 65) {
          if (param0 < 97) {
            return false;
          }
          if (param0 > 122) {
            return false;
          }
          return true;
        }
        if (param0 <= 90) {
          return true;
        }
        stackIn_50_0 = (param0 >= 97) && (param0 <= 122);
        return stackIn_50_0;
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            while (this.field_h.payload.length > this.field_h.position) {
              var1_int = this.field_f.read(this.field_h.payload, this.field_h.position, this.field_h.payload.length - this.field_h.position);
              if (var1_int >= 0) {
                this.field_h.position = this.field_h.position + var1_int;
                continue;
              }
              break;
            }
            if (this.field_h.payload.length == this.field_h.position) {
              throw hn.<RuntimeException>sneakyThrow(new Exception("HG1: " + this.field_h.payload.length + " " + this.field_m));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_b = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_b = this.field_b + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0) {
        int var1 = 85 % ((param0 - 10) / 60);
        if (!NodeHashTableIterator.field_e) {
          if (!MenuScreen.getSessionFlag((byte) 112)) {
            return false;
          }
          return true;
        }
        if (!ContextActionMenu.field_Jb) {
          if (!MenuScreen.getSessionFlag((byte) 112)) {
            return false;
          }
          return true;
        }
        if (SectorCacheStore.field_g) {
          if (kg.field_a) {
            return true;
          }
          return MenuScreen.getSessionFlag((byte) 112) ? true : false;
        }
        if (!MenuScreen.getSessionFlag((byte) 112)) {
          return false;
        }
        return true;
    }

    protected final void finalize() {
        if (this.field_a != null) {
          if (null != this.field_a.field_g) {
            try {
              ((DataInputStream) (this.field_a.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_a = null;
        }
        if (this.field_j != null) {
          if (this.field_j.field_g != null) {
            try {
              ((java.net.Socket) (this.field_j.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_j = null;
        }
        if (null != this.field_f) {
          try {
            this.field_f.close();
          } catch (Exception exception) {
          }
          this.field_f = null;
        }
        this.field_g = null;
    }

    hn(PlatformTaskDispatcher param0, java.net.URL param1, int param2) {
        try {
          this.field_m = param1;
          this.field_n = param0;
          this.field_h = new PacketBuffer(param2);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "hn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Advanced Elemental Control";
        field_l = "Loading...";
        field_q = new IntrusiveDeque();
        field_i = "Either affect your Arcanist or the whole arena - just click the mouse to activate.";
        field_e = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_o = "Goblin Caves:";
        field_p = 20;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
