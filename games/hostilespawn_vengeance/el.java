/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class el extends fe {
    static int field_j;
    static int field_m;
    static long[] field_e;
    static String field_i;
    static de[] field_h;
    static bd field_f;
    static bd field_d;
    private java.net.ProxySelector field_k;
    static bd field_l;
    static String field_g;

    public static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (!param0) {
            el.a(-90, -101, -48);
          }
          field_g = null;
          field_i = null;
          field_e = null;
          field_h = null;
          field_d = null;
          field_f = null;
          field_l = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "el.E(" + param0 + ')');
        }
    }

    final static bd a(int param0, int param1, int param2) {
        bd var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        bd stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3 = new bd(param1, param1);
          if (param0 > -6) {
            field_m = -43;
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var4 < var3.field_D.length)))) {
            stackIn_11_0 = var3;
            if (var5 == 0) {
              stackIn_11_0.field_D[var4] = param2;
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = var3;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var3_ref), "el.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static double a(double param0, double param1, int param2, double param3, double param4) {
        RuntimeException var9 = null;
        double stackIn_4_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 16) {
            el.a((int[]) null, (int[]) null, -25, false, (pf) null, true, true);
          }
          stackIn_4_0 = Math.atan2(param0 - param1, param3 - param4) * 128.0 / 3.141592653589793;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var9), "el.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket var5 = null;
        RuntimeException var5_ref = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5 = new java.net.Socket(param3, param1);
          var5.setSoTimeout(10000);
          var6 = var5.getOutputStream();
          boolean decompiledSharedTail0 = (param2 != null);
          if (!decompiledSharedTail0) {
            var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            decompiledSharedTail0 = (var12 != 0);
          }
          if (decompiledSharedTail0) {
            var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          var6.flush();
          var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var5.getInputStream())));
          if (param0 != 10) {
            field_e = (long[]) null;
          }
          boolean decompiledFrameRemainder0 = true;
          var8 = var7.readLine();
          if (var8 != null) {
            if ((!var8.startsWith("HTTP/1.0 200") &&
              !var8.startsWith("HTTP/1.1 200")) &&
              (decompiledFrameRemainder0 = (var8.startsWith("HTTP/1.0 407") ||
              var8.startsWith("HTTP/1.1 407")))) {
              var9 = 0;
              var8 = var7.readLine();
              var10 = "proxy-authenticate: ";
              while (null != var8) {
                if (var9 < 50) {
                  if (var8.toLowerCase().startsWith(var10)) {
                    var8 = var8.substring(var10.length()).trim();
                    var11 = var8.indexOf(' ');
                    if (var11 != -1) {
                      var8 = var8.substring(0, var11);
                    }
                    throw new ab(var8);
                  }
                  var9++;
                  var8 = var7.readLine();
                  if (var12 == 0) {
                    continue;
                  }
                }
                break;
              }
              throw new ab("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_18_0 = var5;
              return stackIn_18_0;
            }
          }
          var6.close();
          var7.close();
          var5.close();
          stackIn_35_0 = null;
          return (java.net.Socket) (stackIn_35_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_39_0 = var5_ref;
          stackIn_39_1 = new StringBuilder().append("el.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param3 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final static void a(int[] param0, int[] param1, int param2, boolean param3, pf param4, boolean param5, boolean param6) {
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        var30 = HostileSpawn.field_I ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param1[3] >> 2;
          var22 = param1[4] >> 2;
          var23 = param1[5] >> 2;
          var24 = param1[6] >> 2;
          var25 = param1[7] >> 2;
          var26 = param1[8] >> 2;
          var27 = param1[9] >> 2;
          var28 = param1[10] >> 2;
          var29 = param1[11] >> 2;
          var13 = param0[4] * var25 + (var24 * param0[3] + param0[5] * var26) >> 14;
          var12 = param0[5] * var23 + var21 * param0[3] + var22 * param0[4] >> 14;
          var18 = var22 * param0[10] + param0[9] * var21 + var23 * param0[11] >> 14;
          var14 = param0[5] * var29 + var27 * param0[3] + param0[4] * var28 >> 14;
          var19 = var26 * param0[11] + var25 * param0[10] + var24 * param0[9] >> 14;
          var20 = var28 * param0[10] + (param0[9] * var27 + param0[11] * var29) >> 14;
          var16 = var25 * param0[7] + (param0[6] * var24 + param0[8] * var26) >> 14;
          var17 = var29 * param0[8] + var27 * param0[6] + var28 * param0[7] >> 14;
          var15 = param0[8] * var23 + var21 * param0[6] + var22 * param0[7] >> 14;
          var21Lifetime1 = -param1[0] + param0[0];
          var22Lifetime1 = param0[1] - param1[1];
          if (param2 != -12705) {
            field_h = (de[]) null;
          }
          var23Lifetime1 = param0[2] - param1[2];
          var9 = param1[3] * var21Lifetime1 - (-(var22Lifetime1 * param1[4]) - param1[5] * var23Lifetime1) >> -ih.field_w + 16;
          var10 = var22Lifetime1 * param1[7] + (param1[6] * var21Lifetime1 + param1[8] * var23Lifetime1) >> 16 - ih.field_w;
          var11 = param1[11] * var23Lifetime1 + param1[9] * var21Lifetime1 + param1[10] * var22Lifetime1 >> 16;
          var21Lifetime2 = ge.field_c;
          var22Lifetime2 = ge.field_b;
          var23Lifetime2 = 0;
          L3: while (true) {
            if (var23Lifetime2 < param4.field_c) {
              var24Lifetime1 = param4.field_n[var23Lifetime2];
              var25Lifetime1 = param4.field_E[var23Lifetime2];
              var26Lifetime1 = param4.field_H[var23Lifetime2];
              var27Lifetime1 = (var12 * var24Lifetime1 + var25Lifetime1 * var15 + var26Lifetime1 * var18 >> -ih.field_w + 16) + var9;
              var28Lifetime1 = (var19 * var26Lifetime1 + (var13 * var24Lifetime1 + var25Lifetime1 * var16) >> -ih.field_w + 16) + var10;
              var29Lifetime1 = (var26Lifetime1 * var20 + (var25Lifetime1 * var17 + var14 * var24Lifetime1) >> 16) + var11;
              stackIn_69_0 = var29Lifetime1;
              stackIn_69_1 = 50;
              if (var30 == 0) {
                if (stackIn_69_0 >= stackIn_69_1) {
                  tb.field_K[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  lc.field_c[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                  rb.field_p[var23Lifetime2] = var29Lifetime1;
                } else {
                  rb.field_p[var23Lifetime2] = -2147483648;
                }
                if (param5) {
                  dk.field_m[var23Lifetime2] = var27Lifetime1 >> ih.field_w;
                  sj.field_f[var23Lifetime2] = var28Lifetime1 >> ih.field_w;
                  ii.field_c[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (null != param4.field_v &&
                param4.field_p != null &&
                param4.field_e != null &&
                param4.field_Q != null &&
                null != param4.field_B &&
                null != param4.field_M &&
                null != param4.field_h &&
                param4.field_l != null &&
                param4.field_F != null) {
                var23Lifetime2 = 0;
                while (!(param4.field_k <= var23Lifetime2)) {
                  var24Lifetime1 = param4.field_v[var23Lifetime2];
                  var25Lifetime1 = param4.field_p[var23Lifetime2];
                  var26Lifetime1 = param4.field_e[var23Lifetime2];
                  ac.field_j[var23Lifetime2] = var9 + (var25Lifetime1 * var15 + (var24Lifetime1 * var12 + var18 * var26Lifetime1) >> 16);
                  ke.field_v[var23Lifetime2] = (var16 * var25Lifetime1 + var24Lifetime1 * var13 + var26Lifetime1 * var19 >> 16) + var10;
                  vi.field_m[var23Lifetime2] = var11 + (var26Lifetime1 * var20 + var25Lifetime1 * var17 + var14 * var24Lifetime1 >> 16);
                  var24Lifetime1 = param4.field_Q[var23Lifetime2];
                  var25Lifetime1 = param4.field_B[var23Lifetime2];
                  var26Lifetime1 = param4.field_M[var23Lifetime2];
                  lk.field_M[var23Lifetime2] = (var25Lifetime1 * var15 + (var24Lifetime1 * var12 + var26Lifetime1 * var18) >> 16) + var9;
                  fm.field_c[var23Lifetime2] = (var13 * var24Lifetime1 + var16 * var25Lifetime1 + var19 * var26Lifetime1 >> 16) + var10;
                  l.field_c[var23Lifetime2] = (var25Lifetime1 * var17 + var24Lifetime1 * var14 + var20 * var26Lifetime1 >> 16) + var11;
                  var24Lifetime1 = param4.field_h[var23Lifetime2];
                  var25Lifetime1 = param4.field_l[var23Lifetime2];
                  var26Lifetime1 = param4.field_F[var23Lifetime2];
                  se.field_d[var23Lifetime2] = (var18 * var26Lifetime1 + var25Lifetime1 * var15 + var12 * var24Lifetime1 >> 16) + var9;
                  ae.field_q[var23Lifetime2] = var10 + (var19 * var26Lifetime1 + var13 * var24Lifetime1 + var16 * var25Lifetime1 >> 16);
                  gi.field_l[var23Lifetime2] = (var24Lifetime1 * var14 + (var17 * var25Lifetime1 + var20 * var26Lifetime1) >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param3) {
                var9 = param0[3];
                var10 = param0[4];
                var11 = param0[5];
                var12 = param0[6];
                var13 = param0[7];
                var14 = param0[8];
                var15 = param0[9];
                var16 = param0[10];
                var17 = param0[11];
                var18 = 0;
                while (!(var18 >= param4.field_L)) {
                  stackIn_69_0 = ~oa.field_c.length;
                  stackIn_69_1 = ~var18;
                  if (var30 != 0) {
                    break L3;
                  }
                  if (stackIn_69_0 >= stackIn_69_1) {
                    break;
                  }
                  var19 = param4.field_u[var18];
                  var20 = param4.field_w[var18];
                  var21Lifetime2 = param4.field_r[var18];
                  oa.field_c[var18] = var9 * var19 - (-(var20 * var12) - var15 * var21Lifetime2) >> 16;
                  in.field_c[var18] = var21Lifetime2 * var16 + (var13 * var20 + var10 * var19) >> 16;
                  dl.field_o[var18] = var20 * var14 + var19 * var11 + var17 * var21Lifetime2 >> 16;
                  var18++;
                }
              }
              stackIn_69_0 = var8;
              stackIn_69_1 = var7_int;
            }
            break;
          }
          pc.a(stackIn_69_0, stackIn_69_1, param6, param4, (byte) 106);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_74_0 = var7;
          stackIn_74_1 = new StringBuilder().append("el.B(");
          if (param0 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',');
          if (param1 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, p param1, int param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1.field_e >= 0) {
            sj.field_e.a(true, 128, (int)param1.field_c, param0, param3);
          }
          if (param2 > -86) {
            el.a((int[]) null, (int[]) null, 87, true, (pf) null, true, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("el.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        Exception exception = null;
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        java.net.InetSocketAddress var5 = null;
        Object var6 = null;
        Class var7 = null;
        java.lang.reflect.Method var8 = null;
        Object var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        java.lang.reflect.Method var12 = null;
        String var13 = null;
        String var14 = null;
        java.net.Socket stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param0.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_4_0 = this.b(117);
            return stackIn_4_0;
          }
          var3 = param0.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            stackIn_9_0 = null;
            return (java.net.Socket) (stackIn_9_0);
          }
          var4 = -85 % ((-67 - param1) / 46);
          var5 = (java.net.InetSocketAddress) ((Object) var3);
          if (param0.type() != java.net.Proxy.Type.HTTP) {
            if (param0.type() != java.net.Proxy.Type.SOCKS) {
              stackIn_23_0 = null;
              return (java.net.Socket) (stackIn_23_0);
            }
            var6 = new java.net.Socket(param0);
            ((java.net.Socket) (var6)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_b)));
            stackIn_21_0 = var6;
            return (java.net.Socket) (stackIn_21_0);
          }
          var6 = null;
          try {
            var7 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
            var8 = var7.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
            var8.setAccessible(true);
            var9 = var8.invoke((Object) null, new Object[]{var5.getHostName(), new Integer(var5.getPort())});
            if (null != var9) {
              var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
              var10.setAccessible(true);
              if (((Boolean) (var10.invoke(var9, new Object[]{}))).booleanValue()) {
                var11 = var7.getDeclaredMethod("getHeaderName", new Class[]{});
                var11.setAccessible(true);
                var12 = var7.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                var12.setAccessible(true);
                var13 = (String) (var11.invoke(var9, new Object[]{}));
                var14 = (String) (var12.invoke(var9, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                var6 = var13 + ": " + var14;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_18_0 = this.a(10, var5.getPort(), (String) (var6), var5.getHostName());
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var3_ref;
          stackIn_27_1 = new StringBuilder().append("el.F(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int c(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 9) {
            stackIn_4_0 = ae.field_s;
            return stackIn_4_0;
          }
          stackIn_2_0 = 47;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "el.I(" + param0 + ')');
        }
    }

    final java.net.Socket a(int param0) throws IOException {
        int stackIn_8_0 = 0;
        java.net.ProxySelector stackIn_12_0;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        StringBuilder stackIn_12_3;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        String stackIn_13_4 = null;
        java.net.ProxySelector stackIn_16_0;
        java.net.URI stackIn_16_1;
        java.net.URI stackIn_16_2;
        StringBuilder stackIn_16_3;
        java.net.URI stackIn_17_1;
        java.net.URI stackIn_17_2;
        String stackIn_17_4;
        java.net.Socket stackIn_20_0 = null;
        java.net.Socket stackIn_30_0 = null;
        java.net.Socket stackIn_42_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        ab var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          var2_int = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")) ? 1 : 0;
          if (var2_int == 0) {
            System.setProperty("java.net.useSystemProxies", "true");
          }
          stackIn_8_0 = (this.field_b != 443) ? 0 : 1;
          var5 = stackIn_8_0;
          try {
            stackIn_12_0 = this.field_k;
            stackIn_12_1 = null;
            stackIn_12_2 = null;
            stackIn_12_3 = new StringBuilder();
            if (var5 != 0) {
              stackIn_13_1 = null;
              stackIn_13_2 = null;
              stackIn_13_4 = "https";
            } else {
              stackIn_13_1 = null;
              stackIn_13_2 = null;
              stackIn_13_4 = "http";
            }
            var3 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_12_3).append(stackIn_13_4).append("://").append(this.field_a).toString()));
            stackIn_16_0 = this.field_k;
            stackIn_16_1 = null;
            stackIn_16_2 = null;
            stackIn_16_3 = new StringBuilder();
            if (var5 != 0) {
              stackIn_17_1 = null;
              stackIn_17_2 = null;
              stackIn_17_4 = "http";
            } else {
              stackIn_17_1 = null;
              stackIn_17_2 = null;
              stackIn_17_4 = "https";
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_16_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_16_3).append(stackIn_17_4).append("://").append(this.field_a).toString()));
          } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
            stackIn_20_0 = this.b(98);
            return stackIn_20_0;
          }
          var3.addAll((Collection) ((Object) var4));
          var6_array = var3.toArray();
          var7 = null;
          var8 = var6_array;
          var9 = 0;
          L6: while (true) {
            if (var8.length > var9) {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                var12 = this.a(var11, (byte) -117);
                stackIn_42_0 = var12;
                if (var13 != 0) {
                  decompiledRegionSelector0 = 0;
                } else {
                  if (stackIn_42_0 != null) {
                    stackIn_30_0 = var12;
                    return stackIn_30_0;
                  }
                  decompiledRegionSelector0 = 1;
                }
              } catch (ab decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var12_ref = (ab) (Object) decompiledCaughtException;
                var7 = var12_ref;
                decompiledRegionSelector0 = 1;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var12_ref2 = (IOException) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                break L6;
              }
              var9++;
              if (var13 == 0) {
                continue;
              }
            }
            if (param0 != 31067) {
              field_e = (long[]) null;
            }
            if (var7 != null) {
              throw el.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
            }
            stackIn_42_0 = this.b(param0 - 30986);
            break;
          }
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "el.D(" + param0 + ')');
        }
    }

    el() {
        try {
          this.field_k = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "el.<init>()");
        }
    }

    static {
        field_m = 0;
        field_h = new de[2];
        field_i = "points";
        field_e = new long[32];
        field_j = 0;
        field_g = "The lift has a security lock on it. There should be a security console to turn it off somewhere.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
