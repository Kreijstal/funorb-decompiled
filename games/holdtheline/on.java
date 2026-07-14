/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends ln {
    int[] field_o;
    static hj field_t;
    static boolean field_s;
    static int[][] field_v;
    private int[][] field_q;
    private String[] field_u;
    static String field_p;
    static int field_r;
    private int[] field_w;

    final void g(int param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        if (param0 > -54) {
            ((on) this).g(85);
        }
        if (((on) this).field_o != null) {
            for (var2 = 0; var2 < ((on) this).field_o.length; var2++) {
                ((on) this).field_o[var2] = kc.a(((on) this).field_o[var2], 32768);
            }
        }
    }

    final void a(int param0, th param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param0 >= 90) {
            break L0;
          } else {
            field_r = -69;
            break L0;
          }
        }
        L1: while (true) {
          var3 = param1.f((byte) -70);
          if (-1 != (var3 ^ -1)) {
            this.a(109, param1, var3);
            continue L1;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, th param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        e var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = HoldTheLine.field_D;
          if (param0 >= 93) {
            break L0;
          } else {
            var10 = null;
            this.a(53, (th) null, -28);
            break L0;
          }
        }
        L1: {
          if (-2 == (param2 ^ -1)) {
            ((on) this).field_u = fl.a(param1.j(-1231), (byte) -29, '<');
            break L1;
          } else {
            if ((param2 ^ -1) != -3) {
              if ((param2 ^ -1) == -4) {
                var4 = param1.f((byte) -95);
                ((on) this).field_w = new int[var4];
                ((on) this).field_q = new int[var4][];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    var6 = param1.k(120);
                    var7 = ln.a(var6, (byte) -96);
                    if (var7 != null) {
                      ((on) this).field_w[var5] = var6;
                      ((on) this).field_q[var5] = new int[var7.field_c];
                      var8 = 0;
                      L3: while (true) {
                        if (var8 < var7.field_c) {
                          ((on) this).field_q[var5][var8] = param1.k(98);
                          var8++;
                          continue L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (param2 == 4) {
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              var4 = param1.f((byte) -111);
              ((on) this).field_o = new int[var4];
              var5 = 0;
              L4: while (true) {
                if (var5 >= var4) {
                  break L1;
                } else {
                  ((on) this).field_o[var5] = param1.k(72);
                  var5++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        field_p = null;
        field_t = null;
        if (param0 < 103) {
            field_v = null;
        }
        field_v = null;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 56 % ((param2 - -43) / 41);
        int var4 = param1 >> -348811856;
        int var5 = 65535 & param1;
        int var6 = param0 >> 245197136;
        int var7 = 65535 & param0;
        return (var7 * var5 >> -299646448) + (param0 * var4 - -(var6 * var5));
    }

    on() {
    }

    final String f(int param0) {
        int var4 = HoldTheLine.field_D;
        StringBuilder var6 = new StringBuilder(80);
        var6 = var6;
        if (null == ((on) this).field_u) {
            return "";
        }
        StringBuilder discarded$0 = var6.append(((on) this).field_u[0]);
        int var3 = 1;
        if (param0 != 245197136) {
            ((on) this).field_w = null;
        }
        while (((on) this).field_u.length > var3) {
            StringBuilder discarded$1 = var6.append("...");
            StringBuilder discarded$2 = var6.append(((on) this).field_u[var3]);
            var3++;
        }
        return var6.toString();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "<col=2>--</col>";
    }
}
