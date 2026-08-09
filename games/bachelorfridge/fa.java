/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends kj {
    private kv field_j;
    private int field_h;
    private kv field_m;
    static sna field_k;
    static int field_f;
    static int field_l;
    private lna field_i;
    static fw field_g;

    final static boolean a(byte param0, pf param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -75) {
              L1: {
                if (param1.d(1, (byte) -72) != 1) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("fa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final static void a(boolean param0, int param1) {
        sna stackIn_7_0 = null;
        sna stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        sna stackIn_11_0 = null;
        sna stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        sna stackIn_21_0 = null;
        sna stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        sna stackIn_25_0 = null;
        sna stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        sna stackIn_36_0 = null;
        sna stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        sna stackIn_40_0 = null;
        sna stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        pf var3;
        L0: {
          ah.a(640 + dg.field_i >> 960283585, (byte) 106, 0, dg.field_i + -640 >> 2114839521, dg.field_c);
          if (0 >= lfa.field_q) {
            break L0;
          } else {
            L1: {
              if (nda.field_l != null) {
                nda.field_l.c(ng.field_e.field_kb, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                stackIn_7_0 = ng.field_e;

                if (!param0) {
                  break L3;
                } else {
                  stackIn_7_0 = (sna) ((Object) stackIn_7_0);

                  if (eda.field_j) {
                    break L3;
                  } else {
                    stackIn_8_0 = (sna) ((Object) stackIn_7_0);
                    stackIn_8_1 = 1;
                    break L2;
                  }
                }
              }
              stackIn_8_0 = (sna) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L2;
            }
            L4: {
              L5: {
                ((sna) (Object) stackIn_8_0).a(stackIn_8_1 != 0, 7802);
                stackIn_11_0 = ui.field_r;

                if (!param0) {
                  break L5;
                } else {
                  stackIn_11_0 = (sna) ((Object) stackIn_11_0);

                  if (eda.field_j) {
                    break L5;
                  } else {
                    stackIn_12_0 = (sna) ((Object) stackIn_11_0);
                    stackIn_12_1 = 1;
                    break L4;
                  }
                }
              }
              stackIn_12_0 = (sna) ((Object) stackIn_11_0);
              stackIn_12_1 = 0;
              break L4;
            }
            ((sna) (Object) stackIn_12_0).a(stackIn_12_1 != 0, 7802);
            break L0;
          }
        }
        L6: {
          if (ld.field_p > 0) {
            L7: {
              if (nda.field_l != null) {
                nda.field_l.c(ela.field_i.field_kb, 0);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              L9: {
                stackIn_36_0 = ela.field_i;

                if (!param0) {
                  break L9;
                } else {
                  stackIn_36_0 = (sna) ((Object) stackIn_36_0);

                  if (w.field_e) {
                    break L9;
                  } else {
                    stackIn_37_0 = (sna) ((Object) stackIn_36_0);
                    stackIn_37_1 = 1;
                    break L8;
                  }
                }
              }
              stackIn_37_0 = (sna) ((Object) stackIn_36_0);
              stackIn_37_1 = 0;
              break L8;
            }
            L10: {
              L11: {
                ((sna) (Object) stackIn_37_0).a(stackIn_37_1 != 0, 7802);
                stackIn_40_0 = ho.field_g;

                if (!param0) {
                  break L11;
                } else {
                  stackIn_40_0 = (sna) ((Object) stackIn_40_0);

                  if (w.field_e) {
                    break L11;
                  } else {
                    stackIn_41_0 = (sna) ((Object) stackIn_40_0);
                    stackIn_41_1 = 1;
                    break L10;
                  }
                }
              }
              stackIn_41_0 = (sna) ((Object) stackIn_40_0);
              stackIn_41_1 = 0;
              break L10;
            }
            ((sna) (Object) stackIn_41_0).a(stackIn_41_1 != 0, 7802);
            break L6;
          } else {
            if (0 >= dja.field_m) {
              break L6;
            } else {
              L12: {
                if (nda.field_l != null) {
                  nda.field_l.c(ela.field_i.field_kb, 0);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                L14: {
                  stackIn_21_0 = ela.field_i;

                  if (!param0) {
                    break L14;
                  } else {
                    stackIn_21_0 = (sna) ((Object) stackIn_21_0);

                    if (w.field_e) {
                      break L14;
                    } else {
                      stackIn_22_0 = (sna) ((Object) stackIn_21_0);
                      stackIn_22_1 = 1;
                      break L13;
                    }
                  }
                }
                stackIn_22_0 = (sna) ((Object) stackIn_21_0);
                stackIn_22_1 = 0;
                break L13;
              }
              L15: {
                L16: {
                  ((sna) (Object) stackIn_22_0).a(stackIn_22_1 != 0, 7802);
                  stackIn_25_0 = ho.field_g;

                  if (!param0) {
                    break L16;
                  } else {
                    stackIn_25_0 = (sna) ((Object) stackIn_25_0);

                    if (w.field_e) {
                      break L16;
                    } else {
                      stackIn_26_0 = (sna) ((Object) stackIn_25_0);
                      stackIn_26_1 = 1;
                      break L15;
                    }
                  }
                }
                stackIn_26_0 = (sna) ((Object) stackIn_25_0);
                stackIn_26_1 = 0;
                break L15;
              }
              ((sna) (Object) stackIn_26_0).a(stackIn_26_1 != 0, 7802);
              db.b(122);
              if (param1 != 26443) {
                var3 = (pf) null;
                fa.a((byte) 74, (pf) null);
                return;
              } else {
                return;
              }
            }
          }
        }
        db.b(122);
        if (param1 != 26443) {
          var3 = (pf) null;
          fa.a((byte) 74, (pf) null);
          return;
        } else {
          return;
        }
    }

    fa(gj param0, int param1, int param2, lna param3) {
        super(param0, param1, param2);
        try {
            this.field_i = param3;
            this.field_m = new kv(bd.field_i.field_q, bd.field_i.field_p);
            this.field_j = new kv(128, 64);
            bu.a(0, this.field_j);
            param0.field_s.field_p.e(0, 0, 16711680);
            db.b(107);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        int var1 = -10 / ((35 - param0) / 63);
        field_k = null;
        field_g = null;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = (int)((-Math.cos((double)(this.field_h * 4) * 3.141592653589793 / 50.0) + 1.0) * 64.0);
        super.a(param0, param1, param2);
        this.field_j.a(param2, param0, var4);
    }

    final boolean b(int param0) {
        int fieldTemp$1 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        if (-51 < (fieldTemp$1 ^ -1)) {
          if (param0 <= 21) {
            return true;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        L0: {
          this.field_i.e(86);
          if (this.field_i.field_x) {
            bd.field_i.e();
            break L0;
          } else {
            break L0;
          }
        }
        this.field_m.b();
        dg.d();
        bd.field_i.c(0, 0, 16711680);
        hga.field_U.a((byte) 127);
        this.field_m.c(param2 + 9, -90 + param0, this.field_m.field_q >> 747949089, this.field_m.field_p >> 2095366497, (int)((1.0 - Math.cos(3.141592653589793 * (double)(8 * this.field_h) / 50.0)) * 64.0));
        if (!param1) {
          this.a(102, 113, -38);
          return;
        } else {
          return;
        }
    }

    static {
        field_g = new fw(0, 0);
    }
}
