/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class df extends ng {
    static int field_Q;
    static int field_R;
    private String[] field_U;
    private sl field_T;
    private ia field_S;
    static boolean field_O;
    static String field_P;

    void a(ee param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 >= -97) {
            field_O = false;
          }
          super.a(param0, param1, (byte) -105, param3);
          this.field_S = null;
          if (this.field_w) {
            var5_int = -this.field_m + kc.field_u - param1;
            var6 = -this.field_i + (ph.field_d - param3);
            this.field_S = this.b(var6, var5_int, 59);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("df.U(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -this.field_m + param2;
        int var6 = -this.field_i + param0;
        ia var7 = this.b(var6, var5, 91);
        if (var7 != null &&
          null != this.field_k) {
          ((tl) ((Object) this.field_k)).a(this, var7.field_s, param3, true);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param1 != 2) {
          this.d(false);
        }
        this.a((byte) 122, param3, ((gd) ((Object) this.field_q)).b((ee) (this), (byte) -117), param2, param0);
    }

    void a(int param0, int param1, boolean param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param2) {
          String var9 = (String) null;
          df.a((String) null, '￢', (String) null, (byte) -27);
        }
        if (0 != param3) {
          return;
        }
        gd var10 = (gd) ((Object) this.field_q);
        ia var6 = this.field_S;
        if (var6 != null) {
          var7 = var10.a(param1, (ee) (this), false);
          var8 = var10.a((ee) (this), 3, param0);
          do {
            jc.a((byte) -128, -2 + (var7 + var6.field_r), var6.field_m + 2, var6.field_n + 2, -2 + var6.field_o + var8);
            var6 = var6.field_k;
          } while (var6 != null);
        }
    }

    final static int c(byte param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_22_0 = 0;
          int stackIn_28_0 = 0;
          int stackIn_31_0 = 0;
          int stackIn_36_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          uf var2 = null;
          if (gb.field_d.field_h >= 4) {
            if (gb.field_d.field_b == -1) {
              return 3;
            }
            if (gb.field_d.field_b == -2) {
              return 4;
            }
            return 1;
          }
          try {
            if (nh.field_jb == 0) {
              n.field_cb = rc.field_t.a(wb.field_d, mc.field_o, 431890200);
              nh.field_jb = nh.field_jb + 1;
            }
            if (nh.field_jb == 1) {
              if (n.field_cb.field_d == 2) {
                stackIn_14_0 = je.a(-1, true);
                return stackIn_14_0;
              }
              if (n.field_cb.field_d == 1) {
                nh.field_jb = nh.field_jb + 1;
              }
            }
            if (nh.field_jb == 2) {
              bl.field_V = new wb((java.net.Socket) (n.field_cb.field_g), rc.field_t);
              var2 = new uf(13);
              hl.a(var2, 12, vk.field_j, vf.field_d, vb.field_r);
              var2.d(15, (byte) 122);
              var2.a(mg.field_e, false);
              bl.field_V.a(13, 0, (byte) 120, var2.field_m);
              nh.field_jb = nh.field_jb + 1;
              il.field_m = 30000L + ol.a(256);
            }
            if (param0 != 35) {
              stackIn_22_0 = 21;
              return stackIn_22_0;
            }
            if (nh.field_jb == 3) {
              if (bl.field_V.a(0) > 0) {
                var1_int = bl.field_V.c(0);
                if (var1_int != 0) {
                  stackIn_31_0 = je.a(var1_int, true);
                  return stackIn_31_0;
                }
                nh.field_jb = nh.field_jb + 1;
              } else {
                if (il.field_m < ol.a(256)) {
                  stackIn_28_0 = je.a(-2, true);
                  return stackIn_28_0;
                }
              }
            }
            if (nh.field_jb != 4) {
              return -1;
            }
            gb.field_d.a(md.field_f, bl.field_V, (byte) 115);
            bl.field_V = null;
            nh.field_jb = 0;
            n.field_cb = null;
            stackIn_36_0 = 0;
            return stackIn_36_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return je.a(-3, true);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(String param0, char param1, String param2, byte param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          var4_int = param0.length();
          var5 = param2.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param0.indexOf((int) param1, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          if (param3 < 124) {
            var12 = (CharSequence) null;
            df.a(-50, true, (CharSequence) null);
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param0.indexOf((int) param1, var9);
            if (0 > var10) {
              discarded$3 = var8.append(param0.substring(var9));
              stackIn_12_0 = var8.toString();
              return stackIn_12_0;
            }
            discarded$4 = var8.append(param0.substring(var9, var10));
            var9 = 1 + var10;
            discarded$5 = var8.append(param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("df.G(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    private final ia b(int param0, int param1, int param2) {
        ia var4;
        ia var5;
        int var6;
        var6 = TorChallenge.field_F ? 1 : 0;
        if (param2 <= 46) {
          return (ia) null;
        }
        var4 = (ia) (this.field_T.c((byte) -19));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (var5.field_r <= param1 &&
              param0 >= var5.field_o &&
              param1 < var5.field_n + var5.field_r &&
              var5.field_m + var5.field_o >= param0) {
              return var4;
            }
            var5 = var5.field_k;
          }
          var4 = (ia) (this.field_T.c(-270));
        }
        return null;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a((byte) 104, param1, param2, param3, param4);
        if (param0 < 100) {
          return;
        }
        this.d(false);
    }

    boolean a(ee param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("df.RA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    df(String param0, j param1) {
        super(param0, (gg) null);
        this.field_S = null;
        try {
          this.field_q = param1;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "df.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != -2184) {
            field_R = -55;
          }
          var3 = ug.a(param2, param1, -107);
          if (var3 != null) {
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          var4 = 0;
          while (true) {
            if (var4 >= param2.length()) {
              return null;
            }
            if (bc.a(param0 ^ -2283, param2.charAt(var4))) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_11_0 = ed.field_h;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("df.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void d(boolean param0) {
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        gd var3;
        lg var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        qi var12;
        int var13;
        int var14;
        ia var15;
        int var16;
        int var7Lifetime1;
        var16 = TorChallenge.field_F ? 1 : 0;
        this.field_T = new sl();
        if (param0) {
          field_P = (String) null;
        }
        var2 = 0;
        var3 = (gd) ((Object) this.field_q);
        var4 = var3.a(-97, (ee) (this));
        while (true) {
          var5 = this.field_v.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.field_v.indexOf(">", var5);
          var6 = this.field_v.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_v.indexOf("</hotspot>", var5);
          var8 = var4.a((byte) 7, var5);
          var9 = var4.a((byte) 7, var2);
          var10 = null;
          for (var11 = var8; var9 >= var11; var11++) {
            var12 = var4.field_a[var11];
            if (var8 == var11) {
              stackIn_9_0 = var4.a(-117, var5);
            } else {
              stackIn_9_0 = var12.field_g[0];
            }
            var13 = stackIn_9_0;
            if (var9 != var11) {
              if (var12 == null) {
                stackIn_14_0 = 0;
              } else {
                stackIn_14_0 = var12.field_g[var12.field_g.length - 1];
              }
            } else {
              stackIn_14_0 = var4.a(-120, var2);
            }
            var14 = stackIn_14_0;
            var15 = new ia(var7Lifetime1, var13, var12.field_d, -var13 + var14, Math.max(var3.a(-1), var12.field_e - var12.field_d));
            if (var10 != null) {
              ((ia) (var10)).field_k = var15;
            }
            this.field_T.a(var15, -63);
            var10 = var15;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          return;
        }
        field_P = null;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (!bk.a(param0, param2, (byte) -125)) {
            return false;
          }
          var3_int = param1;
          while (true) {
            if (var3_int >= param0.length()) {
              return true;
            }
            if (bc.a(105, param0.charAt(var3_int))) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("df.I(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    String b(boolean param0) {
        if (null == this.field_S) {
          return null;
        }
        if (null == this.field_U) {
          return null;
        }
        if (param0) {
          this.b(94, 108, -21, -91);
        }
        if (this.field_U.length <= this.field_S.field_s) {
          return null;
        }
        return this.field_U[this.field_S.field_s];
    }

    final void a(int param0, boolean param1, String param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          if (null == this.field_U ||
            param0 >= this.field_U.length) {
            var7 = new String[1 + param0];
            var8 = var7;
            var4 = var8;
            if (null != this.field_U) {
              for (var5 = 0; var5 < this.field_U.length; var5++) {
                var7[var5] = this.field_U[var5];
              }
            }
            this.field_U = var8;
          }
          if (param1) {
            return;
          }
          this.field_U[param0] = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("df.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_O = false;
        field_Q = 0;
        field_P = "Your character will only collect a health potion when he/she is injured.";
    }
}
