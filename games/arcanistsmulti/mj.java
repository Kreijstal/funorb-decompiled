/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends jm {
    static kc field_z;
    private vc[] field_q;
    static String field_x;
    static int field_r;
    static kc field_s;
    static String field_v;
    private vc field_t;
    static db field_u;
    static boolean field_w;
    static String field_y;
    static int field_p;

    mj(mj param0, boolean param1) {
        this();
        param0.a(param1, (mj) this, 126);
    }

    final void a(int param0, qb param1) {
        vc[] var3 = null;
        int var4 = 0;
        vc var5 = null;
        int var6 = 0;
        vc[] var7 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var7 = ((mj) this).field_q;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          if (var7.length <= var4) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_d = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(byte param0, int param1, qb[] param2) {
        int var4 = param1;
        if (!(null != ((mj) this).field_q[var4])) {
            ((mj) this).field_q[var4] = new vc();
        }
        int var5 = -59 / ((28 - param0) / 32);
        ((mj) this).field_q[param1].field_b = param2;
    }

    final static void a(int param0, boolean param1) {
        tm.field_d.a(param1, true);
        if (param0 != -6578) {
            mj.a(-82, true);
        }
    }

    public static void a(byte param0) {
        int var1 = -101 % ((16 - param0) / 59);
        field_z = null;
        field_v = null;
        field_x = null;
        field_y = null;
        field_s = null;
        field_u = null;
    }

    final void a(qb[] param0, int param1) {
        vc[] var3 = null;
        int var4 = 0;
        vc var5 = null;
        int var6 = 0;
        vc[] var7 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var7 = ((mj) this).field_q;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            if (param1 != -23165) {
              ((mj) this).field_t = null;
              return;
            } else {
              return;
            }
          } else {
            var5 = var7[var4];
            if (var5 == null) {
              var4++;
              var4++;
              continue L0;
            } else {
              var5.field_b = param0;
              var4++;
              continue L0;
            }
          }
        }
    }

    final static int a(int param0, byte param1, byte[] param2) {
        int var3 = -110 % ((54 - param1) / 44);
        return db.a(param0, false, param2, 0);
    }

    final vc a(byte param0, int param1) {
        if (param0 >= -21) {
          field_s = null;
          ((mj) this).field_q[param1] = new vc();
          return new vc();
        } else {
          ((mj) this).field_q[param1] = new vc();
          return new vc();
        }
    }

    private final void a(boolean param0, mj param1, int param2) {
        int var4 = 0;
        vc var5 = null;
        vc var6 = null;
        int var7 = 0;
        vc stackIn_8_0 = null;
        vc stackIn_9_0 = null;
        vc stackIn_10_0 = null;
        vc stackIn_10_1 = null;
        vc stackOut_7_0 = null;
        vc stackOut_9_0 = null;
        vc stackOut_9_1 = null;
        vc stackOut_8_0 = null;
        vc stackOut_8_1 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        this.a((jm) (Object) param1, 1881);
        if (param2 >= 113) {
          if (!param0) {
            sf.a((Object[]) (Object) ((mj) this).field_q, 0, (Object[]) (Object) param1.field_q, 0, 6);
            return;
          } else {
            var4 = 0;
            L0: while (true) {
              if (-7 >= (var4 ^ -1)) {
                return;
              } else {
                var5 = ((mj) this).field_q[var4];
                if (var5 != null) {
                  L1: {
                    var6 = param1.field_q[var4];
                    stackOut_7_0 = (vc) var5;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var6 == null) {
                      param1.field_q[var4] = new vc();
                      stackOut_9_0 = (vc) (Object) stackIn_9_0;
                      stackOut_9_1 = new vc();
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L1;
                    } else {
                      stackOut_8_0 = (vc) (Object) stackIn_8_0;
                      stackOut_8_1 = (vc) var6;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L1;
                    }
                  }
                  ((vc) (Object) stackIn_10_0).a((vc) (Object) stackIn_10_1, false);
                  var4++;
                  continue L0;
                } else {
                  param1.field_q[var4] = null;
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    public mj() {
        ((mj) this).field_q = new vc[6];
        ((mj) this).field_t = new vc();
        ((mj) this).field_q[0] = new vc();
        vc var1 = new vc();
        var1.a(-17238);
    }

    final static void a(int param0, cg param1, int param2, int param3, dn param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ne var12 = null;
        ArcanistsMulti.a(param2 ^ -26334, (int[]) null, param4, param1.field_Tb, param1.field_Nb, -1, -1, param1.field_Qb, (kc) (Object) param1);
        eo.field_c.a((byte) 72, true);
        eo.field_c.a(0, (int[]) null, 13);
        eo.field_c.d(param2 + 5549);
        var12 = eo.field_c;
        var8 = param3;
        var9 = param6;
        var10 = param0;
        var11 = param5;
        var12.field_l.a(var10, var11, -29466, var9, var8);
        if (param2 != 3) {
          mj.a((byte) -95);
          return;
        } else {
          return;
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        Object var10 = null;
        ag var11 = null;
        vc var16 = null;
        vc var17 = null;
        vc var18 = null;
        vc var19 = null;
        vc var20 = null;
        vc var21 = null;
        vc var22 = null;
        vc var23 = null;
        vc var24 = null;
        vc var25 = null;
        vc var26 = null;
        vc var27 = null;
        vc var28 = null;
        vc var29 = null;
        vc var30 = null;
        vc var31 = null;
        vc var32 = null;
        vc var33 = null;
        vc var34 = null;
        vc var35 = null;
        vc var36 = null;
        vc var37 = null;
        vc var38 = null;
        vc var39 = null;
        vc var40 = null;
        vc var41 = null;
        vc var42 = null;
        vc var46 = null;
        vc var47 = null;
        vc var48 = null;
        vc var49 = null;
        vc var50 = null;
        vc var51 = null;
        vc var52 = null;
        vc var53 = null;
        vc var54 = null;
        vc var55 = null;
        vc var56 = null;
        vc var57 = null;
        vc var58 = null;
        vc var59 = null;
        vc var60 = null;
        vc var61 = null;
        vc var62 = null;
        vc var63 = null;
        qm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        qm stackOut_1_0 = null;
        L0: {
          if (!(param0 instanceof ag)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (qm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (qm) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var11 = (ag) (Object) stackIn_3_0;
        if (param1 == 5592405) {
          L1: {
            da.a(param0.field_v + param0.field_n + param2, param0.field_j + param3 - -param0.field_k, 127, param0.field_n + param2, param3 + param0.field_j);
            if (var11 != null) {
              param4 = param4 & var11.field_B;
              break L1;
            } else {
              break L1;
            }
          }
          var22 = ((mj) this).field_q[0];
          ((mj) this).field_t.a(-17238);
          var22.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
          if (var11 != null) {
            if (var11.field_z) {
              var38 = ((mj) this).field_q[1];
              if (var38 == null) {
                L2: {
                  if (!var11.field_w) {
                    break L2;
                  } else {
                    var57 = ((mj) this).field_q[3];
                    if (var11.field_t == 0) {
                      var53 = ((mj) this).field_q[2];
                      if (var53 == null) {
                        break L2;
                      } else {
                        L3: {
                          var53.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                          if (!param0.d(-2116)) {
                            break L3;
                          } else {
                            var54 = ((mj) this).field_q[5];
                            if (var54 == null) {
                              break L3;
                            } else {
                              var54.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                              if (param4) {
                                ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                                oo.c(-15405);
                                return;
                              } else {
                                var55 = ((mj) this).field_q[4];
                                if (var55 != null) {
                                  var55.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                                  ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                                  oo.c(-15405);
                                  return;
                                } else {
                                  ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                                  oo.c(-15405);
                                  return;
                                }
                              }
                            }
                          }
                        }
                        if (param4) {
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        } else {
                          var56 = ((mj) this).field_q[4];
                          if (var56 != null) {
                            var56.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                            ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                            oo.c(-15405);
                            return;
                          } else {
                            ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                            oo.c(-15405);
                            return;
                          }
                        }
                      }
                    } else {
                      if (var57 != null) {
                        L4: {
                          var57.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                          if (!param0.d(-2116)) {
                            break L4;
                          } else {
                            var58 = ((mj) this).field_q[5];
                            if (var58 == null) {
                              break L4;
                            } else {
                              var58.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                              if (param4) {
                                ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                                oo.c(-15405);
                                return;
                              } else {
                                var59 = ((mj) this).field_q[4];
                                if (var59 != null) {
                                  var59.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                                  ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                                  oo.c(-15405);
                                  return;
                                } else {
                                  ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                                  oo.c(-15405);
                                  return;
                                }
                              }
                            }
                          }
                        }
                        if (param4) {
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        } else {
                          var60 = ((mj) this).field_q[4];
                          if (var60 == null) {
                            ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                            oo.c(-15405);
                            return;
                          } else {
                            var60.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                            ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                            oo.c(-15405);
                            return;
                          }
                        }
                      } else {
                        var47 = ((mj) this).field_q[2];
                        if (var47 == null) {
                          L5: {
                            if (!param0.d(-2116)) {
                              break L5;
                            } else {
                              var50 = ((mj) this).field_q[5];
                              if (var50 == null) {
                                break L5;
                              } else {
                                var50.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                                if (param4) {
                                  ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                                  oo.c(-15405);
                                  return;
                                } else {
                                  var51 = ((mj) this).field_q[4];
                                  if (var51 != null) {
                                    var51.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                                    ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                                    oo.c(-15405);
                                    return;
                                  } else {
                                    ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                                    oo.c(-15405);
                                    return;
                                  }
                                }
                              }
                            }
                          }
                          if (param4) {
                            ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                            oo.c(-15405);
                            return;
                          } else {
                            var52 = ((mj) this).field_q[4];
                            if (var52 != null) {
                              var52.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                              ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                              oo.c(-15405);
                              return;
                            } else {
                              ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                              oo.c(-15405);
                              return;
                            }
                          }
                        } else {
                          L6: {
                            var47.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                            if (!param0.d(-2116)) {
                              break L6;
                            } else {
                              var48 = ((mj) this).field_q[5];
                              if (var48 == null) {
                                break L6;
                              } else {
                                var48.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                                break L6;
                              }
                            }
                          }
                          if (param4) {
                            ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                            oo.c(-15405);
                            return;
                          } else {
                            var49 = ((mj) this).field_q[4];
                            if (var49 != null) {
                              var49.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                              ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                              oo.c(-15405);
                              return;
                            } else {
                              ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                              oo.c(-15405);
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L7: {
                  if (!param0.d(-2116)) {
                    break L7;
                  } else {
                    var61 = ((mj) this).field_q[5];
                    if (var61 == null) {
                      break L7;
                    } else {
                      var61.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                      if (param4) {
                        ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                        oo.c(-15405);
                        return;
                      } else {
                        var62 = ((mj) this).field_q[4];
                        if (var62 == null) {
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        } else {
                          var62.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        }
                      }
                    }
                  }
                }
                if (param4) {
                  ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                  oo.c(-15405);
                  return;
                } else {
                  var63 = ((mj) this).field_q[4];
                  if (var63 == null) {
                    ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                    oo.c(-15405);
                    return;
                  } else {
                    var63.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                    ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                    oo.c(-15405);
                    return;
                  }
                }
              } else {
                L8: {
                  var38.a(param0, param3, ((mj) this).field_t, (mj) this, param1 ^ -2141891243, param2);
                  if (!var11.field_w) {
                    break L8;
                  } else {
                    L9: {
                      var40 = ((mj) this).field_q[3];
                      if (var11.field_t == 0) {
                        break L9;
                      } else {
                        if (var40 != null) {
                          var40.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var39 = ((mj) this).field_q[2];
                    if (var39 == null) {
                      break L8;
                    } else {
                      var39.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                      break L8;
                    }
                  }
                }
                L10: {
                  if (!param0.d(-2116)) {
                    break L10;
                  } else {
                    var41 = ((mj) this).field_q[5];
                    if (var41 == null) {
                      break L10;
                    } else {
                      var41.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                      if (param4) {
                        ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                        oo.c(-15405);
                        return;
                      } else {
                        var42 = ((mj) this).field_q[4];
                        if (var42 != null) {
                          var42.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        } else {
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        }
                      }
                    }
                  }
                }
                if (param4) {
                  ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                  oo.c(-15405);
                  return;
                } else {
                  var46 = ((mj) this).field_q[4];
                  if (var46 != null) {
                    var46.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                    ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                    oo.c(-15405);
                    return;
                  } else {
                    ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                    oo.c(-15405);
                    return;
                  }
                }
              }
            } else {
              L11: {
                if (!var11.field_w) {
                  break L11;
                } else {
                  var32 = ((mj) this).field_q[3];
                  if (var11.field_t == 0) {
                    var29 = ((mj) this).field_q[2];
                    if (var29 == null) {
                      break L11;
                    } else {
                      L12: {
                        var29.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                        if (!param0.d(-2116)) {
                          break L12;
                        } else {
                          var30 = ((mj) this).field_q[5];
                          if (var30 == null) {
                            break L12;
                          } else {
                            var30.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                            break L12;
                          }
                        }
                      }
                      if (!param4) {
                        var31 = ((mj) this).field_q[4];
                        if (var31 != null) {
                          var31.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        } else {
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        }
                      } else {
                        ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                        oo.c(-15405);
                        return;
                      }
                    }
                  } else {
                    if (var32 != null) {
                      L13: {
                        var32.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                        if (!param0.d(-2116)) {
                          break L13;
                        } else {
                          var33 = ((mj) this).field_q[5];
                          if (var33 == null) {
                            break L13;
                          } else {
                            var33.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                            break L13;
                          }
                        }
                      }
                      if (!param4) {
                        var34 = ((mj) this).field_q[4];
                        if (var34 != null) {
                          var34.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        } else {
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        }
                      } else {
                        ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                        oo.c(-15405);
                        return;
                      }
                    } else {
                      L14: {
                        var26 = ((mj) this).field_q[2];
                        if (var26 == null) {
                          break L14;
                        } else {
                          var26.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                          break L14;
                        }
                      }
                      L15: {
                        if (!param0.d(-2116)) {
                          break L15;
                        } else {
                          var27 = ((mj) this).field_q[5];
                          if (var27 == null) {
                            break L15;
                          } else {
                            var27.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                            break L15;
                          }
                        }
                      }
                      if (!param4) {
                        var28 = ((mj) this).field_q[4];
                        if (var28 != null) {
                          var28.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        } else {
                          ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                          oo.c(-15405);
                          return;
                        }
                      } else {
                        ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                        oo.c(-15405);
                        return;
                      }
                    }
                  }
                }
              }
              L16: {
                if (!param0.d(-2116)) {
                  break L16;
                } else {
                  var35 = ((mj) this).field_q[5];
                  if (var35 == null) {
                    break L16;
                  } else {
                    var35.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                    if (!param4) {
                      var36 = ((mj) this).field_q[4];
                      if (var36 != null) {
                        var36.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                        ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                        oo.c(-15405);
                        return;
                      } else {
                        ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                        oo.c(-15405);
                        return;
                      }
                    } else {
                      ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                      oo.c(-15405);
                      return;
                    }
                  }
                }
              }
              if (!param4) {
                var37 = ((mj) this).field_q[4];
                if (var37 != null) {
                  var37.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                  ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                  oo.c(-15405);
                  return;
                } else {
                  ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                  oo.c(-15405);
                  return;
                }
              } else {
                ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                oo.c(-15405);
                return;
              }
            }
          } else {
            L17: {
              if (!param0.d(-2116)) {
                break L17;
              } else {
                var23 = ((mj) this).field_q[5];
                if (var23 == null) {
                  break L17;
                } else {
                  var23.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                  if (!param4) {
                    var24 = ((mj) this).field_q[4];
                    if (var24 != null) {
                      var24.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                      ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                      oo.c(-15405);
                      return;
                    } else {
                      ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                      oo.c(-15405);
                      return;
                    }
                  } else {
                    ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                    oo.c(-15405);
                    return;
                  }
                }
              }
            }
            if (!param4) {
              var25 = ((mj) this).field_q[4];
              if (var25 != null) {
                var25.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                oo.c(-15405);
                return;
              } else {
                ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
                oo.c(-15405);
                return;
              }
            } else {
              ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
              oo.c(-15405);
              return;
            }
          }
        } else {
          L18: {
            var10 = null;
            ((mj) this).a((byte) 33, 29, (qb[]) null);
            da.a(param0.field_v + param0.field_n + param2, param0.field_j + param3 - -param0.field_k, 127, param0.field_n + param2, param3 + param0.field_j);
            if (var11 != null) {
              param4 = param4 & var11.field_B;
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            var16 = ((mj) this).field_q[0];
            ((mj) this).field_t.a(-17238);
            var16.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
            if (var11 == null) {
              break L19;
            } else {
              L20: {
                if (!var11.field_z) {
                  break L20;
                } else {
                  var17 = ((mj) this).field_q[1];
                  if (var17 == null) {
                    break L20;
                  } else {
                    var17.a(param0, param3, ((mj) this).field_t, (mj) this, param1 ^ -2141891243, param2);
                    break L20;
                  }
                }
              }
              if (!var11.field_w) {
                break L19;
              } else {
                L21: {
                  var19 = ((mj) this).field_q[3];
                  if (var11.field_t == 0) {
                    break L21;
                  } else {
                    if (var19 != null) {
                      var19.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
                      break L19;
                    } else {
                      break L21;
                    }
                  }
                }
                var18 = ((mj) this).field_q[2];
                if (var18 == null) {
                  break L19;
                } else {
                  var18.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                  break L19;
                }
              }
            }
          }
          L22: {
            if (!param0.d(-2116)) {
              break L22;
            } else {
              var20 = ((mj) this).field_q[5];
              if (var20 == null) {
                break L22;
              } else {
                var20.a(param0, param3, ((mj) this).field_t, (mj) this, -2147483648, param2);
                break L22;
              }
            }
          }
          if (!param4) {
            var21 = ((mj) this).field_q[4];
            if (var21 != null) {
              var21.a(param0, param3, ((mj) this).field_t, (mj) this, param1 + 2141891243, param2);
              ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
              oo.c(-15405);
              return;
            } else {
              ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
              oo.c(-15405);
              return;
            }
          } else {
            ((mj) this).field_t.a(param3, (mj) this, (byte) 110, param0, param2);
            oo.c(-15405);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Rechargeable spell";
        field_v = "Loading sound effects";
        field_u = new db();
        field_p = -1;
        field_y = "Win %";
    }
}
