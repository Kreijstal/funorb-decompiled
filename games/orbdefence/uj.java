/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uj implements Runnable {
    private be field_i;
    private eb field_h;
    private eb field_a;
    static qd field_b;
    private int field_d;
    private mg field_e;
    private eb field_f;
    private DataInputStream field_g;
    private java.net.URL field_c;

    final static void a(byte param0, mg param1) {
        int var2_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          fd.field_f = param1.j(98203176) << 5;
          var2_int = param1.b((byte) 90);
          fd.field_f = fd.field_f + (var2_int >> 3);
          cc.field_l = (var2_int & 7) << 18;
          cc.field_l = cc.field_l + (param1.j(98203176) << 2);
          var2_intLifetime1 = param1.b((byte) 90);
          oh.field_b = (var2_intLifetime1 & 63) << 15;
          cc.field_l = cc.field_l + (var2_intLifetime1 >> 6);
          oh.field_b = oh.field_b + (param1.b((byte) 90) << 7);
          var2_intLifetime2 = param1.b((byte) 90);
          oh.field_b = oh.field_b + (var2_intLifetime2 >> 1);
          h.field_E = (var2_intLifetime2 & 1) << 16;
          h.field_E = h.field_E + param1.j(param0 + 98203261);
          if (param0 != -85) {
            field_b = (qd) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("uj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void c(byte param0) {
        lb.a(true);
        if (null != tf.field_f) {
          hl.a(tf.field_f, 106);
        }
        fd.b(-82);
        km.b(-100);
        af.a(109);
        if (uj.a((byte) -36)) {
          uk.field_b.i(1, -53);
          bh.a(0, -1);
        }
        th.a(106);
        if (param0 != 63) {
          uj.c(33);
        }
    }

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Throwable var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = OrbDefence.field_D ? 1 : 0;
          try {
            while (this.field_e.field_j.length > this.field_e.field_i) {
              var1_int = this.field_g.read(this.field_e.field_j, this.field_e.field_i, this.field_e.field_j.length - this.field_e.field_i);
              if (var1_int >= 0) {
                this.field_e.field_i = this.field_e.field_i + var1_int;
                continue;
              }
              break;
            }
            if (this.field_e.field_j.length == this.field_e.field_i) {
              throw uj.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_e.field_j.length + " " + this.field_c));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_d = 3;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2_ref = this;
            synchronized (var2_ref) {
              this.finalize();
              this.field_d = this.field_d + 1;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.applet.Applet b(byte param0) {
        if (param0 != -120) {
          uj.b((byte) 89);
        }
        if (mj.field_j != null) {
          return mj.field_j;
        }
        return (java.applet.Applet) ((Object) aj.field_b);
    }

    final static boolean a(int[] param0, int param1) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        hc var5_ref_hc = null;
        int var5 = 0;
        hc var6 = null;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          if (da.field_r != dh.field_bb) {
            return false;
          }
          var2_int = 28 / ((param1 - 65) / 36);
          var3 = ji.b(125);
          if (0 != hf.field_i &&
            vb.field_i < 0) {
            var5_ref_hc = (hc) (t.field_q.b((byte) 121));
            if (var5_ref_hc != null &&
              var5_ref_hc.field_h < var3) {
              var5_ref_hc.b(57);
              tf.field_c = var5_ref_hc.field_m.length;
              cd.field_t.field_i = 0;
              for (var6_int = 0; var6_int < tf.field_c; var6_int++) {
                cd.field_t.field_j[var6_int] = var5_ref_hc.field_m[var6_int];
              }
              lh.field_c = fe.field_b;
              fe.field_b = ce.field_d;
              ce.field_d = ab.field_l;
              ab.field_l = var5_ref_hc.field_g;
              return true;
            }
          }
          while (true) {
            if (vb.field_i < 0) {
              cd.field_t.field_i = 0;
              if (!va.a(true, 1)) {
                return false;
              }
              vb.field_i = cd.field_t.o(-75);
              cd.field_t.field_i = 0;
              tf.field_c = param0[vb.field_i];
            }
            if (!ce.a(-106)) {
              return false;
            }
            if (hf.field_i == 0) {
              lh.field_c = fe.field_b;
              fe.field_b = ce.field_d;
              ce.field_d = ab.field_l;
              ab.field_l = vb.field_i;
              vb.field_i = -1;
              return true;
            }
            var5 = hf.field_i;
            if (tk.field_q != 0.0) {
              var5 = (int)((double)var5 + tl.field_f.nextGaussian() * tk.field_q);
              if (var5 < 0) {
                var5 = 0;
              }
            }
            var6 = new hc(var3 + (long)var5, vb.field_i, new byte[tf.field_c]);
            for (var7 = 0; var7 < tf.field_c; var7++) {
              var6.field_m[var7] = cd.field_t.field_j[var7];
            }
            t.field_q.a(-97, var6);
            vb.field_i = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("uj.G(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(')').toString());
        }
    }

    final mg a(int param0) {
        if (this.field_d == 3) {
          return this.field_e;
        }
        if (param0 == 5) {
          return null;
        }
        return (mg) null;
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 != 0) {
          uj.c(113);
        }
    }

    private final static boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -36) {
          field_b = (qd) null;
        }
        stackIn_6_0 = (p.field_d != null) && (dh.field_bb.a((byte) 74));
        return stackIn_6_0;
    }

    protected final void finalize() {
        if (null != this.field_a) {
          if (this.field_a.field_g != null) {
            try {
              ((DataInputStream) (this.field_a.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_a = null;
        }
        if (null != this.field_f) {
          if (this.field_f.field_g != null) {
            try {
              ((java.net.Socket) (this.field_f.field_g)).close();
            } catch (Exception exception) {
            }
          }
          this.field_f = null;
        }
        if (null != this.field_g) {
          try {
            this.field_g.close();
          } catch (Exception exception) {
          }
          this.field_g = null;
        }
        this.field_h = null;
    }

    final synchronized boolean b(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_d >= 2) {
          return true;
        }
        if (param0 >= -2) {
          this.field_a = (eb) null;
        }
        boolean decompiledFrameRemainder1 = true;
        if (0 == this.field_d) {
          if (this.field_a == null) {
            this.field_a = this.field_i.a(this.field_c, (byte) -49);
          }
          if (this.field_a.field_a == 0) {
            return false;
          }
          if (this.field_a.field_a != 1) {
            this.field_a = null;
            decompiledFrameRemainder1 = false;
          }
        }
        if (decompiledFrameRemainder1) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_d == 1) {
            if (null == this.field_f) {
              this.field_f = this.field_i.a(443, 0, this.field_c.getHost());
            }
            if (this.field_f.field_a == 0) {
              return false;
            }
            if (this.field_f.field_a != 1) {
              this.field_f = null;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            if (null == this.field_g) {
              try {
                if (this.field_d == 0) {
                  this.field_g = (DataInputStream) (this.field_a.field_g);
                }
                if (this.field_d == 1) {
                  var4 = (java.net.Socket) (this.field_f.field_g);
                  var4.setSoTimeout(10000);
                  var3 = var4.getOutputStream();
                  var3.write(17);
                  var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_c.getFile() + "\n\n"));
                  var3.write(oc.a(true, var5));
                  this.field_g = new DataInputStream(var4.getInputStream());
                }
                this.field_e.field_i = 0;
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = (IOException) (Object) decompiledCaughtException;
                this.finalize();
                this.field_d = this.field_d + 1;
              }
            }
            if (null == this.field_h) {
              this.field_h = this.field_i.a(314572800, 5, (Runnable) (this));
            }
            if (this.field_h.field_a == 0) {
              return false;
            }
            if (1 == this.field_h.field_a) {
              return false;
            }
            this.finalize();
          }
        }
        this.field_d = this.field_d + 1;
        return false;
    }

    uj(be param0, java.net.URL param1, int param2) {
        try {
          this.field_i = param0;
          this.field_c = param1;
          this.field_e = new mg(param2);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "uj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = new qd();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
