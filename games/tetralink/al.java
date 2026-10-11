/*
 * Decompiled by CFR-JS 0.4.0.
 */
class al implements kg, jh {
    static hl field_i;
    int field_k;
    int field_a;
    static String field_l;
    private boolean field_p;
    static String field_e;
    int field_o;
    private int field_m;
    int field_f;
    int field_j;
    int field_n;
    int field_d;
    int field_g;
    jb field_b;
    int field_h;
    int field_c;

    public final int b(na param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 46 / ((param1 + 15) / 48);
          stackIn_1_0 = -this.field_f + param0.field_F - this.field_g;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("al.BA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, byte[] param2, int param3, boolean param4, int param5) {
        bc var10 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          var10 = nd.field_Lb;
          var10.f(param3, (byte) -92);
          var10.field_t = var10.field_t + 1;
          var7 = var10.field_t;
          var10.a(4, !param4 ? true : false);
          var10.a(param5, false);
          var8 = param0;
          if (param1) {
            var8 += 128;
          }
          var10.a(var8, false);
          if (!param4) {
            String var9 = (String) null;
            al.a((String) null, (byte) -79);
          }
          var10.a(0, 128, param2, param2.length);
          var10.b(-var7 + var10.field_t, -2);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "al.FA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        if (null == this.field_b) {
          return;
        }
        try {
          if (!param3) {
            na var7 = (na) null;
            this.a(-34, (na) null);
          }
          this.a(param1, param2, param0, (byte) -47);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "al.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, na param1) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = TetraLink.field_J;
        try {
          if (param1.field_D == null) {
            param1.field_D = (hi) ((Object) new we());
          }
          var3_int = this.b(param1, -107);
          var4 = this.d(param1, -42);
          if (param0 != 2) {
            this.field_f = -119;
          }
          var6 = this.field_d;
          if (var6 != 0) {
            if (var6 != 2) {
              if (var6 != 3 &&
                1 == var6) {
              }
              var5 = this.field_b.field_N + (-this.field_b.field_K - this.field_b.field_N + var4 >> 1);
            } else {
              var5 = -this.field_b.field_K + var4;
            }
          } else {
            var5 = this.field_b.field_N;
          }
          var6Lifetime1 = this.field_k;
          if (var6Lifetime1 != 0 &&
            3 != var6Lifetime1) {
            if (var6Lifetime1 != 1) {
              if (var6Lifetime1 == 2) {
                if (!(param1.field_D instanceof we)) {
                  return;
                }
                ((we) (param1.field_D)).a(this.c(param1, 4373), var5, var3_int, false, this.field_b);
              }
            } else {
              if (param1.field_D instanceof we) {
                ((we) (param1.field_D)).a(this.c(param1, 4373), (byte) 124, this.field_b, var3_int >> 1, var5);
                return;
              }
            }
            return;
          }
          if (!(param1.field_D instanceof we)) {
            return;
          }
          ((we) (param1.field_D)).a(0, this.field_b, 0, var5, this.c(param1, 4373));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("al.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    public final int a(int param0, int param1, na param2) {
        RuntimeException var4 = null;
        al var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var5 = (al) null;
            this.a(6, (al) null);
          }
          stackIn_3_0 = this.a(0, param2, param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("al.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(boolean param0) {
        if (!param0) {
          return -109;
        }
        return this.field_b.field_N + this.field_b.field_K;
    }

    final static sj a(boolean param0, int param1) {
        sj var2 = new sj(true);
        if (param1 == 1) {
          var2.field_b = param0 ? true : false;
          return var2;
        }
        field_e = (String) null;
        var2.field_b = param0 ? true : false;
        return var2;
    }

    public final int a(int param0, int param1, int param2, int param3, na param4, byte param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != -34) {
            this.field_o = -103;
          }
          this.a(param4, false);
          stackIn_3_0 = param4.field_D.a(param3 - this.a(param1, 0, param4), param2 - this.a(param4, param0, true), 12024);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("al.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(')').toString());
        }
    }

    public final hi a(na param0, boolean param1) {
        RuntimeException var3 = null;
        hi stackIn_8_0 = null;
        hi stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param0.field_D) {
            param0.field_D = (hi) ((Object) new we());
          }
          if (this.field_p) {
            ((we) (param0.field_D)).a(-24340, this.d(param0, -37), this.c(param0, 4373), this.b(param0, 111), this.field_b, this.field_k, this.field_d, this.field_c);
          } else {
            this.a(2, param0);
          }
          if (!param1) {
            stackIn_10_0 = param0.field_D;
            return stackIn_10_0;
          }
          stackIn_8_0 = (hi) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("al.V(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(na param0, int param1, int param2, int param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        bk var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        na var13 = null;
        hi var14 = null;
        hi var15 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            var13 = (na) null;
            discarded$1 = this.d((na) null, -88);
          }
          if (!param0.c(3)) {
            return;
          }
          var14 = this.a(param0, false);
          var15 = var14;
          var7 = var15.a(param2, 103);
          var8 = var14.field_c[var7];
          var9 = var15.a(param2, true);
          var10 = this.a(param3 + 0, param0, param4, var9);
          var11 = this.a(param0, param1, true) + Math.max(0, var8.field_h);
          stackIn_6_0 = this.a(param0, param1, true);
          stackIn_6_1 = this.d(param0, param3 ^ -128);
          stackIn_6_2 = var8.field_a;
          if (var15.field_c.length > 1 + var7) {
            stackIn_7_3 = var14.field_c[1 + var7].field_h;
          } else {
            stackIn_7_3 = var8.field_a;
          }
          var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_7_3));
          kl.a(param0.field_F + (param0.field_t + param4), param0.field_u + param1 + param0.field_w, param1 + param0.field_w, (byte) -79, param0.field_t + param4);
          dh.field_q.a(var12, var10, param3 - 64, var11, this.field_o, var10);
          dh.a(-581);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("al.AA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final int a(na param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, false);
          if (param1 == 36) {
            stackIn_4_0 = param0.field_D.b((byte) 117) + this.field_f + this.field_g;
            return stackIn_4_0;
          }
          stackIn_2_0 = -68;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("al.W(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, al param1) {
        try {
          param1.field_j = this.field_j;
          param1.field_m = this.field_m;
          param1.field_k = this.field_k;
          param1.field_h = this.field_h;
          param1.field_f = this.field_f;
          param1.field_p = this.field_p;
          param1.field_b = this.field_b;
          param1.field_d = this.field_d;
          param1.field_o = this.field_o;
          param1.field_c = this.field_c;
          param1.field_a = this.field_a;
          param1.field_g = this.field_g;
          param1.field_n = this.field_n;
          if (param0 != 0) {
            this.a(false);
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "al.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, na param2, byte param3) {
        try {
          this.a(param2, param0, 0, (byte) 45, this.field_m, this.field_a, 0, param1);
          if (param3 != -47) {
            this.field_j = -55;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "al.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final int a(int param0, na param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -77 % ((61 - param2) / 48);
          stackIn_1_0 = param3 + (param1.field_o + (this.field_j + param0 + param1.field_w));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("al.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int a(na param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        na var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            var5 = (na) null;
            this.b((na) null, -6);
          }
          stackIn_3_0 = this.a(param1, param0, (byte) 120, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("al.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        try {
          rb.field_Nb = param0;
          if (param1 != 24) {
            field_l = (String) null;
          }
          t.a(12, 0);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "al.LA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(na param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        int var12Lifetime1;
        var13 = TetraLink.field_J;
        try {
          boolean decompiledFrameRemainder0 = true;
          kl.a(param0.field_F + param0.field_t + param1, param7 + param0.field_w + param0.field_u, param0.field_w + param7, (byte) -79, param0.field_t + param1);
          var9_int = this.b(param0, 75);
          var10 = this.d(param0, -19);
          if (this.field_p) {
            this.field_b.a(this.c(param0, 4373), this.a(0, param0, param1, param6), this.a(param7, param0, (byte) -24, param2), var9_int, var10, param5, param4, this.field_k, this.field_d, this.field_c);
          } else {
            var12 = this.field_d;
            if (var12 != 0) {
              if (var12 == 2) {
                var11 = -this.field_b.field_K + var10;
              } else {
                if (var12 != 3 &&
                  var12 != 1) {
                }
                var11 = this.field_b.field_N + (-this.field_b.field_K + (-this.field_b.field_N + var10) >> 1);
              }
            } else {
              var11 = this.field_b.field_N;
            }
            var12Lifetime1 = this.field_k;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_b.a(this.c(param0, 4373), this.a(0, param0, param1, param6) + (var9_int >> 1), var11 + this.a(param7, param0, (byte) 120, param2), param5, param4);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_b.c(this.c(param0, 4373), var9_int + this.a(0, param0, param1, param6), this.a(param7, param0, (byte) 122, param2) + var11, param5, param4);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_b.b(this.c(param0, 4373), this.a(0, param0, param1, param6), var11 + this.a(param7, param0, (byte) -79, param2), param5, param4);
            }
          }
          if (param3 < 37) {
            var14 = (String) null;
            al.a((String) null, (byte) -67);
          }
          dh.a(-581);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_29_0 = var9;
          stackIn_29_1 = new StringBuilder().append("al.OA(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    String c(na param0, int param1) {
        RuntimeException var3 = null;
        al var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 4373) {
            var4 = (al) null;
            this.a(105, (al) null);
          }
          stackIn_3_0 = param0.field_A;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("al.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, na param5) {
        int var12 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bk var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        na var17 = null;
        hi var18 = null;
        hi var19 = null;
        var16 = TetraLink.field_J;
        try {
          if (param2 == param0) {
            return;
          }
          if (param1 != 18985) {
            var17 = (na) null;
            this.a(-123, (na) null);
          }
          if (!param5.c(param1 - 18982)) {
            return;
          }
          var18 = this.a(param5, false);
          var19 = var18;
          if (param2 > param0) {
            var9 = param2;
            var8 = param0;
          } else {
            var9 = param0;
            var8 = param2;
          }
          var10 = var19.a(var8, 107);
          var11 = var19.a(var9, 113);
          kl.a(param3 - (-param5.field_t - param5.field_F), param5.field_u + param5.field_w + param4, param5.field_w + param4, (byte) -79, param5.field_t + param3);
          for (var12 = var10; var11 >= var12; var12++) {
            var13 = var18.field_c[var12];
            if (var10 == var12) {
              stackIn_16_0 = var19.a(var8, true);
            } else {
              stackIn_16_0 = var13.field_j[0];
            }
            var14 = stackIn_16_0;
            if (var11 == var12) {
              stackIn_21_0 = var19.a(var9, true);
            } else {
              if (var13 != null) {
                stackIn_21_0 = var13.field_j[-1 + var13.field_j.length];
              } else {
                stackIn_21_0 = 0;
              }
            }
            var15 = stackIn_21_0;
            dh.field_q.a(param4 + param5.field_w + this.field_j - (-param5.field_o - var13.field_h), var15 - var14, 13421772, this.field_n, var13.field_a, this.field_n >>> 24, this.a(0, param5, param3, var14));
          }
          dh.a(-581);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("al.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final int a(int param0, na param1, int param2, int param3) {
        RuntimeException var5 = null;
        na var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var6 = (na) null;
            this.a((na) null, 74, false);
          }
          stackIn_3_0 = param1.field_t + (param2 + this.field_f) + (param1.field_E + param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("al.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_l = null;
        field_i = null;
        int var1 = -5 % ((-21 - param0) / 62);
    }

    private final int d(na param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 39 / ((-81 - param1) / 32);
          stackIn_1_0 = -this.field_j + param0.field_u - this.field_h;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("al.JA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(na param0, int param1) {
        RuntimeException var3 = null;
        na var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 65) {
            var4 = (na) null;
            this.a(-16, 92, (na) null);
          }
          this.a(param0, false);
          stackIn_3_0 = param0.field_D.a(true) + (this.field_j + this.field_h);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("al.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    protected al() {
    }

    al(jb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    al(jb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_g = param2;
          this.field_n = param11;
          this.field_c = param9;
          this.field_o = param10;
          this.field_m = param6;
          this.field_h = param4;
          this.field_j = param3;
          this.field_d = param8;
          this.field_k = param7;
          this.field_b = param0;
          this.field_f = param1;
          this.field_a = param5;
          this.field_p = param12 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_l = "This game is full.";
        field_e = "Continue";
    }
}
