/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.Class;

final class i extends ha implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_o;
    private java.awt.image.ImageConsumer field_p;
    static bb field_n;
    static int field_l;
    static String field_m;

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((i) this).field_p = param0;
            param0.setDimensions(((i) this).field_a, ((i) this).field_i);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((i) this).field_o);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "i.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -640) {
                break L1;
              } else {
                var3 = null;
                boolean discarded$2 = i.a(54, (String) null);
                break L1;
              }
            }
            L2: {
              if (fh.a(param1, -99) == null) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("i.F(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final void a(java.awt.Graphics param0, boolean param1, int param2, int param3) {
        try {
            this.b(param1);
            boolean discarded$0 = param0.drawImage(((i) this).field_d, param3, param2, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "i.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final synchronized void b(boolean param0) {
        if (null == ((i) this).field_p) {
          return;
        } else {
          if (param0) {
            field_l = 110;
            ((i) this).field_p.setPixels(0, 0, ((i) this).field_a, ((i) this).field_i, ((i) this).field_o, ((i) this).field_e, 0, ((i) this).field_a);
            ((i) this).field_p.imageComplete(2);
            return;
          } else {
            ((i) this).field_p.setPixels(0, 0, ((i) this).field_a, ((i) this).field_i, ((i) this).field_o, ((i) this).field_e, 0, ((i) this).field_a);
            ((i) this).field_p.imageComplete(2);
            return;
          }
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((i) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "i.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_2_1 = new StringBuilder().append("i.imageUpdate(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, java.awt.Component param1, int param2, byte param3) {
        try {
            ((i) this).field_i = param2;
            ((i) this).field_a = param0;
            ((i) this).field_e = new int[1 + param0 * param2];
            ((i) this).field_o = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((i) this).field_d = param1.createImage((java.awt.image.ImageProducer) this);
            this.b(false);
            boolean discarded$6 = param1.prepareImage(((i) this).field_d, (java.awt.image.ImageObserver) this);
            if (param3 > -51) {
                i.a(-29, true, false, false, true, 57, -40, true, -122, -23);
            }
            this.b(false);
            boolean discarded$7 = param1.prepareImage(((i) this).field_d, (java.awt.image.ImageObserver) this);
            this.b(false);
            boolean discarded$8 = param1.prepareImage(((i) this).field_d, (java.awt.image.ImageObserver) this);
            ((i) this).a(19692);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "i.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((i) this).field_p;
    }

    i() {
    }

    public static void c(int param0) {
        field_m = null;
        field_n = null;
        if (param0 >= -19) {
            field_l = -71;
        }
    }

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_11_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        Class stackIn_31_0 = null;
        Class stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_6_0 = null;
        Class stackOut_10_0 = null;
        Class stackOut_14_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_27_0 = null;
        Class stackOut_32_0 = null;
        Class stackOut_30_0 = null;
        Class stackOut_17_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        try {
          L0: {
            if (param0.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param0.equals((Object) (Object) "I")) {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0.equals((Object) (Object) "S")) {
                  stackOut_10_0 = Short.TYPE;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  if (param0.equals((Object) (Object) "J")) {
                    stackOut_14_0 = Long.TYPE;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    if (!param0.equals((Object) (Object) "Z")) {
                      L1: {
                        if (param1 < -66) {
                          break L1;
                        } else {
                          i.c(49);
                          break L1;
                        }
                      }
                      if (param0.equals((Object) (Object) "F")) {
                        stackOut_23_0 = Float.TYPE;
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0;
                      } else {
                        if (param0.equals((Object) (Object) "D")) {
                          stackOut_27_0 = Double.TYPE;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0;
                        } else {
                          if (!param0.equals((Object) (Object) "C")) {
                            stackOut_32_0 = Class.forName(param0);
                            stackIn_33_0 = stackOut_32_0;
                            break L0;
                          } else {
                            stackOut_30_0 = Character.TYPE;
                            stackIn_31_0 = stackOut_30_0;
                            return stackIn_31_0;
                          }
                        }
                      }
                    } else {
                      stackOut_17_0 = Boolean.TYPE;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var2;
            stackOut_34_1 = new StringBuilder().append("i.E(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L2;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param1 + 41);
        }
        return stackIn_33_0;
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3, boolean param4, int param5, int param6, boolean param7, int param8, int param9) {
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        if (!param4) {
          L0: {
            if (ni.field_q != t.field_j) {
              break L0;
            } else {
              if (t.field_d != wg.field_b) {
                break L0;
              } else {
                if (param4) {
                  L1: {
                    ho.field_c = le.field_c;
                    pj.a((byte) 111, param4);
                    if (param6 == -28362) {
                      break L1;
                    } else {
                      field_m = null;
                      break L1;
                    }
                  }
                  L2: {
                    if (0 >= oo.field_b) {
                      break L2;
                    } else {
                      jh.a(2, param0, param7, param4);
                      break L2;
                    }
                  }
                  L3: {
                    nk.field_e.field_Bb = 1;
                    nk.field_e.field_C = kj.field_l.field_C;
                    if (vn.field_g <= 0) {
                      break L3;
                    } else {
                      ic.a(param0, param7, 3, param4);
                      break L3;
                    }
                  }
                  L4: {
                    if (h.field_W > 0) {
                      no.a(param1, param6 + 28363, param0, param4, param7);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (!bm.field_o) {
                        break L6;
                      } else {
                        if (io.field_c.field_ec > io.field_c.field_mc) {
                          break L6;
                        } else {
                          jm.field_b.field_Ib.field_cb = fo.field_m;
                          oc.field_O.field_rb = false;
                          int discarded$14 = 0;
                          wd.a(jm.field_b.field_Fb);
                          break L5;
                        }
                      }
                    }
                    oc.field_O.field_rb = true;
                    jm.field_b.field_Ib.field_cb = null;
                    la.a(70, param0, jm.field_b, param8, param3);
                    break L5;
                  }
                  Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                  la.a(58, param0, ae.field_c, param8, param3);
                  rb.field_o = rb.field_o + 1;
                  return;
                } else {
                  ho.field_c = (-640 + ni.field_q) / 2;
                  pj.a((byte) 111, param4);
                  if (param6 == -28362) {
                    if (0 >= oo.field_b) {
                      nk.field_e.field_Bb = 1;
                      nk.field_e.field_C = kj.field_l.field_C;
                      if (vn.field_g <= 0) {
                        L7: {
                          if (h.field_W > 0) {
                            no.a(param1, param6 + 28363, param0, param4, param7);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (bm.field_o) {
                          if (io.field_c.field_ec <= io.field_c.field_mc) {
                            jm.field_b.field_Ib.field_cb = fo.field_m;
                            oc.field_O.field_rb = false;
                            int discarded$15 = 0;
                            wd.a(jm.field_b.field_Fb);
                            Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                            la.a(58, param0, ae.field_c, param8, param3);
                            rb.field_o = rb.field_o + 1;
                            return;
                          } else {
                            oc.field_O.field_rb = true;
                            jm.field_b.field_Ib.field_cb = null;
                            la.a(70, param0, jm.field_b, param8, param3);
                            Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                            la.a(58, param0, ae.field_c, param8, param3);
                            rb.field_o = rb.field_o + 1;
                            return;
                          }
                        } else {
                          oc.field_O.field_rb = true;
                          jm.field_b.field_Ib.field_cb = null;
                          la.a(70, param0, jm.field_b, param8, param3);
                          Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                          la.a(58, param0, ae.field_c, param8, param3);
                          rb.field_o = rb.field_o + 1;
                          return;
                        }
                      } else {
                        L8: {
                          ic.a(param0, param7, 3, param4);
                          if (h.field_W > 0) {
                            no.a(param1, param6 + 28363, param0, param4, param7);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          L10: {
                            if (!bm.field_o) {
                              break L10;
                            } else {
                              if (io.field_c.field_ec > io.field_c.field_mc) {
                                break L10;
                              } else {
                                jm.field_b.field_Ib.field_cb = fo.field_m;
                                oc.field_O.field_rb = false;
                                int discarded$16 = 0;
                                wd.a(jm.field_b.field_Fb);
                                break L9;
                              }
                            }
                          }
                          oc.field_O.field_rb = true;
                          jm.field_b.field_Ib.field_cb = null;
                          la.a(70, param0, jm.field_b, param8, param3);
                          break L9;
                        }
                        Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                        la.a(58, param0, ae.field_c, param8, param3);
                        rb.field_o = rb.field_o + 1;
                        return;
                      }
                    } else {
                      L11: {
                        jh.a(2, param0, param7, param4);
                        nk.field_e.field_Bb = 1;
                        nk.field_e.field_C = kj.field_l.field_C;
                        if (vn.field_g <= 0) {
                          break L11;
                        } else {
                          ic.a(param0, param7, 3, param4);
                          break L11;
                        }
                      }
                      L12: {
                        if (h.field_W > 0) {
                          no.a(param1, param6 + 28363, param0, param4, param7);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        L14: {
                          if (!bm.field_o) {
                            break L14;
                          } else {
                            if (io.field_c.field_ec > io.field_c.field_mc) {
                              break L14;
                            } else {
                              jm.field_b.field_Ib.field_cb = fo.field_m;
                              oc.field_O.field_rb = false;
                              int discarded$17 = 0;
                              wd.a(jm.field_b.field_Fb);
                              break L13;
                            }
                          }
                        }
                        oc.field_O.field_rb = true;
                        jm.field_b.field_Ib.field_cb = null;
                        la.a(70, param0, jm.field_b, param8, param3);
                        break L13;
                      }
                      Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                      la.a(58, param0, ae.field_c, param8, param3);
                      rb.field_o = rb.field_o + 1;
                      return;
                    }
                  } else {
                    L15: {
                      field_m = null;
                      if (0 >= oo.field_b) {
                        break L15;
                      } else {
                        jh.a(2, param0, param7, param4);
                        break L15;
                      }
                    }
                    L16: {
                      nk.field_e.field_Bb = 1;
                      nk.field_e.field_C = kj.field_l.field_C;
                      if (vn.field_g <= 0) {
                        break L16;
                      } else {
                        ic.a(param0, param7, 3, param4);
                        break L16;
                      }
                    }
                    L17: {
                      if (h.field_W > 0) {
                        no.a(param1, param6 + 28363, param0, param4, param7);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      L19: {
                        if (!bm.field_o) {
                          break L19;
                        } else {
                          if (io.field_c.field_ec > io.field_c.field_mc) {
                            break L19;
                          } else {
                            jm.field_b.field_Ib.field_cb = fo.field_m;
                            oc.field_O.field_rb = false;
                            int discarded$18 = 0;
                            wd.a(jm.field_b.field_Fb);
                            break L18;
                          }
                        }
                      }
                      oc.field_O.field_rb = true;
                      jm.field_b.field_Ib.field_cb = null;
                      la.a(70, param0, jm.field_b, param8, param3);
                      break L18;
                    }
                    Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                    la.a(58, param0, ae.field_c, param8, param3);
                    rb.field_o = rb.field_o + 1;
                    return;
                  }
                }
              }
            }
          }
          L20: {
            if (qa.field_f.field_i != t.field_d) {
              break L20;
            } else {
              if (qa.field_f.field_a != t.field_j) {
                break L20;
              } else {
                if (io.field_c != null) {
                  hn.a((byte) 32, false);
                  break L20;
                } else {
                  if (bn.field_S != null) {
                    hn.a((byte) 32, true);
                    break L20;
                  } else {
                    we.b(false);
                    break L20;
                  }
                }
              }
            }
          }
          if (param4) {
            L21: {
              ho.field_c = le.field_c;
              pj.a((byte) 111, param4);
              if (param6 == -28362) {
                break L21;
              } else {
                field_m = null;
                break L21;
              }
            }
            L22: {
              if (0 >= oo.field_b) {
                break L22;
              } else {
                jh.a(2, param0, param7, param4);
                break L22;
              }
            }
            L23: {
              nk.field_e.field_Bb = 1;
              nk.field_e.field_C = kj.field_l.field_C;
              if (vn.field_g <= 0) {
                break L23;
              } else {
                ic.a(param0, param7, 3, param4);
                break L23;
              }
            }
            L24: {
              if (h.field_W > 0) {
                no.a(param1, param6 + 28363, param0, param4, param7);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              L26: {
                if (!bm.field_o) {
                  break L26;
                } else {
                  if (io.field_c.field_ec > io.field_c.field_mc) {
                    break L26;
                  } else {
                    jm.field_b.field_Ib.field_cb = fo.field_m;
                    oc.field_O.field_rb = false;
                    int discarded$19 = 0;
                    wd.a(jm.field_b.field_Fb);
                    break L25;
                  }
                }
              }
              oc.field_O.field_rb = true;
              jm.field_b.field_Ib.field_cb = null;
              la.a(70, param0, jm.field_b, param8, param3);
              break L25;
            }
            Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
            la.a(58, param0, ae.field_c, param8, param3);
            rb.field_o = rb.field_o + 1;
            return;
          } else {
            ho.field_c = (-640 + ni.field_q) / 2;
            pj.a((byte) 111, param4);
            if (param6 == -28362) {
              L27: {
                if (0 >= oo.field_b) {
                  break L27;
                } else {
                  jh.a(2, param0, param7, param4);
                  break L27;
                }
              }
              nk.field_e.field_Bb = 1;
              nk.field_e.field_C = kj.field_l.field_C;
              if (vn.field_g <= 0) {
                L28: {
                  if (h.field_W > 0) {
                    no.a(param1, param6 + 28363, param0, param4, param7);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                if (bm.field_o) {
                  if (io.field_c.field_ec <= io.field_c.field_mc) {
                    jm.field_b.field_Ib.field_cb = fo.field_m;
                    oc.field_O.field_rb = false;
                    int discarded$20 = 0;
                    wd.a(jm.field_b.field_Fb);
                    Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                    la.a(58, param0, ae.field_c, param8, param3);
                    rb.field_o = rb.field_o + 1;
                    return;
                  } else {
                    oc.field_O.field_rb = true;
                    jm.field_b.field_Ib.field_cb = null;
                    la.a(70, param0, jm.field_b, param8, param3);
                    Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                    la.a(58, param0, ae.field_c, param8, param3);
                    rb.field_o = rb.field_o + 1;
                    return;
                  }
                } else {
                  oc.field_O.field_rb = true;
                  jm.field_b.field_Ib.field_cb = null;
                  la.a(70, param0, jm.field_b, param8, param3);
                  Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                  la.a(58, param0, ae.field_c, param8, param3);
                  rb.field_o = rb.field_o + 1;
                  return;
                }
              } else {
                L29: {
                  ic.a(param0, param7, 3, param4);
                  if (h.field_W > 0) {
                    no.a(param1, param6 + 28363, param0, param4, param7);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  L31: {
                    if (!bm.field_o) {
                      break L31;
                    } else {
                      if (io.field_c.field_ec > io.field_c.field_mc) {
                        break L31;
                      } else {
                        jm.field_b.field_Ib.field_cb = fo.field_m;
                        oc.field_O.field_rb = false;
                        int discarded$21 = 0;
                        wd.a(jm.field_b.field_Fb);
                        break L30;
                      }
                    }
                  }
                  oc.field_O.field_rb = true;
                  jm.field_b.field_Ib.field_cb = null;
                  la.a(70, param0, jm.field_b, param8, param3);
                  break L30;
                }
                Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                la.a(58, param0, ae.field_c, param8, param3);
                rb.field_o = rb.field_o + 1;
                return;
              }
            } else {
              L32: {
                field_m = null;
                if (0 >= oo.field_b) {
                  break L32;
                } else {
                  jh.a(2, param0, param7, param4);
                  break L32;
                }
              }
              L33: {
                nk.field_e.field_Bb = 1;
                nk.field_e.field_C = kj.field_l.field_C;
                if (vn.field_g <= 0) {
                  break L33;
                } else {
                  ic.a(param0, param7, 3, param4);
                  break L33;
                }
              }
              L34: {
                if (h.field_W > 0) {
                  no.a(param1, param6 + 28363, param0, param4, param7);
                  break L34;
                } else {
                  break L34;
                }
              }
              L35: {
                if (!bm.field_o) {
                  break L35;
                } else {
                  if (io.field_c.field_ec > io.field_c.field_mc) {
                    break L35;
                  } else {
                    jm.field_b.field_Ib.field_cb = fo.field_m;
                    oc.field_O.field_rb = false;
                    int discarded$22 = 0;
                    wd.a(jm.field_b.field_Fb);
                    Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                    la.a(58, param0, ae.field_c, param8, param3);
                    rb.field_o = rb.field_o + 1;
                    return;
                  }
                }
              }
              oc.field_O.field_rb = true;
              jm.field_b.field_Ib.field_cb = null;
              la.a(70, param0, jm.field_b, param8, param3);
              Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
              la.a(58, param0, ae.field_c, param8, param3);
              rb.field_o = rb.field_o + 1;
              return;
            }
          }
        } else {
          if (param4) {
            L36: {
              ho.field_c = le.field_c;
              pj.a((byte) 111, param4);
              if (param6 == -28362) {
                break L36;
              } else {
                field_m = null;
                break L36;
              }
            }
            L37: {
              if (0 >= oo.field_b) {
                break L37;
              } else {
                jh.a(2, param0, param7, param4);
                break L37;
              }
            }
            L38: {
              nk.field_e.field_Bb = 1;
              nk.field_e.field_C = kj.field_l.field_C;
              if (vn.field_g <= 0) {
                break L38;
              } else {
                ic.a(param0, param7, 3, param4);
                break L38;
              }
            }
            L39: {
              if (h.field_W > 0) {
                no.a(param1, param6 + 28363, param0, param4, param7);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              L41: {
                if (!bm.field_o) {
                  break L41;
                } else {
                  if (io.field_c.field_ec > io.field_c.field_mc) {
                    break L41;
                  } else {
                    jm.field_b.field_Ib.field_cb = fo.field_m;
                    oc.field_O.field_rb = false;
                    int discarded$23 = 0;
                    wd.a(jm.field_b.field_Fb);
                    break L40;
                  }
                }
              }
              oc.field_O.field_rb = true;
              jm.field_b.field_Ib.field_cb = null;
              la.a(70, param0, jm.field_b, param8, param3);
              break L40;
            }
            Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
            la.a(58, param0, ae.field_c, param8, param3);
            rb.field_o = rb.field_o + 1;
            return;
          } else {
            ho.field_c = (-640 + ni.field_q) / 2;
            pj.a((byte) 111, param4);
            if (param6 == -28362) {
              if (0 >= oo.field_b) {
                nk.field_e.field_Bb = 1;
                nk.field_e.field_C = kj.field_l.field_C;
                if (vn.field_g <= 0) {
                  L42: {
                    if (h.field_W > 0) {
                      no.a(param1, param6 + 28363, param0, param4, param7);
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  if (bm.field_o) {
                    if (io.field_c.field_ec <= io.field_c.field_mc) {
                      jm.field_b.field_Ib.field_cb = fo.field_m;
                      oc.field_O.field_rb = false;
                      int discarded$24 = 0;
                      wd.a(jm.field_b.field_Fb);
                      Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                      la.a(58, param0, ae.field_c, param8, param3);
                      rb.field_o = rb.field_o + 1;
                      return;
                    } else {
                      oc.field_O.field_rb = true;
                      jm.field_b.field_Ib.field_cb = null;
                      la.a(70, param0, jm.field_b, param8, param3);
                      Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                      la.a(58, param0, ae.field_c, param8, param3);
                      rb.field_o = rb.field_o + 1;
                      return;
                    }
                  } else {
                    oc.field_O.field_rb = true;
                    jm.field_b.field_Ib.field_cb = null;
                    la.a(70, param0, jm.field_b, param8, param3);
                    Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                    la.a(58, param0, ae.field_c, param8, param3);
                    rb.field_o = rb.field_o + 1;
                    return;
                  }
                } else {
                  L43: {
                    ic.a(param0, param7, 3, param4);
                    if (h.field_W > 0) {
                      no.a(param1, param6 + 28363, param0, param4, param7);
                      break L43;
                    } else {
                      break L43;
                    }
                  }
                  L44: {
                    L45: {
                      if (!bm.field_o) {
                        break L45;
                      } else {
                        if (io.field_c.field_ec > io.field_c.field_mc) {
                          break L45;
                        } else {
                          jm.field_b.field_Ib.field_cb = fo.field_m;
                          oc.field_O.field_rb = false;
                          int discarded$25 = 0;
                          wd.a(jm.field_b.field_Fb);
                          break L44;
                        }
                      }
                    }
                    oc.field_O.field_rb = true;
                    jm.field_b.field_Ib.field_cb = null;
                    la.a(70, param0, jm.field_b, param8, param3);
                    break L44;
                  }
                  Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                  la.a(58, param0, ae.field_c, param8, param3);
                  rb.field_o = rb.field_o + 1;
                  return;
                }
              } else {
                L46: {
                  jh.a(2, param0, param7, param4);
                  nk.field_e.field_Bb = 1;
                  nk.field_e.field_C = kj.field_l.field_C;
                  if (vn.field_g <= 0) {
                    break L46;
                  } else {
                    ic.a(param0, param7, 3, param4);
                    break L46;
                  }
                }
                L47: {
                  if (h.field_W > 0) {
                    no.a(param1, param6 + 28363, param0, param4, param7);
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  L49: {
                    if (!bm.field_o) {
                      break L49;
                    } else {
                      if (io.field_c.field_ec > io.field_c.field_mc) {
                        break L49;
                      } else {
                        jm.field_b.field_Ib.field_cb = fo.field_m;
                        oc.field_O.field_rb = false;
                        int discarded$26 = 0;
                        wd.a(jm.field_b.field_Fb);
                        break L48;
                      }
                    }
                  }
                  oc.field_O.field_rb = true;
                  jm.field_b.field_Ib.field_cb = null;
                  la.a(70, param0, jm.field_b, param8, param3);
                  break L48;
                }
                Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                la.a(58, param0, ae.field_c, param8, param3);
                rb.field_o = rb.field_o + 1;
                return;
              }
            } else {
              L50: {
                field_m = null;
                if (0 >= oo.field_b) {
                  break L50;
                } else {
                  jh.a(2, param0, param7, param4);
                  break L50;
                }
              }
              L51: {
                nk.field_e.field_Bb = 1;
                nk.field_e.field_C = kj.field_l.field_C;
                if (vn.field_g <= 0) {
                  break L51;
                } else {
                  ic.a(param0, param7, 3, param4);
                  break L51;
                }
              }
              L52: {
                if (h.field_W > 0) {
                  no.a(param1, param6 + 28363, param0, param4, param7);
                  break L52;
                } else {
                  break L52;
                }
              }
              L53: {
                L54: {
                  if (!bm.field_o) {
                    break L54;
                  } else {
                    if (io.field_c.field_ec > io.field_c.field_mc) {
                      break L54;
                    } else {
                      jm.field_b.field_Ib.field_cb = fo.field_m;
                      oc.field_O.field_rb = false;
                      int discarded$27 = 0;
                      wd.a(jm.field_b.field_Fb);
                      break L53;
                    }
                  }
                }
                oc.field_O.field_rb = true;
                jm.field_b.field_Ib.field_cb = null;
                la.a(70, param0, jm.field_b, param8, param3);
                break L53;
              }
              Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
              la.a(58, param0, ae.field_c, param8, param3);
              rb.field_o = rb.field_o + 1;
              return;
            }
          }
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == ((i) this).field_p) {
                ((i) this).field_p = null;
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
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("i.removeConsumer(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Invite <%0> to this game";
    }
}
