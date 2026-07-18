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
        Object var4 = null;
        if (param1) {
          ki.b(0, 0, ki.field_j, ki.field_f, 0, 192);
          wa.a(true, param1);
          if (param2 > 83) {
            return;
          } else {
            var4 = null;
            ai.a(-76, (hl[]) null, 116, -1, (hl[]) null, 61, (qe) null, 62, (qe) null, 22, -36, -35, -61, -45);
            return;
          }
        } else {
          ki.b();
          wa.a(true, param1);
          if (param2 > 83) {
            return;
          } else {
            var4 = null;
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
        if (((ai) this).field_e != null) {
          var2 = ((ai) this).field_f[(int)((long)(((ai) this).field_b - param0) & ((ai) this).field_d)];
          L0: while (true) {
            if (var2 != ((ai) this).field_e) {
              if (((ai) this).field_e.field_j == ((ai) this).field_d) {
                var3 = ((ai) this).field_e;
                ((ai) this).field_e = ((ai) this).field_e.field_m;
                return var3;
              } else {
                ((ai) this).field_e = ((ai) this).field_e.field_m;
                continue L0;
              }
            } else {
              ((ai) this).field_e = null;
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
        i stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        i stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
        try {
          L0: {
            var5_int = param0.a(param1, false);
            var6 = param0.a(param3, true, var5_int);
            stackOut_0_0 = ue.a(param4, (byte) -114, var6, var5_int, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("ai.H(");
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(true).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_1_0;
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
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ai.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
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
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param5).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param7).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param8 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
        }
    }

    final uh a(long param0, int param1) {
        uh var4 = null;
        uh var5 = null;
        int var6 = 0;
        uh var7 = null;
        uh var8 = null;
        var6 = StarCannon.field_A;
        ((ai) this).field_d = param0;
        if (param1 > 8) {
          var7 = ((ai) this).field_f[(int)((long)(((ai) this).field_b + -1) & param0)];
          var4 = var7;
          ((ai) this).field_e = var7.field_m;
          L0: while (true) {
            if (var4 != ((ai) this).field_e) {
              if (param0 == ((ai) this).field_e.field_j) {
                var5 = ((ai) this).field_e;
                ((ai) this).field_e = ((ai) this).field_e.field_m;
                return var5;
              } else {
                ((ai) this).field_e = ((ai) this).field_e.field_m;
                continue L0;
              }
            } else {
              ((ai) this).field_e = null;
              return null;
            }
          }
        } else {
          uh discarded$1 = ((ai) this).a(-91L, 63);
          var8 = ((ai) this).field_f[(int)((long)(((ai) this).field_b + -1) & param0)];
          var4 = var8;
          ((ai) this).field_e = var8.field_m;
          L1: while (true) {
            if (var4 != ((ai) this).field_e) {
              if (param0 == ((ai) this).field_e.field_j) {
                var5 = ((ai) this).field_e;
                ((ai) this).field_e = ((ai) this).field_e.field_m;
                return var5;
              } else {
                ((ai) this).field_e = ((ai) this).field_e.field_m;
                continue L1;
              }
            } else {
              ((ai) this).field_e = null;
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
              if (null == gj.field_f) {
                break L4;
              } else {
                if (param2 <= gj.field_f.length) {
                  if (ab.field_G == null) {
                    L5: {
                      L6: {
                        ab.field_G = new int[2 * param2];
                        if (null == fg.field_b) {
                          break L6;
                        } else {
                          if (fg.field_b.length < param2) {
                            break L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                      fg.field_b = new int[2 * param2];
                      break L5;
                    }
                    if (null == jk.field_c) {
                      L7: {
                        jk.field_c = new int[2 * (param2 + param0)];
                        if (le.field_d == null) {
                          break L7;
                        } else {
                          if (le.field_d.length >= param2) {
                            lh.field_s = -2147483648;
                            t.field_u = 2147483647;
                            ed.field_p = 0;
                            og.field_b = 2147483647;
                            mh.field_j = -2147483648;
                            return;
                          } else {
                            break L7;
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
                        L8: {
                          jk.field_c = new int[2 * (param2 + param0)];
                          if (le.field_d == null) {
                            break L8;
                          } else {
                            if (le.field_d.length >= param2) {
                              lh.field_s = -2147483648;
                              t.field_u = 2147483647;
                              ed.field_p = 0;
                              og.field_b = 2147483647;
                              mh.field_j = -2147483648;
                              return;
                            } else {
                              break L8;
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
                    if (param2 <= ab.field_G.length) {
                      L9: {
                        L10: {
                          if (null == fg.field_b) {
                            break L10;
                          } else {
                            if (fg.field_b.length < param2) {
                              break L10;
                            } else {
                              break L9;
                            }
                          }
                        }
                        fg.field_b = new int[2 * param2];
                        break L9;
                      }
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
                      L11: {
                        L12: {
                          ab.field_G = new int[2 * param2];
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
                      L13: {
                        L14: {
                          if (null == jk.field_c) {
                            break L14;
                          } else {
                            if (jk.field_c.length >= param0 + param2) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        jk.field_c = new int[2 * (param2 + param0)];
                        break L13;
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
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L15: {
              L16: {
                gj.field_f = new int[2 * param2];
                if (ab.field_G == null) {
                  break L16;
                } else {
                  if (param2 <= ab.field_G.length) {
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              ab.field_G = new int[2 * param2];
              break L15;
            }
            L17: {
              L18: {
                if (null == fg.field_b) {
                  break L18;
                } else {
                  if (fg.field_b.length < param2) {
                    break L18;
                  } else {
                    break L17;
                  }
                }
              }
              fg.field_b = new int[2 * param2];
              break L17;
            }
            L19: {
              L20: {
                if (null == jk.field_c) {
                  break L20;
                } else {
                  if (jk.field_c.length >= param0 + param2) {
                    break L19;
                  } else {
                    break L20;
                  }
                }
              }
              jk.field_c = new int[2 * (param2 + param0)];
              break L19;
            }
            L21: {
              if (le.field_d == null) {
                break L21;
              } else {
                if (le.field_d.length >= param2) {
                  lh.field_s = -2147483648;
                  t.field_u = 2147483647;
                  ed.field_p = 0;
                  og.field_b = 2147483647;
                  mh.field_j = -2147483648;
                  return;
                } else {
                  break L21;
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
            L22: {
              L23: {
                if (null == tk.field_f) {
                  break L23;
                } else {
                  if (tk.field_f.length >= param2) {
                    break L22;
                  } else {
                    break L23;
                  }
                }
              }
              tk.field_f = new int[param2 * 2];
              break L22;
            }
            L24: {
              L25: {
                if (nf.field_b == null) {
                  break L25;
                } else {
                  if (param2 > nf.field_b.length) {
                    break L25;
                  } else {
                    break L24;
                  }
                }
              }
              nf.field_b = new int[param2 * 2];
              break L24;
            }
            L26: {
              if (null == gj.field_f) {
                break L26;
              } else {
                if (param2 <= gj.field_f.length) {
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
                      L30: {
                        if (null == jk.field_c) {
                          break L30;
                        } else {
                          if (jk.field_c.length >= param0 + param2) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      jk.field_c = new int[2 * (param2 + param0)];
                      break L29;
                    }
                    L31: {
                      if (le.field_d == null) {
                        break L31;
                      } else {
                        if (le.field_d.length >= param2) {
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        } else {
                          break L31;
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
                      L32: {
                        L33: {
                          if (null == fg.field_b) {
                            break L33;
                          } else {
                            if (fg.field_b.length < param2) {
                              break L33;
                            } else {
                              break L32;
                            }
                          }
                        }
                        fg.field_b = new int[2 * param2];
                        break L32;
                      }
                      if (null == jk.field_c) {
                        L34: {
                          jk.field_c = new int[2 * (param2 + param0)];
                          if (le.field_d == null) {
                            break L34;
                          } else {
                            if (le.field_d.length >= param2) {
                              lh.field_s = -2147483648;
                              t.field_u = 2147483647;
                              ed.field_p = 0;
                              og.field_b = 2147483647;
                              mh.field_j = -2147483648;
                              return;
                            } else {
                              break L34;
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
                        }
                      }
                    } else {
                      L36: {
                        L37: {
                          ab.field_G = new int[2 * param2];
                          if (null == fg.field_b) {
                            break L37;
                          } else {
                            if (fg.field_b.length < param2) {
                              break L37;
                            } else {
                              break L36;
                            }
                          }
                        }
                        fg.field_b = new int[2 * param2];
                        break L36;
                      }
                      L38: {
                        L39: {
                          if (null == jk.field_c) {
                            break L39;
                          } else {
                            if (jk.field_c.length >= param0 + param2) {
                              break L38;
                            } else {
                              break L39;
                            }
                          }
                        }
                        jk.field_c = new int[2 * (param2 + param0)];
                        break L38;
                      }
                      L40: {
                        if (le.field_d == null) {
                          break L40;
                        } else {
                          if (le.field_d.length >= param2) {
                            lh.field_s = -2147483648;
                            t.field_u = 2147483647;
                            ed.field_p = 0;
                            og.field_b = 2147483647;
                            mh.field_j = -2147483648;
                            return;
                          } else {
                            break L40;
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
                  break L26;
                }
              }
            }
            L41: {
              L42: {
                gj.field_f = new int[2 * param2];
                if (ab.field_G == null) {
                  break L42;
                } else {
                  if (param2 <= ab.field_G.length) {
                    break L41;
                  } else {
                    break L42;
                  }
                }
              }
              ab.field_G = new int[2 * param2];
              break L41;
            }
            L43: {
              L44: {
                if (null == fg.field_b) {
                  break L44;
                } else {
                  if (fg.field_b.length < param2) {
                    break L44;
                  } else {
                    break L43;
                  }
                }
              }
              fg.field_b = new int[2 * param2];
              break L43;
            }
            L45: {
              L46: {
                if (null == jk.field_c) {
                  break L46;
                } else {
                  if (jk.field_c.length >= param0 + param2) {
                    break L45;
                  } else {
                    break L46;
                  }
                }
              }
              jk.field_c = new int[2 * (param2 + param0)];
              break L45;
            }
            L47: {
              if (le.field_d == null) {
                break L47;
              } else {
                if (le.field_d.length >= param2) {
                  lh.field_s = -2147483648;
                  t.field_u = 2147483647;
                  ed.field_p = 0;
                  og.field_b = 2147483647;
                  mh.field_j = -2147483648;
                  return;
                } else {
                  break L47;
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
          L48: {
            L49: {
              oh.field_c = new int[param2 * 2];
              if (null == tk.field_f) {
                break L49;
              } else {
                if (tk.field_f.length >= param2) {
                  break L48;
                } else {
                  break L49;
                }
              }
            }
            tk.field_f = new int[param2 * 2];
            break L48;
          }
          L50: {
            L51: {
              if (nf.field_b == null) {
                break L51;
              } else {
                if (param2 > nf.field_b.length) {
                  break L51;
                } else {
                  break L50;
                }
              }
            }
            nf.field_b = new int[param2 * 2];
            break L50;
          }
          L52: {
            if (null == gj.field_f) {
              break L52;
            } else {
              if (param2 <= gj.field_f.length) {
                if (ab.field_G == null) {
                  L53: {
                    L54: {
                      ab.field_G = new int[2 * param2];
                      if (null == fg.field_b) {
                        break L54;
                      } else {
                        if (fg.field_b.length < param2) {
                          break L54;
                        } else {
                          break L53;
                        }
                      }
                    }
                    fg.field_b = new int[2 * param2];
                    break L53;
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
                        ab.field_G = new int[2 * param2];
                        if (null == fg.field_b) {
                          break L63;
                        } else {
                          if (fg.field_b.length < param2) {
                            break L63;
                          } else {
                            break L62;
                          }
                        }
                      }
                      fg.field_b = new int[2 * param2];
                      break L62;
                    }
                    L64: {
                      L65: {
                        if (null == jk.field_c) {
                          break L65;
                        } else {
                          if (jk.field_c.length >= param0 + param2) {
                            break L64;
                          } else {
                            break L65;
                          }
                        }
                      }
                      jk.field_c = new int[2 * (param2 + param0)];
                      break L64;
                    }
                    L66: {
                      if (le.field_d == null) {
                        break L66;
                      } else {
                        if (le.field_d.length >= param2) {
                          lh.field_s = -2147483648;
                          t.field_u = 2147483647;
                          ed.field_p = 0;
                          og.field_b = 2147483647;
                          mh.field_j = -2147483648;
                          return;
                        } else {
                          break L66;
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
                break L52;
              }
            }
          }
          L67: {
            L68: {
              gj.field_f = new int[2 * param2];
              if (ab.field_G == null) {
                break L68;
              } else {
                if (param2 <= ab.field_G.length) {
                  break L67;
                } else {
                  break L68;
                }
              }
            }
            ab.field_G = new int[2 * param2];
            break L67;
          }
          L69: {
            L70: {
              if (null == fg.field_b) {
                break L70;
              } else {
                if (fg.field_b.length < param2) {
                  break L70;
                } else {
                  break L69;
                }
              }
            }
            fg.field_b = new int[2 * param2];
            break L69;
          }
          L71: {
            L72: {
              if (null == jk.field_c) {
                break L72;
              } else {
                if (jk.field_c.length >= param0 + param2) {
                  break L71;
                } else {
                  break L72;
                }
              }
            }
            jk.field_c = new int[2 * (param2 + param0)];
            break L71;
          }
          L73: {
            if (le.field_d == null) {
              break L73;
            } else {
              if (le.field_d.length >= param2) {
                lh.field_s = -2147483648;
                t.field_u = 2147483647;
                ed.field_p = 0;
                og.field_b = 2147483647;
                mh.field_j = -2147483648;
                return;
              } else {
                break L73;
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

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        if (param0 != 0) {
            field_h = null;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final void a(int param0, long param1, uh param2) {
        uh var5 = null;
        try {
            if (!(param2.field_f == null)) {
                param2.a(-6242);
            }
            var5 = ((ai) this).field_f[(int)((long)(-1 + ((ai) this).field_b) & param1)];
            param2.field_m = var5;
            param2.field_f = var5.field_f;
            if (param0 != 2) {
                boolean discarded$0 = ai.a((byte) -112);
            }
            param2.field_f.field_m = param2;
            param2.field_j = param1;
            param2.field_m.field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ai.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ai(int param0) {
        int var2 = 0;
        uh var3 = null;
        ((ai) this).field_b = param0;
        ((ai) this).field_f = new uh[param0];
        for (var2 = 0; param0 > var2; var2++) {
            uh dupTemp$0 = new uh();
            var3 = dupTemp$0;
            ((ai) this).field_f[var2] = dupTemp$0;
            var3.field_f = var3;
            var3.field_m = var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
        field_a = new sk();
    }
}
