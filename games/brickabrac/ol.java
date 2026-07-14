/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends km {
    private lc field_u;
    static String field_x;
    static jp[] field_z;
    static jp field_r;
    static int[] field_v;
    private lc field_t;
    static int field_y;
    static int field_w;
    static boolean field_s;

    final void a(int param0, int param1, char param2) {
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 == -120) {
          L0: {
            if ((((ol) this).field_h.field_j ^ -1) <= -1) {
              L1: {
                if (param1 == 98) {
                  break L1;
                } else {
                  if (param1 != 99) {
                    if (-97 == param1) {
                      if (1 != ((ol) this).field_h.field_j) {
                        if (-3 != (((ol) this).field_h.field_j ^ -1)) {
                          break L0;
                        } else {
                          ((ol) this).field_h.a(false, 1);
                          break L0;
                        }
                      } else {
                        ((ol) this).field_h.a(false, 2);
                        break L0;
                      }
                    } else {
                      if (param1 == -98) {
                        if (((ol) this).field_h.field_j == 2) {
                          ((ol) this).field_h.a(false, 1);
                          break L0;
                        } else {
                          if (-2 != ((ol) this).field_h.field_j) {
                            break L0;
                          } else {
                            ((ol) this).field_h.a(false, 2);
                            break L0;
                          }
                        }
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              if (((ol) this).field_h.field_j == -1) {
                ((ol) this).field_h.a(false, 1);
                break L0;
              } else {
                ((ol) this).field_h.a(false, 0);
                break L0;
              }
            } else {
              ((ol) this).field_h.a(false, 0);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, boolean param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          var4 = ((ol) this).field_m[param0].field_f;
          var5 = var4;
          if (var5 != 40) {
            if ((var5 ^ -1) != -42) {
              return super.a(param0, param1, (byte) 123);
            } else {
              if (!((ol) this).field_h.a((byte) 113)) {
                break L0;
              } else {
                ng.a(param1, 54, 15);
                break L0;
              }
            }
          } else {
            if (((ol) this).field_h.a((byte) 113)) {
              ng.a(param1, param2 + -54, 13);
              break L0;
            } else {
              break L0;
            }
          }
        }
        if (param2 == 123) {
          return false;
        } else {
          field_x = null;
          return false;
        }
    }

    public static void f(int param0) {
        field_r = null;
        field_v = null;
        field_x = null;
        if (param0 != 14529) {
            field_z = null;
        }
        field_z = null;
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        q var5 = null;
        String var5_ref = null;
        int var6 = 0;
        q var7 = null;
        q var8 = null;
        q var9 = null;
        String var10 = null;
        q var11 = null;
        q var12 = null;
        String stackIn_7_0 = null;
        String stackOut_6_0;
        String stackOut_5_0;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (param0) {
          var2 = 0;
          var3 = 0;
          L0: while (true) {
            if (1 <= var3) {
              var3 = (640 - var2) / 2;
              var4 = 0;
              L1: while (true) {
                if (var4 >= 1) {
                  var8 = ((ol) this).field_m[1];
                  var12 = var8;
                  var8.field_j = hq.field_s[0].field_x + 60;
                  var12.field_d = var12.field_j;
                  var12.field_c = (600 + -(2 * var12.field_j)) / 2;
                  var12.field_a = (523 + -var12.field_d) / 2;
                  var5 = ((ol) this).field_m[2];
                  var5.field_a = var12.field_a;
                  var5.field_d = var12.field_d;
                  var5.field_c = 340;
                  var5.field_j = var12.field_j;
                  return;
                } else {
                  var11 = ((ol) this).field_m[var4];
                  var11.field_c = var3;
                  var11.field_a = ((ol) this).b(var4, 1);
                  var11.field_d = ((ol) this).b((byte) -112, var4);
                  var3 = var3 + (var11.field_j + 10);
                  var4++;
                  continue L1;
                }
              }
            } else {
              L2: {
                var7 = ((ol) this).field_m[var3];
                var9 = var7;
                if (var9.field_f == 8) {
                  stackOut_6_0 = ((ol) this).e((byte) 81);
                  stackIn_7_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = ag.field_D[var7.field_f];
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                }
              }
              var10 = (String) (Object) stackIn_7_0;
              var5_ref = var10;
              var9.field_j = nn.field_g.c(var10) - -30;
              var2 = var2 + (nn.field_g.c(var10) - -30);
              if (var3 > 0) {
                var2 += 10;
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    ol() {
        super(16, 180, 460, 402, 35, ag.field_L);
        ((ol) this).field_u = new lc((km) this, ((ol) this).field_m[1], 1, 0);
        ((ol) this).field_t = new lc((km) this, ((ol) this).field_m[2], 2, 1);
    }

    final void b(byte param0) {
        super.b((byte) -56);
        al.a(((ol) this).field_a, 19);
        im.a(550, 5, 243, 5, 140, (byte) -91, 45);
        ((ol) this).a(0);
        ((ol) this).field_u.a((byte) 105);
        ((ol) this).field_t.a((byte) 116);
        if (param0 >= -14) {
            field_z = null;
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, -118);
        ((ol) this).field_u.b((byte) -75);
        ((ol) this).field_t.b((byte) -75);
        if (param2 > -52) {
            field_r = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Message lobby";
        field_v = new int[4];
        field_y = 10;
        field_s = true;
    }
}
