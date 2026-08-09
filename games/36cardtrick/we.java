/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    final static void a(int param0, int param1, int param2, int param3, kc[] param4, int param5, int param6, int param7, int param8, ee param9, kc[] param10, int param11, boolean param12, boolean param13, ee param14) {
        try {
            kc[] var16 = (kc[]) null;
            af.a(param14, param5, param2, 0, (byte) -120, af.field_jb, param3, param6, 0, param0, 480, (kc[]) null, param1, param10, param8, param11, param9, wg.field_a, param7, ca.field_b, param4);
            if (!param12) {
                we.a(-28);
            }
            mh.a(0, param13);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "we.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ',' + param12 + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
    }

    final static nc a(String param0, int param1) {
        nc stackIn_3_0 = null;
        nc stackIn_7_0 = null;
        nc stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        nc stackIn_26_0 = null;
        nc stackIn_32_0 = null;
        nc stackIn_43_0 = null;
        nc stackIn_48_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Main.field_T;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 != (var2_int ^ -1)) {
              if (-65 > (var2_int ^ -1)) {
                stackIn_7_0 = dj.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(0) == 34) {
                  if (34 != param0.charAt(-1 + var2_int)) {
                    stackIn_13_0 = ij.field_i;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (-1 + var2_int > var4) {
                        L2: {
                          var5 = param0.charAt(var4);
                          if (var5 == 92) {
                            L3: {
                              if (var3 != 0) {
                                stackIn_22_0 = 0;
                                break L3;
                              } else {
                                stackIn_22_0 = 1;
                                break L3;
                              }
                            }
                            var3 = stackIn_22_0;
                            break L2;
                          } else {
                            L4: {
                              if (var5 != 34) {
                                break L4;
                              } else {
                                if (var3 != 0) {
                                  break L4;
                                } else {
                                  stackIn_26_0 = ij.field_i;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L2;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  if (param1 == 34) {
                    var4 = 0;
                    L5: while (true) {
                      if (var2_int > var4) {
                        L6: {
                          var5 = param0.charAt(var4);
                          if (var5 == 46) {
                            L7: {
                              if (var4 == 0) {
                                break L7;
                              } else {
                                if (var4 == var2_int - 1) {
                                  break L7;
                                } else {
                                  if (var3 != 0) {
                                    break L7;
                                  } else {
                                    var3 = 1;
                                    break L6;
                                  }
                                }
                              }
                            }
                            stackIn_43_0 = ij.field_i;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (rb.field_f.indexOf(var5) == -1) {
                              stackIn_48_0 = ij.field_i;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              var3 = 0;
                              break L6;
                            }
                          }
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_32_0 = (nc) null;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = ec.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (var2);

            stackIn_55_1 = new StringBuilder().append("we.C(");

            if (param0 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L8;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L8;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_43_0;
                  } else {
                    return stackIn_48_0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        if (param0 > -91) {
            return;
        }
        try {
            ia.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "we.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static long a(byte param0) {
        if (param0 != 79) {
            return 102L;
        }
        return id.a(85) - uk.field_a;
    }

    final static void b(int param0) {
        String var2;
        if (vg.field_d) {
          if (param0 >= -117) {
            var2 = (String) null;
            we.a((String) null, 15);
            tj.field_K = true;
            gh.a((byte) 59, false);
            cd.field_e = 0;
            return;
          } else {
            tj.field_K = true;
            gh.a((byte) 59, false);
            cd.field_e = 0;
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static void a(int param0) {
        pj.field_a = cg.b(true);
        sd.field_c = new j();
        nf.a(true, (byte) -2, true);
        if (param0 != 0) {
            String var2 = (String) null;
            we.a(27, (String) null);
        }
    }

    final static kc[] a(int param0, int param1) {
        kc[] var4 = new kc[9];
        kc[] var2 = var4;
        int var3 = -115 / ((-7 - param0) / 45);
        var4[4] = te.a(64, -128, param1);
        return var2;
    }

    static {
    }
}
