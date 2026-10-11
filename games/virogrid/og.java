/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class og implements Runnable {
    private jc field_p;
    private un field_m;
    static int field_s;
    static String field_e;
    static String field_k;
    private un field_q;
    static il field_l;
    static String field_c;
    static boolean[] field_j;
    static int field_b;
    private DataInputStream field_i;
    private pd field_f;
    static String field_n;
    private int field_h;
    static String[] field_o;
    static km[] field_g;
    static String[] field_t;
    private un field_d;
    private java.net.URL field_r;
    static String field_a;

    final static void a(int param0, int param1, int param2, int[] param3, int param4, byte param5, int param6) {
        ag.field_j[param0] = param3;
        ag.field_b[param0] = param6;
        ag.field_h[param0] = param1;
        ag.field_f[param0] = param2;
        if (param5 < 57) {
          return;
        }
        try {
          ag.field_a[param0] = param4;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "og.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final synchronized boolean a(int param0) {
        Throwable decompiledCaughtException = null;
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        if (this.field_h >= 2) {
          return true;
        }
        if (this.field_h == 0) {
          if (this.field_d == null) {
            this.field_d = this.field_f.a(this.field_r, true);
          }
          if (this.field_d.field_a == 0) {
            return false;
          }
          if (this.field_d.field_a != 1) {
            this.field_h = this.field_h + 1;
            this.field_d = null;
            return false;
          }
        }
        if (this.field_h == 1) {
          if (null == this.field_q) {
            this.field_q = this.field_f.a(443, 27402, this.field_r.getHost());
          }
          if (this.field_q.field_a == 0) {
            return false;
          }
          if (this.field_q.field_a != 1) {
            this.field_h = this.field_h + 1;
            this.field_q = null;
            return false;
          }
        }
        if (this.field_i != null) {
          if (this.field_m == null) {
            this.field_m = this.field_f.a(5, (Runnable) (this), 255);
          }
          if (param0 != 5038) {
            this.field_m = (un) null;
          }
          if (0 == this.field_m.field_a) {
            return false;
          }
          if (1 == this.field_m.field_a) {
            return false;
          }
          this.finalize();
          this.field_h = this.field_h + 1;
          return false;
        }
        try {
          if (this.field_h == 0) {
            this.field_i = (DataInputStream) (this.field_d.field_f);
          }
          if (1 == this.field_h) {
            var4 = (java.net.Socket) (this.field_q.field_f);
            var4.setSoTimeout(10000);
            var3 = var4.getOutputStream();
            var3.write(17);
            var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_r.getFile() + "\n\n"));
            var3.write(ak.a(param0 ^ 5700, var5));
            this.field_i = new DataInputStream(var4.getInputStream());
          }
          this.field_p.field_l = 0;
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IOException) (Object) decompiledCaughtException;
          this.finalize();
          this.field_h = this.field_h + 1;
          if (this.field_m == null) {
            this.field_m = this.field_f.a(5, (Runnable) (this), 255);
          }
          if (param0 == 5038) {
            if (0 == this.field_m.field_a) {
              return false;
            }
            if (1 == this.field_m.field_a) {
              return false;
            }
            this.finalize();
            this.field_h = this.field_h + 1;
            return false;
          }
          this.field_m = (un) null;
          if (0 == this.field_m.field_a) {
            return false;
          }
          if (1 == this.field_m.field_a) {
            return false;
          }
          this.finalize();
          this.field_h = this.field_h + 1;
          return false;
        }
        if (this.field_m == null) {
          this.field_m = this.field_f.a(5, (Runnable) (this), 255);
        }
        if (param0 != 5038) {
          this.field_m = (un) null;
        }
        if (0 == this.field_m.field_a) {
          return false;
        }
        if (1 != this.field_m.field_a) {
          this.finalize();
          this.field_h = this.field_h + 1;
        }
        return false;
    }

    final static String a(String param0, int param1, byte param2, String param3) {
        RuntimeException var4 = null;
        hg var5 = null;
        int var6 = 0;
        int var7 = 0;
        gh var8 = null;
        CharSequence var9 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = (CharSequence) ((Object) param3);
          if (!dm.a(var9, -1478)) {
            stackIn_3_0 = sa.field_l;
            return stackIn_3_0;
          }
          if (oa.field_q != 2) {
            stackIn_7_0 = dh.field_l;
            return stackIn_7_0;
          }
          var8 = kh.a((byte) 75, param0);
          if (var8 == null) {
            stackIn_10_0 = oi.a(new String[]{param0}, a.field_z, 2);
            return stackIn_10_0;
          }
          var8.a(false);
          var8.c(102);
          mj.field_z = mj.field_z - 1;
          var6 = 24 % ((param2 + 33) / 45);
          var5 = gk.field_g;
          var5.g(param1, 8);
          var5.field_l = var5.field_l + 1;
          var7 = var5.field_l;
          var5.a(3, 124);
          var5.a(param3, (byte) -96);
          var5.b(-var7 + var5.field_l, -1);
          stackIn_12_0 = null;
          return (String) (stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("og.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
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
          var4 = Virogrid.field_F ? 1 : 0;
          try {
            while (this.field_p.field_g.length > this.field_p.field_l) {
              var1_int = this.field_i.read(this.field_p.field_g, this.field_p.field_l, -this.field_p.field_l + this.field_p.field_g.length);
              if (var1_int >= 0) {
                this.field_p.field_l = this.field_p.field_l + var1_int;
                continue;
              }
              break;
            }
            if (this.field_p.field_l == this.field_p.field_g.length) {
              throw og.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_p.field_g.length + " " + this.field_r));
            }
            var1 = this;
            synchronized (var1) {
              this.finalize();
              this.field_h = 3;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var2 = this;
            synchronized (var2) {
              this.finalize();
              this.field_h = this.field_h + 1;
            }
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String c(int param0) {
        String var1;
        int[] var2;
        var1 = "";
        if (param0 <= -47) {
          if (aa.field_a != null) {
            var1 = aa.field_a.f(-3);
          }
          if (var1.length() == 0) {
            var1 = hh.b((byte) -123);
          }
          if (var1.length() == 0) {
            var1 = tl.field_f;
          }
          return var1;
        }
        var2 = (int[]) null;
        og.a(-2, -25, -21, (int[]) null, 58, (byte) 13, 49);
        if (aa.field_a != null) {
          var1 = aa.field_a.f(-3);
        }
        if (var1.length() == 0) {
          var1 = hh.b((byte) -123);
        }
        if (var1.length() == 0) {
          var1 = tl.field_f;
        }
        return var1;
    }

    protected final void finalize() {
        if (null != this.field_d) {
          if (this.field_d.field_f != null) {
            try {
              ((DataInputStream) (this.field_d.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_d = null;
        }
        if (null != this.field_q) {
          if (null != this.field_q.field_f) {
            try {
              ((java.net.Socket) (this.field_q.field_f)).close();
            } catch (Exception exception) {
            }
          }
          this.field_q = null;
        }
        if (this.field_i != null) {
          try {
            this.field_i.close();
          } catch (Exception exception) {
          }
          this.field_i = null;
        }
        this.field_m = null;
    }

    final jc d(int param0) {
        if (param0 != 18240) {
          this.field_p = (jc) null;
          if (3 == this.field_h) {
            return this.field_p;
          }
          return null;
        }
        if (3 == this.field_h) {
          return this.field_p;
        }
        return null;
    }

    final static String a(String param0, boolean param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        gh var7 = null;
        gh var8 = null;
        hg var9 = null;
        CharSequence var10 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param0);
          if (!dm.a(var10, -1478)) {
            stackIn_3_0 = sa.field_l;
            return stackIn_3_0;
          }
          if (oa.field_q != 2) {
            stackIn_6_0 = am.field_c;
            return stackIn_6_0;
          }
          var8 = j.a(0, param0);
          if (var8 == null) {
            stackIn_9_0 = oi.a(new String[]{param0}, ji.field_c, 2);
            return stackIn_9_0;
          }
          co.field_f.a(480, var8);
          if (!param1) {
            field_k = (String) null;
          }
          while (true) {
            var7 = (gh) (co.field_f.a(16213));
            if (var7 != null) {
              var7.field_Nb = var7.field_Nb - 1;
              continue;
            }
            break;
          }
          var8.a(false);
          var8.c(20);
          sg.field_j = sg.field_j - 1;
          var9 = gk.field_g;
          var9.g(param2, 8);
          var9.field_l = var9.field_l + 1;
          var5 = var9.field_l;
          var9.a(1, -98);
          var9.a(param0, (byte) -40);
          var9.b(-var5 + var9.field_l, -1);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("og.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static java.net.URL a(int param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param0 != -1) {
            og.c(-38);
          }
          var4 = null;
          if (null != rh.field_a &&
            !rh.field_a.equals(param1.getParameter("settings"))) {
            var3 = rh.field_a;
            var4 = var3;
            var4 = var3;
          }
          if (null != jj.field_g &&
            !jj.field_g.equals(param1.getParameter("session"))) {
            var4 = jj.field_g;
          }
          stackIn_11_0 = tk.a(param2, (String) (var3), (String) (var4), -1, (byte) -31);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("og.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kg.a((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_k = null;
        field_l = null;
        field_o = null;
        if (param0 > 66) {
          field_e = null;
          field_c = null;
          field_t = null;
          field_j = null;
          field_n = null;
          field_a = null;
          return;
        }
    }

    og(pd param0, java.net.URL param1, int param2) {
        try {
          this.field_f = param0;
          this.field_r = param1;
          this.field_p = new jc(param2);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_k = "Quit to website";
        field_c = "Send private Quick Chat to <%0>";
        field_n = "You have 1 unread message!";
        field_o = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_t = new String[]{"By rating", "By win percentage"};
        field_e = "<%0> is already on your friend list.";
        field_j = new boolean[]{true, true, true, true, true, false, true, true, false, false};
        field_a = "Add <%0> to ignore list";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
