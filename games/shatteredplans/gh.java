/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends oh {
    byte[] field_h;
    ti field_i;

    final static gh a(bc param0, String param1, String param2) {
        byte[] var3 = param0.a(true, param2, param1);
        if (var3 == null) {
            return null;
        }
        return new gh(new ob(var3));
    }

    final void a() {
        int[] var1 = null;
        int[] var2 = null;
        pi var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        be var14 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        if (((gh) this).field_i == null) {
          ((gh) this).field_i = new ti(16);
          var26 = new int[16];
          var23 = var26;
          var20 = var23;
          var17 = var20;
          var1 = var17;
          var24 = new int[16];
          var21 = var24;
          var18 = var21;
          var15 = var18;
          var2 = var15;
          var25 = var1;
          var24[9] = 128;
          var25[9] = 128;
          var4 = new pi(((gh) this).field_h);
          var5 = var4.c();
          var6 = 0;
          L0: while (true) {
            if (var6 >= var5) {
              L1: while (true) {
                var6 = var4.g();
                var7 = var4.field_b[var6];
                L2: while (true) {
                  if (var4.field_b[var6] != var7) {
                    continue L1;
                  } else {
                    var4.b(var6);
                    var8 = var4.a(var6);
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
                              var1[var10] = (var26[var10] & -2080769) + (var12 << 14);
                              break L4;
                            }
                          }
                          if (var11 != 32) {
                            break L3;
                          } else {
                            var1[var10] = (var26[var10] & -16257) + (var12 << 7);
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
                          var2[var10] = var26[var10] + var11;
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
                              var13 = var24[var10];
                              var14 = (be) (Object) ((gh) this).field_i.a((long)var13, -25064);
                              if (var14 != null) {
                                break L7;
                              } else {
                                var14 = new be(new byte[128]);
                                ((gh) this).field_i.a((oh) (Object) var14, 89, (long)var13);
                                break L7;
                              }
                            }
                            var14.field_j[var11] = (byte) 1;
                            break L6;
                          }
                        }
                      }
                      var4.d(var6);
                      var4.e(var6);
                      continue L2;
                    } else {
                      var4.e();
                      var4.e(var6);
                      if (var4.a()) {
                        return;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
              }
            } else {
              var4.b(var6);
              var4.d(var6);
              var4.e(var6);
              var6++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void b() {
        ((gh) this).field_i = null;
    }

    private gh(ob param0) {
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
        ob var51 = null;
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
        ob stackIn_65_0 = null;
        ob stackIn_66_0 = null;
        ob stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_73_0 = 0;
        ob stackOut_64_0 = null;
        ob stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        ob stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        param0.field_j = param0.field_h.length - 3;
        var2 = param0.j(-70);
        var3 = param0.f(-20976);
        var4 = 14 + var2 * 10;
        param0.field_j = 0;
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
            var13 = param0.field_j;
            var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
            var15 = 0;
            L1: while (true) {
              if (var15 >= var14) {
                var4 = var4 + (param0.field_j - var13);
                var15 = param0.field_j;
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
                      var30 = param0.field_j;
                      param0.field_j = param0.field_j + var26;
                      var31 = param0.field_j;
                      param0.field_j = param0.field_j + var11;
                      var32 = param0.field_j;
                      param0.field_j = param0.field_j + var10;
                      var33 = param0.field_j;
                      param0.field_j = param0.field_j + var9;
                      var34 = param0.field_j;
                      param0.field_j = param0.field_j + var16;
                      var35 = param0.field_j;
                      param0.field_j = param0.field_j + var18;
                      var36 = param0.field_j;
                      param0.field_j = param0.field_j + var20;
                      var37 = param0.field_j;
                      param0.field_j = param0.field_j + (var7 + var8 + var11);
                      var38 = param0.field_j;
                      param0.field_j = param0.field_j + var7;
                      var39 = param0.field_j;
                      param0.field_j = param0.field_j + var27;
                      var40 = param0.field_j;
                      param0.field_j = param0.field_j + var8;
                      var41 = param0.field_j;
                      param0.field_j = param0.field_j + var17;
                      var42 = param0.field_j;
                      param0.field_j = param0.field_j + var19;
                      var43 = param0.field_j;
                      param0.field_j = param0.field_j + var21;
                      var44 = param0.field_j;
                      param0.field_j = param0.field_j + var12;
                      var45 = param0.field_j;
                      param0.field_j = param0.field_j + var9;
                      var46 = param0.field_j;
                      param0.field_j = param0.field_j + var22;
                      var47 = param0.field_j;
                      param0.field_j = param0.field_j + var23;
                      var48 = param0.field_j;
                      param0.field_j = param0.field_j + var24;
                      var49 = param0.field_j;
                      param0.field_j = param0.field_j + var25;
                      var50 = param0.field_j;
                      param0.field_j = param0.field_j + var5 * 3;
                      ((gh) this).field_h = new byte[var4];
                      var51 = new ob(((gh) this).field_h);
                      var51.e(11135, 1297377380);
                      var51.e(11135, 6);
                      stackOut_64_0 = (ob) var51;
                      stackIn_66_0 = stackOut_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      if (var2 <= 1) {
                        stackOut_66_0 = (ob) (Object) stackIn_66_0;
                        stackOut_66_1 = 0;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        break L3;
                      } else {
                        stackOut_65_0 = (ob) (Object) stackIn_65_0;
                        stackOut_65_1 = 1;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        break L3;
                      }
                    }
                    ((ob) (Object) stackIn_67_0).d(stackIn_67_1, 255);
                    var51.d(var2, 255);
                    var51.d(var3, 255);
                    param0.field_j = var13;
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
                        var51.e(11135, 1297379947);
                        var51.field_j = var51.field_j + 4;
                        var61 = var51.field_j;
                        var62 = -1;
                        L5: while (true) {
                          L6: {
                            var63 = param0.c(false);
                            var51.a((byte) 108, var63);
                            int incrementValue$29 = var29;
                            var29++;
                            var64 = param0.field_h[incrementValue$29] & 255;
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
                                                var51.c(192 + var52, (byte) -100);
                                                break L7;
                                              }
                                            }
                                            int incrementValue$30 = var44;
                                            var44++;
                                            var51.c((int) param0.field_h[incrementValue$30], (byte) -71);
                                            continue L5;
                                          }
                                        } else {
                                          L8: {
                                            if (var65 == 0) {
                                              break L8;
                                            } else {
                                              var51.c(160 + var52, (byte) -114);
                                              break L8;
                                            }
                                          }
                                          int incrementValue$31 = var37;
                                          var37++;
                                          var53 = var53 + param0.field_h[incrementValue$31];
                                          int incrementValue$32 = var31;
                                          var31++;
                                          var58 = var58 + param0.field_h[incrementValue$32];
                                          var51.c(var53 & 127, (byte) -75);
                                          var51.c(var58 & 127, (byte) -59);
                                          continue L5;
                                        }
                                      } else {
                                        L9: {
                                          if (var65 == 0) {
                                            break L9;
                                          } else {
                                            var51.c(208 + var52, (byte) -66);
                                            break L9;
                                          }
                                        }
                                        int incrementValue$33 = var32;
                                        var32++;
                                        var57 = var57 + param0.field_h[incrementValue$33];
                                        var51.c(var57 & 127, (byte) -128);
                                        continue L5;
                                      }
                                    } else {
                                      L10: {
                                        if (var65 == 0) {
                                          break L10;
                                        } else {
                                          var51.c(224 + var52, (byte) -104);
                                          break L10;
                                        }
                                      }
                                      int incrementValue$34 = var45;
                                      var45++;
                                      var56 = var56 + param0.field_h[incrementValue$34];
                                      int incrementValue$35 = var33;
                                      var33++;
                                      var56 = var56 + (param0.field_h[incrementValue$35] << 7);
                                      var51.c(var56 & 127, (byte) -72);
                                      var51.c(var56 >> 7 & 127, (byte) -101);
                                      continue L5;
                                    }
                                  } else {
                                    L11: {
                                      if (var65 == 0) {
                                        break L11;
                                      } else {
                                        var51.c(176 + var52, (byte) -118);
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      L13: {
                                        int incrementValue$36 = var15;
                                        var15++;
                                        var28 = var28 + param0.field_h[incrementValue$36] & 127;
                                        var51.c(var28, (byte) -94);
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
                                                                            int incrementValue$37 = var39;
                                                                            var39++;
                                                                            var66 = param0.field_h[incrementValue$37];
                                                                            break L12;
                                                                          } else {
                                                                            break L14;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                int incrementValue$38 = var30;
                                                                var30++;
                                                                var66 = param0.field_h[incrementValue$38];
                                                                break L12;
                                                              } else {
                                                                int incrementValue$39 = var49;
                                                                var49++;
                                                                var66 = param0.field_h[incrementValue$39];
                                                                break L12;
                                                              }
                                                            } else {
                                                              int incrementValue$40 = var48;
                                                              var48++;
                                                              var66 = param0.field_h[incrementValue$40];
                                                              break L12;
                                                            }
                                                          } else {
                                                            int incrementValue$41 = var47;
                                                            var47++;
                                                            var66 = param0.field_h[incrementValue$41];
                                                            break L12;
                                                          }
                                                        } else {
                                                          int incrementValue$42 = var46;
                                                          var46++;
                                                          var66 = param0.field_h[incrementValue$42];
                                                          break L12;
                                                        }
                                                      } else {
                                                        int incrementValue$43 = var43;
                                                        var43++;
                                                        var66 = param0.field_h[incrementValue$43];
                                                        break L12;
                                                      }
                                                    } else {
                                                      int incrementValue$44 = var36;
                                                      var36++;
                                                      var66 = param0.field_h[incrementValue$44];
                                                      break L12;
                                                    }
                                                  } else {
                                                    int incrementValue$45 = var42;
                                                    var42++;
                                                    var66 = param0.field_h[incrementValue$45];
                                                    break L12;
                                                  }
                                                } else {
                                                  int incrementValue$46 = var35;
                                                  var35++;
                                                  var66 = param0.field_h[incrementValue$46];
                                                  break L12;
                                                }
                                              } else {
                                                int incrementValue$47 = var41;
                                                var41++;
                                                var66 = param0.field_h[incrementValue$47];
                                                break L12;
                                              }
                                            } else {
                                              int incrementValue$48 = var34;
                                              var34++;
                                              var66 = param0.field_h[incrementValue$48];
                                              break L12;
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      int incrementValue$49 = var44;
                                      var44++;
                                      var66 = param0.field_h[incrementValue$49];
                                      break L12;
                                    }
                                    var66 = var66 + var70[var28];
                                    var70[var28] = var66;
                                    var51.c(var66 & 127, (byte) -110);
                                    continue L5;
                                  }
                                } else {
                                  L15: {
                                    if (var65 == 0) {
                                      break L15;
                                    } else {
                                      var51.c(128 + var52, (byte) -87);
                                      break L15;
                                    }
                                  }
                                  int incrementValue$50 = var37;
                                  var37++;
                                  var53 = var53 + param0.field_h[incrementValue$50];
                                  int incrementValue$51 = var40;
                                  var40++;
                                  var55 = var55 + param0.field_h[incrementValue$51];
                                  var51.c(var53 & 127, (byte) -103);
                                  var51.c(var55 & 127, (byte) -75);
                                  continue L5;
                                }
                              } else {
                                L16: {
                                  if (var65 == 0) {
                                    break L16;
                                  } else {
                                    var51.c(144 + var52, (byte) -114);
                                    break L16;
                                  }
                                }
                                int incrementValue$52 = var37;
                                var37++;
                                var53 = var53 + param0.field_h[incrementValue$52];
                                int incrementValue$53 = var38;
                                var38++;
                                var54 = var54 + param0.field_h[incrementValue$53];
                                var51.c(var53 & 127, (byte) -98);
                                var51.c(var54 & 127, (byte) -85);
                                continue L5;
                              }
                            } else {
                              L17: {
                                if (var65 == 0) {
                                  break L17;
                                } else {
                                  var51.c(255, (byte) -88);
                                  break L17;
                                }
                              }
                              var51.c(81, (byte) -83);
                              var51.c(3, (byte) -68);
                              int incrementValue$54 = var50;
                              var50++;
                              var51.c((int) param0.field_h[incrementValue$54], (byte) -78);
                              int incrementValue$55 = var50;
                              var50++;
                              var51.c((int) param0.field_h[incrementValue$55], (byte) -101);
                              int incrementValue$56 = var50;
                              var50++;
                              var51.c((int) param0.field_h[incrementValue$56], (byte) -92);
                              continue L5;
                            }
                          } else {
                            L18: {
                              if (var65 == 0) {
                                break L18;
                              } else {
                                var51.c(255, (byte) -70);
                                break L18;
                              }
                            }
                            var51.c(47, (byte) -55);
                            var51.c(0, (byte) -108);
                            var51.c(var51.field_j - var61, -3);
                            var60++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var28 = var28 + param0.j(-63) & 127;
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
                int discarded$57 = param0.c(false);
                var15++;
                continue L1;
              }
            }
          } else {
            var14 = -1;
            L19: while (true) {
              L20: {
                var15 = param0.j(-87);
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
