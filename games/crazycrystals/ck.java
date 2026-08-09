/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends ud {
    static ko field_cb;
    static String[] field_fb;
    static String field_eb;
    static am field_db;

    public static void l(int param0) {
        if (param0 < 14) {
          ck.l(-61);
          field_eb = null;
          field_fb = null;
          field_db = null;
          field_cb = null;
          return;
        } else {
          field_eb = null;
          field_fb = null;
          field_db = null;
          field_cb = null;
          return;
        }
    }

    final void a(qm param0, byte param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ck.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void n(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            var5 = to.field_b;
            var1 = var5;
            if (param0 == 48) {
              var2 = 0;
              var3 = var5.length;
              L1: while (true) {
                if (var2 >= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  incrementValue$16 = var2;
                  var2++;
                  var5[incrementValue$16] = 0;
                  incrementValue$17 = var2;
                  var2++;
                  var5[incrementValue$17] = 0;
                  incrementValue$18 = var2;
                  var2++;
                  var5[incrementValue$18] = 0;
                  incrementValue$19 = var2;
                  var2++;
                  var5[incrementValue$19] = 0;
                  incrementValue$20 = var2;
                  var2++;
                  var5[incrementValue$20] = 0;
                  incrementValue$21 = var2;
                  var2++;
                  var5[incrementValue$21] = 0;
                  incrementValue$22 = var2;
                  var2++;
                  var5[incrementValue$22] = 0;
                  incrementValue$23 = var2;
                  var2++;
                  var5[incrementValue$23] = 0;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1_ref), "ck.T(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void m(int param0) {
        kf.field_f = null;
        co.field_F = false;
        cl.field_o = param0;
        rf.field_G = -1;
        ni.field_b = -1;
    }

    final static long a(byte param0, CharSequence param1) {
        long stackIn_20_0 = 0L;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var4 <= var5) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (65 > var6) {
                        break L4;
                      } else {
                        if (90 >= var6) {
                          var2_long = var2_long + (long)(var6 + 1 + -65);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 97) {
                        break L5;
                      } else {
                        if (var6 > 122) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(1 - -var6 + -97);
                          break L3;
                        }
                      }
                    }
                    if (48 > var6) {
                      break L3;
                    } else {
                      if (var6 > 57) {
                        break L3;
                      } else {
                        var2_long = var2_long + (long)(27 + var6 - 48);
                        break L3;
                      }
                    }
                  }
                  if (177917621779460413L <= var2_long) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var6 = -71 % ((param0 - 52) / 38);
              L6: while (true) {
                L7: {
                  if ((var2_long % 37L ^ -1L) != -1L) {
                    break L7;
                  } else {
                    if (-1L == (var2_long ^ -1L)) {
                      break L7;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L6;
                    }
                  }
                }
                stackIn_20_0 = var2_long;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("ck.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    ck(ol param0, qm param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        field_eb = "Player";
        field_fb = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
