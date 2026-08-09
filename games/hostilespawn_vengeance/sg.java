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
            String var2 = (String) null;
            sg.a(true, (String) null, (gb) null, (String) null);
        }
        field_m = null;
        field_g = null;
        field_e = null;
        field_d = null;
        field_j = null;
    }

    final void c(int param0) {
        int var2;
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (null != this.field_h) {
          var2 = 0;
          L0: while (true) {
            if (this.field_h.length <= var2) {
              if (param0 == -11) {
                var2 = 0;
                L1: while (true) {
                  if (this.field_h.length <= var2) {
                    return;
                  } else {
                    if (this.field_h[var2] != null) {
                      this.field_h[var2].f(-1);
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
              if (null != this.field_h[var2]) {
                this.field_h[var2].d(40);
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
        pg[] stackIn_2_0 = null;
        pg[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param2.a((byte) -2, param1);
            if (param0) {
              var5 = param2.a(var4_int, param3, -1);
              stackIn_4_0 = qi.a(var4_int, (byte) 118, var5, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pg[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("sg.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
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
        int[] var33 = null;
        var24 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var25 = mm.field_m[0];
            var2 = var25.field_j;
            var3 = var2.b(-4);
            var29 = ln.field_a.field_c;
            var26 = var29;
            var4 = var26;
            var33 = ln.field_a.field_f;
            var31 = ln.field_a.field_u;
            var28 = var31;
            var6 = var28;
            var29[var3] = 0;
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
                  if ((var18 ^ -1) > -1) {
                    L3: {
                      if (param0) {
                        break L3;
                      } else {
                        sg.a('ￂ', true);
                        break L3;
                      }
                    }
                    var29[var3] = 3;
                    break L0;
                  } else {
                    L4: {
                      if (-1 != jn.field_F[var18].field_i) {
                        break L4;
                      } else {
                        ib.field_c = ib.field_c - 1;
                        jn.field_F[var18].field_c = jn.field_F[ib.field_c].field_c;
                        jn.field_F[var18].field_l.a(jn.field_F[ib.field_c].field_l, -28860);
                        jn.field_F[var18].field_j.a((byte) 46, jn.field_F[ib.field_c].field_j);
                        jn.field_F[var18].field_h = jn.field_F[ib.field_c].field_h;
                        jn.field_F[var18].field_e = jn.field_F[ib.field_c].field_e;
                        jn.field_F[var18].field_i = jn.field_F[ib.field_c].field_i;
                        break L4;
                      }
                    }
                    var18--;
                    continue L2;
                  }
                }
              } else {
                L5: {
                  var19 = jn.field_F[var18];
                  var20 = var19.field_i;
                  var21 = var19.field_j.field_e + -var7;
                  var22 = -var8 + var19.field_j.field_g;
                  if (-1 < (var21 ^ -1)) {
                    var21 = -var21;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (0 > var22) {
                    var22 = -var22;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    L9: {
                      if (30 < var21) {
                        break L9;
                      } else {
                        if (var22 > 25) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (var20 == 5) {
                      break L8;
                    } else {
                      if (24 == var20) {
                        break L8;
                      } else {
                        var19.field_i = -1;
                        break L7;
                      }
                    }
                  }
                  L10: {
                    var23 = var20;
                    if (-21 == (var23 ^ -1)) {
                      break L10;
                    } else {
                      if (var23 != 0) {
                        if ((var23 ^ -1) != -19) {
                          if ((var23 ^ -1) != -24) {
                            if (32 == var23) {
                              break L10;
                            } else {
                              if (9 != var23) {
                                if (var23 == 1) {
                                  var19.a(8573);
                                  var19.field_l.a(2, (byte) 94, var19.field_c);
                                  var19.field_e = var19.field_e + 1;
                                  if (-17 <= (var19.field_e ^ -1)) {
                                    break L7;
                                  } else {
                                    var19.field_i = -1;
                                    break L7;
                                  }
                                } else {
                                  if ((var23 ^ -1) == -3) {
                                    var19.field_e = var19.field_e + 1;
                                    if (32 >= var19.field_e) {
                                      break L7;
                                    } else {
                                      var19.field_i = -1;
                                      break L7;
                                    }
                                  } else {
                                    if (3 == var23) {
                                      var19.field_e = var19.field_e + 1;
                                      if (var19.field_e <= 32) {
                                        break L7;
                                      } else {
                                        var19.field_i = -1;
                                        break L7;
                                      }
                                    } else {
                                      if (-22 == (var23 ^ -1)) {
                                        var19.a(8573);
                                        var19.field_e = var19.field_e + 1;
                                        if (-7 <= (var19.field_e ^ -1)) {
                                          break L7;
                                        } else {
                                          var19.field_i = -1;
                                          break L7;
                                        }
                                      } else {
                                        L11: {
                                          if ((var23 ^ -1) != -5) {
                                            if (var23 == 28) {
                                              break L11;
                                            } else {
                                              L12: {
                                                if (-6 != (var23 ^ -1)) {
                                                  if (var23 == 24) {
                                                    break L12;
                                                  } else {
                                                    if (-7 == (var23 ^ -1)) {
                                                      L13: {
                                                        var19.a(8573);
                                                        if (2 == var4[var19.field_j.b(-4)]) {
                                                          break L13;
                                                        } else {
                                                          var19.field_l.a(1, (byte) 94, var19.field_c);
                                                          break L13;
                                                        }
                                                      }
                                                      var19.field_e = var19.field_e + 1;
                                                      if (16 >= var19.field_e) {
                                                        break L7;
                                                      } else {
                                                        var19.field_i = -1;
                                                        break L7;
                                                      }
                                                    } else {
                                                      if ((var23 ^ -1) != -38) {
                                                        L14: {
                                                          if (-8 != (var23 ^ -1)) {
                                                            if (-27 != (var23 ^ -1)) {
                                                              if ((var23 ^ -1) == -9) {
                                                                L15: {
                                                                  if (var4[var19.field_j.b(-4)] != 2) {
                                                                    var19.field_l.a(var19.field_h, (byte) 94, var19.field_c);
                                                                    break L15;
                                                                  } else {
                                                                    break L15;
                                                                  }
                                                                }
                                                                var19.a(8573);
                                                                var19.field_e = var19.field_e + 1;
                                                                if (32 < var19.field_e) {
                                                                  var19.field_i = -1;
                                                                  break L7;
                                                                } else {
                                                                  break L7;
                                                                }
                                                              } else {
                                                                L16: {
                                                                  if (-11 == (var23 ^ -1)) {
                                                                    break L16;
                                                                  } else {
                                                                    if ((var23 ^ -1) == -26) {
                                                                      break L16;
                                                                    } else {
                                                                      L17: {
                                                                        if ((var23 ^ -1) == -12) {
                                                                          break L17;
                                                                        } else {
                                                                          if (var23 != 34) {
                                                                            if (-34 != (var23 ^ -1)) {
                                                                              if (var23 == 12) {
                                                                                var19.field_e = var19.field_e + 4;
                                                                                if (var19.field_e <= 128) {
                                                                                  break L7;
                                                                                } else {
                                                                                  var19.field_i = -1;
                                                                                  break L7;
                                                                                }
                                                                              } else {
                                                                                if ((var23 ^ -1) != -14) {
                                                                                  if ((var23 ^ -1) != -15) {
                                                                                    if (-16 == (var23 ^ -1)) {
                                                                                      in.a(var14, var19, (byte) 29, var29, var3, var16);
                                                                                      break L7;
                                                                                    } else {
                                                                                      if (var23 != 16) {
                                                                                        if (17 == var23) {
                                                                                          var6[var19.field_j.b(-4)] = 100;
                                                                                          fm.a(var19, true, var20, var29);
                                                                                          break L7;
                                                                                        } else {
                                                                                          if (30 != var23) {
                                                                                            L18: {
                                                                                              if ((var23 ^ -1) == -20) {
                                                                                                break L18;
                                                                                              } else {
                                                                                                if (-30 == (var23 ^ -1)) {
                                                                                                  break L18;
                                                                                                } else {
                                                                                                  L19: {
                                                                                                    if (-23 != (var23 ^ -1)) {
                                                                                                      if ((var23 ^ -1) == -28) {
                                                                                                        break L19;
                                                                                                      } else {
                                                                                                        L20: {
                                                                                                          if ((var23 ^ -1) != -32) {
                                                                                                            if ((var23 ^ -1) == -36) {
                                                                                                              break L20;
                                                                                                            } else {
                                                                                                              if (var23 == 36) {
                                                                                                                nf.a(var19, (byte) 70);
                                                                                                                break L7;
                                                                                                              } else {
                                                                                                                break L7;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L20;
                                                                                                          }
                                                                                                        }
                                                                                                        ia.a(var19, var29, -14808);
                                                                                                        break L7;
                                                                                                      }
                                                                                                    } else {
                                                                                                      break L19;
                                                                                                    }
                                                                                                  }
                                                                                                  hh.a(false, var19, var29);
                                                                                                  break L7;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            lj.a(var29, var3, 0, var19);
                                                                                            break L7;
                                                                                          } else {
                                                                                            var6[var19.field_j.b(-4)] = 100;
                                                                                            fm.a(var19, true, var20, var29);
                                                                                            var18++;
                                                                                            continue L1;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        ei.a(var19, (byte) -116, var33, var3, var29, var31);
                                                                                        break L7;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    he.a(var19, var25, (byte) 110, var16, var14);
                                                                                    break L7;
                                                                                  }
                                                                                } else {
                                                                                  ml.a((byte) -128, var14, var16, var19, var29, var25, var3);
                                                                                  break L7;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              rj.a(var19, -2312);
                                                                              break L7;
                                                                            }
                                                                          } else {
                                                                            break L17;
                                                                          }
                                                                        }
                                                                      }
                                                                      vd.a(var19, -127);
                                                                      break L7;
                                                                    }
                                                                  }
                                                                }
                                                                ui.a(var16, var29, var19, var3, var20, var14, false);
                                                                break L7;
                                                              }
                                                            } else {
                                                              break L14;
                                                            }
                                                          } else {
                                                            break L14;
                                                          }
                                                        }
                                                        vc.a(var3, -11112, var29, var19);
                                                        break L7;
                                                      } else {
                                                        L21: {
                                                          var19.field_l.field_f = var19.field_l.field_f - Math.sin(3.141592653589793 * var19.field_c / 128.0) * 0.05;
                                                          var19.field_l.field_a = var19.field_l.field_a - 0.05 * Math.cos(3.141592653589793 * var19.field_c / 128.0);
                                                          var19.a(8573);
                                                          if (2 <= var4[var19.field_j.b(-4)]) {
                                                            break L21;
                                                          } else {
                                                            var19.field_l.a(1, (byte) 94, var19.field_c);
                                                            break L21;
                                                          }
                                                        }
                                                        var19.field_e = var19.field_e + 1;
                                                        if (16 >= var19.field_e) {
                                                          break L7;
                                                        } else {
                                                          var19.field_i = -1;
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L12;
                                                }
                                              }
                                              sc.a(var3, var19, var29, 1);
                                              break L7;
                                            }
                                          } else {
                                            break L11;
                                          }
                                        }
                                        ng.a((byte) 78, var19, var3, var20, var29);
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              } else {
                                jm.a(var29, var3, (byte) -128, var19);
                                break L7;
                              }
                            }
                          } else {
                            pa.a(var19, var3, var29, false);
                            break L7;
                          }
                        } else {
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                  pa.a(var19, var3, var29, false);
                  break L7;
                }
                var18++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "sg.B(" + param0 + ')');
        }
    }

    final boolean a(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        vi var10;
        byte[] var11;
        java.math.BigInteger var12;
        byte[] var13;
        byte[] var15;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_b != null) {
          return true;
        } else {
          L0: {
            if (this.field_n != null) {
              break L0;
            } else {
              if (!this.field_p.a(20)) {
                this.field_n = this.field_p.a((byte) 0, 255, 255, -18986, true);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (this.field_n.field_v) {
            return false;
          } else {
            if (param0 == -26720) {
              L1: {
                L2: {
                  var10 = new vi(this.field_n.c((byte) 127));
                  var10.field_i = 5;
                  var3 = var10.l(32270);
                  var10.field_i = var10.field_i + var3 * 72;
                  var13 = new byte[var10.field_n.length + -var10.field_i];
                  var11 = var13;
                  var4 = var11;
                  var10.a(var13.length, 0, var13, param0 + 8539);
                  if (this.field_k == null) {
                    break L2;
                  } else {
                    if (null != this.field_l) {
                      var12 = new java.math.BigInteger(var13);
                      var7_ref_java_math_BigInteger = var12.modPow(this.field_k, this.field_l);
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
                var15 = ld.a(var10.field_n, 5, 113, -5 + (var10.field_i + -var13.length));
                var7 = 0;
                L3: while (true) {
                  if (64 <= var7) {
                    this.field_b = var10;
                    this.field_h = new rb[var3];
                    return true;
                  } else {
                    if (var5[1 + var7] != var15[var7]) {
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == this.field_b) {
              throw new RuntimeException();
            } else {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (this.field_h.length > param1) {
                    if (this.field_h[param1] == null) {
                      this.field_b.field_i = 6 + param1 * 72;
                      var6_int = this.field_b.d(8195);
                      var7 = this.field_b.d(8195);
                      var13 = new byte[64];
                      this.field_b.a(64, param4, var13, -18181);
                      var9 = new rb(param1, param3, param2, this.field_p, this.field_f, var6_int, var13, var7, param0);
                      this.field_h[param1] = var9;
                      stackIn_11_0 = (rb) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_9_0 = this.field_h[param1];
                      decompiledRegionSelector0 = 0;
                      break L0;
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
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("sg.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static String d(int param0) {
        if (param0 != 24) {
            sg.a('ﾊ', false);
        }
        return bi.field_c[fl.d(-97)];
    }

    final static boolean a(char param0, boolean param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (rf.a(param1, param0)) {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = pk.field_g;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var6.length) {
                    var2 = i.field_g;
                    var3 = 0;
                    L2: while (true) {
                      if (var3 >= var2.length) {
                        stackIn_23_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (param0 == var4) {
                          stackIn_20_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if ((param0 ^ -1) != (var4 ^ -1)) {
                      var3++;
                      continue L1;
                    } else {
                      stackIn_13_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2_ref), "sg.G(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    private sg(ej param0, dh param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            this.field_p = param0;
            this.field_f = param1;
            this.field_k = param2;
            this.field_l = param3;
            if (!this.field_p.a(20)) {
                this.field_n = this.field_p.a((byte) 0, 255, 255, -18986, true);
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Unfortunately we are unable to create an account for you at this time.";
        field_d = new ll();
        field_m = "PER MONTH";
        field_o = 0;
        field_a = 0;
        field_c = new ub();
        field_e = "Click";
    }
}
