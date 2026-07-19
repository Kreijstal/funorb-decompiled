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
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  incrementValue$40 = var2;
                  var2++;
                  var5[incrementValue$40] = 0;
                  incrementValue$41 = var2;
                  var2++;
                  var5[incrementValue$41] = 0;
                  incrementValue$42 = var2;
                  var2++;
                  var5[incrementValue$42] = 0;
                  incrementValue$43 = var2;
                  var2++;
                  var5[incrementValue$43] = 0;
                  incrementValue$44 = var2;
                  var2++;
                  var5[incrementValue$44] = 0;
                  incrementValue$45 = var2;
                  var2++;
                  var5[incrementValue$45] = 0;
                  incrementValue$46 = var2;
                  var2++;
                  var5[incrementValue$46] = 0;
                  incrementValue$47 = var2;
                  var2++;
                  var5[incrementValue$47] = 0;
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
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_20_0 = 0L;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_19_0 = 0L;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                stackOut_19_0 = var2_long;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("ck.W(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
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
