/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fba implements ntb, ofa {
    private int field_b;
    private cda[] field_a;
    static String field_c;

    private final jo b(int param0, int param1, int param2, int param3) {
        int var5 = this.a(param3, param1, param0 + 8, param2);
        int var6 = param0 + ((fba) this).field_a.length & var5;
        if (!(null != ((fba) this).field_a[var6])) {
            ((fba) this).field_a[var6] = new cda();
        }
        ppb.field_b = ((fba) this).field_a[var6];
        return ((fba) this).field_a[var6].a((byte) 120, param3, param1, param2);
    }

    final int a(int param0, int[] param1, int param2, int param3) {
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        int var5 = ((fba) this).a((byte) 93, param1, param2);
        int var7 = 105 % ((-21 - param3) / 62);
        int var6 = 0;
        for (var8 = 0; var5 > var8; var8++) {
            var6 = kpb.field_s[var8].a(-36, param0, var6);
        }
        return var6;
    }

    private final jo a(int param0, int param1, int param2, byte param3) {
        int var5 = this.a(param2, param1, 7, param0);
        cda var6 = ((fba) this).field_a[-1 + ((fba) this).field_a.length & var5];
        if (param3 < 108) {
            ((fba) this).field_b = 69;
        }
        ppb.field_b = var6;
        if (var6 == null) {
            return null;
        }
        return var6.a(100, param0, param2, param1);
    }

    final void a(int[] param0, int param1, int param2, boolean param3, int param4) {
        int var7 = 0;
        jo var8 = null;
        int var9 = VoidHunters.field_G;
        int var6 = ((fba) this).a((byte) -102, param0, param2);
        for (var7 = param4; var7 < var6; var7++) {
            var8 = kpb.field_s[var7];
            sl.field_c[var7].a(param4 ^ -126);
            this.a(1, var8, param1);
        }
        if (!(!param3)) {
            this.a((byte) -63, param2, param1);
        }
        this.a(-15536);
    }

    private final int c(int param0, int param1) {
        if (param1 > -21) {
            jo discarded$0 = this.a(-94, -43, -100, (byte) -113);
        }
        if (!(0 <= param0)) {
            param0 = param0 - 65536;
        }
        return param0 / 65536;
    }

    final void a(int[] param0, byte param1) {
        int var3 = 123 % ((6 - param1) / 45);
        ah.field_o[3] = param0[3];
        ah.field_o[0] = param0[0];
        ah.field_o[2] = param0[2];
        ah.field_o[1] = param0[1];
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        for (var3 = 1 + param0; var3 < bs.field_c; var3++) {
            kpb.field_s[var3] = null;
            sl.field_c[var3] = null;
        }
        if (param1 <= 72) {
            ((fba) this).field_b = -33;
        }
        bs.field_c = param0;
    }

    public final boolean a(byte param0, tv param1) {
        fba var3 = (fba) (Object) param1;
        int var4 = 43 / ((param0 - 22) / 59);
        return dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) ((fba) this).field_a, 122);
    }

    final void a(int param0, int[] param1, int param2, byte param3) {
        ((fba) this).a(param1, param0, param2, false, 0);
        if (param3 >= -15) {
            field_c = null;
        }
    }

    final void a(int[] param0, byte param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int var5 = this.b((byte) -123, param0, param3);
        for (var6 = 0; var6 < var5; var6++) {
            kpb.field_s[var6].a(param2, -13251);
            sl.field_c[var6].a(-111);
        }
        this.a(-15536);
        if (param1 < 1) {
            ((fba) this).field_a = null;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4) {
        jo var6 = this.b(-1, param1, param3, param4);
        if (!param0) {
            this.a((byte) -57, 94, 86);
        }
        var6.a(param2, -13251);
        ppb.field_b.a(-112);
    }

    private final int b(byte param0, int[] param1, int param2) {
        int var9 = 0;
        int var10 = 0;
        jo var11 = null;
        int var12 = VoidHunters.field_G;
        int var4 = this.c(param1[0], -110);
        int var5 = this.c(param1[1], -80);
        if (param0 >= -37) {
            field_c = null;
        }
        int var6 = this.a(param1[2], (byte) 19);
        int var7 = this.a(param1[3], (byte) 19);
        int var8 = 0;
        for (var9 = var4; var5 >= var9; var9++) {
            for (var10 = var6; var10 <= var7; var10++) {
                var11 = this.b(-1, var10, param2, var9);
                sl.field_c[var8] = ppb.field_b;
                var8++;
                kpb.field_s[var8] = var11;
            }
        }
        this.b(var8, 93);
        return var8;
    }

    private final int a(int param0, int param1, int param2, int param3) {
        int var5 = 11 * param3 + param2 * param1 + 3 * param0;
        return var5;
    }

    final int a(byte param0, int[] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        jo var12 = null;
        int var13 = 0;
        var13 = VoidHunters.field_G;
        var5 = -18 % ((35 - param0) / 54);
        var4 = this.c(param1[0], -35);
        var6 = this.c(param1[1], -109);
        var7 = this.a(param1[2], (byte) 19);
        var8 = this.a(param1[3], (byte) 19);
        var9 = 0;
        var10 = var4;
        L0: while (true) {
          if (var10 > var6) {
            this.b(var9, 88);
            return var9;
          } else {
            var11 = var7;
            L1: while (true) {
              if (var11 > var8) {
                var10++;
                continue L0;
              } else {
                var12 = this.a(param2, var11, var10, (byte) 110);
                if (var12 != null) {
                  L2: {
                    if (sl.field_c.length <= var9) {
                      this.b((byte) -16);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  sl.field_c[var9] = ppb.field_b;
                  var9++;
                  kpb.field_s[var9] = var12;
                  var11++;
                  continue L1;
                } else {
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final int a(int param0, int param1) {
        if (param0 > -75) {
            ((fba) this).field_b = 57;
        }
        return ((fba) this).a(-1, ah.field_o, param1, 74);
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 <= 112) {
            field_c = null;
        }
    }

    public final void a(tv param0, int param1) {
        fba var3 = null;
        int var4 = 0;
        L0: {
          var3 = (fba) (Object) param0;
          boolean discarded$2 = tja.a((ntb[]) (Object) var3.field_a, 1, (ntb[]) (Object) var3.field_a, false, 5547);
          var4 = 0;
          if (!dn.a((tv[]) (Object) var3.field_a, false, 1, (tv[]) (Object) var3.field_a, -99)) {
            break L0;
          } else {
            var4 = 1;
            System.out.println("PartitionZoneList[] zonelists has changed. ");
            break L0;
          }
        }
        if (param1 > -19) {
          L1: {
            field_c = null;
            if (var4 != 0) {
              System.out.println("This instance of PartitioningManager has changed");
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (var4 != 0) {
              System.out.println("This instance of PartitioningManager has changed");
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    public final void b(faa param0, int param1) {
        faa var3 = null;
        cda[] var4 = null;
        int var5 = 0;
        cda[] var6 = null;
        int var7 = 0;
        cda var8 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          var3 = param0;
          var4 = ((fba) this).field_a;
          if (param1 < -109) {
            break L0;
          } else {
            jo discarded$2 = this.b(-108, -16, 66, 92);
            break L0;
          }
        }
        L1: {
          if (var4 == null) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = var4.length;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var5 = stackIn_5_0;
          var3.a(-632, var5, 10);
          if (var5 != 0) {
            var6 = var4;
            var7 = 0;
            L3: while (true) {
              if (var6.length <= var7) {
                break L2;
              } else {
                L4: {
                  var8 = var6[var7];
                  stackOut_9_0 = (faa) var3;
                  stackOut_9_1 = 53;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  if (var8 == null) {
                    stackOut_11_0 = (faa) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    break L4;
                  } else {
                    stackOut_10_0 = (faa) (Object) stackIn_10_0;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    break L4;
                  }
                }
                if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_12_2 != 0)) {
                  stb.a(2, 1, var3, (tv) (Object) var8);
                  var7++;
                  continue L3;
                } else {
                  var7++;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 2) {
            return;
        }
        jo var6 = this.a(param2, param1, param0, (byte) 114);
        if (var6 != null) {
            ppb.field_b.a(param3 + -14);
            this.a(1, var6, param4);
        }
    }

    private final void b(byte param0) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        cda[] var6 = new cda[sl.field_c.length * 2];
        cda[] var2 = var6;
        for (var3_int = 0; sl.field_c.length > var3_int; var3_int++) {
            var6[var3_int] = sl.field_c[var3_int];
        }
        sl.field_c = var2;
        if (param0 != -16) {
            ((fba) this).field_b = -122;
        }
        jo[] var3 = new jo[2 * kpb.field_s.length];
        for (var4 = 0; var4 < kpb.field_s.length; var4++) {
            var3[var4] = kpb.field_s[var4];
        }
        kpb.field_s = var3;
    }

    public final void b(byte param0, tv param1) {
        fba var3 = (fba) (Object) param1;
        if (!(var3.field_b != var3.field_b)) {
            return;
        }
        if (param0 < 54) {
            field_c = null;
        }
        var3.field_b = var3.field_b;
        var3.field_a = (cda[]) (Object) sqb.a((tv[]) (Object) var3.field_a, (tv[]) (Object) var3.field_a, 1, mjb.field_c, false);
    }

    private final void a(byte param0) {
        ((fba) this).field_a = new cda[1023];
        if (param0 != -10) {
            ((fba) this).field_a = null;
        }
    }

    private final void a(int param0) {
        fha.field_p = fha.field_p + 1;
        ((fba) this).field_b = fha.field_p;
        if (param0 != -15536) {
            ((fba) this).field_b = -3;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        cda var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (param0 <= -61) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((fba) this).field_a.length) {
              return;
            } else {
              var5 = ((fba) this).field_a[var4];
              if (var5 != null) {
                var5.a(param2, param1, (byte) -21);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int[] param3) {
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
        var15 = VoidHunters.field_G;
        if (-1 < (param1 ^ -1)) {
          return;
        } else {
          L0: {
            var5 = this.c(ah.field_o[0], -78);
            var6 = this.c(ah.field_o[1], param0 + -43);
            var7 = this.a(ah.field_o[2], (byte) 19);
            var8 = this.a(ah.field_o[3], (byte) 19);
            var9 = this.c(param3[0], -81);
            var10 = this.c(param3[param0], -110);
            var11 = this.a(param3[2], (byte) 19);
            var12 = this.a(param3[3], (byte) 19);
            if (var5 != var9) {
              break L0;
            } else {
              if (var6 != var10) {
                break L0;
              } else {
                if (var11 != var7) {
                  break L0;
                } else {
                  if (var12 == var8) {
                    return;
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          var13 = var5;
          L1: while (true) {
            if (var9 <= var13) {
              var13 = var10 - -1;
              L2: while (true) {
                if (var13 > var6) {
                  var13 = var7;
                  L3: while (true) {
                    if (var13 >= var11) {
                      var13 = var12 - -1;
                      L4: while (true) {
                        if (var13 > var8) {
                          var13 = var9;
                          L5: while (true) {
                            if (var5 <= var13) {
                              var13 = var6 - -1;
                              L6: while (true) {
                                if (var13 > var10) {
                                  var13 = var11;
                                  L7: while (true) {
                                    if (var7 <= var13) {
                                      var13 = 1 + var8;
                                      L8: while (true) {
                                        if (var13 > var12) {
                                          this.a(-15536);
                                          return;
                                        } else {
                                          var14 = var9;
                                          L9: while (true) {
                                            if (var14 > var10) {
                                              var13++;
                                              continue L8;
                                            } else {
                                              this.a(true, var13, param2, param1, var14);
                                              var14++;
                                              continue L9;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var14 = var9;
                                      L10: while (true) {
                                        if (var10 < var14) {
                                          var13++;
                                          continue L7;
                                        } else {
                                          this.a(true, var13, param2, param1, var14);
                                          var14++;
                                          continue L10;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var14 = var11;
                                  L11: while (true) {
                                    if (var14 > var12) {
                                      var13++;
                                      continue L6;
                                    } else {
                                      this.a(true, var14, param2, param1, var13);
                                      var14++;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                            } else {
                              var14 = var11;
                              L12: while (true) {
                                if (var14 > var12) {
                                  var13++;
                                  continue L5;
                                } else {
                                  this.a(true, var14, param2, param1, var13);
                                  var14++;
                                  continue L12;
                                }
                              }
                            }
                          }
                        } else {
                          var14 = var5;
                          L13: while (true) {
                            if (var14 > var6) {
                              var13++;
                              continue L4;
                            } else {
                              this.a(var14, var13, param1, 2, param2);
                              var14++;
                              continue L13;
                            }
                          }
                        }
                      }
                    } else {
                      var14 = var5;
                      L14: while (true) {
                        if (var6 < var14) {
                          var13++;
                          continue L3;
                        } else {
                          this.a(var14, var13, param1, 2, param2);
                          var14++;
                          continue L14;
                        }
                      }
                    }
                  }
                } else {
                  var14 = var7;
                  L15: while (true) {
                    if (var8 < var14) {
                      var13++;
                      continue L2;
                    } else {
                      this.a(var13, var14, param1, 2, param2);
                      var14++;
                      continue L15;
                    }
                  }
                }
              }
            } else {
              var14 = var7;
              L16: while (true) {
                if (var8 < var14) {
                  var13++;
                  continue L1;
                } else {
                  this.a(var13, var14, param1, 2, param2);
                  var14++;
                  continue L16;
                }
              }
            }
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        ((fba) this).field_a = (cda[]) (Object) kcb.a(10, mjb.field_c, param0, 1, -102, (tv[]) (Object) ((fba) this).field_a);
    }

    private final int a(int param0, byte param1) {
        if (param1 != 19) {
            int discarded$0 = this.a(-36, 62, -65, -108);
        }
        if (!(0 <= param0)) {
            param0 = param0 - 65536;
        }
        return param0 / 65536;
    }

    fba() {
        ((fba) this).field_b = 0;
        this.a(-15536);
        this.a((byte) -10);
    }

    private final void a(int param0, jo param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        cda var10 = null;
        if (!(!param1.c(param2, 8))) {
            var5 = param1.field_h;
            var6 = param1.field_b;
            var7 = param1.field_f;
            var8 = this.a(var5, var6, 7, var7);
            var9 = var8 & ((fba) this).field_a.length - 1;
            var10 = ((fba) this).field_a[var9];
            if (var10 != null) {
                if (!(!var10.b(var7, param0 + -6776, var6, var5))) {
                    ((fba) this).field_a[var9] = null;
                }
            }
        }
        if (param0 != 1) {
            Object var12 = null;
            boolean discarded$0 = ((fba) this).a((byte) 36, (tv) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "No votes";
    }
}
