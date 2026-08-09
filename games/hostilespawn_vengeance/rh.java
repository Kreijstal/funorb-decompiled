/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends ae {
    um field_B;
    static bd field_x;
    static bd field_C;
    static int field_A;
    byte[] field_y;
    int field_E;
    static rj field_D;
    static bd field_z;

    final int d(int param0) {
        if (param0 >= -72) {
            rh.a(-71, false);
        }
        if (!(!this.field_v)) {
            return 0;
        }
        return 100;
    }

    public static void e(int param0) {
        field_C = null;
        field_x = null;
        field_D = null;
        if (param0 != 6) {
            field_z = (bd) null;
        }
        field_z = null;
    }

    final static boolean a(int param0, boolean param1) {
        int var2;
        int var3;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            field_z = (bd) null;
            break L0;
          }
        }
        var2 = param0;
        if (-11 != (var2 ^ -1)) {
          L1: {
            if (var2 == 129) {
              break L1;
            } else {
              if (-132 != (var2 ^ -1)) {
                if (-134 != (var2 ^ -1)) {
                  return false;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
          }
          return true;
        } else {
          return true;
        }
    }

    final static void d(byte param0) {
        int stackIn_17_0 = 0;
        String stackIn_23_0 = null;
        int stackIn_27_0 = 0;
        String stackIn_32_0 = null;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        vh stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        vh var10 = null;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = s.field_g;
              var2 = 0;
              if (2 != be.field_e) {
                break L1;
              } else {
                var3_long = -fj.field_Rb + hn.a((byte) 80);
                var2 = (int)((10999L - var3_long) / 1000L);
                if (0 > var2) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var3 = -94 / ((-2 - param0) / 60);
            var4 = 0;
            L2: while (true) {
              if (var4 >= hf.field_d.length) {
                break L0;
              } else {
                L3: {
                  var5 = jf.field_b[var4];
                  if (0 > var5) {
                    var6 = ce.field_c;
                    break L3;
                  } else {
                    if (mc.field_F.field_f != var5) {
                      var6 = nf.field_m;
                      break L3;
                    } else {
                      var6 = hh.field_e;
                      break L3;
                    }
                  }
                }
                L4: {
                  var7 = hf.field_d[var4];
                  if (2 != be.field_e) {
                    break L4;
                  } else {
                    if ((var2 ^ -1) != -2) {
                      break L4;
                    } else {
                      L5: {
                        if (gg.field_D.length <= ka.field_o.length) {
                          stackIn_17_0 = ka.field_o.length;
                          break L5;
                        } else {
                          stackIn_17_0 = gg.field_D.length;
                          break L5;
                        }
                      }
                      L6: {
                        var8 = stackIn_17_0;
                        if (var4 < 6) {
                          break L6;
                        } else {
                          if (6 - -var8 > var4) {
                            L7: {
                              if (0 <= -var8 + (var4 - 6 + ka.field_o.length)) {
                                stackIn_23_0 = ka.field_o[ka.field_o.length + (var4 - (6 + var8))];
                                break L7;
                              } else {
                                stackIn_23_0 = "";
                                break L7;
                              }
                            }
                            var7 = stackIn_23_0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (uh.field_j.length > p.field_k.length) {
                          stackIn_27_0 = uh.field_j.length;
                          break L8;
                        } else {
                          stackIn_27_0 = p.field_k.length;
                          break L8;
                        }
                      }
                      var9 = stackIn_27_0;
                      if (var4 < 7 - -var8) {
                        break L4;
                      } else {
                        if (var4 >= var9 + var8 + 7) {
                          break L4;
                        } else {
                          L9: {
                            if (var4 - (7 + var8) >= p.field_k.length) {
                              stackIn_32_0 = "";
                              break L9;
                            } else {
                              stackIn_32_0 = p.field_k[-7 + (var4 + -var8)];
                              break L9;
                            }
                          }
                          var7 = stackIn_32_0;
                          break L4;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (1 != (var5 ^ -1)) {
                    break L10;
                  } else {
                    var7 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  stackIn_37_0 = 91;

                  if ((var5 ^ -1) > -1) {
                    stackIn_38_0 = stackIn_37_0;
                    stackIn_38_1 = 0;
                    break L11;
                  } else {
                    stackIn_38_0 = stackIn_37_0;
                    stackIn_38_1 = 1;
                    break L11;
                  }
                }
                L12: {
                  var8 = wb.a(stackIn_38_0, stackIn_38_1 != 0, var7);
                  var9 = wk.field_c + -(var8 >> -1727742079);
                  if ((var5 ^ -1) <= -1) {
                    L13: {
                      var1_int = var1_int + cl.field_l;
                      if (mc.field_F.field_f == var5) {
                        stackIn_43_0 = al.field_N;
                        break L13;
                      } else {
                        stackIn_43_0 = tk.field_c;
                        break L13;
                      }
                    }
                    L14: {
                      var10 = stackIn_43_0;
                      if (var10 != null) {
                        var10.a((jd.field_l << -766910335) + var8, var1_int, eh.field_d - -(ab.field_b << -1284415423), -jd.field_l + var9, 5);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + ab.field_b;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (-1 < (var5 ^ -1)) {
                    lj.field_u.c(var7, var9, ka.field_q + var1_int, var6, -1);
                    var1_int = var1_int + kb.field_d;
                    break L15;
                  } else {
                    na.field_c.c(var7, var9, sd.field_s + var1_int, var6, -1);
                    var1_int = var1_int + (eh.field_d + ab.field_b + cl.field_l);
                    break L15;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "rh.N(" + param0 + ')');
        }
    }

    rh() {
    }

    final byte[] c(byte param0) {
        if (!(!this.field_v)) {
            throw new RuntimeException();
        }
        if (param0 != 127) {
            return (byte[]) null;
        }
        return this.field_y;
    }

    static {
    }
}
