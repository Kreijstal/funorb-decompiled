/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class i extends ha implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_o;
    private java.awt.image.ImageConsumer field_p;
    static bb field_n;
    static int field_l;
    static String field_m;

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((i) this).field_p = param0;
        param0.setDimensions(((i) this).field_a, ((i) this).field_i);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((i) this).field_o);
        param0.setHints(14);
    }

    final static boolean a(int param0, String param1) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -640) {
          L0: {
            var3 = null;
            boolean discarded$6 = i.a(54, (String) null);
            if (fh.a(param1, -99) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (fh.a(param1, -99) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(java.awt.Graphics param0, boolean param1, int param2, int param3) {
        this.b(param1);
        boolean discarded$0 = param0.drawImage(((i) this).field_d, param3, param2, (java.awt.image.ImageObserver) this);
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
        ((i) this).addConsumer(param0);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(int param0, java.awt.Component param1, int param2, byte param3) {
        try {
            ((i) this).field_i = param2;
            ((i) this).field_a = param0;
            ((i) this).field_e = new int[1 + param0 * param2];
            ((i) this).field_o = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((i) this).field_d = param1.createImage((java.awt.image.ImageProducer) this);
            this.b(false);
            boolean discarded$5 = param1.prepareImage(((i) this).field_d, (java.awt.image.ImageObserver) this);
            if (param3 > -51) {
              i.a(-29, true, false, false, true, 57, -40, true, -122, -23);
              this.b(false);
              boolean discarded$6 = param1.prepareImage(((i) this).field_d, (java.awt.image.ImageObserver) this);
              this.b(false);
              boolean discarded$7 = param1.prepareImage(((i) this).field_d, (java.awt.image.ImageObserver) this);
              ((i) this).a(19692);
              return;
            } else {
              this.b(false);
              boolean discarded$8 = param1.prepareImage(((i) this).field_d, (java.awt.image.ImageObserver) this);
              this.b(false);
              boolean discarded$9 = param1.prepareImage(((i) this).field_d, (java.awt.image.ImageObserver) this);
              ((i) this).a(19692);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
        if (param0.equals((Object) (Object) "B")) {
          return Byte.TYPE;
        } else {
          if (param0.equals((Object) (Object) "I")) {
            return Integer.TYPE;
          } else {
            if (param0.equals((Object) (Object) "S")) {
              return Short.TYPE;
            } else {
              if (param0.equals((Object) (Object) "J")) {
                return Long.TYPE;
              } else {
                if (!param0.equals((Object) (Object) "Z")) {
                  if (param1 < -66) {
                    if (param0.equals((Object) (Object) "F")) {
                      return Float.TYPE;
                    } else {
                      if (param0.equals((Object) (Object) "D")) {
                        return Double.TYPE;
                      } else {
                        if (param0.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param0);
                        }
                      }
                    }
                  } else {
                    i.c(49);
                    if (param0.equals((Object) (Object) "F")) {
                      return Float.TYPE;
                    } else {
                      if (param0.equals((Object) (Object) "D")) {
                        return Double.TYPE;
                      } else {
                        if (param0.equals((Object) (Object) "C")) {
                          return Character.TYPE;
                        } else {
                          return Class.forName(param0);
                        }
                      }
                    }
                  }
                } else {
                  return Boolean.TYPE;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3, boolean param4, int param5, int param6, boolean param7, int param8, int param9) {
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        if (!param4) {
          if (ni.field_q == t.field_j) {
            L0: {
              if (t.field_d == wg.field_b) {
                break L0;
              } else {
                if (qa.field_f.field_i != t.field_d) {
                  break L0;
                } else {
                  if (qa.field_f.field_a != t.field_j) {
                    break L0;
                  } else {
                    if (io.field_c != null) {
                      hn.a((byte) 32, false);
                      break L0;
                    } else {
                      if (bn.field_S != null) {
                        hn.a((byte) 32, true);
                        break L0;
                      } else {
                        we.b(false);
                        break L0;
                      }
                    }
                  }
                }
              }
            }
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
                if ((vn.field_g ^ -1) >= -1) {
                  break L3;
                } else {
                  ic.a(param0, param7, 3, param4);
                  break L3;
                }
              }
              L4: {
                if ((h.field_W ^ -1) < -1) {
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
                      wd.a(jm.field_b.field_Fb, false);
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
                L7: {
                  if (0 >= oo.field_b) {
                    break L7;
                  } else {
                    jh.a(2, param0, param7, param4);
                    break L7;
                  }
                }
                nk.field_e.field_Bb = 1;
                nk.field_e.field_C = kj.field_l.field_C;
                if ((vn.field_g ^ -1) >= -1) {
                  L8: {
                    if ((h.field_W ^ -1) < -1) {
                      no.a(param1, param6 + 28363, param0, param4, param7);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if (bm.field_o) {
                    if (io.field_c.field_ec <= io.field_c.field_mc) {
                      jm.field_b.field_Ib.field_cb = fo.field_m;
                      oc.field_O.field_rb = false;
                      wd.a(jm.field_b.field_Fb, false);
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
                  L9: {
                    ic.a(param0, param7, 3, param4);
                    if ((h.field_W ^ -1) < -1) {
                      no.a(param1, param6 + 28363, param0, param4, param7);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      if (!bm.field_o) {
                        break L11;
                      } else {
                        if (io.field_c.field_ec > io.field_c.field_mc) {
                          break L11;
                        } else {
                          jm.field_b.field_Ib.field_cb = fo.field_m;
                          oc.field_O.field_rb = false;
                          wd.a(jm.field_b.field_Fb, false);
                          break L10;
                        }
                      }
                    }
                    oc.field_O.field_rb = true;
                    jm.field_b.field_Ib.field_cb = null;
                    la.a(70, param0, jm.field_b, param8, param3);
                    break L10;
                  }
                  Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                  la.a(58, param0, ae.field_c, param8, param3);
                  rb.field_o = rb.field_o + 1;
                  return;
                }
              } else {
                L12: {
                  field_m = null;
                  if (0 >= oo.field_b) {
                    break L12;
                  } else {
                    jh.a(2, param0, param7, param4);
                    break L12;
                  }
                }
                L13: {
                  nk.field_e.field_Bb = 1;
                  nk.field_e.field_C = kj.field_l.field_C;
                  if ((vn.field_g ^ -1) >= -1) {
                    break L13;
                  } else {
                    ic.a(param0, param7, 3, param4);
                    break L13;
                  }
                }
                L14: {
                  if ((h.field_W ^ -1) < -1) {
                    no.a(param1, param6 + 28363, param0, param4, param7);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (!bm.field_o) {
                    break L15;
                  } else {
                    if (io.field_c.field_ec > io.field_c.field_mc) {
                      break L15;
                    } else {
                      jm.field_b.field_Ib.field_cb = fo.field_m;
                      oc.field_O.field_rb = false;
                      wd.a(jm.field_b.field_Fb, false);
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
            L16: {
              if (qa.field_f.field_i != t.field_d) {
                break L16;
              } else {
                if (qa.field_f.field_a != t.field_j) {
                  break L16;
                } else {
                  if (io.field_c != null) {
                    hn.a((byte) 32, false);
                    break L16;
                  } else {
                    if (bn.field_S != null) {
                      hn.a((byte) 32, true);
                      break L16;
                    } else {
                      we.b(false);
                      break L16;
                    }
                  }
                }
              }
            }
            if (param4) {
              L17: {
                ho.field_c = le.field_c;
                pj.a((byte) 111, param4);
                if (param6 == -28362) {
                  break L17;
                } else {
                  field_m = null;
                  break L17;
                }
              }
              L18: {
                if (0 >= oo.field_b) {
                  break L18;
                } else {
                  jh.a(2, param0, param7, param4);
                  break L18;
                }
              }
              L19: {
                nk.field_e.field_Bb = 1;
                nk.field_e.field_C = kj.field_l.field_C;
                if ((vn.field_g ^ -1) >= -1) {
                  break L19;
                } else {
                  ic.a(param0, param7, 3, param4);
                  break L19;
                }
              }
              L20: {
                if ((h.field_W ^ -1) < -1) {
                  no.a(param1, param6 + 28363, param0, param4, param7);
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                L22: {
                  if (!bm.field_o) {
                    break L22;
                  } else {
                    if (io.field_c.field_ec > io.field_c.field_mc) {
                      break L22;
                    } else {
                      jm.field_b.field_Ib.field_cb = fo.field_m;
                      oc.field_O.field_rb = false;
                      wd.a(jm.field_b.field_Fb, false);
                      break L21;
                    }
                  }
                }
                oc.field_O.field_rb = true;
                jm.field_b.field_Ib.field_cb = null;
                la.a(70, param0, jm.field_b, param8, param3);
                break L21;
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
                  if ((vn.field_g ^ -1) >= -1) {
                    L23: {
                      if ((h.field_W ^ -1) < -1) {
                        no.a(param1, param6 + 28363, param0, param4, param7);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    if (bm.field_o) {
                      if (io.field_c.field_ec <= io.field_c.field_mc) {
                        jm.field_b.field_Ib.field_cb = fo.field_m;
                        oc.field_O.field_rb = false;
                        wd.a(jm.field_b.field_Fb, false);
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
                    L24: {
                      ic.a(param0, param7, 3, param4);
                      if ((h.field_W ^ -1) < -1) {
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
                            wd.a(jm.field_b.field_Fb, false);
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
                  }
                } else {
                  L27: {
                    jh.a(2, param0, param7, param4);
                    nk.field_e.field_Bb = 1;
                    nk.field_e.field_C = kj.field_l.field_C;
                    if ((vn.field_g ^ -1) >= -1) {
                      break L27;
                    } else {
                      ic.a(param0, param7, 3, param4);
                      break L27;
                    }
                  }
                  L28: {
                    if ((h.field_W ^ -1) < -1) {
                      no.a(param1, param6 + 28363, param0, param4, param7);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    L30: {
                      if (!bm.field_o) {
                        break L30;
                      } else {
                        if (io.field_c.field_ec > io.field_c.field_mc) {
                          break L30;
                        } else {
                          jm.field_b.field_Ib.field_cb = fo.field_m;
                          oc.field_O.field_rb = false;
                          wd.a(jm.field_b.field_Fb, false);
                          break L29;
                        }
                      }
                    }
                    oc.field_O.field_rb = true;
                    jm.field_b.field_Ib.field_cb = null;
                    la.a(70, param0, jm.field_b, param8, param3);
                    break L29;
                  }
                  Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                  la.a(58, param0, ae.field_c, param8, param3);
                  rb.field_o = rb.field_o + 1;
                  return;
                }
              } else {
                L31: {
                  field_m = null;
                  if (0 >= oo.field_b) {
                    break L31;
                  } else {
                    jh.a(2, param0, param7, param4);
                    break L31;
                  }
                }
                L32: {
                  nk.field_e.field_Bb = 1;
                  nk.field_e.field_C = kj.field_l.field_C;
                  if ((vn.field_g ^ -1) >= -1) {
                    break L32;
                  } else {
                    ic.a(param0, param7, 3, param4);
                    break L32;
                  }
                }
                L33: {
                  if ((h.field_W ^ -1) < -1) {
                    no.a(param1, param6 + 28363, param0, param4, param7);
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  L35: {
                    if (!bm.field_o) {
                      break L35;
                    } else {
                      if (io.field_c.field_ec > io.field_c.field_mc) {
                        break L35;
                      } else {
                        jm.field_b.field_Ib.field_cb = fo.field_m;
                        oc.field_O.field_rb = false;
                        wd.a(jm.field_b.field_Fb, false);
                        break L34;
                      }
                    }
                  }
                  oc.field_O.field_rb = true;
                  jm.field_b.field_Ib.field_cb = null;
                  la.a(70, param0, jm.field_b, param8, param3);
                  break L34;
                }
                Pixelate.a(param3, (byte) 69, param8, param2, param5, param0, param9);
                la.a(58, param0, ae.field_c, param8, param3);
                rb.field_o = rb.field_o + 1;
                return;
              }
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
              if ((vn.field_g ^ -1) >= -1) {
                break L38;
              } else {
                ic.a(param0, param7, 3, param4);
                break L38;
              }
            }
            L39: {
              if ((h.field_W ^ -1) < -1) {
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
                    wd.a(jm.field_b.field_Fb, false);
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
                if ((vn.field_g ^ -1) >= -1) {
                  L42: {
                    if ((h.field_W ^ -1) < -1) {
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
                      wd.a(jm.field_b.field_Fb, false);
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
                    if ((h.field_W ^ -1) < -1) {
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
                          wd.a(jm.field_b.field_Fb, false);
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
                  if ((vn.field_g ^ -1) >= -1) {
                    break L46;
                  } else {
                    ic.a(param0, param7, 3, param4);
                    break L46;
                  }
                }
                L47: {
                  if ((h.field_W ^ -1) < -1) {
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
                        wd.a(jm.field_b.field_Fb, false);
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
                if ((vn.field_g ^ -1) >= -1) {
                  break L51;
                } else {
                  ic.a(param0, param7, 3, param4);
                  break L51;
                }
              }
              L52: {
                if ((h.field_W ^ -1) < -1) {
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
                      wd.a(jm.field_b.field_Fb, false);
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
        if (!(param0 != ((i) this).field_p)) {
            ((i) this).field_p = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Invite <%0> to this game";
    }
}
