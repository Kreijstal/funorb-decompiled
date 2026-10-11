/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static hk field_f;
    static String field_g;
    static String field_d;
    static int[] field_a;
    static String[] field_e;
    static String[] field_c;
    static boolean field_b;
    static int field_h;

    final static vk c(int param0) {
        if (param0 != 3) {
          return (vk) null;
        }
        return jp.field_Bb;
    }

    final static void a(byte param0) {
        int var8_int = 0;
        int var19 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        jr var4 = null;
        wj var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        sl var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var27 = sa.field_a;
          var2 = var27.j(-56);
          if (0 == var2) {
            var3 = var27.f(-20976);
            var4 = (jr) (i.field_n.d(0));
            while (var4 != null) {
              if (~var3 != ~var4.field_j) {
                var4 = (jr) (i.field_n.a((byte) -71));
                continue;
              }
              break;
            }
            if (var4 == null) {
              q.g(-125);
              return;
            }
            var5 = var27.j(-77);
            if (0 != var5) {
              var6 = var4.field_i;
              rf.field_j[0].field_b = null;
              rf.field_j[0].field_d = ln.field_o;
              var7 = var4.field_k;
              rf.field_j[0].field_a = false;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                rf.field_j[var8_int].field_d = var27.e(-1);
                rf.field_j[var8_int].field_a = false;
                if (var27.j(-78) != 1) {
                  rf.field_j[var8_int].field_b = null;
                } else {
                  rf.field_j[var8_int].field_b = var27.e(-1);
                }
              }
              var8 = new String[3][var6];
              var9 = new String[3][var6];
              var34 = new long[3][var6];
              var35 = new int[3][var7 * var6];
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.j(-56);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var27.j(-115);
                  var21 = rf.field_j[var20].field_d;
                  var22 = var27.d(105);
                  var24 = var27.field_j;
                  if (var19 < var6) {
                    var8[0][var12] = var21;
                    var9[0][var12] = rf.field_j[var20].field_b;
                    var34[0][var12] = var22;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$0 = var15;
                      var15++;
                      var35[0][incrementValue$0] = var27.a(16711680);
                    }
                    var12++;
                  }
                  if (var21 != null &&
                    jp.a(var21, (byte) -105)) {
                    var8[1][var13] = ln.field_o;
                    var9[1][var13] = null;
                    var34[1][var13] = var22;
                    var13++;
                    var27.field_j = var24;
                    for (var25Lifetime1 = 0; var25Lifetime1 < var7; var25Lifetime1++) {
                      incrementValue$1 = var16;
                      var16++;
                      var35[1][incrementValue$1] = var27.a(16711680);
                    }
                  }
                  if (var14 < var6 &&
                    !rf.field_j[var20].field_a) {
                    rf.field_j[var20].field_a = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = rf.field_j[var20].field_b;
                    var34[2][var14] = var22;
                    var27.field_j = var24;
                    var14++;
                    for (var25Lifetime2 = 0; var25Lifetime2 < var7; var25Lifetime2++) {
                      incrementValue$2 = var17;
                      var17++;
                      var35[2][incrementValue$2] = var27.a(16711680);
                    }
                  }
                }
              }
            }
            var4.b((byte) -58);
          } else {
            if (1 == var2) {
              var3 = var27.f(-20976);
              var27.d(56);
              var4_ref = (wj) (wd.field_P.d(0));
              while (var4_ref != null) {
                if (var4_ref.field_h != var3) {
                  var4_ref = (wj) (wd.field_P.a((byte) -71));
                  continue;
                }
                break;
              }
              if (var4_ref != null) {
                var4_ref.b((byte) -63);
                decompiledFrameRemainder0 = false;
              }
              else {
                q.g(-112);
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              jq.a(-29901, (Throwable) null, "HS1: " + w.a(16738));
              q.g(-100);
            }
          }
          if (param0 <= 94) {
            field_c = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "ae.A(" + param0 + ')');
        }
    }

    final static int[] a(int param0) {
        int var1 = 125 % ((-3 - param0) / 43);
        return new int[8];
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != -17358) {
          field_b = false;
        }
        field_g = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_d = null;
    }

    final static void b(byte param0) {
        int var1 = 0;
        Throwable decompiledCaughtException = null;
        Object var2 = null;
        var1 = 59 / ((param0 + 53) / 32);
        var2 = pd.field_j;
        synchronized (var2) {
          ql.field_q = ql.field_q + 1;
          rf.field_n = v.field_d;
          pd.field_k = aj.field_f;
          bb.field_b = rf.field_i;
          r.field_d = kh.field_Lb;
          kh.field_Lb = false;
          je.field_d = vh.field_c;
          nh.field_p = lc.field_c;
          td.field_P = el.field_e;
          vh.field_c = 0;
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeKeyListener(im.field_c);
          param0.removeFocusListener(im.field_c);
          if (param1 != 18014) {
            ae.c(-12);
          }
          qn.field_c = -1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ae.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static bi[] a(int param0, String param1, bc param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        bi[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(122, param1);
          var5 = param2.a(var4_int, (byte) 106, param3);
          var6 = -106 / ((-22 - param0) / 53);
          stackIn_1_0 = ch.a(var5, (byte) 87, param2, var4_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ae.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_d = "You are offering an unrated rematch.";
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = new int[256];
    }
}
