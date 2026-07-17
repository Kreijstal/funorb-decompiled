/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class dd extends oe implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static int[] field_p;
    private java.awt.image.ColorModel field_s;
    static boolean[][][] field_l;
    static String field_o;
    static ka[] field_m;
    static int field_u;
    static String field_r;
    static boolean[] field_n;
    private java.awt.image.ImageConsumer field_k;
    static int[][] field_q;
    static int[] field_t;

    final static ad a(int param0, uj param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ad var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ad stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ad stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var6 = v.a(param5, 0, 0, 80, param1, param3);
            if (null != var6) {
              var7 = new ad();
              var7.field_d = var6;
              java.awt.Component discarded$7 = var7.field_d.add((java.awt.Component) (Object) var7);
              var7.setBounds(0, 0, param3, param5);
              var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
              var7.requestFocus();
              if (param2 >= 80) {
                stackOut_6_0 = (ad) var7;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (ad) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ad) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6_ref;
            stackOut_8_1 = new StringBuilder().append("dd.G(").append(0).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 44 + param3 + 44 + 0 + 44 + param5 + 41);
        }
        return stackIn_7_0;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((dd) this).field_k = param0;
            param0.setDimensions(((dd) this).field_i, ((dd) this).field_h);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((dd) this).field_s);
            param0.setHints(14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("dd.addConsumer(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              kc.field_s[bb.field_c] = param1;
              hi.field_G[bb.field_c] = bb.field_c;
              bg.field_Q[bb.field_c] = param3;
              if (param3 <= ia.field_q) {
                break L1;
              } else {
                v.field_Z = param3;
                break L1;
              }
            }
            L2: {
              if (~param3 > ~ol.field_d) {
                pi.field_e = param3;
                break L2;
              } else {
                break L2;
              }
            }
            rk.field_p[bb.field_c] = param0;
            L3: {
              ea.field_a[bb.field_c] = param5;
              cb.field_e[bb.field_c] = param4;
              var6_int = param4 + (param0 - -param5);
              if (var6_int == 0) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_10_0 = param0 * 1000 / var6_int;
                stackIn_13_0 = stackOut_10_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_13_0;
              bj.field_b[bb.field_c] = var7;
              if (~var7 <= ~pi.field_e) {
                break L4;
              } else {
                pi.field_e = var7;
                break L4;
              }
            }
            L5: {
              bb.field_c = bb.field_c + 1;
              if (~v.field_Z > ~var7) {
                v.field_Z = var7;
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var6, "dd.B(" + param0 + 44 + param1 + 44 + 27715 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -19275) {
                break L1;
              } else {
                this.e(45);
                break L1;
              }
            }
            this.e(98);
            boolean discarded$2 = param3.drawImage(((dd) this).field_e, param1, param2, (java.awt.image.ImageObserver) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("dd.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            ((dd) this).field_h = param2;
            ((dd) this).field_c = new int[param0 * param2 - -1];
            ((dd) this).field_i = param0;
            ((dd) this).field_s = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((dd) this).field_e = param1.createImage((java.awt.image.ImageProducer) this);
            this.e(91);
            boolean discarded$13 = param1.prepareImage(((dd) this).field_e, (java.awt.image.ImageObserver) this);
            this.e(98);
            boolean discarded$14 = param1.prepareImage(((dd) this).field_e, (java.awt.image.ImageObserver) this);
            this.e(94);
            boolean discarded$15 = param1.prepareImage(((dd) this).field_e, (java.awt.image.ImageObserver) this);
            if (param3 == -23435) {
              ((dd) this).a(127);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("dd.A(").append(param0).append(44);
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((dd) this).field_k == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("dd.imageUpdate(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final static void c(int param0) {
        try {
            RuntimeException var1 = null;
            int var1_int = 0;
            Object var2 = null;
            byte[] var2_array = null;
            int var3 = 0;
            Exception var4_ref_Exception = null;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_5_0 = 0;
            var6 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  L2: {
                    if (d.p(-87)) {
                      break L2;
                    } else {
                      if (ee.field_o > 0) {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_5_0 = 1;
                  stackIn_8_0 = stackOut_5_0;
                  break L1;
                }
                L3: {
                  L4: {
                    var1_int = stackIn_8_0;
                    eb.field_n = false;
                    n.field_kb = null;
                    vk.field_i = null;
                    hk.field_b = false;
                    var3 = 124 % ((param0 - 72) / 47);
                    int discarded$4 = 71;
                    bj.a();
                    if (gh.field_x) {
                      break L4;
                    } else {
                      if (gh.field_x) {
                        break L3;
                      } else {
                        if ((1 + ea.field_e) % 2 != 0) {
                          break L3;
                        } else {
                          gh.field_x = true;
                          if (var6 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  gh.field_x = false;
                  ea.field_e = (-6 + ea.field_e - -1 << 1) - 1;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (ea.field_e < 1) {
                      break L3;
                    } else {
                      int discarded$5 = -17;
                      bb.a(var1_int != 0);
                      break L3;
                    }
                  }
                }
                L5: {
                  L6: {
                    if (gh.field_x) {
                      break L6;
                    } else {
                      ea.field_e = ea.field_e + 1;
                      var4 = ea.field_e;
                      var5 = 32 + ea.field_e * 4;
                      ba.field_i = new ra(var5, var4);
                      if (var6 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ea.field_e = 6 - -(ea.field_e + 1 >> 1) + -1;
                  var4 = -1 + (-6 + (ea.field_e + 1) << 1);
                  var5 = 32;
                  ba.field_i = new ra(var5, var4);
                  break L5;
                }
                L7: {
                  if (wi.field_a == null) {
                    lb.d((byte) -77);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (null != fj.field_m) {
                    break L8;
                  } else {
                    int discarded$6 = -7668;
                    uf.c();
                    break L8;
                  }
                }
                L9: {
                  if (null == pa.field_z) {
                    jf.m(96);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (lj.field_j == null) {
                    hl.a((byte) 50);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var2_array = je.field_c[ea.field_e];
                  if (null != je.field_c[ea.field_e]) {
                    break L11;
                  } else {
                    try {
                      L12: {
                        var4 = var2_array.length;
                        i.a(var2_array, (byte) 108, var4, new File(cg.field_c[ea.field_e]));
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L13: {
                        var4_ref_Exception = (Exception) (Object) decompiledCaughtException;
                        System.out.println((Object) (Object) var4_ref_Exception);
                        break L13;
                      }
                    }
                    je.field_c[ea.field_e] = var2_array;
                    break L11;
                  }
                }
                L14: {
                  L15: {
                    if (null == je.field_c[ea.field_e]) {
                      break L15;
                    } else {
                      L16: {
                        if (!gh.field_x) {
                          break L16;
                        } else {
                          mf.a(true, var2_array, 24233, true);
                          if (var6 == 0) {
                            break L14;
                          } else {
                            break L16;
                          }
                        }
                      }
                      mf.a(false, var2_array, 24233, true);
                      if (var6 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L17: {
                    L18: {
                      if (gh.field_x) {
                        break L18;
                      } else {
                        var4 = ea.field_e;
                        var5 = 32 + ea.field_e * 4;
                        ba.field_i = new ra(var5, var4);
                        if (var6 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    var4 = (1 + (ea.field_e - 6) << 1) - 1;
                    var5 = 32;
                    ba.field_i = new ra(var5, var4);
                    break L17;
                  }
                  L19: {
                    if (null == wi.field_a) {
                      lb.d((byte) -112);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (null == fj.field_m) {
                      int discarded$7 = -7668;
                      uf.c();
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (pa.field_z != null) {
                      break L21;
                    } else {
                      jf.m(106);
                      break L21;
                    }
                  }
                  L22: {
                    if (lj.field_j == null) {
                      hl.a((byte) 50);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  ol.field_g = ba.field_i;
                  ea.field_g = null;
                  break L14;
                }
                L23: {
                  L24: {
                    df.field_O = true;
                    if (!gh.field_x) {
                      break L24;
                    } else {
                      ug.field_o = 1;
                      if (var6 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  ug.field_o = 0;
                  break L23;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw oj.a((Throwable) (Object) var1, "dd.D(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_q = null;
            field_o = null;
            field_r = null;
            field_n = null;
            field_l = null;
            field_p = null;
            field_t = null;
            field_m = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "dd.F(" + 15752 + 41);
        }
    }

    private final synchronized void e(int param0) {
        if (param0 < 80) {
            return;
        }
        if (!(null != ((dd) this).field_k)) {
            return;
        }
        try {
            ((dd) this).field_k.setPixels(0, 0, ((dd) this).field_i, ((dd) this).field_h, ((dd) this).field_s, ((dd) this).field_c, 0, ((dd) this).field_i);
            ((dd) this).field_k.imageComplete(2);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "dd.E(" + param0 + 41);
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((dd) this).addConsumer(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("dd.startProduction(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == ((dd) this).field_k) {
                ((dd) this).field_k = null;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("dd.removeConsumer(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    dd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        field_p = new int[98304];
        var0 = 92682;
        L0: while (true) {
          if (var0 < 46341) {
            field_l = new boolean[][][]{new boolean[7][], new boolean[7][], new boolean[7][]};
            field_r = "Members' Benefits";
            field_n = new boolean[]{true, true, true, true, true, true, true, true, true, false, false, false, false, false};
            field_o = "Menu";
            field_q = new int[][]{new int[2], new int[2]};
            return;
          } else {
            L1: {
              var4 = (long)((var0 << 1) - 1);
              var6 = (long)((var0 << 1) - -1);
              var2 = (int)(-32768L + (var4 * var4 >> 18));
              var3 = (int)(-32768L + (var6 * var6 >> 18));
              if (~var3 <= ~field_p.length) {
                var3 = field_p.length + -1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var2 < 0) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_7_0 = var2;
                stackIn_10_0 = stackOut_7_0;
                break L2;
              }
            }
            var1 = stackIn_10_0;
            L3: while (true) {
              if (~var3 > ~var1) {
                var0--;
                continue L0;
              } else {
                field_p[var1] = var0;
                var1++;
                continue L3;
              }
            }
          }
        }
    }
}
