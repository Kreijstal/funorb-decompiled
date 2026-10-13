/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ad implements Runnable {
    private ql field_h;
    private DataInputStream field_k;
    private java.net.URL field_a;
    private PacketBuffer field_f;
    private int field_c;
    private tg field_g;
    static RgbSprite field_b;
    static um field_e;
    private ql field_d;
    static int field_j;
    private ql field_i;
    static mh field_l;

    protected final void finalize() {
        if (this.field_d != null) {
          if (null != this.field_d.field_e) {
            try {
              ((DataInputStream) (this.field_d.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_d = null;
        }
        if (this.field_i != null) {
          if (this.field_i.field_e != null) {
            try {
              ((java.net.Socket) (this.field_i.field_e)).close();
            } catch (Exception exception) {
            }
          }
          this.field_i = null;
        }
        if (null != this.field_k) {
          try {
            this.field_k.close();
          } catch (Exception exception) {
          }
          this.field_k = null;
        }
        this.field_h = null;
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
            ad.b(46);
          }
          if (null == qm.field_d) {
            qm.field_d = FramedMenuScreen.field_s.a(tq.field_h, (byte) 120, dl.field_b);
          }
          if (qm.field_d.field_f == 0) {
            return false;
          }
          dupTemp$1 = ue.a(false);
          BrickMotionPath.field_q = dupTemp$1;
          oj.field_t = dupTemp$1;
          if (qm.field_d.field_f != 1) {
            rf.field_b = mc.field_e;
          } else {
            try {
              eq.field_g = new wh((java.net.Socket) (qm.field_d.field_e), FramedMenuScreen.field_s);
              k.field_h.position = 0;
              var4 = jl.field_e;
              var5 = var4;
              stackIn_11_0 = (!param0) ? -1 : -2;
              r.field_z = stackIn_11_0;
              we.field_a = stackIn_11_0;
              mh.field_gb = stackIn_11_0;
              rf.field_b = BitPacketBuffer.field_u;
              var5.position = 0;
              c.a(ko.field_e, 12, pe.field_r, fe.field_ob, k.field_h);
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
          int var1_int = 0;
          Object var1 = null;
          Object var2 = null;
          Throwable var3 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          var4 = BrickABrac.field_J ? 1 : 0;
          try {
            while (this.field_f.data.length > this.field_f.position) {
              var1_int = this.field_k.read(this.field_f.data, this.field_f.position, -this.field_f.position + this.field_f.data.length);
              if (0 <= var1_int) {
                this.field_f.position = this.field_f.position + var1_int;
                continue;
              }
              break;
            }
            if (this.field_f.position == this.field_f.data.length) {
              throw ad.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_f.data.length + " " + this.field_a));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_c = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_c = this.field_c + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized boolean a(int param0) {
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_c >= 2) {
          return true;
        }
        if (this.field_c == 0) {
          if (null == this.field_d) {
            this.field_d = this.field_g.a((byte) 73, this.field_a);
          }
          if (this.field_d.field_f == 0) {
            return false;
          }
          if (this.field_d.field_f != 1) {
            this.field_d = null;
            this.field_c = this.field_c + 1;
            return false;
          }
        }
        if (this.field_c == 1) {
          if (null == this.field_i) {
            this.field_i = this.field_g.a(this.field_a.getHost(), (byte) 120, 443);
          }
          if (0 == this.field_i.field_f) {
            return false;
          }
          if (this.field_i.field_f != 1) {
            this.field_c = this.field_c + 1;
            this.field_i = null;
            return false;
          }
        }
        if (null == this.field_k) {
          try {
            if (this.field_c == 0) {
              this.field_k = (DataInputStream) (this.field_d.field_e);
            }
            if (this.field_c == 1) {
              var4 = (java.net.Socket) (this.field_i.field_e);
              var4.setSoTimeout(10000);
              var3 = var4.getOutputStream();
              var3.write(17);
              var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_a.getFile() + "\n\n"));
              var3.write(LevelList.a(var5, false));
              this.field_k = new DataInputStream(var4.getInputStream());
            }
            this.field_f.position = 0;
            decompiledRegionSelector0 = 0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            this.finalize();
            this.field_c = this.field_c + 1;
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
            if (null == this.field_h) {
              this.field_h = this.field_g.a(5, (Runnable) (this), (byte) -72);
            }
            if (this.field_h.field_f == 0) {
              return false;
            }
            if (this.field_h.field_f == param0) {
              return false;
            }
            this.finalize();
            this.field_c = this.field_c + 1;
            return false;
          }
        }
        if (null == this.field_h) {
          this.field_h = this.field_g.a(5, (Runnable) (this), (byte) -72);
        }
        if (this.field_h.field_f == 0) {
          return false;
        }
        if (this.field_h.field_f != param0) {
          this.finalize();
          this.field_c = this.field_c + 1;
        }
        return false;
    }

    public static void b(int param0) {
        field_e = null;
        field_l = null;
        field_b = null;
        if (param0 != -16637) {
          ad.a(true, 13);
        }
    }

    final PacketBuffer a(byte param0) {
        if (param0 < 95) {
          this.a(-111);
          if (this.field_c == 3) {
            return this.field_f;
          }
          return null;
        }
        if (this.field_c == 3) {
          return this.field_f;
        }
        return null;
    }

    ad(tg param0, java.net.URL param1, int param2) {
        try {
          this.field_g = param0;
          this.field_a = param1;
          this.field_f = new PacketBuffer(param2);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
