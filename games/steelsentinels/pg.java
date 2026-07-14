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
        if (param0 != 28873) {
          boolean discarded$2 = pg.a(-89, 67, 9, -70, 59, 127, 12);
          field_t = null;
          field_s = null;
          field_x = null;
          field_z = null;
          field_u = null;
          field_w = null;
          field_y = null;
          return;
        } else {
          field_t = null;
          field_s = null;
          field_x = null;
          field_z = null;
          field_u = null;
          field_w = null;
          field_y = null;
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param4 == 0) {
          if (param3 <= param6) {
            if (param6 >= param1 + param3) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param2 < param5) {
                    break L1;
                  } else {
                    if (param2 >= param5 - -param0) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
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
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        od var14 = null;
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
        String var39 = null;
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
        if (param0 < -83) {
          var4.close();
          var20 = var15.toString();
          var2 = var20;
          var11 = var20;
          var21 = new BufferedReader((Reader) (Object) new StringReader(var20));
          var27 = var21.readLine();
          var2 = var27;
          var11 = var27;
          L1: while (true) {
            var22 = var21.readLine();
            var2 = var22;
            var11 = var22;
            var2 = var11;
            if (var22 != null) {
              L2: {
                var9 = var22.indexOf('(');
                var10 = var22.indexOf(')', 1 + var9);
                if (var9 != -1) {
                  var11 = var22.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var22;
                  break L2;
                }
              }
              L3: {
                var23 = var11.trim();
                var2 = var23;
                var2 = var23;
                var24 = var23.substring(var23.lastIndexOf(' ') - -1);
                var2 = var24;
                var2 = var24;
                var25 = var24.substring(var24.lastIndexOf('\t') + 1);
                var2 = var25;
                var2 = var25;
                var26 = var2 + var25;
                var2 = var26;
                var2 = var26;
                if (var9 == -1) {
                  break L3;
                } else {
                  if (-1 == var10) {
                    break L3;
                  } else {
                    var12 = var22.indexOf(".java:", var9);
                    if (var12 < 0) {
                      break L3;
                    } else {
                      var2 = var26 + var22.substring(var12 - -5, var10);
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
              var2 = var2 + "| " + var27;
              var11 = var2;
              return var2;
            }
          }
        } else {
          field_s = null;
          var4.close();
          var28 = var15.toString();
          var2 = var28;
          var11 = var28;
          var29 = new BufferedReader((Reader) (Object) new StringReader(var28));
          var6 = var29;
          var35 = var29.readLine();
          var2 = var35;
          var11 = var35;
          var7 = var35;
          var2 = var7;
          var11 = var7;
          L4: while (true) {
            var30 = var29.readLine();
            var2 = var30;
            var11 = var30;
            var2 = var11;
            if (var30 != null) {
              L5: {
                var9 = var30.indexOf('(');
                var10 = var30.indexOf(')', 1 + var9);
                if (var9 != -1) {
                  var11 = var30.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L5;
                } else {
                  var11 = var30;
                  break L5;
                }
              }
              L6: {
                var31 = var11.trim();
                var2 = var31;
                var2 = var31;
                var32 = var31.substring(var31.lastIndexOf(' ') - -1);
                var2 = var32;
                var2 = var32;
                var33 = var32.substring(var32.lastIndexOf('\t') + 1);
                var2 = var33;
                var2 = var33;
                var34 = var2 + var33;
                var2 = var34;
                var2 = var34;
                if (var9 == -1) {
                  break L6;
                } else {
                  if (-1 == var10) {
                    break L6;
                  } else {
                    var12 = var30.indexOf(".java:", var9);
                    if (var12 < 0) {
                      break L6;
                    } else {
                      var2 = var34 + var30.substring(var12 - -5, var10);
                      break L6;
                    }
                  }
                }
              }
              var2 = var2 + 32;
              continue L4;
            } else {
              var2 = var11;
              var11 = var2;
              var2 = var11;
              var2 = var2 + "| " + var35;
              var39 = var2;
              var11 = var2;
              return var2;
            }
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
