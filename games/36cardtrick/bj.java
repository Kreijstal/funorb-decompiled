/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bj {
    private int field_o;
    private int field_v;
    private int field_g;
    private float field_l;
    static boolean field_m;
    private int field_d;
    static String field_u;
    private int field_j;
    private int field_e;
    private int field_r;
    private int field_f;
    private int field_c;
    private int field_s;
    private fa field_q;
    static int field_h;
    private int field_a;
    private int field_n;
    private int field_p;
    private boolean field_k;
    static String field_b;
    private int field_t;
    private int field_i;

    final oe c(int param0) {
        this.field_r = gg.field_d;
        this.field_o = hj.field_j;
        if (param0 != -1) {
          this.c(-67);
        }
        this.field_q.a(-23603, this.field_p, this.field_v);
        vd.field_w = false;
        oe var2 = qa.a(0, this.field_p, 0, 17651, jk.field_a, this.field_v);
        if (var2 == null) {
          this.a((byte) 10);
        }
        return var2;
    }

    final boolean b(boolean param0) {
        boolean stackIn_6_0 = false;
        if (!param0) {
          return false;
        }
        stackIn_6_0 = (this.field_t <= v.field_Q) && (0 < d.field_c);
        return stackIn_6_0;
    }

    final void a(int param0, byte param1, int param2) {
        this.field_c = param2;
        if (param1 != 115) {
          this.a(118, (byte) 102, 61);
        }
        this.field_f = param0;
    }

    final void b(int param0) {
        int fieldTemp$1 = 0;
        if (gj.field_a != null) {
          return;
        }
        if (d.field_c <= 0) {
          this.field_k = false;
        }
        if (this.field_k) {
          fieldTemp$1 = this.field_i - 1;
          this.field_i = this.field_i - 1;
          if (fieldTemp$1 > 0) {
            return;
          }
          if (param0 != 5718) {
            field_h = -103;
          }
          this.field_i = this.field_e;
          if (this.field_t <= v.field_Q) {
            this.a(false);
          } else {
            this.field_k = false;
          }
          return;
        }
        if (this.field_c <= gg.field_d) {
          if (0 < this.field_c) {
            sk.field_d = 0;
          }
        } else {
          sk.field_d = (this.field_c - gg.field_d) / 2;
        }
        if (gg.field_d != this.field_a ||
          hj.field_j != this.field_j) {
          this.field_q.a(-23603, this.field_j, this.field_a);
        }
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        int var5;
        int var4;
        var5 = Main.field_T;
        var2 = this.field_c;
        var3 = this.field_f;
        if (!this.b(true)) {
          this.field_k = false;
        } else {
          if (param0) {
            this.a((byte) -114);
          }
          if (var2 > this.field_d) {
            var2 = this.field_d;
          } else {
            if (var2 < this.field_g) {
              var2 = this.field_g;
            }
          }
          if (this.field_n < var3) {
            var3 = this.field_n;
          } else {
            if (var3 < this.field_s) {
              var3 = this.field_s;
            }
          }
          if (this.field_l > 0.0f) {
            var4 = (int)(0.5f + (float)var3 * this.field_l);
            if (var4 > var2) {
              var3 = (int)((float)var2 / this.field_l);
            } else {
              if (var2 > var4) {
                var2 = var4;
              }
            }
          }
          if (var2 != gg.field_d) {
            this.field_q.a(-23603, var3, var2);
          } else {
            if (hj.field_j != var3) {
              this.field_q.a(-23603, var3, var2);
            }
          }
          if (0 < this.field_c) {
            sk.field_d = (this.field_c - gg.field_d) / 2;
          }
        }
    }

    final void a(byte param0) {
        if (param0 != 10) {
          bj.a(-113);
        }
        this.field_q.a(-23603, this.field_o, this.field_r);
    }

    private bj() throws Throwable {
        throw new Error();
    }

    final static void a(pb param0, int param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          byte[] var7 = null;
          byte[] var8 = null;
          byte[] var9 = null;
          byte[] var10 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = Main.field_T;
          try {
            if (param1 != -25) {
              return;
            }
            var9 = new byte[24];
            var7 = var9;
            var6 = var7;
            var10 = var6;
            var8 = var10;
            var2 = var8;
            if (e.field_e != null) {
              try {
                e.field_e.a(0L, -67);
                e.field_e.a(param1 + 25, var9);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var10[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (24 <= var3_int) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
              param0.a(24, 0, var10, (byte) -106);
            } else {
              param0.a(24, 0, var10, (byte) -106);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var2_ref;
            stackIn_21_1 = new StringBuilder().append("bj.C(");
            if (param0 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_u = null;
        if (param0 >= -96) {
          bj.a(-59);
        }
    }

    static {
        field_u = "This password contains your email address, and would be easy to guess";
        field_b = "Continue";
    }
}
