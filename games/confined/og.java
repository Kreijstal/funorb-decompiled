/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class og extends n {
    static float field_h;
    static double[] field_g;
    private java.net.ProxySelector field_j;
    static bi field_f;
    static e field_i;

    public static void d(int param0) {
        int var1 = 13 / ((param0 + 72) / 34);
        field_f = null;
        field_g = null;
        field_i = null;
    }

    final static boolean a(int param0, char param1) {
        if (param0 == -96) {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (ld.a((byte) -21, param1)) {
            return true;
          }
          if (param1 != 45 &&
            param1 != 160 &&
            param1 != 32 &&
            param1 != 95) {
            return false;
          }
          return true;
        }
        field_g = (double[]) null;
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (ld.a((byte) -21, param1)) {
          return true;
        }
        if (param1 == 45) {
          return true;
        }
        if (param1 == 160) {
          return true;
        }
        if (param1 != 32 &&
          param1 != 95) {
          return false;
        }
        return true;
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
        java.net.Socket stackIn_11_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        be var13 = null;
        java.net.Socket var14 = null;
        String var15 = null;
        String var16 = null;
        var12 = Confined.field_J ? 1 : 0;
        try {
          var14 = new java.net.Socket(param0, param2);
          var14.setSoTimeout(10000);
          var6 = var14.getOutputStream();
          if (param1 == null) {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_b + ":" + this.field_c + " HTTP/1.0\n" + param1 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          var6.flush();
          var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var14.getInputStream())));
          if (param3 != 0) {
            var13 = (be) null;
            og.a((byte) -66, (mi) null, (be) null, -29);
          }
          boolean decompiledFrameRemainder0 = true;
          var15 = var7.readLine();
          if (var15 != null) {
            if ((!var15.startsWith("HTTP/1.0 200") &&
              !var15.startsWith("HTTP/1.1 200")) &&
              (decompiledFrameRemainder0 = (var15.startsWith("HTTP/1.0 407") ||
              var15.startsWith("HTTP/1.1 407")))) {
              var9 = 0;
              var10 = "proxy-authenticate: ";
              var8 = var7.readLine();
              while (var8 != null) {
                if (50 > var9) {
                  if (!var8.toLowerCase().startsWith(var10)) {
                    var9++;
                    var8 = var7.readLine();
                    continue;
                  }
                  var16 = var8.substring(var10.length()).trim();
                  var8 = var16;
                  var11 = var16.indexOf(' ');
                  if (var11 != -1) {
                    var8 = var16.substring(0, var11);
                  }
                  throw new kk(var8);
                }
                break;
              }
              throw new kk("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_11_0 = var14;
              return stackIn_11_0;
            }
          }
          var6.close();
          var7.close();
          var14.close();
          stackIn_27_0 = null;
          return (java.net.Socket) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("og.J(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        int var9 = 0;
        int stackIn_6_0 = 0;
        java.net.ProxySelector stackIn_9_0;
        java.net.URI stackIn_9_1;
        java.net.URI stackIn_9_2;
        StringBuilder stackIn_9_3;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        String stackIn_10_4 = null;
        java.net.ProxySelector stackIn_12_0;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        StringBuilder stackIn_12_3;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        String stackIn_13_4 = null;
        java.net.Socket stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        kk var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = Confined.field_J ? 1 : 0;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_6_0 = (443 != this.field_c) ? 0 : 1;
        var5 = stackIn_6_0;
        try {
          stackIn_9_0 = this.field_j;
          stackIn_9_1 = null;
          stackIn_9_2 = null;
          stackIn_9_3 = new StringBuilder();
          if (var5 == 0) {
            stackIn_10_1 = null;
            stackIn_10_2 = null;
            stackIn_10_4 = "http";
          } else {
            stackIn_10_1 = null;
            stackIn_10_2 = null;
            stackIn_10_4 = "https";
          }
          var3 = ((java.net.ProxySelector) (Object) stackIn_9_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_9_3).append(stackIn_10_4).append("://").append(this.field_b).toString()));
          stackIn_12_0 = this.field_j;
          stackIn_12_1 = null;
          stackIn_12_2 = null;
          stackIn_12_3 = new StringBuilder();
          if (var5 == 0) {
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_4 = "https";
          } else {
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_4 = "http";
          }
          var4 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_12_3).append(stackIn_13_4).append("://").append(this.field_b).toString()));
          if (param0 != -22176) {
            og.a(false);
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.c(param0 ^ 30609);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        for (var9 = 0; var8.length > var9; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (kk) null;
            var12 = this.a(param0 ^ 22172, var11);
            if (var12 != null) {
              stackIn_24_0 = var12;
              return stackIn_24_0;
            }
          } catch (kk decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (kk) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (var7 != null) {
          throw og.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
        }
        return this.c(param0 ^ 30609);
    }

    final static jg e(int param0) {
        if (param0 != 1) {
          field_g = (double[]) null;
          return (jg) ((Object) new q());
        }
        return (jg) ((Object) new q());
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        Object stackIn_13_0 = null;
        java.net.Socket stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        Object var5 = null;
        Class var6 = null;
        Exception var6_ref = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        try {
          if (param1.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_3_0 = this.c(param0 ^ 8461);
            return stackIn_3_0;
          }
          if (param0 != -4) {
            og.a(true, (byte) 97);
          }
          var3 = param1.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            return null;
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param1.type() != java.net.Proxy.Type.HTTP) {
            if (param1.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            var5 = new java.net.Socket(param1);
            ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_c)));
            stackIn_13_0 = var5;
            return (java.net.Socket) (stackIn_13_0);
          }
          var5 = null;
          try {
            var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
            var6 = var14;
            var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
            var7.setAccessible(true);
            var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
            if (var8 != null) {
              var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
              var9.setAccessible(true);
              if (((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                var10.setAccessible(true);
                var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                var11.setAccessible(true);
                var12 = (String) (var10.invoke(var8, new Object[]{}));
                var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_b + "/"), "https"}));
                var5 = var12 + ": " + var13;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_23_0 = this.a(var4.getHostName(), (String) (var5), var4.getPort(), 0);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var3_ref;
          stackIn_26_1 = new StringBuilder().append("og.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static jb a(boolean param0, byte param1) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        jb var12;
        bd var15;
        bd var16;
        bd var17;
        bd var18;
        bd var19;
        bd var20;
        bd var21;
        bd var22;
        bd var23;
        bd var24;
        bd var25;
        bd var26;
        bd var27;
        bd var28;
        bd var29;
        bd var30;
        bd var31;
        bd var32;
        bd var33;
        jb stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        var9 = Confined.field_J ? 1 : 0;
        var12 = new jb(11);
        stackIn_2_0 = var12;
        stackIn_3_1 = (!param0) ? false : true;
        stackIn_2_0.field_a = stackIn_3_1;
        if (param0) {
          var12.a((byte) -78, new bd(14, tn.field_C, pn.field_a));
          if (!param0) {
            var12.a((byte) -116, new bd(2, mk.field_k, pn.field_a));
            var12.a((byte) -53, new bd(3, ea.field_e, pn.field_a));
            var12.a((byte) -80, new bd(4, ef.field_ub, pn.field_a));
          } else {
            if (!of.field_a &&
              null == qn.field_v.field_K) {
              var12.a((byte) -71, new bd(2, mk.field_k, pn.field_a));
              var15 = new bd(5, qa.field_e, pn.field_a);
              var16 = new bd(6, cc.field_p, pn.field_a);
              var5 = var15.field_f;
              if (var16.field_f > var5) {
                var5 = var16.field_f;
              }
              var16.field_f = var5;
              var15.field_f = var5;
              var12.a((byte) -70, var15);
              var12.a((byte) -87, var16);
            }
          }
          var17 = new bd(7, rb.field_h, pn.field_a);
          var18 = new bd(8, mg.field_d, pn.field_a);
          var19 = new bd(9, pm.field_u, pn.field_a);
          var6 = var17.field_f;
          if (var6 < var18.field_f) {
            var6 = var18.field_f;
          }
          if (var19.field_f > var6) {
            var6 = var19.field_f;
          }
          var19.field_f = var6;
          var18.field_f = var6;
          var17.field_f = var6;
          var12.a((byte) -52, var17);
          var12.a((byte) -115, var18);
          var12.a((byte) -113, var19);
          var7 = 1;
          if (param0 &&
            sg.field_x <= 0) {
            var7 = 0;
          }
          if (var7 != 0) {
            var12.a((byte) -61, new bd(10, nn.field_v, pn.field_a));
          }
          if (param1 != 55) {
            og.a(38, '%');
          }
          if (!param0) {
            var12.a((byte) -119, new bd(11, li.field_n, pn.field_a));
            var12.a((byte) -114, new bd(12, hh.field_b, pn.field_a));
            var12.a((byte) -78, new bd(13, w.field_Q, pn.field_a));
          } else {
            var12.a((byte) -59, new bd(15, hn.field_e, pn.field_a));
          }
        } else {
          var12.a((byte) -63, new bd(1, qj.field_d, pn.field_a));
          if (!param0) {
            var12.a((byte) -116, new bd(2, mk.field_k, pn.field_a));
            var12.a((byte) -53, new bd(3, ea.field_e, pn.field_a));
            var12.a((byte) -80, new bd(4, ef.field_ub, pn.field_a));
            var31 = new bd(7, rb.field_h, pn.field_a);
            var32 = new bd(8, mg.field_d, pn.field_a);
            var33 = new bd(9, pm.field_u, pn.field_a);
            var6 = var31.field_f;
            if (var6 < var32.field_f) {
              var6 = var32.field_f;
            }
            if (var33.field_f > var6) {
              var6 = var33.field_f;
            }
            var33.field_f = var6;
            var32.field_f = var6;
            var31.field_f = var6;
            var12.a((byte) -52, var31);
            var12.a((byte) -115, var32);
            var12.a((byte) -113, var33);
            var7 = 1;
            if (param0 &&
              sg.field_x <= 0) {
              var7 = 0;
            }
            if (var7 != 0) {
              var12.a((byte) -61, new bd(10, nn.field_v, pn.field_a));
            }
            if (param1 != 55) {
              og.a(38, '%');
              if (!param0) {
                var12.a((byte) -119, new bd(11, li.field_n, pn.field_a));
                var12.a((byte) -114, new bd(12, hh.field_b, pn.field_a));
                var12.a((byte) -78, new bd(13, w.field_Q, pn.field_a));
              } else {
                var12.a((byte) -59, new bd(15, hn.field_e, pn.field_a));
              }
            } else {
              if (param0) {
                var12.a((byte) -59, new bd(15, hn.field_e, pn.field_a));
              } else {
                var12.a((byte) -119, new bd(11, li.field_n, pn.field_a));
                var12.a((byte) -114, new bd(12, hh.field_b, pn.field_a));
                var12.a((byte) -78, new bd(13, w.field_Q, pn.field_a));
              }
            }
          } else {
            if (of.field_a) {
              var20 = new bd(7, rb.field_h, pn.field_a);
              var21 = new bd(8, mg.field_d, pn.field_a);
              var22 = new bd(9, pm.field_u, pn.field_a);
              var6 = var20.field_f;
              if (var6 < var21.field_f) {
                var6 = var21.field_f;
              }
              if (var22.field_f > var6) {
                var6 = var22.field_f;
              }
              var22.field_f = var6;
              var21.field_f = var6;
              var20.field_f = var6;
              var12.a((byte) -52, var20);
              var12.a((byte) -115, var21);
              var12.a((byte) -113, var22);
              var7 = 1;
              if (param0 &&
                sg.field_x <= 0) {
                var7 = 0;
              }
              if (var7 != 0) {
                var12.a((byte) -61, new bd(10, nn.field_v, pn.field_a));
              }
              if (param1 != 55) {
                og.a(38, '%');
                if (!param0) {
                  var12.a((byte) -119, new bd(11, li.field_n, pn.field_a));
                  var12.a((byte) -114, new bd(12, hh.field_b, pn.field_a));
                  var12.a((byte) -78, new bd(13, w.field_Q, pn.field_a));
                } else {
                  var12.a((byte) -59, new bd(15, hn.field_e, pn.field_a));
                }
              } else {
                if (param0) {
                  var12.a((byte) -59, new bd(15, hn.field_e, pn.field_a));
                } else {
                  var12.a((byte) -119, new bd(11, li.field_n, pn.field_a));
                  var12.a((byte) -114, new bd(12, hh.field_b, pn.field_a));
                  var12.a((byte) -78, new bd(13, w.field_Q, pn.field_a));
                }
              }
            } else {
              if (null == qn.field_v.field_K) {
                var12.a((byte) -71, new bd(2, mk.field_k, pn.field_a));
                var26 = new bd(5, qa.field_e, pn.field_a);
                var27 = new bd(6, cc.field_p, pn.field_a);
                var5 = var26.field_f;
                if (var27.field_f > var5) {
                  var5 = var27.field_f;
                }
                var27.field_f = var5;
                var26.field_f = var5;
                var12.a((byte) -70, var26);
                var12.a((byte) -87, var27);
                var28 = new bd(7, rb.field_h, pn.field_a);
                var29 = new bd(8, mg.field_d, pn.field_a);
                var30 = new bd(9, pm.field_u, pn.field_a);
                var6 = var28.field_f;
                if (var6 < var29.field_f) {
                  var6 = var29.field_f;
                }
                if (var30.field_f > var6) {
                  var6 = var30.field_f;
                }
                var30.field_f = var6;
                var29.field_f = var6;
                var28.field_f = var6;
                var12.a((byte) -52, var28);
                var12.a((byte) -115, var29);
                var12.a((byte) -113, var30);
                var7 = 1;
                if (param0 &&
                  sg.field_x <= 0) {
                  var7 = 0;
                }
                if (var7 != 0) {
                  var12.a((byte) -61, new bd(10, nn.field_v, pn.field_a));
                }
                if (param1 != 55) {
                  og.a(38, '%');
                }
                if (param0) {
                  var12.a((byte) -59, new bd(15, hn.field_e, pn.field_a));
                } else {
                  var12.a((byte) -119, new bd(11, li.field_n, pn.field_a));
                  var12.a((byte) -114, new bd(12, hh.field_b, pn.field_a));
                  var12.a((byte) -78, new bd(13, w.field_Q, pn.field_a));
                }
              } else {
                var23 = new bd(7, rb.field_h, pn.field_a);
                var24 = new bd(8, mg.field_d, pn.field_a);
                var25 = new bd(9, pm.field_u, pn.field_a);
                var6 = var23.field_f;
                if (var6 < var24.field_f) {
                  var6 = var24.field_f;
                }
                if (var25.field_f > var6) {
                  var6 = var25.field_f;
                }
                var25.field_f = var6;
                var24.field_f = var6;
                var23.field_f = var6;
                var12.a((byte) -52, var23);
                var12.a((byte) -115, var24);
                var12.a((byte) -113, var25);
                var7 = 1;
                if (param0 &&
                  sg.field_x <= 0) {
                  var7 = 0;
                }
                if (var7 != 0) {
                  var12.a((byte) -61, new bd(10, nn.field_v, pn.field_a));
                }
                if (param1 != 55) {
                  og.a(38, '%');
                  if (!param0) {
                    var12.a((byte) -119, new bd(11, li.field_n, pn.field_a));
                    var12.a((byte) -114, new bd(12, hh.field_b, pn.field_a));
                    var12.a((byte) -78, new bd(13, w.field_Q, pn.field_a));
                  } else {
                    var12.a((byte) -59, new bd(15, hn.field_e, pn.field_a));
                  }
                } else {
                  if (param0) {
                    var12.a((byte) -59, new bd(15, hn.field_e, pn.field_a));
                  } else {
                    var12.a((byte) -119, new bd(11, li.field_n, pn.field_a));
                    var12.a((byte) -114, new bd(12, hh.field_b, pn.field_a));
                    var12.a((byte) -78, new bd(13, w.field_Q, pn.field_a));
                  }
                }
              }
            }
          }
        }
        var8 = (-(30 * var12.field_p.field_k) + 376) / 2;
        var12.a(var8, 30, 43, 320);
        var12.a(false, param1 + 26151, 0);
        var12.c(92);
        return var12;
    }

    final static void a(boolean param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        hb var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        try {
          if (param0) {
            return;
          }
          var1 = vh.field_a;
          while (wi.a(param0)) {
            var1.b(true, 8);
            fieldTemp$0 = var1.field_n + 1;
            var1.field_n = var1.field_n + 1;
            var2 = fieldTemp$0;
            md.a(var1, (byte) 126);
            vh.field_a.a(25859, -var2 + var1.field_n);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "og.E(" + param0 + ')');
        }
    }

    final static void a(byte param0, mi param1, be param2, int param3) {
        mg.field_g = bg.a(12398) * param3 / 1000;
        pl.a(param1, true);
        if (param0 <= 115) {
          return;
        }
        try {
          ck.a(26613, param1);
          ee.a(param1, (byte) 70);
          pb.b(126);
          im.b((byte) -85);
          tg.field_H = 0 - mg.field_g;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "og.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    og() {
        this.field_j = java.net.ProxySelector.getDefault();
    }

    static {
        field_g = new double[]{0.0, -4.0, 96.0};
        field_i = new e(11, 0, 1, 2);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
