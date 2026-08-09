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
        nn discarded$0 = null;
        if (null == this.field_P) {
            return null;
        }
        if (null == this.field_V) {
            return null;
        }
        if (param0 >= -82) {
            discarded$0 = this.a(44, -115, -76);
        }
        if (this.field_P.field_u >= this.field_V.length) {
            return null;
        }
        return this.field_V[this.field_P.field_u];
    }

    na(String param0, fe param1) {
        super(param0, (uk) null);
        this.field_P = null;
        try {
            this.field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        nn var4;
        nn var5;
        int var6;
        L0: {
          var6 = Confined.field_J ? 1 : 0;
          if (param0 == 5971) {
            break L0;
          } else {
            field_T = (mn) null;
            break L0;
          }
        }
        var4 = (nn) ((Object) this.field_R.a(115));
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (nn) ((Object) this.field_R.d(2123));
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
            field_Q = (String) null;
        }
        this.a(-121, param2, param0, ((pj) ((Object) this.field_n)).a(-1870081887, (fj) (this)), param1);
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param2 - this.field_q;
        int var6 = -this.field_m + param1;
        nn var7 = this.a(param0 ^ 30071, var6, var5);
        if (var7 != null && null != this.field_t) {
            ((ge) ((Object) this.field_t)).a((na) (this), var7.field_u, param3, false);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 > -109) {
            String var7 = (String) null;
            this.a(-97, (byte) 41, (String) null);
        }
        super.a(-123, param1, param2, param3, param4);
        this.b(false);
    }

    boolean a(fj param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 418) {
                break L1;
              } else {
                var4 = (String) null;
                this.a(-48, (byte) -18, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("na.I(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
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
        if (param2 <= 36) {
            this.b(77, -122, 71, 117);
        }
        pj var9 = (pj) ((Object) this.field_n);
        nn var6 = this.field_P;
        if (var6 == null) {
        } else {
            var7 = var9.a((fj) (this), param3, 0);
            var8 = var9.a(param0, 2, (fj) (this));
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              super.a(param0, param1 ^ 0, param2, param3);
              this.field_P = null;
              if (!this.field_w) {
                break L2;
              } else {
                var5_int = ld.field_l + (-param2 - this.field_q);
                var6 = -this.field_m + -param3 + jh.field_R;
                this.field_P = this.a(5971, var6, var5_int);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("na.V(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(boolean param0) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        pj var3;
        sc var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        sd var12;
        int var13;
        int var14;
        nn var15;
        int var16;
        fj var17;
        var16 = Confined.field_J ? 1 : 0;
        this.field_R = new mn();
        var2 = 0;
        var3 = (pj) ((Object) this.field_n);
        var4 = var3.a((fj) (this), (byte) -119);
        L0: while (true) {
          var5 = this.field_B.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            L1: {
              if (!param0) {
                break L1;
              } else {
                var17 = (fj) null;
                this.a((fj) null, 126, -29, -40);
                break L1;
              }
            }
            return;
          } else {
            var7 = this.field_B.indexOf(">", var5);
            var6 = this.field_B.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_B.indexOf("</hotspot>", var5);
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
                  if ((var8 ^ -1) != (var11 ^ -1)) {
                    stackIn_7_0 = var12.field_e[0];
                    break L3;
                  } else {
                    stackIn_7_0 = var4.a(var5, -124);
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_7_0;
                  if (var11 != var9) {
                    if (var12 == null) {
                      stackIn_12_0 = 0;
                      break L4;
                    } else {
                      stackIn_12_0 = var12.field_e[var12.field_e.length + -1];
                      break L4;
                    }
                  } else {
                    stackIn_12_0 = var4.a(var2, -108);
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_12_0;
                  var15 = new nn(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(-1431655766), var12.field_a + -var12.field_d));
                  if (var10 != null) {
                    ((nn) (var10)).field_s = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_R.a((rk) (var15), (byte) 88);
                var10 = var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    final static void f(int param0) {
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        ji stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ji var9 = null;
        int var10 = 0;
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
            var3 = param0;
            L2: while (true) {
              if (dl.field_c.length <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = la.field_T[var3];
                  if ((var4 ^ -1) > -1) {
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
                    if (-2 == (var2 ^ -1)) {
                      L5: {
                        if (fj.field_s.length > jc.field_d.length) {
                          stackIn_17_0 = fj.field_s.length;
                          break L5;
                        } else {
                          stackIn_17_0 = jc.field_d.length;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_17_0;
                        if (tk.field_e.length <= tf.field_d.length) {
                          stackIn_20_0 = tf.field_d.length;
                          break L6;
                        } else {
                          stackIn_20_0 = tk.field_e.length;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_20_0;
                        if ((var3 ^ -1) > -7) {
                          break L7;
                        } else {
                          if (var3 < 6 - -var7) {
                            L8: {
                              if (-var7 + (-6 + var3) - -jc.field_d.length < 0) {
                                stackIn_26_0 = "";
                                break L8;
                              } else {
                                stackIn_26_0 = jc.field_d[var3 + -6 + (jc.field_d.length - var7)];
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
                            if (-var7 + (var3 + -7) >= tf.field_d.length) {
                              stackIn_33_0 = "";
                              break L9;
                            } else {
                              stackIn_33_0 = tf.field_d[-var7 + var3 - 7];
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
                  stackIn_38_0 = -3;

                  stackIn_38_1 = (String) (var6);

                  if (-1 < (var4 ^ -1)) {
                    stackIn_39_0 = stackIn_38_0;
                    stackIn_39_1 = (String) ((Object) stackIn_38_1);
                    stackIn_39_2 = 0;
                    break L11;
                  } else {
                    stackIn_39_0 = stackIn_38_0;
                    stackIn_39_1 = (String) ((Object) stackIn_38_1);
                    stackIn_39_2 = 1;
                    break L11;
                  }
                }
                L12: {
                  var7 = cl.a(stackIn_39_0, stackIn_39_1, stackIn_39_2 != 0);
                  var8 = -(var7 >> -810975999) + ef.field_vb;
                  if (-1 < (var4 ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      var1_int = var1_int + kb.field_b;
                      if (var4 != ij.field_q.field_i) {
                        stackIn_43_0 = db.field_v;
                        break L13;
                      } else {
                        stackIn_43_0 = nj.field_T;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_43_0;
                      if (var9 != null) {
                        var9.a(var1_int, -jd.field_g + var8, (byte) 103, (n.field_d << -1303764127) + af.field_Z, (jd.field_g << -287248863) + var7);
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
                  if (-1 < (var4 ^ -1)) {
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
          throw sd.a((Throwable) ((Object) var1), "na.E(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1, String param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == this.field_V) {
                  break L2;
                } else {
                  if (this.field_V.length <= param0) {
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
                if (null == this.field_V) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= this.field_V.length) {
                      break L3;
                    } else {
                      var7[var5] = this.field_V[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              this.field_V = var8;
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
            this.field_V[param0] = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("na.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_Q = "Cloak";
        field_U = "Next";
        field_T = new mn();
    }
}
