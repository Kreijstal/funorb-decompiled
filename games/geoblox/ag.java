/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends q {
    private static long[] field_m;
    static int field_l;
    static boolean[] field_j;
    static int field_k;
    static int field_i;

    final String b(int param0, String param1) {
        if (param0 == 422) {
          if (((ag) this).a(-257, param1) == si.field_m) {
            return wj.field_B;
          } else {
            return da.field_e;
          }
        } else {
          field_l = -21;
          if (((ag) this).a(-257, param1) == si.field_m) {
            return wj.field_B;
          } else {
            return da.field_e;
          }
        }
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        if (!param0.equals((Object) (Object) "B")) {
          if (param0.equals((Object) (Object) "I")) {
            return Integer.TYPE;
          } else {
            if (!param0.equals((Object) (Object) "S")) {
              if (!param0.equals((Object) (Object) "J")) {
                if (!param0.equals((Object) (Object) "Z")) {
                  if (param0.equals((Object) (Object) "F")) {
                    return Float.TYPE;
                  } else {
                    if (param0.equals((Object) (Object) "D")) {
                      return Double.TYPE;
                    } else {
                      if (param0.equals((Object) (Object) "C")) {
                        return Character.TYPE;
                      } else {
                        if (param1) {
                          ag.g(26);
                          return Class.forName(param0);
                        } else {
                          return Class.forName(param0);
                        }
                      }
                    }
                  }
                } else {
                  return Boolean.TYPE;
                }
              } else {
                return Long.TYPE;
              }
            } else {
              return Short.TYPE;
            }
          }
        } else {
          return Byte.TYPE;
        }
    }

    final static String a(int param0, byte[] param1) {
        if (param0 != 1) {
          field_j = null;
          return bc.a(-8, param1, 0, param1.length);
        } else {
          return bc.a(-8, param1, 0, param1.length);
        }
    }

    final lh a(int param0, String param1) {
        int var3 = 0;
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (null != ca.a(param1, 1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (var3 != 0) {
          if (param0 != -257) {
            var4 = null;
            String discarded$2 = ((ag) this).b(97, (String) null);
            return kk.field_w;
          } else {
            return kk.field_w;
          }
        } else {
          return si.field_m;
        }
    }

    final static void a(int param0, byte param1) {
        je var2 = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        j.field_gb = param0;
        var2 = (je) (Object) qa.field_f.g(0);
        if (param1 == -67) {
          L0: while (true) {
            if (var2 != null) {
              L1: {
                if (!var2.field_f.a(126)) {
                  var2.a(false);
                  break L1;
                } else {
                  var2.field_g.f((int)((float)(j.field_gb * var2.field_i / 80) * 1.399999976158142f));
                  break L1;
                }
              }
              var2 = (je) (Object) qa.field_f.d(1);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void g(int param0) {
        field_j = null;
        if (param0 > -13) {
            Object var2 = null;
            String discarded$0 = ag.a(95, (byte[]) null);
            field_m = null;
            return;
        }
        field_m = null;
    }

    ag(dj param0) {
        super(param0);
    }

    final static void c(int param0, String param1) {
        rd.a(-119, param1);
        if (param0 != 12607) {
            field_l = 32;
            fa.a(rj.field_g, 480, false);
            return;
        }
        fa.a(rj.field_g, 480, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_m = new long[256];
        var2 = 0;
        L0: while (true) {
          if (-257 >= var2) {
            field_j = new boolean[7];
            field_i = 0;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (-9 <= var3) {
                field_m[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (1L != (1L & var0)) {
                  var0 = var0 >>> 1;
                  var3++;
                  var3++;
                  continue L1;
                } else {
                  var0 = -3932672073523589310L ^ var0 >>> 1169355905;
                  var3++;
                  var3++;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
