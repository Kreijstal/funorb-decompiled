/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mb {
    private boolean field_a;
    static String field_e;
    private int[] field_b;
    private int field_g;
    static int field_c;
    static int[] field_d;
    private int field_f;

    final static boolean a(boolean param0, int param1) {
        try {
          long dupTemp$1 = 0L;
          int var2 = 0;
          uf var2_ref_uf = null;
          IOException var2_ref_IOException = null;
          int stackIn_9_0 = 0;
          Throwable decompiledCaughtException = null;
          if (k.field_c == null) {
            k.field_c = lf.field_f.a(114, mc.field_e, hc.field_a);
          }
          if (k.field_c.field_c == 0) {
            return false;
          }
          dupTemp$1 = ik.a(4);
          el.field_J = dupTemp$1;
          p.field_a = dupTemp$1;
          if (k.field_c.field_c != 1) {
            ph.field_xb = kl.field_B;
          } else {
            try {
              qc.field_s = new qk((java.net.Socket) (k.field_c.field_b), lf.field_f);
              var2_ref_uf = de.field_V;
              we.field_b.field_n = 0;
              ph.field_xb = ba.field_f;
              stackIn_9_0 = (!param0) ? -1 : -2;
              lg.field_U = stackIn_9_0;
              bb.field_d = stackIn_9_0;
              kf.field_L = stackIn_9_0;
              var2_ref_uf.field_n = 0;
              gi.a(kb.field_g, l.field_c, 17, we.field_b, qk.field_a);
              wj.c(4792, -1);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
              ph.field_xb = kl.field_B;
              k.field_c = null;
              var2 = 79 / ((param1 - 21) / 48);
              return true;
            }
          }
          k.field_c = null;
          var2 = 79 / ((param1 - 21) / 48);
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) {
        int var2 = 97 % ((param0 - 37) / 50);
        return this.field_g + 1;
    }

    final static String a(int param0, hl param1) {
        String stackIn_33_0 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        Object var3_ref = null;
        int var4 = 0;
        String var5 = null;
        String var3Lifetime1;
        Object var3_refLifetime1;
        String var3Lifetime2;
        var4 = client.field_A ? 1 : 0;
        try {
          var2 = null;
          if (param1.field_p != null) {
            var5 = param1.field_p;
            var3 = var5;
            var3Lifetime2 = var5;
            var2 = var5;
            if (param1.field_l == 1) {
              var2 = "<img=0>" + var5;
            }
            if (param1.field_l == 2) {
              var2 = "<img=1>" + (String) (var2);
              var3_ref = var2;
              var3_refLifetime1 = var2;
            }
          }
          if (param0 <= 96) {
            field_c = -12;
          }
          var3Lifetime1 = "";
          if (2 == param1.field_m) {
            if (!param1.field_j) {
              if (0 == param1.field_i &&
                param1.field_n == 0) {
                var3Lifetime1 = cm.$cfr$intArgs$a$53ce4ab4c593(90, oj.field_b, new String[]{(String) (var2)});
              } else {
                var3Lifetime1 = cm.$cfr$intArgs$a$53ce4ab4c593(110, im.field_j, new String[]{(String) (var2)});
              }
            }
          } else {
            if (0 == param1.field_m &&
              ii.field_q) {
              var3Lifetime1 = "[" + uc.field_b + "] ";
            }
            if (param1.field_m == 1) {
              var3Lifetime1 = "[" + cm.$cfr$intArgs$a$53ce4ab4c593(125, hf.field_a, new String[]{param1.field_g}) + "] ";
            }
            if (4 == param1.field_m &&
              f.field_q != null) {
              var3Lifetime1 = "[" + f.field_q + "] ";
            }
            if (param1.field_m == 3) {
              var3Lifetime1 = "[#" + param1.field_g + "] ";
            }
            if (!param1.field_j) {
              var3Lifetime1 = var3Lifetime1 + (String) (var2) + ": ";
            }
          }
          stackIn_33_0 = var3Lifetime1;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_36_0 = var2;
          stackIn_36_1 = new StringBuilder().append("mb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw dh.a((Throwable) (stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        if (param0 > this.field_g) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 == 0) {
          return this.field_b[param0];
        }
        this.field_f = -5;
        return this.field_b[param0];
    }

    private final void a(int param0, int param1) {
        int[] var4 = new int[this.a((byte) -63, param0)];
        int[] var3 = var4;
        if (param1 < -4) {
          an.a(this.field_b, 0, var4, 0, this.field_b.length);
          this.field_b = var4;
          return;
        }
        this.b(9, -101);
        an.a(this.field_b, 0, var4, 0, this.field_b.length);
        this.field_b = var4;
    }

    private final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = client.field_A ? 1 : 0;
        if (param0 == -63) {
          var3 = this.field_b.length;
          while (param1 >= var3) {
            if (!this.field_a) {
              var3 = var3 + this.field_f;
              continue;
            }
            if (var3 == 0) {
              var3 = 1;
              continue;
            }
            var3 = var3 * this.field_f;
          }
          return var3;
        }
        this.field_f = -94;
        var3Lifetime1 = this.field_b.length;
        while (param1 >= var3Lifetime1) {
          if (!this.field_a) {
            var3Lifetime1 = var3Lifetime1 + this.field_f;
            continue;
          }
          if (var3Lifetime1 == 0) {
            var3Lifetime1 = 1;
            continue;
          }
          var3Lifetime1 = var3Lifetime1 * this.field_f;
        }
        return var3Lifetime1;
    }

    private final void a(byte param0, int param1, int param2) {
        if (this.field_g < param1) {
          this.field_g = param1;
          if (param0 < 38) {
            return;
          }
          if (param1 >= this.field_b.length) {
            this.a(param1, -23);
            this.field_b[param1] = param2;
            return;
          }
          this.field_b[param1] = param2;
          return;
        }
        if (param0 < 38) {
          return;
        }
        if (param1 < this.field_b.length) {
          this.field_b[param1] = param2;
          return;
        }
        this.a(param1, -23);
        this.field_b[param1] = param2;
    }

    private mb() throws Throwable {
        throw new Error();
    }

    final static int a(boolean param0, int param1, byte param2, int param3, int param4) {
        int var5 = 256 + param1 * (-param4 + param3);
        if (param0) {
          var5 += 64;
        }
        if (param2 == -122) {
          return var5;
        }
        field_e = (String) null;
        return var5;
    }

    final void a(int param0, boolean param1) {
        if (!param1) {
          this.a((byte) 114, this.field_g + 1, param0);
          return;
        }
        field_e = (String) null;
        this.a((byte) 114, this.field_g + 1, param0);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
          field_e = (String) null;
        }
    }

    final void c(int param0, int param1) {
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_g < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 <= -25) {
          if (this.field_g != param1) {
            an.a(this.field_b, param1 + 1, this.field_b, param1, this.field_g - param1);
          }
          this.field_g = this.field_g - 1;
          return;
        }
        this.field_f = 15;
        if (this.field_g != param1) {
          an.a(this.field_b, param1 + 1, this.field_b, param1, this.field_g - param1);
        }
        this.field_g = this.field_g - 1;
    }

    static {
        field_e = "Special Items";
    }
}
