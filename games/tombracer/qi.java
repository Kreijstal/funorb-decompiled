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
            field_K = null;
            return true;
        }
        return true;
    }

    public static void f() {
        field_M = null;
        field_O = null;
        field_K = null;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qi.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(int param0, String param1, Class param2) {
        try {
            Class var3 = null;
            RuntimeException var3_ref = null;
            Object var4 = null;
            NoSuchMethodException var5 = null;
            Throwable var5_ref = null;
            Class var5_ref2 = null;
            Class var6 = null;
            java.lang.reflect.Method var7 = null;
            java.lang.reflect.Method var8 = null;
            File var9 = null;
            int stackIn_4_0 = 0;
            int stackIn_6_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            try {
              var3 = (Class) cv.field_m.get((Object) (Object) param1);
              if (var3 != null) {
                if (var3.getClassLoader() == param2.getClassLoader()) {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0 != 0;
                }
              } else {
                L0: {
                  var4 = null;
                  if (var4 != null) {
                    break L0;
                  } else {
                    var4 = (Object) (Object) (File) gj.field_d.get((Object) (Object) param1);
                    break L0;
                  }
                }
                if (var4 != null) {
                  try {
                    L1: {
                      var9 = new File(((File) var4).getCanonicalPath());
                      var4 = (Object) (Object) var9;
                      var5_ref2 = Class.forName("java.lang.Runtime");
                      var6 = Class.forName("java.lang.reflect.AccessibleObject");
                      var7 = var6.getDeclaredMethod("setAccessible", new Class[1]);
                      var8 = var5_ref2.getDeclaredMethod("load0", new Class[2]);
                      Object discarded$5 = var7.invoke((Object) (Object) var8, new Object[1]);
                      Object discarded$6 = var8.invoke((Object) (Object) Runtime.getRuntime(), new Object[2]);
                      Object discarded$7 = var7.invoke((Object) (Object) var8, new Object[1]);
                      Object discarded$8 = cv.field_m.put((Object) (Object) param1, (Object) (Object) param2);
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      break L1;
                    }
                  } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var5 = (NoSuchMethodException) (Object) decompiledCaughtException;
                    System.load(((File) var4).getPath());
                    Object discarded$9 = cv.field_m.put((Object) (Object) param1, (Object) (Object) qt.class);
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  } catch (java.lang.Throwable decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var5_ref = decompiledCaughtException;
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  }
                  return stackIn_12_0 != 0;
                } else {
                  return false;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L2: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) var3_ref;
                stackOut_17_1 = new StringBuilder().append("qi.JC(").append(30054).append(44);
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param1 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L2;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L2;
                }
              }
              L3: {
                stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param2 == null) {
                  stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                  stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L3;
                } else {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L3;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 5) {
                break L1;
              } else {
                field_O = null;
                break L1;
              }
            }
            var4 = new fsa(param2, param1);
            var4.b((byte) -11, 2097152, 2097152);
            var5 = new lpa(param2, false);
            var5.b(-5, 2);
            var5.a(1, (byte) 71);
            var4.a((byte) 83, (nv) (Object) var5);
            var6 = rm.field_a;
            var7 = (ce) (Object) var6.a(17, 81);
            var7.b(4, (byte) 23);
            var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
            stackOut_2_0 = (fsa) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("qi.SB(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        lr var3 = null;
        StringWriter var3_ref = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          if (!(param1 instanceof lr)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var3 = (lr) (Object) param1;
            var2 = var3.field_d + " | ";
            param1 = var3.field_a;
            break L0;
          }
        }
        var3_ref = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var3_ref);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var3_ref.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 == null) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', var9 - -1);
              if (var9 == -1) {
                var11 = var8;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
              var11 = var11.trim();
              var11 = var11.substring(1 + var11.lastIndexOf(' '));
              var11 = var11.substring(var11.lastIndexOf('\t') - -1);
              var2 = var11;
              var2 = var11;
              var2 = var2 + var11;
              if (var9 == -1) {
                break L3;
              } else {
                if (var10 == -1) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 >= 0) {
                    var2 = var2 + var8.substring(5 + var12, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          }
        }
    }

    qi(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean C(int param0) {
        if (param0 != 1) {
            fsa discarded$0 = ((qi) this).a(99, false, (la) null);
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
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new fsa(param0, param2);
            var4.b((byte) -11, 2097152, 2097152);
            var5 = new lpa(param0, param1);
            var5.b(-5, 0);
            var4.a((byte) 83, (nv) (Object) var5);
            var6 = rm.field_a;
            var7 = (ce) (Object) var6.a(17, 87);
            var7.b(4, (byte) 23);
            var4.a((gr) (Object) var5, (byte) 124, (dg) (Object) var7);
            stackOut_0_0 = (fsa) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("qi.VB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_1_0;
    }

    qi(la param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new int[4];
    }
}
