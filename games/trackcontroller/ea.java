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
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        char dupTemp$12 = 0;
        StringBuilder discarded$13 = null;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var25 = null;
        var26 = null;
        try {
          L0: {
            L1: {
              this.field_x = param0;
              var3_int = 16;
              var4 = 16;
              var5 = 0;
              if (param1.charAt(var5) != 42) {
                break L1;
              } else {
                var5++;
                incrementValue$9 = var5;
                var5++;
                var3_int = fj.b(-48, (int) param1.charAt(incrementValue$9));
                incrementValue$10 = var5;
                var5++;
                var4 = fj.b(-48, (int) param1.charAt(incrementValue$10));
                break L1;
              }
            }
            var22 = new byte[var3_int][var4];
            var23 = new int[var3_int][var4];
            var8 = 0;
            L2: while (true) {
              if (var8 >= var3_int) {
                var24 = new int[8][6];
                var9_int = 0;
                L3: while (true) {
                  if ((var9_int ^ -1) <= -9) {
                    this.a(var23, (byte) 50, var24, var22);
                    var9 = new StringBuilder(12);
                    L4: while (true) {
                      incrementValue$11 = var5;
                      var5++;
                      dupTemp$12 = param1.charAt(incrementValue$11);
                      var10 = dupTemp$12;
                      if (dupTemp$12 == 32) {
                        this.field_q = var9.toString();
                        var11 = param1.substring(var5);
                        var5 = var11.indexOf('/');
                        var27 = (CharSequence) ((Object) var11.substring(0, var5));
                        this.field_r = uk.a(var27, 10);
                        var28 = (CharSequence) ((Object) var11.substring(1 + var5));
                        this.field_v = uk.a(var28, 10);
                        break L0;
                      } else {
                        discarded$13 = var9.append((char) var10);
                        continue L4;
                      }
                    }
                  } else {
                    var10 = 0;
                    L5: while (true) {
                      if (6 <= var10) {
                        var9_int++;
                        continue L3;
                      } else {
                        incrementValue$14 = var5;
                        var5++;
                        var24[var9_int][var10] = fh.a(0, (int) param1.charAt(incrementValue$14));
                        var10++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var9_int = 0;
                L6: while (true) {
                  if (var4 <= var9_int) {
                    var8++;
                    continue L2;
                  } else {
                    L7: {
                      incrementValue$15 = var5;
                      var5++;
                      var10 = fj.b(-48, (int) param1.charAt(incrementValue$15));
                      var22[var8][var9_int] = (byte)(var10 >> -161321277);
                      incrementValue$16 = var5;
                      var5++;
                      var23[var8][var9_int] = fh.a(0, (int) param1.charAt(incrementValue$16));
                      if (var4 <= 1 + var9_int) {
                        break L7;
                      } else {
                        var22[var8][var9_int - -1] = (byte)tc.a(7, var10);
                        incrementValue$17 = var5;
                        var5++;
                        var23[var8][var9_int - -1] = fh.a(0, (int) param1.charAt(incrementValue$17));
                        break L7;
                      }
                    }
                    var9_int += 2;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("ea.<init>(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_p = (String) null;
                break L1;
              }
            }
            ig.a();
            wi.field_b = 11;
            ec.field_d = new int[260];
            var1_int = 0;
            L2: while (true) {
              if (256 <= var1_int) {
                var5 = 256;
                var1_int = var5;
                L3: while (true) {
                  if (var5 >= ec.field_d.length) {
                    break L0;
                  } else {
                    ec.field_d[var5] = 255;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var2 = 15.0;
                ec.field_d[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "ea.O(" + param0 + ')');
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
            for (var3 = 0; (var3 ^ -1) > -17; var3++) {
                if (-39 == (this.field_d[var2][var3] ^ -1)) {
                    return var3;
                }
            }
        }
        throw new IllegalStateException();
    }

    final int a(int param0) {
        int discarded$0 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        if (param0 != -8299) {
            discarded$0 = ea.b(true, 12);
        }
        for (var2 = 0; 16 > var2; var2++) {
            for (var3 = 0; -17 < (var3 ^ -1); var3++) {
                if (!(38 != this.field_d[var2][var3])) {
                    return var2;
                }
            }
        }
        throw new IllegalStateException();
    }

    final static int b(boolean param0, int param1) {
        int var2 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ea.d((byte) 81);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = 0;
            if (0 > param1) {
              break L2;
            } else {
              if (-65537 < (param1 ^ -1)) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          param1 = param1 >>> 16;
          var2 += 16;
          break L1;
        }
        L3: {
          if (-257 < (param1 ^ -1)) {
            break L3;
          } else {
            param1 = param1 >>> 8;
            var2 += 8;
            break L3;
          }
        }
        L4: {
          if (16 > param1) {
            break L4;
          } else {
            var2 += 4;
            param1 = param1 >>> 4;
            break L4;
          }
        }
        L5: {
          if (-5 < (param1 ^ -1)) {
            break L5;
          } else {
            var2 += 2;
            param1 = param1 >>> 2;
            break L5;
          }
        }
        L6: {
          if (1 > param1) {
            break L6;
          } else {
            var2++;
            param1 = param1 >>> 1;
            break L6;
          }
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
        field_u = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_w = new int[8192];
        field_y = "To server list";
        field_t = new ja();
        field_s = new ja();
        field_p = "Back";
    }
}
