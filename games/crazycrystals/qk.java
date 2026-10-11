/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qk extends og implements fd, vd {
    private pc field_C;
    static dl field_H;
    static int[] field_E;
    private pc field_B;
    static int field_F;
    static String field_z;
    private sd field_G;
    nh field_A;
    static int field_D;

    private final void i(int param0) {
        if (!this.e((byte) -32)) {
          return;
        }
        ba.a((byte) -65, this.field_G.field_o);
        if (param0 != -25) {
          this.field_G = (sd) null;
        }
    }

    public qk() {
        super(0, 0, 496, 0, (wo) null);
        this.field_G = new sd("", (bi) null, 12);
        lb var1 = new lb(ba.field_i, 0, 0, 0, 0, 16777215, -1, 3, 0, ai.field_h.field_o, -1, 2147483647, true);
        qm var2 = new qm(gg.field_a, var1, (bi) null);
        this.field_B = new pc(hb.field_i, (bi) null);
        this.field_C = new pc(wa.field_k, (bi) null);
        this.field_G.field_t = ac.field_k;
        this.field_G.a(true, new no(this.field_G));
        this.field_B.field_x = false;
        this.field_B.field_i = (wo) ((Object) new ve());
        this.field_C.field_i = (wo) ((Object) new ok());
        this.field_G.field_i = (wo) ((Object) new wc(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.a(50, 20, var3, 270, (byte) -52);
        int var5 = 200;
        var3 += 50;
        this.b(var2, 12);
        var3 = var3 + (5 + this.a(this.field_G, tb.field_c, var3, 170, fh.field_g, (byte) 122));
        this.field_B.a(40, 496 - var5 >> 1, var3, var5, (byte) -52);
        this.field_C.a(40, var4 + 3, 15 + var3, 60, (byte) -52);
        this.field_C.field_l = (bi) (this);
        this.field_B.field_l = (bi) (this);
        this.b(this.field_B, -126);
        this.b(this.field_C, 4);
        this.field_A = new nh((fd) (this));
        this.field_A.a(150, this.field_G.field_r + this.field_G.field_g + 60, 20, this.field_g - this.field_G.field_r + (-this.field_G.field_g - 60), (byte) -52);
        this.b(this.field_A, -123);
        this.a(var4 + (55 + var3), 0, 0, 496, (byte) -52);
    }

    private final boolean a(lf param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        n var4 = null;
        oi var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 113 % ((-35 - param1) / 36);
          var4 = param0.a(-79);
          if (var4 == null) {
            return true;
          }
          var5 = var4.c((byte) 45);
          stackIn_6_0 = (var5 == ih.field_b);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qk.M(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static db a(int param0, int param1, boolean param2, boolean param3, boolean param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          int var8 = 0;
          ee var9 = null;
          db stackIn_14_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            if (cc.field_a.field_p != null) {
              fj.field_c = new qa(cc.field_a.field_p, 5200, 0);
              cc.field_a.field_p = null;
              var6 = new sp(255, fj.field_c, new qa(cc.field_a.field_g, 12000, 0), 2097152);
            }
            var7 = null;
            var8 = -47 % ((-23 - param1) / 46);
            if (null != fj.field_c) {
              if (null == li.field_d) {
                li.field_d = new qa[cc.field_a.field_n.length];
              }
              if (li.field_d[param0] == null) {
                li.field_d[param0] = new qa(cc.field_a.field_n[param0], 12000, 0);
                cc.field_a.field_n[param0] = null;
              }
              var7 = new sp(param0, fj.field_c, li.field_d[param0], 2097152);
            }
            var9 = ch.field_d.a(64, (sp) (var6), param4, param0, (sp) (var7));
            if (param2) {
              var9.b((byte) 125);
            }
            stackIn_14_0 = new db(var9, param3, param5);
            return stackIn_14_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, String param1, String param2, int param3, qm param4, int param5, int param6) {
        RuntimeException var8 = null;
        io var9 = null;
        int var10 = 0;
        ei var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new ei(20, param0, 120 + param5, 25, param4, false, 120, 3, ai.field_h, 16777215, param2);
          this.b(var11, 29);
          var10 = -20 / ((13 - param3) / 40);
          var9 = new io(((lf) ((Object) param4)).a(-88), param1, 126, var11.field_f + param0, param5 + 25, param6);
          var9.field_l = (bi) (this);
          this.b(var9, 112);
          stackIn_1_0 = var11.field_f + var9.field_f;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("qk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static wj[] a(boolean param0, int param1, db param2, int param3) {
        RuntimeException var4 = null;
        wj[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!gm.a(param2, param3, true, param1)) {
            return null;
          }
          if (param0) {
            field_F = 85;
          }
          stackIn_6_0 = wm.a(-119);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("qk.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == this.field_C) {
            gl.b(-108);
          } else {
            if (this.field_B == param4) {
              this.i(-25);
            }
          }
          var6_int = 79 % ((83 - param0) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("qk.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_7_0 = this.a((byte) -122, param2);
            return stackIn_7_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_11_0 = this.a(param2, param1 - 45190);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("qk.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, int param1, ak param2, hp param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          if (param2 != null &&
            param2.field_l != null &&
            param3 != null &&
            param3.field_k == param2.field_g) {
            var4_int = param3.field_p.length;
            if (param1 < 79) {
              qk.j(-119);
            }
            var5 = param2.field_l[param0].length / var4_int;
            for (var6 = 0; var6 < var5; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (param3.field_i == param2.field_k[param0][var6] &&
                ai.a((byte) 82, param2.field_i[param0][var6])) {
                for (var7 = 0; var4_int > var7; var7++) {
                  if (param3.field_p[var7] != param2.field_l[param0][var6 * var4_int + var7]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_21_0 = var6;
                  return stackIn_21_0;
                }
              }
            }
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("qk.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void j(int param0) {
        field_E = null;
        field_z = null;
        if (param0 != -26005) {
          return;
        }
        field_H = null;
    }

    private final boolean e(byte param0) {
        if (!this.a((lf) (this.field_G), -101)) {
          return false;
        }
        if (param0 != -32) {
          field_F = 13;
          return true;
        }
        return true;
    }

    private final int a(qm param0, String param1, int param2, int param3, String param4, byte param5) {
        RuntimeException var7 = null;
        String var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 <= 104) {
            var8 = (String) null;
            this.a((String) null, 110);
          }
          stackIn_3_0 = this.a(param2, param4, param1, 90, param0, param3, 35);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("qk.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
          super.a(param0, -111, param2, param3);
          this.field_B.field_x = this.e((byte) -32);
          int var5_int = -17 % ((-50 - param1) / 59);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "qk.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(String param0, int param1) {
        sd var3 = null;
        String var4 = null;
        try {
          if (param1 != -23752) {
            qk.a(42, -119, true, false, true, -114);
          }
          var3 = this.field_G;
          var4 = param0;
          ((ga) ((Object) var3)).a(false, -65, var4);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "qk.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0) {
        if (param0 != 20) {
          return;
        }
        ((no) (this.field_G.a(param0 ^ -35))).d(-31626);
    }

    static {
        field_z = "This is a mirror. Mirrors<br><br>- reflect lasers;<br>- deflect bouncy balls.";
        field_E = new int[8192];
        field_F = 40;
        field_D = 0;
    }
}
