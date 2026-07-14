/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends im {
    private boolean field_h;
    private int[] field_l;
    private byte[] field_n;
    private int field_k;
    private int field_m;
    static cg field_i;
    static int field_j;

    final void a(boolean param0) {
        ((be) this).field_m = 0;
        ((be) this).field_k = 0;
        if (param0) {
            ((be) this).a((byte) -3);
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            be.c(true);
        }
        field_i = null;
    }

    final byte[] c(int param0, int param1, int param2) {
        ((be) this).field_n = new byte[param0 * param1];
        ((be) this).b(param0, param1, -9394);
        if (param2 >= -18) {
            return null;
        }
        return ((be) this).field_n;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != -25466) {
            return;
        }
        ((be) this).field_m = ((be) this).field_m + (((be) this).field_l[param0] * param1 >> -1775744532);
    }

    final static vk a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = ZombieDawn.field_J;
        var2 = param0.length();
        if (0 == var2) {
          return bg.field_l;
        } else {
          if (-65 <= (var2 ^ -1)) {
            if (param0.charAt(0) != 34) {
              var3 = 0;
              if (param1 <= -47) {
                var4 = 0;
                L0: while (true) {
                  if (var4 < var2) {
                    var5 = param0.charAt(var4);
                    if (46 != var5) {
                      if (-1 != mc.field_i.indexOf(var5)) {
                        var3 = 0;
                        var4++;
                        continue L0;
                      } else {
                        return vl.field_m;
                      }
                    } else {
                      L1: {
                        if (var4 == 0) {
                          break L1;
                        } else {
                          if (var2 - 1 == var4) {
                            break L1;
                          } else {
                            if (var3 == 0) {
                              var3 = 1;
                              var4++;
                              continue L0;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      return vl.field_m;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              if (param0.charAt(-1 + var2) == 34) {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (var2 - 1 > var4) {
                    var5 = param0.charAt(var4);
                    if (var5 == 92) {
                      L3: {
                        if (var3 != 0) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L3;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L3;
                        }
                      }
                      var3 = stackIn_16_0;
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        if (var5 != 34) {
                          break L4;
                        } else {
                          if (var3 == 0) {
                            return vl.field_m;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L2;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return vl.field_m;
              }
            }
          } else {
            return fg.field_m;
          }
        }
    }

    be(int param0, int param1, int param2, int param3, int param4, float param5, boolean param6) {
        super(param0, param1, param2, param3, param4);
        int var8 = 0;
        ((be) this).field_l = new int[((be) this).field_g];
        ((be) this).field_h = param6 ? true : false;
        for (var8 = 0; ((be) this).field_g > var8; var8++) {
            ((be) this).field_l[var8] = (short)(int)(4096.0 * Math.pow((double)param5, (double)var8));
        }
    }

    final void a(byte param0) {
        if (param0 != 44) {
            Object var3 = null;
            vk discarded$0 = be.a((String) null, (byte) -57);
        }
        if (4095 >= (((be) this).field_m ^ -1)) {
            // if_icmpge L65
            ((be) this).field_m = 4096;
        } else {
            ((be) this).field_m = -4096;
        }
        ((be) this).field_k = ((be) this).field_k + 1;
        ((be) this).field_n[((be) this).field_k] = (byte)((((be) this).field_h ? 2048 + (((be) this).field_m >> -1728161183) : ((be) this).field_m) >> -154155708);
        ((be) this).field_m = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new cg(11, 0, 1, 2);
    }
}
