/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hc {
    static int field_c;
    static se field_f;
    static int field_b;
    static cn field_a;
    static String field_g;
    static se field_e;
    static int field_d;

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        if (!wh.field_d) {
          if (ed.c(true)) {
            return true;
          } else {
            return false;
          }
        } else {
          if (null == gm.field_d) {
            L0: {
              if (!ed.c(true)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              }
            }
            return stackIn_8_0 != 0;
          } else {
            stackOut_2_0 = 1;
            stackIn_4_0 = stackOut_2_0;
            return stackIn_4_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_f = null;
        field_g = null;
        if (param0 != 32) {
            field_b = 53;
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        b var14 = null;
        PrintWriter var20 = null;
        StringWriter var21 = null;
        String var22 = null;
        BufferedReader var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        PrintWriter var30 = null;
        StringWriter var31 = null;
        String var32 = null;
        BufferedReader var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var39 = null;
        String var46 = null;
        L0: {
          var13 = DungeonAssault.field_K;
          if (param1 instanceof b) {
            var14 = (b) (Object) param1;
            param1 = var14.field_d;
            var2 = var14.field_c + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        if (param0 == 9) {
          var21 = new StringWriter();
          var20 = new PrintWriter((Writer) (Object) var21);
          param1.printStackTrace(var20);
          var20.close();
          var22 = var21.toString();
          var11 = var22;
          var2 = var11;
          var11 = var22;
          var23 = new BufferedReader((Reader) (Object) new StringReader(var22));
          var29 = var23.readLine();
          var11 = var29;
          var2 = var11;
          var11 = var29;
          L1: while (true) {
            var24 = var23.readLine();
            var11 = var24;
            var2 = var11;
            var11 = var24;
            if (var24 == null) {
              var2 = var2 + "| " + var29;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              return var2;
            } else {
              L2: {
                var9 = var24.indexOf('(');
                var10 = var24.indexOf(')', var9 + 1);
                if (-1 != var9) {
                  var11 = var24.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var24;
                  break L2;
                }
              }
              L3: {
                var25 = var11.trim();
                var2 = var25;
                var2 = var25;
                var26 = var25.substring(var25.lastIndexOf(' ') + 1);
                var2 = var26;
                var2 = var26;
                var27 = var26.substring(var26.lastIndexOf('\t') + 1);
                var2 = var27;
                var2 = var27;
                var28 = var2 + var27;
                var2 = var28;
                var2 = var28;
                if (-1 == var9) {
                  break L3;
                } else {
                  if (var10 == -1) {
                    break L3;
                  } else {
                    var12 = var24.indexOf(".java:", var9);
                    if (var12 >= 0) {
                      var2 = var28 + var24.substring(5 + var12, var10);
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
          field_e = null;
          var31 = new StringWriter();
          var30 = new PrintWriter((Writer) (Object) var31);
          param1.printStackTrace(var30);
          var30.close();
          var32 = var31.toString();
          var11 = var32;
          var2 = var11;
          var11 = var32;
          var33 = new BufferedReader((Reader) (Object) new StringReader(var32));
          var6 = var33;
          var39 = var33.readLine();
          var11 = var39;
          var2 = var11;
          var11 = var39;
          var7 = var39;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L4: while (true) {
            var34 = var33.readLine();
            var11 = var34;
            var2 = var11;
            var11 = var34;
            if (var34 == null) {
              var2 = var2 + "| " + var39;
              var11 = var2;
              var46 = var11;
              var11 = var2;
              return var2;
            } else {
              L5: {
                var9 = var34.indexOf('(');
                var10 = var34.indexOf(')', var9 + 1);
                if (-1 != var9) {
                  var11 = var34.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L5;
                } else {
                  var11 = var34;
                  break L5;
                }
              }
              L6: {
                var35 = var11.trim();
                var2 = var35;
                var2 = var35;
                var36 = var35.substring(var35.lastIndexOf(' ') + 1);
                var2 = var36;
                var2 = var36;
                var37 = var36.substring(var36.lastIndexOf('\t') + 1);
                var2 = var37;
                var2 = var37;
                var38 = var2 + var37;
                var2 = var38;
                var2 = var38;
                if (-1 == var9) {
                  break L6;
                } else {
                  if (var10 == -1) {
                    break L6;
                  } else {
                    var12 = var34.indexOf(".java:", var9);
                    if (var12 >= 0) {
                      var2 = var38 + var34.substring(5 + var12, var10);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_g = "His face is obscured by the darkness of his hood and most do not notice him until his voice rasps in their ear...or his blade plunges into their back.";
        field_a = new cn(540, 140);
    }
}
