/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class he {
    static String field_f;
    static String field_g;
    int[] field_a;
    static ub field_e;
    int field_i;
    static String field_j;
    static int field_k;
    java.awt.Image field_b;
    static String field_h;
    static String field_d;
    int field_c;

    final void b(byte param0) {
        if (param0 <= 120) {
            return;
        }
        pb.a(((he) this).field_a, ((he) this).field_c, ((he) this).field_i);
    }

    abstract void a(int param0, byte param1, java.awt.Component param2, int param3);

    abstract void a(byte param0, java.awt.Graphics param1, int param2, int param3);

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        ih.field_r = param3;
        rn.field_q = param4;
        ia.field_l = param2;
        if (param0) {
            return;
        }
        ag.field_s = param1;
    }

    final static boolean a(int param0, kj param1) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1766) {
          return false;
        } else {
          L0: {
            if (-2 != param1.g(param0 + 1815, 1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        int var3 = 0;
        String var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        Object var13 = null;
        Object var14 = null;
        Object var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        Object var21 = null;
        Object var22 = null;
        CharSequence var23 = null;
        L0: {
          var21 = null;
          var22 = null;
          var11 = SteelSentinels.field_G;
          var3 = 1;
          if (rg.field_f) {
            break L0;
          } else {
            if (hh.field_a != null) {
              break L0;
            } else {
              var3 = 0;
              break L0;
            }
          }
        }
        L1: {
          if (ib.field_b != 0) {
            break L1;
          } else {
            if (null == ni.field_a) {
              break L1;
            } else {
              var3 = 0;
              break L1;
            }
          }
        }
        L2: {
          if (param0 <= -119) {
            break L2;
          } else {
            field_j = null;
            break L2;
          }
        }
        L3: {
          if (ib.field_b != -3) {
            break L3;
          } else {
            if (wa.b((byte) -62)) {
              break L3;
            } else {
              var3 = 0;
              break L3;
            }
          }
        }
        if (ei.field_q == 84) {
          L4: {
            if (var3 == 0) {
              if (ib.field_b == 0) {
                break L4;
              } else {
                pg.d(97);
                break L4;
              }
            } else {
              if (-1 < tf.field_g.length()) {
                var4_ref = tf.field_g.toString();
                if (bi.a(var4_ref, true)) {
                  var13 = null;
                  var12 = null;
                  sj.a((String) null, il.field_e, 0, (byte) 21, (String) null, 2);
                  var15 = null;
                  var14 = null;
                  sj.a((String) null, a.field_e, 0, (byte) 21, (String) null, 2);
                  pg.d(81);
                  break L4;
                } else {
                  L5: {
                    var5 = ib.field_b;
                    if (0 != var5) {
                      break L5;
                    } else {
                      if (nf.field_b == null) {
                        break L5;
                      } else {
                        var5 = 1;
                        break L5;
                      }
                    }
                  }
                  if ((ei.a(var5, 1) ^ -1) != -3) {
                    oe.a(param1, en.field_e, -6988, ib.field_b, -1, var4_ref);
                    pg.d(81);
                    break L4;
                  } else {
                    il.a(1, var5, param2, -18853);
                    oe.a(param1, en.field_e, -6988, ib.field_b, -1, var4_ref);
                    pg.d(81);
                    break L4;
                  }
                }
              } else {
                pg.d(81);
                break L4;
              }
            }
          }
          return true;
        } else {
          if ((ei.field_q ^ -1) != -86) {
            var4 = de.field_c;
            if (tf.a(2459, (char) var4)) {
              if (var3 != 0) {
                if (tf.field_g.length() < 80) {
                  L6: {
                    StringBuilder discarded$7 = tf.field_g.append(var4);
                    var5 = 485;
                    var17 = g.field_l;
                    var7 = var17;
                    var7 = var17;
                    var16 = dh.a(-27905, var17);
                    var7 = var16;
                    var7 = var16;
                    var19 = var16;
                    var7 = var19;
                    var7 = var19;
                    if (ib.field_b != 2) {
                      var7 = "";
                      if (-1 != (ib.field_b ^ -1)) {
                        var20 = var7 + var19 + ": ";
                        var5 = var5 - pl.field_X.c(var20);
                        break L6;
                      } else {
                        L7: {
                          if (nf.field_b != null) {
                            break L7;
                          } else {
                            if (!cd.field_g) {
                              break L7;
                            } else {
                              var7 = "[" + kh.field_p + "] ";
                              break L7;
                            }
                          }
                        }
                        if (null != nf.field_b) {
                          if (!cc.field_lc) {
                            var7 = "[" + db.a(pd.field_ab, -98, new String[1]) + "] ";
                            var20 = var7 + var19 + ": ";
                            var5 = var5 - pl.field_X.c(var20);
                            if (var5 < pl.field_X.c(tf.field_g.toString())) {
                              StringBuilder discarded$8 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
                              return true;
                            } else {
                              return true;
                            }
                          } else {
                            if (null == qd.field_a) {
                              var7 = "[" + db.a(pd.field_ab, -98, new String[1]) + "] ";
                              var20 = var7 + var19 + ": ";
                              var5 = var5 - pl.field_X.c(var20);
                              if (var5 < pl.field_X.c(tf.field_g.toString())) {
                                StringBuilder discarded$9 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
                                return true;
                              } else {
                                return true;
                              }
                            } else {
                              var7 = "[" + qd.field_a + "] ";
                              var20 = var7 + var19 + ": ";
                              var5 = var5 - pl.field_X.c(var20);
                              if (var5 < pl.field_X.c(tf.field_g.toString())) {
                                StringBuilder discarded$10 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
                                return true;
                              } else {
                                return true;
                              }
                            }
                          }
                        } else {
                          var20 = var7 + var19 + ": ";
                          var5 = var5 - pl.field_X.c(var20);
                          if (var5 < pl.field_X.c(tf.field_g.toString())) {
                            StringBuilder discarded$11 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
                            return true;
                          } else {
                            return true;
                          }
                        }
                      }
                    } else {
                      var23 = (CharSequence) (Object) en.field_e;
                      var18 = db.a(hh.field_d, -19, new String[1]);
                      var7 = var18;
                      var7 = var18;
                      var8 = db.a(ak.field_e, -87, new String[1]);
                      var7 = var8;
                      var7 = var8;
                      var9 = pl.field_X.c(var18);
                      var10 = pl.field_X.c(var8);
                      if (var10 >= var9) {
                        var5 = var5 - var10;
                        break L6;
                      } else {
                        var5 = var5 - var9;
                        break L6;
                      }
                    }
                  }
                  if (var5 < pl.field_X.c(tf.field_g.toString())) {
                    StringBuilder discarded$12 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            if (var3 != 0) {
              if (0 >= tf.field_g.length()) {
                return true;
              } else {
                StringBuilder discarded$13 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_e = null;
        field_g = null;
        field_f = null;
        field_d = null;
        if (param0 != 690) {
          field_e = null;
          field_h = null;
          return;
        } else {
          field_h = null;
          return;
        }
    }

    final static boolean a(int param0, boolean param1, int param2) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (param0 == 1) {
          if (param2 % 2 == 0) {
            if (param0 == -6) {
              L0: {
                if (param2 != 2) {
                  stackOut_42_0 = 0;
                  stackIn_43_0 = stackOut_42_0;
                  break L0;
                } else {
                  stackOut_41_0 = 1;
                  stackIn_43_0 = stackOut_41_0;
                  break L0;
                }
              }
              return stackIn_43_0 != 0;
            } else {
              if (param1) {
                L1: {
                  field_h = null;
                  if (-3 > param2) {
                    stackOut_51_0 = 0;
                    stackIn_52_0 = stackOut_51_0;
                    break L1;
                  } else {
                    stackOut_50_0 = 1;
                    stackIn_52_0 = stackOut_50_0;
                    break L1;
                  }
                }
                return stackIn_52_0 != 0;
              } else {
                L2: {
                  if (-3 < param2) {
                    stackOut_47_0 = 0;
                    stackIn_48_0 = stackOut_47_0;
                    break L2;
                  } else {
                    stackOut_46_0 = 1;
                    stackIn_48_0 = stackOut_46_0;
                    break L2;
                  }
                }
                return stackIn_48_0 != 0;
              }
            }
          } else {
            return false;
          }
        } else {
          if (4 == param0) {
            if (param2 % 2 == 0) {
              if (param0 == -6) {
                L3: {
                  if (param2 != 2) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L3;
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    break L3;
                  }
                }
                return stackIn_25_0 != 0;
              } else {
                if (!param1) {
                  L4: {
                    if (-3 > param2) {
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      break L4;
                    } else {
                      stackOut_32_0 = 1;
                      stackIn_34_0 = stackOut_32_0;
                      break L4;
                    }
                  }
                  return stackIn_34_0 != 0;
                } else {
                  L5: {
                    field_h = null;
                    if (-3 < param2) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L5;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L5;
                    }
                  }
                  return stackIn_30_0 != 0;
                }
              }
            } else {
              return false;
            }
          } else {
            if (param0 == -6) {
              L6: {
                if (param2 != 2) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L6;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L6;
                }
              }
              return stackIn_7_0 != 0;
            } else {
              if (param1) {
                L7: {
                  field_h = null;
                  if (-3 > param2) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L7;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L7;
                  }
                }
                return stackIn_16_0 != 0;
              } else {
                L8: {
                  if (-3 < param2) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L8;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L8;
                  }
                }
                return stackIn_12_0 != 0;
              }
            }
          }
        }
    }

    final static boolean a(byte param0) {
        if (param0 <= 115) {
            he.a(false, 31, -36, -44, -98);
            return vb.b(-124);
        }
        return vb.b(-124);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Rated game";
        field_k = 0;
        field_h = "NOT ENGINEERED";
        field_j = "Invite players";
        field_f = "Hide private chat and appear offline to friends";
        field_d = "ALT+<img=26> drops target lock: Off";
    }
}
