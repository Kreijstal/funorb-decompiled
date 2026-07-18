/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hb extends ka {
    static tf field_hb;
    static ak field_eb;
    static boolean field_kb;
    private int field_ib;
    private dq field_lb;
    private sd field_bb;
    private ng field_db;
    private int field_fb;
    private int field_cb;
    private int field_gb;
    static String[] field_jb;
    private int field_ab;

    final static void a(boolean param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        RuntimeException var7 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          if (param2 != 0) {
            L0: {
              if (param2 == 4) {
                break L0;
              } else {
                if (param2 == 2) {
                  break L0;
                } else {
                  if (param2 == 1) {
                    break L0;
                  } else {
                    if (param2 != 5) {
                      if (param2 != 6) {
                        if (param2 != 7) {
                          L1: {
                            if (param2 == 8) {
                              break L1;
                            } else {
                              if (param2 == 9) {
                                break L1;
                              } else {
                                if (param2 == 10) {
                                  oc.field_H[param2] = (de) (Object) new mi(param2, param6, param3, param1, 30, param4);
                                  return;
                                } else {
                                  if (11 == param2) {
                                    oc.field_H[param2] = (de) (Object) new l(param2, param6, param3, param1, 30, param4);
                                    return;
                                  } else {
                                    if (param2 != 12) {
                                      if (param2 != 13) {
                                        if (param2 == 16) {
                                          oc.field_H[param2] = (de) (Object) new uk(param2, param6, param3, param1, 30, param4);
                                          return;
                                        } else {
                                          if (17 != param2) {
                                            if (param2 == 14) {
                                              oc.field_H[param2] = (de) (Object) new ij(param2, param6, param3, param1, 30, param4);
                                              return;
                                            } else {
                                              throw new IllegalStateException("No class defined for id=" + param2);
                                            }
                                          } else {
                                            oc.field_H[param2] = (de) (Object) new op(param2, param6, param3, param1, 30, param4);
                                            return;
                                          }
                                        }
                                      } else {
                                        oc.field_H[param2] = (de) (Object) new hq(param2, param6, param3, param1, 30, param4);
                                        return;
                                      }
                                    } else {
                                      oc.field_H[param2] = (de) (Object) new ol(param2, param6, param3, param1, 30, param4);
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          oc.field_H[param2] = (de) (Object) new rb(param2, param6, param3, param1, 30, param4);
                          return;
                        } else {
                          oc.field_H[param2] = (de) (Object) new fk(param2, param6, param3, param1, 30, param4);
                          return;
                        }
                      } else {
                        oc.field_H[param2] = (de) (Object) new wh(param2, param6, param3, param1, 30, param4);
                        return;
                      }
                    } else {
                      oc.field_H[param2] = (de) (Object) new fq(param2, param6, param3, param1, 30, param4);
                      return;
                    }
                  }
                }
              }
            }
            oc.field_H[param2] = (de) (Object) new dp(param2, param6, param3, param1, 30, param4);
            return;
          } else {
            oc.field_H[param2] = (de) (Object) new to(param2, param6, param3, param1, 30, param4);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var7;
            stackOut_31_1 = new StringBuilder().append("hb.P(").append(true).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param4 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L2;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + 30 + ',' + param6 + ')');
        }
    }

    final static byte[] a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
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
            var2_int = 59 % ((49 - param1) / 54);
            stackOut_0_0 = ig.field_b.a((byte) 24, param0, "");
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("hb.O(");
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
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final void f(boolean param0) {
        if (fh.field_I == ((hb) this).field_lb) {
          return;
        } else {
          if (!param0) {
            boolean discarded$2 = ((hb) this).c(true);
            ((hb) this).field_cb = 0;
            ((hb) this).field_lb = rf.field_i;
            this.d(((hb) this).field_db, 114);
            ((hb) this).field_bb.field_O = 0;
            ((hb) this).field_db = null;
            return;
          } else {
            ((hb) this).field_cb = 0;
            ((hb) this).field_lb = rf.field_i;
            this.d(((hb) this).field_db, 114);
            ((hb) this).field_bb.field_O = 0;
            ((hb) this).field_db = null;
            return;
          }
        }
    }

    boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (null != ((hb) this).field_bb) {
                L1: {
                  if (param0 == 98) {
                    boolean discarded$4 = ((hb) this).field_bb.a(param2, param1 ^ 24);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0 != 99) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((hb) this).field_bb.a(param2, 27);
                    break L2;
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("hb.G(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
        return stackIn_12_0 != 0;
    }

    boolean c(boolean param0) {
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0) {
          String discarded$5 = hb.e((byte) 58);
          if (((hb) this).field_lb != null) {
            if (fh.field_I == ((hb) this).field_lb) {
              int fieldTemp$6 = ((hb) this).field_cb + 1;
              ((hb) this).field_cb = ((hb) this).field_cb + 1;
              if (fieldTemp$6 == ((hb) this).field_ab) {
                ((hb) this).field_lb = co.field_h;
                ((hb) this).a(((hb) this).field_db.field_C + ((hb) this).field_fb + 12, 12 - -((hb) this).field_db.field_E, ((hb) this).field_gb, 57);
                ((hb) this).field_cb = 0;
                ((hb) this).field_bb.field_O = 0;
                return super.c(false);
              } else {
                ((hb) this).field_bb.field_O = 256 - (((hb) this).field_cb << 8) / ((hb) this).field_ab;
                return super.c(false);
              }
            } else {
              if (((hb) this).field_lb == rf.field_i) {
                int fieldTemp$7 = ((hb) this).field_cb + 1;
                ((hb) this).field_cb = ((hb) this).field_cb + 1;
                if (((hb) this).field_ib != fieldTemp$7) {
                  ((hb) this).field_bb.field_O = (((hb) this).field_cb << 8) / ((hb) this).field_ib;
                  return super.c(false);
                } else {
                  ((hb) this).field_lb = null;
                  ((hb) this).field_bb.field_O = 256;
                  return super.c(false);
                }
              } else {
                return super.c(false);
              }
            }
          } else {
            return super.c(false);
          }
        } else {
          if (((hb) this).field_lb != null) {
            if (fh.field_I == ((hb) this).field_lb) {
              int fieldTemp$8 = ((hb) this).field_cb + 1;
              ((hb) this).field_cb = ((hb) this).field_cb + 1;
              if (fieldTemp$8 == ((hb) this).field_ab) {
                ((hb) this).field_lb = co.field_h;
                ((hb) this).a(((hb) this).field_db.field_C + ((hb) this).field_fb + 12, 12 - -((hb) this).field_db.field_E, ((hb) this).field_gb, 57);
                ((hb) this).field_cb = 0;
                ((hb) this).field_bb.field_O = 0;
                return super.c(false);
              } else {
                ((hb) this).field_bb.field_O = 256 - (((hb) this).field_cb << 8) / ((hb) this).field_ab;
                return super.c(false);
              }
            } else {
              if (((hb) this).field_lb == rf.field_i) {
                int fieldTemp$9 = ((hb) this).field_cb + 1;
                ((hb) this).field_cb = ((hb) this).field_cb + 1;
                if (((hb) this).field_ib != fieldTemp$9) {
                  ((hb) this).field_bb.field_O = (((hb) this).field_cb << 8) / ((hb) this).field_ib;
                  return super.c(false);
                } else {
                  ((hb) this).field_lb = null;
                  ((hb) this).field_bb.field_O = 256;
                  return super.c(false);
                }
              } else {
                return super.c(false);
              }
            }
          } else {
            return super.c(false);
          }
        }
    }

    hb(kn param0, ng param1, int param2, int param3, int param4) {
        super(param0, param1.field_E + 12, param2 + 12 - -param1.field_C);
        try {
            ((hb) this).field_gb = param4;
            ((hb) this).field_fb = param2;
            ((hb) this).field_ib = param3;
            ((hb) this).field_ab = param3;
            this.d(param1, 125);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void c(ng param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              ((hb) this).field_db = param0;
              if (co.field_h != ((hb) this).field_lb) {
                if (fh.field_I == ((hb) this).field_lb) {
                  break L1;
                } else {
                  ((hb) this).field_lb = fh.field_I;
                  ((hb) this).field_cb = 0;
                  break L1;
                }
              } else {
                ((hb) this).a(((hb) this).field_db.field_C + ((hb) this).field_fb + 12, 12 - -((hb) this).field_db.field_E, ((hb) this).field_gb, 57);
                ((hb) this).field_cb = 0;
                break L1;
              }
            }
            if (param1 < -111) {
              break L0;
            } else {
              var4 = null;
              boolean discarded$2 = ((hb) this).a(-79, 114, (ng) null, 'F');
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("hb.R(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    private final void d(ng param0, int param1) {
        if (!(null == ((hb) this).field_bb)) {
            ((hb) this).field_bb.c(2779);
        }
        if (param1 <= 101) {
            return;
        }
        try {
            if (param0 != null) {
                param0.a(param0.field_E, (byte) 55, ((hb) this).field_fb + 6, 6, param0.field_C);
                ((hb) this).field_bb = new sd(param0);
            } else {
                ((hb) this).field_bb = new sd();
            }
            ((hb) this).b((ng) (Object) ((hb) this).field_bb, 80);
            ((hb) this).field_db = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "hb.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void e(boolean param0) {
        if (!(null == ((hb) this).field_lb)) {
            if (!(rf.field_i == ((hb) this).field_lb)) {
                ((hb) this).a(((hb) this).field_fb + 12 + ((hb) this).field_db.field_C, (byte) -110, 12 + ((hb) this).field_db.field_E);
                this.d(((hb) this).field_db, 111);
            }
            ((hb) this).field_bb.field_O = 256;
            ((hb) this).field_lb = null;
        }
        super.e(param0);
    }

    public static void f() {
        field_hb = null;
        field_jb = null;
        field_eb = null;
    }

    final boolean a(byte param0) {
        ((hb) this).e(false);
        if (param0 < 120) {
            ((hb) this).f(false);
            return super.a((byte) 126);
        }
        return super.a((byte) 126);
    }

    final static String e(byte param0) {
        int var1 = -24 / ((-51 - param0) / 54);
        if (re.field_h) {
            return null;
        }
        if (am.field_c > no.field_h) {
            return null;
        }
        if (!(am.field_c + pc.field_s <= no.field_h)) {
            return qg.field_b;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_kb = true;
    }
}
