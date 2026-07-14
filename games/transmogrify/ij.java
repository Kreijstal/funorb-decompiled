/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij implements ui {
    private int field_e;
    private int field_b;
    private int field_c;
    private int field_g;
    static wk field_d;
    static int field_a;
    private int field_j;
    static ti field_h;
    private kg field_i;
    private int field_f;

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        fk var13 = null;
        qg stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        qg stackOut_1_0 = null;
        L0: {
          var12 = Transmogrify.field_A ? 1 : 0;
          if (!(param4 instanceof fk)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (qg) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (qg) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var13 = (fk) (Object) stackIn_3_0;
          sb.a(param4.field_p + param0, param1 - -param4.field_n, param4.field_l, param4.field_h, ((ij) this).field_c);
          if (var13 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        var7 = param4.field_l + -(2 * var13.field_B);
        var8 = var13.field_B + param4.field_p + param0;
        var9 = var13.field_G + (param4.field_n + param1);
        sb.e(var8, var9, var7 + var8, var9, ((ij) this).field_j);
        var10 = -1 + var13.h(-1);
        L2: while (true) {
          if (0 > var10) {
            L3: {
              var11 = -49 % ((51 - param3) / 47);
              if (((ij) this).field_i == null) {
                break L3;
              } else {
                ((ij) this).field_i.c(var13.field_k, var8 + var7 / 2, var9 - (-((ij) this).field_i.field_C - var13.field_G), ((ij) this).field_g, ((ij) this).field_b);
                break L3;
              }
            }
            return;
          } else {
            sb.c(var7 * var13.b((byte) 117, var10) / var13.i(-24733) + var8, var9, ((ij) this).field_e, ((ij) this).field_f);
            var10--;
            continue L2;
          }
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = Transmogrify.field_A ? 1 : 0;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if (0 <= var6_int) {
            var5 = 2 + var6_int;
            L1: while (true) {
              L2: {
                if (var3 <= var5) {
                  break L2;
                } else {
                  if (!dj.a(param0.charAt(var5), true)) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref = param0.substring(var6_int - -2, var5);
              if (qj.a((CharSequence) (Object) var7_ref, 38)) {
                if (var3 <= var5) {
                  continue L0;
                } else {
                  if (param0.charAt(var5) == 62) {
                    var5++;
                    var8 = aa.a(55, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (-var5 - -var6_int + param1[var8].length());
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          } else {
            if (param2 < -25) {
              var6 = new StringBuilder(var4);
              var5 = 0;
              var7 = 0;
              L3: while (true) {
                var8 = param0.indexOf("<%", var5);
                if (-1 >= (var8 ^ -1)) {
                  var5 = 2 + var8;
                  L4: while (true) {
                    L5: {
                      if (var5 >= var3) {
                        break L5;
                      } else {
                        if (!dj.a(param0.charAt(var5), true)) {
                          break L5;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                    var9 = param0.substring(2 + var8, var5);
                    if (qj.a((CharSequence) (Object) var9, 49)) {
                      if (var5 >= var3) {
                        continue L3;
                      } else {
                        if (param0.charAt(var5) != 62) {
                          continue L3;
                        } else {
                          var5++;
                          var10 = aa.a(66, (CharSequence) (Object) var9);
                          StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                          StringBuilder discarded$4 = var6.append(param1[var10]);
                          var7 = var5;
                          continue L3;
                        }
                      }
                    } else {
                      continue L3;
                    }
                  }
                } else {
                  StringBuilder discarded$5 = var6.append(param0.substring(var7));
                  return var6.toString();
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    ij(kg param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((ij) this).field_c = param4;
        ((ij) this).field_i = param0;
        ((ij) this).field_b = param2;
        ((ij) this).field_f = param6;
        ((ij) this).field_e = param5;
        ((ij) this).field_g = param1;
        ((ij) this).field_j = param3;
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 2) {
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new wk();
    }
}
