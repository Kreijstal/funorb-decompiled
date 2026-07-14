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
        ((na) this).field_n = param1;
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
        if (param1 != 418) {
            Object var4 = null;
            ((na) this).a(-48, (byte) -18, (String) null);
        }
        return false;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, (byte) 104, param3);
        if (param1 != 0) {
            return;
        }
        if (param2 <= 36) {
            ((na) this).b(77, -122, 71, 117);
        }
        pj var9 = (pj) (Object) ((na) this).field_n;
        nn var6 = ((na) this).field_P;
        if (var6 == null) {
        } else {
            var7 = var9.a((fj) this, param3, 0);
            var8 = var9.a(param0, 2, (fj) this);
            do {
                tj.a(2 + var6.field_n, 1, -2 + var6.field_r + var7, var8 + (var6.field_m + -2), var6.field_w - -2);
                var6 = var6.field_s;
            } while (var6 != null);
        }
    }

    void a(fj param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param1 != 11579568) {
            na.a((byte) 60);
        }
        super.a(param0, param1 ^ 0, param2, param3);
        ((na) this).field_P = null;
        if (((na) this).field_w) {
            var5 = ld.field_l + (-param2 - ((na) this).field_q);
            var6 = -((na) this).field_m + -param3 + jh.field_R;
            ((na) this).field_P = this.a(5971, var6, var5);
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
        nn var10 = null;
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
                    var10.field_s = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((na) this).field_R.a((rk) (Object) var15, (byte) 88);
                var10 = var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    final static void f(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        ji var9 = null;
        int var10 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        String stackIn_25_0 = null;
        String stackIn_32_0 = null;
        int stackIn_36_0 = 0;
        String stackIn_36_1 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        ji stackIn_42_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        int stackOut_35_0 = 0;
        String stackOut_35_1 = null;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        ji stackOut_41_0 = null;
        ji stackOut_40_0 = null;
        L0: {
          var10 = Confined.field_J ? 1 : 0;
          var1 = uh.field_c;
          var2 = 0;
          if (2 != ea.field_a) {
            break L0;
          } else {
            var3_long = ri.a(-3) + -ga.field_M;
            var2 = (int)((10999L + -var3_long) / 1000L);
            if (var2 >= 0) {
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          }
        }
        var3 = param0;
        L1: while (true) {
          if (dl.field_c.length <= var3) {
            return;
          } else {
            L2: {
              var4 = la.field_T[var3];
              if ((var4 ^ -1) > -1) {
                var5 = sd.field_b;
                break L2;
              } else {
                if (ij.field_q.field_i == var4) {
                  var5 = cg.field_a;
                  break L2;
                } else {
                  var5 = ln.field_c;
                  break L2;
                }
              }
            }
            L3: {
              var6 = dl.field_c[var3];
              if (2 != ea.field_a) {
                break L3;
              } else {
                if (-2 == (var2 ^ -1)) {
                  L4: {
                    if (fj.field_s.length > jc.field_d.length) {
                      stackOut_15_0 = fj.field_s.length;
                      stackIn_16_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = jc.field_d.length;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_16_0;
                    if (tk.field_e.length <= tf.field_d.length) {
                      stackOut_18_0 = tf.field_d.length;
                      stackIn_19_0 = stackOut_18_0;
                      break L5;
                    } else {
                      stackOut_17_0 = tk.field_e.length;
                      stackIn_19_0 = stackOut_17_0;
                      break L5;
                    }
                  }
                  L6: {
                    var8 = stackIn_19_0;
                    if ((var3 ^ -1) > -7) {
                      break L6;
                    } else {
                      if (var3 < 6 - -var7) {
                        L7: {
                          if (-var7 + (-6 + var3) - -jc.field_d.length < 0) {
                            stackOut_24_0 = "";
                            stackIn_25_0 = stackOut_24_0;
                            break L7;
                          } else {
                            stackOut_23_0 = jc.field_d[var3 + -6 + (jc.field_d.length - var7)];
                            stackIn_25_0 = stackOut_23_0;
                            break L7;
                          }
                        }
                        var6_ref = stackIn_25_0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (var7 + 7 > var3) {
                    break L3;
                  } else {
                    if (var3 < 7 - -var7 - -var8) {
                      L8: {
                        if (-var7 + (var3 + -7) >= tf.field_d.length) {
                          stackOut_31_0 = "";
                          stackIn_32_0 = stackOut_31_0;
                          break L8;
                        } else {
                          stackOut_30_0 = tf.field_d[-var7 + var3 - 7];
                          stackIn_32_0 = stackOut_30_0;
                          break L8;
                        }
                      }
                      var6_ref = stackIn_32_0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            L9: {
              if (var4 != -2) {
                break L9;
              } else {
                var6_ref = Integer.toString(var2);
                break L9;
              }
            }
            L10: {
              stackOut_35_0 = -3;
              stackOut_35_1 = (String) var6_ref;
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              if (-1 < var4) {
                stackOut_37_0 = stackIn_37_0;
                stackOut_37_1 = (String) (Object) stackIn_37_1;
                stackOut_37_2 = 0;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                stackIn_38_2 = stackOut_37_2;
                break L10;
              } else {
                stackOut_36_0 = stackIn_36_0;
                stackOut_36_1 = (String) (Object) stackIn_36_1;
                stackOut_36_2 = 1;
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_38_2 = stackOut_36_2;
                break L10;
              }
            }
            L11: {
              var7 = cl.a(stackIn_38_0, stackIn_38_1, stackIn_38_2 != 0);
              var8 = -(var7 >> -810975999) + ef.field_vb;
              if (-1 > var4) {
                break L11;
              } else {
                L12: {
                  var1 = var1 + kb.field_b;
                  if (var4 != ij.field_q.field_i) {
                    stackOut_41_0 = db.field_v;
                    stackIn_42_0 = stackOut_41_0;
                    break L12;
                  } else {
                    stackOut_40_0 = nj.field_T;
                    stackIn_42_0 = stackOut_40_0;
                    break L12;
                  }
                }
                L13: {
                  var9 = stackIn_42_0;
                  if (var9 != null) {
                    var9.a(var1, -jd.field_g + var8, (byte) 103, (n.field_d << -1303764127) + af.field_Z, (jd.field_g << -287248863) + var7);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var1 = var1 + n.field_d;
                break L11;
              }
            }
            if (-1 < (var4 ^ -1)) {
              rn.field_e.c(var6_ref, var8, dh.field_Ab + var1, var5, -1);
              var1 = var1 + wm.field_bb;
              var3++;
              continue L1;
            } else {
              dn.field_f.c(var6_ref, var8, var1 - -nm.field_z, var5, -1);
              var1 = var1 + (n.field_d + kb.field_b + af.field_Z);
              var3++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, byte param1, String param2) {
        String[] var7 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        if (null != ((na) this).field_V) {
            // if_icmple L25
        } else {
            var7 = new String[param0 - -1];
            var4 = var7;
            if (null != ((na) this).field_V) {
                for (var5 = 0; var5 < ((na) this).field_V.length; var5++) {
                    var7[var5] = ((na) this).field_V[var5];
                }
            }
            ((na) this).field_V = var4;
        }
        if (param1 != 9) {
            field_W = false;
        }
        ((na) this).field_V[param0] = param2;
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
