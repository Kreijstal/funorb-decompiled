/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id {
    static int field_c;
    static int[] field_h;
    static String field_j;
    static char field_b;
    private int[] field_a;
    private int field_e;
    static String field_i;
    static int field_g;
    private boolean field_d;
    private int field_f;

    final static boolean a(boolean param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          ih var4 = null;
          ih var5 = null;
          int stackIn_13_0 = 0;
          Throwable decompiledCaughtException = null;
          if (param0) {
            return false;
          }
          if (gg.field_e == null) {
            gg.field_e = af.field_f.a(be.field_b, (byte) 32, a.field_d);
          }
          if (0 == gg.field_e.field_b) {
            return false;
          }
          dupTemp$1 = lj.a((byte) -47);
          jd.field_n = dupTemp$1;
          ug.field_d = dupTemp$1;
          if (1 != gg.field_e.field_b) {
            rh.field_k = wb.field_q;
          } else {
            try {
              sg.field_h = new td((java.net.Socket) (gg.field_e.field_e), af.field_f);
              ud.field_b.field_i = 0;
              var4 = ae.field_a;
              var5 = var4;
              rh.field_k = d.field_O;
              var5.field_i = 0;
              stackIn_13_0 = (!param1) ? -1 : -2;
              hc.field_j = stackIn_13_0;
              rj.field_k = stackIn_13_0;
              vi.field_a = stackIn_13_0;
              ob.a(cj.field_b, j.field_g, (byte) -127, bb.field_E, ud.field_b);
              dk.b((byte) 41, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              rh.field_k = wb.field_q;
              gg.field_e = null;
              return true;
            }
          }
          gg.field_e = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        if (bh.field_t == 10) {
          re.a(-17634);
          bh.field_t = 11;
        } else {
          if (!lk.a(-109)) {
            re.a(-17634);
            bh.field_t = 11;
          }
        }
        if (param0) {
          return;
        }
        rj.field_m = true;
    }

    private final int a(int param0, boolean param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = fleas.field_A ? 1 : 0;
        if (param1) {
          var3 = this.field_a.length;
          while (param0 >= var3) {
            if (!this.field_d) {
              var3 = var3 + this.field_f;
              continue;
            }
            if (0 != var3) {
              var3 = var3 * this.field_f;
              continue;
            }
            var3 = 1;
          }
          return var3;
        }
        field_j = (String) null;
        var3Lifetime1 = this.field_a.length;
        while (param0 >= var3Lifetime1) {
          if (!this.field_d) {
            var3Lifetime1 = var3Lifetime1 + this.field_f;
            continue;
          }
          if (0 != var3Lifetime1) {
            var3Lifetime1 = var3Lifetime1 * this.field_f;
            continue;
          }
          var3Lifetime1 = 1;
        }
        return var3Lifetime1;
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_e < param0) {
          this.field_e = param0;
          if (param0 >= this.field_a.length) {
            this.a(0, param0);
          }
          if (param2 > -126) {
            this.b(-106);
            this.field_a[param0] = param1;
            return;
          }
          this.field_a[param0] = param1;
          return;
        }
        if (param0 >= this.field_a.length) {
          this.a(0, param0);
        }
        if (param2 <= -126) {
          this.field_a[param0] = param1;
          return;
        }
        this.b(-106);
        this.field_a[param0] = param1;
    }

    final int b(int param0, boolean param1) {
        if (param0 > this.field_e) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (!param1) {
          return this.field_a[param0];
        }
        this.a(-40, -13, 81);
        return this.field_a[param0];
    }

    final void b(int param0, int param1) {
        if (param0 != 1) {
          this.a(-59, -73, 120);
          if (0 > param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
          if (this.field_e < param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
          if (this.field_e != param1) {
            dm.a(this.field_a, 1 + param1, this.field_a, param1, -param1 + this.field_e);
            this.field_e = this.field_e - 1;
            return;
          }
          this.field_e = this.field_e - 1;
          return;
        }
        if (0 > param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_e < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_e == param1) {
          this.field_e = this.field_e - 1;
          return;
        }
        dm.a(this.field_a, 1 + param1, this.field_a, param1, -param1 + this.field_e);
        this.field_e = this.field_e - 1;
    }

    final static ob a(String param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        ob var7 = null;
        int var8 = 0;
        ob stackIn_6_0 = null;
        ob stackIn_10_0 = null;
        ob stackIn_14_0 = null;
        ob stackIn_20_0 = null;
        ob stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          if (param1 != 31592) {
            field_h = (int[]) null;
          }
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_6_0 = tf.field_H;
            return stackIn_6_0;
          }
          if (var2_int > 255) {
            stackIn_10_0 = hg.field_i;
            return stackIn_10_0;
          }
          var3 = m.a('.', 114, param0);
          if (var3.length < 2) {
            stackIn_14_0 = tf.field_H;
            return stackIn_14_0;
          }
          var4 = var3;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = bj.a(param1 - 31656, var6);
            if (var7 != null) {
              stackIn_20_0 = var7;
              return stackIn_20_0;
            }
          }
          stackIn_23_0 = oa.a(var3[var3.length - 1], -23);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("id.J(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.a(param1, true)];
        int[] var3 = var4;
        dm.a(this.field_a, 0, var4, param0, this.field_a.length);
        this.field_a = var4;
    }

    final void a(byte param0, int param1) {
        this.a(this.field_e + 1, param1, -127);
        int var3 = 56 / ((param0 + 33) / 51);
    }

    final int b(int param0) {
        if (param0 != 0) {
          id.a(true);
          return 1 + this.field_e;
        }
        return 1 + this.field_e;
    }

    final static boolean a(int param0) {
        if (param0 != -5935) {
          return false;
        }
        return wi.field_f == ui.field_kb ? true : false;
    }

    private id() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        int var1 = 33 / ((-80 - param0) / 42);
        field_i = null;
        field_j = null;
        field_h = null;
    }

    static {
        field_h = new int[150];
        field_j = "This password contains your email address, and would be easy to guess";
        field_g = 0;
    }
}
