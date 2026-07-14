/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hf {
    long field_a;
    hf field_b;
    static String field_e;
    hf field_c;
    static rf field_d;

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          tf.a(111, param1);
          pk.h(-120, param1);
          od.b((byte) -24);
          if (param0 <= -90) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          var2 = param1;
          if (var2 != 4) {
            if ((var2 ^ -1) != -4) {
              if (var2 != -2) {
                if (var2 != 0) {
                  if (6 != var2) {
                    if (-6 == var2) {
                      fi.a(0, k.field_f);
                      break L1;
                    } else {
                      if ((var2 ^ -1) != -3) {
                        break L1;
                      } else {
                        fi.a(0, j.field_ib);
                        break L1;
                      }
                    }
                  } else {
                    fi.a(0, wf.field_o);
                    break L1;
                  }
                } else {
                  fi.a(0, ej.field_d);
                  break L1;
                }
              } else {
                fi.a(0, field_d);
                break L1;
              }
            } else {
              fi.a(0, te.field_b);
              break L1;
            }
          } else {
            fi.a(0, qb.field_M);
            break L1;
          }
        }
    }

    final static Object a(int param0, byte[] param1, boolean param2) {
        l var3 = null;
        if (param0 > -102) {
            return null;
        }
        if (param1 == null) {
            return null;
        }
        if (-137 > (param1.length ^ -1)) {
            var3 = new l();
            ((oj) (Object) var3).a(param1, true);
            return (Object) (Object) var3;
        }
        if (!param2) {
            return (Object) (Object) param1;
        }
        return (Object) (Object) nk.a(param1, 0);
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        if (!(null != ((hf) this).field_c)) {
            return;
        }
        ((hf) this).field_c.field_b = ((hf) this).field_b;
        ((hf) this).field_b.field_c = ((hf) this).field_c;
        ((hf) this).field_c = null;
        ((hf) this).field_b = null;
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
        qc var15 = null;
        qc var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        var15 = new qc(param1);
        var16 = var15;
        var16.field_f = param1.length + -2;
        sb.field_a = var16.b(param0);
        rc.field_j = new int[sb.field_a];
        hl.field_K = new int[sb.field_a];
        ng.field_E = new boolean[sb.field_a];
        vf.field_E = new byte[sb.field_a][];
        gh.field_m = new int[sb.field_a];
        mj.field_a = new byte[sb.field_a][];
        md.field_e = new int[sb.field_a];
        var16.field_f = -7 + param1.length + -(sb.field_a * 8);
        pg.field_b = var16.b(true);
        dd.field_C = var16.b(true);
        var3 = (255 & var16.c((byte) 34)) + 1;
        var4 = 0;
        L0: while (true) {
          if (var4 >= sb.field_a) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= sb.field_a) {
                var4 = 0;
                L2: while (true) {
                  if (sb.field_a <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= sb.field_a) {
                        var16.field_f = -(var3 * 3) - -3 + -(8 * sb.field_a) + -7 + param1.length;
                        cm.field_j = new int[var3];
                        var4 = 1;
                        L4: while (true) {
                          if (var4 >= var3) {
                            var16.field_f = 0;
                            var4 = 0;
                            L5: while (true) {
                              if (var4 >= sb.field_a) {
                                return;
                              } else {
                                L6: {
                                  var5 = rc.field_j[var4];
                                  var6 = hl.field_K[var4];
                                  var7 = var5 * var6;
                                  var23 = new byte[var7];
                                  var21 = var23;
                                  var19 = var21;
                                  var17 = var19;
                                  var8 = var17;
                                  mj.field_a[var4] = var23;
                                  var24 = new byte[var7];
                                  var22 = var24;
                                  var20 = var22;
                                  var18 = var20;
                                  var9 = var18;
                                  vf.field_E[var4] = var24;
                                  var10 = 0;
                                  var11 = var16.c((byte) 34);
                                  if ((var11 & 1) != 0) {
                                    var12 = 0;
                                    L7: while (true) {
                                      if (var5 <= var12) {
                                        if (0 != (2 & var11)) {
                                          var12 = 0;
                                          L8: while (true) {
                                            if (var5 <= var12) {
                                              break L6;
                                            } else {
                                              var13 = 0;
                                              L9: while (true) {
                                                if (var6 <= var13) {
                                                  var12++;
                                                  continue L8;
                                                } else {
                                                  L10: {
                                                    var9[var12 - -(var5 * var13)] = var15.f((byte) 78);
                                                    var14 = var15.f((byte) 78);
                                                    stackOut_43_0 = var10;
                                                    stackIn_45_0 = stackOut_43_0;
                                                    stackIn_44_0 = stackOut_43_0;
                                                    if ((var14 ^ -1) == 0) {
                                                      stackOut_45_0 = stackIn_45_0;
                                                      stackOut_45_1 = 0;
                                                      stackIn_46_0 = stackOut_45_0;
                                                      stackIn_46_1 = stackOut_45_1;
                                                      break L10;
                                                    } else {
                                                      stackOut_44_0 = stackIn_44_0;
                                                      stackOut_44_1 = 1;
                                                      stackIn_46_0 = stackOut_44_0;
                                                      stackIn_46_1 = stackOut_44_1;
                                                      break L10;
                                                    }
                                                  }
                                                  var10 = stackIn_46_0 | stackIn_46_1;
                                                  var13++;
                                                  continue L9;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L6;
                                        }
                                      } else {
                                        var13 = 0;
                                        L11: while (true) {
                                          if (var6 <= var13) {
                                            var12++;
                                            continue L7;
                                          } else {
                                            var8[var13 * var5 + var12] = var15.f((byte) 90);
                                            var13++;
                                            continue L11;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var12 = 0;
                                    L12: while (true) {
                                      if (var12 >= var7) {
                                        if ((var11 & 2) == 0) {
                                          break L6;
                                        } else {
                                          var12 = 0;
                                          L13: while (true) {
                                            if (var7 <= var12) {
                                              break L6;
                                            } else {
                                              L14: {
                                                var9[var12] = var15.f((byte) 95);
                                                var13 = var15.f((byte) 95);
                                                stackOut_27_0 = var10;
                                                stackIn_29_0 = stackOut_27_0;
                                                stackIn_28_0 = stackOut_27_0;
                                                if ((var13 ^ -1) == 0) {
                                                  stackOut_29_0 = stackIn_29_0;
                                                  stackOut_29_1 = 0;
                                                  stackIn_30_0 = stackOut_29_0;
                                                  stackIn_30_1 = stackOut_29_1;
                                                  break L14;
                                                } else {
                                                  stackOut_28_0 = stackIn_28_0;
                                                  stackOut_28_1 = 1;
                                                  stackIn_30_0 = stackOut_28_0;
                                                  stackIn_30_1 = stackOut_28_1;
                                                  break L14;
                                                }
                                              }
                                              var10 = stackIn_30_0 | stackIn_30_1;
                                              var12++;
                                              continue L13;
                                            }
                                          }
                                        }
                                      } else {
                                        var8[var12] = var15.f((byte) 90);
                                        var12++;
                                        continue L12;
                                      }
                                    }
                                  }
                                }
                                ng.field_E[var4] = var10 != 0;
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            cm.field_j[var4] = var15.e(108);
                            if (cm.field_j[var4] == 0) {
                              cm.field_j[var4] = 1;
                              var4++;
                              continue L4;
                            } else {
                              var4++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        hl.field_K[var4] = var15.b(true);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    rc.field_j[var4] = var15.b(true);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                md.field_e[var4] = var15.b(true);
                var4++;
                continue L1;
              }
            }
          } else {
            gh.field_m[var4] = var15.b(param0);
            var4++;
            continue L0;
          }
        }
    }

    public static void b(byte param0) {
        field_e = null;
        int var1 = -121 / ((-68 - param0) / 42);
        field_d = null;
    }

    final boolean a(int param0) {
        if (!(null != ((hf) this).field_c)) {
            return false;
        }
        if (param0 < 112) {
            hf.b((byte) 110);
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Connection timed out. Please try using a different server.";
    }
}
