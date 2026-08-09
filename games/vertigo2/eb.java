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
        int stackIn_19_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_34_0 = null;
        String stackIn_40_0 = null;
        String stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        mp stackIn_45_0 = null;
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
        mp var9 = null;
        int var10 = 0;
        String var11 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = be.field_t;
              var2 = 0;
              if (-3 != (da.field_j ^ -1)) {
                break L1;
              } else {
                var3_long = gk.a(95) - qe.field_cb;
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (-1 >= (var2 ^ -1)) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -14732) {
                break L2;
              } else {
                var11 = (String) null;
                eb.a((String) null, true);
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (mn.field_q.length <= var3) {
                break L0;
              } else {
                L4: {
                  var4 = gd.field_s[var3];
                  if (var4 >= 0) {
                    if (var4 == ve.field_d.field_c) {
                      var5 = sr.field_a;
                      break L4;
                    } else {
                      var5 = ma.field_m;
                      break L4;
                    }
                  } else {
                    var5 = oi.field_b;
                    break L4;
                  }
                }
                L5: {
                  var6 = mn.field_q[var3];
                  if ((da.field_j ^ -1) != -3) {
                    break L5;
                  } else {
                    if (var2 == 1) {
                      L6: {
                        if (rp.field_e.length > jo.field_g.length) {
                          stackIn_19_0 = rp.field_e.length;
                          break L6;
                        } else {
                          stackIn_19_0 = jo.field_g.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_19_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (var3 >= 6 - -var7) {
                            break L7;
                          } else {
                            L8: {
                              if (-1 >= (-6 + var3 + (jo.field_g.length + -var7) ^ -1)) {
                                stackIn_24_0 = jo.field_g[jo.field_g.length + (-6 + var3 - var7)];
                                break L8;
                              } else {
                                stackIn_24_0 = "";
                                break L8;
                              }
                            }
                            var6 = stackIn_24_0;
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (ba.field_b.length > bl.field_z.length) {
                          stackIn_28_0 = ba.field_b.length;
                          break L9;
                        } else {
                          stackIn_28_0 = bl.field_z.length;
                          break L9;
                        }
                      }
                      var8 = stackIn_28_0;
                      if (var7 + 7 > var3) {
                        break L5;
                      } else {
                        if (var8 + (7 - -var7) > var3) {
                          L10: {
                            if (var3 + (-7 - var7) < bl.field_z.length) {
                              stackIn_34_0 = bl.field_z[-7 + var3 - var7];
                              break L10;
                            } else {
                              stackIn_34_0 = "";
                              break L10;
                            }
                          }
                          var6 = stackIn_34_0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                L11: {
                  if (1 == (var4 ^ -1)) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackIn_40_0 = (String) (var6);

                  if (0 > var4) {
                    stackIn_41_0 = (String) ((Object) stackIn_40_0);
                    stackIn_41_1 = 0;
                    break L12;
                  } else {
                    stackIn_41_0 = (String) ((Object) stackIn_40_0);
                    stackIn_41_1 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = uc.a(stackIn_41_0, stackIn_41_1 != 0, false);
                  var8 = vm.field_c - (var7 >> -758116415);
                  if (0 > var4) {
                    break L13;
                  } else {
                    L14: {
                      if (var4 == ve.field_d.field_c) {
                        stackIn_45_0 = mq.field_v;
                        break L14;
                      } else {
                        stackIn_45_0 = gl.field_i;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_45_0;
                      var1_int = var1_int + al.field_z;
                      if (var9 != null) {
                        var9.a(kd.field_z - -(qc.field_z << 1903291329), var8 + -gl.field_l, var1_int, var7 - -(gl.field_l << -904791711), -114);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var1_int = var1_int + qc.field_z;
                    break L13;
                  }
                }
                L16: {
                  if (0 <= var4) {
                    gb.field_b.b(var6, var8, var1_int + re.field_g, var5, -1);
                    var1_int = var1_int + (kd.field_z + al.field_z + qc.field_z);
                    break L16;
                  } else {
                    mf.field_c.b(var6, var8, gj.field_y + var1_int, var5, -1);
                    var1_int = var1_int + gd.field_k;
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "eb.B(" + param0 + ')');
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
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (jj.field_v.startsWith("win")) {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (!param0.startsWith("https://")) {
                        stackIn_8_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  if (param1) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length()) {
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackIn_19_0 = 1;
                        decompiledRegionSelector0 = 4;
                        break L1;
                      } else {
                        if ((var2.indexOf((int) param0.charAt(var3)) ^ -1) != 0) {
                          var3++;
                          continue L3;
                        } else {
                          stackIn_16_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L1;
                        }
                      }
                    }
                  } else {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                } else {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_21_0 = 0;
              return stackIn_21_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref2);

            stackIn_24_1 = new StringBuilder().append("eb.E(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_16_0 != 0;
              } else {
                return stackIn_19_0 != 0;
              }
            }
          }
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
        if (param0 != -1) {
            field_h = -125;
        }
        return ff.field_u;
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param2 != 6337) {
            return (String) null;
        }
        if (!(!param1)) {
            var4 += 4;
        }
        if (param3) {
            var4 += 2;
        }
        if (param0) {
            var4++;
        }
        return m.field_y[var4];
    }

    static {
        field_g = new int[1024];
        field_f = new int[12];
        field_i = "Your ignore list is full. Max of 100 hit.";
    }
}
