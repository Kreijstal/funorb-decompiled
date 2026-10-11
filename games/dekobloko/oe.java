/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class oe extends ce implements ra {
    ce[] field_K;
    static vj field_I;
    static String[] field_M;
    static boolean[] field_L;
    static int[] field_J;
    static int field_H;
    static int field_G;

    final int d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ce[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ce var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          var2_int = 0;
          var3 = this.field_K;
          var4 = 22 % ((36 - param0) / 51);
          var5 = 0;
          while (var5 < var3.length) {
            var6 = var3[var5];
            if (var6 != null) {
              var7 = var6.d(-30);
              if (var2_int < var7) {
                var2_int = var7;
              }
            }
            var5++;
            if (var8 == 0) {
              continue;
            }
            break;
          }
          stackIn_8_0 = var2_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "oe.DC(" + param0 + ')');
        }
    }

    oe(int param0, int param1, int param2, int param3, gl param4) {
        super(param0, param1, param2, param3, param4, (kg) null);
    }

    final boolean a(boolean param0, ce param1) {
        ce[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ce var5 = null;
        int var6 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          var3 = this.field_K;
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3.length <= var4))) {
            var5 = var3[var4];
            if (var6 == 0) {
              if (null != var5 &&
                var5.a(false, param1)) {
                return true;
              }
              var4++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (param0)) {
            this.field_K = (ce[]) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("oe.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final boolean a(ce param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ce var5 = null;
        ce var6 = null;
        int var7 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          if (null == this.field_K) {
            return false;
          }
          var4_int = this.field_K.length - 1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4_int < 0))) {
            var5 = this.field_K[var4_int];
            if (var7 == 0) {
              if (var5 != null &&
                var5.a(true)) {
                var4_int = var4_int - param1;
                while (var4_int >= 0) {
                  var6 = this.field_K[var4_int];
                  if (null != var6 &&
                    var6.a(false, param0)) {
                    return true;
                  }
                  var4_int = var4_int - param1;
                }
              }
              var4_int--;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (param2 != 0)) {
            oe.a(-94, -2, 108, 7, 101, 46, -99);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("oe.P(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ce[] var5 = null;
        int var6 = 0;
        ce var7 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          super.a(param0, 102, param2, param3);
          if (this.field_K == null) {
            return;
          }
          if (param1 <= 38) {
            return;
          }
          var5 = this.field_K;
          var6 = 0;
          while (var5.length > var6) {
            var7 = var5[var6];
            if (var8 != 0) {
              return;
            }
            if (var7 != null) {
              var7.a(param0, 109, param2 + this.field_D, this.field_u + param3);
            }
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_19_0 = runtimeException;
          stackIn_19_1 = new StringBuilder().append("oe.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = client.field_A ? 1 : 0;
        try {
          if (param0 == 0) {
            param0 = 1;
          }
          var7_int = 0;
          var8 = 65536 / param0;
          if (param3 != -1) {
            field_H = -1;
          }
          if (param6 < hk.field_h) {
            var7_int = var7_int + var8 * (hk.field_h - param6);
            param1 = param1 - (hk.field_h - param6);
            param6 = hk.field_h;
          }
          if (hk.field_c > param5) {
            param0 = param0 - (hk.field_c - param5);
            param5 = hk.field_c;
          }
          if (hk.field_b < param1 + param6) {
            param1 = hk.field_b - param6;
          }
          if (hk.field_g < param5 + param0) {
            param0 = hk.field_g - param5;
          }
          var9 = param5 + hk.field_j * (param6 + param1);
          var10 = -param0;
          while (0 > var10) {
            var11 = -var7_int + 65536 >> 8;
            var12 = var7_int >> 8;
            var13 = (var11 * (param4 & 16711935) + var12 * (param2 & 16711935) & -16711936) + (16711680 & var12 * (65280 & param2) + (65280 & param4) * var11) >>> 8;
            if (var15 != 0) {
              return;
            }
            var14 = -param1;
            while (0 > var14) {
              hk.field_l[hk.field_j * var14 + var9] = var13;
              var14++;
            }
            var9++;
            var7_int = var7_int + var8;
            var10++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var7), "oe.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void b(boolean param0) {
        field_M = null;
        field_I = null;
        field_L = null;
        if (!param0) {
          return;
        }
        try {
          field_J = null;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "oe.N(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        ce[] var7 = null;
        int var8 = 0;
        ce var9 = null;
        int var10 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = client.field_A ? 1 : 0;
        try {
          if (null == this.field_K) {
            return;
          }
          var7 = this.field_K;
          if (param1 != 64) {
            this.a((ce) null, -80, 51, 84);
          }
          var8 = 0;
          while (var7.length > var8) {
            var9 = var7[var8];
            if (var10 != 0) {
              return;
            }
            if (null != var9) {
              var9.a(param0, param1 + 0, this.field_u + param2, param3, param4 + this.field_D, param5);
            }
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_20_0 = runtimeException;
          stackIn_20_1 = new StringBuilder().append("oe.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        RuntimeException runtimeException = null;
        ce[] var5 = null;
        int var6 = 0;
        ce var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = client.field_A ? 1 : 0;
        try {
          if (null == this.field_K) {
            return;
          }
          var5 = this.field_K;
          var6 = 0;
          L0: while (true) {
            if (var5.length > var6) {
              var7 = var5[var6];
              discarded$4 = param0.append('\n');
              stackIn_20_0 = 0;
              if (var9 != 0) {
                break L0;
              }
              var8 = stackIn_20_0;
              while (true) {
                if (var8 <= param1) {
                  discarded$5 = param0.append(' ');
                  var8++;
                  continue;
                }
                if (var7 == null) {
                  discarded$6 = param0.append("null");
                } else {
                  var7.a(param3, param1 + 1, param0, true);
                }
                break;
              }
              var6++;
              continue L0;
            }
            stackIn_20_0 = param2;
            break;
          }
          if (stackIn_20_0 != 3370) {
            this.a(85, -91, (ce) null, '￬');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_27_0 = runtimeException;
          stackIn_27_1 = new StringBuilder().append("oe.M(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_7_0 = (null != this.a(-98));
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "oe.TB(" + param0 + ')');
        }
    }

    final static jc a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        jc stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          var2_int = param1.length();
          if (param0 <= 64) {
            oe.c(true);
          }
          var3 = 0;
          while (var3 < var2_int) {
            var4 = param1.charAt(var3);
            if (var4 >= 48 &&
              57 >= var4) {
              var3++;
              if (var5 == 0) {
                continue;
              }
            } else {
              stackIn_11_0 = null;
              return (jc) (stackIn_11_0);
            }
            break;
          }
          stackIn_14_0 = be.field_x;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("oe.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void d(byte param0) {
        RuntimeException runtimeException = null;
        ce[] var2 = null;
        int var3 = 0;
        ce var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          var2 = this.field_K;
          var3 = 0;
          while (var3 < var2.length) {
            var4 = var2[var3];
            if (var5 != 0) {
              return;
            }
            if (var4 != null) {
              var4.d((byte) -95);
            }
            var3++;
          }
          if (param0 != -95) {
            oe.a('ﾤ', -111);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) runtimeException), "oe.WB(" + param0 + ')');
        }
    }

    final static void c(boolean param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_57_0 = false;
        int stackIn_64_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_56_0;
        uf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        wb var6 = null;
        wb var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        String var5Lifetime1;
        wb var6Lifetime1;
        var9 = client.field_A ? 1 : 0;
        try {
          if (param0) {
            return;
          }
          var1 = de.field_V;
          var2 = var1.d((byte) -25);
          if (var2 == 0) {
            if (null == hg.field_e) {
              hg.field_e = new nk(128);
              ed.field_g = 0;
            }
            stackIn_13_0 = (var1.d((byte) -111) != 1) ? 0 : 1;
            var3_int = stackIn_13_0;
            var4_ref_String = var1.c((byte) -38);
            if (var3_int != 0) {
              var5 = var1.c((byte) -38);
            }
            if (var3_int == 0 ||
              var9 != 0) {
              var5 = var4_ref_String;
            }
            var6 = g.a(-3805, var4_ref_String);
            var7_ref = var1.c((byte) -38);
            var8 = kf.a((CharSequence) ((Object) var4_ref_String), (byte) 2);
            if (null == var8) {
              var8 = var4_ref_String;
            }
            if (null == var6) {
              var6 = g.a(-3805, var7_ref);
              if (null != var6) {
                hg.field_e.a(var6, -1, (long)var8.hashCode());
              }
            }
            if (var6 == null) {
              var6 = new wb();
              hg.field_e.a(var6, -1, (long)var8.hashCode());
              fieldTemp$1 = ed.field_g;
              ed.field_g = ed.field_g + 1;
              var6.field_Xb = fieldTemp$1;
              uf.field_z.a(var6, 2777);
            }
            var6.field_Pb = var5;
            var6.field_Ob = var4_ref_String;
            var6.field_Tb = var7_ref;
            return;
          }
          if (1 != var2) {
            if (2 == var2) {
              if (1 == jj.field_b) {
                jj.field_b = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (jj.field_b == 2) {
                jj.field_b = 1;
              }
              return;
            }
            if (4 != var2) {
              qb.a((Throwable) null, 16408, "F1: " + qk.d((byte) 17));
              si.a(100);
              return;
            }
            jj.field_b = 1;
            var3 = var1.c((byte) -38);
            f.field_w = ((String) (var3)).intern();
            var4 = var1.d((byte) -125);
            nh.a((byte) 12, var4);
            return;
          }
          if (mc.field_a == null) {
            mc.field_a = new nk(128);
            md.field_Z = 0;
          }
          var3Lifetime1 = var1.c((byte) -38);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.c((byte) -38);
          var5Lifetime1 = var1.c((byte) -38);
          var6Lifetime1 = ed.a(var4_ref_StringLifetime1, (byte) -109);
          if (null == var6Lifetime1) {
            var6Lifetime1 = ed.a(var5Lifetime1, (byte) 71);
            if (null != var6Lifetime1) {
              mc.field_a.a(var6Lifetime1, -1, (long)kf.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 2).hashCode());
            }
          }
          if (var6Lifetime1 == null) {
            var6Lifetime1 = new wb();
            mc.field_a.a(var6Lifetime1, -1, (long)kf.a((CharSequence) ((Object) var4_ref_StringLifetime1), (byte) 2).hashCode());
            fieldTemp$0 = md.field_Z;
            md.field_Z = md.field_Z + 1;
            var6Lifetime1.field_Xb = fieldTemp$0;
            qi.field_S.a(var6Lifetime1, 2777);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6Lifetime1.field_Vb = (String) (var3Lifetime1);
          var6Lifetime1.field_Ob = var4_ref_StringLifetime1;
          var6Lifetime1.field_Tb = var5Lifetime1;
          var6Lifetime1.b((byte) 125);
          var7 = (wb) (qi.field_S.c((byte) 18));
          L9: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7 != null) {
              stackOut_56_0 = pn.a(var7, var6Lifetime1, false);
              stackIn_64_0 = stackOut_56_0 ? 1 : 0;
              stackIn_57_0 = stackOut_56_0;
              decompiledFrameRemainder0 = (var9 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_57_0)) {
                var7 = (wb) (qi.field_S.d(true));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null == var7) {
                break L9;
              }
              stackIn_64_0 = 121;
            }
            fm.$cfr$intArgs$a$a7487eb591c0(stackIn_64_0, var6Lifetime1, var7);
            if (var9 == 0) {
              return;
            }
            break;
          }
          qi.field_S.a(var6Lifetime1, 2777);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1_ref), "oe.S(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        ce var6 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          if (0 == param2 &&
            null != this.field_p) {
            this.field_p.a(true, param0, param3, (byte) -62, (ce) (this));
          }
          if (null != this.field_K) {
            var5_int = -1 + this.field_K.length;
            while (var5_int >= 0) {
              var6 = this.field_K[var5_int];
              if (var7 != 0) {
                return;
              }
              if (var6 != null) {
                var6.a(this.field_u + param0, -109, param2, param3 + this.field_D);
              }
              var5_int--;
            }
          }
          if (param1 >= -103) {
            this.b(36, 0, -79, -102, 25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var5), "oe.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        ce[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ce var10 = null;
        int var11 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = client.field_A ? 1 : 0;
        try {
          if (this.field_K == null) {
            return false;
          }
          var8 = this.field_K;
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var9 >= var8.length))) {
            var10 = var8[var9];
            if (var11 == 0) {
              if (var10 != null &&
                var10.a(param0, param1, param2, param3, param4 + this.field_D, this.field_u + param5, (byte) -55)) {
                return true;
              }
              var9++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (param6 != -55)) {
            field_H = -1;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_26_0 = var8_ref;
          stackIn_26_1 = new StringBuilder().append("oe.LB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean b(ce param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ce var5 = null;
        ce var6 = null;
        int var7 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = client.field_A ? 1 : 0;
        try {
          if (null == this.field_K) {
            return false;
          }
          if (param2 >= -127) {
            field_M = (String[]) null;
          }
          var4_int = 0;
          while (var4_int < this.field_K.length) {
            boolean decompiledFrameCompleted0 = true;
            var5 = this.field_K[var4_int];
            if (var5 != null &&
              var5.a(true)) {
              var4_int = var4_int + param1;
              while (var4_int < this.field_K.length) {
                var6 = this.field_K[var4_int];
                if (var7 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (null != var6 &&
                  var6.a(false, param0)) {
                  return true;
                }
                var4_int = var4_int + param1;
              }
            }
            if (decompiledFrameCompleted0) {
              var4_int++;
            }
            if (var7 == 0) {
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_34_0 = var4;
          stackIn_34_1 = new StringBuilder().append("oe.O(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(0, param1, param0, param2)) {
            this.a((byte) 72, param2, param0, param1);
            this.a(param2, param1, 3370, param0);
          }
          if (param3) {
            stackIn_8_0 = (StringBuilder) (param2);
            return stackIn_8_0;
          }
          stackIn_6_0 = (StringBuilder) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("oe.MB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean b(ce param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.field_K = (ce[]) null;
          }
          stackIn_4_0 = this.b(param0, 1, param1 ^ -128);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("oe.T(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final ce a(int param0) {
        ce[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        ce var5 = null;
        int var6 = 0;
        Object stackIn_5_0 = null;
        ce stackIn_18_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          if (this.field_K == null) {
            stackIn_5_0 = null;
            return (ce) (stackIn_5_0);
          }
          var3 = 36 % ((param0 - 6) / 63);
          var2 = this.field_K;
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= var2.length))) {
            var5 = var2[var4];
            stackIn_21_0 = null;
            if (var6 == 0) {
              if (stackIn_21_0 != var5 &&
                var5.a(true)) {
                stackIn_18_0 = var5;
                return stackIn_18_0;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_21_0 = null;
          }
          return (ce) (stackIn_21_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "oe.J(" + param0 + ')');
        }
    }

    final static int b(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          param1--;
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          if (param0 != -10498) {
            oe.a('ﾏ', -43);
          }
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          stackIn_4_0 = param1 + 1;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "oe.L(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char stackIn_15_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        char stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_14_0;
        char stackOut_25_0;
        RuntimeException var2_ref = null;
        int var4Lifetime1;
        int stackIn_24_0Lifetime1;
        int stackIn_24_1Lifetime1;
        char stackIn_26_0Lifetime1;
        char stackOut_25_0Lifetime1;
        int var4Lifetime2;
        var5 = client.field_A ? 1 : 0;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (j.a(-8241, param0)) {
            return true;
          }
          var2 = sc.field_o;
          if (param1 != -6237) {
            oe.a(35, -84, -82, 125, 125, -43, -29);
          }
          var3 = 0;
          L2: while (true) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (var2.length > var3) {
              var4 = var2[var3];
              stackOut_14_0 = param0;
              stackIn_24_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              stackIn_24_1 = var4;
              if (var5 != 0) {
                if (stackIn_24_0 < stackIn_24_1) {
                  var4Lifetime2 = var2[var3];
                  stackOut_25_0 = param0;
                  stackIn_33_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  break L2;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_15_0 == stackIn_24_1) {
                  return true;
                }
                var3++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              var2 = oh.field_f;
              var3 = 0;
              while (true) {
                stackIn_24_0Lifetime1 = ~var2.length;
                stackIn_24_1Lifetime1 = ~var3;
                if (stackIn_24_0Lifetime1 >= stackIn_24_1Lifetime1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var4Lifetime1 = var2[var3];
                stackOut_25_0Lifetime1 = param0;
                stackIn_33_0 = stackOut_25_0Lifetime1;
                stackIn_26_0Lifetime1 = stackOut_25_0Lifetime1;
                if (var5 != 0) {
                  break L2;
                }
                if (stackIn_26_0Lifetime1 == var4Lifetime1) {
                  break;
                }
                var3++;
              }
              if (decompiledFrameCompleted0) {
                return true;
              }
            }
            stackIn_33_0 = 0;
            break;
          }
          return stackIn_33_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "oe.K(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        ce[] var6 = null;
        int var7 = 0;
        ce var8 = null;
        int var9 = 0;
        boolean stackIn_29_0 = false;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = client.field_A ? 1 : 0;
        try {
          if (this.field_K == null) {
            return false;
          }
          var5_int = -117 % ((param0 + 22) / 49);
          var6 = this.field_K;
          var7 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6.length <= var7))) {
            var8 = var6[var7];
            if (var9 == 0) {
              if (null != var8 &&
                var8.a(true) &&
                var8.a(98, param1, param2, param3)) {
                return true;
              }
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var5_int = param1;
          }
          if (var5_int != 80) {
            return false;
          }
          if (!bj.field_d[81]) {
            stackIn_29_0 = this.b(param2, 0);
          } else {
            stackIn_29_0 = this.a(param2, 113);
          }
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_35_0 = var5;
          stackIn_35_1 = new StringBuilder().append("oe.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param3).append(')').toString());
        }
    }

    final String c(byte param0) {
        ce[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ce var4 = null;
        String var5 = null;
        int var6 = 0;
        Object stackIn_3_0 = null;
        String stackIn_14_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          if (this.field_K == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2 = this.field_K;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 >= var2.length))) {
            var4 = var2[var3];
            stackIn_20_0 = null;
            if (var6 == 0) {
              if (stackIn_20_0 != var4) {
                var5 = var4.c((byte) 113);
                if (var5 != null) {
                  stackIn_14_0 = var5;
                  return stackIn_14_0;
                }
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            if (param0 != 113) {
              this.field_K = (ce[]) null;
            }
            stackIn_20_0 = null;
          }
          return (String) (stackIn_20_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "oe.R(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        ce[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ce var10 = null;
        int var11 = 0;
        ce stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = client.field_A ? 1 : 0;
        try {
          if (this.field_K == null) {
            return false;
          }
          if (param6) {
            field_G = -21;
          }
          var8 = this.field_K;
          var9 = 0;
          while (var8.length > var9) {
            var10 = var8[var9];
            if (var10 != null) {
              stackIn_15_0 = var10;
              stackIn_16_1 = !(param6);
              if (((ce) (Object) stackIn_15_0).a(stackIn_16_1) &&
                var10.a(param0, param1, param2, param3, param4, param5, false)) {
                return true;
              }
            }
            var9++;
            if (var11 == 0) {
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_28_0 = var8_ref;
          stackIn_28_1 = new StringBuilder().append("oe.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(ce param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 33) {
            stackIn_4_0 = this.a(param0, 1, 0);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("oe.V(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void g(int param0);

    final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          super.b(param0, param1, param2, param3, -16555);
          if (param4 != -16555) {
            oe.b(71, 20);
          }
          this.g(30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var6), "oe.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_M = new String[]{"Showing by rating", "Showing by win percentage"};
        field_I = new vj();
        field_J = new int[8];
    }
}
