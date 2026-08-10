/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mi implements le {
    static String field_e;
    static String field_f;
    static int field_c;
    private long field_b;
    static String field_a;
    static String field_d;

    final static boolean a(byte param0) {
        if (param0 >= -103) {
            field_f = (String) null;
            return ih.field_b == null ? fe.field_Gb : true;
        }
        return ih.field_b == null ? fe.field_Gb : true;
    }

    public final String b(int param0) {
        if (!this.a(true)) {
          if ((hc.a(-9986) ^ -1L) <= (this.field_b - -350L ^ -1L)) {
            if (param0 != 28433) {
              field_e = (String) null;
              return this.c(-103);
            } else {
              return this.c(-103);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(String param0, boolean param1, boolean param2, boolean param3) {
        try {
            vi.b((byte) -126);
            tm.field_l.a((byte) 76);
            aa.field_a = new ca(pm.field_g, (String) null, kb.field_c, param1, param2);
            fi.field_t = new de(tm.field_l, aa.field_a);
            tm.field_l.a(0, fi.field_t);
            if (!param3) {
                field_c = 59;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "mi.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        L0: {
          if (ag.c(-110)) {
            param0 = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == -8241) {
          hn.a(-1781, param0);
          if (en.field_Fb) {
            df.g(he.field_pc.field_c.field_tb, he.field_pc.field_c.field_F, he.field_pc.field_c.field_K, he.field_pc.field_c.field_ub);
            he.field_pc.field_c.a(param0, 24960);
            la.a(param1 ^ 8271, param0);
            return;
          } else {
            la.a(param1 ^ 8271, param0);
            return;
          }
        } else {
          mi.e(-16);
          hn.a(-1781, param0);
          if (!en.field_Fb) {
            la.a(param1 ^ 8271, param0);
            return;
          } else {
            df.g(he.field_pc.field_c.field_tb, he.field_pc.field_c.field_F, he.field_pc.field_c.field_K, he.field_pc.field_c.field_ub);
            he.field_pc.field_c.a(param0, 24960);
            la.a(param1 ^ 8271, param0);
            return;
          }
        }
    }

    final static void d(int param0) {
        if (!(null == tm.field_l)) {
            tm.field_l.g(-115);
        }
        if (!(null == md.field_i)) {
            md.field_i.k(18);
        }
        int var1 = 7 / ((param0 - -74) / 41);
        qd.a(-44);
    }

    public static void e(int param0) {
        field_f = null;
        if (param0 != 12) {
            return;
        }
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        la var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (la) ((Object) vi.field_h.a((byte) -58));
            L1: while (true) {
              if (var4 == null) {
                if (param1 == 12) {
                  break L0;
                } else {
                  field_e = (String) null;
                  return;
                }
              } else {
                oa.a(param0, var4, 97);
                var4 = (la) ((Object) vi.field_h.a(16213));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "mi.W(" + param0 + ',' + param1 + ')');
        }
    }

    public final void b(boolean param0) {
        if (param0) {
            mi.a(true, 21);
            this.field_b = hc.a(-9986);
            return;
        }
        this.field_b = hc.a(-9986);
    }

    public final wl a(int param0) {
        if (!this.a(true)) {
          if (hc.a(param0 + 12257) < 350L + this.field_b) {
            return gd.field_r;
          } else {
            if (param0 != -22243) {
              this.a(7);
              return this.f(-843083384);
            } else {
              return this.f(-843083384);
            }
          }
        } else {
          return wm.field_v;
        }
    }

    abstract String c(int param0);

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
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
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 1203) {
                  break L1;
                } else {
                  mi.a(-52, -85);
                  break L1;
                }
              }
              L2: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L2;
                } else {
                  if (12 < var3_int) {
                    break L2;
                  } else {
                    var4 = c.a(param2, true);
                    if (var4 == null) {
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (var4.length() >= 1) {
                        L3: {
                          if (ck.a(var4.charAt(0), -46)) {
                            break L3;
                          } else {
                            if (ck.a(var4.charAt(-1 + var4.length()), param0 + -1249)) {
                              break L3;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L4: while (true) {
                                if (param2.length() <= var6) {
                                  if (var5 <= 0) {
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
                                    if (ck.a((char) var7, -46)) {
                                      var5++;
                                      break L5;
                                    } else {
                                      var5 = 0;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if ((var5 ^ -1) > -3) {
                                      break L6;
                                    } else {
                                      if (param1) {
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
                            }
                          }
                        }
                        stackIn_21_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("mi.BA(").append(param0).append(',').append(param1).append(',');

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
          throw kg.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
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

    abstract wl f(int param0);

    static {
        field_f = "Sorry, you were removed from the game you were playing. This happened either because you were disconnected for too long, or because the server was updated.";
        field_e = "Unpacking music";
        field_a = "Hide private chat and appear offline to friends";
    }
}
