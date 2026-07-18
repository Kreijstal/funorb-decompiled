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

    public static void b() {
        field_c = null;
        field_m = null;
        field_g = null;
        field_e = null;
        field_d = null;
        field_j = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (null != ((sg) this).field_h) {
          var2 = 0;
          L0: while (true) {
            if (((sg) this).field_h.length <= var2) {
              if (param0 == -11) {
                var2 = 0;
                L1: while (true) {
                  if (((sg) this).field_h.length <= var2) {
                    return;
                  } else {
                    if (((sg) this).field_h[var2] != null) {
                      ((sg) this).field_h[var2].f(-1);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (null != ((sg) this).field_h[var2]) {
                ((sg) this).field_h[var2].d(40);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    sg(ej param0, dh param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static pg[] a(boolean param0, String param1, gb param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pg[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        pg[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var4_int = param2.a((byte) -2, param1);
            var5 = param2.a(var4_int, param3, -1);
            stackOut_2_0 = qi.a(var4_int, (byte) 118, var5, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("sg.C(").append(true).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a() {
        RuntimeException var1 = null;
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
        oj var25 = null;
        int[] var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        RuntimeException decompiledCaughtException = null;
        var24 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var25 = mm.field_m[0];
            var2 = var25.field_j;
            var3 = var2.b(-4);
            var35 = ln.field_a.field_c;
            var32 = var35;
            var29 = var32;
            var26 = var29;
            var4 = var26;
            var36 = ln.field_a.field_f;
            var37 = ln.field_a.field_u;
            var34 = var37;
            var31 = var34;
            var28 = var31;
            var6 = var28;
            var35[var3] = 0;
            var7 = var2.field_e;
            var8 = var2.field_g;
            var9 = var25.field_l;
            var10 = var9.field_f;
            var12 = var9.field_a;
            var14 = (double)var7 + var10;
            var16 = (double)var8 + var12;
            var18 = 0;
            L1: while (true) {
              if (var18 >= ib.field_c) {
                var18 = -1 + ib.field_c;
                L2: while (true) {
                  if (var18 < 0) {
                    var35[var3] = 3;
                    break L0;
                  } else {
                    L3: {
                      if (-1 != jn.field_F[var18].field_i) {
                        break L3;
                      } else {
                        ib.field_c = ib.field_c - 1;
                        jn.field_F[var18].field_c = jn.field_F[ib.field_c].field_c;
                        jn.field_F[var18].field_l.a(jn.field_F[ib.field_c].field_l, -28860);
                        jn.field_F[var18].field_j.a((byte) 46, jn.field_F[ib.field_c].field_j);
                        jn.field_F[var18].field_h = jn.field_F[ib.field_c].field_h;
                        jn.field_F[var18].field_e = jn.field_F[ib.field_c].field_e;
                        jn.field_F[var18].field_i = jn.field_F[ib.field_c].field_i;
                        break L3;
                      }
                    }
                    var18--;
                    continue L2;
                  }
                }
              } else {
                L4: {
                  var19 = jn.field_F[var18];
                  var20 = var19.field_i;
                  var21 = var19.field_j.field_e + -var7;
                  var22 = -var8 + var19.field_j.field_g;
                  if (var21 < 0) {
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
                    if (var23 == 20) {
                      break L9;
                    } else {
                      if (var23 != 0) {
                        if (var23 != 18) {
                          if (var23 != 23) {
                            if (32 == var23) {
                              break L9;
                            } else {
                              if (9 != var23) {
                                if (var23 == 1) {
                                  var19.a(8573);
                                  var19.field_l.a(2, (byte) 94, var19.field_c);
                                  var19.field_e = var19.field_e + 1;
                                  if (var19.field_e <= 16) {
                                    break L6;
                                  } else {
                                    var19.field_i = -1;
                                    break L6;
                                  }
                                } else {
                                  if (var23 == 2) {
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
                                      if (var23 == 21) {
                                        var19.a(8573);
                                        var19.field_e = var19.field_e + 1;
                                        if (var19.field_e <= 6) {
                                          break L6;
                                        } else {
                                          var19.field_i = -1;
                                          break L6;
                                        }
                                      } else {
                                        L10: {
                                          if (var23 != 4) {
                                            if (var23 == 28) {
                                              break L10;
                                            } else {
                                              L11: {
                                                if (var23 != 5) {
                                                  if (var23 == 24) {
                                                    break L11;
                                                  } else {
                                                    if (var23 == 6) {
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
                                                      if (var23 != 37) {
                                                        L13: {
                                                          if (var23 != 7) {
                                                            if (var23 != 26) {
                                                              if (var23 == 8) {
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
                                                                  if (var23 == 10) {
                                                                    break L15;
                                                                  } else {
                                                                    if (var23 == 25) {
                                                                      break L15;
                                                                    } else {
                                                                      L16: {
                                                                        if (var23 == 11) {
                                                                          break L16;
                                                                        } else {
                                                                          if (var23 != 34) {
                                                                            if (var23 != 33) {
                                                                              if (var23 == 12) {
                                                                                var19.field_e = var19.field_e + 4;
                                                                                if (var19.field_e <= 128) {
                                                                                  break L6;
                                                                                } else {
                                                                                  var19.field_i = -1;
                                                                                  break L6;
                                                                                }
                                                                              } else {
                                                                                if (var23 != 13) {
                                                                                  if (var23 != 14) {
                                                                                    if (var23 == 15) {
                                                                                      in.a(var14, var19, (byte) 29, var35, var3, var16);
                                                                                      break L6;
                                                                                    } else {
                                                                                      if (var23 != 16) {
                                                                                        if (17 == var23) {
                                                                                          var6[var19.field_j.b(-4)] = 100;
                                                                                          fm.a(var19, true, var20, var35);
                                                                                          break L6;
                                                                                        } else {
                                                                                          if (30 != var23) {
                                                                                            L17: {
                                                                                              if (var23 == 19) {
                                                                                                break L17;
                                                                                              } else {
                                                                                                if (var23 == 29) {
                                                                                                  break L17;
                                                                                                } else {
                                                                                                  L18: {
                                                                                                    if (var23 != 22) {
                                                                                                      if (var23 == 27) {
                                                                                                        break L18;
                                                                                                      } else {
                                                                                                        L19: {
                                                                                                          if (var23 != 31) {
                                                                                                            if (var23 == 35) {
                                                                                                              break L19;
                                                                                                            } else {
                                                                                                              if (var23 == 36) {
                                                                                                                int discarded$3 = 70;
                                                                                                                nf.a(var19);
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                break L6;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L19;
                                                                                                          }
                                                                                                        }
                                                                                                        ia.a(var19, var35, -14808);
                                                                                                        break L6;
                                                                                                      }
                                                                                                    } else {
                                                                                                      break L18;
                                                                                                    }
                                                                                                  }
                                                                                                  hh.a(false, var19, var35);
                                                                                                  break L6;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            lj.a(var35, var3, 0, var19);
                                                                                            break L6;
                                                                                          } else {
                                                                                            var6[var19.field_j.b(-4)] = 100;
                                                                                            fm.a(var19, true, var20, var35);
                                                                                            var18++;
                                                                                            continue L1;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        ei.a(var19, (byte) -116, var36, var3, var35, var37);
                                                                                        break L6;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    he.a(var19, var25, (byte) 110, var16, var14);
                                                                                    break L6;
                                                                                  }
                                                                                } else {
                                                                                  ml.a((byte) -128, var14, var16, var19, var35, var25, var3);
                                                                                  break L6;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              int discarded$4 = -2312;
                                                                              rj.a(var19);
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
                                                                int discarded$5 = 0;
                                                                ui.a(var16, var4, var19, var3, var20, var14);
                                                                break L6;
                                                              }
                                                            } else {
                                                              break L13;
                                                            }
                                                          } else {
                                                            break L13;
                                                          }
                                                        }
                                                        vc.a(var3, -11112, var35, var19);
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
                                              sc.a(var3, var19, var35, 1);
                                              break L6;
                                            }
                                          } else {
                                            break L10;
                                          }
                                        }
                                        ng.a((byte) 78, var19, var3, var20, var35);
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              } else {
                                jm.a(var35, var3, (byte) -128, var19);
                                break L6;
                              }
                            }
                          } else {
                            pa.a(var19, var3, var35, false);
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
                  pa.a(var19, var3, var35, false);
                  break L6;
                }
                var18++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "sg.B(" + true + ')');
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
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
                      var7_ref_java_math_BigInteger = var12.modPow(((sg) this).field_k, ((sg) this).field_l);
                      var5 = var7_ref_java_math_BigInteger.toByteArray();
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
                    if (var5[1 + var7] != var17[var7]) {
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
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        rb var9 = null;
        byte[] var13 = null;
        rb stackIn_9_0 = null;
        rb stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        rb stackOut_10_0 = null;
        rb stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (null == ((sg) this).field_b) {
              throw new RuntimeException();
            } else {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (((sg) this).field_h.length > param1) {
                    if (((sg) this).field_h[param1] == null) {
                      ((sg) this).field_b.field_i = 6 + param1 * 72;
                      var6_int = ((sg) this).field_b.d(8195);
                      var7 = ((sg) this).field_b.d(8195);
                      var13 = new byte[64];
                      ((sg) this).field_b.a(64, param4, var13, -18181);
                      var9 = new rb(param1, param3, param2, ((sg) this).field_p, ((sg) this).field_f, var6_int, var13, var7, param0);
                      ((sg) this).field_h[param1] = var9;
                      stackOut_10_0 = (rb) var9;
                      stackIn_11_0 = stackOut_10_0;
                      break L0;
                    } else {
                      stackOut_8_0 = ((sg) this).field_h[param1];
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("sg.D(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param4 + ')');
        }
        return stackIn_11_0;
    }

    final static String d() {
        return bi.field_c[fl.d(-97)];
    }

    final static boolean a(char param0) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (rf.a(true, param0)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var6 = pk.field_g;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var6.length) {
                    var7 = i.field_g;
                    var2 = var7;
                    var3 = 0;
                    L2: while (true) {
                      if (var3 >= var7.length) {
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        var4 = var7[var3];
                        if (param0 == var4) {
                          stackOut_19_0 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0 != 0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param0 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2_ref, "sg.G(" + param0 + ',' + true + ')');
        }
        return stackIn_23_0 != 0;
    }

    private sg(ej param0, dh param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              ((sg) this).field_p = param0;
              ((sg) this).field_f = param1;
              ((sg) this).field_k = param2;
              ((sg) this).field_l = param3;
              if (((sg) this).field_p.a(20)) {
                break L1;
              } else {
                ((sg) this).field_n = ((sg) this).field_p.a((byte) 0, 255, 255, -18986, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("sg.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
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
