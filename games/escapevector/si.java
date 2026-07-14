/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends fl {
    static String field_w;
    static int[] field_v;
    private int[][] field_q;
    static String field_y;
    static cn field_u;
    static int field_r;
    int[] field_z;
    private int[] field_x;
    private String[] field_s;
    static hh field_t;

    private final void a(int param0, n param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        om var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = EscapeVector.field_A;
        if (param0 == 10691) {
          L0: {
            if (param2 == 1) {
              ((si) this).field_s = bb.a(-128, param1.c(false), '<');
              break L0;
            } else {
              if ((param2 ^ -1) != -3) {
                if (-4 == (param2 ^ -1)) {
                  var4 = param1.e(0);
                  ((si) this).field_q = new int[var4][];
                  ((si) this).field_x = new int[var4];
                  var5 = 0;
                  L1: while (true) {
                    if (var4 <= var5) {
                      break L0;
                    } else {
                      var6 = param1.f(1952);
                      var7 = kf.a((byte) -57, var6);
                      if (var7 != null) {
                        ((si) this).field_x[var5] = var6;
                        ((si) this).field_q[var5] = new int[var7.field_d];
                        var8 = 0;
                        L2: while (true) {
                          if (var7.field_d > var8) {
                            ((si) this).field_q[var5][var8] = param1.f(n.a(param0, 11875));
                            var8++;
                            continue L2;
                          } else {
                            var5++;
                            continue L1;
                          }
                        }
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  if (param2 != 4) {
                    break L0;
                  } else {
                    break L0;
                  }
                }
              } else {
                var4 = param1.e(param0 ^ 10691);
                ((si) this).field_z = new int[var4];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    ((si) this).field_z[var5] = param1.f(1952);
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(n param0, int param1) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        if (param1 != 0) {
            ((si) this).d((byte) -118);
        }
        while (true) {
            var3 = param0.e(0);
            if (var3 == 0) {
                break;
            }
            this.a(10691, param0, var3);
        }
    }

    final void d(byte param0) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        int var2 = 46 / ((-16 - param0) / 44);
        if (((si) this).field_z != null) {
            for (var3 = 0; var3 < ((si) this).field_z.length; var3++) {
                ((si) this).field_z[var3] = lb.a(((si) this).field_z[var3], 32768);
            }
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_w = null;
        if (param0 < 74) {
            si.f(-4);
        }
        field_v = null;
        field_y = null;
        field_u = null;
    }

    final static void a(float param0, String param1, boolean param2, byte param3) {
        if (param3 != 14) {
            field_t = null;
        }
        if (!(null != jb.field_r)) {
            jb.field_r = new w(bo.field_F, dj.field_b);
            bo.field_F.b((hm) (Object) jb.field_r, param3 + 102);
        }
        jb.field_r.a(-100, param1, param0, param2);
        em.d();
        se.a(true, param3 ^ 17111);
    }

    final static void a(int param0, java.applet.Applet param1) {
        CharSequence var4 = null;
        int var2 = 100 % ((param0 - -19) / 57);
        String var3 = param1.getParameter("username");
        if (var3 != null) {
            var4 = (CharSequence) (Object) var3;
            if (!(vn.a((byte) 91, var4) != 0L)) {
                return;
            }
            return;
        }
    }

    final String g(int param0) {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((si) this).field_s == null) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((si) this).field_s[0]);
        for (var3 = 1; var3 < ((si) this).field_s.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((si) this).field_s[var3]);
        }
        if (param0 != -4) {
            si.f(100);
        }
        return var2.toString();
    }

    final static void a(int param0, dk param1) {
        if (param0 >= -60) {
            field_r = -70;
        }
        int[] var2 = new int[]{3170352, 3170352, 3170352};
        int[] var3 = new int[]{6340704, 16777215, 16777215};
        param1.a(var2, var3, -2);
    }

    si() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new int[]{};
        field_w = " - rotate ship right";
        field_r = 500;
        field_y = "Connection lost. <%0>";
    }
}
