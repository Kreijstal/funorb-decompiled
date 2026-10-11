/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    private long[] field_n;
    static fc field_a;
    static int field_g;
    static int field_e;
    private byte[] field_c;
    static String field_d;
    private long[] field_k;
    private int field_j;
    private byte[] field_l;
    private long[] field_o;
    private long[] field_h;
    static dl field_b;
    private int field_i;
    private long[] field_m;
    static String field_f;

    private final void a(int param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        un var7;
        int var8;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = CrazyCrystals.field_B;
        var2 = 0;
        var3 = 0;
        while (8 > var2) {
          this.field_k[var2] = km.a(km.a(ao.a((long)this.field_c[var3 + 6] << 8, 65280L), km.a(km.a(km.a(km.a(ao.a((long)this.field_c[2 + var3], 255L) << 40, km.a((long)this.field_c[var3] << 56, ao.a((long)this.field_c[var3 + 1], 255L) << 48)), ao.a(255L, (long)this.field_c[var3 + 3]) << 32), ao.a((long)this.field_c[var3 + 4] << 24, 4278190080L)), ao.a((long)this.field_c[var3 + 5], 255L) << 16)), ao.a(255L, (long)this.field_c[var3 + 7]));
          var3 += 8;
          var2++;
        }
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          dupTemp$0 = this.field_h[var2Lifetime1];
          arrayValue$1 = this.field_k[var2Lifetime1];
          this.field_o[var2Lifetime1] = dupTemp$0;
          this.field_n[var2Lifetime1] = km.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_m[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (var4 < 8) {
              this.field_m[var3Lifetime1] = km.a(this.field_m[var3Lifetime1], so.field_b[var4][pf.b((int)(this.field_o[pf.b(7, -var4 + var3Lifetime1)] >>> var5), 255)]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; 8 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
            this.field_o[var3Lifetime1Lifetime1] = this.field_m[var3Lifetime1Lifetime1];
          }
          this.field_o[0] = km.a(this.field_o[0], so.field_a[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_m[var3Lifetime1Lifetime2] = this.field_o[var3Lifetime1Lifetime2];
            var8 = 0;
            var4Lifetime1 = var8;
            var5Lifetime1 = 56;
            while (var8 < 8) {
              this.field_m[var3Lifetime1Lifetime2] = km.a(this.field_m[var3Lifetime1Lifetime2], so.field_b[var8][pf.b(255, (int)(this.field_n[pf.b(var3Lifetime1Lifetime2 - var8, 7)] >>> var5Lifetime1))]);
              var5Lifetime1 -= 8;
              var8++;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; var3Lifetime1Lifetime3 < 8; var3Lifetime1Lifetime3++) {
            this.field_n[var3Lifetime1Lifetime3] = this.field_m[var3Lifetime1Lifetime3];
          }
        }
        if (param0 != 18236) {
          var7 = (un) null;
          ah.a((ng) null, -120, 88, (un) null);
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_h[var2Lifetime3] = km.a(this.field_h[var2Lifetime3], km.a(this.field_k[var2Lifetime3], this.field_n[var2Lifetime3]));
        }
    }

    final static void a(ng param0, int param1, int param2, un param3) {
        try {
          int var6 = 0;
          int var12_int = 0;
          int var13_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_36_0 = null;
          StringBuilder stackIn_36_1 = null;
          String stackIn_37_2 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var5 = 0;
          int var7_int = 0;
          ClassNotFoundException var7 = null;
          SecurityException var7_ref = null;
          NullPointerException var7_ref2 = null;
          Exception var7_ref3 = null;
          Throwable var7_ref4 = null;
          String var8 = null;
          String var9 = null;
          int var10 = 0;
          String[] var11 = null;
          byte[][] var12 = null;
          Class[] var13 = null;
          int var14 = 0;
          int var15 = 0;
          String var16 = null;
          String var17 = null;
          int var18 = 0;
          pi var19 = null;
          byte[][] var20 = null;
          String var21 = null;
          String var22 = null;
          byte[][] var23 = null;
          int var14Lifetime1;
          var15 = CrazyCrystals.field_B;
          try {
            var19 = new pi();
            var19.field_i = param0.h(255);
            var19.field_l = param0.b((byte) -61);
            var19.field_g = new int[var19.field_i];
            var5 = 115 % ((-71 - param2) / 52);
            var19.field_m = new gb[var19.field_i];
            var19.field_n = new int[var19.field_i];
            var19.field_f = new int[var19.field_i];
            var19.field_h = new byte[var19.field_i][][];
            var19.field_k = new gb[var19.field_i];
            for (var6 = 0; var6 < var19.field_i; var6++) {
              try {
                var7_int = param0.h(255);
                if (0 != var7_int &&
                  var7_int != 1 &&
                  2 != var7_int) {
                  if (var7_int == 3 ||
                    var7_int == 4) {
                    var21 = param0.i(122);
                    var22 = param0.i(115);
                    var10 = param0.h(255);
                    var11 = new String[var10];
                    for (var12_int = 0; var12_int < var10; var12_int++) {
                      var11[var12_int] = param0.i(116);
                    }
                    var23 = new byte[var10][];
                    var20 = var23;
                    var12 = var20;
                    if (var7_int == 3) {
                      for (var13_int = 0; var10 > var13_int; var13_int++) {
                        var14 = param0.b((byte) 126);
                        array$0 = new byte[var14];
                        var12[var13_int] = array$0;
                        param0.a(var14, var23[var13_int], (byte) -89, 0);
                      }
                    }
                    var19.field_f[var6] = var7_int;
                    var13 = new Class[var10];
                    var18 = 0;
                    var14Lifetime1 = var18;
                    while (var18 < var10) {
                      var13[var18] = nh.a((byte) 121, var11[var18]);
                      var18++;
                    }
                    var19.field_m[var6] = param3.a((byte) -93, nh.a((byte) -126, var21), var13, var22);
                    var19.field_h[var6] = var23;
                  }
                } else {
                  var17 = param0.i(111);
                  var8 = var17;
                  var16 = param0.i(115);
                  var9 = var16;
                  var10 = 0;
                  if (var7_int == 1) {
                    var10 = param0.b((byte) 126);
                  }
                  var19.field_f[var6] = var7_int;
                  var19.field_g[var6] = var10;
                  var19.field_k[var6] = param3.a(22, var16, nh.a((byte) -105, var17));
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var19.field_n[var6] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var7_ref = (SecurityException) (Object) decompiledCaughtException;
                var19.field_n[var6] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var19.field_n[var6] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var7_ref3 = (Exception) (Object) decompiledCaughtException;
                var19.field_n[var6] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var7_ref4 = decompiledCaughtException;
                var19.field_n[var6] = -5;
              }
            }
            hc.field_b.b(0, var19);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_36_0 = var4;
            stackIn_36_1 = new StringBuilder().append("ah.C(");
            if (param0 == null) {
              stackIn_37_2 = "null";
            } else {
              stackIn_37_2 = "{...}";
            }
            stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, long param1, byte[] param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var8Lifetime1;
        var13 = CrazyCrystals.field_B;
        try {
          var5_int = 0;
          var6 = 7 & 8 - ((int)param1 & 7);
          var7 = this.field_i & 7;
          var9 = param1;
          if (param0 != -82) {
            this.field_n = (long[]) null;
          }
          var11 = 31;
          var12 = 0;
          while (var11 >= 0) {
            var12 = var12 + (((int)var9 & 255) + (255 & this.field_l[var11]));
            this.field_l[var11] = (byte)var12;
            var12 = var12 >>> 8;
            var9 = var9 >>> 8;
            var11--;
          }
          while (8L < param1) {
            var8 = 255 & param2[var5_int] << var6 | (param2[var5_int + 1] & 255) >>> -var6 + 8;
            if (0 <= var8 &&
              var8 < 256) {
              this.field_c[this.field_j] = (byte)hm.a((int) this.field_c[this.field_j], var8 >>> var7);
              this.field_i = this.field_i + (8 - var7);
              this.field_j = this.field_j + 1;
              if (this.field_i == 512) {
                this.a(18236);
                this.field_i = 0;
                this.field_j = 0;
              }
              this.field_c[this.field_j] = (byte)pf.b(var8 << -var7 + 8, 255);
              param1 = param1 - 8L;
              this.field_i = this.field_i + var7;
              var5_int++;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (param1 <= 0L) {
            var8Lifetime1 = 0;
          } else {
            var8Lifetime1 = param2[var5_int] << var6 & 255;
            this.field_c[this.field_j] = (byte)hm.a((int) this.field_c[this.field_j], var8Lifetime1 >>> var7);
          }
          if (param1 + (long)var7 < 8L) {
            this.field_i = (int)((long)this.field_i + param1);
          } else {
            this.field_j = this.field_j + 1;
            param1 = param1 - (long)(8 - var7);
            this.field_i = this.field_i + (8 - var7);
            if (this.field_i == 512) {
              this.a(18236);
              this.field_j = 0;
              this.field_i = 0;
            }
            this.field_c[this.field_j] = (byte)pf.b(var8Lifetime1 << -var7 + 8, 255);
            this.field_i = this.field_i + (int)param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("ah.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void a(String param0, int param1, int param2, byte param3, int param4) {
        try {
          int var5_int = 108 % ((param3 - 31) / 54);
          aj.a(32293, 32, param1, param4, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ah.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        if (param0 != 40) {
          return;
        }
        field_f = null;
    }

    final static String a(boolean param0, java.applet.Applet param1, String param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          java.applet.Applet var8 = null;
          String stackIn_9_0 = null;
          Object stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = CrazyCrystals.field_B;
          try {
            try {
              var3 = (String) (hi.a(param1, "getcookies", -92));
              if (!param0) {
                var8 = (java.applet.Applet) null;
                ah.a(33, (String) null, (java.applet.Applet) null);
              }
              var4 = ik.a(var3, (byte) -76, ';');
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(param2)) {
                  stackIn_9_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_14_0 = null;
            return (String) (stackIn_14_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("ah.J(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
            if (param2 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 5236) {
            field_f = (String) null;
          }
          stackIn_3_0 = ci.field_i.a(7693, param0, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ah.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte[] param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          this.field_c[this.field_j] = (byte)hm.a((int) this.field_c[this.field_j], 128 >>> pf.b(7, this.field_i));
          this.field_j = this.field_j + 1;
          if (!param1) {
            ah.a((byte) -28);
          }
          if (this.field_j > 32) {
            while (64 > this.field_j) {
              fieldTemp$0 = this.field_j;
              this.field_j = this.field_j + 1;
              this.field_c[fieldTemp$0] = (byte) 0;
            }
            this.a(18236);
            this.field_j = 0;
          }
          while (this.field_j < 32) {
            fieldTemp$1 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_c[fieldTemp$1] = (byte) 0;
          }
          eg.a(this.field_l, 0, this.field_c, 32, 32);
          this.a(18236);
          var4_int = 0;
          var5 = param2;
          while (var4_int < 8) {
            var6 = this.field_h[var4_int];
            param0[var5] = (byte)(int)(var6 >>> 56);
            param0[var5 + 1] = (byte)(int)(var6 >>> 48);
            param0[2 + var5] = (byte)(int)(var6 >>> 40);
            param0[3 + var5] = (byte)(int)(var6 >>> 32);
            param0[4 + var5] = (byte)(int)(var6 >>> 24);
            param0[var5 + 5] = (byte)(int)(var6 >>> 16);
            param0[var5 + 6] = (byte)(int)(var6 >>> 8);
            param0[7 + var5] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ah.E(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var4 = null;
          String var5 = null;
          String var6 = null;
          String var7 = null;
          String var8 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            to.field_f = param1;
            try {
              if (param0 > -46) {
                var6 = (String) null;
                ah.a((String) null, -38);
              }
              var7 = param2.getParameter("cookieprefix");
              var5 = var7;
              var5Lifetime1 = var7;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var8;
              var5Lifetime5 = var8;
              if (0 != param1.length()) {
                var5Lifetime6 = var8 + "; Expires=" + sm.a(lo.a((byte) -101) + 94608000000L, (byte) 126) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              hi.a("document.cookie=\"" + var5Lifetime6 + "\"", param2, (byte) -98);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            hk.a(112, param2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("ah.D(").append(param0).append(',');
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
            throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var4 = CrazyCrystals.field_B;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_l[var2] = (byte) 0;
        }
        this.field_c[0] = (byte) 0;
        this.field_j = 0;
        this.field_i = 0;
        var2Lifetime1 = 0;
        int var3 = -31 / ((61 - param0) / 51);
        while (var2Lifetime1 < 8) {
          this.field_h[var2Lifetime1] = 0L;
          var2Lifetime1++;
        }
    }

    ah() {
        this.field_o = new long[8];
        this.field_j = 0;
        this.field_c = new byte[64];
        this.field_i = 0;
        this.field_l = new byte[32];
        this.field_h = new long[8];
        this.field_m = new long[8];
        this.field_n = new long[8];
        this.field_k = new long[8];
    }

    static {
        field_g = 0;
        field_d = "END";
        field_a = new fc(16);
        field_f = "Laser Beam";
    }
}
