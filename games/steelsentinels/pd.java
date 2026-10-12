/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends dl implements ae {
    static int field_V;
    static String field_R;
    static wk[] field_Q;
    static boolean[] field_U;
    private oa field_W;
    static int[] field_S;
    static wk[] field_T;
    static String field_ab;
    private oa field_Y;
    private oa field_P;
    static int field_X;
    static wk[] field_Z;

    public static void i(int param0) {
        field_S = null;
        field_ab = null;
        field_Z = null;
        if (param0 != -48) {
          CharSequence var2 = (CharSequence) null;
          pd.a(115, (CharSequence) null);
        }
        field_R = null;
        field_U = null;
        field_T = null;
        field_Q = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 >= -99) {
          return;
        }
        int var5 = this.field_o + param2;
        int var6 = param0 + this.field_z;
        tj.field_e.a(qj.field_j, var5 + 20, var6 + 20, -40 + this.field_x, -50 + this.field_E, 16777215, -1, 1, 0, tj.field_e.field_G);
        super.a(param0, (byte) -106, param2, param3);
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = SteelSentinels.field_G;
        try {
          var6_int = 70 % ((param1 + 85) / 36);
          if (this.field_Y == param3) {
            il.a(125);
          } else {
            if (param3 != this.field_P) {
              if (this.field_W == param3) {
                qg.a((byte) -26);
              }
            } else {
              nj.h((byte) 45);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("pd.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void j(int param0) {
        ib.field_b = 0;
        ba.b(false);
        if (param0 != 13171) {
          pd.j(39);
        }
    }

    public pd() {
        super(0, 0, 476, 225, (qk) null);
        this.field_P = new oa(tk.field_n, (tn) null);
        this.field_Y = new oa(hg.field_f, (tn) null);
        this.field_W = new oa(lj.field_c, (tn) null);
        kh var1 = new kh();
        this.field_P.field_p = (qk) ((Object) var1);
        this.field_Y.field_p = (qk) ((Object) var1);
        this.field_W.field_p = (qk) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_Y.a(this.field_x - var3 >> 1, (byte) -108, -var2 + (this.field_E - 48), var4, 30);
        this.field_W.a((-var3 + this.field_x >> 1) + var4 + var2, (byte) -78, -48 + this.field_E - var2, var4, 30);
        this.field_P.a(this.field_x - var3 >> 1, (byte) -100, -(var2 * 2) + (this.field_E - 78), var3, 30);
        this.field_Y.field_A = (tn) (this);
        this.field_P.field_A = (tn) (this);
        this.field_P.field_v = r.field_m;
        this.field_W.field_A = (tn) (this);
        this.field_W.field_v = rg.field_g;
        this.a(this.field_Y, -120);
        this.a(this.field_P, -89);
        this.a(this.field_W, -100);
    }

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = SteelSentinels.field_G;
        try {
          if (param0 > -45) {
            field_T = (wk[]) null;
          }
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(97 + var5 - 65);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (48 > var5 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var8);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("pd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.field_G;
        try {
          var3_int = 0;
          if (param0 != 2019550017) {
            pd.j(42);
          }
          var4 = param1.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param1.charAt(var5) == param2) {
              var3_int++;
            }
          }
          stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("pd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.b(param3, 121);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.b(-11963, param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pd.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_V = 49;
        field_ab = "<%0>'s game";
        field_R = "This password contains your Player Name, and would be easy to guess";
        field_X = 0;
    }
}
