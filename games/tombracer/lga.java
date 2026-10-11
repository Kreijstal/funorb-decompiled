/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lga extends rj {
    private vna field_D;
    static int[][] field_z;
    static cn field_B;
    private bm field_A;
    private String[] field_C;

    private final bm a(int param0, int param1, byte param2) {
        bm var4;
        bm var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        var4 = (bm) (this.field_D.f(param2 ^ 92));
        if (param2 != -20) {
          return (bm) null;
        }
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param1 >= var5.field_g &&
              var5.field_l <= param0 &&
              var5.field_j + var5.field_g > param1 &&
              var5.field_l + var5.field_i >= param0) {
              return var4;
            }
            var5 = var5.field_k;
          }
          var4 = (bm) (this.field_D.e(122));
        }
        return null;
    }

    String d(byte param0) {
        if (null == this.field_A) {
          return null;
        }
        if (this.field_C == null) {
          return null;
        }
        if (this.field_C.length > this.field_A.field_h) {
          int var2 = 16 % ((-58 - param0) / 60);
          return this.field_C[this.field_A.field_h];
        }
        return null;
    }

    lga(String param0, isa param1) {
        super(param0, (qc) null);
        this.field_A = null;
        try {
          this.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (null == this.field_C ||
            param1 >= this.field_C.length) {
            var7 = new String[param1 + 1];
            var8 = var7;
            var4 = var8;
            if (this.field_C != null) {
              for (var5 = 0; this.field_C.length > var5; var5++) {
                var7[var5] = this.field_C[var5];
              }
            }
            this.field_C = var8;
          }
          this.field_C[param1] = param0;
          if (param2 != 0) {
            this.a((byte) -100, 15, 61, -76, -74);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("lga.V(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1 + 0, param2, param3);
          this.field_A = null;
          if (this.field_f) {
            var5_int = -param0 + (jba.field_j - this.field_i);
            var6 = sta.field_B - param3 - this.field_n;
            this.field_A = this.a(var6, var5_int, (byte) -20);
          }
          if (param1 != 2097152) {
            field_z = (int[][]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("lga.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0) {
        int var2;
        oaa var3;
        bja var4;
        int var5;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        int var13;
        int var14;
        int var16;
        Object var17;
        oaa var17_ref;
        String var21;
        bja var22;
        kha var23;
        bm var24;
        Object var25;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        String var26;
        bja var27;
        kha var28;
        bm var29;
        oaa var30;
        int var2Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var7Lifetime2;
        int var7Lifetime1Lifetime1;
        Object var10Lifetime1;
        var17 = null;
        var25 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        if (param0 == 18758) {
          this.field_D = new vna();
          var2 = 0;
          var30 = (oaa) ((Object) this.field_r);
          var27 = var30.a((ae) (this), 14157);
          while (true) {
            var5 = this.field_o.indexOf("<hotspot=", var2);
            if (-1 == var5) {
              return;
            }
            var7 = this.field_o.indexOf(">", var5);
            var26 = this.field_o.substring(9 + var5, var7);
            var7Lifetime2 = Integer.parseInt(var26);
            var2 = this.field_o.indexOf("</hotspot>", var5);
            var8 = var27.a(var5, 0);
            var9 = var27.a(var2, 0);
            var10 = null;
            for (var11 = var8; var9 >= var11; var11++) {
              var28 = var27.field_c[var11];
              if (var8 != var11) {
                stackIn_27_0 = var28.field_c[0];
              } else {
                stackIn_27_0 = var27.a((byte) -59, var5);
              }
              var13 = stackIn_27_0;
              if (var11 != var9) {
                if (var28 == null) {
                  stackIn_32_0 = 0;
                } else {
                  stackIn_32_0 = var28.field_c[-1 + var28.field_c.length];
                }
              } else {
                stackIn_32_0 = var27.a((byte) -59, var2);
              }
              var14 = stackIn_32_0;
              var29 = new bm(var7Lifetime2, var13, var28.field_d, var14 - var13, Math.max(var30.a((byte) -90), var28.field_b - var28.field_d));
              if (var10 != null) {
                ((bm) (var10)).field_k = var29;
              }
              this.field_D.b((byte) -46, var29);
              var10 = var29;
            }
          }
        }
        this.a((byte) -56, -23, 29, 43, 2);
        this.field_D = new vna();
        var2Lifetime1 = 0;
        var17_ref = (oaa) ((Object) this.field_r);
        var3 = var17_ref;
        var22 = var17_ref.a((ae) (this), 14157);
        var4 = var22;
        while (true) {
          var5Lifetime1 = this.field_o.indexOf("<hotspot=", var2Lifetime1);
          if (-1 == var5Lifetime1) {
            return;
          }
          var7Lifetime1 = this.field_o.indexOf(">", var5Lifetime1);
          var21 = this.field_o.substring(9 + var5Lifetime1, var7Lifetime1);
          var7Lifetime1Lifetime1 = Integer.parseInt(var21);
          var2Lifetime1 = this.field_o.indexOf("</hotspot>", var5Lifetime1);
          var8Lifetime1 = var22.a(var5Lifetime1, 0);
          var9Lifetime1 = var22.a(var2Lifetime1, 0);
          var10Lifetime1 = null;
          for (var11Lifetime1 = var8Lifetime1; var9Lifetime1 >= var11Lifetime1; var11Lifetime1++) {
            var23 = var22.field_c[var11Lifetime1];
            if (var8Lifetime1 != var11Lifetime1) {
              stackIn_10_0 = var23.field_c[0];
            } else {
              stackIn_10_0 = var22.a((byte) -59, var5Lifetime1);
            }
            var13Lifetime1 = stackIn_10_0;
            if (var11Lifetime1 != var9Lifetime1) {
              if (var23 == null) {
                stackIn_15_0 = 0;
              } else {
                stackIn_15_0 = var23.field_c[-1 + var23.field_c.length];
              }
            } else {
              stackIn_15_0 = var22.a((byte) -59, var2Lifetime1);
            }
            var14Lifetime1 = stackIn_15_0;
            var24 = new bm(var7Lifetime1Lifetime1, var13Lifetime1, var23.field_d, var14Lifetime1 - var13Lifetime1, Math.max(var17_ref.a((byte) -90), var23.field_b - var23.field_d));
            if (var10Lifetime1 != null) {
              ((bm) (var10Lifetime1)).field_k = var24;
            }
            this.field_D.b((byte) -46, var24);
            var10Lifetime1 = var24;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        bm var7 = null;
        bm var7Lifetime1;
        super.b(param0, param1, param2, -118);
        int var5 = param2 - this.field_i;
        int var6 = -this.field_n + param0;
        if (param3 > -40) {
          ae var8 = (ae) null;
          this.a((ae) null, false);
          var7 = this.a(var6, var5, (byte) -20);
          if (var7 == null) {
            return;
          }
          if (this.field_h != null) {
            ((tma) ((Object) this.field_h)).a(this, var7.field_h, 30846, param1);
            return;
          }
          return;
        }
        var7Lifetime1 = this.a(var6, var5, (byte) -20);
        if (var7Lifetime1 == null) {
          return;
        }
        if (this.field_h == null) {
          return;
        }
        ((tma) ((Object) this.field_h)).a(this, var7Lifetime1.field_h, 30846, param1);
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        oaa var5 = (oaa) ((Object) this.field_r);
        bm var6 = this.field_A;
        if (var6 != null) {
          var7 = var5.a((ae) (this), param0, (byte) 119);
          var8 = var5.a(param1, (ae) (this), (byte) -49);
          do {
            nn.a(-2 + (var7 + var6.field_g), -2 + (var8 + var6.field_l), var6.field_i + 2, 2 + var6.field_j, false);
            var6 = var6.field_k;
          } while (var6 != null);
          return;
        }
    }

    final static nma a(uia param0, byte param1) {
        RuntimeException var2 = null;
        nma stackIn_2_0 = null;
        nma stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -86) {
            stackIn_4_0 = new nma(param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.b(false), param0.a(-32768), param0.h(255));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nma) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("lga.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.b(18758);
    }

    final static oc a(cn param0, String param1, String param2, boolean param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        oc stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        oc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            stackIn_2_0 = (oc) null;
            return stackIn_2_0;
          }
          var5 = param0.a(param2, (byte) 115, param1);
          var4 = var5;
          if (var5 != null) {
            stackIn_7_0 = new oc(var5);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (oc) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("lga.U(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lga.S(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.a((byte) -31, param2, ((oaa) ((Object) this.field_r)).b((byte) 105, (ae) (this)), param3, param0);
        if (param1 != -120) {
          field_B = (cn) null;
          return;
        }
    }

    public static void a(byte param0) {
        field_z = (int[][]) null;
        if (param0 != -123) {
          return;
        }
        field_B = null;
    }

    final static boolean b(boolean param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        uia var5 = null;
        int[] var6 = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var1Lifetime1;
        int var3Lifetime1;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (null == rla.field_D) {
            rla.field_D = cna.a(4, 128);
          }
          if (param0) {
            var5 = (uia) null;
            lga.a((uia) null, (byte) 82);
          }
          if (!rla.field_D.field_g) {
            return false;
          }
          var13 = rb.field_o;
          var11 = var13;
          var6 = var11;
          var1 = var6;
          var17 = rla.field_D.field_f;
          for (var3 = 0; var3 < 8; var3++) {
            var6[var3] = fh.a(var13[var3], var17[var3]);
          }
          var14 = pq.field_e;
          var12 = var14;
          var8 = var12;
          var1Lifetime1 = var8;
          var18 = rla.field_D.field_f;
          var10 = 0;
          var3Lifetime1 = var10;
          while (8 > var10) {
            var8[var10] = sea.c(var14[var10], ~var18[var10]);
            var10++;
          }
          rla.field_D = null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "lga.M(" + param0 + ')');
        }
    }

    static {
    }
}
