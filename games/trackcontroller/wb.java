/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends fc {
    byte[] field_j;
    id field_i;

    final void a() {
        int[] var1 = null;
        int[] var2 = null;
        fa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wl var14 = null;
        wl var14_ref = null;
        wl var15 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        if (((wb) this).field_i == null) {
          ((wb) this).field_i = new id(16);
          var27 = new int[16];
          var24 = var27;
          var21 = var24;
          var18 = var21;
          var1 = var18;
          var25 = new int[16];
          var22 = var25;
          var19 = var22;
          var16 = var19;
          var2 = var16;
          var26 = var1;
          var25[9] = 128;
          var26[9] = 128;
          var4 = new fa(((wb) this).field_j);
          var5 = var4.d();
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
                    var4.d(var6);
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
                              var1[var10] = (var27[var10] & -2080769) + (var12 << 14);
                              break L4;
                            }
                          }
                          if (var11 != 32) {
                            break L3;
                          } else {
                            var1[var10] = (var27[var10] & -16257) + (var12 << 7);
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
                          var2[var10] = var27[var10] + var11;
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
                              var13 = var25[var10];
                              var14 = (wl) (Object) ((wb) this).field_i.a(8434, (long)var13);
                              if (var14 != null) {
                                break L7;
                              } else {
                                var15 = new wl(new byte[128]);
                                var14_ref = var15;
                                ((wb) this).field_i.a(false, (long)var13, (fc) (Object) var15);
                                break L7;
                              }
                            }
                            var14_ref.field_k[var11] = (byte) 1;
                            break L6;
                          }
                        }
                      }
                      var4.c(var6);
                      var4.e(var6);
                      continue L2;
                    } else {
                      var4.f();
                      var4.e(var6);
                      if (var4.e()) {
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
              var4.c(var6);
              var4.e(var6);
              var6++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static wb a(kk param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, -1, param2);
        if (var3 == null) {
            return null;
        }
        return new wb(new be(var3));
    }

    final void b() {
        ((wb) this).field_i = null;
    }

    private wb(be param0) {
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
        be var51 = null;
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
        be stackIn_65_0 = null;
        be stackIn_66_0 = null;
        be stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_73_0 = 0;
        be stackOut_64_0 = null;
        be stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        be stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        param0.field_k = param0.field_j.length - 3;
        var2 = param0.h(16383);
        var3 = param0.d((byte) -98);
        var4 = 14 + var2 * 10;
        param0.field_k = 0;
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
            var13 = param0.field_k;
            var14 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
            var15 = 0;
            L1: while (true) {
              if (var15 >= var14) {
                var4 = var4 + (param0.field_k - var13);
                var15 = param0.field_k;
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
                      var30 = param0.field_k;
                      param0.field_k = param0.field_k + var26;
                      var31 = param0.field_k;
                      param0.field_k = param0.field_k + var11;
                      var32 = param0.field_k;
                      param0.field_k = param0.field_k + var10;
                      var33 = param0.field_k;
                      param0.field_k = param0.field_k + var9;
                      var34 = param0.field_k;
                      param0.field_k = param0.field_k + var16;
                      var35 = param0.field_k;
                      param0.field_k = param0.field_k + var18;
                      var36 = param0.field_k;
                      param0.field_k = param0.field_k + var20;
                      var37 = param0.field_k;
                      param0.field_k = param0.field_k + (var7 + var8 + var11);
                      var38 = param0.field_k;
                      param0.field_k = param0.field_k + var7;
                      var39 = param0.field_k;
                      param0.field_k = param0.field_k + var27;
                      var40 = param0.field_k;
                      param0.field_k = param0.field_k + var8;
                      var41 = param0.field_k;
                      param0.field_k = param0.field_k + var17;
                      var42 = param0.field_k;
                      param0.field_k = param0.field_k + var19;
                      var43 = param0.field_k;
                      param0.field_k = param0.field_k + var21;
                      var44 = param0.field_k;
                      param0.field_k = param0.field_k + var12;
                      var45 = param0.field_k;
                      param0.field_k = param0.field_k + var9;
                      var46 = param0.field_k;
                      param0.field_k = param0.field_k + var22;
                      var47 = param0.field_k;
                      param0.field_k = param0.field_k + var23;
                      var48 = param0.field_k;
                      param0.field_k = param0.field_k + var24;
                      var49 = param0.field_k;
                      param0.field_k = param0.field_k + var25;
                      var50 = param0.field_k;
                      param0.field_k = param0.field_k + var5 * 3;
                      ((wb) this).field_j = new byte[var4];
                      var51 = new be(((wb) this).field_j);
                      var51.b(false, 1297377380);
                      var51.b(false, 6);
                      stackOut_64_0 = (be) var51;
                      stackIn_66_0 = stackOut_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      if (var2 <= 1) {
                        stackOut_66_0 = (be) (Object) stackIn_66_0;
                        stackOut_66_1 = 0;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        break L3;
                      } else {
                        stackOut_65_0 = (be) (Object) stackIn_65_0;
                        stackOut_65_1 = 1;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        break L3;
                      }
                    }
                    ((be) (Object) stackIn_67_0).b(stackIn_67_1, (byte) -126);
                    var51.b(var2, (byte) -123);
                    var51.b(var3, (byte) -119);
                    param0.field_k = var13;
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
                      } else {
                        var51.b(false, 1297379947);
                        var51.field_k = var51.field_k + 4;
                        var61 = var51.field_k;
                        var62 = -1;
                        L5: while (true) {
                          L6: {
                            var63 = param0.m(127);
                            var51.b((byte) -97, var63);
                            var29++;
                            var64 = param0.field_j[var29] & 255;
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
                                                var51.a(192 + var52, (byte) -104);
                                                break L7;
                                              }
                                            }
                                            var44++;
                                            var51.a((int) param0.field_j[var44], (byte) -77);
                                            continue L5;
                                          }
                                        } else {
                                          L8: {
                                            if (var65 == 0) {
                                              break L8;
                                            } else {
                                              var51.a(160 + var52, (byte) -123);
                                              break L8;
                                            }
                                          }
                                          var37++;
                                          var53 = var53 + param0.field_j[var37];
                                          var31++;
                                          var58 = var58 + param0.field_j[var31];
                                          var51.a(var53 & 127, (byte) -101);
                                          var51.a(var58 & 127, (byte) -106);
                                          continue L5;
                                        }
                                      } else {
                                        L9: {
                                          if (var65 == 0) {
                                            break L9;
                                          } else {
                                            var51.a(208 + var52, (byte) -103);
                                            break L9;
                                          }
                                        }
                                        var32++;
                                        var57 = var57 + param0.field_j[var32];
                                        var51.a(var57 & 127, (byte) -91);
                                        continue L5;
                                      }
                                    } else {
                                      L10: {
                                        if (var65 == 0) {
                                          break L10;
                                        } else {
                                          var51.a(224 + var52, (byte) -124);
                                          break L10;
                                        }
                                      }
                                      var45++;
                                      var56 = var56 + param0.field_j[var45];
                                      var33++;
                                      var56 = var56 + (param0.field_j[var33] << 7);
                                      var51.a(var56 & 127, (byte) -121);
                                      var51.a(var56 >> 7 & 127, (byte) -100);
                                      continue L5;
                                    }
                                  } else {
                                    L11: {
                                      if (var65 == 0) {
                                        break L11;
                                      } else {
                                        var51.a(176 + var52, (byte) -64);
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      L13: {
                                        var15++;
                                        var28 = var28 + param0.field_j[var15] & 127;
                                        var51.a(var28, (byte) -114);
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
                                                                            var39++;
                                                                            var66 = param0.field_j[var39];
                                                                            break L12;
                                                                          } else {
                                                                            break L14;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                var30++;
                                                                var66 = param0.field_j[var30];
                                                                break L12;
                                                              } else {
                                                                var49++;
                                                                var66 = param0.field_j[var49];
                                                                break L12;
                                                              }
                                                            } else {
                                                              var48++;
                                                              var66 = param0.field_j[var48];
                                                              break L12;
                                                            }
                                                          } else {
                                                            var47++;
                                                            var66 = param0.field_j[var47];
                                                            break L12;
                                                          }
                                                        } else {
                                                          var46++;
                                                          var66 = param0.field_j[var46];
                                                          break L12;
                                                        }
                                                      } else {
                                                        var43++;
                                                        var66 = param0.field_j[var43];
                                                        break L12;
                                                      }
                                                    } else {
                                                      var36++;
                                                      var66 = param0.field_j[var36];
                                                      break L12;
                                                    }
                                                  } else {
                                                    var42++;
                                                    var66 = param0.field_j[var42];
                                                    break L12;
                                                  }
                                                } else {
                                                  var35++;
                                                  var66 = param0.field_j[var35];
                                                  break L12;
                                                }
                                              } else {
                                                var41++;
                                                var66 = param0.field_j[var41];
                                                break L12;
                                              }
                                            } else {
                                              var34++;
                                              var66 = param0.field_j[var34];
                                              break L12;
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      var44++;
                                      var66 = param0.field_j[var44];
                                      break L12;
                                    }
                                    var66 = var66 + var70[var28];
                                    var70[var28] = var66;
                                    var51.a(var66 & 127, (byte) -87);
                                    continue L5;
                                  }
                                } else {
                                  L15: {
                                    if (var65 == 0) {
                                      break L15;
                                    } else {
                                      var51.a(128 + var52, (byte) -60);
                                      break L15;
                                    }
                                  }
                                  var37++;
                                  var53 = var53 + param0.field_j[var37];
                                  var40++;
                                  var55 = var55 + param0.field_j[var40];
                                  var51.a(var53 & 127, (byte) -95);
                                  var51.a(var55 & 127, (byte) -103);
                                  continue L5;
                                }
                              } else {
                                L16: {
                                  if (var65 == 0) {
                                    break L16;
                                  } else {
                                    var51.a(144 + var52, (byte) -90);
                                    break L16;
                                  }
                                }
                                var37++;
                                var53 = var53 + param0.field_j[var37];
                                var38++;
                                var54 = var54 + param0.field_j[var38];
                                var51.a(var53 & 127, (byte) -63);
                                var51.a(var54 & 127, (byte) -94);
                                continue L5;
                              }
                            } else {
                              L17: {
                                if (var65 == 0) {
                                  break L17;
                                } else {
                                  var51.a(255, (byte) -81);
                                  break L17;
                                }
                              }
                              var51.a(81, (byte) -67);
                              var51.a(3, (byte) -107);
                              var50++;
                              var51.a((int) param0.field_j[var50], (byte) -74);
                              var50++;
                              var51.a((int) param0.field_j[var50], (byte) -65);
                              var50++;
                              var51.a((int) param0.field_j[var50], (byte) -80);
                              continue L5;
                            }
                          } else {
                            L18: {
                              if (var65 == 0) {
                                break L18;
                              } else {
                                var51.a(255, (byte) -103);
                                break L18;
                              }
                            }
                            var51.a(47, (byte) -108);
                            var51.a(0, (byte) -104);
                            var51.a((byte) 115, var51.field_k - var61);
                            var60++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var28 = var28 + param0.h(16383) & 127;
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
                int discarded$1 = param0.m(127);
                var15++;
                continue L1;
              }
            }
          } else {
            var14 = -1;
            L19: while (true) {
              L20: {
                var15 = param0.h(16383);
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
