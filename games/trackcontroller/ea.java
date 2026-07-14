/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends sl {
    static String[] field_u;
    int field_r;
    String field_q;
    static ja field_t;
    static String field_y;
    int field_x;
    static int[] field_w;
    int field_v;
    static ja field_s;
    static String field_p;

    ea(int param0, String param1) {
        super(true, 0, 0);
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        String var11 = null;
        byte[][] var22 = null;
        int[][] var23 = null;
        int[][] var24 = null;
        Object var25 = null;
        Object var26 = null;
        CharSequence var27 = null;
        CharSequence var28 = null;
        L0: {
          var25 = null;
          var26 = null;
          ((ea) this).field_x = param0;
          var3 = 16;
          var4 = 16;
          var5 = 0;
          if (param1.charAt(var5) != 42) {
            break L0;
          } else {
            var5++;
            var5++;
            var3 = fj.b(-48, (int) param1.charAt(var5));
            var5++;
            var4 = fj.b(-48, (int) param1.charAt(var5));
            break L0;
          }
        }
        var22 = new byte[var3][var4];
        var23 = new int[var3][var4];
        var8 = 0;
        L1: while (true) {
          if (var8 >= var3) {
            var24 = new int[8][6];
            var9_int = 0;
            L2: while (true) {
              if ((var9_int ^ -1) <= -9) {
                ((ea) this).a(var23, (byte) 50, var24, var22);
                var9 = new StringBuilder(12);
                L3: while (true) {
                  var5++;
                  var10 = param1.charAt(var5);
                  if (param1.charAt(var5) == 32) {
                    ((ea) this).field_q = var9.toString();
                    var11 = param1.substring(var5);
                    var5 = var11.indexOf('/');
                    var27 = (CharSequence) (Object) var11.substring(0, var5);
                    ((ea) this).field_r = uk.a(var27, 10);
                    var28 = (CharSequence) (Object) var11.substring(1 + var5);
                    ((ea) this).field_v = uk.a(var28, 10);
                  } else {
                    StringBuilder discarded$1 = var9.append(var10);
                    continue L3;
                  }
                }
              } else {
                var10 = 0;
                L4: while (true) {
                  if (6 <= var10) {
                    var9_int++;
                    continue L2;
                  } else {
                    var5++;
                    var24[var9_int][var10] = fh.a(0, (int) param1.charAt(var5));
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var9_int = 0;
            L5: while (true) {
              if (var4 <= var9_int) {
                var8++;
                continue L1;
              } else {
                var5++;
                var10 = fj.b(-48, (int) param1.charAt(var5));
                var22[var8][var9_int] = (byte)(var10 >> -161321277);
                var5++;
                var23[var8][var9_int] = fh.a(0, (int) param1.charAt(var5));
                if (var4 > 1 + var9_int) {
                  var22[var8][var9_int - -1] = (byte)tc.a(7, var10);
                  var5++;
                  var23[var8][var9_int - -1] = fh.a(0, (int) param1.charAt(var5));
                  var9_int += 2;
                  continue L5;
                } else {
                  var9_int += 2;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = TrackController.field_F ? 1 : 0;
        if (param0) {
            field_p = null;
        }
        ig.a();
        wi.field_b = 11;
        ec.field_d = new int[260];
        for (var1 = 0; 256 > var1; var1++) {
            var2 = 15.0;
            ec.field_d[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
        }
        int var5 = 256;
        var1 = var5;
        while (var5 < ec.field_d.length) {
            ec.field_d[var5] = 255;
            var5++;
        }
    }

    final int c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        if (param0 <= 86) {
            return 116;
        }
        for (var2 = 0; 16 > var2; var2++) {
            for (var3 = 0; var3 > -17; var3++) {
                if (-39 == ((ea) this).field_d[var2][var3]) {
                    return var3;
                }
            }
        }
        throw new IllegalStateException();
    }

    final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        if (param0 != -8299) {
            int discarded$0 = ea.b(true, 12);
        }
        for (var2 = 0; 16 > var2; var2++) {
            for (var3 = 0; -17 < (var3 ^ -1); var3++) {
                if (!(38 != ((ea) this).field_d[var2][var3])) {
                    return var2;
                }
            }
        }
        throw new IllegalStateException();
    }

    final static int b(boolean param0, int param1) {
        if (param0) {
            ea.d((byte) 81);
        }
        int var2 = 0;
        if (0 <= param1) {
            // if_icmplt L36
        }
        param1 = param1 >>> 16;
        var2 += 16;
        if (-257 <= param1) {
            param1 = param1 >>> 8;
            var2 += 8;
        }
        if (16 <= param1) {
            var2 += 4;
            param1 = param1 >>> 4;
        }
        if (-5 >= (param1 ^ -1)) {
            var2 += 2;
            param1 = param1 >>> 2;
        }
        if (1 <= param1) {
            var2++;
            param1 = param1 >>> 1;
        }
        return param1 + var2;
    }

    public static void d(byte param0) {
        field_y = null;
        field_w = null;
        field_t = null;
        field_p = null;
        if (param0 != 96) {
            return;
        }
        field_s = null;
        field_u = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_w = new int[8192];
        field_y = "To server list";
        field_t = new ja();
        field_s = new ja();
        field_p = "Back";
    }
}
