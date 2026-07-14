/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static double field_b;
    int[] field_c;
    int field_f;
    int field_a;
    static String field_d;
    static String field_e;

    final int a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              if (((be) this).field_c == null) {
                break L1;
              } else {
                if (0 != ((be) this).field_c.length) {
                  stackOut_6_0 = ((be) this).field_c[((be) this).field_c.length + -1];
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return 65;
        }
    }

    final static void b(int param0) {
        if (gj.field_a != null) {
            if (!(gj.field_a.h())) {
                return;
            }
        }
        gj.field_a = li.a(ke.field_h[5], 100, 96);
        int var1 = 39 / ((param0 - -87) / 39);
        na.a((byte) 125, gj.field_a);
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null != ((be) this).field_c) {
            // if_icmpeq L27
        } else {
            return 0;
        }
        for (var3 = 1; ((be) this).field_c.length > var3; var3++) {
            if (!(((be) this).field_c[var3 + -1] + ((be) this).field_c[var3] >> -177902559 <= param1)) {
                return -1 + var3;
            }
        }
        if (param0 != 0) {
            Object var5 = null;
            String discarded$0 = be.a((byte[]) null, (byte) 88);
        }
        return ((be) this).field_c.length + -1;
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_d = null;
        field_e = null;
    }

    final static void a(gk param0, java.math.BigInteger param1, int param2, int param3, int param4, java.math.BigInteger param5, byte[] param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        L0: {
          var10 = MonkeyPuzzle2.field_F ? 1 : 0;
          var7 = vb.a(105, param4);
          if (pb.field_b != null) {
            break L0;
          } else {
            pb.field_b = new java.security.SecureRandom();
            break L0;
          }
        }
        var16 = new int[4];
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var8 = var13;
        var9 = 0;
        L1: while (true) {
          if (4 <= var9) {
            L2: {
              L3: {
                if (jk.field_z == null) {
                  break L3;
                } else {
                  if (var7 > jk.field_z.field_g.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              jk.field_z = new gk(var7);
              break L2;
            }
            L4: {
              L5: {
                jk.field_z.field_h = 0;
                jk.field_z.b(param6, param4, -2, param3);
                jk.field_z.a(true, var7);
                jk.field_z.a(30350, var16);
                if (null == MonkeyPuzzle2.field_A) {
                  break L5;
                } else {
                  if (MonkeyPuzzle2.field_A.field_g.length < 100) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              MonkeyPuzzle2.field_A = new gk(100);
              break L4;
            }
            MonkeyPuzzle2.field_A.field_h = 0;
            MonkeyPuzzle2.field_A.b(10, -49152);
            var12 = 0;
            var9 = var12;
            L6: while (true) {
              if ((var12 ^ -1) <= -5) {
                L7: {
                  if (param2 < -76) {
                    break L7;
                  } else {
                    var11 = null;
                    be.a((gk) null, (java.math.BigInteger) null, 116, -40, -47, (java.math.BigInteger) null, (byte[]) null);
                    break L7;
                  }
                }
                MonkeyPuzzle2.field_A.c(param4, 83);
                MonkeyPuzzle2.field_A.a((byte) -127, param1, param5);
                param0.b(MonkeyPuzzle2.field_A.field_g, MonkeyPuzzle2.field_A.field_h, -2, 0);
                param0.b(jk.field_z.field_g, jk.field_z.field_h, -2, 0);
                return;
              } else {
                MonkeyPuzzle2.field_A.a(-803539344, var16[var12]);
                var12++;
                continue L6;
              }
            }
          } else {
            var8[var9] = pb.field_b.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final static String a(byte[] param0, byte param1) {
        int var2 = -122 % ((18 - param1) / 45);
        return sc.a(param0, param0.length, 94, 0);
    }

    final static ad a(boolean param0, boolean param1, int param2, int param3, boolean param4) {
        if (param2 != 13271) {
            Object var6 = null;
            be.a((gk) null, (java.math.BigInteger) null, -19, 70, -21, (java.math.BigInteger) null, (byte[]) null);
        }
        return em.a(false, param3, param4, param1, !param0 ? 0 : 1, 50);
    }

    be(int param0, int param1, int param2) {
        ((be) this).field_a = param0;
        ((be) this).field_c = new int[1 + param2];
        ((be) this).field_f = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = Math.atan2(0.0, 1.0);
        field_e = "Email (Login):";
    }
}
