/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends vf {
    private int field_y;
    private int field_w;
    static String field_v;
    private int field_x;
    private nf[] field_u;

    public static void c(int param0) {
        field_v = null;
        if (param0 >= -67) {
            field_v = null;
        }
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        if (param2 == null) {
          return false;
        } else {
          L0: {
            var3 = param2.length();
            if (-2 < var3) {
              break L0;
            } else {
              if (-13 < var3) {
                break L0;
              } else {
                L1: {
                  var4 = hh.a(0, param2);
                  if (var4 == null) {
                    break L1;
                  } else {
                    if ((var4.length() ^ -1) > -2) {
                      break L1;
                    } else {
                      L2: {
                        if (bg.a(175, var4.charAt(0))) {
                          break L2;
                        } else {
                          if (bg.a(param0 ^ 175, var4.charAt(var4.length() - 1))) {
                            break L2;
                          } else {
                            var5 = 0;
                            var6 = param0;
                            L3: while (true) {
                              if (var6 >= param2.length()) {
                                if (-1 < var5) {
                                  return false;
                                } else {
                                  return true;
                                }
                              } else {
                                L4: {
                                  var7 = param2.charAt(var6);
                                  if (!bg.a(param0 ^ 175, (char) var7)) {
                                    var5 = 0;
                                    break L4;
                                  } else {
                                    var5++;
                                    break L4;
                                  }
                                }
                                if (var5 <= -3) {
                                  if (!param1) {
                                    return false;
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                } else {
                                  var6++;
                                  continue L3;
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

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          if (param0 <= -97) {
            break L0;
          } else {
            var9 = null;
            boolean discarded$4 = je.a(126, true, (CharSequence) null);
            break L0;
          }
        }
        L1: {
          if (!param3.field_w) {
            if (param3.e((byte) -18)) {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 0;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_8_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_8_0;
          if (param3 instanceof rg) {
            param2 = param2 & ((rg) (Object) param3).field_L;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param2) {
            if (var6 != 0) {
              stackOut_15_0 = ((je) this).field_x;
              stackIn_16_0 = stackOut_15_0;
              break L3;
            } else {
              stackOut_14_0 = ((je) this).field_y;
              stackIn_16_0 = stackOut_14_0;
              break L3;
            }
          } else {
            stackOut_12_0 = ((je) this).field_w;
            stackIn_16_0 = stackOut_12_0;
            break L3;
          }
        }
        L4: {
          var7 = stackIn_16_0;
          if (param2) {
            stackOut_18_0 = 16777215;
            stackIn_19_0 = stackOut_18_0;
            break L4;
          } else {
            stackOut_17_0 = 7105644;
            stackIn_19_0 = stackOut_17_0;
            break L4;
          }
        }
        var8 = stackIn_19_0;
        qj.a(((je) this).field_u, param3.field_m + param4 - -(param3.field_z - ((je) this).field_u[0].field_x >> 622441121), param3.field_F, 55, param1 - -param3.field_q, var7);
        int discarded$5 = ((je) this).field_a.a(param3.field_B, param1 - -param3.field_q, param4 + param3.field_m - 2, param3.field_F, param3.field_z, var8, -1, 1, 1, ((je) this).field_a.field_C);
    }

    public je() {
        this(2188450, 2591221, 9543);
    }

    private je(int param0, int param1, int param2) {
        ((je) this).field_w = param2;
        ((je) this).field_x = param1;
        ((je) this).field_u = em.field_d;
        ((je) this).field_y = param0;
        ((je) this).field_a = fd.field_k;
    }

    static {
    }
}
