/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ii extends q {
    static String[] field_j;
    static boolean field_n;
    static String field_m;
    static String field_o;
    long[] field_l;
    static int field_k;

    final static void a(int param0, int param1, qk param2) {
        int var4 = 0;
        df var5 = wa.field_d;
        var5.f(95, param1);
        if (param0 != 32) {
            return;
        }
        try {
            var5.field_n = var5.field_n + 1;
            var4 = var5.field_n;
            var5.b(90, 1);
            var5.b(90, param2.field_k);
            var5.a(param2.field_o, (byte) 106);
            var5.b((byte) 60, param2.field_n);
            var5.b((byte) 60, param2.field_m);
            var5.b((byte) 60, param2.field_s);
            var5.b((byte) 60, param2.field_j);
            int discarded$0 = var5.a(var4, true);
            var5.c((byte) 48, var5.field_n + -var4);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ii.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            if (10 > b.field_x) {
              L1: {
                var3_int = 0;
                if (!cf.field_c) {
                  break L1;
                } else {
                  var3_int = 1;
                  cf.field_c = false;
                  break L1;
                }
              }
              int discarded$2 = 49;
              sc.a(kg.a(), rd.field_A, var3_int != 0, (byte) 21, ro.b(-126));
              break L0;
            } else {
              if (!pl.b(-109)) {
                ph.b();
                jf.a(540, 320, 240);
                ni.a(param0, 0, 0, -109);
                return;
              } else {
                if (op.field_i != 0) {
                  ji.a((byte) -99, param0);
                  return;
                } else {
                  re.a(true, false, param1);
                  ni.a(param0, 0, 0, -69);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ii.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + -19 + 41);
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_m = null;
        field_j = null;
        if (param0 != -28455) {
            Object var2 = null;
            ii.a(-84, 11, (qk) null);
        }
    }

    final static String a(Throwable param0, int param1) throws IOException {
        String var2 = null;
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
        ga var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        var13 = Torquing.field_u;
        if (param1 != 0) {
          return null;
        } else {
          L0: {
            if (!(param0 instanceof ga)) {
              var2 = "";
              var11 = var2;
              break L0;
            } else {
              var14 = (ga) (Object) param0;
              param0 = var14.field_a;
              var2 = var14.field_b + " | ";
              break L0;
            }
          }
          var15 = new StringWriter();
          var4 = new PrintWriter((Writer) (Object) var15);
          param0.printStackTrace(var4);
          var4.close();
          var5 = var15.toString();
          var2 = var5;
          var11 = var5;
          var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
          var7 = var6.readLine();
          var2 = var7;
          var11 = var7;
          L1: while (true) {
            var8 = var6.readLine();
            var2 = var8;
            var11 = var8;
            var2 = var11;
            if (var8 != null) {
              L2: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', var9 - -1);
                if (var9 == -1) {
                  var11 = var8;
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var8.substring(0, var9);
                  break L2;
                }
              }
              L3: {
                var16 = var11.trim();
                var2 = var16;
                var2 = var16;
                var17 = var16.substring(var16.lastIndexOf(' ') + 1);
                var2 = var17;
                var2 = var17;
                var18 = var17.substring(var17.lastIndexOf('\t') - -1);
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                if (var9 == -1) {
                  break L3;
                } else {
                  if (var10 == -1) {
                    break L3;
                  } else {
                    var12 = var8.indexOf(".java:", var9);
                    if (var12 >= 0) {
                      var2 = var19 + var8.substring(5 + var12, var10);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var2 = var2 + 32;
              continue L1;
            } else {
              var2 = var11;
              var11 = var2;
              var2 = var11;
              var2 = var2 + "| " + var7;
              return var2;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param4 >= kn.field_e) {
          if (param1 <= qg.field_z) {
            if (j.field_q <= param0) {
              if (param2 > qk.field_p) {
                ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
                return;
              } else {
                qm.a(param2, (byte) 54, param0, param7, param1, param3, param4, param6);
                return;
              }
            } else {
              ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
              return;
            }
          } else {
            ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
            return;
          }
        } else {
          ji.a(param4, param6, param1, param2, param7, 105, param0, param3);
          return;
        }
    }

    ii() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Logging in...";
        field_j = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_o = "members-only content";
    }
}
