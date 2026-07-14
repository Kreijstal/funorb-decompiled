/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pp {
    static jp field_b;
    static String field_c;
    static int field_a;

    final static String a(int param0, Throwable param1) throws IOException {
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
        v var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = BrickABrac.field_J ? 1 : 0;
          if (param1 instanceof v) {
            var14 = (v) (Object) param1;
            param1 = var14.field_f;
            var2 = var14.field_d + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param1.printStackTrace(var4);
        if (param0 != 22570) {
          return null;
        } else {
          var4.close();
          var5 = var15.toString();
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
                var10 = var8.indexOf(')', var9 + 1);
                if ((var9 ^ -1) == 0) {
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
                if (0 == (var9 ^ -1)) {
                  break L3;
                } else {
                  if (-1 != var10) {
                    var12 = var8.indexOf(".java:", var9);
                    if (0 <= var12) {
                      var2 = var19 + var8.substring(var12 - -5, var10);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var2 = var2 + 32;
                    continue L1;
                  }
                }
              }
              var2 = var2 + 32;
              continue L1;
            }
          }
        }
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        var3 = 0;
        var4 = param2.length();
        var5 = 0;
        if (param0 == 120) {
          L0: while (true) {
            if (var4 <= var5) {
              return var3;
            } else {
              if (param1 != param2.charAt(var5)) {
                var5++;
                var5++;
                var5++;
                continue L0;
              } else {
                var3++;
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        } else {
          L1: {
            field_b = null;
            if (var4 <= var5) {
              break L1;
            } else {
              L2: {
                if (param1 != param2.charAt(var5)) {
                  var5++;
                  break L2;
                } else {
                  var3++;
                  var5++;
                  break L2;
                }
              }
              var5++;
              var5++;
              var5++;
              break L1;
            }
          }
          return var3;
        }
    }

    final static void a(byte param0) {
        vd.field_f.field_i = 0;
        vd.field_f.field_f = 0;
        int var1 = -90 % ((-32 - param0) / 62);
    }

    final static void a(int param0, int param1, byte param2) {
        wi.field_k = param0;
        if (param2 != 19) {
            return;
        }
        w.field_k = param1;
    }

    final static int a(j param0, byte param1, ak param2) {
        if (!(!param2.field_b.field_c)) {
            return param0.field_qb;
        }
        int var3 = 44 / ((param1 - -59) / 34);
        return param0.field_qb < param2.field_b.a(-30) ? param0.field_qb : -1 + param2.field_b.a(79);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            Object var2 = null;
            int discarded$0 = pp.a((byte) -84, 'ﾽ', (CharSequence) null);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static boolean a(String param0, boolean param1) {
        int stackIn_15_0 = 0;
        int stackOut_14_0;
        int stackOut_13_0;
        if (param1) {
          if (param0 != null) {
            if (param0.length() < pa.field_n) {
              return true;
            } else {
              L0: {
                if (param0.length() > ek.field_bb) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              return stackIn_15_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          field_b = null;
          if (param0 != null) {
            if (param0.length() >= pa.field_n) {
              if (param0.length() <= ek.field_bb) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Rankings";
    }
}
