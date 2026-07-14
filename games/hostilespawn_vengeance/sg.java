/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    private lm field_n;
    static ll field_d;
    static ri field_j;
    private dh field_f;
    private ej field_p;
    private java.math.BigInteger field_k;
    private rb[] field_h;
    private vi field_b;
    private java.math.BigInteger field_l;
    static String field_g;
    static int field_i;
    static String field_m;
    static ub field_c;
    static volatile int field_o;
    static int field_a;
    static String field_e;

    public static void b(int param0) {
        field_c = null;
        if (param0 >= -51) {
            Object var2 = null;
            pg[] discarded$0 = sg.a(true, (String) null, (gb) null, (String) null);
        }
        field_m = null;
        field_g = null;
        field_e = null;
        field_d = null;
        field_j = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        if (null == ((sg) this).field_h) {
            return;
        }
        for (var2 = 0; (((sg) this).field_h.length ^ -1) < (var2 ^ -1); var2++) {
            if (!(null == ((sg) this).field_h[var2])) {
                ((sg) this).field_h[var2].d(40);
            }
        }
        if (param0 != -11) {
            return;
        }
        int var4 = 0;
        var2 = var4;
        while (((sg) this).field_h.length > var4) {
            if (((sg) this).field_h[var4] != null) {
                ((sg) this).field_h[var4].f(-1);
            }
            var4++;
        }
    }

    sg(ej param0, dh param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static pg[] a(boolean param0, String param1, gb param2, String param3) {
        int var4 = param2.a((byte) -2, param1);
        if (!param0) {
            return null;
        }
        int var5 = param2.a(var4, param3, -1);
        return qi.a(var4, (byte) 118, var5, param2);
    }

    final static void a(boolean param0) {
        oc var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        og var9 = null;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        p var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        oj var26 = null;
        int[] var27 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        var24 = HostileSpawn.field_I ? 1 : 0;
        var26 = mm.field_m[0];
        var2 = var26.field_j;
        var3 = var2.b(-4);
        var36 = ln.field_a.field_c;
        var33 = var36;
        var30 = var33;
        var27 = var30;
        var4 = var27;
        var37 = ln.field_a.field_f;
        var38 = ln.field_a.field_u;
        var35 = var38;
        var32 = var35;
        var29 = var32;
        var6 = var29;
        var36[var3] = 0;
        var7 = var2.field_e;
        var8 = var2.field_g;
        var9 = var26.field_l;
        var10 = var9.field_f;
        var12 = var9.field_a;
        var14 = (double)var7 + var10;
        var16 = (double)var8 + var12;
        var18 = 0;
        L0: while (true) {
          if (var18 >= ib.field_c) {
            var25 = -1 + ib.field_c;
            var18 = var25;
            L1: while (true) {
              if ((var25 ^ -1) > -1) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    boolean discarded$1 = sg.a('ￂ', true);
                    break L2;
                  }
                }
                var36[var3] = 3;
                return;
              } else {
                L3: {
                  if (-1 != jn.field_F[var25].field_i) {
                    break L3;
                  } else {
                    ib.field_c = ib.field_c - 1;
                    jn.field_F[var25].field_c = jn.field_F[ib.field_c].field_c;
                    jn.field_F[var25].field_l.a(jn.field_F[ib.field_c].field_l, -28860);
                    jn.field_F[var25].field_j.a((byte) 46, jn.field_F[ib.field_c].field_j);
                    jn.field_F[var25].field_h = jn.field_F[ib.field_c].field_h;
                    jn.field_F[var25].field_e = jn.field_F[ib.field_c].field_e;
                    jn.field_F[var25].field_i = jn.field_F[ib.field_c].field_i;
                    break L3;
                  }
                }
                var25--;
                continue L1;
              }
            }
          } else {
            L4: {
              var19 = jn.field_F[var18];
              var20 = var19.field_i;
              var21 = var19.field_j.field_e + -var7;
              var22 = -var8 + var19.field_j.field_g;
              if (-1 < (var21 ^ -1)) {
                var21 = -var21;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 > var22) {
                var22 = -var22;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              L7: {
                L8: {
                  if (30 < var21) {
                    break L8;
                  } else {
                    if (var22 > 25) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                if (var20 == 5) {
                  break L7;
                } else {
                  if (24 == var20) {
                    break L7;
                  } else {
                    var19.field_i = -1;
                    break L6;
                  }
                }
              }
              L9: {
                var23 = var20;
                if (-21 == (var23 ^ -1)) {
                  break L9;
                } else {
                  if ((var23 ^ -1) != -1) {
                    if ((var23 ^ -1) != -19) {
                      if ((var23 ^ -1) != -24) {
                        if (32 == var23) {
                          break L9;
                        } else {
                          if (9 != var23) {
                            if (var23 == 1) {
                              var19.a(8573);
                              var19.field_l.a(2, (byte) 94, var19.field_c);
                              var19.field_e = var19.field_e + 1;
                              if (-17 <= (var19.field_e ^ -1)) {
                                break L6;
                              } else {
                                var19.field_i = -1;
                                break L6;
                              }
                            } else {
                              if ((var23 ^ -1) == -3) {
                                var19.field_e = var19.field_e + 1;
                                if (32 >= var19.field_e) {
                                  break L6;
                                } else {
                                  var19.field_i = -1;
                                  break L6;
                                }
                              } else {
                                if (3 == var23) {
                                  var19.field_e = var19.field_e + 1;
                                  if (var19.field_e <= 32) {
                                    break L6;
                                  } else {
                                    var19.field_i = -1;
                                    break L6;
                                  }
                                } else {
                                  if (-22 == (var23 ^ -1)) {
                                    var19.a(8573);
                                    var19.field_e = var19.field_e + 1;
                                    if (-7 <= (var19.field_e ^ -1)) {
                                      break L6;
                                    } else {
                                      var19.field_i = -1;
                                      break L6;
                                    }
                                  } else {
                                    L10: {
                                      if ((var23 ^ -1) != -5) {
                                        if (var23 == 28) {
                                          break L10;
                                        } else {
                                          L11: {
                                            if (-6 != (var23 ^ -1)) {
                                              if (var23 == 24) {
                                                break L11;
                                              } else {
                                                if (-7 == (var23 ^ -1)) {
                                                  L12: {
                                                    var19.a(8573);
                                                    if (2 == var4[var19.field_j.b(-4)]) {
                                                      break L12;
                                                    } else {
                                                      var19.field_l.a(1, (byte) 94, var19.field_c);
                                                      break L12;
                                                    }
                                                  }
                                                  var19.field_e = var19.field_e + 1;
                                                  if (16 >= var19.field_e) {
                                                    break L6;
                                                  } else {
                                                    var19.field_i = -1;
                                                    break L6;
                                                  }
                                                } else {
                                                  if ((var23 ^ -1) != -38) {
                                                    L13: {
                                                      if (-8 != (var23 ^ -1)) {
                                                        if (-27 != (var23 ^ -1)) {
                                                          if ((var23 ^ -1) == -9) {
                                                            L14: {
                                                              if (var4[var19.field_j.b(-4)] != 2) {
                                                                var19.field_l.a(var19.field_h, (byte) 94, var19.field_c);
                                                                break L14;
                                                              } else {
                                                                break L14;
                                                              }
                                                            }
                                                            var19.a(8573);
                                                            var19.field_e = var19.field_e + 1;
                                                            if (32 < var19.field_e) {
                                                              var19.field_i = -1;
                                                              break L6;
                                                            } else {
                                                              break L6;
                                                            }
                                                          } else {
                                                            L15: {
                                                              if (-11 == (var23 ^ -1)) {
                                                                break L15;
                                                              } else {
                                                                if ((var23 ^ -1) == -26) {
                                                                  break L15;
                                                                } else {
                                                                  L16: {
                                                                    if ((var23 ^ -1) == -12) {
                                                                      break L16;
                                                                    } else {
                                                                      if (var23 != 34) {
                                                                        if (-34 != (var23 ^ -1)) {
                                                                          if (var23 == 12) {
                                                                            var19.field_e = var19.field_e + 4;
                                                                            if (var19.field_e <= 128) {
                                                                              break L6;
                                                                            } else {
                                                                              var19.field_i = -1;
                                                                              break L6;
                                                                            }
                                                                          } else {
                                                                            if ((var23 ^ -1) != -14) {
                                                                              if ((var23 ^ -1) != -15) {
                                                                                if (-16 == (var23 ^ -1)) {
                                                                                  in.a(var14, var19, (byte) 29, var36, var3, var16);
                                                                                  break L6;
                                                                                } else {
                                                                                  if (var23 != 16) {
                                                                                    if (17 == var23) {
                                                                                      var6[var19.field_j.b(-4)] = 100;
                                                                                      fm.a(var19, true, var20, var36);
                                                                                      break L6;
                                                                                    } else {
                                                                                      if (30 != var23) {
                                                                                        L17: {
                                                                                          if ((var23 ^ -1) == -20) {
                                                                                            break L17;
                                                                                          } else {
                                                                                            if (-30 == (var23 ^ -1)) {
                                                                                              break L17;
                                                                                            } else {
                                                                                              L18: {
                                                                                                if (-23 != (var23 ^ -1)) {
                                                                                                  if ((var23 ^ -1) == -28) {
                                                                                                    break L18;
                                                                                                  } else {
                                                                                                    L19: {
                                                                                                      if ((var23 ^ -1) != -32) {
                                                                                                        if ((var23 ^ -1) == -36) {
                                                                                                          break L19;
                                                                                                        } else {
                                                                                                          if (var23 == 36) {
                                                                                                            nf.a(var19, (byte) 70);
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            break L6;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        break L19;
                                                                                                      }
                                                                                                    }
                                                                                                    ia.a(var19, var36, -14808);
                                                                                                    break L6;
                                                                                                  }
                                                                                                } else {
                                                                                                  break L18;
                                                                                                }
                                                                                              }
                                                                                              hh.a(false, var19, var36);
                                                                                              break L6;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        lj.a(var36, var3, 0, var19);
                                                                                        break L6;
                                                                                      } else {
                                                                                        var6[var19.field_j.b(-4)] = 100;
                                                                                        fm.a(var19, true, var20, var36);
                                                                                        var18++;
                                                                                        continue L0;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    ei.a(var19, (byte) -116, var37, var3, var36, var38);
                                                                                    break L6;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                he.a(var19, var26, (byte) 110, var16, var14);
                                                                                break L6;
                                                                              }
                                                                            } else {
                                                                              ml.a((byte) -128, var14, var16, var19, var36, var26, var3);
                                                                              break L6;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          rj.a(var19, -2312);
                                                                          break L6;
                                                                        }
                                                                      } else {
                                                                        break L16;
                                                                      }
                                                                    }
                                                                  }
                                                                  vd.a(var19, -127);
                                                                  break L6;
                                                                }
                                                              }
                                                            }
                                                            ui.a(var16, var36, var19, var3, var20, var14, false);
                                                            break L6;
                                                          }
                                                        } else {
                                                          break L13;
                                                        }
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                    vc.a(var3, -11112, var36, var19);
                                                    break L6;
                                                  } else {
                                                    L20: {
                                                      var19.field_l.field_f = var19.field_l.field_f - Math.sin(3.141592653589793 * var19.field_c / 128.0) * 0.05;
                                                      var19.field_l.field_a = var19.field_l.field_a - 0.05 * Math.cos(3.141592653589793 * var19.field_c / 128.0);
                                                      var19.a(8573);
                                                      if (2 <= var4[var19.field_j.b(-4)]) {
                                                        break L20;
                                                      } else {
                                                        var19.field_l.a(1, (byte) 94, var19.field_c);
                                                        break L20;
                                                      }
                                                    }
                                                    var19.field_e = var19.field_e + 1;
                                                    if (16 >= var19.field_e) {
                                                      break L6;
                                                    } else {
                                                      var19.field_i = -1;
                                                      break L6;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L11;
                                            }
                                          }
                                          sc.a(var3, var19, var36, 1);
                                          break L6;
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                    ng.a((byte) 78, var19, var3, var20, var36);
                                    break L6;
                                  }
                                }
                              }
                            }
                          } else {
                            jm.a(var36, var3, (byte) -128, var19);
                            break L6;
                          }
                        }
                      } else {
                        pa.a(var19, var3, var36, false);
                        break L6;
                      }
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
              }
              pa.a(var19, var3, var36, false);
              break L6;
            }
            var18++;
            continue L0;
          }
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        vi var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (((sg) this).field_b != null) {
          return true;
        } else {
          L0: {
            if (((sg) this).field_n != null) {
              break L0;
            } else {
              if (!((sg) this).field_p.a(20)) {
                ((sg) this).field_n = ((sg) this).field_p.a((byte) 0, 255, 255, -18986, true);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (((sg) this).field_n.field_v) {
            return false;
          } else {
            if (param0 == -26720) {
              L1: {
                L2: {
                  var10 = new vi(((sg) this).field_n.c((byte) 127));
                  var10.field_i = 5;
                  var3 = var10.l(32270);
                  var10.field_i = var10.field_i + var3 * 72;
                  var16 = new byte[var10.field_n.length + -var10.field_i];
                  var14 = var16;
                  var13 = var14;
                  var11 = var13;
                  var4 = var11;
                  var10.a(var16.length, 0, var16, param0 + 8539);
                  if (((sg) this).field_k == null) {
                    break L2;
                  } else {
                    if (null != ((sg) this).field_l) {
                      var12 = new java.math.BigInteger(var16);
                      var7_ref = var12.modPow(((sg) this).field_k, ((sg) this).field_l);
                      var5 = var7_ref.toByteArray();
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if (65 == var5.length) {
                var17 = ld.a(var10.field_n, 5, 113, -5 + (var10.field_i + -var16.length));
                var7 = 0;
                L3: while (true) {
                  if (64 <= var7) {
                    ((sg) this).field_b = var10;
                    ((sg) this).field_h = new rb[var3];
                    return true;
                  } else {
                    if ((var5[1 + var7] ^ -1) != (var17[var7] ^ -1)) {
                      throw new RuntimeException();
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              return true;
            }
          }
        }
    }

    final rb a(boolean param0, int param1, um param2, um param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        rb var9 = null;
        byte[] var11 = null;
        if (null == ((sg) this).field_b) {
          throw new RuntimeException();
        } else {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (((sg) this).field_h.length > param1) {
                if (((sg) this).field_h[param1] == null) {
                  ((sg) this).field_b.field_i = 6 + param1 * 72;
                  var6 = ((sg) this).field_b.d(8195);
                  var7 = ((sg) this).field_b.d(8195);
                  var11 = new byte[64];
                  ((sg) this).field_b.a(64, param4, var11, -18181);
                  var9 = new rb(param1, param3, param2, ((sg) this).field_p, ((sg) this).field_f, var6, var11, var7, param0);
                  ((sg) this).field_h[param1] = var9;
                  return var9;
                } else {
                  return ((sg) this).field_h[param1];
                }
              } else {
                break L0;
              }
            }
          }
          throw new RuntimeException();
        }
    }

    final static String d(int param0) {
        if (param0 != 24) {
            boolean discarded$0 = sg.a('ﾊ', false);
        }
        return bi.field_c[fl.d(-97)];
    }

    final static boolean a(char param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (!(!rf.a(param1, param0))) {
            return true;
        }
        char[] var6 = pk.field_g;
        char[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if ((param0 ^ -1) == (var4 ^ -1)) {
                return true;
            }
        }
        char[] var7 = i.field_g;
        var2 = var7;
        int var8 = 0;
        var3 = var8;
        while (var8 < var7.length) {
            var4 = var7[var8];
            if (!((param0 ^ -1) != (var4 ^ -1))) {
                return true;
            }
            var8++;
        }
        return false;
    }

    private sg(ej param0, dh param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((sg) this).field_p = param0;
        ((sg) this).field_f = param1;
        ((sg) this).field_k = param2;
        ((sg) this).field_l = param3;
        if (!((sg) this).field_p.a(20)) {
            ((sg) this).field_n = ((sg) this).field_p.a((byte) 0, 255, 255, -18986, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Unfortunately we are unable to create an account for you at this time.";
        field_d = new ll();
        field_m = "PER MONTH";
        field_o = 0;
        field_a = 0;
        field_c = new ub();
        field_e = "Click";
    }
}
