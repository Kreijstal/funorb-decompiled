/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qua extends vg {
    byte[] field_g;
    ji field_f;

    final void b() {
        int[] var1 = null;
        int[] var2 = null;
        maa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        jk var14 = null;
        jk var15 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var21 = null;
        int[] var23 = null;
        if (this.field_f == null) {
          this.field_f = new ji(16);
          var21 = new int[16];
          var18 = var21;
          var1 = var18;
          var19 = new int[16];
          var16 = var19;
          var2 = var16;
          var23 = var1;
          var19[9] = 128;
          var23[9] = 128;
          var4 = new maa(this.field_g);
          var5 = var4.c();
          var6 = 0;
          L0: while (true) {
            if (var6 >= var5) {
              L1: while (true) {
                var6 = var4.f();
                var7 = var4.field_a[var6];
                L2: while (true) {
                  if (var4.field_a[var6] != var7) {
                    continue L1;
                  } else {
                    var4.e(var6);
                    var8 = var4.b(var6);
                    if (var8 != 1) {
                      L3: {
                        var9 = var8 & 240;
                        if (var9 != 176) {
                          break L3;
                        } else {
                          L4: {
                            var10 = var8 & 15;
                            var11 = var8 >> 8 & 127;
                            var12 = var8 >> 16 & 127;
                            if (var11 != 0) {
                              break L4;
                            } else {
                              var1[var10] = (var21[var10] & -2080769) + (var12 << 14);
                              break L4;
                            }
                          }
                          if (var11 != 32) {
                            break L3;
                          } else {
                            var1[var10] = (var21[var10] & -16257) + (var12 << 7);
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (var9 != 192) {
                          break L5;
                        } else {
                          var10 = var8 & 15;
                          var11 = var8 >> 8 & 127;
                          var2[var10] = var21[var10] + var11;
                          break L5;
                        }
                      }
                      L6: {
                        if (var9 != 144) {
                          break L6;
                        } else {
                          var10 = var8 & 15;
                          var11 = var8 >> 8 & 127;
                          var12 = var8 >> 16 & 127;
                          if (var12 <= 0) {
                            break L6;
                          } else {
                            L7: {
                              var13 = var19[var10];
                              var14 = (jk) ((Object) this.field_f.a((byte) -113, (long)var13));
                              if (var14 != null) {
                                break L7;
                              } else {
                                var15 = new jk(new byte[128]);
                                var14 = var15;
                                this.field_f.a((long)var13, 118, var15);
                                break L7;
                              }
                            }
                            var14.field_f[var11] = (byte) 1;
                            break L6;
                          }
                        }
                      }
                      var4.c(var6);
                      var4.f(var6);
                      continue L2;
                    } else {
                      var4.e();
                      var4.f(var6);
                      if (var4.d()) {
                        return;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
              }
            } else {
              var4.e(var6);
              var4.c(var6);
              var4.f(var6);
              var6++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void a() {
        this.field_f = null;
    }

    final static qua a(cn param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, (byte) 114, param2);
        if (var3 == null) {
            return null;
        }
        return new qua(new uia(var3));
    }

    private qua(uia param0) {
        int incrementValue$29 = 0;
        int incrementValue$30 = 0;
        int incrementValue$31 = 0;
        int incrementValue$32 = 0;
        int incrementValue$33 = 0;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
        int incrementValue$36 = 0;
        int incrementValue$37 = 0;
        int incrementValue$38 = 0;
        int incrementValue$39 = 0;
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int incrementValue$54 = 0;
        int incrementValue$55 = 0;
        int incrementValue$56 = 0;
        int discarded$57 = 0;
        int var2 = 0;
        int var3 = 0;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
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
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        uia var51 = null;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        int[] var70 = null;
        uia stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        uia stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        uia stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_73_0 = 0;
        uia stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        uia stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        uia stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        param0.field_h = param0.field_g.length - 3;
        var2 = param0.h(255);
        var3 = param0.d(124);
        var4 = 14 + var2 * 10;
        param0.field_h = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        var10 = 0;
        var11 = 0;
        var12 = 0;
        var13 = 0;
        L0: while (true) {
          if (var13 >= var2) {
            var4 = var4 + 5 * var5;
            var4 = var4 + 2 * (var7 + var8 + var6 + var9 + var11);
            var4 = var4 + (var10 + var12);
            var13 = param0.field_h;
            var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
            var15 = 0;
            L1: while (true) {
              if (var15 >= var14) {
                var4 = var4 + (param0.field_h - var13);
                var15 = param0.field_h;
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
                var29 = 0;
                L2: while (true) {
                  if (var29 >= var6) {
                    L3: {
                      var29 = 0;
                      var30 = param0.field_h;
                      param0.field_h = param0.field_h + var26;
                      var31 = param0.field_h;
                      param0.field_h = param0.field_h + var11;
                      var32 = param0.field_h;
                      param0.field_h = param0.field_h + var10;
                      var33 = param0.field_h;
                      param0.field_h = param0.field_h + var9;
                      var34 = param0.field_h;
                      param0.field_h = param0.field_h + var16;
                      var35 = param0.field_h;
                      param0.field_h = param0.field_h + var18;
                      var36 = param0.field_h;
                      param0.field_h = param0.field_h + var20;
                      var37 = param0.field_h;
                      param0.field_h = param0.field_h + (var7 + var8 + var11);
                      var38 = param0.field_h;
                      param0.field_h = param0.field_h + var7;
                      var39 = param0.field_h;
                      param0.field_h = param0.field_h + var27;
                      var40 = param0.field_h;
                      param0.field_h = param0.field_h + var8;
                      var41 = param0.field_h;
                      param0.field_h = param0.field_h + var17;
                      var42 = param0.field_h;
                      param0.field_h = param0.field_h + var19;
                      var43 = param0.field_h;
                      param0.field_h = param0.field_h + var21;
                      var44 = param0.field_h;
                      param0.field_h = param0.field_h + var12;
                      var45 = param0.field_h;
                      param0.field_h = param0.field_h + var9;
                      var46 = param0.field_h;
                      param0.field_h = param0.field_h + var22;
                      var47 = param0.field_h;
                      param0.field_h = param0.field_h + var23;
                      var48 = param0.field_h;
                      param0.field_h = param0.field_h + var24;
                      var49 = param0.field_h;
                      param0.field_h = param0.field_h + var25;
                      var50 = param0.field_h;
                      param0.field_h = param0.field_h + var5 * 3;
                      this.field_g = new byte[var4];
                      var51 = new uia(this.field_g);
                      var51.a(1297377380, (byte) 100);
                      var51.a(6, (byte) -126);
                      stackOut_64_0 = (uia) (var51);
                      stackOut_64_1 = -1477662136;
                      stackIn_66_0 = stackOut_64_0;
                      stackIn_66_1 = stackOut_64_1;
                      stackIn_65_0 = stackOut_64_0;
                      stackIn_65_1 = stackOut_64_1;
                      if (var2 <= 1) {
                        stackOut_66_0 = (uia) ((Object) stackIn_66_0);
                        stackOut_66_1 = stackIn_66_1;
                        stackOut_66_2 = 0;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        stackIn_67_2 = stackOut_66_2;
                        break L3;
                      } else {
                        stackOut_65_0 = (uia) ((Object) stackIn_65_0);
                        stackOut_65_1 = stackIn_65_1;
                        stackOut_65_2 = 1;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        stackIn_67_2 = stackOut_65_2;
                        break L3;
                      }
                    }
                    ((uia) (Object) stackIn_67_0).f(stackIn_67_1, stackIn_67_2);
                    var51.f(-1477662136, var2);
                    var51.f(-1477662136, var3);
                    param0.field_h = var13;
                    var52 = 0;
                    var53 = 0;
                    var54 = 0;
                    var55 = 0;
                    var56 = 0;
                    var57 = 0;
                    var58 = 0;
                    var70 = new int[128];
                    var28 = 0;
                    var60 = 0;
                    L4: while (true) {
                      if (var60 >= var2) {
                        return;
                      } else {
                        var51.a(1297379947, (byte) -78);
                        var51.field_h = var51.field_h + 4;
                        var61 = var51.field_h;
                        var62 = -1;
                        L5: while (true) {
                          L6: {
                            var63 = param0.b((byte) 102);
                            var51.c(var63, -110);
                            incrementValue$29 = var29;
                            var29++;
                            var64 = param0.field_g[incrementValue$29] & 255;
                            if (var64 == var62) {
                              stackOut_72_0 = 0;
                              stackIn_73_0 = stackOut_72_0;
                              break L6;
                            } else {
                              stackOut_71_0 = 1;
                              stackIn_73_0 = stackOut_71_0;
                              break L6;
                            }
                          }
                          var65 = stackIn_73_0;
                          var62 = var64 & 15;
                          if (var64 != 7) {
                            if (var64 != 23) {
                              var52 = var52 ^ var64 >> 4;
                              if (var62 != 0) {
                                if (var62 != 1) {
                                  if (var62 != 2) {
                                    if (var62 != 3) {
                                      if (var62 != 4) {
                                        if (var62 != 5) {
                                          if (var62 != 6) {
                                            throw new RuntimeException();
                                          } else {
                                            L7: {
                                              if (var65 == 0) {
                                                break L7;
                                              } else {
                                                var51.i(192 + var52, 0);
                                                break L7;
                                              }
                                            }
                                            incrementValue$30 = var44;
                                            var44++;
                                            var51.i((int) param0.field_g[incrementValue$30], 0);
                                            continue L5;
                                          }
                                        } else {
                                          L8: {
                                            if (var65 == 0) {
                                              break L8;
                                            } else {
                                              var51.i(160 + var52, 0);
                                              break L8;
                                            }
                                          }
                                          incrementValue$31 = var37;
                                          var37++;
                                          var53 = var53 + param0.field_g[incrementValue$31];
                                          incrementValue$32 = var31;
                                          var31++;
                                          var58 = var58 + param0.field_g[incrementValue$32];
                                          var51.i(var53 & 127, 0);
                                          var51.i(var58 & 127, 0);
                                          continue L5;
                                        }
                                      } else {
                                        L9: {
                                          if (var65 == 0) {
                                            break L9;
                                          } else {
                                            var51.i(208 + var52, 0);
                                            break L9;
                                          }
                                        }
                                        incrementValue$33 = var32;
                                        var32++;
                                        var57 = var57 + param0.field_g[incrementValue$33];
                                        var51.i(var57 & 127, 0);
                                        continue L5;
                                      }
                                    } else {
                                      L10: {
                                        if (var65 == 0) {
                                          break L10;
                                        } else {
                                          var51.i(224 + var52, 0);
                                          break L10;
                                        }
                                      }
                                      incrementValue$34 = var45;
                                      var45++;
                                      var56 = var56 + param0.field_g[incrementValue$34];
                                      incrementValue$35 = var33;
                                      var33++;
                                      var56 = var56 + (param0.field_g[incrementValue$35] << 7);
                                      var51.i(var56 & 127, 0);
                                      var51.i(var56 >> 7 & 127, 0);
                                      continue L5;
                                    }
                                  } else {
                                    L11: {
                                      if (var65 == 0) {
                                        break L11;
                                      } else {
                                        var51.i(176 + var52, 0);
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      L13: {
                                        incrementValue$36 = var15;
                                        var15++;
                                        var28 = var28 + param0.field_g[incrementValue$36] & 127;
                                        var51.i(var28, 0);
                                        if (var28 == 0) {
                                          break L13;
                                        } else {
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
                                                                L14: {
                                                                  if (var28 == 64) {
                                                                    break L14;
                                                                  } else {
                                                                    if (var28 == 65) {
                                                                      break L14;
                                                                    } else {
                                                                      if (var28 == 120) {
                                                                        break L14;
                                                                      } else {
                                                                        if (var28 == 121) {
                                                                          break L14;
                                                                        } else {
                                                                          if (var28 != 123) {
                                                                            incrementValue$37 = var39;
                                                                            var39++;
                                                                            var66 = param0.field_g[incrementValue$37];
                                                                            break L12;
                                                                          } else {
                                                                            break L14;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                incrementValue$38 = var30;
                                                                var30++;
                                                                var66 = param0.field_g[incrementValue$38];
                                                                break L12;
                                                              } else {
                                                                incrementValue$39 = var49;
                                                                var49++;
                                                                var66 = param0.field_g[incrementValue$39];
                                                                break L12;
                                                              }
                                                            } else {
                                                              incrementValue$40 = var48;
                                                              var48++;
                                                              var66 = param0.field_g[incrementValue$40];
                                                              break L12;
                                                            }
                                                          } else {
                                                            incrementValue$41 = var47;
                                                            var47++;
                                                            var66 = param0.field_g[incrementValue$41];
                                                            break L12;
                                                          }
                                                        } else {
                                                          incrementValue$42 = var46;
                                                          var46++;
                                                          var66 = param0.field_g[incrementValue$42];
                                                          break L12;
                                                        }
                                                      } else {
                                                        incrementValue$43 = var43;
                                                        var43++;
                                                        var66 = param0.field_g[incrementValue$43];
                                                        break L12;
                                                      }
                                                    } else {
                                                      incrementValue$44 = var36;
                                                      var36++;
                                                      var66 = param0.field_g[incrementValue$44];
                                                      break L12;
                                                    }
                                                  } else {
                                                    incrementValue$45 = var42;
                                                    var42++;
                                                    var66 = param0.field_g[incrementValue$45];
                                                    break L12;
                                                  }
                                                } else {
                                                  incrementValue$46 = var35;
                                                  var35++;
                                                  var66 = param0.field_g[incrementValue$46];
                                                  break L12;
                                                }
                                              } else {
                                                incrementValue$47 = var41;
                                                var41++;
                                                var66 = param0.field_g[incrementValue$47];
                                                break L12;
                                              }
                                            } else {
                                              incrementValue$48 = var34;
                                              var34++;
                                              var66 = param0.field_g[incrementValue$48];
                                              break L12;
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      incrementValue$49 = var44;
                                      var44++;
                                      var66 = param0.field_g[incrementValue$49];
                                      break L12;
                                    }
                                    var66 = var66 + var70[var28];
                                    var70[var28] = var66;
                                    var51.i(var66 & 127, 0);
                                    continue L5;
                                  }
                                } else {
                                  L15: {
                                    if (var65 == 0) {
                                      break L15;
                                    } else {
                                      var51.i(128 + var52, 0);
                                      break L15;
                                    }
                                  }
                                  incrementValue$50 = var37;
                                  var37++;
                                  var53 = var53 + param0.field_g[incrementValue$50];
                                  incrementValue$51 = var40;
                                  var40++;
                                  var55 = var55 + param0.field_g[incrementValue$51];
                                  var51.i(var53 & 127, 0);
                                  var51.i(var55 & 127, 0);
                                  continue L5;
                                }
                              } else {
                                L16: {
                                  if (var65 == 0) {
                                    break L16;
                                  } else {
                                    var51.i(144 + var52, 0);
                                    break L16;
                                  }
                                }
                                incrementValue$52 = var37;
                                var37++;
                                var53 = var53 + param0.field_g[incrementValue$52];
                                incrementValue$53 = var38;
                                var38++;
                                var54 = var54 + param0.field_g[incrementValue$53];
                                var51.i(var53 & 127, 0);
                                var51.i(var54 & 127, 0);
                                continue L5;
                              }
                            } else {
                              L17: {
                                if (var65 == 0) {
                                  break L17;
                                } else {
                                  var51.i(255, 0);
                                  break L17;
                                }
                              }
                              var51.i(81, 0);
                              var51.i(3, 0);
                              incrementValue$54 = var50;
                              var50++;
                              var51.i((int) param0.field_g[incrementValue$54], 0);
                              incrementValue$55 = var50;
                              var50++;
                              var51.i((int) param0.field_g[incrementValue$55], 0);
                              incrementValue$56 = var50;
                              var50++;
                              var51.i((int) param0.field_g[incrementValue$56], 0);
                              continue L5;
                            }
                          } else {
                            L18: {
                              if (var65 == 0) {
                                break L18;
                              } else {
                                var51.i(255, 0);
                                break L18;
                              }
                            }
                            var51.i(47, 0);
                            var51.i(0, 0);
                            var51.a(var51.field_h - var61, 22726);
                            var60++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var28 = var28 + param0.h(255) & 127;
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
                                                      var29++;
                                                      continue L2;
                                                    } else {
                                                      var26++;
                                                      var29++;
                                                      continue L2;
                                                    }
                                                  } else {
                                                    var26++;
                                                    var29++;
                                                    continue L2;
                                                  }
                                                } else {
                                                  var26++;
                                                  var29++;
                                                  continue L2;
                                                }
                                              } else {
                                                var26++;
                                                var29++;
                                                continue L2;
                                              }
                                            } else {
                                              var26++;
                                              var29++;
                                              continue L2;
                                            }
                                          } else {
                                            var25++;
                                            var29++;
                                            continue L2;
                                          }
                                        } else {
                                          var24++;
                                          var29++;
                                          continue L2;
                                        }
                                      } else {
                                        var23++;
                                        var29++;
                                        continue L2;
                                      }
                                    } else {
                                      var22++;
                                      var29++;
                                      continue L2;
                                    }
                                  } else {
                                    var21++;
                                    var29++;
                                    continue L2;
                                  }
                                } else {
                                  var20++;
                                  var29++;
                                  continue L2;
                                }
                              } else {
                                var19++;
                                var29++;
                                continue L2;
                              }
                            } else {
                              var18++;
                              var29++;
                              continue L2;
                            }
                          } else {
                            var17++;
                            var29++;
                            continue L2;
                          }
                        } else {
                          var16++;
                          var29++;
                          continue L2;
                        }
                      } else {
                        var12++;
                        var29++;
                        continue L2;
                      }
                    } else {
                      var12++;
                      var29++;
                      continue L2;
                    }
                  }
                }
              } else {
                discarded$57 = param0.b((byte) 9);
                var15++;
                continue L1;
              }
            }
          } else {
            var14 = -1;
            L19: while (true) {
              L20: {
                var15 = param0.h(255);
                if (var15 == var14) {
                  break L20;
                } else {
                  var4++;
                  break L20;
                }
              }
              var14 = var15 & 15;
              if (var15 == 7) {
                var13++;
                continue L0;
              } else {
                if (var15 != 23) {
                  if (var14 != 0) {
                    if (var14 != 1) {
                      if (var14 != 2) {
                        if (var14 != 3) {
                          if (var14 != 4) {
                            if (var14 != 5) {
                              if (var14 != 6) {
                                throw new RuntimeException();
                              } else {
                                var12++;
                                continue L19;
                              }
                            } else {
                              var11++;
                              continue L19;
                            }
                          } else {
                            var10++;
                            continue L19;
                          }
                        } else {
                          var9++;
                          continue L19;
                        }
                      } else {
                        var6++;
                        continue L19;
                      }
                    } else {
                      var8++;
                      continue L19;
                    }
                  } else {
                    var7++;
                    continue L19;
                  }
                } else {
                  var5++;
                  continue L19;
                }
              }
            }
          }
        }
    }
}
