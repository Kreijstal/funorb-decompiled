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
    static SceneWidget field_u;
    static RgbSprite[] field_v;
    static Calendar field_x;
    static int[] field_z;
    static String field_y;

    pg(long param0, String param1) {
        super(param0, param1);
    }

    final dj a(byte param0) {
        if (param0 <= 47) {
          this.a((byte) 26);
          return PartInstruction.field_h;
        }
        return PartInstruction.field_h;
    }

    final static void d(int param0) {
        if (param0 > 40) {
          tf.field_g.setLength(0);
          ib.field_b = 0;
          return;
        }
        pg.a(-52, 18, 84, 62, 58, -55, -37);
        tf.field_g.setLength(0);
        ib.field_b = 0;
    }

    public static void c(int param0) {
        field_v = null;
        if (param0 == 28873) {
          field_t = null;
          field_s = null;
          field_x = null;
          field_z = null;
          field_u = null;
          field_w = null;
          field_y = null;
          return;
        }
        pg.a(-89, 67, 9, -70, 59, 127, 12);
        field_t = null;
        field_s = null;
        field_x = null;
        field_z = null;
        field_u = null;
        field_w = null;
        field_y = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        boolean stackIn_18_0 = false;
        if (param4 != 0) {
          pg.a(-66, 110, -27, 62, 105, 97, 42);
          if (param3 > param6) {
            return false;
          }
          if (param6 >= param1 + param3) {
            return false;
          }
          if (param2 < param5) {
            return false;
          }
          if (param2 >= param5 + param0) {
            return false;
          }
          return true;
        }
        if (param3 > param6) {
          return false;
        }
        if (param6 >= param1 + param3) {
          return false;
        }
        stackIn_18_0 = (param2 >= param5) && (param2 < param5 + param0);
        return stackIn_18_0;
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        od var14;
        StringWriter var15;
        String var20;
        BufferedReader var21;
        String var22;
        String var23;
        String var24;
        String var25;
        String var26;
        String var27;
        BufferedReader var6;
        String var7;
        String var28;
        BufferedReader var29;
        String var30;
        String var31;
        String var32;
        String var33;
        String var34;
        String var35;
        String var39;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var2Lifetime4;
        String var2Lifetime5;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var2Lifetime1Lifetime1;
        String var2Lifetime1Lifetime2;
        String var2Lifetime5Lifetime1;
        String var2Lifetime5Lifetime2;
        String var2Lifetime5Lifetime3;
        String var2Lifetime5Lifetime4;
        String var2Lifetime5Lifetime5;
        String var2Lifetime5Lifetime6;
        String var2Lifetime5Lifetime7;
        String var2Lifetime5Lifetime8;
        String var2Lifetime5Lifetime9;
        String var2Lifetime5Lifetime10;
        String var2Lifetime5Lifetime11;
        String var2Lifetime5Lifetime12;
        String var11Lifetime1Lifetime1;
        String var11Lifetime1Lifetime2;
        String var11Lifetime5Lifetime1;
        var13 = SteelSentinels.obfuscationControl;
        if (param1 instanceof od) {
          var14 = (od) ((Object) param1);
          param1 = var14.field_l;
          var2 = var14.field_a + " | ";
          var11 = var2;
        } else {
          var2 = "";
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        if (param0 < -83) {
          var4.close();
          var20 = var15.toString();
          var2Lifetime1 = var20;
          var11Lifetime1 = var20;
          var21 = new BufferedReader((Reader) ((Object) new StringReader(var20)));
          var27 = var21.readLine();
          var2Lifetime1Lifetime1 = var27;
          var11Lifetime1Lifetime1 = var27;
          while (true) {
            var22 = var21.readLine();
            var2Lifetime1Lifetime2 = var22;
            var11Lifetime1Lifetime2 = var22;
            var2Lifetime1Lifetime2 = var11Lifetime1Lifetime2;
            if (var22 == null) {
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime2;
              var11Lifetime1Lifetime2 = var2Lifetime1Lifetime2;
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime2;
              var2Lifetime1Lifetime2 = var2Lifetime1Lifetime2 + "| " + var27;
              var11Lifetime1Lifetime2 = var2Lifetime1Lifetime2;
              return var2Lifetime1Lifetime2;
            }
            var9 = var22.indexOf('(');
            var10 = var22.indexOf(')', 1 + var9);
            if (var9 != -1) {
              var11Lifetime1Lifetime2 = var22.substring(0, var9);
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime2;
              var2Lifetime1Lifetime2 = var11Lifetime1Lifetime2;
            } else {
              var11Lifetime1Lifetime2 = var22;
            }
            var23 = var11Lifetime1Lifetime2.trim();
            var2Lifetime1Lifetime2 = var23;
            var2Lifetime1Lifetime2 = var23;
            var24 = var23.substring(var23.lastIndexOf(' ') + 1);
            var2Lifetime1Lifetime2 = var24;
            var2Lifetime1Lifetime2 = var24;
            var25 = var24.substring(var24.lastIndexOf('\t') + 1);
            var2Lifetime1Lifetime2 = var25;
            var2Lifetime1Lifetime2 = var25;
            var26 = var2Lifetime1Lifetime2 + var25;
            var2Lifetime1Lifetime2 = var26;
            var2Lifetime1Lifetime2 = var26;
            var2Lifetime1Lifetime2 = var26;
            if (var9 != -1 &&
              -1 != var10) {
              var12 = var22.indexOf(".java:", var9);
              if (var12 >= 0) {
                var2Lifetime1Lifetime2 = var26 + var22.substring(var12 + 5, var10);
              }
            }
            var2Lifetime1Lifetime2 = var2Lifetime1Lifetime2 + ' ';
          }
        }
        field_s = (String) null;
        var4.close();
        var28 = var15.toString();
        var2Lifetime2 = var28;
        var11Lifetime2 = var28;
        var29 = new BufferedReader((Reader) ((Object) new StringReader(var28)));
        var6 = var29;
        var35 = var29.readLine();
        var2Lifetime3 = var35;
        var11Lifetime3 = var35;
        var7 = var35;
        var2Lifetime4 = var7;
        var11Lifetime4 = var7;
        while (true) {
          var30 = var29.readLine();
          var2Lifetime5 = var30;
          var11Lifetime5 = var30;
          var2Lifetime5Lifetime1 = var11Lifetime5;
          if (var30 == null) {
            var2Lifetime5Lifetime2 = var11Lifetime5;
            var11Lifetime5 = var2Lifetime5Lifetime2;
            var2Lifetime5Lifetime2 = var11Lifetime5;
            var2Lifetime5Lifetime2 = var2Lifetime5Lifetime2 + "| " + var35;
            var39 = var2Lifetime5Lifetime2;
            var11Lifetime5 = var2Lifetime5Lifetime2;
            return var2Lifetime5Lifetime2;
          }
          var9Lifetime1 = var30.indexOf('(');
          var10Lifetime1 = var30.indexOf(')', 1 + var9Lifetime1);
          if (var9Lifetime1 != -1) {
            var11Lifetime5Lifetime1 = var30.substring(0, var9Lifetime1);
            var2Lifetime5Lifetime3 = var11Lifetime5Lifetime1;
            var2Lifetime5Lifetime3 = var11Lifetime5Lifetime1;
          } else {
            var11Lifetime5Lifetime1 = var30;
          }
          var31 = var11Lifetime5Lifetime1.trim();
          var2Lifetime5Lifetime4 = var31;
          var2Lifetime5Lifetime5 = var31;
          var32 = var31.substring(var31.lastIndexOf(' ') + 1);
          var2Lifetime5Lifetime6 = var32;
          var2Lifetime5Lifetime7 = var32;
          var33 = var32.substring(var32.lastIndexOf('\t') + 1);
          var2Lifetime5Lifetime8 = var33;
          var2Lifetime5Lifetime9 = var33;
          var34 = var2Lifetime5Lifetime9 + var33;
          var2Lifetime5Lifetime10 = var34;
          var2Lifetime5Lifetime11 = var34;
          var2Lifetime5Lifetime12 = var34;
          if (var9Lifetime1 != -1 &&
            -1 != var10Lifetime1) {
            var12Lifetime1 = var30.indexOf(".java:", var9Lifetime1);
            if (var12Lifetime1 >= 0) {
              var2Lifetime5Lifetime12 = var34 + var30.substring(var12Lifetime1 + 5, var10Lifetime1);
            }
          }
          var2Lifetime5Lifetime12 = var2Lifetime5Lifetime12 + ' ';
        }
    }

    static {
        field_A = false;
        field_B = 4;
        field_s = "Unable to connect to the data server. Please check any firewall you are using.";
        field_t = "If you do nothing the game will revert to normal view in <%0> second.";
        field_z = new int[]{0, 49, 96, 29, 1, 17, 3, 26, 26, 26, 2, 30, 0, 21, 10, 26, -1, -1, -1, -1};
        field_y = "Engineering the <col=ffffff><%0></col> will expend <col=116030><%1><nbsp>solarite<nbsp>cubes.<br><br>You currently have <col=116030><%2></col><nbsp>solarite<nbsp>cubes.<br><br>Continue?";
        field_x = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
