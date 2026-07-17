/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    int field_b;
    static ad field_e;
    int field_f;
    static volatile boolean field_a;
    int field_d;
    static String field_c;

    final static boolean a() {
        return ed.c(true) || pb.field_G <= 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        ((ve) this).field_d = param1;
        ((ve) this).field_f = param3;
        ((ve) this).field_b = param0;
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if (param0) {
          L0: while (true) {
            if (((Math.abs(((ve) this).field_d) | Math.abs(((ve) this).field_f) | Math.abs(((ve) this).field_b)) & -65536) == 0) {
              int discarded$2 = 0;
              var2 = this.c() >> 1;
              var3 = 15;
              L1: while (true) {
                if (65536 > var2) {
                  ((ve) this).field_d = (((ve) this).field_d << var3) / var2;
                  ((ve) this).field_f = (((ve) this).field_f << var3) / var2;
                  ((ve) this).field_b = (((ve) this).field_b << var3) / var2;
                  int discarded$3 = 0;
                  var4 = this.c();
                  if (var4 >= 64512) {
                    if (66560 < var4) {
                      throw new RuntimeException();
                    } else {
                      return;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  var3--;
                  var2 = var2 >> 1;
                  continue L1;
                }
              }
            } else {
              ((ve) this).field_f = ((ve) this).field_f >> 1;
              ((ve) this).field_d = ((ve) this).field_d >> 1;
              ((ve) this).field_b = ((ve) this).field_b >> 1;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 >= -92) {
            ve.a(42);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static String a(int param0, long param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = DungeonAssault.field_K;
          var6 = 44;
          var7 = 46;
          if (param3 == 0) {
            var7 = 44;
            var6 = 46;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param3 != 2) {
            break L1;
          } else {
            var7 = 160;
            break L1;
          }
        }
        L2: {
          var8 = 0;
          if (param1 < 0L) {
            param1 = -param1;
            var8 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        var9 = new StringBuilder(26);
        var10 = 0;
        L3: while (true) {
          if (var10 >= 1) {
            StringBuilder discarded$57 = var9.append(var6);
            var10 = 0;
            L4: while (true) {
              var11 = (int)param1;
              param1 = param1 / 10L;
              StringBuilder discarded$58 = var9.append((char)(48 - (-var11 - -(10 * (int)param1))));
              if (param1 != 0L) {
                var10++;
                if (0 != var10 % 3) {
                  continue L4;
                } else {
                  StringBuilder discarded$59 = var9.append(var7);
                  continue L4;
                }
              } else {
                L5: {
                  if (var8 != 0) {
                    StringBuilder discarded$60 = var9.append(45);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return var9.reverse().toString();
              }
            }
          } else {
            var11 = (int)param1;
            param1 = param1 / 10L;
            StringBuilder discarded$61 = var9.append((char)(-(10 * (int)param1) + (var11 + 48)));
            var10++;
            continue L3;
          }
        }
    }

    private final int c() {
        int var2 = 0;
        var2 = (((ve) this).field_b >> 2) * (((ve) this).field_b >> 2) + (((ve) this).field_f >> 2) * (((ve) this).field_f >> 2) + (((ve) this).field_d >> 2) * (((ve) this).field_d >> 2);
        if (var2 < 0) {
          throw new RuntimeException();
        } else {
          return ug.a(true, var2) << 2;
        }
    }

    ve(int param0, int param1, int param2) {
        this.a(param2, param0, 124, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ad(11, 0, 1, 2);
        field_a = false;
        field_c = "Please log in as a subscribing member to access this feature.";
    }
}
