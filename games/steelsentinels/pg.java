/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class pg extends fb {
    static String field_t;
    static int[] field_w;
    static String field_s;
    static boolean field_A;
    static int field_B;
    static gh field_u;
    static wk[] field_v;
    static Calendar field_x;
    static int[] field_z;
    static String field_y;

    pg(long param0, String param1) {
        super(param0, param1);
    }

    final dj a(byte param0) {
        if (param0 <= 47) {
            dj discarded$0 = ((pg) this).a((byte) 26);
            return qd.field_h;
        }
        return qd.field_h;
    }

    final static void d(int param0) {
        if (param0 <= 40) {
          boolean discarded$2 = pg.a(-52, 18, 84, 62, 58, -55, -37);
          tf.field_g.setLength(0);
          ib.field_b = 0;
          return;
        } else {
          tf.field_g.setLength(0);
          ib.field_b = 0;
          return;
        }
    }

    public static void c(int param0) {
        field_v = null;
        field_t = null;
        field_s = null;
        field_x = null;
        field_z = null;
        field_u = null;
        field_w = null;
        field_y = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 == 0) {
          if (param3 <= param6) {
            if (param6 < param1 + param3) {
              if (param2 >= param5) {
                if (param2 >= param5 - -param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$11 = pg.a(-66, 110, -27, 62, 105, 97, 42);
          if (param3 <= param6) {
            if (param6 < param1 + param3) {
              if (param2 >= param5) {
                if (param2 >= param5 - -param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static String a(byte param0, Throwable param1) throws IOException {
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
        od var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = SteelSentinels.field_G;
          if (param1 instanceof od) {
            var14 = (od) (Object) param1;
            param1 = var14.field_l;
            var2 = var14.field_a + " | ";
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
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 != -1) {
                var11 = var8.substring(0, var9);
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8;
                break L2;
              }
            }
            L3: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf(' ') - -1);
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') + 1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L3;
              } else {
                if (-1 == var10) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L3;
                  } else {
                    var2 = var19 + var8.substring(var12 - -5, var10);
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + ' ';
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = false;
        field_B = 4;
        field_s = "Unable to connect to the data server. Please check any firewall you are using.";
        field_t = "If you do nothing the game will revert to normal view in <%0> second.";
        field_z = new int[]{0, 49, 96, 29, 1, 17, 3, 26, 26, 26, 2, 30, 0, 21, 10, 26, -1, -1, -1, -1};
        field_y = "Engineering the <col=ffffff><%0></col> will expend <col=116030><%1><nbsp>solarite<nbsp>cubes.<br><br>You currently have <col=116030><%2></col><nbsp>solarite<nbsp>cubes.<br><br>Continue?";
        field_x = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
