/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ql extends mj {
    static int field_i;
    private java.net.ProxySelector field_j;
    static String field_f;
    static qf field_e;
    static int field_g;
    static String field_h;

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_21_0 = false;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = Terraphoenix.field_V;
          try {
            if (bl.field_e) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              if (param1 != -15) {
                return true;
              }
              var3 = (String) (cd.a((byte) -128, "getcookies", param0));
              var4 = nc.a(14352, var3, ';');
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_21_0 = (null != param0.getParameter("tuhstatbut"));
            return stackIn_21_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var2_ref2;
            stackIn_24_1 = new StringBuilder().append("ql.H(");
            if (param0 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 != -5) {
          uc var2 = (uc) null;
          ql.a(67, (uc) null);
        }
        field_h = null;
        field_f = null;
        field_e = null;
    }

    final static void a(int param0, uc param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_67_0 = null;
          StringBuilder stackIn_67_1 = null;
          String stackIn_68_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          int var3 = 0;
          int var4 = 0;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          InvalidClassException var6_ref = null;
          StreamCorruptedException var6_ref2 = null;
          OptionalDataException var6_ref3 = null;
          IllegalAccessException var6_ref4 = null;
          IllegalArgumentException var6_ref5 = null;
          java.lang.reflect.InvocationTargetException var6_ref6 = null;
          SecurityException var6_ref7 = null;
          IOException var6_ref8 = null;
          NullPointerException var6_ref9 = null;
          Exception var6_ref10 = null;
          Throwable var6_ref11 = null;
          int var8 = 0;
          Object[] var9 = null;
          Object var10 = null;
          ObjectInputStream var11 = null;
          int var12 = 0;
          wf var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          wf var17 = null;
          Object var18 = null;
          java.lang.reflect.Field var19 = null;
          Object var20 = null;
          Object var22 = null;
          byte[][] var25 = null;
          java.lang.reflect.Field var26 = null;
          java.lang.reflect.Method var27 = null;
          java.lang.reflect.Method var28 = null;
          int var8Lifetime1;
          var18 = null;
          var16 = null;
          var20 = null;
          var22 = null;
          var12 = Terraphoenix.field_V;
          try {
            var13 = (wf) (rd.field_k.d(9272));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var4 < var17.field_p; var4++) {
              if (null != var13.field_s[var4]) {
                if (var13.field_s[var4].field_d == 2) {
                  var13.field_r[var4] = -5;
                }
                if (var13.field_s[var4].field_d == 0) {
                  var3 = 1;
                }
              }
              if (var13.field_j[var4] != null) {
                if (2 == var13.field_j[var4].field_d) {
                  var13.field_r[var4] = -6;
                }
                if (0 == var13.field_j[var4].field_d) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.field_k;
            param1.e(var17.field_i, 8959);
            if (param0 > -115) {
              field_e = (qf) null;
            }
            for (var5 = 0; var5 < var17.field_p; var5++) {
              if (var17.field_r[var5] == 0) {
                try {
                  var6_int = var17.field_k[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var17.field_s[var5].field_e);
                    var8 = var15.getInt((Object) null);
                    param1.i(0, -106);
                    param1.e(var8, 8959);
                  } else {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_s[var5].field_e);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_m[var5]);
                      param1.i(0, -102);
                    } else {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var17.field_s[var5].field_e);
                        var8 = var26.getModifiers();
                        param1.i(0, -93);
                        param1.e(var8, 8959);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var17.field_j[var5].field_e);
                    var25 = var17.field_o[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.i(0, -107);
                    } else if (var10 instanceof Number) {
                      param1.i(1, 59);
                      param1.a(((Number) (var10)).longValue(), 53);
                    } else if (!(var10 instanceof String)) {
                      param1.i(4, 119);
                    } else {
                      param1.i(2, -105);
                      param1.a((String) (var10), 2295);
                    }
                  } else {
                    if (var6_int == 4) {
                      var27 = (java.lang.reflect.Method) (var17.field_j[var5].field_e);
                      var8Lifetime1 = var27.getModifiers();
                      param1.i(0, 74);
                      param1.e(var8Lifetime1, 8959);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.i(-10, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.i(-11, 15);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.i(-12, -91);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.i(-13, 3);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.i(-14, 91);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.i(-15, -120);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.i(-16, 27);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.i(-17, -112);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.i(-18, -124);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.i(-19, 1);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.i(-20, -97);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.i(-21, 50);
                }
              } else {
                param1.i(var17.field_r[var5], -109);
              }
            }
            param1.d(var4, 8600);
            var17.b((byte) 12);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_67_0 = var2;
            stackIn_67_1 = new StringBuilder().append("ql.J(").append(param0).append(',');
            if (param1 == null) {
              stackIn_68_2 = "null";
            } else {
              stackIn_68_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        Object stackIn_13_0 = null;
        java.net.Socket stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
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
        uc var14 = null;
        Class var15 = null;
        try {
          if (param0.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_3_0 = this.a(true);
            return stackIn_3_0;
          }
          var3 = param0.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            return null;
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param1 != 15736) {
            var14 = (uc) null;
            ql.a(-77, (uc) null);
          }
          if (param0.type() != java.net.Proxy.Type.HTTP) {
            if (param0.type() != java.net.Proxy.Type.SOCKS) {
              return null;
            }
            var5 = new java.net.Socket(param0);
            ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_d, this.field_b)));
            stackIn_13_0 = var5;
            return (java.net.Socket) (stackIn_13_0);
          }
          var5 = null;
          try {
            var15 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
            var6 = var15;
            var7 = var15.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
            var7.setAccessible(true);
            var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
            if (var8 != null) {
              var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
              var9.setAccessible(true);
              if (((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                var10.setAccessible(true);
                var11 = var15.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                var11.setAccessible(true);
                var12 = (String) (var10.invoke(var8, new Object[]{}));
                var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_d + "/"), "https"}));
                var5 = var12 + ": " + var13;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_22_0 = this.a(var4.getPort(), var4.getHostName(), (byte) 28, (String) (var5));
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("ql.G(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    private final java.net.Socket a(int param0, String param1, byte param2, String param3) throws IOException {
        java.net.Socket stackIn_12_0 = null;
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
        java.net.Socket var13 = null;
        String var14 = null;
        var12 = Terraphoenix.field_V;
        try {
          if (param2 != 28) {
            this.field_j = (java.net.ProxySelector) null;
          }
          var13 = new java.net.Socket(param1, param0);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param3 == null) {
            var6.write(("CONNECT " + this.field_d + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          } else {
            var6.write(("CONNECT " + this.field_d + ":" + this.field_b + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          boolean decompiledFrameRemainder0 = true;
          var6.flush();
          var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
          var8 = var7.readLine();
          if (var8 != null) {
            if ((!var8.startsWith("HTTP/1.0 200") &&
              !var8.startsWith("HTTP/1.1 200")) &&
              (decompiledFrameRemainder0 = (var8.startsWith("HTTP/1.0 407") ||
              var8.startsWith("HTTP/1.1 407")))) {
              var9 = 0;
              var10 = "proxy-authenticate: ";
              var8 = var10;
              var8 = var10;
              var8 = var7.readLine();
              while (var8 != null) {
                if (var9 < 50) {
                  if (!var8.toLowerCase().startsWith(var10)) {
                    var9++;
                    var8 = var7.readLine();
                    continue;
                  }
                  var14 = var8.substring(var10.length()).trim();
                  var8 = var14;
                  var8 = var14;
                  var8 = var14;
                  var11 = var14.indexOf(' ');
                  if (var11 != -1) {
                    var8 = var14.substring(0, var11);
                  }
                  throw new wb(var8);
                }
                break;
              }
              throw new wb("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_12_0 = var13;
              return stackIn_12_0;
            }
          }
          var6.close();
          var7.close();
          var13.close();
          stackIn_27_0 = null;
          return (java.net.Socket) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ql.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    ql() {
        this.field_j = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket b(boolean param0) throws IOException {
        int var9 = 0;
        int stackIn_5_0 = 0;
        java.net.ProxySelector stackIn_8_0;
        java.net.URI stackIn_8_1;
        java.net.URI stackIn_8_2;
        StringBuilder stackIn_8_3;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        String stackIn_9_4 = null;
        java.net.ProxySelector stackIn_11_0;
        java.net.URI stackIn_11_1;
        java.net.URI stackIn_11_2;
        StringBuilder stackIn_11_3;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        String stackIn_12_4;
        java.net.Socket stackIn_22_0 = null;
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
        wb var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = Terraphoenix.field_V;
        if (!Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
          System.setProperty("java.net.useSystemProxies", "true");
        }
        stackIn_5_0 = (this.field_b != 443) ? 0 : 1;
        var5 = stackIn_5_0;
        try {
          stackIn_8_0 = this.field_j;
          stackIn_8_1 = null;
          stackIn_8_2 = null;
          stackIn_8_3 = new StringBuilder();
          if (var5 == 0) {
            stackIn_9_1 = null;
            stackIn_9_2 = null;
            stackIn_9_4 = "http";
          } else {
            stackIn_9_1 = null;
            stackIn_9_2 = null;
            stackIn_9_4 = "https";
          }
          var3 = ((java.net.ProxySelector) (Object) stackIn_8_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_8_3).append(stackIn_9_4).append("://").append(this.field_d).toString()));
          stackIn_11_0 = this.field_j;
          stackIn_11_1 = null;
          stackIn_11_2 = null;
          stackIn_11_3 = new StringBuilder();
          if (var5 == 0) {
            stackIn_12_1 = null;
            stackIn_12_2 = null;
            stackIn_12_4 = "https";
          } else {
            stackIn_12_1 = null;
            stackIn_12_2 = null;
            stackIn_12_4 = "http";
          }
          var4 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_11_3).append(stackIn_12_4).append("://").append(this.field_d).toString()));
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.a(true);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        for (var9 = 0; var8.length > var9; var9++) {
          var10 = var8[var9];
          var11 = (java.net.Proxy) (var10);
          try {
            if (false) throw (wb) null;
            var12 = this.a(var11, 15736);
            if (var12 != null) {
              stackIn_22_0 = var12;
              return stackIn_22_0;
            }
          } catch (wb decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var12_ref = (wb) (Object) decompiledCaughtException;
            var7 = var12_ref;
          } catch (java.io.IOException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var12_ref2 = (IOException) (Object) decompiledCaughtException;
          }
        }
        if (!param0) {
          ql.b(56);
        }
        if (var7 != null) {
          throw ql.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
        }
        return this.a(true);
    }

    static {
        field_f = "Press 'L' to reload, cost: 14tus";
        field_e = new qf();
        field_h = "to return to the normal view.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
