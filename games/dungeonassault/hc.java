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
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        if (param0 == 1) {
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
                  stackIn_21_0 = 0;
                  break L0;
                } else {
                  stackIn_21_0 = 1;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackIn_17_0 = 1;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          hc.a(-2);
          if (wh.field_d) {
            if (null != gm.field_d) {
              return true;
            } else {
              L1: {
                if (!ed.c(true)) {
                  stackIn_10_0 = 0;
                  break L1;
                } else {
                  stackIn_10_0 = 1;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (!ed.c(true)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
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
        String var2;
        BufferedReader var6;
        String var7;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        b var14;
        PrintWriter var20;
        StringWriter var21;
        String var22;
        BufferedReader var23;
        String var24;
        String var25;
        String var26;
        String var27;
        String var28;
        String var29;
        PrintWriter var30;
        StringWriter var31;
        String var32;
        BufferedReader var33;
        String var34;
        String var35;
        String var36;
        String var37;
        String var38;
        String var39;
        L0: {
          var13 = DungeonAssault.field_K;
          if (param1 instanceof b) {
            var14 = (b) ((Object) param1);
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
          var20 = new PrintWriter((Writer) ((Object) var21));
          param1.printStackTrace(var20);
          var20.close();
          var22 = var21.toString();
          var11 = var22;
          var2 = var11;
          var11 = var22;
          var23 = new BufferedReader((Reader) ((Object) new StringReader(var22)));
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
                var2 = var28;
                if (-1 == var9) {
                  break L3;
                } else {
                  if (0 == (var10 ^ -1)) {
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
              var2 = var2 + ' ';
              continue L1;
            }
          }
        } else {
          field_e = (se) null;
          var31 = new StringWriter();
          var30 = new PrintWriter((Writer) ((Object) var31));
          param1.printStackTrace(var30);
          var30.close();
          var32 = var31.toString();
          var11 = var32;
          var2 = var11;
          var11 = var32;
          var33 = new BufferedReader((Reader) ((Object) new StringReader(var32)));
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
              var2 = var11;
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
                var2 = var38;
                if (-1 == var9) {
                  break L6;
                } else {
                  if (0 == (var10 ^ -1)) {
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
              var2 = var2 + ' ';
              continue L4;
            }
          }
        }
    }

    static {
        field_c = -1;
        field_g = "His face is obscured by the darkness of his hood and most do not notice him until his voice rasps in their ear...or his blade plunges into their back.";
        field_a = new cn(540, 140);
    }
}
