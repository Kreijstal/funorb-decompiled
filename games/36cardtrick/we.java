/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    final static void a(int param0, int param1, int param2, int param3, kc[] param4, int param5, int param6, int param7, int param8, ee param9, kc[] param10, int param11, boolean param12, boolean param13, ee param14) {
        kc[] var16 = (kc[]) null;
        af.a(param14, param5, param2, 0, (byte) -120, af.field_jb, param3, param6, 0, param0, 480, (kc[]) null, param1, param10, param8, param11, param9, wg.field_a, param7, ca.field_b, param4);
        if (!param12) {
            we.a(-28);
        } else {
            mh.a(0, param13);
            return;
        }
        mh.a(0, param13);
    }

    final static nc a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var6 = Main.field_T;
        var2 = param0.length();
        if (-1 != var2) {
          if (-65 < var2) {
            return dj.field_f;
          } else {
            if (param0.charAt(0) == 34) {
              if (34 != param0.charAt(-1 + var2)) {
                return ij.field_i;
              } else {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param0.charAt(var4);
                    if (var5 == 92) {
                      L1: {
                        if (var3 != 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L1;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L1;
                        }
                      }
                      var3 = stackIn_18_0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (var5 != 34) {
                          break L2;
                        } else {
                          if (var3 != 0) {
                            break L2;
                          } else {
                            return ij.field_i;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              var3 = 0;
              if (param1 == 34) {
                var4 = 0;
                L3: while (true) {
                  if (var2 > var4) {
                    var5 = param0.charAt(var4);
                    if (var5 == 46) {
                      L4: {
                        if (var4 == 0) {
                          break L4;
                        } else {
                          if (var4 == var2 - 1) {
                            break L4;
                          } else {
                            if (var3 != 0) {
                              break L4;
                            } else {
                              var3 = 1;
                              var4++;
                              var4++;
                              continue L3;
                            }
                          }
                        }
                      }
                      return ij.field_i;
                    } else {
                      if (rb.field_f.indexOf(var5) == -1) {
                        return ij.field_i;
                      } else {
                        var3 = 0;
                        var4++;
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return (nc) null;
              }
            }
          }
        } else {
          return ec.field_j;
        }
    }

    final static void a(int param0, String param1) {
        if (param0 > -91) {
            return;
        }
        ia.field_b = param1;
    }

    final static long a(byte param0) {
        if (param0 != 79) {
            return 102L;
        }
        return id.a(85) - uk.field_a;
    }

    final static void b(int param0) {
        String var2 = null;
        if (vg.field_d) {
          if (param0 >= -117) {
            var2 = (String) null;
            nc discarded$2 = we.a((String) null, 15);
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
