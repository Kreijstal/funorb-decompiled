/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja extends ua implements u, ql {
    private jj field_z;
    private jg field_C;
    static te field_B;
    private t field_D;
    static boolean field_F;
    static int[][] field_A;

    private final String d(byte param0) {
        if (param0 <= 93) {
            field_A = null;
        }
        return "</col></u>";
    }

    final static rb a(String param0, int param1) {
        String var2 = null;
        rb var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null != ah.field_b) {
          L0: {
            var7 = (CharSequence) (Object) param0;
            var2 = pl.a((byte) 119, var7);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (String) (Object) var7;
              break L0;
            }
          }
          L1: {
            if (param1 == -1684349368) {
              break L1;
            } else {
              var6 = null;
              rb discarded$2 = ja.a((String) null, -90);
              break L1;
            }
          }
          var3 = (rb) (Object) ah.field_b.a((long)var2.hashCode(), false);
          L2: while (true) {
            if (var3 != null) {
              L3: {
                var8 = (CharSequence) (Object) var3.field_db;
                var4 = pl.a((byte) 108, var8);
                if (var4 == null) {
                  var4 = var3.field_db;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (var4.equals((Object) (Object) var2)) {
                return var3;
              } else {
                var3 = (rb) (Object) ah.field_b.b(param1 + 1684349273);
                continue L2;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public final void a(int param0, int param1, jj param2, int param3) {
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == 0) {
            wc.a("terms.ws", false);
            break L0;
          } else {
            if (param0 != 1) {
              if (param0 == 2) {
                wc.a("conduct.ws", false);
                break L0;
              } else {
                break L0;
              }
            } else {
              wc.a("privacy.ws", false);
              break L0;
            }
          }
        }
        L1: {
          if (param1 == -21099) {
            break L1;
          } else {
            var7 = null;
            ((ja) this).a(-11, 111, (jj) null, -70);
            break L1;
          }
        }
    }

    private final String a(int param0) {
        if (param0 != 1971849544) {
            Object var3 = null;
            ((ja) this).a(-97, -69, (jj) null, 108);
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        if (((ja) this).field_D == param4) {
            ud.a(108);
            ((ja) this).field_C.g((byte) -75);
        }
        if (param3 != 7) {
            Object var7 = null;
            ((ja) this).a(-73, -74, (jj) null, -4);
        }
    }

    ja(jg param0) {
        super(0, 0, 288, 0, (ml) null);
        ((ja) this).field_C = param0;
        ((ja) this).field_D = new t(pi.field_i, (of) null);
        ((ja) this).field_D.field_h = (ml) (Object) new hd();
        String var7 = gg.a(new String[2], oi.field_i, true);
        int var3 = 20;
        a var4 = new a(t.field_z, 0, 0, 0, 0, 16777215, -1, 3, 0, t.field_z.field_C, -1, 2147483647, true);
        ((ja) this).field_z = new jj(var7, (ml) (Object) var4);
        ((ja) this).field_z.field_m = "";
        ((ja) this).field_z.a(false, 0, kg.field_a);
        ((ja) this).field_z.a(false, 1, kg.field_a);
        ((ja) this).field_z.field_o = (of) this;
        ((ja) this).field_z.field_l = ((ja) this).field_l - 40;
        ((ja) this).field_z.c(26, var3, -40 + ((ja) this).field_l, -1);
        var3 = var3 + (15 + ((ja) this).field_z.field_p);
        ((ja) this).b((byte) -41, (we) (Object) ((ja) this).field_z);
        int var5 = 4;
        int var6 = 200;
        ((ja) this).field_D.a(40, 13361, -var6 + 300 >> -1615538719, var6, var3);
        ((ja) this).field_D.field_o = (of) this;
        ((ja) this).b((byte) -111, (we) (Object) ((ja) this).field_D);
        ((ja) this).a(var3 - (-55 + -var5), 13361, 0, 300, 0);
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        if (super.a(param0, param1, param2, -80)) {
            return true;
        }
        if (param2 == 98) {
            return ((ja) this).a((byte) 109, param0);
        }
        if (!((param2 ^ -1) != -100)) {
            return ((ja) this).b(param0, false);
        }
        int var5 = -4 % ((37 - param3) / 50);
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, sj param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ed var21 = null;
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
        sj var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_13_0 = 0;
        int[] stackIn_14_0 = null;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        ed stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        short stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        short stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        short stackOut_28_0 = 0;
        ed stackOut_37_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_13_0 = null;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          L1: {
            var40 = MonkeyPuzzle2.field_F ? 1 : 0;
            var45 = param5;
            if (null == var45.field_N) {
              break L1;
            } else {
              if ((var45.field_D ^ -1) >= -2) {
                break L1;
              } else {
                var62 = var45.field_N;
                gg.a(cl.field_g, 0, var62, 0, 115);
                break L0;
              }
            }
          }
          bb.a(121);
          break L0;
        }
        var66 = new int[param5.field_r];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param5.field_r];
        var65 = gj.field_c;
        var64 = vd.field_a;
        var63 = rc.field_j;
        var13 = 0;
        L2: while (true) {
          if (var13 >= param5.field_r) {
            if (param2 > 15) {
              var44 = 0;
              var13 = var44;
              L3: while (true) {
                if (var44 >= s.field_R) {
                  return;
                } else {
                  L4: {
                    var14 = dj.field_c[var44];
                    var15 = param5.field_u[var14];
                    var16 = param5.field_L[var14];
                    var17 = param5.field_C[var14];
                    if (gj.field_c.length > param5.field_d[var14]) {
                      stackOut_23_0 = param5.field_d[var14];
                      stackIn_24_0 = stackOut_23_0;
                      break L4;
                    } else {
                      stackOut_22_0 = -1;
                      stackIn_24_0 = stackOut_22_0;
                      break L4;
                    }
                  }
                  L5: {
                    var18 = stackIn_24_0;
                    if (gj.field_c.length <= param5.field_n[var14]) {
                      stackOut_26_0 = -1;
                      stackIn_27_0 = stackOut_26_0;
                      break L5;
                    } else {
                      stackOut_25_0 = param5.field_n[var14];
                      stackIn_27_0 = stackOut_25_0;
                      break L5;
                    }
                  }
                  L6: {
                    var19 = stackIn_27_0;
                    if (gj.field_c.length <= param5.field_A[var14]) {
                      stackOut_29_0 = -1;
                      stackIn_30_0 = stackOut_29_0;
                      break L6;
                    } else {
                      stackOut_28_0 = param5.field_A[var14];
                      stackIn_30_0 = stackOut_28_0;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var20 = stackIn_30_0;
                      if (ri.field_c == null) {
                        break L8;
                      } else {
                        if (param5.field_c == null) {
                          break L8;
                        } else {
                          if (param5.field_c.length <= var14) {
                            break L8;
                          } else {
                            if ((param5.field_c[var14] ^ -1) == 0) {
                              break L8;
                            } else {
                              if (ri.field_c.length > param5.field_c[var14]) {
                                stackOut_37_0 = ri.field_c[param5.field_c[var14]];
                                stackIn_38_0 = stackOut_37_0;
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_36_0 = null;
                    stackIn_38_0 = (ed) (Object) stackOut_36_0;
                    break L7;
                  }
                  L9: {
                    var21 = stackIn_38_0;
                    var22 = bg.field_L[var15];
                    var23 = sb.field_l[var15];
                    var24 = bg.field_L[var16];
                    var25 = sb.field_l[var16];
                    var26 = bg.field_L[var17];
                    var27 = sb.field_l[var17];
                    if (var18 != var19) {
                      break L9;
                    } else {
                      if (var19 == var20) {
                        L10: {
                          var28 = var66[var18];
                          var29 = var67[var18];
                          if (var21 == null) {
                            stackOut_47_0 = 8355711;
                            stackIn_48_0 = stackOut_47_0;
                            break L10;
                          } else {
                            stackOut_46_0 = var21.field_e;
                            stackIn_48_0 = stackOut_46_0;
                            break L10;
                          }
                        }
                        var30 = stackIn_48_0;
                        var31 = var30 & 16711935;
                        var32 = var30 & 65280;
                        var33 = var28 * var32 >>> -1684349368 & -117375232 | -2097217281 & var28 * var31 >>> 961914664;
                        var33 = var33 + 65793 * var29;
                        ma.a(var26, var23, var25, var24, 4, var22, var27, (var33 & 16711422) >> -1015092767);
                        var44++;
                        continue L3;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    var28 = var66[var18];
                    var29 = var66[var19];
                    var30 = var66[var20];
                    var31 = var67[var18];
                    var32 = var67[var19];
                    var33 = var67[var20];
                    if (var21 != null) {
                      stackOut_43_0 = var21.field_e;
                      stackIn_44_0 = stackOut_43_0;
                      break L11;
                    } else {
                      stackOut_42_0 = 8355711;
                      stackIn_44_0 = stackOut_42_0;
                      break L11;
                    }
                  }
                  var34 = stackIn_44_0;
                  var35 = 16711935 & var34;
                  var36 = var34 & 65280;
                  var37 = (-16711821 & var28 * var35) >>> 740609608 | (var28 * var36 & 16711856) >>> 318722216;
                  var38 = (var36 * var29 & 16711823) >>> -559485496 | -83951361 & var35 * var29 >>> 1971849544;
                  var37 = var37 + var31 * 65793;
                  var39 = (-16711934 & var30 * var35) >>> 963583080 | (16711726 & var30 * var36) >>> -2126918872;
                  var38 = var38 + var32 * 65793;
                  var39 = var39 + 65793 * var33;
                  oi.a(var27, 255 & var38 >> -828510872, var25, 255 & var37 >> 1516856360, (byte) 92, var23, var26, var39 & 255, var24, var22, 255 & var37, var39 >> 692379432 & 255, var38 >> -328101328, 255 & var38, var39 >> 969397296, var37 >> -2040640112);
                  var44++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          } else {
            L12: {
              var14 = var63[var13] * param1 + (param4 * var64[var13] + param7 * var65[var13]) >> 138088520;
              if ((var14 ^ -1) <= -1) {
                break L12;
              } else {
                var14 = -var14;
                break L12;
              }
            }
            L13: {
              if (0 <= var14) {
                if (var14 >= 128) {
                  stackOut_12_0 = 256;
                  stackIn_13_0 = stackOut_12_0;
                  break L13;
                } else {
                  stackOut_11_0 = 128 - -var14;
                  stackIn_13_0 = stackOut_11_0;
                  break L13;
                }
              } else {
                stackOut_9_0 = 128;
                stackIn_13_0 = stackOut_9_0;
                break L13;
              }
            }
            L14: {
              var14 = stackIn_13_0;
              var15 = param0 * var63[var13] + param6 * var65[var13] - -(var64[var13] * param3) >> 482518184;
              stackOut_13_0 = r.field_a;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if ((var15 ^ -1) <= -1) {
                stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                stackOut_15_1 = var15;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L14;
              } else {
                stackOut_14_0 = (int[]) (Object) stackIn_14_0;
                stackOut_14_1 = -var15;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L14;
              }
            }
            var15 = stackIn_16_0[stackIn_16_1];
            var14 = (-var15 + 256) * var14 >>> -376196856;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            ja.b(false);
        }
        field_A = null;
        field_B = null;
    }

    final static void a(ug param0, ug param1, int param2) {
        if (!(param1.field_c == null)) {
            param1.c(-19822);
        }
        if (param2 > -97) {
            return;
        }
        param1.field_c = param0.field_c;
        param1.field_d = param0;
        param1.field_c.field_d = param1;
        param1.field_d.field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new te(7, 0, 1, 1);
        field_F = false;
    }
}
