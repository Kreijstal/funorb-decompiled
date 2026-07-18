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
        ag.field_s = param1;
    }

    final static boolean a(int param0, kj param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1.g(49, 1) != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("he.K(").append(-1766).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static boolean a(byte param0, int param1, int param2) {
        int var3 = 0;
        String var4_ref_String = null;
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
          if (ib.field_b != 2) {
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
              if (tf.field_g.length() > 0) {
                var4_ref_String = tf.field_g.toString();
                if (bi.a(var4_ref_String, true)) {
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
                  if (ei.a(var5, 1) != 2) {
                    oe.a(param1, en.field_e, -6988, ib.field_b, -1, var4_ref_String);
                    pg.d(81);
                    break L4;
                  } else {
                    il.a(1, var5, param2, -18853);
                    oe.a(param1, en.field_e, -6988, ib.field_b, -1, var4_ref_String);
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
          if (ei.field_q != 85) {
            var4 = de.field_c;
            if (!tf.a(2459, (char) var4)) {
              return false;
            } else {
              if (var3 != 0) {
                if (tf.field_g.length() < 80) {
                  L6: {
                    StringBuilder discarded$7 = tf.field_g.append((char) var4);
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
                      if (ib.field_b != 0) {
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
                            if (var5 >= pl.field_X.c(tf.field_g.toString())) {
                              return true;
                            } else {
                              StringBuilder discarded$8 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
                              return true;
                            }
                          } else {
                            if (null == qd.field_a) {
                              var7 = "[" + db.a(pd.field_ab, -98, new String[1]) + "] ";
                              var20 = var7 + var19 + ": ";
                              var5 = var5 - pl.field_X.c(var20);
                              if (var5 >= pl.field_X.c(tf.field_g.toString())) {
                                return true;
                              } else {
                                StringBuilder discarded$9 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
                                return true;
                              }
                            } else {
                              var7 = "[" + qd.field_a + "] ";
                              var20 = var7 + var19 + ": ";
                              var5 = var5 - pl.field_X.c(var20);
                              if (var5 >= pl.field_X.c(tf.field_g.toString())) {
                                return true;
                              } else {
                                StringBuilder discarded$10 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
                                return true;
                              }
                            }
                          }
                        } else {
                          var20 = var7 + var19 + ": ";
                          var5 = var5 - pl.field_X.c(var20);
                          if (var5 >= pl.field_X.c(tf.field_g.toString())) {
                            return true;
                          } else {
                            StringBuilder discarded$11 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
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
                      if (~var10 <= ~var9) {
                        var5 = var5 - var10;
                        break L6;
                      } else {
                        var5 = var5 - var9;
                        break L6;
                      }
                    }
                  }
                  if (var5 >= pl.field_X.c(tf.field_g.toString())) {
                    return true;
                  } else {
                    StringBuilder discarded$12 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            if (var3 != 0) {
              if (0 < tf.field_g.length()) {
                StringBuilder discarded$13 = dm.a(' ', 200, tf.field_g, -1 + tf.field_g.length());
                return true;
              } else {
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
        field_h = null;
    }

    final static boolean a(int param0, boolean param1, int param2) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (param0 == 1) {
          L0: {
            L1: {
              if (param2 % 2 != 0) {
                break L1;
              } else {
                if (param0 == 5) {
                  L2: {
                    if (param2 != 2) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L2;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L2;
                    }
                  }
                  return stackIn_30_0 != 0;
                } else {
                  field_h = null;
                  if (param2 < 2) {
                    break L1;
                  } else {
                    stackOut_32_0 = 1;
                    stackIn_34_0 = stackOut_32_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_33_0 = 0;
            stackIn_34_0 = stackOut_33_0;
            break L0;
          }
          return stackIn_34_0 != 0;
        } else {
          if (4 == param0) {
            if (param2 % 2 == 0) {
              if (param0 == 5) {
                L3: {
                  if (param2 != 2) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L3;
                  } else {
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L3;
                  }
                }
                return stackIn_19_0 != 0;
              } else {
                L4: {
                  field_h = null;
                  if (param2 < 2) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L4;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L4;
                  }
                }
                return stackIn_23_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            if (param0 == 5) {
              L5: {
                if (param2 != 2) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L5;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L5;
                }
              }
              return stackIn_7_0 != 0;
            } else {
              L6: {
                field_h = null;
                if (param2 < 2) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L6;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L6;
                }
              }
              return stackIn_11_0 != 0;
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
