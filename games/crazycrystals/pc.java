/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pc extends qm {
    static String field_w;
    static int field_y;
    boolean field_A;
    static pp[] field_u;
    private boolean field_v;
    boolean field_x;
    private boolean field_z;

    final void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        try {
          if (this.field_l != null &&
            this.field_l instanceof i) {
            ((i) (this.field_l)).a(this, param2, param1, false, param0, param3);
          }
          this.field_s = param5;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pc.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            this.field_z = true;
          }
          if (this.field_x &&
            this.a(param1, param0, param3, param4, param6)) {
            this.a(true, param2);
            this.field_s = param5;
            if (this.field_l != null &&
              this.field_l instanceof i) {
              ((i) (this.field_l)).a(param0, (byte) -122, this, param5, param6, param4, param1);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("pc.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 >= -107) {
          field_u = (pp[]) null;
          return this.field_z;
        }
        return this.field_z;
    }

    void a(qm param0, int param1, int param2, int param3) {
        try {
          super.a(param0, 69, param2, param3);
          int var5_int = -17 % ((-50 - param1) / 59);
          if (this.field_s != 0) {
            if (this.field_s == gg.field_c) {
              return;
            }
            if (this.a(bm.field_h, param3, false, param2, qh.field_i) &&
              gg.field_c == 0) {
              this.a(bm.field_h - param2, qh.field_i - param3, -100, this.field_s);
            }
            this.a(bm.field_h, param2, param3, qh.field_i, param0, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pc.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(0, param0, param3, param2)) {
            this.a(param0, (byte) 121, param3, param2);
            if (this.field_A) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_x) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param1 > -85) {
            field_u = (pp[]) null;
          }
          stackIn_10_0 = (StringBuilder) (param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pc.MA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, dl param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dl var21 = null;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = CrazyCrystals.field_B;
        try {
          var6_int = (param2 - param4 << 8) / param3.field_n;
          param5 = param5 + param3.field_v;
          param0 = param0 + param3.field_t;
          var7 = (param4 << 8) + var6_int * param3.field_v;
          var8 = kh.field_l * param0 + param5;
          var9 = 0;
          if (param1 != 617553576) {
            var21 = (dl) null;
            pc.a(-79, 70, -75, (dl) null, 95, -72);
          }
          var10 = param3.field_u;
          var11 = param3.field_l;
          var12 = kh.field_l - var11;
          if (kh.field_b > param0) {
            var14 = -param0 + kh.field_b;
            var9 = var9 + var11 * var14;
            param0 = kh.field_b;
            var8 = var8 + kh.field_l * var14;
            var10 = var10 - var14;
          }
          var13 = 0;
          if (param5 < kh.field_c) {
            var14Lifetime1 = kh.field_c - param5;
            param5 = kh.field_c;
            var8 = var8 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var7 = var7 + var14Lifetime1 * var6_int;
            var12 = var12 + var14Lifetime1;
          }
          if (kh.field_j < var10 + param0) {
            var10 = var10 - (var10 + param0 - kh.field_j);
          }
          if (kh.field_g < param5 + var11) {
            var14Lifetime2 = -kh.field_g + var11 + param5;
            var11 = var11 - var14Lifetime2;
            var12 = var12 + var14Lifetime2;
            var13 = var13 + var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param0 = -var10; param0 < 0; param0++) {
              var14Lifetime3 = var7;
              for (param5 = -var11; param5 < 0; param5++) {
                var15 = var14Lifetime3 >> 8;
                var16 = -var15 + 256;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (0 > var15) {
                  var8++;
                  var9++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param3.field_w[incrementValue$0];
                  if (var17 != 0) {
                    if (255 >= var15) {
                      var18 = kh.field_i[var8];
                      var19 = var16 * (var18 & 16711935) + (var17 & 16711935) * var15 >> 8 & 16711935;
                      kh.field_i[var8] = var19 + (pf.b(var15 * pf.b(65280, var17) + var16 * pf.b(65280, var18), 16711789) >> 8);
                    } else {
                      kh.field_i[var8] = var17;
                    }
                    var8++;
                  } else {
                    var8++;
                  }
                }
              }
              var8 = var8 + var12;
              var9 = var9 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_36_0 = var6;
          stackIn_36_1 = new StringBuilder().append("pc.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        String var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 19279) {
            var6 = (String) null;
            pc.a((String) null, 77);
          }
          if (this.e(param1 ^ -19249) && (param0 == 84 ||
            param0 == 83)) {
            this.a(-1, -1, -87, 1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pc.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    pc(String param0, wo param1, bi param2) {
        super(param0, param1, param2);
        this.field_x = true;
        this.field_v = true;
        this.field_z = false;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (this.field_l != null) {
          if (!(this.field_l instanceof vd)) {
            if (param2 > -75) {
              field_u = (pp[]) null;
              return;
            }
            return;
          }
          ((vd) (this.field_l)).a((byte) -78, param1, param0, param3, this);
        }
        if (param2 <= -75) {
          return;
        }
        field_u = (pp[]) null;
    }

    final void b(byte param0) {
        if (!this.field_z) {
          if (param0 < -84) {
            return;
          }
          this.field_v = false;
          return;
        }
        this.field_z = false;
        if (this.field_l == null) {
          if (param0 < -84) {
            return;
          }
          this.field_v = false;
          return;
        }
        if (!(this.field_l instanceof cq)) {
          if (param0 < -84) {
            return;
          }
          this.field_v = false;
          return;
        }
        ((cq) (this.field_l)).a(this.field_z, (byte) 80, (qm) (this));
        if (param0 < -84) {
          return;
        }
        this.field_v = false;
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = CrazyCrystals.field_B;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          for (var4 = param1; var2_int > var4; var4++) {
            var3[-var4 + (var2_int - 1)] = param0.charAt(var4);
          }
          stackIn_5_0 = new String(var3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("pc.OA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_x) {
            return false;
          }
          if (!this.field_v) {
            return false;
          }
          param1.b((byte) -116);
          stackIn_8_1 = (param0);
          this.field_z = stackIn_8_1;
          if (this.field_l != null &&
            this.field_l instanceof cq) {
            ((cq) (this.field_l)).a(this.field_z, (byte) 80, (qm) (this));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("pc.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_u = null;
        int var1 = -118 % ((param0 - 44) / 55);
        field_w = null;
    }

    pc(String param0, bi param1) {
        this(param0, pi.field_j.field_p, param1);
    }

    protected pc() {
        this.field_x = true;
        this.field_v = true;
        this.field_z = false;
        this.field_i = pi.field_j.field_e;
    }

    static {
    }
}
