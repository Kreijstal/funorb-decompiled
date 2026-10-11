/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jd implements fc, sf {
    private boolean field_l;
    static int field_a;
    int field_i;
    static int field_e;
    int field_m;
    static int field_g;
    int field_j;
    int field_h;
    int field_p;
    private int field_c;
    int field_f;
    int field_n;
    int field_o;
    tj field_b;
    int field_k;
    int field_d;

    final static we a(int param0, int[] param1, we param2) {
        we var3 = null;
        RuntimeException var3_ref = null;
        we stackIn_2_0 = null;
        we stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new we(0, 0, 0);
          var3.field_a = param2.field_a;
          var3.field_b = param2.field_b;
          var3.field_i = param1;
          var3.field_h = param2.field_h;
          var3.field_g = param2.field_g;
          if (param0 != -30894) {
            stackIn_2_0 = (we) null;
            return stackIn_2_0;
          }
          var3.field_d = param2.field_d;
          var3.field_j = param2.field_j;
          var3.field_f = param2.field_f;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("jd.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public final int a(lk param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(param0, 0);
          if (param1 != 1) {
            field_a = 127;
          }
          stackIn_3_0 = param0.field_l.b((byte) -8) + this.field_o + this.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jd.N(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    jd(tj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(int param0, int param1, int param2, lk param3) {
        RuntimeException var5 = null;
        lk var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var6 = (lk) null;
            this.a((lk) null, -65, -58, 30, 1, -87);
          }
          stackIn_3_0 = param3.field_r + (param1 + this.field_m) - (-param3.field_v - param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("jd.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void a(lk param0, int param1, byte param2, int param3, int param4) {
        int var7 = 0;
        bh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        ed var14 = null;
        ed var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0.e(1)) {
            var14 = this.b(param0, param2 - 65);
            var15 = var14;
            var7 = var15.b(param1, 0);
            var8 = var14.field_a[var7];
            var9 = var15.a(param1, 126);
            var10 = this.a(0, param4, var9, param0);
            var11 = this.a(param3, param0, (byte) 51) + Math.max(0, var8.field_f);
            stackIn_4_0 = this.a(param3, param0, (byte) 51);
            stackIn_4_1 = this.a((byte) 97, param0);
            stackIn_4_2 = var8.field_b;
            if (var15.field_a.length <= 1 + var7) {
              stackIn_5_3 = var8.field_b;
            } else {
              stackIn_5_3 = var14.field_a[1 + var7].field_f;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            ai.a(param4 + param0.field_r + param0.field_k, param0.field_m + param0.field_i + param3, param3 + param0.field_i, param0.field_r + param4, -19852);
            ma.field_m.a(var10, var11, this.field_j, false, var10, var12);
            ve.a(-124);
          }
          if (param2 != 65) {
            var13 = (String) null;
            jd.a(-102, (java.applet.Applet) null, (String) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("jd.G(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(jd param0, byte param1) {
        try {
          param0.field_o = this.field_o;
          param0.field_h = this.field_h;
          param0.field_b = this.field_b;
          param0.field_p = this.field_p;
          param0.field_j = this.field_j;
          param0.field_c = this.field_c;
          param0.field_d = this.field_d;
          param0.field_l = this.field_l;
          if (param1 != -122) {
            lk var4 = (lk) null;
            this.a((lk) null, 74);
          }
          param0.field_f = this.field_f;
          param0.field_i = this.field_i;
          param0.field_n = this.field_n;
          param0.field_m = this.field_m;
          param0.field_k = this.field_k;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "jd.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        pa var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Bounce.field_N;
        try {
          if (param1 > param3) {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; param2 > var5_int; var5_int++) {
              var8[var5_int] = param0[var5_int + param1];
            }
          } else {
            var4 = param0;
          }
          var5 = new pa();
          var5.a(-28530);
          var5.a((long)(8 * param2), var4, (byte) 67);
          var6 = new byte[64];
          var5.a(var6, 27892, 0);
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("jd.V(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static we a(int param0, gk param1, int param2, int param3) {
        RuntimeException var4 = null;
        byte[] var5 = null;
        Object stackIn_4_0 = null;
        we stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 8) {
            var5 = (byte[]) null;
            jd.a((byte[]) null, 124, -76, 56);
          }
          if (c.a(param1, false, param0, param3)) {
            stackIn_6_0 = g.b(-8964);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (we) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("jd.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2, lk param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = Bounce.field_N;
        try {
          ai.a(param3.field_k + (param3.field_r + param4), param3.field_m + (param3.field_i + param6), param3.field_i + param6, param3.field_r + param4, -19852);
          var9_int = this.a(param3, (byte) -55);
          if (param2 != 41) {
            this.field_b = (tj) null;
          }
          boolean decompiledFrameRemainder0 = true;
          var10 = this.a((byte) 97, param3);
          if (!this.field_l) {
            var12 = this.field_p;
            if (var12 == 0) {
              var11 = this.field_b.field_s;
            } else {
              if (var12 == 2) {
                var11 = var10 - this.field_b.field_x;
              } else {
                if (var12 != 3 &&
                  var12 != 1) {
                }
                var11 = this.field_b.field_s + (-this.field_b.field_x - this.field_b.field_s + var10 >> 1);
              }
            }
            var12Lifetime1 = this.field_d;
            if (0 != var12Lifetime1 &&
              3 != var12Lifetime1) {
              if (var12Lifetime1 == 1) {
                this.field_b.a(this.a(true, param3), this.a(0, param4, param7, param3) + (var9_int >> 1), var11 + this.a((byte) 127, param3, param6, param0), param1, param5);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_b.c(this.a(true, param3), this.a(0, param4, param7, param3) + var9_int, var11 + this.a((byte) 127, param3, param6, param0), param1, param5);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_b.b(this.a(true, param3), this.a(0, param4, param7, param3), var11 + this.a((byte) 127, param3, param6, param0), param1, param5);
            }
          } else {
            this.field_b.a(this.a(true, param3), this.a(param2 ^ 41, param4, param7, param3), this.a((byte) 127, param3, param6, param0), var9_int, var10, param1, param5, this.field_d, this.field_p, this.field_f);
          }
          ve.a(-127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_28_0 = var9;
          stackIn_28_1 = new StringBuilder().append("jd.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            jg.field_B = param2;
            try {
              var6 = param1.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param1.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param0 != param2.length()) {
                var5Lifetime6 = var7 + "; Expires=" + se.a(-106, 94608000000L + fa.a(81)) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              ac.a((byte) 91, param1, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (Throwable throwable) {
            }
            kc.a(param1, 27477);
          } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "jd.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final ed b(lk param0, int param1) {
        RuntimeException var3 = null;
        ed stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.field_f = 22;
          }
          if (null == param0.field_l) {
            param0.field_l = (ed) ((Object) new mb());
          }
          if (this.field_l) {
            ((mb) (param0.field_l)).a(this.a(param0, (byte) -55), this.field_b, this.a(true, param0), true, this.a((byte) 97, param0), this.field_p, this.field_d, this.field_f);
          } else {
            this.b(-75, param0);
          }
          stackIn_8_0 = param0.field_l;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("jd.O(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    String a(boolean param0, lk param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_m = -94;
          }
          stackIn_3_0 = param1.field_h;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(int param0, lk param1, byte param2) {
        RuntimeException var4 = null;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 51) {
            var5 = (byte[]) null;
            jd.a((byte[]) null, 71, 51, -64);
          }
          stackIn_3_0 = this.a((byte) 127, param1, param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jd.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, lk param1, int param2, int param3, int param4, byte param5) {
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
        bh var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ed var17 = null;
        ed var18 = null;
        var16 = Bounce.field_N;
        try {
          if (param4 == param3) {
            return;
          }
          if (param5 <= 86) {
            return;
          }
          if (param1.e(1)) {
            var17 = this.b(param1, 0);
            var18 = var17;
            if (param4 < param3) {
              var9 = param3;
              var8 = param4;
            } else {
              var9 = param4;
              var8 = param3;
            }
            var10 = var18.b(var8, 0);
            var11 = var18.b(var9, 0);
            ai.a(param1.field_k + param1.field_r + param0, param1.field_i + (param2 + param1.field_m), param1.field_i + param2, param1.field_r + param0, -19852);
            for (var12 = var10; var11 >= var12; var12++) {
              var13 = var17.field_a[var12];
              if (var12 == var10) {
                stackIn_16_0 = var18.a(var8, 126);
              } else {
                stackIn_16_0 = var13.field_a[0];
              }
              var14 = stackIn_16_0;
              if (var12 != var11) {
                if (var13 != null) {
                  stackIn_21_0 = var13.field_a[var13.field_a.length - 1];
                } else {
                  stackIn_21_0 = 0;
                }
              } else {
                stackIn_21_0 = var18.a(var9, 125);
              }
              var15 = stackIn_21_0;
              ma.field_m.a(-1, var13.field_b, this.field_i, this.field_i >>> 24, -var14 + var15, this.a(0, param0, var14, param1), var13.field_f + (param1.field_o + param2) + (param1.field_i + this.field_o));
            }
            ve.a(-120);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("jd.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int a(int param0) {
        if (param0 < 54) {
          this.field_h = 96;
        }
        return this.field_b.field_s + this.field_b.field_x;
    }

    public final int a(int param0, lk param1) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(param1, 0);
          if (param0 != -79925823) {
            var4 = (byte[]) null;
            jd.a((byte[]) null, 107, -74, -103);
          }
          stackIn_3_0 = param1.field_l.b(param0 ^ -79925859) - (-this.field_m - this.field_k);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jd.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(lk param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -55) {
            field_g = 6;
          }
          stackIn_3_0 = -this.field_m + param0.field_k - this.field_k;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jd.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0, lk param1) {
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
        lk var8 = null;
        int var6Lifetime1;
        var7 = Bounce.field_N;
        try {
          if (param0 > -2) {
            var8 = (lk) null;
            this.a((lk) null, (byte) -16);
          }
          if (param1.field_l == null) {
            param1.field_l = (ed) ((Object) new mb());
          }
          var3_int = this.a(param1, (byte) -55);
          var4 = this.a((byte) 97, param1);
          var6 = this.field_p;
          if (0 != var6) {
            if (var6 != 2) {
              if (var6 != 3 &&
                var6 == 1) {
              }
              var5 = this.field_b.field_s + (-this.field_b.field_s + var4 - this.field_b.field_x >> 1);
            } else {
              var5 = -this.field_b.field_x + var4;
            }
          } else {
            var5 = this.field_b.field_s;
          }
          var6Lifetime1 = this.field_d;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 != 1) {
              if (2 == var6Lifetime1) {
                if (!(param1.field_l instanceof mb)) {
                  return;
                }
                ((mb) (param1.field_l)).a(this.a(true, param1), this.field_b, var5, 97, var3_int);
              }
            } else {
              if (param1.field_l instanceof mb) {
                ((mb) (param1.field_l)).a(var5, this.a(true, param1), this.field_b, var3_int >> 1, false);
                return;
              }
            }
            return;
          }
          if (param1.field_l instanceof mb) {
            ((mb) (param1.field_l)).a(this.a(true, param1), var5, (byte) -109, 0, this.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("jd.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    private final void a(int param0, lk param1, int param2, int param3) {
        if (param2 != -9087) {
          return;
        }
        try {
          this.a(0, this.field_h, (byte) 41, param1, param0, this.field_c, param3, 0);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "jd.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final int a(int param0, int param1, lk param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -109) {
            this.field_o = 4;
          }
          stackIn_3_0 = this.a(0, param0, 0, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jd.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(lk param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 >= -13) {
            this.a(82);
          }
          this.b(param0, 0);
          stackIn_3_0 = param0.field_l.a(-this.a(param3, -110, param0) + param5, -112, param2 - this.a(param1, param0, (byte) 51));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("jd.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(byte param0, lk param1) {
        RuntimeException var3 = null;
        jd var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 97) {
            var4 = (jd) null;
            this.a((jd) null, (byte) -55);
          }
          stackIn_3_0 = -this.field_o + param1.field_m - this.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jd.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static eh a(int param0, int param1) {
        eh[] var2;
        int var3;
        int var4;
        eh[] var5;
        var4 = Bounce.field_N;
        var5 = ge.a(true);
        var2 = var5;
        var3 = 0;
        if (param0 != 21314) {
          return (eh) null;
        }
        while (var3 < var5.length) {
          if (param1 == var5[var3].field_e) {
            return var5[var3];
          }
          var3++;
        }
        return null;
    }

    private final int a(byte param0, lk param1, int param2, int param3) {
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 126) {
            var6 = (String) null;
            jd.a(40, (java.applet.Applet) null, (String) null);
          }
          stackIn_3_0 = param1.field_o + (this.field_o + param1.field_i + (param2 + param3));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("jd.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        if (this.field_b == null) {
          return;
        }
        try {
          this.a(param4, param1, -9087, param0);
          int var6_int = -93 % ((param2 + 60) / 56);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "jd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    protected jd() {
    }

    jd(tj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_d = param7;
          this.field_k = param2;
          this.field_f = param9;
          this.field_n = param4;
          this.field_j = param10;
          this.field_p = param8;
          this.field_m = param1;
          this.field_i = param11;
          this.field_l = param12 ? true : false;
          this.field_b = param0;
          this.field_o = param3;
          this.field_h = param5;
          this.field_c = param6;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_a = 256;
        field_e = 1;
    }
}
