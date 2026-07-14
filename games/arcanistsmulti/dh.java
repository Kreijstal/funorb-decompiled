/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends kc {
    static int field_Lb;
    private kc field_Cb;
    static String field_Nb;
    private int field_Eb;
    static ll[] field_Jb;
    static String field_Bb;
    static boolean[] field_Fb;
    private kc field_Ob;
    static int field_Gb;
    static boolean field_Mb;
    static String[] field_Kb;
    static int[] field_Db;
    private StringBuilder field_Ib;
    static boolean[][] field_Hb;

    public static void f(byte param0) {
        field_Fb = null;
        field_Jb = null;
        field_Nb = null;
        field_Db = null;
        if (param0 != 77) {
            field_Db = null;
        }
        field_Kb = null;
        field_Bb = null;
        field_Hb = null;
    }

    dh(int param0, int param1, int param2, int param3, String param4, kc param5, kc param6, kc param7) {
        super(0L, param5);
        ((dh) this).field_Eb = 0;
        ((dh) this).field_Cb = new kc(0L, param6, param4);
        ((dh) this).a(((dh) this).field_Cb, 119);
        ((dh) this).field_Ob = new kc(0L, param7);
        ((dh) this).field_Ob.field_ob = 16764006;
        ((dh) this).a(((dh) this).field_Ob, 107);
        ((dh) this).field_Ob.field_L = "|";
        ((dh) this).field_Ib = new StringBuilder(12);
        int var9 = ((dh) this).field_Cb.c(-25921);
        ((dh) this).field_Cb.a(var9, 5, 3, ga.field_r, (byte) -120);
        ((dh) this).field_Ob.a(var9, 5, 3 - -ga.field_r, ga.field_r, (byte) -120);
        int var10 = 5 + (5 + var9);
        int var11 = 3 + (3 + 2 * ga.field_r);
        int var12 = ih.a(param0, var10, param2, 246);
        int var13 = ql.a(10, param3, var11, param1);
        ((dh) this).a(var10, var12, var13, var11, (byte) -120);
    }

    final static void a(int[] param0, int param1, int param2) {
        wl.field_L[param2] = param0;
        tl.field_f[param2] = new lc(param2);
        if (param1 != 9) {
            dh.f((byte) 121);
        }
    }

    final static void a(eg param0, byte param1) {
        Object var2 = null;
        int[][] var2_array = null;
        ll[] var2_array2 = null;
        int var3_int = 0;
        qb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] var8 = null;
        int[][] var9 = null;
        int[][] var10 = null;
        int[][] var11 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        go.field_j = new ll[72];
        ti.field_I = new ll[9];
        var2 = null;
        var3_int = 0;
        var4 = 0;
        L0: while (true) {
          if (var4 <= -10) {
            hk.field_p = new wj[9];
            var11 = new int[9][gg.field_c];
            var10 = var11;
            var9 = var10;
            var8 = var9;
            var2_array = var8;
            var3_int = 0;
            L1: while (true) {
              if (-10 >= (var3_int ^ -1)) {
                var3_int = 0;
                L2: while (true) {
                  if (var3_int >= ti.field_I.length) {
                    var3_int = 0;
                    L3: while (true) {
                      if (var3_int >= go.field_j.length) {
                        L4: {
                          kh.field_d = ti.field_I[3];
                          bg.field_e = fj.a("", -22612, param0, "slab");
                          uj.field_i = new qb[7];
                          uj.field_i[0] = fj.a("", param1 + -22546, param0, "spells_universal_tower_64x32");
                          if (param1 == -66) {
                            break L4;
                          } else {
                            field_Kb = null;
                            break L4;
                          }
                        }
                        uj.field_i[1] = fj.a("", -22612, param0, "icecastle");
                        uj.field_i[2] = fj.a("", -22612, param0, "fortress");
                        uj.field_i[3] = fj.a("", -22612, param0, "den");
                        uj.field_i[4] = fj.a("", -22612, param0, "light");
                        var3 = fj.a("", param1 + -22546, param0, "nature");
                        uj.field_i[5] = new qb(80, 95);
                        uj.field_i[5].a();
                        de.c(40, 16, 16, 1);
                        var3.c(0, 16);
                        uj.field_i[6] = fj.a("", hh.a((int) param1, 22546), param0, "clocktower");
                        gj.field_f = pk.a("", 0, "16", param0);
                        tg.field_b = pk.a("", 0, "32", param0);
                        tk.field_x = qe.a(param0, "64", "", 122);
                        md.field_f = qe.a(param0, "128", "", 46);
                        vg.field_M = af.a("volcano", "", 19412, param0);
                        return;
                      } else {
                        go.field_j[var3_int].field_l = var2_array[var3_int / 8];
                        var3_int++;
                        continue L3;
                      }
                    }
                  } else {
                    ti.field_I[var3_int].field_l = var11[var3_int];
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                hk.field_p[var3_int] = new wj(go.field_j[8 * var3_int].field_l);
                var7 = 0;
                var4 = var7;
                L5: while (true) {
                  if (var7 >= go.field_j[var3_int * 8].field_l.length) {
                    var3_int++;
                    continue L1;
                  } else {
                    var11[var3_int][var7] = go.field_j[8 * var3_int].field_l[var7];
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          } else {
            L6: {
              if (-1 != var4) {
                break L6;
              } else {
                var2_array2 = pk.a("", 0, "scn0", param0);
                break L6;
              }
            }
            L7: {
              if (var4 == 1) {
                var2_array2 = pk.a("", 0, "scn1", param0);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (-3 != (var4 ^ -1)) {
                break L8;
              } else {
                var2_array2 = pk.a("", 0, "scn2", param0);
                break L8;
              }
            }
            L9: {
              if (3 == var4) {
                var2_array2 = pk.a("", 0, "scn3", param0);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (4 != var4) {
                break L10;
              } else {
                var2_array2 = pk.a("", 0, "scn4", param0);
                break L10;
              }
            }
            L11: {
              if (var4 != 5) {
                break L11;
              } else {
                var2_array2 = pk.a("", 0, "scn5", param0);
                break L11;
              }
            }
            L12: {
              if (var4 != -7) {
                break L12;
              } else {
                var2_array2 = pk.a("", 0, "scn6", param0);
                break L12;
              }
            }
            L13: {
              if (-8 != var4) {
                break L13;
              } else {
                var2_array2 = pk.a("", 0, "scn7", param0);
                break L13;
              }
            }
            L14: {
              if (-9 != (var4 ^ -1)) {
                break L14;
              } else {
                var2_array2 = pk.a("", 0, "scn8", param0);
                break L14;
              }
            }
            ti.field_I[var4] = var2_array2[0];
            var5 = 1;
            L15: while (true) {
              if (9 <= var5) {
                var4++;
                continue L0;
              } else {
                go.field_j[var3_int] = var2_array2[var5];
                var3_int++;
                var5++;
                continue L15;
              }
            }
          }
        }
    }

    final int b(boolean param0, boolean param1) {
        int var4 = 0;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          ((dh) this).b(param1, (byte) 92);
          if (!param1) {
            break L0;
          } else {
            L1: while (true) {
              if (!ib.b(param0)) {
                break L0;
              } else {
                L2: {
                  if (-86 != (vn.field_d ^ -1)) {
                    break L2;
                  } else {
                    if ((((dh) this).field_Ib.length() ^ -1) >= -1) {
                      break L2;
                    } else {
                      StringBuilder discarded$2 = qj.a(-1 + ((dh) this).field_Ib.length(), ((dh) this).field_Ib, ' ', false);
                      break L2;
                    }
                  }
                }
                L3: {
                  L4: {
                    if (bj.a(ed.field_Bb, (CharSequence) (Object) ((dh) this).field_Ib, (byte) -71)) {
                      break L4;
                    } else {
                      L5: {
                        if (-1 != (((dh) this).field_Ib.length() ^ -1)) {
                          break L5;
                        } else {
                          if (91 == ed.field_Bb) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (((dh) this).field_Ib.length() != -2) {
                          break L6;
                        } else {
                          if (ed.field_Bb == 35) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (ed.field_Bb == 93) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  StringBuilder discarded$3 = ((dh) this).field_Ib.append(ed.field_Bb);
                  break L3;
                }
                if (-85 != vn.field_d) {
                  if (-14 == vn.field_d) {
                    return 1;
                  } else {
                    continue L1;
                  }
                } else {
                  if (-1 <= ((dh) this).field_Ib.length()) {
                    return 1;
                  } else {
                    ((dh) this).field_rb = ((dh) this).field_Ib.toString();
                    return 2;
                  }
                }
              }
            }
          }
        }
        L7: {
          ((dh) this).field_Ob.field_rb = ((dh) this).field_Ib.toString();
          if (!param0) {
            break L7;
          } else {
            dh.a(120, -69, 53, 92, -36, 113, 49, (int[]) null, 83, -103, -7, -17, -113, 48, -117, -23, 64);
            break L7;
          }
        }
        L8: {
          if (!param1) {
            break L8;
          } else {
            if (re.field_r == 0) {
              break L8;
            } else {
              if (0 != ((dh) this).field_U) {
                break L8;
              } else {
                ((dh) this).field_Eb = 1;
                break L8;
              }
            }
          }
        }
        return ((dh) this).field_Eb;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        int var42 = 0;
        var42 = ArcanistsMulti.field_G ? 1 : 0;
        if (param3 < 0) {
          return;
        } else {
          if (id.field_b <= param6) {
            return;
          } else {
            L0: {
              if (param16 >= 0) {
                break L0;
              } else {
                if (param4 >= 0) {
                  break L0;
                } else {
                  if (param10 < 0) {
                    return;
                  } else {
                    break L0;
                  }
                }
              }
            }
            L1: {
              if (id.field_d > param16) {
                break L1;
              } else {
                if (param4 < id.field_d) {
                  break L1;
                } else {
                  if (id.field_d > param10) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            }
            L2: {
              L3: {
                var34 = -param6 + param3;
                if (param8 == param6) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var26 = param9 << -485782576;
                      var25 = param9 << -485782576;
                      var30 = param15 << -149875888;
                      var29 = param15 << -149875888;
                      var22 = param11 << 168058800;
                      var21 = param11 << 168058800;
                      var18 = param16 << -2101323344;
                      var17 = param16 << -2101323344;
                      var35 = -param6 + param8;
                      var19 = (-param16 + param4 << 945290384) / var35;
                      var20 = (-param16 + param10 << 1546906992) / var34;
                      if (var19 >= var20) {
                        break L5;
                      } else {
                        var33 = 0;
                        var23 = (-param11 + param1 << 1178363536) / var35;
                        var27 = (param13 - param9 << -323487088) / var35;
                        var28 = (param5 + -param9 << -1766923920) / var34;
                        var32 = (param14 + -param15 << 1067692528) / var34;
                        var24 = (-param11 + param0 << -1654389808) / var34;
                        var31 = (-param15 + param12 << 69308400) / var35;
                        if (0 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var28 = (-param9 + param13 << 1808483184) / var35;
                    var36 = var19;
                    var19 = var20;
                    var20 = var36;
                    var33 = 1;
                    var27 = (param5 + -param9 << -1604357008) / var34;
                    var23 = (param0 + -param11 << 1647672304) / var34;
                    var24 = (-param11 + param1 << -193372464) / var35;
                    var31 = (param14 + -param15 << 451583568) / var34;
                    var32 = (param12 - param15 << -1681256208) / var35;
                    break L4;
                  }
                  L6: {
                    L7: {
                      if (param6 >= 0) {
                        var36 = id.field_f[param6];
                        L8: while (true) {
                          if (param6 >= param8) {
                            break L6;
                          } else {
                            L9: {
                              var37 = var17 >> 1437305744;
                              if ((var37 ^ -1) <= (id.field_d ^ -1)) {
                                break L9;
                              } else {
                                var38 = -(var17 >> -1179822320) + (var18 >> 1757686832);
                                if (var38 == 0) {
                                  if (var37 < 0) {
                                    break L9;
                                  } else {
                                    if (id.field_d <= var37) {
                                      break L9;
                                    } else {
                                      gl.a(var29, var36 + var37, var38, 0, param7, var25, var21, 0, 0, (byte) 124);
                                      break L9;
                                    }
                                  }
                                } else {
                                  if (var37 < 0) {
                                    break L9;
                                  } else {
                                    if (id.field_d <= var37) {
                                      break L9;
                                    } else {
                                      gl.a(var29, var36 + var37, var38, 0, param7, var25, var21, 0, 0, (byte) 124);
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                            param6++;
                            if (id.field_b <= param6) {
                              return;
                            } else {
                              var29 = var29 + var31;
                              var22 = var22 + var24;
                              var30 = var30 + var32;
                              var25 = var25 + var27;
                              var21 = var21 + var23;
                              var18 = var18 + var20;
                              var36 = var36 + de.field_e;
                              var26 = var26 + var28;
                              var17 = var17 + var19;
                              if (0 == 0) {
                                continue L8;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      } else {
                        L10: {
                          if (param8 >= 0) {
                            break L10;
                          } else {
                            param6 = -param6 + param8;
                            var18 = var18 + var20 * param6;
                            var22 = var22 + var24 * param6;
                            var21 = var21 + param6 * var23;
                            var29 = var29 + var31 * param6;
                            var30 = var30 + var32 * param6;
                            var26 = var26 + param6 * var28;
                            var17 = var17 + var19 * param6;
                            var25 = var25 + param6 * var27;
                            param6 = param8;
                            if (0 == 0) {
                              break L6;
                            } else {
                              break L10;
                            }
                          }
                        }
                        param6 = -param6;
                        var18 = var18 + var20 * param6;
                        var25 = var25 + var27 * param6;
                        var21 = var21 + param6 * var23;
                        var29 = var29 + param6 * var31;
                        var17 = var17 + param6 * var19;
                        var30 = var30 + param6 * var32;
                        var26 = var26 + param6 * var28;
                        var22 = var22 + var24 * param6;
                        param6 = 0;
                        break L7;
                      }
                    }
                    var36 = id.field_f[param6];
                    L11: while (true) {
                      if (param6 >= param8) {
                        break L6;
                      } else {
                        L12: {
                          var37 = var17 >> 1437305744;
                          if ((var37 ^ -1) <= (id.field_d ^ -1)) {
                            break L12;
                          } else {
                            var38 = -(var17 >> -1179822320) + (var18 >> 1757686832);
                            if (var38 == 0) {
                              if (var37 < 0) {
                                break L12;
                              } else {
                                if (id.field_d <= var37) {
                                  break L12;
                                } else {
                                  gl.a(var29, var36 + var37, var38, 0, param7, var25, var21, 0, 0, (byte) 124);
                                  break L12;
                                }
                              }
                            } else {
                              if (var37 < 0) {
                                break L12;
                              } else {
                                if (id.field_d <= var37) {
                                  break L12;
                                } else {
                                  gl.a(var29, var36 + var37, var38, 0, param7, var25, var21, 0, 0, (byte) 124);
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                        param6++;
                        if (id.field_b <= param6) {
                          return;
                        } else {
                          var29 = var29 + var31;
                          var22 = var22 + var24;
                          var30 = var30 + var32;
                          var25 = var25 + var27;
                          var21 = var21 + var23;
                          var18 = var18 + var20;
                          var36 = var36 + de.field_e;
                          var26 = var26 + var28;
                          var17 = var17 + var19;
                          if (0 == 0) {
                            continue L11;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    L14: {
                      var36 = param3 - param8;
                      if (0 != var36) {
                        break L14;
                      } else {
                        var27 = 0;
                        var23 = 0;
                        var24 = 0;
                        var32 = 0;
                        var20 = 0;
                        var19 = 0;
                        var28 = 0;
                        var31 = 0;
                        if (0 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      L16: {
                        var37 = param10 << -146872624;
                        var38 = param0 << -824542000;
                        var39 = param5 << 512875632;
                        var40 = param14 << -893657168;
                        if (var33 == 0) {
                          break L16;
                        } else {
                          var26 = param13 << -1641815696;
                          var18 = param4 << 37899600;
                          var30 = param12 << 2084940208;
                          var22 = param1 << -512163504;
                          if (0 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      var29 = param12 << 2073067824;
                      var17 = param4 << 807637872;
                      var21 = param1 << 320730864;
                      var25 = param13 << -2036932784;
                      break L15;
                    }
                    var27 = (-var25 + var39) / var36;
                    var19 = (-var17 + var37) / var36;
                    var23 = (var38 - var21) / var36;
                    var32 = (var40 + -var30) / var36;
                    var28 = (var39 + -var26) / var36;
                    var24 = (-var22 + var38) / var36;
                    var20 = (var37 + -var18) / var36;
                    var31 = (-var29 + var40) / var36;
                    break L13;
                  }
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L17: {
                L18: {
                  if (param6 != param3) {
                    break L18;
                  } else {
                    var25 = param9;
                    var18 = param4 << -2055287760;
                    var24 = 0;
                    var20 = 0;
                    var17 = param16 << 708374256;
                    var32 = 0;
                    var26 = param13;
                    var21 = param11;
                    var19 = 0;
                    var23 = 0;
                    var22 = param1;
                    var31 = 0;
                    var28 = 0;
                    var27 = 0;
                    var29 = param15;
                    var30 = param12;
                    if (0 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  var35 = param3 + -param8;
                  if (param4 <= param16) {
                    break L19;
                  } else {
                    var29 = param15 << -1106437264;
                    var25 = param9 << 1010346384;
                    var22 = param1 << -1823187600;
                    var24 = (-param1 + param0 << 632211728) / var35;
                    var30 = param12 << -626319696;
                    var18 = param4 << -1892458832;
                    var26 = param13 << -576068304;
                    var21 = param11 << -1272703664;
                    var20 = (-param4 + param10 << 464977456) / var35;
                    var19 = (param10 - param16 << 38065072) / var34;
                    var23 = (param0 - param11 << 1806535088) / var34;
                    var27 = (param5 + -param9 << -2069884560) / var34;
                    var32 = (-param12 + param14 << -1143705904) / var35;
                    var28 = (param5 - param13 << 1601016336) / var35;
                    var31 = (param14 - param15 << -1215824976) / var34;
                    var17 = param16 << 247271728;
                    if (0 == 0) {
                      break L17;
                    } else {
                      break L19;
                    }
                  }
                }
                var27 = (-param13 + param5 << -169244784) / var35;
                var30 = param15 << 317285360;
                var25 = param13 << 721579792;
                var23 = (-param1 + param0 << 985871920) / var35;
                var22 = param11 << -1876180336;
                var20 = (-param16 + param10 << -735174416) / var34;
                var29 = param12 << 184212272;
                var32 = (param14 - param15 << -580695056) / var34;
                var21 = param1 << 769078864;
                var18 = param16 << -1250884848;
                var24 = (-param11 + param0 << 572706576) / var34;
                var19 = (param10 + -param4 << 1788193488) / var35;
                var28 = (param5 + -param9 << -2078759536) / var34;
                var17 = param4 << -1583502288;
                var31 = (param14 - param12 << -2052223664) / var35;
                var26 = param9 << 327107984;
                break L17;
              }
              var33 = 0;
              if (param6 >= 0) {
                break L2;
              } else {
                param6 = Math.min(-param6, param8 + -param6);
                var29 = var29 + param6 * var31;
                var17 = var17 + param6 * var19;
                var25 = var25 + var27 * param6;
                var22 = var22 + var24 * param6;
                var18 = var18 + var20 * param6;
                var26 = var26 + var28 * param6;
                var30 = var30 + var32 * param6;
                var21 = var21 + var23 * param6;
                param6 = 0;
                break L2;
              }
            }
            if (param2 >= 80) {
              L20: {
                if (param6 >= 0) {
                  break L20;
                } else {
                  param6 = -param6;
                  var17 = var17 + var19 * param6;
                  var29 = var29 + param6 * var31;
                  var26 = var26 + var28 * param6;
                  var18 = var18 + param6 * var20;
                  var22 = var22 + param6 * var24;
                  var30 = var30 + param6 * var32;
                  var21 = var21 + var23 * param6;
                  var25 = var25 + var27 * param6;
                  param6 = 0;
                  break L20;
                }
              }
              var35 = id.field_f[param6];
              L21: while (true) {
                L22: {
                  if (param3 <= param6) {
                    break L22;
                  } else {
                    L23: {
                      var36 = var17 >> 1689957264;
                      if (var36 < id.field_d) {
                        var37 = (var18 >> 221165680) + -(var17 >> 120414768);
                        if (var37 == 0) {
                          if (var36 < 0) {
                            break L23;
                          } else {
                            if (var36 >= id.field_d) {
                              break L23;
                            } else {
                              gl.a(var29, var36 - -var35, var37, 0, param7, var25, var21, 0, 0, (byte) 122);
                              break L23;
                            }
                          }
                        } else {
                          if (var36 < 0) {
                            break L23;
                          } else {
                            if (var36 >= id.field_d) {
                              break L23;
                            } else {
                              gl.a(var29, var36 - -var35, var37, 0, param7, var25, var21, 0, 0, (byte) 122);
                              break L23;
                            }
                          }
                        }
                      } else {
                        break L23;
                      }
                    }
                    param6++;
                    if (param6 < id.field_b) {
                      var26 = var26 + var28;
                      var30 = var30 + var32;
                      var22 = var22 + var24;
                      var35 = var35 + de.field_e;
                      var29 = var29 + var31;
                      var18 = var18 + var20;
                      var17 = var17 + var19;
                      var21 = var21 + var23;
                      var25 = var25 + var27;
                      if (0 == 0) {
                        continue L21;
                      } else {
                        break L22;
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean e(int param0) {
        int var2 = 0;
        if (!(((dh) this).field_Eb == 0)) {
            return false;
        }
        if ((vn.field_d ^ -1) == -86) {
            if (0 < ((dh) this).field_Ib.length()) {
                StringBuilder discarded$0 = qj.a(((dh) this).field_Ib.length() - 1, ((dh) this).field_Ib, ' ', false);
            }
        }
        if (((dh) this).field_Ib.length() < 12) {
            var2 = Character.toLowerCase(ed.field_Bb);
            if (!(var2 != 32)) {
                var2 = 95;
            }
            if (95 == var2) {
                if (((dh) this).field_Ib.length() > 0) {
                    StringBuilder discarded$1 = ((dh) this).field_Ib.append(var2);
                }
            }
            if (!uh.a((char) var2, (byte) -127)) {
                // ifne L137
            } else {
                StringBuilder discarded$2 = ((dh) this).field_Ib.append(var2);
            }
        }
        if (param0 <= 61) {
            Object var3 = null;
            dh.a((int[]) null, 117, 95);
        }
        if (-85 != (vn.field_d ^ -1)) {
        } else {
            if ((((dh) this).field_Ib.length() ^ -1) < -1) {
                ((dh) this).field_rb = ((dh) this).field_Ib.toString();
                ((dh) this).field_Eb = 2;
            } else {
                ((dh) this).field_Eb = 1;
            }
        }
        if (13 == vn.field_d) {
            ((dh) this).field_Eb = 1;
            return true;
        }
        return true;
    }

    final static int a(int param0, boolean param1, int param2) {
        if (!param1) {
            Object var4 = null;
            dh.a((int[]) null, 52, -9);
        }
        int var3 = -1 + param2 & param0 >> 1148227327;
        return var3 + (param0 + (param0 >>> 379930431)) % param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = "Accept";
        field_Bb = "Create your own free Jagex account";
        field_Db = new int[8192];
        field_Kb = new String[]{"Control Powerful Familiars", "Cause Volcanic Destruction", "Summon Hordes of Minions", "Devastate the World", "Control the Battlefield", "Become an Arcane Master!"};
    }
}
