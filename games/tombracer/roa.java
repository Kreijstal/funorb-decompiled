/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class roa {
    int field_l;
    private int field_i;
    int field_t;
    boolean field_c;
    up field_f;
    int field_h;
    static float field_u;
    int field_p;
    private boolean field_j;
    int field_s;
    int field_o;
    boolean field_m;
    private int field_w;
    int field_k;
    private int field_v;
    int field_d;
    int field_r;
    int field_q;
    int field_b;
    private boolean field_e;
    boolean field_y;
    private int field_g;
    int field_n;
    int field_a;
    boolean field_x;

    final int b(int param0) {
        if (param0 != 524288) {
            ((roa) this).field_e = false;
            return ((roa) this).field_v;
        }
        return ((roa) this).field_v;
    }

    final int d(int param0) {
        if (param0 <= 18) {
            ((roa) this).field_k = -112;
            return ((roa) this).field_d;
        }
        return ((roa) this).field_d;
    }

    final void a(kh param0, byte param1) {
        param0.a((byte) -127, ((roa) this).field_r, 5);
        if (param1 <= 3) {
            boolean discarded$0 = this.a((byte) 22);
        }
    }

    final void a(int param0, byte param1) {
        if (param1 <= 11) {
            return;
        }
        ((roa) this).field_v = param0;
    }

    final up b(byte param0) {
        if (param0 != -16) {
            ((roa) this).a(6, true);
            return ((roa) this).field_f;
        }
        return ((roa) this).field_f;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        if (!param1) {
          ((roa) this).field_q = ((roa) this).field_p;
          var3 = -22 / ((46 - param0) / 36);
          return;
        } else {
          ((roa) this).field_q = -1;
          var3 = -22 / ((46 - param0) / 36);
          return;
        }
    }

    final void c(int param0) {
        if (!(((roa) this).field_v <= 0)) {
            ((roa) this).field_v = ((roa) this).field_v - 1;
        }
        if (param0 >= -1) {
            ((roa) this).field_w = -55;
            return;
        }
    }

    final void b(int param0, boolean param1) {
        if (param1) {
            ((roa) this).field_f = null;
            ((roa) this).field_v = param0;
            return;
        }
        ((roa) this).field_v = param0;
    }

    final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 12111) {
          if (!this.a((byte) 125)) {
            if (-1 < ((roa) this).field_q) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          ((roa) this).field_f = null;
          if (this.a((byte) 125)) {
            return true;
          } else {
            L0: {
              if (-1 <= ((roa) this).field_q) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final roa e(int param0) {
        if (param0 != -1) {
            return null;
        }
        return ci.a(((roa) this).field_r, -1);
    }

    final boolean a(int param0, int param1, gma param2, int param3, int param4, la param5, int param6, int param7, int param8, boolean param9) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        qea var27 = null;
        ep var28 = null;
        qea var29 = null;
        ep var30 = null;
        ep stackIn_25_0 = null;
        ep stackIn_26_0 = null;
        ep stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        ep stackIn_61_0 = null;
        ep stackIn_62_0 = null;
        ep stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        ep stackOut_60_0 = null;
        ep stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        ep stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        ep stackOut_24_0 = null;
        ep stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        ep stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        L0: {
          var26 = TombRacer.field_G ? 1 : 0;
          if (0 < ((roa) this).field_v) {
            break L0;
          } else {
            if (!((roa) this).a(12111)) {
              break L0;
            } else {
              var11 = hua.a((byte) 122, param0 >> -1481705246);
              if (!param9) {
                L1: {
                  var12 = bua.a(0, param0 >> 242314882);
                  var13 = param3 + gqa.a(var11, (byte) 24, param8);
                  var14 = param4 - -gqa.a(var12, (byte) 24, param8);
                  if (!((roa) this).field_m) {
                    param7 = 0;
                    param6 = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var29 = param5.q(-121);
                var16 = 0;
                L2: while (true) {
                  if (((roa) this).field_g <= var16) {
                    L3: {
                      ((roa) this).field_v = ((roa) this).field_h;
                      if (-1 > (((roa) this).field_q ^ -1)) {
                        ((roa) this).field_q = ((roa) this).field_q - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (((roa) this).field_e) {
                        param5.b(false).a((byte) 89, param1, var14, var13, param0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param5.a(param4, param3, ((roa) this).field_o, param1, (byte) 6);
                    return true;
                  } else {
                    L5: {
                      var17 = param0;
                      if (0 >= ((roa) this).field_s) {
                        break L5;
                      } else {
                        var17 = var17 + (var29.a(((roa) this).field_s, 0) + -(((roa) this).field_s / 2));
                        break L5;
                      }
                    }
                    L6: {
                      var18 = hua.a((byte) 110, var17 >> 1383929250);
                      var19 = bua.a(0, var17 >> 68619330);
                      var20 = ((roa) this).field_n;
                      if (((roa) this).field_w > 0) {
                        var20 = var20 + var29.a(((roa) this).field_w, 0);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var21 = param6 + gqa.a(var18, (byte) 24, var20);
                      var22 = param7 + gqa.a(var19, (byte) 24, var20);
                      var30 = param5.a(var14, var13, 127, param1);
                      var30.a(((roa) this).field_a, param5, ((roa) this).field_l, 66, ((roa) this).field_b, ((roa) this).field_k);
                      var30.b(var21, var22, (byte) -92);
                      var24 = var29.a(8192, 0);
                      if (3 == ((roa) this).field_b) {
                        var25 = -512 + var29.a(1024, 0);
                        var30.b(7, var25, var24);
                        break L7;
                      } else {
                        if (((roa) this).field_b != 2) {
                          break L7;
                        } else {
                          var30.b(7, 128, var24);
                          break L7;
                        }
                      }
                    }
                    L8: {
                      var30.a(-126, new up(param2, ((roa) this).field_f));
                      if ((((roa) this).field_i ^ -1) == 0) {
                        break L8;
                      } else {
                        var30.a(((roa) this).field_i, -38);
                        break L8;
                      }
                    }
                    L9: {
                      if (!((roa) this).field_x) {
                        break L9;
                      } else {
                        var30.b(true, 101);
                        break L9;
                      }
                    }
                    L10: {
                      if (!((roa) this).field_c) {
                        break L10;
                      } else {
                        L11: {
                          stackOut_60_0 = (ep) var30;
                          stackIn_62_0 = stackOut_60_0;
                          stackIn_61_0 = stackOut_60_0;
                          if (param9) {
                            stackOut_62_0 = (ep) (Object) stackIn_62_0;
                            stackOut_62_1 = 0;
                            stackIn_63_0 = stackOut_62_0;
                            stackIn_63_1 = stackOut_62_1;
                            break L11;
                          } else {
                            stackOut_61_0 = (ep) (Object) stackIn_61_0;
                            stackOut_61_1 = 1;
                            stackIn_63_0 = stackOut_61_0;
                            stackIn_63_1 = stackOut_61_1;
                            break L11;
                          }
                        }
                        ((ep) (Object) stackIn_63_0).a(stackIn_63_1 != 0, true);
                        break L10;
                      }
                    }
                    L12: {
                      if (!((roa) this).field_j) {
                        break L12;
                      } else {
                        var30.c(true, true);
                        break L12;
                      }
                    }
                    L13: {
                      if (((roa) this).field_y) {
                        var30.b(-1, true);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var30.field_m = ((roa) this).field_t;
                    var16++;
                    continue L2;
                  }
                }
              } else {
                L14: {
                  ((roa) this).field_w = 123;
                  var12 = bua.a(0, param0 >> 242314882);
                  var13 = param3 + gqa.a(var11, (byte) 24, param8);
                  var14 = param4 - -gqa.a(var12, (byte) 24, param8);
                  if (!((roa) this).field_m) {
                    param7 = 0;
                    param6 = 0;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var27 = param5.q(-121);
                var16 = 0;
                L15: while (true) {
                  if (((roa) this).field_g <= var16) {
                    L16: {
                      ((roa) this).field_v = ((roa) this).field_h;
                      if (-1 > (((roa) this).field_q ^ -1)) {
                        ((roa) this).field_q = ((roa) this).field_q - 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (((roa) this).field_e) {
                        param5.b(false).a((byte) 89, param1, var14, var13, param0);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    param5.a(param4, param3, ((roa) this).field_o, param1, (byte) 6);
                    return true;
                  } else {
                    L18: {
                      var17 = param0;
                      if (0 >= ((roa) this).field_s) {
                        break L18;
                      } else {
                        var17 = var17 + (var27.a(((roa) this).field_s, 0) + -(((roa) this).field_s / 2));
                        break L18;
                      }
                    }
                    L19: {
                      var18 = hua.a((byte) 110, var17 >> 1383929250);
                      var19 = bua.a(0, var17 >> 68619330);
                      var20 = ((roa) this).field_n;
                      if (((roa) this).field_w > 0) {
                        var20 = var20 + var27.a(((roa) this).field_w, 0);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      var21 = param6 + gqa.a(var18, (byte) 24, var20);
                      var22 = param7 + gqa.a(var19, (byte) 24, var20);
                      var28 = param5.a(var14, var13, 127, param1);
                      var28.a(((roa) this).field_a, param5, ((roa) this).field_l, 66, ((roa) this).field_b, ((roa) this).field_k);
                      var28.b(var21, var22, (byte) -92);
                      var24 = var27.a(8192, 0);
                      if (3 == ((roa) this).field_b) {
                        var25 = -512 + var27.a(1024, 0);
                        var28.b(7, var25, var24);
                        break L20;
                      } else {
                        if (((roa) this).field_b != 2) {
                          break L20;
                        } else {
                          var28.b(7, 128, var24);
                          break L20;
                        }
                      }
                    }
                    L21: {
                      var28.a(-126, new up(param2, ((roa) this).field_f));
                      if ((((roa) this).field_i ^ -1) == 0) {
                        break L21;
                      } else {
                        var28.a(((roa) this).field_i, -38);
                        break L21;
                      }
                    }
                    L22: {
                      if (!((roa) this).field_x) {
                        break L22;
                      } else {
                        var28.b(true, 101);
                        break L22;
                      }
                    }
                    L23: {
                      if (!((roa) this).field_c) {
                        break L23;
                      } else {
                        L24: {
                          stackOut_24_0 = (ep) var28;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (param9) {
                            stackOut_26_0 = (ep) (Object) stackIn_26_0;
                            stackOut_26_1 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            break L24;
                          } else {
                            stackOut_25_0 = (ep) (Object) stackIn_25_0;
                            stackOut_25_1 = 1;
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_27_1 = stackOut_25_1;
                            break L24;
                          }
                        }
                        ((ep) (Object) stackIn_27_0).a(stackIn_27_1 != 0, true);
                        break L23;
                      }
                    }
                    L25: {
                      if (!((roa) this).field_j) {
                        break L25;
                      } else {
                        var28.c(true, true);
                        break L25;
                      }
                    }
                    L26: {
                      if (((roa) this).field_y) {
                        var28.b(-1, true);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    var28.field_m = ((roa) this).field_t;
                    var16++;
                    continue L15;
                  }
                }
              }
            }
          }
        }
        return false;
    }

    private final boolean a(byte param0) {
        if (param0 < 99) {
            return false;
        }
        return (((roa) this).field_q ^ -1) == 0 ? true : false;
    }

    roa() {
        ((roa) this).field_i = -1;
        ((roa) this).field_o = -1;
        ((roa) this).field_g = 1;
        ((roa) this).field_t = -1;
        ((roa) this).field_y = true;
        ((roa) this).field_a = 524288;
        ((roa) this).field_n = 524288;
        ((roa) this).field_k = 100;
        ((roa) this).field_l = 524288;
    }

    final int a(boolean param0) {
        if (!param0) {
            up discarded$0 = ((roa) this).b((byte) -20);
            return ((roa) this).field_h;
        }
        return ((roa) this).field_h;
    }

    static {
    }
}
