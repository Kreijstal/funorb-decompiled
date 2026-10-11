/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gn extends cf {
    private boolean field_H;
    static java.util.zip.CRC32 field_B;
    boolean field_G;
    boolean field_F;
    private boolean field_J;
    static ip field_K;
    static java.math.BigInteger field_L;
    static int[] field_I;
    static String field_D;
    static String field_C;
    static String field_E;

    gn(String param0, nl param1, bj param2) {
        super(param0, param1, param2);
        this.field_J = true;
        this.field_F = true;
        this.field_H = false;
    }

    void a(int param0, cf param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_u != 0 &&
            this.field_u != pq.field_f) {
            if (this.a(92, param2, bd.field_g, bo.field_d, param3) &&
              pq.field_f == 0) {
              this.a((byte) -49, this.field_u, bd.field_g - param2, bo.field_d - param3);
            }
            this.a(bd.field_g, param1, param3, bo.field_d, true, param2);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "gn.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(cf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_F &&
            this.field_J) {
            param0.c((byte) 32);
            this.field_H = true;
            if (null != this.field_A &&
              this.field_A instanceof om) {
              ((om) (this.field_A)).a(this.field_H, true, (cf) (this));
            }
            if (param1 == 0) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("gn.S(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean c(int param0) {
        if (param0 < 123) {
          return true;
        }
        return this.field_H;
    }

    final static boolean b(byte param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() >= rp.field_j &&
            param1.length() <= iq.field_e) {
            if (param0 == 62) {
              return false;
            }
            field_L = (java.math.BigInteger) null;
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("gn.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.c(param3 + 6332) && (param0 == 84 ||
            param0 == 83)) {
            this.a((byte) -49, 1, -1, -1);
            return true;
          }
          if (param3 == -6208) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("gn.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_27_0 = false;
        if (param1 != 16413) {
          return false;
        }
        if (48 > param0) {
          if (param0 < 65) {
            if (param0 >= 97 &&
              param0 <= 122) {
              return true;
            }
            return false;
          }
          if (90 >= param0) {
            return true;
          }
          stackIn_27_0 = (param0 >= 97) && (param0 <= 122);
          return stackIn_27_0;
        }
        if (param0 <= 57) {
          return true;
        }
        if (param0 >= 65 &&
          90 >= param0) {
          return true;
        }
        if (param0 < 97) {
          return false;
        }
        if (param0 > 122) {
          return false;
        }
        return true;
    }

    final static ae a(int param0, ga param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        op stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.d((byte) 69);
          if (param0 != -1) {
            field_D = (String) null;
          }
          var3 = param1.d((byte) 69);
          var4 = param1.g(31365);
          stackIn_3_0 = ak.a(var4, (byte) -94, var2_int, var3);
          return (ae) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gn.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        try {
          if (null != this.field_A &&
            this.field_A instanceof ph) {
            ((ph) (this.field_A)).a(param2, param3, -108, param0, param5, this);
          }
          if (!param4) {
            field_L = (java.math.BigInteger) null;
          }
          this.field_u = 0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "gn.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void c(byte param0) {
        if (param0 != 32) {
          StringBuilder var3 = (StringBuilder) null;
          this.a(114, (Hashtable) null, 36, (StringBuilder) null);
          if (!this.field_H) {
            return;
          }
          this.field_H = false;
          if (null == this.field_A) {
            return;
          }
          if (this.field_A instanceof om) {
            ((om) (this.field_A)).a(this.field_H, true, (cf) (this));
            return;
          }
          return;
        }
        if (!this.field_H) {
          return;
        }
        this.field_H = false;
        if (null == this.field_A) {
          return;
        }
        if (this.field_A instanceof om) {
          ((om) (this.field_A)).a(this.field_H, true, (cf) (this));
          return;
        }
    }

    gn(String param0, bj param1) {
        this(param0, ra.field_o.field_n, param1);
    }

    boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        String var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -24) {
            var9 = (String) null;
            gn.b((byte) -31, (String) null);
          }
          if (!this.field_F) {
            return false;
          }
          if (!this.a(89, param5, param1, param0, param6)) {
            return false;
          }
          this.a(param3, param4 ^ -24);
          this.field_u = param2;
          if (null != this.field_A &&
            this.field_A instanceof ph) {
            ((ph) (this.field_A)).a(param6, param1, param2, this, param5, param4 - 25285, param0);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("gn.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static String a(String param0, int param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        ml var7 = null;
        ml var8 = null;
        ga var9 = null;
        CharSequence var10 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param0);
          if (!em.a(var10, (byte) -38)) {
            stackIn_3_0 = u.field_f;
            return stackIn_3_0;
          }
          if (2 != ge.field_zb) {
            stackIn_6_0 = cf.field_p;
            return stackIn_6_0;
          }
          if (param1 < 70) {
            stackIn_9_0 = (String) null;
            return stackIn_9_0;
          }
          var8 = dn.a(param0, false);
          if (var8 == null) {
            stackIn_13_0 = vl.a(ki.field_i, new String[]{param0}, 2);
            return stackIn_13_0;
          }
          ro.field_M.a((byte) 120, (br) (var8));
          while (true) {
            var7 = (ml) (ro.field_M.b(6));
            if (var7 != null) {
              var7.field_Mb = var7.field_Mb - 1;
              continue;
            }
            break;
          }
          var8.a(true);
          var8.a(-4564);
          dc.field_Fb = dc.field_Fb - 1;
          var9 = ma.field_a;
          var9.b((byte) -35, param2);
          var9.field_j = var9.field_j + 1;
          var5 = var9.field_j;
          var9.a(-93, 1);
          var9.a(param0, (byte) 105);
          var9.e(73, -var5 + var9.field_j);
          stackIn_18_0 = null;
          return (String) (stackIn_18_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("gn.W(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_E = null;
        field_I = null;
        field_C = null;
        field_D = null;
        field_K = null;
        field_B = null;
        field_L = null;
        if (param0 >= -109) {
          field_E = (String) null;
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param0 != -49) {
          field_C = (String) null;
          if (null == this.field_A) {
            return;
          }
          if (this.field_A instanceof in) {
            ((in) (this.field_A)).a(param1, param3, this, -127, param2);
            return;
          }
          return;
        }
        if (null == this.field_A) {
          return;
        }
        if (this.field_A instanceof in) {
          ((in) (this.field_A)).a(param1, param3, this, -127, param2);
          return;
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, 117, param3, param2)) {
            this.a(param2, param3, (byte) 26, param1);
            if (this.field_G) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_F) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param0 != 7) {
            gn.a(',', -13);
          }
          stackIn_8_0 = (StringBuilder) (param3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("gn.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    protected gn() {
        this.field_J = true;
        this.field_F = true;
        this.field_H = false;
        this.field_h = ra.field_o.field_a;
    }

    static {
        field_B = new java.util.zip.CRC32();
        field_K = new ip();
        field_D = "Password: ";
        field_I = new int[32];
        field_C = "Player";
        field_L = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_E = "Flee, zombies, flee!";
    }
}
