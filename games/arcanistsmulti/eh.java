/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static char[] field_f;
    static String field_a;
    static int[] field_g;
    static String field_d;
    static volatile int field_c;
    static String field_b;
    static qb field_e;

    final static String[] a(boolean param0, char param1, String param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_e = (qb) null;
                break L1;
              }
            }
            var10 = (CharSequence) ((Object) param2);
            var3_int = wa.a(param1, var10, (byte) -16);
            var4 = new String[var3_int - -1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var3_int) {
                var4[var3_int] = param2.substring(var6);
                stackIn_10_0 = (String[]) (var4);
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param1 == param2.charAt(var8)) {
                    incrementValue$1 = var5;
                    var5++;
                    var4[incrementValue$1] = param2.substring(var6, var8);
                    var6 = var8 + 1;
                    var7++;
                    continue L2;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("eh.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final static void b(byte param0) {
        ce var1 = (ce) ((Object) lh.field_c.b(12623));
        int var2 = -104 % ((-41 - param0) / 40);
        if (var1 == null) {
            ka.b(false);
            return;
        }
        ab var3 = df.field_z;
        var3.d(-10674);
        var3.d(-10674);
        var3.d(-10674);
        var3.d(-10674);
        var1.a(true);
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
            eh.b((byte) -111);
        }
        if (!(!wh.field_g)) {
            return ln.field_U.a(ed.field_Bb, (byte) 123, vn.field_d);
        }
        if (oj.field_i) {
            return rg.a(param3, -14, param2);
        }
        if (rk.a((byte) -60, param3, param2)) {
            return true;
        }
        if (!(!ld.field_p)) {
            return false;
        }
        return ko.a(-110, param1, param2);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(byte param0, int param1, String param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        ab var6 = null;
        CharSequence var7 = null;
        try {
          L0: {
            var7 = (CharSequence) ((Object) param2);
            if (!vn.a(var7, 0)) {
              stackIn_3_0 = fn.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (je.a(16, param2)) {
                stackIn_7_0 = sd.field_l;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (jb.field_t != 2) {
                  stackIn_11_0 = vi.field_K;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (sa.a(param2, 320)) {
                    stackIn_15_0 = tj.a(119, new String[]{param2}, sc.field_bb);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((pc.field_b ^ -1) <= -101) {
                      stackIn_19_0 = nh.field_u;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (kl.a(param2, 1)) {
                        stackIn_23_0 = tj.a(114, new String[]{param2}, ga.field_q);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L1: {
                          var6 = he.field_e;
                          var6.b((byte) -67, param1);
                          var6.field_g = var6.field_g + 1;
                          var4 = var6.field_g;
                          var6.f(2, (byte) -70);
                          if (param0 < -14) {
                            break L1;
                          } else {
                            var5 = (String) null;
                            eh.a(false, '￞', (String) null);
                            break L1;
                          }
                        }
                        var6.a(param2, 23333);
                        var6.b(-var4 + var6.field_g, (byte) 43);
                        stackIn_27_0 = null;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("eh.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L2;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    return (String) ((Object) stackIn_27_0);
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = -93 % ((78 - param0) / 43);
        field_d = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static boolean a(int param0, eg param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 18306) {
                break L1;
              } else {
                eh.a((byte) 21);
                break L1;
              }
            }
            stackIn_3_0 = param1.a(-27);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("eh.G(").append(param0).append(',');

            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        kc stackIn_11_0 = null;
        kc stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        kc stackIn_18_0 = null;
        kc stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        kc stackIn_23_0 = null;
        kc stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int var5;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          vc.a((byte) -126);
          if (param2 == 4) {
            break L0;
          } else {
            field_b = (String) null;
            break L0;
          }
        }
        L1: {
          if ((sk.field_e ^ -1) <= -1) {
            kg.field_c.field_rb = tj.a(-14, new String[]{Integer.toString(sk.field_e)}, gi.field_j);
            break L1;
          } else {
            kg.field_c.field_rb = null;
            break L1;
          }
        }
        L2: {
          L3: {
            stackIn_11_0 = k.field_d;

            if (!param0) {
              break L3;
            } else {
              stackIn_11_0 = (kc) ((Object) stackIn_11_0);

              if (param1) {
                break L3;
              } else {
                stackIn_11_0 = (kc) ((Object) stackIn_11_0);

                if (pg.field_d) {
                  break L3;
                } else {
                  stackIn_11_0 = (kc) ((Object) stackIn_11_0);

                  if (null != wi.field_f) {
                    break L3;
                  } else {
                    stackIn_11_0 = (kc) ((Object) stackIn_11_0);

                    if (om.field_x != null) {
                      break L3;
                    } else {
                      stackIn_12_0 = (kc) ((Object) stackIn_11_0);
                      stackIn_12_1 = 1;
                      break L2;
                    }
                  }
                }
              }
            }
          }
          stackIn_12_0 = (kc) ((Object) stackIn_11_0);
          stackIn_12_1 = 0;
          break L2;
        }
        L4: {
          L5: {
            ((kc) (Object) stackIn_12_0).b(stackIn_12_1 != 0, (byte) 75);
            stackIn_18_0 = fn.field_e;

            if (!param0) {
              break L5;
            } else {
              stackIn_18_0 = (kc) ((Object) stackIn_18_0);

              if (param1) {
                break L5;
              } else {
                stackIn_18_0 = (kc) ((Object) stackIn_18_0);

                if (pg.field_d) {
                  break L5;
                } else {
                  stackIn_18_0 = (kc) ((Object) stackIn_18_0);

                  if (null != wi.field_f) {
                    break L5;
                  } else {
                    stackIn_18_0 = (kc) ((Object) stackIn_18_0);

                    if (null != om.field_x) {
                      break L5;
                    } else {
                      stackIn_19_0 = (kc) ((Object) stackIn_18_0);
                      stackIn_19_1 = 1;
                      break L4;
                    }
                  }
                }
              }
            }
          }
          stackIn_19_0 = (kc) ((Object) stackIn_18_0);
          stackIn_19_1 = 0;
          break L4;
        }
        L6: {
          L7: {
            ((kc) (Object) stackIn_19_0).b(stackIn_19_1 != 0, (byte) 121);
            stackIn_23_0 = gm.field_h;

            if (!param0) {
              break L7;
            } else {
              stackIn_23_0 = (kc) ((Object) stackIn_23_0);

              if (param1) {
                break L7;
              } else {
                stackIn_23_0 = (kc) ((Object) stackIn_23_0);

                if (!pg.field_d) {
                  break L7;
                } else {
                  stackIn_24_0 = (kc) ((Object) stackIn_23_0);
                  stackIn_24_1 = 1;
                  break L6;
                }
              }
            }
          }
          stackIn_24_0 = (kc) ((Object) stackIn_23_0);
          stackIn_24_1 = 0;
          break L6;
        }
        L8: {
          ((kc) (Object) stackIn_24_0).b(stackIn_24_1 != 0, (byte) 115);
          aj.field_h.field_c.h((byte) 100);
          if (0 == ii.field_b.field_U) {
            break L8;
          } else {
            dh.field_Mb = true;
            break L8;
          }
        }
        L9: {
          if (of.field_a.field_U == 0) {
            break L9;
          } else {
            L10: {
              if (gm.field_c) {
                break L10;
              } else {
                if (0 < ah.field_c) {
                  break L10;
                } else {
                  if (2 <= qf.field_d) {
                    if (ri.field_b[12]) {
                      break L10;
                    } else {
                      me.field_C = true;
                      break L9;
                    }
                  } else {
                    me.field_C = true;
                    break L9;
                  }
                }
              }
            }
            ib.a(param3, 0);
            break L9;
          }
        }
        L11: {
          if (0 != jl.field_a.field_U) {
            L12: {
              if ((ao.field_h.length ^ -1) != -2) {
                break L12;
              } else {
                if (ef.field_t != ao.field_h[0]) {
                  ef.field_t = ao.field_h[0];
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            dn.a(param2 + -13218, 0, ml.field_m, param3, ef.field_t, true);
            break L11;
          } else {
            break L11;
          }
        }
        L13: {
          if (0 != dm.field_E.field_U) {
            pg.field_d = false;
            break L13;
          } else {
            break L13;
          }
        }
    }

    static {
        field_d = "Cancel rematch";
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_f = new char[]{(char)91, (char)93, (char)35};
        field_g = new int[]{1, 2, 2, 3, 5, 10, 2, 2, 2, 2, 3, 3, 5, 5, 10, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 5, 1, 3, 1, 3, 1, 5, 3, 3, 5, 3, 1, 1, 5, 3, 5, 10, 10, 10, 1, 1, 1, 1, 1, 1, 5, 1, 2, 2, 2, 2, 2, 4, 4, 2, 2, 4, 5, 5, 1, 1, 4, 2, 3, 4, 1, 1, 4, 5, 2, 5, 1, 3, 3, 5, 1, 3, 1, 3, 3, 4, 2, 3, 3, 3};
        field_a = "Password: ";
        field_c = 0;
    }
}
