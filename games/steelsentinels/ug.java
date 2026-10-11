/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ug extends lh implements lm {
    static int field_Q;
    static String field_K;
    lh field_J;
    static int[] field_H;
    static String field_N;
    static pn field_M;
    static java.applet.Applet field_O;
    static RgbSprite field_P;
    static String field_L;
    static int field_I;

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        SceneWidget var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        na var9 = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          if (an.field_h > wa.field_p) {
            wa.field_p = wa.field_p + 1;
          }
          if (sb.field_bb.field_i != jn.field_c) {
            va.field_b = va.field_b + (-jn.field_c + sb.field_bb.field_i);
            jn.field_c = sb.field_bb.field_i;
          }
          if (param0 <= ~wa.field_p) {
            return;
          }
          nn.a(false);
          qc.field_V.a((byte) 115, param1);
          if (null != ve.field_b) {
            if (fj.field_e) {
              ve.field_b.a((byte) 108, param1, qc.field_V.field_cb, qc.field_V.field_Rb);
            } else {
              ve.field_b = null;
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = ah.field_Yb[var4_int];
            if (var5 != null) {
              if (var5.field_Eb != 0) {
                bl.a(12, var4_int, var5);
              }
              var6 = ei.a(var4_int, 1);
              jk.field_a[var4_int].field_Pb = dh.field_y[var6];
              gb.field_f[var4_int].field_S = ec.field_e[var6];
            }
          }
          if (fm.field_b.field_Eb != 0) {
            FunOrbClient.field_x = new td(fm.field_b.field_Rb, fm.field_b.field_cb, fm.field_b.field_zb, fm.field_b.field_Lb, param2, an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, ParticleEffect.field_K, (String) null, 0L);
          }
          var9 = Sprite.a(param3, da.field_g, 85, db.field_b);
          if (var9 != null) {
            ph.a(var9, -1);
          }
          var8 = lj.a(param0 ^ -2);
          if (var8 == null) {
            return;
          }
          ll.field_i = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ug.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -77, param2, param3, param4);
        this.f(-127);
        if (param1 < -71) {
          return;
        }
        field_L = (String) null;
    }

    private final boolean c(int param0, lh param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            return false;
          }
          stackIn_8_0 = (null != this.field_J) && (!this.field_J.d(0)) && (this.field_J.a(1, param1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ug.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_O = null;
        field_N = null;
        field_L = null;
        field_K = null;
        field_M = null;
        field_H = null;
        field_P = null;
        if (param0 != 475) {
          field_K = (String) null;
          return;
        }
    }

    final void d(byte param0) {
        if (param0 == -45) {
          if (null != this.field_J) {
            this.field_J.d((byte) -45);
          }
          return;
        }
        field_Q = 16;
        if (null != this.field_J) {
          this.field_J.d((byte) -45);
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, lh param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -34) {
            return true;
          }
          stackIn_8_0 = (this.field_J != null) && (this.field_J.d(0)) && (this.field_J.a((byte) -106, param1, param2, param3, param4, param5, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("ug.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean b(int param0, lh param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 4) {
            field_P = (RgbSprite) null;
          }
          stackIn_7_0 = (null != this.field_J) && (!this.field_J.d(param0 - 4)) && (this.field_J.a(1, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ug.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void f(int param0) {
        if (param0 >= -120) {
          return;
        }
        if (null != this.field_J) {
          this.field_J.e((byte) 60);
        }
    }

    final int b(boolean param0) {
        if (param0) {
          return this.field_J == null ? 0 : this.field_J.b(true);
        }
        lh var3 = (lh) null;
        boolean discarded$3 = this.c(-20, (lh) null);
        return this.field_J == null ? 0 : this.field_J.b(true);
    }

    final boolean a(int param0, lh param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            field_O = (java.applet.Applet) null;
          }
          stackIn_6_0 = (this.field_J != null) && (this.field_J.a(param0 + 0, param1));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ug.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param5) {
            return false;
          }
          stackIn_7_0 = (this.field_J != null) && (this.field_J.a(param0, param1, this.field_o + param2, param3, param4 + this.field_z, true, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ug.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    ug(int param0, int param1, int param2, int param3, qk param4, tn param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        try {
          if (this.field_J != null) {
            this.field_J.a((byte) -58, param1, this.field_z + param2, param3 + this.field_o, param4, param5);
          }
          int var7_int = -82 / ((param0 - 36) / 32);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ug.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, 122, param2, param3);
          if (this.field_J != null) {
            this.field_J.a(param0 + this.field_o, 58, param2, this.field_z + param3);
          }
          if (param1 >= 56) {
            return;
          }
          this.field_J = (lh) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ug.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    String e(int param0) {
        String var2 = super.e(param0);
        if (null == this.field_J) {
          return var2;
        }
        String var3 = this.field_J.e(param0 ^ 0);
        if (var3 != null) {
          return var3;
        }
        return var2;
    }

    final boolean d(int param0) {
        if (param0 == 0) {
          return this.a((byte) -2) != null ? true : false;
        }
        StringBuilder var3 = (StringBuilder) null;
        this.a((Hashtable) null, (StringBuilder) null, (byte) -32, 125);
        return this.a((byte) -2) != null ? true : false;
    }

    final void a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$4 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          discarded$3 = param3.append('\n');
          var5_int = 0;
          if (param1 <= 53) {
            return;
          }
          while (param2 >= var5_int) {
            discarded$5 = param3.append(' ');
            var5_int++;
          }
          if (this.field_J != null) {
            this.field_J.a(param0, param3, (byte) -119, 1 + param2);
            return;
          }
          discarded$4 = param3.append("null");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ug.M(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        StringBuilder var6 = null;
        StringBuilder var6Lifetime1;
        StringBuilder var6Lifetime2;
        if (0 != param3) {
          if (param1 >= -99) {
            var6 = (StringBuilder) null;
            this.a((Hashtable) null, (byte) 1, 11, (StringBuilder) null);
            if (null != this.field_J) {
              this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
              return;
            }
            return;
          }
          if (null != this.field_J) {
            this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
            return;
          }
          return;
        }
        if (null == this.field_p) {
          if (param1 >= -99) {
            var6Lifetime1 = (StringBuilder) null;
            this.a((Hashtable) null, (byte) 1, 11, (StringBuilder) null);
            if (null != this.field_J) {
              this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
              return;
            }
            return;
          }
          if (null != this.field_J) {
            this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
            return;
          }
          return;
        }
        this.field_p.a(param2, (lh) (this), (byte) -30, true, param0);
        if (param1 >= -99) {
          var6Lifetime2 = (StringBuilder) null;
          this.a((Hashtable) null, (byte) 1, 11, (StringBuilder) null);
          if (null != this.field_J) {
            this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
            return;
          }
          return;
        }
        if (null != this.field_J) {
          this.field_J.a(this.field_z + param0, (byte) -127, this.field_o + param2, param3);
          return;
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_J != null &&
            this.field_J.d(0) &&
            this.field_J.a(param0 + 0, param1, param2, param3)) {
            return true;
          }
          var5_int = param1;
          if (var5_int != 80) {
            if (param0 == 30373) {
              return false;
            }
            field_O = (java.applet.Applet) null;
            return false;
          }
          if (fc.field_e[81]) {
            stackIn_10_0 = this.b(4, param3);
          } else {
            stackIn_10_0 = this.c(-1, param3);
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ug.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    lh a(byte param0) {
        lh var2 = null;
        lh var2Lifetime1;
        if (param0 != -2) {
          field_M = (pn) null;
          var2 = this.field_J;
          if (var2 == null) {
            return null;
          }
          if (var2.d(param0 ^ -2)) {
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_J;
        if (var2Lifetime1 == null) {
          return null;
        }
        if (var2Lifetime1.d(param0 ^ -2)) {
          return var2Lifetime1;
        }
        return null;
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -104) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param1, (byte) -91, param3, param0)) {
            this.a(param3, param0, false, param1);
            this.a(param0, (byte) 98, param3, param1);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ug.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_H = new int[]{4, -1, -1, 8};
        field_K = "Updates will sent to the email address you've given";
        field_N = "Unable to delete friend - system busy";
        field_L = "Send private message";
    }
}
