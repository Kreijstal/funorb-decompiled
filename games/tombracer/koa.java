/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class koa {
    static ka[] field_b;
    static String field_d;
    private int field_e;
    private lj[] field_f;
    private dha[] field_a;
    static String field_c;

    final static int b(int param0) {
        if (param0 != 0) {
            field_d = null;
        }
        return qf.field_i;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3_int = 0;
        lj[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0 == -12) {
          var3_int = 0;
          L0: while (true) {
            if (((koa) this).field_f.length <= var3_int) {
              L1: {
                if (var2 <= 0) {
                  break L1;
                } else {
                  L2: {
                    var3 = new lj[((koa) this).field_f.length + -var2];
                    if (var3.length > 0) {
                      var4 = 0;
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= ((koa) this).field_f.length) {
                          break L2;
                        } else {
                          if (null != ((koa) this).field_f[var5]) {
                            if (!((koa) this).field_f[var5].n(31974).b(59)) {
                              var4++;
                              var3[var4] = ((koa) this).field_f[var5];
                              var5++;
                              continue L3;
                            } else {
                              var5++;
                              continue L3;
                            }
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  ((koa) this).field_f = var3;
                  break L1;
                }
              }
              return;
            } else {
              if (null != ((koa) this).field_f[var3_int]) {
                if (!((koa) this).field_f[var3_int].n(param0 + 31986).b(59)) {
                  var3_int++;
                  continue L0;
                } else {
                  var2++;
                  var3_int++;
                  continue L0;
                }
              } else {
                var2++;
                var3_int++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, lj[] param1) {
        if (param0 != 9) {
            ((koa) this).field_f = null;
        }
        ((koa) this).field_f = param1;
    }

    final void a(int param0, ew param1, kh param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        this.a((byte) -12);
        param2.a((byte) 43, ((koa) this).field_f.length, iia.d(((koa) this).field_e, 22972));
        var4 = 0;
        L0: while (true) {
          if (((koa) this).field_f.length <= var4) {
            L1: {
              if (param0 == 30489) {
                break L1;
              } else {
                ((koa) this).field_a = null;
                break L1;
              }
            }
            return;
          } else {
            if (((koa) this).field_f[var4].h((byte) 114) == param1) {
              param2.a((byte) 70, 1, 1);
              param2.a((byte) 61, ((koa) this).field_f[var4].i((byte) 84).field_d, 8);
              var4++;
              continue L0;
            } else {
              param2.a((byte) -126, 0, 1);
              param2.a((byte) -127, ((koa) this).field_f[var4].n(31974).field_d, 8);
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(ew param0, int param1) {
        int var3 = 0;
        dha var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (!(((koa) this).field_a != null)) {
            return;
        }
        ((koa) this).field_f = new lj[((koa) this).field_a.length];
        for (var3 = 0; ((koa) this).field_a.length > var3; var3++) {
            var4 = ((koa) this).field_a[var3];
            ((koa) this).field_f[var3] = param0.a(28672, var4.field_a, var4.field_b);
        }
        ((koa) this).field_a = null;
        if (param1 != 8) {
            field_b = null;
        }
        this.a((byte) -12);
    }

    final lj[] c(int param0) {
        if (param0 != 1) {
            field_c = null;
        }
        return ((koa) this).field_f;
    }

    koa(int param0, int param1) {
        ((koa) this).field_e = param0;
        ((koa) this).field_f = new lj[]{};
    }

    koa(int param0, int param1, int param2, kh param3) {
        int var5 = 0;
        int var6 = 0;
        dha[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        dha stackIn_4_2 = null;
        dha stackIn_4_3 = null;
        dha[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        dha stackIn_5_2 = null;
        dha stackIn_5_3 = null;
        dha[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        dha stackIn_6_2 = null;
        dha stackIn_6_3 = null;
        int stackIn_6_4 = 0;
        dha[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        dha stackOut_3_2 = null;
        dha stackOut_3_3 = null;
        dha[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        dha stackOut_5_2 = null;
        dha stackOut_5_3 = null;
        int stackOut_5_4 = 0;
        dha[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        dha stackOut_4_2 = null;
        dha stackOut_4_3 = null;
        int stackOut_4_4 = 0;
        ((koa) this).field_e = param0;
        var5 = param3.b((byte) 44, iia.d(param0, 22972));
        ((koa) this).field_f = new lj[var5];
        ((koa) this).field_a = new dha[var5];
        var6 = 0;
        L0: while (true) {
          if (var6 >= var5) {
          } else {
            if (param2 <= 9) {
              ((koa) this).field_a[var6] = new dha(false, param3.b((byte) 44, 8));
              var6++;
              continue L0;
            } else {
              L1: {
                stackOut_3_0 = ((koa) this).field_a;
                stackOut_3_1 = var6;
                stackOut_3_2 = null;
                stackOut_3_3 = null;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                if ((param3.b((byte) 44, 1) ^ -1) != -2) {
                  stackOut_5_0 = (dha[]) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = null;
                  stackOut_5_3 = null;
                  stackOut_5_4 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  stackIn_6_4 = stackOut_5_4;
                  break L1;
                } else {
                  stackOut_4_0 = (dha[]) (Object) stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = null;
                  stackOut_4_3 = null;
                  stackOut_4_4 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  stackIn_6_4 = stackOut_4_4;
                  break L1;
                }
              }
              new dha(stackIn_6_4 != 0, param3.b((byte) 44, 8));
              stackIn_6_0[stackIn_6_1] = stackIn_6_2;
              var6++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 > -71) {
            int discarded$0 = koa.b(50);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "These trigger-happy dart totems are ready to shoot their mouths off. And yours. Best dart past them quickly.";
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
