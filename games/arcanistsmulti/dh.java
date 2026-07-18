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
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((dh) this).field_Eb = 0;
        try {
          L0: {
            ((dh) this).field_Cb = new kc(0L, param6, param4);
            ((dh) this).a(((dh) this).field_Cb, 119);
            ((dh) this).field_Ob = new kc(0L, param7);
            ((dh) this).field_Ob.field_ob = 16764006;
            ((dh) this).a(((dh) this).field_Ob, 107);
            ((dh) this).field_Ob.field_L = "|";
            ((dh) this).field_Ib = new StringBuilder(12);
            var9_int = ((dh) this).field_Cb.c(-25921);
            ((dh) this).field_Cb.a(var9_int, 5, 3, ga.field_r, (byte) -120);
            ((dh) this).field_Ob.a(var9_int, 5, 3 - -ga.field_r, ga.field_r, (byte) -120);
            var10 = 5 + (5 + var9_int);
            var11 = 3 + (3 + 2 * ga.field_r);
            int discarded$1 = 246;
            var12 = ih.a(param0, var10, param2);
            var13 = ql.a(10, param3, var11, param1);
            ((dh) this).a(var10, var12, var13, var11, (byte) -120);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var9;
            stackOut_3_1 = new StringBuilder().append("dh.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param7 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              wl.field_L[param2] = param0;
              tl.field_f[param2] = new lc(param2);
              if (param1 == 9) {
                break L1;
              } else {
                dh.f((byte) 121);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("dh.E(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(eg param0) {
        Object var2 = null;
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
        Object stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        Object stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        Object stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        Object stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        Object stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            go.field_j = new ll[72];
            ti.field_I = new ll[9];
            var2 = null;
            var3_int = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= 9) {
                hk.field_p = new wj[9];
                var11 = new int[9][gg.field_c];
                var10 = var11;
                var9 = var10;
                var8 = var9;
                var2 = (Object) (Object) var8;
                var3_int = 0;
                L2: while (true) {
                  if (var3_int >= 9) {
                    var3_int = 0;
                    L3: while (true) {
                      if (var3_int >= ti.field_I.length) {
                        var3_int = 0;
                        L4: while (true) {
                          if (~var3_int <= ~go.field_j.length) {
                            kh.field_d = ti.field_I[3];
                            bg.field_e = fj.a("", -22612, param0, "slab");
                            uj.field_i = new qb[7];
                            uj.field_i[0] = fj.a("", -22612, param0, "spells_universal_tower_64x32");
                            uj.field_i[1] = fj.a("", -22612, param0, "icecastle");
                            uj.field_i[2] = fj.a("", -22612, param0, "fortress");
                            uj.field_i[3] = fj.a("", -22612, param0, "den");
                            uj.field_i[4] = fj.a("", -22612, param0, "light");
                            var3 = fj.a("", -22612, param0, "nature");
                            uj.field_i[5] = new qb(80, 95);
                            uj.field_i[5].a();
                            de.c(40, 16, 16, 1);
                            var3.c(0, 16);
                            uj.field_i[6] = fj.a("", hh.a(-66, 22546), param0, "clocktower");
                            gj.field_f = pk.a("", 0, "16", param0);
                            tg.field_b = pk.a("", 0, "32", param0);
                            tk.field_x = qe.a(param0, "64", "", 122);
                            md.field_f = qe.a(param0, "128", "", 46);
                            vg.field_M = af.a("volcano", "", 19412, param0);
                            break L0;
                          } else {
                            go.field_j[var3_int].field_l = (int[]) ((Object[]) var2)[var3_int / 8];
                            var3_int++;
                            continue L4;
                          }
                        }
                      } else {
                        ti.field_I[var3_int].field_l = var11[var3_int];
                        var3_int++;
                        continue L3;
                      }
                    }
                  } else {
                    hk.field_p[var3_int] = new wj(go.field_j[8 * var3_int].field_l);
                    var7 = 0;
                    var4 = var7;
                    L5: while (true) {
                      if (~var7 <= ~go.field_j[var3_int * 8].field_l.length) {
                        var3_int++;
                        continue L2;
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
                  if (var4 != 0) {
                    break L6;
                  } else {
                    var2 = (Object) (Object) pk.a("", 0, "scn0", param0);
                    break L6;
                  }
                }
                L7: {
                  if (var4 == 1) {
                    var2 = (Object) (Object) pk.a("", 0, "scn1", param0);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var4 != 2) {
                    break L8;
                  } else {
                    var2 = (Object) (Object) pk.a("", 0, "scn2", param0);
                    break L8;
                  }
                }
                L9: {
                  if (3 == var4) {
                    var2 = (Object) (Object) pk.a("", 0, "scn3", param0);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (4 != var4) {
                    break L10;
                  } else {
                    var2 = (Object) (Object) pk.a("", 0, "scn4", param0);
                    break L10;
                  }
                }
                L11: {
                  if (var4 != 5) {
                    break L11;
                  } else {
                    var2 = (Object) (Object) pk.a("", 0, "scn5", param0);
                    break L11;
                  }
                }
                L12: {
                  if (var4 != 6) {
                    break L12;
                  } else {
                    var2 = (Object) (Object) pk.a("", 0, "scn6", param0);
                    break L12;
                  }
                }
                L13: {
                  if (var4 != 7) {
                    break L13;
                  } else {
                    var2 = (Object) (Object) pk.a("", 0, "scn7", param0);
                    break L13;
                  }
                }
                L14: {
                  if (var4 != 8) {
                    break L14;
                  } else {
                    var2 = (Object) (Object) pk.a("", 0, "scn8", param0);
                    break L14;
                  }
                }
                ti.field_I[var4] = (ll) ((Object[]) var2)[0];
                var5 = 1;
                L15: while (true) {
                  if (9 <= var5) {
                    var4++;
                    continue L1;
                  } else {
                    go.field_j[var3_int] = (ll) ((Object[]) var2)[var5];
                    var3_int++;
                    var5++;
                    continue L15;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_41_0 = var2;
            stackOut_41_1 = new StringBuilder().append("dh.A(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L16;
            } else {
              stackOut_42_0 = stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L16;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + -66 + ')');
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
                  if (vn.field_d != 85) {
                    break L2;
                  } else {
                    if (((dh) this).field_Ib.length() <= 0) {
                      break L2;
                    } else {
                      int discarded$5 = 0;
                      int discarded$6 = 32;
                      StringBuilder discarded$7 = qj.a(-1 + ((dh) this).field_Ib.length(), ((dh) this).field_Ib);
                      break L2;
                    }
                  }
                }
                L3: {
                  L4: {
                    int discarded$8 = -71;
                    if (bj.a(ed.field_Bb, (CharSequence) (Object) ((dh) this).field_Ib)) {
                      break L4;
                    } else {
                      L5: {
                        if (((dh) this).field_Ib.length() != 0) {
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
                        if (((dh) this).field_Ib.length() != 1) {
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
                  StringBuilder discarded$9 = ((dh) this).field_Ib.append(ed.field_Bb);
                  break L3;
                }
                if (vn.field_d != 84) {
                  if (vn.field_d == 13) {
                    return 1;
                  } else {
                    continue L1;
                  }
                } else {
                  if (((dh) this).field_Ib.length() <= 0) {
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
        int var17_int = 0;
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
        L0: {
          var42 = ArcanistsMulti.field_G ? 1 : 0;
          if (param3 < 0) {
            break L0;
          } else {
            if (id.field_b <= param6) {
              break L0;
            } else {
              L1: {
                if (param16 >= 0) {
                  break L1;
                } else {
                  if (param4 >= 0) {
                    break L1;
                  } else {
                    if (param10 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (~id.field_d < ~param16) {
                  break L2;
                } else {
                  if (~param4 > ~id.field_d) {
                    break L2;
                  } else {
                    if (~id.field_d < ~param10) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                var34 = -param6 + param3;
                if (~param8 == ~param6) {
                  L4: {
                    if (~param6 != ~param3) {
                      var35 = param3 + -param8;
                      if (param4 <= param16) {
                        var27 = (-param13 + param5 << 16) / var35;
                        var30 = param15 << 16;
                        var25 = param13 << 16;
                        var23 = (-param1 + param0 << 16) / var35;
                        var22 = param11 << 16;
                        var20 = (-param16 + param10 << 16) / var34;
                        var29 = param12 << 16;
                        var32 = (param14 - param15 << 16) / var34;
                        var21 = param1 << 16;
                        var18 = param16 << 16;
                        var24 = (-param11 + param0 << 16) / var34;
                        var19 = (param10 + -param4 << 16) / var35;
                        var28 = (param5 + -param9 << 16) / var34;
                        var17_int = param4 << 16;
                        var31 = (param14 - param12 << 16) / var35;
                        var26 = param9 << 16;
                        break L4;
                      } else {
                        var29 = param15 << 16;
                        var25 = param9 << 16;
                        var22 = param1 << 16;
                        var24 = (-param1 + param0 << 16) / var35;
                        var30 = param12 << 16;
                        var18 = param4 << 16;
                        var26 = param13 << 16;
                        var21 = param11 << 16;
                        var20 = (-param4 + param10 << 16) / var35;
                        var19 = (param10 - param16 << 16) / var34;
                        var23 = (param0 - param11 << 16) / var34;
                        var27 = (param5 + -param9 << 16) / var34;
                        var32 = (-param12 + param14 << 16) / var35;
                        var28 = (param5 - param13 << 16) / var35;
                        var31 = (param14 - param15 << 16) / var34;
                        var17_int = param16 << 16;
                        break L4;
                      }
                    } else {
                      var25 = param9;
                      var18 = param4 << 16;
                      var24 = 0;
                      var20 = 0;
                      var17_int = param16 << 16;
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
                      break L4;
                    }
                  }
                  var33 = 0;
                  if (param6 >= 0) {
                    break L3;
                  } else {
                    param6 = Math.min(-param6, param8 + -param6);
                    var29 = var29 + param6 * var31;
                    var17_int = var17_int + param6 * var19;
                    var25 = var25 + var27 * param6;
                    var22 = var22 + var24 * param6;
                    var18 = var18 + var20 * param6;
                    var26 = var26 + var28 * param6;
                    var30 = var30 + var32 * param6;
                    var21 = var21 + var23 * param6;
                    param6 = 0;
                    break L3;
                  }
                } else {
                  L5: {
                    var26 = param9 << 16;
                    var25 = param9 << 16;
                    var30 = param15 << 16;
                    var29 = param15 << 16;
                    var22 = param11 << 16;
                    var21 = param11 << 16;
                    var18 = param16 << 16;
                    var17_int = param16 << 16;
                    var35 = -param6 + param8;
                    var19 = (-param16 + param4 << 16) / var35;
                    var20 = (-param16 + param10 << 16) / var34;
                    if (var19 >= var20) {
                      var28 = (-param9 + param13 << 16) / var35;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var33 = 1;
                      var27 = (param5 + -param9 << 16) / var34;
                      var23 = (param0 + -param11 << 16) / var34;
                      var24 = (-param11 + param1 << 16) / var35;
                      var31 = (param14 + -param15 << 16) / var34;
                      var32 = (param12 - param15 << 16) / var35;
                      break L5;
                    } else {
                      var33 = 0;
                      var23 = (-param11 + param1 << 16) / var35;
                      var27 = (param13 - param9 << 16) / var35;
                      var28 = (param5 + -param9 << 16) / var34;
                      var32 = (param14 + -param15 << 16) / var34;
                      var24 = (-param11 + param0 << 16) / var34;
                      var31 = (-param15 + param12 << 16) / var35;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (param6 >= 0) {
                        break L7;
                      } else {
                        if (param8 >= 0) {
                          param6 = -param6;
                          var18 = var18 + var20 * param6;
                          var25 = var25 + var27 * param6;
                          var21 = var21 + param6 * var23;
                          var29 = var29 + param6 * var31;
                          var17_int = var17_int + param6 * var19;
                          var30 = var30 + param6 * var32;
                          var26 = var26 + param6 * var28;
                          var22 = var22 + var24 * param6;
                          param6 = 0;
                          break L7;
                        } else {
                          param6 = -param6 + param8;
                          var18 = var18 + var20 * param6;
                          var22 = var22 + var24 * param6;
                          var21 = var21 + param6 * var23;
                          var29 = var29 + var31 * param6;
                          var30 = var30 + var32 * param6;
                          var26 = var26 + param6 * var28;
                          var17_int = var17_int + var19 * param6;
                          var25 = var25 + param6 * var27;
                          param6 = param8;
                          break L6;
                        }
                      }
                    }
                    var36 = id.field_f[param6];
                    L8: while (true) {
                      if (param6 >= param8) {
                        break L6;
                      } else {
                        L9: {
                          var37 = var17_int >> 16;
                          if (~var37 <= ~id.field_d) {
                            break L9;
                          } else {
                            var38 = -(var17_int >> 16) + (var18 >> 16);
                            if (var38 == 0) {
                              if (var37 < 0) {
                                break L9;
                              } else {
                                if (~id.field_d >= ~var37) {
                                  break L9;
                                } else {
                                  gl.a(var29, var36 + var37, var38, 0, param7, var25, var21, 0, 0, (byte) 124);
                                  break L9;
                                }
                              }
                            } else {
                              L10: {
                                var39 = (-var21 + var22) / var38;
                                var40 = (var26 - var25) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (~(var38 + var37) <= ~id.field_d) {
                                  var38 = id.field_d + (-var37 + -1);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (var37 < 0) {
                                gl.a(var29 - var41 * var37, var36, var38 + var37, var40, param7, var25 + -(var37 * var40), -(var39 * var37) + var21, var39, var41, (byte) 124);
                                break L9;
                              } else {
                                gl.a(var29, var37 - -var36, var38, var40, param7, var25, var21, var39, var41, (byte) 120);
                                break L9;
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
                          var17_int = var17_int + var19;
                          continue L8;
                        }
                      }
                    }
                  }
                  var36 = param3 - param8;
                  if (0 != var36) {
                    L11: {
                      var37 = param10 << 16;
                      var38 = param0 << 16;
                      var39 = param5 << 16;
                      var40 = param14 << 16;
                      if (var33 == 0) {
                        var29 = param12 << 16;
                        var17_int = param4 << 16;
                        var21 = param1 << 16;
                        var25 = param13 << 16;
                        break L11;
                      } else {
                        var26 = param13 << 16;
                        var18 = param4 << 16;
                        var30 = param12 << 16;
                        var22 = param1 << 16;
                        break L11;
                      }
                    }
                    var27 = (-var25 + var39) / var36;
                    var19 = (-var17_int + var37) / var36;
                    var23 = (var38 - var21) / var36;
                    var32 = (var40 + -var30) / var36;
                    var28 = (var39 + -var26) / var36;
                    var24 = (-var22 + var38) / var36;
                    var20 = (var37 + -var18) / var36;
                    var31 = (-var29 + var40) / var36;
                    break L3;
                  } else {
                    var27 = 0;
                    var23 = 0;
                    var24 = 0;
                    var32 = 0;
                    var20 = 0;
                    var19 = 0;
                    var28 = 0;
                    var31 = 0;
                    break L3;
                  }
                }
              }
              if (param2 >= 80) {
                L12: {
                  if (param6 >= 0) {
                    break L12;
                  } else {
                    param6 = -param6;
                    var17_int = var17_int + var19 * param6;
                    var29 = var29 + param6 * var31;
                    var26 = var26 + var28 * param6;
                    var18 = var18 + param6 * var20;
                    var22 = var22 + param6 * var24;
                    var30 = var30 + param6 * var32;
                    var21 = var21 + var23 * param6;
                    var25 = var25 + var27 * param6;
                    param6 = 0;
                    break L12;
                  }
                }
                var35 = id.field_f[param6];
                L13: while (true) {
                  if (param3 <= param6) {
                    return;
                  } else {
                    L14: {
                      var36 = var17_int >> 16;
                      if (var36 < id.field_d) {
                        var37 = (var18 >> 16) + -(var17_int >> 16);
                        if (var37 == 0) {
                          if (var36 < 0) {
                            break L14;
                          } else {
                            if (~var36 <= ~id.field_d) {
                              break L14;
                            } else {
                              gl.a(var29, var36 - -var35, var37, 0, param7, var25, var21, 0, 0, (byte) 122);
                              break L14;
                            }
                          }
                        } else {
                          L15: {
                            var38 = (-var21 + var22) / var37;
                            var39 = (var26 + -var25) / var37;
                            var40 = (var30 + -var29) / var37;
                            if (id.field_d <= var37 + var36) {
                              var37 = -var36 + id.field_d + -1;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          if (var36 < 0) {
                            gl.a(-(var36 * var40) + var29, var35, var37 + var36, var39, param7, var25 + -(var39 * var36), -(var36 * var38) + var21, var38, var40, (byte) 123);
                            break L14;
                          } else {
                            gl.a(var29, var36 + var35, var37, var39, param7, var25, var21, var38, var40, (byte) 118);
                            break L14;
                          }
                        }
                      } else {
                        break L14;
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
                      var17_int = var17_int + var19;
                      var21 = var21 + var23;
                      var25 = var25 + var27;
                      continue L13;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final boolean e(int param0) {
        int var2 = 0;
        Object var3 = null;
        if (((dh) this).field_Eb != 0) {
          return false;
        } else {
          L0: {
            if (vn.field_d != 85) {
              break L0;
            } else {
              if (0 >= ((dh) this).field_Ib.length()) {
                break L0;
              } else {
                int discarded$10 = 0;
                int discarded$11 = 32;
                StringBuilder discarded$12 = qj.a(((dh) this).field_Ib.length() - 1, ((dh) this).field_Ib);
                break L0;
              }
            }
          }
          L1: {
            if (((dh) this).field_Ib.length() >= 12) {
              break L1;
            } else {
              L2: {
                var2 = Character.toLowerCase(ed.field_Bb);
                if (var2 == 32) {
                  var2 = 95;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (95 != var2) {
                  break L3;
                } else {
                  if (((dh) this).field_Ib.length() <= 0) {
                    break L3;
                  } else {
                    StringBuilder discarded$13 = ((dh) this).field_Ib.append((char) var2);
                    break L3;
                  }
                }
              }
              L4: {
                if (uh.a((char) var2, (byte) -127)) {
                  break L4;
                } else {
                  if (e.a(30, (char) var2)) {
                    break L4;
                  } else {
                    break L1;
                  }
                }
              }
              StringBuilder discarded$14 = ((dh) this).field_Ib.append((char) var2);
              break L1;
            }
          }
          L5: {
            if (param0 > 61) {
              break L5;
            } else {
              var3 = null;
              dh.a((int[]) null, 117, 95);
              break L5;
            }
          }
          L6: {
            if (vn.field_d == 84) {
              if (((dh) this).field_Ib.length() <= 0) {
                ((dh) this).field_Eb = 1;
                break L6;
              } else {
                ((dh) this).field_rb = ((dh) this).field_Ib.toString();
                ((dh) this).field_Eb = 2;
                break L6;
              }
            } else {
              break L6;
            }
          }
          if (13 != vn.field_d) {
            return true;
          } else {
            ((dh) this).field_Eb = 1;
            return true;
          }
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3 = -1 + param2 & param0 >> 31;
        return var3 + (param0 + (param0 >>> 31)) % param2;
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
