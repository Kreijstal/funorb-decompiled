/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static int[] field_g;
    static ob field_d;
    static String field_a;
    static int field_e;
    static int[] field_f;
    static mc field_c;
    static int field_b;
    static String field_i;
    static int field_h;

    final static void b(int param0) {
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
        mp var9 = null;
        int var10 = 0;
        int stackIn_17_0 = 0;
        String stackIn_22_0 = null;
        int stackIn_26_0 = 0;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        String stackIn_38_0 = null;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        mp stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        String stackOut_21_0 = null;
        String stackOut_20_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        String stackOut_36_0 = null;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        mp stackOut_42_0 = null;
        mp stackOut_41_0 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = be.field_t;
              var2 = 0;
              if (da.field_j != 2) {
                break L1;
              } else {
                var3_long = gk.a(95) - qe.field_cb;
                var2 = (int)((-var3_long + 10999L) / 1000L);
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
              if (mn.field_q.length <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = gd.field_s[var3];
                  if (var4 >= 0) {
                    if (~var4 == ~ve.field_d.field_c) {
                      var5 = sr.field_a;
                      break L3;
                    } else {
                      var5 = ma.field_m;
                      break L3;
                    }
                  } else {
                    var5 = oi.field_b;
                    break L3;
                  }
                }
                L4: {
                  var6 = mn.field_q[var3];
                  if (da.field_j != 2) {
                    break L4;
                  } else {
                    if (var2 == 1) {
                      L5: {
                        if (~rp.field_e.length < ~jo.field_g.length) {
                          stackOut_16_0 = rp.field_e.length;
                          stackIn_17_0 = stackOut_16_0;
                          break L5;
                        } else {
                          stackOut_15_0 = jo.field_g.length;
                          stackIn_17_0 = stackOut_15_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_17_0;
                        if (var3 < 6) {
                          break L6;
                        } else {
                          if (~var3 <= ~(6 - -var7)) {
                            break L6;
                          } else {
                            L7: {
                              if (-6 + var3 + (jo.field_g.length + -var7) >= 0) {
                                stackOut_21_0 = jo.field_g[jo.field_g.length + (-6 + var3 - var7)];
                                stackIn_22_0 = stackOut_21_0;
                                break L7;
                              } else {
                                stackOut_20_0 = "";
                                stackIn_22_0 = stackOut_20_0;
                                break L7;
                              }
                            }
                            var6 = stackIn_22_0;
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (ba.field_b.length > bl.field_z.length) {
                          stackOut_25_0 = ba.field_b.length;
                          stackIn_26_0 = stackOut_25_0;
                          break L8;
                        } else {
                          stackOut_24_0 = bl.field_z.length;
                          stackIn_26_0 = stackOut_24_0;
                          break L8;
                        }
                      }
                      var8 = stackIn_26_0;
                      if (~(var7 + 7) < ~var3) {
                        break L4;
                      } else {
                        if (~(var8 + (7 - -var7)) < ~var3) {
                          L9: {
                            if (var3 + (-7 - var7) < bl.field_z.length) {
                              stackOut_31_0 = bl.field_z[-7 + var3 - var7];
                              stackIn_32_0 = stackOut_31_0;
                              break L9;
                            } else {
                              stackOut_30_0 = "";
                              stackIn_32_0 = stackOut_30_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_32_0;
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
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  stackOut_36_0 = (String) var6;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_37_0 = stackOut_36_0;
                  if (0 > var4) {
                    stackOut_38_0 = (String) (Object) stackIn_38_0;
                    stackOut_38_1 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    break L11;
                  } else {
                    stackOut_37_0 = (String) (Object) stackIn_37_0;
                    stackOut_37_1 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    break L11;
                  }
                }
                L12: {
                  var7 = uc.a(stackIn_39_0, stackIn_39_1 != 0, false);
                  var8 = vm.field_c - (var7 >> 1);
                  if (0 > var4) {
                    break L12;
                  } else {
                    L13: {
                      if (~var4 == ~ve.field_d.field_c) {
                        stackOut_42_0 = mq.field_v;
                        stackIn_43_0 = stackOut_42_0;
                        break L13;
                      } else {
                        stackOut_41_0 = gl.field_i;
                        stackIn_43_0 = stackOut_41_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_43_0;
                      var1_int = var1_int + al.field_z;
                      if (var9 != null) {
                        var9.a(kd.field_z - -(qc.field_z << 1), var8 + -gl.field_l, var1_int, var7 - -(gl.field_l << 1), -114);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + qc.field_z;
                    break L12;
                  }
                }
                L15: {
                  if (0 <= var4) {
                    gb.field_b.b(var6, var8, var1_int + re.field_g, var5, -1);
                    var1_int = var1_int + (kd.field_z + al.field_z + qc.field_z);
                    break L15;
                  } else {
                    mf.field_c.b(var6, var8, gj.field_y + var1_int, var5, -1);
                    var1_int = var1_int + gd.field_k;
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
          throw wn.a((Throwable) (Object) var1, "eb.B(" + -14732 + 41);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_i = null;
        field_a = null;
        field_g = null;
        field_c = null;
        if (param0 != 15) {
            eb.a((byte) -51);
        }
        field_d = null;
    }

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          try {
            if (jj.field_v.startsWith("win")) {
              L0: {
                if (param0.startsWith("http://")) {
                  break L0;
                } else {
                  if (!param0.startsWith("https://")) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  } else {
                    break L0;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L1: while (true) {
                if (var3 >= param0.length()) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                } else {
                  if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            return stackIn_20_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref2;
            stackOut_21_1 = new StringBuilder().append("eb.E(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + 1 + 41);
        }
    }

    final static String a(int param0) {
        if (!(un.field_Hb != bf.field_b)) {
            return mk.field_S;
        }
        if (!cl.field_c.a((byte) -108)) {
            return cl.field_c.d((byte) 121);
        }
        if (um.field_F == bf.field_b) {
            return cl.field_c.d((byte) 119);
        }
        return ff.field_u;
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param2 != 6337) {
            return null;
        }
        if (!(!param1)) {
            var4 += 4;
        }
        var4 += 2;
        if (param0) {
            var4++;
        }
        return m.field_y[var4];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[1024];
        field_f = new int[12];
        field_i = "Your ignore list is full. Max of 100 hit.";
    }
}
