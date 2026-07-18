/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nd extends qf {
    static hl[] field_j;
    static String field_l;
    static ue field_p;
    static int field_k;
    private String field_n;
    static int field_m;
    private boolean field_o;

    public static void g() {
        field_l = null;
        field_p = null;
        field_j = null;
    }

    nd(fe param0) {
        super(param0);
        ((nd) this).field_o = false;
    }

    final p a(String param0, int param1) {
        ig var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        p stackIn_2_0 = null;
        p stackIn_11_0 = null;
        p stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        p stackOut_10_0 = null;
        p stackOut_15_0 = null;
        p stackOut_14_0 = null;
        p stackOut_1_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param0;
            if (jj.a(200, var4)) {
              L1: {
                if (param1 == -26188) {
                  break L1;
                } else {
                  ((nd) this).field_n = null;
                  break L1;
                }
              }
              L2: {
                if (!param0.equals((Object) (Object) ((nd) this).field_n)) {
                  L3: {
                    var3 = tg.a(param1 + 26118, param0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null != var3.field_d) {
                        break L3;
                      } else {
                        ((nd) this).field_o = var3.field_f;
                        ((nd) this).field_n = param0;
                        break L2;
                      }
                    }
                  }
                  stackOut_10_0 = cd.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (((nd) this).field_o) {
                  stackOut_15_0 = bf.field_x;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = sb.field_n;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = sb.field_n;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("nd.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        ud var10 = null;
        ud var11 = null;
        byte[] var15 = null;
        L0: {
          var10 = gf.field_c[param3];
          var11 = var10;
          var5 = var11.field_j * param0 / 1000;
          var6 = var11.field_j * param2 / 1000;
          if (var11.field_i.length < var5 + var6) {
            var6 = var11.field_i.length - var5;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var15 = new byte[var6];
          ug.a(var11.field_i, var5, var15, 0, var6);
          var8 = -var5 + var11.field_h;
          if (var8 < 0) {
            var8 = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var8 > var6) {
            var8 = var6;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var9 = var11.field_g + -var5;
          if (var9 >= 0) {
            break L3;
          } else {
            var9 = 0;
            break L3;
          }
        }
        L4: {
          if (var9 <= var6) {
            break L4;
          } else {
            var9 = var6;
            break L4;
          }
        }
        if (param1 != -3763) {
          int discarded$2 = nd.a(false, -9, -79);
          gf.field_c[param3] = new ud(var11.field_j, var15, var8, var9, var10.field_k);
          return;
        } else {
          gf.field_c[param3] = new ud(var11.field_j, var15, var8, var9, var10.field_k);
          return;
        }
    }

    final void f(int param0) {
        if (param0 != -18507) {
            field_p = null;
            ((nd) this).field_n = null;
            return;
        }
        ((nd) this).field_n = null;
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        ig var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        String stackIn_5_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var5 = null;
                String discarded$2 = ((nd) this).a((String) null, false);
                break L1;
              }
            }
            var6 = (CharSequence) (Object) param0;
            var3 = lj.a((byte) -5, var6);
            if (var3 != null) {
              stackOut_4_0 = (String) var3;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L2: {
                if (param0.equals((Object) (Object) ((nd) this).field_n)) {
                  break L2;
                } else {
                  var4 = tg.a(-58, param0);
                  if (var4 != null) {
                    if (null == var4.field_d) {
                      ((nd) this).field_n = param0;
                      ((nd) this).field_o = var4.field_f;
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (((nd) this).field_o) {
                stackOut_16_0 = ll.field_a;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = cf.field_s;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("nd.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final static boolean b(boolean param0) {
        hd.field_p = true;
        wa.field_a = 15000L + dd.b(109);
        return bl.field_a == 11 ? true : false;
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var4 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (0 >= param2) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | param1 & 1;
                param1 = param1 >>> 1;
                param2--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "nd.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final static void b() {
        rf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        of var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = StarCannon.field_A;
        try {
          L0: {
            var4 = (of) (Object) fi.field_c.c(-3905);
            L1: while (true) {
              if (var4 == null) {
                var2 = ab.field_H.c(-3905);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    sc.a(32395, 6);
                    var2 = ab.field_H.a(-16913);
                    continue L2;
                  }
                }
              } else {
                bb.a(2, 6, var4);
                var4 = (of) (Object) fi.field_c.a(-16913);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2_ref, "nd.N(" + 6 + ',' + -66 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
