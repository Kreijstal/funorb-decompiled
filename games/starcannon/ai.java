/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    static sk field_a;
    static hl field_g;
    private long field_d;
    private uh field_e;
    private uh[] field_f;
    private int field_b;
    static boolean field_c;
    static qe field_h;

    final static void a(boolean param0, boolean param1, byte param2) {
        qe var4 = null;
        if (param1) {
          ki.b(0, 0, ki.field_j, ki.field_f, 0, 192);
          wa.a(true, param1);
          if (param2 > 83) {
            return;
          } else {
            var4 = (qe) null;
            ai.a(-76, (hl[]) null, 116, -1, (hl[]) null, 61, (qe) null, 62, (qe) null, 22, -36, -35, -61, -45);
            return;
          }
        } else {
          ki.b();
          wa.a(true, param1);
          if (param2 > 83) {
            return;
          } else {
            var4 = (qe) null;
            ai.a(-76, (hl[]) null, 116, -1, (hl[]) null, 61, (qe) null, 62, (qe) null, 22, -36, -35, -61, -45);
            return;
          }
        }
    }

    final uh b(int param0) {
        uh var2 = null;
        uh var3 = null;
        int var4 = 0;
        var4 = StarCannon.field_A;
        if (this.field_e != null) {
          var2 = this.field_f[(int)((long)(this.field_b - param0) & this.field_d)];
          L0: while (true) {
            if (var2 != this.field_e) {
              if (this.field_e.field_j == this.field_d) {
                var3 = this.field_e;
                this.field_e = this.field_e.field_m;
                return var3;
              } else {
                this.field_e = this.field_e.field_m;
                continue L0;
              }
            } else {
              this.field_e = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        var1 = 99 % ((41 - param0) / 50);
        if (10 <= bl.field_a) {
          if (rk.field_d < 13) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static i a(ue param0, String param1, boolean param2, String param3, ue param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ue stackIn_1_0 = null;
        String stackIn_1_1 = null;
        ue stackIn_2_0 = null;
        String stackIn_2_1 = null;
        ue stackIn_3_0 = null;
        String stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        i stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ue stackOut_0_0 = null;
        String stackOut_0_1 = null;
        ue stackOut_2_0 = null;
        String stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        ue stackOut_1_0 = null;
        String stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        i stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = (ue) (param0);
              stackOut_0_1 = (String) (param1);
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (param2) {
                stackOut_2_0 = (ue) ((Object) stackIn_2_0);
                stackOut_2_1 = (String) ((Object) stackIn_2_1);
                stackOut_2_2 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = (ue) ((Object) stackIn_1_0);
                stackOut_1_1 = (String) ((Object) stackIn_1_1);
                stackOut_1_2 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            var5_int = ((ue) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0);
            var6 = param0.a(param3, param2, var5_int);
            stackOut_3_0 = ue.a(param4, (byte) -114, var6, var5_int, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("ai.H(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, hl[] param1, int param2, int param3, hl[] param4, int param5, qe param6, int param7, qe param8, int param9, int param10, int param11, int param12, int param13) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
        try {
          L0: {
            L1: {
              ob.a(123);
              if (param12 == 25574) {
                break L1;
              } else {
                ai.a(-124);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ai.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param5).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param7).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param8 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
        }
    }

    final uh a(long param0, int param1) {
        uh discarded$1 = null;
        uh var4 = null;
        uh var5 = null;
        int var6 = 0;
        var6 = StarCannon.field_A;
        this.field_d = param0;
        if (param1 > 8) {
          var4 = this.field_f[(int)((long)(this.field_b + -1) & param0)];
          this.field_e = var4.field_m;
          L0: while (true) {
            if (var4 != this.field_e) {
              if (param0 == this.field_e.field_j) {
                var5 = this.field_e;
                this.field_e = this.field_e.field_m;
                return var5;
              } else {
                this.field_e = this.field_e.field_m;
                continue L0;
              }
            } else {
              this.field_e = null;
              return null;
            }
          }
        } else {
          discarded$1 = this.a(-91L, 63);
          var4 = this.field_f[(int)((long)(this.field_b + -1) & param0)];
          this.field_e = var4.field_m;
          L1: while (true) {
            if (var4 != this.field_e) {
              if (param0 == this.field_e.field_j) {
                var5 = this.field_e;
                this.field_e = this.field_e.field_m;
                return var5;
              } else {
                this.field_e = this.field_e.field_m;
                continue L1;
              }
            } else {
              this.field_e = null;
              return null;
            }
          }
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (null != oh.field_c) {
          if (oh.field_c.length < param2) {
            L0: {
              L1: {
                oh.field_c = new int[param2 * 2];
                if (null == tk.field_f) {
                  break L1;
                } else {
                  if (tk.field_f.length >= param2) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              tk.field_f = new int[param2 * 2];
              break L0;
            }
            L2: {
              L3: {
                if (nf.field_b == null) {
                  break L3;
                } else {
                  if (param2 > nf.field_b.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              nf.field_b = new int[param2 * 2];
              break L2;
            }
            L4: {
              L5: {
                if (null == gj.field_f) {
                  break L5;
                } else {
                  if (param2 <= gj.field_f.length) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              gj.field_f = new int[2 * param2];
              break L4;
            }
            if (ab.field_G == null) {
              L6: {
                L7: {
                  ab.field_G = new int[2 * param2];
                  if (null == fg.field_b) {
                    break L7;
                  } else {
                    if (fg.field_b.length < param2) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                fg.field_b = new int[2 * param2];
                break L6;
              }
              L8: {
                if (!param1) {
                  break L8;
                } else {
                  field_g = (hl) null;
                  break L8;
                }
              }
              L9: {
                L10: {
                  if (null == jk.field_c) {
                    break L10;
                  } else {
                    if (jk.field_c.length >= param0 + param2) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                jk.field_c = new int[2 * (param2 + param0)];
                break L9;
              }
              if (le.field_d == null) {
                le.field_d = new boolean[2 * param2];
                lh.field_s = -2147483648;
                t.field_u = 2147483647;
                ed.field_p = 0;
                og.field_b = 2147483647;
                mh.field_j = -2147483648;
                return;
              } else {
                if (le.field_d.length < param2) {
                  le.field_d = new boolean[2 * param2];
                  lh.field_s = -2147483648;
                  t.field_u = 2147483647;
                  ed.field_p = 0;
                  og.field_b = 2147483647;
                  mh.field_j = -2147483648;
                  return;
                } else {
                  lh.field_s = -2147483648;
                  t.field_u = 2147483647;
                  ed.field_p = 0;
                  og.field_b = 2147483647;
                  mh.field_j = -2147483648;
                  return;
                }
              }
            } else {
              if (param2 <= ab.field_G.length) {
                L11: {
                  L12: {
                    if (null == fg.field_b) {
                      break L12;
                    } else {
                      if (fg.field_b.length < param2) {
                        break L12;
                      } else {
                        break L11;
                      }
                    }
                  }
                  fg.field_b = new int[2 * param2];
                  break L11;
                }
                if (!param1) {
                  if (null == jk.field_c) {
                    jk.field_c = new int[2 * (param2 + param0)];
                    if (le.field_d == null) {
                      le.field_d = new boolean[2 * param2];
                      lh.field_s = -2147483648;
                      t.field_u = 2147483647;
                      ed.field_p = 0;
                      og.field_b = 2147483647;
                      mh.field_j = -2147483648;
                      return;
                    } else {
                      if (le.field_d.length < param2) {
                        le.field_d = new boolean[2 * param2];
                        lh.field_s = -2147483648;
                        t.field_u = 2147483647;
                        ed.field_p = 0;
                        og.field_b = 2147483647;
                        mh.field_j = -2147483648;
                        return;
                      } else {
                        lh.field_s = -2147483648;
                        t.field_u = 2147483647;
                        ed.field_p = 0;
                        og.field_b = 2147483647;
                        mh.field_j = -2147483648;
                        return;
                      }
                    }
                  } else {
                    if (jk.field_c.length >= param0 + param2) {
                      if (le.field_d == null) {
                        le.field_d = new boolean[2 * param2];
                        lh.field_s = -2147483648;
                        t.field_u = 2147483647;
                        ed.field_p = 0;
                        og.field_b = 2147483647;
                        mh.field_j = -2147483648;
                        return;
                      } else {
                        if (le.field_d.length < param2) {
                          le.field_d = new boolean[2 * param2];
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        } else {
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        }
                      }
                    } else {
                      jk.field_c = new int[2 * (param2 + param0)];
                      if (le.field_d == null) {
                        le.field_d = new boolean[2 * param2];
                        lh.field_s = -2147483648;
                        t.field_u = 2147483647;
                        ed.field_p = 0;
                        og.field_b = 2147483647;
                        mh.field_j = -2147483648;
                        return;
                      } else {
                        if (le.field_d.length < param2) {
                          le.field_d = new boolean[2 * param2];
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        } else {
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  field_g = (hl) null;
                  if (null == jk.field_c) {
                    L13: {
                      jk.field_c = new int[2 * (param2 + param0)];
                      if (le.field_d == null) {
                        break L13;
                      } else {
                        if (le.field_d.length >= param2) {
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        } else {
                          break L13;
                        }
                      }
                    }
                    le.field_d = new boolean[2 * param2];
                    lh.field_s = -2147483648;
                    t.field_u = 2147483647;
                    ed.field_p = 0;
                    og.field_b = 2147483647;
                    mh.field_j = -2147483648;
                    return;
                  } else {
                    if (jk.field_c.length >= param0 + param2) {
                      if (le.field_d == null) {
                        le.field_d = new boolean[2 * param2];
                        lh.field_s = -2147483648;
                        t.field_u = 2147483647;
                        ed.field_p = 0;
                        og.field_b = 2147483647;
                        mh.field_j = -2147483648;
                        return;
                      } else {
                        if (le.field_d.length < param2) {
                          le.field_d = new boolean[2 * param2];
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        } else {
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        }
                      }
                    } else {
                      L14: {
                        jk.field_c = new int[2 * (param2 + param0)];
                        if (le.field_d == null) {
                          break L14;
                        } else {
                          if (le.field_d.length >= param2) {
                            lh.field_s = -2147483648;
                            t.field_u = 2147483647;
                            ed.field_p = 0;
                            og.field_b = 2147483647;
                            mh.field_j = -2147483648;
                            return;
                          } else {
                            break L14;
                          }
                        }
                      }
                      le.field_d = new boolean[2 * param2];
                      lh.field_s = -2147483648;
                      t.field_u = 2147483647;
                      ed.field_p = 0;
                      og.field_b = 2147483647;
                      mh.field_j = -2147483648;
                      return;
                    }
                  }
                }
              } else {
                L15: {
                  L16: {
                    ab.field_G = new int[2 * param2];
                    if (null == fg.field_b) {
                      break L16;
                    } else {
                      if (fg.field_b.length < param2) {
                        break L16;
                      } else {
                        break L15;
                      }
                    }
                  }
                  fg.field_b = new int[2 * param2];
                  break L15;
                }
                L17: {
                  if (!param1) {
                    break L17;
                  } else {
                    field_g = (hl) null;
                    break L17;
                  }
                }
                L18: {
                  L19: {
                    if (null == jk.field_c) {
                      break L19;
                    } else {
                      if (jk.field_c.length >= param0 + param2) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  jk.field_c = new int[2 * (param2 + param0)];
                  break L18;
                }
                L20: {
                  if (le.field_d == null) {
                    break L20;
                  } else {
                    if (le.field_d.length >= param2) {
                      lh.field_s = -2147483648;
                      t.field_u = 2147483647;
                      ed.field_p = 0;
                      og.field_b = 2147483647;
                      mh.field_j = -2147483648;
                      return;
                    } else {
                      break L20;
                    }
                  }
                }
                le.field_d = new boolean[2 * param2];
                lh.field_s = -2147483648;
                t.field_u = 2147483647;
                ed.field_p = 0;
                og.field_b = 2147483647;
                mh.field_j = -2147483648;
                return;
              }
            }
          } else {
            L21: {
              L22: {
                if (null == tk.field_f) {
                  break L22;
                } else {
                  if (tk.field_f.length >= param2) {
                    break L21;
                  } else {
                    break L22;
                  }
                }
              }
              tk.field_f = new int[param2 * 2];
              break L21;
            }
            L23: {
              L24: {
                if (nf.field_b == null) {
                  break L24;
                } else {
                  if (param2 > nf.field_b.length) {
                    break L24;
                  } else {
                    break L23;
                  }
                }
              }
              nf.field_b = new int[param2 * 2];
              break L23;
            }
            L25: {
              L26: {
                if (null == gj.field_f) {
                  break L26;
                } else {
                  if (param2 <= gj.field_f.length) {
                    break L25;
                  } else {
                    break L26;
                  }
                }
              }
              gj.field_f = new int[2 * param2];
              break L25;
            }
            if (ab.field_G == null) {
              L27: {
                L28: {
                  ab.field_G = new int[2 * param2];
                  if (null == fg.field_b) {
                    break L28;
                  } else {
                    if (fg.field_b.length < param2) {
                      break L28;
                    } else {
                      break L27;
                    }
                  }
                }
                fg.field_b = new int[2 * param2];
                break L27;
              }
              L29: {
                if (!param1) {
                  break L29;
                } else {
                  field_g = (hl) null;
                  break L29;
                }
              }
              L30: {
                L31: {
                  if (null == jk.field_c) {
                    break L31;
                  } else {
                    if (jk.field_c.length >= param0 + param2) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                jk.field_c = new int[2 * (param2 + param0)];
                break L30;
              }
              L32: {
                if (le.field_d == null) {
                  break L32;
                } else {
                  if (le.field_d.length >= param2) {
                    lh.field_s = -2147483648;
                    t.field_u = 2147483647;
                    ed.field_p = 0;
                    og.field_b = 2147483647;
                    mh.field_j = -2147483648;
                    return;
                  } else {
                    break L32;
                  }
                }
              }
              le.field_d = new boolean[2 * param2];
              lh.field_s = -2147483648;
              t.field_u = 2147483647;
              ed.field_p = 0;
              og.field_b = 2147483647;
              mh.field_j = -2147483648;
              return;
            } else {
              if (param2 <= ab.field_G.length) {
                L33: {
                  L34: {
                    if (null == fg.field_b) {
                      break L34;
                    } else {
                      if (fg.field_b.length < param2) {
                        break L34;
                      } else {
                        break L33;
                      }
                    }
                  }
                  fg.field_b = new int[2 * param2];
                  break L33;
                }
                if (!param1) {
                  if (null == jk.field_c) {
                    L35: {
                      jk.field_c = new int[2 * (param2 + param0)];
                      if (le.field_d == null) {
                        break L35;
                      } else {
                        if (le.field_d.length >= param2) {
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        } else {
                          break L35;
                        }
                      }
                    }
                    le.field_d = new boolean[2 * param2];
                    lh.field_s = -2147483648;
                    t.field_u = 2147483647;
                    ed.field_p = 0;
                    og.field_b = 2147483647;
                    mh.field_j = -2147483648;
                    return;
                  } else {
                    if (jk.field_c.length >= param0 + param2) {
                      if (le.field_d == null) {
                        le.field_d = new boolean[2 * param2];
                        lh.field_s = -2147483648;
                        t.field_u = 2147483647;
                        ed.field_p = 0;
                        og.field_b = 2147483647;
                        mh.field_j = -2147483648;
                        return;
                      } else {
                        if (le.field_d.length < param2) {
                          le.field_d = new boolean[2 * param2];
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        } else {
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        }
                      }
                    } else {
                      L36: {
                        jk.field_c = new int[2 * (param2 + param0)];
                        if (le.field_d == null) {
                          break L36;
                        } else {
                          if (le.field_d.length >= param2) {
                            lh.field_s = -2147483648;
                            t.field_u = 2147483647;
                            ed.field_p = 0;
                            og.field_b = 2147483647;
                            mh.field_j = -2147483648;
                            return;
                          } else {
                            break L36;
                          }
                        }
                      }
                      le.field_d = new boolean[2 * param2];
                      lh.field_s = -2147483648;
                      t.field_u = 2147483647;
                      ed.field_p = 0;
                      og.field_b = 2147483647;
                      mh.field_j = -2147483648;
                      return;
                    }
                  }
                } else {
                  L37: {
                    L38: {
                      field_g = (hl) null;
                      if (null == jk.field_c) {
                        break L38;
                      } else {
                        if (jk.field_c.length >= param0 + param2) {
                          break L37;
                        } else {
                          break L38;
                        }
                      }
                    }
                    jk.field_c = new int[2 * (param2 + param0)];
                    break L37;
                  }
                  L39: {
                    if (le.field_d == null) {
                      break L39;
                    } else {
                      if (le.field_d.length >= param2) {
                        lh.field_s = -2147483648;
                        t.field_u = 2147483647;
                        ed.field_p = 0;
                        og.field_b = 2147483647;
                        mh.field_j = -2147483648;
                        return;
                      } else {
                        break L39;
                      }
                    }
                  }
                  le.field_d = new boolean[2 * param2];
                  lh.field_s = -2147483648;
                  t.field_u = 2147483647;
                  ed.field_p = 0;
                  og.field_b = 2147483647;
                  mh.field_j = -2147483648;
                  return;
                }
              } else {
                L40: {
                  L41: {
                    ab.field_G = new int[2 * param2];
                    if (null == fg.field_b) {
                      break L41;
                    } else {
                      if (fg.field_b.length < param2) {
                        break L41;
                      } else {
                        break L40;
                      }
                    }
                  }
                  fg.field_b = new int[2 * param2];
                  break L40;
                }
                L42: {
                  if (!param1) {
                    break L42;
                  } else {
                    field_g = (hl) null;
                    break L42;
                  }
                }
                L43: {
                  L44: {
                    if (null == jk.field_c) {
                      break L44;
                    } else {
                      if (jk.field_c.length >= param0 + param2) {
                        break L43;
                      } else {
                        break L44;
                      }
                    }
                  }
                  jk.field_c = new int[2 * (param2 + param0)];
                  break L43;
                }
                L45: {
                  if (le.field_d == null) {
                    break L45;
                  } else {
                    if (le.field_d.length >= param2) {
                      lh.field_s = -2147483648;
                      t.field_u = 2147483647;
                      ed.field_p = 0;
                      og.field_b = 2147483647;
                      mh.field_j = -2147483648;
                      return;
                    } else {
                      break L45;
                    }
                  }
                }
                le.field_d = new boolean[2 * param2];
                lh.field_s = -2147483648;
                t.field_u = 2147483647;
                ed.field_p = 0;
                og.field_b = 2147483647;
                mh.field_j = -2147483648;
                return;
              }
            }
          }
        } else {
          L46: {
            L47: {
              oh.field_c = new int[param2 * 2];
              if (null == tk.field_f) {
                break L47;
              } else {
                if (tk.field_f.length >= param2) {
                  break L46;
                } else {
                  break L47;
                }
              }
            }
            tk.field_f = new int[param2 * 2];
            break L46;
          }
          L48: {
            L49: {
              if (nf.field_b == null) {
                break L49;
              } else {
                if (param2 > nf.field_b.length) {
                  break L49;
                } else {
                  break L48;
                }
              }
            }
            nf.field_b = new int[param2 * 2];
            break L48;
          }
          L50: {
            L51: {
              if (null == gj.field_f) {
                break L51;
              } else {
                if (param2 <= gj.field_f.length) {
                  break L50;
                } else {
                  break L51;
                }
              }
            }
            gj.field_f = new int[2 * param2];
            break L50;
          }
          if (ab.field_G == null) {
            L52: {
              L53: {
                ab.field_G = new int[2 * param2];
                if (null == fg.field_b) {
                  break L53;
                } else {
                  if (fg.field_b.length < param2) {
                    break L53;
                  } else {
                    break L52;
                  }
                }
              }
              fg.field_b = new int[2 * param2];
              break L52;
            }
            L54: {
              if (!param1) {
                break L54;
              } else {
                field_g = (hl) null;
                break L54;
              }
            }
            L55: {
              L56: {
                if (null == jk.field_c) {
                  break L56;
                } else {
                  if (jk.field_c.length >= param0 + param2) {
                    break L55;
                  } else {
                    break L56;
                  }
                }
              }
              jk.field_c = new int[2 * (param2 + param0)];
              break L55;
            }
            L57: {
              if (le.field_d == null) {
                break L57;
              } else {
                if (le.field_d.length >= param2) {
                  lh.field_s = -2147483648;
                  t.field_u = 2147483647;
                  ed.field_p = 0;
                  og.field_b = 2147483647;
                  mh.field_j = -2147483648;
                  return;
                } else {
                  break L57;
                }
              }
            }
            le.field_d = new boolean[2 * param2];
            lh.field_s = -2147483648;
            t.field_u = 2147483647;
            ed.field_p = 0;
            og.field_b = 2147483647;
            mh.field_j = -2147483648;
            return;
          } else {
            if (param2 <= ab.field_G.length) {
              L58: {
                L59: {
                  if (null == fg.field_b) {
                    break L59;
                  } else {
                    if (fg.field_b.length < param2) {
                      break L59;
                    } else {
                      break L58;
                    }
                  }
                }
                fg.field_b = new int[2 * param2];
                break L58;
              }
              if (!param1) {
                if (null == jk.field_c) {
                  L60: {
                    jk.field_c = new int[2 * (param2 + param0)];
                    if (le.field_d == null) {
                      break L60;
                    } else {
                      if (le.field_d.length >= param2) {
                        lh.field_s = -2147483648;
                        t.field_u = 2147483647;
                        ed.field_p = 0;
                        og.field_b = 2147483647;
                        mh.field_j = -2147483648;
                        return;
                      } else {
                        break L60;
                      }
                    }
                  }
                  le.field_d = new boolean[2 * param2];
                  lh.field_s = -2147483648;
                  t.field_u = 2147483647;
                  ed.field_p = 0;
                  og.field_b = 2147483647;
                  mh.field_j = -2147483648;
                  return;
                } else {
                  if (jk.field_c.length >= param0 + param2) {
                    if (le.field_d == null) {
                      le.field_d = new boolean[2 * param2];
                      lh.field_s = -2147483648;
                      t.field_u = 2147483647;
                      ed.field_p = 0;
                      og.field_b = 2147483647;
                      mh.field_j = -2147483648;
                      return;
                    } else {
                      if (le.field_d.length < param2) {
                        le.field_d = new boolean[2 * param2];
                        lh.field_s = -2147483648;
                        t.field_u = 2147483647;
                        ed.field_p = 0;
                        og.field_b = 2147483647;
                        mh.field_j = -2147483648;
                        return;
                      } else {
                        lh.field_s = -2147483648;
                        t.field_u = 2147483647;
                        ed.field_p = 0;
                        og.field_b = 2147483647;
                        mh.field_j = -2147483648;
                        return;
                      }
                    }
                  } else {
                    L61: {
                      jk.field_c = new int[2 * (param2 + param0)];
                      if (le.field_d == null) {
                        break L61;
                      } else {
                        if (le.field_d.length >= param2) {
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        } else {
                          break L61;
                        }
                      }
                    }
                    le.field_d = new boolean[2 * param2];
                    lh.field_s = -2147483648;
                    t.field_u = 2147483647;
                    ed.field_p = 0;
                    og.field_b = 2147483647;
                    mh.field_j = -2147483648;
                    return;
                  }
                }
              } else {
                L62: {
                  L63: {
                    field_g = (hl) null;
                    if (null == jk.field_c) {
                      break L63;
                    } else {
                      if (jk.field_c.length >= param0 + param2) {
                        break L62;
                      } else {
                        break L63;
                      }
                    }
                  }
                  jk.field_c = new int[2 * (param2 + param0)];
                  break L62;
                }
                L64: {
                  if (le.field_d == null) {
                    break L64;
                  } else {
                    if (le.field_d.length >= param2) {
                      lh.field_s = -2147483648;
                      t.field_u = 2147483647;
                      ed.field_p = 0;
                      og.field_b = 2147483647;
                      mh.field_j = -2147483648;
                      return;
                    } else {
                      break L64;
                    }
                  }
                }
                le.field_d = new boolean[2 * param2];
                lh.field_s = -2147483648;
                t.field_u = 2147483647;
                ed.field_p = 0;
                og.field_b = 2147483647;
                mh.field_j = -2147483648;
                return;
              }
            } else {
              L65: {
                L66: {
                  ab.field_G = new int[2 * param2];
                  if (null == fg.field_b) {
                    break L66;
                  } else {
                    if (fg.field_b.length < param2) {
                      break L66;
                    } else {
                      break L65;
                    }
                  }
                }
                fg.field_b = new int[2 * param2];
                break L65;
              }
              L67: {
                if (!param1) {
                  break L67;
                } else {
                  field_g = (hl) null;
                  break L67;
                }
              }
              L68: {
                L69: {
                  if (null == jk.field_c) {
                    break L69;
                  } else {
                    if (jk.field_c.length >= param0 + param2) {
                      break L68;
                    } else {
                      break L69;
                    }
                  }
                }
                jk.field_c = new int[2 * (param2 + param0)];
                break L68;
              }
              L70: {
                if (le.field_d == null) {
                  break L70;
                } else {
                  if (le.field_d.length >= param2) {
                    lh.field_s = -2147483648;
                    t.field_u = 2147483647;
                    ed.field_p = 0;
                    og.field_b = 2147483647;
                    mh.field_j = -2147483648;
                    return;
                  } else {
                    break L70;
                  }
                }
              }
              le.field_d = new boolean[2 * param2];
              lh.field_s = -2147483648;
              t.field_u = 2147483647;
              ed.field_p = 0;
              og.field_b = 2147483647;
              mh.field_j = -2147483648;
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        if (param0 != 0) {
            field_h = (qe) null;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final void a(int param0, long param1, uh param2) {
        uh var5 = null;
        boolean discarded$0 = false;
        try {
            if (!(param2.field_f == null)) {
                param2.a(-6242);
            }
            var5 = this.field_f[(int)((long)(-1 + this.field_b) & param1)];
            param2.field_m = var5;
            param2.field_f = var5.field_f;
            if (param0 != 2) {
                discarded$0 = ai.a((byte) -112);
            }
            param2.field_f.field_m = param2;
            param2.field_j = param1;
            param2.field_m.field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ai.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ai(int param0) {
        int var2 = 0;
        uh dupTemp$0 = null;
        uh var3 = null;
        this.field_b = param0;
        this.field_f = new uh[param0];
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new uh();
            var3 = dupTemp$0;
            this.field_f[var2] = dupTemp$0;
            var3.field_f = var3;
            var3.field_m = var3;
        }
    }

    static {
        field_c = true;
        field_a = new sk();
    }
}
