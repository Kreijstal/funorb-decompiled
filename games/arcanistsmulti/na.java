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
        return (int)this.b(false);
    }

    public static void g(byte param0) {
        if (param0 <= 107) {
          na.i((byte) 112);
          field_lc = null;
          field_Tb = null;
          field_Sb = null;
          field_gc = null;
          return;
        } else {
          field_lc = null;
          field_Tb = null;
          field_Sb = null;
          field_gc = null;
          return;
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 >= -34) {
          L0: {
            this.e(102);
            if (this.d((byte) -17)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.d((byte) -17)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean a(na param0, int param1) {
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        boolean stackIn_33_0 = false;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_82_0 = 0;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          L0: {
            if (param1 == 2) {
              L1: {
                if (!this.field_Hb) {
                  if (this.field_ac == 6) {
                    stackIn_9_0 = 1;
                    break L1;
                  } else {
                    stackIn_9_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_9_0 = 1;
                  break L1;
                }
              }
              L2: {
                var3_int = stackIn_9_0;
                if (!param0.field_Hb) {
                  if ((param0.field_ac ^ -1) == -7) {
                    stackIn_15_0 = 1;
                    break L2;
                  } else {
                    stackIn_15_0 = 0;
                    break L2;
                  }
                } else {
                  stackIn_15_0 = 1;
                  break L2;
                }
              }
              L3: {
                var4 = stackIn_15_0;
                if (var4 != 0) {
                  stackIn_18_0 = 0;
                  break L3;
                } else {
                  stackIn_18_0 = 1;
                  break L3;
                }
              }
              L4: {


                if (var3_int != 0) {

                  stackIn_21_1 = 0;
                  break L4;
                } else {

                  stackIn_21_1 = 1;
                  break L4;
                }
              }
              if (stackIn_18_0 != stackIn_21_1) {
                stackIn_24_0 = var3_int;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  if (var3_int == 0) {
                    L6: {
                      if (param0.field_Ob) {
                        stackIn_30_0 = 0;
                        break L6;
                      } else {
                        stackIn_30_0 = 1;
                        break L6;
                      }
                    }
                    if (stackIn_30_0 == (this.field_Ob ? 1 : 0)) {
                      stackIn_33_0 = this.field_Ob;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (!this.field_Ob) {
                        break L5;
                      } else {
                        if (this.field_Pb != param0.field_Pb) {
                          L7: {
                            if (param0.field_Pb <= this.field_Pb) {
                              stackIn_40_0 = 0;
                              break L7;
                            } else {
                              stackIn_40_0 = 1;
                              break L7;
                            }
                          }
                          decompiledRegionSelector0 = 3;
                          break L0;
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
                  if (this.field_Lb) {
                    stackIn_44_0 = 0;
                    break L8;
                  } else {
                    stackIn_44_0 = 1;
                    break L8;
                  }
                }
                L9: {


                  if (param0.field_Lb) {

                    stackIn_47_1 = 0;
                    break L9;
                  } else {

                    stackIn_47_1 = 1;
                    break L9;
                  }
                }
                if (stackIn_44_0 != stackIn_47_1) {
                  L10: {
                    if (this.field_Lb) {
                      stackIn_52_0 = 0;
                      break L10;
                    } else {
                      stackIn_52_0 = 1;
                      break L10;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  if (!this.field_Lb) {
                    L11: {
                      if (param0.field_Yb <= this.field_Yb) {
                        stackIn_82_0 = 0;
                        break L11;
                      } else {
                        stackIn_82_0 = 1;
                        break L11;
                      }
                    }
                    decompiledRegionSelector0 = 7;
                    break L0;
                  } else {
                    L12: {
                      if (this.field_kc) {
                        stackIn_60_0 = 1;
                        break L12;
                      } else {
                        if (2 == this.field_Fb) {
                          stackIn_60_0 = 1;
                          break L12;
                        } else {
                          stackIn_60_0 = 0;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      var5 = stackIn_60_0;
                      if (!param0.field_kc) {
                        if (param0.field_Fb == 2) {
                          stackIn_66_0 = 1;
                          break L13;
                        } else {
                          stackIn_66_0 = 0;
                          break L13;
                        }
                      } else {
                        stackIn_66_0 = 1;
                        break L13;
                      }
                    }
                    L14: {
                      var6 = stackIn_66_0;
                      if (var6 != 0) {
                        stackIn_69_0 = 0;
                        break L14;
                      } else {
                        stackIn_69_0 = 1;
                        break L14;
                      }
                    }
                    L15: {


                      if (var5 != 0) {

                        stackIn_72_1 = 0;
                        break L15;
                      } else {

                        stackIn_72_1 = 1;
                        break L15;
                      }
                    }
                    if (stackIn_69_0 == stackIn_72_1) {
                      L16: {
                        if (param0.field_Yb >= this.field_Yb) {
                          stackIn_78_0 = 0;
                          break L16;
                        } else {
                          stackIn_78_0 = 1;
                          break L16;
                        }
                      }
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      stackIn_74_0 = var5;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var3 = decompiledCaughtException;
            stackIn_85_0 = (RuntimeException) (var3);

            stackIn_85_1 = new StringBuilder().append("na.H(");

            if (param0 == null) {
              stackIn_86_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "null";
              break L17;
            } else {
              stackIn_86_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackIn_86_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackIn_86_2 = "{...}";
              break L17;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_24_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_33_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_40_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_52_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_74_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_78_0 != 0;
                    } else {
                      return stackIn_82_0 != 0;
                    }
                  }
                }
              }
            }
          }
        }
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

    final static void i(byte param0) {
        df.a(1, cd.e(108));
        int var1 = -86 % ((param0 - -14) / 33);
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, String param5, int param6, int param7, int param8, int param9, long param10, int param11, dl param12, boolean param13) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  df.field_z = new ab(param9);
                  he.field_e = new ab(param6);
                  md.field_c = param8;
                  ho.field_c = param10;
                  q.field_P = param2;
                  ka.field_q = param5;
                  if (!param13) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  fl.field_a = stackIn_3_0 != 0;
                  vf.field_r = param1;
                  gm.field_d = param0;
                  ng.field_G = param11;
                  if (!param4) {
                    stackIn_6_0 = 0;
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  lk.field_d = stackIn_6_0 != 0;
                  if (param3 == 0) {
                    break L3;
                  } else {
                    field_gc = (String) null;
                    break L3;
                  }
                }
                dh.field_Lb = param7;
                qg.field_b = param12;
                if (qg.field_b.field_n == null) {
                  break L0;
                } else {
                  try {
                    L4: {
                      pg.field_f = new sd(qg.field_b.field_n, 64, 0);
                      break L4;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var15 = (IOException) (Object) decompiledCaughtException;
                    throw new RuntimeException(var15.toString());
                  }
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("na.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

                if (param5 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

                if (param12 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static kc f(byte param0) {
        if (param0 <= 13) {
            na.i((byte) 105);
            return nj.field_m.field_Cb;
        }
        return nj.field_m.field_Cb;
    }

    na(int param0) {
        super(0L, (kc) null);
        this.field_Wb = new byte[param0];
    }

    static {
        field_Tb = "Giants' Mountains:";
        field_lc = "Lesson 7 of 7<br><br>Use of basic spells in a dangerous and unsecure environment.<br><br>Defeat the three cyclopes.<br><br><br>* Health display *<br>* Use of the minimap *<br>* Application of timed movement *<br>* Tactical combat *<br>* Sense of achievement in victory *";
        field_Sb = "Accept invitation to <%0>'s game";
        field_gc = "Withdraw invitation to <%0> to join this game";
    }
}
