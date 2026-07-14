/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc implements ntb {
    static int[] field_e;
    int field_d;
    boa field_f;
    static String field_a;
    private boolean[] field_c;
    static int field_b;

    private final void a(int param0, byte param1, int param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        L0: {
          var6 = VoidHunters.field_G;
          if (null == ((kc) this).field_f) {
            break L0;
          } else {
            var7 = ((kc) this).field_f.field_c;
            var4 = var7;
            if (var7 != null) {
              var5 = 0;
              L1: while (true) {
                if (var7.length <= var5) {
                  break L0;
                } else {
                  if (param2 <= var7[var5]) {
                    var7[var5] = var7[var5] + param0;
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (param1 == 31) {
            break L2;
          } else {
            field_e = null;
            break L2;
          }
        }
    }

    final void a(int param0, boolean[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (param0 != 0) {
            return;
        }
        if (!(((kc) this).field_c == null)) {
            var3 = Math.min(param1.length, ((kc) this).field_c.length);
            for (var4 = 0; var3 > var4; var4++) {
                param1[var4] = ((kc) this).field_c[var4];
            }
        }
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((kc) this).field_d, 8);
        qla.a(param0, (byte) -15, ((kc) this).field_c, 8);
        if (vq.a(param0, 79, ((kc) this).field_f != null ? true : false)) {
            ((kc) this).field_f.b(param0, -126);
        }
        if (param1 > -109) {
            Object var4 = null;
            boolean discarded$0 = ((kc) this).a((byte) 81, (tv) null);
        }
    }

    public final boolean a(byte param0, tv param1) {
        kc var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          L1: {
            var4 = 112 % ((22 - param0) / 59);
            var3 = (kc) (Object) param1;
            if (var3.field_d != var3.field_d) {
              break L1;
            } else {
              if (it.a(var3.field_c, var3.field_c, 32)) {
                break L1;
              } else {
                boa discarded$2 = var3.field_f;
                L2: {
                  if (var3.field_f == null) {
                    break L2;
                  } else {
                    if (!var3.field_f.a((byte) 94, (tv) (Object) var3.field_f)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L0;
        }
        return stackIn_9_0 != 0;
    }

    public static void a(int param0) {
        if (param0 >= -68) {
            kc.a(10);
        }
        field_a = null;
        field_e = null;
    }

    private final void a(byte param0) {
        if (param0 < 46) {
            return;
        }
        if (!(0 != ((kc) this).field_d)) {
            this.a(4, (byte) 31, 8);
        }
        ((kc) this).field_d = 1;
    }

    final static void a(int param0, long[] param1, int param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var15 = VoidHunters.field_G;
          if (param4 > param2) {
            L1: {
              var5 = (param4 + param2) / 2;
              var6 = param2;
              var7 = param1[var5];
              param1[var5] = param1[param4];
              param1[param4] = var7;
              var9 = param3[var5];
              param3[var5] = param3[param4];
              param3[param4] = var9;
              if (9223372036854775807L != var7) {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var10 = stackIn_5_0;
            var11 = param2;
            L2: while (true) {
              if (var11 >= param4) {
                param1[param4] = param1[var6];
                param1[var6] = var7;
                param3[param4] = param3[var6];
                param3[var6] = var9;
                kc.a(-14677, param1, param2, param3, -1 + var6);
                kc.a(-14677, param1, var6 - -1, param3, param4);
                break L0;
              } else {
                if ((param1[var11] ^ -1L) > ((long)(var10 & var11) + var7 ^ -1L)) {
                  var12 = param1[var11];
                  param1[var11] = param1[var6];
                  param1[var6] = var12;
                  var14 = param3[var11];
                  param3[var11] = param3[var6];
                  var6++;
                  param3[var6] = var14;
                  var11++;
                  continue L2;
                } else {
                  var11++;
                  continue L2;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (param0 == -14677) {
            break L3;
          } else {
            field_a = null;
            break L3;
          }
        }
    }

    final void a(boolean[] param0, int param1) {
        ((kc) this).field_c = param0;
        if (param1 != -28855) {
            ((kc) this).field_d = -112;
        }
    }

    public kc() {
        ((kc) this).field_d = 1;
    }

    public final void b(byte param0, tv param1) {
        if (param0 < 54) {
            field_b = 51;
        }
        kc var3 = (kc) (Object) param1;
        var3.field_d = var3.field_d;
        var3.field_c = sab.a(var3.field_c, -31567, var3.field_c);
        if (null != var3.field_f) {
            if (!(null != var3.field_f)) {
                var3.field_f = new boa();
            }
            var3.field_f.b((byte) 72, (tv) (Object) var3.field_f);
        } else {
            var3.field_f = null;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        kc var5 = null;
        L0: {
          var5 = (kc) (Object) param0;
          if (null == var5.field_f) {
            break L0;
          } else {
            if (var5.field_f == null) {
              break L0;
            } else {
              var5.field_f.a((tv) (Object) var5.field_f, -28);
              break L0;
            }
          }
        }
        L1: {
          var4 = 0;
          if (var5.field_d != var5.field_d) {
            var4 = 1;
            System.out.println("int version has changed. before=" + var5.field_d + ", now=" + var5.field_d);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param1 < -19) {
            break L2;
          } else {
            this.a((byte) 101);
            break L2;
          }
        }
        L3: {
          if (!uca.a(var5.field_c, var5.field_c, -48)) {
            break L3;
          } else {
            System.out.println("boolean[] tips_done has changed. ");
            var4 = 1;
            break L3;
          }
        }
        boa discarded$1 = var5.field_f;
        L4: {
          if (var5.field_f == null) {
            break L4;
          } else {
            if (!var5.field_f.a((byte) 121, (tv) (Object) var5.field_f)) {
              break L4;
            } else {
              var4 = 1;
              System.out.println("ShipBlueprint blueprint has changed. before=" + var5.field_f + ", now=" + var5.field_f);
              break L4;
            }
          }
        }
        L5: {
          if (var4 == 0) {
            break L5;
          } else {
            System.out.println("This instance of PlayerGameData has changed");
            break L5;
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        ((kc) this).field_d = param0.i(0, 8);
        ((kc) this).field_c = nsa.a(8, param0, 76, ((kc) this).field_c);
        if (!kv.a(param1, param0)) {
            ((kc) this).field_f = null;
        } else {
            if (null == ((kc) this).field_f) {
                ((kc) this).field_f = new boa();
            }
            ((kc) this).field_f.a(param0, false);
        }
        this.a((byte) 58);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Lattice";
        field_b = 0;
    }
}
