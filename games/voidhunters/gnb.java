/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gnb {
    static String field_f;
    private int field_d;
    private int field_g;
    private ksa field_b;
    private ksa field_e;
    static int field_a;
    private ksa[] field_c;

    final ksa b(int param0) {
        int fieldTemp$0 = 0;
        ksa var2;
        int var3;
        var3 = VoidHunters.field_G;
        if (param0 > -42) {
          this.field_b = (ksa) null;
        }
        if (this.field_g > 0 &&
          this.field_e != this.field_c[this.field_g - 1]) {
          var2 = this.field_e;
          this.field_e = var2.field_c;
          return var2;
        }
        do {
          if (this.field_g >= this.field_d) {
            return null;
          }
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          var2 = this.field_c[fieldTemp$0].field_c;
        } while (this.field_c[-1 + this.field_g] == var2);
        this.field_e = var2.field_c;
        return var2;
    }

    final void a(long param0, ksa param1, byte param2) {
        ksa var5 = null;
        if (null != param1.field_a) {
          param1.b(-3846);
        }
        if (param2 >= -112) {
          return;
        }
        try {
          var5 = this.field_c[(int)(param0 & (long)(-1 + this.field_d))];
          param1.field_c = var5;
          param1.field_a = var5.field_a;
          param1.field_a.field_c = param1;
          param1.field_c.field_a = param1;
          param1.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gnb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(Random param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var2_int = hob.a(param0, oea.field_o, 120);
          for (var3 = 0; 56 > var3; var3++) {
            if (tr.a(108, var3)) {
              if (0 == var2_int) {
                stackIn_7_0 = var3;
                return stackIn_7_0;
              }
              var2_int--;
            }
          }
          if (param1 > 52) {
            throw new IllegalStateException("No asteroid type found. number_of_asteroids=" + oea.field_o);
          }
          stackIn_12_0 = 14;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("gnb.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ibb a(int param0, ue[] param1, jp param2) {
        Object stackIn_7_0 = null;
        Object stackIn_24_0 = null;
        ibb stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        int var5Lifetime1;
        var6 = VoidHunters.field_G;
        try {
          var3_int = 0;
          while (var3_int < param1.length) {
            if (param1[var3_int] == null) {
              return null;
            }
            if (0L < param1[var3_int].field_d) {
              var3_int++;
              continue;
            }
            stackIn_7_0 = null;
            return (ibb) (stackIn_7_0);
          }
          var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
          for (var5 = 0; var5 < param1.length; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3_long, param1[var5].field_d);
          }
          jaggl.OpenGL.glLinkProgramARB(var3_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, hg.field_a, 0);
          if (0 == hg.field_a[param0]) {
            if (0 == hg.field_a[0]) {
              System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, hg.field_a, 1);
            if (hg.field_a[1] > 1) {
              var11 = new byte[hg.field_a[1]];
              jaggl.OpenGL.glGetInfoLogARB(var3_long, hg.field_a[1], hg.field_a, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (0 == hg.field_a[0]) {
              var7 = 0;
              var5Lifetime1 = var7;
              while (var7 < param1.length) {
                jaggl.OpenGL.glDetachObjectARB(var3_long, param1[var7].field_d);
                var7++;
              }
              jaggl.OpenGL.glDeleteObjectARB(var3_long);
              stackIn_24_0 = null;
              return (ibb) (stackIn_24_0);
            }
          }
          stackIn_26_0 = new ibb(param2, var3_long, param1);
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("gnb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final ksa a(long param0, int param1) {
        ksa var5 = null;
        int var6 = VoidHunters.field_G;
        if (param1 <= 96) {
          field_f = (String) null;
        }
        ksa var4 = this.field_c[(int)(param0 & (long)(this.field_d - 1))];
        this.field_b = var4.field_c;
        while (var4 != this.field_b) {
          if (this.field_b.field_b == param0) {
            var5 = this.field_b;
            this.field_b = this.field_b.field_c;
            return var5;
          }
          this.field_b = this.field_b.field_c;
        }
        this.field_b = null;
        return null;
    }

    final void a(byte param0) {
        int var2 = 0;
        ksa var3 = null;
        ksa var4 = null;
        int var5 = VoidHunters.field_G;
        if (param0 != -103) {
          this.a((byte) -13);
        }
        for (var2 = 0; var2 < this.field_d; var2++) {
          var3 = this.field_c[var2];
          while (true) {
            var4 = var3.field_c;
            if (var3 == var4) {
              break;
            }
            var4.b(-3846);
          }
        }
        this.field_b = null;
        this.field_e = null;
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 < 17) {
          field_a = -8;
        }
    }

    final static void a(int param0) {
        if (!cgb.field_a) {
          throw new IllegalStateException();
        }
        djb.field_r = true;
        aka.a(true, param0 ^ -125);
        qmb.field_q = param0;
    }

    gnb(int param0) {
        int var2 = 0;
        ksa dupTemp$0 = null;
        ksa var3 = null;
        this.field_g = 0;
        this.field_d = param0;
        this.field_c = new ksa[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new ksa();
          var3 = dupTemp$0;
          this.field_c[var2] = dupTemp$0;
          var3.field_c = var3;
          var3.field_a = var3;
        }
    }

    final ksa c(byte param0) {
        this.field_g = 0;
        int var2 = -14 % ((85 - param0) / 35);
        return this.b(-58);
    }

    static {
        field_a = 92;
        field_f = "This password contains your email address, and would be easy to guess";
    }
}
