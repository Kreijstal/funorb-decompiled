/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class na extends kc {
    int field_ac;
    kc field_hc;
    String field_ic;
    static String field_Sb;
    int field_Fb;
    kc field_Kb;
    long field_Yb;
    kc field_fc;
    kc field_Vb;
    kc field_Mb;
    kc[] field_pc;
    int field_nc;
    kc field_Ib;
    kc field_Gb;
    boolean field_Lb;
    kc field_jc;
    kc field_Jb;
    static String field_gc;
    long field_Bb;
    int field_Db;
    int field_bc;
    boolean field_Hb;
    kc field_Zb;
    byte[] field_Wb;
    int field_Rb;
    kc field_Eb;
    kc field_Ub;
    kc field_cc;
    int field_dc;
    boolean field_oc;
    boolean field_Ob;
    kc field_Cb;
    kc field_ec;
    int field_Pb;
    static String field_lc;
    static String field_Tb;
    boolean field_kc;
    boolean field_mc;
    kc field_Xb;
    String[] field_Qb;
    boolean field_Nb;

    final int h(byte param0) {
        if (param0 < 46) {
            return 4;
        }
        return (int)((na) this).b(false);
    }

    public static void g() {
        field_lc = null;
        field_Tb = null;
        field_Sb = null;
        field_gc = null;
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -34) {
          L0: {
            boolean discarded$10 = ((na) this).e(102);
            if (((na) this).d((byte) -17)) {
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
            if (((na) this).d((byte) -17)) {
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

    final boolean a(na param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_33_0 = false;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_82_0 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        boolean stackOut_32_0 = false;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        try {
          L0: {
            if (param1 == 2) {
              L1: {
                if (!((na) this).field_Hb) {
                  if (((na) this).field_ac == 6) {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_9_0 = stackOut_6_0;
                    break L1;
                  }
                } else {
                  stackOut_4_0 = 1;
                  stackIn_9_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var3_int = stackIn_9_0;
                if (!param0.field_Hb) {
                  if (param0.field_ac == 6) {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L2;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_15_0 = stackOut_12_0;
                    break L2;
                  }
                } else {
                  stackOut_10_0 = 1;
                  stackIn_15_0 = stackOut_10_0;
                  break L2;
                }
              }
              L3: {
                var4 = stackIn_15_0;
                if (var4 != 0) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                } else {
                  stackOut_16_0 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  break L3;
                }
              }
              L4: {
                stackOut_18_0 = stackIn_18_0;
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (var3_int != 0) {
                  stackOut_20_0 = stackIn_20_0;
                  stackOut_20_1 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L4;
                } else {
                  stackOut_19_0 = stackIn_19_0;
                  stackOut_19_1 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  break L4;
                }
              }
              if (stackIn_21_0 != stackIn_21_1) {
                stackOut_23_0 = var3_int;
                stackIn_24_0 = stackOut_23_0;
                return stackIn_24_0 != 0;
              } else {
                L5: {
                  if (var3_int == 0) {
                    L6: {
                      if (param0.field_Ob) {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        break L6;
                      } else {
                        stackOut_28_0 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        break L6;
                      }
                    }
                    if (stackIn_30_0 == (((na) this).field_Ob ? 1 : 0)) {
                      stackOut_32_0 = ((na) this).field_Ob;
                      stackIn_33_0 = stackOut_32_0;
                      return stackIn_33_0;
                    } else {
                      if (!((na) this).field_Ob) {
                        break L5;
                      } else {
                        if (((na) this).field_Pb != param0.field_Pb) {
                          L7: {
                            if (param0.field_Pb <= ((na) this).field_Pb) {
                              stackOut_39_0 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              break L7;
                            } else {
                              stackOut_38_0 = 1;
                              stackIn_40_0 = stackOut_38_0;
                              break L7;
                            }
                          }
                          return stackIn_40_0 != 0;
                        } else {
                          break L5;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if (((na) this).field_Lb) {
                    stackOut_43_0 = 0;
                    stackIn_44_0 = stackOut_43_0;
                    break L8;
                  } else {
                    stackOut_42_0 = 1;
                    stackIn_44_0 = stackOut_42_0;
                    break L8;
                  }
                }
                L9: {
                  stackOut_44_0 = stackIn_44_0;
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_45_0 = stackOut_44_0;
                  if (param0.field_Lb) {
                    stackOut_46_0 = stackIn_46_0;
                    stackOut_46_1 = 0;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    break L9;
                  } else {
                    stackOut_45_0 = stackIn_45_0;
                    stackOut_45_1 = 1;
                    stackIn_47_0 = stackOut_45_0;
                    stackIn_47_1 = stackOut_45_1;
                    break L9;
                  }
                }
                if (stackIn_47_0 != stackIn_47_1) {
                  L10: {
                    if (((na) this).field_Lb) {
                      stackOut_51_0 = 0;
                      stackIn_52_0 = stackOut_51_0;
                      break L10;
                    } else {
                      stackOut_50_0 = 1;
                      stackIn_52_0 = stackOut_50_0;
                      break L10;
                    }
                  }
                  return stackIn_52_0 != 0;
                } else {
                  if (!((na) this).field_Lb) {
                    L11: {
                      if (param0.field_Yb <= ((na) this).field_Yb) {
                        stackOut_81_0 = 0;
                        stackIn_82_0 = stackOut_81_0;
                        break L11;
                      } else {
                        stackOut_80_0 = 1;
                        stackIn_82_0 = stackOut_80_0;
                        break L11;
                      }
                    }
                    break L0;
                  } else {
                    L12: {
                      if (((na) this).field_kc) {
                        stackOut_58_0 = 1;
                        stackIn_60_0 = stackOut_58_0;
                        break L12;
                      } else {
                        if (2 == ((na) this).field_Fb) {
                          stackOut_57_0 = 1;
                          stackIn_60_0 = stackOut_57_0;
                          break L12;
                        } else {
                          stackOut_56_0 = 0;
                          stackIn_60_0 = stackOut_56_0;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      var5 = stackIn_60_0;
                      if (!param0.field_kc) {
                        if (param0.field_Fb == 2) {
                          stackOut_64_0 = 1;
                          stackIn_66_0 = stackOut_64_0;
                          break L13;
                        } else {
                          stackOut_63_0 = 0;
                          stackIn_66_0 = stackOut_63_0;
                          break L13;
                        }
                      } else {
                        stackOut_61_0 = 1;
                        stackIn_66_0 = stackOut_61_0;
                        break L13;
                      }
                    }
                    L14: {
                      var6 = stackIn_66_0;
                      if (var6 != 0) {
                        stackOut_68_0 = 0;
                        stackIn_69_0 = stackOut_68_0;
                        break L14;
                      } else {
                        stackOut_67_0 = 1;
                        stackIn_69_0 = stackOut_67_0;
                        break L14;
                      }
                    }
                    L15: {
                      stackOut_69_0 = stackIn_69_0;
                      stackIn_71_0 = stackOut_69_0;
                      stackIn_70_0 = stackOut_69_0;
                      if (var5 != 0) {
                        stackOut_71_0 = stackIn_71_0;
                        stackOut_71_1 = 0;
                        stackIn_72_0 = stackOut_71_0;
                        stackIn_72_1 = stackOut_71_1;
                        break L15;
                      } else {
                        stackOut_70_0 = stackIn_70_0;
                        stackOut_70_1 = 1;
                        stackIn_72_0 = stackOut_70_0;
                        stackIn_72_1 = stackOut_70_1;
                        break L15;
                      }
                    }
                    if (stackIn_72_0 == stackIn_72_1) {
                      L16: {
                        if (param0.field_Yb >= ((na) this).field_Yb) {
                          stackOut_77_0 = 0;
                          stackIn_78_0 = stackOut_77_0;
                          break L16;
                        } else {
                          stackOut_76_0 = 1;
                          stackIn_78_0 = stackOut_76_0;
                          break L16;
                        }
                      }
                      return stackIn_78_0 != 0;
                    } else {
                      stackOut_73_0 = var5;
                      stackIn_74_0 = stackOut_73_0;
                      return stackIn_74_0 != 0;
                    }
                  }
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
          L17: {
            var3 = decompiledCaughtException;
            stackOut_83_0 = (RuntimeException) var3;
            stackOut_83_1 = new StringBuilder().append("na.H(");
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param0 == null) {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L17;
            } else {
              stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
              stackOut_84_1 = (StringBuilder) (Object) stackIn_84_1;
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L17;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_86_0, stackIn_86_2 + ',' + param1 + ')');
        }
        return stackIn_82_0 != 0;
    }

    final static void a(long param0, int param1, int param2) {
        int var5 = 89 / ((param1 - 3) / 62);
        ab var4 = he.field_e;
        var4.b((byte) -99, param2);
        var4.field_g = var4.field_g + 1;
        int var6 = var4.field_g;
        var4.f(7, (byte) -5);
        var4.a(param0, (byte) 110);
        var4.b(-var6 + var4.field_g, (byte) 43);
    }

    final static void i() {
        df.a(1, cd.e(108));
        int var1 = -2;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, String param5, int param6, int param7, int param8, int param9, long param10, int param11, dl param12, boolean param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
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
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
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
                  df.field_z = new ab(5000);
                  he.field_e = new ab(param6);
                  md.field_c = param8;
                  ho.field_c = param10;
                  q.field_P = param2;
                  ka.field_q = param5;
                  if (!param13) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                L2: {
                  fl.field_a = stackIn_3_0 != 0;
                  vf.field_r = param1;
                  gm.field_d = param0;
                  ng.field_G = param11;
                  if (!param4) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                lk.field_d = stackIn_6_0 != 0;
                dh.field_Lb = param7;
                qg.field_b = param12;
                if (qg.field_b.field_n == null) {
                  break L0;
                } else {
                  {
                    L3: {
                      pg.field_f = new sd(qg.field_b.field_n, 64, 0);
                      break L3;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var15_ref;
                stackOut_11_1 = new StringBuilder().append("na.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(0).append(',').append(param4).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param5 == null) {
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
              L5: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(5000).append(',').append(param10).append(',').append(param11).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param12 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static kc f() {
        return nj.field_m.field_Cb;
    }

    na(int param0) {
        super(0L, (kc) null);
        ((na) this).field_Wb = new byte[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Tb = "Giants' Mountains:";
        field_lc = "Lesson 7 of 7<br><br>Use of basic spells in a dangerous and unsecure environment.<br><br>Defeat the three cyclopes.<br><br><br>* Health display *<br>* Use of the minimap *<br>* Application of timed movement *<br>* Tactical combat *<br>* Sense of achievement in victory *";
        field_Sb = "Accept invitation to <%0>'s game";
        field_gc = "Withdraw invitation to <%0> to join this game";
    }
}
