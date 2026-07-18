/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jw extends b implements cd, tsa {
    private rj field_y;
    private tra field_A;
    private boolean field_w;
    private String field_F;
    private rj field_E;
    private rj field_B;
    static int[] field_z;
    private boolean field_x;
    private boolean field_D;
    private tra field_C;

    jw(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (isa) null);
        RuntimeException var6 = null;
        td var6_ref = null;
        il var7 = null;
        String var8 = null;
        nl var9 = null;
        jsa var12 = null;
        jsa var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_16_0 = null;
        rj stackIn_16_1 = null;
        rj stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        rj stackIn_17_1 = null;
        rj stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        rj stackIn_18_1 = null;
        rj stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_15_0 = null;
        rj stackOut_15_1 = null;
        rj stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        rj stackOut_17_1 = null;
        rj stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        rj stackOut_16_1 = null;
        rj stackOut_16_2 = null;
        String stackOut_16_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param4) {
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
            L2: {
              ((jw) this).field_w = stackIn_4_1 != 0;
              ((jw) this).field_F = param1;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((jw) this).field_x = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param3) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((jw) this).field_D = stackIn_10_1 != 0;
              if (!((jw) this).field_x) {
                break L4;
              } else {
                L5: {
                  if (((jw) this).field_D) {
                    break L5;
                  } else {
                    if (!((jw) this).field_w) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              ((jw) this).field_A = (tra) (Object) new so(param0, (qc) this, 100);
              ((jw) this).field_C = (tra) (Object) new so("", (qc) this, 20);
              if (((jw) this).field_x) {
                ((jw) this).field_B = new rj(nga.field_q, (qc) null);
                ((jw) this).field_y = new rj(nj.field_q, (qc) null);
                ((jw) this).field_A.field_y = false;
                break L6;
              } else {
                L7: {
                  ((jw) this).field_B = new rj(goa.field_c, (qc) null);
                  stackOut_15_0 = this;
                  stackOut_15_1 = null;
                  stackOut_15_2 = null;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (!((jw) this).field_w) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = sm.field_o;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L7;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = null;
                    stackOut_16_2 = null;
                    stackOut_16_3 = fca.field_d;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L7;
                  }
                }
                ((jw) this).field_y = new rj(stackIn_18_3, (qc) null);
                if (!((jw) this).field_D) {
                  break L6;
                } else {
                  ((jw) this).field_E = new rj(foa.field_a, (qc) this);
                  break L6;
                }
              }
            }
            L8: {
              ((jw) this).field_A.field_r = (isa) (Object) new hga(10000536);
              ((jw) this).field_C.field_r = (isa) (Object) new poa(10000536);
              var6_ref = new td();
              ((jw) this).field_B.field_r = (isa) (Object) var6_ref;
              if (((jw) this).field_y == null) {
                break L8;
              } else {
                ((jw) this).field_y.field_r = (isa) (Object) var6_ref;
                break L8;
              }
            }
            L9: {
              ((jw) this).field_A.field_q = kma.field_a;
              if (((jw) this).field_E == null) {
                break L9;
              } else {
                ((jw) this).field_E.field_r = (isa) (Object) var6_ref;
                break L9;
              }
            }
            L10: {
              if (null == ((jw) this).field_E) {
                break L10;
              } else {
                ((jw) this).field_E.field_q = hga.field_n;
                break L10;
              }
            }
            L11: {
              if (!((jw) this).field_x) {
                if (!((jw) this).field_w) {
                  ((jw) this).field_y.field_r = (isa) (Object) new kaa();
                  break L11;
                } else {
                  ((jw) this).field_y.field_q = tg.field_a;
                  ((jw) this).field_y.field_r = (isa) (Object) new kaa();
                  break L11;
                }
              } else {
                ((jw) this).field_y.field_q = koa.field_c;
                break L11;
              }
            }
            L12: {
              ((jw) this).field_n = 15;
              var7 = mj.field_J;
              if (null == ((jw) this).field_F) {
                break L12;
              } else {
                ((jw) this).field_n = ((jw) this).field_n + (var7.a(((jw) this).field_F, ((jw) this).field_m - 40, var7.field_w) + 5);
                break L12;
              }
            }
            L13: {
              var8 = c.field_h;
              var9 = cc.a((byte) 122, di.a(28));
              if (vw.field_a != var9) {
                if (var9 != ub.field_d) {
                  break L13;
                } else {
                  var8 = ppa.field_a;
                  break L13;
                }
              } else {
                var8 = daa.field_c;
                break L13;
              }
            }
            L14: {
              jsa dupTemp$2 = new jsa(10, ((jw) this).field_n, -20 + ((jw) this).field_m, 25, (ae) (Object) ((jw) this).field_A, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              ((jw) this).a((ae) (Object) dupTemp$2, -1);
              ((jw) this).field_n = ((jw) this).field_n + (((ae) (Object) var12).field_p + 5);
              jsa dupTemp$3 = new jsa(10, ((jw) this).field_n, -20 + ((jw) this).field_m, 25, (ae) (Object) ((jw) this).field_C, false, 80, 3, var7, 16777215, rta.field_j);
              var13 = dupTemp$3;
              ((jw) this).a((ae) (Object) dupTemp$3, -1);
              ((jw) this).field_n = ((jw) this).field_n + (((ae) (Object) var13).field_p - -5);
              ((jw) this).field_B.field_h = (qc) this;
              if (((jw) this).field_E == null) {
                break L14;
              } else {
                ((jw) this).field_E.field_h = (qc) this;
                break L14;
              }
            }
            L15: {
              if (null == ((jw) this).field_y) {
                break L15;
              } else {
                ((jw) this).field_y.field_h = (qc) this;
                break L15;
              }
            }
            L16: {
              if (((jw) this).field_E != null) {
                ((jw) this).field_B.a((byte) -31, ((jw) this).field_m - 95, 30, 85, ((jw) this).field_n);
                ((jw) this).field_n = ((jw) this).field_n + 60;
                break L16;
              } else {
                ((jw) this).field_B.a((byte) -31, -10 + (((jw) this).field_m + -6), 30, 8, ((jw) this).field_n);
                ((jw) this).field_n = ((jw) this).field_n + 35;
                break L16;
              }
            }
            L17: {
              if (((jw) this).field_E == null) {
                break L17;
              } else {
                ((jw) this).field_E.a((byte) -31, -10 + (((jw) this).field_m + -6), 30, 8, ((jw) this).field_n);
                ((jw) this).field_n = ((jw) this).field_n + 35;
                break L17;
              }
            }
            L18: {
              if (((jw) this).field_y == null) {
                break L18;
              } else {
                L19: {
                  if (((jw) this).field_x) {
                    break L19;
                  } else {
                    if (((jw) this).field_w) {
                      break L19;
                    } else {
                      ((jw) this).field_y.a((byte) -31, 40, 20, 8, ((jw) this).field_n);
                      ((jw) this).field_n = ((jw) this).field_n + 25;
                      break L18;
                    }
                  }
                }
                ((jw) this).field_y.a((byte) -31, -6 + ((jw) this).field_m + -10, 30, 8, ((jw) this).field_n);
                ((jw) this).field_n = ((jw) this).field_n + 35;
                break L18;
              }
            }
            L20: {
              ((jw) this).a((byte) -31, ((jw) this).field_m, 3 + ((jw) this).field_n, 0, 0);
              ((jw) this).a((ae) (Object) ((jw) this).field_B, -1);
              if (((jw) this).field_E == null) {
                break L20;
              } else {
                ((jw) this).a((ae) (Object) ((jw) this).field_E, -1);
                break L20;
              }
            }
            L21: {
              if (null == ((jw) this).field_y) {
                break L21;
              } else {
                ((jw) this).a((ae) (Object) ((jw) this).field_y, -1);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var6;
            stackOut_57_1 = new StringBuilder().append("jw.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void c(int param0) {
        field_z = null;
        int var1 = -9 % ((34 - param0) / 46);
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != ((jw) this).field_B) {
                if (param2 != ((jw) this).field_E) {
                  if (param2 != ((jw) this).field_y) {
                    break L1;
                  } else {
                    if (((jw) this).field_x) {
                      eo.q(83);
                      break L1;
                    } else {
                      if (!((jw) this).field_w) {
                        jga.b(50);
                        break L1;
                      } else {
                        gqa.a((byte) 62);
                        break L1;
                      }
                    }
                  }
                } else {
                  qfa.a((byte) 6);
                  break L1;
                }
              } else {
                this.i((byte) 85);
                break L1;
              }
            }
            L2: {
              if (param4 > 44) {
                break L2;
              } else {
                var8 = null;
                ((jw) this).a((String) null, -88);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("jw.M(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(tra param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -10) {
                break L1;
              } else {
                field_z = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jw.U(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(String param0, int param1) {
        tra var3 = null;
        String var4 = null;
        try {
            var3 = ((jw) this).field_A;
            var4 = param0;
            var3.a(false, -16719, var4);
            if (param1 < 121) {
                jw.c(-98);
            }
            ((jw) this).field_C.f(-10);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jw.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void i(byte param0) {
        if (param0 < 27) {
          return;
        } else {
          L0: {
            L1: {
              if (foa.a((byte) 91)) {
                break L1;
              } else {
                if (((jw) this).field_A.field_o.length() <= 0) {
                  break L0;
                } else {
                  if (((jw) this).field_C.field_o.length() <= 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            rt.a(true, ((jw) this).field_A.field_o, ((jw) this).field_C.field_o);
            break L0;
          }
          return;
        }
    }

    final void a(byte param0) {
        if (param0 != -92) {
            ((jw) this).field_w = false;
        }
        ((jw) this).field_A.f(-121);
        ((jw) this).field_C.f(param0 ^ 34);
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param2 == 98) {
                stackOut_5_0 = ((jw) this).b(param1, (byte) -81);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param2 != 99) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((jw) this).a(param1, (byte) -9);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("jw.P(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != ((jw) this).field_F) {
            int discarded$0 = mj.field_J.a(((jw) this).field_F, param0 + (((jw) this).field_i + 20), param1 + ((jw) this).field_n + 15, ((jw) this).field_m + -40, ((jw) this).field_p, 16777215, -1, 1, 0, mj.field_J.field_w);
        }
        if (!(((jw) this).field_E == null)) {
            bea.c(param0 - -10, param1 + 134, ((jw) this).field_m - 20, 4210752);
        }
        super.a(param0, param1, param2 + param2, param3);
    }

    public final void a(int param0, tra param1) {
        RuntimeException var3 = null;
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
              if (param0 == -6038) {
                break L1;
              } else {
                ((jw) this).field_A = null;
                break L1;
              }
            }
            L2: {
              if (((jw) this).field_A != param1) {
                break L2;
              } else {
                boolean discarded$2 = ((jw) this).field_C.a((ae) this, false);
                break L2;
              }
            }
            L3: {
              if (param1 != ((jw) this).field_C) {
                break L3;
              } else {
                this.i((byte) 60);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("jw.KA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final String a(int param0) {
        if (((jw) this).field_A.field_o == null) {
          return "";
        } else {
          L0: {
            if (param0 >= 29) {
              break L0;
            } else {
              ((jw) this).a(-72, 15, 19, 125);
              break L0;
            }
          }
          return ((jw) this).field_A.field_o;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[]{99, 179, 108, 280, 219, 303, 398, 439, 500};
    }
}
