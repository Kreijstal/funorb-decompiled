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
            boolean discarded$0 = rh.a(-71, false);
        }
        if (!(!((rh) this).field_v)) {
            return 0;
        }
        return 100;
    }

    public static void e(int param0) {
        field_C = null;
        field_x = null;
        field_D = null;
        if (param0 != 6) {
            field_z = null;
        }
        field_z = null;
    }

    final static boolean a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            field_z = null;
            break L0;
          }
        }
        var2 = param0;
        if (-11 != var2) {
          L1: {
            if (var2 == 129) {
              break L1;
            } else {
              if (-132 != var2) {
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
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        vh var10 = null;
        int var11 = 0;
        int stackIn_16_0 = 0;
        String stackIn_22_0 = null;
        int stackIn_26_0 = 0;
        String stackIn_31_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        vh stackIn_42_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        String stackOut_21_0 = null;
        String stackOut_20_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        String stackOut_30_0 = null;
        String stackOut_29_0 = null;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        vh stackOut_41_0 = null;
        vh stackOut_40_0 = null;
        L0: {
          var11 = HostileSpawn.field_I ? 1 : 0;
          var1 = s.field_g;
          var2 = 0;
          if (2 != be.field_e) {
            break L0;
          } else {
            var3_long = -fj.field_Rb + hn.a((byte) 80);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (0 > var2) {
              var2 = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        var3 = -94 / ((-2 - param0) / 60);
        var4 = 0;
        L1: while (true) {
          if (var4 >= hf.field_d.length) {
            return;
          } else {
            L2: {
              var5 = jf.field_b[var4];
              if (0 > var5) {
                var6 = ce.field_c;
                break L2;
              } else {
                if (mc.field_F.field_f != var5) {
                  var6 = nf.field_m;
                  break L2;
                } else {
                  var6 = hh.field_e;
                  break L2;
                }
              }
            }
            L3: {
              var7 = hf.field_d[var4];
              if (2 != be.field_e) {
                break L3;
              } else {
                if ((var2 ^ -1) != -2) {
                  break L3;
                } else {
                  L4: {
                    if (gg.field_D.length <= ka.field_o.length) {
                      stackOut_15_0 = ka.field_o.length;
                      stackIn_16_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = gg.field_D.length;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    }
                  }
                  L5: {
                    var8 = stackIn_16_0;
                    if (var4 < 6) {
                      break L5;
                    } else {
                      if (6 - -var8 > var4) {
                        L6: {
                          if (0 <= -var8 + (var4 - 6 + ka.field_o.length)) {
                            stackOut_21_0 = ka.field_o[ka.field_o.length + (var4 - (6 + var8))];
                            stackIn_22_0 = stackOut_21_0;
                            break L6;
                          } else {
                            stackOut_20_0 = "";
                            stackIn_22_0 = stackOut_20_0;
                            break L6;
                          }
                        }
                        var7_ref = stackIn_22_0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L7: {
                    if (uh.field_j.length > p.field_k.length) {
                      stackOut_25_0 = uh.field_j.length;
                      stackIn_26_0 = stackOut_25_0;
                      break L7;
                    } else {
                      stackOut_24_0 = p.field_k.length;
                      stackIn_26_0 = stackOut_24_0;
                      break L7;
                    }
                  }
                  var9 = stackIn_26_0;
                  if (var4 < 7 - -var8) {
                    break L3;
                  } else {
                    if (var4 >= var9 + var8 + 7) {
                      break L3;
                    } else {
                      L8: {
                        if (var4 - (7 + var8) >= p.field_k.length) {
                          stackOut_30_0 = "";
                          stackIn_31_0 = stackOut_30_0;
                          break L8;
                        } else {
                          stackOut_29_0 = p.field_k[-7 + (var4 + -var8)];
                          stackIn_31_0 = stackOut_29_0;
                          break L8;
                        }
                      }
                      var7_ref = stackIn_31_0;
                      break L3;
                    }
                  }
                }
              }
            }
            L9: {
              if (1 != (var5 ^ -1)) {
                break L9;
              } else {
                var7_ref = Integer.toString(var2);
                break L9;
              }
            }
            L10: {
              stackOut_34_0 = 91;
              stackIn_36_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if ((var5 ^ -1) > -1) {
                stackOut_36_0 = stackIn_36_0;
                stackOut_36_1 = 0;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                break L10;
              } else {
                stackOut_35_0 = stackIn_35_0;
                stackOut_35_1 = 1;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                break L10;
              }
            }
            L11: {
              var8 = wb.a(stackIn_37_0, stackIn_37_1 != 0, var7_ref);
              var9 = wk.field_c + -(var8 >> -1727742079);
              if ((var5 ^ -1) <= -1) {
                L12: {
                  var1 = var1 + cl.field_l;
                  if (mc.field_F.field_f == var5) {
                    stackOut_41_0 = al.field_N;
                    stackIn_42_0 = stackOut_41_0;
                    break L12;
                  } else {
                    stackOut_40_0 = tk.field_c;
                    stackIn_42_0 = stackOut_40_0;
                    break L12;
                  }
                }
                L13: {
                  var10 = stackIn_42_0;
                  if (var10 != null) {
                    var10.a((jd.field_l << -766910335) + var8, var1, eh.field_d - -(ab.field_b << -1284415423), -jd.field_l + var9, 5);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var1 = var1 + ab.field_b;
                break L11;
              } else {
                break L11;
              }
            }
            if (-1 < (var5 ^ -1)) {
              lj.field_u.c(var7_ref, var9, ka.field_q + var1, var6, -1);
              var1 = var1 + kb.field_d;
              var4++;
              continue L1;
            } else {
              na.field_c.c(var7_ref, var9, sd.field_s + var1, var6, -1);
              var1 = var1 + (eh.field_d + ab.field_b + cl.field_l);
              var4++;
              continue L1;
            }
          }
        }
    }

    rh() {
    }

    final byte[] c(byte param0) {
        if (!(!((rh) this).field_v)) {
            throw new RuntimeException();
        }
        if (param0 != 127) {
            return null;
        }
        return ((rh) this).field_y;
    }

    static {
    }
}
