/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ug extends oe {
    private int field_Y;
    private int field_eb;
    private int field_fb;
    static String field_bb;
    static String field_Z;
    private int field_ab;
    private int field_db;
    static String field_cb;
    private int field_gb;

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -6) {
            ((ug) this).field_db = 103;
        }
        if ((((ug) this).field_ab ^ -1) >= -1) {
        } else {
            var2 = ((ug) this).field_fb;
            var3 = ((ug) this).field_Y;
            ((ug) this).field_eb = ((ug) this).field_eb + 1;
            if (((ug) this).field_eb + 1 >= ((ug) this).field_ab) {
                ((ug) this).field_ab = 0;
                ((ug) this).g((byte) -82);
            } else {
                var4 = (-((ug) this).field_eb + 2 * ((ug) this).field_ab) * ((ug) this).field_eb;
                var5 = ((ug) this).field_ab * ((ug) this).field_ab;
                var3 = var4 * (((ug) this).field_Y - ((ug) this).field_db) / var5 + ((ug) this).field_db;
                var2 = ((ug) this).field_gb - -((-((ug) this).field_gb + ((ug) this).field_fb) * var4 / var5);
            }
            ((ug) this).a(param0 ^ 75, var3, var2);
        }
        return super.l(-6);
    }

    final static byte[] a(byte[] param0, int param1) {
        if (param1 != 194) {
            ug.a((byte) 35);
        }
        int var2 = param0.length;
        byte[] var3 = new byte[var2];
        lj.a(param0, 0, var3, 0, var2);
        return var3;
    }

    boolean j(int param0) {
        ((ug) this).m(71);
        if (param0 >= -35) {
            return true;
        }
        return super.j(-104);
    }

    ug(sh param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ug) this).field_eb = 0;
        ((ug) this).field_ab = 0;
    }

    void m(int param0) {
        if (!(((ug) this).field_ab > 0)) {
            return;
        }
        ((ug) this).a(-34, ((ug) this).field_Y, ((ug) this).field_fb);
        ((ug) this).field_ab = 0;
        ((ug) this).g((byte) -9);
        if (param0 <= 53) {
            ug.a((byte) -18);
        }
    }

    public static void a(byte param0) {
        int var1 = 31 / ((param0 - -9) / 37);
        field_bb = null;
        field_Z = null;
        field_cb = null;
    }

    void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        L0: {
          var16 = Confined.field_J ? 1 : 0;
          fn.c(param0 + 6, 35 + param2, ((ug) this).field_F + -12, -40 + ((ug) this).field_z, 2105376, 0);
          var5 = 211;
          var4 = 35;
          var6 = 194;
          var7 = 0;
          var8 = param2;
          if (param1 <= -58) {
            break L0;
          } else {
            var17 = null;
            byte[] discarded$1 = ug.a((byte[]) null, 12);
            break L0;
          }
        }
        L1: while (true) {
          if (var7 >= var4) {
            var4 = 22;
            var6 = 169;
            var5 = 194;
            var7 = 0;
            var8 = param2 - -35;
            L2: while (true) {
              if (var7 >= var4) {
                rh.field_Z.d(-90 + param0 + ((ug) this).field_F, param2 + 10);
                nl.a(109, param0 - -5, wc.field_nc, ((ug) this).field_F + -10, 35 + param2);
                nl.a(124, param0, fi.field_d, ((ug) this).field_F, -22 + ((ug) this).field_z + param2);
                var5 = 169;
                var6 = 127;
                var4 = ((ug) this).field_z + -79;
                var7 = 0;
                var8 = param2 - -57;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 461364168 | var9 << -1913611632);
                    fn.b(param0, var8, 6, var9);
                    fn.b(param0 + ((ug) this).field_F - 6, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 - -((-var5 + var6) * var7 / var4);
                var9 = var9 | (var9 << 2098585968 | var9 << 570406056);
                fn.b(param0, var8, 6, var9);
                fn.b(((ug) this).field_F + (param0 + -6), var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            if (var8 >= fn.field_b) {
              if (var8 < fn.field_j) {
                L4: {
                  var9 = var5 - -((-var5 + var6) * var7 / var4);
                  var10 = 0;
                  var11 = ((ug) this).field_F;
                  if (20 < var7) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if ((var10 ^ -1) < -21) {
                        break L4;
                      } else {
                        var12 = (-var10 + 20) * (-var10 + 20) + (-var7 + 20) * (20 - var7);
                        if (462 >= var12) {
                          if (-421 < (var12 ^ -1)) {
                            break L4;
                          } else {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << 127095952 | var13 << 1127356200);
                            fn.field_h[var10 + (fn.field_g * var8 + param0)] = var13;
                            var10++;
                            continue L5;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if ((var7 ^ -1) >= -21) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (20 < var13) {
                          break L8;
                        } else {
                          var14 = var13 * var13 + (20 - var7) * (-var7 + 20);
                          if (462 < var14) {
                            break L8;
                          } else {
                            if (-421 >= (var14 ^ -1)) {
                              var15 = (462 + -var14) * var9 / 42;
                              var15 = var15 | (var15 << -1115434872 | var15 << 1887233360);
                              fn.field_h[param0 + (var8 * fn.field_g - -var11)] = var15;
                              var11++;
                              var13++;
                              continue L7;
                            } else {
                              var12 = 1 + var11;
                              var11++;
                              var13++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var9 = var9 | (var9 << 1391198184 | var9 << -569327024);
                fn.b(var10 - -param0, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L1;
              } else {
                var7++;
                var8++;
                continue L1;
              }
            } else {
              var7++;
              var8++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (-1 <= (param1 ^ -1)) {
            ((ug) this).a(-109, param0, param3);
            return;
        }
        ((ug) this).field_eb = 0;
        ((ug) this).field_fb = param3;
        if (param2 != 6) {
            ((ug) this).field_gb = 125;
        }
        ((ug) this).field_gb = ((ug) this).field_F;
        ((ug) this).field_Y = param0;
        ((ug) this).field_db = ((ug) this).field_z;
        ((ug) this).field_ab = param1;
    }

    void g(byte param0) {
        if (param0 >= -6) {
            ug.a((byte) -68);
        }
    }

    final static Object a(int param0, boolean param1, byte[] param2) {
        ig var3 = null;
        if (param2 == null) {
            return null;
        }
        if (!((param2.length ^ -1) >= -137)) {
            var3 = new ig();
            ((qf) (Object) var3).a((byte) 49, param2);
            return (Object) (Object) var3;
        }
        if (param0 < 124) {
            return null;
        }
        if (param1) {
            return (Object) (Object) ug.a(param2, 194);
        }
        return (Object) (Object) param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "Loading music";
        field_Z = "<col=FFFFFF>Lives:</col> if you die, you can carry on as long as you have at least one of these left.";
        field_cb = "Just play";
    }
}
