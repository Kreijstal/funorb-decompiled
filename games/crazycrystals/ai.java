/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ai implements Runnable {
    private gb field_m;
    static int[] field_j;
    private ng field_k;
    private gb field_g;
    private DataInputStream field_e;
    private gb field_f;
    static int[] field_c;
    static dl field_b;
    private int field_d;
    private un field_a;
    static vc field_h;
    static String field_n;
    static String field_l;
    private java.net.URL field_i;

    public final void run() {
        try {
          int var1_int = 0;
          Object var1 = null;
          Throwable var2 = null;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          var4 = CrazyCrystals.field_B;
          try {
            while (this.field_k.field_f < this.field_k.field_h.length) {
              var1_int = this.field_e.read(this.field_k.field_h, this.field_k.field_f, -this.field_k.field_f + this.field_k.field_h.length);
              if (var1_int >= 0) {
                this.field_k.field_f = this.field_k.field_f + var1_int;
                continue;
              }
              break;
            }
            if (this.field_k.field_f == this.field_k.field_h.length) {
              throw ai.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_k.field_h.length + " " + this.field_i));
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

    protected final void finalize() {
        if (null != this.field_g) {
          if (this.field_g.field_b != null) {
            try {
              ((DataInputStream) (this.field_g.field_b)).close();
            } catch (Exception exception) {
            }
          }
          this.field_g = null;
        }
        if (this.field_m != null) {
          if (this.field_m.field_b != null) {
            try {
              ((java.net.Socket) (this.field_m.field_b)).close();
            } catch (Exception exception) {
            }
          }
          this.field_m = null;
        }
        if (this.field_e != null) {
          try {
            this.field_e.close();
          } catch (Exception exception) {
          }
          this.field_e = null;
        }
        this.field_f = null;
    }

    final ng a(byte param0) {
        if (3 == this.field_d) {
          return this.field_k;
        }
        if (param0 == -111) {
          return null;
        }
        return (ng) null;
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        field_j = null;
        field_c = null;
        if (param0 != 8076) {
          return;
        }
        field_n = null;
        field_l = null;
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
        boolean decompiledFrameRemainder0 = true;
        if (this.field_d == 0) {
          if (this.field_g == null) {
            this.field_g = this.field_a.a(5, this.field_i);
          }
          if (0 == this.field_g.field_a) {
            return false;
          }
          if (this.field_g.field_a != 1) {
            this.field_g = null;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          if (this.field_d == 1) {
            if (null == this.field_m) {
              this.field_m = this.field_a.a(443, false, this.field_i.getHost());
            }
            if (this.field_m.field_a == 0) {
              return false;
            }
            if (this.field_m.field_a != 1) {
              this.field_d = this.field_d + 1;
              this.field_m = null;
              return false;
            }
          }
          if (null == this.field_e) {
            try {
              if (0 == this.field_d) {
                this.field_e = (DataInputStream) (this.field_g.field_b);
              }
              if (this.field_d == 1) {
                var4 = (java.net.Socket) (this.field_m.field_b);
                var4.setSoTimeout(10000);
                var3 = var4.getOutputStream();
                var3.write(17);
                var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_i.getFile() + "\n\n"));
                var3.write(sn.a(var5, 83));
                this.field_e = new DataInputStream(var4.getInputStream());
              }
              this.field_k.field_f = 0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              this.finalize();
              this.field_d = this.field_d + 1;
            }
          }
          if (this.field_f == null) {
            this.field_f = this.field_a.a((Runnable) (this), param0 ^ 2, 5);
          }
          if (this.field_f.field_a == param0) {
            return false;
          }
          if (this.field_f.field_a == 1) {
            return false;
          }
          this.finalize();
        }
        this.field_d = this.field_d + 1;
        return false;
    }

    final static boolean a(int param0, int param1) {
        if (-1 == param1) {
          return true;
        }
        if (param0 != 100) {
          rh var3 = (rh) null;
          ai.a((rh) null, false, (String) null, 83, (rh) null, (byte) -124, -103);
        }
        return (1 << param1 & v.field_c) != 0 ? true : false;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        CharSequence var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 82) {
            var3 = (String) null;
            ai.a((byte) -21, (String) null);
          }
          var4 = (CharSequence) ((Object) param1);
          stackIn_3_0 = lk.field_b.equals(fe.a(60136, var4));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ai.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(rh param0, boolean param1, String param2, int param3, rh param4, byte param5, int param6) {
        int var12 = 0;
        int stackIn_7_0 = 0;
        ng stackIn_13_0 = null;
        String stackIn_14_1 = null;
        ng stackIn_16_0 = null;
        String stackIn_17_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = CrazyCrystals.field_B;
        try {
          if (param5 <= 79) {
            field_n = (String) null;
          }
          var14 = param0.a((byte) -108);
          var8 = param4.a((byte) -108);
          if (null == oi.field_c &&
            !te.a((byte) -19, false)) {
            stackIn_7_0 = -1;
            return stackIn_7_0;
          }
          if (gj.field_k == cf.field_a) {
            tp.field_f.field_f = 0;
            ja.field_f = null;
            if (param2 != null) {
              var9 = 0;
              if (param1) {
                var9 = var9 | 1;
              }
              sp.field_c.field_f = 0;
              sp.field_c.a(og.field_w.nextInt(), -16384);
              sp.field_c.a(og.field_w.nextInt(), -16384);
              sp.field_c.a(var14, (byte) -103);
              sp.field_c.a(var8, (byte) -99);
              var15 = (CharSequence) ((Object) param2);
              sp.field_c.a(ba.a(48, var15), (byte) -120);
              sp.field_c.c(-161478600, param3);
              sp.field_c.a(true, param6);
              sp.field_c.a(true, var9);
              tp.field_f.a(true, 18);
              tp.field_f.field_f = tp.field_f.field_f + 2;
              var10 = tp.field_f.field_f;
              var11_ref_String = mf.a(le.b((byte) -20), -28697);
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              tp.field_f.b(var11_ref_String, (byte) -23);
              tg.a(sp.field_c, tp.field_f, gn.field_S, -105, lm.field_j);
              tp.field_f.b(977272835, -var10 + tp.field_f.field_f);
            } else {
              sp.field_c.field_f = 0;
              sp.field_c.a(og.field_w.nextInt(), -16384);
              sp.field_c.a(og.field_w.nextInt(), -16384);
              stackIn_13_0 = sp.field_c;
              if (!param0.a(-124)) {
                stackIn_14_1 = "";
              } else {
                stackIn_14_1 = var14;
              }
              ((ng) (Object) stackIn_13_0).a(stackIn_14_1, (byte) -93);
              stackIn_16_0 = sp.field_c;
              if (param4.a(-113)) {
                stackIn_17_1 = var8;
              } else {
                stackIn_17_1 = "";
              }
              ((ng) (Object) stackIn_16_0).a(stackIn_17_1, (byte) -115);
              tp.field_f.a(true, 16);
              tp.field_f.field_f = tp.field_f.field_f + 1;
              var9 = tp.field_f.field_f;
              tg.a(sp.field_c, tp.field_f, gn.field_S, -122, lm.field_j);
              tp.field_f.c((byte) 46, tp.field_f.field_f - var9);
            }
            ak.a(-1, (byte) -48);
            gj.field_k = kp.field_k;
          }
          if (gj.field_k == kp.field_k &&
            fq.a(1, (byte) -125)) {
            var9Lifetime1 = kd.field_n.h(255);
            kd.field_n.field_f = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              gj.field_k = ga.field_F;
              gj.field_o = new String[-100 + var9Lifetime1];
            } else {
              if (248 == var9Lifetime1) {
                cb.a(1148, le.b((byte) -20));
                re.field_j = bo.field_m;
                jj.a(4);
                ec.field_g = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (var9Lifetime1 != 99) {
                bf.field_b = var9Lifetime1;
                rk.field_b = -1;
                gj.field_k = kf.field_b;
              } else {
                fq.a(ui.b((byte) -123), (byte) 75);
                ja.field_f = new Boolean(hm.a(kd.field_n, -2));
                kd.field_n.field_f = 0;
              }
            }
          }
          if (gj.field_k == ga.field_F) {
            var9Lifetime2 = 2;
            if (fq.a(var9Lifetime2, (byte) -50)) {
              var10Lifetime1 = kd.field_n.c((byte) -7);
              kd.field_n.field_f = 0;
              if (fq.a(var10Lifetime1, (byte) -40)) {
                var11 = gj.field_o.length;
                for (var12 = 0; var12 < var11; var12++) {
                  gj.field_o[var12] = kd.field_n.d(93);
                }
                jj.a(4);
                ec.field_g = false;
                stackIn_46_0 = 100 + var11;
                return stackIn_46_0;
              }
            }
          }
          if (gj.field_k == kf.field_b &&
            ol.f((byte) 60)) {
            if (bf.field_b != 255) {
              re.field_j = kd.field_n.i(122);
            } else {
              var9_ref_String = kd.field_n.a(0);
              if (var9_ref_String != null) {
                ah.a(-72, var9_ref_String, le.b((byte) -20));
              }
            }
            jj.a(4);
            ec.field_g = false;
            stackIn_56_0 = bf.field_b;
            return stackIn_56_0;
          }
          if (null == oi.field_c) {
            if (ec.field_g) {
              if (30000L >= wd.d(-1322)) {
                re.field_j = re.field_k;
              } else {
                re.field_j = jm.field_f;
              }
              ec.field_g = false;
              stackIn_64_0 = 249;
              return stackIn_64_0;
            }
            var9Lifetime3 = fe.field_j;
            fe.field_j = gj.field_l;
            ec.field_g = true;
            gj.field_l = var9Lifetime3;
          }
          stackIn_67_0 = -1;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("ai.D(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    ai(un param0, java.net.URL param1, int param2) {
        try {
          this.field_a = param0;
          this.field_i = param1;
          this.field_k = new ng(param2);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ai.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = new int[256];
        field_n = "Tutorial";
        field_j = new int[12];
        field_l = "Email address is unavailable";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
