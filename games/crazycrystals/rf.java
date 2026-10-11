/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rf extends pc {
    private fo field_D;
    private wb field_B;
    static int field_G;
    static dl field_C;
    private String[] field_F;

    final void b(boolean param0) {
        int var11 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        fi var3;
        tb var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        bh var12;
        int var13;
        int var14;
        fo var15;
        int var16;
        int var7Lifetime1;
        var16 = CrazyCrystals.field_B;
        this.field_B = new wb();
        var2 = 0;
        var3 = (fi) ((Object) this.field_i);
        var4 = var3.a((qm) (this), 1);
        while (true) {
          var5 = this.field_o.indexOf("<hotspot=", var2);
          if (-1 == var5) {
            if (!param0) {
              this.a(89, (byte) 16, 73, -80);
            }
            return;
          }
          var7 = this.field_o.indexOf(">", var5);
          var6 = this.field_o.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_o.indexOf("</hotspot>", var5);
          var8 = var4.b(var5, 62);
          var9 = var4.b(var2, 62);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_h[var11];
            if (~var11 == ~var8) {
              stackIn_8_0 = var4.a(var5, 1);
            } else {
              stackIn_8_0 = var12.field_e[0];
            }
            var13 = stackIn_8_0;
            if (var9 != var11) {
              if (var12 == null) {
                stackIn_13_0 = 0;
              } else {
                stackIn_13_0 = var12.field_e[-1 + var12.field_e.length];
              }
            } else {
              stackIn_13_0 = var4.a(var2, 1);
            }
            var14 = stackIn_13_0;
            var15 = new fo(var7Lifetime1, var13, var12.field_f, var14 - var13, Math.max(var3.a(79), var12.field_b - var12.field_f));
            if (var10 != null) {
              ((fo) (var10)).field_k = var15;
            }
            this.field_B.b(0, var15);
            var10 = var15;
          }
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -35) {
            rf.e((byte) 56);
          }
          stackIn_3_0 = nk.a(false, (byte) 66, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rf.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    String a(byte param0) {
        if (null == this.field_D) {
          return null;
        }
        if (this.field_F == null) {
          return null;
        }
        if (this.field_F.length <= this.field_D.field_n) {
          return null;
        }
        if (param0 >= -23) {
          return (String) null;
        }
        return this.field_F[this.field_D.field_n];
    }

    final static void a(int param0) {
        if (param0 != 3) {
          rf.e((byte) 124);
        }
        qe.field_g.g((byte) -119);
        if (null == td.field_b) {
          td.field_b = new kl(qe.field_g, sd.field_T);
        }
        qe.field_g.b(param0 ^ -3261, td.field_b);
    }

    final static void a(jb param0, jb param1, int param2) {
        try {
          if (param2 != 47) {
            rf.a(-16);
          }
          if (param1.field_d != null) {
            param1.a(false);
          }
          param1.field_b = param0;
          param1.field_d = param0.field_d;
          param1.field_d.field_b = param1;
          param1.field_b.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "rf.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 >= -20) {
          return;
        }
        field_C = null;
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        try {
          super.a(param0, -114, param2, param3);
          this.field_D = null;
          int var5_int = 37 / ((param1 + 50) / 59);
          if (this.field_m) {
            var6 = -this.field_r - param3 + qh.field_i;
            var7 = -param2 + (bm.field_h - this.field_j);
            this.field_D = this.a(var7, var6, 3);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "rf.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static java.net.URL a(int param0, String param1, boolean param2, String param3, java.net.URL param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_41_0 = null;
          java.net.URL stackIn_43_0 = null;
          RuntimeException stackIn_46_0 = null;
          StringBuilder stackIn_46_1 = null;
          String stackIn_47_2 = null;
          StringBuilder stackIn_49_1 = null;
          String stackIn_50_2 = null;
          StringBuilder stackIn_52_1 = null;
          String stackIn_53_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          CharSequence var10 = null;
          int var7_intLifetime1;
          int var7_intLifetime2;
          int var7_intLifetime3;
          var9 = CrazyCrystals.field_B;
          try {
            if (!param2) {
              var10 = (CharSequence) null;
              rf.a((CharSequence) null, -46);
            }
            var5 = param4.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if (0 <= var7_int) {
                  if (0 <= param0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_intLifetime1 = var5.indexOf('/', 1 + var6);
                if (var7_intLifetime1 >= 0) {
                  var6 = var7_intLifetime1;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/p=", 0, 3)) {
                var7_intLifetime2 = var5.indexOf('/', var6 + 1);
                if (var7_intLifetime2 >= 0) {
                  if (param3 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime2);
                    continue;
                  }
                  var6 = var7_intLifetime2;
                  continue;
                }
              }
              if (var5.regionMatches(var6, "/s=", 0, 3) ||
                var5.regionMatches(var6, "/c=", 0, 3)) {
                var7_intLifetime3 = var5.indexOf('/', 1 + var6);
                if (0 <= var7_intLifetime3) {
                  if (param1 == null) {
                    var6 = var7_intLifetime3;
                    continue;
                  }
                  var5 = var5.substring(0, var6) + var5.substring(var7_intLifetime3);
                  continue;
                }
              }
              break;
            }
            var7 = new StringBuilder(var6);
            discarded$0 = var7.append(var5.substring(0, var6));
            if (param0 > 0) {
              discarded$1 = var7.append("/l=");
              discarded$2 = var7.append(Integer.toString(param0));
            }
            if (param3 != null &&
              param3.length() > 0) {
              discarded$3 = var7.append("/p=");
              discarded$4 = var7.append(param3);
            }
            if (param1 != null &&
              0 < param1.length()) {
              discarded$5 = var7.append("/s=");
              discarded$6 = var7.append(param1);
            }
            if (var6 >= var5.length()) {
              discarded$7 = var7.append('/');
            } else {
              discarded$8 = var7.append(var5.substring(var6, var5.length()));
            }
            try {
              stackIn_41_0 = new java.net.URL(param4, var7.toString());
              return stackIn_41_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = (Exception) (Object) decompiledCaughtException;
              var8.printStackTrace();
              stackIn_43_0 = (java.net.URL) (param4);
              return stackIn_43_0;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_46_0 = var5_ref;
            stackIn_46_1 = new StringBuilder().append("rf.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_47_2 = "null";
            } else {
              stackIn_47_2 = "{...}";
            }
            stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_50_2 = "null";
            } else {
              stackIn_50_2 = "{...}";
            }
            stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
            if (param4 == null) {
              stackIn_53_2 = "null";
            } else {
              stackIn_53_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 > -75) {
          field_G = -115;
        }
        super.a(param0, param1, -113, param3);
        int var5 = -this.field_r + param1;
        int var6 = param0 - this.field_j;
        fo var7 = this.a(var6, var5, 3);
        if (var7 != null &&
          this.field_l != null) {
          ((im) ((Object) this.field_l)).a(var7.field_n, param3, this, (byte) -128);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.a(((fi) ((Object) this.field_i)).c((qm) (this), -1), param2, param0, param3, (byte) -52);
        if (param1 != 47) {
          this.field_B = (wb) null;
        }
    }

    boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rf.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, String param1, int param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = CrazyCrystals.field_B;
        try {
          if (param0 != 47) {
            this.field_B = (wb) null;
          }
          if (null == this.field_F ||
            param2 >= this.field_F.length) {
            var7 = new String[1 + param2];
            var8 = var7;
            var4 = var8;
            if (this.field_F != null) {
              for (var5 = 0; var5 < this.field_F.length; var5++) {
                var7[var5] = this.field_F[var5];
              }
            }
            this.field_F = var8;
          }
          this.field_F[param2] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("rf.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (byte) -33, param2, param3);
        if (param1 >= -12) {
          CharSequence var9 = (CharSequence) null;
          rf.a((CharSequence) null, 14);
        }
        if (0 != param3) {
          return;
        }
        fi var10 = (fi) ((Object) this.field_i);
        fo var6 = this.field_D;
        if (var6 == null) {
        } else {
          var7 = var10.a(-527227295, (qm) (this), param2);
          var8 = var10.a(param0, (byte) 50, (qm) (this));
          do {
            ci.a(var6.field_f + var7 - 2, -2 + (var6.field_h + var8), false, 2 + var6.field_l, var6.field_j + 2);
            var6 = var6.field_k;
          } while (var6 != null);
        }
    }

    rf(String param0, wo param1) {
        super(param0, (bi) null);
        this.field_D = null;
        try {
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, param4);
        this.b(true);
    }

    private final fo a(int param0, int param1, int param2) {
        fo var4;
        fo var5;
        int var6;
        java.net.URL var7;
        var6 = CrazyCrystals.field_B;
        if (param2 != 3) {
          var7 = (java.net.URL) null;
          rf.a(-35, (String) null, true, (String) null, (java.net.URL) null);
        }
        var4 = (fo) (this.field_B.g(32073));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (var5.field_f <= param1 &&
              var5.field_h <= param0 &&
              var5.field_f + var5.field_j > param1 &&
              param0 <= var5.field_l + var5.field_h) {
              return var4;
            }
            var5 = var5.field_k;
          }
          var4 = (fo) (this.field_B.a(false));
        }
        return null;
    }

    static {
        field_G = -1;
    }
}
