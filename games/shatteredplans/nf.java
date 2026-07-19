/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    long field_p;
    boolean field_h;
    static String field_m;
    int field_g;
    static String field_i;
    static int[] field_a;
    String field_o;
    String field_k;
    int field_c;
    String field_d;
    int field_l;
    int[] field_f;
    String field_b;
    int field_n;
    qr field_j;
    int field_e;

    final int a(byte param0) {
        if (!this.field_h) {
          if ((this.field_n ^ -1) != -3) {
            if ((this.field_p ^ -1L) == (ec.field_p ^ -1L)) {
              return 1;
            } else {
              if (-3 != (po.field_b ^ -1)) {
                if (param0 <= 100) {
                  return 23;
                } else {
                  return 0;
                }
              } else {
                if (!da.a(-30106, this.field_b)) {
                  if (param0 <= 100) {
                    return 23;
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (this.field_c <= 0) {
              if ((this.field_p ^ -1L) == (ec.field_p ^ -1L)) {
                return 1;
              } else {
                if (-3 != (po.field_b ^ -1)) {
                  if (param0 <= 100) {
                    return 23;
                  } else {
                    return 0;
                  }
                } else {
                  if (!da.a(-30106, this.field_b)) {
                    if (param0 <= 100) {
                      return 23;
                    } else {
                      return 0;
                    }
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    final static String a(eg param0, int param1) {
        int incrementValue$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        ne var4 = null;
        String var5 = null;
        String[] var6 = null;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_17_0 = null;
        String stackOut_16_0 = null;
        String stackOut_32_0 = null;
        String stackOut_13_0 = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            var4 = (ne) ((Object) param0.field_v.d(0));
            L1: while (true) {
              if (var4 == null) {
                if (param1 == 23248) {
                  if (-1 != (var2_int ^ -1)) {
                    L2: {
                      if (1 == var2_int) {
                        stackOut_17_0 = bk.field_d;
                        stackIn_18_0 = stackOut_17_0;
                        break L2;
                      } else {
                        stackOut_16_0 = re.a(rl.field_e, 4371, new String[]{Integer.toString(var2_int)});
                        stackIn_18_0 = stackOut_16_0;
                        break L2;
                      }
                    }
                    L3: {
                      var9 = stackIn_18_0;
                      var5 = var9;
                      if (0 != var3) {
                        var6 = new String[1 + var3];
                        var3 = 1;
                        var6[0] = var9;
                        var4 = (ne) ((Object) param0.field_v.d(0));
                        L4: while (true) {
                          if (var4 == null) {
                            var5 = va.a(-2, var6);
                            break L3;
                          } else {
                            L5: {
                              if (var4.field_h != ho.field_d) {
                                break L5;
                              } else {
                                if (-1 == (var4.field_r ^ -1)) {
                                  break L5;
                                } else {
                                  if (null == var4.field_k) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (-2 != (var4.field_r ^ -1)) {
                                        var7 = re.a(wl.field_c, 4371, new String[]{pa.a(var4.field_k, -97), Integer.toString(var4.field_r)});
                                        break L6;
                                      } else {
                                        var7 = re.a(lh.field_H, 4371, new String[]{pa.a(var4.field_k, -110)});
                                        break L6;
                                      }
                                    }
                                    incrementValue$1 = var3;
                                    var3++;
                                    var6[incrementValue$1] = var7;
                                    break L5;
                                  }
                                }
                              }
                            }
                            var4 = (ne) ((Object) param0.field_v.a((byte) -71));
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    stackOut_32_0 = (String) (var5);
                    stackIn_33_0 = stackOut_32_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackOut_13_0 = bq.field_f;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackOut_10_0 = (String) null;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L7: {
                  if (ho.field_d != var4.field_h) {
                    break L7;
                  } else {
                    L8: {
                      if (-1 == (var4.field_r ^ -1)) {
                        break L8;
                      } else {
                        if (null == var4.field_k) {
                          break L8;
                        } else {
                          var3++;
                          break L8;
                        }
                      }
                    }
                    var2_int = var2_int + var4.field_p;
                    break L7;
                  }
                }
                var4 = (ne) ((Object) param0.field_v.a((byte) -71));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var2);
            stackOut_34_1 = new StringBuilder().append("nf.E(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L9;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_33_0;
          }
        }
    }

    final static int[] a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length;
              var3 = new int[var2_int];
              if (param1 == 3718) {
                break L1;
              } else {
                nf.b((byte) -75);
                break L1;
              }
            }
            var4 = 1;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_10_0 = (int[]) (var3);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                var5 = var4;
                L3: while (true) {
                  L4: {
                    var5--;
                    if (0 > var5) {
                      break L4;
                    } else {
                      if (param0[var3[var5]] <= param0[var4]) {
                        break L4;
                      } else {
                        var3[1 + var5] = var3[var5];
                        continue L3;
                      }
                    }
                  }
                  var3[1 + var5] = var4;
                  var4++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("nf.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final static String a(String param0, String param1, byte param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = param1.indexOf(param0);
        if (param2 > 57) {
          L0: while (true) {
            if (var4 == -1) {
              return param1;
            } else {
              param1 = param1.substring(0, var4) + param3 + param1.substring(var4 - -param0.length());
              var4 = param1.indexOf(param0, var4 - -param3.length());
              continue L0;
            }
          }
        } else {
          return (String) null;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        if (null == tc.field_G) {
          var3 = 107 % ((param0 - -29) / 53);
          return;
        } else {
          L0: {
            var3 = tc.field_G.b(param2, (byte) -68);
            if (1 == (var3 ^ -1)) {
              break L0;
            } else {
              L1: {
                if (var3 == -1) {
                  break L1;
                } else {
                  var4 = tc.field_G.i(-86) ? 1 : 0;
                  bb.a(94, tc.field_G.field_Gb, param1, var4 != 0, tc.field_G.g((byte) -42), var3);
                  break L1;
                }
              }
              tc.field_G = null;
              ai.a(3);
              break L0;
            }
          }
          var3 = 107 % ((param0 - -29) / 53);
          return;
        }
    }

    nf(boolean param0) {
        this.field_e = va.field_b;
        if (param0) {
            this.field_f = mb.field_p;
        } else {
            this.field_f = null;
        }
        this.field_b = em.field_a;
        this.field_k = ke.field_h;
        this.field_c = nj.field_a;
        this.field_h = kr.field_b;
        this.field_o = mc.field_q;
        this.field_p = sp.field_j;
        this.field_l = el.field_f;
        this.field_g = fm.field_f;
        this.field_n = ob.field_k;
        this.field_d = jc.field_s;
    }

    public static void b(byte param0) {
        field_i = null;
        if (param0 != -25) {
            field_i = (String) null;
            field_m = null;
            field_a = null;
            return;
        }
        field_m = null;
        field_a = null;
    }

    nf(int param0, String param1, int param2, String param3, String param4) {
        try {
            this.field_h = true;
            this.field_k = param4;
            this.field_g = param2;
            this.field_o = param3;
            this.field_d = param1;
            this.field_c = 0;
            this.field_n = param0;
            this.field_p = 0L;
            this.field_e = 0;
            this.field_f = null;
            this.field_b = param1;
            this.field_l = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "nf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Total fleets lost.";
        field_i = "Close";
    }
}
