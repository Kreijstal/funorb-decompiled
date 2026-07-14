/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sw extends jea {
    private int field_Ib;
    private boolean field_tb;
    private int field_Gb;
    private int field_ub;
    private int field_yb;
    private naa field_Db;
    jea field_Cb;
    private int field_Ab;
    static String field_Fb;
    private fia field_Bb;
    private jea field_Eb;
    private StringBuilder field_wb;
    private long field_Hb;
    private jea field_xb;
    static int[] field_zb;
    private boolean field_vb;

    private final void a(String param0, boolean param1) {
        int var3 = 0;
        String var4 = null;
        L0: {
          if ((((sw) this).field_Ib ^ -1) == 0) {
            break L0;
          } else {
            var3 = ((sw) this).field_Ib + -((sw) this).field_wb.length();
            if (var3 == 0) {
              return;
            } else {
              param0 = param0.substring(0, var3);
              break L0;
            }
          }
        }
        L1: {
          if (((sw) this).field_ub != ((sw) this).field_wb.length()) {
            var4 = ((sw) this).field_wb.toString().substring(((sw) this).field_ub, ((sw) this).field_wb.length());
            StringBuilder discarded$4 = ana.a(((sw) this).field_ub, ' ', -11, ((sw) this).field_wb);
            StringBuilder discarded$5 = ((sw) this).field_wb.append(param0);
            StringBuilder discarded$6 = ((sw) this).field_wb.append(var4);
            break L1;
          } else {
            StringBuilder discarded$7 = ((sw) this).field_wb.append(param0);
            break L1;
          }
        }
        if (!param1) {
          ((sw) this).field_yb = -100;
          ((sw) this).field_Cb.field_r = ((sw) this).field_wb.toString();
          ((sw) this).field_ub = ((sw) this).field_wb.length();
          ((sw) this).field_Ab = ((sw) this).field_ub;
          return;
        } else {
          ((sw) this).field_Cb.field_r = ((sw) this).field_wb.toString();
          ((sw) this).field_ub = ((sw) this).field_wb.length();
          ((sw) this).field_Ab = ((sw) this).field_ub;
          return;
        }
    }

    final void h(byte param0) {
        try {
            int var2 = 0;
            long var3_long = 0L;
            int var3 = 0;
            Exception var4 = null;
            int var4_int = 0;
            int var5 = 0;
            int var6 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            Object stackIn_2_0 = null;
            Object stackIn_3_0 = null;
            Object stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            int stackIn_31_0 = 0;
            Object stackOut_1_0 = null;
            Object stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            Object stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_29_0 = 0;
            int stackOut_30_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = TombRacer.field_G ? 1 : 0;
                        var2 = this.b(-2, -((sw) this).field_Cb.field_S + (-((sw) this).field_q + jba.field_j));
                        if (((sw) this).field_y != 1) {
                            statePc = 13;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        this.d(param0 + 18539, var2);
                        ((sw) this).field_tb = true;
                        var3_long = bva.b((byte) -107);
                        stackOut_1_0 = this;
                        stackIn_3_0 = stackOut_1_0;
                        stackIn_2_0 = stackOut_1_0;
                        if (-251L >= (-((sw) this).field_Hb + var3_long ^ -1L)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        stackOut_2_0 = this;
                        stackOut_2_1 = 1;
                        stackIn_4_0 = stackOut_2_0;
                        stackIn_4_1 = stackOut_2_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 3: {
                        stackOut_3_0 = this;
                        stackOut_3_1 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        ((sw) this).field_vb = stackIn_4_1 != 0;
                        if (((sw) this).field_vb) {
                            statePc = 6;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        ((sw) this).field_Ab = this.j((byte) -69);
                        ((sw) this).field_ub = this.g((byte) 24);
                        if (-1 <= (((sw) this).field_ub ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (((sw) this).field_wb.charAt(((sw) this).field_ub - 1) != 32) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ((sw) this).field_ub = ((sw) this).field_ub - 1;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 9: {
                        ((sw) this).field_yb = ((sw) this).field_ub;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 10: {
                        ((sw) this).field_yb = ((sw) this).field_ub;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 11: {
                        ((sw) this).field_yb = ((sw) this).field_ub;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        ((sw) this).field_Hb = var3_long;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 13: {
                        if ((ksa.field_p ^ -1) != -2) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (((sw) this).field_tb) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        ((sw) this).field_tb = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 17: {
                        ((sw) this).field_tb = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 18: {
                        if (!((sw) this).field_vb) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (((sw) this).field_yb <= var2) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (((sw) this).field_Ab < var2) {
                            statePc = 22;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        var2 = ((sw) this).field_yb;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        ((sw) this).field_ub = var2;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (!((sw) this).field_L) {
                            statePc = 26;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        ((sw) this).field_Ab = ((sw) this).field_wb.length();
                        ((sw) this).field_ub = ((sw) this).field_wb.length();
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        ((sw) this).field_Eb.field_qb = ((sw) this).field_Cb.field_H.b(((sw) this).field_wb.toString().substring(0, ((sw) this).field_ub));
                        if (((sw) this).field_Ab == ((sw) this).field_ub) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        var3 = ((sw) this).field_Cb.field_qb + ((sw) this).field_Cb.field_H.b(((sw) this).field_wb.toString().substring(0, ((sw) this).field_Ab));
                        if (((sw) this).field_Eb.field_qb <= var3) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        stackOut_29_0 = var3;
                        stackIn_31_0 = stackOut_29_0;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 30: {
                        stackOut_30_0 = ((sw) this).field_Eb.field_qb;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        var4_int = stackIn_31_0;
                        var5 = Math.abs(-((sw) this).field_Eb.field_qb + var3);
                        ((sw) this).field_xb.a(var5, ((sw) this).field_Gb, param0 ^ -23689, 2, ((sw) this).field_Cb.field_S + var4_int);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 32: {
                        ((sw) this).field_xb.a(0, ((sw) this).field_Gb, -23776, 2, ((sw) this).field_Eb.field_qb);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (null != ((sw) this).field_Db) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (param0 != 87) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        return;
                    }
                    case 36: {
                        ((sw) this).field_ub = 115;
                        return;
                    }
                    case 38: {
                        if (0 != ((sw) this).field_Db.field_b) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        if (param0 != 87) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        return;
                    }
                    case 41: {
                        ((sw) this).field_ub = 115;
                        return;
                    }
                    case 43: {
                        var7 = (java.awt.datatransfer.Transferable) ((sw) this).field_Db.field_f;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        try {
                            var8 = (String) var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                            this.i((byte) -126);
                            this.a(var8, true);
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 46;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        ((sw) this).field_Db = null;
                        if (param0 != 87) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        return;
                    }
                    case 49: {
                        ((sw) this).field_ub = 115;
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0, int param1) {
        ((sw) this).field_Ab = param0;
        if (param1 != 1) {
            ((sw) this).field_Db = null;
            ((sw) this).field_ub = param0;
            return;
        }
        ((sw) this).field_ub = param0;
    }

    private final void k(int param0) {
        if (!(((sw) this).field_Bb != null)) {
            return;
        }
        this.f(82);
        int var2 = -100 / ((param0 - 14) / 52);
        this.i((byte) -125);
    }

    sw(long param0, jea param1, jea param2, jea param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param1 > 65) {
            break L0;
          } else {
            int discarded$1 = this.b(-116, -81);
            break L0;
          }
        }
        var4 = ((sw) this).field_wb.length();
        if (-1 >= (param2 ^ -1)) {
          L1: {
            if (var4 >= param2) {
              break L1;
            } else {
              param2 = var4;
              break L1;
            }
          }
          if (param0 >= 0) {
            if (param0 <= var4) {
              ((sw) this).field_ub = param2;
              ((sw) this).field_Ab = param0;
              return;
            } else {
              param0 = var4;
              ((sw) this).field_ub = param2;
              ((sw) this).field_Ab = param0;
              return;
            }
          } else {
            param0 = 0;
            ((sw) this).field_ub = param2;
            ((sw) this).field_Ab = param0;
            return;
          }
        } else {
          param2 = 0;
          if (param0 >= 0) {
            if (param0 <= var4) {
              ((sw) this).field_ub = param2;
              ((sw) this).field_Ab = param0;
              return;
            } else {
              param0 = var4;
              ((sw) this).field_ub = param2;
              ((sw) this).field_Ab = param0;
              return;
            }
          } else {
            param0 = 0;
            ((sw) this).field_ub = param2;
            ((sw) this).field_Ab = param0;
            return;
          }
        }
    }

    private final void i(byte param0) {
        int var2 = 0;
        int var3 = 0;
        String var5 = null;
        String var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 > -119) {
          L0: {
            int discarded$5 = ((sw) this).j(-109);
            if (((sw) this).field_ub == ((sw) this).field_Ab) {
              break L0;
            } else {
              L1: {
                if (((sw) this).field_Ab < ((sw) this).field_ub) {
                  stackOut_13_0 = ((sw) this).field_Ab;
                  stackIn_14_0 = stackOut_13_0;
                  break L1;
                } else {
                  stackOut_12_0 = ((sw) this).field_ub;
                  stackIn_14_0 = stackOut_12_0;
                  break L1;
                }
              }
              L2: {
                var2 = stackIn_14_0;
                if (((sw) this).field_ub > ((sw) this).field_Ab) {
                  stackOut_16_0 = ((sw) this).field_ub;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = ((sw) this).field_Ab;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              var3 = stackIn_17_0;
              ((sw) this).field_Ab = var2;
              ((sw) this).field_ub = var2;
              var5 = ((sw) this).field_wb.toString().substring(var3, ((sw) this).field_wb.length());
              StringBuilder discarded$6 = ana.a(var2, ' ', -11, ((sw) this).field_wb);
              StringBuilder discarded$7 = ((sw) this).field_wb.append(var5);
              ((sw) this).field_Cb.field_r = ((sw) this).field_wb.toString();
              break L0;
            }
          }
          return;
        } else {
          L3: {
            if (((sw) this).field_ub == ((sw) this).field_Ab) {
              break L3;
            } else {
              L4: {
                if (((sw) this).field_Ab < ((sw) this).field_ub) {
                  stackOut_4_0 = ((sw) this).field_Ab;
                  stackIn_5_0 = stackOut_4_0;
                  break L4;
                } else {
                  stackOut_3_0 = ((sw) this).field_ub;
                  stackIn_5_0 = stackOut_3_0;
                  break L4;
                }
              }
              L5: {
                var2 = stackIn_5_0;
                if (((sw) this).field_ub > ((sw) this).field_Ab) {
                  stackOut_7_0 = ((sw) this).field_ub;
                  stackIn_8_0 = stackOut_7_0;
                  break L5;
                } else {
                  stackOut_6_0 = ((sw) this).field_Ab;
                  stackIn_8_0 = stackOut_6_0;
                  break L5;
                }
              }
              var3 = stackIn_8_0;
              ((sw) this).field_Ab = var2;
              ((sw) this).field_ub = var2;
              var6 = ((sw) this).field_wb.toString().substring(var3, ((sw) this).field_wb.length());
              StringBuilder discarded$8 = ana.a(var2, ' ', -11, ((sw) this).field_wb);
              StringBuilder discarded$9 = ((sw) this).field_wb.append(var6);
              ((sw) this).field_Cb.field_r = ((sw) this).field_wb.toString();
              break L3;
            }
          }
          return;
        }
    }

    final void d(byte param0) {
        if (param0 > -84) {
          return;
        } else {
          StringBuilder discarded$2 = ana.a(0, ' ', -11, ((sw) this).field_wb);
          ((sw) this).field_Ab = 0;
          ((sw) this).field_ub = 0;
          ((sw) this).field_Cb.field_r = ((sw) this).field_wb.toString();
          return;
        }
    }

    final static void h(int param0) {
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        if (lca.a(false)) {
          boolean discarded$2 = wu.field_a.a(sc.field_k, true, oqa.field_w, param0 ^ -11);
          wu.field_a.g((byte) -128);
          L0: while (true) {
            if (!es.a(true)) {
              if (param0 != 100) {
                field_zb = null;
                return;
              } else {
                return;
              }
            } else {
              boolean discarded$3 = wu.field_a.a((byte) -53, fna.field_h, kda.field_td);
              continue L0;
            }
          }
        } else {
          if (dq.field_f != null) {
            if (!dq.field_f.field_b) {
              return;
            } else {
              og.b(0);
              wu.field_a.c((ae) (Object) new gga(wu.field_a, or.field_j), 122);
              return;
            }
          } else {
            return;
          }
        }
    }

    private final int j(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (((sw) this).field_ub != 0) {
          var2 = ((sw) this).field_ub + -1;
          L0: while (true) {
            if (-1 > (var2 ^ -1)) {
              if (!up.a(((sw) this).field_wb.charAt(var2 - 1), true)) {
                var2--;
                continue L0;
              } else {
                var3 = 59 / ((74 - param0) / 41);
                return var2;
              }
            } else {
              var3 = 59 / ((74 - param0) / 41);
              return var2;
            }
          }
        } else {
          return ((sw) this).field_ub;
        }
    }

    final void a(fia param0, byte param1) {
        ((sw) this).field_Bb = param0;
        int var3 = 85 / ((param1 - -26) / 51);
    }

    private final void g(int param0) {
        if (param0 == 100) {
          if (((sw) this).field_Bb == null) {
            return;
          } else {
            ((sw) this).field_Db = ((sw) this).field_Bb.b(param0 + 25);
            return;
          }
        } else {
          ((sw) this).field_Gb = -61;
          if (((sw) this).field_Bb == null) {
            return;
          } else {
            ((sw) this).field_Db = ((sw) this).field_Bb.b(param0 + 25);
            return;
          }
        }
    }

    private final void f(int param0) {
        try {
            String var2 = null;
            java.awt.datatransfer.StringSelection var3 = null;
            if (((sw) this).field_Bb == null) {
              return;
            } else {
              var2 = this.f((byte) -107);
              if (var2.length() != 0) {
                var3 = new java.awt.datatransfer.StringSelection(this.f((byte) -89));
                if (param0 != 82) {
                  ((sw) this).field_wb = null;
                  naa discarded$4 = ((sw) this).field_Bb.a((byte) 84, (java.awt.datatransfer.Transferable) (Object) var3);
                  return;
                } else {
                  naa discarded$5 = ((sw) this).field_Bb.a((byte) 84, (java.awt.datatransfer.Transferable) (Object) var3);
                  return;
                }
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String f(byte param0) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 > -76) {
          L0: {
            int discarded$1 = this.g((byte) 84);
            var2 = ((sw) this).field_wb.toString();
            if (((sw) this).field_Ab < ((sw) this).field_ub) {
              stackOut_10_0 = ((sw) this).field_Ab;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = ((sw) this).field_ub;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var3 = stackIn_11_0;
            if (((sw) this).field_ub > ((sw) this).field_Ab) {
              stackOut_13_0 = ((sw) this).field_ub;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = ((sw) this).field_Ab;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var4 = stackIn_14_0;
          return var2.substring(var3, var4);
        } else {
          L2: {
            var2 = ((sw) this).field_wb.toString();
            if (((sw) this).field_Ab < ((sw) this).field_ub) {
              stackOut_3_0 = ((sw) this).field_Ab;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = ((sw) this).field_ub;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var3 = stackIn_4_0;
            if (((sw) this).field_ub > ((sw) this).field_Ab) {
              stackOut_6_0 = ((sw) this).field_ub;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = ((sw) this).field_Ab;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var4 = stackIn_7_0;
          return var2.substring(var3, var4);
        }
    }

    final int j(int param0) {
        if (param0 != -1320) {
            return 58;
        }
        return ((sw) this).field_ub;
    }

    public static void i(int param0) {
        field_Fb = null;
        if (param0 > -33) {
            return;
        }
        field_zb = null;
    }

    private sw(long param0, jea param1, jea param2, jea param3, int param4) {
        super(param0, param1);
        ((sw) this).field_tb = false;
        ((sw) this).field_yb = -1;
        ((sw) this).field_Hb = 0L;
        ((sw) this).field_vb = false;
        ((sw) this).field_Ib = param4;
        ((sw) this).field_xb = new jea(0L, param2);
        ((sw) this).field_Cb = new jea(0L, param3);
        ((sw) this).field_Eb = new jea(0L, param3);
        ((sw) this).field_Z = true;
        ((sw) this).field_wb = new StringBuilder(0 != (((sw) this).field_Ib ^ -1) ? ((sw) this).field_Ib : 256);
        ((sw) this).field_Cb.field_r = ((sw) this).field_wb.toString();
        ((sw) this).field_Eb.field_r = "";
        ((sw) this).field_Eb.field_sb = "|";
        ((sw) this).field_J = new vna();
        ((sw) this).b(-122, ((sw) this).field_xb);
        ((sw) this).b(-122, ((sw) this).field_Cb);
        ((sw) this).b(-123, ((sw) this).field_Eb);
        ((sw) this).field_L = true;
    }

    final void a(byte param0, String param1) {
        int var3 = 0;
        L0: {
          ((sw) this).field_wb.setLength(0);
          var3 = param1.length();
          if (((sw) this).field_Ib == -1) {
            break L0;
          } else {
            if (var3 <= ((sw) this).field_Ib) {
              break L0;
            } else {
              var3 = ((sw) this).field_Ib;
              break L0;
            }
          }
        }
        if (param0 < 0) {
          ((sw) this).field_Ib = 96;
          StringBuilder discarded$2 = ((sw) this).field_wb.append(param1.substring(0, var3));
          ((sw) this).field_Ab = ((sw) this).field_wb.length();
          ((sw) this).field_ub = ((sw) this).field_wb.length();
          ((sw) this).field_Cb.field_r = ((sw) this).field_wb.toString();
          return;
        } else {
          StringBuilder discarded$3 = ((sw) this).field_wb.append(param1.substring(0, var3));
          ((sw) this).field_Ab = ((sw) this).field_wb.length();
          ((sw) this).field_ub = ((sw) this).field_wb.length();
          ((sw) this).field_Cb.field_r = ((sw) this).field_wb.toString();
          return;
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        if (param1 == -19696) {
          L0: {
            if (param2 == 60) {
              break L0;
            } else {
              if (param2 == 62) {
                break L0;
              } else {
                if (param2 >= 32) {
                  if (param2 <= 126) {
                    L1: {
                      if (((sw) this).field_Ab != ((sw) this).field_ub) {
                        this.i((byte) -124);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    if (((sw) this).field_Ib == -1) {
                      if (((sw) this).field_ub == ((sw) this).field_wb.length()) {
                        StringBuilder discarded$8 = ((sw) this).field_wb.append(param2);
                        ((sw) this).field_Cb.field_r = ((sw) this).field_wb.toString();
                        ((sw) this).field_ub = ((sw) this).field_ub + 1;
                        ((sw) this).field_Ab = ((sw) this).field_ub;
                        return true;
                      } else {
                        var7 = ((sw) this).field_wb.toString().substring(((sw) this).field_ub, ((sw) this).field_wb.length());
                        StringBuilder discarded$9 = ana.a(((sw) this).field_ub, ' ', -11, ((sw) this).field_wb);
                        StringBuilder discarded$10 = ((sw) this).field_wb.append(param2);
                        StringBuilder discarded$11 = ((sw) this).field_wb.append(var7);
                        ((sw) this).field_Cb.field_r = ((sw) this).field_wb.toString();
                        ((sw) this).field_ub = ((sw) this).field_ub + 1;
                        ((sw) this).field_Ab = ((sw) this).field_ub;
                        return true;
                      }
                    } else {
                      if (((sw) this).field_wb.length() >= ((sw) this).field_Ib) {
                        return true;
                      } else {
                        L2: {
                          if (((sw) this).field_ub == ((sw) this).field_wb.length()) {
                            StringBuilder discarded$12 = ((sw) this).field_wb.append(param2);
                            break L2;
                          } else {
                            var6 = ((sw) this).field_wb.toString().substring(((sw) this).field_ub, ((sw) this).field_wb.length());
                            StringBuilder discarded$13 = ana.a(((sw) this).field_ub, ' ', -11, ((sw) this).field_wb);
                            StringBuilder discarded$14 = ((sw) this).field_wb.append(param2);
                            StringBuilder discarded$15 = ((sw) this).field_wb.append(var6);
                            break L2;
                          }
                        }
                        ((sw) this).field_Cb.field_r = ((sw) this).field_wb.toString();
                        ((sw) this).field_ub = ((sw) this).field_ub + 1;
                        ((sw) this).field_Ab = ((sw) this).field_ub;
                        return true;
                      }
                    }
                  } else {
                    L3: {
                      if (85 == param0) {
                        if (((sw) this).field_Ab != ((sw) this).field_ub) {
                          this.i((byte) -120);
                          return true;
                        } else {
                          if ((((sw) this).field_ub ^ -1) < -1) {
                            ((sw) this).field_Ab = ((sw) this).field_ub + -1;
                            this.i((byte) -125);
                            return true;
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        if (101 != param0) {
                          if (-14 != (param0 ^ -1)) {
                            if (96 != param0) {
                              if (-98 != (param0 ^ -1)) {
                                if (param0 != -103) {
                                  if (-104 != param0) {
                                    L4: {
                                      if (!oj.field_tb[82]) {
                                        break L4;
                                      } else {
                                        if (param0 != -66) {
                                          break L4;
                                        } else {
                                          this.k(param1 ^ 19666);
                                          return true;
                                        }
                                      }
                                    }
                                    L5: {
                                      if (!oj.field_tb[82]) {
                                        break L5;
                                      } else {
                                        if (-67 != param0) {
                                          break L5;
                                        } else {
                                          this.f(82);
                                          return true;
                                        }
                                      }
                                    }
                                    if (oj.field_tb[82]) {
                                      if (67 == param0) {
                                        this.g(100);
                                        return true;
                                      } else {
                                        return false;
                                      }
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    this.d(param1 ^ -1070, ((sw) this).field_wb.length());
                                    return true;
                                  }
                                } else {
                                  this.d(param1 + 38322, 0);
                                  return true;
                                }
                              } else {
                                if (((sw) this).field_ub < ((sw) this).field_wb.length()) {
                                  L6: {
                                    if (!oj.field_tb[82]) {
                                      stackOut_81_0 = ((sw) this).field_ub + 1;
                                      stackIn_82_0 = stackOut_81_0;
                                      break L6;
                                    } else {
                                      stackOut_80_0 = this.g((byte) 50);
                                      stackIn_82_0 = stackOut_80_0;
                                      break L6;
                                    }
                                  }
                                  var4 = stackIn_82_0;
                                  this.d(18626, var4);
                                  return true;
                                } else {
                                  break L3;
                                }
                              }
                            } else {
                              if (0 >= ((sw) this).field_ub) {
                                return false;
                              } else {
                                L7: {
                                  if (oj.field_tb[82]) {
                                    stackOut_72_0 = this.j((byte) -92);
                                    stackIn_73_0 = stackOut_72_0;
                                    break L7;
                                  } else {
                                    stackOut_71_0 = -1 + ((sw) this).field_ub;
                                    stackIn_73_0 = stackOut_71_0;
                                    break L7;
                                  }
                                }
                                var4 = stackIn_73_0;
                                this.d(18626, var4);
                                return true;
                              }
                            }
                          } else {
                            ((sw) this).d((byte) -95);
                            return true;
                          }
                        } else {
                          if (((sw) this).field_Ab == ((sw) this).field_ub) {
                            if (((sw) this).field_ub >= ((sw) this).field_wb.length()) {
                              return false;
                            } else {
                              ((sw) this).field_Ab = 1 + ((sw) this).field_ub;
                              this.i((byte) -124);
                              return true;
                            }
                          } else {
                            this.i((byte) -124);
                            return true;
                          }
                        }
                      }
                    }
                    return false;
                  }
                } else {
                  if (85 == param0) {
                    if (((sw) this).field_Ab == ((sw) this).field_ub) {
                      if ((((sw) this).field_ub ^ -1) < -1) {
                        ((sw) this).field_Ab = ((sw) this).field_ub + -1;
                        this.i((byte) -125);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      this.i((byte) -120);
                      return true;
                    }
                  } else {
                    if (101 != param0) {
                      if (-14 != (param0 ^ -1)) {
                        if (96 != param0) {
                          if (-98 != (param0 ^ -1)) {
                            if (param0 != -103) {
                              if (-104 != param0) {
                                L8: {
                                  if (!oj.field_tb[82]) {
                                    break L8;
                                  } else {
                                    if (param0 != -66) {
                                      break L8;
                                    } else {
                                      this.k(param1 ^ 19666);
                                      return true;
                                    }
                                  }
                                }
                                L9: {
                                  if (!oj.field_tb[82]) {
                                    break L9;
                                  } else {
                                    if (-67 != param0) {
                                      break L9;
                                    } else {
                                      this.f(82);
                                      return true;
                                    }
                                  }
                                }
                                if (oj.field_tb[82]) {
                                  if (67 == param0) {
                                    this.g(100);
                                    return true;
                                  } else {
                                    return false;
                                  }
                                } else {
                                  return false;
                                }
                              } else {
                                this.d(param1 ^ -1070, ((sw) this).field_wb.length());
                                return true;
                              }
                            } else {
                              this.d(param1 + 38322, 0);
                              return true;
                            }
                          } else {
                            if (((sw) this).field_ub >= ((sw) this).field_wb.length()) {
                              return false;
                            } else {
                              L10: {
                                if (!oj.field_tb[82]) {
                                  stackOut_29_0 = ((sw) this).field_ub + 1;
                                  stackIn_30_0 = stackOut_29_0;
                                  break L10;
                                } else {
                                  stackOut_28_0 = this.g((byte) 50);
                                  stackIn_30_0 = stackOut_28_0;
                                  break L10;
                                }
                              }
                              var4 = stackIn_30_0;
                              this.d(18626, var4);
                              return true;
                            }
                          }
                        } else {
                          if (0 < ((sw) this).field_ub) {
                            L11: {
                              if (oj.field_tb[82]) {
                                stackOut_22_0 = this.j((byte) -92);
                                stackIn_23_0 = stackOut_22_0;
                                break L11;
                              } else {
                                stackOut_21_0 = -1 + ((sw) this).field_ub;
                                stackIn_23_0 = stackOut_21_0;
                                break L11;
                              }
                            }
                            var4 = stackIn_23_0;
                            this.d(18626, var4);
                            return true;
                          } else {
                            return false;
                          }
                        }
                      } else {
                        ((sw) this).d((byte) -95);
                        return true;
                      }
                    } else {
                      if (((sw) this).field_Ab == ((sw) this).field_ub) {
                        if (((sw) this).field_ub < ((sw) this).field_wb.length()) {
                          ((sw) this).field_Ab = 1 + ((sw) this).field_ub;
                          this.i((byte) -124);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        this.i((byte) -124);
                        return true;
                      }
                    }
                  }
                }
              }
            }
          }
          return false;
        } else {
          return true;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param1 == 6) {
          var2 = param0;
          if (-2 != var2) {
            if (2 != var2) {
              if (3 != var2) {
                if (-8 != var2) {
                  if (var2 != 6) {
                    if (var2 != 5) {
                      return param0;
                    } else {
                      return 3;
                    }
                  } else {
                    return 2;
                  }
                } else {
                  return 1;
                }
              } else {
                return 5;
              }
            } else {
              return 6;
            }
          } else {
            return 7;
          }
        } else {
          return 65;
        }
    }

    private final void d(int param0, int param1) {
        ((sw) this).field_ub = param1;
        if (param0 != 18626) {
          L0: {
            ((sw) this).a(83, (byte) 112, 70);
            if (!oj.field_tb[81]) {
              ((sw) this).field_Ab = ((sw) this).field_ub;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!oj.field_tb[81]) {
              ((sw) this).field_Ab = ((sw) this).field_ub;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void k(byte param0) {
        ta.field_ub = null;
        gca.field_g = null;
        mma.field_b = null;
        rl.field_t = null;
        df.field_J = null;
        ola.field_Ib = null;
        koa.field_b = null;
        int var1 = -56 % ((6 - param0) / 33);
        mh.field_F = null;
        jna.field_j = null;
        jma.field_a = null;
        qi.field_O = null;
        System.gc();
    }

    private final int g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 > 3) {
          var2 = ((sw) this).field_wb.length();
          if (((sw) this).field_ub != var2) {
            var3 = 1 + ((sw) this).field_ub;
            L0: while (true) {
              if (var2 > var3) {
                if (!up.a(((sw) this).field_wb.charAt(var3 - 1), true)) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return ((sw) this).field_ub;
          }
        } else {
          ((sw) this).field_tb = true;
          var2 = ((sw) this).field_wb.length();
          if (((sw) this).field_ub != var2) {
            var3 = 1 + ((sw) this).field_ub;
            L1: while (true) {
              if (var2 > var3) {
                if (!up.a(((sw) this).field_wb.charAt(var3 - 1), true)) {
                  var3++;
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return ((sw) this).field_ub;
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        ((sw) this).a(param0, param3, -23776, param2, param4);
        ((sw) this).field_Cb.a(param0, param3, -23776, 0, 0);
        ((sw) this).field_Eb.a(param0, param3, -23776, 0, 0);
        ((sw) this).field_Gb = param3 + -4;
        if (param1 < 101) {
            String discarded$0 = ((sw) this).e((byte) 103);
        }
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        var4 = 0;
        if (param0 == -2) {
          var5 = ((sw) this).field_wb.length();
          L0: while (true) {
            if (var4 < param1) {
              if (var3 < var5) {
                var3++;
                var4 = var4 + ((sw) this).field_Cb.field_H.a(((sw) this).field_wb.charAt(var3));
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          ((sw) this).d((byte) -86);
          var5 = ((sw) this).field_wb.length();
          L1: while (true) {
            if (var4 < param1) {
              if (var3 < var5) {
                var3++;
                var4 = var4 + ((sw) this).field_Cb.field_H.a(((sw) this).field_wb.charAt(var3));
                continue L1;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        }
    }

    final String e(byte param0) {
        if (param0 >= -99) {
            ((sw) this).field_ub = -43;
            return ((sw) this).field_wb.toString();
        }
        return ((sw) this).field_wb.toString();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = "Open in popup window";
        field_zb = new int[]{1, 200, 300, 1000, 200, 500, 300, 100, 200, 300, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 500, 500, 300, 300, 100, 200, 300, 100, 100, 200, 300, 500, 300, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    }
}
