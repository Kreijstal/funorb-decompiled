/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jnb extends rqa {
    static java.math.BigInteger field_p;
    static int field_o;

    public static void a(int param0) {
        field_p = null;
        int var1 = 24 / ((param0 + 45) / 52);
    }

    final static boolean e(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 < 9) {
          jnb.a(24);
        }
        stackIn_6_0 = (rnb.a(0)) && ((kdb.field_o & 8) == 0);
        return stackIn_6_0;
    }

    final static void a(eab param0, int param1, ds param2, boolean param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_38_0 = null;
          StringBuilder stackIn_38_1 = null;
          String stackIn_39_2 = null;
          StringBuilder stackIn_41_1 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          ds var15 = null;
          String var16 = null;
          String var17 = null;
          int var18 = 0;
          mv var19 = null;
          byte[][] var20 = null;
          String var21 = null;
          String var22 = null;
          byte[][] var23 = null;
          int var13Lifetime1;
          var14 = VoidHunters.field_G;
          try {
            if (param3) {
              var15 = (ds) null;
              jnb.a((eab) null, 59, (ds) null, false);
            }
            var19 = new mv();
            var19.field_i = param2.e((byte) -90);
            var19.field_d = param2.h(26);
            var19.field_e = new mob[var19.field_i];
            var19.field_j = new int[var19.field_i];
            var19.field_f = new byte[var19.field_i][][];
            var19.field_g = new mob[var19.field_i];
            var19.field_h = new int[var19.field_i];
            var19.field_k = new int[var19.field_i];
            for (var5 = 0; var19.field_i > var5; var5++) {
              try {
                var6_int = param2.e((byte) -114);
                if (0 != var6_int &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var21 = param2.a(-1);
                    var22 = param2.a(-1);
                    var9 = param2.e((byte) -92);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param2.a(-1);
                    }
                    var23 = new byte[var9][];
                    var20 = var23;
                    var11 = var20;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param2.h(62);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param2.a(0, var23[var12_int], (byte) -59, var13);
                      }
                    }
                    var19.field_h[var5] = var6_int;
                    var12 = new Class[var9];
                    var18 = 0;
                    var13Lifetime1 = var18;
                    while (var9 > var18) {
                      var12[var18] = beb.a(var10[var18], (byte) 99);
                      var18++;
                    }
                    var19.field_e[var5] = param0.a(var12, (byte) 95, beb.a(var21, (byte) 99), var22);
                    var19.field_f[var5] = var23;
                  }
                } else {
                  var17 = param2.a(-1);
                  var16 = param2.a(-1);
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param2.h(40);
                  }
                  var19.field_h[var5] = var6_int;
                  var19.field_j[var5] = var9;
                  var19.field_g[var5] = param0.a(var16, beb.a(var17, (byte) 99), -6576);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var19.field_k[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var19.field_k[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var19.field_k[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var19.field_k[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var19.field_k[var5] = -5;
              }
            }
            tma.field_r.b(-10258, var19);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = var4;
            stackIn_38_1 = new StringBuilder().append("jnb.D(");
            if (param0 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    jnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          si.a(38, 62, param0[0].a(118));
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jnb.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_o = 1;
    }
}
