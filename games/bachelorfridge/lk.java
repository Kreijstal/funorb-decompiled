/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends bca {
    static int field_q;
    static int field_r;

    final static String a(CharSequence param0, boolean param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        if (param0 == null) {
          return tb.field_a;
        } else {
          var3 = param0.length();
          var4 = 57 / ((71 - param2) / 51);
          if (-2 >= (var3 ^ -1)) {
            if (12 >= var3) {
              L0: {
                var5 = fq.a(0, param0);
                if (var5 == null) {
                  break L0;
                } else {
                  if (1 > var5.length()) {
                    break L0;
                  } else {
                    if (!mp.a(true, var5.charAt(0))) {
                      if (!mp.a(true, var5.charAt(var5.length() - 1))) {
                        var6 = 0;
                        var7 = 0;
                        L1: while (true) {
                          if (param0.length() <= var7) {
                            if ((var6 ^ -1) < -1) {
                              return oga.field_r;
                            } else {
                              return null;
                            }
                          } else {
                            L2: {
                              var8 = param0.charAt(var7);
                              if (!mp.a(true, (char) var8)) {
                                var6 = 0;
                                break L2;
                              } else {
                                var6++;
                                break L2;
                              }
                            }
                            if (var6 < 2) {
                              var7++;
                              var7++;
                              continue L1;
                            } else {
                              if (!param1) {
                                return jr.field_a;
                              } else {
                                var7++;
                                continue L1;
                              }
                            }
                          }
                        }
                      } else {
                        return oga.field_r;
                      }
                    } else {
                      return oga.field_r;
                    }
                  }
                }
              }
              return tb.field_a;
            } else {
              return tb.field_a;
            }
          } else {
            return tb.field_a;
          }
        }
    }

    lk(int param0, nq param1) {
        super(param0, param1);
    }

    lk(lu param0) {
        super(param0);
        ((lk) this).field_k = param0.e((byte) 85);
        ((lk) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((lk) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          String discarded$2 = lk.a((CharSequence) null, true, (byte) 120);
          return (at) (Object) new nt(param1, (lk) this);
        } else {
          return (at) (Object) new nt(param1, (lk) this);
        }
    }

    final static uha c(int param0, int param1) {
        Object var3 = null;
        eo stackIn_4_0 = null;
        eo stackIn_8_0 = null;
        Object stackOut_7_0 = null;
        eo stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        eo stackOut_2_0 = null;
        if (param0 != -12411) {
          L0: {
            var3 = null;
            String discarded$10 = lk.a((CharSequence) null, true, (byte) 50);
            if (null == ola.field_g) {
              stackOut_7_0 = null;
              stackIn_8_0 = (eo) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ola.field_g.a((long)param1, (byte) -87);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return (uha) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null == ola.field_g) {
              stackOut_3_0 = null;
              stackIn_4_0 = (eo) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ola.field_g.a((long)param1, (byte) -87);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return (uha) (Object) stackIn_4_0;
        }
    }

    final static boolean d(int param0) {
        if (param0 != 2) {
            return false;
        }
        if (null == wh.field_p) {
            return false;
        }
        if (!wh.field_p.b(true)) {
            return false;
        }
        return true;
    }

    final void a(op param0, int param1) {
        int var3 = 49 / ((12 - param1) / 35);
        ((lk) this).a(param0, (byte) -2);
    }

    static {
    }
}
