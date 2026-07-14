/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static ci field_f;
    private int[] field_e;
    private boolean field_h;
    private int field_b;
    static int[] field_d;
    private int field_g;
    static String field_a;
    static int[] field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, rm param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        he var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        rm var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_16_0 = 0;
        int[] stackIn_17_0 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        he stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        int stackOut_24_0 = 0;
        short stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        short stackOut_26_0 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        he stackOut_38_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          L1: {
            var40 = Confined.field_J ? 1 : 0;
            var45 = param5;
            if (var45.field_P == null) {
              break L1;
            } else {
              if (var45.field_A > 1) {
                var62 = var45.field_P;
                fc.a(-1257536924, 0, bd.field_g, 0, var62);
                break L0;
              } else {
                break L1;
              }
            }
          }
          wb.a(-60);
          break L0;
        }
        L2: {
          var66 = new int[param5.field_g];
          var60 = var66;
          var55 = var60;
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var67 = new int[param5.field_g];
          var65 = tf.field_m;
          var64 = sd.field_c;
          var63 = w.field_R;
          if (param1 > 46) {
            break L2;
          } else {
            field_a = null;
            break L2;
          }
        }
        var13 = 0;
        L3: while (true) {
          if (var13 >= param5.field_g) {
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= ei.field_jb) {
                return;
              } else {
                L5: {
                  var14 = tl.field_i[var44];
                  var15 = param5.field_z[var14];
                  var16 = param5.field_m[var14];
                  var17 = param5.field_J[var14];
                  if (tf.field_m.length <= param5.field_j[var14]) {
                    stackOut_24_0 = -1;
                    stackIn_25_0 = stackOut_24_0;
                    break L5;
                  } else {
                    stackOut_23_0 = param5.field_j[var14];
                    stackIn_25_0 = stackOut_23_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_25_0;
                  if (param5.field_l[var14] >= tf.field_m.length) {
                    stackOut_27_0 = -1;
                    stackIn_28_0 = stackOut_27_0;
                    break L6;
                  } else {
                    stackOut_26_0 = param5.field_l[var14];
                    stackIn_28_0 = stackOut_26_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_28_0;
                  if (param5.field_o[var14] < tf.field_m.length) {
                    stackOut_30_0 = param5.field_o[var14];
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  } else {
                    stackOut_29_0 = -1;
                    stackIn_31_0 = stackOut_29_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_31_0;
                    if (im.field_a == null) {
                      break L9;
                    } else {
                      if (param5.field_a == null) {
                        break L9;
                      } else {
                        if (param5.field_a.length <= var14) {
                          break L9;
                        } else {
                          if (-1 == param5.field_a[var14]) {
                            break L9;
                          } else {
                            if (im.field_a.length > param5.field_a[var14]) {
                              stackOut_38_0 = im.field_a[param5.field_a[var14]];
                              stackIn_39_0 = stackOut_38_0;
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_37_0 = null;
                  stackIn_39_0 = (he) (Object) stackOut_37_0;
                  break L8;
                }
                L10: {
                  var21 = stackIn_39_0;
                  var22 = qf.field_a[var15];
                  var23 = db.field_x[var15];
                  var24 = qf.field_a[var16];
                  var25 = db.field_x[var16];
                  var26 = qf.field_a[var17];
                  var27 = db.field_x[var17];
                  if (var19 != var18) {
                    break L10;
                  } else {
                    if (var20 == var19) {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21 == null) {
                          stackOut_48_0 = 8355711;
                          stackIn_49_0 = stackOut_48_0;
                          break L11;
                        } else {
                          stackOut_47_0 = var21.field_a;
                          stackIn_49_0 = stackOut_47_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_49_0;
                      var31 = 16711935 & var30;
                      var32 = 65280 & var30;
                      var33 = (var28 * var31 & -16711707) >>> -922646424 | (16711867 & var28 * var32) >>> -1216546936;
                      var33 = var33 + var29 * 65793;
                      da.a(var26, var22, var23, (byte) -122, var27, var24, (var33 & 16711422) >> 1023914209, var25);
                      var44++;
                      continue L4;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  var28 = var66[var18];
                  var29 = var66[var19];
                  var30 = var66[var20];
                  var31 = var67[var18];
                  var32 = var67[var19];
                  var33 = var67[var20];
                  if (var21 != null) {
                    stackOut_44_0 = var21.field_a;
                    stackIn_45_0 = stackOut_44_0;
                    break L12;
                  } else {
                    stackOut_43_0 = 8355711;
                    stackIn_45_0 = stackOut_43_0;
                    break L12;
                  }
                }
                var34 = stackIn_45_0;
                var35 = var34 & 16711935;
                var36 = var34 & 65280;
                var37 = (var28 * var35 & -16711825) >>> -1135383224 | (16711793 & var28 * var36) >>> 287645352;
                var38 = var29 * var36 >>> -2029025624 & 889257728 | (var29 * var35 & -16711738) >>> 554569672;
                var37 = var37 + 65793 * var31;
                var39 = var36 * var30 >>> 1607962024 & -285147392 | (var30 * var35 & -16711732) >>> -390497848;
                var38 = var38 + 65793 * var32;
                var39 = var39 + var33 * 65793;
                tb.a(var38 >> 913187408, var23, 255 & var39, var25, var39 >> -41408240, 255 & var37, var39 >> -1059754264 & 255, 255 & var37 >> -953001528, var24, 255 & var38, var27, var22, var26, -77, var38 >> -69617496 & 255, var37 >> -551309424);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = param4 * var63[var13] + (var64[var13] * param0 + param6 * var65[var13]) >> 2124540360;
              if (var14 >= 0) {
                break L13;
              } else {
                var14 = -var14;
                break L13;
              }
            }
            L14: {
              if (0 > var14) {
                stackOut_15_0 = 128;
                stackIn_16_0 = stackOut_15_0;
                break L14;
              } else {
                if (var14 < 128) {
                  stackOut_14_0 = var14 + 128;
                  stackIn_16_0 = stackOut_14_0;
                  break L14;
                } else {
                  stackOut_13_0 = 256;
                  stackIn_16_0 = stackOut_13_0;
                  break L14;
                }
              }
            }
            L15: {
              var14 = stackIn_16_0;
              var15 = param3 * var65[var13] - -(param7 * var64[var13]) + param2 * var63[var13] >> 2046181864;
              stackOut_16_0 = oj.field_D;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (0 <= var15) {
                stackOut_18_0 = (int[]) (Object) stackIn_18_0;
                stackOut_18_1 = var15;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L15;
              } else {
                stackOut_17_0 = (int[]) (Object) stackIn_17_0;
                stackOut_17_1 = -var15;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L15;
              }
            }
            var15 = stackIn_19_0[stackIn_19_1];
            var14 = (-var15 + 256) * var14 >>> 1456221704;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L3;
          }
        }
    }

    final void a(int param0, byte param1) {
        L0: {
          if (-1 < (param0 ^ -1)) {
            break L0;
          } else {
            if (((wl) this).field_g >= param0) {
              L1: {
                if (param0 != ((wl) this).field_g) {
                  lj.a(((wl) this).field_e, param0 - -1, ((wl) this).field_e, param0, ((wl) this).field_g + -param0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 < -83) {
                  break L2;
                } else {
                  field_f = null;
                  break L2;
                }
              }
              ((wl) this).field_g = ((wl) this).field_g - 1;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    final static void a(int param0) {
        try {
            if (!(null == bg.field_b)) {
                try {
                    bg.field_b.a((byte) 123, 0L);
                    bg.field_b.a(24, (byte) 9, e.field_c.field_n, e.field_c.field_m);
                } catch (Exception exception) {
                }
            }
            e.field_c.field_n = e.field_c.field_n + 24;
            if (param0 != 1607962024) {
                field_f = null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0) {
            return;
        }
        field_a = null;
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        var3 = ((wl) this).field_e.length;
        if (param1 > 25) {
          L0: while (true) {
            if (param0 < var3) {
              return var3;
            } else {
              if (!((wl) this).field_h) {
                var3 = var3 + ((wl) this).field_b;
                continue L0;
              } else {
                if (var3 != 0) {
                  var3 = var3 * ((wl) this).field_b;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 95;
        }
    }

    final int a(int param0, int param1) {
        if (!(((wl) this).field_g >= param0)) {
            throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 != 27656) {
            field_a = null;
        }
        return ((wl) this).field_e[param0];
    }

    final static void a(int param0, boolean param1, boolean param2) {
        Object var4 = null;
        gk.a(param1, (String) null, (byte) -116, param2);
        if (param0 > -14) {
            field_f = null;
        }
    }

    private final void c(int param0, int param1) {
        int[] var4 = new int[this.b(param0, 95)];
        int[] var3 = var4;
        if (param1 != -9407) {
            this.c(10, -1);
        }
        lj.a(((wl) this).field_e, 0, var4, 0, ((wl) this).field_e.length);
        ((wl) this).field_e = var4;
    }

    final int a(byte param0) {
        if (param0 <= 86) {
            return 33;
        }
        return 1 + ((wl) this).field_g;
    }

    private final void a(int param0, int param1, int param2) {
        if (!(param2 <= ((wl) this).field_g)) {
            ((wl) this).field_g = param2;
        }
        if (param2 >= ((wl) this).field_e.length) {
            this.c(param2, param1 ^ -287652375);
        }
        if (param1 != 287645352) {
            this.c(122, -120);
        }
        ((wl) this).field_e[param2] = param0;
    }

    final void a(byte param0, int param1) {
        if (param0 > -51) {
            field_d = null;
        }
        this.a(param1, 287645352, 1 + ((wl) this).field_g);
    }

    private wl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ci();
        field_d = new int[8192];
        field_a = "Unpacking graphics";
        field_c = new int[]{1, 3, 15, 6, 17, 11, 1, 1, 1, 7, 1, 5, 9, 1, 1, 1, 1, 1};
    }
}
