/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    private Object[][] field_g;
    private ti field_a;
    private int field_i;
    private ak field_b;
    static int field_e;
    static int[] field_c;
    static int field_f;
    private boolean field_d;
    private Object[] field_h;

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = -78;
            return stackIn_2_0;
          }
          if (!this.b((byte) 99)) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_l.a((byte) 0, ne.a(param1, var4));
          if (this.a((byte) -76, var3_int)) {
            stackIn_11_0 = var3_int;
            return stackIn_11_0;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ue.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(String param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var5 = (String) null;
            this.a((String) null, (String) null, (byte) -41);
          }
          if (!this.a((byte) -76, param2)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_b.field_s[param2].a((byte) 127, ne.a(false, var6));
          if (this.a(var4_int, 117, param2)) {
            return var4_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ue.L(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = StarCannon.field_A;
        if (!this.b((byte) 114)) {
          return false;
        }
        var2 = 1;
        for (var3 = 0; var3 < this.field_b.field_g.length; var3++) {
          var4 = this.field_b.field_g[var3];
          if (this.field_h[var4] == null) {
            this.d(var4, 0);
            if (this.field_h[var4] == null) {
              var2 = 0;
            }
          }
        }
        if (param0 != 29741) {
          this.a(53, (String) (this.field_h[3]));
        }
        return var2 != 0;
    }

    final synchronized int a(int param0, int param1) {
        if (!this.a((byte) -76, param1)) {
          return 0;
        }
        if (null != this.field_h[param1]) {
          return 100;
        }
        if (param0 != 100) {
          this.a((String) (this.field_h[21]), ((boolean[]) (((Object[]) (this.field_h[12]))[31]))[0]);
        }
        return this.field_a.a(param1, true);
    }

    final static String a(long param0, int param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        if (0L >= param0) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        int var3 = 0;
        long var4 = param0;
        while (0L != var4) {
          var4 = var4 / 37L;
          var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (0L != param0) {
          var7 = param0;
          param0 = param0 / 37L;
          var9 = rh.field_j[(int)(var7 - 37L * param0)];
          if (var9 == 95) {
            var10 = var6.length() - 1;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            var9 = 160;
          }
          discarded$0 = var6.append((char) var9);
        }
        if (param1 != 16778) {
          return (String) null;
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 109)) {
            return null;
          }
          param0 = param0.toLowerCase();
          param2 = param2.toLowerCase();
          var7 = (CharSequence) ((Object) param0);
          var4_int = this.field_b.field_l.a((byte) 21, ne.a(false, var7));
          if (!this.a((byte) -76, var4_int)) {
            return null;
          }
          var5 = -85 / ((param1 + 35) / 41);
          var8 = (CharSequence) ((Object) param2);
          var6 = this.field_b.field_s[var4_int].a((byte) -128, ne.a(false, var8));
          stackIn_7_0 = this.a(var4_int, true, var6);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ue.N(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 100)) {
            return false;
          }
          if (param0 != -20955) {
            this.field_i = 24;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_b.field_l.a((byte) -126, ne.a(false, var4));
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ue.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 111)) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          if (param1 < 74) {
            ((byte[]) (this.field_h[3]))[0] = ((byte[]) (((Object[]) (this.field_h[0]))[9]))[13];
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_l.a((byte) -21, ne.a(false, var4));
          stackIn_7_0 = this.a(100, var3_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ue.J(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = StarCannon.field_A;
        if (!this.b((byte) 123)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_h.length > var4; var4++) {
          if (this.field_b.field_i[var4] > 0) {
            var3 = var3 + this.a(100, var4);
            var2 += 100;
          }
        }
        if (var2 == 0) {
          return 100;
        }
        if (param0 <= 37) {
          this.field_i = ((int[]) (((Object[]) (this.field_h[4]))[8]))[1];
        }
        var4Lifetime1 = 100 * var3 / var2;
        return var4Lifetime1;
    }

    final byte[] a(int param0, boolean param1, int param2) {
        if (!param1) {
          return (byte[]) null;
        }
        return this.a((int[]) null, param0, param2, true);
    }

    final synchronized boolean b(byte param0) {
        if (null == this.field_b) {
          this.field_b = this.field_a.b((byte) -84);
          if (this.field_b == null) {
            return false;
          }
          this.field_h = new Object[this.field_b.field_m];
          this.field_g = new Object[this.field_b.field_m][];
        }
        if (param0 <= 87) {
          this.field_a = (ti) null;
          return true;
        }
        return true;
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 92)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param2 != -17) {
            ue.a((ue) null, (byte) 1, -121, ((int[]) (this.field_h[2]))[5], (ue) (this.field_h[0]));
          }
          param1 = param1.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.field_b.field_l.a((byte) -125, ne.a(false, var6));
          if (!this.a((byte) -76, var4_int)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param1);
          var5 = this.field_b.field_s[var4_int].a((byte) 9, ne.a(false, var7));
          stackIn_9_0 = this.a((byte) -93, var4_int, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ue.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean c(int param0, int param1) {
        if (!this.a((byte) -76, param0)) {
          return false;
        }
        if (this.field_h[param0] != null) {
          return true;
        }
        this.d(param0, 0);
        if (param1 > -24) {
          return false;
        }
        if (this.field_h[param0] != null) {
          return true;
        }
        return false;
    }

    public static void b(int param0) {
        if (param0 != 0) {
          field_c = (int[]) null;
        }
        field_c = null;
    }

    private final synchronized void d(int param0, int param1) {
        if (!this.field_d) {
          this.field_h[param0] = d.a(false, (byte) 119, this.field_a.b(param0, false));
        } else {
          this.field_h[param0] = this.field_a.b(param0, false);
        }
        if (param1 != 0) {
          ((int[]) (this.field_h[1]))[5] = 92;
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (param1 <= 106) {
          return false;
        }
        if (!this.b((byte) 94)) {
          return false;
        }
        if (param2 >= 0 &&
          param0 >= 0 &&
          param2 < this.field_b.field_j.length &&
          param0 < this.field_b.field_j[param2]) {
          return true;
        }
        if (!gf.field_d) {
          return false;
        }
        throw new IllegalArgumentException(param2 + " " + param0);
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        boolean stackIn_36_2 = false;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        rb var26 = null;
        byte[] var27 = null;
        rb var29 = null;
        rb var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var12Lifetime1;
        int var15_intLifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var14_intLifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime4;
        int var18Lifetime3;
        int var19Lifetime2;
        var22 = StarCannon.field_A;
        try {
          if (!this.a((byte) -76, param0)) {
            return false;
          }
          if (null == this.field_h[param0]) {
            return false;
          }
          var5_int = this.field_b.field_i[param0];
          var34 = this.field_b.field_k[param0];
          var24 = var34;
          var6 = var24;
          if (null == this.field_g[param0]) {
            array$0 = new Object[this.field_b.field_j[param0]];
            this.field_g[param0] = array$0;
          }
          var7 = this.field_g[param0];
          var8 = 1;
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
            if (var6 != null) {
              var10 = var34[var9_int];
            } else {
              var10 = var9_int;
            }
            if (null != var7[var10]) {
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param3 != null && (param3[0] != 0 ||
            0 != param3[1] ||
            param3[2] != 0 ||
            param3[3] != 0)) {
            var35 = dk.a((byte) -56, this.field_h[param0], true);
            var25 = var35;
            var9 = var25;
            var26 = new rb(var35);
            var26.a(param3, var26.field_f.length, -84, 5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = dk.a((byte) 90, this.field_h[param0], false);
          }
          try {
            var36 = hc.a((byte) 74, var9);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_35_0 = var11_ref_RuntimeException;
            stackIn_35_1 = new StringBuilder();
            stackIn_36_2 = (param3 != null);
            throw sd.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(" ").append(param0).append(" ").append(var9.length).append(" ").append(mg.a(var9.length, var9, (byte) -69)).append(" ").append(mg.a(-2 + var9.length, var9, (byte) -110)).append(" ").append(this.field_b.field_c[param0]).append(" ").append(this.field_b.field_b).toString());
          }
          if (this.field_d) {
            this.field_h[param0] = null;
          }
          if (param2 >= -15) {
            this.field_a = (ti) null;
          }
          if (var5_int > 1) {
            if (this.field_i == 2) {
              var11 = var36.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var12 * (var5_int * 4);
              var29 = new rb(var43);
              var14_int = 0;
              var15_int = 0;
              var29.field_g = var11;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var5_int > var18; var18++) {
                  var17 = var17 + var29.f((byte) -119);
                  if (var6 == null) {
                    var19 = var18;
                  } else {
                    var19 = var34[var18];
                  }
                  if (var19 == param1) {
                    var15_int = var19;
                    var14_int = var14_int + var17;
                  }
                }
              }
              if (var14_int == 0) {
                return true;
              }
              var44 = new byte[var14_int];
              var29.field_g = var11;
              var14_intLifetime1 = 0;
              var17Lifetime4 = 0;
              for (var18Lifetime3 = 0; var12 > var18Lifetime3; var18Lifetime3++) {
                var19Lifetime2 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19Lifetime2 = var19Lifetime2 + var29.f((byte) -87);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (var21 == param1) {
                    ug.a(var43, var17Lifetime4, var44, var14_intLifetime1, var19Lifetime2);
                    var14_intLifetime1 = var14_intLifetime1 + var19Lifetime2;
                  }
                  var17Lifetime4 = var17Lifetime4 + var19Lifetime2;
                }
              }
              var7[var15_int] = var44;
              return true;
            }
            var11 = var36.length;
            var11--;
            var12Lifetime1 = 255 & var23[var11];
            var11 = var11 - 4 * var12Lifetime1 * var5_int;
            var31 = new rb(var43);
            var31.field_g = var11;
            var39 = new int[var5_int];
            var32 = var39;
            var14 = var32;
            for (var15_intLifetime1 = 0; var15_intLifetime1 < var12Lifetime1; var15_intLifetime1++) {
              var16Lifetime1 = 0;
              for (var17Lifetime1 = 0; var17Lifetime1 < var5_int; var17Lifetime1++) {
                var16Lifetime1 = var16Lifetime1 + var31.f((byte) -79);
                var14[var17Lifetime1] = var14[var17Lifetime1] + var16Lifetime1;
              }
            }
            var40 = new byte[var5_int][];
            var33 = var40;
            var15 = var33;
            for (var16Lifetime2 = 0; var16Lifetime2 < var5_int; var16Lifetime2++) {
              array$1 = new byte[var39[var16Lifetime2]];
              var15[var16Lifetime2] = array$1;
              var39[var16Lifetime2] = 0;
            }
            var31.field_g = var11;
            var16Lifetime3 = 0;
            for (var17Lifetime2 = 0; var17Lifetime2 < var12Lifetime1; var17Lifetime2++) {
              var18Lifetime1 = 0;
              for (var19Lifetime1 = 0; var5_int > var19Lifetime1; var19Lifetime1++) {
                var18Lifetime1 = var18Lifetime1 + var31.f((byte) -100);
                ug.a(var43, var16Lifetime3, var40[var19Lifetime1], var39[var19Lifetime1], var18Lifetime1);
                var16Lifetime3 = var16Lifetime3 + var18Lifetime1;
                var14[var19Lifetime1] = var14[var19Lifetime1] + var18Lifetime1;
              }
            }
            for (var17Lifetime3 = 0; var5_int > var17Lifetime3; var17Lifetime3++) {
              if (var6 != null) {
                var18Lifetime2 = var34[var17Lifetime3];
              } else {
                var18Lifetime2 = var17Lifetime3;
              }
              if (this.field_i == 0) {
                var7[var18Lifetime2] = d.a(false, (byte) -21, var40[var17Lifetime3]);
              } else {
                var7[var18Lifetime2] = var40[var17Lifetime3];
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (this.field_i == 0) {
              var7[var11] = d.a(false, (byte) 123, var43);
            } else {
              var7[var11] = var36;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_105_0 = var5;
          stackIn_105_1 = new StringBuilder().append("ue.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(')').toString());
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, boolean param3) {
        Object stackIn_2_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.a(param2, 122, param1)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var5 = null;
          if (!param3) {
            this.field_b = (ak) null;
          }
          if ((this.field_g[param1] == null ||
            this.field_g[param1][param2] == null) &&
            !this.a(param1, param2, -65, param0)) {
            this.d(param1, 0);
            if (!this.a(param1, param2, -52, param0)) {
              stackIn_12_0 = null;
              return (byte[]) (stackIn_12_0);
            }
          }
          if (this.field_g[param1] == null) {
            throw new RuntimeException("");
          }
          if (this.field_g[param1][param2] != null) {
            var7 = dk.a((byte) -87, this.field_g[param1][param2], false);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (1 == this.field_i) {
              this.field_g[param1][param2] = null;
              if (this.field_b.field_j[param1] == 1) {
                this.field_g[param1] = null;
              }
            } else {
              if (this.field_i == 2) {
                this.field_g[param1] = null;
              }
            }
          }
          stackIn_26_0 = var5;
          return (byte[]) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("ue.R(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw sd.a((Throwable) (stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int b(int param0, int param1) {
        if (param1 <= 118) {
          return -2;
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          return 6144 > param0 ? -bd.field_c[6144 - param0] : bd.field_c[param0 - 6144];
        }
        return param0 < 2048 ? bd.field_c[-param0 + 2048] : -bd.field_c[-2048 + param0];
    }

    final static i a(ue param0, byte param1, int param2, int param3, ue param4) {
        RuntimeException var5 = null;
        i stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -57) {
            ue.b(-26);
          }
          if (!qb.a((byte) -106, param3, param2, param4)) {
            return null;
          }
          stackIn_6_0 = oe.a(5, param0.a(param3, true, param2));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ue.U(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final synchronized boolean a(byte param0, int param1) {
        byte[] discarded$0 = null;
        if (param0 != -76) {
          discarded$0 = this.a((int[]) null, 34, -53, ((boolean[]) (this.field_h[16]))[11]);
        }
        if (!this.b((byte) 120)) {
          return false;
        }
        if (0 > param1 ||
          this.field_b.field_j.length <= param1 ||
          0 == this.field_b.field_j[param1]) {
          if (!gf.field_d) {
            return false;
          }
          throw new IllegalArgumentException(Integer.toString(param1));
        }
        return true;
    }

    ue(ti param0, boolean param1, int param2) {
        this.field_b = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_a = param0;
          this.field_i = param2;
          this.field_d = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ue.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -9883) {
            return true;
          }
          if (!this.b((byte) 108)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_b.field_l.a((byte) -117, ne.a(false, var4));
          stackIn_7_0 = this.c(var3_int, -116);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ue.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.a(param2, 116, param1)) {
          return false;
        }
        if (null != this.field_g[param1] &&
          null != this.field_g[param1][param2]) {
          return true;
        }
        if (null != this.field_h[param1]) {
          return true;
        }
        this.d(param1, param0 ^ -93);
        if (param0 != -93) {
          this.c(-4, ((int[]) (this.field_h[0]))[9]);
        }
        if (this.field_h[param1] != null) {
          return true;
        }
        return false;
    }

    static {
        field_c = new int[]{15, 20, 20, 10, 10};
        field_f = 500;
    }
}
