/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw extends llb {
    private int field_vb;
    private eab field_Db;
    private llb field_Cb;
    private boolean field_zb;
    private StringBuilder field_Eb;
    private boolean field_Bb;
    private int field_Ab;
    private long field_wb;
    private int field_Hb;
    llb field_Fb;
    private llb field_Kb;
    static gj field_xb;
    private int field_yb;
    static String field_Jb;
    private int field_Gb;
    private mob field_Ib;

    public static void g(byte param0) {
        if (param0 != 124) {
            kw.g((byte) 112);
        }
        field_xb = null;
        field_Jb = null;
    }

    final void a(String param0, int param1) {
        if (param1 > -85) {
            Object var4 = null;
            ((kw) this).a(30, (eab) null);
        }
        ((kw) this).field_Eb.setLength(0);
        int var3 = param0.length();
        if ((((kw) this).field_yb ^ -1) != 0) {
            if (!(((kw) this).field_yb >= var3)) {
                var3 = ((kw) this).field_yb;
            }
        }
        StringBuilder discarded$0 = ((kw) this).field_Eb.append(param0.substring(0, var3));
        ((kw) this).field_Gb = ((kw) this).field_Eb.length();
        ((kw) this).field_Ab = ((kw) this).field_Eb.length();
        ((kw) this).field_Fb.field_R = ((kw) this).field_Eb.toString();
    }

    final void a(byte param0, int param1) {
        if (param0 > -14) {
            Object var4 = null;
            ((kw) this).a((String) null, -20);
        }
        ((kw) this).field_Ab = param1;
        ((kw) this).field_Gb = param1;
    }

    final void a(int param0, int param1, int param2) {
        int var5 = VoidHunters.field_G;
        int var4 = ((kw) this).field_Eb.length();
        if (-1 < (param2 ^ -1)) {
            param2 = 0;
        } else {
            if (!(param2 <= var4)) {
                param2 = var4;
            }
        }
        if ((param0 ^ -1) > -1) {
            param0 = 0;
        } else {
            if (var4 < param0) {
                param0 = var4;
            }
        }
        ((kw) this).field_Ab = param0;
        ((kw) this).field_Gb = param2;
        if (param1 != 31401) {
            int discarded$0 = this.b(-50, 68);
        }
    }

    private final int b(int param0, int param1) {
        int var6 = VoidHunters.field_G;
        int var3 = 0;
        int var4 = param1;
        int var5 = ((kw) this).field_Eb.length();
        while (param0 > var4) {
            // if_icmpge L60
            var3++;
            var4 = var4 + ((kw) this).field_Fb.field_eb.a(((kw) this).field_Eb.charAt(var3));
        }
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (!param4) {
            ((kw) this).field_wb = 87L;
        }
        ((kw) this).a(param1, -119, param0, param3, param2);
        ((kw) this).field_Fb.a(0, -84, param0, 0, param2);
        ((kw) this).field_Cb.a(0, 123, param0, 0, param2);
        ((kw) this).field_Hb = -4 + param2;
    }

    private final void n(int param0) {
        if (null == ((kw) this).field_Db) {
            return;
        }
        ((kw) this).field_Ib = ((kw) this).field_Db.c(param0 + -10964);
        if (param0 != 11090) {
            ((kw) this).field_Bb = true;
        }
    }

    kw(long param0, llb param1, llb param2, llb param3) {
        this(param0, param1, param2, param3, -1);
    }

    final int j(int param0) {
        if (param0 != 0) {
            ((kw) this).field_Ab = -109;
        }
        return ((kw) this).field_Ab;
    }

    final void a(int param0, eab param1) {
        if (param0 != -20640) {
            this.b(false);
        }
        ((kw) this).field_Db = param1;
    }

    private final void e(byte param0) {
        if (param0 < 38) {
            return;
        }
        if (!(((kw) this).field_Db != null)) {
            return;
        }
        this.h(31960);
        this.b(true);
    }

    final void f(byte param0) {
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
            Object stackIn_12_0 = null;
            Object stackIn_13_0 = null;
            Object stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            int stackIn_32_0 = 0;
            Object stackOut_11_0 = null;
            Object stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            Object stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            int stackOut_30_0 = 0;
            int stackOut_31_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = VoidHunters.field_G;
                        var2 = this.b(-((kw) this).field_Fb.field_t + (-((kw) this).field_M + kc.field_b), param0 + 6);
                        if (1 == ((kw) this).field_o) {
                            statePc = 11;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if ((hu.field_b ^ -1) != -2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (((kw) this).field_Bb) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        ((kw) this).field_Bb = false;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 5: {
                        if (!((kw) this).field_zb) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (var2 >= ((kw) this).field_vb) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (((kw) this).field_Gb < var2) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var2 = ((kw) this).field_vb;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        ((kw) this).field_Ab = var2;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 11: {
                        this.a(var2, 3047);
                        ((kw) this).field_Bb = true;
                        var3_long = wt.a(false);
                        stackOut_11_0 = this;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (-251L >= (var3_long + -((kw) this).field_wb ^ -1L)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = this;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        ((kw) this).field_zb = stackIn_14_1 != 0;
                        if (((kw) this).field_zb) {
                            statePc = 16;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        ((kw) this).field_Gb = this.k(-1);
                        ((kw) this).field_Ab = this.m(-10001);
                        if ((((kw) this).field_Ab ^ -1) >= -1) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (32 == ((kw) this).field_Eb.charAt(((kw) this).field_Ab + -1)) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        ((kw) this).field_Ab = ((kw) this).field_Ab - 1;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        ((kw) this).field_vb = ((kw) this).field_Ab;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        ((kw) this).field_wb = var3_long;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (!((kw) this).field_pb) {
                            statePc = 24;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        ((kw) this).field_Gb = ((kw) this).field_Eb.length();
                        ((kw) this).field_Ab = ((kw) this).field_Eb.length();
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        ((kw) this).field_Cb.field_L = ((kw) this).field_Fb.field_eb.b(((kw) this).field_Eb.toString().substring(0, ((kw) this).field_Ab));
                        if (param0 == -6) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        ((kw) this).field_zb = true;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        if (((kw) this).field_Gb != ((kw) this).field_Ab) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        ((kw) this).field_Kb.a(((kw) this).field_Cb.field_L, -30, 0, 2, ((kw) this).field_Hb);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 29: {
                        var3 = ((kw) this).field_Fb.field_L + ((kw) this).field_Fb.field_eb.b(((kw) this).field_Eb.toString().substring(0, ((kw) this).field_Gb));
                        if (((kw) this).field_Cb.field_L <= var3) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        stackOut_30_0 = var3;
                        stackIn_32_0 = stackOut_30_0;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 31: {
                        stackOut_31_0 = ((kw) this).field_Cb.field_L;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        var4_int = stackIn_32_0;
                        var5 = Math.abs(-((kw) this).field_Cb.field_L + var3);
                        ((kw) this).field_Kb.a(((kw) this).field_Fb.field_t + var4_int, 116, var5, 2, ((kw) this).field_Hb);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (((kw) this).field_Ib == null) {
                            statePc = 40;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (((kw) this).field_Ib.field_f == 0) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        var7 = (java.awt.datatransfer.Transferable) ((kw) this).field_Ib.field_d;
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        try {
                            var8 = (String) var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                            this.b(true);
                            this.a(var8, false);
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        ((kw) this).field_Ib = null;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
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

    private final void a(String param0, boolean param1) {
        int var3 = 0;
        String var4 = null;
        if ((((kw) this).field_yb ^ -1) != 0) {
            var3 = ((kw) this).field_yb + -((kw) this).field_Eb.length();
            if (var3 == 0) {
                return;
            }
            param0 = param0.substring(0, var3);
        }
        if (((kw) this).field_Ab == ((kw) this).field_Eb.length()) {
            StringBuilder discarded$1 = ((kw) this).field_Eb.append(param0);
        } else {
            var4 = ((kw) this).field_Eb.toString().substring(((kw) this).field_Ab, ((kw) this).field_Eb.length());
            StringBuilder discarded$2 = npa.a(((kw) this).field_Ab, false, ((kw) this).field_Eb, ' ');
            StringBuilder discarded$3 = ((kw) this).field_Eb.append(param0);
            StringBuilder discarded$4 = ((kw) this).field_Eb.append(var4);
        }
        ((kw) this).field_Fb.field_R = ((kw) this).field_Eb.toString();
        ((kw) this).field_Ab = ((kw) this).field_Eb.length();
        if (param1) {
            String discarded$5 = this.i(-87);
        }
        ((kw) this).field_Gb = ((kw) this).field_Ab;
    }

    final void a(boolean param0) {
        StringBuilder discarded$5 = npa.a(0, !param0 ? true : false, ((kw) this).field_Eb, ' ');
        if (!param0) {
            ((kw) this).a(97, -10, -98);
        }
        ((kw) this).field_Ab = 0;
        ((kw) this).field_Gb = 0;
        ((kw) this).field_Fb.field_R = ((kw) this).field_Eb.toString();
    }

    private final void a(int param0, int param1) {
        ((kw) this).field_Ab = param0;
        if (!si.field_o[81]) {
            ((kw) this).field_Gb = ((kw) this).field_Ab;
        }
        if (param1 != 3047) {
            kw.g((byte) -20);
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (((kw) this).field_Ab == param0) {
            return ((kw) this).field_Ab;
        }
        for (var2 = ((kw) this).field_Ab + -1; -1 < var2; var2--) {
            // ifne L53
        }
        return var2;
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        String var5 = null;
        int stackIn_22_0 = 0;
        int stackIn_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        if (param2 == 60) {
          return false;
        } else {
          if (62 != param2) {
            L0: {
              if (param1 == -1) {
                break L0;
              } else {
                ((kw) this).field_Kb = null;
                break L0;
              }
            }
            L1: {
              if (param2 < 32) {
                break L1;
              } else {
                if (param2 <= 126) {
                  L2: {
                    if (((kw) this).field_Ab != ((kw) this).field_Gb) {
                      this.b(true);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (0 == (((kw) this).field_yb ^ -1)) {
                        break L4;
                      } else {
                        if (((kw) this).field_Eb.length() < ((kw) this).field_yb) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (((kw) this).field_Ab == ((kw) this).field_Eb.length()) {
                        StringBuilder discarded$4 = ((kw) this).field_Eb.append(param2);
                        break L5;
                      } else {
                        var5 = ((kw) this).field_Eb.toString().substring(((kw) this).field_Ab, ((kw) this).field_Eb.length());
                        StringBuilder discarded$5 = npa.a(((kw) this).field_Ab, false, ((kw) this).field_Eb, ' ');
                        StringBuilder discarded$6 = ((kw) this).field_Eb.append(param2);
                        StringBuilder discarded$7 = ((kw) this).field_Eb.append(var5);
                        break L5;
                      }
                    }
                    ((kw) this).field_Fb.field_R = ((kw) this).field_Eb.toString();
                    ((kw) this).field_Ab = ((kw) this).field_Ab + 1;
                    ((kw) this).field_Gb = ((kw) this).field_Ab;
                    break L3;
                  }
                  return true;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (85 != param0) {
                if (param0 == 101) {
                  if (((kw) this).field_Ab == ((kw) this).field_Gb) {
                    if (((kw) this).field_Ab >= ((kw) this).field_Eb.length()) {
                      break L6;
                    } else {
                      ((kw) this).field_Gb = 1 + ((kw) this).field_Ab;
                      this.b(true);
                      return true;
                    }
                  } else {
                    this.b(true);
                    return true;
                  }
                } else {
                  if (13 != param0) {
                    if (96 != param0) {
                      if (-98 == param0) {
                        if (((kw) this).field_Ab >= ((kw) this).field_Eb.length()) {
                          break L6;
                        } else {
                          L7: {
                            if (si.field_o[82]) {
                              stackOut_40_0 = this.m(-10001);
                              stackIn_41_0 = stackOut_40_0;
                              break L7;
                            } else {
                              stackOut_39_0 = 1 + ((kw) this).field_Ab;
                              stackIn_41_0 = stackOut_39_0;
                              break L7;
                            }
                          }
                          var4 = stackIn_41_0;
                          this.a(var4, param1 + 3048);
                          return true;
                        }
                      } else {
                        if (-103 == param0) {
                          this.a(0, 3047);
                          return true;
                        } else {
                          if (param0 == 103) {
                            this.a(((kw) this).field_Eb.length(), 3047);
                            return true;
                          } else {
                            L8: {
                              if (!si.field_o[82]) {
                                break L8;
                              } else {
                                if (param0 != 65) {
                                  break L8;
                                } else {
                                  this.e((byte) 116);
                                  return true;
                                }
                              }
                            }
                            L9: {
                              if (!si.field_o[82]) {
                                break L9;
                              } else {
                                if (param0 != 66) {
                                  break L9;
                                } else {
                                  this.h(param1 + 31961);
                                  return true;
                                }
                              }
                            }
                            if (!si.field_o[82]) {
                              break L6;
                            } else {
                              if (67 != param0) {
                                break L6;
                              } else {
                                this.n(11090);
                                return true;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (-1 <= (((kw) this).field_Ab ^ -1)) {
                        break L6;
                      } else {
                        L10: {
                          if (!si.field_o[82]) {
                            stackOut_21_0 = ((kw) this).field_Ab + -1;
                            stackIn_22_0 = stackOut_21_0;
                            break L10;
                          } else {
                            stackOut_20_0 = this.k(param1 + 0);
                            stackIn_22_0 = stackOut_20_0;
                            break L10;
                          }
                        }
                        var4 = stackIn_22_0;
                        this.a(var4, 3047);
                        return true;
                      }
                    }
                  } else {
                    ((kw) this).a(true);
                    return true;
                  }
                }
              } else {
                if (((kw) this).field_Ab == ((kw) this).field_Gb) {
                  if ((((kw) this).field_Ab ^ -1) >= -1) {
                    break L6;
                  } else {
                    ((kw) this).field_Gb = -1 + ((kw) this).field_Ab;
                    this.b(true);
                    return true;
                  }
                } else {
                  this.b(true);
                  return true;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    private final String i(int param0) {
        if (param0 > -46) {
            int discarded$0 = ((kw) this).j(-108);
        }
        String var2 = ((kw) this).field_Eb.toString();
        int var3 = ((kw) this).field_Ab > ((kw) this).field_Gb ? ((kw) this).field_Gb : ((kw) this).field_Ab;
        int var4 = ((kw) this).field_Ab > ((kw) this).field_Gb ? ((kw) this).field_Ab : ((kw) this).field_Gb;
        return var2.substring(var3, var4);
    }

    private kw(long param0, llb param1, llb param2, llb param3, int param4) {
        super(param0, param1);
        ((kw) this).field_Bb = false;
        ((kw) this).field_wb = 0L;
        ((kw) this).field_vb = -1;
        ((kw) this).field_zb = false;
        ((kw) this).field_yb = param4;
        ((kw) this).field_Kb = new llb(0L, param2);
        ((kw) this).field_Fb = new llb(0L, param3);
        ((kw) this).field_Cb = new llb(0L, param3);
        ((kw) this).field_T = true;
        ((kw) this).field_Eb = new StringBuilder(((kw) this).field_yb != -1 ? ((kw) this).field_yb : 256);
        ((kw) this).field_Fb.field_R = ((kw) this).field_Eb.toString();
        ((kw) this).field_Cb.field_s = "|";
        ((kw) this).field_Cb.field_R = "";
        ((kw) this).field_lb = new ij();
        ((kw) this).b(-561, ((kw) this).field_Kb);
        ((kw) this).b(-561, ((kw) this).field_Fb);
        ((kw) this).b(-561, ((kw) this).field_Cb);
        ((kw) this).field_pb = true;
    }

    final String l(int param0) {
        if (param0 != -14453) {
            return null;
        }
        return ((kw) this).field_Eb.toString();
    }

    private final void h(int param0) {
        if (!(null != ((kw) this).field_Db)) {
            return;
        }
        if (param0 != 31960) {
            return;
        }
        String var2 = this.i(-51);
        if (!(var2.length() != 0)) {
            return;
        }
        java.awt.datatransfer.StringSelection var3 = new java.awt.datatransfer.StringSelection(this.i(-100));
        mob discarded$0 = ((kw) this).field_Db.a((byte) -45, (java.awt.datatransfer.Transferable) (Object) var3);
    }

    private final int m(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param0 != -10001) {
            ((kw) this).a((byte) 4, 75);
        }
        int var2 = ((kw) this).field_Eb.length();
        if (!(var2 != ((kw) this).field_Ab)) {
            return ((kw) this).field_Ab;
        }
        for (var3 = 1 + ((kw) this).field_Ab; var3 < var2; var3++) {
            // ifne L82
        }
        return var3;
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        if (!(((kw) this).field_Gb == ((kw) this).field_Ab)) {
            var2 = ((kw) this).field_Gb >= ((kw) this).field_Ab ? ((kw) this).field_Ab : ((kw) this).field_Gb;
            var3 = ((kw) this).field_Ab <= ((kw) this).field_Gb ? ((kw) this).field_Gb : ((kw) this).field_Ab;
            ((kw) this).field_Ab = var2;
            ((kw) this).field_Gb = var2;
            var4 = ((kw) this).field_Eb.toString().substring(var3, ((kw) this).field_Eb.length());
            StringBuilder discarded$0 = npa.a(var2, !param0 ? true : false, ((kw) this).field_Eb, ' ');
            StringBuilder discarded$1 = ((kw) this).field_Eb.append(var4);
            ((kw) this).field_Fb.field_R = ((kw) this).field_Eb.toString();
        }
        if (!param0) {
            ((kw) this).field_vb = -102;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = "Shortcut Reference";
        field_xb = new gj();
    }
}
