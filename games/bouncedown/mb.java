/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends ed {
    private boolean field_l;
    static qc field_n;
    private tj field_i;
    static long field_s;
    static int[] field_o;
    private int field_g;
    private int field_f;
    private String field_m;
    static int field_e;
    static tg field_q;
    private int field_p;
    static String field_k;
    private int field_r;
    static int field_j;
    private int field_h;

    final void a(int param0, tj param1, String param2, boolean param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        bh var14 = null;
        int var15 = 0;
        Object var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        bh stackIn_33_0 = null;
        bh stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        bh stackIn_34_0 = null;
        bh stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        bh stackIn_35_0 = null;
        bh stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        tj stackIn_38_0 = null;
        String stackIn_38_1 = null;
        tj stackIn_39_0 = null;
        String stackIn_39_1 = null;
        tj stackIn_40_0 = null;
        String stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        bh stackOut_32_0 = null;
        bh stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        bh stackOut_34_0 = null;
        bh stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        bh stackOut_33_0 = null;
        bh stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        tj stackOut_37_0 = null;
        String stackOut_37_1 = null;
        tj stackOut_39_0 = null;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        tj stackOut_38_0 = null;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        L0: {
          var15 = Bounce.field_N;
          if (0 == param7) {
            param7 = param1.field_p;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 != null) {
          L1: {
            if (((mb) this).field_i != param1) {
              break L1;
            } else {
              if (((mb) this).field_l) {
                break L1;
              } else {
                if (param6 != ((mb) this).field_p) {
                  break L1;
                } else {
                  if (((mb) this).field_f != param5) {
                    break L1;
                  } else {
                    if (((mb) this).field_r != param7) {
                      break L1;
                    } else {
                      if (param4 != ((mb) this).field_h) {
                        break L1;
                      } else {
                        if (param0 != ((mb) this).field_g) {
                          break L1;
                        } else {
                          if (((mb) this).field_m == null) {
                            break L1;
                          } else {
                            if (!((mb) this).field_m.equals((Object) (Object) param2)) {
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
            ((mb) this).field_h = param4;
            ((mb) this).field_p = param6;
            ((mb) this).field_i = param1;
            ((mb) this).field_r = param7;
            ((mb) this).field_g = param0;
            ((mb) this).field_l = false;
            ((mb) this).field_f = param5;
            if (param3) {
              break L2;
            } else {
              var16 = null;
              ((mb) this).a((String) null, -57, (byte) -100, -16, (tj) null);
              break L2;
            }
          }
          L3: {
            ((mb) this).field_m = param2;
            var17 = new String[1 + param1.a(param2, param0)];
            var18 = var17;
            var10 = Math.max(1, param1.a(param2, new int[1], var18));
            if (((mb) this).field_f != 3) {
              break L3;
            } else {
              if (var10 != 1) {
                break L3;
              } else {
                ((mb) this).field_f = 1;
                break L3;
              }
            }
          }
          L4: {
            ((mb) this).field_a = new bh[var10];
            if (((mb) this).field_f != 0) {
              if (((mb) this).field_f == 1) {
                var11 = param1.field_s + (((mb) this).field_h - var10 * ((mb) this).field_r >> 1158641249);
                break L4;
              } else {
                if ((((mb) this).field_f ^ -1) == -3) {
                  var11 = -(((mb) this).field_r * var10) + -param1.field_x + ((mb) this).field_h;
                  break L4;
                } else {
                  L5: {
                    var12 = (((mb) this).field_h + -(((mb) this).field_r * var10)) / (var10 - -1);
                    if ((var12 ^ -1) > -1) {
                      var12 = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((mb) this).field_r = ((mb) this).field_r + var12;
                  var11 = var12 + param1.field_s;
                  break L4;
                }
              }
            } else {
              var11 = param1.field_s;
              break L4;
            }
          }
          var12 = 0;
          L6: while (true) {
            if (var12 >= var10) {
              return;
            } else {
              L7: {
                var13 = var17[var12];
                stackOut_32_0 = null;
                stackOut_32_1 = null;
                stackOut_32_2 = -param1.field_s + var11;
                stackOut_32_3 = var11 + param1.field_x;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_34_2 = stackOut_32_2;
                stackIn_34_3 = stackOut_32_3;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                stackIn_33_2 = stackOut_32_2;
                stackIn_33_3 = stackOut_32_3;
                if (var13 == null) {
                  stackOut_34_0 = null;
                  stackOut_34_1 = null;
                  stackOut_34_2 = stackIn_34_2;
                  stackOut_34_3 = stackIn_34_3;
                  stackOut_34_4 = 0;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  stackIn_35_2 = stackOut_34_2;
                  stackIn_35_3 = stackOut_34_3;
                  stackIn_35_4 = stackOut_34_4;
                  break L7;
                } else {
                  stackOut_33_0 = null;
                  stackOut_33_1 = null;
                  stackOut_33_2 = stackIn_33_2;
                  stackOut_33_3 = stackIn_33_3;
                  stackOut_33_4 = var13.length();
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  stackIn_35_3 = stackOut_33_3;
                  stackIn_35_4 = stackOut_33_4;
                  break L7;
                }
              }
              L8: {
                new bh(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                var14 = stackIn_35_0;
                var14.field_a[0] = 0;
                if (var13 != null) {
                  L9: {
                    var14.field_a[var13.length()] = param1.b(var13);
                    stackOut_37_0 = (tj) param1;
                    stackOut_37_1 = (String) var13;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    if (param6 != 3) {
                      stackOut_39_0 = (tj) (Object) stackIn_39_0;
                      stackOut_39_1 = (String) (Object) stackIn_39_1;
                      stackOut_39_2 = 0;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      stackIn_40_2 = stackOut_39_2;
                      break L9;
                    } else {
                      stackOut_38_0 = (tj) (Object) stackIn_38_0;
                      stackOut_38_1 = (String) (Object) stackIn_38_1;
                      stackOut_38_2 = ((mb) this).a(param1.b(var13), param0, -127, var13);
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_40_2 = stackOut_38_2;
                      break L9;
                    }
                  }
                  wi.a(stackIn_40_0, stackIn_40_1, stackIn_40_2, false, var14);
                  break L8;
                } else {
                  break L8;
                }
              }
              var11 = var11 + param7;
              ((mb) this).field_a[var12] = var14;
              var12++;
              continue L6;
            }
          }
        } else {
          ((mb) this).field_a = null;
          return;
        }
    }

    private final bh a(int param0, byte param1, String param2, tj param3) {
        if (param1 <= 97) {
            return null;
        }
        bh var6 = new bh(-param3.field_s + param0, param0 + param3.field_x, param2.length());
        bh var5 = var6;
        ((mb) this).field_a = new bh[]{var6};
        return var5;
    }

    final void a(String param0, tj param1, int param2, int param3, int param4) {
        if (!(param0 != null)) {
            ((mb) this).field_a = null;
            return;
        }
        if (((mb) this).field_i == param1) {
            if (((mb) this).field_l) {
                if (-3 == (((mb) this).field_p ^ -1)) {
                    if (((mb) this).field_m != null) {
                        if (((mb) this).field_m.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((mb) this).field_i = param1;
        ((mb) this).field_p = 2;
        ((mb) this).field_l = true;
        ((mb) this).field_m = param0;
        bh var9 = this.a(param2, (byte) 102, param0, param1);
        bh var10 = var9;
        var10.field_a[0] = -param1.b(param0) + param4;
        int var7 = 117 / ((1 - param3) / 57);
        var10.field_a[param0.length()] = param4;
        wi.a(param1, param0, 0, false, var10);
    }

    public static void c(int param0) {
        field_n = null;
        field_o = null;
        field_q = null;
        if (param0 < 18) {
            field_e = 1;
        }
        field_k = null;
    }

    final void a(int param0, String param1, tj param2, int param3, boolean param4) {
        if (param1 == null) {
            ((mb) this).field_a = null;
            return;
        }
        if (param2 == ((mb) this).field_i) {
            if (((mb) this).field_l) {
                if (((mb) this).field_p == 1) {
                    if (((mb) this).field_m != null) {
                        if (!(!((mb) this).field_m.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        ((mb) this).field_l = true;
        ((mb) this).field_i = param2;
        ((mb) this).field_p = 1;
        bh var8 = this.a(param0, (byte) 107, param1, param2);
        int var7 = param2.b(param1);
        var8.field_a[0] = param3 + -(var7 >> 1312660385);
        var8.field_a[param1.length()] = param3 + (var7 >> 496629537);
        wi.a(param2, param1, 0, param4, var8);
    }

    final void a(String param0, int param1, byte param2, int param3, tj param4) {
        if (!(param0 != null)) {
            ((mb) this).field_a = null;
            return;
        }
        if (((mb) this).field_i == param4) {
            if (((mb) this).field_l) {
                if (0 == ((mb) this).field_p) {
                    if (null != ((mb) this).field_m) {
                        if (((mb) this).field_m.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        int var6 = -29 / ((-10 - param2) / 63);
        ((mb) this).field_l = true;
        ((mb) this).field_p = 0;
        ((mb) this).field_m = param0;
        ((mb) this).field_i = param4;
        bh var7 = this.a(param1, (byte) 100, param0, param4);
        var7.field_a[0] = param3;
        var7.field_a[param0.length()] = param4.b(param0) + param3;
        wi.a(param4, param0, 0, false, var7);
    }

    public mb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_n = new qc();
        field_e = 20;
        field_k = "This password contains repeated characters, and would be easy to guess";
        field_j = 0;
    }
}
