/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf extends o {
    kl field_k;
    byte[] field_j;

    final static pf a(um param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, 30045, param2);
        if (var3 == null) {
          return null;
        }
        return new pf(new p(var3));
    }

    final void a() {
        this.field_k = null;
    }

    final void b() {
        int[] var1;
        int[] var2;
        al var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        td var14;
        td var15;
        int[] var16;
        int[] var18;
        int[] var19;
        int[] var21;
        int[] var23;
        int var6Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        if (this.field_k != null) {
          return;
        }
        this.field_k = new kl(16);
        var21 = new int[16];
        var18 = var21;
        var1 = var18;
        var19 = new int[16];
        var16 = var19;
        var2 = var16;
        var23 = var1;
        var19[9] = 128;
        var23[9] = 128;
        var4 = new al(this.field_j);
        var5 = var4.c();
        for (var6 = 0; var6 < var5; var6++) {
          var4.d(var6);
          var4.c(var6);
          var4.b(var6);
        }
        while (true) {
          var6Lifetime1 = var4.f();
          var7 = var4.field_d[var6Lifetime1];
          while (true) {
            if (var4.field_d[var6Lifetime1] != var7) {
              break;
            }
            var4.d(var6Lifetime1);
            var8 = var4.a(var6Lifetime1);
            if (var8 == 1) {
              var4.a();
              var4.b(var6Lifetime1);
              if (var4.b()) {
                return;
              }
              break;
            }
            var9 = var8 & 240;
            if (var9 == 176) {
              var10 = var8 & 15;
              var11 = var8 >> 8 & 127;
              var12 = var8 >> 16 & 127;
              if (var11 == 0) {
                var1[var10] = (var21[var10] & -2080769) + (var12 << 14);
              }
              if (var11 == 32) {
                var1[var10] = (var21[var10] & -16257) + (var12 << 7);
              }
            }
            if (var9 == 192) {
              var10Lifetime1 = var8 & 15;
              var11Lifetime1 = var8 >> 8 & 127;
              var2[var10Lifetime1] = var21[var10Lifetime1] + var11Lifetime1;
            }
            if (var9 == 144) {
              var10Lifetime2 = var8 & 15;
              var11Lifetime2 = var8 >> 8 & 127;
              var12Lifetime1 = var8 >> 16 & 127;
              if (var12Lifetime1 > 0) {
                var13 = var19[var10Lifetime2];
                var14 = (td) (this.field_k.a(30, (long)var13));
                if (var14 == null) {
                  var15 = new td(new byte[128]);
                  var14 = var15;
                  this.field_k.a(48, (long)var13, var15);
                }
                var14.field_q[var11Lifetime2] = (byte) 1;
              }
            }
            var4.c(var6Lifetime1);
            var4.b(var6Lifetime1);
          }
        }
    }

    private pf(p param0) {
        int incrementValue$0 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$4 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$7 = 0;
        int incrementValue$19 = 0;
        int incrementValue$18 = 0;
        int incrementValue$17 = 0;
        int incrementValue$16 = 0;
        int incrementValue$15 = 0;
        int incrementValue$14 = 0;
        int incrementValue$13 = 0;
        int incrementValue$12 = 0;
        int incrementValue$11 = 0;
        int incrementValue$10 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$20 = 0;
        p stackIn_84_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_91_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        int var43;
        int var44;
        int var45;
        int var46;
        int var47;
        int var48;
        int var49;
        int var50;
        p var51;
        int var52;
        int var53;
        int var54;
        int var55;
        int var56;
        int var57;
        int var58;
        int var60;
        int var61;
        int var62;
        int var63;
        int var64;
        int var65;
        int var66;
        int[] var70;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var28Lifetime1;
        int var29Lifetime1;
        param0.field_l = param0.field_o.length - 3;
        var2 = param0.i(-93);
        var3 = param0.f(674914976);
        var4 = 14 + var2 * 10;
        param0.field_l = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        var10 = 0;
        var11 = 0;
        var12 = 0;
        var13 = 0;
        while (var13 < var2) {
          var14 = -1;
          while (true) {
            var15 = param0.i(-107);
            if (var15 != var14) {
              var4++;
            }
            var14 = var15 & 15;
            if (var15 == 7) {
              var13++;
              break;
            }
            if (var15 == 23) {
              var5++;
              continue;
            }
            if (var14 == 0) {
              var7++;
              continue;
            }
            if (var14 == 1) {
              var8++;
              continue;
            }
            if (var14 == 2) {
              var6++;
              continue;
            }
            if (var14 == 3) {
              var9++;
              continue;
            }
            if (var14 == 4) {
              var10++;
              continue;
            }
            if (var14 == 5) {
              var11++;
              continue;
            }
            if (var14 != 6) {
              throw new RuntimeException();
            }
            var12++;
          }
        }
        var4 = var4 + 5 * var5;
        var4 = var4 + 2 * (var7 + var8 + var6 + var9 + var11);
        var4 = var4 + (var10 + var12);
        var13Lifetime1 = param0.field_l;
        var14Lifetime1 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (var15Lifetime1 = 0; var15Lifetime1 < var14Lifetime1; var15Lifetime1++) {
          param0.c((byte) 95);
        }
        var4 = var4 + (param0.field_l - var13Lifetime1);
        var15Lifetime2 = param0.field_l;
        var16 = 0;
        var17 = 0;
        var18 = 0;
        var19 = 0;
        var20 = 0;
        var21 = 0;
        var22 = 0;
        var23 = 0;
        var24 = 0;
        var25 = 0;
        var26 = 0;
        var27 = 0;
        var28 = 0;
        for (var29 = 0; var29 < var6; var29++) {
          var28 = var28 + param0.i(-83) & 127;
          if (var28 != 0) {
            if (var28 != 32) {
              if (var28 != 1) {
                if (var28 != 33) {
                  if (var28 != 7) {
                    if (var28 != 39) {
                      if (var28 != 10) {
                        if (var28 != 42) {
                          if (var28 != 99) {
                            if (var28 != 98) {
                              if (var28 != 101) {
                                if (var28 != 100) {
                                  if (var28 != 64) {
                                    if (var28 != 65) {
                                      if (var28 != 120) {
                                        if (var28 != 121) {
                                          if (var28 != 123) {
                                            var27++;
                                          } else {
                                            var26++;
                                          }
                                        } else {
                                          var26++;
                                        }
                                      } else {
                                        var26++;
                                      }
                                    } else {
                                      var26++;
                                    }
                                  } else {
                                    var26++;
                                  }
                                } else {
                                  var25++;
                                }
                              } else {
                                var24++;
                              }
                            } else {
                              var23++;
                            }
                          } else {
                            var22++;
                          }
                        } else {
                          var21++;
                        }
                      } else {
                        var20++;
                      }
                    } else {
                      var19++;
                    }
                  } else {
                    var18++;
                  }
                } else {
                  var17++;
                }
              } else {
                var16++;
              }
            } else {
              var12++;
            }
          } else {
            var12++;
          }
        }
        var29Lifetime1 = 0;
        var30 = param0.field_l;
        param0.field_l = param0.field_l + var26;
        var31 = param0.field_l;
        param0.field_l = param0.field_l + var11;
        var32 = param0.field_l;
        param0.field_l = param0.field_l + var10;
        var33 = param0.field_l;
        param0.field_l = param0.field_l + var9;
        var34 = param0.field_l;
        param0.field_l = param0.field_l + var16;
        var35 = param0.field_l;
        param0.field_l = param0.field_l + var18;
        var36 = param0.field_l;
        param0.field_l = param0.field_l + var20;
        var37 = param0.field_l;
        param0.field_l = param0.field_l + (var7 + var8 + var11);
        var38 = param0.field_l;
        param0.field_l = param0.field_l + var7;
        var39 = param0.field_l;
        param0.field_l = param0.field_l + var27;
        var40 = param0.field_l;
        param0.field_l = param0.field_l + var8;
        var41 = param0.field_l;
        param0.field_l = param0.field_l + var17;
        var42 = param0.field_l;
        param0.field_l = param0.field_l + var19;
        var43 = param0.field_l;
        param0.field_l = param0.field_l + var21;
        var44 = param0.field_l;
        param0.field_l = param0.field_l + var12;
        var45 = param0.field_l;
        param0.field_l = param0.field_l + var9;
        var46 = param0.field_l;
        param0.field_l = param0.field_l + var22;
        var47 = param0.field_l;
        param0.field_l = param0.field_l + var23;
        var48 = param0.field_l;
        param0.field_l = param0.field_l + var24;
        var49 = param0.field_l;
        param0.field_l = param0.field_l + var25;
        var50 = param0.field_l;
        param0.field_l = param0.field_l + var5 * 3;
        this.field_j = new byte[var4];
        var51 = new p(this.field_j);
        var51.d(1297377380, (byte) -81);
        var51.d(6, (byte) -81);
        stackIn_84_0 = var51;
        if (var2 <= 1) {
          stackIn_85_1 = 0;
        } else {
          stackIn_85_1 = 1;
        }
        ((p) (Object) stackIn_84_0).b(stackIn_85_1, 100);
        var51.b(var2, 97);
        var51.b(var3, 109);
        param0.field_l = var13Lifetime1;
        var52 = 0;
        var53 = 0;
        var54 = 0;
        var55 = 0;
        var56 = 0;
        var57 = 0;
        var58 = 0;
        var70 = new int[128];
        var28Lifetime1 = 0;
        var60 = 0;
        while (true) {
          if (var60 >= var2) {
            return;
          }
          var51.d(1297379947, (byte) -81);
          var51.field_l = var51.field_l + 4;
          var61 = var51.field_l;
          var62 = -1;
          while (true) {
            var63 = param0.c((byte) 78);
            var51.a(false, var63);
            incrementValue$0 = var29Lifetime1;
            var29Lifetime1++;
            var64 = param0.field_o[incrementValue$0] & 255;
            stackIn_91_0 = (var64 == var62) ? 0 : 1;
            var65 = stackIn_91_0;
            var62 = var64 & 15;
            if (var64 == 7) {
              if (var65 != 0) {
                var51.c(255, (byte) 56);
              }
              var51.c(47, (byte) 72);
              var51.c(0, (byte) 114);
              var51.a(var51.field_l - var61, (byte) -62);
              var60++;
              break;
            }
            if (var64 == 23) {
              if (var65 != 0) {
                var51.c(255, (byte) -120);
              }
              var51.c(81, (byte) 83);
              var51.c(3, (byte) 96);
              incrementValue$25 = var50;
              var50++;
              var51.c((int) param0.field_o[incrementValue$25], (byte) 106);
              incrementValue$26 = var50;
              var50++;
              var51.c((int) param0.field_o[incrementValue$26], (byte) 88);
              incrementValue$27 = var50;
              var50++;
              var51.c((int) param0.field_o[incrementValue$27], (byte) -67);
              continue;
            }
            var52 = var52 ^ var64 >> 4;
            if (var62 == 0) {
              if (var65 != 0) {
                var51.c(144 + var52, (byte) -81);
              }
              incrementValue$23 = var37;
              var37++;
              var53 = var53 + param0.field_o[incrementValue$23];
              incrementValue$24 = var38;
              var38++;
              var54 = var54 + param0.field_o[incrementValue$24];
              var51.c(var53 & 127, (byte) 71);
              var51.c(var54 & 127, (byte) -76);
              continue;
            }
            if (var62 == 1) {
              if (var65 != 0) {
                var51.c(128 + var52, (byte) 65);
              }
              incrementValue$21 = var37;
              var37++;
              var53 = var53 + param0.field_o[incrementValue$21];
              incrementValue$22 = var40;
              var40++;
              var55 = var55 + param0.field_o[incrementValue$22];
              var51.c(var53 & 127, (byte) 79);
              var51.c(var55 & 127, (byte) 86);
              continue;
            }
            if (var62 != 2) {
              if (var62 == 3) {
                if (var65 != 0) {
                  var51.c(224 + var52, (byte) -84);
                }
                incrementValue$5 = var45;
                var45++;
                var56 = var56 + param0.field_o[incrementValue$5];
                incrementValue$6 = var33;
                var33++;
                var56 = var56 + (param0.field_o[incrementValue$6] << 7);
                var51.c(var56 & 127, (byte) -76);
                var51.c(var56 >> 7 & 127, (byte) -91);
                continue;
              }
              if (var62 == 4) {
                if (var65 != 0) {
                  var51.c(208 + var52, (byte) -95);
                }
                incrementValue$4 = var32;
                var32++;
                var57 = var57 + param0.field_o[incrementValue$4];
                var51.c(var57 & 127, (byte) 89);
                continue;
              }
              if (var62 != 5) {
                if (var62 != 6) {
                  throw new RuntimeException();
                }
                if (var65 != 0) {
                  var51.c(192 + var52, (byte) -76);
                }
                incrementValue$1 = var44;
                var44++;
                var51.c((int) param0.field_o[incrementValue$1], (byte) 125);
                continue;
              }
              if (var65 != 0) {
                var51.c(160 + var52, (byte) 106);
              }
              incrementValue$2 = var37;
              var37++;
              var53 = var53 + param0.field_o[incrementValue$2];
              incrementValue$3 = var31;
              var31++;
              var58 = var58 + param0.field_o[incrementValue$3];
              var51.c(var53 & 127, (byte) -95);
              var51.c(var58 & 127, (byte) 120);
              continue;
            }
            if (var65 != 0) {
              var51.c(176 + var52, (byte) -66);
            }
            incrementValue$7 = var15Lifetime2;
            var15Lifetime2++;
            var28Lifetime1 = var28Lifetime1 + param0.field_o[incrementValue$7] & 127;
            var51.c(var28Lifetime1, (byte) -68);
            if (var28Lifetime1 != 0 &&
              var28Lifetime1 != 32) {
              if (var28Lifetime1 == 1) {
                incrementValue$19 = var34;
                var34++;
                var66 = param0.field_o[incrementValue$19];
              } else if (var28Lifetime1 == 33) {
                incrementValue$18 = var41;
                var41++;
                var66 = param0.field_o[incrementValue$18];
              } else if (var28Lifetime1 == 7) {
                incrementValue$17 = var35;
                var35++;
                var66 = param0.field_o[incrementValue$17];
              } else if (var28Lifetime1 == 39) {
                incrementValue$16 = var42;
                var42++;
                var66 = param0.field_o[incrementValue$16];
              } else if (var28Lifetime1 == 10) {
                incrementValue$15 = var36;
                var36++;
                var66 = param0.field_o[incrementValue$15];
              } else if (var28Lifetime1 == 42) {
                incrementValue$14 = var43;
                var43++;
                var66 = param0.field_o[incrementValue$14];
              } else if (var28Lifetime1 == 99) {
                incrementValue$13 = var46;
                var46++;
                var66 = param0.field_o[incrementValue$13];
              } else if (var28Lifetime1 == 98) {
                incrementValue$12 = var47;
                var47++;
                var66 = param0.field_o[incrementValue$12];
              } else if (var28Lifetime1 == 101) {
                incrementValue$11 = var48;
                var48++;
                var66 = param0.field_o[incrementValue$11];
              } else if (var28Lifetime1 == 100) {
                incrementValue$10 = var49;
                var49++;
                var66 = param0.field_o[incrementValue$10];
              } else if (var28Lifetime1 != 64 &&
                var28Lifetime1 != 65 &&
                var28Lifetime1 != 120 &&
                var28Lifetime1 != 121 &&
                var28Lifetime1 != 123) {
                incrementValue$8 = var39;
                var39++;
                var66 = param0.field_o[incrementValue$8];
              } else {
                incrementValue$9 = var30;
                var30++;
                var66 = param0.field_o[incrementValue$9];
              }
            } else {
              incrementValue$20 = var44;
              var44++;
              var66 = param0.field_o[incrementValue$20];
            }
            var66 = var66 + var70[var28Lifetime1];
            var70[var28Lifetime1] = var66;
            var51.c(var66 & 127, (byte) -103);
          }
        }
    }
}
