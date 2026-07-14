/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends ug {
    private String[] field_p;
    private int[] field_t;
    static int field_w;
    static tj field_v;
    static bc field_r;
    private int[][] field_o;
    int[] field_s;
    static int[] field_m;
    static int field_u;
    static String field_q;
    static int field_n;

    final static short[] a(int param0, int param1, short[] param2, ii param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        var4 = param3.f(7, param1);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (var4 == param2.length) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param2 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param3.f(param0 + 7, 4);
            var6 = (short)param3.f(param0 ^ 7, 16);
            if (var5 <= param0) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param2[var7] = (short)var6;
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param2[var7] = (short)(param3.f(7, var5) + var6);
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param2;
        } else {
          return null;
        }
    }

    final String e(int param0) {
        int var4 = 0;
        int var5 = Bounce.field_N;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        int var3 = -44 / ((-51 - param0) / 41);
        if (((ne) this).field_p == null) {
            return "";
        }
        StringBuilder discarded$0 = var6.append(((ne) this).field_p[0]);
        for (var4 = 1; ((ne) this).field_p.length > var4; var4++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var6.append(((ne) this).field_p[var4]);
        }
        return var2.toString();
    }

    final static tg a(boolean param0) {
        int var4_int = 0;
        int var5 = Bounce.field_N;
        int var1 = ih.field_V[0] * qh.field_i[0];
        byte[] var2 = ph.field_c[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = he.field_k[da.b(255, (int) var2[var4_int])];
        }
        tg var4 = new tg(se.field_C, fk.field_e, cl.field_n[0], ae.field_c[0], ih.field_V[0], qh.field_i[0], var3);
        vb.a((byte) 122);
        if (!param0) {
            ve discarded$0 = ne.f(-101);
        }
        return var4;
    }

    final void a(int param0, wi param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Bounce.field_N;
        var3 = -46 % ((-75 - param0) / 37);
        L0: while (true) {
          var4 = param1.d((byte) -104);
          if (-1 != (var4 ^ -1)) {
            this.a((byte) 18, param1, var4);
            continue L0;
          } else {
            return;
          }
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = Bounce.field_N;
        if (null != ((ne) this).field_s) {
            for (var2 = 0; var2 < ((ne) this).field_s.length; var2++) {
                ((ne) this).field_s[var2] = ge.a(((ne) this).field_s[var2], 32768);
            }
        }
        if (param0 != 31680) {
            field_w = 9;
        }
    }

    final static boolean a(CharSequence param0, boolean param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        if (param0 == null) {
          return false;
        } else {
          L0: {
            var3 = param0.length();
            if (1 > var3) {
              break L0;
            } else {
              if (12 < var3) {
                break L0;
              } else {
                L1: {
                  var4 = ce.a(param0, param2 ^ -33);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) > -2) {
                      break L1;
                    } else {
                      L2: {
                        if (param2 == -33) {
                          break L2;
                        } else {
                          field_v = null;
                          break L2;
                        }
                      }
                      L3: {
                        if (f.a(var4.charAt(0), false)) {
                          break L3;
                        } else {
                          if (f.a(var4.charAt(-1 + var4.length()), false)) {
                            break L3;
                          } else {
                            var5 = 0;
                            var6 = 0;
                            L4: while (true) {
                              if (param0.length() <= var6) {
                                if (-1 >= var5) {
                                  return true;
                                } else {
                                  return false;
                                }
                              } else {
                                L5: {
                                  var7 = param0.charAt(var6);
                                  if (f.a((char) var7, false)) {
                                    var5++;
                                    break L5;
                                  } else {
                                    var5 = 0;
                                    break L5;
                                  }
                                }
                                if (-3 >= var5) {
                                  if (!param1) {
                                    return false;
                                  } else {
                                    var6++;
                                    continue L4;
                                  }
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
                return false;
              }
            }
          }
          return false;
        }
    }

    final static ve f(int param0) {
        if (param0 != 32768) {
            field_r = null;
        }
        return new ve(bb.a(param0 + -32880), ck.g((byte) 112));
    }

    public static void c(byte param0) {
        field_q = null;
        if (param0 < 90) {
            Object var2 = null;
            boolean discarded$0 = ne.a((CharSequence) null, false, (byte) 104);
        }
        field_v = null;
        field_m = null;
        field_r = null;
    }

    private final void a(byte param0, wi param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        eh var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Bounce.field_N;
        if (param0 == 18) {
          L0: {
            if (-2 != param2) {
              if (-3 == param2) {
                var4 = param1.d((byte) -83);
                ((ne) this).field_s = new int[var4];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    ((ne) this).field_s[var5] = param1.a(-1640531527);
                    var5++;
                    continue L1;
                  }
                }
              } else {
                if (3 == param2) {
                  var4 = param1.d((byte) -69);
                  ((ne) this).field_t = new int[var4];
                  ((ne) this).field_o = new int[var4][];
                  var5 = 0;
                  L2: while (true) {
                    if (var4 <= var5) {
                      break L0;
                    } else {
                      var6 = param1.a(-1640531527);
                      var7 = jd.a(param0 + 21296, var6);
                      if (var7 != null) {
                        ((ne) this).field_t[var5] = var6;
                        ((ne) this).field_o[var5] = new int[var7.field_c];
                        var8 = 0;
                        L3: while (true) {
                          if (var7.field_c > var8) {
                            ((ne) this).field_o[var5][var8] = param1.a(-1640531527);
                            var8++;
                            continue L3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  if ((param2 ^ -1) != -5) {
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              ((ne) this).field_p = di.a(-121, '<', param1.b(true));
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    ne() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
        field_m = new int[8192];
        field_r = new bc();
        field_q = "Name is available";
    }
}
