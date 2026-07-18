/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class es extends oh {
    static qr field_l;
    static int field_n;
    static bc field_j;
    static int field_m;
    int field_k;
    int field_h;
    ln field_p;
    fs field_i;
    int field_o;

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int var3 = 0;
            int stackIn_10_0 = 0;
            int stackIn_12_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_9_0 = 0;
            if (sa.field_a.field_j < param1) {
              if (null != wg.field_f) {
                try {
                  L0: {
                    var3 = 52 % ((param0 - 38) / 63);
                    var2_int = wg.field_f.a(-1);
                    if (var2_int > 0) {
                      L1: {
                        if (var2_int <= param1 + -sa.field_a.field_j) {
                          break L1;
                        } else {
                          var2_int = param1 + -sa.field_a.field_j;
                          break L1;
                        }
                      }
                      wg.field_f.a(sa.field_a.field_h, var2_int, sa.field_a.field_j, (byte) 119);
                      pf.field_e = pr.a(14274);
                      sa.field_a.field_j = sa.field_a.field_j + var2_int;
                      if (sa.field_a.field_j >= param1) {
                        sa.field_a.field_j = 0;
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      }
                    } else {
                      if (var2_int < 0) {
                        q.g(-114);
                        return false;
                      } else {
                        int discarded$3 = 18;
                        if (wh.a() <= 30000L) {
                          break L0;
                        } else {
                          q.g(-114);
                          return false;
                        }
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  q.g(-117);
                  return false;
                }
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(Throwable param0) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        rg var15 = null;
        StringWriter var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        L0: {
          var14 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 instanceof rg) {
            var15 = (rg) (Object) param0;
            param0 = var15.field_e;
            var2 = var15.field_b + " | ";
            var12 = var2;
            var2 = var12;
            var12 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var16);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var16.toString();
        var12 = var5;
        var2 = var12;
        var12 = var5;
        var8 = 0;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var12 = var7;
        var2 = var12;
        var12 = var7;
        L1: while (true) {
          var9 = var6.readLine();
          var12 = var9;
          var2 = var12;
          var12 = var9;
          if (var9 == null) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L2: {
              var10 = var9.indexOf('(');
              var11 = var9.indexOf(')', var10 - -1);
              if (var10 == -1) {
                var12 = var9;
                var2 = var12;
                var2 = var12;
                break L2;
              } else {
                var12 = var9.substring(0, var10);
                break L2;
              }
            }
            L3: {
              var17 = var12.trim();
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf(' ') - -1);
              var2 = var18;
              var2 = var18;
              var19 = var18.substring(var18.lastIndexOf('\t') + 1);
              var2 = var19;
              var2 = var19;
              var20 = var2 + var19;
              var2 = var20;
              var2 = var20;
              if (var10 == -1) {
                break L3;
              } else {
                if (var11 == -1) {
                  break L3;
                } else {
                  var13 = var9.indexOf(".java:", var10);
                  if (var13 < 0) {
                    break L3;
                  } else {
                    var2 = var20 + var9.substring(var13 - -5, var11);
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + ' ';
            continue L1;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_j = null;
        field_l = null;
    }

    es(ln param0, fs param1, int param2, int param3) {
        try {
            ((es) this).field_o = param2;
            ((es) this).field_p = param0;
            ((es) this).field_i = param1;
            ((es) this).field_k = param3;
            ((es) this).field_h = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "es.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    es(ln param0, fs param1, int param2, int param3, int param4) {
        try {
            ((es) this).field_h = param3;
            ((es) this).field_p = param0;
            ((es) this).field_o = param2;
            ((es) this).field_k = param4;
            ((es) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "es.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
