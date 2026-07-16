/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static int field_h;
    private int[] field_c;
    static int field_a;
    static hl[] field_f;
    static int field_g;
    private int[] field_e;
    static char[] field_b;
    private byte[] field_i;
    static String field_d;

    final static ud a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ud var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_16_0 = null;
        ud stackIn_22_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_15_0 = null;
        ud stackOut_21_0 = null;
        Object stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 == -32055) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            if (sd.field_nb == null) {
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (ud) (Object) stackIn_8_0;
            } else {
              L2: {
                var2 = cc.a((CharSequence) (Object) param1, (byte) 118);
                if (var2 == null) {
                  var2 = param1;
                  break L2;
                } else {
                  break L2;
                }
              }
              var3 = (ud) (Object) sd.field_nb.a((long)var2.hashCode(), 1);
              L3: while (true) {
                L4: {
                  L5: {
                    if (null == var3) {
                      break L5;
                    } else {
                      var4 = cc.a((CharSequence) (Object) var3.field_Mb, (byte) 124);
                      stackOut_15_0 = null;
                      stackIn_25_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var5 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_16_0 != (Object) (Object) var4) {
                            break L6;
                          } else {
                            var4 = var3.field_Mb;
                            break L6;
                          }
                        }
                        if (!var4.equals((Object) (Object) var2)) {
                          var3 = (ud) (Object) sd.field_nb.c(126);
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        } else {
                          stackOut_21_0 = (ud) var3;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        }
                      }
                    }
                  }
                  stackOut_24_0 = null;
                  stackIn_25_0 = stackOut_24_0;
                  break L4;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2_ref = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var2_ref;
            stackOut_26_1 = new StringBuilder().append("fh.C(").append(param0).append(44);
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L7;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
        return (ud) (Object) stackIn_25_0;
    }

    final static int a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if ((param1 ^ -1) == -1) {
                var2_int = ik.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 79) {
              L2: {
                if (-2 == (param1 ^ -1)) {
                  var2_int = me.field_b;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if ((param1 ^ -1) == -3) {
                  var2_int = mc.field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
              stackOut_15_0 = var2_int;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_5_0 = -50;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "fh.D(" + param0 + 44 + param1 + 41);
        }
        return stackIn_16_0;
    }

    public static void a(byte param0) {
        try {
            field_b = null;
            field_d = null;
            field_f = null;
            if (param0 != -48) {
                String discarded$0 = fh.b((byte) -44);
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "fh.E(" + param0 + 41);
        }
    }

    final static void a(boolean param0) {
        try {
            vc.field_c = vc.field_c - 1;
            ra.a(sc.field_a[vc.field_c], gh.field_a[vc.field_c], hc.field_s[vc.field_c]);
            ra.field_j = qd.field_Y[vc.field_c];
            ra.field_l = ea.field_b[vc.field_c];
            ra.field_i = ca.field_f[vc.field_c];
            ra.field_g = ml.field_ib[vc.field_c];
            if (!param0) {
                field_f = null;
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "fh.G(" + param0 + 41);
        }
    }

    final static String b(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Object var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_55_0 = null;
        Object stackIn_95_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_54_0 = null;
        String stackOut_52_0 = null;
        Object stackOut_94_0 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var2 = 55 % ((param0 - 21) / 59);
              var1 = null;
              var3 = null;
              if ((sf.field_d ^ -1) != -1) {
                break L1;
              } else {
                if (null == qe.field_a) {
                  break L1;
                } else {
                  var3 = (Object) (Object) dd.field_b;
                  break L1;
                }
              }
            }
            L2: {
              if (2 != sf.field_d) {
                break L2;
              } else {
                if (k.a(true)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (!oj.a(1, qj.field_a)) {
                        break L4;
                      } else {
                        var3 = (Object) (Object) sk.a(new String[1], sb.field_c, 119);
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3 = (Object) (Object) sk.a(new String[1], tl.field_Z, 119);
                    break L3;
                  }
                  if (hi.field_a) {
                    fi.a(0, 0, (String) null, 2, (String) var3, (String) null);
                    fk.e((byte) -8);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L5: {
              if (var3 != null) {
                break L5;
              } else {
                if (fi.field_Cb) {
                  break L5;
                } else {
                  if (null == gn.field_I) {
                    var3 = (Object) (Object) ad.field_Nb;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (var3 != null) {
                nj.a((String) var3, (byte) -48, (String) null, t.field_l, 0);
                break L6;
              } else {
                L7: {
                  var4 = ph.field_w;
                  var4 = rh.a(var4, -62);
                  var5 = "";
                  var6 = "|";
                  var7 = sf.field_d;
                  var8 = 0;
                  if ((var7 ^ -1) == -3) {
                    var5 = sk.a(new String[1], vd.field_b, 126);
                    var9 = sk.a(new String[1], mc.field_h, 119);
                    var8 = -485 + ba.field_L.field_Hb + (in.field_g.field_Hb - -we.field_k.b(var9)) + -we.field_k.b(var5);
                    if (0 <= var8) {
                      break L7;
                    } else {
                      var8 = 0;
                      break L7;
                    }
                  } else {
                    L8: {
                      if (var7 == 0) {
                        L9: {
                          if (qb.field_N != null) {
                            break L9;
                          } else {
                            if (!go.field_c) {
                              break L9;
                            } else {
                              var5 = "[" + nm.field_v + "] ";
                              break L9;
                            }
                          }
                        }
                        if (qb.field_N != null) {
                          L10: {
                            L11: {
                              if (!nh.field_Sb) {
                                break L11;
                              } else {
                                if (null == ec.field_h) {
                                  break L11;
                                } else {
                                  var5 = "[" + ec.field_h + "] ";
                                  if (var11 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            var5 = "[" + sk.a(new String[1], qe.field_e, 126) + "] ";
                            break L10;
                          }
                          var7 = 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L12: {
                      if (gg.b((byte) 87)) {
                        stackOut_54_0 = ": ";
                        stackIn_55_0 = stackOut_54_0;
                        break L12;
                      } else {
                        stackOut_52_0 = "<img=3>: ";
                        stackIn_55_0 = stackOut_52_0;
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        var9 = stackIn_55_0;
                        var5 = var5 + var4 + var9;
                        if (!cd.field_a) {
                          break L14;
                        } else {
                          var5 = "<col=999999>" + var5 + dg.field_l + "</col>";
                          var6 = "";
                          if (var11 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (!fn.field_K) {
                        break L13;
                      } else {
                        var6 = "";
                        var5 = "<col=999999>" + var5 + bh.field_n + "</col>";
                        break L13;
                      }
                    }
                    L15: {
                      var10 = we.field_k.b(var5);
                      if (gg.b((byte) 87)) {
                        break L15;
                      } else {
                        L16: {
                          if (!in.field_g.field_Y) {
                            break L16;
                          } else {
                            if (aa.field_Nb - in.field_g.field_eb >= var10) {
                              break L16;
                            } else {
                              if (cd.field_a) {
                                var1 = (Object) (Object) "Broken!";
                                break L16;
                              } else {
                                var1 = (Object) (Object) bh.field_n;
                                break L16;
                              }
                            }
                          }
                        }
                        if ((in.field_g.field_F ^ -1) == -1) {
                          break L15;
                        } else {
                          if ((var10 ^ -1) < (in.field_g.field_Z ^ -1)) {
                            if (!cd.field_a) {
                              em.d(-20715);
                              break L15;
                            } else {
                              break L15;
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    break L7;
                  }
                }
                L17: {
                  nj.a(var5 + jb.c(io.field_h.toString()), (byte) -48, var6, pg.field_f[var7], var8);
                  if (!cl.field_e) {
                    ba.field_L.field_Y = false;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (!ba.field_L.field_Y) {
                    break L18;
                  } else {
                    var1 = (Object) (Object) sk.a(new String[2], eg.field_L, 126);
                    break L18;
                  }
                }
                break L6;
              }
            }
            stackOut_94_0 = var1;
            stackIn_95_0 = stackOut_94_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (Object) (Object) decompiledCaughtException;
          throw oi.a((Throwable) var1, "fh.B(" + param0 + 41);
        }
        return (String) (Object) stackIn_95_0;
    }

    final int a(byte[] param0, int param1, int param2, int param3, boolean param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_94_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            if (param3 != 0) {
              if (!param4) {
                param3 = param3 + param1;
                var7_int = 0;
                var8 = param2;
                L1: while (true) {
                  L2: {
                    L3: {
                      var9 = param0[var8];
                      if (-1 < (var9 ^ -1)) {
                        break L3;
                      } else {
                        var7_int++;
                        if (var11 != 0) {
                          break L2;
                        } else {
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var7_int = ((fh) this).field_c[var7_int];
                    break L2;
                  }
                  L4: {
                    L5: {
                      var10 = ((fh) this).field_c[var7_int];
                      if (0 > ((fh) this).field_c[var7_int]) {
                        L6: {
                          int incrementValue$8 = param1;
                          param1++;
                          param5[incrementValue$8] = (byte)(var10 ^ -1);
                          if ((param3 ^ -1) < (param1 ^ -1)) {
                            break L6;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7_int = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      L8: {
                        if ((var9 & 64) == 0) {
                          break L8;
                        } else {
                          var7_int = ((fh) this).field_c[var7_int];
                          if (var11 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var7_int++;
                      break L7;
                    }
                    L9: {
                      var10 = ((fh) this).field_c[var7_int];
                      if (0 > ((fh) this).field_c[var7_int]) {
                        L10: {
                          int incrementValue$9 = param1;
                          param1++;
                          param5[incrementValue$9] = (byte)(var10 ^ -1);
                          if ((param1 ^ -1) > (param3 ^ -1)) {
                            break L10;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var7_int = 0;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L11: {
                      L12: {
                        if ((32 & var9 ^ -1) == -1) {
                          break L12;
                        } else {
                          var7_int = ((fh) this).field_c[var7_int];
                          if (var11 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var7_int++;
                      break L11;
                    }
                    L13: {
                      var10 = ((fh) this).field_c[var7_int];
                      if (0 > ((fh) this).field_c[var7_int]) {
                        int incrementValue$10 = param1;
                        param1++;
                        param5[incrementValue$10] = (byte)(var10 ^ -1);
                        if ((param3 ^ -1) >= (param1 ^ -1)) {
                          break L4;
                        } else {
                          var7_int = 0;
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        if ((var9 & 16 ^ -1) == -1) {
                          break L15;
                        } else {
                          var7_int = ((fh) this).field_c[var7_int];
                          if (var11 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var7_int++;
                      break L14;
                    }
                    L16: {
                      var10 = ((fh) this).field_c[var7_int];
                      if (((fh) this).field_c[var7_int] < 0) {
                        int incrementValue$11 = param1;
                        param1++;
                        param5[incrementValue$11] = (byte)(var10 ^ -1);
                        if (param3 <= param1) {
                          break L4;
                        } else {
                          var7_int = 0;
                          break L16;
                        }
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      L18: {
                        if (0 == (var9 & 8)) {
                          break L18;
                        } else {
                          var7_int = ((fh) this).field_c[var7_int];
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var7_int++;
                      break L17;
                    }
                    L19: {
                      var10 = ((fh) this).field_c[var7_int];
                      if ((((fh) this).field_c[var7_int] ^ -1) > -1) {
                        L20: {
                          int incrementValue$12 = param1;
                          param1++;
                          param5[incrementValue$12] = (byte)(var10 ^ -1);
                          if ((param3 ^ -1) < (param1 ^ -1)) {
                            break L20;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var7_int = 0;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L21: {
                      L22: {
                        if ((var9 & 4 ^ -1) != -1) {
                          break L22;
                        } else {
                          var7_int++;
                          if (var11 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var7_int = ((fh) this).field_c[var7_int];
                      break L21;
                    }
                    L23: {
                      var10 = ((fh) this).field_c[var7_int];
                      if (((fh) this).field_c[var7_int] >= 0) {
                        break L23;
                      } else {
                        int incrementValue$13 = param1;
                        param1++;
                        param5[incrementValue$13] = (byte)(var10 ^ -1);
                        if (param3 <= param1) {
                          break L4;
                        } else {
                          var7_int = 0;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      L25: {
                        if ((2 & var9 ^ -1) != -1) {
                          break L25;
                        } else {
                          var7_int++;
                          if (var11 == 0) {
                            break L24;
                          } else {
                            break L25;
                          }
                        }
                      }
                      var7_int = ((fh) this).field_c[var7_int];
                      break L24;
                    }
                    L26: {
                      var10 = ((fh) this).field_c[var7_int];
                      if (0 <= ((fh) this).field_c[var7_int]) {
                        break L26;
                      } else {
                        int incrementValue$14 = param1;
                        param1++;
                        param5[incrementValue$14] = (byte)(var10 ^ -1);
                        if (param3 <= param1) {
                          break L4;
                        } else {
                          var7_int = 0;
                          break L26;
                        }
                      }
                    }
                    L27: {
                      L28: {
                        if ((1 & var9 ^ -1) != -1) {
                          break L28;
                        } else {
                          var7_int++;
                          if (var11 == 0) {
                            break L27;
                          } else {
                            break L28;
                          }
                        }
                      }
                      var7_int = ((fh) this).field_c[var7_int];
                      break L27;
                    }
                    L29: {
                      var10 = ((fh) this).field_c[var7_int];
                      if ((((fh) this).field_c[var7_int] ^ -1) > -1) {
                        L30: {
                          int incrementValue$15 = param1;
                          param1++;
                          param5[incrementValue$15] = (byte)(var10 ^ -1);
                          if (param3 > param1) {
                            break L30;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L30;
                            }
                          }
                        }
                        var7_int = 0;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    var8++;
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L4;
                    }
                  }
                  stackOut_94_0 = -param2 + var8 + 1;
                  stackIn_95_0 = stackOut_94_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = -26;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var7 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) var7;
            stackOut_96_1 = new StringBuilder().append("fh.A(");
            stackIn_99_0 = stackOut_96_0;
            stackIn_99_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param0 == null) {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L31;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_100_0 = stackOut_97_0;
              stackIn_100_1 = stackOut_97_1;
              stackIn_100_2 = stackOut_97_2;
              break L31;
            }
          }
          L32: {
            stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
            stackOut_100_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_100_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_103_0 = stackOut_100_0;
            stackIn_103_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param5 == null) {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L32;
            } else {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "{...}";
              stackIn_104_0 = stackOut_101_0;
              stackIn_104_1 = stackOut_101_1;
              stackIn_104_2 = stackOut_101_2;
              break L32;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + 41);
        }
        return stackIn_95_0;
    }

    final int a(int param0, int param1, byte[] param2, int param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var15 = TetraLink.field_J;
        try {
          L0: {
            var7_int = 0;
            param3 = param3 + param0;
            var8 = param1 << 1749695619;
            L1: while (true) {
              L2: {
                L3: {
                  if (param0 >= param3) {
                    break L3;
                  } else {
                    var9 = 255 & param2[param0];
                    var10 = ((fh) this).field_e[var9];
                    var11 = ((fh) this).field_i[var9];
                    stackOut_3_0 = -1;
                    stackOut_3_1 = var11 ^ -1;
                    stackIn_25_0 = stackOut_3_0;
                    stackIn_25_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 != stackIn_4_1) {
                        L4: {
                          var12 = var8 >> -91561213;
                          var13 = 7 & var8;
                          var7_int = var7_int & -var13 >> 42438143;
                          var14 = var12 + (var11 + var13 + -1 >> -1157900381);
                          var13 += 24;
                          int dupTemp$1 = mc.a(var7_int, var10 >>> var13);
                          var7_int = dupTemp$1;
                          param4[var12] = (byte)dupTemp$1;
                          if (var12 >= var14) {
                            break L4;
                          } else {
                            L5: {
                              var12++;
                              var13 -= 8;
                              var7_int = var10 >>> var13;
                              param4[var12] = (byte)(var10 >>> var13);
                              if (var14 > var12) {
                                break L5;
                              } else {
                                if (var15 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              var13 -= 8;
                              var12++;
                              var7_int = var10 >>> var13;
                              param4[var12] = (byte)(var10 >>> var13);
                              if (var12 < var14) {
                                break L6;
                              } else {
                                if (var15 == 0) {
                                  break L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              var13 -= 8;
                              var12++;
                              var7_int = var10 >>> var13;
                              param4[var12] = (byte)(var10 >>> var13);
                              if (var12 < var14) {
                                break L7;
                              } else {
                                if (var15 == 0) {
                                  break L4;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var13 -= 8;
                            var12++;
                            var7_int = var10 << -var13;
                            param4[var12] = (byte)(var10 << -var13);
                            break L4;
                          }
                        }
                        var8 = var8 + var11;
                        param0++;
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        throw new RuntimeException("" + var9);
                      }
                    }
                  }
                }
                stackOut_24_0 = param5;
                stackOut_24_1 = 28677;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L2;
              }
              L8: {
                if (stackIn_25_0 == stackIn_25_1) {
                  break L8;
                } else {
                  field_d = null;
                  break L8;
                }
              }
              stackOut_28_0 = (var8 + 7 >> 1032196995) + -param1;
              stackIn_29_0 = stackOut_28_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var7;
            stackOut_30_1 = new StringBuilder().append("fh.F(").append(param0).append(44).append(param1).append(44);
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L9;
            }
          }
          L10: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(44).append(param3).append(44);
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param4 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L10;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + param5 + 41);
        }
        return stackIn_29_0;
    }

    fh(byte[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var15 = TetraLink.field_J;
        try {
          L0: {
            var2_int = param0.length;
            ((fh) this).field_i = param0;
            ((fh) this).field_e = new int[var2_int];
            ((fh) this).field_c = new int[8];
            var3 = new int[33];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              stackOut_2_0 = var5 ^ -1;
              stackOut_2_1 = var2_int ^ -1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                      break L4;
                    } else {
                      var6 = param0[var5];
                      if (var15 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if ((var6 ^ -1) == -1) {
                            break L5;
                          } else {
                            L6: {
                              L7: {
                                var7 = 1 << 32 + -var6;
                                var8 = var3[var6];
                                ((fh) this).field_e[var5] = var8;
                                if (0 != (var8 & var7)) {
                                  break L7;
                                } else {
                                  var10 = -1 + var6;
                                  L8: while (true) {
                                    L9: {
                                      L10: {
                                        if (var10 < 1) {
                                          break L10;
                                        } else {
                                          var11 = var3[var10];
                                          stackOut_11_0 = var11;
                                          stackOut_11_1 = var8;
                                          stackIn_26_0 = stackOut_11_0;
                                          stackIn_26_1 = stackOut_11_1;
                                          stackIn_12_0 = stackOut_11_0;
                                          stackIn_12_1 = stackOut_11_1;
                                          if (var15 != 0) {
                                            break L9;
                                          } else {
                                            if (stackIn_12_0 != stackIn_12_1) {
                                              break L10;
                                            } else {
                                              L11: {
                                                L12: {
                                                  var12 = 1 << -var10 + 32;
                                                  if (0 != (var12 & var11)) {
                                                    break L12;
                                                  } else {
                                                    var3[var10] = mc.a(var11, var12);
                                                    if (var15 == 0) {
                                                      break L11;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                                var3[var10] = var3[-1 + var10];
                                                if (var15 == 0) {
                                                  break L10;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                              var10--;
                                              if (var15 == 0) {
                                                continue L8;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_25_0 = var7;
                                      stackOut_25_1 = var8;
                                      stackIn_26_0 = stackOut_25_0;
                                      stackIn_26_1 = stackOut_25_1;
                                      break L9;
                                    }
                                    var9 = stackIn_26_0 | stackIn_26_1;
                                    if (var15 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var9 = var3[-1 + var6];
                              break L6;
                            }
                            var3[var6] = var9;
                            var10 = var6 - -1;
                            L13: while (true) {
                              L14: {
                                if (32 < var10) {
                                  break L14;
                                } else {
                                  stackOut_30_0 = var8;
                                  stackOut_30_1 = var3[var10];
                                  stackIn_3_0 = stackOut_30_0;
                                  stackIn_3_1 = stackOut_30_1;
                                  stackIn_31_0 = stackOut_30_0;
                                  stackIn_31_1 = stackOut_30_1;
                                  if (var15 != 0) {
                                    continue L2;
                                  } else {
                                    L15: {
                                      if (stackIn_31_0 != stackIn_31_1) {
                                        break L15;
                                      } else {
                                        var3[var10] = var9;
                                        break L15;
                                      }
                                    }
                                    var10++;
                                    if (var15 == 0) {
                                      continue L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                              var10 = 0;
                              var11 = 0;
                              L16: while (true) {
                                L17: {
                                  L18: {
                                    if ((var11 ^ -1) <= (var6 ^ -1)) {
                                      break L18;
                                    } else {
                                      var12 = -2147483648 >>> var11;
                                      stackOut_37_0 = 0;
                                      stackOut_37_1 = var12 & var8;
                                      stackIn_63_0 = stackOut_37_0;
                                      stackIn_63_1 = stackOut_37_1;
                                      stackIn_38_0 = stackOut_37_0;
                                      stackIn_38_1 = stackOut_37_1;
                                      if (var15 != 0) {
                                        break L17;
                                      } else {
                                        L19: {
                                          L20: {
                                            if (stackIn_38_0 == stackIn_38_1) {
                                              break L20;
                                            } else {
                                              L21: {
                                                if (0 == ((fh) this).field_c[var10]) {
                                                  ((fh) this).field_c[var10] = var4;
                                                  break L21;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                              var10 = ((fh) this).field_c[var10];
                                              if (var15 == 0) {
                                                break L19;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          var10++;
                                          break L19;
                                        }
                                        L22: {
                                          L23: {
                                            var12 = var12 >>> 1;
                                            if (var10 >= ((fh) this).field_c.length) {
                                              var13 = new int[2 * ((fh) this).field_c.length];
                                              var14 = 0;
                                              L24: while (true) {
                                                L25: {
                                                  if (((fh) this).field_c.length <= var14) {
                                                    break L25;
                                                  } else {
                                                    var13[var14] = ((fh) this).field_c[var14];
                                                    var14++;
                                                    if (var15 != 0) {
                                                      break L22;
                                                    } else {
                                                      if (var15 == 0) {
                                                        continue L24;
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                }
                                                ((fh) this).field_c = var13;
                                                break L23;
                                              }
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var11++;
                                          break L22;
                                        }
                                        if (var15 == 0) {
                                          continue L16;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                  ((fh) this).field_c[var10] = var5 ^ -1;
                                  stackOut_62_0 = var10;
                                  stackOut_62_1 = var4;
                                  stackIn_63_0 = stackOut_62_0;
                                  stackIn_63_1 = stackOut_62_1;
                                  break L17;
                                }
                                if (stackIn_63_0 < stackIn_63_1) {
                                  break L5;
                                } else {
                                  var4 = var10 + 1;
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var5++;
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var2 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var2;
            stackOut_67_1 = new StringBuilder().append("fh.<init>(");
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L26;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L26;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_d = "Similar rating";
    }
}
