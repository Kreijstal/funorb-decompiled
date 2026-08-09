/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends l {
    ln field_h;
    byte[] field_g;

    final static sc a(eh param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, 100, param2);
        if (var3 == null) {
            return null;
        }
        return new sc(new jc(var3));
    }

    final void a() {
        int[] var1;
        int[] var2;
        qj var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        sg var14;
        int[] var15;
        int[] var17;
        int[] var18;
        int[] var20;
        int[] var22;
        if (this.field_h == null) {
          this.field_h = new ln(16);
          var20 = new int[16];
          var17 = var20;
          var1 = var17;
          var18 = new int[16];
          var15 = var18;
          var2 = var15;
          var22 = var1;
          var18[9] = 128;
          var22[9] = 128;
          var4 = new qj(this.field_g);
          var5 = var4.a();
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
                    var4.f(var6);
                    var8 = var4.e(var6);
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
                              var14 = (sg) ((Object) this.field_h.a((long)var13, -14905));
                              if (var14 != null) {
                                break L7;
                              } else {
                                var14 = new sg(new byte[128]);
                                this.field_h.a(var14, (byte) 71, (long)var13);
                                break L7;
                              }
                            }
                            var14.field_h[var11] = (byte) 1;
                            break L6;
                          }
                        }
                      }
                      var4.b(var6);
                      var4.d(var6);
                      continue L2;
                    } else {
                      var4.e();
                      var4.d(var6);
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
              var4.f(var6);
              var4.b(var6);
              var4.d(var6);
              var6++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void b() {
        this.field_h = null;
    }

    private sc(jc param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int incrementValue$24 = 0;
        int incrementValue$25 = 0;
        int incrementValue$26 = 0;
        int incrementValue$27 = 0;
        jc stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        jc stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_73_0 = 0;
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
        jc var51;
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
        param0.field_l = param0.field_g.length - 3;
        var2 = param0.g(11132);
        var3 = param0.c((byte) 111);
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
        L0: while (true) {
          if (var13 >= var2) {
            var4 = var4 + 5 * var5;
            var4 = var4 + 2 * (var7 + var8 + var6 + var9 + var11);
            var4 = var4 + (var10 + var12);
            var13 = param0.field_l;
            var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
            var15 = 0;
            L1: while (true) {
              if (var15 >= var14) {
                var4 = var4 + (param0.field_l - var13);
                var15 = param0.field_l;
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
                      this.field_g = new byte[var4];
                      var51 = new jc(this.field_g);
                      var51.a(1297377380, (byte) -42);
                      var51.a(6, (byte) -42);
                      stackIn_66_0 = (jc) (var51);

                      stackIn_66_1 = 87;

                      if (var2 <= 1) {
                        stackIn_67_0 = (jc) ((Object) stackIn_66_0);
                        stackIn_67_1 = stackIn_66_1;
                        stackIn_67_2 = 0;
                        break L3;
                      } else {
                        stackIn_67_0 = (jc) ((Object) stackIn_66_0);
                        stackIn_67_1 = stackIn_66_1;
                        stackIn_67_2 = 1;
                        break L3;
                      }
                    }
                    ((jc) (Object) stackIn_67_0).a((byte) stackIn_67_1, stackIn_67_2);
                    var51.a((byte) 100, var2);
                    var51.a((byte) 89, var3);
                    param0.field_l = var13;
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
                        var51.a(1297379947, (byte) -42);
                        var51.field_l = var51.field_l + 4;
                        var61 = var51.field_l;
                        var62 = -1;
                        L5: while (true) {
                          L6: {
                            var63 = param0.c(0);
                            var51.d(-37462290, var63);
                            incrementValue$0 = var29;
                            var29++;
                            var64 = param0.field_g[incrementValue$0] & 255;
                            if (var64 == var62) {
                              stackIn_73_0 = 0;
                              break L6;
                            } else {
                              stackIn_73_0 = 1;
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
                                                var51.a(192 + var52, -107);
                                                break L7;
                                              }
                                            }
                                            incrementValue$1 = var44;
                                            var44++;
                                            var51.a((int) param0.field_g[incrementValue$1], -78);
                                            continue L5;
                                          }
                                        } else {
                                          L8: {
                                            if (var65 == 0) {
                                              break L8;
                                            } else {
                                              var51.a(160 + var52, -82);
                                              break L8;
                                            }
                                          }
                                          incrementValue$2 = var37;
                                          var37++;
                                          var53 = var53 + param0.field_g[incrementValue$2];
                                          incrementValue$3 = var31;
                                          var31++;
                                          var58 = var58 + param0.field_g[incrementValue$3];
                                          var51.a(var53 & 127, -105);
                                          var51.a(var58 & 127, -80);
                                          continue L5;
                                        }
                                      } else {
                                        L9: {
                                          if (var65 == 0) {
                                            break L9;
                                          } else {
                                            var51.a(208 + var52, 111);
                                            break L9;
                                          }
                                        }
                                        incrementValue$4 = var32;
                                        var32++;
                                        var57 = var57 + param0.field_g[incrementValue$4];
                                        var51.a(var57 & 127, 84);
                                        continue L5;
                                      }
                                    } else {
                                      L10: {
                                        if (var65 == 0) {
                                          break L10;
                                        } else {
                                          var51.a(224 + var52, -80);
                                          break L10;
                                        }
                                      }
                                      incrementValue$5 = var45;
                                      var45++;
                                      var56 = var56 + param0.field_g[incrementValue$5];
                                      incrementValue$6 = var33;
                                      var33++;
                                      var56 = var56 + (param0.field_g[incrementValue$6] << 7);
                                      var51.a(var56 & 127, -81);
                                      var51.a(var56 >> 7 & 127, -110);
                                      continue L5;
                                    }
                                  } else {
                                    L11: {
                                      if (var65 == 0) {
                                        break L11;
                                      } else {
                                        var51.a(176 + var52, -83);
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      L13: {
                                        incrementValue$7 = var15;
                                        var15++;
                                        var28 = var28 + param0.field_g[incrementValue$7] & 127;
                                        var51.a(var28, -89);
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
                                                                            incrementValue$8 = var39;
                                                                            var39++;
                                                                            var66 = param0.field_g[incrementValue$8];
                                                                            break L12;
                                                                          } else {
                                                                            break L14;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                incrementValue$9 = var30;
                                                                var30++;
                                                                var66 = param0.field_g[incrementValue$9];
                                                                break L12;
                                                              } else {
                                                                incrementValue$10 = var49;
                                                                var49++;
                                                                var66 = param0.field_g[incrementValue$10];
                                                                break L12;
                                                              }
                                                            } else {
                                                              incrementValue$11 = var48;
                                                              var48++;
                                                              var66 = param0.field_g[incrementValue$11];
                                                              break L12;
                                                            }
                                                          } else {
                                                            incrementValue$12 = var47;
                                                            var47++;
                                                            var66 = param0.field_g[incrementValue$12];
                                                            break L12;
                                                          }
                                                        } else {
                                                          incrementValue$13 = var46;
                                                          var46++;
                                                          var66 = param0.field_g[incrementValue$13];
                                                          break L12;
                                                        }
                                                      } else {
                                                        incrementValue$14 = var43;
                                                        var43++;
                                                        var66 = param0.field_g[incrementValue$14];
                                                        break L12;
                                                      }
                                                    } else {
                                                      incrementValue$15 = var36;
                                                      var36++;
                                                      var66 = param0.field_g[incrementValue$15];
                                                      break L12;
                                                    }
                                                  } else {
                                                    incrementValue$16 = var42;
                                                    var42++;
                                                    var66 = param0.field_g[incrementValue$16];
                                                    break L12;
                                                  }
                                                } else {
                                                  incrementValue$17 = var35;
                                                  var35++;
                                                  var66 = param0.field_g[incrementValue$17];
                                                  break L12;
                                                }
                                              } else {
                                                incrementValue$18 = var41;
                                                var41++;
                                                var66 = param0.field_g[incrementValue$18];
                                                break L12;
                                              }
                                            } else {
                                              incrementValue$19 = var34;
                                              var34++;
                                              var66 = param0.field_g[incrementValue$19];
                                              break L12;
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      incrementValue$20 = var44;
                                      var44++;
                                      var66 = param0.field_g[incrementValue$20];
                                      break L12;
                                    }
                                    var66 = var66 + var70[var28];
                                    var70[var28] = var66;
                                    var51.a(var66 & 127, 64);
                                    continue L5;
                                  }
                                } else {
                                  L15: {
                                    if (var65 == 0) {
                                      break L15;
                                    } else {
                                      var51.a(128 + var52, -70);
                                      break L15;
                                    }
                                  }
                                  incrementValue$21 = var37;
                                  var37++;
                                  var53 = var53 + param0.field_g[incrementValue$21];
                                  incrementValue$22 = var40;
                                  var40++;
                                  var55 = var55 + param0.field_g[incrementValue$22];
                                  var51.a(var53 & 127, 69);
                                  var51.a(var55 & 127, 73);
                                  continue L5;
                                }
                              } else {
                                L16: {
                                  if (var65 == 0) {
                                    break L16;
                                  } else {
                                    var51.a(144 + var52, -94);
                                    break L16;
                                  }
                                }
                                incrementValue$23 = var37;
                                var37++;
                                var53 = var53 + param0.field_g[incrementValue$23];
                                incrementValue$24 = var38;
                                var38++;
                                var54 = var54 + param0.field_g[incrementValue$24];
                                var51.a(var53 & 127, 84);
                                var51.a(var54 & 127, -82);
                                continue L5;
                              }
                            } else {
                              L17: {
                                if (var65 == 0) {
                                  break L17;
                                } else {
                                  var51.a(255, 66);
                                  break L17;
                                }
                              }
                              var51.a(81, 87);
                              var51.a(3, 82);
                              incrementValue$25 = var50;
                              var50++;
                              var51.a((int) param0.field_g[incrementValue$25], -90);
                              incrementValue$26 = var50;
                              var50++;
                              var51.a((int) param0.field_g[incrementValue$26], 125);
                              incrementValue$27 = var50;
                              var50++;
                              var51.a((int) param0.field_g[incrementValue$27], -97);
                              continue L5;
                            }
                          } else {
                            L18: {
                              if (var65 == 0) {
                                break L18;
                              } else {
                                var51.a(255, 84);
                                break L18;
                              }
                            }
                            var51.a(47, 85);
                            var51.a(0, 118);
                            var51.e(80, var51.field_l - var61);
                            var60++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var28 = var28 + param0.g(11132) & 127;
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
                param0.c(0);
                var15++;
                continue L1;
              }
            }
          } else {
            var14 = -1;
            L19: while (true) {
              L20: {
                var15 = param0.g(11132);
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
