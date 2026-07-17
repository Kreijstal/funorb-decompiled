/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ag {
    private int field_c;
    static String[] field_d;
    static String field_e;
    private int field_i;
    private gh field_f;
    static String field_j;
    static double[] field_a;
    static int[] field_g;
    private lm field_b;
    static boolean field_h;

    private final void a(int param0, nd param1) {
        try {
            if (param1 != null) {
                param1.a(true);
                param1.b(true);
                ((ag) this).field_i = ((ag) this).field_i + param1.field_t;
            }
            int var3_int = 55 / ((-2 - param0) / 52);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ag.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 10) {
          field_j = null;
          field_j = null;
          field_g = null;
          field_a = null;
          return;
        } else {
          field_j = null;
          field_g = null;
          field_a = null;
          return;
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        ec var14 = null;
        StringWriter var15 = null;
        String var20 = null;
        BufferedReader var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        BufferedReader var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var42 = null;
        L0: {
          var13 = Confined.field_J ? 1 : 0;
          if (param1 instanceof ec) {
            var14 = (ec) (Object) param1;
            var2 = var14.field_c + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            param1 = var14.field_b;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        if (param0 == -19080) {
          param1.printStackTrace(var4);
          var4.close();
          var20 = var15.toString();
          var11 = var20;
          var2 = var11;
          var11 = var20;
          var21 = new BufferedReader((Reader) (Object) new StringReader(var20));
          var27 = var21.readLine();
          var11 = var27;
          var2 = var11;
          var11 = var27;
          L1: while (true) {
            var22 = var21.readLine();
            var11 = var22;
            var2 = var11;
            var11 = var22;
            if (var22 == null) {
              var2 = var2 + "| " + var27;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              return var2;
            } else {
              L2: {
                var9 = var22.indexOf('(');
                var10 = var22.indexOf(')', 1 + var9);
                if (var9 == -1) {
                  var11 = var22;
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var22.substring(0, var9);
                  break L2;
                }
              }
              L3: {
                var23 = var11.trim();
                var2 = var23;
                var2 = var23;
                var24 = var23.substring(var23.lastIndexOf(' ') + 1);
                var2 = var24;
                var2 = var24;
                var25 = var24.substring(var24.lastIndexOf('\t') - -1);
                var2 = var25;
                var2 = var25;
                var26 = var2 + var25;
                var2 = var26;
                var2 = var26;
                if (-1 == var9) {
                  break L3;
                } else {
                  if (var10 == -1) {
                    break L3;
                  } else {
                    var12 = var22.indexOf(".java:", var9);
                    if (var12 >= 0) {
                      var2 = var26 + var22.substring(var12 + 5, var10);
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
        } else {
          ag.a(36);
          param1.printStackTrace(var4);
          var4.close();
          var28 = var15.toString();
          var11 = var28;
          var2 = var11;
          var11 = var28;
          var29 = new BufferedReader((Reader) (Object) new StringReader(var28));
          var6 = var29;
          var35 = var29.readLine();
          var11 = var35;
          var2 = var11;
          var11 = var35;
          var7 = var35;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L4: while (true) {
            var30 = var29.readLine();
            var11 = var30;
            var2 = var11;
            var11 = var30;
            if (var30 == null) {
              var2 = var2 + "| " + var35;
              var11 = var2;
              var42 = var11;
              var11 = var2;
              return var2;
            } else {
              L5: {
                var9 = var30.indexOf('(');
                var10 = var30.indexOf(')', 1 + var9);
                if (var9 == -1) {
                  var11 = var30;
                  var2 = var11;
                  var2 = var11;
                  break L5;
                } else {
                  var11 = var30.substring(0, var9);
                  break L5;
                }
              }
              L6: {
                var31 = var11.trim();
                var2 = var31;
                var2 = var31;
                var32 = var31.substring(var31.lastIndexOf(' ') + 1);
                var2 = var32;
                var2 = var32;
                var33 = var32.substring(var32.lastIndexOf('\t') - -1);
                var2 = var33;
                var2 = var33;
                var34 = var2 + var33;
                var2 = var34;
                var2 = var34;
                if (-1 == var9) {
                  break L6;
                } else {
                  if (var10 == -1) {
                    break L6;
                  } else {
                    var12 = var30.indexOf(".java:", var9);
                    if (var12 >= 0) {
                      var2 = var34 + var30.substring(var12 + 5, var10);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var2 = var2 + 32;
              continue L4;
            }
          }
        }
    }

    private final void b(int param0, long param1) {
        Object var4 = null;
        nd var5 = null;
        var4 = null;
        if (param0 >= -76) {
          this.b(64, 29L);
          var5 = (nd) (Object) ((ag) this).field_f.a(1, param1);
          this.a(83, var5);
          return;
        } else {
          var5 = (nd) (Object) ((ag) this).field_f.a(1, param1);
          this.a(83, var5);
          return;
        }
    }

    private ag() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, long param1, Object param2, int param3) {
        nd var6 = null;
        oj var6_ref = null;
        int var7 = Confined.field_J ? 1 : 0;
        try {
            if (((ag) this).field_c < param0) {
                throw new IllegalStateException();
            }
            this.b(-110, param1);
            ((ag) this).field_i = ((ag) this).field_i - param0;
            while (((ag) this).field_i < 0) {
                var6 = (nd) (Object) ((ag) this).field_b.a(-29870);
                this.a(param3 ^ -96, var6);
            }
            var6_ref = new oj(param2, param0);
            ((ag) this).field_f.a((rk) (Object) var6_ref, param1, ~param3);
            ((ag) this).field_b.a((jl) (Object) var6_ref, 18425);
            ((nd) (Object) var6_ref).field_r = (long)param3;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ag.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final Object a(int param0, long param1) {
        Object var5 = null;
        oj var6 = null;
        nd var7 = null;
        var7 = (nd) (Object) ((ag) this).field_f.a(1, param1);
        if (param0 == 0) {
          if (var7 != null) {
            var5 = var7.d(param0 + -4);
            if (var5 == null) {
              var7.a(true);
              var7.b(true);
              ((ag) this).field_i = ((ag) this).field_i + var7.field_t;
              return null;
            } else {
              if (var7.f((byte) -102)) {
                var6 = new oj(var5, var7.field_t);
                ((ag) this).field_f.a((rk) (Object) var6, var7.field_i, param0 + -1);
                ((ag) this).field_b.a((jl) (Object) var6, param0 + 18425);
                ((nd) (Object) var6).field_r = 0L;
                var7.a(true);
                var7.b(true);
                return var5;
              } else {
                ((ag) this).field_b.a((jl) (Object) var7, 18425);
                var7.field_r = 0L;
                return var5;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, long param1, Object param2) {
        try {
            if (param0 != -2) {
                ((ag) this).field_i = -88;
            }
            this.a(1, param1, param2, param0 + 2);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ag.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = new double[]{0.0, 0.0, 0.0, 0.0, 10.0, 0.1, 10.0, 0.07, 0.4, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 20.0, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 15.0, 0.07, 15.0, 0.1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 7.0, 0.17, 7.0, 0.13, 0.4, 0.2, 0.0, 0.0, 0.0, 0.0, 5.0, 0.2, 5.0, 0.17, 0.3, 0.07, 0.0, 0.0, 0.0, 0.0, 3.0, 0.3, 3.0, 0.27, 0.4, 0.12, 0.0, 0.0, 0.0, 0.0, 2.0, 0.4, 2.0, 0.37, 0.5, 0.17, 0.0, 0.0, 0.0, 0.0, 10.0, 0.07, 10.0, 0.1, 0.2, 0.07, 0.0, 0.0, 0.2, 0.1, 10.0, 0.07, 10.0, 0.1, 0.2, 0.17, 0.0, 0.0, 0.4, 0.1, 10.0, 0.07, 10.0, 0.1, 0.3, 0.17, 0.0, 0.0, 0.0, 0.0, 10.0, 0.07, 10.0, 0.1, 0.4, 0.17, 0.0, 0.0, 0.2, 0.1, 10.0, 0.07, 10.0, 0.1, 0.4, 0.17, 0.4, 0.2, 0.0, 0.0, 2.0, 0.4, 2.0, 0.33, 0.4, 0.17, 0.3, 0.3, 0.4, 0.2, 6.0, 0.23, 10.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.2, 0.2, 10.0, 0.07, 10.0, 0.1, 0.4, 0.17, 0.0, 0.0, 0.0, 0.0, 10.0, 0.07, 10.0, 0.1, 0.4, 0.17, 0.0, 0.0, 0.4, 0.4, 2.0, 0.4, 10.0, 0.1, 0.4, 0.17, 0.4, 0.4, 0.0, 0.0, 2.0, 0.4, 10.0, 0.1, 0.4, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.4, 0.17, 0.3, 0.4, 0.3, 0.3, 0.0, 0.0, 0.0, 0.0, 0.4, 0.17, 0.3, 0.4, 0.3, 0.3, 10.0, 0.07, 10.0, 0.13, 0.4, 0.17, 0.4, 0.3, 0.4, 0.4, 10.0, 0.07, 10.0, 0.13, 0.4, 0.17, 0.3, 0.1, 0.3, 0.7, 10.0, 0.07, 10.0, 0.13, 0.4, 0.17, 0.0, 0.0, 0.0, 0.0, 10.0, 0.17, 10.0, 0.13, 0.4, 0.23};
        field_j = "Please send me news and updates (I can unsubscribe at any time)";
        field_g = new int[]{4, 4, 4, 4, 7, 5, 5, 5, 7, 4, 5, 4, 7, 7, 6, 7, 5, 3, 3, 6, 7, 7, 5, 6, 7};
    }
}
