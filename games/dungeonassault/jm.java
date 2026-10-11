/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static String[] field_a;
    static String field_g;
    static String field_b;
    static cn field_i;
    static String field_e;
    static lh field_h;
    static int field_c;
    static String field_d;
    static md field_f;

    final static void a(int param0, int param1, int param2, int param3) {
        if (param1 % 7 != 0 &&
          gm.field_d.field_k.a(-(param1 / 7) + (-1 + param1), (byte) 105)) {
          ol.field_a[0].b(param3, param0, 256);
        }
        if (param1 % 7 != 6 &&
          gm.field_d.field_k.a(param1 - param1 / 7, (byte) 109)) {
          ol.field_a[2].b(param3, param0, 256);
        }
        if (param2 != 3) {
          jm.a(125, 94, 37, 21);
        }
        if (6 < param1 &&
          gm.field_d.field_k.a(param1 + 35, (byte) 117)) {
          ol.field_a[1].b(param3, param0, 256);
        }
        if (42 > param1 &&
          gm.field_d.field_k.a(param1 + 42, (byte) 114)) {
          ol.field_a[3].b(param3, param0, 256);
        }
    }

    final static void a(la param0, byte param1) {
        int var2_int = 0;
        la var3 = null;
        int var4 = 0;
        la var5 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = DungeonAssault.field_K;
        try {
          if (null == param0.field_d) {
            return;
          }
          if (0 != param0.field_o ||
            0 != param0.field_m) {
            for (var2_int = 0; var2_int < ud.field_x; var2_int++) {
              var3 = nb.field_a[var2_int];
              if (var3.field_n == 2 &&
                var3.field_o == param0.field_o &&
                var3.field_m == param0.field_m) {
                return;
              }
            }
          }
          if (param1 != 116) {
            var5 = (la) null;
            jm.a((la) null, (byte) 75);
          }
          if (null != param0.field_i) {
          }
          ul.a(param0, -440);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("jm.E(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, cn[] param2, int param3, int param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        try {
          if (param2 != null &&
            param1 > 0) {
            var5_int = param2[0].field_E;
            var6 = param2[2].field_E;
            var7 = param2[1].field_E;
            param2[param3].h(param0, param4);
            param2[2].h(param0 + param1 - var6, param4);
            gf.a(mk.field_i);
            gf.a(param0 + var5_int, param4, param1 + (param0 - var6), param4 + param2[1].field_G);
            var8 = var5_int + param0;
            var9 = param1 + param0 - var6;
            for (param0 = var8; var9 > param0; param0 = param0 + var7) {
              param2[1].h(param0, param4);
            }
            gf.b(mk.field_i);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("jm.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        bb.field_e = null;
        td.field_a = null;
        if (param0) {
          la var2 = (la) null;
          jm.a((la) null, (byte) -11);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_h = null;
        field_g = null;
        field_i = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
        if (param0 >= -114) {
          field_i = (cn) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        gf.e(param1, param4, param2, param0, 0);
        gf.e(param1 - 1, param4 - 1, param2 + 2, 2 + param0, 12632256);
        qe.b(param1 - 1, -1 + param4, 2 + param2, param0 + 2, 192, 64, 3, 192);
        if (param3 >= -73) {
          la var6 = (la) null;
          jm.a((la) null, (byte) 25);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        try {
          if (param1 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param1.length();
          while (var3 > var2_int) {
            if (jc.a(param1.charAt(var2_int), 48)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (jc.a(param1.charAt(-1 + var3), -119)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          if (param0 != 59) {
            jm.a(52, -105, -111, 63);
          }
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param1.charAt(var6);
            if (il.a(true, (char) var7)) {
              var8 = tl.a((byte) -69, (char) var7);
              if (0 != var8) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            stackIn_30_0 = var5.toString();
            return stackIn_30_0;
          }
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("jm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (ed.c(true)) {
          return;
        }
        if (!jn.field_c) {
          ac.field_B.d((byte) -80, 70);
          ac.field_B.b((byte) -106, ke.field_b);
          ac.field_B.a(6, oh.field_s);
        } else {
          ac.field_B.d((byte) -113, 71);
          ac.field_B.field_o = ac.field_B.field_o + 1;
          var1 = ac.field_B.field_o;
          ac.field_B.a(2, ip.field_j);
          ac.field_B.a(6, oh.field_s);
          ac.field_B.c(ac.field_B.field_o - var1, -1);
        }
        if (param0 != -17573) {
          jm.a(false);
        }
    }

    static {
        field_g = "A very large, well-muscled creature with the head of a bull and the body of a man. It wields a massive axe but wears little in the way of protective clothing.";
        field_e = "Names cannot start or end with space or underscore";
        field_b = "achievements to collect";
        field_a = new String[]{"Summon Zombie", "From the miscellaneous body parts found so frequently around a dungeon, the <%0> is able to assemble a zombie to scout the next room. The zombie is incapable of fighting or disarming traps. (Single use)"};
        field_d = "Most reptiles don't have eight legs. Saying that, most reptiles don't have a penchant for eating raiders.";
    }
}
