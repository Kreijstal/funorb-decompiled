/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb extends pg {
    byte[] field_j;
    static vn field_m;
    static int field_g;
    boolean field_k;
    static int field_h;
    static String field_i;
    static String field_l;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          eh.field_e.h(0, 0);
          var1 = 32;
          var2 = 80;
          wm.field_H[15].c(var2, bo.field_d, 160, 64);
          if (null != hf.field_o) {
            var3 = 64 * hf.field_o.field_n / hf.field_o.field_w;
            hf.field_o.c(-(var3 / 2) + 80 + var2, bo.field_d, var3, 64);
            break L0;
          } else {
            break L0;
          }
        }
        wm.field_H[15].c(var2 + 160, bo.field_d, 224, 48);
        wm.field_H[15].c(464, bo.field_d, 96, 48);
        ih.field_e.c(464, 8 + bo.field_d);
        var3 = 53;
        int discarded$43 = mc.field_b.a(Integer.toString(var3), 464, 8 + bo.field_d, 32, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
        int discarded$44 = mc.field_b.a("Orb coins Banked", 496, bo.field_d, 64, 48, 16777215, 0, 1, 1, mc.field_b.field_C);
        wm.field_H[15].c(80, 128 + (64 + bo.field_d) - -32, 480, 64);
        if ((1 & ch.field_b) > 0) {
          mc.field_b.a("SHOW INFOS", 32, var1, 16777215, 0);
          var1 += 16;
          var4 = bo.field_d + 64;
          wm.field_H[15].c(var2, var4, 160, 160);
          de.d(3, 3, 16 + var2, 16 + var4, 128, 128);
          de.a(-64 + (80 + var2) + -1, 15 + var4, 130, 130, 0);
          wd.field_e.c(-64 + (var2 - -80), var4 - -16);
          var4 = 48 + bo.field_d;
          var5 = 176;
          var6 = var2 + 160;
          var7 = 320;
          wm.field_H[6].c(var6, var4, var7, var5);
          int discarded$45 = mc.field_b.a(sn.field_L, var6, var4 - -32, var7, 32 + mc.field_b.field_C, 16777215, 0, 1, 1, mc.field_b.field_C);
          if ((2 & ch.field_b) <= 0) {
            if (p.field_j == null) {
              L1: {
                var4 = -mc.field_b.field_C - 32 + (64 + (128 + (bo.field_d + 32)));
                int discarded$46 = mc.field_b.a("Orb coins to purchase", var6 + 32 - -32, var4, var7 - 80, 32 + mc.field_b.field_C, 16777215, 0, 1, 1, mc.field_b.field_C);
                ih.field_e.c(var6 + 16, -16 + mc.field_b.field_C / 2 + var4 + 16);
                int discarded$47 = mc.field_b.a(Integer.toString(cb.field_f), var6 - -16, 16 + (mc.field_b.field_C / 2 + (var4 + -16)), 32, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                if (-1 <= (ch.field_b & 2 ^ -1)) {
                  break L1;
                } else {
                  mc.field_b.a("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
                  var1 += 16;
                  var4 = 64 + (128 + bo.field_d + 32);
                  wm.field_H[6].c(var2 + 16, var4 - -16, 216, 32);
                  int discarded$48 = mc.field_b.a("Purchase", var2 - -16, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                  break L1;
                }
              }
              L2: {
                if (-1 <= (ch.field_b & 4 ^ -1)) {
                  break L2;
                } else {
                  mc.field_b.a("SHOW PURCHASE", 32, var1, 16777215, 0);
                  var1 += 16;
                  var4 = 64 + (32 + bo.field_d) - -128;
                  wm.field_H[15].c(var2 - -16, 16 + var4, 216, 32);
                  int discarded$49 = mc.field_b.a("Purchase", var2 - -16, 16 + var4, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                  break L2;
                }
              }
              L3: {
                if (0 >= (ch.field_b & 8)) {
                  break L3;
                } else {
                  mc.field_b.a("SHOW CONFIRM", 32, var1, 16777215, 0);
                  var1 += 16;
                  var4 = bo.field_d + 32 + 192;
                  var5 = 100;
                  wm.field_H[15].c(var2 + 16, 16 + var4, var5, 32);
                  int discarded$50 = mc.field_b.a("Yes", var2 + 16, var4 - -16, var5, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                  wm.field_H[15].c(240 + var2 + 16 - (24 - -var5), 16 + var4, var5, 32);
                  int discarded$51 = mc.field_b.a("No", -var5 + (-8 + (var2 + 240)), var4 - -16, var5, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                  break L3;
                }
              }
              L4: {
                if ((ch.field_b & 16) <= 0) {
                  break L4;
                } else {
                  mc.field_b.a("SHOW WAIT", 32, var1, 16777215, 0);
                  var1 += 16;
                  var4 = 128 + (bo.field_d - -32) + 64;
                  wm.field_H[6].c(328, var4 - -16, 216, 32);
                  int discarded$52 = mc.field_b.a("Cancel", 328, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                  int discarded$53 = mc.field_b.a("Please wait for confirmation of your purchase.", 16 + var2, var4, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
                  break L4;
                }
              }
              if (param0 != 2341) {
                L5: {
                  pb.a(-26);
                  if ((ch.field_b & 32 ^ -1) >= -1) {
                    break L5;
                  } else {
                    mc.field_b.a("SHOW COMPLETE", 32, var1, 16777215, 0);
                    var1 += 16;
                    var4 = 64 + (128 + bo.field_d) - -32;
                    int discarded$54 = mc.field_b.a("Purchase completed.", 16 + var2, var4, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
                    break L5;
                  }
                }
                L6: {
                  if ((ch.field_b & 64 ^ -1) < -1) {
                    mc.field_b.a("SHOW EXIT", 32, var1, 16777215, 0);
                    var1 += 16;
                    var4 = bo.field_d + 160 + 64;
                    wm.field_H[15].c(328, 16 + var4, 216, 32);
                    int discarded$55 = mc.field_b.a("Cancel", 328, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              } else {
                L7: {
                  if ((ch.field_b & 32 ^ -1) >= -1) {
                    break L7;
                  } else {
                    mc.field_b.a("SHOW COMPLETE", 32, var1, 16777215, 0);
                    var1 += 16;
                    var4 = 64 + (128 + bo.field_d) - -32;
                    int discarded$56 = mc.field_b.a("Purchase completed.", 16 + var2, var4, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
                    break L7;
                  }
                }
                L8: {
                  if ((ch.field_b & 64 ^ -1) < -1) {
                    mc.field_b.a("SHOW EXIT", 32, var1, 16777215, 0);
                    var1 += 16;
                    var4 = bo.field_d + 160 + 64;
                    wm.field_H[15].c(328, 16 + var4, 216, 32);
                    int discarded$57 = mc.field_b.a("Cancel", 328, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return;
              }
            } else {
              L9: {
                int discarded$58 = mc.field_b.a(p.field_j, var6, 64 + var4, var7, 80, 16777215, 0, 1, 1, mc.field_b.field_C);
                var4 = -mc.field_b.field_C - 32 + (64 + (128 + (bo.field_d + 32)));
                int discarded$59 = mc.field_b.a("Orb coins to purchase", var6 + 32 - -32, var4, var7 - 80, 32 + mc.field_b.field_C, 16777215, 0, 1, 1, mc.field_b.field_C);
                ih.field_e.c(var6 + 16, -16 + mc.field_b.field_C / 2 + var4 + 16);
                int discarded$60 = mc.field_b.a(Integer.toString(cb.field_f), var6 - -16, 16 + (mc.field_b.field_C / 2 + (var4 + -16)), 32, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                if (-1 <= (ch.field_b & 2 ^ -1)) {
                  break L9;
                } else {
                  mc.field_b.a("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
                  var1 += 16;
                  var4 = 64 + (128 + bo.field_d + 32);
                  wm.field_H[6].c(var2 + 16, var4 - -16, 216, 32);
                  int discarded$61 = mc.field_b.a("Purchase", var2 - -16, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                  break L9;
                }
              }
              L10: {
                if (-1 <= (ch.field_b & 4 ^ -1)) {
                  break L10;
                } else {
                  mc.field_b.a("SHOW PURCHASE", 32, var1, 16777215, 0);
                  var1 += 16;
                  var4 = 64 + (32 + bo.field_d) - -128;
                  wm.field_H[15].c(var2 - -16, 16 + var4, 216, 32);
                  int discarded$62 = mc.field_b.a("Purchase", var2 - -16, 16 + var4, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                  break L10;
                }
              }
              L11: {
                if (0 >= (ch.field_b & 8)) {
                  break L11;
                } else {
                  mc.field_b.a("SHOW CONFIRM", 32, var1, 16777215, 0);
                  var1 += 16;
                  var4 = bo.field_d + 32 + 192;
                  var5 = 100;
                  wm.field_H[15].c(var2 + 16, 16 + var4, var5, 32);
                  int discarded$63 = mc.field_b.a("Yes", var2 + 16, var4 - -16, var5, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                  wm.field_H[15].c(240 + var2 + 16 - (24 - -var5), 16 + var4, var5, 32);
                  int discarded$64 = mc.field_b.a("No", -var5 + (-8 + (var2 + 240)), var4 - -16, var5, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                  break L11;
                }
              }
              L12: {
                if ((ch.field_b & 16) <= 0) {
                  break L12;
                } else {
                  mc.field_b.a("SHOW WAIT", 32, var1, 16777215, 0);
                  var1 += 16;
                  var4 = 128 + (bo.field_d - -32) + 64;
                  wm.field_H[6].c(328, var4 - -16, 216, 32);
                  int discarded$65 = mc.field_b.a("Cancel", 328, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                  int discarded$66 = mc.field_b.a("Please wait for confirmation of your purchase.", 16 + var2, var4, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
                  break L12;
                }
              }
              L13: {
                if (param0 == 2341) {
                  break L13;
                } else {
                  pb.a(-26);
                  break L13;
                }
              }
              L14: {
                if ((ch.field_b & 32 ^ -1) >= -1) {
                  break L14;
                } else {
                  mc.field_b.a("SHOW COMPLETE", 32, var1, 16777215, 0);
                  var1 += 16;
                  var4 = 64 + (128 + bo.field_d) - -32;
                  int discarded$67 = mc.field_b.a("Purchase completed.", 16 + var2, var4, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
                  break L14;
                }
              }
              L15: {
                if ((ch.field_b & 64 ^ -1) < -1) {
                  mc.field_b.a("SHOW EXIT", 32, var1, 16777215, 0);
                  var1 += 16;
                  var4 = bo.field_d + 160 + 64;
                  wm.field_H[15].c(328, 16 + var4, 216, 32);
                  int discarded$68 = mc.field_b.a("Cancel", 328, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                  break L15;
                } else {
                  break L15;
                }
              }
              return;
            }
          } else {
            L16: {
              int discarded$69 = mc.field_b.a("This item is only availiable to members.", var6, 64 + var4, var7, 80, 16777215, 0, 1, 1, mc.field_b.field_C);
              ii.field_d.f(var6 - (-(var7 / 2) + 16), 80 + (var4 - -64));
              if (-1 <= (ch.field_b & 2 ^ -1)) {
                break L16;
              } else {
                mc.field_b.a("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
                var1 += 16;
                var4 = 64 + (128 + bo.field_d + 32);
                wm.field_H[6].c(var2 + 16, var4 - -16, 216, 32);
                int discarded$70 = mc.field_b.a("Purchase", var2 - -16, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                break L16;
              }
            }
            L17: {
              if (-1 <= (ch.field_b & 4 ^ -1)) {
                break L17;
              } else {
                mc.field_b.a("SHOW PURCHASE", 32, var1, 16777215, 0);
                var1 += 16;
                var4 = 64 + (32 + bo.field_d) - -128;
                wm.field_H[15].c(var2 - -16, 16 + var4, 216, 32);
                int discarded$71 = mc.field_b.a("Purchase", var2 - -16, 16 + var4, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                break L17;
              }
            }
            L18: {
              if (0 >= (ch.field_b & 8)) {
                break L18;
              } else {
                mc.field_b.a("SHOW CONFIRM", 32, var1, 16777215, 0);
                var1 += 16;
                var4 = bo.field_d + 32 + 192;
                var5 = 100;
                wm.field_H[15].c(var2 + 16, 16 + var4, var5, 32);
                int discarded$72 = mc.field_b.a("Yes", var2 + 16, var4 - -16, var5, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                wm.field_H[15].c(240 + var2 + 16 - (24 - -var5), 16 + var4, var5, 32);
                int discarded$73 = mc.field_b.a("No", -var5 + (-8 + (var2 + 240)), var4 - -16, var5, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                break L18;
              }
            }
            L19: {
              if ((ch.field_b & 16) <= 0) {
                break L19;
              } else {
                mc.field_b.a("SHOW WAIT", 32, var1, 16777215, 0);
                var1 += 16;
                var4 = 128 + (bo.field_d - -32) + 64;
                wm.field_H[6].c(328, var4 - -16, 216, 32);
                int discarded$74 = mc.field_b.a("Cancel", 328, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                int discarded$75 = mc.field_b.a("Please wait for confirmation of your purchase.", 16 + var2, var4, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
                break L19;
              }
            }
            L20: {
              if (param0 == 2341) {
                break L20;
              } else {
                pb.a(-26);
                break L20;
              }
            }
            L21: {
              if ((ch.field_b & 32 ^ -1) >= -1) {
                break L21;
              } else {
                mc.field_b.a("SHOW COMPLETE", 32, var1, 16777215, 0);
                var1 += 16;
                var4 = 64 + (128 + bo.field_d) - -32;
                int discarded$76 = mc.field_b.a("Purchase completed.", 16 + var2, var4, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
                break L21;
              }
            }
            L22: {
              if ((ch.field_b & 64 ^ -1) < -1) {
                mc.field_b.a("SHOW EXIT", 32, var1, 16777215, 0);
                var1 += 16;
                var4 = bo.field_d + 160 + 64;
                wm.field_H[15].c(328, 16 + var4, 216, 32);
                int discarded$77 = mc.field_b.a("Cancel", 328, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
                break L22;
              } else {
                break L22;
              }
            }
            return;
          }
        } else {
          L23: {
            if (-1 <= (ch.field_b & 2 ^ -1)) {
              break L23;
            } else {
              mc.field_b.a("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
              var1 += 16;
              var4 = 64 + (128 + bo.field_d + 32);
              wm.field_H[6].c(var2 + 16, var4 - -16, 216, 32);
              int discarded$78 = mc.field_b.a("Purchase", var2 - -16, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
              break L23;
            }
          }
          L24: {
            if (-1 <= (ch.field_b & 4 ^ -1)) {
              break L24;
            } else {
              mc.field_b.a("SHOW PURCHASE", 32, var1, 16777215, 0);
              var1 += 16;
              var4 = 64 + (32 + bo.field_d) - -128;
              wm.field_H[15].c(var2 - -16, 16 + var4, 216, 32);
              int discarded$79 = mc.field_b.a("Purchase", var2 - -16, 16 + var4, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
              break L24;
            }
          }
          L25: {
            if (0 >= (ch.field_b & 8)) {
              break L25;
            } else {
              mc.field_b.a("SHOW CONFIRM", 32, var1, 16777215, 0);
              var1 += 16;
              var4 = bo.field_d + 32 + 192;
              var5 = 100;
              wm.field_H[15].c(var2 + 16, 16 + var4, var5, 32);
              int discarded$80 = mc.field_b.a("Yes", var2 + 16, var4 - -16, var5, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
              wm.field_H[15].c(240 + var2 + 16 - (24 - -var5), 16 + var4, var5, 32);
              int discarded$81 = mc.field_b.a("No", -var5 + (-8 + (var2 + 240)), var4 - -16, var5, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
              break L25;
            }
          }
          L26: {
            if ((ch.field_b & 16) <= 0) {
              break L26;
            } else {
              mc.field_b.a("SHOW WAIT", 32, var1, 16777215, 0);
              var1 += 16;
              var4 = 128 + (bo.field_d - -32) + 64;
              wm.field_H[6].c(328, var4 - -16, 216, 32);
              int discarded$82 = mc.field_b.a("Cancel", 328, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
              int discarded$83 = mc.field_b.a("Please wait for confirmation of your purchase.", 16 + var2, var4, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
              break L26;
            }
          }
          L27: {
            if (param0 == 2341) {
              break L27;
            } else {
              pb.a(-26);
              break L27;
            }
          }
          L28: {
            if ((ch.field_b & 32 ^ -1) >= -1) {
              break L28;
            } else {
              mc.field_b.a("SHOW COMPLETE", 32, var1, 16777215, 0);
              var1 += 16;
              var4 = 64 + (128 + bo.field_d) - -32;
              int discarded$84 = mc.field_b.a("Purchase completed.", 16 + var2, var4, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
              break L28;
            }
          }
          L29: {
            if ((ch.field_b & 64 ^ -1) < -1) {
              mc.field_b.a("SHOW EXIT", 32, var1, 16777215, 0);
              var1 += 16;
              var4 = bo.field_d + 160 + 64;
              wm.field_H[15].c(328, 16 + var4, 216, 32);
              int discarded$85 = mc.field_b.a("Cancel", 328, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
              break L29;
            } else {
              break L29;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 < 52) {
            field_h = -34;
            field_i = null;
            field_m = null;
            return;
        }
        field_i = null;
        field_m = null;
    }

    final static void a(int param0, int param1, f param2) {
        ab var3 = null;
        int var4 = 0;
        Object var5 = null;
        ab var6 = null;
        var6 = he.field_e;
        var3 = var6;
        var6.b((byte) -80, param1);
        var6.field_g = var6.field_g + 1;
        if (param0 == 32) {
          var4 = var6.field_g;
          var6.f(1, (byte) -89);
          if (param2.field_k != null) {
            var6.f(param2.field_k.length, (byte) -64);
            var6.a(param2.field_k, 0, (byte) -86, param2.field_k.length);
            int discarded$8 = var6.a(true, var4);
            var6.field_g = var6.field_g - 4;
            param2.field_j = var6.d(-10674);
            var6.b(var6.field_g + -var4, (byte) 43);
            return;
          } else {
            var6.f(0, (byte) -92);
            int discarded$9 = var6.a(true, var4);
            var6.field_g = var6.field_g - 4;
            param2.field_j = var6.d(-10674);
            var6.b(var6.field_g + -var4, (byte) 43);
            return;
          }
        } else {
          var5 = null;
          pb.a(-102, -101, (f) null);
          var4 = var6.field_g;
          var6.f(1, (byte) -89);
          if (param2.field_k != null) {
            var6.f(param2.field_k.length, (byte) -64);
            var6.a(param2.field_k, 0, (byte) -86, param2.field_k.length);
            int discarded$10 = var6.a(true, var4);
            var6.field_g = var6.field_g - 4;
            param2.field_j = var6.d(-10674);
            var6.b(var6.field_g + -var4, (byte) 43);
            return;
          } else {
            var6.f(0, (byte) -92);
            int discarded$11 = var6.a(true, var4);
            var6.field_g = var6.field_g - 4;
            param2.field_j = var6.d(-10674);
            var6.b(var6.field_g + -var4, (byte) 43);
            return;
          }
        }
    }

    pb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new vn();
        field_i = "<%0> is offering an unrated rematch.";
        field_h = 0;
        field_l = "Shields you and your minions up to 5 points per round";
    }
}
