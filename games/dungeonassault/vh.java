/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends ne {
    wa field_j;
    byte[] field_i;

    final void b() {
        this.field_j = null;
    }

    final void a() {
        int[] var1 = null;
        int[] var2 = null;
        vm var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mk var14 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var20 = null;
        int[] var22 = null;
        if (this.field_j == null) {
          this.field_j = new wa(16);
          var20 = new int[16];
          var17 = var20;
          var1 = var17;
          var18 = new int[16];
          var15 = var18;
          var2 = var15;
          var22 = var1;
          var18[9] = 128;
          var22[9] = 128;
          var4 = new vm(this.field_i);
          var5 = var4.a();
          var6 = 0;
          L0: while (true) {
            if (var6 >= var5) {
              L1: while (true) {
                var6 = var4.b();
                var7 = var4.field_d[var6];
                L2: while (true) {
                  if (var4.field_d[var6] != var7) {
                    continue L1;
                  } else {
                    var4.d(var6);
                    var8 = var4.c(var6);
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
                              var1[var10] = (var20[var10] & -2080769) + (var12 << 14);
                              break L4;
                            }
                          }
                          if (var11 != 32) {
                            break L3;
                          } else {
                            var1[var10] = (var20[var10] & -16257) + (var12 << 7);
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
                          var2[var10] = var20[var10] + var11;
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
                              var13 = var18[var10];
                              var14 = (mk) ((Object) this.field_j.a((long)var13, 8));
                              if (var14 != null) {
                                break L7;
                              } else {
                                var14 = new mk(new byte[128]);
                                this.field_j.a(var14, 12460, (long)var13);
                                break L7;
                              }
                            }
                            var14.field_k[var11] = (byte) 1;
                            break L6;
                          }
                        }
                      }
                      var4.b(var6);
                      var4.a(var6);
                      continue L2;
                    } else {
                      var4.e();
                      var4.a(var6);
                      if (var4.f()) {
                        return;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
              }
            } else {
              var4.d(var6);
              var4.b(var6);
              var4.a(var6);
              var6++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static vh a(nh param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, param2, (byte) -122);
        if (var3 == null) {
            return null;
        }
        return new vh(new ec(var3));
    }

    private vh(ec param0) {
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
        ec var51 = null;
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
        ec stackIn_65_0 = null;
        ec stackIn_66_0 = null;
        ec stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_73_0 = 0;
        ec stackOut_64_0 = null;
        ec stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        ec stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        param0.field_o = param0.field_m.length - 3;
        var2 = param0.c(true);
        var3 = param0.k(0);
        var4 = 14 + var2 * 10;
        param0.field_o = 0;
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
            var13 = param0.field_o;
            var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
            var15 = 0;
            L1: while (true) {
              if (var15 >= var14) {
                var4 = var4 + (param0.field_o - var13);
                var15 = param0.field_o;
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
                      var30 = param0.field_o;
                      param0.field_o = param0.field_o + var26;
                      var31 = param0.field_o;
                      param0.field_o = param0.field_o + var11;
                      var32 = param0.field_o;
                      param0.field_o = param0.field_o + var10;
                      var33 = param0.field_o;
                      param0.field_o = param0.field_o + var9;
                      var34 = param0.field_o;
                      param0.field_o = param0.field_o + var16;
                      var35 = param0.field_o;
                      param0.field_o = param0.field_o + var18;
                      var36 = param0.field_o;
                      param0.field_o = param0.field_o + var20;
                      var37 = param0.field_o;
                      param0.field_o = param0.field_o + (var7 + var8 + var11);
                      var38 = param0.field_o;
                      param0.field_o = param0.field_o + var7;
                      var39 = param0.field_o;
                      param0.field_o = param0.field_o + var27;
                      var40 = param0.field_o;
                      param0.field_o = param0.field_o + var8;
                      var41 = param0.field_o;
                      param0.field_o = param0.field_o + var17;
                      var42 = param0.field_o;
                      param0.field_o = param0.field_o + var19;
                      var43 = param0.field_o;
                      param0.field_o = param0.field_o + var21;
                      var44 = param0.field_o;
                      param0.field_o = param0.field_o + var12;
                      var45 = param0.field_o;
                      param0.field_o = param0.field_o + var9;
                      var46 = param0.field_o;
                      param0.field_o = param0.field_o + var22;
                      var47 = param0.field_o;
                      param0.field_o = param0.field_o + var23;
                      var48 = param0.field_o;
                      param0.field_o = param0.field_o + var24;
                      var49 = param0.field_o;
                      param0.field_o = param0.field_o + var25;
                      var50 = param0.field_o;
                      param0.field_o = param0.field_o + var5 * 3;
                      this.field_i = new byte[var4];
                      var51 = new ec(this.field_i);
                      var51.a((byte) 63, 1297377380);
                      var51.a((byte) 63, 6);
                      stackOut_64_0 = (ec) (var51);
                      stackIn_66_0 = stackOut_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      if (var2 <= 1) {
                        stackOut_66_0 = (ec) ((Object) stackIn_66_0);
                        stackOut_66_1 = 0;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        break L3;
                      } else {
                        stackOut_65_0 = (ec) ((Object) stackIn_65_0);
                        stackOut_65_1 = 1;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        break L3;
                      }
                    }
                    ((ec) (Object) stackIn_67_0).i(stackIn_67_1, -117);
                    var51.i(var2, -90);
                    var51.i(var3, -125);
                    param0.field_o = var13;
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
                        var51.a((byte) 63, 1297379947);
                        var51.field_o = var51.field_o + 4;
                        var61 = var51.field_o;
                        var62 = -1;
                        L5: while (true) {
                          L6: {
                            var63 = param0.e(-651413500);
                            var51.e(-268435456, var63);
                            incrementValue$29 = var29;
                            var29++;
                            var64 = param0.field_m[incrementValue$29] & 255;
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
                                                var51.a(6, 192 + var52);
                                                break L7;
                                              }
                                            }
                                            incrementValue$30 = var44;
                                            var44++;
                                            var51.a(6, (int) param0.field_m[incrementValue$30]);
                                            continue L5;
                                          }
                                        } else {
                                          L8: {
                                            if (var65 == 0) {
                                              break L8;
                                            } else {
                                              var51.a(6, 160 + var52);
                                              break L8;
                                            }
                                          }
                                          incrementValue$31 = var37;
                                          var37++;
                                          var53 = var53 + param0.field_m[incrementValue$31];
                                          incrementValue$32 = var31;
                                          var31++;
                                          var58 = var58 + param0.field_m[incrementValue$32];
                                          var51.a(6, var53 & 127);
                                          var51.a(6, var58 & 127);
                                          continue L5;
                                        }
                                      } else {
                                        L9: {
                                          if (var65 == 0) {
                                            break L9;
                                          } else {
                                            var51.a(6, 208 + var52);
                                            break L9;
                                          }
                                        }
                                        incrementValue$33 = var32;
                                        var32++;
                                        var57 = var57 + param0.field_m[incrementValue$33];
                                        var51.a(6, var57 & 127);
                                        continue L5;
                                      }
                                    } else {
                                      L10: {
                                        if (var65 == 0) {
                                          break L10;
                                        } else {
                                          var51.a(6, 224 + var52);
                                          break L10;
                                        }
                                      }
                                      incrementValue$34 = var45;
                                      var45++;
                                      var56 = var56 + param0.field_m[incrementValue$34];
                                      incrementValue$35 = var33;
                                      var33++;
                                      var56 = var56 + (param0.field_m[incrementValue$35] << 7);
                                      var51.a(6, var56 & 127);
                                      var51.a(6, var56 >> 7 & 127);
                                      continue L5;
                                    }
                                  } else {
                                    L11: {
                                      if (var65 == 0) {
                                        break L11;
                                      } else {
                                        var51.a(6, 176 + var52);
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      L13: {
                                        incrementValue$36 = var15;
                                        var15++;
                                        var28 = var28 + param0.field_m[incrementValue$36] & 127;
                                        var51.a(6, var28);
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
                                                                            var66 = param0.field_m[incrementValue$37];
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
                                                                var66 = param0.field_m[incrementValue$38];
                                                                break L12;
                                                              } else {
                                                                incrementValue$39 = var49;
                                                                var49++;
                                                                var66 = param0.field_m[incrementValue$39];
                                                                break L12;
                                                              }
                                                            } else {
                                                              incrementValue$40 = var48;
                                                              var48++;
                                                              var66 = param0.field_m[incrementValue$40];
                                                              break L12;
                                                            }
                                                          } else {
                                                            incrementValue$41 = var47;
                                                            var47++;
                                                            var66 = param0.field_m[incrementValue$41];
                                                            break L12;
                                                          }
                                                        } else {
                                                          incrementValue$42 = var46;
                                                          var46++;
                                                          var66 = param0.field_m[incrementValue$42];
                                                          break L12;
                                                        }
                                                      } else {
                                                        incrementValue$43 = var43;
                                                        var43++;
                                                        var66 = param0.field_m[incrementValue$43];
                                                        break L12;
                                                      }
                                                    } else {
                                                      incrementValue$44 = var36;
                                                      var36++;
                                                      var66 = param0.field_m[incrementValue$44];
                                                      break L12;
                                                    }
                                                  } else {
                                                    incrementValue$45 = var42;
                                                    var42++;
                                                    var66 = param0.field_m[incrementValue$45];
                                                    break L12;
                                                  }
                                                } else {
                                                  incrementValue$46 = var35;
                                                  var35++;
                                                  var66 = param0.field_m[incrementValue$46];
                                                  break L12;
                                                }
                                              } else {
                                                incrementValue$47 = var41;
                                                var41++;
                                                var66 = param0.field_m[incrementValue$47];
                                                break L12;
                                              }
                                            } else {
                                              incrementValue$48 = var34;
                                              var34++;
                                              var66 = param0.field_m[incrementValue$48];
                                              break L12;
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      incrementValue$49 = var44;
                                      var44++;
                                      var66 = param0.field_m[incrementValue$49];
                                      break L12;
                                    }
                                    var66 = var66 + var70[var28];
                                    var70[var28] = var66;
                                    var51.a(6, var66 & 127);
                                    continue L5;
                                  }
                                } else {
                                  L15: {
                                    if (var65 == 0) {
                                      break L15;
                                    } else {
                                      var51.a(6, 128 + var52);
                                      break L15;
                                    }
                                  }
                                  incrementValue$50 = var37;
                                  var37++;
                                  var53 = var53 + param0.field_m[incrementValue$50];
                                  incrementValue$51 = var40;
                                  var40++;
                                  var55 = var55 + param0.field_m[incrementValue$51];
                                  var51.a(6, var53 & 127);
                                  var51.a(6, var55 & 127);
                                  continue L5;
                                }
                              } else {
                                L16: {
                                  if (var65 == 0) {
                                    break L16;
                                  } else {
                                    var51.a(6, 144 + var52);
                                    break L16;
                                  }
                                }
                                incrementValue$52 = var37;
                                var37++;
                                var53 = var53 + param0.field_m[incrementValue$52];
                                incrementValue$53 = var38;
                                var38++;
                                var54 = var54 + param0.field_m[incrementValue$53];
                                var51.a(6, var53 & 127);
                                var51.a(6, var54 & 127);
                                continue L5;
                              }
                            } else {
                              L17: {
                                if (var65 == 0) {
                                  break L17;
                                } else {
                                  var51.a(6, 255);
                                  break L17;
                                }
                              }
                              var51.a(6, 81);
                              var51.a(6, 3);
                              incrementValue$54 = var50;
                              var50++;
                              var51.a(6, (int) param0.field_m[incrementValue$54]);
                              incrementValue$55 = var50;
                              var50++;
                              var51.a(6, (int) param0.field_m[incrementValue$55]);
                              incrementValue$56 = var50;
                              var50++;
                              var51.a(6, (int) param0.field_m[incrementValue$56]);
                              continue L5;
                            }
                          } else {
                            L18: {
                              if (var65 == 0) {
                                break L18;
                              } else {
                                var51.a(6, 255);
                                break L18;
                              }
                            }
                            var51.a(6, 47);
                            var51.a(6, 0);
                            var51.d(1, var51.field_o - var61);
                            var60++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var28 = var28 + param0.c(true) & 127;
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
                discarded$57 = param0.e(-651413500);
                var15++;
                continue L1;
              }
            }
          } else {
            var14 = -1;
            L19: while (true) {
              L20: {
                var15 = param0.c(true);
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
