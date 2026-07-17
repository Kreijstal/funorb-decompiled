/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends hd {
    static int[] field_Db;
    private hd field_yb;
    private hd field_Ib;
    private int field_Gb;
    private boolean field_Cb;
    private hd field_zb;
    static int field_Hb;
    static String field_Eb;
    private hd field_Ab;
    private hd field_Bb;
    private hd field_Fb;

    final int a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = param1;
          var6 = ((ji) this).field_zb.field_q + -((ji) this).field_yb.field_q;
          if (var6 <= 0) {
            break L0;
          } else {
            var7 = ((ji) this).field_yb.field_s;
            var8 = param0 + -param3;
            var5 = (var6 / 2 + var8 * var7) / var6;
            break L0;
          }
        }
        if (param2) {
          L1: {
            if (var5 >= 0) {
              break L1;
            } else {
              var5 = 0;
              break L1;
            }
          }
          if (-param3 + param0 >= var5) {
            return var5;
          } else {
            var5 = param0 + -param3;
            return var5;
          }
        } else {
          L2: {
            if (-param3 + param0 < var5) {
              var5 = -param3 + param0;
              break L2;
            } else {
              break L2;
            }
          }
          if (var5 < 0) {
            var5 = 0;
            return var5;
          } else {
            return var5;
          }
        }
    }

    final boolean b(int param0) {
        if (((ji) this).field_Bb.field_sb != 0) {
          ((ji) this).field_Gb = 20;
          return true;
        } else {
          if (0 != ((ji) this).field_Bb.field_qb) {
            L0: {
              if (((ji) this).field_Gb > 0) {
                ((ji) this).field_Gb = ((ji) this).field_Gb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((ji) this).field_Gb != 0) {
              if (param0 <= -47) {
                return false;
              } else {
                boolean discarded$4 = ((ji) this).j(69);
                return false;
              }
            } else {
              ((ji) this).field_Gb = 3;
              return true;
            }
          } else {
            if (param0 <= -47) {
              return false;
            } else {
              boolean discarded$5 = ((ji) this).j(69);
              return false;
            }
          }
        }
    }

    final boolean h(int param0) {
        if (((ji) this).field_Fb.field_sb == 0) {
          if (((ji) this).field_Fb.field_qb != param0) {
            if (((ji) this).field_Gb <= 0) {
              if (((ji) this).field_Gb != 0) {
                return false;
              } else {
                ((ji) this).field_Gb = 3;
                return true;
              }
            } else {
              ((ji) this).field_Gb = ((ji) this).field_Gb - 1;
              if (((ji) this).field_Gb == 0) {
                ((ji) this).field_Gb = 3;
                return true;
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          ((ji) this).field_Gb = 20;
          return true;
        }
    }

    ji(long param0, ji param1, boolean param2) {
        this(param0, param1.field_Bb, param1.field_Fb, param1.field_Ab, param1.field_yb, param2);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!((ji) this).field_Cb) {
          this.c(param0, 2, param1, param3);
          if (param2 >= 13) {
            return;
          } else {
            field_Db = null;
            return;
          }
        } else {
          this.a(true, param0, param3, param1);
          if (param2 >= 13) {
            return;
          } else {
            field_Db = null;
            return;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (ns.field_a > 0) {
          if (qv.field_f) {
            L0: {
              on.g(0, 0, on.field_g, g.field_a.field_T);
              kk.field_j.a(77, param1);
              if (fj.field_a > 0) {
                if (!td.field_b) {
                  break L0;
                } else {
                  on.g(0, 0, on.field_g, g.field_a.field_T);
                  tn.field_f.a(125, param1);
                  return;
                }
              } else {
                if (ee.field_b <= 0) {
                  break L0;
                } else {
                  if (!td.field_b) {
                    return;
                  } else {
                    on.g(0, 0, on.field_g, g.field_a.field_T);
                    tn.field_f.a(125, param1);
                    return;
                  }
                }
              }
            }
            return;
          } else {
            L1: {
              if (fj.field_a > 0) {
                if (!td.field_b) {
                  break L1;
                } else {
                  on.g(0, 0, on.field_g, g.field_a.field_T);
                  tn.field_f.a(125, param1);
                  return;
                }
              } else {
                if (ee.field_b <= 0) {
                  break L1;
                } else {
                  if (!td.field_b) {
                    return;
                  } else {
                    on.g(0, 0, on.field_g, g.field_a.field_T);
                    tn.field_f.a(125, param1);
                    return;
                  }
                }
              }
            }
            return;
          }
        } else {
          if (fj.field_a <= 0) {
            if (ee.field_b > 0) {
              if (!td.field_b) {
                return;
              } else {
                on.g(0, 0, on.field_g, g.field_a.field_T);
                tn.field_f.a(125, param1);
                return;
              }
            } else {
              return;
            }
          } else {
            if (td.field_b) {
              on.g(0, 0, on.field_g, g.field_a.field_T);
              tn.field_f.a(125, param1);
              return;
            } else {
              return;
            }
          }
        }
    }

    private ji(long param0, hd param1, hd param2, hd param3, hd param4, boolean param5) {
        super(param0, (hd) null);
        RuntimeException var8 = null;
        hd var10 = null;
        hd var11 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((ji) this).field_Cb = stackIn_4_1 != 0;
            ((ji) this).field_Bb = new hd(0L, param1);
            ((ji) this).field_Fb = new hd(0L, param2);
            ((ji) this).a((byte) -116, ((ji) this).field_Bb);
            ((ji) this).a((byte) -110, ((ji) this).field_Fb);
            ((ji) this).field_zb = new hd(0L, (hd) null);
            ((ji) this).a((byte) -113, ((ji) this).field_zb);
            ((ji) this).field_Ab = new hd(0L, param3);
            ((ji) this).field_Ib = new hd(0L, param3);
            ((ji) this).field_Ib.field_ob = true;
            var10 = ((ji) this).field_Ab;
            var11 = var10;
            var11.field_ob = true;
            ((ji) this).field_zb.a((byte) -108, ((ji) this).field_Ab);
            ((ji) this).field_zb.a((byte) -116, ((ji) this).field_Ib);
            ((ji) this).field_yb = new hd(0L, param4);
            ((ji) this).field_yb.field_Y = true;
            ((ji) this).field_zb.a((byte) -117, ((ji) this).field_yb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("ji.<init>(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param5 + 41);
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        hd var15 = null;
        hd var16 = null;
        hd var17 = null;
        hd var18 = null;
        hd var19 = null;
        hd var20 = null;
        hd stackIn_7_0 = null;
        hd stackIn_7_1 = null;
        hd stackIn_7_2 = null;
        hd stackIn_8_0 = null;
        hd stackIn_8_1 = null;
        hd stackIn_8_2 = null;
        hd stackIn_9_0 = null;
        hd stackIn_9_1 = null;
        hd stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        hd stackIn_17_0 = null;
        hd stackIn_17_1 = null;
        hd stackIn_17_2 = null;
        hd stackIn_18_0 = null;
        hd stackIn_18_1 = null;
        hd stackIn_18_2 = null;
        hd stackIn_19_0 = null;
        hd stackIn_19_1 = null;
        hd stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        hd stackIn_23_0 = null;
        hd stackIn_23_1 = null;
        hd stackIn_23_2 = null;
        hd stackIn_24_0 = null;
        hd stackIn_24_1 = null;
        hd stackIn_24_2 = null;
        hd stackIn_25_0 = null;
        hd stackIn_25_1 = null;
        hd stackIn_25_2 = null;
        int stackIn_25_3 = 0;
        hd stackOut_22_0 = null;
        hd stackOut_22_1 = null;
        hd stackOut_22_2 = null;
        hd stackOut_24_0 = null;
        hd stackOut_24_1 = null;
        hd stackOut_24_2 = null;
        int stackOut_24_3 = 0;
        hd stackOut_23_0 = null;
        hd stackOut_23_1 = null;
        hd stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        hd stackOut_16_0 = null;
        hd stackOut_16_1 = null;
        hd stackOut_16_2 = null;
        hd stackOut_18_0 = null;
        hd stackOut_18_1 = null;
        hd stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        hd stackOut_17_0 = null;
        hd stackOut_17_1 = null;
        hd stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        hd stackOut_6_0 = null;
        hd stackOut_6_1 = null;
        hd stackOut_6_2 = null;
        hd stackOut_8_0 = null;
        hd stackOut_8_1 = null;
        hd stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        hd stackOut_7_0 = null;
        hd stackOut_7_1 = null;
        hd stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        L0: {
          var14 = Kickabout.field_G;
          if (((ji) this).field_mb * 2 <= ((ji) this).field_q) {
            var6 = ((ji) this).field_q - ((ji) this).field_mb;
            var5 = ((ji) this).field_mb;
            break L0;
          } else {
            var6 = ((ji) this).field_q / 2;
            var5 = ((ji) this).field_q / 2;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (param3 < param2) {
          L1: {
            var8 = var8 * param3 / param2;
            if (((ji) this).field_mb > var8) {
              var8 = ((ji) this).field_mb;
              break L1;
            } else {
              break L1;
            }
          }
          if (var7 >= var8) {
            L2: {
              var9 = param2 + -param3;
              var10 = var7 - var8;
              var11 = 0;
              if (0 >= var9) {
                break L2;
              } else {
                var11 = (var10 * param0 - -(var9 / 2)) / var9;
                break L2;
              }
            }
            L3: {
              var12 = var8 / param1 + var11;
              var15 = ((ji) this).field_Bb;
              var15.field_s = 0;
              var15.field_J = 0;
              var15.field_q = var5;
              var15.field_mb = ((ji) this).field_mb;
              var16 = ((ji) this).field_Fb;
              var16.field_q = -var6 + ((ji) this).field_q;
              var16.field_J = 0;
              var16.field_s = var6;
              var16.field_mb = ((ji) this).field_mb;
              var17 = ((ji) this).field_zb;
              var17.field_q = var7;
              var17.field_mb = ((ji) this).field_mb;
              var17.field_J = 0;
              var17.field_s = var5;
              var18 = ((ji) this).field_Ab;
              var18.field_J = 0;
              var18.field_q = var12;
              var18.field_mb = ((ji) this).field_mb;
              var18.field_s = 0;
              var19 = ((ji) this).field_Ib;
              var19.field_q = -var12 + var7;
              var19.field_s = var12;
              var19.field_mb = ((ji) this).field_mb;
              var19.field_J = 0;
              var20 = ((ji) this).field_yb;
              var20.field_mb = ((ji) this).field_mb;
              var20.field_s = var11;
              var20.field_q = var8;
              var20.field_J = 0;
              stackOut_22_0 = ((ji) this).field_Bb;
              stackOut_22_1 = ((ji) this).field_Fb;
              stackOut_22_2 = ((ji) this).field_zb;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              if (param3 >= param2) {
                stackOut_24_0 = (hd) (Object) stackIn_24_0;
                stackOut_24_1 = (hd) (Object) stackIn_24_1;
                stackOut_24_2 = (hd) (Object) stackIn_24_2;
                stackOut_24_3 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                stackIn_25_3 = stackOut_24_3;
                break L3;
              } else {
                stackOut_23_0 = (hd) (Object) stackIn_23_0;
                stackOut_23_1 = (hd) (Object) stackIn_23_1;
                stackOut_23_2 = (hd) (Object) stackIn_23_2;
                stackOut_23_3 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                stackIn_25_3 = stackOut_23_3;
                break L3;
              }
            }
            stackIn_25_2.field_lb = stackIn_25_3 != 0;
            stackIn_25_1.field_lb = stackIn_25_3 != 0;
            stackIn_25_0.field_lb = stackIn_25_3 != 0;
            return;
          } else {
            L4: {
              var8 = var7;
              var9 = param2 + -param3;
              var10 = var7 - var8;
              var11 = 0;
              if (0 >= var9) {
                break L4;
              } else {
                var11 = (var10 * param0 - -(var9 / 2)) / var9;
                break L4;
              }
            }
            L5: {
              var12 = var8 / param1 + var11;
              var15 = ((ji) this).field_Bb;
              var15.field_s = 0;
              var15.field_J = 0;
              var15.field_q = var5;
              var15.field_mb = ((ji) this).field_mb;
              var16 = ((ji) this).field_Fb;
              var16.field_q = -var6 + ((ji) this).field_q;
              var16.field_J = 0;
              var16.field_s = var6;
              var16.field_mb = ((ji) this).field_mb;
              var17 = ((ji) this).field_zb;
              var17.field_q = var7;
              var17.field_mb = ((ji) this).field_mb;
              var17.field_J = 0;
              var17.field_s = var5;
              var18 = ((ji) this).field_Ab;
              var18.field_J = 0;
              var18.field_q = var12;
              var18.field_mb = ((ji) this).field_mb;
              var18.field_s = 0;
              var19 = ((ji) this).field_Ib;
              var19.field_q = -var12 + var7;
              var19.field_s = var12;
              var19.field_mb = ((ji) this).field_mb;
              var19.field_J = 0;
              var20 = ((ji) this).field_yb;
              var20.field_mb = ((ji) this).field_mb;
              var20.field_s = var11;
              var20.field_q = var8;
              var20.field_J = 0;
              stackOut_16_0 = ((ji) this).field_Bb;
              stackOut_16_1 = ((ji) this).field_Fb;
              stackOut_16_2 = ((ji) this).field_zb;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              if (param3 >= param2) {
                stackOut_18_0 = (hd) (Object) stackIn_18_0;
                stackOut_18_1 = (hd) (Object) stackIn_18_1;
                stackOut_18_2 = (hd) (Object) stackIn_18_2;
                stackOut_18_3 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                stackIn_19_2 = stackOut_18_2;
                stackIn_19_3 = stackOut_18_3;
                break L5;
              } else {
                stackOut_17_0 = (hd) (Object) stackIn_17_0;
                stackOut_17_1 = (hd) (Object) stackIn_17_1;
                stackOut_17_2 = (hd) (Object) stackIn_17_2;
                stackOut_17_3 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                stackIn_19_3 = stackOut_17_3;
                break L5;
              }
            }
            stackIn_19_2.field_lb = stackIn_19_3 != 0;
            stackIn_19_1.field_lb = stackIn_19_3 != 0;
            stackIn_19_0.field_lb = stackIn_19_3 != 0;
            return;
          }
        } else {
          L6: {
            var7 = 0;
            var9 = param2 + -param3;
            var10 = var7 - var8;
            var11 = 0;
            if (0 >= var9) {
              break L6;
            } else {
              var11 = (var10 * param0 - -(var9 / 2)) / var9;
              break L6;
            }
          }
          L7: {
            var12 = var8 / param1 + var11;
            var15 = ((ji) this).field_Bb;
            var15.field_s = 0;
            var15.field_J = 0;
            var15.field_q = var5;
            var15.field_mb = ((ji) this).field_mb;
            var16 = ((ji) this).field_Fb;
            var16.field_q = -var6 + ((ji) this).field_q;
            var16.field_J = 0;
            var16.field_s = var6;
            var16.field_mb = ((ji) this).field_mb;
            var17 = ((ji) this).field_zb;
            var17.field_q = var7;
            var17.field_mb = ((ji) this).field_mb;
            var17.field_J = 0;
            var17.field_s = var5;
            var18 = ((ji) this).field_Ab;
            var18.field_J = 0;
            var18.field_q = var12;
            var18.field_mb = ((ji) this).field_mb;
            var18.field_s = 0;
            var19 = ((ji) this).field_Ib;
            var19.field_q = -var12 + var7;
            var19.field_s = var12;
            var19.field_mb = ((ji) this).field_mb;
            var19.field_J = 0;
            var20 = ((ji) this).field_yb;
            var20.field_mb = ((ji) this).field_mb;
            var20.field_s = var11;
            var20.field_q = var8;
            var20.field_J = 0;
            stackOut_6_0 = ((ji) this).field_Bb;
            stackOut_6_1 = ((ji) this).field_Fb;
            stackOut_6_2 = ((ji) this).field_zb;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_8_2 = stackOut_6_2;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            if (param3 >= param2) {
              stackOut_8_0 = (hd) (Object) stackIn_8_0;
              stackOut_8_1 = (hd) (Object) stackIn_8_1;
              stackOut_8_2 = (hd) (Object) stackIn_8_2;
              stackOut_8_3 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              stackIn_9_3 = stackOut_8_3;
              break L7;
            } else {
              stackOut_7_0 = (hd) (Object) stackIn_7_0;
              stackOut_7_1 = (hd) (Object) stackIn_7_1;
              stackOut_7_2 = (hd) (Object) stackIn_7_2;
              stackOut_7_3 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              break L7;
            }
          }
          stackIn_9_2.field_lb = stackIn_9_3 != 0;
          stackIn_9_1.field_lb = stackIn_9_3 != 0;
          stackIn_9_0.field_lb = stackIn_9_3 != 0;
          return;
        }
    }

    public static void a() {
        field_Db = null;
        field_Eb = null;
    }

    final boolean i(int param0) {
        if (((ji) this).field_Ib.field_sb != 0) {
          ((ji) this).field_Gb = 20;
          return true;
        } else {
          if (param0 < -47) {
            if (0 != ((ji) this).field_Ib.field_qb) {
              if (((ji) this).field_Gb <= 0) {
                if (0 == ((ji) this).field_Gb) {
                  if (n.field_m < ((ji) this).field_yb.field_v + ((ji) this).field_yb.field_T - (-((ji) this).field_yb.field_mb - ((ji) this).field_yb.field_L)) {
                    return false;
                  } else {
                    ((ji) this).field_Gb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                ((ji) this).field_Gb = ((ji) this).field_Gb - 1;
                if (0 == ((ji) this).field_Gb) {
                  if (n.field_m < ((ji) this).field_yb.field_v + ((ji) this).field_yb.field_T - (-((ji) this).field_yb.field_mb - ((ji) this).field_yb.field_L)) {
                    return false;
                  } else {
                    ((ji) this).field_Gb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            field_Hb = 113;
            if (0 != ((ji) this).field_Ib.field_qb) {
              if (((ji) this).field_Gb > 0) {
                ((ji) this).field_Gb = ((ji) this).field_Gb - 1;
                if (0 == ((ji) this).field_Gb) {
                  if (n.field_m < ((ji) this).field_yb.field_v + ((ji) this).field_yb.field_T - (-((ji) this).field_yb.field_mb - ((ji) this).field_yb.field_L)) {
                    return false;
                  } else {
                    ((ji) this).field_Gb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (0 == ((ji) this).field_Gb) {
                  if (n.field_m < ((ji) this).field_yb.field_v + ((ji) this).field_yb.field_T - (-((ji) this).field_yb.field_mb - ((ji) this).field_yb.field_L)) {
                    return false;
                  } else {
                    ((ji) this).field_Gb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    ji(String param0, hd param1, hd param2, hd param3, hd param4, boolean param5) {
        this(vb.a(0, (CharSequence) (Object) param0), param1, param2, param3, param4, param5);
    }

    final int a(int param0, boolean param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = 0;
          var6 = -((ji) this).field_yb.field_mb + ((ji) this).field_zb.field_mb;
          if (0 >= var6) {
            break L0;
          } else {
            var7 = ((ji) this).field_yb.field_J;
            var8 = -param3 + param0;
            var5 = (var7 * var8 - -(var6 / 2)) / var6;
            break L0;
          }
        }
        if (!param1) {
          L1: {
            if (-param3 + param0 >= var5) {
              break L1;
            } else {
              var5 = param0 - param3;
              break L1;
            }
          }
          L2: {
            if (0 <= var5) {
              break L2;
            } else {
              var5 = 0;
              break L2;
            }
          }
          if (param2 != -95) {
            this.c(29, 92, -42, -36);
            return var5;
          } else {
            return var5;
          }
        } else {
          L3: {
            if (0 > var5) {
              var5 = 0;
              break L3;
            } else {
              break L3;
            }
          }
          if (var5 > -param3 + param0) {
            var5 = -param3 + param0;
            if (param2 == -95) {
              return var5;
            } else {
              this.c(29, 92, -42, -36);
              return var5;
            }
          } else {
            if (param2 != -95) {
              this.c(29, 92, -42, -36);
              return var5;
            } else {
              return var5;
            }
          }
        }
    }

    final boolean j(int param0) {
        if (param0 != 0) {
            return false;
        }
        return 0 != ((ji) this).field_yb.field_qb ? true : false;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        hd var15 = null;
        hd var16 = null;
        hd var17 = null;
        hd var18 = null;
        hd var19 = null;
        hd var20 = null;
        hd stackIn_7_0 = null;
        hd stackIn_7_1 = null;
        hd stackIn_7_2 = null;
        hd stackIn_8_0 = null;
        hd stackIn_8_1 = null;
        hd stackIn_8_2 = null;
        hd stackIn_9_0 = null;
        hd stackIn_9_1 = null;
        hd stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        hd stackIn_17_0 = null;
        hd stackIn_17_1 = null;
        hd stackIn_17_2 = null;
        hd stackIn_18_0 = null;
        hd stackIn_18_1 = null;
        hd stackIn_18_2 = null;
        hd stackIn_19_0 = null;
        hd stackIn_19_1 = null;
        hd stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        hd stackIn_23_0 = null;
        hd stackIn_23_1 = null;
        hd stackIn_23_2 = null;
        hd stackIn_24_0 = null;
        hd stackIn_24_1 = null;
        hd stackIn_24_2 = null;
        hd stackIn_25_0 = null;
        hd stackIn_25_1 = null;
        hd stackIn_25_2 = null;
        int stackIn_25_3 = 0;
        hd stackOut_22_0 = null;
        hd stackOut_22_1 = null;
        hd stackOut_22_2 = null;
        hd stackOut_24_0 = null;
        hd stackOut_24_1 = null;
        hd stackOut_24_2 = null;
        int stackOut_24_3 = 0;
        hd stackOut_23_0 = null;
        hd stackOut_23_1 = null;
        hd stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        hd stackOut_16_0 = null;
        hd stackOut_16_1 = null;
        hd stackOut_16_2 = null;
        hd stackOut_18_0 = null;
        hd stackOut_18_1 = null;
        hd stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        hd stackOut_17_0 = null;
        hd stackOut_17_1 = null;
        hd stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        hd stackOut_6_0 = null;
        hd stackOut_6_1 = null;
        hd stackOut_6_2 = null;
        hd stackOut_8_0 = null;
        hd stackOut_8_1 = null;
        hd stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        hd stackOut_7_0 = null;
        hd stackOut_7_1 = null;
        hd stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        L0: {
          var14 = Kickabout.field_G;
          if (2 * ((ji) this).field_q > ((ji) this).field_mb) {
            var6 = ((ji) this).field_mb / 2;
            var5 = ((ji) this).field_mb / 2;
            break L0;
          } else {
            var6 = -((ji) this).field_q + ((ji) this).field_mb;
            var5 = ((ji) this).field_q;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (param3 > param2) {
          L1: {
            var8 = param2 * var8 / param3;
            if (((ji) this).field_q > var8) {
              var8 = ((ji) this).field_q;
              break L1;
            } else {
              break L1;
            }
          }
          if (var7 < var8) {
            L2: {
              var8 = var7;
              var9 = -param2 + param3;
              var10 = -var8 + var7;
              var11 = 0;
              if (0 >= var9) {
                break L2;
              } else {
                var11 = (param1 * var10 - -(var9 / 2)) / var9;
                break L2;
              }
            }
            L3: {
              var12 = var11 - -(var8 / 2);
              var15 = ((ji) this).field_Bb;
              var15.field_s = 0;
              var15.field_J = 0;
              var15.field_mb = var5;
              var15.field_q = ((ji) this).field_q;
              var16 = ((ji) this).field_Fb;
              var16.field_q = ((ji) this).field_q;
              var16.field_J = var6;
              var16.field_mb = -var6 + ((ji) this).field_mb;
              var16.field_s = 0;
              var17 = ((ji) this).field_zb;
              var17.field_mb = var7;
              var17.field_J = var5;
              var17.field_s = 0;
              var17.field_q = ((ji) this).field_q;
              var18 = ((ji) this).field_Ab;
              var18.field_q = ((ji) this).field_q;
              var18.field_mb = var12;
              var18.field_s = 0;
              var18.field_J = 0;
              var19 = ((ji) this).field_Ib;
              var19.field_mb = -var12 + var7;
              var19.field_s = 0;
              var19.field_q = ((ji) this).field_q;
              var19.field_J = var12;
              var20 = ((ji) this).field_yb;
              var20.field_q = ((ji) this).field_q;
              stackOut_22_0 = ((ji) this).field_Bb;
              stackOut_22_1 = ((ji) this).field_Fb;
              stackOut_22_2 = ((ji) this).field_zb;
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              if (param2 >= param3) {
                stackOut_24_0 = (hd) (Object) stackIn_24_0;
                stackOut_24_1 = (hd) (Object) stackIn_24_1;
                stackOut_24_2 = (hd) (Object) stackIn_24_2;
                stackOut_24_3 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                stackIn_25_2 = stackOut_24_2;
                stackIn_25_3 = stackOut_24_3;
                break L3;
              } else {
                stackOut_23_0 = (hd) (Object) stackIn_23_0;
                stackOut_23_1 = (hd) (Object) stackIn_23_1;
                stackOut_23_2 = (hd) (Object) stackIn_23_2;
                stackOut_23_3 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_25_2 = stackOut_23_2;
                stackIn_25_3 = stackOut_23_3;
                break L3;
              }
            }
            stackIn_25_2.field_lb = stackIn_25_3 != 0;
            stackIn_25_1.field_lb = stackIn_25_3 != 0;
            stackIn_25_0.field_lb = stackIn_25_3 != 0;
            var20.field_J = var11;
            var20.field_mb = var8;
            var20.field_s = 0;
            return;
          } else {
            L4: {
              var9 = -param2 + param3;
              var10 = -var8 + var7;
              var11 = 0;
              if (0 >= var9) {
                break L4;
              } else {
                var11 = (param1 * var10 - -(var9 / 2)) / var9;
                break L4;
              }
            }
            L5: {
              var12 = var11 - -(var8 / 2);
              var15 = ((ji) this).field_Bb;
              var15.field_s = 0;
              var15.field_J = 0;
              var15.field_mb = var5;
              var15.field_q = ((ji) this).field_q;
              var16 = ((ji) this).field_Fb;
              var16.field_q = ((ji) this).field_q;
              var16.field_J = var6;
              var16.field_mb = -var6 + ((ji) this).field_mb;
              var16.field_s = 0;
              var17 = ((ji) this).field_zb;
              var17.field_mb = var7;
              var17.field_J = var5;
              var17.field_s = 0;
              var17.field_q = ((ji) this).field_q;
              var18 = ((ji) this).field_Ab;
              var18.field_q = ((ji) this).field_q;
              var18.field_mb = var12;
              var18.field_s = 0;
              var18.field_J = 0;
              var19 = ((ji) this).field_Ib;
              var19.field_mb = -var12 + var7;
              var19.field_s = 0;
              var19.field_q = ((ji) this).field_q;
              var19.field_J = var12;
              var20 = ((ji) this).field_yb;
              var20.field_q = ((ji) this).field_q;
              stackOut_16_0 = ((ji) this).field_Bb;
              stackOut_16_1 = ((ji) this).field_Fb;
              stackOut_16_2 = ((ji) this).field_zb;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              if (param2 >= param3) {
                stackOut_18_0 = (hd) (Object) stackIn_18_0;
                stackOut_18_1 = (hd) (Object) stackIn_18_1;
                stackOut_18_2 = (hd) (Object) stackIn_18_2;
                stackOut_18_3 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                stackIn_19_2 = stackOut_18_2;
                stackIn_19_3 = stackOut_18_3;
                break L5;
              } else {
                stackOut_17_0 = (hd) (Object) stackIn_17_0;
                stackOut_17_1 = (hd) (Object) stackIn_17_1;
                stackOut_17_2 = (hd) (Object) stackIn_17_2;
                stackOut_17_3 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                stackIn_19_3 = stackOut_17_3;
                break L5;
              }
            }
            stackIn_19_2.field_lb = stackIn_19_3 != 0;
            stackIn_19_1.field_lb = stackIn_19_3 != 0;
            stackIn_19_0.field_lb = stackIn_19_3 != 0;
            var20.field_J = var11;
            var20.field_mb = var8;
            var20.field_s = 0;
            return;
          }
        } else {
          L6: {
            var7 = 0;
            var9 = -param2 + param3;
            var10 = -var8 + var7;
            var11 = 0;
            if (0 >= var9) {
              break L6;
            } else {
              var11 = (param1 * var10 - -(var9 / 2)) / var9;
              break L6;
            }
          }
          L7: {
            var12 = var11 - -(var8 / 2);
            var15 = ((ji) this).field_Bb;
            var15.field_s = 0;
            var15.field_J = 0;
            var15.field_mb = var5;
            var15.field_q = ((ji) this).field_q;
            var16 = ((ji) this).field_Fb;
            var16.field_q = ((ji) this).field_q;
            var16.field_J = var6;
            var16.field_mb = -var6 + ((ji) this).field_mb;
            var16.field_s = 0;
            var17 = ((ji) this).field_zb;
            var17.field_mb = var7;
            var17.field_J = var5;
            var17.field_s = 0;
            var17.field_q = ((ji) this).field_q;
            var18 = ((ji) this).field_Ab;
            var18.field_q = ((ji) this).field_q;
            var18.field_mb = var12;
            var18.field_s = 0;
            var18.field_J = 0;
            var19 = ((ji) this).field_Ib;
            var19.field_mb = -var12 + var7;
            var19.field_s = 0;
            var19.field_q = ((ji) this).field_q;
            var19.field_J = var12;
            var20 = ((ji) this).field_yb;
            var20.field_q = ((ji) this).field_q;
            stackOut_6_0 = ((ji) this).field_Bb;
            stackOut_6_1 = ((ji) this).field_Fb;
            stackOut_6_2 = ((ji) this).field_zb;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_8_2 = stackOut_6_2;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            if (param2 >= param3) {
              stackOut_8_0 = (hd) (Object) stackIn_8_0;
              stackOut_8_1 = (hd) (Object) stackIn_8_1;
              stackOut_8_2 = (hd) (Object) stackIn_8_2;
              stackOut_8_3 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              stackIn_9_3 = stackOut_8_3;
              break L7;
            } else {
              stackOut_7_0 = (hd) (Object) stackIn_7_0;
              stackOut_7_1 = (hd) (Object) stackIn_7_1;
              stackOut_7_2 = (hd) (Object) stackIn_7_2;
              stackOut_7_3 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              break L7;
            }
          }
          stackIn_9_2.field_lb = stackIn_9_3 != 0;
          stackIn_9_1.field_lb = stackIn_9_3 != 0;
          stackIn_9_0.field_lb = stackIn_9_3 != 0;
          var20.field_J = var11;
          var20.field_mb = var8;
          var20.field_s = 0;
          return;
        }
    }

    final boolean c(boolean param0) {
        if (((ji) this).field_Ab.field_sb != 0) {
          ((ji) this).field_Gb = 20;
          return true;
        } else {
          if (0 != ((ji) this).field_Ab.field_qb) {
            if (((ji) this).field_Gb <= 0) {
              if (((ji) this).field_Gb != 0) {
                if (!param0) {
                  ((ji) this).field_yb = null;
                  return false;
                } else {
                  return false;
                }
              } else {
                if (((ji) this).field_yb.field_v + ((ji) this).field_yb.field_T <= n.field_m) {
                  if (!param0) {
                    ((ji) this).field_yb = null;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  ((ji) this).field_Gb = 3;
                  return true;
                }
              }
            } else {
              ((ji) this).field_Gb = ((ji) this).field_Gb - 1;
              if (((ji) this).field_Gb == 0) {
                if (((ji) this).field_yb.field_v + ((ji) this).field_yb.field_T > n.field_m) {
                  ((ji) this).field_Gb = 3;
                  return true;
                } else {
                  if (!param0) {
                    ((ji) this).field_yb = null;
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                if (!param0) {
                  ((ji) this).field_yb = null;
                  return false;
                } else {
                  return false;
                }
              }
            }
          } else {
            if (param0) {
              return false;
            } else {
              ((ji) this).field_yb = null;
              return false;
            }
          }
        }
    }

    final static void k(int param0) {
        int discarded$3 = -99;
        th.a();
        if (param0 != 0) {
            field_Eb = null;
            pn.field_z.b(22997);
            return;
        }
        pn.field_z.b(22997);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = "Reject <%0> from this game";
        field_Hb = -1;
    }
}
