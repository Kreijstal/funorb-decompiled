/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fa extends cj {
    private mi field_Hb;
    static String field_Ib;
    private cj[] field_Jb;
    static ja[][] field_Qb;
    private cj field_Rb;
    static String field_Ob;
    private cj field_Pb;
    static ja field_Tb;
    private cj field_Sb;
    private cj field_Kb;
    long field_Fb;
    private int field_Lb;
    private StringBuilder field_Nb;
    static String field_Gb;
    private cj field_Vb;
    static String field_Ub;
    private cj field_Mb;

    final boolean k(int param0) {
        if (param0 < 99) {
            field_Ub = (String) null;
        }
        if (-2 != this.field_Lb) {
            return false;
        }
        if (sj.field_p == 13) {
            this.field_Lb = -1;
            return true;
        }
        return true;
    }

    final int a(byte param0, boolean param1) {
        mi stackIn_8_0 = null;
        mi stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cj stackIn_16_0 = null;
        cj stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int var3;
        int var4;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == -58) {
            break L0;
          } else {
            this.field_Mb = (cj) null;
            break L0;
          }
        }
        L1: {
          this.a(-11838, param1);
          if (null == this.field_Sb) {
            break L1;
          } else {
            L2: {
              this.field_Sb.field_wb = this.field_Nb.toString();
              this.field_Sb.field_x = (this.field_zb - this.field_Sb.field_yb.a(this.field_Sb.field_wb)) / 2;
              this.field_Sb.field_zb = this.field_zb + -this.field_Sb.field_x;
              if (this.field_Hb != null) {
                if (this.field_Hb.field_T == 0) {
                  break L2;
                } else {
                  L3: {
                    stackIn_8_0 = this.field_Hb;

                    if (this.field_Hb.field_Ab) {
                      stackIn_9_0 = (mi) ((Object) stackIn_8_0);
                      stackIn_9_1 = 0;
                      break L3;
                    } else {
                      stackIn_9_0 = (mi) ((Object) stackIn_8_0);
                      stackIn_9_1 = 1;
                      break L3;
                    }
                  }
                  stackIn_9_0.field_Ab = stackIn_9_1 != 0;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var3 = 0;
            L4: while (true) {
              if (var3 >= mo.field_Kb) {
                break L1;
              } else {
                if (this.field_Jb[var3] != null) {
                  L5: {
                    stackIn_16_0 = this.field_Jb[var3];

                    if ((this.field_Nb.length() ^ -1) >= -1) {
                      stackIn_17_0 = (cj) ((Object) stackIn_16_0);
                      stackIn_17_1 = 0;
                      break L5;
                    } else {
                      stackIn_17_0 = (cj) ((Object) stackIn_16_0);
                      stackIn_17_1 = 1;
                      break L5;
                    }
                  }
                  stackIn_17_0.field_Z = stackIn_17_1 != 0;
                  if (this.field_Jb[var3].field_Z) {
                    if (this.field_Jb[var3].field_T != 0) {
                      return var3;
                    } else {
                      var3++;
                      continue L4;
                    }
                  } else {
                    var3++;
                    continue L4;
                  }
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          }
        }
        if (-1 == (this.field_Mb.field_T ^ -1)) {
          L6: {
            if (!param1) {
              break L6;
            } else {
              if (kd.field_b == 0) {
                break L6;
              } else {
                if (-1 == (this.field_T ^ -1)) {
                  return -1;
                } else {
                  break L6;
                }
              }
            }
          }
          return this.field_Lb;
        } else {
          return -1;
        }
    }

    final static int d(boolean param0) {
        if (param0) {
            return -111;
        }
        return fl.field_a + -ZombieDawnMulti.field_H;
    }

    final String h(int param0) {
        if (param0 != -26895) {
            return (String) null;
        }
        return this.field_Nb.toString();
    }

    final boolean i(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -23217) {
            break L0;
          } else {
            this.field_Nb = (StringBuilder) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_Hb) {
              break L2;
            } else {
              if (!this.field_Hb.field_Ab) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final int a(String param0, int param1, int param2, cj param3, cj param4, int param5) {
        cj var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param5 > 95) {
              var7 = new cj(0L, param4, 0, param1, param2, 24, param0);
              param1 += 32;
              param3.a((byte) 50, var7);
              stackIn_4_0 = param1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 20;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7_ref);

            stackIn_7_1 = new StringBuilder().append("fa.CA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static fn a(Throwable param0, String param1) {
        fn var2 = null;
        if (param0 instanceof fn) {
            var2 = (fn) ((Object) param0);
            var2.field_k = var2.field_k + ' ' + param1;
        } else {
            var2 = new fn(param0, param1);
        }
        return var2;
    }

    final static boolean b(int param0, int param1) {
        try {
            if (param1 <= s.field_e.field_j) {
                return true;
            }
            if (null == ki.field_h) {
                return false;
            }
            int var2_int = ki.field_h.a(124);
            if (0 < var2_int) {
                if (!(var2_int <= -s.field_e.field_j + param1)) {
                    var2_int = param1 + -s.field_e.field_j;
                }
                ki.field_h.a(var2_int, s.field_e.field_j, s.field_e.field_m, 120);
                mo.field_Gb = bl.a((byte) 80);
                s.field_e.field_j = s.field_e.field_j + var2_int;
                if (s.field_e.field_j < param1) {
                    return false;
                }
                s.field_e.field_j = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (param0 != 10) {
                    field_Gb = (String) null;
                }
                if ((var2_int ^ -1) <= -1 && -30001L <= (he.b((byte) -22) ^ -1L)) {
                    return false;
                }
                ak.a((byte) -124);
            } catch (IOException iOException) {
                ak.a((byte) -111);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void j(int param0) {
        field_Qb = (ja[][]) null;
        field_Gb = null;
        int var1 = -52 % ((-4 - param0) / 45);
        field_Tb = null;
        field_Ub = null;
        field_Ob = null;
        field_Ib = null;
    }

    final static String a(int param0, int param1, int param2) {
        int var3 = -124 % ((55 - param0) / 63);
        return param2 + "/" + param1;
    }

    fa(int param0, int param1, int param2, int param3, int param4, cj param5, cj param6, cj param7, cj param8, mi param9, cj param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object stackIn_7_0;
        mi stackIn_7_1;
        mi stackIn_7_2;
        long stackIn_7_3;
        mi stackIn_7_4;
        Object stackIn_8_0;
        Object stackIn_9_0;
        mi stackIn_9_1;
        mi stackIn_9_2;
        long stackIn_9_3;
        mi stackIn_9_4;
        String stackIn_9_5;
        cj stackIn_15_0 = null;
        cj stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        cj[] var15 = null;
        RuntimeException var15_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        cj[] var28 = null;
        this.field_Lb = -2;
        try {
          L0: {
            L1: {
              this.field_Fb = param12;
              this.field_Kb = new cj(0L, param6, vc.field_g.toUpperCase());
              this.field_Kb.field_R = 1;
              this.a((byte) 50, this.field_Kb);
              this.field_Mb = new cj(0L, param7);
              this.field_Kb.a((byte) 50, this.field_Mb);
              this.field_Rb = new cj(0L, (cj) null);
              this.a((byte) 50, this.field_Rb);
              if (param11 != null) {
                L2: {
                  L3: {
                    this.field_Vb = new cj(0L, param8, wg.field_a);
                    this.field_Vb.field_M = 11184810;
                    this.field_Vb.field_R = 1;
                    this.field_Rb.a((byte) 50, this.field_Vb);
                    this.field_Pb = new cj(0L, param8, bf.field_q);
                    this.field_Pb.field_M = 11184810;
                    this.field_Pb.field_R = 1;
                    this.field_Rb.a((byte) 50, this.field_Pb);
                    this.field_Sb = new cj(0L, param8);
                    this.field_Sb.field_M = 16764006;
                    this.field_Rb.a((byte) 50, this.field_Sb);
                    this.field_Sb.field_vb = "|";
                    if (5 <= am.field_b) {
                      break L3;
                    } else {
                      if ((kj.field_q ^ -1) > -3) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackIn_7_0 = this;

                      stackIn_7_1 = null;

                      stackIn_7_2 = null;

                      stackIn_7_3 = 0L;

                      stackIn_7_4 = (mi) (param9);

                      if (am.field_b >= 7) {
                        break L5;
                      } else {
                        stackIn_8_0 = this;
                        stackIn_7_0 = stackIn_8_0;

                        if ((kj.field_q ^ -1) > -3) {
                          stackIn_9_0 = this;
                          stackIn_9_1 = null;
                          stackIn_9_2 = null;
                          stackIn_9_3 = stackIn_7_3;
                          stackIn_9_4 = (mi) ((Object) stackIn_7_4);
                          stackIn_9_5 = dk.field_Kb;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackIn_9_0 = this;
                    stackIn_9_1 = null;
                    stackIn_9_2 = null;
                    stackIn_9_3 = stackIn_7_3;
                    stackIn_9_4 = (mi) ((Object) stackIn_7_4);
                    stackIn_9_5 = jj.field_I;
                    break L4;
                  }
                  ((fa) (this)).field_Hb = new mi(stackIn_9_3, stackIn_9_4, stackIn_9_5);
                  this.field_Rb.a((byte) 50, this.field_Hb);
                  break L2;
                }
                var28 = new cj[3];
                var15 = var28;
                var28[0] = new cj(0L, (cj) null);
                this.field_Rb.a((byte) 50, var28[0]);
                var28[1] = new cj(0L, (cj) null);
                this.field_Rb.a((byte) 50, var28[1]);
                var28[2] = new cj(0L, (cj) null);
                this.field_Rb.a((byte) 50, var28[2]);
                this.field_Jb = new cj[mo.field_Kb];
                var16 = 0;
                L6: while (true) {
                  if (mo.field_Kb <= var16) {
                    L7: {
                      this.field_Nb = new StringBuilder(12);
                      if (param11 == null) {
                        break L7;
                      } else {
                        discarded$0 = this.field_Nb.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_yb.a(mn.field_q);
                      if (var17 <= var16) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_yb.a(ho.field_p);
                      if (var16 >= var17) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_yb.a(ki.field_p);
                      if (var16 >= var17) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (var17 >= mo.field_Kb) {
                        L12: {
                          if (140 >= var16) {
                            break L12;
                          } else {
                            var16 = 140;
                            break L12;
                          }
                        }
                        L13: {
                          var17 = 0;
                          var18 = 0;
                          var18 = 0;
                          var18 = this.a(mn.field_q, var18, var16, var28[0], param6, 113);
                          var18 = this.a(var28[0], var16, this.field_Jb[6], var18, (byte) -55);
                          var18 = this.a(var28[0], var16, this.field_Jb[9], var18, (byte) -55);
                          var18 = this.a(var28[0], var16, this.field_Jb[5], var18, (byte) -55);
                          var18 = this.a(var28[0], var16, this.field_Jb[7], var18, (byte) -55);
                          var18 = this.a(var28[0], var16, this.field_Jb[15], var18, (byte) -55);
                          var18 = this.a(var28[0], var16, this.field_Jb[4], var18, (byte) -55);
                          if (var18 <= var17) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(ho.field_p, var18, var16, var28[1], param6, 114);
                          var18 = this.a(var28[1], var16, this.field_Jb[16], var18, (byte) -55);
                          var18 = this.a(var28[1], var16, this.field_Jb[17], var18, (byte) -55);
                          var18 = this.a(var28[1], var16, this.field_Jb[18], var18, (byte) -55);
                          var18 = this.a(var28[1], var16, this.field_Jb[19], var18, (byte) -55);
                          var18 = this.a(var28[1], var16, this.field_Jb[20], var18, (byte) -55);
                          if (var17 >= var18) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(ki.field_p, var18, var16, var28[2], param6, 119);
                          var18 = this.a(var28[2], var16, this.field_Jb[13], var18, (byte) -55);
                          var18 = this.a(var28[2], var16, this.field_Jb[21], var18, (byte) -55);
                          var18 = this.a(var28[2], var16, this.field_Jb[11], var18, (byte) -55);
                          if (var17 >= var18) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = 3 * var16 + 26;
                          var20 = this.field_Kb.e(0);
                          if (var20 <= var19) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (null == this.field_Hb) {
                            break L17;
                          } else {
                            var20 = this.field_Hb.a((byte) 122, 4);
                            if (var19 >= var20) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          this.field_Kb.a(24, 0, 13 + var19 + 13, 0, -3344);
                          this.field_Mb.a(15, 5, 15, this.field_Kb.field_zb - 20, -3344);
                          var21 = 10;
                          this.field_Vb.a(jk.field_f * 2, var21, var19, 13, -3344);
                          var21 = var21 + 2 * jk.field_f;
                          this.field_Pb.a(jk.field_f * 2, var21, var19, 13, -3344);
                          var21 = var21 + (10 + 2 * jk.field_f);
                          this.field_Sb.a(jk.field_f, var21, 0, 0, -3344);
                          var21 = var21 + (10 + jk.field_f);
                          if (null == this.field_Hb) {
                            break L18;
                          } else {
                            var20 = this.field_Hb.a((byte) 102, 4);
                            this.field_Hb.a(var21, (byte) -96, 4, var20, 13 - -((-var20 + var19) / 2), jk.field_f);
                            var21 = var21 + (10 + jk.field_f);
                            break L18;
                          }
                        }
                        var28[0].a(var17, var21, var16, 13, -3344);
                        var28[1].a(var17, var21, var16, 13 + (13 - -var16), -3344);
                        var28[2].a(var17, var21, var16, 2 * var16 + 13 - -26, -3344);
                        var22 = var21;
                        this.field_Rb.a(var22 - -var17 + 10, 24, 13 + (var19 - -13), 0, -3344);
                        this.field_Rb.field_ab = tg.a(2105376, this.field_Rb.field_z, 8421504, 3, 11579568, 30);
                        var23 = 13 + (13 - -var19);
                        var24 = var22 + 24 - -var17 + 10;
                        var25 = qp.a(param0, (byte) 109, var23, param2);
                        var26 = br.a(true, param1, param3, var24);
                        this.a(var24, var26, var23, var25, -3344);
                        break L1;
                      } else {
                        L19: {
                          if (null == this.field_Jb[var17]) {
                            break L19;
                          } else {
                            var18 = this.field_Jb[var17].e(0);
                            if (var16 >= var18) {
                              break L19;
                            } else {
                              var16 = var18;
                              break L19;
                            }
                          }
                        }
                        var17++;
                        continue L11;
                      }
                    }
                  } else {
                    L20: {
                      if (nk.field_n[var16] == null) {
                        break L20;
                      } else {
                        L21: {
                          this.field_Jb[var16] = new cj(0L, param10, nk.field_n[var16]);
                          this.field_Jb[var16].field_R = 0;
                          stackIn_15_0 = this.field_Jb[var16];

                          if (param11 == null) {
                            stackIn_16_0 = (cj) ((Object) stackIn_15_0);
                            stackIn_16_1 = 0;
                            break L21;
                          } else {
                            stackIn_16_0 = (cj) ((Object) stackIn_15_0);
                            stackIn_16_1 = 1;
                            break L21;
                          }
                        }
                        stackIn_16_0.field_Z = stackIn_16_1 != 0;
                        this.field_Rb.a((byte) 50, this.field_Jb[var16]);
                        break L20;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              } else {
                this.field_Vb = new cj(0L, param8, ng.field_f);
                this.field_Vb.field_R = 1;
                this.field_Vb.field_M = 11184810;
                this.field_Rb.a((byte) 50, this.field_Vb);
                var15_int = 226;
                var16 = 10;
                var17 = this.field_Vb.field_yb.b(this.field_Vb.field_wb, var15_int);
                this.field_Vb.a(var17 * jk.field_f, var16, var15_int, 13, -3344);
                var16 = var16 + var17 * jk.field_f;
                this.field_Rb.a(10 - -var16, 24, 13 + (var15_int + 13), 0, -3344);
                this.field_Rb.field_ab = tg.a(2105376, this.field_Rb.field_z, 8421504, 3, 11579568, 92);
                var18 = 13 - (-var15_int - 13);
                var19 = 34 - -var16;
                var20 = qp.a(param0, (byte) 25, var18, param2);
                var21 = br.a(true, param1, param3, var19);
                this.a(var19, var21, var18, var20, -3344);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var15_ref = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var15_ref);

            stackIn_51_1 = new StringBuilder().append("fa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L22;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');

            if (param6 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L23;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L23;
            }
          }
          L24: {


            stackIn_57_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');

            if (param7 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L24;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L24;
            }
          }
          L25: {


            stackIn_60_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');

            if (param8 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L25;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L25;
            }
          }
          L26: {


            stackIn_63_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');

            if (param9 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L26;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L26;
            }
          }
          L27: {


            stackIn_66_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');

            if (param10 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L27;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');

            if (param11 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L28;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L28;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_52_0), stackIn_70_2 + ',' + param12 + ')');
        }
    }

    private final int a(cj param0, int param1, cj param2, int param3, byte param4) {
        int discarded$1 = 0;
        int var6_int = 0;
        RuntimeException var6 = null;
        cj var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param3 += 8;
              var6_int = param2.field_yb.a(param2.field_wb, -(2 * param2.field_V) + param1, param2.field_J);
              param2.a(var6_int, param3, param1, 0, -3344);
              param3 = param3 + (0 + var6_int);
              if (param4 == -55) {
                break L1;
              } else {
                var7 = (cj) null;
                discarded$1 = this.a((cj) null, 103, (cj) null, -43, (byte) -6);
                break L1;
              }
            }
            param0.a((byte) 50, param2);
            stackIn_3_0 = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("fa.EA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_Qb = new ja[5][];
        field_Ob = "Stunning is not enough.";
        field_Gb = "Email: ";
        field_Ub = "This game option is only available to members.";
    }
}
