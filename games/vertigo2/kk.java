/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kk {
    static ve field_e;
    private mn[] field_m;
    private nj field_i;
    private int field_g;
    static int field_j;
    private int field_d;
    private int field_k;
    private int field_b;
    private int[][][] field_l;
    static String field_h;
    static cr field_a;
    boolean field_c;
    static cr field_f;

    final int[][] a(int param0, int param1) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        mn var3;
        mn var4;
        int var5;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          if (param1 == -2) {
            break L0;
          } else {
            this.field_g = -121;
            break L0;
          }
        }
        if (this.field_k != this.field_g) {
          if (-2 != (this.field_g ^ -1)) {
            L1: {
              var3 = this.field_m[param0];
              if (var3 == null) {
                L2: {
                  this.field_c = true;
                  if (this.field_g <= this.field_d) {
                    var4 = (mn) ((Object) this.field_i.c((byte) -45));
                    var3 = new mn(param0, var4.field_s);
                    this.field_m[var4.field_r] = null;
                    var4.c(param1 ^ -4);
                    break L2;
                  } else {
                    var3 = new mn(param0, this.field_d);
                    this.field_d = this.field_d + 1;
                    break L2;
                  }
                }
                this.field_m[param0] = var3;
                break L1;
              } else {
                this.field_c = false;
                break L1;
              }
            }
            this.field_i.a(var3, (byte) 27);
            return this.field_l[var3.field_s];
          } else {
            L3: {
              stackIn_10_0 = this;

              if (this.field_b == param0) {
                stackIn_11_0 = this;
                stackIn_11_1 = 0;
                break L3;
              } else {
                stackIn_11_0 = this;
                stackIn_11_1 = 1;
                break L3;
              }
            }
            ((kk) (this)).field_c = stackIn_11_1 != 0;
            this.field_b = param0;
            return this.field_l[0];
          }
        } else {
          L4: {
            stackIn_5_0 = this;

            if (null != this.field_m[param0]) {
              stackIn_6_0 = this;
              stackIn_6_1 = 0;
              break L4;
            } else {
              stackIn_6_0 = this;
              stackIn_6_1 = 1;
              break L4;
            }
          }
          ((kk) (this)).field_c = stackIn_6_1 != 0;
          this.field_m[param0] = mn.field_v;
          return this.field_l[param0];
        }
    }

    final static byte[] a(int param0, byte param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3 = null;
        Random var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var9 = Vertigo2.field_L ? 1 : 0;
        km var2 = (km) ((Object) bj.field_c.a((long)param0, false));
        if (var2 == null) {
            var11 = new byte[512];
            var10 = var11;
            var3 = var10;
            var4 = new Random((long)param0);
            for (var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte)var5;
            }
            for (var5 = 0; var5 < 255; var5++) {
                var6 = -var5 + 255;
                var7 = mj.a(-116, var4, var6);
                var8 = var11[var7];
                var3[var7] = var11[var6];
                var3[511 + -var5] = (byte) var8;
                var3[var6] = (byte) var8;
            }
            var2 = new km(var11);
            bj.field_c.a(-1, var2, (long)param0);
        }
        if (param1 != 38) {
            kk.a((byte) 22);
        }
        return var2.field_t;
    }

    public static void a(boolean param0) {
        if (!param0) {
            kk.b((byte) -122);
        }
        field_f = null;
        field_e = null;
        field_h = null;
        field_a = null;
    }

    final static void a(byte param0) {
        id.field_a = gk.a(53);
        if (param0 != 43) {
            kk.a(-94, (byte) -26);
        }
        nj.field_d = 0;
    }

    final int[][][] a(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (!(this.field_k == this.field_g)) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = param0; this.field_g > var2; var2++) {
            this.field_m[var2] = mn.field_v;
        }
        return this.field_l;
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.length;
              var3 = new byte[var2_int];
              qq.a(param0, 0, var3, 0, var2_int);
              if (param1 == 103) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("kk.H(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(byte param0) {
        il.field_a = true;
        if (param0 <= 78) {
            kk.a(117, (byte) 117);
        }
        field_a = null;
        gk.field_c = null;
        if (!(null == ha.field_a)) {
            dj.field_d = ha.field_a;
            ui.field_b = gj.field_z;
            dj.field_d.field_B = -1;
            dj.field_d.field_H = -1;
            gj.field_z = null;
            ha.field_a = null;
        }
        gg.field_o = null;
        hb.field_j = null;
        oa.field_s = null;
    }

    kk(int param0, int param1, int param2) {
        this.field_b = -1;
        this.field_d = 0;
        this.field_i = new nj();
        this.field_c = false;
        this.field_g = param0;
        this.field_k = param1;
        this.field_l = new int[this.field_g][3][param2];
        this.field_m = new mn[this.field_k];
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        for (var2 = 0; this.field_g > var2; var2++) {
            this.field_l[var2][0] = null;
            this.field_l[var2][1] = null;
            this.field_l[var2][2] = null;
            this.field_l[var2] = (int[][]) null;
        }
        this.field_l = (int[][][]) null;
        if (param0 != 32764) {
            return;
        }
        this.field_m = null;
        this.field_i.c(0);
        this.field_i = null;
    }

    static {
        field_e = new ve(7, 0, 1, 1);
        field_h = "You need to play <%0> more rated games to unlock this option.";
    }
}
