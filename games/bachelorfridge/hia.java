/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hia extends sfa {
    int field_k;
    int field_j;
    static String field_i;

    public static void d(byte param0) {
        if (param0 != -74) {
            hia.d((byte) 13);
        }
        field_i = null;
    }

    hia(int param0, aga param1) {
        super(1, param0, new nq(param1));
    }

    final static void a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        lu var17 = null;
        lu var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        var16 = BachelorFridge.field_y;
        var17 = new lu(param1);
        var18 = var17;
        var18.field_g = param1.length - 2;
        ok.field_vb = var18.e((byte) 62);
        eha.field_s = new int[ok.field_vb];
        fd.field_D = new int[ok.field_vb];
        baa.field_P = new byte[ok.field_vb][];
        cea.field_d = new byte[ok.field_vb][];
        uf.field_b = new boolean[ok.field_vb];
        fl.field_j = new int[ok.field_vb];
        lq.field_A = new int[ok.field_vb];
        var18.field_g = -(8 * ok.field_vb) + param1.length - 7;
        ok.field_Bb = var18.e((byte) 101);
        kh.field_r = var18.e((byte) 60);
        var3 = (var18.b(16711935) & 255) - -1;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (var4 >= ok.field_vb) {
              break L1;
            } else {
              fl.field_j[var4] = var17.e((byte) 57);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            L3: {
              if (var4 >= ok.field_vb) {
                break L3;
              } else {
                fd.field_D[var4] = var17.e((byte) 99);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = 0;
            L4: while (true) {
              L5: {
                if (var4 >= ok.field_vb) {
                  break L5;
                } else {
                  lq.field_A[var4] = var17.e((byte) 67);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var4 = 7 % ((param0 - 60) / 48);
              var5 = 0;
              L6: while (true) {
                L7: {
                  if (var5 >= ok.field_vb) {
                    break L7;
                  } else {
                    eha.field_s[var5] = var17.e((byte) 105);
                    var5++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var18.field_g = param1.length - (7 - -(8 * ok.field_vb) + (3 * var3 + -3));
                hk.field_f = new int[var3];
                var5 = 1;
                L8: while (true) {
                  L9: {
                    if (var3 <= var5) {
                      break L9;
                    } else {
                      L10: {
                        hk.field_f[var5] = var17.a(3);
                        if (-1 != (hk.field_f[var5] ^ -1)) {
                          break L10;
                        } else {
                          hk.field_f[var5] = 1;
                          break L10;
                        }
                      }
                      var5++;
                      if (0 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var18.field_g = 0;
                  var5 = 0;
                  L11: while (true) {
                    L12: {
                      if (ok.field_vb <= var5) {
                        break L12;
                      } else {
                        L13: {
                          L14: {
                            var6 = lq.field_A[var5];
                            var7 = eha.field_s[var5];
                            var8 = var6 * var7;
                            var25 = new byte[var8];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            baa.field_P[var5] = var25;
                            var26 = new byte[var8];
                            var24 = var26;
                            var22 = var24;
                            var20 = var22;
                            var10 = var20;
                            cea.field_d[var5] = var26;
                            var11 = 0;
                            var12 = var18.b(16711935);
                            if ((1 & var12) != 0) {
                              break L14;
                            } else {
                              var13 = 0;
                              L15: while (true) {
                                L16: {
                                  if (var8 <= var13) {
                                    break L16;
                                  } else {
                                    var9[var13] = var17.b(true);
                                    var13++;
                                    if (0 == 0) {
                                      continue L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                if (-1 == (2 & var12 ^ -1)) {
                                  break L13;
                                } else {
                                  var13 = 0;
                                  L17: while (true) {
                                    L18: {
                                      if (var13 >= var8) {
                                        break L18;
                                      } else {
                                        L19: {
                                          var10[var13] = var17.b(true);
                                          var14 = var17.b(true);
                                          stackOut_31_0 = var11;
                                          stackIn_33_0 = stackOut_31_0;
                                          stackIn_32_0 = stackOut_31_0;
                                          if (0 == (var14 ^ -1)) {
                                            stackOut_33_0 = stackIn_33_0;
                                            stackOut_33_1 = 0;
                                            stackIn_34_0 = stackOut_33_0;
                                            stackIn_34_1 = stackOut_33_1;
                                            break L19;
                                          } else {
                                            stackOut_32_0 = stackIn_32_0;
                                            stackOut_32_1 = 1;
                                            stackIn_34_0 = stackOut_32_0;
                                            stackIn_34_1 = stackOut_32_1;
                                            break L19;
                                          }
                                        }
                                        var11 = stackIn_34_0 | stackIn_34_1;
                                        var13++;
                                        if (0 == 0) {
                                          continue L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var13 = 0;
                          L20: while (true) {
                            L21: {
                              if (var6 <= var13) {
                                break L21;
                              } else {
                                var14 = 0;
                                L22: while (true) {
                                  L23: {
                                    if (var7 <= var14) {
                                      break L23;
                                    } else {
                                      var9[var13 - -(var14 * var6)] = var17.b(true);
                                      var14++;
                                      if (0 == 0) {
                                        continue L22;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  var13++;
                                  if (0 == 0) {
                                    continue L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            if (0 != (2 & var12)) {
                              var13 = 0;
                              L24: while (true) {
                                if (var13 >= var6) {
                                  break L13;
                                } else {
                                  var14 = 0;
                                  L25: while (true) {
                                    L26: {
                                      if (var14 >= var7) {
                                        break L26;
                                      } else {
                                        L27: {
                                          var10[var6 * var14 + var13] = var17.b(true);
                                          var15 = var17.b(true);
                                          stackOut_49_0 = var11;
                                          stackIn_51_0 = stackOut_49_0;
                                          stackIn_50_0 = stackOut_49_0;
                                          if (var15 == -1) {
                                            stackOut_51_0 = stackIn_51_0;
                                            stackOut_51_1 = 0;
                                            stackIn_52_0 = stackOut_51_0;
                                            stackIn_52_1 = stackOut_51_1;
                                            break L27;
                                          } else {
                                            stackOut_50_0 = stackIn_50_0;
                                            stackOut_50_1 = 1;
                                            stackIn_52_0 = stackOut_50_0;
                                            stackIn_52_1 = stackOut_50_1;
                                            break L27;
                                          }
                                        }
                                        var11 = stackIn_52_0 | stackIn_52_1;
                                        var14++;
                                        if (0 == 0) {
                                          continue L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    var13++;
                                    if (0 == 0) {
                                      continue L24;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        uf.field_b[var5] = var11 != 0;
                        var5++;
                        if (0 == 0) {
                          continue L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    private final vja a(boolean param0, boolean param1, boolean param2, int param3) {
        if (-4 == (((t) (Object) al.a(param3 ^ -366, ((hia) this).field_g)).field_p ^ -1)) {
            return (vja) (Object) new ce(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, param0, param2, param1, 0);
        }
        if (param3 != -279) {
            ((hia) this).field_j = -73;
        }
        if (!(((t) (Object) al.a(param3 + 240, ((hia) this).field_g)).field_p != 2)) {
            return (vja) (Object) new hba(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, ((hia) this).field_k, param0, param2, param1, false);
        }
        return new vja(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, ((hia) this).field_k, param0, param2, param1);
    }

    final ii a(op param0, int param1) {
        t var4 = null;
        ce var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        aga var10 = null;
        var8 = BachelorFridge.field_y;
        var10 = ((hia) this).field_h.a(44, param0);
        if (9 == var10.field_y) {
          return (ii) (Object) this.a(true, false, true, param1 ^ -278);
        } else {
          L0: {
            if (param1 == 3) {
              break L0;
            } else {
              var9 = null;
              ((hia) this).a(-51, (lu) null);
              break L0;
            }
          }
          if (2 == var10.field_y) {
            return (ii) (Object) this.a(true, false, true, param1 + -282);
          } else {
            L1: {
              if (11 != var10.field_y) {
                break L1;
              } else {
                if (50 < kla.a(100, param0.field_w, -2147483648)) {
                  return (ii) (Object) this.a(false, true, true, -279);
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var4 = (t) (Object) al.a(-107, ((hia) this).field_g);
              if ((var10.field_q ^ -1) > -11) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              int discarded$1 = kla.a(50, param0.field_w, param1 + 2147483645);
              var5 = null;
              if ((var4.field_p ^ -1) == -4) {
                L4: {
                  L5: {
                    var6 = ((hia) this).field_k;
                    ((hia) this).field_k = 0;
                    var7 = 0;
                    if ((var4.field_u ^ -1) == -16) {
                      break L5;
                    } else {
                      if (var4.field_u == -46) {
                        break L5;
                      } else {
                        if (-47 == var4.field_u) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var7 = 1;
                  break L4;
                }
                var6 = om.a(((hia) this).field_j, (byte) 118, var10.field_J, var7 != 0, var6, var10, var10.field_x, param0);
                var5 = new ce(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, false, false, false, var6);
                L6: while (true) {
                  if (var6 <= ((hia) this).field_k) {
                    break L3;
                  } else {
                    this.a(104, ((vja) (Object) var5).field_o, param0);
                    ((hia) this).field_k = ((hia) this).field_k + 1;
                    continue L6;
                  }
                }
              } else {
                break L3;
              }
            }
            if (2 == var4.field_p) {
              var6 = ((hia) this).field_k;
              if (!param0.a(-9, var6, ((hia) this).field_j, var10)) {
                return (ii) (Object) new hba(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, var6, false, false, false, true);
              } else {
                L7: {
                  var5 = (ce) (Object) new hba(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, var6, false, false, false, false);
                  if (var5 != null) {
                    break L7;
                  } else {
                    var5 = (ce) (Object) this.a(false, false, false, -279);
                    break L7;
                  }
                }
                this.a(param1 ^ 94, ((vja) (Object) var5).field_o, param0);
                return (ii) (Object) var5;
              }
            } else {
              L8: {
                if (var5 != null) {
                  break L8;
                } else {
                  var5 = (ce) (Object) this.a(false, false, false, -279);
                  break L8;
                }
              }
              this.a(param1 ^ 94, ((vja) (Object) var5).field_o, param0);
              return (ii) (Object) var5;
            }
          }
        }
    }

    private final void a(int param0, eaa param1, op param2) {
        aga var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wia var12_ref_wia = null;
        int var12 = 0;
        aga var13_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        iv var17_ref = null;
        int var18 = 0;
        int var19 = 0;
        wia var20 = null;
        aga var21 = null;
        sl var22_ref = null;
        int var22 = 0;
        o var23_ref = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        iv var26 = null;
        int var27 = 0;
        Object var28 = null;
        t var28_ref = null;
        t var29 = null;
        int[][] var33 = null;
        int stackIn_5_0 = 0;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_116_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_114_0 = 0;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        L0: {
          var28 = null;
          var27 = BachelorFridge.field_y;
          var28_ref = (t) (Object) al.a(-103, ((hia) this).field_g);
          var29 = var28_ref;
          var5 = ((hia) this).field_h.a(67, param2);
          var33 = haa.b(1, var5.d(125, ((hia) this).field_g), ((hia) this).field_j);
          var7 = var5.field_x;
          if (param0 > 26) {
            break L0;
          } else {
            ((hia) this).field_j = -84;
            break L0;
          }
        }
        L1: {
          var8 = var5.field_J;
          var9 = var29.field_q;
          if (-1 > (var9 ^ -1)) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var10 = stackIn_5_0;
          if (var10 == 0) {
            var9 = (int)(var5.a((oha) (Object) var29, -5313) * (double)var9);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var11 = 0;
          if (-32 != (((hia) this).field_k ^ -1)) {
            L4: {
              if (2 != ((hia) this).field_j) {
                if ((((hia) this).field_j ^ -1) != -5) {
                  if ((((hia) this).field_j ^ -1) == -2) {
                    var8 = var8 - ((hia) this).field_k;
                    break L4;
                  } else {
                    if (((hia) this).field_j == 3) {
                      var8 = var8 + ((hia) this).field_k;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                } else {
                  var7 = var7 + ((hia) this).field_k;
                  break L4;
                }
              } else {
                var7 = var7 - ((hia) this).field_k;
                break L4;
              }
            }
            var12 = 17;
            var13 = 17;
            var14 = -1 + var12 >> 2112156257;
            var15 = -1 + var13 >> -1193033503;
            var16 = 0;
            L5: while (true) {
              if (var12 <= var16) {
                break L3;
              } else {
                var17 = 0;
                L6: while (true) {
                  if (var13 <= var17) {
                    var16++;
                    continue L5;
                  } else {
                    if (var33[var16][var17] == 1) {
                      L7: {
                        L8: {
                          if (71 == var29.field_j) {
                            break L8;
                          } else {
                            if ((var29.field_j ^ -1) == -73) {
                              break L8;
                            } else {
                              if (var29.field_j == -74) {
                                break L8;
                              } else {
                                if (-13 == var29.field_j) {
                                  break L8;
                                } else {
                                  if (13 == var29.field_j) {
                                    break L8;
                                  } else {
                                    if (var29.field_j == 14) {
                                      break L8;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        param2.field_T.field_B[var5.field_D] = param2.field_T.field_B[var5.field_D] + 1;
                        break L7;
                      }
                      L9: {
                        L10: {
                          if (9 == var29.field_j) {
                            break L10;
                          } else {
                            if (var29.field_j == 10) {
                              break L10;
                            } else {
                              if (11 == var29.field_j) {
                                break L10;
                              } else {
                                if (var29.field_j == 54) {
                                  break L10;
                                } else {
                                  if (55 == var29.field_j) {
                                    break L10;
                                  } else {
                                    if (-57 != (var29.field_j ^ -1)) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        param2.field_T.field_k[var5.field_D] = param2.field_T.field_k[var5.field_D] + 1;
                        break L9;
                      }
                      var18 = -var14 + (var16 + var7);
                      var19 = var8 - -var17 - var15;
                      if (var18 >= 0) {
                        if (var18 < param2.field_z) {
                          if (-1 >= (var19 ^ -1)) {
                            if (param2.field_B > var19) {
                              L11: {
                                var20 = param2.field_a[var18][var19];
                                var21 = var20.field_l;
                                if (var20.b((byte) -113)) {
                                  var22_ref = new sl(var9, var18, var19);
                                  param1.a((bw) (Object) var22_ref, true);
                                  if (var20.field_n != 34) {
                                    break L11;
                                  } else {
                                    var23_ref = new o(50);
                                    param1.a((bw) (Object) var23_ref, true);
                                    break L11;
                                  }
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                if (!var20.field_d) {
                                  break L12;
                                } else {
                                  var22_ref = (sl) (Object) new ro(var18, var19);
                                  param1.a((bw) (Object) var22_ref, true);
                                  break L12;
                                }
                              }
                              L13: {
                                if (var29.field_j == 80) {
                                  var22_ref = (sl) (Object) new bm(15, var18, var19);
                                  if (param2.field_a[var18][var19].field_l == null) {
                                    param1.a((bw) (Object) var22_ref, true);
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  if (-82 == (var29.field_j ^ -1)) {
                                    var22_ref = (sl) (Object) new bm(14, var18, var19);
                                    if (null == param2.field_a[var18][var19].field_l) {
                                      param1.a((bw) (Object) var22_ref, true);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var21 != null) {
                                L14: {
                                  if (var5.field_y == 42) {
                                    var5.field_G = true;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                L15: {
                                  var22 = 0;
                                  var23 = var9;
                                  var24 = 1;
                                  if (var29.field_p != 4) {
                                    L16: {
                                      if ((var20.field_n ^ -1) != -19) {
                                        break L16;
                                      } else {
                                        var23 = 0;
                                        break L16;
                                      }
                                    }
                                    L17: {
                                      if ((var21.field_y ^ -1) != -33) {
                                        break L17;
                                      } else {
                                        if (!var29.c(27863)) {
                                          var23 = 0;
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    var24 = ga.field_b[var29.field_c][var21.field_o.field_k.field_b];
                                    if (var20.field_d) {
                                      var23 = var23 >> 1;
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                                L18: {
                                  if (var5.field_E != var21.field_D) {
                                    break L18;
                                  } else {
                                    if (var5.field_y != 37) {
                                      break L18;
                                    } else {
                                      var17++;
                                      continue L6;
                                    }
                                  }
                                }
                                L19: {
                                  if (-54 != (var5.field_y ^ -1)) {
                                    break L19;
                                  } else {
                                    var11++;
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (var5.field_y != 53) {
                                    stackOut_115_0 = var29.field_u;
                                    stackIn_116_0 = stackOut_115_0;
                                    break L20;
                                  } else {
                                    stackOut_114_0 = 53;
                                    stackIn_116_0 = stackOut_114_0;
                                    break L20;
                                  }
                                }
                                L21: {
                                  var25 = stackIn_116_0;
                                  if (var21.field_y != 32) {
                                    break L21;
                                  } else {
                                    if (!var29.c(27863)) {
                                      var25 = 0;
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                var26 = new iv(new nq(var21), var22 != 0, var24, var23, var25);
                                param1.a((bw) (Object) var26, true);
                                var17++;
                                continue L6;
                              } else {
                                var17++;
                                continue L6;
                              }
                            } else {
                              var17++;
                              continue L6;
                            }
                          } else {
                            var17++;
                            continue L6;
                          }
                        } else {
                          var17++;
                          continue L6;
                        }
                      } else {
                        var17++;
                        continue L6;
                      }
                    } else {
                      var17++;
                      continue L6;
                    }
                  }
                }
              }
            }
          } else {
            var12_ref_wia = param2.field_a[var7][var8];
            var13_ref = var12_ref_wia.field_l;
            if (var13_ref == null) {
              return;
            } else {
              L22: {
                var14 = 0;
                var15 = var9;
                var16 = 1;
                if (-5 == (var29.field_p ^ -1)) {
                  break L22;
                } else {
                  L23: {
                    if ((var12_ref_wia.field_n ^ -1) == -19) {
                      var15 = 0;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  var16 = ga.field_b[var28_ref.field_c][var13_ref.field_o.field_k.field_b];
                  if (-3 == var16) {
                    var15 = var15 << 1;
                    break L22;
                  } else {
                    if (var16 == 0) {
                      var15 = var15 >> 1;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              L24: {
                if (-1 < var15) {
                  param2.field_T.field_f[var5.field_D] = param2.field_T.field_f[var5.field_D] + var15;
                  param2.field_T.field_b[var13_ref.field_D] = param2.field_T.field_b[var13_ref.field_D] + var15;
                  param2.field_T.field_n[var5.field_D] = param2.field_T.field_n[var5.field_D] + var15;
                  param2.field_T.field_g[var13_ref.field_D] = param2.field_T.field_g[var13_ref.field_D] + 1;
                  param2.field_T.field_y[var5.field_D] = param2.field_T.field_y[var5.field_D] + 1;
                  break L24;
                } else {
                  L25: {
                    stackOut_22_0 = param2.field_T.field_F;
                    stackOut_22_1 = var5.field_D;
                    stackOut_22_2 = param2.field_T.field_F[var5.field_D];
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    if (var15 <= var13_ref.field_t + -var13_ref.field_I) {
                      stackOut_24_0 = (int[]) (Object) stackIn_24_0;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = stackIn_24_2;
                      stackOut_24_3 = var15;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      stackIn_25_3 = stackOut_24_3;
                      break L25;
                    } else {
                      stackOut_23_0 = (int[]) (Object) stackIn_23_0;
                      stackOut_23_1 = stackIn_23_1;
                      stackOut_23_2 = stackIn_23_2;
                      stackOut_23_3 = -var13_ref.field_I + var13_ref.field_t;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackIn_25_3 = stackOut_23_3;
                      break L25;
                    }
                  }
                  stackIn_25_0[stackIn_25_1] = stackIn_25_2 + -stackIn_25_3;
                  if (var13_ref.field_D != var5.field_D) {
                    param2.field_T.field_j[var13_ref.field_D] = true;
                    break L24;
                  } else {
                    break L24;
                  }
                }
              }
              L26: {
                if (-1 <= (-var15 + var13_ref.field_I ^ -1)) {
                  param2.field_T.field_w[var5.field_D] = param2.field_T.field_w[var5.field_D] + 1;
                  if (20 != var5.field_o.field_b) {
                    break L26;
                  } else {
                    if ((var13_ref.field_o.field_b ^ -1) == -4) {
                      param2.field_T.field_x[var5.field_D] = true;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                } else {
                  break L26;
                }
              }
              L27: {
                if (53 != var5.field_y) {
                  break L27;
                } else {
                  var11++;
                  break L27;
                }
              }
              var17_ref = new iv(new nq(var13_ref), var14 != 0, var16, var15, var29.field_u);
              param1.a((bw) (Object) var17_ref, true);
              break L3;
            }
          }
        }
        L28: {
          if (var11 >= 3) {
            param2.field_T.field_d[var5.field_D] = true;
            break L28;
          } else {
            break L28;
          }
        }
    }

    final void a(int param0, lu param1) {
        int var3 = 84 / ((61 - param0) / 53);
        param1.d(((hia) this).field_j | ((hia) this).field_k << 1514061187, 0);
    }

    final static void c(byte param0) {
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = BachelorFridge.field_y;
          if (((dfa) (Object) dj.field_c).field_a) {
            if (-1 == (dj.field_c.field_h.field_f & 1 << dj.field_c.field_n ^ -1)) {
              if (0 != dj.field_c.field_h.field_f) {
                lr.field_k[12] = wha.field_g;
                break L0;
              } else {
                if ((1 << dj.field_c.field_h.field_d) - 1 == (1 << dj.field_c.field_n | dj.field_c.field_V)) {
                  lr.field_k[12] = ama.field_m;
                  break L0;
                } else {
                  lr.field_k[12] = rna.field_b;
                  break L0;
                }
              }
            } else {
              lr.field_k[12] = as.field_b;
              break L0;
            }
          } else {
            if (0 == (1 << dj.field_c.field_n & dj.field_c.field_h.field_f)) {
              if (dj.field_c.field_h.field_f != 0) {
                lr.field_k[12] = iia.field_o;
                break L0;
              } else {
                if ((1 << dj.field_c.field_h.field_d) + -1 == (1 << dj.field_c.field_n | dj.field_c.field_V)) {
                  lr.field_k[12] = dda.field_k;
                  break L0;
                } else {
                  lr.field_k[12] = mw.field_g;
                  break L0;
                }
              }
            } else {
              lr.field_k[12] = dk.field_q;
              break L0;
            }
          }
        }
        L1: {
          if (param0 <= -99) {
            break L1;
          } else {
            var3 = null;
            hia.a(101, (byte[]) null);
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<%0> cannot join; the game has started.";
    }
}
