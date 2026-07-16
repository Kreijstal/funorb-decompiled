/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db implements ci {
    static kl field_a;
    private ee field_n;
    private int field_k;
    static byte field_p;
    private int field_g;
    private int field_t;
    private int field_e;
    private int field_h;
    static int field_m;
    private int field_i;
    private int field_r;
    static int[] field_c;
    static String field_f;
    private int field_d;
    private int field_j;
    static String field_b;
    private int field_q;
    static kc field_o;
    private int field_s;
    static int[] field_l;

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ua var11 = null;
        lk stackIn_3_0 = null;
        lk stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param1 instanceof ua) {
            stackOut_2_0 = (lk) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (lk) (Object) stackOut_1_0;
            break L0;
          }
        }
        var11 = (ua) (Object) stackIn_3_0;
        if (param2 != 11447) {
          return;
        } else {
          L1: {
            if (var11 == null) {
              break L1;
            } else {
              param4 = param4 & var11.field_B;
              break L1;
            }
          }
          L2: {
            var7 = 5592405;
            if (!param4) {
              break L2;
            } else {
              var7 = 16777215;
              break L2;
            }
          }
          L3: {
            vj.c(param1.field_o + param0, param3 - -param1.field_i, param1.field_h, param1.field_q, ((db) this).field_i);
            var8 = ((db) this).field_q + param0 + param1.field_o;
            var9 = ((db) this).field_t + param1.field_i + param3;
            vj.f(var8, var9, ((db) this).field_d, ((db) this).field_g, 5592405);
            vj.c(var8, var9, ((db) this).field_d, ((db) this).field_g, var7);
            if (!var11.field_D) {
              break L3;
            } else {
              vj.e(var8, var9, ((db) this).field_d + var8, ((db) this).field_g + var9, 1);
              vj.e(((db) this).field_d + var8, var9, var8, ((db) this).field_g + var9, 1);
              break L3;
            }
          }
          L4: {
            if (null != ((db) this).field_n) {
              var10 = ((db) this).field_d + (((db) this).field_q - -((db) this).field_j);
              int discarded$1 = ((db) this).field_n.a(param1.field_r, var10 + param0 + param1.field_o, param1.field_i + (param3 - -((db) this).field_e), -((db) this).field_j + (-var10 + param1.field_h), param1.field_q - (((db) this).field_j << -1604369407), ((db) this).field_r, ((db) this).field_h, ((db) this).field_k, ((db) this).field_s, 0);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final static void a(boolean param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        pb var17 = null;
        pb var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        L0: {
          var15 = Main.field_T;
          var17 = new pb(param1);
          var18 = var17;
          var18.field_i = -2 + param1.length;
          cf.field_c = var18.d((byte) 72);
          hb.field_a = new int[cf.field_c];
          kb.field_c = new int[cf.field_c];
          rd.field_k = new byte[cf.field_c][];
          na.field_q = new int[cf.field_c];
          ml.field_b = new int[cf.field_c];
          hl.field_y = new boolean[cf.field_c];
          vd.field_r = new byte[cf.field_c][];
          var18.field_i = -(8 * cf.field_c) + param1.length + -7;
          p.field_l = var18.d((byte) 72);
          if (param0) {
            break L0;
          } else {
            var16 = null;
            db.a(false, (byte[]) null);
            break L0;
          }
        }
        gk.field_a = var18.d((byte) 72);
        var3 = 1 + (255 & var18.f(27));
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= cf.field_c) {
              break L2;
            } else {
              kb.field_c[var4] = var17.d((byte) 72);
              var4++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            L4: {
              if (cf.field_c <= var4) {
                break L4;
              } else {
                ml.field_b[var4] = var17.d((byte) 72);
                var4++;
                if (0 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                if (cf.field_c <= var4) {
                  break L6;
                } else {
                  na.field_q[var4] = var17.d((byte) 72);
                  var4++;
                  if (0 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              var4 = 0;
              L7: while (true) {
                L8: {
                  if (cf.field_c <= var4) {
                    break L8;
                  } else {
                    hb.field_a[var4] = var17.d((byte) 72);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var18.field_i = param1.length + (-7 + -(cf.field_c * 8) + -(3 * (var3 - 1)));
                jf.field_i = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var3 <= var4) {
                      break L10;
                    } else {
                      L11: {
                        jf.field_i[var4] = var17.e(true);
                        if (jf.field_i[var4] != 0) {
                          break L11;
                        } else {
                          jf.field_i[var4] = 1;
                          break L11;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var18.field_i = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (cf.field_c <= var4) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
                            var5 = na.field_q[var4];
                            var6 = hb.field_a[var4];
                            var7 = var5 * var6;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var8 = var19;
                            rd.field_k[var4] = var25;
                            var26 = new byte[var7];
                            var24 = var26;
                            var22 = var24;
                            var20 = var22;
                            var9 = var20;
                            vd.field_r[var4] = var26;
                            var10 = 0;
                            var11 = var18.f(-102);
                            if ((var11 & 1) == 0) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var5 <= var12) {
                                    break L17;
                                  } else {
                                    var13 = 0;
                                    L18: while (true) {
                                      L19: {
                                        if (var6 <= var13) {
                                          break L19;
                                        } else {
                                          var8[var12 - -(var13 * var5)] = var17.a(true);
                                          var13++;
                                          if (0 == 0) {
                                            continue L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                if (-1 != (var11 & 2 ^ -1)) {
                                  var12 = 0;
                                  L20: while (true) {
                                    L21: {
                                      if (var12 >= var5) {
                                        break L21;
                                      } else {
                                        var13 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var13 >= var6) {
                                              break L23;
                                            } else {
                                              L24: {
                                                byte dupTemp$2 = var17.a(true);
                                                var9[var5 * var13 + var12] = dupTemp$2;
                                                var14 = dupTemp$2;
                                                stackOut_39_0 = var10;
                                                stackIn_41_0 = stackOut_39_0;
                                                stackIn_40_0 = stackOut_39_0;
                                                if (-1 == var14) {
                                                  stackOut_41_0 = stackIn_41_0;
                                                  stackOut_41_1 = 0;
                                                  stackIn_42_0 = stackOut_41_0;
                                                  stackIn_42_1 = stackOut_41_1;
                                                  break L24;
                                                } else {
                                                  stackOut_40_0 = stackIn_40_0;
                                                  stackOut_40_1 = 1;
                                                  stackIn_42_0 = stackOut_40_0;
                                                  stackIn_42_1 = stackOut_40_1;
                                                  break L24;
                                                }
                                              }
                                              var10 = stackIn_42_0 | stackIn_42_1;
                                              var13++;
                                              if (0 == 0) {
                                                continue L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          var12++;
                                          if (0 == 0) {
                                            continue L20;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L25: while (true) {
                            stackOut_46_0 = var12 ^ -1;
                            stackOut_46_1 = var7 ^ -1;
                            stackIn_48_0 = stackOut_46_0;
                            stackIn_48_1 = stackOut_46_1;
                            L26: {
                              if (stackIn_48_0 <= stackIn_48_1) {
                                break L26;
                              } else {
                                var8[var12] = var17.a(true);
                                var12++;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            if ((2 & var11) != 0) {
                              var12 = 0;
                              L27: while (true) {
                                if (var12 >= var7) {
                                  break L14;
                                } else {
                                  L28: {
                                    byte dupTemp$3 = var17.a(true);
                                    var9[var12] = dupTemp$3;
                                    var13 = dupTemp$3;
                                    stackOut_55_0 = var10;
                                    stackIn_57_0 = stackOut_55_0;
                                    stackIn_56_0 = stackOut_55_0;
                                    if (0 == (var13 ^ -1)) {
                                      stackOut_57_0 = stackIn_57_0;
                                      stackOut_57_1 = 0;
                                      stackIn_58_0 = stackOut_57_0;
                                      stackIn_58_1 = stackOut_57_1;
                                      break L28;
                                    } else {
                                      stackOut_56_0 = stackIn_56_0;
                                      stackOut_56_1 = 1;
                                      stackIn_58_0 = stackOut_56_0;
                                      stackIn_58_1 = stackOut_56_1;
                                      break L28;
                                    }
                                  }
                                  var10 = stackIn_58_0 | stackIn_58_1;
                                  var12++;
                                  if (0 == 0) {
                                    continue L27;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        hl.field_y[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
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

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
            return;
        }
        field_f = null;
        field_a = null;
        field_b = null;
        field_c = null;
        field_l = null;
    }

    db(ee param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((db) this).field_k = 1;
        ((db) this).field_s = 1;
        ((db) this).field_g = param7;
        ((db) this).field_r = param3;
        ((db) this).field_i = param9;
        ((db) this).field_n = param0;
        ((db) this).field_j = param1;
        ((db) this).field_d = param8;
        ((db) this).field_e = param2;
        ((db) this).field_q = param5;
        ((db) this).field_h = param4;
        ((db) this).field_t = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_c = new int[128];
        field_b = "Menu";
    }
}
