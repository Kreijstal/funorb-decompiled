/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends qe {
    static p field_o;
    private wa field_p;
    static int field_q;
    static int field_r;
    static String field_n;
    static mg field_s;

    public static void h(int param0) {
        if (param0 >= -6) {
            return;
        }
        field_s = null;
        field_n = null;
        field_o = null;
    }

    final static boolean i(int param0) {
        if (param0 != 24410) {
            return true;
        }
        return !w.field_I.b(-95) ? true : false;
    }

    final String a(int param0, String param1) {
        le var3 = null;
        if (param0 == -26358) {
          if (((ci) this).field_p instanceof fg) {
            var3 = ((fg) (Object) ((ci) this).field_p).a(-1);
            if (var3 != null) {
              if (var3.a(-22243) == bm.field_i) {
                if (param1.equals((Object) (Object) ((ci) this).field_p.field_n)) {
                  return var3.b(28433);
                } else {
                  return od.field_t;
                }
              } else {
                return var3.b(28433);
              }
            } else {
              if (param1.equals((Object) (Object) ((ci) this).field_p.field_n)) {
                return null;
              } else {
                return od.field_t;
              }
            }
          } else {
            if (param1.equals((Object) (Object) ((ci) this).field_p.field_n)) {
              return null;
            } else {
              return od.field_t;
            }
          }
        } else {
          return null;
        }
    }

    final static void c(byte param0) {
        oh.field_c = null;
        if (param0 != 45) {
            String discarded$0 = ci.a(-6L, -103);
            oj.field_Gb = null;
            return;
        }
        oj.field_Gb = null;
    }

    final wl a(String param0, boolean param1) {
        le var4 = null;
        le var5 = null;
        wl stackIn_7_0 = null;
        wl stackIn_13_0 = null;
        wl stackIn_18_0 = null;
        wl stackIn_23_0 = null;
        wl stackIn_28_0 = null;
        wl stackIn_34_0 = null;
        wl stackOut_33_0 = null;
        wl stackOut_32_0 = null;
        wl stackOut_27_0 = null;
        wl stackOut_26_0 = null;
        wl stackOut_22_0 = null;
        wl stackOut_21_0 = null;
        wl stackOut_12_0 = null;
        wl stackOut_11_0 = null;
        wl stackOut_6_0 = null;
        wl stackOut_5_0 = null;
        wl stackOut_17_0 = null;
        wl stackOut_16_0 = null;
        if (param1) {
          if (((ci) this).field_p instanceof fg) {
            var5 = ((fg) (Object) ((ci) this).field_p).a(-1);
            if (var5 != null) {
              if (var5.a(-22243) == bm.field_i) {
                L0: {
                  if (!param0.equals((Object) (Object) ((ci) this).field_p.field_n)) {
                    stackOut_33_0 = ee.field_c;
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    stackOut_32_0 = bm.field_i;
                    stackIn_34_0 = stackOut_32_0;
                    break L0;
                  }
                }
                return stackIn_34_0;
              } else {
                return ee.field_c;
              }
            } else {
              L1: {
                if (!param0.equals((Object) (Object) ((ci) this).field_p.field_n)) {
                  stackOut_27_0 = ee.field_c;
                  stackIn_28_0 = stackOut_27_0;
                  break L1;
                } else {
                  stackOut_26_0 = bm.field_i;
                  stackIn_28_0 = stackOut_26_0;
                  break L1;
                }
              }
              return stackIn_28_0;
            }
          } else {
            L2: {
              if (!param0.equals((Object) (Object) ((ci) this).field_p.field_n)) {
                stackOut_22_0 = ee.field_c;
                stackIn_23_0 = stackOut_22_0;
                break L2;
              } else {
                stackOut_21_0 = bm.field_i;
                stackIn_23_0 = stackOut_21_0;
                break L2;
              }
            }
            return stackIn_23_0;
          }
        } else {
          field_s = null;
          if (((ci) this).field_p instanceof fg) {
            var4 = ((fg) (Object) ((ci) this).field_p).a(-1);
            if (var4 != null) {
              if (var4.a(-22243) == bm.field_i) {
                L3: {
                  if (!param0.equals((Object) (Object) ((ci) this).field_p.field_n)) {
                    stackOut_12_0 = ee.field_c;
                    stackIn_13_0 = stackOut_12_0;
                    break L3;
                  } else {
                    stackOut_11_0 = bm.field_i;
                    stackIn_13_0 = stackOut_11_0;
                    break L3;
                  }
                }
                return stackIn_13_0;
              } else {
                return ee.field_c;
              }
            } else {
              L4: {
                if (!param0.equals((Object) (Object) ((ci) this).field_p.field_n)) {
                  stackOut_6_0 = ee.field_c;
                  stackIn_7_0 = stackOut_6_0;
                  break L4;
                } else {
                  stackOut_5_0 = bm.field_i;
                  stackIn_7_0 = stackOut_5_0;
                  break L4;
                }
              }
              return stackIn_7_0;
            }
          } else {
            L5: {
              if (!param0.equals((Object) (Object) ((ci) this).field_p.field_n)) {
                stackOut_17_0 = ee.field_c;
                stackIn_18_0 = stackOut_17_0;
                break L5;
              } else {
                stackOut_16_0 = bm.field_i;
                stackIn_18_0 = stackOut_16_0;
                break L5;
              }
            }
            return stackIn_18_0;
          }
        }
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        if ((param0 ^ -1L) < -1L) {
          if (6582952005840035281L > param0) {
            if (-1L != (param0 % 37L ^ -1L)) {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if (0L == var4) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if ((param0 ^ -1L) == -1L) {
                      StringBuilder discarded$3 = var6.reverse();
                      if (param1 <= 64) {
                        boolean discarded$4 = ci.i(-57);
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      } else {
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      }
                    } else {
                      L2: {
                        var7 = param0;
                        param0 = param0 / 37L;
                        var9 = h.field_f[(int)(-(param0 * 37L) + var7)];
                        if (var9 != 95) {
                          break L2;
                        } else {
                          var10 = var6.length() + -1;
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        }
                      }
                      StringBuilder discarded$5 = var6.append(var9);
                      continue L1;
                    }
                  }
                } else {
                  var4 = var4 / 37L;
                  var3++;
                  continue L0;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void b(boolean param0, int param1) {
        tm.field_l.a(0, 0, 0);
        if (param1 >= -125) {
            km discarded$0 = ci.j(39);
        }
    }

    ci(wa param0, wa param1) {
        super(param0);
        ((ci) this).field_p = param1;
    }

    final static km j(int param0) {
        if (param0 >= -109) {
            return null;
        }
        return cg.b(1463);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = -1;
        field_n = "<%0> has not yet unlocked this option for use.";
    }
}
