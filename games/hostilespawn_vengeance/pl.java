/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static nd field_q;
    byte[] field_m;
    static bd field_p;
    int field_d;
    static bd field_j;
    int field_c;
    int field_h;
    byte[] field_n;
    int field_b;
    int field_g;
    int field_o;
    static bd field_f;
    int field_e;
    static boolean field_l;
    static boolean field_k;
    static String field_a;
    static byte[][] field_i;

    public static void a(boolean param0) {
        field_q = null;
        if (!param0) {
            return;
        }
        field_a = null;
        field_p = null;
        field_f = null;
        field_j = null;
        field_i = (byte[][]) null;
    }

    final static void a(int param0) {
        bd var1 = null;
        bd var2 = null;
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        try {
            var1 = new bd(540, 140);
            sb.a(var1, -118);
            ge.b();
            si.d();
            tk.field_e = 0;
            uc.b(-40);
            var2 = var1.h();
            if (param0 != -16183) {
                oj var5 = (oj) null;
                pl.a((byte) -53, (oj) null, -107);
            }
            for (var3 = 0; var3 < 15; var3++) {
                var2.a(-2, -2, 16777215);
                si.d(4, 4, 0, 0, 540, 140);
            }
            ti.field_c.a();
            var1.f(0, 0);
            eh.b(false);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "pl.C(" + param0 + ')');
        }
    }

    final static void a(byte param0, oj param1, int param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param1.field_n) {
                  break L2;
                } else {
                  L3: {
                    if (0 < ln.field_a.field_i[param2]) {
                      break L3;
                    } else {
                      if (0 < ln.field_a.field_i[-1 + param2]) {
                        break L3;
                      } else {
                        if (-1 > (ln.field_a.field_i[-ln.field_a.field_d + (param2 - 1)] ^ -1)) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  param1.field_n = true;
                  break L1;
                }
              }
              if (!param1.field_n) {
                break L1;
              } else {
                if (0 >= nl.field_d) {
                  break L1;
                } else {
                  L4: {
                    if (al.field_Q < 160) {
                      al.field_Q = al.field_Q + 50;
                      jh.a(3 * uh.field_i / 2, (byte) 69, 41, jc.field_c, 6);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  param1.a(false, 0, 21963, 1, rl.field_c, param1.field_j);
                  param1.field_l.a(0.9, 0.9, 1);
                  mm.field_m[el.field_j] = new oj(param1.field_j, 232, rl.field_c);
                  mm.field_m[el.field_j].field_e = 250;
                  mm.field_m[el.field_j].field_b = false;
                  mm.field_m[el.field_j].field_w = 0;
                  el.field_j = el.field_j + 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L5: {
              L6: {
                if (-1 > (param1.field_I ^ -1)) {
                  break L6;
                } else {
                  if (-6 == (param1.field_w ^ -1)) {
                    break L6;
                  } else {
                    L7: {
                      if (-161 < (al.field_Q ^ -1)) {
                        al.field_Q = al.field_Q + 50;
                        jh.a(uh.field_i * 3 / 2, (byte) 41, 41, jc.field_c, 6);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    param1.field_z = 0;
                    param1.field_w = 5;
                    param1.e((byte) -49);
                    if (ln.field_a.field_c[param2] != 4) {
                      break L5;
                    } else {
                      ln.field_a.field_c[param2] = 0;
                      break L5;
                    }
                  }
                }
              }
              if (-1 <= (param1.field_I ^ -1)) {
                break L5;
              } else {
                L8: {
                  if (-1 == (ln.field_a.field_c[param2] ^ -1)) {
                    break L8;
                  } else {
                    if (1 != ln.field_a.field_c[param2]) {
                      break L5;
                    } else {
                      break L8;
                    }
                  }
                }
                ln.field_a.field_c[param2] = 4;
                break L5;
              }
            }
            if (param0 >= 101) {
              L9: {
                L10: {
                  if (param1.field_I > 0) {
                    break L10;
                  } else {
                    if (-25 != (param1.field_i ^ -1)) {
                      break L10;
                    } else {
                      param1.a(false, 0, 21963, 1, rl.field_c, param1.field_j);
                      param1.field_l.a(0.9, 0.9, 1);
                      mm.field_m[el.field_j] = new oj(param1.field_j, 232, rl.field_c);
                      mm.field_m[el.field_j].field_e = 250;
                      mm.field_m[el.field_j].field_b = false;
                      mm.field_m[el.field_j].field_w = 0;
                      el.field_j = el.field_j + 1;
                      break L9;
                    }
                  }
                }
                break L9;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("pl.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param2.length();
              if (1 > var3_int) {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-13 <= (var3_int ^ -1)) {
                  L1: {
                    var4 = mf.a(false, param2);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if ((var4.length() ^ -1) <= -2) {
                        L2: {
                          if (rg.a((byte) -109, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!rg.a((byte) -109, var4.charAt(-1 + var4.length()))) {
                              L3: {
                                var5 = 0;
                                if (param1 == 12864) {
                                  break L3;
                                } else {
                                  field_f = (bd) null;
                                  break L3;
                                }
                              }
                              var6 = 0;
                              L4: while (true) {
                                if (param2.length() <= var6) {
                                  if (0 >= var5) {
                                    stackIn_36_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackIn_34_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                } else {
                                  L5: {
                                    var7 = param2.charAt(var6);
                                    if (!rg.a((byte) -109, (char) var7)) {
                                      var5 = 0;
                                      break L5;
                                    } else {
                                      var5++;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (2 > var5) {
                                      break L6;
                                    } else {
                                      if (param0) {
                                        break L6;
                                      } else {
                                        stackIn_30_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L4;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("pl.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0 != 0;
                  } else {
                    return stackIn_36_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_q = new nd(9, 0, 4, 1);
        field_l = false;
        field_k = false;
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_i = new byte[250][];
    }
}
