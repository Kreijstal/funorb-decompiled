/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends en {
    private String field_d;
    private String field_g;
    static cn field_f;
    private String field_e;

    final static hl a(int param0, boolean param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        hl stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        hl stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 46) {
                break L1;
              } else {
                field_f = (cn) null;
                break L1;
              }
            }
            L2: {
              var4_long = 0L;
              var6 = null;
              if ((param3.indexOf('@') ^ -1) == 0) {
                var7 = (CharSequence) ((Object) param3);
                var4_long = ci.a(var7, 2);
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            stackOut_5_0 = l.a(param2, false, var4_long, param1, (String) (var6));
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("qf.F(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_6_0 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_20_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if ((var2_int ^ -1) < -21) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            if (param1 == -1) {
              L2: while (true) {
                if (var4 >= var2_int) {
                  stackOut_20_0 = new String(var8);
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      var5 = param0.charAt(var4);
                      if (var5 < 65) {
                        break L4;
                      } else {
                        if (90 < var5) {
                          break L4;
                        } else {
                          var3[var4] = (char)(-65 + (var5 + 97));
                          break L3;
                        }
                      }
                    }
                    L5: {
                      L6: {
                        if (var5 < 97) {
                          break L6;
                        } else {
                          if (var5 <= 122) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var5 < 48) {
                          break L7;
                        } else {
                          if (var5 > 57) {
                            break L7;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3[var4] = (char)95;
                      break L3;
                    }
                    var3[var4] = (char)var5;
                    break L3;
                  }
                  var4++;
                  continue L2;
                }
              }
            } else {
              stackOut_5_0 = (String) null;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("qf.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_21_0;
        }
    }

    public static void b(int param0) {
        hl discarded$0 = null;
        if (param0 != -21) {
            String var2 = (String) null;
            discarded$0 = qf.a(94, true, (String) null, (String) null);
        }
        field_f = null;
    }

    final cn b(byte param0) {
        int var9 = 0;
        String var10 = null;
        int var11 = DungeonAssault.field_K;
        if (this.field_d == null) {
            return null;
        }
        jh.c();
        String[] var12 = jn.a(ck.field_H.a(this.field_d, (byte) -48), new int[]{200}, -63, db.field_v);
        String[] var2 = var12;
        int var3 = var12.length;
        int var4 = db.field_v.field_E + db.field_v.field_H * var3;
        int var5 = db.field_v.field_H;
        cn var6 = new cn(200, var4);
        int var7 = -48 / ((param0 - -58) / 35);
        var6.e();
        String[] var8 = var12;
        for (var9 = 0; var8.length > var9; var9++) {
            var10 = var8[var9];
            db.field_v.c(var10, 100, var5, 16777215, -1);
            var5 = var5 + db.field_v.field_H;
        }
        jh.b();
        return var6;
    }

    qf(String param0, String param1, String param2) {
        try {
            this.field_g = param1;
            this.field_d = param2;
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final cn a(byte param0, int param1) {
        int var9 = 0;
        String var10 = null;
        int var11 = DungeonAssault.field_K;
        jh.c();
        String[] var12 = jn.a(ck.field_H.a(this.field_g, (byte) -48), new int[]{param1}, -83, la.field_b);
        String[] var3 = var12;
        int var4 = var12.length;
        int var5 = var4 * la.field_b.field_H + la.field_b.field_E;
        int var6 = la.field_b.field_H;
        if (this.field_e != null) {
            var5 = var5 + 2 * la.field_b.field_H;
        }
        cn var7 = new cn(param1, var5);
        if (param0 <= 22) {
            return (cn) null;
        }
        var7.e();
        if (!(null == this.field_e)) {
            db.field_v.c(ck.field_H.a(this.field_e, (byte) -48), param1 >> -940601919, var6, 16777215, -1);
            var6 = var6 + la.field_b.field_H * 2;
        }
        String[] var8 = var12;
        for (var9 = 0; var8.length > var9; var9++) {
            var10 = var8[var9];
            la.field_b.c(var10, param1 >> -133130303, var6, 16777215, -1);
            var6 = var6 + la.field_b.field_H;
        }
        jh.b();
        return var7;
    }

    qf(String param0, String param1) {
        this(param0, param1, param0);
    }

    final void a(int param0, sa param1) {
        cn discarded$0 = null;
        cn var3 = null;
        try {
            if (param0 != 0) {
                discarded$0 = this.a((byte) -60, 34);
            }
            var3 = this.a((byte) 32, -40 + param1.field_b);
            param1.a(var3, var3.field_v + 8, false, 112, -la.field_b.field_H + param1.field_y >> 1009028737);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "qf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
