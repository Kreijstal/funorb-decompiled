/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kw extends kj {
    private int field_l;
    static hq field_j;
    private int field_h;
    static int field_f;
    static String field_m;
    static String field_g;
    private int field_i;
    static gs[] field_k;
    private boolean field_o;
    static String field_n;

    final static void a(boolean param0) {
        gk.field_d = 0;
        lna.field_q = param0 ? true : false;
    }

    final static eq a(boolean param0, String[] param1) {
        eq var2 = null;
        RuntimeException var2_ref = null;
        eq stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new eq(param0);
            var2.field_a = param1;
            stackIn_1_0 = (eq) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2_ref);

            stackIn_4_1 = new StringBuilder().append("kw.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final boolean b(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if ((this.field_l ^ -1) != -61) {
          if (param0 >= 21) {
            fieldTemp$0 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if ((fieldTemp$0 ^ -1) > -1) {
              L0: {
                if (this.field_o) {
                  this.field_e.field_h.b((byte) -126, 28, this.field_d, this.field_c);
                  break L0;
                } else {
                  break L0;
                }
              }
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          } else {
            this.b(-88);
            fieldTemp$1 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if ((fieldTemp$1 ^ -1) > -1) {
              L1: {
                if (this.field_o) {
                  this.field_e.field_h.b((byte) -126, 28, this.field_d, this.field_c);
                  break L1;
                } else {
                  break L1;
                }
              }
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          }
        } else {
          jja.a(192, -1, 25);
          if (param0 < 21) {
            this.b(-88);
            fieldTemp$2 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if ((fieldTemp$2 ^ -1) > -1) {
              L2: {
                if (this.field_o) {
                  this.field_e.field_h.b((byte) -126, 28, this.field_d, this.field_c);
                  break L2;
                } else {
                  break L2;
                }
              }
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          } else {
            fieldTemp$3 = this.field_l - 1;
            this.field_l = this.field_l - 1;
            if ((fieldTemp$3 ^ -1) <= -1) {
              return false;
            } else {
              L3: {
                if (this.field_o) {
                  this.field_e.field_h.b((byte) -126, 28, this.field_d, this.field_c);
                  break L3;
                } else {
                  break L3;
                }
              }
              jja.a(64, -1, 24);
              return true;
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.b(-84);
        }
    }

    kw(gj param0, int param1, int param2, int param3, int param4, boolean param5) {
        super(param0, param1, param2);
        try {
            this.field_o = param5 ? true : false;
            this.field_l = 80;
            this.field_i = -64 + kla.a(129, m.field_a, -2147483648) + param3;
            this.field_h = kla.a(65, m.field_a, -2147483648) + param4 - 32;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "kw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void c(byte param0) {
        field_k = null;
        if (param0 < 75) {
          field_m = (String) null;
          field_g = null;
          field_j = null;
          field_n = null;
          field_m = null;
          return;
        } else {
          field_g = null;
          field_j = null;
          field_n = null;
          field_m = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        ee var5;
        int var6;
        int var7;
        if (param1 != 0) {
          return;
        } else {
          var4 = this.field_l * (((80 + -this.field_l) * 655360 >> 807673392) + 400) / 80;
          var5 = kka.field_f;
          var6 = param2 - this.field_i * this.field_l / 80;
          var7 = param0 - var4 + -(this.field_l * this.field_h / 80);
          var5.a(var6, var7 - 64);
          return;
        }
    }

    static {
        field_f = 4;
        field_g = "Refreshed!";
        field_m = "All arena achievements must be gained in rated games";
        field_n = "Game drawn";
    }
}
