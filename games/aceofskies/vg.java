/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vg extends pp {
    private int field_i;
    private boolean field_m;
    private int field_k;
    private int field_g;
    static ei field_h;
    private String field_l;
    private int field_d;
    private int field_c;
    private hc field_f;
    static Hashtable field_j;
    static int[] field_e;

    final void a(int param0, hc param1, int param2, String param3, int param4) {
        if (param3 == null) {
            ((vg) this).field_b = null;
            return;
        }
        if (((vg) this).field_f == param1) {
            if (((vg) this).field_m) {
                if ((((vg) this).field_d ^ -1) == -2) {
                    if (null != ((vg) this).field_l) {
                        if (((vg) this).field_l.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        ((vg) this).field_d = 1;
        if (param0 < 1) {
            String var8 = (String) null;
            ((vg) this).a(-95, (hc) null, -118, (String) null, -117);
        }
        ((vg) this).field_f = param1;
        ((vg) this).field_m = true;
        co var9 = this.a(param4, 77, param1, param3);
        int var7 = param1.a(param3);
        ((co) var9).field_h[0] = param2 - (var7 >> 423150369);
        ((co) var9).field_h[param3.length()] = (var7 >> 291627521) + param2;
        ng.a(param1, param3, var9, 0, (byte) 30);
    }

    final void a(int param0, String param1, int param2, int param3, hc param4) {
        if (param1 == null) {
            ((vg) this).field_b = null;
            return;
        }
        if (((vg) this).field_f == param4) {
            if (((vg) this).field_m) {
                if ((((vg) this).field_d ^ -1) == -3) {
                    if (null != ((vg) this).field_l) {
                        if (((vg) this).field_l.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        ((vg) this).field_d = 2;
        ((vg) this).field_m = true;
        ((vg) this).field_l = param1;
        if (param0 != 2137) {
            field_j = (Hashtable) null;
        }
        ((vg) this).field_f = param4;
        co var8 = this.a(param3, 43, param4, param1);
        co var9 = var8;
        ((co) var9).field_h[0] = -param4.a(param1) + param2;
        ((co) var9).field_h[param1.length()] = param2;
        ng.a(param4, param1, var9, 0, (byte) 30);
    }

    final void a(String param0, int param1, int param2, hc param3, byte param4) {
        if (!(param0 != null)) {
            ((vg) this).field_b = null;
            return;
        }
        if (param3 == ((vg) this).field_f) {
            if (((vg) this).field_m) {
                if (((vg) this).field_d == 0) {
                    if (null != ((vg) this).field_l) {
                        if (((vg) this).field_l.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((vg) this).field_d = 0;
        ((vg) this).field_f = param3;
        ((vg) this).field_m = true;
        ((vg) this).field_l = param0;
        co var8 = this.a(param2, -128, param3, param0);
        co var9 = var8;
        ((co) var8).field_h[0] = param1;
        ((co) var9).field_h[param0.length()] = param3.a(param0) + param1;
        if (param4 >= -45) {
            hc var7 = (hc) null;
            ((vg) this).a(-111, (String) null, -109, -118, (hc) null);
        }
        ng.a(param3, param0, var9, 0, (byte) 30);
    }

    private final co a(int param0, int param1, hc param2, String param3) {
        int var5 = -90 / ((-38 - param1) / 52);
        co var6 = new co(param0 - ((hc) param2).field_I, ((hc) param2).field_D + param0, param3.length());
        ((vg) this).field_b = new co[]{var6};
        return var6;
    }

    final void a(String param0, hc param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        co var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        co stackIn_34_0 = null;
        co stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        co stackIn_35_0 = null;
        co stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        co stackIn_36_0 = null;
        co stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        hc stackIn_39_0 = null;
        String stackIn_39_1 = null;
        co stackIn_39_2 = null;
        hc stackIn_40_0 = null;
        String stackIn_40_1 = null;
        co stackIn_40_2 = null;
        hc stackIn_41_0 = null;
        String stackIn_41_1 = null;
        co stackIn_41_2 = null;
        int stackIn_41_3 = 0;
        co stackOut_33_0 = null;
        co stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        co stackOut_35_0 = null;
        co stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        co stackOut_34_0 = null;
        co stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        hc stackOut_38_0 = null;
        String stackOut_38_1 = null;
        co stackOut_38_2 = null;
        hc stackOut_40_0 = null;
        String stackOut_40_1 = null;
        co stackOut_40_2 = null;
        int stackOut_40_3 = 0;
        hc stackOut_39_0 = null;
        String stackOut_39_1 = null;
        co stackOut_39_2 = null;
        int stackOut_39_3 = 0;
        L0: {
          var15 = AceOfSkies.field_G ? 1 : 0;
          if (param7 != 0) {
            break L0;
          } else {
            param7 = ((hc) param1).field_w;
            break L0;
          }
        }
        if (param0 == null) {
          ((vg) this).field_b = null;
          return;
        } else {
          L1: {
            if (param1 != ((vg) this).field_f) {
              break L1;
            } else {
              if (((vg) this).field_m) {
                break L1;
              } else {
                if (((vg) this).field_d != param6) {
                  break L1;
                } else {
                  if (param2 != ((vg) this).field_g) {
                    break L1;
                  } else {
                    if (((vg) this).field_c != param7) {
                      break L1;
                    } else {
                      if (param5 != ((vg) this).field_k) {
                        break L1;
                      } else {
                        if (param4 != ((vg) this).field_i) {
                          break L1;
                        } else {
                          if (((vg) this).field_l == null) {
                            break L1;
                          } else {
                            if (!((vg) this).field_l.equals((Object) (Object) param0)) {
                              break L1;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L2: {
            ((vg) this).field_g = param2;
            ((vg) this).field_d = param6;
            ((vg) this).field_k = param5;
            ((vg) this).field_f = param1;
            ((vg) this).field_c = param7;
            if (param3 == 127395681) {
              break L2;
            } else {
              field_h = (ei) null;
              break L2;
            }
          }
          L3: {
            ((vg) this).field_m = false;
            ((vg) this).field_l = param0;
            ((vg) this).field_i = param4;
            var16 = new String[1 + param1.a(param0, param4)];
            var17 = var16;
            var10 = Math.max(1, param1.a(param0, new int[1], var17));
            if (((vg) this).field_g != -4) {
              break L3;
            } else {
              if (-2 == var10) {
                ((vg) this).field_g = 1;
                break L3;
              } else {
                break L3;
              }
            }
          }
          L4: {
            ((vg) this).field_b = new co[var10];
            if (0 != ((vg) this).field_g) {
              if (-2 == ((vg) this).field_g) {
                var11 = ((hc) param1).field_I + (((vg) this).field_k + -(((vg) this).field_c * var10) >> -1124339199);
                break L4;
              } else {
                if (-3 == ((vg) this).field_g) {
                  var11 = -(((vg) this).field_c * var10) + (-((hc) param1).field_D + ((vg) this).field_k);
                  break L4;
                } else {
                  L5: {
                    var12 = (((vg) this).field_k - ((vg) this).field_c * var10) / (var10 + 1);
                    if (var12 < 0) {
                      var12 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((vg) this).field_c = ((vg) this).field_c + var12;
                  var11 = ((hc) param1).field_I + var12;
                  break L4;
                }
              }
            } else {
              var11 = ((hc) param1).field_I;
              break L4;
            }
          }
          var12 = 0;
          L6: while (true) {
            if (var12 >= var10) {
              return;
            } else {
              L7: {
                var13 = var16[var12];
                stackOut_33_0 = null;
                stackOut_33_1 = null;
                stackOut_33_2 = -((hc) param1).field_I + var11;
                stackOut_33_3 = ((hc) param1).field_D + var11;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_35_2 = stackOut_33_2;
                stackIn_35_3 = stackOut_33_3;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                stackIn_34_2 = stackOut_33_2;
                stackIn_34_3 = stackOut_33_3;
                if (var13 == null) {
                  stackOut_35_0 = null;
                  stackOut_35_1 = null;
                  stackOut_35_2 = stackIn_35_2;
                  stackOut_35_3 = stackIn_35_3;
                  stackOut_35_4 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  stackIn_36_3 = stackOut_35_3;
                  stackIn_36_4 = stackOut_35_4;
                  break L7;
                } else {
                  stackOut_34_0 = null;
                  stackOut_34_1 = null;
                  stackOut_34_2 = stackIn_34_2;
                  stackOut_34_3 = stackIn_34_3;
                  stackOut_34_4 = var13.length();
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  stackIn_36_3 = stackOut_34_3;
                  stackIn_36_4 = stackOut_34_4;
                  break L7;
                }
              }
              L8: {
                new co(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                var14 = (co) (Object) stackIn_36_0;
                ((co) var14).field_h[0] = 0;
                if (var13 != null) {
                  L9: {
                    ((co) var14).field_h[var13.length()] = param1.a(var13);
                    stackOut_38_0 = (hc) param1;
                    stackOut_38_1 = (String) var13;
                    stackOut_38_2 = (co) var14;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    stackIn_40_2 = stackOut_38_2;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    if (-4 != (param6 ^ -1)) {
                      stackOut_40_0 = (hc) (Object) stackIn_40_0;
                      stackOut_40_1 = (String) (Object) stackIn_40_1;
                      stackOut_40_2 = (co) (Object) stackIn_40_2;
                      stackOut_40_3 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      stackIn_41_1 = stackOut_40_1;
                      stackIn_41_2 = stackOut_40_2;
                      stackIn_41_3 = stackOut_40_3;
                      break L9;
                    } else {
                      stackOut_39_0 = (hc) (Object) stackIn_39_0;
                      stackOut_39_1 = (String) (Object) stackIn_39_1;
                      stackOut_39_2 = (co) (Object) stackIn_39_2;
                      stackOut_39_3 = ((vg) this).a(param4, -1, var13, param1.a(var13));
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      stackIn_41_2 = stackOut_39_2;
                      stackIn_41_3 = stackOut_39_3;
                      break L9;
                    }
                  }
                  ng.a((hc) (Object) stackIn_41_0, (String) (Object) stackIn_41_1, (co) (Object) stackIn_41_2, stackIn_41_3, (byte) 30);
                  break L8;
                } else {
                  break L8;
                }
              }
              var11 = var11 + param7;
              ((vg) this).field_b[var12] = var14;
              var12++;
              continue L6;
            }
          }
        }
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 != 0) {
            vg.b(-51);
        }
        field_h = null;
        field_e = null;
    }

    public vg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_h = new ei();
        field_j = new Hashtable();
        field_e = new int[256];
        var1 = 0;
        L0: while (true) {
          if (-257 >= var1) {
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_e[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (-2 == (var0 & 1)) {
                  var0 = -306674912 ^ var0 >>> 127395681;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
