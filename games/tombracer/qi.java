/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qi extends hn {
    static ka field_O;
    static float field_L;
    static jea field_M;
    static int[] field_K;
    static int field_N;

    final boolean D(int param0) {
        if (param0 != 0) {
          field_K = (int[]) null;
          return true;
        }
        return true;
    }

    public static void f(boolean param0) {
        field_M = null;
        field_O = null;
        if (param0) {
          field_K = null;
          return;
        }
        qi.a(95, (String) null, (Class) null);
        field_K = null;
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qi.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1, Class param2) {
        try {
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          Class var3 = null;
          RuntimeException var3_ref = null;
          Object var4 = null;
          Class var5 = null;
          NoSuchMethodException var5_ref = null;
          Throwable var5_ref2 = null;
          Class var6 = null;
          java.lang.reflect.Method var7 = null;
          java.lang.reflect.Method var8 = null;
          File var9 = null;
          try {
            var3 = (Class) (cv.field_m.get(param1));
            if (var3 != null) {
              if (var3.getClassLoader() == param2.getClassLoader()) {
                return true;
              }
              return false;
            }
            if (param0 != 30054) {
              field_O = (ka) null;
            }
            var4 = null;
            if (var4 == null) {
              var4 = (File) (gj.field_d.get(param1));
            }
            if (var4 == null) {
              return false;
            }
            try {
              var9 = new File(((File) (var4)).getCanonicalPath());
              var4 = var9;
              var5 = Class.forName("java.lang.Runtime");
              var6 = Class.forName("java.lang.reflect.AccessibleObject");
              var7 = var6.getDeclaredMethod("setAccessible", new Class[]{Boolean.TYPE});
              var8 = var5.getDeclaredMethod("load0", new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")});
              var7.invoke((Object) (var8), new Object[]{Boolean.TRUE});
              var8.invoke((Object) (Runtime.getRuntime()), new Object[]{param2, var9.getPath()});
              var7.invoke((Object) (var8), new Object[]{Boolean.FALSE});
              cv.field_m.put(param1, param2);
              return true;
            } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5_ref = (NoSuchMethodException) (Object) decompiledCaughtException;
              System.load(((File) (var4)).getPath());
              cv.field_m.put(param1, qt.class);
              return true;
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5_ref2 = decompiledCaughtException;
              return false;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var3_ref;
            stackIn_21_1 = new StringBuilder().append("qi.JC(").append(param0).append(',');
            if (param1 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
            if (param2 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fsa a(int param0, boolean param1, la param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        lpa var5 = null;
        mfa var6 = null;
        ce var7 = null;
        fsa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            field_O = (ka) null;
          }
          var4 = new fsa(param2, param1);
          var4.b((byte) -11, 2097152, 2097152);
          var5 = new lpa(param2, false);
          var5.b(-5, 2);
          var5.a(1, (byte) 71);
          var4.a((byte) 83, (nv) (var5));
          var6 = rm.field_a;
          var7 = (ce) (var6.a(17, 81));
          var7.b(4, (byte) 23);
          var4.a(var5, (byte) 124, var7);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("qi.SB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2;
        lr var3;
        StringWriter var3_ref;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var7Lifetime1;
        String var8Lifetime1;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var11Lifetime3Lifetime1;
        String var11Lifetime3Lifetime2;
        String var11Lifetime6Lifetime1;
        String var11Lifetime6Lifetime2;
        var13 = TombRacer.field_G ? 1 : 0;
        if (param1 instanceof lr) {
          var3 = (lr) ((Object) param1);
          var2 = var3.field_d + " | ";
          param1 = var3.field_a;
          if (var13 != 0) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
          }
        } else {
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11 = var2;
        }
        var3_ref = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var3_ref));
        param1.printStackTrace(var4);
        var4.close();
        var5 = var3_ref.toString();
        var11Lifetime1 = var5;
        var2Lifetime1 = var11Lifetime1;
        var11Lifetime2 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        if (param0 > 3) {
          var7 = var6.readLine();
          var11Lifetime3 = var7;
          var2Lifetime2 = var11Lifetime3;
          var11Lifetime3Lifetime1 = var7;
          while (true) {
            var8 = var6.readLine();
            var11Lifetime3Lifetime2 = var8;
            var2Lifetime2 = var11Lifetime3Lifetime2;
            var11Lifetime3Lifetime2 = var8;
            if (var8 != null) {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', var9 + 1);
              if (var13 == 0) {
                if (var9 != -1) {
                  var11Lifetime3Lifetime2 = var8.substring(0, var9);
                } else {
                  var11Lifetime3Lifetime2 = var8;
                }
                var11Lifetime3Lifetime2 = var11Lifetime3Lifetime2.trim();
                var11Lifetime3Lifetime2 = var11Lifetime3Lifetime2.substring(1 + var11Lifetime3Lifetime2.lastIndexOf(' '));
                var11Lifetime3Lifetime2 = var11Lifetime3Lifetime2.substring(var11Lifetime3Lifetime2.lastIndexOf('\t') + 1);
                var2Lifetime2 = var11Lifetime3Lifetime2;
                var2Lifetime2 = var11Lifetime3Lifetime2;
                var2Lifetime2 = var2Lifetime2 + var11Lifetime3Lifetime2;
                if (var9 != -1 &&
                  var10 != -1) {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 >= 0) {
                    var2Lifetime2 = var2Lifetime2 + var8.substring(5 + var12, var10);
                  }
                }
                var2Lifetime2 = var2Lifetime2 + ' ';
                continue;
              }
            } else {
              var2Lifetime2 = var2Lifetime2 + "| " + var7;
              var11Lifetime3Lifetime2 = var2Lifetime2;
              var2Lifetime2 = var11Lifetime3Lifetime2;
              var11Lifetime3Lifetime2 = var2Lifetime2;
            }
            break;
          }
          return var2Lifetime2;
        }
        qi.a(90, (String) null, (Class) null);
        var7Lifetime1 = var6.readLine();
        var11Lifetime4 = var7Lifetime1;
        var2Lifetime3 = var11Lifetime4;
        var11Lifetime5 = var7Lifetime1;
        while (true) {
          var8Lifetime1 = var6.readLine();
          var11Lifetime6 = var8Lifetime1;
          var2Lifetime3 = var11Lifetime6;
          var11Lifetime6Lifetime1 = var8Lifetime1;
          if (var8Lifetime1 != null) {
            var9Lifetime1 = var8Lifetime1.indexOf('(');
            var10Lifetime1 = var8Lifetime1.indexOf(')', var9Lifetime1 + 1);
            if (var13 == 0) {
              if (var9Lifetime1 != -1) {
                var11Lifetime6Lifetime2 = var8Lifetime1.substring(0, var9Lifetime1);
              } else {
                var11Lifetime6Lifetime2 = var8Lifetime1;
              }
              var11Lifetime6Lifetime2 = var11Lifetime6Lifetime2.trim();
              var11Lifetime6Lifetime2 = var11Lifetime6Lifetime2.substring(1 + var11Lifetime6Lifetime2.lastIndexOf(' '));
              var11Lifetime6Lifetime2 = var11Lifetime6Lifetime2.substring(var11Lifetime6Lifetime2.lastIndexOf('\t') + 1);
              var2Lifetime3 = var11Lifetime6Lifetime2;
              var2Lifetime3 = var11Lifetime6Lifetime2;
              var2Lifetime3 = var2Lifetime3 + var11Lifetime6Lifetime2;
              if (var9Lifetime1 != -1 &&
                var10Lifetime1 != -1) {
                var12Lifetime1 = var8Lifetime1.indexOf(".java:", var9Lifetime1);
                if (var12Lifetime1 >= 0) {
                  var2Lifetime3 = var2Lifetime3 + var8Lifetime1.substring(5 + var12Lifetime1, var10Lifetime1);
                }
              }
              var2Lifetime3 = var2Lifetime3 + ' ';
              continue;
            }
          } else {
            var2Lifetime3 = var2Lifetime3 + "| " + var7Lifetime1;
            var11Lifetime6Lifetime2 = var2Lifetime3;
            var2Lifetime3 = var11Lifetime6Lifetime2;
            var11Lifetime6Lifetime2 = var2Lifetime3;
          }
          break;
        }
        return var2Lifetime3;
    }

    qi(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean C(int param0) {
        if (param0 != 1) {
          this.a(99, false, (la) null);
          return true;
        }
        return true;
    }

    final fsa a(la param0, boolean param1, boolean param2) {
        fsa var4 = null;
        RuntimeException var4_ref = null;
        lpa var5 = null;
        mfa var6 = null;
        ce var7 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fsa(param0, param2);
          var4.b((byte) -11, 2097152, 2097152);
          var5 = new lpa(param0, param1);
          var5.b(-5, 0);
          var4.a((byte) 83, (nv) (var5));
          var6 = rm.field_a;
          var7 = (ce) (var6.a(17, 87));
          var7.b(4, (byte) 23);
          var4.a(var5, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("qi.VB(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    qi(la param0, int param1) {
        super(param0, param1);
    }

    static {
        field_K = new int[4];
    }
}
