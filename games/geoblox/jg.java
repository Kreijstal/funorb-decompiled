/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class jg {
    static String field_c;
    String field_e;
    static int field_a;
    static int field_g;
    static int[][] field_f;
    static int[][] field_h;
    int field_b;
    static String field_d;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != 1) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_e, this.field_b);
    }

    abstract java.net.Socket b(int param0) throws IOException;

    final static boolean d(int param0) {
        if (param0 != 7) {
            return true;
        }
        return !ih.field_c.a(-95) ? true : false;
    }

    final static j a(byte param0, String param1) {
        String var2 = null;
        j var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        j stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        j stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Geoblox.field_C;
        try {
          if (nh.field_a == null) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length() == 0) {
            return null;
          }
          if (param0 != -62) {
            stackIn_10_0 = (j) null;
            return stackIn_10_0;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = oe.a(var6, 12);
          if (var2 == null) {
            stackIn_13_0 = null;
            return (j) ((Object) stackIn_13_0);
          }
          var3 = (j) ((Object) nh.field_a.a((long)var2.hashCode(), -1));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_hb);
            var4 = oe.a(var7, 12);
            if (var4.equals(var2)) {
              stackIn_20_0 = (j) (var3);
              return stackIn_20_0;
            }
            var3 = (j) ((Object) nh.field_a.a(-29925));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = (RuntimeException) (var2_ref);
          stackIn_25_1 = new StringBuilder().append("jg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static na a(rh param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        na stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a((byte) 127, param2);
          if (param1 != 1) {
            field_a = 100;
          }
          var5 = param0.a(param3, -110, var4_int);
          stackIn_3_0 = vh.a(var5, param0, var4_int, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var4);
          stackIn_6_1 = new StringBuilder().append("jg.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 16712207) {
            jg.d(56);
        }
        field_f = (int[][]) null;
        field_h = (int[][]) null;
    }

    final static void a(rh param0, byte param1, rh param2, rh param3, rh param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        gd var6 = null;
        int var7 = 0;
        String var8 = null;
        var7 = Geoblox.field_C;
        try {
          kf.field_c = param3;
          sl.field_l = param4;
          p.field_i = new ue(22050, qk.field_j);
          ll.field_d = rf.a(kf.field_c, "", "title_music_loop");
          pi.field_S = rf.a(kf.field_c, "", "game_over");
          hf.field_d = rf.a(kf.field_c, "", "sun");
          qf.field_bb = rf.a(kf.field_c, "", "bonus_bubble_jingle");
          te.field_c = new ci(param0, param2);
          uh.field_y.a(te.field_c, 0, -1, hf.field_d, sl.field_l);
          ag.field_j[1] = true;
          uh.field_y.a(te.field_c, 0, -1, qf.field_bb, sl.field_l);
          uh.field_y.a(te.field_c, 0, -1, pi.field_S, sl.field_l);
          uh.field_y.a(te.field_c, 0, -1, ll.field_d, sl.field_l);
          var5_int = 0;
          if (param1 < 69) {
            var8 = (String) null;
            jg.a((byte) 74, (String) null);
          }
          while (var5_int < 33) {
            if ((ck.field_c[var5_int] > 0) &&
                (ck.field_c[var5_int] != 1)) {
              var5_int++;
              continue;
            }
            if ((var5_int >= 10) &&
                (26 >= var5_int)) {
              var6 = te.field_c.c(-1879044097, w.field_b[var5_int]);
            } else {
              var6 = te.field_c.b(1, w.field_b[var5_int]);
            }
            fl.field_c[var5_int] = var6.a(p.field_i);
            vg.field_j[var5_int] = true;
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var5);
          stackIn_17_1 = new StringBuilder().append("jg.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        int var0_int = 0;
        int var1 = 0;
        int[] var0;
        int var2;
        int var3;
        float var3_float;
        int var4;
        float var4_float;
        int var5;
        float var5_float;
        float var6;
        float var7;
        float var8;
        int var9;
        float var10;
        float var11;
        float var12;
        float var13;
        float var14;
        float var15;
        float var16;
        int[] var17;
        int[] var18;
        field_a = 9;
        field_c = "This game has been updated! Please reload this page.";
        field_g = 35;
        field_h = new int[7][7];
        field_f = new int[][]{new int[]{16646130, 4383370, 7784169, 16732531, 16569656, 16756645, 14022770}, new int[]{16099865, 16720435, 16770049, 42709, 16733161, 11078398, 3658269}, new int[]{16229425, 5957352, 16122070, 15595784, 10216240, 2706395, 11226077}, new int[]{52224, 39372, 16751631, 16751052, 16777011, 16724736, 10040217}, new int[]{16507819, 14654025, 14129125, 13953361, 14512505, 12506866, 12632256}, new int[]{15815889, 1289446, 16363563, 16116238, 9126089, 16730432, 5088306}, new int[]{16716239, 22986, 7461652, 16514820, 16712207, 16744452, 6438761}};
        for (var0_int = 0; var0_int < 7; var0_int++) {
          sf.a(field_f[var0_int], 0, field_h[var0_int], 0, 7);
        }
        var18 = new int[7];
        var17 = var18;
        var0 = var17;
        for (var1 = 0; var1 < 7; var1++) {
          for (var2 = 0; 7 > var2; var2++) {
            L6: {
              var3_float = (float)((field_f[var1][var2] & 16776188) >> 16) / 255.0f;
              var4_float = (float)((field_f[var1][var2] & 65454) >> 8) / 255.0f;
              var5_float = (float)(255 & field_f[var1][var2]) / 255.0f;
              var9 = 0;
              if ((var3_float > var4_float) &&
                  (var3_float > var5_float)) {
                var7 = var3_float;
                if (!(var4_float > var5_float)) {
                  var6 = var4_float;
                  break L6;
                }
                var6 = var5_float;
                break L6;
              }
              if ((var4_float > var3_float) &&
                  (var4_float > var5_float)) {
                var6 = (!(var3_float > var5_float)) ? var3_float : var5_float;
                var9 = 1;
                var7 = var4_float;
                break L6;
              }
              var7 = var5_float;
              var9 = 2;
              var6 = (!(var4_float < var3_float)) ? var3_float : var4_float;
            }
            var8 = var7 - var6;
            var10 = (var7 + var6) / 2.0f;
            if (!(var10 < 0.5f)) {
              var11 = var8 / (-var6 + (-var7 + 2.0f));
            } else {
              var11 = var8 / (var7 + var6);
            }
            var13 = 0.1666666716337204f;
            var14 = ((-var3_float + var7) * var13 + 0.5f * var8) / var8;
            var15 = ((-var4_float + var7) * var13 + 0.5f * var8) / var8;
            var16 = (var13 * (var7 - var5_float) + var8 * 0.5f) / var8;
            if (var9 == 0) {
              var12 = -var15 + var16;
            } else {
              if (var9 == 1) {
                var12 = -var16 + (0.3333333432674408f + var14);
              } else {
                var12 = -var14 + (0.6666666865348816f + var15);
              }
            }
            if (!(var12 < 0.0f)) {
              if (var12 > 1.0f) {
                var12 = var12 - 1.0f;
              }
            } else {
              var12 = var12 + 1.0f;
            }
            var0[var2] = (int)(var12 * 255.0f) << (int)(var11 * 255.0f) + 16 << 8 + (int)(255.0f * var10);
          }
          for (var2 = 1; 7 > var2; var2++) {
            var3 = -1 + var2;
            var4 = var18[var2];
            var5 = field_h[var1][var2];
            while (var3 >= 0) {
              if (var18[var3] > var4) {
                var0[var3 + 1] = var18[var3];
                field_h[var1][1 + var3] = field_h[var1][var3];
                var3--;
                continue;
              }
              break;
            }
            var0[var3 + 1] = var4;
            field_h[var1][var3 + 1] = var5;
          }
        }
    }
}
