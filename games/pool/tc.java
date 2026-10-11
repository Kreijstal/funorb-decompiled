/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tc {
    static int[] field_d;
    private int field_c;
    int[] field_e;
    private int field_b;
    private boolean field_a;

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
          field_d = (int[]) null;
        }
    }

    final int a(byte param0) {
        if (param0 <= 86) {
          this.b(-74, -82);
          return this.field_c + 1;
        }
        return this.field_c + 1;
    }

    private final void b(int param0, int param1) {
        int[] var4 = new int[this.a(param1, (byte) -41)];
        int[] var3 = var4;
        if (param0 == 28083) {
          qn.a(this.field_e, 0, var4, 0, this.field_e.length);
          this.field_e = var4;
          return;
        }
        this.field_b = -28;
        qn.a(this.field_e, 0, var4, 0, this.field_e.length);
        this.field_e = var4;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 10499) {
          this.b(115, -65);
          if (this.field_c < param2) {
            this.field_c = param2;
          }
          if (param2 >= this.field_e.length) {
            this.b(28083, param2);
            this.field_e[param2] = param1;
            return;
          }
          this.field_e[param2] = param1;
          return;
        }
        if (this.field_c < param2) {
          this.field_c = param2;
        }
        if (param2 < this.field_e.length) {
          this.field_e[param2] = param1;
          return;
        }
        this.b(28083, param2);
        this.field_e[param2] = param1;
    }

    final void c(int param0, int param1) {
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (this.field_c < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 != this.field_c) {
          qn.a(this.field_e, param0 + 1, this.field_e, param0, -param0 + this.field_c);
          if (param1 >= 16) {
            this.field_c = this.field_c - 1;
            return;
          }
          this.a(17, -11);
          this.field_c = this.field_c - 1;
          return;
        }
        if (param1 >= 16) {
          this.field_c = this.field_c - 1;
          return;
        }
        this.a(17, -11);
        this.field_c = this.field_c - 1;
    }

    final void a(byte param0, int param1) {
        this.a(10499, param1, this.field_c + 1);
        if (param0 != -2) {
          field_d = (int[]) null;
        }
    }

    private final int a(int param0, byte param1) {
        int var3;
        var3 = this.field_e.length;
        while (var3 <= param0) {
          if (!this.field_a) {
            var3 = var3 + this.field_b;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_b;
            continue;
          }
          var3 = 1;
        }
        if (param1 <= -12) {
          return var3;
        }
        this.b(-26, -84);
        return var3;
    }

    final int a(int param0, int param1) {
        if (param1 != 2229) {
          this.field_a = false;
          if (param0 > this.field_c) {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
          return this.field_e[param0];
        }
        if (param0 > this.field_c) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        return this.field_e[param0];
    }

    tc(int param0, boolean param1) {
        this.field_c = -1;
        this.field_e = new int[]{};
        this.field_a = false;
        this.field_b = param0;
        this.field_a = param1 ? true : false;
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
          sj stackIn_14_0;
          java.net.URL stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          StringBuilder stackIn_14_4;
          java.net.URL stackIn_15_1;
          java.net.URL stackIn_15_2;
          String stackIn_15_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          le var4 = null;
          DataInputStream var5 = null;
          String var6 = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = ee.a(5, param0);
            }
            if (param1 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            ao.a(55, var3);
            var6 = dg.a(14, "%3a", var3, ":");
            var7 = dg.a(124, "%40", var6, "@");
            var8 = dg.a(123, "%26", var7, "&");
            var9 = dg.a(-61, "%23", var8, "#");
            if (null == gj.field_W) {
              return;
            }
            stackIn_14_0 = wh.field_c;
            stackIn_14_1 = null;
            stackIn_14_2 = null;
            stackIn_14_3 = gj.field_W.getCodeBase();
            stackIn_14_4 = new StringBuilder().append("clienterror.ws?c=").append(ok.field_rb).append("&u=");
            if (ma.field_j == null) {
              stackIn_15_1 = null;
              stackIn_15_2 = null;
              stackIn_15_5 = "" + hf.field_e;
            } else {
              stackIn_15_1 = null;
              stackIn_15_2 = null;
              stackIn_15_5 = ma.field_j;
            }
            var4 = ((sj) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, ((StringBuilder) (Object) stackIn_14_4).append(stackIn_15_5).append("&v1=").append(sj.field_o).append("&v2=").append(sj.field_t).append("&e=").append(var9).toString()), 1);
            while (var4.field_f == 0) {
              cf.a(-100, 1L);
            }
            if (param2 != -8555) {
              field_d = (int[]) null;
            }
            if (1 == var4.field_f) {
              var5 = (DataInputStream) (var4.field_e);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
