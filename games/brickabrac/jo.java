/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jo extends nb implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_k;
    static String field_h;
    private java.awt.image.ColorModel field_i;
    static String field_j;
    private java.awt.image.ImageConsumer field_l;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((jo) this).field_l == param0) {
            ((jo) this).field_l = null;
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_k = null;
        if (param0 != 11) {
            field_k = null;
        }
        field_h = null;
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        this.c(0);
        boolean discarded$9 = param3.drawImage(((jo) this).field_c, param1, param0, (java.awt.image.ImageObserver) this);
        if (param2 != -17260) {
            Object var6 = null;
            ((jo) this).a((java.awt.Component) null, 25, false, -96);
        }
    }

    final void a(java.awt.Component param0, int param1, boolean param2, int param3) {
        ((jo) this).field_f = param1;
        ((jo) this).field_d = new int[1 + param1 * param3];
        ((jo) this).field_g = param3;
        ((jo) this).field_i = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((jo) this).field_c = param0.createImage((java.awt.image.ImageProducer) this);
        this.c(0);
        boolean discarded$0 = param0.prepareImage(((jo) this).field_c, (java.awt.image.ImageObserver) this);
        this.c(0);
        boolean discarded$8 = param0.prepareImage(((jo) this).field_c, (java.awt.image.ImageObserver) this);
        if (!param2) {
            return;
        }
        this.c(0);
        boolean discarded$9 = param0.prepareImage(((jo) this).field_c, (java.awt.image.ImageObserver) this);
        ((jo) this).a((byte) 100);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((jo) this).field_l == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((jo) this).field_l = param0;
        param0.setDimensions(((jo) this).field_g, ((jo) this).field_f);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((jo) this).field_i);
        param0.setHints(14);
    }

    private final synchronized void c(int param0) {
        if (!(((jo) this).field_l != null)) {
            return;
        }
        ((jo) this).field_l.setPixels(0, 0, ((jo) this).field_g, ((jo) this).field_f, ((jo) this).field_i, ((jo) this).field_d, param0, ((jo) this).field_g);
        ((jo) this).field_l.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((jo) this).addConsumer(param0);
    }

    final static void a(int param0, j param1, int param2, ak param3, int param4, int param5, int param6) {
        jp var16_ref = null;
        int var7 = 0;
        int var8 = 0;
        jp var10 = null;
        int var11 = 0;
        int var12 = 0;
        vl var13 = null;
        on var14 = null;
        int var15 = 0;
        jp var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[] var24 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        jp stackIn_17_0 = null;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_70_0 = 0;
        int stackOut_4_0;
        int stackOut_3_0;
        int stackOut_11_0;
        int stackOut_13_0;
        int stackOut_13_1;
        int stackOut_12_0;
        int stackOut_12_1;
        jp stackOut_16_0;
        jp stackOut_15_0;
        int stackOut_32_0;
        int stackOut_32_1;
        int stackOut_34_0;
        int stackOut_34_1;
        int stackOut_34_2;
        int stackOut_33_0;
        int stackOut_33_1;
        int stackOut_33_2;
        int stackOut_69_0;
        int stackOut_68_0;
        var16_ref = null;
        L0: {
          var20 = BrickABrac.field_J ? 1 : 0;
          var7 = 0;
          if (param5 == 30) {
            break L0;
          } else {
            jo.b(42);
            break L0;
          }
        }
        L1: {
          var8 = 0;
          var24 = new int[4];
          lb.a(var24);
          var10 = new jp(nj.field_l[0].field_x, nj.field_l[0].field_z);
          var10.g();
          nj.field_l[24].c(0, 0, ul.a(255, param1.field_F % 360 << 926134888));
          kc.field_q.a((byte) 105);
          lb.b(var24);
          if ((1 << param2 & (param3.field_a | (param3.field_i | param3.field_g))) != 0) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        var11 = stackIn_5_0;
        var12 = 0;
        L2: while (true) {
          if (var12 >= param1.field_z.length) {
            return;
          } else {
            var13 = param1.field_z[var12];
            var14 = (on) (Object) var13.d(-105);
            L3: while (true) {
              if (var14 == null) {
                var12++;
                continue L2;
              } else {
                if ((1 & var14.field_N) == 0) {
                  L4: {
                    var8 = param6 - -((var14.field_m >> 460994568) / param0);
                    var7 = (var14.field_j >> -1100158744) / param0 + param4;
                    stackOut_11_0 = var14.field_i;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (-1 != (var14.field_N & 2 ^ -1)) {
                      stackOut_13_0 = stackIn_13_0;
                      stackOut_13_1 = 29;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      break L4;
                    } else {
                      stackOut_12_0 = stackIn_12_0;
                      stackOut_12_1 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      break L4;
                    }
                  }
                  L5: {
                    var15 = stackIn_14_0 + stackIn_14_1;
                    if (var15 != 24) {
                      stackOut_16_0 = nj.field_l[var15];
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = (jp) var10;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var16_ref = (jp) (Object) stackIn_17_0;
                    if (var14.field_R < 0) {
                      L7: {
                        if (-2 == (param3.field_k ^ -1)) {
                          break L7;
                        } else {
                          if (var11 == 0) {
                            if ((param1.field_U ^ -1) <= -51) {
                              break L6;
                            } else {
                              var16_ref.b(var7, var8, (-(256 * param1.field_U) + 12800) / 50);
                              var14 = (on) (Object) var13.a((byte) 116);
                              continue L3;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      var16_ref.c(var7, var8);
                      if (!r.field_A) {
                        break L6;
                      } else {
                        if (!ka.a((byte) 89)) {
                          break L6;
                        } else {
                          if (4 == ga.field_i) {
                            if ((2 & var14.field_N) == 0) {
                              break L6;
                            } else {
                              var17 = de.field_x - mn.field_v;
                              var16_ref.f(var7, var8, 64 + (sa.a(200 * var17, param5 ^ -4127) >> -91385206));
                              var14 = (on) (Object) var13.a((byte) 116);
                              continue L3;
                            }
                          } else {
                            var14 = (on) (Object) var13.a((byte) 116);
                            continue L3;
                          }
                        }
                      }
                    } else {
                      L8: {
                        var17 = var14.field_B;
                        var18 = -(var14.field_l * 16) + 256;
                        if (var11 == 0) {
                          L9: {
                            var19 = var14.field_l + param1.field_U;
                            stackOut_32_0 = 256;
                            stackOut_32_1 = 16;
                            stackIn_34_0 = stackOut_32_0;
                            stackIn_34_1 = stackOut_32_1;
                            stackIn_33_0 = stackOut_32_0;
                            stackIn_33_1 = stackOut_32_1;
                            if (16 >= var19) {
                              stackOut_34_0 = stackIn_34_0;
                              stackOut_34_1 = stackIn_34_1;
                              stackOut_34_2 = var19;
                              stackIn_35_0 = stackOut_34_0;
                              stackIn_35_1 = stackOut_34_1;
                              stackIn_35_2 = stackOut_34_2;
                              break L9;
                            } else {
                              stackOut_33_0 = stackIn_33_0;
                              stackOut_33_1 = stackIn_33_1;
                              stackOut_33_2 = 16;
                              stackIn_35_0 = stackOut_33_0;
                              stackIn_35_1 = stackOut_33_1;
                              stackIn_35_2 = stackOut_33_2;
                              break L9;
                            }
                          }
                          var18 = stackIn_35_0 + -(stackIn_35_1 * stackIn_35_2);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L10: {
                        if (var17 != 12) {
                          if (0 == var17) {
                            var16_ref.b(var7, var8, var18);
                            break L10;
                          } else {
                            if (-6 == (var17 ^ -1)) {
                              var16_ref.b(var7, var8, -var18 + 256);
                              break L10;
                            } else {
                              if (var17 != 11) {
                                if (var17 == -3) {
                                  var19 = -(2 * var14.field_l) + 34;
                                  var16_ref.a(var14.field_l / param0 + var7, var8, var19 / param0, var16_ref.field_z);
                                  break L10;
                                } else {
                                  if (-11 != var17) {
                                    if (var17 != 6) {
                                      if (-8 != (var17 ^ -1)) {
                                        if (var17 != 8) {
                                          if (var17 == 9) {
                                            var16_ref.b(var7, var8, var16_ref.field_x, var16_ref.field_z, -(var14.field_l * 4) + 64);
                                            lb.e(var7, var8, var7 + (var16_ref.field_x - var14.field_l * 2 / param0), var16_ref.field_z + var8);
                                            var16_ref.c(var7, var8);
                                            break L10;
                                          } else {
                                            if (var17 != 1) {
                                              if ((var17 ^ -1) != -4) {
                                                if (var17 == -5) {
                                                  var19 = 16 + -var14.field_l;
                                                  var16_ref.a(var7, var8 - -(var14.field_l / (param0 * 2)), 34 / param0, var19 / param0);
                                                  break L10;
                                                } else {
                                                  if (-15 == var17) {
                                                    L11: {
                                                      if ((2 * var14.field_l ^ -1) >= -9) {
                                                        stackOut_69_0 = 2 * var14.field_l;
                                                        stackIn_70_0 = stackOut_69_0;
                                                        break L11;
                                                      } else {
                                                        stackOut_68_0 = 8;
                                                        stackIn_70_0 = stackOut_68_0;
                                                        break L11;
                                                      }
                                                    }
                                                    L12: {
                                                      var19 = stackIn_70_0;
                                                      var19 = var14.field_l + -var19;
                                                      if (var19 > 0) {
                                                        var19 = 0;
                                                        break L12;
                                                      } else {
                                                        break L12;
                                                      }
                                                    }
                                                    var16_ref.a(var7 - -(var19 / param0), var19 / param0 + var8, var16_ref.field_x - 2 * var19 / param0, -(var19 * 2 / param0) + var16_ref.field_z);
                                                    break L10;
                                                  } else {
                                                    lb.b(var24);
                                                    var14 = (on) (Object) var13.a((byte) 116);
                                                    continue L3;
                                                  }
                                                }
                                              } else {
                                                lb.e(-(var14.field_l / param0) + var7, -(var14.field_l / param0) + var8, var16_ref.field_x / 2 + -(var14.field_l / param0) + var7, var16_ref.field_z / 2 + var8 - var14.field_l / param0);
                                                var16_ref.b(-(var14.field_l / param0) + var7, -(var14.field_l / param0) + var8, var18);
                                                lb.e(var16_ref.field_x / 2 + var14.field_l / param0 + var7, var8 - var14.field_l / param0, var14.field_l / param0 + (var7 + var16_ref.field_x), -(var14.field_l / param0) + var8 - -(var16_ref.field_z / 2));
                                                var16_ref.b(var14.field_l / param0 + var7, var8 - var14.field_l / param0, var18);
                                                lb.e(-(var14.field_l / param0) + var7, var14.field_l / param0 + (var8 + var16_ref.field_z / 2), -(var14.field_l / param0) + var7 - -(var16_ref.field_x / 2), var16_ref.field_z + var8 + var14.field_l / param0);
                                                var16_ref.b(var7 - var14.field_l / param0, var14.field_l / param0 + var8, var18);
                                                lb.e(var16_ref.field_x / 2 + var14.field_l / param0 + var7, var14.field_l / param0 + var8 + var16_ref.field_z / 2, var7 - -(var14.field_l / param0) + var16_ref.field_x, var8 - -(var14.field_l / param0) + var16_ref.field_z);
                                                var16_ref.b(var7 + var14.field_l / param0, var8 + var14.field_l / param0, var18);
                                                break L10;
                                              }
                                            } else {
                                              var19 = var14.field_l - 6;
                                              var16_ref.b(var7 - -(var19 / param0), var19 / param0 + var8, -(var19 * 2 / param0) + var16_ref.field_x, var16_ref.field_z - var19 * 2 / param0, var18);
                                              break L10;
                                            }
                                          }
                                        } else {
                                          var16_ref.b(var7, var8, var16_ref.field_x, var16_ref.field_z, -(var14.field_l * 4) + 64);
                                          lb.e(var7 - -(var14.field_l * 2 / param0), var8, var7 - -var16_ref.field_x, var16_ref.field_z + var8);
                                          var16_ref.c(var7, var8);
                                          break L10;
                                        }
                                      } else {
                                        var16_ref.b(var7, var8, var16_ref.field_x, var16_ref.field_z, -(4 * var14.field_l) + 64);
                                        lb.e(var7, var8, var7 - -var16_ref.field_x, var8 + (var16_ref.field_z - var14.field_l / param0));
                                        var16_ref.c(var7, var8);
                                        break L10;
                                      }
                                    } else {
                                      var16_ref.b(var7, var8, var16_ref.field_x, var16_ref.field_z, -(4 * var14.field_l) + 64);
                                      lb.e(var7, var14.field_l / param0 + var8, var16_ref.field_x + var7, var8 + var16_ref.field_z);
                                      var16_ref.c(var7, var8);
                                      break L10;
                                    }
                                  } else {
                                    if (-9 < (var14.field_l ^ -1)) {
                                      var19 = 34 + -(var14.field_l * 4);
                                      var16_ref.a(var14.field_l * 2 / param0 + var7, var8, var19 / param0, var16_ref.field_z);
                                      break L10;
                                    } else {
                                      var19 = -26 + var14.field_l * 4;
                                      nj.field_l[var14.field_R].a((-(2 * var14.field_l) + 30) / param0 + var7, var8, var19 / param0, var16_ref.field_z);
                                      break L10;
                                    }
                                  }
                                }
                              } else {
                                nj.field_l[var14.field_R].c(var7, var8);
                                var16_ref.b(var7, var8, var18);
                                break L10;
                              }
                            }
                          }
                        } else {
                          var16_ref.c(var7, var8);
                          lb.e(var7, var8, var7 + var16_ref.field_x, var16_ref.field_z + var8);
                          var19 = 0;
                          L13: while (true) {
                            if (-11 >= (var19 ^ -1)) {
                              break L10;
                            } else {
                              L14: {
                                if (var19 <= 5) {
                                  break L14;
                                } else {
                                  if ((var19 ^ -1) <= -9) {
                                    break L14;
                                  } else {
                                    var19++;
                                    continue L13;
                                  }
                                }
                              }
                              lb.f(var7 + (var19 + var14.field_l * 2), var8 + var16_ref.field_z, 10 + var7 - -var19 - -(2 * var14.field_l), var8, 16777215, var18);
                              var19++;
                              continue L13;
                            }
                          }
                        }
                      }
                      lb.b(var24);
                      break L6;
                    }
                  }
                  var14 = (on) (Object) var13.a((byte) 116);
                  continue L3;
                } else {
                  var14 = (on) (Object) var13.a((byte) 116);
                  continue L3;
                }
              }
            }
          }
        }
    }

    jo() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Mouse over an icon for details";
        field_k = "The '<%0>' setting needs to be changed.";
    }
}
