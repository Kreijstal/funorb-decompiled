/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends IntrusiveNode {
    int field_p;
    static wj field_o;
    static boolean field_A;
    static byte[] field_w;
    static el field_y;
    byte[] field_B;
    static RgbSprite[][] field_x;
    static boolean field_q;
    static String field_u;
    static int field_z;
    long field_v;
    static String field_C;
    static boolean field_r;
    static fk field_s;
    static String field_t;

    public static void d(int param0) {
        field_x = (RgbSprite[][]) null;
        field_w = null;
        field_o = null;
        field_C = null;
        if (param0 != -1341) {
          int[] var2 = (int[]) null;
          kc.a((int[]) null, (int[]) null, -79);
        }
        field_t = null;
        field_y = null;
        field_s = null;
        field_u = null;
    }

    final static void a(String param0, int param1, boolean param2, int param3, java.awt.Color param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = sl.field_n.getGraphics();
            if (null == wc.field_f) {
              wc.field_f = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param2) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, na.field_i, li.field_A);
            }
            if (param4 == null) {
              param4 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (ll.field_j == null) {
                ll.field_j = sl.field_n.createImage(304, 34);
              }
              var10 = ll.field_j.getGraphics();
              var10.setColor(param4);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, param1 * 3, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(3 * param1 + 2, 2, param3 - 3 * param1, 30);
              var10.setFont(wc.field_f);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param0, (304 - 6 * param0.length()) / 2, 22);
              var9.drawImage(ll.field_j, -152 + na.field_i / 2, -18 + li.field_A / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = na.field_i / 2 - 152;
              var8 = -18 + li.field_A / 2;
              var9.setColor(param4);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, param1 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(1 + var7, var8 + 1, 301, 31);
              var9.fillRect(2 + var7 + 3 * param1, 2 + var8, 300 - param1 * 3, 30);
              var9.setFont(wc.field_f);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param0, var7 + (-(6 * param0.length()) + 304) / 2, 22 + var8);
            }
            if (id.field_Wb != null) {
              var9.setFont(wc.field_f);
              var9.setColor(java.awt.Color.white);
              var9.drawString(id.field_Wb, na.field_i / 2 - 6 * id.field_Wb.length() / 2, -26 + li.field_A / 2);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            sl.field_n.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var5_ref;
          stackIn_20_1 = new StringBuilder().append("kc.C(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static String a(int[] param0, int[] param1, int param2) {
        String stackIn_137_0 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_141_2 = null;
        StringBuilder stackIn_143_1 = null;
        String stackIn_144_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var8Lifetime1;
        var9 = SteelSentinels.obfuscationControl;
        try {
          var3_int = 0;
          var4 = 0;
          for (var6 = 0; var6 < param0.length; var6++) {
            if (-1 != param0[var6]) {
              var3_int = var3_int + param0[var6];
            }
            if (param0[var6] == 49) {
              var4 = 6;
            }
            var3_int = (var3_int ^ 10 * var3_int) & 8388607;
          }
          for (var6Lifetime1 = 0; var6Lifetime1 < 8; var6Lifetime1++) {
            var3_int = 8388607 & (var3_int ^ 10 * var3_int);
          }
          var5 = cd.field_c[1];
          var6Lifetime2 = NodeDeque.a((byte) -84, param0[0]);
          if (var6Lifetime2 >= 0 &&
            var6Lifetime2 < cd.field_c.length) {
            var5 = cd.field_c[var6Lifetime2];
          }
          if (var6Lifetime2 == 0) {
            var3_int = var3_int ^ 8176765;
          }
          var5 = var5 + "-";
          if (var6Lifetime2 == 1) {
            var3_int = var3_int ^ 1155849;
          }
          if (param2 == var6Lifetime2) {
            var3_int = var3_int ^ 5624312;
          }
          if (var6Lifetime2 == 3) {
            var3_int = var3_int ^ 7177436;
          }
          if (var6Lifetime2 == 4) {
            var3_int = var3_int ^ 5318225;
          }
          if (var6Lifetime2 == 5) {
            var3_int = var3_int ^ 18177652;
          }
          if (var6Lifetime2 == 6) {
            var3_int = var3_int ^ 7171409;
          }
          if (var6Lifetime2 == 7) {
            var3_int = var3_int ^ 3140392;
          }
          if (8 == var6Lifetime2) {
            var3_int = var3_int ^ 5104464;
          }
          if (var6Lifetime2 == 9) {
            var3_int = var3_int ^ 5940651;
          }
          if (var6Lifetime2 == 10) {
            var3_int = var3_int ^ 7257749;
          }
          if (var6Lifetime2 == 11) {
            var3_int = var3_int ^ 2016943;
          }
          var7 = var3_int;
          for (var8 = 0; var8 < 5; var8++) {
            if (var7 % 35 > 0 &&
              var7 % 35 < 26) {
              var5 = var5 + (char)(65 + (var7 % 35 - 1) % 26);
            } else {
              if (var7 % 35 >= 26) {
                var5 = var5 + (char)((-26 + var7 % 35) % 10 + 48);
              }
            }
            var7 = var7 / 35;
          }
          for (var8Lifetime1 = 0; param1.length > var8Lifetime1; var8Lifetime1++) {
            if (param1[var8Lifetime1] == 0 &&
              var4 < 1) {
              var4 = 1;
            }
            if (1 == param1[var8Lifetime1] &&
              2 > var4) {
              var4 = 2;
            }
            if (param1[var8Lifetime1] == 2 &&
              var4 < 3) {
              var4 = 3;
            }
            if (param1[var8Lifetime1] == 3 &&
              var4 < 4) {
              var4 = 4;
            }
            if (param1[var8Lifetime1] == 4 &&
              var4 < 5) {
              var4 = 5;
            }
            if (param1[var8Lifetime1] == 5 &&
              var4 < 1) {
              var4 = 1;
            }
            if (param1[var8Lifetime1] == 6 &&
              var4 < 2) {
              var4 = 2;
            }
            if (param1[var8Lifetime1] == 7 &&
              var4 < 3) {
              var4 = 3;
            }
            if (param1[var8Lifetime1] == 8 &&
              var4 < 4) {
              var4 = 4;
            }
            if (param1[var8Lifetime1] == 9 &&
              var4 < 5) {
              var4 = 5;
            }
            if (param1[var8Lifetime1] == 10 &&
              var4 < 1) {
              var4 = 1;
            }
            if (param1[var8Lifetime1] == 11 &&
              var4 < 2) {
              var4 = 2;
            }
            if (param1[var8Lifetime1] == 12 &&
              var4 < 3) {
              var4 = 3;
            }
            if (param1[var8Lifetime1] == 13 &&
              var4 < 4) {
              var4 = 4;
            }
            if (param1[var8Lifetime1] == 14 &&
              var4 < 5) {
              var4 = 5;
            }
            if (param1[var8Lifetime1] == 20 &&
              6 > var4) {
              var4 = 6;
            }
          }
          if (1 == var4) {
            var5 = var5 + "-V1";
          }
          if (var4 == 2) {
            var5 = var5 + "-V2";
          }
          if (var4 == 3) {
            var5 = var5 + "-V3";
          }
          if (var4 == 4) {
            var5 = var5 + "-V4";
          }
          if (var4 == 5) {
            var5 = var5 + "-V5";
          }
          if (var4 == 6) {
            var5 = var5 + "-<img=18>";
          }
          stackIn_137_0 = var5;
          return stackIn_137_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_140_0 = var3;
          stackIn_140_1 = new StringBuilder().append("kc.A(");
          if (param0 == null) {
            stackIn_141_2 = "null";
          } else {
            stackIn_141_2 = "{...}";
          }
          stackIn_143_1 = ((StringBuilder) (Object) stackIn_140_1).append(stackIn_141_2).append(',');
          if (param1 == null) {
            stackIn_144_2 = "null";
          } else {
            stackIn_144_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_140_0), ((StringBuilder) (Object) stackIn_143_1).append(stackIn_144_2).append(',').append(param2).append(')').toString());
        }
    }

    kc(long param0, int param1, byte[] param2) {
        try {
          this.field_p = param1;
          this.field_v = param0;
          this.field_B = param2;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "kc.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_A = false;
        field_w = new byte[]{(byte) 1, (byte) 0, (byte) 0};
        field_u = "Choose a chassis for your sentinel configuration. Each chassis is equipped with a default set of weapons and modules.";
        field_C = "New Game";
        field_t = "Show all game chat";
    }
}
