/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh implements dh {
    private int field_a;
    private int field_b;
    private m field_d;
    static int field_c;
    static dm[] field_e;

    final static void b() {
        cf.field_i = false;
        va.field_d = false;
        pc.a(-1, false);
        si.field_g = uf.field_l;
        kd.field_b = uf.field_l;
    }

    public static void a(int param0) {
        if (param0 != 1) {
            fh.a(51);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static boolean c(int param0) {
        if (param0 > -78) {
            return false;
        }
        return hl.field_G;
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        int var7 = 0;
        long var7_long = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Geoblox.field_C;
        if (param0 > 0L) {
          if (param0 < 6582952005840035281L) {
            if (0L == param0 % 37L) {
              return null;
            } else {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (param0 == 0L) {
                      StringBuilder discarded$2 = var6.reverse();
                      var7 = 49 % ((27 - param1) / 36);
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7_long = param0;
                        param0 = param0 / 37L;
                        var9 = w.field_c[(int)(-(37L * param0) + var7_long)];
                        if (95 != var9) {
                          break L2;
                        } else {
                          var10 = -1 + var6.length();
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append((char) var9);
                      continue L1;
                    }
                  }
                } else {
                  var4 = var4 / 37L;
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              L2: {
                if (param4.field_l) {
                  break L2;
                } else {
                  if (param4.e((byte) 54)) {
                    break L2;
                  } else {
                    stackOut_3_0 = 2188450;
                    stackIn_5_0 = stackOut_3_0;
                    break L1;
                  }
                }
              }
              stackOut_4_0 = 3249872;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            L3: {
              var6_int = stackIn_5_0;
              int discarded$2 = ((fh) this).field_d.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_s + "</u>", param4.field_v + param0, param2 - -param4.field_m, param4.field_r, param4.field_h, var6_int, -1, ((fh) this).field_b, ((fh) this).field_a, ((fh) this).field_d.field_o - -((fh) this).field_d.field_q);
              if (param1 <= -5) {
                break L3;
              } else {
                String discarded$3 = fh.a(53L, -116);
                break L3;
              }
            }
            if (param4.e((byte) 54)) {
              L4: {
                var7 = ((fh) this).field_d.a(param4.field_s);
                var8 = ((fh) this).field_d.field_q + ((fh) this).field_d.field_o;
                var9 = param4.field_v + param0;
                if (((fh) this).field_b == 2) {
                  var9 = var9 + (-var7 + param4.field_r);
                  break L4;
                } else {
                  if (((fh) this).field_b != 1) {
                    break L4;
                  } else {
                    var9 = var9 + (-var7 + param4.field_r >> 1);
                    break L4;
                  }
                }
              }
              L5: {
                var10 = param2 - -param4.field_m;
                if (((fh) this).field_a == 2) {
                  var10 = var10 + (param4.field_h - var8);
                  break L5;
                } else {
                  if (((fh) this).field_a == 1) {
                    var10 = var10 + (param4.field_h - var8 >> 1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              bf.a(var10 - -2, 4 + var7, 14164, var8, -2 + var9);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("fh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    public fh() {
        ((fh) this).field_a = 1;
        ((fh) this).field_b = 1;
        ((fh) this).field_d = ng.field_F;
    }

    fh(m param0, int param1, int param2) {
        try {
            ((fh) this).field_a = param2;
            ((fh) this).field_b = param1;
            ((fh) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "fh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
