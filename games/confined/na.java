/*
 * Decompiled by CFR-JS 0.4.0.
 */
class na extends rg {
    private mn field_R;
    static ve field_S;
    static String field_U;
    static mn field_T;
    private nn field_P;
    private String[] field_V;
    static String field_Q;
    static boolean field_W;

    String f(byte param0) {
        if (null == ((na) this).field_P) {
            return null;
        }
        if (null == ((na) this).field_V) {
            return null;
        }
        if (param0 >= -82) {
            nn discarded$0 = this.a(44, -115, -76);
        }
        if (((na) this).field_P.field_u >= ((na) this).field_V.length) {
            return null;
        }
        return ((na) this).field_V[((na) this).field_P.field_u];
    }

    na(String param0, fe param1) {
        super(param0, (uk) null);
        ((na) this).field_P = null;
        try {
            ((na) this).field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "na.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(byte param0) {
        field_Q = null;
        field_T = null;
        field_S = null;
        if (param0 != -127) {
            return;
        }
        field_U = null;
    }

    private final nn a(int param0, int param1, int param2) {
        nn var4 = null;
        nn var5 = null;
        int var6 = 0;
        L0: {
          var6 = Confined.field_J ? 1 : 0;
          if (param0 == 5971) {
            break L0;
          } else {
            field_T = null;
            break L0;
          }
        }
        var4 = (nn) (Object) ((na) this).field_R.a(115);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (nn) (Object) ((na) this).field_R.d(2123);
                continue L1;
              } else {
                L3: {
                  if (param2 < var5.field_r) {
                    break L3;
                  } else {
                    if (param1 < var5.field_m) {
                      break L3;
                    } else {
                      if (var5.field_w + var5.field_r <= param2) {
                        break L3;
                      } else {
                        if (var5.field_n + var5.field_m >= param1) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_s;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param3 != 8888) {
            field_Q = null;
        }
        ((na) this).a(-121, param2, param0, ((pj) (Object) ((na) this).field_n).a(-1870081887, (fj) this), param1);
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param2 - ((na) this).field_q;
        int var6 = -((na) this).field_m + param1;
        nn var7 = this.a(param0 ^ 30071, var6, var5);
        if (var7 != null) {
            if (null != ((na) this).field_t) {
                ((ge) (Object) ((na) this).field_t).a((na) this, var7.field_u, param3, false);
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 > -109) {
            Object var7 = null;
            ((na) this).a(-97, (byte) 41, (String) null);
        }
        super.a(-123, param1, param2, param3, param4);
        ((na) this).b(false);
    }

    boolean a(fj param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 418) {
                break L1;
              } else {
                var4 = null;
                ((na) this).a(-48, (byte) -18, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("na.I(");
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
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, (byte) 104, param3);
        if (param1 != 0) {
            return;
        }
        pj var5 = (pj) (Object) ((na) this).field_n;
        nn var6 = ((na) this).field_P;
        if (var6 == null) {
        } else {
            var7 = var5.a((fj) this, param3, 0);
            var8 = var5.a(param0, 2, (fj) this);
            do {
                tj.a(2 + var6.field_n, 1, -2 + var6.field_r + var7, var8 + (var6.field_m + -2), var6.field_w - -2);
                var6 = var6.field_s;
            } while (var6 != null);
        }
    }

    void a(fj param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 11579568) {
                break L1;
              } else {
                na.a((byte) 60);
                break L1;
              }
            }
            L2: {
              super.a(param0, param1, param2, param3);
              ((na) this).field_P = null;
              if (!((na) this).field_w) {
                break L2;
              } else {
                var5_int = ld.field_l + (-param2 - ((na) this).field_q);
                var6 = -((na) this).field_m + -param3 + jh.field_R;
                ((na) this).field_P = this.a(5971, var6, var5_int);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("na.V(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        pj var3 = null;
        sc var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        sd var12 = null;
        int var13 = 0;
        int var14 = 0;
        nn var15 = null;
        int var16 = 0;
        Object var17 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var16 = Confined.field_J ? 1 : 0;
        ((na) this).field_R = new mn();
        var2 = 0;
        var3 = (pj) (Object) ((na) this).field_n;
        var4 = var3.a((fj) this, (byte) -119);
        L0: while (true) {
          var5 = ((na) this).field_B.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var17 = null;
                ((na) this).a((fj) null, 126, -29, -40);
                break L1;
              }
            }
            return;
          } else {
            var7 = ((na) this).field_B.indexOf(">", var5);
            var6 = ((na) this).field_B.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((na) this).field_B.indexOf("</hotspot>", var5);
            var8 = var4.b(-126, var5);
            var9 = var4.b(-101, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L0;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var8 != var11) {
                    stackOut_6_0 = var12.field_e[0];
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = var4.a(var5, -124);
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_7_0;
                  if (var11 != var9) {
                    if (var12 == null) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L4;
                    } else {
                      stackOut_10_0 = var12.field_e[var12.field_e.length + -1];
                      stackIn_12_0 = stackOut_10_0;
                      break L4;
                    }
                  } else {
                    stackOut_8_0 = var4.a(var2, -108);
                    stackIn_12_0 = stackOut_8_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_12_0;
                  var15 = new nn(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(-1431655766), var12.field_a + -var12.field_d));
                  if (var10 != null) {
                    ((nn) var10).field_s = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((na) this).field_R.a((rk) (Object) var15, (byte) 88);
                var10 = (Object) (Object) var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    final static void f() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ji var9 = null;
        int var10 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        ji stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        ji stackOut_42_0 = null;
        ji stackOut_41_0 = null;
        var10 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = uh.field_c;
              var2 = 0;
              if (2 != ea.field_a) {
                break L1;
              } else {
                var3_long = ri.a(-3) + -ga.field_M;
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (var2 >= 0) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              }
            }
            var3 = 0;
            L2: while (true) {
              if (dl.field_c.length <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = la.field_T[var3];
                  if (var4 < 0) {
                    var5 = sd.field_b;
                    break L3;
                  } else {
                    if (ij.field_q.field_i == var4) {
                      var5 = cg.field_a;
                      break L3;
                    } else {
                      var5 = ln.field_c;
                      break L3;
                    }
                  }
                }
                L4: {
                  var6 = dl.field_c[var3];
                  if (2 != ea.field_a) {
                    break L4;
                  } else {
                    if (var2 == 1) {
                      L5: {
                        if (~fj.field_s.length < ~jc.field_d.length) {
                          stackOut_16_0 = fj.field_s.length;
                          stackIn_17_0 = stackOut_16_0;
                          break L5;
                        } else {
                          stackOut_15_0 = jc.field_d.length;
                          stackIn_17_0 = stackOut_15_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_17_0;
                        if (tk.field_e.length <= tf.field_d.length) {
                          stackOut_19_0 = tf.field_d.length;
                          stackIn_20_0 = stackOut_19_0;
                          break L6;
                        } else {
                          stackOut_18_0 = tk.field_e.length;
                          stackIn_20_0 = stackOut_18_0;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_20_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (~var3 > ~(6 - -var7)) {
                            L8: {
                              if (-var7 + (-6 + var3) - -jc.field_d.length < 0) {
                                stackOut_25_0 = "";
                                stackIn_26_0 = stackOut_25_0;
                                break L8;
                              } else {
                                stackOut_24_0 = jc.field_d[var3 + -6 + (jc.field_d.length - var7)];
                                stackIn_26_0 = stackOut_24_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_26_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var7 + 7 > var3) {
                        break L4;
                      } else {
                        if (var3 < 7 - -var7 - -var8) {
                          L9: {
                            if (~(-var7 + (var3 + -7)) <= ~tf.field_d.length) {
                              stackOut_32_0 = "";
                              stackIn_33_0 = stackOut_32_0;
                              break L9;
                            } else {
                              stackOut_31_0 = tf.field_d[-var7 + var3 - 7];
                              stackIn_33_0 = stackOut_31_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (var4 != -2) {
                    break L10;
                  } else {
                    var6 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  stackOut_36_0 = -3;
                  stackOut_36_1 = (String) var6;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  if (var4 < 0) {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = (String) (Object) stackIn_38_1;
                    stackOut_38_2 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    break L11;
                  } else {
                    stackOut_37_0 = stackIn_37_0;
                    stackOut_37_1 = (String) (Object) stackIn_37_1;
                    stackOut_37_2 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    break L11;
                  }
                }
                L12: {
                  var7 = cl.a(stackIn_39_0, stackIn_39_1, stackIn_39_2 != 0);
                  var8 = -(var7 >> 1) + ef.field_vb;
                  if (var4 < 0) {
                    break L12;
                  } else {
                    L13: {
                      var1_int = var1_int + kb.field_b;
                      if (var4 != ij.field_q.field_i) {
                        stackOut_42_0 = db.field_v;
                        stackIn_43_0 = stackOut_42_0;
                        break L13;
                      } else {
                        stackOut_41_0 = nj.field_T;
                        stackIn_43_0 = stackOut_41_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_43_0;
                      if (var9 != null) {
                        var9.a(var1_int, -jd.field_g + var8, (byte) 103, (n.field_d << 1) + af.field_Z, (jd.field_g << 1) + var7);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + n.field_d;
                    break L12;
                  }
                }
                L15: {
                  if (var4 < 0) {
                    rn.field_e.c(var6, var8, dh.field_Ab + var1_int, var5, -1);
                    var1_int = var1_int + wm.field_bb;
                    break L15;
                  } else {
                    dn.field_f.c(var6, var8, var1_int - -nm.field_z, var5, -1);
                    var1_int = var1_int + (n.field_d + kb.field_b + af.field_Z);
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "na.E(" + 0 + 41);
        }
    }

    final void a(int param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((na) this).field_V) {
                  break L2;
                } else {
                  if (((na) this).field_V.length <= param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[param0 - -1];
                var8 = var7;
                var4 = var8;
                if (null == ((na) this).field_V) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((na) this).field_V.length) {
                      break L3;
                    } else {
                      var7[var5] = ((na) this).field_V[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              ((na) this).field_V = var8;
              break L1;
            }
            L5: {
              if (param1 == 9) {
                break L5;
              } else {
                field_W = false;
                break L5;
              }
            }
            ((na) this).field_V[param0] = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("na.D(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Cloak";
        field_U = "Next";
        field_T = new mn();
    }
}
