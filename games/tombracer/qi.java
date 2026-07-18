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
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "qi.TB(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    public static void f(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_M = null;
              field_O = null;
              if (param0) {
                break L1;
              } else {
                boolean discarded$2 = qi.a(95, (String) null, (Class) null);
                break L1;
              }
            }
            field_K = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "qi.IC(" + param0 + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            super.a(param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("qi.V(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            int stackIn_5_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_19_0 = 0;
            int stackIn_22_0 = 0;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            String stackIn_31_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_4_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_21_0 = 0;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            String stackOut_30_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            try {
              L0: {
                var3 = (Class) cv.field_m.get((Object) (Object) param1);
                if (var3 != null) {
                  if (var3.getClassLoader() == param2.getClassLoader()) {
                    stackOut_6_0 = 1;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0 != 0;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0 != 0;
                  }
                } else {
                  L1: {
                    if (param0 == 30054) {
                      break L1;
                    } else {
                      field_O = null;
                      break L1;
                    }
                  }
                  L2: {
                    var4 = null;
                    if (null != var4) {
                      break L2;
                    } else {
                      var4 = (Object) (Object) (File) gj.field_d.get((Object) (Object) param1);
                      break L2;
                    }
                  }
                  L3: {
                    if (var4 != null) {
                      try {
                        L4: {
                          var4 = (Object) (Object) new File(((File) var4).getCanonicalPath());
                          var5_ref2 = Class.forName("java.lang.Runtime");
                          var6 = Class.forName("java.lang.reflect.AccessibleObject");
                          var7 = var6.getDeclaredMethod("setAccessible", new Class[1]);
                          var8 = var5_ref2.getDeclaredMethod("load0", new Class[2]);
                          Object discarded$5 = var7.invoke((Object) (Object) var8, new Object[1]);
                          Object discarded$6 = var8.invoke((Object) (Object) Runtime.getRuntime(), new Object[2]);
                          Object discarded$7 = var7.invoke((Object) (Object) var8, new Object[1]);
                          Object discarded$8 = cv.field_m.put((Object) (Object) param1, (Object) (Object) param2);
                          stackOut_16_0 = 1;
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      } catch (java.lang.NoSuchMethodException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var5 = (NoSuchMethodException) (Object) decompiledCaughtException;
                        System.load(((File) var4).getPath());
                        Object discarded$9 = cv.field_m.put((Object) (Object) param1, (Object) (Object) qt.class);
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      } catch (java.lang.Throwable decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L5: {
                          var5_ref = decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L5;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        return stackIn_17_0 != 0;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) var3_ref;
                stackOut_23_1 = new StringBuilder().append("qi.JC(").append(param0).append(',');
                stackIn_26_0 = stackOut_23_0;
                stackIn_26_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param1 == null) {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L6;
                } else {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "{...}";
                  stackIn_27_0 = stackOut_24_0;
                  stackIn_27_1 = stackOut_24_1;
                  stackIn_27_2 = stackOut_24_2;
                  break L6;
                }
              }
              L7: {
                stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
                stackIn_30_0 = stackOut_27_0;
                stackIn_30_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (param2 == null) {
                  stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                  stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                  stackOut_30_2 = "null";
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  stackIn_31_2 = stackOut_30_2;
                  break L7;
                } else {
                  stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                  stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                  stackOut_28_2 = "{...}";
                  stackIn_31_0 = stackOut_28_0;
                  stackIn_31_1 = stackOut_28_1;
                  stackIn_31_2 = stackOut_28_2;
                  break L7;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
            }
            return stackIn_22_0 != 0;
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
        fsa stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_3_0 = (fsa) var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("qi.SB(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
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
          L1: {
            var13 = TombRacer.field_G ? 1 : 0;
            if (!(param1 instanceof lr)) {
              break L1;
            } else {
              var3 = (lr) (Object) param1;
              var2 = var3.field_d + " | ";
              param1 = var3.field_a;
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = "";
          break L0;
        }
        L2: {
          var3_ref = new StringWriter();
          var4 = new PrintWriter((Writer) (Object) var3_ref);
          param1.printStackTrace(var4);
          var4.close();
          var5 = var3_ref.toString();
          var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
          if (param0 > 3) {
            break L2;
          } else {
            boolean discarded$1 = qi.a(90, (String) null, (Class) null);
            break L2;
          }
        }
        var7 = var6.readLine();
        L3: while (true) {
          L4: {
            L5: {
              var8 = var6.readLine();
              if (null == var8) {
                break L5;
              } else {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', var9 - -1);
                if (var13 != 0) {
                  break L4;
                } else {
                  L6: {
                    L7: {
                      if (var9 == -1) {
                        break L7;
                      } else {
                        var11 = var8.substring(0, var9);
                        if (var13 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = var8;
                    break L6;
                  }
                  L8: {
                    var11 = var11.trim();
                    var11 = var11.substring(1 + var11.lastIndexOf(' '));
                    var11 = var11.substring(var11.lastIndexOf('\t') - -1);
                    var2 = var2 + var11;
                    if (var9 == -1) {
                      break L8;
                    } else {
                      if (var10 == -1) {
                        break L8;
                      } else {
                        var12 = var8.indexOf(".java:", var9);
                        if (var12 >= 0) {
                          var2 = var2 + var8.substring(5 + var12, var10);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  var2 = var2 + ' ';
                  if (var13 == 0) {
                    continue L3;
                  } else {
                    break L5;
                  }
                }
              }
            }
            var2 = var2 + "| " + var7;
            break L4;
          }
          return var2;
        }
    }

    qi(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean C(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                fsa discarded$2 = ((qi) this).a(99, false, (la) null);
                break L1;
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "qi.UB(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
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
