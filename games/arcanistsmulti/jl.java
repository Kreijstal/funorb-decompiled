/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static gh field_h;
    static String field_f;
    static String field_i;
    private int field_k;
    private int[] field_j;
    private boolean field_d;
    static String field_e;
    static String field_l;
    static kc field_a;
    static lk field_c;
    static String field_b;
    static String[] field_g;
    private int field_m;

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            pg.field_d = true;
            la.field_c.field_rb = param1;
            var2_int = ce.field_m.field_e;
            var3 = ce.field_m.field_m;
            var4 = -22 % ((-64 - param0) / 46);
            var4 = la.field_c.field_Z.a(param1, 272, la.field_c.field_z);
            var5 = -103 + var3 / 2 - var4 / 2;
            gm.field_h.a(320, (-320 + var2_int) / 2, var5, -120 + var3 + -(2 * var5), (byte) -120);
            gm.field_h.field_v = of.a(3, gm.field_h.field_I, 1, 2105376, 11579568, 8421504);
            la.field_c.a(-24 + (gm.field_h.field_x - 24), 24, 16, -20 + (gm.field_h.field_I + -24), (byte) -120);
            dm.field_E.a(80, 120, gm.field_h.field_I - 44, 24, (byte) -120);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (runtimeException);
            stackOut_2_1 = new StringBuilder().append("jl.J(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 > param0) {
                break L1;
              } else {
                if (this.field_m < param0) {
                  break L1;
                } else {
                  if (param1 == -11292) {
                    L2: {
                      if ((this.field_m ^ -1) == (param0 ^ -1)) {
                        break L2;
                      } else {
                        sf.a(this.field_j, param0 + 1, this.field_j, param0, this.field_m - param0);
                        break L2;
                      }
                    }
                    this.field_m = this.field_m - 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "jl.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        try {
          L0: {
            if (this.field_m < param1) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L1: {
                if (param0 == 31103) {
                  break L1;
                } else {
                  field_e = (String) null;
                  break L1;
                }
              }
              stackOut_7_0 = this.field_j[param1];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "jl.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final static String b(int param0) {
        Object var1 = null;
        Object var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String stackIn_3_0 = null;
        String stackIn_63_0 = null;
        Object stackIn_103_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_62_0 = null;
        String stackOut_60_0 = null;
        Object stackOut_102_0 = null;
        String stackOut_2_0 = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var1 = null;
            if (param0 == 0) {
              L1: {
                var2 = null;
                if ((nj.field_c ^ -1) != -1) {
                  break L1;
                } else {
                  if (null != om.field_x) {
                    var2 = fn.field_i;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (2 != nj.field_c) {
                  break L2;
                } else {
                  if (wm.c(false)) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (kl.a(ua.field_S, 1)) {
                          break L4;
                        } else {
                          var2 = tj.a(125, new String[]{so.field_p}, qc.field_b);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var2 = tj.a(-41, new String[]{so.field_p}, oo.field_m);
                      break L3;
                    }
                    if (oj.field_i) {
                      ao.a(0, (byte) 83, (String) (var2), (String) null, 2, (String) null);
                      uc.c(3);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L5: {
                if (var2 != null) {
                  break L5;
                } else {
                  if (di.field_j) {
                    break L5;
                  } else {
                    if (tm.field_d == null) {
                      var2 = oa.field_a;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              L6: {
                L7: {
                  if (null == var2) {
                    break L7;
                  } else {
                    rb.a(jk.field_u, (String) (var2), 0, (String) null, param0 ^ -96);
                    if (var10 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  var3 = ah.field_b;
                  var3 = fg.a(var3, -2);
                  var4 = "";
                  var5 = "|";
                  var6 = nj.field_c;
                  var7 = 0;
                  if (var6 == 2) {
                    var4 = tj.a(-99, new String[]{so.field_p}, ge.field_n);
                    var8 = tj.a(-51, new String[]{var3}, pk.field_f);
                    var7 = -485 + (sa.field_Cb.field_x + wn.field_D.field_x - -oo.field_x.b(var8)) - oo.field_x.b(var4);
                    if (0 <= var7) {
                      break L8;
                    } else {
                      var7 = 0;
                      break L8;
                    }
                  } else {
                    L9: {
                      if (0 == var6) {
                        L10: {
                          if (wi.field_f != null) {
                            break L10;
                          } else {
                            if (!hm.field_c) {
                              break L10;
                            } else {
                              var4 = "[" + lj.field_p + "] ";
                              break L10;
                            }
                          }
                        }
                        if (null != wi.field_f) {
                          L11: {
                            L12: {
                              if (!oe.field_a) {
                                break L12;
                              } else {
                                if (he.field_d == null) {
                                  break L12;
                                } else {
                                  var4 = "[" + he.field_d + "] ";
                                  if (var10 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            var4 = "[" + tj.a(param0 + 126, new String[]{wi.field_f.field_ic}, ul.field_j) + "] ";
                            break L11;
                          }
                          var6 = 1;
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                    L13: {
                      if (tk.f((byte) -128)) {
                        stackOut_62_0 = ": ";
                        stackIn_63_0 = stackOut_62_0;
                        break L13;
                      } else {
                        stackOut_60_0 = "<img=3>: ";
                        stackIn_63_0 = stackOut_60_0;
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        var8 = stackIn_63_0;
                        var4 = var4 + var3 + var8;
                        if (wh.field_g) {
                          break L15;
                        } else {
                          if (!ld.field_p) {
                            break L14;
                          } else {
                            var4 = "<col=999999>" + var4 + sb.field_b + "</col>";
                            var5 = "";
                            if (var10 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      var4 = "<col=999999>" + var4 + rk.field_N + "</col>";
                      var5 = "";
                      break L14;
                    }
                    L16: {
                      var9 = oo.field_x.b(var4);
                      if (tk.f((byte) -113)) {
                        break L16;
                      } else {
                        L17: {
                          if (!wn.field_D.field_C) {
                            break L17;
                          } else {
                            if ((-wn.field_D.field_V + an.field_g ^ -1) <= (var9 ^ -1)) {
                              break L17;
                            } else {
                              if (!wh.field_g) {
                                var1 = sb.field_b;
                                break L17;
                              } else {
                                var1 = "Broken!";
                                break L17;
                              }
                            }
                          }
                        }
                        if ((wn.field_D.field_U ^ -1) == -1) {
                          break L16;
                        } else {
                          if ((wn.field_D.field_cb ^ -1) <= (var9 ^ -1)) {
                            break L16;
                          } else {
                            if (!wh.field_g) {
                              gj.a((byte) 104);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                    break L8;
                  }
                }
                L18: {
                  rb.a(wd.field_c[var6], var4 + dj.a(hi.field_e.toString()), var7, var5, -126);
                  if (!ef.field_r) {
                    sa.field_Cb.field_C = false;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                if (sa.field_Cb.field_C) {
                  var1 = tj.a(-118, new String[]{var3, so.field_p}, tn.field_Db);
                  break L6;
                } else {
                  break L6;
                }
              }
              stackOut_102_0 = var1;
              stackIn_103_0 = stackOut_102_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (var1), "jl.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (String) ((Object) stackIn_103_0);
        }
    }

    final void a(int param0, int param1) {
        try {
            this.a(false, param1 + this.field_m, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "jl.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_33_0 = null;
        Class stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_15_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_32_0 = null;
        Class stackOut_34_0 = null;
        Class stackOut_22_0 = null;
        Class stackOut_18_0 = null;
        Class stackOut_9_0 = null;
        Class stackOut_5_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        try {
          L0: {
            if (!param0.equals("B")) {
              if (!param0.equals("I")) {
                if (!param0.equals("S")) {
                  if (param0.equals("J")) {
                    stackOut_15_0 = Long.TYPE;
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param0.equals("Z")) {
                      var2_int = -29 % ((-25 - param1) / 44);
                      if (!param0.equals("F")) {
                        if (param0.equals("D")) {
                          stackOut_27_0 = Double.TYPE;
                          stackIn_28_0 = stackOut_27_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (param0.equals("C")) {
                            stackOut_32_0 = Character.TYPE;
                            stackIn_33_0 = stackOut_32_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            stackOut_34_0 = Class.forName(param0);
                            stackIn_35_0 = stackOut_34_0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          }
                        }
                      } else {
                        stackOut_22_0 = Float.TYPE;
                        stackIn_23_0 = stackOut_22_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_18_0 = Boolean.TYPE;
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = Integer.TYPE;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = Byte.TYPE;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var2);
            stackOut_36_1 = new StringBuilder().append("jl.C(");
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L1;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_28_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_33_0;
                      } else {
                        return stackIn_35_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_f = null;
              field_g = null;
              field_i = null;
              field_b = null;
              if (param0 < -122) {
                break L1;
              } else {
                field_g = (String[]) null;
                break L1;
              }
            }
            field_e = null;
            field_l = null;
            field_c = null;
            field_a = null;
            field_h = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "jl.A(" + param0 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 0;
                if (-1 < (param1 ^ -1)) {
                  break L2;
                } else {
                  if (-65537 < (param1 ^ -1)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2_int += 16;
              param1 = param1 >>> 16;
              break L1;
            }
            L3: {
              if (-257 < (param1 ^ -1)) {
                break L3;
              } else {
                param1 = param1 >>> 8;
                var2_int += 8;
                break L3;
              }
            }
            L4: {
              if (param1 < 16) {
                break L4;
              } else {
                var2_int += 4;
                param1 = param1 >>> 4;
                break L4;
              }
            }
            if (param0 == -79) {
              L5: {
                if (param1 >= 4) {
                  var2_int += 2;
                  param1 = param1 >>> 2;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (-2 < (param1 ^ -1)) {
                  break L6;
                } else {
                  var2_int++;
                  param1 = param1 >>> 1;
                  break L6;
                }
              }
              stackOut_18_0 = param1 + var2_int;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_10_0 = 43;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "jl.I(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_19_0;
        }
    }

    private final void a(int param0, byte param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 12) {
                break L1;
              } else {
                this.field_m = -38;
                break L1;
              }
            }
            var3 = new int[this.b((byte) 115, param0)];
            sf.a(this.field_j, 0, var3, 0, this.field_j.length);
            this.field_j = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref), "jl.E(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 1) {
              stackOut_3_0 = 1 + this.field_m;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 12;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "jl.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.a(-96, -127);
                break L1;
              }
            }
            L2: {
              if ((param1 ^ -1) >= (this.field_m ^ -1)) {
                break L2;
              } else {
                this.field_m = param1;
                break L2;
              }
            }
            L3: {
              if (this.field_j.length > param1) {
                break L3;
              } else {
                this.a(param1, (byte) 14);
                break L3;
              }
            }
            this.field_j[param1] = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "jl.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_13_0 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = this.field_j.length;
            var4 = -48 % ((35 - param0) / 43);
            L1: while (true) {
              L2: {
                L3: {
                  if ((var3_int ^ -1) < (param1 ^ -1)) {
                    break L3;
                  } else {
                    stackOut_3_0 = this.field_d;
                    stackIn_14_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          L5: {
                            if (0 != var3_int) {
                              break L5;
                            } else {
                              var3_int = 1;
                              if (var5 == 0) {
                                continue L1;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var3_int = var3_int * this.field_k;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3_int = var3_int + this.field_k;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_13_0 = var3_int;
                stackIn_14_0 = stackOut_13_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "jl.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    private jl() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "jl.<init>()");
        }
    }

    static {
        field_i = "<%0> has been defeated.";
        field_e = "Just to the left of this message box, you will see the time you have left for your turn. When this runs out you will forfeit your go, so be swift!";
        field_l = "No wands";
        field_f = "  Play will proceed with one player from each team taking turns to move. So even when a team is down to its last Arcanist, they will still have as many turns as the opposing team.<br>  Also, in Team Games, <u>you can control your allies' minions</u>! Work as a team to defend each other, trap the enemy and achieve victory. When setting up Unrated games, the teams will be divided into the top half of the players and the bottom half, also known as TvB.";
        field_b = "Login: ";
        field_g = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
