/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_e;
    static String field_a;
    static byte[] field_j;
    static String field_g;
    static String field_h;
    int field_i;
    short field_b;
    short field_l;
    int field_d;
    static int field_f;
    short field_k;
    boolean field_c;

    private final void a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        L0: {
          var6 = param1 - param0[0];
          var7 = param2 - param0[1];
          var8 = param3 - 64 - param0[2];
          var9 = param0[9] * var6 + param0[10] * var7 + param0[11] * var8 >> 16;
          if (var9 <= 0) {
            break L0;
          } else {
            var10 = (qh.field_b + fb.field_q << 4) + (param0[3] * var6 + param0[4] * var7 + param0[5] * var8 >> 3) / var9;
            var11 = (qh.field_c + fb.field_d << 4) + (param0[6] * var6 + param0[7] * var7 + param0[8] * var8 >> 3) / var9;
            param4 = param4 / var9;
            if (param4 <= -23170) {
              break L0;
            } else {
              if (param4 >= 23170) {
                break L0;
              } else {
                qh.a(var10, var11, param4, 4, bc.field_c);
                break L0;
              }
            }
          }
        }
    }

    final void a(int param0, int[] param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a(param1, this.field_e, this.field_i, this.field_d, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("dk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, pq param3, int param4) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        long var12 = 0L;
        try {
          L0: {
            L1: {
              param3.a(param2, 6);
              var5_long = param3.e(-14770);
              var7 = param0 - param3.field_g;
              var8 = -param3.field_k + param4;
              var9 = bm.a(-107, od.a((long)var7, (long)var7, false) - -od.a((long)var8, (long)var8, false));
              if ((var9 ^ -1L) < -2147483648L) {
                break L1;
              } else {
                if (var9 >= -2147483648L) {
                  L2: {
                    var7 = lh.a((int)var9, (byte) -96, (long)var7);
                    var8 = lh.a((int)var9, (byte) -85, (long)var8);
                    var11 = aj.a(var7, false, param3.field_I) - -aj.a(var8, false, param3.field_t);
                    param3.field_I = param3.field_I - 2 * aj.a(var11, false, var7);
                    param3.field_t = param3.field_t - aj.a(var11, false, var8) * 2;
                    param3.field_n = param3.field_n * kp.field_m >> 1197710536;
                    param3.field_v = 1;
                    param3.field_b = param3.field_b * kp.field_m >> -685301976;
                    param3.field_K = kp.field_m * param3.field_K >> -1327171448;
                    var12 = param3.e(-14770);
                    if ((td.field_b ^ -1) <= (nn.field_e.length ^ -1)) {
                      break L2;
                    } else {
                      nn.field_e[td.field_b][0] = param0;
                      nn.field_e[td.field_b][1] = param4;
                      nn.field_e[td.field_b][2] = -524288;
                      break L2;
                    }
                  }
                  L3: {
                    if ((td.field_b ^ -1) > (cf.field_g.length ^ -1)) {
                      fieldTemp$0 = td.field_b;
                      td.field_b = td.field_b + 1;
                      cf.field_g[fieldTemp$0] = (int)(var5_long - var12);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (param1 == -20) {
                      break L4;
                    } else {
                      field_g = (String) null;
                      break L4;
                    }
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalStateException("d out of bounds.");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("dk.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        try {
            this.field_k = (short)(param2 + -this.field_i);
            this.field_b = (short)(param0 + -this.field_e);
            this.field_i = param2;
            this.field_e = param0;
            if (param1 != 78) {
                dk.a((byte) -28, (String) null, (di) null, (String) null, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "dk.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(int param0) {
        String stackIn_59_0 = null;
        Object stackIn_97_0 = null;
        RuntimeException decompiledCaughtException = null;
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
        var10 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                dk.a((byte) -62, (String) null, (di) null, (String) null, (String) null);
                break L1;
              }
            }
            L2: {
              var1 = null;
              var2 = null;
              if (0 != hn.field_b) {
                break L2;
              } else {
                if (tp.field_e != null) {
                  var2 = cl.field_l;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (hn.field_b != 2) {
                break L3;
              } else {
                if (!hp.a(false)) {
                  L4: {
                    L5: {
                      if (lq.a(di.field_a, -1)) {
                        break L5;
                      } else {
                        var2 = nr.a(new String[]{fm.field_I}, param0 ^ -2, tp.field_c);
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var2 = nr.a(new String[]{fm.field_I}, -1, bm.field_d);
                    break L4;
                  }
                  if (!fm.field_H) {
                    break L3;
                  } else {
                    jh.a(0, (String) (var2), (String) null, 2, (String) null, true);
                    th.b(-1);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            }
            L6: {
              if (null != var2) {
                break L6;
              } else {
                if (gd.field_b) {
                  break L6;
                } else {
                  if (uq.field_D != null) {
                    break L6;
                  } else {
                    var2 = fj.field_i;
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (var2 != null) {
                dr.a((String) null, param0 + 11467, mc.field_g, 0, (String) (var2));
                break L7;
              } else {
                L8: {
                  var3 = di.field_j;
                  var3 = bm.a(524288, var3);
                  var4 = "";
                  var5 = "|";
                  var6 = hn.field_b;
                  var7 = 0;
                  if ((var6 ^ -1) == -3) {
                    var4 = nr.a(new String[]{fm.field_I}, -1, jl.field_a);
                    var8 = nr.a(new String[]{var3}, -1, vh.field_S);
                    var7 = pa.field_J.field_gb - (-fj.field_j.field_gb + (485 - m.field_c.b(var8) + m.field_c.b(var4)));
                    if (var7 >= 0) {
                      break L8;
                    } else {
                      var7 = 0;
                      break L8;
                    }
                  } else {
                    L9: {
                      if ((var6 ^ -1) == -1) {
                        L10: {
                          if (null != em.field_L) {
                            break L10;
                          } else {
                            if (ej.field_l) {
                              var4 = "[" + sn.field_l + "] ";
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (null != em.field_L) {
                          L11: {
                            L12: {
                              if (!sa.field_c) {
                                break L12;
                              } else {
                                if (kn.field_g == null) {
                                  break L12;
                                } else {
                                  var4 = "[" + kn.field_g + "] ";
                                  if (var10 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            var4 = "[" + nr.a(new String[]{em.field_L.field_Ob}, -1, th.field_c) + "] ";
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
                      if (ia.b(-1)) {
                        stackIn_59_0 = ": ";
                        break L13;
                      } else {
                        stackIn_59_0 = "<img=3>: ";
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        var8 = stackIn_59_0;
                        var4 = var4 + var3 + var8;
                        if (!ea.field_z) {
                          break L15;
                        } else {
                          var5 = "";
                          var4 = "<col=999999>" + var4 + fg.field_e + "</col>";
                          if (var10 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (!hr.field_y) {
                        break L14;
                      } else {
                        var5 = "";
                        var4 = "<col=999999>" + var4 + je.field_c + "</col>";
                        break L14;
                      }
                    }
                    L16: {
                      var9 = m.field_c.b(var4);
                      if (ia.b(param0 ^ -2)) {
                        break L16;
                      } else {
                        L17: {
                          if (!pa.field_J.field_W) {
                            break L17;
                          } else {
                            if (-pa.field_J.field_sb + wn.field_i >= var9) {
                              break L17;
                            } else {
                              if (ea.field_z) {
                                var1 = "Broken!";
                                break L17;
                              } else {
                                var1 = je.field_c;
                                break L17;
                              }
                            }
                          }
                        }
                        if ((pa.field_J.field_R ^ -1) == -1) {
                          break L16;
                        } else {
                          if (var9 <= pa.field_J.field_mb) {
                            break L16;
                          } else {
                            if (ea.field_z) {
                              break L16;
                            } else {
                              r.c((byte) 68);
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
                  dr.a(var5, 11468, pq.field_F[var6], var7, var4 + lr.a(td.field_c.toString()));
                  if (rg.field_p) {
                    break L18;
                  } else {
                    fj.field_j.field_W = false;
                    break L18;
                  }
                }
                L19: {
                  if (!fj.field_j.field_W) {
                    break L19;
                  } else {
                    var1 = nr.a(new String[]{var3, fm.field_I}, -1, wb.field_b);
                    break L19;
                  }
                }
                break L7;
              }
            }
            stackIn_97_0 = var1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (var1), "dk.E(" + param0 + ')');
        }
        return (String) ((Object) stackIn_97_0);
    }

    private final void a(int param0, int param1, byte param2) {
        try {
            this.field_i = param0;
            this.field_e = param1;
            if (param2 <= 21) {
                this.a(-71, 118, (byte) -96);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "dk.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != 113) {
            return;
        }
        try {
            field_j = null;
            field_a = null;
            field_h = null;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "dk.B(" + param0 + ')');
        }
    }

    final static String a(byte param0, String param1, di param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2.d(58)) {
              stackIn_4_0 = (String) (param4);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = -40 / ((param0 - 48) / 49);
              stackIn_6_0 = param3 + " - " + param2.a(100, param1) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("dk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(vh param0, byte param1) {
        dd var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (param1 == 93) {
                break L1;
              } else {
                dk.a((byte) 91, (String) null, (di) null, (String) null, (String) null);
                break L1;
              }
            }
            L2: {
              var2 = param0.field_hb;
              var2.field_B = -var2.field_A + param0.field_Db >> -60928575;
              var2.field_y = var2.field_B + var2.field_A;
              var2 = param0.field_yb;
              if (null != var2) {
                var2.field_B = -var2.field_A + param0.field_Db >> 1201808769;
                var2.field_y = var2.field_B + var2.field_A;
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2_ref);

            stackIn_11_1 = new StringBuilder().append("dk.I(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    dk(int param0, int param1) {
        this.field_c = false;
        try {
            this.a(param1, param0, (byte) 34);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "dk.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "This game option has not yet been unlocked for use.";
        field_f = 0;
        field_h = "This game has been updated! Please reload this page.";
        field_g = "Return to lobby";
    }
}
